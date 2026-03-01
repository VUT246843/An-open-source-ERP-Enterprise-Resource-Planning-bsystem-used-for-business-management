package org.jkiss.dbeaver.ext.mysql.model;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
        DBSForeignKeyModifyRule deleteRule,
            getTable(),
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
 *
        return super.getDeleteRule();

    }

        DBSForeignKeyModifyRule updateRule,

import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * limitations under the License.
    @Override
                            this.columns.size(),
        }
        return getTable().getDataSource();
    public MySQLTableForeignKey(
 * Copyright (C) 2010-2026 DBeaver Corp and others
import java.util.ArrayList;
 * GenericForeignKey
                    if (srcCol instanceof DBSTableForeignKeyColumn) {
/**
    public List<MySQLTableForeignKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
    {
    {
        }
    public void setAttributeReferences(List<MySQLTableForeignKeyColumn> columns) throws DBException {
    }
    }
 */
        }
    @Override
{

 * you may not use this file except in compliance with the License.
            this);


            String refName = column.getReferencedColumn().getName();
 *
    public DBSForeignKeyModifyRule getUpdateRule() {
            List<? extends DBSEntityAttributeRef> columns = ((DBSEntityReferrer) source).getAttributeReferences(monitor);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;

    public boolean hasColumn(MySQLTableForeignKeyColumn column) {
 * DBeaver - Universal Database Manager
                }
/*

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
        return DBUtils.getFullQualifiedName(getDataSource(),
                if (columnName.equals(col.getName()) &&
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Copy constructor
        String remarks,
        this.columns = columns;
            getTable().getContainer(),
            for (MySQLTableForeignKeyColumn col : columns) {
    @Override
    {
        String name,
    }
import java.util.List;
            String columnName = column.getName();
                    refName.equals(col.getReferencedColumn().getName())) {
                        this.columns.add(new MySQLTableForeignKeyColumn(
                    }
    }
            columns = new ArrayList<>();
        MySQLTable table,
    }
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableForeignKey;
import org.jkiss.dbeaver.DBException;

                            table.getAttribute(monitor, fkCol.getName()),
    public void addColumn(MySQLTableForeignKeyColumn column)
 * See the License for the specific language governing permissions and
    public MySQLTableForeignKey(DBRProgressMonitor monitor, MySQLTable table, DBSEntityAssociation source) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (columns != null) {
    public DBSForeignKeyModifyRule getDeleteRule() {
 */
        columns.add(column);
            table,
        super(
    @NotNull

            }
import org.jkiss.dbeaver.model.DBUtils;
    }
    @Override
        return columns;
    private List<MySQLTableForeignKeyColumn> columns;
}
import org.jkiss.dbeaver.model.meta.Property;
        MySQLTableConstraint referencedKey,
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
    @Property(viewable = true, editable = true, updatable = true, listProvider = ConstraintModifyRuleListProvider.class, order = 6)
import org.jkiss.code.Nullable;
    @Property(viewable = true, editable = true, updatable = true, listProvider = ConstraintModifyRuleListProvider.class, order = 5)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
        boolean persisted)
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        return false;

        return super.getUpdateRule();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                    return true;
        super(table, name, remarks, referencedKey, deleteRule, updateRule, persisted);
                            this,
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
            monitor,
 *
    @NotNull
    }
    @NotNull
    public MySQLDataSource getDataSource()
    {
            false);
        if (columns == null) {
    @Override
public class MySQLTableForeignKey extends JDBCTableForeignKey<MySQLTable, MySQLTableForeignKeyColumn, MySQLTableConstraint>
                        DBSTableForeignKeyColumn fkCol = (DBSTableForeignKeyColumn) srcCol;
                for (DBSEntityAttributeRef srcCol : columns) {
    @Override
        if (source instanceof DBSEntityReferrer) {
    }
    }
        if (columns != null && column.getReferencedColumn() != null) {
    @NotNull
                            table.getAttribute(monitor, fkCol.getReferencedColumn().getName())));
            source,

                this.columns = new ArrayList<>(columns.size());
