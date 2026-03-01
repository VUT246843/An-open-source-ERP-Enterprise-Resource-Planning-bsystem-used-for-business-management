import java.util.Map;
    public boolean canEditObject(@NotNull GenericUniqueKey object) {
        return GenericUtils.canAlterTable(object);
    }
import java.util.List;
    }

    @Override
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    }
        @NotNull ObjectCreateCommand command,
 */
            null,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 * You may obtain a copy of the License at
                        " ADD CONSTRAINT " + DBUtils.getQuotedIdentifier(key) + " CHECK (" + check.getCheckConstraintDefinition() + ")"

        return tableBase.getDataSource().getMetaModel().createConstraintImpl(
    @Override
            && GenericUtils.canAlterTable((GenericTable) container);

    protected void appendConstraintDefinition(StringBuilder decl, DBECommandAbstract<GenericUniqueKey> command) {
        @NotNull DBCExecutionContext executionContext,
            tableBase,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                    ModelMessages.model_jdbc_create_new_constraint,
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            && (!(((GenericTable) container).getDataSource().getInfo() instanceof GenericDataSourceInfo) || ((GenericDataSourceInfo) ((GenericTable) container).getDataSource().getInfo()).supportsTableConstraints())
                ));
 *

import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
        return (container instanceof GenericTable)
/*
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (object.getConstraintType() == DBSEntityConstraintType.CHECK && (object instanceof DBSTableCheckConstraint check)) {
        }
    @Nullable
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            GenericConstants.BASE_CONSTRAINT_NAME,
    }

 * Generic constraint manager
    ) {
        final Object container,
    {
    ) {
 * DBeaver - Universal Database Manager
    protected GenericUniqueKey createDatabaseObject(
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (key.getConstraintType() == DBSEntityConstraintType.CHECK && (key instanceof DBSTableCheckConstraint check)) {
public class GenericPrimaryKeyManager extends SQLConstraintManager<GenericUniqueKey, GenericTableBase> {
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
    protected void addObjectCreateActions(
        GenericUniqueKey key = command.getObject();
}
        GenericUniqueKey object = command.getObject();
        return GenericUtils.isLegacySQLDialect(owner);
 */

 * See the License for the specific language governing permissions and
            super.addObjectCreateActions(monitor, executionContext, actions, command, options);
 * limitations under the License.
    public boolean canDeleteObject(@NotNull GenericUniqueKey object) {
    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLConstraintManager;
        Object from,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.messages.ModelMessages;
    @Override
    @Override
            super.appendConstraintDefinition(decl, command);
 * distributed under the License is distributed on an "AS IS" BASIS,
        GenericTableBase tableBase = (GenericTableBase)container;
            false);
/**
        }
        @NotNull DBRProgressMonitor monitor,

 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
package org.jkiss.dbeaver.ext.generic.edit;
        @NotNull Map<String, Object> options

    }
import org.jkiss.dbeaver.ext.generic.model.*;

 *
                new SQLDatabasePersistAction(
            DBSEntityConstraintType.PRIMARY_KEY,
            decl.append("(").append(check.getCheckConstraintDefinition()).append(")");
                    "ALTER TABLE " + key.getParentObject().getFullyQualifiedName(DBPEvaluationContext.DDL) +
 *
            actions.add(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return object.getParentObject().getContainer().getConstraintKeysCache();
        @NotNull Map<String, Object> options
    }

    protected boolean isLegacyConstraintsSyntax(GenericTableBase owner) {
        @NotNull DBECommandContext context,
        } else {
import org.jkiss.dbeaver.ext.generic.GenericConstants;
        @NotNull DBRProgressMonitor monitor,
    public DBSObjectCache<? extends DBSObject, GenericUniqueKey> getObjectsCache(GenericUniqueKey object)
        return GenericUtils.canAlterTable(object);
