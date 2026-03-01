            throws SQLException, DBException
        List<? extends GenericTableBase> tables = getTables(monitor);
import org.jkiss.dbeaver.model.DBUtils;
            boolean avoidCommentsReading = ((VerticaDataSource) schema.getDataSource()).avoidCommentsReading();
            dbStat.setLong(1, forTable.getObjectId());
                (object == null && objectName == null ? "" : " AND tv.table_name LIKE ?") + "\n" +
        return VerticaTable.class;

        return projectionCache.getAllObjects(monitor, this);
            return dbStat;
            dbStat.setString(1, schema.getName());
            JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        @Override

        hasStatistics = false;
import java.util.List;
    void resetStatistics() {
 *
            return new VerticaProjection(VerticaSchema.this, dbResult);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
        }
            throws SQLException, DBException
    public class ProjectionCache extends JDBCStructLookupCache<VerticaSchema, VerticaProjection, VerticaProjectionColumn> {
        }
        return super.refreshObject(monitor);
    @Override

        } finally {
            String sql = ("SELECT pc.*" + (avoidCommentsReading ? "" : ",c.comment") + " FROM v_catalog.projection_columns pc\n" +
    public Collection<VerticaProjection> getProjections(DBRProgressMonitor monitor) throws DBException {
    private static final Log log = Log.getLog(VerticaSchema.class);
        {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                "SELECT p.*" + (avoidCommentsReading ? "" : ",c.comment") + " FROM v_catalog.projections p\n" +
            return filtered;
        //children.addAll(getProjections(monitor));
        @Override
    public List<VerticaTable> getTables(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
    }
            dbStat.setString(2, object != null ? object.getName() : objectName);
        {
            if (object != null || objectName != null) dbStat.setString(2, object != null ? object.getName() : objectName);
                "SELECT anchor_table_name as table_name,\n" +
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
        }
            "FROM v_catalog.views v) tv\n" +
            throws SQLException, DBException
    };

                "WHERE pc.projection_id=?\n" +

import org.jkiss.dbeaver.Log;
                "SELECT * FROM v_catalog.user_functions WHERE schema_schema=?" +
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructLookupCache;

            try (JDBCPreparedStatement dbStat = ((JDBCSession)session).prepareStatement(
        }
            "SELECT NULL as TABLE_CAT, t.table_schema as TABLE_SCHEM, t.table_name as TABLE_NAME, (CASE t.is_flextable WHEN true THEN 'FLEXTABLE' ELSE 'TABLE' END) as TABLE_TYPE, NULL as TYPE_CAT,\n" +
                "ORDER BY pc.column_position");
 * Unless required by applicable law or agreed to in writing, software
        protected VerticaUDF fetchObject(@NotNull JDBCSession session, @NotNull VerticaSchema owner, @NotNull JDBCResultSet dbResult)
                    "WHERE p.projection_schema=?" +
        JDBCPreparedStatement dbStat = session.prepareStatement(
                }
            }
            throws SQLException
            );
import java.util.ArrayList;
                        String tableName = dbResult.getString("table_name");
    @Override
        @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
            "SELECT NULL as TABLE_CAT, v.table_schema as TABLE_SCHEM, v.table_name as TABLE_NAME, 'VIEW' as TABLE_TYPE, NULL as TYPE_CAT,\n" +
import org.jkiss.dbeaver.model.DBPSystemObject;
        }
            {
        protected VerticaProjectionColumn fetchChild(@NotNull JDBCSession session, @NotNull VerticaSchema owner, @NotNull VerticaProjection table, @NotNull JDBCResultSet dbResult)

            "ORDER BY 2, 3");
import java.sql.SQLException;

    @NotNull
                    (object == null && objectName == null ? "" : " AND projection_name=?")
            "UNION ALL\n" +
        protected VerticaProjection fetchObject(@NotNull JDBCSession session, @NotNull VerticaSchema owner, @NotNull JDBCResultSet dbResult)
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull VerticaSchema schema, @Nullable VerticaProjection object, @Nullable String objectName) throws SQLException {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


    @Override
    @Association
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
/*
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {

import org.jkiss.dbeaver.model.struct.DBSObject;
        "v_monitor",
        "v_txtindex",
                throw new DBCException("Error reading schema relation statistics", e);
                if (table instanceof VerticaFlexTable) {

            for (GenericTableBase table : tables) {
            return new VerticaUDF(VerticaSchema.this, dbResult);
    @Association

import org.jkiss.dbeaver.model.meta.Association;
    @Association
            }

{
        {
import java.util.Collection;
    public class UDFCache extends JDBCObjectLookupCache<VerticaSchema, VerticaUDF> {

        return null;

    {
    public VerticaSchema(GenericDataSource dataSource, GenericCatalog catalog, String schemaName) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
        "SELECT tv.*,c.comment as REMARKS FROM (\n" +
                    "ORDER BY anchor_table_name"))

/**
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
    final UDFCache udfCache = new UDFCache();

    }
    }
*/

                        GenericTableBase table = getTable(monitor, tableName);
        return (List<VerticaTable>) super.getPhysicalTables(monitor);

    }
        {
        @Override
            "\tv.owner_name, v.view_definition as DEFINITION \n" +
            super();

        }
            super("projection_name");

            boolean avoidCommentsReading = ((VerticaDataSource) owner.getDataSource()).avoidCommentsReading();
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
                    }
        return (List<VerticaTable>) super.getTables(monitor);
