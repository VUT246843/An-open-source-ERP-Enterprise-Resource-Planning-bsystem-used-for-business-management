            synchronized (activeDataSources) {
/**
    }
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public abstract DBPDataSource getDataSource();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        super(name);
 * See the License for the specific language governing permissions and
    public DataSourceUpdaterJob(String name) {
    }


        try {
                activeDataSources.remove(dsId);
            }


        }
    public static boolean isInProcess(DBPDataSourceContainer ds) {
/*
            activeDataSources.add(dsId);
        synchronized (activeDataSources) {
        }
 * EndIdleTransactionsJob
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    private static final Set<String> activeDataSources = new HashSet<>();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        String dsId = getDataSource().getContainer().getId();
 * you may not use this file except in compliance with the License.

        if (getDataSource() == null) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

                return Status.CANCEL_STATUS;

            return Status.CANCEL_STATUS;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
    }
        synchronized (activeDataSources) {
            }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected abstract IStatus updateDataSource(DBRProgressMonitor monitor);
import java.util.HashSet;
        } finally {
import org.eclipse.core.runtime.Status;
 */
import org.eclipse.core.runtime.IStatus;

        }
 * limitations under the License.
            return updateDataSource(monitor);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
abstract class DataSourceUpdaterJob extends AbstractJob {
            if (activeDataSources.contains(dsId)) {
}
package org.jkiss.dbeaver.runtime.jobs;
import org.jkiss.dbeaver.model.DBPDataSource;

import java.util.Set;

 */
            return activeDataSources.contains(ds.getId());
