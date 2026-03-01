    private static final String[][] DEFAULT_QUOTE_STRINGS = {{"'", "'"}};
/**
        return SQLStateType.UNKNOWN;
    @Nullable

    }
 * Info
 * You may obtain a copy of the License at
 */

    {
 *
import org.jkiss.dbeaver.model.sql.SQLStateType;

    public String getDialectName() {

    @Override
 *
    {
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
    @Override


    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
    }
    }
package org.jkiss.dbeaver.ext.wmi.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
    {
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        return "WMI";
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        return DEFAULT_QUOTE_STRINGS;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
 *
    public WMIDialect()
    public SQLStateType getSQLStateType()
public class WMIDialect extends BasicSQLDialect {
    public String[][] getIdentifierQuoteStrings()
