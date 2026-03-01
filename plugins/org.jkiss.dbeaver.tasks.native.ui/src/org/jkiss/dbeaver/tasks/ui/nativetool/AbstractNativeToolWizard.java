            UIUtils.run(getContainer(), true, true, monitor -> {
import org.jkiss.dbeaver.model.connection.LocalNativeClientLocation;

        return super.getProject();
            DBWorkbench.getPlatformUI().showError("Settings load", "Error loading wizard settings", e);
    }
        }
    protected String getDefaultWindowTitle() {

import org.jkiss.dbeaver.DBException;
    protected DBPPreferenceStore getPreferenceStore() {

import org.jkiss.utils.CommonUtils;
    public DBPProject getProject() {
    @Override
    protected boolean isSingleTimeWizard() {
        this.preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
        if (settings.getDataSourceContainer() != null) {
        TaskConfigurationWizardDialog container = getContainer();



                }
            container.enableButtonsAfterProgress();
    @NotNull
        } catch (InvocationTargetException e) {
    public boolean performFinish() {
import org.jkiss.dbeaver.utils.HelpUtils;

 * Unless required by applicable law or agreed to in writing, software
        this.settings = createSettings();
        if (!validateClientFiles()) {
    protected boolean isNativeClientHomeRequired() {
        this.taskTitle = task.getType().getName();
        if (getCurrentTask() != null && !isToolTask()) {

        showLogPage();
    }
                    settings.setClientHome(null);
        } catch (Exception e) {
import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;
 *
            // Execute directly - without task serialize/deserialize
                currentPage.setErrorMessage(NLS.bind(TaskNativeUIMessages.tools_wizard_message_client_home_not_found, clientHomeId));
    }
    public void initializeWizard(Composite pageContainer) {
import org.jkiss.dbeaver.tasks.ui.wizard.TaskWizardExecutor;
    protected String taskTitle;
        UIUtils.showMessageBox(
                DBPNativeClientLocation clientHome = DBUtils.findObject(nativeClientLocations, clientHomeId);
                if (settings.getClientHome() == null) {
            getContainer().showPage(logPage);
                }
import org.jkiss.code.NotNull;
            executor.executeTask();

                } catch (DBException e) {
    @Override
        return false;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            TaskWizardExecutor executor = new TaskWizardExecutor(getRunnableContext(), temporaryTask, log, logPage.getLogWriter());
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull IWorkbenchWindow window,
    }
 * You may obtain a copy of the License at
        }
    extends TaskConfigurationWizard<SETTINGS> {
                    return;
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
            this.preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();


            return false;
    protected void onError() {
import org.jkiss.dbeaver.ui.UIUtils;
    public TaskConfigurationWizardDialog createWizardDialog(
package org.jkiss.dbeaver.tasks.ui.nativetool;
            return !finished;
            DBWorkbench.getPlatformUI().showError("Download local client file(s)", "Error downloading client file(s)", e.getTargetException());
//        for (BASE_OBJECT object : settings.getDatabaseObjects()) {

    @Override
        }
            return true;
        this.taskTitle = taskTitle;
        if (!isNativeClientHomeRequired() || settings.getClientHome() == null) {
            ((WizardPage) getContainer().getCurrentPage()).setErrorMessage("Error downloading local client file(s)");
            this.preferenceStore = new TaskPreferenceStore(task);

        return true;

     */
        if (!super.canFinish()) {

        try {
import org.jkiss.dbeaver.registry.task.TaskPreferenceStore;
                    // Make local client home from location
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;

        return true;

            getContainer().updateMessage();

    }
    }
                    settings.getClientHome().validateFilesPresence(monitor);
import org.eclipse.ui.IWorkbenchWindow;
                    throw new InvocationTargetException(e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (isNativeClientHomeRequired() && dataSourceContainer != null) {
        if (getContainer().getCurrentPage() != logPage) {
    private String errorMessage;
            DBWorkbench.getPlatformUI().showError(e.getMessage(), "Error running task", e);


        } else {
            } else {

                if (!nativeClientLocations.isEmpty()) {
                    clientHome = new LocalNativeClientLocation(clientHomeId, clientHomeId);
    }
            // Use global store for tool tasks
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
import org.eclipse.swt.widgets.Composite;
        }
        return taskTitle;
                } else {
    void readLocalClientInfo() {
        } catch (InterruptedException e) {
            settings.loadSettings(UIUtils.getDefaultRunnableContext(), getPreferenceStore());
        DBPDataSourceContainer dataSourceContainer = getSettings().getDataSourceContainer();
        return true;
                }
                    clientHome = getSettings().findNativeClientHome(clientHomeId);
        return settings;
            taskTitle,
    }
 *
            DBTTask temporaryTask = getProject().getTaskManager().createTemporaryTask(getTaskType(), getTaskType().getName());
//            str.append(object.getName());
                    getContainer().updateMessage();
            return false;
            getShell(),
 * you may not use this file except in compliance with the License.

                                            TaskNativeUIMessages.tools_wizard_message_no_client_home_link,
    public boolean isVerbose() {
    public String getObjectsName() {
    @Override
        }
        StringBuilder str = new StringBuilder();
            });
        WizardPage currentPage = (WizardPage) getStartingPage();
            }
import org.jkiss.dbeaver.model.struct.DBSObject;

 * DBeaver - Universal Database Manager
                }
            return false;
            String clientHomeId = dataSourceContainer.getConnectionConfiguration().getClientHomeId();
    protected void showLogPage() {
        settings.saveSettings(getRunnableContext(), getPreferenceStore());
    @Override
            } else {
        }
//            if (str.length() > 0) str.append(",");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean canFinish() {
    }
    }
        container.disableButtonsOnProgress();
        this.settings.getDatabaseObjects().addAll(databaseObjects);
    private static final Log log = Log.getLog(AbstractNativeToolWizard.class);
        this.logPage = new NativeToolWizardPageLog(taskTitle);
        }
        return new NativeToolWizardDialog(window, this, selection);
        @NotNull Map<String, Object> options
    @NotNull
                                    NLS.bind(
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
        try {
        super.initializeWizard(pageContainer);
    /**
//        }
 */
    }
                }
    }
            SWT.ICON_ERROR);
import java.lang.reflect.InvocationTargetException;
            return super.performFinish();
    }
                                            HelpUtils.getHelpExternalReference("Local-Client-Configuration")));

 */
                if (clientHome == null) {
        super(task);
 * limitations under the License.

    }
    protected final NativeToolWizardPageLog logPage;
            List<DBPNativeClientLocation> nativeClientLocations = dataSourceContainer.getDriver().getNativeClientLocations();
    private final SETTINGS settings;
        return str.toString();
