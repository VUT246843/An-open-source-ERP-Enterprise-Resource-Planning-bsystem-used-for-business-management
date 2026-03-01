 *
import org.eclipse.core.commands.AbstractHandler;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
import org.eclipse.jface.viewers.ISelection;
 * DBeaver - Universal Database Manager
            final DBNDatabaseFolder folder = (DBNDatabaseFolder) node;
 */
/*
 * you may not use this file except in compliance with the License.
            DBXTreeItem itemsMeta = folder.getItemsMeta();
    public Object execute(ExecutionEvent event) throws ExecutionException {

        return null;
 * Unless required by applicable law or agreed to in writing, software
        DBNNode node = NavigatorUtils.getSelectedNode(selection);
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    nodeFilter.setEnabled(!nodeFilter.isEnabled());
        if (node instanceof DBNDatabaseFolder) {

public class NavigatorHandlerFilterToggle extends AbstractHandler {
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @Override
import java.util.Collections;
}                final DBSObjectFilter nodeFilter = folder.getNodeFilter(itemsMeta, true);
                }
 *
            if (itemsMeta != null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
        }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
 * You may obtain a copy of the License at
 *
import org.eclipse.core.commands.ExecutionException;
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
        }
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;


package org.jkiss.dbeaver.ui.navigator.actions;
                    NavigatorHandlerRefresh.refreshNavigator(Collections.singleton(folder));
import org.eclipse.core.commands.ExecutionEvent;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                if (nodeFilter != null) {
            }
        if (node instanceof DBNDatabaseItem) {

            node = node.getParentNode();
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.eclipse.ui.handlers.HandlerUtil;
 * Licensed under the Apache License, Version 2.0 (the "License");
