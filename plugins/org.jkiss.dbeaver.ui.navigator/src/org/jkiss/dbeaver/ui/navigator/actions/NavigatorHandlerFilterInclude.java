}    }
import org.jkiss.dbeaver.ui.UIUtils;
import java.util.Map;
        ISelectionProvider selectionProvider = UIUtils.getSelectionProvider(element.getServiceLocator());
package org.jkiss.dbeaver.ui.navigator.actions;
 * distributed under the License is distributed on an "AS IS" BASIS,
                } else {
                    if (node != null) {
import org.eclipse.ui.commands.IElementUpdater;
/*
import org.jkiss.dbeaver.model.navigator.DBNNode;
                    element.setText(NLS.bind(UINavigatorMessages.actions_navigator_show_only_selected_objects, objectCount));
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.ISelection;

import org.eclipse.core.commands.AbstractHandler;
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 */
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.osgi.util.NLS;
            }

 * You may obtain a copy of the License at
    public Object execute(ExecutionEvent event) throws ExecutionException {
                        element.setText(NLS.bind(UINavigatorMessages.actions_navigator_show_only_object, node.getName()));
            final ISelection selection = selectionProvider.getSelection();
    public void updateElement(UIElement element, Map parameters)
                }
 * limitations under the License.
import org.eclipse.ui.handlers.HandlerUtil;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (selectionProvider != null) {
            if (selection instanceof IStructuredSelection) {
public class NavigatorHandlerFilterInclude extends AbstractHandler implements IElementUpdater {

 *
    {
import org.eclipse.ui.menus.UIElement;
 * Copyright (C) 2010-2024 DBeaver Corp and others

                    }

 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
        NavigatorUtils.filterSelection(HandlerUtil.getCurrentSelection(event), false);
                if (objectCount > 1) {
        return null;
    @Override
 *
 *
        }
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    DBNNode node = NavigatorUtils.getSelectedNode(selection);
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ISelectionProvider;
                final int objectCount = ((IStructuredSelection) selection).size();
