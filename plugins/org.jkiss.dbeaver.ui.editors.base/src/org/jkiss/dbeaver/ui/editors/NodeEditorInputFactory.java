package org.jkiss.dbeaver.ui.editors;

 *

    public static final String ID_FACTORY = NodeEditorInputFactory.class.getName(); //$NON-NLS-1$
 * limitations under the License.
    @Override
    }
import org.jkiss.dbeaver.model.navigator.DBNObjectNode;
    public static void saveState(IMemento memento, NodeEditorInput input) {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */

        return new NodeEditorInput(nodePath);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private static final String TAG_NODE = "node"; //$NON-NLS-1$


    public NodeEditorInputFactory() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * You may obtain a copy of the License at
        }
    public IAdaptable createElement(IMemento memento) {
        if (nodePath == null) {
import org.jkiss.dbeaver.Log;
            return;
import org.eclipse.core.runtime.IAdaptable;
import org.jkiss.dbeaver.model.navigator.DBNNode;
/*
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        }
            log.debug("No node ID found in memento");
        final DBNNode node = input.getNavigatorNode();
        memento.putString(TAG_NODE, node.getNodeUri());
        if (node == null || node.isDisposed() || node instanceof DBNObjectNode) {
        // Get the node path.

 *
} * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(NodeEditorInputFactory.class);
public class NodeEditorInputFactory implements IElementFactory {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.IMemento;
            return null;
    }
import org.eclipse.ui.IElementFactory;
 *
        final String nodePath = memento.getString(TAG_NODE);
