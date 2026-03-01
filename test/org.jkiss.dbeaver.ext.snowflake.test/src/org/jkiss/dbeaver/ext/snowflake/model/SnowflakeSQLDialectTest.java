
 *
import static org.junit.Assert.assertFalse;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        SQLDialect dialect = new SnowflakeSQLDialect();
        assertFalse(dialect.mustBeQuoted("unquotedIdentifier", false));
import org.jkiss.dbeaver.model.sql.SQLDialect;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/*

    }
import static org.junit.Assert.assertTrue;
        assertFalse(dialect.mustBeQuoted("unqu0ted1dentifier", false));
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void quoteStatusStringTest() {
 * You may obtain a copy of the License at
import org.jkiss.junit.DBeaverUnitTest;
        assertTrue(dialect.mustBeQuoted("", false));

 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.snowflake.model;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        assertFalse(dialect.mustBeQuoted("unquoted$identifier", false));
        assertFalse(dialect.mustBeQuoted("noquotesneededforsure", true));
 */
 * Unless required by applicable law or agreed to in writing, software
    @Test
public class SnowflakeSQLDialectTest extends DBeaverUnitTest {
import org.junit.Test;
        assertFalse(dialect.mustBeQuoted("Unquoted_Identifier", false));
        assertTrue(dialect.mustBeQuoted("Бразилски_џијуџицу", false));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        assertFalse(dialect.mustBeQuoted("unquoted_identifier", false));
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

        assertFalse(dialect.mustBeQuoted("_unquotedIdentifier", false));
 * limitations under the License.
