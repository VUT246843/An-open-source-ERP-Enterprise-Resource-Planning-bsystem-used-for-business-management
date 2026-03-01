        StringBuilder decl = new StringBuilder(40);
 * See the License for the specific language governing permissions and
    private StringBuilder getNestedDeclarationScript(TABLE_TYPE owner, DBECommandAbstract<OBJECT_TYPE> command, Map<String, Object> options)
            (uniqueKey == null ? "" : CommonUtils.escapeIdentifier(targetTable.getName()) + "_") + "FK"; //$NON-NLS-1$
    public static final String OPTION_REF_TABLE = "refTable";
                        return refKeyClass.cast(entityConstraint);
                    .replace(PATTERN_ITEM_CONSTRAINT, DBUtils.getQuotedIdentifier(command.getObject())))
    public static final String OPTION_REF_ATTRIBUTES = "refAttributes";
                getDropForeignKeyPattern(command.getObject())

    @Override

                    }
                firstColumn = false;
    {
        DBSEntity targetTable = uniqueKey == null ? null : uniqueKey.getParentObject();
                        (Collection<? extends DBSEntityAttribute>) refAttrs);
    }
 */

        if (refTable instanceof DBSEntity) {
            log.debug("Foreign key manager not found for " + foreignKey.getClass().getName());
            refConstraint == null ? "<?>" : DBUtils.getEntityScriptName(refConstraint.getParentObject(), options);
 * You may obtain a copy of the License at
        }
    {
 *

        }
                return constrName;
package org.jkiss.dbeaver.model.impl.sql.edit.struct;
                        decl.append(DBUtils.getQuotedIdentifier(attribute));
        }
                for (DBSEntityAttributeRef constraintColumn : CommonUtils.safeCollection(columns)) {
        }
