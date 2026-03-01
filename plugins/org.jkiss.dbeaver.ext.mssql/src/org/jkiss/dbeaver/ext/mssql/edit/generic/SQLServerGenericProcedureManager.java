        );
import org.jkiss.dbeaver.ext.generic.model.GenericProcedure;
 *

    }
import org.jkiss.dbeaver.ext.generic.edit.GenericProcedureManager;

                "DROP PROCEDURE " + DBUtils.getQuotedIdentifier(object.getContainer()) + "." + DBUtils.getQuotedIdentifier(object))
/**
import java.util.List;

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLServerGenericProcedureManager extends GenericProcedureManager {
/*
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ext.mssql.edit.generic;
 * DBeaver - Universal Database Manager
        actions.add(
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
import java.util.Map;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
}
 */
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * you may not use this file except in compliance with the License.
                ModelMessages.model_jdbc_drop_table,
 * SQL Server Generic procedure manager
        // Do not use database name (not supported)

        // Always DROP PROCEDURE (SQL Server doesn't support functions?)
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
        GenericProcedure object = command.getObject();
    @Override

 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            new SQLDatabasePersistAction(
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
