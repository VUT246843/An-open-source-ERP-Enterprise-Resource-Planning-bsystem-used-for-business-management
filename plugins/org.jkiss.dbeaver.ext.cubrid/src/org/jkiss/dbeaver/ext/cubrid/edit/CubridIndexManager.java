}
        actions.add(new SQLDatabasePersistAction(
            "DROP INDEX " + DBUtils.getQuotedIdentifier(index.getDataSource(), index.getName()) + " ON "
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
public class CubridIndexManager extends GenericIndexManager {
        @NotNull Map<String, Object> options
        @NotNull DBECommandContext context,
        return new CubridTableIndex(table, true, null, 0, null, DBSIndexType.OTHER, false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 * Licensed under the Apache License, Version 2.0 (the "License");
    ) {
        CubridTable table = (CubridTable) container;
            "Drop Index",
        final Object container,
import org.jkiss.dbeaver.ext.cubrid.model.CubridTableIndex;
 * You may obtain a copy of the License at
    @Override
        ));
    @Override
 * DBeaver - Universal Database Manager
        @NotNull DBCExecutionContext executionContext,
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        Object from,
 *

        @NotNull DBRProgressMonitor monitor,
    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
import org.jkiss.dbeaver.ext.cubrid.model.CubridTable;

import java.util.List;
 * you may not use this file except in compliance with the License.
 *
        @NotNull List<DBEPersistAction> actions,
    ) {
        @NotNull DBRProgressMonitor monitor,
package org.jkiss.dbeaver.ext.cubrid.edit;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.ext.generic.edit.GenericIndexManager;

/*
        @NotNull Map<String, Object> options
 * See the License for the specific language governing permissions and
        GenericTableIndex index = command.getObject();
    protected void addObjectDeleteActions(
import java.util.Map;

import org.jkiss.code.NotNull;
        @NotNull ObjectDeleteCommand command,
 * Unless required by applicable law or agreed to in writing, software
    protected CubridTableIndex createDatabaseObject(
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *

    }
            + index.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL)
