import org.jkiss.dbeaver.ui.views.process.ProcessPropertyTester;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

            return 800; // see org.eclipse.ui.internal.progress.ProgressManager.getLongOperationTime()
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.model.*;
                    processView.initProcess(processDescriptor);
                            extraCheckboxes.add(chk);
                            ShellProcessView.getNextId(),
        } catch (Exception ex) { // when workbench is not initialized yet during startup
                            ShellProcessView.VIEW_ID,
        final Reply confirm = new Reply(buttonLabel);
            }
                            }
import org.jkiss.dbeaver.runtime.ui.console.ConsoleUserInterface;
        }.execute();
    }
            @Override
import org.eclipse.swt.dnd.Clipboard;
    @Override
            Display display = UIUtils.getDisplay();
            return super.confirmAction(title, message, isWarning);
    public UserResponse showError(@NotNull String title, @Nullable String message) {
                return Status.OK_STATUS;
    }
            @Override
            } else {
            return super.confirmAction(title, message);
            }
    ) {
    @Override
    }

                    UIExecutionQueue.unblockQueue();
        @Nullable String userName,
public class DesktopUI extends ConsoleUserInterface {
            }
                final EnterNameDialog dialog = new EnterNameDialog(shell, prompt, defValue);
        }.execute();
        @Nullable String prompt,
        return DBWorkbench.getPlatform().getApplication().isHeadlessMode();
                Shell[] shells = display.getShells();
        if (isHeadlessMode()) {

        IStatus rootStatus = status;

            userName,
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.access.DBAPasswordChangeInfo;
            return false;
import org.jkiss.dbeaver.Log;
        // Direct execute
            return;
        });
                UIUtils.getActiveWorkbenchShell(),
                CommonUtils.notNull(title, "Error"),
        UIUtils.syncExec(() -> {
                }
    private static long getLongOperationTime() {
        if (isHeadlessMode()) {
 * you may not use this file except in compliance with the License.
                }
    }
                s = rootStatus = s.getChildren()[0];
        );
            title,

        DBPErrorAssistant.ErrorType errorType = dataSource == null ? DBPErrorAssistant.ErrorType.NORMAL : DBExecUtils.discoverErrorType(dataSource, error);
    }
    public boolean confirmAction(String title, String message, boolean isWarning) {
        } else {
        String defaultValue
    public void copyTextToClipboard(@NotNull String text, boolean htmlFormat) {
        }
                            if (extraCheckboxes.get(chkIndex).getSelection()) {

        if (contextListener != null) {
        UIUtils.syncExec(() -> {
            @Override
        return UIUtils.runWithDialog(runnable);
                .setMessage(message)
import org.jkiss.dbeaver.ui.*;
            }
        @NotNull String userNameLabel,
        switch (errorType) {
    @Override

                            monitor.done();
                } finally {
            return super.showError(title, message, status);
import java.util.ArrayList;
                    // Error during datasource init
                .setMessage(message)
        UIUtils.asyncExec(() -> ShellUtils.launchProgram(shellCommand));
                }
                                shortWaitResult.complete(!job.join(getLongOperationTime(), new NullProgressMonitor()));

    }
            StandardErrorDialog dialog = new StandardErrorDialog(
        return new UITask<DBPAuthInfo>() {

    private static UserResponse showDatabaseError(String message, DBException error)


        UIUtils.syncExec(() ->
                break;
    private static void showMessageBox(@NotNull String title, @NotNull String message, @NotNull DBPImage image) {
                ProcessPropertyTester.firePropertyChange(ProcessPropertyTester.PROP_RUNNING);
     * Execute runnable task synchronously while displaying job indeterminate indicator and blocking the UI, when called from the UI thread
            } else {
    @Override
 */
                    authDialog.setUserName(userName);
    }
        }


                final Shell shell = UIUtils.getActiveWorkbenchShell();
                final PasswordChangeDialog passwordChangeDialog = new PasswordChangeDialog(shell, prompt, userName, oldPassword, userEditable, oldPasswordVisible);

import org.eclipse.jface.operation.ModalContext;
                showMessageBox(title, message, DBIcon.STATUS_INFO);
        final AbstractJob job = new AbstractJob(operationDescription) {
        DBNNode[] result = new DBNNode[1];
            });
        boolean showSavePassword
    @Override
            passwordOnly,
            }
                        }, true, new NullProgressMonitor(), display);
    }
    public void executeInMainThread(@NotNull Runnable runnable) {
import org.jkiss.dbeaver.ui.navigator.dialogs.ObjectBrowserDialog;
        Runnable runnable = () -> {
                List<Button> extraCheckboxes = new ArrayList<>(forAllLabels.size());
        UIUtils.asyncExec(() -> ShellUtils.showInSystemExplorer(path));
        @Nullable String userPassword,
        });

                            } catch (Exception ex) {
                    runnable.run(monitor);
    }
                            protected void cancelPressed() {
                    if (!workbenchInitializing) {
    }
            if (s.getException() instanceof DBException) {
                }
import org.eclipse.swt.widgets.Display;
    }
                } catch (Exception ex) {
                try {
        });
