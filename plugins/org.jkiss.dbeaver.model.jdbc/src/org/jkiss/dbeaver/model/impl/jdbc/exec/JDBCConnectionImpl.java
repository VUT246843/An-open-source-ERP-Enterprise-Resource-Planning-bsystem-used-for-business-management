    }
        }
        JDBCSavepointImpl jdbcSavepoint = new JDBCSavepointImpl(context, savepoint);
    public void releaseSavepoint(Savepoint savepoint)


    @Override
        return getOriginal().createStruct(typeName, attributes);

    {
    public int getTransactionIsolation()
        return getOriginal().createClob();
    @Override
                log.debug("Can't check for connection warnings", e);
        getOriginal().releaseSavepoint(savepoint);
        }
        try {
    @Override
        throws SQLException
    {
        getOriginal().setCatalog(catalog);
                catch (SQLException e) {
            QMUtils.getDefaultHandler().handleTransactionCommit(context);
            sql);


    }

    @Override

    @Override
    @Override



        throws SQLException
    }
    {
    {

        throws SQLException
        }
 * You may obtain a copy of the License at

    @NotNull
                        throw e;
        throws SQLException
                    } else {
        throws SQLException
                    }

    @Override
    }
                    if (JDBCUtils.isFeatureNotSupportedError(getDataSource(), e)) {
                    }
