            String lineDelimiter = CommonUtils.toString(options.get(OPTION_LINE_DELIMITER), DEF_LINE_DELIMITER);
            convertSourceLines(result, sourceLines, lineDelimiter, options);

    public String convertText(

import org.jkiss.utils.CommonUtils;
 * limitations under the License.
            if (!keepFormatting) {
import java.util.Map;
/**
                sourceLines = sourceText.split("[\\n\\r]+");
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
                }

            }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (BadLocationException e) {
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
            log.error(e);
import org.eclipse.jface.text.IDocument;
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
import org.jkiss.dbeaver.ui.editors.sql.convert.ISQLTextConverter;
 *
    private static final String DEF_LINE_DELIMITER = "\\n";
}
import org.jkiss.dbeaver.Log;
            @NotNull SQLSyntaxManager syntaxManager,
/*
            String sourceText = document.get(startPos, length);
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLRuleScanner;
    {
    public static final String OPTION_LINE_DELIMITER = "line-delimiter";
            boolean keepFormatting = CommonUtils.toBoolean(options.get(OPTION_KEEP_FORMATTING));
public abstract class SourceCodeSQLConverter implements ISQLTextConverter {
            StringBuilder result = new StringBuilder();
 * DBeaver - Universal Database Manager
    @Override


            return "";
                lineDelimiter = " "; // Space
        try {
            }
                sourceLines = new String[] { sourceText };
            int length,
import org.jkiss.code.NotNull;
            if (sourceText.contains("\n") || sourceText.contains("\r")) {
            @NotNull SQLRuleScanner ruleManager,
import org.jkiss.dbeaver.model.sql.SQLDialect;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            String[] sourceLines;
 *     http://www.apache.org/licenses/LICENSE-2.0
            @NotNull IDocument document,
import org.eclipse.jface.text.BadLocationException;
            return result.toString();
            int startPos,
            @NotNull SQLDialect dialect,
                    sourceLines[i] = sourceLines[i].trim();
            } else {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
            if (CommonUtils.isEmpty(lineDelimiter)) {
                for (int i = 0; i < sourceLines.length; i++) {

    public static final String OPTION_KEEP_FORMATTING = "keep-formatting";
    private static final Log log = Log.getLog(SourceCodeSQLConverter.class);
    protected abstract void convertSourceLines(StringBuilder result, String[] sourceLines, String lineDelimiter, Map<String, Object> options);
 * SourceCodeSQLConverter
 * you may not use this file except in compliance with the License.

    }
 *
            @NotNull Map<String, Object> options)
 */

            }
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
