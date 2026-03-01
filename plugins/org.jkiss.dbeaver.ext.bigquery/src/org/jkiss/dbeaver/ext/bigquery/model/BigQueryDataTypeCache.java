/*
        return new BigQueryDataType(
 *
            JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION),
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
            JDBCUtils.safeGetInt(dbResult, JDBCConstants.SEARCHABLE) != 0,
            JDBCUtils.safeGetBoolean(dbResult, JDBCConstants.UNSIGNED_ATTRIBUTE),
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *
package org.jkiss.dbeaver.ext.bigquery.model;
public class BigQueryDataTypeCache extends org.jkiss.dbeaver.ext.generic.model.GenericDataTypeCache {
    @Override
    }
            JDBCUtils.safeGetInt(dbResult, JDBCConstants.MINIMUM_SCALE),
 * DBeaver - Universal Database Manager
            valueType,
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    public BigQueryDataTypeCache(GenericStructContainer owner) {
    @NotNull
 * limitations under the License.

 * You may obtain a copy of the License at

            JDBCUtils.safeGetString(dbResult, JDBCConstants.LOCAL_TYPE_NAME),

 * Copyright (C) 2010-2024 DBeaver Corp and others
            owner,
 * you may not use this file except in compliance with the License.
        super(owner);
    }

 *
 */
 * Unless required by applicable law or agreed to in writing, software
}
    protected GenericDataType makeDataType(@NotNull JDBCResultSet dbResult, String name, int valueType) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
            JDBCUtils.safeGetInt(dbResult, JDBCConstants.MAXIMUM_SCALE));
 * Licensed under the Apache License, Version 2.0 (the "License");
            name,
