    {
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
        super();
import org.jkiss.utils.CommonUtils;
            case PROP_CAN_OPEN_SCHEDULER_SETTINGS -> scheduler != null && scheduler.supportsFeature(DBTScheduler.FEATURE_OPEN_EXTERNAL_SETTINGS);
 * You may obtain a copy of the License at
 *
/**
import org.jkiss.dbeaver.model.task.DBTTask;
    public static final String PROP_EDITABLE = "editable";
/*

 */
    }
            default -> false;
import org.eclipse.core.expressions.PropertyTester;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    @Override
}        final boolean actualValue = switch (property) {
    public static void firePropertyChange(String propName)

    public TaskPropertyTester() {
 */
        if (!(receiver instanceof DBTTask task)) {
        return actualValue == CommonUtils.getBoolean(expectedValue, true);

            return false;
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
import org.jkiss.dbeaver.Log;
            return ((DBTTaskFolder) receiver).getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);

    public static final String PROP_CAN_OPEN_SCHEDULER_SETTINGS = "canOpenSchedulerSettings";
package org.jkiss.dbeaver.tasks.ui;
{

public class TaskPropertyTester extends PropertyTester

import org.jkiss.dbeaver.ui.ActionUtils;
 *
    public static final String PROP_SCHEDULED = "scheduled";

    private static final Log log = Log.getLog(TaskPropertyTester.class);
 * TaskPropertyTester
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            case PROP_EDITABLE -> task.getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT);
        if (receiver instanceof DBTTaskFolder && PROP_EDITABLE.equals(property)) {
            case PROP_SCHEDULED -> scheduler != null && scheduler.getScheduledTaskInfo(task) != null;
import org.jkiss.dbeaver.model.task.DBTScheduler;
        final DBTScheduler scheduler = TaskRegistry.getInstance().getActiveSchedulerInstance();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.rm.RMConstants;
import org.jkiss.dbeaver.model.task.DBTTaskFolder;
 * DBeaver - Universal Database Manager
        }
    public static final String NAMESPACE = "org.jkiss.dbeaver.task";
        }
    }
 *
        };
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.registry.task.TaskRegistry;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
