                    CommonUtils.equalObjects(
        return CHILD_TYPES;
    @Nullable
import org.jkiss.dbeaver.model.navigator.DBNNode;

import org.jkiss.code.Nullable;
    }
    protected void addObjectExtraActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull NestedObjectCommand<GenericTableBase, PropertyHandler> command, @NotNull Map<String, Object> options) throws DBException {
    {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            for (NestedObjectCommand ccom : orderedCommands) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        return object.getContainer().getTableCache();
import org.jkiss.dbeaver.model.DBPEvaluationContext;

                }
                    GenericTableColumnManager.addColumnCommentAction(actions, column, column.getTable());
        }
/**
import org.jkiss.dbeaver.ext.generic.model.*;
        GenericTableBase tableBase = command.getObject();
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
    }
        // Filter out indexes for unique constraints (if they have the same name)
        }
            List<DBXTreeNode> folderChildren = ((DBNDatabaseFolder) navContainer).getMeta().getChildren((DBNNode) navContainer);

 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean canCreateObject(@NotNull Object container) {
        Object navContainer = options.get(DBEObjectManager.OPTION_CONTAINER);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
                    ccom.getObject() != object &&
package org.jkiss.dbeaver.ext.generic.edit;
            null);
import org.jkiss.dbeaver.model.DBPObject;
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
    }
            for (GenericTableColumn column : CommonUtils.safeCollection(tableBase.getAttributes(monitor))) {
                if (!CommonUtils.isEmpty(column.getDescription())) {

    public DBSObjectCache<? extends DBSObject, GenericTableBase> getObjectsCache(GenericTableBase object)
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
/*
        GenericTableIndex.class


                    return true;
        DBPObject object = command.getObject();
}
import java.util.Map;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        GenericUniqueKey.class,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.sql.SQLUtils;


                }
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
        return super.canCreateObject(container);
import java.util.Collection;
 * Unless required by applicable law or agreed to in writing, software
        if (object instanceof DBSTableIndex) {

    public Class<? extends DBSObject>[] getChildTypes()
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    protected boolean excludeFromDDL(NestedObjectCommand command, Collection<NestedObjectCommand> orderedCommands) {
        }
            actions.add(new SQLDatabasePersistAction(
    @Override
        return structContainer.getDataSource().getMetaModel().createTableOrViewImpl(structContainer, tableName,
                    "COMMENT ON TABLE " + tableBase.getFullyQualifiedName(DBPEvaluationContext.DDL) +
 * See the License for the specific language governing permissions and
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    @Override
                            " IS " + SQLUtils.quoteString(tableBase, CommonUtils.notEmpty(tableBase.getDescription()))));
import org.jkiss.dbeaver.model.DBConstants;
    }

            isView ? GenericConstants.TABLE_TYPE_VIEW : GenericConstants.TABLE_TYPE_TABLE,
 * Generic table manager
        boolean isView = false;
    {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 */
                isView = true;
import org.jkiss.utils.CommonUtils;
            }
public class GenericTableManager extends SQLTableManager<GenericTableBase, GenericStructContainer> {
    protected GenericTableBase createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, Object container, Object copyFrom, @NotNull Map<String, Object> options)
        if (!tableBase.isPersisted()) {
import org.jkiss.dbeaver.ext.generic.GenericConstants;
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.List;
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
    }

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

                {
        return false;
    @NotNull
        GenericTableColumn.class,
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
        }
        if (command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
            }

 * DBeaver - Universal Database Manager
        String tableName = getNewChildName(monitor, structContainer, isView ? BASE_VIEW_NAME : BASE_TABLE_NAME);
import org.jkiss.dbeaver.DBException;
 *
        GenericStructContainer structContainer = (GenericStructContainer) container;
                        ((DBSTableIndex) object).getName(), ((DBSEntityConstraint) ccom.getObject()).getName()))
        if (navContainer instanceof DBNDatabaseFolder) {
            if (folderChildren.size() == 1 && folderChildren.get(0) instanceof DBXTreeItem && ((DBXTreeItem) folderChildren.get(0)).getPropertyName().equals("views")) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
        GenericTableForeignKey.class,
    @Override
                if (ccom.getObject() instanceof DBSEntityConstraint &&
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            // Column comments for the newly created table
                    "Comment table",
    @Override
    );
                    ((DBSEntityConstraint) ccom.getObject()).getConstraintType().isUnique() &&
