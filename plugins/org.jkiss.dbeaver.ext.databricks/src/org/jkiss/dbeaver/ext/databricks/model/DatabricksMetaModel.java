    @Override
        @Nullable JDBCResultSet dbResult) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                    statement.execute("USE CATALOG " + DBUtils.getQuotedIdentifier(originalCatalog));
            return new DatabricksView(
    }
/*
                        }
        }
        }

import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
                        while (dbResult.next()) {
                                tempViewsList.add(new ViewInfo(owner, viewName));

                } catch (SQLException e) {
            log.debug("Can't read current views list", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (sourceObject.isView()) {
                dbResult);
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
            try (JDBCStatement statement = session.createStatement()) {
                                continue;
                tableType,

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
            this.schema = schema;
        @NotNull GenericDataSource dataSource,
    @NotNull
        return new DatabricksDataSource(monitor, container, this);
    private static class ViewInfo {
import org.jkiss.dbeaver.DBDatabaseException;
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
import org.jkiss.dbeaver.ext.databricks.DatabricksDataSource;
        @NotNull JDBCSession session,
    public boolean isTableCommentEditable() {
    @Nullable
                        ddl = ddl.replace("CREATE VIEW", "CREATE OR REPLACE VIEW");
}
            }
 * limitations under the License.
        String name;
    @Override
 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(DatabricksMetaModel.class);
        @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
import org.jkiss.dbeaver.DBException;
                if (contextDefaults.getDefaultCatalog() == null) {
    @Override
                        sql.append(line).append("\n");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        @NotNull GenericStructContainer container,
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        @Nullable String objectName
import org.jkiss.dbeaver.model.DBUtils;
            }
        }


                "SHOW CREATE TABLE " + sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL))) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    @Override
    public GenericTableBase createTableOrViewImpl(
            return super.loadSchemas(session, dataSource, catalog);
        GenericStructContainer schema;
                        return SQLFormatUtils.formatSQL(sourceObject.getDataSource(), ddl);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Nullable GenericCatalog catalog,
import java.util.Map;
        return true;
        )) {
                }
    ) throws DBException {
import org.jkiss.dbeaver.Log;
        @Nullable String tableType,

        } catch (SQLException e) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(

        } catch (SQLException e) {
                    return ddl;
            dbStat.executeStatement();
        if ((CommonUtils.isNotEmpty(tableName) && !tempViewsList.isEmpty()
                    log.debug("Can't restore original catalog", e);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    String ddl = sql.toString();
import java.util.List;
 * You may obtain a copy of the License at
                tableType,
                dbResult);

 *
        } catch (DBCException e) {

    @Override
    private List<ViewInfo> tempViewsList = new ArrayList<>();
                    schemas.add(new DatabricksSchema(dataSource, catalog, schemaName));

    public JDBCStatement prepareTableLoadStatement(
    public GenericSchema createSchemaImpl(
        return false;
    @Override
 * you may not use this file except in compliance with the License.
            log.debug("Cannot load schemas with query", e);
        return new DatabricksSchema(dataSource, catalog, schemaName);
                            if (CommonUtils.isEmpty(namespace)) {

        List<GenericSchema> schemas = new ArrayList<>();
                tableName,
    @NotNull
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        } finally {
                            if (CommonUtils.isNotEmpty(viewName)) {

    }

import org.jkiss.dbeaver.model.exec.DBCException;
        {
        GenericDataSource dataSource = sourceObject.getDataSource();
    }
    public List<GenericSchema> loadSchemas(
            log.debug("Can't read current views list", e);
                    String schemaName = JDBCUtils.safeGetStringTrimmed(dbResult, DatabricksConstants.SCHEMA_NAME);
    }
                tableName,
                    }
                }
 *
        try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
                statement.execute("USE CATALOG " + DBUtils.getQuotedIdentifier(owner.getCatalog()));
        @NotNull GenericStructContainer owner,
        @NotNull String schemaName
import org.jkiss.utils.CommonUtils;

        return null;
    ) throws SQLException {
 * Licensed under the Apache License, Version 2.0 (the "License");

            if (originalCatalog != null && originalCatalog != owner.getCatalog()) {
    }
    @Override
                }
                            continue;
        } catch (SQLException e) {
        @NotNull GenericDataSource dataSource,
            return new QueryTransformerLimit(false, false);
                    }
            this.name = name;
            try (JDBCResultSet dbResult = dbStat.getResultSet()) {
import org.jkiss.code.NotNull;
            tableType != null && isView(tableType))
                }
        @Nullable GenericTableBase object,
            }
                    StringBuilder sql = new StringBuilder();
            if (contextDefaults != null) {
                                // Probably temporary view
        @Nullable GenericCatalog catalog
                try (JDBCStatement statement = session.createStatement()) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Databricks view/table source")) {
            throw new DBDatabaseException(e, dataSource);
                }
    }
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW VIEWS IN " + DBUtils.getQuotedIdentifier(owner))) {
 * DBeaver - Universal Database Manager
                container,
            }
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
public class DatabricksMetaModel extends GenericMetaModel implements DBCQueryTransformProvider {
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
            }
    public DatabricksMetaModel() {
                originalCatalog = contextDefaults.getDefaultCatalog();
        try {

    ) {
    }
        return super.prepareTableLoadStatement(session, owner, object, objectName);
                container,

            var contextDefaults = session.getExecutionContext().getContextDefaults();
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
 */
import java.sql.SQLException;
                        String line = dbResult.getString(1);
    @Override
                    }
        return getTableDDL(monitor, sourceObject, options);
        } else {
    }
        return "global_temp".equals(schema.getName()) || "information_schema".equalsIgnoreCase(schema.getName());
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
import java.util.ArrayList;
                            String namespace = JDBCUtils.safeGetString(dbResult, "namespace");
                            }
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
        }
                while (dbResult.next()) {

import org.jkiss.dbeaver.ext.databricks.DatabricksConstants;

             && tempViewsList.stream().anyMatch(e -> e.name.equalsIgnoreCase(tableName))) ||
                    contextDefaults.setDefaultCatalog(session.getProgressMonitor(), owner.getCatalog(), null);
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

        DBSCatalog originalCatalog = null;
        ViewInfo(GenericStructContainer schema, String name) {
            return new DatabricksTable(
    @Override
                        }
                    while (dbResult.next()) {
package org.jkiss.dbeaver.ext.databricks.model;
                            String viewName = JDBCUtils.safeGetString(dbResult, "viewName");
    public boolean isSystemSchema(GenericSchema schema) {
        }
                            }
 *
            "SHOW SCHEMAS" + (catalog == null ? "" : " IN " + catalog.getName())
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
        return schemas;
        @Nullable String tableName,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        if (line == null) {
    @Override
    }
import org.jkiss.code.Nullable;
    }
