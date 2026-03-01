import org.jkiss.dbeaver.runtime.DBWorkbench;


    }
    @Override
 */
    @Override
 * You may obtain a copy of the License at
            }

import org.eclipse.jface.resource.ImageDescriptor;
                log.debug("Cannot find navigator node '" + nodePath + "'", e);
    public NodeEditorInput(@NotNull DBNNode node) {


 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.navigator.DBNNode;
    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.editors;
    @Override
            if (node == null) {

    private volatile DBNNode node;
 *     http://www.apache.org/licenses/LICENSE-2.0

        return node == null ? null : DBeaverIcons.getImageDescriptor(node.getNodeIconDefault());

    public String getToolTipText() {
            return adapter.cast(getNavigatorNode());
import org.jkiss.dbeaver.DBException;
        }
        if (node == null) {
    public ImageDescriptor getImageDescriptor() {

    }
import org.jkiss.dbeaver.model.navigator.DBNModel;
 * you may not use this file except in compliance with the License.
 *
    private static final Log log = Log.getLog(NodeEditorInput.class);

    }
                log.debug("Navigator node '" + nodePath + "' not found");
    @Nullable
    }
                return null;
            } catch (DBException e) {
    public NodeEditorInput(@NotNull String nodePath) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        return null;
                node = navigatorModel.getNodeByPath(new VoidProgressMonitor(), nodePath);
 *
import org.eclipse.ui.IPersistableElement;
        if (node == null || node.isDisposed() || !node.isPersisted()) {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public <T> T getAdapter(Class<T> adapter) {
        this.node = node;
    public IPersistableElement getPersistable() {
                final DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
 * Unless required by applicable law or agreed to in writing, software
    @Override
    }
    }
    public boolean exists() {
        return true;
        this.nodePath = nodePath;
        return NodeEditorInputFactory.ID_FACTORY;
            }

import org.jkiss.dbeaver.Log;
import org.jkiss.code.NotNull;
/**
    }
            return;
        }
        return node == null || node.isDisposed() || !node.isPersisted() ? null : this;
 * DBeaver - Universal Database Manager
        }
import org.eclipse.ui.IMemento;
    @Override
                return null;
    }
/*
 * limitations under the License.
    }
 *
    public void setNavigatorNode(DBNNode node) {
            try {
 * NodeEditorInput
        return node == null ? null : node.getNodeDescription();
    }
    public void saveState(IMemento memento) {
    public String getName() {
        return node;
    @Override
    public DBNNode getNavigatorNode() {
    public String getFactoryId() {


public class NodeEditorInput implements INavigatorEditorInput, IPersistableElement {

    @Override
    @Override
        NodeEditorInputFactory.saveState(memento, this);
        this.node = node;

 */
import org.jkiss.code.Nullable;
        return node == null ? nodePath : node.getNodeDisplayName();


        if (adapter == DBNNode.class) {
}
        DBNNode node = getNavigatorNode();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String nodePath;
    @Override
