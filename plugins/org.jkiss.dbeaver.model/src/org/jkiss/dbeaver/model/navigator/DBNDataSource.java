 */
    public boolean isManageable()
        // datasource connect job and it do not updates UI after connect because
        // initializeNode if this action caused by readChildren.
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        DBXTreeNode childNode = metaChildren.getFirst();

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getNodeDescription()
        return dataSource.getDescription();
    @Override
                    return;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
        }
    public DBPDataSourceContainer getObject()
            (dataSource.getFolder() != null && otherNode instanceof DBNLocalFolder oln &&
    @Override
    public DBXTreeNode getMeta()
        }
        return dataSource.getDataSource();
        // We make this action here because we can't update state in
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
            return false;
            if (localFolder != null) {
    @Nullable
}
        if (CommonUtils.isEmpty(metaChildren) || metaChildren.size() > 1) {
    public DBNNode getParentNode()
    public String getNodeId() {
        return false;
import org.jkiss.dbeaver.model.app.DBPProject;
                    image = new DBIconComposite(
    private static final boolean USE_ICON_DECORATIONS = false; // Disabled in #9384
    @Nullable
    @Override
    }
import org.jkiss.code.Nullable;
            } else if (node instanceof DBNLocalFolder) {
        // we need to read datasource children immediately.
        return true;


            DBNLocalFolder localFolder = ((DBNProjectDatabases) super.getParentNode()).getFolderNode(folder);
    public DBPImage getNodeIcon() {
    public String getNodeItemPath() {
    }
    }
    {
    @Nullable
        if (node == this) {
        DBPDataSourceFolder folder = dataSource.getFolder();
        return true;
    @Override
            }

{
        DBPDataSourceFolder folder = dataSource.getFolder();
    @Override
    public Object getValueObject()

    {

    {
    @NotNull
            }

        registerNode();
                }
    }
    }
public class DBNDataSource extends DBNDatabaseNode implements DBNContainer, DBPAdaptable
 *
    }

    @Nullable
            new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, dataSource, true));
    }

        // It breaks loading process. So we refresh datasource state manually
    public String toString() {
    @Override
        return DBUtils.initDataSource(monitor, dataSource, onFinish);
    public void cleanupNode() {
        }
        return dataSource.getName();

        return true;
    public boolean initializeNode(@Nullable DBRProgressMonitor monitor, @Nullable DBRProgressListener onFinish) throws DBException {
        for (DBNNode pn = node; pn != null; pn = pn.getParentNode()) {
        super.dispose(reflect);
    }
    @NotNull
        return dataSource.getId();
    }
                return (DBNDataSource) pn;
    }
    public static String makeDataSourceItemPath(DBPDataSourceContainer dataSource) {
        return super.getParentNode();
        clearNode(true);

    {
    @NotNull
        // Because readChildren executes in separate job - this job reused by
        return otherNode == null || otherNode instanceof DBNDataSource ||
                return localFolder;

    {
    protected void afterChildRead()

package org.jkiss.dbeaver.model.navigator;
 */
        }
        dataSource.setFolder(folder);
import org.jkiss.dbeaver.DBException;
    }

        } else if (DBPDataSourceContainer.class.isAssignableFrom(adapter)) {
            return adapter.cast(dataSource);
        dataSource.fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, dataSource, null));
import org.jkiss.dbeaver.model.*;
    @Override
    }

    }
    @Override
    private final DBPDataSourceContainer dataSource;
        this.treeRoot = dataSource.getDriver().getNavigatorRoot();
        unregisterNode(reflect);
 * You may obtain a copy of the License at
    {
    }
    public void rename(@NotNull DBRProgressMonitor monitor, @NotNull String newName)

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    {
    }
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException
                new DBPEvent(DBPEvent.Action.OBJECT_UPDATE, dataSource));
    public boolean moveToFolder(DBPProject project, DBPDataSourceFolder folder)


