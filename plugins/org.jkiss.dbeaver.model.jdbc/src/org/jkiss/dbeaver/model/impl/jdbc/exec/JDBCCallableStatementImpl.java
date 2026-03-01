    public byte getByte(String parameterName)
    {
    public void setBlob(String parameterName, InputStream inputStream)
    }
import java.sql.Date;
    }
        getOriginal().setCharacterStream(parameterName, reader, length);

    }

            }
    public void setSQLXML(String parameterName, SQLXML xmlObject)
            final List<DBSProcedureParameter> outputParams = new ArrayList<>();

            return null;
    {
        // Find procedure definition
                        final DBPDataKind dataKind = JDBCUtils.resolveDataKind(dataSource, paramsMeta.getParameterTypeName(index), paramsMeta.getParameterType(index));

            }
        return getOriginal().getClob(parameterIndex);
    @Override
            return null;
        throws SQLException
    public Blob getBlob(int parameterIndex)
    }
    }
    @Override
            return null;
        throws SQLException
        }
        try {
        try {
        if (!(session.getDataSource() instanceof DBSObjectContainer)) {

            return null;

        throws SQLException
    public String getNString(int parameterIndex)
    }
        handleStatementBind(parameterName, xmlObject);
    @Override
    }
    {
    public void setNClob(String parameterName, Reader reader)
    public void setClob(String parameterName, Reader reader, long length)
                for (int index = 0; index < parameterCount; index++) {
    @Override
    {
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    @Override
    {
    @Override
    }
    }
 *
        procResults = new JDBCResultSetCallable(getConnection(), this);
        return getOriginal().getSQLXML(parameterIndex);
        handleStatementBind(parameterName, null);
        throws SQLException

    }
            if (selectedObjects.length > 0 && selectedObjects[selectedObjects.length - 1] instanceof DBSObjectContainer) {
    }
        throws SQLException



    @Override
        handleStatementBind(parameterName, x);
    {
    public void setBlob(String parameterName, InputStream inputStream, long length)
    }
                if (procedure != null) {
        throws SQLException
            for (DBSProcedureParameter param : params) {
            if (paramsMeta != null) {
        throws SQLException
        throws SQLException
    @Override
    @Override
                String procName = matcher.group(1);
    }
    }

            container = (DBSObjectContainer) session.getDataSource();
        getOriginal().registerOutParameter(parameterName, sqlType);
    {
    public void setInt(String parameterName, int x)
 *
    public Reader getNCharacterStream(String parameterName)
    @Override
    @Override
    @Override
            return;
                        index++;
        throws SQLException


                    }
                int outParameters = 0;

        getOriginal().registerOutParameter(parameterName, sqlType, typeName);
 */
    public Timestamp getTimestamp(String parameterName)
                return Collections.emptyList();
    public void setTimestamp(String parameterName, Timestamp x, Calendar cal)

 */
    }
    ////////////////////////////////////////////////////////
    }
        throws SQLException
    @Override
    @Override
    {
    }
        getOriginal().setNCharacterStream(parameterName, value);
        handleStatementBind(parameterName, x);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        throws SQLException
        throws SQLException
    public Object getObject(String parameterName)
    public boolean nextResults() throws DBCException {
    {
import org.jkiss.code.Nullable;
    }
        return getOriginal().getDate(parameterName, cal);


    {
    @Override
    {
        DBSObjectContainer container = (DBSObjectContainer) session.getDataSource();
        handleStatementBind(parameterName, reader);
    @Override



    }
    @Override
    {
            try {
        return null;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    public long getLong(int parameterIndex)
        throws SQLException

    }
        throws SQLException
import org.jkiss.dbeaver.model.exec.DBCSession;
    public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
    public void setNClob(String parameterName, NClob value)
        }
    @Override
 * You may obtain a copy of the License at
        return getOriginal().getRef(parameterName);
    }
    {
                log.debug("Error binding procedure output parameters", e1);
        if (procedure == null) {
        }
    {

    }
        throws SQLException
                }
        return getOriginal().getObject(parameterIndex);

        return getOriginal().getNString(parameterIndex);
        handleStatementBind(parameterName, reader);
    }
        return getOriginal().getByte(parameterName);
    @Override
        return getOriginal().getObject(parameterName);
                    outputParams.add(index);


    }
        return getOriginal().getNClob(parameterName);

    public Blob getBlob(String parameterName)
    {
import org.jkiss.dbeaver.Log;
        getOriginal().setShort(parameterName, x);
            }
    @Override
        return getOriginal().getNCharacterStream(parameterName);

    {
    @Override
    {
        getOriginal().setInt(parameterName, x);
    @Override
        return getOriginal().getClob(parameterName);
        getOriginal().setBoolean(parameterName, x);

    {

    }

    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    }
    public Array getArray(int parameterIndex)
    }
    {
    {

        throws SQLException
        }
    public void setAsciiStream(String parameterName, InputStream x, int length)
            // Try to bind parameters from procedure meta info

    ////////////////////////////////////////////////////////////////////
        return getOriginal().getDate(parameterIndex, cal);
                    return findProcedureByNames(session, procName);
    // Output parameters mapping
    @Override
    @Override
    @Override
        throws SQLException
            log.debug("Error obtaining output parameters from procedure: " + e.getMessage());
        throws SQLException
    }
    }
    {
    }
        return getOriginal().getBigDecimal(parameterIndex);
    public Array getArray(String parameterName)
    {
        handleStatementBind(parameterName, x);
        return getOriginal().getBigDecimal(parameterName);

    public void setRowId(String parameterName, RowId x)
        handleStatementBind(parameterName, x);
    // JDBC Callable Statement overrides

            return dataSource.getInfo().supportsMultipleResults() && parameterMetaData != null && parameterMetaData.getParameterType(parameterIndex) == Types.REF_CURSOR;
    }
    public void setBigDecimal(String parameterName, BigDecimal x)

        getOriginal().setNClob(parameterName, reader, length);
    public Ref getRef(int parameterIndex)
    {
    {

    {
    public Ref getRef(String parameterName)
        throws SQLException
    {
    public Time getTime(String parameterName)
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCCallableStatement;
    }

    {

        @NotNull JDBCSession connection,
                if (procedure != null && paramsCount == 0 && hasOutputParameters()) {
 * Licensed under the Apache License, Version 2.0 (the "License");

    {

        throws SQLException
    }
        getOriginal().setBigDecimal(parameterName, x);
            return outputParams;
    public URL getURL(String parameterName)
        return getOriginal().getObject(parameterName, type);
        } else if (metaOutputParameters != null) {
        throws SQLException
    {
        throws SQLException

    @Override
    public float getFloat(int parameterIndex)
                }
                procResults.addColumn(param.getName(), param.getParameterType(), localIndex++, jdbcOutputParameters.get(index));
    @Override
        getOriginal().setURL(parameterName, val);
    @Override

    }
    @Override
            }
    private int bindProcedureFromJDBC(@NotNull ParameterMetaData paramsMeta) throws DBException {
        handleStatementBind(parameterName, reader);
                }
                    final DBSDataType dataType = dataSource.getLocalDataType(paramsMeta.getParameterTypeName(index));
    @Override
    }
    @Override
    {
    {
        throws SQLException
    public void setTimestamp(String parameterName, Timestamp x)
        getOriginal().setDate(parameterName, x);
        return getOriginal().getArray(parameterName);
    {

        return getOriginal().getTime(parameterIndex, cal);
        throws SQLException
                    if (isParameterCursor(dataSource, paramsMeta, index)) {
    }
        return getOriginal().getBlob(parameterIndex);

        throws SQLException
    }
    {
            if (count == 0) {
    {
    ////////////////////////////////////////////////////////////////////
    {
    @Override
import java.util.regex.Matcher;
    }
    {
    }

    @Override
    {
    public void registerOutParameter(String parameterName, int sqlType, String typeName)
        getOriginal().setTimestamp(parameterName, x, cal);
    {
        try {
    public void registerOutParameter(String parameterName, int sqlType, int scale)
        getOriginal().setDate(parameterName, x, cal);
        throws SQLException
        handleStatementBind(parameterName, inputStream);
        handleStatementBind(parameterName, value);

    @Override
    @Override
    }
    public float getFloat(String parameterName)
                int paramsCount = bindProcedureFromJDBC(paramsMeta);
        getOriginal().setString(parameterName, x);
        // Bind procedure parameters
        throws SQLException
    }
    {
    }
            if (matcher.find()) {
    @Override
        handleStatementBind(parameterName, x);
import java.sql.*;
    }
    }
    @Override
    @Override
        return getOriginal().getFloat(parameterIndex);
public class JDBCCallableStatementImpl extends JDBCPreparedStatementImpl<CallableStatement> implements JDBCCallableStatement {
    {
    @Override

    {
        throws SQLException
                    return null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
    public BigDecimal getBigDecimal(String parameterName)
    {
 * you may not use this file except in compliance with the License.
    public void setNull(String parameterName, int sqlType)
            // If database supports multiple results and parameter is cursor, then it will be in a separate result set
    }
        getOriginal().setBinaryStream(parameterName, x);
        throws SQLException
    }
    public void setNString(String parameterName, String value)
        final JDBCDataSource dataSource = connection.getDataSource();
    @Override
    }
        handleStatementBind(parameterName, x);
        throws SQLException
        if (procedure == null) {
                procResults.addColumn(param.getName(), param.getParameterType(), index, index + 1);
    @Override
        handleStatementBind(parameterName, null);
    public Time getTime(int parameterIndex, Calendar cal)
        throws SQLException
    }

    {
    public JDBCCallableStatementImpl(
        handleStatementBind(parameterName, x);
    private final JDBCResultSetCallable procResults;
    }
        throws SQLException
    @Override
        getOriginal().setTime(parameterName, x);
    {
import java.io.Reader;
    @Override

    @Override
    }
    }
            log.debug("Error obtaining output parameters from metadata: " + e.getMessage());
        throws SQLException
    public String getNString(String parameterName)
        try {
    {
    public void setCharacterStream(String parameterName, Reader reader)
    public void setShort(String parameterName, short x)
                    return findProcedureByNames(session, procName.split("\\" + divChar));
        throws SQLException
    public double getDouble(int parameterIndex)

    public Clob getClob(String parameterName)
    {
        throws SQLException
        return getOriginal().getTime(parameterName);
    @Override
        throws SQLException
    @Override
    public int getInt(String parameterName)
        if (names.length == 1) {
            log.debug(e);
    public void setBlob(String parameterName, Blob x)
    public Time getTime(String parameterName, Calendar cal)
    public void setBoolean(String parameterName, boolean x)
    public void setCharacterStream(String parameterName, Reader reader, long length)
        throws SQLException
        }
        throws SQLException
    {
            log.debug("Can't obtain procedure metadata nor jdbc metadata");
        return getOriginal().getNClob(parameterIndex);
 * Stores information about execution in query manager and operated progress monitor.
                if (procName.indexOf(divChar) != -1) {
    }
    @Override
        throws SQLException
        throws SQLException
 * DBeaver - Universal Database Manager
    public void setTime(String parameterName, Time x, Calendar cal)
    {
        return getOriginal().getBytes(parameterName);
    {
        throws SQLException
    @Deprecated

            // Try to make columns from parameters meta
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
        throws SQLException
            ParameterMetaData paramsMeta = getOriginal().getParameterMetaData();
    public void registerOutParameter(int parameterIndex, int sqlType)
    @Override
    @Override
                }
                }
        }
    public short getShort(int parameterIndex)
    {


    }
        handleStatementBind(parameterName, x);
        getOriginal().setObject(parameterName, x, targetSqlType, scale);
                        procResults.addColumn(String.valueOf(index), dataKind, localIndex++, index);
    {
    }
        handleStatementBind(parameterName, x);
    {
    {
    }

        return getOriginal().getObject(parameterIndex, type);
    public Object getObject(int parameterIndex)
        return getOriginal().getBoolean(parameterIndex);
    @Override

            return;
            throw new DBException("Error binding callable statement parameters from metadata: " + e.getMessage(), e);
    public void registerOutParameter(int parameterIndex, int sqlType, String typeName)
    public short getShort(String parameterName)
    {
    }

            }

    @Override
            return false;
        handleStatementBind(parameterName, x);
    public Object getObject(int parameterIndex, Map<String, Class<?>> map)
    {
                int index = 0;
    public void setObject(String parameterName, Object x, int targetSqlType, int scale)
        return getOriginal().getBoolean(parameterName);
    @Override
import org.jkiss.dbeaver.model.struct.DBSDataType;
        getOriginal().setBinaryStream(parameterName, x, length);
    public boolean executeStatement() throws DBCException {
    @Override
        throws SQLException
    public NClob getNClob(String parameterName)
        handleStatementBind(parameterName, inputStream);
        throws SQLException
    }
                    container = (DBSObjectContainer) child;
        if (metaOutputParameters == null && jdbcOutputParameters == null) {

                        registerOutParameter(index, param.getParameterType().getTypeID());
    }
    public RowId getRowId(int parameterIndex)

        handleStatementBind(parameterName, reader);
    {
        throws SQLException
    {
    @Nullable
        return getOriginal().getTimestamp(parameterIndex, cal);
    ////////////////////////////////////////////////////////////////////
                        outParameters++;
    public Timestamp getTimestamp(String parameterName, Calendar cal)
    @Override
        return getOriginal().getNCharacterStream(parameterIndex);

            return false;
        handleStatementBind(parameterName, x);
    @Override
    {
                }
    }
    @Override
    {
                    continue;

    public boolean getBoolean(String parameterName)
                final int mode = paramsMeta.getParameterMode(index);
    }
        getOriginal().setObject(parameterName, x, targetSqlType);
                final DBSProcedureParameter param = metaOutputParameters.get(index);

    @Override
                    return true;
    }

    public void setDate(String parameterName, Date x)
    }
        return getOriginal().getBigDecimal(parameterIndex, scale);
    @Override
        throws SQLException

        if (!CommonUtils.isEmpty(params)) {

        throws SQLException
        return super.executeStatement() || procResults.getColumnCount() > 0;
    }
    @Nullable
    }
            return outputParams;
import org.jkiss.dbeaver.model.DBPDataSource;
    }
            return ((DBSProcedureContainer) container).getProcedure(session.getProgressMonitor(), DBObjectNameCaseTransformer.transformName(session.getDataSource(), names[names.length - 1]));



    }
        if (!CommonUtils.isEmpty(queryString)) {
                if (isParameterCursor(dataSource, paramsMeta, jdbcOutputParameters.get(index))) {
        throws SQLException

    }
    private static final Pattern EXEC_PATTERN = Pattern.compile("[\\w_\\.]+\\s+([^(]+)\\s*\\(");
    {
        throws SQLException
    }
    public void setCharacterStream(String parameterName, Reader reader, int length)
    public String getString(String parameterName)
                }
    ////////////////////////////////////////////////////////
            }
        getOriginal().setNull(parameterName, sqlType, typeName);
    @Override
    public void setBytes(String parameterName, byte[] x)
        throws SQLException
 * limitations under the License.
            Collection<? extends DBSProcedureParameter> params = procedure.getParameters(getConnection().getProgressMonitor());
import java.util.*;
                }
    }
        handleStatementBind(parameterName, x);
    @Override
    }
            paramsMeta = getOriginal().getParameterMetaData();
    @Override
import org.jkiss.code.NotNull;
        getOriginal().registerOutParameter(parameterIndex, sqlType, scale);
        handleStatementBind(parameterName, x);
    @Override
    }

        getOriginal().setBlob(parameterName, inputStream);
        final JDBCResultSet resultSet = makeResultSet(getOriginal().getResultSet());
            if (!CommonUtils.isEmpty(params)) {
    ////////////////////////////////////////////////////////////////////
        throws SQLException

                if (CommonUtils.isEmpty(childName)) {
    public byte getByte(int parameterIndex)
    {
            if (parameterCount > 0) {
                        procResults.addColumn(String.valueOf(index), dataType, localIndex++, index);
        final List<Integer> jdbcOutputParameters = getOutputParametersFromJDBC(paramsMeta);
    {
    private static DBSProcedure findProcedureByNames(@NotNull DBCSession session, @NotNull String... names) throws DBException {
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCObjectSupplier;
/**
import java.io.InputStream;
        return getOriginal().getRowId(parameterName);
    }
        throws SQLException

        }
        return getOriginal().getCharacterStream(parameterIndex);
    @Override
    @Override
        } catch (DBException e) {
        return getOriginal().getByte(parameterIndex);
    @Override
        } catch (SQLException e) {
import java.net.URL;
        return getOriginal().getInt(parameterName);
    }
        }
    }
    {
    @Override
    }
                if (child instanceof DBSObjectContainer) {
    @Nullable
        throws SQLException
        handleStatementBind(parameterName, value);
        getOriginal().setClob(parameterName, reader);
        }
    @Override
            for (int i = 0; i < names.length - 1; i++) {
    {

        throws SQLException
        handleStatementBind(parameterName, val);
    public String getString(int parameterIndex)
    }
                }
    @Override
        handleStatementBind(parameterName, x);
                    if (parameterMode == ParameterMetaData.parameterModeOut || parameterMode == ParameterMetaData.parameterModeInOut) {
            }
        throws SQLException
        throws SQLException
            try {
        return getOriginal().getURL(parameterName);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
            final Collection<? extends DBSProcedureParameter> params = procedure.getParameters(getConnection().getProgressMonitor());
        throws SQLException
    public void registerOutParameter(int parameterIndex, int sqlType, int scale)
        getOriginal().setCharacterStream(parameterName, reader);
    public JDBCResultSet getResultSet() throws SQLException {
    {
        throws SQLException
                        bindProcedureFromMeta();
        throws SQLException
        throws SQLException
    @Override

    @Override
    @Override
        getOriginal().setTime(parameterName, x, cal);



        throws SQLException
        throws SQLException
        handleStatementBind(parameterName, x);
        throws SQLException

    }

    {


    }
    {

    }
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
    // Output parameters mapping
            for (int index = 0, localIndex = 0; index < metaOutputParameters.size(); index++) {
        return getOriginal().getBytes(parameterIndex);
                    }
        handleStatementBind(parameterName, x);
        return getOriginal().getRef(parameterIndex);
        }
    }
        throws SQLException
    public int getInt(int parameterIndex)
    }
        throws SQLException

    public void setObject(String parameterName, Object x, int targetSqlType)
    public BigDecimal getBigDecimal(int parameterIndex, int scale)
        getOriginal().setFloat(parameterName, x);
    public Reader getCharacterStream(String parameterName)
        @Nullable String query,
    }
    @Override
        getOriginal().setRowId(parameterName, x);
        return getOriginal().getTime(parameterName, cal);
    @Override
    }

            }
                int localIndex = 0;
                    outputParams.add(param);
        throws SQLException
    public Date getDate(String parameterName, Calendar cal)
            }
    @Override

        throws SQLException
        return getOriginal().getCharacterStream(parameterName);
        throws SQLException
    {
                    } else {
    {
    }
    @Override
        try {
    public void setNCharacterStream(String parameterName, Reader value)
    {
package org.jkiss.dbeaver.model.impl.jdbc.exec;
 * Manageable base statement.
        getOriginal().setBlob(parameterName, x);
    }
        } catch (SQLException e) {
        super(connection, stmtSupplier, query, disableLogging);
        }
        try {

        procResults.addRow();
    {
    public void setAsciiStream(String parameterName, InputStream x, long length)

    public byte[] getBytes(String parameterName)
        throws SQLException
                DBSObject child = container.getChild(
 * See the License for the specific language governing permissions and


    }
    public NClob getNClob(int parameterIndex)
        @NotNull JDBCObjectSupplier<CallableStatement> stmtSupplier,
        return getOriginal().getDate(parameterIndex);
        handleStatementBind(parameterName, x);
    }
        return getOriginal().getURL(parameterIndex);
            for (int index = 1; index <= count; index++) {
    public void setByte(String parameterName, byte x)
    {
    @Override
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;

        getOriginal().registerOutParameter(parameterIndex, sqlType);
        throws SQLException

            int parameterCount = paramsMeta.getParameterCount();
    public double getDouble(String parameterName)
    @Override
            procedure = findProcedure(connection, query);
    }
    {
        return getOriginal().getTimestamp(parameterName, cal);

                final DBSProcedureParameter param = metaOutputParameters.get(index);
    @Override
        DBPDataSource dataSource = session.getDataSource();
    @Override
    public SQLXML getSQLXML(int parameterIndex)
    @Override
    public void setObject(String parameterName, Object x)

        return super.nextResults() || procResults.getColumnCount() > 0;

    }
    {
    public Date getDate(int parameterIndex, Calendar cal)

            }
        throws SQLException
        return getOriginal().getDate(parameterName);
    }
    @Override
    @Override

    {
            log.debug("Error extracting parameters meta data", e);
        getOriginal().setBytes(parameterName, x);
    }
                } else {
        throws SQLException
        return getOriginal().getDouble(parameterIndex);
    public Timestamp getTimestamp(int parameterIndex)
        handleStatementBind(parameterName, x);
        getOriginal().registerOutParameter(parameterName, sqlType, scale);
    @Override
    {

        throws SQLException
    {

                log.debug("Error extracting parameters meta data", e);
import org.jkiss.dbeaver.DBException;

    @Override
    {

        handleStatementBind(parameterName, value);
        return getOriginal().getNString(parameterName);
        throws SQLException
        throws SQLException
        getOriginal().setBlob(parameterName, inputStream, length);
        throws SQLException
        }
    {
}    @Override
        return getOriginal().getString(parameterIndex);
        boolean disableLogging
        throws SQLException
        handleStatementBind(parameterName, x);
    public void setString(String parameterName, String x)
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public void setTime(String parameterName, Time x)

                }
    @Override
    @Override
        getOriginal().setNCharacterStream(parameterName, value, length);

        throws SQLException
    {
    public Date getDate(int parameterIndex)
    {
        throws SQLException


    {
    public URL getURL(int parameterIndex)

    @Override
        }


        getOriginal().setBinaryStream(parameterName, x, length);
    {
import java.util.regex.Pattern;

    }
        return getOriginal().getBlob(parameterName);
        throws SQLException
    @Override



    {
        handleStatementBind(parameterName, x);

    public byte[] getBytes(int parameterIndex)
    }

    {
                    if (dataType == null) {
        handleStatementBind(parameterName, x);

import org.jkiss.dbeaver.model.DBPDataKind;
        throws SQLException
    {
        throws SQLException
        throws SQLException
    public void setClob(String parameterName, Reader reader)
        return getOriginal().getTimestamp(parameterIndex);
            throw new DBException("Error binding callable statement parameters", e);
    public Date getDate(String parameterName)
        } catch (Throwable ignored) {
    @Override

        } catch (Throwable e) {
    {
    public Time getTime(int parameterIndex)
                    bindProcedureFromMeta();

        throws SQLException
    }
    public void setNull(String parameterName, int sqlType, String typeName)
        throws SQLException
    {
        handleStatementBind(parameterName, x);
        ParameterMetaData paramsMeta = null;


            }
        throws SQLException
                    }
    private List<DBSProcedureParameter> getOutputParametersFromMeta() {

 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        getOriginal().setSQLXML(parameterName, xmlObject);
        throws SQLException
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        throws SQLException
                return Collections.emptyList();
    @Override
        throws SQLException
                for (DBSProcedureParameter param : params) {
    public void setFloat(String parameterName, float x)
    public void registerOutParameter(String parameterName, int sqlType)
    @Override

    {
        throws SQLException
        handleStatementBind(parameterName, x);
import org.jkiss.utils.CommonUtils;

    @Override
    public void setNCharacterStream(String parameterName, Reader value, long length)
    public void setClob(String parameterName, Clob x)
        return getOriginal().getDouble(parameterName);
                    try {
    @Override
    public void setBinaryStream(String parameterName, InputStream x, long length)
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
        getOriginal().setTimestamp(parameterName, x);
        return getOriginal().getSQLXML(parameterName);
    }
            return parameterCount;
        handleStatementBind(parameterName, reader);
    @Override
    public void setURL(String parameterName, URL val)
        } else {
    {
        throws SQLException
    {
                    } catch (Throwable e) {
    }
    public void setDate(String parameterName, Date x, Calendar cal)
        return getOriginal().getLong(parameterIndex);
    @Override

        return getOriginal().getFloat(parameterName);
        handleStatementBind(parameterName, reader);
                container = (DBSObjectContainer) selectedObjects[selectedObjects.length - 1];
        return getOriginal().getInt(parameterIndex);
                }
                    DBObjectNameCaseTransformer.transformName(session.getDataSource(), childName));
        throws SQLException
        throws SQLException
        getOriginal().registerOutParameter(parameterIndex, sqlType, typeName);
        throws SQLException
            if (CommonUtils.isEmpty(params)) {
    }
        throws SQLException
        getOriginal().setClob(parameterName, x);
        return getOriginal().getString(parameterName);
    public void setDouble(String parameterName, double x)
            return null;
            for (int index = 0; index < metaOutputParameters.size(); index++) {
 * Unless required by applicable law or agreed to in writing, software
    public SQLXML getSQLXML(String parameterName)
    {
    public boolean getBoolean(int parameterIndex)
    @Override

    public Clob getClob(int parameterIndex)
    {
    }
    }
                    return null;
                        log.debug("Error binding procedure output parameters", e);
    {
        handleStatementBind(parameterName, x);
    {
    }
    public BigDecimal getBigDecimal(int parameterIndex)
    private static DBSProcedure findProcedure(DBCSession session, String queryString) throws DBException {
    public void setBinaryStream(String parameterName, InputStream x)
    }
        try {
    private static final Log log = Log.getLog(JDBCCallableStatementImpl.class);
        return getOriginal().getLong(parameterName);
    {
    {
                String childName = CommonUtils.trim(names[i]);
        } catch (SQLException e) {
    }
            DBSObject[] selectedObjects = DBUtils.getSelectedObjects(session.getExecutionContext());


    public void setLong(String parameterName, long x)
    {

        getOriginal().setAsciiStream(parameterName, x, length);
    }
        }
    }
    {
                        registerOutParameter(index + 1, paramsMeta.getParameterType(index + 1));
        }
                        continue;
            log.debug(e.getMessage());
        throws SQLException
        getOriginal().setClob(parameterName, reader, length);
        getOriginal().setObject(parameterName, x);
        throws SQLException
                    session.getProgressMonitor(),
        } else {
        getOriginal().setNClob(parameterName, value);
    }
        throws SQLException
        return resultSet != null ? resultSet : procResults;
    }
        handleStatementBind(parameterName, x);
    public void setNClob(String parameterName, Reader reader, long length)

            }
    }
        throws SQLException
    @Override

        throws SQLException
    private boolean hasOutputParameters() throws DBException {
        return getOriginal().getShort(parameterIndex);
        final List<DBSProcedureParameter> metaOutputParameters = getOutputParametersFromMeta();

    public RowId getRowId(String parameterName)
        Collection<? extends DBSProcedureParameter> params = procedure.getParameters(getConnection().getProgressMonitor());
    @Override
            }

        if (container instanceof DBSProcedureContainer) {
    }
        return false;
        }
        getOriginal().setAsciiStream(parameterName, x);
        throws SQLException
        throws SQLException
        throws SQLException
    {
        getOriginal().setByte(parameterName, x);
    public boolean wasNull()
    public void setAsciiStream(String parameterName, InputStream x)
        return null;
    ) throws SQLException {
    }

    public long getLong(String parameterName)
        getOriginal().setNClob(parameterName, reader);
        throws SQLException
    @Override
    }
    public Reader getNCharacterStream(int parameterIndex)
    private static boolean isParameterCursor(@NotNull DBPDataSource dataSource, @Nullable ParameterMetaData parameterMetaData, int parameterIndex) {
        handleStatementBind(parameterName, x);
    @Override
    }
                }
        return getOriginal().getObject(parameterName, map);

                } else {
            }
        return getOriginal().getTimestamp(parameterName);
        throws SQLException
        } catch (Throwable e) {
        handleStatementBind(parameterName, x);

        handleStatementBind(parameterName, value);
                    }
        throws SQLException
        try {
            final int count = paramsMeta.getParameterCount();
    }
                if (param.getParameterKind().isOutput()) {
        throws SQLException
        getOriginal().setNull(parameterName, sqlType);
        getOriginal().setNString(parameterName, value);
    @Override
import java.math.BigDecimal;

        throws SQLException

        getOriginal().setAsciiStream(parameterName, x, length);
    }
    // Procedure bindings
    {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            final List<Integer> outputParams = new ArrayList<>();
                if (mode == ParameterMetaData.parameterModeOut || mode == ParameterMetaData.parameterModeInOut) {
        return getOriginal().wasNull();
                    if (param.getParameterKind().isOutput()) {

            Matcher matcher = EXEC_PATTERN.matcher(queryString);
        handleStatementBind(parameterName, x);
        if (paramsMeta == null) {
    }
    @Override
        return getOriginal().getArray(parameterIndex);
        return getOriginal().getObject(parameterIndex, map);

    {
    @Override
    private List<Integer> getOutputParametersFromJDBC(@Nullable ParameterMetaData paramsMeta) {


        if (metaOutputParameters != null && jdbcOutputParameters != null && metaOutputParameters.size() == jdbcOutputParameters.size()) {
    @Override
    private void bindProcedureFromMeta() throws DBException {
            } catch (Throwable e1) {
        handleStatementBind(parameterName, reader);
    private DBSProcedure procedure;
                if (param.getParameterKind().isOutput()) {
        getOriginal().setDouble(parameterName, x);
        getOriginal().setCharacterStream(parameterName, reader, length);
    {

                char divChar = dataSource.getSQLDialect().getStructSeparator();
import org.jkiss.dbeaver.model.DBUtils;
    @Override
            for (DBSProcedureParameter param : params) {
                for (int index : jdbcOutputParameters) {
    public void setBinaryStream(String parameterName, InputStream x, int length)
    {
    @Override
        } catch (Throwable e) {
        return getOriginal().getShort(parameterName);
    @Override

        return getOriginal().getRowId(parameterIndex);
        return getOriginal().getTime(parameterIndex);
    public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
        }
    {
    {
    }
        getOriginal().setLong(parameterName, x);
                    int parameterMode = paramsMeta.getParameterMode(index + 1);
    {
        if (procedure == null) {
        throws SQLException
    }
 *
    public Timestamp getTimestamp(int parameterIndex, Calendar cal)
            }
                    }
    {
    }
    public Reader getCharacterStream(int parameterIndex)
    }

    public Object getObject(String parameterName, Map<String, Class<?>> map)
    }

                return outParameters;
    @Override
    @Override
        throws SQLException

        throws SQLException
    {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

            } catch (Throwable e) {
    }
    @Override
