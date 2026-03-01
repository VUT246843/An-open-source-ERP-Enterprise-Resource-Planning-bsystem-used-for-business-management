import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        this.sublists = new ArrayList<>(capacity);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryTupleRefEntry;
 * You may obtain a copy of the License at
    /**
     */
    }
    public void addCompleteTupleSpec(@NotNull STMTreeNode syntaxNode, @NotNull SQLQueryTupleRefEntry tupleRefEntry) {


    }
        super(syntaxNode.getRealInterval(), syntaxNode);
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T node) {
    }
    ) {
            sublist.collectColumns(knownValues, rowsSourceModel, statistics, resultColumns);
import java.util.ArrayList;
    public List<SQLQuerySelectionResultSublistSpec> getSublists() {

 * See the License for the specific language governing permissions and
    }
 */
        @Nullable SQLQueryValueExpression valueExpression,
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.stm.STMTreeNode;

    public SQLQuerySelectionResultModel(@NotNull STMTreeNode syntaxNode, int capacity) {
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
    @NotNull
    }
    public void addTupleSpec(@NotNull STMTreeNode syntaxNode, @NotNull SQLQueryValueTupleReferenceExpression tupleRef) {

        this.registerSublist(new SQLQuerySelectionResultColumnSpec(syntaxNode, valueExpression));

     */

    private final List<SQLQuerySelectionResultSublistSpec> sublists;
        this.registerSublist(new SQLQuerySelectionResultColumnSpec(syntaxNode, valueExpression, alias));
     */
     */

     * Add all columns of some table to the selection result model
        return visitor.visitSelectionResult(this, node);
    /**
    public void addColumnSpec(
public class SQLQuerySelectionResultModel extends SQLQueryNodeModel {
     * Add single column to the selection result model
    @NotNull
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    }
        LinkedList<SQLQueryResultColumn> resultColumns = new LinkedList<>();
        @NotNull SQLQueryRecognitionContext statistics
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueExpression;
        return List.copyOf(resultColumns);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
    /**
        @NotNull STMTreeNode syntaxNode,
 *
     */
        super.registerSubnode(sublist);
    ) {
        @Nullable SQLQuerySymbolEntry alias

    }
    /**
     * Prepare a list of result columns
 */

        for (SQLQuerySelectionResultSublistSpec sublist : this.sublists) {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
        this.registerSublist(new SQLQuerySelectionResultCompleteTupleSpec(syntaxNode, tupleRefEntry));
     * Add single column with alias to the selection result model

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
        @NotNull SQLQueryRowsDataContext knownValues,
import org.jkiss.code.NotNull;
}
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.sql.semantics.model.select;

        this.registerSublist(new SQLQuerySelectionResultTupleSpec(syntaxNode, tupleRef));
    }
 * Unless required by applicable law or agreed to in writing, software
        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,
    public void addColumnSpec(@NotNull STMTreeNode syntaxNode, @Nullable SQLQueryValueExpression valueExpression) {
 * you may not use this file except in compliance with the License.
     * Add several columns of some table to the selection result model
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.SQLQueryValueTupleReferenceExpression;
 *
 *
        return this.sublists;
        }
    public List<SQLQueryResultColumn> expandColumns(
    @Override
import org.jkiss.code.Nullable;
        this.sublists.add(sublist);
    }
 * limitations under the License.
 * Describes the structure of the result of select clause
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
/*
    @NotNull
    private void registerSublist(SQLQuerySelectionResultSublistSpec sublist) {
import java.util.LinkedList;
import java.util.List;
