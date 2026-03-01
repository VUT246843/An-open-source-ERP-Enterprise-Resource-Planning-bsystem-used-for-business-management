 *
    public DB2ToolShowErrorDialog(IWorkbenchWindow window, DB2DataSource db2DataSource)
    protected Control createDialogArea(Composite parent)
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                try {
        // Line 1: Label + input code + button
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
                } catch (Exception e1) {
class DB2ToolShowErrorDialog extends Dialog {
    }

import org.jkiss.dbeaver.ext.db2.DB2Utils;

        Composite area = (Composite) super.createDialogArea(parent);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    String msg = DB2Utils.getMessageFromCode(db2DataSource, sqlIntegerCode);
import org.eclipse.jface.dialogs.Dialog;
    {

 * You may obtain a copy of the License at

    }
                }
        UIUtils.createControlLabel(container1, DB2Messages.dialog_tools_mes_message);

import org.jkiss.dbeaver.runtime.DBWorkbench;
                    DBWorkbench.getPlatformUI().showError(DB2Messages.dialog_tools_mes_error_code_title,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
        // -----------------------------------
            }
        Composite container1 = UIUtils.createPlaceholder(area, 3, 5);
/*
import org.eclipse.swt.events.SelectionAdapter;
    private Text resultMessage;
                } catch (NumberFormatException nfe) {
 */
        // Button
import org.jkiss.dbeaver.ui.UIUtils;
        button.addSelectionListener(new SelectionAdapter() {
package org.jkiss.dbeaver.ext.db2.ui.tools;
/**
        // -----------------------------------
        Button button = new Button(container1, SWT.PUSH);

                Integer sqlIntegerCode = 0;
            @Override
        return area;
    {
    {
        });
        gd.horizontalSpan = 2;


                }
        getShell().setDefaultButton(button);
        // SQL Error Code
}
                    resultMessage.setText(e1.getMessage());
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 
import org.eclipse.swt.layout.GridData;
    protected Button createButton(Composite parent, int id, String label, boolean defaultButton)
 * Unless required by applicable law or agreed to in writing, software
        this.db2DataSource = db2DataSource;
        resultMessage = new Text(container1, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);

                try {
    }
        newShell.setText(DB2Messages.dialog_tools_msg_title);
                    sqlIntegerCode = Integer.valueOf(textSqlErrorCode.getText());
    {
        button.setText("Retrieve Message");
    }
import org.eclipse.swt.events.SelectionEvent;
    @Override
        // -----------------------------------
        // Disable all default buttons

        return true;
 * @author Denis Forveille
 *


        UIUtils.createLabel(container1, DB2Messages.dialog_tools_msg_code);

    {

    @Override
 * 
    @Override
        resultMessage.setEditable(false);
    protected void configureShell(Shell newShell)
                    // Most likely, there is no message for this code. tell this to the user..
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;

 * limitations under the License.
        // Line 2: Label for Message
            public void widgetSelected(SelectionEvent e)
        // Message
    }
import org.eclipse.ui.IWorkbenchWindow;
    @Override
            {

import org.eclipse.swt.SWT;
        super.configureShell(newShell);
        // -----------------------------------
        // -----------------------------------
 * Dialog to display the SQL message associated with an SQL Error Code
                    return;
 */
    protected boolean isResizable()
        gd.heightHint = 80;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
                        DB2Messages.dialog_tools_mes_error_code);
 * you may not use this file except in compliance with the License.
        resultMessage.setLayoutData(new GridData(GridData.FILL_BOTH));

        // -----------------------------------
        super(window.getShell());
        textSqlErrorCode = new Text(container1, SWT.BORDER);
                    resultMessage.setText(msg);

    private Text textSqlErrorCode;
        resultMessage.setLayoutData(gd);

import org.eclipse.swt.widgets.*;
 * DBeaver - Universal Database Manager
 *

    private final DB2DataSource db2DataSource;
        // Line 3: Message
        gd.widthHint = 600;
