    public static class OpenWithMenuDefaultContributor extends CompoundContributionItem
            case CMD_OPEN_WITH:
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.IDialogSettings;
        List<DataTransferProcessorDescriptor> appProcessors = new ArrayList<>();
import org.eclipse.ui.menus.CommandContributionItem;
                setUser(true);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
                            PREF_OPEN_WITH_DEFAULT_PROCESSOR, processor.getFullId());
import org.eclipse.jface.action.*;
    public static class OpenWithMenuContributor extends CompoundContributionItem
                menu.add(setDefaultAction);
    }
                }
                selectedRows.add(selectedRow.getRowNumber());
            for (DataTransferProcessorDescriptor processor : consumerNode.getProcessors()) {
                        return Status.CANCEL_STATUS;
    {
        if (CommonUtils.isEmpty(processorId)) {
                    IDialogSettings procSettings = null;
    }
        }
    {
        String prevActiveApp = preferenceStore.getString(PARAM_ACTIVE_APP);

        ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
import org.jkiss.dbeaver.model.data.DBDDataFilter;
        @Override
                        null);
 */
                    Path tempFile = tempDir.resolve(new SimpleDateFormat(

                    consumer.initTransfer(
            {

            return null;
        appProcessors.sort(Comparator.comparingInt(DataTransferProcessorDescriptor::getOrder));

            if (processor.getIcon() != null) {
        protected IContributionItem[] getContributionItems() {
/**
        } else {

 * Open results in external application
 * DBeaver - Universal Database Manager
                openResultsWith(resultSet, processor);
                    DBWorkbench.getPlatformUI().showError("Error opening in " + processor.getAppName(), null, e);
                for (DataTransferProcessorDescriptor processor : consumerNode.getProcessors()) {
import org.eclipse.core.commands.AbstractHandler;

                            setToolTipText(processor.getDescription());
        };
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;
                        Object defValue = procSettings == null ? null : procSettings.get(CommonUtils.toString(prop.getId()));

                element.setIcon(DBeaverIcons.getImageDescriptor(processor.getIcon()));
            for (final DataTransferNodeDescriptor consumerNode : DataTransferRegistry.getInstance().getNodes(DataTransferNodeDescriptor.NodeType.CONSUMER)) {
            if (!CommonUtils.isEmpty(processor.getDescription())) {
                processor.getId(),
                    StreamTransferConsumer consumer = new StreamTransferConsumer();
            return defaultAppProcessor;
    public static final String PREF_OPEN_WITH_DEFAULT_PROCESSOR = "org.jkiss.dbeaver.core.resultset.openWith.defaultprocessor";
package org.jkiss.dbeaver.ui.controls.resultset.handler;
            }
                        }
import org.eclipse.core.runtime.Status;
                Action setDefaultAction = new Action(processor.getAppName(), Action.AS_RADIO_BUTTON) {
        AbstractJob exportJob = new AbstractJob("Open " + processor.getAppName()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                setSystem(false);


import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporter;
            for (ResultSetRow selectedRow : rsSelectedRows) {
 * limitations under the License.
    public Object execute(ExecutionEvent event) throws ExecutionException {
            }
                    // Default values from wizard
        if (defaultAppProcessor != null) {

import java.nio.file.Path;
    }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
        }
            }
                        }
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software

        public Map<String,String> getParameterValues() {
                    // disable OpenNewconnection by default (#6432)
            //preferenceStore.setValue(PARAM_ACTIVE_APP, processor.getFullId());
                    {
            CommandContributionItemParameter params = new CommandContributionItemParameter(
                    producerSettings.setQueryRowCount(false);
                    @Override
                    });
                }
                SWT.ICON_WARNING
                if (processor.getAppFileExtension() != null) {

                        if (!CommonUtils.isEmpty(processor.getDescription())) {
                    IDialogSettings procListSection = dtSettings.getSection(DTConstants.PROP_PROCESSORS_LIST);

            }
                    for (DBPPropertyDescriptor prop : processor.getProperties()) {
 *
                    tempFile.toFile().deleteOnExit();
            options.setSelectedColumns(rsSelectedAttributes);
 */
import org.jkiss.dbeaver.tools.transfer.DTConstants;
        return null;
        IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(HandlerUtil.getActivePart(event));
            final ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet(
                return new IContributionItem[0];
    public void updateElement(UIElement element, Map parameters) {

                            DBWorkbench.getPlatformUI().showError(

        }
                        "yyyyMMdd-HHmmss").format(System.currentTimeMillis()) + "." + processor.getAppFileExtension());
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
            element.setText(processor.getAppName());
                break;
                    settings.setOutputFolder(tempDir.toAbsolutePath().toString());
import org.eclipse.ui.handlers.HandlerUtil;
                    StreamConsumerSettings settings = new StreamConsumerSettings();
import org.eclipse.core.runtime.IStatus;
                    }
                    }

    private static DataTransferProcessorDescriptor getDefaultAppProcessor() {
import org.jkiss.dbeaver.runtime.DBWorkbench;

                    Path tempDir = DBWorkbench.getPlatform().getTempFolder(monitor, "data-files");
                    }
            return null;
                }
import org.eclipse.swt.SWT;
        }
                        dataContainer,

                        updateResultSetToolbar(rsv);

                });
                menu.add(new Action(ActionUtils.findCommandDescription(
        switch (event.getCommand().getId()) {
                    boolean selectedRowsOnly = !CommonUtils.isEmpty(options.getSelectedRows());
            return DataTransferRegistry.getInstance().getProcessor(processorId);

    static DataTransferProcessorDescriptor getActiveProcessor(String processorId) {
 * You may obtain a copy of the License at
            if (defaultAppProcessor != null) {

    @Override
            }
import org.eclipse.ui.menus.UIElement;
                        properties,
            }
import org.eclipse.ui.menus.CommandContributionItemParameter;
                    public void run() {
                    if (procListSection != null) {
import org.jkiss.dbeaver.Log;
        if (rsSelectedRows.size() > 1 || rsSelectedAttributes.size() > 1) {
public class ResultSetHandlerOpenWith extends AbstractHandler implements IElementUpdater {
                        exporter,
    public static class OpenWithParameterValues implements IParameterValues {
 *
}
import org.eclipse.core.commands.ExecutionEvent;
                    if (!(processorInstance instanceof IStreamDataExporter exporter)) {
            }
                        setChecked(processor.getFullId().equals(getDefaultOpenWithProcessor()));
            fillOpenWithMenu(rsv, menu);
                }


            @Override
                    consumer.finishTransfer(monitor, false);
        for (final DataTransferNodeDescriptor consumerNode : DataTransferRegistry.getInstance().getAvailableConsumers(Collections.singleton(dataContainer))) {
        return null;

        for (final DataTransferNodeDescriptor consumerNode : DataTransferRegistry.getInstance().getNodes(DataTransferNodeDescriptor.NodeType.CONSUMER)) {
                        producerSettings.setFetchedRowsPolicy(null);
                        DBWorkbench.getPlatform().getPreferenceStore().setValue(

                    {
import java.text.SimpleDateFormat;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings.FetchedRowsPolicy;
            );
                UIMessages.dialog_policy_data_export_msg,
                        properties.put(prop.getId(), defValue != null ? defValue : prop.getDefaultValue());
        }
            ContributionManager menu = new MenuManager();

        }
        ResultSetDataContainer dataContainer = new ResultSetDataContainer(resultSet, options);


    }
                    }
            return null;
            controller.updateToolbar();
            params.label = processor.getAppName();
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
            openWithMenu.add(new CommandContributionItem(params));
import org.eclipse.ui.actions.CompoundContributionItem;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                    DatabaseTransferProducer producer = new DatabaseTransferProducer(dataContainer, dataFilter);
        if (service != null) {
        List<DataTransferProcessorDescriptor> processors = new ArrayList<>();
                    producerSettings.setExtractType(DatabaseProducerSettings.ExtractType.SINGLE_QUERY);

                    Action.AS_RADIO_BUTTON) {
                params.icon = DBeaverIcons.getImageDescriptor(processor.getIcon());
        ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
        }
            UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
            final Map<String,String> values = new HashMap<>();
    }
        }
            params.parameters = parameters;
            );
            }
                    IDataTransferProcessor processorInstance = processor.getInstance();

                    public void run() {
                    IResultSetCommands.CMD_EXPORT, rsv.getSite(), false),
        }
    }
        }
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
                        values.put(processor.getAppName(), processor.getFullId());
                    }
                        //setImageDescriptor(DBeaverIcons.getImageDescriptor(processor.getIcon()));
    }
