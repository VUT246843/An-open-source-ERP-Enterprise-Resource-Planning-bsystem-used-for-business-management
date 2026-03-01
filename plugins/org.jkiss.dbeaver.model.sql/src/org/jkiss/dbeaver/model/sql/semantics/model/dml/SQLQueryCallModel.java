    @NotNull
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
 *
                : new SQLQueryObjectDataModel(
    private final SQLQueryLexicalScope nameScope;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
import org.jkiss.code.Nullable;
        }
            procedure = name == null
            STMTreeNode nameNode = node.findFirstChildOfName(STMKnownRuleNames.qualifiedName);
import java.util.Set;
        if (object != null) {
                    firstKeyword.getRealInterval().b + 2, paramsNode == null ? Integer.MAX_VALUE : paramsNode.getRealInterval().a - 1

    }
        return new SQLQueryCallModel(node, procedure, exprs, nameScope, tailScope);
    }

                    name,
                Interval.of(
                    Set.of(RelationalObjectType.TYPE_PACKAGE)
    private final List<SQLQueryValueExpression> expressions;
                )
            this.object.resolveObjectAndRowsReferences(context, statistics);
     */
        SQLQueryObjectDataModel procedure;
        if (nameScope != null) {
 * limitations under the License.
            this.registerLexicalScope(nameScope);
import org.jkiss.code.NotNull;
    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {

            exprs = paramsNode.findChildrenOfName(STMKnownRuleNames.anyValue)
 *     http://www.apache.org/licenses/LICENSE-2.0
            nameScope = h.lexicalScope;
     * Returns new instance of SQLQueryCallModel class by syntax tree
            this.nameScope.setSymbolsOrigin(new SQLQuerySymbolOrigin.DbObjectRef(
                .toList();
            this.setTailOrigin(this.tailScope.getSymbolsOrigin());
        this.tailScope = tailScope;
        return this.expressions;
        }

        if (firstKeyword != null) {
        this.expressions = expressions;
 * DBeaver - Universal Database Manager
        this.object = object;
                    RelationalObjectType.TYPE_PROCEDURE,

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
    @NotNull
        SQLQueryLexicalScope tailScope;
        }
                context.getRowsSources(), Set.of(RelationalObjectType.TYPE_PROCEDURE, RelationalObjectType.TYPE_PACKAGE), false
    }
        if (this.tailScope != null) {
    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
        @Nullable SQLQueryLexicalScope nameScope,
        List<SQLQueryValueExpression> exprs;
        try (SQLQueryModelRecognizer.LexicalScopeHolder h = recognizer.openScope()) {
                .map(cn -> recognizer.collectValueExpression(cn, null))
        @NotNull SQLQueryModelRecognizer recognizer,
 * Unless required by applicable law or agreed to in writing, software
            ));
        } else {
        }
        super(syntaxNode.getRealInterval(), syntaxNode, expressions.toArray(SQLQueryNodeModel[]::new));
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {

            tailScope = null;

        if (paramsNode == null) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;

import java.util.List;
    @Nullable
public class SQLQueryCallModel extends SQLQueryModelContent {
    public List<SQLQueryValueExpression> getExpressions() {
import org.antlr.v4.runtime.misc.Interval;
                    nameNode,
    /**
import org.jkiss.dbeaver.model.sql.semantics.*;
        }
            this.registerSubnode(object);
        this.nameScope = nameScope;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLQueryObjectDataModel getObject() {

    @NotNull
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
    ) {
        }
    @Override

import org.jkiss.dbeaver.model.struct.DBSObjectType;
import java.util.Collections;
 *
        if (this.nameScope != null) {
    @Nullable
            );
import org.jkiss.dbeaver.model.stm.STMTreeNode;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
        if (this.object != null) {
    }
        @NotNull STMTreeNode node,
    private final SQLQueryObjectDataModel object;
    private final SQLQueryLexicalScope tailScope;
            SQLQueryComplexName name = nameNode == null ? null : recognizer.collectQualifiedName(nameNode);
 * you may not use this file except in compliance with the License.
        @NotNull STMTreeNode syntaxNode,
        STMTreeNode paramsNode = node.findLastChildOfName(STMKnownRuleNames.callStatementParams);
        @NotNull List<SQLQueryValueExpression> expressions,
                .stream()


package org.jkiss.dbeaver.model.sql.semantics.model.dml;
        SQLQueryLexicalScope nameScope;
        }
}
    public static SQLQueryModelContent recognize(
    @Override
/*
        }
import org.jkiss.dbeaver.model.sql.semantics.model.ddl.SQLQueryObjectDataModel;
            tailScope = procedure == null ? nameScope : null;
    @Override
        @Nullable SQLQueryLexicalScope tailScope
            exprs = Collections.emptyList();
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
                );

 * You may obtain a copy of the License at
        @Nullable SQLQueryObjectDataModel object,
        return object;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
    private SQLQueryCallModel(


    }
 *
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
                ? null
    @Nullable
        STMTreeNode firstKeyword = node.findLastNonErrorChild();

            nameScope.setInterval(
        return visitor.visitCallStatement(this, arg);
 */
        @NotNull DBSObjectType objectType
    @Nullable
