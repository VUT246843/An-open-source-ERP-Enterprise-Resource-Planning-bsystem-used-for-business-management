                }

        boolean hasDeadContexts = false;
                try {
                    hasDeadContexts = true;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final boolean disconnectOnError;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.Status;
                } catch (Exception e) {
            }
                    } else {
        for (final DBSInstance instance : dataSource.getAvailableInstances()) {
    private static final Log log = Log.getLog(KeepAlivePingJob.class);
        setUser(false);
                } else {
                    context.checkContextAlive(monitor);
                monitor,
import java.util.HashMap;
                dataSource,
    private final DBPDataSource dataSource;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import java.util.Map;
 */
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

class KeepAlivePingJob extends AbstractJob {
        synchronized (failedAttempts) {
            }
        }
                        curAttempts = 1;

        if (hasDeadContexts) {
 * DBeaver - Universal Database Manager
                }
            return attempts == null ? 0 : attempts;
        return Status.OK_STATUS;

import org.jkiss.dbeaver.model.struct.DBSInstance;

        }
 * See the License for the specific language governing permissions and
            for (final DBCExecutionContext context : instance.getAllContexts()) {
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.List;
    public static int getFailedAttemptCount(DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.Log;
    private static final Map<String, Integer> failedAttempts = new HashMap<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    log.debug("Datasource " + dataSource.getName() + " invalidate failed: " + results);
                    if (curAttempts == null) {
                    failedAttempts.remove(dsId);
 * limitations under the License.
            );
package org.jkiss.dbeaver.runtime.jobs;
        super("Connection ping (" + dataSource.getContainer().getName() + ")");
                disconnectOnError,
                new DefaultInvalidationFeedbackHandler()
                    failedAttempts.put(dsId, curAttempts);
    }
                if (InvalidateJob.anySucceeded(results) || disconnectOnError) {
                        curAttempts++;
                String dsId = dataSource.getContainer().getId();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    break;
        this.disconnectOnError = disconnectOnError;
            synchronized (failedAttempts) {
 * KeepAlivePingJob
                    log.debug("Context [" + dataSource.getName() + "::" + context.getContextName() + "] check failed: " + e.getMessage());
} *
                    }
            Integer attempts = failedAttempts.get(dataSource.getContainer().getId());
 *
 */
        }

 * you may not use this file except in compliance with the License.
            // Invalidate whole datasource. Do not log errors (as it can spam tons of logs)
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    log.debug("Datasource " + dataSource.getName() + " invalidated: " + results);
        setSystem(true);
/**
import org.eclipse.core.runtime.IStatus;
                    Integer curAttempts = failedAttempts.get(dsId);
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
            final List<InvalidateJob.ContextInvalidateResult> results = InvalidateJob.invalidateDataSource(

 * You may obtain a copy of the License at
                false,

 *     http://www.apache.org/licenses/LICENSE-2.0
    KeepAlivePingJob(DBPDataSource dataSource, boolean disconnectOnError) {
        this.dataSource = dataSource;
    @Override
    }
/*
