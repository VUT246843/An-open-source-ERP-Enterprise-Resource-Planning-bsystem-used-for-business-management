                public void widgetSelected(SelectionEvent e) {
        TreeColumn colTxn = new TreeColumn(contextTree, SWT.RIGHT);
                    contextItem.setText(0, context.getContextName());
                    QMTransactionState txnState = QMUtils.getTransactionState(context);
        colTxn.setText("Transaction");
            DataSourceCommitHandler.execute(getShell(), selectedContext);
                if (e.item != null && e.item.getData() instanceof DBCExecutionContext) {
import org.jkiss.dbeaver.registry.DataSourceRegistry;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                "No active part.");

        Composite composite = super.createDialogArea(parent);
        }
import org.eclipse.swt.events.SelectionAdapter;
        return selectedContext;
    @Override
                }
                @Override
 * limitations under the License.

            if (!dataSource.isConnected() || dataSource.getDataSource() == null) {
            commitButton.setEnabled(false);
            for (DBSInstance instance : dataSource.getDataSource().getAvailableInstances()) {
            controlPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return parent;
                DBCExecutionContext[] allContexts = instance.getAllContexts();
                logViewer.refresh();
 *
            DBWorkbench.getPlatformUI().showError(
            rollbackButton.addSelectionListener(new SelectionAdapter() {
                    loadContexts(showAllCheck.getSelection());
            DataSourceRollbackHandler.execute(getShell(), selectedContext);
            });
                    selectedContext = (DBCExecutionContext) e.item.getData();
 */
    private DBCExecutionContext selectedContext;
                    contextItem.setText(1, stateString);
 * you may not use this file except in compliance with the License.
    }
                        txnContexts.add(context);

import org.eclipse.jface.dialogs.IDialogSettings;
    private Tree contextTree;
                }
import org.jkiss.dbeaver.ui.DBeaverIcons;
                if (ArrayUtils.isEmpty(allContexts)) {
        GridData gd = new GridData(GridData.FILL_BOTH);
    {
    private Button commitButton;
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceRollbackHandler;

        closeOnFocusLost(contextTree);
        IWorkbenchPart activePart = UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart();
            commitButton = UIUtils.createPushButton(controlPanel, "Commit", DBeaverIcons.getImage(UIIcon.TXN_COMMIT));
                }

                @Override
            });
import java.util.List;

    {
        } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                    continue;

        });
 *

            });
                @Override
        {
                continue;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        contextTree.removeAll();
        commitButton.setEnabled(false);
import org.eclipse.swt.layout.GridData;
            dialog.open();
 * DBeaver - Universal Database Manager
                    "No active part",
    public static void showDialog(Shell shell) {
    @Override
                dsItem.setImage(DBeaverIcons.getImage(dataSource.getDriver().getIcon()));

    private Button rollbackButton;
                    selectedContext = null;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
}
package org.jkiss.dbeaver.ui.controls.txn;
 * You may obtain a copy of the License at

                    TreeItem contextItem = new TreeItem(dsItem, SWT.NONE);


        } else {
                TreeItem dsItem = new TreeItem(contextTree, SWT.NONE);
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            gd.grabExcessHorizontalSpace = true;
            rollbackButton = UIUtils.createPushButton(controlPanel, "Rollback", DBeaverIcons.getImage(UIIcon.TXN_ROLLBACK));
        if (selectedContext == null) {
            return;
        contextTree.addSelectionListener(new SelectionAdapter() {
    private static final String DIALOG_ID = "DBeaver.PendingTransactionsDialog";//$NON-NLS-1$
    private void endTransaction(boolean commit) {
import org.jkiss.dbeaver.model.struct.DBSInstance;
import org.jkiss.dbeaver.ui.UIIcon;




import org.eclipse.ui.IWorkbenchPart;
public class PendingTransactionsDialog extends TransactionInfoDialog {
        }
import org.jkiss.dbeaver.ui.UIUtils;
            gd = new GridData(GridData.FILL_HORIZONTAL);
        if (commit) {

    }
                dsItem.setData(dataSource);
        contextTree = new Tree(composite, SWT.FULL_SELECTION | SWT.BORDER);
        // Load all open context
    protected DBCExecutionContext getCurrentContext() {
/*
        super.createTransactionLogPanel(composite);
        rollbackButton.setEnabled(false);
            dialog.setModeless(true);
import org.eclipse.swt.events.SelectionEvent;
            final PendingTransactionsDialog dialog = new PendingTransactionsDialog(shell, activePart);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    endTransaction(false);
                logViewer.setFilter(createContextFilter(selectedContext));
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceCommitHandler;
        if (activePart == null) {
        super(parentShell, "Pending transactions", activePart);
                    if (showAllContexts || QMUtils.isTransactionActive(context, false)) {
        }
                    contextItem.setData(context);
        colName.setText("Connection");
                List<DBCExecutionContext> txnContexts = new ArrayList<>();
        contextTree.setLayoutData(gd);
        }
                }
                    continue;
        loadContexts(false);
                }
    }
                }
                    endTransaction(true);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 *
        contextTree.setLinesVisible(true);
        UIUtils.asyncExec(() -> UIUtils.packColumns(contextTree));
                dsItem.setExpanded(true);
                if (txnContexts.isEmpty()) {
                for (DBCExecutionContext context : allContexts) {
            rollbackButton.setEnabled(false);
    }
import java.util.ArrayList;
    private void loadContexts(boolean showAllContexts) {
                boolean hasTransaction = selectedContext != null && QMUtils.isTransactionActive(selectedContext, false);
        for (DBPDataSourceContainer dataSource : DataSourceRegistry.getAllDataSources()) {
                }
                for (DBCExecutionContext context : txnContexts) {
                dsItem.setText(dataSource.getName());
import org.jkiss.dbeaver.model.qm.QMUtils;
import org.eclipse.swt.SWT;
            showAllCheck.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent e) {
    protected IDialogSettings getDialogBoundsSettings()
            }
        TreeColumn colName = new TreeColumn(contextTree, SWT.NONE);
            Composite controlPanel = UIUtils.createPlaceholder(composite, 3, 5);
            showAllCheck.setLayoutData(gd);


            public void widgetSelected(SelectionEvent e) {
                }
    protected Composite createDialogArea(Composite parent)
            }
            @Override
        return UIUtils.getDialogSettings(DIALOG_ID);


import org.jkiss.utils.ArrayUtils;
                public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            final Button showAllCheck = UIUtils.createCheckbox(controlPanel, "Show all connections", "Show all datasource connections. Otherwise shows only transactional connections.", false, 1);
    private PendingTransactionsDialog(Shell parentShell, IWorkbenchPart activePart) {
                    }
                rollbackButton.setEnabled(hasTransaction);
                } else {
        contextTree.setHeaderVisible(true);
            commitButton.addSelectionListener(new SelectionAdapter() {
            closeOnFocusLost(showAllCheck, commitButton, rollbackButton);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.qm.QMTransactionState;
        gd.heightHint = contextTree.getHeaderHeight() + contextTree.getItemHeight() * 5;
import org.eclipse.swt.widgets.*;
                    String stateString = txnState.getUpdateCount() + "/" + txnState.getExecuteCount();

    }
                commitButton.setEnabled(hasTransaction);
