import org.eclipse.swt.events.ModifyListener;

    {
    
    public static File openFile(Shell parentShell, String[] filterExt)
        FileDialog fileDialog = new FileDialog(parentShell, SWT.OPEN);
        }
    private static final Log log = Log.getLog(DialogUtils.class);
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
            fileDialog.setFileName(fileName);
        return selectFileForSave(parentShell, title, filterExt, null, fileName);
        if (title != null) {
import org.eclipse.jface.viewers.TreeViewer;


        File filterPath = new File(fileDialog.getFilterPath());
 *
        return directory;
                    fileName = pathNode == null ? null :
        }
        final File loadFile = new File(fileName);
        return filteredTree.getViewer();
            protected boolean isFolderContents() {
        fileDialog.setText(title);

        return createOutputFolderChooser(parent, label, null, project, multiFS, changeListener);
        dialog.setMessage("Choose target directory");
        boolean multiFS,
        if (CommonUtils.isBitSet(dialog.getStyle(), SWT.SAVE) && new File(filePath).getName().indexOf('.') < 0 && RuntimeUtils.isWindows()) {
        }
                if (fileName != null) {
        return Arrays.stream(fileNames).map(fn -> new File(filterPath, fn)).toArray(File[]::new);
        if (CommonUtils.isEmpty(fileName)) {
    @Nullable
        @Nullable ModifyListener changeListener
 * See the License for the specific language governing permissions and
        curDialogFolder = DBWorkbench.getPlatform().getPreferenceStore().getString(DIALOG_FOLDER_PROPERTY);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        };
        fileDialog.setOverwrite(true);
        UIUtils.createControlLabel(parent, message).setToolTipText(tooltip);
    }
        FileDialog fileDialog = new FileDialog(parentShell, SWT.SAVE);
    }
                if (remoteFS && project != null) {
        if (CommonUtils.isEmpty(curDialogFolder)) {
            dialog.setFilterPath(directory);
            DBWorkbench.getPlatformUI().showError("Bad file name", "Directory '" + saveDir.getAbsolutePath() + "' does not exists");
        if (directory != null) {
        }
        }
        return saveFile;
    @Nullable
    }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                return true;
            return null;
        directoryText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
    public static String getCurDialogFolder()

        return directoryText.getTextControl();
    public static Text createOutputFolderChooser(final Composite parent, @Nullable String label, @Nullable DBPProject project, boolean multiFS, @Nullable ModifyListener changeListener) {
    {
        @Nullable String value,

        }
import org.jkiss.dbeaver.ui.internal.UIMessages;
 */
    }
 *
    ) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

 * DBeaver - Universal Database Manager
        if (filterExt != null) {

                }
            final String[] filters = dialog.getFilterExtensions();
        return selectFileForSave(parentShell, "Save Content As", null, valueName);
 * DialogUtils
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
    @NotNull
    @NotNull

    public static String openFileDialog(FileDialog fileDialog)

            @Override
        DialogUtils.curDialogFolder = curDialogFolder;
            fileDialog.setFilterExtensions(filterExt);

    {

    {
                    DBNPathBase pathNode = DBWorkbench.getPlatformUI().openFileSystemSelector(
        String filePath = fileDialog.open();
                String fileName;
import org.eclipse.swt.widgets.*;

            filteredTree.setInitialText(initialText);
            fileDialog.setFilterExtensions(filterExt);
    {
            curDialogFolder = RuntimeUtils.getUserHomeDir().getAbsolutePath();
        final File saveFile = new File(fileName);
        final String message = label != null ? label : UIMessages.output_label_directory;
        String fileName = openFileDialog(fileDialog);
            }
                    }
        if (value != null) {
            filePath = fixMissingFileExtension(fileDialog, filePath);
        if (filterNames != null) {
        if (filterExt != null) {
            fileDialog.setFilterNames(filterNames);
    public static final String APPLY_AND_CLOSE_BUTTON_LABEL = JFaceResources.getString("PreferencesDialog.okButtonLabel");
                }
        @Nullable String label,
    }
            }
        }
        dialog.setText(message);
    public static File selectFileForSave(Shell parentShell, String valueName)
package org.jkiss.dbeaver.ui.dialogs;
        return filePath;
            public DBPProject getProject() {

                        DBFUtils.convertPathToString(pathNode.getPath());
        String fileName = openFileDialog(fileDialog);
    public static String openDirectoryDialog(@NotNull Shell shell, @NotNull String message, @Nullable String directory) {
 *
import org.jkiss.dbeaver.Log;
            protected void openBrowser(boolean remoteFS) {
        final TextWithOpen directoryText = new TextWithOpen(parent, multiFS) {
                return project;
    }
        }
            directoryText.getTextControl().setText(value);
        @Nullable DBPProject project,
    public static Text createOutputFolderChooser(final Composite parent, @Nullable String label, @Nullable String value, @Nullable DBPProject project, boolean multiFS, @Nullable ModifyListener changeListener) {
        return filePath;
import org.eclipse.swt.SWT;
import org.jkiss.code.Nullable;
 * limitations under the License.
    @NotNull
import org.jkiss.utils.CommonUtils;
            fileDialog.setFilterPath(curDialogFolder);

    public static File selectFileForSave(@NotNull Shell parentShell, @NotNull String title, @Nullable String[] filterExt, @Nullable String[] filterNames, @Nullable String fileName) {
        if (CommonUtils.isEmpty(directory)) {


            aMessageBox.setMessage("The file "+ loadFile.getAbsolutePath() + " doesn't exists.");
        @Nullable String tooltip,
        if (initialText != null) {
    public static void setCurDialogFolder(String curDialogFolder)
            }
import java.io.File;
        FileDialog fileDialog = new FileDialog(parentShell, SWT.OPEN | SWT.MULTI);
        return curDialogFolder;
 * you may not use this file except in compliance with the License.

            multiFS = project != null && DBFUtils.supportsMultiFileSystems(project);
                        true, SWT.SAVE, false, null, getText());
    }
    }
    /* SWT 2021-06-02 bug: file extension is not appended on Windows */
        FilteredTree filteredTree = new FilteredTree(parent, treeStyle, filter, true, true);
            aMessageBox.setText("File doesn't exists");
        if (multiFS) {
            directoryText.getTextControl().addModifyListener(changeListener);
import java.util.Arrays;
            directory = curDialogFolder;
        }
 */
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;

                if (!filter.equals("*") && !filter.equals("*.*") && filter.indexOf('.') >= 0) {
import org.jkiss.code.NotNull;
                    return filePath + filter.substring(filter.lastIndexOf('.'));
    private static String fixMissingFileExtension(@NotNull FileDialog dialog, @NotNull String filePath) {

        return loadFile;
        }
            if (dialog.getFilterIndex() >= 0 && dialog.getFilterIndex() < filters.length) {
            @Override
import org.jkiss.dbeaver.ui.UIUtils;
    @NotNull
import org.eclipse.swt.layout.GridData;
        @NotNull Composite parent,
                } else {
                    if (fileName != null) {
        return createOutputFolderChooser(parent, label, null, value, project, multiFS, changeListener);
    }
    private static final String DIALOG_FOLDER_PROPERTY = "dialog.default.folder";
        }
import org.eclipse.jface.resource.JFaceResources;
        }
            return null;

    }
            aMessageBox.open();
                final String filter = filters[dialog.getFilterIndex()];
            return null;
    {
        if (changeListener != null) {
    {
    static {
        }
        if (curDialogFolder != null) {
    public static File selectFileForSave(@NotNull Shell parentShell, @NotNull String title, @Nullable String[] filterExt, @Nullable String fileName) {
    }
        if (!CommonUtils.isEmpty(directory)) {
        if (filterExt != null) {
                        CommonUtils.toString(label, "Output folder"),
        if (!saveDir.exists()) {
            setCurDialogFolder(fileDialog.getFilterPath());
        }
    @Nullable
        if (!CommonUtils.isEmpty(filePath)) {
            @Override
                    fileName = openDirectoryDialog(parent.getShell(), message, getText());
    public static TreeViewer createFilteredTree(Composite parent, int treeStyle, PatternFilter filter, String initialText) {
            }
import org.jkiss.dbeaver.model.app.DBPProject;

/*
                }
        if (!loadFile.exists()) {
        }
        if (CommonUtils.isEmpty(fileName)) {
import org.eclipse.ui.dialogs.PatternFilter;
import org.jkiss.dbeaver.model.fs.DBFUtils;
        final DirectoryDialog dialog = new DirectoryDialog(shell);
        }
    }

        String[] fileNames = fileDialog.getFileNames();
            return null;
        File saveDir = saveFile.getParentFile();
            fileDialog.setText(title);
import org.jkiss.dbeaver.ui.controls.TextWithOpen;
    public static String curDialogFolder;
        fileName = openFileDialog(fileDialog);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static File openFile(Shell parentShell)


            fileDialog.setFilterExtensions(filterExt);
        }
        directory = dialog.open();
    public static File[] openFileList(Shell parentShell, String title, String[] filterExt)
            setCurDialogFolder(directory);
}
import org.eclipse.ui.dialogs.FilteredTree;
        DBWorkbench.getPlatform().getPreferenceStore().setValue(DIALOG_FOLDER_PROPERTY, curDialogFolder);

            return null;
 * Unless required by applicable law or agreed to in writing, software
        if (fileName != null) {
    }
    public static Text createOutputFolderChooser(

                        setText(fileName);
/**
                    setText(fileName);
public class DialogUtils {
            MessageBox aMessageBox = new MessageBox(parentShell, SWT.ICON_WARNING | SWT.OK);
        return openFile(parentShell, null);
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
        if (CommonUtils.isEmpty(fileName)) {
