
            Arrays.stream(dialect.getQueryKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
        return ArrayUtils.contains(dialect.getBlockHeaderStrings(), firstKeyword) ||
                }
                } else if (region.getLength() > 0) {

                )) {
                if (!token.isWhitespace() && !token.isEOF()) {
            }
        SQLDialect dialect,
            log.warn(e);
        }
        // Parse range
                    }
                    }

                        log.trace("Found leftover blocks in script after parsing");
                if (element instanceof SQLQuery query) {
                                         : null;
    }
     *
                }
                        SQLQueryParameter param = null;
                } else if (tokenType == SQLTokenType.T_BLOCK_TOGGLE) {
                            boolean hasValuableChars = false;
            if (Character.isLetter(c)) {
        }
 *
                            parameters = new ArrayList<>();
                                orderPos,
                                    break;
                        }
                SQLQuery lastElement = captureCurrElement ? (SQLQuery) currElement : prevElement;
                            if (!hasValuableChars) {
                            String variableName = SQLQueryParameter.stripVariablePattern(paramName);
        }
        String sqlScriptContent
        DBPPreferenceStore preferenceStore,

            ? ((IDocumentExtension3) document).getDocumentPartitioner(SQLParserPartitions.SQL_PARTITIONING)
            }

                    // Detect query type
            }
                } else {
                                preparedParamName = paramName.substring(1);
                Arrays.stream(dialect.getBlockHeaderStrings()).map(String::toUpperCase).forEach(statementStartKeywords::add);
            int tokenLength = ruleScanner.getTokenLength();
                ? (SQLTokenType) tpTokenDefault.getData()
                    predicateEvaluator.captureToken(new SQLTokenEntry(tokenText, tokenType, false));
                        if (ArrayUtils.containsIgnoreCase(sqlDialect.getDDLKeywords(), tokenText)) {
                    // Block end followed by block begin (as CASE and LOOP are block begin tokens)
            while (token != null && token.getType() != -1 && token.getChannel() != Token.DEFAULT_CHANNEL) {
        } else if (region.getOffset() >= 0) {
            }
                    String queryText = document.get(statementStart, tokenOffset - statementStart);
                context.getRuleManager(),
                                            for (int i = delimOffset; i <= lastPos; i++) {
            }
            new SQLPartitionScanner(dataSource, dialect, ruleManager),
                    String commandId = null;
                    if (tokenOffset >= document.getLength()) {
                                    orderPos++;
            }
        private SQLQuery findSmartStatementBegginning(@NotNull SQLQuery element) {
                        // make script line
                        statementStart++;
        SQLTokenPredicateEvaluator predicateEvaluator = new SQLTokenPredicateEvaluator(dialect.getSkipTokenPredicates());
    }
        }
            Arrays.stream(dialect.getDDLKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
        public SQLScriptElement tryPrepareExtendedElement(@NotNull SQLQuery element) {
                while (matcher.find(position)) {
                    realEnd = tailEnd;
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
                            param = new SQLQueryParameter(
                            param.setPrevious(getPreviousParameter(parameters, param));

                        if (curBlock != null) {
                    assert (tokenOffset >= currentPos);
                }

                    if (curBlock != null) curBlock = curBlock.parent;
                } else if (isDelimiter && curBlock != null) {
                        if (parameters != null) {
     */
    public static SQLScriptElement parseQuery(
                                currentPos = region.getOffset() + delimIndex - 1;
        final boolean keepDelimiters,
    }
        }
            }
                log.warn("Error parsing query", e);
                    if (isDelimiter &&
            context.getPreferenceStore().getBoolean(ModelPreferences.SQL_PARAMETERS_IN_EMBEDDED_CODE_ENABLED);
                int currLineEnd = currLine.getOffset() + currLine.getLength();
                        assert prev == currElement;
        String firstKeyword = null, lastKeyword = null;
        IDocument document = context.getDocument();
                e.printStackTrace(new PrintWriter(buf, true));
                    firstLine--;
        

                queryOffset = query.getOffset() + query.getLength();
                if (query == null) {
import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;
                        hasBlocks = false;
                currentPos++;
        ruleManager.loadRules();
            SQLScriptElement nextElement = extractNextQueryImpl(this.context, element, true);
                            statementStart,
                        predicateEvaluator.reset();
            boolean isControl = false;
import org.jkiss.utils.CommonUtils;
                    }
                    // and it does not contain any delimiters, then that statement should be extracted.
            for (int queryOffset = startOffset; ; ) {
    }
    }
                    it.remove();
        if (element instanceof SQLQuery queryElement && context.getSyntaxManager().getStatementDelimiterMode().useSmart) {
    ) {
                        hasBlocks = true;
                    switch (tokenType) {
        @NotNull IDocument document,
                        (command.getCommandId() != null &&
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
    }
                            tokenOffset - queryOffset,
                    break;
            if (text.length() > 0) {
                return null;
            if (blockBoundStrings != null) {
                element = new SQLQuery(context.getDataSource(), selText, region.getOffset(), region.getLength());
        return tryExpandElement(extractNextQueryImpl(context, curElement, next), context);
                    if (!Character.isWhitespace(c)) {
        for (; ; ) {

                        parameters.add(parameter);
                    // In some dialects block end looks like END CASE, END LOOP. It is parsed as
 */
        }
                    (!hasNextLine || (hasNextLine && currentPos < document.getLineInformation(currLineIndex + 1).getOffset()))
                        // and will not be ended until we leave the block at least
                                                if (!Character.isWhitespace(document.getChar(i))) {
        final SQLDialect sqlDialect = context.getDialect();
        if (document.getLength() == 0) {
        boolean hasValuableTokens = false;
        IDocumentPartitioner partitioner = document instanceof IDocumentExtension3
            for (SQLCommandHandlerDescriptor controlCommand : SQLCommandsRegistry.getInstance().getCommandHandlers()) {
        final boolean scriptMode,
            );
                }
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
            }
                        log.warn(e);
                    }
            SQLScriptElement prevElement = extractNextQueryImpl(this.context, element, false);
                }
        boolean execQuery = false;
                if (isDelimiter) {
        SQLSyntaxManager syntaxManager = context.getSyntaxManager();
    ) {
import org.jkiss.dbeaver.model.sql.*;

import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.SQLTokenEntry;

     *
    ) {

                if (parameters.get(i - 1).getVarName().equals(varName)) {
                                        }
        if (element instanceof SQLQuery) {
        }
                        );
        syntaxManager.init(dataSource.getSQLDialect(), dataSource.getContainer().getPreferenceStore());
                        hasValuableTokens = true;
                SQLQuery prevElement = queryStart;
    }
                boolean cursorInsideToken = currentPos >= tokenOffset && currentPos < tokenOffset + tokenLength;
                            isDefaultPartition(partitioner, document.getLineOffset(firstLine))) {
        ScriptBlockInfo(ScriptBlockInfo parent, boolean isHeader, boolean isPredicateHeaderBlock) {
            try {
                        curBlock = new ScriptBlockInfo(curBlock, false);
                                } else if (p.getTokenOffset() < start) {
            if (firstElement instanceof SQLQuery queryStart && !queryStart.isEndsWithDelimiter() && it.hasNext()) {
                        return null;
                currentPos = lineOffset;
            : context.getSyntaxManager().getStatementDelimiterMode().useBlankLine; // respect blank lines always in single query exec if set
        }
                    try {
            return token != null && (
                                if (p.getTokenOffset() == start) {
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
                    String controlText = document.get(tokenOffset, tokenLength);
            } catch (BadLocationException ex) {
            char c = document.getChar(curPos);
        int cursorPosition,
                            continue;
                        }
        } catch (BadLocationException e) {
            if (dialect.getTransactionRollbackKeywords() != null) {
                    int observablePosition = currentPos < document.getLength() ? currentPos : currentPos - 1;
                            for (SQLQueryParameter p : parameters) {

        SQLScriptElement curElement = extractQueryAtPos(context, offset, false);
                log.warn("Error parsing variables", e);
                                        if (docLength > delimOffset) {
                                curPos = region.getOffset() + region.getLength();
        int length,
                    it.previous();
        boolean scriptMode,
        return tryExpandElement(extractQueryAtPosImpl(context, currentPos, forceExtractComments), context);
        if (parseParameters) {
        DBPDataSource dataSource,
                        tokenOffset = endPos;
                    {
                    SQLTokenPredicate lastMatchedPredicate = predicateEvaluator.getLastMatchedPredicate();
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLControlToken;
                    extractionEnd = headElement.getOffset() + headElement.getOriginalText().length();
        return -1;
                    // because it apparently is a head of the next query to handle on the next iteration
                }
                        isControl = true;
                    if (token instanceof SQLControlToken) {
                        if (execQuery && paramName.equals(String.valueOf(syntaxManager.getAnonymousParameterMark()))) {
        try {
            int currentLine = originalPosLine;
                curPos = curElement.getOffset() - 1;
                if (token.isEOF()) {
        private final Set<String> statementStartKeywords;
                            // Add delimiter in the end of query. Do this only for semicolon delimiters.
                        !prevElement.isEndsWithDelimiter()
        return queryList;
                query.setEndsWithDelimiter(tailElement.isEndsWithDelimiter());
                    int letterBeforeComment = skipCommentsBackTillLetter(document, partitioner, observablePosition, currLine.getOffset());
        parserContext.startScriptEvaluation();
                    // remove leading spaces
                }
                    } else if (aChar == ')' || aChar == '}' || aChar == ']') {
        boolean newTokenCaptured = false;
        }
                lastElement = nextQueryFragment;
        ScriptBlockInfo(ScriptBlockInfo parent, boolean isHeader) {
            return statementStartKeywordsByDialect.computeIfAbsent(context.getDialect(), d -> prepareStatementStartKeywordsSet(context));
                        tokenOffset = document.getLength();
                    if (tokenType == SQLTokenType.T_DELIMITER) {

            boolean takePrev = true;

import org.jkiss.dbeaver.model.lsm.LSMAnalyzerParameters;
    ) {
            } finally {
        SQLTokenType prevNotEmptyTokenType = SQLTokenType.T_UNKNOWN;
        try {
            return statementStartKeywords;
        return SQLScriptParser.extractScriptQueries(parserContext, 0, sqlScriptContent.length(), true, false, true);
                            lastMatchedPredicate.getParameter(),
            return null;
        partitioner.connect(sqlDocument);
                        queryEndPos += tokenLength;
        int lfCount = 0;

        int statementStart = startPos;
        if (blockBoundStrings != null) {
                }
        TPRuleBasedScanner ruleScanner = context.getScanner();
                            if (parameters == null) {
            try {
        @NotNull final SQLParserContext context,
        @NotNull final SQLParserContext context,
                        context.getDataSource(),
    ) {
    public static SQLScriptElement extractActiveQuery(SQLParserContext context, int selOffset, int selLength) {
        return null;
    }
            }
            }

                    if (tokenOffset == statementStart) {
            // Parse parameters
import org.jkiss.dbeaver.model.stm.STMSource;
        return element;
                        ((scriptMode || cursorInsideToken) && !hasValuableTokens)
                if (region.getOffset() >= 0 && region.getLength() > 0) {
                }
                            if (Character.isLetterOrDigit(delim.charAt(0))) {
                    if (captureCurrElement) {
        try {
                            statementStart,
                return new SQLQuery(context.getDataSource(), buf.toString());
                            lastKeyword = document.get(tokenOffset, tokenLength);

                    newTokenCaptured = true;
                        if (!supportParamsInEmbeddedCode && (ddlQuery || insideDollarQuote)) {
import org.eclipse.jface.text.*;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.ArrayUtils;
            } else {
                }
            for (; ; ) {
    public static SQLScriptElement extractNextQuery(@NotNull SQLParserContext context, int offset, boolean next) {
        boolean parseParameters
import org.jkiss.dbeaver.model.text.parser.TPRuleBasedScanner;
        }
                        } else {
    private static boolean needsDelimiterAfterBlock(String firstKeyword, String lastKeyword, SQLDialect dialect) {
        final ScriptBlockInfo parent;
        return SQLScriptParser.extractScriptQueries(parserContext, 0, sqlScriptContent.length(), true, false, true);
        @Nullable SQLScriptElement curElement,
                curPos = curElement.getOffset() + curElement.getLength();
            }
    public static SQLScriptElement extractQueryAtPos(SQLParserContext context, int currentPos, boolean forceExtractComments) {
                        (hasBlocks && dialect.isDelimiterAfterQuery()) ||
                    startPos = document.getLineOffset(firstLine);
                            }
import java.util.*;
        IDocument document = context.getDocument();
                this.analyzerParameters
        String varName = parameter.getVarName();
                if (document.getChar(i) == '\n') {
                    if (tokenType == SQLTokenType.T_COMMENT) {
                    assert prev == firstElement;
                tokenOffset = document.getLength();
        if (document.getLength() == 0) {

                    } catch (BadLocationException e) {
                Arrays.stream(abstractSQLDialect.getNonTransactionKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
                        String preparedParamName = null;

            try {
        boolean isPredicateEvaluationEnabled = isPredicateEvaluationEnabled();

                        while (curBlock != null && curBlock.isHeader) {
        // (this may occur if user selected statement including delimiter)
    @Nullable
        sqlDocument.setDocumentPartitioner(SQLParserPartitions.SQL_PARTITIONING, partitioner);
        return SQLScriptParser.extractQueryAtPos(parserContext, cursorPosition, true);
                        }
            } catch (BadLocationException ex) {
                            queryText,

            SQLQuery headElement = this.elementStartsProperly(element) ? element : this.findSmartStatementBegginning(element);
        while (it.hasNext()) {
                }
                }
    private static void expandQueries(@NotNull SQLParserContext parserContext, @NotNull List<SQLScriptElement> queryList) {
                    }
        String selText = null;
                                                    break;
                    // see https://github.com/dbeaver/pro/issues/3935
                    // if there is nothing to capture, return the currElement back
            }
                    if (lastMatchedPredicate != null && lastMatchedPredicate.getActionKind() == SQLParserActionKind.CAPTURE_COMMAND) {
            return prepareExtendedSQLScriptElement(extendedHead, tailElement);
            return true;
                            }
                    if (partitioner != null) {
        boolean next
                            predicateEvaluator.obtainPrefixCaptures()
                            context.getDataSource(),
        boolean isHeader; // block started by DECLARE, FUNCTION, etc
            while (currentPos < docLength && isMultiCommentPartition(partitioner, currentPos)) {
                        return null;

            }
    }
        int pos,
        private static final Set<Integer> statementStartTokenIds = LSMInspections.prepareOffquerySyntaxInspection().predictedTokenIds();
 * You may obtain a copy of the License at
                !Boolean.TRUE.equals(lastElement.isEndsWithDelimiter()) &&

import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardLexer;

                    }

                        SQLQueryParameter parameter = new SQLQueryParameter(
        boolean useBlankLines = scriptMode
        SQLParserContext parserContext = prepareSqlParserContext(dataSource, dialect, preferenceStore, sqlScriptContent);
                            break;
            }
                            }
        }
        }
        if (syntaxManager.isParametersEnabled()) {
                int lineOffset = document.getLineOffset(currentLine);
    public static List<SQLQueryParameter> parseParametersAndVariables(SQLParserContext context, int queryOffset, int queryLength) {
        
        }
                    }
    /**
                    statementStartKeywords.add(block[0]);
                        curBlock = curBlock.parent;
                    }
 * limitations under the License.
                for (String[] block : blockBoundStrings) {
                    {
        String sqlScriptContent
                    }
                return query;
                new Document(selectedQueryText)

                                matcher.end() - matcher.start()
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
                    }
            log.warn(e);
    }
        String[][] blockBoundStrings = dialect.getBlockBoundStrings();
                            break;
    }
                            }
        }
        DBPDataSource dataSource,
        return partitioner != null && SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT.equals(partitioner.getContentType(currentPos));
            if (curPos <= 0 || curPos >= docLength) {
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.SQLTokenPredicateEvaluator;
        }

    }
                            context.getDataSource(),
        SQLParserContext ctx = new SQLParserContext(
            Arrays.stream(dialect.getDMLKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
                            }
            }
                int position = 0;
            SQLQuery extendedHead = headElement == element ? element : this.prepareExtendedSQLScriptElement(headElement, element);
                    (lineFeedIsDelimiter && token.isWhitespace() && document.get(tokenOffset, tokenLength).contains("\n"));
 * distributed under the License is distributed on an "AS IS" BASIS,

                        }
                }
                if (tokenType == SQLTokenType.T_BLOCK_HEADER) {
     * @param startPos       the start position
                        if (param == null) {
                if (token.isEOF() || tokenOffset > queryOffset + queryLength) {
            for (int i = parameters.size(); i > 0; i--) {
import org.jkiss.dbeaver.model.text.TextUtils;
        }
                        int start = matcher.start();
 * See the License for the specific language governing permissions and
            this.parent = parent;
            String delimiterText = null;
                            );
                boolean inTailComment = SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT.equals(partitioner.getContentType(currentPos));
                }
                        boolean isDelimiter = false;
                } else {
                } else if (tokenType == SQLTokenType.T_SET_DELIMITER || tokenType == SQLTokenType.T_CONTROL) {
                                paramName,
                        if (paramMark.equals("$")) {
        }
                    if (curBlock != null && curBlock.isHeader) {

import java.io.PrintWriter;
            try {
                }
                    // This is not a valid command
        private SQLQuery findSmartStatementEnding(@NotNull SQLQuery element) {
                    }
        }
     * @param scriptMode     the script mode
    private static SQLScriptElement extractNextQueryImpl(
                                    param = p;
                    }
                                }
                    } else {
        ScriptBlockInfo(ScriptBlockInfo parent, String togglePattern) {
                    } catch (BadLocationException e) {
                    // So let's ignore block begin if previous token was block end and there were no delimiters.
                    }
                        hasBlocks = true;
        SQLParserContext parserContext = new SQLParserContext(dataSource, syntaxManager, ruleManager, sqlDocument);
            int docLength = document.getLength();
                            // Move pos before it if there are no valuable chars between delimiter and cursor position
        DBPPreferenceStore preferenceStore,
                        context.getSyntaxManager(),
        final boolean scriptMode,
                int firstLine = currentLine;
            return false;
     * @param sqlScriptContent the sql script content
     * @return the sql script element

                int headEnd = headElement.getOffset() + headElement.getLength();
            return false;
                    startPos = currentPos = region.getOffset();
import org.jkiss.dbeaver.model.stm.LSMInspections;
                        curBlock = new ScriptBlockInfo(curBlock, togglePattern);
        }
        final boolean keepDelimiters

                        tokenOffset--;
        ruleScanner.setRange(document, queryOffset, queryLength);

                        togglePattern = document.get(tokenOffset, tokenLength);
        if (syntaxManager.isVariablesEnabled()) {
                if (lineFeedIsDelimiter) {
                    char c = document.getChar(curPos);
                lastTokenLineFeeds = 0;
                            queryEndPos - statementStart,
                        if (parameters == null) {

    private static int countLineFeeds(final IDocument document, final int offset, final int length) {
                    }
            SQLScriptElement extendedElement = continuationDetector.tryPrepareExtendedElement(queryElement);
            // SQL Server needs delimiters after MERGE
                    }
                boolean isDelimiter = (tokenType == SQLTokenType.T_DELIMITER) ||
        // FIXME: special workaround for Oracle
                                    break;
            String commandPrefix = context.getSyntaxManager().getControlCommandPrefix();
                    }
                        firstKeyword = null;
                        (keepDelimiters ||
                    prevNotEmptyTokenType = tokenType;
        }
                                if (!Character.isWhitespace(document.getChar(i))) {

                    int offsetFromLineStart = currentPos - region.getOffset();
            }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    if (currentLine == firstLine) {
                    it.remove(); // remove currElement while it is a continuation of the query started at the firstElement
        public ScriptElementContinuationDetector(@NotNull SQLParserContext context) {
                if (inTailComment) {
        int startOffset,
            selText = SQLUtils.trimQueryStatement(syntaxManager, selText, !syntaxManager.getDialect().isDelimiterAfterQuery());
        if (parameter.isNamed()) {
                        
            Token token = lexer.nextToken();
                    tokenType = SQLTokenType.T_UNKNOWN;
                        isDelimiter = true;
    public static List<SQLQueryParameter> parseParametersAndVariables(SQLParserContext context, String selectedQueryText) {
                    if (curBlock != null && togglePattern.equals(curBlock.togglePattern)) {
    ) {
                        }
                while (curPos < docLength) {
                        );
                }
 *
            if (useBlankLines) {
                            queryEndPos - statementStart
import org.jkiss.dbeaver.model.impl.sql.AbstractSQLDialect;

        if (curElement == null) {
                }
                nextElement.getOffset() > lastElement.getOffset()
                    boolean cursorInsideToken = currentPos >= tokenOffset && currentPos <= tokenOffset + tokenLength;
                                parameters = new ArrayList<>();
                if (firstKeyword) {
                    }
                            curBlock = curBlock.parent;
                }
                    return null;
                        if (preparedParamName == null) {
        final int startPos,
                if (tokenType == SQLTokenType.T_DELIMITER && prevNotEmptyTokenType == SQLTokenType.T_BLOCK_BEGIN) {
        boolean forceExtractComments
                        // Prev line empty too. No chance.
                if (isDelimiter) {
        if (!CommonUtils.isEmpty(selText)) {
                return curPos;
        @NotNull SQLParserContext parserContext,
            if (next) {
        }
                    }
                if (headEnd > tailEnd) {
        } finally {
                nextElement = extractNextQueryImpl(this.context, lastElement, true);
        boolean lineFeedIsDelimiter = ArrayUtils.contains(statementDelimiters, "\n");
        }

    private static boolean isMultiCommentPartition(IDocumentPartitioner partitioner, int currentPos) {
                    query.setParameters(parseParametersAndVariables(parserContext, query.getOffset(), query.getLength()));
                        }
                        // if we are still inside the block, so statement definitely hasn't ended yet
                    }
                    }
                        togglePattern = "";
                        continue;
                        tokenType == SQLTokenType.T_SET_DELIMITER);
            expandQueries(parserContext, queryList);
        return partitioner == null || IDocument.DEFAULT_CONTENT_TYPE.equals(partitioner.getContentType(currentPos));
                            curBlock = curBlock.parent;
                }
                        curBlock = new ScriptBlockInfo(curBlock, true, true);
        SQLDialect dialect,

        DBPPreferenceStore preferenceStore,
        parserContext.setPreferenceStore(preferenceStore);
                        statementStart = tokenOffset + tokenLength;
        int limit
    private static boolean isPredicateEvaluationEnabled() {
        ) {
                    case SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT: {
                        case T_KEYWORD:
                                paramName,
        }
                        query.setEndsWithDelimiter(tokenType == SQLTokenType.T_DELIMITER);
        }
            log.debug(e);
        boolean next
        SQLDialect dialect = context.getDialect();

                    } else {
                        SQLQuery query = new SQLQuery(
     */
                    )) && it.hasNext()) {
                                                    hasValuableChars = true;

                        return command;
                return null;
        return parameters;
import org.jkiss.code.NotNull;
                boolean hasNextLine = currLineIndex + 1 < document.getNumberOfLines();


            return null;
                    }
        if (dialect.needsDelimiterFor(firstKeyword, lastKeyword)) {
                if (tokenType == SQLTokenType.T_BLOCK_TOGGLE) {
                    isDelimiter = true;
     * @param endPos         the end position
    @NotNull
                    }
    }
                // This is a command
            if (parsedElement instanceof SQLControlCommand) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else {
                    statementStart = tokenOffset + tokenLength;
                IRegion currLine = document.getLineInformation(currLineIndex);
                    position = matcher.end();
            }
            parserContext.endScriptEvaluation();

            ArrayUtils.contains(dialect.getDDLKeywords(), firstKeyword);
                    if (tokenOffset > endPos) {
    ) {
            }
                        }
                            // There is a delimiter in current line
        return parserContext;
        return element;
                SQLQuery query = new SQLQuery(this.context.getDataSource(), text, start, realEnd - start);
        String property = System.getProperty(CLI_ARG_DEBUG_DISABLE_SKIP_TOKEN_EVALUATION); // Turn off processor settings save.
                        }
                final int tokenOffset = ruleScanner.getTokenOffset();

                            preparedParamName,
                    return true;
                while (firstLine > 0) {
/*
                                // Skip literal delimiters
                    String lineStr = document.get(region.getOffset(), offsetFromLineStart);
                        log.warn(e);
    static protected final Log log = Log.getLog(SQLScriptParser.class);
        List<SQLQueryParameter> parameters = null;
                        case T_BLOCK_TOGGLE:
        }
        }
 * SQL parser
            for (SQLScriptElement element : queryList) {
        }
        if (selText != null && context.getPreferenceStore().getBoolean(ModelPreferences.QUERY_REMOVE_TRAILING_DELIMITER)) {
                prevElement = extractNextQueryImpl(this.context, lastElement, false);
        }
            return extractQueryAtPosImpl(context, curPos, false);
                Arrays.stream(dialect.getTransactionCommitKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
                    lastTokenLineFeeds = tokenLength < 2 ? 0 : countLineFeeds(document, tokenOffset + tokenLength - 2, 2);
            if (!lineFeedIsDelimiter) {
                }
            this.context = context;
        int lastTokenLineFeeds = 0;
                        currElement instanceof SQLQuery queryElement && !continuationDetector.elementStartsProperly(queryElement) &&
                        !Boolean.TRUE.equals(prevQueryFragment.isEndsWithDelimiter()) ||
                return headElement;
            }
        if (parserContext.getSyntaxManager().getStatementDelimiterMode().useSmart) {
            element = null;
            }
                            if (firstKeyword == null) {
                final String[] statementDelimiters = context.getSyntaxManager().getStatementDelimiters();
            SQLQuery lastElement = element;
            }
                    // remove trailing spaces
            if (dialect instanceof AbstractSQLDialect abstractSQLDialect) {
                        } else {
                        }
    }
                    // replace the original query head element with extended element
            }
        public SQLQuery prepareExtendedSQLScriptElement(
    private static int skipCommentsBackTillLetter(
    public static SQLParserContext prepareSqlParserContext(
                // Find variables in strings, comments, etc
                    // that block is not preceded by the prefix e.g 'AS', because in many dialects
                    if (aChar == '(' || aChar == '{' || aChar == '[') {
                        if (delimIndex != -1) {
                            // DDL doesn't support parameters
/*
                        int delimIndex = lineStr.lastIndexOf(delim);
        syntaxManager.init(dialect, preferenceStore);
            this.togglePattern = togglePattern;
                if (lastElement != firstElement) {
 * DBeaver - Universal Database Manager
                IRegion region = document.getLineInformation(currentLine);
    @Nullable
                            parameters.size(),
                if (hasValuableTokens && (token.isEOF() || (isDelimiter && tokenOffset + tokenLength >= currentPos) || tokenOffset > endPos)) {
                if (startPos == 0) {
                    continue;
        } catch (BadLocationException e) {

        if (length <= 0 || length > document.getLength()) {
                int tailEnd = tailElement.getOffset() + tailElement.getLength();
        }
import org.antlr.v4.runtime.Token;
                            break;
                    if (useBlankLines) {
                    }
        int lastPos = currentPos >= docLength ? docLength - 1 : currentPos;
            }
                }
        SQLDialect dialect,
                }
                        log.warn("Can't extract query parameter", e);
    }
            } catch (BadLocationException e) {
                            curBlock = curBlock.parent;
                            case SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT: {
                                continue;
    public static List<SQLScriptElement> parseScript(DBPDataSource dataSource, String sqlScriptContent) {
                }
    private static SQLQueryParameter getPreviousParameter(List<SQLQueryParameter> parameters, SQLQueryParameter parameter) {
                    String togglePattern;
                    // Check for bracket block begin/end
                            queryText,
                                isDelimiter = true;
        String sqlScriptContent,
                                    }
                    while (statementStart < tokenOffset && Character.isWhitespace(document.getChar(statementStart))) {
        return tryExpandElement(parseQueryImpl(context, startPos, endPos, currentPos, scriptMode, keepDelimiters, false), context);
        return CommonUtils.isEmpty(property);

                        hasBlocks = true;
                log.debug("Token location is outside of the document boundaries during query parsing");
            return null;
        @Nullable
                tokenLength = 0;
                    lfCount++;
            }
package org.jkiss.dbeaver.model.sql.parser;
                    SQLScriptElement prev = it.previous();
                            if (delim.indexOf(c) != -1) {
                                syntaxManager,
                    break;
            while (

        return parseQueryImpl(context, startPos, document.getLength(), currentPos, false, false, forceExtractComments);
                    }
import org.jkiss.dbeaver.model.text.parser.TPToken;
     * @param currentPos     the current position
                            }
                    while (statementStart < tokenOffset && Character.isWhitespace(document.getChar(tokenOffset - 1))) {
                                                break;
            @NotNull SQLQuery tailElement
                }
            // This may happen during parameters parsing. Query may be trimmed or modified
                            for (int i = region.getOffset() + delimIndex + delim.length(); i < currentPos; i++) {
 */
                if (!inTailComment && currentPos >= currLineEnd &&
            return lastElement;
    private static final String CLI_ARG_DEBUG_DISABLE_SKIP_TOKEN_EVALUATION = "dbeaver.debug.sql.disable-skip-token-evaluation";
                        String tokenText = document.get(tokenOffset, tokenLength);
        IDocumentPartitioner partitioner = document instanceof IDocumentExtension3 ? ((IDocumentExtension3)document).getDocumentPartitioner(SQLParserPartitions.SQL_PARTITIONING) : null;
        boolean isPredicateHeaderBlock;
        boolean useBlankLines = syntaxManager.getStatementDelimiterMode().useBlankLine;
                    } catch (BadLocationException e) {
        boolean lineFeedIsDelimiter = ArrayUtils.contains(context.getSyntaxManager().getStatementDelimiters(), "\n");
                                }
                }
                    (takePrev = (
            int tokenOffset = ruleScanner.getTokenOffset();
        return  parseParametersAndVariables(ctx, 0, selectedQueryText.length());
                                            }
        int cursorPosition
                }
                    // there's no direct header block terminators

        boolean insideDollarQuote = false;
                    }
                        for (String delim : statementDelimiters) {
                        case T_UNKNOWN:
            // Move to default partition. We don't want to be in the middle of multi-line comment or string
                            } else {
        private static final Map<SQLDialect, Set<String>> statementStartKeywordsByDialect = Collections.synchronizedMap(new WeakHashMap<>());
            query.setParameters(parseParametersAndVariables(context, query.getText()));
    public static List<SQLScriptElement> extractScriptQueries(
                            if (ArrayUtils.contains(syntaxManager.getNamedParameterPrefixes(), paramMark)) {
            SQLParserPartitions.SQL_CONTENT_TYPES);

                    newTokenCaptured = false;
        final int docLength = document.getLength();

                int start = headElement.getOffset();
        return tryExpandElement(extractNextQueryImpl(context, curElement, next), context);

            Arrays.stream(dialect.getExecuteKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
            String multilineCommandPrefix = commandPrefix.repeat(2);
            }
        String sqlScriptContent,
        final int endPos,
                    }
            return null;
                if (tokenType == SQLTokenType.T_BLOCK_BEGIN && prevNotEmptyTokenType == SQLTokenType.T_BLOCK_END) {


                }

                        // first previous() call returns currElement again, if we didn't remove it yet
                                preparedParamName = paramName;
                            // TODO: move this transformation into SQLDialect
                        for (String delim : statementDelimiters) {
                    curPos++;
            }
            } else {
            SQLSyntaxManager syntaxManager = context.getSyntaxManager();
            this.togglePattern = null;
                        tokenLength++;
            this.parent = parent;
        } catch (BadLocationException e) {

            }

        var continuationDetector = new ScriptElementContinuationDetector(parserContext);
                return null;
        SQLParserContext parserContext = prepareSqlParserContext(dataSource, dialect, preferenceStore, sqlScriptContent);
                    firstKeyword = false;
                    } else {
    ) {
                            case SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT:
                        case T_BLOCK_BEGIN:
                            }
                    realEnd = headEnd;
                    }
                }
                                int delimOffset = document.getLineOffset(firstLine) + offset + delim.length();
                                            }
                    // Delimiter in some brackets or inside block. Ignore it.
            if (extendedElement != null) {
    }
        DBPDataSource dataSource,
                // This may happen with EOF tokens (bug in jface?)
            final StringJoiner text = new StringJoiner(CommonUtils.getLineSeparator());
                                    hasValuableChars = true;
                }
                while ((captureCurrElement = (
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

                    if (actionKind == SQLParserActionKind.SKIP_SUFFIX_TERM) {
        // LinkedList is crucial to prevent copy on expand and for many-to-one replacements efficiency
                if (isControl && (
    }
                    currentLine--;
                SQLTokenType tokenType = token instanceof TPTokenDefault

                    }
                            final int offset = TextUtils.getOffsetOf(document, firstLine, delim);
                    // Save delimiter text
        }


     * Parses sql query.
                    }
                SQLScriptElement query = parseQueryImpl(parserContext, queryOffset, startOffset + length, queryOffset, scriptMode, keepDelimiters, false);
                        hasValuableTokens = false;
                    extractionEnd = tailElement.getOffset() + tailElement.getOriginalText().length();
                    // Control query
                    }
            }
            this.isPredicateHeaderBlock = isPredicateHeaderBlock;
                return extendedElement;
        @Nullable IDocumentPartitioner partitioner,
 * Unless required by applicable law or agreed to in writing, software
        ruleManager.loadRules(dataSource, false);
                Arrays.stream(dialect.getTransactionRollbackKeywords()).map(String::toUpperCase).forEach(statementStartKeywords::add);
            if (tokenOffset + tokenLength > document.getLength()) {
/**
        final IRegion region = regions[0];
                                preparedParamName = variableName;
                    // Another trick. If BEGIN follows with delimiter then it is not a block (#7821)
                    case SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT:
                    if (actionKind == SQLParserActionKind.BLOCK_HEADER) {
                        case T_BLOCK_HEADER:
        boolean firstKeyword = true;
        );
                region.getOffset(), region.getOffset() + region.getLength(), region.getOffset(), false, false);

        IDocument document = context.getDocument();
    }
                }
    public static SQLScriptElement extractActiveQuery(@NotNull SQLParserContext context, @NotNull IRegion[] regions) {
        }
import org.jkiss.dbeaver.model.sql.registry.SQLCommandsRegistry;
                        tokenOffset,
            for (int i = offset; i < offset + length; i++) {
    public static SQLScriptElement parseQuery(
            }
                int extractionEnd;
                    // Check for blank line delimiter
                    char aChar = document.getChar(tokenOffset);
    private static SQLScriptElement tryExpandElement(SQLScriptElement element, SQLParserContext context) {
            Set<String> statementStartKeywords = new HashSet<>();
        DBPPreferenceStore preferenceStore,
                        if (TextUtils.isEmptyLine(document, firstLine) &&
                        }
                        }
        IDocument document = context.getDocument();
                        it.remove();
                    if (curBlock != null) {
import java.util.regex.Matcher;
                    )) && !elementStartsProperly(prevElement) && prevElement.getOffset() < lastElement.getOffset()
                        (needsDelimiterAfterBlock(firstKeyword, lastKeyword, dialect))))
        private final SQLParserContext context;
                    SQLControlCommand command = new SQLControlCommand(
        }
                    return parameters.get(i - 1);
                }
                SQLScriptElement currElement = it.next();
    }
        final int currentPos,

                    }
        }
    }
        TPRuleBasedScanner ruleScanner = context.getScanner();
                }
                        case T_BLOCK_END:
                    if (currentLine == 0) {
        if (element == null || CommonUtils.isEmpty(element.getText())) {
                    if (curBlock != null) {
 *
                    if (lastTokenLineFeeds + countLineFeeds(document, tokenOffset, tokenLength) >= 2) {
        int startPos = 0;
            } catch (BadLocationException e) {
                            parameters.add(param.getOrdinalPosition(), param);
public class SQLScriptParser {
                            log.trace("SQLScriptParser: blocks structure recognition inconsistency - trying to leave toggled block on non-togging token");
                // Move currentPos at line begin
            this(parent, isHeader);
            if (partitioner != null) {
                            execQuery = ArrayUtils.containsIgnoreCase(sqlDialect.getExecuteKeywords(), tokenText);
                            paramName,
                        // Sometimes (e.g. when comment finishing script text)
                selText = text.toString();
        }
                    if (letterBeforeComment >= currLine.getOffset()) {
    }

                                         ? (SQLTokenType) ((TPTokenDefault) token).getData()

                } else if (tokenType == SQLTokenType.T_BLOCK_BEGIN) {


                    if (isPredicateEvaluationEnabled) {
    private static SQLScriptElement extractQueryAtPosImpl(SQLParserContext context, int currentPos, boolean forceExtractComments) {
import java.io.StringWriter;

                if (tokenLength == 1) {
                prevElement instanceof SQLQuery prevQueryFragment &&

            SQLQuery boundaryElement = prevElement instanceof SQLQuery prevQueryElement && takePrev ? prevQueryElement : lastElement;
                            tokenLength
                    SQLParserActionKind actionKind = predicateEvaluator.evaluatePredicates();
                if (bb[0].equals(firstKeyword)) {
import org.jkiss.dbeaver.model.lsm.sql.dialect.SQLStandardAnalyzer;
        SQLParserContext parserContext = prepareSqlParserContext(dataSource, dialect, preferenceStore, sqlScriptContent);
    }
                                            boolean hasValuableChars = false;
                            curBlock = curBlock.parent;

                                                }
                } else if (tokenType == SQLTokenType.T_BLOCK_END) {
            String[][] blockBoundStrings = dialect.getBlockBoundStrings();
        SQLParserContext parserContext = new SQLParserContext(dataSource, syntaxManager, ruleManager, sqlDocument);
                int realEnd;
                int currLineIndex = document.getLineOfOffset(currentPos);
                        return new SQLControlCommand(
        private static Set<String> getStatementStartKeywords(SQLParserContext context) {
            SQLQuery query = (SQLQuery) element;
                    hasBlocks = true;
        boolean forceExtractComments
 * you may not use this file except in compliance with the License.
            SQLTokenType tokenType = token instanceof TPTokenDefault tpTokenDefault

                    try {
                            String paramName = matcher.group(SQLQueryParameter.VARIABLE_NAME_GROUP_NAME);
                final int tokenLength = ruleScanner.getTokenLength();
                                break;
        var it = queryList.listIterator();
                    if (TextUtils.isEmptyLine(document, currentLine)) {
                } else if (tokenType == SQLTokenType.T_COMMENT) {
        ScriptBlockInfo curBlock = null;
                    if (actionKind == SQLParserActionKind.BEGIN_BLOCK) {

        final int startPos,
        DBPDataSource dataSource,

            return queryList;
        if (partitioner != null) {
                    text.add(context.getDocument().get(region.getOffset(), region.getLength()));
    
                        }
                        String paramMark = paramName.substring(0, 1);
        FastPartitioner partitioner = new FastPartitioner(

                    }
                        }
            return boundaryElement;
                switch (region.getType()) {
                        curPos = region.getOffset() - 1;
        if (firstKeyword == null) {
            int curPos;
                            SQLCommandsRegistry.getInstance().getCommandHandler(command.getCommandId()) != null)) {
                                if (isDefaultPartition(partitioner, delimOffset)) {
    ) throws BadLocationException {
                    hasBlocks = true;
            );
                            // Skip ? parameters for stored procedures (they have special meaning? [DB2])


                // Use selected query as is
            /*if (currentLine != originalPosLine) {
                        }
                    inTailComment = SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT.equals(partitioner.getContentType(currLineEnd - 1));
                token = TPTokenAbstract.EOF;
            if (dialect.getTransactionCommitKeywords() != null) {
    public static List<SQLScriptElement> parseScript(
                curPos = skipCommentsBackTillLetter(document, partitioner, curPos, 0);
    /**
        boolean keepDelimiters,
            this.analyzerParameters = LSMAnalyzerParameters.forDialect(this.context.getDialect(), this.context.getSyntaxManager());
        private boolean elementStartsProperly(@NotNull SQLScriptElement element) {
                    curBlock = new ScriptBlockInfo(curBlock, true);
        if (!dialect.isDelimiterAfterBlock()) {
            curPos--;
import org.jkiss.dbeaver.model.DBPDataSource;
                    if (!captureCurrElement) {
    }
                    isControl = false;
     * @param dialect          the dialect
                        continue;
                            }
                    // This is a tricky thing.
                queryList.add(query);
            if (tokenOffset < startPos) {
            }
        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
                        }
        return SQLScriptParser.extractQueryAtPos(parserContext, cursorPosition, forceExtractComments);

                    }


                            }
                            // Quite dirty workaround needed for Oracle and SQL Server.
                    // Drop header block if it is followed by a regular block and
                Matcher matcher = SQLQueryParameter.getVariablePattern().matcher(query);
            var continuationDetector = new ScriptElementContinuationDetector(context);
                if (tokenType == SQLTokenType.T_PARAMETER && tokenLength > 0) {
        @Nullable SQLScriptElement curElement,
        }
            }
                    int queryEndPos = tokenOffset;
                }
            {
                                firstKeyword = lastKeyword;
                    if (command.isEmptyCommand() ||
        // Check query do not ends with delimiter
                    it.add(continuationDetector.prepareExtendedSQLScriptElement(queryStart, lastElement));
        final String[] statementDelimiters = syntaxManager.getStatementDelimiters();
                // Handle only parameters which are not in SQL blocks
                        commandId = ((SQLControlToken) token).getCommandId();
                    }
                        }
                            if (offset >= 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        boolean supportParamsInEmbeddedCode =
import org.jkiss.dbeaver.ModelPreferences;
                        // header blocks seems optional and we are in the block either way
        private final LSMAnalyzerParameters analyzerParameters;
    }
        private static Set<String> prepareStatementStartKeywordsSet(SQLParserContext context) {
import org.eclipse.jface.text.rules.FastPartitioner;
                statementStartKeywords.add(multilineCommandPrefix + controlCommand.getId().toUpperCase());
     * @param keepDelimiters the keep delimiters option
            ) {
}        if (!SQLConstants.BLOCK_END.equalsIgnoreCase(lastKeyword)) {
     * @return the sql script element
                    try {
import org.jkiss.dbeaver.Log;
        SQLDialect dialect,

            } else */
                if (isPredicateEvaluationEnabled && tokenLength > 0 && !token.isWhitespace()) {
    private static class ScriptElementContinuationDetector {
                        int orderPos = 0;
        if (queryOffset + queryLength > document.getLength()) {
                            ddlQuery = true;
                }
                        return query;
                    curBlock = new ScriptBlockInfo(curBlock, false);
        @NotNull SQLParserContext context,
                selText = SQLUtils.fixLineFeeds(selText);
                        if (curBlock.isPredicateHeaderBlock || !ArrayUtils.containsIgnoreCase(dialect.getInnerBlockPrefixes(), lastKeyword)) {
    }
        // Extract part of document between empty lines
                        continue;
                        }
            return false;
                    prevElement = (SQLQuery) currElement;
            @NotNull SQLQuery headElement,
            SQLStandardLexer lexer = SQLStandardAnalyzer.createLexer(
        int curPos = pos;
                    // like 'BEGIN ... END' but 'DECLARE ... BEGIN ... END'
                        isControl = false;
                    delimiterText = document.get(tokenOffset, tokenLength);
    private static SQLScriptElement parseQueryImpl(
                        curBlock = new ScriptBlockInfo(curBlock, false);
        }
*/
        return lfCount;
                        );
     * @param preferenceStore  the preference store
                StringWriter buf = new StringWriter();
    public static SQLScriptElement extractNextQuery(
        ruleScanner.setRange(document, startPos, endPos - startPos);
                        commandId,
            TPToken token = ruleScanner.nextToken();
        } catch (BadLocationException e) {
            }
        final int endPos,
                        String paramName = document.get(tokenOffset, tokenLength);
                    }
                token = lexer.nextToken();

            int originalPosLine = document.getLineOfOffset(currentPos);
        firstKeyword = firstKeyword.toUpperCase(Locale.ENGLISH);
                        controlText.trim(),
                        ITypedRegion region = partitioner.getPartition(curPos);
        }
                lastElement = prevQueryFragment;
                    currElement = it.next();
                                continue;
                        if (!isDelimiter) {
                        parameter.setPrevious(getPreviousParameter(parameters, parameter));
                        switch (region.getType()) {
                    if (!hasValuableTokens || cursorInsideToken) {
    }
                        // if we are in the single-line comment and there are letters before the comment, then extract
            queryLength = document.getLength() - queryOffset;
                        if (curBlock.togglePattern != null) {
            : null;
            if (dialect.getBlockHeaderStrings() != null) {
                boolean captureCurrElement;
            for (IRegion region : regions) {
                            continue;
                            queryText += delimiterText;

        SQLSyntaxManager syntaxManager = context.getSyntaxManager();

        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
                }
        final String togglePattern;
                            }
                statementStartTokenIds.contains(token.getType()) || statementStartKeywords.contains(token.getText().toUpperCase())
                if (!hasValuableTokens && !token.isWhitespace() && !isControl) {
        boolean hasBlocks = false;
                            if (!variableName.equals(paramName)) {
                    // If there is a statement preceding a command (e.g., @ai, @echo)
            SQLQuery tailElement = this.findSmartStatementEnding(extendedHead);
            ? context.getSyntaxManager().getStatementDelimiterMode().useSmart // respect blank lines in script mode if smart mode is on
                }
                } else if (useBlankLines && token.isWhitespace() && tokenLength > 1) {
                                }
        @NotNull SQLParserContext context,
            SQLScriptElement firstElement = it.next();
                                            if (hasValuableChars) {
            SQLScriptElement parsedElement = SQLScriptParser.parseQuery(
                statementStartKeywords.add(commandPrefix + controlCommand.getId().toUpperCase());
                    if (curBlock != null && !token.isEOF()) {
                        hasValuableTokens = dialect.supportsCommentQuery() || forceExtractComments;
                                start,
                    insideDollarQuote = !insideDollarQuote;
                        }
                        currentPos = letterBeforeComment;
                if (isPredicateEvaluationEnabled && !token.isEOF() && newTokenCaptured) {
                        prev = it.previous();
        try {
                        // Empty statement
                : SQLTokenType.T_OTHER;
            }
                        }
                            }
     * @param cursorPosition   the cursor position
    
    public static SQLScriptElement parseQuery(
     * Parses sql query.
                        if (token.isEOF()) {
                if (token.isWhitespace() || tokenType == SQLTokenType.T_COMMENT) {

            for (String[] bb : blockBoundStrings) {
                        if (delimiterText != null && delimiterText.equals(SQLConstants.DEFAULT_STATEMENT_DELIMITER)) {
        final SQLScriptElement element;
    private static boolean isDefaultPartition(IDocumentPartitioner partitioner, int currentPos) {
        while (curPos >= limit) {
    }

            return null;
                            // For SQL server add it in the end of query. For Oracle only after END clause
        try {
import org.jkiss.code.Nullable;
        Document sqlDocument = new Document(sqlScriptContent);
                // Move currentPos before last delimiter
            log.error(e);
            element = extractQueryAtPos(context, region.getOffset(), false);
                    queryText = SQLUtils.fixLineFeeds(queryText);
                    statementStart = tokenOffset;
            SQLDialect dialect = context.getDialect();


        }
            this.isHeader = isHeader;

                                                startPos = delimOffset;
                context.getSyntaxManager(),
    ) {
        int length = endPos - startPos;

                if (tokenLength > 0 && !token.isWhitespace()) {
                TPToken token = ruleScanner.nextToken();
                    String tokenText = document.get(tokenOffset, tokenLength);
                    }
                    continue;
        }
        Document sqlDocument = new Document(sqlScriptContent);
        boolean ddlQuery = false;
                ) {
        List<SQLScriptElement> queryList = new LinkedList<>();
                !elementStartsProperly(nextElement) &&
                String query = document.get(queryOffset, queryLength);
                if (TextUtils.isEmptyLine(document, currentLine)) {
                context.getDataSource(),

                if (dialect.isStripCommentsBeforeBlocks() && tokenType == SQLTokenType.T_BLOCK_HEADER && prevNotEmptyTokenType == SQLTokenType.T_COMMENT) {
                }
            }
                    }
        return extractActiveQuery(context, new IRegion[]{new Region(selOffset, selLength)});
                        // last token offset is beyond document range
                context,

                    for (String delim : statementDelimiters) {
                                    if (currentPos > startPos) {
                String text = this.context.getDocument().get(start, extractionEnd - start);
                element = parsedElement;
            this.statementStartKeywords = getStatementStartKeywords(this.context);
                        prevElement.getOffset() + prevElement.getLength() >= lastElement.getOffset() + lastElement.getLength()
            ) {
     * @param context        the context



            SQLQuery lastElement = element;
                        }
                            syntaxManager,
                // Use regex
                        || (token.isEOF() || (isDelimiter && tokenOffset + tokenLength >= currentPos))
                }
        IDocument document = parserContext.getDocument();
                    }
                        tokenLength,
        final int currentPos,
            while (nextElement instanceof SQLQuery nextQueryFragment &&
                STMSource.fromString(element.getOriginalText()),
                            return null;
                ITypedRegion region = partitioner.getPartition(curPos);
                    }
        }
    private static class ScriptBlockInfo {
                        continue;
                }
