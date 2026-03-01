            return this.isJoin() ? this.rowsDataContext.getJoinInfo().right().getColumnsList() : Collections.emptyList();

        };
                SQLQueryModel.LexicalContextResolutionResult context = model.findLexicalContext(


import org.jkiss.dbeaver.model.sql.SQLSearchUtils;
                    @Override
                }

                }
                        contexts,
        @NotNull DBRProgressMonitor monitor,


    @NotNull
                @NotNull DBRProgressMonitor monitor,
                                    filterOrNull,
            return false;
        }
                                if (score > 0) {
        }

        }
            super(rowsDataContext.getRowsSources());
            ) {
                        }
                return this.exposedContexts;
        public boolean hasRelatedAssociationsWithTable(@NotNull SQLQueryRowsSourceModel source) {

                        return List.of(defaultCatalog);
                                        request,
    @NotNull
        @NotNull
                @NotNull DBSObject object,
                        o -> objectTypes.stream().anyMatch(t -> t.getTypeClass().isAssignableFrom(o.getClass())) && objs.add(o),
            return this.subquerySources.getResolutionResults().values()
             *                ^     ^
                    this.columnNameConflicts = this.getDataContext().getColumnsList().stream()
                @NotNull SQLQueryExprType compositeType,
                    }
                    this.collectImmediateChildren(
                //     || (lexicalItem != null&& nameNodes.getLast().getRealInterval().b != lexicalItem.getSyntaxNode().getRealInterval().b)
                                    };
                } else if (lexicalItem instanceof SQLQuerySymbolEntry entry) {
                                        int leftScore = leftWord.matches(filterOrNull, searchInsideWords);
    private SQLQueryCompletionContext(int scriptItemOffset, int requestOffset) {
                // using inferred context when semantics didn't provide the origin

                            break;
                                    prepareObjectCompletions(
                                    prefix,
            return columnsList.stream()
                        // do nothing
                Map<DBSEntityAttribute, EntityAssociationTargetsInfo> associatedAttributes =
                items.addLast(SQLQueryCompletionItem.forReservedWord(score, filterWord, s));
                                        .map(DBSEntityElement::getParentObject)
                @Nullable SQLQueryWordEntry filterOrNull,
                    this.collectImmediateChildren(
                        .map(c -> c.apply(formatter))
            if (tupleAttributes.stream().anyMatch(sourceAssociations::contains)) {
                                                SQLQueryCompletionItem.forJoinCondition(score, matchedWord, leftColumnRef, rightColumnRef)
                return SQLQueryCompletionContext.prepare(
                    request.setWordPart(SQLConstants.ASTERISK);
                DBCExecutionContextDefaults<?, ?> defaults = dbcExecutionContext.getContextDefaults();
            @NotNull SQLQueryDataContextInfo context,
                    .filter(aa -> aa != null && aa.size() == 1 && aa.getFirst() instanceof DBSTableForeignKeyColumn)
                                        associations.hasRelatedAssociationsWithTable(o)
            return null;
                    );
            @Override
                    @Override
                        }
            return Collections.emptyList();
                );
                        int score = filterKey.matches(filterOrNull, this.searchInsideWords);
            private SQLQueryCompletionItem makeDbObjectCompletionItem(
            }
     */

                if (syntaxInspectionResult == null) {
                    } else {
                        } else if (prefix.object() instanceof DBSObjectContainer container) {
                }
                } else {
                                }
             */
                        SQLQueryWordEntry itemKey = makeFilterInfo(filterOrNull, member.name());
                    LinkedList<SQLQueryCompletionItem> procedureItems = this.prepareProceduresCompletions(
                @Nullable SQLQueryWordEntry filterOrNull
            private LinkedList<SQLQueryCompletionItem> prepareProceduresCompletions(
            ) {
            @Override
                    return null;
                    public void visitRowsSourceRef(@NotNull SQLQuerySymbolOrigin.RowsSourceRef rowsSourceRef) {


                return items;
                @NotNull DBRProgressMonitor monitor,
                            SQLQueryWordEntry childName = makeFilterInfo(filterOrNull, fname);
        SQLQueryCompletionItem produce(int score, SQLQueryWordEntry key, T object);
                return Collections.emptySet();
        @Nullable
                    .collect(Collectors.toMap(rr -> rr.tableOrNull, Function.identity()));
             * </pre>

                int lineStartOffset;


                            case OBJECT, TABLE -> {
            ) {
        @NotNull
                }
                return def;
                LinkedList<SQLQueryCompletionItem> completions = new LinkedList<>();



                    if (request.getContext().isSearchProcedures()) {
        SQLQueryDataContextInfo getRelatedContext();
    public static int getMaxKeywordLength() {
                        contextObjext,
                                    prepareProceduresCompletions(monitor, request, contextInfo.getKnownSources(), List.of(c), filterOrNull);
            @NotNull DBRProgressMonitor monitor,
                    }
            private void accomplishFromKnownOrigin(
                    }
                if (parsedInterval.a < 0 || parsedInterval.b < 0) {
                        } catch (DBException e) {
                } else {
                }
            private void findAllSchemaContainers(

        };
            return Collections.emptyList();
                        completions
                @NotNull List<SQLQueryCompletionSet> results
                return syntaxInspectionResult;
                        );
             * Provide completion sets to the results list based on the current query symbols origin
        };
                                associations.hasRelatedAssociationsWithTable(rr.source)

        }
                    def = entry.getDefinition();
            ) {
            }
            private void preparePrefixedColumnCompletions(
            }
                        setContextInfo(SQLQueryDataContextInfo.makeFor(rowsSourceRef.getRowsSourceContext()));
                                filterOrNull,
                        SQLQueryDataContextInfo contextInfo = SQLQueryDataContextInfo.makeFor(origin.getRowsDataContext());
                this.nearestContext = contextInfo;
        return this.requestOffset;
                    try {
                } else {
                                                rightScore, rightWord, rightColumn, resolutionResults.get(rightColumn.source), true
                        components = Collections.emptyList();
                LinkedList<SQLQueryCompletionItem> sequenceItems = new LinkedList<>();
                        }
                    Optional.ofNullable(entity.getAssociations(monitor))
                }
                                }

                                int score = sourceAlias.matches(filterOrNull, this.searchInsideWords);
                        monitor,

                    ) {
                            items.addLast(item);
        @NotNull
 * See the License for the specific language governing permissions and
                        this.collectPackages(monitor, request, knownSources, this.exposedContexts,  null, filterOrNull, completions);
                    for (SQLQueryResultColumn leftColumn : context.getLeftParentColumnsList()) {
            private void prepareObjectCompletions(


        protected Supplier<SQLQueryDataContextInfo> prepareRelatedContextInfoProvider() {
                        //this.collectProcedures(monitor, request, containers, null, filterOrNull, completions);
                    boolean sourceAliasMatch;
            ) {
                    Collection<? extends DBSObject> components;
                                request,

                LinkedList<SQLQueryCompletionItem> completions = new LinkedList<>();
                    SQLQueryCompletionTextProvider formatter = new SQLQueryCompletionTextProvider(
            @NotNull
                .flatMap(a -> this.findAssociatedAttributes(this.associationPresenceResolutionMonitor, a).stream())
                    && this.associationsResolutionContext.filterOrNull == filterOrNull ? this.associationsResolutionContext : (
    }
                    }
                } else if (lexicalItem instanceof SQLQueryMemberAccessEntry entry) {
            private SQLQueryWordEntry obtainCurrentWord(STMTreeNode currentTerm, int position) {
                if (byFullNameItems.size() > 0) {
                                        prefix.object(),
                        // usually we don't want procedures in FROM
                    LinkedList<SQLQueryCompletionItem> tableRefs = new LinkedList<>();
                        List<String> parts = SQLQueryCompletionItem.prepareQualifiedNameParts(rr.tableOrNull, null);
                    private void prepareDefaultObjectCompletion(
            private void tryApplyOriginContext() {
                            SQLQueryWordEntry filter = makeFilterInfo(componentNamePart, o.getName());
            }
             * Prepare list of completion items intended to accomplish complex name

                @NotNull SQLQuerySourcesInfoCollection knownSources,
                                    results
                LinkedList<SQLQueryCompletionItem> proceduresItems = new LinkedList<>();
            ) {
                            monitor,
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObjext,
            }
                                results
            private void prepareLexicalItemCompletions(
                    STMTreeNode term = nameNodes[i];
                                        request,
                }
                @NotNull SQLQuerySourcesInfoCollection knownSources,
        this.makeFilteredCompletionSet(filterOrNull, items, results);
                        int end = mr.end(i);
            }


            }
                @NotNull List<Class<? extends DBSObject>> componentTypes,
                }
            }
                } else {
                }
        }
                     */
                this.relatedContextInfoProvider = this.prepareRelatedContextInfoProvider();
                    @Override
        @NotNull
                            } else {
            return EMPTY_DATA_CONTEXT_INFO;
                }
                Map<SQLQueryRowsSourceModel, SourceResolutionResult> resolutionResults = context.getKnownSources().getResolutionResults();
                        SQLQueryDataContextInfo contextInfo = SQLQueryDataContextInfo.makeFor(tupleSource);
                    if (result.add(container)) {
                                    var rightRels = associations.findAssociatedAttributes(monitor, rightColumn.realAttr);
            if (scriptItem.item.hasContextBoundaryAtLength() && position >= scriptItem.item.length()) {
                        }

        this.scriptItemOffset = scriptItemOffset;
                makeFilteredCompletionSet(filterOrNull, items, results);
            }
                    item = SQLQueryCompletionItem.forDbCatalogObject(score, childName, contextObjext, child);
        }
                                        SQLQueryWordEntry leftWord = makeFilterInfo(null, leftColumn.symbol.getName());
                                        if (leftScore > 0 || rightScore > 0) {
                        Collection<? extends DBSProcedure> procedures = pc.getProcedures(monitor);
                Interval parsedInterval = syntaxNode.getRealInterval();
        @NotNull List<SQLQueryCompletionSet> results

                        if (start <= inLineOffset && end >= inLineOffset) {
                } else if (this.nameNodesAreUseful(parts)) {

                    }

        } else {
            this.associationPresenceResolutionMonitor = new LocalCacheProgressMonitor(monitor);
                        completionContext,
                } catch (DBException e) {
                                    null,
        }
        public List<SQLQueryResultColumn> getColumnsList() {
        }
            @Override
            this.filterOrNull = filterOrNull;
                        // The "word" being accomplished may be a quoted or a beginning of the quoted identifier,
                            return null;
                }
                        setContextInfo(contextInfo);
                Set<DBSObject> objs = new HashSet<>();

                }
            } else {
                return new EntityAssociationsInfo(entity, Collections.emptyMap(), Collections.emptySet(), Collections.emptySet());
        }
                @NotNull DBRProgressMonitor monitor,
                @NotNull DBRProgressMonitor monitor,
                @NotNull DBRProgressMonitor monitor,
                            items
        List<? extends SQLQueryResultColumn> getRightParentColumnsList();
                });
        }

                if (prefixContext instanceof DBSObjectContainer container) {

                @NotNull Collection<DBSObjectContainer> containers,
     */
                    ), results);
