 * Describes a constant expression in the query, like string or number

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

    
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    @NotNull
    }
        super(syntaxNode);
    @Override
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;

        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    ) {
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
    public SQLQueryValueConstantExpression(@NotNull STMTreeNode syntaxNode, @NotNull String valueString, @NotNull SQLQueryExprType type) {
 *
 *
 * Unless required by applicable law or agreed to in writing, software
        return visitor.visitValueConstantExpr(this, arg);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */

package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
 *     http://www.apache.org/licenses/LICENSE-2.0
    
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
        return this.type;
        @NotNull SQLQueryRowsDataContext context,
 * You may obtain a copy of the License at
    public String getValueString() {
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
        this.type = type;
/*

 * See the License for the specific language governing permissions and
    
    @Override
    }
import org.jkiss.code.NotNull;
    @NotNull
 * limitations under the License.
    }
        return this.valueString;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected SQLQueryExprType resolveValueTypeImpl(
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
    }
        this.valueString = valueString;
public class SQLQueryValueConstantExpression extends SQLQueryValueExpression {
}
    @NotNull
    protected String valueString;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    @Override
