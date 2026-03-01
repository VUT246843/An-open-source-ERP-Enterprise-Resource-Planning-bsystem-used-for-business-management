            container.disableButtonsOnProgress();
    }
                for (DBSObject object : objectList) {
import org.jkiss.dbeaver.model.exec.DBCSession;

                monitor.done();
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

/*
        } catch (InvocationTargetException e) {
    private SQLToolExecuteSettings settings;
        super.addPages();
                        log.error("Error refreshing object '" + object.getName() + "'", e);
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
        }
    @Override
import org.jkiss.dbeaver.model.sql.task.SQLToolStatistics;
        objectList = settings.getObjectList();
 */
                            monitor.worked(1);
    public SQLToolExecuteHandler getTaskHandler() {
            // Execute task in wizard
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
            saveConfigurationToTask(task);
            });
    }
    public SQLToolTaskWizard(@NotNull DBTTask task) {
        } catch (Exception e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
        SQLTaskExecutor(DBTTask task) {
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPObject;
import org.eclipse.jface.wizard.IWizardPage;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    public void addPages() {
                    } catch (Exception e) {
            DBWorkbench.getPlatformUI().showError(e.getMessage(), TasksSQLUIMessages.sql_tool_task_wizard_message_error_running_task, e);
                                break;
                }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    @Override
import org.jkiss.dbeaver.model.navigator.DBNEvent;
            taskHandler = (SQLToolExecuteHandler) task.getType().createHandler();
    public boolean performFinish() {
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
import org.jkiss.dbeaver.model.struct.DBSObject;

    }
    public SQLToolTaskWizard() {
            pageStatus.addStatistics(object, statistics);

import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteHandler;
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
    private SQLToolTaskWizardPageStatus pageStatus;
    protected String getDefaultWindowTitle() {

            if (taskHandler.needsRefreshOnFinish()) {
import org.jkiss.dbeaver.DBException;
            DBTTask task = getCurrentTask();
                    }
import org.jkiss.dbeaver.tasks.ui.sql.internal.TasksSQLUIMessages;
    public SQLToolExecuteSettings getSettings() {
 *
        settings.loadConfiguration(UIUtils.getDialogRunnableContext(), task.getProperties(), task.getProject());
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and
            container.showPage(pageStatus);
        return getCurrentTask().getType().getId();
    public String getTaskTypeId() {
import java.util.List;
 * DBeaver - Universal Database Manager

        } catch (InterruptedException e) {
    private List<DBSObject> objectList;
            TaskConfigurationWizardDialog container = getContainer();
            TaskWizardExecutor executor = new SQLTaskExecutor(task);
        pageSettings.saveSettings();
            throw new IllegalArgumentException("Error instantiating task type handler", e);

        settings = taskHandler.createToolSettings();
        return settings;
        pageStatus = new SQLToolTaskWizardPageStatus(this);
    }
package org.jkiss.dbeaver.tasks.ui.sql;
        super(task);
        addPage(pageSettings);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
            // Only if task is not temporary
    @Override


        return taskHandler;
                        }
                    try {
        public void handleActionStatistics(DBPObject object, DBEPersistAction action, DBCSession session, List<? extends SQLToolStatistics> statistics) {
            super(SQLToolTaskWizard.this.getRunnableContext(), task, SQLToolTaskWizard.log, SQLToolTaskWizard.this.pageStatus.getLogWriter());
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
            executor.executeTask();
            getContainer().run(true, true, monitor -> {
    }
import org.jkiss.code.NotNull;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
                            objectNode.refreshNode(new DefaultProgressMonitor(monitor), DBNEvent.FORCE_REFRESH);
            return super.performFinish();
    public void saveTaskState(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state) {

    }
    public IWizardPage getNextPage(IWizardPage page) {
        try {
        return getTaskType().getName();
        }



            saveConfigurationToTask(getCurrentTask());
                            if (monitor.isCanceled()) {
        if (page == pageSettings) {

        }
        }
        return super.getNextPage(page);
                refreshOnFinish();

            // ignore
import org.jkiss.dbeaver.ui.UIUtils;
        }


import java.lang.reflect.InvocationTargetException;
        @Override
            return false;
            pageStatus.clearLog();
    @Override
 *
        }
            return false;
        }
    }

        try {
            container.enableButtonsAfterProgress();
    private SQLToolExecuteHandler taskHandler;
    }
            container.setCompleteMarkAfterProgress();
                            }

        if (isRunTaskOnFinish()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
class SQLToolTaskWizard extends TaskConfigurationWizard<SQLToolExecuteSettings> {
        settings.saveConfiguration(state);
    @Override
        addPage(pageStatus);
        } catch (DBException e) {
import java.util.Map;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskWizardExecutor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    private SQLToolTaskWizardPageSettings pageSettings;
                        DBNDatabaseNode objectNode = DBNUtils.getNodeByObject(object);
                        if (objectNode != null) {
                monitor.beginTask("Object refreshing", objectList.size());
        pageSettings = new SQLToolTaskWizardPageSettings(this);

    private void refreshOnFinish() throws Exception {
        try {
            return null;
import org.jkiss.dbeaver.model.sql.task.SQLToolRunListener;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
import org.jkiss.dbeaver.model.task.DBTTask;
            throw new DBCException("Refresh error", e.getTargetException());
    private static final Log log = Log.getLog(SQLToolTaskWizard.class);
import org.jkiss.dbeaver.model.exec.DBCException;

    private class SQLTaskExecutor extends TaskWizardExecutor implements SQLToolRunListener {

