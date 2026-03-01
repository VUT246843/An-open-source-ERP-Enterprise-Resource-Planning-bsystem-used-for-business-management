 */
    /**
 *
     * Index container. In complex databases it is schema or catalog where index defined.

    boolean isUnique();
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;

import org.jkiss.code.Nullable;
    DBSIndexType getIndexType();
import java.util.List;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface DBSTableIndex extends DBSEntityConstraint, DBSEntityReferrer, DBPQualifiedObject
        throws DBException;

/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 * DBSTableIndex
     * @return container
package org.jkiss.dbeaver.model.struct.rdb;

    DBSEntity getTable();

 *
 * limitations under the License.
     */
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;

     * Also the table can be index container.
 */
/*

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
    boolean isPrimary();
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.jkiss.dbeaver.model.struct.DBSEntity;
 * you may not use this file except in compliance with the License.
 *
{
 * Unless required by applicable law or agreed to in writing, software
    List<? extends DBSTableIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
}
    DBSObject getContainer();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
