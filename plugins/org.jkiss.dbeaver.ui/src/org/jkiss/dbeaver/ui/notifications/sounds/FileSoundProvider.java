package org.jkiss.dbeaver.ui.notifications.sounds;

 * Unless required by applicable law or agreed to in writing, software
            }
 * You may obtain a copy of the License at
                    final FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            try {

                final DataLine.Info info = new DataLine.Info(Clip.class, format);
import org.jkiss.dbeaver.DBException;
        public ClipSound(@NotNull File file) throws Exception {

 * distributed under the License is distributed on an "AS IS" BASIS,

    }
    }
                    if (control != null) {
                            lock.lock();
                } catch (IllegalArgumentException ignored) {
                final AudioFormat format = is.getFormat();
 * you may not use this file except in compliance with the License.
 *
    }
        }
            throw new DBException("Can't load sound from file " + file, e);
 */
                clip = (Clip) AudioSystem.getLine(info);
        }

import org.jkiss.dbeaver.ui.notifications.NotificationSound;
import org.jkiss.dbeaver.ui.notifications.NotificationSoundProvider;
    public NotificationSound create() throws DBException {
                    // https://stackoverflow.com/a/40698149
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
            try (AudioInputStream is = AudioSystem.getAudioInputStream(file)) {
        @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
                clip.addLineListener(event -> {
        }

            if (volume > 0.0f && volume < 1.0f) {
                        control.setValue(20f * (float) Math.log10(volume));
        try {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    private final File file;
        } catch (Exception e) {

                lock.unlock();
    @Override
        @Override
        private final Condition donePlaying = lock.newCondition();
                            lock.unlock();
                            donePlaying.signal();
import java.io.File;

            } finally {
    @NotNull
                lock.lock();
        public void close() {
                        } finally {

            }
        this.file = file;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                });
 * limitations under the License.
        public void play(float volume) {
                }
import java.util.concurrent.locks.ReentrantLock;
                try {
import java.util.concurrent.locks.Condition;
        private final Clip clip;
                        try {
                        }
    private static class ClipSound implements NotificationSound {
                    }
            clip.setMicrosecondPosition(0L);
 * See the License for the specific language governing permissions and
        }
                    // silently ignore
            return new ClipSound(file);
                donePlaying.awaitUninterruptibly();
                clip.open(is);
import java.util.concurrent.locks.Lock;

            clip.close();
}
            }
        private final Lock lock = new ReentrantLock();
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
import javax.sound.sampled.*;
    public FileSoundProvider(@NotNull File file) {
            clip.start();
/*

public class FileSoundProvider implements NotificationSoundProvider {
                    }
                    if (event.getType() == LineEvent.Type.STOP) {
