    protected boolean isShowFileContentEditor() {
    public Text getTextControl() {
    protected boolean isFolderContents() {
        this(parent, multiFS, false);
        panel = new Composite(parent, SWT.NONE);
import org.eclipse.swt.events.SelectionEvent;
                toolItem.setImage(DBeaverIcons.getImage(UIIcon.OPEN));
            });
import org.eclipse.swt.SWT;
            });
    }
    private final Text text;
    }
        boolean useTextEditor = isShowFileContentEditor();
        toolbar.setEnabled(enabled);
import org.eclipse.swt.widgets.*;
                    }
            {
                });
    }
        toolbar.setLayoutData(gd);

            toolItem.setToolTipText(secured ? UIMessages.text_with_open_dialog_set_text : UIMessages.text_with_open_dialog_edit_text);
import org.eclipse.swt.events.SelectionAdapter;


        return toolbar;
        panel.setLayout(gl);
                final ToolItem remoteFsItem = new ToolItem(toolbar, SWT.NONE);
                    public void widgetSelected(SelectionEvent e) {
                remoteFsItem.setImage(DBeaverIcons.getImage(
 * Unless required by applicable law or agreed to in writing, software
    public void setToolTipText(String toolTip) {
 * limitations under the License.
    public void setText(String str) {
    }
    protected boolean isBinaryContents() {
        text.setLayoutData(gd);
    }
        this.multiFS = multiFS;

} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return binary;
import org.jkiss.dbeaver.ui.UIIcon;
    private final ToolBar toolbar;
                    @Override

                remoteFsItem.addSelectionListener(new SelectionAdapter() {
        return panel.getParent();
    private final boolean binary;
        return false;
    public Shell getShell() {
    }
    }



package org.jkiss.dbeaver.ui.controls;
                        openBrowser(false);
 */
                // Local FS works only on local machine. Will not work for TE remote tasks.

            secured ? UIMessages.text_with_open_dialog_set_text : UIMessages.text_with_open_dialog_edit_text,
                    } catch (Exception ex) {

                    String filePath = TextWithOpen.this.text.getText();
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
            editItem.setEnabled(false);
        gl.marginWidth = 0;
                    } else {
        return false;

import org.eclipse.core.filesystem.IFileStore;

    }
     */
        }
    }
                remoteFsItem.setToolTipText(UIMessages.text_with_open_dialog_browse_remote);
    private static final Log log = Log.getLog(TextWithOpen.class);
        }
        text = new Text(panel, SWT.BORDER | ((useTextEditor && !secured) ? SWT.MULTI | SWT.V_SCROLL : SWT.SINGLE));
            secured ? "" : getText()
