        return UINavigatorMessages.navigator_nodes_filtered_by_settings_tip;
    @Override

        });
import org.jkiss.dbeaver.model.navigator.DBNNode;

    }
    }
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;

        configureFilters(navigatorTree);
}
 * You may obtain a copy of the License at
    public void configureFilters(@NotNull DatabaseNavigatorTree navigatorTree) {

 * distributed under the License is distributed on an "AS IS" BASIS,
        super(parent);
    public boolean handleDefaultAction(@NotNull DatabaseNavigatorTree navigatorTree) {
 * you may not use this file except in compliance with the License.
        return UINavigatorMessages.navigator_nodes_filtered_by_settings_text;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    
import org.eclipse.jface.action.Action;
    public String getToolTipText(Object element) {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerFilterConfig;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.viewers.IToolTipProvider;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 * See the License for the specific language governing permissions and
public class TreeNodeFilter extends ContextMenuTreeNodeSpecial implements IToolTipProvider {
            NavigatorHandlerFilterConfig.configureFilters(navigatorTree.getShell(), dbNode);
            }
 * A special node shown when a filter is applied to a parent node
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;

package org.jkiss.dbeaver.ui.navigator.database.load;
    public TreeNodeFilter(@NotNull DBNNode parent) {
 *
        return true;
    public String getText(Object element) {
/**
    }
 * DBeaver - Universal Database Manager
/*
import org.jkiss.code.NotNull;
        }
 *
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;


    }
        menu.add(new Action(UINavigatorMessages.actions_navigator_configure_filters) {
 */
    }
    }
                configureFilters(navigatorTree);
import org.eclipse.jface.action.MenuManager;
            public void run() {
        if (getParent() instanceof DBNDatabaseNode dbNode) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
 *
    public void fillContextMenu(@NotNull MenuManager menu, @NotNull DatabaseNavigatorTree navigatorTree) {
 */
    @Override
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
