        DBNModel.updateConfigAndRefreshDatabases(this);
        return true;
    public DBNProjectDatabases getParentNode() {
        if (ArrayUtils.isEmpty(folder.getChildren())) {
    public Class<? extends DBSObject> getChildrenClass()
                        generateNewFolderPath(this.getFolder(), nodeFolder.getName())


 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    public static String makeLocalFolderItemPath(@NotNull String projectId, @NotNull String folderPath) {
    @NotNull
 *

        if (children != null) {

        }
import org.jkiss.dbeaver.utils.GeneralUtils;
            } else if (!CommonUtils.equalObjects(dsIcon, icon)) {
    @Deprecated
            }

        for (DBNDataSource ds : getDataSources()) {

        sortNodes(nodes);
    {
    {
import java.nio.file.Path;

    @Override
            if (node.getOwnerProject() == this.getOwnerProject()) {
        if (newParent != null) {
                } else if (node instanceof DBNLocalFolder) {
        return makeLocalFolderItemPath(folder.getDataSourceRegistry().getProject().getId(), folder.getFolderPath());
                        nodeFolder.getFolderPath(),
    @Override

 * See the License for the specific language governing permissions and
                if (node instanceof DBNDataSource) {
        getDataSourceRegistry().moveFolder(folder.getFolderPath(), generateNewFolderPath(folder.getParent(), newName));
                false,
    @Nullable
    @Override
import org.jkiss.utils.ArrayUtils;
    }
                dsIcon = icon;
        GeneralUtils.validateResourceName(newName);
        return ((DBNProjectDatabases)parentNode).getDataSourceRegistry();
    public List<DBNDataSource> getNestedDataSources() {

        for (DBNNode node : nodes) {
        final List<DBNNode> nodes = new ArrayList<>();
        this.folder = folder;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        } else {
            }
                    log.error("Can't move nodes between projects");
    {
                if (childFolder instanceof DBNLocalFolder) {
        return folder.getFolderPath();
        return false;
    {
            return ArrayUtils.toArray(DBNDataSource.class, getDataSources());
 */

import java.util.Collections;
        return folder;
    @Override
        return ArrayUtils.toArray(DBNNode.class, nodes);
    @Override

        } else {

        for (DBNDataSource ds : getDataSources()) {

    }
            }
    public String getNodeDisplayName()
    }
    @NotNull
    }
        return "folder";
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
                }



        DBNModel.updateConfigAndRefreshDatabases(this);
/*

            return DBIcon.TREE_DATABASE_CATEGORY;
    public Object getValueObject()

        }
            }
        dataSources.addAll(getDataSources());
    @NotNull
    @Override
    public String getNodeDescription()
        return DBPDataSourceContainer.class;
    public boolean allowsChildren()
    {
            } else {
    }
    }

    @Override
        for (DBPDataSourceFolder childFolder : folder.getChildren()) {
import java.util.List;
    {
    public String generateNewFolderPath(DBPDataSourceFolder newParent, String newName) {
    }
    }
    @NotNull
        return folderPath.replace("\\", "/");
        if (dsIcon == null) {
                    ((DBNLocalFolder) childFolder).fillNestedDataSources(dataSources);
    public static String makeLocalFolderItemPath(DBPDataSourceFolder folder) {

                return true;
        DBPImage dsIcon = null;
            // Make it a folder
        }
}
        return result;
/*
    {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
 *
        }
                return true;
    @Override
                }
        return (DBNProjectDatabases)super.getParentNode();
        return NodePathType.folder.getPrefix() + projectId + "/" + folderPath;
    @Override
    }
        return true;
        return getNodeDisplayName();
            (otherNode instanceof DBNLocalFolder && ((DBNLocalFolder) otherNode).getFolder().canMoveTo(getFolder()));
    public void setFolder(DBPDataSourceFolder folder) {
                children.add(dataSource);
    }
        for (DBNDataSource dataSource : getParentNode().getDataSources()) {
    public boolean supportsDrop(@Nullable DBNNode otherNode)
                    getParentNode().moveNodesToFolder(Collections.singletonList(node), this.getFolder());
public class DBNLocalFolder extends DBNNode implements DBNContainer
    {
        }
        return folder;
        return children;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    public String toString() {
                null,
        }
    {

    @NotNull
                null,

 * limitations under the License.
        return folder.getName();
        this.folder = folder;
                break;
        return DBIcon.TREE_FOLDER_DATABASE;
        nodes.addAll(getDataSources());
    @NotNull

    }
 * DBNLocalFolder
        }
    {
    }
    public boolean hasChildren(boolean navigableOnly) {
    public List<DBNDataSource> getDataSources()
    @Nullable
 * You may obtain a copy of the License at
    public DBPDataSourceRegistry getDataSourceRegistry() {
    }
    {
    @Override
    public String getNodeType()
    }
                null,
                }
import org.jkiss.code.Nullable;
/**
                    ((DBNDataSource) node).moveToFolder(getOwnerProject(), folder);
    }
            if (folder == dataSource.getDataSourceContainer().getFolder()) {
    @Nullable
import org.jkiss.dbeaver.model.*;
        DBNProjectDatabases parent = getParentNode();
            nodes.add(getParentNode().getFolderNode(childFolder));

    }
import org.jkiss.dbeaver.DBException;
    }
        fillNestedDataSources(result);
    @Override
                DBIcon.OVER_FOLDER);
        for (DBPDataSourceFolder childFolder : folder.getChildren()) {
        List<DBNDataSource> children = new ArrayList<>();
        return normalizePath(folderPath.getFileName().resolveSibling(newName).toString());
import org.jkiss.dbeaver.model.messages.ModelMessages;
    @Override

                    DBPDataSourceFolder nodeFolder = ((DBNLocalFolder) node).getFolder();
                } else if (node instanceof DBNLocalFolder) {
        return otherNode == null || otherNode instanceof DBNDataSource ||
    private String normalizePath(@NotNull String folderPath) {
    }
    public String getNodeItemPath() {
*/
            }
    }
        for (DBNDataSource dataSource : parent.getDataSources()) {
            if (folder == dataSource.getDataSourceContainer().getFolder()) {
                return true;
    @Override
            return normalizePath(Path.of(newParent.getFolderPath()).resolve(newName).toString());
    {
                if (node instanceof DBNDataSource) {
                    getDataSourceRegistry().moveFolder(
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    {
            final DBPImage icon = DBValueFormatting.getObjectImage(ds.getDataSourceContainer());
            if (dsIcon == null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return ModelMessages.model_navigator_Connection;
        }
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.struct.DBSObject;
    private void fillNestedDataSources(@NotNull List<DBNDataSource> dataSources) {
    @Override

    protected void dispose(boolean reflect)
    }
import java.util.Collection;
            // All datasources have the same icon.
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName) throws DBException

                dsIcon = null;
        super.dispose(reflect);
            if (ds.getDataSource() != null) {
    @Property(viewable = true, order = 1)
    public String getName()
 * you may not use this file except in compliance with the License.
    }
    @NotNull
    public boolean supportsRename()
package org.jkiss.dbeaver.model.navigator;
            }
import org.jkiss.utils.CommonUtils;
            return getParentNode().getFolderNode(folder.getParent());
        sortNodes(children);
        DBNNode[] children = getChildren(new VoidProgressMonitor());

import java.util.ArrayList;
        return makeLocalFolderItemPath(folder);

            if (getParentNode().getFolderNode(childFolder).hasConnected()) {
        }

    }
    {
        }
 * DBeaver - Universal Database Manager

    }
    public DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor)
        }
        return folder.getDescription();
    @Nullable
            }
    public DBNLocalFolder(DBNProjectDatabases parentNode, DBPDataSourceFolder folder)
    }
        }
    public DBNNode getLogicalParent() {
            return true;

    {
        return false;
    public boolean hasConnected() {
        if (!ArrayUtils.isEmpty(folder.getChildren())) {
    public String getChildrenType()
                dsIcon,
    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) throws DBException {
import org.jkiss.code.NotNull;
    @Override

    private DBPDataSourceFolder folder;
    @Nullable
        List<DBNDataSource> result = new ArrayList<>();

        var folderPath = Path.of(getFolder().getFolderPath());
    public DBPImage getNodeIcon()
            return getParentNode();
        super(parentNode);
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

        }
    }
 */
            for (DBNNode childFolder : children) {
    @NotNull
            return new DBIconComposite(
        if (folder.getParent() == null) {
    }
    @Override
    @Nullable
    public DBPDataSourceFolder getFolder() {
{
    @Override
    }
    }
                    );
