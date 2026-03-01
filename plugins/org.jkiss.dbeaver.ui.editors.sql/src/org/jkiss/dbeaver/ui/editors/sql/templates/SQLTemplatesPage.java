    protected ContextTypeRegistry getContextTypeRegistry()


    protected Image getImage(Template template)
    }
 */
import org.jkiss.dbeaver.model.DBIcon;
                    contextViewer.setSelectedRange(textSelection.getOffset() - prefix.length(), prefix.length());
public class SQLTemplatesPage extends AbstractTemplatesPage {
        return SQLTemplatesRegistry.getInstance().getTemplateContextRegistry();
    protected IPreferenceStore getTemplatePreferenceStore()
     *
    }
import org.jkiss.dbeaver.model.connection.DBPDriver;
}
        this.sqlEditor = sqlEditor;
        viewer.configure(configuration);
                String prefix = getIdentifierPart(document, template, textSelection.getOffset(), textSelection.getLength());
            ((ITextViewerExtension) viewer).getRewriteTarget().beginCompoundChange();
        return false;
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.FILL_VERTICAL);
    }
    private static final String PREFERENCE_PAGE_ID = "org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplatesPage"; //$NON-NLS-1$
     * @return an array of valid context id
    @Override
    /**
        if (!isValidTemplate(document, template, textSelection.getOffset(), textSelection.getLength()))
/*
        proposal.apply(sqlEditor.getViewer(), ' ', 0, region.getOffset());
     * @param length   the length
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        /*
            document,
     *
import org.jkiss.dbeaver.Log;
        //FIXME: reconciling is turned off here because it's a cause of deadlocks and severe UI glitches. The exact cause is unknown, find a more precise solution. [dbeaver/dbeaver#11452]
        context.setVariable(GlobalTemplateVariables.SELECTION, savedText);
    /**
        String start = ""; //$NON-NLS-1$
            log.debug(e);
import org.eclipse.jface.text.templates.DocumentTemplateContext;
    {
    {
    @Override
           * The Editor checks whether a completion for a word exists before it allows for the template to be
                driver = dataSource.getContainer().getDriver();
            return;

     * needed because the Dropping of a template is more lenient than ctl-space invoked code assist.
     *
    {
                return;
     * Create a new AbstractTemplatesPage for the JavaEditor

        return !Character.isWhitespace(ch) && ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != ';';
     * @param template the template
        }
        if (driver == null) {
    protected boolean isValidTemplate(IDocument document, Template template, int offset, int length)
import org.jkiss.dbeaver.ui.ProxyPageSite;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorSourceViewer;
           * Another advantage by this method is that the template replaces the selected text provided the
    /**
    private boolean isTemplateNamePart(char ch)
        DBPDriver driver = null;
            getContextTypeRegistry().getContextType(template.getContextTypeId()),
            ((ITextViewerExtension) viewer).getRewriteTarget().endCompoundChange();
        viewer.setDocument(document);
        if (template == null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                parent, null, null, false, SWT.V_SCROLL | SWT.H_SCROLL,
    /**
    {
     *
        return new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore());
        } else {
import org.eclipse.swt.widgets.Control;
        if (selection != null) {
    @Override
import org.eclipse.swt.layout.GridData;
                DBWorkbench.getPlatform()::getPreferenceStore, sqlEditor
        int offset = context.getCompletionOffset();
     * Undo manager - begin a compound change
        for (String contextId : contextIds) {
import org.eclipse.swt.graphics.Image;
     * @param context  the template context
     */
        final Point selection = proposal.getSelection(document);
import org.eclipse.jface.text.*;
     * Check whether the template is allowed even though the context can't evaluate it. This is
        String savedText;
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
     * @param document the document
    }
     */
        return getContext(document, template, offset, length).getKey();
