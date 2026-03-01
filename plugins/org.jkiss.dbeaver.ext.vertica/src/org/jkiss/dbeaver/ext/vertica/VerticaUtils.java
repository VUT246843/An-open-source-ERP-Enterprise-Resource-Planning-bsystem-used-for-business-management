        switch (typeName) {
            case "bigint":
    }
        }
            case "interval":
            case "varbinary":
            case "binary":
    public static String getObjectComment(DBRProgressMonitor monitor, DBPDataSource dataSource, VerticaObjectType objectType, String schema, String object)
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Load Vertica comment")) {
 */
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT EXPORT_OBJECTS('','" + objectName + "');")) {
package org.jkiss.dbeaver.ext.vertica;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            case "timestamp with timezone":
            case "time":
 * See the License for the specific language governing permissions and
            case "tinyint":
                            if (isView) {
import java.util.Locale;
                stat.setString(1, table.getSchema().getName());
            case "timetz":
import org.jkiss.dbeaver.ext.vertica.model.VerticaDataSource;
            typeName = typeName.substring(0, divPos);
    private static final Log log = Log.getLog(VerticaUtils.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
        try (JDBCSession session = DBUtils.openMetaSession(monitor, sourceObject, "Read Vertica object definition")) {
            }
                    }
            case "bytea":

import org.jkiss.dbeaver.model.DBUtils;
                return Types.TIME;
    public static int resolveValueType(@NotNull String typeName)
import org.jkiss.utils.CommonUtils;
            default:
*/
/**
import org.jkiss.dbeaver.model.DBPQualifiedObject;
            case "decimal":
                                break;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return Types.TIMESTAMP;
                                    column.setDescription(comment);
                        if ("TABLE".equals(objectType) || (isView && "VIEW".equals(objectType))) {
                    return sql.toString();
        }
                            }


                stat.setString(2, table.getName());
        typeName = typeName.trim().toLowerCase(Locale.ENGLISH);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Read table description")) {
            case "interval day":

                        }
import org.jkiss.dbeaver.DBException;
                                    log.warn("Column '" + columnName + "' not found in table '" + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
                        } else if (childColumnAvailable && "COLUMN".equals(objectType)) {

                                if (column != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    while (resultSet.next()) {

                                } else {
            throw new DBDatabaseException(e, dataSource);
    }
                return Types.OTHER;
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static String getObjectDDL(DBRProgressMonitor monitor, GenericDataSource dataSource, DBSObject sourceObject) throws DBException {
import java.sql.Types;
            case "time with timezone":
}
 */
 * you may not use this file except in compliance with the License.

        }
                try (JDBCResultSet resultSet = stat.executeQuery()) {
        }
                    sourceObject.getName();
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * VerticaUtils
                }
            case "smalldatetime":
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                                }
            log.debug(e);
                    StringBuilder sql = new StringBuilder();
            case "float8":
            }
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            table.setDescription(comment);
            case "long varbinary":
            case "datetime":
            case "float":
            case "boolean":
                            String columnName = JDBCUtils.safeGetString(resultSet, 3);

        } catch (SQLException e) {
            case "timestamp": case "timestamptz":
import org.jkiss.code.NotNull;
                        sql.append(JDBCUtils.safeGetStringTrimmed(dbResult, 1));
            case "long varchar":
                }
                        String comment = JDBCUtils.safeGetString(resultSet, 2);
            case "money":

            case "real":
            case "char":
                return Types.VARCHAR;
 *
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                (childColumnAvailable != null && childColumnAvailable ? ", child_object" : "") +
/*
                return Types.LONGVARCHAR;
    {
            case "integer":
 *
                return Types.DOUBLE;
            return JDBCUtils.queryString(
            case "int":
                "  from v_catalog.comments where object_schema =? and object_name =?")) {
                    ((DBPQualifiedObject) sourceObject).getFullyQualifiedName(DBPEvaluationContext.DML) :
            case "number":
        if (divPos != -1) {
                    while (dbResult.nextRow()) {
    public static void readTableAndColumnsDescriptions(@NotNull DBRProgressMonitor monitor, @NotNull GenericDataSource dataSource, @NotNull GenericTableBase table, boolean isView) {
        }
 * Unless required by applicable law or agreed to in writing, software
                                GenericTableColumn column = table.getAttribute(monitor, columnName);
                "select comment from v_catalog.comments c\n" +
        throws DBException
                    "where c.object_schema = ? and c.object_name = ? AND c.object_type = ?", schema, object, objectType.name());

            case "smallint":
import org.jkiss.dbeaver.model.struct.DBSObject;
                        String objectType = JDBCUtils.safeGetString(resultSet, 1);
                return Types.BINARY;
            log.debug("Error reading table description ", e);

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                            if (CommonUtils.isNotEmpty(columnName)) {
    }
            return null;
public class VerticaUtils {
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                return Types.CHAR;
            case "date":
                return Types.BOOLEAN;
            case "int8":
                session,
            case "numeric":
        int divPos = typeName.indexOf('(');
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
                return Types.BIGINT;
import java.sql.SQLException;

                            }
        } catch (Exception e) {
        Boolean childColumnAvailable = dataSource instanceof VerticaDataSource && ((VerticaDataSource) dataSource).isChildCommentColumnAvailable(monitor);
/*

            case "raw":
            case "varchar":
            try (JDBCPreparedStatement stat = session.prepareStatement("select object_type, \"comment\"" +
                return Types.DATE;


                                // View Column do not have columns comments in Vertica
                return Types.TIMESTAMP;

                return Types.TIMESTAMP;
            String objectName = sourceObject instanceof DBPQualifiedObject ?
 *
import org.jkiss.dbeaver.DBDatabaseException;
            case "double precision":
    {
