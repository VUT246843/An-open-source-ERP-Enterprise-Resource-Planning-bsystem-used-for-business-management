}
/**
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
            @Override
    public String getText(Object element) {
import org.eclipse.jface.viewers.IToolTipProvider;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
        return true;
        });
    }
import org.jkiss.code.NotNull;
 *

 * See the License for the specific language governing permissions and

    @Override

package org.jkiss.dbeaver.ui.navigator.database.load;
            public void run() {
    public TreeNodeSearch(@NotNull DBNNode parent) {
 */
import org.eclipse.jface.action.Action;
public class TreeNodeSearch extends ContextMenuTreeNodeSpecial implements IToolTipProvider {
 * you may not use this file except in compliance with the License.
        return UINavigatorMessages.navigator_nodes_filtered_by_search_text;
        super(parent);
 * You may obtain a copy of the License at

import org.eclipse.jface.action.MenuManager;
    public boolean handleDefaultAction(@NotNull DatabaseNavigatorTree navigatorTree) {
        return UINavigatorMessages.navigator_nodes_filtered_by_search_tip;
    @Override
    public void fillContextMenu(@NotNull MenuManager menu, @NotNull DatabaseNavigatorTree navigatorTree) {
    }
    }

 * limitations under the License.
    @Override
    public String getToolTipText(Object element) {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        navigatorTree.resetFilter();
 * distributed under the License is distributed on an "AS IS" BASIS,
        menu.add(new Action(UINavigatorMessages.actions_navigator_reset_search) {
 * DBeaver - Universal Database Manager
    }
    }
 */
                navigatorTree.resetFilter();
/*
import org.jkiss.dbeaver.model.navigator.DBNNode;
            }
 * A special node shown when a search is applied to a parent node

 * Unless required by applicable law or agreed to in writing, software

