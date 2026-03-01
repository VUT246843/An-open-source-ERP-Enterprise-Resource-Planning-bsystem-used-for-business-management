 * See the License for the specific language governing permissions and
        return true;
    public final boolean isManageable() {
 * Licensed under the Apache License, Version 2.0 (the "License");
//            throw new IllegalStateException("Null object in navigator node. Node was disposed?");
 *
        return object;
 *
    public Object getValueObject() {
            return false;
import org.jkiss.code.Nullable;
    }
 *
        return object == null ? super.toString() : object.toString();
        return meta;
    @NotNull
    }
        this.object = object;
    }
 * You may obtain a copy of the License at

/**
    }
    @Override
    public String toString() {
        unregisterNode(false);
    @Override
        return object != null && object.isPersisted();
    public boolean isDisposed() {

 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
        unregisterNode(reflect);
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBNDatabaseItem(@NotNull DBNNode parent, @NotNull DBXTreeNode meta, DBSObject object, boolean reflect) {
        this.meta = meta;
 * Copyright (C) 2010-2025 DBeaver Corp and others
//        if (object == null) {
        if (this.object == newObject) {
        }
    @Override

    }
        return object == null || super.isDisposed();
    @Override
    public DBXTreeNode getMeta() {
    private DBSObject object;

    private final DBXTreeNode meta;
    @Override
        return parentNode instanceof DBNDatabaseFolder folder && folder.isDynamicStructObject();

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    @NotNull
/*
    }
        registerNode();
        super(parent);

    public DBSObject getObject() {
        return object;
    protected void dispose(boolean reflect) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        registerNode();
    @Override
 * DBeaver - Universal Database Manager
    protected boolean reloadObject(DBRProgressMonitor monitor, DBSObject newObject) {

        return true;
    }
}
        this.object = null;
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
        this.object = newObject;
        // FIXME: we can't throw error here because too many
 * DBNDatabaseItem
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.navigator;

 */

public class DBNDatabaseItem extends DBNDatabaseNode {
//        }
    @Override
    }
    public boolean isDynamicStructObject() {
        super.dispose(reflect);
    @Nullable
 */
    }
    @Override
    public boolean isPersisted() {


    @Override

import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
