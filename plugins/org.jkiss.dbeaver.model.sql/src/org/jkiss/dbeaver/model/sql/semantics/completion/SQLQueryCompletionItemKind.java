 *
     * Table name never referenced in the underlying contexts
 * You may obtain a copy of the License at
 */
     * Subquery correlation alias when its underlying source is not a simple table reference 
    /**
    /**
}
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    RESERVED(false, false, 400),
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
     */
    /**
    SQLQueryCompletionItemKind(boolean isTableName, boolean isColumnName, int sortOrder) {
     * Column name when defined by the correlation or by the column alias
     * Keywords and alike
     * Table column name when derived from the real table 
 * limitations under the License.
    /**
     * Table name already used in the underlying contexts
 * Licensed under the Apache License, Version 2.0 (the "License");
     * <p> (simple identifier)
     * */
     * Join condition based on the foreign key
     * <p> (simple identifier or fullname)
public enum SQLQueryCompletionItemKind {
     * and has a foreign key association with any other table in the current context
        this.isColumnName = isColumnName;
     * <p> (simple identifier or prefixed with subquery alias)
    }
    CATALOG(false, false, 275),
     */
     * */
     */
    /**
    PROCEDURE(false, false, 300),
    DERIVED_COLUMN_NAME(false, true, 100),
 * Unless required by applicable law or agreed to in writing, software
    RELATED_SUBQUERY_ALIAS(true, false, 150),
     * <p> (simple identifier)
    USED_TABLE_NAME(true, false, 200),
     * <p> (simple identifier)
package org.jkiss.dbeaver.model.sql.semantics.completion;
    /**
     */
    public final int sortOrder;
 *
    RELATED_TABLE_NAME(true, false, 150),
     * <p> (simple identifier, fullname, alias-prefixed)
    public final boolean isTableName;
     * <p> (expression, consisting of two column references)
    public final boolean isColumnName;
    SCHEMA(false, false, 250);
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Name of the table having foreign key association with any other table in the current context

        this.sortOrder = sortOrder;
     * you may not use this file except in compliance with the License.
    /**
    TABLE_COLUMN_NAME(false, true, 100),
    NEW_TABLE_NAME(true, false, 200),
 *
 * DBeaver - Universal Database Manager
    /**
    /**

     * <p> (simple identifier or fullname)
    COMPOSITE_FIELD_NAME(false, true, 100),
     */
    SUBQUERY_ALIAS(true, false, 200),
    /**
    UNKNOWN(false, false, Integer.MAX_VALUE),
    JOIN_CONDITION(false, false, 0),
     */
     * Subquery correlation alias when its underlying source is not a simple table reference
     * Composite field name
        this.isTableName = isTableName;
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
     * <p> (simple identifier or fullname)

     */

     * Procedure or function
