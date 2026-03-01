import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBSObjectCache<? extends DBSObject, DB2Schema> getObjectsCache(DB2Schema object)
 */
        return FEATURE_SAVE_IMMEDIATELY;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

 */
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            DBUtils.getQuotedIdentifier(command.getObject())));
        return object.getDataSource().getSchemaCache();
        String schemaName = command.getObject().getName();
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
 * DB2 Schema Manager
/**
/*
    private static final String SQL_CREATE_SCHEMA = "CREATE SCHEMA %s";
    protected DB2Schema createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
import org.jkiss.dbeaver.model.DBPDataSource;
public class DB2SchemaManager extends SQLObjectEditor<DB2Schema, DB2DataSource> {

    {
import java.util.List;
    {
        SQLDatabasePersistAction action = new SQLDatabasePersistAction("Create schema", String.format(SQL_CREATE_SCHEMA,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
    }
 * 
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
package org.jkiss.dbeaver.ext.db2.manager;
    {
    @Override
                                             Object copyFrom, @NotNull Map<String, Object> options)
 * DBeaver - Universal Database Manager


 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    {
        return new DB2Schema((DB2DataSource) container, "NEW_SCHEMA");

import org.jkiss.dbeaver.model.DBUtils;
    private static final String SQL_DROP_SCHEMA = "DROP SCHEMA %s RESTRICT";
 *     http://www.apache.org/licenses/LICENSE-2.0
            DBUtils.getQuotedIdentifier(command.getObject())));

    }
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBEPersistAction action = new SQLDatabasePersistAction("Drop schema (SQL)", String.format(SQL_DROP_SCHEMA,
        actions.add(action);
    @Override
import java.util.Map;
import org.jkiss.code.NotNull;
    @Nullable
 * @author Denis Forveille
        actions.add(action);
 *
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
    {
    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * limitations under the License.
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
 * You may obtain a copy of the License at
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
