        Assert.assertEquals("1M", format.format(MB));
    @Test
 *
        Assert.assertEquals("512GiB", format.format(TB / 2));
        Assert.assertEquals("1023PiB", format.format(PB * 1023));
 * You may obtain a copy of the License at
    public void testFormatLong() {
        Assert.assertEquals("1024PiB", format.format(PB * 1024));
        Assert.assertEquals("1023K", format.format(MB - 1));
        Assert.assertEquals("512PiB", format.format(PB * 512));

public class ByteNumberFormatTest extends DBeaverUnitTest {
import org.jkiss.junit.DBeaverUnitTest;
        Assert.assertEquals("1G", format.format(GB));
 *
        Assert.assertEquals("512M", format.format(GB / 2));
    }
import org.junit.Test;
        Assert.assertEquals("512", format.format(KB / 2));
        Assert.assertEquals("1024P", format.format(PB * 1024));
        Assert.assertEquals("512G", format.format(TB / 2));
 */
 * See the License for the specific language governing permissions and
        Assert.assertEquals("512MiB", format.format(GB / 2));
        Assert.assertEquals("512P", format.format(PB * 512));
 *
        Assert.assertEquals("1K", format.format(KB));
        Assert.assertEquals("2048P", format.format(PB * 2048));
        Assert.assertEquals("512", format.format(KB / 2));
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
    }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.assertEquals("512K", format.format(MB / 2));
    private static final long MB = 1024 * KB;
import org.junit.Assert;
        Assert.assertEquals("512KiB", format.format(MB / 2));

    private static final long KB = 1024;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        final ByteNumberFormat format = new ByteNumberFormat(ByteNumberFormat.BinaryPrefix.ISO);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertEquals("1023P", format.format(PB * 1023));
 * you may not use this file except in compliance with the License.

    private static final long GB = 1024 * MB;
    private static final long PB = 1024 * TB;
    public void testFormatPlain() {
        Assert.assertEquals("1PiB", format.format(PB));
        Assert.assertEquals("0", format.format(0));
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        Assert.assertEquals("1GiB", format.format(GB));
        Assert.assertEquals("1023", format.format(KB - 1));
        Assert.assertEquals("1MiB", format.format(MB));
        final ByteNumberFormat format = new ByteNumberFormat();
package org.jkiss.utils;
        Assert.assertEquals("1023KiB", format.format(MB - 1));

    @Test
        Assert.assertEquals("1023", format.format(KB - 1));
 * DBeaver - Universal Database Manager
        Assert.assertEquals("1023MiB", format.format(GB - 1));
        Assert.assertEquals("1KiB", format.format(KB));
    private static final long TB = 1024 * GB;
        Assert.assertEquals("1023G", format.format(TB - 1));
        Assert.assertEquals("1023GiB", format.format(TB - 1));
        Assert.assertEquals("2048PiB", format.format(PB * 2048));
        Assert.assertEquals("0", format.format(0));
        Assert.assertEquals("1P", format.format(PB));
        Assert.assertEquals("1023M", format.format(GB - 1));

