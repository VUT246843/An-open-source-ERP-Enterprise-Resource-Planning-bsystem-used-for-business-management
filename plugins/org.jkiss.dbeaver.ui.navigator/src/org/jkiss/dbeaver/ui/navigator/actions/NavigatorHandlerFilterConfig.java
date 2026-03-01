            }
                        NavigatorHandlerRefresh.refreshNavigator(Collections.singletonList(parentNode));
                            dataSourceContainer.persistConfiguration();
                            childrenClass = folder.getChildrenClass();
                        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBNNode node = NavigatorUtils.getSelectedNode(element);
        try {
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
                    globalFilter);
                            List<DBXTreeNode> childMeta = dbNode.getMeta().getChildren(dbNode);
                    shell,
import org.jkiss.dbeaver.DBException;
                if (dbNode.getValueObject() instanceof DBSObject dbsObject) {
import org.eclipse.ui.menus.UIElement;
 * distributed under the License is distributed on an "AS IS" BASIS,
                            dataSourceContainer.setObjectFilter(childrenClass, null, dialog.getFilter());
    public static void configureFilters(Shell shell, DBNDatabaseNode dbNode) {
import org.jkiss.dbeaver.ui.navigator.dialogs.EditObjectFilterDialog;
                            NavigatorHandlerRefresh.refreshNavigator(Collections.singletonList(parentNode));
 *
                final DBPDataSourceRegistry dsRegistry = dbNode.getOwnerProject().getDataSourceRegistry();
                            if (!childMeta.isEmpty() && childMeta.get(0) instanceof DBXTreeItem item) {
                            shell,
                            objectFilter != null ? objectFilter : new DBSObjectFilter(),

    }
                    }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
                            }

                        }
    @Override
    private static final Log log = Log.getLog(NavigatorHandlerFilterConfig.class);
                        }
 * You may obtain a copy of the License at
                            true);
            log.error(e);
import org.eclipse.ui.commands.IElementUpdater;
                        objectFilter = dataSourceContainer.getObjectFilter(childrenClass, null, true);
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.core.commands.ExecutionEvent;
    @Override
 *
        if (node != null) {
                }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
 * See the License for the specific language governing permissions and
        return null;
                    objectFilter,
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        }
                    dsRegistry,
import org.jkiss.dbeaver.model.DBPDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
package org.jkiss.dbeaver.ui.navigator.actions;
                        break;
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                        break;
        DBNNode node = NavigatorUtils.getSelectedNode(selection);
            node = node.getParentNode();
import org.eclipse.jface.viewers.ISelection;

import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import java.util.Map;
import org.eclipse.jface.dialogs.IDialogConstants;
                    parentName = dbsObject.getName();
import org.eclipse.swt.widgets.Shell;
        }
        if (node instanceof DBNDatabaseItem) {
public class NavigatorHandlerFilterConfig extends NavigatorHandlerObjectCreateBase implements IElementUpdater {
                String parentName = "?";
                    objectFilter = new DBSObjectFilter();
                final boolean globalFilter = dbNode.getValueObject() instanceof DBPDataSource;
            return;
                                childrenClass = dbNode.getChildrenClass(item);
        if (node instanceof DBNDatabaseNode dbNode) {

                }
            if (itemsMeta != null) {
import org.jkiss.dbeaver.ui.UIUtils;
                        if (childrenClass == null) {
                        }
                EditObjectFilterDialog dialog = new EditObjectFilterDialog(
                        dialog = new EditObjectFilterDialog(
                        Class<?> childrenClass = null;
            element.setText(NLS.bind(UINavigatorMessages.actions_navigator_filter_objects, node.getNodeTypeLabel()));
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                "Bad node", "Cannot use node '" + dbNode.getNodeUri() + "' for filters", true);
                    globalFilter ? "All " + dbNode.getNodeTypeLabel() : dbNode.getNodeTypeLabel() + " of " + parentName,
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.osgi.util.NLS;
                    case IDialogConstants.OK_ID:
                            return;
        } catch (DBException e) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.handlers.HandlerUtil;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
            DBXTreeItem itemsMeta = UIUtils.runWithMonitor(monitor -> DBNUtils.getValidItemsMeta(monitor, parentNode));
/*
                            dsRegistry, "All " + dbNode.getNodeTypeLabel(),
                                         dbNode.getParentNode() instanceof DBNDatabaseNode parent ? parent : dbNode;
                if (objectFilter == null) {
                        if (dbNode instanceof DBNDatabaseFolder folder) {
                        if (dialog.open() == IDialogConstants.OK_ID) {
                DBSObjectFilter objectFilter = parentNode.getNodeFilter(itemsMeta, true);

        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                    case EditObjectFilterDialog.SHOW_GLOBAL_FILTERS_ID: {
                        DBPDataSourceContainer dataSourceContainer = dbNode.getDataSourceContainer();
                }
                        parentNode.setNodeFilter(itemsMeta, dialog.getFilter(), true);
import org.jkiss.dbeaver.model.navigator.*;
                            DBWorkbench.getPlatformUI().showMessageBox(
                            // Set global filter

}    public void updateElement(UIElement element, Map parameters) {
import org.jkiss.dbeaver.Log;
                switch (dialog.open()) {
    }
            configureFilters(HandlerUtil.getActiveShell(event), dbNode);
            DBNDatabaseNode parentNode = !(dbNode instanceof DBNDatabaseFolder) &&
 *
        if (!updateUI) {

    }
 */
import java.util.Collections;
        }
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
import java.util.List;
