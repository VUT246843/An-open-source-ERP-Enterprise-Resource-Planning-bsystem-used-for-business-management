    /**
     * @param documentLength the document's length
        checkRange(offset, length, documentLength);

        this.evalMode = true;
                } catch (BadLocationException e) {
        fRangeEnd = offset + length;
        }
        fDocument = document;
                int line = fDocument.getLineOfOffset(fOffset);
        for (int i = 0; i < delimiters.length; i++)
                    log.debug("Text parser rule inconsistency: "
        if (read() == EOF)
    public int getTokenOffset() {
    }
    }
    private void checkRange(int offset, int length, int documentLength) {
    /**
    }
        if (fRules != null) {
    public int getOffset() {
import org.eclipse.jface.text.IDocument;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        if (rules != null) {
                    fOffset = offset;
    public TPRuleBasedScanner() {
    public int getColumn() {
 */
            }
     * Configures the scanner with the given sequence of rules.
                int offset = fOffset;
     */
     * The cached column of the current scanner position
    }
    public void endEval() {
    @Override
    /**
            try {
     * Configures the scanner's default return token. This is the token

     * Returns offset of the next token or the end offset of the range to be scanned
    private static final int UNDEFINED = -1;

        this.evalMode = false;
     */
            fDefaultReturnToken = TPTokenAbstract.UNDEFINED;
     */
                }
     */

    public boolean isEvalMode() {
    /**
    }
        } finally {
    public void setRules(TPRule[] rules) {
        Assert.isLegal(offset > -1);
    private int fTokenOffset;
            return fOffset - getTokenOffset();
     * Internal setting for the un-initialized column cache.
    private IDocument fDocument;
     */
    @Override
            return EOF;
        if (fOffset < fRangeEnd)
    /**
            fRules = new TPRule[rules.length];
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.isLegal(offset + length <= documentLength);
    private int fColumn;
            return TPTokenAbstract.EOF;
     *
    /**
     */

            for (TPRule rule : fRules) {
 *

        return fColumn;

 */

    public void startEval() {
     * @param rules the sequence of rules controlling this scanner
        }
        return fTokenOffset;
    @Override
     * @param defaultReturnToken the default return token
    /**
    /**

     * Creates a new rule based scanner which does not have any rule.

        return evalMode;
                if (rule instanceof SQLDelimiterRule) {
    // Eval
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
                    return fDocument.getChar(fOffset);
public class TPRuleBasedScanner implements TPCharacterScanner, TPTokenScanner, TPEvalScanner {

        Assert.isLegal(length > -1);
        fDefaultReturnToken = defaultReturnToken;
    private static final Log log = Log.getLog(TPRuleBasedScanner.class);
            length--;
    }
     */
    /**
    private boolean evalMode;
    }
     * The offset of the last read token
    public void setRange(final IDocument document, int offset, int length) {
        }
    /**
 * See the License for the specific language governing permissions and
    private int fOffset;
            fColumn = UNDEFINED;
     * which is returned when none of the rules fired and EOF has not been
     * @since 2.0
    }

            for (TPRule fRule : fRules) {
        if (fColumn == UNDEFINED) {
        --fOffset;
                TPToken token = (fRule.evaluate(this));
                    ((SQLDelimiterRule) rule).changeDelimiter(null);
    private TPToken fDefaultReturnToken;
    @Override
     * The end offset of the range to be scanned
    }
     *
     * @param length         the length of the document range to scan

 * Rule based text scanner
            }

        if (fDefaultReturnToken == null)
    @Override
                try {
import org.eclipse.jface.text.BadLocationException;
        while (offset + length > documentLength) {
     * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=69292
    /**
     * The document to be scanned
        return Math.min(fOffset, fRangeEnd);
        Assert.isLegal(document != null);

     */
     */
    }



                } else if (fOffset != offset) {
     * The list of rules of this scanner
     */
        try {
        // Sometimes we have length longer than document length

            } catch (BadLocationException ex) {
            System.arraycopy(rules, 0, fRules, 0, rules.length);
 *
                int start = fDocument.getLineOffset(line);
                    return token;
        return fDelimiters;
    private char[][] fDelimiters;
import org.jkiss.dbeaver.model.sql.parser.rules.SQLDelimiterRule;
    }
    /**
                            + "but the current offset is different after attempt to evaluate " + fRule);
    public void unread() {
                            + "rule failed and the scanned should have been fallbacked, "
/**
    public int read() {
    //////////////////////////////////////////////////////
    @Override
    public int getTokenLength() {
        return fDefaultReturnToken;
        fDelimiters = new char[delimiters.length][];
            }
                }
            ++fOffset;
        fColumn = UNDEFINED;
    }
                if (!token.isUndefined()) {


 * limitations under the License.

    public TPToken nextToken() {
        String[] delimiters = fDocument.getLegalLineDelimiters();

     *


    public void setDefaultReturnToken(TPToken defaultReturnToken) {
    public int getTokenEndOffset() {

package org.jkiss.dbeaver.model.text.parser;
     * @since 3.3
        Assert.isNotNull(defaultReturnToken.getData());
    private int fRangeEnd;
/*
     */
                }
        return fRangeEnd - getTokenOffset();
            }
     */
     * @param offset         the offset of the document range to scan
    /**
    @Override
     * The cached legal line delimiters of the document
    }
     * Checks that the given range is valid.
    }


    }

            fRules = null;
    private TPRule[] fRules;
                fColumn = fOffset - start;
 * DBeaver - Universal Database Manager
    }
     */
    }
     */
        fColumn = UNDEFINED;


    @Override

        return fOffset;

        } else
        }
        fOffset = offset;
        final int documentLength = document.getLength();

     * The offset of the next character to be read
 * You may obtain a copy of the License at
        fColumn = UNDEFINED;
 *
            fDelimiters[i] = delimiters[i].toCharArray();
import org.eclipse.core.runtime.Assert;
    @Override
}
            if (fOffset < fRangeEnd) {
        if (fRules != null) {


     * reached.

     * The token to be returned by default if no rule fires
        fTokenOffset = fOffset;
        }
    public char[][] getLegalLineDelimiters() {
