            this);

    public void setAttributeReferences(List<DBSTableConstraintColumn> columns) {
 * SQLServerTableUniqueKey
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
        this.index = table.getIndex(monitor, source.getName());
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
        }
    public void addAttributeReference(DBSTableColumn column) throws DBException {
 * DBeaver - Universal Database Manager
    public void addColumn(SQLServerTableUniqueKeyColumn column) {
import org.jkiss.utils.CommonUtils;
}
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
 *
    @Override
    public List<DBSTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
    @Override
        return indexAttrs == null ? null : new ArrayList<>(indexAttrs);
        for (DBSEntityAttributeRef ar : columns) {
 * you may not use this file except in compliance with the License.
            return null;
        super(table, source, false);
 *
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @NotNull
import org.jkiss.code.Nullable;



import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private final SQLServerTableIndex index;
    }
import org.jkiss.dbeaver.model.meta.Property;
    }
 */
/**
        return index;
    // Copy constructor



    }
package org.jkiss.dbeaver.ext.mssql.model;
    }
            getTable().getDatabase(),
    public SQLServerTableIndex getIndex() {
        if (!CommonUtils.isEmpty(columns)) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

        }
        if (index == null) {
        List<SQLServerTableIndexColumn> indexAttrs = index.getAttributeReferences(monitor);
public class SQLServerTableUniqueKey extends JDBCTableConstraint<SQLServerTableBase, DBSTableConstraintColumn> {
 * limitations under the License.
import org.jkiss.code.NotNull;

    }
        this.index = index;
 * Unless required by applicable law or agreed to in writing, software

        this.columns.add(column);
        return DBUtils.getFullQualifiedName(getDataSource(),
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return getTable().getDataSource();
import java.util.ArrayList;
            this.columns.add((SQLServerTableUniqueKeyColumn)ar);
    protected SQLServerTableUniqueKey(DBRProgressMonitor monitor, SQLServerTableBase table, DBSEntityConstraint source) throws DBException {
        this.columns.add(new SQLServerTableUniqueKeyColumn(this, (SQLServerTableColumn) column, columns.size()));
import java.util.List;
    public SQLServerDataSource getDataSource() {

 *
import org.jkiss.dbeaver.model.DBUtils;
    private final List<SQLServerTableUniqueKeyColumn> columns = new ArrayList<>();
            return new ArrayList<>(columns);
            getTable().getSchema(),
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    public SQLServerTableUniqueKey(SQLServerTableBase table, String name, String remarks, DBSEntityConstraintType constraintType, SQLServerTableIndex index, boolean persisted) {
            getTable(),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        this.columns.clear();
    @NotNull
    @Property(viewable = true, order = 10)
    }
/*
        super(table, name, remarks, constraintType, persisted);
    }
