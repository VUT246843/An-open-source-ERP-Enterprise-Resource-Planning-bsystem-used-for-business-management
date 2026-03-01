    protected GenericDataType makeDataType(@NotNull JDBCResultSet dbResult, String name, int valueType) {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
/**
            // But there are databases like Netezza or Snowflake, which actually contain such data types as NUMBER and NUMERIC.
                owner,
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.MINIMUM_SCALE),
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION),
                valueType,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @NotNull
        return new GenericDataType(

 * Copyright (C) 2010-2025 DBeaver Corp and others
}
            ignoredTypes.add("NUMBER");

 * See the License for the specific language governing permissions and

    }
                JDBCUtils.safeGetString(dbResult, JDBCConstants.LOCAL_TYPE_NAME),
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    public GenericDataTypeCache(GenericStructContainer owner) {
 *
 * GenericDataTypeCache
public class GenericDataTypeCache extends JDBCBasicDataTypeCache<GenericStructContainer, GenericDataType> {
 * limitations under the License.
            ignoredTypes.add("NUMERIC");
        if (IGNORE_NUMERIC_TYPES) {
import org.jkiss.code.NotNull;
        super(owner);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
            // Ignore abstract types. There can be multiple numeric types with the same name
    @Override
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.MAXIMUM_SCALE));
 *
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.SEARCHABLE) != 0,
    }

    private static final boolean IGNORE_NUMERIC_TYPES = false;
 */
 * Unless required by applicable law or agreed to in writing, software
                name,
 */
            // but different scale/precision properties
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.generic.model;
                JDBCUtils.safeGetBoolean(dbResult, JDBCConstants.UNSIGNED_ATTRIBUTE),

            // The code below was added for a long time ago. Perhaps it is still relevant for some databases.
 * DBeaver - Universal Database Manager
