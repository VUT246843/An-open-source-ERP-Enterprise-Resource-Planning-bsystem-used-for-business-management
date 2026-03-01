        String actual = dialect.escapeString(expected);
 *     http://www.apache.org/licenses/LICENSE-2.0
        String actual = dialect.escapeString(given);
public class MySQLDialectTest extends DBeaverUnitTest {
        String actual = dialect.escapeString(given);

 */
    }
import static org.junit.Assert.assertEquals;
 * Unless required by applicable law or agreed to in writing, software
        // WHEN
        // THEN
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
        assertEquals("`a `` b`", dialect.getQuotedIdentifier("a ` b", false, true));
}

 * Licensed under the Apache License, Version 2.0 (the "License");
        String expected = "There is simple string without any quotes and slashes";
    @Test
        // GIVEN
    public void quoteStringTest() {
    }
    public void escapeString_whenSimpleStringPasses_thenSameStringReturn(){
        assertEquals("`a ' b`", dialect.getQuotedIdentifier("a ' b", false, true));
    @Test
        // GIVEN
    public void escapeString_whenStringWithinSlash_thenStringEscapedSlashReturn() {
 *
 * DBeaver - Universal Database Manager
        // WHEN
    public void escapeString_whenStringWithQuotes_thenSameStringReturn() {
    @Test
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        assertEquals("`a b`", dialect.getQuotedIdentifier("a b", false, true));
        assertEquals("[\"{\\\\\"subjectId\\\\\":3,\\\\\"levelId\\\\\":2,\\\\\"isOur\\\\\":true}\"]", actual);
 *
        String given = "[\"{\\\"subjectId\\\":3,\\\"levelId\\\":2,\\\"isOur\\\":true}\"]";

package org.jkiss.dbeaver.ext.mysql.model;
import org.jkiss.junit.DBeaverUnitTest;
        assertEquals(expected, actual);
        // WHEN
 * limitations under the License.
    @Test

        // THEN
        // GIVEN

import org.junit.Test;
        // THEN
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at

    }


        String given = "[\"{\"subjectId\":3,\"levelId\":2,\"isOur\":true}\"]";
    private final MySQLDialect dialect = new MySQLDialect();
        assertEquals("[\"{\"subjectId\":3,\"levelId\":2,\"isOur\":true}\"]", actual);
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
