        @NotNull Set<DBSObjectType> objectContainerTypes
            .filter(Objects::nonNull)
    @NotNull
    public SQLQueryObjectDataModel getObject() {
import java.util.Objects;
        super(syntaxNode.getRealInterval(), syntaxNode, object);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable SQLQueryObjectDataModel object,

    ) {
    @Nullable
        this.ifExists = ifExists;
 *
            .findFirst().orElse(null);
 */
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {

    public boolean getIfExists() {
    private final boolean ifExists;
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
public class SQLQueryObjectDropModel extends SQLQueryModelContent {
    }
        boolean ifExists
    @Nullable
        @NotNull SQLQueryModelRecognizer recognizer,
        return new SQLQueryObjectDropModel(node, procedure, ifExists);
import java.util.Set;

        @NotNull DBSObjectType objectType,


    }

    }
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
        return visitor.visitObjectStatementDrop(this, arg);
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
 * Licensed under the Apache License, Version 2.0 (the "License");
            .map(n -> new SQLQueryObjectDataModel(n.syntaxNode, n, objectType, objectContainerTypes))
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        @NotNull STMTreeNode node,
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * You may obtain a copy of the License at
            .map(recognizer::collectQualifiedName)
/*
import org.jkiss.code.NotNull;
        @NotNull STMTreeNode syntaxNode,
    @Override
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;

import org.jkiss.dbeaver.model.struct.DBSObjectType;

    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
}

 *
        return object;
    }
 * Unless required by applicable law or agreed to in writing, software
        SQLQueryObjectDataModel procedure = node.findChildrenOfName(STMKnownRuleNames.qualifiedName).stream()
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
        return this.ifExists;
    }
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
    ) {

    @Nullable
 * DBeaver - Universal Database Manager

        this.object = object;
 *
    private final SQLQueryObjectDataModel object;
        boolean ifExists = node.findFirstChildOfName(STMKnownRuleNames.ifExistsSpec) != null; // "IF EXISTS" presented
    private SQLQueryObjectDropModel(
    public static SQLQueryModelContent recognize(
    @Override
