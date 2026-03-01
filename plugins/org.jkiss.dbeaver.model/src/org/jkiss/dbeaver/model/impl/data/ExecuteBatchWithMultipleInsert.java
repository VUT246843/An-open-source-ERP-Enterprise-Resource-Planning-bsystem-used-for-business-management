                // Execute batch if it has a suitable size, or this are the last values
                            break;
                    Object[] allMultiInsertValuesBatch = multiRowInsertBatchValuesList.toArray(new Object[0]);
        DBCStatement dbStat = session.prepareStatement(DBCStatementType.QUERY, queryForStatement.toString(), false, false, keysReceiver != null);
                    batchStatement = prepareStatement(session, handlers, allMultiInsertValuesBatch, options);
    protected DBCStatement prepareStatement(@NotNull DBCSession session, DBDValueHandler[] handlers, Object[] attributeValues, Map<String, Object> options) throws DBCException {
                    bindAndFlushStatement(handlers, statistics, batchStatement, allMultiInsertValuesBatch, skipBindValues);
            bindStatement(handlers, batchStatement, allMultiInsertValues);
                }
 *
                            multiRowInsertBatchValuesList.clear();

}
     * @param reuseStatement true if engine should reuse single prepared statement for each execution.
                }
                Object[] objects = values.get(i);
    }
            values.clear();
                        try (DBCStatement statement = prepareStatement(session, handlers, allMultiInsertValues, options)) {
        statistics.setQueryText(batchStatement.getQueryString());
    private final DBCExecutionSource source;

        super(attributes, keysReceiver, reuseStatement, session, source, table, false);

    public ExecuteBatchWithMultipleInsert(@NotNull DBSAttributeBase[] attributes, @Nullable DBDDataReceiver keysReceiver, boolean reuseStatement, @NotNull DBCSession session, @NotNull final DBCExecutionSource source, @NotNull DBSTable table) {
 * you may not use this file except in compliance with the License.
        DBException {
import java.util.Collections;
    @Override

        // Execute

        try {
import java.util.List;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
            List<Object> multiRowInsertBatchValuesList = new ArrayList<>();
    protected void bindStatement(@NotNull DBDValueHandler[] handlers, @NotNull DBCStatement statement, Object[] attributeValues) throws DBCException {
                 batchStatement.close();
    }
import org.jkiss.dbeaver.DBException;
            boolean skipBindValues = CommonUtils.toBoolean(options.get(DBSDataManipulator.OPTION_SKIP_BIND_VALUES));
    }
                if (i == rowsCount - 1 || (i != 0 && i % multiRowInsertBatchSize == 0)) {
import org.jkiss.dbeaver.model.DBUtils;
                    break;
                    if (i == rowsCount - 1) {
        }

        batchStatement.addToBatch();
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
    /**
            if (attributeCount == handlersLength) {
                        }
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    private void bindAndFlushStatement(DBDValueHandler[] handlers, DBCStatistics statistics, DBCStatement batchStatement, Object[] allMultiInsertValues, boolean skipBindValues) throws DBCException {
            if (attributes[i] instanceof DBDAttributeBinding) {
     *
    @Override
        } finally {
                handlers[i] = DBUtils.findValueHandler(session, attributes[i]);
            attributeCount++;
     * Constructs new batch
            }


     */

        if (!skipBindValues) {
    private DBSTable table;
            int rowsCount = values.size();
        }
            handlers[attributeCount].bindValueObject(statement.getSession(), statement, attributes[attributeCount], paramIndex++, attribute);
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    @NotNull
                    multiRowInsertBatchValuesList.clear();
                    // We can reuse statement, but not for the last values (their amount can be different from previous batches)
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
        DBDValueHandler[] handlers = new DBDValueHandler[attributesLength];
        int paramIndex = 0;
                if (session.getProgressMonitor().isCanceled()) {
     * @param keysReceiver   keys receiver (or null)
import org.jkiss.dbeaver.model.data.DBDValueHandler;
     * @param attributes     array of attributes used in batch
        for (int i = 0; i < attributesLength; i++) {
 * Unless required by applicable law or agreed to in writing, software
            if (DBUtils.isPseudoAttribute(attributes[attributeCount])) {
        flushBatch(statistics, batchStatement);

        }
        int attributeCount = 0;
 * DBeaver - Universal Database Manager
                handlers[i] = ((DBDAttributeBinding)attributes[i]).getValueHandler();
                            bindAndFlushStatement(handlers, statistics, statement, allMultiInsertValues, skipBindValues);
 * limitations under the License.
public class ExecuteBatchWithMultipleInsert extends ExecuteInsertBatchImpl {
                Collections.addAll(multiRowInsertBatchValuesList, objects);
        }
        int handlersLength = handlers.length;
        int attributesLength = attributes.length;

        for (Object attribute : attributeValues) {
        this.table = table;
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
                attributeCount = 0;

        DBCStatement batchStatement = null;
import org.jkiss.code.NotNull;
        return statistics;
 * You may obtain a copy of the License at
    }
 *
        statistics.addStatementsCount();
                    }
        DBCStatistics statistics = new DBCStatistics();
package org.jkiss.dbeaver.model.impl.data;
        StringBuilder queryForStatement = prepareQueryForStatement(session, handlers, attributeValues, attributes, table, true, options);
import org.jkiss.code.Nullable;
/*
import java.util.Map;
    }
                continue;
        this.source = source;
        return dbStat;
            }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            if (batchStatement != null) {
            }
                        Collections.addAll(multiRowInsertBatchValuesList, objects);
            int multiRowInsertBatchSize = CommonUtils.toInt(options.get(DBSDataManipulator.OPTION_MULTI_INSERT_BATCH_SIZE), 100);
                        Object[] allMultiInsertValues = multiRowInsertBatchValuesList.toArray(new Object[0]);
            }
        dbStat.setStatementSource(source);
 *
            }
            for (int i = 0; i < rowsCount; i++) {
import org.jkiss.dbeaver.model.exec.*;
    public DBCStatistics processBatch(@NotNull DBCSession session, @Nullable List<DBEPersistAction> actions, Map<String, Object> options) throws

    @NotNull
import java.util.ArrayList;
