 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import java.util.List;

    }
        );
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
import org.jkiss.code.Nullable;
                                " RENAME TO " + DBUtils.getQuotedIdentifier(dataType.getDataSource(), command.getNewName())) //$NON-NLS-1$

    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import java.util.Map;
 * limitations under the License.
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBConstants;
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
        PostgreDataType dataType = command.getObject();
        processObjectRename(commandContext, object, options, newName);
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException {
    protected PostgreDataType createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean canCreateObject(@NotNull Object container) {
public class PostgreDataTypeManager extends SQLObjectEditor<PostgreDataType, PostgreSchema> implements DBEObjectRenamer<PostgreDataType> {
            actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
                    "COMMENT ON TYPE " + dataType.getFullyQualifiedName(DBPEvaluationContext.DDL) +
        return object.getParentObject().getDataTypeCache();

    @Override

import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @Override
import org.jkiss.dbeaver.DBException;

        return false;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;

    }
                new SQLDatabasePersistAction("Drop data type", "DROP TYPE " + command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)) //$NON-NLS-2$
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
 * you may not use this file except in compliance with the License.

    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<PostgreDataType, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
    public DBSObjectCache<? extends DBSObject, PostgreDataType> getObjectsCache(PostgreDataType object) {
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    @Override
 * You may obtain a copy of the License at
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull PostgreDataType object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
        PostgreDataType dataType = command.getObject();
        return FEATURE_SAVE_IMMEDIATELY;
        throw new DBCException("Not Implemented");
                    "Comment data type",

 * Copyright (C) 2010-2024 DBeaver Corp and others

        actions.add(
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

    }
                        "Rename data type",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException {
/*
                new SQLDatabasePersistAction(

    }
package org.jkiss.dbeaver.ext.postgresql.edit;
                        "ALTER TYPE " + dataType.getFullyQualifiedName(DBPEvaluationContext.DDL) + //$NON-NLS-1$
import org.jkiss.code.NotNull;
    @Nullable
    @Override
 */
 *
        actions.add(
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
    }
        );
 *
    }
}
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
        }
                            " IS " + SQLUtils.quoteString(dataType, CommonUtils.notEmpty(dataType.getDescription()))));

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
