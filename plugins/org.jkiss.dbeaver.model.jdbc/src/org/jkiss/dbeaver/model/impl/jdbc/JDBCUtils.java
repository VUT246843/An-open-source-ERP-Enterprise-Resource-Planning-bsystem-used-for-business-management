            return 0;

            }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
        try {
        }
    @NotNull
            }

    public static Timestamp safeGetTimestamp(ResultSet dbResult, String columnName) {
    public static long safeGetLong(ResultSet dbResult, int columnIndex) {
    }
        }
                log.debug(e.getMessage());
    }
        if (e instanceof InvocationTargetException) {
            debugColumnRead(dbResult, columnName, e);
    @Nullable
        }
        }

import org.jkiss.dbeaver.Log;
            keysRS.next();
            debugColumnRead(dbResult, columnName, e);
                while (resultSet.next()) {
    }
        try {

    public static void setFilterParameters(PreparedStatement statement, int paramIndex, DBSObjectFilter filter)
        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
            if (params != null) {
        }
                    sql.append(columnAlias);
            case "SET DEFAULT" -> DBSForeignKeyModifyRule.SET_DEFAULT;
import org.jkiss.dbeaver.model.sql.SQLDialect;
        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
                        connection.getMetaData().getTables(null, null, "DBEAVERFAKETABLENAMEFORPING", null);
    @Nullable
    }

    @Nullable
            return null;
    @Nullable
        } catch (Exception e) {
                if (columnAlias != null) {
    }
        } catch (Exception e) {
        }
    /**

            return string;
            for (T constant : type.getEnumConstants()) {
            debugColumnRead(dbResult, columnIndex, e);
            return dbResult.getString(columnName);
                    dbStat.setObject(i + 1, params[i]);
        } catch (Exception e) {
            debugColumnRead(dbResult, columnName, e);
        } catch (Exception e) {
    @Nullable
        }
        } catch (Exception e) {
        } catch (Exception e) {
                    dbStat.setObject(i + 1, params[i]);
    }
            debugColumnRead(dbResult, columnIndex, e);
    public static float safeGetFloat(ResultSet dbResult, int columnIndex) {
    }

                log.debug("Can't get column '" + columnName + "': " + error.getMessage());
                for (int i = 0; i < args.length; i++) {
    @Nullable
        }
    }
    }
            return dbResult.getObject(columnName);
    public static void setStringOrNull(PreparedStatement dbStat, int columnIndex, String value) throws SQLException {
            case "CASCADE" -> DBSForeignKeyModifyRule.CASCADE;
    @Nullable
            return null;
    @Nullable

        // Run ping query
    }
                if (i > 0)


        if (string == null || string.isEmpty() || (string.indexOf('%') == -1 && string.indexOf('_') == -1)) {
                }
    public static int safeGetInt(ResultSet dbResult, String columnName) {

                        isValid[0] = true;
            try {
            SQLState.SQL_25P01.getCode().equals(sqlError.getSQLState());
     * @return collection of strings

        } catch (Exception e) {
        }
    public static String safeGetStringTrimmed(ResultSet dbResult, int columnIndex) {
                        dbStat.execute(testSQL);
            return dbResult.getFloat(columnName);
            debugColumnRead(dbResult, columnIndex, e);
    public static void executeStatement(Connection session, String sql) throws SQLException {
        }
    @Nullable
    }
    public static byte[] safeGetBytes(ResultSet dbResult, String columnName) {
                    sql.append(" OR ");
        }
            dbStat.setString(columnIndex, value);
            debugColumnRead(dbResult, columnIndex, e);

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            debugColumnRead(dbResult, columnIndex, e);
            debugColumnRead(dbResult, columnName, e);
    }
                    }
        for (DBPDataSourceTask task : dataSource.getContainer().getTasks()) {


            debugColumnRead(dbResult, columnName, e);

    public static void appendFilterClause(@NotNull StringBuilder sql,
        try {
        }
            statement.setString(paramIndex++, SQLUtils.makeSQLLike(exc));
        } catch (Exception e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        }
    @Nullable
                    // Execute test SQL
                    dbStat.setObject(i + 1, args[i]);
    public static String escapeWildCards(JDBCSession session, String string) {
        } catch (Exception e) {
        List<String> include = filter.getInclude();
            return dbResult.getFloat(columnIndex);
            return dbResult.getInt(columnIndex);
    }
    }
    public static Object safeGetObject(ResultSet dbResult, int columnIndex) {
    public static BigDecimal safeGetBigDecimal(ResultSet dbResult, String columnName) {
            debugColumnRead(dbResult, columnName, e);
        if (filter.isNotApplicable()) {

            case DatabaseMetaData.importedKeySetDefault -> DBSForeignKeyModifyRule.SET_DEFAULT;
            return dbResult.getSQLXML(columnName);
        }
                }
import org.jkiss.code.Nullable;
                    return (T) resultSet.getObject(1);
    public static DBPDataKind resolveDataKind(@Nullable DBPDataSource dataSource, String typeName, int typeID) {
                        isValid[0] = connection.isValid(invalidateTimeout);
        } catch (Exception e) {
        } catch (Exception e) {
    public static Time safeGetTime(ResultSet dbResult, int columnIndex) {
        }
    public static Integer safeGetInteger(ResultSet dbResult, String columnName) {
        return query.length() <= maxLength ? query : query.substring(0, maxLength);
    public static Object safeGetArray(ResultSet dbResult, int columnIndex) {
import java.lang.reflect.InvocationTargetException;
    public static void scrollResultSet(ResultSet dbResult, long offset, boolean forceFetch) throws SQLException {
                if (constant.getValue() == value) {
        if (filter.hasSingleMask()) {
            case DatabaseMetaData.importedKeyCascade -> DBSForeignKeyModifyRule.CASCADE;
        }
    private static final Map<String, Integer> badColumnNames = new HashMap<>();
    @Nullable

    public static <T> T queryObject(Connection session, String sql, Object... args) throws SQLException {
 */
                    dbStat.setObject(i + 1, params[i]);
    @Nullable
            if (columnAlias != null) {
            }
