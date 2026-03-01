    public static ITypedRegion[] getDocumentRegions(IDocument doc) {
    private void adaptRules(@NotNull TPRule... rules) {
        return Token.UNDEFINED;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.jface.text.ITypedRegion;
        }
    private final List<IPredicateRule> rules = new ArrayList<>();
import java.util.List;
     *
    /**

    private final DBPDataSource dataSource;

            }

    }
                dataSource == null ? null : dataSource.getContainer(),
        public IToken evaluate(ICharacterScanner scanner, boolean resume) {
    }
        adaptRules(ruleManager.getRulesByType(SQLTokenType.T_QUOTED));
    // Syntax highlight
        if (token instanceof TPTokenDefault) {

    }
            }
     * for each comment line, string literal, delimited identifier, and "everything else"
        } catch (Exception e) {
                    case T_COMMENT:
    public int getOffset() {
        } catch (BadLocationException e) {
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        public IToken getSuccessToken() {
            // ignore
                        return controlToken;
                switch (((SQLTokenType) token.getData())) {
        adaptRules(ruleManager.getRulesByType(SQLTokenType.T_CONTROL));
        @Override
        initRules(dialect, ruleManager);
     */
        }
        @Override
import org.jkiss.dbeaver.Log;
import org.eclipse.jface.text.TextUtilities;
        }
import org.eclipse.jface.text.IDocument;
     * (that is, SQL code other than a string literal or delimited identifier).
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

                this.rules.add(new PredicateRuleAdapter((TPPredicateRule) rule));
    }
public class SQLPartitionScanner extends RuleBasedPartitionScanner implements TPPartitionScanner {

import org.eclipse.jface.text.rules.*;
        try {

                if (pr instanceof TPPredicateRule) {
            // Do nothing
     * <code>ITypedRegion</code> objects.  There is a distinct non-overlapping partition

                    case T_CONTROL:
    private static final Log log = Log.getLog(SQLPartitionScanner.class);
    public String getScannedPartitionString() {
        return fOffset;
    }
        ITypedRegion[] regions = null;
        setPredicateRules(result);
    }
     */
                    case T_STRING:
        try {
        rules.toArray(result);
 *     http://www.apache.org/licenses/LICENSE-2.0

    public SQLPartitionScanner(DBPDataSource dataSource, SQLDialect dialect, SQLRuleManager ruleManager) {
     * @return an array containing the document partition regions
    @Override
 */
            return fDocument.get(fPartitionOffset, fOffset - fPartitionOffset);
    }
                }
    private final IToken sqlQuotedToken = new Token(SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED);
                    rules.add(new PredicateRuleAdapter((TPPredicateRule) pr));
 *
        if (ruleProvider != null) {
import org.jkiss.dbeaver.model.text.parser.*;
            for (TPRule pr : partRules) {
        }

            return adaptToken(rule.evaluate((TPCharacterScanner) scanner));
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.jkiss.code.NotNull;
 *
        adaptRules(ruleManager.getRulesByType(SQLTokenType.T_COMMENT));
        return "";
            regions = TextUtilities.computePartitioning(doc, SQLParserPartitions.SQL_PARTITIONING, 0, doc.getLength(), false);
import org.eclipse.jface.text.BadLocationException;
        this.dataSource = dataSource;

     * Gets the partitions of the given document as an array of
     * @return value



 * Licensed under the Apache License, Version 2.0 (the "License");

 */
                        return sqlQuotedToken;
        }
     * (@see NestedMultiLineRule) need this information to calculate the comment nesting depth.
 * you may not use this file except in compliance with the License.
    private void initRules(SQLDialect dialect, SQLRuleManager ruleManager) {
    private class PredicateRuleAdapter implements IPredicateRule {
    private final IToken commentToken = new Token(SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT);
                        return token instanceof SQLMultilineCommentToken ? multilineCommentToken : commentToken;
/*
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLMultilineCommentToken;
 * changed. The document partitions are based on tokens that represent comments
        }
        IPredicateRule[] result = new IPredicateRule[rules.size()];
    private final IToken controlToken = new Token(SQLParserPartitions.CONTENT_TYPE_SQL_CONTROL);
     * Return the String ranging from the start of the current partition to the current scanning position. Some rules
 *
        @Override
                }
}
/**
 * See the License for the specific language governing permissions and
    private void setupRules() {
                TPRuleProvider.RulePosition.PARTITION);
     *
    }
package org.jkiss.dbeaver.model.sql;
        private final TPPredicateRule rule;
            return adaptToken(rule.getSuccessToken());
 * You may obtain a copy of the License at
     * @param doc the document to parse into partitions
 * Unless required by applicable law or agreed to in writing, software
        }
    }

            if (rule instanceof TPPredicateRule) {
        }

 * The <code>SQLPartitionScanner</code>, a subclass of a <code>RulesBasedPartitionScanner</code>,
                        return sqlStringToken;
import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
 * is responsible for dynamically computing the partitions of its
    private IToken adaptToken(TPToken token) {
            return adaptToken(rule.evaluate((TPCharacterScanner) scanner, resume));
            if (token.getData() instanceof SQLTokenType) {
    /**
import java.util.ArrayList;
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.DBPDataSource;

        for (TPRule rule : rules) {
    private final IToken multilineCommentToken = new Token(SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT);

            TPRule[] partRules = ruleProvider.extendRules(
 * and SQL code sections.
        return regions;
            this.rule = rule;
    private final IToken sqlStringToken = new Token(SQLParserPartitions.CONTENT_TYPE_SQL_STRING);
        adaptRules(ruleManager.getRulesByType(SQLTokenType.T_STRING));
                    case T_QUOTED:
        PredicateRuleAdapter(TPPredicateRule rule) {
 * SQL document as events signal that the document has
        public IToken evaluate(ICharacterScanner scanner) {
 * DBeaver - Universal Database Manager
        setupRules();
        TPRuleProvider ruleProvider = GeneralUtils.adapt(dialect, TPRuleProvider.class);
