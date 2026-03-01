    ) {
    public SQLQuerySymbolClass getAssociatedSymbolClass() {

    }
    }
 */
    @Override
        SQLQueryExprType type;
        String columnName = this.columnName == null ? "<NULL>" : this.columnName.getName();
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    }
    @NotNull
}    @Nullable
    @Nullable
 * you may not use this file except in compliance with the License.
        return visitor.visitValueColumnRefExpr(this, arg);

        return "ColumnReference[" + columnName + ":" + type + "]";
    public SQLQuerySymbol getColumnNameIfTrivialExpression() {
 * You may obtain a copy of the License at
    public SQLQuerySymbolEntry getColumnName() {
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
        @Nullable SQLQuerySymbolEntry columnName

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
    @Override
    @Override
    @Override
 */
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.columnName);
    private SQLQueryResultColumn column = null;
        } else {
            if (columnName.getOrigin() == null) {
/**
 * Unless required by applicable law or agreed to in writing, software
        return this.column;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String toString() {
import org.jkiss.dbeaver.model.sql.semantics.*;
        return this.columnName;
        if (this.columnName != null) {
    }

            statistics.appendError(this.getSyntaxNode(), "Invalid column reference");
        String type = this.type == null ? "<NULL>" : this.type.toString();
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

            }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @Nullable
 *


import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    ) {
    @Nullable
    }
/*
    
            resultColumn = context.resolveColumn(statistics.getMonitor(), columnName.getName());
 *

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;

 * Licensed under the Apache License, Version 2.0 (the "License");
            }
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
        @NotNull SQLQueryRowsDataContext context,
        super(syntaxNode);
        SQLQueryResultColumn resultColumn;
        this.column = resultColumn;
 * distributed under the License is distributed on an "AS IS" BASIS,
            type = this.type;
    private final SQLQuerySymbolEntry columnName;

    public SQLQueryValueColumnReferenceExpression(
        return this.columnName == null ? null : this.columnName.getSymbol();
    protected SQLQueryExprType resolveValueTypeImpl(
            type = resultColumn != null ? resultColumn.type : SQLQueryExprType.UNKNOWN;
 * Describes column reference specified by column nae and optionally table name
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.code.NotNull;

    @Nullable
        return type;
            SQLQuerySymbolOrigin columnRefOrigin = new SQLQuerySymbolOrigin.ColumnNameFromRowsData(context);
 *
public class SQLQueryValueColumnReferenceExpression extends SQLQueryValueExpression {
        @NotNull STMTreeNode syntaxNode,

    }
    public SQLQueryResultColumn getColumnIfTrivialExpression() {
 * limitations under the License.
                columnName.setOrigin(columnRefOrigin);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        }
    @Nullable
    @Override
    @NotNull
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        this.columnName = columnName;
            if (resultColumn != null || !context.getRowsSources().hasUnresolvedSource()) {
    @Override
            resultColumn = null;
                SQLQuerySemanticUtils.propagateColumnDefinition(columnName, resultColumn, statistics, columnRefOrigin);



    }
