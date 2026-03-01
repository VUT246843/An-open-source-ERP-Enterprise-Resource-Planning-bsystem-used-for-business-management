 * You may obtain a copy of the License at
        SQLQueryRowsSourceContext result = leftResult.combine(rightResult);
            var conditionOrigin = new SQLQuerySymbolOrigin.RowsDataRef(combinedContext);
    }

    private final boolean isLateral;
 * Describes natural join clause
            ? this.right.resolveRowSources(rightContext, statistics)
        @NotNull Interval range,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
        return combinedContext;
    public SQLQueryValueExpression getCondition() {
public class SQLQueryRowsNaturalJoinModel extends SQLQueryRowsSetOperationModel

        return condition;
                        symbol.setDefinition(column); // TODO multiple definitions per symbol
                        } else {
    private final SQLQueryLexicalScope conditionScope;
 * you may not use this file except in compliance with the License.
                    if (leftColumnDef != null && rightColumnDef != null) {

        @Nullable SQLQueryLexicalScope rightSourceScope,
        @NotNull SQLQueryRecognitionContext statistics
            this.setTailOrigin(columnNameOrigin);
        if (this.rightSourceScope != null) {
        super(range, syntaxNode, left, right);
                if (column.isNotClassified()) {
    ) {
                        symbol.setSymbolClass(SQLQuerySymbolClass.COLUMN);
        this.isLateral = isLateral;
 */
 * limitations under the License.
            this.conditionScope.setSymbolsOrigin(conditionOrigin);
 * DBeaver - Universal Database Manager
    public SQLQueryRowsNaturalJoinModel(
        @NotNull Interval range,
import java.util.List;
        }

        @Nullable SQLQueryRowsSourceModel right,
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (this.condition != null) {
    ) {

    private final List<SQLQuerySymbolEntry> columnsToJoin;
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
    }
        @Nullable SQLQueryRowsSourceModel right,
 *
 *
        return columnsToJoin;
            }
        this.isLateral = isLateral;
/*
        @NotNull STMTreeNode syntaxNode,
        return this.isLateral && child == this.right;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

        @NotNull SQLQueryRecognitionContext statistics
            : context.resetAsUnresolved();
    @Nullable
    @Nullable

    }
            this.setTailOrigin(rightSourceOrigin);
import org.jkiss.code.Nullable;
    public List<SQLQuerySymbolEntry> getColumnsToJoin() {
        this.rightSourceScope = rightSourceScope;
        }
        @Nullable SQLQueryRowsDataContext defaultContext

        }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;

                this.setTailOrigin(conditionOrigin);
        this.conditionScope = conditionScope;
        super(range, syntaxNode, left, right);
        this.condition = null;
        @NotNull SQLQueryLexicalScope conditionScope
    }
            this.registerLexicalScope(rightSourceScope);

    private final SQLQueryLexicalScope rightSourceScope;

    ) {

        SQLQueryRowsDataContext combinedContext;
 *
                        if (leftColumnDef == null) {
        boolean isLateral,
    }
        } else {
                        symbol.setSymbolClass(SQLQuerySymbolClass.ERROR);
            this.conditionScope.setSymbolsOrigin(columnNameOrigin);

    private Supplier<SQLQueryRowsDataContext> relatedRightContextProvider = this::getRowsDataContext;
            for (SQLQuerySymbolEntry column : columnsToJoin) {
        var rightSourceOrigin = new SQLQuerySymbolOrigin.RowsSourceRef(
                        .resolveColumn(statistics.getMonitor(), column.getName());
    @Nullable
            }
        @NotNull SQLQueryRowsSourceModel left,
    public boolean overridesContextForChild(@NotNull SQLQueryRowsSourceModel child) {
            this.condition.resolveRowSources(result, statistics);
                        }
        SQLQueryRowsSourceContext rightResult = this.right != null

        boolean isLateral,

import java.util.function.Supplier;
                    } else {
 * Unless required by applicable law or agreed to in writing, software
        @NotNull STMTreeNode syntaxNode,
    }
        }
    ) {
        }


import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
    @NotNull
        @NotNull SQLQueryRowsSourceModel left,
    @Override
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                    SQLQuerySymbol symbol = column.getSymbol();

    @Override
    ) {
            this.isLateral ? leftResult : context
    @NotNull
    @Override

        }
        } else {
                this.condition.resolveValueRelations(combinedContext, statistics);
        @NotNull SQLQueryLexicalScope conditionScope
            this.registerLexicalScope(rightSourceScope);
    @Nullable
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.rightSourceScope = rightSourceScope;
    @Override
 */
import org.antlr.v4.runtime.misc.Interval;
                            statistics.appendError(column, "Column " + column.getName() + " not found on the right of join");
        SQLQueryRowsSourceContext rightContext = (
        this.columnsToJoin = columnsToJoin;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
                        .resolveColumn(statistics.getMonitor(), column.getName());

            combinedContext = this.left.getRowsDataContext();

            var columnNameOrigin = new SQLQuerySymbolOrigin.ColumnNameFromRowsData(combinedContext);
        @NotNull SQLQueryRowsSourceContext context,
import org.jkiss.code.NotNull;
            if (this.condition != null) {

        @Nullable SQLQueryValueExpression condition,
                    SQLQueryResultColumn rightColumnDef = this.right == null ? null : this.right.getRowsDataContext()
    @Nullable
        if (rightSourceScope != null) {
    public SQLQueryRowsNaturalJoinModel(
            statistics.appendError(this.getSyntaxNode(), "Table to join is not specified");
        return this.isLateral && child == this.right ? this.left.getRowsDataContext() : defaultContext;
        if (rightSourceScope != null) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @NotNull

        this.columnsToJoin = null;
    @Override
    }

        return result;
            super.registerSubnode(condition);
    private final SQLQueryValueExpression condition;
} * Copyright (C) 2010-2025 DBeaver Corp and others
                            statistics.appendError(column, "Column " + column.getName() + " not found on the left of join");
        if (this.right != null) {
        this.registerLexicalScope(conditionScope);
                    SQLQueryResultColumn leftColumnDef = this.left.getRowsDataContext()

package org.jkiss.dbeaver.model.sql.semantics.model.select;

                    }
import org.jkiss.dbeaver.model.sql.semantics.*;
        @Nullable SQLQueryLexicalScope rightSourceScope,
            }
        @NotNull SQLQueryRowsSourceModel child,
    public SQLQueryRowsDataContext getContextForChild(
        this.registerLexicalScope(conditionScope);
    }
            if (this.getTailOrigin() == null) {
        SQLQueryRowsSourceContext leftResult = this.left.resolveRowSources(context, statistics);
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLQueryRowsDataContext context,
        return visitor.visitRowsNaturalJoin(this, arg);
        this.condition = condition;
        ).setRelatedContextProvider(this.relatedRightContextProvider);
    @NotNull
        }
            this.getRowsSources().setRelatedContextProvider(this.relatedRightContextProvider)

    }
        if (this.columnsToJoin != null) {
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(

        );
            combinedContext = this.left.getRowsDataContext().combineForJoin(this, this.right.getRowsDataContext());
        this.conditionScope = conditionScope;
        if (condition != null) {
            this.rightSourceScope.setSymbolsOrigin(rightSourceOrigin);
        @Nullable List<SQLQuerySymbolEntry> columnsToJoin,
    implements SQLQueryNodeModel.NodeSubtreeTraverseControl<SQLQueryRowsSourceModel, SQLQueryRowsDataContext> {
    protected SQLQueryRowsDataContext resolveRowDataImpl(
 * See the License for the specific language governing permissions and
                    column.setOrigin(columnNameOrigin);
