    public void runPostSaveCommands(@NotNull Map<String, Object> context) {
        @Override
        });

        if (documentProvider instanceof SQLObjectDocumentProvider) {
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    private SashForm editorSash;
import org.jkiss.dbeaver.ui.*;
import org.jkiss.code.Nullable;
        toolBarManager.add(ActionUtils.makeCommandContribution(getSite().getWorkbenchWindow(), SQLEditorCommands.CMD_OPEN_FILE));
        protected DBSObject getProviderObject() {
                    pageControl.activate(true);
    public IDatabaseEditorInput getDatabaseEditorInput() {
        // If so then no refresh needed (source text was updated during save)

            if (site != null) {
    @Override

    protected String getCompileCommandId() {
import org.eclipse.swt.SWT;
}
    @Override
        pageControl.setInfo(message);
            return SQLEditorNested.this.getSourceText(monitor);
    @Override
    }
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
        }

        }
            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            super(SQLEditorNested.this);
        @Override
            }
                if (pageControl != null && !pageControl.isDisposed()) {
    implements IActiveWorkbenchPart, IRefreshablePart, DBCSourceHost, IDatabasePostSaveProcessor {
        return compileLog;
            return null;
            }
        } else {
            ((SQLObjectDocumentProvider) documentProvider).setSourceText(null);

            editorControl = editorSash.getChildren()[0];
import org.eclipse.ui.IWorkbenchPartSite;
            public void focusLost(FocusEvent e) {
        assert editorControl != null;
    }
            activated = true;
import org.jkiss.code.NotNull;
        }


    }
        }
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    }

        }

            reloadSyntaxRules();

            editorSash.setMaximizedControl(editorControl);
 * SQLEditorNested
            SQLEditorNested.this.setSourceText(monitor, text);
        }
        if (hasCompiler) {
    @Override
    }
    }
    }
