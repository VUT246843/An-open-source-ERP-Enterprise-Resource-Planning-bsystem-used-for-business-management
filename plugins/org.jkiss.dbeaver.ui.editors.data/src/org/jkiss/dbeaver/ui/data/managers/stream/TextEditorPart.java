 *
 * DBeaver - Universal Database Manager
 *
    }

        return DBeaverIcons.getImage(DBIcon.TYPE_TEXT);
    @Override
 */
 * limitations under the License.

 */
        setSourceViewerConfiguration(new PlainTextViewerConfiguration(this));
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBIcon;
    {

/**
import org.eclipse.jface.text.source.SourceViewer;

    public void createPartControl(Composite parent) {
package org.jkiss.dbeaver.ui.data.managers.stream;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public TextEditorPart() {
 * CONTENT text editor
    public String getTitle()
    @Override
        // do nothing

import org.eclipse.jface.text.source.ISourceViewer;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.text.FileRefDocumentProvider;
import org.eclipse.swt.graphics.Image;

 * You may obtain a copy of the License at
        super.createPartControl(parent);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    @Override
    }
    protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
        return new SourceViewer(parent, ruler, null, false, styles);
        configureInsertMode(ITextEditorExtension3.SMART_INSERT, false);
    {
    }
        return "Text";
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.text.source.IVerticalRuler;
 * you may not use this file except in compliance with the License.
    @Override

}
        setDocumentProvider(new FileRefDocumentProvider());
import org.eclipse.jface.text.source.CompositeRuler;
    protected void updateContributedRulerColumns(CompositeRuler ruler) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.ui.IEditorPart;
    }
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
 * See the License for the specific language governing permissions and
        //return new ProjectionViewer(parent, ruler, null, false, styles);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
    public Image getTitleImage()
import org.eclipse.ui.texteditor.ITextEditorExtension3;
/*

public class TextEditorPart extends BaseTextEditor implements IEditorPart {
import org.eclipse.swt.widgets.Composite;
