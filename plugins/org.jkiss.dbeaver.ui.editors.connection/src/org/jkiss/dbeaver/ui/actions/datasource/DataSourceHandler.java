                    @Override
                    //DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_CONNECTED);
        for (final DBCExecutionContext context : contexts) {

                return;

        }
 *
                    }

                // Schedule in UI because connect may be initiated during application startup
        if (!checkAndCloseActiveTransaction(dataSourceContainer, false)) {
                    public long getDelay() {
            } catch (Throwable e) {
import org.jkiss.code.Nullable;
            }


                        lastResult = connectJobs[0].getResult();
    public static boolean checkAndCloseActiveTransaction(DBCExecutionContext[] contexts, boolean isReconnect) {
                "driver", dataSourceContainer.getDriver().getPreconfiguredId(),
            if (!DataSourceHandlerUtils.resolveSharedCredentials(dataSource, onFinish)) {
                name);
    }
        disconnectDataSource(dataSourceContainer, () ->
                }
    }
        return checkAndCloseActiveTransaction(container, isReconnect, false);
                    setUser(false);
                // Already connecting/disconnecting - just return
                DBeaverIcons.getImage(UIIcon.TXN_ROLLBACK),
            // First rollback active transaction
            for (DBSInstance instance : dataSource.getAvailableInstances()) {
    public static void closeActiveTransaction(DBRProgressMonitor monitor, DBCExecutionContext context, boolean commitTxn) {
                        DBWorkbench.getPlatformUI().showError(connectJob.getName(), null, result);
    public static boolean checkAndCloseActiveTransaction(DBPDataSourceContainer container, boolean isReconnect, boolean forceRollback) {
        }
                jobChangeAdapter.done(new IJobChangeEvent() {
                    public IStatus getResult() {
            TransactionCloseConfirmer closeConfirmer = new TransactionCloseConfirmer(context.getDataSource().getContainer().getName());
            final DisconnectJob disconnectJob = new DisconnectJob(dataSourceDescriptor);
                    } else {
        UIUtils.syncExec(closeConfirmer);
                null,
                0);
                    } catch (InterruptedException e) {
                }
        }

                    if (onFinish != null) {
                    }
                    public IStatus getJobGroupResult() {
            disconnectJob.schedule();
        return closeConfirmer.result;
            monitor.done();

        @Override
    private static class TransactionCloseConfirmer implements Runnable {
import org.eclipse.swt.widgets.Button;
import org.jkiss.code.NotNull;

                } catch (DBCException e) {
        final String name;
                "Transactions in database '" + dataSource.getName() + "' will be ended because of the long idle period." +
            }
import org.jkiss.dbeaver.model.DBPDataSource;
                "driver", dataSourceContainer.getDriver().getPreconfiguredId(),
                        return null;
        TransactionEndConfirmer closeConfirmer = new TransactionEndConfirmer(contexts[0].getDataSource());
        }
 *
                connectJob.addJobChangeListener(jobChangeAdapter);
                    try {
        }
    private static class TransactionEndConfirmer implements Runnable {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    setSystem(true);
            if (txnManager != null) {
    public static boolean confirmTransactionsClose(DBCExecutionContext[] contexts) {
        public TransactionEndConfirmDialog(DBPDataSource dataSource) {
    }
    }
            if (user instanceof ISaveablePart) {
            };
import org.eclipse.jface.dialogs.IDialogConstants;
                    }
            result = dialog.open() == IDialogConstants.OK_ID;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
        }

import org.eclipse.swt.widgets.Composite;

                        return Status.OK_STATUS;
            Display.getCurrent().beep();
        private TransactionEndConfirmer(DBPDataSource dataSource) {
 * See the License for the specific language governing permissions and
        // Save users
            Job[] connectJobs = Job.getJobManager().find(dataSource);
        private EndTransactionTask(DBCSession session, boolean commit) {
        @Nullable final DBRProgressListener onFinish
            return true;
                    @Override
                IStatus lastResult = null;

                        connectJobs[0].join(0, monitor.getNestedMonitor());
            };
    public static void disconnectDataSource(DBPDataSourceContainer dataSourceContainer, @Nullable final Runnable onFinish) {
            session.enableLogging(false);

        if (contexts.length == 0) {
                    return ISaveablePart2.CANCEL;
        @Override
                public void done(IJobChangeEvent event) {
                {
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
        }
                    @Override
                                return false;
    }
        }
            return false;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        txnManager.commit(session);
                    if (!forceRollback && commitTxn == null) {
                return;
import org.jkiss.dbeaver.ui.*;
                if (onFinish != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (isContextTransactionAffected(context)) {
import org.jkiss.dbeaver.model.exec.*;
        private final DBCSession session;
            UIJob countdownJob = new UIJob("Confirmation countdown") {
        @Override
import org.jkiss.dbeaver.model.DBUtils;
                // to be sure run in UI async
import org.jkiss.dbeaver.model.DBPDataSourceTask;
        @Nullable DBRProgressMonitor monitor,

import java.util.Map;
                return;

        return true;
                    IStatus result = disconnectJob.getConnectStatus();
                    Shell shell = getShell();
            setButtons(okButton, cancelButton);
            });
    }
                }
    }
                        UIUtils.syncExec(closeConfirmer);
        return true;
            if (monitor != null) {
                    }
                public void done(IJobChangeEvent event) {
                }
import org.jkiss.dbeaver.Log;
import org.eclipse.core.runtime.jobs.Job;
    }
import org.eclipse.core.runtime.IStatus;
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }

                "origin", dataSourceContainer.getOrigin().getFullType()

                }
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
    }
            DBPDataSource dataSource = container.getDataSource();
            disconnectJob.addJobChangeListener(new JobChangeAdapter() {
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
        }
    {
    }
                            }
    }
