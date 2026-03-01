                    : c.symbol.getName().equals(columnName)


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;
        this.pseudoColumns = pseudoColumns;
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsNaturalJoinModel;
        }
            .filter(

    public SQLQueryRowsDataContext(



 * Licensed under the Apache License, Version 2.0 (the "License");
            STMUtils.combineLists(this.getColumnsList(), other.getColumnsList()),
            STMUtils.combineLists(this.getPseudoColumnsList(), other.getPseudoColumnsList())
        return this.pseudoColumns;
            STMUtils.combineLists(this.getColumnsList(), other.getColumnsList()),
    }
 * See the License for the specific language governing permissions and
    @Nullable
        this.realSources = columns.stream().map(c -> c.realSource).filter(Objects::nonNull).collect(Collectors.toSet());


        @Nullable JoinInfo joinInfo
            } catch (DBException e) {
        this(rowsSources, columns, pseudoColumns, null);
        @NotNull SQLQueryRowsNaturalJoinModel joinSource,
import java.util.Set;
    }
    }
 * Unless required by applicable law or agreed to in writing, software
    ) {
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private final SQLQueryRowsSourceContext rowsSources;
            .findFirst()
     * Return information about the pseudo column used in the query by the specified name
            try {
            if (result != null) {
                if (attr != null) {
                        .filter(c -> c.realAttr == attr)
 * limitations under the License.
    public SQLQueryRowsDataContext combineForJoin(
        return result;
        this.joinInfo = joinInfo;
    public JoinInfo getJoinInfo() {
     */
        }
                log.debug("Failed to resolve column", e);
                }
/**
                        .orElse(null);
    }
                    result = this.columns.stream()
import org.jkiss.code.NotNull;
                STMUtils.combineLists(this.getPseudoColumnsList(), other.getPseudoColumnsList())
        );
                        .findFirst()
        @NotNull List<SQLQueryResultPseudoColumn> pseudoColumns,
                return result;
     */
            new JoinInfo(this, other)
 * Provides information about query sources (tables, subqueries, etc.) and columns used in the query
    private final Set<DBSEntity> realSources;

            .orElse(null);
     */
                    ? c.symbol.getName().equalsIgnoreCase(columnName) // ignore case for column aliases
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.stm.STMUtils;
    public SQLQueryResultColumn resolveColumn(@NotNull DBRProgressMonitor monitor, @NotNull String columnName) {
 *
        return this.columns;
        SQLQueryRowsSourceContext combinedSources = this.rowsSources.combine(other.rowsSources);
    @NotNull
    }
/*
    @NotNull
        return combinedSources.makeTuple(
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
import java.util.stream.Collectors;
            .findFirst()
        // TODO consider reporting ambiguity
    @Nullable
    /**
import java.util.Objects;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public SQLQueryRowsSourceContext getRowsSources() {
        this.rowsSources = rowsSources;
        return this.rowsSources.getConnectionInfo();
        );
            STMUtils.combineLists(
    ) {
            ),
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(SQLQueryRowsDataContext.class);
    }
            return result;
                c -> c.symbol.getSymbolClass() == SQLQuerySymbolClass.COLUMN_DERIVED
    public record JoinInfo(SQLQueryRowsDataContext left, SQLQueryRowsDataContext right) {
    }
    @NotNull
        SQLQueryResultColumn result = this.columns.stream()
        SQLQueryRowsSourceContext combinedSources = this.rowsSources.combine(other.rowsSources);
        return this.joinInfo;

    @NotNull
     * Combine information about query sources (tables, subqueries, etc.) and columns used in the query
            // TODO consider ambiguity and/or propagation policy of pseudo-columns here
    @NotNull
        for (DBSEntity source : this.realSources) {
        @NotNull List<SQLQueryResultColumn> columns,
            }
    }
                DBSEntityAttribute attr = source.getAttribute(monitor, unquoted);
    }
        String unquoted = this.getConnection().dialect.getUnquotedIdentifier(columnName);
        @NotNull SQLQueryRowsDataContext other
            }
                this.getConnection().obtainRowsetPseudoColumns(joinSource),
    public SQLQueryResultPseudoColumn resolvePseudoColumn(@NotNull String name) {

    @NotNull
        @NotNull SQLQueryRowsSourceContext rowsSources,

        @NotNull SQLQueryRowsSourceContext rowsSources,
public class SQLQueryRowsDataContext {
        @NotNull List<SQLQueryResultColumn> columns,
    private final JoinInfo  joinInfo;
            .orElse(null);
    @NotNull
import org.jkiss.dbeaver.DBException;
 *
import org.jkiss.dbeaver.Log;
    @NotNull
    public List<SQLQueryResultColumn> getColumnsList() {
        rowsSources.registerConsumingContext(this);
 */

        @NotNull List<SQLQueryResultPseudoColumn> pseudoColumns
        return this.rowsSources;

    public SQLQueryRowsDataContext(
    /**
import org.jkiss.code.Nullable;

    public SQLQueryRowsDataContext combine(@NotNull SQLQueryRowsDataContext other) {
    public SQLQueryConnectionContext getConnection() {


    private final List<SQLQueryResultColumn> columns;
     * Returns information about resolved column searching for specified column name in metadata
    ) {

    }
        this.columns = columns;
    // TODO introduce class ResultColumnInfo extends SQLQueryResultColumn having reference for KnownRowsSourceInfo

    private final List<SQLQueryResultPseudoColumn> pseudoColumns;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
import java.util.List;
 * you may not use this file except in compliance with the License.

            // TODO consider ambiguity and/or propagation policy of pseudo-columns here
    @Nullable
            .filter(c -> c.symbol.getName().equals(name))
    @NotNull
    }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 */
 *
    public List<SQLQueryResultPseudoColumn> getPseudoColumnsList() {
    /**
        if (result != null) {
    }
            )


        SQLQueryResultPseudoColumn result = this.pseudoColumns.stream()

}

package org.jkiss.dbeaver.model.sql.semantics.context;
        return combinedSources.makeJoinTuple(
