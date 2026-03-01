        Assert.assertTrue(IOUtils.isLocalFile("file:some/path"));
    @Test
        Assert.assertFalse(IOUtils.isLocalFile("s3:/some/path"));
    }
package org.jkiss.utils;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class IOUtilsTest {
/*
 *
import org.junit.Test;

        Assert.assertTrue(IOUtils.isLocalFile("file:/some/path"));
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * See the License for the specific language governing permissions and
import org.junit.Assert;
 * limitations under the License.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        Assert.assertTrue(IOUtils.isLocalFile("\\absolute\\path"));
        Assert.assertTrue(IOUtils.isLocalFile("c:\\absolute\\path"));
        Assert.assertFalse(IOUtils.isLocalFile("s3://some/path"));
    public void testLocalPaths() {
 * you may not use this file except in compliance with the License.
        Assert.assertTrue(IOUtils.isLocalFile("c:/absolute/path"));
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2025 DBeaver Corp and others
        Assert.assertFalse(IOUtils.isLocalFile("gs://some/path"));
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        Assert.assertTrue(IOUtils.isLocalFile("file://some/path"));
}
        Assert.assertTrue(IOUtils.isLocalFile("/absolute/path"));
