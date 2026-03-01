                changed = true;
    }
            if (dataSource != null) {
    private long getTotalRowCount(@NotNull DBRProgressMonitor monitor) throws DBException {
                if (!groupFunctions.contains(func)) {
            syntaxManager,

        return true;
        }
import org.jkiss.dbeaver.model.struct.DBSEntity;
            return;
package org.jkiss.dbeaver.ui.controls.resultset.panel.grouping;
 *

    private static final Log log = Log.getLog(GroupingResultsContainer.class);
        DBPDataSource dataSource = getDataContainer().getDataSource();
    public void rebuildGrouping() throws DBException {
        allGroupFunctions.add(function);
                func = DBUtils.getUnQuotedIdentifier(dataSource, func);
    }
    }

                // By default sort by count in desc order
        if (groupAttributes.isEmpty() || groupFunctions.isEmpty()) {

        initDefaultSettings();
        this.dataContainer = new GroupingDataContainer(presentation.getController());
        List<String> allGroupFunctions = new ArrayList<>(getGroupFunctions());
        return allGroupFunctions;
        String function = getDefaultFunction();
        return presentation.getController().getContainer();

            isShowDuplicatesOnly
import org.jkiss.dbeaver.model.sql.*;
        for (SQLGroupingAttribute attr : attributes) {
    }
        }
        for (SQLGroupingAttribute attr : attributes) {
        groupingViewer.resetHistory();
        dataContainer.setGroupingAttributes(groupAttributes.toArray(SQLGroupingAttribute[]::new));

            }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.Log;
    @Nullable
            }
        syntaxManager.init(dialect, presentation.getController().getPreferenceStore());
    public DBCExecutionContext getExecutionContext() {
                super.refreshWithFilter(filter);
    }
        dataContainer.setGroupingQuery(null);
                    orderBy.append(",").append(i + 1);
        groupingViewer.clearDataFilter(false);

            return null;
import org.eclipse.swt.widgets.Composite;
    }
                : ga.getDisplayName())
            if (groupAttributes.contains(attr)) {
    private final AtomicReference<DBDDataFilter> currentFiler = new AtomicReference<>();
    public List<String> getGroupFunctions() {
        }
        }
        return changed;
    }
        );
        if (dataSource != null) {
        return isShowTotalPercentColumn ?
        ));
    }
            dialect,
    @Override
        dataContainer.removeAttributeTransformer();
        groupAttributes.clear();
        boolean changed = false;
