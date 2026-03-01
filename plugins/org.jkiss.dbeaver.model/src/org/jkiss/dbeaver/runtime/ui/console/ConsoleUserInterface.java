    }
    @Override
        @NotNull String operationDescription,
        }
    public void showInSystemExplorer(@NotNull String path) {
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    }

    @NotNull
import java.nio.file.Path;
 *
            status.getException().printStackTrace(System.out);
        int style,
import java.util.List;
    @Override
        };
                    return GeneralUtils.makeExceptionStatus(e.getTargetException());
/*
    public void executeProcess(@NotNull DBRProcessDescriptor processDescriptor) {
            }
    }
    protected void initialize() {

    @Override
 */
        System.out.println(title + (message == null ? "" : ": " + message));
        System.out.println(title + (message == null ? "" : ": " + message));
        System.out.println(title + (message == null ? "" : ": " + message));
    }
    @Override
    }

    @Override
    public UserResponse showError(@NotNull String title, @Nullable String message, @NotNull Throwable e) {
        boolean showSavePassword
        return false;
 * Unless required by applicable law or agreed to in writing, software
    @Override
    }
        return UserResponse.OK;
            System.out.println("Open directory '" + shellCommand + "'");
    public void copyTextToClipboard(@NotNull String text, boolean htmlFormat) {
        boolean binary,

    public void showNotification(@NotNull String title, @Nullable String message, boolean error, @Nullable Runnable feedback) {
                } catch (InvocationTargetException e) {
        // do nothing
        int defaultChoice
        System.out.println(task);
        @Nullable final String message,
                    RESULT result = loadingService.evaluate(monitor);

    ) {
        error.printStackTrace(System.out);
        boolean passwordOnly,
        @NotNull List<String> forAllLabels,
    }
    }
        System.out.println(title + (message == null ? "" : ": " + message));
    }

    }
        }