/*
            }
                        setChecked(CommonUtils.isEmpty(getDefaultOpenWithProcessor()));
                        if (!ShellUtils.launchProgram(tempFile.toAbsolutePath().toString())) {
            //resultSet.getControl().layout(true);
                try {
                    appProcessors.add(processor);
        List<ResultSetRow> rsSelectedRows = rsSelection.getSelectedRows();
            // Def processor is null
            service.refreshElements(IResultSetCommands.CMD_EXPORT, null);
                    }



    }
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
        if (resultSet == null) {
                    properties.remove(StreamConsumerSettings.PROP_FILE_EXTENSION);
        if (!CommonUtils.equalObjects(prevActiveApp, processor.getFullId())) {
            if (!ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_EXPORT)) {
        return null;
                UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart());
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;
    private static final Log log = Log.getLog(ResultSetHandlerOpenWith.class);
    }
 *
            //resultSet.updateEditControls();
            ContributionManager menu = new MenuManager();
        if (processor != null) {
                return defaultAppProcessor;

                        new IDataTransferConsumer.TransferParameters(processor.isBinaryFormat(), processor.isHTMLFormat()),
        if (processor == null) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
                    DBDDataFilter dataFilter = resultSet.getModel().getDataFilter();
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                        DBWorkbench.getPlatform().getPreferenceStore().setValue(PREF_OPEN_WITH_DEFAULT_PROCESSOR, "");
                        updateResultSetToolbar(rsv);
            options.setSelectedRows(selectedRows);
            if (rsv == null) {
                if (processor.getAppFileExtension() != null) {

        @Override
    private static List<DataTransferProcessorDescriptor> getDataFileTransferProcessors(ResultSetViewer viewer) {

                    } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UIUtils;

import org.jkiss.dbeaver.ui.ShellUtils;
import org.eclipse.core.commands.IParameterValues;
    public static final String PARAM_PROCESSOR_ID = "processorId";
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
                    producerSettings.setOpenNewConnections(false);

import org.jkiss.code.NotNull;
        if (dataContainer.getDataSource() == null) {
    public static final String CMD_OPEN_WITH = "org.jkiss.dbeaver.core.resultset.openWith";

 * Licensed under the Apache License, Version 2.0 (the "License");
    private static void openResultsWith(IResultSetController resultSet, DataTransferProcessorDescriptor processor) {

 *     http://www.apache.org/licenses/LICENSE-2.0
            DataTransferProcessorDescriptor defaultAppProcessor = getDefaultProcessor();
    public static String getDefaultOpenWithProcessor() {
            @NotNull

        if (CommonUtils.isEmpty(processorId)) {
            return menu.getItems();
        }
                    }
            Map<String, Object> parameters = new HashMap<>();
                                "Can't open " + processor.getAppFileExtension() + " file '" + tempFile.toAbsolutePath() + "'");
        DataTransferProcessorDescriptor processor = getActiveProcessor(event.getParameter(PARAM_PROCESSOR_ID));
                } catch (Exception e) {
            return menu.getItems();
                    processors.add(processor);
        processors.sort(Comparator.comparingInt(DataTransferProcessorDescriptor::getOrder));
                ResultSetHandlerOpenWith.CMD_OPEN_WITH,
        return DBWorkbench.getPlatform().getPreferenceStore().getString(PREF_OPEN_WITH_DEFAULT_PROCESSOR);

                    }
        }
                    boolean selectedColumnsOnly = !CommonUtils.isEmpty(options.getSelectedColumns());
import java.util.*;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings;
    private static void updateResultSetToolbar(@NotNull IResultSetController controller) {
                viewer.getSite(),

            final ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet(
        final ICommandService service = PlatformUI.getWorkbench().getService(ICommandService.class);
                    @Override
            List<Integer> selectedRows = new ArrayList<>();
        return appProcessors;
    public static void fillOpenWithMenu(ResultSetViewer viewer, IContributionManager openWithMenu) {
        protected IContributionItem[] getContributionItems() {
            }


import org.jkiss.dbeaver.ui.internal.UIMessages;
        List<DBDAttributeBinding> rsSelectedAttributes = rsSelection.getSelectedAttributes();
 * See the License for the specific language governing permissions and
            if (processor.getIcon() != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Override
                    if (processor.getAppFileExtension() != null) {
            processorId = DBWorkbench.getPlatform().getPreferenceStore().getString(PARAM_ACTIVE_APP);
                        producerSettings.setFetchedRowsPolicy(new FetchedRowsPolicy(selectedRowsOnly, selectedColumnsOnly));
import org.jkiss.dbeaver.ui.ActionUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Put processor name in command label
            for (DataTransferProcessorDescriptor processor : consumerNode.getProcessors()) {
                        procSettings = procListSection.getSection("stream_consumer:" + processor.getId());
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                return Status.OK_STATUS;
        DataTransferProcessorDescriptor defaultAppProcessor = getDefaultAppProcessor();
            }
                    IDialogSettings dtSettings = DataTransferWizard.getWizardDialogSettings();
        }
                };
    }
        }
                    // Remove extension property (we specify file name directly)
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
                return new IContributionItem[0];
                    Map<String, Object> properties = new HashMap<>();
            return;
            if (rsv == null) {

            }
        }
            return values;
                    if (selectedRowsOnly || selectedColumnsOnly) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.ui.controls.resultset.*;

            }
        DataTransferProcessorDescriptor processor = getActiveProcessor((String) parameters.get(PARAM_PROCESSOR_ID));
                        settings,

                    UIUtils.asyncExec(() -> {
import org.eclipse.ui.PlatformUI;
        return processors.isEmpty() ? null : processors.get(0);
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
        for (DataTransferProcessorDescriptor processor : getDataFileTransferProcessors(viewer)) {
                UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart());
    @NotNull
                element.setTooltip(processor.getDescription());
                    settings.setOutputFilePattern(tempFile.getFileName().toString());
    }
            for (DataTransferProcessorDescriptor processor : getDataFileTransferProcessors(rsv)) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                UIMessages.dialog_policy_data_export_title,
        exportJob.schedule();
                CommandContributionItem.STYLE_RADIO
        ResultSetDataContainer dataContainer = new ResultSetDataContainer(viewer, options);
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
        }
        }
            parameters.put(ResultSetHandlerOpenWith.PARAM_PROCESSOR_ID, processor.getFullId());
    static DataTransferProcessorDescriptor getDefaultProcessor() {
    }
                    settings.setOutputEncodingBOM(false);
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            }
import org.eclipse.ui.commands.IElementUpdater;
                    producer.transferData(monitor, consumer, null, producerSettings, null);
import org.eclipse.ui.commands.ICommandService;

    @Override
                    }

                                "Open " + processor.getAppName(),
                    DatabaseProducerSettings producerSettings = new DatabaseProducerSettings();
    public static final String PARAM_ACTIVE_APP = "org.jkiss.dbeaver.core.resultset.openWith.currentApp";
        IResultSetSelection rsSelection = resultSet.getSelection();
            DBWorkbench.getPlatformUI().showError("Open " + processor.getAppName(), ModelMessages.error_not_connected_to_database);
        }
