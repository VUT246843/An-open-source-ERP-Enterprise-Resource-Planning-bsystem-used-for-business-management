 * DBeaver - Universal Database Manager
    }
                        return delimiterToken;
                            }
            scanner.unread();

                        if (!stringEndFound) {
                                }
                            //stringValue.append((char)c);
 *
                c = scanner.read();
        totalRead++;
                        }
                    if (charsRead <= 1 ) {
                            if (c == ']') {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                                return delimiterToken;
            } while (Character.isLetterOrDigit(c) || c == '_');
                            }
public class ExasolSquareBracketsRule implements TPPredicateRule {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
 * Copyright (C) 2016-2021 Karl Griesser (fullref@gmail.com)
                if (c == '[') {
        }
                                    stringEndFound = true;
    }
                            if (!partitionRule) {
import org.jkiss.dbeaver.model.text.parser.*;
                        boolean stringEndFound = false;
        return TPTokenAbstract.UNDEFINED;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.stringToken = new TPTokenDefault(SQLTokenType.T_STRING);
    public ExasolSquareBracketsRule(DBPDataSourceContainer dataSource, boolean partitionRule) {
	
                                break;
                                    totalRead--;
                            }
                    if (!partitionRule) {
                                int c2 = scanner.read();
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLBlockToggleToken;
                                if (c2 == ']') {
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
                    }
 * limitations under the License.
        }
                }
    @Override
        int totalRead = 0;
        return stringToken;
        return evaluate(scanner, false);
        unread(scanner, totalRead);
	}
                            c = scanner.read();
    public TPToken evaluate(TPCharacterScanner scanner, boolean resume) {
                        //StringBuilder stringValue = new StringBuilder();
}
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
                            totalRead++;
    public TPToken getSuccessToken() {
    @Override
                totalRead++;


                                    scanner.unread();
        while (totalRead-- > 0) {
                            } else {
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static void unread(TPCharacterScanner scanner, int totalRead) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    
                                    break;
                                } else {


                        for (;;) {
                        return stringToken;
    private final boolean partitionRule;
                                break;
        if (c == '[') {
                        }
 * Unless required by applicable law or agreed to in writing, software
            do {

                        break;
 */
 * you may not use this file except in compliance with the License.

        this.delimiterToken = new SQLBlockToggleToken();
                                totalRead++;
    }
    private final TPToken stringToken, delimiterToken;
        int c = scanner.read();
        this.partitionRule = partitionRule;
                            if (c == TPCharacterScanner.EOF) {
                    } else {
 *
    public TPToken evaluate(TPCharacterScanner scanner) {
            int charsRead = 0;

                charsRead++;
                                unread(scanner, totalRead - 2);
package org.jkiss.dbeaver.ext.exasol.sql;

