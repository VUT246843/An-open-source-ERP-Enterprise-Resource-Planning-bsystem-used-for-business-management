            colDelimCombo = UIWidgets.createDelimiterCombo(group, ResultSetMessages.copy_special_column_delimiter, new String[] {"\t", ";", ","}, copySettings.getColumnDelimiter(), false);
            settings.put(PARAM_FORMAT, copySettings.getFormat().name());
import org.jkiss.dbeaver.ui.UIWidgets;

                ResultSetUtils.copyToClipboard(
import org.eclipse.jface.dialogs.IDialogSettings;
            }

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;

        private Button forceQuoteCheck;
 * Unless required by applicable law or agreed to in writing, software
        }
        element.setText(ResultSetMessages.actions_spreadsheet_copy_special);
import org.eclipse.swt.widgets.Shell;
import org.eclipse.osgi.util.NLS;
        }
            settings.put(PARAM_FORCE_QUOTES, copySettings.isForceQuotes());
                        resultSet.getActivePresentation().copySelection(copySettingsLast));
            }
            settings.put(PARAM_COPY_HTML, copySettings.isCopyHTML());
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            copySettings.setRowDelimiter(CommonUtils.unescapeDisplayString(rowDelimCombo.getText()));
    public static final String CMD_COPY_SPECIAL = IActionConstants.CMD_COPY_SPECIAL;
                copySettings.setQuoteString(settings.get(PARAM_QUOTE_STRING));
 * you may not use this file except in compliance with the License.

        private Button copyHeaderCheck;
            quoteCellsCheck = UIUtils.createCheckbox(group, ResultSetMessages.copy_special_quote_cell_values_text, ResultSetMessages.copy_special_quote_cell_values_tip, copySettings.isQuoteCells(), 2);
 *
                copySettings.setCopyHeader(settings.getBoolean(PARAM_COPY_HEADER));
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        private Combo colDelimCombo;
    }
        switch (event.getCommand().getId()) {
        @Override
        }
 * You may obtain a copy of the License at
