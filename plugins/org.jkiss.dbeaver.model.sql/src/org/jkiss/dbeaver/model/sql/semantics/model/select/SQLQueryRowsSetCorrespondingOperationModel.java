 * See the License for the specific language governing permissions and
public class SQLQueryRowsSetCorrespondingOperationModel extends SQLQueryRowsSetOperationModel
//                    SQLQueryResultColumn rightDef = right.resolveColumn(statistics.getMonitor(), column.getName());
//                        SQLQuerySymbolDefinition leftDef = leftColumn.symbol.getDefinition();
//            int resultColumnsCount = Math.max(leftColumns.size(), rightColumns.size());
//                    SQLQueryResultColumn leftColumn = leftColumns.get(i);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
//            int resultColumnsCount = correspondingColumnNames.size();
    @NotNull

//                } else {
//                    nonMatchingColumnSets = true;
    @NotNull
    public boolean delayRestChildren() {
        if (leftDef == null && rightDef == null) {
//            List<SQLQueryResultColumn> leftColumns = left.getColumnsList();
//                        // new symbol after merge carries underlying info of the left column and combined entries set
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    @Override
//                } else if (i >= rightColumns.size()) {
//                    column.getSymbol().setDefinition(column); // TODO combine multiple definitions
//    ) {
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        @NotNull Interval range,
 */
        @NotNull List<SQLQuerySymbolEntry> correspondingColumnNames,
    @Override
        super(range, syntaxNode, left, right);

//

    private SQLQueryExprType obtainCommonType(@Nullable SQLQueryResultColumn leftDef, @Nullable SQLQueryResultColumn rightDef) {
    implements SQLQueryNodeModel.NodeSubtreeTraverseControl<SQLQueryRowsSourceModel, SQLQueryRowsDataContext> {
//                        SQLQuerySymbolClass leftClass = leftColumn.symbol.getSymbolClass();
//        if (nonMatchingColumnSets) {
//            for (int i = 0; i < resultColumnsCount; i++) {
        return type;
//                    column.setOrigin(columnNameOrigin);
    }
    @NotNull
    }
 *
 * you may not use this file except in compliance with the License.
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
//        return context.overrideResultTuple(this, resultColumns, Collections.emptyList());
//
//                        nonMatchingColumnSets = true;
//                if (column.isNotClassified()) {
            if (type == null) {
}
//            resultColumns = new ArrayList<>(resultColumnsCount);
    }
//        boolean nonMatchingColumnSets = false;
        @NotNull SQLQueryRecognitionContext statistics
/**
        SQLQueryExprType type;
    private final List<SQLQuerySymbolEntry> correspondingColumnNames;
//
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    ) {
//                    resultColumns.add(leftColumns.get(i));

        return context.reset();

//                SQLQuerySymbolEntry column = correspondingColumnNames.get(i);

    public SQLQueryRowsSetCorrespondingOperationKind getKind() {
//        SQLQueryDataContext left = this.left.propagateContext(context, statistics);
//                    resultColumns.add(new SQLQueryResultColumn(i, column.getSymbol(), this, null, null, type));
//                        symbol.setDefinition(leftDef);
    @Override
//            statistics.appendError(this.getSyntaxNode(), "UNION, EXCEPT and INTERSECT require subsets column tuples to match");
        this.right.resolveRowSources(context, statistics);
//                        }
//            for (int i = 0; i < resultColumnsCount; i++) {
//        @NotNull SQLQueryDataContext context,
    public SQLQueryRowsSetCorrespondingOperationModel(
            type = leftDef.type; 
    protected SQLQueryRowsDataContext resolveRowDataImpl(
        } else {        

//                        if (symbol.getSymbolClass() == SQLQuerySymbolClass.UNKNOWN) {
//        SQLQueryDataContext right = this.right.propagateContext(context, statistics);
//    protected SQLQueryDataContext propagateContextImpl(
        @NotNull STMTreeNode syntaxNode,
//                    nonMatchingColumnSets = true;
//    @Override
        
//    }
//                    if (leftColumn.symbol.getName().equalsIgnoreCase(rightColumn.symbol.getName())) {
//        List<SQLQueryResultColumn> resultColumns;
//        } else { // require left and right to have columns subset as given with correspondingColumnNames
//        }
//                }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
 *
    ) {
//                    }
/*
//                        symbol = leftColumn.symbol;
    @Override
import org.antlr.v4.runtime.misc.Interval;
//            }
        return this.left.getRowsDataContext();
//                    if (leftDef == null || rightDef == null) {

import org.jkiss.dbeaver.model.stm.STMTreeNode;
//    @NotNull
//            }
 * Represents INTERSECT, UNION and EXCEPT operation model in the context of SQL query semantics
//        @NotNull SQLQueryRecognitionContext statistics
        return this.kind;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;

//        }
        @NotNull SQLQueryRowsSourceModel left,
//            resultColumns = new ArrayList<>(resultColumnsCount);
//            // TODO detailed messages per column
            }
    }
        
            type = SQLQueryExprType.UNKNOWN;
//
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
        @NotNull SQLQueryRowsDataContext context,
            type = rightDef.type;
        this.kind = kind;
//                    SQLQueryResultColumn leftDef = left.resolveColumn(statistics.getMonitor(), column.getName());
                type = SQLQueryExprType.UNKNOWN;
 * Copyright (C) 2010-2025 DBeaver Corp and others
//                    resultColumns.add(new SQLQueryResultColumn(i, symbol, this, null, null, type));
    @NotNull
//                if (i >= leftColumns.size()) {
        @NotNull SQLQueryRowsSourceContext context,

//                    resultColumns.add(rightColumns.get(i));
//    // TODO delayed validation for new semantics resolution

//        // TODO multiple definitions per symbol
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    }
//                            symbol.setSymbolClass(leftClass);
        @NotNull SQLQueryRowsSetCorrespondingOperationKind kind
//                    SQLQueryExprType type = this.obtainCommonType(leftColumn, rightColumn);
        return visitor.visitRowsSetCorrespondingOp(this, arg);
//                    SQLQuerySymbol symbol;
import java.util.List;
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
//                }

        this.correspondingColumnNames = correspondingColumnNames;
        return true;
//            SQLQuerySymbolOrigin columnNameOrigin = new SQLQuerySymbolOrigin.ColumnNameFromContext(left.combine(right));
//        if (correspondingColumnNames.isEmpty()) { // require left and right to have the same tuples
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//                    SQLQueryExprType type = this.obtainCommonType(leftDef, rightDef);
 *
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
        } else if (leftDef == null) {
    }
//                        symbol = leftColumn.symbol.merge(rightColumn.symbol);
            type = SQLQueryExprType.tryCombineIfMatches(leftDef.type, rightDef.type);
//            List<SQLQueryResultColumn> rightColumns = right.getColumnsList();
        this.left.resolveRowSources(context, statistics);
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
//                    }
//                    } else {
 * limitations under the License.
//                    SQLQueryResultColumn rightColumn = rightColumns.get(i);
    @NotNull
import org.jkiss.code.Nullable;
    private final SQLQueryRowsSetCorrespondingOperationKind kind;
 * DBeaver - Universal Database Manager
    ) {

        @NotNull SQLQueryRowsSourceModel right,
    }
        @NotNull SQLQueryRecognitionContext statistics
        } else if (rightDef == null) {
package org.jkiss.dbeaver.model.sql.semantics.model.select;
        }
