    public static void showNotification(DBPDataSource dataSource, String id, String text, DBPMessageType messageType) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    public static void showNotification(DBPDataSource dataSource, String id, String text, DBPMessageType messageType, Runnable feedback) {
    @NotNull
 *
/**
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
        notificationHandler = handler;
 */
            System.out.println(text);
    }
    }
/*
    private static class ConsoleHandler implements NotificationHandler {

 * DBeaver - Universal Database Manager

    public static final String NT_RECONNECT_FAILURE = "reconnect.failure";
    public static final String NT_PERSPECTIVE_RESET = "perspective.reset";
 * Notifications utilities
}
 * limitations under the License.

    public static void setHandler(@NotNull NotificationHandler handler) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static void showNotification(String id, String title, String text, DBPMessageType messageType, Runnable feedback) {
 * See the License for the specific language governing permissions and
        notificationHandler.sendNotification(dataSource, id, text, messageType, feedback);

    public static final String NT_RECONNECT_SUCCESS = "reconnect.success";
    private static NotificationHandler notificationHandler = new ConsoleHandler();
    public static final String NT_GENERIC = "generic";
 *
        notificationHandler.sendNotification(id, title, text, messageType, feedback);
public class DBeaverNotifications
{
        }
    public static final String NT_ROLLBACK_IDLE = "rollback.idle";
        }

import org.jkiss.dbeaver.model.DBPMessageType;
    }
    public static final String NT_ROLLBACK = "rollback";
import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.runtime;
import org.jkiss.code.NotNull;
        void sendNotification(String id, String title, String text, DBPMessageType messageType, Runnable feedback);
    }

 */
 * Unless required by applicable law or agreed to in writing, software


            System.out.println(title + "\n\t" + text);
        @Override
    public interface NotificationHandler {
        void sendNotification(DBPDataSource dataSource, String id, String text, DBPMessageType messageType, Runnable feedback);
        public void sendNotification(String id, String title, String text, DBPMessageType messageType, Runnable feedback) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

        showNotification(dataSource, id, text, messageType, null);

 * you may not use this file except in compliance with the License.

 *
    public static final String NT_COMMIT = "commit";

        @Override
    public static final String NT_DISCONNECT_IDLE = "disconnect.idle";
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        public void sendNotification(DBPDataSource dataSource, String id, String text, DBPMessageType messageType, Runnable feedback) {

