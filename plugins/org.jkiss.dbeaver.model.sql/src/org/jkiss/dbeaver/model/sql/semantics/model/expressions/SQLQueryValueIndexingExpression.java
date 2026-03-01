    @NotNull
 * See the License for the specific language governing permissions and
        SQLQueryExprType type = this.owner.getValueType();
        @NotNull boolean[] slicingDepthSpec
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        this.owner.resolveRowSources(context, statistics);
            log.debug(e);

    
    }
import org.jkiss.dbeaver.DBException;
 */


import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        @NotNull SQLQueryRowsDataContext context,
 * Licensed under the Apache License, Version 2.0 (the "License");
    private void resolveTypeImpl(@NotNull SQLQueryRecognitionContext statistics) {

    }
/**
import org.jkiss.dbeaver.model.stm.STMTreeNode;
}
    private final boolean[] slicingDepthSpec;
    @NotNull
/*
 * you may not use this file except in compliance with the License.
public class SQLQueryValueIndexingExpression extends SQLQueryValueExpression {
    @NotNull
        }
import org.antlr.v4.runtime.misc.Interval;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
    private final SQLQueryValueExpression owner;
        return this.owner;
 * You may obtain a copy of the License at

        try {
 *
        this.slicingDepthSpec = slicingDepthSpec;
        return this.type;
        this.resolveTypeImpl(statistics);
    ) {

 * DBeaver - Universal Database Manager
        @NotNull STMTreeNode syntaxNode,
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        } catch (DBException e) {
    @Override
            type = type.findIndexedItemType(statistics.getMonitor(), slicingDepthSpec.length, slicingDepthSpec);
    }
        @NotNull SQLQueryRecognitionContext statistics
    ) {
    protected SQLQueryExprType resolveValueTypeImpl(
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
    }
    @Override

 * limitations under the License.

import org.jkiss.code.NotNull;
    public SQLQueryValueExpression getMemberOwner() {
    }
            type = null;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;
 */
 *
        return visitor.visitValueIndexingExpr(this, arg);
    public SQLQueryValueIndexingExpression(
        @NotNull SQLQueryValueExpression owner,
 * Describes arrays
        this.type = type != null ? type : SQLQueryExprType.UNKNOWN;
        super(region, syntaxNode, owner);

        this.owner = owner;
    
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            // TODO statistics.appendError(null, null);
        @NotNull Interval region,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Log log = Log.getLog(SQLQueryValueIndexingExpression.class);
