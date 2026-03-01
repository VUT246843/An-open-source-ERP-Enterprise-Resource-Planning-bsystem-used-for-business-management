                            dataFilter = rsc.getDataFilter();
        if (!params.searchForeignObjects && dataContainer instanceof DBPForeignObject && ((DBPForeignObject) dataContainer).isForeignObject()) {
import org.eclipse.ui.IEditorPart;
import java.math.BigDecimal;
                        } else {
                constraint.setOperator(operator);
                            continue;
        private DBRProgressMonitor baseMonitor;
        }
            searchResult = new SearchDataResult(this);
    }
            }
                    }
                        } else if (ArrayUtils.contains(supportedOperators, DBCLogicalOperator.LIKE)) {
        DBDDataFilter dataFilter = null;
            rowCount++;
import org.jkiss.dbeaver.DBException;

                            continue;
import org.jkiss.dbeaver.ui.UIUtils;
                            try {
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
import java.util.*;
            log.warn("Can't find tree node for object \"" + objectName + "\"");
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
            }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

        try {
import org.eclipse.core.runtime.IProgressMonitor;
                    default: {
            for (DBSEntityAttribute attribute : CommonUtils.safeCollection(entity.getAttributes(session.getProgressMonitor()))) {
                                    value = Double.valueOf(params.searchString);
            List<DBDAttributeConstraint> constraints = new ArrayList<>();
                        }

    @Override
import org.eclipse.core.runtime.OperationCanceledException;
    @Override
        try (DBCSession session = DBUtils.openUtilSession(searchMonitor, dataContainer, "Search rows in " + objectName)) {
                for (DBSDataContainer dataContainer : params.sources) {
                switch (attribute.getDataKind()) {
                        operator = DBCLogicalOperator.EQUALS;
            String searchString = params.getSearchString();
    private final SearchDataParams params;
                        break;
        DBNDatabaseNode node = dbnModel.getNodeByObject(monitor, dataContainer, false);
                    continue;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.DBDDataFilter;
            searchResult.fireChange(new AbstractSearchResult.DatabaseSearchFinishEvent(searchResult, totalObjects));
        // First let's search in open editors
                        }
        }
 * you may not use this file except in compliance with the License.
                                        continue;
            throw new DBCException("Error finding rows", e);
            try {
                DBDAttributeConstraint constraint = null;
import org.eclipse.search.ui.ISearchResult;
        }
                        try {
                    IResultSetController rsc = pageEditor.getAdapter(IResultSetController.class);
            int totalObjects = 0;
        @NotNull TestDataReceiver dataReceiver) throws DBCException
                        String typeName = attribute.getTypeName();



        }
                    }
import org.jkiss.dbeaver.model.impl.AbstractExecutionSource;
    @Nullable

        @Override

                        // Do not check value length. Some columns may be compressed/compacted/have special data type and thus have length < than value length.
    private DBDDataFilter searchDataFilterForContainer(@NotNull DBSDataContainer dataContainer, @NotNull DBRProgressMonitor monitor) {
                            operator = DBCLogicalOperator.LIKE;
            log.error("Error searching data in container", e);
        public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
import org.eclipse.core.runtime.Status;

            DBDDataFilter dataFilter = searchDataFilterForContainer(dataContainer, session.getProgressMonitor());
    static SearchDataQuery createQuery(SearchDataParams params) throws DBException {
                    case CONTENT:
            return false;
import org.jkiss.dbeaver.ui.search.AbstractSearchResult;
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
        private DBDDataFilter filter;
        } catch (Exception e) {
                dataReceiver.filter = new DBDDataFilter(constraints);
import org.jkiss.dbeaver.ui.editors.data.DatabaseDataEditor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//                        if (attribute.getMaxLength() > 0 && attribute.getMaxLength() < params.searchString.length()) {
                        if (rscDataContainer == dataContainer) {

                constraints.add(constraint);
    @Override

        if (dataFilter == null) {
                    constraint.setVisible(true);
    }
                        continue;
        if (searchResult == null) {
    @Override
                findRows(session, dataContainer, dataReceiver);
                }
        }
            }
                            }
                    constraint = new DBDAttributeConstraint(attribute, constraints.size());
                                value = uuid.toString();

                    case BOOLEAN:
import org.eclipse.ui.IEditorReference;
    private SearchDataResult searchResult;
                IEditorPart pageEditor = ((EntityEditor) editor).getPageEditor(DatabaseDataEditor.class.getName());
            if (dataReceiver.rowCount > 0) {
            }
            TestDataReceiver dataReceiver = new TestDataReceiver(searchMonitor);
                        }
            return null;
                    constraint = dataFilter.getConstraint(attribute, true);

                searchResult.addObjects(Collections.singletonList(object));

 * DBeaver - Universal Database Manager
            }
                                    }
    private static final Log log = Log.getLog(SearchDataQuery.class);
                        totalObjects++;
                        continue;
        }
                            operator = DBCLogicalOperator.ILIKE;
            //monitor.subTask("Collect tables");
            }
    }
            }
    }
        private SearchTableMonitor searchMonitor;

        TestDataReceiver(SearchTableMonitor searchMonitor) {
                                operator = DBCLogicalOperator.EQUALS;
            return GeneralUtils.makeExceptionStatus(e);
                        }
            if (editor instanceof EntityEditor) {
    }
            if (rowCount >= params.maxResults) {
            dataFilter = ResultSetUtils.restoreDataFilter(dataContainer, monitor);
        } catch (DBException e) {
        }
        SearchTableMonitor searchMonitor = new SearchTableMonitor(monitor);
                if (dataFilter != null) {
                        if (!params.searchLOBs) {
                                    try {
import org.jkiss.dbeaver.model.*;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            continue;
import org.jkiss.code.Nullable;
                    }
        private volatile boolean canceled;
    }
                        }
        return false;
            // Search
                Object value;

                if (pageEditor != null) {
    }
            if (constraints.isEmpty()) {
    }
            } finally {
import org.jkiss.dbeaver.Log;
                // We don't want to break whole search because of one single table.
                searchMonitor.canceled = true;

        @NotNull DBSDataContainer dataContainer,
 * You may obtain a copy of the License at
                        break;
                        } else if (ArrayUtils.contains(supportedOperators, DBCLogicalOperator.EQUALS)) {
                        break;

                    if (searchDataInContainer(monitor, dbnModel, dataContainer)) {
                    }
                }
        public boolean isCanceled() {
    private DBCStatistics findRows(

                constraint.setValue(value);
            monitor.beginTask(
        log.debug("Search in '" + objectName + "'");
/*
        }
 */

        DBSEntity entity;
        }
        @Override
import org.eclipse.search.ui.ISearchQuery;
import org.jkiss.dbeaver.model.struct.DBSEntity;
                                continue;
    public boolean canRerun() {
            try {
                            operator = DBCLogicalOperator.EQUALS;
            }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                        if (!ArrayUtils.contains(supportedOperators, DBCLogicalOperator.EQUALS)) {

    public ISearchResult getSearchResult() {

    private boolean searchDataInContainer(DBRProgressMonitor monitor, DBNModel dbnModel, DBSDataContainer dataContainer) {
            dataReceiver.filter.setAnyConstraint(true);
//                            continue;
                            value = Integer.valueOf(params.searchString);
            return canceled || baseMonitor.isCanceled();
                    case BINARY:
                return null;
    }
            DBCExecutionSource searchSource = new AbstractExecutionSource(dataContainer, session.getExecutionContext(), this);
                            continue;
        if (dataContainer instanceof DBSEntity) {
import org.jkiss.utils.CommonUtils;
        try {
                }
        }
        }
    private SearchDataQuery(SearchDataParams params)
        monitor.subTask("Search in '" + objectName + "'");

                DBCLogicalOperator[] supportedOperators = DBUtils.getAttributeOperators(attribute);
            IEditorPart editor = er.getEditor(false);

                    case STRING:
            log.warn("Data container " + dataContainer + " isn't entity");
            this.baseMonitor = monitor;
    }
                        if (!params.searchNumbers) {
                        } else {
                if (constraint == null) {
                    if (monitor.isCanceled()) {
                            value = "%" + params.searchString + "%";
                        } catch (NumberFormatException e) {
        public void close() {
            // Now we try to find saved data filters for container
 *
                if (DBUtils.isPseudoAttribute(attribute) || DBUtils.isHiddenObject(attribute)) {
        return searchResult;
                            } catch (NumberFormatException e1) {
                SearchDataObject object = new SearchDataObject(node, dataReceiver.rowCount, dataReceiver.filter);
                                    } catch (Exception e3) {
import org.jkiss.utils.ArrayUtils;
        @Override

import org.jkiss.dbeaver.utils.GeneralUtils;
            Set<DBPDataSource> dataSources = new HashSet<>();
//                        }
                "Search \"" + searchString + "\" in " + params.sources.size() + " table(s) / " + dataSources.size() + " database(s)",

        String objectName = DBUtils.getObjectFullName(dataContainer, DBPEvaluationContext.DML);
                            try {
    }
                                } catch (NumberFormatException e2) {
    {
        } catch (DBCException e) {
                                // No a UUID
                DBCLogicalOperator operator;
 *
import org.jkiss.dbeaver.model.navigator.DBNModel;
                                        value = new BigDecimal(params.searchString);
import org.jkiss.dbeaver.model.exec.*;
    public IStatus run(IProgressMonitor m) throws OperationCanceledException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (node == null) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetUtils;
 * Unless required by applicable law or agreed to in writing, software
        return new SearchDataQuery(params);
                    if (DBUtils.findAttributeIndex(session.getProgressMonitor(), attribute) == null) {
    public String getLabel()
            this.searchMonitor = searchMonitor;
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        return dataFilter;
        @NotNull DBCSession session,
 *     http://www.apache.org/licenses/LICENSE-2.0
                            value = "%" + params.searchString + "%";

                        // On success search by exact match
}
 * See the License for the specific language governing permissions and
        }
            DBNModel dbnModel = DBWorkbench.getPlatform().getNavigatorModel();
                log.debug("Fulltext search failed in '" + dataContainer.getName() + "'", e);
 * distributed under the License is distributed on an "AS IS" BASIS,
        private SearchTableMonitor(DBRProgressMonitor monitor) {
                                value = Long.valueOf(params.searchString);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
                            } catch (Exception e) {
        return true;
            } else {

                dataSources.add(searcher.getDataSource());
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        return true;
    @Override
        return params.getSearchString();

                        if (!ArrayUtils.contains(supportedOperators, DBCLogicalOperator.EQUALS)) {


            entity = (DBSEntity) dataContainer;
        public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
 *
            return false;

                                UUID uuid = UUID.fromString(params.searchString);
                }
                                        // Not a number
        public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) throws DBCException {

                                try {
public class SearchDataQuery implements ISearchQuery {
        }
        this.params = params;
        }
            if (dataFilter != null) {
    private class TestDataReceiver implements DBDDataReceiver {
            for (DBSDataContainer searcher : params.sources) {
                    case NUMERIC:
                if (params.fastSearch) {
        } else {
                                }
    private class SearchTableMonitor extends VoidProgressMonitor {

                        if (!params.isCaseSensitive() && ArrayUtils.contains(supportedOperators, DBCLogicalOperator.ILIKE)) {
                        if (typeName.equals(DBConstants.TYPE_NAME_UUID) || typeName.equals(DBConstants.TYPE_NAME_UUID2)) {

    }
        }
                            value = params.searchString;

                return true;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                }
                dataReceiver.filter = dataFilter;
        for (IEditorReference er : UIUtils.getActiveWorkbenchWindow().getActivePage().getEditorReferences()) {
        }
            return Status.OK_STATUS;
                            continue;
                }
import org.eclipse.core.runtime.IStatus;
                params.sources.size());
                        }
                    if (rsc != null) {
package org.jkiss.dbeaver.ui.search.data;
                            continue;
        private int rowCount = 0;


 * limitations under the License.
        @Override
                    monitor.worked(1);
    {
            } catch (DBCException e) {
                }
                monitor.done();
    public boolean canRunInBackground() {
            return dataContainer.readData(searchSource, session, dataReceiver, dataReceiver.filter, -1, -1, 0, 0);
    {
                    }

import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
            DBRProgressMonitor monitor = new DefaultProgressMonitor(m);
                        DBSDataContainer rscDataContainer = rsc.getDataContainer();
                        // Try to convert string to attribute type
        @Override
                        }
                // Search failed in some container - just write an error in log.
                            }


