    // Public methods
        for (int i = 0; i < pages.length; i++) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.utils.ArrayUtils;
        }
    }
import org.jkiss.dbeaver.tools.transfer.ui.registry.DataTransferNodeConfiguratorDescriptor;
    @NotNull
        }
        boolean isTask = getCurrentTask() != null;
            }
    @Nullable
            }
                consumers.add(pipe.getConsumer());
    }
            return true;
/*
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
        this.settings = settings;
            this.sourceNode = sourceNode;
import org.eclipse.ui.IImportWizard;

 * DBeaver - Universal Database Manager
                break;
        dialog.open();
        try {
    }
        @Nullable Collection<IDataTransferConsumer<?,?>> consumers,
        @NotNull IStructuredSelection selection,
        settings = null;
                    }

                executor.executeTask();
        return super.canFinish();
                log,

        for (int i = 0; i < pages.length; i++) {
        if (!CommonUtils.isEmpty(settingPages)) {
                    DBSObject databaseObject = producer.getDatabaseObject();
            config.put(DTConstants.PROP_PROCESSOR_TYPE, settings.getProcessor().getId());
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
    public String getTaskTypeId() {
    void loadSettings() {
    }
            @Nullable DataTransferNodeConfiguratorDescriptor nodeConfigurator,
        }
            config.put(DTConstants.PROP_PRODUCER_TYPE, settings.getProducer().getId());
 * distributed under the License is distributed on an "AS IS" BASIS,
            DBWorkbench.getPlatformUI().showError(e.getMessage(), DTUIMessages.data_transfer_wizard_message_init_data_transfer, e);
        }
                        continue;
    ) {
                    "Error loading configuration",
import org.jkiss.dbeaver.tools.transfer.task.DTTaskHandlerTransfer;
            Map<String, Object> processorsSection = new LinkedHashMap<>();

import org.eclipse.ui.IExportWizard;
        try {
                    if (pd.getConsumerType() != null && settings.getConsumer() != null && !settings.getConsumer().getId().equals(pd.getConsumerType())) {
        boolean settingsChanged = nodeSettings.size() != nodes.size();
        return settings;
    }
        } catch (DBException e) {
                }
import org.eclipse.jface.wizard.IWizardPage;
    public static void openWizard(
                    }
        @Nullable Collection<IDataTransferProducer<?>> producers,
            return;
    }
 *

            true,
            nodeSettings.clear();

    }
        addWizardPages(this);
    @Nullable
import org.jkiss.dbeaver.model.DBPContextProvider;

                        }
                    }
        @Nullable Collection<IDataTransferConsumer<?, ?>> consumers,
    @Override
            }
            Map<String, Object> nodeSection = new LinkedHashMap<>();
        config.put("maxJobCount", settings.getMaxJobCount());
 *     http://www.apache.org/licenses/LICENSE-2.0
                getSettings().loadNodeSettings(monitor);
        }
        @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

                            getTaskVariables().putAll(queryParameters);
            DataTransferSettings settings = DataTransferSettings.loadSettings(monitor ->
            return null;
        Class<? extends IDataTransferNode> nodeClass = node.getNodeClass();
        IWizardPage[] pages = getPages();
                    false));
            config.put(DTConstants.PROP_CONSUMER_TYPE, settings.getConsumer().getId());
                    procSettings.put(DTConstants.PROP_NAME, propNames.toString());

        if (curIndex != -1) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (getSettings().isNodeSettingsLoaded()) {
            }
        TaskConfigurationWizardDialog dialog = new TaskConfigurationWizardDialog(workbenchWindow, wizard, selection, Map.of());


        // If it's an editor for existing task, show the page only if the user have multiple choices for consumer/producer
    private void addNodeSettings(DataTransferNodeDescriptor node) {
        IWizardPage[] pages;
    public static DataTransferWizard openWizard(@NotNull DBTTask task)
                }
    @Override
            return null;
        if (initTaskVariables && settings.getInitProducers() != null) {
        if (settingsChanged) {

                DataTransferNodeDescriptor node = registry.getNodeByType(target.getClass());
            config.put(DTConstants.PROP_PROCESSORS_LIST, processorsSection);
                if (node != null && !nodes.contains(node)) {
        }
                    }
                DBWorkbench.getPlatformUI().showError(
            DTUIActivator.getDefault().getDialogSettings(),
        }
            CommonUtils.isEmpty(consumers),
        } else {
            for (NodePageSettings nodePageSettings : this.nodeSettings.values()) {
import org.eclipse.ui.IWorkbenchWindow;

    private static final Log log = Log.getLog(DataTransferWizard.class);
    private DataTransferWizard(@Nullable DBTTask task) {
    public void saveTaskState(
            //wizard.addPage(new DataTransferPageSettings());
                }
            return DTConstants.TASK_EXPORT;
        return true;
        // Save settings if we have task
            @NotNull DataTransferNodeDescriptor sourceNode,
        List<IDataTransferNode<?>> producers = new ArrayList<>();
            // and must be configured by the user by going through the wizard once again.
                    return settings.getNodeSettings(nodePageSettings.sourceNode);
            for (IDataTransferConsumer<?, ?> target : settings.getInitConsumers()) {

        return DTUIMessages.data_transfer_wizard_name;
            page instanceof DataTransferPagePipes ||
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
        } catch (InvocationTargetException e) {
            DBWorkbench.getPlatformUI().showError("Error loading settings", "Error loading data transfer settings", e.getTargetException());
            if (loadErrors.size() == 1) {
                }
                    }
                    childStatuses.add(GeneralUtils.makeExceptionStatus(error));
        ) {
                    }
                    SQLQueryContainer queryContainer;
            config.put(entry.getKey().getSimpleName(), nodeSection);
            DBWorkbench.getPlatformUI().showError("Data transfer error", "Can not open data transfer wizard", e);
                    getSettings());
        return null;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        // First page
            }
        }
    @Override
    protected boolean includePipesConfigurationPage() {
            new DataTransferState(),
                this,
        @Override
            return;

    private static final String CLI_ARG_DEBUG_DISABLE_DT_SETTINGS_SAVE = "dbeaver.debug.disable-data-transfer-settings-save";
    }

                    if (pd.getProducerType() != null && settings.getProducer() != null && !settings.getProducer().getId().equals(pd.getProducerType())) {

            IWizardPage[] pages = getPages();
            for (IWizardPage page : nodePageSettings.pages) {
                // We need it because some data producers cannot be serialized properly (e.g. ResultSetDatacontainer - see #7342)
import org.jkiss.dbeaver.tools.transfer.ui.registry.DataTransferPageType;
            }
        }
                settings.saveSettings(nodeSection);
            }

                        if (nodePage == page) {
        if (!settingsChanged) {
                Map<String, Object> procSettings = new LinkedHashMap<>();
    }
import org.jkiss.dbeaver.Log;

            protected boolean includePipesConfigurationPage() {
    public boolean canFinish() {
                        DBCExecutionContext executionContext = contextProvider.getExecutionContext();
    public static void openWizard(

    ////////////////////////////////////////////////////////
    public void setContainer(IWizardContainer wizardContainer) {
 * limitations under the License.
            consumers,
                            saveTaskContext(executionContext);
    }
    @Override
            }
        DataTransferSettings settings = new DataTransferSettings(
        return this.nodeSettings.get(node.getClass());
                }
            List<Throwable> loadErrors = settings.getState().getLoadErrors();
        };
            for (IDataTransferProducer<?> source : settings.getInitProducers()) {
    public static IDialogSettings getWizardDialogSettings() {
                if (nodePageSettings.sourceNode.getNodeType() == DataTransferNodeDescriptor.NodeType.CONSUMER &&

            // Check does page matches consumer and producer
            NodePageSettings nodePageSettings = entry.getValue();
        }
            DTTaskHandlerTransfer handlerTransfer = new DTTaskHandlerTransfer();
                    if (databaseObject instanceof SQLQueryContainer) {

        public String toString() {
        }
        for (DataTransferPipe pipe : settings.getDataPipes()) {
 * You may obtain a copy of the License at

    class DataTransferWizardExecutor extends TaskProcessorUI {
        DataTransferWizardExecutor(@NotNull DBRRunnableContext staticContext, @NotNull String taskName, @NotNull DataTransferSettings settings) {
        }
                    if (databaseObject instanceof DBPContextProvider contextProvider) {
import org.jkiss.dbeaver.tasks.ui.wizard.TaskProcessorUI;
import org.eclipse.jface.dialogs.IDialogSettings;
            nodes.addAll(registry.getAvailableProducers(objectTypes));

    protected boolean isPageValid(IWizardPage page) {
            return false;
            }
    @Override
            }
        DataTransferSettings.saveNodesLocation(runnableContext, task, state, producers, "producers");
    }

            this.settingsPage = sPages.length == 0 ? null : sPages[0];

                }
                wizard.addPage(settingsPage);
                if (isPageValid(wizardPage)) {
        // Load node settings
            handlerTransfer.executeWithSettings(
                {

        return pages[0];

                        procSettings.put(CommonUtils.toString(prop.getKey()), CommonUtils.toString(prop.getValue()));
    public DataTransferSettings getSettings() {
                    new DataTransferState(),
    @Override

        }
                DataTransferNodeDescriptor node = registry.getNodeByType(source.getClass());

                    // Add later
            }
        List<IDataTransferNode<?>> consumers = new ArrayList<>();
            // When changing processors, the new one doesn't have any properties
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
            for (int i = curIndex - 1; i > 0; i--) {
            return DTConstants.TASK_IMPORT;
import org.jkiss.code.NotNull;
        openWizard(workbenchWindow, producers, consumers, StructuredSelection.EMPTY, includePipesConfigurationPage);


                    // Do not save settings for nodes not involved in this task
                    for (Map.Entry<String, Object> prop : props.entrySet()) {
            }
            });
        }
            super(staticContext, getProject().getTaskManager().createTemporaryTask(getTaskType(), taskName));
    private DataTransferSettings settings;
                : settings.getProducer().getProcessors().length > 1;
        if (ArrayUtils.isEmpty(settings.getInitProducers())) {
                }
                settings);
package org.jkiss.dbeaver.tools.transfer.ui.wizard;
        }
 *
    }
        int curIndex = -1;
            boolean consumerOptional,
    }
    @Override
import java.lang.reflect.InvocationTargetException;
        config.put("showFinalMessage", settings.isShowFinalMessage());
    }
        @Nullable Collection<IDataTransferProducer<?>> producers,
                        queryContainer = (SQLQueryContainer) databaseObject;
        @NotNull DBTTask task,
            isPageValid(page, settings.getProducer()) ||
                        // Consumer doesn't match
        return page instanceof DataTransferPageNodeSettings || super.isTaskConfigPage(page);
    public <T extends IDataTransferSettings> T getPageSettings(IWizardPage page, Class<T> type) {
        return super.isPageNeedsCompletion(page);

            DBTTask currentTask = getCurrentTask();
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIActivator;
    public void initializeWizard(@NotNull Composite pageContainer) {
        updateWizardTitle();
            IDataTransferSettings settings = this.settings.getNodeSettings(nodePageSettings.sourceNode);
            return;

        NodePageSettings nodePageSettings = node == null ? null : this.nodeSettings.get(node.getNodeClass());
import org.eclipse.core.runtime.IStatus;
                    StringBuilder propNames = new StringBuilder();
    }
        if (CommonUtils.isEmpty(property)) {

            false);
    public void loadNodeSettings() {
                    return wizardPage;

            } else {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        DTUIActivator.getDefault().saveDialogSettings();

        // Add regular pages
        }
        nodeSettings.put(nodeClass, newNodeSettings);
                }
        IWizardPage settingsPage;
        // Add common settings page

        if (page instanceof DataTransferPageFinal) {
                producers.add(pipe.getProducer());
    NodePageSettings getNodeInfo(IDataTransferNode<?> node) {
        setDialogSettings(getWizardDialogSettings());
            RS_EXPORT_WIZARD_DIALOG_SETTINGS);
                        if (!CommonUtils.isEmpty(queryParameters)) {
        if (curIndex != -1) {
                List<IStatus> childStatuses = new ArrayList<>();
                        propNames.append(prop.getKey()).append(',');
    }
        if (settings.getState().hasErrors()) {
            return false;
import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;

        boolean includePipesConfigurationPage
        if (!settings.isConsumerOptional() && !settings.isProducerOptional()) {
    }
        }
            IWizardPage[] sPages = nodeConfigurator == null ? new IWizardPage[0] : nodeConfigurator.createWizardPages(existingPages, consumerOptional, producerOptional, true);
    private void saveDialogSettings() {
            if (settings != null) {

        @NotNull IWorkbenchWindow workbenchWindow,
            // Return first node config page
        DataTransferNodeConfiguratorDescriptor nodeConfigurator;
            false,
                MultiStatus status = new MultiStatus(DTUIActivator.PLUGIN_ID, 0, childStatuses.toArray(new IStatus[0]), "Multiple configuration errors", null);
    @Override
                IWizardPage wizardPage = pages[i];
        return pages[pages.length - 1];
        }
        super.setContainer(wizardContainer);
        if (getCurrentTask() != null) {
import org.jkiss.dbeaver.model.DBUtils;
    }
import org.eclipse.jface.viewers.IStructuredSelection;
    private final Map<Class<?>, NodePageSettings> nodeSettings = new LinkedHashMap<>();
                for (Throwable error : loadErrors) {
        int curIndex = -1;
                wizard.addPage(page);
                }

    @Override
                // Execute directly - without task serialize/deserialize
        }
        saveDialogSettings();

        super(task);
import org.eclipse.core.runtime.MultiStatus;
                    if (queryContainer != null) {
    protected boolean isTaskConfigPage(IWizardPage page) {
        if (curIndex == 0) {
        }
        return isTaskConfigPage(page) ||


        // Save settings
                        }
        String property = System.getProperty(CLI_ARG_DEBUG_DISABLE_DT_SETTINGS_SAVE); // Turn off processor settings save. For Testing only. Use it after vmargs -Ddbeaver.debug.disable-data-transfer-settings-save=true
    @Override
                    }
    public IWizardPage getNextPage(IWizardPage page) {
        @NotNull DBRRunnableContext runnableContext,
        }
        return false;
        //UIUtils.asyncExec(this::loadNodeSettings);
        }
        DataTransferRegistry registry = DataTransferRegistry.getInstance();
        }

            @NotNull IWizardPage[] existingPages,
import org.jkiss.dbeaver.model.task.DBTTask;
                        return false;
    @Override
                if (node != null && !nodes.contains(node)) {


        super.initializeWizard(pageContainer);
 * Unless required by applicable law or agreed to in writing, software
        if (getSettings().isProducerOptional()) {
                getCurrentTask(),
import java.util.*;
import org.jkiss.dbeaver.tools.transfer.*;
        List<DataTransferNodeDescriptor> nodes = new ArrayList<>();
    }
                if (nodePageSettings.nodeConfigurator == null || nodePageSettings.nodeConfigurator.getPageDescriptor(page).getPageType() == DataTransferPageType.PREVIEW) {
            for (NodePageSettings ns : this.nodeSettings.values()) {
                return includePipesConfigurationPage;
                    monitor,
    @Override
    private Map<String, Object> saveConfiguration(@NotNull Map<String, Object> config) {
        if (ArrayUtils.isEmpty(settings.getInitConsumers())) {

        }
            // Note: do it in the end because of limitation of IDialogSettings wrapper
    static class NodePageSettings {
        DataTransferSettings.saveNodesLocation(runnableContext, task, state, consumers, "consumers");
                new DataTransferSettings(
    @Nullable
            getContainer().showPage(pages[pages.length - 1]);
            for (IWizardPage page : nodePageSettings.pages) {

                if (nsList.get(i).sourceNode != nodes.get(i)) {
    @Nullable
        DialogSettingsMap dialogSettings = new DialogSettingsMap(getDialogSettings());
        }
            List<NodePageSettings> nsList = new ArrayList<>(nodeSettings.values());

    }
    public boolean performFinish() {
        private NodePageSettings(
        if (node == null) {
        Collection<DBSObject> objectTypes = settings.getSourceObjects();
                        queryContainer = DBUtils.getAdapter(SQLQueryContainer.class, databaseObject);
import org.jkiss.dbeaver.ui.UIUtils;
                    !settings.getConsumer().getId().equals(nodePageSettings.sourceNode.getId()))
            // There can be only one settings page per node
import org.jkiss.dbeaver.tools.transfer.ui.registry.DataTransferConfiguratorRegistry;
        loadSettings();


            }
    }
    // Saves wizard settings in UI dialog settings
                if (nodePageSettings.nodeConfigurator != null && nodePageSettings.nodeConfigurator.getPageDescriptor(page).getPageType() == DataTransferPageType.PREVIEW) {
            return null;

            if (isTask) {
                if (isTask) {
                        }
        saveConfiguration(dialogSettings);
                null,
                if (wizardPage instanceof IWizardPageNavigable && !((IWizardPageNavigable) wizardPage).isPageApplicable()) {
                    log,
                        return false;
            for (IWizardPage settingsPage : settingPages) {
            if (currentTask == null) {
                if (producer instanceof DatabaseTransferProducer) {
            this.nodeConfigurator = nodeConfigurator;
    ) {
        protected void runTask() throws DBException {
public class DataTransferWizard extends TaskConfigurationWizard<DataTransferSettings> implements IExportWizard, IImportWizard {
        if (nodePageSettings != null && ArrayUtils.contains(nodePageSettings.pages, page)) {
    }
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
    @Override
            }

                    "Error loading configuration",
            return new DataTransferWizard(task, settings, false);
                    break;
                    nodes.add(node);
                if (page == nodePageSettings.settingsPage) {
    }
                if (nodePageSettings.pages != null) {
                        if (executionContext != null) {
        state.put("configuration", saveConfiguration(new LinkedHashMap<>()));
        if (settings.getProcessor() != null && CommonUtils.isEmpty(settings.getProcessorProperties())) {
                Map<String, Object> props = settings.getProcessorPropsHistory().get(procDescriptor);
import org.jkiss.code.Nullable;
            isPageValid(page, settings.getConsumer());
            for (DataTransferProcessorDescriptor procDescriptor : settings.getProcessorPropsHistory().keySet()) {
        protected boolean isShowFinalMessage() {
            getRunnableContext().run(true, true, monitor -> {

        super.addPages();
                settingPages.add(nodePageSettings.settingsPage);
        }
 * you may not use this file except in compliance with the License.
            }
    }
    )  throws DBException {
            this.pages = nodeConfigurator == null ? new IWizardPage[0] : nodeConfigurator.createWizardPages(existingPages, consumerOptional, producerOptional, false);
        }
    private boolean isPageValid(IWizardPage page, DataTransferNodeDescriptor node) {
                DataTransferWizardExecutor executor = new DataTransferWizardExecutor(
                if (pd != null) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
                addNodeSettings(node);
            for (IDataTransferProducer<?> producer : settings.getInitProducers()) {
    private static final String RS_EXPORT_WIZARD_DIALOG_SETTINGS = "DataTransfer";//$NON-NLS-1$
                break;
        @Override
        if (!super.performFinish()) {
                    wizard.addPage(page);
            for (int i = 0; i < nodeSettings.size(); i++) {
            return settings.isShowFinalMessage();

                    for (IWizardPage nodePage : nodePageSettings.pages) {
        }
                if (isPageValid(wizardPage)) {
    {
        this(task);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
        }
    public void onWizardActivation() {
                        // Producer doesn't match
                }
        if (settings.getConsumer() != null) {


        }

    private IDataTransferSettings getNodeSettings(IWizardPage page) {
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
import org.jkiss.utils.CommonUtils;
        for (Map.Entry<Class<?>, NodePageSettings> entry : nodeSettings.entrySet()) {
        // Initialize task variables from producers
        }

                    continue;
        }
import org.eclipse.jface.viewers.StructuredSelection;
        } else {
        }
        if (includePipesConfigurationPage()) {

            return settings.isConsumerOptional()
                            return settings.getNodeSettings(nodePageSettings.sourceNode);

                }
        DataTransferNodeDescriptor sourceNode;
    public void dispose() {
            page instanceof DataTransferPageFinal ||
                    }
                }
                        Map<String, Object> queryParameters = queryContainer.getQueryParameters();
        }

        }
            // Assumes all processors have at least one property - which is true.
            return false;
import org.jkiss.dbeaver.ui.DialogSettingsMap;
                DBWorkbench.getPlatformUI().showError(
            producers,
                ? settings.getConsumer().getProcessors().length > 1
        boolean includePipesConfigurationPage
        return UIUtils.getSettingsSection(
                curIndex = i;
import org.eclipse.jface.wizard.IWizardContainer;
    public void addPages() {
 * See the License for the specific language governing permissions and
        } catch (InterruptedException e) {
                    for (Map.Entry<String, Object> prop : props.entrySet()) {

            return sourceNode.getId();
        if (isTaskEditor() && !isNewTaskEditor()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        DataTransferWizard wizard = new DataTransferWizard(null, settings, true) {
    @NotNull
        NodePageSettings newNodeSettings = new NodePageSettings(getPages(), node, configurator, settings.isConsumerOptional(), settings.isProducerOptional());
    private void addWizardPages(DataTransferWizard wizard) {

import org.jkiss.dbeaver.tools.transfer.ui.registry.DataTransferPageDescriptor;
        // Add preview pages
                // Do not save settings for nodes not involved in this task
    public boolean performCancel() {
    @Override
                    continue;
        if (settings.getProcessor() != null) {
        }
            for (int i = curIndex + 1; i < pages.length; i++) {
                    settingsChanged = true;
    }
                {
    }
    }
        for (NodePageSettings nodePageSettings : this.nodeSettings.values()) {
        if (settings != null) {
            boolean producerOptional
import org.jkiss.dbeaver.model.struct.DBSObject;
                }
            if (pipe.getProducer() != null) {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
        return super.performCancel();
    protected boolean isPageNeedsCompletion(IWizardPage page) {
        return true;
                }
            }
        IWizardPage[] pages = getPages();
                    DTMessages.data_transfer_wizard_job_name,
                if (!CommonUtils.isEmpty(props)) {

 */
        if (!isCurrentTaskSaved()) {
        }
                processorsSection.put(procDescriptor.getFullId(), procSettings);
                    continue;
                }



                    settings.getProducer() != null &&
    }
        }
        return type.cast(getNodeSettings(page));

            nodes.addAll(registry.getAvailableConsumers(objectTypes));

        }
            return false;
        private final DataTransferSettings settings;
            saveDialogSettings();
                    "Error loading data transfer configuration", loadErrors.get(0));
    }
            new DialogSettingsMap(getWizardDialogSettings()),
    }

        //wizardContainer.
    }
                    getRunnableContext(),
                    status.getMessage(), status);
            @Override
        }
            if (pages[i] == page) {
            }
        for (NodePageSettings nodePageSettings : this.nodeSettings.values()) {
                    }
        try {
 *
                if (wizardPage instanceof IWizardPageNavigable && !((IWizardPageNavigable) wizardPage).isPageApplicable()) {
import org.jkiss.dbeaver.utils.GeneralUtils;
                    continue;
        // Save nodes' settings
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
        addPage(new DataTransferPageFinal());

                curIndex = i;
            }
        List<IWizardPage> settingPages = new ArrayList<>();
                    } else {
            // Save processors' properties
            }
            for (DataTransferNodeDescriptor node : nodes) {
    }
            }
                    !settings.getProducer().getId().equals(nodePageSettings.sourceNode.getId()))
        if (curIndex == pages.length - 1) {
/*
                    continue;
                    task,
            // ignore
        if (nodeSettings.containsKey(nodeClass)) {
                    settings.getConsumer() != null &&
        }
                    return wizardPage;
                    new DialogSettingsMap(getWizardDialogSettings()),
                if (nodePageSettings.sourceNode.getNodeType() == DataTransferNodeDescriptor.NodeType.PRODUCER &&
                }
        @NotNull Map<String, Object> state
                }
    }
        }
        // Final page
        } else {
            this.settings = settings;
    public IWizardPage getPreviousPage(IWizardPage page) {
        return config;
        @NotNull IWorkbenchWindow workbenchWindow,
            }

                    if (settings.getProcessor() == null || !settings.getProcessor().getId().equals(procDescriptor.getId())) {
                IWizardPage wizardPage = pages[i];
    @NotNull
        }


        } catch (DBException e) {
                this,
        DataTransferNodeConfiguratorDescriptor configurator = DataTransferConfiguratorRegistry.getInstance().getConfigurator(node.getId());
                    nodes.add(node);
            addPage(new DataTransferPagePipes(settings));
                Locale.getDefault(),
import org.eclipse.swt.widgets.Composite;
    }
    public DataTransferWizard(@Nullable DBTTask task, @NotNull DataTransferSettings settings, boolean initTaskVariables) {
    protected String getDefaultWindowTitle() {
            if (pages[i] == page) {
}
    }
            return false;
            }
            if (nodePageSettings.settingsPage != null) {
            }
*/
        if (settings.getProducer() != null) {
            if (pipe.getConsumer() != null) {
                }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                DataTransferPageDescriptor pd = ns.nodeConfigurator == null ? null : ns.nodeConfigurator.getPageDescriptor(page);
