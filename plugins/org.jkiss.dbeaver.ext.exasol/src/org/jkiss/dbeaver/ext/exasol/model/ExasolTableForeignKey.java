 * you may not use this file except in compliance with the License.


        }
    private static final Log LOG = Log.getLog(ExasolTableForeignKey.class);
    // Constructor
/**
        super(exasolTable, name, "", DBSEntityConstraintType.FOREIGN_KEY, true);
    public void setAttributeReferences(List<ExasolTableForeignKeyColumn> columns) {
        } else {
    
                } catch (DBException e) {
                    referencedKey = refTable.getPrimaryKey(new VoidProgressMonitor());
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
    // -----------------
    public ExasolTableUniqueKey getReferencedConstraint() {
        return refTable;
    	if (referencedKey == null) {

        this.referencedKey = referencedKey;
    	}
    // -----------------
    public ExasolTable getAssociatedEntity() {

import org.jkiss.dbeaver.model.DBPScriptObject;
    }

    }
    private ExasolTableUniqueKey referencedKey;
    public DBSForeignKeyModifyRule getDeleteRule() {
        this.refTable = referencedKey == null ? null : referencedKey.getTable();
        this.enabled = enabled;
    }

import java.util.List;
    @Override
            return DBSForeignKeyModifyRule.NO_ACTION;
    }
    public DBPDataSource getDataSource() {
    // -----------------
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public Boolean getEnabled() {
        setReferencedConstraint(referencedKey);



import org.jkiss.code.Nullable;


import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.Log;

    implements DBSTableForeignKey,DBPScriptObject
            return DBSForeignKeyModifyRule.RESTRICT;
        super(exasolTable, JDBCUtils.safeGetString(dbResult, "CONSTRAINT_NAME"), null, DBSEntityConstraintType.FOREIGN_KEY, true);


import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
import org.jkiss.dbeaver.DBException;
        this.enabled = enabled;
 *     http://www.apache.org/licenses/LICENSE-2.0
    // -----------------

    @Override
                }
            return DBSForeignKeyModifyRule.NO_ACTION;
        if (this.enabled) {
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        return this.enabled;
import org.jkiss.dbeaver.model.DBPDataSource;
    // Properties

import org.jkiss.dbeaver.model.DBUtils;
    private Boolean enabled;
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
    @Property(id = "reference", viewable = true)
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
    
    @NotNull
		return ExasolUtils.getFKDdl(this, monitor);
    }
        this.referencedKey = referencedKey;
	@NotNull
 * limitations under the License.

import java.sql.ResultSet;
        String refSchemaName = JDBCUtils.safeGetString(dbResult, "REFERENCED_SCHEMA");
        String refTableName = JDBCUtils.safeGetString(dbResult, "REFERENCED_TABLE");
        return columns;
package org.jkiss.dbeaver.ext.exasol.model;
    private ExasolTable refTable;
    public DBSForeignKeyModifyRule getUpdateRule() {

    public ExasolTableForeignKey(ExasolTable exasolTable, ExasolTableUniqueKey referencedKey, Boolean enabled, String name) {
 */
    private List<ExasolTableForeignKeyColumn> columns;
        referencedKey = null;


    @Nullable
    @Property(viewable = true, order = 3)

    @Override
            return DBSForeignKeyModifyRule.RESTRICT;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    @NotNull
{
    @Override
        } else {
        }
    @Override

    }
    // Columns
 *
}
    }


 * DBeaver - Universal Database Manager
    }
 * See the License for the specific language governing permissions and

 */
    }
                    LOG.error("Error reading pk", e);
    @NotNull
        refTable = ExasolUtils.findTableBySchemaNameAndName(monitor, exasolTable.getDataSource(), refSchemaName, refTableName);
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getContainer(), getTable(), this);
    }
    	    if (refTable != null) {
    public ExasolTableForeignKey(DBRProgressMonitor monitor, ExasolTable exasolTable, ResultSet dbResult) throws DBException {
			throws DBException
    public void setReferencedConstraint(ExasolTableUniqueKey referencedKey) {
    @NotNull
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
                try {
    @Override
    @Override
    // -----------------
 * You may obtain a copy of the License at
    public void setEnabled(Boolean enabled) {
	{

import org.jkiss.code.NotNull;
import java.util.Map;
 *

	public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options)
 *
    // Business Contract
    }
        return referencedKey;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.columns = columns;
    }
public class ExasolTableForeignKey extends JDBCTableConstraint<ExasolTable, ExasolTableForeignKeyColumn>

        return refTable;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	}
    // -----------------
    @Property(viewable = true, editable = true, updatable = true)
        return getTable().getDataSource();
    @Nullable
    // -----------------
    public ExasolTable getReferencedTable() {
        if (this.enabled) {
    // -----------------
 * @author Karl
        enabled = JDBCUtils.safeGetBoolean(dbResult, "CONSTRAINT_ENABLED");
    public List<ExasolTableForeignKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
