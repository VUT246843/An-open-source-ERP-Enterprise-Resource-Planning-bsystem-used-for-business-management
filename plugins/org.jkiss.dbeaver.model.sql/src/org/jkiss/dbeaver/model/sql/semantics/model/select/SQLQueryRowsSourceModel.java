    /**
    /**
package org.jkiss.dbeaver.model.sql.semantics.model.select;

    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull SQLQueryRecognitionContext statistics
        @NotNull SQLQueryRecognitionContext statistics
            SQLQueryRowsSourceModel.class,
    public SQLQueryRowsSourceModel(@NotNull Interval region, @NotNull STMTreeNode syntaxNode, @Nullable SQLQueryNodeModel ... subnodes) {

    protected abstract SQLQueryRowsSourceContext resolveRowSourcesImpl(
    }
 *

    }
     */
        @NotNull SQLQueryRecognitionContext statistics
 */
    }
    public SQLQueryRowsSourceModel(@NotNull STMTreeNode syntaxNode, @Nullable SQLQueryNodeModel... subnodes) {
    }
        }


import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
     */
 * limitations under the License.
            () -> statistics.getMonitor().isCanceled()
    protected abstract SQLQueryRowsDataContext resolveRowDataImpl(
     */
     * Propagate information about available tables down the model and about actually referenced tables back up

        super(syntaxNode.getRealInterval(), syntaxNode, subnodes);
     * Propagate information about available tables down the model and about actually referenced tables back up,
        if (this.rowsDataContext == null) {
import org.antlr.v4.runtime.misc.Interval;
     */
     * Returns rows data context, if it has been resolved. Otherwise, throws IllegalStateException.

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
    }
    public boolean isResolved() {
        if (this.rowsSourceContext == null) {
        this.resolveRowSources(context, statistics);
    ) {

 * See the License for the specific language governing permissions and
        @NotNull SQLQueryRecognitionContext statistics
 * Licensed under the Apache License, Version 2.0 (the "License");
            return this.rowsSourceContext;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModel;
        @NotNull SQLQueryRowsSourceContext context,
    @NotNull
 * you may not use this file except in compliance with the License.
/*
     * Propagate information about values and row tuples across the query model
 * Unless required by applicable law or agreed to in writing, software
    /**
            throw new IllegalStateException("Rows sources were not resolved yet");
    @Nullable

    }
        @NotNull SQLQueryRowsDataContext context,
        super(region, syntaxNode, subnodes);

    }
        }
        } else {
import org.jkiss.code.NotNull;
    protected SQLQueryRowsSourceContext getRowsSources() {

    protected final SQLQueryRowsDataContext resolveRowData(
    @NotNull
        if (this.rowsDataContext == null) {
    );
    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public SQLQueryRowsDataContext getRowsDataContext() {
 * You may obtain a copy of the License at
        }

        return this.rowsDataContext;
            return this.rowsDataContext;
    @NotNull
    public final void resolveValueRelations(@NotNull SQLQueryRowsDataContext context, @NotNull SQLQueryRecognitionContext statistics) {
 *
            context,


 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
/**
            (n, c) -> n.resolveRowData(c, statistics),
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
    @Override
}
public abstract class SQLQueryRowsSourceModel extends SQLQueryModelContent {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
            throw new IllegalStateException("Rows data was not resolved yet");
        return this.rowsDataContext != null && this.rowsSourceContext != null;
            this.rowsDataContext = this.resolveRowDataImpl(context, statistics);
    private SQLQueryRowsSourceContext rowsSourceContext = null;
 *
 */
    private SQLQueryRowsDataContext rowsDataContext = null;
    }
    public final void resolveObjectAndRowsReferences(

    );
    public final SQLQueryRowsSourceContext resolveRowSources(
            this,
        @NotNull SQLQueryRowsDataContext context,
    /**
        return this.rowsSourceContext = this.resolveRowSourcesImpl(context, statistics);
        @NotNull SQLQueryRowsSourceContext context,
        @NotNull SQLQueryRowsSourceContext context,
        traverseSubtreeSmart(
    @Override
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
    ) {
        @NotNull SQLQueryRecognitionContext statistics
 * Describes the semantics of a query part responsible for a data rows source representation (table, join, table-value, etc.)
    }
        );
 * distributed under the License is distributed on an "AS IS" BASIS,
     * caching it in this rows source
