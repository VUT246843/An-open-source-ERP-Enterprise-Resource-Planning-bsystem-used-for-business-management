                    final Object tokenData = token.getData();
        if (!minimalRules) {
        
 * Support runtime change of datasource (reloads syntax information)
            }
import org.jkiss.code.Nullable;
            ));
        if (ruleProvider != null) {
            // Keep variable rule before parameter rule (see #18354)
            char escapeChar = syntaxManager.getEscapeChar();
        this.ruleProvider = GeneralUtils.adapt(syntaxManager.getDialect(), TPRuleProvider.class);
            Collections.addAll(rules, ruleProvider.extendRules(dataSourceContainer, TPRuleProvider.RulePosition.CONTROL));
        if (ruleProvider != null) {
                    if (quotes[1].equals(SQLConstants.STR_QUOTE_DOUBLE) && quotes[0].equals(quotes[1])) {
        allRules = rules.toArray(new TPRule[0]);
        return allRules;

/*
            
import org.jkiss.dbeaver.model.sql.parser.rules.*;
            if (dataSource != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        }
        } else {
    public void loadRules(@Nullable DBPDataSource dataSource, boolean minimalRules) {
                final SQLSetDelimiterToken setDelimiterToken = new SQLSetDelimiterToken();
    }

        final TPToken numberToken = new TPTokenDefault(SQLTokenType.T_NUMBER);
            // Delimiter redefine

            }
                }
        {
            if (!hasDoubleQuoteRule) {
 *
    private TPRule[] allRules = new TPRule[0];
            for (String reservedWord : dialect.getReservedWords()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            }
                final TPPredicateRule predicateRule = (TPPredicateRule) rule;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    rules.add(new SQLMultilineCommandRule(doubleCommandPrefix, controlCommand, controlToken));
import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;
        }
        for (String lineComment : dialect.getSingleLineComments()) {
import org.jkiss.dbeaver.Log;
        final boolean breaksOnEOF = true;
            String[][] stringQuoteStrings = syntaxManager.getStringQuoteStrings();
    public TPRule[] getRulesByType(@NotNull SQLTokenType requiredType) {
        // Add rules for multi-line comments
        for (TPRule rule : allRules) {
                    wordRule.addWord(bhs, blockHeaderToken);
            }
            rules.add(wordRule);
            if(ArrayUtils.contains(syntaxManager.getStatementDelimiters(), delimRedefine)) {
                // Control rules
        if (ruleProvider != null) {
        }
                for (String bhs : blockHeaderStrings) {

import org.jkiss.dbeaver.model.text.parser.rules.NumberRule;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!minimalRules) {
        // Add rule for single-line comments.

                    rules.add(new SQLCommandRule(commandPrefix, controlCommand, controlToken)); //$NON-NLS-1$
        List<TPRule> rules = new ArrayList<>();
        }
 */
                    }
        final SQLParameterToken parameterToken = new SQLParameterToken();
        final List<TPRule> rules = new ArrayList<>();

            if (lineComment.startsWith("^")) {
                for (String[] quotes : stringQuoteStrings) {
                }
    @Nullable
 * Contains information about some concrete datasource underlying database syntax.
                    final TPTokenAbstract<?> token = (TPTokenAbstract<?>) predicateRule.getSuccessToken();
            if (!ArrayUtils.isEmpty(stringQuoteStrings)) {
 * You may obtain a copy of the License at
import org.jkiss.utils.ArrayUtils;
        final TPToken keywordToken = new TPTokenDefault(SQLTokenType.T_KEYWORD);
                        rules.add(rule);
            }
            }
    public SQLRuleManager(@NotNull SQLSyntaxManager syntaxManager) {

        final TPToken multilineCommentToken = new SQLMultilineCommentToken();
            // Add generic whitespace rule.
        if (dataSource == null) {
        }
 * DBeaver - Universal Database Manager
        if (multiLineComments != null) {
        this.syntaxManager = syntaxManager;
            Collections.addAll(rules, ruleProvider.extendRules(dataSourceContainer, TPRuleProvider.RulePosition.INITIAL));
    @NotNull

                ? new NestedMultiLineRule(multiLineComments.getFirst(), multiLineComments.getSecond(), multilineCommentToken, (char) 0, breaksOnEOF)
        final TPToken functionToken = new TPTokenDefault(SQLTokenType.T_FUNCTION);
                String doubleCommandPrefix = commandPrefix + commandPrefix;
            } catch (Exception e) {
            Collections.addAll(rules, ruleProvider.extendRules(dataSourceContainer, TPRuleProvider.RulePosition.QUOTES));

                delimRedefine = null;
    public void loadRules(@Nullable DBPDataSourceContainer dataSourceContainer, boolean minimalRules) {
                    wordRule.addFunction(function);
                log.error(e);
import java.util.List;
        final TPToken typeToken = new TPTokenDefault(SQLTokenType.T_TYPE);
            try {
            rules.add(new NumberRule(numberToken));
            } else {
            loadRules((DBPDataSourceContainer) null, minimalRules);

import org.jkiss.dbeaver.model.sql.SQLConstants;
                rules.add(new ScriptParameterRule(syntaxManager, parameterToken, npPrefix));
            final String[] blockHeaderStrings = dialect.getBlockHeaderStrings();
            rules.add(new WhitespaceRule(TPTokenAbstract.WHITESPACE));
            if (rule instanceof TPPredicateRule) {
package org.jkiss.dbeaver.model.sql.parser;
        final SQLVariableToken variableToken = new SQLVariableToken();
            if (!CommonUtils.isEmpty(delimRedefine)) {
            if (blockBounds != null) {

        return rules.toArray(new TPRule[0]);
                    }
 */
    }
        if (ruleProvider != null) {
                    wordRule.addFunction(reservedWord);
import org.jkiss.dbeaver.model.sql.registry.SQLCommandsRegistry;
                }
                        continue;
            for (String npPrefix : syntaxManager.getNamedParameterPrefixes()) {
            String[][] identifierQuoteStrings = syntaxManager.getIdentifierQuoteStrings();
            // Parameter rule
public class SQLRuleManager {
import org.jkiss.dbeaver.model.text.parser.*;
            boolean hasDoubleQuoteRule = false;
                    rules.add(new MultiLineRule(quotes[0], quotes[1], quotedToken, escapeChar, breaksOnEOF));

            }
                } else {
        // Decides whether the pattern can be accepted by hitting EOF instead of the end sequence.
        // We enable it for all "paired" literals like quoted strings, identifiers and comments, as proposed in #11773.
            }
        
                }
import org.jkiss.dbeaver.utils.GeneralUtils;
                rules.add(new MultiLineRule(SQLConstants.STR_QUOTE_DOUBLE, SQLConstants.STR_QUOTE_DOUBLE, quotedToken, escapeChar, breaksOnEOF));
        }
                String commandPrefix = syntaxManager.getControlCommandPrefix();
                    rules.add(new MultiLineRule(quotes[0], quotes[1], stringToken, escapeChar, breaksOnEOF));
    private SQLSyntaxManager syntaxManager;
/**

import java.util.Collections;
                }
            String[][] blockBounds = dialect.getBlockBoundStrings();
                }
            rules.add(dialect.supportsNestedComments()
 * you may not use this file except in compliance with the License.
            if (syntaxManager.isVariablesEnabled()) {
}
    @NotNull
    public TPRule[] getAllRules() {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (!minimalRules) {
            if (!ArrayUtils.isEmpty(blockHeaderStrings)) {
    private static final Log log = Log.getLog(SQLRuleManager.class);
        SQLDelimiterRule delimRule = new SQLDelimiterRule(syntaxManager.getStatementDelimiters(), delimiterToken);
import java.util.ArrayList;
import org.jkiss.dbeaver.model.DBPKeywordType;
 *

                rules.add(new ScriptVariableRule(parameterToken));
            DBPDataSource dataSource = dataSourceContainer != null ? dataSourceContainer.getDataSource() : null;
import org.jkiss.dbeaver.model.sql.SQLDialect;
                }
        final TPToken commentToken = new SQLCommentToken();
            Collections.addAll(rules, ruleProvider.extendRules(dataSourceContainer, TPRuleProvider.RulePosition.KEYWORDS));
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.text.parser.rules.MultiLineRule;
                }

        final SQLBlockEndToken blockEndToken = new SQLBlockEndToken();
            }
 * SQLRuleManager.
            loadRules(dataSource.getContainer(), minimalRules);
    }

        final SQLDelimiterToken delimiterToken = new SQLDelimiterToken();

import org.jkiss.dbeaver.model.text.parser.rules.EndOfLineRule;
    public void loadRules() {

import org.jkiss.utils.Pair;
        if (ruleProvider != null) {
import org.jkiss.code.NotNull;
        if (!minimalRules) {
            final SQLControlToken controlToken = new SQLControlToken();
                    if (block.length != 2) {
        rules.add(delimRule);
        final SQLBlockHeaderToken blockHeaderToken = new SQLBlockHeaderToken();
 * limitations under the License.
                rules.add(new EndOfLineRule(lineComment, commentToken, (char) 0, false, true));
        SQLDialect dialect = syntaxManager.getDialect();

                if (predicateRule.getSuccessToken() instanceof TPTokenAbstract) {

                    if (tokenData instanceof TPTokenType && ((TPTokenType) tokenData).getTokenType() == requiredType.getTokenType()) {

                for (String[] quotes : identifierQuoteStrings) {
            // Add numeric rule
            }
 *
            String delimRedefine = dialect.getScriptDelimiterRedefiner();
                rules.add(0, new SQLDelimiterSetRule(delimRedefine, setDelimiterToken, delimRule));
            SQLWordRule wordRule = new SQLWordRule(delimRule, functionToken, otherToken, dialect);
        loadRules((DBPDataSourceContainer) null, false);
            if (!ArrayUtils.isEmpty(identifierQuoteStrings)) {
                    wordRule.addWord(reservedWord, keywordToken);

                    wordRule.addWord(block[1], blockEndToken);
                for (String type : dialect.getDataTypes(dataSource)) {
            }
 * See the License for the specific language governing permissions and
        }
    }

    @NotNull

                    }
            // Add rules for delimited identifiers and string literals.
 * Unless required by applicable law or agreed to in writing, software
                : new MultiLineRule(multiLineComments.getFirst(), multiLineComments.getSecond(), multilineCommentToken, (char) 0, breaksOnEOF
 *     http://www.apache.org/licenses/LICENSE-2.0
                        hasDoubleQuoteRule = true;
            // Add word rule for keywords, functions, types, and constants.
        {
import org.jkiss.dbeaver.model.DBPDataSource;
    @NotNull

            }
        final TPToken otherToken = new TPTokenDefault(SQLTokenType.T_OTHER);
        final SQLBlockBeginToken blockBeginToken = new SQLBlockBeginToken();
        }

            }

                    wordRule.addWord(block[0], blockBeginToken);
        }
import org.jkiss.dbeaver.model.text.parser.rules.WhitespaceRule;
                    wordRule.addWord(type, typeToken);
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;

                for (SQLCommandHandlerDescriptor controlCommand : SQLCommandsRegistry.getInstance().getCommandHandlers()) {
        }

                // Variable rule
        final TPToken quotedToken = new TPTokenDefault(SQLTokenType.T_QUOTED);
        }
        }
        final TPToken stringToken = new TPTokenDefault(SQLTokenType.T_STRING);
                for (String function : dialect.getFunctions()) {

            }
        }

        }
import org.jkiss.dbeaver.model.sql.parser.tokens.*;
        }
                for (String[] block : blockBounds) {
    }
    private TPRuleProvider ruleProvider;
                // Functions without parentheses has type 'DBPKeywordType.OTHER' (#8710)
                rules.add(new LineCommentRule(lineComment, commentToken, (char) 0, false, true));
        Pair<String, String> multiLineComments = dialect.getMultiLineComments();
            Collections.addAll(rules, ruleProvider.extendRules(dataSourceContainer, TPRuleProvider.RulePosition.FINAL));
                if (keywordType == DBPKeywordType.FUNCTION || keywordType == DBPKeywordType.OTHER) {
                DBPKeywordType keywordType = dialect.getKeywordType(reservedWord);
                }

