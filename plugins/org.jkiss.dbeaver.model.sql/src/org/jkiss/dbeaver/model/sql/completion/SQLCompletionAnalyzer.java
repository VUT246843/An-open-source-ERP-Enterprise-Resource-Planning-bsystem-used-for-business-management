                    isFQName = true;
        SQLCompletionRequest request,
        if (!CommonUtils.isEmpty(prevWords) &&
            SQLConstants.KEYWORD_INTO.equals(prevWord) ||
            Collections.emptyMap());
            null,
                        alias = SQLUtils.generateEntityAlias((DBSEntity) object, s -> {
                            case SQLConstants.KEYWORD_WHERE:
                if (!isInLiteral) {
                // Get root objects
        SQLSyntaxManager syntaxManager = request.getContext().getSyntaxManager();
        }
                            if (ourContainer instanceof DBSProcedureContainer && ourContainer instanceof DBSObjectContainer) {
                    if (!CommonUtils.isEmpty(valueEnumeration)) {
                                        }
                    objectName = "";
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
        if (hideDups) {
            request,
                for (DBSEntityAssociation fk : associations) {
        filterProposals(dataSource);
                proposals.remove(i);

            } else if (object instanceof DBSEntityAttribute tableColumn) {
                                for (DBSObject obj : rootObjects) {
                break;
            return null;
                replaceString = replaceString.toUpperCase();
        String wordPart = request.getWordPart();
                    allowedKeywords.add(SQLConstants.KEYWORD_INTO);
        }
                                request,
        String prevWord = request.getWordDetector().getPrevKeyWord();
                    }
                //replaceString = DBUtils.getQuotedIdentifier(dataSource, replaceString);
                        }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
        String description)
                    "All objects"));
                }
                        SQLCompletionAnalyzer.createCompletionProposal(
                if (!CommonUtils.isEmpty(tableName) && !hasProposal(proposals, tableName)) {
            procExec = false;
                        }

                    if (tableAlias == null && !CommonUtils.isEmpty(wordPart)) {
                    proposals.add(
                        DBSObject selectedObject = getActiveInstanceObject();
            }
        return proposals;
                    // We assume at this stage that the user writes the full path to the object, once in the objectName there are separators.
                        || !ArrayUtils.contains(dialect.getDMLKeywords(), firstKeyword.toUpperCase(Locale.ENGLISH))) {
            if (sc == null) {
                        if (score1 == score2) {
                    DBPKeywordType keywordType = dialect.getKeywordType(replaceString);
    private void runAnalyzer() throws DBException {
                            case SQLConstants.KEYWORD_OR:
                        objectName);
            proposals.add(
                        // In this case, the procedure name should be the last in the array and container name - second last
                proposals.add(request.getContext().createProposal(
                if (keywordType != null) {
                if (object == null) {
                    char curChar = ' ';
            String objPrefix = null;
                    ) {
                            Map.of(SQLCompletionProposalBase.PARAM_NO_SPACE, true))
                    } else {
                Map<String, String> table2Alices = tableRefsAnalyzer.getTableAliasesFromQuery();
                    // Skip hidden
 * Completion analyzer
import java.util.*;
                // Do not send information about the scheme to the assistant
                final String tableAlias = name.getValue();
            if (childObject == null) {
                        return true;
                    DBSEntityReferrer enumConstraint = DBStructUtils.getEnumerableConstraint(monitor, attribute);
                        // Shift offset because we need space after *
                        }
        DBPDataSource dataSource = request.getContext().getDataSource();
        if (!joinableProposals.isEmpty()) {
                DBSObject container = proposal.getObjectContainer();
        while (token.endsWith(catalogSeparator)) {
                        }
                    String containerName = wordDetector.removeQuotes(objectsNames[arrayIndex]);
                    if (proposals.isEmpty() && CommonUtils.isEmpty(wordDetector.getPrevWords())) {
                List<DBSObject> rootObjects = null;
                                    0,
                        valueEnumeration.sort((o1, o2) -> DBUtils.compareDataValues(o1.getValue(), o2.getValue()));
                if (DBUtils.isHiddenObject(child)) {
    @Nullable
            DBSEntity parentObject = null;
                DBSObject rootObject = null;
                            false,
    /*
            }
        if (SQLConstants.KEYWORD_WHERE.equals(prevWord) ||
                    }
            if (tokens.length == 1) {
    private void filterProposals(DBPDataSource dataSource) {
            if (emptyWord || isInLiteral || isNumber || isInQuotedIdentifier) {
            // or get list of root database objects
                                    null,
                                        return null;
                }
                                sqlValue.length(),
        if (!quotedString && !isFQName) {

                        DBSObject leftTable = getTableFromAlias((DBSObjectContainer) dataSource, null);
                            request,
                        !isPrevWordEmpty && ("(".equals(prevDelimiter) || ",".equals(prevDelimiter)))
            }
                                    public Object visit(@Nullable CreateView createView, @Nullable Object context) {
                        structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, object);
import org.jkiss.dbeaver.model.data.DBDValueHandler;
    }
                    return;
        } else {
        }
            final String token = tokens[i];
                    objectName = String.format(
                            sqlDialect.getCatalogSeparator(),
                } else {
                        }
        return createCompletionProposal(
                startPart = startPart.substring(divPos + 1);
                        rootObject = getTableFromAlias(sc, wordPart);
                }
            proposalMap.add(proposal.getDisplayString());
                            MAX_ATTRIBUTE_VALUE_PROPOSALS,
                        // startsWith
            objectIcon = DBValueFormatting.getObjectImage(object);
        DBPKeywordType proposalType,
                {
        if (!prevWords.isEmpty()) {
                DBObjectNameCaseTransformer.transformName(dataSource, token);
        boolean isSingleObject = true;
                structureAssistant,
                }
                                return DBUtils.orderComparator().compare((DBSAttributeBase) o1, (DBSAttributeBase) o2);
    }
    }
            object,
                    }
                if (CommonUtils.isEmpty(request.getWordPart())) {
        }
        }
                                                wordDetector,
    }
                    }
                            DBSObject ourContainer = selectedObjectParentObject.getChild(monitor, containerName);
                                    boolean waitsForValue = isInLiteral || (!CommonUtils.isEmpty(prevWords) &&
                            }
                        if (childObject != null) {
        if (!CommonUtils.isEmpty(prevWords)) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                    }
        {
        if (childObject == null) {
                        request.setQueryType(null);
            }
            makeProposalsFromChildren(childObject, null, false, parameters);
                int divPos = columnName.indexOf(request.getContext().getSyntaxManager().getStructSeparator());
                            }
            for (int i = 0; i < selectedObjects.length; i++) {
        // Find all aliases matching current word
                        // It is table name completion after FROM. Auto-generate table alias
                    }
        boolean hideDups = request.getContext().isHideDuplicates() && selectedObject != null;
            makeProposalsFromQueryParts();
        if (queryType != null) {
                        for (DBDLabelValuePair valuePair : valueEnumeration) {
                            tableAlias,
                }
            if (aliasMode != SQLTableAliasInsertMode.NONE) {
            }
                        }
                                valueEnumeration = ((DBSDictionary) dictEntity).getDictionaryEnumeration(
                    List<DBDLabelValuePair> valueEnumeration = null;
                    childObject  = getTableFromAlias(sc, token);

        }
        if (wordDetector.containsSeparator(objectName)) {
                }
                }
            // Get all children objects as proposals
                    }
                }
                            tableAlias,
                        Set<String> aliases = new LinkedHashSet<>();
                                    }
        String alias = null;
        // Here we handle the case when user started typing the new query on the next line without query delimiter for the previous one.

                    } else if (SQLConstants.KEYWORD_JOIN.equals(prevKeyWord) && isPrevWordEmpty) {
                            sqlDialect.getIdentifierQuoteStrings(),
            if (tokens.length == 1) {
            request,
                                return DBUtils.orderComparator().compare((DBSAttributeBase) o1, (DBSAttributeBase) o2);
        this.checkNavigatorNodes = check;
        @Nullable DBPImage objectIcon,
                        if (!isPrevWordEmpty) {
                                    boolean isLike = SQLConstants.KEYWORD_LIKE.equals(previousWord)
                    }
    }
                if (!request.isSimpleMode()) {
        DBPKeywordType proposalType,
                makeProceduresProposals(dataSource, wordPart, procExec);
            // Column name?
                            if (!filter.matches(proposal.getObject().getName())) {
                        CommonUtils.equalObjects(proposal.getObject().getName(), proposal2.getObject().getName()) &&
    private void makeDataSourceProposals(@NotNull Map<String, Object> parameters) throws DBException {
                                return true;
                            searchFinished = true;
            }
            proposalType,
            }
                    int arrayIndex = 0;
            {
        }
                    !(rootSC instanceof DBPDataSource),
 * distributed under the License is distributed on an "AS IS" BASIS,
                                        return null;
        boolean emptyWord = wordPart.isEmpty();
            && !SQLConstants.KEYWORD_AND.equals(prevWord)
                log.debug("Can't get synonym target object");
    private SQLCompletionProposalBase makeProposalsFromObject(DBSObject object, boolean useShortName, Map<String, Object> params) {
                if (wordPart.isEmpty()) {
                                    @Override
                        objPrefix = prevWord;
                        makeProposalsFromChildren(selectedContainer, lastToken, true, parameters);
                            // Found alias - no proposals
                String wordPart = request.getWordDetector().getWordPart();

                                );
            return null;
                if (!ArrayUtils.isEmpty(objectsNames)) {
                    if (!scoredMatches.isEmpty()) {
                    makeDataSourceProposals(parameters);
                            }
            }
            token = token.substring(0, token.length() - 1);
                            false,
        if (request.getActiveQuery() == null || wordDetector.getPrevKeyWordOffset() < request.getActiveQuery().getOffset()) {
        }
                String[] objectsNames = wordDetector.splitIdentifier(wordPart);

                }
                    });
            for (DBSObject child : children) {
                }
            log.error(e);
                                break;
        //SQLEditorBase editor = request.editor;
        final SQLDialect sqlDialect = dataSource.getSQLDialect();
                        // get completion from data source
        final DBPPreferenceStore prefStore;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.jface.text.BadLocationException;
        }
            Map<DBSObject, Map<Class<?>, List<SQLCompletionProposalBase>>> containerMap = new HashMap<>();
                        switch (prevKeyWord) {
            params.put(SQLCompletionProposalBase.PARAM_EXEC, exec);
                } else {

        final Map<String, String> names = tableRefsAnalyzer.getFilteredTableReferences(token, false);
                                        for (DBSObject obj : rootObjects) {
            replaceString += " " + alias;
            DBPDataSource dataSource = request.getContext().getDataSource();
    }
                    DBSStructureAssistant<?> structureAssistant = null;
                            DBSStructureAssistant.ObjectsSearchParams params = new DBSStructureAssistant.ObjectsSearchParams(
                                if (prevWord.contains(sqlDialect.getCatalogSeparator())) {
                        }
            boolean allObjects = !simpleMode && ALL_COLUMNS_PATTERN.equals(startPart);
            final Map<String, String> names = tableRefsAnalyzer.getFilteredTableReferences(wordPart, true);
                                            aliases.add(createView.getView().getAlias().getName().toLowerCase(Locale.ENGLISH));
            }
                            request,
            cursorPos = replaceString.length() - 2;
                    request,
            // Try to determine which object is queried (if wordPart is not empty)
                                }
import org.jkiss.code.Nullable;
                        // Probably it is from selected object, let's try it
                DBSObjectReference structObject = (DBSObjectReference) object;
    private static final Log log = Log.getLog(SQLCompletionAnalyzer.class);
        assistantParams.setCaseSensitive(request.getWordDetector().isQuoted(objectName));
            return null;
                    replaceString,
        // Remove duplications
                            false,
        }

                objectTypes == null ? assistant.getAutoCompleteObjectTypes() : objectTypes,
        } else if (parent instanceof DBSEntity entity) {
        SQLCompletionRequest request,
        */
            for (int i = 0; i < proposals.size(); i++) {

                            if (!references.isEmpty()) {
        assistantParams.setParentObject(rootSC);
        }
            image, //image to display
                sc,
    }
        DBPNamedObject object,
                if (allObjects) {
    private boolean searchFinished = false;
            }
            }
                return MATCH_ANY_PATTERN;
            proposalType,
            if (rootSC != null) {
    private DBSObject getTableFromAlias(DBSObjectContainer sc, @Nullable String token) {
                    // At last - try to find child tables by pattern
                        }
            return;
import org.jkiss.utils.CommonUtils;
                for (DBSObjectContainer selectedContainer : selectedContainers) {
                        if (!isPrevWordEmpty && CommonUtils.isEmpty(prevDelimiter)) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
                            if (o1 instanceof DBSAttributeBase && o2 instanceof DBSAttributeBase) {
        } else {
                    if (selectedContainer != null && selectedContainer != childObject) {
            params);
        }
            node = DBNUtils.getNodeByObject(monitor, object, false);
    }
                    if (i != j && proposal.hasStructObject() && proposal2.hasStructObject() &&
                                        || SQLConstants.KEYWORD_ILIKE.equals(previousWord);
                            DBPKeywordType.OTHER,
                }
            }
                            // INSERT INTO tableName VALUES ('|');
                        searchPrefix = SQLCompletionAnalyzer.ALL_COLUMNS_PATTERN;


import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
                                    }
        return DBUtils.getActiveInstanceObject(context);
                for (int j = 0; j < proposals.size(); ) {
                            DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
            if (CommonUtils.isEmpty(prevKeyWord)) {
                    combinedMatch.append(DBUtils.getQuotedIdentifier(child));
                                    Collections.emptyList(),
                            false,
            objectName = wordDetector.removeQuotes(objectName);
            if (divPos != -1) {
            description,
                        }
                            // Seems to be table alias

import net.sf.jsqlparser.util.TablesNamesFinder;
                    }
            for (String keyWord : matchedKeywords) {
                    }
            displayString,
                // Try in active object
        if (context == null) {
        DBSObject childObject = sc;
        @NotNull DBSStructureAssistant assistant,

                        int proposalScore = scoredMatches.get(child.getName());
        }
    private final SQLCompletionRequest request;
        // If we have quoted string then ignore pref settings
                    if (dialect.supportsAliasInUpdate()
                    {
                    (!isPrevWordEmpty && (CommonUtils.isEmpty(delimiter) || delimiter.endsWith(")"))))
    {
    private static boolean hasProposal(List<SQLCompletionProposalBase> proposals, String displayName) {
                                    tableAlias = prevWord.substring(0, divPos);
        tableRefsAnalyzer = new TableReferencesAnalyzerImpl(request);
                }
            DBSObject rightTable = SQLSearchUtils.findObjectByFQN(monitor, sc, request, Arrays.asList(allNames));
                    // Path element not found. Damn - can't do anything.
            }
        if (proposalType == DBPKeywordType.FUNCTION) {
                    }
        * Turns the vector into an Array of ICompletionProposal objects
                    if (prevKeyWord != null) {
    }
            }
            proposals.clear();
            }
        if (dataSource != null) {
    }
            }
                        // selectedObject is a container, but not the one we are looking for. We will find our container through it
                        DBSEntity dictEntity = DBStructUtils.getAssociatedEntity(monitor, enumConstraint);
        }
        }
                        }
            objectIcon,
        if (objectName == null || objectName.isEmpty()) {
                final String[][] quoteStrings = sqlDialect.getIdentifierQuoteStrings();
                                    monitor,
                }
            }
                                        }
                        arrayIndex = objectsNames.length - 2;
                            isInLiteral ? wordDetector.getFullWord() : null,
                                    int divPos = prevWord.lastIndexOf(sqlDialect.getCatalogSeparator());
        DBPDataSource dataSource = request.getContext().getDataSource();
                            }
                DBSObject obj = SQLSearchUtils.findObjectByFQN(monitor, sc, request, Arrays.asList(allNames));
                    // Sort using fuzzy match

        }
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
        for (int i = 0; i < proposals.size(); ) {
                    if (allowedKeywords != null && !allowedKeywords.contains(keyWord)) {
            int divPos = startPart.lastIndexOf(request.getContext().getSyntaxManager().getStructSeparator());
        DBSObjectContainer sc = (DBSObjectContainer) dataSource;
                    allowedKeywords = new HashSet<>();
        for (DBSObjectReference reference : references) {
            StringBuilder combinedMatch = new StringBuilder();
        final DBPDataSource dataSource = request.getContext().getDataSource();

    }
            request.getWordDetector().getStartOffset(),
                // Like "SELECT proc_name|" (and proc_name is from another container)
                            return DBUtils.nameComparatorIgnoreCase().compare(o1, o2);
                } else if (SQLUtils.isExecQuery(syntaxManager.getDialect(), prevKeyWord)) {
        for (int i = 0; i < tokens.length; i++) {
        List<SQLCompletionProposalBase> joinableProposals = new ArrayList<>();
                }
                    if (!combinedMatch.isEmpty()) {
                allowedKeywords = new HashSet<>();
        boolean procExec;
                            false,
                            // Don't use alias, when it's identical to entity name
            if (proposal.getObject() instanceof DBSEntity) {
            if (!hasProposal(proposals, word) && !word.contains(".")) {
                                        isLike
                    DBPKeywordType.OTHER,
            } else if (wordPart.length() > 1 && wordDetector.containsSeparator(wordPart) && !wordPart.contains(selectedObject.getName())) {
                    }
    private void makeProposalsFromAssistant(
        }
            children = entity.getAttributes(mdMonitor);
                    allowedKeywords.add(SQLConstants.KEYWORD_SET);
                        SQLDialect sqlDialect = SQLUtils.getDialectFromObject(object);
                    continue;
                // Keyword assist
        try {
            }
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.sql.analyzer.TableReferencesAnalyzer;
                    if (dataSource != null && !request.getContext().isSearchInsideNames()) {
                            }
                        childObject = selectedContainer.getChild(monitor, objectName);
                replaceString = replaceString.toLowerCase();
                    if (childObject == null  && !request.isSimpleMode()) {
                selectedContainers[i] = DBUtils.getAdapter(DBSObjectContainer.class, selectedObjects[i]);
        } catch (DBException e) {
    }
        }
                        combinedMatch.append(", ");
        DBSStructureAssistant.ObjectsSearchParams assistantParams = new DBSStructureAssistant.ObjectsSearchParams(
}
                        for (SQLCompletionProposalBase proposal : typeEntry.getValue()) {
            for (Map.Entry<DBSObject, Map<Class<?>, List<SQLCompletionProposalBase>>> entry : containerMap.entrySet()) {
            if (!DBStructUtils.isConnectedContainer(childObject)) {
                            }
        }
        }
            objectName = useShortName ? object.getName() : DBUtils.getObjectFullName(object, DBPEvaluationContext.DML);
        SQLTableAliasInsertMode aliasMode = SQLTableAliasInsertMode.NONE;
                    Collections.emptyMap()));
                String replaceString = combinedMatch.toString();

        if (replaceString == null || replaceString.isEmpty()) {
            }
                        if (CommonUtils.isEmpty(startPart) || CommonUtils.startsWithIgnoreCase(child.getName(), startPart)) {
                        if (structureAssistant != null) {
            }
        DBSObjectContainer[] selectedContainers;
                    word, // replacementString
 *
import org.jkiss.dbeaver.model.sql.*;
            SQLDialect sqlDialect = SQLUtils.getDialectFromObject(object);
        request.setQueryType(null);
import net.sf.jsqlparser.statement.Statement;
                if (DBUtils.isVirtualObject(child)) {

                        // Filter out non-joinable tables
    private boolean checkNavigatorNodes = true;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
                        makeProposalsFromAssistant(structureAssistant, sc, null, lastToken, parameters);
            return false;
        }
                        rootObject = SQLSearchUtils.findObjectByFQN(monitor, sc, request, Arrays.asList(allNames));
                        } else {
                                    }
            SQLWordPartDetector wordDetector = request.getWordDetector();
                SQLCompletionProposalBase proposal = proposals.get(i);
                                makeProposalsFromChildren(defaultCatalog, null, false, parameters);
            objectName,

import java.lang.reflect.InvocationTargetException;
                (queryType ==  SQLCompletionRequest.QueryType.EXEC ||
    }
                DBPKeywordType keywordType = syntaxManager.getDialect().getKeywordType(keyWord);
                        }
                            case SQLConstants.KEYWORD_SET:
                                }
                        makeProposalsFromChildren(dataSource, null, false, parameters);
                        request.setQueryType(SQLCompletionRequest.QueryType.JOIN);
 
                            DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
                    .fromPreferences(tableColumn.getDataSource().getContainer().getPreferenceStore());
            request,
            }
                return true;
        }
                    rootObject = getTableFromAlias(sc, tableAlias);
                }
    private boolean makeJoinColumnProposals(DBSObjectContainer sc, DBSEntity leftTable) {
                                    null,
    }
        boolean isObject,
                return;
        }
                        int score2 = scoredMatches.get(o2.getName());
                sc = null;
            String rightTableName = prevWords.get(0);
        //DBPPreferenceStore store = editor.getActivePreferenceStore();
                if (tableHaveJoins(rightTable, leftTable) || tableHaveJoins(leftTable, rightTable)) {
            } else if (sqlDialect.isEntityQueryWord(prevKeyWord)) {
    public static final int MAX_STRUCT_PROPOSALS = 100;
                final String[] allNames = SQLUtils.splitFullIdentifier(name.getKey(), catalogSeparator, quoteStrings, false);
                            }
            makeProposalsFromAssistant(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                } else {
        boolean isFQName,

                        return score2 - score1;
            columnName = DBUtils.getUnQuotedIdentifier(dataSource, columnName);
                            false,

        boolean isInQuotedIdentifier = SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED.equals(request.getContentType());
import org.jkiss.dbeaver.model.data.DBDLabelValuePair;
                final String tableName = name.getKey();
            //boolean isJoin = SQLConstants.KEYWORD_JOIN.equals(request.wordDetector.getPrevKeyWord());
            }

            if (!CommonUtils.isEmpty(prevKeyWord)) {
        if (hideDups) {
                }
                            return;
                }
                }
            if (matchedKeywords.isEmpty() && !CommonUtils.isEmpty(request.getWordPart())) {

                            request,
        SQLWordPartDetector joinTableDetector = new SQLWordPartDetector(
        DBPImage objectIcon = node == null ? null : node.getNodeIconDefault();
                    proposal.setReplacementAfter(" ON");
                        prevDelimiter.equals(SQLCompletionAnalyzer.ALL_COLUMNS_PATTERN) &&
        } catch (DBException e) {
                break;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * DBeaver - Universal Database Manager
            if (!DBUtils.isQuotedIdentifier(dataSource, columnName)) {
            startPart = wordDetector.removeQuotes(startPart).toUpperCase(Locale.ENGLISH);
                // Like "SELECT schema_name.proc_name|" or just "SELECT schema_name.|" called from another container SQL editor
    private static final String MATCH_ANY_PATTERN = "%";
            isPrevWordEmpty = true;
                if (divPos != -1) {

                            }
                                valueHandler.getValueDisplayString(attribute, valuePair.getValue(), DBDDisplayFormat.NATIVE) :
                Class<?> objectType = object instanceof DBSObjectReference ? ((DBSObjectReference) object).getObjectClass() : object.getClass();
            if (attribute != null) {
                List<SQLCompletionProposalBase> childProposals = new ArrayList<>(matchedObjects.size());

                            // No proposals for *. Probably it is a query start
            String tableName;
        if (checkNavigatorNodes && node == null && (object instanceof DBSEntity || object instanceof DBSObjectContainer)) {
            procExec = true;
                        0,
        return request.getContext().createProposal(
                list.add(proposal);
    {
    private static final String ALL_COLUMNS_PATTERN = "*";
                    // Part of column name

/*
            }
                        }
            if (request.getContext().isSearchGlobally() && !wordDetector.containsSeparator(wordPart)) {
import org.jkiss.dbeaver.model.text.TextUtils;
        // Apply navigator object filters
                    try {
                // SELECT ..
                                    makeJoinColumnProposals((DBSObjectContainer) dataSource, (DBSEntity) obj);
        @NotNull Map<String, Object> params) {
                    if (endsOnStructureSeparator) {
        String searchPrefix = request.getWordPart();
                    matchedObjects.sort((o1, o2) -> {
                        } else {
                        continue;
                objectName = DBUtils.getQuotedIdentifier(object);
        for (String word : displayNames) {
                        wordDetector.shiftOffset(1);
                    }
                            // Here we should not show any proposals
                // Do not convert case if we got it directly from object
                        if (request.getActiveQuery() instanceof SQLQuery sqlQuery) {
        SQLWordPartDetector wordDetector = request.getWordDetector();
                makeObjectNameMask(objectName, rootSC)
        final DBSObjectContainer rootContainer = DBUtils.getAdapter(DBSObjectContainer.class, dataSource);
                makeProposalFromHippie(wordDetector);
    private final List<SQLCompletionProposalBase> proposals = new ArrayList<>();

                    {
            //new ContextInformation(null, displayString, displayString), //the context information associated with this proposal
        }
    }
                wordPart,
        String prevDelimiter = wordDetector.getPrevDelimiter();
        if (SQLConstants.KEYWORD_FROM.equals(prevWord) ||

            }
                    boolean endsOnStructureSeparator = wordPart.charAt(wordPart.length() - 1) == wordDetector.getStructSeparator();
                    //new ContextInformation(null, displayString, displayString), //the context information associated with this proposal
import net.sf.jsqlparser.statement.create.view.CreateView;
                        });
                                childObject = references.iterator().next().resolveObject(monitor);
        }
                                            !prevDelimiter.endsWith(")")));
            parameters.put(SQLCompletionProposalBase.PARAM_EXEC, true);

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (objectContainer != null) {
                    } catch (BadLocationException e) {
                replaceString += " " + convertKeywordCase(request, "as", false);
                    );
            }
                            null,
                    }
 *
        assistantParams.setGlobalSearch(request.getContext().isSearchGlobally());
        return makeProposalsFromObject(object, useShortName, objectIcon, params);
        int cursorPos;
                DBSObject objectContainer = structObject.getContainer();
                        if (leftTable instanceof DBSEntity) {
                    }
                } else if (syntaxManager.getDialect().isAttributeQueryWord(prevKeyWord)) {
                DBPNamedObject object = proposal.getObject();
            }
                if (endsOnStructureSeparator) {
                        for (DBSObject obj : rootObjects) {
            boolean simpleMode = request.isSimpleMode();
import org.jkiss.utils.ArrayUtils;
        }
                    } else if (objectsNames.length > 1) {
                            }
    

                    } else if (delimiter.equals(ALL_COLUMNS_PATTERN)) {
                                DBPKeywordType.LITERAL,
                    null,
                            case SQLConstants.KEYWORD_ON:
                proposals.add(createCompletionProposal(
        }
                // FIXME: do not escape! it may (will) escape identifiers twice
                        }
                } else if (SQLConstants.KEYWORD_INSERT.equals(prevKeyWord)) {
        final Map<String, String> names = tableRefsAnalyzer.getFilteredTableReferences(token, false);
            }

                                    structureAssistant.getAutoCompleteObjectTypes(),
            request.getDocument(),
                            Collection<DBSObjectReference> references = structureAssistant.findObjectsByMask(monitor, executionContext, params);
                                makeProposalsFromChildren(defaultSchema, null, false, parameters);
                    }
        String lastToken = null;
                // Let's try to find a procedure container
    private void makeProposalsFromQueryParts() {
                    if (!request.isSimpleMode() &&
            parameters.put(SQLCompletionProposalBase.PARAM_EXEC, false);
            replaceString += "()";
            null,
                                    public Object visit(@Nullable Table table, @Nullable Object context) {
        return replaceString;
        return objects;
        if (request.getContext().isSearchInsideNames()) {
                    if (SQLConstants.KEYWORD_DELETE.equals(prevKeyWord) ||
                    reference.getObjectType().getImage(),
                        }
                    }
            }
            } else {
                childObject = null;
                            return;
            sc.cacheStructure(monitor, DBSObjectContainer.STRUCT_ENTITIES);
import org.jkiss.dbeaver.model.struct.rdb.*;
        }
        if (startPart != null) {
                            replaceString = structObject.getFullyQualifiedName(DBPEvaluationContext.DML);
    private DBSObject getActiveInstanceObject() {
                    }
                                                (DBSEntity) obj);
                lastToken = token;
 * Licensed under the Apache License, Version 2.0 (the "License");
                alias = table2Alices.get(tableName);
                    // For dictionary reference read dictionary values
                            case SQLConstants.KEYWORD_AND:
        if (token == null) {
                for (DBSObject child : matchedObjects) {
        DBPDataSource dataSource = request.getContext().getDataSource();
                    }
        if (request.getQueryType() == null && request.getWordDetector().getPrevKeyWord().equalsIgnoreCase(SQLConstants.KEYWORD_FROM)) {
    }

                    DBPKeywordType.LITERAL,
            }
                }
            }
                    .fromPreferences(tableColumn.getDataSource().getContainer().getPreferenceStore());
            String[] strings = wordDetector.splitIdentifier(objectName);
        String replaceString = null;
                    DBCExecutionContext context = request.getContext().getExecutionContext();
    private static final String ENABLE_HIPPIE = "SQLEditor.ContentAssistant.activate.hippie";
            }
    private void makeProposalFromHippie(@NotNull SQLWordPartDetector wordPartDetector) {
        assistantParams.setMaxResults(MAX_STRUCT_PROPOSALS);
        if (request.getQueryType() == SQLCompletionRequest.QueryType.EXEC) {
                }
                (queryType == SQLCompletionRequest.QueryType.COLUMN && request.getContext().isSearchProcedures())) &&
                    proposals.add(
                && request.getWordDetector().getFullWord()
                            params.setCaseSensitive(request.getWordDetector().isQuoted(token));

                if (syntaxManager.getDialect().isEntityQueryWord(prevKeyWord)) {
                        }
                            );
                && object instanceof DBSObjectReference
            previousWord = prevWords.get(0).toUpperCase(Locale.ENGLISH);
                            request.setQueryType(SQLCompletionRequest.QueryType.TABLE);
                        if (!SQLConstants.KEYWORD_FROM.equalsIgnoreCase(wordDetector.getNextWord())) {
                matchedKeywords = syntaxManager.getDialect().getMatchedKeywords(request.getWordPart());
                    request,
                }
                }

                        prevDelimiter.indexOf(curChar) != -1 &&
        if (parent instanceof DBSObjectContainer objectContainer) {
                        });
                if (queryType == SQLCompletionRequest.QueryType.COLUMN && dataSource instanceof DBSObjectContainer) {
                        searchPrefix = SQLCompletionAnalyzer.ALL_COLUMNS_PATTERN;
        if (dataSource == null) {
            request.getContext().getSyntaxManager(),

        final String catalogSeparator = sqlDialect.getCatalogSeparator();
                    if (proposal == null) {
                    if (selectedContainer != null) {
            } else if (!matchedObjects.isEmpty()) {
            }
        }
                } else if (dataSource instanceof DBSObjectContainer) {
        String objectName,
            SQLConstants.KEYWORD_JOIN.equals(prevWord)) {
    private boolean tableHaveJoins(DBSEntity table1, DBSEntity table2) {
            }
 * you may not use this file except in compliance with the License.
        } else {
                break;
                sqlDialect.getIdentifierQuoteStrings(),
        }
        @NotNull Map<String, Object> params)


        Collection<? extends DBSObject> children = null;
                        if (selectedObject instanceof DBSObjectContainer) {
            // Get next structure container
                    // Any object name in this case
            prefStore = request.getContext().getDataSource().getContainer().getPreferenceStore();
            SQLCompletionProposalBase proposal = proposals.get(i);

        }
                sqlDialect.getCatalogSeparator(),
                        Objects.requireNonNullElse(alias, tableName),
                    }
                                        || (!CommonUtils.isEmpty(prevDelimiter) &&
        // Final filtering
                    replaceString,
            (SQLConstants.KEYWORD_PROCEDURE.equals(previousWord) || SQLConstants.KEYWORD_FUNCTION.equals(previousWord))) {
            if (DBStructUtils.isConnectedContainer(parent)) {
                        int score1 = scoredMatches.get(o1.getName());
            DBPDataSource dataSource = request.getContext().getDataSource();
                // Limit with FROM if we already have some expression
 * limitations under the License.
            if (dataSource != null
    @Nullable
        if (rootContainer == null) {
                            sc = selectedContainer;
            }

                        String[] allNames = SQLUtils.splitFullIdentifier(
                            keyWord,
        }
                                    true,
                            Map.of(SQLCompletionProposalBase.PARAM_NO_SPACE, true))
                    }
                    }
                            if (aliases.contains(s) || sqlDialect.getKeywordType(s) != null) {
                        proposals.remove(j);
                }
            node = DBNUtils.getNodeByObject(object);
                    childProposals.add(proposal);
                            replaceString = DBUtils.getFullQualifiedName(dataSource, objectContainer, structObject);
            }
                    // To search through an structure assistant, we need only the last part of the objectName string after the last separator

                Collections.addAll(allowedKeywords, sqlDialect.getQueryKeywords());
                if (queryType == SQLCompletionRequest.QueryType.COLUMN && dataSource instanceof DBSObjectContainer) {
            return false;
                    proposals.add(
    public static String convertKeywordCase(SQLCompletionRequest request, String replaceString, boolean isObject) {
                            Collections.emptyMap())
        }
                if (proposals.isEmpty() && !request.isSimpleMode()) {
                            break;
                for (DBSObjectContainer selectedContainer : selectedContainers) {
                    log.error("Error generating join condition", e);
                                null,
                rightTableName,
            default:
                if (SQLConstants.KEYWORD_PROCEDURE.equals(previousWord) || SQLConstants.KEYWORD_FUNCTION.equals(previousWord)) {
    }
                    word,
                return SQLSearchUtils.findObjectByFQN(monitor, sc, request, Arrays.asList(allNames));
                    if (enumConstraint instanceof DBSEntityAssociation) {

                        replaceString = dialect.storesUnquotedCase().transform(replaceString);
        DBSObjectContainer sc = rootContainer;

            if (object instanceof DBSEntity) {
        } else {
            token = "";
        final DBPDataSource dataSource = request.getContext().getDataSource();

                aliasMode = SQLTableAliasInsertMode
                        continue;
        List<DBSObject> objects = new ArrayList<>();
        );
                } else if (SQLConstants.KEYWORD_UPDATE.equals(prevKeyWord)) {
                    }
                            String displayString = SQLUtils.convertValueToSQL(session.getDataSource(), attribute, valueHandler, valuePair.getValue(), DBDDisplayFormat.UI, false);
                && !request.getContext().isUseShortNames()
        // If setting `Blank line is statement delimiter` set, then active query is only newly typed characters
        switch (proposalCase) {
        for (SQLCompletionProposalBase proposal : proposals) {
                                };
            monitor : new LocalCacheProgressMonitor(monitor);
            SQLConstants.KEYWORD_AND.equals(prevWord)) {
                        }
                            isFQName = true;
                if (obj != null) {
                            sc = (DBSObjectContainer) selectedObject;
                    ) {

            isSingleObject,
                } else {
                    // Otherwise try to read plain attribute values
                if (rootObject != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else if (ArrayUtils.contains(sqlDialect.getQueryKeywords(), prevKeyWord.toUpperCase(Locale.ENGLISH))) {
                        wordDetector.shiftOffset(-SQLCompletionAnalyzer.ALL_COLUMNS_PATTERN.length());
        return request.getContext().createProposal(
            if (selectedObject instanceof DBSObjectContainer) {
            if (isObject) {
    private List<DBSObject> getTableListFromAlias(DBSObjectContainer sc, @Nullable String token)
                        if (score > 0) {
    }
        }
        } else {
                    // TODO: its an ugly hack. Need a better way
                        request.setQueryType(SQLCompletionRequest.QueryType.COLUMN);
                        }
                                matchedKeywords = Arrays.asList(SQLConstants.KEYWORD_FROM);
                // Get children from selected object
        String displayString,
            Collection<? extends DBSEntityAssociation> associations = table1.getAssociations(monitor);
                        CommonUtils.isEmpty(request.getWordPart()) &&
                    if (context != null) {
        try {
                        // May be an incomplete table alias. Try to find such table
                            null,
                    }


                tableName = object.getName();
                        0,
            if (childObject == null && i == 0 && objectName != null) {
                            session,
        if (lastToken == null) {
                    }
                        }
                            params.setMaxResults(2);
        if (dataSource != null) {
            }
        }
                            }
    public void runAnalyzer(DBRProgressMonitor monitor) throws DBException {
            }

                                namesFinder.getTables(sqlStatement);
                } else {
        for (Entry<String, String> name : names.entrySet()) {
                } else {
            }
    private void makeProposalsFromChildren(DBPObject parent, @Nullable String startPart, boolean addFirst, Map<String, Object> params) throws DBException {
            // Seems to be table alias
        // and prev word can't exist in this new query - offset of prev word doesn't fit active query offset, so we set it accordingly.
                        continue;
                            false);
                        if (dictEntity != null) {
            cursorPos, //cursorPosition the position of the cursor following the insert relative to replacementOffset
/**
        DBSObjectType[] objectTypes,
        }
                    String tableAlias = null;
                            "{*".equals(prevDelimiter) || "[*".equals(prevDelimiter))) {
                            null,

                        curChar = request.getDocument().getChar(wordDetector.getCursorOffset() - 1);
                parentObject = tableColumn.getParentObject();
    }
                    // Try to get from active object
            object,
                }
                continue;
        DBCExecutionContext executionContext = request.getContext().getExecutionContext();
            if (wordPart.indexOf(request.getContext().getSyntaxManager().getStructSeparator()) != -1 || wordPart.equals(ALL_COLUMNS_PATTERN)) {
        }
                                displayString += " - " + valuePair.getLabel() + "";
    }
            for (SQLCompletionProposalBase proposal : proposals) {
                                attrImage,
            DBSEntityAttribute attribute = entity.getAttribute(monitor, columnName);
                        request.setQueryType(SQLCompletionRequest.QueryType.COLUMN);
            token = "";
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;

                            false,
        // Remove all table proposals which don't have FKs between them and leftTable
                }
        // Add procedures/functions for column proposals
        if (structureAssistant != null) {
import java.util.Map.Entry;
            }
        final DBPDataSource dataSource = request.getContext().getDataSource();
            if (allObjects) {
            return;
                            proposals.add(request.getContext().createProposal(
            return objectName + MATCH_ANY_PATTERN;
                                    refAttribute,
    private void filterNonJoinableProposals(DBSEntity leftTable) {
        }
                                Collections.emptyMap()));
                        if (selectedObjectParentObject != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    if (selectedObject != null && selectedObject != objectContainer) {
                    }

        } else {
        if (!searchFinished && !isInLiteral && !isInQuotedIdentifier) {
                    null,
        }
                        isSingleObject = false;
import org.jkiss.dbeaver.Log;
            replaceString, // replacementString
                        selectedContainer.cacheStructure(monitor, DBSObjectContainer.STRUCT_ENTITIES);
    {
                    if (tableAlias == null) {
            // replace with full qualified name
            DBSObject[] selectedObjects = DBUtils.getSelectedObjects(executionContext);
                    }
                        // Maybe alias ss a table name
                    }
                        replaceString = request.getContext().getSyntaxManager().getKeywordCase().transform(replaceString);
            makeProposalsFromChildren(childObject, lastToken, false, parameters);
                    reference,
        SQLWordPartDetector wordDetector = request.getWordDetector();
            }
            prevKeyWord = null;
        } else {
                children = objectContainer.getChildren(mdMonitor);
                }
                            matchedObjects.add(child);
                        continue;
        DBSObject selectedObject = defaultInstance == null || executionContext == null ? null : DBUtils.getActiveInstanceObject(executionContext);
                        proposal.setProposalScore(proposalScore);
                            if (sqlStatement != null) {
                        j++;

            if (replaceString == null) {
            // If we replace short name with referenced object

                    if (selectedObject instanceof DBSProcedureContainer) {
                    if (rootObjects != null) {
        this.request = request;
                                null,
                    if (queryType == SQLCompletionRequest.QueryType.JOIN && !proposals.isEmpty()
                            tableName,

                            String sqlValue = isInLiteral ?
                                        if (table != null && table.getAlias() != null && table.getAlias().getName() != null) {
                            null,
    static SQLCompletionProposalBase createCompletionProposal(
                        tableAlias = divPos == -1 ? null : wordPart.substring(0, divPos);
                        proposal.getObjectContainer() == selectedObject) {
            String columnName = prevWords.get(prevWords.size() - 1);
        boolean isPrevWordEmpty = CommonUtils.isEmpty(wordDetector.getPrevWords());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                }
        } else {
        String displayString,
        boolean useShortName,
 * Unless required by applicable law or agreed to in writing, software
                            if (CommonUtils.isEmpty(request.getWordPart()) || request.getWordPart().equals(ALL_COLUMNS_PATTERN)) {
                            if (defaultSchema != null) {
        final SQLDialect sqlDialect = dataSource.getSQLDialect();
            return;
                    continue;
                    }
            prefStore = DBWorkbench.getPlatform().getPreferenceStore();
                    if (request.getContext().getExecutionContext() != null) {

            return null;
            childObject = objectName == null ? null : sc.getChild(monitor, objectName);
                Map<Class<?>, List<SQLCompletionProposalBase>> typeMap = containerMap.computeIfAbsent(container, k -> new HashMap<>());
                    if (keywordType == DBPKeywordType.TYPE) {
        }
                    if (!prevWord.isEmpty() && prevWord.charAt(prevWord.length() - 1) == request.getContext().getSyntaxManager().getStructSeparator()) {
        if (executionContext == null) {
            if (!CommonUtils.isEmpty(associations)) {
                        DBSStructureAssistant structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, sc);
        if (token == null) {
                    rootObjects = getTableListFromAlias((DBSObjectContainer) dataSource, null);
        }
                }
                                }
            }
                        DBCExecutionContextDefaults<?, ?> contextDefaults = context.getContextDefaults();
                    // Get root object or objects from active database (if any)
            SQLDialect sqlDialect = request.getContext().getDataSource().getSQLDialect();
                        // Search using structure assistant
            if (!request.isSimpleMode() &&
                    proposals.add(createCompletionProposal(request, joinCriteria, joinCriteria, DBPKeywordType.OTHER, "Join condition"));

        return searchFinished;
                    // last expression ends with space or with ")"
                    // Try to detect current table
                            DBPKeywordType.OTHER,
        boolean quotedString = request.getWordDetector().isQuoted(replaceString);
                        // If word part ends on structure separator, then container name should be the last in the array
                    DBSObjectContainer sc = (DBSObjectContainer) dataSource;
                new DBSObjectType[] { RelationalObjectType.TYPE_PROCEDURE },
            }
            if (proposalMap.contains(proposal.getDisplayString())) {
                                    MAX_ATTRIBUTE_VALUE_PROPOSALS
                    request.setQueryType(SQLCompletionRequest.QueryType.COLUMN);
                        SQLCompletionAnalyzer.createCompletionProposal(
                    SQLDialect sqlDialect = request.getContext().getDataSource().getSQLDialect();
                    DBSObject selectedObject = getActiveInstanceObject();
                                            && createView.getView().getName() != null
            params);
            // Remove duplicates from non-active schema
                if (startPart == null || scoredMatches.isEmpty()) {
                params);
        String previousWord = "";
                dataSource instanceof DBSObjectContainer)
                if (SQLConstants.KEYWORD_DELETE.equals(prevKeyWord)) {
        return false;
 * You may obtain a copy of the License at
                                        if (createView != null && createView.getView().getAlias() != null
                                String prevWord = wordDetector.getPrevWords().get(0);
            runAnalyzer(monitor);
            // Get matched children
        if (parent instanceof DBSAlias alias && !mdMonitor.isForceCacheUsage()) {
package org.jkiss.dbeaver.model.sql.completion;
        boolean isFQName = false;
        String[] tokens = Arrays.stream(request.getWordDetector().splitWordPart()).filter(CommonUtils::isNotEmpty).toArray(String[]::new);
                        }
            if (rightTable instanceof DBSEntity) {
        runAnalyzer();
                            }
            //new ContextInformation(img, displayString, displayString), //the context information associated with this proposal
                }
                    matchedKeywords = new ArrayList<>(allowedKeywords);
                    makeProceduresProposals(dataSource, wordPart, procExec);
                        int score = CommonUtils.isEmpty(startPart) ? 1 : TextUtils.fuzzyScore(child.getName(), startPart);
                        DBSObjectContainer selectedObjectParentObject = DBUtils.getParentOfType(DBSObjectContainer.class, selectedObject);
                        log.debug(e);
                    // Try to get from active object
        if (dataSource != null) {
                                displayString,
            if (realParent == null) {
            i++;
                    String firstKeyword = SQLUtils.getFirstKeyword(dialect, request.getActiveQuery().getText());
                            default:
                    // Add proposals in the beginning (because the most strict identifiers have to be first)
            replaceString,
import org.jkiss.dbeaver.model.sql.analyzer.TableReferencesAnalyzerImpl;
        String objectName = null;
        String replaceString,
        }
                            if (!CommonUtils.isEmpty(valuePair.getLabel()) && !CommonUtils.equalObjects(valuePair.getLabel(), valuePair.getValue())) {
        if (objectIcon == null) {
                    if (queryType != SQLCompletionRequest.QueryType.COLUMN && queryType != SQLCompletionRequest.QueryType.EXEC) {
                }

                    if (structureAssistant != null) {
                    if (request.getQueryType() == SQLCompletionRequest.QueryType.COLUMN && !(keywordType == DBPKeywordType.FUNCTION || keywordType == DBPKeywordType.KEYWORD || keywordType == DBPKeywordType.OTHER)) {
                        } else if (SQLConstants.KEYWORD_INTO.equals(prevKeyWord) && isInLiteral) {
                    request.setQueryType(SQLCompletionRequest.QueryType.EXEC);
                break;
    }
            if (object instanceof DBSTableColumn tableColumn) {
            DBPKeywordType.OTHER,
        @NotNull Map<String, Object> params) throws DBException


            if (displayName.equals(proposal.getDisplayString())) {
            && !CommonUtils.isEmpty(alias)) {
import org.jkiss.dbeaver.DBException;
            final Map<String, Integer> scoredMatches = new HashMap<>();
                            Statement sqlStatement = sqlQuery.getStatement();
            }
        @Nullable DBPImage image,
                    if (fk.getAssociatedEntity() == table2) {
        }
    private final TableReferencesAnalyzer tableRefsAnalyzer;
            return;
                    SQLCompletionProposalBase proposal = makeProposalsFromObject(child, !(parent instanceof DBPDataSource), params);
    public void setCheckNavigatorNodes(boolean check) {
                    if (rootObject == null && tableAlias != null) {
                                    if (waitsForValue && request.getContext().isShowValues()) {
    }
                                sc = (DBSObjectContainer) ourContainer;
                    }
                if (!CommonUtils.isEmpty(tableAlias) && !hasProposal(proposals, tableAlias)) {
                // It seems the user indicates the full path to the procedure/function from another scheme.
        }
        boolean isNumber = !CommonUtils.isEmpty(wordPart) && CommonUtils.isNumber(wordPart);
                    proposals.addAll(childProposals);
        SQLCompletionRequest.QueryType queryType = request.getQueryType();
                try {
 * See the License for the specific language governing permissions and
                                        ) {
        Map<String, Object> parameters = new LinkedHashMap<>();
                aliasMode = SQLTableAliasInsertMode
            final String objectName =
                            break;
import net.sf.jsqlparser.schema.Table;
                if (addFirst) {
                    if (!SQLConstants.KEYWORD_WHERE.equalsIgnoreCase(wordDetector.getNextWord()) &&
            } else {
        for (SQLCompletionProposalBase proposal : proposals) {
                }
            // and current active schema (catalog) is not this object's container then
                    // Assume it's a table alias ?
            proposals.addAll(joinableProposals);
                    allowedKeywords.add(SQLConstants.KEYWORD_FROM);
        }
        }
                        }
                            filterNonJoinableProposals((DBSEntity) leftTable);
        // There could be multiple selected objects on different hierarchy levels (e.g. PG)
                }
        }
                        SQLCompletionAnalyzer.createCompletionProposal(
            cursorPos = replaceString.length();

        DBCExecutionContext context = request.getContext().getExecutionContext();
            }
                try (DBCSession session = request.getContext().getExecutionContext().openSession(monitor, DBCExecutionPurpose.META, "Read attribute values")) {
import org.jkiss.dbeaver.model.*;
                    columnName = columnName.substring(divPos + 1);
        if (!CommonUtils.isEmpty(prevWords)) {
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;
                        int divPos = wordPart.lastIndexOf(syntaxManager.getStructSeparator());
                                break;
    private DBRProgressMonitor monitor;
                if (i == 0) {
                final String[][] quoteStrings = sqlDialect.getIdentifierQuoteStrings();
                false);
                        TABLE_TO_ATTRIBUTE_PATTERN,

                    );
                        allowedKeywords.add(SQLConstants.KEYWORD_WHERE);
                        sqlDialect.getStructSeparator(),
            selectedContainers = new DBSObjectContainer[selectedObjects.length];
    public SQLCompletionAnalyzer(SQLCompletionRequest request) {
                    if (ALL_COLUMNS_PATTERN.equals(wordPart)) {
                }
            return;
        SQLWordPartDetector wordDetector = request.getWordDetector();
        }
                boolean endsOnStructureSeparator = objectName.charAt(objectName.length() - 1) == wordDetector.getStructSeparator();
        @Nullable DBPNamedObject object,
            case SQLCompletionContext.PROPOSAL_CASE_LOWER:
                                // Join?
        }


                        if (rootObject != null) {
        @Nullable DBSObjectContainer rootSC,
        }
                                            aliases.add(table.getAlias().getName().toLowerCase(Locale.ENGLISH));
                                SQLUtils.convertValueToSQL(dataSource.getDataSource(), attribute, valueHandler, valuePair.getValue(), DBDDisplayFormat.NATIVE, false);
                    word.length(), //cursorPosition the position of the cursor following the insert
                            keywordType,
                    joinableProposals.add(proposal);
                        if (contextDefaults != null) {
        final String catalogSeparator = sqlDialect.getCatalogSeparator();
                sc = (DBSObjectContainer) childObject;
                    }
    }
                    SQLDialect dialect = request.getContext().getSyntaxManager().getDialect();
            List<DBSObject> matchedObjects = new ArrayList<>();
                tableName = DBUtils.getQuotedIdentifier(parentObject);
                            alias = "";
                Collections.addAll(allowedKeywords, sqlDialect.getDMLKeywords());
        this.monitor = monitor;

                final String[] allNames = SQLUtils.splitFullIdentifier(name.getKey(), catalogSeparator, quoteStrings, false);
        Collection<DBSObjectReference> references = assistant.findObjectsByMask(monitor, request.getContext().getExecutionContext(), assistantParams);
                parent = realParent;
            if (!isInLiteral && !request.isSimpleMode() && !CommonUtils.isEmpty(prevWords)) {
                    String joinCriteria = SQLUtils.generateTableJoin(monitor, leftTable, DBUtils.getQuotedIdentifier(leftTable), (DBSEntity) rightTable, DBUtils.getQuotedIdentifier(rightTable));
        HippieProposalProcessor hippieProposalProcessor = new HippieProposalProcessor(wordPartDetector);
                    matchedKeywords.sort(Comparator.comparingInt(o -> TextUtils.fuzzyScore(o, request.getWordPart())));
            String[] allNames = SQLUtils.splitFullIdentifier(

        if (activeQuery != null && !CommonUtils.isEmpty(activeQuery.getText()) && !CommonUtils.isEmpty(wordPart)) {
                        }
                        if (DBSProcedure.class.isAssignableFrom(structObject.getObjectClass())) {
                request.getWordDetector().isQuoted(token) ? request.getWordDetector().removeQuotes(token) :
                if (!isObject) {
            if (aliasMode == SQLTableAliasInsertMode.EXTENDED) {
                    }
    protected static SQLCompletionProposalBase createCompletionProposal(
            case SQLCompletionContext.PROPOSAL_CASE_UPPER:
            }
public class SQLCompletionAnalyzer implements DBRRunnableParametrized<DBRProgressMonitor> {
                sc = (DBSObjectContainer) selectedObject;
                            if (!prevKeyWord.equalsIgnoreCase("INTO")) {
                        if (objPrefix != null) combinedMatch.append(objPrefix);
            DBSObject realParent = alias.getTargetObject(mdMonitor);
            for (Entry<String, String> name : names.entrySet()) {
                                proposals.remove(proposal);
            replaceString.length(), //cursorPosition the position of the cursor following the insert
                                                isInLiteral || isNumber,
                allowedKeywords = new HashSet<>();
                    if (filter != null && filter.isEnabled()) {
                    String prevWord = wordDetector.getPrevWords().get(0);
            2);
                DBSEntity rightTable = (DBSEntity) proposal.getObject();
                    } else {
    @Nullable
    }
 *
        DBSStructureAssistant<?> structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, dataSource);
        DBSInstance defaultInstance = dataSource == null ? null : dataSource.getDefaultInstance();
        } else if (token.equals(ALL_COLUMNS_PATTERN)) {
        final Set<String> proposalMap = new HashSet<>(proposals.size());
                            allowedKeywords.add(SQLConstants.KEYWORD_FROM);
                                if (!request.isSimpleMode()) {
        List<String> prevWords = wordDetector.getPrevWords();
 */
                            }

                        valueEnumeration = ((DBSAttributeEnumerable) attribute).getValueEnumeration(
        DBRProgressMonitor mdMonitor = request.getContext().getDataSource().getContainer().isExtraMetadataReadEnabled() ?
                    }


    @Override
        }
                // Escape replace string if required
            replaceString = convertKeywordCase(request, replaceString, isObject);
                Collections.addAll(allowedKeywords, sqlDialect.getExecuteKeywords());
    }
        }
                replaceString = objectName;
                            return !tableRefsAnalyzer.getFilteredTableReferences(s, false).isEmpty();
                    DBSObjectFilter filter = dsContainer.getObjectFilter(typeEntry.getKey(), entry.getKey(), true);
                            DBSEntityAttribute refAttribute = DBUtils.getReferenceAttribute(monitor, (DBSEntityAssociation) enumConstraint, attribute, false);
                    for (DBSObject object = childObject; object != null; object =  object.getParentObject()) {
        return null;
                    }
                            matchedObjects.add(child);
                aliasMode = SQLTableAliasInsertMode
                for (Map.Entry<Class<?>, List<SQLCompletionProposalBase>> typeEntry : entry.getValue().entrySet()) {
        while (token.endsWith(catalogSeparator)) {
                    }
                makeProposalsFromObject(
    private void makeProceduresProposals(@NotNull DBPDataSource dataSource, @NotNull String wordPart, boolean exec) throws DBException {
 */
                    replaceString = qo.getFullyQualifiedName(DBPEvaluationContext.DML);
        if (dataSource == null) {
            if (name != null && CommonUtils.isNotEmpty(name.getKey())) {
                    } else {
            if (parentObject != null) {
                        // Use fuzzy search for contains

    }

                        matchedObjects.sort((o1, o2) -> {
        {
        DBCExecutionContext executionContext = request.getContext().getExecutionContext();

            }
                        if (structureAssistant != null) {
                            null,
                if (!CommonUtils.isEmpty(wordDetector.getPrevWords())) {
                }
        }
        if (!SQLConstants.KEYWORD_WHERE.equals(prevWord)
        boolean isInLiteral = SQLParserPartitions.CONTENT_TYPE_SQL_STRING.equals(request.getContentType());
            } else {
                    }
        }
            if (childObject instanceof DBSObjectContainer) {

                            null,
            }
                                sqlValue,
                Collections.addAll(allowedKeywords, sqlDialect.getDDLKeywords());
                    continue;
                }
                } catch (DBException e) {

            } else {
            if (aliasMode != SQLTableAliasInsertMode.NONE) {
                } else {
        DBSObject selectedObject = getActiveInstanceObject();
                            tableName,
            Set<String> allowedKeywords = null;
                    objectName = wordDetector.removeQuotes(strings[strings.length - 1]);
                        }
    public static final int MAX_ATTRIBUTE_VALUE_PROPOSALS = 50;
                    objects.add(obj);
        String[] displayNames = hippieProposalProcessor.computeCompletionStrings(request.getDocument(), request.getDocumentOffset() - 1);
                            }
        if (selectedObject instanceof DBSObjectContainer) {
                    makeProposalsFromChildren(child, startPart, addFirst, Collections.emptyMap());
                            if (refAttribute != null) {
    private void makeProposalsFromAttributeValues(DBPDataSource dataSource, SQLWordPartDetector wordDetector, boolean isInLiteral, DBSEntity entity) throws DBException {
                    } else if (SQLConstants.KEYWORD_INTO.equals(prevKeyWord) &&
                            keyWord,
            Map<String, Object> params = new LinkedHashMap<>();
        DBPDataSource dataSource = request.getContext().getDataSource();
                            scoredMatches.put(child.getName(), score);
        final int proposalCase = request.getContext().getInsertCase();
                            // We do not need full routine name with parameters here
                                    request.getWordDetector().removeQuotes(token)
import org.jkiss.dbeaver.model.struct.*;
                    );
        if (request.getContext().getDataSource().getContainer().isExtraMetadataReadEnabled()) {
        } else if (token.equals(ALL_COLUMNS_PATTERN)) {
                }
        String wordPart = request.getWordPart();
            }
        }
        }
                    replaceString = DBUtils.getQuotedIdentifier(dataSource, object.getName());
    private SQLCompletionProposalBase makeProposalsFromObject(
                    return true;
        DBNNode node;
                    }
                            return DBUtils.nameComparatorIgnoreCase().compare(o1, o2);
                }
    private String makeObjectNameMask(String objectName, @Nullable DBSObjectContainer rootSC) {
                if (request.getContext().isUseFQNames() && object instanceof DBPQualifiedObject qo) {
            throw new InvocationTargetException(e);
            if (CommonUtils.isEmpty(objectName)) {
        List<String> prevWords = joinTableDetector.getPrevWords();
                if (delimiter.equals(ALL_COLUMNS_PATTERN) ||
    public List<SQLCompletionProposalBase> getProposals() {
        request.setWordPart(searchPrefix);
                parentObject = tableColumn.getParentObject();
            }
        }
                                // Fall-thru
    }
                                                dataSource,
    {

                        SQLConstants.KEYWORD_INSERT.equals(prevKeyWord)
                            tableAlias,
                            makeProposalsFromChildren(obj, null, false, parameters);
            } else if (!isInLiteral) {
                    // add top level objects to proposals
                    }
                            //request.setQueryType(SQLCompletionRequest.QueryType.COLUMN);
        String replaceString,

import org.jkiss.code.NotNull;
                            false);
                    proposals.addAll(0, childProposals);
        if (!emptyWord && !isInLiteral && !isInQuotedIdentifier) {
                                            makeProposalsFromAttributeValues(
            return MATCH_ANY_PATTERN + objectName + MATCH_ANY_PATTERN;
                            if (o1 instanceof DBSAttributeBase && o2 instanceof DBSAttributeBase) {
                        && dataSource instanceof DBSObjectContainer) {
                    if (keywordType == DBPKeywordType.KEYWORD) {
        String prevKeyWord = wordDetector.getPrevKeyWord();
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
                        if (alias.equalsIgnoreCase(object.getName())) {
            if (i == tokens.length - 1 && !request.getWordDetector().getWordPart().endsWith(".")) {
            if (dataSource.getContainer().getPreferenceStore().getBoolean(ENABLE_HIPPIE)) {
                    }
                !isInLiteral &&
    public boolean isSearchFinished() {
            replaceString, // replacementString
                    } else {
            return;
    private static final String TABLE_TO_ATTRIBUTE_PATTERN = "%s%s%s";
                        DBDValueHandler valueHandler = DBUtils.findValueHandler(session, attribute);
            null, //image to display
                break;
                    } else if (getActiveInstanceObject() == null) {
        if (dataSource == null) {
                                    true,
                String delimiter = wordDetector.getPrevDelimiter();
                    if (CommonUtils.isEmpty(valueEnumeration) && attribute instanceof DBSAttributeEnumerable) {
                        !CommonUtils.isEmpty(wordDetector.getNextWord()))
            if (name != null && CommonUtils.isNotEmpty(name.getKey())) {
        }
            }
            isFQName,
                    makeProposalsFromChildren(rootObject, wordPart, false, parameters);
            SQLDialect sqlDialect = dataSource.getSQLDialect();
                                    @Override
        if (children != null && !children.isEmpty()) {
                    if (dataSource != null && request.getContext().isSortAlphabetically()) {
            return null;
                    } else if (SQLConstants.KEYWORD_INTO.equals(prevKeyWord) && !isPrevWordEmpty && ("(*".equals(prevDelimiter) ||
            }

    }
                    }
            DBPDataSourceContainer dsContainer = dataSource.getContainer();
                    null, //image to display
                                TablesNamesFinder<?> namesFinder = new TablesNamesFinder<>() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
                                        }
                SQLDialect dialect = SQLUtils.getDialectFromObject(object);
                        DBPImage attrImage = null;
                if (dialect.supportsAliasInSelect() && request.getActiveQuery() != null) {
        // Detect selected object (container).
                    SQLCompletionProposalBase proposal2 = proposals.get(j);
        }
                } else {
                    .fromPreferences(((DBSEntity) object).getDataSource().getContainer().getPreferenceStore());
                    .indexOf(request.getContext().getSyntaxManager().getStructSeparator()) == -1) {
                                    false,
                            false,
                }
        for (Entry<String, String> name : names.entrySet()) {
                        makeDataSourceProposals(parameters);
                }
        SQLScriptElement activeQuery = request.getActiveQuery();
            token = token.substring(0, token.length() - 1);
            List<String> matchedKeywords = Collections.emptyList();
                        arrayIndex = objectsNames.length - 1;
        List<String> prevWords = wordDetector.getPrevWords();
                            if (defaultCatalog != null) {

            return null;

                List<SQLCompletionProposalBase> list = typeMap.computeIfAbsent(objectType, k -> new ArrayList<>());
                    params));
                        wordDetector.shiftOffset(-SQLCompletionAnalyzer.ALL_COLUMNS_PATTERN.length());
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            if (!combinedMatch.isEmpty()) {
        return false;
            displayString,
                        !SQLConstants.KEYWORD_INTO.equals(prevKeyWord)
import org.jkiss.dbeaver.model.sql.completion.hippie.HippieProposalProcessor;