package org.jkiss.dbeaver.model.sql.semantics.completion;
            private final Set<DBSObjectContainer> exposedContexts = SQLQueryCompletionContext.obtainExposedContexts(dbcExecutionContext);
                if (!origin.isChained() && !origin.isApplicable(syntaxInspectionResult)) {
                @NotNull List<SQLQueryCompletionSet> results
                } catch (DBException e) {
            public LSMInspections.SyntaxInspectionResult getInspectionResult() {


                    }
            @NotNull
                }
                                    prepareProceduresCompletions(monitor, request, contextInfo.getKnownSources(), List.of(c), filterOrNull);
        @NotNull
                                }
                        request,
        private final Map<DBSEntity, EntityAssociationsInfo> associatedAttrsByEntity = new HashMap<>();
        private final SQLQueryDataContextInfo relatedContext;
                );
        public SQLQueryRowsSourceContextInfo(@NotNull SQLQueryRowsSourceContext rowsSourceContext) {
            }
                    // do nothing
                            filter = new SQLQueryWordEntry(filterStart, filterKeyString);
        public List<? extends SQLQueryResultColumn> getRightParentColumnsList() {
                return proceduresItems;
                    expectedTypes.add(DBSSchema.class);
                        prepareInspectedFreeCompletions(monitor, request, results);
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
        private Set<DBSEntity> allAssociatedEntitiesOfColumnsList = null;
                                SQLQueryWordEntry tableName = makeFilterInfo(filterOrNull, rr.tableOrNull.getName());
                @NotNull LinkedList<SQLQueryCompletionItem> accumulator
                if (syntaxInspectionResult.expectingTableReference() && nameNodes.length == 0) {
        @Nullable
            }
                return true;
import org.jkiss.dbeaver.Log;

                            );
                                (Set<DBSEntityAttribute> targetAttrs) -> new EntityAssociationTargetsInfo(
        @Override
                            if (score > 0) {
            try {
                            1, makeFilterInfo(placeholderEntry, ""), columnListString, "Tuple columns expansion"


    @NotNull
                ArrayDeque<STMTreeNode> nameNodes = nameInspectionResult.nameNodes();
                    int requestPosition = tail != null ? tail.offset : (requestOffset - scriptItem.offset);
        }
                        .stream()

                            }
            @NotNull
                @Nullable SQLQueryCompletionItem.ContextObjectInfo prefixInfo,
import java.util.regex.Matcher;
                    }
                if (m.find() && lineStartOffset >= 0) {
    /**

                    String[][] quoteStrs = request.getContext().getDataSource().getSQLDialect().getIdentifierQuoteStrings();
                }
                    .collect(Collectors.toUnmodifiableSet());
    public int getRequestOffset() {
                @NotNull SQLCompletionRequest request
            this.context = context;

                        .collect(Collectors.groupingBy(rc -> rc.realAttr)).entrySet().stream()
            ) {
                    this.accomplishFromKnownOriginOrFallback(monitor, request, tupleRef.getOrigin(), null, parts, results);
                                    request,
                                );
                                        prefix.object(),
        private final SQLQueryWordEntry filterOrNull;
        @NotNull
                                        filterOrNull,
            @NotNull
                    );

            public Collection<SQLQueryCompletionSet> prepareProposal(
    private interface CompletionItemProducer<T> {
                                score, aliasName, rr.aliasOrNull, rr,
                                    tableRefs.add(SQLQueryCompletionItem.forRealTable(score, tableName, null, rr.tableOrNull, true, false));
            public boolean isColumnNameConflicting(String name) {

                            if (score > 0) {
                    }
                        nameNodes.isEmpty() || (
        }
                }
                    try {
        private Set<DBSEntityAttribute> extractRealAttributes(@NotNull List<SQLQueryResultColumn> columnsList) {
                }
    }
                                    deepestContext.getKnownSources(),
            return this.associatedAttrsByEntity.computeIfAbsent(table, e -> this.prepareAllAssociations(monitor, e));
                        if (leftColumn.realAttr != null) {

                    this.tryApplyOriginContext();
                        Collection<? extends DBSObject> children = container.getChildren(monitor);
                }
                if (byAliasItems.size() > 0) {

                SQLQueryCompletionContext completionContext,
            @NotNull
                }

                    );
                            if (child instanceof DBSSchema || child instanceof DBSCatalog) {
                            prepareContextSchemasAndCatalogs(monitor, exposedContexts, null, filterOrNull, results);
                                if (score > 0) {
                    log.error(ex);
            }
                    String prefixString = scriptItem.item.getOriginalText().substring(prefixStart, requestPosition);
        results.add(new SQLQueryCompletionSet(replacementPosition, replacementLength, items));
        @Override
public abstract class SQLQueryCompletionContext {
                }
                SQLQueryDataContextInfo contextInfo,
                                SQLQueryWordEntry sourceAlias = makeFilterInfo(filterOrNull, rr.aliasOrNull.getName());
                STMTreeNode currentNode = i >= nameNodes.length ? null : nameNodes[i];
            }
                                deepestContext.getKnownSources(),
                try {
                for (SourceResolutionResult rr : context.getKnownSources().getResolutionResults().values()) {
                @NotNull SQLCompletionRequest request,
                    this.tryApplyOriginContext();
                                if (origin.getObject() instanceof DBSObjectContainer objectContainer) {
                } else {
                try {
                        }
                        if (componentTypes.stream().anyMatch(t -> t.isInstance(o))) {
                                if (score > 0) {
                @NotNull SQLCompletionRequest request,
                                Collectors.toSet(),
    }
        @NotNull
                            } else {
                                    completions.addLast(this.makeDbObjectCompletionItem(score, childName, contextObject, child));
    }
            private SQLQuerySymbolDefinition unrollSymbolDefinition(SQLQuerySymbolDefinition def) {
                @Nullable SQLQueryWordEntry filterOrNull,

                    }
        if (model != null) {
            private void prepareNonPrefixedColumnCompletions(
        @NotNull
                if (dbcExecutionContext == null || dbcExecutionContext.getDataSource() == null || !DBStructUtils.isConnectedContainer(dbcExecutionContext.getDataSource())) {
                        if (targetAttr != null && sourceAttr != null) {
                this.makeFilteredCompletionSet(filterOrNull, completions, results);
    }
    /**
                        return score <= 0 ? null : SQLQueryCompletionItem.forSubsetColumn(
                boolean keywordsAllowed = (lexicalItem == null || (lexicalItem.getOrigin() != null && !lexicalItem.getOrigin().isChained()) || (lexicalItem.getSymbolClass() != null && potentialKeywordPartClassification.contains(lexicalItem.getSymbolClass()))) && !hasPeriod;
                            prefixInfo,
            }
            return false;
                @NotNull SQLCompletionRequest request,
        return new SQLQueryCompletionContext(scriptItem.offset, requestOffset) {
        SQLQuerySymbolClass.RESERVED
            return this.allAssociatedEntitiesOfColumnsList;

            return this.rowsDataContext.getJoinInfo() != null;
    /**
                        List<SQLQueryCompletionItem> items = this.accomplishTableReferences(
                return results;
                                        Set.of(objectTypesToPropose),
                                makeFilteredCompletionSet(
             * <pre>
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardLexer;
                        filterOrNull,
            private void accomplishTableReference(
                @NotNull List<SQLQueryCompletionSet> results
                @NotNull List<SQLQueryCompletionSet> results
            @Nullable SQLQueryWordEntry filterOrNull
                            ));
                    }
        @NotNull

                @NotNull Set<DBSObjectContainer> result
            public Map<SQLQueryRowsSourceModel, SourceResolutionResult> getResolutionResults() {
                        if (score > 0) {
            private void collectImmediateChildren(
            }
            ) {
                    public void visitDbObjectRef(SQLQuerySymbolOrigin.DbObjectRef origin) {
                            case ROWSET -> {
                    try {
                        expectedTypes.add(DBSPackage.class);
        public List<? extends SQLQueryResultColumn> getLeftParentColumnsList() {
                        dbcExecutionContext,
        }
                    MatchResult mr = m.toMatchResult();
        }
        @Nullable
                    for (SQLQueryResultColumn c : currentTableSource.source.getRowsDataContext().getColumnsList()) {
     * Prepare completion context for the script item in the given contexts (execution, syntax and semantics)
                    public void visitMemberOfType(SQLQuerySymbolOrigin.MemberOfType origin) {
        @NotNull SQLCompletionRequest request
        public boolean isJoin() {
                    LinkedList<SQLQueryCompletionItem> items = new LinkedList<>();
            @NotNull
                            int nameScore = key.matches(tail, this.searchInsideWords);
                                }
        boolean isJoin();
            @Override
    private final int scriptItemOffset;
                            }
        SQLQuerySymbolClass.UNKNOWN,
                return true;
        @NotNull Set<DBSEntity> allAssociatedEntities,
    /**
                if (context.symbolsOrigin() instanceof SQLQuerySymbolOrigin.RowsSourceRef rowsSourceOrigin) {
                @NotNull DBRProgressMonitor monitor,
    public boolean isColumnNameConflicting(String name) {

                ) {
            private void collectTables(
                        log.error(e);

                DBSObject contextObject = DBUtils.getSelectedObject(dbcExecutionContext);
        ) {
    ) {
                    log.error(e);


            }
            return Optional.ofNullable(this.getRealColumnNameCompletionItems().get(attr)).orElse(Collections.emptyList());
                                SQLQueryWordEntry childName = makeFilterInfo(filterOrNull, p.getName());
    protected void makeFilteredCompletionSet(
        @Nullable SQLQueryWordEntry filterOrNull,
                            Collection<DBSObjectContainer> container = obtainDefaultContext(monitor, request);
                    log.error(ex);
        @Override
            @NotNull
                @Nullable SQLQueryWordEntry filterOrNull,
                                prepareObjectCompletions(
                                    container,

                    return Collections.emptyList();
        }

                    } else {
                List<SQLQueryWordEntry> prefix = parts.subList(0, parts.size() - 1);
                    resultItems = Stream.of(joinConditions, subsetColumns, tableRefs, procedureItems, sequenceItems).flatMap(Collection::stream).toList();
                    .map(attrRef -> {
                } catch (DBException ex) {
                @NotNull SQLQuerySourcesInfoCollection knownSources,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                List<SQLQueryCompletionSet> results = new ArrayList<>();
    }
                    executionContext,
import org.jkiss.dbeaver.model.stm.STMTreeTermNode;
                }

            ) {
            ) {
        }
            private static final Pattern KEYWORD_FILTER_PATTERN = Pattern.compile("([a-zA-Z0-9]+)");
                            }
                        context.getKnownSources(),
                @NotNull List<SQLQueryWordEntry> prefix,
        @NotNull
                Collection<DBSObjectContainer> objectContainers = container;

                @NotNull List<SQLQueryWordEntry> prefix,
            public SQLQueryDataContextInfo getDataContext() {
                                partsMatched++;
                    if (prefixObject != null) {
                        sourceFullnameMatch = partsMatched == prefix.size();
                                } else {
                    }
            }
                                        prefix,
                        expectedTypes.add(DBSProcedure.class);
            private boolean nameNodesAreUseful(@NotNull List<SQLQueryWordEntry> parts) {
            private void prepareInspectedFreeCompletions(
                    } catch (DBException e) {
                .orElse(Collections.emptySet());
            @Override
                    makeFilteredCompletionSet(placeholderEntry, List.of(
                            }).toList()
                                    request,
                        null,
                .map(c -> c.realAttr)
                if (objectContainers == null) {
                    ));

            /**
                        SQLQueryCompletionItem.ContextObjectInfo prefix = new SQLQueryCompletionItem.ContextObjectInfo(
            this.subquerySources = rowsSourceContext.getKnownSources(true);
                @NotNull DBRProgressMonitor monitor,
            }
            }

            private void accomplishMemberReference(
                                    targetAttrs.stream()
                return LSMInspections.SyntaxInspectionResult.EMPTY;
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
            }
        public boolean isJoin() {
                // no name nodes OR
                return SQLQueryDataContextInfo.empty();
        public SourceResolutionResult resolveSource(DBRProgressMonitor monitor, List<String> s) {
            private void accomplishColumnReference(
                        }
                this.makeFilteredCompletionSet(filterOrNull, resultItems, results);
                                    );
                    } else if (object instanceof DBSObjectContainer container && DBStructUtils.isConnectedContainer(container)) {
            this.rowsDataContext = rowsDataContext;
                            }
                return completionSets;
                        SQLQueryCompletionItem.forSpecialText(
                    this.accomplishColumnReference(monitor, request, defaultContext, prefix, tail, results);
                return this.associationsResolutionContext != null
import org.jkiss.utils.Pair;
                            if (rr.aliasOrNull != null && !rr.isCteSubquery) {
                    objectContainers = this.obtainDefaultContext(monitor, request);
        for (String s : keywords) {

                            }
                    .map(rc -> {
            public Collection<SQLQueryCompletionSet> prepareProposal(
                }
                    Collection<? extends DBSObject> children = container.getChildren(monitor);
                    .collect(Collectors.toUnmodifiableSet());
            return null;
                                return SQLQueryCompletionItem.forSubsetColumn(
                                        SQLQueryWordEntry rightWord = makeFilterInfo(null, rightColumn.symbol.getName());
             *                          ^
            ) {
                        request.getWordDetector()
                        setContextInfo(contextInfo);
                    if (filterOrNull != null && contextObjext == null) {
                        for (SQLQueryResultColumn c : rr.source.getRowsDataContext().getColumnsList()) {
                    return null;
        @Nullable
                @NotNull SQLCompletionRequest request
                        filterOrNull
                    IRegion lineInfo = doc.getLineInformationOfOffset(this.getRequestOffset());
                    if (rr.aliasOrNull != null && rr.isCteSubquery) {
        SQLQuerySymbolClass.ERROR,
                    offset,
                    })
            private SQLQueryDataContextInfo nearestContext = SQLQueryDataContextInfo.empty();
                        return List.of(container);
                try {
                                                leftScore, leftWord, leftColumn, resolutionResults.get(leftColumn.source), true

                            tail
            @NotNull
                            }
                        }
                        int nameScore = key.matches(filterOrNull, this.searchInsideWords);
                            return ((DBSTableForeignKey) c).getAttributeReferences(monitor);
import org.jkiss.dbeaver.model.sql.semantics.*;

                }
                            prepareTableCompletions(monitor, request, contextInfo.getKnownSources(), filterOrNull, results);

                        monitor
                            Collectors.collectingAndThen(
                                prefix,
                        request,
                    if ((term instanceof STMTreeTermNode t && t.symbol.getType() != SQLStandardLexer.Period)||term instanceof  STMTreeTermErrorNode) {
        private Map<DBSEntityAttribute, List<SQLQueryCompletionItem.SQLColumnNameCompletionItem>> realColumnRefsByEntityAttribute = null;
                    ? null
                @Nullable SQLQueryWordEntry filterOrNull,
                    ) {
                    item = SQLQueryCompletionItem.forDbObject(score, childName, contextObjext, child);
                this.searchInsideWords = request.getContext().isSearchInsideNames();
                    this.prepareInspectedIdentifierCompletions(monitor, request, parts, completionSets);
                        SQLQueryDataContextInfo contextInfo = SQLQueryDataContextInfo.makeFor(origin.getRowsContext());
                    .flatMap(t -> t.entities.stream())
                        monitor,
                LinkedList<SQLQueryCompletionItem> items = new LinkedList<>();
                    this.setContextInfo(SQLQueryDataContextInfo.makeFor(rowsDataOrigin.getRowsDataContext()));
            private List<? extends SQLQueryCompletionItem> prepareTupleColumns(
                        prepareNonPrefixedColumnCompletions(monitor, request, contextInfo, filterOrNull, results);
                @NotNull SQLCompletionRequest request
                        request,
                return sequenceItems;
            }
                @NotNull Collection<DBSObjectContainer> contexts,
                     * Default completion proposals preparation behavior for object-from-object symbols origin
                        } else {
                @NotNull SQLQueryLexicalScopeItem lexicalItem,
                            o -> expectedTypes.stream().anyMatch(c -> c.isAssignableFrom(o.getClass())),
                                List.of(container),
                            makeObjectForValueRefFilterPredicate(expectedTypes, knownTables),
                                findAllSchemaContainers(monitor, child, result);
        public SQLQueryRowsDataContextInfo(@NotNull SQLQueryRowsDataContext rowsDataContext) {
                ? this.realColumnRefsByEntityAttribute

                                item = SQLQueryCompletionItem.forCompositeField(score, itemKey, member.attribute(), member);
                                    origin.getObjectTypes(),
                }
                @NotNull SQLCompletionRequest request,
                        SQLQueryWordEntry aliasName = makeFilterInfo(filterOrNull, rr.aliasOrNull.getName());
            if (!realAttrs.isEmpty()) {
                            int score = childName.matches(filterOrNull, this.searchInsideWords);
                    List<SQLQueryCompletionItem> joinConditions = syntaxInspectionResult.expectingJoinCondition()
                    LinkedList<SQLQueryCompletionItem> sequenceItems = this.prepareSequencesCompletions(
        @NotNull

                        SQLQueryWordEntry filterKey = makeFilterInfo(filterOrNull, rc.symbol.getName());
                        this.collectTables(monitor, knownSources, containers, null, filterOrNull, completions);
                    .stream()
            return () -> relatedContextInfo;
                            }
        @NotNull Set<DBSEntity> entities
                if (contextObject != null) {
        ) {
            ) {
                            }
                return syntaxInspectionResult;

            if (this.getAssociatedEntitiesOfColumnsList(this.associationPresenceResolutionMonitor).contains(table)) {
                    this.prepareTableCompletions(monitor, request, context.getKnownSources(), tail, results);
        @Nullable
                            nameNodes.getLast().getRealInterval().b < lexicalItem.getSyntaxNode().getRealInterval().b
                LinkedList<SQLQueryCompletionItem> byFullNameItems = new LinkedList<>();
        @NotNull Set<DBSEntityAttribute> attributes,
            this.rowsSourceContext = rowsSourceContext;
                    expectedTypes.add(DBSView.class);
    }
        List<SQLQueryResultColumn> getColumnsList();
    public interface SQLQueryDataContextInfo {
            @Override
                        sourceAliasMatch = rr.aliasOrNull != null && rr.aliasOrNull.getName().equalsIgnoreCase(mayBeAliasName.filterString);
                    );
                            false
                    @Override
        return exposedContexts;
                } else if (context.symbolsOrigin() instanceof SQLQuerySymbolOrigin.RowsDataRef rowsDataOrigin) {
            int score = filterWord.matches(filterOrNull, this.searchInsideWords);
                }
                if (objectContainers == null) {

                return new EntityAssociationsInfo(entity, associatedAttributes, allAssociationTargets, allAssociatedAttributes);
import java.util.regex.Pattern;
                                        score, childName, contextObjext, o,

                                SQLQueryWordEntry childName = makeFilterInfo(filterOrNull, child.getName());
                    // do nothing
                    this.prepareTableCompletions(monitor, request, this.deepestContext.getKnownSources(), null, completionSets);
                        Collectors.mapping(
                    .values().stream()
                                SQLQueryWordEntry word = makeFilterInfo(null, rc.symbol.getName());
                    nameInspectionResult.currentTerm()
                                        filterOrNull
                @NotNull DBRProgressMonitor monitor,
                            } else if (rr.tableOrNull != null) {
            }
                    }
        return Collections.emptySet();
                        DBSEntityAttribute sourceAttr = attrRef.getAttribute();


     * Returns maximum length of all keywords
        }
    private static final Log log = Log.getLog(SQLQueryCompletionContext.class);
                        }
                        expectedTypes.add(DBSPackage.class);
                        SQLQueryDataContextInfo contextInfo = SQLQueryDataContextInfo.makeFor(origin.getRowsDataContext());
            private void setContextInfo(SQLQueryDataContextInfo contextInfo) {
        }
            private List<SQLQueryWordEntry> obtainIdentifierParts(int position) {
                                }
                int position = this.getRequestOffset() - this.getOffset();

                        int start = mr.start(i);
                @NotNull DBRProgressMonitor monitor,
                if (dbcExecutionContext == null) {
                        );
                return result;
                        monitor,
                @NotNull SQLCompletionRequest request,
        }
                            knownSources,
                } else if (child instanceof DBSSchema p) {

    }
        this.requestOffset = requestOffset;
                            SQLQueryCompletionItem item;
                    }
                                if (sourceAliasMatch) {
    }
                    this.prepareInspectedIdentifierCompletions(monitor, request, parts, results);
                        ))
        @NotNull
                } else { // table-ref not introduced yet or non-prefixed column, so try both cases
                        SQLQueryDataContextInfo contextInfo = SQLQueryDataContextInfo.makeFor(origin.getRowsSourceContext());
                    return null;

                    .filter(rr -> rr.referenceName != null && rr.tableOrNull != null)

                        ), results);
                } else if (child instanceof DBSCatalog p) {
                : SQLQueryDataContextInfo.makeFor(this.rowsSourceContext.getRelatedContextProvider().get());
                } else if (dbcExecutionContext.getDataSource() instanceof DBSObjectContainer container) {
                @NotNull SQLQueryDataContextInfo context,
                        }
                if (defaults != null) {

                                    if (leftRels.contains(rightColumn.realAttr) || rightRels.contains(leftColumn.realAttr)) {
            }
     * Prepare completion context for the script item at given offset treating current position as outside-of-query
            }

    );
                        for (DBSObject obj : dbObjs) {
                    if (request.getContext().isSearchProcedures()
                            }
                SQLQueryWordEntry currentWord = this.obtainCurrentWord(currentTerm, position);
            ) throws DBException {
        }
    public int getOffset() {
                @Nullable SQLQueryWordEntry tail,
import org.eclipse.jface.text.IDocument;
                this.makeFilteredCompletionSet(filterOrNull, completions, results);
        public SQLQuerySourcesInfoCollection getKnownSources() {
                .filter(c -> c.realAttr != null)
                                    ),
                    context,
        int requestOffset,
                int i = 0;
                    DBSObject prefixObject = SQLSearchUtils.findObjectByFQN(
                            int filterStart = start + lineStartOffset - scriptItemOffset;
        @NotNull SQLScriptItemAtOffset scriptItem,
            @Override

                                }
                    nameInspectionResult.hasPeriod(),
                } else {
                        this.collectProcedures(monitor, request, contexts, contextObjext, filterOrNull, completions);

                            );
            return SQLQueryCompletionContext.prepareEmpty(0, offset);
                } catch (DBException ex) {
                        )
                            } else if (member.attribute() != null) {
        public SourceResolutionResult resolveSource(DBRProgressMonitor monitor, List<String> tableName) {

        @Override
        }
                    lexicalItem,
                            context.getKnownSources(),
                }
            return this.realColumnRefsByEntityAttribute != null
                @NotNull SQLQueryWordEntry componentNamePart,
                    this.collectPackages(monitor, request, knownSources, this.exposedContexts, null, filterOrNull, proceduresItems);
import org.eclipse.jface.text.IRegion;
            private SQLQueryDataContextInfo deepestContext = SQLQueryDataContextInfo.empty();
                @NotNull SQLCompletionRequest request,
                @NotNull DBRProgressMonitor monitor,
                @NotNull SQLQueryWordEntry childName,
        @Override

                        Set<DBSObjectContainer> result = new HashSet<>();
                    this.makeFilteredCompletionSet(tail, byAliasItems, results);

        }
                        monitor,
                    } else if (defaultCatalog != null && defaultSchema == null) {
                    for (DBSObject child : children) {
                    lineStartOffset = lineInfo.getOffset();
        public SQLQuerySourcesInfoCollection getKnownSources() {
                                    monitor,

                    if (request.getContext().getDataSource().getSQLDialect().supportsQualifiedColumnNames()) {
                    }

        public List<SQLQueryResultColumn> getColumnsList() {
                    monitor, knownSources, containers,

                    && nameNodes.length == 0
                @NotNull DBSObject child
                @NotNull DBRProgressMonitor monitor,
                } else {
                                }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        } else {
                        makeFilteredCompletionSet(filterOrNull, prepareTupleColumns(contextInfo, filterOrNull, false), results);
    }
    }
                                    targetAttrs,
                @NotNull DBRProgressMonitor monitor,
                SQLQueryWordEntry tail = parts.get(parts.size() - 1);
                @NotNull DBRProgressMonitor monitor,

                }
                @NotNull LinkedList<SQLQueryCompletionItem> accumulator
        private Map<DBSEntityAttribute, List<SQLQueryCompletionItem.SQLColumnNameCompletionItem>> getRealColumnNameCompletionItems() {
                List<? extends SQLQueryCompletionItem> subsetColumns = this.prepareTupleColumns(context, filterOrNull, true);
                                        deepestContext.getKnownSources(),
    }
     * Empty completion context which always provides no completion items
                                    accumulator.addLast(this.makeDbObjectCompletionItem(score, childName, contextObjext, child));
                        for (SourceResolutionResult rr : context.getKnownSources().getResolutionResults().values()) {
            @Override
                        }
                        Collection<? extends DBSObject> dbObjs = container.getChildren(monitor);
                                        monitor,
                        Pair::getFirst, // relation source attr is a key
                return Collections.emptyList();
            SQLQueryDataContextInfo relatedContextInfo = this.rowsSourceContext.getRelatedContextProvider() == null
                                if (score > 0) {
                        monitor, knownSources, objectContainers,
            private AssociationsResolutionContext getAssociationsContext(

import org.jkiss.dbeaver.model.stm.LSMInspections;
                        }
        Set<DBSObjectContainer> exposedContexts = new LinkedHashSet<>();
                            origin.getObject(),
                Map<DBSObject, SourceResolutionResult> knownTables = knownSources.getResolutionResults()
                    .map(c -> {
                        prepareTableCompletions(monitor, request, knownSources, filterOrNull, results);
                    for (SQLQueryExprType.SQLQueryExprTypeMemberInfo member : members) {
                @Nullable SQLQueryWordEntry tail,
 *
    }
                    for (DBSObjectContainer container : contexts) {
                contextObject != null;
                @NotNull DBRProgressMonitor monitor,
                            }
                return true;
            }
                        }
                @NotNull List<SQLQueryCompletionSet> results
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;

                @Nullable SQLQueryWordEntry filterOrNull
                .map(t -> t.attributes)
                    return List.of(container);
                            }
                        components = container.getChildren(monitor);
        @Override
     */
                return parts;
                @Nullable SQLQueryWordEntry filterOrNull
import org.eclipse.jface.text.BadLocationException;

                SQLQueryCompletionContext completionContext = this;
        @NotNull
            Set<DBSEntityAttribute> tupleAttributes = this.extractRealAttributes(this.relatedContext.getColumnsList());
            }
        @Nullable DBCExecutionContext dbcExecutionContext,
                        }
            }
            @NotNull
