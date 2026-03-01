
            return null;
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
    }
            actionList.add(new SQLDatabasePersistAction(CMD_ALTER, sb.toString()));
import java.util.Map;
        DB2TableForeignKey.class,
    private static final String LINE_SEPARATOR = GeneralUtils.getDefaultLineSeparator();
    private static final String CLAUSE_IN_TS = "IN ";
        return object.getSchema().getTableCache();
package org.jkiss.dbeaver.ext.db2.manager;
            DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()),
                ddl.append(getTablespaceName(db2Table.getIndexTablespace(monitor)));
            DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName()));
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;

            String commentSQL = String.format(SQL_COMMENT, db2Table.getFullyQualifiedName(DBPEvaluationContext.DDL), db2Table.getDescription());
    private static final String CLAUSE_IN_TS_IX = "INDEX IN ";

    public void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options) {
    @SuppressWarnings("rawtypes")
import org.jkiss.dbeaver.ext.db2.model.*;
    public Class<? extends DBSObject>[] getChildTypes() {
            sb.append(SQL_ALTER);
 * You may obtain a copy of the License at
    // ------
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    // ------

import org.jkiss.dbeaver.model.DBUtils;
    public DBSObjectCache<DB2Schema, DB2Table> getObjectsCache(DB2Table object) {
            return String.valueOf(tablespace);
    // ------
        if (commentAction != null) {
    private DBEPersistAction buildCommentAction(DB2Table db2Table) {

        if (CommonUtils.isNotEmpty(db2Table.getDescription())) {
    private static final String SQL_COMMENT = "COMMENT ON TABLE %s IS '%s'";
    // ------
                ddl.append(CLAUSE_IN_TS);
    private static final String CMD_RENAME = "Rename Table";
                ddl.append(delimiter);

    public void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException {

        DBEPersistAction commentAction = buildCommentAction(db2Table);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        } else {
    }
            if (db2Table.getLongTablespace(monitor) != null) {
    }

        Map<String, Object> options) {
        DBEPersistAction commentAction = buildCommentAction(command.getObject());
        DB2TableUniqueKey.class,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            return null;
            StringBuilder sb = new StringBuilder(128);
        }
        StringBuilder ddl,
        return CHILD_TYPES;
            }
        return table;
}
    // Alter
        NestedObjectCommand tableProps,
    private static final String SQL_RENAME_TABLE = "RENAME TABLE %s TO %s";
                ddl.append(getTablespaceName(db2Table.getLongTablespace(monitor)));
    @Override
    public DB2Table createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object db2Schema,
    private static String getTablespaceName(Object tablespace) {
 * you may not use this file except in compliance with the License.
            log.warn(e);
        } else {
            sb.append(" ");
    private static final String CMD_COMMENT = "Comment on Table";
        if (tablespace instanceof DB2Tablespace) {
        processObjectRename(commandContext, object, options, newName);
 * @author Denis Forveille
        if (command.getProperties().size() > 1) {
        }
            String delimiter = isCompact(options) ? " " : LINE_SEPARATOR;
    @Override
 * limitations under the License.
    // -----------------
 */
    @NotNull
/*
                                         Object copyFrom, @NotNull Map<String, Object> options) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DB2 Table Manager
    private static final String NEW_TABLE_NAME = "NEW_TABLE";
        // Eventually add Comment
        DB2Index.class);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    public void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) {
    // Business Contract
                ddl.append(delimiter);
    public void appendTableModifiers(
    private static final String SQL_ALTER = "ALTER TABLE ";
import org.jkiss.dbeaver.model.struct.DBSObject;
    private static final String CLAUSE_IN_TS_LONG = "LONG IN ";
        }
import java.util.List;
    }
    }

import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.DBPEvaluationContext;


 *
        } else if (tablespace != null) {
        }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        }

    }
            sb.append(db2Table.getFullyQualifiedName(DBPEvaluationContext.DDL));
        } catch (DBException e) {
        boolean alter,
 * Unless required by applicable law or agreed to in writing, software
        actions.add(


            new SQLDatabasePersistAction(CMD_RENAME, sql)
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        DB2Table table = new DB2Table((DB2Schema) db2Schema, NEW_TABLE_NAME);
    @Override
        DB2Table db2Table,
 *
    }
            // Never be here

        );
            actions.add(commentAction);
        super.addStructObjectCreateActions(monitor, executionContext, actions, command, options);
            return new SQLDatabasePersistAction(CMD_COMMENT, commentSQL);

    }
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull DB2Table object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {


    @Nullable

        }
    // Helpers
    }
                ddl.append(getTablespaceName(db2Table.getTablespace(monitor)));
        try {
    // -------
        String sql = String.format(SQL_RENAME_TABLE,
 *
import org.jkiss.utils.CommonUtils;
    private static final String CMD_ALTER = "Alter Table";
        setNewObjectName(monitor, (DB2Schema) db2Schema, table);
        DB2Table db2Table = command.getObject();
            if (db2Table.getIndexTablespace(monitor) != null) {

            }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * DBeaver - Universal Database Manager

 */
    // Rename
        if (commentAction != null) {


            if (db2Table.getTablespace(monitor) != null) {
    // Create
 * Licensed under the Apache License, Version 2.0 (the "License");

    // ------
            }
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    // ------
    @Override


    @Override
                ddl.append(CLAUSE_IN_TS_IX);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
    // -----------------
    @Override
            actionList.add(commentAction);
        DBRProgressMonitor monitor,
                ddl.append(delimiter);
            appendTableModifiers(monitor, command.getObject(), command, sb, true, options);
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
    @Override
 * See the License for the specific language governing permissions and
 *

        DB2TableColumn.class,
                ddl.append(CLAUSE_IN_TS_LONG);
    // -------
public class DB2TableManager extends SQLTableManager<DB2Table, DB2Schema> implements DBEObjectRenamer<DB2Table> {
            // Add Tablespaces infos
            return ((DB2Tablespace) tablespace).getName();
