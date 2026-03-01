    @Override
            return object.getAssociations(monitor);
        } else if (childType == MySQLTableForeignKey.class) {
        }
 * See the License for the specific language governing permissions and
        @NotNull DBRProgressMonitor monitor,
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
            if ((!table.isPersisted() || tableProps.getProperty("autoIncrement") != null) && additionalInfo.getAutoIncrement() > 0) { //$NON-NLS-1$
        appendTableModifiers(monitor, command.getObject(), command, query, true, options);
import java.util.Map;
 * MySQL table manager
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
        actionList.add(

    }
        return null;
        } else if (childType == MySQLTableIndex.class) {
        }
            }

        );
            additionalInfo.setCharset(catalog.getAdditionalInfo(monitor).getDefaultCharset());
 *
    @Override
        return CHILD_TYPES;
 *
            table.setName(getNewChildName(monitor, catalog, ((DBSEntity) copyFrom).getName()));
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            additionalInfo.setCollation(catalog.getAdditionalInfo(monitor).getDefaultCollation());
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public long getMakerOptions(@NotNull DBPDataSource dataSource) {
                    (alterTable ? " RENAME" : "") + " TO " + DBUtils.getQuotedIdentifier(command.getObject().getContainer()) //$NON-NLS-2$

import org.jkiss.dbeaver.model.edit.DBECommandContext;
        MySQLTableConstraint.class,
            throw new DBException("Can't create MySQL table from '" + copyFrom + "'");
    protected void appendTableModifiers(
        query.append(command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" "); //$NON-NLS-1$
import org.jkiss.dbeaver.model.struct.DBSEntity;
                additionalInfo.getCollation() != null
import org.jkiss.dbeaver.model.exec.DBCException;
                (alterTable ? "ALTER" : "RENAME") + " TABLE " + //$NON-NLS-3$
        MySQLTableIndex.class

        } catch (DBCException e) {
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
        return super.getMakerOptions(dataSource) | FEATURE_SUPPORTS_COPY;
/**
import org.jkiss.dbeaver.DBException;
                ddl.append(delimiter).append("COLLATE=").append(additionalInfo.getCollation().getName()); //$NON-NLS-1$

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull List<DBEPersistAction> actionList,
            ) {
    }

        @NotNull ObjectChangeCommand command,
            log.error(e);
                ddl.append(delimiter).append("ENGINE=").append(additionalInfo.getEngine().getName()); //$NON-NLS-1$
        }
                (!table.isPersisted() || tableProps.getProperty("charset") != null) && //$NON-NLS-1$
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
        return object.getContainer().getTableCache();

        @NotNull DBCExecutionContext executionContext,
        super.addStructObjectCreateActions(monitor, executionContext, actions, command, options);
    }
            final MySQLTableBase table = command.getObject();
        @NotNull Map<String, Object> options) {
            }

    @Override
        MySQLCatalog catalog = (MySQLCatalog) container;
        return table;

 * Unless required by applicable law or agreed to in writing, software
    @NotNull
        } else if (childType == MySQLTableConstraint.class) {
    protected void addObjectModifyActions(
    }
        MySQLTableBase tableBase,
        if (!(tableBase instanceof MySQLTable table)) {
            setNewObjectName(monitor, catalog, table);
                    DBUtils.getQuotedIdentifier(command.getObject().getContainer()) + "." + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) +
        final MySQLTable table;
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull MySQLTableBase object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
            return object.getConstraints(monitor);
            }
            final String tableName = DBUtils.getEntityScriptName(table, options);

public class MySQLTableManager extends SQLTableManager<MySQLTableBase, MySQLCatalog> implements DBEObjectRenamer<MySQLTableBase> {
        final MySQLDataSource dataSource = command.getObject().getDataSource();
    @Override

            return;

            new SQLDatabasePersistAction(query.toString())
    }
    }
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
            new SQLDatabasePersistAction(

import org.jkiss.dbeaver.ext.mysql.model.*;
                additionalInfo.getCharset() != null
            final MySQLTable.AdditionalInfo additionalInfo = table.getAdditionalInfo(monitor);
    protected boolean isIncludeIndexInDDL(DBRProgressMonitor monitor, DBSTableIndex index) throws DBException {
        DBRProgressMonitor monitor,
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * distributed under the License is distributed on an "AS IS" BASIS,
        final String delimiter = getDelimiter(options);
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, MySQLTableBase object, Class<? extends DBSObject> childType) throws DBException {
    @Override
    }
            if ((!table.isPersisted() && table.getDescription() != null) || tableProps.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
        );

        boolean alterTable = dataSource.supportsAlterTableRenameSyntax();

        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_OBJECT_DROP)) {
        } else {
        Map<String, Object> options) {
import org.jkiss.utils.CommonUtils;
                ddl.append(delimiter).append("AUTO_INCREMENT=").append(additionalInfo.getAutoIncrement()); //$NON-NLS-1$
        actions.add(
            }
            table = new MySQLTable(catalog);
                    + "." + DBUtils.getQuotedIdentifier(dataSource, command.getNewName()))
    }
import org.jkiss.dbeaver.model.*;
            ) {
            if ((!table.isPersisted() || tableProps.getProperty("engine") != null) && additionalInfo.getEngine() != null) { //$NON-NLS-1$
                ddl.append(delimiter).append("DEFAULT CHARSET=").append(additionalInfo.getCharset().getName()); //$NON-NLS-1$
        StringBuilder query = new StringBuilder("ALTER TABLE "); //$NON-NLS-1$
    protected MySQLTableBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
    }
            }

                (!table.isPersisted() || tableProps.getProperty("collation") != null) && //$NON-NLS-1$
    @Override
        NestedObjectCommand tableProps,
        MySQLTableForeignKey.class,
import org.jkiss.dbeaver.model.sql.SQLUtils;
            if (dataSource.supportsCollations() &&

    public DBSObjectCache<MySQLCatalog, MySQLTableBase> getObjectsCache(MySQLTableBase object) {
import java.util.List;
    protected void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    }
        try {
            final MySQLTable.AdditionalInfo additionalInfo = table.getAdditionalInfo(monitor);
            return object.getIndexes(monitor);

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
        MySQLTableColumn.class,
            if (dataSource.supportsCharsets() &&
            additionalInfo.setEngine(catalog.getDataSource().getDefaultEngine());
import org.jkiss.code.Nullable;

            table = new MySQLTable(monitor, catalog, (DBSEntity) copyFrom);
import java.util.Collection;
        StringBuilder ddl,
 *
        if (childType == MySQLTableColumn.class) {
        return !((MySQLTableIndex) index).isUniqueKeyIndex(monitor) && super.isIncludeIndexInDDL(monitor, index);
            return object.getAttributes(monitor);
            actions.add(0, new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_table, "DROP TABLE IF EXISTS " + tableName));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        if (copyFrom instanceof DBSEntity) {
        }
}
        boolean alter,
    @Override
package org.jkiss.dbeaver.ext.mysql.edit;

    public Class<? extends DBSObject>[] getChildTypes() {
                "Rename table",
                ddl.append(delimiter).append("COMMENT=").append(SQLUtils.quoteString(table, CommonUtils.notEmpty(table.getDescription()))); //$NON-NLS-1$
 * DBeaver - Universal Database Manager

    );
        } else if (copyFrom == null) {
 * You may obtain a copy of the License at
/*
        processObjectRename(commandContext, object, options, newName);

            final MySQLDataSource dataSource = table.getDataSource();
    @Override

 */
        }
    @Override
    @Nullable
