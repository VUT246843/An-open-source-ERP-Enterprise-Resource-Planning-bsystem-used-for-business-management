            procedureName = procedureName.substring(0, divPos);
        } else {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        GenericMetaColumn column = object == null ? null : object.getColumn(columnId);
        } else {

 *
    }
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaColumn;
            return JDBCUtils.safeGetDouble(dbResult, ((Number) column).intValue());
        }
    public static Integer safeGetInteger(GenericMetaObject object, ResultSet dbResult, String columnId) {
    public static boolean safeGetBoolean(GenericMetaObject object, ResultSet dbResult, String columnId) {


 * DBeaver - Universal Database Manager
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static Object safeGetObject(GenericMetaObject object, ResultSet dbResult, String columnId) {

        return column.getColumnIdentifier();
package org.jkiss.dbeaver.ext.generic.model;
        if (column instanceof Number) {

        Object column = getColumn(object, columnId);
            return JDBCUtils.safeGetBoolean(dbResult, column.toString());
    }
            return columnId;
    public static int safeGetInt(GenericMetaObject object, ResultSet dbResult, String columnId) {

import java.math.BigDecimal;
            return JDBCUtils.safeGetInt(dbResult, ((Number) column).intValue());
import org.jkiss.code.NotNull;
        }
    public static boolean isLegacySQLDialect(DBSObject owner) {

 * See the License for the specific language governing permissions and
    }
        Object column = getColumn(object, columnId);
        int divPos = procedureName.lastIndexOf(';');
        if (divPos != -1) {
            return JDBCUtils.safeGetInt(dbResult, column.toString());
    }
            return JDBCUtils.safeGetObject(dbResult, column.toString());
import org.jkiss.dbeaver.model.struct.DBSObject;
        }

            return JDBCUtils.safeGetBoolean(dbResult, ((Number) column).intValue());
        }
        Object column = getColumn(object, columnId);
import org.jkiss.dbeaver.model.sql.SQLDialect;
        GenericMetaObject object = dataSource.getMetaObject(objectType);
    public static Object getColumn(GenericDataSource dataSource, String objectType, String columnId) {
            // [JDBC: SQL Server native driver]
    }
/**
            return JDBCUtils.safeGetString(dbResult, column.toString());
        if (column instanceof Number) {
    public static long safeGetLong(GenericMetaObject object, ResultSet dbResult, String columnId) {
        if (object == null) {
        Object column = getColumn(object, columnId);
        } else {
    }
        GenericMetaColumn column = object.getColumn(columnId);
    }
        Object column = getColumn(object, columnId);
            return JDBCUtils.safeGetObject(dbResult, ((Number) column).intValue());
            return columnId;
        return dialect instanceof GenericSQLDialect && ((GenericSQLDialect) dialect).isLegacySQLDialect();
        return column.getColumnIdentifier();
        if (column == null || !column.isSupported()) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
        if (column instanceof Number) {
            return JDBCUtils.safeGetInteger(dbResult, column.toString());
            return JDBCUtils.safeGetStringTrimmed(dbResult, ((Number) column).intValue());
        return procedureName;
    public static String safeGetString(GenericMetaObject object, ResultSet dbResult, String columnId) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    public static Object getColumn(GenericMetaObject object, String columnId) {
}
        if (column instanceof Number) {

    }
        if (column instanceof Number) {
        }
    }
        if (column instanceof Number) {
        } else {
 * limitations under the License.
    public static String safeGetStringTrimmed(GenericMetaObject object, ResultSet dbResult, String columnId) {
        if (column instanceof Number) {
    public static double safeGetDouble(GenericMetaObject object, ResultSet dbResult, String columnId) {
            return JDBCUtils.safeGetString(dbResult, ((Number) column).intValue());
 * Generic utils

public class GenericUtils {
            return JDBCUtils.safeGetBigDecimal(dbResult, ((Number) column).intValue());
 *
 */
        Object column = getColumn(object, columnId);
        }
        }
        } else {
        }

        } else {
 * Unless required by applicable law or agreed to in writing, software
        if (column instanceof Number) {
 * You may obtain a copy of the License at
            return JDBCUtils.safeGetBigDecimal(dbResult, column.toString());

            return columnId;
    public static BigDecimal safeGetBigDecimal(GenericMetaObject object, ResultSet dbResult, String columnId) {

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

 * you may not use this file except in compliance with the License.
            return JDBCUtils.safeGetInteger(dbResult, ((Number) column).intValue());
/*
            return JDBCUtils.safeGetStringTrimmed(dbResult, column.toString());

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
        } else {


        // Either object is not yet persisted (so no alter is required) or database supports table altering

            return JDBCUtils.safeGetDouble(dbResult, column.toString());
        if (column instanceof Number) {
        if (column == null || !column.isSupported()) {
import java.sql.ResultSet;
    public static boolean canAlterTable(@NotNull DBSObject object) {
        Object column = getColumn(object, columnId);
            return JDBCUtils.safeGetLong(dbResult, column.toString());
    }
        }
        } else {
        SQLDialect dialect = SQLUtils.getDialectFromObject(owner);
        }
 *
    public static String normalizeProcedureName(String procedureName) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 */
        Object column = getColumn(object, columnId);
            return JDBCUtils.safeGetLong(dbResult, ((Number) column).intValue());
        Object column = getColumn(object, columnId);

        }
        return !object.isPersisted() || object.getDataSource().getSQLDialect().supportsAlterTableStatement();
