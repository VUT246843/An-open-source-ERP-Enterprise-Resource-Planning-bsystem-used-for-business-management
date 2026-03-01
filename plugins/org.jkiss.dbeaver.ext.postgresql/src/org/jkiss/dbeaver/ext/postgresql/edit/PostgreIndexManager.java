import org.jkiss.code.NotNull;
        return new PostgreIndex(
    @Override

                        "Rename index",
    @Override
    }
        DBSIndexType indexType = index.getIndexType();
    public boolean canRenameObject(PostgreIndex object) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
    protected String getDropIndexPattern(PostgreIndex index)
    {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    hasDDL = true;
    {
}
    @Override
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
    protected PostgreIndex createDatabaseObject(
    protected void appendIndexTypeAfterOn(PostgreIndex index, StringBuilder decl) {
                log.warn("Can't extract index DDL", e);
 * DBeaver - Universal Database Manager

                        "ALTER INDEX " + DBUtils.getQuotedIdentifier(index.getTable().getContainer()) + "." + //$NON-NLS-1$
    }

    private static void addIndexCommentAction(List<DBEPersistAction> actions, PostgreIndex index) {
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ext.postgresql.model.*;
    @Override
        }
import org.jkiss.utils.CommonUtils;
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull PostgreIndex object, @NotNull Map<String, Object> options) throws DBException {

            "COMMENT ON INDEX " + index.getFullyQualifiedName(DBPEvaluationContext.DDL) +
 *
        boolean hasDDL = false;
            throw new DBException("You can not drop constraint-based unique index.\n" +
    }
                decl.append(" ").append(operatorClass.getName());
    }
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    public DBSObjectCache<PostgreTableContainer, PostgreIndex> getObjectsCache(PostgreIndex object)
            }
        if(indexType == DBSIndexType.HASHED){
    @Override
        try {
                new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ext.postgresql.edit;
            final PostgreOperatorClass operatorClass = ((PostgreIndexColumn) indexColumn).getOperatorClass(monitor);
import org.jkiss.dbeaver.model.DBUtils;
            DBSIndexType.UNKNOWN,
            "Comment index",
        processObjectRename(commandContext, object, options, newName);
                        new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_index, indexDDL)
                    actions.add(
            if (operatorClass != null) {

 * limitations under the License.
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (index.isPersisted()) {
/**
                if (!CommonUtils.isEmpty(indexDDL)) {
            decl.append(" USING ").append("HASH");
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.dbeaver.model.messages.ModelMessages;
/*
        }
        if (object.isPrimaryKeyIndex()) {
    }
        }
        PostgreIndex index = command.getObject();
        return object.getDataSource().getServerType().supportsKeyAndIndexRename();
        actions.add(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
            try {
        }
 */
            "NewIndex",
 *
        Object from, @NotNull Map<String, Object> options)
    @Nullable
        }


    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreIndex object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
 * See the License for the specific language governing permissions and
        );
                String indexDDL = index.getObjectDefinitionText(monitor, DBPScriptObject.EMPTY_OPTIONS);
            tableBase,
    @Override
        return object.getTable().getContainer().getSchema().getIndexCache();
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
            log.warn(e);
            false);
            }
                                DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) +

                    );
 * Copyright (C) 2010-2024 DBeaver Corp and others
            decl.append(" DESC"); //$NON-NLS-1$
        return "DROP INDEX " + PATTERN_ITEM_INDEX; //$NON-NLS-1$

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    {
        actions.add(new SQLDatabasePersistAction(
import java.util.List;
                                " RENAME TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
        super.deleteObject(commandContext, object, options);
                " IS " + SQLUtils.quoteString(index, index.getDescription())));
        PostgreDataSource dataSource = index.getDataSource();
                }
    @Override
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
        }
 * Postgre index manager
import java.util.Map;
    }
 */
            super.addObjectCreateActions(monitor, executionContext, actions, command, options);
        if (!hasDDL) {
        }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
public class PostgreIndexManager extends SQLIndexManager<PostgreIndex, PostgreTableBase> implements DBEObjectRenamer<PostgreIndex> {
    }

        if (!CommonUtils.isEmpty(index.getDescription())) {
    protected void appendIndexColumnModifiers(DBRProgressMonitor monitor, StringBuilder decl, DBSTableIndexColumn indexColumn) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (DBException e) {
        PostgreTableBase tableBase = (PostgreTableBase) container;
            addIndexCommentAction(actions, index);
                "Try to drop constraint '" + object.getName() + "'.");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        if (!indexColumn.isAscending()) {
    }
        PostgreIndex index = command.getObject();
            } catch (DBException e) {

 *


import org.jkiss.dbeaver.model.DBPEvaluationContext;
