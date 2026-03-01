import org.eclipse.jface.operation.IRunnableWithProgress;
        super.contributeToStatusLine(statusLineManager);
                        if (contentEditor != null) {

            if (encodingCombo != null && !encodingCombo.isDisposed()) {


import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.ActionUtils;
import org.eclipse.swt.widgets.Control;
        menu.add(new Separator());
    }
            getEditor().toggleInfoBar();

                });
        FileImportAction() {
                    @Override
import org.eclipse.ui.texteditor.BasicTextEditorActionContributor;
    public void dispose() {
 * You may obtain a copy of the License at

            protected Control createControl(Composite parent) {
                });
                super.dispose();
 * Uses text editor contributor to fill status bar and menu for possible integrated text editors.
        manager.add(new ControlContribution("Encoding") {
import org.jkiss.dbeaver.ui.editors.BaseTextEditorCommands;
        }
    }
                    "Can't load content",
    @Override
    private class FileImportAction extends SimpleAction {
        textContributor = new BasicTextEditorActionContributor();

                return;
                    curCharset = getEditor().getEditorInput().getEncoding();
        manager.add(loadAction);

                encodingCombo.addSelectionListener(new SelectionAdapter() {
 *
                        final ContentEditor contentEditor = getEditor();
        super.contributeToMenu(manager);
    public void setActiveEditor(IEditorPart part) {
        textContributor.dispose();
                if (getEditor() != null) {
    private class FileExportAction extends SimpleAction {
    @Override
    private class InfoAction extends SimpleAction {
    @Override
            final File loadFile = DialogUtils.openFile(shell);
    }
            super("org.jkiss.dbeaver.lob.actions.info", "Info", "Show column information", DBIcon.TREE_INFO);
public class ContentEditorContributor extends MultiPageEditorActionBarContributor {
                            Combo combo = (Combo) e.widget;
            //setActionDefinitionId(id);
            super(IWorkbenchCommandConstants.FILE_IMPORT, "Import", "Load from File", UIIcon.LOAD);
                return;
        menu.add(saveAction);
        }
package org.jkiss.dbeaver.ui.editors.content;
        if (part != null && !(part instanceof ContentEditor)) {
    }
        }
 *
            } catch (InvocationTargetException e) {
/**
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;

        InfoAction() {
                encodingCombo = UIUtils.createEncodingCombo(parent, curCharset);
/*
                for (int i = 0; i < charsetCount; i++) {
        manager.add(infoAction);
import org.eclipse.core.runtime.IProgressMonitor;
            final ContentEditor editor = getEditor();
            super(text, DBeaverIcons.getImageDescriptor(icon));
                DBWorkbench.getPlatformUI().showError(
                IValueController valueController = editor.getValueController();
        manager.add(new Separator());
    }
                // do nothing
            return;
        menu.add(infoAction);
    }
        public void run() {
                            editor.getEditorInput().loadFromExternalFile(loadFile, monitor);
        IMenuManager editMenu = manager.findMenuUsingPath(IWorkbenchActionConstants.M_EDIT);
                        } catch (CoreException e) {
                        try {
        });

 * Content Editor contributor.
        super.dispose();
    }
 *
import org.eclipse.core.runtime.CoreException;
        menu.add(new Separator());
                }
            }
}
    /////////////////////////////////////////////////////////
                String curCharset = activeEditor.getEditorInput().getEncoding();
            }
                        }
        @Override
        FileExportAction() {
                    }
        // Execution
        public void run() {
import org.eclipse.swt.widgets.Shell;
                return encodingCombo;
    }
                    e.getTargetException());
        public abstract void run();
                        }
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
 * See the License for the specific language governing permissions and
    public abstract class SimpleAction extends Action {
    @Override
    private ContentEditor activeEditor;
        this.activeEditor = (ContentEditor) part;
import org.eclipse.swt.widgets.Combo;
        @Override
        super.init(bars, page);
        }
                    public void widgetSelected(SelectionEvent e) {
    }
                        encodingCombo.select(i);
    ContentEditor getEditor() {
    private final BasicTextEditorActionContributor textContributor;
            Shell shell = editor.getSite().getShell();
    // Actions
 * distributed under the License is distributed on an "AS IS" BASIS,
                            throw new InvocationTargetException(e);
    }
        this.textContributor.setActiveEditor(activeEditor);
        if (editMenu != null) {
        }

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
    public ContentEditorContributor() {

                encodingCombo = null;
        textContributor.contributeToMenu(manager);
        }
        @Override
    public void init(IActionBars bars) {
            }
        textContributor.init(bars);
import org.eclipse.swt.events.SelectionAdapter;
        textContributor.contributeToStatusLine(statusLineManager);

            getEditor().doSaveAs();
import org.jkiss.dbeaver.ui.data.IValueController;
import org.eclipse.swt.widgets.Composite;
            if (editor == null) {
        public void run() {
    }
import java.io.File;
                    }
            loadAction.setEnabled(!activeEditor.getEditorInput().isReadOnly());

        }

 * limitations under the License.
    public void contributeToToolBar(IToolBarManager manager) {
                editor.fireContentChanged();
    @Override
    private final IAction infoAction = new InfoAction();
                        break;
            public void dispose() {
    private final IAction loadAction = new FileImportAction();
    public void setActivePage(IEditorPart activeEditor) {
            editMenu.add(ActionUtils.makeCommandContribution(UIUtils.getActiveWorkbenchWindow(), BaseTextEditorCommands.CMD_CONTENT_FORMAT));

                editor.setDirty(true);
            @Override
                if (valueController != null) {
            super(IWorkbenchCommandConstants.FILE_EXPORT, "Export", "Save to File", UIIcon.SAVE_AS);
                    if (encodingCombo.getItem(i).equals(curCharset)) {
            } catch (InterruptedException e) {
                    @Override
    }
    public void contributeToStatusLine(IStatusLineManager statusLineManager) {
            @Override
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        }

        }
            setToolTipText(toolTip);

                        throws InvocationTargetException, InterruptedException {

        menu.add(loadAction);
        textContributor.init(bars, page);
    private final IAction saveAction = new FileExportAction();
            if (loadFile == null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *     http://www.apache.org/licenses/LICENSE-2.0
        IMenuManager menu = new MenuManager("L&OB Editor");

        SimpleAction(String id, String text, String toolTip, DBIcon icon) {

        super.setActiveEditor(part);

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
                    }
                    valueController.updateValue(editor.getValue(), true);
    @Override
                    public void run(IProgressMonitor monitor)
        //this.activePage = activeEditor;
    public void init(IActionBars bars, IWorkbenchPage page) {
        @Override

                editor.getSite().getWorkbenchWindow().run(true, true, new IRunnableWithProgress() {
                            final ContentEditorInput contentEditorInput = contentEditor.getEditorInput();
import org.jkiss.dbeaver.model.DBIcon;
            setId(id);
    @Override
        return activeEditor;
                            contentEditorInput.setEncoding(charset);
    }
import org.jkiss.dbeaver.ui.UIIcon;
        super.init(bars);

        super.contributeToToolBar(manager);
        manager.add(new Separator());
    @Override
                }
            try {
    }

                            final String charset = combo.getItem(combo.getSelectionIndex());

            }
    public void contributeToMenu(IMenuManager manager) {
import org.eclipse.jface.action.*;
            }
import org.eclipse.ui.*;
import org.eclipse.swt.events.SelectionEvent;
                String curCharset = null;

        manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
    //private IEditorPart activePage;
        }
        textContributor.contributeToToolBar(manager);
 */
    /////////////////////////////////////////////////////////
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
            }
    private Combo encodingCombo;
        manager.add(saveAction);
                encodingCombo.setToolTipText("Content Encoding");
import java.lang.reflect.InvocationTargetException;



        if (this.activeEditor != null) {
                int charsetCount = encodingCombo.getItemCount();

                    "Can't load content from file '" + loadFile.getAbsolutePath() + "'",