import org.eclipse.core.runtime.IStatus;
    }
    public DBNPathBase openFileSystemSelector(

    public DBNNode selectObject(@NotNull Object parentShell, String title, DBNNode rootNode, DBNNode selectedNode, Class<?>[] allowedTypes, Class<?>[] resultTypes, Class<?>[] leafTypes) {
        @NotNull String passwordLabel,


    }
    public boolean readAndDispatchEvents() {

    @Override
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            runnable.run(new LoggingProgressMonitor());
    public <T> Future<T> executeWithProgressBlocking(

    }
public class ConsoleUserInterface implements DBPPlatformUI {
        } catch (Exception e) {
    @Override

    public void openConnectionEditor(@NotNull DBPDataSourceContainer dataSourceContainer) {
                    visualizer.completeLoading(result);
    ) {
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
import org.jkiss.code.Nullable;
    @Override
            processDescriptor.execute();
    public void showWarningMessageBox(@NotNull String title, @Nullable String message) {
        @NotNull String userNameLabel,


        return runnable.runTask(new LoggingProgressMonitor(log));
    public void showMessageBox(@NotNull String title, String message, boolean error) {

    private void printStatus(@NotNull IStatus status, int level) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return Status.CANCEL_STATUS;
            @NotNull
    @Override
        return new AbstractJob(loadingService.getServiceName()) {
    @Override
    }
        return true;
    ) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } catch (Exception ex) {
    @Override

    public UserResponse showError(@NotNull String title, @Nullable String message) {
    @Override
    public void executeShellProgram(@NotNull String shellCommand) {
        @NotNull String title,
        }
 * limitations under the License.
        boolean passwordOnly,
        @Nullable String userPassword,

    @Override
        Path filePath = Path.of(shellCommand);

    @Override

                } catch (InterruptedException e) {
            return runnable.getResult();
        if (status.getMessage() != null) {
    public UserResponse showError(@NotNull String title, @Nullable String message, @NotNull IStatus status) {
        @Nullable String description,
    }
    @NotNull
    public void showWarningNotification(@NotNull String title, @Nullable String message) {
    }
import org.jkiss.dbeaver.Log;

        try {
import org.jkiss.dbeaver.model.runtime.*;
    }
 * You may obtain a copy of the License at
        @Nullable String userName,

    public DBPAuthInfo promptUserCredentials(
    }
    }
            System.out.println("" + indent + status.getMessage());
        printStatus(status, 0);

        } catch (DBException e) {
        // do nothing
    }
    @Override
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return new UserChoiceResponse(defaultChoice, null);
 * DBeaver - Universal Database Manager
        @NotNull DBRRunnableWithResult<Future<T>> runnable
        return UserResponse.OK;
        String[] filterExt,
    @Nullable
    public DBPAuthInfo promptUserCredentials(
    @Override
                    return Status.OK_STATUS;
        char[] indent = new char[level * 4];
    }
        // do nothing
        @Nullable String prompt,
    public <T> T runWithMonitor(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException {

        if (status.getException() != null) {

import java.util.concurrent.Future;
    }
    }

import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
            return;
            Runtime.getRuntime().exec(shellCommand);
        @Nullable String prompt,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    @Override
        System.out.println(title + (message == null ? "" : ": " + message));

        @Nullable String userPassword,
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        for (int i = 0; i < indent.length; i++) indent[i] = ' ';

    @Override


        e.printStackTrace(System.out);

    public boolean confirmAction(@NotNull String title, @NotNull String message, @NotNull String buttonLabel, boolean isWarning) {
    }

import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
        return false;
    @Override
    public UserResponse showErrorStopRetryIgnore(String task, Throwable error, boolean queue) {
import java.util.concurrent.CompletableFuture;
    @NotNull
        throw new IllegalStateException("Can not prompt user credentials in non-interactive mode");
        return null;
    }
        @NotNull final String title,
        @Nullable String userName,
        showMessageBox(title, message, error);
    public UserChoiceResponse showUserChoice(
    @Override
    public <RESULT> Job createLoadingService(@NotNull ILoadService<RESULT> loadingService, @NotNull ILoadVisualizer<RESULT> visualizer) {
    @Override
        @NotNull List<String> labels,
    @Override
        boolean showSavePassword
    }
        String defaultValue
import org.eclipse.core.runtime.jobs.Job;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void openEntityEditor(@NotNull DBNNode selectedNode, String defaultPageId) {
        try {
        boolean folder,
    @Override
    }
        return UserResponse.OK;
    @Override
        }
import java.lang.reflect.InvocationTargetException;

    @Override
}
    private static final Log log = Log.getLog(ConsoleUserInterface.class);

import org.jkiss.dbeaver.utils.GeneralUtils;
    @Override
            return CompletableFuture.failedFuture(ex);
 * See the License for the specific language governing permissions and
        @Nullable Integer previousChoice,
            @Override
        // do nothing
        @Nullable String description,
    public void executeInMainThread(@NotNull Runnable runnable) {
    ) {

        runnable.run();
        return UserResponse.IGNORE;
    @Nullable
        }
        return false;

                }
        return null;
    public boolean confirmAction(String title, String message) {
        return null;
import java.nio.file.Files;
        if (Files.exists(filePath) && Files.isDirectory(filePath)) {
    @Override
        throw new IllegalStateException("Can not prompt user password change in non-interactive mode");
import org.jkiss.code.NotNull;
    }
        try {

    }
import org.jkiss.dbeaver.DBException;
        showWarningMessageBox(title, message);
    }
import org.eclipse.core.runtime.Status;
        // do nothing
    public boolean confirmAction(String title, String message, boolean isWarning) {
 * you may not use this file except in compliance with the License.
 *
            log.error(e);
        return runnable.runTask(new LoggingProgressMonitor(log));

package org.jkiss.dbeaver.runtime.ui.console;
        throw new IllegalStateException("Can not prompt user credentials in non-interactive mode");
import org.jkiss.dbeaver.model.access.DBAPasswordChangeInfo;
    public <T> T runWithProgress(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException {
                try {
            DBWorkbench.getPlatformUI().showError("Execute process", processDescriptor.getName(), e);
    ) {
        return false;
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
    public DBAPasswordChangeInfo promptUserPasswordChange(String prompt, String userName, String oldPassword, boolean userEditable, boolean oldPasswordEditable) {

    }
    }

import org.jkiss.dbeaver.model.navigator.DBNNode;
    public void openEntityEditor(@NotNull DBSObject object) {
    public String promptProperty(String prompt, String defValue) {
    }
    public boolean acceptLicense(String message, String licenseText) {
        // just a placeholder for injection
