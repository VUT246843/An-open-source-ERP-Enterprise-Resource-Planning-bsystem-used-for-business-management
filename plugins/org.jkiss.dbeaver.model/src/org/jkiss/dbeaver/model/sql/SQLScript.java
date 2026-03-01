import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.sql;
 * SQL script - a query which actually is a set of queries separated with delimiter.
    @Override
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull String text,
        this.scriptElements = scriptElements;

        super(dataSource, text);
/*

 */
    public List<SQLScriptElement> getScriptElements() {
}
 * Unless required by applicable law or agreed to in writing, software
    private final List<SQLScriptElement> scriptElements;
/**
 * DBeaver - Universal Database Manager
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return scriptElements;
    }
    public SQLScript(

        @Nullable DBPDataSource dataSource,


 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
    ) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull List<SQLScriptElement> scriptElements
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.

public class SQLScript extends SQLQuery {
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
    }
 *
