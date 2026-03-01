        int currentSchemaVersion,
    ) throws DBException, IOException;
 * Unless required by applicable law or agreed to in writing, software
import java.io.IOException;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.sql.backup;
public interface JDBCDatabaseBackupHandler {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *

 * See the License for the specific language governing permissions and
 *
        @NotNull Connection connection,
    void doBackup(
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.connection.InternalDatabaseConfig;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager

 * limitations under the License.
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull InternalDatabaseConfig databaseConfig
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import org.jkiss.code.NotNull;
import java.sql.Connection;
