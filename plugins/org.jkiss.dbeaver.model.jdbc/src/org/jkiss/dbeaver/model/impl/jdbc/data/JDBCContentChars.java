
/*
 * See the License for the specific language governing permissions and
        if (data == null) {
    @NotNull
    }
    public Object getRawValue() {
    @Override
        catch (SQLException e) {
    {

                try {
        } else {
                finally {

        this.data = this.originalData;
        throws DBCException
    }
        }
    @Override
        }
    public JDBCContentChars(JDBCContentChars copyFrom) {
        return data.length();
    {
        }
        this.data = copyFrom.data;
    }
    @Override
    public Reader getContentReader()
        }
                    StringWriter sw = new StringWriter((int)storage.getContentLength());

        return data == null ? 0 : data.hashCode();
 */
 * @author Serge Rider
        return false;

    @Override

    }
    public InputStream getContentStream()
    {
    public JDBCContentChars(DBCExecutionContext executionContext, String data) {
    {
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
            try {
                    ContentUtils.copyStreams(reader, storage.getContentLength(), sw, monitor);
        this.originalData = copyFrom.originalData;
    @Override
            return new ByteArrayInputStream(data.getBytes(getCharset()));
 * DBeaver - Universal Database Manager
        super(executionContext);
import java.io.*;
 * Unless required by applicable law or agreed to in writing, software

    public boolean equals(Object obj)
        return cloneValue(monitor);
    {
            return new ByteArrayInputStream(new byte[0]);
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    {
    public void bindParameter(JDBCSession session, JDBCPreparedStatement preparedStatement,
                ? data
        return DBValueFormatting.getDefaultBinaryFileEncoding(executionContext.getDataSource());
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getCharset()
    }
            // Empty content
    public boolean updateContents(
            }
    public boolean isNull()
        try {
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                Reader reader = storage.getContentReader();

    @Override

        @NotNull DBDContentStorage storage)
            throw new DBCException(e, session.getExecutionContext());

 *

    @Override
import org.jkiss.dbeaver.utils.ContentUtils;
    private String originalData;

            return new StringReader(data);
    }
                : CommonUtils.compactWhiteSpaces(data);

    }
    @Override
        } else {

        this.data = this.originalData;
        return

import java.sql.SQLException;
        if (data == null) {
            }
                preparedStatement.setNull(paramIndex, columnType.getTypeID());
    @Override
    public JDBCContentChars cloneStorage(DBRProgressMonitor monitor)
 */
                }
    public int hashCode() {
            return new StringReader(""); //$NON-NLS-1$
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    {
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)
        throws IOException
        throws DBException
        return this;
        }
    private static final int MAX_LENGTH_REMOVE_WHITESPACES = 250 + 1;
                }
    @Override
 * You may obtain a copy of the License at
        this.modified = false;
import org.jkiss.dbeaver.model.DBValueFormatting;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        throws DBCException
    }
            return 0;
        throws IOException
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
                preparedStatement.setString(paramIndex, data);
        return data == null || format == DBDDisplayFormat.EDIT || data.length() > MAX_LENGTH_REMOVE_WHITESPACES
import org.jkiss.dbeaver.model.data.DBDContentCached;
    }
            // Empty content

    public JDBCContentChars cloneValue(DBRProgressMonitor monitor)

        return MimeTypes.TEXT_PLAIN;
    }

    }


    {
 *
 *
        return data == null;
        return data;
            if (data != null) {
        } else {
    public String getDisplayString(@NotNull DBDDisplayFormat format) {
 * you may not use this file except in compliance with the License.
/**
        return new JDBCContentChars(this);
    {
        if (storage == null) {
    @Override
    @Override
    public long getContentLength() {
 *
            } else {
        if (data == null) {
        @NotNull DBRProgressMonitor monitor,
    }
    }
    @Override

    {
            data = null;
import org.jkiss.code.NotNull;
        super(copyFrom);
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            }

            catch (IOException e) {
    {
    }

        this.modified = true;
    {
import org.jkiss.dbeaver.utils.MimeTypes;
    public String getContentType()
    //+1 due to tooltip truncation is done at 250 chars. So must be more to see if truncated or not
package org.jkiss.dbeaver.model.impl.jdbc.data;
    }

    }

            CommonUtils.equalObjects(data, ((JDBCContentChars) obj).data);
 * JDBCContentChars
    @Override
    public void release()
    protected String data;
                              DBSTypedObject columnType, int paramIndex)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
                throw new DBCException("IO error while reading content", e);
    }
    }
    public Object getCachedValue()
public class JDBCContentChars extends JDBCContentAbstract implements DBDContentStorage, DBDContentCached {
                    ContentUtils.close(reader);
}
    }
        return data;
    public void resetContents()
        this.data = this.originalData = data;
                    data = sw.toString();
    @Override

import org.jkiss.utils.CommonUtils;
    @Override
            obj instanceof JDBCContentChars &&
    @Override
