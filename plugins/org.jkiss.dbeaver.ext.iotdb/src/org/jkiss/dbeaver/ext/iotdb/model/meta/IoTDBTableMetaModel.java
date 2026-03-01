     *
    @Override
            try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Get IoTDB table details")) {
     *
}
        return ttl;

import org.jkiss.code.NotNull;
        "JOIN",
        "JSON_ARRAY",
     * Get DDL for IoTDB table.
        String sql = String.format("desc %s.%s details", databaseName, insertTableName);
 *
        "CUBE",
                                                     String ttl) throws SQLException {
                    toAppend.append(rs.getString(columnTitles.get(1))).append(" ");
        try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Get IoTDB table details")) {
                boolean hasColumn = false;
            String sql = String.format("select * from information_schema.tables where database like '%s'", databaseName);
import org.jkiss.dbeaver.model.DBUtils;
                    try (JDBCResultSet rs = stmt.executeQuery(sql)) {
        "AND",
    @NotNull
        "RECURSIVE",
                              @NotNull GenericTableBase sourceObject,
        String databaseName = ((DBSEntity) sourceObject).getParentObject().getName();
            @NotNull String ttl,
    private String getTableDDLWithSQL(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private String getTableDDLInfoWithoutISPrivilege(JDBCSession session,
        for (String keyword : allIotdbTableSQLKeywords) {
                while (rs.next()) {
        "HAVING",
                          GenericTableBase sourceObject,
            }
        "TABLE",
                    }
        "FOR",
        return getTableDDLWithSQL(session, sourceObject, insertTableName, ttl, sql, List.of("column_name", "datatype", "category", "comment"));
 *     http://www.apache.org/licenses/LICENSE-2.0
        "CURRENT_TIMESTAMP",
        return getTableDDLWithSQL(session, sourceObject, insertTableName, ttl, sql, List.of("ColumnName, DataType, Category, Comment"));

        "FROM",
    }
            @NotNull JDBCSession session,
        return ddl.toString();
        "IS",
                "select * from information_schema.columns where database like '%s' and table_name like '%s'", databaseName, insertTableName);
    /**
    public String getTableDDL(@NotNull DBRProgressMonitor monitor,
        "PREPARE",
        "NOT",
        "ELSE",
import org.jkiss.dbeaver.model.sql.SQLUtils;
                              @NotNull Map<String, Object> options) {
        "END",
        "GROUP",
                    hasColumn = true;
        "EXTRACT",
 * Unless required by applicable law or agreed to in writing, software
        }
                        ttl = rs.getString("ttl(ms)");
        "GROUPING",
                                                  GenericTableBase sourceObject,
        ddl.append("DROP TABLE IF EXISTS ").append(insertTableName).append(";\n\n");
        String ttl = "";
    private String getTableDDLInfoWithISPrivilege(JDBCSession session,

        "INTERSECT",
        "JSON_TABLE",
 * DBeaver - Universal Database Manager
        "TRIM",
    }
        "INTO",
            @NotNull GenericTableBase sourceObject,
     * @return "test" for temporary
        "CREATE",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @NotNull List<String> columnTitles) throws SQLException {
        "WHERE",
    private String getInsertTableName(String tb) {
    /**

        "CASE",

        "UNION",
/*
        "LISTAGG",
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        "CURRENT_TIME",

        "DROP",
public class IoTDBTableMetaModel extends GenericMetaModel {
                }
                            ttl = rs.getString("TTL(ms)");
        "EXCEPT",


                }
        "FULL",
        }
                    if (rs != null && rs.next()) {


                    }
 */
        ddl.append(toAppend);
     */
                    String columnComment = rs.getString(columnTitles.get(3));
        "INSERT",
        }
                    toAppend.append("\t").append(rs.getString(columnTitles.get(0))).append(" ");
            }
            } catch (Exception e1) {
            if (tb.equalsIgnoreCase(keyword)) {
        if (ttl.equals("INF")) {
        "JSON_VALUE",
        StringBuilder toAppend = new StringBuilder(200);
        "SELECT",
                }
                if (hasColumn) {
    }
                    toAppend.append(rs.getString(columnTitles.get(2)));
        "NORMALIZE",
 *
        "CURRENT_USER",
        "CONSTRAINT",
        try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Get IoTDB table column details")) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        "CURRENT_ROLE",
                log.error("Error executing sql", e1);
        "FALSE",
        "LEFT",
        try (JDBCStatement stmt = session.createStatement()) {
                                                  String ttl) throws SQLException {

        "BETWEEN",
                toAppend.append("CREATE TABLE ").append(DBUtils.getQuotedIdentifier(((DBSEntity)sourceObject).getDataSource(), insertTableName)).append(" (\n");
        } catch (Exception e) {
    }

        } catch (Exception e) {
                insertTableName = "\"" + tb + "\"";
        "JSON_OBJECT",
                    toAppend.append(",\n");
                                                     String databaseName,

        "DESCRIBE",
        "WITH",

        "RIGHT",
        "CAST",
            try (JDBCSession session = DBUtils.openMetaSession(monitor, (DBSObject) sourceObject, "Get IoTDB table column details")) {
    };
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
import org.jkiss.dbeaver.model.struct.DBSEntity;
        "CURRENT_DATE",
        String tableName = ((DBSEntity) sourceObject).getName();
        String sql = String.format(
        "JSON_QUERY",
        String toAppend = "";
     * @param monitor to create session or to read metadata
    private static final String[] allIotdbTableSQLKeywords = {
        "LIKE",
package org.jkiss.dbeaver.ext.iotdb.model.meta;
                    }
import java.sql.SQLException;
        "EXISTS",
        "BY",
        }
     * @return true to trim extra spaces around columns, tables, objects names
                        toAppend.append(" COMMENT ").append(SQLUtils.quoteString(sourceObject, columnComment)).append("");
        return true;

                    toAppend.setLength(toAppend.length() - 2);
    }
                log.error("Error executing sql", e1);
        "FILL"
     * @param sourceObject source object with required name and parents info
                toAppend = getTableDDLInfoWithoutISPrivilege(session, sourceObject, databaseName, insertTableName, ttl);
                toAppend.append("\n) ");
            }
        "INNER",
        "DELETE",
            try (JDBCResultSet rs = stmt.executeQuery(sql)) {
            @NotNull String insertTableName,
            }
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
        "SKIP",
        "LOCALTIMESTAMP",
