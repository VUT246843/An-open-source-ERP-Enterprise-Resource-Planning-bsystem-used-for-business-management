            ContentUtils.deleteTempFile(tempFile);
                    ContentUtils.copyStreams(is, Files.size(file), os, monitor);
        this.file = file;
    {
        // Create new local storage
import org.jkiss.code.NotNull;
 * File content storage
    public DBDContentStorage cloneStorage(DBRProgressMonitor monitor)
        } catch (IOException e) {
 */
    }
import java.io.IOException;
}
            try (InputStream is = Files.newInputStream(file)) {
    @Override
    @Override
                }
    }
 * you may not use this file except in compliance with the License.
    {
        }
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        }
        return charset;
    @Override
/*
    public Path getFile() {
    {
    }
 * DBeaver - Universal Database Manager
    }
        throws IOException
    public Reader getContentReader()
 *     http://www.apache.org/licenses/LICENSE-2.0


        // Do nothing
 * See the License for the specific language governing permissions and
        this.charset = charset;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ExternalContentStorage implements DBDContentStorage {
        }
            }
    }
    public InputStream getContentStream()
    @NotNull

import java.nio.charset.Charset;

    @NotNull
 * You may obtain a copy of the License at
 */
        return file;
 *
    {
        return Files.newInputStream(file);
    private Path file;
    private final DBPPlatform platform;
    @Override
import java.io.InputStream;
    public void release()

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
*/
        this(platform, file, null);
                try (OutputStream os = Files.newOutputStream(tempFile)) {
    {
    public ExternalContentStorage(@NotNull DBPPlatform platform, @NotNull Path file, String charset)
        return new TemporaryContentStorage(platform, tempFile, charset, true);
    {
    @NotNull
    @Override
    @NotNull
    public ExternalContentStorage(@NotNull DBPPlatform platform, @NotNull Path file)
            return Files.newBufferedReader(file, StandardCharsets.UTF_8);
            throw new IOException(e);
    {
    }
 * limitations under the License.
    }
            return Files.newBufferedReader(file, Charset.forName(charset));
import java.nio.charset.StandardCharsets;
        if (!file.delete()) {
import java.io.Reader;
        Path tempFile = ContentUtils.createTempContentFile(monitor, platform, "copy" + this.hashCode());
import java.io.OutputStream;
        try {
    private String charset;
import java.nio.file.Files;
    public String getCharset()

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        this.platform = platform;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        throws IOException
            log.warn("Could not delete temporary file");
        if (charset == null) {
 *
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.data.storage;
/**
    }
/*
import org.jkiss.dbeaver.utils.ContentUtils;



        } else {
        return Files.size(file);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.app.DBPPlatform;
        throws IOException

    public long getContentLength() throws IOException {
    }
import java.nio.file.Path;

 *
