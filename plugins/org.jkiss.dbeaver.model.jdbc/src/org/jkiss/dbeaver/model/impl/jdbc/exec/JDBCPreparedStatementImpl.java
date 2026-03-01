        throws SQLException
    ////////////////////////////////////////////////////////////////////
        this.beforeExecute();
        } finally {

        handleStatementBind(parameterIndex, x);
    @Override
 */
    public String getFormattedQuery() {
        getOriginal().setObject(parameterIndex, x);

            }
        }
    @Override
        getOriginal().setURL(parameterIndex, x);
        handleStatementBind(parameterIndex, x);

import org.jkiss.dbeaver.Log;
    public ParameterMetaData getParameterMetaData()
    @Override
        } else {

    public void setTimestamp(

            return getOriginal().executeUpdate();

        getOriginal().setCharacterStream(parameterIndex, x, length);
    @Override
    }


    }
            String q = getQueryString();


        catch (SQLException e) {
        }
        throws SQLException
    }
    public void setTime(int parameterIndex, Time x)
    {

            paramMap.put(parameter, o);
                        // FIXME: process named parameters

        }
        throws SQLException
            return displayString;
    JDBCPreparedStatementImpl(
    public void setNull(int parameterIndex, int sqlType, String typeName)
    }
        if (value instanceof CharSequence) {
    public void setBlob(int parameterIndex, InputStream x, long length)
    @Override

        }

            }
    private Map<Object, Object> paramMap;
                    }
    }
        throws SQLException
    public void setDate(int parameterIndex, Date x)
        return value.toString();
            int length = q.length();
    @Override
    @Override

        throws SQLException
    }
            }
    private static final Log log = Log.getLog(JDBCPreparedStatementImpl.class);
    @Override

        getOriginal().setNull(parameterIndex, sqlType);

    public void setCharacterStream(int parameterIndex, Reader reader, int length)

    @Override
                    DBConstants.NULL_VALUE_LABEL :


                            } else {
        if (paramMap != null) {
        handleStatementBind(parameterIndex, x);
        getOriginal().setTimestamp(parameterIndex, x);
    public void setObject(int parameterIndex, Object x, int targetSqlType)

    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
    {
        getOriginal().clearParameters();
        getOriginal().setClob(parameterIndex, x, length);
    @Override
    {
        return getOriginal().getParameterMetaData();

            return execute();
                paramMap = new LinkedHashMap<>();
    }
    @Override
    private static final Object NULL_VALUE = new Object();
 * limitations under the License.
 *


    public void setCharacterStream(int parameterIndex, Reader x)
        getOriginal().setAsciiStream(parameterIndex, x, length);

        throws SQLException
        handleStatementBind(parameterIndex, x);
        getOriginal().setNClob(parameterIndex, x);
    }
        handleStatementBind(parameterIndex, x);
    public void setBoolean(int parameterIndex, boolean x)
                        }

        handleStatementBind(parameterIndex, reader);
    }
    @Override
        throws SQLException
    public void setNClob(int parameterIndex, NClob x)
