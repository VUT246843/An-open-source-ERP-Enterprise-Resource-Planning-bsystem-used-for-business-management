        case '+': // plus sign
                }

    private final SQLFormatterConfiguration configuration;
    private final String[][] quoteStrings;
            firstChar = fBefore.charAt(position);
 * Licensed under the Apache License, Version 2.0 (the "License");
                workString.append(fChar);
                    if (fChar == '\n' || fChar == '\r') {
            final FormatterToken token = nextToken();
                }
        case '~': // greater than operator
        switch (argChar) {

        }
package org.jkiss.dbeaver.model.sql.format.tokenized;
            position++;

    private boolean isQuoteChar(char fChar) {
        if (isSpace(fChar)) {
                    if (fChar == 'x' || fChar == 'X') {
        if(ArrayUtils.contains(configuration.getSyntaxManager().getDialect().getScriptDelimiters(), delimiterRedefiner)) {
        String delimiterRedefiner = configuration.getSyntaxManager().getDialect().getScriptDelimiterRedefiner();
        }
            if (configuration.getSyntaxManager().getDialect().getKeywordType(word) == DBPKeywordType.KEYWORD) {
    private final char escapeChar;

        case '/': // solidus
                    for (String[] quoteString : quoteStrings) {
                        fPos++;
        case '"': // double quote
                    break;
                        fPos++;
            }
    private String fBefore;
    }
                            endQuoteChar = quoteString[1].charAt(0);
        return list;
        }
        }
                        fPos++;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        fPos = readWord(s, startPosition);
 *

 * TODO: check comment characters from syntax manager, not constants
 *
    }
            fPos = readWord(s, fPos);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
            } else {
                return new FormatterToken(TokenType.UNKNOWN, String.valueOf(fChar), start_pos);
        case '(': // left paren
        case '#': //
            fPos++;
                if (quoteStrings[i][0].charAt(0) == fChar) {
    }
    private char[] singleLineCommentStart;
        }
        case '>': // greater than operator

                        if (quoteString[0].charAt(0) == endQuoteChar) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        case ']': // bracket close
    public static boolean isDigit(final char argChar) {
                        break;
                    return true;
                    fPos++;
                    }
    private FormatterToken parseNameStartWithDigit(int startPosition) {
            if (commands.contains(word.toUpperCase(Locale.ENGLISH))) {
                s.append(fChar);
 */
            s.append(firstChar);
                fPos++;
                fPos++;
                    return new FormatterToken(TokenType.SYMBOL, s, start_pos);
 * you may not use this file except in compliance with the License.
        return new FormatterToken(TokenType.NAME, word, startPosition);
    }
        for (;;) {
            }
                fPos++;
                s.append(fChar);
        case '\'': // quote
        case '!': // greater than operator
            }
import org.jkiss.utils.ArrayUtils;
        case '&': // ampersand
            if (isLetter(fChar) 
                        s.append(fChar);
        }
                if (fChar == '0' && fPos + 1 < fBefore.length()) {
        case '=': // equals operator
        this.singleLineComments = configuration.getSyntaxManager().getDialect().getSingleLineComments();
        default:
                int ch0 = fChar;
            }
        return Character.isWhitespace(argChar);
 * Unless required by applicable law or agreed to in writing, software
