    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
 * you may not use this file except in compliance with the License.
        DBPProject project = DBWorkbench.getPlatform(DBPPlatformDesktop.class).getWorkspace().getProject(file.getProject());
import org.jkiss.dbeaver.ui.dashboard.model.DashboardConfigurationList;
import java.lang.reflect.InvocationTargetException;
                    throw new InvocationTargetException(e);
        }
                return FEATURE_DELETE | FEATURE_RENAME | FEATURE_CREATE_FOLDER | FEATURE_MOVE_INTO;
            throw new DBException("Error creating dashboard", e.getTargetException());
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public static IFolder getDashboardsFolder(DBPProject project, boolean forceCreate) throws CoreException {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (InvocationTargetException e) {
        UIUtils.getActiveWorkbenchWindow().getActivePage().openEditor(
            } else {
        }
            erdInput,
    public static IFile createDashboard(
    }
    @NotNull
import org.jkiss.dbeaver.model.navigator.DBNResource;
                    return Collections.emptyList();
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
public class DashboardResourceHandler extends AbstractResourceHandler {
                DBPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(
import org.jkiss.dbeaver.ui.dashboard.editor.DashboardEditorStandalone;
import java.util.List;
    public void openResource(@NotNull final IResource resource) throws CoreException, DBException {
                folder = getDashboardsFolder(DBWorkbench.getPlatform().getWorkspace().getActiveProject(), true);
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.resources.IFile;
        }
 * DBeaver - Universal Database Manager
        if (resource instanceof IFolder) {
            throw new DBException("Can't detect project for file " + file);
                IResource iResource = resource.getResource();
import java.io.InputStream;
import org.jkiss.dbeaver.model.app.DBPProject;
                throw new DBException("Can't obtain folder for dashboard", e);
        } catch (InterruptedException e) {
        if (folder == null) {
                }
    @NotNull
 *
import java.util.Collections;
        return file;
import org.jkiss.dbeaver.model.navigator.DBNNode;
 *
            return "dashboard";

        }


    @Override
 *
 * Unless required by applicable law or agreed to in writing, software

                    file.refreshLocal(1, RuntimeUtils.getNestedMonitor(monitor1));
        ResourceUtils.checkFolderExists(folder, monitor);
import org.eclipse.ui.part.FileEditorInput;
import org.jkiss.dbeaver.ui.UIUtils;
            return new DBNDashboardFolder(parentNode, resource, this);
                        //return ERDPersistedState.extractContainers(projectMeta, is);
    public String getTypeName(@NotNull IResource resource) {
                    configList.saveConfiguration();
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
    public int getFeatures(IResource resource) {
/**
import org.jkiss.dbeaver.Log;
                if (projectMeta == null) {
            try {
            if (resource.getParent() instanceof IFolder) {
 * ERD resource handler
        final IFile file = ResourceUtils.getUniqueFile(folder, CommonUtils.escapeFileName(title), DashboardConstants.DASHBOARD_EXT);
        if (resource instanceof IFile) {
        throws DBException

                log.error(e);
                    configList = new DashboardConfigurationList(project, file);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
        DBRProgressMonitor monitor)
            // interrupted
            DBRRunnableWithProgress runnable = monitor1 -> {
            } catch (CoreException e) {

        } else {
    {
    @Override
    }
                    DashboardConfigurationList configList;
        if (resource.getResource() instanceof IFile) {
import org.jkiss.dbeaver.model.dashboard.navigator.DBNDashboard;
        }
        }
        final String title,
            }
            }
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
import org.eclipse.core.resources.IResource;
    @Override
/*
            try {
import org.jkiss.dbeaver.ui.resources.AbstractResourceHandler;
    @Override
                }
            DashboardEditorStandalone.class.getName());
    }
        return super.getAssociatedDataSources(resource);
import org.jkiss.utils.CommonUtils;
        } else {
                if (iResource instanceof IFile) {
            return FEATURE_OPEN | FEATURE_DELETE | FEATURE_RENAME;
import org.jkiss.dbeaver.utils.ResourceUtils;
        if (!(resource instanceof IFile)) {
import org.eclipse.core.resources.IFolder;

    public DBNResource makeNavigatorNode(@NotNull DBNNode parentNode, @NotNull IResource resource) throws CoreException, DBException {
            return new DBNDashboard(parentNode, resource, this);

                    }
import org.jkiss.dbeaver.DBException;
    public List<DBPDataSourceContainer> getAssociatedDataSources(DBNResource resource) {
import org.jkiss.code.NotNull;
        }

}
                try {
package org.jkiss.dbeaver.ui.dashboard.navigator;
            super.openResource(resource);
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return FEATURE_CREATE_FOLDER | FEATURE_MOVE_INTO;
    }
                    try (InputStream is = ((IFile) iResource).getContents()) {
 * limitations under the License.
            }
            return;
        if (folder == null) {
            };
                    iResource.getProject());
        }
                return null;
    private static final Log log = Log.getLog(DashboardResourceHandler.class);
 */
            if (monitor == null) {
            throw new DBException("Can't detect folder for dashboard");
        FileEditorInput erdInput = new FileEditorInput((IFile) resource);
        if (project == null) {
    }

import org.jkiss.dbeaver.utils.RuntimeUtils;
        return DBPPlatformDesktop.getInstance().getWorkspace().getResourceDefaultRoot(project, DashboardResourceHandler.class, forceCreate);

        if (resource instanceof IFolder) {
                } catch (Exception e) {
        try {
import org.jkiss.code.Nullable;
        } else {
        IFolder folder,
                runnable.run(monitor);


 */
    @Nullable
import org.jkiss.dbeaver.model.dashboard.navigator.DBNDashboardFolder;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                UIUtils.runInProgressService(runnable);
 * You may obtain a copy of the License at

            return "dashboard folder";
            } catch (Exception e) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Licensed under the Apache License, Version 2.0 (the "License");

