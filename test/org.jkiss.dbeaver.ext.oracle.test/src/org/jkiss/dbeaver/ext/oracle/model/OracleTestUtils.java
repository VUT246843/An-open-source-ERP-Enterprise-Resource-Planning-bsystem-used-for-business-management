

import org.jkiss.dbeaver.DBException;
class OracleTestUtils {
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
 */
 *
    static OracleTableColumn addColumn(OracleTableBase table, String columnName, String columnType, int ordinalPosition) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.runtime.DBWorkbench;
        column.setOrdinalPosition(ordinalPosition);
import java.util.List;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        cachedAttributes.add(column);
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.oracle.model;
        column.setTypeName(columnType);
/*
        column.setName(columnName);
        return column;
 * You may obtain a copy of the License at
}
 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software

        List<OracleTableColumn> cachedAttributes = (List<OracleTableColumn>) table.getCachedAttributes();
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        OracleTableColumn column = new OracleTableColumn(table);
        return DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(objectClass, DBEObjectMaker.class);

    static DBEObjectMaker getManagerForClass(Class<?> objectClass) {

    }
 * DBeaver - Universal Database Manager
