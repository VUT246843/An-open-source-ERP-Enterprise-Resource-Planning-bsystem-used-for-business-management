public class ClickhouseDialectTest extends DBeaverUnitTest {
 * See the License for the specific language governing permissions and
    @Test
        Assert.assertFalse(dialect.mustBeQuoted("Test", false));
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.junit.DBeaverUnitTest;
 */
        Assert.assertTrue(dialect.mustBeQuoted("თახვი", false));
        Assert.assertTrue(dialect.mustBeQuoted("SYSTEM", false));
 *
        Assert.assertFalse(dialect.mustBeQuoted("testNAME", false));
    public void quoteStatusStringTest() {
        Assert.assertTrue(dialect.mustBeQuoted("њен", false));
 * Licensed under the Apache License, Version 2.0 (the "License");


        Assert.assertFalse(dialect.mustBeQuoted("test", false));
 * limitations under the License.
 * You may obtain a copy of the License at
        final ClickhouseSQLDialect dialect = new ClickhouseSQLDialect();

package org.jkiss.dbeaver.ext.clickhouse.model;
/*
import org.junit.Test;
        Assert.assertTrue(dialect.mustBeQuoted("  test  ", false));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
        Assert.assertTrue(dialect.mustBeQuoted("system", false));
        Assert.assertTrue(dialect.mustBeQuoted("тест", false));
 * DBeaver - Universal Database Manager
        Assert.assertTrue(dialect.mustBeQuoted("DEFAULT", false));
        Assert.assertTrue(dialect.mustBeQuoted("名错误", false));
        Assert.assertTrue(dialect.mustBeQuoted("भिडियोहरू", false));
import org.junit.Assert;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}

        Assert.assertTrue(dialect.mustBeQuoted("default", false));
 * you may not use this file except in compliance with the License.
        Assert.assertFalse(dialect.mustBeQuoted("TEST", false));
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
