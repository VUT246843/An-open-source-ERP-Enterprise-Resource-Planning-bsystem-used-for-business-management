                            columns.addLast(SQLQueryColumnSpec.recognize(recognizer, payloadNode));
                DBSEntity realTable = realTables.size() == 1 ? realTables.getFirst() : null;
    public static SQLQueryTableCreateModel recognize(SQLQueryModelRecognizer recognizer, STMTreeNode node) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

            for (SQLQueryColumnSpec columnSpec : this.columns) {
            SQLQuerySymbolOrigin nameOrigin = new SQLQuerySymbolOrigin.DbObjectRef(context, RelationalObjectType.TYPE_TABLE);
    @Override
                    SQLQuerySymbolOrigin.DbObjectFilterMode.TABLE,
                }
        STMTreeNode elementsNode = node.findFirstChildOfName(STMKnownRuleNames.tableElementList);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            List<SQLQueryResultColumn> columns = new ArrayList<>(this.columns.size());
 * You may obtain a copy of the License at
 * limitations under the License.
                if (payloadNode != null) {

import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
    @NotNull
            } else {
                        nameOrigin,
 * See the License for the specific language governing permissions and
            }
 * DBeaver - Universal Database Manager
                        SQLQuerySymbolOrigin.DbObjectFilterMode.TABLE,
        @NotNull List<SQLQueryColumnSpec> columns,
    private final SQLQueryComplexName tableName;
/*
                        case SQLStandardParser.RULE_tableConstraintDefinition ->
            SQLQueryRowsTableValueModel virtualTableRows = new SQLQueryRowsTableValueModel(this.getSyntaxNode(), Collections.emptyList(), false);
    public void resolveObjectAndRowsReferences(@NotNull SQLQueryRowsSourceContext context, @NotNull SQLQueryRecognitionContext statistics) {
        @NotNull STMTreeNode syntaxNode,
                SQLQuerySymbolEntry columnNameEntry = columnSpec.getColumnName();

                STMTreeNode payloadNode = elementNode.findFirstNonErrorChild();
                columnSpec.resolveRelations(context, tableContext, statistics);
                    nameOrigin,
                        case SQLStandardParser.RULE_columnDefinition ->
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
            if (this.tableName.invalidPartsCount > 0) {
                    );
                if (columnNameEntry != null) {
                        context,
                );
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
        return visitor.visitCreateTable(this, arg);

                        context, this.tableName, realTable, nameOrigin, SQLQuerySymbolOrigin.DbObjectFilterMode.TABLE
    private final List<SQLQueryTableConstraintSpec> constraints;
        @Nullable SQLQueryComplexName tableName,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;


 *
import org.jkiss.dbeaver.model.sql.semantics.*;


        return this.constraints;

    }
public class SQLQueryTableCreateModel extends SQLQueryModelContent {
                    columnName = columnNameEntry.getSymbol();
    }
    @Override
        }
        return this.tableName;
                } else {
import java.util.*;
                } else {
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
                SQLQuerySemanticUtils.performPartialResolution(
                        columnName.setDefinition(columnNameEntry);
    @Override
        }
        SQLQueryComplexName tableName = recognizer.collectTableName(node);
                    }
                columns.add(new SQLQueryResultColumn(
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg) {

import org.jkiss.code.NotNull;
    public SQLQueryComplexName getTableName() {
                    columnName = new SQLQuerySymbol("?");
        LinkedList<SQLQueryTableConstraintSpec> constraints = new LinkedList<>();
                SQLQuerySymbol columnName;
package org.jkiss.dbeaver.model.sql.semantics.model.ddl;
    }
                    switch (payloadNode.getNodeKindId()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<SQLQueryTableConstraintSpec> getConstraints() {
                statistics.appendError(this.getSyntaxNode(), "Invalid table name");

        this.columns = List.copyOf(columns);

                constraintSpec.resolveRelations(context, tableContext, statistics);
                        statistics,
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @NotNull

    @Nullable
    }
                List<DBSEntity> realTables = context.getConnectionInfo().findRealTables(statistics.getMonitor(), this.tableName.stringParts);
            for (SQLQueryTableConstraintSpec constraintSpec : this.constraints) {
        return new SQLQueryTableCreateModel(node, tableName, columns, constraints);
        this.constraints.forEach(super::registerSubnode);
    }
    public void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
                    statistics,
import org.jkiss.dbeaver.model.stm.STMKnownRuleNames;
    }

    @NotNull
        this.tableName = tableName;
        this.constraints = List.copyOf(constraints);
                    context,

                        this.tableName,
            for (STMTreeNode elementNode : elementsNode.findChildrenOfName(STMKnownRuleNames.tableElement)) {
                    SQLQuerySemanticUtils.setNamePartsDefinition(
import org.jkiss.code.Nullable;
                    }
import org.jkiss.dbeaver.model.struct.DBSEntity;
        this.columns.forEach(super::registerSubnode);
                    if (columnNameEntry.isNotClassified()) {
}
    }
                ));
                }
        super(syntaxNode.getRealInterval(), syntaxNode);
                    SQLQuerySemanticUtils.performPartialResolution(
                    columnSpec.getDeclaredColumnType()

 */
                    );
    @NotNull
            }
 * Unless required by applicable law or agreed to in writing, software
        if (elementsNode != null) {

                if (realTable != null) {

        LinkedList<SQLQueryColumnSpec> columns = new LinkedList<>();
            SQLQueryRowsDataContext tableContext = context.makeTuple(null, columns, Collections.emptyList());

    public List<SQLQueryColumnSpec> getColumns() {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
            }

        if (this.tableName != null && this.tableName.isNotClassified() && !this.tableName.parts.isEmpty()) {

                }
    public SQLQueryTableCreateModel(

            for (SQLQueryColumnSpec columnSpec : this.columns) {
    @Nullable
        @NotNull List<SQLQueryTableConstraintSpec> constraints
                            constraints.addLast(SQLQueryTableConstraintSpec.recognize(recognizer, payloadNode));
                        columnName.setSymbolClass(SQLQuerySymbolClass.COLUMN);
 *
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        SQLQuerySymbolClass.TABLE
            }
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableValueModel;

                    this.tableName,
 *
            }
                    columns.size(), columnName, virtualTableRows, null, null,


    ) {
    private final List<SQLQueryColumnSpec> columns;
    }
        return this.columns;
                    SQLQuerySymbolClass.ERROR
