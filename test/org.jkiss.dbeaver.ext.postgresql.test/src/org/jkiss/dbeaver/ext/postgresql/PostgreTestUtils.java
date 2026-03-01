        PostgreTableColumn column = new PostgreTableColumn(table);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
        return column;
 * limitations under the License.
 */
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

/**
 *
 *
import java.util.List;
    public static PostgreTableColumn addColumn(PostgreTableBase table, String columnName, String columnType, int ordinalPosition) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        column.setTypeName(columnType);
 * you may not use this file except in compliance with the License.
        column.setOrdinalPosition(ordinalPosition);
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
 */
 * PostgreSQL supporting test class
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
 * DBeaver - Universal Database Manager
    @SuppressWarnings("unchecked")
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
        List<PostgreTableColumn> cachedAttributes = (List<PostgreTableColumn>) table.getCachedAttributes();
    }
}
/*
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
        cachedAttributes.add(column);
 * You may obtain a copy of the License at

        column.setName(columnName);
public class PostgreTestUtils {
package org.jkiss.dbeaver.ext.postgresql;
