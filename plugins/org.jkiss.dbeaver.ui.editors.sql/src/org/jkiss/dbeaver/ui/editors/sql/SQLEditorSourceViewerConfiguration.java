    }
    @Nullable
    }
        @NotNull String colorId
    }
    /**
    }
        contextInformer.refresh(editor.getSyntaxManager());



        configStore.addPropertyChangeListener(prefListener);
        if (quickAssistAssistant.getQuickAssistProcessor() != null) {
            assistant.setContentAssistProcessor(completionProcessor, IDocument.DEFAULT_CONTENT_TYPE);
import org.jkiss.code.NotNull;
        }
    }
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getTextHover(org.eclipse.jface.text.source.ISourceViewer, java.lang.String)
     */
        return assistant;
import org.jkiss.dbeaver.ui.editors.sql.indent.SQLCommentAutoIndentStrategy;
    /**

    @Override
     *

        assistant.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
     * shown in a hover popup window when requested for the given
     *
        String[] contentTypes = getConfiguredContentTypes(sourceViewer);

    public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
            return null;
        // rule for multiline comments
        IInformationProvider provider = new SQLInformationProvider(getSQLEditor(), contextInformer);
        // Configure how content assist information will appear.
     */
        
        };
            addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_STRING, ThemeConstants.SQL_EDITOR_COLOR_STRING);
     * the given content type.
        if (IDocument.DEFAULT_CONTENT_TYPE.equals(contentType)) {

        // We just need a scanner that does nothing but returns a token with
    public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
    }
            e -> configStore.removePropertyChangeListener(prefListener));
        @Nullable SQLReconcilingStrategy reconcilingStrategy
 *
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
        @NotNull String contentType,
        if (quickAssistAssistant == null) {
        this.contextInformer = new SQLContextInformer(editor, editor.getSyntaxManager());
import org.eclipse.jface.text.rules.Token;
        assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
import org.eclipse.jface.text.information.IInformationPresenter;
            assistant.addContentAssistProcessor(completionProcessor, IDocument.DEFAULT_CONTENT_TYPE);

    ) {
        addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_CONTROL);
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getAnnotationHover(org.eclipse.jface.text.source.ISourceViewer)
            assistant.addContentAssistProcessor(completionProcessor, SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED);
    @Override
 * Unless required by applicable law or agreed to in writing, software
     * Creates, configures, and returns the ContentFormatter to use.
import org.jkiss.dbeaver.ui.UIUtils;
    /**
    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {



    public SQLEditorSourceViewerConfiguration(

        IFormattingStrategy formattingStrategy = new SQLFormattingStrategy(sourceViewer, this, editor.getSyntaxManager());
import org.eclipse.jface.text.contentassist.IContentAssistant;
        DBPPreferenceStore store = editor.getActivePreferenceStore();
        }
        this.reconcilingStrategy = reconcilingStrategy;
        return hyperlinkDetector;

            return null;
    public SQLHyperlinkDetector getHyperlinkDetector() {
     */
        for (String contentType : contentTypes) {
     * object is used for all content types.)
        }
     * document changes.
 * Licensed under the Apache License, Version 2.0 (the "License");
     *
     * Creates, configures, and returns a presentation reconciler to help with

    @Override
        // Register information provider
            setDefaultReturnToken(new Token(attribute));
                addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED, ThemeConstants.SQL_EDITOR_COLOR_DATATYPE);
                setRestoreCompletionProposalSize(EditorsPlugin.getDefault().getDialogSettingsSection("quick_assist_proposal_size"));
    /**
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
     */
        return ArrayUtils.add(String.class, dialect.getSingleLineComments(), "");
    }
    @Override
     */

        Color foreground = new Color(UIUtils.getDisplay(), 0, 0, 0);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        } else {
        }
        final DBPPreferenceStore configStore = store;
     *
                        && configStore.getBoolean(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION)
    public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
    @Override
 * This class defines the editor add-ons; content assist, content formatter,
            log.error("Error creating content assistant", e);
            // Add a "damager-repairer" for changes within quoted literals.
        }
    @Override
        if (reconcilingStrategy != null) {

        this.ruleManager = editor.getRuleScanner();
 * highlighting, auto-indent strategy, double click strategy.
     * Constructs an instance of this class with the given SQLEditor to

        this(editor, preferenceStore, new SQLReconcilingStrategy(editor));
                        SQLEditorUtils.isSQLSyntaxParserApplied(editor.getEditorInput())
        try {

    private void configureContentAssistant(DBPPreferenceStore store, SQLContentAssistant assistant) {
        reconciler.setDocumentPartitioning(docPartitioning);
    
import org.eclipse.jface.text.formatter.IContentFormatter;
        return formatter;

import org.jkiss.dbeaver.ui.editors.sql.util.SQLAnnotationHover;
    @Override
     */
    @Override
     * @return the SQLEditor that this object configures
     * Returns the SQLEditor associated with this object.
        return SQLParserPartitions.SQL_CONTENT_TYPES;
        formatter.setDocumentPartitioning(SQLParserPartitions.SQL_PARTITIONING);
        ((SQLCompletionProcessor) completionProcessor).initAssistant(assistant);
            formatter.setFormattingStrategy(formattingStrategy, ct);
        if (UIStyles.isDarkHighContrastTheme()) {
    }
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
        SQLEditorBase sqlEditor = this.getSQLEditor();
    }
            addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED, ThemeConstants.SQL_EDITOR_COLOR_DATATYPE);
    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        }

