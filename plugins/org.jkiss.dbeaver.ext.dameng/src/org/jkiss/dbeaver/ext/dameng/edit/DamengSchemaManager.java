

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        "Create schema",
    }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        DamengSchema damengSchema = new DamengSchema(dataSource, "NEW_SCHEMA", false);

        return true;
 * @author Shengkai Bai
                new SQLDatabasePersistAction(
/*
import java.util.List;
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public boolean canDeleteObject(@NotNull DamengSchema object) {
        );
                new SQLDatabasePersistAction(
    @Override
}
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
package org.jkiss.dbeaver.ext.dameng.edit;
    public DBSObjectCache<? extends DBSObject, DamengSchema> getObjectsCache(DamengSchema object) {
        return object.getDataSource().getSchemaCache();
 * limitations under the License.
    @Override
    @Override
        );
import org.jkiss.dbeaver.ext.dameng.model.DamengDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
public class DamengSchemaManager extends SQLObjectEditor<DamengSchema, DamengDataSource> {
 * See the License for the specific language governing permissions and
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<DamengSchema, DamengDataSource>.ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {

 * you may not use this file except in compliance with the License.
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {

        return true;
import java.util.Map;
        DamengDataSource dataSource = (DamengDataSource) container;
        return FEATURE_SAVE_IMMEDIATELY;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *

 */
        setNewObjectName(monitor, dataSource, damengSchema);
    }
    @Override
    @Override
    protected DamengSchema createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
    public boolean canCreateObject(@NotNull Object container) {

import org.jkiss.dbeaver.ext.dameng.model.DamengSchema;

        actions.add(
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
import org.jkiss.dbeaver.DBException;
/**
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<DamengSchema, DamengDataSource>.ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
        return damengSchema;
import org.jkiss.dbeaver.model.DBPDataSource;

        actions.add(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                        "Drop schema",
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

 * DBeaver - Universal Database Manager
    protected String getBaseObjectName() {
    @Override
    }
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
                        "DROP SCHEMA " + DBUtils.getObjectFullName(command.getObject(), DBPEvaluationContext.DDL) + " RESTRICT")
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.DBUtils;

                        "CREATE SCHEMA " + DBUtils.getObjectFullName(command.getObject(), DBPEvaluationContext.DDL))
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
 */
        return "NEW_SCHEMA";
import org.jkiss.code.NotNull;
