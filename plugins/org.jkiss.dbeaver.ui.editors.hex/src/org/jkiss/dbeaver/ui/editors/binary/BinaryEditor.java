            // no IFile for files outside of workspace (hex editor temporary files for example)
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_DELETE);
        manager.add(new EditorAction(IWorkbenchCommandConstants.EDIT_PASTE, BinaryEditorMessages.dialog_find_replace_paste));
 *
        manager.add(new Separator());
    public void init(IEditorSite site, final IEditorInput input)

                    // To avoid rewriting a big chunk of the editor, let's just pass a buffer instead.
 * limitations under the License.

                    }
    public ISelection getSelection()
        createEditorAction(bars, ITextEditorActionConstants.GOTO_LINE);
    class EditorAction extends Action {
        public void run()
    {
import org.eclipse.jface.viewers.*;
        if (preferencesChangeListener != null) {

            end = startEnd[1];
        // Sync file changes
                    manager.doPaste();
        }
            startEnd = (long[]) aSelection.toArray()[1];
                    break;
                    // In such case, reading from one blocks file descriptor and the application hangs.
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_CUT);
                absolutePath = path.makeAbsolute();
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_PASTE);
        manager.add(new EditorAction(IWorkbenchCommandConstants.EDIT_UNDO, BinaryEditorMessages.dialog_find_replace_undo));
                    break;
        }
    @Override
    }
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
    /**
 * Unless required by applicable law or agreed to in writing, software
        if (action != null) action.setEnabled(lengthModifiable);
    @Override

                case IWorkbenchCommandConstants.EDIT_PASTE:
            return;
        if (delta == null) {
                public void run() {
                case ITextEditorActionDefinitionIds.LINE_GOTO:



        boolean textSelected = manager.isTextSelected();
import org.eclipse.swt.events.SelectionAdapter;
        });
        IEditorInput editorInput = getEditorInput();
                }
    {
import java.io.IOException;
            {longSelection[0], longSelection[1]});

import org.jkiss.dbeaver.utils.GeneralUtils;

import org.eclipse.ui.internal.WorkbenchMessages;
    @Override
    }
            if (HexPreferencesPage.PROP_FONT_DATA.equals(event.getProperty())) {
    }
        });
                }
                    break;
 */
      
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_REDO);
    private Set<ISelectionChangedListener> selectionListeners = null;
    }
    @Override
        boolean lengthModifiable = textSelected && !manager.isOverwriteMode();
        boolean reset = getEditorInput() != null;
    }

    {
                if (selectionListeners == null) return;
    {
        }
            manager = null;
    protected HexManager getManager()
            // but we need an editor to fill the status bar.
                case IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE:
    }
    /**



    private HexManager manager;
        manager.setMenuListener(this);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            @Override
    public boolean isSaveAsAllowed()
    }
    public void createPartControl(Composite parent)
        String actionId;
public class BinaryEditor extends EditorPart implements ISelectionProvider, IMenuListener, IResourceChangeListener {
            setPartName(systemFile.getName());
        }
        IResourceDelta delta= event.getDelta();
        setInput(input);
        if (delta.getKind() == IResourceDelta.CHANGED) {

import org.jkiss.dbeaver.ui.editors.binary.pref.HexPreferencesPage;
    }
        manager.add(new EditorAction(IWorkbenchCommandConstants.EDIT_SELECT_ALL, WorkbenchMessages.Workbench_selectAll));
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            File systemFile = absolutePath.toFile();
     */
        setSite(site);
     * Updates the status of actions: enables/disables them depending on whether there is text selected
    }
        if (action != null) action.setEnabled(lengthModifiable);
    @Override
        manager.createEditorPart(parent, editorStyle);
                    manager.doCut();

    @Override
    }
        loadBinaryContent();
     * @see WorkbenchPart#dispose()

                case IWorkbenchCommandConstants.EDIT_REDO:
        }
                manager.setContent(content, charset);
    {
    public void addSelectionChangedListener(ISelectionChangedListener listener)
        return true;
            firePropertyChange(PROP_DIRTY);
                    manager.doFind();
import java.nio.ByteBuffer;
                    manager.setDefWidth((String) event.getNewValue());

            store.removePropertyChangeListener(preferencesChangeListener);
            localPath = ((IPathEditorInput)input).getPath();
    }
    @Override
            }
        manager.addLongSelectionListener(new SelectionAdapter() {
import org.eclipse.core.resources.*;

                        longSelection[0], longSelection[1]}));
     *
            charset = ((IEncodingSupport) editorInput).getEncoding();
            }
    {
        selectionListeners.add(listener);

     * and whether inserting or overwriting. Undo/redo actions enabled/disabled as well.
            }
                @Override
    }
        }
