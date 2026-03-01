import org.jkiss.dbeaver.ext.mysql.tasks.MySQLExportSettings;
        noData.addSelectionListener(changeListener);
        };
        settings.setAddDropStatements(addDropStatementsCheck.getSelection());
    private Button noCreateStatementsCheck;
        settings.setNoCreateStatements(noCreateStatementsCheck.getSelection());
        saveState();
    protected void updateState()

        Composite outputGroup = UIUtils.createTitledComposite(composite, MySQLUIMessages.tools_db_export_wizard_page_settings_group_output, 2, GridData.FILL_HORIZONTAL);

import org.eclipse.swt.events.SelectionListener;
        setTitle(MySQLUIMessages.tools_db_export_wizard_page_settings_page_name);
        addDropStatementsCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_add_drop, wizard.getSettings().isAddDropStatements());
        super(wizard, MySQLUIMessages.tools_db_export_wizard_page_settings_page_name);
    private Button disableKeysCheck;
        settings.setExtendedInserts(extendedInsertsCheck.getSelection());
    private Combo methodCombo;

 * DBeaver - Universal Database Manager
            public void widgetSelected(SelectionEvent e) {
            }

    {
    private Button commentsCheck;
        binaryInHex = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_binary_hex, wizard.getSettings().isBinariesInHex());
        extendedInsertsCheck.addSelectionListener(changeListener);
        commentsCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_addnl_comments, wizard.getSettings().isComments());
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Button noRoutines;
package org.jkiss.dbeaver.ext.mysql.tools;
    MySQLExportWizardPageSettings(MySQLExportWizard wizard)


    private Button compressedCheck;
    public void saveState() {
        String fileName = outputFolderText.getText();
        methodCombo.add(MySQLUIMessages.tools_db_export_wizard_page_settings_combo_item_normal);
        settings.setNoRoutines(noRoutines.getSelection());
    @Override
    @Override
import org.eclipse.swt.widgets.Composite;
 * See the License for the specific language governing permissions and
    private Button binaryInHex;
        Composite extraGroup = UIUtils.createComposite(composite, 2);

        methodCombo.add(MySQLUIMessages.tools_db_export_wizard_page_settings_combo_item_online_backup);
import org.eclipse.swt.events.SelectionAdapter;
        removeDefiner = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_remove_definer, wizard.getSettings().isRemoveDefiner());
    private Button addDropStatementsCheck;
            default -> settings.setMethod(MySQLExportSettings.DumpMethod.NORMAL);
        dumpEventsCheck.addSelectionListener(changeListener);
        disableKeysCheck.addSelectionListener(changeListener);

        methodCombo = new Combo(methodGroup, SWT.DROP_DOWN | SWT.READ_ONLY);


        MySQLExportSettings settings = wizard.getSettings();
 *
 */
import org.eclipse.swt.widgets.Button;

            wizard.getSettings().setOutputFilePattern(outputFileText.getText());
        removeDefiner.addSelectionListener(changeListener);
    }
 *
    public void createControl(Composite parent)

    }
        addDropStatementsCheck.addSelectionListener(changeListener);
        methodCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        createSecurityGroup(extraGroup);
        switch (methodCombo.getSelectionIndex()) {
    private Button dumpEventsCheck;
                updateState();
        });
        binaryInHex.addSelectionListener(changeListener);
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
 * Unless required by applicable law or agreed to in writing, software
        setDescription((MySQLUIMessages.tools_db_export_wizard_page_settings_page_description));
 * Copyright (C) 2010-2026 DBeaver Corp and others
        methodCombo.add(MySQLUIMessages.tools_db_export_wizard_page_settings_combo_item_lock_tables);
}
        methodCombo.select(wizard.getSettings().getMethod().ordinal());

        setControl(composite);
    private Button removeDefiner;
import org.eclipse.swt.events.SelectionEvent;
        settings.setBinariesInHex(binaryInHex.getSelection());
        disableKeysCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_disable_keys, wizard.getSettings().isDisableKeys());
        wizard.getSettings().setOutputFolderPattern(CommonUtils.isEmpty(fileName) ? null : fileName);
        noCreateStatementsCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_no_create, wizard.getSettings().isNoCreateStatements());
 *
        commentsCheck.addSelectionListener(changeListener);
        settings.setDisableKeys(disableKeysCheck.getSelection());
        Composite methodGroup = UIUtils.createTitledComposite(composite, MySQLUIMessages.tools_db_export_wizard_page_settings_group_exe_method, 1, GridData.FILL_HORIZONTAL);
            case 1 -> settings.setMethod(MySQLExportSettings.DumpMethod.LOCK_ALL_TABLES);
        extendedInsertsCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_ext_inserts, wizard.getSettings().isExtendedInserts());

    {
    private Button noData;
    private Button extendedInsertsCheck;
            @Override
 * limitations under the License.
        dumpEventsCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_dump_events, wizard.getSettings().isDumpEvents());
        }
        settings.setNoData(noData.getSelection());
 * You may obtain a copy of the License at
        settings.setOutputFilePattern(outputFileText.getText());
        noData = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_no_data, wizard.getSettings().isNoData());
            case 0 -> settings.setMethod(MySQLExportSettings.DumpMethod.ONLINE);
        createExtraArgsInput(outputGroup);
        noRoutines = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_no_routines, wizard.getSettings().isNoRoutines());
    {
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
        settings.setDumpEvents(dumpEventsCheck.getSelection());

        Composite settingsGroup = UIUtils.createTitledComposite(composite, MySQLUIMessages.tools_db_export_wizard_page_settings_group_settings, 3, GridData.FILL_HORIZONTAL);
        noCreateStatementsCheck.addSelectionListener(changeListener);
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        compressedCheck = UIUtils.createCheckbox(settingsGroup, MySQLUIMessages.tools_db_export_wizard_page_settings_checkbox_compressed, wizard.getSettings().isCompressed());

        getContainer().updateButtons();
        settings.setCompressed(compressedCheck.getSelection());
        updatePageCompletion();
import org.eclipse.swt.SWT;

        super.saveState();
import org.eclipse.swt.layout.GridData;
        noRoutines.addSelectionListener(changeListener);
 * you may not use this file except in compliance with the License.
        SelectionListener changeListener = new SelectionAdapter() {
        methodCombo.addSelectionListener(changeListener);
import org.jkiss.dbeaver.ui.UIUtils;
        createOutputFolderInput(outputGroup, wizard.getSettings());


        settings.setComments(commentsCheck.getSelection());
 *     http://www.apache.org/licenses/LICENSE-2.0
        compressedCheck.addSelectionListener(changeListener);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
    }
class MySQLExportWizardPageSettings extends MySQLWizardPageSettings<MySQLExportWizard> {
        settings.setRemoveDefiner(removeDefiner.getSelection());
import org.eclipse.swt.widgets.Combo;
        outputFileText.addModifyListener(e -> {
