

    }
import org.eclipse.jface.text.contentassist.ContentAssistant;

/*
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
    @Override
                new TextAttribute(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer)
    }
        formatter.setFormattingStrategy(formattingStrategy, IDocument.DEFAULT_CONTENT_TYPE);
                    colorRegistry.get(COLOR_XML_COMMENT)));
package org.jkiss.dbeaver.ui.editors.xml;
        return XMLPartitionScanner.XML_PARTITIONING;
 * DBeaver - Universal Database Manager
    public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
            XMLPartitionScanner.XML_COMMENT,
import org.eclipse.jface.text.presentation.PresentationReconciler;
        reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
        return reconciler;
        reconciler.setDamager(ndr, XMLPartitionScanner.XML_COMMENT);
        ContentAssistant assistant = new ContentAssistant();
        XMLScanner scanner = new XMLScanner(colorRegistry);
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.TextAttribute;
        XMLReconcilingStrategy strategy = new XMLReconcilingStrategy();
        NonRuleBasedDamagerRepairer ndr =
                new TextAttribute(
        reconciler.setRepairer(dr, XMLPartitionScanner.XML_TAG);

        MonoReconciler reconciler = new MonoReconciler(strategy, false);
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;


    public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
            XMLPartitionScanner.XML_TAG};
    private XMLScanner getXMLScanner() {
        assistant.enableAutoActivation(true);
    private XMLTagScanner getXMLTagScanner() {
import org.eclipse.jface.text.IDocument;
}

        return reconciler;
        ColorRegistry colorRegistry = UIUtils.getColorRegistry();
                    colorRegistry.get(COLOR_XML_TAG))));
    }
        ContentFormatter formatter = new ContentFormatter();

        return assistant;
                    colorRegistry.get(COLOR_XML_STRING))));

 */
            IDocument.DEFAULT_CONTENT_TYPE,
            new DefaultDamagerRepairer(getXMLTagScanner());
        return formatter;
        IFormattingStrategy formattingStrategy = new XMLFormattingStrategy();
 * limitations under the License.
        scanner.setDefaultReturnToken(
        reconciler.setDamager(dr, XMLPartitionScanner.XML_TAG);
        strategy.setEditor(editor);
 * you may not use this file except in compliance with the License.
        this.editor = editor;


import org.eclipse.jface.text.formatter.IFormattingStrategy;
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
        return new String[]{
    public XMLSourceViewerConfiguration(XMLEditor editor) {
import org.eclipse.jface.text.rules.Token;
    @Override

    }
    public ITextDoubleClickStrategy getDoubleClickStrategy(ISourceViewer sourceViewer, String contentType) {
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {


import org.eclipse.jface.resource.ColorRegistry;
        return tagScanner;
    @Override
                new TextAttribute(
public class XMLSourceViewerConfiguration extends SourceViewerConfiguration {
        XMLTagScanner tagScanner = new XMLTagScanner(colorRegistry);
    static final String COLOR_XML_STRING = "org.jkiss.dbeaver.xml.editor.color.text";
    private final XMLEditor editor;
import org.eclipse.jface.text.reconciler.MonoReconciler;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
 * See the License for the specific language governing permissions and
        reconciler.setRepairer(ndr, XMLPartitionScanner.XML_COMMENT);
import org.eclipse.jface.text.formatter.IContentFormatter;
            new Token(
 *


        assistant.setContentAssistProcessor(new XMLContentAssistantProcessor(),IDocument.DEFAULT_CONTENT_TYPE);
    }
    }
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.jkiss.dbeaver.ui.editors.text.NonRuleBasedDamagerRepairer;
        formatter.setDocumentPartitioning(IDocument.DEFAULT_CONTENT_TYPE);
        return new XMLDoubleClickStrategy();

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    @Override
        dr = new DefaultDamagerRepairer(getXMLScanner());
            new NonRuleBasedDamagerRepairer(

import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
    private static final String COLOR_XML_TAG = "org.jkiss.dbeaver.xml.editor.color.tag";
        ColorRegistry colorRegistry = UIUtils.getColorRegistry();
        ColorRegistry colorRegistry = UIUtils.getColorRegistry();
import org.eclipse.jface.text.formatter.ContentFormatter;
 * Unless required by applicable law or agreed to in writing, software
    }

    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
    private static final String COLOR_XML_COMMENT = "org.jkiss.dbeaver.xml.editor.color.comment";
        DefaultDamagerRepairer dr =
    }
    }

        tagScanner.setDefaultReturnToken(
        return scanner;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        PresentationReconciler reconciler = new PresentationReconciler();
            new Token(
 * distributed under the License is distributed on an "AS IS" BASIS,

    public IReconciler getReconciler(ISourceViewer sourceViewer) {
    {
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
import org.eclipse.jface.text.reconciler.IReconciler;

        formatter.enablePartitionAwareFormatting(false);
import org.jkiss.dbeaver.ui.UIUtils;
 *
