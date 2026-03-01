


    }
    @Nullable

    @Nullable
    public String visitSubqueryAlias(@NotNull SQLRowsSourceAliasCompletionItem rowsSourceAlias) {
            } else if (columnName.columnInfo.symbol.getDefinition() instanceof SQLQueryResultPseudoColumn pseudoColumn) {
    @Override
    @Nullable
        return "Reserved word of the query language";
/*
            : DBUtils.getObjectFullName(columnName.columnInfo.realAttr, DBPEvaluationContext.DML);
        } else {
        return specialText.description;
 * You may obtain a copy of the License at
}
        String ownerTypeDesc;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultPseudoColumn;
    @Override
    @Override
 * See the License for the specific language governing permissions and
    }
        return procedure.getObject().getDescription();
    @Override
    public static final SQLQueryCompletionDescriptionProvider INSTANCE = new SQLQueryCompletionDescriptionProvider();
    @Nullable
import org.jkiss.code.NotNull;
    public String  visitSpecialText(@NotNull SQLSpecialTextCompletionItem specialText) {
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
        return prefix + rowsSourceAlias.sourceInfo.source.getSyntaxNode().getTextContent();


    @Nullable
    }
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.model.sql.semantics.completion;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
            } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class SQLQueryCompletionDescriptionProvider implements SQLQueryCompletionItemVisitor<String> {
    public String visitReservedWord(@Nullable SQLReservedWordCompletionItem reservedWord) {
    private SQLQueryCompletionDescriptionProvider() {
    }
            joinCondition.left.apply(this) + " vs " + joinCondition.right.apply(this);
            }
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySemanticUtils;
    public String visitProcedure(@NotNull SQLProcedureCompletionItem procedure) {
    @Nullable
            ownerTypeDesc = byDbObjDef.getDbObject().getName() + " " + SQLQuerySemanticUtils.getObjectTypeName(byDbObjDef.getDbObject());
        return "Builtin function of the database.";
        }
        return namedObject instanceof DBPObjectWithDescription owd
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String visitTableName(@NotNull SQLTableNameCompletionItem tableName) {
                String attrDescription = columnName.columnInfo.realAttr.getDescription();
    @Override

                return "Computed column #" + columnName.columnInfo.index + // TODO deliver the column expression from the SQLQuerySelectionResultColumnSpec?
        return "Attribute " + compositeField.memberInfo.name() + " provided by the " + ownerTypeDesc + " pseudocomposite ";

 *

    }
    }
    @NotNull


        if (columnName.columnInfo.symbol.getSymbolClass() == SQLQuerySymbolClass.COLUMN_DERIVED) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (compositeField.memberInfo.declaratorType().getDeclaratorDefinition() instanceof SQLQuerySymbolByDbObjectDefinition byDbObjDef) {
    }

                return pseudoColumn.description;
    public String visitJoinCondition(@NotNull SQLJoinConditionCompletionItem joinCondition) {
        return tableName.object.getDescription();
    }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String visitCompositeField(@NotNull SQLCompositeFieldCompletionItem compositeField) {
    @Nullable
        } else {

 * limitations under the License.
    @NotNull
            return "Derived column #" + columnName.columnInfo.index + " " + (originalColumnName != null ? "for real column " + originalColumnName : "") +
    @Nullable
    public String visitSpecialCompositeField(@NotNull SQLSpecialCompositeFieldCompletionItem compositeField) {
 *
    @Override
            : DBUtils.getObjectFullName(namedObject.object, DBPEvaluationContext.DML);
    }
 *
                    " from the subquery \n" + columnName.columnInfo.source.getSyntaxNode().getTextContent();
        return "Join condition on the foreign key known from the database schema: " +
        }
                return CommonUtils.isNotEmpty(attrDescription) ? attrDescription
    }
    @Override
 * DBeaver - Universal Database Manager
                return "Column " + columnName.columnInfo.symbol.getName() + " of " + DBUtils.getObjectFullName(columnName.columnInfo.realSource, DBPEvaluationContext.DML);
                    : "Column " + columnName.columnInfo.realAttr.getName() + " of " + DBUtils.getObjectFullName(columnName.columnInfo.realAttr.getParentObject(), DBPEvaluationContext.DML);
        @Nullable String originalColumnName = columnName.columnInfo.realAttr == null ? null
            ? owd.getDescription()
            if (columnName.columnInfo.realAttr != null) {
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionItem.*;
    public String visitColumnName(@NotNull SQLColumnNameCompletionItem columnName) {

import org.jkiss.utils.CommonUtils;
        String ownerTypeName = SQLQueryCompletionExtraTextProvider.prepareTypeNameString(compositeField.memberInfo.declaratorType());
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolByDbObjectDefinition;

                    " from the subquery \n" + columnName.columnInfo.source.getSyntaxNode().getTextContent();
            } else if (columnName.columnInfo.realSource != null) {
    @Override
 */
    @Override
            ownerTypeDesc = SQLQueryCompletionExtraTextProvider.prepareTypeNameString(compositeField.memberInfo.declaratorType());
    }

    public String visitBuiltinFunction(@NotNull SQLBuiltinFunctionCompletionItem function) {
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
        String prefix = rowsSourceAlias.sourceInfo.tableOrNull != null ? "Table alias for \n" : "Subquery alias for \n";
        return "Attribute " + compositeField.memberInfo.name() + " of the " + ownerTypeName + " composite type ";
    public String visitNamedObject(@NotNull SQLDbNamedObjectCompletionItem namedObject) {