import java.util.List;
    @Override
    @Override
    }
    }
    public String getNodeFullName()

            if (pn instanceof DBNDataSource) {
 * DBeaver - Universal Database Manager
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        dataSource.fireEvent(
        if (adapter == DBNDataSource.class) {
            }
/*

            return null;

    @Override
                        false,

        if (folder != null) {

 *
        if (USE_ICON_DECORATIONS) {
        }
        DBPImage image = super.getNodeIcon();
    }
        DBNNode node = super.refreshNode(monitor, source);

 * Unless required by applicable law or agreed to in writing, software
/**
        return NodePathType.database.getPrefix() + DBNUtils.encodeNodePath(dataSource.getId());
            boolean hasNetworkHandlers = hasNetworkHandlers();
        return image;
    {
    @NotNull
    @Override
    @Nullable
    @Nullable

                ((DBNLocalFolder) node).getFolder().setParent(dataSource.getFolder());
            }
        return getNodeDisplayName();
            return metaChildren.getFirst().getChildrenTypeLabel(getDataSource(), null);
    protected void dispose(boolean reflect)
        } else {
    @NotNull
    {
    @Override
    {
    @Override
    protected boolean reloadObject(DBRProgressMonitor monitor, DBSObject object) {
            return getChildrenClass((DBXTreeItem) childNode);

            return adapter.cast(this);

        final List<DBXTreeNode> metaChildren = treeRoot.getChildren(this);
            // Refresh succeeded. Let's fire event
    public DBPDataSourceContainer getDataSourceContainer()
                        null);
        return treeRoot;
                if (image instanceof DBIconComposite) {
    public boolean supportsRename()
import org.jkiss.utils.CommonUtils;
                    ((DBIconComposite) image).setBottomLeft(dataSource.isConnectionReadOnly() ? DBIcon.OVER_LOCK : null);
    {
    @Override
            dataSource.fireEvent(
    {
import java.util.Collection;

    public Class<?> getChildrenClass() {
        final List<DBXTreeNode> metaChildren = treeRoot.getChildren(null); // Use null context because we don't need to filter nodes
    public void dropNodes(@NotNull DBRProgressMonitor monitor, @NotNull Collection<DBNNode> nodes) {
    @Override
                        null,
                        image,
        return node;

    }
    public boolean hasNetworkHandlers() {
    @Override

                } else {
    public DBNDataSource(@NotNull DBNNode parentNode, @NotNull DBPDataSourceContainer dataSource)
    @Override
        return super.getAdapter(adapter);

        }
        for (DBNNode node : nodes) {
        if (childNode instanceof DBXTreeItem) {
        }
    @Nullable
        return null;
        }
import org.jkiss.dbeaver.model.net.DBWUtils;
        DBNModel.updateConfigAndRefreshDatabases(this);
    @NotNull
        return dataSource.toString();
    public String getNodeDisplayName() {
        return dataSource;
    @NotNull
 * DBNDataSource
            if (node instanceof DBNDataSource) {
    @Override
                        dataSource.isConnectionReadOnly() ? DBIcon.OVER_LOCK : null,

        dataSource.persistConfiguration();
        if (oldFolder == folder) {
    }
    }
    public static DBNDataSource getDataSourceNode(DBNNode node) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                        hasNetworkHandlers ? DBIcon.OVER_EXTERNAL : null,
        return dataSource;
    @NotNull
    public String getChildrenType() {
                }
        dataSource.setName(newName);
        if (CommonUtils.isEmpty(metaChildren) || metaChildren.size() > 1) {
    @Override
        final DBPDataSourceFolder oldFolder = dataSource.getFolder();
 *
                if (!((DBNDataSource) node).moveToFolder(getOwnerProject(), folder)) {


        }
 * See the License for the specific language governing permissions and
    public boolean supportsDrop(@Nullable DBNNode otherNode) {
    }
        // right after children nodes read
    {
                    ((DBIconComposite) image).setTopRight(hasNetworkHandlers ? DBIcon.OVER_EXTERNAL : null);
    {
                oln.getFolder().canMoveTo(dataSource.getFolder()));
    }
        }

        return null;
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    public <T> T getAdapter(@NotNull Class<T> adapter) {
        this.dataSource = dataSource;
    }
    @Override
    private final DBXTreeNode treeRoot;
        return makeDataSourceItemPath(dataSource);
    @Override
        return !DBWUtils.getActualNetworkHandlers(dataSource).isEmpty();
            if (dataSource.isConnectionReadOnly() || hasNetworkHandlers) {
    @NotNull
    }
        super(parentNode);
    {
    @Deprecated
            return "?";
        // Notify datasource listeners about state change.
import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
import org.jkiss.dbeaver.model.struct.DBSObject;
