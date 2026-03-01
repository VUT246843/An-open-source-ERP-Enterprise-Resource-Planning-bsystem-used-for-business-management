                setInput(new FileEditorInput(newFile));
                    return ERDEditorStandalone.this;
import org.jkiss.dbeaver.ui.UIExecutionQueue;
            if ((IResourceDelta.MOVED_TO & delta.getFlags()) != 0) {
        }
    {
import org.eclipse.ui.IEditorInput;

                // Deleted
                public EntityDiagram evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
        if (delta.getKind() == IResourceDelta.REMOVED) {
        IResourceDelta delta= event.getDelta();

        final DiagramPart diagramPart = getDiagramPart();
 * you may not use this file except in compliance with the License.
        }
                }
    {
import org.eclipse.jface.dialogs.IDialogConstants;
                    true,
                // Renamed
                }
*/
import java.nio.file.Files;
            } else {
    @Override
        diagramLoadingJob = LoadingJob.createService(
    public DBPProject getDiagramProject() {
        } catch (Exception e) {
        DBPProject project = this.getDiagramProject();
    public DBCExecutionContext getExecutionContext()
    {
    }
                    throw new DBException("Can't determine diagram file");

        return !this.isProjectResourceEditable();
        if (isDirty()) {
        return project == null || project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
import org.eclipse.ui.IEditorSite;
            IEditorInput editorInput = getEditorInput();
import org.eclipse.swt.widgets.Composite;
            new AbstractLoadService<>("Load diagram '" + getEditorInput().getName() + "'") {
            getContentProvider(),
                if (object instanceof DBSObject) {
    public void init(IEditorSite site, IEditorInput input) throws PartInitException

    @Override
/**
        super.createActions();
                        return entityDiagram;
    }
    private EntityDiagram loadContentFromFile(DBRProgressMonitor progressMonitor)
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
        setPartName(getEditorInput().getName());
        //addEditorAction(new SaveAction(this));
                throw new DBException("Can't determine diagram file");
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * limitations under the License.
        }
    {
    }
            return;
    {
        return DBWorkbench.getPlatform().getWorkspace().getActiveProject();
 *
            {
            if (ConfirmationDialog.confirmAction(
            getCommandStack().markSaveLocation();
    @Override
    @Override
        return super.isModelEditEnabled() && this.isProjectResourceEditable();
    }

                public Object getFamily() {

 * Standalone ERD editor
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
    @Override
        super.createPartControl(parent);
import org.jkiss.dbeaver.ui.UIUtils;
            }
                return;
                null,
    /**
    }
        return null;
                    new ByteArrayInputStream(diagramState.getBytes(StandardCharsets.UTF_8)),
                UIUtils.asyncExec(() ->
            if (file != null) {
        entityDiagram.clear();
import org.jkiss.dbeaver.model.rm.RMConstants;
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IPath;
import org.jkiss.dbeaver.ui.LoadingJob;
            } catch (Exception e) {
                throw new DBException("Error loading ER diagram from '" + storage.getName() + "'", e);
    }
        super.refreshDiagram(force, refreshMetadata);
        if (storage != null) {
            final IFile file = EditorUtils.getFileFromInput(editorInput);
                setPartName(getEditorInput().getName());
            } else if (editorInput instanceof IURIEditorInput uriInput) {
    @Override
import org.jkiss.utils.CommonUtils;
                    }
    }
        }
    @Override
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
import org.jkiss.dbeaver.utils.RuntimeUtils;
    @Override
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
 * You may obtain a copy of the License at
        UIExecutionQueue.queueExec(diagramLoadingJob::schedule);
        if (delta == null) {
            null,
    public ERDEditorStandalone()
 */
     */
    {
                // file is in workspace

import org.eclipse.ui.PartInitException;
                // file is outside of workspace
        entityDiagram.setLayoutManualAllowed(true);
    /*@Override

package org.jkiss.dbeaver.ui.editors.erd.editor;
                ConfirmationDialog.QUESTION,
            {
        }
 *
import org.eclipse.ui.IURIEditorInput;
                @Override
/*
import org.jkiss.dbeaver.DBException;
                    } catch (DBException e) {
}
            getDecorator());
    {
        if (delta == null) {

            EditPart editPart = (EditPart) part;
                    getSite().getWorkbenchWindow().getActivePage().closeEditor(ERDEditorStandalone.this, false));
        diagramPart.setModel(entityDiagram);
import org.eclipse.core.filesystem.URIUtil;
            } else {
        entityDiagram.setLayoutManualDesired(true);
    public void refreshDiagram(boolean force, boolean refreshMetadata) {
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramLoader;
    @Override
    private static final Log log = Log.getLog(ERDEditorStandalone.class);
    private boolean isProjectResourceEditable() {

            }

        return entityDiagram;

            // Do not start new one while old is running
import org.jkiss.dbeaver.utils.GeneralUtils;
                    true,
    {
                    DBSObject dbObject = (DBSObject) object;
            return;
    }*/
        if (file == null) {

 *     http://www.apache.org/licenses/LICENSE-2.0
                NavigatorPreferences.CONFIRM_ENTITY_REVERT,
                file.setContents(

                    try {
import org.eclipse.core.runtime.IProgressMonitor;
            return;
                Files.write(path.toPath(), diagramState.getBytes(StandardCharsets.UTF_8));
        return EditorUtils.getFileFromInput(getEditorInput());
 * distributed under the License is distributed on an "AS IS" BASIS,
        delta = delta.findMember(file.getFullPath());
        diagramLoadingJob.addJobChangeListener(new JobChangeAdapter() {
    }
        loadDiagram(false);
        EntityDiagram entityDiagram = new EntityDiagram(
 * Unless required by applicable law or agreed to in writing, software
        });
    public void doSave(IProgressMonitor monitor)
                        throw new InvocationTargetException(e);
import org.jkiss.code.NotNull;
                @Override

public class ERDEditorStandalone extends ERDEditorPart implements IResourceChangeListener {
    public void createPartControl(Composite parent)
                        EntityDiagram entityDiagram = loadContentFromFile(monitor);
    
            },
                }
                IFile newFile = workspace.getRoot().getFile(delta.getMovedToPath());
                if (path == null) {
    {

            String diagramState = DiagramLoader.serializeDiagram(RuntimeUtils.makeMonitor(monitor), getDiagramPart(), getDiagram(), false, false);
        final IFile file = getEditorFile();
        }
        }
import org.eclipse.core.resources.*;
                getTitle()) != IDialogConstants.YES_ID)
            return DBPPlatformDesktop.getInstance().getWorkspace().getProject(resource.getProject());
    protected synchronized void loadDiagram(boolean refreshMetadata)
import org.jkiss.dbeaver.ui.editors.EditorUtils;

    @NotNull

import org.eclipse.ui.part.FileEditorInput;
    protected void createActions()
            try (final InputStreamReader isr = new InputStreamReader(storage.getContents(), GeneralUtils.UTF8_CHARSET)) {
 * DBeaver - Universal Database Manager
            DBWorkbench.getPlatformUI().showError("Save diagram", null, e);
    
                diagramLoadingJob = null;
    }
    public boolean isModelEditEnabled() {
    private IFile getEditorFile()
                final ERDObject model = (ERDObject) editPart.getModel();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.app.DBPProject;
                        visuallize(monitor, entityDiagram);
    public void resourceChanged(IResourceChangeEvent event)
        super.init(site, input);
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;

            if (editPart.getModel() instanceof ERDObject) {
                IPath path = URIUtil.toPath(uriInput.getURI());
/*
    }
 *
    public void dispose()
        for (Object part : getViewer().getSelectedEditParts()) {
        try {
    {
    }
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
 * See the License for the specific language governing permissions and


            @Override
        }
        final IFile resource = getEditorFile();
            }
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
                    return DBUtils.getDefaultContext(dbObject, true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            public void done(IJobChangeEvent event)
    {
            }
        }
import org.jkiss.dbeaver.Log;
            }
                DiagramLoader.load(progressMonitor, getDiagramProject(), diagramPart, isr);
import java.io.InputStreamReader;
            storage == null ? CommonUtils.toString(getEditorInput()) : storage.getName(),
                    monitor);
            progressControl.createLoadVisualizer());
        super.dispose();

        if (resource != null) {



    }
 */
    @Override
        IStorage storage = EditorUtils.getStorageFromInput(getEditorInput());
            return;
    }
    public boolean isReadOnly() {
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
     * No-arg constructor
            }
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
                Object object = model.getObject();
        throws DBException
    }
import java.io.ByteArrayInputStream;
        if (diagramLoadingJob != null) {
import java.nio.charset.StandardCharsets;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
