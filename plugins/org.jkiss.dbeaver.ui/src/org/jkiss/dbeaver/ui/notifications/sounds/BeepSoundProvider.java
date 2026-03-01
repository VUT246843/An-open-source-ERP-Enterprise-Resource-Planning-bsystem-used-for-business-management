import org.jkiss.code.NotNull;
    public static final BeepSoundProvider INSTANCE = new BeepSoundProvider();
 */
import org.eclipse.swt.widgets.Display;
        private static final BeepSound INSTANCE = new BeepSound();
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.notifications.NotificationSound;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Licensed under the Apache License, Version 2.0 (the "License");
 *
package org.jkiss.dbeaver.ui.notifications.sounds;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.UIUtils;
 *
                UIUtils.syncExec(display::beep);
}
        return BeepSound.INSTANCE;
 * DBeaver - Universal Database Manager
        @Override
        public void play(float volume) {
    public NotificationSound create() {

 * Copyright (C) 2010-2024 DBeaver Corp and others

public class BeepSoundProvider implements NotificationSoundProvider {

 * See the License for the specific language governing permissions and
 *
        @Override
            }
    @NotNull
            final Display display = UIUtils.getDisplay();

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            // nothing to release
/*
        public void close() {
        }
import org.jkiss.dbeaver.ui.notifications.NotificationSoundProvider;
            if (display != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static class BeepSound implements NotificationSound {
    }
