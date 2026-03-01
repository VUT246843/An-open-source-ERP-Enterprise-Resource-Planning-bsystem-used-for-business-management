        private Button ignoreQuotesCheck;
            nullValueMarkCombo.add("NULL");
import org.eclipse.swt.events.SelectionAdapter;
                pasteSettings.isIgnoreQuotes(),
            nullValueMarkCombo = UIUtils.createLabelCombo(
            insertNullsCheck.addSelectionListener(new SelectionAdapter() {
            nullValueMarkCombo.add("");
import org.eclipse.ui.handlers.HandlerUtil;
                public void widgetSelected(SelectionEvent e) {
            dialogSettings.put(PROP_INSERT_MULTIPLE_ROWS, pasteSettings.isInsertMultipleRows());
                ResultSetMessages.dialog_paste_as_ignore_quotes_tip,
}
import org.jkiss.code.NotNull;
                composite,

import org.eclipse.swt.events.SelectionEvent;

 * Copyright (C) 2010-2024 DBeaver Corp and others
            ignoreQuotesCheck = UIUtils.createCheckbox(
            pasteSettings.setIgnoreQuotes(ignoreQuotesCheck.getSelection());
            final Composite composite = super.createDialogArea(parent);
import org.eclipse.swt.SWT;
public class ResultSetHandlerPasteSpecial extends ResultSetHandlerMain {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPasteSettings;
            );
            if (dialogSettings.get(PROP_INSERT_NULLS) != null) {
        private Button insertNullsCheck;
            dialogSettings.put(PROP_INSERT_NULLS, pasteSettings.isInsertNulls());
            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
                pasteSettings.setInsertNulls(dialogSettings.getBoolean(PROP_INSERT_NULLS));
                composite,
    public Object execute(ExecutionEvent event) throws ExecutionException {

            pasteSettings.setInsertNulls(insertNullsCheck.getSelection());
        private static final String PROP_INSERT_NULLS = "insertNulls";
        private Button insertMultipleRowsCheck;
        public AdvancedPasteConfigDialog(@NotNull Shell shell) {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetEditor;
            }
import org.eclipse.core.commands.ExecutionException;
            );
    private static class AdvancedPasteConfigDialog extends BaseDialog {
    @Override
        private static final String PROP_IGNORE_QUOTES = "ignoreQuotes";
        private final IDialogSettings dialogSettings;

                pasteSettings.isInsertNulls(),
                ResultSetMessages.dialog_paste_as_insert_multiple_rows_tip,
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
import org.eclipse.swt.widgets.Combo;
            ((IResultSetEditor) presentation).pasteFromClipboard(configDialog.pasteSettings);
        private static final String PROP_NULL_VALUE_MARK = "nullValueMark";

 *
    }
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 * distributed under the License is distributed on an "AS IS" BASIS,
                1
import org.jkiss.dbeaver.ui.UIUtils;
    }
            this.dialogSettings = UIUtils.getDialogSettings(DIALOG_ID);
        final IResultSetPresentation presentation = resultSet.getActivePresentation();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
                ResultSetMessages.dialog_paste_as_insert_nulls_tip,

 * You may obtain a copy of the License at
 *
import org.eclipse.jface.dialogs.IDialogConstants;
 */

            dialogSettings.put(PROP_IGNORE_QUOTES, pasteSettings.isIgnoreQuotes());
package org.jkiss.dbeaver.ui.controls.resultset.handler;
        if (configDialog.open() == IDialogConstants.OK_ID) {
            );
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.pasteSettings = new ResultSetPasteSettings();
        return null;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
import org.eclipse.swt.widgets.Composite;
/*
        private static final String DIALOG_ID = "AdvancedPasteOptions";
        }
            insertMultipleRowsCheck = UIUtils.createCheckbox(
                SWT.NONE
 *
                }
import org.eclipse.swt.widgets.Button;
            if (dialogSettings.get(PROP_INSERT_MULTIPLE_ROWS) != null) {

 * DBeaver - Universal Database Manager
        final AdvancedPasteConfigDialog configDialog = new AdvancedPasteConfigDialog(HandlerUtil.getActiveShell(event));
        @Override
                1
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                ResultSetMessages.dialog_paste_as_null_value_mark_tip,
            }
        final IResultSetController resultSet = getActiveResultSet(HandlerUtil.getActivePart(event));
            return null;

            }
                composite,
            }
            );
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and

            insertNullsCheck = UIUtils.createCheckbox(
import org.eclipse.swt.widgets.Shell;
                    nullValueMarkCombo.setEnabled(insertNullsCheck.getSelection());
        }
        }
                ResultSetMessages.dialog_paste_as_ignore_quotes_text,
                1


        if (resultSet == null) {
        if (!(presentation instanceof IResultSetEditor)) {
            if (dialogSettings.get(PROP_IGNORE_QUOTES) != null) {

 * limitations under the License.
            nullValueMarkCombo.setText(pasteSettings.getNullValueMark());

        @Override
                @Override
        }
                UIUtils.createPlaceholder(composite, 2),
            setShellStyle(SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
            return composite;

            super.okPressed();
        protected Composite createDialogArea(Composite parent) {
                pasteSettings.setInsertMultipleRows(dialogSettings.getBoolean(PROP_INSERT_MULTIPLE_ROWS));
                pasteSettings.setNullValueMark(dialogSettings.get(PROP_NULL_VALUE_MARK));
        }
        protected void okPressed() {
            pasteSettings.setNullValueMark(nullValueMarkCombo.getText());
        private Combo nullValueMarkCombo;
            if (dialogSettings.get(PROP_NULL_VALUE_MARK) != null) {
                pasteSettings.setIgnoreQuotes(dialogSettings.getBoolean(PROP_IGNORE_QUOTES));
            dialogSettings.put(PROP_NULL_VALUE_MARK, pasteSettings.getNullValueMark());
        private final ResultSetPasteSettings pasteSettings;
                pasteSettings.isInsertMultipleRows(),
        private static final String PROP_INSERT_MULTIPLE_ROWS = "insertMultipleRows";
                ResultSetMessages.dialog_paste_as_null_value_mark_text,
            });
import org.eclipse.core.commands.ExecutionEvent;
                ResultSetMessages.dialog_paste_as_insert_multiple_rows_text,
            nullValueMarkCombo.setEnabled(pasteSettings.isInsertNulls());
            super(shell, ResultSetMessages.dialog_paste_as_title, null);

            pasteSettings.setInsertMultipleRows(insertMultipleRowsCheck.getSelection());
                ResultSetMessages.dialog_paste_as_insert_nulls_text,
