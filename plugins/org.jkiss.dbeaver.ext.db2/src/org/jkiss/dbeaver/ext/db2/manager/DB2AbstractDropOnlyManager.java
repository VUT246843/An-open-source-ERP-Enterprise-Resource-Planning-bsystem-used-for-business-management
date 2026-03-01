    }
    }
 * 
        return false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
    @Override
    extends SQLObjectEditor<OBJECT_TYPE, CONTAINER_TYPE> {
 * DB2 Base class for Managers that only handle DROP statements
/**
import java.util.Map;
import java.util.List;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        actions.add(action);
 *
        DBEPersistAction action = new SQLDatabasePersistAction("Drop", buildDropStatement(command.getObject()));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.DBPSaveableObject;
    }

/*


        return 0;
    protected abstract String buildDropStatement(OBJECT_TYPE object);

}
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
 *

    {
    {


 * Unless required by applicable law or agreed to in writing, software
    public boolean canEditObject(@NotNull OBJECT_TYPE object)
    @Override
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
 *
        return null;
 * You may obtain a copy of the License at
    }
    {
 * you may not use this file except in compliance with the License.
 */
public abstract class DB2AbstractDropOnlyManager<OBJECT_TYPE extends DBSObject & DBPSaveableObject, CONTAINER_TYPE extends DBSObject>

 * @author Denis Forveille
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * limitations under the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
    }
    {
    protected OBJECT_TYPE createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object owner,
 * distributed under the License is distributed on an "AS IS" BASIS,
 */

package org.jkiss.dbeaver.ext.db2.manager;
    @Override
    {
                                               Object copyFrom, @NotNull Map<String, Object> options)
    @Override
    public boolean canCreateObject(@NotNull Object container)

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

