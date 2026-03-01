            int count = stream.read(charBuffer);
    public static StringContentStorage createFromReader(Reader stream)
            }
    }
 *
import org.jkiss.dbeaver.model.data.DBDContentStorage;
    public void release()

        return new ByteArrayInputStream(data.getBytes(GeneralUtils.getDefaultFileEncoding()));
    @Override
    @Override
import java.io.*;

            buffer.append(charBuffer, 0, count);
    @NotNull
        return new StringContentStorage(buffer.toString());
    public InputStream getContentStream()
        }
            int count = stream.read(charBuffer);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
    {
 *
 * See the License for the specific language governing permissions and
    public String getCachedValue() {
    {
        throws IOException
    public static StringContentStorage createFromReader(
        char[] charBuffer = new char[10000];

 * Licensed under the Apache License, Version 2.0 (the "License");
        throws IOException
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others


    {
            log.warn("Actual content length (" + buffer.length() + ") is less than declared: " + contentLength);
/*
import org.jkiss.utils.CommonUtils;
    }
        for (;;) {

 * String content storage
}
 * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(StringContentStorage.class);

        data = null;
    }

        throws IOException
            if (count <= 0) {
            }
        if (contentLength > Integer.MAX_VALUE / 2) {
        throws IOException
                break;

 * limitations under the License.
        this.data = data;
        }
        return GeneralUtils.getDefaultFileEncoding();

    private String data;
    public String getCharset()
    }
 *
    }
    {
    public Reader getContentReader()
 *     http://www.apache.org/licenses/LICENSE-2.0
    public long getContentLength()
            buffer.append(charBuffer, 0, count);
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                break;
    {
package org.jkiss.dbeaver.model.data.storage;
            throw new IOException("Too big content length for memory storage: " + contentLength);
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
    @Override
public class StringContentStorage implements DBDContentStorage, DBDContentCached {
    {

import org.jkiss.dbeaver.model.data.DBDContentCached;
import org.jkiss.dbeaver.Log;
 */
        return new StringReader(CommonUtils.notEmpty(data));
        StringBuilder buffer = new StringBuilder(1000);
        throws IOException
    @Override
/**
        }

    {
            char[] charBuffer = new char[10000];
        }

    @Override
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public StringContentStorage(String data)
        long contentLength)
    {
        StringBuilder buffer = new StringBuilder((int) contentLength);
            if (count <= 0) {
    public DBDContentStorage cloneStorage(DBRProgressMonitor monitor)

        return data;
    }
        return data == null ? 0 : data.length();
        Reader stream,
        return new StringContentStorage(buffer.toString());
        if (buffer.length() != contentLength) {
 */
    }
        return new StringContentStorage(data);
 * DBeaver - Universal Database Manager
        for (;;) {

