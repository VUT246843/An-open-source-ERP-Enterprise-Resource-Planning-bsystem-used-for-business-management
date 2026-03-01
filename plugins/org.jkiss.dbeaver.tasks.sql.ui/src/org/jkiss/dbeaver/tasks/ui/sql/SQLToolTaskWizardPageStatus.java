        console.setWaterMarks(1024 * 1024 * 3, 1024 * 1024 * 4);

    void clearLog() {
            try {
        public void setDocument(IDocument document) {
        if (getShell().isDisposed()) {
    private PrintStream writer;
            writer = new PrintStream(console.newMessageStream(), true);
        statusTable = new ObjectListControl<SQLToolStatistics>(partDivider, SWT.SHEET, new ListContentProvider()) {
import org.eclipse.swt.widgets.Composite;
                    setUser(false);
            @Override
            }
            return;
            protected DBPImage getObjectImage(SQLToolStatistics item) {
        return false;
            @Override
        statusTable.clearListData();
    public void appendLine(final String line) {
import java.io.PrintStream;
import org.eclipse.swt.layout.FillLayout;
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
        try {
        @Override
    PrintStream getLogWriter() {
    public boolean isPageApplicable() {
                    });
            }

}
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.text.IDocumentListener;
import java.util.Collection;


    private static final Log log = Log.getLog(SQLToolTaskWizardPageStatus.class);
            super(TasksSQLUIMessages.sql_tool_task_wizard_page_status_dummy_load_service_name);
    @Override
                return "SQLToolStatus." + getWizard().getTaskType().getId();
import org.eclipse.jface.text.IDocument;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        return true;
        }
package org.jkiss.dbeaver.tasks.ui.sql;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        }
            } catch (Throwable ex) {


 * limitations under the License.
 *
        };

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPImage;
            }

import org.eclipse.swt.custom.SashForm;
            @Override

import org.eclipse.osgi.util.NLS;
        }
import org.jkiss.dbeaver.ui.dialogs.IWizardPageNavigable;
    }
        }
        LogConsoleViewer(Composite composite) {
import org.eclipse.swt.SWT;
    }
            statusUpdateJob = new AbstractJob(TasksSQLUIMessages.sql_tool_task_wizard_page_status_update_job_name_update_tool) {
        }
            if (oldDocument != null) {
import org.eclipse.ui.console.MessageConsole;
    @Override
        }
                @NotNull
import org.eclipse.core.runtime.IStatus;
    private class DummyLoadService extends AbstractLoadService<Collection<SQLToolStatistics>> {
        }

                }
        @Override
                    setSystem(true);
        composite.setLayout(new FillLayout());
    }

    void addStatistics(DBPObject object, List<? extends SQLToolStatistics> statistics) {
 * Unless required by applicable law or agreed to in writing, software
    }
        console = new MessageConsole(TasksSQLUIMessages.sql_tool_task_wizard_page_status_message_console_name_tool_log, null);
        }
import org.jkiss.dbeaver.model.DBValueFormatting;

    public void createControl(Composite parent) {
                }
                    return Status.OK_STATUS;
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
import org.eclipse.core.runtime.Status;
 *
import org.eclipse.swt.layout.GridData;
        super.activatePage();
 *
                throw new InvocationTargetException(ex);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        public Collection<SQLToolStatistics> evaluate(@NotNull DBRProgressMonitor monitor)
import org.eclipse.jface.text.DocumentEvent;

            protected LoadingJob<Collection<SQLToolStatistics>> createLoadService(boolean forUpdate) {
        if (statusUpdateJob == null) {
            IDocument oldDocument = getDocument();
 * Copyright (C) 2010-2025 DBeaver Corp and others

        setTitle(TasksSQLUIMessages.sql_tool_task_wizard_page_status_title);
import org.jkiss.dbeaver.model.sql.task.SQLToolStatistics;
                    List<SQLToolStatistics> statsCopy;
        synchronized (toolStatistics) {
import java.util.Collections;
        setControl(composite);
    @Override
    private MessageConsole console;

                    UIUtils.asyncExec(() -> {
    }
        DummyLoadService() {
        @Override
            @NotNull
import java.nio.charset.StandardCharsets;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.tasks.ui.sql.internal.TasksSQLUIMessages;
import org.jkiss.dbeaver.Log;
            @Nullable
                @Override
        } catch (UnsupportedEncodingException e) {

import java.util.List;
            };
        }
                    new DummyLoadService(),
        public Object getFamily() {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
    }
            super(composite, console);
import org.jkiss.dbeaver.ui.navigator.itemlist.ObjectListControl;
        statusUpdateJob.schedule(100);
        LogConsoleViewer consoleViewer = new LogConsoleViewer(partDivider);
                return DBValueFormatting.getObjectImage(item.getObject());
    private class LogConsoleViewer extends TextConsoleViewer implements IDocumentListener {


 * See the License for the specific language governing permissions and
    private AbstractJob statusUpdateJob;
        partDivider.setSashWidth(5);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
                oldDocument.removeDocumentListener(this);
        public void documentChanged(DocumentEvent event) {
            writer = new PrintStream(console.newMessageStream(), true, StandardCharsets.UTF_8.name());
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

    }
            if (document != null) {
        }
import org.eclipse.ui.console.TextConsoleViewer;
            protected String getListConfigId(List<Class<?>> classList) {
        writer.flush();
            }
        super(TasksSQLUIMessages.sql_tool_task_wizard_page_status_name);
        public void documentAboutToBeChanged(DocumentEvent event) {
        return true;
        setTitle(NLS.bind(TasksSQLUIMessages.sql_tool_task_wizard_page_status_activate_page_title, getWizard().getTaskType().getName()));
    private final List<SQLToolStatistics> toolStatistics = new ArrayList<>();
        }

                        statusTable.appendListData(statsCopy);

 *     http://www.apache.org/licenses/LICENSE-2.0
        @Override
            }
                    synchronized (toolStatistics) {
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
                        SQLToolTaskWizardPageStatus.this.toolStatistics.clear();
    @Override
        @Override

            }
                        statsCopy = new ArrayList<>(SQLToolTaskWizardPageStatus.this.toolStatistics);

import org.jkiss.dbeaver.ui.LoadingJob;
        setDescription(TasksSQLUIMessages.sql_tool_task_wizard_page_status_description);
import org.jkiss.code.NotNull;

        SashForm partDivider = new SashForm(composite, SWT.VERTICAL);
                {
class SQLToolTaskWizardPageStatus extends ActiveWizardPage<SQLToolTaskWizard> implements IWizardPageNavigable {
        console.clearConsole();
    }
                document.addDocumentListener(this);
                        statusTable.repackColumns();
                return Collections.emptyList();

import org.jkiss.dbeaver.ui.UIUtils;
 */
import java.util.ArrayList;

    }
    public void activatePage() {
                return LoadingJob.createService(
        return writer;
            toolStatistics.addAll(statistics);
    SQLToolTaskWizardPageStatus(SQLToolTaskWizard wizard) {
            throws InvocationTargetException, InterruptedException {
            revealEndOfDocument();

                    new ObjectsLoadVisualizer());
                    }
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        Composite composite = new Composite(parent, SWT.BORDER);
    public boolean isPageComplete() {
    }
/*
            super.setDocument(document);

            return getWizard().getTaskType();
    private ObjectListControl<SQLToolStatistics> statusTable;
import org.jkiss.dbeaver.model.DBPObject;
    @Override
        writer.print(line + "\n");
    public boolean isPageNavigable() {
import java.io.UnsupportedEncodingException;

