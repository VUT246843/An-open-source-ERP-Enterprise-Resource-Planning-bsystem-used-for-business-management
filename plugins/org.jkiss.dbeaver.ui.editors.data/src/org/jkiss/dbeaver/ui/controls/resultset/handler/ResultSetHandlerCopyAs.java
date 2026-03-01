            return null;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

        }
                        continue;
import org.jkiss.dbeaver.Log;
            return DataTransferRegistry.getInstance().getProcessor(processorId);
                    Map<DataTransferProcessorDescriptor, Map<String, Object>> propertiesMap = CopyAsConfigurationStorage.getProcessorProperties();
                SWT.ICON_WARNING

            copyAsMenu.add(new CommandContributionItem(params));
import java.util.*;
            public void run() {
                    values.put(processor.getName(), processor.getFullId());


        for (DataTransferProcessorDescriptor processor : appProcessors) {
                openResultsWith(resultSet, processor);
 *

    }
    }
        }
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_COPY)) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
                    monitor.worked(1);
                        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
        }
                        settings,

                    DatabaseProducerSettings producerSettings = new DatabaseProducerSettings();
                    }
            return null;
        public Map<String,String> getParameterValues() {
                appProcessors.add(processor);
            if (processor.getIcon() != null) {
                ResultSetHandlerCopyAs.CMD_COPY_AS,
                    producerSettings.setExtractType(DatabaseProducerSettings.ExtractType.SINGLE_QUERY);
        copyAsMenu.add(new Separator());

            CommandContributionItemParameter params = new CommandContributionItemParameter(
}
        copyAsMenu.add(new Action(ResultSetMessages.dialog_copy_as_configuration_name) {
                    boolean selectedRowsOnly = !CommonUtils.isEmpty(options.getSelectedRows());

                    producerSettings.setOpenNewConnections(false);

        }
        // Add copy commands for different formats
        if (rsSelectedRows.size() > 1 || rsSelectedAttributes.size() > 1) {
            @Override
                        for (DBPPropertyDescriptor prop : processor.getProperties()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        copyAsMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_COPY_ROW_NAMES));
    }
import org.jkiss.utils.CommonUtils;
        if (processor == null) {
            for (ResultSetRow selectedRow : rsSelectedRows) {
                        null);
                    StreamConsumerSettings settings = new StreamConsumerSettings();
import org.eclipse.ui.IWorkbenchPartSite;

            @Override
                        new IDataTransferConsumer.TransferParameters(processor.isBinaryFormat(), processor.isHTMLFormat()),
                        properties = new HashMap<>();
    }
            return null;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
        for (final DataTransferNodeDescriptor consumerNode : DataTransferRegistry.getInstance().getAvailableConsumers(Collections.singleton(dataContainer))) {
            options.setSelectedRows(selectedRows);
        }
        copyAsMenu.add(ActionUtils.makeCommandContribution(site, IResultSetCommands.CMD_COPY_COLUMN_NAMES));
import org.jkiss.dbeaver.ui.controls.resultset.*;
                        producerSettings.setFetchedRowsPolicy(null);
        }

                    }
        }
            UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
            }

import org.jkiss.dbeaver.ui.UIUtils;

                }
import org.jkiss.code.NotNull;



    public void updateElement(UIElement element, Map parameters) {
            {
                setUser(true);
    public static class CopyAsMenuContributor extends CompoundContributionItem
    }
            ContributionManager menu = new MenuManager();
import org.jkiss.dbeaver.ui.ActionUtils;
                            producerSettings.setOpenNewConnections(serviceSQL.useIsolatedConnections(resultSet));
 *

import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
import org.eclipse.ui.commands.IElementUpdater;
        }
            );
            }
                    }
