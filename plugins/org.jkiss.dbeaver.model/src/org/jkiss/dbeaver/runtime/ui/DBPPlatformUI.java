
        boolean binary,
     * Error boxes
    }
    void openEntityEditor(@NotNull DBSObject object);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Ask user to enter some property value
    @Nullable
 * See the License for the specific language governing permissions and
    void showWarningMessageBox(@NotNull final String title, @Nullable final String message);
     * Execute runnable task synchronously while displaying job indicator if needed
import org.jkiss.dbeaver.model.runtime.DBRProcessDescriptor;
        @Nullable String userPassword,
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
        @Nullable String description,
    UserResponse showError(@Nullable final String title, @Nullable final String message, @NotNull final Throwable e);
public interface DBPPlatformUI {

    // Execute some action in UI thread
         * index of the user's choice or out of range value (-1) on dialog failure
            this.choiceIndex = choiceIndex;
 * User interface interactions
    <RESULT> Job createLoadingService(

    void showMessageBox(@NotNull final String title, @Nullable final String message, boolean error);
    boolean confirmAction(String title, String message);
     * @param title Dialog window title

    DBNNode selectObject(@NotNull Object parentShell, String title, DBNNode rootNode, DBNNode selectedNode, Class<?>[] allowedTypes, Class<?>[] resultTypes, Class<?>[] leafTypes);
    void showInSystemExplorer(@NotNull String path);
        public final Integer forAllChoiceIndex;

     * Asks for user credentials. Returns null if user canceled this action.

 * DBeaver - Universal Database Manager

    void showNotification(@NotNull final String title, @Nullable final String message, boolean error, @Nullable Runnable feedback);

    );

        CANCEL,
 * You may obtain a copy of the License at
     */
 *

    @Nullable
        RETRY,
    boolean acceptLicense(String message, String licenseText);
     * Show user-choice dialog for a user to mandatory select one of the options described with the labels
 */
        @Nullable String userPassword,

        int style,
    void openConnectionEditor(@NotNull DBPDataSourceContainer dataSourceContainer);
    void executeShellProgram(@NotNull String shellCommand);
     */
     * @param message Dialog window content explaining the choice in question
        STOP,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    UserResponse showError(@NotNull final String title, @Nullable final String message, @NotNull final IStatus status);
        @Nullable
     * Ask user to accept license agreement

    /**
        String defaultValue);
        boolean showSavePassword);
        @NotNull String userNameLabel,

     * Runs task with system progress monitor
            this.forAllChoiceIndex = forAllChoiceIndex;
    <T> T runWithProgress(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException, InvocationTargetException, InterruptedException;


        @NotNull ILoadService<RESULT> loadingService,
import org.jkiss.code.NotNull;
    /**
        boolean folder,
        @Nullable String prompt,
    void openEntityEditor(@NotNull DBNNode selectedNode, @Nullable String defaultPageId);
        boolean showSavePassword);
 * limitations under the License.
    /**
}     * @param forAllLabels Options to remember the choice

import java.util.concurrent.Future;
     * Asks for password change. Returns null if user canceled this action.
        @NotNull List<String> forAllLabels,
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
    DBPAuthInfo promptUserCredentials(

    boolean confirmAction(@NotNull String title, @NotNull String message, @NotNull String buttonLabel, boolean isWarning);
        @NotNull ILoadVisualizer<RESULT> visualizer);
        boolean passwordOnly,
import org.jkiss.dbeaver.DBException;
        OK,
    boolean readAndDispatchEvents();

    UserResponse showErrorStopRetryIgnore(String task, Throwable error, boolean queue);


    <T> Future<T> executeWithProgressBlocking(@NotNull String operationDescription, @NotNull DBRRunnableWithResult<Future<T>> runnable);
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
        @Nullable String userName,
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithReturn;
    DBAPasswordChangeInfo promptUserPasswordChange(String prompt, @Nullable String userName, @Nullable String oldPassword, boolean userEditable, boolean oldPasswordVisible);
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
     */
     * UI utilities
        @Nullable String description,

    UserResponse showError(@NotNull final String title, @Nullable final String message);
import org.eclipse.core.runtime.IStatus;
        boolean passwordOnly,

        @Nullable String prompt,
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
/*
     * @param previousChoice Previous choice made by the user to be focused initially on dialog show
    /**
        @NotNull String title,

     * @param labels Options to choose of
import org.jkiss.dbeaver.model.runtime.load.ILoadService;

 *
    boolean confirmAction(String title, String message, boolean isWarning);
    DBPAuthInfo promptUserCredentials(
        }
        @Nullable String userName,
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.code.Nullable;
        @NotNull String title,
 */


    /**
    void executeProcess(@NotNull DBRProcessDescriptor processDescriptor);
        int defaultChoice
    /**
    UserChoiceResponse showUserChoice(
     */
    /**
    /**
    // Process execution
    String promptProperty(String prompt, String defValue);
    class UserChoiceResponse {
        IGNORE,
        String[] filterExt,
        public final int choiceIndex;
    enum UserResponse {
/**
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable String message,
     */
    /**
         */
        @NotNull String passwordLabel,
    void copyTextToClipboard(@NotNull String text, boolean htmlFormat);

import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.dbeaver.model.runtime.load.ILoadVisualizer;
    void executeInMainThread(@NotNull Runnable runnable);
     * 
     */
        /**
    @NotNull
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.model.access.DBAPasswordChangeInfo;
    void showWarningNotification(@NotNull final String title, @Nullable final String message);
     * @return Description of the choice made by the user
     * @param defaultChoice Choice to use when the UI platform does not support dialogs

        IGNORE_ALL,

    <T> T runWithMonitor(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException;
        @Nullable Integer previousChoice,
    DBNPathBase openFileSystemSelector(

     */

        public UserChoiceResponse(int choiceIndex, @Nullable Integer forAllChoiceIndex) {
import org.eclipse.core.runtime.jobs.Job;
import org.jkiss.dbeaver.model.struct.DBSObject;
     */
package org.jkiss.dbeaver.runtime.ui;
        @NotNull List<String> labels,
