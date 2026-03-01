    }
    private static final Log log = Log.getLog(MySQLUtils.class);
    {
            case MySQLConstants.TYPE_MULTIPOINT:


        typeMap.put("integer", java.sql.Types.INTEGER);
    private static final String COLUMN_POSTFIX_PRIV = "_priv";
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public static boolean isColumnSridSupported(@NotNull MySQLDataSource dataSource) {
            case MySQLConstants.TYPE_GEOMETRY:
        typeMap.put("bit", java.sql.Types.BIT);
        typeMap.put("time", java.sql.Types.TIME);
                }
                if (colName.toLowerCase(Locale.ENGLISH).endsWith(COLUMN_POSTFIX_PRIV)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        typeMap.put("date", java.sql.Types.DATE);
        @NotNull AbstractNativeToolSettings<?> settings,
    }
        typeMap.put("geometry", java.sql.Types.BINARY);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

        typeMap.put("dec", java.sql.Types.DECIMAL);
 * See the License for the specific language governing permissions and
            case MySQLConstants.TYPE_GEOMETRYCOLLECTION:
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPDriver;
    {
 *

        typeMap.put("float", java.sql.Types.REAL);
/*

                        return resultSet.getString(1);
     */

        typeMap.put("mediumtext", java.sql.Types.VARCHAR);
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
     * Check if column SRID ({@code SRID <srid>} attribute) is supported
 * Unless required by applicable law or agreed to in writing, software
        // There's no any documentation in which version this feature was added
    public static int typeNameToValueType(String typeName)
        typeMap.put("double precision", java.sql.Types.DOUBLE);
    /**
            case MySQLConstants.TYPE_POINT:
    }
        typeMap.put("year", java.sql.Types.DATE);

                    privs.add(colName.substring(0, colName.length() - COLUMN_POSTFIX_PRIV.length()));

        typeMap.put(MySQLConstants.TYPE_NAME_ENUM, java.sql.Types.CHAR);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

                    return null;
        typeMap.put("boolean", java.sql.Types.BOOLEAN);
                driver.getDriverClassName());
        typeMap.put("datetime", java.sql.Types.TIMESTAMP);
        typeMap.put("tinyint", java.sql.Types.TINYINT);
 * MySQL utils
 *     http://www.apache.org/licenses/LICENSE-2.0
        return RuntimeUtils.getNativeBinaryName("mysql");
 *
        try {
    @NotNull
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;

        typeMap.put("int24", java.sql.Types.INTEGER);
        typeMap.put("mediumblob", java.sql.Types.LONGVARBINARY);
        } catch (SQLException e) {
                    if (resultSet.next()) {
    public static File getDumpExecutablePath(@NotNull AbstractNativeToolSettings<?> settings) throws IOException {
 * you may not use this file except in compliance with the License.
import java.util.*;

        typeMap.put("tinyblob", java.sql.Types.BINARY);

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public static boolean isMariaDB(DBPDriver driver) {
        // Switch expression looks ugly here, sorry
        typeMap.put("bool", java.sql.Types.BOOLEAN);
    private static File getExecutablePath(
    @NotNull
 * You may obtain a copy of the License at
        return getExecutablePath(settings, "mysqldump", "mariadb-dump"); //$NON-NLS-1$ //$NON-NLS-2$
    @NotNull
        @NotNull String mariaName
        @NotNull String mysqlName,
        typeMap.put("char", java.sql.Types.CHAR);
                String colName = rsMetaData.getColumnName(i + 1);
    public static Map<String, Boolean> collectPrivileges(List<String> privNames, ResultSet resultSet)

        } catch (SQLException e) {
        typeMap.put("int", java.sql.Types.INTEGER);
        return dataSource.isMariaDB() ? dataSource.isServerVersionAtLeast(10, 2) : dataSource.isServerVersionAtLeast(5, 7);
    static {
import org.jkiss.dbeaver.tasks.nativetool.AbstractNativeToolSettings;
        // Now collect all privileges columns

public class MySQLUtils {
    public static List<String> collectPrivilegeNames(ResultSet resultSet)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    /**
        DBPNativeClientLocation location = settings.getClientHome();
        typeMap.put("decimal", java.sql.Types.DECIMAL);

        typeMap.put(MySQLConstants.TYPE_UUID, Types.CHAR);
            List<String> privs = new ArrayList<>();
                try (JDBCResultSet resultSet = dbStat.executeQuery()) {
    public static File getClientExecutablePath(@NotNull AbstractNativeToolSettings<?> settings) throws IOException {
        return MySQLConstants.DRIVER_CLASS_MARIA_DB.equals(
        try {
    }
            return privs;
        return valueType == null ? java.sql.Types.OTHER : valueType;
import org.jkiss.dbeaver.model.exec.DBCException;
        typeMap.put("text", java.sql.Types.VARCHAR);
        typeMap.put("bigint", java.sql.Types.BIGINT);
        typeMap.put("smallint", java.sql.Types.SMALLINT);
            for (int i = 0; i < colCount; i++) {
    public static String getMariaDBConsoleBinaryName() {
            case MySQLConstants.TYPE_MULTIPOLYGON:
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import java.sql.ResultSetMetaData;
            case MySQLConstants.TYPE_MULTILINESTRING:
            case MySQLConstants.TYPE_LINESTRING:
        if (location == null) {
            }
    }
}
        typeMap.put("double", java.sql.Types.DOUBLE);
        typeMap.put("blob", java.sql.Types.LONGVARBINARY);
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
    }
        // Get active schema
        return !dataSource.isMariaDB() && dataSource.isServerVersionAtLeast(8, 0);
            int colCount = rsMetaData.getColumnCount();
        typeMap.put("binary", java.sql.Types.BINARY);
        // Now collect all privileges columns

     * Check if given type name is a spatial data type
import java.sql.SQLException;
            throw new IOException("MySQL client location is not specified");
            privs.put(privName, "Y".equals(JDBCUtils.safeGetString(resultSet, privName + COLUMN_POSTFIX_PRIV)));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    }
            return RuntimeUtils.getNativeClientBinary(location, MySQLConstants.BIN_FOLDER, mariaName);
        switch (name.toLowerCase(Locale.ROOT)) {
            case MySQLConstants.TYPE_POLYGON:
    @NotNull
import java.io.File;
            return Collections.emptyList();
        typeMap.put(MySQLConstants.TYPE_NAME_SET, java.sql.Types.CHAR);
                return true;
    }
        Integer valueType = typeMap.get(typeName.toLowerCase(Locale.ENGLISH));

        typeMap.put("real", java.sql.Types.DOUBLE);
        }
            return RuntimeUtils.getNativeClientBinary(location, MySQLConstants.BIN_FOLDER, mysqlName);
    ) throws IOException {
            throw new DBCException(e, session.getExecutionContext());
    private static final Map<String, Integer> typeMap = new HashMap<>();
        }
                return false;
 */
        typeMap.put("varchar", java.sql.Types.VARCHAR);
        return RuntimeUtils.getNativeBinaryName("mariadb");
/**
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
    public static boolean isAlterUSerSupported(MySQLDataSource dataSource) {
    public static boolean isSpatialDataType(@NotNull String name) {
    }
 * limitations under the License.
        typeMap.put("longblob", java.sql.Types.LONGVARBINARY);
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT DATABASE()")) {
            log.debug(e);
import java.io.IOException;
    {
        return privs;
 *
        for (String privName : privNames) {
        typeMap.put("longtext", java.sql.Types.VARCHAR);
                }
package org.jkiss.dbeaver.ext.mysql;
    public static String determineCurrentDatabase(JDBCSession session) throws DBCException {
        typeMap.put("varbinary", java.sql.Types.VARBINARY);
        Map<String, Boolean> privs = new TreeMap<>();
     */
            default:


 */
        typeMap.put("timestamp", java.sql.Types.TIMESTAMP);
    }
import java.sql.ResultSet;
        } catch (IOException ignored) {
    }
    }
        return getExecutablePath(settings, "mysql", "mariadb"); //$NON-NLS-1$ //$NON-NLS-2$
    public static String getMySQLConsoleBinaryName()


        try {
    }
        typeMap.put("numeric", java.sql.Types.DECIMAL);
import java.sql.Types;
        typeMap.put("tinytext", java.sql.Types.VARCHAR);
            }
        }
        typeMap.put("mediumint", java.sql.Types.INTEGER);

import org.jkiss.code.NotNull;
    {