import org.jkiss.dbeaver.ui.dialogs.exec.ExecutionQueueErrorJob;
    public void openEntityEditor(@NotNull DBNNode selectedNode, String defaultPageId) {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
                    .setPrimaryImage(DBIcon.STATUS_WARNING);
        }

                        
                    currentDisplay.sleep();

    public void openConnectionEditor(@NotNull DBPDataSourceContainer dataSourceContainer) {
                monitor.beginTask(operationDescription, IProgressMonitor.UNKNOWN);
    @NotNull

            }
                }
                    return null;
            TextTransfer textTransfer = TextTransfer.getInstance();
        try {
    @Override
                    return null;
            null
                if (!forAllLabels.isEmpty()) {
import org.eclipse.swt.events.SelectionListener;
                .setPrimaryImage(isWarning ? DBIcon.STATUS_WARNING : DBIcon.STATUS_QUESTION)
        if (UIUtils.isUIThread()) {
    @Override
        }
import java.util.concurrent.CompletableFuture;
    public void showWarningMessageBox(@NotNull String title, String message) {
            }
        if (isHeadlessMode()) {
                HTMLTransfer htmlTransfer = HTMLTransfer.getInstance();
                    .setMessage(message)
        }
    @Nullable
    public void initialize() {
                    log.error(e);
            @Override
                authDialog.setUserNameLabel(userNameLabel);
    private static final Log log = Log.getLog(DesktopUI.class);
                    UIUtils.getActiveWorkbenchShell(),
import java.util.List;
                }
                    monitor.done();
        }
                runnable.cancel();
                    .setReplies(reply.stream().filter(Objects::nonNull).toArray(Reply[]::new))
                    return null;
                    });
                authDialog.setDescription(description == null ? prompt : description);
            message,
    @Override
        });
            contextListener.dispose();
    @Override
                                selectedCheckboxIndex[0] = chkIndex;
                    .setTitle(title)
    }
    /**
            protected Boolean runTask() {
    }
        UIUtils.syncExec(() -> NavigatorHandlerObjectOpen.openEntityEditor(object));
                            chk.setData(index);
            return super.confirmAction(title, message, buttonLabel, isWarning);
        }
        }
    @NotNull
     */
        int style,
    }

                }
    @Nullable
    public void showWarningNotification(@NotNull String title, String message) {
                if (!workbenchInitializing) {
                }
/**
    @Override

    }
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
import org.jkiss.code.NotNull;
import org.eclipse.swt.custom.BusyIndicator;


        return UIUtils.runWithMonitor(runnable);
                    return passwordChangeDialog.getPasswordInfo();
            @Override
import org.eclipse.core.runtime.NullProgressMonitor;
                            chk.addSelectionListener(selectionListener);
    }
import org.jkiss.dbeaver.ui.notifications.NotificationUtils;

                IWorkbench workbench = PlatformUI.getWorkbench();
                .setDefaultReply(Reply.CANCEL)
        for (IStatus s = status; s != null; ) {
                    for (Shell shell : shells) {
                if (dbErrorResp != null) {
                            monitor.beginTask(operationDescription, IProgressMonitor.UNKNOWN);
            case DRIVER_CLASS_MISSING:
            .toList();
            }
                if (PlatformUI.isWorkbenchRunning() && !PlatformUI.getWorkbench().isStarting()) {
            error ? DBPMessageType.ERROR : DBPMessageType.INFORMATION,
        return null;
                        );
                if (!passwordOnly) {
            return runnable.getResult();
                try {
            @NotNull
        }
        return LoadingJob.createService(loadingService, visualizer);
            return super.showError(title, message, error);
        }.execute();
                        }
package org.jkiss.dbeaver.core;
    public <RESULT> Job createLoadingService(@NotNull ILoadService<RESULT> loadingService, @NotNull ILoadVisualizer<RESULT> visualizer) {
                if (dataSource.getContainer().getDataSource() == null) {
    }
                boolean workbenchInitializing = workbench == null || workbench.isStarting() || workbench.isClosing();
        );
        }
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
    @Override
                } else {
import org.jkiss.dbeaver.ui.dialogs.*;
    private void dispose() {
        return new UITask<String>() {
                    new Object[]{text},
                }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                        progress.run(true, true, monitor -> {
    private WorkbenchContextListener contextListener;
                        for (Shell shell : display.getShells()) {
        processDescriptor.setProcessListener(new DBRProcessListener() {
        final List<Reply> reply = labels.stream()
        return UIUtils.confirmAction(null, title, message, isWarning ? DBIcon.STATUS_WARNING : DBIcon.STATUS_QUESTION);
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    // If this DB error was handled by some DB-specific way then just don't care about it
    @Override
        }
    }
            @Override
        return (DesktopUI) DBWorkbench.getPlatformUI();
                DriverEditHelpers.showBadConfigDialog(null, message, error);
    public UserResponse showError(@NotNull String title, @Nullable String message, @NotNull Throwable error) {
        DBPDataSource dataSource = error instanceof DBDatabaseException dbe ? dbe.getDataSource() : null;
        }
    }
                        ModalContext.run(monitor -> { 
            userPassword,
    @NotNull
 * Copyright (C) 2010-2026 DBeaver Corp and others
        try {
                }
/*
        };
            
    public DBPAuthInfo promptUserCredentials(
        }

                }
import java.util.concurrent.Future;
    }
                    BusyIndicator.showWhile(display, modalShortWait);
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        if (CommonUtils.isEmpty(text)) {
            title,
                    }
            message,
        if (isHeadlessMode()) {
                            shell.setEnabled(true);
        if (result == null) {
    ) {
            // UI not initialized
 * DBeaver UI core
            if (!currentDisplay.readAndDispatch()) {
            if (error) {
                try {
        if (platformUI instanceof DesktopUI desktopUI) {
            @Override

    @Override
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                ProcessPropertyTester.firePropertyChange(ProcessPropertyTester.PROP_RUNNING);
import org.eclipse.core.runtime.IStatus;
                    mbb.setDefaultReply(reply.get(previousChoice));

 * DBeaver - Universal Database Manager
    public String promptProperty(String prompt, String defValue) {

    }
        }.execute();

 * Unless required by applicable law or agreed to in writing, software


                            Button chk = UIUtils.createCheckbox(pp, forAllLabels.get(index), false);
            return super.showUserChoice(title, message, labels, forAllLabels, previousChoice, defaultChoice);
            @Override
    public void showMessageBox(@NotNull String title, String message, boolean error) {
                int choiceIndex = reply.indexOf(result);
        @Nullable String message,
    }
        return new UITask<Boolean>() {
                desktopUI.dispose();
            UIConnectionMessages.dialog_connection_auth_label_password,
                    try {
        return showError(title, null, new Status(IStatus.ERROR, DesktopPlatform.PLUGIN_ID, message));

            return super.showError(title, message);
    public boolean confirmAction(String title, String message) {
 *
                    return null;
        boolean passwordOnly,
                    return CompletableFuture.failedFuture(ex);
        @Nullable String description,
            case CONNECTION_LOST:
}

                    if (shortWaitResult.get()) {
        @NotNull String passwordLabel,
                DataSourceInvalidateHandler.showConnectionLostDialog(null, message, error);
        log.error(rootStatus.getMessage(), rootStatus.getException());
            feedback
                authDialog.setPasswordLabel(passwordLabel);
        String[] filterExt,
        @NotNull List<String> forAllLabels,
        @Nullable String userPassword,
    }

        showMessageBox("Not supported", "External file system are not supported", true);



        // log.debug(message);
                    return authDialog.getAuthInfo();
                        });
                        for (int index = 0; index < forAllLabels.size(); index++) {
                            try {
            return CompletableFuture.failedFuture(ex);
        });
        job.schedule();
                            }
        boolean binary,
                .showMessageBox();
    }

            } catch (Throwable e) {
import org.jkiss.dbeaver.model.runtime.*;
                    licenseText);
                status,
import org.eclipse.ui.IWorkbenchPage;
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
        @Nullable String userName,
        IStatus result = job.getResult();
            @NotNull
                try {
            if (!display.isDisposed()) {
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceInvalidateHandler;
                        };
            public DBAPasswordChangeInfo runTask() {
                .setReplies(Reply.OK)
        try {
            public DBPAuthInfo runTask() {
                                for (int index = 0; index < extraCheckboxes.size(); index++) {
    // This method is called during startup thru @ComponentReference in workbench
                .setReplies(confirm, Reply.CANCEL)
        UIUtils.syncExec(runnable);
import org.eclipse.ui.PartInitException;
    public UserResponse showErrorStopRetryIgnore(String task, Throwable error, boolean queue) {
    @Override
import org.jkiss.code.Nullable;
            if (s.getChildren() != null && s.getChildren().length > 0) {
    }
    @Override
                .setTitle(title)
        new AbstractJob("Workbench listener") {
        return null;

                break;
    public DBAPasswordChangeInfo promptUserPasswordChange(String prompt, String userName, String oldPassword, boolean userEditable, boolean oldPasswordVisible) {
            }

                    }
            }

            super.showWarningMessageBox(title, message);
    public DBNPathBase openFileSystemSelector(
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
                IStatus.ERROR);
                final BaseAuthDialog authDialog = new BaseAuthDialog(shell, prompt, passwordOnly, showSavePassword);
import org.jkiss.dbeaver.model.struct.DBSObject;
                    final ShellProcessView processView =
            DBeaverNotifications.NT_GENERIC,
    }
import org.eclipse.core.runtime.jobs.Job;

            job.join();
                }
            try {
        @NotNull DBRRunnableWithResult<Future<T>> runnable
        if (isHeadlessMode()) {
                    UIUtils.asyncExec(() -> contextListener = WorkbenchContextListener.registerInWorkbench());
        }
        int defaultChoice
                final Shell shell = UIUtils.getActiveWorkbenchShell();
        UIUtils.syncExec(() -> MessageBoxBuilder.builder(Display.getCurrent().getActiveShell())
        if (contextListener == null) {
            showError("Execute process", processDescriptor.getName(), e);
        
                                }
            }
    private static boolean isHeadlessMode() {
                final Shell shell = UIUtils.getActiveWorkbenchShell();
            return CompletableFuture.failedFuture(new DBException("the result of the job is null. Has it finished?"));
import org.jkiss.dbeaver.ui.dialogs.driver.DriverEditHelpers;
        @Nullable String prompt,
                                        extraCheckboxes.get(index).setSelection(false);
            }
            DBeaverNotifications.NT_GENERIC,
            // Display the dialog
        NotificationUtils.sendNotification(
        return showError(title, message, GeneralUtils.makeExceptionStatus(error));
        };
                                super.cancelPressed();
            dialog.open();
    public DBNNode selectObject(@NotNull Object parentShell, String title, DBNNode rootNode, DBNNode selectedNode, Class<?>[] allowedTypes, Class<?>[] resultTypes, Class<?>[] leafTypes) {
    @Override
import org.eclipse.swt.widgets.Shell;
                } else {
            UIUtils.asyncExec(() -> {
    ) {
    static void disposeUI() {
        final Reply[] decision = new Reply[1];
            super.showMessageBox(title, message, error);
import org.jkiss.dbeaver.ui.dialogs.connection.PasswordChangeDialog;
                        (ShellProcessView) UIUtils.getActiveWorkbenchWindow().getActivePage().showView(
                        shortWaitResult.completeExceptionally(ex);
        }
        UIUtils.syncExec(() -> NavigatorHandlerObjectOpen.openEntityEditor(selectedNode, defaultPageId, UIUtils.getActiveWorkbenchWindow()));
    public <T> T runWithMonitor(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException {
        if (isHeadlessMode()) {
        return promptUserCredentials(
        if (currentDisplay != null) {

            description,
    @Override
                if (passwordChangeDialog.open() == IDialogConstants.OK_ID) {
        }
                }
import org.jkiss.dbeaver.model.navigator.DBNNode;
            UIConnectionMessages.dialog_connection_auth_label_username,
                } else {
    public DBPAuthInfo promptUserCredentials(
    }
            showSavePassword
import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
        UIUtils.syncExec(() -> {
    @Override

    }
                if (previousChoice != null && reply.get(previousChoice) != null) {
    ) {
            public UserChoiceResponse runWithResult() {
                clipboard.setContents(
                if (dialog.open() == IDialogConstants.OK_ID) {
    @Override
 */
        }