import org.jkiss.dbeaver.ui.DBeaverIcons;
    protected void openBrowser(boolean remoteFS) {
    public TextWithOpen(Composite parent, boolean multiFS) {
        gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_CENTER);
import java.nio.file.Files;
        gl.marginHeight = 0;
            TextWithOpen.this.text.addModifyListener(e -> {
                        openBrowser(true);
     * Sets tooltip for text and panel
        {
                    public void widgetSelected(SelectionEvent e) {

    public ToolBar getToolbar() {
                }
                Path targetFile;

            panel.getShell(),
        gl.verticalSpacing = 0;
import org.jkiss.code.Nullable;
public class TextWithOpen {
 * Licensed under the Apache License, Version 2.0 (the "License");
            gd.widthHint = 300;
        }
                toolItem.addSelectionListener(new SelectionAdapter() {
        this.binary = binary;
    protected final Composite panel;
    public void setEnabled(boolean enabled) {
            });
    public boolean isMultiFileSystem() {
            gd.heightHint = text.getLineHeight() * (secured ? 1 : 2);

        this(parent, multiFS, secured, false);
            }
        if (!useTextEditor && !isBinaryContents() && !isFolderContents()) {
            if (isMultiFileSystem()) {
                toolItem.setToolTipText(UIMessages.text_with_open_dialog_browse);
                    }
                    @Override
        return EditTextDialog.editText(
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        final GridLayout gl = new GridLayout(2, false);
                    IFileStore store = EFS.getLocalFileSystem().getStore(Path.of(filePath).toUri());
/**
        return text.getText();
                @Override
                }
        if (useTextEditor) {
import java.nio.file.Path;
        }
    public TextWithOpen(Composite parent, boolean multiFS, boolean secured) {

                    try {

        return panel.getShell();
import org.eclipse.core.filesystem.EFS;
                        DBWorkbench.getPlatformUI().showError("File open error", null, ex);
        this.text.setToolTipText(toolTip);
        text.setText(str);
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;

        gl.horizontalSpacing = 0;

                public void widgetSelected(SelectionEvent e) {
        panel.setLayoutData(data);
    /**
    @Nullable
    public TextWithOpen(Composite parent, boolean multiFS, boolean secured, boolean binary) {

            editItem.setImage(DBeaverIcons.getImage(UIIcon.EDIT));
                        editItem.setEnabled(Files.exists(targetFile) && !Files.isDirectory(targetFile));
                    String newText = getNewTextFromUser(secured);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;
                    if (newText != null) {
    }
    }
    }
                        targetFile = Path.of(fileName);
            editItem.setToolTipText(UIMessages.text_with_open_dialog_edit_file);
            }
    public DBPProject getProject() {

    }
                        editItem.setEnabled(false);
import org.jkiss.utils.IOUtils;
        } else {
            text.setEchoChar('*');
import org.eclipse.swt.layout.GridData;
        if (useTextEditor) {
                } catch (Exception ex) {
    /**
 */
            gd.widthHint = 200;
import org.eclipse.swt.layout.GridLayout;
                        IDE.openEditorOnFileStore(UIUtils.getActiveWorkbenchWindow().getActivePage(), store);
    }
                    }


    private final boolean multiFS;
        );
import org.jkiss.dbeaver.model.app.DBPProject;
    public String getText() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
    protected int getPanelStyle() {
     * Sets panel layout data


    }

        return null;
 *
            toolItem.setImage(DBeaverIcons.getImage(UIIcon.TEXTFIELD));
 * See the License for the specific language governing permissions and
        text.setEnabled(enabled);
        return SWT.OPEN;
                try {
                // Do we need to do anything about it in UI?
    }
            final ToolItem editItem = new ToolItem(toolbar, SWT.NONE);
 * DBeaver - Universal Database Manager
                        setText(newText);
                }
import org.eclipse.ui.ide.IDE;
        toolbar = new ToolBar(panel, SWT.FLAT);
                    log.debug("Error getting file info: " + ex.getMessage());
                @Override
                });
    public Composite getParent() {
                String fileName = TextWithOpen.this.text.getText().trim();
    }

            final ToolItem toolItem = new ToolItem(toolbar, SWT.NONE);
 * you may not use this file except in compliance with the License.
        this.panel.setToolTipText(toolTip);
    protected String getNewTextFromUser(boolean secured) {
        return panel;
 * TextWithOpen
        return multiFS;
        panel.setEnabled(enabled);

    }
                public void widgetSelected(SelectionEvent e) {
 *
    public void setLayoutData(Object data) {
            // We use width hint to avoid infinite text control expansion if predefined text is too long
        GridData gd = new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_CENTER);
                    (getPanelStyle() & SWT.OPEN) != 0 ? UIIcon.OPEN_EXTERNAL : UIIcon.SAVE_EXTERNAL));
    public Composite getPanel() {
        return text;
        if (secured) {
                    editItem.setEnabled(false);
            // Open file text in embedded editor
    }
import org.jkiss.dbeaver.ui.internal.UIMessages;
            toolItem.addSelectionListener(new SelectionAdapter() {
 *
            editItem.addSelectionListener(new SelectionAdapter() {
                final ToolItem toolItem = new ToolItem(toolbar, SWT.NONE);

    }
                    if (!IOUtils.isLocalFile(fileName)) {
                    }
import org.jkiss.dbeaver.ui.UIUtils;
                    }
     */
        }
