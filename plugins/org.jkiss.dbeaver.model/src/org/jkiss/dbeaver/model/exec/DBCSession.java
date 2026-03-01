     */
        @NotNull DBCStatementType type,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * @return progress monitor
    DBPDataSource getDataSource();
     * @return data source
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
     * Context's progress monitor.
     */
     */
    // Session close doesn't throw exceptions
     * Each context has it's progress monitor which is passed at context creation time and never changes.
    @NotNull
     * Context's purpose
     * Session title
    @NotNull
 * DBeaver - Universal Database Manager
    DBCExecutionContext getExecutionContext();
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


    @NotNull
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return connected state
        boolean updatable,
    /**
    /**
    /**
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.DBPDataSource;


    @NotNull
     * Performs check that this context is really connected to remote database
        @NotNull String query,
    DBRProgressMonitor getProgressMonitor();
    boolean isConnected();

     * @return title
        boolean returnGeneratedKeys) throws DBCException;
     */
    void enableLogging(boolean enable);
    @NotNull
    boolean isLoggingEnabled();
 * Unless required by applicable law or agreed to in writing, software
}
    void close();

 * Execution session
package org.jkiss.dbeaver.model.exec;

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @return purpose
/*
     */
     * Data source of this session
 * you may not use this file except in compliance with the License.

    String getTaskTitle();
    /**
import org.jkiss.code.NotNull;
    /**
     * Prepares statements
    @NotNull
    /**

 */
     * @return data source
 *
 *
    DBCExecutionPurpose getPurpose();
    /**
import org.jkiss.dbeaver.model.DBPCloseableObject;
     * Enables/disables operations logging within this session
 * limitations under the License.

        boolean scrollable,
     * @param enable enable
     */
 */
public interface DBCSession extends DBPCloseableObject, DBDFormatSettings {
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    DBCStatement prepareStatement(
     * Data source of this session
