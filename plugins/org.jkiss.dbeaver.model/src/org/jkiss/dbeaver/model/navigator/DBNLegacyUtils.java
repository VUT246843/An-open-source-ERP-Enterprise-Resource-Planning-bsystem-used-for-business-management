                    if (!projectNode.getProject().isRegistryLoaded()) {
                                return nextChild;
                }
import org.jkiss.code.Nullable;
                        nextChild = child;
        @NotNull DBNNode child,
                curNode = nextChild;
            int firstItem = 0;
     */
 * You may obtain a copy of the License at
                return null;
                        }
                firstItem = 1;
        //log.debug("findNodeByPath '" + nodePath + "' in '" + curNode.getNodeItemPath() + "'/" + firstItem);
import org.jkiss.code.NotNull;
    ) throws DBException {
                    if (nodeMatchesPath(nodePath, child, item)) {
import java.util.Arrays;
        } else if (nodePath.type == DBNNode.NodePathType.other) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;

 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!projectNode.getProject().isRegistryLoaded()) {
            return filePath != null && filePath.getFileName().toString().equals(item);
            String lastItemName = pathItems.get(pathItems.size() - 1);
            String item = pathItems.get(i);
        } else if (child instanceof DBNDatabaseFolder) {
                    return legacyFindNodeByPath(monitor, nodePath, curNode, 1);
            return legacyFindNodeByPath(monitor, nodePath, parentProjectNode, firstItem);
                            nextChild = legacyFindNodeByPath(monitor, nodePath, nextChild, i + 1);
                }
                        if (curNode != null) {
                        DBNDataSource curNode = projectNode.getDatabases().getDataSource(nodePath.first());
                break;
            var node = legacyFindNodeByPath(monitor, nodePath, model.getRoot(), 0);
            DBNNode nextChild = null;
            DBNNode[] children = curNode.getChildren(monitor);
                }
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBRProgressMonitor monitor,
                    "\nAllowed children: " + Arrays.toString(children));
                for (DBNNode child : children) {
                    }
 */
                .filter(dbnProject -> dbnProject.getProject().getId().equals(projectId))
            DBXTreeFolder meta = ((DBNDatabaseFolder) child).getMeta();
                curNode = projectNode.getDatabases().getDataSource(nodePath.first());
    ) throws DBException {

            if (nextChild != null) {
    private static final Log log = Log.getLog(DBNLegacyUtils.class);

                for (DBNProject projectNode : model.getRoot().getProjects()) {
/*
        if (path.type == DBNNode.NodePathType.resource) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (node != null) {
        return null;
        @NotNull String item
            }
    @Deprecated
            }
                if (projectNode.getName().equals(nodePath.first())) {
                DBNDataSource curNode = projectNode.getDatabases().getDataSource(nodePath.first());
                break;

                .findFirst()
            if (nodePath.type == DBNNode.NodePathType.ext && curNode instanceof DBNProject pn) {
                parentProjectNode = projects.getFirst();
        if (curNode == null) {
}
            //backward compatibility
        return legacyFindNodeByPath(monitor, nodePath, curNode, 1);
                // No try to search in uninitialized projects
        @NotNull DBNModel.NodePath nodePath,
                curNode = projectNode.getDatabases();
                .orElse(null);
            if (nextChild == null) {
                if (!CommonUtils.isEmpty(idOrType) && idOrType.equals(item)) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        }
            var projectId = nodePath.first();
                            }
    public static DBNNode legacyGetNodeByPath(
    }
    }
    }
                    return legacyFindNodeByPath(monitor, nodePath,
        @NotNull DBNModel.NodePath path,
    private static DBNNode legacyFindNodeByPath(
        }
                    hasLazyProjects = true;
            if (parentProjectNode == null) {
                        nodePath.type == DBNNode.NodePathType.folder ? projectNode.getDatabases() : projectNode, 1);
            }
                pn.getExtraNode(DBNFileSystems.class);
            for (DBNProject projectNode : model.getRoot().getProjects()) {
                child instanceof DBNProjectDatabases && child.getName().equals(item)) {
                // Trigger project to load extra nodes
                        break;
                }
                }

        @NotNull DBNModel.NodePath nodePath
 *
                    return true;
            }
    @Nullable
    public static DBNNode legacyGetNodeByPath(
            }
        } else if (nodePath.type == DBNNode.NodePathType.ext) {
                : projects.stream()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            for (DBNProject projectNode : model.getRoot().getProjects()) {
        } else if (child instanceof DBNDataSource) {
public class DBNLegacyUtils {
        }
            return child instanceof DBNLocalFolder && child.getName().equals(item);
                    }
                    }
import org.jkiss.dbeaver.Log;
        @NotNull DBNModel.NodePath nodePath
                String idOrType = meta.getIdOrType();
        }
        if (!pathItems.isEmpty()) {

            boolean hasLazyProjects = false;
 *

        if (nodePath.type == DBNNode.NodePathType.database) {
            if (children != null && children.length > 0) {
    ) {
    /**
                throw new DBException("No projects in workspace");
            case folder:
 * DBeaver - Universal Database Manager
        int firstItem
                }
            Path filePath = child.getAdapter(Path.class);
        for (int i = firstItem, itemsSize = pathItems.size(); i < itemsSize; i++) {
        @NotNull DBNNode curNode,
        }
        @NotNull DBNProject projectNode,
                    continue;
            }

            if (hasLazyProjects) {
                ? null
import org.jkiss.dbeaver.DBException;
        final List<String> pathItems = nodePath.pathItems;
     * @deprecated used for backwards compatibility only
    @Deprecated
    }
            if (child instanceof DBNProject && ((DBNProject) child).getProject().getId().equals(item) ||
                // cause projectId included in the path
                return node;
        DBNNode curNode;
            }
        @NotNull DBRProgressMonitor monitor,
        @NotNull DBNModel model,
            if (meta != null) {
            }
            }
            case database:
            if (!nodeMatchesPath(nodePath, curNode, lastItemName)) {
            } else {
            return ((DBNDataSource) child).getDataSourceContainer().getId().equals(item);

            }
        }
            if (projects.isEmpty()) {
                            continue;
import org.jkiss.utils.CommonUtils;
            // works for cloud explorer
            // works for rm resources, because their parent DBNRoot

            }
                // Tail node doesn't match tail node from the desired path
 * See the License for the specific language governing permissions and
                break;
            DBNProject parentProjectNode = projectId == null
                log.debug("Node '" + item + "' not found in parent node '" + curNode.getNodeItemPath() + "'." +
    ) throws DBException {
                if (curNode != null) {

                return true;

        @NotNull DBRProgressMonitor monitor,
                curNode = projectNode;
        switch (nodePath.type) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
        } else if (path.type == DBNNode.NodePathType.folder) {
        return curNode;
 * Licensed under the Apache License, Version 2.0 (the "License");
                            if (nextChild != null) {
            default:
            }
            }
import java.util.List;
        }
        } else {
            return legacyFindNodeByPath(monitor, nodePath, model.getRoot(), 0);
            List<DBNProject> projects = model.getRoot().getProjects();
            return null;
package org.jkiss.dbeaver.model.navigator;
    private static boolean nodeMatchesPath(
                    if (nextChild != null) {
        return child.getName().equals(item);
 * you may not use this file except in compliance with the License.
import java.nio.file.Path;
                        if (i < itemsSize - 1) {
                            return legacyFindNodeByPath(monitor, nodePath, curNode, 1);
 * limitations under the License.
 *
