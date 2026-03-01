    /**
     * Applies filters to the existing user queries
        @NotNull StringBuilder query,
     * @param dataFilter filter containing conditions
     */
     * @param conditionTable alias of the table
     */
    String getWrappedFilterQuery(
     *
     */
import org.jkiss.dbeaver.model.data.DBDDataFilter;
    void appendConditionString(
        boolean subQuery
     */
    void appendOrderString(@NotNull DBDDataFilter filter,
     * @param constraint attribute constraint
        @NotNull DBPDataSource dataSource,
    @NotNull
        @NotNull DBPDataSource dataSource,
        @Nullable String conditionTable,
import org.jkiss.code.NotNull;
     * Appends order statement to query
    @Nullable
    /**
    String getConstraintCondition(@NotNull DBPDataSource dataSource,
        @Nullable String tableAlias,
     * Appends filter conditions to query
        @NotNull DBPDataSource dataSource,
     * @param filter list of query column constraints
 * You may obtain a copy of the License at
     * @param dataSource database
     * Appends filter statement to query
     * @param filter filter containing conditions
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * returns user query with filter and order
     * @param dataFilter filter containing conditions
     * @param dataSource database
/*
        @Nullable String conditionTable,
     * @param dataSource database
package org.jkiss.dbeaver.model.sql;
    }
     * @param dataSource database
     * @param subQuery is query part of another query

     *
    /**
     * @param dataSource database
     */
     * @param dataSource datasource
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
     * @param inlineCriteria does query has inlineCriteria
        @NotNull DBPDataSource dataSource,
 *

import java.util.List;
     * @param tableAlias alias of the table

    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param conditionTable alias of the table

/**
     * @param filter filter containing conditions
        appendConditionString(filter, constraints, dataSource, conditionTable, query, inlineCriteria, subQuery);
     * @param dataFilter filter conditions
 * See the License for the specific language governing permissions and
    default void appendConditionString(
     * @return string with the constraint condition
    ) throws DBException;
     * @param inlineCriteria does query has inlineCriteria
     *
        @NotNull StringBuilder query,

            .filter(x -> x.getCriteria() != null || x.getOperator() != null)

     * @param constraints list of attribute constraints
 * Contains methods used for query generation
import java.util.stream.Collectors;

        @NotNull DBDDataFilter filter,
     * @param conditionTable name of table
        @NotNull DBDDataFilter filter,
}
     * @param dataFilter filter conditions
     *

    ) throws DBException;
        @NotNull String sqlQuery,
        @NotNull DBDDataFilter filter,
     * Returns constraint condition for constraint
     * @return modified query
 */
     * @param conditionTable alias of the table
 *
    String getQueryWithAppliedFilters(
        @Nullable String tableAlias,
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
     * @param query query to append conditions to
     * Appends filter conditions to query
        @Nullable DBRProgressMonitor monitor,
        @NotNull StringBuilder query,
        @NotNull DBDDataFilter dataFilter
        boolean inlineCriteria,
     * Appends filter conditions to query
     * @param query query to append conditions to
        @NotNull DBPDataSource dataSource,
     * @param sqlQuery user query
     *
    /**
     */
     * @param inlineCriteria does query has inlineCriteria
        @Nullable DBDDataFilter dataFilter);

import org.jkiss.dbeaver.model.DBPDataSource;
        @Nullable DBDDataFilter dataFilter
     * @param query query to append conditions to
     * @param query query to append conditions to
     *
        @Nullable String conditionTable,
        boolean inlineCriteria
    ) throws DBException;
     * @param dataSource database
     * @param query query to append conditions to
     * @param query query to append conditions to
     * @param sqlQuery user query
     * @param dataSource database
 * you may not use this file except in compliance with the License.
        @Nullable String conditionTable,
        @NotNull DBPDataSource dataSource,
     * Appends order conditions to query
    ) throws DBException {
        boolean inlineCriteria);
    ) throws DBException {
 */
        @NotNull StringBuilder query,
     * @param subQuery is query part of another query
    ) throws DBException;
 * DBeaver - Universal Database Manager

        @NotNull DBDDataFilter dataFilter
        boolean subQuery
    @NotNull
     * @param inlineCriteria does query has inlineCriteria
import org.jkiss.code.Nullable;
    default void appendConditionString(
     * @param subQuery is query part of another query
        @NotNull DBDAttributeConstraint constraint,
     */
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    void appendQueryOrder(DBPDataSource dataSource,
 *
     *
     * @param monitor database progress monitor
        List<DBDAttributeConstraint> constraints = filter.getConstraints().stream()
     * @param tableAlias alias of the table
    /**
 * limitations under the License.

        appendConditionString(filter, dataSource, conditionTable, query, inlineCriteria, false);
        @Nullable String conditionTable,
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param dataSource datasource
 * Unless required by applicable law or agreed to in writing, software
     * @param filter filter containing conditions
        boolean inlineCriteria,
     */
        @NotNull StringBuilder query,
        @NotNull StringBuilder query);
    /**

     * @param conditionTable alias of the table
     *
     * @return modified query
        @NotNull String sqlQuery,
        @NotNull List<DBDAttributeConstraint> constraints,
            .collect(Collectors.toList());
    /**
public interface SQLQueryGenerator {
 *     http://www.apache.org/licenses/LICENSE-2.0
    void appendQueryConditions(
        boolean subQuery,
import org.jkiss.dbeaver.DBException;
    }
        @NotNull DBPDataSource dataSource,
