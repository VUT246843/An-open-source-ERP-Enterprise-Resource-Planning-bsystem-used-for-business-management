        return new SQLQueryTableDropModel(node, tables, ifExists, isView);
        return isView;
    private final List<SQLQueryRowsTableDataModel> tables;
    @Nullable
            this.tables.forEach(t -> t.resolveValueRelations(context, statistics));

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        List<SQLQueryRowsTableDataModel> tables = node.findChildrenOfName(STMKnownRuleNames.tableName).stream()
        return this.tables;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        if  (this.tables != null) {
    private final boolean ifExists;
        boolean ifExists,

    public List<SQLQueryRowsTableDataModel> getTables() {
            if (this.ifExists) {
        boolean ifExists = node.findFirstChildOfName(STMKnownRuleNames.ifExistsSpec) != null; // "IF EXISTS" presented
    }
                statistics.setTreatErrorAsWarnings(false);
    }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
 * Describes DELETE statement
            }
    @Override
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        this.isView = isView;
        this.ifExists = ifExists;
    public boolean getIfExists() {
    }
    }

/*
    @NotNull

}

import org.jkiss.dbeaver.model.stm.STMTreeNode;
 *
                statistics.setTreatErrorAsWarnings(true);
    }
import java.util.List;

 *
    ) {
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    @Override
        @NotNull STMTreeNode syntaxNode,

        return visitor.visitTableStatementDrop(this, arg);
/**
public class SQLQueryTableDropModel extends SQLQueryModelContent {
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
            this.tables.forEach(t -> t.resolveObjectAndRowsReferences(context, statistics));
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryModelRecognizer;

    private SQLQueryTableDropModel(
        @NotNull SQLQueryModelRecognizer recognizer,
            if (this.ifExists) {

            if (this.ifExists) {

        @NotNull STMTreeNode node,
 * limitations under the License.
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
    @Nullable
        super(syntaxNode.getRealInterval(), syntaxNode);
 *     http://www.apache.org/licenses/LICENSE-2.0
        return this.ifExists;
 * Licensed under the Apache License, Version 2.0 (the "License");

        @Nullable List<SQLQueryRowsTableDataModel> tables,
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
 * distributed under the License is distributed on an "AS IS" BASIS,
                statistics.setTreatErrorAsWarnings(false);
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
import java.util.stream.Collectors;
 * You may obtain a copy of the License at

        if  (this.tables != null) {
    }
            }
    @Override
    public static SQLQueryModelContent recognize(
 */
    @Nullable
        boolean isView
 *
            .map(n -> recognizer.collectTableReference(n, true)).collect(Collectors.toList());
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
    private final boolean isView;
        this.tables = tables;
        boolean isView) {
            }
    public boolean isView() {
            if (this.ifExists) {

                statistics.setTreatErrorAsWarnings(true);
        }
 * Unless required by applicable law or agreed to in writing, software
 */
            }
    }
    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
