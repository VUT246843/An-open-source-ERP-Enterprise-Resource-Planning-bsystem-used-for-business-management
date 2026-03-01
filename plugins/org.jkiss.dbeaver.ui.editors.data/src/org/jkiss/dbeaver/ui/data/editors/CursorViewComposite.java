        }
            DBCStatistics statistics = new DBCStatistics();
            return -1;
        DBCExecutionContext executionContext = getExecutionContext();
                }
    public void setValue(DBDCursor value) {
            if (firstRow > 0) {
                    while (resultSet.nextRow()) {
        return new QueryResultsDecorator() {
        }
        layout.marginWidth = 0;
        @Override
        gd.heightHint = 300;
    @Nullable
    {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.eclipse.swt.widgets.Control;
    @Override
    @Override

    public ResultSetViewer getResultSetController()
import org.eclipse.swt.SWT;

                    }
        {

                    }
                        }
        @NotNull
        {
                        dataReceiver.fetchRow(session, resultSet);

        public DBCStatistics readData(
    }
            .getNavigatorModel().getNodeByObject(monitor, dataContainer, false);
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.setLayout(layout);
            UIUtils.showMessageBox(null, "Open link", "Cannot navigate to '" +
    public IResultSetDecorator createResultSetDecorator() {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (executionContext != null) {
            try (resultSet) {
            }
        }
            long maxRows,
    @Override
            if (resultSet == null) {
            return;
            return false;
    @Override
        if (!fetched) {


 *
            DBDDataFilter dataFilter,
            }
import org.jkiss.dbeaver.ui.UIUtils;
        return resultSetViewer == null ? null : resultSetViewer.getControl();
 */
        return resultSetViewer.isDirty();
import org.jkiss.dbeaver.DBException;
    @Nullable
import org.eclipse.swt.widgets.Composite;

                        dataReceiver.fetchEnd(session, resultSet);

/*
        public DBPDataSource getDataSource()
        @Override
            }
            @NotNull DBDDataReceiver dataReceiver,
    private DBDCursor value;
    }
        @NotNull
                    } catch (DBCException e) {
        gd.grabExcessVerticalSpace = true;
                long rowCount;
                }
            this.value = value;
    public boolean isDirty() {
        @NotNull
        ) throws DBException {

    public DBCExecutionContext getExecutionContext() {
    }
        final DBNDatabaseNode targetNode = dataContainer.getDataSource().getContainer().getProject()
    public void refresh() {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.data.DBDDataFilter;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
                long startTime = System.currentTimeMillis();

            return value.toString();
        if (executionContext == null) {

    @Override
                dataReceiver.fetchStart(session, resultSet, firstRow, maxRows);
                try {
            return executionContext.getDataSource().getContainer().getProject();
 *
        return resultSetViewer;
                } catch (DBCException e) {
                    // No value
package org.jkiss.dbeaver.ui.data.editors;
    public void openNewContainer(DBRProgressMonitor monitor, @NotNull DBSDataContainer dataContainer, @NotNull DBDDataFilter newFilter) {

            }
            resultSetViewer.refresh();
import org.jkiss.dbeaver.model.app.DBPProject;
 * You may obtain a copy of the License at
                statistics.setRowsFetched(rowCount);
        return true;
        @Nullable
                } finally {
        @Override

                // until user close data viewer
        @Override
    @Nullable
 * See the License for the specific language governing permissions and
        @Override
    }
        super(parent, SWT.NONE);
    }


import org.eclipse.swt.layout.GridLayout;
                    }
    private boolean fetched;
    @Override
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
                try {
                return statistics;
                DBUtils.getObjectFullName(dataContainer, DBPEvaluationContext.UI) + "' - navigator node not found", SWT.ICON_ERROR);
                        IResultSetController rsv = ((IResultSetContainer) valueController.getValueSite().getPart()).getResultSetController();
                }
                if (ConfirmationDialog.confirmAction(
        @NotNull
        AbstractDataEditor.openNewDataEditor(targetNode, newFilter);
                            break;
    private class CursorDataContainer implements DBSDataContainer {
import org.jkiss.dbeaver.model.struct.DBSObject;
                        ConfirmationDialog.QUESTION) == IDialogConstants.YES_ID)
        if (value != null) {

            long firstRow,
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                        ResultSetPreferences.CONFIRM_KEEP_STATEMENT_OPEN,
                        log.error("Error while finishing result set fetch", e); //$NON-NLS-1$
        // Refresh only once.
import org.jkiss.dbeaver.model.data.DBDCursor;
import org.jkiss.dbeaver.model.DBPDataSource;
    private static final Log log = Log.getLog(CursorViewComposite.class);
        layout.marginHeight = 0;
            return new String[] {FEATURE_DATA_SELECT};
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
                            break;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        DBCExecutionContext executionContext = getExecutionContext();
    public DBPProject getProject() {
                        if (rowCount >= maxRows) {
        public String getDescription()
 * distributed under the License is distributed on an "AS IS" BASIS,
        resultSetViewer.getControl().setLayoutData(gd);
                    preferenceStore.setValue(ResultSetPreferences.KEEP_STATEMENT_OPEN, true);
import org.jkiss.dbeaver.ui.data.IValueController;
        value = (DBDCursor) valueController.getValue();
        @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        }
        public DBSObject getParentObject()
        {
                            monitor.subTask(rowCount + ResultSetMessages.dialog_cursor_view_monitor_rows_fetched);

            // Nothing but plain read
                    log.debug(e);
        {
        dataContainer = new CursorDataContainer();
        @Override
        {
    }
    {
                return statistics;
            this.fetched = false;
 * CursorViewComposite
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.Log;
        return valueController == null ? null : valueController.getExecutionContext();
                        }
    }

    public Control getControl() {
                    resultSet.moveTo((int) firstRow);
            long flags,
        }

            fetched = true;
            }
import org.eclipse.jface.dialogs.IDialogConstants;
        return null;
import org.jkiss.dbeaver.ui.controls.resultset.*;
            DBCResultSet resultSet = value == null ? null : value.openResultSet(session);

    private CursorDataContainer dataContainer;

            return;
                            // Fetch not more than max rows
            @NotNull DBCSession session,
    }
        if (this.value != value) {

        }
            public long getDecoratorFeatures() {
                        getShell(),
                            rsv.refresh();


                    rowCount = 0;
        GridLayout layout = new GridLayout(1, true);
        //resultSetViewer.refresh();
        }
    private IValueController valueController;
        {
import org.jkiss.dbeaver.ui.editors.data.AbstractDataEditor;
        }
        };
            return null;
                    FEATURE_PRESENTATIONS;

        public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags)

    public DBSDataContainer getDataContainer()

                statistics.setFetchTime(System.currentTimeMillis() - startTime);
public class CursorViewComposite extends Composite implements IResultSetContainer {
        public boolean isPersisted()
        }
            return valueController == null ? null : valueController.getExecutionContext().getDataSource();
        public String getName()
            @Override
        {
    }
                        if (monitor.isCanceled()) {
        }
    }
    private ResultSetViewer resultSetViewer;
        @Override

import org.jkiss.dbeaver.model.exec.*;
        resultSetViewer = new ResultSetViewer(this, valueController.getValueSite(), this);
                {
        }
                        if (rowCount % 100 == 0) {
            DBRProgressMonitor monitor = session.getProgressMonitor();
        return dataContainer;

        }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (rsv != null) {
                        }
    public boolean isReadyToRun()
 * Unless required by applicable law or agreed to in writing, software

        // Cursor contents cannot change because it lives within current transaction
import org.eclipse.swt.layout.GridData;
                        }
            DBPPreferenceStore preferenceStore = valueController.getExecutionContext().getDataSource().getContainer().getPreferenceStore();
                // FIXME: we cannot use fetch workflow because statement is not closed
/**
    public CursorViewComposite(Composite parent, IValueController valueController) {
}
                            monitor.worked(100);
import org.jkiss.code.NotNull;
                return valueController.getEditType() == IValueController.EditType.EDITOR ?
        }
                    if (valueController.getValueSite().getPart() instanceof IResultSetContainer) {
        this.valueController = valueController;
        if (targetNode == null) {
                //DBDDataReceiver.startFetchWorkflow(dataReceiver, session, resultSet, firstRow, maxRows);
        public String[] getSupportedFeatures()
            return value.toString();
                    try {
                    FEATURE_PANELS | FEATURE_PRESENTATIONS | FEATURE_STATUS_BAR | FEATURE_LINKS :
        }
                } else {
                        rowCount++;
            @Nullable DBCExecutionSource source,
    {
            if (!preferenceStore.getBoolean(ResultSetPreferences.KEEP_STATEMENT_OPEN)) {
        GridData gd = new GridData(GridData.FILL_BOTH);
 * limitations under the License.
                    dataReceiver.close();
 * you may not use this file except in compliance with the License.
    @Override
            int fetchSize
import org.jkiss.dbeaver.model.DBUtils;
    }
    }
