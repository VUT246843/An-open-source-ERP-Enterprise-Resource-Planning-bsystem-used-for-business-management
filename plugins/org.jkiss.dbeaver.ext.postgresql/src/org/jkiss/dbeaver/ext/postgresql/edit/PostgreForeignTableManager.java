 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableForeign;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
        PostgreSchema schema = (PostgreSchema)container;

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
/*
 *
 */
        } else {
import org.jkiss.utils.CommonUtils;
        final PostgreTableForeign table = (PostgreTableForeign) schema.getDataSource().getServerType().createNewRelation(monitor, schema, PostgreClass.RelKind.f, copyFrom);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;
/**

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            setNewObjectName(monitor, schema, table);

}
            table.setName(getNewChildName(monitor, schema, table.getName()));
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        return table;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * Postgre foreign table manager

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (CommonUtils.isEmpty(table.getName())) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreClass;
    protected PostgreTableForeign createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
 *
 * limitations under the License.
public class PostgreForeignTableManager extends PostgreTableManager {
package org.jkiss.dbeaver.ext.postgresql.edit;
