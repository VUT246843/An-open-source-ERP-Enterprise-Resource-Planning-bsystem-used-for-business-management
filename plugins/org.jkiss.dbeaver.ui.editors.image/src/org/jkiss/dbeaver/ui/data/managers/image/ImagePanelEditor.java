            }
    @Override
        final DBPPreferenceStore preferenceStore = valueController.getExecutionContext() != null
    }
    ) throws DBException {
    public void primeEditorValue(
    public AbstractImageViewer createControl(IValueController valueController) {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            } catch (IOException e) {
    @Override
import org.jkiss.dbeaver.ui.UITask;
    @Override
    }
import org.jkiss.dbeaver.DBException;
                    protected Boolean runTask() {
    }
                }).runTask());
import org.jkiss.dbeaver.ui.controls.imageview.AbstractImageViewer;

public class ImagePanelEditor implements IStreamValueEditorPersistent<AbstractImageViewer> {
    public void extractEditorValue(@NotNull DBRProgressMonitor monitor, @NotNull AbstractImageViewer control, @NotNull DBDContent value) throws DBException {
                            return control.loadImage(contentStream);

 */
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        monitor.subTask("Read image value");
import org.jkiss.dbeaver.model.exec.DBCException;
 *
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
    public Path getExternalFilePath(@NotNull AbstractImageViewer control) {
import org.eclipse.swt.SWT;
 * you may not use this file except in compliance with the License.

                            return true; // already read
 *
                        } else {
    @Override
    public void contributeSettings(@NotNull IContributionManager manager, @NotNull AbstractImageViewer control) throws DBCException {
        // Not implemented
        return control.getExternalFilePath();
    @Nullable
import java.io.IOException;
* ImagePanelEditor
import org.jkiss.dbeaver.model.data.DBDContent;



 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            return new SWTImageViewer(valueController.getEditPlaceholder(), SWT.NONE);
import org.jkiss.dbeaver.ui.data.IStreamValueEditorPersistent;
        if (preferenceStore.getBoolean(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER)) {
 * You may obtain a copy of the License at
        if (data != null) {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        }
            ? valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore()
import java.io.InputStream;
        }

import org.jkiss.dbeaver.ui.controls.imageview.SWTImageViewer;
*/
import org.jkiss.dbeaver.ui.data.IValueController;
import java.nio.file.Path;
                if (!(new UITask<Boolean>() {
    @Override
 * See the License for the specific language governing permissions and

        control.fillToolBar(manager);
    }
import org.jkiss.dbeaver.ui.controls.imageview.BrowserImageViewer;
                    }
            control.clearImage();
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    @Override
package org.jkiss.dbeaver.ui.data.managers.image;
            try (InputStream contentStream = data.getContentStream()) {
        @NotNull DBDContent value
import org.jkiss.dbeaver.model.data.DBDContentStorage;
    @Override
    public void contributeActions(@NotNull IContributionManager manager, @NotNull final AbstractImageViewer control) throws DBCException {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.eclipse.jface.action.IContributionManager;
        DBDContentStorage data = value.getContents(monitor);
        @Nullable AbstractImageViewer control,
 * Unless required by applicable law or agreed to in writing, software
/*
                throw new DBException("Error reading stream value", e);
                        if (control != null && !control.isDisposed()) {
            return new BrowserImageViewer(valueController.getEditPlaceholder(), SWT.NONE);
        } else {
        }
        @NotNull DBRProgressMonitor monitor,
            : DBWorkbench.getPlatform().getPreferenceStore();

import org.jkiss.code.NotNull;
        } else {


/**
