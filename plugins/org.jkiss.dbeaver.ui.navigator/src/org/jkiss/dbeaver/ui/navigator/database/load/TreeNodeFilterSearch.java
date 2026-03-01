    public String getToolTipText(Object element) {
        treeNodeSearch.fillContextMenu(menu, navigatorTree);
        super(parent);
import org.eclipse.jface.viewers.IToolTipProvider;

 * limitations under the License.
/*
    private final TreeNodeFilter treeNodeFilter = new TreeNodeFilter(getParent());
    @Override
 * A special node shown when both filter and search are applied to a parent node
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ui.navigator.database.load;
 */
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
    }
    @Override
    @Override
 * See the License for the specific language governing permissions and
 */
    public boolean handleDefaultAction(@NotNull DatabaseNavigatorTree navigatorTree) {
 *
        return UINavigatorMessages.navigator_nodes_filtered_by_search_and_filter_text;
    }
    private final TreeNodeSearch treeNodeSearch = new TreeNodeSearch(getParent());
        treeNodeFilter.fillContextMenu(menu, navigatorTree);
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @Override

import org.jkiss.code.NotNull;

    }
    }
    }
        treeNodeFilter.configureFilters(navigatorTree);
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    public String getText(Object element) {
 *
}
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
/**
    public void fillContextMenu(@NotNull MenuManager menu, @NotNull DatabaseNavigatorTree navigatorTree) {
 * Licensed under the Apache License, Version 2.0 (the "License");
public class TreeNodeFilterSearch extends ContextMenuTreeNodeSpecial implements IToolTipProvider {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        return UINavigatorMessages.navigator_nodes_filtered_by_search_and_filter_tip;

import org.eclipse.jface.action.MenuManager;

 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        return true;
    public TreeNodeFilterSearch(@NotNull DBNNode parent) {
