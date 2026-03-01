
        } catch (CoreException e) {
            if (resourceHandler == null) {
            }
    }
            final DBFRemoteFileStore remoteFileStore = GeneralUtils.adapt(((Resource) resource).getStore(), DBFRemoteFileStore.class);
                return null;
 */
            if (remoteFileStore != null) {
            for (DBNNode child : nodeWithCache.getCachedChildren()) {
            return findResource(new VoidProgressMonitor(), node, resource);
        if (parentNode instanceof DBNNodeWithCache nodeWithCache && !nodeWithCache.needsInitialization()) {
        @NotNull DBRProgressMonitor monitor,
package org.jkiss.dbeaver.model.navigator;
        }
        }
    }
             !(parent instanceof IProject) && !CommonUtils.equalObjects(parent, rcpProject.getRootResource());
    static void sortChildren(DBNNode[] list) {
import org.jkiss.code.Nullable;
        final IProject project = resource.getProject();
                // Sub folder
import java.util.*;
    public static void refreshThisResource(DBRProgressMonitor monitor, DBNNode resNode) throws DBException {
        IResource resource = resNode.getAdapter(IResource.class);
        return null;
import org.jkiss.code.NotNull;
            }
        }
import org.jkiss.dbeaver.model.app.DBPProject;
    public static boolean isRootResource(DBPProject ownerProject, IResource resource) {
            boolean folder1 = DBNUtils.isFolderNode(o1);
        return null;
    }
            throw new DBException("Can't refresh resource", e);
            if (resourceLocation != null && !resourceLocation.toFile().exists()) {

    ) throws DBException {
 * See the License for the specific language governing permissions and

    public static DBNNode getChild(DBNNode parentNode, IResource resource) {
            if (parentNode instanceof DBNResource resourceNode && resource instanceof IFolder && !isRootResource) {
            }

        boolean isRootResource = isRootResource(parentNode.getOwnerProject(), resource);
            return null;
        @Nullable DBNNode node,
 * DBeaver - Universal Database Manager

                return null;
 * You may obtain a copy of the License at
    public static DBNResource getNodeByResource(DBNModel model, IResource resource) {


            return null;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            refreshFileStore(monitor, resource);
    public static DBNResource findResource(
        }
            path.add(0, parent);
import org.jkiss.dbeaver.model.app.DBPResourceHandler;

import org.eclipse.core.resources.IFolder;
        {
    public static void refreshFileStore(@NotNull DBRProgressMonitor monitor, IResource resource) throws DBException {
 *

        return curResNode instanceof DBNResource dbnResource ? dbnResource : null;

        if (resource == null) {
        }
            } else if (folder2 && !folder1) {
                return node;
 * limitations under the License.
            DBPResourceHandler resourceHandler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(resource);
            log.debug(e);
public class NavigatorResources {
        for (IResource parent = resource;

            log.error("Error creating navigator node for resource '" + resource.getName() + "'", e);
import org.eclipse.core.runtime.CoreException;


            // Skip project config
import org.jkiss.dbeaver.Log;
        }

                return -1;
        DBNNode curResNode = projectNode;

import org.eclipse.core.resources.IProject;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    };
    private static final Log log = Log.getLog(NavigatorResources.class);
        } else if (o1 instanceof DBNResource && o2 instanceof DBNResource) {
import org.jkiss.dbeaver.model.fs.DBFRemoteFileStore;
        if (fileNode != null) {
        if (resNode instanceof DBNResource dbnResource) {
        }
        if (project == null) {
                if (Objects.equals(child.getAdapter(IResource.class), resource)) {
        if (o1 instanceof DBNProjectDatabases) {
        }
        for (DBNProject node : root.getProjects()) {
            path.addFirst(parent);
                log.debug("Skip resource '" + resource.getName() + "'");

        }
        } else if (o2 instanceof DBNProjectDatabases) {
    public static DBNProject getProjectNode(DBNRoot root, IProject project) {
            return null;
        }
            fileNode.refreshResourceState(source);
}
import org.jkiss.utils.AlphanumericComparator;
        for (IResource res : path) {
             parent = parent.getParent())
            if (folder1 && !folder2) {
    public static void refreshNavigatorResource(@NotNull DBPProject project, @NotNull IResource resource, Object source) {
        return AlphanumericComparator.getInstance().compare(o1.getNodeDisplayName(), o2.getNodeDisplayName());
import org.eclipse.core.resources.IResource;
        try {
        log.warn("Node '" + resNode + "' is not a local resource");
        if (isRootResource && resource.getName().startsWith(".")) {
    }
    //////////////////////////////////
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                CommonUtils.equalObjects(resource.getParent(), rcpProject.getEclipseProject()));
import org.jkiss.utils.CommonUtils;
        try {
        if (navigatorModel == null) {
            return 1;
            if (node.getProject() instanceof RCPProject rcpProject && rcpProject.getEclipseProject() == project) {
    }
        }
    }
        List<IResource> path = new ArrayList<>();
        }
        if (resource instanceof Resource) {
                return null;
        } catch (Exception e) {
    }
        Arrays.sort(list, COMPARATOR);
import org.eclipse.core.internal.resources.Resource;
                return resourceNode.getHandler().makeNavigatorNode(parentNode, resource);
            return;
        }
    }
/*

    public static DBNNode makeNode(DBNNode parentNode, IResource resource) {
import org.jkiss.dbeaver.DBException;
            curResNode = getChild(curResNode, res);
import org.jkiss.dbeaver.model.rcp.RCPProject;
            resNode = getChild(resNode, res);
            }
        final DBNResource fileNode = NavigatorResources.findResource(projectNode, resource);
        }
                //resource.delete(true, monitor.getNestedMonitor());
            return resourceHandler.makeNavigatorNode(parentNode, resource);
 *
        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        }
    }
            }
    public static DBNResource findResource(@Nullable DBNNode node, @NotNull IResource resource) {
        try {
                }
            boolean folder2 = DBNUtils.isFolderNode(o2);
        if (node == null || !(node.getOwnerProject() instanceof RCPProject rcpProject)) {
            return dbnResource;
            return null;
               (CommonUtils.equalObjects(resource.getParent(), rcpProject.getRootResource()) ||
    static final Comparator<DBNNode> COMPARATOR = (o1, o2) -> {
 * Unless required by applicable law or agreed to in writing, software


        List<IResource> path = new ArrayList<>();
    }
            resource.refreshLocal(IResource.DEPTH_INFINITE, monitor.getNestedMonitor());

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return ownerProject instanceof RCPProject rcpProject &&
                    return child;
import org.eclipse.core.runtime.IPath;

    // RCP resources
            if (resNode == null) {
        DBNModel navigatorModel = project.getNavigatorModel();
 * you may not use this file except in compliance with the License.
    }
            return;
            IPath resourceLocation = resource.getLocation();
        }
            }
        final DBNProject projectNode = getProjectNode(root, project);
            }
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                log.debug("Resource '" + resource.getName() + "' doesn't exists on file system");
            return -1;
    }

            }
                remoteFileStore.refresh(monitor);
import org.jkiss.dbeaver.utils.GeneralUtils;
        for (IResource parent = resource; parent != null && parent != project; parent = parent.getParent()) {
    public static DBNResource getNodeByResource(DBNRoot root, IResource resource) {
        for (IResource res : path) {
        @NotNull IResource resource
                return 1;
        if (projectNode == null) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        return getNodeByResource(model.getRoot(), resource);
            }
            if (curResNode == null) {
        } catch (Exception e) {
            resNode.getChildren(monitor);
 *
        DBNNode resNode = node;
            return null;
        final DBNProject projectNode = getProjectNode(navigatorModel.getRoot(), resource.getProject());
