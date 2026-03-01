    }
    @Override
/*
    @Override
        if (source instanceof DBSEntityReferrer) {
        super(table, source, false);
 *

    public void setCheckClause(String clause) {
        public boolean isValidValue(@NotNull MySQLTableConstraint object, @Nullable Object value) throws IllegalArgumentException {
    }
    public MySQLTableConstraint(MySQLTable table, String name, String description, DBSEntityConstraintType constraintType, boolean persisted, JDBCResultSet resultSet) {
            return object.getDataSource().supportsCheckConstraints();
    }


            List<? extends DBSEntityAttributeRef> columns = ((DBSEntityReferrer) source).getAttributeReferences(monitor);
    public void addColumn(MySQLTableConstraintColumn column) {
        return columns;
 *
 * GenericPrimaryKey
 * DBeaver - Universal Database Manager

    @Override
                        MySQLTableColumn ownCol = table.getAttribute(monitor, col.getAttribute().getName());
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
    private String checkClause;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }
        return checkClause;
    }

        }
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    public void setAttributeReferences(List<MySQLTableConstraintColumn> columns) {
    }
package org.jkiss.dbeaver.ext.mysql.model;
 * Unless required by applicable law or agreed to in writing, software

                for (DBSEntityAttributeRef col : columns) {
        @Override
        this.columns.addAll(columns);
 * You may obtain a copy of the License at
    @NotNull
    public void addAttributeReference(DBSTableColumn column) throws DBException {
        return getTable().getDataSource();
    @Override
    }
        this.columns.add(column);


import org.jkiss.dbeaver.model.DBUtils;
    private final List<MySQLTableConstraintColumn> columns = new ArrayList<>();
                    }
    protected MySQLTableConstraint(DBRProgressMonitor monitor, MySQLTable table, DBSEntityConstraint source) throws DBException {
 */
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
    }
import org.jkiss.dbeaver.DBException;
    public static class MySQLCheckConstraintsValueValidator implements IPropertyValueValidator<MySQLTableConstraint, Object> {
        }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        this.columns.add(new MySQLTableConstraintColumn(this, (MySQLTableColumn) column, columns.size()));
        this.checkClause = JDBCUtils.safeGetString(resultSet, MySQLConstants.COL_CHECK_CLAUSE);
    }
    public MySQLTableConstraint(MySQLTable table, String name, String remarks, DBSEntityConstraintType constraintType, boolean persisted) {
    // Copy constructor
            }
            if (columns != null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.ArrayList;
    }
        return DBUtils.getFullQualifiedName(getDataSource(),
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
/**
    public MySQLDataSource getDataSource() {
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        super(table, name, remarks, constraintType, persisted);
 * you may not use this file except in compliance with the License.
}

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        super(table, name, description, constraintType, persisted, resultSet);
import java.util.List;
    }
            getTable().getContainer(),
public class MySQLTableConstraint extends MySQLTableConstraintBase {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, editable = true, order = 4, visibleIf = MySQLCheckConstraintsValueValidator.class)
import org.jkiss.dbeaver.model.meta.Property;
                    if (col.getAttribute() != null) {
            this);

        this.columns.clear();
    public String getCheckClause() {
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;

            getTable(),
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
import org.jkiss.code.NotNull;
 */
                }
                this.columns.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;

    public List<MySQLTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
                        this.columns.add(new MySQLTableConstraintColumn(this, ownCol, col.getAttribute().getOrdinalPosition()));

        this.checkClause = clause;
