    @Override
        throws SQLException
    public void updateRowId(String columnLabel, RowId x)
        throws SQLException
    public void updateArray(String columnLabel, Array x)
    {
    @Deprecated
        original.updateBinaryStream(columnLabel, x, length);
    }
    public void afterLast()
    @Override

    @Override
        }
    public void updateRowId(int columnIndex, RowId x)
        original.updateLong(columnLabel, x);
        }
    public <T> T unwrap(Class<T> iface)
            boolean fetched = original.next();
        throws SQLException

    public boolean getBoolean(int columnIndex)
    @Override
        original.updateBlob(columnIndex, inputStream, length);
    public void updateBoolean(String columnLabel, boolean x)
    @Override
        checkNotEmpty();
    public InputStream getUnicodeStream(String columnLabel)
        return original.getRowId(columnIndex);

    }
    @Override

        throws SQLException

        original.moveToCurrentRow();
    }
    {
        throws SQLException
    public Blob getBlob(int columnIndex)
    public boolean rowInserted()
            JDBCTrace.dumpResultSetClose();
    public void updateNString(int columnIndex, String nString)
    public boolean rowDeleted()
        checkNotEmpty();
        original.updateBoolean(columnIndex, x);
    public void setMaxRows(long maxRows) {

    @Override
        checkNotEmpty();
    @Override
    @Override
        throws SQLException
        original.updateInt(columnIndex, x);
    }
    {
        original.updateShort(columnIndex, x);
    {
        return original.getTime(columnIndex, cal);
    public int getHoldability()

    public short getShort(int columnIndex)
        return original.getObject(columnIndex, map);
    public void updateNCharacterStream(String columnLabel, Reader reader)
    @Override
    {
    {
    @NotNull

        throws SQLException
    @Override
    {
    {
    public byte[] getBytes(String columnLabel)
    {
        throws SQLException

                throw new DBCException(e, session.getExecutionContext());
    @Override
    {
            statement.close();
    @Override
        throws SQLException
        original.cancelRowUpdates();
        original.updateCharacterStream(columnIndex, x, length);

    public boolean isLast()
        return original.getURL(columnLabel);

        return original.getRef(columnLabel);
    }
    }
    public void updateAsciiStream(int columnIndex, InputStream x, long length)
        throws SQLException
            fake.setResultSet(this);
        throws SQLException
    @Override

    {
        @NotNull JDBCSession session,
    public Blob getBlob(String columnLabel)

    public boolean isAfterLast()
    public Reader getNCharacterStream(int columnIndex)
        return original.isBeforeFirst();
    public JDBCResultSetMetaData getMeta()
        return original.getString(columnIndex);
    public void updateByte(int columnIndex, byte x)
    }
    {
            return true;
    public void updateSQLXML(String columnLabel, SQLXML xmlObject)
    @Override
    }
    }

    {
    @Override
    }
    public void close()
        if (this.original == null) {
        if (this.original == null) {
        return original.getUnicodeStream(columnLabel);
    }
            }
    @Override
        return original.getObject(columnIndex);
        return original.getBigDecimal(columnIndex);

        return original.getBytes(columnLabel);
    {
                rowsFetched++;
    {
    public NClob getNClob(String columnLabel)
    @Override
    public void updateAsciiStream(int columnIndex, InputStream x, int length)

    }
            // Fake statements are closed by result set close
        checkNotEmpty();

    {

        return original.getObject(columnIndex, type);
    @Override
        original.updateArray(columnIndex, x);
        original.updateSQLXML(columnLabel, xmlObject);
    public void updateString(String columnLabel, String x)
    }
    @Override
    public long getLong(int columnIndex)

    @Override
        }
        original.updateCharacterStream(columnIndex, x, length);
        original.updateClob(columnIndex, reader, length);
    }
    }
    @Override
            if (fetched && JDBCTrace.isApiTraceEnabled()) {
        checkNotEmpty();
    @Override
    protected JDBCResultSetMetaData createMetaDataImpl() throws SQLException
    {
        throws SQLException
    }

    }

    @Override
        return original.getBlob(columnLabel);
    {
    public boolean first()
    }
    }
                original.close();

    {
    }
    private final boolean disableLogging;
    public InputStream getUnicodeStream(int columnIndex)

    {
        return original.getByte(columnLabel);
    }

import java.sql.*;
        return original.last();
    @Override
    }
    }
    {
    {
    }
    {
    }
        throws SQLException
    @Override
    @Override
    {
            }

    }
        return original.getByte(columnIndex);
    @Override
    @Override
    {
        @NotNull ResultSet original,
    public void updateBinaryStream(int columnIndex, InputStream x, int length)

    }
        original.clearWarnings();
        return original.getFetchSize();
        original.updateNString(columnIndex, nString);
        original.updateDate(columnIndex, x);
        throws SQLException
            try {
    {
    }
    }
    @Deprecated


    public void updateClob(String columnLabel, Reader reader, long length)
    @Override
    @Override
    {

        throws SQLException

    public void updateObject(int columnIndex, Object x, int scaleOrLength)
        throws SQLException
    public String getNString(String columnLabel)
    }
        return original.getBlob(columnIndex);
    {
    }
    @Override
    @Override
    public boolean last()
    @Override
        checkNotEmpty();


    }
    public ResultSet getOriginal()

    @Override
    @Override
        original.updateNull(columnLabel);
        original.updateAsciiStream(columnLabel, x, length);
        throws SQLException
    {
    @Override
    }
    }
    @Override

        throws SQLException
        original.updateBoolean(columnLabel, x);
    public void updateBinaryStream(String columnLabel, InputStream x)
    public void updateBlob(String columnLabel, InputStream inputStream, long length)
    }
        throws SQLException
        return original.getNClob(columnLabel);
        return original.getBoolean(columnIndex);

        throws SQLException
    public URL getURL(int columnIndex)
    @Override
    {
    @Override
            statement = new JDBCFakeStatementImpl(session, null, disableLogging);
        return original.getBinaryStream(columnIndex);
    }
            // Notify handler
    {
    }
    protected void beforeFetch()
    @Override
    public ResultSetMetaData getMetaData()
    }
    @Override
            return false;
        original.updateNCharacterStream(columnIndex, x);


        throws SQLException
        throws SQLException

    }
    @Override
        return original.isClosed();
        throws SQLException
    public String getCursorName()
        return original.getTime(columnLabel);
        original.insertRow();
    public void updateBlob(int columnIndex, InputStream inputStream)
        return original.getNCharacterStream(columnLabel);
    public void clearWarnings()
        throws SQLException
    }
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSetMetaData;

        throws SQLException
    }
        throws SQLException
