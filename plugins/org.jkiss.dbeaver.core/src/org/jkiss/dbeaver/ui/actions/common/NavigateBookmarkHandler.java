                            UIUtils.syncExec(() -> BookmarksHandlerImpl.navigateNodeByPath(navigatorView, dsNode, storage));
        return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectBase;
import org.jkiss.dbeaver.ui.navigator.database.NavigatorViewBase;
 */
                }
                } catch (DBException e) {
    private static final Log log = Log.getLog(NavigateBookmarkHandler.class);

 * limitations under the License.
                        if (status.isOK()) {
            DBNNode selectedNode = NavigatorUtils.getSelectedNode(HandlerUtil.getCurrentSelection(event));
package org.jkiss.dbeaver.ui.actions.common;
                    if (dbNavigatorPart instanceof NavigatorViewBase) {
 * you may not use this file except in compliance with the License.
                    }
        NavigatorViewBase activeNavigatorView = NavigatorUtils.getActiveNavigatorView(event);

 * DBeaver - Universal Database Manager
                    log.error("Can't find datasource node for '" + dataSourceContainer.getName() + "'"); //$NON-NLS-2$
    }
                    // Show in DB navigator is we are currently in project explorer
 * See the License for the specific language governing permissions and
                    log.error(e);

 *
                final DBPDataSourceContainer dataSourceContainer = DBUtils.findDataSource(storage.getDataSourceId());
                try {
            if (selectedNode instanceof DBNBookmark) {
                        }

                }
                }

 *
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorView;

                        }
        if (activeNavigatorView != null) {
import org.jkiss.dbeaver.model.DBUtils;
                if (dsNode == null) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.eclipse.ui.PartInitException;
import org.jkiss.dbeaver.ui.navigator.project.ProjectExplorerView;
                    });
                    return null;
                        try {
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.ui.IWorkbenchPage;
    @Override
public class NavigateBookmarkHandler extends NavigatorHandlerObjectBase {
                    final IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
                if (activeNavigatorView instanceof ProjectExplorerView) {
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.resources.bookmarks.BookmarkStorage;

 * You may obtain a copy of the License at
                            log.debug(e);
                    log.debug("Can't find datasource '" + storage.getDataSourceId() + "'"); //$NON-NLS-2$
import org.jkiss.dbeaver.model.navigator.DBNUtils;
import org.jkiss.dbeaver.model.navigator.DBNNode;
                final DBNDataSource dsNode = (DBNDataSource) DBNUtils.getNodeByObject(dataSourceContainer);
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;


/*
import org.jkiss.dbeaver.ui.resources.bookmarks.BookmarksHandlerImpl;
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.Log;
                }
                    IViewPart dbNavigatorPart = activePage.findView(DatabaseNavigatorView.VIEW_ID);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
                            activePage.showView(DatabaseNavigatorView.VIEW_ID);
import org.jkiss.dbeaver.ui.resources.bookmarks.DBNBookmark;
}                NavigatorViewBase navigatorView = activeNavigatorView;
                if (dataSourceContainer == null) {
                BookmarkStorage storage = ((DBNBookmark) selectedNode).getStorage();
import org.jkiss.dbeaver.ui.UIUtils;
                    dsNode.initializeNode(null, status -> {
                    return null;
                        } catch (PartInitException e) {
                        activeNavigatorView = (NavigatorViewBase) dbNavigatorPart;

 *
