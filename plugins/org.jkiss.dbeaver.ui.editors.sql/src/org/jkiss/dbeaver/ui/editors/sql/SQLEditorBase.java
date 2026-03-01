        }
import org.eclipse.swt.events.MouseAdapter;
            this.editorInput = editorInput;
    @Override
            SQLEditorContributions.SQL_EDITOR_CONTEXT,
                        final IDocument document = sourceViewer.getDocument();

        PlatformUI.getWorkbench().getThemeManager().addPropertyChangeListener(themeListener);
        // Should we display a confirmation dialog with "Remember my choice" option?
        addAction(menu, GROUP_SQL_EXTRAS, SQLEditorContributor.ACTION_CONTENT_ASSIST_TIP);
    protected void adjustHighlightRange(int offset, int length)
            }
            Color bgColor = ruleScanner.getColor(SQLConstants.CONFIG_COLOR_DISABLED);
        }
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
            @Override
                this.reloadSyntaxRules();

            // to allow compile on older Eclipse versions
            return null;
import org.jkiss.dbeaver.ui.*;

                    }
            return;
            editorStore.setDefault(SQLPreferenceConstants.MATCHING_BRACKETS, true);
                                if (addProblem(GeneralUtils.getFirstMessage(error), new Position(errorOffset, errorLength))) {
            });
        // Symbol inserter
    }

import org.eclipse.jface.preference.IPreferenceStore;
                    txt.append(textSelection.getLength()).append(" | ");