import java.util.List;
import org.jkiss.utils.CommonUtils;
     * Needed for {@link Connection#prepareStatement(String, String[])}

            // Just fetch first 'firstRow' rows
        return
            if (targetException instanceof SQLException) {
            return null;
        try {

import org.jkiss.dbeaver.model.sql.SQLState;
        } catch (Exception e) {

            return false;
            return null;
            }
        try {
            return 0;
    public static Long queryLong(Connection session, String sql, Object... params) throws SQLException {
            debugColumnRead(dbResult, columnIndex, e);
                if (resultSet.next()) {
    }
        final boolean[] isValid = new boolean[1];
        try {
    }
                return value.trim();
    }
    public static int safeGetInt(ResultSet dbResult, int columnIndex) {
import java.util.HashMap;
                    dbStat.setObject(i + 1, params[i]);
            return null;
        }
            return dbResult.getDouble(columnName);
import org.jkiss.dbeaver.model.struct.DBSObject;
            }

        try {
            return array == null ? null : array.getArray();
            }

        if (filter.isNotApplicable()) {

    public static boolean safeGetBoolean(ResultSet dbResult, String columnName) {
        }
                return result;
    }
     * @return {@code true} if the exception represents an unsupported feature error;
    public static DBSForeignKeyModifyRule getCascadeFromName(String name) {
        } catch (Exception e) {

            try (ResultSet resultSet = dbStat.executeQuery()) {
            return dbResult.getBytes(columnName);
            try {
            sql.append(")");
        }
            return dbResult.getBigDecimal(columnName);
     * @param session current connection session
                                          @NotNull String columnAlias,
        // Timeout is CONNECTION_VALIDATION_TIMEOUT + 2 seconds
        }
    public static Long safeGetLongNullable(ResultSet dbResult, String columnName) {
                                          @NotNull DBSObjectFilter filter,
        try {
    public static long safeGetLong(ResultSet dbResult, String columnName) {

    }
            dbStat.execute();

                SQLUtils.appendLikeCondition(sql, exclude.get(i), false, dataSource != null ? dataSource.getSQLDialect() : null);
            } else {
        };

    private static void debugColumnRead(ResultSet dbResult, String columnName, Exception error) {
    }


            return dbResult.getBoolean(columnIndex);
            return null;
            return false;
        }
            }
                sql.append(columnAlias);
            debugColumnRead(dbResult, columnName, e);

import java.math.BigDecimal;
            log.warn("SQL Warning (DataSource: " + session.getDataSource().getContainer().getName() + "; Code: "
            }
            debugColumnRead(dbResult, columnIndex, e);
    @Nullable
            }
    @Nullable
    @Nullable
    public static DBSForeignKeyModifyRule getCascadeFromNum(int num) {
 * Unless required by applicable law or agreed to in writing, software
    public static void executeSQL(Connection session, String sql, Object... params) throws SQLException {
import org.jkiss.dbeaver.utils.RuntimeUtils;
            }

        } catch (Exception e) {
                if (resultSet.next()) {
        }
            try (ResultSet resultSet = dbStat.executeQuery()) {
                for (int i = 0; i < args.length; i++) {
            Throwable targetException = ((InvocationTargetException) e).getTargetException();
/**
    public static SQLXML safeGetXML(ResultSet dbResult, int columnIndex) {
    }
            return dbResult.getLong(columnName);
        // Invalidate in non-blocking task.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            }
    }
            if (columnAlias != null) {
    public static List<String> queryStrings(Connection session, String sql, Object... args) throws SQLException {
            return getGeneratedKey(dbStat);
        try {
            if (value != null && !value.isEmpty()) {

            return null;
            log.debug("Error escaping wildcard string", e);

        }
                return value.trim();
        }
        return switch (name) {
            sql.append(")");
        }

            return null;
        } catch (Exception e) {
     */
        } catch (Throwable e) {
        }
                        isValid[0] = true;
        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
    }
            dbStat.execute();
                scrolled = dbResult.absolute((int) offset);
     * @param sql     query text
    public static String limitQueryLength(@NotNull String query, int maxLength) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
        try {
    public static <T> T executeQuery(Connection session, String sql, Object... params) throws SQLException {
                    }
            debugColumnRead(dbResult, columnName, e);
            }
 * You may obtain a copy of the License at
 *
            debugColumnRead(dbResult, columnIndex, e);
                for (int i = 0; i < args.length; i++) {
            final String strValue = dbResult.getString(columnIndex);
            return;
    public static boolean isRollbackWarning(SQLException sqlError) {
    }
     * @param columnName name of column.
        } catch (Exception e) {

                return value;
        try {
    public static boolean safeGetBoolean(@NotNull ResultSet dbResult, int columnIndex, @NotNull String trueValue) {
        } catch (Exception e) {
        try {
    }
            }
        final String testSQL = dataSource.getSQLDialect().getTestSQL();
            return dbResult.getTime(columnName);
            return null;
            return null;
            return 0;
    }
                return null;
        try {
            return false;
        try (PreparedStatement dbStat = session.prepareCall(sql)) {
    public static void reportWarnings(JDBCSession session, SQLWarning rootWarning) {
                                            @NotNull String sql) throws DBCException, SQLException {
        }
            return 0.0;
                    dbStat.setObject(i + 1, args[i]);
    }
            return;
        }
            if (value != null && !value.isEmpty()) {
import org.jkiss.dbeaver.model.struct.DBSObjectFilter;
            dbStat.execute();

    }
                    return null;
                }
 * limitations under the License.
            if (columnAlias != null) {
                }
    }

        return safeGetBoolean(dbResult, columnName, false);
            dbStat.execute();

            if (connection == null || connection.isClosed()) {
    }
                if (i > 0)
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
                }
                }
                } else {
            }
