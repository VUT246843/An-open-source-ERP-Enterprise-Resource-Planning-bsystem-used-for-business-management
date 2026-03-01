 *

    DDL(SQLQueryCategory.DDL),
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
public enum SQLQueryType {
 * limitations under the License.
 * See the License for the specific language governing permissions and
 */
/*
        this.category = category;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    COMMIT(SQLQueryCategory.TCL),
    UPDATE(SQLQueryCategory.DML),

    DELETE(SQLQueryCategory.DML),
    private final SQLQueryCategory category;
    INSERT(SQLQueryCategory.DML),


    UNKNOWN(SQLQueryCategory.UNKNOWN),
    SELECT(SQLQueryCategory.SQL),
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
 * DBeaver - Universal Database Manager
    USE(SQLQueryCategory.DDL),
 *
 * Unless required by applicable law or agreed to in writing, software
    SQLQueryType(@NotNull SQLQueryCategory category) {
    MERGE(SQLQueryCategory.DML),
 */
 * Statement type
    public SQLQueryCategory getCategory() {
}

    }
/**

        return category;
    ROLLBACK(SQLQueryCategory.TCL);
package org.jkiss.dbeaver.model.sql;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
