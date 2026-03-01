        // Unread bytes if necessary and skip BOM marks.

     * @throws IOException If an I/O error occurs.
            unread = n - 2;
        byte bom[] = new byte[BOM_SIZE];
        int unread;
 * You may obtain a copy of the License at
        } else if ((bom[0] == (byte) 0xFE) && (bom[1] == (byte) 0xFF)) {
            unread = n;

    }
    private final InputStreamReader reader;
    public String getEncoding()
    public void close() throws IOException
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    /**

        if (encoding == null) {
            pushbackStream.unread(bom, (n - unread), unread);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        reader.close();
            encoding = defaultCharset;
        Charset encoding;
     * Construct UnicodeReader

            reader = new InputStreamReader(pushbackStream, encoding);
import java.nio.charset.Charset;
package org.jkiss.dbeaver.utils;
    {
     * @param defaultCharset Default encoding to be used if BOM is not found,
import java.io.*;
 * See the License for the specific language governing permissions and
            reader = new InputStreamReader(pushbackStream);
    {
public class UnicodeReader extends Reader {
            unread = n - 3;
    public int read(char[] cbuf, int off, int len) throws IOException
     * @param in              Input stream.
            unread = n - 4;
        } else {
    }
    {


            encoding = StandardCharsets.UTF_8;
 */
        }
        } else if ((bom[0] == (byte) 0xFF) && (bom[1] == (byte) 0xFE) && (bom[2] == (byte) 0x00) && (bom[3] == (byte) 0x00)) {
    }
     */
 * Unless required by applicable law or agreed to in writing, software


        }
        return reader.getEncoding();
 * you may not use this file except in compliance with the License.
     *                        or <code>null</code> to use system default encoding.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            unread = n - 4;
            pushbackStream.unread(bom, 0, 0);
        if (unread > 0) {
    @Override
        }
        if ((bom[0] == (byte) 0xEF) && (bom[1] == (byte) 0xBB) && (bom[2] == (byte) 0xBF)) {
            unread = n - 2;
            encoding = Charset.forName("UTF-32BE");
        int n = pushbackStream.read(bom, 0, bom.length);
    public UnicodeReader(InputStream in, Charset defaultCharset) throws IOException

 *
 *
    @Override
import java.nio.charset.StandardCharsets;
            encoding = StandardCharsets.UTF_16LE;
            encoding = StandardCharsets.UTF_16BE;
/*
        // Read ahead four bytes and check for BOM marks.
        } else if ((bom[0] == (byte) 0xFF) && (bom[1] == (byte) 0xFE)) {
 * limitations under the License.
        } else {
 *
        return reader.read(cbuf, off, len);
 * DBeaver - Universal Database Manager
        } else if ((bom[0] == (byte) 0x00) && (bom[1] == (byte) 0x00) && (bom[2] == (byte) 0xFE) && (bom[3] == (byte) 0xFF)) {
            encoding = Charset.forName("UTF-32LE");
        PushbackInputStream pushbackStream = new PushbackInputStream(in, BOM_SIZE);
        } else if (unread < -1) {
    }
    private static final int BOM_SIZE = 4;
     *
}
        // Use given encoding.