import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;
import org.jkiss.dbeaver.ui.editors.sql.syntax.*;
        return contextInformer;
import org.eclipse.jface.text.information.IInformationProvider;
    }
        presenter.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
    }
        reconciler.setDamager(dr, contentType);
        @NotNull String contentType,
            quickAssistAssistant  = new QuickAssistAssistant() { {
    public SQLEditorBase getSQLEditor() {
     *
        Color color = ruleManager.getColor(colorId);
    @Override
        return parent -> new DefaultInformationControl(parent, false);

        @NotNull PresentationReconciler reconciler,

    /**
        // the corresponding text attributes

                    break;
        assistant.enableAutoInsert(store.getBoolean(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO));

    }
                // Add a "damager-repairer" for changes within quoted literals.
     */
    public IInformationControlCreator getInformationControlCreator(ISourceViewer sourceViewer) {

                new SQLAutoIndentStrategy(SQLParserPartitions.SQL_PARTITIONING, sourceViewer, editor.getSyntaxManager())};
        assistant.setContextInformationPopupForeground(foreground);
            return new IAutoEditStrategy[]{new SQLCommentAutoIndentStrategy(SQLParserPartitions.SQL_PARTITIONING)};
        return preferenceStore;
import org.eclipse.jface.text.source.ISourceViewer;
    private final SQLEditorBase editor;
            // Add a "damager-repairer" for changes within string literals.
    }
        //In the future, a preference page will be added to customize foreground and background.
        editor.getTextViewer().getControl().addDisposeListener(
        } else if (SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT.equals(contentType) || SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT.equals(contentType)) {


import org.jkiss.dbeaver.model.sql.SQLDialect;
    public String[] getDefaultPrefixes(ISourceViewer sourceViewer, String contentType) {
        }
        return new MonoReconciler(reconcilingStrategy, true);
            color = UIStyles.getInvertedColor(color);


    void onDataSourceChange() {
        this.preferenceStore = preferenceStore;
    }
            return null;
    }
        IQuickAssistAssistant quickAssistAssistant = super.getQuickAssistAssistant(sourceViewer);
import org.eclipse.jface.preference.IPreferenceStore;

    public IInformationPresenter getInformationPresenter(ISourceViewer sourceViewer) {
     *
        final DBPPreferenceListener prefListener = event -> {
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
 */
        SQLContentFormatter formatter = new SQLContentFormatter(editor);

        PresentationReconciler reconciler = new PresentationReconciler();
    void saveFoldingState() {
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getContentFormatter(ISourceViewer)
        } catch (Throwable e) {
            // Add a "damager-repairer" for changes within string literals.
        SQLEditorBase editor,
            // Let's support older Eclipse versions
        return new IAutoEditStrategy[0];
        return new IHyperlinkDetector[]{
        }
    public SQLEditorSourceViewerConfiguration(SQLEditorBase editor, IPreferenceStore preferenceStore) {
        try {
    public IQuickAssistAssistant getQuickAssistAssistant(@NotNull ISourceViewer sourceViewer) {
        // Create a presentation reconciler to handle handle document changes.
    @Override
     * Returns the annotation hover which will provide the information to be
import org.jkiss.code.Nullable;
/*
                    assistant.setAutoActivationDelay(configStore.getInt(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY));
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getConfiguredDocumentPartitioning(org.eclipse.jface.text.source.ISourceViewer)
            return createContentAssistant(sourceViewer);
        public SingleTokenScanner(TextAttribute attribute) {

     * source viewer.
    @Override
        quickAssistProcessor.appendProcessors(SQLEditorQuickFixProcessorsRegistry.getInstance().getQuickFixProcessorDescriptors());
    private SQLHyperlinkDetector hyperlinkDetector;
        super(preferenceStore);
     * Returns the double-click strategy ready to be used in this viewer when double clicking
    }
                    break;
import org.jkiss.dbeaver.ui.editors.sql.indent.SQLStringAutoIndentStrategy;
        return new MultipleHyperlinkPresenter(editor.getViewerConfiguration().getPreferenceStore()) {
            } else {
import org.jkiss.dbeaver.Log;
    private final SQLRuleScanner ruleManager;
    @NotNull
package org.jkiss.dbeaver.ui.editors.sql;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
    public SQLContextInformer getContextInformer() {
    /**
     * Creates, initializes, and returns the ContentAssistant to use with this editor.
 *
    private SQLContentAssistant createContentAssistant(ISourceViewer sourceViewer) {
     */

    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
        //return new BestMatchHover(this.getSQLEditor());
 * distributed under the License is distributed on an "AS IS" BASIS,
        };
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getDoubleClickStrategy(ISourceViewer, String)
     * configure.

    private final SQLReconcilingStrategy reconcilingStrategy;
    /**

        assistant.setAutoActivationDelay(store.getInt(SQLPreferenceConstants.AUTO_ACTIVATION_DELAY));
    public ITextDoubleClickStrategy getDoubleClickStrategy(ISourceViewer sourceViewer, String contentType) {
                    assistant.enableAutoActivation(
                case SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION:
        addContentTypeDamageRepairer(reconciler, contentType, new SingleTokenScanner(new TextAttribute(color)));
                    break;
        if (completionProcessor == null) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.resultset.ThemeConstants;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.editors.sql.addins.SQLEditorQuickAssistProcessor;


        // Add a "damager-repairer" for changes in default text (SQL code).
        assistant.enableAutoActivation(store.getBoolean(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION));
        }
    @Override
        return reconciler;
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {

        ((IHyperlinkDetectorExtension) hyperlinkDetector).dispose();
}
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.jface.text.formatter.IFormattingStrategy;
            addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_STRING);
     * @param editor the SQLEditor to configure
            switch (event.getProperty()) {
        return new TextViewerUndoManager(200);
 *
 * DBeaver - Universal Database Manager
        }
        assistant.setContextInformationPopupBackground(background);

        }
import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
     * used when the querying content types from the source viewer's input document.
        addContentTypeDamageRepairer(reconciler, contentType, ruleManager);
        return SQLParserPartitions.SQL_PARTITIONING;
        // Set content assist processors for various content types.
     * in a text hover popup window when requested for the given source viewer and

     *

    }
    public IPreferenceStore getPreferenceStore() {
import org.jkiss.utils.ArrayUtils;
        if (reconcilingStrategy != null) {

     */
import org.eclipse.swt.graphics.Color;

    public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
 * See the License for the specific language governing permissions and
    }
        return presenter;
    }
            assistant.addContentAssistProcessor(completionProcessor, SQLParserPartitions.CONTENT_TYPE_SQL_STRING);
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(ISourceViewer)
            new URLHyperlinkDetector()};
import org.eclipse.jface.text.presentation.PresentationReconciler;

    }
    @Nullable
            this.completionProcessor = new SQLCompletionProcessor(editor);
        configureContentAssistant(store, assistant);
    private final SQLContextInformer contextInformer;
        return editor;
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
        IPreferenceStore preferenceStore,
    private IContentAssistProcessor completionProcessor;
        return quickAssistAssistant;
    public IReconciler getReconciler(ISourceViewer sourceViewer) {
        addContentTypeDamageRepairer(reconciler, IDocument.DEFAULT_CONTENT_TYPE);
            if (sqlEditor.isAdvancedHighlightingEnabled()) {
import org.jkiss.dbeaver.ui.editors.sql.indent.SQLAutoIndentStrategy;
            }
        final SQLContentAssistant assistant = new SQLContentAssistant(editor);
        if (sourceViewer == null) {
            presenter.setInformationProvider(provider, contentType);
import org.eclipse.jface.text.presentation.IPresentationReconciler;
        addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT, ThemeConstants.SQL_EDITOR_COLOR_COMMENT);

        //Set auto insert mode.
import org.eclipse.jface.text.reconciler.IReconciler;
        @NotNull ITokenScanner scanner
    private void addContentTypeDamageRepairer(
import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
    }
 */


            reconcilingStrategy.saveState();
            quickAssistProcessor.appendProcessor(quickAssistAssistant.getQuickAssistProcessor());
            // addContentAssistProcessor API was added in 4.12
        reconciler.setRepairer(dr, contentType);
        } catch (Throwable e) {
        Color background = new Color(UIUtils.getDisplay(), 255, 255, 255);
    }
     *
        // Add a "damager-repairer" for changes within control commands.
    private static final Log log = Log.getLog(SQLEditorSourceViewerConfiguration.class);

    private final IPreferenceStore preferenceStore;
        return new SQLAnnotationHover(getSQLEditor());

    }
     */
        quickAssistAssistant.setQuickAssistProcessor(quickAssistProcessor);
        @NotNull PresentationReconciler reconciler,
        } else if (SQLParserPartitions.CONTENT_TYPE_SQL_STRING.equals(contentType)) {
            } };

