            JDBCUtils.queryString(session, getQueryForSystemColumnChecking(tableName, columnName));
            return null;
            for (int i = 0; i < objVector.length; i++) {
                throw new IllegalArgumentException("Error reading array value: " + kbVector);
        }
                }
            final int[] ids = new int[strings.length];
            }
        }
                return null;
                        result[i] = ((Number) item).intValue();
            Long[] objVector = (Long[]) kbVector;
            return true;

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
            }
    public static String getObjectComment(DBRProgressMonitor monitor, GenericStructContainer container, String schema, String object)
            if (vector.isEmpty()) {
        return className.equals(KingbaseConstants.KB_OBJECT_CLASS);
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
            }
            for (int i = 0; i < strings.length; i++) {

 *
                    if (item instanceof Number) {
                            "where sys_class.relname = ? and sys_namespace.nspname=?", object, schema);
        try (JDBCSession session = DBUtils.openMetaSession(monitor, container, "Load Kingbase description")) {
            return new int[]{number.intValue()};
            final long[] ids = new long[strings.length];
                        throw new IllegalArgumentException("Bad array item type: " + item.getClass().getName());
    public static Object extractKBObjectValue(Object kbObject) {
                int length = Array.getLength(array);
 *
            return new long[]{((Number) kbVector).longValue()};
            log.debug("Can't extract value from " + kbObject.getClass().getName(), e);
import org.jkiss.dbeaver.DBException;
    }
 */
                        throw new IllegalArgumentException("Bad array item type: " + item.getClass().getName());
        } else if (kbVector instanceof Integer[] objVector) {
                Object array = ((java.sql.Array) kbVector).getArray();
                throw new IllegalArgumentException("Error reading array value: " + kbVector);
            return null;
        } else if (kbVector instanceof long[]) {
 * you may not use this file except in compliance with the License.
            } catch (SQLException e) {
        } catch (Exception e) {
                if (array == null) {
import java.sql.SQLException;

        if (kbVector instanceof String) {
 */
    public static boolean isKBObject(Object object) {
            final String[] strings = vector.split(PostgreConstants.DEFAULT_ARRAY_DELIMITER);
import org.jkiss.dbeaver.model.DBUtils;
                }
                ids[i] = CommonUtils.toInt(strings[i]);
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            final String vector = (String) kbVector;
                int length = Array.getLength(array);
        }
 *

                    return null;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
            tableName.replaceAll("pg_", "sys_");
        return false;
            return null;
                    Object item = Array.get(array, i);
                    } else if (item != null) {
                    if (item instanceof Number) {
            return JDBCUtils.queryString(
        if (!isKBObject(kbObject)) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        }
                    return null;
            long[] result = new long[objVector.length];
                            "join sys_catalog.sys_class on sys_description.objoid = sys_class.oid\n" +
        }
        } catch (SQLException e) {
            for (int i = 0; i < objVector.length; i++) {
        } else if (kbVector instanceof java.sql.Array kbArray) {
    public static long[] getIdVector(Object kbObject) {
        Object kbVector = extractKBObjectValue(kbObject);
        } else if (kbVector instanceof Number) {
        if (kbObject == null) {
            return (long[]) kbVector;
            final String[] strings = vector.split(PostgreConstants.DEFAULT_ARRAY_DELIMITER);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
                    "select description from sys_catalog.sys_description\n" +
            log.debug("Error reading system information from the " + tableName + " table: " + e.getMessage());
import java.lang.reflect.Array;
        } else if (kbVector instanceof int[] intVector) {
                Object array = kbArray.getArray();
                            "join sys_catalog.sys_namespace on sys_class.relnamespace = sys_namespace.oid\n" +
            return ids;
        } else {
            return null;
        }

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (kbVector == null) {
                result[i] = objVector[i];
        try {
            try {
                    }

import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        if (kbVector instanceof String vector) {
                    } else if (item != null) {
                result[i] = objVector[i];
}
            throws DBException {
    }
                int[] result = new int[length];
                    Object item = Array.get(array, i);
        return "SELECT " + columnName + " FROM sys_catalog." + tableName + " WHERE 1<>1 LIMIT 1";
        }
            return kbObject;
        } else {
            } catch (SQLException e) {
        } else if (kbVector instanceof Long[]) {

                return result;
    }
            throw new IllegalArgumentException("Unsupported vector type: " + kbVector.getClass().getName());
                if (array == null) {
        } else if (kbVector instanceof Number number) {
                        result[i] = ((Number) item).longValue();

        if (tableName.contains("pg_")) {
/*
import org.jkiss.code.NotNull;
/**
                    session,
    public static String getQueryForSystemColumnChecking(@NotNull String tableName, @NotNull String columnName) {
import org.jkiss.utils.CommonUtils;

 * KingbaseUtils
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
        }
                for (int i = 0; i < length; i++) {
        } catch (Exception e) {
 * See the License for the specific language governing permissions and
        }
            return intVector;
                ids[i] = CommonUtils.toLong(strings[i]);
            throw new IllegalArgumentException("Unsupported vector type: " + kbVector.getClass().getName());
                for (int i = 0; i < length; i++) {
        if (kbVector == null) {
package org.jkiss.dbeaver.ext.kingbase;
            try {
                long[] result = new long[length];
            }
            return kbObject.getClass().getMethod("getValue").invoke(kbObject);
    private static final Log log = Log.getLog(KingbaseUtils.class);
                }
        try {
            }
public class KingbaseUtils {
   
            return false;
 * limitations under the License.
        Object kbVector = extractKBObjectValue(kbObject);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public static int[] getIntVector(Object kbObject) {
    }
            log.debug(e);
                return null;
            return ids;
            int[] result = new int[objVector.length];
        String className = object.getClass().getName();
        } else if (kbVector instanceof java.sql.Array) {
                }
            if (vector.isEmpty()) {
            }

    }
        }
                return result;
            return result;

            return result;
    }
 * Unless required by applicable law or agreed to in writing, software
            for (int i = 0; i < strings.length; i++) {
        if (object == null) {
    public static boolean isMetaObjectExists(@NotNull JDBCSession session, @NotNull String tableName, @NotNull String columnName) {
