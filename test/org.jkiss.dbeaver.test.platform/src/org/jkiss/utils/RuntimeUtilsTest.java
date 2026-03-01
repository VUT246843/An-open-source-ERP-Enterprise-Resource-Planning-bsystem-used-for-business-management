    }
        Assert.assertEquals(Arrays.asList("/bin/sh", "-c", "echo hello && echo world"), RuntimeUtils.splitCommandLine("/bin/sh -c 'echo hello && echo world'", true));
        Assert.assertEquals(Arrays.asList("ls", "-l", "/home/\"folder with quotes\""), RuntimeUtils.splitCommandLine("ls -l /home/\\\"folder\\ with\\ quotes\\\"", true));
import java.util.Arrays;

 * distributed under the License is distributed on an "AS IS" BASIS,

    }

 * You may obtain a copy of the License at
import org.junit.Test;
/*

    public void testBackslashEscape() {
    @Test
    public void testSplitCommandLine() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
}
    }
 *

        Assert.assertEquals(Collections.singletonList("C:\\Windows\\notepad.exe"), RuntimeUtils.splitCommandLine("C:\\Windows\\notepad.exe", false));
        Assert.assertEquals(Arrays.asList("ls", "-l", "/home/folder with spaces"), RuntimeUtils.splitCommandLine("ls -l /home/folder\\ with\\ spaces", true));

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 */
import org.junit.Assert;
 * DBeaver - Universal Database Manager
import java.util.Collections;
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.utils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.RuntimeUtils;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public class RuntimeUtilsTest extends DBeaverUnitTest {
    public void testBackslashPath() {
    @Test
        Assert.assertEquals(Collections.singletonList("C:\\Windows\\notepad.exe"), RuntimeUtils.splitCommandLine("C:\\\\Windows\\\\notepad.exe", true));
import org.jkiss.junit.DBeaverUnitTest;
 * limitations under the License.
    @Test
