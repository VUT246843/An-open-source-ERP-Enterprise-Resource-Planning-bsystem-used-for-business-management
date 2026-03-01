    private class ServiceJob extends Job {
        return statisticsFolder;
/**
            result.add(tc.getType());
    public void cancelRunningTasks() {
            taskFolder
    }
            super("Task canceling job");
    }
 
                Object property = JSONUtils.getObjectProperty(folderMap.getValue(), TaskConstants.TAG_PARENT);
import org.eclipse.core.runtime.jobs.Job;
            }
                if (taskFolder.getParentFolder() != null) {
                    tasksFolders.add(taskFolder);
import org.eclipse.core.runtime.IStatus;
                    );
        if (!getProject().hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_VIEW)) {
                    }
        .setStrictness(Strictness.LENIENT)
            new ArrayList<>(Arrays.asList(folderTasks))
                return;
        return tasks.toArray(new DBTTask[0]);
 * DBeaver - Universal Database Manager
        saveConfiguration();
                synchronized (tasks) {
        TaskFolderImpl taskFolder = new TaskFolderImpl(folderName, parentFolder, project, folderTasks != null ?

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
                String id = taskMap.getKey();
        } catch (DBException e) {
            DBTTaskFolder taskFolder = task.getTaskFolder();
            taskFolder = DBUtils.findObject(tasksFolders, taskFolderName);

            if (tasks.isEmpty() && CommonUtils.isEmpty(tasksFolders)) {
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
            }
                            synchronized (tasksFolders) {
        // First read and create folders
        return taskConfig;
import java.nio.charset.StandardCharsets;
    @NotNull

                task,
    @Override
    }
    public DBTTask getTaskById(@NotNull String id) {
                    synchronized (tasks) {
        final TaskRunJob runJob = createJob((TaskImpl) task, listener);
import java.io.IOException;
                runningTasks.remove((TaskRunJob) event.getJob());
                    createTaskFolder(projectMetadata, folderName, parentFolder, new DBTTask[0]);
            configFile = loadConfigFile();
                        id,
        }


    protected TaskImpl createTask(
 *

        return taskFolder;
                        taskDescriptor,
        @NotNull Date updateTime,
                newTask ? DBTTaskEvent.Action.TASK_ADD : DBTTaskEvent.Action.TASK_UPDATE));
        }
    public boolean hasRunningTasks() {

    }
            taskFolder,
        jsonWriter.endObject();
import org.eclipse.core.runtime.jobs.IJobChangeEvent;

    private TaskRunJob createJob(@NotNull TaskImpl task, @NotNull DBTTaskExecutionListener listener) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
            TaskRegistry.getInstance().notifyTaskFoldersListeners(new DBTTaskFolderEvent(task.getTaskFolder(), DBTTaskFolderEvent.Action.TASK_FOLDER_UPDATE));
        @NotNull Date createTime,
                jsonWriter.beginObject();
        for (DBTTask tc : tasks) {
        }
        if (serviceJob == null) {
            serviceJob.schedule();
                    TaskImpl taskConfig = createTask(
            }
        // Remove empty task folder or make task folder empty and then remove it
    }
        }
        synchronized (tasksFolders) {
        private static final int TASK_SLEEP_TIME = 1000;
        synchronized (tasks) {
    @Nullable
import com.google.gson.Gson;
            }

        @Override
        TaskImpl task = createTask(
    @NotNull
        }
    public void deleteTaskConfiguration(@NotNull DBTTask task) throws DBException {
    }
    public void saveConfiguration() {
                if (taskJob.isFinished() || taskJob.isCanceled()) {
            if (id.equals(task.getId())) {

            getProject(),
        runningTasks.add(job);
        List<DBTTask> result = new ArrayList<>();
    public TaskRunJob scheduleTask(@NotNull DBTTask task, @NotNull DBTTaskExecutionListener listener) throws DBException {
            }
        saveConfiguration();
        for (TaskImpl task : tasks) {

        final IStatus result = job.runDirectly(monitor);
        runJob.addJobChangeListener(new JobChangeAdapter() {


                jsonWriter.name(taskFolder.getName());
        TaskRegistry.getInstance().notifyTaskFoldersListeners(new DBTTaskFolderEvent(taskFolder, DBTTaskFolderEvent.Action.TASK_FOLDER_ADD));
    @NotNull

                                          @Nullable DBTTaskFolder parentFolder,
        }
        for (Job task : tasks) {
        }
        }
                    }
        try (OutputStreamWriter osw = new OutputStreamWriter(dsConfigBuffer, StandardCharsets.UTF_8)) {

    private Job serviceJob;
    }
                if (task instanceof TaskImpl) {
    @Override
    @Override

    private static final Gson CONFIG_GSON = new GsonBuilder()
            JSONUtils.serializeProperties(jsonWriter, TaskConstants.TAG_STATE, task.getProperties(), true);
        if (!CommonUtils.isEmpty(tasksFolders)) {

                runningTasks.add((TaskRunJob) event.getJob());
        @Nullable String description,
    }
        }
        @NotNull String label,
        return statisticsFolder.resolve(task.getId());
                throw e;
        return runJob;
            @Override
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    }
        systemDateFormat.setTimeZone(TimeZone.getTimeZone(TimezoneRegistry.getUserDefaultTimezone()));

    @Override
                    if (taskDescriptor == null) {
            }
                project.getId(),
        return tasksFolders.toArray(new DBTTaskFolder[0]);
    private final List<TaskFolderImpl> tasksFolders = new ArrayList<>();
        }
                        log.error("Can't find task descriptor " + task);
import java.text.SimpleDateFormat;

    }
        final Job[] tasks = runningTasks.toArray(Job[]::new);
        if (parentFolder != null) {
                    Date updateTime = systemDateFormat.parse(JSONUtils.getString(taskJSON, TaskConstants.TAG_UPDATE_TIME));
            JSONUtils.field(jsonWriter, TaskConstants.TAG_DESCRIPTION, task.getDescription());
    protected void cancelJobIfNeeded(@NotNull TaskRunJob job) {
import org.eclipse.core.runtime.IProgressMonitor;
            tasks.remove(task);
        }
            && tasksFolders.stream().anyMatch(taskFolder -> taskFolder.getName().equals(folderName))) {
        DBTTaskFolder parentFolder = taskFolder.getParentFolder();
        }
            try (JsonWriter jsonWriter = CONFIG_GSON.newJsonWriter(osw)) {
            }
                        createTime,
    }
            Map<String, Object> taskJSON = (Map<String, Object>) taskMap.getValue();

                    continue;
        return null;
            createTime,
                }
        }
                }
        if (task.isTemporary()) {
                TaskFolderImpl parentFolder = null;
        DBPProject project = getProject();

    }
        protected IStatus run(IProgressMonitor monitor) {

        }
import org.jkiss.dbeaver.DBException;

            parentFolder.addFolderToFoldersList(taskFolder);
                        .filter(e -> e.getName().equals(property.toString()))
            }
                JSONUtils.field(jsonWriter, TaskConstants.TAG_TASK_FOLDER, taskFolder.getName());
import java.time.Duration;
        public ServiceJob() {
        for (DBTTask task : tasks) {
                    }
    public DBTTaskType[] getExistingTaskTypes() {
                try {
            public void aboutToRun(IJobChangeEvent event) {
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                newTask = true;
            task.cancel();
        }
        }
        @NotNull Map<String, Object> properties) throws DBException {
        DBTTask prevTask = getTaskByName(task.getName());
                taskFolder = new TaskFolderImpl(taskFolderName, null, projectMetadata, new ArrayList<>());
                if (property != null) {
 */
            jsonWriter.name(task.getId());
            log.error("Error saving configuration to a file " + TaskConstants.CONFIG_FILE, e);
            }
            id,
    public Path getStatisticsFolder(@NotNull DBTTask task) {
            throw new DBException("Task folder with name '" + taskFolder.getName() + "' is missing");
        @NotNull String id,
    final SimpleDateFormat systemDateFormat;
import org.eclipse.core.runtime.Status;
        }
        for (Map.Entry<String, Map<String, Object>> folderMap : JSONUtils.getNestedObjects(jsonMap, TaskConstants.TASKS_FOLDERS_TAG)) {
import com.google.gson.GsonBuilder;
    public DBPProject getProject() {
import org.jkiss.code.NotNull;
    @NotNull
    }
    @NotNull
                    taskConfig.setMaxExecutionTime(maxExecutionTime);
            JSONUtils.field(jsonWriter, TaskConstants.TAG_UPDATE_TIME, systemDateFormat.format(task.getUpdateTime()));

import org.jkiss.dbeaver.registry.timezone.TimezoneRegistry;
    }
        }
            try {
                JSONUtils.field(jsonWriter, TaskConstants.TAG_MAX_EXEC_TIME, task.getMaxExecutionTime().toSeconds());
            tasksFolders.remove(taskFolder);
                }
            serviceJob.schedule();
                    if (taskFolder != null) {
                result.add(tc);
        TaskFolderImpl taskFolder = searchTaskFolderByName(taskFolderName);
        });
            jsonWriter.name(TaskConstants.TASKS_FOLDERS_TAG);
            jsonWriter.beginObject();
            for (TaskRunJob taskJob : copyOfRunningTasks) {
        }
        if (parentFolder != null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        TaskRegistry.getInstance().notifyTaskFoldersListeners(new DBTTaskFolderEvent(taskFolder, DBTTaskFolderEvent.Action.TASK_FOLDER_REMOVE));
            DBTTaskScheduleInfo info = scheduler.getScheduledTaskInfo(task);
        } catch (IOException e) {
                tasks.add((TaskImpl) task);
            CopyOnWriteArraySet<TaskRunJob> copyOfRunningTasks = new CopyOnWriteArraySet<>(runningTasks);
            if (taskFolder == null) {
            DBWorkbench.getPlatform().getTaskController().saveTaskConfigurationFile(
    private static final Log log = Log.getLog(TaskManagerImpl.class);
            return;
                scheduler.removeTaskSchedule(task, info);
        if (!CommonUtils.isEmpty(folderTasks)) {
        return job.getTaskRunStatus();

            @Override
    @NotNull
        if (task.getTaskFolder() != null) {

        return TaskRegistry.getInstance();
 *
            log.error("Error processing config file", e);
                                          @NotNull String folderName,
                    DBTTaskType taskDescriptor = getRegistry().getTaskType(task);
        @NotNull DBTTaskType taskDescriptor,
    }
    @Override
                cancelJobIfNeeded(taskJob);

            for (DBTTask task : folderTasks) {
                DBWorkbench.getPlatform().getTaskController().saveTaskConfigurationFile(project.getId(), TaskConstants.CONFIG_FILE, null);
        if (!tasksFolders.contains(taskFolder)) {
import org.jkiss.dbeaver.model.task.*;
            }
            properties
            parentFolder.removeFolderFromFoldersList(taskFolder);
 * See the License for the specific language governing permissions and
        }
        return result.toArray(new DBTTask[0]);
            id,
import java.io.ByteArrayOutputStream;
            }
                }


                return task;
        saveConfiguration();
    protected String loadConfigFile() throws DBException {
            if (!tasks.contains(task)) {
            updateTime,
                }
            if (name.equalsIgnoreCase(task.getName())) {

        jsonWriter.beginObject();
                                tasksFolders.add(taskFolder);

        );
    @Override
import org.jkiss.dbeaver.model.rm.RMConstants;
                        label,
        }
        try {
    @Override
        }
        return DBWorkbench.getPlatform()

        }
            if (info != null) {
    }
            tasksFolders.add(taskFolder);
            if (error instanceof DBException e) {
        saveConfiguration();
                        tasks.add(taskConfig);
import org.jkiss.utils.CommonUtils;
 *
            String folderName = folderMap.getKey();
                    String task = JSONUtils.getString(taskJSON, TaskConstants.TAG_TASK);
    @Override
        final TaskRunJob job = createJob((TaskImpl) task, listener);
                    if (first.isPresent()) {

}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            }
            taskType,
import org.jkiss.dbeaver.model.impl.app.BaseProjectImpl;
        if (prevTask != null && prevTask != task) {

    public Path getStatisticsFolder() {
        }
            : new ArrayList<>());
        DBTScheduler scheduler = TaskRegistry.getInstance().getActiveSchedulerInstance();
import org.jkiss.code.Nullable;
        // Move all task to the parent folder if it exists
        final Throwable error = result.getException();
    public TaskManagerImpl(BaseProjectImpl projectMetadata, Path statisticsFolder) {
                } catch (DBException ex) {


    }
        Set<DBTTaskType> result = new LinkedHashSet<>();
    }
    @Override

        TaskImpl taskConfig = new TaskImpl(
    }
                        taskFolder.addTaskToFolder(taskConfig);
        .create();
    @NotNull
        return taskFolder;
            taskDescriptor,
                }
            return;

            .loadTaskConfigurationFile(getProject().getId(), TaskConstants.CONFIG_FILE);

                            }
        if (!CommonUtils.isEmpty(tasksFolders)
    @Override
            JSONUtils.field(jsonWriter, TaskConstants.TAG_TASK, task.getType().getId());
                        if (!tasksFolders.contains(taskFolder)) {
        String configFile = null;

                jsonWriter.endObject();

public class TaskManagerImpl implements DBTTaskManager {
                    Duration maxExecutionTime = Duration.ofSeconds(JSONUtils.getInteger(taskJSON, TaskConstants.TAG_MAX_EXEC_TIME));
            }
import java.nio.file.Path;
        return new TaskImpl(getProject(), type, TaskConstants.TEMPORARY_ID, label, label, new Date(), null, null);
            serviceJob = new ServiceJob();
                throw new DBException("Error executing task", error);
                        updateTime,
        ByteArrayOutputStream dsConfigBuffer = new ByteArrayOutputStream(10000);

            label,
            jsonWriter.beginObject();
    private final Path statisticsFolder;
            JSONUtils.field(jsonWriter, TaskConstants.TAG_CREATE_TIME, systemDateFormat.format(task.getCreateTime()));
    @NotNull
    @NotNull
    public DBTTask[] getAllTasks() {
                if (!id.startsWith(TaskConstants.TASKS_FOLDERS_TAG)) {
    public void removeTaskFolder(@NotNull DBTTaskFolder taskFolder) throws DBException {


        return runJob;
                    log.error("Error creating tasks folder.", ex);
                    Optional<TaskFolderImpl> first = tasksFolders.stream()
        }
    @Override
                        parentFolder = first.get();
            createTime,

                synchronized (tasksFolders) {
                    Map<String, Object> state = JSONUtils.getObject(taskJSON, TaskConstants.TAG_STATE);
            }
    public void updateConfiguration() {

    private void serializeTasks(@NotNull JsonWriter jsonWriter) throws IOException {
                        state

        .setPrettyPrinting()
            label,
                    String description = JSONUtils.getString(taskJSON, TaskConstants.TAG_DESCRIPTION);
        boolean newTask = false;
            throw new DBException("Task with name '" + label + "' already exists");
            return;
    @Nullable
        for (DBTTask tc : tasks) {
    @Override
    public DBTTaskFolder[] getTasksFolders() {
    private final List<TaskImpl> tasks = new ArrayList<>();
                }
        @Nullable String description,
    }


            }
 */
            log.warn("The user has no permission to see tasks for this project: " + getProject().getDisplayName());
    @Override
            log.error("Error loading task configuration file.", e);
                    }
            for (TaskFolderImpl taskFolder : tasksFolders) {
        } catch (Exception e) {
            throw new DBException("Task with name '" + task.getName() + "' already exists");
        try {
            schedule(TASK_SLEEP_TIME);
    }
        }
        return task;
            JSONUtils.field(jsonWriter, TaskConstants.TAG_LABEL, task.getName());
        }
        }
        if (CommonUtils.isNotEmpty(taskFolderName)) {

import java.util.concurrent.CopyOnWriteArraySet;
                return task;
    private TaskFolderImpl searchTaskFolderByName(String taskFolderName) {
                        description,
    }
        @Nullable String taskFolderName,

        TaskRegistry.getInstance().notifyTaskListeners(
    public DBTTask[] getAllTaskByType(DBTTaskType task) {
    @Override
        return result.toArray(new DBTTaskType[0]);
    private final Set<TaskRunJob> runningTasks = Collections.synchronizedSet(new HashSet<>());
    }
                }
                TaskConstants.CONFIG_FILE, dsConfigBuffer.toString(StandardCharsets.UTF_8));
    }

            } else {
        try {
                                          @Nullable DBTTask[] folderTasks) throws DBException {
                    Date createTime = systemDateFormat.parse(JSONUtils.getString(taskJSON, TaskConstants.TAG_CREATE_TIME));
        } catch (Exception e) {
import org.jkiss.dbeaver.model.DBUtils;
        if (CommonUtils.isEmpty(configFile)) {
                    ((TaskImpl) task).setTaskFolder(parentFolder);
        if (scheduler != null) {
                        }
            return Status.OK_STATUS;
                        .findFirst();
    @NotNull
        }
    @Override

            jsonWriter.endObject();
    @NotNull
            new DBTTaskEvent(
                log.warn("Error parsing task configuration", e);
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (serviceJob == null) {
import org.jkiss.dbeaver.model.app.DBPProject;
    }
    public DBTTask createTask(
        }
            jsonWriter.endObject();
            return;
        TaskFolderImpl taskFolder = null;
    @Override
        loadConfiguration();

        return !runningTasks.isEmpty();
                    JSONUtils.field(jsonWriter, TaskConstants.TAG_PARENT, taskFolder.getParentFolder().getName());
    @Override
 * You may obtain a copy of the License at
    @Override
        @Nullable TaskFolderImpl taskFolder,
    public DBTTask getTaskByName(@NotNull String name) {
 * TaskManagerImpl
                    String label = CommonUtils.toString(JSONUtils.getString(taskJSON, TaskConstants.TAG_LABEL), id);
            } catch (Exception e) {
        jsonWriter.setIndent("\t");
    public DBTTaskFolder createTaskFolder(@NotNull DBPProject project,
        List<DBTTask> folderTasks = taskFolder.getTasks();
        }
    @Override
                    serializeTasks(jsonWriter);
            }
        TaskRunJob runJob = new TaskRunJob(task, Locale.getDefault(), listener);
        .serializeNulls()
            description,
    }
                    TaskFolderImpl taskFolder = searchTaskFolderByName(taskFolderName);
        synchronized (tasksFolders) {

        this.systemDateFormat = new SimpleDateFormat(GeneralUtils.DEFAULT_TIMESTAMP_PATTERN, Locale.ENGLISH);
            createTime,
        @NotNull Map<String, Object> properties
            if (tc.getType() == task) {
            if (taskFolder != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            setSystem(true);
        // does nothing.

            runningTasks.remove(job);

        this.statisticsFolder = statisticsFolder;
    @NotNull
        for (DBTTask task : tasks) {
            public void done(IJobChangeEvent event) {
        runJob.schedule();
        runningTasks.remove(job);
    }
            log.error(e);
        TaskRegistry.getInstance().notifyTaskListeners(new DBTTaskEvent(task, DBTTaskEvent.Action.TASK_REMOVE));
            }
        Map<String, Object> jsonMap = JSONUtils.parseMap(CONFIG_GSON, new StringReader(configFile));
    }
        return null;
    ) {
                        continue;
            description,
        synchronized (tasks) {
import java.io.StringReader;
        }
    @Override
        taskConfig.setProperties(properties);
        }
            serviceJob = new ServiceJob();
package org.jkiss.dbeaver.registry.task;
        @NotNull String label,
            .getTaskController()
            if (CommonUtils.isNotEmpty(folderName)) {
        @NotNull DBTTaskType taskType,
    }

    public void updateTaskConfiguration(@NotNull DBTTask task) throws DBException {
        );
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.json.JSONUtils;
            if (task.getMaxExecutionTime().isPositive()) {
    private final BaseProjectImpl projectMetadata;
        String id = UUID.randomUUID().toString();
import com.google.gson.stream.JsonWriter;
    public DBTTaskRunStatus runTask(@NotNull DBRProgressMonitor monitor, @NotNull DBTTask task, @NotNull DBTTaskExecutionListener listener) throws DBException {
        if (getTaskByName(label) != null) {
        this.projectMetadata = projectMetadata;
import java.io.OutputStreamWriter;


        return projectMetadata;
        Date createTime = new Date();
import java.util.*;
            }
import com.google.gson.Strictness;
                    String taskFolderName = JSONUtils.getString(taskJSON, TaskConstants.TAG_TASK_FOLDER);
/*
                        taskFolder,
    }
    public DBTTask createTemporaryTask(@NotNull DBTTaskType type, @NotNull String label) {
            throw new DBException("Task folder with name '" + folderName + "' already exists");
        if (error != null) {
            // Remove folder from parent
        }
        for (Map.Entry<String, Object> taskMap : jsonMap.entrySet()) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    private void loadConfiguration() {
    public DBTTaskRegistry getRegistry() {
