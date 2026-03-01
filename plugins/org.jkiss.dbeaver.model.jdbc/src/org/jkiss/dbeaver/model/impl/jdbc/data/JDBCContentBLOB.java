        try {
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                    try {

        super(dataSource);
        }
            try {
 *
                handleContentReadingException(e);
                tmpStream = storage.getContentStream();
            throw new DBCException("Error while reading content", e);
                try {

/**
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                                }
import org.jkiss.dbeaver.model.DBValueFormatting;
                                bs,
    public void bindParameter(JDBCSession session, JDBCPreparedStatement preparedStatement, DBSTypedObject columnType, int paramIndex)
        throws DBCException
                                    preparedStatement.setBinaryStream(paramIndex, tmpStream, (int)blob.length());

                                preparedStatement.setBinaryStream(paramIndex, tmpStream, storage.getContentLength());
            throw new DBCException(e, session.getExecutionContext());
        if (blob == null && storage == null) {
    public long getLOBLength() throws DBCException {
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
import java.nio.file.Path;
 */
import org.jkiss.dbeaver.model.app.DBPPlatform;
            } catch (Throwable e) {
    }
        }
import org.jkiss.dbeaver.model.exec.DBCException;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                return DBValueFormatting.formatBinaryString(executionContext.getDataSource(), (byte[]) cachedValue, format);
    }
            } catch (Throwable e) {
                                contentLength,
                        preparedStatement.setBinaryStream(paramIndex, tmpStream);
        return storage;
                                } else {
    @Override
    }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.utils.MimeTypes;
