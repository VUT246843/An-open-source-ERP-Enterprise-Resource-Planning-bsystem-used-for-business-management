import org.jkiss.dbeaver.model.app.DBPWorkspace;
 * Query Manager utils
     * Returns workspace session
        }
    @NotNull
        }
     * Extract QM session from execution context
    /**
        }
        Collection<QMObjectType> objectTypes = QMObjectType.fromString(store.getString(QMConstants.PROP_OBJECT_TYPES));
                            txnStartTime = exec.getOpenTime();
        public QMMetaEventEntity nextEvent(DBRProgressMonitor monitor) throws DBException {
        DBRProgressMonitor monitor = new LoggingProgressMonitor();
    public static void unregisterMetaListener(QMMetaListener metaListener) {
                            for (QMMStatementExecuteInfo ei = sp.getLastExecute(); ei != null && ei.getSavepoint() == sp; ei = ei.getPrevious()) {
        private final List<QMMetaEvent> events;
import org.jkiss.dbeaver.model.app.DBPPlatform;
        public QMMetaEventEntity nextEvent(DBRProgressMonitor monitor) throws DBException {
            throw new DBException("Empty cursor");
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.qm.filters.QMEventCriteria;
    /**
        @Override
            return 0;
        long txnStartTime = 0;
 */
    public static boolean isTransactionActive(DBCExecutionContext executionContext, boolean checkQueries) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        application.getQueryManager().registerMetaListener(metaListener);
        return null;
     */

    public static QMTransactionState getTransactionState(DBCExecutionContext executionContext) {

                        } else {
        SMSession workspaceSession = workspace.getAuthContext().getSpaceSession(monitor, workspace, false);
            this.position = 0;
//                        if (exec.isTransactional()) {
        }
 * you may not use this file except in compliance with the License.
        return getQmSessionId(session);
import org.jkiss.dbeaver.model.qm.meta.QMMTransactionInfo;
     */
            }

    @Nullable


            session = workspace.getAuthContext().getSpaceSession(monitor, workspace, false);
    }
        if (executionContext == null || application == null) {

    }

            return null;
        if (session == null) {
        if (sessionInfo != null && !sessionInfo.isClosed() && sessionInfo.isTransactional()) {

 *
import org.jkiss.code.NotNull;

            } else if (sessionInfo.isTransactional()) {
                throw new DBException("Position is out of range (" + getTotalSize() + ")");
            return new QMMetaEventEntity(event.getObject(), event.getAction(), position, "", null);
            defaultHandler = application.getQueryManager().getDefaultHandler();
        SMSessionContext projectAuthContext = project.getSessionContext();
                        execCount++;
    /**
 *
    }
                return txnInfo.getCurrentSavepoint();

     */
            return events.size();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.Log;
    /**
        }
        if (event instanceof QMMetaEvent metaEvent) {
        if (sessionPersistent == null) {
    }


    }
 * DBeaver - Universal Database Manager
            }

                }

        }
        }
    }
 * See the License for the specific language governing permissions and
        return criteria;
    }
        if (workspaceSession == null) {
    public static String getQmSessionId(DBCExecutionContext executionContext) throws DBException {
                    QMMStatementExecuteInfo execInfo = sp.getLastExecute();
    private static final Log log = Log.getLog(QMUtils.class);
        for (String queryType : CommonUtils.splitString(store.getString(QMConstants.PROP_QUERY_TYPES), ',')) {
            if (txnInfo != null) {
        public void close() {
        @Override
            session = project.getSessionContext().getSpaceSession(monitor, projectPrimaryAuthSpace, false);

     * Extract QM session id from data source
            if (sessionInfo == null || sessionInfo.isClosed()) {
            this.events = events;

        } else {
import org.jkiss.dbeaver.model.qm.meta.QMMStatementExecuteInfo;
    public static boolean isTransactionActive(DBCExecutionContext executionContext) {

        }

    }

    }
    public static void unregisterHandler(QMExecutionHandler handler) {
                            return sp.getLastExecute() != null;
                            && purpose != DBCExecutionPurpose.META
        @Override
        }
                            && purpose != DBCExecutionPurpose.UTIL
            return position < events.size();
        return workspaceSession;
     * Extract QM session id from project
        if (defaultHandler == null) {
                queryTypes.add(DBCExecutionPurpose.valueOf(queryType));
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.DBPDataSource;
        SMSession session = null;
import org.jkiss.dbeaver.model.auth.SMSessionContext;
    @Nullable
        }
import org.jkiss.dbeaver.model.auth.SMSession;


            } catch (IllegalArgumentException e) {
                        }

        int execCount = 0, updateCount = 0;
    public static String getQmSessionId(@NotNull DBPProject project) throws DBException {
                    }
    }
            }
                    QMMTransactionSavepointInfo sp = txnInfo.getCurrentSavepoint();

        }

import org.jkiss.dbeaver.model.app.DBPProject;
//                    for (QMMStatementExecuteInfo exec = execInfo; exec != null && exec.getSavepoint() == sp; exec = exec.getPrevious()) {
            txnMode = false;
    }
    @Nullable
        @Override
                if (txnInfo != null) {

    public static void registerMetaListener(QMMetaListener metaListener) {
     */
            throw new DBException("Empty cursor");
                            // If transaction was enabled all statements are transactional

        }
        if (txnStartTime <= 0) {
import org.jkiss.code.Nullable;
        public ListCursorImpl(List<QMMetaEvent> events) {
            DBPWorkspace workspace = project.getWorkspace();
    public static String getQmSessionId(@NotNull DBPDataSource dataSource) throws DBException {
        SMSessionPersistent sessionPersistent = DBUtils.getAdapter(SMSessionPersistent.class, session);
                                if (ei.isTransactional()) {


    }
    public static String getQmSessionId(SMSession session) {
    }


    @Nullable
        }
        }
        return application.getQueryManager().getMetaCollector().getConnectionInfo(executionContext);

    public static void initApplication(DBPPlatform application) {
                        }
            try {

                    }

import org.jkiss.dbeaver.model.qm.meta.QMMConnectionInfo;

import org.jkiss.dbeaver.model.qm.meta.QMMTransactionSavepointInfo;
    private static DBPPlatform application;
    }
        application.getQueryManager().registerHandler(handler);
        criteria.setQueryTypes(queryTypes.toArray(new DBCExecutionPurpose[0]));
            if (position < 0 || position >= events.size()) {
        }
    public static QMMConnectionInfo getCurrentConnection(DBCExecutionContext executionContext) {
            QMMTransactionInfo txnInfo = sessionInfo.getTransaction();
    }
            return event.getObject().getCloseTime();
            throw new DBException("No workspace session");
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
     * Return close time for events that were ended
            return false;
        if (event.getAction() == QMEventAction.END) {

    public static class EmptyCursorImpl implements QMEventCursor {
 * You may obtain a copy of the License at
            return false;
        criteria.setObjectTypes(objectTypes.toArray(new QMObjectType[0]));
import org.jkiss.utils.CommonUtils;
import java.util.Collection;

 * Copyright (C) 2010-2026 DBeaver Corp and others
                }

                            }
        QMMConnectionInfo sessionInfo = getCurrentConnection(executionContext);

        return false;
        return application.getQueryManager().getEventBrowser(currentSessionOnly);
    }
