import org.jkiss.utils.CommonUtils;
    public String getQualifier() {
 * You may obtain a copy of the License at
    // -----------------
    // Properties
    }


    @NotNull

    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.Property;

    }
        return precentValid;
        this.collationName = JDBCUtils.safeGetString(dbResult, "COLLATIONNAME");
 *
    }
    public String getOwner() {
    // -----------------
        return fumcPath;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
    }
/*
    }
    private String owner;
import java.util.List;


import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
    public String getCollationSchemaOrderBy() {
    @NotNull
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
        return getTable().getSchema();
 *
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
import org.jkiss.dbeaver.model.DBUtils;
 *
    public String getFumcPath() {
public class DB2TableCheckConstraint extends JDBCTableConstraint<DB2Table, DB2TableCheckConstraintColumn> implements DB2SourceObject, DBSTableCheckConstraint {
    }
    private String fumcPath;
        }
    // Constructor
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return super.getTable();
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull

        super(table, JDBCUtils.safeGetString(dbResult, "CONSTNAME"), null, DBSEntityConstraintType.CHECK, true);

    // -----------------
    public DBSEntityConstraintType getConstraintType() {
        return text;
    }
 * limitations under the License.
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_COLLATION)
package org.jkiss.dbeaver.ext.db2.model;
import org.jkiss.dbeaver.model.DBConstants;
        return qualifier;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {

    }
    private String collationName;
    // -----------------
    @Override
    }
        return collationNameOrderBy;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_COLLATION)
    @Property(viewable = true, editable = false, order = 3)
    @Override
    public DBSObjectState getObjectState() {

    public List<DB2TableCheckConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
        return SQLFormatUtils.formatSQL(getDataSource(), text);
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
    }
    // -----------------
    public Timestamp getCreateTime() {
    private Integer precentValid;
    @Override
        return owner;
    @Override
    public void setAttributeReferences(List<DB2TableCheckConstraintColumn> columns) {



    }
        return DBSObjectState.UNKNOWN;
    @Property(viewable = true, editable = false, order = 2)
 * DBeaver - Universal Database Manager
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)

    @Override

    }

    }
    public String getCollationName() {
    @Override
    }
        return DBUtils.getFullQualifiedName(getDataSource(), getTable().getContainer(), getTable(), this);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCException;
    public DB2Table getTable() {
        return collationSchema;

    // -----------------
    @Property(viewable = false, editable = false)
    public String getCollationSchema() {
    }
    }

        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);

import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableCheckConstraintType;
    @Property(hidden = true)
        return super.getConstraintType();
    }
    public DB2DataSource getDataSource() {
import java.util.Map;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * you may not use this file except in compliance with the License.
    private DB2OwnerType ownerType;
    // Columns
    public DB2TableCheckConstraint(DBRProgressMonitor monitor, DB2Table table, ResultSet dbResult) throws DBException {
    private Timestamp createTime;
    }
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableConstraint;
        if (db2DataSource.isAtLeastV9_5()) {
/**
import java.sql.Timestamp;
 * DB2 Table Check Constraint
        return columns;


    }
    private List<DB2TableCheckConstraintColumn> columns;
    @NotNull
    private String collationSchema;

        this.text = JDBCUtils.safeGetString(dbResult, "TEXT");
        this.precentValid = JDBCUtils.safeGetInteger(dbResult, "PERCENTVALID");
    private DB2TableCheckConstraintType type;
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    private String text;
 * @author Denis Forveille
        this.collationSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "COLLATIONSCHEMA");
    }
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_COLLATION)
        return ownerType;

    // -----------------
    @Property(viewable = false, editable = false, category = DBConstants.CAT_STATISTICS)
    }

import java.sql.ResultSet;

 */

    public DB2OwnerType getOwnerType() {
    }
    // Source
        DB2DataSource db2DataSource = table.getDataSource();
    public String getCollationNameOrderBy() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
        return collationSchemaOrderBy;
        this.collationNameOrderBy = JDBCUtils.safeGetString(dbResult, "COLLATIONNAME_ORDERBY");
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        this.columns = columns;
 */


        return type;
        return createTime;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private String collationSchemaOrderBy;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DB2Schema getSchema() {
        this.qualifier = JDBCUtils.safeGetString(dbResult, "QUALIFIER");
    public DB2TableCheckConstraintType getType() {
        return getTable().getDataSource();
    @Override
    public String getCheckConstraintDefinition() {

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
        this.collationSchemaOrderBy = JDBCUtils.safeGetString(dbResult, "COLLATIONSCHEMA_ORDERBY");


}
    private String collationNameOrderBy;
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_COLLATION)

    // -----------------
    @Override
    @NotNull
        this.type = CommonUtils.valueOf(DB2TableCheckConstraintType.class, JDBCUtils.safeGetString(dbResult, "TYPE"));

    public void setCheckConstraintDefinition(String expression) {
    @Override
import org.jkiss.code.Nullable;
    @Property(viewable = false, editable = false)
 *
        return collationName;
    @Override
    public Integer getPrecentValid() {

    }
    private String qualifier;

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.fumcPath = JDBCUtils.safeGetString(dbResult, "FUNC_PATH");
        this.text = expression;
