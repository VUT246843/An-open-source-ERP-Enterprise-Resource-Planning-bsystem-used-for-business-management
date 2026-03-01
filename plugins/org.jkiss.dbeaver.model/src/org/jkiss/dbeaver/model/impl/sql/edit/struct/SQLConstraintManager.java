import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
            decl.append(" CONSTRAINT ").append(constraintName); //$NON-NLS-1$
package org.jkiss.dbeaver.model.impl.sql.edit.struct;


                    .replace(PATTERN_ITEM_TABLE, command.getObject().getTable().getFullyQualifiedName(DBPEvaluationContext.DDL))
                        decl.append(" DESC");
    {
 *

        return FEATURE_EDITOR_ON_CREATE;
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.struct.AbstractTable;
        if (!legacySyntax && !shortNotation) {
    protected String getAddConstraintTypeClause(OBJECT_TYPE constraint) {
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
{
        StringBuilder decl = new StringBuilder(40);
public abstract class SQLConstraintManager<OBJECT_TYPE extends AbstractTableConstraint, TABLE_TYPE extends AbstractTable>
    @Override
    }
                    decl.append(DBUtils.getQuotedIdentifier(attribute));
            decl.append("CONSTRAINT "); //$NON-NLS-1$
        actions.add(
        if ((!legacySyntax || !constraint.isPersisted()) && !shortNotation) {
    {
        actions.add(

            }
                getDropConstraintPattern(command.getObject())
        }
    protected boolean isShortNotation(TABLE_TYPE owner) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
                        continue;
            new SQLDatabasePersistAction(
                }
    protected void appendConstraintDefinition(StringBuilder decl, DBECommandAbstract<OBJECT_TYPE> command) {
                    if (isPrimaryKeyOrdered() && constraintColumn instanceof DBSTableIndexOrdering ordering && !ordering.isAscending()) {
import java.util.List;


 */
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexOrdering;
            List<? extends DBSEntityAttributeRef> attrs = command.getObject().getAttributeReferences(new VoidProgressMonitor());
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
        }
    protected boolean isLegacyConstraintsSyntax(TABLE_TYPE owner) {
        boolean shortNotation = isShortNotation(owner);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        appendConstraintDefinition(decl, command);

    }

        try {
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
    }
 */
        if (legacySyntax) {
        return "ALTER TABLE " + PATTERN_ITEM_TABLE + " DROP CONSTRAINT " + PATTERN_ITEM_CONSTRAINT; //$NON-NLS-1$ //$NON-NLS-2$
                ModelMessages.model_jdbc_create_new_constraint,
    @Override
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
        );

                    final DBSEntityAttribute attribute = constraintColumn.getAttribute();
}
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
            new SQLDatabasePersistAction(
        return false;
            decl.append(constraintName).append(" ");

    }
                    if (!firstColumn) decl.append(","); //$NON-NLS-1$
    @Override
                "ALTER TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + " ADD " + getNestedDeclaration(monitor, table, command, options)));
        return false;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        final TABLE_TYPE table = (TABLE_TYPE) command.getObject().getTable();
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.DBException;
    {
                    }
/*
 * DBeaver - Universal Database Manager
                for (DBSEntityAttributeRef constraintColumn : attrs) {
import org.jkiss.dbeaver.model.DBUtils;
        // Create column
        } catch (DBException e) {
 * JDBC constraint manager
    }
                boolean firstColumn = true;
    protected boolean isPrimaryKeyOrdered() {
            log.warn("Can't obtain attribute references", e);
        return false;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        boolean legacySyntax = isLegacyConstraintsSyntax(owner);
        OBJECT_TYPE constraint = command.getObject();
        return decl;

        return constraint.getConstraintType().getName().toUpperCase(Locale.ENGLISH);
    @NotNull
                ModelMessages.model_jdbc_drop_constraint,
        String constraintName = DBUtils.getQuotedIdentifier(constraint.getDataSource(), constraint.getName());
 * Unless required by applicable law or agreed to in writing, software
        decl.append(" ("); //$NON-NLS-1$
    protected String getDropConstraintPattern(OBJECT_TYPE constraint)
    {
    }
    @Override
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
            return "UNIQUE"; //$NON-NLS-1$
    }

import java.util.Map;
 *
        // Get columns using void monitor
    }
                    firstColumn = false;

 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options)
        }


            if (attrs != null) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        decl.append(")"); //$NON-NLS-1$
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    extends SQLObjectEditor<OBJECT_TYPE, TABLE_TYPE>
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
    {
        }
                    .replace(PATTERN_ITEM_CONSTRAINT, DBUtils.getQuotedIdentifier(command.getObject())))
        }
import java.util.Locale;
    public StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, TABLE_TYPE owner, DBECommandAbstract<OBJECT_TYPE> command, Map<String, Object> options)

        if (constraint.getConstraintType() == DBSEntityConstraintType.UNIQUE_KEY) {
    }


        decl.append(getAddConstraintTypeClause(constraint));
                    if (attribute == null) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.
