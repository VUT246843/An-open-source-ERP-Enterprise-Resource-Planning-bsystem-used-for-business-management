import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
import java.nio.file.Files;
import org.jkiss.dbeaver.model.struct.DBSObject;
        //verify that output files do not yet exist
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
        super(objects, title);
    }
                        getContainer().updateMessage();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.dialogs.IMessageProvider;
 * Licensed under the Apache License, Version 2.0 (the "License");
                return false;
                    );

 *
import org.jkiss.dbeaver.model.task.DBTTask;
        SETTINGS settings = getSettings();
                }
    }
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
            }
package org.jkiss.dbeaver.tasks.ui.nativetool;
                    TaskNativeUIMessages.tools_db_export_wizard_file_already_exists_title,
                DBWorkbench.getPlatformUI().showError("Error resolving file", "Error during output file resolution", e);
                    return false;
                Path file = DBFUtils.resolvePathFromString(getRunnableContext(), getProject(), settings.getOutputFile(info));
                    continue;
public abstract class AbstractNativeExportWizard<SETTINGS extends AbstractImportExportSettings<DBSObject> & ExportSettingsExtension<INFO>, INFO>
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
                }
        }
    protected AbstractNativeExportWizard(DBTTask task) {
/*
import java.io.IOException;
                    } catch (IOException e) {
                boolean deleteFile = UIUtils.confirmAction(
                if (!Files.exists(file) || Files.isDirectory(file)) {
                } catch (IOException e) {
            try {
    extends AbstractNativeImportExportWizard<SETTINGS, DBSObject> {
import org.jkiss.dbeaver.model.fs.DBFUtils;
                        e
 * distributed under the License is distributed on an "AS IS" BASIS,
                if (!deleteFile) {
import org.jkiss.dbeaver.tasks.ui.nativetool.internal.TaskNativeUIMessages;
 *
                );

 * limitations under the License.
            } catch (DBException e) {
    public boolean performFinish() {
        return super.performFinish();
        for (INFO info: settings.getExportObjects()) {
                        Files.createDirectories(dir);
import org.jkiss.dbeaver.DBException;
}
                try {
 * Unless required by applicable law or agreed to in writing, software
import java.util.Collection;
    }

import org.jkiss.dbeaver.runtime.DBWorkbench;
                Path dir = DBFUtils.resolvePathFromString(getRunnableContext(), getProject(), settings.getOutputFolder(info));
import java.nio.file.Path;
        super(task);
                    TaskNativeUIMessages.tools_db_export_wizard_file_already_exists_message
                    return false;
                }
                }
                        TaskNativeUIMessages.tools_db_export_wizard_file_have_not_been_deleted_message,
 */
                        logPage.setMessage("Can't create directory '" + dir.toString() + "': " + e.getMessage(), IMessageProvider.ERROR);
    protected AbstractNativeExportWizard(Collection<DBSObject> objects, String title) {
import org.jkiss.dbeaver.tasks.nativetool.ExportSettingsExtension;


 *     http://www.apache.org/licenses/LICENSE-2.0
                    DBWorkbench.getPlatformUI().showError(
                    Files.delete(file);

                        TaskNativeUIMessages.tools_db_export_wizard_file_have_not_been_deleted_title,
 *
                    try {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (!Files.exists(dir)) {
                        continue;
                    }

