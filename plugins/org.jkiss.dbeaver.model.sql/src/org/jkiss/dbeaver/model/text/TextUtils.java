        if (region == null || region.getLength() == 0) {
import org.eclipse.jface.text.IRegion;
                    break;
        return str.trim().length() == 0;

        // fuzzy logic is case insensitive. We normalize the Strings to lower
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static int getOffsetOf(IDocument document, int line, String pattern)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // case right from the start. Turning characters to lower case
                    // simple character matches result in one point

                        // Previous character was a divider
 * Text utils
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    score++;

 *
                    } else if (!Character.isLetter(termLowerCase.charAt(termIndex - 1))) {


                            sequenceScore *= 2;
import java.util.Locale;
                    // query can match at most one character in the term.

    }
 * Unless required by applicable law or agreed to in writing, software

        int sequenceScore = 0;
        return score;

 */
 *
/**
        final String termLowerCase = term.toString().toLowerCase(locale);
        }
 * limitations under the License.
                    } else {
            if (!termCharacterMatchFound) {
            final char queryChar = queryLowerCase.charAt(queryIndex);
     * indicates a higher similarity.

                    if (previousMatchingCharacterIndex + 1 == termIndex) {
        final String queryLowerCase = query.toString().toLowerCase(locale);
import org.eclipse.jface.text.IDocument;
                    if (termIndex == 0) {
package org.jkiss.dbeaver.model.text;
}
    public static int fuzzyScore(CharSequence term, CharSequence query, Locale locale) {
        // index of the previously matched character in the term
            return -1;
            throw new IllegalArgumentException("Strings must not be null");
        // the position in the term which will be scanned next for potential
        int score = 0;
                    // we can leave the nested loop. Every character in the

     * One point is given for every matched character. Subsequent matches yield two bonus points. A higher score


                    previousMatchingCharacterIndex = termIndex;
                        }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            return true;
                return 0;
    public static boolean isEmptyLine(IDocument document, int line)

        // as it does not accept a locale.
    }
                if (queryChar == termChar) {
                    termCharacterMatchFound = true;
        if (term == null || query == null) {
        for (int queryIndex = 0; queryIndex < queryLowerCase.length(); queryIndex++) {
        IRegion region = document.getLineInformation(line);
        if (region == null || region.getLength() == 0) {
            boolean termCharacterMatchFound = false;
        return str.indexOf(pattern);
                        sequenceScore = 0;
public class TextUtils {

        throws BadLocationException {
    /**
    }
                }

                        // First character
                    // the score.
                    termIndex++;
    public static int fuzzyScore(CharSequence term, CharSequence query) {

                        } else {
        IRegion region = document.getLineInformation(line);
                        if (sequenceScore == 0) {
    }
 * DBeaver - Universal Database Manager
                    // subsequent character matches further improve


            for (; termIndex < termLowerCase.length(); termIndex++) {
        // via Character.toLowerCase(char) is unfortunately insufficient
                    }
            throws BadLocationException {
/*
 * you may not use this file except in compliance with the License.
        int previousMatchingCharacterIndex = Integer.MIN_VALUE;
                            sequenceScore = 4;
        }
        String str = document.get(region.getOffset(), region.getLength());


                        score += sequenceScore;
 */
        int termIndex = 0;
        return fuzzyScore(term, query, Locale.getDefault());
import org.eclipse.jface.text.BadLocationException;
 * You may obtain a copy of the License at
        String str = document.get(region.getOffset(), region.getLength());
     * Copied from Apache FuzzyScore  implementation.
            }
     */
        // the resulting score
        // query character matches
                final char termChar = termLowerCase.charAt(termIndex);
                    }
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        score += 4;
                        score += 2;
        }
 * See the License for the specific language governing permissions and
