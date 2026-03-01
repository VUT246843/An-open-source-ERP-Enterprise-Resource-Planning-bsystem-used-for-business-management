    @Override
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;

    private final SQLQueryValueTupleReferenceExpression tupleReference;
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.tupleReference.getTableName());
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * you may not use this file except in compliance with the License.
        this.registerSubnode(tupleReference);
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryComplexName;
}
public class SQLQuerySelectionResultTupleSpec extends SQLQuerySelectionResultSublistSpec {
        super(syntaxNode);
        return this.tupleReference.getTableName();

import org.jkiss.dbeaver.model.stm.STMTreeNode;


import org.jkiss.code.Nullable;
    protected void collectColumns(
import org.jkiss.code.NotNull;
 *

import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
    @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) {
    }
    public SQLQueryComplexName getTableName() {
        }
    public SQLQueryRowsSourceModel getTupleSource() {
        @NotNull SQLQueryValueTupleReferenceExpression tupleReference
package org.jkiss.dbeaver.model.sql.semantics.model.select;

    public SQLQuerySymbolClass getAssociatedSymbolClass() {
        @NotNull LinkedList<SQLQueryResultColumn> resultColumns
        @NotNull SQLQueryRowsDataContext knownValues,
    ) {
 */
        if (tupleSource != null) {
        this.tupleReference.resolveRowSources(knownValues.getRowsSources(), statistics);
        @NotNull STMTreeNode syntaxNode,
        @NotNull SQLQueryRecognitionContext statistics,
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.collectForeignColumns(tupleSource.getRowsDataContext().getColumnsList(), rowsSourceModel, resultColumns);
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    public SQLQuerySelectionResultTupleSpec(
 * limitations under the License.
    @NotNull
    @Override
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        return this.tupleReference.getTupleSource();
    }
import java.util.LinkedList;
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueTupleReferenceExpression;
    }

        SQLQueryRowsSourceModel tupleSource = this.tupleReference.getTupleSource();
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySemanticUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return visitor.visitSelectTupleSpec(this, node);

 */
    @Nullable
/**
 *
/*
        this.tupleReference.resolveValueRelations(knownValues, statistics);
        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,

    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T node) {
    }
 * Describes several columns from the table of a selection result
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    }

        this.tupleReference = tupleReference;
