
 * See the License for the specific language governing permissions and
        } catch (BadLocationException e) {
        } else {

import org.eclipse.jface.text.IDocument;
        try {
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return;
            region = (IRegion) context.getProperty(FormattingContextProperties.CONTEXT_REGION);
        this.editor = editor;
 * You may obtain a copy of the License at
}
import org.eclipse.jface.text.IRegion;
        if (strategy == null) {
/*

 *
    }
    public void format(IDocument document, IFormattingContext context) {
            log.error("Error formatting the document", e);
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (region == null) {
            }
                region = new Region(0, document.getLength());
class SQLContentFormatter extends ContentFormatter implements IContentFormatterExtension {
        IRegion region;
 * Unless required by applicable law or agreed to in writing, software
 *
 * limitations under the License.
    }
        }
        }
 */
package org.jkiss.dbeaver.ui.editors.sql;
            String formatted = strategy.format(source, false, null, null);

        if (editor.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.SQL_FORMAT_ACTIVE_QUERY)) {
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
            document.replace(region.getOffset(), region.getLength(), formatted);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            String source = document.get(region.getOffset(), region.getLength());
            SQLScriptElement activeQuery = editor.extractActiveQuery();
    private static final Log log = Log.getLog(SQLContentFormatter.class);
            if (activeQuery == null) {
            }

        IFormattingStrategy strategy = getFormattingStrategy(IDocument.DEFAULT_CONTENT_TYPE);
import org.jkiss.dbeaver.Log;
                return;

 * DBeaver - Universal Database Manager
            region = new Region(activeQuery.getOffset(), activeQuery.getLength());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.text.BadLocationException;
    SQLContentFormatter(SQLEditorBase editor) {
import org.eclipse.jface.text.formatter.*;
    private final SQLEditorBase editor;

    @Override
import org.eclipse.jface.text.Region;
