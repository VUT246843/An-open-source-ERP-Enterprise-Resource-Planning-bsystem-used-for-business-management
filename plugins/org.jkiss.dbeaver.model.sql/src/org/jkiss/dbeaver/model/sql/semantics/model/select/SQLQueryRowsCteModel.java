        @NotNull SQLQueryRowsSourceContext context,

import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsSourceContext;

        @NotNull STMTreeNode syntaxNode,
    @Override

        SQLQueryRowsSourceContext cteContext = context.appendCteSources(this.subqueries.stream().map(

import org.jkiss.code.Nullable;
     * Get all subqueries of the CTE and CTE query itself
 * Unless required by applicable law or agreed to in writing, software
        super(syntaxNode, resultQuery);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Describes Common Table Expression (CTE)
    protected SQLQueryRowsDataContext resolveRowDataImpl(
    protected <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
        return context.reset();
    ) {
    private final List<SQLQueryRowsCteSubqueryModel> subqueries;
    }
        @NotNull SQLQueryRecognitionContext statistics

        return queries;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionContext;
            q -> Pair.of(q.subqueryName, (SQLQueryRowsSourceModel) q)
/*
    ) {
        this.resultQuery.resolveRowSources(cteContext, statistics);

        queries.addAll(this.subqueries);
 */
    }
        this.resultQuery = resultQuery;
        this.subqueries.forEach(q -> q.resolveRowSources(cteContext, statistics));
    ) {
    }
 * DBeaver - Universal Database Manager


    public List<SQLQueryRowsSourceModel> getAllQueries() {
/**
    private final SQLQueryRowsSourceModel resultQuery;
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryNodeModelVisitor;
    @NotNull
import java.util.ArrayList;
    /**
    protected SQLQueryRowsSourceContext resolveRowSourcesImpl(
        @NotNull SQLQueryRowsDataContext context,

        @NotNull List<SQLQueryRowsCteSubqueryModel> subqueries,
        this.subqueries.forEach(super::registerSubnode);
public class SQLQueryRowsCteModel extends SQLQueryRowsSourceModel {
 * See the License for the specific language governing permissions and
        return visitor.visitRowsCte(this, arg);
        ).toList());
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    public SQLQueryRowsCteModel(
    }
 * limitations under the License.
 */
 *

        @NotNull SQLQueryRecognitionContext statistics
    @NotNull
        @NotNull SQLQueryRowsSourceModel resultQuery
 *
        return this.resultQuery.getRowsDataContext();
    @Nullable
    @Override
    }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryRowsDataContext;
 * you may not use this file except in compliance with the License.
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        queries.add(this.resultQuery);
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
    @Override
        this.subqueries = List.copyOf(subqueries);

import org.jkiss.code.NotNull;
    @NotNull
        List<SQLQueryRowsSourceModel> queries = new ArrayList<>(this.subqueries.size() + 1);
package org.jkiss.dbeaver.model.sql.semantics.model.select;
import org.jkiss.utils.Pair;
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
