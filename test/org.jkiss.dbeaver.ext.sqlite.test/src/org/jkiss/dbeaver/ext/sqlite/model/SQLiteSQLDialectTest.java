        final SQLiteSQLDialect dialect = new SQLiteSQLDialect();
    }

 *
    @Test
 * Unless required by applicable law or agreed to in writing, software
    }
        Assert.assertEquals("'-Infinity'", dialect.escapeScriptValue(mockAttribute, Double.NEGATIVE_INFINITY, ""));
}
    @Test

        Assert.assertEquals("'NaN'", dialect.escapeScriptValue(mockAttribute, Float.NaN, ""));
 *
 * DBeaver - Universal Database Manager
        Assert.assertEquals("'NaN'", dialect.escapeScriptValue(mockAttribute, Float.POSITIVE_INFINITY - Float.POSITIVE_INFINITY, ""));
 * you may not use this file except in compliance with the License.

    public void quoteInfinities() {
        Assert.assertEquals("'Infinity'", dialect.escapeScriptValue(mockAttribute, Float.POSITIVE_INFINITY, ""));
import org.junit.Test;

        Assert.assertEquals("'NaN'", dialect.escapeScriptValue(mockAttribute, Double.NEGATIVE_INFINITY * 0, ""));
        Assert.assertEquals("'Infinity'", dialect.escapeScriptValue(mockAttribute, Double.POSITIVE_INFINITY, ""));
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    @Mock
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.sqlite.model;
public class SQLiteSQLDialectTest extends DBeaverUnitTest {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
 * limitations under the License.
import org.junit.Assert;
        final SQLiteSQLDialect dialect = new SQLiteSQLDialect();

    public void quoteNaNs() {
import org.mockito.Mock;
import org.jkiss.junit.DBeaverUnitTest;
    DBSTypedObject mockAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertEquals("'NaN'", dialect.escapeScriptValue(mockAttribute, Double.NaN, ""));
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.assertEquals("'-Infinity'", dialect.escapeScriptValue(mockAttribute, Float.NEGATIVE_INFINITY, ""));
