        // Add column comments if needed
 *
        if (childType == GBase8sUniqueKey.class) {
        if (!tableBase.isPersisted() ? (objectSave || includeComments) : (!objectSave && includeComments)) {

import java.util.Collection;
    public boolean canRenameObject(GenericTableBase object) {
            return object.getConstraints(monitor);
        return super.getChildObjects(monitor, object, childType);
            @NotNull NestedObjectCommand<GenericTableBase, PropertyHandler> command,
                new SQLDatabasePersistAction("Rename table",
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        String commentSQL = String.format(GBase8sConstants.SQL_TABLE_COMMENT, tableName,
import org.jkiss.dbeaver.model.*;
                                + DBUtils.getQuotedIdentifier(dataSource, command.getOldName()) + " RENAME TO "
    }
        boolean includeComments = CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS);

            @NotNull Map<String, Object> options) {
            @NotNull Map<String, Object> options,
    }
    protected void addObjectRenameActions(
        boolean hasDescription = !CommonUtils.isEmpty(tableBase.getDescription());
                                                command.getObject().getSchema().getName()) + "."

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.gbase8s.edit;
public class GBase8sTableManager extends GenericTableManager implements DBEObjectRenamer<GenericTableBase> {
            for (NestedObjectCommand<?,?> ccom : orderedCommands) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;

    }
            @NotNull DBRProgressMonitor monitor,
            @NotNull List<DBEPersistAction> actions,
    protected void addObjectExtraActions(
        // Add table comment if needed
            GenericTableForeignKey.class,
/**
            @NotNull List<DBEPersistAction> actionList,
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
    @Override
        return true;
            @NotNull Map<String, Object> options) throws DBException {
    private boolean isUniqueConstraint(NestedObjectCommand command) {
                                        ? DBUtils.getQuotedIdentifier(dataSource,
        actions.add(
            @NotNull DBCExecutionContext executionContext,

        final GenericDataSource dataSource = command.getObject().getDataSource();
                    List<GenericTableIndexColumn> a = ((GenericTableIndex) object).getAttributeReferences(new VoidProgressMonitor());
                                + DBUtils.getQuotedIdentifier(dataSource, command.getNewName())));
        }
            @Nullable String newName) throws DBException {
            for (GenericTableColumn column : CommonUtils.safeCollection(tableBase.getAttributes(monitor))) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                if (isUniqueConstraint(ccom)) {
            @NotNull SQLObjectEditor<GenericTableBase, GenericStructContainer>.ObjectRenameCommand command,
    @Override
        if ((objectSave && command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) || hasDescription) {
    }
        processObjectRename(commandContext, object, options, newName);
import org.jkiss.dbeaver.model.sql.SQLUtils;
        DBPObject object = command.getObject();
 */
 * @author Chao Tian
    }
    private void addTableCommentAction(
 * Unless required by applicable law or agreed to in writing, software
            }

                }
            @NotNull GenericTableBase object,
            throw new DBException("View rename is not supported");

    public boolean canEditObject(@NotNull GenericTableBase object) {
import org.jkiss.dbeaver.DBException;
            @NotNull DBRProgressMonitor monitor,
 * distributed under the License is distributed on an "AS IS" BASIS,
                        return true;
    }
 * You may obtain a copy of the License at
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, GenericTableBase object,
    protected boolean isIncludeDropInDDL(GenericTableBase table) {
        }
    @Override
    }
                            .allMatch(colA -> b.stream().anyMatch(colB -> colA.getName().equals(colB.getName())))) {
    public void renameObject(
                    List<GenericTableConstraintColumn> b = ((GBase8sUniqueKey) ccom.getObject())
    @Override
                && ((DBSEntityConstraint) command.getObject()).getConstraintType().isUnique();
    @NotNull
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
                                        : "")
    }

 *
import java.util.Map;
import org.jkiss.dbeaver.ext.generic.model.*;
            }
                        "ALTER TABLE "

                            .getAttributeReferences(null);
            Class<? extends DBSObject> childType) throws DBException {

        // Filter out indexes linked to unique constraints if their columns match
    @Override

import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
        if (object instanceof DBSTableIndex) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
    }
    protected boolean excludeFromDDL(NestedObjectCommand command, Collection<NestedObjectCommand> orderedCommands) {
import java.util.List;
 * limitations under the License.
                                + (command.getObject().getSchema() != null
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
                if (!CommonUtils.isEmpty(column.getDescription())) {
                    }
        GenericTableBase tableBase = command.getObject();
            GBase8sTableColumn.class,
        if (object.isView()) {
            @NotNull GenericTableBase table) {
 */
        return command.getObject() instanceof DBSEntityConstraint
        }
            GBase8sUniqueKey.class,
    }
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
            @NotNull List<DBEPersistAction> actions,
import org.jkiss.dbeaver.ext.gbase8s.model.GBase8sTableColumn;
 * See the License for the specific language governing permissions and
}
    @Override
            @NotNull DBECommandContext commandContext,
/*
        return false;
                    GenericTableColumnManager.addColumnCommentAction(actions, column, column.getTable());


        return CHILD_TYPES;
        boolean objectSave = CommonUtils.getOption(options, DBPScriptObject.OPTION_OBJECT_SAVE);
                    if (a.size() == b.size() && a.stream()
import org.jkiss.dbeaver.ext.gbase8s.model.GBase8sUniqueKey;
                SQLUtils.quoteString(table, CommonUtils.notEmpty(table.getDescription())));
 *
            GenericTableIndex.class);

    }
    public Class<? extends DBSObject>[] getChildTypes() {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        actionList.add(new SQLDatabasePersistAction("Comment on Table", commentSQL));
 * DBeaver - Universal Database Manager
        return false;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.gbase8s.GBase8sConstants;
        return false;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            @NotNull DBCExecutionContext executionContext,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
        String tableName = DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL);
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
            addTableCommentAction(actions, tableBase);
    private static final Class<? extends DBSObject>[] CHILD_TYPES = CommonUtils.array(
    @Override

