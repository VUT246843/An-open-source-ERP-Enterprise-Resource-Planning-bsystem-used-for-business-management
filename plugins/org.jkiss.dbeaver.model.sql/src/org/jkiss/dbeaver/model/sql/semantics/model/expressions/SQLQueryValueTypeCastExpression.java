

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    public String toString() {
 * See the License for the specific language governing permissions and
    }
 */
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        return visitor.visitValueTypeCastExpr(this, arg);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
import org.jkiss.code.NotNull;
        this.typeRefString = typeRefString;
    }
    public SQLQueryValueExpression getValueExpr() {
    private void resolveTypeImpl() {
        this.type = SQLQueryExprType.forExplicitTypeRef(this.typeRefString);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
}
 *

    private final String typeRefString;
    ) {

    }
    }
        return this.type;
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @NotNull

        return this.typeRefString;
 * Describes type cast expression
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
public class SQLQueryValueTypeCastExpression extends SQLQueryValueExpression {
    @NotNull
        this.value = value;

    }
        @NotNull SQLQueryRecognitionContext statistics

    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
        return "TypeCast[" + this.value.toString() + ", " + this.typeRefString + "]";
    
 *
    protected SQLQueryExprType resolveValueTypeImpl(
        super(syntaxNode);
 * DBeaver - Universal Database Manager
        @NotNull SQLQueryValueExpression value,
    @NotNull
    @NotNull
        this.resolveTypeImpl();
 * you may not use this file except in compliance with the License.

    private final SQLQueryValueExpression value;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull String typeRefString
        return this.value;
 * Unless required by applicable law or agreed to in writing, software

    public SQLQueryValueTypeCastExpression(
 * You may obtain a copy of the License at
    @Override
    }
        @NotNull STMTreeNode syntaxNode,
    }
    @NotNull
        this.value.resolveRowSources(context, statistics);
        @NotNull SQLQueryRowsDataContext context,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
    ) {
 */
    public String getTypeRefString() {
    @Override
