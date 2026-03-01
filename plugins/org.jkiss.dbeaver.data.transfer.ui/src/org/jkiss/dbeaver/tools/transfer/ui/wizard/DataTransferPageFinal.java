        getWizard().updateTaskButtons();
                }
        setControl(composite);
                1,
                return UIUtils.getConnectionColor(container.getConnectionConfiguration());
    }
            targetSettingsText.setLayoutData(GridDataFactory.create(GridData.FILL_BOTH).create());
                leftGroup,
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
                if (consumerColor != null) {
        Composite composite = UIUtils.createComposite(parent, 1);
    @Override
import org.eclipse.swt.graphics.Color;
                if (consumerObjectIcon == null && settings.getConsumer() != null) {
            if (consumerSettings == null) {
                    summary.append(NLS.bind(DTMessages.data_transfer_summary_title, node.getName())).append(":\n");
    private Table resultTable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (producerColor != null) {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    private Color getNodeColor(IDataTransferNode<?> node) {
    public boolean isPageApplicable() {
import org.jkiss.dbeaver.model.DBPDataSource;
    DataTransferPageFinal() {
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
        if (settings != null) {
                    DTUIMessages.data_transfer_page_final_message_error_initializing_data_transfer_pipe, e);
                item.setText(0, producer.getObjectContainerName());
import org.jkiss.code.Nullable;
                item.setText(3, consumer.getObjectName());

import org.eclipse.jface.layout.GridDataFactory;
            }
                topGroup,
        updatePageCompletion();

            }
            IDataTransferProducer<?> producer = pipe.getProducer();
import org.jkiss.dbeaver.model.DBPImage;
                consumerSettings = settings.getNodeSettings(settings.getConsumer());

                if (producerObjectIcon == null) {

                }

                    item.setImage(0, DBeaverIcons.getImage(producer.getObjectContainerIcon()));

        });
import org.jkiss.utils.CommonUtils;
    private Text sourceSettingsText;
            targetSettingsText = new Text(targetSettingsGroup, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL);
                item.setText(2, consumer.getObjectContainerName());
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;

            resultTable = new Table(tablesGroup, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
                }
    public void activatePage() {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;

    private Text targetSettingsText;
import org.eclipse.swt.layout.GridData;
                int tableWidth = resultTable.getSize().x;
        printSummary(sourceSettingsText,
            UIUtils.createTableColumn(resultTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_source_container);
                    item.setImage(2, DBeaverIcons.getImage(consumer.getObjectContainerIcon()));
            if (pipe.getProducer() == null || !pipe.getProducer().isConfigurationComplete()) {
                }
            IDataTransferConsumer<?, ?> consumer = pipe.getConsumer();
            DataTransferProcessorDescriptor processorDescriptor = settings.getProcessor();
                for (TableColumn column : columns) {
                    item.setBackground(1, producerColor);
    }

                DTUIMessages.data_transfer_wizard_final_group_settings_source,
                if (consumerObjectIcon != null) {
    }
        DBSObject dbObject = node.getDatabaseObject();
import org.jkiss.dbeaver.DBException;

        return activated;
import org.jkiss.dbeaver.tools.transfer.*;


            Composite targetSettingsGroup = UIUtils.createTitledComposite(
        activated = true;
                if (producerObjectIcon != null) {
        return activated;
        return true;
    @Override
                DBPImage consumerObjectIcon = consumer.getObjectIcon();
    }
        initializeDialogUnits(parent);
            UIUtils.createTableColumn(resultTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_source);
        }

package org.jkiss.dbeaver.tools.transfer.ui.wizard;
                DBPImage producerObjectIcon = producer.getObjectIcon();
                pipe.initPipe(settings, i, dataPipes.size());
    public boolean isPageComplete() {
            sourceSettingsText = new Text(sourceSettingsGroup, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL);
                summary.append(CommonUtils.notEmpty(settingsSummary));
            try {
                rightGroup,
                    producerObjectIcon = settings.getProducer().getIcon();
            settingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
    }
            Composite settingsGroup = UIUtils.createComposite(sash, 2);

 * distributed under the License is distributed on an "AS IS" BASIS,
            rightGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                DBWorkbench.getPlatformUI().showError(DTUIMessages.data_transfer_page_final_title_error_initializing_transfer_pipe,
    public boolean isPageNavigable() {
                }
                }

        return null;
 *
            @Nullable
            }

        for (int i = 0; i < dataPipes.size(); i++) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    pipe.getProducer().getObjectName()));
            settings.getProducer(),
                GridData.FILL_BOTH);
        getWizard().loadNodeSettings();
            targetSettingsText.setLayoutData(GridDataFactory.create(GridData.FILL_BOTH).hint(130, 50).create());
                }
    }
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
            Composite sourceSettingsGroup = UIUtils.createTitledComposite(
            }
