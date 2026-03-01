 * Unless required by applicable law or agreed to in writing, software
            UIUtils.createLabel(composite, CoreApplicationMessages.reset_settings_dialog_message);
            }
                final Button checkbox = (Button) e.widget;
                } else {

            try {
import org.eclipse.jface.dialogs.IDialogConstants;

                checkbox.notifyListeners(SWT.Selection, new Event());
 * limitations under the License.
        protected Composite createDialogArea(@NotNull Composite parent) {

import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationMessages;
/*
                composite, CoreApplicationMessages.reset_settings_dialog_options, 1, GridData.FILL_BOTH);
            super(shell, CoreApplicationMessages.reset_settings_dialog_title, null);
import java.util.HashSet;
        protected void createButtonsForButtonBar(@NotNull Composite parent) {
import java.util.Set;
            } finally {
 * distributed under the License is distributed on an "AS IS" BASIS,
    };
        }
                    final Button button = getButton(IDialogConstants.OK_ID);
                });
        private final Set<Option> options = new HashSet<>();

 *
                final Option option = (Option) checkbox.getData();
 * You may obtain a copy of the License at
    );
import org.eclipse.core.commands.ExecutionEvent;
        @Nullable String description,

                    options.remove(option);
 * DBeaver - Universal Database Manager
    }
            createButton(parent, IDialogConstants.OK_ID, CoreApplicationMessages.button_apply_and_restart, true)
        }
        public ResetSettingsDialog(@NotNull Shell shell) {

        private static int computeCheckboxIndent(@NotNull Composite parent) {
package org.jkiss.dbeaver.ui.app.standalone.actions;

    private static class ResetSettingsDialog extends BaseDialog {
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        if (dialog.open() != IDialogConstants.OK_ID) {

            Composite group = UIUtils.createTitledComposite(
        @Override
                measurementLabel.dispose();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        @NotNull
    public Object execute(ExecutionEvent event) throws ExecutionException {
 *     http://www.apache.org/licenses/LICENSE-2.0
                return measurementCheckbox.getSize().x - measurementLabel.getSize().x;
        @NotNull String name,

        return null;
            final int indent = computeCheckboxIndent(group);
import org.eclipse.swt.events.SelectionListener;
                    if (button != null) {
                    }
            for (Option option : ResetSettingsHandler.OPTIONS) {
            });
            parent.layout(true, true);
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    ) {

 * Licensed under the Apache License, Version 2.0 (the "License");

                }
        final ResetSettingsDialog dialog = new ResetSettingsDialog(HandlerUtil.getActiveShell(event));
            final SelectionListener listener = SelectionListener.widgetSelectedAdapter(e -> {
                final Label label = UIUtils.createLabel(group, option.description);
        @Override
import org.jkiss.dbeaver.ui.UIUtils;
        CoreApplicationMessages.reset_settings_option_workspace_configuration_description,
import org.jkiss.code.Nullable;

                        button.setEnabled(!options.isEmpty());
    private record Option(

 *
            final DBeaverApplication instance = DBeaverApplication.getInstance();
import org.eclipse.jface.layout.GridDataFactory;

        final Set<Option> options = dialog.options;
        CoreApplicationMessages.reset_settings_option_user_preferences_description,

        RESET_WORKSPACE_CONFIGURATION
            setShellStyle(SWT.DIALOG_TRIM);
import org.jkiss.code.NotNull;
import org.eclipse.ui.PlatformUI;
            return composite;
            instance.setResetWorkspaceConfigurationOnRestart(options.contains(RESET_WORKSPACE_CONFIGURATION));
                .setEnabled(false);

        RESET_USER_PREFERENCES,
        true

import org.eclipse.core.commands.AbstractHandler;
    private static final Option RESET_USER_PREFERENCES = new Option(
import org.eclipse.swt.widgets.*;
                checkbox.setData(option);
    private static final Option[] OPTIONS = {
import org.eclipse.core.commands.ExecutionException;

            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        }
 * See the License for the specific language governing permissions and
            return null;

        if (workbench.restart()) {
        }
public class ResetSettingsHandler extends AbstractHandler {
        boolean checked
 * you may not use this file except in compliance with the License.

                UIUtils.asyncExec(() -> {
    );

                if (checkbox.getSelection()) {
import org.eclipse.swt.SWT;
    }
                    options.add(option);
import org.eclipse.ui.IWorkbench;
        CoreApplicationMessages.reset_settings_option_user_preferences_name,

                final Button checkbox = UIUtils.createCheckbox(group, option.name, option.description, option.checked, 1);
            instance.setResetUserPreferencesOnRestart(options.contains(RESET_USER_PREFERENCES));
}
                checkbox.addSelectionListener(listener);
        }
 *

                measurementCheckbox.dispose();
    private static final Option RESET_WORKSPACE_CONFIGURATION = new Option(
    @Override
import org.jkiss.dbeaver.ui.app.standalone.DBeaverApplication;
import org.eclipse.ui.handlers.HandlerUtil;
        }
            final Button measurementCheckbox = UIUtils.createCheckbox(parent, "X", false);

            }
        final IWorkbench workbench = PlatformUI.getWorkbench();
                label.setLayoutData(GridDataFactory.swtDefaults().indent(indent, 0).create());
            final Composite composite = super.createDialogArea(parent);
            final Label measurementLabel = UIUtils.createLabel(parent, "X ");
        CoreApplicationMessages.reset_settings_option_workspace_configuration_name,

import org.eclipse.swt.layout.GridData;
        false
