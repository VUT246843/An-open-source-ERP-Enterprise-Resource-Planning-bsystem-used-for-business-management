
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItem.*;
    @Nullable
     */
     */
    /**




 * limitations under the License.

    @Nullable
    R visitColumnName(@NotNull SQLColumnNameCompletionItem columnName);
    @Nullable
    /**
}
import org.jkiss.code.NotNull;
    @Nullable

    R visitCompositeField(@NotNull SQLCompositeFieldCompletionItem compositeField);
     */
    R visitTableName(@NotNull SQLTableNameCompletionItem tableName);
    @Nullable
    R visitNamedObject(@NotNull SQLDbNamedObjectCompletionItem namedObject);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    R visitSpecialText(@NotNull SQLSpecialTextCompletionItem specialText);
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    R visitProcedure(@NotNull SQLProcedureCompletionItem procedure);
     * Visit method for dialect specific builtin functions
 *
 * you may not use this file except in compliance with the License.
    R visitBuiltinFunction(@NotNull SQLBuiltinFunctionCompletionItem function);
    @Nullable
    R visitSubqueryAlias(@NotNull SQLRowsSourceAliasCompletionItem rowsSourceAlias);

package org.jkiss.dbeaver.model.sql.semantics.completion;
    @Nullable
    R visitSpecialCompositeField(@NotNull SQLSpecialCompositeFieldCompletionItem compositeField);

/*
 * See the License for the specific language governing permissions and
    @Nullable
    @Nullable
    @Nullable
 *
 * Unless required by applicable law or agreed to in writing, software
    /**
 *
    R visitReservedWord(@NotNull SQLReservedWordCompletionItem reservedWord);
public interface SQLQueryCompletionItemVisitor<R> {
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

     * Visit method for user-defned procedures

 * Copyright (C) 2010-2025 DBeaver Corp and others

    R visitJoinCondition(@NotNull SQLJoinConditionCompletionItem joinCondition);
     * Visit method for columns expansion

 */
