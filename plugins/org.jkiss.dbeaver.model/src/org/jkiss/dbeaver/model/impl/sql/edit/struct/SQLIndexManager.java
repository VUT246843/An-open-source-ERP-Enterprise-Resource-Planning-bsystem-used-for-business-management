 * You may obtain a copy of the License at
        );
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * distributed under the License is distributed on an "AS IS" BASIS,
            log.error("Cannot set index name");
import java.util.List;


                    .replace(PATTERN_ITEM_INDEX, command.getObject().getFullyQualifiedName(DBPEvaluationContext.DDL))
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndex;
                    .replace(PATTERN_ITEM_INDEX_SHORT, DBUtils.getQuotedIdentifier(command.getObject())))
    {
        decl.append(" ("); //$NON-NLS-1$

                firstColumn = false;
        final OBJECT_TYPE index = command.getObject();
package org.jkiss.dbeaver.model.impl.sql.edit.struct;
        actions.add(
import org.jkiss.code.NotNull;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return FEATURE_EDITOR_ON_CREATE;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    {

import org.jkiss.dbeaver.model.impl.struct.AbstractTable;
        decl.append(")"); //$NON-NLS-1$
}
    protected void appendIndexTypeAfterOn(OBJECT_TYPE index, StringBuilder decl) {
    @Override
    {

    protected void appendIndexModifiers(OBJECT_TYPE index, StringBuilder decl) {
    {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    protected String getDropIndexPattern(OBJECT_TYPE index)

        } catch (DBException e) {

        if (!indexColumn.isAscending()) {
        // Create index
                decl.append(DBUtils.getQuotedIdentifier(indexColumn));

    protected void appendIndexColumnModifiers(DBRProgressMonitor monitor, StringBuilder decl, DBSTableIndexColumn indexColumn) {

    @Override
        final String indexName = DBUtils.getQuotedIdentifier(index.getDataSource(), index.getName());
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
            // Get columns using void monitor
import org.jkiss.dbeaver.model.DBPDataSource;
        appendIndexModifiers(index, decl);
        actions.add(
                getDropIndexPattern(command.getObject())
import org.jkiss.dbeaver.model.DBPNamedObject2;

        return "DROP INDEX " + PATTERN_ITEM_INDEX; //$NON-NLS-1$


import org.jkiss.dbeaver.model.DBUtils;
import java.util.Map;
        decl.append(" INDEX ").append(indexName); //$NON-NLS-1$
 */
        }


        appendIndexType(index, decl);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
    }
import org.jkiss.utils.CommonUtils;
        );
        if (index instanceof DBPNamedObject2) {

        final String tableName = DBUtils.getEntityScriptName(table, options);
    }
            decl.append(" UNIQUE");
    extends SQLObjectEditor<OBJECT_TYPE, TABLE_TYPE>

    }
                ModelMessages.model_jdbc_drop_index,
 *
/**
public abstract class SQLIndexManager<OBJECT_TYPE extends AbstractTableIndex, TABLE_TYPE extends AbstractTable>
    }

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    }
 * JDBC constraint manager
            log.error(e);

            boolean firstColumn = true;
                appendIndexColumnModifiers(monitor, decl, indexColumn);
        try {
        if (index.isUnique()) {
                    .replace(PATTERN_ITEM_TABLE, DBUtils.getObjectFullName(command.getObject().getTable(), DBPEvaluationContext.DDL))
                if (!firstColumn) decl.append(","); //$NON-NLS-1$
        }
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
            new SQLDatabasePersistAction(ModelMessages.model_jdbc_create_new_index, decl.toString())
/*
            new SQLDatabasePersistAction(
        final TABLE_TYPE table = (TABLE_TYPE)command.getObject().getTable();
        }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
{
 * Copyright (C) 2010-2024 DBeaver Corp and others
        decl.append(" ON ").append(tableName); //$NON-NLS-1$
            for (DBSTableIndexColumn indexColumn : CommonUtils.safeCollection(command.getObject().getAttributeReferences(new VoidProgressMonitor()))) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
    protected void appendIndexType(OBJECT_TYPE index, StringBuilder decl) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
 * DBeaver - Universal Database Manager
        appendIndexTypeAfterOn(index, decl);
    @Override
        }
import org.jkiss.dbeaver.DBException;
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
 *
 * you may not use this file except in compliance with the License.
        StringBuilder decl = new StringBuilder(40);
 * See the License for the specific language governing permissions and
        decl.append("CREATE");
            ((DBPNamedObject2) index).setName(indexName);
            decl.append(" DESC"); //$NON-NLS-1$
 *