import org.jkiss.dbeaver.model.DBConstants;
        throws SQLException
                        }
        handleStatementBind(parameterIndex, x);
    @Override
        handleStatementBind(parameterIndex, x);
    }
                            }
    {
                o = new ContentParameter(connection, o);
    @Override
    }
        getOriginal().setObject(parameterIndex, x, targetSqlType, scaleOrLength);
    public void setArray(int parameterIndex, Array x)
        handleStatementBind(parameterIndex, x);
        throws SQLException
    }

            }
        handleStatementBind(parameterIndex, x);
        }
            if (value instanceof RowId rowId) {
    public void setURL(int parameterIndex, URL x)
            if (getSession().isLoggingEnabled()) {


            throw new DBCException(e, connection.getExecutionContext());
    // DBC Statement overrides
            super.afterExecute();
    {
                displayString = DBValueFormatting.formatBinaryString(
import org.jkiss.dbeaver.model.DBValueFormatting;
        handleStatementBind(parameterIndex, x);
    public void addToBatch() throws DBCException
        throws SQLException
        throws SQLException
 * Manageable prepared statement.
        handleStatementBind(parameterIndex, x);
    {
    {
        throws SQLException
        try {
            throw super.handleExecuteError(e);
        throws SQLException
    }
        handleStatementBind(parameterIndex, x);


    @Override
        boolean disableLogging
                    return SQLUtils.quoteString(connection.getDataSource(), formatterProfile.createFormatter(DBDDataFormatter.TYPE_NAME_DATE, null).formatValue(value));


import java.sql.*;
        if (isQMLoggingEnabled()) {

        throws SQLException

        }
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw super.handleExecuteError(e);
    }
    public JDBCResultSet executeQuery()
    ////////////////////////////////////////////////////////////////////
    public void setBytes(int parameterIndex, byte[] x)
                        Object paramValue = paramMap.get(paramIndex);
        throws SQLException





            paramMap.clear();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        super(connection, stmtSupplier, query, disableLogging);


        throws SQLException
    }
        throws SQLException
    }

    }
        handleStatementBind(parameterIndex, x);
    public void setString(int parameterIndex, String x)
 * Unless required by applicable law or agreed to in writing, software
            return "NULL";
    }
    }
        handleStatementBind(parameterIndex, x);
        ContentParameter(@NotNull JDBCSession session, Object value) {
            super.afterExecute();

    }
    }
        handleStatementBind(parameterIndex, x);
        throws SQLException

    }
    public void setNCharacterStream(int parameterIndex, Reader x)
        @NotNull JDBCObjectSupplier<STATEMENT> stmtSupplier,
    @Override
            if (paramMap == null) {
/*

    public void setLong(int parameterIndex, long x)

                    case '"': {

        getOriginal().setShort(parameterIndex, x);
import org.jkiss.code.NotNull;
 *
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
    }
        throws SQLException
import org.jkiss.dbeaver.model.sql.DBSQLException;
                                c = c2;
            try {
    }
    @Override
        getOriginal().setRowId(parameterIndex, x);
        handleStatementBind(parameterIndex, x);

        handleStatementBind(parameterIndex, x);

                            formatted.append(formatParameterValue(paramValue));
        } else if (value == NULL_VALUE) {
    {
    {
    public void setNClob(int parameterIndex, Reader x)
    }

                formatted.append(c);
    @Override
    @Override
    @Override

    }
    }

        getOriginal().setAsciiStream(parameterIndex, x);

        @NotNull JDBCSession connection,
    @Override
    {
        this.beforeExecute();
    @Override
    @Override
import java.io.InputStream;
    public void setDate(int parameterIndex, Date x, Calendar cal)
    public void setCharacterStream(int parameterIndex, Reader x, long length)
        getOriginal().setBlob(parameterIndex, x);

    {
    {
    @Override
                    }

        handleStatementBind(parameterIndex, x);

        getOriginal().setNCharacterStream(parameterIndex, x);
        handleStatementBind(parameterIndex, x);
        throws SQLException
        throws SQLException
        handleStatementBind(parameterIndex, x);
    {
                    session.getDataSource(), bytes, DBDDisplayFormat.NATIVE, true);
        handleStatementBind(parameterIndex, null);
    public void setRowId(int parameterIndex, RowId x)
                        for (int k = i + 1; k < length; k++) {

        throws SQLException
        handleStatementBind(parameterIndex, x);
    @NotNull
        throws SQLException
        getOriginal().setBinaryStream(parameterIndex, x, length);

            if (o == null) {
        throws SQLException
        catch (SQLException e) {
    }
    {
        handleStatementBind(parameterIndex, x);

/**
        getOriginal().setTimestamp(parameterIndex, x, cal);
        throws SQLException


                DBDDataFormatterProfile formatterProfile = getSession().getDataFormatterProfile();

    }
        getOriginal().setCharacterStream(parameterIndex, reader, length);
    {
    {
        handleStatementBind(parameterIndex, xmlObject);
                displayString = SQLUtils.quoteString(session.getDataSource(), new String(rowId.getBytes()));
        }
                QMUtils.getDefaultHandler().handleStatementBind(this, parameter, o);
    }
    }

        try {

    public void setFloat(int parameterIndex, float x)
                        formatted.append(c);
        handleStatementBind(parameterIndex, x);
        throws SQLException
                char c = q.charAt(i);

    @Deprecated

                } else if (value instanceof Time) {
        @Nullable String query,
    @Override
    @Override
        }
    {
                        break;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            } catch (Exception e) {

    }
    {
    // Statement overrides
    public int executeUpdate()
import org.jkiss.dbeaver.model.data.DBDDataFormatter;


    {
        getOriginal().setBigDecimal(parameterIndex, x);

package org.jkiss.dbeaver.model.impl.jdbc.exec;
        throws SQLException
        } catch (Throwable e) {
    }
    @Override
            }


    @Override
    }
    public ResultSetMetaData getMetaData()
    }
    {

        getOriginal().setNString(parameterIndex, x);

    {

        throws SQLException
            throw new DBSQLException(query, e, connection.getExecutionContext());
        } catch (Throwable e) {
            if (q == null) {
    public void setByte(int parameterIndex, byte x)
import java.net.URL;
        throws SQLException
        getOriginal().setBlob(parameterIndex, x);
        handleStatementBind(parameterIndex, x);
    {
        throws SQLException

    }
    @Override
        }
        throws SQLException
        getOriginal().setClob(parameterIndex, x);
    {
        getOriginal().setArray(parameterIndex, x);
    ////////////////////////////////////////////////////////////////////
    public void setClob(int parameterIndex, Reader x, long length)
                    case '\'':
    public void setObject(int parameterIndex, Object x)
    public boolean execute()
            return getQueryString();
        getOriginal().setLong(parameterIndex, x);


    @Override
        getOriginal().setNull(parameterIndex, sqlType, typeName);
        getOriginal().setBinaryStream(parameterIndex, x);
 * You may obtain a copy of the License at
        } else if (value instanceof java.util.Date) {
    @Override
                    case ':': {
        handleStatementBind(parameterIndex, x);
            } else {
            }
                return "";
    {
        handleStatementBind(parameterIndex, x);
        try {
    public void setAsciiStream(int parameterIndex, InputStream x, long length)
            // Save parameters

    public void setUnicodeStream(int parameterIndex, InputStream x, int length)
                    value.getClass().getSimpleName()) + ")";
                    case '?': {
        throws SQLException
    {
        throws SQLException
        getOriginal().setByte(parameterIndex, x);
    {
        handleStatementBind(parameterIndex, x);
        getOriginal().setRef(parameterIndex, x);
        if (paramMap == null) {
    protected static class ContentParameter {
            addBatch();
        throws SQLException
        getOriginal().setBlob(parameterIndex, x, length);
        }
    @Override
    {
import java.util.Map;
        throws SQLException
                } else {
        return getOriginal().getMetaData();

    private String formatParameterValue(Object value) {
        handleStatementBind(parameterIndex, x);
    {
    @Override


        handleStatementBind(parameterIndex, x);
        throws SQLException
    }
    {
    {
    public void setNull(int parameterIndex, int sqlType)
import org.jkiss.code.Nullable;
        getOriginal().setObject(parameterIndex, x, targetSqlType);
import java.io.Reader;
    }

    @Override

                    return SQLUtils.quoteString(connection.getDataSource(), formatterProfile.createFormatter(DBDDataFormatter.TYPE_NAME_TIME, null).formatValue(value));
    public void setAsciiStream(int parameterIndex, InputStream x)
        throws SQLException

        handleStatementBind(parameterIndex, x);

    @Override
                        break;
                    return SQLUtils.quoteString(connection.getDataSource(), formatterProfile.createFormatter(DBDDataFormatter.TYPE_NAME_TIMESTAMP_TZ, null).formatValue(value));


                        if (paramValue != null) {
}
    {
    public void setTime(int parameterIndex, Time x, Calendar cal)
    public boolean executeStatement()
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public void close() {
                }
        getOriginal().setClob(parameterIndex, x);
    {
    {
                displayString = "DATA(" + (value == null ?
    {
        getOriginal().setCharacterStream(parameterIndex, x);

    }
    public void setBigDecimal(int parameterIndex, BigDecimal x)
        getOriginal().setAsciiStream(parameterIndex, x, length);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        getOriginal().setBinaryStream(parameterIndex, x, length);
        throws SQLException
    @Override
            return createResultSetImpl(getOriginal().executeQuery());
    public void setSQLXML(int parameterIndex, SQLXML xmlObject)


    @Override
        handleStatementBind(parameterIndex, null);
    }
                if (value instanceof Date) {
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        getOriginal().setString(parameterIndex, x);
        getOriginal().setDate(parameterIndex, x, cal);
    public void setShort(int parameterIndex, short x)

            return SQLUtils.quoteString(connection.getDataSource(), value.toString());
        throws SQLException
    @Override
 */
                            if (c2 == c && q.charAt(k - 1) != '\\') {
import java.math.BigDecimal;
        throws SQLException
    @Override
        getOriginal().setInt(parameterIndex, x);

    {
 * DBeaver - Universal Database Manager
                                break;
        handleStatementBind(parameterIndex, x);
        handleStatementBind(parameterIndex, x);

                                i = k;
    {
        throws SQLException
        }
        getOriginal().setDouble(parameterIndex, x);
    public void setBinaryStream(int parameterIndex, InputStream x, int length)
    ) throws SQLException {


    {
        getOriginal().setBytes(parameterIndex, x);
            return formatted.toString();
    }

    @Override
        try {

        String displayString;
                            continue;
    }
        throws SQLException
        throws SQLException
            for (int i = 0; i < length; i++) {
        }
    {

        getOriginal().setSQLXML(parameterIndex, xmlObject);
    }
                    }

        handleStatementBind(parameterIndex, x);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCObjectSupplier;
    public void setRef(int parameterIndex, Ref x)
    {
    @Override
        } catch (Throwable e) {
        handleStatementBind(parameterIndex, x);
        getOriginal().setNClob(parameterIndex, x);
    }
 * you may not use this file except in compliance with the License.
    {
        handleStatementBind(parameterIndex, x);
    @Override
        getOriginal().addBatch();
                }
    @Override
    public void setDouble(int parameterIndex, double x)
        handleStatementBind(parameterIndex, x);
        throws SQLException
    {
            int paramIndex = 0;
                        break;
        handleStatementBind(parameterIndex, x);
    public void setNClob(int parameterIndex, Reader x, long length)
                log.debug("Error formatting date [" + value + "]", e);

        this.beforeExecute();
    }
        handleStatementBind(parameterIndex, x);
    @Override
        try {
        getOriginal().setFloat(parameterIndex, x);
    public void clearParameters()
        handleStatementBind(parameterIndex, x);


        } finally {
    }
        getOriginal().setNClob(parameterIndex, x, length);

    }
    public void setInt(int parameterIndex, int x)
    public void setBinaryStream(int parameterIndex, InputStream x)
                        paramIndex++;
                // Wrap complex things

    }
 *
        throws SQLException
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
        throws SQLException
    }
 * See the License for the specific language governing permissions and
    {
        getOriginal().setDate(parameterIndex, x);
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        getOriginal().setBoolean(parameterIndex, x);
    {
    }
        super.close();
        throws SQLException
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength)
    ////////////////////////////////////////////////////////////////////
            StringBuilder formatted = new StringBuilder(length * 2);

    @Override
            } else if (!DBUtils.isAtomicParameter(o)) {
    @Override

    }
 * Stores information about execution in query manager and operated progress monitor.