import java.util.stream.Stream;
             *                       [filter word]
        @Override
                this.collectImmediateChildren(
        static SQLQueryDataContextInfo makeFor(@NotNull SQLQueryRowsDataContext rowsDataContext) {
            return Collections.emptyList();
    }
                    expectedTypes.add(DBSTable.class);
                .stream().filter(r -> tables.contains(r.tableOrNull)).findFirst().orElse(null);
                                    score, word, rc, context.getKnownSources().getResolutionResults().get(rc.source), true
                            case VALUE, FUNCTION -> {

                                    ));
                        }
                                        deepestContext.getKnownSources(),
                    exposedContexts.add(container);
            ) {
            private SQLQueryCompletionItem.ContextObjectInfo prepareContextInfo(@NotNull SQLCompletionRequest request, @NotNull List<SQLQueryWordEntry> prefix, @Nullable SQLQueryWordEntry tail, @NotNull DBSObject contextObject) {
                            List.of(container),
                        Collection<DBSObjectContainer> containers = this.obtainDefaultContext(monitor, request);
            return Collections.emptyList();

            for (
                            nameNodes.getFirst().getRealInterval().a > lexicalItem.getSyntaxNode().getRealInterval().a ||

 * Unless required by applicable law or agreed to in writing, software
                }
                    }).filter(Objects::nonNull);
                    }
                @NotNull List<SQLQueryCompletionSet> completionSets
                    expectedTypes.add(DBSSequence.class);
