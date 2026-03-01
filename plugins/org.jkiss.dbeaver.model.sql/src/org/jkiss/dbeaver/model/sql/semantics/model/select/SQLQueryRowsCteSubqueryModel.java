
        } else {
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryLexicalScope;
            }
/**
    ) {
                }
        @NotNull SQLQueryRecognitionContext statistics
        }
 */
        }
            if (this.subqueryName.isNotClassified()) {
    }
    public final SQLQueryRowsSourceModel source;
 * See the License for the specific language governing permissions and
            this.setTailOrigin(this.source.getTailOrigin());
        @NotNull SQLQueryRowsSourceContext context,

            if (this.sourceTailScope != null && this.source.getTailOrigin() != null) {
} * you may not use this file except in compliance with the License.
    @NotNull
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;
        this.source = source;
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T node) {
    protected SQLQueryRowsDataContext resolveRowDataImpl(
import org.jkiss.code.NotNull;
        if (this.source != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Nullable SQLQuerySymbolEntry subqueryName,
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
    private final SQLQueryLexicalScope sourceTailScope;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
            return context.getRowsSources().makeEmptyTuple();

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.sql.semantics.model.select;
 *
/*
                this.subqueryName.getSymbol().setDefinition(this.subqueryName);
    public SQLQueryRowsCteSubqueryModel(
            }
    @Nullable
        @Nullable SQLQueryLexicalScope sourceTailScope
    @Nullable
            }

 *
    @Override
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.source.resolveRowSources(context, statistics);
    ) {
        
                return SQLQueryRowsCorrelatedSourceModel.prepareColumnsCorrelation(this.source.getRowsDataContext(), this.columNames, this);
        if (this.source != null) {
            if (!this.columNames.isEmpty()) {
            } else {
import java.util.List;
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
        @NotNull List<SQLQuerySymbolEntry> columNames,
        return context.reset();
    }

import org.jkiss.dbeaver.model.stm.STMTreeNode;
        }
    @Override
        return visitor.visitRowsCteSubquery(this, node);
    }
                if (this.subqueryName.isNotClassified()) {
import org.jkiss.code.Nullable;
    @Override
        if (sourceTailScope != null) {
 * Unless required by applicable law or agreed to in writing, software

        if (this.subqueryName != null) {
 */
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    public final List<SQLQuerySymbolEntry> columNames;
 * limitations under the License.
        @NotNull STMTreeNode syntaxNode,
 * DBeaver - Universal Database Manager
        @NotNull SQLQueryRowsDataContext context,
    @Nullable
        super(syntaxNode, source);
        this.sourceTailScope = sourceTailScope;

        this.columNames = columNames;
        }
    ) {
                this.sourceTailScope.setSymbolsOrigin(this.source.getTailOrigin());
    @Nullable
            this.registerLexicalScope(sourceTailScope);
                    this.subqueryName.getSymbol().setSymbolClass(SQLQuerySymbolClass.TABLE_ALIAS);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull SQLQueryRecognitionContext statistics
    public final SQLQuerySymbolEntry subqueryName;
public class SQLQueryRowsCteSubqueryModel extends SQLQueryRowsSourceModel {
        @Nullable SQLQueryRowsSourceModel source,
        this.subqueryName = subqueryName;
                return this.source.getRowsDataContext();
 * Describes subquery of a common table expression