import org.jkiss.dbeaver.ui.views.process.ShellProcessView;
        }
                    return dbErrorResp;
        if (isHeadlessMode()) {
                };
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.dnd.TextTransfer;
        // Ask user
            return true;
                } catch (Exception ex) {
    public <T> Future<T> executeWithProgressBlocking(
                    return Status.OK_STATUS;
                .showMessageBox()
            return false;
        }.schedule();
                authDialog.setUserPassword(userPassword);
        boolean passwordOnly,
import org.eclipse.ui.IWorkbench;
            }
    public void executeProcess(@NotNull final DBRProcessDescriptor processDescriptor) {
                
import org.jkiss.utils.CommonUtils;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
    public void openEntityEditor(@NotNull DBSObject object) {
            public String runTask() {
            }
    }
                return new UserChoiceResponse(choiceIndex, selectedCheckboxIndex[0]);
    @Override
        UserChoiceResponse userChoice = UIUtils.syncExec(new RunnableWithResult<>() {
                    }
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
                return AcceptLicenseDialog.acceptLicense(
import org.eclipse.swt.dnd.Transfer;


        return CompletableFuture.failedFuture(result.getException());
            Shell shell = (parentShell instanceof Shell ? (Shell)parentShell : UIUtils.getActiveWorkbenchShell());
    }
                log.error(e);
    public void showInSystemExplorer(@NotNull String path) {
    @Override
import org.eclipse.core.runtime.IProgressMonitor;
    @Override
    public static DesktopUI getInstance() {
    {
    @Override
        @NotNull String title,
                            IWorkbenchPage.VIEW_VISIBLE
                    mbb.setCustomArea(pp -> {
    @Override
    public <T> T runWithProgress(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException {
                Runnable modalShortWait = () -> {
            if (htmlFormat) {
 * You may obtain a copy of the License at
                showMessageBox(title, message, DBIcon.STATUS_ERROR);
                    } catch (Exception ex) {
            } else {
    public boolean acceptLicense(String message, String licenseText) {
        return new UITask<DBAPasswordChangeInfo>() {
 *
            Clipboard clipboard = new Clipboard(UIUtils.getDisplay());
    }
                    new Transfer[]{textTransfer});
            return PlatformUI.getWorkbench().getProgressService().getLongOperationTime();
        UIUtils.syncExec(runnable);
                if (authDialog.open() == IDialogConstants.OK_ID) {
        return UserResponse.OK;
        } catch (InterruptedException ex) {
import org.jkiss.dbeaver.DBDatabaseException;
                    // Do not sleep during startup/shutdown because you may have no chance to get UI event anymore
                        shell.setEnabled(false);
    public void showNotification(@NotNull String title, String message, boolean error, @Nullable Runnable feedback) {
                    schedule(50);
        } else {
        @Nullable Integer previousChoice,
import org.eclipse.swt.dnd.HTMLTransfer;
        }
                            }  
                return UserResponse.OK;
    public UserChoiceResponse showUserChoice(
                    return GeneralUtils.makeExceptionStatus(ex);
    @Override
        boolean folder,
        }
                    message,
        @NotNull String operationDescription,
                message,
        boolean showSavePassword
    @Override
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
                            job.join();

        if (processDescriptor.getCommand().isShowProcessPanel()) {
            public void onProcessTerminated(int resultCode) {
    @Nullable

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            protected void canceling() {

                        }
        );
                return UserResponse.OK;
            DBPMessageType.WARNING,
    @Override
                if (!workbench.isStarting() && !workbench.isClosing()) {
                                job.cancel();
            decision[0] = MessageBoxBuilder.builder(UIUtils.getActiveWorkbenchShell())
    }
import org.jkiss.dbeaver.DBException;

        }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                }

                } catch (PartInitException e) {
                dataSourceContainer));
        return decision[0] == confirm;
                MessageBoxBuilder mbb = MessageBoxBuilder.builder(UIUtils.getActiveWorkbenchShell())
                    new Object[]{text, text},
    @Override
    }

        );

        NotificationUtils.sendNotification(

                        SelectionListener selectionListener = SelectionListener.widgetSelectedAdapter(e -> {
    @Override
                                shortWaitResult.completeExceptionally(ex);
        }
    }
        } catch (DBException e) {
                .setTitle(title)
        if (result.isOK()) {
            return UserResponse.CANCEL;
            showMessageBox(title, message, DBIcon.STATUS_WARNING);
        return ExecutionQueueErrorJob.showError(task, error, queue);
 *
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.PlatformUI;
    public void executeShellProgram(@NotNull String shellCommand) {
                    }
        return UIUtils.confirmAction(title, message);
        }
                    new Transfer[]{textTransfer, htmlTransfer});
import java.util.Objects;

        @NotNull String title,
    @Override
    @Override
        if (isHeadlessMode()) {
        } else {
        return result[0];
            prompt,
    public UserResponse showError(@NotNull final String title, @Nullable final String message, @NotNull final IStatus status) {
                UserResponse dbErrorResp = showDatabaseError(message, (DBException) s.getException());
                                    if (index != chkIndex) {
            NavigatorHandlerObjectOpen.openConnectionEditor(
            result[0] = ObjectBrowserDialog.selectObject(shell, title, rootNode, selectedNode, allowedTypes, resultTypes, leafTypes);
                Integer[] selectedCheckboxIndex = {null};
                                    }

            }
                            int chkIndex = (Integer) e.widget.getData();
    }
                Reply result = mbb.showMessageBox();
    }
                } else {
                }
                CompletableFuture<Boolean> shortWaitResult = new CompletableFuture<>();
        Display currentDisplay = Display.getCurrent();
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull List<String> labels,
        if (rootStatus == Status.CANCEL_STATUS) {
                } finally {
                            @Override
                    UIExecutionQueue.blockQueue();
    }
        return userChoice == null ? new UserChoiceResponse(0, null) : userChoice;
            public void onProcessStarted() {
    ) {
        @Nullable String description,
                clipboard.setContents(
        DBPPlatformUI platformUI = DBWorkbench.getPlatformUI();
                .setPrimaryImage(image)

                UIUtils.getActiveWorkbenchWindow(),

                        });
                    return dialog.getResult();
        }
            .map(s -> CommonUtils.isEmpty(s) ? null : new Reply(s))

        if (isHeadlessMode()) {
            processDescriptor.execute();
 * See the License for the specific language governing permissions and
    public boolean confirmAction(@NotNull String title, @NotNull String message, @NotNull String buttonLabel, boolean isWarning) {
 * limitations under the License.
    }
            @Override
    public boolean readAndDispatchEvents() {
                IWorkbench workbench = PlatformUI.isWorkbenchRunning() ? PlatformUI.getWorkbench() : null;
                        ProgressMonitorDialog progress = new ProgressMonitorDialog(display.getActiveShell()) {
