        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,

                if (handler != null) {
import org.jkiss.dbeaver.model.app.DBPProject;
	@Override
    public void setContainer(IWizardContainer wizardContainer) {
            this.project = dataSourceContainer.getProject();
    public DashboardCreateWizard(DBPDataSourceContainer dataSourceContainer) {
                    errorMessage = "Can't create dashboard without active project";
                DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
            if (selection != null) {
            if (dataSourceContainer != null) {
    }
package org.jkiss.dbeaver.ui.dashboard.navigator;
    private final DBPDataSourceContainer dataSourceContainer;
        pageContent = new DashboardCreateWizardPage(project, dataSourceContainer);
                DashboardConfigurationList configurationList = new DashboardConfigurationList(dataSourceContainer);
    private DBPProject project;
/*
                configurationList.checkDefaultDashboardExistence();

                // Add fake default dashboard
                configurationList.saveConfiguration();
    
                    try {
    	if (pageContent != null) {

        addPage(pageContent);
import org.eclipse.core.resources.IFolder;
                if (activeProject == null) {
		}
}

                        entitySelection = selection;
    private DashboardCreateWizardPage pageContent;
                    new VoidProgressMonitor());
	}
    @Nullable
            if (dashboardFolder != null) {
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
                    pageContent.getDashboardName());
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

                    return true;
    @Override
                    pageContent.getDashboardName(),
        this.dataSourceContainer = null;
            }
                }
import org.eclipse.core.runtime.CoreException;
                }
    @Override
                    if (Platform.getAdapterManager().getAdapter(selection.getFirstElement(), DBSEntity.class) != null) {
    }
                    pageContent.getDashboardId(),
    @Nullable
                DashboardConfiguration dashboard = configurationList.createDashboard(
        } catch (Exception e) {
                    dataSourceContainer.getProject(),
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                    UIUtils.getActiveWorkbenchWindow(),

        }
            }
                }
        super.addPages();
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
	public boolean performFinish() {
 * Unless required by applicable law or agreed to in writing, software
    
                    dashboardFolder = Platform.getAdapterManager().getAdapter(element, IFolder.class);
                    folder,
        if (getContainer() != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
	@Override
            //WizardDialog call
                this.folder = dashboardFolder;
import org.jkiss.dbeaver.ui.UIUtils;
                Object element = selection.getFirstElement();
    private IStructuredSelection entitySelection;
            }
                if (element != null) {
        this.dataSourceContainer = dataSourceContainer;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfigurationList;
            pageContent.setErrorMessage(errorMessage);
import org.jkiss.dbeaver.ui.dashboard.view.DataSourceDashboardView;
        }

                        dashboardFolder = DashboardResourceHandler.getDashboardsFolder(activeProject, true);
            DBWorkbench.getPlatformUI().showError("Error creating dashboard", null, e);
import org.eclipse.ui.INewWizard;
    		//New Wizard call
            if (dashboardFolder == null) {
public class DashboardCreateWizard extends Wizard implements INewWizard {
import org.eclipse.jface.wizard.IWizardContainer;
import org.jkiss.dbeaver.model.struct.DBSEntity;
                if (selection != null && !selection.isEmpty()) {
 *
                    }
import org.eclipse.ui.IWorkbench;
        return false;
            } else {
	private String errorMessage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 */
    private IFolder folder;
                // Check for entity selection
                this.project = DBPPlatformDesktop.getInstance().getWorkspace().getProject(dashboardFolder.getProject());
import org.jkiss.dbeaver.runtime.DBWorkbench;

 * See the License for the specific language governing permissions and
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
                DBPResourceHandler handler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(diagramFile);
                    dataSourceContainer,
	}
            }

    }
                IFile diagramFile = DashboardResourceHandler.createDashboard(

import org.eclipse.core.resources.IFile;
 *
    public void addPages() {
                        errorMessage = e.getMessage();
            pageContent.setErrorMessage(errorMessage);
        setNeedsProgressMonitor(true);
		}
    public DashboardCreateWizard() {
    	super.setContainer(wizardContainer);
            IFolder dashboardFolder = null;
 * DBeaver - Universal Database Manager
                return true;
 * You may obtain a copy of the License at
                DataSourceDashboardView.openView(
                    handler.openResource(diagramFile);
        setWindowTitle("Create dashboard");

                } else {
import org.jkiss.code.Nullable;
import org.eclipse.core.runtime.Platform;
    public void init(IWorkbench workbench, IStructuredSelection selection) {
                    } catch (CoreException e) {
        if (dataSourceContainer != null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                dashboard.setInitDefaultCharts(pageContent.isInitDefCharts());
import org.eclipse.jface.wizard.Wizard;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfiguration;
        try {
                    dashboard.getDashboardId());
                    }
