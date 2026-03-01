    protected Composite createDialogArea(Composite parent) {
        final Composite composite = super.createDialogArea(parent);
 *


import java.math.BigDecimal;
        return CommonUtils.isNotEmpty(text) ? new BigDecimal(text) : null;
        groupRamLimitText.addVerifyListener(UIUtils.getUnsignedLongOrEmptyTextVerifyListener(groupRamLimitText));
    public String getName() {
    @Override
import org.jkiss.dbeaver.Log;

        sessionRamLimitText = UIUtils.createLabelText(group, ExasolMessages.dialog_consumer_group_session_limit, "");
    @Override
import org.eclipse.swt.layout.GridLayout;
        String text = groupRamLimitText.getText();
import org.eclipse.swt.widgets.Shell;
        return cpuWeight.intValue();
/*
 *

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

    private Text groupRamLimitText;
 * Unless required by applicable law or agreed to in writing, software

    }
    }
        groupRamLimitText = UIUtils.createLabelText(group, ExasolMessages.dialog_consumer_group_group_limit, "");
        this.group.setDescription(getComment());

import org.eclipse.swt.events.ModifyListener;
                    button.setEnabled(false);
    private BigDecimal getGroupRamLimit() {
    }
                    button.setEnabled(true);
            Button button = getButton(IDialogConstants.OK_ID);
 * DBeaver - Universal Database Manager
        String text = sessionRamLimitText.getText();
        };
        super.okPressed();
import org.jkiss.dbeaver.ext.exasol.model.ExasolConsumerGroup;
        precedenceText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
    private static final Log log = Log.getLog(ExasolConsumerGroupDialog.class);
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            if (button != null) {
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
        this.group = group;
    private BigDecimal cpuWeight = null;
    private Text precedenceText;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return composite;
                cpuWeight = new BigDecimal(cpuWeightText.getText());
        nameText.addModifyListener(mod);

    }

    }
            }
    private String comment = "";

        precedenceText = UIUtils.createLabelText(group, ExasolMessages.dialog_consumer_precedence, "");
        return CommonUtils.isNotEmpty(text) ? CommonUtils.toInt(text) : null;
 * you may not use this file except in compliance with the License.
        return CommonUtils.isNotEmpty(text) ? new BigDecimal(text) : null;
        super.createButtonsForButtonBar(parent);
    private BigDecimal getSessionRamLimit() {
}
    private Integer getPrecedence() {
            comment = commentText.getText();
    }
        this.group.setGroupRamLimit(getGroupRamLimit());
        cpuWeightText.addModifyListener(mod);
    @Override
 *
    }
                log.debug("Can't format to number " + cpuWeightText.getText());
        this.group.setUserRamLimit(getUserRamLimit());
    protected void createButtonsForButtonBar(Composite parent) {
        this.group.setSessionRamLimit(getSessionRamLimit());
                } else {

        userRamLimitText = UIUtils.createLabelText(group, ExasolMessages.dialog_consumer_group_user_limit, "");

 * Copyright (C) 2019 Karl Griesser (fullref@gmail.com)
    }
    protected void okPressed() {
import org.jkiss.dbeaver.ui.UIUtils;
        final Text nameText = UIUtils.createLabelText(group, ExasolMessages.dialog_consumer_group_name, "");
        Button button = getButton(IDialogConstants.OK_ID);
package org.jkiss.dbeaver.ext.exasol.ui.config;
import org.eclipse.swt.layout.GridData;

            } catch (NumberFormatException ex) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        userRamLimitText.addVerifyListener(UIUtils.getUnsignedLongOrEmptyTextVerifyListener(userRamLimitText));
    private String getComment() {
        return CommonUtils.isNotEmpty(text) ? new BigDecimal(text) : null;
        final Text commentText = UIUtils.createLabelText(group, ExasolMessages.dialog_priority_group_description, "");


        gd.heightHint = 250;
        GridData gd = new GridData(GridData.FILL_BOTH);
import java.util.Locale;
        sessionRamLimitText.addVerifyListener(UIUtils.getUnsignedLongOrEmptyTextVerifyListener(sessionRamLimitText));
    }
        gd.verticalIndent = 0;
        group.setLayout(new GridLayout(2, false));


            try {
import org.eclipse.swt.SWT;
        this.group.setCpuWeight(getCpuWeight());
        commentText.addModifyListener(mod);
    private Text userRamLimitText;
 * See the License for the specific language governing permissions and
                if (name.isEmpty() | cpuWeight == null) {
            // enable/disable OK button
    private BigDecimal getUserRamLimit() {
        final Composite group = new Composite(composite, SWT.NONE);

import org.eclipse.jface.dialogs.IDialogConstants;
    private int getCpuWeight() {

        this.group.setName(getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String name = "";
 * limitations under the License.
        }
 */


    public ExasolConsumerGroupDialog(Shell parentShell, ExasolConsumerGroup group) {
        ModifyListener mod = e -> {
        return comment;
            name = nameText.getText();

    private ExasolConsumerGroup group;
        return name;
        if (button != null) {
        cpuWeightText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
        final Text cpuWeightText = UIUtils.createLabelText(group, ExasolMessages.dialog_consumer_group_cpu_weight, "");
import org.eclipse.swt.widgets.Composite;
            button.setEnabled(false);
import org.jkiss.utils.CommonUtils;

    private Text sessionRamLimitText;
        group.setLayoutData(gd);
        super(parentShell, ExasolMessages.dialog_create_consumer_group, null);
        String text = precedenceText.getText();
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.group.setPrecedence(getPrecedence());
            }
import org.eclipse.swt.widgets.Text;
        String text = userRamLimitText.getText();
import org.eclipse.swt.widgets.Button;

public class ExasolConsumerGroupDialog extends BaseDialog {
        gd.widthHint = 400;
 * You may obtain a copy of the License at
        gd.horizontalIndent = 0;
    }
