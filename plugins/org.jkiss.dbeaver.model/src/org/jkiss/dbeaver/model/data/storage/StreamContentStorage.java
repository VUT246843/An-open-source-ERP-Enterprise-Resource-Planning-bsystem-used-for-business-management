    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

 * limitations under the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.utils.GeneralUtils;

    @Override
    @Override
    @Override

        throws IOException
    public StreamContentStorage(InputStream stream)

    public Reader getContentReader()
        return new StreamContentStorage(stream);
    @Override

        return -1;
 * Stream content storage
        IOUtils.close(stream);
        return GeneralUtils.DEFAULT_ENCODING;
import org.jkiss.dbeaver.model.data.DBDContentStorage;

        return stream;
    public void release()
 *

    public String getCharset()
 *

}
    }
/**
    {
        throws IOException
    }
/*
import java.io.InputStreamReader;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    {
    {
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws IOException
    }
public class StreamContentStorage implements DBDContentStorage {
import java.io.IOException;

 */
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.data.storage;
 *
import java.io.InputStream;
    {
    {


 * DBeaver - Universal Database Manager
import org.jkiss.utils.IOUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
        this.stream = stream;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private final InputStream stream;

    @Override
        return new InputStreamReader(stream, getCharset());
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBDContentStorage cloneStorage(DBRProgressMonitor monitor)
    {
    @Override
 */
    public long getContentLength()
import java.io.Reader;
    public InputStream getContentStream()