import org.jkiss.dbeaver.model.exec.DBCStatistics;
    }
    }


    public void removePercentColumn() {
                var funcAliases = groupingQueryGenerator.getFuncAliases();
        return presentation;
        return changed;
        groupingViewer.getModel().createDataFilter();
import org.jkiss.dbeaver.model.data.DBDDataFilter;


/*
 * See the License for the specific language governing permissions and
            "custom", isCustomQuery,
    private String getDefaultFunction() {
    public boolean removeGroupingFunction(List<String> attributes) {
import java.util.*;
                ? boundAttribute.getBindingName()
        }
            new PercentOfTotalGroupingAttributeTransformer(this::getTotalRowCount)
        groupingViewer.setDataFilter(dataFilter, true);
 */
import org.jkiss.utils.CommonUtils;
        SQLDialect dialect = SQLUtils.getDialectFromDataSource(dataSource);
                if (groupFunctions.contains(func)) {

                }
    private void resetDataFilters() {
    }
        if (!(groupingViewer.getActivePresentation() instanceof EmptyPresentation)) {
            : getGroupFunctions();
        return presentation.getController().getExecutionContext();
            groupingViewer.showEmptyPresentation();
        }
        return DBUtils.readRowCount(
        var groupingQueryGenerator = new SQLGroupingQueryGenerator(
        );
    public IResultSetController getResultSetController() {
                int countPosition = groupAttributes.size() + 1;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    }
import org.jkiss.dbeaver.ui.controls.resultset.*;
    public List<SQLGroupingAttribute> getGroupAttributes() {
}
            addPercentageColumn()
        DBDDataFilter newFilter = new DBDDataFilter(attributeConstraints);
import org.jkiss.dbeaver.model.impl.data.transformers.PercentOfTotalGroupingAttributeTransformer;
        if (dataSource == null) {
    }


    }
                groupAttributes.remove(attr);
            filterExcludingGroupingColumns(),

            .getBoolean(ResultSetPreferences.RS_GROUPING_SHOW_DUPLICATES_ONLY);

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    public boolean removeGroupingAttribute(List<SQLGroupingAttribute> attributes) {
            }

        DBDDataFilter dataFilter = currentFiler.get();
        return new GroupingResultsDecorator(this);

        this.groupingViewer = new ResultSetViewer(parent, presentation.getController().getSite(), this) {
    @NotNull
        boolean isDefaultGrouping = groupFunctions.size() == 1 && groupFunctions.get(0).equalsIgnoreCase(getDefaultFunction());
            groupAttributes,
        this.groupAttributes.clear();
            ? new DBDDataFilter()
 * Unless required by applicable law or agreed to in writing, software

                dataFilter.setOrder(funcAliases[funcAliases.length - 1] + " " + defaultSorting);

        }
        DBDDataFilter dataFilter = getDataFilter();
            if (false/*dialect.supportsOrderByIndex()*/) {
        addGroupingAttributes(attributes);
            throw new DBException("No active datasource");
            groupingViewer

                func = DBUtils.getUnQuotedIdentifier(dataSource, func);
    public IResultSetContainer getParentContainer() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void openNewContainer(DBRProgressMonitor monitor, @NotNull DBSDataContainer dataContainer, @NotNull DBDDataFilter newFilter) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final List<SQLGroupingAttribute> groupAttributes = new ArrayList<>();
            .map(dataFilter::getConstraint)
    }
    @Override
        dataContainer.setGroupingQuery(groupingQueryGenerator.generateGroupingQuery(queryText));
            throw new DBException("No main query - can't perform grouping");
    }
    public IResultSetDecorator createResultSetDecorator() {
    private final ResultSetViewer groupingViewer;
    void setGrouping(List<SQLGroupingAttribute> attributes, List<String> functions) {
        this.groupFunctions.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0


import java.util.concurrent.atomic.AtomicReference;
        for (String func : functions) {
            .getBoolean(ResultSetPreferences.RS_GROUPING_SHOW_PERCENT_OF_TOTAL_ROWS);
        return groupFunctions;
            monitor,
    }
        return FUNCTION_COUNT + "(" +
            if (!groupAttributes.contains(attr)) {
        boolean isShowDuplicatesOnly = dataSource.getContainer().getPreferenceStore()
 * DBeaver - Universal Database Manager
            for (String func : attributes) {
                groupAttributes.add(attr);
    @Override
        if (dataFilter == null) {

            @Override
    @Override
                dataFilter.setOrder(orderBy.toString());
    @NotNull
        addGroupingFunctions(Collections.singletonList(getDefaultFunction()));
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
    public static final String FUNCTION_COUNT = "COUNT";
        }

public class GroupingResultsContainer implements IResultSetContainer {

            : dataContainer.getDataSource().getContainer().getProject();
                dataSource.getSQLDialect().getDefaultGroupAttribute()) + ")";
            ? null
    public void addGroupingFunctions(List<String> functions) {
            percentFunctionOrderInStatement,
    }

    private final List<String> groupFunctions = new ArrayList<>();

        }
        return groupingViewer;
        DataEditorFeatures.RESULT_SET_PANEL_GROUPING.use(Map.of(
    }
 * You may obtain a copy of the License at
    }
    @Nullable
        List<DBDAttributeConstraint> attributeConstraints = groupAttributes.stream()
    public boolean isReadyToRun() {

        int percentFunctionOrderInStatement = getGroupAttributes().size() + allGroupFunctions.size() - 1;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        groupAttributes.clear();
    private DBDDataFilter filterExcludingGroupingColumns() {
    }

    }
        DBCStatistics statistics = presentation.getController().getModel().getStatistics();
                currentFiler.set(filter);
 *
    private DBDDataFilter getDataFilter() {
        }
    @Override
                    groupFunctions.add(func);
    private List<String> getGroupFunctionsWithExtraColumns(@NotNull DBPDataSource dataSource) {
        return dataContainer == null || dataContainer.getDataSource() == null
 * limitations under the License.
            getGroupFunctionsWithExtraColumns(dataSource),
import org.jkiss.dbeaver.ui.controls.resultset.view.EmptyPresentation;
        boolean changed = false;
            "default", isDefaultGrouping,
    private void initDefaultSettings() {
    }

        groupingViewer.clearData(true);
    @Override
        boolean isShowTotalPercentColumn = dataSource.getContainer().getPreferenceStore()
        if (changed) {
            .map(ga -> ga instanceof SQLGroupingAttribute.BoundAttribute boundAttribute

        newFilter.setWhere(dataFilter.getWhere());
        DBPDataSource dataSource = dataContainer.getDataSource();
    void clearGroupingAttributes() {
import org.jkiss.dbeaver.ui.DataEditorFeatures;
            DBPDataSource dataSource = getDataContainer().getDataSource();
            : new DBDDataFilter(groupingViewer.getModel().getDataFilter());
            }
            "dups", isShowDuplicatesOnly
        groupFunctions.clear();
            .filter(Objects::nonNull).toList();
    public IResultSetPresentation getOwnerPresentation() {
        DBPDataSource dataSource = dataContainer.getDataSource();
import org.jkiss.code.Nullable;

        DBSDataContainer dbsDataContainer = presentation.getController().getDataContainer();
import org.jkiss.dbeaver.model.DBUtils;
    public void clearGrouping() {
    private final GroupingDataContainer dataContainer;

        initDefaultSettings();
        );
            } else {
                    changed = true;
        addGroupingFunctions(functions);
    }
                }
    private final IResultSetPresentation presentation;
        return groupAttributes;
    }
                orderBy.append(countPosition).append(" ").append(defaultSorting);

        String queryText = statistics.getQueryText();


        DBSDataContainer dataContainer = getDataContainer();
            presentation.getController().getDataContainer(),
        boolean isCustomQuery = !(dbsDataContainer instanceof DBSEntity);
                StringBuilder orderBy = new StringBuilder();
                for (int i = 0; i < groupAttributes.size(); i++) {
        return presentation.getController().getModel().isMetadataChanged()
    public DBPProject getProject() {
    }

            }
    }
            (dataSource == null ? SQLConstants.COLUMN_ASTERISK :
 * you may not use this file except in compliance with the License.
        return this.dataContainer;
            groupingViewer.showEmptyPresentation();
        String defaultSorting = dataSource.getContainer().getPreferenceStore().getString(ResultSetPreferences.RS_GROUPING_DEFAULT_SORTING);
    @Override
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        resetDataFilters();
import org.jkiss.dbeaver.model.DBPDataSource;
    private List<String> addPercentageColumn() {
        return newFilter;
        if (!CommonUtils.isEmpty(defaultSorting) && isDefaultGrouping) {
            resetDataFilters();
    public GroupingResultsContainer(Composite parent, IResultSetPresentation presentation) {
    @Nullable
            groupingViewer.getExecutionContext(),
        if (statistics == null) {
        };
    public DBSDataContainer getDataContainer() {
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.app.DBPProject;
        this.presentation = presentation;
            }
                }

 *
        dataContainer.removeAttributeTransformer();

    void addGroupingAttributes(List<SQLGroupingAttribute> attributes) {

        dataContainer.setAttributeTransformer(
        }
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
            public void refreshWithFilter(DBDDataFilter filter) {

 * distributed under the License is distributed on an "AS IS" BASIS,
                    groupFunctions.remove(func);
            dataSource,
    @NotNull
    @Nullable
        dataContainer.setGroupingAttributes(null);
            dbsDataContainer,
