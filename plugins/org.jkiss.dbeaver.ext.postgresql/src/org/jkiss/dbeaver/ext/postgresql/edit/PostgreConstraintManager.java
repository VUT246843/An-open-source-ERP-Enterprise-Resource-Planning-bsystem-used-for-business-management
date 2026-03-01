    @Override
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
        PostgreTableConstraintBase<?> constr = command.getObject();
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ext.postgresql.model.*;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.sql.SQLUtils;
        final Object container,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        Object from,
        @NotNull ObjectRenameCommand command,

    }

    public boolean canRenameObject(PostgreTableConstraintBase<?> object) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                    return new StringBuilder(constrDDL);
            } catch (DBException e) {
                String constrDDL = constr.getObjectDefinitionText(
import org.jkiss.dbeaver.model.DBUtils;
                }
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        @NotNull DBECommandContext context,
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }

    {
                new SQLDatabasePersistAction(
        if (constr.isPersisted()) {
        @NotNull DBCExecutionContext executionContext,
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTableConstraintBase<?> object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
                        "Rename constraint",
 * Unless required by applicable law or agreed to in writing, software
    {
        processObjectRename(commandContext, object, options, newName);
/**

    }
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

    }
 */
import java.util.List;
            }
            try {
                        "ALTER TABLE " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + //$NON-NLS-1$
    public StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, PostgreTableBase owner, DBECommandAbstract<PostgreTableConstraintBase<?>> command, Map<String, Object> options) {
        return object.getDataSource().getServerType().supportsKeyAndIndexRename();
    @Override
import org.jkiss.dbeaver.DBException;
                                " TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
    }
                                " RENAME CONSTRAINT " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + //$NON-NLS-1$
        return "ALTER TABLE " + PATTERN_ITEM_TABLE + " DROP CONSTRAINT " + PATTERN_ITEM_CONSTRAINT; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
                    monitor,
            super.appendConstraintDefinition(decl, command);
 * See the License for the specific language governing permissions and


        );
 *

        }
        actions.add(
        @NotNull List<DBEPersistAction> actions,
            "COMMENT ON CONSTRAINT " + DBUtils.getQuotedIdentifier(constr) + " ON " + constr.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) +
                    Collections.singletonMap(DBPScriptObject.OPTION_EMBEDDED_SOURCE, true));
                if (!CommonUtils.isEmpty(constrDDL)) {
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
    @Override
        @NotNull Map<String, Object> options
import org.jkiss.utils.CommonUtils;
    public DBSObjectCache<PostgreTableContainer, PostgreTableConstraintBase<?>> getObjectsCache(PostgreTableConstraintBase<?> object) {
    @Override
import java.util.Map;
 * You may obtain a copy of the License at
        }
public class PostgreConstraintManager extends SQLConstraintManager<PostgreTableConstraintBase<?>, PostgreTableBase> implements DBEObjectRenamer<PostgreTableConstraintBase<?>> {
import org.jkiss.code.Nullable;
            "Comment sequence",
}
    }
            decl.append(" (").append(((PostgreTableConstraint) command.getObject()).getSource()).append(")");
        @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.DBPScriptObject;
    }
            addConstraintCommentAction(actionList, command.getObject());
    static void addConstraintCommentAction(List<DBEPersistAction> actionList, PostgreTableConstraintBase<?> constr) {
import java.util.Collections;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Override
 */
 *
        }
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLConstraintManager;
    }
    protected void appendConstraintDefinition(StringBuilder decl, DBECommandAbstract<PostgreTableConstraintBase<?>> command) {
 * Postgre constraint manager
/*
        PostgreTableConstraintBase<?> constraint = command.getObject();
        return new PostgreTableConstraint((PostgreTableBase) container, "NewConstraint", DBSEntityConstraintType.UNIQUE_KEY);
    protected String getDropConstraintPattern(PostgreTableConstraintBase<?> constraint)
        PostgreDataSource dataSource = constraint.getDataSource();
    @Override
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.DBConstants;
        if (command.getObject().getConstraintType() == DBSEntityConstraintType.CHECK) {
    }
        actionList.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;

        } else {
        return object.getTable().getContainer().getSchema().getConstraintCache();
        return super.getNestedDeclaration(monitor, owner, command, options);
    protected void addObjectRenameActions(

    ) {
                " IS " + SQLUtils.quoteString(constr, constr.getDescription())));

package org.jkiss.dbeaver.ext.postgresql.edit;
 * DBeaver - Universal Database Manager
                log.warn("Can't extract constraint DDL", e);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    protected PostgreTableConstraintBase<?> createDatabaseObject(
 *
        @NotNull DBRProgressMonitor monitor,
    {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
