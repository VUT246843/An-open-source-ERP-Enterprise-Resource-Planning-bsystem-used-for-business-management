
    public String getCollationNameOrderBy()


        return this;
    public String getCompileOptions()
    public Timestamp getAlterTime()
    @Property(viewable = false, length = PropertyLength.MULTILINE)
        this.lastRegenTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REGEN_TIME");
    // Business contract
    @Property(viewable = true, order = 1)
    }
    @Property(viewable = false, category = DB2Constants.CAT_COLLATION)

            this.collationSchemaOrderBy = JDBCUtils.safeGetString(dbResult, "COLLATIONSCHEMA_ORDERBY");
        this.event = CommonUtils.valueOf(DB2TriggerEvent.class, JDBCUtils.safeGetString(dbResult, "TRIGEVENT"));
    public Boolean getEventInsert()
    @Property(viewable = true)
package org.jkiss.dbeaver.ext.db2.model;
import org.jkiss.dbeaver.ext.db2.DB2Constants;

        this.valid = DB2TriggerValid.X;

    private Timestamp alterTime;
    public DB2OwnerType getOwnerType()
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
    private Boolean eventDelete;
        this.valid = CommonUtils.valueOf(DB2TriggerValid.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_VALID));
    private String owner;
/**
    public String getCollationSchemaOrderBy()

import org.jkiss.dbeaver.model.meta.Association;
    {
    }
    private DB2TriggerTime time;
 * You may obtain a copy of the License at
    // -----------------
            this.eventDelete = JDBCUtils.safeGetBoolean(dbResult, "EVENTDELETE", DB2YesNo.Y.name());
    {
        return collationName;
    public DB2TriggerTime getTime()

    private DB2TriggerGranularity granularity;
 * limitations under the License.
    {
import java.sql.Timestamp;
    @Property(viewable = true, order = 5)
    public DB2TriggerEvent getEvent()
import org.jkiss.dbeaver.model.DBPRefreshableObject;

/*
        return eventInsert;
        return granularity;

        return secure;
    @Property(viewable = true, order = 2, id = "Schema")
        super(schema, name, false);
    public Integer getLibId()

 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }
        triggerDepCache.clearCache();
    public Timestamp getCreateTime()
import org.jkiss.dbeaver.model.exec.DBCException;
    @Property(viewable = false)
            this.eventUpdate = JDBCUtils.safeGetBoolean(dbResult, "EVENTUPDATE", DB2YesNo.Y.name());

        return owner;


    {

        this.table = table;
import org.jkiss.code.NotNull;

    public Timestamp getLastRegenTime()
    public DB2TriggerValid getValid()
    {
        this.event = DB2TriggerEvent.I;
    // Properties
    public DB2Schema getSchema()
            this.eventInsert = JDBCUtils.safeGetBoolean(dbResult, "EVENTINSERT", DB2YesNo.Y.name());
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    }
    {
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
    {
    {
        this.granularity = CommonUtils.valueOf(DB2TriggerGranularity.class, JDBCUtils.safeGetString(dbResult, "GRANULARITY"));
    @Property(viewable = false, category = DB2Constants.CAT_COMPILER)
    @Property(viewable = false, category = DB2Constants.CAT_COLLATION)
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
    public DB2TriggerGranularity getGranularity()
    public String getDescription()
    @Property(viewable = false, category = DB2Constants.CAT_OWNER)

        return compileOptions;
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
import java.util.Map;
    }
    public DB2Trigger(@NotNull DB2Schema schema, @NotNull String name) {
    // -----------------
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    // -----------------------
    {

 * 
    private String precompileOptions;
    @Property(viewable = false, category = DB2Constants.CAT_COLLATION)
    @NotNull
    public String getQualifier()
    }
    }
    private String text;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Boolean getSecure()
        this.qualifier = JDBCUtils.safeGetString(dbResult, "QUALIFIER");

    {
    {
 *
    {
 */
    public DB2Trigger(@NotNull DB2Schema schema, @NotNull DB2Table table, @NotNull ResultSet dbResult) {
    // -----------------

        return collationNameOrderBy;
    @Property(viewable = true, order = 8)
        return lastRegenTime;
    {

        return eventUpdate;
    }
    public String getName()
    @Property(viewable = true, order = 6)
    }
    @Property(viewable = true, order = 7)
    {
        super(schema, JDBCUtils.safeGetString(dbResult, "TRIGNAME"), true);

import org.jkiss.dbeaver.model.struct.DBSObject;
    }

    {
    public String getPrecompileOptions()
    }
    private Boolean eventInsert;
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)