import org.eclipse.ui.menus.CommandContributionItem;
        IWorkbenchPartSite site = viewer.getSite();
            for (DataTransferProcessorDescriptor processor : consumerNode.getProcessors()) {
        protected IContributionItem[] getContributionItems() {
import org.eclipse.ui.menus.UIElement;

        ResultSetDataContainer dataContainer = new ResultSetDataContainer(resultSet, options);
                    IDataTransferProcessor processorInstance = processor.getInstance();

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
                CommandContributionItem.STYLE_PUSH
                return Status.OK_STATUS;
                    }
            Map<String, Object> parameters = new HashMap<>();
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copy results in external format
 */
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings;
            }
                    if (resultSet.isHasMoreData()) {
            final Map<String,String> values = new HashMap<>();
                    monitor.done();
        if (CommonUtils.isEmpty(processorId)) {
                    consumer.finishTransfer(monitor, true);
                        }

        List<ResultSetRow> rsSelectedRows = rsSelection.getSelectedRows();
                        return Status.CANCEL_STATUS;
            }
 * you may not use this file except in compliance with the License.
                    } else {
            return menu.getItems();

import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;

public class ResultSetHandlerCopyAs extends AbstractHandler implements IElementUpdater {

            }
    public static final String CMD_COPY_AS = "org.jkiss.dbeaver.core.resultset.copyAs";
                    properties.put(DBSDataManipulator.OPTION_USE_CURRENT_DIALECT_SETTINGS, true);
        };
            if (rsv == null) {
        List<DataTransferProcessorDescriptor> appProcessors = new ArrayList<>();
            }
            String commandName = ActionUtils.findCommandName(CMD_COPY_AS);
                    Map<String, Object> properties = propertiesMap.get(processor);
                    DBWorkbench.getPlatformUI().showError("Error opening in " + processor.getAppName(), null, e);
                } finally {
                processor.getId(),
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                UIMessages.dialog_policy_data_copy_title,
                    settings.setOutputEncodingBOM(false);
            fillCopyAsMenu(rsv, menu);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
/**
        @Override
        IResultSetController resultSet = ResultSetHandlerMain.getActiveResultSet(HandlerUtil.getActivePart(event));
import org.eclipse.core.commands.IParameterValues;
import org.eclipse.core.runtime.IStatus;
        }
        }
                try {
        // Put processor name in command label
    @Override
            return null;
        appProcessors.sort(Comparator.comparing(DataTransferProcessorDescriptor::getName));
            return;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                }
                    StreamTransferConsumer consumer = new StreamTransferConsumer();
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporter;
            }
                    if (processor.isBinaryFormat()) {
        List<DBDAttributeBinding> rsSelectedAttributes = rsSelection.getSelectedAttributes();
                params.icon = DBeaverIcons.getImageDescriptor(processor.getIcon());
 *


    private static void openResultsWith(IResultSetController resultSet, DataTransferProcessorDescriptor processor) {
                    if (!(processorInstance instanceof IStreamDataExporter)) {
        return null;
                    DatabaseTransferProducer producer = new DatabaseTransferProducer(dataContainer, dataFilter);
            parameters.put(ResultSetHandlerCopyAs.PARAM_PROCESSOR_ID, processor.getFullId());
                return new IContributionItem[0];
    public static final String PARAM_PROCESSOR_ID = "processorId";
import org.eclipse.core.commands.AbstractHandler;
                    IStreamDataExporter exporter = (IStreamDataExporter) processorInstance;
                if (processor.isBinaryFormat()) {
import org.eclipse.swt.SWT;
            if (!CommonUtils.isEmpty(processor.getDescription())) {
            List<Integer> selectedRows = new ArrayList<>();
            );

 * DBeaver - Universal Database Manager
                new CopyAsConfigurationDialog(viewer).open();

/*

    @Override
            for (final DataTransferNodeDescriptor consumerNode : DataTransferRegistry.getInstance().getNodes(DataTransferNodeDescriptor.NodeType.CONSUMER)) {
                    if (selectedRowsOnly || selectedColumnsOnly) {
            if (processor.getIcon() != null) {
import org.eclipse.jface.action.*;

        ResultSetDataContainer dataContainer = new ResultSetDataContainer(viewer, options);
                    producerSettings.setQueryRowCount(false);

import org.jkiss.dbeaver.model.data.DBDDataFilter;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                for (DataTransferProcessorDescriptor processor : consumerNode.getProcessors()) {
        AbstractJob exportJob = new AbstractJob("Copy as " + processor.getName()) {
    public Object execute(ExecutionEvent event) throws ExecutionException {
        } else {
                element.setTooltip(processor.getDescription());
                    producer.transferData(monitor, consumer, null, producerSettings, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            properties.put(prop.getId(), prop.getDefaultValue());
            }
                UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart());
import org.jkiss.dbeaver.tools.transfer.database.DatabaseProducerSettings.FetchedRowsPolicy;
            element.setText(commandName + " " + processor.getName());
            @NotNull
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.ui.internal.UIMessages;

                        if (serviceSQL != null) {
        switch (event.getCommand().getId()) {
                    }
                        dataContainer,
                    monitor.subTask("Finalize export");
            options.setSelectedColumns(rsSelectedAttributes);
            DBWorkbench.getPlatformUI().showError("Copy as " + processor.getName(), ModelMessages.error_not_connected_to_database);
            case CMD_COPY_AS:
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
 * You may obtain a copy of the License at
        IResultSetSelection rsSelection = resultSet.getSelection();
    static DataTransferProcessorDescriptor getActiveProcessor(String processorId) {
        }
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
import org.eclipse.core.commands.ExecutionEvent;

                site,
        exportJob.schedule();
                        properties,
        }
import org.eclipse.ui.handlers.HandlerUtil;

            params.label = processor.getName();
            final ResultSetViewer rsv = (ResultSetViewer) ResultSetHandlerMain.getActiveResultSet(
                }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.core.commands.ExecutionException;
    public static void fillCopyAsMenu(ResultSetViewer viewer, IContributionManager copyAsMenu) {
                    continue;
                } catch (Exception e) {
        if (processor != null) {
                        exporter,
        DataTransferProcessorDescriptor processor = getActiveProcessor((String) parameters.get(PARAM_PROCESSOR_ID));
    {
            return values;
package org.jkiss.dbeaver.ui.controls.resultset.handler;
        @Override
        ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
    public static class CopyAsParameterValues implements IParameterValues {
 * See the License for the specific language governing permissions and
        });
    }
                element.setIcon(DBeaverIcons.getImageDescriptor(processor.getIcon()));
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (resultSet == null) {
                    boolean selectedColumnsOnly = !CommonUtils.isEmpty(options.getSelectedColumns());
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;

            params.parameters = parameters;


                    if (properties == null) {
                monitor.beginTask("Copy data as", 3);
        DataTransferProcessorDescriptor processor = getActiveProcessor(event.getParameter(PARAM_PROCESSOR_ID));
            }
 * Unless required by applicable law or agreed to in writing, software
                        }
                    consumer.finishTransfer(monitor, false);
        copyAsMenu.add(ActionUtils.makeCommandContribution(site, ResultSetHandlerCopySpecial.CMD_COPY_SPECIAL));
import org.eclipse.ui.menus.CommandContributionItemParameter;

                    monitor.worked(1);
 */
 * limitations under the License.
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
                    monitor.worked(1);
                    settings.setOutputClipboard(true);
                        // For long resultsets we may need to open new connection
                    monitor.subTask("Init");
                break;
    private static final Log log = Log.getLog(ResultSetHandlerCopyAs.class);
                selectedRows.add(selectedRow.getRowNumber());
        copyAsMenu.add(new Separator());
        ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
                        producerSettings.setFetchedRowsPolicy(new FetchedRowsPolicy(selectedRowsOnly, selectedColumnsOnly));
                    DBDDataFilter dataFilter = resultSet.getModel().getDataFilter();
                    monitor.subTask("Export data");
    }

                    consumer.initTransfer(
                setSystem(false);
                UIMessages.dialog_policy_data_copy_msg,
        if (dataContainer.getDataSource() == null) {
