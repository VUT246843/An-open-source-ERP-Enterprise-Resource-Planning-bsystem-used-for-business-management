            tail = "";
    public String visitBuiltinFunction(@NotNull SQLBuiltinFunctionCompletionItem function) {
    private SQLQueryCompletionExtraTextProvider() {
import org.jkiss.code.NotNull;
import java.util.ArrayList;
                tags.add("related");

    @NotNull

        }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Nullable
    @NotNull
                tags.add("used");

            List<String> tags = new ArrayList<>();
    @Nullable
        String typeName = this.prepareTypeNameString(columnName.columnInfo.type);
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    }
    public String  visitSpecialText(@NotNull SQLSpecialTextCompletionItem specialText) {
            default -> " - Stored routine";
    @Override
 * You may obtain a copy of the License at
    }
        return switch (procedure.getObject().getProcedureType()) {
        return " - Builtin function";
        return typeName == null ? " - Composite attribute" : (" : " + typeName);
import org.jkiss.code.Nullable;
        return typeName == null ? " - Column" : (" : " + typeName);

            }
    public String visitProcedure(@NotNull SQLProcedureCompletionItem procedure) {
            tail = "(" +  String.join(", ", tags) + ")";
    }

        String typeName = this.prepareTypeNameString(compositeField.memberInfo.type());
    @Override
    public String visitCompositeField(@NotNull SQLCompositeFieldCompletionItem compositeField) {
        return " - Special substitution";
    @NotNull



import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItem.*;
    public String visitReservedWord(@Nullable SQLReservedWordCompletionItem reservedWord) {

    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * you may not use this file except in compliance with the License.
    public String visitSubqueryAlias(@NotNull SQLRowsSourceAliasCompletionItem rowsSourceAlias) {
    @Override
    }
 * DBeaver - Universal Database Manager
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
        String typeName = SQLQuerySemanticUtils.getObjectTypeName(namedObject.object);
        };
        if (tableName.isRelated || tableName.isUsed) {
    }

    @Nullable
    @Override
        return (DBUtils.isView(tableName.object) ? " - View " : " - Table ") + tail;
        return typeName == null ? " - Pseudo composite attribute" : (" : " + typeName);
        } else {
    @Override
        return CommonUtils.isEmpty(typeName) ? "" : (" - " + typeName);
    public String visitSpecialCompositeField(@NotNull SQLSpecialCompositeFieldCompletionItem compositeField) {
    @Override
    @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
}
        return type == null || type == SQLQueryExprType.UNKNOWN ? null : type.getDisplayName();
 * limitations under the License.
    @NotNull
 *
    @Nullable
            if (tableName.isUsed) {
    public String visitNamedObject(@NotNull SQLDbNamedObjectCompletionItem namedObject) {
        return " - Known foreign key relation";
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySemanticUtils;
    @Override
        return null;
    }
    @NotNull
            if (tableName.isRelated) {

        String tail;
package org.jkiss.dbeaver.model.sql.semantics.completion;

    public static SQLQueryCompletionExtraTextProvider INSTANCE = new SQLQueryCompletionExtraTextProvider();
    public String visitJoinCondition(@NotNull SQLJoinConditionCompletionItem joinCondition) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @Nullable
    }
             + (rowsSourceAlias.isRelated ? " (related)" : "");
 * See the License for the specific language governing permissions and
    }
    }
    }
        String typeName = this.prepareTypeNameString(compositeField.memberInfo.type());
    @Override
            case FUNCTION -> " - Function";
public class SQLQueryCompletionExtraTextProvider implements SQLQueryCompletionItemVisitor<String> {
            case PROCEDURE -> " - Procedure";
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBUtils;

    }
    public static String prepareTypeNameString(@NotNull SQLQueryExprType type) {

    public String visitColumnName(@NotNull SQLColumnNameCompletionItem columnName) {
    @NotNull
        return (rowsSourceAlias.sourceInfo.tableOrNull != null ? " - Table alias" : " - Subquery alias")
import java.util.List;
/*
    public String visitTableName(@NotNull SQLTableNameCompletionItem tableName) {
            }
 */