import java.sql.SQLException;
            return null;
                if (contentLength < platform.getPreferenceStore().getInt(ModelPreferences.MEMORY_CONTENT_MAX_SIZE)) {
    public String getContentType()
                catch (Throwable e) {

            }
    {
                    } catch (Throwable e) {
                }
        }
                        }

                preparedStatement.setNull(paramIndex, java.sql.Types.BLOB);
        }
        if (storage != null && storage instanceof DBDContentCached) {
                            throw (SQLException)e;
    public boolean isNull()
    }
                    }
        return new JDBCContentBLOB(executionContext, null);
                        if (e instanceof SQLException) {

                                getDefaultEncoding());
                    releaseTempStream();
                        // Let's try bytes
                        try (InputStream bs = blob.getBinaryStream()) {
                        } else {
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                            catch (Throwable e1) {
                    try {
                    tmpStream = blob.getBinaryStream();
        releaseBlob();
                // Errors just spam log
        }
                return blob.length();
        throws DBCException
                            }
                        ContentUtils.deleteTempFile(tempFile);
        if (tmpStream != null) {
                        throw new DBCException(e, executionContext);

        }
    @Override
        }
                } else {
        releaseTempStream();
                long contentLength = getContentLength();
                    } catch (IOException e) {
                }
 * @author Serge Rider
        if (blob != null) {
                    Path tempFile;

                        preparedStatement.setBytes(paramIndex, buffer.toByteArray());
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }
    public String getDisplayString(@NotNull DBDDisplayFormat format)
            blob = null;
                // Log as warning only if it is an exception.
        }
            }
                blob.free();
    public void release()
    {
            // Free blob - we don't need it anymore
                        throw new DBCException(e, executionContext);

                                    throw (SQLException)e1;
                    }
    }
    }
                        preparedStatement.setBinaryStream(paramIndex, blob.getBinaryStream());
    {
package org.jkiss.dbeaver.model.impl.jdbc.data;
import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");
        catch (Throwable e) {
                        } else {
                    }
        catch (SQLException e) {
            ContentUtils.close(tmpStream);
                    if (columnType.getDataKind() == DBPDataKind.BINARY) {
                            try {
                try {
 * Unless required by applicable law or agreed to in writing, software

    @Override
                            storage = BytesContentStorage.createFromStream(
        return MimeTypes.OCTET_STREAM;
    @Override
import org.jkiss.dbeaver.model.data.storage.BytesContentStorage;

    }
    }
                        ContentUtils.copyStreams(tmpStream, contentLength, buffer, session.getProgressMonitor());
                        }
                    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    catch (Throwable e) {
                DBPPlatform platform = DBWorkbench.getPlatform();
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import java.io.IOException;
                        ContentUtils.deleteTempFile(tempFile);
                }
        return 0;
                        if (e instanceof SQLException) {
                            try {
                    try {
 *
import java.sql.Blob;
    @Override
            }
    private InputStream tmpStream;
                                    preparedStatement.setBinaryStream(paramIndex, tmpStream, (int)storage.getContentLength());
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)
 *
                            catch (Throwable e1) {
    protected JDBCContentLOB createNewContent()
                        throw new DBCException("Can't create temporary file", e);
                        throw new DBCException("IO error while reading content", e);
import java.sql.SQLFeatureNotSupportedException;
            tmpStream = null;
    }
 * limitations under the License.
    private static final Log log = Log.getLog(JDBCContentBLOB.class);

                    } catch (IOException e) {
    private void releaseBlob() {
import org.jkiss.dbeaver.model.data.DBDContentCached;
                            throw (SQLException)e;
            } else {

        super.release();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        }
            if (storage != null) {
                                } else {
import org.jkiss.dbeaver.model.data.storage.TemporaryContentStorage;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
                    } catch (IOException e) {
    {
    {
                }
                releaseTempStream();
 * you may not use this file except in compliance with the License.
    @Override
                    } catch (Throwable e) {
                        }
    }
    @NotNull
    private void releaseTempStream() {
import org.jkiss.dbeaver.ModelPreferences;
        return "[BLOB]";

                            }
    }
public class JDBCContentBLOB extends JDBCContentLOB {
 *
                                if (e1 instanceof SQLException) {
                        ByteArrayOutputStream buffer = new ByteArrayOutputStream(contentLength);
                catch (Throwable e0) {
import java.io.OutputStream;
    public JDBCContentBLOB(DBCExecutionContext dataSource, Blob blob) {
            }
        return blob == null && storage == null;
        return blob;
                    try (OutputStream os = Files.newOutputStream(tempFile)) {
import org.jkiss.dbeaver.utils.ContentUtils;
                log.debug("Error freeing BLOB: " + e.getClass().getName() + ": " + e.getMessage());
        this.blob = blob;
    public Object getRawValue() {
}
                    // Write new blob value
            final Object cachedValue = ((DBDContentCached) storage).getCachedValue();
 * You may obtain a copy of the License at
                // Write new blob value
        if (blob != null) {
                        preparedStatement.setBlob(paramIndex, blob);
                    }

                                preparedStatement.setBinaryStream(paramIndex, tmpStream, blob.length());
    private Blob blob;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            if (cachedValue instanceof byte[]) {
/*
    @Override
                    }
 * See the License for the specific language governing permissions and
            try {
                    this.storage = new TemporaryContentStorage(platform, tempFile, getDefaultEncoding(), true);
    @Override
        if (storage == null && blob != null) {
                                    throw (SQLException)e1;
            try {

import java.io.InputStream;
    @Override
            } catch (DBCException e) {
                                }
                        }
                        tempFile = ContentUtils.createTempContentFile(monitor, platform, "blob" + blob.hashCode());
    {
            releaseBlob();
                            }
                    // Create new local storage
            } else if (blob != null) {
                        try (InputStream bs = blob.getBinaryStream()) {
import java.io.ByteArrayOutputStream;
                    preparedStatement.setBinaryStream(paramIndex, tmpStream);
 * JDBCContentBLOB
                    try {
                    }
                            ContentUtils.copyStreams(bs, contentLength, os, monitor);
                        // Stream values seems to be unsupported
                    } catch (SQLFeatureNotSupportedException | UnsupportedOperationException | IncompatibleClassChangeError e1) {
                                if (e1 instanceof SQLException) {
                    } else {
import java.nio.file.Files;
import org.jkiss.dbeaver.model.DBPDataKind;
                        throw new DBCException("IO error while copying stream", e);
                        int contentLength = (int) storage.getContentLength();
                throw new DBCException(e, executionContext);
    }
                            }
