
 * Copyright (C) 2010-2025 DBeaver Corp and others
        Assert.assertEquals("", StringUtils.underscoreToCamelCase(""));
 * DBeaver - Universal Database Manager
 *
 * Unless required by applicable law or agreed to in writing, software
        Assert.assertEquals("aB", StringUtils.underscoreToCamelCase("a_b_"));
public class StringUtilsTest {
        Assert.assertEquals("someText", StringUtils.underscoreToCamelCase("SOME_TEXT"));
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.assertEquals("alreadycamel", StringUtils.underscoreToCamelCase("AlreadyCamel"));
        Assert.assertEquals("abc123Def", StringUtils.underscoreToCamelCase("abc_123_def"));
 *
 * See the License for the specific language governing permissions and
 *
        Assert.assertEquals("aB", StringUtils.underscoreToCamelCase("A_B"));
/*
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        Assert.assertEquals("a1B2", StringUtils.underscoreToCamelCase("a1_b2"));
}
        Assert.assertEquals("Abc", StringUtils.underscoreToCamelCase("_abc"));
    public void testUnderscoreToCamelCaseBasicConversion() {

    @Test
import org.junit.Assert;
        Assert.assertEquals("someField", StringUtils.underscoreToCamelCase("some_field"));
 * limitations under the License.
        Assert.assertEquals("somefield", StringUtils.underscoreToCamelCase("somefield"));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.junit.Test;
 */
package org.jkiss.utils;
    }
 * you may not use this file except in compliance with the License.
        Assert.assertEquals("abc", StringUtils.underscoreToCamelCase("abc_"));
        Assert.assertNull(StringUtils.underscoreToCamelCase(null));
 * distributed under the License is distributed on an "AS IS" BASIS,
