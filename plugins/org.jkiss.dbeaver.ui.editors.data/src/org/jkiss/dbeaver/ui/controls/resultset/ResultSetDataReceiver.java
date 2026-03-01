    void setTargetDataContainer(DBSDataContainer targetDataContainer) {
            List<? extends DBCAttributeMetaData> rsAttributes = metaData.getAttributes();
            resultSetViewer.setData(monitor, tmpRows, focusRow);
            }
                // There are a lot of error could occur during result set fetch
                    errorList.add(e);
            // Get columns metadata
    public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) {
        if (!nextSegmentRead) {
                    resultSetViewer.updateRowCount(false);
                    attrErrors.add(errMessage);
    @Override
                    errMessage += ":" + e.getMessage();
            monitor.subTask("Set data");
    public void fetchStart(@NotNull DBCSession session, @NotNull final DBCResultSet resultSet, long offset, long maxRows)
    private long maxRows;
    }
                    metaAttribute,
import java.util.List;

    public void setDataReceivePaused(boolean paused) {

    List<Throwable> getErrorList() {
class ResultSetDataReceiver implements DBDDataReceiver, DBDDataReceiverInteractive {

import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    resultSet,

        });

                resultSetViewer.updateStatusMessage();
        // Check for more data
        if (!nextSegmentRead) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
        // Push data into viewer
    void setFocusRow(int focusRow) {
import org.jkiss.dbeaver.ModelPreferences;
        return paused;


    }
    private long offset;

            }
            if (metaData == null) {
        this.paused = paused;
        rows = new ArrayList<>();
    public boolean isDataReceivePaused() {
                    DBExecUtils.bindAttributes(session, entity, resultSet, metaColumns, rows);
                boolean metadataChanged = resultSetViewer.getModel().isMetadataChanged();
    private boolean nextSegmentRead;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.rows.clear();
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                throw new DBCException("Null resultset metadata");
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others


        }

        hasMoreData = maxRows > 0 && tmpRows.size() >= maxRows;

    }
        throws DBCException {
                    // Read locators' metadata
 * distributed under the License is distributed on an "AS IS" BASIS,
                return;
            metaColumns = DBUtils.getAttributeBindings(session, getDataContainer(), metaData);
        this.nextSegmentRead = nextSegmentRead;
    public void close() {
        monitor.beginTask("Populate data", 1);
                resultSetViewer.getActivePresentation().refreshData(false, true, true);
                    metaColumns[i].getMetaAttribute(),
 * Data pump for SQL queries
        DBRProgressMonitor monitor = session.getProgressMonitor();
        } else {
                }
        this.targetDataContainer = targetDataContainer;
        this.maxRows = maxRows;

            DBCResultSetMetaData metaData = resultSet.getMeta();
        UIUtils.syncExec(() -> {
    
 */
            monitor.subTask("Append data");
 * See the License for the specific language governing permissions and

            resultSetViewer.setMetaData(resultSet, metaColumns);
            } else {
            }
        }
    void setNextSegmentRead(boolean nextSegmentRead) {
        return targetDataContainer != null ? targetDataContainer : resultSetViewer.getDataContainer();
                resultSetViewer.getActivePresentation().refreshData(true, false, !metadataChanged);
                    metaColumns[i].getOrdinalPosition());

                }
    boolean isHasMoreData() {
}
                    DBSDataContainer dataContainer = getDataContainer();
    @Override
    }
import java.util.HashMap;
            if (resultSetViewer.getControl().isDisposed()) {
        this.hasMoreData = hasMoreData;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    k -> new ArrayList<>());
    private final Map<DBCAttributeMetaData, List<String>> attrErrors = new HashMap<>();
    }
    }
    void setHasMoreData(boolean hasMoreData) {

import org.jkiss.dbeaver.Log;
    private int focusRow;
    private boolean paused;

            if (!nextSegmentRead) {
            try {

        }
    @Override
        if (!nextSegmentRead) {
            }
    // Attribute fetching errors. Collect them to avoid tons of similar error in log
                try {
                // Do not reports the same error multiple times
                if (resultSetViewer.getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_AUTOMATIC_ROW_COUNT)){
        }
    private final List<Throwable> errorList = new ArrayList<>();
        attrErrors.clear();
    ResultSetDataReceiver(@NotNull ResultSetViewer resultSetViewer) {
    private final ResultSetViewer resultSetViewer;

                if (!errMessage.startsWith("java.lang.")) {
            if (metaColumns != null) {
                }
                }
                String errMessage = e.getClass().getName();

 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    private boolean hasMoreData;
        Object[] row = new Object[columnsCount];
    @Override
    private List<Object[]> rows = new ArrayList<>();
                row[i] = metaColumns[i].getValueHandler().fetchValueObject(
 *
                if (metaAttribute == null) {
                    errorList.add(e);
                    DBSEntity entity = dataContainer instanceof DBSEntity e ? e : null;
    }
 */


    public void fetchEnd(@NotNull DBCSession session, @NotNull final DBCResultSet resultSet) {
    private static final Log log = Log.getLog(ResultSetDataReceiver.class);
        this.errorList.clear();
        this.resultSetViewer = resultSetViewer;
    private DBDAttributeBinding[] metaColumns;
import org.jkiss.dbeaver.model.exec.*;
        return hasMoreData;
    @Override
            } catch (Throwable e) {

        final List<Object[]> tmpRows = rows;
    }
    }
                resultSetViewer.updatePresentation(resultSet, metadataChanged);

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            columnsCount = rsAttributes.size();

        return errorList;
                    continue;
import org.jkiss.dbeaver.model.DBUtils;
                row[i] = new DBDValueError(e);
                // We report certain error only once
    @Override
import java.util.ArrayList;
 * You may obtain a copy of the License at
        this.offset = offset;
            boolean resetOldRows = getDataContainer().getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_REREAD_ON_SCROLLING);
        rows.add(row);
                if (!attrErrors.contains(errMessage)) {

        monitor.done();
    }
import java.util.Map;
import org.jkiss.dbeaver.model.impl.data.DBDValueError;
        nextSegmentRead = false;
    private int columnsCount;

                List<String> attrErrors = this.attrErrors.computeIfAbsent(

                    session,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDDataReceiverInteractive;
        for (int i = 0; i < columnsCount; i++) {
            // Push data into viewer
/**
    private DBSDataContainer getDataContainer() {
                    log.warn("Can't read column '" + metaColumns[i].getName() + "' value", e);

        this.focusRow = focusRow;

                }
 * DBeaver - Universal Database Manager
    }
 * limitations under the License.


import org.jkiss.dbeaver.ui.UIUtils;
package org.jkiss.dbeaver.ui.controls.resultset;
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
                DBSAttributeBase metaAttribute = metaColumns[i].getAttribute();

            resultSetViewer.appendData(monitor, tmpRows, resetOldRows);
    }
                } catch (Throwable e) {
 * you may not use this file except in compliance with the License.
    }
 *
    // All (unique) errors happened during fetch
/*
        monitor.subTask("Update presentation");
        final boolean nextSegmentRead = this.nextSegmentRead;
            // Extract column info

    private DBSDataContainer targetDataContainer;
