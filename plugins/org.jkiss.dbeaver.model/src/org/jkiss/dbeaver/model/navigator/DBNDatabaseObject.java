                // skip folders

    @Nullable
        registerNode();
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeObject;
    }
    }
    }
    }
        return pathName.toString();
        return this;
            DBSObject databaseObject = getObject();
    @Override
                if (!pathName.isEmpty()) {
        if (parentObject == null) {
        return false;
        }

        pathName.insert(0, getNodeDisplayName() + " (");
import org.jkiss.dbeaver.model.DBPDataSource;
    @Property(viewable = true, order = 1)
        return parentObject.getDataSource();
    @NotNull
 * you may not use this file except in compliance with the License.
    public DBSObject getObject() {
    @NotNull
        for (DBNNode parent = getParentNode(); parent != null; parent = parent.getParentNode()) {
    public String getName() {
    @Override
        return this;
            if (parent instanceof DBNDatabaseFolder) {
                    pathName.insert(0, '.');
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                continue;
        return getParentNode() instanceof DBNDatabaseNode ? ((DBSWrapper) getParentNode()).getObject() : null;
            return adapter.cast(databaseObject);
        return meta.getDescription();
        if (adapter == DBSObject.class) {
    @Override
    @Override
/**
            if (!CommonUtils.isEmpty(parentName)) {
        return super.getAdapter(adapter);
    }

    public String getLocalizedName(@NotNull String locale) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
}
            String parentName = parent.getNodeDisplayName();
    @Override
                }

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        }
    @Override

    @Override
            throw new IllegalStateException("No parent database object for object node");
    @NotNull
        this.meta = meta;
import org.jkiss.code.Nullable;
        unregisterNode(reflect);
    @Override

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        DBSObject parentObject = getParentObject();
import org.jkiss.dbeaver.model.struct.DBSWrapper;

        return meta.getNodeTypeLabel(getDataSource(), null);

    @NotNull

        super.dispose(reflect);
 * limitations under the License.
package org.jkiss.dbeaver.model.navigator;

 *
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        pathName.append(")");
            }
    public String getDescription() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
    public DBSObject getParentObject() {
    public String getNodeFullName() {


 * DBNDatabaseObject
        StringBuilder pathName = new StringBuilder();
    }
    public DBXTreeObject getMeta() {
        super(parent);

    @Override


    protected void dispose(boolean reflect) {
 */
    }
    @Override
        // do nothing
            }
    @Nullable
 *
    private final DBXTreeObject meta;
        return meta.getNodeTypeLabel(getDataSource(), locale);
    }
import org.jkiss.utils.CommonUtils;
    DBNDatabaseObject(@NotNull DBNNode parent, @NotNull DBXTreeObject meta) {
    }
    protected boolean reloadObject(@NotNull DBRProgressMonitor monitor, DBSObject object) {
                pathName.insert(0, parentName);
        }
    public <T> T getAdapter(@NotNull Class<T> adapter) {

 * DBeaver - Universal Database Manager
    }
    @NotNull
import org.jkiss.dbeaver.model.meta.Property;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
    public DBPDataSource getDataSource() {
public class DBNDatabaseObject extends DBNDatabaseNode implements DBSObject {
    public Object getValueObject() {
 * See the License for the specific language governing permissions and
    @Override
    @Override
        return meta;
