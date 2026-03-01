                    resultCount++;
            return model.getRowCount();
/*
                while (!session.getProgressMonitor().isCanceled() && resultSet.nextRow()) {
        for (DBDAttributeBinding attr : preFiltered) {

import org.jkiss.dbeaver.Log;
            DBCStatistics statistics = new DBCStatistics();
            }
        }
    }
                    }
    public String getDescription() {
            return null;
                }
                if (curRow.getVisualNumber() >= model.getRowCount() - 1) {
        long maxRows,

            for (int i = 0; i < preFiltered.length; i++) {
        this.dataContainer = controller.getDataContainer();
    public DBCStatistics readData(
            return null;

        @Override

                }
        boolean fetchedRowsOnly = proceedFetchedRowsOnly(flags);
                    DBDAttributeBinding attribute = attributes.get(i);
/**

        public DBCResultSetMetaData getMeta() throws DBCException {

    @Override

        } else if (proceedFetchedRowsOnly(flags) || proceedSelectedColumnsOnly(flags)) {
        DBDDataFilter dataFilter,
        ModelResultSet(DBCSession session, long flags) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (result == null) {
        @NotNull DBDDataReceiver dataReceiver,
        }
        return (flags & DBSDataContainer.FLAG_USE_SELECTED_ROWS) != 0 && !CommonUtils.isEmpty(options.getSelectedRows());
        @Override
            preFiltered = attributes;
                }
            if (curRow == null) {
import org.jkiss.code.Nullable;
    @Override
        }
        filterAttributes = selectedColumnsOnly;
                return true;
        public ModelMetaAttribute(DBCAttributeMetaData metaAttribute, int position) {
        });
                this.meta = new CustomResultSetMeta(meta);
            DBDAttributeConstraint ac = dataFilter.getConstraint(attr);
import org.jkiss.dbeaver.model.DBPAdaptable;
 * Wraps RSV model and original data container.
        }
                curRow = model.getRow(curRow.getVisualNumber() + 1);
        return dataContainer.getDataSource();
    }

        return (flags & DBSDataContainer.FLAG_USE_FETCHED_ROWS) != 0;
            return true;
            return localStatement;
            DBDAttributeConstraint c2 = dataFilter.getConstraint(o2, true);
            DBDAttributeConstraint c1 = dataFilter.getConstraint(o1, true);
    }
        }
    private final ResultSetModel model;
            return model.getCellValue(attr, curRow);
                return 0;
 *
import org.jkiss.dbeaver.model.DBUtils;
    public <T> T getAdapter(@NotNull Class<T> adapter) {
            public CustomResultSetMeta(List<DBCAttributeMetaData> meta) {
        @Override
        public DBCStatement getSourceStatement() {
                        ((ModelMetaAttribute) oa.getMetaAttribute()).getProxyAttribute() == pfa.getMetaAttribute()) {
            return session;
    @Override

import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import org.jkiss.dbeaver.model.DBPDataSource;
        }

        return dataContainer.isPersisted();

    private boolean proceedFetchedRowsOnly(long flags) {
    @Override
        return adapter.cast(result);
        long firstRow,
            if (FEATURE_NAME_LOCAL.equals(name)) {
    @NotNull
            }
                curRow = model.getRow(0);
import org.jkiss.dbeaver.DBException;
        if (result == null) {

            this.flags = flags;
 * you may not use this file except in compliance with the License.
    public String getName() {
                    }
                        break;
        private final DBCSession session;
            if (c1 == null || c2 == null) {
        if (fetchedRowsOnly || selectedRowsOnly || selectedColumnsOnly) {
            }

            return model.getCellValue(model.getVisibleAttribute(index), curRow);

        this.model = controller.getModel();

        }
    @NotNull

        public DBCSession getSession() {
        if (proceedSelectedRowsOnly(flags)) {
    private final DBSDataContainer dataContainer;
            return "ClientResults";
                DBDDataReceiver.startFetchWorkflow(dataReceiver, session, resultSet, firstRow, maxRows);
    @NotNull
        }
    @Nullable
                for (DBDAttributeBinding oa : attributes) {

        List<DBDAttributeBinding> filtered = new ArrayList<>();
    public DBCExecutionContext getExecutionContext() {
    public ResultSetDataContainerOptions getOptions() {
            return dataContainer.readData(source, session, dataReceiver, dataFilter, firstRow, maxRows, flags, fetchSize);
        boolean selectedColumnsOnly = proceedSelectedColumnsOnly(flags);
    ) throws DBException {
            }
                throw new DBCException("Attribute '" + name + "' not found");
    public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags) throws DBException {
        @NotNull DBCSession session,
            statistics.setFetchTime(System.currentTimeMillis() - startTime);

                List<DBDAttributeBinding> attributes = model.getVisibleAttributes();
                super(meta);
    }
                        meta.add(new ModelMetaAttribute(metaAttribute, i));
            super(metaAttribute);
            //LocalSta


            long startTime = System.currentTimeMillis();
import org.jkiss.dbeaver.model.impl.data.AttributeMetaDataProxy;

            long resultCount = 0;
    private boolean filterAttributes;
    @Override
            }
 * limitations under the License.
            curRow = model.getRow(position);
import org.jkiss.dbeaver.model.exec.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private class ModelResultSet implements DBCResultSet, DBCResultFiltered {
        return (flags & DBSDataContainer.FLAG_USE_SELECTED_COLUMNS) != 0 && !CommonUtils.isEmpty(options.getSelectedColumns());


        return options;
        if (filterAttributes && !options.getSelectedColumns().isEmpty()) {
            return null;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPContextProvider;
            return c1.getVisualPosition() - c2.getVisualPosition();

 * You may obtain a copy of the License at
        @Override
                }
    private static class ModelMetaAttribute extends AttributeMetaDataProxy {
            try (resultSet) {
        @Override
    public String[] getSupportedFeatures() {
        boolean selectedRowsOnly = proceedSelectedRowsOnly(flags);
            return true;
    }
        return filtered.toArray(new DBDAttributeBinding[0]);
        public DBDValueMeta getAttributeValueMeta(int index) throws DBCException {
                List<DBCAttributeMetaData> meta = new ArrayList<>(attributes.size());
        Object result = GeneralUtils.adapt(dataContainer, adapter);
            } else {
            }
            }
                    if (!selectedRowsOnly || options.getSelectedRows().contains(resultSet.curRow.getRowNumber())) {
                    return false;
        DBDDataFilter dataFilter = model.getDataFilter();
        return controller.getExecutionContext();


    public ResultSetDataContainer(IResultSetController controller, ResultSetDataContainerOptions options) {
        }
    @Override
        return dataContainer.getName();
                DBDAttributeBinding pfa = preFiltered[i];
            this.position = position;
        } else {
        @Nullable DBCExecutionSource source,
 * DBeaver - Universal Database Manager
            // This is important because they may be wrappers
        @Override
    }
    }
            DBDAttributeBinding attr = DBUtils.findObject(model.getVisibleAttributes(), name);
        @Override
    }
    public DBDAttributeBinding[] filterAttributeBindings(DBDAttributeBinding[] attributes) {
                    if (metaAttribute != null) {
        private DBCStatement localStatement;


 */

    }
