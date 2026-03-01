
    }
                    }
            } else switch (tokenString) {
            default:
                argList.remove(index);
                s = "";
            FormatterToken token = argList.get(index);
    private final SQLFormatterConfiguration formatterCfg;
                                break;
            }
    }
        return null;
        this.formatterCfg = formatterCfg;
                    index = formatCommand(argList, index, token);
        }
                }
                    boolean isAfterInKeyword = bracketsDepth > 0 && SQLConstants.KEYWORD_IN.equalsIgnoreCase(getPrevKeyword(argList, index));
            }

                    result += insertReturnAndIndent(argList, index, indent - 1);
                case "HAVING":  //$NON-NLS-1$
 * limitations under the License.
                            argList,
                case "UNION":
                case "FULL":
            }
    private int formatSpace(@NotNull List<? extends FormatterToken> argList, int index, @NotNull FormatterToken token) {
            String prevToken = argList.get(index - 1).getString();
                if (!token.getString().contains(s)) {
                        result = checkConditionDepth(result, argList, index);
class IndentFormatter {
            if (token.getType() == TokenType.SPACE || token.getType() == TokenType.SYMBOL) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (delimiterRedefiner != null) {
    private List<Boolean> conditionBracket = new ArrayList<>();
                case "INTERSECT":
                    boolean isInsideAFunction = functionBracket.size() != 0 && functionBracket.get(functionBracket.size() - 1).equals(Boolean.TRUE);
                    }
                    }
                }
                );
