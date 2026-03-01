import org.eclipse.ui.menus.UIElement;
                                monitor.done();
import org.jkiss.dbeaver.DBException;
            if (container != null) {
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
            }
                                monitor.subTask("Change context '" + context.getContextName() + "' auto-commit state");
import org.eclipse.osgi.util.NLS;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPTransactionIsolation;
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *
public class DataSourceAutoCommitHandler extends AbstractDataSourceHandler implements IElementUpdater {
    public void updateElement(UIElement element, Map parameters) {
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
            DBPDataSourceContainer container = ((DBPDataSourceContainerProvider) activeEditor).getDataSourceContainer();

            return;
        DBCExecutionContext context = getActiveExecutionContext(event, true);
        if (activeEditor == null) {
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
        } else if (activeEditor instanceof DBPDataSourceContainerProvider) {
import org.eclipse.core.commands.ExecutionEvent;
            return null;
            if (txnManager != null) {
                isolation = container.getActiveTransactionsIsolation();

import org.eclipse.core.runtime.Status;
                        newAutocommit = !txnManager.isAutoCommit();


 * limitations under the License.
                SWT.ICON_WARNING
        ) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                            }
import java.util.Map;
        if (context != null && context.isConnected()) {
                    final DBPDataSourceContainer container = context.getDataSource().getContainer();
import org.eclipse.ui.IEditorPart;
                        @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                            } finally {
                    autoCommit = txnManager.isAutoCommit();
                    boolean newAutocommit = !container.isDefaultAutoCommit();
import org.jkiss.dbeaver.utils.GeneralUtils;
        element.setText(text);
        DBCExecutionContext context = getExecutionContextFromPart(activeEditor);
    public Object execute(ExecutionEvent event) throws ExecutionException {
                try {
                            return Status.OK_STATUS;
    }
                autoCommit = container.isDefaultAutoCommit();
    @Override
/*
import org.jkiss.dbeaver.core.CoreMessages;
}        if (context != null) {
                CoreMessages.action_menu_transaction_commit_mode_edit_restricted_dialog_description,
import org.eclipse.ui.IWorkbenchWindow;
                        @NotNull
        // Update command image
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        String isolationName = isolation == null ? "?" : isolation.getTitle();
import org.eclipse.ui.commands.IElementUpdater;
        }
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ui.UIIcon;
                    boolean autoCommit = newAutocommit;
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
        }
                        // Get flag from connection
import org.jkiss.dbeaver.ui.UIUtils;
            );
                } catch (DBException e) {
        DBPTransactionIsolation isolation = null;
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        boolean autoCommit = true;
                } catch (DBCException e) {
            if (txnManager != null) {
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
                            } catch (Exception e) {
                            try {
                    }.schedule();
            return;
                }
 * See the License for the specific language governing permissions and
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
                    isolation = txnManager.getTransactionIsolation();
import org.jkiss.dbeaver.model.exec.DBCException;
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
package org.jkiss.dbeaver.ui.actions.datasource;
                CoreMessages.action_menu_transaction_commit_mode_edit_restricted_dialog_title,
                null,
import org.jkiss.dbeaver.model.rm.RMConstants;
                    if (context.isConnected()) {
        }
        String text = autoCommit ? NLS.bind(CoreMessages.action_menu_transaction_manualcommit_name, isolationName) : CoreMessages.action_menu_transaction_autocommit_name;
import org.eclipse.core.runtime.IStatus;
import org.jkiss.code.NotNull;
                            monitor.beginTask("Change connection auto-commit to " + autoCommit, 1);
 * Licensed under the Apache License, Version 2.0 (the "License");
        element.setTooltip(text);
            !workspace.hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)
    @Override

 *
 *
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
        return null;
                                txnManager.setAutoCommit(monitor, autoCommit);
                    new AbstractJob("Set auto-commit") {
import org.eclipse.core.commands.ExecutionException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        element.setChecked(autoCommit);
            }
import org.jkiss.dbeaver.model.app.DBPWorkspace;
 */
        element.setIcon(DBeaverIcons.getImageDescriptor(autoCommit ? UIIcon.TXN_COMMIT_AUTO : UIIcon.TXN_COMMIT_MANUAL));
import org.eclipse.swt.SWT;
            UIUtils.showMessageBox(
                    // Change auto-commit mode
                    DBWorkbench.getPlatformUI().showError("Auto-Commit", "Error while toggle auto-commit", e);
                                return GeneralUtils.makeExceptionStatus(e);
                    }
 * DBeaver - Universal Database Manager
                        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        }
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            }
                try {
        if (!workspace.hasRealmPermission(RMConstants.PERMISSION_PROJECT_ADMIN) &&
                    log.warn(e);
