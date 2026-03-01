        this.stringToken = new TPTokenDefault(SQLTokenType.T_STRING);
    private String tryReadDollarQuote(TPCharacterScanner scanner) {
     * @param fullyConsumeNamed   whether this rule should stop after consuming named quote

                if (!this.partitionRule) {
        return stringToken;
                    if (c == '$') {
                        qname.append((char) c);

     *                            or continue until matching the closing one, treating everything between as a string
     */
                        scanner.unread();
        return evaluate(scanner, false);
                                // unread ending quote in case it is the real ending
                        }
    }
                while (c != TPCharacterScanner.EOF) {
    private static void unread(TPCharacterScanner scanner, int totalRead) {
        if (c == '$') {
    @Override
                totalRead++;
package org.jkiss.dbeaver.model.sql.parser.rules;
                                scanner.unread();
 * Unless required by applicable law or agreed to in writing, software
                    totalRead++;
    private final TPToken delimiterToken;
                            }
    private final TPToken stringToken;
    private final boolean allowNamedQuotes;
                StringBuilder qname = new StringBuilder();
 *     http://www.apache.org/licenses/LICENSE-2.0
            scanner.unread();
    }
                            captured++;
     * @param partitionRule       whether this rule is a partition rule or not
    public TPToken getSuccessToken() {
        String start = this.tryReadDollarQuote(scanner);
    }
    public TPToken evaluate(TPCharacterScanner scanner) {
            }
                        } else {
                } while (c != TPCharacterScanner.EOF && (Character.isLetterOrDigit(c) || c == '_'));
 * DBeaver - Universal Database Manager


                        String end = this.tryReadDollarQuote(scanner);
                        if (end != null) {
    public SQLDollarQuoteRule(boolean partitionRule, boolean allowNamedQuotes, boolean fullyConsumeNamed, boolean fullyConsumeUnnamed) {
    /**
                                return this.stringToken;
                    }
                    c = scanner.read();
                c = scanner.read();

                                captured += end.length() - 1;
    }
/*
            }
                if (c == '$') {
                    if (c == '$') {
                            } else {
 *
                    return  "$$";

                }
        this.partitionRule = partitionRule;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param fullyConsumeUnnamed same as {@code fullyConsumeNamed}, but for unnamed quotes
        int c = scanner.read();
                            scanner.read();

        this.fullyConsumeNamed = fullyConsumeNamed || partitionRule;
                            if (end.equals(start)) {
        return null;

                    return this.delimiterToken;
                        return qname.toString();
        }
                    c = scanner.read();
        }
        this.fullyConsumeUnnamed = fullyConsumeUnnamed || partitionRule;
            } else {
public class SQLDollarQuoteRule implements TPPredicateRule {
                    qname.append((char) c);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final boolean partitionRule;
            if (this.allowNamedQuotes) {
     * Dollar quoting rule constructor
 * limitations under the License.
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLBlockToggleToken;
 */
            if ((start.length() == 2 && this.fullyConsumeUnnamed) || (start.length() > 2 && this.fullyConsumeNamed)) {
 * See the License for the specific language governing permissions and

                int c = scanner.read();
        unread(scanner, totalRead);
    private final boolean fullyConsumeNamed;
        int totalRead = 0;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param allowNamedQuotes    whether this rule supports named quotes ({@code $named$}) or not
                int captured = 1;
 *

        return TPTokenAbstract.UNDEFINED;
                    }
import org.jkiss.dbeaver.model.text.parser.*;
                unread(scanner, captured + start.length());
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
                do {
    }
        }
        if (start != null) {
    @Override
                }
        this.allowNamedQuotes = allowNamedQuotes;
        while (totalRead-- > 0) {
    private final boolean fullyConsumeUnnamed;
        totalRead++;
 * You may obtain a copy of the License at
                }
                    captured++;

                        captured--;
        this.delimiterToken = new SQLBlockToggleToken();
 * See <a href="https://www.postgresql.org/docs/current/sql-syntax-lexical.html#SQL-SYNTAX-DOLLAR-QUOTING">documentation</a>
            } else {

 *
    }
 * you may not use this file except in compliance with the License.


 */
}
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
