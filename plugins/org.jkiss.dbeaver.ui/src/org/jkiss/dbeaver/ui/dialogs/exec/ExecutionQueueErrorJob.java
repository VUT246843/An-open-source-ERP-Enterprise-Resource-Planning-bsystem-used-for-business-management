            case IDialogConstants.IGNORE_ID:
import org.eclipse.core.runtime.Status;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
                break;
 * You may obtain a copy of the License at
            UIUtils.getActiveWorkbenchShell(),
    }
        ExecutionQueueErrorJob errorJob = new ExecutionQueueErrorJob(task, error, queue);
        this.queue = queue;
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
        return errorJob.getResponse();
}
    }
 * ExecutionQueueErrorJob
    public DBPPlatformUI.UserResponse getResponse()
 */
    {
    }
                break;
    public static DBPPlatformUI.UserResponse showError(String task, Throwable error, boolean queue) {
    private boolean queue;


 * DBeaver - Universal Database Manager
 *
public class ExecutionQueueErrorJob extends AbstractUIJob {
    private String errorName;
    @NotNull
            case IDialogConstants.RETRY_ID:
            case IDialogConstants.CANCEL_ID:
        super("Execution Error Job");
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ui.UIUtils;
                response = DBPPlatformUI.UserResponse.STOP;
    {
        return response;
            errorJob.join();
            case IDialogConstants.STOP_ID:


        this.error = error;

            "Error occurred during " + errorName,
    private DBPPlatformUI.UserResponse response = DBPPlatformUI.UserResponse.STOP;
                break;
        } catch (InterruptedException e1) {
            GeneralUtils.makeExceptionStatus(error),
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.errorName = errorName;
    }
package org.jkiss.dbeaver.ui.dialogs.exec;
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
                break;

            queue);
        int result = dialog.open();
import org.eclipse.jface.dialogs.IDialogConstants;
 * distributed under the License is distributed on an "AS IS" BASIS,
        errorJob.schedule();
import org.jkiss.dbeaver.utils.GeneralUtils;
            case IDialogConstants.SKIP_ID:
import org.jkiss.dbeaver.ui.AbstractUIJob;
    private Throwable error;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                break;
            "Execution Error",
    public ExecutionQueueErrorJob(String errorName, Throwable error, boolean queue)
        try {
    public IStatus runInUIThread(@NotNull DBRProgressMonitor monitor)
                response = DBPPlatformUI.UserResponse.RETRY;

        return Status.OK_STATUS;
/**
        switch (result) {
/*
 * Copyright (C) 2010-2026 DBeaver Corp and others
            log.error(e1);
    @Override
 */
                response = DBPPlatformUI.UserResponse.IGNORE_ALL;
                response = DBPPlatformUI.UserResponse.IGNORE;
            IStatus.INFO | IStatus.WARNING | IStatus.ERROR,
    {
 * See the License for the specific language governing permissions and
 *
                response = DBPPlatformUI.UserResponse.STOP;
        ExecutionQueueErrorDialog dialog = new ExecutionQueueErrorDialog(
 *
        }
            default:
