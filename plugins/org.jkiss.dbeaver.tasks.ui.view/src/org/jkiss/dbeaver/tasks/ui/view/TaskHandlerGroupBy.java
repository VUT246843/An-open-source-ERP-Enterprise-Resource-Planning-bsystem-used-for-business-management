import org.jkiss.utils.CommonUtils;
        }
    }
            String commandName = Platform.getResourceBundle(Platform.getBundle(TaskUIViewBundle.BUDLE_ID)).getString("command.org.jkiss.dbeaver.task.group." + groupBy.name() + ".name");
import org.jkiss.dbeaver.tasks.ui.internal.TaskUIViewBundle;
    @Override

        }
        DatabaseTasksView taskView = (DatabaseTasksView) UIUtils.findView(UIUtils.getActiveWorkbenchWindow(), DatabaseTasksView.VIEW_ID);
import java.util.Map;
        if (taskView != null) {
            switch (groupBy) {
import org.eclipse.core.runtime.Platform;
            DatabaseTasksTree tasksTree = taskView.getTasksTree();
                tasksTree.setGroupByCategory(!tasksTree.isGroupByCategory());
        GroupBy groupBy = CommonUtils.valueOf(GroupBy.class, event.getParameter("group"), GroupBy.category);
                case category:
    @Override
    }
            case category:

            element.setTooltip(commandName);
        switch (groupBy) {
 * limitations under the License.
            }
import org.eclipse.ui.commands.IElementUpdater;
    }
                    break;
import org.jkiss.dbeaver.ui.UIUtils;
 *

                case type:
            element.setText(commandName);
 *
                    break;
                tasksTree.setGroupByType(!tasksTree.isGroupByType());
}
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

        DatabaseTasksTree tasksTree = view.getTasksTree();
            }
 * See the License for the specific language governing permissions and

                    element.setChecked(tasksTree.isGroupByCategory());
                return;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    element.setChecked(tasksTree.isGroupByType());

    public enum GroupBy {
                    //element.setIcon(DBeaverIcons.getImageDescriptor(DBIcon.TREE_DATABASE_CATEGORY));
        category,
            if (tasksTree == null) {
                    //element.setIcon(DBeaverIcons.getImageDescriptor(DBIcon.TREE_TASK));
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (tasksTree == null) {
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.handlers.HandlerUtil;
        DatabaseTasksView view = (DatabaseTasksView) HandlerUtil.getActivePart(event);
 * DBeaver - Universal Database Manager
            GroupBy groupBy = CommonUtils.valueOf(GroupBy.class, (String)parameters.get("group"), GroupBy.category);
        tasksTree.regroupTasks(DatabaseTasksTree.ExpansionOptions.EXPAND_ALL);
            case type:
            return null;
package org.jkiss.dbeaver.tasks.ui.view;
public class TaskHandlerGroupBy extends AbstractHandler implements IElementUpdater {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                break;
        }
    public Object execute(ExecutionEvent event) throws ExecutionException {
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void updateElement(UIElement element, Map parameters) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.menus.UIElement;
/*
        type
 * You may obtain a copy of the License at
 *
        return null;
import org.eclipse.core.commands.ExecutionException;
                break;
import org.eclipse.core.commands.ExecutionEvent;
