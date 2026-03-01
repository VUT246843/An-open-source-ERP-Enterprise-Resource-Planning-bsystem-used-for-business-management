 * Licensed under the Apache License, Version 2.0 (the "License");
                return Status.OK_STATUS;
}
import org.eclipse.jface.dialogs.IDialogSettings;
            table.setLinesVisible(true);
                schema = allSchemas.get(schemaCombo.getSelectionIndex());
        return extension;
 *
                public void controlResized(ControlEvent e)
import org.jkiss.dbeaver.utils.GeneralUtils;
                    });
            
        });
            final Table table = extTable.getTable();
 * limitations under the License.
                    });
                {
import org.jkiss.dbeaver.DBException;
/*
        final Combo schemaCombo = UIUtils.createLabelCombo(group, PostgreMessages.dialog_create_extension_schema, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
            }});
    protected void createButtonsForButtonBar(Composite parent)
        final Text databaseText = UIUtils.createLabelText(group,PostgreMessages.dialog_create_extension_database, newextension.getDatabase().getName(), SWT.BORDER | SWT.READ_ONLY); //$NON-NLS-2$
    }

                }
            public void widgetSelected(SelectionEvent e) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void checkEnabled() {
        
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                            schemaCombo.setText(schema.getName());
                }
    @Override
    {
import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
            }
        extTable.addSelectionChangedListener(event -> {
                try {
import org.eclipse.core.runtime.Status;
        gd.horizontalIndent = 0;
    protected IDialogSettings getDialogBoundsSettings()
            }
        columnController.createColumns();
            @Override
    }
 * PostgreCreateExtensionDialog
import org.eclipse.swt.layout.GridData;
                    table.removeControlListener(this);
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            table.addControlListener(new ControlAdapter() {
    
 * you may not use this file except in compliance with the License.
                        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static final String DIALOG_ID = "DBeaver.PostgreCreateExtensionDialog";//$NON-NLS-1$
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
       
    }
        return UIUtils.getDialogSettings(DIALOG_ID);
            @NotNull


                return Status.OK_STATUS;
    public PostgreSchema getSchema() {
                cell.setText(((PostgreAvailableExtension) cell.getElement()).getVersion());
                cell.setText(((PostgreAvailableExtension) cell.getElement()).getName());
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        
        gd.heightHint = 200;
                    UIUtils.maxTableColumnsWidth(table);
                checkEnabled();
        extTable.setContentProvider(new ListContentProvider());
            public void update(ViewerCell cell)

                    allSchemas = new ArrayList<>(newextension.getDatabase().getSchemas(monitor));
    }
    @Override
import org.jkiss.code.NotNull;
        GridData gd = new GridData(GridData.FILL_BOTH);
            {

            public void update(ViewerCell cell)
        super(parentShell, PostgreMessages.dialog_create_extension_title, null);
 */

    private List<PostgreSchema> allSchemas;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.ControlEvent;
        group.setLayout(new GridLayout(2, false));
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
            }
    }
    
                }
import org.eclipse.swt.events.ControlAdapter;
                cell.setText(((PostgreAvailableExtension) cell.getElement()).getDescription());
/**
            });
                checkEnabled();
            table.setLayoutData(new GridData(GridData.FILL_BOTH));
        final Composite composite = super.createDialogArea(parent);
 *     http://www.apache.org/licenses/LICENSE-2.0
        


import java.util.ArrayList;
        new AbstractJob("Load schemas") {
            {
 * Unless required by applicable law or agreed to in writing, software
                } catch (DBException e) {

        final Composite group = new Composite(composite, SWT.NONE);

    private final PostgreExtension newextension;
    protected Composite createDialogArea(Composite parent) {
import org.jkiss.dbeaver.model.DBUtils;
                    final List<PostgreAvailableExtension> installed = new ArrayList<>(newextension.getDatabase().getAvailableExtensions(monitor));
    private PostgreAvailableExtension extension;
                        }
        
    public PostgreCreateExtensionDialog(Shell parentShell, PostgreExtension extension) {
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        columnController.addColumn(PostgreMessages.dialog_create_extension_column_name, null, SWT.NONE, true, true, new CellLabelProvider() {

                    UIUtils.syncExec(() -> {                        
        new AbstractJob("Load available extensions") {
                        
        return schema;

import org.eclipse.jface.viewers.ViewerCell;

                     UIUtils.syncExec(() -> {
            @Override

        gd.verticalIndent = 0;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreAvailableExtension;
        extTable = new TableViewer(group, SWT.BORDER | SWT.UNDERLINE_SINGLE | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
    public PostgreAvailableExtension getExtension() {
        }.schedule();
            table.setHeaderVisible(true);

            @NotNull
import org.eclipse.jface.viewers.IStructuredSelection;
package org.jkiss.dbeaver.ext.postgresql.ui;
            }});
import org.eclipse.jface.viewers.CellLabelProvider;
        return composite;
import java.util.List;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 *
 *
        getButton(IDialogConstants.OK_ID).setEnabled(false);
                        if (schema != null) {
import org.jkiss.dbeaver.ui.UIUtils;
            @Override

                @Override
         }
import org.eclipse.swt.layout.GridLayout;
    private TableViewer extTable;
            }
{
 * Copyright (C) 2010-2025 DBeaver Corp and others
              

                    UIUtils.packColumns(table);
import org.eclipse.swt.widgets.*;
        this.newextension = extension;
                try {
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.core.runtime.IStatus;
        gd.widthHint = 600;
import org.eclipse.swt.SWT;
 * You may obtain a copy of the License at
import org.eclipse.swt.events.SelectionEvent;
    private PostgreSchema schema;
        final Label lblExtension = UIUtils.createLabel(group, PostgreMessages.dialog_create_extension_name);
    }
            public void update(ViewerCell cell)
        group.setLayoutData(gd);
            {
        super.createButtonsForButtonBar(parent);
                extension = (PostgreAvailableExtension) selection.getFirstElement();//installed.get(extensionCombo.getSelectionIndex());
            }});
    }
 */
        });
        {
            if (!selection.isEmpty()) {

        columnController.addColumn(PostgreMessages.dialog_create_extension_column_version, null, SWT.NONE, true, true, new CellLabelProvider() {
                        for (PostgreSchema schema : allSchemas) {
        columnController.addColumn(PostgreMessages.dialog_create_extension_column_description, null, SWT.NONE, true, true, new CellLabelProvider() {
            @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
            getButton(IDialogConstants.OK_ID).setEnabled(extension != null && schema != null); 
 * See the License for the specific language governing permissions and
            @Override
         schemaCombo.addSelectionListener(new SelectionAdapter() {
        ViewerColumnController columnController = new ViewerColumnController("AvailabelExtensionDialog", extTable);
        }.schedule();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
                    return GeneralUtils.makeExceptionStatus(e);
public class PostgreCreateExtensionDialog extends BaseDialog
            @Override
                        schema = DBUtils.findObject(allSchemas, PostgreConstants.PUBLIC_SCHEMA_NAME);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreExtension;
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

                        extTable.setInput(installed);
    {
                            schemaCombo.add(schema.getName());
                    return GeneralUtils.makeExceptionStatus(e);
 * DBeaver - Universal Database Manager
                } catch (DBException e) {