import org.jkiss.dbeaver.model.struct.*;
                );
                @NotNull List<SQLQueryCompletionSet> results
        }
            @NotNull
                    }
            }
                } else if (prefixContext instanceof DBSObjectContainer container) {

            public SQLQueryDataContextInfo getDataContext() {
        static SQLQueryDataContextInfo makeFor(@NotNull SQLQueryRowsSourceContext rowsSourceContext) {
            public Collection<SQLQueryCompletionSet> prepareProposal(
                        knownSources,
                        if (memberTypes.size() == 1 && (memberTypes.contains(RelationalObjectType.TYPE_UNKNOWN) || memberTypes.isEmpty())) {
                        monitor,
     * Returns contexts participating in identifiers resolution
                        makeFilteredCompletionSet(filterOrNull, prepareTupleColumns(
                    .collect(Collectors.groupingBy(
                    return new SQLQueryCompletionItem.ContextObjectInfo(prefixString, contextObject, false);
                            Map.Entry::getKey, g -> g.getValue().stream().map(rc -> {
            return Optional.ofNullable(this.findAssociationsInfo(monitor, key.getParentObject()).associationsByAttribute.get(key))
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObject,
            this.relatedContext = this.context.getRelatedContext() == null ? this.context : this.context.getRelatedContext();
                if ((lexicalItem instanceof SQLQuerySymbolEntry && (
                @NotNull DBRProgressMonitor monitor,
                @NotNull List<SQLQueryCompletionSet> results
                AssociationsResolutionContext associations = this.getAssociationsContext(monitor, this.deepestContext, filterOrNull);

                        sourceAliasMatch = false;
     */
                LinkedList<SQLQueryCompletionItem> byAliasItems = new LinkedList<>();
                    this.accomplishFromKnownOrigin(monitor, request, context.symbolsOrigin(), null, completionSets);
                Collection<DBSObjectContainer> objectContainers = container;
                    @Override
                    if (object instanceof DBSEntity entity) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.jkiss.dbeaver.DBException;
        }
                @NotNull SQLQueryDataContextInfo context,
            ) {
        }
            return Optional.ofNullable(this.findAssociationsInfo(monitor, key.getParentObject()).associationsByAttribute.get(key))
                }
        return new SQLQueryCompletionContext(0, requestOffset) {
                        return List.of(defaultSchema);
    }

            return Collections.emptyList();
            @NotNull
                    }
                if (syntaxInspectionResult.expectingColumnReference() || syntaxInspectionResult.expectingColumnName()) {
        public List<? extends SQLQueryResultColumn> getLeftParentColumnsList() {
                        null, filterOrNull, sequenceItems

                    expectedTypes.add(DBSAlias.class);
        int position = offset - scriptItem.offset;
                    } else {
    @NotNull
                                        }
                @NotNull List<SQLQueryCompletionSet> results

                        this.associationsResolutionContext = new AssociationsResolutionContext(monitor, context, filterOrNull)
                }
            }
                } else if (context.symbolsOrigin() != null) {
            }
        }
                        contextObjext,
            ) {
                @NotNull SQLQuerySymbolOrigin origin,
import org.jkiss.code.NotNull;
        private final SQLQuerySourcesInfoCollection subquerySources;
        @NotNull
                @NotNull List<SQLQueryCompletionSet> results
    @NotNull
            if (this.relatedContextInfoProvider == null) {
             *     dbName.schemaName.something|
        }
                String lineText;
                    this.prepareInspectedFreeCompletions(monitor, request, completionSets);
        @Override
                @NotNull List<SQLQueryCompletionSet> results
            }
        }
                                    byAliasItems.addLast(SQLQueryCompletionItem.forSubsetColumn(nameScore, key, c, rr, false));
import org.jkiss.dbeaver.model.sql.SQLDialect;
                        if (origin.isIncludingRowsets()) {
                        filterOrNull
                    )) || (lexicalItem instanceof SQLQueryTupleRefEntry e &&  e.getSyntaxNode().getRealInterval().b + 1 != position)
        @Nullable STMTreeNode currentTerm
                @NotNull SQLQueryDataContextInfo context,
                @NotNull SQLCompletionRequest request,
                    DBSCatalog defaultCatalog = defaults.getDefaultCatalog();
        @NotNull
                @NotNull DBSObject prefixContext,
    public Set<DBSObjectContainer> getExposedContexts() {
                        setContextInfo(contextInfo);
                return item;
        @NotNull Set<String> keywords,
                Interval wordRange = currentTerm.getRealInterval();
        @Override
                        false,
                @NotNull SQLQuerySourcesInfoCollection knownSources,
                        try {
                                }
                        accumulator

                .orElse(Collections.emptySet());
                            List.of(container),
                                if (rightColumn.realAttr != null) {

                @NotNull List<SQLQueryCompletionSet> results
                    }
                        SQLQueryRowsDataContext tupleSource = origin.getReferencedSource() != null
                        placeholder.getTextContent()
                        null,
                    public void visitExpandableRowsTupleRef(SQLQuerySymbolOrigin.ExpandableRowsTupleRef origin) {
                return items;
                if (lexicalItem instanceof SQLQueryTupleRefEntry tupleRef) {
        public List<? extends SQLQueryResultColumn> getLeftParentColumnsList() {
                LinkedList<SQLQueryCompletionItem> items = new LinkedList<>();
             *                          |
                            request,
                    public void visitDbObjectFromDbObject(SQLQuerySymbolOrigin.DbObjectFromDbObject origin) {
                    && position <= scriptItem.item.getOriginalText().length()
import org.jkiss.code.Nullable;

                }

                            items
        @NotNull
                if (getRequestOffset() - getOffset() == placeholderInterval.b + 1) {
                            if (parts.get(j).equalsIgnoreCase(prefix.get(i).filterString)) { // TODO consider comparison mode here
                            for (DBSProcedure p : procedures) {
                }
        @NotNull LSMInspections.SyntaxInspectionResult syntaxInspectionResult,
            }
                }
        private final SQLQueryRowsDataContext rowsDataContext;
                    o -> o instanceof DBSTable || o instanceof DBSView,
        LinkedList<SQLQueryCompletionItem> items = new LinkedList<>();
                    log.error(e);
                    );
                AssociationsResolutionContext associations = this.getAssociationsContext(monitor, this.deepestContext, filterOrNull);

            @Override
                    }
        }
 * DBeaver - Universal Database Manager
                return Collections.emptySet();
                    ) {
            ) {


             * based on existing prefix resolved for a certain database object:
     * Gather and prepare the information of the completion request
    ) {
                                            ).getFilterInfo();
            }
                    this.prepareNonPrefixedColumnCompletions(monitor, request, this.deepestContext, null, completionSets);
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObjext,
                                    tableRefs.add(SQLQueryCompletionItem.forRowsSourceAlias(score, sourceAlias, rr.aliasOrNull, rr, false));
                        switch (origin.getFilterMode()) {

                        // TODO Consider identifiers containing escape-sequences

                    if (quoteStrs != null && quoteStrs.length > 0) {
                } else {
        @NotNull

                                return Pair.of(targetAttr, sourceAttr);
                            int score = childName.matches(filterOrNull, this.searchInsideWords);
import java.util.stream.Collectors;
        @Nullable SQLQueryWordEntry filterOrNull,
                                    filterOrNull
            }
                                        deepestContext.getKnownSources(),
                    syntaxInspectionResult,
                @Nullable SQLQueryCompletionItem.ContextObjectInfo prefixInfo,
                    item = SQLQueryCompletionItem.forProcedureObject(score, childName, contextObjext, p);
                            if (nameScore > 0) {
            } catch (DBException e) {
            ) {
        };
            ) {
    private final int requestOffset;
                        if (nameScore > 0) {
                return object -> expectedTypes.stream().anyMatch(expectedTypeClass -> expectedTypeClass.isAssignableFrom(object.getClass()))
                        );
                                        prefix,
        static final SQLQuerySourcesInfoCollection EMPTY_SOURCES_COLLECTION = new SQLQuerySourcesInfoCollection() {
                return SQLQueryCompletionContext.prepareOffquery(scriptItem.offset, offset);
                    this.collectImmediateChildren(
     */

                    .flatMap(a -> this.findAssociatedEntities(monitor, a.realAttr).stream())
                            }
                                    accomplishTableReferences(
            private static Predicate<DBSObject> makeObjectForValueRefFilterPredicate(
                            break;
                // if (nameNodes.isEmpty()
                        List<? extends DBSEntityAttribute> attrs = entity.getAttributes(monitor);
                    this.preparePrefixedColumnCompletions(context, prefix, tail, results);
        @NotNull

                LinkedList<SQLQueryCompletionItem> result = new LinkedList<>();
                if (contextObject instanceof DBSObjectContainer container) {
                boolean useAbsoluteName
                SQLQueryLexicalScopeItem lexicalItem = context.lexicalItem();
                @Nullable SQLQueryWordEntry filterOrNull,
                    @Override
                    this.tryApplyOriginContext();
                    }
                    .flatMap(Collection::stream) // don't remove flatMap here, it exposes elements of the Optional collection!
                if (prefix.size() > 0) { // table-ref-prefixed column
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryTupleRefEntry;
     * Prepare a set of completion proposal items for a given position in the text of the script item
                    );
                                int score = childName.matches(filterOrNull, this.searchInsideWords);

                @NotNull SQLCompletionRequest request,
                        int score = aliasName.matches(filterOrNull, this.searchInsideWords);
                if (keywordsAllowed) {
        return new SQLQueryCompletionContext(scriptItemOffset, requestOffset) {
    public abstract LSMInspections.SyntaxInspectionResult getInspectionResult();
                }
import org.jkiss.dbeaver.model.DBUtils;
                    .filter(c -> c instanceof DBSTableForeignKey fk)
                    expectedTypes.add(DBSTable.class);


                List<SQLQueryWordEntry> parts,

                        o -> o instanceof DBSSequence,

            }
    private record EntityAssociationsInfo(
                if (this.columnNameConflicts == null) {
                        for (int i = prefix.size() - 1, j = parts.size() - 1; i >= 0 && j >= 0; i--, j--) {
                        sourceFullnameMatch = false;

            }

                            items.addLast(SQLQueryCompletionItem.forSubsetColumn(nameScore, key, c, currentTableSource, false));
                            prefixObject,
                List<? extends SQLQueryCompletionItem> resultItems;
                this.allAssociatedEntitiesOfColumnsList = this.relatedContext.getColumnsList().stream()
                try {
                } else if (scriptItem.item.getOriginalText().length() <= SQLQueryCompletionContext.getMaxKeywordLength()
                @NotNull List<SQLQueryCompletionSet> results
            ) throws DBException {
                @NotNull Collection<DBSObjectContainer> contexts,

        private Set<DBSEntity> getAssociatedEntitiesOfColumnsList(@NotNull DBRProgressMonitor monitor) {
                for (SourceResolutionResult rr : knownSources.getResolutionResults().values()) {
                List<SQLQueryWordEntry> parts = new ArrayList<>(nameNodes.length);
                            return null;
        public Set<DBSEntityAttribute> findAssociatedAttributes(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityAttribute key) {
                SourceResolutionResult currentTableSource = knownTables.get(prefixContext);
                List<SQLQueryWordEntry> parts = this.obtainIdentifierParts(position);

                    && this.associationsResolutionContext.context == context
            @Override
                @NotNull SQLCompletionRequest request,
            }
                        && dbcExecutionContext.getDataSource() instanceof DBSObjectContainer container
            private List<SQLQueryCompletionItem> accomplishQualifiedValueReferences(
                @NotNull SQLCompletionRequest request,
                    if (request.getContext().isSearchProcedures()) {
                                if (sourceFullnameMatch) {
                        && objectTypes.stream().anyMatch(t -> DBSProcedure.class.isAssignableFrom(t.getTypeClass()))
                    this.accomplishFromKnownOriginOrFallback(monitor, request, entry.getOrigin(), null, parts, results);
        @NotNull
                }
                @NotNull DBRProgressMonitor monitor,
        @Override

                @NotNull SQLQueryDataContextInfo dataContext,
 *
                @Nullable SQLQueryWordEntry filterOrNull
            Set<DBSEntityAttribute> tupleAssociations = tupleAttributes.stream()
    ) {
                }
                }
                    if (prefix.size() == 1) {
    }

                    public void visitColumnNameFromRowsData(SQLQuerySymbolOrigin.ColumnNameFromRowsData origin) {
            }
                for (DBSObjectContainer container : containers) {
                                        filterOrNull
                    expectedTypes.add(DBSCatalog.class);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
                return Collections.emptyMap();
                            knownSources,
        SQLQueryModel model = scriptItem.item.getQueryModel();

                    }
                    expectedTypes.add(DBSCatalog.class);
            public Set<DBSEntity> getReferencedTables() {
                    log.error(ex);
                            filterOrNull,
                        @NotNull SQLQueryCompletionItem.ContextObjectInfo prefix,
                                }
                int score,
        private final SQLQueryRowsSourceContext rowsSourceContext;

        public EntityAssociationsInfo findAssociationsInfo(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity table) {
                                        default -> RelationalObjectType.TYPE_UNKNOWN;
            /**
            DBPDataSource dataSource = dbcExecutionContext.getDataSource();
                    );

            @Nullable
            }
                                    prepareContextSchemasAndCatalogs(monitor, contexts, prefix, filterOrNull, results);


            public Set<String> getAliasesInUse() {
            }
                SQLQueryCompletionItem item;
                @NotNull DBRProgressMonitor monitor,
             * referencing relevant entity for the value expression context
                        if (procedures != null) {
                String currentPart = currentNode == null
import org.jkiss.dbeaver.model.struct.rdb.*;
                }

            }
            public LSMInspections.SyntaxInspectionResult getInspectionResult() {
                    @Override
                @NotNull SQLCompletionRequest request,
                    if (rr.tableOrNull != null) {
                @NotNull SQLCompletionRequest request,

                    }
                                items.addLast(this.makeDbObjectCompletionItem(score, filter, null, o));
                            "",
                                    results
                @NotNull DBRProgressMonitor monitor,
                        @NotNull Set<DBSObjectType> memberTypes
                        .collect(Collectors.joining(", "));
    private static class SQLQueryRowsSourceContextInfo implements SQLQueryDataContextInfo {
                    public void visitRowsDataRef(@NotNull SQLQuerySymbolOrigin.RowsDataRef rowsDataRef) {
            @NotNull
                }
        static SQLQueryDataContextInfo empty() {
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObjext,
                @NotNull SQLQueryDataContextInfo context,
                    );
                }
        SQLQuerySourcesInfoCollection getKnownSources();
        @Override
    private record EntityAssociationTargetsInfo(
                                            result.addLast(
                    }
                    syntaxInspectionResult = inspections.prepareAbstractSyntaxInspection(nameInspectionResult.positionToInspect());
                        findAllSchemaContainers(monitor, defaultCatalog, result);
                        this.makeFilteredCompletionSet(prefix.isEmpty() ? tail : prefix.get(0), items, results);
                            }
                    lineStartOffset = -1;
            @NotNull
            List<DBSEntity> tables = rowsSourceContext.getConnectionInfo().findRealTables(monitor, tableName);
                        }
                            Pair::getSecond,
                @NotNull SQLCompletionRequest request,
                        );
                    public void visitSyntaxBasedFromRowsData(SQLQuerySymbolOrigin.SyntaxBasedFromRowsData origin) {
            return false;


                        SQLQueryWordEntry mayBeAliasName = prefix.get(0);
                @Nullable SQLQueryWordEntry filterOrNull,

            return () -> this;
        @Override
                                    filterOrNull,
        @NotNull Set<DBSEntityAttribute> allAssociatedAttributes
            @NotNull
                    scriptItem,
                            completions.add(SQLQueryCompletionItem.forRowsSourceAlias(
                    } else if (defaultSchema != null) {
                        } else {
        SourceResolutionResult resolveSource(DBRProgressMonitor monitor, List<String> s);
                @NotNull SQLQuerySourcesInfoCollection knownSources,
                        contextName,
                    this.prepareLexicalItemCompletions(monitor, request, lexicalItem, position, parts, completionSets);
                @NotNull DBRProgressMonitor monitor,
                }
                LSMInspections inspections = new LSMInspections(dialect, syntaxNode);
                    this.accomplishFromKnownOriginOrFallback(monitor, request, entry.getOrigin(), namePart, parts, results);
                    // already referenced tables
import org.jkiss.dbeaver.model.sql.SQLConstants;
                        setContextInfo(contextInfo);
                .map(t -> t.entities)
        boolean hasPeriod,
            }
                        String qp = Stream.of(quoteStrs).flatMap(ss -> Stream.of(ss)).map(Pattern::quote).distinct().collect(Collectors.joining("|"));
                    this.accomplishFromKnownOrigin(monitor, request, origin, originBasedFilterOrNull, results);
                @NotNull SQLCompletionRequest request,
                    IDocument doc = request.getDocument();
                                        case TABLE -> RelationalObjectType.TYPE_TABLE;
                    // TODO consider compound keys and filtered by the common path to the context of origin
                @Nullable SQLQueryWordEntry filterOrNull
                @NotNull LinkedList<SQLQueryCompletionItem> accumulator
        @NotNull SQLQueryModel.LexicalContextResolutionResult context,
            @Override
        private Supplier<SQLQueryDataContextInfo> relatedContextInfoProvider = null;

                        log.error(e);
                if (tail != null) {

            return this.isJoin() ? this.rowsDataContext.getJoinInfo().left().getColumnsList() : Collections.emptyList();
                        placeholderInterval.a,
                            }
                this.prepareKeywordCompletions(statementStartKeywords, filter, results);
    };
        @Nullable
        @NotNull Map<DBSEntityAttribute, EntityAssociationTargetsInfo> associationsByAttribute,
                @Nullable SQLQuerySymbolOrigin origin,
                                        knownSources.getReferencedTables().contains(o),
                        for (String fname : request.getContext().getDataSource().getSQLDialect().getFunctions()) {

                    Set<Class<?>> expectedTypes = new HashSet<>();
                @NotNull DBRProgressMonitor monitor,
            ) {
                    int inLineOffset = this.getRequestOffset() - lineStartOffset;
                @NotNull Collection<DBSObjectContainer> containers,

                                int score = word.matches(filterOrNull, searchInsideWords);
            public LSMInspections.SyntaxInspectionResult getInspectionResult() {
                            if (score > 0) {

                        // so we should remove potential quotes.
        @NotNull
            if (sourceAttributes.stream().anyMatch(tupleAssociations::contains)) {
            private List<SQLQueryCompletionItem> accomplishTableReferences(
                if (child instanceof DBSProcedure p) {
        private final SQLQueryDataContextInfo context;
                            parts.add(new SQLQueryWordEntry(term.getRealInterval().a, term.getTextContent()));
    ) {
                    } else if (defaultCatalog != null && request.getContext().isSearchGlobally()) {
                        tail = new SQLQueryWordEntry(tail.offset, tail.string.replaceAll(qp, ""));
            @Override
                if (request.getContext().isSearchProcedures()) {
                        }
                return List.of(new SQLQueryCompletionSet(getRequestOffset(), 0, Collections.emptyList()));
                @NotNull SQLCompletionRequest request,

import java.util.regex.MatchResult;
            }
                            SQLQueryWordEntry key = makeFilterInfo(tail, c.symbol.getName());
                    }
                @NotNull LinkedList<SQLQueryCompletionItem> accumulator
                    public void visitColumnRefFromReferencedContext(SQLQuerySymbolOrigin.ColumnRefFromReferencedContext origin) {

            ) {
                            for (SQLQueryResultColumn rightColumn : context.getRightParentColumnsList()) {
                contextObject = contextObject.getParentObject()
                @NotNull DBRProgressMonitor monitor,

                .collect(Collectors.toSet());
                return subsetColumns.toList();
                    return SQLQueryCompletionContext.prepareOffquery(scriptItem.offset, offset);
                    DBSSchema defaultSchema = defaults.getDefaultSchema();
                                        monitor,
                        return result;
        }
        @Override
            ) {
                @NotNull SQLQueryDataContextInfo context,
                @NotNull DBRProgressMonitor monitor,
            if (dataSource instanceof DBSObjectContainer container) {
                    .filter(a -> a.realAttr != null)
                } else if (syntaxInspectionResult.expectingIdentifier()) {
                            String filterKeyString = lineText.substring(m.start(), m.end()).toLowerCase();

            private void prepareTableCompletions(
                    } catch (DBException e) {
                                return Pair.of(sourceAttr, targetAttr);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    if (defaultCatalog == null && defaultSchema == null
                this.deepestContext = contextInfo;
             */

                .flatMap(a -> this.findAssociatedAttributes(this.associationPresenceResolutionMonitor, a).stream())
                return realAttrs.stream().anyMatch(tableAssociations.allAssociatedAttributes::contains);
                            int score = filter.matches(componentNamePart, this.searchInsideWords);
                @NotNull List<SQLQueryWordEntry> prefix,
    public static SQLQueryCompletionContext prepareEmpty(int scriptItemOffset, int requestOffset) {
                @NotNull Collection<DBSObjectContainer> contexts,

import org.jkiss.dbeaver.model.DBPDataSource;
            private void prepareInspectedIdentifierCompletions(@NotNull DBRProgressMonitor monitor,
                }  else if (this.nameNodesAreUseful(parts)) {
                            monitor,

import org.jkiss.dbeaver.model.stm.STMTreeTermErrorNode;
                                    ),
            }
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObjext,
                        SQLQueryDataContextInfo contextInfo = SQLQueryDataContextInfo.makeFor(rowsDataRef.getRowsDataContext());
                        };
import java.util.function.Predicate;
                

            @NotNull
                        if (!DBUtils.isHiddenObject(child) && (filter == null || filter.test(child))) {

            }
                    int prefixStart = prefix.get(0).offset;
                Set<DBSEntityAttribute> allAssociatedAttributes = associatedAttributes.values().stream()
                            if (member.column() != null) {
                    resultItems = subsetColumns;
        return statementStartKeywordMaxLength;
                                makeFilteredCompletionSet(

                Stream<? extends SQLQueryCompletionItem> subsetColumns = dataContext.getColumnsList().stream()
        protected Supplier<SQLQueryDataContextInfo> prepareRelatedContextInfoProvider() {

    /**
                @Nullable SQLQueryWordEntry filterOrNull
                            score, filterKey, rc, knownSources.getResolutionResults().get(rc.source), useAbsoluteName
        }
                                    accumulator.addLast(SQLQueryCompletionItem.forRealTable(
                            if (sourceAttr.getParentObject() == entity) {
    @FunctionalInterface
    /**
            private List<SQLQueryCompletionItem> prepareJoinConditionCompletions(
                    /**
                @NotNull Set<DBSObjectType> objectTypes,
        @NotNull
            }
                Matcher m = KEYWORD_FILTER_PATTERN.matcher(lineText);
                                    }
                        o -> o instanceof DBSProcedureContainer,
import java.util.*;
            if (score > 0) {
                    // lexicalItem is identifier (not an isolated Period character) outside nameNodes (actually, WTF?!)
                    }
    private static final Set<String> statementStartKeywords = LSMInspections.prepareOffquerySyntaxInspection().predictedWords();
                return this.deepestContext;
                                                leftScore >= rightScore ? leftColumnRef : rightColumnRef
                        this.collectImmediateChildren(
                while (def instanceof SQLQuerySymbolEntry entry) {
                            SQLQueryDataContextInfo.makeFor(origin.getRowsSource().source.getRowsDataContext()),
             *
        @Nullable
                @NotNull List<SQLQueryCompletionSet> results
                                    accomplishQualifiedValueReferences(

            ) {
    }
                    String columnListString = prepareTupleColumns(contextInfo, null, true)
            @NotNull
import java.util.function.Function;
                    SQLQueryWordEntry placeholderEntry = new SQLQueryWordEntry(
                                );
                @NotNull Collection<DBSObjectContainer> containers,
            ) {
                                        results
                return this.columnNameConflicts.get(name);
            private void prepareTupleRefExpansionCompletiom(
                }
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                                int score = childName.matches(filterOrNull, this.searchInsideWords);
            ) throws DBException {
        @Nullable
                } else if (syntaxInspectionResult.expectingTableReference()) {
                    objectContainers = this.obtainDefaultContext(monitor, request);
            ) {
                            monitor,
                                filterOrNull,
            private static final LSMInspections.SyntaxInspectionResult syntaxInspectionResult = LSMInspections.prepareOffquerySyntaxInspection();


                                if (origin.getObject() instanceof DBSObjectContainer c) {
                    .flatMap(t -> t.attributes.stream())


                    && LSMInspections.matchesAnyWord(scriptItem.item.getOriginalText())
            SQLQueryWordEntry filterWord = makeFilterInfo(filterOrNull, s);
                @NotNull DBRProgressMonitor monitor,
import org.antlr.v4.runtime.misc.Interval;
        @NotNull SQLDialect dialect
                @NotNull SQLQueryDataContextInfo context,
                                memberTypes,
        public boolean hasRelatedAssociationsWithTable(@NotNull DBSEntity table) {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;

                    }
                    .collect(Collectors.toUnmodifiableSet());
                                            SQLQueryWordEntry matchedWord = (
            @Override
import java.util.function.Supplier;
        @NotNull
                Set<DBSEntity> allAssociationTargets = associatedAttributes.values().stream()

                    this.collectProcedures(monitor, request, objectContainers, null, filterOrNull, proceduresItems);
        @Override
                                ),
            public Set<DBSObjectContainer> getExposedContexts() {
                if (origin != null) {
                    if (request.getContext().isSearchProcedures() && container instanceof DBSProcedureContainer pc
                                            var rightColumnRef = SQLQueryCompletionItem.forSubsetColumn(

        private final DBRProgressMonitor associationPresenceResolutionMonitor;
        @NotNull DBSEntity entity,

        int offset,
                                        int rightScore = rightWord.matches(filterOrNull, searchInsideWords);
 * You may obtain a copy of the License at
        if (dbcExecutionContext != null) {
                    boolean sourceFullnameMatch;
                    ) {
                                            var leftColumnRef = SQLQueryCompletionItem.forSubsetColumn(
                int position,
                }
                        SQLQueryWordEntry key = makeFilterInfo(filterOrNull, c.symbol.getName());
            @NotNull
                        : Collections.emptyList();
                @NotNull SQLQuerySourcesInfoCollection knownSources,

                                if (child instanceof DBSEntity o && (child instanceof DBSTable || child instanceof DBSView)) {
                @NotNull DBRProgressMonitor monitor,
            @NotNull
        @Override
                        SQLQueryCompletionItem.ContextObjectInfo prefixInfo = this.prepareContextInfo(request, prefix, tail, prefixObject);
                try {
        @NotNull
            return this.subquerySources;
                
        public final SQLQueryDataContextInfo getRelatedContext() {
                    log.error(ex);
                @NotNull SQLCompletionRequest request,
    @NotNull
                                            );
            }
                    return SQLQueryCompletionContext.prepareEmpty(scriptItem.offset, offset);
            private void prepareContextSchemasAndCatalogs(
                        }
            }

 * Licensed under the Apache License, Version 2.0 (the "License");
                    @Override
        return this.scriptItemOffset;
                ) {
                SQLQueryWordEntry filter = null;
                @NotNull SQLQuerySourcesInfoCollection knownSources,
import org.jkiss.dbeaver.model.stm.STMTreeNode;
                @NotNull SQLCompletionRequest request
                    }
                    // do nothing
                                        prefix,
    protected SQLQueryWordEntry makeFilterInfo(@Nullable SQLQueryWordEntry filterKey, @NotNull String filterString) {
                @NotNull SQLQuerySourcesInfoCollection knownSources,
                    @Override
    }
            ) {
        @NotNull
 *
                completionSets.removeIf(c -> c == null || c.getItems().isEmpty());
                                )
                    expectedTypes.add(DBSSchema.class);
                        knownSources,
    @NotNull
                @NotNull List<SQLQueryWordEntry> parts,
                        (DBSObjectContainer) dbcExecutionContext.getDataSource(),
            Set<DBSEntityAttribute> sourceAttributes = this.extractRealAttributes(source.getRowsDataContext().getColumnsList());
            private void collectPackages(
            }

                                );
 */
                        )
                    AssociationsResolutionContext associations = this.getAssociationsContext(monitor, context, filterOrNull);
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObjext,
                        setContextInfo(contextInfo);
                    List<SQLQueryExprType.SQLQueryExprTypeMemberInfo> members = compositeType.getNamedMembers(monitor);
                @Nullable SQLQueryWordEntry filterOrNull,
    public abstract Collection<SQLQueryCompletionSet> prepareProposal(
                    log.error(ex);
                        )
                }

                    lexicalItem = null;
    public Set<String> getAliasesInUse() {
        public List<? extends SQLQueryResultColumn> getRightParentColumnsList() {
                if (syntaxInspectionResult.expectingColumnReference()) {
            public Set<String> getAliasesInUse() {
                                            int score = Math.max(leftScore, rightScore);
            @Override
                @NotNull DBRProgressMonitor monitor,
                LSMInspections.NameInspectionResult nameInspectionResult = inspections.collectNameNodes(position);
            ) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                SQLQueryDataContextInfo defaultContext = this.deepestContext;
            return this.relatedContextInfoProvider.get();
            }
                @Nullable SQLQueryWordEntry filterOrNull,
            @NotNull
                            prepareObjectCompletions(

            }
                    return SQLQueryCompletionContext.prepareOffquery(scriptItem.offset, offset);
    ) {
                return SQLQueryDataContextInfo.empty();
                        .collect(Collectors.toUnmodifiableMap(
                : (
                }
        @NotNull List<SQLQueryCompletionSet> results
                                }
    private static final Set<SQLQuerySymbolClass> potentialKeywordPartClassification = Set.of(
        @NotNull
    );
                @NotNull DBRProgressMonitor monitor,
            return new SQLQueryRowsSourceContextInfo(rowsSourceContext);
                return nameNodes.length > 0 && (parts.size() > 1 || (parts.size() == 1 && parts.get(0) != null));

        return new SQLQueryWordEntry(filterKey == null ? -1 : (this.getOffset() + filterKey.offset), filterString);
                } catch (DBException ex) {
            ) {
        public Set<DBSEntity> findAssociatedEntities(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityAttribute key) {
}
                                results
                    item = SQLQueryCompletionItem.forDbSchemaObject(score, childName, contextObjext, child);
                                            );
                exposedContexts.add(container);
                origin.apply(new SQLQuerySymbolOrigin.Visitor() {
                    this.setContextInfo(SQLQueryDataContextInfo.makeFor(rowsSourceOrigin.getRowsSourceContext()));
                                    filterOrNull,
                List<SQLQueryCompletionSet> completionSets = new LinkedList<>();
                    contextObjext, filterOrNull, accumulator
             *    [prefixContext] [objFromObj origin of the member access entry]
        }
        }
                    for (int i = 0; i < mr.groupCount(); i++) {
            ) {
            ) {
                    this.prepareInspectedIdentifierCompletions(monitor, request, parts, completionSets);
            */
                @Nullable List<DBSObjectContainer> container,
        @NotNull
                } catch (DBException ex) {
                        accomplishMemberReference(monitor, origin.getType(), filterOrNull, results);
                    && (!(object instanceof DBSView || object instanceof DBSTable) || knownTables.containsKey(object));
                if (resolutionResults.size() > 1 && context.isJoin()) {
                    this.accomplishTableReference(monitor, request, defaultContext, prefix, tail, results);
                            SQLQueryWordEntry childName = makeFilterInfo(filterOrNull, child.getName());
                return this.nearestContext.getKnownSources().getAliasesInUse();
                        }

                Set<Class<?>> expectedTypes,
                    );
                LinkedList<SQLQueryCompletionItem> items = new LinkedList<>();
                @Nullable SQLQueryWordEntry filterOrNull,
                @NotNull DBSObject prefixContext,
    private static class SQLQueryRowsDataContextInfo extends SQLQueryRowsSourceContextInfo {
                        );
                                        .collect(Collectors.toUnmodifiableSet())
                                int score = tableName.matches(filterOrNull, this.searchInsideWords);
                @Nullable SQLQueryWordEntry originBasedFilterOrNull,
        @NotNull
 * you may not use this file except in compliance with the License.
                    .map(aa -> (DBSTableForeignKeyColumn) aa.getFirst())

                    expectedTypes.add(DBSView.class);
                        .collect(Collectors.toMap(Map.Entry::getKey, kv -> kv.getValue().size() > 1));
                EntityAssociationsInfo tableAssociations = this.findAssociationsInfo(this.associationPresenceResolutionMonitor, table);
            ) throws DBException {
            }

                            if (container != null) {

        public SQLQueryDataContextInfo getRelatedContext() {
                    : currentNode.getTextContent().substring(0, position - currentNode.getRealInterval().a);
                    this.makeFilteredCompletionSet(prefix.get(0), byFullNameItems, results);
                        context.getKnownSources(),
    private class AssociationsResolutionContext {
        int replacementPosition = filterOrNull == null ? this.getRequestOffset() : this.getOffset() + filterOrNull.offset;

                        .filter(rc -> rc.realAttr != null && rc.realAttr.getParentObject() == rc.realSource)
    }
                // ) {
            private LinkedList<SQLQueryCompletionItem> prepareSequencesCompletions(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
     */
                @NotNull List<SQLQueryWordEntry> parts,
                    this.prepareNonPrefixedColumnCompletions(monitor, request, context, tail, results);
                        if (attrs != null) {
            @NotNull
                    Interval nameRange = entry.getSyntaxNode().getRealInterval();
                        expectedTypes.add(DBSProcedure.class);
                @Nullable Predicate<DBSObject> filter,
                try {
                } else if (prefix.isEmpty()) {
                SQLQuerySourcesInfoCollection knownSources = dataContext.getKnownSources();
            }
 * limitations under the License.
                                    byFullNameItems.addLast(SQLQueryCompletionItem.forSubsetColumn(nameScore, key, c, rr, true));
                        int score = itemKey.matches(filterOrNull, searchInsideWords);
                    }
                        log.error(e);
            ) {
                    lineText = "";
                                    List<DBSObjectContainer> contexts = List.of(objectContainer);
            return new SQLQueryRowsDataContextInfo(rowsDataContext);
                if ((syntaxInspectionResult.expectingColumnName() || syntaxInspectionResult.expectingColumnReference())
                            prefixInfo,
    ) {
        List<? extends SQLQueryCompletionItem> items,
                                        monitor,
                    SQLQueryWordEntry namePart = new SQLQueryWordEntry(nameRange.a, entry.getRawName().substring(0, position - nameRange.a));
                    })
                        setContextInfo(contextInfo);
                        && request.getContext().getDataSource().getInfo().supportsStoredCode()
                        if (term.getRealInterval().b + 1 < position) {
        }
            return Collections.emptyList();
                }
        }
                } catch (DBException ex) {
    @NotNull
                    }
            }
                            if (obj instanceof DBSObjectContainer child && (obj instanceof DBSCatalog || obj instanceof DBSSchema)) {
        @Override
        return Collections.emptySet();
        @Nullable DBCExecutionContext executionContext,
                    throw new UnsupportedOperationException("Unexpected lexical item kind to complete " + lexicalItem.getClass().getName());
                                    contextInfo.getKnownSources(),

                        }
                                    monitor,
                    this.prepareKeywordCompletions(syntaxInspectionResult.predictedWords(), currentWord, completionSets);
        @Nullable
                    .filter(Objects::nonNull)
                for (DBSObjectContainer container : containers) {
                    this.realColumnRefsByEntityAttribute = this.context.getColumnsList().stream()

                LinkedList<SQLQueryCompletionItem> completions = new LinkedList<>();
                            true
            }
                            filterOrNull,
            }
                STMTreeNode syntaxNode = model.getSyntaxNode();
    public static SQLQueryCompletionContext prepareOffquery(int scriptItemOffset, int requestOffset) {
                    }
            private void collectProcedures(
        @Nullable
                            components = attrs;
    protected boolean searchInsideWords;
                } else {
                STMTreeNode placeholder,
            }
            @Override
        List<? extends SQLQueryResultColumn> getLeftParentColumnsList();
             *     dbName.schemaName.|
            private void accomplishFromKnownOriginOrFallback(

                try {
    }
                                item = SQLQueryCompletionItem.forSpecialCompositeField(score, itemKey, member);

    private static final SQLQueryDataContextInfo EMPTY_DATA_CONTEXT_INFO = new SQLQueryDataContextInfo() {
                    return;
                if (currentTerm == null) {
                                if (origin.getObject() instanceof DBSObjectContainer c) {

        @Override
        public List<? extends SQLQueryResultColumn> getRightParentColumnsList() {

        @NotNull
                            filterOrNull,
        private EntityAssociationsInfo prepareAllAssociations(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity) {
                            : origin.getRowsDataContext();

            public SQLQueryDataContextInfo getDataContext() {
                            makeFilteredCompletionSet(
    public static SQLQueryCompletionContext prepare(

                this.makeFilteredCompletionSet(filterOrNull, completions, results);
                if (currentTableSource != null) {
                        for (DBSObject child : children) {
                    } else {
                }
                if (nameInspectionResult.positionToInspect() != position) {
                                accumulator.addLast(SQLQueryCompletionItem.forBuiltinFunction(score, childName, fname));
                }
                @Nullable SQLQueryWordEntry filterOrNull,
            return false;
            @NotNull DBSEntityAttribute attr
                    nameNodes.toArray(STMTreeNode[]::new),
                                        request,
                                    prefix.object(),
                                    results
        }
                // directly available column
        public boolean isJoin() {
                        // TODO Consider force identifier quotation (see testQuotedNamesCompletion)

                        this.collectImmediateChildren(
        @Override
                        }

            }
                        DBSEntityAttribute targetAttr = attrRef.getReferencedColumn();
            if (this.allAssociatedEntitiesOfColumnsList == null) {
                        } else {
                                        contexts,
                this.prepareContextSchemasAndCatalogs(monitor, this.exposedContexts, null, filterOrNull, results);
    @NotNull
                @NotNull DBRProgressMonitor monitor,
                            prefixInfo,
    public abstract SQLQueryDataContextInfo getDataContext();
            private Collection<DBSObjectContainer> obtainDefaultContext(
                                    accumulator.addLast(SQLQueryCompletionItem.forProcedureObject(score, childName, contextObjext, p));

        int replacementLength = this.getRequestOffset() - replacementPosition;
            /**
                .collect(Collectors.toSet());
                );
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
/*
                if (dbcExecutionContext != null) {
                    this.makeFilteredCompletionSet(componentNamePart, items, results);
        public AssociationsResolutionContext(

                                }
                .collect(Collectors.toSet());
                    }
            }
            private void prepareObjectComponentCompletions(
            private AssociationsResolutionContext associationsResolutionContext = null;
                    if (sourceAliasMatch || sourceFullnameMatch) {
            }
                    Set<Class<?>> expectedTypes = new HashSet<>();
            private Map<String, Boolean> columnNameConflicts = null;
                @Nullable SQLQueryCompletionItem.ContextObjectInfo contextObjext,

        public List<SQLQueryResultColumn> getColumnsList() {
                @NotNull List<SQLQueryCompletionSet> results
                            }
        @NotNull SQLScriptItemAtOffset scriptItem,
     */
                            var leftRels = associations.findAssociatedAttributes(monitor, leftColumn.realAttr);
            }
                for (; i < nameNodes.length; i++) {
        @Nullable SQLQueryLexicalScopeItem lexicalItem,
                @NotNull DBSObjectContainer container,
                        prepareTupleRefExpansionCompletiom(origin.getPlaceholder(), contextInfo, request, completionContext, monitor, results);
                                            );
                    lineText = doc.get(lineStartOffset, lineInfo.getLength());
            * Prepare list of completion items intended to accomplish sequence object name
                    Math.min(position, model.getSyntaxNode().getRealInterval().b + 1)
                ? null
    }
                @Nullable SQLQueryWordEntry filterOrNull,
                } catch (BadLocationException ex) {
                            case DEFAULT -> this.prepareDefaultObjectCompletion(prefix, origin.getMemberTypes());
                    }
                    }
    public static SQLQueryCompletionContext prepareCompletionContext(
                LSMInspections.SyntaxInspectionResult syntaxInspectionResult = inspections.prepareAbstractSyntaxInspection(position);
                        int partsMatched = 0;
                            )
    }
        }
                Interval placeholderInterval = placeholder.getRealInterval();
            }
                                    DBSObjectType objectTypesToPropose = switch (origin.getFilterMode()) {
            @Nullable
                // First keyword handling, when there is no query model
                @NotNull DBRProgressMonitor monitor,
                    List<String> contextName = prefix.stream().map(e -> e.string).collect(Collectors.toList());
                    } catch (DBException e) {
                                item = SQLQueryCompletionItem.forSubsetColumn(score, itemKey, member.column(), null, false);
            Set<DBSEntityAttribute> realAttrs = this.extractRealAttributes(this.relatedContext.getColumnsList());
                parts.add(currentPart == null ? null : new SQLQueryWordEntry(currentNode.getRealInterval().a, currentPart));
    private static Set<DBSObjectContainer> obtainExposedContexts(@Nullable DBCExecutionContext dbcExecutionContext) {

                    return new SQLQueryWordEntry(wordRange.a, currentTerm.getTextContent().substring(0, position - currentTerm.getRealInterval().a));
        public List<SQLQueryCompletionItem.SQLColumnNameCompletionItem> getRealColumnRefsByEntityAttribute(
                ) {
                try {
            return this.rowsDataContext.getColumnsList();
                @Nullable List<DBSObjectContainer> container,
    /**
                        if (score > 0) {
                }
                @NotNull SQLCompletionRequest request,
    protected void prepareKeywordCompletions(
                        contexts,
                                );
                                accomplishTableReferences(
                }
                        filterOrNull,
                    for (DBSObject o : components) {
                if (wordRange.b >= position - 1 && ((currentTerm instanceof STMTreeTermNode t && t.symbol.getType() != SQLStandardLexer.Period) || currentTerm instanceof STMTreeTermErrorNode)) {
                        SQLQuerySourcesInfoCollection knownSources = rowsSourceRef.getRowsSourceContext().getKnownSources(false);
                                monitor,
            Set<DBSEntityAttribute> sourceAssociations = sourceAttributes.stream()
                        ? this.prepareJoinConditionCompletions(monitor, context, filterOrNull)
                    }
             *                |     |
            return EMPTY_SOURCES_COLLECTION;
        }
                            components = Collections.emptyList();

                    }
                if (lexicalItem != null) {
                }
import org.jkiss.dbeaver.model.sql.semantics.context.*;
                            ? origin.getReferencedSource().source.getRowsDataContext()
    private static final int statementStartKeywordMaxLength = statementStartKeywords.stream().mapToInt(String::length).max().orElse(0);
                Map<DBSObject, SourceResolutionResult> knownTables
            }
        }
        @NotNull
                            }
                @Nullable SQLQueryWordEntry tail,
                    }
                            default -> throw new UnsupportedOperationException("Unexpected filter mode: " + origin.getFilterMode());
                @NotNull SQLQuerySourcesInfoCollection knownSources,
        @NotNull STMTreeNode[] nameNodes,
                        .collect(Collectors.groupingBy(c -> c.symbol.getName())).entrySet().stream()
        return false;
