
            log.warn("Can't read object " + sourceObject.getName() + " definition from the database", e);
        "pg_catalog"
 * You may obtain a copy of the License at

        @NotNull GenericStructContainer container
    }
    @Override

        statement.setString(1, container.getCatalog().getName());
        return objectDDL;
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return true;
        "information_schema",
        @NotNull JDBCSession session,
    }
                        String string = dbResult.getString(1);
            JDBCUtils.safeGetLong(dbResult, "min_value"),
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            container,
    ) throws DBException {
        return objectDDL;
            return "-- DuckDB view definition not found";
        return new DuckDBDataSource(monitor, container, this);
        return true;
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        @NotNull GenericView sourceObject,
    }
        } catch (SQLException e) {
        GenericDataSource dataSource = sourceObject.getDataSource();
        if (objectDDL == null) {
        @NotNull GenericTableBase sourceObject,
    private String getObjectDDL(
                        if (CommonUtils.isNotEmpty(string)) {
        statement.setString(2, container.getName());
import org.jkiss.code.NotNull;
        return statement;
        @NotNull GenericStructContainer container


import org.jkiss.dbeaver.Log;
        }
        return new DuckDataTypeCache(container);
            dbResult);
        String objectDDL = getObjectDDL(monitor, sourceObject, "duckdb_views()", "view_name");

        @NotNull DBRProgressMonitor monitor,

import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
        String description = JDBCUtils.safeGetString(dbResult, "comment");
    @Nullable
    public GenericSequence createSequenceImpl(
        String objectDDL = getObjectDDL(monitor, sourceObject, "duckdb_tables()", "table_name");
        return new DuckDBSequence(

 *
            return super.getTableDDL(monitor, sourceObject, options);
        }
    ) throws DBException {
    public GenericCatalog createCatalogImpl(@NotNull GenericDataSource dataSource, @NotNull String catalogName) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean supportsSequences(@NotNull GenericDataSource dataSource) {


        @NotNull GenericStructContainer container,
        String name = JDBCUtils.safeGetString(dbResult, "sequence_name");
/*
    @Override
    @NotNull
        JDBCPreparedStatement statement = session.prepareStatement(
import java.util.Map;
            "SELECT * FROM duckdb_sequences() WHERE database_name = ? AND schema_name = ?");
        if (objectDDL == null) {
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return null;
            description,
    @Override
package org.jkiss.dbeaver.ext.duckdb.model;
 *
        @NotNull Map<String, Object> options

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
}
    ) throws SQLException {
    ) throws DBException {
            JDBCUtils.safeGetLong(dbResult, "last_value"),

    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
                dbStat.setString(2, sourceObject.getContainer().getName());
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
 *
        return SYSTEM_SCHEMA_NAMES.contains(schema.getName());
    private static final Set<String> SYSTEM_SCHEMA_NAMES = Set.of(
    }
                "SELECT sql FROM " + sysViewName + " WHERE database_name = ? AND schema_name = ? AND " + objectColumnName + " = ?")) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read DuckDB object source")) {
 * limitations under the License.
                dbStat.setString(3, sourceObject.getName());
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @Override
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    }

 * DBeaver - Universal Database Manager
                dbStat.setString(1, sourceObject.getContainer().getCatalog().getName());
        }
    @Override

        @NotNull Map<String, Object> options
    ) {
    @Override
        @NotNull DBRProgressMonitor monitor,
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            return SQLFormatUtils.formatSQL(dataSource, string);
public class DuckMetaModel extends GenericMetaModel {
    public JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> createDataTypeCache(
                        }
        @NotNull DBRProgressMonitor monitor,
                    if (dbResult.nextRow()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * See the License for the specific language governing permissions and
    public JDBCStatement prepareSequencesLoadStatement(
    @Override
    public boolean isSystemSchema(@NotNull GenericSchema schema) {
            JDBCUtils.safeGetLong(dbResult, "increment_by"),
        if (CommonUtils.isEmpty(name)) {
    ) {
                    return null;
    );
    @Override
    }
        @NotNull String sysViewName,
            name,
    public String getTableDDL(
        @NotNull JDBCResultSet dbResult
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public boolean isTableCommentEditable() {
            }
    private static final Log log = Log.getLog(DuckMetaModel.class);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
import java.sql.SQLException;
        @NotNull String objectColumnName
import org.jkiss.dbeaver.DBException;

    public String getViewDDL(
import java.util.Set;
        }
            log.debug("Skip a sequence with an empty name.");
    }
    }
    }
 * Unless required by applicable law or agreed to in writing, software
                    }
            return null;
        return new DuckDBGenericCatalog(dataSource, catalogName);
        @NotNull GenericTableBase sourceObject,
            JDBCUtils.safeGetLong(dbResult, "max_value"),
                }
