 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
    /**
     * Secondary ID of the item on which the extended property exists, interpreted according to its class.
    @NotNull
 * you may not use this file except in compliance with the License.
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
 * @see <a href="https://docs.microsoft.com/en-us/sql/relational-databases/system-stored-procedures/sp-addextendedproperty-transact-sql">sp_addextendedproperty</a>

import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
     */
     * <li>{@code level 0 - Schema}</li>
    long getMajorObjectId();
 * <p>
     * Identifies the class of item on which the property exists.

     * Name and the object of the specified {@code level} on which the extended property exists.

    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    long getMinorObjectId();
 * Represents entity on which the extended properties can be added.
 */
package org.jkiss.dbeaver.ext.mssql.model;
 * @see <a href="https://docs.microsoft.com/en-us/sql/relational-databases/system-catalog-views/extended-properties-catalog-views-sys-extended-properties">sys.extended_properties</a>
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 */
     */
    /**
    /**
     * <p>
     * </ul>
 * SQLServerExtendedPropertyOwner

    @Nullable
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     */
    SQLServerExtendedPropertyCache getExtendedPropertyCache();
 *
    @NotNull

    SQLServerDatabase getDatabase();
     * For example, if the object class is {@link SQLServerObjectClass#OBJECT_OR_COLUMN} and

     * the minor id is {@code > 0}, then following objects may be returned for given {@code level}:
     * ID of the item on which the extended property exists, interpreted according to its class.
 * See the License for the specific language governing permissions and
     * <li>{@code level 2 - Column}</li>


 *
import org.jkiss.utils.Pair;
 * You may obtain a copy of the License at
     * <ul>
 *
     * <li>{@code level 1 - Table}</li>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    SQLServerObjectClass getExtendedPropertyObjectClass();
public interface SQLServerExtendedPropertyOwner extends SQLServerObject {
import org.jkiss.code.NotNull;
}
    Pair<String, SQLServerObject> getExtendedPropertyObject(@NotNull DBRProgressMonitor monitor, int level);
