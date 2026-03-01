                if (res != null) {
 * DBeaver - Universal Database Manager
        DBNResource resource = NavigatorResources.findResource(projectNode, resource1);

        } catch (Exception e) {
        return projectExplorer;
                String defaultRoot = resourceType.getDefaultRoot(rcpProject);

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
        }
public class SQLEditorHandlerShowScripts extends SQLEditorHandlerOpenEditor {

import org.jkiss.dbeaver.ui.navigator.project.ProjectExplorerView;
                .getRoot().getProjectNode(rcpProject);
                }
    {

 *
    }
            DBPDataSourceContainer ds = getActiveDataSourceContainer(event, true);
    public Object execute(ExecutionEvent event) throws ExecutionException
import org.jkiss.dbeaver.model.navigator.DBNProject;
                projectExplorer.showNode(resource);
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.registry.ResourceTypeRegistry;
 * See the License for the specific language governing permissions and
                            showResourceInExplorer(event, projectNode, scriptsRoot);
            ProjectExplorerView projectExplorer = getProjectExplorerView(event);
                    showResourceInExplorer(event, projectNode, res.getResource());
                if (defaultRoot != null) {
import org.eclipse.ui.IWorkbenchWindow;

 *
        }
    @Override
    private static final Log log = Log.getLog(SQLEditorHandlerShowScripts.class);
                SQLEditorUtils.ResourceInfo res = SQLEditorUtils.findRecentScript(rcpProject, context);

 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.sql.handlers;

import org.eclipse.core.resources.IResource;

 * distributed under the License is distributed on an "AS IS" BASIS,
                        IResource scriptsRoot = rootResource.findMember(defaultRoot);
        }
    }
import org.eclipse.core.commands.ExecutionEvent;
            return true;
            if (projectNode == null || !rcpProject.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW)) {
        return false;
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
            ProjectExplorerView.VIEW_ID);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                    IContainer rootResource = rcpProject.getRootResource();
        ProjectExplorerView projectExplorer = ww == null ? null : (ProjectExplorerView)ww.getActivePage().showView(
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            }
import org.jkiss.dbeaver.Log;
    public SQLEditorHandlerShowScripts()
            } else {
                        if (scriptsRoot instanceof IFolder) {

import org.eclipse.ui.PartInitException;
        if (projectExplorer == null) {
            }
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                SQLNavigatorContext context = new SQLNavigatorContext(ds);
        if (resource != null) {
    private static ProjectExplorerView getProjectExplorerView(ExecutionEvent event) throws PartInitException {
            if (projectExplorer != null) {
                    if (rootResource != null) {
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
        DBPProject project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.rcp.RCPProject;
 */
    @Nullable
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
                    }
import org.eclipse.core.resources.IFolder;
            if (ds != null) {
        return null;
                DBPResourceTypeDescriptor resourceType = ResourceTypeRegistry.getInstance().getResourceType(ScriptsHandlerImpl.RESOURCE_TYPE_ID_SQL_SCRIPT);
            }
            return null;
        IWorkbenchWindow ww = HandlerUtil.getActiveWorkbenchWindow(event);
 *
    }
    private static boolean showResourceInExplorer(ExecutionEvent event, DBNProject projectNode, IResource resource1) throws PartInitException {
    {
            return null;
            DBNProject projectNode = NavigatorViewBase.getGlobalNavigatorModel()
import org.jkiss.code.Nullable;
            log.error(e);
import org.jkiss.dbeaver.ui.editors.sql.scripts.ScriptsHandlerImpl;
        }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
                }
import org.jkiss.dbeaver.model.rm.RMConstants;
import org.jkiss.dbeaver.model.app.DBPResourceTypeDescriptor;
        try {
import org.eclipse.core.resources.IContainer;
import org.jkiss.dbeaver.model.app.DBPProject;
 * limitations under the License.
                return null;
import org.jkiss.dbeaver.model.navigator.DBNResource;
import org.eclipse.ui.handlers.HandlerUtil;
        if (!(project instanceof RCPProject rcpProject)) {
