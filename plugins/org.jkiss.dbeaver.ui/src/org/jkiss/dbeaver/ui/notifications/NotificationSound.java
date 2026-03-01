     * Plays the notification sound with the given volume and blocks the thread until finished.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
 *
 * You may obtain a copy of the License at
     */
 * See the License for the specific language governing permissions and
    /**
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.notifications;
 * Unless required by applicable law or agreed to in writing, software
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * you may not use this file except in compliance with the License.
public interface NotificationSound extends AutoCloseable {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
     * @param volume notification volume in a range of {@code 0.0} to {@code 1.0}, inclusive.
    void play(float volume);
     *
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    void close();
     */

    /**
 * limitations under the License.

     * Releases any system resources allocated by this notification sound.
