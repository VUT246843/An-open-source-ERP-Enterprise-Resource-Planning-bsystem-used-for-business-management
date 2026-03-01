 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(id, dataSource.getContainer().getName(), description, messageType, feedback);
package org.jkiss.dbeaver.ui.notifications;
 * DBeaver - Universal Database Manager
 *
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        @NotNull String description,
import org.jkiss.dbeaver.model.DBPMessageType;
        @Nullable Runnable feedback)

 *     http://www.apache.org/licenses/LICENSE-2.0
        @Nullable DBPMessageType messageType,

        @Nullable DBPDataSource dataSource,
 * limitations under the License.
 *
 */
    {
        @NotNull String id,
import org.jkiss.dbeaver.model.DBPDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    public DatabaseNotification(
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
public class DatabaseNotification extends GeneralNotification {
    }
} * You may obtain a copy of the License at
