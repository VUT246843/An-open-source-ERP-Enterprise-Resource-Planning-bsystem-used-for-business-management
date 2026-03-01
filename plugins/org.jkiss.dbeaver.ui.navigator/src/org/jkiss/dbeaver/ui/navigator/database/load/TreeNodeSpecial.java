    }

import org.eclipse.jface.viewers.ILabelProvider;
 *
 * DBeaver - Universal Database Manager
    @Override
    private boolean disposed;
    public void removeListener(ILabelProviderListener listener) {

package org.jkiss.dbeaver.ui.navigator.database.load;
    public static final Object LOADING_FAMILY = new Object();
/*
 * See the License for the specific language governing permissions and
    public boolean isLabelProperty(Object element, String property) {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,


    public void dispose(DBNNode parent) {
 * Unless required by applicable law or agreed to in writing, software
        disposed = true;
    }

        return disposed;
    public void dispose() {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    public boolean handleDefaultAction(@NotNull DatabaseNavigatorTree tree) {
    }
 * Special node with some custom behavior.

 * you may not use this file except in compliance with the License.
        return false;
/**

import org.eclipse.jface.viewers.ILabelProviderListener;
 */
import org.jkiss.code.NotNull;
        return parent;
    public DBNNode getParent() {
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        // do nothing
 * You may obtain a copy of the License at
 */

    }
    }



    public boolean isDisposed() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    protected TreeNodeSpecial(DBNNode parent) {
}public abstract class TreeNodeSpecial implements ILabelProvider {
        return false;
 *
 * It is not navigator node.
    private DBNNode parent;
import org.jkiss.dbeaver.model.navigator.DBNNode;
    }
    @Override

        this.parent = parent;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * limitations under the License.
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void addListener(ILabelProviderListener listener) {
