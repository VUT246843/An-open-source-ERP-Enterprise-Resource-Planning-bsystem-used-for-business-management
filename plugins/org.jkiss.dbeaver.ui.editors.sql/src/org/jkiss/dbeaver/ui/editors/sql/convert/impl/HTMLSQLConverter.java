 *
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.eclipse.jface.text.TextAttribute;
            while (!token.isEOF()) {
public class HTMLSQLConverter implements ISQLTextConverter {
 * DBeaver - Universal Database Manager
import org.eclipse.swt.SWT;
                    result.append("<span style='");
    @Override
                }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        int length,
        ruleScanner.setRange(document, startPos, length);
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    if ((ta.getStyle() & SWT.ITALIC) == SWT.ITALIC) {
                    }
/*
            result.append("<pre>");
                    }
        StringBuilder result = new StringBuilder();
/**
import org.jkiss.dbeaver.Log;
                int tokenOffset = ruleScanner.getTokenOffset();
            IToken token = ruleScanner.nextToken();
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        @NotNull SQLRuleScanner ruleScanner,
                boolean hasSpan = false;
    }
            if (options.get(OPTION_ADD_CODE_BLOCK) != null && (Boolean) options.get(OPTION_ADD_CODE_BLOCK)) {
        @NotNull SQLDialect dialect,
import org.eclipse.jface.text.BadLocationException;
import org.jkiss.code.NotNull;
                    if (ta.getBackground() != null) {
                    hasSpan = true;
        @NotNull SQLSyntaxManager syntaxManager,
        @NotNull IDocument document,
    private static final Log log = Log.getLog(HTMLSQLConverter.class);

    @NotNull
                if (data instanceof TextAttribute ta) {
                token = ruleScanner.nextToken();
import org.eclipse.jface.text.IDocument;
 */
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
                result.append("<code class=\"language-sql\">");
        return result.toString().trim();
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLRuleScanner;
    public String convertText(
        @NotNull Map<String, Object> options)
 * See the License for the specific language governing permissions and
            }
 *
import org.eclipse.jface.text.rules.IToken;
                if (hasSpan) {
                        result.append("background-color:").append(toHex(ta.getBackground())).append(";");
 * HTMLSQLConverter
                        result.append("font-style: italic;");
import java.util.Map;
import org.jkiss.dbeaver.ui.editors.sql.convert.ISQLTextConverter;
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        } catch (BadLocationException e) {
                    }
                        result.append("font-weight:bold;");
 * limitations under the License.

            log.error("Error converting SQL to HTML", e);
            if (options.get(OPTION_ADD_CODE_BLOCK) != null && (Boolean) options.get(OPTION_ADD_CODE_BLOCK)) {
import org.jkiss.utils.CommonUtils;
                    if (ta.getForeground() != null) {
                }
import org.eclipse.swt.graphics.Color;
                    result.append("'>");

 *     http://www.apache.org/licenses/LICENSE-2.0
 */

                result.append("</code>");
    {
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
 *
            }
    private static String toHex(@NotNull Color color) {
            result.append("</pre>");
                    }

    }
 * You may obtain a copy of the License at
        int startPos,
                    if ((ta.getStyle() & SWT.BOLD) == SWT.BOLD) {
                result.append(CommonUtils.escapeHtml(document.get(tokenOffset, tokenLength)));
                final int tokenLength = ruleScanner.getTokenLength();
                Object data = token.getData();
    public static final String OPTION_ADD_CODE_BLOCK = "addCodeBlock";
        try {
        }
                    result.append("</span>");
 * Unless required by applicable law or agreed to in writing, software
                        result.append("color:").append(toHex(ta.getForeground())).append(";");

 * you may not use this file except in compliance with the License.

