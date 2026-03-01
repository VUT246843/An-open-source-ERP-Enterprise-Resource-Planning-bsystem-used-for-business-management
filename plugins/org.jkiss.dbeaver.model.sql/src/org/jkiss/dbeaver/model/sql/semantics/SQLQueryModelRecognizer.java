 */
        } else {
                            periodNode = null;
                    DBDPseudoAttribute[] pc = pac.getAllPseudoAttributes(this.recognitionContext.getMonitor());
                    STMTreeNode valueRefNode = head.findFirstChildOfName(STMKnownRuleNames.valueReference);
                if (symbolEntry.isNotClassified() && this.reservedWords.contains(symbolEntry.getRawName().toUpperCase())) {
        List<STMTreeNode> refs = STMUtils.expandSubtree(

                        List<SQLQueryValueExpression> children = childLists.pop();

                    }
            while (prefix != null && !prefix.parts.isEmpty()) {
                        SQLQueryObjectDropModel.recognize(this, stmtBodyNode, RelationalObjectType.TYPE_PROCEDURE, Collections.emptySet());
        return result != null ? result : new SQLQueryValueFlattenedExpression(node, Collections.emptyList());

            if (maybeColumn.isNotClassified() && !tryFallbackForStringLiteral.test(maybeColumn)) {
        STMKnownRuleNames.referencedTableAndColumns,
                    }
import org.jkiss.dbeaver.model.sql.semantics.model.ddl.SQLQueryTableDropModel;
                ? this.collectValueExpression(n, scope)
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardLexer;
                }
                invalidPartsCount = 0;
            }
            case SQLStandardParser.RULE_callStatement -> SQLQueryCallModel.recognize(this, queryNode, RelationalObjectType.TYPE_PROCEDURE);
            case SQLStandardParser.RULE_characterStringLiteral -> this.makeValueConstantExpression(node, SQLQueryExprType.STRING);
                tail = valueRef.parts.subList(1, valueRef.parts.size());
    }
        };
                        entityAliasAction.accept(entityAlias);
                            rn = rn.findFirstNonErrorChild();
    public SQLQuerySymbolEntry collectIdentifier(@NotNull STMTreeNode node, @Nullable STMTreeNode periodNode) {

                            SQLQueryValueVariableExpression.VariableExpressionKind.BATCH_VARIABLE,
                if (exprScopeHolder != null) {
                    }
        }
            }
                    log.debug("Ambiguous columnNameList collection at " + node.getNodeName());
                STMTreeNode stmtBodyNode = queryNode.findFirstNonErrorChild();
            symbolEntries.clear();
                globalPseudoColumns,
        }
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
            String rawString = s.getRawName();

    }
                            periodNode = null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        // TODO handle callNode.hasErrorChildren()
                    SQLQueryComplexName tableName = this.collectTableName(ref, forceUnquotted);
            if (forced) {
                case 0 -> {
                true
                } else if (varExprNode != null) {
                                for (int i = children.size() - 1; i >= 0; i--) {
        SQLQuerySymbolEntry entry = new SQLQuerySymbolEntry(syntaxNode, name, rawName, memberAccessEntry);
            for (SQLQuerySymbolEntry column : tail) {
            SQLQuerySymbolEntry entityName = this.collectIdentifier(qualifiedNameNode.getChildNode(0), forceUnquotted, null);
        );
                    return Collections.emptyList();
        }
            default -> throw new UnsupportedOperationException("Unknown expression kind " + node.getNodeName());
            case SQLStandardParser.RULE_directSqlDataStatement -> {
                    invalidPartsCount++;

                STMTreeNode varExprNode = node.findFirstNonErrorChild();
        if (identifierTextNode.getPayload() instanceof Token t && t.getType() == SQLStandardLexer.Quotted) {
                columnAlias -> { },
                        STMTreeNode periodNode = step.findLastChildOfName(STMKnownRuleNames.PERIOD_TERM);
                            SQLQuerySymbolOrigin.DbObjectFilterMode.DEFAULT,
    }
                        }
    
            }
    
    ) {

                        SQLQueryInsertModel.recognize(this, stmtBodyNode);
        STMKnownRuleNames.correlationSpecification,
                }
            case SQLStandardParser.RULE_variableExpression -> {
                                columnAction.accept(c);
                    name = new SQLQueryComplexName(term, List.of(nameEntry), 0, null);
        if (identifierTextNode == null) {
        STMKnownRuleNames.constraintName
        return new SQLQueryModel(tree, null, this.symbolEntries, this.lexicalItems.values().stream().toList());
    public static SQLQueryModel recognizeQuery(@NotNull SQLQueryRecognitionContext recognitionContext, @NotNull String queryText) {
                            childLists.peek().add(e);
                        }
        public final SQLQueryLexicalScope lexicalScope;
    ) {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        SQLQueryValueExpression result = switch (node.getNodeKindId()) {
        @NotNull
        if (queryNode == null) {
                        : s -> SQLQuerySemanticUtils.prepareResultPseudoColumnsList(this.dialect, s, null, rowsetsPc.stream());
            default -> null;
        this.dialect = recognitionContext.getDialect();
 * Responsible for semantics model preparation based on the parsing result
    public SQLQueryComplexName collectQualifiedName(@NotNull STMTreeNode node) {
        STMTreeNode nameNode = callNode.findFirstChildOfName(STMKnownRuleNames.functionCallTargetName);
                        SQLQueryDeleteModel.recognize(this, stmtBodyNode);
                        if (!children.isEmpty()) {
                            } else {
                            slicingFlags[i] = step.findFirstChildOfName(STMKnownRuleNames.valueRefIndexingStepSlice) != null;
            String actualIdentifierString = SQLUtils.identifierToCanonicalForm(dialect, rawIdentifierString, forceUnquotted, false);
                            SQLQueryValueVariableExpression.VariableExpressionKind.CLIENT_VARIABLE,
import org.jkiss.dbeaver.model.lsm.LSMAnalyzer;
    }
            scope.registerItem(item);
        STMKnownRuleNames.checkConstraintDefinition
        SQLQueryLexicalScope scope = this.currentLexicalScopes.peekLast();
                    case SQLStandardParser.RULE_dropViewStatement ->
                return null;
    );
        STMKnownRuleNames.valueExpression,

            }
    public static SQLQuerySymbolClass tryFallbackSymbolForStringLiteral(
            case SQLStandardParser.RULE_valueExpressionPrimary -> {
                    STMTreeNode partNode = qualifiedNameNode.getChildNode(i);
    private SQLQueryModelRecognizer(@NotNull SQLQueryRecognitionContext recognitionContext) {

                    default -> null;
    private static final Set<String> knownRecognizableValueExpressionNames = Set.of(
                    log.debug("Value reference expression expected while facing with " + head.getNodeName());
                    null,
                Interval range = new Interval(rangeStart, step.getRealInterval().b);
            log.debug("identifier expected while facing with " + identifierNode.getNodeName());
                    case SQLStandardParser.RULE_createTableStatement ->
                        columnAction.accept(columnRef.getColumnName());
                            }
            expr = switch (head.getNodeKindId()) {
        // its configuration is already static internally and shared between all instances avoiding repeated initialization
            STMTreeNode actualNameNode = nameNode.findFirstChildOfName(STMKnownRuleNames.qualifiedName);
                        SQLQueryTableDropModel.recognize(this, stmtBodyNode, true);
        this.currentLexicalScopes.removeLast();
                : this.registerScopeItem(new SQLQueryMemberAccessEntry(periodNode));
    public List<SQLQuerySymbolEntry> collectColumnNameList(@NotNull STMTreeNode node) {
            Map<String, SQLQueryResultPseudoColumn> globalPseudoColumns = Stream.of(basicSQLDialect.getGlobalVariables())
            STMTreeNode n = value == null ? null : value.findFirstNonErrorChild();
                        ? s -> Collections.emptyList()

                        }

    /**

                while (!stack.isEmpty()) {
                            expectingName = true;
    

            if (!columnNameListWrapperNames.contains(node.getNodeName())) {
                }
        STMKnownRuleNames.exceptTerm,
                    if (tableName != null) {
                }
        return scope;
                if (term != null) {
                stack.add(node);
            SQLQueryModelRecognizer.this.endScope(this.lexicalScope);
                    } else {
                rowsetPseudoColumns
        STMKnownRuleNames.insertColumnsAndSource,
        LinkedList<SQLQueryComplexName> allValueRefs = new LinkedList<>();
            }
                                this.registerSymbolEntry(node, name, varExprNode.getTextContent(), null),
                    if (endingMemberAccessEntry != null) {
            if (actualNameNode != null) {
import org.jkiss.code.Nullable;
                            a.setDefinition(b.getDefinition());
     *  3. classify suffixes of these complex-names as columns
        
    private final SQLDialect dialect;
    }
                        SQLQueryUpdateModel.recognize(this, stmtBodyNode);
                                    ? child

                        }
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        SQLQueryMemberAccessEntry memberAccessEntry = periodNode == null ? null : this.registerScopeItem(new SQLQueryMemberAccessEntry(periodNode));
    ) {
            }
        STMKnownRuleNames.insertStatement,
                                SQLQueryValueVariableExpression.VariableExpressionKind.CLIENT_PARAMETER,
                                childLists.peek().add(this.collectKnownValueExpression(rn, scope));
        STMTreeNode queryNode = tree.findFirstNonErrorChild();
    }
                                node,
                case SQLStandardParser.RULE_valueRefNestedExpr -> {
        this.lexicalItems.put(item.getSyntaxNode().getRealInterval().a, item);
        STMKnownRuleNames.tableName,
                    };
        if (nameNode != null) {
        return forcedClass;
        Predicate<SQLQuerySymbolEntry> tryFallbackForStringLiteral = s -> {
                return Collections.emptyList();
        }
                                varExprNode.getTextContent()

        LinkedList<SQLQuerySymbolEntry> allMaybeColumns = new LinkedList<>();
                            }
        STMSource querySource = STMSource.fromString(text);
                (columnName) -> allColumnNames.add(columnName.getName()),
import org.jkiss.dbeaver.model.sql.semantics.model.ddl.SQLQueryTableAlterModel;
    );
    );
        STMKnownRuleNames.viewColumnList,
                            STMTreeNode markNode = varExprNode.findLastNonErrorChild();
                if (varExprNode instanceof STMTreeTermNode varExprTermNode) {
 *
                    } else {
    public SQLQueryRowsTableDataModel collectTableReference(@NotNull STMTreeNode node, boolean forDDL) {
        if (qualifiedNameNode.getChildCount() == 1 && !qualifiedNameNode.hasErrorChildren()) {
                    }
                            if (part != null) {
                        STMTreeNode content = stack.pop();
        }
                }
            for (int i = 1; i < subnodes.size(); ) {
                        STMTreeNode memberNameNode = step.findLastChildOfName(STMKnownRuleNames.identifier);
     *  4. classify tails of these complex-names as complex-type members
        @NotNull Consumer<SQLQueryComplexName> valueRefAction,
                                SQLQueryValueVariableExpression.VariableExpressionKind.CLIENT_PARAMETER,
            STMTreeNode head = subnodes.get(0);
                    if (expectingName) {
     *
                        nameParts.add(namePart);
                allTableNames.put(entityName, entityName);
                        // TODO register unexpected pieces in the lexical scope
                            }
                maybeColumn.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);
                STMTreeNode term = nameNode.findFirstNonErrorChild();

                case '\'' -> SQLQuerySymbolClass.STRING;
                ? null
        return this.collectTableName(node, false);
                    String nameString = term.getTextContent();
        STMKnownRuleNames.characterSetName,
    );
        @NotNull Consumer<SQLQueryComplexName> entityAction,

                    case SQLStandardParser.RULE_createViewStatement -> null;

        @NotNull STMTreeNode root,
import org.jkiss.dbeaver.Log;

                }
        public void close() {
import java.util.*;

                log.debug("columnNameList (or its wrapper) expected while facing with " + node.getNodeName());
    }
            }
                        valueRefAction.accept(valueRef.getName());
 *

                            log.debug("Unsupported term variable expression: " + node.getTextContent());
        SQLQueryModelContent contents = switch (queryNode.getNodeKindId()) {
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;
                    break;

                                endingMemberAccessEntry = new SQLQueryMemberAccessEntry(periodNode);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;
    @NotNull
        List<STMTreeNode> actual = STMUtils.expandSubtree(node, tableNameContainers, actualTableNameContainers);
        STMKnownRuleNames.columnIndex
            );

                }
import org.jkiss.dbeaver.model.stm.*;

                }

                        }
            }
     * Fallback when no model:
        STMKnownRuleNames.naturalJoinTerm,
                }

        if (scope != null) {
                    if (n != null) {
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryTupleRefEntry;
                            objectNameOrigin,
                STMTreeNode step = subnodes.get(i);
            // not canonicalizing the identifier because it is quoted,

    
import org.jkiss.dbeaver.model.sql.SQLDialect;
        this.currentLexicalScopes.addLast(scope);
                } else {
                        columnAction.accept(columnName);
                for (int i = 0; i < qualifiedNameNode.getChildCount(); i++) {
            boolean forced = forcedClass != null;
            try {
                Stack<List<SQLQueryValueExpression>> childLists = new Stack<>();
            case SQLStandardParser.RULE_functionCallExpression -> this.collectFunctionCall(node, scope, false);

        );
                    v.description()
        if (this.recognitionContext.useRealMetadata()
            case SQLStandardParser.RULE_selectStatementSingleRow -> {
                } else {
                this.dialect,
        List<SQLQuerySymbolEntry> nameParts;
                        for (SQLQuerySymbolEntry part : entityName.parts) {
                new SQLIdentifierDetector(this.dialect),
                    };
        STMKnownRuleNames.namedColumnsJoin,
        SQLQueryLexicalScope scope = new SQLQueryLexicalScope();
    );
                            log.debug("Unsupported variable expression: " + node.getTextContent());
        STMKnownRuleNames.joinSpecification,


                } catch (DBException e) {
                    case SQLStandardParser.RULE_valueRefMemberStep -> {
                    default -> this.collectQueryExpression(tree);

            SQLQueryMemberAccessEntry memberAccessEntry = periodNode == null
    }
                Stack<STMTreeNode> stack = new Stack<>();
    private static final Set<String> identifierDirectWrapperNames = Set.of(
            case SQLStandardParser.RULE_signedNumericLiteral -> this.makeValueConstantExpression(node, SQLQueryExprType.NUMERIC);
                        STMTreeNode rn = n;
            // but the QUOTED class will be assigned later after db entity resolution fail
                    exprScopeHolder.close();;
            invalidPartsCount = 0;
    private SQLQuerySymbolEntry registerSymbolEntry(
                        if (partNode.getNodeName().equals(STMKnownRuleNames.PERIOD_TERM)) {
import org.jkiss.dbeaver.model.sql.SQLConstants;
        for (STMTreeNode argNode : argNodes) {
     */
        Set<String> allTableAliases = new HashSet<>();
            } else {
                        if (partNode.getNodeName().equals(STMKnownRuleNames.PERIOD_TERM)) {
                        case SQLStandardParser.RULE_anonymouseParameter -> {
            return new SQLQueryConnectionRealContext(
            static LazyExpr of(SQLQueryValueExpression expr) {
    }
                            yield null;
            
import org.jkiss.dbeaver.model.sql.semantics.model.ddl.SQLQueryObjectDropModel;
    private SQLQueryValueExpression collectValueReferenceExpression(@NotNull STMTreeNode node, boolean rowRefAllowed) {
    private SQLQueryComplexName collectTableName(@NotNull STMTreeNode node, boolean forceUnquotted) {
        }
            }
    private final LinkedList<SQLQueryLexicalScope> currentLexicalScopes = new LinkedList<>();
        if (!node.getNodeName().equals(STMKnownRuleNames.columnNameList)) {
            && this.executionContext != null
            Function<SQLQueryRowsSourceModel, List<SQLQueryResultPseudoColumn>> rowsetPseudoColumns;
                }
            allMaybeColumns::add,
                            ) {
    @Nullable
        STMTreeRuleNode tree = analyzer.parseSqlQueryTree(querySource, new STMSkippingErrorListener());
            );
        STMKnownRuleNames.datetimeLiteral,
                    } else if (expr instanceof SQLQueryValueReferenceExpression valueRef && valueRef.getName() != null) {
                if (entityName.isNotClassified() || !tryFallbackForStringLiteral.test(entityName.parts.getLast())) {

                        }
                        int s = i;
    private final TreeMap<Integer, SQLQueryLexicalScopeItem> lexicalItems = new TreeMap<>();
            return new SQLQueryModel(tree, null, Collections.emptySet(), Collections.emptyList());
                    new SQLQuerySymbol(v.name()),
                }
                allTableAliases.add(aliasEntry.getName().toLowerCase());

        }
        } else {
                .map(v -> new SQLQueryResultPseudoColumn(
        SQLQueryRowsSourceContext rootRowsContext = new SQLQueryRowsSourceContext(connectionContext);
            }
                                || rn.getNodeName().equals(STMKnownRuleNames.valueExpressionPrimary)
                    );
            }
        STMKnownRuleNames.unsignedNumericLiteral,
                        case '@' -> new SQLQueryValueVariableExpression(
                    case SQLStandardParser.RULE_dropProcedureStatement ->
    public <T extends SQLQueryLexicalScopeItem> T registerScopeItem(T item) {
            && this.executionContext.getDataSource().getSQLDialect() instanceof BasicSQLDialect basicSQLDialect
        STMKnownRuleNames.queryName
                            );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            Set<List<String>> allTableNames = new HashSet<>();

                return result;
                            yield new SQLQueryValueVariableExpression(
        STMKnownRuleNames.characterSetSpecification,
import org.jkiss.dbeaver.model.lsm.sql.dialect.LSMDialectRegistry;
        STMKnownRuleNames.intersectTerm,
        STMKnownRuleNames.correspondingSpec,
                            periodNode = partNode;
                            this.registerSymbolEntry(node, rawName.substring(1), rawName, null),
                if (exprScopeHolder != null) {
            } finally {
        STMKnownRuleNames.schemaName,
                        SQLQueryTableCreateModel.recognize(this, stmtBodyNode);
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
            List<SQLQuerySymbolEntry> tail;
            switch (ref.getNodeKindId()) {
                    // if non-reserved by parser keyword was not classified as identifier, then highlight it as reserved by dialect
        if (expr != null && subnodes.size() > 1) {
        boolean isQuotedIdentifier = dialect.isQuotedIdentifier(symbolEntry.getRawName());
                forcedClass = SQLQuerySymbolClass.STRING;
        STMKnownRuleNames.createTableStatement,
                };
import java.util.stream.Collectors;
                this.recognitionContext.validateFunctions(),
        SQLQueryConnectionContext connectionContext = this.prepareConnectionContext(tree);
        STMKnownRuleNames.uniqueColumnList,
            case SQLStandardParser.RULE_valueReference -> this.collectValueReferenceExpression(node, false);
        return new SQLQueryComplexName(node, nameParts, invalidPartsCount, endingMemberAccessEntry);

                                part.getSymbol().setSymbolClass(SQLQuerySymbolClass.TABLE);
                                List<STMTreeNode> children = rn.findNonErrorChildren();
            } else {
                                stack.push(n);
        @NotNull STMTreeNode syntaxNode,
                }
            return new SQLQueryValueTupleReferenceExpression(head, name, memberAccessEntry, tupleRefEntry);

                // TODO collect CTE for insert-update-delete as well as recursive CTE
        if (tupleRefNode == null) {
                        while (rn != null && rn.getChildCount() == 1 && !knownRecognizableValueExpressionNames.contains(rn.getNodeName())) {
                            if (c != null) {
        STMTreeNode identifierNode = identifierDirectWrapperNames.contains(node.getNodeName())
                    // (keywords are uppercased in dialect)
                            node,
            }
        return new SQLQueryValueConstantExpression(node, node.getTextContent(), type);
     *  1. collect and classify all name identifier (FROMs), classify them as [cat.][<sch.>...]<tab>
                default -> throw new IllegalArgumentException("Unexpected value: " + ref.getNodeName());
    }
    private final Set<String> reservedWords;
                s.getSymbol().setSymbolClass(forcedClass);
                        SQLQuerySymbolEntry memberName = memberNameNode == null ? null : this.collectIdentifier(memberNameNode, periodNode);
        }
    public LexicalScopeHolder openScope() {
        STMKnownRuleNames.insertColumnList
                boolean expectingName = true;
        }
        // TODO log query model collection error
        STMKnownRuleNames.truthValue,
    private void endScope(SQLQueryLexicalScope scope) {
            Set.of(STMKnownRuleNames.columnReference, STMKnownRuleNames.columnName, STMKnownRuleNames.tableName, STMKnownRuleNames.correlationName)
    public class LexicalScopeHolder implements AutoCloseable {
                                }
            SQLQueryValueExpression expr = n != null

            return null;
        if (name == null) {
            return tree == null ? null : new SQLQueryModel(tree, null, Collections.emptySet(), Collections.emptyList());
            }
                    yield null;
                            namePart = this.collectIdentifier(partNode, forceUnquotted, periodNode);
            }
import org.jkiss.dbeaver.model.sql.semantics.model.expressions.*;
            },
        char quoteChar = symbolEntry.getRawName().charAt(0);
    @Nullable
import org.jkiss.dbeaver.model.sql.semantics.context.*;
        STMKnownRuleNames.explicitTable,
        } else if (!identifierNode.getNodeName().equals(STMKnownRuleNames.identifier)) {
                    SQLQuerySymbolEntry columnName = this.collectIdentifier(ref, forceUnquotted, null);
                            periodNode = null;
        Map<SQLQueryComplexName, SQLQueryComplexName> allTableNames = new HashMap<>();
                            this.recognitionContext,
            return collectKnownValueExpression(node, scope);
                    }
        SQLQueryComplexName name;
        STMKnownRuleNames.tableName
        LSMAnalyzer analyzer = LSMDialectRegistry.getInstance().getAnalyzerFactoryForDialect(this.dialect)
            return this.registerSymbolEntry(identifierTextNode, actualIdentifierString, rawIdentifierString, memberAccessEntry);
        }
        this.reservedWords = new HashSet<>(this.dialect.getReservedWords());
            root,
     *  2. classify all their entries as complex-name prefixes
                            this.registerSymbolEntry(node, mark, mark, null);
                };
                        SQLQueryMemberAccessEntry memberAccessEntry = memberName != null ? memberName.getMemberAccess() : this.registerScopeItem(new SQLQueryMemberAccessEntry(periodNode));
                STMTreeNode valueExprNode = node.findFirstChildOfName(STMKnownRuleNames.valueExpressionAtom);
        this.registerScopeItem(entry);
import org.jkiss.dbeaver.model.sql.semantics.model.dml.SQLQueryUpdateModel;
    @Nullable
            model.resolveRelations(rootRowsContext, this.recognitionContext);
        STMKnownRuleNames.correlationName,
                    }
                        yield subexpr;

                    STMTreeNode n = stack.pop();
            expr = null;
        STMTreeNode tupleRefNode = head.findLastChildOfName(STMKnownRuleNames.tupleRefSuffix);
        STMTreeNode qualifiedNameNode = qualifiedNameDirectWrapperNames.contains(node.getNodeName())
    @NotNull
import java.util.function.Function;
                            rootRowsContext,
                            String mark = markNode == null ? SQLConstants.QUESTION : markNode.getTextContent();
                    }
                    for (int i = 0; i < prefix.parts.size(); i++) {
    private void classifySymbolsWithoutModel(
            aliasEntry -> {
    }

                        SQLQuerySemanticUtils.performPartialResolution(
        };
 */
            }
                try {
            Set<String> allColumnNames = new HashSet<>();
                    nameParts.add(null);
            }
        STMKnownRuleNames.authorizationIdentifier,

        } else if (!qualifiedNameNode.getNodeName().equals(STMKnownRuleNames.qualifiedName)) {
                    case SQLStandardParser.RULE_updateStatement ->
                            node,
        @Nullable SQLQueryMemberAccessEntry memberAccessEntry
        }
        if (contents != null) {
        } else {
                default -> {


        STMTreeNode identifierTextNode = actualIdentifierNode.findFirstNonErrorChild();
        int invalidPartsCount;
                        entityAction.accept(tableName);
    }

                yield stmtBodyNode == null ? null : switch (stmtBodyNode.getNodeKindId()) {
            STMTreeNode value = argNode.findFirstNonErrorChild();
                aliasEntry.getSymbol().setSymbolClass(SQLQuerySymbolClass.TABLE_ALIAS);
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
                        }
        if (!knownValueExpressionRootNames.contains(node.getNodeName())) {
        // expression mapper is a stateful thing, so it cannot be reused for multiple subtrees and should be local only
                        SQLQuerySymbolEntry namePart;
        public LexicalScopeHolder(@NotNull SQLQueryLexicalScope scope) {

                        yield LazyExpr.of(new SQLQueryValueMemberExpression(range, node, expr.getExpression(true), memberName, memberAccessEntry));
        STMTreeNode actualIdentifierNode = identifierNode.findLastChildOfName(STMKnownRuleNames.actualIdentifier);
            log.debug("Search condition or value expression expected while facing with " + node.getNodeName());
                            }
import org.jkiss.dbeaver.model.sql.semantics.model.dml.SQLQueryCallModel;
        @NotNull Consumer<SQLQuerySymbolEntry> columnAction,
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        }
        } else { // Don't have active connection, use dummy context
            }
        ) {
    }
        STMTreeNode nameNode = head.findFirstChildOfName(STMKnownRuleNames.qualifiedName);
            return null;
                root,
    @NotNull
            return new SQLQueryConnectionDummyContext(this.dialect, allColumnNames, allTableNames);
                    case SQLStandardParser.RULE_valueRefIndexingStep -> {
    @NotNull
                nameParts = Collections.singletonList(entityName);
        return this.collectIdentifier(node, false, periodNode);
    @NotNull
                            if (periodNode != null && endingMemberAccessEntry == null) {
                    yield switch (varExprNode.getNodeKindId()) {
        STMKnownRuleNames.havingClause,
                tail = valueRef.parts.subList(prefix == null ? 0 : prefix.parts.size(), valueRef.parts.size());
        
     * Set the query symbol class to the quoted identifier, depends on the quote type
                    SQLQuerySymbolEntry nameEntry = this.registerSymbolEntry(term, canonicalNameString, nameString, null);
 * DBeaver - Universal Database Manager
                    column.getSymbol().setSymbolClass(SQLQuerySymbolClass.COLUMN);
                    yield valueRefNode == null ? null : b -> this.collectValueReferenceExpression(valueRefNode, b);
     */
                            a.setOrigin(b.getOrigin());
    @Nullable
        STMKnownRuleNames.referencingColumns,
    private final Set<SQLQuerySymbolEntry> symbolEntries = new HashSet<>();
        if (this.currentLexicalScopes.peekLast() != scope) {
        boolean forceUnquotted
            argExprs.add(expr);
    private static final Set<String> knownValueExpressionRootNames = Set.of(
    @Nullable
    @NotNull
        return item;
    }
        @Override
        this.recognitionContext = recognitionContext;
            }
            SQLQueryTupleRefEntry tupleRefEntry = asteriskNode == null ? null : new SQLQueryTupleRefEntry(asteriskNode);
    public SQLQueryValueExpression collectValueExpression(@NotNull STMTreeNode node, @Nullable SQLQueryLexicalScope scope) {
                    symbolEntry.getSymbol().setSymbolClass(SQLQuerySymbolClass.RESERVED);
    private static final Log log = Log.getLog(SQLQueryModelRecognizer.class);
                SQLQueryValueExpression result = roots.isEmpty()
        };
    public SQLQueryValueExpression collectKnownValueExpression(@NotNull STMTreeNode node, @Nullable SQLQueryLexicalScope scope) {
                                varExprNode.getTextContent()
                forcedClass = tryFallbackSymbolForStringLiteral(this.dialect, s, false);
            case SQLStandardParser.RULE_columnIndex -> this.makeValueConstantExpression(node, SQLQueryExprType.NUMERIC);
            // entry.getSymbol().setSymbolClass(SQLQuerySymbolClass.QUOTED);
                }
            return forced;
            true
            } else {
            }
                    yield switch (rawName.charAt(0)) {
            null,
 * See the License for the specific language governing permissions and
        STMKnownRuleNames.nonjoinedTableReference,
                            if (a.isNotClassified()) {
    @Nullable
        LazyExpr expr;
            return null;
        } else {

    @Nullable
        STMKnownRuleNames.groupByClause,
                        }
        }
            SQLQueryValueExpression getExpression(boolean rowRefAllowed);
                name = this.collectQualifiedName(actualNameNode);
                case SQLStandardParser.RULE_tableName -> {
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;
        STMKnownRuleNames.joinColumnList,
                if (valueExprNode == null) {
                    result.registerLexicalScope(exprScopeHolder.lexicalScope);
            case SQLStandardParser.RULE_datetimeLiteral -> this.makeValueConstantExpression(node, SQLQueryExprType.DATETIME);
        }
                valueRef -> { },
                STMTreeNode stmtBodyNode = queryNode.findLastNonErrorChild();
                case SQLStandardParser.RULE_columnReference -> {
    }
                yield stmtBodyNode == null ? null : this.collectQueryExpression(tree);

                rowsetPseudoColumns = s -> Collections.emptyList();
        @NotNull SQLQueryConnectionContext connectionContext,
            },

        for (STMTreeNode ref : refs) {
                    yield null;
            throw new IllegalStateException();
                valueRef.parts.getFirst().getSymbol().setSymbolClass(SQLQuerySymbolClass.TABLE_ALIAS);
        var objectNameOrigin = new SQLQuerySymbolOrigin.DbObjectRef(

                : new SQLQueryValueFlattenedExpression(argNode, Collections.emptyList());
                        entityAction.accept(tupleRef.getTableName());


            case SQLStandardParser.RULE_sqlSchemaStatement -> {
        }
                    ? new SQLQueryValueFlattenedExpression(node, Collections.emptyList())
    public SQLQueryComplexName collectTableName(@NotNull STMTreeNode node) {
        } else {

    private static final Set<String> qualifiedNameDirectWrapperNames = Set.of(

package org.jkiss.dbeaver.model.sql.semantics;
    /**
                            yield null;
                default -> {
                        if (a != null && b != null) {
        STMKnownRuleNames.unionTerm,
        STMKnownRuleNames.signedNumericLiteral,

                        boolean[] slicingSpec = Arrays.copyOfRange(slicingFlags, s, i);
            return null;
import org.jkiss.dbeaver.model.sql.semantics.model.dml.SQLQueryInsertModel;
    }
            log.debug("qualifiedName expected while facing with " + node.getNodeName());
/*
                if (expectingName) { // qualified name ends with PERIOD_TERM, so it is incomplete
            LexicalScopeHolder exprScopeHolder = scope != null ? null : this.openScope();
                expr = switch (step.getNodeKindId()) {
            }
    }
                            SQLQueryValueExpression e =
        STMKnownRuleNames.selectTargetItem,
            } else {
        if ((!isQuotedIdentifier && (quoteChar == '"' || quoteChar == '`' || quoteChar == '\''))
                }
                            SQLQuerySymbolClass.OBJECT
            } else {
                    if (entityAlias != null) {
                    this.recognitionContext.appendError(root, "Failed to obtain global pseudo-columns information", e);
        SQLQueryModelRecognizer recognizer = new SQLQueryModelRecognizer(recognitionContext);
            return model;
        return entry;
                            namePart = null;
        return new SQLQueryRowsTableDataModel(node, this.collectTableName(node), forDDL);
                    } else {
 * limitations under the License.
        }
                        if (rn != null) {
    }
            switch (actual.size()) {
                default -> null;
}
            ? node.findFirstChildOfName(STMKnownRuleNames.identifier)
            || (isQuotedIdentifier && !isColumnResolved)) {
                    String canonicalNameString = SQLUtils.identifierToCanonicalForm(dialect, nameString, false, false);
            .createAnalyzer(LSMAnalyzerParameters.forDialect(this.dialect, this.recognitionContext.getSyntaxManager()));
                } else {
        } else {
    private SQLQueryComplexName collectQualifiedName(@NotNull STMTreeNode node, boolean forceUnquotted) {
        STMKnownRuleNames.createViewStatement,
            if (this.dialect.isQuotedString(rawString)) {
        if (subnodes.size() > 0) {
            int rangeStart = node.getRealInterval().a;
        return new SQLQueryValueFunctionExpression(callNode, name, argExprs, forRows);
                        yield LazyExpr.of(new SQLQueryValueIndexingExpression(range, node, expr.getExpression(false), slicingSpec));
    @Nullable
        SQLQueryComplexName name = this.collectQualifiedName(nameNode);
        STMKnownRuleNames.searchCondition,
        }
                }
            for (SQLQuerySymbolEntry symbolEntry : this.symbolEntries) {
import org.jkiss.dbeaver.DBException;
            List<STMTreeNode> actual = STMUtils.expandSubtree(node, columnNameListWrapperNames, Set.of(STMKnownRuleNames.columnNameList));
            .map(n -> this.collectIdentifier(n, null)).toList();
        classifySymbolsWithoutModel(connectionContext, tree, tryFallbackForStringLiteral, rootRowsContext);
                    } else if (expr instanceof SQLQueryValueColumnReferenceExpression columnRef) {
                            }
                childLists.push(new ArrayList<>(1));
                    DBDPseudoAttribute.PropagationPolicy.GLOBAL_VARIABLE,
            SQLQueryComplexName prefix = valueRef;
                yield stmtBodyNode == null ? null : switch (stmtBodyNode.getNodeKindId()) {
    ) {
                            entityName,
                }
                        } else {
                        i++;
        for (SQLQuerySymbolEntry maybeColumn : allMaybeColumns) {
                        yield new SQLQueryValueTypeCastExpression(node, subexpr, typeName);
    private static final Set<String> actualTableNameContainers = Set.of(

    }
                                childLists.push(new ArrayList<>(children.size()));
     * Provides the semantic model for the provided text
        @NotNull String name,
                    null,
            if (this.executionContext.getDataSource() instanceof DBDPseudoAttributeContainer pac) {
            nameParts = new ArrayList<>(qualifiedNameNode.getChildCount());
                        for (; i < subnodes.size() && (step = subnodes.get(i)).getNodeKindId() == SQLStandardParser.RULE_valueRefIndexingStep; i++) {
        STMKnownRuleNames.uniqueConstraintDefinition,
                        }
        } else {
    /**
                        } else {
                    default -> throw new UnsupportedOperationException(
        STMKnownRuleNames.defaultClause,
        }
            this.traverseForIdentifiers(

                    : roots.get(0);
            }
        return expr != null ? expr.getExpression(rowRefAllowed) : new SQLQueryValueFlattenedExpression(node, Collections.emptyList());
            return null;
            return new SQLQueryValueReferenceExpression(head, rowRefAllowed, name);
                                    : new SQLQueryValueFlattenedExpression(content, children);
        }
                    return Collections.emptyList();
            };
                        SQLQueryTableAlterModel.recognize(this, stmtBodyNode);
 * Licensed under the Apache License, Version 2.0 (the "License");
        STMKnownRuleNames.rowValueConstructor,
            return new SQLQueryValueFlattenedExpression(node, Collections.emptyList());
                            rawName
        if (actualIdentifierNode == null) {
                        case '$' -> new SQLQueryValueVariableExpression(
                    }
    }
                            String name = identifierNode == null ? SQLConstants.QUESTION : identifierNode.getTextContent();
                        }
    private SQLQuerySymbolEntry collectIdentifier(@NotNull STMTreeNode node, boolean forceUnquotted, @Nullable STMTreeNode periodNode) {
import org.antlr.v4.runtime.Token;
            return null;
                    if (!this.recognitionContext.useRealMetadata() || connectionContext.isDummy()) {

                case SQLStandardParser.RULE_correlationName -> {
        SQLQueryMemberAccessEntry endingMemberAccessEntry = null;

                    SQLQueryExprType.forPredefined(v.type()),
        STMKnownRuleNames.characterStringLiteral,
            return null;
        }
                SQLQueryComplexName table = allTableNames.get(prefix);
                        default -> {
            name = null;
        if (actual.size() > 1) {
            case SQLStandardParser.RULE_unsignedNumericLiteral -> this.makeValueConstantExpression(node, SQLQueryExprType.NUMERIC);

                    node = actual.get(0);
                    if (columnName != null) {
                    String rawName = varExprTermNode.getTextContent();
 * you may not use this file except in compliance with the License.
        STMKnownRuleNames.dropViewStatement,
import java.util.function.Predicate;
        STMKnownRuleNames.dropTableStatement,
            SQLQuerySymbolEntry entry = this.registerSymbolEntry(identifierTextNode, rawIdentifierString, rawIdentifierString, memberAccessEntry);
                    }

    private void traverseForIdentifiers(
    

                    SQLQueryValueExpression expr = this.collectColumnReferenceExpression(ref, false);
import org.jkiss.code.NotNull;
                    case SQLStandardParser.RULE_dropTableStatement ->
     */
     */
    private SQLQueryLexicalScope beginScope() {
                    rowsetPseudoColumns = s -> Collections.emptyList();
        if (qualifiedNameNode == null) {
                            invalidPartsCount++;
                        invalidPartsCount += namePart == null ? 1 : 0;
            forcedClass = switch (quoteChar) {
     * Add new lexical item to the query context
        STMKnownRuleNames.subquery,
                        this.registerScopeItem(endingMemberAccessEntry = new SQLQueryMemberAccessEntry(periodNode));
        }
        interface LazyExpr {

                        for (SQLQuerySymbolEntry c : valueRef.getName().parts) {
    private static final Set<String> columnNameListWrapperNames = Set.of(
    }
    }
            return entry;
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
    @Nullable
    @Nullable
                                null,
                    case SQLStandardParser.RULE_deleteStatement ->
            STMTreeNode periodNode = tupleRefNode.findFirstChildOfName(STMKnownRuleNames.PERIOD_TERM);
    
        List<STMTreeNode> argNodes = callNode.findChildrenOfName(STMKnownRuleNames.functionCallOperand);
                    SQLQuerySymbolEntry entityAlias = this.collectIdentifier(ref, forceUnquotted, null);
        STMKnownRuleNames.valueReference,
    private SQLQueryValueExpression collectColumnReferenceExpression(@NotNull STMTreeNode head, boolean rowRefAllowed) {
    );
            log.debug("Ambiguous tableName collection at " + node.getNodeName());
        return queryExpressionMapper.translate(tree);
                }
        String rawIdentifierString = identifierTextNode.getTextContent();
    @NotNull
        return recognizer.recognizeQuery(queryText);
        STMKnownRuleNames.valueExpressionAtom,
        boolean isColumnResolved
        STMKnownRuleNames.columnName,
        }
                    }
            return null;
            if (entityName == null) {
                case 1 -> {
                if (table != null) {
public class SQLQueryModelRecognizer {
    private SQLQueryValueExpression makeValueConstantExpression(@NotNull STMTreeNode node, @NotNull SQLQueryExprType type) {
                        );
        if (knownRecognizableValueExpressionNames.contains(node.getNodeName())) {
/**
        List<STMTreeNode> subnodes = node.findNonErrorChildren();
    );
        STMKnownRuleNames.whereClause,
import java.util.function.Consumer;
            boolean[] slicingFlags = new boolean[subnodes.size()];
        this.symbolEntries.add(entry);
                            );
        }
                                node,

                    SQLQueryValueExpression subexpr = this.collectValueExpression(valueExprNode, scope);
            case SQLStandardParser.RULE_subquery -> new SQLQueryValueSubqueryExpression(node, this.collectQueryExpression(node));

        @NotNull SQLQuerySymbolEntry symbolEntry,
            && this.executionContext.getDataSource() instanceof DBSObjectContainer
        @NotNull Predicate<SQLQuerySymbolEntry> tryFallbackForStringLiteral,
                this.executionContext,
                };
                    List<DBDPseudoAttribute> rowsetsPc = Stream.of(pc).filter(a -> a.getPropagationPolicy().providedByRowset).toList();
        @NotNull String rawName,
        STMKnownRuleNames.updateStatement
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryMemberAccessEntry;
            entityName -> {
            ? node.findFirstChildOfName(STMKnownRuleNames.qualifiedName)
    }
            STMTreeNode asteriskNode = tupleRefNode.findFirstChildOfName(STMKnownRuleNames.ASTERISK_TERM);
        );
        return result;
    }
        STMKnownRuleNames.columnReference,
        SQLQueryExpressionMapper queryExpressionMapper = new SQLQueryExpressionMapper(this);
        @NotNull SQLQueryRowsSourceContext rootRowsContext
                }
                        SQLQuerySymbolEntry a = prefix.parts.get(i);
                    if (castSpecNode != null) {
    /**
                    name = null;
            };
                List<SQLQueryValueExpression> roots = childLists.pop();
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
        }
        STMKnownRuleNames.referenceColumnList,
                case SQLStandardParser.RULE_columnName -> {
        }
                case '"', '`' -> SQLQuerySymbolClass.QUOTED;
                STMTreeNode periodNode = null;
                }
    @NotNull
import org.jkiss.dbeaver.model.sql.SQLUtils;
        this.traverseForIdentifiers(
        STMKnownRuleNames.variableExpression,
        STMKnownRuleNames.functionCallExpression,
            this.lexicalScope = scope;
                    yield null;
        @NotNull Consumer<SQLQuerySymbolEntry> entityAliasAction,
                            this.registerSymbolEntry(node, rawName.substring(2, rawName.length() - 1), rawName, null),
    }
                        );
            return this.collectQualifiedName(actual.getFirst(), forceUnquotted);
        if (actual.isEmpty()) {
                prefix = prefix.trimEnd();
                            nameParts.add(null);
        if (identifierNode == null) {
        this.executionContext = recognitionContext.getExecutionContext();
                            rawName

        STMKnownRuleNames.correspondingColumnList,
            SQLQuerySymbolClass forcedClass;
        STMKnownRuleNames.alterTableStatement,

        @NotNull SQLDialect dialect,
                        );
                entityName -> allTableNames.add(entityName.stringParts),
        STMKnownRuleNames.deleteStatement,
                }
                                stack.push(null);
        }
            case SQLStandardParser.RULE_truthValue -> this.makeValueConstantExpression(node, SQLQueryExprType.BOOLEAN);
            : node;

        for (SQLQueryComplexName valueRef : allValueRefs) {
    @NotNull
                            STMTreeNode identifierNode = varExprNode.findLastNonErrorChild();
    }
    private SQLQueryConnectionContext prepareConnectionContext(@NotNull STMTreeNode root) {
            }
    private static final Set<String> tableNameContainers = Set.of(
                        SQLQuerySymbolEntry b = table.parts.get(i);
                        SQLQueryTableDropModel.recognize(this, stmtBodyNode, false);
 * distributed under the License is distributed on an "AS IS" BASIS,
                            yield new SQLQueryValueVariableExpression(
                        default -> {
                        }
        List<SQLQuerySymbolEntry> result = node.findChildrenOfName(STMKnownRuleNames.columnName).stream()
                    if (expr instanceof SQLQueryValueTupleReferenceExpression tupleRef) {
 *
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    case SQLStandardParser.RULE_alterTableStatement ->
                        "Value member expression expected while facing with " + step.getNodeName()
                    } else if (periodNode != null) {
                    }
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
                    }
        }


                    case SQLStandardParser.RULE_insertStatement ->
                                children.size() == 1 && children.get(0) instanceof SQLQueryValueFlattenedExpression child
    public SQLQueryRowsSourceModel collectQueryExpression(@NotNull STMTreeNode tree) {
                        }
                return b -> expr;
        STMKnownRuleNames.derivedColumnList,
                            expectingName = false;
        @NotNull STMTreeRuleNode tree,
import org.antlr.v4.runtime.misc.Interval;
                            if (knownRecognizableValueExpressionNames.contains(rn.getNodeName())
        STMKnownRuleNames.orderByClause,
            if (prefix == null && valueRef.parts.size() > 1 && valueRef.parts.getFirst() != null && allTableAliases.contains(valueRef.parts.getFirst().getName().toLowerCase())) {
                if (column != null) {
        if (nameNode == null) {
                    } else {
                    rowsetPseudoColumns = rowsetsPc.isEmpty()
        if (tree == null || (tree.start == tree.stop && !LSMInspections.prepareOffquerySyntaxInspection().predictedTokenIds().contains(tree.start.getType()))) {
 * You may obtain a copy of the License at
        STMKnownRuleNames.createViewStatement,
import org.jkiss.dbeaver.model.sql.semantics.model.ddl.SQLQueryTableCreateModel;
        List<SQLQueryValueExpression> argExprs = new ArrayList<>(argNodes.size());
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModelContent;
                }
    public SQLQueryValueFunctionExpression collectFunctionCall(@NotNull STMTreeNode callNode, @Nullable SQLQueryLexicalScope scope, boolean forRows) {
            allValueRefs::addLast,
        SQLQuerySymbolClass forcedClass = null;
        }
                case SQLStandardParser.RULE_columnReference -> b -> this.collectColumnReferenceExpression(head, b);
                        }
            {
            tree,
    }
    private final SQLQueryRecognitionContext recognitionContext;
import java.util.stream.Stream;
        STMKnownRuleNames.nonjoinedTableReference,
    }
                        STMTreeNode dataTypeNode = castSpecNode.findLastChildOfName(STMKnownRuleNames.dataType);
    private SQLQueryModel recognizeQuery(@NotNull String text) {

            return null;
            SQLQueryModel model = new SQLQueryModel(tree, contents, this.symbolEntries, this.lexicalItems.values().stream().toList());
                        case SQLStandardParser.RULE_namedParameter ->  {
                STMTreeNode stmtBodyNode = queryNode.findFirstNonErrorChild();
                        String typeName = dataTypeNode == null ? "UNKNOWN" : dataTypeNode.getTextContent();
                                a.getSymbol().setSymbolClass(b.getSymbolClass());
            : node;
    private final DBCExecutionContext executionContext;
                    STMTreeNode castSpecNode = node.findFirstChildOfName(STMKnownRuleNames.valueExpressionCastSpec);
                        this.registerScopeItem(endingMemberAccessEntry);
import org.jkiss.dbeaver.model.sql.semantics.model.dml.SQLQueryDeleteModel;
        return this.collectQualifiedName(node, false);
    @NotNull
                                    stack.push(children.get(i));
            new SQLQueryRowsSourceContext(connectionContext), Set.of(RelationalObjectType.TYPE_UNKNOWN), true
        }
                )).collect(Collectors.toMap(c -> c.symbol.getName(), c -> c));
                }
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerParameters;
        }
        STMKnownRuleNames.referencedTableAndColumns,
        return new LexicalScopeHolder(this.beginScope());
