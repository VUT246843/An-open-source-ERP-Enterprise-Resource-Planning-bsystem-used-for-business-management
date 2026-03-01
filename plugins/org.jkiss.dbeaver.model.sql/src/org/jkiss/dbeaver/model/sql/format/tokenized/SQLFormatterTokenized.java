                    t2.getString().trim().isEmpty() &&
        // That means, we do not delete spaces around comments if spaces contain line separator.
                }
                    token.getType() != TokenType.SPACE &&
        }
                t3.setString(t3.getString() + t1.getString() + t0.getString());
            return argList;
            FormatterToken t2 = argList.get(index - 2);
            }
                argList.remove(index);
            String curString = token.getString();

                if (token.getType() == TokenType.SYMBOL && prev.getType() == TokenType.SYMBOL) {

            return argList.isEmpty();
import org.jkiss.utils.ArrayUtils;
            isSqlEndsWithNewLine = true;
                token.setString(" "); //$NON-NLS-1$

            }
 * you may not use this file except in compliance with the License.
                        lfCount++;
            FormatterToken t4 = argList.get(index - 4);
    private void trimSpacesBetweenBraces(List<FormatterToken> argList) {
import org.jkiss.code.NotNull;
 *
            // Concatenate tokens
        }
        }
    }
                    continue;
                argList.remove(index);
                if (lfCount > 1) {
                }
        IndentFormatter indentFormatter = new IndentFormatter(formatterCfg, isCompact);

                argList.remove(index - 1);
                if ("+".equals(curString) &&
        trimSpacesBetweenBraces(argList);

            default:

                        i++;
        list = format(list);


        }
            } else if (token.getType() == TokenType.SPACE && isTokenNotContainsSeparator) {
                continue;
 * Unless required by applicable law or agreed to in writing, software

        if (isEmptyAfterSpaceRemoving(argList, 0) ||
                    !prevString.equals(")") &&
    private SQLFormatterConfiguration formatterCfg;
                        // Do nothing - there is a delimiter already
                return true;
            FormatterToken token = argList.get(i);
                if (formatterCfg.isFunction(prevString) && curString.equals("(")) { //$NON-NLS-1$
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                // "( TOKEN )"
    @Override
                argList.remove(index + 1);
    }
                    continue;
            // Oracle style joins
                }

            token = argList.get(index);
            case ".":
        }
        }
    }
        }
            FormatterToken token = argList.get(i);

        formatterCfg = configuration;
                isEmptyAfterSpaceRemoving(argList, argList.size() - 1)){
        indentFormatter.format(argList);
                    t0.setString(t0.getString() + " " + t2.getString());
        switch (token.getString()) {
        for (int i = index - 1; i >= 0; i--) {
                    return token.getString();
            case ":":
    }
                        prev.getType() == TokenType.SYMBOL && isEmbeddedToken(prev)) {
            }

        // We do not, however, remove spaces between comments which occupy the entire string.
 */
        for (String delim : formatterCfg.getSyntaxManager().getStatementDelimiters()) {
            case "%":
 * distributed under the License is distributed on an "AS IS" BASIS,


                argList.remove(index - 1);
                    if (token.getString().charAt(k) == '\n') {
                if (curString.equals(",") || statementDelimiters.contains(curString)) { //$NON-NLS-1$
                    prevString.length() > 1 && Character.isDigit(prevString.charAt(0)) &&
    private List<FormatterToken> format(@NotNull List<FormatterToken> argList) {
    private static void removeSpacesAroundCommentToken(List<? extends FormatterToken> argList) {
            }
            }
                    t0.getString().equalsIgnoreCase(")")) {
            if (t0.getType() == TokenType.KEYWORD && t1.getType() == TokenType.SPACE && t2.getType() == TokenType.KEYWORD) {
                }
                {
/*
        }
                    } else {
        }
                if (ArrayUtils.contains(DML_KEYWORD, token.getString())) {
    private static final String[] DML_KEYWORD = { "SELECT", "UPDATE", "INSERT", "DELETE" };

        CharSequence separator = "\n";
                int lfCount = 0;

                }
        isCompact = compact;
                    argList.remove(index + 1);
                        argList.add(i, new FormatterToken(TokenType.SYMBOL, statementDelimiters.get(0)));
        FormatterToken token;
    }
 * limitations under the License.
                    continue;
package org.jkiss.dbeaver.model.sql.format.tokenized;
                    // Possible exponential numbers notation (5E+6)
                }
                    index++;
    }
    }
        for (int index = argList.size() - 1; index >= 1; index--) {
            if (prev.getType() != TokenType.SPACE &&
                // "( TOKEN)"
                }
    private static  boolean isEmbeddedToken(FormatterToken token) {
            }
            after.append(GeneralUtils.getDefaultLineSeparator());
        }
import java.util.List;
                return false;
        return after.toString();
                    && t3.getString().trim().isEmpty()
                argList.add(index, new FormatterToken(TokenType.SPACE, " ")); //$NON-NLS-1$
        for (FormatterToken token : argList) {
            case "[":
                    argList.remove(index + 1);
 * You may obtain a copy of the License at
                    // Do not add space between symbols
        if (argSql.endsWith("\n")) { //$NON-NLS-1$
        }
    }
                t0.setString("(+)"); //$NON-NLS-1$
                argList.remove(index - 2);
import org.jkiss.dbeaver.ModelPreferences;
            if (token.getType() == TokenType.KEYWORD) {
        return null;
            if (t4.getString().equals("(") //$NON-NLS-1$
                if (((tokenString.equals("ORDER") || tokenString.equals("GROUP") || tokenString.equals("CONNECT")) && token2String.equals("BY")) ||
            FormatterToken prev = argList.get(index - 1);
                token.setString(keywordCase.transform(token.getString()));


            String tokenString = t0.getString().toUpperCase(Locale.ENGLISH);
                    continue;
                argList.remove(index - 2);
 * Licensed under the Apache License, Version 2.0 (the "License");
            {
                argList.remove(index - 2);
            String prevString = prev.getString();
    private void insertSpaces(List<FormatterToken> argList) {
    private void convertEmptyLinesIntoDelimiters(List<FormatterToken> argList) {
 * SQL formatter

    private static String getPrevDMLKeyword(List<FormatterToken> argList, int index) {
    }
                argList.remove(index);
        if (formatterCfg.getPreferenceStore().getBoolean(ModelPreferences.SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES)) {
                    (prevString.charAt(prevString.length() - 1) == 'E' || prevString.charAt(prevString.length() - 1) == 'e'))
            FormatterToken t0 = argList.get(index);
        boolean isSqlEndsWithNewLine = false;
            if (tokenString.equals("(") && t1.getString().equals("+") && token2String.equals(")")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
import org.jkiss.dbeaver.model.DBPIdentifierCase;

                argList.remove(index - 3);
            boolean isTokenNotContainsSeparator = !token.getString().contains(separator);
                    continue;
        }
            case "]":
                argList.remove(index - 1);
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
        transformCase(argList);
        }
 * See the License for the specific language governing permissions and
                    && t1.getString().trim().isEmpty()
                t3.setString(t3.getString() + t2.getString() + t0.getString());
public class SQLFormatterTokenized implements SQLFormatter {
        concatenateDoublewordedKeywords(argList);
import java.util.Locale;
    }
            } else if (prevToken.getType() == TokenType.SPACE && !prevToken.getString().contains(separator) && token.getType() == TokenType.COMMENT) {
    }

        if (argList.isEmpty()) {
            } else if (t3.getString().equals("(") &&
    private List<String> statementDelimiters = new ArrayList<>(2);
import java.util.ArrayList;
        for (FormatterToken token : list) {
        return false;
                        ((tokenString.equals("START")) && token2String.equals("WITH")))
            FormatterToken t0 = argList.get(index);

                    }
    public String format(final String argSql, SQLFormatterConfiguration configuration) {
            if (index >= argList.size()) {
            FormatterToken t1 = argList.get(index + 1);
        }
            FormatterToken t3 = argList.get(index - 3);
        return argList;
                    // Do not insert spaces around colons

import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
            if (token.getType() == TokenType.KEYWORD) {
            case "\"":
            case "'":
        }
                statementDelimiters.add(delim.toUpperCase(Locale.ENGLISH));
        return isCompact;

            return argList;

/**
 */
            case "-":
                {

            case "`":
            String token2String = t2.getString().toUpperCase(Locale.ENGLISH);


        StringBuilder after = new StringBuilder(argSql.length() + 20);
    public void setCompact(boolean compact) {
            FormatterToken t2 = argList.get(index + 2);

                    !curString.equals(")")) {
            case "<":
            FormatterToken token = argList.get(index);


            FormatterToken t1 = argList.get(index - 1);

        for (int index = 1; index < argList.size(); index++) {
        SQLTokensParser fParser = new SQLTokensParser(formatterCfg);
                }
    private void transformCase(List<FormatterToken> argList) {
        insertSpaces(argList);
                argList.remove(index);


    private boolean isCompact;

            case ">":
                }
    public static final String FORMATTER_ID = "DEFAULT";
            } else if (t3.getString().equals("(") &&
            if (token.getType() == TokenType.SPACE) {


            }
import org.jkiss.dbeaver.utils.GeneralUtils;
 *
        for (int index = argList.size() - 1; index >= 4; index--) {
                    !curString.startsWith("(") &&
        List<FormatterToken> list = fParser.parse(argSql);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                argList.remove(index - 1);
            argList.remove(tokenPosition);
        for (int i= 0; i < argList.size(); i++) {

    }
        final DBPIdentifierCase keywordCase = formatterCfg.getKeywordCase();
    }
                    && t0.getString().equalsIgnoreCase(")")) //$NON-NLS-1$

        FormatterToken token = argList.get(tokenPosition);
            }
        for (int index = 0; index < argList.size() - 2; index++) {

                    if (i > 0 && statementDelimiters.contains(argList.get(i - 1).getString())) {
import org.jkiss.utils.CommonUtils;
                    t0.getString().equalsIgnoreCase(")")) {
            }
            if (prevToken.getType() == TokenType.COMMENT && token.getType() == TokenType.SPACE && isTokenNotContainsSeparator) {
                    !prevString.equals("(") &&

                    // Do not add space between name and value [JDBC:MSSQL]
        }
                argList.remove(index + 1);
                if (token.getType() == TokenType.VALUE && prev.getType() == TokenType.NAME) {
                    continue;
    private void concatenateDoublewordedKeywords(List<FormatterToken> argList) {
                if (token.getType() == TokenType.SYMBOL && isEmbeddedToken(token) ||
                t4.setString(t4.getString() + t2.getString() + t0.getString());
            if (!CommonUtils.isEmptyTrimmed(delim)) {
        if (token.getType() == TokenType.SPACE) {

        if (isSqlEndsWithNewLine) {
            convertEmptyLinesIntoDelimiters(argList);
            after.append(token.getString());
    public boolean isCompact() {
                }
    private boolean isEmptyAfterSpaceRemoving(List<FormatterToken> argList, int tokenPosition) {

                    }

 *     http://www.apache.org/licenses/LICENSE-2.0
                // "(TOKEN )"
 *
 * DBeaver - Universal Database Manager
                for (int k = 0; k < token.getString().length(); k++) {
        // Remove extra tokens (spaces, etc)
            FormatterToken prevToken = argList.get(index - 1);
}
                    t1.getString().trim().isEmpty() &&
        removeSpacesAroundCommentToken(argList);
            case "#":
