import java.sql.SQLException;

     * Returns current schema version.

    void updateCurrentSchemaVersion(
 * See the License for the specific language governing permissions and
        int version
     */
     */
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 */

 * DBeaver - Universal Database Manager
import java.sql.Connection;
/**
    int getLatestSchemaVersion();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull Connection connection,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.sql.schema;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**

import org.jkiss.dbeaver.DBException;
    int getCurrentSchemaVersion(DBRProgressMonitor monitor, Connection connection, String schemaName) throws DBException, SQLException;
     */
 *
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * SQL schema version manager.
/*
        @NotNull String schemaName,
    /**
 * limitations under the License.
     * Updates current schema version
     * Returns -1 if schema doesn't exist
    ) throws DBException, SQLException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    /**




 * You may obtain a copy of the License at
public interface SQLSchemaVersionManager {
 * you may not use this file except in compliance with the License.
        DBRProgressMonitor monitor,
 *
     * Returns an actual schema version
 */
