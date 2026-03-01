public class NavigatorHandlerCopyObject extends NavigatorHandlerCopyAbstract {
    protected String getObjectDisplayString(Object object)
            return null;

        }

 *
/*
import org.jkiss.dbeaver.model.DBUtils;
        DBNNode node = NavigatorUtils.getSelectedNode(selection);
    protected CopyMode getCopyMode() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

        }
    }
        DBPNamedObject adapted = RuntimeUtils.getObjectAdapter(object, DBPNamedObject.class);

 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.ui.CopyMode;
 * DBeaver - Universal Database Manager
    protected String getSelectionTitle(IStructuredSelection selection)
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        } else {
import org.eclipse.osgi.util.NLS;

 * limitations under the License.
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            return UINavigatorMessages.actions_navigator_copy_object_copy_objects;

import org.eclipse.jface.viewers.IStructuredSelection;
    {
import org.jkiss.dbeaver.model.DBPNamedObject;
 */

        return null;
    }
            return NLS.bind(UINavigatorMessages.actions_navigator_copy_object_copy_node, node.getNodeTypeLabel());
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (selection.size() > 1) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (node != null) {
    {
}
        if (adapted != null) {
            return DBUtils.getObjectShortName(adapted);
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * you may not use this file except in compliance with the License.
        return CopyMode.DEFAULT;
    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.navigator.actions;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
    @Override
