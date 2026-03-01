 */

 */
                        ? (SQLTokenType) ((TPTokenDefault) token).getData()
/*
        private int pos = 0;

        @Override
        private final String string;
                TPToken token = rule.evaluate(scanner);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Dialect-specific predicate node producer
    public SQLTokenPredicateFactory(@NotNull SQLRuleManager ruleManager) {
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
 *
                log.debug(e);
                scanner.reset();
            this.string = string;
            return pos;
        return null;

                        : SQLTokenType.T_OTHER;
        public void unread() {
    private static class StringScanner implements TPCharacterScanner {
                    return tokenType;
        public void reset() {
                    SQLTokenType tokenType = token instanceof TPTokenDefault
 *
    private static final Log log = Log.getLog(SQLTokenPredicateFactory.class);
                if (!token.isUndefined()) {
import org.jkiss.dbeaver.model.text.parser.TPRule;
    }
            try {
        public int read() {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        public char[][] getLegalLineDelimiters() {
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
        public static final char[][] DELIMITERS = { {'\r'}, {'\n'}, {'\r', '\n'} }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
        public int getOffset() {
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;

    private final TPRule[] allRules;
        StringScanner scanner = new StringScanner(string);
            pos--;
    protected SQLTokenType classifyToken(@NotNull String string) {

        super();
                }

            pos = 0;
        @Override

 * You may obtain a copy of the License at
    }
        }

 *
            } catch (Throwable e) {
            return pos >= 0 && pos < string.length() ? string.charAt(pos++) : -1;
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override
        allRules = ruleManager.getAllRules();
        }
class SQLTokenPredicateFactory extends TokenPredicateFactory {
            throw new UnsupportedOperationException();
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
        }
import org.jkiss.dbeaver.model.text.parser.TPCharacterScanner;
}        }
    }
        public StringScanner(@NotNull String string) {
    @Nullable

                // some rules raise exceptions in a certain situations when the string does not correspond the rule

        for (TPRule rule : allRules) {
        public int getColumn() {
        @Override
import org.jkiss.dbeaver.Log;
import org.jkiss.code.Nullable;
/**

 * Unless required by applicable law or agreed to in writing, software
        }
            return DELIMITERS;
        }
import org.jkiss.dbeaver.model.text.parser.TPToken;
import org.jkiss.code.NotNull;
        }
    @Override