import org.eclipse.swt.widgets.Shell;
}
            if (dataSource == null) {
                        switch (closeConfirmer.result) {
    static class TransactionEndConfirmDialog extends MessageDialog {
                        okButton.setText(IDialogConstants.OK_LABEL + " (" + countdown + ")");
import org.jkiss.utils.ArrayUtils;
                    }
import org.jkiss.dbeaver.runtime.jobs.ConnectJob;
            super(UIUtils.getActiveShell(),
        }
                    countdown--;
import org.jkiss.dbeaver.ui.editors.entity.handlers.SaveChangesHandler;
                public IStatus runInUIThread(IProgressMonitor monitor) {
        final boolean isReconnect;
 * you may not use this file except in compliance with the License.
        boolean result;
        private int countdown = 10;
                    }
        }
 *
import org.eclipse.ui.progress.UIJob;
            ));
            switch (closeConfirmer.result) {
                    if (commit) {

        public int open() {
                    }
                        log.debug(e);
                "origin", dataSourceContainer.getOrigin().getFullType()
                    }
                MessageDialog.WARNING,
                }
            final ConnectJob connectJob = new ConnectJob(dataSource);
            }
        }


            monitor.subTask("End active transaction");
                    }

                @Override
                    if (shell == null || shell.isDisposed()) {

     * @param monitor             progress monitor or null. If nul then new job will be started
                    return false;



            if (!ArrayUtils.isEmpty(Job.getJobManager().find(dataSourceDescriptor))) {
        }
            this.commit = commit;
                default:

            TransactionEndConfirmDialog dialog = new TransactionEndConfirmDialog(dataSource);
                    if (okButton != null) {
                UIUtils.asyncExec(connectJob::schedule);
                return true;
            } else {
                        return connectJob.getConnectStatus();
        public void run() {
            }
        Boolean commitTxn = null;
        final DBPDataSource dataSource;
import org.eclipse.core.runtime.Status;
                }
        }
                        // Ask for confirmation

            if (!ArrayUtils.isEmpty(connectJobs)) {
                    Button okButton = getButton(IDialogConstants.OK_ID);
            countdownJob.schedule(100);
                        schedule(1000);
        }
            return super.open();
    private static class EndTransactionTask implements DBRRunnableWithProgress {
        try (DBCSession session = context.openSession(monitor, DBCExecutionPurpose.UTIL, "End active transaction")) {
            }
                this.isReconnect ? ConnectionPreferences.CONFIRM_TXN_RECONNECT : ConnectionPreferences.CONFIRM_TXN_DISCONNECT,
     * @param onFinish            finish handler
            return;
            // Ask for confirmation
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.actions.DataSourceHandlerUtils;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.jkiss.dbeaver.model.qm.QMUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
                connectJob.runSync(monitor);
            // Ask for additional credentials if needed
     * Connects datasource
import org.eclipse.swt.widgets.Display;
            DBeaverUI.syncExec(closeConfirmer);
        // First rollback active transaction
                    UIUtils.runInProgressService(monitor -> closeActiveTransaction(monitor, context, commit));
                    if (countdown <= 0) {
/*
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
        private final boolean commit;

                    IStatus result = connectJob.getConnectStatus();
                if (!SaveChangesHandler.validateAndSave(new VoidProgressMonitor(), (ISaveablePart) user)) {
                        lastResult = dataSourceContainer.isConnected() ? Status.OK_STATUS : Status.CANCEL_STATUS;
            }


                    final boolean commit = !forceRollback && commitTxn;
            final JobChangeAdapter jobChangeAdapter = new JobChangeAdapter() {
            EndTransactionTask task = new EndTransactionTask(session, commitTxn);
        @NotNull DBPDataSourceContainer dataSourceContainer,
                    throw new InvocationTargetException(e);
                    } else if (!result.isOK()) {
/*
                @Override

            RuntimeUtils.runTask(task, "Close active transactions", END_TRANSACTION_WAIT_TIME);
        for (DBPDataSourceTask user : dataSourceContainer.getTasks()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            try {
                            isReconnect
                    if (onFinish != null) {

            log.debug(e);
        @Override
                    return Status.OK_STATUS;
            Button cancelButton = createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);

import org.jkiss.dbeaver.model.struct.DBSInstance;
            this.name = name;
 */

        }
 * limitations under the License.
                    return ISaveablePart2.YES;
                if (QMUtils.isTransactionActive(context)) {
        if (contexts == null) {
                            default -> {
                if (monitor != null && connectJobs.length == 1) {
                });

            }
import org.eclipse.jface.dialogs.MessageDialog;
    public static final int END_TRANSACTION_WAIT_TIME = 3000;
    public static int checkActiveTransaction(DBCExecutionContext context)
 * Unless required by applicable law or agreed to in writing, software
            ConnectionFeatures.CONNECTION_CLOSE.use(Map.of(
            }
     *
                    "\nPress '" + IDialogConstants.CANCEL_LABEL + "' to prevent this.",
import org.eclipse.core.runtime.IProgressMonitor;
    public static boolean checkAndCloseActiveTransaction(DBPDataSourceContainer container, boolean isReconnect) {
                if (!checkAndCloseActiveTransaction(instance.getAllContexts(), isReconnect, forceRollback)) {
                    return ISaveablePart2.NO;
                        DBWorkbench.getPlatformUI().showError(disconnectJob.getName(), null, result);
            Button okButton = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
            ConnectionFeatures.CONNECTION_OPEN.use(Map.of(

        protected void createButtonsForButtonBar(Composite parent) {
                    }

        }
                null,
                            case IDialogConstants.YES_ID -> commitTxn = true;
        }
                    onFinish.onTaskFinished(lastResult);
*/
                        UIUtils.asyncExec(() -> close());
                        return connectJob;
                    } else if (result != null && !result.isOK()) {
        try {
            this.session = session;
    }
                        );
                    }
                    if (lastResult == null) {
 * DBeaver - Universal Database Manager
        private TransactionCloseConfirmer(String name, boolean isReconnect) {
                case IDialogConstants.NO_ID:
                // Already connecting/disconnecting - just return


import org.jkiss.dbeaver.runtime.jobs.DisconnectJob;
                "End transaction",
                }
            ));
        public void run() {
import org.jkiss.dbeaver.utils.RuntimeUtils;
                }
        int result = IDialogConstants.NO_ID;
        } catch (Throwable e) {
                // and UI is still not initiated. In this case no progress dialog will appear
        if (dataSourceContainer instanceof final DataSourceDescriptor dataSource && !dataSourceContainer.isConnected()) {
            this.isReconnect = isReconnect;

    public static void reconnectDataSource(final DBRProgressMonitor monitor, final DBPDataSourceContainer dataSourceContainer) {

                }
            connectToDataSource(monitor, dataSourceContainer, null));
                            case IDialogConstants.NO_ID -> commitTxn = false;
                log.warn("Can't rollback active transaction before disconnect", e);
                    }

import org.eclipse.ui.ISaveablePart;
                        return 0;
package org.jkiss.dbeaver.ui.actions.datasource;
    ) {
                    } else {
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
    public static void connectToDataSource(
        }
        if (dataSourceContainer instanceof final DataSourceDescriptor dataSourceDescriptor && dataSourceContainer.isConnected()) {

            this.dataSource = dataSource;
public class DataSourceHandler {
                    return;
        return ISaveablePart2.YES;
                            context.getDataSource().getContainer().getName() + " (" + context.getContextName() + ")",
                        txnManager.rollback(session, null);
    public static boolean checkAndCloseActiveTransaction(DBCExecutionContext[] contexts, boolean isReconnect, boolean forceRollback) {
                @Override
        monitor.beginTask("Close active transaction", 1);
                        onFinish.onTaskFinished(result);

                case IDialogConstants.YES_ID:
                        onFinish.run();
                    }
                    public Job getJob() {
                        }
                try {
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        return checkAndCloseActiveTransaction(contexts, isReconnect, false);
    }
            result = ConfirmationDialog.confirmAction(
                ConfirmationDialog.QUESTION_WITH_CANCEL,
            }
                        TransactionCloseConfirmer closeConfirmer = new TransactionCloseConfirmer(
            // Disable logging to avoid commit mode recovery and other UI callbacks
    private static final Log log = Log.getLog(DataSourceHandler.class);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @param dataSourceContainer container to connect
        } finally {