import org.jkiss.dbeaver.model.meta.PropertyLength;
    private String collationSchemaOrderBy;
    {
import org.jkiss.dbeaver.DBException;
        return remarks;
    @Property(viewable = false)

    {
import java.sql.ResultSet;
    private String collationName;
    @Property(viewable = true, order = 4)
        return super.getParentObject();
    // -----------------
    @Override
    {
        this.time = CommonUtils.valueOf(DB2TriggerTime.class, JDBCUtils.safeGetString(dbResult, "TRIGTIME"));
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
            this.precompileOptions = JDBCUtils.safeGetString(dbResult, "PRECOMPILE_OPTIONS");
    @NotNull
        return table;
        this.time = DB2TriggerTime.B;
import org.jkiss.dbeaver.model.meta.Property;
 * Unless required by applicable law or agreed to in writing, software
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    @Property(viewable = true, order = 3)
        if (db2DataSource.isAtLeastV10_1()) {
    {
    @Property(viewable = false)
    }
    private DB2TriggerValid valid;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    @Property(viewable = false, category = DB2Constants.CAT_OWNER)


            this.compileOptions = JDBCUtils.safeGetString(dbResult, "COMPILE_OPTIONS");
    @Association

    @Override
    public String getCollationName()
    }
        return super.getName();
    private final DB2TriggerDepCache triggerDepCache = new DB2TriggerDepCache();
        return collationSchema;
    public DB2Table getTable()
        return valid;
        return eventDelete;
 * See the License for the specific language governing permissions and
    public Boolean getEventDelete()

    private Boolean eventUpdate;
    public String getOwner()
    private DB2Table table;
    }
    private String collationSchema;
    {
    private String qualifier;
    @Property(viewable = false, category = DB2Constants.CAT_COLLATION)
    }
    private Boolean secure;

    }
    {
            this.collationNameOrderBy = JDBCUtils.safeGetString(dbResult, "COLLATIONNAME_ORDERBY");

    }

    }
    // -----------------
    {
        return collationSchemaOrderBy;
    // Source

    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    private Integer libId;
    private String compileOptions;
            this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
        return SQLFormatUtils.formatSQL(getDataSource(), text);

    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
import org.jkiss.code.Nullable;
    {
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
    }
    }
    @Property(viewable = true, order = 9)

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    }
        this.text = JDBCUtils.safeGetString(dbResult, "TEXT");
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
import org.jkiss.utils.CommonUtils;
    private DB2TriggerEvent event;

    // -----------------
    private Timestamp lastRegenTime;
    }
    @Nullable

 * DBeaver - Universal Database Manager

        return qualifier;
    }
 * you may not use this file except in compliance with the License.
    private String funcPath;
    @Property(viewable = false, category = DB2Constants.CAT_COMPILER)
    {
            this.secure = JDBCUtils.safeGetBoolean(dbResult, "SECURE", DB2YesNo.Y.name());
        DB2DataSource db2DataSource = schema.getDataSource();
public class DB2Trigger extends DB2SchemaObject implements DBSTrigger, DB2SourceObject, DBPRefreshableObject {
    @Override

    {
    // -----------------
        return valid.getState();
    @Override
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
    {
    }
 * @author Denis Forveille

            this.libId = JDBCUtils.safeGetInteger(dbResult, "LIB_ID");
            this.collationSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "COLLATIONSCHEMA");
        return time;

import org.jkiss.dbeaver.ext.db2.model.dict.*;
        return triggerDepCache.getAllObjects(monitor, this);
    {
        return event;

import org.jkiss.dbeaver.ext.db2.model.cache.DB2TriggerDepCache;
    // -----------------------
    @Override
    private String collationNameOrderBy;
    public DBSObjectState getObjectState()
    }
import java.util.Collection;
    private DB2OwnerType ownerType;
 */
    public Collection<DB2TriggerDep> getTriggerDeps(DBRProgressMonitor monitor) throws DBException
    }
        return funcPath;
    {
    }

    {
    }
        return libId;
        return alterTime;
    @Property(viewable = false)
    private Timestamp createTime;
        this.ownerType = DB2OwnerType.U;
        this.granularity = DB2TriggerGranularity.R;
        if (db2DataSource.isAtLeastV9_5()) {
        return ownerType;

        return precompileOptions;
 *
            this.collationName = JDBCUtils.safeGetString(dbResult, "COLLATIONNAME");

        }
    }
    {
    public String getCollationSchema()
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    // Association
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Boolean getEventUpdate()
    }

    public String getFuncPath()
        return createTime;
    // -----------------
 * DB2 Table Trigger

        this.funcPath = JDBCUtils.safeGetString(dbResult, "FUNC_PATH");
}


    }
    @Override
        }
    @Override
    // Constructors
    private String remarks;
