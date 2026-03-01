    public DBNNode[] getCachedChildren() {

    @Nullable
            project.ensureOpen();
    @Nullable
            throw new IllegalStateException("Can't read project contents", e);

    @Override
    private final DBPProject project;
    @Override
        if (children != null) {
            for (DBNNode node : extraNodes) {
    @NotNull
    public <T> T getExtraNode(Class<T> nodeType) {
            image = new DBIconComposite(image, false, null, null, null, DBIcon.OVER_LOCK);

            extraNodes = new ArrayList<>();
import org.jkiss.dbeaver.model.navigator.registry.DBNRegistry;

            if (resNode == null) {
            children.addAll(extraNodes);
        DBPImage image = DBIcon.PROJECT;
    private DBNNode[] children;
import org.jkiss.dbeaver.Log;
    }
            resNode = DBUtils.findObject(resNode.getChildren(monitor), fileName.toString());
    }
        return this;
    public boolean needsInitialization() {
        return children.toArray(DBNNode[]::new);
    @Override
    public DBNNode findNodeByRelativePath(@NotNull DBRProgressMonitor monitor, @NotNull String path) throws DBException {
        super.dispose(reflect);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        }
    @Deprecated
        if (reflect) {
import org.jkiss.dbeaver.model.DBUtils;
        if (getProject().isPrivateProject()) {
        for (Path fileName : relativePath) {
    @Override
        }
    }

    public DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {

            return children;
        return true;
        final List<DBNNode> children = new ArrayList<>();
    public DBPProject getOwnerProjectOrNull() {
        Path relativePath = getProject().getAbsolutePath().relativize(path);

import java.util.ArrayList;
    protected void filterChildren(List<DBNNode> children) {

            }


    }
    public void removeExtraNode(@NotNull DBNNode node) {
            for (DBNNode child : children) {
    }
            extraNodes.clear();
 */
    public void addExtraNode(@NotNull DBNNode node, boolean reflect) {
        this.children = children;
                    }


    }
    @NotNull
    public String getNodeDisplayName() {
    }
                    return nodeType.cast(node);
        }
    @Nullable
 * You may obtain a copy of the License at
    @Override
        if (extraNodes != null) {
    @Nullable
        children = readChildNodes(monitor);

            project.dispose();
        return super.getAdapter(adapter);
            return model.getNodeByPath(monitor, project, projectPath);
    @Override
            children = null;
    @Override
import java.util.Comparator;
    public String getName() {
    @NotNull
 * Copyright (C) 2010-2026 DBeaver Corp and others

        return extraNodes;
        }
    public DBNProject(DBNNode parentNode, DBPProject project) {
        return null;
        if (reflect) {
    }
    @Override

import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;

    protected boolean allowsChildren() {
    }

    @Nullable
    public List<DBNNode> getExtraNodes() {
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
        }
        }
    }

import org.jkiss.dbeaver.DBException;
    @Override
    @Override

            image = new DBIconComposite(image, false, null, null, null, DBIcon.OVER_LAMP);

        super(parentNode);
    public DBPProject getProject() {
    }
/**
    public DBPImage getNodeIcon() {
        extraNodes.sort(Comparator.comparing(DBNNode::getNodeDisplayName));
    }
    public <T> T getAdapter(@NotNull Class<T> adapter) {
            dataSourceRegistry.checkForErrors();
    @Nullable
    }
        DBNRegistry.getInstance().extendNode(this, false);
    }
    }
        return children;
    @Override
    }
        if (extraNodes == null) {

        } catch (Throwable e) {

        if (children != null) {
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.util.Collections;
        try {
import java.nio.file.Path;

    public String getNodeType() {
    public String getNodeItemPath() {
    @Override
        if (getModel().isGlobal() && !project.isOpen()) {
        if (extraNodes != null && extraNodes.remove(node)) {
        return getNodeDisplayName();
    }

        }
    @Override
import org.jkiss.dbeaver.model.DBIcon;
    }
    @NotNull
package org.jkiss.dbeaver.model.navigator;
        var model = getModel();
    public DBNNode findResource(DBRProgressMonitor monitor, Path path) throws DBException {
        children.add(new DBNProjectDatabases(this, dataSourceRegistry));
 *

    public Throwable getLastLoadError() {
            }
        }
    @Override
import org.jkiss.dbeaver.model.app.DBPProject;
                DBNUtils.disposeNode(node, reflect);
        addProjectNodes(monitor, children);
    }
        return null;
        }
    }
            getModel().fireNodeEvent(new DBNEvent(this, DBNEvent.Action.ADD, node));
    protected void dispose(boolean reflect) {
public class DBNProject extends DBNNode implements DBNNodeWithCache, DBNNodeExtendable {
    }
    }
        return null;
        } catch (DBException e) {
    @Override
    @Override
    public boolean supportsRename() {
        return project;
            if (dbNodes != null) {
        extraNodes.add(node);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }
    }

    @NotNull
import org.jkiss.code.Nullable;
    @Override
import org.jkiss.utils.CommonUtils;
        if (extraNodes == null) {
            DBNNode[] dbNodes = getChildren(new VoidProgressMonitor());
    @Override
 * DBeaver - Universal Database Manager
            }
    @NotNull

 * you may not use this file except in compliance with the License.

        final DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
        }
        }
        this.project = project;

    private static final Log log = Log.getLog(DBNProject.class);
    public DBNProjectDatabases getDatabases() {
import org.jkiss.code.NotNull;
            getModel().fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, node));
                    if (db instanceof DBNProjectDatabases databases) {

    @Override
        return project.getId();
    }

                break;
            for (DBNNode node : extraNodes) {

    @Override

        return project.getId();
            return Collections.emptyList();

        DBNNode resNode = this;
        return DBWorkbench.isDistributed() || !project.isVirtual();
        return true;
            getModel().fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, this));
                }
                for (DBNNode db : dbNodes) {
            }
        try {
                DBNUtils.disposeNode(child, reflect);
import org.jkiss.dbeaver.model.DBPImage;
        if (projectPath != null) {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                        return databases;
    @Override
        return resNode;
    public boolean allowsOpen() {
import org.jkiss.dbeaver.model.DBIconComposite;
            return adapter.cast(this);
        }
    @Override

    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                if (nodeType.isAssignableFrom(node.getClass())) {
        if (adapter == DBNProject.class) {
        return project.getDisplayName();
    public boolean hasChildren(boolean navigableOnly) {
    }
/*
        if (extraNodes != null) {
 *
        return NodePathType.resource.getPrefix() + project.getId();
        } else if (!getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
    }
    }
    }

 *
        var projectPath = model.toProjectPath(project, path);
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    public String getNodeDescription() {
    }

    private List<DBNNode> extraNodes;
 * DBNProject
    @Override

    @Nullable
    protected void addProjectNodes(DBRProgressMonitor monitor, List<DBNNode> children) throws DBException {
 * limitations under the License.
    @Override
    @NotNull
        return true;

 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    public String getLocalizedName(@NotNull String locale) {
        throw new IllegalStateException("No databases resource in project");

    public String getNodeId() {
import java.util.List;
    }
            throw e;
}
        return getProject().getDataSourceRegistry().getLastError();
        return children;
        }
        throw new DBCFeatureNotSupportedException("Project rename is not supported");
 *     http://www.apache.org/licenses/LICENSE-2.0
        return image;
        project.getDataSourceRegistry().refreshConfig();
    protected DBNNode[] readChildNodes(DBRProgressMonitor monitor) throws DBException {
        filterChildren(children);
        if (!CommonUtils.isEmpty(extraNodes)) {

 */
        return "project";
        return children == null;
    public void setCachedChildren(DBNNode[] children) {
    }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

        return project;


        }
import org.jkiss.dbeaver.model.rm.RMConstants;
        }
            }
 * See the License for the specific language governing permissions and
                }
