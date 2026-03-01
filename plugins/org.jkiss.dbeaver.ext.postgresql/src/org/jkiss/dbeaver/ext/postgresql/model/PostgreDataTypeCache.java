                    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    static PostgreDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull PostgreDatabase database, long oid) throws SQLException, DBException {
        }
            String value = aliasMapping.getValue();
    }

        }
                continue;
            } catch (Exception e) {
    }
        boolean readAllTypes = dataSource.supportReadingAllDataTypes();
            "\nFROM pg_catalog.pg_type t");
                        if (schema == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        try (JDBCSession session = database.getDefaultContext(monitor, true).openSession(monitor, DBCExecutionPurpose.META, "Resolve data type by name")) {
        // Cache aliases
                            return dataType;
                "SELECT t.oid,t.*,c.relkind," + getBaseTypeNameClause(database.getDataSource()) + " FROM pg_catalog.pg_type t" +
            try (final JDBCPreparedStatement dbStat = session.prepareStatement(
            if (realType != null) {


/**

        while (objectIter.hasNext()) {
                "SELECT t.oid,t.*," + getBaseTypeNameClause(database.getDataSource()) + " FROM pg_catalog.pg_type t" +
 * you may not use this file except in compliance with the License.
    @NotNull
    @Override
    }
                    }
import java.sql.SQLException;
            sql.append("\nAND (c.relkind IS NULL OR c.relkind = 'c')");
            try (final JDBCPreparedStatement dbStat = session.prepareStatement(

import java.lang.reflect.Field;

                    fieldName = fieldName.substring(0, fieldName.length() - 6) + "_";
        return dbStat;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        if (dataType != null) {
                            throw new DBException("Schema " + schemaOid + " not found for data type " + oid);
    PostgreDataTypeCache() {
    @Override
            }
import java.util.*;
    }
            }
        } else {
                    }
                sql.append(" AND (et.typcategory IS NULL OR et.typcategory <> 'C')");
        setCache(types);

                    "\nLEFT OUTER JOIN pg_class c ON c.oid=t.typrelid" +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // Initially cache only base types (everything but composite and arrays)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;


        // Initially cache only base types (everything but composite and arrays)
        dbStat.setLong(1, owner.getObjectId());
    @NotNull
                PostgreDataType serialType = new PostgreDataType(realType, aliasMapping.getKey());
        sql.append("\nLEFT OUTER JOIN pg_catalog.pg_class c ON c.oid=t.typrelid" +
        PostgreDataSource dataSource = owner.getDataSource();
    @NotNull
    @Override
        dataTypeMap.clear();
    }
    }
                            typeId = PostgreOid.SERIAL;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

                        case PostgreConstants.TYPE_INT2:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            //dbStat;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        if (schema == null) {
    @Override
                        case PostgreConstants.TYPE_INT4:
        sql.append("SELECT t.oid,t.*,c.relkind,").append(getBaseTypeNameClause(dataSource)).append(", d.description" +
                dataTypeMap.put(dt.getObjectId(), dt);
                    types.add(type);

        if (!readAllTypes) {

            "\nLEFT OUTER JOIN pg_catalog.pg_description d ON t.oid=d.objoid" +
                    switch (value) {
            if (!Modifier.isPublic(oidField.getModifiers()) || !Modifier.isStatic(oidField.getModifiers())) {
        for (Map.Entry<String,String> aliasMapping : aliases.entrySet()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                            return dataType;
            super.cacheObject(object);
                String fieldName = oidField.getName().toLowerCase(Locale.ENGLISH);
        // Resolve value type IDs (#3731)
                }
                            typeId = PostgreOid.BIGSERIAL;
                } else {
public class PostgreDataTypeCache extends JDBCObjectCache<PostgreSchema, PostgreDataType>
                    // Ignore array types
        super.setCache(postgreDataTypes);
        }
        for (Field oidField : PostgreOid.class.getDeclaredFields()) {
                }
                    "\nLEFT OUTER JOIN pg_class c ON c.oid=t.typrelid" +

            }
    }
        sql.append("\nAND t.typnamespace=? ");
            try {
                        long schemaOid = JDBCUtils.safeGetLong(dbResult, "typnamespace");
                dataTypeMap.put(object.getObjectId(), object);
        }
        }
    @Override
                        PostgreSchema schema = database.getSchema(monitor, schemaOid);

    }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
            if (serverType.supportSerialTypes()) {
                        if (dataType != null) {
                        }
package org.jkiss.dbeaver.ext.postgresql.model;
        for (PostgreDataType dt : postgreDataTypes) {
        }
                        long schemaOid = JDBCUtils.safeGetLong(dbResult, "typnamespace");
            dt.resolveValueTypeFromBaseType(monitor);

        final JDBCPreparedStatement dbStat = session.prepareStatement(sql.toString());

                        PostgreDataType dataType = PostgreDataType.readDataType(session, database, dbResult, false);
/*
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
        }
        boolean supportsSysTypColumn = owner.getDatabase().supportsSysTypCategoryColumn(session);
                    throw new DBException("Data type " + oid + " not found in database " + database.getName());
    void loadDefaultTypes(PostgreSchema schema) {
    static PostgreDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull PostgreDatabase database, String name) throws SQLException, DBException {
import org.jkiss.code.NotNull;
            "\nWHERE t.typname IS NOT NULL");

                dbStat.setLong(1, oid);
    public void removeObject(@NotNull PostgreDataType object, boolean resetFullCache) {

        } else {

                int typeId = -1;
            if (supportsSysTypColumn) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                cacheObject(serialType);
            mapDataTypeAliases(serverType.getDataTypeAliases(), false);
 * DBeaver - Universal Database Manager
    }
    protected PostgreDataType fetchObject(@NotNull JDBCSession session, @NotNull PostgreSchema owner, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        setCaseSensitive(false);
 */
{
import org.jkiss.utils.CommonUtils;
                            throw new DBException("Schema " + schemaOid + " not found for data type " + name);
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreSchema owner) throws SQLException {
            }
            return "format_type(nullif(t.typbasetype, 0), t.typtypmod) as base_type_name";
import org.jkiss.dbeaver.model.DBUtils;

        return dataTypeMap.get(oid);
    void mapAliases(PostgreSchema schema) {
        super.clearCache();
 *
        super.loadObjects(monitor, schema);
                Object typeId = oidField.get(null);
            }
                }
    @Override
        if (dataSource.isServerVersionAtLeast(7, 3)) {
    }
    {
            sql.append("\nLEFT OUTER JOIN pg_catalog.pg_type et ON et.oid=t.typelem ");
    }
                    if (dbResult.next()) {
            return "NULL as base_type_name";
    }
        return "Data type cache";
                    "\nWHERE t.oid=? ")) {
                        PostgreSchema schema = database.getSchema(monitor, schemaOid);
    public void clearCache() {
        }
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        // Cache aliases
        dataTypeMap.remove(object.getObjectId());
                log.error(e);
            PostgreDataType dt = objectIter.next();
                if (fieldName.endsWith("_array")) {
        // Add serial data types
                            break;
    public void setCache(@NotNull List<PostgreDataType> postgreDataTypes) {
 * See the License for the specific language governing permissions and
                    PostgreDataType type = new PostgreDataType(schema, CommonUtils.toInt(typeId), fieldName);
 */
 *
        mapAliases(schema);
}
    @Override
                            break;
    private final LongKeyMap<PostgreDataType> dataTypeMap = new LongKeyMap<>();
        if (getCachedObject(object.getName()) != null) {
 * limitations under the License.
        try (JDBCSession session = database.getDefaultContext(monitor, true).openSession(monitor, DBCExecutionPurpose.META, "Resolve data type by OID")) {
        // Initially cache only base types (everything but composite and some arrays)
                }
    static String getBaseTypeNameClause(@NotNull PostgreDataSource dataSource) {
        mapAliases(schema);
                    "\nWHERE t.typname=? ")) {
        }
                        }
            }
import org.jkiss.utils.LongKeyMap;
                mapDataTypeAliases(PostgreConstants.SERIAL_TYPES, true);
            PostgreServerExtension serverType = schema.getDataSource().getServerType();
        }
                    serialType.setExtraDataType(true);
                    //types.add(type);
    protected void invalidateObjects(DBRProgressMonitor monitor, PostgreSchema schema, Iterator<PostgreDataType> objectIter) {

            }
import org.jkiss.dbeaver.Log;
        List<PostgreDataType> types = new ArrayList<>();
    }
                            break;
 * PostgreDataTypeCache