import org.jkiss.dbeaver.ui.editors.sql.addins.SQLEditorQuickFixProcessorsRegistry;
        SQLDialect dialect = editor.getSQLDialect();
 * limitations under the License.
    @Override
     * onto text of the given content type.  (Note: the same double-click strategy
        this.editor = editor;
    public IHyperlinkDetector[] getHyperlinkDetectors(ISourceViewer sourceViewer) {
        assistant.setShowEmptyList(true);
    }
import org.eclipse.jface.text.*;
                addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED);
    @Override
            return new IAutoEditStrategy[]{
import org.jkiss.dbeaver.ui.UIStyles;
     * Returns the text hover which will provide the information to be shown
import org.eclipse.jface.text.reconciler.MonoReconciler;
        InformationPresenter presenter = new InformationPresenter(getInformationControlCreator(sourceViewer));
    public IHyperlinkPresenter getHyperlinkPresenter(ISourceViewer sourceViewer) {
        String docPartitioning = getConfiguredDocumentPartitioning(sourceViewer);
    }
        formatter.enablePartitionAwareFormatting(true);
    @Override
    ) {
        for (String ct : SQLParserPartitions.SQL_CONTENT_TYPES) {
        addContentTypeDamageRepairer(reconciler, SQLParserPartitions.CONTENT_TYPE_SQL_MULTILINE_COMMENT, ThemeConstants.SQL_EDITOR_COLOR_COMMENT);
        assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
            return new IAutoEditStrategy[]{new SQLStringAutoIndentStrategy(SQLParserPartitions.CONTENT_TYPE_SQL_STRING)};
            hyperlinkDetector,
     * The editor with which this configuration is associated.
import org.eclipse.jface.text.information.InformationPresenter;
    private void addContentTypeDamageRepairer(
                    );


     */
    }
    }
