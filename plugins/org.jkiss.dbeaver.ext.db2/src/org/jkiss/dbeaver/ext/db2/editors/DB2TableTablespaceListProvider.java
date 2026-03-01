            if (db2Tablespace.getDataType().isValidForUserTables()) {

    {
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (DB2Tablespace db2Tablespace : colTablespaces) {
    public Object[] getPossibleValues(DB2Table db2Table)
                validTablespaces.add(db2Tablespace);
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    @Nullable

import java.util.List;
    @Override
import java.util.Collection;

 * Provides a list of DB2 Tablespaces for DB2 Table editors

import org.jkiss.dbeaver.ext.db2.model.DB2Tablespace;
 * limitations under the License.

            }
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
 * See the License for the specific language governing permissions and
public class DB2TableTablespaceListProvider implements IPropertyValueListProvider<DB2Table> {
    @Override
/*

/**
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return validTablespaces.toArray(new DB2Tablespace[0]);
 * 
    }
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
}        return false;
        }
        List<DB2Tablespace> validTablespaces = new ArrayList<>(colTablespaces.size());
    public boolean allowCustomValue()
        Collection<DB2Tablespace> colTablespaces = db2Table.getDataSource().getTablespaceCache().getCachedObjects();
 * @author Denis Forveille
 *
 *
 */
 */
 * Unless required by applicable law or agreed to in writing, software
 * 
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
package org.jkiss.dbeaver.ext.db2.editors;
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
