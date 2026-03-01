    }
    private Integer cpuWeight;
            this.groupRamLimit = JDBCUtils.safeGetBigDecimal(dbResult, "GROUP_TEMP_DB_RAM_LIMIT");
import java.sql.ResultSet;
    }
    @Override

    }
    @Override
            super.setName(groupName);
    private BigDecimal groupId = new BigDecimal(-1);
    public void setGroupRamLimit(BigDecimal groupRamLimit) {
    public int getCpuWeight() {
    @Property(viewable = true, editable = true, updatable = true, order = 70)
    public void setCpuWeight(int weight) {
    }
    public String getName() {
    private Boolean persisted;
    @Override
    public boolean isPersisted() {

 * you may not use this file except in compliance with the License.


    }
    private Integer precedence;
        if (dbResult != null) {
    @Property(viewable = true, editable = false, updatable = false, order = 60)
import org.jkiss.dbeaver.model.DBPNamedObject2;
    public void setPersisted(boolean persisted) {
    @Property(viewable = true, editable = false, updatable = false, order = 25)
        this.precedence = precedence;

    @Override

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            this.cpuWeight = JDBCUtils.safeGetInt(dbResult, "CPU_WEIGHT");
        @NotNull String name,
        this.precedence = precedence;
    }
    public DBSObject getParentObject() {
 *     http://www.apache.org/licenses/LICENSE-2.0

        this.dataSource = dataSource;
import java.sql.Date;
            this.userRamLimit = JDBCUtils.safeGetBigDecimal(dbResult, "USER_TEMP_DB_RAM_LIMIT");
        }
    public String getDescription() {
    @Property(viewable = true, editable = true, updatable = true, order = 20)
        this.groupName = name;
    }
    @Property(viewable = true, editable = true, updatable = true, order = 30)



        this.dataSource = dataSource;
    public BigDecimal getGroupId() {


    }
            this.precedence = JDBCUtils.safeGetInteger(dbResult, "PRECEDENCE");
        @Nullable BigDecimal sessionRamLimit,
        this.sessionRamLimit = sessionRamLimit;

 *

        @NotNull Integer cpuWeight,
        return this.dataSource;

        this.groupRamLimit = groupRamLimit;
        this.cpuWeight = cpuWeight;
        ((ExasolDataSource) getDataSource()).refreshObject(monitor);
    @Property(viewable = true, editable = true, updatable = true, order = 50)
    private ExasolDataSource dataSource;
    }

    @NotNull
        @NotNull ExasolDataSource dataSource,
import org.jkiss.code.NotNull;

/*
            super.setDescription(comment);
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.meta.Property;
    public BigDecimal getUserRamLimit() {
        return comment;
            this.persisted = true;
            this.created = JDBCUtils.safeGetDate(dbResult, "CREATED");
package org.jkiss.dbeaver.ext.exasol.model;
        super(dataSource, "", "");
        this.comment = comment;
    @Property(viewable = true, editable = true, updatable = true, order = 55)

        return this.persisted;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    private Date created;
import org.jkiss.code.Nullable;

    public ExasolConsumerGroup(

        this.persisted = false;
        @Nullable Integer precedence,
        return this.dataSource.getContainer();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public BigDecimal getGroupRamLimit() {
 * You may obtain a copy of the License at
    private BigDecimal userRamLimit;
    }

        return groupRamLimit;
        @Nullable BigDecimal groupRamLimit,
            this.groupName = JDBCUtils.safeGetString(dbResult, "CONSUMER_GROUP_NAME");
    }
import org.jkiss.dbeaver.model.DBPSaveableObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software

    public Integer getPrecedence() {
    public ExasolConsumerGroup(@NotNull ExasolDataSource dataSource, @Nullable ResultSet dbResult) {
        return groupName;
            this.groupId = JDBCUtils.safeGetBigDecimal(dbResult, "CONSUMER_GROUP_ID");
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String comment = "";
    ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.DBException;
 */
    }
    public void setDescription(String comment) {
        return userRamLimit;


 * limitations under the License.
    private String groupName;
    @Override
    private BigDecimal groupRamLimit;
}

            this.sessionRamLimit = JDBCUtils.safeGetBigDecimal(dbResult, "SESSION_TEMP_DB_RAM_LIMIT");
        return created;
        @Nullable BigDecimal userRamLimit,
    @Override
        return sessionRamLimit;
 *
        this.cpuWeight = weight;
    }
        this.userRamLimit = userRamLimit;
            this.cpuWeight = JDBCUtils.safeGetInteger(dbResult, "CPU_WEIGHT");
            this.comment = JDBCUtils.safeGetString(dbResult, "CONSUMER_GROUP_COMMENT");
    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
    @Property(viewable = true, editable = true, updatable = true, order = 10)
import org.jkiss.dbeaver.model.DBPRefreshableObject;
        return this;
    public Date getCreated() {
    public void setPrecedence(Integer precedence) {

        this.groupName = groupName;

 * DBeaver - Universal Database Manager
    }
        this.userRamLimit = userRamLimit;
        this.comment = comment;
    public ExasolDataSource getDataSource() {
        @Nullable String comment
    }

    }

    @Property(viewable = true, editable = true, updatable = true, order = 40)

    private BigDecimal sessionRamLimit;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
    }
    @Override
        throws DBException {
public class ExasolConsumerGroup extends ExasolPriority implements DBPRefreshableObject, DBPNamedObject2, DBPSaveableObject {
    @NotNull
        super(dataSource, name, comment);
        return groupId;
        return precedence;
import java.math.BigDecimal;
    public void setName(@NotNull String groupName) {
    public void setSessionRamLimit(BigDecimal sessionRamLimit) {
    }
        this.groupRamLimit = groupRamLimit;
    public BigDecimal getSessionRamLimit() {
    public void setUserRamLimit(BigDecimal userRamLimit) {
    }
        return cpuWeight;
        this.persisted = persisted;
    }
        this.sessionRamLimit = sessionRamLimit;
