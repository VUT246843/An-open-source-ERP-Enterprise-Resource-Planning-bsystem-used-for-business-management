                    }
                log.debug("Datasource '" + container.getName() + "' was already invalidated");
    @NotNull
 * See the License for the specific language governing permissions and
            for (DBPDataSourceContainer container : containers) {
    }
        public DBPDataSource getDataSource() {
        if (txnManager != null) {
                    }
    }

                if (dataSource == null) {
                for (DBCExecutionContext context : instance.getAllContexts()) {
                        txnManager.rollback(session, null);
                    failed.put(container, Severity.FINE);

import org.jkiss.dbeaver.model.DBPExclusiveResource;
            for (DBWNetworkHandler handler : container.getActiveNetworkHandlers()) {

    @Override

        }
                }
    public static List<ContextInvalidateResult> invalidateDataSource(
        for (DBSInstance instance : dataSource.getAvailableInstances()) {
        return results.stream().anyMatch(ContextInvalidateResult::isError);
                try {

    }
                        log.error("Error closing inaccessible datasource", e);
        final List<ContextInvalidateResult> finalResults = new ArrayList<>();
    }
        }
            monitor.subTask("Invalidate handler [" + nh.getClass().getSimpleName() + "]");
    private static void collectDependentDataSources(

        }
        } finally {
        for (DBWNetworkHandler nh : dataSource.getContainer().getActiveNetworkHandlers()) {
        public ContextInvalidateResult(DBPDataSource dataSource, Exception exception) {
        // Disable disconnect on failure. It is the worst case anyway.
            if (feedbackHandler == null || feedbackHandler.confirmInvalidate(containers)) {
import java.util.*;
        for (DBCInvalidatePhase phase : DBCInvalidatePhase.values()) {
        @NotNull DBRProgressMonitor monitor,
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } catch (DBException e) {
        }
                entry.getKey().getExclusiveLock().releaseTaskLock(TASK_INVALIDATE, entry.getValue());
import org.jkiss.dbeaver.model.exec.*;
                return List.of();
    {
        void onInvalidateFailure(@NotNull DBPDataSourceContainer container, @NotNull Collection<ContextInvalidateResult> results);
        return results;
 * limitations under the License.
        super("Invalidate " + dataSource.getContainer().getName(), DBUtils.getDefaultContext(dataSource.getDefaultInstance(), false));
        final List<ContextInvalidateResult> results = new ArrayList<>();
                }
 *
        @NotNull DBPDataSource dataSource,

                    + "' for " + dataSource.getContainer().getId() + " (" + phase + ")");
            }
        public boolean isError() {



                    }
                            feedbackHandler.onInvalidateFailure(container, results);
                    pending.offer(other);
        collectDependentDataSources(dataSource, containers);
    ) {
    }

        void onInvalidateSuccess(@NotNull DBPDataSourceContainer container, @NotNull Collection<ContextInvalidateResult> results);
    }
                        if (anySucceeded(results)) {
                finalResults.addAll(results);

                } catch (Exception e) {
                    continue;
 * Unless required by applicable law or agreed to in writing, software
        public ContextInvalidateResult(DBPDataSource dataSource) {
                        "Datasource '" + container.getName() + "' was disconnected: destination database unreachable.\n" + errors
    }
                }

        try {
                            feedbackHandler.onInvalidateSuccess(container, results);
        @NotNull DBPDataSource dataSource,

            }

                        "Forced disconnect",
        return results.stream().anyMatch(ContextInvalidateResult::isSuccess);

                        } else if (showErrors) {
                        // These notifications may trigger smart commit mode during txn recover. See #9066
            }

        if (locks.isEmpty()) {
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return exception;
                finalResults.addAll(results);

                    log.debug("\tFailed: " + e.getMessage());

                if (failed.containsKey(container)) {

            this.exception = exception;
    private static final Log log = Log.getLog(InvalidateJob.class);
        return finalResults;
            return new ContextInvalidateResult(dataSource, exception);
            }
                        .filter(ContextInvalidateResult::isError)
        @NotNull DBPDataSource dataSource,
    }
            this.dataSource = dataSource;
            return new ContextInvalidateResult(dataSource);
        return results;

                    monitor.worked(1);

        for (var it = containers.iterator(); it.hasNext(); ) {
        DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
            this.dataSource = dataSource;
                }

    public static boolean allSucceeded(@NotNull Collection<ContextInvalidateResult> results) {


        }
        return results.stream().allMatch(ContextInvalidateResult::isError);

        monitor.subTask("Invalidate connections of " + dataSource.getContainer().getName());
