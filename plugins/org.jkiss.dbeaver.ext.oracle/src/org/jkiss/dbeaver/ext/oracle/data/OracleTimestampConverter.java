 * Copyright (C) 2010-2024 DBeaver Corp and others
                new Class<?>[] { Connection.class }, new Object[] { connection });
 * you may not use this file except in compliance with the License.
    private static Object invokeNativeMethod(Object object, String name, Class<?>[] classes, Object[] args) throws Exception {
        case OracleConstants.TIMESTAMP_CLASS_NAME ->
    }
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new DBException("Cannot invoke method " + name + " on " + object.getClass(), e);
import org.jkiss.code.NotNull;
    private static final String TO_TIMESTAMP_METHOD_NAME = "timestampValue";
import java.sql.Connection;
        }
 *
 *


        case OracleConstants.TIMESTAMPTZ_CLASS_NAME -> (Timestamp) invokeNativeMethod(object, TO_TIMESTAMP_METHOD_NAME,
/*
    public static Timestamp toTimestamp(@NotNull Object object, @NotNull Connection connection) throws Exception {
        try {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        } catch (Throwable e) {
public class OracleTimestampConverter {
 *     http://www.apache.org/licenses/LICENSE-2.0
            (Timestamp) invokeNativeMethod(object, TO_TIMESTAMP_METHOD_NAME, null, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

        default -> throw new DBException("Unsupported Oracle TIMESTAMP type: " + aClass.getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        return switch (aClass.getName()) {
 *
import java.sql.Timestamp;
    }
 * limitations under the License.
    // See  https://docs.oracle.com/en/database/oracle/oracle-database/12.2/jajdb/oracle/sql/TIMESTAMP.html#timestampValue--
package org.jkiss.dbeaver.ext.oracle.data;

    }
        case OracleConstants.TIMESTAMPLTZ_CLASS_NAME -> (Timestamp) invokeNativeMethod(object, TO_TIMESTAMP_METHOD_NAME,
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
        Class<?> aClass = object.getClass();
            return BeanUtils.invokeObjectMethod(object, name, classes, args);
                new Class<?>[] { Connection.class, Calendar.class },

    private OracleTimestampConverter() {
import java.util.Calendar;
                new Object[] { connection, Calendar.getInstance() });

        };
import org.jkiss.utils.BeanUtils;
 * Unless required by applicable law or agreed to in writing, software
 */
