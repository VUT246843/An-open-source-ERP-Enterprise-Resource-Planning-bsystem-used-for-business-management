import org.eclipse.jface.text.IDocument;
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLRuleScanner;
 * Unless required by applicable law or agreed to in writing, software
}
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.text.BadLocationException;
                        result.append(' ');
                int tokenOffset = ruleManager.getTokenOffset();
        try {
import org.jkiss.code.NotNull;
import java.util.Map;
                final int tokenLength = ruleManager.getTokenLength();
                        if (comment.startsWith(slc)) {
            int startPos,
        Pair<String, String> multiLineComments = dialect.getMultiLineComments();

 * you may not use this file except in compliance with the License.
        StringBuilder result = new StringBuilder();
public class UnformattedSQLConverter implements ISQLTextConverter {
    @NotNull
 *
                            }
                } else {
            @NotNull IDocument document,
 * limitations under the License.
        ruleManager.setRange(document, startPos, length);
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.sql.convert.ISQLTextConverter;
            @NotNull SQLRuleScanner ruleManager,
        boolean lastWhitespace = false;
        String[] singleLineComments = dialect.getSingleLineComments();
    public String convertText(
import org.jkiss.utils.CommonUtils;
                    lastWhitespace = false;
                IToken token = ruleManager.nextToken();
                    break;
 * You may obtain a copy of the License at
import org.jkiss.utils.Pair;
                                comment = multiLineComments.getFirst() + comment.substring(slc.length()) + multiLineComments.getSecond();
    {
                    }
 *
    }
                if (token.isWhitespace()) {
                    result.append(comment);
 */
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
                }
                            if (multiLineComments != null) {

                    result.append(document.get(tokenOffset, tokenLength));
    private static final Log log = Log.getLog(UnformattedSQLConverter.class);
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

        } catch (BadLocationException e) {
 */
                    comment = CommonUtils.compactWhiteSpaces(comment);
import org.jkiss.dbeaver.model.sql.SQLDialect;
            int length,
            log.error("Error unformatting SQL", e);
            @NotNull Map<String, Object> options)
                    if (!lastWhitespace) {
                            break;
                    for (String slc : singleLineComments) {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLCommentToken;

/*
/**
 *
            for (;;) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
        return result.toString().trim();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @NotNull SQLSyntaxManager syntaxManager,
        }

            @NotNull SQLDialect dialect,
                        }
 * UnformattedSQLConverter
                if (token.isEOF()) {
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
 * DBeaver - Universal Database Manager
import org.eclipse.jface.text.rules.IToken;
            }

                } else if (token instanceof SQLCommentToken) {
                    lastWhitespace = true;
                    String comment = document.get(tokenOffset, tokenLength);
