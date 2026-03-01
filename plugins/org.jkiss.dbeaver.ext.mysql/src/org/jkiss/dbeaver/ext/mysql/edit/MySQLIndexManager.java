    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            super.appendIndexModifiers(index, decl);
    protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (!indexColumn.isAscending()) {
    @Override
            false);

    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
 * DBeaver - Universal Database Manager
            DBSIndexType.OTHER,
        }

    protected void appendIndexColumnModifiers(DBRProgressMonitor monitor, StringBuilder decl, DBSTableIndexColumn indexColumn) {
/**
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;
        actions.add(
    public DBSObjectCache<MySQLCatalog, MySQLTableIndex> getObjectsCache(MySQLTableIndex object)
    }
            decl.append(" FULLTEXT");
            decl.append(" (").append(subPart).append(")");
                    "\nRENAME INDEX " + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) +
 *
                    " TO " + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())) //$NON-NLS-1$
import org.jkiss.utils.CommonUtils;

        return object.getTable().getContainer().getIndexCache();
import org.jkiss.dbeaver.model.DBUtils;
    }
    }
import java.util.Map;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }

 */
 * You may obtain a copy of the License at
        DBSIndexType indexType = index.getIndexType();
 * MySQL index manager
import org.jkiss.dbeaver.ext.mysql.model.*;
    }

        return "ALTER TABLE " + PATTERN_ITEM_TABLE + " DROP INDEX " + PATTERN_ITEM_INDEX_SHORT; //$NON-NLS-1$ //$NON-NLS-2$

            decl.append(" USING ").append(indexType.getId());
        } else {
        return new MySQLTableIndex(
            decl.append(" DESC"); //$NON-NLS-1$
    protected MySQLTableIndex createDatabaseObject(
                "ALTER TABLE " + command.getObject().getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) +
        }

            false,
import org.jkiss.code.Nullable;
    @Nullable

    @Override
        if (index.getIndexType() == MySQLConstants.INDEX_TYPE_FULLTEXT) {
    {

 *
package org.jkiss.dbeaver.ext.mysql.edit;
        processObjectRename(commandContext, object, options, newName);

        }
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
    {
        if (indexType != MySQLConstants.INDEX_TYPE_FULLTEXT) {
    }
        );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {

        Object from, @NotNull Map<String, Object> options)
    @Override
            null,
                "Rename table",
import org.jkiss.code.NotNull;
        addObjectCreateActions(monitor, executionContext, actionList, makeCreateCommand(command.getObject(), options), options);
import org.jkiss.dbeaver.DBException;
 */
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            new SQLDatabasePersistAction(
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import java.util.List;
        if (!CommonUtils.isEmpty(subPart)) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Unless required by applicable law or agreed to in writing, software
}
    protected void appendIndexModifiers(MySQLTableIndex index, StringBuilder decl) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        addObjectDeleteActions(monitor, executionContext, actionList, new ObjectDeleteCommand(command.getObject(), command.getTitle()), options);
public class MySQLIndexManager extends SQLIndexManager<MySQLTableIndex, MySQLTable> implements DBEObjectRenamer<MySQLTableIndex> {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
        }
    }

/*
    @Override

        final String subPart = ((MySQLTableIndexColumn) indexColumn).getSubPart();
    @Override
 *
    {
    public void renameObject(@NotNull DBECommandContext commandContext, @NotNull MySQLTableIndex object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException {
    protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList, @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options) throws DBException {
            null,
 * you may not use this file except in compliance with the License.
        final MySQLDataSource dataSource = command.getObject().getDataSource();
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    protected String getDropIndexPattern(MySQLTableIndex index)
            (MySQLTable) container,
    protected void appendIndexType(MySQLTableIndex index, StringBuilder decl) {
