            });
                    }
        return Files.exists(path) && ShellUtils.openExternalFile(path);
                        saveToFile(controller);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } else {
}
            default:
                        "content_type", //$NON-NLS-1$
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ui.data.dialogs.TextViewDialog;
        DBDContent content = (DBDContent) value;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull IContributionManager manager,
                        final Object value = controller.getValue();

                    byte[] byteData = buffer.toByteArray();
    private static void getDBDContent(Object value) throws IOException {
import org.jkiss.dbeaver.model.preferences.DBPPropertyManager;
                                getDBDContent(value);
import org.jkiss.dbeaver.model.DBPMessageType;
                        }
        if (data.length == 0) {
import org.eclipse.swt.widgets.Control;
                    return null;
                    DBDContentStorage storage = value.getContents(monitor);
                @Override
                                "Unexpected error while trying to open the selected value", e);
        super.contributeActions(manager, controller, activeEditor);
            } catch (Exception e) {
    public static IValueEditor openContentEditor(@NotNull IValueController controller)
            // Use string editor for cached content
    }
            log.warn("Can't extract CONTENT value information", e); //$NON-NLS-1$

        }
            log.error(ResultSetMessages.model_jdbc_bad_content_value_ + controller.getValue());

    }
        }
            return;
            });
        if (controller.getValue() instanceof DBDContent content) {
        if (data == null) {
                        }
                    }
import org.jkiss.dbeaver.model.DBPDataKind;
    }
            controller.showMessage(ResultSetMessages.model_jdbc_unsupported_content_value_type_, DBPMessageType.ERROR);
        }
                    }
import org.eclipse.core.filesystem.IFileStore;
        }
                    return new ContentInlineEditor(controller);
        if (saveFile == null) {
                    throw new InvocationTargetException(e);
        Shell shell = UIUtils.getShell(controller.getValueSite());
                });
                                if (streamEditor instanceof IStreamValueEditorPersistent svep) {
        }
                    DBWorkbench.getPlatformUI().showError("DBCException", "Error reading contents", e1);

        }
                            PROP_CATEGORY_CONTENT,
        contributeContentActions(manager, controller, activeEditor);
                            ContentUtils.copyStreams(inputStream, -1, buffer, monitor);
        final IValueEditor activeEditor
            } else {
                    }
