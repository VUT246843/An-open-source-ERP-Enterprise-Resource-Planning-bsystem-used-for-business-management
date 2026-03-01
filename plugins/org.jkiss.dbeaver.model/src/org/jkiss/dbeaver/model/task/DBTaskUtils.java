        boolean confirmationRequired = false;
    }
        if (!confirmTask(task, taskLog, logWriter, (sb, t) -> false)) {
        context.setDefaultSchema(CommonUtils.toString(contextMap.get("defaultSchema"), null));
    }
        } else {
            taskState.remove(TASK_CONTEXT);
            throw new InterruptedException(ModelMessages.tasks_restore_confirmation_cancelled_message);
        }
        if (variables == null) {
            String dbObjectNames = "";
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;

        }

        }
import org.jkiss.utils.CommonUtils;
        if (context.getDefaultCatalog() != null) {
        return false;
        Map<String, Object> contextMap = (Map<String, Object>) taskState.get(TASK_CONTEXT);

import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            logWriter.println(ModelMessages.tasks_restore_confirmation_cancelled_message);
            variables = new LinkedHashMap<>();
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            taskState.remove(DBTaskUtils.TASK_VARIABLES);
    public static void confirmTaskOrThrow(DBTTask task, Log taskLog, PrintStream logWriter) throws InterruptedException {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.List;
            connection.getHostName(),
        if (task == null) {
            taskLog.warn(ModelMessages.tasks_restore_confirmation_cancelled_message);

    public static void setVariables(@NotNull Map<String, Object> taskState, @Nullable Map<String, Object> variables) {
                List<String> dbObjectIds = (List<String>)dbObjectIdsObj;
        if (messageOrNull != null) {
        final DBTTaskHandler handler = task.getType().createHandler();

import java.util.stream.Collectors;

            throw new InterruptedException(ModelMessages.tasks_restore_confirmation_cancelled_message);
    }
            messageBuilder.append(NLS.bind(messageOrNull, connectionInfo + "\n" + dbObjectNames, inputFile)).append("\n");
            taskContext.put("transactionIsolation", context.getTransactionIsolation());
    public static DBTTaskContext extractContext(@NotNull DBCExecutionContext executionContext) {
public class DBTaskUtils {
                variables.put(task, vars);
    public static void setVariables(@NotNull DBTTask task, @Nullable Map<String, Object> variables) {
        DBTTaskContext context = new DBTTaskContext();
import org.jkiss.dbeaver.runtime.DBWorkbench;

            return true;
            Object dbObjectIdsObj = task.getProperties().get("databaseObjects");
                if (isolation != null) {
    }
import java.util.LinkedHashMap;
                context.setDefaultCatalog(defaultCatalog.getName());
            DBSCatalog defaultCatalog = defaults.getDefaultCatalog();
import java.io.PrintStream;
            taskState.put(DBTaskUtils.TASK_VARIABLES, variables);
        return variables;
                context.getDefaultSchema());

    }
        }
import org.jkiss.code.NotNull;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
 * Task utils
                }
        if (defaults != null) {
        Map<String, Object> variables = (Map<String, Object>) state.get(TASK_VARIABLES);
            final Map<String, Object> vars = getVariables(task);
            taskContext.put("defaultCatalog", context.getDefaultCatalog());
            String connectionInfo = "";
            confirmationRequired = true;
    public static final String TASK_CONTEXT = "taskContext";

        context.setDefaultCatalog(CommonUtils.toString(contextMap.get("defaultCatalog"), null));
        taskState.put(TASK_CONTEXT, taskContext);
    ) throws DBException {
    }

        if (context.getDefaultSchema() != null) {
        confirmationRequired |= extraConfirmationsCollector.collect(messageBuilder, task); 
        Map<String, Object> state = task.getProperties();
    }

        DBTTaskContext context = new DBTTaskContext();
 *
                        ((List<String>) dbObjectIdsObj).getFirst()
            CommonUtils.isEmpty(databaseName) ? "" : "/" + databaseName
            } catch (Throwable e) {
    public static String buildConnectionDescription(@NotNull DBPDataSourceContainer container, @Nullable String databaseName) {
            }
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Nullable
import org.jkiss.code.Nullable;
import java.util.Map;
        taskContext.put("autoCommit", context.isAutoCommit());
        @NotNull Predicate<DBTTask> predicate,
    public static final String TASK_PROMPT_VARIABLES = "promptTaskVariables";
        );

        }
        return confirmTask(task, taskLog, logWriter, (sb, t) -> false);
    public static void initFromContext(DBRProgressMonitor monitor, DBTTask task, DBCExecutionContext executionContext) throws DBException {
                DBPTransactionIsolation isolation = txnManager.getTransactionIsolation();
            if (defaultSchema != null) {
        setVariables(task.getProperties(), variables);
        context.setTransactionIsolation(CommonUtils.toInt(contextMap.get("transactionIsolation"), -1));
                log.debug(e);
                context.setAutoCommit(txnManager.isAutoCommit());

        String messageOrNull = task.getType().confirmationMessageIfNeeded();
    }

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            return false;
        }
 * DBeaver - Universal Database Manager
        if (!collectConfirmationMessages(messageBuilder, task, extraConfirmationsCollector)) {
/*
import java.util.Optional;
        DBPConnectionConfiguration connection = container.getConnectionConfiguration();
    public static boolean confirmTask(DBTTask task, Log taskLog, PrintStream logWriter, TaskConfirmationsCollector extraConfirmationsCollector) {
            messageBuilder.append("\n").append(ModelMessages.tasks_restore_confirmation_message);
import org.jkiss.dbeaver.model.DBUtils;
 */
                    context.setTransactionIsolation(isolation.getCode());
    }
        return context;
 * See the License for the specific language governing permissions and
                    .collect(Collectors.joining(", "));

        } else {
package org.jkiss.dbeaver.model.task;
            }
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
    public static void saveTaskContext(@NotNull Map<String, Object> taskState, @Nullable DBTTaskContext context) {
                dbObjectNames = dbObjectIds.stream()

                }
}
    @NotNull
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

            return null;
        }


                    }
            return;

    }
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.Log;
        if (context.getTransactionIsolation() >= 0) {

        }
                null,
    public static void collectTaskVariables(
    }
        @NotNull DBTTask task,
