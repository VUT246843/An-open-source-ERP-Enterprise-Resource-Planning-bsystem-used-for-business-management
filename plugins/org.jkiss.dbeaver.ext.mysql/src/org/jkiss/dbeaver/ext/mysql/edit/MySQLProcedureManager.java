
        return FEATURE_EDITOR_ON_CREATE;

package org.jkiss.dbeaver.ext.mysql.edit;
        return object.getContainer().getProceduresCache();
        if (CommonUtils.isEmpty(command.getObject().getDeclaration())) {
/*
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    public DBSObjectCache<MySQLCatalog, MySQLProcedure> getObjectsCache(MySQLProcedure object)
    {
            new SQLDatabasePersistAction("Create procedure", procedure.getDeclaration(), true));
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        }
    {
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
        throws DBException
        actions.add(

import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.
            new SQLDatabasePersistAction("Drop procedure", "DROP " + procedure.getProcedureType() + " IF EXISTS " + procedure.getFullyQualifiedName(DBPEvaluationContext.DDL))); //$NON-NLS-2$ //$NON-NLS-3$
import java.util.Map;

 */

        return new MySQLProcedure((MySQLCatalog) container);
    {
    }
    private void createOrReplaceProcedureQuery(List<DBEPersistAction> actions, MySQLProcedure procedure)

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;

        if (CommonUtils.isEmpty(command.getObject().getName())) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * MySQLProcedureManager

    @Override
    @Override
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
 *
    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLProcedure;
    }
 *
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
    @Override
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
import java.util.List;
        createOrReplaceProcedureQuery(actionList, command.getObject());
 */

    {
/**
    @Override
public class MySQLProcedureManager extends SQLObjectEditor<MySQLProcedure, MySQLCatalog> {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            throw new DBException("Procedure name cannot be empty");
        actions.add(
    @Override
    }
 *

import org.jkiss.code.NotNull;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
        );
    @Nullable
    }
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
            new SQLDatabasePersistAction("Drop procedure", "DROP " + command.getObject().getProcedureType() + " " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
            throw new DBException("Procedure body cannot be empty");
        }
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
        createOrReplaceProcedureQuery(actions, command.getObject());
    protected MySQLProcedure createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object copyFrom, @NotNull Map<String, Object> options)
 * you may not use this file except in compliance with the License.


        actions.add(
import org.jkiss.utils.CommonUtils;
