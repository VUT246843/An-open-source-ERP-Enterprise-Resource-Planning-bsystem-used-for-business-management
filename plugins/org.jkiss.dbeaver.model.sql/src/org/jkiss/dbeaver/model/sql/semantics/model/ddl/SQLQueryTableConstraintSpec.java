        super(syntaxNode.getRealInterval(), syntaxNode, checkExpression);
            );
                        statistics.appendWarning(columnRef, "Column " + columnRef.getName() + " not found");
            referenceKey = null;
public class SQLQueryTableConstraintSpec extends SQLQueryNodeModel {
        this.constraintKind = constraintKind;
        @Nullable List<SQLQuerySymbolEntry> referencedColumns,

            }
 *
 * See the License for the specific language governing permissions and

        this.referencedColumns = referencedColumns;
        return visitor.visitTableConstraintSpec(this, arg);
        }

            .map(recognizer::collectQualifiedName).orElse(null);
            constraintKind = Optional.ofNullable(constraintKindByNodeName.get(constraintNode.getNodeName()))
        }
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
    @Override
        }
    @Nullable
    private static final Map<String, SQLQueryTableConstraintKind> constraintKindByNodeName = Map.of(
                        referencedColumns = recognizer.collectColumnNameList(refNode);
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueColumnReferenceExpression;
            }
                    }

    @Nullable
                if (referenceKey.size() != referencedKey.size()) {
                    referenceKey.add(rc);
    private final List<SQLQuerySymbolEntry> tupleColumnsList;
        }
                .orElse(SQLQueryTableConstraintKind.UNKNOWN);
 *
            switch (constraintKind) {
        this.referencedTable = referencedTable;
    @NotNull
        this.constraintName = constraintName;
                    }
            }
        this.tupleColumnsList = tupleColumnsList;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
                }
     */

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;

    public static SQLQueryTableConstraintSpec recognize(@NotNull SQLQueryModelRecognizer recognizer, @NotNull STMTreeNode node) {

        return constraintKind;
                    STMTreeNode refNode = Optional.ofNullable(constraintNode.findFirstChildOfName(STMKnownRuleNames.referencesSpecification))
                case REFERENCES -> Optional.ofNullable(constraintNode.findFirstChildOfName(STMKnownRuleNames.referencingColumns))
        } else {
        List<SQLQueryResultColumn> referenceKey;
                        referencedTable = recognizer.collectTableReference(refNode, false); // TODO consider if FK to alias allowed
            SQLQuerySymbolOrigin columnNameOrigin = new SQLQuerySymbolOrigin.ColumnNameFromRowsData(tableContext);
        @NotNull SQLQueryRecognitionContext statistics
                if (columnRef.isNotClassified()) {

    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
}
    private final SQLQueryComplexName constraintName;
        @Nullable SQLQueryValueExpression checkExpression

        @Nullable SQLQueryRowsDataContext tableContext,
        STMTreeNode constraintNode = Optional.ofNullable(node.findFirstChildOfName(STMKnownRuleNames.tableConstraint))
import org.jkiss.dbeaver.model.sql.semantics.*;
    @Nullable
        SQLQueryValueExpression checkExpression = null;
    @NotNull
 * DBeaver - Universal Database Manager
        SQLQueryRowsTableDataModel referencedTable = null;
                sourceContext,
    private final SQLQueryTableConstraintKind constraintKind;
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
import java.util.*;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

                case CHECK -> checkExpression = recognizer.collectValueExpression(constraintNode, null);
                // TODO validate data types of tupleColumnList against referencedContext tuple
        if (constraintNode != null) {



                statistics
        STMKnownRuleNames.referentialConstraintDefinition, SQLQueryTableConstraintKind.REFERENCES,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Nullable List<SQLQuerySymbolEntry> tupleColumnsList,

import org.jkiss.dbeaver.model.stm.STMTreeNode;
 * You may obtain a copy of the License at
                    statistics.appendError(this.getSyntaxNode(), "Inconsistent foreign key tuple size");
            constraintKind = SQLQueryTableConstraintKind.UNKNOWN;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        @NotNull STMTreeNode syntaxNode,
    @Nullable
        if (this.checkExpression != null && tableContext != null) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
                }
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
            if (referencedContext != null && referenceKey != null) {
    }
                        .orElse(null);
        STMKnownRuleNames.uniqueConstraintDefinition, SQLQueryTableConstraintKind.UNIQUE,
        @NotNull SQLQueryRowsSourceContext sourceContext,
                    .map(recognizer::collectColumnNameList).orElse(null);
    public SQLQueryComplexName getConstraintName() {
        STMKnownRuleNames.checkConstraintDefinition, SQLQueryTableConstraintKind.CHECK
    public void resolveRelations(
    /**
 * you may not use this file except in compliance with the License.
            this.checkExpression.resolveRowSources(tableContext.getRowsSources(), statistics);
                }
        SQLQueryTableConstraintKind constraintKind;
        this.checkExpression = checkExpression;
    }
        List<SQLQuerySymbolEntry> tupleColumnsList = null;
    );
        SQLQueryComplexName constraintName = Optional.ofNullable(node.findFirstChildOfName(STMKnownRuleNames.constraintNameDefinition))
                this.referencedTable,
            .map(n -> n.findFirstNonErrorChild()).orElse(null);
/*
    ) {
        @Nullable SQLQueryComplexName constraintName,
    @Nullable

            SQLQueryRowsDataContext referencedContext = SQLQueryColumnConstraintSpec.propagateForReferencedEntity(
    private final List<SQLQuerySymbolEntry> referencedColumns;
    protected SQLQueryTableConstraintSpec(
    private final SQLQueryRowsTableDataModel referencedTable;
        List<SQLQuerySymbolEntry> referencedColumns = null;
            tupleColumnsList = switch (constraintKind) {
            };


 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
    @Nullable
        if (this.tupleColumnsList != null && !this.tupleColumnsList.isEmpty() && tableContext != null) {
                default -> null;
                List<SQLQueryResultColumn> referencedKey = referencedContext.getColumnsList();

    }
    }
        @Nullable SQLQueryRowsTableDataModel referencedTable,
            this.checkExpression.resolveValueRelations(tableContext, statistics);
 * Unless required by applicable law or agreed to in writing, software
     * Propagate semantics context and establish relations through the query model
                    SQLQueryResultColumn rc = tableContext.resolveColumn(statistics.getMonitor(), columnRef.getName());
        } else {
            referenceKey = new ArrayList<>(this.tupleColumnsList.size());
                case REFERENCES -> {


    private final SQLQueryValueExpression checkExpression;
                        SQLQuerySemanticUtils.propagateColumnDefinition(columnRef, rc, statistics, columnNameOrigin);
                    if (refNode != null) {
        return constraintName;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
                    } else {
 */
    @NotNull
                case UNIQUE -> recognizer.collectColumnNameList(constraintNode);
        return new SQLQueryTableConstraintSpec(node, constraintName, constraintKind, tupleColumnsList, referencedTable, referencedColumns, checkExpression);
                        columnRef.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);
        @NotNull SQLQueryTableConstraintKind constraintKind,
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
                this.referencedColumns,
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }
                        .map(n -> n.findFirstChildOfName(STMKnownRuleNames.referencedTableAndColumns))
            .map(n -> n.findFirstChildOfName(STMKnownRuleNames.constraintName))
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
        if (this.referencedTable != null) {
                    if (rc != null) {
            for (SQLQuerySymbolEntry columnRef : this.tupleColumnsList) {
    }
    public SQLQueryTableConstraintKind getConstraintKind() {
