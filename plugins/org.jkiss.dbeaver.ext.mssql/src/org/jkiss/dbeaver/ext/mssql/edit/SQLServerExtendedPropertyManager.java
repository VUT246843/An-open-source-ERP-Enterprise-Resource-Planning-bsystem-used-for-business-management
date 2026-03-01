            command.getObject().getObjectDefinitionText(monitor, true, false)
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            command.getObject().getObjectDefinitionText(monitor, false, false)
 *
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
    }
import org.jkiss.dbeaver.model.edit.DBECommandContext;


        final SQLServerExtendedPropertyOwner owner = (SQLServerExtendedPropertyOwner) container;
            "New property",
    @Override
            "Create extended property",

        actions.add(new SQLDatabasePersistAction(
    @Override
    @Override
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
        );
/*
        ));
        actions.add(new SQLDatabasePersistAction(
}
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
 *
    protected SQLServerExtendedProperty createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {

 */
            owner.getDataSource().getLocalDataType(SQLServerConstants.TYPE_NVARCHAR),
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
public class SQLServerExtendedPropertyManager extends SQLObjectEditor<SQLServerExtendedProperty, SQLServerExtendedPropertyOwner> {
import org.jkiss.dbeaver.model.DBPDataSource;
            "Drop extended property",
package org.jkiss.dbeaver.ext.mssql.edit;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        return new SQLServerExtendedProperty(

import org.jkiss.dbeaver.ext.mssql.model.SQLServerExtendedPropertyOwner;
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Unless required by applicable law or agreed to in writing, software
import java.util.List;
        ));
 * limitations under the License.
        actions.add(new SQLDatabasePersistAction(
 * You may obtain a copy of the License at
import java.util.Map;
    }
        ));
        return object.getParentObject().getExtendedPropertyCache();
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObject;
 * distributed under the License is distributed on an "AS IS" BASIS,
            ""
 * DBeaver - Universal Database Manager
    @Override

    }
 * you may not use this file except in compliance with the License.


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            owner,
    }
    public DBSObjectCache<? extends DBSObject, SQLServerExtendedProperty> getObjectsCache(SQLServerExtendedProperty object) {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerExtendedProperty;
            command.getObject().getObjectDefinitionText(monitor, false, true)
        return 0;
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
 * See the License for the specific language governing permissions and
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            "Alter extended property",
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

 *
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
