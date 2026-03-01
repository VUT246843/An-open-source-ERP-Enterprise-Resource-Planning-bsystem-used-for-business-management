                    result[i] = objVector[i];
                        return 13 + 1 + 8 + secondSize;
     * be done due to an exception, falls back to manually parsing the string representation
                dataType = resolvedDatabase.getLocalDataType(dbTypeName);
                    dbTypeName = parts[1];
        } else if (parts.length > 1) {
            entityEditor.appendViewDeclarationPrefix(monitor, sql, view);
            for (int i = 0; i < strings.length; i++) {
        // Try to resolve local data type in specified database
                    if (item instanceof Number) {
        } catch (Exception e) {
    }
                if (array == null) {
            case PostgreOid.NUMERIC:
     * @see #safeGetArray(ResultSet, String, Function, IntFunction)
                        return 8 + secondSize + 6;
     * @param tableName name of the required table
                        DBSEntity docEntity = DBUtils.getEntityFromMetaData(monitor, session.getExecutionContext(), entityMetaData);
        @NotNull List<? extends PostgreObject> objectList
            }
     * If the column doesn't exist, then there will be an exception
                if (i > 0) opt.append(", ");
                            return dataType;
            return Long.parseLong(str);
    public static int getAttributePrecision(long typeOid, int typeMod) {
        int lastPos = -1;
            case PostgreOid.INT2:
        }
            // Some drivers (ODBC) might not have an implementation for that API, just ignore and try with a string
            List<PostgrePrivilegeGrant> privileges = new ArrayList<>();
import java.util.regex.Matcher;
                    case -1 -> 6 + 1;
                if (typmod == -1)
        sql.append(view.getTableTypeName()).append(" ").append(DBUtils.getEntityScriptName(view, options));
                yield typeMod;
                    withGrantOption = true;
                char pCode = privString.charAt(k);
        if (pgVector instanceof String vector) {
        // Try to get cashed data type from specified schema
        StringBuilder opt = new StringBuilder();
                8;
                    return null;
        }
                if (typeMod == -1)
        } catch (Exception e) {
        //oid = convertArrayToBaseOid(oid);
        sql.append("\nAS ").append(definition);
        return resolveTypeFullName(

 * limitations under the License.
                    owner.getSchema().getName(),
import java.sql.SQLFeatureNotSupportedException;
            case PostgreOid.TIMESTAMP:
            Matcher m = ROLE_TYPE_PATTERN.matcher(grantee);
                        dataType = resolvedSchema.getDataTypeCache().getObject(monitor, resolvedSchema, dbSchemaTypeName);
                getDisplaySize(typeOid, typeMod);
    @Nullable
                                owner.getDatabase().getName(),
                return new long[] {number.longValue()};
    }
            log.error(e);
            return definition;
                int scale = (typmod - 4) & 0xffff;
                        return null;
        if (dataType != null) {

                ));
            @NotNull AbstractObjectCache<OWNER, OBJECT> cache,
    }
    }
        }
        return false;
                                owner.getName(),
     * @param generator  a function that takes a length and creates array of {@code T}
     *
                    }
            Pattern pattern = Pattern.compile("^.*?://[^/]+/([^?#]+)(?:[?#].*)?$");

            case PostgreOid.VARBIT -> {
    @Nullable
            case PostgreOid.OID:
                log.warn("Bad permissions string: " + permString);
            long objectId)
            }
                    case PostgreOid.TIMESTAMPTZ:
    public static String getDatabaseNameFromConfiguration(@NotNull DBPConnectionConfiguration configuration) {

            default -> UNKNOWN_LENGTH;
        String[] parts = splitTypeNameIdentifier(dataSource, fullTypeName);
import org.jkiss.dbeaver.ext.postgresql.model.*;
            return ",";
import java.util.function.IntFunction;
        if (entityEditor != null) {
                if (!CommonUtils.isEmpty(alterScript)) {
     */
            case PostgreSchema ignored2 -> "SCHEMA";
            case PostgreOid.INT2 -> 5;
                continue;
            return dataType;
                return 1 + precision + (scale != 0 ? 1 : 0);
import org.jkiss.dbeaver.model.exec.DBCException;
        }
import java.util.*;
                                    typeName = identifiers[identifiers.length - 1];
    }
            case PostgreOid.FLOAT8 -> 17;
            } catch (SQLException e) {
            case NUMERIC -> "int";
    public static void getObjectGrantPermissionActions(
                // that number by up to two digits.
    @NotNull
    ) throws SQLException {
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                // Calculate the number of decimal digits + the decimal point.
            case PostgreOid.FLOAT4:
                return attr;
        } else {
                return 20; // -9223372036854775808 to +9223372036854775807

    }
    /**
        @NotNull String[] acl,
        }
            dataSource.getDefaultInstance().getMetaContext().getDefaultSchema(), fullTypeName
    public static long[] getIdVector(@Nullable Object pgObject, @NotNull DBPDataSource dataSource) {
                                        if (schema != null) {
        } else {
        try {
            case PostgreProcedure postgreProcedure -> postgreProcedure.getProcedureTypeName();
                return typmod;
        return null;
import java.sql.SQLException;
                        return 13 + 1 + 8 + secondSize + 6;
            case PostgreDatabase ignored3 -> "DATABASE";
        @NotNull DBRProgressMonitor monitor,

            // Owner
                    return dataType;
        };
    @Nullable

                if (dataType != null) {
        @NotNull ResultSet dbResult,

            objects = cache.getCachedObjects();
     *
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerPostgreSQL;
                            PostgreDataType dataType = database.getDataType(monitor, typeName);
            }
        String granteeType = null;

     * @return a type-specific array delimiter, or {@code ","} if the given type is not a postgres data type.
            @Nullable DBRProgressMonitor monitor,

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                int prefixEnd = m.end();
                } else {
                                PostgrePrivilegeType.ALL,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
                }
import java.util.function.Function;
        for (String aclValue : acl) {
        sql.append(";");
            return null;
            PostgreSchema resolvedSchema = database.getSchema(monitor, parts[0]);
            }
     */
                    }
                continue;
        for (int i = 0; i < aclValuesCount; i++) {
    private static boolean isCompositeTypeName(@NotNull String typeName) {
     * In this case, we can directly check the existing system column on the database.
        return grantees;
    

import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerTypeRegistry;
    }
                log.warn("Bad ACL item: " + aclValue);
            DBRProgressMonitor monitor = session.getProgressMonitor();
                // We assume the worst case scenario for all of these.
            case PostgreSequence ignored -> "SEQUENCE";
                if (divPos < 0) {
        if (PostgreUtils.isCompositeTypeName(identifier)) {
            PostgreRoleReference grantee = extractGranteeName(owner.getDatabase(), aclValue, divPos);
                }
                    if (resolvedSchema != null) {
        final String identifier = typeNameInfo.getFirst();
        String serverTypeName = CommonUtils.toString(driver.getDriverParameter(PostgreConstants.PROP_SERVER_TYPE));
                return 10; // 0 to 4294967295
    ) throws DBCException {

                // zone = '+11:30' = 6;
    @NotNull
                    granteeType = grantee.substring(0, prefixEnd).trim();
import org.jkiss.dbeaver.model.connection.DBPDriver;

        List<PostgrePrivilege> permissions = new ArrayList<>();
            return Collections.emptyList();
        @NotNull String fullTypeName
            if (divPos == -1) {
                        PostgreCommandGrantPrivilege grant = new PostgreCommandGrantPrivilege(permission.getOwner(), true, object, permission, permission.getPrivileges());
                    opt.append(option, 0, divPos).append(" '").append(option.substring(divPos + 1)).append("'");
                return 13; // "4713-01-01 BC" to  "01/01/4713 BC" - "31/12/32767"
                                granteeReference,
        return null;
                    schemaTypeName = parts[1];
        log.debug("Can't get column '" + columnName + "': " + exception.getMessage());
     * Retrieves delimiter used for separating array elements of the given type.
        for (OBJECT object : objects) {
    public static PostgreDataType resolveTypeFullName(
            case PostgreOid.BIT -> typeMod;
            }
                                        // Do not forget to turn on the PG connection setting "Read all data types" to have arrays, tables, etc. types in the data type cache
            if (owner != null) {
    }
                }
                    return UNKNOWN_LENGTH;
        }
            }
            @NotNull OWNER owner,
            for (int i = 0; i < options.length; i++) {
                }
                }
                if (typmod == -1)
            }

    public static int getDisplaySize(long oid, int typmod) {
            DBSInstance ownerInstance = session.getExecutionContext().getOwnerInstance();
    }
            case PostgreOid.CHAR, PostgreOid.BOOL -> 1;
            }
        return dataSource.isServerVersionAtLeast(8, 4);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    return result;
 * you may not use this file except in compliance with the License.
                    actions.add(new SQLDatabasePersistAction("Owner change", alterScript));
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                    }
            if (divPos == -1) {
        @NotNull PostgreSchema schema,
    public static String[] safeGetStringArray(@NotNull ResultSet dbResult, @NotNull String columnName) {
        @NotNull DBRProgressMonitor monitor,
                    schemaTypeName = DBUtils.getFullyQualifiedName(dataSource, Arrays.copyOfRange(parts, 1, parts.length));
        @NotNull Map<String, Object> options
            case PostgreOid.TIMETZ:
        return null;
                // These values are for the longest possible length.
                        if (docEntity != null) {
     */
        @NotNull PostgrePrivilegeOwner owner,
        @NotNull String fullTypeName
                PostgreObjectPrivilege permission = new PostgreObjectPrivilege(owner, granteeReference, privileges);
        }
    /**
                    grantee = grantee.substring(prefixEnd).trim();

    }
                    dbTypeName = DBUtils.getFullyQualifiedName(dataSource, Arrays.copyOfRange(parts, 1, parts.length));
                PostgreRole objectOwner = owner.getOwner(monitor);

        @NotNull PostgreViewBase view,
            if (CommonUtils.isEmpty(aclValue)) {
    @NotNull
                        if (parts.length == 3) {
                if (typeMod == -1)

        } catch (SQLException e) {
            case PostgreOid.NUMERIC -> {
        }
    public static boolean supportsTypeCategory(@NotNull JDBCDataSource dataSource) {
import org.jkiss.dbeaver.ModelPreferences;
        );
            Collection<PostgrePrivilege> permissions = object.getPrivileges(monitor, true);

                        } else {
            return dataType;
        @NotNull GenericStructContainer container,
                ids[i] = CommonUtils.toInt(strings[i]);
                List<PostgrePrivilegeGrant> privileges = new ArrayList<>();
        if (CommonUtils.isEmpty(serverTypeName)) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                continue;
            aclValues[i] = aclValue;
    ) throws DBException {
                } else {
import java.sql.ResultSet;
            case BOOLEAN -> "bool";
    }
            return pgObject;
        }
                        new PostgrePrivilegeGrant(
                                if (dataType instanceof PostgreDataType dt) {
    }
        return switch ((int) typeOid) {
                                // Type name in JDBCColumnMetaData can be fully qualified and quoted. Let's fix it for the better search in the getDataType() method
    }

 *
    /**
        switch ((int) oid) {
                    throw new IllegalArgumentException("Error reading array value: " + pgVector);
        @NotNull IntFunction<T[]> generator
            case PostgreOid.FLOAT8:
                                            PostgreDataType dataType = schema.getDataTypeCache().getObject(monitor, schema, typeName);
                if (k < privString.length() - 1 && privString.charAt(k + 1) == '*') {
    public static <T> T[] safeGetArray(
                            result[i] = ((Number) item).longValue();
                    grantor,

                continue;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (serverType == null) {

            for (int i = 0; i < objVector.length; i++) {
                if (localDataType != null) {
                yield ((typeMod - 4) & 0xFFFF0000) >> 16;
                                        .getPersistActions(monitor, executionContext, options));
        @Nullable Object acl,
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
                dataType = resolvedSchema.getDataTypeCache().getObject(monitor, resolvedSchema, schemaTypeName);
    public static String getObjectComment(
                                        }
            // "length in characters of the String representation"
    public static String getObjectUniqueName(PostgrePrivilegeOwner object, Map<String, Object> options) {
                    }
    }
     * @see #safeGetArray(ResultSet, String, Function, IntFunction)
            if (attr.getOrdinalPosition() == attNum) {
            }
            String privString = permString.substring(0, divPos2);

        switch (pgVector) {
                }
    }
                        }
    public static List<PostgrePrivilege> extractPermissionsFromACL(
        String clearSQLDefinition = SQLUtils.stripComments(view.getDataSource().getSQLDialect(), definition);
                    case 1 ->
            }
     */
            }
            if (m.find()) {
    }
        definition = definition.trim();
        @NotNull String columnName,
        } else if (pgVector instanceof int[] intVector) {
    /**
import org.jkiss.utils.Pair;
                return null;
                                false,
import java.lang.reflect.Array;
            if (resolvedDatabase != null) {
 *
    @Nullable

            case String vector -> {
                throw new IllegalArgumentException("Error reading array value: " + pgVector);
    public static String getViewDDL(
import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;
import org.jkiss.dbeaver.model.struct.*;
        };
import org.jkiss.dbeaver.model.DBPDataKind;
            activeDatabaseName = configuration.getBootstrap().getDefaultCatalogName();
            case PostgreOid.INT4:
                        if (database != null) {
                        }
                        } else if (item != null) {

            String grantorName = permString.substring(divPos2 + 1);
        StringBuilder sql = new StringBuilder(view instanceof PostgreView ? "CREATE OR REPLACE " : "CREATE ");
        String[] parts;
        }
            return postgreDataSource.getServerType().isPGObject(object);
import org.jkiss.dbeaver.model.DBPDataSource;
            default:
        }
    public static List<PostgrePrivilege> extractPermissionsFromACL(
     * Attempts to retrieve an array of shorts from the result set under the given {@code columnName}.
        if (!isPgObject(dataSource, pgObject)) {
    public static boolean isMetaObjectExists(@NotNull JDBCSession session, @NotNull String tableName, @NotNull String columnName) {
                    long[] result = new long[length];
        if (object != null && dataSource instanceof PostgreDataSource postgreDataSource) {
    @Nullable
        };
                        if (item instanceof Number) {
        return opt.toString();
        return null;
    ) throws DBException {
        if (!(acl instanceof java.sql.Array)) {

            case PostgreOid.BYTEA:
    private static final Log log = Log.getLog(PostgreUtils.class);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            monitor, dataSource, dataSource.getDefaultInstance(),
            return result;
import org.jkiss.code.NotNull;
    public static int[] getIntVector(@Nullable Object pgObject, @NotNull DBPDataSource dataSource) {

     * @param dbResult   a result set to retrieve data from
                int[] result = new int[length];

    /**
        Object pgVector = extractPGObjectValue(pgObject, dataSource);
                } catch (DBException e) {
     * @param columnName a name of a column to retrieve data from
        if (divPos > 0) {
    }
    @Nullable
    @NotNull
                    yield 0;
        @NotNull PostgreDataSource dataSource,
     * @return state of the meta object existence in the system data
        }

            PostgreDatabase resolvedDatabase = dataSource.getDatabase(parts[0]);

                    PostgrePrivilegeType.getByCode(pCode),
    private static String[] splitTypeNameIdentifier(
            } else {

            case CONTENT -> "bytea";

                result[i] = objVector[i];
    }
            log.debug("Can't extract value from " + pgObject.getClass().getName(), e);
        return permissions;
            return new int[]{number.intValue()};
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;
import org.jkiss.dbeaver.model.DBUtils;
        if (type instanceof PostgreDataType dt) {
            return Collections.emptyList();
                if (typeMod == -1)
                return 6; // -32768 to +32767
            PostgreRole owner = object.getOwner(monitor);
            case PostgreOid.BOOL:
                    for (int i = 0; i < length; i++) {
                }
    }
            return Double.parseDouble(str);
     * @see PostgreValueParser#parsePrimitiveArray(String, Function, IntFunction)
package org.jkiss.dbeaver.ext.postgresql;
        if (object instanceof PostgreProcedure) {
                    return localDataType;
 * DBeaver - Universal Database Manager
        dataType = dataSource.getLocalDataType(identifier);
                    owner.getName(),
        if (monitor == null) {
                try {
        return safeGetArray(dbResult, columnName, Boolean::valueOf, Boolean[]::new);
            return JDBCUtils.queryString(
        if (pgVector == null) {
        }
    ) {
            itemArray = ((java.sql.Array) acl).getArray();
            case DATETIME -> "timestamp";
    private static PostgreDataType resolveTypeFullName(
            int divPos = aclValue.indexOf('=');
                // date = '294276-11-20' = 12 --enable-integer-datetimes
        @NotNull PostgreDataSource dataSource,
                    case PostgreOid.TIMESTAMP:
            if (vector.isEmpty()) {
            case PostgreOid.INT8 -> 19;
            case PostgreOid.BPCHAR, PostgreOid.VARCHAR -> {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load PostgreSQL description")) {
                            String typeName = type.getTypeName();
                    select description from pg_catalog.pg_description
import org.jkiss.dbeaver.model.exec.DBCSession;
                    if (permission.hasAllPrivileges(object)) {
                int divPos = option.indexOf('=');
                    k++;
            lastPos = url.length();

            // Search data type in schema from fullTypeName part
                        }
            final String value = dbResult.getString(columnName);
            }
            return ((PostgreDataType) type).getArrayDelimiter();
        final Set<PostgreRoleReference> grantees = new HashSet<>();
                            }
                } catch (SQLException e) {
            case PostgreOid.FLOAT4 ->
            exception = e;
        return sql.toString();
                }
        @NotNull String schema,
                return 1;
                log.warn("Bad ACL item: " + aclValue);
                long[] result = new long[objVector.length];
                // varies based upon the extra_float_digits GUC.

                if (prefixEnd < grantee.length()) {

            grantee = DBUtils.getUnQuotedIdentifier(database.getDataSource(), grantee);
                    session,
            }
    }
                // Special case. Means ALL permissions are granted to table owner
            case BINARY -> "bytea";
                    grantee,
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerType;
        } else {
        boolean isDefault
                    }
                                        // Try to find data type in the schema data type cache
     *
        }
                    DBCEntityMetaData entityMetaData = cmd.getEntityMetaData();
     * Returns state of the meta object existence from the system catalogs.
    public static PostgreServerType getServerType(@NotNull DBPDriver driver) {
    @Nullable
     * @return array elements
       TODO consider using {@link org.jkiss.dbeaver.model.DBUtils#getConnectivityParameters(DBPConnectionConfiguration, DBPDriver)}.
            }
        Object itemArray;
                    owner.getDatabase().getName(),
                                                return dataType;
                        throw new IllegalArgumentException("Bad array item type: " + item.getClass().getName());
            }
                    yield UNKNOWN_LENGTH;
        for (int i = 0; i < objectList.size(); i++) {


            objects = cache.getAllObjects(monitor, owner);

        return new PostgreRoleReference(database, grantee, granteeType);
            }
            }
        for (String aclValue : acl) {
                // significant digits out, but extra_float_digits may raise
        } else {
                if (parts.length == 2) {
        @NotNull DBRProgressMonitor monitor,
        }
                            }
    @NotNull
                permissions.add(new PostgreDefaultPrivilege(owner, grantee, grantor, privileges));
                            throw new IllegalArgumentException("Bad array item type: " + item.getClass().getName());
                                return dataType;
            if (ownerInstance instanceof PostgreDatabase pdb) {
        return resolveTypeFullName(monitor, database.getDataSource(), database, database.getMetaContext().getDefaultSchema(), fullTypeName);
        dataType = database.getLocalDataType(identifier);
        @NotNull PostgreDatabase database,
                    join pg_catalog.pg_class on pg_description.objoid = pg_class.oid

            if (type instanceof JDBCColumnMetaData cmd) {
                    PostgreSchema resolvedSchema = resolvedDatabase.getSchema(monitor, parts[1]);
            }

    }
            int[] result = new int[objVector.length];
    @NotNull
                }
        @NotNull List<DBEPersistAction> actions,
     * Attempts to retrieve an array using {@link ResultSet#getArray(String)}, and if it can't
                    join pg_catalog.pg_namespace on pg_class.relnamespace = pg_namespace.oid
            log.debug("Error reading system information from the " + tableName + " table: " + e.getMessage());
        }
                final long[] ids = new long[strings.length];
        int aclValuesCount = Array.getLength(itemArray);
            dbStat.setLong(index + i, objectList.get(i).getObjectId());
                    case 0 -> 0;
            String aclValue = CommonUtils.toString(extractPGObjectValue(aclItem, owner.getDataSource()));
                        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
    public static PostgreDataType findDataType(
                if (vector.isEmpty()) {
                String alterScript = object.generateChangeOwnerQuery(DBUtils.getQuotedIdentifier(owner), options);
                } else if (parts.length > 2) {
    }
            case java.sql.Array array1 -> {
        try {
    public static <OWNER extends DBSObject, OBJECT extends PostgreObject> OBJECT getObjectById(
                                owner.getSchema().getName(),
        }
    public static Object extractPGObjectValue(@Nullable Object pgObject, @NotNull DBPDataSource dataSource) {
                exception = e;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    {
     */
import org.jkiss.dbeaver.DBException;
                return result;
            parts = SQLUtils.splitFullIdentifier(identifier, ".", dataSource.getSQLDialect().getIdentifierQuoteStrings(), false);
            }
                    false
        } else if (pgVector instanceof java.sql.Array pgArray) {
        PostgreDataType dataType = schema.getDataTypeCache().getObject(monitor, schema, identifier);
            if (resolvedSchema != null) {
                    } else {
            return dataSource.getLocalDataType(typeName);

            throws DBException {
            for (int k = 0; k < privString.length(); k++) {
                    if (entityMetaData != null) {
        if (dataType != null) {
    @NotNull
                    withGrantOption,
                        String dbSchemaTypeName;
    }
    private static final Pattern ROLE_TYPE_PATTERN = Pattern.compile("^\\w+\\s+");
                        }
 * Unless required by applicable law or agreed to in writing, software
    /*
                }
    ) throws DBException {
        @NotNull String definition,
                continue;
    private static PostgreRoleReference extractGranteeName(@NotNull PostgreDatabase database, @NotNull String aclValue, int divPos) {
                String option = options[i];
            return null;
 */
        }
                            dbSchemaTypeName = parts[2];
    /**
        String activeDatabaseName = null;
        }
        opt.append("(");


    }
        for (int i = divPos + 1; i < url.length(); i++) {
    }
    @Nullable
        return PostgreConstants.TYPE_GEOMETRY.equals(typeName) ||
                                false));

        String grantee = aclValue.substring(0, divPos).trim();
        return parts;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (array == null) {
    private static Number parseNumber(@NotNull String str) {
/**
                return UNKNOWN_LENGTH;
    @Nullable
                int length = Array.getLength(array);
        opt.append(")");
        }
            case PostgreOid.TEXT:
        @NotNull DBRProgressMonitor monitor, @NotNull PostgreDatabase database, @NotNull String fullTypeName
                activeDatabaseName = configuration.getDatabaseName();
                    throw new DBCException("Error extracting column " + type + " data type", e);
     * @param columnName name of the required column or symbol *
            case Long[] objVector -> {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            case PostgreOid.INT8:
                                granteeReference,
            final int[] ids = new int[strings.length];

            if (object.getObjectId() == objectId) {
    }
            definition = definition.substring(0, definition.length() - 1);
    ) throws DBException {
            return null;
                        Collections.addAll(actions,
 */
                    default -> typmod + 1;
            if (object.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_EXTRA_DDL_INFO)) {
    ) throws DBException {
            try {
            // datetime types get the
        if (lastPos < 0) {
                return ids;
            return DBUtils.getEntityScriptName(object, options);
            // Quoted role names are stored with escaped quotes. We don't need quotes here (#13477)
        }
     *
        return typeName.startsWith("\"") || typeName.contains(".");


        return false;
            int divPos = aclValue.indexOf('=');
            return dataType;

    @NotNull
        } else if (type instanceof PostgreAttribute<?> attr) {

        try {
            return null;
        @NotNull JDBCPreparedStatement dbStat,
        if (pgVector == null) {
                }
            // Permissions
            if (matcher.find()) {
    @SuppressWarnings("unchecked")
                // date = '5874897-12-31' = 13 (although at large values second precision is lost)
        return resolveTypeFullName(monitor, schema.getDataSource(), schema.getDatabase(), schema, fullTypeName);
        boolean isDefault
    }
import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;
            if (CommonUtils.isEmpty(activeDatabaseName)) {
                    }
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    public static Boolean[] safeGetBooleanArray(@NotNull ResultSet dbResult, @NotNull String columnName) {
            }
                    ids[i] = CommonUtils.toLong(strings[i]);
            if (CommonUtils.isEmpty(aclValue)) {
            return value != null ? PostgreValueParser.parsePrimitiveArray(value, converter, generator) : null;
        }


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                int precision = (typmod - 4 >> 16) & 0xffff;
                                new PostgreCommandGrantPrivilege(permission.getOwner(), true, object, permission, new PostgrePrivilegeType[]{PostgrePrivilegeType.ALL})
                yield typeMod - 4;
                privileges.add(new PostgrePrivilegeGrant(
        return lastPos;

                            }
        @NotNull PostgrePrivilegeOwner object,
            return url.substring(0, divPos + 1) + dbName + url.substring(lastPos);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            case PostgreOid.BPCHAR:
            if (isDefault) {
                actions.add(new SQLDatabasePersistActionComment(object.getDataSource(), "Permissions"));
            serverTypeName = PostgreServerPostgreSQL.TYPE_ID;
            final java.sql.Array value = dbResult.getArray(columnName);
    ) {
        PostgreServerType serverType = PostgreServerTypeRegistry.getInstance().getServerType(serverTypeName);
            grantees.add(grantee);
            throw new IllegalStateException("PostgreSQL server type '" + serverTypeName + "' not found");
    ) {
                // time = '00:00:00' = 8
        return safeGetArray(dbResult, columnName, Function.identity(), String[]::new);
            case long[] longs -> {
        }
            case PostgreOid.DATE:
        return "SELECT " + columnName + " FROM pg_catalog." + tableName + " WHERE 1<>1 LIMIT 1";
    public static boolean isGISDataType(@NotNull String typeName) {
                return 1;
                };
        } else {
                                DBSDataType dataType = tee.getDataType();
                if (typmod == -1)

        @NotNull Function<String, T> converter,
    @Nullable

            grantee = "public";
            }
     *
                                }
    public static Set<PostgreRoleReference> extractGranteesFromACL(@NotNull PostgreDatabase database, @NotNull String[] acl) {
                PostgreRoleReference granteeReference = objectOwner == null ? null : objectOwner.getRoleReference();
        int index,
        }
            PostgreRoleReference grantor = new PostgreRoleReference(owner.getDatabase(), grantorName, null);
                        Object item = Array.get(array, i);
                    return null;
     * @return query for the system column checking
import org.jkiss.dbeaver.model.edit.DBERegistry;
        if (entityEditor != null) {
     * But sometimes, this approach is not working.
            case PostgreOid.OID, PostgreOid.INT4 -> 10;
        }
                }
        }
    public static <T extends PostgreAttribute<?>> T getAttributeByNum(@NotNull Collection<T> attrs, int attNum) {
                            if (dataType != null) {
        @NotNull DBRProgressMonitor monitor,
        Object pgVector = extractPGObjectValue(pgObject, dataSource);

    public static boolean isPgObject(@NotNull DBPDataSource dataSource, @Nullable Object object) {
                            dbSchemaTypeName = DBUtils.getFullyQualifiedName(dataSource, Arrays.copyOfRange(parts, 2, parts.length));
        @NotNull Map<String, Object> options
                    opt.append(option);
            }
            case PostgreOid.TIME:
    }
                        PostgreDatabase database = dataSource.getDatabase(databaseName);
            return value != null ? (T[]) value.getArray() : null;

     */
        if (!ArrayUtils.isEmpty(options)) {
            case PostgreOid.VARBIT:
                                        PostgreSchema schema = database.getSchema(monitor, schemaName);
    }
    public static String getQueryForSystemColumnChecking(@NotNull String tableName, @NotNull String columnName) {
        }
                    case PostgreOid.TIME:
                return object;
                    // Search data type in database and schema from fullTypeName part
        } else {
            if (!Character.isLetterOrDigit(c) && c != '_' && c != '$' && c != '.') {
        Exception exception = null;
    }
        try {
     *
        return name.replace(PostgreConstants.USER_VARIABLE, database.getMetaContext().getActiveUser());
        view.appendTableModifiers(monitor, sql);
                activeDatabaseName = matcher.group(1).replace("%2F", "/");
    public static String getObjectTypeName(@NotNull PostgrePrivilegeOwner object) {
                    return dataType;
                // For float4 and float8, we can normally only get 6 and 15
                                    if (identifiers.length == 2) {
            return intVector;
        if (configuration.getConfigurationType() == DBPDriverConfigurationType.MANUAL) {
        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();
                if (dataType != null) {
    public static Number[] safeGetNumberArray(@NotNull ResultSet dbResult, @NotNull String columnName) {
            return ids;
        } catch (SQLFeatureNotSupportedException | UnsupportedOperationException | IncompatibleClassChangeError ignored) {
            int divPos2 = permString.indexOf('/');
                try {
        }

    ) throws DBException {
        return null;
                lastPos = i;
            throw new IllegalArgumentException("Unsupported vector type: " + pgVector.getClass().getName());
    }
            char c = url.charAt(i);
                                    return dt;
        final PostgreViewManager entityEditor = editorsRegistry.getObjectManager(view.getClass(), PostgreViewManager.class);
        }
                final String[] strings = vector.split(PostgreConstants.DEFAULT_ARRAY_DELIMITER);
     *
    // FIXME consider user/group/role name like "test test", "test=test", "test,test", "test\"test" and user name like "group" or "role"
            }
import org.jkiss.utils.ArrayUtils;

    }
            return true;
    public static String getRealSchemaName(@NotNull PostgreDatabase database, @NotNull String name) {
        if (object.isPersisted() && CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
            case PostgreOid.TIMESTAMPTZ:
            return dt;
     * Attempts to retrieve an array of booleans from the result set under the given {@code columnName}.
            PostgreRoleReference grantee = extractGranteeName(database, aclValue, divPos);
            }
            Matcher matcher = pattern.matcher(url);
                                            }
            case PostgreOid.BIT:

                return typmod - 4;
        }
import java.util.regex.Pattern;
                    } else if (item != null) {
            final String[] strings = vector.split(PostgreConstants.DEFAULT_ARRAY_DELIMITER);
                return 15; // sign + 9 digits + decimal point + e + sign + 2 digits
        }
        }
                return 11; // -2147483648 to +2147483647
        for (T attr : attrs) {
    }
        }
                String schemaTypeName;
        return serverType;

        }
                """
                            if (PostgreUtils.isCompositeTypeName(typeName)) {
        final String identifier = DBUtils.getTypeModifiers(fullTypeName).getFirst();
        if (grantee.isEmpty()) {
/*
            if (divPos2 == -1) {


        }
     * Usually, we can check the info about system columns (whether existing or not, depending on the server version) in the documentation.
                PostgreDataType localDataType = pdb.getDataType(monitor, typeName);
    }
    @NotNull
     * @param converter  a function that takes string representation of an element and returns {@code T}
    public static String getArrayDelimiter(@NotNull DBSTypedObject type) {
                    return UNKNOWN_LENGTH;
                return Collections.singletonList(permission);
     * @param session to execute a query
        Collection<OBJECT> objects;
    public static PostgreDataType resolveTypeFullName(
        int divPos = url.lastIndexOf('/');

    }
                for (int i = 0; i < length; i++) {
            if (!CommonUtils.isEmpty(permissions)) {
            default -> "TABLE";
 * postgresql utils
        @NotNull DBRProgressMonitor monitor,
                }
                for (int i = 0; i < objVector.length; i++) {
    public static void setArrayParameter(
        @NotNull DBRProgressMonitor monitor, @NotNull PostgreDataSource dataSource, @NotNull String fullTypeName
            }
                Object array = pgArray.getArray();
    }
            }
        return switch (dataKind) {
                }
            }

            case PostgreOid.CHAR:
                        Collections.addAll(actions, grant.getPersistActions(monitor, executionContext, options));
        @NotNull String object
    }
                boolean withGrantOption = false;
                    }
        return extractPermissionsFromACL(owner, aclValues, isDefault);
            case PostgreOid.DATE, PostgreOid.TIME, PostgreOid.TIMETZ, PostgreOid.INTERVAL, PostgreOid.TIMESTAMP, PostgreOid.TIMESTAMPTZ ->
                int secondSize = switch (typmod) {
            }
                        String databaseName = cmd.getCatalogName();
                }
        if (type instanceof PostgreDataType) {
        @NotNull DBCSession session,
                    Object item = Array.get(array, i);
    }
        return switch (object) {
        try {
        while (definition.endsWith(";")) {
                                if (!ArrayUtils.isEmpty(identifiers)) {
        } else if (pgVector instanceof Number number) {
    public static String getOptionsString(@NotNull String[] options) {
            if (exception == null) {
import org.jkiss.utils.CommonUtils;
        if (pgObject == null) {
                        2 + 1;
    public static PostgreDataType resolveTypeFullName(
        @NotNull PostgreDataSource dataSource, @NotNull String fullTypeName
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreViewManager;
            // Search data type in database from fullTypeName part
            }
            DBCExecutionContext executionContext = DBUtils.getDefaultContext(object, true);
        } catch (Exception e) {
        if (clearSQLDefinition.toLowerCase(Locale.ENGLISH).startsWith("create ")) {
            parts = new String[]{identifier};
                if (parts.length == 2) {
                return typmod;
     * of an array retrieved using {@link ResultSet#getString(String)}.
        } catch (SQLException e) {
    /**
                    case PostgreOid.TIMETZ:
            String permString = aclValue.substring(divPos + 1);
 *
                privileges.add(
                        if (dataType != null) {
            }
                return UNKNOWN_LENGTH;
        @NotNull DBRProgressMonitor monitor,
        } else {
            case PostgreOid.INTERVAL:
 * You may obtain a copy of the License at
        } else {
                return longs;
                return result;
            }
public class PostgreUtils {
            JDBCUtils.queryString(session, getQueryForSystemColumnChecking(tableName, columnName));
                            DBSEntityAttribute attribute = docEntity.getAttribute(monitor, cmd.getName());
                        // Bizarrely SELECT '0:0:0.1'::time(1); returns 2 digits.
import org.jkiss.code.Nullable;
    @NotNull
                switch ((int) oid) {
        }

                                        String schemaName = identifiers[0];
                    yield UNKNOWN_LENGTH;
            String typeName = type.getTypeName();
                } else {
            return ((PostgreProcedure) object).getFullQualifiedSignature();
    ) throws DBException {
                // Try to resolve local data type in database from fullTypeName part
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                                            if (dataType != null) {
    private static final int UNKNOWN_LENGTH = -1;
     * @param columnName name of the system column. Use "*" param, if you need to check access to the full table/view.
        @NotNull DBSTypedObject type
            case Number number -> {
            int lastPos = getLastNonDatabaseCharPos(divPos, url);
                for (int i = 0; i < strings.length; i++) {
            default -> throw new IllegalArgumentException("Unsupported vector type: " + pgVector.getClass().getName());
            }
        }
    public static String updateDatabaseNameInURL(@NotNull String url, @NotNull String dbName) {
                    where pg_class.relname = ? and pg_namespace.nspname=?""", object, schema);
                    return 131089; // SELECT LENGTH(pow(10::numeric,131071)); 131071 = 2^17-1
                }
    public static String getDefaultDataTypeName(@NotNull DBPDataKind dataKind) {
                }
                        return 8 + secondSize;
            aclValue = aclValue.replace("\\\"", "\"");
                                String[] identifiers = SQLUtils.splitFullIdentifier(typeName, ".", dataSource.getSQLDialect().getIdentifierQuoteStrings(), false);
                for (PostgrePrivilege permission : permissions) {
    @Nullable
                // sign + digits + decimal point (only if we have nonzero scale)
                            if (attribute instanceof DBSTypedObjectEx tee) {

        try {
                return 25; // sign + 18 digits + decimal point + e + sign + 3 digits
    }
 * See the License for the specific language governing permissions and
    @NotNull
                permissions.add(new PostgreObjectPrivilege(owner, grantee, privileges));
}        } catch (NumberFormatException e) {
     * @see #safeGetArray(ResultSet, String, Function, IntFunction)
        }
        } catch (Exception e) {
     * Attempts to retrieve an array of strings from the result set under the given {@code columnName}.
        return safeGetArray(dbResult, columnName, PostgreUtils::parseNumber, Number[]::new);
                break;
     * @param type type to get array delimiter for
        if (dataType != null) {
            default -> "varchar";
        }
    @NotNull

        } else if (parts.length > 1) {
        final Pair<String, String[]> typeNameInfo = DBUtils.getTypeModifiers(fullTypeName);
                                }
                    int length = Array.getLength(array);
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCColumnMetaData;
                return 49; // SELECT LENGTH('-123456789 years 11 months 33 days 23 hours 10.123456 seconds'::interval);
                String dbTypeName;
            }
    private static int getLastNonDatabaseCharPos(int divPos, @NotNull String url) {
                }
        String[] aclValues = new String[aclValuesCount];
    @NotNull
        @NotNull PostgrePrivilegeOwner owner,
     * @param tableName name of the system table
        } else {
            entityEditor.appendViewDeclarationPostfix(monitor, sql, view);
            String url = configuration.getUrl();
    @NotNull
            log.debug(e);
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreCommandGrantPrivilege;
            Object aclItem = Array.get(itemArray, i);
import org.jkiss.dbeaver.model.DBPScriptObject;
                    Object array = ((java.sql.Array) pgVector).getArray();
        }
            case PostgreOid.VARCHAR:
            case ROWID -> "oid";
            case STRING -> "varchar";
                        result[i] = ((Number) item).intValue();
            return pgObject.getClass().getMethod("getValue").invoke(pgObject);
        // In some cases view definition already has view header (e.g. Redshift + with no schema binding)
            return attr.getDataType();
    ) throws DBException {
                                    }
        @NotNull PostgreSchema schema,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        return activeDatabaseName;
     */
        // Try to resolve local data type in specified data source
                                        // Most likely, in the identifiers array we have the name of the scheme and the name of the data type in this case
        //typeOid = convertArrayToBaseOid(typeOid);
            if (acl == null) {
    }
        }
            return url + "/" + dbName;
            // The monitor is null. Let's find our object in the cached objects list.
            }
                PostgreConstants.TYPE_GEOGRAPHY.equals(typeName);
        } else if (pgVector instanceof Integer[] objVector) {
