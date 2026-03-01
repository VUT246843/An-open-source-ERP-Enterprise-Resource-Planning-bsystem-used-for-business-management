    }
            if (element instanceof SQLQuery sqlQuery) {
/**

    DML,
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
        return categories;
    SQL,
 * limitations under the License.
 */
 *
        for (SQLScriptElement element : scriptElements) {
 *
            }
public enum SQLQueryCategory {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * @see SQLQueryType
    TCL,
package org.jkiss.dbeaver.model.sql;
import java.util.HashSet;
        Set<SQLQueryCategory> categories = new HashSet<>();
import java.util.List;



 *
import java.util.Set;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
                categories.add(sqlQuery.getType().getCategory());
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    DDL,
    UNKNOWN;
 * See the License for the specific language governing permissions and
 */
    public static Set<SQLQueryCategory> categorizeScript(@NotNull List<SQLScriptElement> scriptElements) {
 * Category of a query type
        }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    @NotNull
