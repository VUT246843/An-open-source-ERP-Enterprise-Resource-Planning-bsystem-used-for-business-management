
        if (sqlViewer != null && sqlViewer.getTextViewer() != null && sqlViewer.getTextViewer().getDocument() != null) {
        if (isLabelVisible()) {
        DBCExecutionContext executionContext = getExecutionContext();
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
            public DBCExecutionContext getExecutionContext() {

        sqlViewer.createPartControl(editorPH);
            protected boolean isAnnotationRulerVisible() {
            } catch (Exception e) {
    protected abstract DBCExecutionContext getExecutionContext();

        return super.close();

    protected boolean isWordWrap() {
        Composite panel = UIUtils.createPlaceholder(parent, 1);
            @NotNull
    }
        if (sqlViewer != null) {
        }
    }
            }
import org.eclipse.swt.layout.GridData;
                log.debug("Error disposing embedded SQL editor", e);
        } else {

        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public void setReadOnly(boolean readOnly) {
import org.eclipse.ui.IWorkbenchPartSite;
            sqlInput.setText(sqlViewer.getTextViewer().getDocument().get());
        GridData gd = new GridData(GridData.FILL_BOTH);
 *
            UIUtils.createControlLabel(panel, SQLEditorMessages.pref_page_sql_format_label_SQLPreview);
        if (isWordWrap()) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public BaseSQLDialog(final Shell shell, final IWorkbenchPartSite parentSite, String title, @Nullable DBPImage image)
 */
            public SQLDialect getSQLDialect() {


            return executionContext.getDataSource().getSQLDialect();
public abstract class BaseSQLDialog extends BaseDialog {
    protected boolean isLabelVisible() {
            @Nullable

    {
    public boolean close() {


    private final StringEditorInput sqlInput;
        sqlViewer.reloadSyntaxRules();


 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    }
            @Override
            try {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;


                return BaseSQLDialog.this.getSQLDialect();
    }
    {
    protected Composite createSQLPanel(Composite parent)

        super.okPressed();
        gd.minimumWidth = 100;
        updateSQL();
 *
        gd.horizontalSpan = 1;
    private SQLEditorBase sqlViewer;
 * Licensed under the Apache License, Version 2.0 (the "License");


    {
        return BasicSQLDialect.INSTANCE;
    protected void createRefreshButton(Composite parent) {
            if (text instanceof StyledText) {
    @Override
import org.jkiss.code.NotNull;
    public boolean isReadOnly() {
import org.eclipse.swt.dnd.TextTransfer;
        }
    }
    protected void updateSQL()

    @Override
        UIUtils.asyncExec(editorPH::layout);
    }
                ((StyledText) text).setWordWrap(true);

        try {
        };
 *
            }
        this.sqlInput = new StringEditorInput(title, "", true, GeneralUtils.getDefaultFileEncoding());
            saveToClipboard();
import org.jkiss.dbeaver.ui.UIUtils;
    }
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
        if (buttonId == IDialogConstants.DETAILS_ID) {

        gd.minimumHeight = 100;
        } catch (PartInitException e) {
    }
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
            }
            sqlViewer.reloadSyntaxRules();
        return true;
    protected SQLDialect getSQLDialect() {
    protected abstract String getSQLText();

 * Unless required by applicable law or agreed to in writing, software
            }
    {
import org.jkiss.dbeaver.model.sql.SQLDialect;
        if (executionContext != null) {
    }
        }
        }
        sqlInput.setReadOnly(readOnly);
import org.eclipse.ui.PartInitException;
            } else {
                sqlViewer.init(subSite, sqlInput);
        return false;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
import org.jkiss.dbeaver.model.DBPImage;
    }
    }
        }
    protected void okPressed() {
        return panel;
                sqlViewer.dispose();
    public BaseSQLDialog(final IWorkbenchPartSite parentSite, String title, @Nullable DBPImage image) {
        Composite editorPH = new Composite(panel, SWT.NONE);

            DBWorkbench.getPlatformUI().showError(getShell().getText(), null, e);
 * See the License for the specific language governing permissions and
    protected void createCopyButton(Composite parent) {
        super(shell, title, image);
/*
 * DBeaver - Universal Database Manager
    }
import org.eclipse.swt.layout.FillLayout;
        editorPH.setLayoutData(gd);
import org.eclipse.jface.dialogs.IDialogConstants;


        createButton(parent, IDialogConstants.DETAILS_ID, SQLEditorMessages.dialog_view_sql_button_copy, false);
        gd.verticalIndent = 3;
            Object text = sqlViewer.getAdapter(Control.class);
            this.sqlInput.setText(getSQLText());
import org.eclipse.swt.widgets.Composite;
        createButton(parent, IDialogConstants.RETRY_ID, SQLEditorMessages.dialog_view_sql_button_refresh, false);
        this(parentSite.getShell(), parentSite, title, image);
            @Override
 * you may not use this file except in compliance with the License.
    {
                return BaseSQLDialog.this.getExecutionContext();
        sqlViewer = new SQLEditorBase() {
            super.buttonPressed(buttonId);
 * limitations under the License.
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
            }
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
import org.jkiss.dbeaver.Log;
    
                sqlViewer.setInput(sqlInput);
    }
import org.eclipse.swt.custom.StyledText;
import org.jkiss.code.Nullable;
        CharSequence text = getSQLText();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    protected void saveToClipboard()
        this.subSite = new SubEditorSite(parentSite);



        editorPH.setLayout(new FillLayout());
}        return sqlInput.getBuffer().toString();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
                return false;
//        new Label(panel, SWT.SEPARATOR | SWT.HORIZONTAL).setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    public String getText() {
import org.eclipse.ui.IEditorSite;
    protected void buttonPressed(int buttonId)
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    private static final Log log = Log.getLog(BaseSQLDialog.class);
    @Override
        return sqlInput.isReadOnly();
            super.buttonPressed(IDialogConstants.CANCEL_ID);
import org.jkiss.dbeaver.utils.GeneralUtils;
            if (sqlViewer.getSite() != null) {
import org.eclipse.swt.widgets.Control;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        UIUtils.setClipboardContents(getShell().getDisplay(), TextTransfer.getInstance(), text);
            @Override
    }
    private final IEditorSite subSite;
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
