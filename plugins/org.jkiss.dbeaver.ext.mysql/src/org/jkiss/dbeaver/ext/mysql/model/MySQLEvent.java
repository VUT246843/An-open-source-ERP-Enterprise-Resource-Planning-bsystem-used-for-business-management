    private long originator;
 */

        return intervalValue;
    }
    }
    private String intervalField;
    public void setIntervalField(String intervalField) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }

        this.intervalValue = intervalValue;
    public String getDescription() {
        if (ends != null) {

        this.timeZone = JDBCUtils.safeGetString(dbResult, "TIME_ZONE");
    }
        this.persisted = persisted;
    @NotNull
        this.intervalField = intervalField;
        this.eventDefinition = eventDefinition;
    @Property(viewable = true, order = 1)
 */

import java.util.Date;
    public MySQLCharset getCharacterSetClient() {
    }
    @Property(viewable = true, order = 12, updatable = true)
        this.loadInfo(dbResult);

    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = JDBCUtils.safeGetString(dbResult, "EVENT_DEFINITION");
            sql.append("ON COMPLETION ").append(onCompletion).append("\n");
    @Override
    private String eventDefinition;
        this.intervalValue = JDBCUtils.safeGetString(dbResult, "INTERVAL_VALUE");
    @Override
    }

        this.status = status;
    }
    }
    public String getName() {
    @Override
import org.jkiss.code.NotNull;
    @Override

    public void setObjectDefinitionText(String sourceText) {
        this.intervalField = JDBCUtils.safeGetString(dbResult, "INTERVAL_FIELD");
    public DBSObject getParentObject() {


    }
        return collationConnection;


            sql.append("STARTS '").append(dateFormat.format(starts)).append("'\n");
    private String onCompletion;
    private String definer;

/**
    private void loadInfo(ResultSet dbResult)

    private String eventType;
    }
    }
        sql.append(CommonUtils.getOption(options, OPTION_OBJECT_ALTER) ? "ALTER" : "CREATE");
        }
 * you may not use this file except in compliance with the License.
    }
        this.lastExecuted = JDBCUtils.safeGetTimestamp(dbResult, "LAST_EXECUTED");
        this.persisted = true;
    @Property(category = DBConstants.CAT_STATISTICS, order = 37)
        return persisted;
    public long getOriginator() {
        this.lastAltered = JDBCUtils.safeGetTimestamp(dbResult, "LAST_ALTERED");
    private String status;

    @Property(category = CAT_DETAILS, order = 32)

        sql.append(" EVENT ").append(DBUtils.getQuotedIdentifier(this)).append("\n");
    public void setOnCompletion(String onCompletion) {
        return lastExecuted;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
        this.databaseCollation = getDataSource().getCollation(JDBCUtils.safeGetString(dbResult, "DATABASE_COLLATION"));
    private static final String CAT_DETAILS = "Details";
        this.eventComment = description;
    public String getDefiner() {
    @Override

    private String intervalValue;
            sql.append("COMMENT '").append(SQLUtils.escapeString(getDataSource(), eventComment)).append("'\n");
        return databaseCollation;
    public MySQLEvent(MySQLCatalog catalog, String name) {
        return executeAt;
        if (!CommonUtils.isEmpty(eventComment)) {
    private MySQLCollation collationConnection;
        } else {

        }
    @Override
        this.eventBody = JDBCUtils.safeGetString(dbResult, "EVENT_BODY");

        sql.append("DO ").append(eventDefinition);
    public void setEventBody(String eventBody) {
        this.collationConnection = getDataSource().getCollation(JDBCUtils.safeGetString(dbResult, "COLLATION_CONNECTION"));

        if (!CommonUtils.isEmpty(onCompletion)) {
    public void setName(String name) {
    }
public class MySQLEvent implements MySQLSourceObject, DBPSaveableObject, DBPQualifiedObject {
        return intervalField;
import java.util.Map;
    public Date getEnds() {
 * See the License for the specific language governing permissions and
        this.characterSetClient = getDataSource().getCharset(JDBCUtils.safeGetString(dbResult, "CHARACTER_SET_CLIENT"));
    public String getIntervalField() {
        }

        return catalog.getDataSource();
    public Date getCreated() {
    @Property(viewable = true, category = CAT_DETAILS, order = 14, updatable = true)
        this.catalog = catalog;


        return ends;
    private String eventComment;
        this.catalog = catalog;

    public Date getLastAltered() {
    public String getStatus() {
        this.sqlMode = JDBCUtils.safeGetString(dbResult, "SQL_MODE");

    private Date executeAt;

 * limitations under the License.
        return characterSetClient;
/*
        StringBuilder sql = new StringBuilder();
    private MySQLCharset characterSetClient;
        this.originator = JDBCUtils.safeGetLong(dbResult, "ORIGINATOR");
        this.definer = JDBCUtils.safeGetString(dbResult, "DEFINER");

    private String sqlMode;
import org.jkiss.dbeaver.model.meta.Property;
    public String getEventBody() {
    @Property(viewable = true, order = 13, updatable = true)

    public MySQLCollation getCollationConnection() {
        return status;

    @Property(category = CAT_DETAILS, order = 36, updatable = true)
    public String getEventType() {
    private transient String eventFullDefinitionText;
        this.status = JDBCUtils.safeGetString(dbResult, "STATUS");

 *
    @Override
        return sql.toString();
    public String getIntervalValue() {
        return eventComment;
    }
    @Property(category = CAT_DETAILS, order = 30)
    public void setStatus(String status) {
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 10)
 * Unless required by applicable law or agreed to in writing, software



    public MySQLDataSource getDataSource() {
        eventFullDefinitionText = sourceText;

        this.onCompletion = onCompletion;
    @Property(hidden = true, editable = true, updatable = true, order = -1)

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

package org.jkiss.dbeaver.ext.mysql.model;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
        if (intervalValue != null && intervalField != null) {

    @Property(category = CAT_DETAILS, order = 41)
    public boolean isPersisted() {
        this.eventComment = JDBCUtils.safeGetString(dbResult, "EVENT_COMMENT");
    }
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Property(category = DBConstants.CAT_STATISTICS, order = 38)
            "ENABLED".equals(status) ? "ENABLE" :
        return DBUtils.getFullQualifiedName(getDataSource(),
    }
            return eventFullDefinitionText;
    private MySQLCatalog catalog;
                "DISABLED".equals(status) ? "DISABLE" : "DISABLE ON SLAVE"
        sql.append(
import java.text.DateFormat;
        this.eventBody = eventBody;
    private String name;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
                catalog,
        return timeZone;
import org.jkiss.dbeaver.model.*;
    }
            sql.append("ON SCHEDULE AT '").append(dateFormat.format(executeAt)).append("'\n");
    @Property(category = CAT_DETAILS, order = 34)
    public Date getStarts() {
    @Property(category = DBConstants.CAT_STATISTICS, order = 35, updatable = true)
    public MySQLCatalog getCatalog() {
        return lastAltered;
            sql.append("ON SCHEDULE AT CURRENT_TIMESTAMP\n");

import org.jkiss.dbeaver.DBException;
        return created;

        return onCompletion;
import org.jkiss.dbeaver.model.meta.PropertyLength;
        }
        }
    @Property(category = CAT_DETAILS, order = 33)
        if (starts != null) {
    @Property(category = CAT_DETAILS, order = 43)
        this.executeAt = JDBCUtils.safeGetTimestamp(dbResult, "EXECUTE_AT");
        this.onCompletion = JDBCUtils.safeGetString(dbResult, "ON_COMPLETION");

    }
        this.name = name;
            sql.append("ENDS '").append(dateFormat.format(ends)).append("'\n");
        return originator;
 * MySQLEvent
    }
        return sqlMode;
        return name;
import org.jkiss.utils.CommonUtils;
    private String eventBody;
    }
        return eventType;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Date getLastExecuted() {
    private boolean persisted;
    }
    public MySQLCollation getDatabaseCollation() {
    @Property(viewable = true, length = PropertyLength.MULTILINE, category = CAT_DETAILS, order = 100, updatable = true)
        return eventBody;
    public String getOnCompletion() {
    private Date ends;
        this.name = name;
        return catalog;
        this.ends = JDBCUtils.safeGetTimestamp(dbResult, "ENDS");
    @Nullable
import java.sql.SQLException;
    }
        throws SQLException {
    @Property(category = CAT_DETAILS, order = 40)
            sql.append("ON SCHEDULE EVERY ").append(intervalValue).append(" ").append(intervalField).append("\n");
        this.name = JDBCUtils.safeGetString(dbResult, "EVENT_NAME");
    private Date lastAltered;
    @Property(viewable = true, order = 11)
    }
    }
import org.jkiss.code.Nullable;
        ).append("\n");
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Property(category = CAT_DETAILS, order = 42)
    }
        throws SQLException {
        this.eventType = JDBCUtils.safeGetString(dbResult, "EVENT_TYPE");
        this.created = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");
    public Date getExecuteAt() {
    }
 *
}
 *

    private Date created;
    public MySQLEvent(MySQLCatalog catalog, ResultSet dbResult)

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private Date lastExecuted;
    @NotNull
    private String timeZone;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DateFormat dateFormat = new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT);
import org.jkiss.dbeaver.model.struct.DBSObject;
    }

                this);
        return catalog;
    public void setIntervalValue(String intervalValue) {

    @NotNull

    public void setDescription(String description) {
        this.starts = JDBCUtils.safeGetTimestamp(dbResult, "STARTS");


        if (eventFullDefinitionText != null) {
    }
        this.persisted = false;
    public String getSqlMode() {
    }
    }
        } else if (executeAt != null) {
    public String getTimeZone() {
    }

        }
        return starts;
    }
    }
    @Property(category = CAT_DETAILS, order = 31)
    private MySQLCollation databaseCollation;
        return definer;
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    private Date starts;
    public void setPersisted(boolean persisted) {
    @Property(category = DBConstants.CAT_STATISTICS, order = 39)
 * DBeaver - Universal Database Manager

