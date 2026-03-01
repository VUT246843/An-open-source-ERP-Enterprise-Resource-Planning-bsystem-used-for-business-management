                }
                    actionList.add(new SQLDatabasePersistActionComment(
        return !SQLServerUtils.isTableType(object) && super.canDeleteObject(object);
                table.getDatabase(),

import java.util.List;
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
        }
                "EXEC " + SQLServerUtils.getSystemTableName(object.getDatabase(), "sp_rename") +
        if (command.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null) {
                if (table.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_EXTRA_DDL_INFO)) {
                    ));

        actions.add(
}
import org.jkiss.dbeaver.DBException;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.DBUtils;
                for (SQLServerExtendedProperty extendedProperty : extendedProperties) {
import org.jkiss.dbeaver.model.DBConstants;
                    " N'" + object.getSchema().getFullyQualifiedName(DBPEvaluationContext.DML) + "." + DBUtils.getQuotedIdentifier(object.getDataSource(), command.getOldName()) +
import org.jkiss.dbeaver.model.DBPScriptObject;
            actionList.add(

 *
            final Collection<SQLServerExtendedProperty> extendedProperties = new ArrayList<>(table.getExtendedProperties(monitor));
                        " 'MS_Description', " + SQLUtils.quoteString(table, table.getDescription()) + "," +
 *
            boolean isUpdate = SQLServerUtils.isCommentSet(
import java.util.Collection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        final OBJECT table = command.getObject();
    }
                    "', " + SQLUtils.quoteString(object.getDataSource(), command.getNewName()) + ", 'OBJECT'")
                        extendedProperty.getObjectDefinitionText(monitor, DBPScriptObject.EMPTY_OPTIONS)
 * limitations under the License.
    @Override
                        " '" + (table.isView() ? "view" : "table") + "', " + SQLUtils.quoteString(table, table.getName())));
                    ));
 * SQLServer table manager
    @Override
                "Rename table",
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS)) {
    @Override
/*
import org.jkiss.dbeaver.model.sql.SQLUtils;
            new SQLDatabasePersistAction(
        }
    }
                    "EXEC " + SQLServerUtils.getSystemTableName(table.getDatabase(), isUpdate ? "sp_updateextendedproperty" : "sp_addextendedproperty") +
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        "Extended properties"
import org.jkiss.dbeaver.ModelPreferences;

import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return !SQLServerUtils.isTableType(object) && super.canEditObject(object);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                SQLServerObjectClass.OBJECT_OR_COLUMN,

                }
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
                table.getObjectId(),
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        return (DBSObjectCache) object.getSchema().getTableCache();
 * you may not use this file except in compliance with the License.
/**
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.ext.mssql.model.*;
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull NestedObjectCommand<OBJECT, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
            }

    public boolean canDeleteObject(@NotNull OBJECT object) {
                        "Add extended property",
            for (SQLServerTableColumn attribute : CommonUtils.safeCollection(table.getAttributes(monitor))) {
    }
                new SQLDatabasePersistAction(
 *     http://www.apache.org/licenses/LICENSE-2.0
        OBJECT object = command.getObject();
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                    "Add table comment",
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                monitor,

                    actionList.add(new SQLDatabasePersistAction(
                        " 'schema', " + SQLUtils.quoteString(table, table.getSchema().getName()) + "," +
import org.jkiss.code.NotNull;

import java.util.Map;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
    {
    public DBSObjectCache<SQLServerSchema, OBJECT> getObjectsCache(OBJECT object) {
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
import org.jkiss.utils.CommonUtils;
            if (!extendedProperties.isEmpty()) {
 *
public abstract class SQLServerBaseTableManager<OBJECT extends SQLServerTableBase> extends SQLTableManager<OBJECT, SQLServerSchema> implements DBEObjectRenamer<OBJECT> {
                        table.getDataSource(),
                extendedProperties.addAll(attribute.getExtendedProperties(monitor));
            }
    }
        );

package org.jkiss.dbeaver.ext.mssql.edit;
 * See the License for the specific language governing permissions and
                0);
    public boolean canEditObject(@NotNull OBJECT object) {
