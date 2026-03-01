        final byte[] b = new byte[bytes.length];
 * DBeaver - Universal Database Manager

    public void testUtf8WithBom() throws IOException {
            if (bytes[i] > 0xFF) {
        return new BufferedReader(new InputStreamReader(is, bom.getCharsetName()));

    }
}
        final BufferedReader rd = reader(ByteOrderMark.UTF_8, is);
        final BufferedReader rd = reader(ByteOrderMark.UTF_8, is);
                throw new IllegalArgumentException("Byte cannot fit");
import org.junit.Test;
import org.jkiss.junit.DBeaverUnitTest;
        Assert.assertEquals(ByteOrderMark.UTF_8, is.getBOM());
        Assert.assertTrue(is.hasBOM());
            b[i] = (byte) (bytes[i] & 0xff);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final BOMInputStream is = input(ByteOrderMark.UTF_8, 0xF0, 0x9F, 0x94, 0xA5);
 * you may not use this file except in compliance with the License.
import java.io.*;
public class BOMInputStreamTest extends DBeaverUnitTest {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        }

    public void testUtf8WithoutBom() throws IOException {
    }
        final BOMInputStream is = input(ByteOrderMark.UTF_8, 0xEF, 0xBB, 0xBF, 0xF0, 0x9F, 0x94, 0xA5);
package org.jkiss.utils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Test

 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
            }
        Assert.assertEquals("\uD83D\uDD25", rd.readLine());
// http://www.ltg.ed.ac.uk/~richard/utf-8.cgi
import org.jkiss.utils.io.BOMInputStream;
    @NotNull
import org.jkiss.utils.io.ByteOrderMark;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new BOMInputStream(new ByteArrayInputStream(b), bom);

/*
    @NotNull
        Assert.assertFalse(is.hasBOM());
    private static BufferedReader reader(@NotNull ByteOrderMark bom, @NotNull InputStream is) throws IOException {
 * limitations under the License.
        Assert.assertEquals("\uD83D\uDD25", rd.readLine());
 * You may obtain a copy of the License at
 *
 *
 *
import org.jkiss.code.NotNull;
    private static BOMInputStream input(@NotNull ByteOrderMark bom, int... bytes) {
        for (int i = 0; i < bytes.length; i++) {
    @Test
import org.junit.Assert;
    }
 */
 * Unless required by applicable law or agreed to in writing, software
