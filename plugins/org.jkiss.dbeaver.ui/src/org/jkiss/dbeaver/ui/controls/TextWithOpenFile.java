    public TextWithOpenFile(Composite parent, String title, String[] filterExt, boolean binary, boolean secured) {
                filterExt,
                title,
    }

import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
    private String[] filterExt;
        this.openFolder = openFolder;
 * You may obtain a copy of the License at
    }
        this.style = style;
                getText());
    private String getDialogDirectory() {
 */
        }
        if (selected != null) {
    }
        if (remoteFS) {
                if (title != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                if (directory != null) {

 * you may not use this file except in compliance with the License.
    }

        this.title = title;
                    byte[] bytes = Files.readAllBytes(filePath);
                }
                DirectoryDialog fd = new DirectoryDialog(getPanel().getShell(), style);
        String selected;
            DBNPathBase selPath = DBWorkbench.getPlatformUI().openFileSystemSelector(


                FileDialog fd = new FileDialog(getPanel().getShell(), style);
    protected int getPanelStyle() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        } else {


import org.jkiss.utils.CommonUtils;
        }
            }

    protected boolean isFolderContents() {
 * Styles: SWT.SAVE, SWT.OPEN, SWT.SINGLE
/**
                } else {
            Path filePath = IOUtils.getPathFromString(selected);

 * limitations under the License.
public class TextWithOpenFile extends TextWithOpen {
    private final int style;
                if (isBinaryContents()) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
    public TextWithOpenFile(Composite parent, String title, String[] filterExt) {
        super(parent, multiFS, secured, binary);
import org.eclipse.swt.widgets.FileDialog;
import java.nio.file.InvalidPathException;
        if (CommonUtils.isEmptyTrimmed(text)) {
    @Override
        this(parent, title, filterExt, SWT.SINGLE | SWT.OPEN, binary);
    private final String title;
    @Override
                if (directory != null) {
package org.jkiss.dbeaver.ui.controls;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return style;
                    fd.setText(title);
import java.nio.file.Files;
                selected = DialogUtils.openFileDialog(fd);
            String directory = getDialogDirectory();
        try {
            return null;
                openFolder,
                    DialogUtils.setCurDialogFolder(directory);
            } else {
                style,
        if (selected != null && isShowFileContentEditor()) {
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
    public TextWithOpenFile(Composite parent, String title, String[] filterExt, boolean binary) {
 *
    }
import org.eclipse.swt.SWT;
                return dirPath;
                DBWorkbench.getPlatformUI().showError("File read error", "Can't read file '" + filePath + "' contents", e);
                selected = fd.open();
            setText(selected);
            } catch (IOException e) {
            try {

    public void setOpenFolder(boolean openFolder) {
                    selected = Files.readString(filePath);
import org.eclipse.swt.widgets.Composite;
        }
    }
            }
        return null;
                fd.setText(title);
    protected void openBrowser(boolean remoteFS) {

                }
        }
        this(parent, title, filterExt, SWT.SINGLE | SWT.OPEN, false);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.DirectoryDialog;
        }
                fd.setFilterExtensions(filterExt);
 * See the License for the specific language governing permissions and
    }
        this.filterExt = filterExtensions;
import java.nio.file.Path;
 */
        this(parent, title, filterExt, style, binary, false, false);
import org.jkiss.code.NotNull;
import java.io.IOException;
}                    fd.setFilterPath(directory);
            selected = selPath != null ? DBFUtils.convertPathToString(selPath.getPath()) : null;
    public void setFilterExtensions(@NotNull String[] filterExtensions) {
        this(parent, title, filterExt, SWT.SINGLE | SWT.OPEN, binary, false, secured);

    }
                }
import java.util.Base64;

 *
            }
            String dirPath = IOUtils.getDirectoryPath(text);
    }
    public TextWithOpenFile(Composite parent, String title, String[] filterExt, int style, boolean binary) {
    }

            if (openFolder) {
import org.jkiss.utils.IOUtils;
    public TextWithOpenFile(Composite parent, String title, String[] filterExt, int style, boolean binary, boolean multiFS, boolean secured) {
                    selected = Base64.getEncoder().encodeToString(bytes);
                isBinaryContents(),
 * DBeaver - Universal Database Manager

        return openFolder;
        this.filterExt = filterExt;
        } catch (InvalidPathException ignored) {
            if (CommonUtils.isNotEmpty(dirPath)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
    
/*
 * TextWithOpen.
        final String text = getText();
import org.jkiss.dbeaver.model.fs.DBFUtils;
    private boolean openFolder = false;
 * Unless required by applicable law or agreed to in writing, software
