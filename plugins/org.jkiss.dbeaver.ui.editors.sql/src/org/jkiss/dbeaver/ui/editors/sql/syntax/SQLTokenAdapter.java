                    break;
                case T_VARIABLE:
 * You may obtain a copy of the License at
        return token;

                    style = SWT.NORMAL;
    }
        Color color;
 * you may not use this file except in compliance with the License.
                    style = scanner.getKeywordStyle();
                    style = SWT.ITALIC;
                case T_BLOCK_END:
    public TPToken getToken() {
                    style = scanner.getKeywordStyle();
                case T_NUMBER:
                case T_DELIMITER:
                    color = themeSettings.editorStringColor;
}
                    color = themeSettings.editorTextColor;
 * limitations under the License.
            style = SWT.NORMAL;
                    style = SWT.NORMAL;
                case T_TYPE:
                    style = SWT.NORMAL;
                    style = SWT.NORMAL;

                    color = themeSettings.editorSemanticErrorColor;
/*
                    break;
                case T_COLUMN_DERIVED:
                    break;
        }
                    color = themeSettings.editorParameterColor;
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
 * See the License for the specific language governing permissions and
        if (token instanceof TPTokenDefault && token.getData() instanceof SQLTokenType tokenType) {

                case T_BLOCK_BEGIN:
                    break;
                case T_TABLE:
                case T_QUOTED:
                    color = themeSettings.editorDelimiterColor;
 *
        return "Adapter of [" + token.toString() + "]";
import org.eclipse.swt.SWT;
                    color = themeSettings.editorCommentColor;
        int style;
package org.jkiss.dbeaver.ui.editors.sql.syntax;
                    style = scanner.getKeywordStyle();
                    style = SWT.ITALIC;
        super(makeTextAttribute(token, scanner));
                case T_BLOCK_HEADER:
                    color = themeSettings.editorColumnDerivedColor;
    private static TextAttribute makeTextAttribute(TPToken token, SQLRuleScanner scanner) {
    }
                case T_BLOCK_TOGGLE:
            switch (tokenType) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    color = themeSettings.editorSqlVariableColor;
                    color = themeSettings.editorSchemaColor;
/**
            color = SQLEditorThemeSettings.instance.editorTextColor;
        return new TextAttribute(color, null, style);
    public SQLTokenAdapter(TPToken token, SQLRuleScanner scanner) {
 *
                    color = themeSettings.editorTableAliasColor;
public class SQLTokenAdapter extends Token {
import org.jkiss.dbeaver.ui.controls.SQLEditorThemeSettings;

                case T_STRING:
                case T_PARAMETER:
    private final TPToken token;
        } else {
import org.eclipse.jface.text.rules.Token;
                    break;
            if (color == SQLEditorThemeSettings.instance.editorTextColor) {
                    style = SWT.NORMAL;
            }
                case T_TABLE_ALIAS:
                case T_SQL_VARIABLE:

                color = UIStyles.getInvertedColor(color);
                    color = themeSettings.editorCompositeFieldColor;
            }
    @Override
                    color = themeSettings.editorTableColor;
 *     http://www.apache.org/licenses/LICENSE-2.0
                case T_KEYWORD:
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.graphics.Color;
                    color = themeSettings.editorKeywordColor;
                    style = SWT.NORMAL;
                    style = SWT.NORMAL;
                case T_SEMANTIC_ERROR:
                    break;
                case T_SCHEMA:
                    break;
    public String toString() {
*/
                    style = scanner.getKeywordStyle();
 *

                    style = SWT.NORMAL;
                color = UIStyles.COLOR_WHITE;
                case T_COMPOSITE_FIELD:
                    break;
    }
                    break;
 * DBeaver - Universal Database Manager
                    break;
                case T_FUNCTION:


                    break;

                    color = themeSettings.editorNumberColor;
                default:
                    style = scanner.getKeywordStyle();
                    break;
        }
                    style = SWT.NORMAL;
                case T_CONTROL:
                case T_COLUMN:
                    break;
            } else {
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
                    break;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    style = SWT.NORMAL;
                    color = themeSettings.editorCommandColor;
                    style = SWT.NORMAL;
    }
                    color = themeSettings.editorColumnColor;
import org.eclipse.jface.text.TextAttribute;
 * SQLTokenAdapter
 */
                    break;
                    break;

            SQLEditorThemeSettings themeSettings = SQLEditorThemeSettings.instance;
                    color = themeSettings.editorDelimiterColor;
                    style = scanner.getKeywordStyle();
        if (UIStyles.isDarkHighContrastTheme()) {
                    color = themeSettings.editorFunctionColor;
                    break;
                    break;
        this.token = token;
 * Unless required by applicable law or agreed to in writing, software
                case T_COMMENT:
import org.jkiss.dbeaver.model.text.parser.TPToken;
                    color = themeSettings.editorDatatypeColor;
                case T_SET_DELIMITER:
                    break;
import org.jkiss.dbeaver.ui.UIStyles;
