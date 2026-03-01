    @Nullable
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableForeign;
import org.jkiss.dbeaver.model.edit.DBECommandContext;


        StringBuilder dropTableScript = new StringBuilder("DROP ")
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        return new SQLDatabasePersistAction(ModelMessages.model_jdbc_drop_table, dropTableScript.toString());
 * Greenplum table manager
 * See the License for the specific language governing permissions and
        return greenplumTable;
    }
                                          @NotNull ObjectDeleteCommand command,
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreTableManager;
        GreenplumTable greenplumTable = new GreenplumTable((PostgreSchema) container);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

 * Licensed under the Apache License, Version 2.0 (the "License");
    <T extends PostgreTableBase> SQLDatabasePersistAction createDeleteAction(T table, Map<String, Object> options) {
package org.jkiss.dbeaver.ext.greenplum.edit;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * limitations under the License.
                .append((CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE" : ""));
                .append("TABLE ")
    protected GreenplumTable createDatabaseObject(@NotNull DBRProgressMonitor monitor,
        actions.add(createDeleteAction(command.getObject(), options));
        return object.getContainer().getSchema().getTableCache();
                                                  @NotNull DBECommandContext context,
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableContainer;
/**
 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)
import java.util.List;
 *
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 */
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBSObjectCache<PostgreTableContainer, PostgreTableBase> getObjectsCache(PostgreTableBase object) {
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
                .append(table.getFullyQualifiedName(DBPEvaluationContext.DDL))
 *
    }

 */
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
    }
    @Override
import org.jkiss.code.NotNull;
                                          @NotNull Map<String, Object> options) {
public class GreenplumTableManager extends PostgreTableManager {
import org.jkiss.code.Nullable;
}

 * you may not use this file except in compliance with the License.
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
import java.util.Map;
    @Override
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

                                                  Object copyFrom, @NotNull Map<String, Object> options) {
        setNewObjectName(monitor, (PostgreSchema) container, greenplumTable);
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
                .append((table instanceof PostgreTableForeign ? "FOREIGN " : ""))
                                                  Object container,
    @Override
import org.jkiss.dbeaver.ext.greenplum.model.GreenplumTable;
