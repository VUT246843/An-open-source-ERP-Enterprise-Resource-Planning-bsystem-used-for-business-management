import java.util.Map;
                }
                        } catch (IllegalArgumentException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                final Matcher matcher = PROHIBITED_PATTERN.matcher(url);
import org.jkiss.dbeaver.model.DBUtils;
    ) throws DBException {
}
        } catch (SQLException e) {
                triggerName,
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                if (matcher.find()) {
                        if (name == null) {

        } catch (SQLException e) {
    private static final Log log = Log.getLog(HSQLMetaModel.class);
import org.jkiss.dbeaver.DBException;
        @NotNull GenericTableBase genericTableBase,
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
                            log.warn(e);
    @Override
                        try {
        }
 */
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read HSQLDB view source")) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return dbStat;
    @Override
            }
                    }
            {
                    return "-- HSQLDB procedure definition not found";
                        }
        return ((HSQLTrigger)trigger).getStatement();
                        "Please use the embedded driver to access server files.");
    @Override
        if (table == null) {
    }
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
            JDBCUtils.safeGetLong(dbResult, "NEXT_VALUE"),
    @Override
        }
                        "WHERE EVENT_OBJECT_SCHEMA=?" + (forParent != null ? " AND EVENT_OBJECT_TABLE=?" : ""));
                }
    public String getAutoIncrementClause(GenericTableColumn column) {
    }

    @NotNull
                                table,
                        return definition;
    @Override
        @NotNull JDBCSession session,
    }
        }
        JDBCPreparedStatement dbStat = session.prepareStatement(
        } catch (SQLException e) {
                }
    @Override
import org.jkiss.dbeaver.ext.hsqldb.model.plan.HSQLQueryPlanner;

                    while (dbResult.next()) {
    }
                    return "-- HSQLDB view definition not found";
                            continue;
            name,
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read HSQLDB procedure source")) {

        }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

            "SELECT * FROM INFORMATION_SCHEMA.SYSTEM_SYNONYMS\n" +
