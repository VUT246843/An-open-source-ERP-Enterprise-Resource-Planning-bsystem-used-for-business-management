    public boolean canEditObject(GenericSynonym object) {
        }
        query.append(" FOR ").append(DBUtils.getQuotedIdentifier(synonym.getDataSource(), CommonUtils.notEmpty(synonym.getTargetObject())));
        @NotNull DBRProgressMonitor monitor,
        if (!((CubridDataSource) object.getDataSource()).isShard()) {
        @NotNull DBRProgressMonitor monitor,
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
package org.jkiss.dbeaver.ext.cubrid.edit;
        return FEATURE_EDITOR_ON_CREATE;
    ) {
            "Rename Synonym",
    }
    @Override
        @NotNull DBCExecutionContext executionContext,
        actions.add(new SQLDatabasePersistAction(
    public DBSObjectCache<? extends DBSObject, GenericSynonym> getObjectsCache(GenericSynonym object) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
            "Drop Synonym",
        @NotNull DBCExecutionContext executionContext,
    implements DBEObjectRenamer<GenericSynonym> {
        return query.toString();
 *
    @Override
import java.util.Map;
        @NotNull Map<String, Object> options
    public boolean canCreateObject(@NotNull Object container) {
        return new CubridSynonym((GenericStructContainer) container, BASE_SYNONYM_NAME);
        @NotNull ObjectDeleteCommand command,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    @Override
    }
        return !((CubridDataSource) object.getDataSource()).isShard();
    @Override

import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}
 * Unless required by applicable law or agreed to in writing, software
    ) {


    }
        @NotNull List<DBEPersistAction> actions,

    @Override
    protected CubridSynonym createDatabaseObject(
    }
        @NotNull DBRProgressMonitor monitor,
        }
            "RENAME SYNONYM " + schemaName + DBUtils.getQuotedIdentifier(synonym.getDataSource(), command.getOldName())
        @NotNull String newName

 * limitations under the License.

    public void renameObject(
 * distributed under the License is distributed on an "AS IS" BASIS,
public class CubridSynonymManager extends SQLObjectEditor<GenericSynonym, GenericStructContainer>
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectDeleteActions(
        return !dataSource.isShard();
    @Override
        CubridSynonym synonym = (CubridSynonym) command.getObject();
        CubridUser user = (CubridUser) container;
        CubridSynonym synonym = (CubridSynonym) command.getObject();
    public boolean canDeleteObject(GenericSynonym object) {
        @NotNull DBECommandContext context,
    @Override
        }
 * You may obtain a copy of the License at
import java.util.List;
        query.append(synonym.getFullyQualifiedName(DBPEvaluationContext.DDL));
    @Override
    @Override

        return !((CubridDataSource) object.getDataSource()).isShard();
    protected void addObjectModifyActions(
        StringBuilder query = new StringBuilder();
/*
    ) {
        @NotNull Map<String, Object> options
        @NotNull GenericSynonym object,
    }

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            return container.getSynonymCache();
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.ext.cubrid.model.CubridDataSource;

        @NotNull DBRProgressMonitor monitor,
    }
    public static final String BASE_SYNONYM_NAME = "new_synonym";
        @NotNull List<DBEPersistAction> actions,
        ));
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        return null;
import org.jkiss.dbeaver.ext.cubrid.model.CubridSynonym;
        @NotNull ObjectChangeCommand command,
        CubridDataSource dataSource = (CubridDataSource) user.getDataSource();

        CubridSynonym synonym = (CubridSynonym) command.getObject();
        actions.add(new SQLDatabasePersistAction("Modify Serial", buildStatement(command, false)));
import org.jkiss.dbeaver.ext.cubrid.model.CubridUser;
import org.jkiss.dbeaver.ext.generic.model.GenericObjectContainer;
    ) throws DBException {
        @Nullable Object container,
        DBSObject parentObject = object.getParentObject();
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
 */
    public String buildStatement(
        @NotNull Map<String, Object> options
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 *
            processObjectRename(commandContext, object, options, newName);
    protected void addObjectRenameActions(
        if ((!synonym.isPersisted() && synonym.getDescription() != null) || command.hasProperty("description")) {
        @NotNull DBRProgressMonitor monitor,
        actions.add(new SQLDatabasePersistAction("Create Synonym", buildStatement(command, true)));
        boolean isCreate
        @NotNull Map<String, Object> options

    }
        @NotNull List<DBEPersistAction> actions,
    }
    protected void addObjectCreateActions(
    ) {
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
        @NotNull ObjectRenameCommand command,
        String schemaName = DBUtils.getQuotedIdentifier(synonym.getOwner()) + ".";

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;


        @Nullable Object copyFrom,
        @NotNull DBCExecutionContext executionContext,
        @NotNull Map<String, Object> options,

            + " TO " + schemaName + DBUtils.getQuotedIdentifier(synonym.getDataSource(), command.getNewName())
        @NotNull DBECommandContext commandContext,
        if (parentObject instanceof GenericObjectContainer container) {
 *
import org.jkiss.code.Nullable;
        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
            "DROP SYNONYM " + synonym.getFullyQualifiedName(DBPEvaluationContext.DDL)
 * DBeaver - Universal Database Manager
        ));
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull NestedObjectCommand command,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
    }

    ) {
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Map<String, Object> options
    @Override
        query.append(isCreate ? "CREATE SYNONYM " : "ALTER SYNONYM ");
            query.append(" COMMENT ").append(SQLUtils.quoteString(synonym, CommonUtils.notEmpty(synonym.getDescription())));
import org.jkiss.utils.CommonUtils;
        @NotNull ObjectCreateCommand command,
    public boolean canRenameObject(GenericSynonym object) {
    }
    ) {
import org.jkiss.code.NotNull;
    }
        actions.add(new SQLDatabasePersistAction(
        return !((CubridDataSource) object.getDataSource()).isShard();
        @NotNull List<DBEPersistAction> actions,
    }
