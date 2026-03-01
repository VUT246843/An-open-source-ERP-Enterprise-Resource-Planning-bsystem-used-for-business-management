            "REGR_SXX", "REGR_SXY", "REGR_SYY", "RELEASE", "REPEATABLE", "RESTART", "RESULT", "ROW_NUMBER", "RTRIM",

                    source.setShardVal(shardValue);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
            log.error("Can't get database version", e);
 * you may not use this file except in compliance with the License.
            "NULLS", "OLD", "OPERATION", "OPERATORS", "OPTIONS", "ORDERING", "ORDINALITY",
            "STYLE", "SUBMULTISET", "SYMMETRIC", "SYSTEM", "TABLESAMPLE", "TATISTICS",
            if (isShard) {
 * DBeaver - Universal Database Manager
            }
        source.setEOLVersion(isEOLVersion(session));
    }
            log.debug("Failed to invoke isShard method:", e);
            log.debug("Failed to get connection:", e);

 *
        CubridDataSource source = (CubridDataSource) dataSource;
    @NotNull
    @NotNull
        } catch (SQLException e) {
    }
        this.addSQLKeywords(Arrays.asList(CUBRID_KEYWORD));
        }
            "DENSE_RANK", "DEREF", "DERIVED", "DETERMINISTIC", "DICTIONARY", "DISPATCH", "DYNAMIC", "ELEMENT", "END-EXEC", "EVERY",
    @Override
import org.jkiss.dbeaver.model.DBPDataKind;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (major > 11 || (major == 11 && minor >= 2)) {
    private static final String DEFAULT_SHARD_VALUE = "0";
            "COVAR_POP", "COVAR_SAMP", "CUBE", "CUME_DIST", "CURSOR_NAME", "DATA_TYPE___", "DEFINED", "DEFINER",
        } catch (SQLException e) {
            "TEST", "THERE", "TIES", "TRANSFORM",
            @NotNull JDBCDatabaseMetaData metaData) {
    private static final String[] REMOVE_KEYWORD = {
                    connectionInfo.setProperty(PROP_SHARD_VALUE, DEFAULT_SHARD_VALUE);

            "MAP", "MATCHED", "MAXVALUE", "MEMBER", "MODIFIES",
    }

        return false;
            "OTHERS", "OVERLAY", "OVERRIDING", "PARAMETER", "PATH", "PENDANT", "PERCENTILE_CONT",
    }
            "TRANSFORMS", "TREAT", "TYPE", "UESCAPE", "UNBOUNDED", "UNNAMED", "UNNEST", "VARBINARY", "VARIANCE",
            @NotNull JDBCDataSource dataSource,
        super("Cubrid", "cubrid");
            "EXCLUDE", "EXCLUDING", "FILTER", "FINAL", "FOLLOWING", "FREE", "FUSION", "GENERATED",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * You may obtain a copy of the License at
                } else {
    @NotNull
import org.jkiss.utils.BeanUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            "SCALE", "SCOPE___", "SECURITY", "SELF", "SERIAL",
public class CubridSQLDialect extends GenericSQLDialect
            }
    public boolean isEOLVersion(@NotNull JDBCSession session) {
                String shardValue = connectionInfo.getProperty(PROP_SHARD_VALUE);
            "DATABASE", "DATETIME", "DAY_HOUR", "DAY_MILLISECOND", "DAY_MINUTE", "DAY_SECOND", "DISTINCTROW", "DIV", "DO", "DUPLICATE",
    private static final String PROP_IS_SHARD = "isShard";
            log.error("Can't get database version", e);

            DBPConnectionConfiguration connectionInfo = source.getContainer().getConnectionConfiguration();



        return !isShard;
import org.jkiss.dbeaver.model.sql.SQLDialect;
    private boolean isShard = false;
/*

    };
package org.jkiss.dbeaver.ext.cubrid.model;
 * See the License for the specific language governing permissions and
        if ("VARCHAR".equalsIgnoreCase(typeName)) {
            connectionInfo.setProperty(PROP_IS_SHARD, Boolean.toString(isShard));
import org.jkiss.dbeaver.model.DBPDataSource;
 */
            }
import org.jkiss.dbeaver.Log;
            "MORE", "MUMPS", "NESTING", "NEW", "NOMAXVALUE", "NOMINVALUE", "NORMALIZE", "NORMALIZED",
}
    }
    @Override
