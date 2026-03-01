        Connection result = getConnection(monitor, true);
            throw new JDBCException(e, this);
                            txnIsolationLevelReadInProgress = false;
                    );
            if (session.isLoggingEnabled()) {
        if (dbCon == null) {
            try {
            // If connect will fail then context will remain in the list but with null connection.
            try {
                log.debug("Can't set auto-commit state: " + e.getMessage()); //$NON-NLS-1$
            // no-op
        }

        }
        public void lock(@NotNull Object owner) {
        }
                //log.error("Cannot determine transaction isolation level due to connection hanging. Setting to NONE.");
        return dbCon;
        DBExecUtils.startContextInitiation(dataSource.getContainer());
        return getDataSource().getInfo().supportsSavepoints();
        } catch (SQLException e) {
                } else {
import java.util.concurrent.locks.ReentrantLock;

import java.sql.Savepoint;
    protected static final String TASK_TITLE_SET_SCHEMA = "Set active schema"; //$NON-NLS-1$
        }
            return defaultValue;
        }
            throw new JDBCException(e, this);
                    this.transactionIsolationLevel = txnLevel;
import org.eclipse.core.runtime.IStatus;
        return dataSource.getName() + " - " + instance.getName() + " - " + getContextName();
                    this.autoCommit = connection.getAutoCommit();
            // no-op
            final StackTraceElement[] trace;
            this.connection = dataSource.openConnection(monitor, this, purpose);
            }
        } catch (SQLException e) {

            // Remove self from context list
import org.jkiss.dbeaver.model.impl.AbstractExecutionContext;

                }
    ///////////////////////
        statementLock.close();
    public Connection getConnectionOrNull() {
                // Commit transaction. We can perform init SQL which potentially may lock some resources
                // Init (or copy) context state
            throw new DBCException("Connection is dead");
        if (autoCommit == null) {
                savepoint = dbCon.setSavepoint(name);
            close();
            this.connection = null;
        //QMUtils.getDefaultHandler().handleTransactionIsolation(getConnection(), jdbcTIL);

import org.jkiss.dbeaver.model.DBPTransactionIsolation;

        }
    public JDBCSession openSession(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionPurpose purpose, @NotNull String taskTitle) {
                }.schedule();
    @Nullable
            if (isAutoCommit()) {
        private static final NoOpLock INSTANCE = new NoOpLock();
/*
    }
 *

                            autoCommit = getConnection().getAutoCommit();
            }
    }
                );
                traces.put(identity, new LockInfo(Thread.currentThread()));
            } else if (savepoint instanceof Savepoint) {
import java.lang.reflect.InvocationTargetException;
 * JDBCExecutionContext.
        connect(monitor, null, null, null, true);
        } catch (SQLException e) {
    @Override
    @Override
 */
                log.error("Cannot determine autocommit state due to connection hanging. Setting to manual commit mode.");
                if (!this.autoCommit) {
            }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    this.autoCommit = false;
        try {
            log.debug("Unable to determine if connection is in autocommit mode", e);
            if (!traces.containsKey(identity)) {
            final Thread thread;
}
        }
        }
                try {
                }
        }
        void close();

        try {
    }
    }
            if (savepoint instanceof JDBCSavepointImpl) {
    @Override
            // Get default txn isolation level

            }
                        } catch (DBException e) {
        disconnect(true);
                }
            throw new JDBCException(e, this);
                }
                // Cache auto-commit
                        session.enableLogging(false); // Disable logging to avoid smart commit recovery activation
                }

        private volatile boolean closed = false;
    private void closeContext(boolean removeContext) {
        throws DBCException {
    private Connection getConnection() throws DBCException {
    // Time to wait for txn level/auto-commit detection
    public void releaseSavepoint(@NotNull DBRProgressMonitor monitor, @NotNull DBCSavepoint savepoint)

            }
            }
            monitor.subTask("Set connection defaults");
    public void setTransactionIsolation(@NotNull DBRProgressMonitor monitor, @NotNull DBPTransactionIsolation transactionIsolation)

    // Used for non-thread-safe drivers
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            // If we cannot determine if connection is in autocommit mode, assume that it is not
                this.trace = thread.getStackTrace();
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
        monitor.subTask("Set JDBC connection auto-commit " + autoCommit);
            try {
        public void close() {
import org.jkiss.dbeaver.model.DBPAdaptable;
            // Try to connect again.

        if (CommonUtils.equalObjects(instance.getName(), dataSource.getName())) {
            Connection dbCon = getConnection();
                this.dataSource.initializeContextState(monitor, this, initFrom);
import org.jkiss.code.NotNull;
            }

        } catch (SQLException e) {
        private final ReentrantLock lock = new ReentrantLock(true);
    }

        }
            throw new SQLException("Null connection returned");

    protected void connect(@NotNull DBRProgressMonitor monitor, Boolean autoCommit, @Nullable Integer txnLevel, JDBCExecutionContext initFrom, boolean addContext) throws DBCException {
import org.jkiss.dbeaver.Log;

            }
                        }
        }

            } else {
 * DBeaver - Universal Database Manager
        }
        if (removeContext) {
    public static final String TYPE_MAIN = "Main";
        }

            if (autoCommit == null) {
    }

    private static class NoOpLock implements StatementLock {
    }
                txnIsolationLevelReadInProgress = true;
                                    transactionIsolationLevel = getConnection().getTransactionIsolation();
        return new JDBCSavepointImpl(this, savepoint);
                            if (!autoCommit) {
                    log.debug("Can't set transaction isolation level", e); //$NON-NLS-1$
                    lock.unlock();
                } else if (savepoint instanceof Savepoint) {
    // Transaction manager
        throws DBCException {
                    throw new IllegalMonitorStateException(

        public void lock(@NotNull Object owner) {
                lock.lockInterruptibly();
        try {
 * Unless required by applicable law or agreed to in writing, software
    }
                log.warn("Error while running context bootstrap", e);
                    dbCon.rollback(((JDBCSavepointImpl) savepoint).getOriginal());
            if (closed) {
    public DBCSavepoint setSavepoint(@NotNull DBRProgressMonitor monitor, String name)



    @NotNull
                if (savepoint instanceof JDBCSavepointImpl) {
                dbCon.rollback();
        final JDBCRemoteInstance currentInstance = this.instance;
                autoCommit = false;
                    try (JDBCSession session = openSession(monitor, DBCExecutionPurpose.META, "Start transaction")) {
                log.debug("Connection close timeout");
            throw new JDBCException(e, this);

        if (transactionIsolationLevel == null) {
        if (phase == DBCInvalidatePhase.INVALIDATE) {
    public String toString() {
        private final Map<Long, LockInfo> traces = new ConcurrentHashMap<>();

    }
    protected void disconnect() {

    }
    public void invalidateContext(@NotNull DBRProgressMonitor monitor, @NotNull DBCInvalidatePhase phase) throws DBException {
        }
    private interface StatementLock {
                dbCon.releaseSavepoint(((JDBCSavepointImpl) savepoint).getOriginal());
import org.jkiss.code.Nullable;
            this.instance.removeContext(this);
        } finally {
    public void connect(DBRProgressMonitor monitor) throws DBCException {
    @Nullable
import java.sql.SQLFeatureNotSupportedException;
 * Implements transaction manager and execution context defaults.
                    "Thread " + Thread.currentThread().getName() + " was interrupted while waiting for lock", e
    private StatementLock statementLock = NoOpLock.INSTANCE;
        try {
                    log.debug("Can't check auto-commit state", e); //$NON-NLS-1$
        if (connection == null && openIfNeeded) {
                savepoint = dbCon.setSavepoint();
                                } catch (Throwable e) {
                return;
            try {
                connect(monitor);
        {
    public void setAutoCommit(@NotNull DBRProgressMonitor monitor, boolean autoCommit)
        if (this.autoCommit != null && this.autoCommit == autoCommit) {
    public DBPTransactionIsolation getTransactionIsolation() throws DBCException {
    public void rollback(@NotNull DBCSession session, DBCSavepoint savepoint)
            }
                // Add self to context list
            if (addContext) {
    }
            // Get defaults from preferences
            }
        throws DBCException {
        @Override
            }
        if (removeContext) {
            closeContext(false);

    // All statements and their result sets are executed/fetched consequently
        return null;
    }
            return;
            } catch (InterruptedException e) {
                        } finally {
            currentInstance.getExclusiveLock().releaseExclusiveLock(exclusiveLock);
            } catch (DBException e) {
    @Override

                            " but owner " + owner + " belongs to another thread"
                return;
 *
    }
        Object exclusiveLock = currentInstance.getExclusiveLock().acquireExclusiveLock();
    /// Statement locks
                } else {
    static final int TXN_INFO_READ_TIMEOUT = 5000;

            throw new DBCException("Disconnected");
        return connection != null;
            } catch (Throwable e) {
            dbCon.setAutoCommit(autoCommit);
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCSavepointImpl;
                        session.commit();
    public void checkContextAlive(DBRProgressMonitor monitor) throws DBException {
            LockInfo(Thread thread) {
        if (phase == DBCInvalidatePhase.BEFORE_INVALIDATE) {
    public boolean supportsSavepoints() {
                } catch (Throwable e) {
    }
                        }

                if (e.getCause() instanceof SQLException) {
                                }
    }
    }
            // no-op
            }
                log.error("Error ending transaction after context initialize", e);
                                    transactionIsolationLevel = Connection.TRANSACTION_NONE;
                throw new DBCException("Null connection returned");
            if (connection != null && !dataSource.closeConnection(connection, purpose, !isAutoCommit(false))) {
        }
                        } catch (Exception e) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            // Run in task with timeout
                            }

    }
            return isAutoCommit();
            // On next invalidate it will try to reopen
                        "unlock() called from thread " + Thread.currentThread().getName() +
    }
    public static final String TYPE_METADATA = "Metadata";
                if (closed) {
            if (session.isLoggingEnabled()) {
    private volatile Integer transactionIsolationLevel;

    @Override
import java.util.Map;
        statementLock.lock(stmt);
import org.jkiss.dbeaver.DBException;
                        try {
        // We remove context before it is actually closed.

        throws DBCException {
        if (adapter == DBCTransactionManager.class) {
            if (txnLevel != null) {
        // Do it outside of exclusive lock to avoid dead locks

                    log.debug("Error getting transaction isolation level: " + e.getMessage());

    }
        throws DBCException {
        try {
        }
            if (!this.autoCommit) {
            if (autoCommit == null) {
            }

        // Because disconnect may (potentially) hang in socket forever
            return super.toString();
            if (lock.isHeldByCurrentThread()) {
            if (JDBCUtils.isRollbackWarning(e)) {
            Connection dbCon = getConnection();
        if (!instance.getDataSource().getContainer().getDriver().isThreadSafeDriver()) {
            } else {
        void unlock(@NotNull Object owner);
    }
        }
    public void unlockStatementExecution(@NotNull DBCStatement stmt) {
        }
            if (lock.isHeldByCurrentThread() && traces.containsKey(identity)) {

    protected void disconnect(boolean removeContext) {
            if (transactionIsolationLevel == null) {
            final long timestamp;
        }
    public Connection getConnection(DBRProgressMonitor monitor) throws SQLException {
            }
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
                } catch (DBException e) {
                    throw new IllegalStateException("Lock was closed while waiting for lock");
        private static long getIdentity(Object owner) {
                this.timestamp = System.currentTimeMillis();
 * See the License for the specific language governing permissions and
    private transient volatile boolean txnIsolationLevelReadInProgress;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.utils.CommonUtils;
import java.util.concurrent.ConcurrentHashMap;
    @Override

                    @NotNull
            }
        disconnect(removeContext);
        return result;
        if (result == null) {
                                    transactionIsolationLevel = Connection.TRANSACTION_NONE;
        } catch (SQLException e) {
                throw new SQLFeatureNotSupportedException(ModelMessages.model_jdbc_exception_bad_savepoint_object);
            getConnection().setTransactionIsolation(jdbcTIL.getCode());
            }
            long identity = getIdentity(owner);
        } finally {
                        try {
        }
                            log.debug("Error determining transaction isolation level", e);
import java.sql.Connection;

                throw new IllegalStateException("Lock already closed");
    }
    @Override
        return connection;
            }
                                try {
        try {
            getConnection().commit();
                this.initContextBootstrap(monitor, autoCommit);

                    transactionIsolationLevel = Connection.TRANSACTION_NONE;
            }
            return  ((long) System.identityHashCode(owner) << 32)
    @Override
        statementLock.unlock(stmt);



            QMUtils.getDefaultHandler().handleTransactionAutocommit(this, autoCommit);
                this.thread = thread;
            if (!RuntimeUtils.runTask(monitor -> {
    @Override
    }
                                    transactionIsolationLevel = getConnection().getTransactionIsolation();
            }


                dbCon.releaseSavepoint((Savepoint) savepoint);

            } catch (DBException e) {
                QMUtils.getDefaultHandler().handleTransactionCommit(this);


                    @Override

        return JDBCTransactionIsolation.getByCode(transactionIsolationLevel);
            // Notify QM
                throw new DBCException("Can't determine auto-commit state - timeout");

            }
                                try {
        return instance.getDataSource().getInfo().supportsTransactions();
    @Override
        private static class LockInfo {
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        }
            }
            this.autoCommit = dbCon.getAutoCommit();
        }
    public void close() {
                // Let's free them.
    @Override
    @Override
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;
                try {
                this.autoCommit = autoCommit;
                return JDBCTransactionIsolation.getByCode(Connection.TRANSACTION_NONE);
        throws DBCException {
                    }
                | (System.identityHashCode(Thread.currentThread()) & 0xffffffffL);
    public <T> T getAdapter(@NotNull Class<T> adapter) {
        throws DBCException {
                log.warn("Error while initializing context state", e);

        } catch (DBCException e) {
            throw new DBCException(e, this);
                log.debug("Rollback warning: " + e.getMessage());
                    dbCon.rollback((Savepoint) savepoint);
            }, "Get auto commit state", TXN_INFO_READ_TIMEOUT)) {
/**
                    throw (SQLException) e.getCause();
 * Both depend on datasource implementation.
            traces.put(identity, new LockInfo(Thread.currentThread()));
            }
        synchronized (this) {
                txnLevel = dataSource.getContainer().getDefaultTransactionsIsolation();
    }
        try {
    }
        void lock(@NotNull Object owner);
    }
    //////////////////////////////////////////////////////////////

                connection.setAutoCommit(autoCommit);
            DBExecUtils.finishContextInitiation(dataSource.getContainer());
        public void close() {
            }
import org.jkiss.dbeaver.model.exec.*;
                currentInstance.addContext(this);
            {
                throw new JDBCException(e, this);
                    DBExecUtils.tryExecuteRecover(monitor, getDataSource(), monitor1 -> {
 *
                                    log.debug("Error getting transaction isolation level: " + e.getMessage());
        super(instance, purpose);
import java.sql.SQLException;
            if (name == null) {
    }
                    this.getConnection().setTransactionIsolation(txnLevel);
                            });
                                }
    @Override


            try {
            }
    public boolean isConnected() {
    }

        } finally {
            }
        // Now initialize context state
            }
            super.closeContext();
                    });
    public JDBCExecutionContext(@NotNull JDBCRemoteInstance instance, boolean test) {
                try {
    private volatile Connection connection;

    }
        return autoCommit;
        }
        } catch (SQLException e) {


    public void commit(@NotNull DBCSession session)
        public void unlock(@NotNull Object owner) {
            throw new DBCException(ModelMessages.model_jdbc_exception_invalid_transaction_isolation_parameter);

        }
            } catch (Throwable e) {
        }
        Savepoint savepoint;
            } else {
            }
public class JDBCExecutionContext extends AbstractExecutionContext<JDBCDataSource, JDBCRemoteInstance> implements DBCTransactionManager, DBPAdaptable {
        try {
            return adapter.cast(this);
    }
        return this.connection;
                                    log.error("Error getting transaction isolation level", e);
                transactionIsolationLevel = null;
            log.error("Reopening not-closed connection");
    private static final Log log = Log.getLog(JDBCExecutionContext.class);
                Thread.currentThread().interrupt();
    }
            Connection dbCon = getConnection();
 * distributed under the License is distributed on an "AS IS" BASIS,

                }
        if (!(transactionIsolation instanceof JDBCTransactionIsolation jdbcTIL)) {
        }
            connect(monitor, autoCommit, transactionIsolationLevel, this, false);
            } catch (DBCException e) {

            long identity = getIdentity(owner);
    @Override
package org.jkiss.dbeaver.model.impl.jdbc;
        }
                lock.unlock();
                            log.error("Error getting auto commit state", e);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        if (connection != null && addContext) {
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSupportsTransactions() {
import org.jkiss.dbeaver.model.qm.QMUtils;
        }
            if (txnLevel == null) {
            QMUtils.getDefaultHandler().handleTransactionIsolation(this, transactionIsolation);
    public boolean isAutoCommit()

                    transactionIsolationLevel = getConnection().getTransactionIsolation();
 */
        }
    @NotNull
                                } catch (Throwable e) {
                            DBExecUtils.tryExecuteRecover(monitor, getDataSource(), monitor1 -> {
            } else {
        } finally {
        closeContext(true);
            try {
                traces.remove(identity);
                return JDBCTransactionIsolation.getByCode(Connection.TRANSACTION_NONE);
 * limitations under the License.
            }
    private boolean isAutoCommit(boolean defaultValue) {
    private static class SingleThreadLock implements StatementLock {
                    throw new SQLFeatureNotSupportedException(ModelMessages.model_jdbc_exception_bad_savepoint_object);
    public void lockStatementExecution(@NotNull DBCStatement stmt) {
        }
            if (!txnIsolationLevelReadInProgress) {

            if (savepoint != null) {
    @Override
                autoCommit = dataSource.getContainer().isDefaultAutoCommit();
    public JDBCExecutionContext(@NotNull JDBCRemoteInstance instance, String purpose) {
            statementLock = new SingleThreadLock();
                throw new IllegalStateException(
            if (this.connection == null) {
                    throw new InvocationTargetException(e);
        // [JDBC] Need sync here because real connection close could take some time
                        return Status.OK_STATUS;
    @Override
                try {
    public Connection getConnection(DBRProgressMonitor monitor, boolean openIfNeeded) throws SQLException {
        @Override
        } finally {

        }
            transactionIsolationLevel = jdbcTIL.getCode();
        public void unlock(@NotNull Object owner) {
                }
        Connection dbCon = this.connection;
    //////////////////////////////////////////////////////////////
                } catch (Throwable e) {
                }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                new AbstractJob("Get transaction isolation level") {
                if (traces.containsKey(identity)) {
    private volatile Boolean autoCommit;
    }


import org.eclipse.core.runtime.Status;
    }
            } else {
        return dataSource.createConnection(monitor, this, purpose, taskTitle);
            }
            closed = true;
                QMUtils.getDefaultHandler().handleTransactionRollback(this, savepoint);
            } else {
        super(instance, "Test for " + instance);

        @Override
        }
    @NotNull
            Connection dbCon = getConnection();

        if (!JDBCUtils.isConnectionAlive(getDataSource(), getConnection())) {
                } catch (Throwable e) {
                    throw new SQLException(e);
                }
        }
        // while UI may invoke callbacks to operate with connection
            }
