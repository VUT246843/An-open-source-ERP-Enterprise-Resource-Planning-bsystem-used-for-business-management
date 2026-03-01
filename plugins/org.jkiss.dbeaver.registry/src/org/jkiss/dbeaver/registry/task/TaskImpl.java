            } catch (IOException e) {
    public Duration getMaxExecutionTime() {
        }
    @NotNull
        @NotNull String label,
        this.label = label;
    }
import java.time.Duration;
import org.jkiss.code.NotNull;
    public Map<String, Object> getProperties() {
    }
        .create();
 * You may obtain a copy of the License at
    @Override
                log.error("Can't create task log folder '" + taskStatsFolder.toAbsolutePath() + "'", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (create && !Files.exists(taskStatsFolder)) {
        } catch (IOException e) {
        }

    @Override
                if (runs == null) {
        this.label = label;
 * Licensed under the Apache License, Version 2.0 (the "License");

    @NotNull
    @Override
        this.updateTime = updateTime;

    public void cleanRunStatistics() {
        TaskRegistry.getInstance().notifyTaskListeners(new DBTTaskEvent(this, DBTTaskEvent.Action.TASK_UPDATE));
        loadRunsIfNeeded();
import org.jkiss.dbeaver.model.task.*;
    @Override
                log.error("Can't delete logs folder '" + statsFolder.toAbsolutePath() + "'", e);
                runs.remove(0);
            }
import com.google.gson.GsonBuilder;
        this.properties = new LinkedHashMap<>(properties);
    public static String META_FILE_NAME = "meta.json";
                }
    }
    private volatile List<DBTTaskRun> runs;
            }
    }
                }
        if (Files.exists(statsFolder)) {
        return type;

 * limitations under the License.
    public boolean isTemporary() {
        @NotNull DBPProject project,
    public InputStream getRunLogInputStream(@NotNull DBTTaskRun run) throws DBException, IOException {
        return runs.toArray(DBTTaskRun[]::new);
        return description;

        @NotNull Date createTime,
    public void removeRun(DBTTaskRun taskRun) {
            try (Stream<Path> list = Files.list(statsFolder)) {
            runs.clear();
    }


    @NotNull
/**
    }
                    log.error("Can't delete log file '" + runLog.toAbsolutePath() + "'", e);
        this.type = type;
    @NotNull

    }
            for (int i = 0; i < runs.size(); i++) {
import java.nio.file.Files;
 * See the License for the specific language governing permissions and

    ) {
    }

        return getTaskStatsFolder(false).resolve(TaskUtils.buildRunLogFileName(run.getId()));

    @Override

        }
 *
    @Override
    private String label;

        TaskRegistry.getInstance().notifyTaskListeners(new DBTTaskEvent(this, DBTTaskEvent.Action.TASK_UPDATE));
                Files.delete(statsFolder);
        return maxExecutionTime;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

import com.google.gson.Gson;
                return;
package org.jkiss.dbeaver.registry.task;
import java.util.stream.Stream;
        this.taskFolder = taskFolder;
import java.io.InputStream;
            while (runs.size() > MAX_RUNS_IN_STATS) {
            }
        return label;

    private final DBPProject project;
        @Nullable String description,
    @Override
    @Override
import org.jkiss.dbeaver.Log;
                        Files.delete(file);
        if (runs != null) {

        return id + " " + label + " (" + type.getName() + ")";

        loadRunsIfNeeded();
    void updateRun(@NotNull TaskRunImpl taskRun) {
    public String toString() {
    }
            }
    @Override
            loadRunsIfNeeded();
            }
    }
            flushRunStatistics(runs);
    public String getDescription() {
    @Override
 *
 * DBeaver - Universal Database Manager
    @Override
    public DBTTaskFolder getTaskFolder() {
        this.description = description;
    public void setUpdateTime(Date updateTime) {
    private final String id;
    public DBTTaskRun getLastRun() {

    }
import java.util.stream.Collectors;
    protected void flushRunStatistics(@NotNull List<? extends DBTTaskRun> runs) {
                for (Path file : taskFiles) {
    }
            synchronized (this) {

        synchronized (this) {
    public Date getUpdateTime() {


    @Override
        }
    public void setTaskFolder(@Nullable DBTTaskFolder taskFolder) {

    @Nullable

        return TaskUtils.loadRunStatistics(getTaskStatsFolder(false).resolve(META_FILE_NAME), gson);
    }
        return properties;
        Path statsFolder = getTaskStatsFolder(false);
 * TaskImpl
        @Nullable Date updateTime,
    @NotNull
import org.jkiss.dbeaver.utils.GeneralUtils;

import org.jkiss.code.Nullable;

        this.maxExecutionTime = maxExecutionTime;
        return createTime;

        this.type = type;
        return project;

    protected TaskImpl(
        this.createTime = createTime;
    private Date updateTime;
        return taskFolder;
    public void setDescription(@NotNull String description) {
                Files.createDirectories(taskStatsFolder);
    @Override
            Path runLog = getRunLog(taskRun);
    private static final Gson gson = new GsonBuilder()
        return Files.newInputStream(Objects.requireNonNull(getRunLog(run)));

    public void refreshRunStatistics() {
    @Override
    }
        return updateTime;
                .filter(run -> run instanceof TaskRunImpl)
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (runs == null) {

            } catch (IOException e) {

    }
    @NotNull
                    Files.deleteIfExists(runLog);
    public Date getCreateTime() {
    @Override
    }
        .setStrictness(Strictness.LENIENT)
    public DBPProject getProject() {
    @NotNull
    }
        Path metaFile = getTaskStatsFolder(true).resolve(META_FILE_NAME);
                }
    }
    private static final int MAX_RUNS_IN_STATS = 100;
    @Override
    }
        TaskRegistry.getInstance().notifyTaskListeners(new DBTTaskEvent(this, DBTTaskEvent.Action.TASK_UPDATE));
import com.google.gson.Strictness;
    public String getName() {
    protected Path getTaskStatsFolder(boolean create) {
            if (!runs.remove(taskRun)) {

import java.io.IOException;
        synchronized (this) {

        this.project = project;
                try {

    private Duration maxExecutionTime = Duration.ZERO;
        flushRunStatistics(List.of());
        this.description = description;
        }
    @NotNull

    }
    @NotNull
                    break;
    }
    @NotNull
    }
            try {
        @NotNull DBTTaskType type,
            writer.write(gson.toJson(new RunStatistics(filteredRuns)));
            }
        this.taskFolder = folder;

    @Nullable

                    runs.set(i, taskRun);
    protected List<? extends DBTTaskRun> loadRunStatistics() {
        .setDateFormat(GeneralUtils.DEFAULT_TIMESTAMP_PATTERN)
    @Override

        @NotNull String id,
    @Override
    @Nullable
    }
    }
        try (Writer writer = Files.newBufferedWriter(metaFile)) {
/*
    public String getId() {
    }
 */
    @Override

        Path taskStatsFolder = project.getTaskManager().getStatisticsFolder().resolve(id);

                }
        }
 * Unless required by applicable law or agreed to in writing, software
                        log.error("Can't delete log item '" + file.toAbsolutePath() + "'", e);

        synchronized (this) {
    public DBTTaskType getType() {
    }
    private DBTTaskFolder taskFolder;
                } catch (IOException e) {
    public void setMaxExecutionTime(@NotNull Duration maxExecutionTime) {
    private static final Log log = Log.getLog(TaskImpl.class);
    void addNewRun(@NotNull DBTTaskRun taskRun) {
                List<Path> taskFiles = list.toList();

        @Nullable DBTTaskFolder folder


        return TaskConstants.TEMPORARY_ID.equals(id);
    }
    }
    private Date createTime;
import java.nio.file.Path;
    private Map<String, Object> properties;
                    } catch (IOException e) {
    }
            runs.add(taskRun);
                    }
 */
    private String description;
import java.util.*;
    private DBTTaskType type;
import org.jkiss.dbeaver.model.DBPNamedObject2;

    @NotNull
                    try {
 *
import java.io.Writer;
            loadRunsIfNeeded();
public class TaskImpl implements DBTTask, DBPNamedObject2 {
            final List<TaskRunImpl> filteredRuns = runs.stream()
            }
    }
        runs = new ArrayList<>(loadRunStatistics());
 * you may not use this file except in compliance with the License.
        TaskRegistry.getInstance().notifyTaskListeners(new DBTTaskEvent(this, DBTTaskEvent.Action.TASK_UPDATE));
            loadRunsIfNeeded();
            if (runLog != null) {
                .collect(Collectors.toList());
    @Override
        this.updateTime = updateTime;
    }
    @Nullable
    public DBTTaskRun[] getAllRuns() {

    public Path getRunLog(@NotNull DBTTaskRun run) {
                if (runs.get(i).getId().equals(taskRun.getId())) {
    }
            flushRunStatistics(runs);
        return runs.isEmpty() ? null : runs.get(runs.size() - 1);
    private void loadRunsIfNeeded() {
    public void setName(@NotNull String label) {
}
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.app.DBPProject;

                .map(run -> (TaskRunImpl) run)

        return id;
            flushRunStatistics(runs);

                    runs = new ArrayList<>(loadRunStatistics());
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return taskStatsFolder;
        this.id = id;

    public void setProperties(@NotNull Map<String, Object> properties) {
    public void setType(DBTTaskType type) {
            log.error("Error writing task run statistics", e);