//                            return true;

            QMMConnectionInfo sessionInfo = getCurrentConnection(executionContext);
}
                // ignore
    }
                if (txnInfo != null) {
        return getQmSessionId(executionContext.getDataSource());
        @Override
                        if (!exec.hasError()
                    QMMTransactionSavepointInfo sp = txnInfo.getCurrentSavepoint();
        public void scroll(int position, DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.auth.SMAuthSpace;

        QMUtils.application = application;
        if (executionContext == null || application == null) {

        public long getTotalSize() {
        public void scroll(int position, DBRProgressMonitor monitor) throws DBException {
    /**
                                    return true;
            }
        }
    public static class ListCursorImpl implements QMEventCursor {
    public static QMEventCriteria createDefaultCriteria(DBPPreferenceStore store) {
    }
                                }
            log.warn("Session persistent not found");
        }
        application.getQueryManager().unregisterMetaListener(metaListener);
 *
import org.jkiss.dbeaver.model.DBUtils;
        }
        return defaultHandler;
        List<DBCExecutionPurpose> queryTypes = new ArrayList<>();
    private static QMExecutionHandler defaultHandler;
            }
        return new QMTransactionState(execCount, updateCount, txnMode, txnStartTime);
                            updateCount++;
    public static QMEventBrowser getEventBrowser(boolean currentSessionOnly) {

            QMMetaEvent event = events.get(position);
                    for (QMMStatementExecuteInfo exec = execInfo; exec != null && exec.getSavepoint() == sp; exec = exec.getPrevious()) {
            return provider.getQueryManagerSessionId();
    public static QMMTransactionSavepointInfo getCurrentTransaction(DBCExecutionContext executionContext) {

import org.jkiss.dbeaver.model.auth.SMSessionPersistent;
public class QMUtils {
                txnMode = true;
    public static QMExecutionHandler getDefaultHandler() {

                        DBCExecutionPurpose purpose = exec.getStatement().getPurpose();

            return metaEvent.getTimestamp();
        return event.getObject().getOpenTime();
package org.jkiss.dbeaver.model.qm;
    public static void registerHandler(QMExecutionHandler handler) {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
    public static SMSession getWorkspaceSession(DBRProgressMonitor monitor) throws DBException {
import java.util.List;
                        ) {
        @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return getQmSessionId(dataSource.getContainer().getProject());
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (application == null) {

        public boolean hasNextEvent(DBRProgressMonitor monitor) throws DBException {
                        if (checkQueries) {
        }
    }
        @Override
    }
        }
            return null;
        } else {
/**
     */
                txnMode = false;
    }
        if (projectPrimaryAuthSpace != null) {
        return sessionPersistent.getAttribute(QMConstants.QM_SESSION_ID_ATTR);
 * Unless required by applicable law or agreed to in writing, software

                    if (sp != null) {
            if (sessionInfo != null && sessionInfo.isTransactional()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        public long getTotalSize() {
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        return isTransactionActive(executionContext, true);
        final boolean txnMode;
        QMEventCriteria criteria = new QMEventCriteria();
        @Override
                txnMode = false;
import java.util.ArrayList;
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
        application.getQueryManager().unregisterHandler(handler);
            position++;
        if (DBWorkbench.getPlatform().getApplication() instanceof QMSessionProvider provider) {
            QMMConnectionInfo sessionInfo = getCurrentConnection(executionContext);
        public void close() {
        }
            txnStartTime = System.currentTimeMillis();

        @Override
//                        }
        }
/*
 * limitations under the License.
                QMMTransactionInfo txnInfo = sessionInfo.getTransaction();
        }
//                    }
    public static long getObjectEventTime(QMEvent event) {
        SMAuthSpace projectPrimaryAuthSpace = projectAuthContext.getPrimaryAuthSpace();
        }
            } else {
        private int position;
                QMMTransactionInfo txnInfo = sessionInfo.getTransaction();
        public boolean hasNextEvent(DBRProgressMonitor monitor) throws DBException {
