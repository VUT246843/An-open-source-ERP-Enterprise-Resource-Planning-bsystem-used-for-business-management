    public DBNDatabaseDynamicItem(DBNDatabaseNode parent, DBSObject object) {
            if (node instanceof DBNDatabaseItem item) {

        super(parent);
 * Licensed under the Apache License, Version 2.0 (the "License");


 * you may not use this file except in compliance with the License.
    @Override
        this.object = null;
    }
    private DBSObject object;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * *
    @Override
    @NotNull
    @NotNull
 * You may obtain a copy of the License at
    @Override
 * Unless required by applicable law or agreed to in writing, software

    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        return object == null || super.isDisposed();
public class DBNDatabaseDynamicItem extends DBNDatabaseNode {
    }
    @Override
 */
}
        return object == null ? super.toString() : object.toString();
    @Override
 * DBNDatabaseDynamicItem.
 * DBeaver - Universal Database Manager
    }
import org.jkiss.code.Nullable;
    }
    public boolean isDynamicStructObject() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected void dispose(boolean reflect) {
    @Override
        return object;
/*
        this.object = object;
    @Override
    }
    public boolean isPersisted() {

    public Object getValueObject() {

    public DBXTreeNode getMeta() {

        return !isDisposed() && hasDynamicStructChildren();


        super.dispose(reflect);
 * See the License for the specific language governing permissions and
    @Override
    public DBSObject getObject() {
 */
 * Dynamic items are not in the main navigator model. They are created dynamically as child nodes for complex
        return false;
package org.jkiss.dbeaver.model.navigator;
 * database objects references (e.g. table columns struct data type attributes).
        return object;
                return item.getMeta();
 *
/**
    public boolean allowsChildren() {
    @Nullable

    public boolean isDisposed() {
 *
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        return getObject() instanceof DBSTypedObject;
import org.jkiss.code.NotNull;
    }


    protected boolean reloadObject(DBRProgressMonitor monitor, DBSObject newObject) {
    }
    public String toString() {
        for (DBNNode node = getParentNode(); node != null; node = node.getParentNode()) {
 * limitations under the License.
    @Override
    public final boolean isManageable() {
        throw new IllegalStateException("Dynamic node without parent item node (" + this + ")");
    }

        return true;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return object != null && object.isPersisted();
            }
    }
    }