import org.jkiss.dbeaver.model.impl.local.LocalResultSetMeta;
    private boolean proceedSelectedColumnsOnly(long flags) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull
        this.options = options;
 *
                    return false;
            if (position >= model.getRowCount() - 1) {
 * See the License for the specific language governing permissions and
        @Override
        }
import org.jkiss.utils.CommonUtils;
    private static final Log log = Log.getLog(ResultSetDataContainer.class);
            if (this.meta == null) {

    }

        return dataContainer.getParentObject();
    @Override
            return options.getSelectedRows().size();

        public DBDValueMeta getRowMeta() throws DBCException {
        public boolean moveTo(int position) throws DBCException {
        }
            }
        private class CustomResultSetMeta extends LocalResultSetMeta {
        return new String[] {FEATURE_DATA_SELECT, FEATURE_DATA_COUNT, FEATURE_DATA_READ_FETCHED};
                if (model.getRowCount() == 0) {
                    if (oa.getMetaAttribute() instanceof ModelMetaAttribute &&


    private boolean proceedSelectedRowsOnly(long flags) {
        DBDAttributeBinding[] preFiltered;
    @Override
            ModelResultSet resultSet = new ModelResultSet(session, flags);
        this.controller = controller;

        }
            statistics.setRowsFetched(resultCount);
        public Object getAttributeValue(String name) throws DBCException {

        }
    private ResultSetDataContainerOptions options;
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
        }

        private final long flags;
        } else {
        public int getOrdinalPosition() {
        }
 */
            this.localStatement = new LocalStatement(session, "");
                return false;
            if (attr == null) {
                continue;
        }
            result = GeneralUtils.adapt(controller, adapter);
    }
                for (int i = 0; i < attributes.size(); i++) {
        private ResultSetRow curRow;


        private final int position;
                }
    }
        @NotNull
            }
            return position;
        return dataContainer.getDescription();

            }
            this.session = session;
    }
        @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
package org.jkiss.dbeaver.ui.controls.resultset;
            // Replace pre-filtered attributes with originally passed attributes
    @Override
import java.util.ArrayList;
            statistics.setExecuteTime(System.currentTimeMillis() - startTime);
 * Client-side data container.
    public boolean isPersisted() {
}
import org.jkiss.code.NotNull;
        }
        long flags,

    }
    public DBPDataSource getDataSource() {
            return this.meta;
        }
        @Override
        public String getResultSetName() throws DBCException {
        public Object getFeature(String name) {
 *
    @NotNull
    }
            localStatement.close();
import org.jkiss.dbeaver.model.struct.DBSObject;
        public void close() throws DBException {
    }
import org.jkiss.dbeaver.model.impl.local.LocalStatement;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (ac != null && !ac.isVisible()) {
        } else {
            return dataContainer.countData(source, session, dataFilter, flags);
import org.jkiss.dbeaver.model.data.*;
                    }
            result = GeneralUtils.adapt(controller.getDecorator(), adapter);
        int fetchSize
        }
    }
        @Override
        filtered.sort((o1, o2) -> {
    @Override
        }
    public DBSObject getParentObject() {
        public boolean nextRow() throws DBCException {
                        dataReceiver.fetchRow(session, resultSet);
import java.util.List;
            preFiltered = options.getSelectedColumns().toArray(new DBDAttributeBinding[0]);

        }

        private CustomResultSetMeta meta;
        @NotNull
                    DBCAttributeMetaData metaAttribute = attribute.getMetaAttribute();
            filtered.add(attr);
        public Object getAttributeValue(int index) throws DBCException {
    private final IResultSetController controller;
                        preFiltered[i] = oa;

        @Override
public class ResultSetDataContainer implements DBSDataContainer, DBPContextProvider, DBPAdaptable, DBDAttributeFilter {
            return statistics;
        }
    @Override
        @Override
