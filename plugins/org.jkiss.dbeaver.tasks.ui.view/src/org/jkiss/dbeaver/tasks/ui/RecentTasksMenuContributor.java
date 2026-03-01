import org.jkiss.dbeaver.ui.ActionUtils;
public class RecentTasksMenuContributor extends DataSourceMenuContributor
 *
        for (DBTTask task : tasks) {
            menuItems.add(ActionUtils.makeActionContribution(new Action(task.getName(), DBeaverIcons.getImageDescriptor(taskIcon)) {
    private static final int MAX_ITEMS = 5;

 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
        DBTTask[] tasks = Arrays.stream(project.getTaskManager().getAllTasks())
import org.jkiss.dbeaver.model.DBIcon;
            DBPImage taskIcon = task.getType().getIcon();
import java.util.Arrays;
                @Override
                    TaskHandlerRun.runTask(task);
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.tasks.ui;
} * DBeaver - Universal Database Manager
import java.util.List;
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
            }, false));
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.action.IContributionItem;


 */
import org.jkiss.dbeaver.model.task.DBTTask;
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceMenuContributor;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 *
import java.util.Comparator;
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPProject;
            .limit(MAX_ITEMS)
/*
 *
    protected void fillContributionItems(final List<IContributionItem> menuItems)

            .sorted(Comparator.comparing(DBTTask::getUpdateTime).reversed())
import org.jkiss.dbeaver.tasks.ui.view.TaskHandlerRun;
import org.eclipse.jface.action.Action;
        }
        }
import org.jkiss.dbeaver.model.DBPImage;
            .toArray(DBTTask[]::new);
                public void run() {
 * You may obtain a copy of the License at
            return;
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
            if (taskIcon == null) taskIcon = DBIcon.TREE_TASK;
        DBPProject project = NavigatorUtils.getSelectedProject();
        if (project == null) {
{