import org.jkiss.dbeaver.model.qm.QMUtils;
    {
            return DBValueFormatting.convertNumberToNativeString((Number) value, false);

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
            throw super.handleExecuteError(e);
    {
        throws SQLException
import java.util.LinkedHashMap;
    @Override

        throws SQLException
    @Override

            super.afterExecute();
    public void setNString(int parameterIndex, String x)
        @Override
            }
    {
    {
import java.util.Calendar;
    {
        int parameterIndex, Timestamp x)
    }
    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length)
import org.jkiss.dbeaver.model.DBUtils;
        getOriginal().setTime(parameterIndex, x);
    public void setBlob(int parameterIndex, InputStream x)
    {
    protected void handleStatementBind(Object parameter, @Nullable Object o)
                switch (c) {
    {
    @Override
    @Override

    }
    public void setClob(int parameterIndex, Clob x)
    {
    }
    {
        getOriginal().setNCharacterStream(parameterIndex, x, length);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        throws SQLException
    @Override
            return getOriginal().execute();
    }
        throws SQLException
    public void setClob(int parameterIndex, Reader x)
        handleStatementBind(parameterIndex, x);
    @Override
    public void setBlob(int parameterIndex, Blob x)
    {

        throws SQLException
    {
    @Override
        getOriginal().setTime(parameterIndex, x, cal);
public class JDBCPreparedStatementImpl<STATEMENT extends PreparedStatement> extends JDBCStatementImpl<STATEMENT> implements JDBCPreparedStatement {
    {
    public void addBatch()
        handleStatementBind(parameterIndex, x);

        handleStatementBind(parameterIndex, x);
    public void setNCharacterStream(int parameterIndex, Reader x, long length)

        throws DBCException

    {
        
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    }
        } finally {
            } else if (value instanceof byte[] bytes) {

        } else if (value instanceof Number) {
                            char c2 = q.charAt(k);
                                formatted.append(c2);
                o = NULL_VALUE;

    {
    }
    }
    @Override
        public String toString() {
        throws SQLException
    }
        getOriginal().setUnicodeStream(parameterIndex, x, length);
        throws SQLException
        handleStatementBind(parameterIndex, x);
    public void setBinaryStream(int parameterIndex, InputStream x, long length)
        handleStatementBind(parameterIndex, x);
    }

        }
            paramMap = null;
        throws SQLException