import org.eclipse.swt.events.SelectionEvent;
    public void setSelection(ISelection selection)
        return manager.isDirty();
            end = startEnd[0];
            // when opening an external file the workbench (Eclipse 3.1) calls HexEditorActionBarContributor.
        } else if (editorInput instanceof IPathEditorInput) {
        }
            editorStyle = SWT.READ_ONLY;
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE);
        }
            super(text);
    public void doSaveAs()
 * you may not use this file except in compliance with the License.
            }

        action = bars.getGlobalActionHandler(IWorkbenchCommandConstants.EDIT_REDO);
        bars.updateActionBars();

        bars.updateActionBars();
            // Save to file
 *
    }
/*
    {
    }
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_COPY);
                } else {
 *
     */
                if (RuntimeUtils.isLinux() || RuntimeUtils.isMacOS()) {

    }
    @Override
            if (HexPreferencesPage.PROP_DEF_WIDTH.equals(event.getProperty())) {
        parent.setLayout(fillLayout);

            loadBinaryContent();
            return;
        {
            switch (actionId) {
import org.eclipse.swt.SWT;
            if (startEnd.length > 1) {


    {
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
            if (file != null) {
        manager.setDefWidth(HexPreferencesPage.getDefaultWidth());
        IAction action = bars.getGlobalActionHandler(IWorkbenchCommandConstants.EDIT_UNDO);
        if (absolutePath != null) {

            public void widgetSelected(SelectionEvent e)
        }
    {
    public void dispose()
    private DBPPreferenceListener preferencesChangeListener = null;
            throw new PartInitException("Editor Input is not a file");
        int editorStyle = SWT.NONE;
        }
                    break;
        if (action != null) action.setEnabled(manager.canUndo());
                    manager.doUndo();
        if (storage != null && storage.isReadOnly()) {

import org.eclipse.core.runtime.IProgressMonitor;
        }
                manager.getContent().get(systemFile);
        if (selection.isEmpty()) return;

 * See the License for the specific language governing permissions and
import java.util.HashSet;
     */
        IPath absolutePath = null;
            } catch (IOException e) {
                    break;
                ResourceUtils.syncFile(RuntimeUtils.makeMonitor(monitor), file);
            // Refresh editor
        EditorAction(String id)


            systemFile = ((IPathEditorInput) editorInput).getPath().toFile();
        manager.setSelection(start, end);
        action = bars.getGlobalActionHandler(IWorkbenchCommandConstants.EDIT_DELETE);
        } else {
            manager.dispose();
    {
        action = bars.getGlobalActionHandler(IWorkbenchCommandConstants.EDIT_COPY);

        IEditorInput input = getEditorInput();


            // Sync workspace-related file changes
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
            return;
    @Override
        IPath localPath = null;
        localPath = ResourceUtils.convertPathToWorkspacePath(localPath);
    @Override
    {
        IEditorInput editorInput = getEditorInput();
        store.addPropertyChangeListener(preferencesChangeListener);
            site.setSelectionProvider(this);
        // Register any global actions with the site's IActionBars.
        manager = new HexManager();
            }
            UIUtils.asyncExec(new Runnable() {

    {
        IActionBars bars = getEditorSite().getActionBars();
import org.eclipse.ui.part.EditorPart;
            setActionDefinitionId(actionId);
import java.nio.file.Files;
        IActionBars bars = getEditorSite().getActionBars();
        manager.add(new EditorAction(IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE, BinaryEditorMessages.dialog_find_replace_find_replace));
        if (selectionListeners != null) {

            });
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.File;
    {
            DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                    break;
 * You may obtain a copy of the License at
            actionId = id;
        preferencesChangeListener = event -> {
        long[] longSelection = manager.getSelection();
        EditorAction(String actionId, String text)
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public BinaryEditor()
    /**
    public void setFocus()
    public void updateActionsStatus()
        if (editorInput instanceof IEncodingSupport) {
        }

        }
            }
        }
        if (manager != null) {
                log.error("Can't open binary content", e);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
     * Removes preferences-changed listener
    @Override
    private void loadBinaryContent()
        if (systemFile != null) {
                case IWorkbenchCommandConstants.EDIT_CUT:
        if (aSelection.size() > 1) {
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
import org.jkiss.dbeaver.ui.editors.binary.internal.BinaryEditorMessages;
import java.util.Set;
import org.eclipse.swt.layout.FillLayout;
    @Override
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);

            catch (IOException e) {


            return;
     * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
        if (localPath == null) {
        FillLayout fillLayout = new FillLayout();
        if (listener == null) return;
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_UNDO);
        File systemFile = null;
        @Override
        }

        StructuredSelection aSelection = (StructuredSelection) selection;
                    content.insert(ByteBuffer.wrap(Files.readAllBytes(systemFile.toPath())), 0);
                case IWorkbenchCommandConstants.EDIT_DELETE:
                    manager.doSelectAll();
    }
import org.jkiss.dbeaver.utils.ResourceUtils;
                    manager.doDelete();
    public boolean isDirty()


        IStorage storage = EditorUtils.getStorageFromInput(getEditorInput());
import org.eclipse.jface.action.*;
    {
            return adapter.cast(manager);
import org.eclipse.ui.*;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.dispose();
import org.eclipse.ui.part.WorkbenchPart;
                SelectionChangedEvent event = new SelectionChangedEvent(
                manager.setTextFont((FontData) event.getNewValue());

    @Override

        long end = start;
        if (editorInput instanceof IPathEditorInput) {
        } else if (HexManager.class.isAssignableFrom(adapter)) {
                    break;
        bars.setGlobalActionHandler(id, new EditorAction(id));
import org.eclipse.core.runtime.IPath;
     */
            }
                for (ISelectionChangedListener selectionListener : selectionListeners) {

                    break;
        return manager;
                    BinaryEditor.this,

    @Override

        delta = delta.findMember(localPath);
                    content = new BinaryContent(systemFile);
                    break;
        return new StructuredSelection(new Object[]
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
        if (localPath == null) {


    {
                long[] longSelection = HexEditControl.getLongSelection(e);
}
            return adapter.cast(manager.getContent());
        manager.addListener(event -> {
    @Override
    }
import org.eclipse.swt.widgets.Composite;
        {

                log.error("Can't save binary content", e);
        if (!(input instanceof IPathEditorInput)) {
        manager.add(new EditorAction(IWorkbenchCommandConstants.EDIT_REDO, BinaryEditorMessages.dialog_find_replace_redo));
    private void createEditorAction(IActionBars bars, String id)
            {
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.editors.EditorUtils;

    }
                    content = new BinaryContent();
            absolutePath = file.getLocation();
        if (startEnd.length > 1) {
        if (input instanceof IPathEditorInput) {
        IFile file = EditorUtils.getFileFromInput(editorInput);
                case IWorkbenchCommandConstants.EDIT_SELECT_ALL:
        if (delta == null) {
                final BinaryContent content;
    }
                    selectionListener.selectionChanged(event);
        manager.add(new EditorAction(IWorkbenchCommandConstants.EDIT_COPY, BinaryEditorMessages.dialog_find_replace_copy));
            try {

        if (reset) {
    }
        manager.setTextFont(HexPreferencesPage.getPrefFontData());

        String charset = GeneralUtils.UTF8_ENCODING;
                end = startEnd[1];
    {
                        loadBinaryContent();
    public void removeSelectionChangedListener(ISelectionChangedListener listener)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void resourceChanged(IResourceChangeEvent event)
package org.jkiss.dbeaver.ui.editors.binary;
    private static final Log log = Log.getLog(HexEditControl.class);
    public <T> T getAdapter(Class<T> adapter)
        }
    /**
    }

import org.eclipse.swt.graphics.FontData;
        super();
                    manager.doRedo();
                    // The implementation of hex editor may have two RandomAccessFile at the same time.
        if (selectionListeners == null) {
            IPath path = ((IPathEditorInput)editorInput).getPath();
        }
            }
        } else {
                    manager.doCopy();
import org.jkiss.dbeaver.Log;
        if (action != null) action.setEnabled(manager.canRedo());
    {
            // MyStatusLineContributionItem.fill() before HexEditorActionBarContributor.setActiveEditor()
                    manager.doGoTo();
    public void menuAboutToShow(IMenuManager manager)
        long start = startEnd[0];


            ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
        throws PartInitException
            this.actionId = actionId;
                }
            selectionListeners = new HashSet<>();
    {
        }
        if (BinaryContent.class.isAssignableFrom(adapter)) {
                    if (manager != null) {
        if (file != null) {


    {
                case IWorkbenchCommandConstants.EDIT_UNDO:
        };
        {
        manager.add(new EditorAction(ITextEditorActionDefinitionIds.LINE_GOTO, BinaryEditorMessages.dialog_find_replace_goto_line));
        action = bars.getGlobalActionHandler(IWorkbenchCommandConstants.EDIT_CUT);
        long[] startEnd = (long[]) aSelection.getFirstElement();
    public void doSave(IProgressMonitor monitor)
            try {
                case IWorkbenchCommandConstants.EDIT_COPY:
        if (action != null) action.setEnabled(textSelected);
        createEditorAction(bars, IWorkbenchCommandConstants.EDIT_SELECT_ALL);
            return super.getAdapter(adapter);
import org.eclipse.ui.editors.text.IEncodingSupport;

            if (path != null) {
        }

            updateActionsStatus();
            selectionListeners.remove(listener);
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
        }
        }

                    new StructuredSelection(new Object[]{
            setActionDefinitionId(actionId);
            }

