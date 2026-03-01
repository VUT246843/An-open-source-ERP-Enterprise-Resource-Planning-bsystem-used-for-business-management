    @NotNull

            return;
            } finally {
    }
            throw new DBCException(e, executionContext);
        super.release();
}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                throw new DBCException("Error when reading BFILE length", e, executionContext);
        try {
    }
        } catch (Throwable e) {
                    // Create new local storage
            try {
                                getDefaultEncoding());
    }
        }
            }
 * you may not use this file except in compliance with the License.
            } catch (Throwable e) {
            }
    {
                closeFile();
import org.jkiss.dbeaver.runtime.DBWorkbench;
public class OracleContentBFILE extends JDBCContentLOB {
        return bfile == null && storage == null;
        throw new DBCException("BFILE update not supported");
            try {
                        ContentUtils.deleteTempFile(tempFile);
                if (openLocally) {
    @Override
            bfile = null;
                DBPPlatform platform = DBWorkbench.getPlatform();
                if (contentLength < platform.getPreferenceStore().getInt(ModelPreferences.MEMORY_CONTENT_MAX_SIZE)) {
                                bs,
        }
                    try {
                        }
                }
                            storage = BytesContentStorage.createFromStream(
 *
    public String getContentType()
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
        return MimeTypes.OCTET_STREAM;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    "length");

            BeanUtils.invokeObjectMethod(bfile, "closeFile");
        } catch (Throwable e) {
                    this.storage = new TemporaryContentStorage(platform, tempFile, getDefaultEncoding(), true);

                    bfile,
    }
        if (opened) {
                        tempFile = ContentUtils.createTempContentFile(monitor, platform, "blob" + bfile.hashCode());
            return (InputStream) BeanUtils.invokeObjectMethod(
    {
 *
    private Object bfile;
import org.jkiss.dbeaver.model.data.storage.TemporaryContentStorage;
 * DBeaver - Universal Database Manager
    {
import java.nio.file.Files;
    }
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCContentLOB;
import org.jkiss.dbeaver.ModelPreferences;
            }
        return bfile;
                    try {
    {
    public String getDisplayString(@NotNull DBDDisplayFormat format)
            throw new DBCException(e, executionContext);
                                contentLength,
                openFile();
        }
                    bfile,
    @Override
import org.jkiss.dbeaver.model.exec.DBCException;
    }

                    } catch (IOException e) {
                        throw new DBCException("IO error while reading content", e);
    public long getLOBLength() throws DBCException {
    }
        this.bfile = bfile;
import java.io.OutputStream;
                } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.DBDContentStorage;
            opened = true;
                        try (InputStream bs = getInputStream()) {

                }
import org.jkiss.dbeaver.model.data.storage.BytesContentStorage;
        if (!opened) {

 */
    private static final Log log = Log.getLog(OracleContentBFILE.class);

import java.io.IOException;
 * limitations under the License.
import org.jkiss.code.NotNull;
                    try (OutputStream os = Files.newOutputStream(tempFile)) {
    @Override
                name = (String) BeanUtils.invokeObjectMethod(
                }
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others



 */
            BeanUtils.invokeObjectMethod(bfile, "openFile");
    public void bindParameter(JDBCSession session, JDBCPreparedStatement preparedStatement, DBSTypedObject columnType, int paramIndex)
                if (length instanceof Number) {
                long contentLength = getContentLength();
        } catch (Throwable e) {
                    } catch (IOException e) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.Log;
        }

    public boolean isNull()
                }

import org.jkiss.dbeaver.model.app.DBPPlatform;
                    } catch (Throwable e) {
import org.jkiss.dbeaver.utils.ContentUtils;
    public OracleContentBFILE(DBCExecutionContext executionContext, Object bfile) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        return bfile == null && storage == null ? null : "[BFILE:" + name + "]";
import org.jkiss.utils.BeanUtils;
    }
                    closeFile();
    @Override
                "getBinaryStream");
        if (storage == null && bfile != null) {
            boolean openLocally = !opened;
        }
    {
                bfile,
 * You may obtain a copy of the License at
                if (openLocally) {
    {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            }
            return;
                    }
/*

    private void openFile() throws DBCException {
 * See the License for the specific language governing permissions and
                    }
        if (bfile != null) {
        }
                        throw new DBCException("IO error while copying stream", e);
    }
        if (this.bfile != null) {


    public void release()
    {
                    }
    public Object getRawValue() {
import org.jkiss.dbeaver.utils.MimeTypes;
        try {
        releaseBlob();
                            ContentUtils.copyStreams(bs, contentLength, os, monitor);
    @Override
    private InputStream getInputStream() throws DBCException {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            finally {
                    Path tempFile;
        throws DBCException
            try {
        }
package org.jkiss.dbeaver.ext.oracle.data;
    private void releaseBlob() {
                        try (InputStream bs = getInputStream()) {
    }
                releaseBlob();
            } catch (Throwable e) {
    }

            throw new DBCException("Error when reading BFILE length", e, executionContext);
import java.io.InputStream;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                // Free blob - we don't need it anymore
                        throw new DBCException(e, executionContext);
    }
        }
        if (bfile != null) {
 *
                        }
                log.error(e);
        try {
                    "getName");


    private void closeFile() throws DBCException {
    }
 * BFILE content
        super(executionContext);

                    } catch (IOException e) {
        return new OracleContentBFILE(executionContext, null);
            opened = false;
        }
    private boolean opened;
                    openFile();
                final Object length = BeanUtils.invokeObjectMethod(

                        ContentUtils.deleteTempFile(tempFile);
        return 0;
import java.nio.file.Path;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected JDBCContentLOB createNewContent()
    public DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor)
                        throw new DBCException("Can't create temporary file", e);
                    return ((Number) length).longValue();
    private String name;
        return storage;
    @Override
        throws DBCException