//                showStatementInEditor(result.getStatement(), true);
    }
            // Move cursor to the end of the file past script template
                            widgetOffset = widget.getOffsetAtLine(lineIndex + 1) - widget.getLineDelimiter().length();
        if (this.activationListener != null) {
            SQLPreferenceConstants.MATCHING_BRACKETS_COLOR,
        if (this instanceof DBPDataSourceContainerProvider) {
        if (!isReadOnly() && textViewer != null && textViewer.isEditable()) {
            }

            // Mouse listener that moves cursor upon clicking with the right mouse button
                }
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
import org.eclipse.jface.text.rules.FastPartitioner;
    static protected final Log log = Log.getLog(SQLEditorBase.class);
        return characterPairMatcher;
                sqlSymbolInserter.setCloseDoubleQuotesEnabled(CommonUtils.toBoolean(event.getNewValue()));
     * Updates the status fields for the given category.
            }
                    } else {
            // A listener that reveals obscured part of the document the cursor was located in before the control was resized
        ruleScanner = new SQLRuleScanner();

import org.jkiss.dbeaver.DBException;
        try {
            if (textViewer != null) {
        // SQL editor preferences. Do this here because it initializes display
import org.jkiss.dbeaver.Log;
    private SQLEditorOutlinePage outlinePage;
        if (sourceViewer != null) {
        ResourceBundle bundle = ResourceBundle.getBundle(SQLEditorMessages.BUNDLE_NAME);
    @NotNull
        }
*/
import org.eclipse.jface.text.source.*;
            return new AnnotationRulerColumn(0, getAnnotationAccess());
            if (this.backgroundParsingJob == null) {
    }
                return;
        @Override
        }
            case ModelPreferences.SQL_FORMAT_LF_BEFORE_COMMA:
                            // We need to delete markers though. Maybe only when there is no line position?
    protected DBPDataSourceContainer getDataSourceContainerForSyntaxRuleReloading() {
    public IAnnotationModel getAnnotationModel() {
        syntaxManager.init(dialect, getActivePreferenceStore());
        }
            case SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS:
        SQLEditorSourceViewer sourceViewer = createSourceViewer(parent, ruler, styles, fOverviewRuler);
            marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
    protected void loadActivePreferenceSettings() {

            if (errorAssistant != null) {
            && DBWorkbench.getPlatform().getPreferenceStore().getBoolean(SQLPreferenceConstants.FOLDING_ENABLED);
                return dialect.getMultiLineComments();
import org.jkiss.dbeaver.ui.editors.AbstractStorageEditorInput;
            ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION);
        }
                        ) {
    @NotNull

        } else {
    @Override
 *
import java.io.File;
            if (marker.getAttribute(SQLSemanticErrorAnnotation.MARKER_ATTRIBUTE_NAME) instanceof SQLSemanticErrorAnnotation annotation) {
    // Brackets
    public ProjectionAnnotationModel getProjectionAnnotationModel() {
                SQLParserPartitions.SQL_PARTITIONING,
import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLEditorOutlinePage;
        action = new TextOperationAction(
    }
                }
        super.configureSourceViewerDecorationSupport(support);
                        txt.append(textSelection.getEndLine() - textSelection.getStartLine() + 1);

                                ((SQLProblemAnnotation) annotation).getMarker().delete();
import org.eclipse.jface.viewers.ISelectionProvider;
            if (element instanceof AbstractStorageEditorInput) {

            this.reloadSyntaxRules();


            loadActivePreferenceSettings();
    
            IStatusField field = getStatusField(category);
        super.createPartControl(editorControl);
    }
                    }
        }
            SQLPreferenceConstants.MATCHING_BRACKETS_HIGHLIGHT,
                            // Reconfigure to let comments/strings colors to take effect
            if (adapter != null) {
     * @param category the category
import org.eclipse.swt.events.MouseEvent;

            PrefPageSQLCompletion.PAGE_ID,
                    final StyledText widget = sourceViewer.getTextWidget();
        } catch (Throwable e) {
                return;

        // view, and also can't open this view without knowing about it in advance.
        if (getDocumentProvider() instanceof NonFileDocumentProvider) {
        return false;
    }
                } catch (Throwable ex) {
        }
                    log.error("Error deleting problem markers", e);
                                    scrolled = true;

        //menu.remove(IWorkbenchActionConstants.MB_ADDITIONS);
        protected void saveSourceText(DBRProgressMonitor monitor, String text) throws DBException {
        projectionSupport.install();

                return container.getPreferenceStore();
            styles,
            if (context == null) {

    private final SQLRuleScanner ruleScanner;
    protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
                // Refresh viewer
    public ICharacterPairMatcher getCharacterPairMatcher() {
        final ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();
    @Override
    protected boolean isAnnotationRulerVisible() {
            try {
        }
                log.warn("Error setting SQL partitioner", e); //$NON-NLS-1$


import org.jkiss.utils.Pair;
                    Position position = annotationModel.getPosition(annotation);
                    final Annotation annotation = it.next();
    @Nullable
        boolean closeSingleQuotes = preferenceStore.getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES);


    }

    @Override
                shell.removeShellListener(this.activationListener);
                                errorOffset = document.getLineOffset(startLine + pos.line);
            menu.insertAfter(GROUP_SQL_ADDITIONS, formatMenu);
    }
        super();
                        }
import org.jkiss.dbeaver.ui.editors.sql.util.SQLSymbolInserter;
        if (this.outlinePage != null) {
                        if (lineIndex + 1 >= widget.getLineCount()) {
        setEditorContextMenuId(SQLEditorContributions.SQL_EDITOR_CONTEXT_MENU_ID);
                    boolean withinExistingSelection = false;
    protected boolean addProblem(@Nullable String message, @NotNull Position position) {
import java.util.ResourceBundle;
                }
        return (SQLEditorSourceViewerConfiguration) super.getSourceViewerConfiguration();

                if (positions != null && positions.length > 0) {
            DBCExecutionContext context = getExecutionContext();

            partitioner.connect(document);
    DBPContextProvider,
    }
    }
    }
                field.setText(txt.toString());
            SQLEditorContributor.getActionResourcePrefix(SQLEditorContributor.ACTION_CONTENT_ASSIST_INFORMATION),
        try {
                sqlSymbolInserter.setCloseSingleQuotesEnabled(CommonUtils.toBoolean(event.getNewValue()));
            case ModelPreferences.SQL_FORMAT_BREAK_BEFORE_CLOSE_BRACKET:
        if (parserContext == null) {
        addAction(menu, GROUP_SQL_EXTRAS, SQLEditorContributor.ACTION_CONTENT_ASSIST_PROPOSAL);
                                    // This may happen if error position was incorrectly detected.
                    }

        final SQLDialect dialect = getSQLDialect();
    }
                IRegion lineRegion = document.getLineInformationOfOffset(selection.getOffset());

            log.warn("Error positioning on query error", e);
        if (themeListener != null) {
        if (this.semanticMarkersManager != null) {
        return context == null ? null : context.getDataSource();
            editorInput.setText(text);
import org.jkiss.dbeaver.ui.editors.BaseTextEditorCommands;
            }

        return syntaxManager;
    private SQLEditorControl editorControl;
                this.reloadSyntaxRules();
        {
                                }
        String text = document == null ? "" : document.get();
                } catch (CoreException e) {
 *

    @Override
        if (!occurrencesHighlighter.handlePreferenceStoreChanged(event)) {
     * Error handling
                Annotation anno = i.next();
                    if (widgetOffset < 0) {
            ISourceViewer.INFORMATION);
                        for (IRegion region : ((IBlockTextSelection) selection).getRegions()) {
import org.eclipse.jface.viewers.ISelection;
            log.error("Error saving SQL editor");
            }
            }
    protected class ShowPreferencesAction extends Action {
     *
            return true;
                            widgetOffset = widget.getCharCount();
                }

        }
                    event.getProperty().startsWith("org.jkiss.dbeaver.sql.editor")) {
            super(SQLEditorMessages.editor_sql_preference, DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
            ((SQLEditorSourceViewerConfiguration) getSourceViewerConfiguration()).onDataSourceChange();
                selText = document.get(lineRegion.getOffset(), lineRegion.getLength());
            case ModelPreferences.SQL_FORMAT_INSERT_DELIMITERS_IN_EMPTY_LINES:
        this.completionContext = completionContext;

import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLSemanticErrorAnnotation;
                    return false;
        IDocumentProvider provider = getDocumentProvider();
            if (resource != null && resource.exists()) {
    protected SourceViewerDecorationSupport getSourceViewerDecorationSupport(ISourceViewer viewer) {
            public Pair<String, String> getMultiLineComments() {
                if (verticalRuler != null && verticalRuler.getControl() != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

            if (this.backgroundParsingJob != null) {
    private SQLBackgroundParsingJob backgroundParsingJob;

        }
            String[] preferencePages = collectContextMenuPreferencePages();
*/
                        final Position position = annotationModel.getPosition(annotation);
    private SQLOccurrencesHighlighter occurrencesHighlighter;
        }
        }
    public void editorContextMenuAboutToShow(IMenuManager menu) {
                                } else if (index == 0) {

        }
        {
                }
    }
    //private Map<Annotation, Position> curAnnotations;
                    }

            case SQLPreferenceConstants.SQLEDITOR_CLOSE_SINGLE_QUOTES:
    }
    protected IVerticalRuler createVerticalRuler() {
        sourceViewer.unconfigure();
/*
                //projectionViewer.getTextWidget().redraw();
    public boolean isAdvancedHighlightingEnabled() {
        IDocument document = getDocument();
        }
import org.jkiss.code.Nullable;
    public boolean isDisposed() {
    public SQLSyntaxManager getSyntaxManager() {

            case SQLPreferenceConstants.FOLDING_ENABLED: {
    }

            this.outlinePage.refresh();
            PreferenceConverter.getColor(getPreferenceStore(), "writeOccurrenceIndicationColor")));
        if (resource == null || annotationModel == null) {
    }
                DBPErrorAssistant.ErrorPosition[] positions = errorAssistant.getErrorPosition(
        String selText = selection.getText();
                                    scrolled = true;


import org.eclipse.jface.text.*;
                                    scrolled = true;
    }
            TEXT_EDITOR_CONTEXT,
                            // Line + position
        }
        SQLQuery query = new SQLQuery(getDataSource(), text, 0, text.length());
        handleInputChange(input);
    void setLastQueryErrorPosition(int lastQueryErrorPosition) {
                        if (pos.line < 0) {
    @Override
    protected IOverviewRuler createOverviewRuler(ISharedTextColors sharedColors) {
        IDocument document = getDocument();
            }
        if (SQLEditorUtils.isSQLSyntaxParserApplied(this.getEditorInput()) && this.isAdvancedHighlightingEnabled()) {
    public void preferenceChange(PreferenceChangeEvent event) {

    @Override
            public void propertyChange(PropertyChangeEvent event) {
        } catch (Exception e) {
    public SQLDocumentSyntaxContext getSyntaxContext() {
    }

                PropertyDialog.createDialogOn(shell, null, new StructuredSelection(getEditorInput())).open();

        if (this.backgroundParsingJob != null) {
    }
        super.doSetInput(input);
                }
 * Unless required by applicable law or agreed to in writing, software
        }
                return;
        return true;
    static boolean isReadEmbeddedBinding() {

    ////////////////////////////////////////////////////////
import org.eclipse.swt.events.ControlAdapter;
        ruleScanner.refreshRules(getDataSourceContainerForSyntaxRuleReloading(), ruleManager, this);

            marker.setAttribute(IMarker.MESSAGE, message);

                        }
        }
            this,
    }
        if (getSourceViewerConfiguration() instanceof SQLEditorSourceViewerConfiguration) {
        if (annotation instanceof SpellingAnnotation) {
                    if (annotation instanceof SQLProblemAnnotation) {
            this
    }
                        if (currentLine > visibleLine) {
            }
        }
        final IVerticalRuler verticalRuler = getVerticalRuler();
                        if (position.overlapsWith(query.getOffset(), query.getLength()) ||
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLProblemAnnotation;

                                // Try to add a problem marker, otherwise select text containing error if it's the first error
                getSourceViewer().getTextWidget().isDisposed();
    public static final long MAX_FILE_LENGTH_FOR_RULES = 1024 * 1000 * 2; // 2MB
                        final int currentLine = document.getLineOfOffset(sourceViewer.getSelectedRange().x);
                            }
    public <T> T getAdapter(Class<T> required) {
        return visualizeQueryErrors(monitor, query, error, null);
    private void reloadSourceViewerConfiguration() {

        projectionSupport.addSummarizableAnnotationType("org.eclipse.ui.workbench.texteditor.warning"); //$NON-NLS-1$
        }
        if ((outlinePage == null || outlinePage.getControl() == null || outlinePage.getControl().isDisposed())) {
    public SQLScriptElement extractNextQuery(boolean next) {
            log.error("Error retrieving marker attribute", e);
        }
            }

import java.util.Iterator;
            // We use hardcoded constants instead of AbstractDecoratedTextEditorPreferenceConstants.EDITOR_DELETE_SPACES_AS_TABS
            // If we below Eclipse 4.2.1

        }
        try {
        public boolean isReadOnly(Object element) {
                            annotationModel.removeAnnotation(annotation);
    // Most left ruler
        return fSourceViewerDecorationSupport;
    }
    protected IAnnotationAccess createAnnotationAccess() {
                public void mouseUp(MouseEvent e) {
    /**
        }
        ruleManager.loadRules(getDataSourceContainerForSyntaxRuleReloading(), !SQLEditorUtils.isSQLSyntaxParserApplied(getEditorInput()));
            themeListener = null;
                sqlSymbolInserter.setCloseBracketsEnabled(CommonUtils.toBoolean(event.getNewValue()));
    public boolean visualizeError(@NotNull DBRProgressMonitor monitor, @NotNull Throwable error) {
    @Nullable
                ((ITextViewerExtension) sourceViewer).prependVerifyKeyListener(sqlSymbolInserter);
import org.eclipse.ui.internal.dialogs.PropertyDialog;
        boolean closeDoubleQuotes = preferenceStore.getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES);
        if (this.getSyntaxContext() == null) {
            overviewRuler,
        editorControl = new SQLEditorControl(parent, this);
        return new SQLEditorSourceViewer(
    @Override
        if (this.semanticMarkersManager != null) {
    @Override
                        withinExistingSelection = within(new Region(selection.getOffset(), selection.getLength()), modelOffset);
        }
            case SQLPreferenceConstants.SQLEDITOR_CLOSE_DOUBLE_QUOTES:
                textWidget.setBackground(bgColor);
                    int queryStartOffset = query.getOffset();
        }
    protected boolean isOverviewRulerVisible() {
            return false;
        } else {
                                    errorLength = document.getLineLength(startLine + pos.line);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return dataSource == null ? DBWorkbench.getPlatform().getPreferenceStore() : dataSource.getContainer().getPreferenceStore();

        )) {

                            try {
        if (selection instanceof IBlockTextSelection) {
        }

        if (projectionSupport != null) {
                            }
import org.eclipse.swt.events.ControlEvent;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
    protected boolean isEditorInputIncludedInContextMenu() {
            formatMenu.add(getAction(ITextEditorActionConstants.UPPER_CASE));
                try {
                getSourceViewer().getTextWidget() == null ||
        return parserContext == null ? null : SQLScriptParser.extractQueryAtPos(parserContext, currentPos, false);

        }
                this.clearProblems(null);
            widget.addControlListener(new ControlAdapter() {
                            final int revealToLine = Math.min(document.getNumberOfLines() - 1, currentLine + 1);
        DBPDataSource dataSource = getDataSource();
 * SQL Executor
            verticalRuler.update();
        }
        // Refresh syntax

        menu.add(new GroupMarker(GROUP_SQL_ADDITIONS));
                final TextViewer textViewer = this.getTextViewer();

        SQLEditorSourceViewerConfiguration viewerConfiguration = getViewerConfiguration();
            IAction formatAction = getAction(SQLEditorContributor.ACTION_CONTENT_FORMAT_PROPOSAL);
        return templatesPage;
    @Override
        this.lastQueryErrorPosition = lastQueryErrorPosition;
                            final int revealToOffset = document.getLineOffset(revealToLine);
        ISourceViewer viewer = getSourceViewer();
        };

            //editorStore.setDefault(SQLPreferenceConstants.MATCHING_BRACKETS_COLOR, "128,128,128"); //$NON-NLS-1$
                //PreferencesUtil.createPreferenceDialogOn(shell, preferencePages[0], preferencePages, getEditorInput()).open();
import org.jkiss.dbeaver.model.sql.semantics.SQLDocumentSyntaxContext;
    }
                }
        // (that's why we can't run it in prefs initializer classes which run before workbench creation)
                            }
        addAction(menu, GROUP_SQL_EXTRAS, SQLEditorContributor.ACTION_CONTENT_ASSIST_INFORMATION);
                            sourceViewer.configure(getSourceViewerConfiguration());

    public void doSave(IProgressMonitor progressMonitor) {
            return super.createAnnotationRulerColumn(ruler);
 *
        return SQLScriptParser.extractScriptQueries(parserContext, startOffset, length, scriptMode, keepDelimiters, parseParameters);
                            if (document != null) {
    @Override
                        ISourceViewer sourceViewer = getSourceViewer();
                    }
    static long getBigScriptFileLengthBoundary() {
                                    }

 * See the License for the specific language governing permissions and
                ((IDocumentExtension3) document).setDocumentPartitioner(SQLParserPartitions.SQL_PARTITIONING, partitioner);
            bundle,
    private SQLEditorSourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles, IOverviewRuler overviewRuler) {

            bundle,
    }
import org.eclipse.jface.util.IPropertyChangeListener;
    }
                    final ISelectionProvider selectionProvider = sourceViewer.getSelectionProvider();
        final IFile file = GeneralUtils.adapt(input, IFile.class);
                                    errorLength = 1;
            if (container != null) {
    }
        }*/
    public boolean isFoldingEnabled() {
        }
        protected String loadSourceText(DBRProgressMonitor monitor) throws DBException {
                                        if (errorLine >= 0) {
                        }
                            originalQuery.addExtraErrorMessage("\n" + SQLEditorMessages.sql_editor_error_position + ":" + (pos.line > 0 ? " line: " + pos.line : "") +
        } else {

import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLEditorCompletionContext;
        }  //$NON-NLS-1$
                    }
            return SQLScriptParser.extractActiveQuery(parserContext, selection.getOffset(), selection.getLength());
    private IPropertyChangeListener themeListener;

                IDocumentProvider prov = new NonFileDocumentProvider(this, (StringEditorInput) input);
            // MarkerUtilities.setCharStart(marker, position.offset);
                                final int length = detector.getLength() > 0
    protected IVerticalRulerColumn createAnnotationRulerColumn(CompositeRuler ruler) {
        if (isAnnotationRulerVisible()) {
            public String[] getSingleLineComments() {
                    if (!withinExistingSelection) {
                    }
        setAction(SQLEditorContributor.ACTION_CONTENT_ASSIST_INFORMATION, action);
    protected void clearProblems(@Nullable SQLQuery query) {
            this.backgroundParsingJob == null ||
        if (viewer instanceof ITextViewerExtension5) {
            ISourceViewer.CONTENTASSIST_PROPOSALS);
        }
        public void run() {
    private int lastQueryErrorPosition = -1;
 * DBeaver - Universal Database Manager
                        }

    @Nullable
        }
            parent,
            PrefPageSQLResources.PAGE_ID,
        if (dataSource != null) {
import org.eclipse.core.runtime.IProgressMonitor;

import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLRuleScanner;
    }
        /*if (isReadOnly()) {
    protected void createActions() {
        setAction(SQLEditorContributor.ACTION_CONTENT_ASSIST_TIP, action);
        if (parserContext == null) {
                        } else {
    @SuppressWarnings("unchecked")
        if (ITemplatesPage.class.equals(required)) {
        SQLEditorCustomActions.registerCustomActions(this);
            }
        } else if (IContentOutlinePage.class.equals(required)) {
                private boolean within(@NotNull IRegion region, int index) {
            if (shell != null && !shell.isDisposed()) {
                    }
            case SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR:
        projectionSupport = new ProjectionSupport(



                                }
                    resource.deleteMarkers(SQLProblemAnnotation.MARKER_TYPE, false, IResource.DEPTH_ONE);


                    int modelOffset = sourceViewer instanceof ITextViewerExtension5 vext ? vext.widgetOffset2ModelOffset(widgetOffset) : widgetOffset;
        matchPainter.setHighlightCharacterAtCaretLocation(true);
                        textViewer.revealRange(position.getOffset(), position.getLength());
import org.jkiss.dbeaver.model.sql.*;
                        selectionProvider.setSelection(new TextSelection(modelOffset, 0));
 */

                                }
            try {
        } catch (CoreException e) {

    private ICharacterPairMatcher characterPairMatcher;
        DBPDataSource dataSource = getDataSource();
                        }
        return ArrayUtils.concatArrays(ids, new String[] {
        setRulerContextMenuId(SQLEditorContributions.SQL_RULER_CONTEXT_MENU_ID);

                @Override
                                            pos.line = errorLine + 1;
            return SQLScriptParser.extractActiveQuery(parserContext, ((IBlockTextSelection) selection).getRegions());
            outlinePage = new SQLEditorOutlinePage(this);
            case AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS:
        this.hasVerticalRuler = hasVerticalRuler;

                                log.error("Error deleting problem marker", e);
            occurrencesHighlighter.installOccurrencesFinder();
            SQLEditorContributor.getActionResourcePrefix(SQLEditorContributor.ACTION_CONTENT_ASSIST_PROPOSAL),
            SQLEditorContributor.getActionResourcePrefix(SQLEditorContributor.ACTION_CONTENT_ASSIST_TIP),
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionContext;
        action.setActionDefinitionId(BaseTextEditorCommands.CMD_CONTENT_FORMAT);
                this.semanticMarkersManager = new SQLEditorSemanticMarkersManager(this);
        return new ICommentsSupport() {
import org.eclipse.swt.widgets.Shell;
                return adapter;
                            } catch (CoreException e) {
        }
            ITextViewerExtension5 extension = (ITextViewerExtension5) viewer;
                                    getSelectionProvider().setSelection(new TextSelection(errorOffset, errorLength));
                }
        }
                                        }
    }
            if (sourceViewer instanceof ITextViewerExtension && sqlSymbolInserter != null) {

    private SQLSymbolInserter sqlSymbolInserter;
            sqlSymbolInserter = new SQLSymbolInserter(this);
        SQLMatchingCharacterPainter matchPainter = new SQLMatchingCharacterPainter(sourceViewer, characterPairMatcher);
            this::getActivePreferenceStore,
                if (this.outlinePage != null) {
import org.eclipse.ui.texteditor.templates.ITemplatesPage;
        }
    }
                    final ITextSelection selection = (ITextSelection) selectionProvider.getSelection();
        }

    protected void initializeEditor() {
        }
                                if (pos.position >= 0) {
        return DBWorkbench.getPlatform().getPreferenceStore().getLong(SQLPreferenceConstants.SCRIPT_BIG_FILE_LENGTH_BOUNDARY);
    public static boolean isBigScript(@Nullable IEditorInput editorInput) {
            case SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS:
                        }

    {
            this.semanticMarkersManager.dispose();
    }
        //setDocumentProvider(new SQLDocumentProvider());

        @Override
    public SQLScriptElement extractQueryAtPos(int currentPos) {
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;

                            (!position.isDeleted() && query.getOffset() + query.getLength() == position.getOffset() + position.getLength())
                if (annotationModel != null && textViewer != null) {
                                    errorOffset += pos.position;
            }
            return false;
        );
        return completionContext;
            ISourceViewer.FORMAT);
            final IMarker marker = resource.createMarker(SQLProblemAnnotation.MARKER_TYPE);
import org.jkiss.dbeaver.ui.controls.resultset.ThemeConstants;
        matchPainter.setColor(getSharedColors().getColor(

                    
                    if (lastUpdateTime > 0 && System.currentTimeMillis() - lastUpdateTime < 500) {
        }
                                errorOffset = queryStartOffset + pos.position;
    static boolean isWriteEmbeddedBinding() {
        }
        IDocument document = getDocument();
                this.backgroundParsingJob.dispose();
            }
    }

    protected boolean isNavigationTarget(Annotation annotation) {
                        return;
        }
            final StyledText widget = sourceViewer.getTextWidget();
        super.updateSelectionDependentActions();
                if (selection instanceof ITextSelection textSelection) {

        if (viewerConfiguration != null) {
        try {
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
            for (Iterator<Annotation> i = getAnnotationModel().getAnnotationIterator(); i.hasNext(); ) {
    protected ISharedTextColors getSharedColors() {
import org.jkiss.dbeaver.ModelPreferences;
            this,

            PrefPageSQLFormat.PAGE_ID,
        handleInputChange(getEditorInput());
    public SQLEditorControl getEditorControlWrapper() {
    }
            case AbstractDecoratedTextEditorPreferenceConstants.EDITOR_TAB_WIDTH:
    @Override
    }

    }
                                    scrolled = true;
                            sourceViewer.revealRange(revealToOffset, 0);
            TextViewer textViewer = getTextViewer();
            log.error("Error creating problem marker", e);
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
    }

            MenuManager formatMenu = new MenuManager(SQLEditorMessages.sql_editor_menu_format, "format");
            UIUtils.asyncExec(() -> selectAndReveal(Integer.MAX_VALUE, 0));
            return null;
        DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(this);
                return;
                log.warn(e);
package org.jkiss.dbeaver.ui.editors.sql;
        setAction(ITextEditorActionConstants.CONTEXT_PREFERENCES, new ShowPreferencesAction());

                    final int lastHeight = this.lastHeight;
        return SQLScriptParser.extractNextQuery(parserContext, offset, next);
            // Iterate over spelling problems only if we do not have problems

        return sourceViewer;
    }
                    
            return false;
                occurrencesHighlighter.updateInput(this.getEditorInput());
                    if (selection instanceof IBlockTextSelection) {
            ruler,

        support.setCharacterPairMatcher(characterPairMatcher);
                    final int currentHeight = widget.getSize().y;
                        int errorOffset = 0;

        action = new TextOperationAction(
                return;
    }
        }
        return dataSource == null ? null : dataSource.getContainer();
                                    ? detector.getLength()
                                final SQLWordPartDetector detector = new SQLWordPartDetector(getDocument(), getSyntaxManager(), errorOffset);
        if (query == null) {
        } else {
                return dialect.getSingleLineComments();
        }
            formatMenu.add(new Separator());
            if (annotationModel != null) {


            final IResource resource = GeneralUtils.adapt(getEditorInput(), IResource.class);
    public SQLDialect getSQLDialect() {
                if (annotationModel != null) {

        };
        if (parserContext == null) {
        this.occurrencesHighlighter = new SQLOccurrencesHighlighter(this);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public SQLEditorSourceViewerConfiguration getViewerConfiguration() {
            }

        return super.isNavigationTarget(annotation);
        @Override
            return super.createOverviewRuler(sharedColors);
    }
        return outlinePage;
        if (this.backgroundParsingJob != null) {
        if (occurrencesHighlighter.isEnabled()) {
                        return;
        }
import org.jkiss.utils.CommonUtils;
                        if (originalQuery != null) {
        try {
 * you may not use this file except in compliance with the License.
        final ISourceViewer viewer = getSourceViewer();
            if (projectionViewer != null && projectionViewer.getAnnotationModel() != null && document.getLength() > 0) {
            fSourceViewerDecorationSupport = new SQLSourceViewerDecorationSupport(viewer, getOverviewRuler(), getAnnotationAccess(), getSharedColors());

                    }
        if (getDataSource() != null) {
        updateStatusField(STATS_CATEGORY_SELECTION_STATE);
        }

        // Update configuration
                }
    private boolean hasVerticalRuler = true;
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
    private ProjectionSupport projectionSupport;
            this.activationListener = null;
        sqlSymbolInserter.setCloseSingleQuotesEnabled(closeSingleQuotes);
            case SQLPreferenceConstants.SQL_FORMAT_ACTIVE_QUERY:
                                }
    static final String STATS_CATEGORY_SELECTION_STATE = "SelectionState";
            File file = EditorUtils.getLocalFileFromInput(editorInput);
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                    
    DBPPreferenceListener {
    public void dispose() {

                    projectionViewer.reinitializeProjection();
            case SQLPreferenceConstants.SQL_FORMAT_EXTRACT_FROM_SOURCE:
                                int startLine = document.getLineOfOffset(queryStartOffset);
        }
                                } else if (index == 0) {
    }
            PrefPageSQLTemplates.PAGE_ID
                                if (addProblem(GeneralUtils.getFirstMessage(error), new Position(errorOffset, length))) {
                new SQLPartitionScanner(getDataSource(), dialect, ruleManager),
    @NotNull
    @Override
                    int widgetOffset = widget.getOffsetAtPoint(new Point(e.x, e.y));
        if (selectionProvider == null) {
//            }
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplatesPage;

    }
        }
            formatMenu.add(ActionUtils.makeCommandContribution(getSite(), "org.jkiss.dbeaver.ui.editors.sql.trim.spaces"));
        DBPDataSource dataSource = getDataSource();
        sqlSymbolInserter.setCloseDoubleQuotesEnabled(closeDoubleQuotes);
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
            !this.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED)

    public SQLRuleScanner getRuleScanner() {

    public SQLTemplatesPage getTemplatesPage() {
        ProjectionViewer projectionViewer = (ProjectionViewer) getSourceViewer();
        return this.getActivePreferenceStore().getBoolean(SQLModelPreferences.ADVANCED_HIGHLIGHTING_ENABLE);
            @Override
        TextViewer textViewer = getTextViewer();
    private SQLTemplatesPage templatesPage;
        super.gotoMarker(marker);
        if (STATS_CATEGORY_SELECTION_STATE.equals(category)) {
    }
        }
        ITextSelection selection = (ITextSelection) getSelectionProvider().getSelection();
import org.eclipse.jface.text.source.projection.ProjectionViewer;
            long lastUpdateTime = 0;
import org.eclipse.jface.viewers.StructuredSelection;
    private SQLParserContext parserContext;
        if (getDataSource() != null) {
        }
     */
import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLEditorSemanticMarkersManager;
    }

    }
                                break;
            formatMenu.add(ActionUtils.makeCommandContribution(getSite(), "org.jkiss.dbeaver.ui.editors.sql.morph.delimited.list"));
        }
                    if (textSelection.getLength() <= 0) {

                    });

                    if (widgetOffset < 0) {
            T adapter = projectionSupport.getAdapter(getSourceViewer(), required);
    // Exclude input additions. Get rid of tons of crap from debug/team extensions
            case ModelPreferences.SQL_FORMAT_KEYWORD_CASE:
        } else {
                final IAnnotationModel annotationModel = this.getAnnotationModel();
import org.eclipse.swt.custom.StyledText;
        setRangeIndicator(new DefaultRangeIndicator());
    @Override

            super.handlePreferenceStoreChanged(event);

    protected void doSetInput(IEditorInput input) throws CoreException {
            return (T) getTemplatesPage();
    @Nullable
    @Override
    }
            bundle,
                    verticalRuler.getControl().setBackground(bgColor);

        support.setMatchingCharacterPainterPreferenceKeys(
                @Override
                            if (pos.position >= 0) {
    @Override
            final IAnnotationModel annotationModel = getAnnotationModel();
                    monitor, context, query.getText(), error);

            case ModelPreferences.META_DISABLE_EXTRA_READ:
        return SQLEditorUtils.isSQLSyntaxParserApplied(getEditorInput())


            widget.addMouseListener(new MouseAdapter() {
            }
    @Override
            if (formatAction != null) {
            log.debug("Error opening problem view", e);

        if (sqlSymbolInserter == null) {


        }
                    this.outlinePage.refresh();
        completionContext = new SQLEditorCompletionContext(this);
        if (parserContext == null) {
    public SQLRuleManager getRuleManager() {
    @Override

            SQLPreferenceConstants.MATCHING_BRACKETS,
                private int lastHeight;
import org.jkiss.dbeaver.model.sql.parser.*;
        return
        ISelectionProvider selectionProvider = getSelectionProvider();
                        return;
                return ((AbstractStorageEditorInput) element).isReadOnly();

                if (anno instanceof SQLProblemAnnotation) {
        final IAnnotationModel annotationModel = getAnnotationModel();
    public SQLQueryCompletionContext obtainCompletionContext(DBRProgressMonitor monitor, @NotNull Position completionRequestPosition) {
        }
        }
            formatMenu.add(getAction(ITextEditorActionConstants.LOWER_CASE));
        if (!getActivePreferenceStore().getBoolean(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED)) {
    protected void handlePreferenceStoreChanged(PropertyChangeEvent event) {
                                }
    }
        super.doSave(monitor.getNestedMonitor());
            this.semanticMarkersManager = null;
        }

        if (this.semanticMarkersManager != null) {
        if (document instanceof IDocumentExtension3) {
        return UIUtils.getSharedTextColors();
            //Color fgColor = ruleScanner.getColor(SQLConstants.CONFIG_COLOR_TEXT);
        return viewer != null ? viewer.getProjectionAnnotationModel() : null;

            }
            context = new SQLParserContext(getDataSource(), parserContext.getSyntaxManager(), parserContext.getRuleManager(), new Document(query.getText()));
        if (isOverviewRulerVisible()) {
                        return;
    }
    }
            case SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED:

        return viewer != null ? viewer.getAnnotationModel() : null;
                            reloadSyntaxRules();
                                    errorOffset = queryStartOffset + queryLength - 1;
            UIUtils.getActiveWorkbenchWindow().getActivePage().showView(IPageLayout.ID_PROBLEM_VIEW, null, IWorkbenchPage.VIEW_VISIBLE);
                final StyledText textWidget = textViewer.getTextWidget();
        public NonFileDocumentProvider(SQLEditorBase editor, StringEditorInput editorInput) {
        boolean closeBrackets = preferenceStore.getBoolean(SQLPreferenceConstants.SQLEDITOR_CLOSE_BRACKETS);
        if (editorInput != null) {

            if (field != null) {
        ITextSelection selection = (ITextSelection) getSelectionProvider().getSelection();

        occurrencesHighlighter.updateInput(input);
import java.util.List;

    public void reloadSyntaxRules() {
        } else {
import org.jkiss.dbeaver.model.*;
            configureSourceViewerDecorationSupport(fSourceViewerDecorationSupport);
    protected String[] collectContextMenuPreferencePages() {
            }

            PlatformUI.getWorkbench().getThemeManager().removePropertyChangeListener(themeListener);
        action = new TextOperationAction(
            }
    
        return !CommonUtils.isEmptyTrimmed(selText);
    public void createPartControl(Composite parent) {
            context = new SQLParserContext(getDataSourceContainerForSyntaxRuleReloading(), parserContext.getSyntaxManager(), parserContext.getRuleManager(), new Document(query.getText()));
    public void setCompletionContext(SQLCompletionContext completionContext) {
 * Licensed under the Apache License, Version 2.0 (the "License");

                    }
        syntaxManager = new SQLSyntaxManager();
                    // We can catch OutOfMemory here for too big/complex documents
            editorStore.setDefault(SQLPreferenceConstants.MATCHING_BRACKETS_HIGHLIGHT, true);
                        final int visibleLine = sourceViewer.getBottomIndex();
    protected void setDocumentProvider(IEditorInput input) {
    }
                    }
            getSourceViewer() == null ||
            }
    }
            this.semanticMarkersManager.refresh();
            }
        if (verticalRuler != null) {
                }
        super.setDocumentProvider(input);
            return (T) getOverviewOutlinePage();
            formatMenu.add(ActionUtils.makeCommandContribution(getSite(), "org.jkiss.dbeaver.ui.editors.sql.comment.multi"));
        sqlSymbolInserter.setCloseBracketsEnabled(closeBrackets);

    @Nullable
    public void gotoMarker(IMarker marker) {
                public void controlResized(ControlEvent e) {
        /*
    /**
import org.eclipse.jface.preference.PreferenceConverter;
        action.setActionDefinitionId(ITextEditorActionDefinitionIds.SHOW_INFORMATION);
import org.eclipse.ui.IEditorInput;
        return editorControl;
        }
            ProjectionViewer projectionViewer = (ProjectionViewer) getSourceViewer();
            extension.exposeModelRange(new Region(offset, length));


            SQLEditorContributions.SQL_EDITOR_SCRIPT_CONTEXT};

//                // Can't position on error - let's just select entire problem query
                        } else {
            PrefPageSQLExecute.PAGE_ID,
    public IContentOutlinePage getOverviewOutlinePage() {
        } catch (CoreException e) {
                                (pos.position > 0 ? " pos: " + pos.position : ""));
                                            // Start position of the getLineOfOffset method is 0 but SQL Editor lines start from the 1
    private SQLEditorSemanticMarkersManager semanticMarkersManager;
    }
                        textViewer.setSelectedRange(position.getOffset(), position.getLength());
        return true;
        }
        setAction(SQLEditorContributor.ACTION_CONTENT_FORMAT_PROPOSAL, action);
    protected boolean isReadOnly() {
        if (document == null) {
            return null;
            parserContext = new SQLParserContext(getDataSourceContainerForSyntaxRuleReloading(), syntaxManager, ruleManager, document != null ? document : new Document());
    public ICommentsSupport getCommentsSupport() {
    }
                    this.lastHeight = currentHeight;

        return provider instanceof IDocumentProviderExtension &&
import org.eclipse.jface.text.source.projection.ProjectionSupport;
        }
                SQLParserPartitions.SQL_CONTENT_TYPES);
    List<SQLQueryParameter> parseQueryParameters(SQLQuery query) {
            true,
                }
    protected void configureSourceViewerDecorationSupport(SourceViewerDecorationSupport support) {
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLCharacterPairMatcher;
            super.doSave(progressMonitor);
        // Refresh syntax
    @NotNull
            super(editor);
    }
                    } else {

                        txt.append(0);
            characterPairMatcher = new SQLCharacterPairMatcher(this, matchChars,
    @Nullable
            @Override
            IPreferenceStore editorStore = EditorsUI.getPreferenceStore();
                                if (originalQuery != null) {
                    return;
    public void updatePartControl(IEditorInput input) {
import org.eclipse.core.resources.IFile;
        fOverviewRuler = createOverviewRuler(getSharedColors());
                    UIUtils.asyncExec(() -> {
            formatMenu.add(ActionUtils.makeCommandContribution(getSite(), "org.jkiss.dbeaver.ui.editors.sql.word.wrap"));
        this.occurrencesHighlighter.dispose();
                                // Only position
            }
        return hasVerticalRuler ? super.createVerticalRuler() : new VerticalRuler(0);
            parserContext = new SQLParserContext(getDataSource(), syntaxManager, ruleManager, document != null ? document : new Document());
            ((IDocumentProviderExtension) provider).isReadOnly(getEditorInput());
import org.jkiss.dbeaver.runtime.DBWorkbench;
        setAction(SQLEditorContributor.ACTION_CONTENT_ASSIST_PROPOSAL, action);
        getSourceViewerDecorationSupport(sourceViewer);
}
                return false;
                    if (Math.abs(currentHeight - lastHeight) < SCROLL_ON_RESIZE_THRESHOLD_PX) {
    @Override
    boolean visualizeQueryErrors(@NotNull DBRProgressMonitor monitor, @NotNull SQLQuery query, @NotNull Throwable error, @Nullable SQLQuery originalQuery) {
                        DBPErrorAssistant.ErrorPosition pos = positions[index];
            if (!(getDocumentProvider() instanceof NonFileDocumentProvider)) {

import org.eclipse.jface.action.*;
                return;
        return backgroundParsingJob == null ? null : backgroundParsingJob.getCurrentContext();
            return file != null && file.length() > getBigScriptFileLengthBoundary();
        } catch (PartInitException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
    }


        setKeyBindingScopes(getKeyBindingContexts());  //$NON-NLS-1$
        } else {
        return parserContext.getRuleManager();
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionContext;
                for (Iterator<Annotation> it = annotationModel.getAnnotationIterator(); it.hasNext(); ) {
                }
        sourceViewer.addPainter(matchPainter);
        SQLEditorSourceViewer sourceViewer = (SQLEditorSourceViewer) this.getSourceViewer();
                            }

                }
    }
    @Override
            // Enable "delete spaces as tabs" option by default
                if (event.getProperty().equals(IThemeManager.CHANGE_CURRENT_THEME) ||
                            if (within(region, modelOffset)) {
                                if (errorLength > queryLength) errorLength = queryLength;
import org.eclipse.ui.texteditor.*;
                try {
        projectionSupport.addSummarizableAnnotationType("org.eclipse.ui.workbench.texteditor.error"); //$NON-NLS-1$
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_READ);
                }
        action.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
/*
        IAction action = new TextOperationAction(



    protected void doTextEditorSave(DBRProgressMonitor monitor) {
                            if (index == 0) {
    }
    public DBPDataSource getDataSource() {

import org.eclipse.core.resources.IMarker;


    private final SQLSyntaxManager syntaxManager;
                    } catch (BadLocationException ignored) {
                    annotationModel.removeAllAnnotations();
                        int lineIndex = widget.getLineIndex(e.y);
                    return region.getLength() > 0 && index >= region.getOffset() && index < region.getOffset() + region.getLength();
            return dataSource.getSQLDialect();
            }
                                    IDocument document = getDocument();
        if (input instanceof StringEditorInput) {


        projectionViewer.doOperation(ProjectionViewer.TOGGLE);
            } catch (BadLocationException e) {
            viewerConfiguration.saveFoldingState();
            case SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS:
                        }
            return false;

 * limitations under the License.
        return SQLScriptParser.parseParametersAndVariables(context, 0, query.getLength());
    

    private static final int SCROLL_ON_RESIZE_THRESHOLD_PX = 10;

    IErrorVisualizer,
        DBCExecutionContext context = getExecutionContext();
                        // Do not update too often (theme change may trigger this hundreds of times)
import org.eclipse.ui.editors.text.EditorsUI;
            // MarkerUtilities.setCharEnd(marker, position.offset + position.length);
        clearProblems(null);
            this.backgroundParsingJob.dispose();
        }

    }
    }
import org.eclipse.swt.widgets.Composite;
        super.dispose();
    }
import org.eclipse.ui.themes.IThemeManager;
            PrefPageSQLEditor.PAGE_ID,
    }
            DBPErrorAssistant errorAssistant = DBUtils.getAdapter(DBPErrorAssistant.class, context.getDataSource());
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(this);
    }
        // But there's a catch: the user can't remove the annotation outside of this
                true);
        ISourceViewer sourceViewer = getSourceViewer();
        SourceViewerConfiguration configuration = this.getSourceViewerConfiguration();
    }

                    lastUpdateTime = System.currentTimeMillis();
                    this.reloadSourceViewerConfiguration();
        SQLParserContext context;
            return editorInput.getBuffer().toString();
            }
                                    getSelectionProvider().setSelection(new TextSelection(errorOffset, 0));
     * @since 2.0
            projectionViewer,
        SQLDialect dialect = getSQLDialect();
        if (parserContext == null) {
import org.eclipse.core.resources.IResource;

            } catch (Throwable e) {
    @NotNull
            });
        }
        int offset = selection.getOffset();
    }
import org.eclipse.core.runtime.CoreException;
            templatesPage = new SQLTemplatesPage(this);

public abstract class SQLEditorBase extends BaseTextEditor implements
        super.updatePartControl(input);


    }
                            }

                return;
            @Nullable
            editorStore.setDefault("removeSpacesAsTabs", true);
        final IResource resource = GeneralUtils.adapt(getEditorInput(), IResource.class);
                                        int errorLine = document.getLineOfOffset(errorOffset);
        setSourceViewerConfiguration(new SQLEditorSourceViewerConfiguration(this, getPreferenceStore()));

            return false;
        DBPPreferenceStore preferenceStore = getActivePreferenceStore();
                                    : queryLength - pos.position;
            return null;
        char[] matchChars = SQLConstants.BRACKETS; //which brackets to match

                formatMenu.add(formatAction);
                                if (errorOffset < queryStartOffset) errorOffset = queryStartOffset;
                return false;

import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;

            this,
            Shell shell = getSourceViewer().getTextWidget().getShell();
        return new SQLMarkerAnnotationAccess();
            characterPairMatcher = new SQLCharacterPairMatcher(this, matchChars, SQLParserPartitions.SQL_PARTITIONING);
        String[] ids = super.collectContextMenuPreferencePages();
        return false;
        } catch (Exception e) {
            this.semanticMarkersManager.refresh();
        ITextSelection selection = (ITextSelection) selectionProvider.getSelection();
    }
    }
import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLBackgroundParsingJob;
            IDocumentPartitioner partitioner = new FastPartitioner(
            if (getActivePreferenceStore().getBoolean(SQLPreferenceConstants.PROBLEM_MARKERS_ENABLED) && this.semanticMarkersManager == null) {
            annotationModel.addAnnotation(new SQLProblemAnnotation(marker), position);
        });

import org.eclipse.jface.util.PropertyChangeEvent;

                                    // E.g. in SQL Server when actual error happened in some stored procedure.
            getAnnotationAccess(),
/*
        return lastQueryErrorPosition;
import org.eclipse.swt.graphics.Point;
        super.editorContextMenuAboutToShow(menu);
     */
        try {
        return new String[]{
            case SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE:
 */
                                int errorLength;
                    }
    @Override
                    log.warn("Can't initialize SQL syntax projection", ex); //$NON-NLS-1$
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_WRITE);
            return new OverviewRuler(getAnnotationAccess(), 0, sharedColors);
        return super.getAdapter(required);
            this.backgroundParsingJob.setup();
import org.eclipse.ui.PlatformUI;
            }
    protected String[] getKeyBindingContexts() {
            }
    }
    public SQLCompletionContext getCompletionContext() {
    protected void updateSelectionDependentActions() {
    }
            marker.setAttribute(IMarker.TRANSIENT, true);
        }
    @Nullable
    
import org.jkiss.utils.ArrayUtils;
    }
 * You may obtain a copy of the License at
        } else {
            return null;
        if (file != null && SQLEditorUtils.isNewScriptFile(file)) {

                final ProjectionAnnotationModel annotationModel = this.getProjectionAnnotationModel();
            case SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION:
        return BasicSQLDialect.INSTANCE;
                                if (errorOffset >= queryStartOffset + queryLength) {
        if (fSourceViewerDecorationSupport == null) {
    }
        fAnnotationAccess = getAnnotationAccess();
    @Nullable

            formatMenu.add(ActionUtils.makeCommandContribution(getSite(), "org.jkiss.dbeaver.ui.editors.sql.comment.single"));
        */
            }
    }
        SQLRuleManager ruleManager = new SQLRuleManager(syntaxManager);
                setDocumentProvider(prov);
        return backgroundParsingJob == null ? null : backgroundParsingJob.obtainCompletionContext(monitor, completionRequestPosition);
            }
*/
    }
            this,
    }

    public DBPPreferenceStore getActivePreferenceStore() {
                    int queryLength = query.getLength();
            boolean scrolled = false;

            support.setCursorLinePainterPreferenceKeys(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_CURRENT_LINE, ThemeConstants.COLOR_SQL_RESULT_LINES_SELECTED);
    @NotNull
                this.backgroundParsingJob = new SQLBackgroundParsingJob(this);
            SQLEditorContributor.getActionResourcePrefix(SQLEditorContributor.ACTION_CONTENT_FORMAT_PROPOSAL),
                    for (int index = 0; index < positions.length; index++) {
    }

        }
    int getLastQueryErrorPosition() {
        themeListener = new IPropertyChangeListener() {
    }
            // For some reason, these two cause the annotation to de-sync from this marker:

    public void refreshAdvancedServices() {
        return false;
                ISelection selection = getSelectionProvider().getSelection();
        }


    }
    

    @NotNull
        super.createActions();
        ShowPreferencesAction() {
        return ruleScanner;
            Shell shell = this.getEditorSite().getShell();
    private void handleInputChange(IEditorInput input) {
                                withinExistingSelection = true;
    static {
            bundle,
            return editorInput.isReadOnly();
            return scrolled;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
        if (templatesPage == null)

 * Copyright (C) 2010-2025 DBeaver Corp and others

                                lastQueryErrorPosition = errorOffset;
            PrefPageSQLCodeEditing.PAGE_ID,
        }
        // We don't want to show this view every time because it makes everyone mad.
                this.backgroundParsingJob = null;

import org.jkiss.dbeaver.ui.editors.sql.preferences.*;
    }
    }
    protected void setHasVerticalRuler(boolean hasVerticalRuler) {

    public SQLEditorBase() {
    //private IAnnotationAccess annotationAccess;
            if (preferencePages.length > 0 && (shell == null || !shell.isDisposed())) {
/*
        }
    private static class NonFileDocumentProvider extends SQLObjectDocumentProvider {
        menu.insertBefore(ITextEditorActionConstants.GROUP_COPY, ActionUtils.makeCommandContribution(getSite(), SQLEditorCommands.CMD_NAVIGATE_OBJECT));
                    if (!position.isDeleted) {
        action.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
        private final StringEditorInput editorInput;
                    try {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (this.semanticMarkersManager != null && (
        switch (event.getProperty()) {
                StringBuilder txt = new StringBuilder("Sel: ");
            this.semanticMarkersManager.dispose();
            DBPDataSourceContainer container = ((DBPDataSourceContainerProvider) this).getDataSourceContainer();
            setDocumentProvider((IDocumentProvider) null);
    @Override
                    if (e.button != 3) {
            null);//SQLPreferenceConstants.MATCHING_BRACKETS_HIGHLIGHT);
        }
    protected void updateStatusField(String category) {
                        if (sourceViewer != null) {
        if (UIStyles.isDarkHighContrastTheme()) {
    }

//            if (!scrolled) {
    private SQLCompletionContext completionContext;

        if (CommonUtils.isEmpty(selText) && selection.getOffset() >= 0 && selection.getOffset() < document.getLength()) {
    }
/**
            super.updateStatusField(category);
    boolean hasActiveQuery() {
    }
        super.initializeEditor();
            getSharedColors());
    public List<SQLScriptElement> extractScriptQueries(int startOffset, int length, boolean scriptMode, boolean keepDelimiters, boolean parseParameters) {

                            IDocument document = getDocument();
                this.reloadSourceViewerConfiguration();
        sourceViewer.configure(configuration);
    public SQLScriptElement extractActiveQuery() {
                                } else {
                                    if (document != null) {
