import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
import org.jkiss.dbeaver.ui.dialogs.BaseProgressDialog;
        } catch (InvocationTargetException e) {
            throw new DBException("Can not determine target container");
            }
                    for (int i = 0; i < row.length; i++) {
/*
                    }
                        continue;

                    if (columnMapping == null) {
                }
                    column.setData(columnMapping);
            gd.heightHint = 400;

 */
            try {
        Throwable finalError = error;
                strRows.add(strRow);
    private void loadImportPreview(
import org.jkiss.dbeaver.DBException;
        }
                    null);
    @Override
import org.eclipse.swt.SWT;
 *
                for (String[] row : strRows) {
    }
        } catch (InterruptedException e) {
 * See the License for the specific language governing permissions and
                previewTable.setRedraw(true);
    protected Composite createDialogArea(Composite parent) {
        if (target == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.eclipse.jface.dialogs.IDialogSettings;
                    TableColumn column = new TableColumn(previewTable, SWT.NONE);
                        attrTarget = attr.sourceAttr;
        {
            gd.widthHint = 600;
        }
import org.eclipse.swt.layout.GridLayout;
                    TableItem previewItem = new TableItem(previewTable, SWT.NONE);
                    strRow[attr.targetIndex] = CommonUtils.getSingleLineString(valueStr);
                    monitor.subTask("Process sample rows");


import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
            previewTable.setHeaderVisible(true);
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                    column.setText(columnMapping.targetAttr.getTargetName());

                    // Load preview
        try (DBCSession session = DBUtils.openUtilSession(monitor, target, "Generate preview values")) {
                    if (attr == null) {
                }

                    column.dispose();
import org.jkiss.dbeaver.ui.DBeaverIcons;

    }
    private final DatabaseMappingContainer mappingContainer;
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, true);

import org.jkiss.dbeaver.model.exec.DBCSession;

                } catch (Throwable e) {
import org.jkiss.utils.CommonUtils;
import java.util.List;
        UIUtils.asyncExec(() -> {
            });
    private static final int previewRowCount = 100;
            } finally {
    PreviewMappingDialog(
            IDataTransferConsumer realConsumer = pipe.getConsumer();
            DBWorkbench.getPlatformUI().showError(DTUIMessages.stream_producer_page_preview_title_load_entity_meta,
        }

            // Ignore
        });
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final DataTransferSettings dtSettings;
            previewTable = new Table(previewGroup, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
                for (DatabaseTransferConsumer.ColumnMapping attr : columnMappings) {
                    Object srcValue = row[attr.targetIndex];
                    throw new InvocationTargetException(e);
class PreviewMappingDialog extends BaseProgressDialog {
            previewGroup.setLayout(new GridLayout(1, false));
        Throwable error = null;
            GridData gd = new GridData(GridData.FILL_BOTH);


    protected IDialogSettings getDialogBoundsSettings() {
    private void loadTransferPreview() {

            error = e.getTargetException();
import org.jkiss.dbeaver.model.DBValueFormatting;
        }
import org.eclipse.swt.layout.GridData;
                pipe.setConsumer(previewConsumer);
                try {
    }
 *
        List<String[]> strRows = new ArrayList<>(rows.size());
 * DBeaver - Universal Database Manager
            }
                        if (row[i] != null) {

import java.util.ArrayList;
                    }
        return main;
                }
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
        List<Object[]> rows = previewConsumer.getRows();
            }

                    }
                        // New column - it is ok for preview only
import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;
 * Unless required by applicable law or agreed to in writing, software
                        }
        DataTransferSettings dtSettings) {
import java.lang.reflect.InvocationTargetException;
    }
            previewGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 *
                previewTable.removeAll();
                target = ((DatabaseConsumerSettings) consumerSettings).getContainer();
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
                }
                pipe.initPipe(dtSettings, 0, 1);
        UIUtils.asyncExec(() -> getShell().setFocus());
                }
            Composite previewGroup = new Composite(main, SWT.NONE);
        UIUtils.asyncExec(this::loadTransferPreview);
        IDataTransferProducer producer = pipe.getProducer();

    private Table previewTable;
        DBSObject target = mappingContainer.getTarget();
        } finally {
                    previewConsumer.getCtlMonitor(),
            if (consumerSettings instanceof DatabaseConsumerSettings) {

        try {
        super(parentShell, DTMessages.data_transfer_wizard_page_preview_title + " - " + mappingContainer.getTargetName(), null);
        this.pipe = pipe;
                    String valueStr = attr.targetValueHandler.getValueDisplayString(attrTarget, value, DBDDisplayFormat.UI);
            UIUtils.createControlLabel(previewGroup, DTMessages.data_transfer_wizard_settings_group_preview);
        if (finalError != null) {
            this.run(true, true, monitor -> {
                    DBSAttributeBase attr = columnMapping.targetAttr.getTarget();
                    if (attrTarget == null) {
                for (TableColumn column : previewTable.getColumns()) {
                producer.transferData(
            previewTable.setRedraw(false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            previewTable.setLinesVisible(true);
            } finally {
        try {
                    Object value = attr.sourceValueHandler.getValueFromObject(session, attr.sourceAttr, srcValue, false, true);
                    if (attr == null) {
        return UIUtils.getDialogSettings(DIALOG_ID);
                        continue;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingContainer;
        this.mappingContainer = mappingContainer;
                String[] strRow = new String[row.length];
        DataTransferPipe pipe,

        }
                    DBSAttributeBase attrTarget = attr.targetAttr.getTarget();
                    }
            }
            for (Object[] row : rows) {
        }

                    dtSettings.getProcessor() == null ? null : dtSettings.getProcessor().getInstance(),
                        // We can use icon from source attribute
        Composite main = super.createDialogArea(parent);
                DTUIMessages.stream_producer_page_preview_message_entity_attributes, finalError);
        DatabaseMappingContainer mappingContainer,
            DatabaseTransferConsumer.ColumnMapping[] columnMappings = previewConsumer.getColumnMappings();

    private final DataTransferPipe pipe;
            previewConsumer.close();

    @Override
                pipe.setConsumer(realConsumer);
    protected void createButtonsForButtonBar(Composite parent) {
                monitor.beginTask("Load preview", 1);
        }

                    producerSettings,
        main.setLayoutData(new GridData(GridData.FILL_BOTH));

            try {
                    }
                UIUtils.packColumns(previewTable);
        DBRProgressMonitor monitor) throws DBException {
    private static final String DIALOG_ID = "DBeaver.DataTransfer.PreviewMappingDialog";
        Shell parentShell,
                for (DatabaseTransferConsumer.ColumnMapping columnMapping : previewConsumer.getColumnMappings()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
                    loadImportPreview(monitor);

        PreviewConsumer previewConsumer = new PreviewConsumer(monitor, mappingContainer, previewRowCount);
 * You may obtain a copy of the License at
        if (target == null) {
        IDataTransferSettings consumerSettings = dtSettings.getNodeSettings(pipe.getConsumer());
}

import org.jkiss.dbeaver.tools.transfer.*;
        IDataTransferSettings producerSettings = dtSettings.getNodeSettings(producer);
                    monitor.done();
import org.eclipse.jface.dialogs.IDialogConstants;
                    previewConsumer,
                            previewItem.setText(i, row[i]);
                    monitor.worked(1);
            previewTable.setLayoutData(gd);

    }
import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.DBUtils;
        this.dtSettings = dtSettings;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                    column.setImage(DBeaverIcons.getImage(DBValueFormatting.getObjectImage(attr)));
                        attr = columnMapping.sourceAttr;

