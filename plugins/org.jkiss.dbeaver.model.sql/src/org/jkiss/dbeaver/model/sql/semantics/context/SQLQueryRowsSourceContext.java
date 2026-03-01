        @NotNull List<SQLQueryResultPseudoColumn> pseudoColumns,
    ) {
    }
                newSourceEntries.add(Map.entry(

import org.jkiss.dbeaver.model.sql.SQLUtils;
            this.rowsSources.remove(oldEntries),
        this.hasUnresolvedSource = hasUnresolvedSource;
        return new SQLQueryRowsDataContext(
     * Create row tuple model acting as a context for column references resolution
                SQLQueryMemberAccessEntry endingPeriod;
     */
        List<Map.Entry<SQLQueryComplexName, SourceResolutionResult>> oldEntries = this.rowsSources.entrySet().stream()

    }
    @NotNull
/*
            @NotNull

                newSourceEntries.add(Map.entry(nameFragment, srr));
        this.sourcesByLoweredAlias = sourcesByLoweredAlias;
    public SQLDialect getDialect() {
    /**

        if (name.stringParts.size() == 1 && name.invalidPartsCount == 0) {
        return this.sourcesByLoweredAlias.get(aliasName.toLowerCase());
        SQLQueryComplexName namePart = name;
    /**
    @NotNull
                return this.aliasesInUse;
    }
            @NotNull
        );
        Set<SQLQueryRowsSourceContext> queued = new HashSet<>();

            if (result != null) {
        List<SQLQueryResultPseudoColumn> allPseudoColumns = source == null
     *
    @NotNull

        };
    public final SQLQueryRowsSourceContext appendCteSources(@NotNull List<Pair<SQLQuerySymbolEntry, SQLQueryRowsSourceModel>> sources) {
     * Associate alias with the resolved query source
    private final UnmodifiableMap<SQLQueryComplexName, SourceResolutionResult> rowsSources;

    public SQLQueryRowsSourceContext setRelatedContextProvider(@NotNull Supplier<SQLQueryRowsDataContext>  relatedContextProvider) {
        return this.dynamicTableSources.get(name.getName().toLowerCase());
    @Nullable
 *
    private final boolean hasUnresolvedSource;
        this.rowsSources = UnmodifiableMap.emptyMap();

            SQLQueryRowsSourceContext source = queue.data;
        @NotNull SQLQueryComplexName key
            this.hasUnresolvedSource,
     * Prepare new semantic context by combining this context with the other given context
    /**
    }
    }

        return this.setRowsSources(
        @NotNull SQLQueryConnectionContext connectionInfo,
    ) {
                String canonicalName = SQLUtils.identifierToCanonicalForm(this.connectionInfo.dialect, o.getName(), false, true);
        @NotNull UnmodifiableMap<String, SourceResolutionResult> sourcesByLoweredAlias,

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            relatedContextProvider
    @NotNull
        @NotNull SQLQueryRowsSourceModel source,
        return this.setDynamicRowsSources(context.dynamicTableSources);
        return new SQLQueryRowsDataContext(this, columns, pseudoColumns, joinInfo);
    }
        }
            SQLQuerySymbolEntry entry = name.parts.getFirst();
    }

        other.registerConsumingContext(result);
            this.sourcesByLoweredAlias,
        this.targetRowContexts = ListNode.push(this.targetRowContexts, context);
            relatedContextProvider

     * @implNote TODO consider ambiguous table names
import org.jkiss.dbeaver.model.sql.SQLDialect;
        return this.rowsSources.get(name);
    }
            dynamicTableSources,
    private final UnmodifiableMap<String, SourceResolutionResult> sourcesByLoweredAlias;
        }
    @NotNull
        return new SQLQueryRowsDataContext(this, columns, pseudoColumns);



            sourcesByLoweredAlias,
    @NotNull


        @NotNull SQLQueryRowsSourceModel newSource,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
                } else {
        this.rowsSources = rowsSources;
                return new SourceResolutionInfo(result, key);
            this.dynamicTableSources.combine(other.dynamicTableSources),
            this.sourcesByLoweredAlias,
    ) {
 * Unless required by applicable law or agreed to in writing, software
    ) {
import org.jkiss.code.Nullable;
        boolean hasUnresolvedSource,
        @NotNull SQLQuerySymbolEntry alias
     */
                allSourceResolutions.stream().collect(Collectors.toMap(s -> s.source, Function.identity()));
            this.dynamicTableSources,
        @NotNull SQLQueryRowsSourceContext parent,
            dynamicTableSources,
            this.hasUnresolvedSource,
        @NotNull SQLQueryRowsSourceModel oldSource,
                .map(s -> s.aliasOrNull)
        return new SQLQueryRowsSourceContext(
                SQLQueryRowsSourceModel sourceModel = entry.getSecond();
        @NotNull SQLQueryComplexName classifiedName,
    @NotNull
    @Nullable
    /**
    @NotNull
    }

    private SQLQueryRowsSourceContext(

    void registerConsumingContext(@NotNull SQLQueryRowsDataContext context) {
            }
    }
        newSourceEntries.add(Map.entry(classifiedName, srr));
    }
        queued.add(this);
                return result;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public SQLQueryConnectionContext getConnectionInfo() {
                    }

        this.dynamicTableSources = dynamicTableSources;
            }
     */
                synthesizedName = synthesizedName.prepend(entry);
}
 * limitations under the License.
    private SQLQueryRowsSourceContext setRowsSources(

    public SQLQueryRowsDataContext makeJoinTuple(
            }
    @NotNull
        @NotNull UnmodifiableMap<SQLQueryComplexName, SourceResolutionResult> rowsSources,
                .map(String::toLowerCase)

                entry.setDefinition(new SQLQuerySymbolByDbObjectDefinition(o, SQLQuerySemanticUtils.inferSymbolClass(o)));
        @Nullable SQLQueryRowsSourceModel source,
        this.relatedContextProvider = relatedContextProvider;
            @Override
     * Create row tuple model acting as a context for column references resolution
public class SQLQueryRowsSourceContext {
            private final Map<SQLQueryRowsSourceModel, SourceResolutionResult> resolutionResults =
        boolean hasUnresolvedSource,
                    if (queued.add(item.data)) {

        ArrayList<Map.Entry<SQLQueryComplexName, SourceResolutionResult>> newSourceEntries = new ArrayList<>(5);
    }
                .collect(Collectors.toSet());
    private ListNode<SQLQueryRowsSourceContext> targetRowContexts = null;
            }
                .map(s -> s.tableOrNull)
    }

        return this.setDynamicRowsSources(this.dynamicTableSources.put(newSourceEntries));
    @Nullable

            private final Set<DBSEntity> referencedTables = allSourceResolutions.stream()
    public SQLQueryRowsDataContext makeTuple(
    private final SQLQueryConnectionContext connectionInfo;
    private static final Log log = Log.getLog(SQLQueryRowsSourceContext.class);
            this.relatedContextProvider
    private Supplier<SQLQueryRowsDataContext> relatedContextProvider = null;
    public final SQLQueryRowsSourceContext reset() {
        @NotNull UnmodifiableMap<String, SourceResolutionResult> dynamicTableSources,
    }
            if (result != null) {
            this,
                if (name.parts.size() > 1 && name.parts.get(1) != null) {
 * DBeaver - Universal Database Manager

    ) {
     */
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
    @NotNull
    private void registerConsumingContext(@NotNull SQLQueryRowsSourceContext context) {
     * Prepare new semantic context by introducing rows source
    }
    /**
    ) {
     * Prepare new semantic context by introducing rows source
        }
    }

import java.util.stream.Collectors;
            }
        if (tableOrNull != null && classifiedName.parts.getFirst().getDefinition() instanceof SQLQuerySymbolByDbObjectDefinition subparent) {
            this.relatedContextProvider
import org.jkiss.code.NotNull;
    @Nullable
    @NotNull

import java.util.function.Supplier;

import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
        @NotNull UnmodifiableMap<String, SourceResolutionResult> dynamicTableSources,
        );
            public Map<SQLQueryRowsSourceModel, SourceResolutionResult> getResolutionResults() {
            this.rowsSources.combine(other.rowsSources),
            this,
    public final SQLQueryRowsSourceContext replaceWithAlias(
    }
            this.dynamicTableSources,
        @NotNull SourceResolutionResult target,
                ));
     */
        for (Pair<SQLQuerySymbolEntry, ? extends SQLQueryRowsSourceModel> entry : sources) {
                .collect(Collectors.toSet());
        SourceResolutionResult srr = new SourceResolutionResult(source, classifiedName, tableOrNull, null);

        DBSEntity oldEntryTable = oldEntries.isEmpty() ? null : oldEntries.getFirst().getValue().tableOrNull;
        this.hasUnresolvedSource = hasUnresolvedSource;
    /**
            hasUnresolvedSource,
            SourceResolutionResult result = this.rowsSources.get(namePart);
package org.jkiss.dbeaver.model.sql.semantics.context;
    @NotNull
 *
     */
            SQLQueryComplexName synthesizedName = classifiedName;
     * Prepare new semantic context by hiding all the involved rows sources such as subqueries and table references and marking this context as having unresolved rowset references
                    endingPeriod = null;
    private final UnmodifiableMap<String, SourceResolutionResult> dynamicTableSources;
    @NotNull

    ) {

            @Override

    @NotNull
            @NotNull
    @NotNull
     * Create row tuple model acting as a context for column references resolution
        this.connectionInfo = parent.connectionInfo;
    }
        return this.hasUnresolvedSource;
        );
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean hasUnresolvedSource,


            for (DBSObject o = subparent.getDbObject().getParentObject(); o != null && !(o instanceof DBPDataSource); o = o.getParentObject()) {

                .filter(Objects::nonNull)
    /**
            queue = queue.next;

    public SQLQueryRowsSourceContext(@NotNull SQLQueryConnectionContext connectionInfo) {
    }
                    alias.getName().toLowerCase(),

            SourceResolutionResult result = this.findSourceByAlias(name.stringParts.getFirst());

        this.targetDataContexts = ListNode.push(this.targetDataContexts, context);
        return this.connectionInfo.dialect;
import org.jkiss.utils.Pair;
        return new SQLQuerySourcesInfoCollection() {
    @NotNull
            // combine inferred sources (from the underlying query expression) and dynamically provided (from the enclosing CTE)
        return new SQLQueryRowsSourceContext(this.connectionInfo, true, this.dynamicTableSources, this.relatedContextProvider);
            this.sourcesByLoweredAlias.put(alias.getName().toLowerCase(), newEntry),
            Collections.emptyList(),
            allSourceResolutions.addAll(source.rowsSources.values());
    }
        @Nullable Supplier<SQLQueryRowsDataContext> relatedContextProvider

    @Nullable
    /**

    public final SQLQueryRowsSourceContext appendSource(
            if (result != null) {
            Collections.emptyList()
            }
     */
 * You may obtain a copy of the License at
        Set<SourceResolutionResult>  allSourceResolutions = new HashSet<>();
        );
        while (namePart != null) {
            SQLQueryRowsSourceContext.this.hasUnresolvedSource || other.hasUnresolvedSource,
     * Create empty data context
            for (SQLQueryComplexName nameFragment = classifiedName.trimStart(); nameFragment != null; nameFragment = nameFragment.trimStart()) {
            }
        @Nullable DBSEntity tableOrNull
     * Find semantic model item responsible for the representation of the data rows source having a given name

                SQLQueryComplexName name = new SQLQueryComplexName(alias.getSyntaxNode(), List.of(alias), 0, null);
        return new SQLQueryRowsSourceContext(
        @NotNull Pair<List<SQLQueryResultColumn>, List<SQLQueryResultPseudoColumn>> columnsAndPseudoColumns
        this.relatedContextProvider = relatedContextProvider;
            .filter(s -> s.getValue().source == oldSource).toList();
        SourceResolutionResult newEntry = new SourceResolutionResult(newSource, null, oldEntryTable, alias.getSymbol());
     */

                for (ListNode<SQLQueryRowsSourceContext> item = source.targetRowContexts; item != null; item = item.next) {
import org.jkiss.dbeaver.model.sql.semantics.*;
    @NotNull
            this,
    /**
        // TODO: review pseudoattributes behavior in DDL expressions (not handling for now)
            SQLQuerySymbolEntry alias = entry.getFirst();
                .map(SQLQuerySymbol::getName)
    public Supplier<SQLQueryRowsDataContext> getRelatedContextProvider() {
    /**
    /**
            this.rowsSources,

            public Set<DBSEntity> getReferencedTables() {
            this.rowsSources,
        @Nullable Supplier<SQLQueryRowsDataContext> relatedContextProvider
    }
    public SourceResolutionInfo findReferencedSource(@NotNull SQLQueryComplexName name) {
    /**

        @NotNull List<SQLQueryResultPseudoColumn> pseudoColumns

            if (alias != null) {
    public SQLQuerySourcesInfoCollection getKnownSources(boolean forQuerySubscope) {
    public SQLQueryRowsSourceContext combine(@NotNull SQLQueryRowsSourceContext other) {
        return new SQLQueryRowsDataContext(this, columns, allPseudoColumns);
        );
        this.dynamicTableSources = dynamicTableSources;
            this.sourcesByLoweredAlias,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;
     * (table reference, named subquery, etc)
    }
    @NotNull
import java.util.function.Function;
            this.sourcesByLoweredAlias.combine(other.sourcesByLoweredAlias),
        ListNode<SQLQueryRowsSourceContext> queue = ListNode.of(this);
        @NotNull List<SQLQueryResultColumn> columns,
    /**
    @Nullable
     */
    @NotNull
 */
        return this.relatedContextProvider;
                    new SourceResolutionResult(sourceModel, name, null, alias.getSymbol())
        @NotNull UnmodifiableMap<String, SourceResolutionResult> sourcesByLoweredAlias,
    /**

            @Override
            allSourceResolutions.addAll(source.sourcesByLoweredAlias.values());
    private SQLQueryRowsSourceContext setDynamicRowsSources(@NotNull UnmodifiableMap<String, SourceResolutionResult> dynamicTableSources) {
        @NotNull SQLQueryRowsDataContext.JoinInfo joinInfo
    public record SourceResolutionInfo(
     */
            ? pseudoColumns
    }
                    endingPeriod = name.endingPeriodNode;
        return this.connectionInfo;
    public boolean hasUnresolvedSource() {

            if (forQuerySubscope) {
            : STMUtils.combineLists(this.connectionInfo.obtainRowsetPseudoColumns(source), pseudoColumns);
        while (queue != null) {
    @NotNull
    }
        @Nullable Supplier<SQLQueryRowsDataContext> relatedContextProvider
            null

                newSourceEntries.add(Map.entry(synthesizedName, srr));
 * distributed under the License is distributed on an "AS IS" BASIS,
                .filter(Objects::nonNull)
    private ListNode<SQLQueryRowsDataContext> targetDataContexts = null;
                    endingPeriod = name.parts.get(1).getMemberAccess();


            }
            this.rowsSources.put(newSourceEntries),

        }
import org.jkiss.dbeaver.utils.ListNode;
    public final SQLQueryRowsDataContext makeTuple(
        }
 *
    ) {

     */
        if (!name.parts.isEmpty()) {
                SQLQueryComplexName key = new SQLQueryComplexName(entry.getSyntaxNode(), List.of(entry), 0, endingPeriod);
     */
            public Set<String> getAliasesInUse() {
    public final SQLQueryRowsDataContext makeTuple(

        @NotNull List<SQLQueryResultPseudoColumn> pseudoColumns
                }
    private SQLQueryRowsSourceContext(
        return new SQLQueryRowsSourceContext(this.connectionInfo, false, this.dynamicTableSources, this.relatedContextProvider);

            this,
    ) {
    }
     * Prepare new semantic context by hiding all the involved rows sources such as subqueries and table references
                }
        }
     * Create row tuple model acting as a context for column references resolution
    /**
        this.sourcesByLoweredAlias = UnmodifiableMap.emptyMap();
    }
    }
            } else {
     */
    /**
        return this.setRowsSources(
        SQLQueryRowsSourceContext result = this.setRowsSources(
        return this.makeTuple(source, columnsAndPseudoColumns.getFirst(), columnsAndPseudoColumns.getSecond());
        @NotNull List<SQLQueryResultColumn> columns,
            }
            allSourceResolutions.addAll(source.dynamicTableSources.values());
                        queue = ListNode.push(queue, item.data);
            }
import java.util.*;
     */
    }

            SourceResolutionResult result = this.findSourceByAlias(entry.getName());
import org.jkiss.dbeaver.model.struct.DBSEntity;
            this.hasUnresolvedSource,
        return result;
        this.connectionInfo = connectionInfo;
                return new SourceResolutionInfo(result, namePart);
    public final SQLQueryRowsSourceContext setCteSourcesFrom(@NotNull SQLQueryRowsSourceContext context) {

            private final Set<String> aliasesInUse = allSourceResolutions.stream()
     */
     * Find semantic model item responsible for the representation of the dynamic table data like CTE being treated as an extra table
                return this.referencedTables;
    @Nullable
import org.jkiss.dbeaver.model.struct.DBSObject;
    @NotNull
            this.dynamicTableSources,
            @NotNull
     * Returns flag demonstrating whether all the rows' sources were correctly resolved or not
        ArrayList<Map.Entry<String, SourceResolutionResult>> newSourceEntries = new ArrayList<>(sources.size());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        parent.registerConsumingContext(this);
    public SQLQueryRowsDataContext makeEmptyTuple() {
    ) {
        @NotNull UnmodifiableMap<SQLQueryComplexName, SourceResolutionResult> rowsSources,
                SQLQuerySymbolEntry entry = new SQLQuerySymbolEntry(classifiedName.syntaxNode, canonicalName, o.getName(), null);
    }
            rowsSources,
 * See the License for the specific language governing permissions and
        this(connectionInfo, false, UnmodifiableMap.emptyMap(), null);
        );
        @NotNull List<SQLQueryResultColumn> columns,
                return this.resolutionResults;
            this.hasUnresolvedSource,
                namePart = namePart.trimEnd();
    public SourceResolutionResult findReferencedSourceExact(@NotNull SQLQueryComplexName name) {
        );

        @NotNull UnmodifiableMap<String, SourceResolutionResult> dynamicTableSources,

        return null;
    public final SQLQueryRowsSourceContext resetAsUnresolved() {
        return new SQLQueryRowsSourceContext(
        @Nullable SQLQueryRowsSourceModel source,
     * Returns information about resolved sources with ability to separately provide tables and aliases used in the query

     * Get the resolved query source by its name
                } else if (name.parts.size() == 2 && name.parts.get(1) == null) {
import org.jkiss.dbeaver.model.stm.STMUtils;
    public SourceResolutionResult findDynamicRowsSource(@NotNull SQLQuerySymbolEntry name) {
            this.relatedContextProvider
    private SourceResolutionResult findSourceByAlias(@NotNull String aliasName) {
    @NotNull
     */
import org.jkiss.dbeaver.Log;