import org.jkiss.dbeaver.model.exec.DBExecUtils;
        }
        }
 * limitations under the License.
            DBExecUtils.setExecutionContextDefaults(monitor, executionContext.getDataSource(), executionContext,


                if (!((List<?>) dbObjectIdsObj).isEmpty()) {
                context.setDefaultSchema(defaultSchema.getName());

        StringBuilder messageBuilder = new StringBuilder();
    public static Map<String, Object> getVariables(@NotNull DBTTask task) {
                        connectionInfo =  DBTaskUtils.buildConnectionDescription(container, null);
        if (predicate.test(task)) {
                context.getDefaultCatalog(),

            connection.getHostPort(),
                    if (container != null) {
        DBCExecutionContextDefaults defaults = executionContext.getContextDefaults();
                    );
    public static interface TaskConfirmationsCollector {
        }
            }
        context.setAutoCommit(CommonUtils.toBoolean(contextMap.get("autoCommit")));
        if (!CommonUtils.isEmpty(variables)) {

    public static boolean confirmTask(DBTTask task, Log taskLog, PrintStream logWriter) {
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return true;
        return CONNECTION_DESCRIPTION_TEMPLATE.formatted(container.getName(),
 * Unless required by applicable law or agreed to in writing, software
                        task.getProject(),
/**
    private static final Log log = Log.getLog(DBTaskUtils.class);
        if (logWriter != null) {
            try {
        if (context == null) {
            DBSSchema defaultSchema = defaults.getDefaultSchema();
        }
import org.jkiss.dbeaver.model.app.DBPProject;
        boolean collect(StringBuilder messageBuilder, DBTTask task);
        if (taskLog != null) {
 */
        @NotNull Map<DBTTask, Map<String, Object>> variables
import java.util.function.Predicate;
        return context;
            if (dbObjectIdsObj != null) {
        }
            taskContext.put("defaultSchema", context.getDefaultSchema());
 * Licensed under the Apache License, Version 2.0 (the "License");
        return confirmationRequired;
        }

 * you may not use this file except in compliance with the License.
        DBTTaskContext context = loadTaskContext(task.getProperties());
import org.eclipse.osgi.util.NLS;
    public static void confirmTaskOrThrow(DBTTask task, Log taskLog, PrintStream logWriter, TaskConfirmationsCollector extraConfirmationsCollector) throws InterruptedException {
            if (!vars.isEmpty()) {
            Optional<String> inputFileKey = task.getProperties().keySet().stream().filter(k -> k.contains("inputFile")).findFirst();
        if (contextMap == null) {
            logWriter.println();
        }
    public static boolean collectConfirmationMessages(StringBuilder messageBuilder, DBTTask task, TaskConfirmationsCollector extraConfirmationsCollector) {
    }
        if (context != null) {

    public static final String CONNECTION_DESCRIPTION_TEMPLATE = "[%s] (%s - %s:%s%s)";
        DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
        if (DBWorkbench.getPlatformUI().confirmAction(NLS.bind(ModelMessages.tasks_restore_confirmation_title, task.getName()), messageBuilder.toString())) {
        }
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
            container.getDriver(),
        if (handler instanceof DBTTaskVariableCollector collector) {
        if (!confirmTask(task, taskLog, logWriter, extraConfirmationsCollector)) {
    public static final String TASK_VARIABLES = "taskVariables";
                    .map(DBUtils::getObjectNameFromId)
            if (defaultCatalog != null) {
        if (txnManager != null) {
    }
        if (DBWorkbench.getPlatform().getApplication().isHeadlessMode()) {
    public static boolean isTaskExists(DBTTask task) {
 * You may obtain a copy of the License at
        
            return true;
 *
        }
        Map<String, Object> taskContext = new LinkedHashMap<>();
            logWriter.println();
                    DBPDataSourceContainer container = DBUtils.findDataSourceByObjectId(
            collector.collectTaskVariables(task, predicate, variables);
        return task.getProject().getTaskManager().getTaskById(task.getId()) != null;
        }
            }
            }
    public static DBTTaskContext loadTaskContext(@NotNull Map<String, Object> taskState) {
            String inputFile = inputFileKey.isPresent() ? task.getProperties().get(inputFileKey.get()).toString() : "file";
 *
        }
