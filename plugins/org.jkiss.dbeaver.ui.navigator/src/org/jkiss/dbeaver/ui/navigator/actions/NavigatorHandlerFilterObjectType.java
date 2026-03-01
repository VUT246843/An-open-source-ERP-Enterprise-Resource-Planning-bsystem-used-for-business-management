    private static final Log log = Log.getLog(NavigatorHandlerFilterObjectType.class);
import org.eclipse.ui.menus.CommandContributionItem;

import org.eclipse.ui.IWorkbenchWindow;
    @Override
            element.setChecked(objectType == curObjectType);
import java.util.ArrayList;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
            element.setTooltip(objectType.getDescription());
    public void updateElement(UIElement element, Map parameters) {
    }
                return new IContributionItem[0];

                    false,
                return null;
                if (typesList.isEmpty()) {
 * limitations under the License.
            return menuItems.toArray(new IContributionItem[0]);
 * Licensed under the Apache License, Version 2.0 (the "License");
                objectType = types.get((types.indexOf(selection) + 1) % types.size());
                var selection = navigatorTree.getFilterObjectType();
            log.debug("Can't find active navigator tree");
        DatabaseNavigatorTree navigatorTree = NavigatorUtils.getNavigatorTree(event);
 * DBeaver - Universal Database Manager
            }
import org.jkiss.dbeaver.ui.ActionUtils;
public class NavigatorHandlerFilterObjectType extends AbstractHandler implements IElementUpdater {
import org.eclipse.ui.commands.IElementUpdater;
            navigatorTree.getViewer().getControl().setRedraw(false);
 * distributed under the License is distributed on an "AS IS" BASIS,
            try {
                DatabaseNavigatorTreeFilterObjectType.class,
                    objectType.getDescription(),
            DatabaseNavigatorTree navigatorTree = NavigatorUtils.getNavigatorTree(workbenchWindow);
            if (navigatorTree == null || !(navigatorTree.getNavigatorFilter() instanceof DatabaseNavigatorTreeFilter navigatorFilter)) {
                objectType = typesList.get((typesList.indexOf(selection) + 1) % typesList.size());
            } finally {
 * You may obtain a copy of the License at
import org.eclipse.core.commands.ExecutionException;
                var selection = navigatorTree.getFilterObjectType();
                    return null;
        DatabaseNavigatorTreeFilterObjectType curObjectType = DatabaseNavigatorTreeFilterObjectType.connection;
import org.eclipse.core.commands.AbstractHandler;
        }
                .toList();
                menuItems.add(ActionUtils.makeCommandContribution(


import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilterObjectType;
                ));
 * See the License for the specific language governing permissions and
            }
        );
import org.jkiss.dbeaver.ui.UIUtils;
            IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
            }
 */
 *
                    objectType.getName(),
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        protected IContributionItem[] getContributionItems() {

            }
                navigatorTree.getViewer().refresh();
import org.eclipse.ui.menus.UIElement;
import org.eclipse.jface.action.IContributionItem;
                    .toList();
        DatabaseNavigatorTree navigatorTree = NavigatorUtils.getNavigatorTree(element.getServiceLocator());
        }
        }
            var typesList = navigatorFilter.getSupportedObjectTypes().stream()
 * Unless required by applicable law or agreed to in writing, software
    }
        if (navigatorTree != null) {
                    NavigatorCommands.CMD_FILTER_OBJECT_TYPE,
                navigatorTree.getViewer().getControl().setRedraw(true);
            element.setText(objectType.getName());
 *

        } else {
import org.jkiss.dbeaver.Log;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    workbenchWindow,
            ActionUtils.fireCommandRefresh(NavigatorCommands.CMD_FILTER_OBJECT_TYPE);
import java.util.Map;
        }
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.jkiss.dbeaver.ui.DBeaverIcons;
            } else if (objectType == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            for (DatabaseNavigatorTreeFilterObjectType objectType : typesList) {
                    .sorted()
                var types = List.of(DatabaseNavigatorTreeFilterObjectType.values());
}
package org.jkiss.dbeaver.ui.navigator.actions;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            element.setTooltip(NLS.bind("{0} (click to cycle through)", curObjectType.getDescription()));
    }
                    Collections.singletonMap("type", objectType.name())
            element.setIcon(null);
                var typesList = navigatorFilter.getSupportedObjectTypes().stream()
            CommonUtils.toString(parameters.get("type"))
                .sorted()
        } else {
        if (objectType == null) {
            DatabaseNavigatorTreeFilterObjectType.class,
            DatabaseNavigatorTreeFilterObjectType objectType = CommonUtils.valueOf(
            List<IContributionItem> menuItems = new ArrayList<>();
import org.eclipse.ui.actions.CompoundContributionItem;
import org.jkiss.utils.CommonUtils;
            if (objectType == navigatorTree.getFilterObjectType()) {
            if (objectType == null && navigatorTree.getNavigatorFilter() instanceof DatabaseNavigatorTreeFilter navigatorFilter) {

            );
    @Override
                    objectType.getIcon(),
            curObjectType = navigatorTree.getFilterObjectType();

        DatabaseNavigatorTreeFilterObjectType objectType = CommonUtils.valueOf(
import java.util.List;


        if (navigatorTree != null) {
            element.setIcon(DBeaverIcons.getImageDescriptor(curObjectType.getIcon()));

            navigatorTree.setFilterObjectType(objectType);
                // Cycle through all object types starting from the active one

    public static class MenuContributor extends CompoundContributionItem {
        return null;
/*
import org.eclipse.core.commands.ExecutionEvent;
                event.getParameter("type")
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilter;
        @Override
import java.util.Collections;
                    CommandContributionItem.STYLE_RADIO,
                }
import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
