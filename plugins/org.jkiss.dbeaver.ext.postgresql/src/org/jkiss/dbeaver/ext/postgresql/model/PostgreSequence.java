        }

            sql.append(" ");
            additionalInfo.loaded = true;
import java.util.ArrayList;
import org.jkiss.code.NotNull;
        return DBSEntityType.SEQUENCE;

            log.warn("Error reading sequence values", e);
                            additionalInfo.maxValue = JDBCUtils.safeGetLong(seqResults, "max_value");
    public boolean supportsCacheAndCycle() {
            return additionalInfo;
            } else {


        private long incrementBy;
    public PostgreSequence(PostgreSchema catalog) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        private volatile boolean loaded = false;
                            additionalInfo.lastValue = JDBCUtils.safeGetLongNullable(seqResults, "last_value");
        }
        }
        @Property(viewable = true, editable = true, updatable = true, order = 25, visibleIf = CacheAndCycleValidator.class)

                    try (JDBCResultSet seqResults = dbSeqStat.executeQuery()) {
            return object.supportsCacheAndCycle();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
                try (JDBCPreparedStatement dbSeqStat = session.prepareStatement(
            .append("CREATE SEQUENCE ").append(DBUtils.getEntityScriptName(this, options));
 *
        public void setCacheValue(long cacheValue) {
        @Property(viewable = true, editable = true, updatable = true, order = 22)
        public void setStartValue(long startValue) {
     */
    @Override
                            additionalInfo.cacheValue = JDBCUtils.safeGetLong(seqResults, "cache_size");
            this.maxValue = maxValue;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return additionalInfo;
            sql.append("NO MAXVALUE");
    private static final Log log = Log.getLog(PostgreSequence.class);
        public long getStartValue() {
        public void setLoaded(boolean loaded) {
    public String[] getRelOptions() {
        if (!actions.isEmpty()) {

        }
        public boolean isCycled() {
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<PostgreSequence> {
    }
import org.jkiss.dbeaver.model.sql.SQLUtils;
package org.jkiss.dbeaver.ext.postgresql.model;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
                            additionalInfo.minValue = JDBCUtils.safeGetLong(seqResults, "min_value");
 *
            this.loaded = loaded;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void addIndentation(@NotNull StringBuilder sql, boolean hasIndentation) {
            sql.append("MINVALUE ").append(info.getMinValue());

     * @param sql StringBuilder to append query parts
/**
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (hasIndentation) {
    }
            addIndentation(sql, hasIndentation);

        }
        sql.append(info.isCycled() ? "" : "NO ").append("CYCLE");
import org.jkiss.dbeaver.model.DBUtils;
    }
import org.jkiss.utils.CommonUtils;
/*
                        }
		if (!CommonUtils.isEmpty(getDescription())) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
public class PostgreSequence extends PostgreTableBase implements DBSSequence, DBPQualifiedObject
            this.minValue = minValue;
        }
        }
            addIndentation(sql, hasIndentation);
            return cacheValue;
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                            additionalInfo.cacheValue = JDBCUtils.safeGetLong(seqResults, "cache_size");
                    "SELECT * from " + getFullyQualifiedName(DBPEvaluationContext.DML))) {
        return additionalInfo.minValue;
    }
    @Override

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @NotNull
            return minValue;
        }
    @Override
        } else {
            sql.append("\n\t");
        public long getCacheValue() {
        } catch (Exception e) {

        

import org.jkiss.dbeaver.Log;
            .append("-- DROP SEQUENCE ").append(DBUtils.getEntityScriptName(this, options)).append(";\n\n")
        StringBuilder sql = new StringBuilder()
        private Long lastValue;


    }
        return null;
    }
        }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load sequence additional info")) {
            addIndentation(sql, hasIndentation);
    public static class CacheAndCycleValidator implements IPropertyValueValidator<PostgreSequence, Object> {
    @Override
 *

        throws DBCException {
            this.startValue = startValue;
        @Property(viewable = true, editable = true, updatable = true, order = 21)
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
        sql.append(';');
        return sql.toString();
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
        if (info.getMaxValue() > 0) {
     * Adds sequence body parts - only parameters - into the StringBuilder

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObjectType;
                            additionalInfo.startValue = JDBCUtils.safeGetLong(seqResults, "start_value");
        }
    }
                            additionalInfo.lastValue = JDBCUtils.safeGetLongNullable(seqResults, "last_value");
                            additionalInfo.startValue = JDBCUtils.safeGetLong(seqResults, "start_value");
        return super.refreshObject(monitor);
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        if (info.getCacheValue() > 0) {
    }

        }
		}
    @Override

                        if (seqResults.next()) {
        }
    }
                }
        }
    public void setObjectDefinitionText(String sourceText) throws DBException {
    // Entity
        if (info.getIncrementBy() > 0) {



                            additionalInfo.minValue = JDBCUtils.safeGetLong(seqResults, "min_value");
    public static class AdditionalInfo {
import org.jkiss.dbeaver.model.meta.*;
    public DBSEntityType getEntityType() {
        }

        }
 * See the License for the specific language governing permissions and
    @Override
                    dbSeqStat.setString(2, getName());
import org.jkiss.dbeaver.model.struct.DBSEntityType;
    }
import java.util.Collection;
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
            sql.append("CACHE ").append(info.getCacheValue());
        getSequenceBody(monitor, sql, true);
    }
        public long getIncrementBy() {
import java.util.List;
    }
        public long getMaxValue() {
     *
        public boolean isPropertyCached(@NotNull PostgreSequence object, @NotNull Object propertyId)
 */
            if (!additionalInfo.loaded) {
            this.incrementBy = incrementBy;
        super(schema, dbResult);
 * You may obtain a copy of the License at
            sql.append(SQLUtils.generateScript(getDataSource(), actions.toArray(new DBEPersistAction[actions.size()]), false));

     * @param hasIndentation add or not add tabulation and new line in the result
    @Override

					.append(SQLUtils.quoteString(this, getDescription())).append(";");
            sql.append("MAXVALUE ").append(info.getMaxValue());
    @Override
import org.jkiss.code.Nullable;
            }
 * limitations under the License.
                    dbSeqStat.setString(1, getSchema().getName());
        PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
    }
}
        private long maxValue;
    @Override
    }
    public Number getMaxValue() {
    public PostgreSequence(PostgreSchema schema, JDBCResultSet dbResult) {
        public boolean isValidValue(@NotNull PostgreSequence object, @Nullable Object value) throws IllegalArgumentException {
        public long getMinValue() {
        public void setLastValue(long lastValue) {
        return true;

            isCycled = cycled;

        @Override
        List<DBEPersistAction> actions = new ArrayList<>();
        AdditionalInfo info = getAdditionalInfo(monitor);
        if (info.getStartValue() >= 0) {
    public Number getIncrementBy() {
                try (JDBCPreparedStatement dbSeqStat = session.prepareStatement(
import org.jkiss.dbeaver.model.DBPScriptObject;

            return object.additionalInfo.loaded;
        private long startValue;
    @Override
            return isCycled;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPQualifiedObject;

        }
 */
    }

    @Override
    @Override
        additionalInfo.loaded = false;
        return "ALTER SEQUENCE " + DBUtils.getEntityScriptName(this, options) + " OWNER TO " + owner;
    @NotNull
        return additionalInfo.incrementBy;
    public DBSObjectType getObjectType() {

            if (getDataSource().isServerVersionAtLeast(10, 0)) {
        }
        return RelationalObjectType.TYPE_SEQUENCE;
                            additionalInfo.maxValue = JDBCUtils.safeGetLong(seqResults, "max_value");
    }
import org.jkiss.dbeaver.model.exec.DBCException;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Property(viewable = true, editable = true, updatable = true, order = 10)
            sql.append("NO MINVALUE");
            return maxValue;
    {

    protected AdditionalInfo getAdditionalInfo() {
        return DBPScriptObject.OPTION_INCLUDE_PERMISSIONS.equals(option) || DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option);
    @Override
        }
        return additionalInfo.maxValue;
        }
                            additionalInfo.incrementBy = JDBCUtils.safeGetLong(seqResults, "increment_by");
        @Property(viewable = true, editable = true, updatable = true, order = 23)
    public Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
        addIndentation(sql, hasIndentation);
                }

import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;

        }
    }
                        }
    }
    public void getSequenceBody(@NotNull DBRProgressMonitor monitor, @NotNull StringBuilder sql, boolean hasIndentation)
            addIndentation(sql, hasIndentation);
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)

 * PostgreSequence
        } else {

        }

			sql.append("\nCOMMENT ON SEQUENCE ").append(DBUtils.getEntityScriptName(this, options)).append(" IS ")

        }
        super(catalog);
    @NotNull
        }
            }
    @PropertyGroup()


        return additionalInfo.lastValue;

            addIndentation(sql, hasIndentation);

    @Nullable
    }

        @Property(viewable = true, editable = true, updatable = true, order = 20)

     * @param monitor to read additional info about sequence

import java.util.Map;
                    }
        synchronized (additionalInfo) {
                            additionalInfo.isCycled = JDBCUtils.safeGetBoolean(seqResults, "cycle");
        public Long getLastValue() {
                    }
    public Number getLastValue() {
            this.lastValue = lastValue;

        @Override
            return incrementBy;
{

        public void setIncrementBy(long incrementBy) {
    }
        } else {

 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.cacheValue = cacheValue;
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
        private long minValue;
 * you may not use this file except in compliance with the License.
        private boolean isCycled;
            return startValue;
        public void setMinValue(long minValue) {

        {
                loadAdditionalInfo(monitor);
        return false;
        }
                    try (JDBCResultSet seqResults = dbSeqStat.executeQuery()) {
        public void setMaxValue(long maxValue) {
     * @throws DBCException can happen during the additional info reading
        return null;
        public void setCycled(boolean cycled) {
                        if (seqResults.next()) {
    @Override
    ///////////////////////////////////////////////////////////////////////
    public Number getMinValue() {
    /**
            addIndentation(sql, hasIndentation);
    public String getTableTypeName() {
            return lastValue;
        if (info.getMinValue() >= 0) {
    public boolean isView() {
    }
        return "SEQUENCE";
                            additionalInfo.incrementBy = JDBCUtils.safeGetLong(seqResults, "increment_by");
            sql.append("START ").append(info.getStartValue());
            sql.append("INCREMENT BY ").append(info.getIncrementBy());
            sql.append("\n\n");

    public void loadAdditionalInfo(DBRProgressMonitor monitor) {
        @Property(viewable = true, editable = true, updatable = true, order = 24, visibleIf = CacheAndCycleValidator.class)
        private long cacheValue;
            addIndentation(sql, hasIndentation);
        }

                    "SELECT * from pg_catalog.pg_sequences WHERE schemaname=? AND sequencename=?")) {

                            additionalInfo.isCycled = JDBCUtils.safeGetBoolean(seqResults, "is_cycled");
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
