        return new SQLServerTableCheckConstraint((SQLServerTable) container);
        @NotNull DBCExecutionContext executionContext,
        @NotNull ObjectDeleteCommand command,
        @NotNull DBCExecutionContext executionContext,
 *
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.utils.CommonUtils;
            new SQLDatabasePersistAction(
 *     http://www.apache.org/licenses/LICENSE-2.0
        final SQLServerTableCheckConstraint constraint = command.getObject();

    @Override
 *
                "ALTER TABLE " + constraint.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL) +
 * you may not use this file except in compliance with the License.
    @Override
    }
    public boolean canCreateObject(@NotNull Object container) {
                    " CHECK (" + constraint.getCheckConstraintDefinition() + ")"
                ModelMessages.model_jdbc_drop_constraint,
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
        actions.add(
    protected void addObjectCreateActions(
    protected void addObjectDeleteActions(
        @NotNull Map<String, Object> options
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/**
        return FEATURE_EDITOR_ON_CREATE;
            throw new DBException("CHECK constraint definition is empty");
        @NotNull List<DBEPersistAction> actions,
        if (object.getConstraintType() == DBSEntityConstraintType.CHECK && CommonUtils.isEmpty(object.getCheckConstraintDefinition())) {
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        final SQLServerTableCheckConstraint constraint = command.getObject();
    }
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Map;
        Object from,
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.DBException;
    ) {

import org.jkiss.code.NotNull;
    }
    }
        @NotNull Map<String, Object> options
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.mssql.edit;
    @Override
    @Override
        @NotNull DBRProgressMonitor monitor,

                    " WITH NOCHECK" +
 * DBeaver - Universal Database Manager
        actions.add(
 */
        @NotNull DBRProgressMonitor monitor,
    }
    @Override
            ));
        SQLServerTableCheckConstraint object = command.getObject();
    }
        @NotNull Map<String, Object> options
        return object.getParentObject().getCheckConstraintCache();
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTable;
    ) {
                    " ADD CONSTRAINT " + DBUtils.getQuotedIdentifier(constraint) +
import java.util.List;
    @Nullable
 */
}

    public DBSObjectCache<? extends DBSObject, SQLServerTableCheckConstraint> getObjectsCache(SQLServerTableCheckConstraint object) {
import org.jkiss.dbeaver.model.DBPDataSource;
 * SQL server unique constraint manager
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableCheckConstraint;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
/*
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        final Object container,
import org.jkiss.code.Nullable;
        @NotNull ObjectCreateCommand command,
    protected SQLServerTableCheckConstraint createDatabaseObject(

    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
    @Override
 *
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
                "ALTER TABLE " + constraint.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL) +
                    " DROP CONSTRAINT " + DBUtils.getQuotedIdentifier(constraint)
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull List<DBEPersistAction> actions,
                ModelMessages.model_jdbc_create_new_constraint,
    ) {
    @Override

        return true;

import org.jkiss.dbeaver.model.edit.DBECommandContext;
public class SQLServerCheckConstraintManager extends SQLObjectEditor<SQLServerTableCheckConstraint, SQLServerTable> {
            new SQLDatabasePersistAction(
        @NotNull DBECommandContext context,
            ));


        }

