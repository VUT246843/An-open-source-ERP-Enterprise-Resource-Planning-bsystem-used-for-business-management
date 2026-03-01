    }
    @NotNull
        this.name = name;
 *
 *
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
/**
    @Override
 * DBeaver - Universal Database Manager
    }
import org.jkiss.code.Nullable;
    @NotNull
    }
        if (this.name != null && this.name.isNotClassified()) {
    @Override
        this.kind = kind;
         */
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
    
    public SQLQueryValueVariableExpression(
        return visitor.visitValueVariableExpr(this, arg);
    @Nullable
        return "Variable[" + this.kind + ":" + this.name + "]";
 */
     * Kind of the script variable
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 * You may obtain a copy of the License at
    @Nullable
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    }
 * Script variable. One of :var, ${var} or @var depending on the VariableExpressionKind
    protected SQLQueryExprType resolveValueTypeImpl(

        @NotNull VariableExpressionKind kind,
         * The variable of kind :var
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
 * See the License for the specific language governing permissions and
        @NotNull String rawName
        return this.kind == VariableExpressionKind.BATCH_VARIABLE && this.name != null ? this.name.getSymbol() : null;
        }
    private final String rawName;
    @NotNull
        @Nullable SQLQuerySymbolEntry name,
        return this.kind;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
 *
    @Override
    @Override
            this.symbolClass = symbolClass;
    }
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        
         */
    public String toString() {
 *     http://www.apache.org/licenses/LICENSE-2.0
         * The variable of kind ${var}
    private void resolveVariableImpl() {



    ) {
    @NotNull
    @Override
public class SQLQueryValueVariableExpression extends SQLQueryValueExpression {
    @NotNull
        /**
    public String getRawName() {
    }
        }
        /**
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.name);
         * The variable of kind @var
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

        this.rawName = rawName;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
    @NotNull
    @Override
    }

import org.jkiss.dbeaver.model.sql.semantics.*;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        /**
    @Nullable
    /**
    private final SQLQuerySymbolEntry name;
 * Unless required by applicable law or agreed to in writing, software
    public enum VariableExpressionKind {

        super(syntaxNode);

    private final VariableExpressionKind kind;

    ) {
        return SQLQueryExprType.UNKNOWN;

    public VariableExpressionKind getKind() {
        CLIENT_VARIABLE(SQLQuerySymbolClass.DBEAVER_VARIABLE),
        BATCH_VARIABLE(SQLQuerySymbolClass.SQL_BATCH_VARIABLE),

        public final SQLQuerySymbolClass symbolClass;
}        @NotNull SQLQueryRowsDataContext context,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
    }
    }
 * limitations under the License.
        return this.rawName;
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;
         */
        this.resolveVariableImpl();
        CLIENT_PARAMETER(SQLQuerySymbolClass.DBEAVER_PARAMETER);
        @NotNull SQLQueryRecognitionContext statistics
     */

 */
        @NotNull STMTreeNode syntaxNode,
        VariableExpressionKind(@NotNull SQLQuerySymbolClass symbolClass) {
            this.name.getSymbol().setSymbolClass(this.kind.symbolClass);

    }
    public SQLQuerySymbol getColumnNameIfTrivialExpression() {
