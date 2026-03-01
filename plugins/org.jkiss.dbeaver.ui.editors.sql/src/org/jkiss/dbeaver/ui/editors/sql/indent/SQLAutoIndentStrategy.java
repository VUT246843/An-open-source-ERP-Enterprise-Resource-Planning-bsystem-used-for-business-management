        int previousTokenPos = scanner.getPosition();
	        }
        try {
            	case '"':
    	Unknown,
                        buf.append(beginIndentaion);
                }
        }
            }
            }
                        SQLParserPartitions.SQL_PARTITIONING,

        if (autoCompletionSupported) {

        registerCompletionInfo("IF", new String[] { " THEN", SQLBlockCompletions.NEW_LINE_COMPLETION_PART,
                    (lineDelimiter || (command.text.length() == 1 && !Character.isJavaIdentifierPart(command.text.charAt(0)))) &&
     */
            return;
	                    break;

                buf.setLength(0);
    /**
        		}
    private boolean isBlocksCompletionEnabled() {

                endsWithLF = true;
    
        try {
            return false;
            		inComment = true;
                            if (sourceViewer instanceof ITextOperationTarget) {

                log.debug(e);
        SQLHeuristicScanner scanner = new SQLHeuristicScanner(document, syntaxManager);
        boolean inComment = false;
    
            return;

	                    result.append("\t");
                break;
    
    private final String oneIndent = SQLIndenter.createIndent().toString();
        if (command.text != null && command.text.length() > MINIMUM_SOUCE_CODE_LENGTH) {

        this.syntaxManager = syntaxManager;
                        buf.append(adjustCase(token, part));

                break;
        if (syntaxManager.getDialect().getKeywordType(keyword) == DBPKeywordType.KEYWORD) {
                    );
        return endsWithLF;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        return GeneralUtils.getDefaultLineSeparator();
        int quoteStart = -1, quoteEnd = -1;
        	}
        int docLength = document.getLength();
                        char lastTokenChar = lastTokenString.charAt(lastTokenString.length() - 1);
            	}
        CommentType commentType = CommentType.Unknown; 
            pos--;
                }
                    // (but only if string in quotes doesn't end with linefeed - we don't need doubles)
            }
        registerCompletionPair("LOOP", "END", "LOOP");

                        }
            	switch (ch) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        int pos = command.offset - 1;
                                ((ITextOperationTarget) sourceViewer).doOperation(ITextOperationTarget.UNDO);
            int contentStart = findEndOfWhiteSpace(document, command.offset, lineEnd);
    private boolean endsWithLF(StringBuilder result, char lfChar) {
        		else if (commentType == CommentType.EndOfLine && ch == '\n') {
    /**

    private static final boolean KEYWORD_INDENT_ENABLED = false;
            log.error(e);
            begin = scanner.findOpeningPeer(begin, blockInfo);
        boolean endsWithLF = false;
                    if (IDocument.DEFAULT_CONTENT_TYPE.equals(typeAtLine)) {
            }
//                }

                        });
            int start = reg.getOffset();
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPMessageType;
                if (lastTokenString != null) {
        }
	        if (inString) {
            } else if (Character.isUnicodeIdentifierPart(ch)) {

    }};
                            // Next line should contain some keyword then - let's unindent
            } catch (BadLocationException e) {

        }
package org.jkiss.dbeaver.ui.editors.sql.indent;
            }
        registerCompletionPair("CASE", "END");

                return false;
                return false;
	                        break;
                        } else {
        }
                boolean isPrevLetter = command.offset > 0 && Character.isJavaIdentifierPart(document.getChar(command.offset - 1));
    private int getTokenCount(int startOffset, int endOffset, SQLHeuristicScanner scanner,
	        	}
            if (!Character.isWhitespace(lch)) {
        }
    private enum CommentType {
		            }
            completion.getHeadCancelTokenId() == null || ((int)completion.getHeadCancelTokenId()) != prevPreviousToken
        }
                    DBeaverNotifications.showNotification(
            if (lineDelimiter) {
            for (String[] qs : quoteStrings) {
                            // Last token seems to be some identifier (table or column or function name)
	                case 'n':
    private boolean isLineDelimiter(IDocument document, String text) {
    }
        int prevPreviousToken = completion == null || completion.getHeadCancelTokenId() == null ?
                        result.append(ch);
        }
	                case 't':
     */
        }
    }
    private SQLSyntaxManager syntaxManager;
                        "SQL query was extracted from the source code",
                int nlIndent = syntaxManager.getDialect().getKeywordNextLineIndent(lastTokenString);
        }
    	Block,
        if (indent == null) {
            if (SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT.equals(region.getType())) {
    
        for (int i = quoteStart + 1; i < quoteEnd; i++) {
                return document.getLineDelimiter(0);
 *
                        () -> {
            log.warn(e);
        for (int i = 0; i < sourceCode.length(); i++) {
	                        result.append("\n");
        while (pos >= 0 && Character.isWhitespace(document.getChar(pos))) {
        for (int i = 0, l = value.length(); i < l; i++) {

    private static boolean isLowerCase(String value) {
        int begin = offset;
        String beginIndentaion = "";
            final char lch = result.charAt(k - 1);
            ITypedRegion region = TextUtilities.getPartition(document, partitioning, start, true);
                wsCount++;
        if (delimiters == null) {
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_BLOCKS);
            }
            document.replace(command.offset, command.length, command.text);
        endPos = pos + 1;

    /**
    }
        final String keyword = document.get(startPos, endPos - startPos);
    private String partitioning;
            return false;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
                boolean isQuote = isIdentifierQuoteString(command.text);
        catch (BadLocationException e) {
                case '\r':
            delimiters = document.getLegalLineDelimiters();
        } catch (Exception e) {
        SQLBlockCompletionInfo completion = isBlocksCompletionEnabled() ? DEFAULT_SQL_BLOCK_COMPLETIONS.findCompletionByHead(previousToken) : null;
        command.length = 0;
                    //if (beginIndentaion.isEmpty()) {
                return 1;
        		}
import org.jkiss.dbeaver.model.DBPKeywordType;
            		inString = true;
//        }
	                    break;
                } else {
        for (int k = result.length(); k > 0; k--) {
                            indent = indenter.unindent(indent, 1);
        }
            SQLHeuristicScanner.NOT_FOUND : scanner.previousToken(previousTokenPos, SQLHeuristicScanner.UNBOUND);
        int wsCount = 0;
            return 1;

    private static final Log log = Log.getLog(SQLAutoIndentStrategy.class);
		        }
        }
            if (ch == '"') {
                    } else {
        command.doit = false;
        return true;
    public void customizeDocumentCommand(IDocument document, DocumentCommand command)
     * there are more closing than opening peers, and a positive number if there are more opening than closing peers.
//            return;
            if (end == -1) {
        command.caretOffset = command.offset + result.length();
        return delimiters != null && TextUtilities.equals(delimiters, text) > -1;
            final char ch = sourceCode.charAt(i);

                    if (lastTokenString.length() > 0) {
import org.jkiss.dbeaver.Log;
                start = document.getLineInformationOfOffset(region.getOffset()).getOffset();
    private static String adjustCase(String example, String value) {
                command.caretOffset = command.offset + buf.length();

            end = scanner.findClosingPeer(end, blockInfo);
            }
            }
                    // we are in the nonempty line and previous position doesn't belong to the comment, string literal or command
	                    }

    {
            indent = indenter.computeIndentation(command.offset);
    }
                break;

     */
//                    indent = beginIndentaion;
            return -1;
        }
        String lastTokenString = scanner.getLastToken();
        command.text = null;
                    }
            }
//        } else if (nextToken == SQLIndentSymbols.TokenEND) {
                quoteEnd = i;
            		break;
        for (int i = sourceCode.length() - 1; i >= 0; i--) {
                    if (result.length() > 0 && !endsWithLF(result, '\n') && !endsWithLF(result, '\r')) {
                beginIndentaion = indenter.getReferenceIndentation(command.offset);
            if (ch == '"') {
            
        final int startPos, endPos;
            indent = ""; //$NON-NLS-1$
                            // Keep current indent
                }
            final boolean lineDelimiter = isLineDelimiter(document, command.text);
import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
    }
            int nextToken = scanner.nextToken(startOffset, endOffset);
                        document,
                    if (part == SQLBlockCompletions.NEW_LINE_COMPLETION_PART) {
        char prevChar = (char)-1;
            		commentType = CommentType.Unknown;
     * Creates a new SQL auto indent strategy for the given document partitioning.
                    }

	                default:
        }
import org.jkiss.dbeaver.utils.GeneralUtils;

        //get previous token
            command.text = buf.toString();
        		if (commentType == CommentType.Unknown && prevChar == '/' && ch == '*') {
	                    inString = false;
                return -1;
        try {

 * Licensed under the Apache License, Version 2.0 (the "License");
            beginIndentaion = indenter.getReferenceIndentation(command.offset);
	                case '"':
        char escapeChar = '\\';

        }
    				inComment = false;
            boolean isKeywordCaseUpdated = false;
                tokenCount++;
        startPos = pos + 1;
            if (!Character.isJavaIdentifierPart(ch) && (commandPrefix == null || commandPrefix.indexOf(ch) == -1)) {
            int lineEnd = reg.getOffset() + reg.getLength();
        if (docLength == 0) {
                    break;
                }
        }
            command.caretOffset = command.offset + buf.length();
import org.eclipse.jface.text.*;

	                        result.append("\r");
                if (str.equals(SQLConstants.STR_QUOTE_SINGLE) || str.equals(qs[0]) || str.equals(qs[1])) {
                        if (lastTokenChar == ',' || lastTokenChar == ':' || lastTokenChar == '-') {
/*
        final String commandPrefix = syntaxManager.getControlCommandPrefix();
            if (Character.isUpperCase(value.charAt(i))) {
	                    if (ch == escapeChar) {
            if (nextToken != SQLIndentSymbols.TokenEOF && nextToken == token) {
                } else if (nlIndent < 0) {
        if (quoteStart == -1 || quoteEnd == -1) {
    private ISourceViewer sourceViewer;

                // Letter or bracket before quote
            } else {
    }
            if (!fixedKeyword.equals(keyword)) {
        }
	        	else {
                        DBeaverNotifications.NT_GENERIC,
        this.partitioning = partitioning;
            indent = indenter.getReferenceIndentation(command.offset);
 *
            }
        this.sourceViewer = sourceViewer;
import org.jkiss.dbeaver.model.sql.SQLConstants;
                    } else if (part.equals(SQLBlockCompletions.ONE_INDENT_COMPLETION_PART)) {
        int end = offset;
            StringBuilder buf = new StringBuilder(command.text + indent);
	        	if (prevChar == escapeChar) {
    private boolean transformSourceCode(IDocument document, DocumentCommand command) {
        }
    private static String getLineDelimiter(IDocument document) {
        // Let's check that source code has some whitespaces
                break;
        }
            }

                }
            	case '/':

            log.error(e);
        }
    }
            final char ch = sourceCode.charAt(i);
        }
        // Whitespace - check for keyword
        
            }
 * DBeaver - Universal Database Manager
                    syntaxManager.getPreferenceStore().getBoolean(SQLPreferenceConstants.SQL_FORMAT_KEYWORD_CASE_AUTO)
        return false;
            		break;
//        if (!command.doit) {
            }
            IRegion reg = document.getLineInformation(line);
            }
            if (begin == -1) {
        if (offset < 1) {
	                    }
    private void smartIndentAfterNewLine(@NotNull IDocument document, @NotNull DocumentCommand command, boolean isLastTokenCaseUpdated) {

    }
                for (String part: completion.getCompletionParts()) {

        return isLowerCase(example) ? value.toLowerCase() : value.toUpperCase();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    indent = indenter.unindent(beginIndentaion, nlIndent);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            if (autoCompletionSupported && getBlockBalance(document, command.offset, completion) > 0 && getTokenCount(start, command.offset, scanner, previousToken) > 0) {

    }

 * See the License for the specific language governing permissions and
                        DBPMessageType.INFORMATION,
        			commentType = CommentType.Block;

                smartIndentAfterNewLine(document, command, isKeywordCaseUpdated);
            else {
                ) {
                        true
                if (transformSourceCode(document, command)) {
                        final String token = isLastTokenCaseUpdated ? syntaxManager.getKeywordCase().transform(lastTokenString) : lastTokenString;
                if (command.offset > 1 && isPrevLetter && !isQuote &&
        }
                if (nlIndent > 0) {
    private int getBlockBalance(IDocument document, int offset, SQLBlockCompletionInfo blockInfo) {
                }

            int position = scanner.getPosition();
            command.length = Math.max(contentStart - command.offset, 0);
            if (lch == lfChar) {

        int previousToken = scanner.previousToken(command.offset - 1, SQLHeuristicScanner.UNBOUND);
        } else {
                if (completion.getTailEndTokenId() != null) {
            }
public class SQLAutoIndentStrategy extends DefaultIndentLineAutoEditStrategy {
                quoteStart = i;
     * Returns the block balance, i.e. zero if the blocks are balanced at <code>offset</code>, a negative number if
                command.doit = false;
            
            if (previousToken == SQLIndentSymbols.TokenKeyword) {
        if (offset >= document.getLength()) {
            }
                    return true;
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
        }

        for (int i = quoteStart; i < quoteEnd; i++) {
 */
 * limitations under the License.
        SQLHeuristicScanner scanner = new SQLHeuristicScanner(document, syntaxManager);

            int p = (command.offset == docLength ? command.offset - 1 : command.offset);
	                    result.append(ch);
                return 0;
        if (quoteStrings != null) {
        		else if (commentType == CommentType.Unknown && prevChar == '/' && ch == '/') {
 * distributed under the License is distributed on an "AS IS" BASIS,
	                    break;
    public SQLAutoIndentStrategy(String partitioning, ISourceViewer sourceViewer, SQLSyntaxManager syntaxManager) {
                        isKeywordCaseUpdated = updateKeywordCase(document, command);
        String sourceCode = command.text;
                        result.append(ch == '\n' ? "\n" : "\r");
        		else if (commentType == CommentType.Block && prevChar == '*' && ch == '/' ) {
        }
            try {
            if (syntaxManager.getPreferenceStore().getBoolean(SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE)) {
     * To count token numbers from start offset to end offset.
        boolean autoCompletionSupported = completion != null && (

    private String[] delimiters;
                    indent = beginIndentaion;
                        buf.append(oneIndent);

    	EndOfLine
    private boolean isIdentifierQuoteString(String str) {
            } else {
//                } else {
	                    if (!endsWithLF(result, '\r')) {
                            // Do not unindent (#5753)
        StringBuilder result = new StringBuilder(sourceCode.length());
                command.addCommand(startPos, endPos - startPos, fixedKeyword, null);
        SQLIndenter indenter = new SQLIndenter(document, syntaxManager, scanner);
        }
                    // Append linefeed even if it is outside of quotes
        }
            document.replace(command.offset, command.text.length(), result.toString());
	                case 'r':
        return false;
    static final SQLBlockCompletions DEFAULT_SQL_BLOCK_COMPLETIONS = new SQLBlockCompletionsCollection() {{
                indent = indenter.getReferenceIndentation(command.offset);
            final String fixedKeyword = syntaxManager.getKeywordCase().transform(keyword);
            else if (inComment) {
            final char ch = sourceCode.charAt(i);
 * You may obtain a copy of the License at
	                    break;

		            switch (ch) {
		            switch (ch) {
                            }
            if (begin == -1 && end == -1) {
        while (pos >= 0) {
        return true;
                    }
        String indent;
        } catch (BadLocationException e) {

        }, "END", "IF");
        int tokenCount = 0;

        int nextToken = scanner.nextToken(command.offset, SQLHeuristicScanner.UNBOUND);
        if (command.offset < 0) {
            pos--;
        while (true) {
        		}
        );
            SQLBlockCompletions.ONE_INDENT_COMPLETION_PART, SQLBlockCompletions.NEW_LINE_COMPLETION_PART, "END IF", SQLBlockCompletions.NEW_LINE_COMPLETION_PART
        boolean inString = false;
            }
    private static final int MINIMUM_SOUCE_CODE_LENGTH = 10;
        		}
            }
        } else if (command.length == 0 && command.text != null) {
                    }
}
            startOffset = position;
        			commentType = CommentType.EndOfLine;
                case '\n':
                // Letter before quote
    }
    				inComment = false;
	                    if (!endsWithLF(result, '\n')) {
//            indent = indenter.getReferenceIndentation(command.offset + 1);
                        command.offset - 1,
 *
                return true;
    private boolean updateKeywordCase(final IDocument document, DocumentCommand command) throws BadLocationException {
                return false;
            if (Character.isWhitespace(sourceCode.charAt(i))) {
                        "SQL transformation (click to undo)",

    }
            } else if (Character.isUnicodeIdentifierPart(ch) || ch == '{' || ch == '<' || ch == '[') {
        if (wsCount < 3) {
    }
        } else if (KEYWORD_INDENT_ENABLED) {
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
        }
    {
    }
        registerCompletionPair("BEGIN", "END");
	                default:
        while (startOffset < endOffset) {
                        buf.append(getLineDelimiter(document));
import org.eclipse.jface.text.source.ISourceViewer;
            }
 * Unless required by applicable law or agreed to in writing, software
            if (document.getNumberOfLines() > 1) {
    }

import org.jkiss.dbeaver.model.sql.SQLUtils;
                    command.caretOffset = command.offset;
        // Do not check for doit because it is disabled in LinkedModeUI (e.g. when braket triggers position group)
                break;
            }
                              int token)
            int line = document.getLineOfOffset(p);

                }
            prevChar = ch;
            char ch = document.getChar(pos);
	                    }
                    indent = beginIndentaion + indenter.createIndent(nlIndent).toString();
                    lastTokenString = lastTokenString.trim();
    @Override
                    String typeAtLine = TextUtilities.getContentType(
        String[][] quoteStrings = syntaxManager.getIdentifierQuoteStrings();
                    }
        return tokenCount;

	                    break;
import org.jkiss.code.NotNull;
            command.shiftsCaret = false;