import org.eclipse.core.runtime.CoreException;
                    propertySource.addProperty(
                        charset = DBValueFormatting.getDefaultBinaryFileEncoding(content.getDataSource());
        super.contributeProperties(propertySource, controller);
                }
        }
        }
        if (!(controller.getValue() instanceof DBDContent value)) {
            case EDITOR:
            return ContentEditor.openEditor(controller);
                    DBWorkbench.getPlatformUI().showError("IOException", "File exception while opening", e);
import org.jkiss.dbeaver.model.DBValueFormatting;
                    if (ContentUtils.isTextContent(value)) {
            if (!content.isNull()) {
                            byte[] bytes = str.getBytes(charset);
            return null;
                            if (activeEditor != null) {
                }
        Object value = controller.getValue();
    public void contributeActions(
import org.jkiss.dbeaver.model.data.storage.ExternalContentStorage;
            tmpFile.toFile().deleteOnExit();
                    ResultSetMessages.model_jdbc_could_not_save_content_to_file_ + saveFile.getAbsolutePath() + "'", //$NON-NLS-2$
            DBWorkbench.getPlatformUI().showError("Reading from content", "Error loading contents from file", e);
            case INLINE:
import org.jkiss.dbeaver.ui.data.IStreamValueEditor;
                        DBWorkbench.getPlatformUI().showError("Open content", "Error while trying to open the value", e);
                                    }
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                            }
    }
            fos.close();
            fos.write(data);
        }
                            boolean isExternalFileOpened = false;
                            ResultSetMessages.model_jdbc_content_length,
                value.updateContents(monitor, storage);
    private static boolean openExternalFile(@NotNull Path path) {
                        charset = storage.getCharset();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) throws DBCException {
import org.jkiss.dbeaver.model.exec.DBCException;
                }
            // delete the file when the user closes the DBeaver application
        try {
import org.jkiss.dbeaver.Log;
        } else if (value instanceof DBDContent) {
                        } catch (IOException e) {
import org.jkiss.dbeaver.ui.UIUtils;
                                }
                        log.error("Error while opening octet stream", e);
        final File saveFile = DialogUtils.selectFileForSave(shell, controller.getValueName());

    }

            if (RuntimeUtils.isWindows()) {
                    ResultSetMessages.model_jdbc_could_not_save_content,
                try {
                            openOctetStream(bytes);
                        try (InputStream cs = storage.getContentStream()) {
        UIUtils.runInUI(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), monitor -> {
 * limitations under the License.
                public boolean isEnabled() {
            if (value instanceof DBDContent content) {
 * Handle LOBs, LONGs and BINARY types.
/**
                    try {
                        if (activeEditor != null) {
                            DBWorkbench.getPlatformUI().showError("Data is empty", "Can not save null data value");
 * JDBC Content value handler.
        if (controller.getValueType().getDataKind() == DBPDataKind.STRING) {
import org.jkiss.dbeaver.ui.data.IValueController;
            // do nothing
            }
                propertySource.addProperty(
                            String charset = 
                            ContentUtils.saveContentToFile(
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
            manager.add(new Action("Open in external editor", DBeaverIcons.getImageDescriptor(UIIcon.FILE)) {

                                    DBValueFormatting.getDefaultBinaryFileEncoding(controller.getExecutionContext().getDataSource());
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
import org.jkiss.dbeaver.ui.data.IStreamValueEditorPersistent;
import org.eclipse.swt.widgets.Shell;
        }
        try {
        } catch (InvocationTargetException | InterruptedException e) {
        }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.data.IValueEditor;

                } catch (Exception e) {
    }
                long contentLength = content.getContentLength();
                    e.getTargetException());
    @Override

import org.jkiss.dbeaver.utils.ContentUtils;
 */
        if (openFile == null) {


        }
            return;
                            try {
        if (!(controller.getValue() instanceof DBDContent value)) {
            log.error(ResultSetMessages.model_jdbc_bad_content_value_ + controller.getValue());
    {
                    openOctetStream(byteData);
            DBWorkbench.getPlatformUI().showError("Open Content", "Raw value was null");
        final File openFile = DialogUtils.openFile(shell);
    public static final String PROP_CATEGORY_CONTENT = "CONTENT";
import org.eclipse.jface.action.Action;
            });
            }
 *
            log.info("file has no content");
import java.nio.file.Files;
        return new IValueController.EditType[] {IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
 *     http://www.apache.org/licenses/LICENSE-2.0
                        try (Reader cr = storage.getContentReader()) {
 *
                        if (value == null) {
                    storage = new ExternalContentStorage(DBWorkbench.getPlatform(), openFile.toPath(), GeneralUtils.UTF8_ENCODING);
                }
                            contentLength);
                            } catch (DBException e) {
                                    cr,
            UIUtils.runInProgressService(monitor -> {
                        DBWorkbench.getPlatformUI().showError("Error", 
    }
import org.jkiss.dbeaver.ui.ShellUtils;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                } catch (IOException e) {
import java.lang.reflect.InvocationTargetException;
                DBDContentStorage storage;
    ) {
                        }
            // String
    private static final Log log = Log.getLog(ContentValueManager.class);
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * You may obtain a copy of the License at

                                    Path externalFilePath = svep.getExternalFilePath(activeEditor.getControl());
                    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    }
                    } catch (IOException e) {
                                IStreamValueEditor<Control> streamEditor = ((ContentPanelEditor) activeEditor).getStreamEditor();
            return new TextViewDialog(controller);
 * See the License for the specific language governing permissions and
                                    GeneralUtils.UTF8_ENCODING,
                    } catch (CoreException e) {
                    try {
                                    monitor

            return false;
            });
                } else {

                        }
            return false;
            fos.close();
                                        isExternalFileOpened = openExternalFile(externalFilePath);
        return true;
                if (contentLength >= 0) {
                {
                manager.add(new Action(ResultSetMessages.model_jdbc_save_to_file_, DBeaverIcons.getImageDescriptor(UIIcon.SAVE_AS)) {
        OutputStream fos = Files.newOutputStream(tmpFile);
import org.eclipse.ui.PlatformUI;
    public IValueEditor createEditor(@NotNull final IValueController controller) throws DBException {
                public void run() {

        catch (InvocationTargetException e) {
        });
                    @Override
                        try (InputStream inputStream = storage.getContentStream()) {
                UIUtils.syncExec(() -> {
                controller.getExecutionContext().getDataSource().getContainer().getPreferenceStore().getString(ResultSetPreferences.RESULT_SET_BINARY_EDITOR_TYPE));
                @Override
                @Override
                // Open inline/panel editor
                @Override

                if (controller.getValueType().getDataKind() == DBPDataKind.STRING) {
        }
                    } catch (Exception e) {

                });
                    if (storage != null) {
        } else {
                throw new InvocationTargetException(e);
    {
                    if (loadFromFile(controller)) {
                }
                if (ContentUtils.isTextContent(value)) {
                        IFileStore store = EFS.getLocalFileSystem().getStore(tmpFile.toUri());
                }
                public void run() {
                    return !controller.isReadOnly();
 * DBeaver - Universal Database Manager
        @NotNull IContributionManager manager,
 * Licensed under the Apache License, Version 2.0 (the "License");
            case PANEL:
                        } else {
                    public void run() {
                        ContentUtils.isTextValue(((DBDContentCached) value).getCachedValue()))
        }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.editors.content.ContentEditor;
 *
                } else {
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        catch (Exception e) {
package org.jkiss.dbeaver.ui.data.managers;
    public void contributeProperties(@NotNull DBPPropertyManager propertySource, @NotNull IValueController controller) {
    public static void saveToFile(@NotNull IValueController controller)
                    } else {
import org.jkiss.dbeaver.ui.data.editors.ContentInlineEditor;
                        ResultSetMessages.model_jdbc_content_type,
                                DBWorkbench.getPlatformUI().showError("Load from file", "Error loading contents from file", e);
import java.io.*;


                }
                    return !controller.isReadOnly();
import org.jkiss.dbeaver.utils.GeneralUtils;
                            DBWorkbench.getPlatformUI().showError("IOException", "File exception", e);

    @Override
 *
                    storage = content.getContents(monitor);
                        }
    public static void contributeContentActions(

            fos.close();
        } else if (binaryEditType != IValueController.EditType.EDITOR && value instanceof DBDContentCached) {
    @NotNull
import org.jkiss.dbeaver.model.data.DBDContentCached;
        @Nullable IValueEditor activeEditor
            try {
                } else if (value instanceof DBDContentCached &&
    public static boolean loadFromFile(@NotNull IValueController controller) {
                        PROP_CATEGORY_CONTENT,
                            "content_length", //$NON-NLS-1$
import org.eclipse.ui.ide.IDE;
 */
                Object value = controller.getValue();
/*
import org.eclipse.core.filesystem.EFS;
 * you may not use this file except in compliance with the License.
                                            controller.getValue(), DBDDisplayFormat.EDIT);

            UIUtils.runInProgressService(monitor -> {
                            if (!isExternalFileOpened) {
                            String str = controller.getValueHandler()
            Object value = controller.getValue();
                public boolean isEnabled() {
                    content.getContentType());
        @NotNull final IValueController controller,
            manager.add(new Action(ResultSetMessages.model_jdbc_load_from_file_, DBeaverIcons.getImageDescriptor(UIIcon.LOAD)) {
                            }
import org.jkiss.dbeaver.model.data.DBDContent;
                String charset = null;
                controller.updateValue(value, true);

                    } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
                                    if (externalFilePath != null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
        switch (controller.getEditType()) {
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
                                activeEditor.primeEditorValue(controller.getValue());
public class ContentValueManager extends BaseValueManager {
        try {
import org.eclipse.jface.action.IContributionManager;
                    storage = new ExternalContentStorage(DBWorkbench.getPlatform(), openFile.toPath());
        Path tmpFile = Files.createTempFile("dbtmp", ".octet-stream");
    private static void openOctetStream(byte[] data) throws IOException {

            DBWorkbench.getPlatformUI().showError(
        Shell shell = UIUtils.getShell(controller.getValueSite());
                }
                            ContentUtils.saveContentToFile(cs, saveFile, monitor);
            Files.delete(tmpFile);
                        }
                                    .getValueDisplayString(controller.getValueType(), 
                } catch (DBCException e1) {
                }
                return new ContentPanelEditor(controller);
                            }
import java.nio.file.Path;
                ShellUtils.openExternalFile(tmpFile);
    @Override
            return;
        @NotNull final IValueController controller,
import org.jkiss.code.NotNull;
        catch (InterruptedException e) {
                    return new StringInlineEditor(controller);
                        IDE.openEditorOnFileStore(UIUtils.getActiveWorkbenchWindow().getActivePage(), store);
                DBDContentStorage storage;
                return openContentEditor(controller);
                                    saveFile,
    }
        }
    }
 * @author Serge Rider
                    }
                        if (value instanceof DBDContent) {
            return new TextViewDialog(controller);
                                    );
            }
    @Override
                    }
        IValueController.EditType binaryEditType = IValueController.EditType.valueOf(
    }
                return null;
    public IValueController.EditType[] getSupportedEditTypes() {
                try {
import org.jkiss.dbeaver.ui.data.editors.ContentPanelEditor;
