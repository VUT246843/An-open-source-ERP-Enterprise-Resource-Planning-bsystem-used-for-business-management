import java.util.ArrayList;
    protected void dispose(boolean reflect) {
 *
import org.jkiss.code.NotNull;
    @Override
    public String getName() {
        return meta.getDescription();
/*
    public String getChildrenType() {
        return meta.getChildrenTypeLabel(getDataSource(), null);
    public String getLocalizedName(@NotNull String locale) {



    }
 * Copyright (C) 2010-2025 DBeaver Corp and others


        return ((DBNDatabaseNode) parentNode).getDataSource();
    @Override
    public boolean isPersisted() {
    }
        return meta.getHumanReadableId();
import java.util.Collection;
 *
    @Override
            }
        return ((DBNDatabaseNode) getParentNode()).getValueObject();
    }

        List<DBSObject> childObjects = new ArrayList<>();
            for (DBNDatabaseNode child : children) {
package org.jkiss.dbeaver.model.navigator;

        return meta.getChildrenTypeLabel(getDataSource(), locale);

/**
        }
    @Override
    }
        registerNode();

 * You may obtain a copy of the License at
    }
    @NotNull
    }
                childObjects.add(child.getObject());
 * limitations under the License.

    protected boolean reloadObject(DBRProgressMonitor monitor, DBSObject object) {
    @Nullable
    }
        return childObjects;
public class DBNDatabaseFolder extends DBNDatabaseNode implements DBNContainer, DBSFolder {
        unregisterNode(reflect);
        this.meta = meta;
    }

        return getFolderChildrenClass(meta);
    @Nullable
    }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
        if (!ArrayUtils.isEmpty(children)) {
    @Override
    public Collection<DBSObject> getChildrenObjects(@NotNull DBRProgressMonitor monitor) throws DBException {
    public Class<? extends DBSObject> getChildrenClass() {
    @NotNull

import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
        } else {
    @Override
    @Nullable
import java.util.List;
    }
    }

    @Nullable
    public DBSObject getObject() {
    }
 *
    @Override
    @Override
        return meta;
    @Override
    }
    @Property(viewable = true)
 */
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        final List<DBXTreeNode> metaChildren = meta.getChildren(this);
    public DBPDataSource getDataSource() {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    public DBSObject getParentObject() {
    @Override
    @NotNull
        return ((DBNDatabaseNode) getParentNode()).getObject();

    @Override
        super.dispose(reflect);
    }
import org.jkiss.utils.ArrayUtils;

 * DBNDatabaseFolder
            return metaChildren.get(0).getChildrenTypeLabel(getDataSource(), null);
        DBNDatabaseNode[] children = getChildren(monitor);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return this;
    public Object getValueObject() {
    public DBXTreeFolder getMeta() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @NotNull

import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
import org.jkiss.utils.CommonUtils;
    @Nullable
    @NotNull
    public String getNodeId() {
        if (CommonUtils.isEmpty(metaChildren)) {
    @NotNull
        return false;
}
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        return meta.getChildrenTypeLabel(getDataSource(), null);

    DBNDatabaseFolder(DBNDatabaseNode parent, DBXTreeFolder meta) {
    public String getDescription() {
import org.jkiss.dbeaver.DBException;
    @Override
        // do nothing
            return "?";
    private DBXTreeFolder meta;
import org.jkiss.dbeaver.model.struct.DBSFolder;
        return getParentNode() != null && getParentNode().isPersisted();
    public String toString() {


 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        super(parent);
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.DBPDataSource;

import org.jkiss.dbeaver.model.meta.Property;
    }
        }

    @NotNull
    @Override
