            setReturnCode(IDialogConstants.PROCEED_ID);
 */
import org.jkiss.dbeaver.ui.UIUtils;
            UIUtils.asyncExec(closeButton::setFocus);

    private static final String DIALOG_ID = "DBeaver.ViewSQLDialog";//$NON-NLS-1$
    @Override
    @Override

    public void setShowSaveButton(boolean showSaveButton)
        return wordWrap;
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Composite;
    {
        if (showOpenEditorButton) {
        } else {
    public void setWordWrap(boolean wordWrap) {
                    SQLEditorHandlerOpenEditor.openSQLConsole(
                {
        Control contents = super.createContents(parent);

                        text);
        this.contextProvider = contextProvider;
        if (enlargeViewPanel) {
    public void setShowOpenEditorButton(boolean showOpenEditorButton) {
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
            close();

import org.jkiss.dbeaver.model.DBPContextProvider;
    public void setEnlargeViewPanel(boolean enlargeViewPanel) {
            super.buttonPressed(buttonId);
        } else {
    private boolean wordWrap = false;
    public ViewSQLDialog(final IWorkbenchPartSite parentSite, @Nullable DBPContextProvider contextProvider, String title, @Nullable DBPImage image, String text)
        return contents;

    }
                        UIUtils.getActiveWorkbenchWindow(),

            createButton(parent, IDialogConstants.OPEN_ID, ResultSetMessages.dialog_text_view_open_editor, true);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
        Composite composite = super.createDialogArea(parent);
    private boolean enlargeViewPanel = true;
    }
 * You may obtain a copy of the License at
    }
            createCopyButton(parent);
    }
public class ViewSQLDialog extends BaseSQLDialog {

            gd.widthHint = 400;

import org.eclipse.jface.dialogs.IDialogSettings;
        }
            gd.heightHint = 400;
    private boolean showOpenEditorButton;
    protected IDialogSettings getDialogBoundsSettings()
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IWorkbenchPartSite;
        return text;
    public void setSQLText(String text) {
    protected DBCExecutionContext getExecutionContext() {
    }
        }
        return UIUtils.getDialogSettings(DIALOG_ID);
    protected boolean isWordWrap() {
    @Override
import org.jkiss.code.Nullable;
import org.eclipse.swt.widgets.Control;

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            );

    @Override
    }
        this.text = text;
                createCopyButton(parent);
    @Override
 *
        if (closeButton != null) {
    @Override
        this.wordWrap = wordWrap;
        Button closeButton = getButton(showSaveButton ? IDialogConstants.PROCEED_ID : IDialogConstants.OK_ID);
            String title = getTitle();
 *
/*
        GridData gd = (GridData) sqlPanel.getLayoutData();

                // Standard OK/Cancel
                super.createButtonsForButtonBar(parent);
    @Override

        Composite sqlPanel = createSQLPanel(composite);
            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    {
        this.showSaveButton = showSaveButton;
            gd.widthHint = 500;
}
    }
 * limitations under the License.
    }
    {
        return sqlPanel;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            String text = getText();
            } else {
        }
    }
        this.showOpenEditorButton = showOpenEditorButton;

    private DBPContextProvider contextProvider;
    }


    private boolean showSaveButton = false;
        return contextProvider.getExecutionContext();
    protected void createButtonsForButtonBar(Composite parent)
            UIUtils.asyncExec(() ->
    {
 * DBeaver - Universal Database Manager
        } else if (buttonId == IDialogConstants.PROCEED_ID) {

 * Unless required by applicable law or agreed to in writing, software
    {
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
    protected Control createContents(Composite parent) {

        super(parentSite, title, image);
        }
    private String text;
        this.text = text;
            if (isReadOnly()) {
        } else {
            createButton(parent, IDialogConstants.PROCEED_ID, SQLEditorMessages.dialog_view_sql_button_execute, true);
    protected String getSQLText()
            }
        if (showSaveButton) {
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
    @Override

import org.jkiss.dbeaver.model.DBPImage;
    protected Composite createDialogArea(Composite parent)
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        new SQLNavigatorContext(contextProvider.getExecutionContext()),
    }
import org.eclipse.swt.widgets.Button;
    {
            close();

                createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, true);
    }
import org.eclipse.jface.dialogs.IDialogConstants;
        if (buttonId == IDialogConstants.OPEN_ID) {

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

                        title,
    {
    }
    protected void buttonPressed(int buttonId)
            gd.heightHint = 100;
import org.eclipse.swt.layout.GridData;
        this.enlargeViewPanel = enlargeViewPanel;
    }
 * See the License for the specific language governing permissions and
