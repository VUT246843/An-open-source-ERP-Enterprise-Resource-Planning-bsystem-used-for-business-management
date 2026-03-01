 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!CommonUtils.isEmpty(this.charset)) {
import org.jkiss.dbeaver.utils.ContentUtils;
        }
    public Reader getContentReader()
    }
                    ContentUtils.copyStreams(is, Files.size(file), os, monitor);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean deleteFileOnRelease;
    public Path getDataFile() {
        } catch (IOException e) {
        throws IOException {
import java.nio.file.Files;
 *

    @Override
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        this.file = file;
/**
    private final DBPPlatform platform;
        } else {
                try (OutputStream os = Files.newOutputStream(tempFile)) {
    public TemporaryContentStorage(DBPPlatform platform, Path file, String charset, boolean deleteFileOnRelease) {
        }
    }
 * You may obtain a copy of the License at
 * File content storage
        throws IOException {
    }

import java.nio.charset.Charset;
    private String charset;
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
    public InputStream getContentStream()
import java.io.InputStream;
import java.io.Reader;
        return new TemporaryContentStorage(platform, tempFile, charset, true);
        this.platform = platform;
}
        this.charset = CommonUtils.toString(charset, GeneralUtils.DEFAULT_ENCODING);
        return file;
 */
 */
            ContentUtils.deleteTempFile(file);
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
package org.jkiss.dbeaver.model.data.storage;
        throws IOException {
                }

        return Files.newInputStream(file);
public class TemporaryContentStorage implements DBDContentStorageLocal {
    }
            return Files.newBufferedReader(file);
        Path tempFile = ContentUtils.createTempContentFile(monitor, platform, "copy" + this.hashCode());
    public void release() {
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
/*
    }


import org.jkiss.utils.CommonUtils;
        if (deleteFileOnRelease) {
        return Files.size(file);

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
        // Create new local storage
            throw new IOException(e);
        return this.charset;
    private Path file;

    @Override
 * you may not use this file except in compliance with the License.
import java.nio.file.Path;

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.app.DBPPlatform;
    @Override
            ContentUtils.deleteTempFile(tempFile);

        try {
    public long getContentLength() throws IOException {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBDContentStorage cloneStorage(DBRProgressMonitor monitor)
import java.io.OutputStream;
            return Files.newBufferedReader(file, Charset.forName(this.charset));
    }
        this.deleteFileOnRelease = deleteFileOnRelease;
    @Override

import java.io.IOException;

    public String getCharset() {
            }
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.data.DBDContentStorageLocal;
            try (InputStream is = Files.newInputStream(file)) {
