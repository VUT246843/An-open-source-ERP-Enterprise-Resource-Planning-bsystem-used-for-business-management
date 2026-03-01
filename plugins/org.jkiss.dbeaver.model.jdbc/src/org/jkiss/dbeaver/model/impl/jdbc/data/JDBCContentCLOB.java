            releaseClob();
        if (storage == null && clob != null) {
                        tmpReader
                        throw new DBCException("IO error while copying content", e);
        }
                            throw new DBCException(e, executionContext);
                            storage = StringContentStorage.createFromReader(clob.getCharacterStream(), contentLength);
import org.jkiss.dbeaver.model.data.storage.StringContentStorage;
                                    (int) streamLength
import org.jkiss.dbeaver.ModelPreferences;
    @Override
            }
        }
                        ContentUtils.deleteTempFile(tempFile);
        if (clob == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                DBPPlatform platform = DBWorkbench.getPlatform();
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.model.data.DBDContent;
                    try {

                    try {
            try {
        try {
                long contentLength = getContentLength();
            return 0;
    private static final Log log = Log.getLog(JDBCContentCLOB.class);
import org.jkiss.utils.CommonUtils;
    @Override
 * @author Serge Rider
    private Reader tmpReader;
                if (storage instanceof ExternalContentStorage) {
    private void releaseTempStream() {
    }
        return MimeTypes.TEXT_PLAIN;
                return CommonUtils.toString(((DBDContentCached) storage).getCachedValue());
        if (storage != null) {

                }
            if (storage != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void release()
import org.jkiss.dbeaver.utils.MimeTypes;
    public Object getRawValue() {
import java.nio.file.Files;
    @Override
public class JDBCContentCLOB extends JDBCContentLOB implements DBDContent {
                        try {
            }
                    );
                }
 * DBeaver - Universal Database Manager
    public void bindParameter(
                preparedStatement.setNull(paramIndex, java.sql.Types.CLOB);
    @Override
    {
            tmpReader = null;
                    }
        return "[CLOB]";
                    }
                        ContentUtils.copyStreams(clob.getCharacterStream(), contentLength, os, monitor);
                // Try 3 jdbc methods to set character stream

            if (storage instanceof DBDContentCached) {
        return storage;
    {

import org.jkiss.dbeaver.model.data.DBDContentStorage;
    {
            } catch (DBCException e) {
                            }
    @Override
    public String getDisplayString(@NotNull DBDDisplayFormat format)
        throws DBCException
                    preparedStatement.setNCharacterStream(

                            } else {
import java.io.Reader;
                        try {
    }
        releaseClob();
 * JDBCContentCLOB
                    } else {
        if (tmpReader != null) {
        return clob == null && storage == null;
                clob.free();
    private void releaseClob() {
        return clob;
                releaseTempStream();
                } else {
            throw new DBCException(e, session.getExecutionContext());
        releaseTempStream();
        }
                            if (e1 instanceof SQLException && !(JDBCUtils.isFeatureNotSupportedError(session.getDataSource(), e1))) {

                        tempFile = ContentUtils.createTempContentFile(monitor, platform, "clob" + clob.hashCode());
        }
                tmpReader = storage.getContentReader();
//                String stringValue = ContentUtils.getContentStringValue(session.getProgressMonitor(), this);
                    return "[" + ((ExternalContentStorage) storage).getFile().getFileName() + "]";
                        throw new DBCException("Can't create temp file", e);
import org.jkiss.dbeaver.utils.ContentUtils;
    @Override

    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
import org.jkiss.dbeaver.model.data.storage.ExternalContentStorage;
            clob = null;
 * You may obtain a copy of the License at
            try {
        super.release();
                        } catch (Throwable e1) {
    @Override
                        storage = new JDBCContentChars(executionContext, subString);
                            preparedStatement.setCharacterStream(
    }
/*
                    if (e instanceof SQLException && !(JDBCUtils.isFeatureNotSupportedError(session.getDataSource(), e))) {
                    }
                preparedStatement.setClob(paramIndex, clob);
    public long getLOBLength() throws DBCException {
                    try (Writer os = Files.newBufferedWriter(tempFile, Charset.forName(getDefaultEncoding()))) {
            // Free lob - we don't need it anymore
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

                handleContentReadingException(e);
        } catch (SQLException e) {
                        String subString = clob.getSubString(1, (int) contentLength);
        this.clob = clob;

                        throw (SQLException) e;

                        throw new DBCException(e, executionContext);
                            throw new DBCException("IO error while reading content", e);
 * you may not use this file except in compliance with the License.
                            );
            } catch (Throwable e) {
            throw new DBCException(e, executionContext);
package org.jkiss.dbeaver.model.impl.jdbc.data;
        }
                    } catch (Throwable e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
}

 */
                    } catch (IOException e) {
        }
 *
    @Override
        }
import org.jkiss.dbeaver.Log;
        } catch (Throwable e) {
            } else if (clob != null) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    @NotNull
                        log.debug("Can't get CLOB as substring", e);
    {
    }
 *
            return clob.length();
/**

                                    paramIndex,
    {
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)
import java.sql.SQLException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.storage.TemporaryContentStorage;
        return new JDBCContentCLOB(executionContext, null);
                    // Create new local storage
            throw new DBCException("IO error while binding content", e);
                        long streamLength = ContentUtils.calculateContentLength(storage.getContentReader());
            return null;

                        } catch (Throwable e1) {
import java.nio.file.Path;
import org.jkiss.dbeaver.model.data.DBDContentCached;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    {
        } catch (Throwable e) {
import java.io.Writer;
                }
//                preparedStatement.setString(paramIndex, stringValue);
import org.jkiss.code.NotNull;

 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
                } catch (Throwable e) {
    ) throws DBCException {
        super(executionContext);
                        ContentUtils.deleteTempFile(tempFile);
        if (clob != null) {
            }
                        }
 * See the License for the specific language governing permissions and
        DBSTypedObject columnType, int paramIndex
 */
    }
                    } catch (Exception e) {
import java.nio.charset.Charset;
import org.jkiss.dbeaver.model.app.DBPPlatform;
        JDBCSession session, JDBCPreparedStatement preparedStatement,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                streamLength
        if (clob == null && storage == null) {

                                preparedStatement.setCharacterStream(
            } else {
                        }
                        } catch (IOException e1) {
        }
    public boolean isNull()
            ContentUtils.close(tmpReader);
        try {
                                    tmpReader,
    public JDBCContentCLOB(DBCExecutionContext executionContext, Clob clob) {
import java.sql.Clob;

 * Unless required by applicable law or agreed to in writing, software
                                paramIndex,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
                try {
                    }
                log.debug("Error freeing CLOB: " + e.getClass().getName() + ": " + e.getMessage());
                                throw (SQLException) e1;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                tmpReader,
            } else {
                                );
    }
                // Log as warning only if it is an exception.
            }
import org.jkiss.dbeaver.model.exec.DBCException;
    private Clob clob;
    public String getContentType()
                    } catch (IOException e) {
    protected JDBCContentLOB createNewContent()

                    this.storage = new TemporaryContentStorage(platform, tempFile, getDefaultEncoding(), true);
    }
    }
import java.io.IOException;
                    Path tempFile;
                if (contentLength < platform.getPreferenceStore().getInt(ModelPreferences.MEMORY_CONTENT_MAX_SIZE)) {
                        paramIndex,
