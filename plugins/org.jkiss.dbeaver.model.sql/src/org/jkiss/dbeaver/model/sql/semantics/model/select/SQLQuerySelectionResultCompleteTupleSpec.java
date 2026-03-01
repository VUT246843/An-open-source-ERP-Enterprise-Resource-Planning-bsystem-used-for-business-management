import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @NotNull LinkedList<SQLQueryResultColumn> resultColumns
public class SQLQuerySelectionResultCompleteTupleSpec extends SQLQuerySelectionResultSublistSpec {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
import java.util.LinkedList;
        );
        this.tupleRefEntry.setOrigin(
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        @NotNull SQLQueryRowsDataContext knownValues,
 * Unless required by applicable law or agreed to in writing, software
    @Override
        @NotNull SQLQueryRecognitionContext statistics,
 */
        return visitor.visitSelectCompleteTupleSpec(this, arg);
 * You may obtain a copy of the License at
/**
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
import org.jkiss.code.Nullable;
    @Override
} * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolOrigin;
    ) {
 *
        return null;
 * you may not use this file except in compliance with the License.

    private final SQLQueryTupleRefEntry tupleRefEntry;
        @NotNull SQLQueryTupleRefEntry tupleRefEntry
 * See the License for the specific language governing permissions and
 *
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {

    }
    public SQLQuerySelectionResultCompleteTupleSpec(
    }
    @Override
    ) {

 */
 * Describes all columns of the table of a selection result
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
        super(syntaxNode);
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
        this.tupleRefEntry = tupleRefEntry;
    }


 *
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;

        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryTupleRefEntry;
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @NotNull
package org.jkiss.dbeaver.model.sql.semantics.model.select;
            new SQLQuerySymbolOrigin.ExpandableRowsTupleRef(this.tupleRefEntry.getSyntaxNode(), knownValues, null)
        this.collectForeignColumns(knownValues.getColumnsList(), rowsSourceModel, resultColumns);
    protected void collectColumns(
        @NotNull STMTreeNode syntaxNode,
    @Nullable
