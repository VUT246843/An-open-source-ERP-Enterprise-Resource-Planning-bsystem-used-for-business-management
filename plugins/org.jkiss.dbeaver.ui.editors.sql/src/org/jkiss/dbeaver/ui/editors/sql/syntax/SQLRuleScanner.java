    }
                } else {
    }
            return "Adapter of [" + rule.toString() + "]";
import java.util.IdentityHashMap;
        for (int i = 0; i < allRules.length; i++) {
            return Token.WHITESPACE;
            this.rule = rule;
                if (DEBUG) {
        @Override

    private IToken tryResolveExtraToken() {
        @Override
            } else {
    private SQLEditorBase editor = null;
 *


}
import org.eclipse.ui.themes.ITheme;
    public SQLRuleScanner() {
 * You may obtain a copy of the License at
            return Token.EOF;

        boolean boldKeywords = dataSourceContainer == null ?
    private IRule adaptRule(TPRule rule) {
    private final HashMap<SQLTokenType, IToken> extraSyntaxTokens = new HashMap<>();
        }
        protected final RULE rule;
 */
    public void dispose() {
        }
                return this.extraSyntaxTokens.computeIfAbsent(
    private class SimpleRuleAdapter<RULE extends TPRule> implements IRule {
        return super.nextToken();
        IToken token = this.tryResolveExtraToken();
            result[i] = adaptRule(allRules[i]);
                    }
        return keywordStyle;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Display;
    private static final boolean DEBUG = false;
            return Token.UNDEFINED;
import org.jkiss.dbeaver.model.text.parser.*;

        public IToken evaluate(ICharacterScanner scanner, boolean resume) {

 *
                    while (this.getOffset() < end) {
/**

import org.eclipse.ui.PlatformUI;
                            return Token.UNDEFINED;
    

import org.eclipse.swt.SWT;
    public Color getColor(String colorKey) {
        if (!token.isUndefined()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
            return Token.UNDEFINED;
            super(rule);
        if (token.isEOF()) {
    }
            return adaptToken(rule.getSuccessToken());
                );
        if (entry != null) {
        public String toString() {
    public IToken nextToken() {
        Color color = currentTheme.getColorRegistry().get(colorKey);
        setRules(result);
            return new PredicateRuleAdapter((TPPredicateRule)rule);
    public void refreshRules(@Nullable DBPDataSourceContainer dataSourceContainer, SQLRuleManager ruleManager, SQLEditorBase editor) {

/*
    private Color getColor(String colorKey, int colorDefault) {
            int end = syntaxContext.getLastAccessedTokenOffset() + entry.getInterval().length();
        IRule[] result = new IRule[allRules.length];
        super.fColumn = UNDEFINED;

        SimpleRuleAdapter(RULE rule) {

        @Override
 */
                    while (this.getOffset() < end) {


        }
    private IToken adaptToken(TPToken token) {
        keywordStyle = boldKeywords ? SWT.BOLD : SWT.NORMAL;
    }
import java.util.Map;
            return token;
        
    }
        } else {
        
        return fOffset;
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
        return getColor(colorKey, SWT.COLOR_BLACK);
                DBWorkbench.getPlatform().getPreferenceStore().getBoolean(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS) :
                dataSourceContainer.getPreferenceStore().getBoolean(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS);
        SQLQuerySymbolEntry entry = syntaxContext.findToken(offset);
import org.jkiss.code.Nullable;
            }
                            return Token.UNDEFINED;
            if (jfToken == null) {
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolEntry;
    }

                }

                        }
        int offset = this.getOffset();
    private int keywordStyle = SWT.NORMAL;
        }

    }
        SQLDocumentSyntaxContext syntaxContext = this.editor == null ? null : this.editor.getSyntaxContext();
            return new SimpleRuleAdapter<>(rule);
        @Override
            return adaptToken(rule.evaluate((TPCharacterScanner) scanner));
    @Override
    }
    public int getOffset() {
        } else {
        }
    private final Map<TPToken, IToken> tokenMap = new IdentityHashMap<>();
 * Unless required by applicable law or agreed to in writing, software
        @Override
        }
        }
        TPRule[] allRules = ruleManager.getAllRules();
        if (color == null) {
        }
 * SQLRuleScanner.

 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        } else {
        this.extraSyntaxTokens.clear();
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return Token.UNDEFINED;
 * limitations under the License.


                        if (super.read() == RuleBasedScanner.EOF) {
import org.eclipse.swt.graphics.Color;
        return color;
    private final IThemeManager themeManager;
import java.util.HashMap;
    }
            color = Display.getDefault().getSystemColor(colorDefault);
            return adaptToken(rule.evaluate((TPCharacterScanner) scanner));
    private class PredicateRuleAdapter extends SimpleRuleAdapter<TPPredicateRule> implements IPredicateRule {
 * Contains information about some concrete datasource underlying database syntax.
        if (syntaxContext == null) {
 *
                        }

 * distributed under the License is distributed on an "AS IS" BASIS,

        tokenMap.clear();
                    StringBuilder sb = new StringBuilder();
            IToken jfToken = tokenMap.get(token);
        }
                    entry.getSymbolClass().getTokenType(),
        this.editor = editor;
                        int c = super.read();
            return jfToken;
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public int getKeywordStyle() {
public class SQLRuleScanner extends RuleBasedScanner implements TPCharacterScanner {
        this.themeManager = PlatformUI.getWorkbench().getThemeManager();
    }
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private static class LazyToken extends TPTokenDefault {
    }
import org.jkiss.dbeaver.model.sql.semantics.SQLDocumentSyntaxContext;
    }
        super.fTokenOffset = fOffset;
        } else if (token.isUndefined()) {
        }
 * Support runtime change of datasource (reloads syntax information)
        PredicateRuleAdapter(TPPredicateRule rule) {

                    }
                return Token.UNDEFINED;
        ITheme currentTheme = themeManager.getCurrentTheme();
        }
        } else if (token.isWhitespace()) {
        }
            if (end > offset) {

        public LazyToken(TPTokenType type) {
import org.eclipse.ui.themes.IThemeManager;

    @Override
        public IToken evaluate(ICharacterScanner scanner) {
                    tt -> new SQLTokenAdapter(new LazyToken(tt), this)
    @NotNull
        public IToken getSuccessToken() {

        }
            return adaptToken(rule.evaluate((TPCharacterScanner) scanner, resume));
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public IToken evaluate(ICharacterScanner scanner) {
        }
                    System.out.println("found @" + offset + "-" + end + " " + entry + " = " + sb);
            super(type);
package org.jkiss.dbeaver.ui.editors.sql.syntax;
import org.eclipse.jface.text.rules.*;
                        if (c == RuleBasedScanner.EOF) {
import org.jkiss.code.NotNull;

        if (rule instanceof TPPredicateRule) {

                        sb.append((char) c);
 *
                tokenMap.put(token, jfToken = new SQLTokenAdapter(token, this));
