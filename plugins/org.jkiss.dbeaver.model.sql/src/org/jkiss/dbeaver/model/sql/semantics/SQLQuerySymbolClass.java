    public String getDescription() {
 * you may not use this file except in compliance with the License.
    COLUMN_DERIVED(SQLTokenType.T_COLUMN_DERIVED, ModelSQLMessages.model_sql_semantic_symbolClass_COLUMN_DERIVED),
    @NotNull
    public SQLTokenType getTokenType() {
    DBEAVER_COMMAND(SQLTokenType.T_CONTROL, ModelSQLMessages.model_sql_semantic_symbolClass_DBEAVER_COMMAND),
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    
    @NotNull
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        this.description = description;
    QUOTED(SQLTokenType.T_QUOTED, ModelSQLMessages.model_sql_semantic_symbolClass_QUOTED),
    private SQLQuerySymbolClass(@NotNull SQLTokenType tokenType, String description) {
 * You may obtain a copy of the License at
/*
public enum SQLQuerySymbolClass {
        return this.description;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    FUNCTION(SQLTokenType.T_FUNCTION, ModelSQLMessages.model_sql_semantic_symbolClass_FUNCTION),
import org.jkiss.dbeaver.model.sql.messages.ModelSQLMessages;
    

        return this.tokenType;
 *     http://www.apache.org/licenses/LICENSE-2.0
} */
    private final String description;
 * Licensed under the Apache License, Version 2.0 (the "License");
    DBEAVER_VARIABLE(SQLTokenType.T_VARIABLE, ModelSQLMessages.model_sql_semantic_symbolClass_DBEAVER_VARIABLE),
    }
    RESERVED(SQLTokenType.T_KEYWORD, ModelSQLMessages.model_sql_semantic_symbolClass_RESERVED),
 * DBeaver - Universal Database Manager
 *
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
        this.tokenType = tokenType;
    UNKNOWN(SQLTokenType.T_OTHER, ModelSQLMessages.model_sql_semantic_symbolClass_UNKNOWN),

    OBJECT(SQLTokenType.T_TABLE, ModelSQLMessages.model_sql_semantic_symbolClass_OBJECT),
    }
    ERROR(SQLTokenType.T_SEMANTIC_ERROR, ModelSQLMessages.model_sql_semantic_symbolClass_ERROR);
    CATALOG(SQLTokenType.T_SCHEMA, ModelSQLMessages.model_sql_semantic_symbolClass_CATALOG),
    SQL_BATCH_VARIABLE(SQLTokenType.T_SQL_VARIABLE, ModelSQLMessages.model_sql_semantic_symbolClass_SQL_BATCH_VARIABLE),
    DBEAVER_PARAMETER(SQLTokenType.T_PARAMETER, ModelSQLMessages.model_sql_semantic_symbolClass_DBEAVER_PARAMETER),
    STRING(SQLTokenType.T_STRING, ModelSQLMessages.model_sql_semantic_symbolClass_STRING),
 *
    COLUMN(SQLTokenType.T_COLUMN, ModelSQLMessages.model_sql_semantic_symbolClass_COLUMN),
package org.jkiss.dbeaver.model.sql.semantics;
    TABLE_ALIAS(SQLTokenType.T_TABLE_ALIAS, ModelSQLMessages.model_sql_semantic_symbolClass_TABLE_ALIAS),

 * Copyright (C) 2010-2025 DBeaver Corp and others
    COMPOSITE_FIELD(SQLTokenType.T_COMPOSITE_FIELD, ModelSQLMessages.model_sql_semantic_symbolClass_COMPOSITE_FIELD),
    TABLE(SQLTokenType.T_TABLE, ModelSQLMessages.model_sql_semantic_symbolClass_TABLE),
    private final SQLTokenType tokenType;

 *
 * limitations under the License.
 * See the License for the specific language governing permissions and
    SCHEMA(SQLTokenType.T_SCHEMA, ModelSQLMessages.model_sql_semantic_symbolClass_SCHEMA),