import org.jkiss.utils.ArrayUtils;
        if (object != null || objectName != null) {
        return hasStatistics;
        }

            setListOrderComparator(DBUtils.nameComparatorIgnoreCase());
        DBSObject child = getTable(monitor, childName);
        super(dataSource, catalog, schemaName);
    public boolean isStatisticsCollected() {
    }
 * limitations under the License.
 * You may obtain a copy of the License at
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull VerticaSchema schema, @Nullable VerticaUDF object, @Nullable String objectName) throws SQLException {
            final JDBCPreparedStatement dbStat = session.prepareStatement(
}
                            ((VerticaTable) table).fetchStatistics(dbResult);
    @SuppressWarnings("unchecked")
 *
                    "FROM v_monitor.column_storage cs\n" +
* */
        "v_internal",
        return child;
    @Override
package org.jkiss.dbeaver.ext.vertica.model;

    @Override
                    (object == null && objectName == null ? "" : " AND function_name=?")
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
        @NotNull
        List<DBSObject> children = new ArrayList<>(getTables(monitor));
        return udfCache.getAllObjects(monitor, this);

    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    @SuppressWarnings("unchecked")
import org.jkiss.code.NotNull;
    @Override
        @Override
        protected JDBCStatement prepareChildrenStatement(@NotNull JDBCSession session, @NotNull VerticaSchema owner, @Nullable VerticaProjection forTable)
            "LEFT OUTER JOIN v_catalog.comments c ON c.object_type = tv.TABLE_TYPE AND c.object_schema = tv.table_schem AND c.object_name = tv.table_name \n" +
    @Association
            return new VerticaProjectionColumn(table, dbResult);
                }
 */
        {
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
public class VerticaSchema extends GenericSchema implements DBPSystemObject, DBPObjectStatisticsCollector
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                dbStat.setString(1, getName());
    public VerticaProjection getProjection(DBRProgressMonitor monitor, String name) throws DBException {
                    "SUM(used_bytes) as used_bytes\n" +
    private static final String SYSTEM_SCHEMAS[] = {
 * DBeaver - Universal Database Manager
            if (object != null || objectName != null) dbStat.setString(2, object != null ? object.getName() : objectName);

            hasStatistics = true;
                    filtered.add((VerticaFlexTable) table);
    final ProjectionCache projectionCache = new ProjectionCache();
        throws DBException

        UDFCache()
            "\tt.owner_name, t.table_definition as DEFINITION \n" +
        return projectionCache.getObject(monitor, this, name);
            child = getProjection(monitor, childName);

            final JDBCPreparedStatement dbStat = session.prepareStatement(
    }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;


    }
            List<VerticaFlexTable> filtered = new ArrayList<>();
import org.jkiss.dbeaver.model.exec.DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
            "WHERE tv.table_schem=?" +

 */
 * VerticaSchema
                        if (table instanceof VerticaTable) {
    @Override

        }
    private boolean hasStatistics;
                (avoidCommentsReading ? "" : "LEFT OUTER JOIN v_catalog.comments c ON c.object_id = pc.column_id\n") +
    public boolean isSystem() {
    }
    public List<VerticaFlexTable> getFlexTables(DBRProgressMonitor monitor) throws DBException {
            return dbStat;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
        }
    public ProjectionCache getProjectionCache() {
import org.jkiss.dbeaver.model.exec.DBCSession;
            dbStat.setString(1, schema.getName());
        if (child == null) {
                    "WHERE cs.anchor_table_schema = ?\n" +
 *
        return dbStat;
    }

            );
        dbStat.setString(1, owner.getName());
            } catch (SQLException e) {
import org.jkiss.code.Nullable;
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        try (DBCSession session = DBUtils.openMetaSession(monitor, this, "Read relation statistics")) {
    }

            "FROM v_catalog.tables t\n" +
            return dbStat;

        return children;
        "v_catalog",
                    "GROUP BY anchor_table_id, anchor_table_name\n" +
    public Collection<VerticaUDF> getUserDefinedFunctions(DBRProgressMonitor monitor) throws DBException {
    }
    }
                        "AND c.object_schema = p.projection_schema AND c.object_name = p.projection_name\n") +

    }
                    while (dbResult.next()) {
 * you may not use this file except in compliance with the License.
        ProjectionCache()
            setListOrderComparator(DBUtils.nameComparatorIgnoreCase());
    }
        }
        {
    public List<VerticaTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
        return ArrayUtils.contains(SYSTEM_SCHEMAS, getName());
                        }
                    (avoidCommentsReading ? "" : "LEFT OUTER JOIN v_catalog.comments c ON c.object_type = 'PROJECTION'\n" +
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    }
/*
    @Override
    public Class<? extends DBSEntity> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
        @NotNull
        if (tables != null) {
import org.jkiss.dbeaver.DBException;
    }
/*
        return projectionCache;

        @Override

        hasStatistics = false;
