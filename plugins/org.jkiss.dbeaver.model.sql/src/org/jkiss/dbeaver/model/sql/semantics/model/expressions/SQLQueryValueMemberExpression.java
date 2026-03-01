import org.jkiss.dbeaver.Log;
    private final SQLQuerySymbolEntry identifier;
 * See the License for the specific language governing permissions and
    }
package org.jkiss.dbeaver.model.sql.semantics.model.expressions;

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
            this.type = SQLQueryExprType.UNKNOWN;
    protected void resolveRowSourcesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
        this.owner = owner;
/**
 * limitations under the License.


        return this.owner;
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
    public SQLQuerySymbol getColumnNameIfTrivialExpression() {

        super(range, syntaxNode, owner);
        } else if (this.identifier.isNotClassified()) {
 *

        this.resolveTypeImpl(statistics);
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
        this.owner.resolveRowSources(context, statistics);
    protected SQLQueryExprType resolveValueTypeImpl(
import org.jkiss.code.NotNull;
    @Nullable
/*
            this.type = type != null ? type : SQLQueryExprType.UNKNOWN;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    @Override
    @NotNull
            (this.identifier == null ? "<NULL>" : this.identifier.getName()) + ":" + this.type + "]";

    @Override
 *
 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
    @NotNull
    }
import org.jkiss.dbeaver.model.stm.STMTreeNode;
            SQLQueryExprType type = SQLQuerySemanticUtils.tryResolveMemberReference(statistics, this.owner.getValueType(), this.identifier, memberOrigin);
    private final SQLQueryValueExpression owner;
import org.jkiss.code.Nullable;
 */
        return this.type;
    public SQLQueryValueMemberExpression(
}

                this.memberAccessEntry.setOrigin(memberOrigin);
        @NotNull SQLQueryRecognitionContext statistics
import org.antlr.v4.runtime.misc.Interval;
    @Override
    private final SQLQueryMemberAccessEntry memberAccessEntry;
        return visitor.visitValueMemberReferenceExpr(this, arg);
 */
        SQLQuerySymbolOrigin memberOrigin = new SQLQuerySymbolOrigin.MemberOfType(this.owner.getValueType());
        @Nullable SQLQuerySymbolEntry identifier,

    @Override
        @NotNull SQLQueryValueExpression owner,
            }
        return this.identifier == null ? null : this.identifier.getSymbol();
    }
    }
 * Unless required by applicable law or agreed to in writing, software
    public SQLQueryValueExpression getMemberOwner() {
 *     http://www.apache.org/licenses/LICENSE-2.0

public class SQLQueryValueMemberExpression extends SQLQueryValueExpression {
        }
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.identifier);

    ) {
        return "ValueMember[(" + this.owner + ")." +

        this.identifier = identifier;
import org.jkiss.dbeaver.model.sql.semantics.*;

    @Nullable
    }
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
        if (this.identifier == null) {
        @NotNull Interval range,
    @Override
        return this.identifier;
    public SQLQuerySymbolEntry getMemberIdentifier() {
            if (this.memberAccessEntry != null) {
    private void resolveTypeImpl(@NotNull SQLQueryRecognitionContext statistics) {
    @Override
    }
    @Nullable

    @NotNull

    private static final Log log = Log.getLog(SQLQueryValueMemberExpression.class);
        @NotNull STMTreeNode syntaxNode,
    public String toString() {

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.memberAccessEntry = memberAccessEntry;
    @Nullable
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
    }
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 * Describes a member access to the element of the composite type
    @Nullable
        @NotNull SQLQueryRowsDataContext context,
        @Nullable SQLQueryMemberAccessEntry memberAccessEntry