package org.jkiss.dbeaver.model.impl.jdbc;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static int executeUpdate(Connection session, String sql, Object... params) throws SQLException {
            return strValue != null && strValue.startsWith(trueValue);
    /**
            return result.longValue();
    public static long executeInsertAutoIncrement(Connection session, String sql, String columnName, Object... params) throws SQLException {
        try {
        try {
     * @param ex the exception to analyze.
        } catch (Exception e) {
        } catch (Exception e) {
                if (!CommonUtils.isEmpty(testSQL)) {
 * See the License for the specific language governing permissions and
            }
    public static void executeStatement(Connection session, String sql, Object... params) throws SQLException {
 * you may not use this file except in compliance with the License.
    @NotNull
            try (ResultSet resultSet = dbStat.executeQuery()) {
                }
            } catch (SQLException e) {
        final Number result = executeQuery(session, sql, params);
            final String strValue = dbResult.getString(columnName);
            if (args != null) {
            final int result = dbResult.getInt(columnName);
                for (int i = 0; i < params.length; i++) {
        }
        }
            if (CommonUtils.isEmpty(escapeStr) || escapeStr.equals(" ")) {
        }
        try {
    public static String[] getColumnList(@NotNull String columnName) {
            default -> DBSForeignKeyModifyRule.UNKNOWN;
import java.sql.*;
        }
            return DBPDataKind.UNKNOWN;
            return null;
    }

        }
        }
            }

    }
                }

            return dbResult.getDouble(columnIndex);

            SQLDialect dialect = SQLUtils.getDialectFromDataSource(session.getDataSource());
            final Integer errorCount = badColumnNames.get(colFullId);
    public static double safeGetDouble(ResultSet dbResult, String columnName) {
                } else {
                }
            }
            case DatabaseMetaData.importedKeyRestrict -> DBSForeignKeyModifyRule.RESTRICT;
            SQLUtils.appendLikeCondition(sql, filter.getSingleMask(), false, dataSource != null ? dataSource.getSQLDialect() : null);
                    } catch (Throwable e) {
import java.util.ArrayList;
    }
        }
                    return constant;
        }
        }
 */
            return null;
        try {
        }
    public static String safeGetStringTrimmed(ResultSet dbResult, String columnName) {
        }
    public static Date safeGetDate(ResultSet dbResult, int columnIndex) {
                for (int i = 0; i < params.length; i++) {
            debugColumnRead(dbResult, columnName, e);
    public static void executeProcedure(Connection session, String sql) throws SQLException {
        return ex instanceof SQLFeatureNotSupportedException || (dataSource != null && DBExecUtils.discoverErrorType(dataSource, ex)
    @Nullable
    }
    @Nullable
            }
            try (JDBCStatement statement = session.createStatement()) {
            Array array = dbResult.getArray(columnIndex);
        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
                    return (T) resultSet.getObject(1);
        } catch (Exception e) {
    public static void rethrowSQLException(Throwable e) throws SQLException {
                }
        } catch (Exception e) {

                    return resultSet.getString(1);

        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
        if (result != null) {
    public static BigDecimal safeGetBigDecimal(ResultSet dbResult, int columnIndex) {
        } else {
        try {
            } else {
        }
    public static boolean safeGetBoolean(ResultSet dbResult, String columnName, String trueValue) {
import org.jkiss.code.NotNull;
            return dbResult.getInt(columnName);

        }

        for (SQLWarning warning = rootWarning; warning != null; warning = warning.getNextWarning()) {
     *
        }
        try {
            return dbResult.getDate(columnIndex);
public class JDBCUtils {
        try {
            for (long i = 1; i <= offset; i++) {

                for (int i = 0; i < params.length; i++) {

        }
                    dbStat.setObject(i + 1, args[i]);
        try {
        try {
        synchronized (badColumnNames) {
        boolean scrolled = false;
    }
import org.jkiss.dbeaver.model.exec.DBCException;
        } catch (Exception e) {
    public static String queryString(Connection session, String sql, Object... args) throws SQLException {
            case "NO ACTION" -> DBSForeignKeyModifyRule.NO_ACTION;
            return defValue;
        // Check for active tasks. Do not run ping if there is active task
            if (params != null) {
                    sql.append(columnAlias);
        }
        try {
            return dbResult.getBoolean(columnName);
            return strValue != null && strValue.startsWith(trueValue);
     * Executes query that returns multiple strings as a result
     * Oracle doesn't return id of inserted row for {@link Connection#prepareStatement(String, int)}.
        return switch (num) {
    public static String safeGetString(ResultSet dbResult, String columnName) {
        RuntimeUtils.runTask(monitor -> {
        return null;
                                          @NotNull String columnAlias,
                // Seems to be not supported
            return null;
            debugColumnRead(dbResult, columnName, e);
            if (params != null) {
    }
        try {
    }
                return value;
            debugColumnRead(dbResult, columnIndex, e);
        } catch (Exception e) {
    public static <T extends Enum<T> & DBPEnumWithValue> T safeGetEnum(@NotNull ResultSet dbResult, @NotNull String columnName, @NotNull Class<T> type) {
            colFullId += ":" + ((JDBCResultSet) dbResult).getSession().getDataSource().getContainer().getId();
    public static void appendFilterClause(@NotNull StringBuilder sql,
    public static boolean queryHasOutputParameters(SQLDialect sqlDialect, String sqlQuery) {
        } catch (SQLException e) {
/*
        if (value != null) {

            case DatabaseMetaData.importedKeySetNull -> DBSForeignKeyModifyRule.SET_NULL;
        }
            } else {
            sql.append("NOT (");
        } catch (Exception e) {
            String escapeStr = dialect.getSearchStringEscape();
        try {
    }

     * @param dataSource the data source involved in the operation.
            return dbResult.getObject(columnIndex);
            return dbResult.getDate(columnName);
            } else {
        }
    }
            debugColumnRead(dbResult, columnName, e);

            debugColumnRead(dbResult, columnIndex, e);

    public static Date safeGetDate(ResultSet dbResult, String columnName) {
            dbStat.setNull(columnIndex, Types.VARCHAR);
            }

        return isValid[0];


            return dbResult.getString(columnIndex);
    @Nullable
        if (dataSource == null) {
import java.util.Map;
    }
            return dbStat.executeUpdate();
            if (warning.getMessage() == null && warning.getErrorCode() == 0) {
    }
    @Nullable
    public static Integer safeGetInteger(ResultSet dbResult, int columnIndex) {
        try {
        try {
 * DBeaver - Universal Database Manager
    /**
                                          @NotNull boolean firstClause,
        try {
                return true;

            if (dbResult.wasNull()) {

            }
        try (final ResultSet keysRS = dbStat.getGeneratedKeys()) {
    }
    public static Object safeGetObject(ResultSet dbResult, String columnName) {
    }
            debugColumnRead(dbResult, columnName, e);
        }

                for (int i = 0; i < params.length; i++) {
        int invalidateTimeout = dataSource.getContainer().getPreferenceStore().getInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT);
        } catch (Exception e) {
        }
        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
        }
            return dbResult.getSQLXML(columnIndex);
            }
            if (params != null) {
import org.jkiss.dbeaver.model.*;
            return string.replace("%", escapeStr + "%").replace("_", escapeStr + "_");
    }
            badColumnNames.put(colFullId, errorCount == null ? 0 : errorCount + 1);
            } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
                if (columnAlias != null) {
    public static <T> T safeGetArray(ResultSet dbResult, String columnName) {
        } catch (Exception e) {
            return dbResult.getTime(columnIndex);
        }
            }
                    sql.append(" OR ");
                                          DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
    @Nullable
            return null;

                }
        }
        };
                return null;
                statement.execute(sql);
    public static boolean isFeatureNotSupportedError(@Nullable DBPDataSource dataSource, @NotNull Throwable ex) {
            final int value = dbResult.getInt(columnName);
    }
    }
            return null;
        if (!CommonUtils.isEmpty(exclude)) {
    }
                SQLUtils.appendFirstClause(sql, firstClause);
 * JDBCUtils
    public static void executeInMetaSession(@NotNull DBRProgressMonitor monitor, @NotNull DBSObject object, @NotNull String task,
    @Nullable
        try {
        } catch (Exception e) {
    private static void debugColumnRead(ResultSet dbResult, int columnIndex, Exception error) {
                }
        } else if (dataSource instanceof DBPDataTypeProvider) {
            return dbResult.wasNull() ? null : result;

            return dbResult.getLong(columnIndex);
                    results.add(resultSet.getString(1));
            if (task.isActiveTask()) {
            if (errorCount == null) {
    }
        }
    }
    }
            }
                    dbStat.setObject(i + 1, params[i]);
}
        }
 *
                return false;
    }
                firstClause = SQLUtils.appendFirstClause(sql, firstClause);



                continue;
    }
                }
        }
            return null;
        if (!forceFetch) {
        } catch (Exception e) {
        }
        try (PreparedStatement dbStat = session.prepareStatement(sql)) {
     *
     */
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object, task)) {
            return 0;
            return null;
            log.debug("Can't convert value " + value + " to enum type " + type);

            }
    public static boolean LOG_JDBC_WARNINGS = CommonUtils.toBoolean(System.getProperty("dbeaver.jdbc.log.warnings"));
        } catch (Exception e) {
        return value == null ? null : value.trim();
            return ((DBPDataTypeProvider) dataSource).resolveDataKind(typeName, typeID);
            Array array = dbResult.getArray(columnName);

                        // isValid may be unsupported by driver
        appendFilterClause(sql, filter, columnAlias, firstClause, null);
    }
    }
                    return null;

            final long result = dbResult.getLong(columnName);
                    dbResult.next();
        }

        }
    }
            return dbResult.getTimestamp(columnIndex);
    }
            debugColumnRead(dbResult, columnIndex, e);
                SQLUtils.appendLikeCondition(sql, include.get(i), false, dataSource != null ? dataSource.getSQLDialect() : null);
            return false;
            debugColumnRead(dbResult, columnName, e);
        }
            debugColumnRead(dbResult, columnName, e);
 *
            return string;
            }

            case DatabaseMetaData.importedKeyNoAction -> DBSForeignKeyModifyRule.NO_ACTION;
    }
    public static Time safeGetTime(ResultSet dbResult, String columnName) {
    }

            debugColumnRead(dbResult, columnName, e);
        try (PreparedStatement dbStat = session.prepareStatement(sql, getColumnList(columnName))) {
            if (args != null) {
        try {
            }
            final int result = dbResult.getInt(columnIndex);
import org.jkiss.dbeaver.model.sql.SQLUtils;
            try (ResultSet resultSet = dbStat.executeQuery()) {
                return result;
            return null;
     */
                try {
        try {

            dbStat.execute(sql);
            for (int i = 0, includeSize = include.size(); i < includeSize; i++) {
            case "RESTRICT" -> DBSForeignKeyModifyRule.RESTRICT;
            final String value = dbResult.getString(columnIndex);
            return null;
        }
    @Nullable
    }
        for (String inc : CommonUtils.safeCollection(filter.getInclude())) {

                throw new SQLException(targetException);
            return 0;
            debugColumnRead(dbResult, columnName, e);
    public static boolean isConnectionAlive(DBPDataSource dataSource, Connection connection) {
    private static final Log log = Log.getLog(JDBCUtils.class);
                if (resultSet.next()) {

            log.debug(e);

    @Nullable
        // Scroll to first row
            return;
            default -> DBSForeignKeyModifyRule.UNKNOWN;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
        try {
        if (!scrolled) {
        }

        debugColumnRead(dbResult, "#" + columnIndex, error);
    public static String normalizeIdentifier(@Nullable String value) {
    public static double safeGetDouble(ResultSet dbResult, int columnIndex) {
            }
            }
                // Skip trash [Excel driver]
            return null;
        }
        } catch (Exception e) {
        }
                for (int i = 0; i < params.length; i++) {
        } catch (Exception e) {
                firstClause = SQLUtils.appendFirstClause(sql, firstClause);
                                          @NotNull boolean firstClause) {
            case "SET NULL" -> DBSForeignKeyModifyRule.SET_NULL;
            return array == null ? null : (T) array.getArray();
            return JDBCDataSource.getDataKind(typeName, typeID);
            return null;
            debugColumnRead(dbResult, columnName, e);
            return results;
     * Checks whether the given exception indicates an unsupported feature error.
        return sqlQuery.contains("?");
        } catch (Exception e) {

                }
            for (int i = 0, excludeSize = exclude.size(); i < excludeSize; i++) {
    }
    public static boolean safeGetBoolean(ResultSet dbResult, int columnIndex) {
                }
        } else {
    @Nullable
        List<String> exclude = filter.getExclude();
            }
        }
            final String value = dbResult.getString(columnName);
        try {
    }
    }
        } catch (Exception e) {
            return dbResult.getBigDecimal(columnIndex);

                    try (Statement dbStat = connection.createStatement()) {
            } catch (SQLException | UnsupportedOperationException | IncompatibleClassChangeError e) {
                return string;
        try {
            return keysRS.getLong(1);
            sql.append("(");
        return new String[] {columnName.toLowerCase()};
            statement.setString(paramIndex++, SQLUtils.makeSQLLike(inc));
     * @param args    optional parameters for the prepared statement
                }
            debugColumnRead(dbResult, columnIndex, e);
        }
                    return null;
                isValid[0] = false;

            }
            if (dbResult.wasNull()) {
    public static float safeGetFloat(ResultSet dbResult, String columnName) {
            debugColumnRead(dbResult, columnIndex, e);
    public static SQLXML safeGetXML(ResultSet dbResult, String columnName) {
            debugColumnRead(dbResult, columnName, e);
            debugColumnRead(dbResult, columnIndex, e);
                                          @NotNull DBSObjectFilter filter,
        }, "Ping connection " + dataSource.getContainer().getName(), invalidateTimeout + 2000, true);
                        // Let's try to read table list
                    try {
        for (String exc : CommonUtils.safeCollection(filter.getExclude())) {
            debugColumnRead(dbResult, columnName, e);
                throw (SQLException) targetException;
    @NotNull
        if (!CommonUtils.isEmpty(include)) {
     * Postgres can't find column if column id is in upper case.
        try {
     *         {@code false} otherwise.
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

        } catch (Exception e) {
    public static long getGeneratedKey(PreparedStatement dbStat) throws SQLException {
    }
                    throw new SQLException("Can't scroll result set to row " + offset, e);
        return null;
                + warning.getErrorCode() + "; State: " + warning.getSQLState() + "): " + warning.getLocalizedMessage());
            ArrayList<String> results = new ArrayList<>();
import org.jkiss.dbeaver.ModelPreferences;
            return 0.0;
        throws SQLException {
                } catch (SQLException e) {
            == DBPErrorAssistant.ErrorType.FEATURE_UNSUPPORTED);
        try {
    public static boolean safeGetBoolean(ResultSet dbResult, String columnName, boolean defValue) {
        try {
                }
    }
            return 0;
        if (dbResult instanceof JDBCResultSet) {
            debugColumnRead(dbResult, columnIndex, e);
            if (params != null) {
            if (args != null) {
    public static Timestamp safeGetTimestamp(ResultSet dbResult, int columnIndex) {
    @Nullable
                } else {
            return null;
        } catch (Exception e) {
    }
    }

            return dbResult.getTimestamp(columnName);
            debugColumnRead(dbResult, columnIndex, e);
    @Nullable
        String colFullId = columnName;
                } else {
        try (Statement dbStat = session.createStatement()) {
     * @return array of column name.
    public static String safeGetString(ResultSet dbResult, int columnIndex) {
