    }
 */
                                          @NotNull ObjectDeleteCommand command,
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor,
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableContainer;
        actions.add(createDeleteAction(command.getObject(), options));
 * limitations under the License.
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        actions.add(new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_table, table.generateDDL(monitor)));

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.messages.ModelMessages;
                .append(table.getFullyQualifiedName(DBPEvaluationContext.DDL))
        return object.getContainer().getSchema().getTableCache();

                                                          Object copyFrom, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
}
/*
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
    }
        return new SQLDatabasePersistAction(ModelMessages.model_jdbc_drop_table, dropTableScript.toString());
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
        return "EXTERNAL TABLE";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        GreenplumExternalTable externalTable = new GreenplumExternalTable((PostgreSchema) container);
import org.jkiss.code.Nullable;
import java.util.List;
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumExternalTable;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
                                                          Object container,
        GreenplumExternalTable table = (GreenplumExternalTable) command.getObject();
 * Unless required by applicable law or agreed to in writing, software
 *
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        setNewObjectName(monitor, (PostgreSchema) container, externalTable);
    }

import java.util.Map;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * distributed under the License is distributed on an "AS IS" BASIS,

public class GreenplumExternalTableManager extends PostgreTableManager {
    protected GreenplumExternalTable createDatabaseObject(@NotNull DBRProgressMonitor monitor,
                                                          @NotNull DBECommandContext context,
    @Override
                .append((CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE" : ""));
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
    public DBSObjectCache<PostgreTableContainer, PostgreTableBase> getObjectsCache(PostgreTableBase object) {

    @Override
                                                DBCExecutionContext executionContext, List<DBEPersistAction> actions,
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreTableManager;
 *
                                                StructCreateCommand command,


    @Override
    <T extends PostgreTableBase> SQLDatabasePersistAction createDeleteAction(T table, Map<String, Object> options) {
import org.jkiss.code.NotNull;


import org.jkiss.utils.CommonUtils;
                                          @NotNull Map<String, Object> options) {

 * you may not use this file except in compliance with the License.
    @Nullable
    protected String getCreateTableType(PostgreTableBase table) {
    }
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
package org.jkiss.dbeaver.ext.greenplum.edit;
 * DBeaver - Universal Database Manager
        StringBuilder dropTableScript = new StringBuilder("DROP EXTERNAL TABLE ")
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return externalTable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                                                Map<String, Object> options) throws DBException {
 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *
