                UIUtils.asyncExec(() -> scriptListener.beginScriptProcessing(curJob, objects));
                                monitor.beginTask("Refresh objects", objectToRefresh.size());
        });
 * 
            }
        }
            context,
                    checkedObjects.add((T) item.getData());
        dialogClassName = divPos == -1 ? dialogClassName : dialogClassName.substring(divPos + 1);
                                                } catch (DBCException e) {
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        });
                                    }
import org.jkiss.dbeaver.model.navigator.DBNEvent;
import org.jkiss.dbeaver.model.exec.*;
            }
        final SQLScriptProgressListener<T> scriptListener = getScriptListener();
 * Super class for handling dialogs related to
        Collection<T> objects,
        }
                                        log.error("Error refreshing object '" + object.getName() + "'", e);
        }
import org.eclipse.swt.events.SelectionEvent;
        try {
            partSite,
                monitor.beginTask(jobName, objects.size());
        return lines.toArray(new String[0]);
                        }
            null);
import org.jkiss.dbeaver.model.DBUtils;
        if (objectsTable != null) {
                    monitor.done();
        objectsTable = new Table(parent, SWT.BORDER | SWT.CHECK);
        objectsTable.addSelectionListener(new SelectionAdapter() {
                                    } catch (Exception e) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
            {
import org.jkiss.dbeaver.ui.UIUtils;
            partSite,
                        commitChanges(session);
import org.eclipse.swt.layout.GridData;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        try {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected boolean isRunInSeparateTransaction() {
            // Don't need it for a single object
                try (DBCSession session = getExecutionContext().openSession(monitor, DBCExecutionPurpose.UTIL, jobName)) {
import org.eclipse.core.runtime.Status;
    {
                            UIUtils.asyncExec(() -> scriptListener.endObjectProcessing(object, objectProcessingError));
import org.eclipse.swt.SWT;
                }
        if (selectedObjects.size() < 2) {
                                            UIUtils.syncExec(() -> {
                                        }

        UIUtils.createControlLabel(parent, "Tables");
            getContextFromObjects(objects, meta),
                                for (T object : objectToRefresh) {
 * @author Serge Rider
public abstract class GenerateMultiSQLDialog<T extends DBSObject> extends GenerateSQLDialog {
    {
            objectsSQL.put(object, lines);
                }
                return Status.OK_STATUS;
import org.eclipse.swt.widgets.TableItem;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    private Table objectsTable;
                                    }
    private static <T extends DBSObject> DBCExecutionContext getContextFromObjects(@NotNull Collection<T> objects, boolean meta) {
        objectsTable.setLayoutData(gd);
            T object = iterator.next();
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                                        if (objectNode != null) {
 *
import org.jkiss.code.NotNull;
                                                    objectProcessingError = e;
                    });
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
            checkedObjects.addAll(selectedObjects);
                                            // Run in sync because we need result set
            public void done(IJobChangeEvent event) {
            @NotNull
        String dialogClassName = getClass().getName();
                        final T object = objects.get(i);
                }
                getButton(IDialogConstants.DETAILS_ID).setEnabled(hasChecked);
                                    try {

            }
            generateObjectCommand(lines, object);
 * See the License for the specific language governing permissions and
    protected abstract SQLScriptProgressListener<T> getScriptListener();
    @Override
            @Override
            item.setImage(DBeaverIcons.getImage(DBIcon.TREE_TABLE));
 * distributed under the License is distributed on an "AS IS" BASIS,
                                            }
import java.util.*;
        String title,
                                        DBNDatabaseNode objectNode = DBNUtils.getNodeByObject(object);
    }
        }
        }
 * Unless required by applicable law or agreed to in writing, software
            generateObjectCommand(lines, object);
    protected IDialogSettings getDialogBoundsSettings() {
                            }
        super(
    protected String[] generateSQLScript()
        this.selectedObjects = objects;
        return false;
                                            break;
        this(
            @Override
            public void widgetSelected(SelectionEvent e) {
                                        }
import java.lang.reflect.InvocationTargetException;

                    if (isRunInSeparateTransaction()) {
        return false;
            }
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
                        }
            if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
                                                try {
    public GenerateMultiSQLDialog(
        final DataSourceJob job = new DataSourceJob(jobName, getExecutionContext()) {
                            objectProcessingError = e;
import org.jkiss.dbeaver.Log;

        int divPos = dialogClassName.lastIndexOf('.');
    }
                                            objectNode.refreshNode(monitor, DBNEvent.FORCE_REFRESH);
 * 
                    }
                    UIUtils.asyncExec(scriptListener::endScriptProcessing);
        for (T object : checkedObjects) {

                return DBUtils.getDefaultContext(object, meta);
                        } finally {
        Collection<T> objects)
            title,
                                        });
                        } catch (Exception e) {
                        final int objectNumber = i;
        gd.heightHint = 100;
 * limitations under the License.
import org.eclipse.swt.widgets.Composite;
 *
                    if (isRunInSeparateTransaction()) {
                                                scriptListener.processObjectResults(object, statement, null);

                            for (String line : lines) {
            item.setText(DBUtils.getObjectFullName(table, DBPEvaluationContext.UI));
            Exception objectProcessingError;
                                }
        final String jobName = getShell().getText();
    protected void executeSQL() {

import org.eclipse.jface.dialogs.IDialogSettings;

import org.jkiss.dbeaver.model.struct.DBSObject;
        String title,

        job.schedule();
                            UIUtils.runInProgressDialog(monitor -> {
        IWorkbenchPartSite partSite,
            log.error("Error committing transactions", e);
import org.eclipse.swt.events.SelectionAdapter;
                            });
            objects);
                                        }
    }

                                    if (statement.executeStatement()) {
import org.jkiss.dbeaver.model.DBIcon;

                        }

        return UIUtils.getDialogSettings(DIALOG_ID + "." + dialogClassName);

                    }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
}                        monitor.worked(1);
                txnManager.commit(session);
        Iterator<T> iterator = objects.iterator();
        boolean meta)
                                        UIUtils.syncExec(() -> {
        }
                    }
            return;
package org.jkiss.dbeaver.ui.editors.sql.dialogs;
                                        if (objectProcessingError != null) {
                                            });
                        commitChanges(session);
        return checkedObjects;
                            DBWorkbench.getPlatformUI().showError("Objects refresh", "Error refreshing navigator objects", e);
