                this.owner,
import java.util.List;
        }
                0,
                0));
import org.jkiss.dbeaver.ext.snowflake.SnowflakeConstants;

                0,
 * You may obtain a copy of the License at
                SnowflakeConstants.TYPE_DOUBLE_PRECISION,
                false,
                SnowflakeConstants.NUMERIC_MAX_PRECISION - 1));
                0,
        if (DBUtils.findObject(genericDataTypes, SQLConstants.DATA_TYPE_BIGINT) == null) {
                0,
                SnowflakeConstants.TYPE_REAL,
        if (DBUtils.findObject(genericDataTypes, SQLConstants.DATA_TYPE_INT) == null) {
package org.jkiss.dbeaver.ext.snowflake.model;
        }
        if (DBUtils.findObject(genericDataTypes, SnowflakeConstants.TYPE_REAL) == null) {
                this.owner,
                SnowflakeConstants.TYPE_DOUBLE_PRECISION,
                0,
 * limitations under the License.
import org.jkiss.code.NotNull;
                false,
 *
 * Unless required by applicable law or agreed to in writing, software
            genericDataTypes.add(new GenericDataType(
                SQLConstants.DATA_TYPE_FLOAT,
    }
                this.owner,
                Types.DOUBLE,
                0,
                SQLConstants.DATA_TYPE_BIGINT,
    protected void addCustomObjects(@NotNull DBRProgressMonitor monitor, @NotNull GenericStructContainer owner, @NotNull List<GenericDataType> genericDataTypes) {
                SQLConstants.DATA_TYPE_INT,
                Types.INTEGER,
            genericDataTypes.add(new GenericDataType(

        if (DBUtils.findObject(genericDataTypes, SnowflakeConstants.TYPE_DOUBLE_PRECISION) == null) {
                0,
                false,
        }
            genericDataTypes.add(new GenericDataType(
 *     http://www.apache.org/licenses/LICENSE-2.0
                false,

                false,
                0,

            genericDataTypes.add(new GenericDataType(
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.SQLConstants;
                false,
}
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
                this.owner,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                false,
                0));
                Types.FLOAT,
                0,
            genericDataTypes.add(new GenericDataType(
                this.owner,
                false,
                SQLConstants.DATA_TYPE_FLOAT,
/*
                false,
            genericDataTypes.add(new GenericDataType(
                Types.REAL,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                SnowflakeConstants.TYPE_DECIMAL,
                false,
                this.owner,
    SnowflakeDataTypeCache(GenericStructContainer owner) {
                0,
 */
        if (DBUtils.findObject(genericDataTypes, SnowflakeConstants.TYPE_DECIMAL) == null) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
                0,
 *
        }
        if (DBUtils.findObject(genericDataTypes, SQLConstants.DATA_TYPE_FLOAT) == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                false,
import org.jkiss.dbeaver.model.DBUtils;
                0));
                SnowflakeConstants.TYPE_REAL,
                SQLConstants.DATA_TYPE_BIGINT,
                0));
        }
 * you may not use this file except in compliance with the License.
    @Override
        }
                SnowflakeConstants.TYPE_DECIMAL,
 * Copyright (C) 2010-2025 DBeaver Corp and others
                SQLConstants.DATA_TYPE_INT,
                Types.DECIMAL,
import org.jkiss.dbeaver.ext.generic.model.GenericDataTypeCache;
 *
                Types.BIGINT,
import java.sql.Types;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        super(owner);
                SnowflakeConstants.NUMERIC_MAX_PRECISION,

    }
                0));
                false,
public class SnowflakeDataTypeCache extends GenericDataTypeCache {
