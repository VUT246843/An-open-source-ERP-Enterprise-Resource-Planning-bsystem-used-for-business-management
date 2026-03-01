 * DBeaver - Universal Database Manager
        this.alterActions.forEach(this::registerSubnode);
            for (SQLQueryTableAlterActionSpec alterAction : this.alterActions) {
                                .map(n -> SQLQueryColumnSpec.recognize(recognizer, n)).orElse(null);
        LinkedList<SQLQueryTableAlterActionSpec> alterActions = new LinkedList<>();
/*

public class SQLQueryTableAlterModel extends SQLQueryModelContent {
    @Override
 * limitations under the License.

                        case ADD_TABLE_CONSTRAINT -> tableConstraintSpec =
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
    }
    private final SQLQueryRowsTableDataModel targetTable;

 * Unless required by applicable law or agreed to in writing, software
    ) {

import org.jkiss.dbeaver.model.stm.STMTreeNode;
 *
    public SQLQueryRowsTableDataModel getTargetTable() {

    @Override
                );
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull

                if (actionKind != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
        for (STMTreeNode subnode : node.findChildrenOfName(STMKnownRuleNames.alterTableAction)) {
import java.util.*;


    @Nullable
        return new SQLQueryTableAlterModel(node, targetTable, alterActions);
                                .map(recognizer::collectQualifiedName).orElse(null);
                SQLQueryComplexName tableConstraintName = null;
        }
                    this.targetTable.getTable() == null ? null : this.targetTable.getRowsDataContext(),
    }
                                .map(n -> recognizer.collectIdentifier(n, null)).orElse(null);
                    statistics

                SQLQueryTableConstraintSpec tableConstraintSpec = null;
        STMKnownRuleNames.dropTableConstraintDefinition, SQLQueryTableAlterActionKind.DROP_TABLE_CONSTRAINT


        return this.targetTable;
    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
                        case ADD_COLUMN ->
    @Nullable
    }
                            columnSpec = Optional.ofNullable(actionNode.findFirstChildOfName(STMKnownRuleNames.columnDefinition))
        STMKnownRuleNames.renameColumnDefinition, SQLQueryTableAlterActionKind.RENAME_COLUMN,
                        case ALTER_COLUMN, RENAME_COLUMN, DROP_COLUMN ->
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            this.targetTable.resolveObjectAndRowsReferences(context, statistics);
        }
        } else {
 *
                SQLQueryTableAlterActionKind actionKind = alterActionKindByNodeName.get(actionNode.getNodeName());
                    ));
                SQLQuerySymbolEntry columnName = null;
    public List<SQLQueryTableAlterActionSpec> getAlterActions() {
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
 * You may obtain a copy of the License at
        @NotNull STMTreeNode syntaxNode,
                    alterActions.addLast(new SQLQueryTableAlterActionSpec(
            }
            this.targetTable.resolveValueRelations(context, statistics);
        if (this.targetTable != null) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        STMKnownRuleNames.addColumnDefinition, SQLQueryTableAlterActionKind.ADD_COLUMN,
                    switch (actionKind) {
 */
        }
            if (actionNode != null) {

        STMKnownRuleNames.dropColumnDefinition, SQLQueryTableAlterActionKind.DROP_COLUMN,
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    }
                            columnName = Optional.ofNullable(actionNode.findFirstChildOfName(STMKnownRuleNames.columnName))
    public SQLQueryTableAlterModel(
        STMKnownRuleNames.alterColumnDefinition, SQLQueryTableAlterActionKind.ALTER_COLUMN,
                SQLQueryColumnSpec columnSpec = null;
 * you may not use this file except in compliance with the License.
        return this.alterActions;
        return visitor.visitAlterTable(this, arg);


    }
        @NotNull List<SQLQueryTableAlterActionSpec> alterActions
        super(syntaxNode.getRealInterval(), syntaxNode);

    public static SQLQueryTableAlterModel recognize(@NotNull SQLQueryModelRecognizer recognizer, @NotNull STMTreeNode node) {
                            Optional.ofNullable(actionNode.findFirstChildOfName(STMKnownRuleNames.tableConstraintDefinition))
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final List<SQLQueryTableAlterActionSpec> alterActions;

                                .map(n -> SQLQueryTableConstraintSpec.recognize(recognizer, n)).orElse(null);
        this.targetTable = targetTable;
                        case DROP_TABLE_CONSTRAINT ->
        @Nullable SQLQueryRowsTableDataModel targetTable,
            STMTreeNode actionNode = subnode.findFirstNonErrorChild();
                    }
 *
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
                        actionNode, actionKind, columnSpec, columnName, tableConstraintSpec, tableConstraintName
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
}
        if (this.targetTable != null) {
import org.jkiss.code.NotNull;
                            tableConstraintName = Optional.ofNullable(actionNode.findFirstChildOfName(STMKnownRuleNames.constraintName))
    private static final Map<String, SQLQueryTableAlterActionKind> alterActionKindByNodeName = Map.of(
import org.jkiss.dbeaver.model.sql.semantics.*;

 * See the License for the specific language governing permissions and
        SQLQueryRowsTableDataModel targetTable = recognizer.collectTableReference(node, true);
    @NotNull
                alterAction.resolveRelations(
    @Override
    }
                    this.targetTable.getRowsDataContext().getRowsSources(),
            }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        this.alterActions = List.copyOf(alterActions);
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;

    );

            statistics.appendWarning(this.getSyntaxNode(), "Missing table name");
        STMKnownRuleNames.addTableConstraintDefinition, SQLQueryTableAlterActionKind.ADD_TABLE_CONSTRAINT,
import org.jkiss.code.Nullable;
