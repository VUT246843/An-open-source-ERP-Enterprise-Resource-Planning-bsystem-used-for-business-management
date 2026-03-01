    public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
        return statement.getNString(getColumnOriginalIndex(parameterIndex));
        throw new SQLFeatureNotSupportedException();



    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    public void deleteRow() throws SQLException {
    @Override
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCCallableStatement;
        return curPosition;
    @Override
        return false;
    @Override
        return statement.getRef(parameterName);
    @Override
    @Override

    }
        throw new SQLFeatureNotSupportedException();

    @Override
    public void updateRowId(int columnIndex, RowId x) throws SQLException {
    }
        throw new SQLFeatureNotSupportedException();
    public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
        curPosition--;

    public boolean rowInserted() throws SQLException {
        throw new SQLFeatureNotSupportedException();

    public Blob getBlob(int columnIndex) throws SQLException {
    }

        return statement.getBlob(getColumnOriginalIndex(columnIndex));
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        curPosition = 0;
    }
    public float getFloat(int parameterIndex) throws SQLException {
    }
        return statement.getTimestamp(getColumnOriginalIndex(parameterIndex));
    }
    }
    @Override
    public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
    }
    }
    public InputStream getAsciiStream(int columnIndex) throws SQLException {
    public void updateInt(int columnIndex, int x) throws SQLException {

    public void updateNString(int columnIndex, String nString) throws SQLException {
import java.io.Reader;

    }
    public Object getAttributeValue(int index) throws DBCException {
    public void updateLong(int columnIndex, long x) throws SQLException {

    public void updateObject(int columnIndex, Object x) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    public <T> T unwrap(Class<T> iface) throws SQLException {
    public boolean isLast() throws SQLException {
    @Override

        throw new SQLFeatureNotSupportedException();

    public SQLWarning getWarnings() throws SQLException {
    }

        return statement.getClob(parameterName);
    }

    }
 *
    }


    }
        return statement.getDate(parameterName);
    private static class MappedLocalResultSetColumn extends LocalResultSetColumn {
    }
    public Object getAttributeValue(String name) throws DBCException {
    @Override
    @Override

        throw new SQLFeatureNotSupportedException();

    }
        return statement.getBigDecimal(parameterName);
     * <p>

    }
    public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {

    @Override
    }

    @Override

    @Override


    public void afterLast() throws SQLException {
        throw new SQLFeatureNotSupportedException();
    @Override
    }
    public void updateShort(String columnLabel, short x) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }
    }
    public String getCursorName() throws SQLException {
        return statement.getByte(getColumnOriginalIndex(parameterIndex));
    public void updateDate(int columnIndex, Date x) throws SQLException {

    }
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
    @Override
    @Override
    @Override
    }

        return statement.getLong(getColumnOriginalIndex(parameterIndex));
    }


    public Date getDate(String parameterName) throws SQLException {


    }
    @Override
    public Time getTime(int parameterIndex) throws SQLException {
    public long getLong(String parameterName) throws SQLException {

    }
import java.math.BigDecimal;
    @Override


    @Override
    }

    }
        return nextRow();
    }
    public void updateTime(int columnIndex, Time x) throws SQLException {
    public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {

        return curPosition < 0;
        throw new SQLFeatureNotSupportedException();
    }
            super(resultSet, index, label, typedObject);

    public SQLXML getSQLXML(int parameterIndex) throws SQLException {
    @Override
    }
    }
        return statement.getObject(getColumnOriginalIndex(columnIndex));



        throw new SQLFeatureNotSupportedException();
    public BigDecimal getBigDecimal(String parameterName) throws SQLException {
        return true;
        throw new SQLFeatureNotSupportedException();
    @Override
    /**
    @Override
        return statement.getBigDecimal(getColumnOriginalIndex(columnIndex));
        return true;
        throw new SQLFeatureNotSupportedException();
    public void setFetchDirection(int direction) throws SQLException {
        throw new SQLFeatureNotSupportedException();

import org.jkiss.code.NotNull;
/*
    @Override
        throw new SQLFeatureNotSupportedException();
        }
    @Override
public class JDBCResultSetCallable extends LocalResultSet<JDBCCallableStatement> implements JDBCResultSet {

        return null;
        throw new SQLFeatureNotSupportedException();
        throw new SQLFeatureNotSupportedException();
        return curPosition >= rows.size();
    @Override
    public String getNString(String parameterName) throws SQLException {
    }
    }
        return statement.getTime(parameterName, cal);
    public boolean next() throws SQLException {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

    @Override
    public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
    }
    }
    @Override

import java.io.InputStream;
    DBCAttributeMetaData addColumn(@NotNull String label, @NotNull DBSTypedObject typedObject, int localIndex, int originalIndex) {
    public InputStream getUnicodeStream(String columnLabel) throws SQLException {
    public Reader getNCharacterStream(String parameterName) throws SQLException {
    }

    @Override
        return statement.getTime(getColumnOriginalIndex(parameterIndex));
        return statement.getShort(getColumnOriginalIndex(parameterIndex));
    public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
    @Override
    @Override
        return statement.getLong(parameterName);

        throw new SQLFeatureNotSupportedException();
        } catch (SQLException e) {
    }
        throw new SQLFeatureNotSupportedException();
     * <pre>
    }
        return null;


    public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
    public Object getObject(String parameterName, Map<String, Class<?>> map) throws SQLException {
    public NClob getNClob(int parameterIndex) throws SQLException {
    public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
    }
    public Object getObject(String parameterName) throws SQLException {
    }
    }
    @Override
        return statement.getDouble(getColumnOriginalIndex(parameterIndex));
        return statement.getFloat(parameterName);
    @Override
    public void updateTime(String columnLabel, Time x) throws SQLException {

    private int getColumnOriginalIndex(int localIndex) throws SQLException {
    public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
    public boolean getBoolean(int parameterIndex) throws SQLException {
    }
    }
    @Override
        return statement.getBigDecimal(getColumnOriginalIndex(parameterIndex), scale);
    }


    }

    public void updateByte(String columnLabel, byte x) throws SQLException {
    public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
    }
    }
    public String getString(String parameterName) throws SQLException {
    }
        return statement.getDate(getColumnOriginalIndex(columnIndex));
        throw new SQLFeatureNotSupportedException();
        throw new SQLFeatureNotSupportedException();
    @Override
    @Override
     * in a new tab, making holes in the local result set.
     *     BEGIN

        super(session, statement);
    }
    public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
    public byte[] getBytes(String parameterName) throws SQLException {
    @Override

            throw new DBCException(e, session.getExecutionContext());
    public Date getDate(String parameterName, Calendar cal) throws SQLException {
    }
        throw new SQLFeatureNotSupportedException();
        throw new SQLFeatureNotSupportedException();
        return statement.getRef(getColumnOriginalIndex(columnIndex));

    }
    }


        throw new SQLFeatureNotSupportedException();
    }
    @Override
    public InputStream getAsciiStream(String columnLabel) throws SQLException {
        throw new SQLFeatureNotSupportedException();

    public boolean wasNull() throws SQLException {
     * It is useful when not every parameter of a procedure produce scalar values
     * but also cursors which we remove from local result set and instead process
        throw new SQLFeatureNotSupportedException();
    public int getFetchSize() throws SQLException {
    public Reader getCharacterStream(int parameterIndex) throws SQLException {
    @Override
    }
        final MappedLocalResultSetColumn column = new MappedLocalResultSetColumn(this, label, typedObject, localIndex, originalIndex);
    public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
        throw new SQLFeatureNotSupportedException();

    }

        return true;
    @Override
        return statement.getBytes(getColumnOriginalIndex(parameterIndex));
        }
    public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    @Override

        throw new SQLFeatureNotSupportedException();
    }


    public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {

        return statement.getURL(parameterName);
        return statement.getNClob(getColumnOriginalIndex(parameterIndex));
    }
    }
import org.jkiss.dbeaver.model.impl.local.LocalResultSet;
        return column;
        final DBCAttributeMetaData metaColumn = getMetaColumn(localIndex - 1);

        curPosition = rows.size() - 1;
    }
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;

    public int getFetchDirection() throws SQLException {
    }
    @Override
    }


    public void updateClob(int columnIndex, Reader reader) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    @Override

    public boolean previous() throws SQLException {
    public void updateBytes(int columnIndex, byte[] x) throws SQLException {
    public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
    /** @deprecated Use {@link JDBCResultSetCallable#addColumn(String, DBSTypedObject, int, int)} instead */

    }

            this.originalIndex = originalIndex;

    @Override
        return statement.getBytes(parameterName);

    @Override
    @Override
    @Override
    @Override


        private MappedLocalResultSetColumn(DBCResultSet resultSet, String label, DBSTypedObject typedObject, int index, int originalIndex) {
    public Array getArray(int columnIndex) throws SQLException {

    }
    @Override
        curPosition += rows;
    }
    public short getShort(int parameterIndex) throws SQLException {
/**
    public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {

    public boolean first() throws SQLException {
        return null;
    public JDBCResultSetCallable(@NotNull JDBCSession session, @NotNull JDBCCallableStatementImpl statement)
    }

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throw new SQLFeatureNotSupportedException();
        throw new SQLFeatureNotSupportedException();
    }


    @Override

    public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
    public void updateDouble(int columnIndex, double x) throws SQLException {
    public void updateShort(int columnIndex, short x) throws SQLException {
    @NotNull


        return false;
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    public boolean isAfterLast() throws SQLException {
    }

    public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
    }


    public RowId getRowId(int columnIndex) throws SQLException {
    public Object getObject(int columnIndex) throws SQLException {
    @Override
    }
    @Override
    @Override
    @Override


        return statement.getByte(parameterName);
    }



    public void setFetchSize(int rows) throws SQLException {

    public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
    public Date getDate(int columnIndex, Calendar cal) throws SQLException {
        return null;
        throw new SQLFeatureNotSupportedException();
        return statement.getFloat(getColumnOriginalIndex(parameterIndex));
    public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
        }



        throw new SQLFeatureNotSupportedException();



    @Override
    public void beforeFirst() throws SQLException {
    }
        return FETCH_FORWARD;
            // Should **never** reach here

    }
    }
    public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
    @Override
    }
    @Override
    public byte[] getBytes(int parameterIndex) throws SQLException {



    public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
            return this.getObject(name);
    }
    public short getShort(String parameterName) throws SQLException {

    public byte getByte(String parameterName) throws SQLException {
    @Override
    @Override
    }
    }
        return ((MappedLocalResultSetColumn) metaColumn).getOriginalIndex();

        curPosition = -1;
    @Override
 * Procedure result set
        throw new SQLFeatureNotSupportedException();
        throw new SQLFeatureNotSupportedException();

    }
    @Override
    }
    }
    }

    public Time getTime(int columnIndex, Calendar cal) throws SQLException {
    @Override
    @Override
        throw new SQLFeatureNotSupportedException();
    @Override
    }


    @Override
    public int getHoldability() throws SQLException {
    }
        return true;
    }
    @Override
    public void updateBoolean(String columnLabel, boolean x) throws SQLException {
    public void updateNClob(String columnLabel, Reader reader) throws SQLException {
    @Override
    @Override
    public void updateDouble(String columnLabel, double x) throws SQLException {
    }
    }
    }
    }
        }
    }
    }
    @Nullable
            throw new SQLException("Can't get original index from local index: " + localIndex);
    }
    @Override
    @Override
    public void moveToCurrentRow() throws SQLException {
        return addColumn(label, typedObject, getColumnCount(), getColumnCount());


        throw new SQLFeatureNotSupportedException();
    }
    @Override

        throw new SQLFeatureNotSupportedException();
    }
        throw new SQLFeatureNotSupportedException();
    public void updateFloat(int columnIndex, float x) throws SQLException {
        return (JDBCSession) super.getSession();
    DBCAttributeMetaData addColumn(@NotNull String label, @NotNull DBPDataKind dataKind, int localIndex, int originalIndex) {

    @Override
    @Override
    }
        return false;

        return statement.getObject(columnLabel, type);


        return true;
        throw new SQLFeatureNotSupportedException();
    @Override
    public void updateDate(String columnLabel, Date x) throws SQLException {

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        throw new SQLFeatureNotSupportedException();
        return statement.getTimestamp(parameterName, cal);
    @Override
    @Override
        throw new SQLFeatureNotSupportedException();
    public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
    }
            super(resultSet, index, label, dataKind);
    @Override
    }
    @Override
    @Override


    @Override
    public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
 * DBeaver - Universal Database Manager

    public boolean getBoolean(String parameterName) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    public void moveToInsertRow() throws SQLException {
 * See the License for the specific language governing permissions and
    }
    @Override

        throw new SQLFeatureNotSupportedException();
    public void updateArray(String columnLabel, Array x) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    @Override
    }
        throw new SQLFeatureNotSupportedException();
        return statement.getObject(parameterName, map);
        throw new SQLFeatureNotSupportedException();
    public int getInt(String parameterName) throws SQLException {
    public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
    }
    @Override



    }
        throw new SQLFeatureNotSupportedException();
    public void updateClob(String columnLabel, Clob x) throws SQLException {
        if (!(metaColumn instanceof MappedLocalResultSetColumn)) {

    @Override
    @Override
    }
import org.jkiss.dbeaver.model.impl.local.LocalResultSetColumn;
    }


    public void setMaxRows(long rsMaxRows) {
import java.net.URL;
        throw new SQLFeatureNotSupportedException();
    @Override
    public void updateClob(int columnIndex, Clob x) throws SQLException {
        return column;

        return curPosition == 0;
        return statement.getSQLXML(parameterName);

    }
        return statement.getInt(getColumnOriginalIndex(parameterIndex));

    @Override
        return statement.getNCharacterStream(getColumnOriginalIndex(parameterIndex));
    }
    }

    public ResultSet getOriginal() {

    public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
    public void clearWarnings() throws SQLException {
    }
    public Ref getRef(int columnIndex) throws SQLException {
    public void updateRowId(String columnLabel, RowId x) throws SQLException {

    @Override
    @Override
        return statement.getNCharacterStream(parameterName);



    }
    }
    public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
        return statement.getNString(parameterName);
        return CONCUR_READ_ONLY;
    @Override
    @Override
    @Override
    public boolean rowUpdated() throws SQLException {
    }


    @Override
        throw new SQLFeatureNotSupportedException();

        addColumn(column);
    public void updateArray(int columnIndex, Array x) throws SQLException {

    public void updateFloat(String columnLabel, float x) throws SQLException {
    }
        throw new SQLFeatureNotSupportedException();
    @Override
    }
    }
    }
    }
        }
    @Override

    @Override
        return statement.getDate(parameterName, cal);
    }
    public URL getURL(String parameterName) throws SQLException {
    public float getFloat(String parameterName) throws SQLException {
    public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
    public boolean rowDeleted() throws SQLException {

    }
    @Override
    }
    public double getDouble(int parameterIndex) throws SQLException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Override
    }
    }

    public void updateString(int columnIndex, String x) throws SQLException {
            throw new DBCException(e, session.getExecutionContext());

        throw new SQLFeatureNotSupportedException();
    }
    }
    }
    }
        throw new SQLFeatureNotSupportedException();
    }
    public Timestamp getTimestamp(int parameterIndex) throws SQLException {

    }

    @Override
    public void updateBoolean(int columnIndex, boolean x) throws SQLException {
    }
    public Timestamp getTimestamp(String parameterName) throws SQLException {
    }

        throw new SQLFeatureNotSupportedException();


        throw new SQLFeatureNotSupportedException();
 */

 * You may obtain a copy of the License at
        throw new SQLFeatureNotSupportedException();
    public String getNString(int parameterIndex) throws SQLException {

        throw new SQLFeatureNotSupportedException();

        return statement.getShort(parameterName);
    }
    }
        throw new SQLFeatureNotSupportedException();
        return statement.getString(getColumnOriginalIndex(parameterIndex));
    @Override

    @Override
    public void updateLong(String columnLabel, long x) throws SQLException {
    }

    @Override
        return statement.getTimestamp(getColumnOriginalIndex(columnIndex));


        return statement.getString(parameterName);
        return HOLD_CURSORS_OVER_COMMIT;
            return originalIndex;
 * limitations under the License.
        throw new SQLFeatureNotSupportedException();
    public URL getURL(int parameterIndex) throws SQLException {

    public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
    public boolean isBeforeFirst() throws SQLException {

    }
    @Override

        throw new SQLFeatureNotSupportedException();

        return -1;

import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
        throw new SQLFeatureNotSupportedException();
    }
    public InputStream getBinaryStream(int columnIndex) throws SQLException {
     *        ...
        throw new SQLFeatureNotSupportedException();

    @Override
    public NClob getNClob(String parameterName) throws SQLException {

     * After removing cursors (tab1, tab2), our local result set may look like: (val1, val2) which have zero-based
     * Consider following example:
    @Override
import org.jkiss.code.Nullable;

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
    @Override

    }
    public DBCAttributeMetaData addColumn(String label, DBPDataKind dataKind) {
    public int getInt(int parameterIndex) throws SQLException {
    @Override

    }

        return statement.getRowId(columnLabel);
    }
    }

        throw new SQLFeatureNotSupportedException();
    }
    }
     * indexes (0, 1), but their real indexes are (1, 3).
        return statement.getCharacterStream(parameterName);

    }
    }
    public int getRow() throws SQLException {


        throw new SQLFeatureNotSupportedException();
     *     CREATE PROCEDURE test(OUT tab1 Table, OUT val1 INT, OUT tab2 Table, OUT val2 INT) AS
        throw new SQLFeatureNotSupportedException();
        return statement.getClob(getColumnOriginalIndex(columnIndex));
        return null;
    public Time getTime(String parameterName) throws SQLException {

    public boolean last() throws SQLException {
        throw new SQLFeatureNotSupportedException();
    public void updateBlob(int columnIndex, Blob x) throws SQLException {
    public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
    }
        throw new SQLFeatureNotSupportedException();
    public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
        return statement.getNClob(parameterName);
        throw new SQLFeatureNotSupportedException();
    @Override
    public SQLXML getSQLXML(String parameterName) throws SQLException {
    }
    }

    @Override
    }
     * <p>
        throw new SQLFeatureNotSupportedException();
    public void updateRef(int columnIndex, Ref x) throws SQLException {

        throw new SQLFeatureNotSupportedException();
    public JDBCSession getSession() {
        private int getOriginalIndex() {

        throw new SQLFeatureNotSupportedException();
    @Override

    public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    public InputStream getUnicodeStream(int columnIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException();

    public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException {
    }
    public void updateInt(String columnLabel, int x) throws SQLException {
    @Override

    public DBCAttributeMetaData addColumn(String label, DBSTypedObject typedObject) {
        throw new SQLFeatureNotSupportedException();
     * </pre>

    }
    public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
        return statement;
        throw new SQLFeatureNotSupportedException();
    public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
    public int findColumn(String columnLabel) throws SQLException {
    }
        throw new SQLFeatureNotSupportedException();
    }
        throw new SQLFeatureNotSupportedException();
    }
    @Override
     *     END

    @Override
    @Override
    @Override

    public void updateRow() throws SQLException {
    }
        curPosition = rows.size();
    public void updateNull(int columnIndex) throws SQLException {
    @Override
    @Override
        return statement.getArray(parameterName);
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
        throw new SQLFeatureNotSupportedException();
        try {
        return statement.getDate(getColumnOriginalIndex(parameterIndex));
    public Blob getBlob(String parameterName) throws SQLException {
    public boolean isClosed() throws SQLException {
        return statement.getObject(parameterName);
    @Override
        throw new SQLFeatureNotSupportedException();
    }
        throw new SQLFeatureNotSupportedException();
        return addColumn(label, dataKind, getColumnCount(), getColumnCount());
        return statement.getInt(parameterName);
    }
import java.util.Calendar;
    }
    public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    }
        return statement.getObject(getColumnOriginalIndex(columnIndex));
    public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
    }
    public void updateNClob(int columnIndex, Reader reader) throws SQLException {
    @Override


        throw new SQLFeatureNotSupportedException();
    public Reader getCharacterStream(String parameterName) throws SQLException {
    @Override
        addColumn(column);

    }
        return statement.getRowId(getColumnOriginalIndex(columnIndex));
    @Override
    @Override
    public Time getTime(String parameterName, Calendar cal) throws SQLException {

        throw new SQLFeatureNotSupportedException();
        return statement.getObject(getColumnOriginalIndex(columnIndex), type);
    public Date getDate(int parameterIndex) throws SQLException {
    public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
        return statement.getBlob(parameterName);
    public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
    }
    }
    @Override
    @Override
        return statement.getSQLXML(getColumnOriginalIndex(parameterIndex));

    public RowId getRowId(String columnLabel) throws SQLException {
    }
        throw new SQLFeatureNotSupportedException();

    }
    @Override
    @Override
    public void updateNString(String columnLabel, String nString) throws SQLException {
        throw new SQLFeatureNotSupportedException();

 *
        throw new SQLFeatureNotSupportedException();
        return statement.getTimestamp(parameterName);
    }
        throw new SQLFeatureNotSupportedException();
        private final int originalIndex;
    }
    @Override
    }
            return this.getObject(index);
    }
    public boolean isFirst() throws SQLException {
package org.jkiss.dbeaver.model.impl.jdbc.exec;
    }
    public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
        return false;
    }
        return statement.getCharacterStream(getColumnOriginalIndex(parameterIndex));
    public void updateString(String columnLabel, String x) throws SQLException {

 */
    @Override
    }
        return 1;
    }
        return statement.getDouble(parameterName);
        return curPosition == 0;




     * Column containing is local result set index along with original result set index.
    }
        private MappedLocalResultSetColumn(DBCResultSet resultSet, String label, DBPDataKind dataKind, int index, int originalIndex) {
    @Override
    public void updateObject(String columnLabel, Object x) throws SQLException {
    public void cancelRowUpdates() throws SQLException {
    }
    }
            this.originalIndex = originalIndex;
        throw new SQLFeatureNotSupportedException();
    public ResultSetMetaData getMetaData() throws SQLException {
    @Override
    }
    @Override
    }
    public void updateNull(String columnLabel) throws SQLException {
        return false;
        return statement.getTime(getColumnOriginalIndex(columnIndex));
    @Override

    @Override
    }
    }
    }
    public void updateByte(int columnIndex, byte x) throws SQLException {
    public void updateBlob(String columnLabel, Blob x) throws SQLException {
    }
    @Override
    public InputStream getBinaryStream(String columnLabel) throws SQLException {
    public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
    }
     */
    }
    }
    public int getType() throws SQLException {
    public byte getByte(int parameterIndex) throws SQLException {

    }
    }
        final MappedLocalResultSetColumn column = new MappedLocalResultSetColumn(this, label, dataKind, localIndex, originalIndex);
    }
        throw new SQLFeatureNotSupportedException();
        return false;
    }

    @Override
        return statement.getTime(parameterName);
    public boolean absolute(int row) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }
    @Override

        throw new SQLFeatureNotSupportedException();
}
    }
    public void updateClob(String columnLabel, Reader reader) throws SQLException {
    public Statement getStatement() throws SQLException {

    {
    }

        return statement.getBigDecimal(columnLabel);
        curPosition = row;
    public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
    public int getConcurrency() throws SQLException {
        return statement.getBoolean(getColumnOriginalIndex(parameterIndex));


    @Override
    public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
    public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
    @Override
 *


    public Array getArray(String parameterName) throws SQLException {
    @Override
    public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
    @Override
    public Ref getRef(String parameterName) throws SQLException {
    public double getDouble(String parameterName) throws SQLException {

    public Clob getClob(int columnIndex) throws SQLException {
        } catch (SQLException e) {

    public void insertRow() throws SQLException {
    public Clob getClob(String parameterName) throws SQLException {
        return TYPE_SCROLL_SENSITIVE;
    }
    public void updateRef(String columnLabel, Ref x) throws SQLException {
    }
    public void refreshRow() throws SQLException {
    public long getLong(int parameterIndex) throws SQLException {
 * you may not use this file except in compliance with the License.
    }
import java.sql.*;


        }
    public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
    public Reader getNCharacterStream(int parameterIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

    public void updateBytes(String columnLabel, byte[] x) throws SQLException {
        throw new SQLFeatureNotSupportedException();
        return statement.getURL(getColumnOriginalIndex(parameterIndex));

        throw new SQLFeatureNotSupportedException();
    public String getString(int parameterIndex) throws SQLException {
    @Override
    /** @deprecated Use {@link JDBCResultSetCallable#addColumn(String, DBPDataKind, int, int)} instead */
    public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
    }

    @Override
import org.jkiss.dbeaver.model.DBPDataKind;
    @Override
    @Override
import java.util.Map;
        return statement.getBoolean(parameterName);
        return statement.getArray(getColumnOriginalIndex(columnIndex));
        throw new SQLFeatureNotSupportedException();


    public boolean relative(int rows) throws SQLException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        try {

