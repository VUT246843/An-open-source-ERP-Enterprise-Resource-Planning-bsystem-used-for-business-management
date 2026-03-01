    {
        byte[] result = baos.toByteArray();
    {
            log.warn("Actual content length (" + result.length + ") is less than declared: " + contentLength);
public class BytesContentStorage implements DBDContentStorage, DBDContentCached {

        long contentLength,
    @Override
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
    public long getContentLength()
    private String encoding;
            throw new IOException("Too big content length for memory storage: " + contentLength);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 *
/*
    @Override

        if (contentLength > Integer.MAX_VALUE) {
        String encoding)
        throws IOException
        return new BytesContentStorage(data, encoding);

    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws IOException

    public DBDContentStorage cloneStorage(DBRProgressMonitor monitor)
import java.nio.charset.Charset;

    {
        IOUtils.copyStream(stream, baos);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getCharset()
    }
    public Reader getContentReader()
import org.jkiss.dbeaver.model.data.DBDContentCached;
        return data.length;
        }
 *
        this.data = data;
    }
    }

import org.jkiss.utils.IOUtils;
    @Override
    public InputStream getContentStream()
        data = null;
    public BytesContentStorage(byte[] data, Charset charset)
        this.encoding = encoding;
    {
 * You may obtain a copy of the License at

import java.io.*;
        throws IOException
    private static final Log log = Log.getLog(BytesContentStorage.class);

    public static BytesContentStorage createFromStream(
    }

    @Override
            getContentStream(),

 *
        return new InputStreamReader(
        throws IOException
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        this.data = data;

    {
/**

    public BytesContentStorage(byte[] data, String encoding)
    public void release()
        if (result.length != contentLength) {
    private byte[] data;
        return data;
 * See the License for the specific language governing permissions and
        }
        return encoding;
        InputStream stream,

            encoding);
    }

    @Override
 * Unless required by applicable law or agreed to in writing, software
    @Override
}
 * Memory content storage
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.data.storage;
    @Override
    public Object getCachedValue() {
    {
 * limitations under the License.
        return new ByteArrayInputStream(data);
import org.jkiss.dbeaver.Log;
 */
        this.encoding = charset.name();
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    {
        return new BytesContentStorage(result, encoding);
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 */
    }

    {
