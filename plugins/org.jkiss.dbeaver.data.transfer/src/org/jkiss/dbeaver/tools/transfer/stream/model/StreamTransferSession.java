import org.jkiss.dbeaver.model.impl.AbstractSession;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public DBCExecutionContext getExecutionContext() {
import org.jkiss.code.NotNull;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * DBeaver - Universal Database Manager
 */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
package org.jkiss.dbeaver.tools.transfer.stream.model;
    public void cancelBlock(@NotNull DBRProgressMonitor monitor, Thread blockThread) throws DBException {

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

    @NotNull
        throw new DBCFeatureNotSupportedException();
}
/*
    private final StreamExecutionContext executionContext;
 * you may not use this file except in compliance with the License.
    StreamTransferSession(DBRProgressMonitor monitor, StreamExecutionContext executionContext, DBCExecutionPurpose purpose, String taskTitle) {
/**
    @Override
        return executionContext;
 * Stream session
    }
 * You may obtain a copy of the License at


 */
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.executionContext = executionContext;

public class StreamTransferSession extends AbstractSession {
import org.jkiss.dbeaver.model.exec.*;
    public DBCStatement prepareStatement(@NotNull DBCStatementType type, @NotNull String query, boolean scrollable, boolean updatable, boolean returnGeneratedKeys) throws DBCException {
    public DBPDataSource getDataSource() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    @Override
        // do nothing
 * limitations under the License.
        return executionContext.getDataSource();
 *

    @NotNull
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
    @NotNull

    @Override
import org.jkiss.dbeaver.DBException;
        super(monitor, purpose, taskTitle);
