import java.util.ArrayList;
    public void setAttributeReferences(List<OracleTableConstraintColumn> columns) {
/**
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
public abstract class OracleTableConstraintBase extends JDBCTableConstraint<OracleTableBase, OracleTableConstraintColumn> {
 *


 * DBeaver - Universal Database Manager
        return constraintType;
    private final List<OracleTableConstraintColumn> columns = new ArrayList<>();
 * OracleTableConstraint
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.Log;
    }
 * See the License for the specific language governing permissions and
    public void addAttributeReference(DBSTableColumn column) throws DBException {
package org.jkiss.dbeaver.ext.oracle.model;
 */
    public OracleObjectStatus getStatus() {
    }

    }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, editable = false, valueTransformer = DBObjectNameCaseTransformer.class, order = 3)
 * limitations under the License.

import org.jkiss.dbeaver.model.meta.Property;
    @Override
    private static final Log log = Log.getLog(OracleTableConstraintBase.class);
import java.util.List;
import org.jkiss.code.Nullable;
    @Override
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        this.columns.add(column);
        this.columns.add(new OracleTableConstraintColumn(this, (OracleTableColumn) column, columns.size()));
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    @NotNull
    protected OracleTableConstraintBase(OracleTableBase oracleTableBase, String name, String description, DBSEntityConstraintType constraintType, boolean persisted) {
    }
 *
 *
    public DBSEntityConstraintType getConstraintType() {
 * You may obtain a copy of the License at
        return columns;
    @Override
    }
    public List<OracleTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {

    public OracleDataSource getDataSource() {
}

    @Property(viewable = true, editable = false, order = 9)
        super(oracleTableBase, name, description, constraintType, persisted);
 * distributed under the License is distributed on an "AS IS" BASIS,
        return getTable().getDataSource();


        this.status = status;

import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;

        super(oracleTable, name, null, constraintType, persisted);


/*
        this.columns.addAll(columns);
    public OracleTableConstraintBase(OracleTableBase oracleTable, String name, DBSEntityConstraintType constraintType, OracleObjectStatus status, boolean persisted) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private OracleObjectStatus status;

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        this.columns.clear();


        return status;
    }
    public void addColumn(OracleTableConstraintColumn column) {
