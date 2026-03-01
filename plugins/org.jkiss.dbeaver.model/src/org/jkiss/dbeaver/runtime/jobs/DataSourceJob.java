        addJobChangeListener(new JobChangeAdapter() {
            }
 * DBeaver - Universal Database Manager
        return executionContext;
    public DBCExecutionContext getExecutionContext()
    public boolean isActiveTask() {
    @Override
    }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.runtime.jobs.IJobChangeEvent;

            public void aboutToRun(IJobChangeEvent event) {
        });
 * limitations under the License.
    protected DataSourceJob(String name, @NotNull DBCExecutionContext executionContext)
 * you may not use this file except in compliance with the License.
public abstract class DataSourceJob extends AbstractJob implements DBPDataSourceTask
                dataSourceContainer.acquire(DataSourceJob.this);
    }
        return executionContext.getDataSource().getContainer();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(CommonUtils.truncateString(name, 1000)); // Truncate just in case
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.utils.CommonUtils;
            @Override
 * You may obtain a copy of the License at
/*
            }
        this.executionContext = executionContext;
        return executionContext == family || family == DBPDataSource.class;

    }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
}
    @Override

import org.jkiss.dbeaver.model.DBPDataSourceTask;
    {

    public DBPDataSourceContainer getDataSourceContainer()
 *
        setUser(true);
 * DataSourceJob
 *


    {

 */
    }
        return getState() == RUNNING;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.DBPDataSource;
package org.jkiss.dbeaver.runtime.jobs;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

{
                dataSourceContainer.release(DataSourceJob.this);
    @NotNull

    {
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
/**
            @Override
 */
    public boolean belongsTo(Object family)
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final DBCExecutionContext executionContext;
    }
import org.jkiss.code.NotNull;
        final DBPDataSourceContainer dataSourceContainer = executionContext.getDataSource().getContainer();

    @NotNull

            public void done(IJobChangeEvent event) {
 * Licensed under the Apache License, Version 2.0 (the "License");