import java.util.concurrent.Executor;

        return blockThread;
        getOriginal().rollback(savepoint);
            () -> getOriginal().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability));
        JDBCSavepointImpl jdbcSavepoint = new JDBCSavepointImpl(context, savepoint);
            try {
    public JDBCPreparedStatement prepareStatement(String sql, String[] columnNames)
    private static final Log log = Log.getLog(JDBCConnectionImpl.class);
    private void disableStatementEscapeProcessing(JDBCStatement statement) {
    @Override
                        scrollable ? ResultSet.TYPE_SCROLL_INSENSITIVE : ResultSet.TYPE_FORWARD_ONLY,
    }
        return context.getDataSource().getContainer().getDefaultValueHandler();
                    }
        throws SQLException
    }
    private Connection getOriginalOrNull() throws SQLException {
    {
            QMUtils.getDefaultHandler().handleTransactionSavepoint(jdbcSavepoint);
    public void setHoldability(int holdability)
    }
    }
        getOriginal().rollback();
        throws SQLException
    @Override
        Connection connection = context.getConnectionOrNull();
    @Nullable
                    } else {
                        sqlQuery,
                catch (SQLFeatureNotSupportedException | UnsupportedOperationException | IncompatibleClassChangeError e) {
    }
                statement.setEscapeProcessing(false);
                    return prepareStatement(sqlQuery);
    @Override
        // Let's try with driver implementation
    {
            } else if (type == DBCStatementType.SCRIPT) {
                        sqlQuery,
    {
        try {
    {
/**
                            statement = prepareStatement(
    @Override
        getOriginal().setReadOnly(readOnly);

        if (isLoggingEnabled()) {
                    return prepareStatement(
import org.jkiss.dbeaver.model.runtime.DBRBlockingObject;
    @Override
        this.context = context;


                    } else {
    {
    @Override
    @Override
    }
    public JDBCStatement createStatement(int resultSetType, int resultSetConcurrency)
    }
                    }


    ) throws SQLException,IllegalArgumentException {
    @Override
    }
        getOriginal().setSchema(schema);
    }
import java.util.Properties;
        return createPreparedStatementImpl(
    {
    @Override
    protected JDBCStatement createStatementImpl(@NotNull JDBCObjectSupplier<Statement> original)
    @Override
    @Override
    @Override

    }
            () -> getOriginal().prepareCall(sql, resultSetType, resultSetConcurrency),
    @NotNull

                                throw e;
        Savepoint savepoint = getOriginal().setSavepoint(name);
        throws SQLException,IllegalArgumentException
    public void commit()
            }

                                updatable ? ResultSet.CONCUR_UPDATABLE : ResultSet.CONCUR_READ_ONLY);
        this.blockThread = blockThread;
            }
    public void rollback()
        throws SQLException
        } catch (SQLException e) {

import org.jkiss.dbeaver.model.exec.DBCSavepoint;
    public void setBlockThread(Thread blockThread) {
    }
    @Override
        throws SQLException
    public boolean getAutoCommit()
        return getOriginal().createBlob();
    }

        if (isLoggingEnabled()) {
                    if (JDBCUtils.isFeatureNotSupportedError(getDataSource(), e)) {

    {
                catch (SQLFeatureNotSupportedException | UnsupportedOperationException | IncompatibleClassChangeError e) {
    }
    public JDBCDatabaseMetaData getMetaData()
        }
    }
        if (connection != null) {
        return createCallableStatementImpl(
    }
    {
        }
        getOriginal().setAutoCommit(autoCommit);
    }
    @Override

    public Array createArrayOf(String typeName, Object[] elements)
            } else if (returnGeneratedKeys) {
            if (e instanceof SQLClientInfoException) {
    {
                                updatable ? ResultSet.CONCUR_UPDATABLE : ResultSet.CONCUR_READ_ONLY);
    {
                        }
        throws SQLException
        DBCExecutionPurpose purpose = getPurpose();
    public Struct createStruct(String typeName, Object[] attributes)

    public boolean isValid(int timeout)
                    dbStat = prepareStatement(
import java.sql.*;
                        } catch (Throwable e2) {
    {
            } else {
    {

 * DBeaver - Universal Database Manager
        throws SQLException
            }
    public void cancelBlock(@NotNull DBRProgressMonitor monitor, @Nullable Thread blockThread) throws DBException {
        return context.getDataSource().getJdbcFactory().createPreparedStatement(this, stmtSupplier, sql, !isLoggingEnabled());

        return createPreparedStatementImpl(() -> getOriginal().prepareStatement(sql), sql);
                    dbStat =  prepareStatement(sqlQuery);
        getOriginal().setTransactionIsolation(level);
                            }
        return getOriginal().isValid(timeout);

    public JDBCPreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setClientInfo(String name, String value)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
        return getOriginal().getHoldability();
    @NotNull
                throw new SQLClientInfoException();
                JDBCPreparedStatement dbStat;
    public void abort(Executor executor) throws SQLException {
                return statement;
    ) throws SQLException,IllegalArgumentException {
    @NotNull
            () -> getOriginal().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability),
    public boolean isClosed()
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
                if (connection != null) {
    @Override

        if (savepoint instanceof JDBCSavepointImpl) {
                    disableStatementEscapeProcessing(statement);
    @Override
    @Override
    @Override
        }
        boolean returnGeneratedKeys)
        throws SQLException
                }
    @NotNull
                return !isClosed();
    @Override

        throws SQLException

                }
    @Override
    public String getClientInfo(String name)
    {
    @Override
        if (purpose.isUser()) {
    }
                }

                if (context.getDataSource().getSQLDialect().isDisableScriptEscapeProcessing()) {
    @NotNull
import org.jkiss.code.Nullable;

        getOriginal().setTypeMap(map);
    }



    }
            getDataSource().cancelCurrentExecution(connection, blockThread);
 * Manageable connection
 * Licensed under the Apache License, Version 2.0 (the "License");

            // Check for warnings
    public Map<String, Class<?>> getTypeMap()
    public JDBCPreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
    }
    }
    }
                throw new SQLClientInfoException();
        throws SQLException
        throws SQLException
        return getOriginal().isClosed();
    @Override
                try {
    public JDBCCallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
    {
                        statement = createStatement();
    }
        return createCallableStatementImpl(() -> getOriginal().prepareCall(sql), sql);
                        statement = createStatement(
    {
        return makeStatement(() -> getOriginal().createStatement());
    {
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
                final Connection connection = getOriginalOrNull();
    @Override
        @NotNull JDBCObjectSupplier<CallableStatement> stmtSupplier,
                throw (SQLClientInfoException)e;

        getOriginal().clearWarnings();
    @NotNull
    {
    @Override
    }
    }
                }
    public JDBCConnectionImpl(@NotNull JDBCExecutionContext context, @NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionPurpose purpose, @NotNull String taskTitle)

    @Override
        return getOriginal().unwrap(iface);
        }

    {
    public void setReadOnly(boolean readOnly)
                    if (!scrollable && !updatable) {
            // Check that connection is alive
    protected JDBCPreparedStatement createPreparedStatementImpl(
                // (e.g. in Oracle it parses IN/OUT parameters)
    public int getNetworkTimeout() throws SQLException {
        throws SQLClientInfoException
        @NotNull JDBCObjectSupplier<PreparedStatement> stmtSupplier,
    {
        return jdbcSavepoint;
    }
    }
            if (type == DBCStatementType.EXEC && JDBCUtils.queryHasOutputParameters(getDataSource().getSQLDialect(), sqlQuery)) {
            () -> getOriginal().prepareStatement(sql, resultSetType, resultSetConcurrency),
                    if (!isInternalDriverError(e)) {

                }
    }
            QMUtils.getDefaultHandler().handleTransactionRollback(context, null);
    public void rollback(Savepoint savepoint)
                try {
    {
    {

    // Disable escaping (#3512)
        throws SQLException
        @NotNull String sqlQuery,
        throws SQLException
    public Savepoint setSavepoint(String name)
    @Override
    @Override
                            if (!isInternalDriverError(e)) {
                    try {
        return context;
                        Statement.RETURN_GENERATED_KEYS);
import org.jkiss.dbeaver.model.exec.DBCStatementType;
            synchronized (context) {
        getOriginal().abort(executor);

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setTransactionIsolation(int level)
            if (e instanceof SQLClientInfoException) {
    {
        return context.getDataSource();
                        dbStat = prepareStatement(sqlQuery);
        throws SQLException
    @NotNull

                // Just simplest statement for scripts
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;

    }
            getOriginal().setClientInfo(name, value);
    public Blob createBlob()
        throws SQLException
    }
    public JDBCPreparedStatement prepareStatement(String sql)
                                scrollable ? ResultSet.TYPE_SCROLL_INSENSITIVE : ResultSet.TYPE_FORWARD_ONLY,

    {
                log.debug(e);
    }
    @NotNull
        boolean scrollable,
    }
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (statement != null) {

    private static boolean isInternalDriverError(Throwable e) {
    @Override

        }
    {
        throws SQLException
        return getOriginal().getClientInfo();

    @NotNull
    @NotNull
        throws SQLException
    @Override

        return createPreparedStatementImpl(
                                scrollable ? ResultSet.TYPE_SCROLL_INSENSITIVE : ResultSet.TYPE_FORWARD_ONLY,
            QMUtils.getDefaultHandler().handleTransactionSavepoint(jdbcSavepoint);
    public void setClientInfo(Properties properties)
                        }
    public boolean isWrapperFor(Class<?> iface)
                                sqlQuery,
            getOriginal();
            } else {
    public JDBCDataSource getDataSource()
            } else {
import org.jkiss.dbeaver.Log;

    {

        return getOriginal().createSQLXML();
    public Clob createClob()
                    JDBCUtils.reportWarnings(this, connection.getWarnings());
    public void setAutoCommit(boolean autoCommit)
                // Sometimes prepared statements perform additional checks of queries
        @Nullable String sql
    @Override
    }
                        throw e;

        if (isLoggingEnabled()) {
    }
    {
        throws SQLException

    @Override
        }
            sql);
        return getOriginal().getWarnings();
    @Override
        throws SQLException
 *
            sql);
    @NotNull
    public SQLWarning getWarnings()
    {
        getOriginal().setNetworkTimeout(executor, milliseconds);
        try {
        throws SQLException
    }
            savepoint = ((JDBCSavepointImpl)savepoint).getOriginal();
    {
    {
        throws SQLException
                        try {
            log.error("could not check connection state", e);
                            statement = prepareStatement(sqlQuery);
                }
        throws SQLException
        throws SQLException
        throws SQLException
                        updatable ? ResultSet.CONCUR_UPDATABLE : ResultSet.CONCUR_READ_ONLY);
                throw (SQLClientInfoException)e;
    {
        return getOriginal().getCatalog();
import org.jkiss.dbeaver.model.exec.jdbc.*;
    private JDBCStatement makeStatement(@NotNull JDBCObjectSupplier<Statement> statement)
        boolean updatable,

    {
    @Override
        return getOriginal().getTypeMap();
    @Override
                    }
        super.close();
    @Override
    }

    {
import org.jkiss.code.NotNull;
        return context.getConnection(getProgressMonitor(), true);
    {
import org.jkiss.dbeaver.DBException;
    public Thread getBlockThread() {
    @Override
    {
    @Override
    public void setTypeMap(Map<String, Class<?>> map)
                }
    @Override
    {
                try {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.AbstractSession;
        return createStatementImpl(statement);
    }
    @Override
    }
        throws SQLClientInfoException

        }
        Savepoint savepoint = getOriginal().setSavepoint();
            }
                    if (JDBCUtils.isFeatureNotSupportedError(getDataSource(), e)) {
                catch (SQLFeatureNotSupportedException | UnsupportedOperationException | IncompatibleClassChangeError e) {
 */
 *
    final JDBCExecutionContext context;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
                catch (SQLException e) {
    }
        return new JDBCDatabaseMetaDataImpl(this, getOriginal().getMetaData());
 * Unless required by applicable law or agreed to in writing, software
        }
                        throw e;
    {
    {
            QMUtils.getDefaultHandler().handleTransactionAutocommit(context, autoCommit);


                    } catch (Throwable e1) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCException;
        throws SQLException

                try {

        catch (SQLException e) {
        throws SQLException
    }
    private volatile Thread blockThread;
    {
    {
        return getOriginal().createNClob();
    public Connection getOriginal() throws SQLException
        return createPreparedStatementImpl(() -> getOriginal().prepareStatement(sql, columnNames), sql);
            QMUtils.getDefaultHandler().handleTransactionRollback(context, savepoint instanceof DBCSavepoint ? (DBCSavepoint) savepoint : null);
        throws SQLException
            } catch (Throwable e) {
    }

    }
    public boolean isReadOnly()
package org.jkiss.dbeaver.model.impl.jdbc.exec;
                        scrollable ? ResultSet.TYPE_SCROLL_INSENSITIVE : ResultSet.TYPE_FORWARD_ONLY,
                        return prepareCall(sqlQuery);
    public SQLXML createSQLXML()
    {
 */
        throws SQLException
    }
                    return prepareCall(sqlQuery);
        throws SQLException
            savepoint = ((JDBCSavepointImpl)savepoint).getOriginal();

    public JDBCStatement createStatement()
                    return prepareStatement(DBCStatementType.QUERY, sqlQuery, scrollable, updatable, returnGeneratedKeys);
                }
        if (isLoggingEnabled()) {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                log.debug(e);

                }
            sql
            return false;
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.qm.QMUtils;
    public String nativeSQL(String sql)
                        updatable ? ResultSet.CONCUR_UPDATABLE : ResultSet.CONCUR_READ_ONLY);
        throws SQLException

    {
    @Override
    }
        throws SQLException

    public DBDValueHandler getDefaultValueHandler()
                JDBCStatement statement;
                        sqlQuery,


/*

        throws SQLException
    {

    public JDBCPreparedStatement prepareStatement(String sql, int[] columnIndexes)
        throws SQLException
    @Override
    public boolean isConnected() {
        throws SQLException
    public JDBCCallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability)
        throws SQLException
    @Override
                catch (Throwable e) {
                    return prepareCall(
    @Override
    {
    }
        return createCallableStatementImpl(
        }

    public void close()
                }
                return dbStat;
    public void clearWarnings()
        @Nullable String sql


    }
    public String getCatalog()
    }
    {
    }
    }

public class JDBCConnectionImpl extends AbstractSession implements JDBCSession, DBRBlockingObject {
            try {
    @Override
        } catch (SQLException e) {
                        if (!isInternalDriverError(e)) {
        throws DBCException
    }
                // Execute as call - only if we query has out parameters bounds
                }
    @NotNull

    public NClob createNClob()
    @NotNull
        return getOriginal().getClientInfo(name);
    {

        return makeStatement(
            }
    {

                }
        }
                }
        return getOriginal().isWrapperFor(iface);
        throws SQLException
        if (isLoggingEnabled()) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

                // Return keys
    }
    {
    @NotNull
                }
    public <T> T unwrap(Class<T> iface)
    @Override
    }
                catch (SQLSyntaxErrorException e) {
    public void setCatalog(String catalog)
        return createPreparedStatementImpl(() -> getOriginal().prepareStatement(sql, autoGeneratedKeys), sql);
        return getOriginal().getAutoCommit();
    @Override
        try {
        return jdbcSavepoint;

    public String getSchema() throws SQLException
    @Override
        return getOriginal().isReadOnly();
    {
                    } else {
    @NotNull
        } catch (SQLException e) {

        getOriginal().setHoldability(holdability);
    {
        return getOriginal().createArrayOf(typeName, elements);
    @Override
                        statement = createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                }
    }
    @Override
        throws SQLException
                if (statement instanceof JDBCStatementImpl) {
            getOriginal().setClientInfo(properties);

 * Copyright (C) 2010-2025 DBeaver Corp and others
                            throw e;
    protected JDBCCallableStatement createCallableStatementImpl(
                            log.debug(e);
    }
        return getOriginal().getTransactionIsolation();
    }

    @Override
    {
        return getOriginal().getNetworkTimeout();
        throws SQLException
        return context.getDataSource().getJdbcFactory().createStatement(this, original, !isLoggingEnabled());
    }
    public JDBCStatement prepareStatement(
    }
    {
        return getOriginal().nativeSQL(sql);
    }

        return createStatementImpl(() -> getOriginal().createStatement(resultSetType, resultSetConcurrency));
    public JDBCPreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability)
    {
        return !(e instanceof SQLException) || JDBCUtils.isFeatureNotSupportedError(null, e);
        @NotNull DBCStatementType type,
        throws SQLException
    public JDBCExecutionContext getExecutionContext() {
    public int getHoldability()

    @Override
                    // Generic prepared statement
    public Properties getClientInfo()
    }

    }
        return context.getConnection(getProgressMonitor(), false);
                catch (SQLException e) {
        super(monitor, purpose, taskTitle);
    public void setSchema(String schema) throws SQLException
}
        return createPreparedStatementImpl(() -> getOriginal().prepareStatement(sql, columnIndexes), sql);

        return context.getDataSource().getJdbcFactory().createCallableStatement(this, stmtSupplier, sql, !isLoggingEnabled());
            () -> getOriginal().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability),
    }
        return getOriginal().getSchema();
        getOriginal().commit();
    public JDBCStatement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
    @Override
        throws SQLException
import java.util.Map;
        }
        }
            } catch (Throwable e) {
    @NotNull
        throws SQLException
        throws SQLException
    }
        if (savepoint instanceof JDBCSavepointImpl) {
                    }
    public Savepoint setSavepoint()
    {
            }
            throw new JDBCException(e, getExecutionContext());
    }
    public JDBCCallableStatement prepareCall(String sql)
        }
        if (isLoggingEnabled()) {
 *
                    connection.clearWarnings();
    }
                        throw e;

    @Override
    @Override
    }
        );
import org.jkiss.dbeaver.model.exec.DBCException;

                    // Call syntax not supported. Let's try t execute it as a regular query
                    statement.setQueryString(sqlQuery);
        throws SQLException
                        return prepareStatement(sqlQuery);
    {
