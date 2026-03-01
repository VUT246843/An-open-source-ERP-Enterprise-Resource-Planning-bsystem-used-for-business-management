                        nulls[i] = DBUtils.isNullValue(rowValues[i]);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                            i = k;
            boolean[] nulls = new boolean[attributes.length];
                        rowValues[paramIndex],
        if (warnings != null) {
                            c = c2;
     * Execute batch OR generate batch script.
                }
                    if (!reuse && !useBatch) {
                    }
                    paramIndex = getNextUsedParamIndex(rowValues, paramIndex);
        if (CommonUtils.isEmpty(queryString)) {
            while (dbResult.nextRow()) {
                            if (keysReceiver != null) {
import java.util.ArrayList;
                            statementsInBatch++;
                    if (actions == null) {
    }

                            long startTime = System.currentTimeMillis();
import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
                        // Flush batch
        StringBuilder formatted = new StringBuilder(length * 2);
            int statementsInBatch = 0;
                    break;
                                "Execute statement",
                        statement = null;
                if (rows < 0) {
                            // Execute each row separately
                        handlers[paramIndex],
                            break;
                        reuse = false;
                if (reuse) {
    }
            if (reuseStatement && statement != null) {
            return;
        Throwable[] warnings = statement.getStatementWarnings();
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        }
 * Unless required by applicable law or agreed to in writing, software
                        statementsInBatch = 0;
    {
    void flushBatch(DBCStatistics statistics, DBCStatement statement) throws DBCException {
    {
                        DBUtils.closeSafely(statement);
        this.attributes = attributes;
                }
                DBUtils.closeSafely(statement);

    DBCStatistics processBatch(@NotNull DBCSession session, @Nullable List<DBEPersistAction> actions, Map<String, Object> options) throws DBException
import org.jkiss.dbeaver.model.sql.SQLUtils;
            }
                    break;
        }
        DBCStatement statement = null;
                    statement = prepareStatement(session, handlers, rowValues, options);
                if (session.getProgressMonitor().isCanceled()) {
        }
                        }
                            new SQLDatabasePersistAction(
package org.jkiss.dbeaver.model.impl.data;
        if (handlers.length == 0) {
 *
                        if (actions == null) {
        try {
                        } else {
                            // Read keys
            }


                            if (rowCount > 0) {
    protected int getNextUsedParamIndex(Object[] attributeValues, int paramIndex) {
                        false);
                statistics.addWarning(w);
                                statistics.addRowsUpdated(rowCount);

                        }
            if (statementsInBatch > 0) {

 * Execute batch.
                }
     * @param reuseStatement true if engine should reuse single prepared statement for each execution.
            }

                        }
        if (!ArrayUtils.isEmpty(updatedRows)) {

import org.jkiss.dbeaver.Log;
                    //session.getProgressMonitor().subTask("Save batch (" + rowIndex + " of " + values.size() + ")");
                statistics.addRowsUpdated(rows);
            return;
                    break;
            // It makes a great sense in case of data transfer where we need millions of inserts.
            if (!useBatch && !values.isEmpty()) {
            boolean[] prevNulls = new boolean[attributes.length];
        if (!ArrayUtils.isEmpty(attributes) && ArrayUtils.isEmpty(attributeValues)) {
                    if (!reuse && statementsInBatch > 0) {
                                    readKeys(statement.getSession(), statement, keysReceiver);
    }
    @Override
    {
            // Quite complicated but works.
}
    String formatQueryParameters(DBCSession session, String queryString, DBDValueHandler[] handlers, Object[] rowValues) {
        }
            values.clear();
     * @param keysReceiver keys receiver (or null)
                                } catch (Exception e) {
        for (int i = 0; i < length; i++) {
            return queryString;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                Object[] rowValues = values.get(rowIndex);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                case '?': {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public void generatePersistActions(@NotNull DBCSession session, @NotNull List<DBEPersistAction> actions, @NotNull Map<String, Object> options) throws DBException {
        }
            formatted.append(c);
        this.keysReceiver = keysReceiver;
        paramIndex++;
            }
     * @param session    session
                        reuse = true;
            log.debug("Error obtaining generated keys", e); //$NON-NLS-1$
                        if (c2 == c && queryString.charAt(k - 1) != '\\') {
        }
                    Object paramValue = SQLUtils.convertValueToSQL(
 *

            throw new DBCException("Bad attribute values: " + Arrays.toString(attributeValues));
    public DBCStatistics execute(@NotNull DBCSession session, @NotNull Map<String, Object> options) throws DBException {
        }
            dbResult = dbStat.openGeneratedKeysResultSet();
    @NotNull
                        session.getDataSource(),
import org.jkiss.dbeaver.model.DBUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        statistics.addExecuteTime(System.currentTimeMillis() - startTime);
            useBatch = false;
        }
import java.util.List;
 * limitations under the License.
        }
        return processBatch(session, null, options);
            }
    }
                            executeStatement(statistics, statement);
     * @param actions    script actions. If not null then no execution will be done
                    for (int i = 0; i < rowValues.length; i++) {
                    if (!ArrayUtils.isEmpty(attributes)) {
    @Override
        boolean useBatch = session.getDataSource().getInfo().supportsBatchUpdates() && reuseStatement && !CommonUtils.toBoolean(options.get(DBSDataManipulator.OPTION_DISABLE_BATCHES));
                statement = null;
        int paramIndex = -1;

 */
import java.util.Map;

    private void readKeys(@NotNull DBCSession session, @NotNull DBCStatement dbStat, @NotNull DBDDataReceiver keysReceiver)
                handlers[i] = ((DBDAttributeBinding)attributes[i]).getValueHandler();

import org.jkiss.dbeaver.model.data.*;
     * @param options
            char c = queryString.charAt(i);
    protected abstract void bindStatement(@NotNull DBDValueHandler[] handlers, @NotNull DBCStatement statement, Object[] attributeValues) throws DBCException;
                    }
public abstract class ExecuteBatchImpl implements DBSDataManipulator.ExecuteBatch {

        boolean skipBindValues = CommonUtils.toBoolean(options.get(DBSDataManipulator.OPTION_SKIP_BIND_VALUES));
                handlers[i] = DBUtils.findValueHandler(session, attributes[i]);
    protected ExecuteBatchImpl(@NotNull DBSAttributeBase[] attributes, @Nullable DBDDataReceiver keysReceiver, boolean reuseStatement)

        try {
                case '"': {
        try (dbResult) {
        processBatch(session, actions, options);
*/
                                    log.warn("Error reading auto-generated keys", e);
            paramIndex++;
                    if (paramIndex >= handlers.length) {
        if (skipBindValues) {
                } finally {
                        DBDDisplayFormat.NATIVE,
        } finally {
    private void saveExecuteWarnings(DBCStatistics statistics, DBCStatement statement) throws DBCException {
        if (dbResult == null) {
                            flushBatch(statistics, statement);
                    for (int k = i + 1; k < length; k++) {
                }
                    }
            for (long rows : updatedRows) {
        while (paramIndex < attributeValues.length && attributeValues[paramIndex] instanceof DBDNull) {
 *
                    }
    public void close()
                    continue;
    private static final Log log = Log.getLog(ExecuteBatchImpl.class);
                            }
        this.reuseStatement = reuseStatement;
import org.jkiss.utils.CommonUtils;

    protected void executeStatement(DBCStatistics statistics, DBCStatement statement) throws DBCException {
                if (rowIndex > 0 && rowIndex % 100 == 0) {
        saveExecuteWarnings(statistics, statement);
                if (actions == null) {
        }
            }
        //session.getProgressMonitor().subTask("Save batch (" + values.size() + ")");
        statement.executeStatement();
                    }


            DBDDataReceiver.startFetchWorkflow(keysReceiver, session, dbResult, -1, -1);
                    // But we are quite sure that it has to be 1 (because each statement inserts/deletes/updates a single row)
                keysReceiver.fetchRow(session, dbResult);
                if (statement == null || !reuse) {
     * @param attributes array of attributes used in batch
            // Here we'll try to reuse prepared statement.

                        char c2 = queryString.charAt(k);

        values.add(attributeValues);
                            statistics.addExecuteTime(System.currentTimeMillis() - startTime);
            return queryString;
        if (values.size() <= 1) {

                            statement.addToBatch();

                        rows = 1;
    {
                    // "Statement.SUCCESS_NO_INFO — the command was processed successfully, but the number of rows affected is unknown"
    }
                }
                        log.error("Parameter index out of range (" + paramIndex + " > " + handlers.length + ")");
 * See the License for the specific language governing permissions and
    }
    {
                }
    /**
    @NotNull
     */
    protected final boolean reuseStatement;
    protected final List<Object[]> values = new ArrayList<>();
    @Override
                    System.arraycopy(nulls, 0, prevNulls, 0, nulls.length);
    }
    public void add(@NotNull Object[] attributeValues) throws DBCException
            }
import java.util.Arrays;
                    }
                }
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.DBException;
        // we need to skip all nullable values because they are already set in the statement
                    } else {
    /**
                    // FIXME: process named parameters
                    // In some cases (e.g. JDBC API) negative means "unknown".

                    formatted.append(c);
                DBUtils.closeSafely(statement);

            }
        }
/**
        }
                }
 * Can be used in JDBC or any other underlying DB APIs
            // We must be aware of nulls because actual insert statements may differ depending on null values.
                }
        saveExecuteWarnings(statistics, statement);

            if (attributes[i] instanceof DBDAttributeBinding) {
                        actions.add(
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                                try {
                    statistics.setQueryText(statement.getQueryString());
                                }
                    }
     * @throws DBCException

    protected final DBDDataReceiver keysReceiver;
                            formatted.append(c2);
                    // The only exception is bulk delete  (without WHERE condition)
                    statistics.addStatementsCount();
                            }

        int length = queryString.length();
                        } else {
                        String queryString = formatQueryParameters(session, statement.getQueryString(), handlers, rowValues);
                values.clear();
        }
    protected abstract DBCStatement prepareStatement(@NotNull DBCSession session, DBDValueHandler[] handlers, Object[] attributeValues, Map<String, Object> options) throws DBCException;
    }
                        attributes[paramIndex],
            } else {
 * you may not use this file except in compliance with the License.
 *
        return paramIndex;
import org.jkiss.utils.ArrayUtils;
                        bindStatement(handlers, statement, rowValues);
                case ':': {
        for (int i = 0; i < attributes.length; i++) {
    @NotNull
     * @return execution statistics
            for (int rowIndex = 0; rowIndex < values.size(); rowIndex++) {
    protected final DBSAttributeBase[] attributes;
     */

                    if (!Arrays.equals(prevNulls, nulls) && statementsInBatch > 0) {
                }
                try {
import org.jkiss.dbeaver.model.exec.*;
import org.jkiss.code.Nullable;

        throws DBException
                            long rowCount = statement.getUpdateRowCount();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
                        DBUtils.closeSafely(statement);
        }
            useBatch = false;
            for (Throwable w : warnings) {
        DBDValueHandler[] handlers = new DBDValueHandler[attributes.length];
        catch (Throwable e) {
                        if (useBatch) {
                        continue;
        }
        return formatted.toString();
        DBCStatistics statistics = new DBCStatistics();


        return statistics;
/*
import org.jkiss.code.NotNull;
        DBCResultSet dbResult;
     * Constructs new batch
                boolean reuse = !skipBindValues && reuseStatement;
            switch (c) {
        long startTime = System.currentTimeMillis();
    @Override
                    flushBatch(statistics, statement);
                    formatted.append(paramValue);
        long[] updatedRows = statement.executeStatementBatch();
            // So if row nulls aren't the same as in previous row we need to prepare new statement and restart batch.
                                queryString));
 * You may obtain a copy of the License at
                    if (!skipBindValues) {

    }
    @NotNull
                case '\'':
