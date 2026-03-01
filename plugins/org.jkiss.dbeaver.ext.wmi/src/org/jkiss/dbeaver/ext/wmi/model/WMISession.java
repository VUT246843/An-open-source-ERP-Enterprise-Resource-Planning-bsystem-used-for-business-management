        return dataSource;

    public WMIDataSource getDataSource()
    }
 *
}
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return dataSource;
 * you may not use this file except in compliance with the License.
    {
 */
/*
    }
 * You may obtain a copy of the License at
    @NotNull
 *
import org.jkiss.code.Nullable;
        return new WMIStatement(this, type, query);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {

    @NotNull
    }
        // Cancel WMI async call

        super(monitor, purpose, taskTitle);
 *
import org.jkiss.dbeaver.DBException;
    @NotNull
    {
 */
 * DBeaver - Universal Database Manager

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    public DBCExecutionContext getExecutionContext() {
    @Override
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        this.dataSource = dataSource;
    }
    public WMISession(DBRProgressMonitor monitor, DBCExecutionPurpose purpose, String taskTitle, WMIDataSource dataSource)

    public void cancelBlock(@NotNull DBRProgressMonitor monitor, @Nullable Thread blockThread) throws DBException
/**
public class WMISession extends AbstractSession {
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Execution context
import org.jkiss.code.NotNull;
    public DBCStatement prepareStatement(@NotNull DBCStatementType type, @NotNull String query, boolean scrollable, boolean updatable, boolean returnGeneratedKeys) throws DBCException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.*;
import org.jkiss.dbeaver.model.impl.AbstractSession;
package org.jkiss.dbeaver.ext.wmi.model;

    private final WMIDataSource dataSource;
 * limitations under the License.
