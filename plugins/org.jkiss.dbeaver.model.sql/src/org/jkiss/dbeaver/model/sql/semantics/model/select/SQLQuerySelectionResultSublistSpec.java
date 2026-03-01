 *
    protected abstract void collectColumns(
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *
    protected SQLQuerySelectionResultSublistSpec(@NotNull STMTreeNode syntaxNode) {

    }
    );
import org.jkiss.dbeaver.model.stm.STMTreeNode;
/*
import java.util.LinkedList;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.jkiss.code.Nullable;
 * Describes a fragment of the selection result
        @NotNull LinkedList<SQLQueryResultColumn> resultColumns


    @Nullable
 *
 * Unless required by applicable law or agreed to in writing, software
        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,
        @NotNull List<SQLQueryResultColumn> foreignColumns,
import org.jkiss.code.NotNull;
public abstract class SQLQuerySelectionResultSublistSpec extends SQLQueryNodeModel {

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
                new SQLQueryResultColumn(resultColumns.size(), c.symbol, rowsSourceModel, c.realSource, c.realAttr, c.type)
import java.util.List;
        @NotNull SQLQueryRowsProjectionModel rowsSourceModel,
    protected void collectForeignColumns(

        super(syntaxNode.getRealInterval(), syntaxNode);

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
            resultColumns.addLast(
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
        for (SQLQueryResultColumn c : foreignColumns) {
        @NotNull SQLQueryRecognitionContext statistics,
 */
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
            );
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
 */
 * DBeaver - Universal Database Manager
        @NotNull LinkedList<SQLQueryResultColumn> resultColumns
}    public abstract SQLQuerySymbolClass getAssociatedSymbolClass();
/**
package org.jkiss.dbeaver.model.sql.semantics.model.select;
        @NotNull SQLQueryRowsDataContext knownValues,
 * you may not use this file except in compliance with the License.

