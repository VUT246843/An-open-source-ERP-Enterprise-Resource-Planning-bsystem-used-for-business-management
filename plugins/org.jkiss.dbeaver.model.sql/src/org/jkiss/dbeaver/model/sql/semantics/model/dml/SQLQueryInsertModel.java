
        if (this.getTableModel() != null) {
            if (this.columnNames != null) {
        @Nullable SQLQueryLexicalScope columnsScope) {
        return new SQLQueryInsertModel(node, tableModel, columnNames, valuesRows, insertColumnsScope);
/**
                for (SQLQuerySymbolEntry columnName : this.columnNames) {

            insertColumnsScope = new SQLQueryLexicalScope();
            columnNames = insertColumnList == null ? null : recognizer.collectColumnNameList(insertColumnList);
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        @NotNull STMTreeNode syntaxNode,
    }
import org.jkiss.code.Nullable;
    @Nullable

import java.util.Collections;
            valuesRows = valuesNode == null ? null : recognizer.collectQueryExpression(valuesNode);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final SQLQueryRowsSourceModel valuesRows;
        return visitor.visitTableStatementInsert(this, arg);

            STMTreeNode valuesNode = insertColumnsAndSource.findFirstChildOfName(STMKnownRuleNames.queryExpression);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
        SQLQueryRowsSourceModel valuesRows;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.getTableModel().resolveValueRelations(context, statistics);
    public static SQLQueryModelContent recognize(@NotNull SQLQueryModelRecognizer recognizer, @NotNull STMTreeNode node) {
            insertColumnsScope = null;
    private final List<SQLQuerySymbolEntry> columnNames;
                        SQLQueryResultColumn column = columnsContext.resolveColumn(statistics.getMonitor(), columnName.getName());

            }
            int columnsScopeFrom = insertColumnsAndSource.getRealInterval().a;
    }

            columnNames = Collections.emptyList();
        @Nullable SQLQueryRowsSourceModel valuesRows,
            }
        }
import org.antlr.v4.runtime.misc.Interval;
package org.jkiss.dbeaver.model.sql.semantics.model.dml;

    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
            insertColumnsScope.setInterval(Interval.of(columnsScopeFrom, columnsScopeTo));
            if (this.columnsScope != null) {
            if (this.valuesRows != null) {
    public List<SQLQuerySymbolEntry> getColumnNames() {
                this.columnsScope.setSymbolsOrigin(origin);
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        super(syntaxNode, tableModel);
public class SQLQueryInsertModel extends SQLQueryDMLStatementModel {
    @Nullable
        } else {
    @Override
                }
    @Nullable
        this.columnNames = columnNames;
            valuesRows = null; // use default table?
                            SQLQuerySemanticUtils.propagateColumnDefinition(columnName, column, statistics, origin);
    @Override
 * You may obtain a copy of the License at
                        }
            this.registerLexicalScope(columnsScope);

                    if (columnName.isNotClassified()) {
                // TODO validate column tuples consistency
 *
    }
 * limitations under the License.
            var origin = new SQLQuerySymbolOrigin.ColumnNameFromRowsData(columnsContext);
 */
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
                        if (column != null || !columnsContext.getRowsSources().hasUnresolvedSource()) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;

    @Override

    @NotNull

 * Describes INSERT statement
 * DBeaver - Universal Database Manager

        this.valuesRows = valuesRows;
        }
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
            int columnsScopeTo = valuesNode == null ? insertColumnsAndSource.getRealInterval().b : valuesNode.getRealInterval().a;
        }
import org.jkiss.code.NotNull;
        SQLQueryLexicalScope insertColumnsScope;
            }
        STMTreeNode insertColumnsAndSource = node.findFirstChildOfName(STMKnownRuleNames.insertColumnsAndSource);
                this.valuesRows.resolveValueRelations(context, statistics);
    }
    public SQLQueryRowsSourceModel getValuesRows() {
        if (this.valuesRows != null) {
import java.util.List;

    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                    }
 *
 *
    }
        @Nullable SQLQueryRowsTableDataModel tableModel,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            this.valuesRows.resolveRowSources(context, statistics);
            STMTreeNode insertColumnList = insertColumnsAndSource.findFirstChildOfName(STMKnownRuleNames.insertColumnList);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    }
    private SQLQueryInsertModel(
import org.jkiss.dbeaver.model.sql.semantics.*;
        if (insertColumnsAndSource != null) {
        STMTreeNode tableNameNode = node.findFirstChildOfName(STMKnownRuleNames.tableName);
        return this.valuesRows;
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
        List<SQLQuerySymbolEntry> columnNames;
        @Nullable List<SQLQuerySymbolEntry> columnNames,
        this.columnsScope = columnsScope;
    @Nullable
        if (columnsScope != null) {
 */
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
    protected void resolveRowsReferencesImpl(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {


    }
        }
    private final SQLQueryLexicalScope columnsScope;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        SQLQueryRowsTableDataModel tableModel = tableNameNode == null ? null : recognizer.collectTableReference(tableNameNode, false);
}

    @Nullable
        return this.columnNames;
            SQLQueryRowsDataContext columnsContext = this.getTableModel().getRowsDataContext();
/*
    @Nullable
