
                }

    }

        this.resultSetController = resultSetController;
        super.buttonPressed(buttonId);
 * limitations under the License.
        try {
        processorsTable.setContentProvider(new IStructuredContentProvider() {
        SashForm sash = new SashForm(dialogArea, SWT.HORIZONTAL);
 *
import java.io.IOException;
    private PropertyTreeViewer propertyEditor;
    private void createNodesTable(@NotNull Composite composite) {
            @Override
    private final Map<DataTransferProcessorDescriptor, Map<String, Object>> propertiesMap = CopyAsConfigurationStorage.getProcessorProperties();
        };
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.NotNull;
        propertySource = new PropertySourceCustom(selectedProcessor.getProperties(), properties);
    @Override
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
                    log.debug("Unable to provide label for cell: cell's element is null");
 */
    @Override
import org.eclipse.swt.widgets.TableItem;
        UIUtils.maxTableColumnsWidth(processorsTable.getTable());
            selectedProcessor = model.get(0);
            public void update(ViewerCell cell) {
    protected Composite createDialogArea(@NotNull Composite parent) {


        TableViewerColumn columnName = new TableViewerColumn(processorsTable, SWT.LEFT);

        processorsTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.UIUtils;

            public void widgetSelected(SelectionEvent e) {
    }
    private final IResultSetController resultSetController;
        columnDesc.setLabelProvider(labelProvider);
            }
    private TableViewer processorsTable;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetDataContainer;
        } else {
        return dialogArea;
                    return ((Collection<?>) inputElement).toArray();
                TableItem tableItem = (TableItem) e.item;
        propertyEditor = new PropertyTreeViewer(sash, SWT.BORDER);
                return new Object[0];
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
    protected void buttonPressed(int buttonId) {
    private void showPropertiesForSelectedProcessor() {
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
    @Override

                ResultSetMessages.dialog_copy_as_configuration_error_saving_processor_properties_title,


package org.jkiss.dbeaver.ui.controls.resultset.handler;
    protected void okPressed() {

import org.eclipse.jface.viewers.*;

                    return;
            showPropertiesForSelectedProcessor();
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
    private DataTransferProcessorDescriptor selectedProcessor;
    }
    private static final Log log = Log.getLog(CopyAsConfigurationDialog.class);
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.PROCEED_LABEL, false);
        super.okPressed();
 * distributed under the License is distributed on an "AS IS" BASIS,
                e
    }
/*
            public Object[] getElements(Object inputElement) {

        Map<String, Object> properties = propertiesMap.computeIfAbsent(selectedProcessor, proc -> new HashMap<>());
        propertyEditor.loadProperties(propertySource);
                selectedProcessor = (DataTransferProcessorDescriptor) tableItem.getData();
    }
            }
 * See the License for the specific language governing permissions and
        }
            DBWorkbench.getPlatformUI().showError(
        });
        processorsTable = new TableViewer(panel, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
                if (inputElement instanceof Collection) {
            @Override
            }
        List<DataTransferProcessorDescriptor> model = DataTransferRegistry.getInstance().getAvailableConsumers(Collections.singleton(dataContainer)).stream()
 * You may obtain a copy of the License at
 *
import org.eclipse.swt.events.SelectionListener;
    }
            CopyAsConfigurationStorage.saveProcessorProperties(propertiesMap);
        columnName.getColumn().setText("");

 *     http://www.apache.org/licenses/LICENSE-2.0
            .collect(Collectors.toList());
        TableViewerColumn columnDesc = new TableViewerColumn(processorsTable, SWT.LEFT);
                propertiesMap.put(selectedProcessor, propertySource.getPropertiesWithDefaults());
            }
                }
        Composite dialogArea = super.createDialogArea(parent);

        ResultSetDataContainerOptions options = new ResultSetDataContainerOptions();
                DataTransferProcessorDescriptor processorDescriptor = (DataTransferProcessorDescriptor) cell.getElement();
 * Copyright (C) 2010-2024 DBeaver Corp and others

            public void widgetDefaultSelected(SelectionEvent e) {
import java.util.stream.Collectors;
            );
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                    cell.setText(processorDescriptor.getDescription());

            }
                    cell.setText(processorDescriptor.getName());
        sash.setWeights(50, 50);
            log.debug("No appropriate descriptor found, nothing to add to the configure page");
        super(UIUtils.getActiveShell(), ResultSetMessages.dialog_copy_as_configuration_name, null);
                widgetSelected(e);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);
    CopyAsConfigurationDialog(IResultSetController resultSetController) {
            .filter(processor -> !processor.isBinaryFormat())
        sash.setLayoutData(new GridData(GridData.FILL_BOTH));
            @Override
                }
                if (processorDescriptor == null) {
        } catch (IOException e) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
                } else {
        }


import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;

import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        processorsTable.getTable().setLinesVisible(true);

    private PropertySourceCustom propertySource;
        Composite panel = UIUtils.createComposite(composite, 1);
import org.jkiss.dbeaver.Log;
            .flatMap(node -> Arrays.stream(node.getProcessors()))
import java.util.*;
        processorsTable.getTable().addSelectionListener(new SelectionListener() {
        createNodesTable(sash);
        propertyEditor.saveEditorValues();
import org.eclipse.jface.dialogs.IDialogConstants;
            processorsTable.setInput(model);
 *
                if (cell.getColumnIndex() == 0) {
            processorsTable.setSelection(new StructuredSelection(selectedProcessor));
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
        columnName.setLabelProvider(labelProvider);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.eclipse.swt.events.SelectionEvent;
    }
 * DBeaver - Universal Database Manager
            .sorted(Comparator.comparing(DataTransferProcessorDescriptor::getName))
}
        columnDesc.getColumn().setText("");
        ResultSetDataContainer dataContainer = new ResultSetDataContainer(resultSetController, options);
        CellLabelProvider labelProvider = new CellLabelProvider() {
        if (!model.isEmpty()) {

 * you may not use this file except in compliance with the License.
            @Override
import org.eclipse.swt.custom.SashForm;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
            @Override
                showPropertiesForSelectedProcessor();
                ResultSetMessages.dialog_copy_as_configuration_error_saving_processor_properties_message,
        });
            }
            @Override
class CopyAsConfigurationDialog extends BaseDialog {
    @Override
                    cell.setImage(DBeaverIcons.getImage(processorDescriptor.getIcon()));

import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        propertiesMap.put(selectedProcessor, propertySource.getPropertiesWithDefaults());
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetDataContainerOptions;

            public void dispose() {
