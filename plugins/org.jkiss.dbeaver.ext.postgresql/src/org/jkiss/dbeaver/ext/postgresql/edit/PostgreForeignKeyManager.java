    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PostgreTableForeignKey fk = command.getObject();
    }
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            decl.append(" MATCH FULL");
 *
    @Override
        /*if (fk.isPersisted()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    monitor,
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTable;

            PostgreConstraintManager.addConstraintCommentAction(actions, command.getObject());

import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLForeignKeyManager;
            DBSForeignKeyModifyRule.NO_ACTION,
            DBSForeignKeyModifyRule.NO_ACTION);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBSObjectCache<? extends DBSObject, PostgreTableForeignKey> getObjectsCache(PostgreTableForeignKey object)
        addObjectDeleteActions(monitor, executionContext, actionList, new ObjectDeleteCommand(command.getObject(), command.getTitle()), options);
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableForeignKey;
            sql.append(" INITIALLY DEFERRED");
/*
    public StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, PostgreTableBase owner, DBECommandAbstract<PostgreTableForeignKey> command, Map<String, Object> options) {

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
 */
        return "ALTER TABLE " + PATTERN_ITEM_TABLE + " DROP CONSTRAINT " + PATTERN_ITEM_CONSTRAINT; //$NON-NLS-1$ //$NON-NLS-2$
        super.appendUpdateDeleteRule(foreignKey, decl);
        return foreignKey;
        }
            sql.append(" DEFERRABLE");
        }*/
                        "ALTER TABLE " + foreignKey.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + //$NON-NLS-1$
    }
 * DBeaver - Universal Database Manager
import java.util.List;
                if (!CommonUtils.isEmpty(constrDDL)) {
    protected void appendUpdateDeleteRule(PostgreTableForeignKey foreignKey, StringBuilder decl) {
 * limitations under the License.
        if (foreignKey.getMatchType().equals(PostgreTableForeignKey.MatchType.f)) {
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
    }
        if (parent instanceof PostgreTable) {
}
    @Override
    {
    }
        if (fk.isDeferrable()) {
                log.warn("Can't extract FK DDL", e);

    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            } catch (DBException e) {
        StringBuilder sql = super.getNestedDeclaration(monitor, owner, command, options);
                                " TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
        return object.getDataSource().getServerType().supportsKeyAndIndexRename();

    public boolean canRenameObject(PostgreTableForeignKey object) {
                    Collections.singletonMap(DBPScriptObject.OPTION_EMBEDDED_SOURCE, true));
    @Override
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
import org.jkiss.dbeaver.DBException;
    @Override

 *
        processObjectRename(commandContext, object, options, newName);
import java.util.Map;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTableForeignKey object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    protected String getDropForeignKeyPattern(PostgreTableForeignKey foreignKey)
import org.jkiss.code.Nullable;
        }
    protected PostgreTableForeignKey createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container, Object from, @NotNull Map<String, Object> options)
 */
        }
                        "Rename constraint",
 * you may not use this file except in compliance with the License.
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreTableForeignKey, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
        actions.add(
import org.jkiss.dbeaver.model.DBPEvaluationContext;

        final PostgreTableBase parent = object.getParentObject();
    @Override
    }


public class PostgreForeignKeyManager extends SQLForeignKeyManager<PostgreTableForeignKey, PostgreTableBase> implements DBEObjectRenamer<PostgreTableForeignKey> {
        foreignKey.setName(getNewConstraintName(monitor, foreignKey));
            }
        );
                }
    }
        }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
        addObjectCreateActions(monitor, executionContext, actionList, makeCreateCommand(command.getObject(), options), options);
    {
import org.jkiss.dbeaver.model.DBUtils;
package org.jkiss.dbeaver.ext.postgresql.edit;
        }
 * Unless required by applicable law or agreed to in writing, software
/**
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;

        PostgreTableBase table = (PostgreTableBase) container;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;


 * Postgre foreign key manager
    {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    {
            try {
        PostgreTableForeignKey foreignKey = command.getObject();
            //Foreign key match types: f = full, p = partial (not implemented yet), s = simple (u == s in old PG versions - default value)
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
 * See the License for the specific language governing permissions and
        if (fk.isDeferred()) {
import org.jkiss.code.NotNull;
        final PostgreTableForeignKey foreignKey = new PostgreTableForeignKey(
            return ((PostgreTable) parent).getForeignKeyCache();
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException
    }
 * You may obtain a copy of the License at


                    return new StringBuilder(constrDDL);
 * Licensed under the Apache License, Version 2.0 (the "License");
                                " RENAME CONSTRAINT " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + //$NON-NLS-1$
        return sql;
    @Nullable
    @Override
                String constrDDL = fk.getObjectDefinitionText(
                new SQLDatabasePersistAction(
        PostgreDataSource dataSource = foreignKey.getDataSource();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
            null,
    }
            table,
