    public SQLQueryComplexName getConstraintName() {
        return resultContext;
    @Nullable
                    }
     * Propagate semantics context and establish relations through the query model
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {
        @Nullable SQLQueryValueExpression checkExpression
        }
        statistics.setTreatErrorAsWarnings(false);
 * Unless required by applicable law or agreed to in writing, software
                    } else {
            } else {
                    }
    public void resolveRelations(
                    SQLQueryResultColumn rc = referencedContext.resolveColumn(statistics.getMonitor(), columnRef.getName());
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
        @NotNull SQLQueryRecognitionContext statistics
    ) {
    @Nullable

            } else {
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
        this.constraintName = constraintName;
                        );

    private final List<SQLQuerySymbolEntry> referencedColumns;
                statistics.appendWarning(

                    "foreign key columns of table " + referencedTable.getName().getNameString()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        null, SQLQueryExprType.UNKNOWN
                                referencedTable.getName().syntaxNode,
import org.jkiss.code.NotNull;
                            referencedTable.getName().syntaxNode,
            if (referencedContext != null) {
                try {
            this.checkExpression.resolveValueRelations(tableDataContext, statistics);
    private final SQLQueryColumnConstraintKind kind;
                        ));
                    resultColumns.add(new SQLQueryResultColumn(
                // table reference resolution failed, so cannot resolve its columns as well


    @Nullable
        SQLQueryRowsDataContext referencedContext = referencedTable.getRowsDataContext();
                } catch (DBException e) {
        @NotNull SQLQueryRowsTableDataModel referencedTable,
 * See the License for the specific language governing permissions and
                resultContext = null;
    /**
    private final SQLQueryRowsTableDataModel referencedTable;
                        "Failed to resolve primary key of the referenced table " + referencedTable.getName().getNameString(),
        this.kind = kind;
 * limitations under the License.
    @Override
                        columnRef.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);
                    if (columnRef.isNotClassified()) {
    private final SQLQueryValueExpression checkExpression;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull SQLQueryColumnConstraintKind kind,
        }
    public SQLQueryColumnConstraintKind getKind() {
        if (referencedColumns != null && !referencedColumns.isEmpty()) {
                        statistics.appendWarning(columnRef, "Failed to resolve column " + columnRef.getName());
        this.referencedColumns = referencedColumns;
        } else {
}
                    ));
import org.jkiss.dbeaver.model.struct.*;
                    statistics.appendError(
        if (this.checkExpression != null && tableDataContext != null) {
                }
                            "Failed to obtain primary key of the referenced table " + referencedTable.getName().getNameString()
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
                        referencedTable, referencedTable.getTable(),
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
                        resultColumns.size(), columnRef.getSymbol(),
                }
    public SQLQueryColumnConstraintSpec(
                        resultColumns.add(rc.withNewIndex(resultColumns.size()));
                            );
            this.checkExpression.resolveRowSources(tableDataContext.getRowsSources(), statistics);
                        if (pkAttrs.isEmpty()) {
        @Nullable List<SQLQuerySymbolEntry> referencedColumns,
                        List<DBSEntityAttribute> pkAttrs = Optional.ofNullable(referrer.getAttributeReferences(statistics.getMonitor()))
                if (referencedContext.getColumnsList().size() != 1) {
                            resultContext = null;
import java.util.stream.Collectors;
                                referencedTable.getName().syntaxNode, referencedTable, realTable, referencedContext.getConnection().dialect, statistics, pkAttrs
     * Propagate semantics context for referenced entity
        SQLQuerySymbolOrigin referencedColumnNameOrigin = new SQLQuerySymbolOrigin.ColumnNameFromRowsData(referencedContext);
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 * You may obtain a copy of the License at
    @Nullable
                    resultContext = null;
                            SQLQuerySemanticUtils.propagateColumnDefinition(columnRef, rc, statistics, referencedColumnNameOrigin);
                    if (rc != null) {

    /**
                        .findFirst();
        statistics.setTreatErrorAsWarnings(true);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    ) {
                        }
                }
                        columnRef.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);
import org.jkiss.dbeaver.model.stm.STMTreeNode;

                        columnRef.setOrigin(referencedColumnNameOrigin);
            }
                    Optional<? extends DBSEntityConstraint> pk = Optional.ofNullable(realTable.getConstraints(statistics.getMonitor()))
                                "Failed to obtain primary key attribute of the referenced table " + referencedTable.getName().getNameString()
    @Nullable
                            null, SQLQueryExprType.UNKNOWN
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super(syntaxNode.getRealInterval(), syntaxNode, checkExpression);
        }
                        .filter(c -> c.getConstraintType().equals(DBSEntityConstraintType.PRIMARY_KEY))
            }
                        resultColumns.add(new SQLQueryResultColumn(
        @NotNull SQLQueryRowsSourceContext rowsContext,
 */
    }

                            resultContext = referencedContext.getRowsSources().makeTuple(null, SQLQuerySemanticUtils.prepareResultColumnsList(
                    referencedTable.getName().syntaxNode,
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 *
                        e
        @Nullable List<SQLQuerySymbolEntry> referencedColumns,
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;


                    "Failed to validate " + (referencedColumns.size() > 1 ? "compound " : "") +
        @NotNull SQLQueryRowsSourceContext rowsContext,
/*
    private final SQLQueryComplexName constraintName;
                            statistics.appendWarning(
        return this.constraintName;
 * DBeaver - Universal Database Manager
        referencedTable.resolveObjectAndRowsReferences(rowsContext, statistics);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
        SQLQueryRowsDataContext resultContext;
                        }
        if (this.referencedTable != null) {


                for (SQLQuerySymbolEntry columnRef : referencedColumns) {
                        if (columnRef.isNotClassified()) {
    }
                        referencedTable.getName().syntaxNode,
    }
 *
                            .orElse(Collections.emptyList()).stream()
import org.jkiss.code.Nullable;
            List<SQLQueryResultColumn> resultColumns = new ArrayList<>(referencedColumns.size());
        this.referencedTable = referencedTable;

                    } else {
            SQLQueryRowsDataContext referencedContext = propagateForReferencedEntity(this.referencedTable, this.referencedColumns, rowsContext, statistics);
    }
                            ));
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
import java.util.*;
import org.jkiss.dbeaver.DBException;
                    statistics.appendWarning(this.getSyntaxNode(), "Inconsistent foreign key tuple size");
                    if (pk.isPresent() && pk.get() instanceof DBSEntityReferrer referrer) {
        return visitor.visitColumnConstraintSpec(this, arg);
                for (SQLQuerySymbolEntry columnRef : referencedColumns) {
                    }
                        } else {
                        .orElse(Collections.emptyList()).stream()
        return this.kind;
    }
        @Nullable SQLQueryComplexName constraintName,
                        statistics.appendWarning(
                        resultContext = null;
                            referencedTable, realTable,
            resultContext = referencedContext.getRowsSources().makeTuple(null, resultColumns, Collections.emptyList());
            if (realTable != null) {
        referencedTable.resolveValueRelations(rowsContext.makeEmptyTuple(), statistics);
        @Nullable SQLQueryRowsDataContext tableDataContext,
                );
    @NotNull
                            .map(DBSEntityAttributeRef::getAttribute).collect(Collectors.toList());
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        @NotNull STMTreeNode syntaxNode,
import org.jkiss.dbeaver.model.sql.semantics.*;
        DBSEntity realTable = referencedTable.getTable();

    public static SQLQueryRowsDataContext propagateForReferencedEntity(
 *
     */
public class SQLQueryColumnConstraintSpec extends SQLQueryNodeModel {
 * you may not use this file except in compliance with the License.

    }
        @Nullable SQLQueryRowsTableDataModel referencedTable,
        this.checkExpression = checkExpression;

                }
                            resultColumns.size(), columnRef.getSymbol(),
                    );

        @NotNull SQLQueryRecognitionContext statistics
    @NotNull
                // no explicit foreign key columns, and table is not resolved, so no way to validate the reference
            if (realTable != null) {
    ) {
