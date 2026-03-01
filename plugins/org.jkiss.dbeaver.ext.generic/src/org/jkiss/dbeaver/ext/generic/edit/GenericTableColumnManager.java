            features |= DDL_FEATURE_OMIT_COLUMN_CLAUSE_IN_DROP;
        Object copyFrom,
            false,
    @Override
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
            monitor,
}
    }
        Object container,
    public DBSObjectCache<? extends DBSObject, GenericTableColumn> getObjectsCache(GenericTableColumn object) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            columnSize,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableColumnManager;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.DBConstants;
    }

        }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
    protected void addObjectModifyActions(
        if (CommonUtils.toBoolean(object.getDataSource().getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_ALTER_TABLE_ADD_COLUMN))) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**
                decl.append(" ").append(autoIncrementClause); //$NON-NLS-1$
            return new ColumnModifier[]{
        }
            null,
        GenericTableColumn column = tableBase.getDataSource().getMetaModel().createTableColumnImpl(
            null,
    protected ColumnModifier[] getSupportedModifiers(GenericTableColumn column, Map<String, Object> options) {
            columnType == null ? "INTEGER" : columnType.getName(),
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ext.generic.edit;

import java.util.Map;
        return column;
    }
            return new ColumnModifier[]{
    public void addIncrementClauseToNestedDeclaration(DBECommandAbstract<GenericTableColumn> command, StringBuilder decl) {
        // According to SQL92 DEFAULT comes before constraints
        }
        @NotNull DBRProgressMonitor monitor,

    @Override

            columnSize,
 * limitations under the License.
 * Generic table column manager
                metaModel.isColumnNotNullByDefault() ? NullNotNullModifier : NotNullModifier
        if (!metaModel.supportsNotNullColumnModifiers(column)) {
        addIncrementClauseToNestedDeclaration(command, decl);
            columnType == null ? Types.INTEGER : columnType.getTypeID(),
            if (autoIncrementClause != null && !autoIncrementClause.isEmpty()) {
import org.jkiss.dbeaver.model.DBPDataKind;
        }
/*

        @NotNull DBCExecutionContext executionContext,
        @NotNull Map<String, Object> options
        return GenericUtils.canAlterTable(object);
            getNewColumnName(monitor, context, tableBase),
    public boolean canCreateObject(@NotNull Object container) {
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
 */
import java.util.List;
        return container instanceof GenericTable && GenericUtils.canAlterTable((GenericTable) container);
    protected GenericTableColumn createDatabaseObject(
    @Override
            null,
    }
 * See the License for the specific language governing permissions and

        final GenericTableColumn column = command.getObject();
import org.jkiss.code.NotNull;
    ) throws DBException {
        GenericMetaModel metaModel = column.getDataSource().getMetaModel();
        DBSDataType columnType = findBestDataType(tableBase, DBConstants.DEFAULT_DATATYPE_NAMES);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        return decl;
        @NotNull List<DBEPersistAction> actionList,
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        int columnSize = columnType != null && columnType.getDataKind() == DBPDataKind.STRING ? 100 : 0;
        StringBuilder decl = super.getNestedDeclaration(monitor, owner, command, options);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) throws DBException {
import java.sql.Types;
    @Nullable
            columnType == null ? Types.INTEGER : columnType.getTypeID(),
    public boolean canDeleteObject(@NotNull GenericTableColumn object) {
        return features;
 *
        }
        // Add more or less standard COMMENT ON if comment was actually edited (i.e. it is editable at least).
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected long getDDLFeatures(GenericTableColumn object) {
    @Override
            features |= DDL_FEATURE_USER_BRACKETS_IN_DROP;
        return object.getParentObject().getContainer().getTableCache().getChildrenCache(object.getParentObject());
        if (CommonUtils.toBoolean(object.getDataSource().getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_DDL_DROP_COLUMN_SHORT))) {
    @Override
            false,
        GenericTableColumn column = command.getObject();
    @Override

            10,
    }
            -1,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

import org.jkiss.utils.CommonUtils;
        @NotNull ObjectChangeCommand command,
    }
        if (CommonUtils.toBoolean(object.getDataSource().getContainer().getDriver().getDriverParameter(GenericConstants.PARAM_DDL_DROP_COLUMN_BRACKETS))) {
    @Override
    }
            };
            addColumnCommentAction(actionList, column, column.getTable());
            tableBase,
    }
import org.jkiss.dbeaver.ext.generic.model.GenericUtils;

            null,
        } else {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;


        );
    }
import org.jkiss.dbeaver.ext.generic.GenericConstants;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSDataType;
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
            };
 * DBeaver - Universal Database Manager
        @NotNull DBRProgressMonitor monitor,
        GenericTableBase tableBase = (GenericTableBase) container;
        }

        @NotNull DBECommandContext context,
        @NotNull Map<String, Object> options
        long features = 0;
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
            final String autoIncrementClause = column.getDataSource().getMetaModel().getAutoIncrementClause(column);
                DataTypeModifier, DefaultModifier
        if (column.isAutoIncrement()) {
 *

    public boolean canEditObject(@NotNull GenericTableColumn object) {
            null,
            false
 */
            }

    }
    @Override
    @Override
import org.jkiss.dbeaver.ext.generic.model.GenericTable;
        return GenericUtils.canAlterTable(object);
        column.setPersisted(false);
            features |= FEATURE_ALTER_TABLE_ADD_COLUMN;

                DataTypeModifier, DefaultModifier,
public class GenericTableColumnManager extends SQLTableColumnManager<GenericTableColumn, GenericTableBase> {
    public StringBuilder getNestedDeclaration(@NotNull DBRProgressMonitor monitor, @NotNull GenericTableBase owner, @NotNull DBECommandAbstract<GenericTableColumn> command, @NotNull Map<String, Object> options) {