import org.eclipse.jface.wizard.WizardPage;
 * Abstract wizard
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;
    }
import org.jkiss.dbeaver.model.DBUtils;
    @Override
import java.util.List;
}
        return preferenceStore;
    private final DBPPreferenceStore preferenceStore;
     * @return true if this wizard can be executed only once
        if (isToolTask()) {
        this.settings = createSettings();
            // ignore
            return settings.getDataSourceContainer().getProject();
import org.eclipse.jface.viewers.IStructuredSelection;


import java.util.Collection;
            if (settings.getClientHome() == null) {
import org.jkiss.dbeaver.model.app.DBPProject;

import org.eclipse.swt.SWT;
    public SETTINGS getSettings() {
 *
    protected AbstractNativeToolWizard(@NotNull Collection<BASE_OBJECT> databaseObjects, @NotNull String taskTitle) {
    private boolean finished;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private boolean validateClientFiles() {
/**
        try {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            saveConfigurationToTask(temporaryTask);
import org.jkiss.dbeaver.model.task.DBTTask;

            getContainer().updateMessage();
import java.util.Map;

                currentPage.setErrorMessage(null);
    }
                settings.setClientHome(clientHome);
        }
        @NotNull IStructuredSelection selection,

        }
            errorMessage == null ? "Internal error" : errorMessage,

        // Save settings
        if (isSingleTimeWizard()) {

        }
                    settings.setClientHome(nativeClientLocations.get(0));
import org.eclipse.osgi.util.NLS;
                if (clientHome == null) {
    }
    }
            // We need it because some data producers cannot be serialized properly (e.g. ResultSetDatacontainer - see #7342)
    public AbstractNativeToolWizard(@NotNull DBTTask task) {
    ) {
        } catch (DBException e) {
                try {
        }
/*
    }
        readLocalClientInfo();
 * See the License for the specific language governing permissions and
            container.setCompleteMarkAfterProgress();
            return false;
        this.logPage = new NativeToolWizardPageLog(taskTitle);
            return false;
            }
        return false;
            return false;

                    currentPage.setErrorMessage(TaskNativeUIMessages.tools_wizard_message_no_client_home + "\n " +
public abstract class AbstractNativeToolWizard<SETTINGS extends AbstractNativeToolSettings<BASE_OBJECT>, BASE_OBJECT extends DBSObject, PROCESS_ARG>
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    protected abstract SETTINGS createSettings();
        // [#2917] Finish button is always enabled (!finished && super.canFinish())
    protected void onSuccess(long workTime) {

            getContainer().updateButtons();
            if (CommonUtils.isEmpty(clientHomeId)) {
