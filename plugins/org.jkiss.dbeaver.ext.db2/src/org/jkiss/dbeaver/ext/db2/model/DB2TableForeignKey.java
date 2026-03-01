    @NotNull
public class DB2TableForeignKey extends JDBCTableConstraint<DB2Table, DB2TableForeignKeyColumn> implements DBSTableForeignKey {
        DBSForeignKeyModifyRule deleteRule,
        return referencedKey;
            referencedKey = refTable.getConstraint(monitor, constName);

    // Properties
 *

    public DBSForeignKeyModifyRule getUpdateRule() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.DBUtils;
        return db2DeleteRule;

    private DB2Table refTable;
        DB2Table db2Table,
    }
    public DB2Table getReferencedTable() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // -----------------

    }
        return db2UpdateRule.getRule();
        DB2TableUniqueKey referencedKey,
        refTable = DB2Utils.findTableBySchemaNameAndName(monitor, db2Table.getDataSource(), refSchemaName, refTableName);
        return columns;

        this.referencedKey = referencedKey;

    public DB2TableForeignKey(
import java.sql.ResultSet;

        this.db2DeleteRule = DB2DeleteUpdateRule.getDB2RuleFromDBSRule(deleteRule);
        return db2UpdateRule;
    // -----------------
        this.referencedKey = referencedKey;

    @Override
    }
        this.db2UpdateRule = DB2DeleteUpdateRule.getDB2RuleFromDBSRule(updateRule);
 * you may not use this file except in compliance with the License.
    @Override
        super(db2Table, null, null, DBSEntityConstraintType.FOREIGN_KEY, true);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        return refTable;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DB2Table db2Table,
    @NotNull
    }
    public DB2DeleteUpdateRule getDb2UpdateRule() {
    public DB2TableForeignKey(
            log.warn("Referenced table '" + DBUtils.getSimpleQualifiedName(refSchemaName, refTableName) + "' not found");

    @NotNull
    }

    }
        db2UpdateRule = CommonUtils.valueOf(DB2DeleteUpdateRule.class, JDBCUtils.safeGetString(dbResult, "UPDATERULE"));
        db2DeleteRule = CommonUtils.valueOf(DB2DeleteUpdateRule.class, JDBCUtils.safeGetString(dbResult, "DELETERULE"));
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Property(viewable = true, editable = true)
    public void setDb2UpdateRule(DB2DeleteUpdateRule db2UpdateRule) {
    public void setAttributeReferences(List<DB2TableForeignKeyColumn> columns) {
import org.jkiss.utils.CommonUtils;


import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
 * See the License for the specific language governing permissions and
    // Columns
    @Nullable
import org.jkiss.dbeaver.model.DBPDataSource;

        String constName = JDBCUtils.safeGetString(dbResult, "REFKEYNAME");
 * Unless required by applicable law or agreed to in writing, software
    private DB2DeleteUpdateRule db2UpdateRule;
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getContainer(), getTable(), this);
    @Override
    @Override
    public DBPDataSource getDataSource() {
    // -----------------
        String refTableName = JDBCUtils.safeGetString(dbResult, "REFTABNAME");

/**
        }


    // -----------------
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
    }
    }
}
    // -----------------
        } else {
    @Nullable
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
import org.jkiss.dbeaver.Log;
    private static final Log log = Log.getLog(DB2TableForeignKey.class);
import java.util.List;
    public DB2DeleteUpdateRule getDb2DeleteRule() {
    ) throws DBException {
 *
        return refTable;
 * DBeaver - Universal Database Manager
    public void setDb2DeleteRule(DB2DeleteUpdateRule db2DeleteRule) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    ) {

    // Constructor
    // -----------------
    }

    private DB2DeleteUpdateRule db2DeleteRule;

/*
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    // Business Contract
package org.jkiss.dbeaver.ext.db2.model;
 * DB2 Table Foreign Key

    @Override

import org.jkiss.dbeaver.ext.db2.DB2Utils;
    private DB2TableUniqueKey referencedKey;
    private List<DB2TableForeignKeyColumn> columns;
    }
    public List<DB2TableForeignKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
    }
import org.jkiss.code.Nullable;
    }
    @Override

import org.jkiss.dbeaver.ext.db2.model.dict.DB2DeleteUpdateRule;
    @NotNull
        return db2DeleteRule.getRule();
 * You may obtain a copy of the License at
 */
    }
import org.jkiss.code.NotNull;
    public DB2Table getAssociatedEntity() {
        ResultSet dbResult
    @Property(viewable = true, editable = true)
 *
    // -----------------
        this.columns = columns;

    // -----------------
        DBRProgressMonitor monitor,
    public void setReferencedConstraint(DB2TableUniqueKey referencedKey) {
    @Property(id = "reference", viewable = false)
        super(db2Table, JDBCUtils.safeGetString(dbResult, "CONSTNAME"), null, DBSEntityConstraintType.FOREIGN_KEY, true);

 * @author Denis Forveille
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        this.db2UpdateRule = db2UpdateRule;
        DBSForeignKeyModifyRule updateRule
    @Property(viewable = true, order = 3)
 */


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }
        String refSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "REFTABSCHEMA");
        this.db2DeleteRule = db2DeleteRule;

 *
        return getTable().getDataSource();

    public DB2TableUniqueKey getReferencedConstraint() {
    public DBSForeignKeyModifyRule getDeleteRule() {
        if (refTable != null) {

