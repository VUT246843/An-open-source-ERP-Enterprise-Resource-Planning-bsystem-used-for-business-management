

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
            log.warn("Referenced table '" + DBUtils.getSimpleQualifiedName(refOwnerName, refTableName) + "' not found");
            table,

    @Override
    public DBSForeignKeyModifyRule getUpdateRule()
            switch (deleteRuleName) {
                CommonUtils.valueOf(OracleObjectStatus.class, JDBCUtils.safeGetStringTrimmed(dbResult, OracleConstants.COLUMN_STATUS)),
package org.jkiss.dbeaver.ext.oracle.model;
    private DBSForeignKeyModifyRule deleteRule;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return referencedKey;
        String deleteRuleName = JDBCUtils.safeGetString(dbResult, "DELETE_RULE");
import java.sql.ResultSet;
    {
    @Property(viewable = true, order = 3)
        String refTableName = JDBCUtils.safeGetString(dbResult, "R_TABLE_NAME");
            JDBCUtils.safeGetString(dbResult, OracleConstants.COL_CONSTRAINT_NAME),
                default:
                    break;
        return DBUtils.getFullQualifiedName(getDataSource(),
            this);
                    this.deleteRule = DBSForeignKeyModifyRule.NO_ACTION;
    {
        OracleTable table,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            true);
    public OracleTableConstraint getReferencedConstraint()

    }
        {
    @Nullable

    public OracleTableForeignKey(
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;


    @NotNull
        return DBSForeignKeyModifyRule.NO_ACTION;
 * OracleTableForeignKey
            }


    private static final Log log = Log.getLog(OracleTableForeignKey.class);
                case "SET NULL":
 * Unless required by applicable law or agreed to in writing, software
    }
    }
        public Object[] getPossibleValues(JDBCTableForeignKey foreignKey)
import org.jkiss.dbeaver.model.meta.Property;
    }
    public OracleTableBase getAssociatedEntity()
 * limitations under the License.
                DBSForeignKeyModifyRule.SET_NULL,
    public void setReferencedConstraint(OracleTableConstraint referencedKey) {
import org.jkiss.code.Nullable;
    @Override
    @Property(id = "reference", viewable = true, order = 4)
        this.referencedKey = referencedKey;

        this.deleteRule = deleteRule;
            CommonUtils.notNull(
    private OracleTableConstraint referencedKey;
}
        @Nullable String name,
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableForeignKey;
    @Override
    }
/*
/**
        return deleteRule;
        super(oracleTable, name, DBSEntityConstraintType.FOREIGN_KEY, status, false);
                case "CASCADE":
                DBSForeignKeyModifyRule.RESTRICT,
        @Override
        this.referencedKey = referencedKey;
    {
 *
    @Nullable
    {
        DBRProgressMonitor monitor,
        public boolean allowCustomValue()
    }
    }
        @Nullable OracleTableConstraint referencedKey,
        super(
        @Override
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    @Property(viewable = true, editable = true, listProvider = ConstraintModifyRuleListProvider.class, order = 5)
import org.jkiss.code.NotNull;
    }
                    this.deleteRule = DBSForeignKeyModifyRule.SET_NULL;
 * See the License for the specific language governing permissions and

        String refOwnerName = JDBCUtils.safeGetString(dbResult, "R_OWNER");
    public OracleTableForeignKey(
    public DBSForeignKeyModifyRule getDeleteRule()
                referencedKey = new OracleTableConstraint(refTable, "refName", DBSEntityConstraintType.UNIQUE_KEY, null, OracleObjectStatus.ERROR);
            this.deleteRule = DBSForeignKeyModifyRule.NO_ACTION;
    @NotNull
                DBSForeignKeyModifyRule.NO_ACTION,
        {

        String refName = JDBCUtils.safeGetString(dbResult, "R_CONSTRAINT_NAME");
            getTable(),
    {
import org.jkiss.utils.CommonUtils;
        @NotNull OracleTableBase oracleTable,
import org.jkiss.dbeaver.Log;
        @Nullable OracleObjectStatus status,
            return false;
 * You may obtain a copy of the License at
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        ResultSet dbResult)
        } else {
 *
            refTableName);
    }
    public void setDeleteRule(DBSForeignKeyModifyRule deleteRule) {
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
                case "NO ACTION":
 */


                DBSForeignKeyModifyRule.SET_DEFAULT };
        }
                OracleObjectStatus.ENABLED),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        if (CommonUtils.isEmpty(deleteRuleName)) {
    {
            refOwnerName,
    {

        return referencedKey == null ? null : referencedKey.getTable();
                log.warn("Referenced constraint '" + refName + "' not found in table '" + refTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        if (refTable == null) {
    @Override
        }
            return new DBSForeignKeyModifyRule[] {
public class OracleTableForeignKey extends OracleTableConstraintBase implements DBSTableForeignKey
        OracleTableBase refTable = OracleTableBase.findTable(
        }
{
            if (referencedKey == null) {
    }
                    break;
        throws DBException
        }


        @NotNull DBSForeignKeyModifyRule deleteRule)
            getTable().getContainer(),
        return getReferencedTable();
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
                DBSForeignKeyModifyRule.CASCADE,
            DBSEntityConstraintType.FOREIGN_KEY,
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
import org.jkiss.dbeaver.DBException;
            table.getDataSource(),
    public static class ConstraintModifyRuleListProvider implements IPropertyValueListProvider<JDBCTableForeignKey> {
            referencedKey = refTable.getConstraint(monitor, refName);
    // Update rule is not supported by Oracle

            monitor,
 *
                    this.deleteRule = DBSForeignKeyModifyRule.CASCADE;
        @Nullable

    {
        } else {
        this.deleteRule = deleteRule;
    }
    public OracleTableBase getReferencedTable()
                    break;
