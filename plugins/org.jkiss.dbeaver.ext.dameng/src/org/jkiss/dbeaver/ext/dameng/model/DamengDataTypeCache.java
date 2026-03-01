 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.MAXIMUM_SCALE));
public class DamengDataTypeCache extends GenericDataTypeCache {
package org.jkiss.dbeaver.ext.dameng.model;
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
                valueType,
import org.jkiss.dbeaver.ext.generic.model.GenericDataTypeCache;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
/**

                name,
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.MINIMUM_SCALE),
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    }

}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION),
                JDBCUtils.safeGetString(dbResult, JDBCConstants.LOCAL_TYPE_NAME),
        super(owner);
 * You may obtain a copy of the License at
 *
        return new DamengDataType(owner,
/*
import org.jkiss.code.NotNull;
    protected GenericDataType makeDataType(@NotNull JDBCResultSet dbResult, String name, int valueType) {
 */
    }

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
                JDBCUtils.safeGetBoolean(dbResult, JDBCConstants.UNSIGNED_ATTRIBUTE),

    @Override
 * @author Shengkai Bai
 * See the License for the specific language governing permissions and
    public DamengDataTypeCache(GenericStructContainer owner) {
 *
 */
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.SEARCHABLE) != 0,