import org.jkiss.dbeaver.model.sql.SQLConstants;
            if (token.getType() == TokenType.SPACE || token.getType() == TokenType.SYMBOL) {
                        }
                        result += insertReturnAndIndent(argList, index, indent);
    private static final Log log = Log.getLog(SQLFormatterTokenized.class);
        return getPrevSpecialKeyword(argList, index, true) != null;
        }
    private boolean isCondition(List<FormatterToken> argList, int index) {
            return 1;
            if (divPos > 0) {
        int result = index;
                    if (!isCompact) {
        if (!isComment) {
                    }

        indent = 0;
        FormatterToken prev = new FormatterToken(TokenType.SPACE, " "); //$NON-NLS-1$
                case SYMBOL:
                    break;
            FormatterToken token = argList.get(i);

                    {
        }
    private int formatSymbol(String tokenString, List<Integer> bracketIndent, List<FormatterToken> argList, Integer index, FormatterToken prev) {
            }
                    if ("CREATE".equalsIgnoreCase(getPrevKeyword(argList, index))) {
        }
    private String getPrevKeyword(List<FormatterToken> argList, int index) {
                case "DELETE": //$NON-NLS-1$
                        if (bracketsDepth > 0) {
                            if (nextIndex > 0 && "REPLACE".equals(argList.get(nextIndex).getString().toUpperCase(Locale.ENGLISH))) {
                        indent = 0;
            if (argList.get(i).getType() == TokenType.KEYWORD) {
                }
                case "JOIN":
    private static final String[] NO_SPACE_IN_COMPACT_KEYWORDS = { "SELECT", "UPDATE", "INSERT", "DELETE", "FROM", "WHERE" };
                }
                return false;

            // Add indent for first condition keyword in conditions expression in brackets
 * You may obtain a copy of the License at
                }
                        indent--;
            }
                    if (!isCompact) {
                indent++;
    }
            return index;
    }
                case SPACE:
                case "VALUES":  //$NON-NLS-1$
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (argIndex > 0) {
                    break;
                }
            }
                    //index += insertReturnAndIndent(argList, index + 1, indent);
                String upperCaseToken = token.getString().toUpperCase(Locale.ENGLISH);
            return false;
        }
                if (!isCompact && formatterCfg.getPreferenceStore().getBoolean(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET)) {
                    if (!isInsideAFunction && !isAfterInKeyword)
            }
        }
        }
            if (isDelimiter) {
            final int divPos = command.lastIndexOf(' ');
        for (String delim : formatterCfg.getSyntaxManager().getStatementDelimiters()) {
                    if (!isCompact) {
                    bracketsDepth--;
                if (!CommonUtils.isEmpty(delimiter)) {
                case "UPDATE": //$NON-NLS-1$
        }
        if (statementDelimiters.contains(tokenString)) { //$NON-NLS-1$
                            result += insertReturnAndIndent(argList, index, indent - 1);
                    indent = 0;
                    index += insertReturnAndIndent(argList, index, indent);
                    index = formatKeyword(argList, tokenString, index);
        return result;
                    if (tokenString.equals("JOIN")) {
                    }
        for (int i = index - 1; i >= 0; i--) {
            }
                            lfBeforeComma ? index : index + 1,
    private int insertReturnAndIndent(final List<FormatterToken> argList, final int argIndex, final int argIndent) {
                }
                    //fallthrough
                break;
    private List<Boolean> functionBracket = new ArrayList<>();
                return 0;
                    indent++;
            }
        if (isCompact) {

            for (String slc : slComments) {
            case ")":
                }
    IndentFormatter(SQLFormatterConfiguration formatterCfg, boolean isCompact) {
                    if (!isCompact) {
                    isFirstConditionInBrackets = false;
                    statementDelimiters.clear();
                    formatterCfg.isFunction(prev.getString()) || formatterCfg.isIdentifier(prev.getString())
                    }
                case "CREATE":
    private static String getNextKeyword(List<FormatterToken> argList, int index) {
                        } else if (index > 0) {
        }
                        argList.add(argIndex + 1, lineFeed);
        try {
 *
                }
                }
import org.jkiss.dbeaver.utils.GeneralUtils;
 *
                    }
        dialect = formatterCfg.getSyntaxManager().getDialect();
        if (ki < 0) {
                            indent = 0;
        token.setString(newTokenString);
        }
                case "CONNECT BY":
            case ",":
 */
                }
                        result += insertReturnAndIndent(argList, index, indent - 1);
                s += formatterCfg.getIndentString();
                    break;
                        if (nextIndex > 0 && "OR".equals(argList.get(nextIndex).getString().toUpperCase(Locale.ENGLISH))) {
                        int nextIndex = getNextKeywordIndex(argList, index);
                        result += insertReturnAndIndent(argList, index + 1, indent);
                indent--;
                    break;
            }
            if (!isDelimiter && argIndex > 0) {
        for (int i = index - 1; i >= 0; i--) {

        }
                    }
    public void format(List<FormatterToken> argList) {
                    // FIXME: This produces double indent - #3679. But still needed in some cases?
        }
                    break;
package org.jkiss.dbeaver.model.sql.format.tokenized;
            FormatterToken token = argList.get(i);
    private final String[] blockHeaderStrings;
                    conditionBracket.remove(conditionBracket.size() - 1);
        if (argIndex >= argList.size()) {
                    index = formatComment(argList, index, token);
                statementDelimiters.add(delim.toUpperCase(Locale.ENGLISH));
                case "ELSE":  //$NON-NLS-1$
                    index += insertReturnAndIndent(argList, index + 1, indent);
                    indent -= 2;
                    if (isJoinStart(argList, index)) {
                if (prevToken.getType() == TokenType.COMMENT &&
                case "NATURAL":
                continue;

                    result += insertReturnAndIndent(argList, index, indent - 1);
            result += insertReturnAndIndent(argList, index + 1, indent);
                case "LEFT":
            delimiterRedefiner = null;
                }
    }
                break;
    }
        switch (tokenString) {
        if (argList.get(index - 1).getType() != TokenType.COMMENT || argList.get(index + 1).getType() != TokenType.NAME) {
                if (argList.size() > argIndex + 1) {
        }
            } else {
            if (!CommonUtils.isEmptyTrimmed(delim)) {
                    if (!isCompact) {
                isFirstConditionInBrackets = true;
            return index;
        if (indexOfLastSeparator == -1) {
        for (int i = index - 1; i >= 0; i--) {
                    indent++;
                    break;
        if (index > 0) {
            } else if (SQLUtils.isBlockEndKeyword(dialect, tokenString)) {
                        result += insertReturnAndIndent(argList, index + 1, indent);
                if ((isCondition && ArrayUtils.contains(CONDITION_KEYWORDS, upperCaseToken)) ||
        // And we must be in the beginning of sequence
                case "ALTER": //$NON-NLS-1$
                    isComment = true;
                case KEYWORD:
                        if (isFirstConditionInBrackets) {
    private static final String[] JOIN_BEGIN = {"LEFT", "RIGHT", "INNER", "OUTER", "FULL", "CROSS", "NATURAL", "JOIN"};
        if (statementDelimiters.contains(delimiterRedefiner)) {
                token = argList.get(argIndex - 1);
import org.jkiss.dbeaver.model.sql.SQLDialect;
    private String delimiterRedefiner;
                result += insertReturnAndIndent(argList, index - 1, indent);
            } else if (argList.get(argIndex).getType() == TokenType.COMMENT) {
                if (!bracketIndent.isEmpty() && !functionBracket.isEmpty() && !conditionBracket.isEmpty()) {
        int result = index;
                            // Extra line feed
            if (!ArrayUtils.contains(JOIN_BEGIN, token.getString().toUpperCase(Locale.ENGLISH))) {
        }
                        argList.set(argIndex + 1, lineFeed);
        }
    }
                    result += insertReturnAndIndent(argList, index, indent);

                    encounterBetween = true;
                        result += insertReturnAndIndent(argList, index, indent);
                    // SQL Server specific
                    break;
            String tokenString = token.getString().toUpperCase(Locale.ENGLISH);
                break;
            prev = token;
            if (prevToken.equals(",") || Arrays.stream(NO_SPACE_IN_COMPACT_KEYWORDS).anyMatch(t -> t.equalsIgnoreCase(prevToken))) {
    }
            log.debug(e);
            return result;
    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.sql.SQLUtils;
                    break;
            if (index > 0) {
                case "CASE":  //$NON-NLS-1$
        int indexAfterLastSeparator = indexOfLastSeparator + System.lineSeparator().length();
                    // Initially was added for proper MySQL views formatting.
                return token.getString();
                case "TABLE": //$NON-NLS-1$

        }
        }
                    break;

                    if (index > 1) {
    private int formatComment(List<FormatterToken> argList, int index, FormatterToken token) {
        }

            FormatterToken token = argList.get(argIndex);
                default:
                String delimiter = command.substring(divPos).trim();
                conditionBracket.add(isCondition(argList, index) ? Boolean.TRUE : Boolean.FALSE);
    private int formatCommand(List<FormatterToken> argList, int index, FormatterToken token) {
            indent++;
                return index - 1;
                    index += insertReturnAndIndent(argList, index + 1, indent);
import java.util.*;
            FormatterToken token = argList.get(i);
            delimiterRedefiner = delimiterRedefiner.toUpperCase(Locale.ENGLISH);
                case COMMENT:
                            result += insertReturnAndIndent(argList, index - 1, indent);
        if (afterLastSeparator.equals(indentation)) {

    private int bracketsDepth = 0;
    }
        }
        String newTokenString = tokenString.substring(0, indexAfterLastSeparator) + indentation;
                }
                        result += insertReturnAndIndent(argList, index, indent);
                continue;
        int indexOfLastSeparator = tokenString.lastIndexOf(System.lineSeparator());
                if (!isCompact) {
                    break;
        if (functionBracket.contains(Boolean.TRUE))
            indent = 0;
                case "SET": {


        }
        return index;
                    break;
                    SQLUtils.isCommentLine(formatterCfg.getSyntaxManager().getDialect(), prevToken.getString())) {
                    /*if (bracketsDepth <= 0 || "SELECT".equals(getPrevSpecialKeyword(argList, index)))*/

        for (int index = 0; index < argList.size(); index++) {
                    functionBracket.remove(functionBracket.size() - 1);
                    break;
            if (blockHeaderStrings != null && ArrayUtils.contains(blockHeaderStrings, tokenString) || (SQLUtils.isBlockStartKeyword(dialect, tokenString) &&
 * DBeaver - Universal Database Manager
}
        }
    private boolean isFirstConditionInBrackets;
 * See the License for the specific language governing permissions and
                case "OUTER":
                        result += insertReturnAndIndent(argList, result + 1, indent);
            return index;
                        result += insertReturnAndIndent(argList, index + 3, indent);
                case COMMAND:
                    return 0;
                case "RIGHT":
        StringBuilder stringBuilder = new StringBuilder();
                // It is not the begin of sequence
                case "DROP": //$NON-NLS-1$

                        break;
            } else {
import org.jkiss.utils.Pair;
    private static final String[] DML_KEYWORD = { "SELECT", "UPDATE", "INSERT", "DELETE" };
                    break;

                    result += insertReturnAndIndent(argList, index, indent);
            }
            if (token.getType() == TokenType.KEYWORD) {
            if (ArrayUtils.contains(JOIN_BEGIN, token.getString().toUpperCase(Locale.ENGLISH))) {
                            result = checkConditionDepth(result, argList, index);
                    s = ""; //$NON-NLS-1$
                    index = formatSymbol(tokenString, bracketIndent, argList, index, prev);
            return index;
                    if (!isCompact && formatterCfg.getPreferenceStore().getBoolean(ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET)) {
                !SQLConstants.KEYWORD_SELECT.equalsIgnoreCase(getPrevSpecialKeyword(argList, index, false)))) { // If SELECT is previous keyword, then we are already inside the block
        }
            isFirstConditionInBrackets = false;
        return result;
                    }
                case "LIMIT":  //$NON-NLS-1$
import org.jkiss.utils.ArrayUtils;
                    }
                            }
            }
        String[] slComments = formatterCfg.getSyntaxManager().getDialect().getSingleLineComments();
        return index;
            if (token.getType() == TokenType.SPACE) {
        for (int i = index; i < argList.size(); i++) {
                    }
            }
                        indent++;
    private int checkConditionDepth(int result, List<FormatterToken> argList, int index) {
                    if (argList.get(argIndex + 1).getType() == TokenType.SPACE) {
                    if (argList.size() < index + 3) {
                case "GROUP BY":
                result += insertReturnAndIndent(argList, index, indent);
                case "WHEN":
                // It is not the begin of sequence
                argList.add(argIndex, new FormatterToken(TokenType.SPACE, s));
                        index += insertReturnAndIndent(argList, index + 1, indent);
            return 0;


        delimiterRedefiner = formatterCfg.getSyntaxManager().getDialect().getScriptDelimiterRedefiner();
        final List<Integer> bracketIndent = new ArrayList<>();
            result += insertReturnAndIndent(argList, index, indent);
                case "CROSS":
    }
    private boolean encounterBetween = false;
            }
                    if (statementDelimiters.contains(tokenString)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
                case "TRUNCATE": //$NON-NLS-1$
                case "OR":
                    encounterBetween = false;
            if (token.getString().toUpperCase(Locale.ENGLISH).equals("JOIN")) {
        String tokenString = token.getString();
                case "AND":  //$NON-NLS-1$
    private int indent = 0;
        this.isCompact = isCompact;
    private int formatKeyword(List<FormatterToken> argList, String tokenString, int index) {
                case "SELECT": //$NON-NLS-1$
                bracketsDepth++;
                            // just add lf before keyword
            return 0;
                    result += insertReturnAndIndent(argList, index, indent);
        blockHeaderStrings = dialect.getBlockHeaderStrings();
        return null;
        if (slComments != null) {
            FormatterToken token = argList.get(i);
                if (token.getString().startsWith(slc)) {
    private final boolean isCompact;
                case "EXCEPT": //$NON-NLS-1$
        return index;
                            indent);
        return argList.get(ki).getString();
                    return token.getString();
                final FormatterToken prevToken = argList.get(argIndex - 1);
                    index = formatSpace(argList, index, token);
                    }
            }
    private List<String> statementDelimiters = new LinkedList<>();
                case "INNER":
                            result += insertReturnAndIndent(argList, index, indent);
 * Unless required by applicable law or agreed to in writing, software
                // Do not add line separator before comment
            }
                        if ("UPDATE".equalsIgnoreCase(getPrevKeyword(argList, index))) {
                    result += insertReturnAndIndent(argList, index, indent);
        } catch (IndexOutOfBoundsException e) {
                case "END": // CASE ... END
    private final SQLDialect dialect;
                    // Replace space token only if it has less chars
        if (conditionBracket.size() != 0 && conditionBracket.get(conditionBracket.size() - 1).equals(Boolean.TRUE)) {

            final String command = token.getString().trim().toUpperCase(Locale.ENGLISH);
                        indent++;
                break;
                case "INTO": //$NON-NLS-1$
                        (!isCondition && ArrayUtils.contains(DML_KEYWORD, upperCaseToken))) {
                    result += insertReturnAndIndent(argList, index, indent);
        }
                    result += insertReturnAndIndent(argList, index + 1, indent);
            return 0;
            stringBuilder.append(formatterCfg.getIndentString());
                        }
            Pair<String, String> mlComments = formatterCfg.getSyntaxManager().getDialect().getMultiLineComments();
                    break;
                    : Boolean.FALSE
                return true;
                if (token.getType() == TokenType.SPACE) {
                case "TOP":  //$NON-NLS-1$ //$NON-NLS-2$
                case "WHERE":
    }
                if (statementDelimiters.contains(tokenString)) {
                    } else {
                case "FROM":
            }

                    result += insertReturnAndIndent(argList, index, indent + 1);
        if (token.getType() != TokenType.SPACE || !CommonUtils.isValidIndex(index, argList.size() - 1) || index == 0) {
                return i;
                    result += insertReturnAndIndent(argList, index + 1, indent);
                    token.setString(s);
            }
        return false;
        for (int i = index + 1; i < argList.size(); i++) {
                }
/*
        if (!CommonUtils.isEmpty(delimiterRedefiner) && token.getString().startsWith(delimiterRedefiner)) {
                    indent--;
                    }
                    break;
                    FormatterToken lineFeed = new FormatterToken(TokenType.SPACE, s + s);
    private boolean isJoinStart(List<FormatterToken> argList, int index) {
        return result;
    }
                        result += insertReturnAndIndent(
                    token.setString(s);
    }
            boolean isDelimiter = statementDelimiters.contains(token.getString().toUpperCase());
import org.jkiss.dbeaver.ModelPreferences;
                    break;
            index += insertReturnAndIndent(argList, index, 0);
        // check previous token
                    if (!encounterBetween) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        // check last token
            if (mlComments != null) {
                case "ORDER BY":
import org.jkiss.code.NotNull;
                functionBracket.add(
                    }
                    break;
        int ki = getNextKeywordIndex(argList, index);
                return false;
 *
                        }
                    //indent++;

            case "(":
        index += insertReturnAndIndent(argList, index + 1, 0);
                result += insertReturnAndIndent(argList, index + 1, indent);
                if (token.getString().startsWith(mlComments.getFirst())) {
                        }
                case "START WITH":
                    ? Boolean.TRUE
    private String getPrevSpecialKeyword(List<FormatterToken> argList, int index, boolean isCondition) {
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
        if (!ArrayUtils.contains(JOIN_BEGIN, argList.get(index).getString().toUpperCase(Locale.ENGLISH))) {
                        boolean lfBeforeComma = formatterCfg.getPreferenceStore().getBoolean(ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA);
        String indentation = stringBuilder.toString();
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return null;
                    statementDelimiters.add(delimiter);
    }
                if (index > 0) {
                    if ("CASE".equalsIgnoreCase(getPrevKeyword(argList, index))) {
        boolean isComment = false;
                    break;
            if (token.getType() == TokenType.KEYWORD) {
                case "BETWEEN":  //$NON-NLS-1$
            switch (token.getType()) {
        return -1;

                        break;
        }
        } else {
        String afterLastSeparator = tokenString.substring(indexAfterLastSeparator);
                            nextIndex = getNextKeywordIndex(argList, nextIndex);
                // Adding indent after ( makes result too verbose and too multiline
                    indent = bracketIndent.remove(bracketIndent.size() - 1);
        // check current token
        }
                                insertReturnAndIndent(argList, nextIndex + 1, indent);
                    }
        for (int i = 0; i < indent; i++) {

    private static int getNextKeywordIndex(List<FormatterToken> argList, int index) {
                    if (isFirstConditionInBrackets) {
                case "INSERT": //$NON-NLS-1$
                case "USING":  //$NON-NLS-1$ //$NON-NLS-2$
            }
                    break;
            }
            for (int index = 0; index < argIndent; index++) {
                        //index += insertReturnAndIndent(argList, index + 1, indent);
            }

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;
    private static final String[] CONDITION_KEYWORDS = {"WHERE", "ON", "HAVING"};
                        // Don't add indent, if AND after BETWEEN or not first condition in expression in brackets
                    break;
        }
                case "ON": {
                }
                bracketIndent.add(indent);
                    }
            String s = GeneralUtils.getDefaultLineSeparator();
        // Keyword sequence must start from LEFT, RIGHT, INNER, OUTER or JOIN and must end with JOIN
