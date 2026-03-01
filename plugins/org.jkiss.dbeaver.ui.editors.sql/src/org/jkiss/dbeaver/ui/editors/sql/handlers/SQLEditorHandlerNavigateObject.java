    @Override
 * limitations under the License.
/*

    }
            }
 * Unless required by applicable law or agreed to in writing, software
            SQLEditorBase sqlEditor = DBUtils.getAdapter(SQLEditorBase.class, activeEditor);
                    if (textViewer != null) {
import org.jkiss.utils.ArrayUtils;
import org.eclipse.jface.text.IRegion;
            SQLEditorBase editor = (SQLEditorBase)partSite.getPart();
 * you may not use this file except in compliance with the License.
*/
package org.jkiss.dbeaver.ui.editors.sql.handlers;
            ITextSelection selection = (ITextSelection)editor.getSelectionProvider().getSelection();
                    }

        if (!ArrayUtils.isEmpty(hyperLinks)) {

import org.jkiss.dbeaver.model.DBUtils;
        SQLHyperlinkDetector hyperlinkDetector = editor.getViewerConfiguration().getHyperlinkDetector();
import org.eclipse.swt.graphics.Image;
 * See the License for the specific language governing permissions and
import org.eclipse.core.commands.ExecutionEvent;
        return null;
 */
        IHyperlink[] hyperLinks = hyperlinkDetector.detectHyperlinks(editor.getTextViewer(), curRegion, false);
import org.eclipse.jface.text.hyperlink.IHyperlink;
        ITextSelection selection = (ITextSelection) editor.getTextViewer().getSelection();
                        textViewer.setSelectedRange(selRegion2.getOffset(), selRegion2.getLength());
        return null;
    public void updateElement(UIElement element, Map parameters)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    hyperlink.open();
                    TextViewer textViewer = sqlEditor.getTextViewer();
            SQLIdentifierDetector.WordRegion wordRegion = wordDetector.detectIdentifier(document, new Region(selection.getOffset(), selection.getLength()));
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
                statusLine.setMessage(true, "Can't find metadata object for name '" + lastKeyword + "'", (Image)null);
    {
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.ITextSelection;
                if (hyperlink != null) {
}
/*

    public Object execute(ExecutionEvent event) throws ExecutionException

import org.eclipse.ui.IEditorPart;

        IRegion curRegion = new Region(selection.getOffset(), 0);
import org.eclipse.ui.texteditor.IEditorStatusLine;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.jface.text.TextViewer;
 *
import org.eclipse.ui.handlers.HandlerUtil;
            SQLIdentifierDetector wordDetector = new SQLIdentifierDetector(

 *
        IWorkbenchPartSite partSite = UIUtils.getWorkbenchPartSite(element.getServiceLocator());
            if (statusLine != null) {
    public SQLEditorHandlerNavigateObject()
        String lastKeyword = hyperlinkDetector.getLastKeyword();
            if (sqlEditor != null) {
        }
            IEditorStatusLine statusLine = editor.getAdapter(IEditorStatusLine.class);
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            editor.getEditorControl().getDisplay().beep();
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
    }
 *
import org.jkiss.utils.CommonUtils;
public class SQLEditorHandlerNavigateObject extends AbstractHandler {
    }
 * DBeaver - Universal Database Manager
            IDocument document = editor.getDocument();
                    IRegion selRegion2 = hyperlink.getHyperlinkRegion();
    {
        }
        if (partSite != null && partSite.getPart() instanceof SQLEditorBase) {
                editor.getSyntaxManager().getIdentifierQuoteStrings());
            if (!wordRegion.isEmpty()) {
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLHyperlinkDetector;
import org.eclipse.jface.text.Region;
                element.setText("Open '" + wordRegion.word + "'");
                editor.getSyntaxManager().getStructSeparator(),

            }
                IHyperlink hyperlink = getCurrentHyperlink(sqlEditor);
    @Override
        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!CommonUtils.isEmpty(lastKeyword)) {
            return hyperLinks[0];
    {
    private IHyperlink getCurrentHyperlink(SQLEditorBase editor)
    {
        if (activeEditor != null) {
