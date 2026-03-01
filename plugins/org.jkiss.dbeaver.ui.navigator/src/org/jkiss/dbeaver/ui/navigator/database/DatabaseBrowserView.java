    protected DatabaseNavigatorTreeFilterObjectType getDefaultFilterType() {
 * DBeaver - Universal Database Manager
        }
            String secondaryId = getViewSite().getSecondaryId();
    public static String getSecondaryIdFromNode(DBNNode node) {
                    return navigatorModel.getNodeByPath(monitor, projectMeta, nodePath);
        if (rootNode == null) {

import org.jkiss.dbeaver.ui.UIUtils;

        DBPProject project = null;
        }
                } catch (DBException e) {
            node = UIUtils.runWithMonitor(monitor -> {
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
 */
                try {
    public static final String VIEW_ID = "org.jkiss.dbeaver.core.databaseBrowser";
        return projectNode == null ? new DBNEmptyNode() : projectNode.getDatabases();
            if (!CommonUtils.isEmpty(secondaryId)) {
        return getDefaultRootNode();
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.ui.navigator.SmartNavigatorTreeFilter;
import org.jkiss.dbeaver.ui.UIExecutionQueue;
            return rootNode;

import org.eclipse.swt.widgets.Composite;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DatabaseBrowserView()
    @Override
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
    {
        super();
        if (rootNode != null) {
        return new SmartNavigatorTreeFilter();
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
        return node;
    }

    protected INavigatorFilter getNavigatorFilter() {
        DBPProject projectMeta = DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
            UIExecutionQueue.queueExec(() -> {
                project = ((DBNProject) dn).getProject();

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            throw new DBException("Bad secondary ID: " + id);
                    log.error("Error creating DB browser view", e);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
                    DBWorkbench.getPlatformUI().showError("Open database browser", "Can't find database navigator node", e);
                } catch (DBException e) {
            throw new IllegalStateException("Navigator node " + node.getNodeUri() + " doesn't belong to a project");
import org.jkiss.dbeaver.model.navigator.DBNProject;
        super.createPartControl(parent);
                try {
                monitor.beginTask("Find navigator node", 1);
        final DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
            });

                    monitor.done();
        getNavigatorTree().setFilterObjectType(getDefaultFilterType());
    public DBNNode getRootNode() {
        DBNNode node = null;
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.navigator.DBNModel;
    }
        for (DBNNode dn = node; dn != null; dn = dn.getParentNode()) {
        }
        // We can't use colon in secondary ID
        }
        int divPos = id.indexOf('|');
                }
 * You may obtain a copy of the License at
        if (divPos == -1) {
import org.jkiss.dbeaver.model.navigator.DBNEmptyNode;
    @Override
                try {
}
package org.jkiss.dbeaver.ui.navigator.database;
                break;
    protected DBNNode getDefaultRootNode() {
            if (dn instanceof DBNProject) {
public class DatabaseBrowserView extends NavigatorViewBase {
            });
    private DBNNode rootNode;
 * Unless required by applicable law or agreed to in writing, software
    }

        if (project == null) {
/*
        }
        String projectName = id.substring(0, divPos);

 * limitations under the License.
        if (projectMeta != null) {
        return DatabaseNavigatorTreeFilterObjectType.table;
            }
    }
        if (!CommonUtils.isEmpty(secondaryId)) {

        String secondaryId = getViewSite().getSecondaryId();
    }

    private static final Log log = Log.getLog(DatabaseBrowserView.class);
        String nodePath = id.substring(divPos + 1).replace("~", ":");

    }
        if (node == null) {
                    setPartName(node.getNodeDisplayName());
    @NotNull
        DBNProject projectNode = getGlobalNavigatorModel().getRoot().getProjectNode(DBWorkbench.getPlatform().getWorkspace().getActiveProject());
            navigatorModel.ensureProjectLoaded(projectMeta);
            }
    public void createPartControl(Composite parent)
            log.error("Node " + nodePath + " not found for browse view");
        }
            node = new DBNEmptyNode();
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                    DBNNode node = getNodeFromSecondaryId(secondaryId);
 * you may not use this file except in compliance with the License.
                }
                    rootNode = getNodeFromSecondaryId(secondaryId);
    @Override
    }
                } finally {
    {
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.Log;
 *

                    setTitleImage(DBeaverIcons.getImage(node.getNodeIconDefault()));
                    monitor.subTask("Find node " + nodePath);
    public static DBNNode getNodeFromSecondaryId(String id) throws DBException {
        return project.getName() + "|" + node.getNodeUri().replace(":", "~");
