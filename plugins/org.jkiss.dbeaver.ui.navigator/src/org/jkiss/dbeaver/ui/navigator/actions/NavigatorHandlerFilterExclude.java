import org.eclipse.ui.handlers.HandlerUtil;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        NavigatorUtils.filterSelection(HandlerUtil.getCurrentSelection(event), true);
        return null;
    public void updateElement(UIElement element, Map parameters)
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
 */
    {
import org.eclipse.core.commands.AbstractHandler;
                    if (node != null) {
                final int objectCount = ((IStructuredSelection) selection).size();
                }
                if (objectCount > 1) {
 * you may not use this file except in compliance with the License.
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
package org.jkiss.dbeaver.ui.navigator.actions;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.core.commands.ExecutionException;

 *
/*

            if (selection instanceof IStructuredSelection) {
 * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.ISelection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ISelectionProvider selectionProvider = UIUtils.getSelectionProvider(element.getServiceLocator());
                    DBNNode node = NavigatorUtils.getSelectedNode(selection);

            }
}import org.eclipse.core.commands.ExecutionEvent;
    @Override
                        element.setText(NLS.bind(UINavigatorMessages.actions_navigator_hide_object, node.getName()));
    }
 * Unless required by applicable law or agreed to in writing, software
                } else {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.menus.UIElement;
        }
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.commands.IElementUpdater;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
            final ISelection selection = selectionProvider.getSelection();
 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.model.navigator.DBNNode;

        if (selectionProvider != null) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;

 * limitations under the License.
                    element.setText(NLS.bind(UINavigatorMessages.actions_navigator_hide_objects, objectCount));
                    }
 * You may obtain a copy of the License at
    }
public class NavigatorHandlerFilterExclude extends AbstractHandler implements IElementUpdater {
 * Copyright (C) 2010-2024 DBeaver Corp and others
