    public SQLQueryRowsDataContext getContextForChild(

        @NotNull STMTreeNode syntaxNode,
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryLexicalScope;
 * limitations under the License.
        return this.isLateral && child == this.right;
    }
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
 *
            statistics.appendError(this.getSyntaxNode(), "Table to join is not specified");
    @Nullable

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
    public boolean overridesContextForChild(@NotNull SQLQueryRowsSourceModel child) {
        super(range, syntaxNode, left, right);
        this.isLateral = isLateral;
        if (this.right != null) {
 * Describes cross join clause
        }
        boolean isLateral
import org.jkiss.code.NotNull;

        SQLQueryRowsSourceContext left = this.left.resolveRowSources(context, statistics);
            return this.left.getRowsDataContext().combine(this.right.getRowsDataContext());
/*
        return this.isLateral && child == this.right ? this.left.getRowsDataContext() : defaultContext;
    @Override

/**
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.sql.semantics.model.select;
    private final SQLQueryLexicalScope rightSourceScope;
    ) {
    }
        var rightSourceOrigin = new SQLQuerySymbolOrigin.RowsSourceRef(this.getRowsSources());

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.rightSourceScope = rightSourceScope;
    }
            this.registerLexicalScope(rightSourceScope);
 * Unless required by applicable law or agreed to in writing, software
        @NotNull Interval range,
        }
    private final boolean isLateral;
        } else {
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    ) {
    @Nullable
    ) {
}        @Nullable SQLQueryLexicalScope rightSourceScope,
        }
        if (rightSourceScope != null) {
        @NotNull SQLQueryRowsSourceContext context,
        @NotNull SQLQueryRecognitionContext statistics
        @Nullable SQLQueryRowsDataContext defaultContext

 * DBeaver - Universal Database Manager
        if (this.rightSourceScope != null) {
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(

    }
 */
    implements SQLQueryNodeModel.NodeSubtreeTraverseControl<SQLQueryRowsSourceModel, SQLQueryRowsDataContext> {
        return visitor.visitRowsCrossJoin(this, arg);
        SQLQueryRowsSourceContext combined = left.combine(right);
        @NotNull SQLQueryRowsDataContext context,

 *     http://www.apache.org/licenses/LICENSE-2.0

 *
 * You may obtain a copy of the License at
import org.antlr.v4.runtime.misc.Interval;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

    @Override
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        return combined;
            this.setTailOrigin(rightSourceOrigin);
    public SQLQueryRowsCrossJoinModel(
 */

    @Override
        @NotNull SQLQueryRowsSourceModel right,
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
import org.jkiss.code.Nullable;
public class SQLQueryRowsCrossJoinModel extends SQLQueryRowsSetOperationModel
 *
        @NotNull SQLQueryRecognitionContext statistics
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    protected SQLQueryRowsDataContext resolveRowDataImpl(

import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolOrigin;
    }
 * you may not use this file except in compliance with the License.
            return this.left.getRowsDataContext();
        SQLQueryRowsSourceContext right = this.right != null
            ? this.right.resolveRowSources(this.isLateral ? left : context, statistics)
        @NotNull SQLQueryRowsSourceModel left,
            this.rightSourceScope.setSymbolsOrigin(rightSourceOrigin);
            : context.resetAsUnresolved();
        @NotNull SQLQueryRowsSourceModel child,
    ) {