import org.jkiss.dbeaver.model.struct.DBSObject;
        return toAppend.toString();
                                                     String insertTableName,
        "ESCAPE",
    public boolean isTrimObjectNames() {
        "UNNEST",
        "NULL",
        "AS",
        "NATURAL",
                                                     GenericTableBase sourceObject,

                }
        "IN",
        "CURRENT_SCHEMA",
    private String getTTL(DBRProgressMonitor monitor,
                    toAppend.append("COMMENT ").append(SQLUtils.quoteString(sourceObject, tableComment)).append(" ");
     * @param options for generated DDL
                    if (columnComment != null && !columnComment.isEmpty()) {
        String insertTableName = getInsertTableName(tableName);
                                                  String insertTableName,
        "OUTER",
     *
                        }
import java.util.Map;
                                                  String databaseName,
 * distributed under the License is distributed on an "AS IS" BASIS,
        "VALUES",
        "ORDER",
        return insertTableName;
        "JSON_EXISTS",
        String insertTableName = tb;
            toAppend = getTableDDLInfoWithISPrivilege(session, sourceObject, databaseName, insertTableName, ttl);
            @NotNull String sql,

        "ON",
                try (JDBCResultSet rs = stmt.executeQuery(sql)) {
                String sql = String.format("show tables details from %s", DBUtils.getQuotedIdentifier(((DBSEntity)sourceObject).getDataSource(), databaseName, true, true));
     */
        "DEALLOCATE",
                break;
     * Check if object names should be trimmed.
        "OR",

        "THEN",
        "DISTINCT",
                          String databaseName) {
        "ALTER",

    private static final Log log = Log.getLog(IoTDBTableMetaModel.class);
        "UESCAPE",
    }
 * limitations under the License.
import java.util.List;
        StringBuilder ddl = new StringBuilder(200);
                try (JDBCStatement stmt = session.createStatement()) {
            }
import org.jkiss.dbeaver.Log;
                        if (rs != null && rs.next()) {
    }
        "LOCALTIME",
        "USING",
            } catch (Exception e1) {
        "WHEN",
        "CROSS",
 * you may not use this file except in compliance with the License.
        String ttl = getTTL(monitor, sourceObject, databaseName);
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at

        "TRUE",
        "ROLLUP",
            try (JDBCStatement stmt = session.createStatement()) {
                String tableComment = sourceObject.getDescription();
        "CURRENT_CATALOG",
                if (tableComment != null && !tableComment.isEmpty()) {
        }
            ttl = SQLUtils.quoteString(sourceObject, "INF");
 *
                toAppend.append("WITH (TTL=").append(ttl).append(");");
