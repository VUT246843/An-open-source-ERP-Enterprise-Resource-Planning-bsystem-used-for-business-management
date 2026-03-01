 *
/**
import org.eclipse.core.runtime.IStatus;
        }
    public boolean belongsTo(Object family)
    private IStatus connectStatus;
    @Override
 *
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
 * Disconnect job.

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected final DBPDataSourceContainer container;
    {
 * See the License for the specific language governing permissions and
 */
            connectStatus = Status.OK_STATUS;
        }
    }
import org.jkiss.dbeaver.model.DBPDataSource;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * To get real status use getConectStatus.
    }
    @Override
    protected IStatus updateDataSource(DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * DBeaver - Universal Database Manager
        return Status.OK_STATUS;
 * You may obtain a copy of the License at
{
    public DBPDataSource getDataSource() {
 *
            long startTime = System.currentTimeMillis();
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.container = container;
    public DisconnectJob(DBPDataSourceContainer container)
        return container == family;

    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
import org.eclipse.core.runtime.Status;
        setUser(true);
    public IStatus getConnectStatus() {

package org.jkiss.dbeaver.runtime.jobs;
 * limitations under the License.
            container.disconnect(monitor);
        try {
            connectStatus = GeneralUtils.makeExceptionStatus(ex);
        getThread().interrupt();
} * Always returns OK status.
        super("Disconnect from '" + container.getName() + "'");

    @Override
        return container.getDataSource();
 */

    protected void canceling()
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return connectStatus;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

public class DisconnectJob extends DataSourceUpdaterJob
    @Override
        catch (Throwable ex) {



    {
