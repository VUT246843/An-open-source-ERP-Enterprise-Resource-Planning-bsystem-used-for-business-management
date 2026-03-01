        stream.write(b);
    }
        stream.write(b);
    @Override

/*
        bytesWritten += len;
    private final OutputStream stream;

    }
    }
import java.io.OutputStream;
        stream.flush();
    public void write(@NotNull byte[] b) throws IOException {

    public long getBytesWritten() {
    public StatOutputStream(OutputStream stream) {
    }


        bytesWritten++;
    public void close() throws IOException {
    }
 * Unless required by applicable law or agreed to in writing, software
public class StatOutputStream extends OutputStream {
 * See the License for the specific language governing permissions and
 *
package org.jkiss.dbeaver.tools.transfer.stream;

    @Override
    public void write(@NotNull byte[] b, int off, int len) throws IOException {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
    }
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
        this.stream = stream;
    public void flush() throws IOException {
    @Override
    @Override
    private long bytesWritten = 0;

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void write(int b) throws IOException {
        bytesWritten += b.length;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.IOException;

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * limitations under the License.
 *
    }
        return bytesWritten;
        stream.close();
        stream.write(b, off, len);
 */

