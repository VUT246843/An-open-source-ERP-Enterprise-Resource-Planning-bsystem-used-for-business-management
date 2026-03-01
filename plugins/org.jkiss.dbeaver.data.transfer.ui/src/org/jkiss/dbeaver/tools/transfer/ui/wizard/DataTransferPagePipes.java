            setTitle(DTMessages.data_transfer_wizard_init_title);
                }
                    DBNDatabaseNode objectNode = nModel.getNodeByObject(element);
            setDescription(DTMessages.data_transfer_wizard_producers_description);
            nodesTable.getTable().setEnabled(false);
                }
    }
    public void createControl(Composite parent) {
                && !DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)) {
    public void activatePage() {
 * See the License for the specific language governing permissions and
            if (DATABASE_PRODUCER_ID.equals(producer.getId())
            target = (TransferTarget) selection.getFirstElement();
            public void widgetSelected(SelectionEvent e)

                if ((target.node == consumer || target.node == producer) &&
        if (settings.getConsumer() == null || settings.getProducer() == null) {
                    settings.selectProducer(target.node, target.processor, true);
            columnDesc.getColumn().setText(DTMessages.data_transfer_wizard_init_column_description);
                continue;
            StructuredSelection selection = new StructuredSelection(currentTarget);
                    getWizard().getContainer().nextPressed();
        }
        } else {
            if (producer.isAdvancedNode() && !DBWorkbench.hasFeature(DTConstants.PRODUCT_FEATURE_ADVANCED_DATA_TRANSFER)) {
                continue;
            TableViewerColumn columnDesc = new TableViewerColumn(nodesTable, SWT.LEFT);
                        label = element.node.getName();
        DataTransferSettings settings = getWizard().getSettings();
                    }
                continue;
            @Override
            TableViewerColumn columnName = new TableViewerColumn(nodesTable, SWT.LEFT);
        DataTransferProcessorDescriptor processor;
        final DataTransferWizard wizard = getWizard();
                if (cell.getColumnIndex() == 0) {
        nodesTable.getTable().setLayoutData(gd);
        //UIUtils.createControlLabel(panel, DTUIMessages.data_transfer_wizard_final_column_target);
        List<TransferTarget> transferTargets = new ArrayList<>();

    private void loadNodeSettings() {
                setSelectedSettings(true);
}            loadProducers();
                        cell.setText(
            {
    }
        }
package org.jkiss.dbeaver.tools.transfer.ui.wizard;
    }
                && !DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)) {

                transferTargets.add(new TransferTarget(consumer, null));
        nodesTable.getTable().addSelectionListener(new SelectionListener() {
import org.jkiss.dbeaver.model.navigator.DBNModel;

                            CommonUtils.truncateString(

        };
import org.eclipse.swt.widgets.Composite;
        if (!selection.isEmpty()) {
        if (currentTarget != null) {
        GridData gd = new GridData(GridData.FILL_BOTH);
            return new Object[0];
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        createInputsTable(sash);
import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;
            @Override
        Collection<DBSObject> objects = settings.getSourceObjects();
        final DataTransferWizard wizard = getWizard();

            return false;
            }
    DataTransferPagePipes(@NotNull DataTransferSettings settings) {
 * You may obtain a copy of the License at
            this.processor = processor;
        });
        if (currentTarget == null && !targets.isEmpty()) {
    }
    @Override
        updatePageCompletion();
//        if (settings.isProducerOptional()) {
                        cell.setImage(DBeaverIcons.getImage(element.processor.getIcon()));
            }


import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
            currentTarget = targets.getFirst();
            }
 *
                }
import java.util.Collection;
import java.util.ArrayList;
                    if (element.processor != null) {
        private TransferTarget(DataTransferNodeDescriptor node, DataTransferProcessorDescriptor processor)
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
            }
        CellLabelProvider labelProvider = new CellLabelProvider() {
    private static class TransferTarget {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (settings.getDataPipes().isEmpty()) {
                String label;

                    if (element.processor != null) {
    }
 *
        inputsTable.setLabelProvider(labelProvider);
import org.jkiss.code.NotNull;
                    } else {
                transferTargets.add(new TransferTarget(producer, null));
                // no optional nodes
    }
        };
import org.jkiss.dbeaver.ui.controls.ListContentProvider;

            } else {
        DBNModel nModel = DBWorkbench.getPlatform().getNavigatorModel();

        nodesTable.getTable().setLinesVisible(true);
        inputsTable.setContentProvider(new ListContentProvider());
                }

    public static final String DATABASE_CONSUMER_ID = "database_consumer";
            setTitle(DTMessages.data_transfer_wizard_producers_title);
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
            if (wizard.isTaskEditor() && settings.getConsumer() != null && !settings.getConsumer().getId().equals(consumer.getId())) {
            if (inputElement instanceof Collection) {
    private void createInputsTable(Composite composite) {
                    break;
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBValueFormatting;

        inputsTable.setInput(getWizard().getSettings().getSourceObjects());
        CellLabelProvider labelProvider = new CellLabelProvider() {
            }
                    final SQLQueryContainer queryContainer = DBUtils.getAdapter(SQLQueryContainer.class, element);
        }
                    transferTargets.add(new TransferTarget(producer, processor));
        });
 * limitations under the License.
                DBSObject element = (DBSObject) cell.getElement();
                for (DataTransferProcessorDescriptor processor : processors) {
import org.jkiss.dbeaver.model.struct.DBSObject;
 */

                    } else {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
    }
        if (settings.isConsumerOptional()) {
                        cell.setImage(DBeaverIcons.getImage(element.node.getIcon()));
            } else if (settings.isProducerOptional()) {
            this.node = node;
        initializeDialogUnits(parent);
            }
 * Unless required by applicable law or agreed to in writing, software
                continue;
    }
        super(DTMessages.data_transfer_wizard_init_title);
                                DBUtils.getObjectFullName(element, DBPEvaluationContext.UI), 64));

            if (settings.isConsumerOptional()) {
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
            Collection<DataTransferProcessorDescriptor> processors = consumer.getAvailableProcessors(objects);
    private void loadConsumers() {
    private TableViewer inputsTable;
            if (CommonUtils.isEmpty(processors)) {
        inputsTable.getTable().setLinesVisible(true);
            }
    private void createNodesTable(Composite composite) {
        for (DataTransferNodeDescriptor consumer : DataTransferRegistry.getInstance().getAvailableConsumers(objects)) {
            columnName.getColumn().setText(DTMessages.data_transfer_wizard_init_column_exported);
            columnDesc.setLabelProvider(labelProvider);
//        }

 * Copyright (C) 2010-2026 DBeaver Corp and others
                return ((Collection<?>) inputElement).toArray();
            return false;
        }
        activated = true;
        } else {
                continue;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
            {
                        label = element.node.getDescription();

    private boolean activated;
        } else {
        }
            public void widgetDefaultSelected(SelectionEvent e)
        DataTransferProcessorDescriptor processor = getWizard().getSettings().getProcessor();
        GridData gd = new GridData(GridData.FILL_BOTH);
        UIUtils.packColumns(nodesTable.getTable());
    protected boolean determinePageCompletion() {
                    settings.selectConsumer(target.node, target.processor, true);
            } else {
    }



            loadConsumers();
/*
                        label = element.processor.getName();
 * DBeaver - Universal Database Manager
        DataTransferNodeDescriptor producer = getWizard().getSettings().getProducer();
 *
        Composite panel = UIUtils.createComposite(composite, 1);
                if (forceUpdate || settings.getConsumer() == null) {

import org.jkiss.dbeaver.model.rm.RMConstants;
        if (getWizard().getSettings().isConsumerOptional()) {
        //UIUtils.createControlLabel(panel, DTUIMessages.data_transfer_wizard_final_group_objects);
                continue;
        DataTransferSettings settings = wizard.getSettings();
        if (!activated) {
        gd.heightHint = 200;

            }
                widgetSelected(e);
                    }
import org.eclipse.jface.viewers.*;
        Collection<DBSObject> objects = settings.getSourceObjects();
            } else {
        setControl(composite);
        }
        final IStructuredSelection selection = (IStructuredSelection) nodesTable.getSelection();
        {
    private TableViewer nodesTable;
            public void update(ViewerCell cell) {

//            settings.setProcessorProperties();
                }
                    if (queryContainer != null) {
import org.jkiss.utils.CommonUtils;
            Collection<DataTransferProcessorDescriptor> processors = producer.getAvailableProcessors(objects);
        updatePageCompletion();
            @Override
    }
        sash.setLayoutData(new GridData(GridData.FILL_BOTH));
        sash.setWeights(70, 30);
            if (wizard.isTaskEditor() && settings.getProducer() != null && !settings.getProducer().getId().equals(producer.getId())) {
            nodesTable.setSelection(selection);
                if (isPageComplete()) {

import org.jkiss.dbeaver.model.DBPImage;
    @Override
            }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        nodesTable = new TableViewer(panel, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);

import org.jkiss.dbeaver.ui.DBeaverIcons;
        inputsTable.setInput(getWizard().getSettings().getSourceObjects());
                }
        UIWidgets.createTableContextMenu(inputsTable.getTable(), null);
        TransferTarget currentTarget = null;
        if (consumer != null || producer != null) {
        }
    private void loadProducers() {
        if (activated && getWizard().getSettings().isPipeChangeRestricted()) {
        DataTransferSettings settings = getWizard().getSettings();
            setSelectedSettings(false);
        nodesTable.setContentProvider((IStructuredContentProvider) inputElement -> {

                                CommonUtils.getSingleLineString(queryContainer.getQuery().getText()), 64));
public class DataTransferPagePipes extends ActiveWizardPage<DataTransferWizard> {
        SashForm sash = new SashForm(composite, SWT.HORIZONTAL);
import org.jkiss.dbeaver.ui.UIWidgets;
                        label = element.processor.getDescription();
                ) {
                    transferTargets.add(new TransferTarget(consumer, processor));
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

                } else {
        }


                    (target.processor == null || target.processor == processor)
import org.jkiss.dbeaver.model.DBUtils;

        gd.heightHint = 350;

        nodesTable.setInput(transferTargets);
            settings.selectConsumer(null, null, true);
    private void setSelectedSettings(boolean forceUpdate) {
                    } else {
            }
                cell.setText(label);
            UIUtils.asyncExec(this::loadNodeSettings);
                    }
            }
        if (target == null) {
    public static final String DATABASE_PRODUCER_ID = "database_producer";
        }


            target = null;
            setErrorMessage("No objects selected");
import org.eclipse.swt.custom.SashForm;
        }
        gd.widthHint = 400;
                if (forceUpdate || settings.getProducer() == null) {
        return true;
        TransferTarget target;
            if (consumer.isAdvancedNode() && !DBWorkbench.hasFeature(DTConstants.PRODUCT_FEATURE_ADVANCED_DATA_TRANSFER)) {
        }
                    currentTarget = target;
        inputsTable.getTable().setLayoutData(gd);
        DataTransferSettings settings = wizard.getSettings();
        gd.widthHint = 200;
    @Override
                }
        } else {
        nodesTable.setInput(transferTargets);
        List<TransferTarget> targets = (List<TransferTarget>) nodesTable.getInput();
            return;

    }
 * you may not use this file except in compliance with the License.
import java.util.List;
                }
            columnName.setLabelProvider(labelProvider);
        createNodesTable(sash);
            @Override
            }
                            CommonUtils.truncateString(
            }

import org.eclipse.swt.SWT;
                        cell.setText(
        Composite panel = UIUtils.createComposite(composite, 1);
            if (DATABASE_CONSUMER_ID.equals(consumer.getId())
import org.eclipse.swt.layout.GridData;
        DataTransferNodeDescriptor node;
import org.eclipse.swt.events.SelectionEvent;
        inputsTable = new TableViewer(panel, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
        Composite composite = UIUtils.createComposite(parent, 1);
                TransferTarget element = (TransferTarget) cell.getElement();
            if (CommonUtils.isEmpty(processors)) {
        for (DataTransferNodeDescriptor producer : DataTransferRegistry.getInstance().getAvailableProducers(objects)) {

            // Second activation - we need to disable any selectors
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            }
        List<TransferTarget> transferTargets = new ArrayList<>();
import org.jkiss.dbeaver.runtime.DBWorkbench;

            for (TransferTarget target : targets) {
        }
                    DBPImage icon = objectNode != null ? objectNode.getNodeIconDefault() : DBValueFormatting.getObjectImage(element);
import org.jkiss.dbeaver.tools.transfer.DTConstants;
                if (cell.getColumnIndex() == 0) {
        DataTransferNodeDescriptor consumer = getWizard().getSettings().getConsumer();
import org.eclipse.swt.events.SelectionListener;
                for (DataTransferProcessorDescriptor processor : processors) {
        }
            public void update(ViewerCell cell) {
        getWizard().getContainer().updateNavigationTree();
            }
                    cell.setImage(DBeaverIcons.getImage(icon));
            setDescription(DTMessages.data_transfer_wizard_init_description);
