    @Override
    }
    }
        throws DBCException
    }
 */
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        }
    {
    @Override
    public InputStream getContentStream()
    {
/**

        if (storage == null) {
        throws DBException

        return data == null;
        super(copyFrom);
        throws IOException
    {
                throw new DBCException("IO error while reading content", e);
 * Unless required by applicable law or agreed to in writing, software



    public void resetContents()
    public JDBCContentBytes cloneValue(DBRProgressMonitor monitor)
    {
            data = null;
    public String getCharset()
 * You may obtain a copy of the License at
        this.modified = false;
    @Override

    @Override
    public JDBCContentBytes(DBCExecutionContext executionContext, byte[] data) {
    {
    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        }
                    if (data != null && Arrays.equals(data, newData)) {
    @Override
        return DBValueFormatting.formatBinaryString(executionContext.getDataSource(), data, format);

                    ContentUtils.close(is);
            if (data2 != null) return Arrays.equals(data, data2);
    @Override
    }
    public boolean equals(Object obj)

        JDBCSession session,
        this.data = this.originalData = DBValueFormatting.getBinaryPresentation(executionContext.getDataSource()).toBytes(data);
            return null;
                    int count = is.read(newData);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            if (data != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import org.jkiss.dbeaver.Log;

    @Override
 * JDBCContentBytes
    @Override
import org.jkiss.dbeaver.model.DBValueFormatting;
        DBSTypedObject columnType,
    {
        super(executionContext);
                preparedStatement.setBytes(paramIndex, data);
        }
    private JDBCContentBytes(JDBCContentBytes copyFrom) {
        return data;
        return cloneValue(monitor);

        if (data == null) {
        if (data == null) {
        throws IOException

 * @author Serge Rider
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    @Override
import org.jkiss.dbeaver.utils.ContentUtils;
        return data == null ? 0 : Arrays.hashCode(data);
    public byte[] getRawValue() {
            try {
        @NotNull DBDContentStorage storage)

                try {
import java.sql.SQLException;

    @Override
    public void release()
}    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            return new ByteArrayInputStream(data);
import org.jkiss.code.NotNull;
        catch (SQLException e) {
    @Override
        return data.length;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    private static final Log log = Log.getLog(JDBCContentBytes.class);
    {
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
    }
    {
                    data = newData;
    public Object getCachedValue()
    }
    @Override
        throws IOException
        if (obj instanceof JDBCContentBytes) {
    public void bindParameter(
        throws DBCException
        this.modified = true;
                    }
 * See the License for the specific language governing permissions and
    @Override
            if (data == null) return data2 == null;
    {
        this.data = this.originalData;
 *
    public JDBCContentBytes(DBCExecutionContext executionContext) {
import java.io.*;
    }
        } else {
        int paramIndex)
    }
        return MimeTypes.OCTET_STREAM;
    public boolean isNull()
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * you may not use this file except in compliance with the License.
            catch (IOException e) {
        @NotNull DBRProgressMonitor monitor,


        try {
    }
        if (data == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * limitations under the License.
 *
    public String getContentType()
    public boolean updateContents(
        return new InputStreamReader(
    public Reader getContentReader()
 *     http://www.apache.org/licenses/LICENSE-2.0

    private byte[] data;
import org.jkiss.dbeaver.utils.MimeTypes;

    {
    @NotNull
    {
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)

/*
        }
    public String getDisplayString(@NotNull DBDDisplayFormat format)
            getContentStream());
package org.jkiss.dbeaver.model.impl.jdbc.data;

                }
    }
                preparedStatement.setNull(paramIndex, columnType.getTypeID());
        JDBCPreparedStatement preparedStatement,
    public long getContentLength() {
            }
        if (this == obj) return true;
                finally {
            return 0;
import java.util.Arrays;
public class JDBCContentBytes extends JDBCContentAbstract implements DBDContentStorage, DBDContentCached {
            byte[] data2 = ((JDBCContentBytes) obj).data;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }

                }
        this.data = this.originalData = null;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            }
        super(executionContext);
import org.jkiss.dbeaver.DBException;


        }
 */
        super(executionContext);
    }
    public JDBCContentBytes(DBCExecutionContext executionContext, String data) {
    }

 *
            } else {
        }
    public JDBCContentBytes cloneStorage(DBRProgressMonitor monitor)
        this.data = this.originalData;
        // Return original data
                    if (count != newData.length) {

    @Override
    private byte[] originalData;
        this.data = copyFrom.data;
        } else {
                InputStream is = storage.getContentStream();
                    }
        this.data = this.originalData = data;
        }
    {
        return false;
    {
        return false;
        return new JDBCContentBytes(this);
                        log.warn("Actual content length (" + count + ") is less than declared (" + newData.length + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        this.originalData = copyFrom.originalData;
    }
    }

    }
    {
    }
 *
            return new ByteArrayInputStream(new byte[0]);
        return this;

                    byte[] newData = new byte[(int)storage.getContentLength()];
        return DBValueFormatting.getDefaultBinaryFileEncoding(executionContext.getDataSource());
    }
        return data;

            throw new DBCException(e, session.getExecutionContext());
    public int hashCode() {
    }
                        return false;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.DBDContentCached;