import java.util.Calendar;
    @Override
                JDBCUtils.reportWarnings(session, getOriginal().getWarnings());
        throws SQLException
        throws SQLException
        try {

        original.updateBytes(columnLabel, x);
    {
        original.updateObject(columnLabel, x);
    public int getInt(String columnLabel)
    {
    public void updateLong(String columnLabel, long x)
    @Override

        @NotNull JDBCStatement statement,
    public SQLWarning getWarnings()


    {
        throws SQLException
    }
    }
        if (original == null) {
    public void deleteRow()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }
    @Override
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    {
    {
    public void updateFloat(String columnLabel, float x)
    {
    @Override
    @Override

    @Override
        throws SQLException
    {
import java.util.Map;
        // Check max rows
    public Reader getCharacterStream(int columnIndex)
        throws SQLException
        original.updateArray(columnLabel, x);
    {


        original.updateBinaryStream(columnLabel, x, length);
        throws SQLException
    @Override
    public InputStream getAsciiStream(String columnLabel)
    }

    public void updateNull(int columnIndex)
    public Array getArray(int columnIndex)
    @Override

    @Override
        return original.getType();
    public void updateByte(String columnLabel, byte x)
    {
    {
    ) throws SQLException {
    public Date getDate(int columnIndex, Calendar cal)
        throws SQLException
        throws SQLException
    }
    }
        throws SQLException

    {
            QMUtils.getDefaultHandler().handleResultSetOpen(this);

        throws DBCException
    }

    public boolean isClosed()
    {
    {
    }
    {
    @Nullable
    @Override

        throws SQLException
        throws SQLException
        throws SQLException
        return original.getCharacterStream(columnLabel);
        return session;
        }
        throws SQLException
        return original;
    {
        }
    public JDBCStatement getStatement()
        }
        return original.getTime(columnIndex);
    {

    }
    @Override
        return original.getURL(columnIndex);

            if (e.getCause() instanceof SQLException) {
    }
    public void updateNClob(String columnLabel, NClob nClob)
        return original.getWarnings();

        throws SQLException
        this.fake = false;
    @Override
    {
        original.updateClob(columnLabel, reader, length);
    {
 *
    }
        original.updateAsciiStream(columnIndex, x, length);
    @Override
        if (FEATURE_NAME_JDBC.equals(name)) {

        original.updateCharacterStream(columnIndex, x);

    }
        original.updateBigDecimal(columnIndex, x);
    public BigDecimal getBigDecimal(String columnLabel, int scale)

    {
            throw new DBCException(e, session.getExecutionContext());

        @NotNull JDBCSession session,
        throws SQLException
    public void updateTimestamp(int columnIndex, Timestamp x)
    public void updateAsciiStream(int columnIndex, InputStream x)
    @Override
        throws DBCException
        checkNotEmpty();
        if (original != null) {
        return original.getFloat(columnLabel);
    {
        throws SQLException
        throws SQLException
            } else {
        return original.getTimestamp(columnIndex);
    }
    {

        this.disableLogging = disableLogging;
    }
    }
        throws SQLException
            } catch (Throwable e) {
        throws DBCException
    {
        throws SQLException
        throws SQLException
    public void updateDouble(String columnLabel, double x)
    public int getRow()
    @Override
        try {
        this.original = original;
    public Timestamp getTimestamp(String columnLabel)
    }
    {

        checkNotEmpty();
    {

    public void updateBinaryStream(int columnIndex, InputStream x)
    public String getString(int columnIndex)
 *     http://www.apache.org/licenses/LICENSE-2.0
        return original.relative(rows);
        checkNotEmpty();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        throws SQLException
        }
        original.updateBlob(columnIndex, inputStream);
import org.jkiss.code.NotNull;

    public void updateNClob(String columnLabel, Reader reader, long length)

        catch (SQLException e) {

        throws SQLException
    public long getLong(String columnLabel)
    {
    @Override
    private static final Log log = Log.getLog(JDBCResultSetImpl.class);
        throws SQLException

    {

        checkNotEmpty();
        throws SQLException
        return original.getDate(columnIndex, cal);
    public void updateNClob(int columnIndex, Reader reader, long length)
        throws SQLException
        //this.session.getProgressMonitor().startBlock(statement, null);
        original.updateTime(columnIndex, x);
    @Override
        throws SQLException
    public void updateClob(int columnIndex, Reader reader, long length)
        throws SQLException
    @Override
        return original.getBinaryStream(columnLabel);
        original.updateDouble(columnIndex, x);
        throws SQLException

    public void updateNClob(int columnIndex, NClob nClob)
        throws SQLException
            return;
    public SQLXML getSQLXML(int columnIndex)
        checkNotEmpty();
        checkNotEmpty();
import java.io.InputStream;
    public void updateObject(String columnLabel, Object x)

        original.updateObject(columnIndex, x, scaleOrLength);
    }
    @Override
    {
    {
    @Override
    }

    }
    @Override
    @Override
    {
            session, statement, original, disableLogging);

    @Override
        return metaData;
            // JDBC uses 1-based indexes
        throws SQLException
    }

    public Time getTime(String columnLabel)
    public float getFloat(int columnIndex)
    @Override
    {
    }


        return original.getDouble(columnIndex);
    @Override
        }
    {
            // Notify handler
    @Override
    @Override
    @Override
    public void updateNCharacterStream(int columnIndex, Reader x)
    {
    }
    {
    }
        checkNotEmpty();
        return original.getBigDecimal(columnLabel, scale);
    public JDBCStatement getSourceStatement() {
        checkNotEmpty();

    public Object getObject(String columnLabel)
        throws SQLException
        throws SQLException

    @Override
            return original.getObject(name);
    {
    public void updateNCharacterStream(String columnLabel, Reader reader, long length)
        throws SQLException
}

    public void updateBoolean(int columnIndex, boolean x)
    }

    {
    public void updateBlob(int columnIndex, InputStream inputStream, long length)
    @Override
        throws SQLException

    {
            // Fetch next row
            } catch (Throwable e) {
    {
    @Override
            this.afterFetch();
    {

import java.io.Reader;
        }
        catch (SQLException e) {
    {
    {
    public boolean next()
    @Override
    @Override
    @Deprecated
    @Override
        if (this.statement.isQMLoggingEnabled()) {
            // Close result set
    {
        }
    }

    @Override
    @Nullable
    }
    {
        try {
    }
        original.beforeFirst();
        throws SQLException
    }
    {
        throws SQLException
        throws SQLException
        } catch (DBCException e) {
    public InputStream getBinaryStream(String columnLabel)
        throws SQLException
    {
    @Override
    public void updateClob(String columnLabel, Reader reader)

        original.updateNString(columnLabel, nString);
        return original.getBigDecimal(columnLabel);
        original.updateTimestamp(columnLabel, x);
    {
    {
        return super.getFeature(name);
    {
        throws SQLException
        if (statement instanceof JDBCFakeStatementImpl) {
    }
 */
    }
    {
    {
        return original.getClob(columnLabel);
        checkNotEmpty();

    {
    @Override

        throws SQLException
    @Override
        try {
    }
        return original.isWrapperFor(iface);
    {
    {
        throws SQLException

    }
        throws SQLException

        checkNotEmpty();
/*
        throws SQLException
    @Override

        throws SQLException
    }

        return original.getSQLXML(columnIndex);
        original.updateBlob(columnLabel, inputStream);
    @Override
    @Override
        throws SQLException
*/
        throws SQLException
        throws SQLException
        throws SQLException
        @NotNull ResultSet original,
    @NotNull

    {
    }

        return original.getObject(columnLabel, map);
            JDBCTrace.dumpResultSetOpen(this.original);
            }
        return original.getRowId(columnLabel);
    }

        throws SQLException
    {
        try {
        throws SQLException

    {

    public void updateDate(String columnLabel, Date x)
    }
    public void updateClob(int columnIndex, Clob x)
    }

    public void updateSQLXML(int columnIndex, SQLXML xmlObject)

        return original.getDate(columnLabel, cal);
    @Override
    public int findColumn(String columnLabel)
    }
    public void updateInt(String columnLabel, int x)
    @Override
    public void updateCharacterStream(String columnLabel, Reader reader, int length)
        return session.getDataSource().getJdbcFactory().createResultSet(
    @Override
    public void updateBlob(String columnLabel, Blob x)
    @Override
            }
        throws SQLException

    public void updateNString(String columnLabel, String nString)
    public Object getAttributeValue(String name) throws DBCException {
    @Override
    {
        return original.getRef(columnIndex);
package org.jkiss.dbeaver.model.impl.jdbc.exec;

        return original.getDate(columnLabel);
                JDBCUtils.reportWarnings(getSession(), this.getWarnings());
            // Check for warnings
    @Override
    public void cancelRowUpdates()
    {

    }
/*
    public boolean previous()
    {
    public InputStream getAsciiStream(int columnIndex)
 * You may obtain a copy of the License at
    }

    }

        throws SQLException
 */
        original.updateSQLXML(columnIndex, xmlObject);

    {
        original.updateRowId(columnIndex, x);
    @Override

        throws SQLException
    }
        throws SQLException
    public Date getDate(String columnLabel)
    @Override

        checkNotEmpty();
    @Override
    {
        checkNotEmpty();
        original.updateBytes(columnIndex, x);
    {
        original.setFetchDirection(direction);
        throws SQLException
    }

    {

    @Override
    @Override



        original.updateNClob(columnIndex, reader);
        return original.first();
    public float getFloat(String columnLabel)
    {
    public void updateNull(String columnLabel)
    public String getString(String columnLabel)
    public void updateTime(String columnLabel, Time x)
    @Nullable

        original.updateNClob(columnLabel, reader, length);

        if (!disableLogging) {
    }
        @Nullable JDBCStatement statement,
    {
        throws SQLException

    @Override

        throws SQLException
        original.updateRow();
    }

    public void updateShort(String columnLabel, short x)
        throws SQLException
    }
    public void updateCharacterStream(String columnLabel, Reader reader, long length)
    public Object getFeature(String name) {
        throws SQLException
    public Timestamp getTimestamp(int columnIndex, Calendar cal)
            catch (SQLException e) {
        if (JDBCTrace.isApiTraceEnabled()) {
    }
        }

    public Date getDate(String columnLabel, Calendar cal)
    @Override
    }
        original.updateByte(columnLabel, x);
            } catch (SQLException e) {
    public Time getTime(int columnIndex, Calendar cal)
    }

    @Override


        original.updateAsciiStream(columnLabel, x, length);

    public Time getTime(int columnIndex)
        throws SQLException
    {
    }
    private static void traceGetValue(int columnIndex, String value) {
        throws SQLException
        return original.getInt(columnLabel);

    @Override
    }
    }
        original.updateNull(columnIndex);

    @Override
    @Override
        throws SQLException
        try {

                metaData = createMetaDataImpl();
    }
    }
        original.updateTime(columnLabel, x);

        throws SQLException
    public void updateRow()
        throws SQLException
    @Override
    }
        throws SQLException
    @Override
    @Override
        return original.unwrap(iface);
        }
        original.updateByte(columnIndex, x);
    }

        this.maxRows = maxRows;
        throws SQLException

    public int getInt(int columnIndex)
        }
        throws SQLException
            }
    @Override
    public boolean absolute(int row)
    }
    public Ref getRef(int columnIndex)
import org.jkiss.dbeaver.Log;
    }
    }
    @Override
    @NotNull

    }
    }

        if (JDBCTrace.isApiTraceEnabled()) {
        checkNotEmpty();

        return original.getRow();
    }
    {
    {
    protected JDBCResultSetImpl(JDBCStatementImpl statement, ResultSet original)
    public InputStream getBinaryStream(int columnIndex)
    public Timestamp getTimestamp(String columnLabel, Calendar cal)
    private final ResultSet original;
        return original.getLong(columnIndex);
    public void updateClob(int columnIndex, Reader reader)
        throws SQLException

        return original.wasNull();
    @Override
    public boolean nextRow()
        throws SQLException

        throws SQLException
        original.afterLast();
        checkNotEmpty();
    {
    @Override
    {
    }
    @Override
        super(session, statement);
    }
    {
    public void updateBigDecimal(String columnLabel, BigDecimal x)
        original.updateFloat(columnLabel, x);
    }
    {
        return original.previous();
        original.updateBlob(columnLabel, x);
    {


    }
    public void updateObject(int columnIndex, Object x)
    {

        if (maxRows >= 0 && rowsFetched >= maxRows) {
        return original.getString(columnLabel);
    @Override
    }
    @Override
/**

    }
    @Override
    public void updateFloat(int columnIndex, float x)
        return original.getTimestamp(columnLabel);
    {
    @Override
    {
 * Managable result set
    public boolean isBeforeFirst()
        }
    }
        throws SQLException
        original.updateBlob(columnIndex, x);

        checkNotEmpty();
    {
        boolean disableLogging

        }
        throws SQLException
        throws SQLException
/*
        throws SQLException
        original.updateNCharacterStream(columnIndex, x, length);

        throws SQLException
    @Override
    @Override
    {
    public void updateRef(int columnIndex, Ref x)
        throws SQLException
    {
        original.updateBinaryStream(columnIndex, x, length);
        throws SQLException
    @Override

        checkNotEmpty();
            return false;
    }
    {
    public Clob getClob(String columnLabel)
    {
            throw new IllegalStateException();
    {
        checkNotEmpty();
        throws SQLException
        checkNotEmpty();

        }

    @Override
        }
import java.math.BigDecimal;
    public boolean wasNull()
    }
    @Override
    }
        return original.isAfterLast();
        return original.getDate(columnIndex);
    }

            if (fetched) {
        checkNotEmpty();
            try {
        throws SQLException
        throws SQLException
    public Date getDate(int columnIndex)
    }
    public Time getTime(String columnLabel, Calendar cal)
    public void moveToCurrentRow()
        throws SQLException
    }
    {

        return original.getShort(columnIndex);
        return original.getShort(columnLabel);
        throws SQLException

    public void updateDouble(int columnIndex, double x)
        return original.rowDeleted();
    @Override
        boolean disableLogging

    public BigDecimal getBigDecimal(String columnLabel)
    public int getType()
    {
        checkNotEmpty();
        this.statement = statement;
        checkNotEmpty();

                QMUtils.getDefaultHandler().handleResultSetClose(this, rowsFetched);
        throws SQLException
        throws SQLException
 *
    @Override
    @Override
    @Override
    {
    }

    public void setFetchSize(int rows)
    public RowId getRowId(int columnIndex)
        original.updateString(columnIndex, x);
        original.updateDouble(columnLabel, x);
    public boolean rowUpdated()
        throws SQLException
            return null;

        }
    private long maxRows = -1;
    }
        return original.getArray(columnIndex);
        if (this.original == null) {
        original.updateCharacterStream(columnLabel, reader);
        if (original == null) {
    public BigDecimal getBigDecimal(int columnIndex, int scale)
    @Nullable


    @Override
    @Override

        throws SQLException
    public void setFetchDirection(int direction)

    private void checkNotEmpty()
    public void updateCharacterStream(int columnIndex, Reader x)
            QMUtils.getDefaultHandler().handleResultSetOpen(this);
    @Override
    }
        original.updateBlob(columnLabel, inputStream, length);
    {
    }
    @Override
    }
        original.updateClob(columnIndex, x);


    {
    }
    public void updateBlob(String columnLabel, InputStream inputStream)
        original.updateNCharacterStream(columnLabel, reader, length);
    {
    }

        throws SQLException

        checkNotEmpty();
    {


    {
        throws SQLException

    {
        throws SQLException
            return original.getObject(index + 1);
        throws SQLException
            return fetched;
        if (original == null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


        catch (SQLException e) {
    @Override
        throws SQLException
    }
    {

    }
    }
    {

    }
        return original.getBoolean(columnLabel);
    }
        throws SQLException

    {
    @Override
        throws SQLException
            throw new DBCException(e, session.getExecutionContext());
    public void updateBytes(String columnLabel, byte[] x)
        original.updateObject(columnLabel, x, scaleOrLength);
    }
        return original.getHoldability();
    public void updateString(int columnIndex, String x)
    }
    {
    }
    @Override
        }


    }
    }
    {
        throws SQLException
 * limitations under the License.
    }
        checkNotEmpty();
    }
    public void updateDate(int columnIndex, Date x)
    protected void afterFetch()
        throws SQLException
        return original.getLong(columnLabel);
    }
        throws SQLException
    }
    public Object getObject(int columnIndex, Map<String, Class<?>> map)
        try {
        return original.getNString(columnIndex);
        original.moveToInsertRow();
        }

    @Override
        throws SQLException
        throws SQLException
    @Override

    {
        return session.getDataSource().getJdbcFactory().createResultSetMetaData(this);
        }
    @Override

        throws SQLException
        original.deleteRow();
    }
        throws SQLException
    }


    }
    {

    public void refreshRow()
    }
        return original.getSQLXML(columnLabel);
        throws SQLException
    protected JDBCResultSetImpl(
    @Override
    }
    {
    {
            throw new DBCException(e, session.getExecutionContext());
    public void updateBigDecimal(int columnIndex, BigDecimal x)
        throws SQLException

    {
    ) {
        return original.isFirst();
        checkNotEmpty();
    }
            return getMeta();


    @Override
        original.updateRef(columnLabel, x);
    {

    public Object getObject(String columnLabel, Map<String, Class<?>> map)
    {
    {
    @Override
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        throws SQLException
            return false;
    }



    @Override
        catch (SQLException e) {
        throws SQLException
    }
    }
                throw new SQLException(e);
        throws SQLException
        original.updateRef(columnIndex, x);
        throws SQLException
    private JDBCResultSetMetaData metaData;
                log.debug("Error reading JDBC warnings: " + e.getMessage());
    @Override
    {
 * DBeaver - Universal Database Manager

    public NClob getNClob(int columnIndex)
        return original.getTimestamp(columnLabel, cal);
        throws SQLException
    @Override
    }
    {
    {
        checkNotEmpty();
    public JDBCSession getSession()
    }
    @Override
        original.updateObject(columnIndex, x);
    public boolean isWrapperFor(Class<?> iface)
        throws SQLException

            }
        }
        throws SQLException
        throws SQLException
    public Timestamp getTimestamp(int columnIndex)
    public void moveToInsertRow()
    }
    }
    public SQLXML getSQLXML(String columnLabel)
    public void updateObject(String columnLabel, Object x, int scaleOrLength)
    }
import org.jkiss.dbeaver.model.qm.QMUtils;
        original.updateInt(columnLabel, x);
    {
        throws SQLException
        throws SQLException
    public int getFetchDirection()
        original.updateBinaryStream(columnIndex, x);
        throws SQLException
        original.updateNClob(columnLabel, nClob);
    @Override

        return original.getUnicodeStream(columnIndex);
    }
        throws SQLException
    }


        return original.getNClob(columnIndex);
    @Override
            if (!disableLogging) {
        original.setFetchSize(rows);
    {
    }
    @Override
        throws SQLException
    @Override
        original.updateNClob(columnIndex, reader, length);

import org.jkiss.dbeaver.model.impl.AbstractResultSet;
    public BigDecimal getBigDecimal(int columnIndex)
        }

    public byte getByte(String columnLabel)
    }
    @Override
    {
    }
        throws SQLException
        throws SQLException
        original.updateAsciiStream(columnIndex, x, length);
    public boolean getBoolean(String columnLabel)
    {
        original.updateString(columnLabel, x);
        original.updateBigDecimal(columnLabel, x);
 * you may not use this file except in compliance with the License.
    public void updateNClob(int columnIndex, Reader reader)
    }
    public Array getArray(String columnLabel)
        }
        //QMUtils.getDefaultHandler().handleResultSetFetch(this);
    }

        original.updateClob(columnIndex, reader);
        if (statement == null) {
        original.updateNClob(columnIndex, nClob);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    public Ref getRef(String columnLabel)
    }
    {
    }
    public int getConcurrency()

    {
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
        throws SQLException
    @Override

        throws SQLException
        checkNotEmpty();
        throws SQLException
    {
        return original.getAsciiStream(columnLabel);
    public void updateArray(int columnIndex, Array x)
        original.refreshRow();
    public String getNString(int columnIndex)
    {
    public void updateBinaryStream(String columnLabel, InputStream x, long length)
    }
    @Override
    @Override
    }
    {
        return original.getDouble(columnLabel);
    @Override
    }
    @Override
    }
    public void updateAsciiStream(String columnLabel, InputStream x)
    @Override
    {
        this.session = statement.getSession();
    public Object getAttributeValue(int index)
        throws SQLException
    {
    }
    public void updateCharacterStream(String columnLabel, Reader reader)
        throws SQLException
            throw new DBCException(e, session.getExecutionContext());
    {
    {
    {
    }
    @Override
*/
        throws SQLException

    @Override
    }
        throws SQLException
        throws SQLException
        throws SQLException
    @Override
    @Override
                // Handle close
    @Override
        if (JDBCUtils.LOG_JDBC_WARNINGS) {
    {
    }
        catch (SQLException e) {

    public void updateBytes(int columnIndex, byte[] x)
    {
        return original.getTimestamp(columnIndex, cal);
            return original.getCursorName();
 * See the License for the specific language governing permissions and
    @Override
            }
    }
    @NotNull
    public Reader getNCharacterStream(String columnLabel)
    {
    {
    @Override
    {
    {
    @Deprecated

    @Override
    public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
 * Unless required by applicable law or agreed to in writing, software
        throws SQLException
    public double getDouble(int columnIndex)

    }
    {
    public URL getURL(String columnLabel)

    }
    public void updateAsciiStream(String columnLabel, InputStream x, int length)
    }


        if (this.original == null) {
    }
                JDBCTrace.dumpResultSetRow(this.original);
    @Override
        throws SQLException
    @Override
    {
    {
    public String getResultSetName() throws DBCException {
    {
    public void updateRef(String columnLabel, Ref x)
            return null;
        throws SQLException
    public void updateShort(int columnIndex, short x)
    {
    }
    @Override
        return original.getNString(columnLabel);
        original.updateLong(columnIndex, x);
        throws SQLException
    @Override
        return original.getTime(columnLabel, cal);
    {
        return original.isLast();
    {
    public void updateBinaryStream(int columnIndex, InputStream x, long length)
    {
    public byte[] getBytes(int columnIndex)
        // FIXME: starte/end block. Do we need them here?
    {
        throws SQLException
    @Override
    }

    }

    @Override
        return original.rowUpdated();
        throws SQLException
        throws SQLException
    @Override

    }
        checkNotEmpty();
        return original.getFetchDirection();
    public short getShort(String columnLabel)
 *


    @Override
        throws SQLException
    {
    @Override
    {
    {
        original.updateShort(columnLabel, x);
        return original.getArray(columnLabel);
    }
    @Override
        original.updateAsciiStream(columnLabel, x);
    public void updateNClob(String columnLabel, Reader reader)
    public int getFetchSize()
    }
        throws SQLException
    @Override
    {
        throws SQLException
    }

    }
    {
    {
    @Override
    {
        original.updateFloat(columnIndex, x);

    }
        checkNotEmpty();
    {
        throws SQLException

    @Override
        return original.absolute(row);
            try {
    }

    @Override
    @Override
    public void updateCharacterStream(int columnIndex, Reader x, int length)

    }
        this.original = original;
    }
        original.updateRowId(columnLabel, x);
        }
    public double getDouble(String columnLabel)
        finally {

    public byte getByte(int columnIndex)
    {
    {
        return original.rowInserted();
        if (metaData == null) {
    @Override

        original.updateBinaryStream(columnLabel, x);
    @Override
    }
    {
    public boolean moveTo(int position) throws DBCException

    public Reader getCharacterStream(String columnLabel)
        throws SQLException
    @Override

    }

import java.net.URL;
            return this.next();
        original.updateClob(columnLabel, x);
    @Override
        if (statement instanceof JDBCFakeStatementImpl fake) {
        }
    public void updateTimestamp(String columnLabel, Timestamp x)
    @Override
    {
        throws SQLException
        this.beforeFetch();
    }
        }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        throws SQLException
    @Override
    }
    {
            return this.absolute(position);
import org.jkiss.dbeaver.model.exec.DBCException;
        throws SQLException
        checkNotEmpty();
        throws SQLException
        return original.getCharacterStream(columnIndex);

import org.jkiss.code.Nullable;
    }
    @Override
        return original.getBigDecimal(columnIndex, scale);

        throws SQLException

    }
    }
        throws SQLException
        return original.getAsciiStream(columnIndex);
            return false;

        }

    public void insertRow()
    }
        throws SQLException
    public static JDBCResultSet makeResultSet(
    {
        original.updateNClob(columnLabel, reader);
        checkNotEmpty();
        throws SQLException
    {
    {
        return original.getObject(columnLabel);

        throws SQLException
        throws SQLException
    {
    public void updateAsciiStream(String columnLabel, InputStream x, long length)
        throws SQLException
    {
    {
        original.updateCharacterStream(columnLabel, reader, length);
        return original.getNCharacterStream(columnIndex);
        throws SQLException
        return original.findColumn(columnLabel);
        return original.getConcurrency();
        original.updateClob(columnLabel, reader);
    }
        throws SQLException
    {
public class JDBCResultSetImpl extends AbstractResultSet<JDBCSession, JDBCStatement> implements JDBCResultSet {
        return original.getFloat(columnIndex);
            }
    {
        original.updateAsciiStream(columnIndex, x);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCTrace;
    }
    public Object getObject(int columnIndex)
    public void beforeFirst()
        throws SQLException
        throws SQLException
    private long rowsFetched;
        return statement;
        //this.session.getProgressMonitor().endBlock();
    }

    }
    @Override
        throws SQLException
        return original.getBytes(columnIndex);
    public void updateCharacterStream(int columnIndex, Reader x, long length)
    }
    {
                throw (SQLException)e.getCause();
    @Override
    @Override
    public void updateBinaryStream(String columnLabel, InputStream x, int length)
    public void updateTime(int columnIndex, Time x)
        return original.getClob(columnIndex);
    }
    public void updateInt(int columnIndex, int x)
    }
        }
    {
        original.updateCharacterStream(columnLabel, reader, length);

        original.updateBinaryStream(columnIndex, x, length);
    @Override
    public Clob getClob(int columnIndex)
    @Override
    @Override

    }
    @Override
    public boolean relative(int rows)
    }
        original.updateTimestamp(columnIndex, x);
        return original.getCursorName();
    public void updateLong(int columnIndex, long x)
        throws SQLException
                log.debug("Can't check for resultset warnings", e);
        checkNotEmpty();
        return getSourceStatement();


    {
    {
    public RowId getRowId(String columnLabel)
        throws SQLException
        }
    }
        original.updateDate(columnLabel, x);
    {
    @Override
    }
    @Override
    }
    {
    {
    {
    public void updateClob(String columnLabel, Clob x)
        }

    @Override
    @Override
    @Override
    }
    @Override
    {
    @Override
        throws SQLException
    public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
        throws SQLException
        return original.getInt(columnIndex);
    public void updateBlob(int columnIndex, Blob x)


            throw new DBCException(e, session.getExecutionContext());

        checkNotEmpty();

                getOriginal().clearWarnings();
    }
    {
    {
                log.error("Can't close result set", e);
    }
        return original.getObject(columnLabel, type);
    @Override
    public void updateNCharacterStream(int columnIndex, Reader x, long length)
        }
        throws SQLException
            try {

    public boolean isFirst()
    @Override
        throws SQLException
        original.updateNCharacterStream(columnLabel, reader);
        throws SQLException
