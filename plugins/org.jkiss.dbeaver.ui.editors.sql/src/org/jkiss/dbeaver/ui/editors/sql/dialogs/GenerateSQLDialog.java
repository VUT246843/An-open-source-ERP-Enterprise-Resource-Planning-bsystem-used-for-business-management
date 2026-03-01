            if (sql.length() > lineSeparator.length()) {
        GridData gd = new GridData(GridData.FILL_BOTH);
                    return GeneralUtils.makeExceptionStatus(e);
    protected DBCExecutionContext getExecutionContext() {
    protected String getSQLText()

        });
            {
    }
                sql.append(line).append(scriptDelimiter);
    }
                        }
import org.jkiss.dbeaver.model.DBPImage;
            }
    };
                        try (DBCStatement statement = DBUtils.makeStatement(session, line, false)) {
    {
            StringBuilder sql = new StringBuilder(scriptLines.length * 64);
    protected void buttonPressed(int buttonId)
    }
    private final DBCExecutionContext executionContext;
            String[] scriptLines = generateSQLScript();
 * limitations under the License.
            updateSQL();
                        onSuccess.run();

    public GenerateSQLDialog(IWorkbenchPartSite parentSite, DBCExecutionContext executionContext, String title, @Nullable DBPImage image)
                } catch (DBException e) {
    {
        final String jobName = getShell().getText();
    }
 * DBeaver - Universal Database Manager
        createControls(controlsPanel);
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
        {
        public void widgetSelected(SelectionEvent e)
                if (event.getResult().isOK()) {
 */
            @Override
            close();
    protected SelectionListener SQL_CHANGE_LISTENER = new SelectionAdapter() {

        Composite composite = super.createDialogArea(parent);
    @Override
        Label divLabel = new Label(controlsPanel, SWT.SEPARATOR | SWT.HORIZONTAL);
            protected IStatus run(@NotNull DBRProgressMonitor monitor)
                sql.setLength(sql.length() - lineSeparator.length());
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            return sql.toString();
 * you may not use this file except in compliance with the License.

    protected Composite createDialogArea(Composite parent)
            public void done(IJobChangeEvent event)
        super(parentSite, title, image);
            }
    protected void executeSQL()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        //gd.heightHint = 300;

 *
    {
import org.eclipse.swt.events.SelectionAdapter;
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.core.runtime.IStatus;
        }
import org.eclipse.swt.SWT;
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBPDataSource dataSource = executionContext.getDataSource();
            @NotNull
                }
                try (DBCSession session = getExecutionContext().openSession(monitor, DBCExecutionPurpose.UTIL, jobName)) {
            }
        this.executionContext = executionContext;
    protected abstract String[] generateSQLScript();
        createCopyButton(parent);
        return composite;

    protected abstract void createControls(Composite parent);
        this.onSuccess = onSuccess;
            for (String line : scriptLines) {
                    }
import org.jkiss.dbeaver.model.DBUtils;
    }
                            statement.executeStatement();
import org.eclipse.ui.IWorkbenchPartSite;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,


        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            @Override
        job.schedule();
import org.jkiss.code.Nullable;
        final String[] scriptLines = generateSQLScript();
import org.eclipse.jface.dialogs.IDialogConstants;
    protected void createButtonsForButtonBar(Composite parent)
            String lineSeparator = GeneralUtils.getDefaultLineSeparator();
 * See the License for the specific language governing permissions and
        job.addJobChangeListener(new JobChangeAdapter() {
    protected boolean isWordWrap()
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.SelectionEvent;


                    for (String line : scriptLines) {
import org.jkiss.dbeaver.DBException;
        if (buttonId == IDialogConstants.OK_ID) {

import org.jkiss.dbeaver.ui.UIUtils;
            {
import org.jkiss.dbeaver.model.exec.DBCStatement;
    {
import org.eclipse.swt.layout.GridData;
        {
    }
        return true;
        DataSourceJob job = new DataSourceJob(jobName, executionContext) {
import org.eclipse.core.runtime.Status;

import org.jkiss.dbeaver.model.DBPDataSource;

    }
    @Override
    {
        Composite controlsPanel = UIUtils.createPlaceholder(composite, 1, 5);
    @Override
            executeSQL();
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 * You may obtain a copy of the License at

    public void setOnSuccess(Runnable onSuccess)
                return Status.OK_STATUS;
            super.buttonPressed(buttonId);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
 *
            String scriptDelimiter =  SQLUtils.getDefaultScriptDelimiter(sqlDialect) + lineSeparator;
    @Override
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
            }
    }
import org.eclipse.swt.widgets.Label;
        return executionContext;
        } else {


}        @Override
import org.eclipse.swt.widgets.Composite;
 * Licensed under the Apache License, Version 2.0 (the "License");
            setReturnCode(IDialogConstants.OK_ID);
        };
        controlsPanel.setLayoutData(gd);
    {
    }

        }
        createSQLPanel(controlsPanel);
                    }
    private Runnable onSuccess;
            // Cut last line separator
 *
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
import org.jkiss.dbeaver.model.sql.SQLUtils;
        }
public abstract class GenerateSQLDialog extends BaseSQLDialog {
    {
            SQLDialect sqlDialect = dataSource.getSQLDialect();

                }
    {
    @Override
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    if (onSuccess != null) {
        divLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
 * Unless required by applicable law or agreed to in writing, software
