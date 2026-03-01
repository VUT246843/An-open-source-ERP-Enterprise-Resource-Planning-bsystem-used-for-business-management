    @Override
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
            IValueController valueController = getValueController();
    }
    public void createControl() {

            (delta.getFlags() & IResourceDelta.CONTENT) != 0)
    {
                                    switch (matchType) {
    public Control getControl()
                                        defaultPart = editorPart;

                if (dirtyPart != null) {
                                            break;
    private boolean partsLoaded;
                    e.getTargetException());
        return false;
                // Check for dirty parts

                } else {
    public boolean isSaveAsAllowed()
import org.eclipse.swt.widgets.Control;
    public RefreshResult refreshPart(Object source, boolean force) {
    @Override
import org.jkiss.dbeaver.ui.data.registry.ValueManagerRegistry;
            this.value = valueController.getValue();
            assert valueController != null;
        }
    }
                    // Multiple parts modified - need to choose one
    }
                // Activate owner editor and focus on cell corresponding to this content editor
    @Override

        fireContentChanged();
                }
                    if (partInfo.activated && partInfo.editorPart.isDirty()) {
        ContentEditorInput editorInput;
    static class ContentPartInfo {

            try {
        editorPanel.setLayout(layout);
                editorInput.getValueController().updateValue(editorInput.getValue(), true);
    private boolean saveInProgress;
                                            break;
                }
        layout.marginHeight = 0;
                                        default:
        layout.marginHeight = 0;
            this.valueController = valueController;
        }
        return valueController == null? null : valueController.getValue();
/*
    private List<ContentPartInfo> contentParts = new ArrayList<>();
        // Save data to file
                    }
    }


        }
            if (contentPart.activated && contentPart.editorPart.isDirty()) {
    @Override
*/
                                    if (setDefault) {
        private ContentPartInfo(IEditorPart editorPart, boolean isDefault) {
    @Override

import org.jkiss.dbeaver.ui.editors.MultiPageAbstractEditor;

    public Object extractEditorValue() throws DBException

        layout.verticalSpacing = 0;
        return activePage < 0 ? null : getControl(activePage);
import org.eclipse.swt.SWT;

        }
    void toggleInfoBar()
 * Unless required by applicable law or agreed to in writing, software
                        }
import org.jkiss.dbeaver.ui.controls.ColumnInfoPanel;
                        monitor.done();
        catch (InvocationTargetException e) {
    }
            if (workbenchPage != null) {
    }
        if (delta == null) {
        return input == null ? null : input.getValueController();
                        ((EntityEditor) parentEditor).setActiveEditor(IEntityDataEditor.class);
        panel.setLayout(layout);
                    } finally {
        ContentEditorInput input = getEditorInput();

/*
}    }
 * You may obtain a copy of the License at
        {
            try {
    public void dispose()
                    throw new InvocationTargetException(e);
    }
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
                                log.error(e);
        @Override
            //valueController.getValueSite().getWorkbenchWindow().run(true, true, initializer);

        }
            editorInput = initializer.editorInput;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    // No modified parts - no additional save required
    }
        boolean isDefault;
        super.createPages();

import org.jkiss.dbeaver.ui.data.registry.StreamValueManagerDescriptor;
        throws PartInitException

            // Content was changed somehow so mark editor as dirty
        if (saveFile == null) {
                    editorInput = new ContentEditorInput(
    }
                }
            log.error("Can't open CONTENT editorPart", e);
    protected Composite createPageContainer(Composite parent)
                        defaultPart,
        this.getEditorSite().getWorkbenchWindow().getActivePage().activate(this);
    protected void createPages() {
 *
import org.jkiss.dbeaver.Log;

        ContentEditorInput input = getEditorInput();
                log.error(e);
                        valueController.getValueType().getDataKind() == DBPDataKind.BINARY)
    @Override
    public boolean isDirty()
                    parentEditor = ((MultiPageEditorSite) parentEditorSite).getMultiPageEditor();
            this.editorParts = editorParts;
            IEditorPart editorPart = contentPart.editorPart;
    {
 * See the License for the specific language governing permissions and
                    parentEditor = parentEditorSite.getPart();
        getEditorInput().refreshContentParts(source);
                                        defaultMatch = matchType;
            }
        {
    public void removePage(int pageIndex) {
            panel.setLayoutData(new GridData(GridData.FILL_BOTH));
                IWorkbenchPart parentEditor;

    @Override
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        IValueController valueController = getValueController();
                getEditorInput().release();

        layout.horizontalSpacing = 0;
            try {

                for (ContentPartInfo partInfo : contentParts) {
    @Override

        // Don't return active page because container may be already disposed (#2805)

import java.util.ArrayList;
        delta = delta.findMember(ContentUtils.convertPathToWorkspacePath(getEditorInput().getPath()));
        GridLayout layout = new GridLayout(1, false);
            try {
        }
    {
        IResourceDelta delta= event.getDelta();
                                        case DEFAULT:
                @Override
    @Override
import org.eclipse.core.runtime.CoreException;
    }
        });
import org.eclipse.swt.layout.GridLayout;
            } catch (DBException e) {
        } else {
                ContentEditor.class.getName());
                    if (parentEditor instanceof EntityEditor) {
        final File saveFile = DialogUtils.selectFileForSave(shell, getPartName());
import org.eclipse.core.runtime.IProgressMonitor;
                catch (CoreException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
                        for (Map.Entry<StreamValueManagerDescriptor, IStreamValueManager.MatchType> entry : streamManagers.entrySet()) {
        IValueController valueController = input.getValueController();
        return new ContentEditorSite(this, editor);
    public void closeValueEditor()

            }
                if (editorInput == null) {
 * you may not use this file except in compliance with the License.
        return super.getContainer();
        IEditorPart editorPart;

                        TextStreamValueManager valueManager = new TextStreamValueManager();

        for (ContentPartInfo contentPart : contentParts) {
    }
    private ColumnInfoPanel infoPanel;
                        "Can't save content",
import org.jkiss.dbeaver.model.data.DBDContent;
            UIUtils.runInProgressService(initializer);
            infoPanel.layoutProperties();

    public void primeEditorValue(@Nullable Object value) throws DBException
                editorInput.updateContentFromFile(new DefaultProgressMonitor(monitor), editorInput.getValue());
import org.jkiss.dbeaver.model.DBPDataKind;
            }
                UIUtils.asyncExec(() -> parentEditorSite.getWorkbenchWindow().getActivePage().activate(parentEditor));
                }
import org.jkiss.code.Nullable;

                log.warn("Error releasing CONTENT input", e);
            });
            }
    public ContentEditorInput getEditorInput()

                                    }
        IWorkbenchWindow workbenchWindow = this.getEditorSite().getWorkbenchWindow();
                    "Can't save content to database",
                IEditorPart dirtyPart = null;
import org.jkiss.dbeaver.DBException;
        if (dirty) {
                                    }
 * limitations under the License.
    {
*/
    @Override
                contentPart.activated = true;
        if (getEditorInput() != null) {

        }
        if (!partsLoaded || saveInProgress) {
                //editorPart.init(site, input);
                public void run() {
        IEditorPart[] editorParts = getEditorInput().getEditors();
    @Override
            }
        SashForm panel = UIUtils.createPartDivider(this, parent, SWT.VERTICAL);
        UIUtils.runInUI(monitor -> {
import java.io.File;
                }
        {
                                            break;
                throw new InvocationTargetException(e);
                e = ((InvocationTargetException)e).getTargetException();
    @Nullable

    }
        for (ContentPartInfo contentPart : contentParts) {
    @Override
 * DBeaver - Universal Database Manager
                        DBDContent content = (DBDContent) value;
 *
                // Set dirty flag - if error will occur during content save
        return (ContentEditorInput)super.getEditorInput();
        // Return container control
    public boolean isReadOnly() {
                    }
            LOBInitializer initializer = new LOBInitializer(valueController);
                contentPart.index--;
        layout.marginWidth = 0;
    {

        boolean activated;
                                parts.add(editorPart);
                    // Single part modified - save it
        } catch (Throwable e) {
        }
            setActiveEditor(defaultPage.editorPart);
            try {
            sashForm.setMaximizedControl(null);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
        this.partsLoaded = true;
    }
                        parts.add(defaultPart);
            DBWorkbench.getPlatformUI().showError("Cannot open content editor", null, e);
    }

                workbenchPage.closeEditor(this, false);
    @Override
                DBWorkbench.getPlatformUI().showError(
import org.eclipse.swt.layout.GridData;
                    editorPart == getEditorInput().getDefaultEditor()
                    editorParts = parts.toArray(new IEditorPart[0]);

import org.jkiss.dbeaver.ui.data.managers.stream.TextStreamValueManager;
    @Override
        panel.setMaximizedControl(editorPanel);
                            try {
        if (!isDirty()) {
    public void fireContentChanged() {
                contentParts.add(new ContentPartInfo(
                setPageText(index, editorPart.getTitle());
                if (parentEditorSite instanceof MultiPageEditorSite) {
                IWorkbenchPartSite parentEditorSite = editorInput.getValueController().getValueSite();


        layout.horizontalSpacing = 0;
                    {
        } catch (InterruptedException e) {
                                    defaultPart = editorPart;
        }
        {
*/
            // do nothing
    {
        }
    {
    {
            this.defaultPart = defaultPart;

    }
    @Override
    public void doSave(final IProgressMonitor monitor)
package org.jkiss.dbeaver.ui.editors.content;
import org.eclipse.ui.*;
 *
import java.lang.reflect.InvocationTargetException;
                            IStreamValueManager streamValueManager = entry.getKey().getInstance();
        // Fill nested editorParts info

import java.util.Map;
        if (delta == null) {

                                }

public class ContentEditor extends MultiPageAbstractEditor implements IValueEditorStandalone, IRefreshablePart
    public static ContentEditor openEditor(IValueController valueController)
                } else {
/*
    }
            }

                        saveInProgress = false;
        try {
    @Override

        }
    }
                    getEditorInput().saveToExternalFile(saveFile, monitor);
                contentPart.index = -1;
        } catch (InvocationTargetException e) {
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException
        private LOBInitializer(IValueController valueController, IEditorPart[] editorParts, IEditorPart defaultPart, @Nullable ContentEditorInput editorInput)
        if (visible) {
                    firePropertyChange(PROP_DIRTY);
    //public static final long MAX_IMAGE_LENGTH = 10 * 1024 * 1024;
        if (workbenchWindow != null) {
            return;
            return;

            for (IEditorPart editorPart : editorParts) {
                        dirtyPart.doSave(monitor);
                                    defaultMatch = matchType;
    {
                        dirtyParts.add(partInfo.editorPart);
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
            this.valueController = valueController;
        try {
        return true;

                    e);
                    "Can't save content to file '" + saveFile.getAbsolutePath() + "'",
/*
            DBeaverUI.asyncExec(new Runnable() {
            IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
    }
                        valueController.getValueType().getDataKind() == DBPDataKind.CONTENT ||
        });
                                IEditorPart editorPart = streamValueManager.createEditorPart(valueController);

                return true;
import org.jkiss.code.NotNull;
            }

                try {
        }
        Composite editorPanel = new Composite(panel, SWT.NONE);

        public LOBInitializer(IValueController valueController) {
        catch (PartInitException e) {
                ));
    @Override
        catch (InterruptedException e) {
                ContentEditorInput editorInput = getEditorInput();
*/
import org.eclipse.swt.widgets.Shell;
            gd.exclude = true;
        if (defaultPage != null) {
        for (ContentPartInfo contentPart : contentParts) {

                // then document remains dirty
import org.jkiss.dbeaver.ui.data.IValueController;

    private static final Log log = Log.getLog(ContentEditor.class);
                                    boolean setDefault = false;
            infoPanel.setLayoutData(gd);
        int activePage = getActivePage();
    }
            DBWorkbench.getPlatformUI().showError("Cannot refresh content editor", null, e);
            if (contentPart.isDefault) {
    public void setDirty(boolean dirty) {
        }
        if (delta.getKind() == IResourceDelta.CHANGED &&
    }
        if (editorParts != null) {
            }
                    if (value instanceof String || valueController.getValueType().getDataKind() == DBPDataKind.STRING) {
            this.editorPart = editorPart;
    {
        }
        boolean visible = sashForm.getMaximizedControl() == null;
                                            setDefault = (defaultMatch == IStreamValueManager.MatchType.APPLIES);
                    saveInProgress = true;
/*
                throw new InvocationTargetException(e);
                                } else {
            }
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                }
    public IValueController getValueController()
                            }
import org.jkiss.dbeaver.ui.data.IValueEditorStandalone;
    public void doSaveAs()
        }

                int index = addPage(editorPart, getEditorInput());
        }
            this.editorInput = editorInput;
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return (ContentEditor) valueController.getValueSite().getWorkbenchWindow().getActivePage().openEditor(
        }
    {
            getSite().getWorkbenchWindow().run(true, true, monitor -> {
    }
{


                            ValueManagerRegistry.getInstance().getApplicableStreamManagers(monitor, valueController.getValueType(), content);
        LOBInitializer initializer = new LOBInitializer(valueController, input.getEditors(), input.getDefaultEditor(), input);
            return null;
        //ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
            return;
        UIUtils.syncExec(() -> {
    }
        this.partsLoaded = true;
        ContentEditorInput editorInput;

            //valueController.getValueSite().getWorkbenchWindow().run(true, true, initializer);
            });
        }
        // Execute save in UI thread
    @Nullable
                        valueController,
    //public static final long MAX_TEXT_LENGTH = 10 * 1024 * 1024;
        Object value;
            }
        return getEditorInput().isReadOnly();
import org.eclipse.swt.custom.SashForm;

            if (e instanceof InvocationTargetException) {
            // Release CONTENT input resources
            // No content change before all parts are loaded
        Shell shell = getSite().getShell();
                contentPart.index = index;
        ContentPartInfo defaultPage = null;
        IValueController valueController;
 */
                final List<IEditorPart> dirtyParts = new ArrayList<>();
        firePropertyChange(ContentEditor.PROP_DIRTY);
    {
    {

    public void resourceChanged(IResourceChangeEvent event)
 */
        try {
    }
            return true;
            infoPanel = new ColumnInfoPanel(panel, SWT.NONE, valueController);
        editorPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
                        editorParts,
                defaultPage = contentPart;
    Object getValue()
                    dirtyPart = dirtyParts.get(0);

        layout.marginWidth = 0;
        }
    @Override
        return getEditorInput().getValue();
            return null;
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
        super.init(site, input);
        return editorPanel;
    {
                ContentEditor.this.dirty = true;
    public ContentEditor()
        if (parent.getLayout() instanceof GridLayout) {
    }
                                        case PRIMARY:
                }
 * LOBEditor
        }
            return;
import org.jkiss.dbeaver.ui.data.IStreamValueManager;
            } catch (Throwable e) {
import org.eclipse.swt.widgets.Composite;
                        monitor);
    @Nullable
                            } catch (DBException e) {
                // Close editor
            } catch (DBException e) {
                        monitor.beginTask("Initialize stream value manager", 1);
    protected IEditorSite createSite(IEditorPart editor)
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;
            // Nothing to save
                if (dirtyParts.isEmpty()) {
                getEditorInput().updateContentFromFile(monitor, getEditorInput().getValue());
import org.eclipse.jface.action.IContributionManager;
                    } else if (value instanceof DBDContent ||
    }
                    List<IEditorPart> parts = new ArrayList<>();
            this.isDefault = isDefault;
        SashForm sashForm = (SashForm) infoPanel.getParent();
    public void showValueEditor()
    @Override
    }
import org.jkiss.dbeaver.model.exec.DBCException;

            }
        }
        this.dirty = dirty;
                    }
        return RefreshResult.REFRESHED;
                        IStreamValueManager.MatchType defaultMatch = null;
                } else if (dirtyParts.size() == 1) {
    private static class LOBInitializer implements DBRRunnableWithProgress {
                UIUtils.asyncExec(this::closeValueEditor);
    }
                                            setDefault = true;
import org.jkiss.dbeaver.ui.IRefreshablePart;
                    "Can't save content",
        }
    }
    {
        super.removePage(pageIndex);
        }
    {
        }
            UIUtils.runInProgressService(initializer);
    public void init(IEditorSite site, IEditorInput input)
                    }
                if (editorParts == null) {
        IEditorPart defaultPart;
    {
    }
    {
                editorInput,
            dirty = true;

                setPageImage(index, editorPart.getTitleImage());
                    try {
                        defaultPart = valueManager.createEditorPart(valueController);
                    editorInput.refreshContent(monitor, valueController);
        //ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
                                IStreamValueManager.MatchType matchType = entry.getValue();
            if (contentPart.index == pageIndex) {
        }
                        Map<StreamValueManagerDescriptor, IStreamValueManager.MatchType> streamManagers =
                    dirtyPart = SelectContentPartDialog.selectContentPart(getSite().getShell(), dirtyParts);
            // ignore
                                        case EXCLUSIVE:
        layout.verticalSpacing = 0;
    {
                    new ContentPagePart(editorPart),
            } else if (contentPart.index > pageIndex) {
        }
                }
        setPartName(input.getName());
                } else {
            } catch (PartInitException e) {

            } catch (Exception e) {
/**
                                if (defaultPart == null) {
            DBWorkbench.getPlatformUI().showError(
            sashForm.setMaximizedControl(sashForm.getChildren()[1]);
                }
        public int index = -1;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    private boolean dirty;

        IEditorPart[] editorParts;
        GridLayout layout = new GridLayout(1, false);
    @Override
        super.dispose();
