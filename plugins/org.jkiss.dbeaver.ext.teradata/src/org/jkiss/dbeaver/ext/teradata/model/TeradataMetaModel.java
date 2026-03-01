    @Override
                "WHEN 'Y' THEN 'ENABLED'\n" +
        @NotNull JDBCSession session,
                        sql.append("\n\nCOMMENT ON TABLE ").append(sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))
                    }
        } else {
import java.sql.SQLException;
        @NotNull GenericView sourceObject,
                "TriggerComment as description\n" +
    @Override
        return new GenericDataSource(monitor, container, this, new TeradataSQLDialect());
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    "WHEN 'R' THEN 'ROW'\n" +
    @Override
                    }
 *
            throw new DBDatabaseException(e, dataSource);
                "WHEN 'R' THEN 'ROW'\n" +
    }
    ) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                        String name = JDBCUtils.safeGetString(dbResult, 1);
import org.jkiss.dbeaver.model.*;
                "end as triggerKind,\n" +
import org.jkiss.dbeaver.ext.generic.model.*;
    @Override
    @NotNull
                    }
import java.util.ArrayList;
    public boolean isTableCommentEditable() {
    }
        return false;
    public List<? extends GenericTrigger> loadTriggers(@NotNull DBRProgressMonitor monitor, @NotNull GenericStructContainer container, @Nullable GenericTableBase table) throws DBException {
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
        }
import org.jkiss.code.Nullable;
        @NotNull GenericTableBase sourceObject,

                (forParent != null ? "AND TableName=?" : "");
        @NotNull DBRProgressMonitor monitor,
                    "AND TableName=?";
        @NotNull GenericStructContainer genericStructContainer,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

    public boolean isTableColumnCommentEditable() {
    }
        @NotNull Map<String, Object> options
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public JDBCStatement prepareTableTriggersLoadStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer genericStructContainer, @Nullable GenericTableBase forParent) throws SQLException {
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    "end as triggerKind,\n" +
    public String getAutoIncrementClause(GenericTableColumn column) {
        if (tableType != null && isView(tableType)) {
        return true;
            throw new DBDatabaseException(e, container.getDataSource());
                                .append(" IS ").append(SQLUtils.quoteString(sourceObject, description)).append(";");
            return new QueryTransformerTop();
        super();
    public GenericTableTrigger createTableTriggerImpl(

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
        }
 * DBeaver - Universal Database Manager
                    "WHEN 'N' THEN 'DISABLED'\n" +
                    "WHERE SubjectTableDataBaseName=?\n" +
    @Override
                        sql.append(dbResult.getString(1));
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
    }
    @Override
    ) throws DBException {
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
    @Override
                List<GenericTrigger> result = new ArrayList<>();

import org.jkiss.dbeaver.DBException;
    }
        if (table == null) {
import org.jkiss.code.NotNull;
import java.util.List;
        return new TeradataTrigger(genericTableBase, triggerName, description, dbResult);
            return Collections.emptyList();
        }
    }
        String description = JDBCUtils.safeGetString(dbResult, "description");
                    "RequestText as definition,\n" +

                    return sql.toString();
    public String getTableDDL(
        String triggerName,
                    while (dbResult.nextRow()) {
{
    @Override
                    StringBuilder sql = new StringBuilder();
    }
        if (CommonUtils.isEmpty(triggerName)) {
                "CASE Kind\n" +

            }
        boolean isView = sourceObject.isView();
                "SHOW " + (isView ? "VIEW" : "TABLE") + " " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))) {
 * you may not use this file except in compliance with the License.
        return true;
            ) {
                    "CreateTimeStamp as createDate,\n" +
                        sql.append(dbResult.getString(1));
        @NotNull GenericTableBase genericTableBase,
    public TeradataMetaModel() {
import org.jkiss.dbeaver.DBDatabaseException;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
    @NotNull
                "WHERE SubjectTableDataBaseName=?\n" +
 */
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerTop;
    public GenericTableBase createTableOrViewImpl(@NotNull GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
    @NotNull
}
    @Override
            throw new DBDatabaseException(e, dataSource);
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject) {
                "END as status,\n" +
                }

                    String description = sourceObject.getDescription();
        dbStat.setString(1, genericStructContainer.getName());
 *
 * Unless required by applicable law or agreed to in writing, software
        return null;
                dbStat.setString(2, table.getName());
    @Override
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
        }