import org.eclipse.jface.text.source.IAnnotationHover;

public class SQLEditorSourceViewerConfiguration extends TextSourceViewerConfiguration {
        // Add a "damager-repairer" for changes within one-line SQL comments.
    private void addContentTypeDamageRepairer(@NotNull PresentationReconciler reconciler, @NotNull String contentType) {
        if (reconcilingStrategy == null) {
        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
    }
    static class SingleTokenScanner extends BufferedRuleBasedScanner {
     * This class implements a single token scanner.
    /**
            }

        return new SQLDoubleClickStrategy();
        this.hyperlinkDetector = new SQLHyperlinkDetector(this.contextInformer);
import org.eclipse.jface.text.quickassist.QuickAssistAssistant;
        presenter.setSizeConstraints(60, 10, true, true);
        assistant.setInformationControlCreator(getInformationControlCreator(sourceViewer));
    }
        return new SQLAnnotationHover(this.getSQLEditor());

    public IUndoManager getUndoManager(ISourceViewer sourceViewer) {
        }
import org.eclipse.jface.text.rules.ITokenScanner;
        if (SQLEditorUtils.isSQLSyntaxParserApplied(sqlEditor.getEditorInput())) {
            reconcilingStrategy.onDataSourceChange();
                case SQLPreferenceConstants.AUTO_ACTIVATION_DELAY:
                case SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO:

        }
    /**
    }
import org.eclipse.jface.text.hyperlink.*;

                    assistant.enableAutoInsert(configStore.getBoolean(SQLPreferenceConstants.INSERT_SINGLE_PROPOSALS_AUTO));
     * Returns the configured partitioning for the given source viewer. The partitioning is

        }
    @Nullable
        assistant.setSorter(new SQLCompletionSorterUI(editor));
    }
                // Add a "damager-repairer" for changes within quoted literals.
    /**
        SQLEditorQuickAssistProcessor quickAssistProcessor = new SQLEditorQuickAssistProcessor(this.editor);
        }
                setInformationControlCreator(p ->new DefaultInformationControl(p, EditorsPlugin.getAdditionalInfoAffordanceString()));