import java.util.List;


            new SQLDatabasePersistAction(
                    log.debug("Error searching constraint by attributes", e);
import org.jkiss.utils.CommonUtils;
        boolean legacySyntax = isLegacyForeignKeySyntax(owner);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        return decl;

        actions.add(
        if (refConstraint instanceof DBSEntityReferrer) {

            decl.append(" ON UPDATE ").append(updateRule.getClause()); //$NON-NLS-1$
        decl.append(")"); //$NON-NLS-1$
    }
        }
    @Override
import org.jkiss.dbeaver.model.DBUtils;
    public static final String OPTION_REF_CONSTRAINT = "refConstraint";
            new SQLDatabasePersistAction(
                        (DBSEntity) refTable,
                    DBSEntityConstraint entityConstraint = DBUtils.findEntityConstraint(
            decl.append("CONSTRAINT ");
            return baseName;
        }
        for (int i = 0; ; i++) {
            if (child == null) {
            if (refAttrs instanceof Collection) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    protected String getNewConstraintName(DBRProgressMonitor monitor, OBJECT_TYPE foreignKey) {
                    if (!firstColumn) decl.append(","); //$NON-NLS-1$
        String baseName = CommonUtils.escapeIdentifier(table.getName()) + "_" + //$NON-NLS-1$
import org.jkiss.dbeaver.model.impl.struct.AbstractTable;
                        monitor,
    }
        return CommonUtils.escapeIdentifier(table.getName()) + "_" + //$NON-NLS-1$
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            Object refAttrs = options.get(OPTION_REF_ATTRIBUTES);
        SQLForeignKeyManager objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(

        return FEATURE_EDITOR_ON_CREATE;
    protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectDeleteCommand command, @NotNull Map<String, Object> options) throws DBException
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    }
        DBSEntityConstraint uniqueKey = foreignKey.getReferencedConstraint();
        } else {
        );
        if (updateRule != null && !CommonUtils.isEmpty(updateRule.getClause())) {
        }
            foreignKey.getClass(), SQLForeignKeyManager.class);

        DBSEntity targetTable = uniqueKey == null ? null : uniqueKey.getParentObject();
        try {
import org.jkiss.dbeaver.DBException;
        decl.append(foreignKey.getConstraintType().getName().toUpperCase(Locale.ENGLISH)) //$NON-NLS-1$

        }
                    firstColumn = false;
            foreignKey.setName(fkName);

        if (deleteRule != null && !CommonUtils.isEmpty(deleteRule.getClause())) {
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

        }
    }
    }
    public static String generateConstraintName(DBSEntity table, DBSEntityConstraint uniqueKey) {
public abstract class SQLForeignKeyManager<OBJECT_TYPE extends AbstractTableConstraint & DBSTableForeignKey, TABLE_TYPE extends AbstractTable>
    protected StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, TABLE_TYPE owner, DBECommandAbstract<OBJECT_TYPE> command, Map<String, Object> options) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
        actions.add(
        final DBSEntityConstraint refConstraint = foreignKey.getReferencedConstraint();
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    protected boolean isLegacyForeignKeySyntax(TABLE_TYPE owner) {
        return null;
        Object refConstraint = options.get(OPTION_REF_CONSTRAINT);
                } catch (DBException e) {

    }
                final DBSEntityAttribute attribute = constraintColumn.getAttribute();

        }
    {
                }
 *
        if (!legacySyntax || !foreignKey.isPersisted() || constraintDuplicated) {
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 *
    public long getMakerOptions(@NotNull DBPDataSource dataSource)
                    if (refKeyClass.isInstance(entityConstraint)) {
        DBSForeignKeyModifyRule updateRule = foreignKey.getUpdateRule();
                log.error("Can't obtain ref constraint reference attributes", e);
        Object refTable = options.get(OPTION_REF_TABLE);
            String constrName = DBObjectNameCaseTransformer.transformName(foreignKey.getDataSource(), i == 0 ? baseName : (baseName + "_" + i));
import org.jkiss.dbeaver.model.messages.ModelMessages;
    }
    {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
            .append(" ("); //$NON-NLS-1$
/*
        final TABLE_TYPE table = (TABLE_TYPE) command.getObject().getTable();
        final String refTableName =
        }
    public static <FK extends AbstractTableConstraint> void updateForeignKeyName(
                if (!firstColumn) decl.append(","); //$NON-NLS-1$
        return getNestedDeclarationScript(owner, command, options);
                ModelMessages.model_jdbc_create_new_foreign_key,

    protected void appendUpdateDeleteRule(OBJECT_TYPE foreignKey, StringBuilder decl) {
import java.util.Collection;

                }
    protected String getDropForeignKeyPattern(OBJECT_TYPE constraint)

import org.jkiss.dbeaver.model.struct.*;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        boolean constraintDuplicated = isFKConstraintDuplicated(owner);
            decl.append(" CONSTRAINT ").append(constraintName); //$NON-NLS-1$
        String constraintName = DBUtils.getQuotedIdentifier(foreignKey.getDataSource(), foreignKey.getName());
                "ALTER TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + " ADD " + getNestedDeclaration(monitor, table, command, options)) //$NON-NLS-1$ //$NON-NLS-2$

{
            decl.append(constraintName).append(" "); //$NON-NLS-1$
        );
 * JDBC foreign key manager

        @NotNull DBRProgressMonitor monitor,
    }
}
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
            final Collection<? extends DBSEntityAttributeRef> columns = command.getObject().getAttributeReferences(new VoidProgressMonitor());
            (uniqueKey == null ? "" : CommonUtils.escapeIdentifier(targetTable.getName()) + "_") + "FK"; //$NON-NLS-1$
 * Copyright (C) 2010-2024 DBeaver Corp and others
        decl.append(") REFERENCES ").append(refTableName).append("("); //$NON-NLS-1$ //$NON-NLS-2$

        } catch (DBException e) {
                    .replace(PATTERN_ITEM_TABLE, command.getObject().getTable().getFullyQualifiedName(DBPEvaluationContext.DDL))
            }
        @NotNull FK foreignKey) {
            // Get columns using void monitor
            DBSObject child = objectsCache.getCachedObject(constrName);
    }
            } catch (DBException e) {
                ModelMessages.model_jdbc_drop_foreign_key,
    @Override
                try {
            try {
            }
    public static final String OPTION_OWN_ATTRIBUTES = "ownAttributes";
        if (objectsCache == null) {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        if (objectManager == null) {
import java.util.Locale;
import org.jkiss.dbeaver.model.DBPDataSource;
        if (legacySyntax) {
        return "ALTER TABLE " + PATTERN_ITEM_TABLE + " DROP CONSTRAINT " + PATTERN_ITEM_CONSTRAINT; //$NON-NLS-1$ //$NON-NLS-2$
 * limitations under the License.
            boolean firstColumn = true;
/**
                if (attribute != null) {
    extends SQLObjectEditor<OBJECT_TYPE, TABLE_TYPE>

        appendUpdateDeleteRule(foreignKey, decl);

                }
    {
        DBSObjectCache<? extends DBSObject, OBJECT_TYPE> objectsCache = getObjectsCache(foreignKey);
    protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options) throws DBException
        TABLE_TYPE table = (TABLE_TYPE) foreignKey.getParentObject();
                    if (attribute != null) {
 * Unless required by applicable law or agreed to in writing, software
        return false;
    protected boolean isFKConstraintDuplicated(TABLE_TYPE owner) {
        return false;
        }
    }
                    }
                    decl.append(DBUtils.getQuotedIdentifier(attribute));
            }
            for (DBSEntityAttributeRef constraintColumn : CommonUtils.safeCollection(columns)) {
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
            String fkName = objectManager.getNewConstraintName(monitor, foreignKey);
            log.error("Can't obtain reference attributes", e);
import java.util.Map;
        if (refKeyClass.isInstance(refConstraint)) {
    }
    @Override
    protected <T extends DBSEntityConstraint> T getReferencedKey(DBRProgressMonitor monitor, TABLE_TYPE table, Class<T> refKeyClass, Map<String, Object> options) {
                List<? extends DBSEntityAttributeRef> columns = ((DBSEntityReferrer) refConstraint).getAttributeReferences(new VoidProgressMonitor());

        // Create column
        DBSForeignKeyModifyRule deleteRule = foreignKey.getDeleteRule();
        OBJECT_TYPE foreignKey = command.getObject();
import org.jkiss.dbeaver.runtime.DBWorkbench;

 * distributed under the License is distributed on an "AS IS" BASIS,
            return refKeyClass.cast(refConstraint);

    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.code.NotNull;
            decl.append(" ON DELETE ").append(deleteRule.getClause()); //$NON-NLS-1$
                boolean firstColumn = true;
                    final DBSEntityAttribute attribute = constraintColumn.getAttribute();
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;

        if (!legacySyntax) {
    }