class SQLTokensParser {
        int position = startPosition;
                if (ch0 == '*' && fChar == '/') {
                }
            }
            list.add(token);
                String s = String.valueOf(fChar);
    private int readWord(@NotNull StringBuilder s, int startPosition) {
        this.quoteStrings = configuration.getSyntaxManager().getIdentifierQuoteStrings();
                    } else {
            fPos++;
            if (commentString == null) {
                        continue;
        }

            return true;
        String word = s.toString();
                s.setLength(0);
                if (fBefore.substring(fPos).startsWith(System.lineSeparator())) {
                }
                char endQuoteChar = fChar;
                    fChar = fBefore.charAt(fPos);
 * You may obtain a copy of the License at
                while (fPos < fBefore.length()) {
    }
        if (fPos >= fBefore.length()) {
                int posMark = fPos;
                char ch2 = fBefore.charAt(fPos);
            || structSeparator == firstChar || catalogSeparator.indexOf(firstChar) != -1
        }
                    s.append(fChar);
            for (int i = 0; i < quoteStrings.length; i++) {
        case ',': // comma
                        s += ch2;
                if (!isSpace(fChar)) {
import org.jkiss.code.NotNull;
            return new FormatterToken(TokenType.COMMENT, commentString, start_pos);
        } else {
                // Close quote char may differ
            fPos += commentString.length() - 1;
    private String catalogSeparator;
                        radix = NumberRule.RADIX_HEXADECIMAL;
    private Set<String> commands = new HashSet<>();
            commands.add(delimiterRedefiner.toUpperCase(Locale.ENGLISH));
            commentString = fBefore.substring(start_pos, fPos);
            return new FormatterToken(TokenType.VALUE, s.toString(), start_pos);
                break;

                if (quoteStrings != null) {
            while (fPos < fBefore.length()) {

    }
            StringBuilder s = new StringBuilder("/*");

        return !isSpace(argChar) && !isDigit(argChar) && !isSymbol(argChar);
            }
            if (ch2 != '*') {
        return Character.isDigit(argChar);
        return position;
            return new FormatterToken(TokenType.NAME, word, start_pos);
            StringBuilder s = new StringBuilder();
    }
                if (fBefore.length() >= start_pos + slc.length() && slc.equals(fBefore.substring(start_pos, start_pos + slc.length()))) {
        case '%': // percent
                    char fNextChar = fPos >= fBefore.length() - 1 ? 0 : fBefore.charAt(fPos);
                fPos++;
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
                return parseNameStartWithDigit(startPosition);
                }
    
                return new FormatterToken(TokenType.SYMBOL, s, start_pos);
            StringBuilder s = new StringBuilder();
        case ')': // right paren

        case '*': // asterisk
            delimiterRedefiner = null;
                return new FormatterToken(TokenType.SYMBOL, String.valueOf(s.charAt(0)), start_pos);
import java.util.*;
        else if (ArrayUtils.contains(singleLineCommentStart, fChar)) {
                s.append(fChar);
                if (fPos >= fBefore.length()) {
            char ch2 = fBefore.charAt(fPos);
        char firstChar = fBefore.charAt(startPosition);

                    break;
            else singleLineCommentStart[i] = singleLineComments[i].charAt(0);
import org.jkiss.dbeaver.model.text.parser.rules.NumberRule;

                    fChar = fBefore.charAt(fPos);
            }
                        s.append(fNextChar);
                fChar = fBefore.charAt(fPos);
                    return new FormatterToken(TokenType.COMMENT, s.toString(), start_pos);
            String commentString = null;
            return false;
            return new FormatterToken(TokenType.SPACE, workString.toString(), start_pos);
                fPos++;
            while (CommonUtils.isDigit(fChar, radix) || (radix == NumberRule.RADIX_DECIMAL && (fChar == '.' || fChar == 'e' || fChar == 'E'))) {
        }
        }
            }
        this.structSeparator = configuration.getSyntaxManager().getStructSeparator();
 * See the License for the specific language governing permissions and
}
                    break;

        case ';': // semicolon
            if (fChar == '\'' || isQuoteChar(fChar)) {
    }
                    }
                StringBuilder s = new StringBuilder();
        } else if (fChar == ';') {
        fBefore = argSql;
            || (firstChar == '*' && position > 0 && fBefore.charAt(position - 1) == structSeparator)
/**
                            break;
                }
        case '-': // minus sign
        fPos = 0;

            if (singleLineComments[i].isEmpty()) singleLineCommentStart[i] = 0;
        case '<': // less than operator
 * DBeaver - Universal Database Manager
 */
        else if (isLetter(fChar)) {
        }

            for (;;) {
        // single line comment
                return new FormatterToken(TokenType.COMMAND, word + s.toString(), start_pos);
            int startPosition = fPos;
            }
        if (quoteStrings != null) {
        for (int i = 0; i < singleLineComments.length; i++) {
            for (; fPos < fBefore.length(); fPos++) {
                return new FormatterToken(TokenType.KEYWORD, word, start_pos);
    public SQLTokensParser(SQLFormatterConfiguration configuration) {
        else if (fChar == '/') {
            }
        this.configuration = configuration;
                    boolean isDoubledQuote = fChar == endQuoteChar && fNextChar == endQuoteChar;
        case '.': // period

                        return new FormatterToken(TokenType.VALUE, s.toString(), start_pos);
        this.singleLineCommentStart = new char[this.singleLineComments.length];
 *
                fChar = fBefore.charAt(fPos);
        if (!CommonUtils.isEmpty(delimiterRedefiner)) {
        this.escapeChar = configuration.getSyntaxManager().getEscapeChar();
            }
        }
            fPos++;
            if (token.getType() == TokenType.END) {
                    commentString = slc;
            return new FormatterToken(TokenType.END, "", start_pos);
    @NotNull
            for (String slc : singleLineComments) {
        case '|': // vertical bar
        char fChar = fBefore.charAt(fPos);

            }

 * limitations under the License.
            ) {
    private String[] singleLineComments;
                }

                    if (fChar == endQuoteChar) {
        return false;
                fPos++;
            else if (isSymbol(fChar)) {
                if (fPos >= fBefore.length()) {
                    if (isDoubledQuote || isEscapedQuote) {
        this.catalogSeparator = configuration.getSyntaxManager().getCatalogSeparator();
                    fChar = fBefore.charAt(fPos);
                    break;
        ) {
                fChar = fBefore.charAt(fPos);
                    if (twoCharacterSymbol[i].charAt(0) == fChar && twoCharacterSymbol[i].charAt(1) == ch2) {
        case '`': // apos
import org.jkiss.dbeaver.model.DBPKeywordType;
                return new FormatterToken(TokenType.SYMBOL, String.valueOf(fChar), start_pos);
        case '[': // bracket open
                        s.append(fChar);
    public static boolean isSpace(final char argChar) {
    private char structSeparator;
                }
                        }
            }

                        break;
        final List<FormatterToken> list = new ArrayList<>();
                    }
            }
                // Bad quoting (no close quote)
                for (int i = 0; i < twoCharacterSymbol.length; i++) {
        case ':': // colon

            if (position >= fBefore.length()) {
                return new FormatterToken(TokenType.SYMBOL, "/", start_pos);
            fPos++;
                    }

                && configuration.getSyntaxManager().getDialect().validIdentifierStart(fBefore.charAt(startPosition))
import org.jkiss.utils.CommonUtils;

    public static boolean isLetter(final char argChar) {
        StringBuilder s = new StringBuilder();
    public static boolean isSymbol(final char argChar) {
                    }
                }
                }
    private int fPos;
            fPos++;
                }
            return new FormatterToken(TokenType.SYMBOL, ";", start_pos);
        case '?': // question mark
    }
                }
    private static final String[] twoCharacterSymbol = { "<>", "<=", ">=", "||", "()", "!=", ":=", ".*" };

                        // Escaped quote
            StringBuilder workString = new StringBuilder();
                    boolean isEscapedQuote = fChar == escapeChar && fNextChar == endQuoteChar;
            }
                break;
            int radix = NumberRule.RADIX_DECIMAL;

        } else if (isDigit(fChar)) {
    FormatterToken nextToken() {
    public List<FormatterToken> parse(final String argSql) {
                    }
                fPos = posMark;
        int start_pos = fPos;
    }
        while (isLetter(firstChar) || isDigit(firstChar)
 * SQLTokensParser
                for (; fPos < fBefore.length(); fPos++) {
            String word = s.toString();
