        if (CommonUtils.isEmpty(object.getName())) {
            tableType = view.getTableTypeName();
import org.jkiss.dbeaver.DBException;

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import java.util.List;

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        );

import org.jkiss.dbeaver.model.edit.DBECommandContext;
        // Source may be empty if it wasn't yet read. Then it definitely wasn't changed
 * limitations under the License.
            sqlBuf.append("CREATE ");
            if (!(view instanceof PostgreMaterializedView)) {

import java.util.Map;
            }
    }
 *
        } else {
        PostgreViewBase view = (PostgreViewBase) command.getObject();
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            sql = sqlBuf.toString();
                    + "." + DBUtils.getQuotedIdentifier(view.getDataSource(), command.getOldName()) +
    }
    }
            new SQLDatabasePersistAction("Create view", sql));
            appendViewDeclarationPostfix(monitor, sqlBuf, view);
import java.util.Locale;
        return SQLTableManager.BASE_VIEW_NAME;
    protected void createOrReplaceViewQuery(DBRProgressMonitor monitor, List<DBEPersistAction> actions, PostgreViewBase view, Map<String, Object> options) throws DBException {
    @Override
                "Rename view",
import org.jkiss.utils.ArrayUtils;
 */

    @Override
                "ALTER " + tableType + " " + DBUtils.getQuotedIdentifier(view.getSchema()) //$NON-NLS-1$
    @NotNull
            throw new DBException("View name cannot be empty");

    public void appendViewDeclarationPostfix(DBRProgressMonitor monitor, StringBuilder sqlBuf, PostgreViewBase view) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            createOrReplaceViewQuery(monitor, actionList, (PostgreViewBase) command.getObject(), options);
    }
        }
 * See the License for the specific language governing permissions and
    @Nullable
        if (!command.hasProperty(DBConstants.PROP_ID_DESCRIPTION) || command.getProperties().size() > 1) {
            new SQLDatabasePersistAction(
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreTableBase, PropertyHandler> command, @NotNull Map<String, Object> options) {
            StringBuilder sqlBuf = new StringBuilder();
        String tableType;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        PostgreSchema schema = (PostgreSchema) container;
    protected PostgreViewBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
            tableType = "TABLE"; //$NON-NLS-1$
    @Override
            sqlBuf.append("\nWITH(").append(String.join(",", relOptions)).append(")");

        PostgreViewBase view = (PostgreViewBase) command.getObject();
}
                "Drop view",
 * you may not use this file except in compliance with the License.
        return CHILD_TYPES;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    }
    @Override
 */
                sqlBuf.append("OR REPLACE ");
        );
            actions.add(new SQLDatabasePersistAction(
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
        processObjectRename(commandContext, object, options, newName);


    @Override
package org.jkiss.dbeaver.ext.postgresql.edit;
import org.jkiss.code.Nullable;
        return object.getContainer().getSchema().getTableCache();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
            createOrReplaceViewQuery(monitor, actions, (PostgreViewBase) command.getObject(), options);
        actions.add(
            monitor, schema, PostgreClass.RelKind.v, null);
    @Override
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
                "Comment view",
        if (!sql.toLowerCase(Locale.ENGLISH).contains("create")) {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {

                "COMMENT ON " + viewBase.getTableTypeName() + " " + viewBase.getFullyQualifiedName(DBPEvaluationContext.DDL) +

import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.ext.postgresql.model.*;
            new SQLDatabasePersistAction(
        actions.add(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public Class<? extends DBSObject>[] getChildTypes() {
        String[] relOptions = view.getRelOptions();
        PostgreTableBase object = command.getObject();
        return newView;
    @Override
    public void appendViewDeclarationPrefix(DBRProgressMonitor monitor, StringBuilder sqlBuf, PostgreViewBase view) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.sql.SQLUtils;
        actions.add(
        if (view.getDataSource().getServerType().supportsAlterTableForViewRename()) {
        PostgreView newView = (PostgreView) schema.getDataSource().getServerType().createNewRelation(
        PostgreViewBase viewBase = (PostgreViewBase) command.getObject();
/*
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        PostgreTableColumn.class);
/**
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.code.NotNull;
        }
 * DBeaver - Universal Database Manager

    {
        String sql = view.getObjectDefinitionText(monitor, Map.of());
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
        }
        if (!command.hasProperty(DBConstants.PROP_ID_DESCRIPTION) || command.getProperties().size() > 1) {
    @Override

    }
    @Override

 *
                    " IS " + SQLUtils.quoteString(viewBase, CommonUtils.notEmpty(viewBase.getDescription()))));
            sqlBuf.append("\nAS ").append(sql);
    public DBSObjectCache<PostgreTableContainer, PostgreTableBase> getObjectsCache(PostgreTableBase object) {
            sqlBuf.append(view.getTableTypeName()).append(" ").append(DBUtils.getObjectFullName(view, DBPEvaluationContext.DDL));
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
                    " " + view.getFullyQualifiedName(DBPEvaluationContext.DDL) +
                    (CommonUtils.getOption(options, OPTION_DELETE_CASCADE) ? " CASCADE" : ""))
                    " RENAME TO " + DBUtils.getQuotedIdentifier(view.getDataSource(), command.getNewName())) //$NON-NLS-1$
 * You may obtain a copy of the License at
    }

            appendViewDeclarationPrefix(monitor, sqlBuf, view);
public class PostgreViewManager extends PostgreTableManagerBase implements DBEObjectRenamer<PostgreTableBase> {

import org.jkiss.utils.CommonUtils;
        setNewObjectName(monitor, schema, newView);
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
        if (!ArrayUtils.isEmpty(relOptions)) {
        }
 * PostgreViewManager

    }
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
        }

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
        }
    protected String getBaseObjectName() {
import org.jkiss.dbeaver.model.DBUtils;
        throws DBException
 *

                "DROP " + view.getTableTypeName() +

    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    }
