            throw new PartInitException("Cannot get file from editor input " + input);
import org.jkiss.dbeaver.ui.editors.EditorUtils;
        super.init(site, input);
        if (fileName.endsWith("." + DashboardConstants.DASHBOARD_EXT)) {

                    getSite().getWorkbenchWindow().getActivePage().closeEditor(DashboardEditorStandalone.this, false));

import org.jkiss.dbeaver.Log;
        }

        try {
    @Override
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
    }

import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
        if (delta == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * See the License for the specific language governing permissions and
    @Override
        if (control != null) {
    }
        Control control = dashboardListViewer.getControl();
        configurationList = new DashboardConfigurationList(project, file);
    }

//
        super.dispose();

            return;
    @Override
//            if (file == null) {

        setTitleImage(DBeaverIcons.getImage(DashboardIcons.DASHBOARD));
    public void doSave(IProgressMonitor monitor) {
        String fileName = getEditorInput().getName();
        IResourceDelta delta = event.getDelta();
//                new ByteArrayInputStream(diagramState.getBytes(StandardCharsets.UTF_8)),

        if (delta.getKind() == IResourceDelta.REMOVED) {
 * Unless required by applicable law or agreed to in writing, software
        getSite().setSelectionProvider(dashboardListViewer);
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        final IFile file = getEditorFile();
    public void updateStatus() {

            } else {

            control.setFocus();
                // Deleted
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }

import org.eclipse.ui.part.FileEditorInput;
    }
    private DashboardConfiguration dashboardConfig;
            }
    public DBPDataSourceContainer getDataSourceContainer() {
        delta = delta.findMember(file.getFullPath());
        dashboardListViewer = new DashboardListViewer(getSite(), this, configurationList, dashboardConfig);

        setPartName(fileName);
 */
    public DashboardListViewer getDashboardListViewer() {

        }
        }

        return RefreshResult.REFRESHED;
    private DashboardConfigurationList configurationList;
import org.eclipse.ui.IEditorInput;
    @Override
import org.jkiss.dbeaver.ui.editors.SinglePageDatabaseEditor;
//                true,
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public DashboardEditorStandalone() {
//                throw new DBException("Can't determine diagram file");
//            file.setContents(
                UIUtils.asyncExec(() ->
                setInput(new FileEditorInput(newFile));
                // Renamed
    private DashboardListViewer dashboardListViewer;
//            }
                IFile newFile = workspace.getRoot().getFile(delta.getMovedToPath());
}
        IFile file = EditorUtils.getFileFromInput(input);
    private IFile getEditorFile() {

/*
        dashboardListViewer.createDashboardsFromConfiguration();
import org.eclipse.core.runtime.IProgressMonitor;
    }
    private static final Log log = Log.getLog(DashboardEditorStandalone.class);
        return dashboardConfig;
    @Override
 *
import org.jkiss.dbeaver.ui.dashboard.control.DashboardListViewer;
    }
        if (project == null) {
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfigurationList;
/**
        }
        }
                setPartName(getEditorInput().getName());
    public RefreshResult refreshPart(Object source, boolean force) {
    }
    }
        dashboardConfig = configurationList.getDashboards().get(0);
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfiguration;
import org.jkiss.dbeaver.ui.UIUtils;

        }
 *
            DBWorkbench.getPlatformUI().showError("Save dashboard", null, e);
        }
        } catch (Exception e) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.app.DBPProject;
import org.eclipse.ui.PartInitException;
import org.jkiss.code.Nullable;
    public void resourceChanged(IResourceChangeEvent event) {
        return EditorUtils.getFileFromInput(getEditorInput());
            fileName = fileName.substring(0, fileName.length() - 1 - DashboardConstants.DASHBOARD_EXT.length());
import org.eclipse.core.resources.*;
    public void dispose() {

import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        dashboardListViewer.createControl(parent);
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
public class DashboardEditorStandalone extends SinglePageDatabaseEditor<IEditorInput> implements DashboardViewer, IResourceChangeListener {
            return;

    public DashboardConfigurationList getConfigurationList() {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IEditorSite;
    }
        if (file == null) {
import org.jkiss.dbeaver.ui.dashboard.model.DashboardViewer;
//            final IFile file = EditorUtils.getFileFromInput(getEditorInput());
 * limitations under the License.
 * You may obtain a copy of the License at

//            String diagramState = DiagramLoader.serializeDiagram(RuntimeUtils.makeMonitor(monitor), getDiagramPart(), getDiagram(), false, false);
    @Override
import org.eclipse.swt.widgets.Composite;
    }
        return configurationList;

    public void setFocus() {
        }
        return dashboardConfig.getDataSourceContainer();
    @Override

        if (delta == null) {
        DBPProject project = DBPPlatformDesktop.getInstance().getWorkspace().getProject(file.getProject());
        return dashboardListViewer;
//                monitor);
    @Override
 * Standalone dashboard editor
    public DashboardConfiguration getConfiguration() {
    public void createEditorControl(Composite parent) {
//                true,
import org.eclipse.swt.widgets.Control;
    @Nullable
    @Override
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * DBeaver - Universal Database Manager
    @Override
    @Override
            if ((IResourceDelta.MOVED_TO & delta.getFlags()) != 0) {
        if (file == null) {
    }
package org.jkiss.dbeaver.ui.dashboard.editor;
import org.jkiss.dbeaver.model.dashboard.DashboardIcons;
            return;
            throw new PartInitException("Cannot get project from file " + file);
//            getCommandStack().markSaveLocation();
        configurationList.checkDefaultDashboardExistence();
    @Override
