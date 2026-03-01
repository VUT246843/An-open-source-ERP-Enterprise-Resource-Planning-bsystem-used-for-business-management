import org.jkiss.code.NotNull;
    extends SQLObjectEditor<OBJECT_TYPE, CONTAINER_TYPE>
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
        );
        @NotNull List<DBEPersistAction> actions,
    {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    @Override
        if (CommonUtils.isEmpty(command.getObject().getName())) {
        @NotNull DBCExecutionContext executionContext,
}
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBUtils;
/**
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        boolean create);
    }
 *
        @NotNull Map<String, Object> options)
        @NotNull DBRProgressMonitor monitor,
 *
    }
        @NotNull OBJECT_TYPE trigger,
        @NotNull ObjectDeleteCommand command,
    }
            new SQLDatabasePersistAction("Drop trigger",
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.Map;
 * See the License for the specific language governing permissions and
    @Override




    protected abstract void createOrReplaceTriggerQuery(
package org.jkiss.dbeaver.model.impl.sql.edit.struct;
        throws DBException
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;


    {
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
 */

        @NotNull DBRProgressMonitor monitor,
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            throw new DBException("Trigger name cannot be empty");
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
    }
    {
        actions.add(
                "DROP TRIGGER " + DBUtils.getObjectFullName(command.getObject(), DBPEvaluationContext.DDL))
{
public abstract class SQLTriggerManager<OBJECT_TYPE extends DBSTrigger, CONTAINER_TYPE extends DBSObject>
        @NotNull DBCExecutionContext executionContext,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    @Override
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
 * SQL trigger manager
        return FEATURE_EDITOR_ON_CREATE;
import java.util.List;
    }
    {
        createOrReplaceTriggerQuery(monitor, executionContext, actionList, command.getObject(), false);
import org.jkiss.dbeaver.model.DBPDataSource;

 *
    @Override
/*
        }
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectDeleteActions(

 * Unless required by applicable law or agreed to in writing, software

 * You may obtain a copy of the License at
        createOrReplaceTriggerQuery(monitor, executionContext, actions, command.getObject(), true);
        @NotNull List<DBEPersistAction> actions,
 * limitations under the License.
