    public List<? extends DBSObject> getDependentObjectsList(DBRProgressMonitor monitor, DBSObject object) throws DBException {
        if (command instanceof SQLObjectEditor.ObjectRenameCommand) {
    }
    ) {
        NullNotNullModifier.appendModifier(monitor, column, sql, command);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.edit.DBEObjectWithDependencies;
    ) throws DBException
    @Override
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected ColumnModifier<OBJECT_TYPE> DefaultModifier = new BaseDefaultModifier();
        }

        }
                }
            if (!defaultValue.startsWith(QUOTE) && !defaultValue.endsWith(QUOTE)) {

        if (column.isPersisted() && command instanceof DBECommandComposite) {
            if (((DBECommandComposite) command).getProperty("required") == null) {
        protected void appendDefaultValue(@NotNull StringBuilder sql, @NotNull String defaultValue, boolean useQuotes) {
    public static final long FEATURE_ALTER_TABLE_ADD_COLUMN = 4;
    @Override
        if (CommonUtils.isEmpty(command.getObject().getTypeName())) {
        @NotNull List<DBEPersistAction> actions,
                for (DBSEntityAssociation association : associations) {
        } else {
        for (ColumnModifier<OBJECT_TYPE> modifier : getSupportedModifiers(column, options)) {
            if (!CommonUtils.isEmpty(associations)) {
            dataKind = dataType.getDataKind();
        ddl.append(DBUtils.getQuotedIdentifier(command.getObject()));
                    addDependentConstraints(monitor, (DBSEntityAttribute) object, dependentObjectsList, constraint);
/**
            @NotNull StringBuilder sql,
        @NotNull Map<String, Object> options
    protected static DBSDataType findBestDataType(DBSObject object, String ... typeNames)

        }
        DBSObject dbsObject = object.getParentObject();
        sql.append(column.isRequired() ? " NOT NULL" : " NULL");

        }
        String modifiers = SQLUtils.getColumnTypeModifiers(column.getDataSource(), column, typeName, dataKind);
 *
        }
        }


    {
                        }
            columnName = DBUtils.getQuotedIdentifier(column.getDataSource(), ((ObjectRenameCommand) command).getNewName());
        @NotNull DBRProgressMonitor monitor,
    protected ColumnModifier[] getSupportedModifiers(OBJECT_TYPE column, Map<String, Object> options)

            }
            if (!CommonUtils.isEmpty(indexes)) {

 * Table column manager. Fits for all composite entities including NoSQL.
        @NotNull DBRProgressMonitor monitor,
                // Do not set NULL/NOT NULL if it wasn't changed
import org.jkiss.code.NotNull;
    public boolean canDeleteObject(@NotNull OBJECT_TYPE object)
                appendDefaultValue(sql, defaultValue, useQuotes);
        @NotNull TABLE_TYPE owner,
                        return true;
                return;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.messages.ModelMessages;
/*
    {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
            }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        }
 * DBeaver - Universal Database Manager
{
            modifier.appendModifier(monitor, column, decl, command);
            if (useQuotes) {
                sql.append(QUOTE);
            sql.append(modifiers);
    }

        }
                    final String trimmed = defaultValue.trim();
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
        ddl.append("ALTER TABLE ").append(DBUtils.getObjectFullName(command.getObject().getParentObject(), DBPEvaluationContext.DDL));

                    addDependentConstraints(monitor, (DBSEntityAttribute) object, dependentObjectsList, association);


        return (getDDLFeatures(object) & feature) != 0;
                sql.append(" DEFAULT "); //$NON-NLS-1$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                for (DBSEntityAttributeRef attributeRef : attributeReferences) {
        StringBuilder ddl = new StringBuilder();
                    }
    private boolean hasDDLFeature(OBJECT_TYPE object, long feature)
                sql.append(QUOTE);
                            DBSTableColumn tableColumn = indexColumn.getTableColumn();


            String defaultValue = CommonUtils.toString(column.getDefaultValue());
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
        return null;
            if (!CommonUtils.isEmpty(defaultValue)) {
        if (useBrackets) ddl.append('(');
            }
    protected final ColumnModifier<OBJECT_TYPE> NullNotNullModifier = (monitor, column, sql, command) ->
    {
    @Override
    protected void addObjectDeleteActions(
                            }
 * limitations under the License.
        @NotNull ObjectDeleteCommand command,

        if (dbsObject instanceof DBSEntity && object instanceof DBSEntityAttribute) {
    protected final ColumnModifier<OBJECT_TYPE> NullNotNullModifierConditional = (monitor, column, sql, command) -> {
    @Override
    @NotNull
            }
    public boolean canEditObject(@NotNull OBJECT_TYPE object)
    }
                }
        if (dbsObject instanceof DBSTable) {
                    return !Character.isLetter(firstChar) && firstChar != '(' && firstChar != '[';
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
    protected long getDDLFeatures(OBJECT_TYPE object)
        if (column.isRequired()) {
        @NotNull List<DBEPersistAction> actions,
    @Override
    protected String getNewColumnName(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, @NotNull TABLE_TYPE table) {
}
            DBSEntity parentObject = (DBSEntity) dbsObject;

            if (!CommonUtils.isEmpty(attributeReferences)) {
    };
            @NotNull OBJECT_TYPE column,
    {
            log.debug("Type name '" + typeName + "' is not supported by driver"); //$NON-NLS-1$ //$NON-NLS-2$
    }
        sql.append(getNestedDeclaration(monitor, table, command, options));
    private static DBSDataType findDataType(DBSObject object, String typeName)
    }
        final TABLE_TYPE table = (TABLE_TYPE) command.getObject().getParentObject();

        @NotNull DBCExecutionContext executionContext,
                        dependentObjectsList.add(constraint);
                }
        if (dataTypeProvider != null) {
        }
        }
 *
        return container instanceof DBSTable && !((DBSTable) container).isView();
            ddl.append("COLUMN ");
    };
        StringBuilder decl = new StringBuilder(40);
        }
        );
 */
    };
    protected interface ColumnModifier<OBJECT_TYPE extends DBPObject> {
        return table != null && !DBUtils.isView(table);
            new SQLDatabasePersistAction(
    }
            List<? extends DBSEntityAttributeRef> attributeReferences = ((DBSEntityReferrer) constraint).getAttributeReferences(monitor);
        actions.add(
 * Licensed under the Apache License, Version 2.0 (the "License");
    extends SQLObjectEditor<OBJECT_TYPE, TABLE_TYPE> implements DBEObjectWithDependencies
    public static final long DDL_FEATURE_USER_BRACKETS_IN_DROP = 2;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        }
    {
        Set<DBSObject> dependentObjectsList = new HashSet<>();
    @Override
        return decl;
        @NotNull Map<String, Object> options
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                for (DBSTableIndex index : indexes) {
        decl.append(columnName);
            }
 * See the License for the specific language governing permissions and
        }

        return FEATURE_EDITOR_ON_CREATE;
                    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
        }
        return 0;
            "COMMENT ON COLUMN " + DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL) + "." + DBUtils.getQuotedIdentifier(column) +
        if (useBrackets) ddl.append(')');
                            if (tableColumn == object) {
        throws DBException
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
        String columnName = DBUtils.getQuotedIdentifier(column.getDataSource(), column.getName());
    }
    protected class BaseDefaultModifier implements ColumnModifier<OBJECT_TYPE> {
            sql.append(defaultValue);
    {

    {
            return dataTypeProvider.getLocalDataType(typeName);
        actions.add(
import org.jkiss.dbeaver.model.sql.SQLUtils;
        if (hasDDLFeature(command.getObject(), FEATURE_ALTER_TABLE_ADD_COLUMN)) {
            return false;

    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options)
                " IS " + SQLUtils.quoteString(column.getDataSource(), CommonUtils.notEmpty(column.getDescription()))));
        @NotNull Map<String, Object> options
        if (dataTypeProvider != null) {
            @NotNull DBECommandAbstract<OBJECT_TYPE> command
import org.jkiss.dbeaver.model.struct.*;

        return new ColumnModifier[] {DataTypeModifier, NotNullModifier, DefaultModifier};
            if (!CommonUtils.isEmpty(constraints)) {
                }
    }
            Collection<? extends DBSTableIndex> indexes = ((DBSTable) dbsObject).getIndexes(monitor);
    protected final ColumnModifier<OBJECT_TYPE> DataTypeModifier = (monitor, column, sql, command) -> {

            }
        void appendModifier(DBRProgressMonitor monitor, OBJECT_TYPE column, StringBuilder sql, DBECommandAbstract<OBJECT_TYPE> command);
            }
        actionList.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import java.util.*;
        ddl.append(" DROP ");
package org.jkiss.dbeaver.model.impl.sql.edit.struct;
    {
        return DBUtils.makeNewObjectName(monitor, "Column{0}", table, DBSEntityAttribute.class, DBSEntity::getAttribute, context);
    public static final String QUOTE = "'";
            }
        }
                                break;
    {
    {
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

        // Create column
    @Override
    ) throws DBException {
        final DBSDataType dataType = findDataType(column, typeName);
        if (modifiers != null) {


import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @NotNull DBCExecutionContext executionContext,
    protected final ColumnModifier<OBJECT_TYPE> NotNullModifier = (monitor, column, sql, command) -> {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 *
import org.jkiss.utils.CommonUtils;
                sql.toString()) );
        if (constraint instanceof DBSEntityReferrer) {
import org.jkiss.dbeaver.model.*;
        ) {


                for (DBSEntityConstraint constraint : constraints) {
        @Override
        final String typeName = column.getTypeName();
        if (!hasDDLFeature(command.getObject(), DDL_FEATURE_OMIT_COLUMN_CLAUSE_IN_DROP)) {
                    if (attributeRef.getAttribute() == object) {
    @Override
        DBPDataTypeProvider dataTypeProvider = DBUtils.getParentOfType(DBPDataTypeProvider.class, object);
    public static void addColumnCommentAction(List<DBEPersistAction> actionList, DBSEntityAttribute column, DBSEntity table) {
 * you may not use this file except in compliance with the License.
    }
        public void appendModifier(
    }
                if (dataKind == DBPDataKind.STRING || dataKind == DBPDataKind.DATETIME) {

        return null;
    @Override

    protected StringBuilder getNestedDeclaration(
            throw new DBException("Column type name cannot be empty");
            sql.append(" NOT NULL"); //$NON-NLS-1$
            throw new DBException("Column name cannot be empty");
public abstract class SQLTableColumnManager<OBJECT_TYPE extends DBSEntityAttribute, TABLE_TYPE extends DBSEntity>
                        for (DBSTableIndexColumn indexColumn : attributeReferences) {
        sql.append(' ').append(typeName);
    }
            if (useQuotes) {
        DBPDataTypeProvider dataTypeProvider = DBUtils.getParentOfType(DBPDataTypeProvider.class, object);
        OBJECT_TYPE column = command.getObject();

                    List<? extends DBSTableIndexColumn> attributeReferences = index.getAttributeReferences(monitor);
        if (dataType == null) {
                boolean useQuotes = isUsesQuotes(defaultValue, dataKind);
            Collection<? extends DBSEntityAssociation> associations = parentObject.getAssociations(monitor);
    }

import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;

                        break;
    protected void addObjectCreateActions(
        @NotNull DBRProgressMonitor monitor,
 * Unless required by applicable law or agreed to in writing, software
    }

        DBPDataKind dataKind = column.getDataKind();
    }
        sql.append("ALTER TABLE ").append(DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL)).append(" ADD ");
 */

            Collection<? extends DBSEntityConstraint> constraints = parentObject.getConstraints(monitor);

    }
    public boolean canCreateObject(@NotNull Object container)

            new SQLDatabasePersistAction( ModelMessages.model_jdbc_drop_table_column, ddl.toString())
                                dependentObjectsList.add(index);
            return DBUtils.findBestDataType(dataTypeProvider.getLocalDataTypes(), typeNames);
                    if (!CommonUtils.isEmpty(attributeReferences)) {
    }
    private void addDependentConstraints(DBRProgressMonitor monitor, DBSEntityAttribute object, Set<DBSObject> dependentObjectsList, DBSObject constraint) throws DBException {

        }
                ModelMessages.model_jdbc_create_new_table_column,
            }
    public static final long DDL_FEATURE_OMIT_COLUMN_CLAUSE_IN_DROP = 1;
        @NotNull DBECommandAbstract<OBJECT_TYPE> command,

            sql.append("COLUMN ");
        @NotNull ObjectCreateCommand command,
    {
        protected boolean isUsesQuotes(@NotNull String defaultValue, @NotNull DBPDataKind dataKind) {
        return new ArrayList<>(dependentObjectsList);
                    if (trimmed.isEmpty()) {
    }
            @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.DBException;
        return canEditObject(object);
        if (CommonUtils.isEmpty(command.getObject().getName())) {
        StringBuilder sql = new StringBuilder(256);
                DBPDataKind dataKind = column.getDataKind();
                    final char firstChar = trimmed.charAt(0);
            "Comment column",
                    }
        DBSEntity table = object.getParentObject();

    }
        boolean useBrackets = hasDDLFeature(command.getObject(), DDL_FEATURE_USER_BRACKETS_IN_DROP);
