                            }
        }
            return true;
                            // Some resource changed within the projectNode
import org.jkiss.dbeaver.model.rcp.RCPProject;
            if (delta.getKind() == IResourceDelta.ADDED || delta.getKind() == IResourceDelta.CHANGED) {
            return true;
        } else {

    public void refreshResourceState(DBNNode node, Object source) {

                            // Notify just created resource
                            }
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
                        dsChanged = true;
            }
            for (IResourceDelta cChild : delta.getAffectedChildren()) {
                                log.error("Can't find project '" + project.getName() + "' metadata");
    }
                            // New projectNode
            }
    private boolean handleProjectChanges(DBNProject projectNode, IResourceDelta delta) {

            CommonUtils.equalObjects(delta.getResource(), rcpProject.getRootResource())) {
                // New child or new "grand-child"
                            if (projectMeta == null) {

            return;
 * distributed under the License is distributed on an "AS IS" BASIS,
            model.fireNodeEvent(new DBNEvent(source, DBNEvent.Action.UPDATE, node));
                                handleResourceChange(childResource, delta);
        for (IResourceDelta childDelta : delta.getAffectedChildren(IResourceDelta.ALL_WITH_PHANTOMS, IContainer.INCLUDE_HIDDEN)) {
                        if (delta.getKind() == IResourceDelta.CHANGED) {
        }

            IResourceDelta delta = event.getDelta();
                            // Project not found - report an error
        }
        }
        if (!(parentNode instanceof DBNNodeWithCache nodeWithCache) || nodeWithCache.needsInitialization()) {
            }
                    } else {
        final IResource deltaResource = delta.getResource();
            // Update this node in navigator
    public void handleResourceChange(DBNNode node, IResourceDelta delta) {
                        }
                                model.getRoot().removeProject(projectMeta);
            handleChildResourceChange(node, childDelta);
    @Override
                        children = ArrayUtils.add(DBNNode.class, children, newChild);
            if (dsChanged) {

        }
        if (childResource == null) {
            if (newHandler != resourceNode.getHandler()) {
                        if (childDelta.getKind() == IResourceDelta.REMOVED) {
                            } else {
import org.jkiss.utils.ArrayUtils;
                                log.error("Can't find project '" + project.getName() + "' metadata");
            DBPResourceHandler newHandler = DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(resourceNode.getResource());
                nodeWithCache.setCachedChildren(children);
                    DBNProject projectNode = NavigatorResources.getProjectNode(model.getRoot(), project);
import org.jkiss.dbeaver.model.app.DBPProject;
                        NavigatorResources.sortChildren(children);
        }
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                if (newChild == null) {
                            log.error("Project '" + childDelta.getResource().getName() + "' not found in navigator");
        if (node instanceof DBNResource resourceNode) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                            DBPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(project);
        if (name.equals(DBPProject.METADATA_FOLDER)) {
                            if (childResource != null) {
import org.jkiss.utils.CommonUtils;
        if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
                        } else {
            }
    public void resourceChanged(IResourceChangeEvent event)
            if (delta.getKind() == IResourceDelta.REMOVED) {
                            childResource = NavigatorResources.getChild(parentNode, deltaResource);
                }
                            if (projectMeta == null) {
                    IResource childRes = rd.getResource();
                            // Project deleted
    public NavigatorResourceListener(DesktopNavigatorModel model) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        DBNNode[] children = nodeWithCache.getCachedChildren();

                            DBPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(project);

        DBNNode childResource = NavigatorResources.getChild(parentNode, deltaResource);
                    if (projectNode == null) {

                children = ArrayUtils.remove(DBNNode.class, children, childResource);
                DBNNode newChild = NavigatorResources.getChild(parentNode, deltaResource);
            // Child nodes are not yet read so nothing to change here - just return
                    }
        if (projectNode.getProject() instanceof RCPProject rcpProject &&
            return false;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return;
package org.jkiss.dbeaver.model.navigator;
                resourceNode.setHandler(newHandler);
            // Go inside root resource
        if (node instanceof DBNLazyNode lazyNode && lazyNode.needsInitialization()) {
}
        }
            // Metadata configuration changed
                    }
                            } else {
        final String name = delta.getResource().getName();
                            handleResourceChange(projectNode, childDelta);
            } else {
                    if (newChild != null) {
        }
            boolean dsChanged = false;
 */
                // Node changed - handle it recursive
            if (handleProjectChanges(project, delta)) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                            // This may happen (e.g.) when first script created in just created script folder
            }
                handleChildResourceChange(projectNode, cChild);
    }
                handleResourceChange(childResource, delta);
 * limitations under the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
                DBNNode[] children = nodeWithCache.getCachedChildren();
                if (childDelta.getResource() instanceof IProject project) {
            }
 * Unless required by applicable law or agreed to in writing, software
                        }
    }
        if (parentNode instanceof DBNProject project) {
    }
                    newChild = NavigatorResources.makeNode(parentNode, deltaResource);
        }
                        }
                        if (childDelta.getKind() == IResourceDelta.ADDED) {
                                model.getRoot().addProject(projectMeta, true);
                    }
 *
                }
                DBNUtils.disposeNode(childResource, true);
                        model.fireNodeEvent(new DBNEvent(delta, DBNEvent.Action.ADD, newChild));
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
                        } else if (childDelta.getKind() != IResourceDelta.REMOVED) {
                            }
            if (configFiles != null) {
                projectNode.getDatabases().getDataSourceRegistry().refreshConfig();
        //delta.getAffectedChildren(IResourceDelta.ALL_WITH_PHANTOMS, IContainer.INCLUDE_HIDDEN)
        if (delta.getKind() == IResourceDelta.CHANGED) {
import org.jkiss.dbeaver.Log;
        this.model = model;
                    if (childRes instanceof IFile && childRes.getName().startsWith(DBPDataSourceRegistry.MODERN_CONFIG_FILE_PREFIX)) {
            for (IResourceDelta childDelta : delta.getAffectedChildren()) {
        }
    private final DesktopNavigatorModel model;
    public void handleChildResourceChange(DBNNode parentNode, IResourceDelta delta) {
            IResourceDelta[] configFiles = delta.getAffectedChildren();
            }

import org.eclipse.core.resources.*;
                        nodeWithCache.setCachedChildren(children);
 * you may not use this file except in compliance with the License.
                for (IResourceDelta rd : configFiles) {
    {
    }
                }

    private static final Log log = Log.getLog(NavigatorResourceListener.class);
 *
public class NavigatorResourceListener implements IResourceChangeListener {
            }
                            // Let it handle this event itself

 *
                // Node deleted
                return;
            refreshResourceState(node, delta);
/*
