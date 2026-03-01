            @Override
        group.setLayout(new GridLayout(2, false));

 * DBeaver - Universal Database Manager
 *
        group.setLayoutData(gd);
    protected void createButtonsForButtonBar(Composite parent) {
        commentText.addModifyListener(mod);

    protected Composite createDialogArea(Composite parent) {

    private int weight = -1;
            }
                		weight = Integer.parseInt(weightText.getText());
    }
import org.eclipse.swt.events.ModifyEvent;
 */
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                try {
        return name;
 * limitations under the License.
        gd.heightHint = 150;
    }
                //enable/disable OK button   
        return composite;
            public void modifyText(ModifyEvent e) {


        weightText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        super.createButtonsForButtonBar(parent);
        final Text weightText = UIUtils.createLabelText(group, ExasolMessages.dialog_priority_group_weight, "");
/*
import org.eclipse.swt.layout.GridData;
        super(parentShell, ExasolMessages.dialog_create_priority_group, null);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.exasol.model.ExasolPriorityGroup;

import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
        ModifyListener mod = new ModifyListener() {
import org.eclipse.jface.dialogs.IDialogConstants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    }
        gd.verticalIndent = 0;
import org.eclipse.swt.widgets.Shell;
        final Text commentText = UIUtils.createLabelText(group, ExasolMessages.dialog_priority_group_description, "");
        weightText.addModifyListener(mod);
package org.jkiss.dbeaver.ext.exasol.ui.config;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        gd.horizontalIndent = 0;
				}
import org.eclipse.swt.widgets.Composite;
        final Composite group = new Composite(composite, SWT.NONE);
import org.eclipse.swt.events.ModifyListener;
    public String getName() {
 *


        group.setLayout(new GridLayout(2, true));
        return comment;
    public int getWeight() {
                	if (weightText.getText().length()>0)

                comment = commentText.getText();
        };
        gd.widthHint = 400;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
				} catch (NumberFormatException ex) {
import org.eclipse.swt.widgets.Text;
                    getButton(IDialogConstants.OK_ID).setEnabled(true);
 * Unless required by applicable law or agreed to in writing, software
 *
                    getButton(IDialogConstants.OK_ID).setEnabled(false);
                } else {

import org.eclipse.swt.layout.GridLayout;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final Composite composite = super.createDialogArea(parent);
    private String name = "";
        getButton(IDialogConstants.OK_ID).setEnabled(false);

    @Override
        nameText.addModifyListener(mod);

    private String comment = "";
        GridData gd = new GridData(GridData.FILL_BOTH);

                }
    public String getComment() {
        final Text nameText = UIUtils.createLabelText(group, ExasolMessages.dialog_priority_group_name, "");
    }
                name = nameText.getText();
public class ExasolPriorityGroupDialog extends BaseDialog {

import org.jkiss.dbeaver.ui.UIUtils;

}
import org.eclipse.swt.SWT;
    public ExasolPriorityGroupDialog(Shell parentShell, ExasolPriorityGroup group) {
 * Copyright (C) 2019 Karl Griesser (fullref@gmail.com)

import java.util.Locale;
                if (name.isEmpty() | weight == -1 | weight > 1000 | weight < 1) {

        return weight;