package org.jkiss.dbeaver.ext.teradata.model;
                        return super.getProcedureDDL(monitor, sourceObject);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
                "Event,\n" +
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
                    "WHEN 'Y' THEN 'ENABLED'\n" +
            return new GenericView(container, tableName, tableType, dbResult);
                    while (dbResult.next()) {
    public String getViewDDL(
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (SQLException e) {
                    StringBuilder sql = new StringBuilder();
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {

        return true;
    }
        } catch (SQLException e) {
        } catch (SQLException e) {
/*
    }
                "CASE EnabledFlag\n" +
 * TeradataMetaModel
        return "GENERATED ALWAYS AS IDENTITY";
                    while (dbResult.nextRow()) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Read triggers")) {
                    "WHEN 'S' THEN 'STATEMENT'\n" +
    @Override
import java.util.Collections;
                        result.add(new TeradataTrigger(table, name, description, dbResult));
                "FROM DBC.TriggersV\n" +

                "SHOW " + sourceObject.getProcedureType().name() + " " +
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
        return null;
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Override
                return result;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
                    if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS) && description != null) {
 * See the License for the specific language governing permissions and
        }
        if ("JSON".equals(typedObject.getTypeName())) {
    @Nullable
        GenericDataSource dataSource = sourceObject.getDataSource();
                    "Event,\n" +
    }

    @NotNull
 */
            return JDBCContentValueHandler.INSTANCE;
                    }
                    if (sql.isEmpty()) {
                    "FROM DBC.TriggersV\n" +
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
        }
        @NotNull Map<String, Object> options
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                dbStat.setString(1, table.getSchema().getName());

        @NotNull DBRProgressMonitor monitor,
    }
        @NotNull JDBCResultSet dbResult
                    "TriggerComment as description\n" +
/**

            String sql = "SELECT TriggerName,\n" +
                        String description = JDBCUtils.safeGetString(dbResult, "description");
        return dbStat;


                    "ActionTime,\n" +
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                "ActionTime,\n" +
                    sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))
                }
            dbStat.setString(2, forParent.getName());
            return new TeradataTable(container, tableName, tableType, dbResult);
 * You may obtain a copy of the License at
        }
        }
    @Override
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Teradata procedure source")) {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
        String sql = "SELECT TriggerName as TRIGGER_NAME, TableName as OWNER,\n" +
    public boolean supportsTriggers(@NotNull GenericDataSource dataSource) {
                "CreateTimeStamp as createDate,\n" +
public class TeradataMetaModel extends GenericMetaModel implements DBDValueHandlerProvider, DBCQueryTransformProvider
    }
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Teradata object DDL")) {
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
import java.util.Map;
    @Override
            }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @Override
    @Nullable
                    "END as status,\n" +
        GenericDataSource dataSource = sourceObject.getDataSource();

 * Licensed under the Apache License, Version 2.0 (the "License");

        if (forParent != null) {
                "WHEN 'N' THEN 'DISABLED'\n" +
                    return sql.toString();

        return getTableDDL(monitor, sourceObject, options);
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;

                }
 *
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
                "WHEN 'S' THEN 'STATEMENT'\n" +
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                "RequestText as definition,\n" +
    }
            triggerName = JDBCUtils.safeGetString(dbResult, 1);
                    "CASE Kind\n" +
 * Copyright (C) 2010-2026 DBeaver Corp and others
    ) {
                    "CASE EnabledFlag\n" +
