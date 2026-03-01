
     * <code>bound</code>. The return value is one of the constants defined in {@link SQLIndentSymbols}. After a call,
                from = bound == UNBOUND ? 0 : bound + 1;

    /**
                }
    /* preset stop conditions */
     * @param start       the start position
        int offset = start;
     * Finds the smallest position in <code>fDocument</code> such that the position is &gt;= <code>position</code>
            return TokenOTHER;


            token = nextToken(offset, document.getLength());
        assert (partition != null);
     *                  &gt; <code>start</code>, or <code>UNBOUND</code>
                    return lastPos;
 * You may obtain a copy of the License at
        return lastPos;

        private boolean isDelimiterChar(char ch) {
            return TokenOTHER;
            }

    private String lastToken;

     * The partitioning being used for scanning.
        int token;
                to = pos;


    }
            lastToken = String.valueOf(lastChar);
    /**
    public String getLastToken() {
     */
/*
     *
        }

    public int findNonWhitespaceForwardInAnyPartition(int position, int bound) {
        }
     */
     * @param start     the first character position in <code>fDocument</code> to be considered
import org.eclipse.jface.text.TextUtilities;
     * @return <code>true</code> if <code>position</code> is in the default partition of <code>document</code>,
        try {
     * @return the matching peer character position, or <code>NOT_FOUND</code>
    /**
     * token being searched.</p>
    /**
     * Stops at any delimiter or non-whitespace character

                return headCancelToken == UNBOUND ? offset : nextTokenOffset;
    /**
     * @param position the first character position in <code>fDocument</code> to be considered
            }
                to = bound == UNBOUND ? document.getLength() : bound;
    /**

     *
     * @param start the start position
     * @return the matching peer character position, or <code>NOT_FOUND</code>
    }
        } while (token != SQLIndentSymbols.TokenEOF);
     * Returns the position of the closing peer token (forward search). Any scopes introduced by opening peers
    /**
        }
     * <p/>
        this.syntaxManager = syntaxManager;
     * @param condition the <code>StopCondition</code> to check
     * The document being scanned.

        assert (start <= document.getLength());
                if (condition.stop(lastChar, lastPos, true)) {
    public boolean isDefaultPartition(int position) {
        int prevToken = NOT_FOUND;
            offset = getPosition();
//        }

     * {@link #getPosition()}will return the position just after the scanned token (i.e. the next position that will be
     * @param start the first character position in the document to consider
        }
            lastPos = start;
    }
     * @param blockInfo information about opening peer character (e.g. 'begin'), closing peer character (e.g. 'end') and 
        public boolean stop(char ch, int position, boolean forward) {
            // operators, number literals etc

            try {
    public int scanForward(int start, int bound, StopCondition condition) {
        @Override
    }
        try {


    private final StopCondition _nonIdent = new NonSQLIdentifierPartDefaultPartition();

     * <code>false</code> otherwise
        int closingPeer = blockInfo.getTailTokenId();
     * skipped. All peers accounted for must reside in the default partition.
}
     * to <code>true</code>.
        }

 *
 * <p>
            return super.stop(ch, position, true) && isDefaultPartition(position);
                }
     * Returns the next token in forward direction, starting at <code>start</code>, and not extending further than
    private int getToken(String s) {
        int offset = start;
     * @see NonSQLIdentifierPart
    private String partition;
                depth++;
    /**
        

 * DBeaver - Universal Database Manager
                lastToken = document.get(from, to - from);
        return false;
     * the most recently read position.
    }
        int depth = 1;
 * An instance holds some internal position in the document and is therefore not threadsafe.
            return endPos > position && DELIMITER_CONDITION.isDelimiterChar(document.getChar(endPos));
            }
            return TokenKeyword;
            int from, to = pos + 1;
        public boolean stop(char ch, int position, boolean forward) {
            return getToken(lastToken);
     * Stops upon a non-whitespace (as defined by {@link Character#isWhitespace(char)}) character.
     *                  &lt; <code>start</code>, or <code>UNBOUND</code>
        }

     *

        this(document, SQLParserPartitions.SQL_PARTITIONING, IDocument.DEFAULT_CONTENT_TYPE, syntaxManager);
     */
     *
        if (pos == NOT_FOUND) {
     * @param bound    the first position in <code>fDocument</code> to not consider any more, with <code>bound</code>
import org.eclipse.jface.text.ITypedRegion;
    public SQLHeuristicScanner(IDocument document, SQLSyntaxManager syntaxManager) {
    /**
     */
 */
    /**
        assert (position >= 0);
 * you may not use this file except in compliance with the License.
            nextToken = token;
            while (lastPos > bound) {

        while (true) {
    }
    public int findOpeningPeer(int start, SQLBlockCompletionInfo blockInfo) {

    private SQLSyntaxManager syntaxManager;
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param s a scanned identifier
    private static class NonWhitespace implements StopCondition {
    public boolean endsWithDelimiter(int position, int bound) {
        lastPos--;
import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
//            _log.debug(EditorMessages.error_badLocationException, e);
        this.partition = partition;
                return TokenEOF;
        }
            nextTokenOffset = offset;
            return getToken(lastToken);

     * @see NonWhitespace
            ))) {
                }
        assert (start < document.getLength());
                lastPos--;
    /**
     * @param blockInfo information about completion block
     * {@link #getPosition()}will return the position just before the scanned token starts (i.e. the next position that
    }
            if (pos == NOT_FOUND) {
        assert (s != null);
            // operators, number literals etc
            for (String delim : syntaxManager.getStatementDelimiters()) {
        int pos = scanBackward(start, bound, _nonWSDefaultPart);

        this.document = document;
     *
    /**
     * Returns the next token in backward direction, starting at <code>start</code>, and not extending further than
     */
     * @return one of the constants defined in {@link SQLIndentSymbols}
     * @param bound the first position not to consider any more

    private char lastChar;
                lastToken = document.get(from, to - from);
            }

     * <p/>
                if (delim.length() == 1 && delim.charAt(0) == ch) {
     * Finds the highest position <code>p</code> in <code>fDocument</code> such that <code>bound</code> &lt;
        start += 1;
     * Returns one of the keyword constants or <code>TokenIDENT</code> for a scanned identifier.
 *
     * &lt; <code>bound</code> and <code>condition.stop(fDocument.getChar(p), p)</code> evaluates to
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (BadLocationException e) {
        if (Character.isJavaIdentifierPart(lastChar)) {
            return !Character.isWhitespace(ch);
     * @return the highest position in (<code>bound</code>,<code>start</code> for which <code>condition</code>
            return isDelimiterChar(ch) || !Character.isWhitespace(ch);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            return super.stop(ch, position, true) || !isDefaultPartition(position);
            if (token == SQLIndentSymbols.TokenEOF) {
        @Override
 *
            if (pos == NOT_FOUND) {
    /**
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        @Override
    }
    private final StopCondition _nonWSDefaultPart = new NonWhitespaceDefaultPartition();
    private class DelimiterCondition implements StopCondition {
     * <code>bound</code>. The return value is one of the constants defined in {@link SQLIndentSymbols}. After a call,
            return !Character.isJavaIdentifierPart(ch);
        int depth = 1;
        } catch (BadLocationException e) {

     *

                }


        public boolean stop(char ch, int position, boolean forward) {
     *
                lastPos++;
            }
        }
    private String partitioning;
     *                 &gt; <code>position</code>, or <code>UNBOUND</code>
     * @return the smallest position of a non-whitespace character in [<code>position</code>,<code>bound</code>),
     * <p>
            while (lastPos < bound) {
            }
        return TokenOTHER;
            return TokenEOF;
        return NOT_FOUND;
    /**
        }
     * @param start     the first character position in <code>fDocument</code> to be considered
            pos = scanBackward(pos - 1, bound, _nonIdent);

        }
    }
            return TokenEOF;
     * Returned by all methods when the requested position could not be found, or if a {@link BadLocationException}was

     */
            int from = pos, to;
        int nextToken = NOT_FOUND;
     * <p>Note that <code>start</code> must not point to the opening peer, but to the first
     */
                depth--;
     * scanning).
     * </p>
    public SQLHeuristicScanner(IDocument document, String partitioning, String partition, SQLSyntaxManager syntaxManager) {
     * @param start the first character position in the document to consider
 * See the License for the specific language governing permissions and
    }
public class SQLHeuristicScanner implements SQLIndentSymbols {
     * @param bound the first position not to consider any more
    }
        this.partitioning = partitioning;
        if (bound == UNBOUND) {
                lastChar = document.getChar(lastPos);
     */
        }
     * @param bound     the first position in <code>fDocument</code> to not consider any more, with <code>bound</code>
        } else {
    /**
 * </p>
 * limitations under the License.
    /**
        }

            bound = -1;

//            return TokenKeywordStart;
            if (token == openingPeer && prevToken != headCancelToken) {
                depth--;
    }
        if (keywordType == DBPKeywordType.KEYWORD) {
 * @author Li Huang, Serge Rider
    private final DelimiterCondition DELIMITER_CONDITION = new DelimiterCondition();
     * <code>true</code>.
     * <code>false</code>.
    public int scanBackward(int start, int bound, StopCondition condition) {
     * @return a constant from {@link SQLIndentSymbols}describing the next token
        if (tokenKindId != null) {

    /**
        } catch (BadLocationException e) {

    }
 * <p/>
        if (Character.isJavaIdentifierPart(lastChar)) {
    public static final int NOT_FOUND = -1;
     * Checks whether <code>position</code> resides in a default (SQL) partition of <code>document</code>.
        try {
     * @param bound     the first position in <code>fDocument</code> to not consider any more, with <code>bound</code>
        int closingPeerEnd = blockInfo.getTailEndTokenId() != null ? blockInfo.getTailEndTokenId() : UNBOUND;
    public static final int UNBOUND = -2;
        int nextTokenOffset = NOT_FOUND;


    private IDocument document;
 * Utility methods for heuristic based SQL manipulations in an incomplete SQL source file.
            
     * are skipped. All peers accounted for must reside in the default partition.
            }
     * and &lt; <code>bound</code> and <code>Character.isWhitespace(fDocument.getChar(pos))</code> evaluates to
                (headCancelToken != token && nextToken == openingPeer)
     * Special bound parameter that means either -1 (backward scanning) or <code>fDocument.getLength()</code> (forward
        start += 1;
            } else {
            }
     * @param position the position to be checked
    }
            ITypedRegion region = TextUtilities.getPartition(document, partitioning, position, false);
    }
        final DBPKeywordType keywordType = syntaxManager.getDialect().getKeywordType(s);
        int closingPeerEnd = blockInfo.getTailEndTokenId() != null ? blockInfo.getTailEndTokenId() : UNBOUND;
        int openingPeer = blockInfo.getHeadTokenId();
    public int findClosingPeer(int start, SQLBlockCompletionInfo blockInfo) {
            if (token == closingPeer && (closingPeerEnd == UNBOUND || nextToken == closingPeerEnd)) {
    /**
            }
     * or <code>NOT_FOUND</code> if none can be found
     *

        if (bound == UNBOUND) {
     */
        }
     * the most recently read character.
     * Returns the position of the opening peer token (backward search). Any scopes introduced by closing peers are
            return region.getType().equals(partition);
        @Override
     * @param condition the <code>StopCondition</code> to check
     */
        Integer tokenKindId = SQLAutoIndentStrategy.DEFAULT_SQL_BLOCK_COMPLETIONS.findTokenId(s);
            offset = getPosition();
     * holds, or <code>NOT_FOUND</code> if none can be found
     * Stops upon a non-sql identifier (as defined by {@link Character#isJavaIdentifierPart(char)}) character.
     * Note that <code>start</code> must not point to the closing peer, but to the first token being searched.
                lastChar = document.getChar(lastPos);
    public int getPosition() {
        int endPos = scanBackward(bound, position, DELIMITER_CONDITION);
        int token;
            try {
     */
     */

        return lastToken;
            if (depth == 0) {
     * The partition to scan in.
            } else if ((closingPeerEnd == UNBOUND && token == closingPeer) || (prevToken == closingPeer && token == closingPeerEnd)) {


                    return true;
//                _log.debug(EditorMessages.error_badLocationException, e);
     * thrown while scanning.

 */
                if (offset == -1) {
     */
            }
            lastPos = start;
        }
                if (condition.stop(lastChar, lastPos, false)) {

            }
     * Finds the lowest position <code>p</code> in <code>fDocument</code> such that <code>start</code> &lt;= p
     * @return a constant from {@link SQLIndentSymbols}describing the previous token

            } else {
        assert (bound <= document.getLength());

    // Last parsed token value
//        if (syntaxManager.getDialect().isKeywordStart(s)) {
            return false;
        return NOT_FOUND;
        }
            token = previousToken(offset, UNBOUND);
     *
        return NOT_FOUND;
                return TokenEOF;
     *

    private class NonSQLIdentifierPartDefaultPartition extends NonSQLIdentifierPart {

    /**
        int openingPeer = blockInfo.getHeadTokenId();
        assert (document != null);
            bound = document.getLength();
     */
                from = pos + 1;
        do {
            return tokenKindId;
     */
    /**
            prevToken = token;


            } catch (BadLocationException e) {
    private static class NonSQLIdentifierPart implements StopCondition {
     * will be scanned).

/**
                return NOT_FOUND;


            } catch (BadLocationException e) {
            } else if ((headCancelToken == UNBOUND && token == openingPeer) || (headCancelToken != UNBOUND && (
        assert (partitioning != null);
    private final static StopCondition _nonWS = new NonWhitespace();
                    return 0;
     */
     * <code>p</code> &lt;= <code>start</code> and <code>condition.stop(fDocument.getChar(p), p)</code> evaluates
import org.eclipse.jface.text.IDocument;
    public int previousToken(int start, int bound) {
        if (pos == NOT_FOUND) {
        }
            // assume an indent or keyword
     * holds, or <code>NOT_FOUND</code> if none can be found
package org.jkiss.dbeaver.ui.editors.sql.indent;
    public int nextToken(int start, int bound) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (BadLocationException e) {
     * @return the lowest position in [<code>start</code>,<code>bound</code>) for which <code>condition</code>
        @Override
    /**

        }
        public boolean stop(char ch, int position, boolean forward) {
    }
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
     * Stops upon a non-whitespace character in the default partition.
    }
                depth++;
        try {
     *
    }
        assert (start < document.getLength());
        int pos = scanForward(start, bound, _nonWSDefaultPart);
     * Stops upon a non-sql identifier character in the default partition.
            return false;
     */

                    return lastPos;
    private class NonWhitespaceDefaultPartition extends NonWhitespace {
        assert (start >= 0);
                return offset;
     * scanned).
import org.eclipse.jface.text.BadLocationException;
        int headCancelToken = blockInfo.getHeadCancelTokenId() != null ? blockInfo.getHeadCancelTokenId() : UNBOUND;
        public boolean stop(char ch, int position, boolean forward) {
 *
        lastPos++;
        } else {
        assert (position <= document.getLength());
import org.jkiss.dbeaver.model.DBPKeywordType;
        return scanForward(position, bound, _nonWS);
     */
     */

        int headCancelToken = blockInfo.getHeadCancelTokenId() != null ? blockInfo.getHeadCancelTokenId() : UNBOUND;
            // assume an indent or keyword
//            _log.debug(EditorMessages.error_badLocationException, e);
     */
        }
            pos = scanForward(pos + 1, bound, _nonIdent);

        int closingPeer = blockInfo.getTailTokenId();
    private int lastPos;
//                _log.debug(EditorMessages.error_badLocationException, e);
        assert (bound >= -1);
//            _log.debug(EditorMessages.error_badLocationException, e);
        }
            if (depth == 0) {