import java.util.List;
        printSummary(targetSettingsText,
        setDescription(DTUIMessages.data_transfer_wizard_final_description);
 * DBeaver - Universal Database Manager
                TableColumn[] columns = resultTable.getColumns();
        text.setText(summary.toString());
            if (!resultTable.isDisposed()) {
        IDataTransferSettings consumerSettings = null, producerSettings = null;
                return false;
            resultTable.setHeaderVisible(true);
        return activated;
    }
            }
    private void printSummary(Text text, DataTransferNodeDescriptor node, IDataTransferSettings settings, DataTransferProcessorDescriptor processor) {
        sash.setLayoutData(new GridData(GridData.FILL_BOTH));
    @Override
        for (DataTransferPipe pipe : getWizard().getSettings().getDataPipes()) {
        SashForm sash = new SashForm(composite, SWT.VERTICAL);

 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean activated = false;
                1,
            }
 * limitations under the License.
 * You may obtain a copy of the License at
        }
                continue;

            }
            if (producerSettings == null) {
        }
import org.eclipse.swt.SWT;
            Composite topGroup = UIUtils.createComposite(sash, 1);
            }
import org.jkiss.dbeaver.ui.UIUtils;
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
 * See the License for the specific language governing permissions and
                }
    public boolean isActivated() {

    }
        StringBuilder summary = new StringBuilder();

import org.eclipse.swt.custom.SashForm;
                if (producer.getObjectContainerIcon() != null) {
                return false;
            resultTable.setLinesVisible(false);
            }
                if (consumerObjectIcon == null && processorDescriptor != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                item.setText(1, CommonUtils.notEmpty(producer.getObjectName()));
            }
            settings.isProducerProcessor() ? null : settings.getProcessor());
import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            sourceSettingsGroup.setLayoutData(GridDataFactory.create(GridData.FILL_BOTH).hint(130, 50).create());
            TableItem item = new TableItem(resultTable, SWT.NONE);
    @Override
        super(DTUIMessages.data_transfer_wizard_final_name);
import org.eclipse.osgi.util.NLS;
            DTUtils.addSummary(summary, processor, getWizard().getSettings().getProcessorProperties());
                1,

            DataTransferPipe pipe = dataPipes.get(i);
        setTitle(DTUIMessages.data_transfer_wizard_final_title);
        }
            if (producer != null) {
                setErrorMessage(NLS.bind(DTUIMessages.data_transfer_error_target_not_specified,
 * Unless required by applicable law or agreed to in writing, software
                    item.setBackground(2, consumerColor);
        List<DataTransferPipe> dataPipes = settings.getDataPipes();
            @Nullable
            if (dataSource != null) {
                    consumerObjectIcon = processorDescriptor.getIcon();

            Composite leftGroup = UIUtils.createComposite(settingsGroup, 1);
            } catch (DBException e) {
            topGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 *
/*
                }
        resultTable.removeAll();
            sourceSettingsText.setLayoutData(GridDataFactory.create(GridData.FILL_BOTH).create());
}            resultTable.setLayoutData(new GridData(GridData.FILL_BOTH));
            Composite tablesGroup = UIUtils.createTitledComposite(
            UIUtils.createTableColumn(resultTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_target);
 *
        if (dbObject != null) {

        UIUtils.asyncExec(() -> {
                    pipe.getConsumer().getObjectName()));


            String settingsSummary = settings.getSettingsSummary();
        return true;
            settings.getConsumer(),
            UIUtils.createTableColumn(resultTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_target_container);
            if (pipe.getConsumer() == null || !pipe.getConsumer().isConfigurationComplete()) {
        {
    }
                setErrorMessage(NLS.bind(DTUIMessages.data_transfer_error_source_not_specified,
                    item.setImage(1, DBeaverIcons.getImage(producerObjectIcon));
            settings.isProducerProcessor() ? settings.getProcessor() : null);
            if (!CommonUtils.isEmpty(settingsSummary)) {
                DTUIMessages.data_transfer_wizard_final_group_settings_target,
        {
                GridData.FILL_BOTH);
class DataTransferPageFinal extends ActiveWizardPage<DataTransferWizard> implements IWizardPageNavigable {
        DataTransferSettings settings = getWizard().getSettings();

                    consumerObjectIcon = settings.getConsumer().getIcon();
                    item.setBackground(3, consumerColor);
            producerSettings,

            leftGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 */
            Composite rightGroup = UIUtils.createComposite(settingsGroup, 1);
    @Override
        }
                Color producerColor = getNodeColor(producer);
    protected boolean determinePageCompletion() {
                DBPDataSourceContainer container = dataSource.getContainer();
                    item.setImage(3, DBeaverIcons.getImage(consumerObjectIcon));
                if (consumer.getObjectContainerIcon() != null) {
                    column.setWidth(tableWidth / columns.length - 1);
        if (processor != null) {

                producerSettings = settings.getNodeSettings(settings.getProducer());
                DTUIMessages.data_transfer_wizard_final_group_objects,

            if (consumer != null) {
                Color consumerColor = getNodeColor(consumer);
                }
            consumerSettings,
    @Override
        setPageComplete(true);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            DBPDataSource dataSource = dbObject.getDataSource();

                    item.setBackground(0, producerColor);

                GridData.FILL_BOTH);
                }


    public void createControl(Composite parent) {
                if (node != null) {
