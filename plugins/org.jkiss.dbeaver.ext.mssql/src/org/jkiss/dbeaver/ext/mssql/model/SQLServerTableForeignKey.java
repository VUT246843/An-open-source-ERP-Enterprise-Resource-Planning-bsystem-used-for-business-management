}
        }
import java.util.List;
        this.columns = columns;

import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
 * Unless required by applicable law or agreed to in writing, software
    @Override
 *
            getTable(),
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public void addColumn(SQLServerTableForeignKeyColumn column) {
        return getTable().getDataSource();
                        this,
 *
        boolean persisted
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
            getTable().getContainer(),
    }
            columns = new ArrayList<>();
        SQLServerTableBase table,
    public SQLServerTableForeignKey(
 */
import org.jkiss.dbeaver.DBException;
 */
            monitor,
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableForeignKey;
        return columns;
import org.jkiss.code.Nullable;
    }

            this);
    ) {
/*

    private List<SQLServerTableForeignKeyColumn> columns;
                        table.getAttribute(monitor, fkCol.getReferencedColumn().getName())));
        if (columns == null) {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if (columns != null) {
    @Override
        String name,
import org.jkiss.code.NotNull;
    // Copy constructor
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLServerTableForeignKey(DBRProgressMonitor monitor, SQLServerTableBase table, SQLServerTableForeignKey source) throws DBException {
        DBSForeignKeyModifyRule deleteRule,
 *     http://www.apache.org/licenses/LICENSE-2.0
            for (DBSEntityAttributeRef srcCol : columns) {
 * You may obtain a copy of the License at
    }

        super(
                    DBSTableForeignKeyColumn fkCol = (DBSTableForeignKeyColumn) srcCol;
                        this.columns.size(),
        columns.add(column);
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
/**
        super(table, name, remarks, referencedKey, deleteRule, updateRule, persisted);
    public SQLServerDataSource getDataSource() {
        return DBUtils.getFullQualifiedName(getDataSource(),

 * limitations under the License.
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
                        table.getAttribute(monitor, fkCol.getName()),
public class SQLServerTableForeignKey extends JDBCTableForeignKey<SQLServerTableBase, SQLServerTableForeignKeyColumn, DBSEntityConstraint> {
    }
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                }
            false);

 * DBeaver - Universal Database Manager
    @NotNull
                    this.columns.add(new SQLServerTableForeignKeyColumn(
 *
package org.jkiss.dbeaver.ext.mssql.model;

        DBSEntityConstraint referencedKey,
            }
        DBSForeignKeyModifyRule updateRule,
            source,
        }
    public void setAttributeReferences(List<SQLServerTableForeignKeyColumn> columns) {
            this.columns = new ArrayList<>(columns.size());
            table,
        List<? extends DBSEntityAttributeRef> columns = source.getAttributeReferences(monitor);
                if (srcCol instanceof DBSTableForeignKeyColumn) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.ArrayList;
    }
 * See the License for the specific language governing permissions and
        String remarks,

 * GenericForeignKey
    public List<SQLServerTableForeignKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.DBUtils;
