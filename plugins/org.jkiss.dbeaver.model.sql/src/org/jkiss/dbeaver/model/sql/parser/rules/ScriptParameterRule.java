        }
 * DBeaver - Universal Database Manager
        }
            }
            do {
            return true;
        int prevChar = scanner.read();
        } else {
        int c = scanner.read();
                }
     * Return the position of the last variable name character or -1 if the name is not valid
            while (c != TPCharacterScanner.EOF && isValidParameterChar((char) c)) {
                            break;
        this.namedParameterPrefix = prefix;
    private final String namedParameterPrefix;
                            validChars = false;
        if (isValidParameterChar((char) prevChar) ||
    public TPToken evaluate(TPCharacterScanner scanner)
        position++;
                if (isIdentifierQuote((char) c, false, true, quoteStrings)) {
    }
            }
            scanner.unread();
        if (c != TPCharacterScanner.EOF && (c == anonymousParameterMark || c == namedPrefix)) {
            for (String[] quotePair : quoteStrings) {
    }
        this.quoteStrings = syntaxManager.getIdentifierQuoteStrings();
    private static boolean isIdentifierQuote(char c, boolean testStart, boolean testEnd, String[][] quoteStrings) {
            c = scanner.read();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLParameterToken;
        int endPos = tryConsumeParameterNameImpl(sqlDialect, buffer, position);
                    if (isIdentifierQuote(buffer.charAt(1), true, false, quoteStrings)
            buffer.setLength(0);
            }
 *
                    if (isIdentifierQuote((char) c, false, true, quoteStrings)) {
package org.jkiss.dbeaver.model.sql.parser.rules;
* SQL parameter rule
            }
 
                c = position < buffer.length() ? buffer.charAt(position) : TPCharacterScanner.EOF;
    }
                    ) {
                position++;
                }
                    position++;
     */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                    c = position < buffer.length() ? buffer.charAt(position) : TPCharacterScanner.EOF;

        // keep in sync with the above
    {
            } while (c != TPCharacterScanner.EOF);
                    buffer.append((char) c);
                if (buffer.length() == 1 && buffer.charAt(0) == anonymousParameterMark) {
                    for (int i = 1; i < buffer.length(); i++) {
import org.jkiss.dbeaver.model.text.parser.TPToken;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
            }

        char namedPrefix = namedParameterPrefix.charAt(0);
    
import org.jkiss.code.NotNull;
        return endPos > position ? endPos : -1;
            buffer.append((char) c);
                        break;
        {
public class ScriptParameterRule implements TPRule {

        this.anonymousParameterMark = syntaxManager.getAnonymousParameterMark();

            return TPTokenAbstract.UNDEFINED;
        }
 *

                    c = scanner.read();
    private final StringBuilder buffer;
    private final String[][] quoteStrings;
        scanner.unread();
        if (isIdentifierQuote((char) c, true, false, quoteStrings)) {
import org.jkiss.dbeaver.model.text.parser.TPRule;
        this.buffer = new StringBuilder();
    private final SQLSyntaxManager syntaxManager;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
        String testStr = Character.toString(c);
                scanner.unread();
    private final SQLParameterToken parameterToken;
                        c = scanner.read();
        String[][] quoteStrings = sqlDialect.getIdentifierQuoteStrings();
                    }
                } while (c != TPCharacterScanner.EOF);
                position++;
        if (testStr.equals(SQLConstants.STR_QUOTE_DOUBLE)) {
                    boolean validChars = true;
            } else {
import org.jkiss.dbeaver.model.sql.SQLConstants;
        }
        return false;
            // Check for parameters
                }
            if (syntaxManager.isParametersEnabled()) {
    
}
                do {
                if ((testStart && testStr.equals(quotePair[0])) || (testEnd && testStr.equals(quotePair[1]))) {
                    return parameterToken;
    @Override
    private static int tryConsumeParameterNameImpl(@NotNull SQLDialect sqlDialect, @NotNull CharSequence buffer, int position) {
    }

                while (c != TPCharacterScanner.EOF && isValidParameterChar((char) c)) {
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
                }
    public static int tryConsumeParameterName(@NotNull SQLDialect sqlDialect, @NotNull CharSequence buffer, int position) {
                        if (!isValidParameterChar(buffer.charAt(i))) {

 */
        return Character.isJavaIdentifierPart(c); // if we allow '.', it broke some use cases, see #22335
        return position - 1;
            if (isIdentifierQuote((char) c, true, false, quoteStrings)) {
/*
 * See the License for the specific language governing permissions and
                }
                        return parameterToken;
            scanner.unread();
            prevChar == namedPrefix || prevChar == anonymousParameterMark || prevChar == '\\' || prevChar == '/' || (prevChar == '[' && namedPrefix == ':'))
        this.syntaxManager = syntaxManager;
                        && isIdentifierQuote(buffer.charAt(buffer.length() - 1), false, true, quoteStrings)
        int c = position < buffer.length() ? buffer.charAt(position) : TPCharacterScanner.EOF;
                    }
    
                        && buffer.length() > 3
            }
            
                    if (validChars) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.parameterToken = parameterToken;
    private final char anonymousParameterMark;
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
                c = position < buffer.length() ? buffer.charAt(position) : TPCharacterScanner.EOF;
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
    public ScriptParameterRule(SQLSyntaxManager syntaxManager, SQLParameterToken parameterToken, String prefix) {
    private static boolean isValidParameterChar(char c) {
                    break;
/**
                    c = scanner.read();
        return TPTokenAbstract.UNDEFINED;

                    buffer.append((char) c);
*/
                        }
    /**
                if (buffer.charAt(0) == namedPrefix && buffer.length() > 1) {
        if (quoteStrings != null) {
import org.jkiss.dbeaver.model.sql.SQLDialect;
     * Parse variable name from buffer

                        buffer.append((char) c);
            for (int i = buffer.length() - 1; i >= 0; i--) {
 * you may not use this file except in compliance with the License.
                    }
            if (syntaxManager.isAnonymousParametersEnabled()) {
        }
                    }
        } else {
                    return true;
    }
                        return parameterToken;
