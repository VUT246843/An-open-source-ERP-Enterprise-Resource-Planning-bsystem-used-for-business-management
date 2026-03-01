    @Nullable
import org.eclipse.ui.texteditor.IDocumentProvider;
                } catch (Exception e) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override

        }
import org.eclipse.jface.action.IAction;

    public static BaseTextEditor getTextEditor(IEditorPart editor)
            ac.contributeActions(menu);
        return null;
                try {
    protected void doSetInput(IEditorInput input) throws CoreException {
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
            DBWorkbench.getPlatformUI().showError(EditorsMessages.file_dialog_save_failed, null, e.getTargetException());
            if (textWidget != null && !textWidget.isDisposed()) {

        }
        }
import java.io.File;
 * you may not use this file except in compliance with the License.
        IEditorInput editorInput = getEditorInput();
import org.eclipse.swt.custom.ST;


}
        return null;
        }
        }
        IAction preferencesAction = getAction(ITextEditorActionConstants.CONTEXT_PREFERENCES);
import java.util.ArrayList;

        if (getSite() instanceof SubEditorSite) {
package org.jkiss.dbeaver.ui.editors.text;
            try {
    }


    public static final String GROUP_SQL_ADDITIONS = "sql.additions";

        super.doSetInput(input);
    {
        if (provider == null) {
        menu.add(new GroupMarker(GROUP_SQL_ADDITIONS));
                textWidget.setFocus();
    {
    protected void setFocusToTextControl() {
    }
 */
    protected void afterSaveToFile(File saveFile) {
        if (viewer != null) {
            // Commented because in fact this doesn't work. Owner editor still hooks/suppresses all extra commands
        }
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;

        menu.add(new Separator());

            return;
import org.jkiss.dbeaver.ui.editors.*;
    {
    }


 * You may obtain a copy of the License at
import org.eclipse.swt.custom.StyledText;
 * Abstract text editor.
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (isEditable()) {


    public IDocument getDocument()
import org.jkiss.code.Nullable;
            addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.COPY);
        return (SourceViewer) super.getSourceViewer();
            if (!enable) {
//    {

        if (preferencesAction != null) {
    }
                DBWorkbench.getPlatformUI().showError(
        //setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
        final IUndoManager undoManager = textViewer.getUndoManager();
        actionContributors.add(contributor);
        final File[] loadFile = DialogUtils.openFileList(getSite().getShell(), EditorsMessages.file_dialog_select_files, new String[]{"*.sql", "*.txt", "*", "*.*"});
            getTextViewer().getTextWidget().setKeyBinding(SWT.DEL, ST.DELETE_NEXT);
import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;
        final TextViewer textViewer = getTextViewer();
            IAction action= getAction(ITextEditorActionConstants.QUICK_ASSIST);
    @Nullable
        for (IActionContributor ac : actionContributors) {
    @Nullable
    public void saveToExternalFile(@Nullable String currentDirectory) {
import org.eclipse.ui.IWorkbenchActionConstants;

            if (document != null) {
            addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.CUT);

    }
            } catch (IOException e) {
            // but it blocks DEL button in nested editors
//    }
    @Nullable
//        return fScriptColumn;
import org.eclipse.swt.SWT;
import java.io.StringReader;

    public void addContextMenuContributor(IActionContributor contributor) {
            //UIUtils.enableHostEditorKeyBindingsSupport(((SubEditorSite) getSite()).getParentSite(), getTextViewer().getTextWidget());
            return;

        IEditorInput editorInput = getEditorInput();
 * Unless required by applicable law or agreed to in writing, software
    public void enableUndoManager(boolean enable)
        menu.add(new Separator(IWorkbenchActionConstants.GROUP_ADD));
import java.nio.file.Files;
public abstract class BaseTextEditor extends AbstractDecoratedTextEditor implements ISingleControlEditor {

        if (editor == null) {
    public void releaseEditorInput() {
 *

import java.util.List;
        if (loadFile == null) {
import org.eclipse.ui.IEditorInput;
import org.jkiss.dbeaver.ui.ISingleControlEditor;
            } else {
    public TextViewer getTextViewer()
    }
        String fileName = curFile == null ? null : curFile.getName();
        }
        if (editorInput instanceof IStatefulEditorInput) {
/**
        StringBuilder newContent = new StringBuilder();
import org.eclipse.core.runtime.CoreException;
    }
    public SourceViewer getViewer()
                        EditorsMessages.file_dialog_cannot_load_file + " '" + file.getAbsolutePath() + "' - " + e.getMessage());


                addAction(menu, ITextEditorActionConstants.GROUP_EDIT, ITextEditorActionConstants.QUICK_ASSIST);
import org.eclipse.jface.action.Separator;
        return false;
        menu.add(new Separator(ITextEditorActionConstants.GROUP_EDIT));
        if (editor instanceof BaseTextEditor) {
            // do nothing
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    }
    public int[] getCurrentLines()
import java.io.IOException;
        } else {
import java.lang.reflect.InvocationTargetException;
    @Override
 * Contains some common dbeaver text editor adaptions.

            }
        return provider.getDocument(getEditorInput());

        if (!CommonUtils.isEmpty(newContent)) {
    }
//        fLineColumn = null;
        try {
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
        TextViewer textViewer = getTextViewer();
            menu.appendToGroup(GROUP_SQL_PREFERENCES, preferencesAction);
import org.eclipse.jface.action.GroupMarker;
    protected boolean isNonPersistentEditor() {
import org.eclipse.jface.text.source.SourceViewer;
                document.set(newContent.toString());
            addAction(menu, ITextEditorActionConstants.GROUP_UNDO, ITextEditorActionConstants.UNDO);
    {
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
import org.eclipse.core.resources.ResourcesPlugin;

    public void dispose()
        if (undoManager != null) {

    {
            return null;
    public void createPartControl(Composite parent)
            releaseEditorInput();
                newContent.append(System.lineSeparator());

    @Override
    public StyledText getEditorControl() {
    public void loadFromExternalFile() {

        }
            DialogUtils.setCurDialogFolder(currentDirectory);
            IDocument document = getDocument();
                    ContentUtils.saveContentToFile(cr, saveFile, ResourcesPlugin.getEncoding(), monitor);

        if (input != getEditorInput()) {
import org.jkiss.dbeaver.utils.ContentUtils;
        return (TextViewer) getSourceViewer();
        saveToExternalFile(null);
                    StringReader cr = new StringReader(document.get());
        }
    {
 * DBeaver - Universal Database Manager
        if (CommonUtils.isNotEmpty(currentDirectory)) {
            // SWT.DEL shortcut is disabled in AbstractTextEditor.createNavigationActions
            addAction(menu, ITextEditorActionConstants.GROUP_SAVE, ITextEditorActionConstants.SAVE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    {
        }
    {
    {
        }
                        EditorsMessages.file_dialog_cannot_load_file,
                }
        menu.add(new Separator());

            // Disable parent text editor key-bindings
        } catch (InterruptedException e) {
            addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.COPY);
    }

        menu.add(new GroupMarker(GROUP_SQL_PREFERENCES));

            }
            }
    }
        //super.editorContextMenuAboutToShow(menu);
            UIUtils.runInProgressService(monitor -> {
            });
 *
        return getEditorInput() instanceof INonPersistentEditorInput;
            return null;
    protected boolean isReadOnly()
        afterSaveToFile(saveFile);
    protected void editorContextMenuAboutToShow(IMenuManager menu)
    }
        menu.add(new Separator());
import org.eclipse.jface.text.IUndoManager;
        }
        menu.add(new Separator(ITextEditorActionConstants.GROUP_PRINT));


        super.dispose();
    }
        menu.add(new Separator(ITextEditorActionConstants.GROUP_REST));
    }
    public static final String GROUP_SQL_EXTRAS = "sql.extras";
    {
import org.eclipse.jface.text.IDocument;
        }
    public ICommentsSupport getCommentsSupport()
        menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
import org.jkiss.dbeaver.ui.ICommentsSupport;
            }
 * See the License for the specific language governing permissions and
    public static final String TEXT_EDITOR_CONTEXT = "org.eclipse.ui.textEditorScope";
 * limitations under the License.
            addAction(menu, ITextEditorActionConstants.GROUP_COPY, ITextEditorActionConstants.PASTE);
    }
import org.eclipse.swt.widgets.Composite;
        releaseEditorInput();

    }
            }
    public static final String GROUP_SQL_PREFERENCES = "sql.preferences";
    }
    @Nullable
        } catch (InvocationTargetException e) {
        menu.add(new Separator(ITextEditorActionConstants.GROUP_COPY));

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        menu.add(new Separator(ITextEditorActionConstants.GROUP_FIND));
            if (action != null && action.isEnabled()) {

import org.jkiss.dbeaver.ui.UIUtils;
        menu.add(new GroupMarker(ITextEditorActionConstants.GROUP_SAVE));
    @Override
        }
    @Override
    public void saveToExternalFile() {
        SourceViewer viewer = getViewer();
        IDocumentProvider provider = getDocumentProvider();

 *
        }

        for (File file : loadFile) {
        menu.add(new Separator(ITextEditorActionConstants.GROUP_UNDO));
            ((IStatefulEditorInput) editorInput).release();
        File curFile = EditorUtils.getLocalFileFromInput(editorInput);
//    protected ScriptPositionColumn getScriptColumn()
                    throw new InvocationTargetException(e);
            return (BaseTextEditor) editor;

    private final List<IActionContributor> actionContributors = new ArrayList<>();
            StyledText textWidget = viewer.getTextWidget();

                undoManager.connect(textViewer);
/*
        if (document == null || saveFile == null) {
    }
            // This works when text editor is embedded in another text editor (e.g. SQL editor)
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        return editor.getAdapter(BaseTextEditor.class);
        }
                undoManager.disconnect();
        return textViewer == null ? null : textViewer.getTextWidget();
        menu.add(new GroupMarker(GROUP_SQL_EXTRAS));
        final File saveFile = DialogUtils.selectFileForSave(getSite().getShell(), EditorsMessages.file_dialog_save_as_file, new String[]{"*.sql", "*.txt", "*", "*.*"}, fileName);
import org.eclipse.jface.text.TextViewer;
    {
                newContent.append(Files.readString(file.toPath(), GeneralUtils.DEFAULT_FILE_CHARSET));
        final IDocument document = getDocument();
            // Dunno why (there is a weird explanations about bug closed in 2004)
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IEditorPart;
        super.createPartControl(parent);
