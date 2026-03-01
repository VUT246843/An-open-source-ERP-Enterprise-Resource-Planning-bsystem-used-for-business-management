    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformType;
    public boolean supportsOverloadedProcedureNames() {
 * limitations under the License.
import java.util.Map;
    @NotNull
    }
    @Override

        String schemaName = getSchemaNameForPattern(session, recognizeWildCards, schema);
    }
                }
                String[] strings = driverVersion.split("\\.");
                    while (dbResult.nextRow()) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public SnowflakeMetaModel() {
 * you may not use this file except in compliance with the License.
        if (type == DBCQueryTransformType.RESULT_SET_LIMIT) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        GenericDataSource dataSource = sourceObject.getDataSource();
import org.jkiss.code.Nullable;
    private static final Log log = Log.getLog(SnowflakeMetaModel.class);
    @NotNull
    @Override
        }
        boolean recognizeWildCards)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            // Shouldn't check patch if the driver is newer than 3.14 or newer.
        return false;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;

                }
        boolean recognizeWildCards = supportsWildcards(session, owner);
        if (valueType == Types.NUMERIC || valueType == Types.DECIMAL || valueType == Types.BIGINT) {
        @NotNull GenericStructContainer owner,
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        @NotNull JDBCSession session,
            }
        // Sometimes for some reason Snowflake returns NUMBER as BIGINT
                }
        @NotNull JDBCSession session,
            null : recognizeWildCards ? JDBCUtils.escapeWildCards(session, schema.getName()) : schema.getName();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    @Nullable
    private String getTableNameForPattern(
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getViewDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericView sourceObject, @NotNull Map<String, Object> options) throws DBException {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Snowflake object DDL")) {
    public GenericDataSource createDataSourceImpl(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
    }
 * DBeaver - Universal Database Manager
                    String result = sql.toString().trim();
    public JDBCStatement prepareUniqueConstraintsLoadStatement(
        }        
                        sql.append(dbResult.getString(1));
import org.jkiss.dbeaver.Log;
import java.sql.Types;
public class SnowflakeMetaModel extends GenericMetaModel implements DBCQueryTransformProvider
        return new SnowflakeDataSource(monitor, container, this);
        return null;
    public Integer extractPrecisionOfNumericColumn(int valueType, long columnSize) {
        boolean recognizeWildCards = supportsWildcards(session, owner);
 * SnowflakeMetaModel

        String tableName = getTableNameForPattern(session, owner, forParent, recognizeWildCards);
    public String getTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase sourceObject, @NotNull Map<String, Object> options) throws DBException {
            return new QueryTransformerLimit(false, false);
        GenericSchema schema = owner.getSchema();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
/**
    }
    public DBCQueryTransformer createQueryTransformer(@NotNull DBCQueryTransformType type) {
            throw new DBDatabaseException(e, dataSource);
    @Override
        if (owner.getDataSource().isDriverVersionAtLeast(3, 13)) {
        if (owner.getDataSource().isDriverVersionAtLeast(3, 14)) {
    private boolean supportsWildcards(@NotNull JDBCSession session, @NotNull GenericStructContainer owner) throws SQLException {
        return new SnowflakeDataTypeCache(container);
import org.jkiss.dbeaver.ext.generic.model.*;
import org.jkiss.dbeaver.DBException;

    }
            .getSourceStatement();
 * Unless required by applicable law or agreed to in writing, software
        GenericDataSource dataSource = sourceObject.getDataSource();
    }
        return getTableDDL(monitor, sourceObject, options);
                        sql.append(dbResult.getString(1));
        @NotNull GenericStructContainer owner,
                    return CommonUtils.toLong(strings[2]) >= 19;
            return Math.toIntExact(columnSize);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Snowflake object DDL")) {
            }
    @Override
    }
        return true;
        @Nullable GenericTableBase forParent
    public boolean supportsTableDDLSplit(@NotNull GenericTableBase sourceObject) {
                    return sql.toString();
                        result = result.substring(0, result.length() - 1);
    @Override
 *

    {
            if (CommonUtils.isNotEmpty(driverVersion) && driverVersion.contains(".")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
import org.jkiss.dbeaver.DBDatabaseException;
        return false;
        @NotNull GenericStructContainer owner,
            String driverVersion = session.getMetaData().getDriverVersion();

        return true;
    public JDBCStatement prepareForeignKeysLoadStatement(

    private String getSchemaNameForPattern(@NotNull JDBCSession session, boolean recognizeWildCards, @Nullable GenericSchema schema) {
{

                    StringBuilder sql = new StringBuilder();
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
        @Nullable GenericTableBase forParent
    public JDBCBasicDataTypeCache<GenericStructContainer, ? extends JDBCDataType> createDataTypeCache(
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
                        sourceObject.getFullyQualifiedName(DBPEvaluationContext.DDL) + "', TRUE) "))
import java.sql.SQLException;
 */
        // Snowflake driver do not recognize wild cards patterns before version 3.13.19 - and 19 here is the number of patch, not minor
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
 */
        }
/*
        String schemaName = getSchemaNameForPattern(session, recognizeWildCards, schema);

        @NotNull GenericStructContainer container
        return forParent == null ? owner.getDataSource().getAllObjectsPattern()
        }
    }
    @Override
    @Override
    @Override
        boolean isFunction = sourceObject.getProcedureType() == DBSProcedureType.FUNCTION;
            .getImportedKeys(owner.getCatalog() == null ? null : owner.getCatalog().getName(), schemaName, tableName)
                    return result;
                    }
        }
    @NotNull
                    }
        @Nullable GenericTableBase forParent,
 * See the License for the specific language governing permissions and
    ) throws SQLException {
        return true;
        @NotNull JDBCSession session,
            : recognizeWildCards ? JDBCUtils.escapeWildCards(session, forParent.getName()) : forParent.getName();
    @Override
    @Override
        }

        String tableName = getTableNameForPattern(session, owner, forParent, recognizeWildCards);
                    "SELECT GET_DDL('" + (isView ? "VIEW" : "TABLE") + "', '" +
            throw new DBDatabaseException(e, dataSource);
    public String getProcedureDDL(@NotNull DBRProgressMonitor monitor, @NotNull GenericProcedure sourceObject) throws DBException {
 * You may obtain a copy of the License at
                    while (dbResult.nextRow()) {
                    while (result.endsWith(";")) {
        return null;
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return true;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    ) throws SQLException {
                    sourceObject.getProcedureSignature(monitor, false) + "', TRUE)"))

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } catch (SQLException e) {
                "SELECT GET_DDL('"  + sourceObject.getProcedureType() + "', '" +
    public boolean isTableCommentEditable() {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    }
 *
            }
 * distributed under the License is distributed on an "AS IS" BASIS,

        GenericSchema schema = owner.getSchema();
        super();
import org.jkiss.dbeaver.model.exec.DBCQueryTransformProvider;
    @Nullable
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    ) {
        return session.getMetaData()
import org.jkiss.dbeaver.model.impl.sql.QueryTransformerLimit;
                    StringBuilder sql = new StringBuilder();
import org.jkiss.code.NotNull;
        } catch (SQLException e) {
        boolean isView = sourceObject.isView();

            .getSourceStatement();
            {
    @Nullable
package org.jkiss.dbeaver.ext.snowflake.model;
import org.jkiss.dbeaver.model.DBUtils;
        return session.getMetaData()
            .getPrimaryKeys(owner.getCatalog() == null ? null : owner.getCatalog().getName(), schemaName, tableName)

    public boolean isTableColumnCommentEditable() {
        return schema == null || DBUtils.isVirtualObject(schema) ?

 *
                if (strings.length == 3) {
}
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2010-2025 DBeaver Corp and others

            {
                    }

    @Override
    }

