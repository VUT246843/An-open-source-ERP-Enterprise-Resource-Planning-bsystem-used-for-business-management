 */
    public int available() throws IOException


    @Override
        this.monitor = monitor;
public class ProgressStreamReader extends InputStream {
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
        showProgress(res);
    }
    @Override
/*

 *     http://www.apache.org/licenses/LICENSE-2.0

    public int read() throws IOException
 * You may obtain a copy of the License at

    {
        return original.available();
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.io.IOException;
    private void showProgress(long length)

 * DBeaver - Universal Database Manager
        totalRead += length;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return res;
        long res = original.skip(n);

        this.streamLength = streamLength;
    public void close() throws IOException

    }
    {
    @Override
    {
    {
        return res;
        showProgress(res);
    private long totalRead;
 *

        showProgress(res);
        return res;

        int res = original.read(b);
        this.totalRead = 0;
    static final int BUFFER_SIZE = 10000;
        showProgress(res);
        monitor.worked((int)length);
        monitor.beginTask(task, (int)streamLength);
}
        int res = original.read(b, off, len);
    }
    }
    private final long streamLength;
    {
        original.close();
    public long skip(long n) throws IOException
        monitor.done();
    public int read(byte[] b, int off, int len) throws IOException
package org.jkiss.dbeaver.runtime;
    public int read(byte[] b) throws IOException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

    private final InputStream original;
    }
 *

        this.original = original;
    private final DBRProgressMonitor monitor;
        return res;
 * you may not use this file except in compliance with the License.
 *
    {
        int res = original.read();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

    }
import java.io.InputStream;
    public ProgressStreamReader(DBRProgressMonitor monitor, String task, InputStream original, long streamLength)

    {
    }
 * See the License for the specific language governing permissions and
 * limitations under the License.
