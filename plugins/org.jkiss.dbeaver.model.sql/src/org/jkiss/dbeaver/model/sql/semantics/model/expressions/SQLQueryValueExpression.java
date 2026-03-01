    ) {

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

    }

    public SQLQueryValueExpression(@NotNull STMTreeNode syntaxNode, @Nullable SQLQueryNodeModel ... subnodes) {

        return null;
     */
    );
        this.resolveRowSourcesImpl(context, statistics);
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

    public SQLQuerySymbol getColumnNameIfTrivialExpression() {
 * Unless required by applicable law or agreed to in writing, software

    }
        @NotNull SQLQueryRowsSourceContext context,
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    public SQLQueryValueExpression(@NotNull Interval region, STMTreeNode syntaxNode, @Nullable SQLQueryNodeModel ... subnodes) {
    public final void resolveRowSources(
    /**
 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;
    );
 * you may not use this file except in compliance with the License.
        this.type = this.resolveValueTypeImpl(context, statistics);
public abstract class SQLQueryValueExpression extends SQLQueryNodeModel {

    }
            () -> statistics.getMonitor().isCanceled()
    
    public String getExprContent() {
 *
    }
        @NotNull SQLQueryRowsSourceContext context,
     * Propagate information about available tables down the model and about actually referenced tables back up
        @NotNull SQLQueryRowsDataContext context,
    protected SQLQueryExprType type = SQLQueryExprType.UNKNOWN;
 * You may obtain a copy of the License at
    }
    public final SQLQueryExprType getValueType() {
        this(syntaxNode.getRealInterval(), syntaxNode, subnodes);
        return null;
            SQLQueryValueExpression.class,

    @NotNull
 *
     * Propagate information about scalar values the query model
    }
    }
    @Nullable
    /**
            this,

    @NotNull
        super(region, syntaxNode, subnodes);
     */
        return this.getSyntaxNode().getTextContent();
import org.jkiss.code.Nullable;
    }
 */


        );
        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
    public final void resolveValueType(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull SQLQueryRecognitionContext statistics
import org.antlr.v4.runtime.misc.Interval;
import org.jkiss.dbeaver.model.sql.semantics.context.*;
    /**
/*
    public final void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {

    protected abstract SQLQueryExprType resolveValueTypeImpl(
     * Propagate information about values and row tuples across the query model
    protected abstract void resolveRowSourcesImpl(
     */

    public SQLQueryResultColumn getColumnIfTrivialExpression() {
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
        return type;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
    @Nullable
}
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbol;
    }
        traverseSubtreeSimple(
 * limitations under the License.
            n -> n.resolveValueType(context, statistics),
