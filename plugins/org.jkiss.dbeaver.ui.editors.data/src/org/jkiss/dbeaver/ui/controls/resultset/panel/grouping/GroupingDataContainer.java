    @Override
        DBDDataFilter dataFilter,
    }
        {


import org.jkiss.utils.Pair;
    private static final Log log = Log.getLog(GroupingDataContainer.class);
    }
                    statistics.setRowsFetched(rowCount);
    }
        @NotNull DBDDataReceiver dataReceiver,
                    long rowCount = 0;
public class GroupingDataContainer implements DBDAttributeTransformerProvider, DBSDataContainer {

        if (query == null) {
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping;
    @Nullable
        }
            return "Grouping";
    }
        return false;
                try (DBCResultSet dbResult = dbStat.openResultSet()) {
        int fetchSize
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @Override
            session,
    public String getDescription() {
            }
        StringBuilder sqlQuery = new StringBuilder(this.query);
import org.jkiss.dbeaver.model.struct.DBSObject;

    private IResultSetController parentController;
            String gbAlias = "gbq_";
    }
 *
    public DBCStatistics readData(

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



        String sql = sqlQuery.toString();

    @NotNull
        this.parentController = parentController;

    private SQLGroupingAttribute[] attributes;
import java.util.Collections;

                            // Fetch not more than max rows
        return this.attributes;

import org.jkiss.dbeaver.model.sql.SQLGroupingAttribute;
        @Nullable DBCExecutionSource source,

        DBDAttributeTransformer transformer = attributeBindingNumberToTransformer != null
    private Pair<Integer, DBDAttributeTransformer> attributeBindingNumberToTransformer;
import org.jkiss.dbeaver.model.exec.*;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                throw new DBCException("Can't generate query conditions", e, session.getExecutionContext());
                    while (dbResult.nextRow()) {
    @Override
/*
            } catch (DBException e) {
        if (dataSource != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            : null;
        return parentController.getDataContainer();
        if (dataSource != null && dataFilter.hasConditions()) {
        return 0;
            firstRow,
import org.jkiss.dbeaver.model.data.*;
    public void setGroupingQuery(String sql) {
            }
import java.util.Arrays;
 * Unless required by applicable law or agreed to in writing, software
    }
 *
import org.jkiss.dbeaver.Log;

                    startTime = System.currentTimeMillis();
        return getName();
    }
import org.jkiss.dbeaver.model.DBPDataSource;
        this.attributes = attributes;
        try (DBCStatement dbStat = DBUtils.makeStatement(
    }
    @NotNull
            maxRows))
        } finally {
    public void setAttributeTransformer(int attributeIndex, @NotNull DBDAttributeTransformer transformer) {
    public String toString() {

    @Override
            statistics.addMessage("Empty query");
import org.jkiss.utils.ArrayUtils;

        long maxRows,
            DBCStatementType.SCRIPT,
        if (ArrayUtils.isEmpty(this.attributes)) {
            if (monitor.isCanceled()) {
    public SQLGroupingAttribute[] getGroupingAttributes() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBRProgressMonitor monitor = session.getProgressMonitor();
    }
        return "Grouping data";
    }
            return statistics;

            try {
    }
        statistics.setQueryText(sql);
                return statistics;
            long startTime = System.currentTimeMillis();
    @Nullable
                    DBDDataReceiver.startFetchWorkflow(dataReceiver, session, dbResult, firstRow, maxRows);
    public GroupingDataContainer(IResultSetController parentController) {
        }

    public List<DBDAttributeTransformer> findTransformerForBinding(@NotNull DBDAttributeBinding attributeBinding) {
            return statistics;
    @Override
                            break;
        this.query = sql;
            ? attributeBindingNumberToTransformer.getSecond()
    @Override
import org.jkiss.dbeaver.model.DBUtils;
import java.util.stream.Collectors;
 * You may obtain a copy of the License at
    @NotNull
        DBCStatistics statistics = new DBCStatistics();
                        }
import java.util.List;
        boolean hasLimits = firstRow >= 0 && maxRows > 0;
                    statistics.setFetchTime(System.currentTimeMillis() - startTime);
            SQLUtils.appendQueryOrder(dataSource, sqlQuery, null, dataFilter);

    private String query;
import org.jkiss.dbeaver.model.messages.ModelMessages;
            boolean executeResult = dbStat.executeStatement();
    public DBSObject getParentObject() {
    public void setGroupingAttributes(@Nullable SQLGroupingAttribute[] attributes) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    public String[] getSupportedFeatures() {
        attributeBindingNumberToTransformer = Pair.of(attributeIndex, transformer);
        return transformer != null ? Collections.singletonList(transformer) : Collections.emptyList();
            statistics.setExecuteTime(System.currentTimeMillis() - startTime);
    }
    }
                        dataReceiver.fetchRow(session, dbResult);
 * DBeaver - Universal Database Manager

                SQLUtils.appendQueryConditions(dataSource, sqlQuery, gbAlias, dataFilter);
                    }
 * See the License for the specific language governing permissions and
    public String getName() {

import org.jkiss.code.NotNull;
 * limitations under the License.
        } else {

        }
    @NotNull
}
    }
            return Arrays.stream(this.attributes).map(SQLGroupingAttribute::getDisplayName).collect(Collectors.joining(","));
        long flags,
import org.jkiss.dbeaver.model.sql.SQLUtils;
                }
    public boolean isPersisted() {
        }
            sqlQuery.setLength(0);
    @Override
import org.jkiss.dbeaver.DBException;

            source,

                        rowCount++;
        statistics.addStatementsCount();
    }

    }
    @NotNull
            }
            dataReceiver.close();

        return new String[] {FEATURE_DATA_SELECT, FEATURE_DATA_FILTER};
import org.jkiss.code.Nullable;
        monitor.subTask(ModelMessages.model_jdbc_fetch_table_data);
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
        long firstRow,
 *
    public void removeAttributeTransformer() {
            sql = "SELECT * FROM (" + sql + ") " + gbAlias + " " + sqlQuery;
        @NotNull DBCSession session,
    public DBPDataSource getDataSource() {
    @Override

 */

            sql,
            if (executeResult) {
    ) throws DBException {
    @Override
    public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags) throws DBCException {
        attributeBindingNumberToTransformer = null;
            && attributeBindingNumberToTransformer.getFirst().equals(attributeBinding.getOrdinalPosition())
        }
        DBPDataSource dataSource = getDataSource();
        return parentController.getDataContainer().getDataSource();
                        if (monitor.isCanceled() || (hasLimits && rowCount >= maxRows)) {
