     */
    }
                    }
package org.jkiss.dbeaver.model.text.parser.rules;

 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Cached line delimiters.
        fColumn = column;
     * @param startSequence   the pattern's start sequence
     * Alternatively, the sequence can also be ended by the end of the line.
            }
     *
     */
        return fToken;

     * @param startSequence         the pattern's start sequence

    /**
 * See the License for the specific language governing permissions and

     */
        }
     * @param escapeContinuesLine indicates whether the specified escape character is used for line
                if (fEscapeContinuesLine) {
                // Check for end of line since it can be used to terminate the pattern.
     * The pattern's start sequence
                }
     * @param endSequence         the pattern's end sequence, <code>null</code> is a legal value
     *                            terminate the pattern, even if <code>breakOnEOL</code> is set
     */
    }
     *                              terminate the pattern, even if <code>breakOnEOL</code> is set
     * Returns whether the end sequence was detected. As the pattern can be considered
     * Creates a rule for the given starting and ending sequence.
     * @param startSequence       the pattern's start sequence
     * @param sequence   the sequence to be detected
            } else if (fBreaksOnEOL) {

            if (c == fEscapeCharacter) {
     * @param escapeCharacter any character following this one will be ignored
            }
        fEndSequence = (endSequence == null ? new char[0] : endSequence.toCharArray());
     *

     * @param scanner the character scanner to be used
     * @param column the column in which the pattern starts
     *
            return o2.length - o1.length;

     * Cached sorted {@linkplain #fLineDelimiters}.
        }
    }
     * @param breaksOnEOL         indicates whether the end of the line also terminates the pattern
     */
    protected boolean fBreaksOnEOF;
        }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        fEscapeContinuesLine = escapeContinuesLine;
    public PatternRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOL, boolean breaksOnEOF) {
        int count = originalDelimiters.length;
    }
     * Any character which follows the given escapeCharacter will be ignored. An end of line
 * sequence and ends with a given end sequence. If the end sequence is
     * @param breaksOnEOF     indicates whether the end of the file also terminates the pattern
