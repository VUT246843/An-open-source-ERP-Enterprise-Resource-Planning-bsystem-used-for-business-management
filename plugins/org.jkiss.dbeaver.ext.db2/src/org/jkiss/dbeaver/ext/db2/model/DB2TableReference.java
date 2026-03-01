    @Nullable
        return refTable;
    @Override
    public DBSForeignKeyModifyRule getUpdateRule() {
import org.jkiss.utils.CommonUtils;

 *



    @Override
    private DB2DeleteUpdateRule updateRule;
    @NotNull
import java.sql.ResultSet;
    }
    }

        return updateRule.getRule();
    private DB2Table refTable;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * limitations under the License.
            referencedKey = refTable.getAssociation(monitor, constName);
 *
        String refTableName = JDBCUtils.safeGetString(dbResult, "TABNAME");
    // -----------------
    @Nullable

import java.util.List;
        return deleteRule.getRule();
    // -----------------
public class DB2TableReference extends JDBCTableConstraint<DB2Table, DB2TableKeyColumn> implements DBSTableForeignKey {
 */
    private List<DB2TableKeyColumn> columns;
 * Unless required by applicable law or agreed to in writing, software
 *


    // -----------------
    public List<DB2TableKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.
        return columns;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;

    // -----------------
 *
    private static final Log log = Log.getLog(DB2TableReference.class);
    @Override
        if (refTable == null) {
        return refTable;
    }
import org.jkiss.dbeaver.model.meta.Property;
        return getTable().getDataSource();
                log.debug("Foreign key '" + constName + "' not found in table '" + refTable.getName() + "'");
    @Property(viewable = true, editable = false)
    @NotNull
    public void setAttributeReferences(List<DB2TableKeyColumn> columns) {
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.columns = columns;
import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.ext.db2.model;
    private DB2TableForeignKey referencedKey;
    @Property(viewable = true, order = 3)
    @Property(viewable = true, editable = false)
import org.jkiss.dbeaver.model.DBUtils;
    public DB2TableReference(DBRProgressMonitor monitor, DB2Table db2Table, ResultSet dbResult) throws DBException {
            log.debug("Reference table '" + refTableName + "' not found in schema '" + refSchemaName + "'");
/**
    public DB2Table getReferencedTable() {
        String refSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TABSCHEMA");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {

    }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,

        }
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.model.DBPDataSource;

    public DB2Table getAssociatedEntity() {
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getContainer(), getTable(), this);
 * DBeaver - Universal Database Manager
    // -----------------

    @Override
    private DB2DeleteUpdateRule deleteRule;
    @Override
    }
 * See the License for the specific language governing permissions and
        return referencedKey;
            }
    @Override
        refTable = DB2Utils.findTableBySchemaNameAndName(monitor, db2Table.getDataSource(), refSchemaName, refTableName);
        } else {
import org.jkiss.dbeaver.ext.db2.DB2Utils;
        deleteRule = CommonUtils.valueOf(DB2DeleteUpdateRule.class, JDBCUtils.safeGetString(dbResult, "DELETERULE"));
    // -----------------
    }
    public DB2TableForeignKey getReferencedConstraint() {
        super(db2Table, JDBCUtils.safeGetString(dbResult, "CONSTNAME"), null, DBSEntityConstraintType.FOREIGN_KEY, true);
    // Constructors

/*
    @Override

import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
    }
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
 */
            if (referencedKey == null) {

 * You may obtain a copy of the License at

    // Direct Attributes
 * DB2 Table Foreign Key
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
    }
import org.jkiss.code.Nullable;
    @NotNull

 * @author Denis Forveille
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    // Columns
import org.jkiss.dbeaver.DBException;

        String constName = JDBCUtils.safeGetString(dbResult, "CONSTNAME");
    }

        updateRule = CommonUtils.valueOf(DB2DeleteUpdateRule.class, JDBCUtils.safeGetString(dbResult, "UPDATERULE"));
import org.jkiss.dbeaver.ext.db2.model.dict.DB2DeleteUpdateRule;
    public DBPDataSource getDataSource() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DBSForeignKeyModifyRule getDeleteRule() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(id = "reference", viewable = false)
import org.jkiss.dbeaver.model.DBPEvaluationContext;
