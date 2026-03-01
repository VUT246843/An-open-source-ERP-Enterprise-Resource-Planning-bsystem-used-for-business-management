import java.util.Iterator;
            }
            newName = EnterNameDialog.chooseName(workbenchWindow.getShell(), UINavigatorMessages.actions_navigator_folder_name);
        }
            }
                    databasesNode = parentFolder.getParentNode();
public class NavigatorHandlerLocalFolderCreate extends AbstractHandler {
import org.eclipse.core.commands.AbstractHandler;
            for (Iterator iter = structSelection.iterator(); iter.hasNext(); ) {
 * See the License for the specific language governing permissions and
            DBNProjectDatabases databasesNode = null;
        // Create folder and refresh databases root
                if (element instanceof DBNLocalFolder) {
                }
    public static boolean createFolder(IWorkbenchWindow workbenchWindow, IWorkbenchPart activePart, DBNProjectDatabases databases, final DBNLocalFolder parentFolder, final Collection<DBNDataSource> nodes, String newName)
            DBNLocalFolder parentFolder = null;
    }
        if (parentFolder != null && activePart instanceof NavigatorViewBase) {
import org.eclipse.jface.viewers.IStructuredSelection;

    public Object execute(ExecutionEvent event) throws ExecutionException
 * Unless required by applicable law or agreed to in writing, software
import java.util.Collection;
        return null;
                Object element = iter.next();
/*
        return true;
            }
import org.eclipse.jface.viewers.TreeViewer;
        }
                    parentFolder = (DBNLocalFolder) element;

import org.jkiss.dbeaver.model.DBPDataSourceFolder;

import org.eclipse.core.commands.ExecutionEvent;
        if (CommonUtils.isEmpty(newName)) {
                if (element instanceof DBNDataSource) {
        // DS container will reload folders on refresh
import org.eclipse.core.commands.ExecutionException;
        for (DBNDataSource node : nodes) {
import org.jkiss.dbeaver.model.navigator.DBNLocalFolder;
        }

import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
    {
import java.util.ArrayList;
                    element = ((DBNDataSource) element).getParentNode();
 * limitations under the License.
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
import org.jkiss.dbeaver.ui.UIUtils;

import org.eclipse.ui.handlers.HandlerUtil;
                UIUtils.asyncExec(() -> viewer.expandToLevel(parentFolder, 1));
    }
    @Override
            node.moveToFolder(node.getOwnerProject(), folder);
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
 *
import org.jkiss.dbeaver.model.navigator.DBNProjectDatabases;
import org.eclipse.ui.IWorkbenchWindow;
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
        }
                    dataSources.add((DBNDataSource) element);
            final TreeViewer viewer = ((NavigatorViewBase) activePart).getNavigatorViewer();
        final DBPDataSourceRegistry dsRegistry = databases.getDataSourceRegistry();
                    databasesNode = (DBNProjectDatabases) element;
import org.jkiss.utils.CommonUtils;
import org.eclipse.jface.viewers.ISelection;
        DBNModel.updateConfigAndRefreshDatabases(databases);
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                createFolder(HandlerUtil.getActiveWorkbenchWindow(event), activePart, databasesNode, parentFolder, dataSources, null);
                } else if (element instanceof DBNProjectDatabases) {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (newName == null) {
            IStructuredSelection structSelection = (IStructuredSelection) selection;
        if (selection instanceof IStructuredSelection) {

package org.jkiss.dbeaver.ui.navigator.actions;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (databasesNode != null) {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNModel;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.IWorkbenchPart;
        DBPDataSourceFolder folder = dsRegistry.addFolder(parentFolder == null ? null : parentFolder.getFolder(), newName);
            return false;
}
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
    {
import java.util.List;

        }
 * You may obtain a copy of the License at
            if (viewer != null) {
 *
            List<DBNDataSource> dataSources = new ArrayList<>();
