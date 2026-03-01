    {
        }
                                manager.deleteTaskConfiguration(task);
    }
                    schedulers.add(descriptor);
import org.eclipse.core.runtime.IConfigurationElement;
            }
            if (cat.getParent() == null) {
        synchronized (taskListeners) {
    @NotNull
                            } catch (DBException e) {
                }
    }
        return taskDescriptors.values().toArray(new DBTTaskType[0]);
import java.util.ArrayList;
            instance = new TaskRegistry(Platform.getExtensionRegistry());
            for (IConfigurationElement ext : extElements) {
                if ("category".equals(ext.getName())) {
                            try {
    public DBTSchedulerDescriptor[] getAllSchedulers() {
package org.jkiss.dbeaver.registry.task;

                                log.warn("Can't delete configuration for task: " + task.getName());
        if (instance == null) {

                    if (project != null) {
    }
    public void removeTaskListener(DBTTaskListener listener) {
            }
    private static final Log log = Log.getLog(TaskRegistry.class);
    }
        for (DBTTaskListener listener : listenersCopy) {
        return taskCategories.values().toArray(new DBTTaskCategory[0]);

            return;
    public void addTaskListener(DBTTaskListener listener) {
    }
    @Override
            } catch (DBException e) {
                    taskDescriptors.put(taskDescriptor.getId(), taskDescriptor);
import org.jkiss.dbeaver.Log;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                }
 *
        return null;
    public void notifyTaskFoldersListeners(DBTTaskFolderEvent event) {

    }
                    }
 * you may not use this file except in compliance with the License.
    @Override
    public void notifyTaskListeners(DBTTaskEvent event) {

        if (activeScheduler != null) {
        return instance;


    TaskCategoryDescriptor getTaskCategory(String id) {
    public TaskTypeDescriptor getTaskType(String id) {
    private static TaskRegistry instance = null;
}

import org.jkiss.dbeaver.model.app.DBPProject;
        }
    private TaskRegistry(IExtensionRegistry registry)
            listener.handleTaskEvent(event);
            IConfigurationElement[] extElements = registry.getConfigurationElementsFor(TASK_EXTENSION_ID);
import org.jkiss.utils.CommonUtils;
    @Override
    @NotNull
            }
import org.eclipse.core.runtime.IExtensionRegistry;
        }
                    SchedulerDescriptor descriptor = new SchedulerDescriptor(ext);
        return taskDescriptors.get(id);
        }
public class TaskRegistry implements DBTTaskRegistry
            if (!taskListeners.remove(listener)) {
    public DBTTaskCategory[] getAllCategories() {

    @NotNull
                    String projectName = CommonUtils.toString(properties.get(EVENT_PARAM_PROJECT));

                }
                result.add(cat);
        return schedulers.stream()
        DBTSchedulerDescriptor activeScheduler = getActiveScheduler();
            try {
            for (IConfigurationElement ext : extElements) {

                return activeScheduler.getInstance();
                log.error(e);
        }
    @Override
        }

        }
    public DBTTaskType[] getAllTaskTypes() {
    }
                    if (project != null) {
    @Nullable
        for (TaskCategoryDescriptor cat : taskCategories.values()) {
 *
                }
    }
                log.debug("Task listener " + listener + " not found");
        }
    @NotNull
                        DBTTask task = project.getTaskManager().getTaskById(taskId);
 * Unless required by applicable law or agreed to in writing, software

    @Nullable
    }
    }
    public synchronized static TaskRegistry getInstance()
    @Override
    private final List<DBTTaskListener> taskListeners = new ArrayList<>();
                    DBPProject project = DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
        }
                }
        DBTTaskListener[] listenersCopy;
        for (DBTTaskListener listener : listenersCopy) {

    private final List<SchedulerDescriptor> schedulers = new ArrayList<>();
    @Nullable
    @Override
            for (IConfigurationElement ext : extElements) {
        if (DBWorkbench.getPlatform() instanceof DBPPlatformEventManager eventManager) {
        return result.toArray(new DBTTaskCategory[0]);
        return taskCategories.get(id);
        // Load data taskDescriptors from external plugins
                    String typeId = ext.getAttribute("type");
                    TaskCategoryDescriptor descriptor = new TaskCategoryDescriptor(this, ext);
 * Licensed under the Apache License, Version 2.0 (the "License");
            .filter(SchedulerDescriptor::isEnabled)
                    TaskTypeDescriptor taskDescriptor = new TaskTypeDescriptor(taskType, ext);
                            }
                        }
 */
                        final DBTTaskManager manager = project.getTaskManager();
                if (eventId.equals(EVENT_BEFORE_PROJECT_DELETE)) {
                if ("scheduler".equals(ext.getName())) {
            }
            listenersCopy = taskListeners.toArray(new DBTTaskListener[0]);

    }
        List<DBTTaskCategory> result = new ArrayList<>();
import org.jkiss.dbeaver.runtime.DBWorkbench;

                    final String projectName = CommonUtils.toString(properties.get(EVENT_PARAM_PROJECT));
import org.jkiss.dbeaver.model.app.DBPPlatformEventManager;
    }
    private final Map<String, TaskCategoryDescriptor> taskCategories = new LinkedHashMap<>();
import org.jkiss.dbeaver.model.task.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
        return schedulers.toArray(new DBTSchedulerDescriptor[0]);
                    final DBPProject project = DBWorkbench.getPlatform().getWorkspace().getProject(projectName);
    public DBTSchedulerDescriptor getActiveScheduler() {
    @Override

        if (DBWorkbench.getPlatform().getApplication().isMultiuser()) {
        synchronized (taskListeners) {
        {
/*
            eventManager.getGlobalEventManager().addEventListener((eventId, properties) -> {
            listenersCopy = taskListeners.toArray(new DBTTaskListener[0]);


import org.jkiss.code.Nullable;
                        for (DBTTask task : manager.getAllTasks()) {
{
    public DBTTaskCategory[] getRootCategories() {
    }
                            task.refreshRunStatistics();
                if (eventId.equals(EVENT_TASK_EXECUTE)) {
                        }
 * You may obtain a copy of the License at
            }
 * See the License for the specific language governing permissions and
        synchronized (taskListeners) {
    private final Map<String, TaskTypeDescriptor> taskDescriptors = new LinkedHashMap<>();
 * limitations under the License.

    @Override
                            notifyTaskListeners(event);
import java.util.List;
            });
                if ("task".equals(ext.getName())) {
                            DBTTaskEvent event = new DBTTaskEvent(task, DBTTaskEvent.Action.TASK_EXECUTE);
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                    TaskCategoryDescriptor taskType = getTaskCategory(typeId);
        DBTTaskListener[] listenersCopy;
        }
            taskListeners.add(listener);
import org.eclipse.core.runtime.Platform;
 * DBeaver - Universal Database Manager
        }
            listener.handleTaskFolderEvent(event);
                    taskCategories.put(descriptor.getId(), descriptor);
        }
import org.jkiss.dbeaver.DBException;
                        if (task != null) {
    public static final String TASK_EXTENSION_ID = "org.jkiss.dbeaver.task"; //$NON-NLS-1$
import java.util.Map;
            .findFirst().orElse(null);
import org.jkiss.code.NotNull;
    public DBTScheduler getActiveSchedulerInstance() {
        synchronized (taskListeners) {
                    String taskId = CommonUtils.toString(properties.get(EVENT_PARAM_TASK));
import java.util.LinkedHashMap;
            }
                    }
