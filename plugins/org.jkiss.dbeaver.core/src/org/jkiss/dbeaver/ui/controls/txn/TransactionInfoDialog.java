                if (!showAll && !CommonUtils.equalObjects(exec.getStatement().getConnection(), currentSession)) {
public abstract class TransactionInfoDialog extends AbstractPopupPanel {
    protected abstract DBCExecutionContext getCurrentContext();
 *
import org.eclipse.swt.events.SelectionEvent;
        return event -> {
                    return false;
 *

    protected QMEventFilter createContextFilter(DBCExecutionContext executionContext) {
            @Override
        showPreviousCheck = UIUtils.createCheckbox(
import org.eclipse.swt.layout.GridData;
                    return false;
        final QMMConnectionInfo currentSession = QMUtils.getCurrentConnection(executionContext);
            public void widgetSelected(SelectionEvent e) {
        super(parentShell, title);
        DBCExecutionContext context = getCurrentContext();
                if (!showPrevious && !CommonUtils.equalObjects(exec.getSavepoint(), currentSP)) {
            CoreMessages.transaction_info_dialog_checkbox_show_all_queries,
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.qm.QMUtils;
    private final IWorkbenchPart activeEditor;
import org.jkiss.code.NotNull;
        }
    protected Button showAllCheck;
    protected void createTransactionLogPanel(@NotNull Composite composite) {

        logViewer.refresh();
    @Override
import org.jkiss.dbeaver.ui.controls.querylog.QueryLogViewer;
import org.jkiss.dbeaver.model.qm.meta.QMMObject;
            public void widgetSelected(SelectionEvent e) {
        this.activeEditor = activeEditor;
        }
            1
        final boolean showAll = showAllCheck != null && showAllCheck.getSelection();
                DBCExecutionPurpose purpose = exec.getStatement().getPurpose();
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, true);
            false,
    protected Button showPreviousCheck;
            composite,
                return (showAll || exec.isTransactional());
    TransactionInfoDialog(@NotNull Shell parentShell, @NotNull String title, @NotNull IWorkbenchPart activeEditor) {
        logViewer.setFilter(filter);
            ((GridData) gd).heightHint = logViewer.getControl().getHeaderHeight() + logViewer.getControl().getItemHeight() * 5;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (gd instanceof GridData) {
            CoreMessages.transaction_info_dialog_checkbox_show_previous_transactions,
            @Override
            CoreMessages.transaction_info_dialog_label_otherwise,
            }
        final boolean showPrevious = showPreviousCheck != null && showPreviousCheck.getSelection();
 * you may not use this file except in compliance with the License.
    protected QueryLogViewer logViewer;
    }
import org.jkiss.dbeaver.model.qm.meta.QMMStatementExecuteInfo;
 * You may obtain a copy of the License at

        showPreviousCheck.addSelectionListener(new SelectionAdapter() {

        QMEventFilter filter = context == null ? VOID_FILTER : createContextFilter(context);
            1
import org.jkiss.dbeaver.model.qm.meta.QMMTransactionSavepointInfo;
package org.jkiss.dbeaver.ui.controls.txn;

import org.eclipse.swt.widgets.Composite;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                updateTransactionFilter();
                }

        };
    protected void updateTransactionFilter() {

 * limitations under the License.
import org.eclipse.ui.IWorkbenchPart;
 * See the License for the specific language governing permissions and
                updateTransactionFilter();
            QMMObject object = event.getObject();
    }
            return false;
        );

import org.jkiss.dbeaver.core.CoreMessages;
            CoreMessages.transaction_info_dialog_label_show_all_transaction_queries,
            false,
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

        logViewer.setUseDefaultFilter(false);
        final Object gd = logViewer.getControl().getLayoutData();
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
    protected void createButtonsForButtonBar(Composite parent) {
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.dialogs.IDialogConstants;
        showAllCheck.addSelectionListener(new SelectionAdapter() {

import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (executionContext == null) {

        closeOnFocusLost(logViewer.getSearchText(), logViewer.getControl(), showAllCheck, showPreviousCheck);
            return VOID_FILTER;
import org.eclipse.swt.widgets.Button;
 */
            if (object instanceof QMMStatementExecuteInfo exec) {
        final QMMTransactionSavepointInfo currentSP = QMUtils.getCurrentTransaction(executionContext);

}
        DBCExecutionContext context = getCurrentContext();
 *

        });

import org.jkiss.dbeaver.model.qm.QMEventFilter;
    }
                }
                }
        );
            }
            composite,
        showAllCheck = UIUtils.createCheckbox(
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    }
import org.eclipse.swt.events.SelectionAdapter;
        });
                    return false;
        logViewer = new QueryLogViewer(composite, activeEditor.getSite(), filter, false, true);
import org.jkiss.dbeaver.model.qm.meta.QMMConnectionInfo;
import org.jkiss.dbeaver.ui.UIUtils;

 * Unless required by applicable law or agreed to in writing, software
                if (purpose == DBCExecutionPurpose.META || purpose == DBCExecutionPurpose.UTIL) {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;

    private static final QMEventFilter VOID_FILTER = event -> false;

        QMEventFilter filter = context == null ? VOID_FILTER : createContextFilter(context);
