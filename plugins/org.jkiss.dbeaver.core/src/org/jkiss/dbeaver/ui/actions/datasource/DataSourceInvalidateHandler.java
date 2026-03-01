                    } else {
                                container,
import org.eclipse.jface.dialogs.IDialogConstants;
public class DataSourceInvalidateHandler extends AbstractDataSourceHandler
                            invalidateDataSource(dataSource);
                        // no invalidation happened
                super.buttonPressed(IDialogConstants.OK_ID);
                        if (result.isError()) {
            ConnectionRecoverDialog dialog = new ConnectionRecoverDialog(shell, title, message == null ? title : message, error);
import org.eclipse.swt.widgets.Shell;
                    }
                if (dsContainer != null) {
                        }

import org.jkiss.code.NotNull;
            invalidateDataSource(context.getDataSource());
        }
                    for (InvalidateJob.ContextInvalidateResult result : invalidateJob.getInvalidateResults()) {

 * Unless required by applicable law or agreed to in writing, software

                invalidateDataSource(dataSource);
                            ConnectionLostDialog clDialog = new ConnectionLostDialog(
            //final DataSourceDescriptor dataSourceDescriptor = (DataSourceDescriptor) context;
                        final Integer result = UITask.run(() -> {
        }
                                dialogError,
/*
//                            error);
        private final DBPDataSource dataSource;
                }
                            connectedNum++;
 *     http://www.apache.org/licenses/LICENSE-2.0
        protected void createButtonsForButtonBar(@NotNull Composite parent)
            DBPDataSource dataSource = error instanceof DBDatabaseException dbe ? dbe.getDataSource() : null;
        Runnable runnable = () -> {

    {
 *
import org.eclipse.ui.handlers.HandlerUtil;
                GeneralUtils.makeExceptionStatus(error),
    public Object execute(ExecutionEvent event) throws ExecutionException
        {
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
 * You may obtain a copy of the License at
                        if (!DataSourceHandler.checkAndCloseActiveTransaction(container, true)) {
                @Override
                            return clDialog.open();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            createDetailsButton(parent);
                    }
            });
                        message.insert(0, "Connections reopened: " + connectedNum + " (of " + totalNum + ")");

    {
        {
            IEditorPart editor = HandlerUtil.getActiveEditor(event);
    }
    private static class ConnectionRecoverDialog extends StandardErrorDialog {
 * limitations under the License.

{
                return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
            });
                throw new IllegalStateException("No data source in error");
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.UITask;
 * DBeaver - Universal Database Manager
                    if (error != null) {
                    int totalNum = 0;
                        log.debug(message);
            // Display the dialog
            invalidateJob.schedule();
                            return false;
import java.util.Set;
                shell == null ? UIUtils.getActiveWorkbenchShell() : shell,
                // Already connecting/disconnecting or cancelled - just return
                    for (DBPDataSourceContainer container : containersToInvalidate) {
 *
                    }
import org.jkiss.dbeaver.runtime.jobs.DefaultInvalidationFeedbackHandler;
            if (dataSource == null) {
                            error = result.getException();
        }
            if (id == IDialogConstants.RETRY_ID) {
                public void done(IJobChangeEvent event) {
        }
            invalidateJob.setFeedbackHandler(new DefaultInvalidationFeedbackHandler() {
    }
        @Override
// TODO: invalidate ALL contexts
                        message.insert(0, "All connections (" + totalNum + ") are alive!");
            super(
                    if (totalNum == 0) {

    public static void showConnectionLostDialog(final Shell shell, final String message, final DBException error)
package org.jkiss.dbeaver.ui.actions.datasource;
            }
import org.eclipse.core.runtime.jobs.Job;
            final InvalidateJob invalidateJob = new InvalidateJob(dataSource);
                @Override
                            );

                            // Disconnect - to notify UI and reflect model changes
            dataSource = error instanceof DBDatabaseException dbe ? dbe.getDataSource() : null;
                        } else {
                        });
        return null;
                    if (connectedNum > 0) {
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        @Override
                }
                }
//                            "Error while connecting to the datasource",// + "\nTime spent: " + RuntimeUtils.formatExecutionTime(invalidateJob.getTimeSpent()),
    }


                title,
                    } else if (message.isEmpty()) {
import org.jkiss.dbeaver.runtime.jobs.DisconnectJob;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.dbeaver.ui.dialogs.ConnectionLostDialog;
import org.jkiss.dbeaver.ui.dialogs.StandardErrorDialog;
                        }
        {
                    return true;
import org.jkiss.utils.ArrayUtils;
//                        UIUtils.showErrorDialog(
 * See the License for the specific language governing permissions and
                    }
                // Try to set the same container.
                        } else if (result == IDialogConstants.RETRY_ID) {
                            new DisconnectJob(container).schedule();
        } else {
                // It should trigger connection instantiation if for some reason it was lost (SQLEditor specific?)
            String title = "Connection with [" + dataSource.getContainer().getName() + "] lost";
        protected void buttonPressed(int id)
            createButton(parent, IDialogConstants.RETRY_ID, "&Reconnect", true);
}                        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (!ArrayUtils.isEmpty(Job.getJobManager().find(container))) {
        UIUtils.syncExec(runnable);
//                            "Invalidate data source [" + context.getDataSource().getContainer().getName() + "]",
                        totalNum++;
            dialog.open();
                    StringBuilder message = new StringBuilder();
            if (editor instanceof IDataSourceContainerUpdate) {
import org.jkiss.dbeaver.ui.IDataSourceContainerUpdate;
                        final Throwable dialogError = error;
 */
                    int connectedNum = 0;
        ConnectionRecoverDialog(Shell shell, String title, String message, DBException error)
        };
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        if (context != null) {
                                "Disconnect"
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                IStatus.ERROR);
    @Override
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.utils.GeneralUtils;
                    }
import org.jkiss.dbeaver.runtime.jobs.InvalidateJob;
//                            shell,
                        if (result == null || result == IDialogConstants.STOP_ID) {
            invalidateJob.addJobChangeListener(new JobChangeAdapter() {
        //log.debug(message);
import org.jkiss.dbeaver.model.DBPDataSource;
                DBPDataSourceContainer dsContainer = ((IDataSourceContainerUpdate) editor).getDataSourceContainer();
                    Throwable error = null;
                    ((IDataSourceContainerUpdate) editor).setDataSourceContainer(dsContainer);
 *
                        final DBPDataSourceContainer container = dataSource.getContainer();
                message,
 * you may not use this file except in compliance with the License.
    }
                    ((IDataSourceContainerUpdate) editor).setDataSourceContainer(null);
            DBPDataSourceContainer container = dataSource.getContainer();
        }
            super.buttonPressed(id);
        if (dataSource != null) {
    public static boolean invalidateDataSource(final DBPDataSource dataSource) {
            }
import org.eclipse.swt.widgets.Composite;
            }
                public boolean confirmInvalidate(@NotNull Set<DBPDataSourceContainer> containersToInvalidate) {

                        return;
        return true;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

                                UIUtils.getActiveWorkbenchShell(),

        DBCExecutionContext context = getActiveExecutionContext(event, false);
import org.jkiss.dbeaver.DBException;
