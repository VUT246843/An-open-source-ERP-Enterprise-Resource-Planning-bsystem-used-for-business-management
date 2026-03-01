            if (button != null) {
 * Connection test results dialog
    }
    protected void buttonPressed(int buttonId) {

        }
        protected Composite createDialogArea(Composite parent) {
            gd.heightHint = 500;
import org.eclipse.swt.layout.GridLayout;
 */
            serverText.setText(serverVersion.trim());
import org.jkiss.dbeaver.ui.controls.PropertyPageStandard;

            ), null);

            propertyPage.selectionChanged(null, new StructuredSelection(descriptor));
 * limitations under the License.
        {
import org.jkiss.dbeaver.ui.DBeaverIcons;
            final Composite propertyComposite = new Composite(composite, SWT.BORDER);
import org.eclipse.jface.viewers.StructuredSelection;
            Label imageLabel = new Label(composite, SWT.NULL);
import org.eclipse.jface.layout.GridLayoutFactory;
import org.jkiss.dbeaver.core.CoreMessages;


        this.serverVersion = serverVersion;
        {
        }
                descriptor.getDriver().getName()
    private final long elapsedTime;
    @Override
            return;
 * Unless required by applicable law or agreed to in writing, software
    private final String clientVersion;

            new PropertiesDialog(getShell()).open();
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
            Button button = getButton(IDialogConstants.OK_ID);
            UIUtils.createEmptyLabel(composite, 1, 1);
            gd.widthHint = 300;
        this.descriptor = descriptor;
    protected Composite createDialogArea(Composite parent) {
        ((GridLayout) composite.getLayout()).numColumns = 3;
            UIUtils.createControlLabel(composite, CoreMessages.dialog_connection_test_label_server).setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    @Override

        this.elapsedTime = elapsedTime;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.clientVersion = clientVersion;
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            final PropertyPageStandard propertyPage = new PropertyPageStandard();
import org.jkiss.dbeaver.model.messages.ModelMessages;
package org.jkiss.dbeaver.ui.dialogs.connection;
            driverText.setLayoutData(gd);

import org.jkiss.dbeaver.model.DBIcon;
        if (buttonId == IDialogConstants.DETAILS_ID) {
import org.eclipse.swt.SWT;
        }
            final GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        {
            Label messageLabel = new Label(composite, SWT.NONE);
        });
        public PropertiesDialog(Shell shell) {
/*
 * DBeaver - Universal Database Manager
        }
            driverText.setText(clientVersion.trim());
                descriptor.getName() :
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
            UIUtils.createControlLabel(composite, CoreMessages.dialog_connection_test_label_driver).setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
}
            propertyPage.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
 * you may not use this file except in compliance with the License.
 *
                CoreMessages.dialog_connection_test_properties_title, descriptor.getName() != null ?
            }
    }
                button.setFocus();
            gd.widthHint = 500;
    private class PropertiesDialog extends BaseDialog {
            gd.widthHint = 300;
        protected void createButtonsForButtonBar(Composite parent) {
            return composite;
    protected void createButtonsForButtonBar(Composite parent) {

        @Override

        }
        UIUtils.asyncExec(() -> {


            GridData gd = new GridData(GridData.FILL_HORIZONTAL);

/**
import org.eclipse.jface.dialogs.IDialogConstants;
            final Composite composite = super.createDialogArea(parent);
        super.buttonPressed(buttonId);

            super(shell, NLS.bind(
import org.jkiss.dbeaver.ui.UIUtils;

            messageLabel.setText(NLS.bind(ModelMessages.dialog_connection_wizard_start_connection_monitor_connected, elapsedTime));
    private final String serverVersion;
 * See the License for the specific language governing permissions and
    private final DataSourceDescriptor descriptor;
            messageLabel.setLayoutData(gd);
import org.eclipse.swt.widgets.*;
            serverText.setLayoutData(gd);
 *     http://www.apache.org/licenses/LICENSE-2.0
            Text serverText = new Text(composite, SWT.READ_ONLY | SWT.MULTI | SWT.WRAP);

            imageLabel.setImage(DBeaverIcons.getImage(DBIcon.STATUS_INFO));
    @Override
            UIUtils.createEmptyLabel(composite, 1, 1);
        }
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        }
        return composite;
    }
            propertyComposite.setLayout(GridLayoutFactory.fillDefaults().create());
            Text driverText = new Text(composite, SWT.READ_ONLY | SWT.MULTI | SWT.WRAP);
    }
            gd.horizontalSpan = 2;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.eclipse.swt.layout.GridData;
            propertyComposite.setLayoutData(gd);
        createButton(parent, IDialogConstants.DETAILS_ID, IDialogConstants.SHOW_DETAILS_LABEL, false);


            propertyPage.createControl(propertyComposite);
 *
import org.eclipse.osgi.util.NLS;
    }
        @Override

        super(parentShell, CoreMessages.dialog_connection_test_title, DBIcon.TREE_DATABASE);
            close();
    public ConnectionTestDialog(Shell parentShell, DataSourceDescriptor descriptor, String serverVersion, String clientVersion, long elapsedTime) {
        Composite composite = super.createDialogArea(parent);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
public class ConnectionTestDialog extends BaseDialog {
