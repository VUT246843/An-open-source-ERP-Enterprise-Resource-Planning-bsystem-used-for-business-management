 * Unless required by applicable law or agreed to in writing, software
        this.sourceViewer = sourceViewer;
import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return formatter.format(content, configuration);
import org.eclipse.jface.text.source.ISourceViewer;
    @Override
    public void formatterStops()


import org.jkiss.dbeaver.model.sql.registry.SQLFormatterConfigurationRegistry;
 */
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
        final String[] indentPrefixes = svConfig.getIndentPrefixes(sourceViewer, IDocument.DEFAULT_CONTENT_TYPE);
import org.eclipse.jface.text.formatter.ContextBasedFormattingStrategy;
    private final SQLSyntaxManager sqlSyntax;
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        this.svConfig = svConfig;
import org.eclipse.jface.text.IDocument;
 *
    }
    public String format(String content, boolean isLineStart, String indentation, int[] positions)
    @Override
import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
{
        SQLFormatterConfiguration configuration = new SQLFormatterConfiguration(svConfig.getSQLEditor().getDataSource(), sqlSyntax);
        if (formatter == null) {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        SQLFormatter formatter = SQLFormatterConfigurationRegistry.getInstance().createFormatter(configuration);
        configuration.setIndentString(indentPrefixes[0]);
    }
    }
 *

    /**
/*
     */
 * limitations under the License.
 * you may not use this file except in compliance with the License.
/**

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            return content;
package org.jkiss.dbeaver.ui.editors.sql.syntax;
 * The formatting strategy that transforms SQL keywords to upper case
     * According to profileName to determine which the database syntax keywords highlighted.
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorSourceViewerConfiguration;
    {
    private final SQLEditorSourceViewerConfiguration svConfig;

        this.sqlSyntax = syntax;
    {
} * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
public class SQLFormattingStrategy extends ContextBasedFormattingStrategy

 */
    public SQLFormattingStrategy(ISourceViewer sourceViewer, SQLEditorSourceViewerConfiguration svConfig, SQLSyntaxManager syntax)
    private final ISourceViewer sourceViewer;