import java.util.ArrayList;
            {
import org.jkiss.code.NotNull;
        GenericDataSource dataSource = container.getDataSource();
                dbStat.setString(2, sourceObject.getName());
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Read HSQLDB procedure source")) {
        JDBCPreparedStatement dbStat = session.prepareStatement("SELECT * FROM INFORMATION_SCHEMA.SEQUENCES WHERE SEQUENCE_SCHEMA=?");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    @Override
        return true;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        return "CREATE VIEW AS " + dbResult.getString(1);
    }
    @Override
    }
    public void loadProcedures(@NotNull DBRProgressMonitor monitor, @NotNull GenericObjectContainer container) throws DBException {
    }

    }
    public List<GenericTrigger> loadTriggers(@NotNull DBRProgressMonitor monitor, @NotNull GenericStructContainer container, @Nullable GenericTableBase table) throws DBException {
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
/*
        }
        GenericDataSource dataSource = sourceObject.getDataSource();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                                dbResult);
    @Override
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Read triggers")) {

        return new GenericSequence(
                        HSQLTrigger trigger = new HSQLTrigger(
 * See the License for the specific language governing permissions and
        return new HSQLQueryPlanner((HSQLDataSource) dataSource);
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
 * You may obtain a copy of the License at
                            null);
            if (forParent != null) {
 *
    }
    public boolean supportsSynonyms(@NotNull GenericDataSource dataSource) {
    public String getTriggerDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTrigger trigger) throws DBException {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public GenericSequence createSequenceImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) {
    public JDBCStatement prepareTableTriggersLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer genericStructContainer, @Nullable GenericTableBase forParent) throws SQLException {
                        result.add(trigger);
    }
    }
            {
                dbStat.setString(2, table.getName());
 */
                    while (dbResult.nextRow()) {
    }
        return new HSQLTrigger(
import org.jkiss.dbeaver.runtime.DBWorkbench;
        triggerName = triggerName.trim();
            return null;
            dbStat.setString(1, genericStructContainer.getName());
                dbStat.setString(2, sourceObject.getName());
            try (JDBCPreparedStatement dbStat = session.prepareStatement(


{
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {
    @Override
    public JDBCStatement prepareSynonymsLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container) throws SQLException {
    @NotNull
                    }
        @NotNull GenericStructContainer genericStructContainer,

        if (CommonUtils.isEmpty(triggerName)) {
    }
                "SELECT ROUTINE_DEFINITION FROM INFORMATION_SCHEMA.ROUTINES " +
    public HSQLMetaModel() {
        return true;
                        final GenericProcedure procedure = createProcedureImpl(
                genericTableBase,
                        container.addProcedure(procedure);
                "SELECT VIEW_DEFINITION FROM INFORMATION_SCHEMA.VIEWS " +
import org.jkiss.code.Nullable;
import java.util.regex.Matcher;
 * HSQLMetaModel
    @NotNull
            throw new DBDatabaseException(e, container.getDataSource());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBDatabaseException;
                            definition = SQLFormatUtils.formatSQL(dataSource, definition);
                            container,
            }
        dbStat.setString(1, container.getName());
            JDBCUtils.safeGetLong(dbResult, "MINIMUM_VALUE"),
        GenericDataSource dataSource = sourceObject.getDataSource();
        return "IDENTITY";
                dbStat.setString(1, sourceObject.getContainer().getName());
            throw new DBDatabaseException(e, dataSource);
        } catch (SQLException e) {
                return result;
package org.jkiss.dbeaver.ext.hsqldb.model;
        if (CommonUtils.isEmpty(name)) {
        String triggerName,
    @Override
                }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                    }
        return dbStat;

        }
                            JDBCUtils.safeGetString(dbResult, "SPECIFIC_NAME"),
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
public class HSQLMetaModel extends GenericMetaModel
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    "WHERE ROUTINE_SCHEMA=? AND ROUTINE_NAME=?"))

 * limitations under the License.
        @NotNull JDBCResultSet resultSet
    @Override
            container,
 *
import java.util.List;
        return true;
    public JDBCStatement prepareSequencesLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container) throws SQLException {
                resultSet);

            JDBCUtils.safeGetLong(dbResult, "INCREMENT")
                "SELECT * FROM INFORMATION_SCHEMA.ROUTINES WHERE ROUTINE_SCHEMA=?"))
        }
    }

        }
            throw new DBDatabaseException(e, dataSource);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    "SELECT * FROM INFORMATION_SCHEMA.TRIGGERS\n" +
            triggerName = JDBCUtils.safeGetString(resultSet, "TRIGGER_NAME");
                            routineType = DBSProcedureType.valueOf(JDBCUtils.safeGetString(dbResult, "ROUTINE_TYPE"));
    public GenericSynonym createSynonymImpl(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet dbResult) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
                dbStat.setString(1, container.getName());
                dbStat.setString(2, forParent.getName());
            null,
        if (DBWorkbench.getPlatform().getApplication().isMultiuser()) {
        return new HSQLDataSource(monitor, container, this);
            if (!container.getDriver().isEmbedded() && url != null) {

                dbStat.setString(1, sourceObject.getContainer().getName());
                            null,
        return new HSQLSynonym(container, dbResult);
            JDBCUtils.safeGetLong(dbResult, "MAXIMUM_VALUE"),
    @Override
        );
    @Override

import org.jkiss.utils.CommonUtils;
    @Override
                        String name = JDBCUtils.safeGetString(dbResult, "TRIGGER_NAME");
                        if (definition != null) {
    }

                    throw new DBException("File access is not allowed for this driver. " +
            return null;
                            "WHERE EVENT_OBJECT_SCHEMA=? AND EVENT_OBJECT_TABLE=?")) {

                "WHERE SYNONYM_SCHEMA=?\n" +
        return dbStat;
            }

            }
    @Nullable
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Unless required by applicable law or agreed to in writing, software
                        name = name.trim();
                            JDBCUtils.safeGetString(dbResult, "ROUTINE_NAME"),

    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
    public GenericTrigger createTableTriggerImpl(
                dbStat.setString(1, container.getName());
                    "WHERE TABLE_SCHEMA=? AND TABLE_NAME=?"))
    public DBCQueryPlanner getQueryPlanner(@NotNull GenericDataSource dataSource) {
    @Override
                        DBSProcedureType routineType = DBSProcedureType.PROCEDURE;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * DBeaver - Universal Database Manager
            throw new DBDatabaseException(e, dataSource);
            throw new DBException("Database level triggers aren't supported for HSQLDB");
                "SELECT EVENT_OBJECT_TABLE AS OWNER, T.* FROM INFORMATION_SCHEMA.TRIGGERS T\n" +
                "ORDER BY SYNONYM_NAME");
 *
        super();
                            routineType,
                        }
    @Override
                        String definition = dbResult.getString(1);

                List<GenericTrigger> result = new ArrayList<>();
    private static final Pattern PROHIBITED_PATTERN = Pattern.compile("jdbc:hsqldb:(file|mem|res)", Pattern.CASE_INSENSITIVE);
            String url = container.getConnectionConfiguration().getUrl();
        dbStat.setString(1, container.getName());

                    if (dbResult.nextRow()) {
        if (triggerName == null) {

import java.util.regex.Pattern;
        String name = JDBCUtils.safeGetString(dbResult, "SEQUENCE_NAME");
/**
                    }
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
                                name,
import org.jkiss.dbeaver.Log;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
import java.sql.SQLException;
        }
 * you may not use this file except in compliance with the License.
            }
                    if (dbResult.nextRow()) {

        JDBCPreparedStatement dbStat = session.prepareStatement(
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
