
    @NotNull
 * JDBCTableForeignKey
        } else {
                    DBSObject tableContainer = table.getContainer();
import org.jkiss.dbeaver.model.struct.*;


        @NotNull TABLE table,
        this.referencedConstraint = referencedConstraint;
    protected PRIMARY_KEY referencedConstraint;
    {
            DBSEntity refEntity = srcRefConstraint.getParentObject();
            this.updateRule = ((DBSTableForeignKey)source).getUpdateRule();
        @NotNull DBRProgressMonitor monitor,
    @Nullable

        @Override
    @Property(id = "reference", viewable = true, order = 4)
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
                        }
 */
 *
import java.util.List;
    }
            return new DBSForeignKeyModifyRule[] {
    {
        return getReferencedTable();

        @Nullable String description,
                DBSForeignKeyModifyRule.SET_NULL,
                    }
package org.jkiss.dbeaver.model.impl.jdbc.struct;
        if (source instanceof DBSTableForeignKey) {
    implements DBSTableForeignKey
    }
    public static class ConstraintModifyRuleListProvider implements IPropertyValueListProvider<JDBCTableForeignKey> {
            }
        {
        public Object[] getPossibleValues(JDBCTableForeignKey foreignKey)
    public PRIMARY_KEY getReferencedConstraint()
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
                    // Referenced object in the same schema as we are - let's just use it
        @Nullable
/*

import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
import org.jkiss.code.Nullable;
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            List<DBSEntityAttribute> refAttrs = DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) referencedConstraint);
        boolean persisted) throws DBException {
    {
                        if (refTable instanceof DBSEntity && referencedConstraint instanceof DBSEntityReferrer) {
        @Nullable PRIMARY_KEY referencedConstraint,
        DBSForeignKeyModifyRule updateRule,
    }
    public void setReferencedConstraint(PRIMARY_KEY referencedConstraint) {


 * limitations under the License.

        @Override

    PRIMARY_KEY extends DBSEntityConstraint>
/**
                } else {
 * See the License for the specific language governing permissions and
    @Override
 */
            if (refEntity != null) {
        }
            this.updateRule = DBSForeignKeyModifyRule.NO_ACTION;
    }
    @NotNull

    }
{
    }
        DBSEntityConstraint srcRefConstraint = source.getReferencedConstraint();
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return false;
                if (srcRefConstraint instanceof JDBCTableConstraint && refEntity.getParentObject() == table.getParentObject()) {
import org.jkiss.dbeaver.model.meta.Property;
    {
    @Property(viewable = true, editable = true, listProvider = ConstraintModifyRuleListProvider.class, order = 6)
    {

import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public JDBCTableForeignKey(

        public boolean allowCustomValue()
        DBSForeignKeyModifyRule deleteRule,
    {
}
    @Property(viewable = true, editable = true, listProvider = ConstraintModifyRuleListProvider.class, order = 5)


                    // Try to find table with the same name as referenced constraint owner
        super(table, source, persisted);
    }
                            this.referencedConstraint = (PRIMARY_KEY) DBUtils.findEntityConstraint(monitor, (DBSEntity) refTable, refAttrs);
 * DBeaver - Universal Database Manager
        @NotNull String name,
            this.deleteRule = DBSForeignKeyModifyRule.NO_ACTION;
                        DBSObject refTable = ((DBSObjectContainer)tableContainer).getChild(monitor, refEntity.getName());
        this.deleteRule = deleteRule;
                DBSForeignKeyModifyRule.RESTRICT,
    @Override
 *
    @Property(viewable = true, order = 3)
    }
        super(table, name, description, DBSEntityConstraintType.FOREIGN_KEY, persisted);
                    if (tableContainer instanceof DBSObjectContainer) {
    TABLE extends JDBCTable,
        if (srcRefConstraint != null) {
    public TABLE getAssociatedEntity()
                DBSForeignKeyModifyRule.SET_DEFAULT };
 * you may not use this file except in compliance with the License.
    public DBSForeignKeyModifyRule getUpdateRule()
    protected DBSForeignKeyModifyRule deleteRule;

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.referencedConstraint = referencedConstraint;
        this.updateRule = updateRule;
        this.deleteRule = deleteRule;
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull TABLE table,
    @Nullable
    public DBSForeignKeyModifyRule getDeleteRule()
        return deleteRule;
                DBSForeignKeyModifyRule.CASCADE,
 * Unless required by applicable law or agreed to in writing, software
        return referencedConstraint;
                DBSForeignKeyModifyRule.NO_ACTION,
        {
            this.deleteRule = ((DBSTableForeignKey)source).getDeleteRule();
    }
    @Override
        this.updateRule = updateRule;
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
public abstract class JDBCTableForeignKey<
    public void setDeleteRule(DBSForeignKeyModifyRule deleteRule)
                    this.referencedConstraint = (PRIMARY_KEY) srcRefConstraint;
    COLUMN extends DBSTableConstraintColumn,
        return referencedConstraint == null ? null : (TABLE) referencedConstraint.getParentObject();

        boolean persisted)
 *
    extends JDBCTableConstraint<TABLE, COLUMN>
    {
import org.jkiss.code.NotNull;
    }
        }
                }
    public JDBCTableForeignKey(
import org.jkiss.dbeaver.model.DBUtils;
    @Nullable
        }

    public void setUpdateRule(DBSForeignKeyModifyRule updateRule)
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        return updateRule;

    }
    public TABLE getReferencedTable()
    @Override
        @NotNull DBSEntityAssociation source,
    protected DBSForeignKeyModifyRule updateRule;
    {