import org.jkiss.dbeaver.model.navigator.DBNUtils;
            @Override
        if (iterator.hasNext()) {
 *
        for (T object : objects) {
        }
    }

            protected IStatus run(@NotNull final DBRProgressMonitor monitor)
            if (object != null) {
            }
import org.eclipse.swt.widgets.Table;
    {
    }
                    List<T> objectToRefresh = new ArrayList<>(selectedObjects);

        return null;
                    UIUtils.asyncExec(() -> {
                        } catch (InvocationTargetException e) {
            TableItem item = new TableItem(objectsTable, SWT.NONE);
    private final Collection<T> selectedObjects;
        job.setUser(false);
    protected void createObjectsSelector(Composite parent) {

        objectsTable.addSelectionListener(SQL_CHANGE_LISTENER);
    private static final String DIALOG_ID = "GenerateMultiSQLDialog";
    }
                        objectProcessingError = null;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        List<T> checkedObjects = getCheckedObjects();
        } catch (Throwable e) {
            final List<String> lines = new ArrayList<>();
 */
        job.addJobChangeListener(new JobChangeAdapter() {

        } else {
        DBCExecutionContext context,
import org.eclipse.jface.dialogs.IDialogConstants;

                boolean hasChecked = !getCheckedObjects().isEmpty();
/**
                                                    scriptListener.processObjectResults(object, statement, resultSet);
    }
                        monitor.subTask("Process " + DBUtils.getObjectFullName(object, DBPEvaluationContext.UI));
    @Override
        };
    private void commitChanges(DBCSession session) {
            title,
 */
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    public List<T> getCheckedObjects() {
            item.setData(table);
                                        try (DBCResultSet resultSet = statement.openResultSet()) {
/*
                        if (monitor.isCanceled()) {
import org.eclipse.ui.IWorkbenchPartSite;
                                                objectProcessingError = e;
        List<T> checkedObjects = new ArrayList<>();
                                            try {
                                monitor.done();
                                    } else {
        for (T table : selectedObjects) {
                if (item.getChecked()) {
            item.setChecked(true);
                    for (int i = 0; i < objects.size(); i++) {
                                }
    }
    private static final Log log = Log.getLog(GenerateMultiSQLDialog.class);
                final DataSourceJob curJob = this;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
                } finally {
                                try (final DBCStatement statement = DBUtils.makeStatement(session, line, false)) {
        IWorkbenchPartSite partSite,
            for (TableItem item : objectsTable.getItems()) {
                if (needsRefreshOnFinish()) {
    protected abstract void generateObjectCommand(List<String> sql, T object);
    private GenerateMultiSQLDialog(
        final Map<T, List<String>> objectsSQL = new LinkedHashMap<>();


                        UIUtils.asyncExec(() -> scriptListener.beginObjectProcessing(object, objectNumber));
    }
    }

                getButton(IDialogConstants.OK_ID).setEnabled(hasChecked);
                                                }
import org.eclipse.core.runtime.IStatus;
        List<String> lines = new ArrayList<>();
                            break;
    protected boolean needsRefreshOnFinish() {

                                            } catch (DBCException e) {
                            final List<String> lines = objectsSQL.get(object);
        final List<T> objects = getCheckedObjects();
                        try {
