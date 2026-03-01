     *

    String getDefaultDataTypeName(@NotNull DBPDataKind dataKind);
     * @param typeName type name
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
        throws DBException;

import java.util.Collection;
     * @return data type name or null if data kind not supported
    @Nullable
    DBPDataKind resolveDataKind(@NotNull String typeName, int typeID);
     * @return list of types
    /**
    @NotNull
    @NotNull
    DBSDataType getLocalDataType(int typeID);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
/*
 * See the License for the specific language governing permissions and
     * @param typeName type name

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * Resolve data type by it's full name.
     * @return data kind or null if type can't be resolved
     */
     * Determines data kind by type name and/or ID

 * DBeaver - Universal Database Manager
 *

     */
 * Data type provider
    DBSDataType resolveDataType(@NotNull DBRProgressMonitor monitor, @NotNull String typeFullName)
     * @return data type of null
 * You may obtain a copy of the License at
    /**
 */
    @Nullable
     * @return data type or null if type not found
     * @param typeID type ID
 * limitations under the License.
     */
    DBSDataType getLocalDataType(@Nullable String typeName);
    @NotNull
 *
    /**
     * @return data type of null
import org.jkiss.code.Nullable;
     * Retrieves list of supported datatypes.
 *
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model;
    Collection<? extends DBSDataType> getLocalDataTypes();
    /**
     * Gets data type with specified type id

import org.jkiss.dbeaver.DBException;
     * @param dataKind data kind

 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
     *

     * @throws DBException on any DB access error
     */
/**
     * Returns name of default data type for specified data kind
     * @param monitor progress monitor
 */
    /**
     */
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
{

 * you may not use this file except in compliance with the License.
     * Gets data type with specified name
     */
}
import org.jkiss.dbeaver.model.struct.DBSDataType;
public interface DBPDataTypeProvider
     * @param typeFullName full qualified type name