import org.jkiss.dbeaver.DBException;
                    "\nLEFT OUTER JOIN pg_catalog.pg_description d ON t.oid=d.objoid" +
import java.lang.reflect.Modifier;
 *
    public PostgreDataType getDataType(long oid) {
        setListOrderComparator(DBUtils.nameComparator());
                dbStat.setString(1, name);
                    throw new DBException("Data type " + name + " not found in database " + database.getName());
        if (!readAllTypes && supportsSysTypColumn) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                        }
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (!dt.isAlias()) {
    private void mapDataTypeAliases(Map<String, String> aliases, boolean isSerialType) {
 * You may obtain a copy of the License at
                    "\nLEFT OUTER JOIN pg_catalog.pg_description d ON t.oid=d.objoid" +

                        case PostgreConstants.TYPE_INT8:
        return PostgreDataType.readDataType(session, owner.getDatabase(), dbResult, true);
        super.removeObject(object, resetFullCache);

            }
    }
    protected String getCacheName() {
                        }
    }
                    serialType.setTypeId(typeId);
                    continue;
    private static final Log log = Log.getLog(PostgreDataTypeCache.class);
    public void cacheObject(@NotNull PostgreDataType object) {
    @Override
    @Override


            if (!object.isAlias() || object.isExtraDataType()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                            typeId = PostgreOid.SMALLSERIAL;
                    //PostgreDataType type = new PostgreDataType(schema, CommonUtils.toInt(typeId), fieldName);
                    if (dbResult.next()) {
            PostgreDataType realType = getCachedObject(value);
            }
        StringBuilder sql = new StringBuilder(256);
                if (isSerialType) {
    }
                        PostgreDataType dataType = PostgreDataType.readDataType(session, database, dbResult, false);
        if (schema.isCatalogSchema()) {
    }
    protected synchronized void loadObjects(DBRProgressMonitor monitor, PostgreSchema schema) throws DBException {
