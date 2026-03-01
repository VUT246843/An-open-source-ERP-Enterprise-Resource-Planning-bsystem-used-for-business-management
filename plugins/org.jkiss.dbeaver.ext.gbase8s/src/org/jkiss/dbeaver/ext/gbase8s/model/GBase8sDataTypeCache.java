import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 *
 * limitations under the License.
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return new GBase8sDataType(owner, valueType, name,
    @Override
        super(owner);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                JDBCUtils.safeGetInt(dbResult, JDBCConstants.MAXIMUM_SCALE));
 */
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.MINIMUM_SCALE),
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected GenericDataType makeDataType(@NotNull JDBCResultSet dbResult, String name, int valueType) {
public class GBase8sDataTypeCache extends GenericDataTypeCache {
 *
 * you may not use this file except in compliance with the License.
                JDBCUtils.safeGetBoolean(dbResult, JDBCConstants.UNSIGNED_ATTRIBUTE),
                JDBCUtils.safeGetInt(dbResult, JDBCConstants.SEARCHABLE) != 0,
package org.jkiss.dbeaver.ext.gbase8s.model;
/*
 * Unless required by applicable law or agreed to in writing, software
    public GBase8sDataTypeCache(GenericStructContainer owner) {
    }
 *
}
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
/**
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
    @NotNull
import org.jkiss.code.NotNull;
 * @author Chao Tian
    }

import org.jkiss.dbeaver.ext.generic.model.GenericDataTypeCache;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
                JDBCUtils.safeGetString(dbResult, JDBCConstants.LOCAL_TYPE_NAME),

