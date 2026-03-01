
import org.jkiss.dbeaver.ui.editors.text.NonRuleBasedDamagerRepairer;
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Override
    private JSONTextEditor textEditor;
import org.eclipse.jface.text.formatter.ContentFormatter;
}
    }
    }
 * limitations under the License.

/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.resource.ColorRegistry;
public class JSONSourceViewerConfiguration extends SourceViewerConfiguration {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        return reconciler;
    public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {

        return JSONPartitionScanner.JSON_PARTITIONING;


        IFormattingStrategy formattingStrategy = new JSONFormattingStrategy(sourceViewer, this);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;
 */
 *
    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {

    }
    JSONSourceViewerConfiguration(JSONTextEditor textEditor) {


    }

    @Override
        reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
            IDocument.DEFAULT_CONTENT_TYPE,
import org.eclipse.jface.text.TextAttribute;
        formatter.enablePartitionAwareFormatting(false);
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(jsonScanner);
        return new String[]{
import org.eclipse.jface.text.formatter.IContentFormatter;
/**
        super();
        formatter.setFormattingStrategy(formattingStrategy, IDocument.DEFAULT_CONTENT_TYPE);
        return formatter;
    @Override
package org.jkiss.dbeaver.ui.editors.json;
 * you may not use this file except in compliance with the License.
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
import org.eclipse.jface.text.formatter.IFormattingStrategy;
import org.eclipse.jface.text.presentation.PresentationReconciler;

 *

            JSONPartitionScanner.JSON_STRING};
    public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
 *
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.text.IDocument;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            new NonRuleBasedDamagerRepairer(
 * Unless required by applicable law or agreed to in writing, software

                new TextAttribute(SQLEditorThemeSettings.instance.editorStringColor));
        reconciler.setRepairer(ndr, JSONPartitionScanner.JSON_STRING);
        ContentFormatter formatter = new ContentFormatter();
        formatter.setDocumentPartitioning(IDocument.DEFAULT_CONTENT_TYPE);

import org.eclipse.jface.text.source.ISourceViewer;
        ColorRegistry colorRegistry = UIUtils.getColorRegistry();
    }
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
        PresentationReconciler reconciler = new PresentationReconciler();

 * JSONSourceViewerConfiguration
        reconciler.setDamager(ndr, JSONPartitionScanner.JSON_STRING);

import org.jkiss.dbeaver.ui.controls.SQLEditorThemeSettings;
    private JSONScanner jsonScanner;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
        NonRuleBasedDamagerRepairer ndr =
        this.jsonScanner = new JSONScanner();
 */
        this.textEditor = textEditor;
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
    @Override
