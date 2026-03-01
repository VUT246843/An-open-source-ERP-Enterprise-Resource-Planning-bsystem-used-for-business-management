import org.junit.Rule;
        Assert.assertTrue(new MimeType().match(new MimeType()));
        Assert.assertEquals("application/json", new MimeType("application/json").toString());
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertFalse(new MimeType().match(new MimeType("text", "json")));
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 */
 *
 * limitations under the License.
    @Test
    public final ExpectedException thrown = ExpectedException.none();
import org.junit.Test;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Rule

    public void testParse() {

 * See the License for the specific language governing permissions and
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * DBeaver - Universal Database Manager


        Assert.assertTrue(new MimeType("application", "json").match("application/json"));
import org.junit.Assert;
    @Test
        Assert.assertTrue(new MimeType("application", "json").match(new MimeType("application", "*")));
        Assert.assertFalse(new MimeType("application", "json").match(new MimeType("application", "text")));
    }
        new MimeType("application;/json");
}
        Assert.assertEquals("application/js", new MimeType("application/js;on").toString());
    }
 * you may not use this file except in compliance with the License.
        Assert.assertEquals("/*", new MimeType(";application").toString());
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void testMatch() {
 *
        thrown.expect(IllegalArgumentException.class);
public class MimeTypeTest {
        Assert.assertEquals("application/*", new MimeType("application").toString());

import org.junit.rules.ExpectedException;
package org.jkiss.utils;
