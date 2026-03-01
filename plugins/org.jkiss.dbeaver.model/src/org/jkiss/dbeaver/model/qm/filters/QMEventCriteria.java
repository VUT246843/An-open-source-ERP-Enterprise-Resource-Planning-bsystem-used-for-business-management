 * Unless required by applicable law or agreed to in writing, software




    }
    public QMSortField getSortField() {

    public boolean hasObjectTypes() {
    @NotNull

    @NotNull
 * limitations under the License.
    }
        this.dataSourceIds = dataSourceIds;
    private Set<String> catalogs = Collections.emptySet();
        return skipEmptyQueries;
    @NotNull
    }
    }
 * DBeaver - Universal Database Manager
    }
    private String containerId;
        this.containerId = containerId;


    private DBCExecutionPurpose[] queryTypes = new DBCExecutionPurpose[0];
    }





        return objectTypes;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public boolean hasEventStatuses() {
    }
        return objectTypes.length > 0 && ArrayUtils.contains(objectTypes, type);
    }
    }
    private Set<String> dataSourceIds = Collections.emptySet();

    @NotNull
    @NotNull
    @Nullable
        return driverIds;
    @Nullable
        return lastEventId != null;
        // If all query types are here it is the same as no query type
 */
public class QMEventCriteria {
    }
    }
    }
    @NotNull
        return dataSourceIds;
    private Set<String> projectIds = Collections.emptySet();
    public void setEventStatuses(@NotNull Set<QMEventStatus> eventStatuses) {
    }
    public String getSearchString() {
    }
        return queryTypes;
    }
    }


        this.sessionId = sessionId;

    @Nullable
        return fetchingSize;



    public String getContainerId() {
        return queryTypes.length > 0 && ArrayUtils.contains(queryTypes, type);
    public void setSortField(@NotNull QMSortField sortField) {
    @Nullable

        this.lastEventId = lastEventId;
        this.objectTypes = objectTypes;
    public boolean hasProjectIds() {
    }
    public Long getLastEventId() {
    public void setSessionId(Long sessionId) {

    public void setCatalogs(@NotNull Set<String> catalogs) {
    public boolean hasQueryType(DBCExecutionPurpose type) {
    }
    public Set<QMEventStatus> getEventStatuses() {
    private Long sessionId;
        return containerId;
 *
    @Nullable

 *
    @NotNull
        this.projectIds = projectIds;
    }
    }
        this.desc = desc;
        return !(sessionId == null || sessionId == 0);
    }
    private QMObjectType[] objectTypes = new QMObjectType[0];
    public boolean hasQueryTypes() {
        return desc;

 */
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Nullable
    @NotNull
 *
        this.queryTypes = queryTypes;

    }
        this.eventStatuses = eventStatuses;

        return projectIds;
    }
    public void setDesc(boolean desc) {
        return !eventStatuses.isEmpty() && eventStatuses.size() < QMEventStatus.values().length;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Long lastEventId;
    private Set<String> schemas = Collections.emptySet();
    @Nullable
 * See the License for the specific language governing permissions and


    public void setObjectTypes(QMObjectType[] objectTypes) {

    public void setDataSourceIds(@NotNull Set<String> dataSourceIds) {
    public void setFetchingSize(int fetchingSize) {

        return catalogs;
        return objectTypes.length > 0 && objectTypes.length != QMObjectType.values().length;
    }
    public void setDriverIds(@NotNull Set<String> driverIds) {
import org.jkiss.dbeaver.model.qm.QMObjectType;
    public void setContainerId(String containerId) {
    }

import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;

    @NotNull
    public QMDateRange getDateRange() {
        this.searchString = searchString;
    public void setSearchString(String searchString) {
    @Nullable
        this.skipEmptyQueries = skipEmptyQueries;
 * You may obtain a copy of the License at
        return !projectIds.isEmpty();
    private QMSortField sortField = QMSortField.DATE;
    }
    }

package org.jkiss.dbeaver.model.qm.filters;
        this.startDateRange = startDateRange;

    public Set<String> getSchemas() {

    @NotNull
    public Set<String> getCatalogs() {

        this.schemas = schemas;
        return eventStatuses;
    }
    public void setQueryTypes(DBCExecutionPurpose[] queryTypes) {
        return queryTypes.length > 0 && queryTypes.length != DBCExecutionPurpose.values().length;
    @NotNull
    public int getFetchingSize() {
    private boolean desc = true;
    @NotNull
    public DBCExecutionPurpose[] getQueryTypes() {

    public void setProjectIds(@NotNull Set<String> projectIds) {
    @Nullable
import java.util.Collections;
import org.jkiss.code.NotNull;
        // If all object types are here it is the same as no object type
    }
    public Set<String> getDataSourceIds() {
    public void setDateRange(@Nullable QMDateRange startDateRange) {
        return !driverIds.isEmpty();
    private boolean skipEmptyQueries = false;
import java.util.Set;
    }
    public boolean hasObjectType(QMObjectType type) {

    private Set<QMEventStatus> eventStatuses = Collections.emptySet();

    }
    }

    }
        this.sortField = sortField;
    }
    public Set<String> getDriverIds() {
    public boolean hasSessionId() {
    @NotNull
    @NotNull
    public boolean isSkipEmptyQueries() {

        return startDateRange;
    }
/**
    private Set<String> driverIds = Collections.emptySet();
    @Nullable
    public boolean hasDriverIds() {
 * you may not use this file except in compliance with the License.
    public Long getSessionId() {
        return schemas;
    }


    private int fetchingSize = 200;
        this.catalogs = catalogs;

        return searchString;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        return lastEventId;
        return sortField;
    private String searchString;
    }
    public QMObjectType[] getObjectTypes() {
    public void setSkipEmptyQueries(boolean skipEmptyQueries) {
    public void setSchemas(@NotNull Set<String> schemas) {
    private QMDateRange startDateRange;

    public void setLastEventId(@Nullable Long lastEventId) {
    @NotNull
    public boolean hasLastEventId() {
        return sessionId;
    }
        this.fetchingSize = fetchingSize;
import org.jkiss.utils.ArrayUtils;
    public boolean isDesc() {
    }
        this.driverIds = driverIds;
/*

    }
 * QM event criteria
import org.jkiss.code.Nullable;
    public Set<String> getProjectIds() {

