 * See the License for the specific language governing permissions and
 *

 * Unless required by applicable law or agreed to in writing, software
            element.setTooltip(actionName);

/*
        ActionUtils.fireCommandRefresh(NavigatorCommands.CMD_FILTER_CONNECTED);
            String actionName = navigatorTree.isFilterShowConnected()
                navigatorTree.getViewer().getControl().setRedraw(true);
            navigatorTree.getViewer().getControl().setRedraw(false);
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
 * limitations under the License.

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.DBeaverIcons;
package org.jkiss.dbeaver.ui.navigator.actions;
import java.util.Map;
    @Override
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                navigatorTree.getViewer().refresh();
 * distributed under the License is distributed on an "AS IS" BASIS,
        DatabaseNavigatorTree navigatorTree = NavigatorUtils.getNavigatorTree(event);
                ? UIIcon.FILTER_CONNECTED
import org.jkiss.dbeaver.model.DBIcon;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.menus.UIElement;
            navigatorTree.setFilterShowConnected(!navigatorTree.isFilterShowConnected());
        }
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
            element.setIcon(DBeaverIcons.getImageDescriptor(actionIcon));
            } finally {
            DBIcon actionIcon = navigatorTree.isFilterShowConnected()
            }
        return null;
import org.eclipse.ui.commands.IElementUpdater;
import org.jkiss.dbeaver.ui.ActionUtils;

import org.eclipse.core.commands.ExecutionException;
            try {
        }
        DatabaseNavigatorTree navigatorTree = NavigatorUtils.getNavigatorTree(element.getServiceLocator());
    public void updateElement(UIElement element, Map parameters) {

                ? UINavigatorMessages.navigator_handler_connections_filter_show_connected_text
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                : UINavigatorMessages.navigator_handler_connections_filter_show_all_text;
        if (navigatorTree != null) {
 * you may not use this file except in compliance with the License.
import org.eclipse.core.commands.ExecutionEvent;
                : UIIcon.FILTER_ALL;
import org.eclipse.core.commands.AbstractHandler;
        if (navigatorTree != null) {
 */
public class NavigatorHandlerConnectionFilter extends AbstractHandler implements IElementUpdater {

 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            element.setText(actionName);

}    @Override
    }
