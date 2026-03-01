    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    ) {
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    }
 * DBeaver - Universal Database Manager
}    public List<SQLQueryValueExpression> getOperands() {
        @NotNull SQLQueryRowsDataContext context,
    }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
 */
 *


 * See the License for the specific language governing permissions and
public class SQLQueryValueFlattenedExpression extends SQLQueryValueExpression {

 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {

 * Describes value expressions tree hierarchy
    public SQLQueryValueFlattenedExpression(
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull SQLQueryRecognitionContext statistics
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    ) {
    @Override
        for (SQLQueryValueExpression expr : this.operands) {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    }
import java.util.List;
            expr.resolveRowSources(context, statistics);
        return operands;

    @Override
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
/*
        @NotNull STMTreeNode syntaxNode,
 *
        super(syntaxNode, operands.toArray(SQLQueryValueExpression[]::new));
        return SQLQueryExprType.UNKNOWN;
    @NotNull
    }

 *

        return visitor.visitValueFlatExpr(this, arg);
 * You may obtain a copy of the License at
 * limitations under the License.
    @NotNull
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
import org.jkiss.code.NotNull;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * you may not use this file except in compliance with the License.
    @NotNull
/**
        @NotNull List<SQLQueryValueExpression> operands
        this.operands = operands;
    protected SQLQueryExprType resolveValueTypeImpl(
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final List<SQLQueryValueExpression> operands;
