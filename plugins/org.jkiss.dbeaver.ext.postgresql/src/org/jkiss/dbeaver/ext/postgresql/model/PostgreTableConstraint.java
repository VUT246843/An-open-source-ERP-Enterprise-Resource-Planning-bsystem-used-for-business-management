 * DBeaver - Universal Database Manager

        }

        this.columns.add(column);
        super(monitor, owner, srcConstr);
        columns.addAll(children);
    }
                this.source = JDBCUtils.safeGetString(resultSet, "consrc");
            }
 *
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    @Override
            PostgreTableColumn ownAttr = owner.getAttribute(monitor, srcCol.getAttribute().getName());
import org.jkiss.code.Nullable;
        String sourceCopy = JDBCUtils.safeGetString(resultSet, "consrc_copy");
 * You may obtain a copy of the License at
        }

        return source;
    public String getSource() {
    void cacheAttributes(DBRProgressMonitor monitor, List<? extends PostgreTableConstraintColumn> children, boolean secondPass) {
public class PostgreTableConstraint extends PostgreTableConstraintBase<PostgreTableConstraintColumn> {
    }
    {
 * PostgreTableConstraint
                this.columns.add(new PostgreTableConstraintColumn(this, ownAttr, this.columns.size()));
 * limitations under the License.
    @Override
    @Override

            return;

    public void addAttributeReference(DBSTableColumn column) throws DBException {
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
        if (sourceCopy == null && getDataSource().getServerType().supportsPGConstraintExpressionColumn()) {
/**
        return columns;
        columns.clear();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                this.source = null;

        super(table, name, constraintType, resultSet);
    public PostgreTableConstraint(PostgreTableBase table, String constraintName, DBSEntityConstraintType constraintType) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        this.columns.addAll(columns);
    public void addColumn(PostgreTableConstraintColumn column) {
 * you may not use this file except in compliance with the License.
        super(table, constraintName, constraintType);
import org.jkiss.dbeaver.model.meta.Property;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, editable = true, order = 10)
 * Unless required by applicable law or agreed to in writing, software
 */
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public List<PostgreTableConstraintColumn> getColumns() {
        this.source = srcConstr.source;
            if (!getDataSource().isServerVersionAtLeast(12, 0)) {
        }
    public PostgreTableConstraint(PostgreTableBase table, String name, DBSEntityConstraintType constraintType, JDBCResultSet resultSet) throws DBException {
            this.source = sourceCopy;
    }
}


        if (secondPass) {
package org.jkiss.dbeaver.ext.postgresql.model;
    private final List<PostgreTableConstraintColumn> columns = new ArrayList<>();
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public List<PostgreTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
import org.jkiss.dbeaver.DBException;
    public void setAttributeReferences(List<PostgreTableConstraintColumn> columns) throws DBException {
    }
 */
            if (ownAttr != null) {

    @Override

    private String source;
        this.source = source;
    public void setSource(String source) {
    public PostgreTableConstraint(DBRProgressMonitor monitor, PostgreTableReal owner, PostgreTableConstraint srcConstr) throws DBException {
        return columns;

            }
        columns.add(new PostgreTableConstraintColumn(this, (PostgreAttribute<?>) column, columns.size()));
import java.util.ArrayList;
        for (PostgreTableConstraintColumn srcCol : srcConstr.columns) {
    }
    private static final Log log = Log.getLog(PostgreTableConstraint.class);
    }
            } else {
    }
import java.util.List;
 * See the License for the specific language governing permissions and



    }
        this.columns.clear();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 *
        } else {