import org.jkiss.dbeaver.DBException;
        @NotNull DBRProgressMonitor monitor,
            for (DBCExecutionContext context : instance.getAllContexts()) {
            final Object lock = container.getExclusiveLock().acquireTaskLock(TASK_INVALIDATE, true);

        } else {
                return invalidateDataSources0(monitor, containers, disconnectOnFailure, showErrors, feedbackHandler);
                if (phase == DBCInvalidatePhase.AFTER_INVALIDATE) {
                nh.invalidateHandler(monitor, dataSource, phase);
                continue;
    @NotNull
            return List.of();
 * DBeaver - Universal Database Manager
                        container.disconnect(monitor);
            return exception == null;
                log.error("Error invalidating aborted transaction", e);
import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
        this.feedbackHandler = feedbackHandler;
                var results = invalidateInstances(monitor, dataSource, phase);

            }
        @NotNull DBCInvalidatePhase phase
        final Deque<DBPDataSourceContainer> pending = new ArrayDeque<>();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            monitor.done();
        monitor.done();
                }
    public interface InvalidationFeedbackHandler {
            finalResults.clear();
    public List<ContextInvalidateResult> getInvalidateResults() {
                    continue;
 * Invalidates all datasource contexts (not just the one passed in constructor).
        @NotNull DBCInvalidatePhase phase
        if (executionContext != null) {
        final Set<DBPDataSourceContainer> containers = new LinkedHashSet<>();

    ) {
                final DBPDataSourceContainer[] dataSources = handler.getDependentDataSources();
                if (anyFailed(results)) {
    ) {
        }
            final Map<DBPDataSourceContainer, Severity> failed = new HashMap<>();
                if (disconnectOnFailure && allFailed(results)) {

import org.eclipse.core.runtime.Status;
        @NotNull Set<DBPDataSourceContainer> containers,
                if (failed.get(container) == Severity.SEVERE) {
        @NotNull DBRProgressMonitor monitor,
                if (!txnManager.isAutoCommit()) {
            monitor.subTask("Invalidate datasource [" + dataSource.getContainer().getName() + "] transactions");
    public static class ContextInvalidateResult {
    private static Collection<ContextInvalidateResult> invalidateNetworkHandlers(

        public Exception getException() {
 */
    public InvalidateJob(
                    context.invalidateContext(monitor, phase);
                    DBWorkbench.getPlatformUI().showError(
public class InvalidateJob extends DataSourceJob
                    // Close whole datasource. Target host seems to be unavailable
{
                it.remove();

    }
                    } catch (Exception e) {
            monitor.done();

        public static ContextInvalidateResult newError(@NotNull DBPDataSource dataSource, @NotNull Exception exception) {

        DBPDataSource dataSource = getExecutionContext().getDataSource();
    public static boolean anySucceeded(@NotNull Collection<ContextInvalidateResult> results) {
    protected void canceling()

import org.jkiss.code.Nullable;
            log.debug("\tInvalidate network handler '" + nh.getClass().getSimpleName() + "' for " + dataSource.getContainer().getId());
    protected IStatus run(@NotNull DBRProgressMonitor monitor)
                    results.add(ContextInvalidateResult.newError(dataSource, e));
        pending.add(dataSource.getContainer());
    ) {
 */


        getThread().interrupt();
        }

            if (lock == DBPExclusiveResource.TASK_PROCESED) {
            final DBPDataSourceContainer container = it.next();
        this.invalidateResults = invalidateDataSource(monitor, dataSource, false, true, feedbackHandler);
    }
            if (!result.add(container)) {
                    continue;
        final Map<DBPDataSourceContainer, Object> locks = new HashMap<>();
        return Status.OK_STATUS;
    }
 * You may obtain a copy of the License at
        @NotNull DBPDataSource dataSource,
        boolean confirmInvalidate(@NotNull Set<DBPDataSourceContainer> containersToInvalidate);
    }
                    try {
        @Nullable InvalidationFeedbackHandler feedbackHandler
                    results.add(ContextInvalidateResult.newSuccess(dataSource));
                FINE,
        @NotNull Set<DBPDataSourceContainer> result
import org.jkiss.dbeaver.model.DBPDataSource;
        final List<ContextInvalidateResult> results = new ArrayList<>();
/**

        return (int) results.stream().filter(ContextInvalidateResult::isSuccess).count();
        }
                log.debug("\tInvalidate context '" + context.getContextName()

            for (DBSInstance instance : dataSource.getAvailableInstances()) {
                }
            }
                }

                DBPDataSource dataSource = container.getDataSource();
                log.debug("Invalidate cancelled by user");
        }

        }
        }

            }
                if (anyFailed(results)) {
                    try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, "Rollback failed transaction")) {

    public static int getSucceededCount(@NotNull Collection<ContextInvalidateResult> results) {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.Log;
        public boolean isSuccess() {
 * Invalidate datasource job.

    private InvalidationFeedbackHandler feedbackHandler;

    {
                        session.enableLogging(false);
        @Nullable InvalidationFeedbackHandler feedbackHandler
                final Object exclusiveLock = instance.getExclusiveLock().acquireExclusiveLock();
    public static boolean allFailed(@NotNull Collection<ContextInvalidateResult> results) {
package org.jkiss.dbeaver.runtime.jobs;


                if (dataSource == null) {
                var results = invalidateNetworkHandlers(monitor, dataSource, phase);
                        .collect(Collectors.joining("\n"));
        // Invalidate transactions
        public static ContextInvalidateResult newSuccess(@NotNull DBPDataSource dataSource) {
    @NotNull


    }
    @NotNull

                results.add(ContextInvalidateResult.newError(dataSource, e));
                results.add(ContextInvalidateResult.newSuccess(dataSource));
                        // Disable logging to avoid QM handlers notifications.
        }


                }
                    failed.put(container, Severity.SEVERE);
    public static void invalidateTransaction(DBRProgressMonitor monitor, DBPDataSource dataSource, DBCExecutionContext executionContext) {
    public static void invalidateTransaction(DBRProgressMonitor monitor, DBCExecutionContext context) {
                for (DBPDataSourceContainer other : dataSources) {
            }

            monitor.subTask("Release exclusive datasource locks");
            enum Severity {
            return exception != null;
    @NotNull
    @Override
        boolean disconnectOnFailure,
 * Licensed under the Apache License, Version 2.0 (the "License");
            monitor.subTask("Obtain exclusive datasource lock for '" + container.getName() + "'");
            for (Map.Entry<DBPDataSourceContainer, Object> entry : locks.entrySet()) {
                SEVERE
            log.debug("Nothing to invalidate");

        monitor.subTask("Invalidate network connection");
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
        // Not sure that we should force disconnect even here.
    private static final String TASK_INVALIDATE = "dsInvalidate";
        monitor.beginTask("Invalidate data sources", containers.size());
        DBPDataSource dataSource)
        private final Exception exception;
        }
        return results.stream().allMatch(ContextInvalidateResult::isSuccess);
}
    {
                    final String errors = results.stream()

                } finally {

            }
            final DBPDataSourceContainer container = pending.remove();

        boolean showErrors,
            }
                }
                    continue;
        while (!pending.isEmpty()) {
 *
        return invalidateResults;
                    );

import java.util.stream.Collectors;
            monitor.subTask("Invalidate context [" + executionContext.getDataSource().getContainer().getName() + "/" + executionContext.getContextName() + "] transactions");
            }
                        }
        }


    }

 * you may not use this file except in compliance with the License.
        private final DBPDataSource dataSource;
    public static boolean anyFailed(@NotNull Collection<ContextInvalidateResult> results) {

    private static List<ContextInvalidateResult> invalidateDataSources0(
                }
            invalidateTransaction(monitor, executionContext);
                    if (feedbackHandler != null) {

                    invalidateTransaction(monitor, context);
    private static Collection<ContextInvalidateResult> invalidateInstances(
import org.jkiss.dbeaver.model.struct.DBSInstance;
        }

            } else {
                    instance.getExclusiveLock().releaseExclusiveLock(exclusiveLock);
    }
            this.exception = null;

            }

import org.jkiss.code.NotNull;
    ) {
    }
                locks.put(container, lock);
        boolean showErrors,
import org.eclipse.core.runtime.IStatus;
            } catch (Exception e) {
                        .map(result -> result.getException().getMessage())
            } else {
            for (DBPDataSourceContainer container : containers) {
    }
    private List<ContextInvalidateResult> invalidateResults = new ArrayList<>();

        boolean disconnectOnFailure,
    }
/*
                DBPDataSource dataSource = container.getDataSource();
        @NotNull DBRProgressMonitor monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            return dataSource;
            try {
            try {
                }
    public void setFeedbackHandler(@Nullable InvalidationFeedbackHandler feedbackHandler) {
