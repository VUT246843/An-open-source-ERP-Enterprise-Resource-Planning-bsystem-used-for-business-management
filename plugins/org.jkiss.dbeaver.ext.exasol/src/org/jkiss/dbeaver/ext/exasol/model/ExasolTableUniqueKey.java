import org.jkiss.code.NotNull;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        return super.getConstraintType();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
	}
import org.jkiss.dbeaver.DBException;
        this.owner = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_OWNER");
	public boolean hasColumn(ExasolTableColumn column)
        return getTable().getDataSource();

    @Property(viewable = true, editable = false, order = 3)

    public String getOwner() {

 *
    public Boolean getEnabled() {
import org.jkiss.dbeaver.model.meta.PropertyLength;
		this.enabled = enable;
 * See the License for the specific language governing permissions and
    }
    @Override
    }
	{
    // -----------------
    }
    // CONSTRUCTOR

	public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options)
    }
	{
import java.util.ArrayList;
    // -----------------
                if (constColumn.getAttribute() == column) {
	
    @Override
    // Properties
 * limitations under the License.
        this.columns.addAll(columns);
    @Override
        this.enabled = JDBCUtils.safeGetBoolean(dbResult, "CONSTRAINT_ENABLED");
    public ExasolTableUniqueKey(

    public String getDescription() {

        return false;
            for (ExasolTableKeyColumn constColumn : columns) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    		Boolean enabled,

 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.sql.ResultSet;
    public List<ExasolTableKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {

import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
 *
    }
        this.columns.clear();
	{
    @Nullable
    @Property(viewable = false, editable = false, length = PropertyLength.MULTILINE, order = 4)
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public ExasolTableUniqueKey(DBRProgressMonitor monitor, ExasolTable table, ResultSet dbResult, DBSEntityConstraintType type)

    }
    @NotNull
    @Property(viewable = true, editable = true, updatable = true)
	public void setEnabled(Boolean enable)
 * @author Karl Griesser


    public ExasolTable getTable() {
}
        return super.getTable();

 * you may not use this file except in compliance with the License.
    private final List<ExasolTableKeyColumn> columns = new ArrayList<>();
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    implements DBSEntityReferrer,DBPScriptObject, DBPNamedObject2 {
    public DBPDataSource getDataSource() {
    // Business Contract
        if (this.columns != null) {
    public void setAttributeReferences(List<ExasolTableKeyColumn> columns) {
    

    @NotNull
			throws DBException
 * DBeaver - Universal Database Manager
import java.util.Map;
        throws DBException {
    
        this.enabled = enabled;

 */
    private String owner;
    }
    @Property(viewable = false, editable = false, category = ExasolConstants.CAT_OWNER)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    		) {
    
    @Override

    public DBSEntityConstraintType getConstraintType() {
	@NotNull

    @Override
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
	}
    // -----------------
                    return true;

        return columns;

import java.util.List;

        }
    @Override
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
    }

        return enabled;
    // -----------------
import org.jkiss.dbeaver.model.*;
	}
    // -----------------
import org.jkiss.dbeaver.model.meta.Property;
        super(table, JDBCUtils.safeGetString(dbResult, "CONSTRAINT_NAME"), null, type, true);
/**
    // Columns
import org.jkiss.code.Nullable;

package org.jkiss.dbeaver.ext.exasol.model;
/*
            }
    @Override

    @Property(viewable = true, editable = false, order = 2)
    }
    		String name
    		DBSEntityConstraintType constraintType,
		return ExasolUtils.getPKDdl(this, monitor);
public class ExasolTableUniqueKey extends JDBCTableConstraint<ExasolTable, ExasolTableKeyColumn>

import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
    public void addAttributeReference(DBSTableColumn column) throws DBException {
    @NotNull

    private Boolean enabled;
    		ExasolTable exasolTable, 
    }
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getContainer(), getTable(), this);
        super(exasolTable, name, "", constraintType, false);
        return null;
        return owner;
        this.columns.add(new ExasolTableKeyColumn(this, (ExasolTableColumn) column, columns.size()));
    }
                }
    // -----------------
 *
 * Unless required by applicable law or agreed to in writing, software
 */
