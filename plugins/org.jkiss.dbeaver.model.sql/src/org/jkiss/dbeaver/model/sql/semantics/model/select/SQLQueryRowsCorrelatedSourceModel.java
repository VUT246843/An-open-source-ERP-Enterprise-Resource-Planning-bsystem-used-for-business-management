            this.alias.getSymbol().setDefinition(this.alias);
 * you may not use this file except in compliance with the License.
public class SQLQueryRowsCorrelatedSourceModel extends SQLQueryRowsSourceModel {
    }
                    SQLQueryResultColumn oldColumn = columns.get(i);
    }
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull SQLQueryRowsSourceContext context,
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultColumn;
    ) {
    @NotNull
        if (this.alias.isNotClassified()) {
    public List<SQLQuerySymbolEntry> getCorrelationColumNames() {
        if (correlationColumNames.isEmpty()) {
                columns.set(i, oldColumn.withNewSource(columnsSource));
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

        @NotNull SQLQueryRecognitionContext statistics

        return this.source.resolveRowSources(context, statistics).replaceWithAlias(this.source, this, this.alias);
        @NotNull SQLQueryRecognitionContext statistics
    @Override
        this.alias = alias;
        @NotNull STMTreeNode syntaxNode,

        @NotNull List<SQLQuerySymbolEntry> correlationColumNames,

            if (this.alias.isNotClassified()) {
    @NotNull
import org.jkiss.dbeaver.model.sql.semantics.*;

    @NotNull
    public SQLQuerySymbolEntry getAlias() {
 * Describes a subquery source that have an alias and optionally columns list

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final SQLQueryRowsSourceModel source;
        return SQLQuerySemanticUtils.getIdentifierSymbolClass(this.alias);

        @NotNull SQLQueryRowsSourceModel columnsSource
        return prepareColumnsCorrelation(this.source.getRowsDataContext(), this.correlationColumNames, this);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @NotNull
import java.util.ArrayList;
                }
    @Override
    ) {
 *
    ) {
        }
                this.alias.getSymbol().setSymbolClass(SQLQuerySymbolClass.TABLE_ALIAS);
    public static SQLQueryRowsDataContext prepareColumnsCorrelation(
    @NotNull
            }
        super(syntaxNode, source);

    @NotNull
                SQLQueryResultColumn oldColumn = columns.get(i);
                SQLQuerySymbolEntry correlatedNameDef = correlationColumNames.get(i);
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T node) {
    private final List<SQLQuerySymbolEntry> correlationColumNames;
        return this.source;
/**
        @NotNull SQLQueryRowsSourceModel source,
    }
import org.jkiss.dbeaver.model.stm.STMTreeNode;
import org.jkiss.code.Nullable;
        @NotNull SQLQueryRowsDataContext context,
                    correlatedNameDef.setDefinition(oldColumn.symbol.getDefinition());
     */
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
package org.jkiss.dbeaver.model.sql.semantics.model.select;
                    columns.set(i, new SQLQueryResultColumn(i, correlatedName, columnsSource, null, null, oldColumn.type));
    @NotNull
     * Associate correlated source column names symbols with its definition
        this.source = source;
    protected SQLQueryRowsDataContext resolveRowDataImpl(
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
                    SQLQuerySymbol correlatedName = correlatedNameDef.getSymbol();
    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
                    correlatedName.setDefinition(correlatedNameDef);
                if (correlatedNameDef.isNotClassified()) {
        } else {

 *
                    correlatedName.setSymbolClass(SQLQuerySymbolClass.COLUMN_DERIVED);
/*
}
 * DBeaver - Universal Database Manager
    public SQLQueryRowsSourceModel getSource() {

    public SQLQueryRowsCorrelatedSourceModel(
        this.correlationColumNames = correlationColumNames;
        return this.alias;
 *

    }
 * limitations under the License.
        @NotNull SQLQuerySymbolEntry alias,
        @NotNull SQLQueryRowsDataContext context,

    private final SQLQuerySymbolEntry alias;
 * See the License for the specific language governing permissions and
 */
    }
        }
        @NotNull List<SQLQuerySymbolEntry> correlationColumNames
        return visitor.visitRowsCorrelatedSource(this, node);
        return this.correlationColumNames;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Override
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
import org.jkiss.code.NotNull;
    @Override
            for (int i = 0; i < columns.size(); i++) {
            }
        List<SQLQueryResultColumn> columns = new ArrayList<>(context.getColumnsList());
    /**
        return columnsSource.getRowsSources().makeTuple(columnsSource, columns, context.getPseudoColumnsList());
    }
 */
import java.util.List;
    ) {
    @Nullable
            for (int i = 0; i < columns.size() && i < correlationColumNames.size(); i++) {