import java.util.Arrays;
    private static final String PROP_SHARD_VALUE = "shardValue";
{
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getColumnTypeModifiers(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind) {
            "PERCENTILE_DISC", "PERCENT_RANK", "PLACING", "PRECEDING", "PREORDER", "PRIVATE", "PROTECTED", "PROXY", "QUALIFY",
                return true;
            isShard = (boolean) BeanUtils.invokeObjectMethod(conn, PROP_IS_SHARD);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        }
    @Override
            "HOUR_MILLISECOND", "HOUR_MINUTE", "HOUR_SECOND", "LOCAL_TRANSACTION_ID", "MILLISECOND", "MINUTE_MILLISECOND", "MINUTE_SECOND", "MODULE", "NAMES", "NCHAR",
        try {
    private static final String[] CUBRID_KEYWORD = {
            "VIRTUAL", "VISIBLE", "WAIT", "WIDTH_BUCKET", "WINDOW", "WITHIN"
    private static final Log log = Log.getLog(CubridSQLDialect.class);
    }
import org.jkiss.utils.CommonUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.NotNull;
            "ROWNUM", "SECOND_MILLISECOND", "SIBLINGS", "SQLCODE", "SQLERROR", "STATISTICS", "SYS_CONNECT_BY_PATH", "SYSDATE",

            "AUTHORIZATION", "BINARY", "CALLED", "CARDINALITY", "CHAIN", "CHARACTERISTICS",
        for (String removeKeyWord : REMOVE_KEYWORD) {
        super.initDriverSettings(session, dataSource, metaData);
                }
    private void detectAndApplyShardSettings(JDBCSession session, CubridDataSource source) {
            "INVOKER", "KEY_TYPE", "LAST_DAY", "LATERAL", "LDB", "LN", "LOCATOR", "LPAD",
 * Unless required by applicable law or agreed to in writing, software
            "SYSDATETIME", "SYSTIME", "TRUNCATE", "VALUE", "XOR", "YEAR_MONTH"
    }
                return true;
        detectAndApplyShardSettings(session, source);
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;

            source.setShard(isShard);
            Object conn = session.getExecutionContext().getConnection(session.getProgressMonitor());
                    source.setShardType(shardType);
            int minor = session.getMetaData().getDatabaseMinorVersion();
            "GRANTED", "GROUPING", "HIERARCHY", "HOLD", "IMPLEMENTATION", "INCLUDING", "INCREMENT", "INSENSITIVE", "INSTANCE", "INSTANTIABLE",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
                    connectionInfo.setProperty(PROP_SHARD_TYPE, SHARD_TYPE_ID);
    public CubridSQLDialect() {
            @NotNull JDBCSession session,
    public boolean isSupportMultiSchema(@NotNull JDBCSession session) {

            if (major <= 9) {
        return SQLDialect.USAGE_ALL;
        try {
        } catch (Throwable e) {
    private static final String SHARD_TYPE_ID = "SHARD ID";

        }
 *
        try {
            return "(" + column.getMaxLength() + ")";
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    public int getSchemaUsage() {
    public void initDriverSettings(
        }
            this.removeSQLKeyword(removeKeyWord);
    private static final String PROP_SHARD_TYPE = "shardType";
    }
            "CLUSTER", "COLLECT", "COMPLETION", "CONDITION", "CONSTRUCTOR", "CONTAINS", "CORR",
            "BIT", "CONNECT_BY_ISCYCLE", "CONNECT_BY_ISLEAF", "CONNECT_BY_ROOT", "CURRENT_DATE", "CURRENT_DATETIME", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA_TYPE",
        source.setSupportMultiSchema(isSupportMultiSchema(session));
    public boolean supportsAlterTableStatement() {
        return false;
    };
            "SOURCE", "SPECIFIC", "SPECIFICTYPE", "STDDEV", "STRUCTURE",
            "READS", "REGISTER", "REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE",
        } catch (SQLException e) {
import java.sql.SQLException;
    public static final String CUBRID_DIALECT_ID = "cubrid";
            "ALIAS", "ALWAYS", "ARRAY", "ASENSITIVE", "ASSIGNMENT", "ASYMMETRIC", "ATOMIC",
            int major = session.getMetaData().getDatabaseMajorVersion();
                String shardType = connectionInfo.getProperty(PROP_SHARD_TYPE);

        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
        }
            int major = session.getMetaData().getDatabaseMajorVersion();
                if (CommonUtils.isEmpty(shardType)) {
