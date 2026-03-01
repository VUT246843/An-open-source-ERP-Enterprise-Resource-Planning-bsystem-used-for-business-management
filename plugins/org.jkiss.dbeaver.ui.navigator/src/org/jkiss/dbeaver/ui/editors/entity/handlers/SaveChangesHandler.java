            this.saveable = saveable;
                // skip
 */
            } catch (InvocationTargetException e) {
                        log.debug("Savable '" + saveable + "' is still dirty after save");
                choice = saveablePart2.promptToSaveOnClose();
        }
import org.eclipse.core.commands.AbstractHandler;
        if (!saveable.isDirty()) {
                        saveableName = workbenchPart.getTitleToolTip();
 *
            }

        return saveRunner.getResult();
 * distributed under the License is distributed on an "AS IS" BASIS,
                    default -> ISaveablePart2.CANCEL;
import org.eclipse.jface.dialogs.MessageDialog;
        SaveRunner saveRunner = new SaveRunner(monitor, saveable);
        private final DBRProgressMonitor monitor;
}            }
                );
import org.jkiss.utils.CommonUtils;
                int confirmResult = ConfirmationDialog.confirmAction(
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
        {
        if (editor != null) {
import org.eclipse.ui.ISaveablePart;
            return true;
                } else {
        }

            switch (choice) {
        public void run() {
                    shell,
    }
            return result;
    }
                    result = true;
            this.monitor = monitor;
                    result = true;
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;

            } catch (InterruptedException e) {
 * DBeaver - Universal Database Manager
{
                    break;

        final EntityEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), EntityEditor.class);

                    shell = workbenchPart.getSite().getShell();
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
            try {

                    case IDialogConstants.NO_ID -> ISaveablePart2.NO;
                    MessageDialog.QUESTION_WITH_CANCEL,
            }
/*
                case ISaveablePart2.YES: //yes
 *
package org.jkiss.dbeaver.ui.editors.entity.handlers;
    private static final Log log = Log.getLog(SaveChangesHandler.class);
                };
 * you may not use this file except in compliance with the License.
                    }
import org.eclipse.core.commands.ExecutionEvent;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return;
            if (choice == -1 || choice == ISaveablePart2.DEFAULT) {
 * limitations under the License.
                    shell = UIUtils.getActiveWorkbenchShell();
    {
                    result = false;
        private SaveRunner(DBRProgressMonitor monitor, ISaveablePart saveable)
            } else if (!saveable.isDirty()) {
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Shell;
                UIUtils.runInProgressService(monitor -> validateAndSave(monitor, editor));
        private boolean result;
import org.eclipse.ui.IWorkbenchPart;
        return null;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.IDialogConstants;
                if (saveable instanceof IWorkbenchPart workbenchPart) {
            if (saveable instanceof ISaveablePart2 saveablePart2) {

import org.eclipse.core.commands.ExecutionException;
public class SaveChangesHandler extends AbstractHandler
                result = true;
    }
                String saveableName;
        }
            }
import org.eclipse.ui.ISaveablePart2;
 * Licensed under the Apache License, Version 2.0 (the "License");

                }
        public boolean getResult()
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.utils.RuntimeUtils;
    private static class SaveRunner implements Runnable {
        {
    public static boolean validateAndSave(DBRProgressMonitor monitor, ISaveablePart saveable)
        }
        @Override
import org.jkiss.dbeaver.Log;
        }
                    NavigatorPreferences.CONFIRM_EDITOR_CLOSE,
                Shell shell;
                    if (CommonUtils.isEmpty(saveableName)) {
                    saveableName
                    case IDialogConstants.YES_ID -> ISaveablePart2.YES;
                case ISaveablePart2.CANCEL: //cancel
    @Override
                    saveable.doSave(RuntimeUtils.getNestedMonitor(monitor));
                    saveableName = CommonUtils.toString(saveable);
                    saveableName = workbenchPart.getTitle();
            int choice = -1;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                // Actual save could be performed in promptToSaveOnClose (e.g. transaction commit)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                choice = switch (confirmResult) {
import org.eclipse.ui.handlers.HandlerUtil;
 * See the License for the specific language governing permissions and
                    if (saveable.isDirty()) {
        UIUtils.syncExec(saveRunner);
                case ISaveablePart2.NO: //no
    public Object execute(ExecutionEvent event) throws ExecutionException
                    break;
        private final ISaveablePart saveable;
                    break;
                //UIUtils.showErrorDialog();
                default:

