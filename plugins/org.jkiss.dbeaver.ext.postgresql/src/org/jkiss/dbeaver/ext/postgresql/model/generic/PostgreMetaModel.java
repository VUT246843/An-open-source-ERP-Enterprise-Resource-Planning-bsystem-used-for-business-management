    private Pattern ERROR_POSITION_PATTERN = Pattern.compile("\\n\\s*Position: ([0-9]+)");
                        PostgreGenericTrigger trigger = result.get(name);
                            trigger.addManipulation(manipulation);
{
                    name,
    public DBPErrorAssistant.ErrorPosition getErrorPosition(@NotNull Throwable error) {
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
            }
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
        }
    public DBCQueryPlanner getQueryPlanner(@NotNull GenericDataSource dataSource) {

    public String getTriggerDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTrigger trigger) throws DBException {
    }
            throw new DBDatabaseException(e, container.getDataSource());
        Version databaseVersion = container.getDataSource().getInfo().getDatabaseVersion();
 * DBeaver - Universal Database Manager
        if (genericStructContainer.getDataSource().isServerVersionAtLeast(9, 1)) {
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                            JDBCUtils.safeGetString(dbResult, "action_orientation"),
 * you may not use this file except in compliance with the License.
                    container,
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                sql.append("event_object_schema=? AND event_object_table=?");
    }
                " FROM pg_catalog.pg_proc P, pg_catalog.pg_namespace NS\n" +
            description,
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString())) {
        }
                        }
import org.jkiss.code.NotNull;
        } catch (SQLException e) {
                    PostgreUtils.getObjectComment(session.getProgressMonitor(), container, container.getName(), name),
    }
        }
    @Override

                pos.position = Integer.parseInt(matcher.group(1)) - 1;
            } else {
    @Override
        return null;
        } else {
    public GenericSequence createSequenceImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) throws DBException {
    public List<PostgreGenericTrigger> loadTriggers(@NotNull DBRProgressMonitor monitor, @NotNull GenericStructContainer container, @Nullable GenericTableBase table) throws DBException {
                Map<String, PostgreGenericTrigger> result = new LinkedHashMap<>();
    }
            sql.append("trigger_schema=?");
    }
            return JDBCUtils.queryString(session, "SELECT definition FROM PG_CATALOG.PG_VIEWS WHERE SchemaName=? and ViewName=?", sourceObject.getContainer().getName(), sourceObject.getName());
            }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
            genericTableBase,

            sql.append(",action_timing\n");
            sequenceSql = "SELECT last_value, min_value, max_value, increment_by from pg_catalog.pg_sequences where schemaname=? and sequencename=?";
        super();

                }
                            manipulation,
            JDBCUtils.safeGetString(dbResult, "action_statement"));
        return true;
                DBPErrorAssistant.ErrorPosition pos = new DBPErrorAssistant.ErrorPosition();
}
    }