import org.eclipse.jface.text.BadLocationException;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Composite;
 *
                if (pageControl != null && !pageControl.isDisposed()) {
            if (textViewer != null) {

                ActionUtils.runCommand(compileCommandId, getSite().getWorkbenchWindow());

            IWorkbenchPartSite site = getSite();
        }
        @Override
    }


            }
 *     http://www.apache.org/licenses/LICENSE-2.0
            return RefreshResult.IGNORED;
                DatabaseEditorUtils.contributeStandardEditorActions(site, contributionManager);
            toolBarManager.add(new Separator());
        return (T) ((IDatabaseEditorInput) editorInput).getDatabaseObject();
        public boolean isReadOnly(Object element) {
    }
        }
        if (documentProvider instanceof SQLObjectDocumentProvider) {
        compileLog.layoutLog();
            toolBarManager.add(ActionUtils.makeCommandContribution(getSite().getWorkbenchWindow(), compileCommandId));
        pageControl = new EditorPageControl(parent, SWT.SHEET);
    public T getSourceObject() {
                    pageControl.activate(false);
    @Override
 * you may not use this file except in compliance with the License.
        }
        @Override
            if (textViewer == null || textViewer.getControl().isDisposed()) {
    public void showCompileLog() {
import org.eclipse.ui.IEditorSite;
        } catch (BadLocationException e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            return getSourceObject();
import org.eclipse.swt.custom.StyledText;
            }
            return super.isReadOnly(element);

        return RefreshResult.REFRESHED;
    public void setCompileInfo(String message, boolean error) {
            // Compile after save
import org.eclipse.jface.action.Action;

        }
    @Override


    @Nullable

                showCompileLog();
        // Check if we are in saving process
    public DBCCompileLog getCompileLog() {
        if (force) {

        if (!(editorInput instanceof IDatabaseEditorInput)) {
        pageControl.setInfo("Source");

/**

import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
        }
        EditorPageControl(Composite parent, int style) {
    }
import org.eclipse.swt.events.FocusListener;
            editorSash = new SashForm(pageControl.createContentContainer(), UIUtils.checkSashStyle(SWT.VERTICAL | SWT.SMOOTH));

    @SuppressWarnings("unchecked")

                context.put(SAVE_CONTEXT_COMPILE_PARAM, true);
    @Override
    }
    }
            @Override


    }
    @Override
        saveToExternalFile();
    private ObjectCompilerLogViewer compileLog;
 */
    public void deactivatePart() {
                final IRegion lineInfo = textViewer.getDocument().getLineInformation(line - 1);
        if (compileCommandId != null) {
        if (!(editorInput instanceof IDatabaseEditorInput)) {
    public boolean isDocumentLoaded() {
        if (editorSite instanceof MultiPageEditorSite &&

    }

        return null;
    public void createPartControl(Composite parent) {


public abstract class SQLEditorNested<T extends DBSObject>
    }
                super.selectAndReveal(offset, 1);
 *
        return getDatabaseEditorInput().getPropertySource();

        toolBarManager.add(ActionUtils.makeCommandContribution(getSite().getWorkbenchWindow(), SQLEditorCommands.CMD_SAVE_FILE));
            // do nothing
        editorControl.addFocusListener(new FocusListener() {
        }

    }
            //textEditor.setFocus();
        super.editorContextMenuAboutToShow(menu);
import org.eclipse.ui.IEditorInput;
import org.jkiss.dbeaver.ui.editors.IDatabasePostSaveProcessor;

            }
 */
    public DBCExecutionContext getExecutionContext() {


        menu.add(new Separator());
    }
import java.util.Map;
        }
        try {
import org.eclipse.jface.text.TextViewer;
                // Try to keep cursor position
            editorSash.setWeights(70, 30);
        editorSash.setMaximizedControl(null);
                int caretOffset = editorControl.getCaretOffset();
        setDocumentProvider(new SourceObjectDocumentProvider());
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
        return true;
    @Override
            TextViewer textViewer = getTextViewer();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.eclipse.swt.widgets.Control;
    @Override
        return ((IDatabaseEditorInput) editorInput).getExecutionContext();
                }
        }
    private boolean activated;
            super.createPartControl(editorSash);
        }
import org.eclipse.core.runtime.IProgressMonitor;
        throws DBException;
        final IDocumentProvider documentProvider = getDocumentProvider();
    public void doSaveAs() {
        if (compileCommandId != null && context.get(SAVE_CONTEXT_COMPILE_PARAM) == null) {
                return;
    private static final String SAVE_CONTEXT_COMPILE_PARAM = "object.compiled";
        public void run() {
        }
        }
 * Unless required by applicable law or agreed to in writing, software

            log.warn(e);
    }
    public DBPPropertySource getInputPropertySource() {

import org.eclipse.swt.custom.SashForm;
            super(parent, style);
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
    @Override
import org.jkiss.dbeaver.ui.controls.ObjectCompilerLogViewer;
    public RefreshResult refreshPart(Object source, boolean force) {
                super.setInput(getEditorInput());

            } else {
            super("View compile log", DBeaverIcons.getImageDescriptor(UIIcon.COMPILE_LOG)); //$NON-NLS-2$
    private Control editorControl;
            } finally {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.jface.text.IRegion;
            super.createPartControl(pageControl.createContentContainer());
        IEditorSite editorSite = getEditorSite();
            compileLog = new ObjectCompilerLogViewer(editorSash, this, false);
        public SourceObjectDocumentProvider() {
        }
                final int offset = lineInfo.getOffset() + position - 1;
        if (!activated) {
        UIUtils.syncExec(() -> SQLEditorNested.super.doSave(progressMonitor));
        }
        }
import org.eclipse.ui.part.MultiPageEditorSite;

            contributeEditorCommands(contributionManager);
            return ((SQLObjectDocumentProvider) documentProvider).isSourceLoaded();
    @Override
        boolean hasCompiler = getCompileCommandId() != null;
        super();

 *
 * You may obtain a copy of the License at
    }
            public void focusGained(FocusEvent e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        final Control editorControl = getEditorControl();
        contributeEditorCommands(menu);
import org.eclipse.jface.action.IContributionManager;
        // Use focus to activate page control
import org.eclipse.jface.action.Separator;
    extends SQLEditorBase
        public void fillCustomActions(IContributionManager contributionManager) {
            if (editorSash.getMaximizedControl() == null) {
    public void activatePart() {
    public class ViewLogAction extends Action {
            StyledText editorControl = getEditorControl();
        @Override
        return (IDatabaseEditorInput) super.getEditorInput();

        }
import org.jkiss.dbeaver.model.struct.DBSObject;
        String compileCommandId = getCompileCommandId();
import org.jkiss.dbeaver.DBException;
        IEditorInput editorInput = getEditorInput();

    @Nullable
    }
            }
    private class SourceObjectDocumentProvider extends SQLObjectDocumentProvider {

import org.jkiss.dbeaver.model.exec.compile.DBCCompileLog;
                editorSash.setMaximizedControl(editorControl);
            toolBarManager.add(new ViewLogAction());
        String compileCommandId = getCompileCommandId();
    @Override

import org.eclipse.ui.texteditor.IDocumentProvider;


        @Override
        IEditorInput editorInput = getEditorInput();
            ((EntityEditor) ((MultiPageEditorSite) editorSite).getMultiPageEditor()).isSaveInProgress()) {
    public void editorContextMenuAboutToShow(IMenuManager menu) {

import org.jkiss.dbeaver.model.exec.compile.DBCSourceHost;
        pageControl.createOrSubstituteProgressPanel(getSite());
    @Override
        protected void saveSourceText(DBRProgressMonitor monitor, String text) throws DBException {
    private EditorPageControl pageControl;
    public SQLEditorNested() {
                if (caretOffset < editorControl.getCharCount()) {
            }
                    editorControl.setCaretOffset(caretOffset);
        // Create new or substitute progress control
    protected abstract void setSourceText(DBRProgressMonitor monitor, String sourceText);
            if (editorControl != null) {
            ((MultiPageEditorSite) editorSite).getMultiPageEditor() instanceof EntityEditor &&
        if (hasCompiler) {
    private class EditorPageControl extends ProgressPageControl {
            TextViewer textViewer = getTextViewer();

    }
                }
            return null;

    public void positionSource(int line, int position) {
        reloadSyntaxRules();
 * DBeaver - Universal Database Manager
        protected String loadSourceText(DBRProgressMonitor monitor) throws DBException {
        ViewLogAction() {
            try {
    protected abstract String getSourceText(DBRProgressMonitor monitor)
package org.jkiss.dbeaver.ui.editors.sql;
    public void doSave(final IProgressMonitor progressMonitor) {
                }
            }
import org.eclipse.swt.events.FocusEvent;
    }
    }
/*
        final IDocumentProvider documentProvider = getDocumentProvider();
import org.eclipse.jface.action.IMenuManager;
    protected void contributeEditorCommands(IContributionManager toolBarManager) {