import org.jkiss.dbeaver.model.text.parser.TPToken;
    protected TPToken doEvaluate(TPCharacterScanner scanner) {
     * @param startSequence   the pattern's start sequence
        } else {
     * @param excludeLineDelimiter  indicates whether the line delimiter should be included into produced token or not
        fEscapeContinuesLine = escapeContinuesLine;
 * the end sequence required by the rule.
        fBreaksOnEOL = breaksOnEOL;
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
     * The token to be returned on success
     */
        this(startSequence, endSequence, token, escapeCharacter, breaksOnEOL, breaksOnEOF);
                return false;
        }
    private char[][] fSortedLineDelimiters;
     * rule breaks on the end of the line, or if the EOF character is read.
     * Creates a rule for the given starting and ending sequence.
     * Any character which follows the given escapeCharacter will be ignored.
            } else if (c != sequence[i]) {
     */
            column = UNDEFINED;
                for (char[] fSortedLineDelimiter : fSortedLineDelimiters) {
        return true;
 */
        if (column < 0)
                        return true;
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param resume  <code>true</code> if detection should be resumed, <code>false</code> otherwise

     * Internal setting for the un-initialized column constraint
        @Override
            fLineDelimiters = originalDelimiters;
    /**

                    return true;
            } else if (fEndSequence.length > 0 && c == fEndSequence[0]) {
    /**
     */
     * pattern to terminate even if <code>breakOnEOL</code> is set to true.
                for (int j = i - 1; j > 0; j--)
            if (c == fStartSequence[0]) {
     */

 * Is is capable of detecting a pattern which begins with a given start
     * Comparator that orders <code>char[]</code> in decreasing array lengths.
        for (int i = 1; i < sequence.length; i++) {
    @Override
     * Alternatively, the sequence can also be ended by the end of the line or the end of the file.

     * The pattern's escape character
                // Non-matching character detected, rewind the scanner back to the start.
     * @param endSequence           the pattern's end sequence, <code>null</code> is a legal value
                return true;
    /**
        scanner.unread();
            while (count > 0 && Arrays.equals(fLineDelimiters[count - 1], originalDelimiters[count - 1]))
     * @param endSequence     the pattern's end sequence, <code>null</code> is a legal value
     * @return <code>true</code> if the end sequence has been detected
                    }
            System.arraycopy(fLineDelimiters, 0, fSortedLineDelimiters, 0, fLineDelimiters.length);
                            for (int i = 0; i < fSortedLineDelimiter.length; i++)
    /**
    protected TPToken fToken;
                count--;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.text.parser.TPPredicateRule;
                        if (fExcludeLineDelimiter) {
     *

     * @return <code>true</code> if the given sequence has been detected
                // Check if the specified end sequence has been found.
     * @since 3.0
    }

     * Sets a column constraint for this rule. If set, the rule's token
     *
                // Do not unread the first character.
     *
     * @param breaksOnEOF           indicates whether the end of the file also terminates the pattern
     *
    /**
                    for (char[] fSortedLineDelimiter : fSortedLineDelimiters) {
     * @param token                 the token which will be returned on success
     * Creates a rule for the given starting and ending sequence.
                // Skip escaped character(s)
/*
                scanner.unread();

     * Evaluates this rules without considering any column constraints. Resumes
    /**
     * will only be returned if the pattern is detected starting at the
 * the pattern can be constrained to begin in a certain column. The rule can also
    @Override

     *
     */
     *                              continuation, so that an end of line immediately after the escape character does not
        while ((c = scanner.read()) != TPCharacterScanner.EOF) {
     * Indicates whether line delimiter should be included into produced token

    private char[][] fLineDelimiters;
    public PatternRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOL, boolean breaksOnEOF, boolean escapeContinuesLine, boolean excludeLineDelimiter) {
     * @param token           the token which will be returned on success
     * constraint is considered removed.

    /**

     */
            Arrays.sort(fSortedLineDelimiters, fLineDelimiterComparator);
    public TPToken evaluate(TPCharacterScanner scanner) {
    }
    public TPToken getSuccessToken() {
     *
                if (sequenceDetected(scanner, fStartSequence, false)) {
    /**
    }
 *
     * When these sequences are detected the rule will return the specified token.

     * @param scanner the character scanner to be used
import java.util.Arrays;


     * @param eofAllowed indicated whether EOF terminates the pattern
                if (sequenceDetected(scanner, fEndSequence, fBreaksOnEOF))
     * if <code>excludeLineDelimiter</code> flag is also set to <code>true</code>.
        this(startSequence, endSequence, token, escapeCharacter, breaksOnEOL);
     * Any character which follows the given escapeCharacter will be ignored.
        if (c == fStartSequence[0])
        return doEvaluate(scanner, false);
 * not specified, it can be either end of line, end or file, or both. Additionally,
 * Standard implementation of <code>IPredicateRule</code>.
    private static class DecreasingCharArrayLengthComparator implements Comparator<char[]> {
                    c = scanner.read();
     * @param token               the token which will be returned on success
        public int compare(char[] o1, char[] o2) {
     */
        if (fBreaksOnEOF)
     * @since 3.1
            }

    }
     * When these sequences are detected the rule will return the specified token.

 * limitations under the License.
     * @since 3.1
    }
     */

    /**
    }
        }
     * Indicates whether end of line terminates the pattern
     * Alternatively, the sequence can also be ended by the end of the line or the end of the file.
        scanner.unread();
 * Unless required by applicable law or agreed to in writing, software
        if (fLineDelimiters == null || fLineDelimiters.length != count) {
     * Returns whether the next characters to be read by the character scanner
    protected boolean fEscapeContinuesLine;
     *
     */
            return (fColumn == scanner.getColumn() ? doEvaluate(scanner, resume) : TPTokenAbstract.UNDEFINED);
     * reaching line delimiter, then that line delimiter will be included into produced token
     * @since 7.2.5
     * pattern to terminate even if <code>breakOnEOL</code> is set to true.
     * @param scanner the character scanner to be used
    protected TPToken doEvaluate(TPCharacterScanner scanner, boolean resume) {
    public void setColumnConstraint(int column) {
                }
     * @param breaksOnEOF         indicates whether the end of the file also terminates the pattern
     */
 * be used to check whether the text to scan covers half of the pattern, i.e. contains
    protected char fEscapeCharacter;
            readCount++;
        fEscapeCharacter = escapeCharacter;
        fToken = token;
    /**
     * @since 3.1
    /**
     * @param breaksOnEOL           indicates whether the end of the line also terminates the pattern
     * The pattern's end sequence
     * <code>resume</code> flag is set.
                    scanner.unread();
            if (c == TPCharacterScanner.EOF && eofAllowed) {
     * If <code>breaksOnEOL</code> is set to <code>true</code> and this rule was terminated by
    public PatternRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOL, boolean breaksOnEOF, boolean escapeContinuesLine) {
     * ended by a line delimiter, the result of this method is <code>true</code> if the
    /**
    /**
/**
     *                            continuation, so that an end of line immediately after the escape character does not
    protected int fColumn = UNDEFINED;
    protected boolean endSequenceDetected(TPCharacterScanner scanner) {
                        }
            scanner.unread();
    /**
     * @since 3.1
                    if (c == fSortedLineDelimiter[0] && sequenceDetected(scanner, fSortedLineDelimiter, fBreaksOnEOF)) {
     */
     * Evaluates this rules without considering any column constraints.
     * @param breaksOnEOL     indicates whether the end of the line also terminates the pattern
     * Any character which follows the given escapeCharacter will be ignored. An end of line
    /**
    protected boolean fExcludeLineDelimiter;
     */
     * within the sequence. If specified the sequence is considered to be found
                        return fToken;
    /**
    protected char[] fEndSequence;
        for (; readCount > 0; readCount--)
        if (count != 0) {
    @Override
     * @param token           the token which will be returned on success
     * @since 3.0
                        if (c == fSortedLineDelimiter[0] && sequenceDetected(scanner, fSortedLineDelimiter, fBreaksOnEOF))
     * @since 2.0
     * Line delimiter comparator which orders according to decreasing delimiter length.
     * Alternatively, the sequence can also be ended by the end of the line or the end of the file.
public class PatternRule implements TPPredicateRule {
import java.util.Comparator;

     * @param escapeContinuesLine   indicates whether the specified escape character is used for line
    /**
     * specified column. If the column is smaller then 0, the column
        return TPTokenAbstract.UNDEFINED;
    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {


 *

        fBreaksOnEOF = breaksOnEOF;
        return evaluate(scanner, false);
}

     *
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
                return fToken;
     *
     * are an exact match with the given sequence. No escape characters are allowed
     * @param scanner    the character scanner to be used
            return true;
        if (resume) {
            return doEvaluate(scanner, resume);
        int readCount = 1;
     * @param breaksOnEOL     indicates whether the end of the line also terminates the pattern
     * @param escapeCharacter any character following this one will be ignored
        }
    }
     * immediately after the given <code>lineContinuationCharacter</code> will not cause the
        char[][] originalDelimiters = scanner.getLegalLineDelimiters();
                    if (endSequenceDetected(scanner))
        return TPTokenAbstract.UNDEFINED;
    public PatternRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOL) {
            if (endSequenceDetected(scanner))

        fStartSequence = startSequence.toCharArray();
    protected char[] fStartSequence;
    protected static final int UNDEFINED = -1;
    /**
     * When these sequences are detected the rule will return the specified token.
     */

     * detection, i.e. looks only for the end sequence required by this rule if the
     * immediately after the given <code>lineContinuationCharacter</code> will not cause the
        int c = scanner.read();
        int c;
     *
        return false;
     */

                } else
        if (fColumn == UNDEFINED)
    /**
     * @return the token resulting from this evaluation
 * DBeaver - Universal Database Manager
 */
     * The pattern's column constrain
     * Creates a rule for the given starting and ending sequence.
    /**

    }
     *
    protected boolean sequenceDetected(TPCharacterScanner scanner, char[] sequence, boolean eofAllowed) {
        fExcludeLineDelimiter = excludeLineDelimiter;
    }
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
     */

     * when reading the EOF character.
     * @param escapeCharacter       any character following this one will be ignored
            int c = scanner.read();
    protected boolean fBreaksOnEOL;
        } else {
        this(startSequence, endSequence, token, escapeCharacter, breaksOnEOL, breaksOnEOF);
                            break;
     * Indicates whether end of file terminates the pattern
     * When these sequences are detected the rule will return the specified token.
    /**
    private Comparator<char[]> fLineDelimiterComparator = new DecreasingCharArrayLengthComparator();
                                scanner.unread();
                    scanner.read();
            int c = scanner.read();
     * Indicates whether the escape character continues a line
    /**
     * @param endSequence     the pattern's end sequence, <code>null</code> is a legal value
 *
     * @return the token resulting from this evaluation
            fSortedLineDelimiters = new char[count][];
     * @since 2.1
     * @param escapeCharacter     any character following this one will be ignored
