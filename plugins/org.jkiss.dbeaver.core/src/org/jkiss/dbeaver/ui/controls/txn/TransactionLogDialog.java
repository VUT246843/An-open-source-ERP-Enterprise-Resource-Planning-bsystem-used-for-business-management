
 */
    public static void showDialog(
import org.eclipse.swt.widgets.Composite;

    public static void showDialog(@NotNull Shell shell, @Nullable DBCExecutionContext executionContext) {
        } else {
        if (activeEditor == null) {

        showPreviousCheck.setSelection(showPreviousTxn);
        } else if (executionContext == null) {
    }

        IEditorPart activeEditor = UIUtils.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
            );
    private TransactionLogDialog(
        return parent;
        @NotNull IWorkbenchPart activeEditor,
        this.showAllQueries = showAllQueries;
    }
    private final boolean showAllQueries;
import org.eclipse.ui.IEditorPart;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    }
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        }
            dialog.setModeless(true);
                CoreMessages.transaction_log_dialog_error_no_editor,
            );
import org.jkiss.dbeaver.core.CoreMessages;

        @NotNull DBCExecutionContext context,
        Composite composite = super.createDialogArea(parent);
        @Nullable DBCExecutionContext executionContext,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final boolean showPreviousTxn;
            ),
    }
        boolean showPreviousTxn,
 *

public class TransactionLogDialog extends TransactionInfoDialog {

    public static void showDialog(@NotNull Shell shell, @Nullable DBCExecutionContext executionContext, boolean showPreviousTxn) {
                CoreMessages.transaction_log_dialog_header_transaction_log,

            DBWorkbench.getPlatformUI().showError(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        this.showPreviousTxn = showPreviousTxn;
    protected Composite createDialogArea(Composite parent) {
            parentShell,
    }
        updateTransactionFilter();
        @NotNull Shell shell,
        boolean showAllQueries
                showPreviousTxn,
    ) {
                executionContext,
    protected IDialogSettings getDialogBoundsSettings() {
        );
        showDialog(shell, executionContext, showPreviousTxn, false);
    private final DBCExecutionContext context;
                CoreMessages.transaction_log_dialog_error_open_database
            final TransactionLogDialog dialog = new TransactionLogDialog(
            dialog.open();
            );
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
import org.eclipse.osgi.util.NLS;
    protected DBCExecutionContext getCurrentContext() {
import org.eclipse.ui.IWorkbenchPart;
        @NotNull Shell parentShell,
 *
    }
        super(
    }
import org.eclipse.swt.widgets.Shell;
        boolean showAllQueries
            activeEditor
 * distributed under the License is distributed on an "AS IS" BASIS,
        return context;
 * limitations under the License.
        showDialog(shell, executionContext, false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        showAllCheck.setSelection(showAllQueries);

                activeEditor,
    private static final String DIALOG_ID = "DBeaver.TransactionLogDialog";//$NON-NLS-1$

            DBWorkbench.getPlatformUI().showError(
        return UIUtils.getDialogSettings(DIALOG_ID);
}
        super.createTransactionLogPanel(composite);
        this.context = context;

 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.code.NotNull;
/*


                shell,
    @Override
                context.getContextName()
 *     http://www.apache.org/licenses/LICENSE-2.0
                CoreMessages.transaction_log_dialog_error_not_connected,
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.jface.dialogs.IDialogSettings;
 * DBeaver - Universal Database Manager
                CoreMessages.transaction_log_dialog_error_connect_to_a_database
            NLS.bind(
package org.jkiss.dbeaver.ui.controls.txn;
                context.getDataSource().getContainer().getName(),
 *
import org.jkiss.code.Nullable;
        boolean showPreviousTxn,
                showAllQueries
    ) {
