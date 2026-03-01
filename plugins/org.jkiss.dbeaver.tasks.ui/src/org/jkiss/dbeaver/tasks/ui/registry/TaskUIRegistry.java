            }
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
        if (configuratorDescriptor == null) {
                String typeId = ext.getAttribute("type");
    public static final String TASK_EXTENSION_ID = "org.jkiss.dbeaver.task.ui"; //$NON-NLS-1$


                }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.task.DBTTaskType;
        TaskConfiguratorDescriptor configuratorDescriptor = taskConfigurators.get(type);

        return false;
        TaskConfiguratorDescriptor configuratorDescriptor = taskConfigurators.get(taskType);
                }
        return instance;
            instance = new TaskUIRegistry(Platform.getExtensionRegistry());
 */
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
 * You may obtain a copy of the License at
                if (tcd.getTaskHandlerType().matchesType(handlerClass)) {
    }

        } catch (DBException e) {
import org.jkiss.dbeaver.model.exec.DBCException;
 *
}
        return false;
    }
            }
public class TaskUIRegistry {

                    return true;

                    if (!CommonUtils.isEmpty(ext.getAttribute("handler"))) {
    private static final Log log = Log.getLog(TaskUIRegistry.class);
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
                        configuratorDescriptor = tcd;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;


        if (configuratorDescriptor != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
                } else {
                throw new DBCException("Task configurator not supported for " + taskType.getName());
                    } else {

                        taskHandlerConfigurators.add(configDescriptor);
        if (handlerClass != null) {
 *
        if (instance == null) {
        }
                    if (tcd.getTaskHandlerType().matchesType(handlerClass)) {
import org.jkiss.dbeaver.model.task.DBTTaskHandler;
            }
            throw new DBCException("Task configurator create error", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static TaskUIRegistry instance = null;
import org.jkiss.dbeaver.DBException;
        }
    public boolean supportsConfiguratorPage(DBTTaskType type) {
        }
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(TASK_EXTENSION_ID);
 * limitations under the License.
            if (configuratorDescriptor == null) {
/*
import org.jkiss.utils.CommonUtils;
                        TaskConfiguratorDescriptor configDescriptor = new TaskConfiguratorDescriptor(ext);
                    }
                        break;
                    TaskConfiguratorDescriptor configDescriptor = new TaskConfiguratorDescriptor(taskType, ext);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.dbeaver.registry.task.TaskRegistry;
 * you may not use this file except in compliance with the License.
    private TaskUIRegistry(IExtensionRegistry registry) {
import java.util.LinkedHashMap;
package org.jkiss.dbeaver.tasks.ui.registry;
 *
                    }
        for (IConfigurationElement ext : extElements) {
                }

        }
    public DBTTaskConfigurator createConfigurator(DBTTaskType taskType) throws DBCException {
                    taskConfigurators.put(taskType, configDescriptor);
 * See the License for the specific language governing permissions and

                TaskTypeDescriptor taskType = TaskRegistry.getInstance().getTaskType(typeId);
            if ("configurator".equals(ext.getName())) {
            if (handlerClass != null) {
        }
                if (taskType == null) {
import java.util.List;
    }
        Class<? extends DBTTaskHandler> handlerClass = taskType.getHandlerClass();
            return configuratorDescriptor.createConfigurator();
            return true;
        if (taskConfigurators.containsKey(taskType)) {
        }
import org.eclipse.core.runtime.IExtensionRegistry;
    public boolean supportsConfigurator(DBTTaskType taskType) {
    }
import org.jkiss.dbeaver.registry.task.TaskTypeDescriptor;
            }
                for (TaskConfiguratorDescriptor tcd : taskHandlerConfigurators) {
import java.util.Map;
    public synchronized static TaskUIRegistry getInstance() {
            return configuratorDescriptor.supportsPanel();
    private final Map<DBTTaskType, TaskConfiguratorDescriptor> taskConfigurators = new LinkedHashMap<>();
        try {
    private final List<TaskConfiguratorDescriptor> taskHandlerConfigurators = new ArrayList<>();
            Class<? extends DBTTaskHandler> handlerClass = taskType.getHandlerClass();
            for (TaskConfiguratorDescriptor tcd : taskHandlerConfigurators) {

import java.util.ArrayList;
                        log.debug("Task type '" + typeId + "' not found. Skip configurator.");
