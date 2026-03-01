            pauseAfterExecute.setSelection(0);
import org.jkiss.dbeaver.model.runtime.DBRShellCommand;
import java.util.Map;
        }
        }

                CoreMessages.dialog_connection_edit_wizard_shell_cmd_variables_hint_label,
public class ConnectionPageShellCommands extends ConnectionWizardPage {

            });
                item.setText(eventType.getTitle());
                return item;
                    DBPConnectionEventType eventType = getSelectedEventType();
    private TextWithOpenFolder workingDirectory;
                    }
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
import org.eclipse.swt.events.SelectionAdapter;
            }
}
        DBPConnectionEventType eventType = getSelectedEventType();
        DBRShellCommand command = getActiveCommand();
            Composite eventGroup = UIUtils.createPlaceholder(group, 1);
        for (DBPConnectionEventType eventType : DBPConnectionEventType.values()) {
            terminateCheck.setSelection(command.isTerminateAtDisconnect());

        commandText.setEnabled(command != null && command.isEnabled());
                }
                {
                public void widgetSelected(SelectionEvent e)
                command.setShowProcessPanel(showProcessCheck.getSelection());
                if (event.detail == SWT.CHECK) {
            commandText.setLayoutData(gd);
    private Spinner pauseAfterExecute;
    @Override
    protected ConnectionPageShellCommands(DataSourceDescriptor dataSource)
    private final DataSourceDescriptor dataSource;
import org.jkiss.dbeaver.ui.UIIcon;
            waitFinishTimeoutMs.setSelection(command.getWaitProcessTimeoutMs());
                public void widgetSelected(SelectionEvent e)
/**
    }
            commandText.addModifyListener(e -> updateEvent(true));
        workingDirectory.setEnabled(command != null && command.isEnabled());
            waitFinishCheck.setSelection(false);
        TableItem[] selection = eventTypeTable.getSelection();
 *
            for (DBPConnectionEventType eventType : DBPConnectionEventType.values()) {
            eventTypeTable = new Table(eventGroup, SWT.BORDER | SWT.CHECK | SWT.SINGLE | SWT.FULL_SELECTION);
            workingDirectory.setText("");
    public void createControl(Composite parent)
    }
import java.util.HashMap;



        } else if (!commandChange) {
            eventTypeTable.setLayoutData(new GridData(GridData.FILL_VERTICAL));
                }

            terminateCheck.setSelection(false);
            waitFinishTimeoutMs.addSelectionListener(eventEditAdapter);
        for (TableItem item : eventTypeTable.getItems()) {

                        updateEvent(false);
            waitFinishTimeoutMs = UIUtils.createSpinner(settingsGroup, CoreMessages.dialog_connection_events_checkbox_wait_finish_timeout, 0, DBRShellCommand.WAIT_PROCESS_TIMEOUT_FOREVER, DBRShellCommand.WAIT_PROCESS_TIMEOUT_MAX_SELECTION);
    private void selectEventType(DBPConnectionEventType eventType)
import org.eclipse.swt.SWT;
    private void updateEvent(boolean commandChange)
import org.jkiss.utils.ArrayUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
            selectEventType(null);
            waitFinishTimeoutMs.setSelection(DBRShellCommand.WAIT_PROCESS_TIMEOUT_FOREVER);
                command.setWorkingDirectory(workingDirectory.getText());
        waitFinishTimeoutMs.setEnabled(waitFinishCheck.isEnabled());
/*
            Composite settingsGroup = UIUtils.createTitledComposite(detailsGroup, CoreMessages.dialog_connection_events_settings_group, 2, GridData.FILL_HORIZONTAL);
                command.setPauseAfterExecute(pauseAfterExecute.getSelection());
        }
        pauseAfterExecute.setEnabled(command != null && command.isEnabled());
    {

                item.setImage(DBeaverIcons.getImage(UIIcon.EVENT));
                    selectEventType(eventType);

                    selectEventType(eventType);
                }
 */
                CoreMessages.dialog_connection_edit_wizard_shell_cmd_variables_hint_title,
    {
    {
            workingDirectory.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            pauseAfterExecute.setSelection(command.getPauseAfterExecute());
            commandText.setText(CommonUtils.toString(command.getCommand()));
        showProcessCheck.setEnabled(command != null && command.isEnabled());
                if (prevEnabled != command.isEnabled()) {
    private DBPConnectionEventType getSelectedEventType()
                item.setChecked(command != null && command.isEnabled());
        return ArrayUtils.isEmpty(selection) ? null : (DBPConnectionEventType) selection[0].getData();
            Composite detailsGroup = UIUtils.createComposite(group, 2);
                    command.setEnabled(item.getChecked());
        super(PAGE_NAME);
 * limitations under the License.
                {
import org.eclipse.swt.events.SelectionEvent;
 * You may obtain a copy of the License at
            gd.horizontalSpan = 2;
        for (Map.Entry<DBPConnectionEventType, DBRShellCommand> entry : eventsCache.entrySet()) {
        {
                command.setTerminateAtDisconnect(terminateCheck.getSelection());
            SelectionAdapter eventEditAdapter = new SelectionAdapter() {
            UIUtils.createControlLabel(eventGroup, CoreMessages.dialog_connection_events_label_event);
                    updateEvent(false);
        }
            commandText.setText(""); //$NON-NLS-1$
        workingDirectory.getTextControl().setEnabled(command != null && command.isEnabled());
                command.setWaitProcessTimeoutMs(waitFinishTimeoutMs.getSelection());
import org.jkiss.dbeaver.ui.DBeaverIcons;

                    eventTypeTable.select(eventTypeTable.indexOf((TableItem) event.item));
    private Button waitFinishCheck;
        return null;
        this.dataSource = dataSource;
                    DBRShellCommand command = eventType == null ? null : eventsCache.get(eventType);
        DBPConnectionEventType eventType = getSelectedEventType();
    }
                @Override
 */
                    if (enabled || (command != null && enabled != command.isEnabled())) {
            workingDirectory.setText(CommonUtils.notEmpty(command.getWorkingDirectory()));


            GridData gd = new GridData(GridData.FILL_HORIZONTAL);

            UIUtils.createControlLabel(detailsGroup, CoreMessages.dialog_connection_events_label_command, 2);
import org.eclipse.swt.layout.GridData;
                TableItem item = new TableItem(eventTypeTable, SWT.NONE);
 * Unless required by applicable law or agreed to in writing, software
    private TableItem getEventItem(DBPConnectionEventType eventType)
                    boolean enabled = ((TableItem) e.item).getChecked();



    private Button terminateCheck;
            waitFinishCheck = UIUtils.createCheckbox(settingsGroup, CoreMessages.dialog_connection_events_checkbox_wait_finish, false);
 * Events edit dialog page
 * you may not use this file except in compliance with the License.
            eventTypeTable.addSelectionListener(new SelectionAdapter() {
            boolean prevEnabled = command.isEnabled();
                command.setCommand(commandText.getText());
    }
            showProcessCheck = UIUtils.createCheckbox(settingsGroup, CoreMessages.dialog_connection_events_checkbox_show_process, false);
import org.jkiss.dbeaver.core.CoreMessages;
        if (eventType != null) {
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
            variablesHintLabel.setResolver(new DataSourceVariableResolver(dataSource,
    }
            });
import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
            pauseAfterExecute.addSelectionListener(eventEditAdapter);
            VariablesHintLabel variablesHintLabel = new VariablesHintLabel(
            return eventsCache.computeIfAbsent(eventType, k -> new DBRShellCommand("")); //$NON-NLS-1$
                item.setData(eventType);
 * See the License for the specific language governing permissions and

    {
    }
        waitFinishCheck.setEnabled(command != null && command.isEnabled());
        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.EVENT));
    private static final String CoreMessagesdialog_connection_edit_wizard_shell_cmd_directory_title = null;
            gd.heightHint = 120;
            };
            eventGroup.setLayoutData(new GridData(GridData.FILL_VERTICAL));
                waitFinishTimeoutMs.setEnabled(waitFinishCheck.getSelection());
        Composite group = UIUtils.createPlaceholder(parent, 2, 5);
                }
    @Override
    private Table eventTypeTable;
import org.jkiss.code.NotNull;
        terminateCheck.setEnabled(command != null && command.isEnabled());
            showProcessCheck.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
            eventsCache.put(eventType, command == null ? null : new DBRShellCommand(command));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        setDescription(CoreMessages.dialog_connection_events_title);
                @Override
                TableItem item = getEventItem(eventType);

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.utils.CommonUtils;
    }
        }
        setControl(group);
        }
import org.eclipse.swt.widgets.*;
    {
package org.jkiss.dbeaver.ui.dialogs.connection;
import org.jkiss.dbeaver.model.connection.DBPConnectionEventType;
                dataSource.getConnectionConfiguration()));
            }
    public static final String PAGE_NAME = ConnectionPageShellCommands.class.getSimpleName();
            workingDirectory.getTextControl().addModifyListener(e -> {

            pauseAfterExecute = UIUtils.createLabelSpinner(settingsGroup, CoreMessages.dialog_connection_edit_wizard_shell_cmd_pause_label, CoreMessages.dialog_connection_edit_wizard_shell_cmd_pause_tooltip, 0, 0, Integer.MAX_VALUE);
        DBRShellCommand command = eventType == null ? null : eventsCache.get(eventType);
            }
            waitFinishCheck.addSelectionListener(eventEditAdapter);
        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    private Text commandText;
        selectEventType(null);

            } else {

    }
                DBPConnectionConfiguration.INTERNAL_CONNECT_VARIABLES);
            showProcessCheck.setSelection(command.isShowProcessPanel());
            showProcessCheck.addSelectionListener(eventEditAdapter);
            commandText = new Text(detailsGroup, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
    {
            DBRShellCommand command = dataSource.getConnectionConfiguration().getEvent(eventType);
            terminateCheck.addSelectionListener(eventEditAdapter);
            terminateCheck.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));

