        processObjectRename(commandContext, object, options, newName);
            true,
                        " MODIFY CONSTRAINT " + constraint.getName() + " " +
    @Override

    }
        Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
        ExasolTableForeignKey object) {
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            new SQLDatabasePersistAction(
                        (constraint.getEnabled() ? ExasolConstants.KEYWORD_ENABLE : ExasolConstants.KEYWORD_DISABLE)
        return foreignKey;
    protected void processObjectRename(DBECommandContext commandContext, ExasolTableForeignKey object, Map<String, Object> options, String newName) throws DBException {
    public void renameObject(@NotNull DBECommandContext commandContext,
    extends SQLForeignKeyManager<ExasolTableForeignKey, ExasolTable> implements DBEObjectRenamer<ExasolTableForeignKey> {
import org.jkiss.dbeaver.DBException;
            )

    protected ExasolTableForeignKey createDatabaseObject(
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    protected String getDropForeignKeyPattern(ExasolTableForeignKey constraint) {
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
            null,
import org.jkiss.dbeaver.model.DBUtils;
                                          @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
        final ExasolTableForeignKey key = command.getObject();
            actions.add(new SQLDatabasePersistAction("Create Foreign Key", ExasolUtils.getFKDdl(key, monitor)));
                    + DBUtils.getQuotedIdentifier(key.getDataSource(), command.getOldName()) + " to " +
                new SQLDatabasePersistAction("Alter FK",
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,

import org.jkiss.dbeaver.model.DBConstants;
    @Override
        try {
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
import java.util.Map;
            log.error(e.getMessage());
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
                "Rename FK",
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
        actions.add(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ExasolTable table = (ExasolTable) container;
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
    }
    }


import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            table,
        ObjectRenameCommand command = new ObjectRenameCommand(object, ModelMessages.model_jdbc_rename_object, options, newName);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * See the License for the specific language governing permissions and

    public DBSObjectCache<? extends DBSObject, ExasolTableForeignKey> getObjectsCache(
        }
                             @NotNull ExasolTableForeignKey object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,

        );
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            log.error("Could not created DDL for Exasol FK: " + key.getFullyQualifiedName(DBPEvaluationContext.DDL));
                "ALTER TABLE " + DBUtils.getObjectFullName(key.getTable(), DBPEvaluationContext.DDL) + " RENAME CONSTRAINT "
        );
                )
        return parent.getContainer().getAssociationCache();
 * limitations under the License.
    @Override
 * DBeaver - Universal Database Manager
        final ExasolTableForeignKey foreignKey = new ExasolTableForeignKey(
 * you may not use this file except in compliance with the License.
                                          @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {

            );

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            + DBUtils.getQuotedIdentifier(constraint)
            actionList.add(
    }
    }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

        final ExasolTable parent = object.getParentObject();
        final ExasolTableForeignKey key = command.getObject();
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
public class ExasolForeignKeyManager

            ;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
    @Override

                                          @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {

    }
        foreignKey.setName(getNewConstraintName(monitor, foreignKey));

import org.jkiss.code.NotNull;
    @Override
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        } catch (DBException e) {
                    DBUtils.getQuotedIdentifier(key.getDataSource(), command.getNewName())
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableForeignKey;
/*

    }
        }
        commandContext.addCommand(command, new RenameObjectReflector(), true);
package org.jkiss.dbeaver.ext.exasol.manager;

                    "ALTER TABLE " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) +
import org.jkiss.dbeaver.model.struct.DBSObject;


        final ExasolTableForeignKey constraint = command.getObject();
    @Override
            "FK"
import java.util.List;
        return "ALTER TABLE " + DBUtils.getObjectFullName(constraint.getTable(), DBPEvaluationContext.DDL) + " DROP CONSTRAINT "
    }
        if (command.getProperties().containsKey(DBConstants.PROP_ID_ENABLED)) {
 *
