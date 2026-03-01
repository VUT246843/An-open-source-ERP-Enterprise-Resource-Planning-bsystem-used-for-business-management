    }
        }
                if (!connection.isClosed()) {
    public synchronized void handleTransactionRollback(@NotNull DBCExecutionContext context, DBCSavepoint savepoint) {
        synchronized (listeners) {
            QMMTransactionInfo oldTxn = sessionInfo.changeTransactional(!autoCommit);
    public void removeListener(QMMetaListener listener) {

    public String getHandlerName() {
            eventPool.add(new QMMetaEvent(object, action, timestamp, sessionId));
        if (session != null) {
        }
    @Override
            if (exec != null) {
        if (connection == null) {
    @Override
    @Override
        return connectionInfo;
                    if (size > MAX_HISTORY_EVENTS) {
 * Query manager execution handler implementation

            connection.reopen(context);

    public synchronized void handleTransactionAutocommit(@NotNull DBCExecutionContext context, boolean autoCommit) {
            connectionMap.put(contextId, connection);
    private void tryFireMetaEvent(
            connectionInfo.setTransactional(transactional);
    }
        List<QMMetaEvent> events = eventPool;
package org.jkiss.dbeaver.runtime.qm;
            tryFireMetaEvent(session, QMEventAction.END, session.getCloseTime(), context);
        QMMConnectionInfo connectionInfo = getConnectionInfo(context);
    }
        var qmConfigurationProvider = DBUtils.getAdapter(QMConfigurationProvider.class, application);
            CommonUtils.getRootCause(error).getMessage()

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (DBWorkbench.getPlatform().getApplication() instanceof QMSessionProvider qmSessionProvider) {
            if (!listeners.isEmpty()) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.qm.*;

                        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (session != null) {
        }
    private static final Log log = Log.getLog(QMMCollectorImpl.class);
import org.eclipse.core.runtime.IStatus;
public class QMMCollectorImpl extends DefaultExecutionHandler implements QMMCollector {
    }
        }
        QMMConnectionInfo session = getConnectionInfo(executionContext);
        final long contextId = context.getContextId();
        try {
            eventDispatchPeriod = qmConfigurationProvider.getEventDispatchPeriod();
        QMMConnectionInfo session = getConnectionInfo(statement.getSession().getExecutionContext());
        } else {
                events = obtainEvents();
    public synchronized void handleStatementExecuteBegin(@NotNull DBCStatement statement) {
        }
    }
        final @NotNull QMMObject object,
        QMMDataSourceConnectErrorInfo connectErrorInfo = new QMMDataSourceConnectErrorInfo(
            }
        tryFireMetaEvent(object, action, timestamp, context.getDataSource());
        }
        tryFireMetaEvent(connection, QMEventAction.BEGIN, connection.getOpenTime(), context);
            setSystem(true);

        synchronized (listeners) {
            tryFireMetaEvent(connectionInfo, QMEventAction.UPDATE, connectionInfo.getOpenTime(), context);
        QMMConnectionInfo session = getConnectionInfo(statement.getSession().getExecutionContext());
                }
 * You may obtain a copy of the License at
    private List<QMMetaListener> getListeners() {
import java.util.ArrayList;
            }
                var sessionId = qmSessionProvider.getQueryManagerSessionId();
    }
    private final List<QMMetaListener> listeners = new ArrayList<>();
            }
    }
            connection = new QMMConnectionInfo(
        }
    @NotNull
        final @NotNull DBPDataSource dataSource
    @Override
                    if (session != null && !session.isClosed()) {
            QMMStatementExecuteInfo exec = session.beginExecution(statement);
    }
import java.util.List;
        QMMConnectionInfo session = getConnectionInfo(resultSet.getSession().getExecutionContext());
                listeners.clear();
    @Override
                log.warn("Some sessions are still open: " + openSessions);
                    continue;
            return new ArrayList<>(listeners);
        @Override
            DBExecUtils.discoverErrorType(dataSource, error).name(),
 * Unless required by applicable law or agreed to in writing, software
                    openSessions.add(connection);
            }
    }
                tryFireMetaEvent(exec, QMEventAction.BEGIN, exec.getOpenTime(), statement.getSession().getExecutionContext());
        }
    }
 * you may not use this file except in compliance with the License.
                return Collections.emptyList();
    public synchronized void handleContextClose(@NotNull DBCExecutionContext context) {
        }
                    int size = pastEvents.size();
            synchronized (QMMCollectorImpl.this) {
    public synchronized void handleContextOpen(@NotNull DBCExecutionContext context, boolean transactional) {
            List<QMMConnectionInfo> openSessions = new ArrayList<>();

                closedConnections.clear();
    }
            log.error("Failed to fire qm meta event", e);
            }
    public synchronized void handleStatementExecuteEnd(@NotNull DBCStatement statement, long rows, Throwable error) {
    }
        final @NotNull QMEventAction action,
    @Override
        QMMConnectionInfo sessionInfo = getConnectionInfo(context);

        }
        }
            // Cleanup closed sessions
 */
}
            String sessionId = QMUtils.getQmSessionId(dataSource);
                            size));
            if (oldTxn != null) {
            listeners.add(listener);
                if (!listeners.isEmpty() && !events.isEmpty()) {
        } else {

            QMMStatementExecuteInfo exec = session.endFetch(resultSet, rowCount);
    @Override

    }
        QMMConnectionInfo connectionInfo = connectionMap.get(context.getContextId());
                log.warn("Some QM meta collector listeners are still open: " + listeners);
        if (sessionInfo != null) {
        eventPool = new ArrayList<>();
    ) {
    public void addListener(QMMetaListener listener) {
        synchronized (listeners) {

 *


                sessionsToClose = closedConnections;
import org.jkiss.code.NotNull;
                }
            }
            } else {
        }
                tryFireMetaEvent(stat, QMEventAction.END, stat.getCloseTime(), statement.getSession().getExecutionContext());
            return new ArrayList<>(pastEvents);
            return Status.OK_STATUS;


        new EventDispatcher().schedule(eventDispatchPeriod);
                synchronized (historySync) {

        @NotNull


            if (exec != null) {
            if (oldTxn != null) {
            final List<QMMetaEvent> events;

    }
        }
        );

        // qm session id might be null if database migration is in progress for single user product
import org.jkiss.dbeaver.model.DBUtils;
    private final List<Long> closedConnections = new ArrayList<>();
                }
    }
        QMMConnectionInfo sessionInfo = getConnectionInfo(context);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                tryFireMetaEvent(exec, QMEventAction.UPDATE, System.currentTimeMillis(), resultSet.getSession().getExecutionContext());
    ) {
        QMMConnectionInfo sessionInfo = getConnectionInfo(context);

    private static final int MAX_HISTORY_EVENTS = 10000;

    // History (may be purged when limit reached)
    }
                tryFireMetaEvent(oldTxn, QMEventAction.END, oldTxn.getCloseTime(), context);
                log.warn("Can't properly handle statement close");
        }
            }
        if (sessionInfo != null) {
        }
            if (stat == null) {
            if (!openSessions.isEmpty()) {
import org.jkiss.dbeaver.Log;
                tryFireMetaEvent(oldTxn, QMEventAction.END, sessionInfo.getCloseTime(), context);
 * limitations under the License.
                var workspace = DBWorkbench.getPlatform().getWorkspace();
            for (QMMConnectionInfo connection : connectionMap.values()) {
                }

    boolean isRunning() {
            }
 *
        QMMConnectionInfo session = getConnectionInfo(statement.getSession().getExecutionContext());
                tryFireMetaEvent(exec, QMEventAction.END, exec.getCloseTime(), statement.getSession().getExecutionContext());
        QMMConnectionInfo session = getConnectionInfo(resultSet.getSession().getExecutionContext());
    public synchronized void handleResultSetOpen(@NotNull DBCResultSet resultSet) {
                tryFireMetaEvent(oldTxn, QMEventAction.END, oldTxn.getCloseTime(), context);
            tryFireMetaEvent(stat, QMEventAction.BEGIN, stat.getOpenTime(), executionContext);
        tryFireMetaEvent(connectErrorInfo, QMEventAction.BEGIN, connectErrorInfo.getOpenTime(), dataSource);
            if (listeners.size() == 1) {
                transactional);
                            size - MAX_HISTORY_EVENTS,
            if (isRunning()) {
    private List<QMMetaEvent> pastEvents = new ArrayList<>();
    @Override
            if (!listeners.remove(listener)) {
    private final Object historySync = new Object();
    public synchronized void handleTransactionCommit(@NotNull DBCExecutionContext context) {
    }
            List<Long> sessionsToClose;
    public synchronized void dispose() {
    private synchronized List<QMMetaEvent> obtainEvents() {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    }
            }

                + "Cannot handle statement '" + statement + "' open.");
    }
        if (!connectionMap.isEmpty()) {
            super("QM meta events dispatcher");
        if (session != null) {
    public synchronized void handleStatementOpen(@NotNull DBCStatement statement) {

        if (connectionInfo == null) {
            }
        }
        } catch (DBException e) {
import java.util.Collections;
        if (session != null) {

        protected EventDispatcher() {
    public synchronized QMMConnectionInfo getConnectionInfo(DBCExecutionContext context) {
            }
            dataSource.getContainer(),
            tryFireMetaEvent(sessionInfo, QMEventAction.UPDATE, System.currentTimeMillis(), context);
import org.jkiss.utils.LongKeyMap;
                    continue;
                    // Dispatch all events
        final long timestamp,
                tryFireMetaEvent(exec, QMEventAction.UPDATE, System.currentTimeMillis(), resultSet.getSession().getExecutionContext());
        closedConnections.remove(contextId);
        synchronized (listeners) {
            return Collections.emptyList();
        final @NotNull QMMObject object,
            }
    private long eventDispatchPeriod = 250;
    }
            QMMStatementExecuteInfo exec = session.endExecution(statement, rows, error);
            synchronized (QMMCollectorImpl.this) {
            // (when context closed and reopened without new context object creation)
    }
        if (sessionInfo != null) {
            if (exec != null) {
        QMMConnectionInfo session = getConnectionInfo(context);
    }
                    final QMMConnectionInfo session = connectionMap.get(sessionId);
                    pastEvents.addAll(events);
import org.jkiss.dbeaver.model.exec.*;

                    for (QMMetaListener listener : listeners) {

        return running;
            QMMStatementInfo stat = session.closeStatement(statement, rows);
    public synchronized void handleConnectError(@NotNull DBPDataSource dataSource, @NotNull Throwable error) {
                context,
        return events;
        }
        }
        QMMConnectionInfo connection = connectionMap.get(contextId);
                    return Collections.emptyList();
        if (session != null) {
    public List<QMMetaEvent> getPastEvents() {
        var application = DBWorkbench.getPlatform().getApplication();
                }
    public QMMCollectorImpl() {
                    }
        final @NotNull QMEventAction action,


            QMMTransactionInfo oldTxn = sessionInfo.commit();
                if (event.getSessionId() != null) {
    // External listeners
                        } catch (Throwable e) {
        DBCExecutionContext executionContext = statement.getSession().getExecutionContext();

    public synchronized void handleResultSetClose(@NotNull DBCResultSet resultSet, long rowCount) {
        }
                }
    private List<QMMetaEvent> eventPool = new ArrayList<>();
import org.jkiss.dbeaver.model.qm.meta.*;
                return Collections.singletonList(listeners.get(0));
                if (sessionId == null) {
            QMMStatementExecuteInfo exec = session.beginFetch(resultSet);
        if (session != null) {
            }
/*
    @Override
        if (connectionInfo != null) {
        if (eventPool.isEmpty()) {
    }
    // Session map
            // may be send event here
            setUser(false);
            }
        }
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        // It is possible (rarely) that session was reopened before event dispatcher run
    @Override
    }
    public void handleContextUpdate(@NotNull DBCExecutionContext context, boolean transactional) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            log.warn("QM session for '" + executionContext + "' is missing in cache. "
        }
/**
            QMMStatementInfo stat = session.openStatement(statement);

                event.setSessionId(sessionId);
            if (listeners.isEmpty()) {
        return "Meta info collector";
    // Sync object
                        connectionMap.remove(sessionId);
 * DBeaver - Universal Database Manager
    private boolean running = true;
                        pastEvents = new ArrayList<>(pastEvents.subList(
        if (qmConfigurationProvider != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (workspace == null) {
    }
        }
                }
        final long timestamp,
            }
    private class EventDispatcher extends AbstractJob {
    }
    @Override
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    private final LongKeyMap<QMMConnectionInfo> connectionMap = new LongKeyMap<>();
                    }
import org.jkiss.utils.CommonUtils;
    @Override
 * See the License for the specific language governing permissions and
        }
            session.close();
                log.warn("Listener '" + listener + "' is not registered in QM meta collector");
            log.debug("Can't find connectionInfo meta information: " + context.getContextId() + " (" + context.getContextName() + ")");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        final @NotNull DBCExecutionContext context
        // Remove from closed sessions (in case of re-opened connection)
            for (QMMetaEvent event : eventPool) {
            }
    }
            if (!events.isEmpty()) {
            if (exec != null) {
                        // In that case just ignore it
        if (session != null) {
    // Temporary event pool
                        try {
        }

                this.schedule(eventDispatchPeriod);
        closedConnections.add(context.getContextId());
                            log.error("Error notifying event listener", e);
    private synchronized void tryFireMetaEvent(
            }
                final List<QMMetaListener> listeners = getListeners();
            // This session may already be in cache in case of reconnect/invalidate
    public synchronized void handleStatementClose(@NotNull DBCStatement statement, long rows) {

            }
            QMMObject oldTxn = sessionInfo.rollback(savepoint);
                            listener.metaInfoChanged(monitor, events);
 */

                for (Long sessionId : sessionsToClose) {
        synchronized (historySync) {
import org.jkiss.dbeaver.model.DBPDataSource;
            if (oldTxn != null) {

        // Notify
        }
import org.eclipse.core.runtime.Status;

        running = false;
    @Override

            }
