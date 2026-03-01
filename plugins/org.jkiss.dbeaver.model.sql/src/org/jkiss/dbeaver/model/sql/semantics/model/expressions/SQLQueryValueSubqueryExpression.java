 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
/*
 * You may obtain a copy of the License at
        return this.source;
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
 * DBeaver - Universal Database Manager
public class SQLQueryValueSubqueryExpression extends SQLQueryValueExpression {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
        this.source.resolveValueRelations(context, statistics);

 * Unless required by applicable law or agreed to in writing, software
}
    @NotNull
    @NotNull
 */
        @NotNull SQLQueryRecognitionContext statistics
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLQueryRowsDataContext context,
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        super(syntaxNode, source);
import org.jkiss.code.NotNull;
    ) {
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
 * you may not use this file except in compliance with the License.
    public SQLQueryRowsSourceModel getSource() {
    public SQLQueryValueSubqueryExpression(@NotNull STMTreeNode syntaxNode, @NotNull SQLQueryRowsSourceModel source) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

 *
/**

    }

    }
    }
 * limitations under the License.
    protected SQLQueryExprType resolveValueTypeImpl(
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

 */
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        this.source.resolveObjectAndRowsReferences(context, statistics);
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
 * Describes subquery
    }
        return visitor.visitValueSubqueryExpr(this, arg);
 *
    private final SQLQueryRowsSourceModel source;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 *
        return SQLQueryExprType.forScalarSubquery(this.source);
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
        this.source = source;