import org.eclipse.jface.dialogs.IDialogConstants;
                ActionUtils.findCommandDescription(CMD_COPY_SPECIAL_LAST, PlatformUI.getWorkbench(), true)
        }
            copyHeaderCheck = UIUtils.createCheckbox(group, ResultSetMessages.copy_special_copy_header_text, null, copySettings.isCopyHeader(), 2);
            if (settings.get(PARAM_COPY_HTML) != null) {
    public static class CopyConfigDialog extends BaseDialog {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (settings.get(PARAM_QUOTE_STRING) != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            copyRowsCheck = UIUtils.createCheckbox(group, ResultSetMessages.copy_special_copy_row_numbers_text, null, copySettings.isCopyRowNumbers(), 2);
            ((GridLayout)group.getLayout()).numColumns = 2;
            placeholder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
            return null;
/*
import org.eclipse.ui.handlers.HandlerUtil;
            forceQuoteCheck = UIUtils.createCheckbox(group, ResultSetMessages.copy_special_force_quote_cell_values_text, ResultSetMessages.copy_special_force_quote_cell_values_tip, copySettings.isForceQuotes(), 2);
                copySettings.setCopyHTML(settings.getBoolean(PARAM_COPY_HTML));
            settings.put(PARAM_QUOTE_STRING, copySettings.getQuoteString());

        protected CopyConfigDialog(Shell shell, String dialogId)
                break;
 * distributed under the License is distributed on an "AS IS" BASIS,
            formatSelector.select(copySettings.getFormat());
    public static final Log log = Log.getLog(ResultSetHandlerCopySpecial.class);
            }
            if (settings.get(PARAM_COPY_HEADER) != null) {
            ));
        private Combo quoteStringCombo;
            copySettings.setRowDelimiter("\n");
            copySettings.setCopyHeader(copyHeaderCheck.getSelection());
import org.eclipse.ui.commands.IElementUpdater;
            );
            Composite placeholder = UIUtils.createPlaceholder(group, 2);
                UIMessages.dialog_policy_data_copy_msg,
import org.eclipse.core.commands.ExecutionEvent;

                    copySettingsLast = new AdvancedCopyConfigDialog(HandlerUtil.getActiveShell(event)).copySettings;
                copySettings.setQuoteCells(settings.getBoolean(PARAM_QUOTE_CELLS));

        return null;
        protected Composite createDialogArea(Composite parent) {

            settings = UIUtils.getDialogSettings(dialogId);
        protected void createControlsBefore(Composite group) {
package org.jkiss.dbeaver.ui.controls.resultset.handler;
import org.jkiss.dbeaver.Log;

        private Button copyRowsCheck;
import org.eclipse.swt.layout.GridData;
            rowDelimCombo = UIWidgets.createDelimiterCombo(group, ResultSetMessages.copy_special_row_delimiter, new String[] {"\n", "|", "^", ","}, copySettings.getRowDelimiter(), false);
            }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            ResultSetUtils.copyToClipboard(resultSet.getActivePresentation().copySelection(configDialog.copySettings));
        @Override
        private Combo rowDelimCombo;
        protected void okPressed() {
        static final String PARAM_COPY_HEADER = "copyHeader";
            if (settings.get(PARAM_COL_DELIMITER) != null) {
import org.eclipse.swt.layout.GridLayout;
            }
            if (settings.get(PARAM_COPY_ROWS) != null) {
            if (settings.get(PARAM_FORMAT) != null) {
        static final String PARAM_ROW_DELIMITER = "rowDelimiter";
            }

        protected void createControlsBefore(Composite group) {
                copySettings.setCopyRowNumbers(settings.getBoolean(PARAM_COPY_ROWS));
            if (settings.get(PARAM_ROW_DELIMITER) != null) {
    @Override
            settings.put(PARAM_COPY_HEADER, copySettings.isCopyHeader());
        static final String PARAM_COPY_ROWS = "copyRows";
import org.jkiss.dbeaver.ui.UIUtils;

public class ResultSetHandlerCopySpecial extends ResultSetHandlerMain implements IElementUpdater {
 *
            super(shell, "AdvanceCopySettings");
            copySettingsLast = configDialog.copySettings;
                if (copySettingsLast == null) {
        AdvancedCopyConfigDialog configDialog = new AdvancedCopyConfigDialog(shell);
            case CMD_COPY_SPECIAL:
        protected void configureShell(Shell newShell) {
    }
        }
            settings.put(PARAM_COL_DELIMITER, copySettings.getColumnDelimiter());
            copySettings.setQuoteCells(true);
            copyHtmlCheck = UIUtils.createCheckbox(group, ResultSetMessages.copy_special_copy_as_html_text, ResultSetMessages.copy_special_copy_as_html_tip, copySettings.isCopyHTML(), 2);
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
            copySettings.setColumnDelimiter(CommonUtils.unescapeDisplayString(colDelimCombo.getText()));
            formatSelector = new ValueFormatSelector(group);
        }
/**
        }
                copySettings.setForceQuotes(settings.getBoolean(PARAM_FORCE_QUOTES));



            Composite group = super.createDialogArea(parent);
            copySettings.setColumnDelimiter("\t");
            return group;
            copySettings.setCopyRowNumbers(false);
import org.eclipse.swt.widgets.Combo;
        protected ResultSetCopySettings copySettings;


import org.eclipse.ui.menus.UIElement;
            super(shell, ResultSetMessages.copy_special_options, null);
                SWT.ICON_WARNING
        {

                showAdvancedCopyDialog(resultSet, HandlerUtil.getActiveShell(event));
import org.jkiss.dbeaver.ui.IActionConstants;
    {
        if (resultSet == null) {

    }
 */
import org.jkiss.utils.CommonUtils;

                UIMessages.dialog_policy_data_copy_title,
        if (configDialog.open() == IDialogConstants.OK_ID) {
                break;
import org.eclipse.core.commands.ExecutionException;

        }
            settings.put(PARAM_COPY_ROWS, copySettings.isCopyRowNumbers());
        protected void okPressed() {
        protected final IDialogSettings settings;
        protected AdvancedCopyConfigDialog(Shell shell)
            copySettings.setCopyHeader(true);
import org.eclipse.ui.PlatformUI;
 * Copy special handler
        }
            copySettings.setForceQuotes(forceQuoteCheck.getSelection());
            if (settings.get(PARAM_QUOTE_CELLS) != null) {
import org.jkiss.dbeaver.ui.controls.ValueFormatSelector;
        private Button quoteCellsCheck;
        }
}

    @Override
    public void showAdvancedCopyDialog(IResultSetController resultSet, Shell shell) {


                break;
    }
import org.eclipse.swt.widgets.Composite;
            copySettings.setQuoteString(CommonUtils.unescapeDisplayString(quoteStringCombo.getText()));
                copySettings.setColumnDelimiter(settings.get(PARAM_COL_DELIMITER));

        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(ApplicationPolicyProvider.POLICY_DATA_COPY)) {
            }

                copySettings.setFormat(DBDDisplayFormat.valueOf(settings.get(PARAM_FORMAT)));
        static final String PARAM_COL_DELIMITER = "delimiter";
    public Object execute(ExecutionEvent event) throws ExecutionException {
                copySettings.setRowDelimiter(settings.get(PARAM_ROW_DELIMITER));
            copySettings = new ResultSetCopySettings();
    private static class AdvancedCopyConfigDialog extends CopyConfigDialog {
            settings.put(PARAM_QUOTE_CELLS, copySettings.isQuoteCells());
 * limitations under the License.
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
            super.okPressed();
        static final String PARAM_COPY_HTML = "copyHTML";
            if (settings.get(PARAM_FORCE_QUOTES) != null) {
            copySettings.setFormat(formatSelector.getSelection());
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.internal.UIMessages;
            UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
        IResultSetController resultSet = getActiveResultSet(HandlerUtil.getActivePart(event));
            createControlsAfter(group);
            }
        private Button copyHtmlCheck;
 *     http://www.apache.org/licenses/LICENSE-2.0
            createControlsBefore(group);
        {
 */
        protected void createControlsAfter(Composite group) {
    private static ResultSetCopySettings copySettingsLast = null;
        @Override
            copySettings.setCopyRowNumbers(copyRowsCheck.getSelection());
            copySettings.setQuoteCells(quoteCellsCheck.getSelection());
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
            copySettings.setCopyHTML(copyHtmlCheck.getSelection());
        }
            quoteStringCombo = UIWidgets.createDelimiterCombo(group, ResultSetMessages.copy_special_quote_character, new String[] {"\"", "'"}, copySettings.getQuoteString(), false);

            settings.put(PARAM_ROW_DELIMITER, copySettings.getRowDelimiter());
        static final String PARAM_QUOTE_STRING = "quoteString";
            super.configureShell(newShell);
import org.jkiss.dbeaver.ui.ActionUtils;
            copySettings.setFormat(DBDDisplayFormat.UI);

        static final String PARAM_FORCE_QUOTES = "forceQuotes";
            case CMD_COPY_SPECIAL_LAST:
    public void updateElement(UIElement element, Map parameters)
        @Override

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetCopySettings;
            super.okPressed();
            return null;
        @Override
    public static final String CMD_COPY_SPECIAL_LAST = IActionConstants.CMD_COPY_SPECIAL_LAST;
    }
                }
                log.warn(String.format("Unexpected command id: %s",  event.getCommand().getId()));
import java.util.Map;



            UIUtils.createLabel(placeholder, NLS.bind(ResultSetMessages.copy_special_hint_for_hotkey,
        private ValueFormatSelector formatSelector;
            copySettings.setQuoteString("\"");
        static final String PARAM_QUOTE_CELLS = "quoteCells";

        }

            default:
        static final String PARAM_FORMAT = "format";
