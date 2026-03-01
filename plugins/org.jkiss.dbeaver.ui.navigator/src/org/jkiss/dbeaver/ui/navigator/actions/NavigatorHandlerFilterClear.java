import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        try {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
        if (parentNode == null) {
            DBXTreeItem itemsMeta = UIUtils.runWithMonitor(monitor -> DBNUtils.getValidItemsMeta(monitor, parentNode));
 * you may not use this file except in compliance with the License.
    }
 *

        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.DBNUtils;

 *
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
        DBNNode node = NavigatorUtils.getSelectedNode(selection);
} * Licensed under the Apache License, Version 2.0 (the "License");
            return null;

import org.jkiss.dbeaver.Log;
            log.error(e);

 * DBeaver - Universal Database Manager

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
        DBNDatabaseNode parentNode = (DBNDatabaseNode) (node instanceof DBNDatabaseItem ? node.getParentNode() : node);
    public Object execute(ExecutionEvent event) throws ExecutionException {
    private static final Log log = Log.getLog(NavigatorHandlerFilterClear.class);
    @Override
 *
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
import org.jkiss.dbeaver.DBException;
import java.util.Collections;
import org.jkiss.dbeaver.ui.UIUtils;

public class NavigatorHandlerFilterClear extends AbstractHandler {
package org.jkiss.dbeaver.ui.navigator.actions;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
/*
import org.eclipse.core.commands.ExecutionEvent;
                NavigatorHandlerRefresh.refreshNavigator(Collections.singleton(parentNode));
            }
 * limitations under the License.

                parentNode.setNodeFilter(itemsMeta, new DBSObjectFilter(), true);
import org.eclipse.core.commands.ExecutionException;
 * You may obtain a copy of the License at
import org.eclipse.ui.handlers.HandlerUtil;
            if (itemsMeta != null) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * Unless required by applicable law or agreed to in writing, software
        }
import org.eclipse.jface.viewers.ISelection;
        } catch (DBException e) {
import org.eclipse.core.commands.AbstractHandler;
