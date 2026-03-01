        return super.getCreateTableType(table);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    protected String getCreateTableType(GenericTableBase table) {
    }
    protected String getDropTableType(GenericTableBase table) {
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * Unless required by applicable law or agreed to in writing, software
 */
/*
        return "TABLE";
        return structContainer.getDataSource().getMetaModel().createTableOrViewImpl((GenericStructContainer) container , tableName, VerticaConstants.TYPE_FLEX_TABLE, null);

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
public class VerticaFlexTableManager extends GenericTableManager {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
 * limitations under the License.
        GenericStructContainer structContainer = (GenericStructContainer) container;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.vertica.model.VerticaFlexTable;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
import org.jkiss.dbeaver.ext.vertica.VerticaConstants;
import java.util.Map;
        String tableName = getNewChildName(monitor, structContainer, "new_flex_table");
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    protected GenericTableBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) {
            return VerticaConstants.TYPE_FLEX_TABLE;
 *
package org.jkiss.dbeaver.ext.vertica.edit;
 *
        if (table instanceof VerticaFlexTable) {
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    }
    @Override
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
