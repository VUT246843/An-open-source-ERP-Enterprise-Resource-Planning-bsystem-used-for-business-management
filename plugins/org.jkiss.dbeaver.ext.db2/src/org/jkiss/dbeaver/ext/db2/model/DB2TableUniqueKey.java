
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.columns.addAll(columns);

        this.ownerType = DB2OwnerType.U;
 * Licensed under the Apache License, Version 2.0 (the "License");
    // -----------------
    private DB2OwnerType ownerType;
        this.enforced = JDBCUtils.safeGetBoolean(dbResult, "ENFORCED", DB2YesNo.Y.name());

import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
 * DB2 Table Unique Key
    @Property(viewable = true, editable = false, order = 3)


    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @NotNull
        super(db2Table, null, null, constraintType, false);
    @Property(viewable = false, editable = false)

 */
    }
        this.enableQueryOpt = JDBCUtils.safeGetBoolean(dbResult, "ENABLEQUERYOPT", DB2YesNo.Y.name());
    public void setAttributeReferences(List<DB2TableKeyColumn> columns) {
    @Nullable
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    public String getDescription() {
        return enableQueryOpt;

    // -----------------
        }
    private final List<DB2TableKeyColumn> columns = new ArrayList<>();
        if (db2DataSource.isAtLeastV10_1()) {
    }
    }
    @Property(viewable = false, editable = false)
    @Override
 * See the License for the specific language governing permissions and

 * you may not use this file except in compliance with the License.

        return trusted;

 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.List;
    }
    private String owner;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
    public String getOwner() {
    // -----------------
    public DB2OwnerType getOwnerType() {
        super(table, JDBCUtils.safeGetString(dbResult, "CONSTNAME"), null, type, true);
        return checkExistingData;

import org.jkiss.code.NotNull;
 * limitations under the License.
import org.jkiss.dbeaver.ext.db2.model.dict.DB2ConstraintCheckData;
    private Boolean trusted;

    private Boolean enforced;
    @NotNull
        throws DBException {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    // Columns
    public Boolean getTrusted() {
        columns.add(new DB2TableKeyColumn(this, (DB2TableColumn) column, columns.size()));

import java.util.ArrayList;
    public DB2ConstraintCheckData getCheckExistingData() {

 * Unless required by applicable law or agreed to in writing, software
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
        return super.getTable();
    public void addAttributeReference(DBSTableColumn column) throws DBException {
 * DBeaver - Universal Database Manager
    }
    // -----------------
        return enforced;
    }
    // Constructor

public class DB2TableUniqueKey extends JDBCTableConstraint<DB2Table, DB2TableKeyColumn> {
        return ownerType;

    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
    }

    private DB2ConstraintCheckData checkExistingData;
 *
 *
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;


        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getContainer(), getTable(), this);
    }
        this.columns.clear();
import org.jkiss.dbeaver.model.DBUtils;

        return columns;
        if (db2DataSource.isAtLeastV9_5()) {
import java.sql.ResultSet;
    // Business Contract
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
import org.jkiss.code.Nullable;
/**
            this.trusted = JDBCUtils.safeGetBoolean(dbResult, "TRUSTED", DB2YesNo.Y.name());
import org.jkiss.dbeaver.DBException;
    @Property(viewable = false, editable = false)
/*
    public List<DB2TableKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {

        }
    private Boolean enableQueryOpt;
 *
    public DBSEntityConstraintType getConstraintType() {
 *
    public Boolean getEnforced() {
    @Override

    }
        return super.getConstraintType();
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
            JDBCUtils.safeGetString(dbResult, "CHECKEXISTINGDATA"));


 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public DB2TableUniqueKey(DB2Table db2Table, DBSEntityConstraintType constraintType) {
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    private String remarks;
    }
    @Override
    public DB2Table getTable() {
    @Property(viewable = true, editable = false, order = 2)
package org.jkiss.dbeaver.ext.db2.model;

        return owner;
    // -----------------
    @Override
}
 */
    @Property(viewable = false, editable = false)
    public DBPDataSource getDataSource() {
    public DB2TableUniqueKey(DBRProgressMonitor monitor, DB2Table table, ResultSet dbResult, DBSEntityConstraintType type)
    @Override
        this.checkExistingData = CommonUtils.valueOf(DB2ConstraintCheckData.class,
    @Override
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    }
    @Property(viewable = true, editable = false, length = PropertyLength.MULTILINE, order = 4)
 * @author Denis Forveille
    // -----------------
    @NotNull
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBPDataSource;

import org.jkiss.dbeaver.model.meta.PropertyLength;
    // -----------------
        DB2DataSource db2DataSource = table.getDataSource();

        return getTable().getDataSource();
    public Boolean getEnableQueryOpt() {
        return remarks;
    @Override
    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.meta.Property;
    // Properties
    // -----------------
