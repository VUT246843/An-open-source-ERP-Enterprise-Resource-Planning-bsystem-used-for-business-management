    }
    private final SQLQueryValueExpression valueExpression;
        resultColumns.add(underlyingColumn == null
                columnName.setSymbolClass(SQLQuerySymbolClass.COLUMN_DERIVED);
        @NotNull SQLQueryRecognitionContext statistics,
    @Nullable
                underlyingColumn = null;
        SQLQueryResultColumn underlyingColumn;
            this.valueExpression.resolveRowSources(knownValues.getRowsSources(), statistics);
        this(syntaxNode, valueExpression, null);
    }
 * Unless required by applicable law or agreed to in writing, software
    }

            ? new SQLQueryResultColumn(resultColumns.size(), columnName, rowsSourceModel, null, null, type)

        }
    public SQLQuerySelectionResultColumnSpec(
            if (columnName == null) {
                columnName.setDefinition(this.alias);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;

        this.alias = alias;
        } else {
 * See the License for the specific language governing permissions and
public class SQLQuerySelectionResultColumnSpec extends SQLQuerySelectionResultSublistSpec {
    ) {
    @Nullable
        }
    public SQLQueryValueExpression getValueExpression() {
            }
    private SQLQuerySymbol columnName;
    @Nullable
    @Nullable

    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T node) {
                underlyingColumn = this.valueExpression.getColumnIfTrivialExpression();


/**

        @NotNull SQLQueryRowsDataContext knownValues,
        this.valueExpression = valueExpression;
            if (this.alias.isNotClassified()) {
        this.columnName = columnName;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
        @NotNull STMTreeNode syntaxNode,


    }
            underlyingColumn = null;
package org.jkiss.dbeaver.model.sql.semantics.model.select;
import org.jkiss.dbeaver.model.sql.semantics.*;
        @Nullable SQLQuerySymbolEntry alias
    public SQLQuerySelectionResultColumnSpec(

 *

import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        return this.valueExpression;
}

    ) {

        }
            } else {
 */
import org.jkiss.code.Nullable;
 *
 * DBeaver - Universal Database Manager
 * Describes one column of a selection result
    protected void collectColumns(
                columnName = this.valueExpression.getColumnNameIfTrivialExpression();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;

        @NotNull LinkedList<SQLQueryResultColumn> resultColumns
 *

                return;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryExprType;
    ) {
    }
    @Nullable
    @Nullable
        @Nullable SQLQueryValueExpression valueExpression,
    @Override
import org.jkiss.dbeaver.model.stm.STMTreeNode;
            : new SQLQueryResultColumn(resultColumns.size(), columnName, rowsSourceModel, underlyingColumn.realSource, underlyingColumn.realAttr, type)
        if (this.alias != null) {
                columnName = this.alias.getSymbol();

 */
            this.registerSubnode(valueExpression);
        );
        return this.alias;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
/*
    public SQLQuerySymbolEntry getAlias() {
        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,
 * you may not use this file except in compliance with the License.
        SQLQueryExprType type = valueExpression == null ? SQLQueryExprType.UNKNOWN : valueExpression.getValueType();
    protected void collectColumnImpl(
    ) {
        this.collectColumnImpl(rowsSourceModel, resultColumns);
    private final SQLQuerySymbolEntry alias;
    }
import org.jkiss.code.NotNull;
        @NotNull LinkedList<SQLQueryResultColumn> resultColumns
            }
        SQLQuerySymbol columnName;
        @NotNull STMTreeNode syntaxNode,
        if (valueExpression != null) {
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.columnName);
    }
        if (this.valueExpression != null) {
            if (this.valueExpression != null) {
        super(syntaxNode);
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,
            } else {
        @Nullable SQLQueryValueExpression valueExpression
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
            }
                columnName = new SQLQuerySymbol("?");
import java.util.LinkedList;
    @Override
    @Override
            this.valueExpression.resolveValueRelations(knownValues, statistics);
 * limitations under the License.
        return visitor.visitSelectColumnSpec(this, node);
                columnName = null;