public class PostgreMetaModel extends GenericMetaModel implements DBCQueryTransformProvider
    public PostgreMetaModel() {
        return new PostgreGenericTrigger(
    public JDBCBasicDataTypeCache createDataTypeCache(@NotNull GenericStructContainer container) {
                    JDBCUtils.safeGetLong(seqResults, 2),
                    dbStat.setString(1, table.getSchema().getName());
    @Override
    }
                    JDBCUtils.safeGetLong(seqResults, 3),
import java.util.List;
        StringBuilder sql = new StringBuilder();
        dbStat.setString(1, container.getName());
        if (table == null) {
            throw new DBDatabaseException(e, sourceObject.getDataSource());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        }
                        }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreGenericTrigger;
        }
        if (table == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (databaseVersion.getMajor() >= 10) {
        }
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
            StringBuilder sql = new StringBuilder();
                sql.append("trigger_schema=? AND event_object_table IS NULL");
                        String description = "";

    @Nullable
                return new ArrayList<>(result.values());
        String manipulation = JDBCUtils.safeGetString(dbResult, "event_manipulation");
/*
    @Override
    }
                (sourceObject.getDataSource().isServerVersionAtLeast(8, 4) ? "pg_get_functiondef(p.oid)" : "prosrc") +

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    JDBCUtils.safeGetLong(seqResults, 1),
        return dbStat;
        sql.append("SELECT trigger_name, event_object_table as OWNER, event_manipulation,action_order,action_condition,action_statement,action_orientation");

                        if (name == null) {
                            continue;
                            description,
            if (container.getDataSource().isServerVersionAtLeast(9, 1)) {
    @Override
        }
                            JDBCUtils.safeGetString(dbResult, "action_timing"),
        if (CommonUtils.isEmpty(name)) {

        if (!CommonUtils.isEmpty(message)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        return null;


                "WHERE ns.oid=p.pronamespace AND ns.nspname=? AND p.proname=?", sourceObject.getContainer().getName(), sourceObject.getName());
                        String manipulation = JDBCUtils.safeGetString(dbResult, "event_manipulation");
import java.util.regex.Matcher;
                            table,
            if (table == null) {
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @NotNull

    }
    @Override
    }
import org.osgi.framework.Version;
            return JDBCUtils.queryString(session, "SELECT " +
        return databaseVersion.getMajor() >= 9 || databaseVersion.getMajor() == 8 && databaseVersion.getMinor() >= 4;
            sql.append("\n");
 * See the License for the specific language governing permissions and
    }
        return new PostgreGenericQueryPlaner(dataSource);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Read triggers")) {
        }
        try (JDBCPreparedStatement dbSeqStat = session.prepareStatement(sequenceSql)) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        String description = "";
    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    dbStat.setString(1, container.getSchema().getName());
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
 *
                sql.append("\n");
        } else {
                if (table == null) {
                    }
    @NotNull
                dbSeqStat.setString(2, dbResult.getString(1));

            } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.util.regex.Pattern;
            }
        return new PostgreGenericTypeCache(container);
                        if (trigger != null) {
            return new QueryTransformerLimit(false, true);
    public JDBCStatement prepareSequencesLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container) throws SQLException {
        }
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Nullable

                            name,
                seqResults.next();
                            continue;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;

    @Override
import org.jkiss.dbeaver.model.DBUtils;
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 */
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.DBDatabaseException;

 * PostgreMetaModel
            Matcher matcher = ERROR_POSITION_PATTERN.matcher(message);
        if (CommonUtils.isEmpty(name)) {
    @NotNull
    @Override
                        result.put(name, trigger);
            throw new DBDatabaseException(e, sourceObject.getDataSource());
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
        String message = error.getMessage();
    @Override

    @Override
            dbStat.setString(1, table.getSchema().getName());
            dbStat.setString(2, table.getName());
        } catch (SQLException e) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read procedure definition")) {

import org.jkiss.utils.CommonUtils;
    }
        JDBCPreparedStatement dbStat = session.prepareStatement("SELECT sequence_name FROM information_schema.sequences WHERE sequence_schema=?");
            "WHERE ");
        } catch (SQLException e) {
        if (databaseVersion.getMajor() >= 10) {
                return new GenericSequence(
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
                dbSeqStat.setString(1, container.getName());
    @Override
            sql.append("FROM INFORMATION_SCHEMA.TRIGGERS\n" +
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
            name = JDBCUtils.safeGetString(dbResult, "trigger_name");
                        String name = JDBCUtils.safeGetString(dbResult, "trigger_name");
    @Override
            genericStructContainer.getDataSource().isServerVersionAtLeast(9, 1) ? JDBCUtils.safeGetString(dbResult, "action_timing") : null,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreGenericDataSource;
package org.jkiss.dbeaver.ext.postgresql.model.generic;
        String name = JDBCUtils.safeGetString(dbResult, 1);
            if (matcher.find()) {
        // Never be here
    }
            return null;
 * You may obtain a copy of the License at
            }
                return pos;
    public GenericTrigger createTableTriggerImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer genericStructContainer, @NotNull GenericTableBase genericTableBase, String name, @NotNull JDBCResultSet dbResult) throws DBException {
        return null;
        String sequenceSql = "SELECT last_value,min_value,max_value,increment_by from " + container.getName() + "." + name;
                    while (dbResult.next()) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                "WHERE ");
import java.util.LinkedHashMap;
    }
                    dbStat.setString(2, table.getName());
        sql.append("FROM INFORMATION_SCHEMA.TRIGGERS\n" +
import java.util.Map;
    public JDBCStatement prepareTableTriggersLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer genericStructContainer, @Nullable GenericTableBase table) throws SQLException {
            }
            throw new DBDatabaseException(e, container.getDataSource());
                        trigger = new PostgreGenericTrigger(
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {
        if (CommonUtils.isEmpty(name)) {
            manipulation,
                sql.append(",action_timing\n");
            name,
        return dbStat;
        }
        } catch (SQLException e) {
                            JDBCUtils.safeGetString(dbResult, "action_statement"));
        }

        }
            JDBCUtils.safeGetString(dbResult, "action_orientation"),
            sql.append("event_object_schema=? AND event_object_table=?");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                    JDBCUtils.safeGetLong(seqResults, 4));
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
 *

        }
 * limitations under the License.
            dbStat.setString(1, genericStructContainer.getName());
    @Nullable
                }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreGenericTypeCache;
        } else {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read view definition")) {
 *

                } else {
            try (JDBCResultSet seqResults = dbSeqStat.executeQuery()) {
        return new PostgreGenericDataSource(monitor, container, this);
    }
            return null;
        JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());
        Version databaseVersion = dataSource.getInfo().getDatabaseVersion();
import org.jkiss.dbeaver.model.DBPErrorAssistant;
            sql.append("SELECT trigger_name,event_manipulation,action_order,action_condition,action_statement,action_orientation");
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
    @Override
