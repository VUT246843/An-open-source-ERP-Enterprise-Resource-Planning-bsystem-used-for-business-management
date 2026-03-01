
 * You may obtain a copy of the License at
        }
            ddl.append("UNIQUE ");
            return;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
        SQLServerTableIndex index = command.getObject();
            ddl.append(sqlServerIndexType).append(" ");

 * limitations under the License.
import org.jkiss.dbeaver.ext.mssql.model.*;
 */
                    actions.add(
import java.util.List;
    protected SQLServerTableIndex createDatabaseObject(
                if (!includedColumns.isEmpty()) {
 *
/**
                .map(DBUtils::getQuotedIdentifier)
        return object.getTable().getContainer().getIndexCache();
                        new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_index, indexDDL)

        return new SQLServerTableIndex(
        );
    ) throws DBException {
                    ddl.append(" INCLUDE (").append(includedColumns).append(")");
            }
    @Override
import org.jkiss.code.Nullable;
        addObjectCreateActions(monitor, executionContext, actionList, makeCreateCommand(command.getObject(), options), options);
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) {
            false);
    }
        @NotNull Map<String, Object> options
 * See the License for the specific language governing permissions and
        @NotNull List<DBEPersistAction> actionList,
}
        if (indexTable instanceof SQLServerTableType) {
 * SQL Server index manager
import java.util.stream.Collectors;
public class SQLServerIndexManager extends SQLIndexManager<SQLServerTableIndex, SQLServerTableBase> {
            true,
        StringBuilder ddl = new StringBuilder();
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
            if (!columnStore) {
 */
import java.util.Map;
        SQLServerTable table = (SQLServerTable) container;
            if (columnStore) {

    @Override
            null,
    }
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.messages.ModelMessages;
        return "DROP INDEX " + DBUtils.getQuotedIdentifier(index) + " ON " + index.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL);
            ddl.append(indexColumns.stream()
        ddl.append("CREATE ");
        if (sqlServerIndexType != null) {
            DBSIndexType.UNKNOWN,
            super.addObjectCreateActions(monitor, executionContext, actions, command, options);
                }
                .collect(Collectors.joining(", ", " (", ")"))
            }
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        Object from, @NotNull Map<String, Object> options)
        } else if (indexType == SQLServerConstants.INDEX_TYPE_NON_CLUSTERED) {
    }
package org.jkiss.dbeaver.ext.mssql.edit;
                if (!CommonUtils.isEmpty(indexDDL)) {
            try {
    {
            // Do not add columns list in this case, it will not work (SQL Error [35335] [S0001])

    protected void addObjectModifyActions(

                .filter(x -> !x.isIncluded() || columnStore)
 * you may not use this file except in compliance with the License.

        boolean columnStore = index.isColumnStore();
        actions.add(
                ddl.append("COLUMNSTORE ");
        @NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
        @NotNull DBCExecutionContext executionContext,
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            return;

 * DBeaver - Universal Database Manager
        }
    protected String getDropIndexPattern(SQLServerTableIndex index)
                final String includedColumns = indexColumns.stream()
 * Unless required by applicable law or agreed to in writing, software


                    return;
import org.jkiss.dbeaver.model.DBPScriptObject;
 *
                new SQLDatabasePersistAction("Create new SQL Server index", ddl.toString())
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @NotNull ObjectChangeCommand command,
                    .filter(SQLServerTableIndexColumn::isIncluded)
        } else {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                log.warn("Can't extract index DDL", e);
 *     http://www.apache.org/licenses/LICENSE-2.0
            table,
        if (indexType == DBSIndexType.CLUSTERED) {
            sqlServerIndexType = "NONCLUSTERED";
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBUtils;
                    );
        DBSIndexType indexType = index.getIndexType();
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        } else if (indexColumns != null) {
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;
        if (index.isPersisted()) {
        addObjectDeleteActions(monitor, executionContext, actionList, new ObjectDeleteCommand(command.getObject(), command.getTitle()), options);
            }

                String indexDDL = index.getObjectDefinitionText(monitor, DBPScriptObject.EMPTY_OPTIONS);
import org.jkiss.code.NotNull;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
        String sqlServerIndexType = null;
            false,
            sqlServerIndexType = "CLUSTERED";
        @NotNull DBRProgressMonitor monitor,
            } catch (DBException e) {
import org.jkiss.dbeaver.DBException;

    public DBSObjectCache<? extends DBSObject, SQLServerTableIndex> getObjectsCache(SQLServerTableIndex object)
        SQLServerTableBase indexTable = index.getTable();
                }
    }

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
            null,
        }
                    .map(DBUtils::getQuotedIdentifier)
                    .collect(Collectors.joining(", "));
            );

    {
        List<SQLServerTableIndexColumn> indexColumns = index.getAttributeReferences(monitor);
        }
        }
    }
        ddl.append("INDEX ").append(DBUtils.getQuotedIdentifier(index)).append(" ON ").append(indexTable.getFullyQualifiedName(DBPEvaluationContext.DDL));
        if (columnStore && index.getIndexType() == DBSIndexType.CLUSTERED) {
        if (index.isUnique()) {
 *
    @Nullable