import org.jkiss.dbeaver.ui.UIUtils;

                detailsGroup,
                DBRShellCommand command = eventsCache.get(eventType);
            dataSourceDescriptor.getConnectionConfiguration().setEvent(entry.getKey(), entry.getValue());
            waitFinishCheck.setSelection(command.isWaitProcessFinish());

            if (item.getData() == eventType) {
        setTitle(CoreMessages.dialog_connection_edit_wizard_shell_cmd);
    private final Map<DBPConnectionEventType, DBRShellCommand> eventsCache = new HashMap<>();
import org.jkiss.dbeaver.ui.controls.TextWithOpenFolder;
                    command.setWorkingDirectory(workingDirectory.getText());

    public void saveSettings(@NotNull DBPDataSourceContainer dataSourceDescriptor) {


            UIUtils.createControlLabel(settingsGroup, CoreMessages.dialog_connection_edit_wizard_shell_cmd_directory_label);
                if (command != null) {
            eventTypeTable.addListener(SWT.Selection, event -> {
            terminateCheck = UIUtils.createCheckbox(settingsGroup, CoreMessages.dialog_connection_events_checkbox_terminate_at_disconnect, false);

        if (command != null) {
        {
import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;
        }
            detailsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                }
        return null;
                }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            });
            workingDirectory = new TextWithOpenFolder(settingsGroup, CoreMessagesdialog_connection_edit_wizard_shell_cmd_directory_title);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
            showProcessCheck.setSelection(false);
 * Copyright (C) 2010-2026 DBeaver Corp and others
                DBRShellCommand command = getActiveCommand();
        if (command != null) {
    private Spinner waitFinishTimeoutMs;

            gd.widthHint = 300;
 *
    private DBRShellCommand getActiveCommand() {

                if (item != null) {
    private Button showProcessCheck;
            if (commandChange) {
                command.setWaitProcessFinish(waitFinishCheck.getSelection());
