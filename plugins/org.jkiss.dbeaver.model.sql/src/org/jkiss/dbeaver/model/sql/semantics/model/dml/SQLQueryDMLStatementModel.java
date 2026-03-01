        if (this.tableModel != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public SQLQueryRowsTableDataModel getTableModel() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;

 *
    public final void resolveObjectAndRowsReferences(
        this.tableModel = tableModel;
 * Unless required by applicable law or agreed to in writing, software

 */
        @Nullable SQLQueryRowsTableDataModel tableModel
    @Nullable
        @NotNull STMTreeNode syntaxNode,
 * limitations under the License.
package org.jkiss.dbeaver.model.sql.semantics.model.dml;
 *



}
        @NotNull SQLQueryRowsSourceContext context,
    );

 * DBeaver - Universal Database Manager
    }
/**
    @Override
import org.jkiss.dbeaver.model.stm.STMTreeNode;
        @NotNull SQLQueryRowsSourceContext context,
    @Nullable
        return this.tableModel;
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
            this.resolveRowsReferencesImpl(rowsContext, statistics);
    public SQLQueryDMLStatementModel(
        }
/*
    ) {
    }
    ) {
 * You may obtain a copy of the License at
 *
    }
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
        @NotNull SQLQueryRecognitionContext statistics
 * See the License for the specific language governing permissions and
public abstract class SQLQueryDMLStatementModel extends SQLQueryModelContent {
import org.jkiss.code.NotNull;
    private final SQLQueryRowsTableDataModel tableModel;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        super(syntaxNode.getRealInterval(), syntaxNode, tableModel);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
        @NotNull SQLQueryRecognitionContext statistics
 */
    protected abstract void resolveRowsReferencesImpl(
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Describes a statements operating with the table (INSERT, DELETE, ...)
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            SQLQueryRowsSourceContext rowsContext = this.tableModel.resolveRowSources(context, statistics);