import org.eclipse.jface.text.source.ISourceViewer;
     */
    }
    @Override

        viewer.setEditable(false);
     * Get the active contexts for the given position in the document.


 * distributed under the License is distributed on an "AS IS" BASIS,
                }
     * @param offset   the offset
    {
                if (prefix.length() > 0) {
            return;
        beginCompoundChange(contextViewer);
    {
    private SQLContext getContext(IDocument document, Template template, final int offset, int length)
            if (dataSource != null) {

                    return;
    }
/**
     * @param template the template
 * You may obtain a copy of the License at
        return viewer;
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void updatePatternViewer(Template template)
        if (viewer instanceof ITextViewerExtension)
 *
    {
            getPatternViewer().getDocument().set(""); //$NON-NLS-1$
        }
        getPatternViewer().setDocument(doc, startLen, doc.getLength() - startLen);
        //String contextId = template.getContextTypeId();
        }
    {
           * applied. We pickup the current text at the selection position and replace it with the first char
     * @param ch the character
            endCompoundChange(contextViewer);
        return PREFERENCE_PAGE_ID;
            }
        }
    /**
    }
     * @param document the document
                driver = dsContainer.getDriver();

            sqlEditor.getViewer().revealRange(selection.x, selection.y);
    @Override
                SQLContextTypeDriver.getTypeId(driver)};
    {
                return context.canEvaluate(template) || isTemplateAllowed(context, template);
                DocumentTemplateContext context = getContext(document, template, offset, length);
     * @param viewer the viewer
    private String getIdentifierPart(IDocument document, Template template, int offset, int length)
        );
     * @return the identifier part the Java identifier
     */
    {
        if (sqlEditor instanceof SQLEditor) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            DBPDataSource dataSource = sqlEditor.getDataSource();

        viewer.setEditable(false);

            return template != null && offset > 0 && !isTemplateNamePart(context.getDocument().getChar(offset - 1));
        } catch (BadLocationException e) {
                    textSelection = (ITextSelection) contextViewer.getSelectionProvider().getSelection();
    public void insertTemplate(Template template, IDocument document)
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;

        endCompoundChange(contextViewer);
        if (driver == null) {
     * Checks whether the character is a valid character in Java template names
     *
    {
            }


            return new String[]{SQLContextTypeBase.ID_SQL};
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorSourceViewerConfiguration;

 * See the License for the specific language governing permissions and
        try {
 * Unless required by applicable law or agreed to in writing, software
                }
            sqlEditor.getViewer().setSelectedRange(selection.x, selection.y);
           * of the template name for this to succeed.
    }
    @Override
     * @param template the template
     *
        }


        SQLEditorSourceViewerConfiguration configuration = new SQLEditorSourceViewerConfiguration(sqlEditor, EditorsPlugin.getDefault().getPreferenceStore(), null);
                document.replace(textSelection.getOffset(), 1, savedText);
        doc.set(start + template.getPattern());
        Region region = new Region(textSelection.getOffset(), 0);
     */
        return new SQLContext(
    }
 * DBeaver - Universal Database Manager
     */
import org.eclipse.swt.widgets.Composite;
    private void endCompoundChange(ISourceViewer viewer)
        return SQLTemplatesRegistry.getInstance().getTemplateStore();
import org.eclipse.jface.preference.IPreferenceStore;
     */
     * Get the Java identifier terminated at the given offset
import org.eclipse.jface.text.templates.ContextTypeRegistry;
    }
            if (dsContainer != null) {
import org.eclipse.swt.SWT;

            if (contextId.equals(template.getContextTypeId())) {
    private static final Log log = Log.getLog(SQLTemplatesPage.class);
     * @return true if the template is allowed
 * you may not use this file except in compliance with the License.

            if (savedText.length() == 0) {
            savedText = document.get(textSelection.getOffset(), textSelection.getLength());
        IPageSite ps = new ProxyPageSite(sqlEditor.getSite());
    {
            return new String[]{
     *
        sqlEditor.getSite().getPage().activate(sqlEditor);
        if (context.getKey().length() == 0) {
    public SQLTemplatesPage(final SQLEditorBase sqlEditor)
        contextViewer.getSelectionProvider().setSelection(textSelection);

    /**
        String[] contextIds = getContextTypeIds(document, offset);
     * @param viewer the viewer
    }
        IDocument doc = getPatternViewer().getDocument();
            sqlEditor);
    /**
        control.setLayoutData(data);
           */
import org.eclipse.ui.texteditor.templates.AbstractTemplatesPage;
        SQLContext context = getContext(document, template, textSelection.getOffset(), textSelection.getLength());
            }
        return DBeaverIcons.getImage(DBIcon.TREE_SCRIPT);
     * @param document the document

        ISourceViewer contextViewer = sqlEditor.getViewer();
    }
    {
        IDocument document = new Document();
import org.jkiss.dbeaver.ui.DBeaverIcons;
    }
import org.eclipse.jface.text.templates.persistence.TemplateStore;
     * @param offset   the offset
 *
     * @param sqlEditor the java editor

    @Override
    }
    }
 * limitations under the License.
        init(ps);
import org.eclipse.jface.text.templates.Template;
        } catch (BadLocationException e) {

import org.eclipse.ui.part.IPageSite;
            DBPDataSourceContainer dsContainer = ((SQLEditor) sqlEditor).getDataSourceContainer();
    }
     */
    public TemplateStore getTemplateStore()

    private SQLEditorBase sqlEditor;
                if (prefix.length() > 0 && !template.getName().startsWith(prefix)) {
        return false;
     * Get context
import org.eclipse.jface.text.templates.GlobalTemplateVariables;
        ITextSelection textSelection = (ITextSelection) contextViewer.getSelectionProvider().getSelection();
     *
        int startLen = start.length();

        SQLTemplateCompletionProposal proposal = new SQLTemplateCompletionProposal(template, context, region, null);
    @Override
            } catch (BadLocationException e) {
 * The templates page for the SQL editor.

            }

    protected SourceViewer createPatternViewer(Composite parent) {
            return;
        super(sqlEditor, sqlEditor.getViewer());
                endCompoundChange(contextViewer);

    private void beginCompoundChange(ISourceViewer viewer)
            document.replace(textSelection.getOffset(), textSelection.getLength(), template.getName().substring(0, 1));
        }
        Control control = viewer.getControl();
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
        textSelection = new TextSelection(textSelection.getOffset(), 1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        //Position position = new Position(textSelection.getOffset() + 1, 0);
        }
                SQLContextTypeProvider.getTypeId(driver.getProviderId()),
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return the context

import org.eclipse.swt.graphics.Point;
    private boolean isTemplateAllowed(DocumentTemplateContext context, Template template)
package org.jkiss.dbeaver.ui.editors.sql.templates;
            try {
    {
        if (!sqlEditor.validateEditorInputState())
     * @param offset   the offset
                SQLContextTypeBase.ID_SQL,

           * selection by itself is not used in the template pattern.
        }
    protected String[] getContextTypeIds(IDocument document, int offset) {
        try {
    /**
    }
     * @param length   the length
     * Undo manager - end compound change
import org.jkiss.dbeaver.model.DBPDataSource;

            return;
    @Override
            }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        if (viewer instanceof ITextViewerExtension)
    protected String getPreferencePageId()
     * @return <code>true</code> if the character is part of a template name
 */
    {
    @Override
        SQLEditorSourceViewer viewer = new SQLEditorSourceViewer(
import org.eclipse.jface.text.source.SourceViewer;
        }
            new Position(offset, length),
