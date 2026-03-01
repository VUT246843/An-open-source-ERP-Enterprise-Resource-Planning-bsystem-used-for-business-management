            });
    private void openWarning() {
import org.eclipse.swt.widgets.*;
    @Override
import org.eclipse.jface.dialogs.IDialogSettings;

    protected IDialogSettings getDialogBoundsSettings()
    }
        super(shell, ResultSetMessages.dialog_title_status_details, message);
    }
    protected void createControlsBeforeText(Composite composite) {
                warnItem.setData(ex);
import org.eclipse.swt.events.MouseAdapter;

            for (Throwable ex : warnings) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                    openWarning();
    @Override
import org.jkiss.dbeaver.ui.dialogs.ViewExceptionDialog;
            // Create warnings table
import org.jkiss.dbeaver.ui.UIUtils;
            warnTable.addMouseListener(new MouseAdapter() {
 * limitations under the License.
        return composite;
            TableColumn exColumn = UIUtils.createTableColumn(warnTable, SWT.NONE, "Exception");
            });
    {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            warnTable.setLinesVisible(true);
            return;
    private final List<Throwable> warnings;
        if (selection.length == 0) {
            msgColumn.pack();

 * distributed under the License is distributed on an "AS IS" BASIS,
            warnTable.addTraverseListener(e -> {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
                warnItem.setText(0, ex.getClass().getName());
                }
 */
        UIUtils.createControlLabel(composite, ResultSetMessages.dialog_control_label_massage);
import org.eclipse.swt.layout.GridData;
                public void mouseDoubleClick(MouseEvent e) {

                    e.doit = false;
            UIUtils.createControlLabel(composite, "Warnings");
            exColumn.pack();

class StatusDetailsDialog extends EditTextDialog {
 *
}

import java.util.List;
    private Table warnTable;
        this.warnings = warnings;
                @Override
        if (!CommonUtils.isEmpty(warnings)) {
                }
        textHeight = 100;
        setReadonly(true);
            gd.minimumHeight = 100;
        veDialog.open();
/*

            warnTable.setLayoutData(gd);
                if (e.detail == SWT.TRAVERSE_RETURN) {
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

                TableItem warnItem = new TableItem(warnTable, SWT.NONE);
        Throwable error = (Throwable) selection[0].getData();
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
        }
import org.eclipse.swt.events.MouseEvent;
    private static final String DIALOG_ID = "DBeaver.StatusDetailsDialog";//$NON-NLS-1$
    public StatusDetailsDialog(Shell shell, String message, List<Throwable> warnings) {
import org.eclipse.swt.SWT;
            }
        Composite composite = super.createDialogArea(parent);
    }
        return UIUtils.getDialogSettings(DIALOG_ID);
            GridData gd = new GridData(GridData.FILL_BOTH);
    @Override

            warnTable = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
                if (ex.getMessage() != null) {
                }
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 *
 * you may not use this file except in compliance with the License.
    protected Composite createDialogArea(Composite parent) {
package org.jkiss.dbeaver.ui.controls.resultset;
 * See the License for the specific language governing permissions and
            TableColumn msgColumn = UIUtils.createTableColumn(warnTable, SWT.NONE, "Message");

        TableItem[] selection = warnTable.getSelection();
                    openWarning();
 * Unless required by applicable law or agreed to in writing, software
        ViewExceptionDialog veDialog = new ViewExceptionDialog(getShell(), error);

                    warnItem.setText(1, ex.getMessage());
 *
