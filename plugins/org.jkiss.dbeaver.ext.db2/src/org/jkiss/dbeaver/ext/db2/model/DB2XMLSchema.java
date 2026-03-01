
    private DB2OwnerType ownerType;
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.db2.model;
 *
 */
    {
    }
        super(schema, JDBCUtils.safeGetString(dbResult, "OBJECTNAME"), true);
import org.jkiss.dbeaver.model.meta.PropertyLength;
    public String getDescription()

    @Override
        return targetNameSpace;
    // Properties

import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 2)
    }
    // -----------------------

        xmlschemaDepCache.clearCache();
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.sql.ResultSet;
    // -----------------

        this.decomposition = CommonUtils.valueOf(DB2XSRDecomposition.class, JDBCUtils.safeGetString(dbResult, "DECOMPOSITION"));
    {

import org.jkiss.dbeaver.ext.db2.model.dict.DB2XSRDecomposition;
    public DB2XSRDecomposition getDecomposition()
    @Nullable
    private DB2XSRStatus status;
    public DB2Schema getSchema()
    {

    {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return objectType;
    private Long id;
        return alterTime;
 * 
 * @author Denis Forveille
    public String getOwner()
import java.util.Collection;
    @Property(viewable = false, order = 12)
    // -----------------
    {
        return schemaLocation;
    @Association
        // TODO DF: @Properties does not handle SQLXML types.
    {

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    @Property(viewable = false, order = 24, category = DB2Constants.CAT_DATETIME)
    // Association
    {
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.objectInfoString = objectInfo.getString();
        this.targetNameSpace = JDBCUtils.safeGetString(dbResult, "TARGETNAMESPACE");
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    }
    @Property(viewable = true, order = 5)
import org.jkiss.dbeaver.model.meta.Association;
    }

import org.jkiss.code.NotNull;
 *
    @Property(viewable = true, order = 1)
    @Property(viewable = false, order = 23, category = DB2Constants.CAT_DATETIME)
        this.id = JDBCUtils.safeGetLong(dbResult, "OBJECTID");
    public Timestamp getAlterTime()
    // -----------------
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public class DB2XMLSchema extends DB2SchemaObject implements DBPRefreshableObject {
        return ownerType;
    }
    {
        this.objectType = CommonUtils.valueOf(DB2XSRType.class, JDBCUtils.safeGetString(dbResult, "OBJECTTYPE"));
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
 * Copyright (C) 2010-2024 DBeaver Corp and others


    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    public String getObjectInfoString()
import java.sql.SQLXML;
import org.jkiss.code.Nullable;
        this.schemaLocation = JDBCUtils.safeGetString(dbResult, "SCHEMALOCATION");
    @Property(viewable = true, order = 3)
    }
    {


import org.jkiss.dbeaver.ext.db2.model.dict.DB2XSRStatus;
    }
    @Override
    public DB2OwnerType getOwnerType()
            schema.getName(), getName());
        return super.getName();
        return owner;
    // -----------------------
        this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    @Property(viewable = false, order = 21, category = DB2Constants.CAT_OWNER)
    public Long getId()
        xmlschemaDepCache = new JDBCObjectSimpleCache<>(DB2XMLSchemaDep.class, C_DEP,
    }

        return id;

 * Unless required by applicable law or agreed to in writing, software
    private Timestamp createTime;

    private String owner;
    @Property(viewable = false, order = 13)

    public String getName()
    private String remarks;
    }
    // -----------------

 *
        return this;
import org.jkiss.dbeaver.model.meta.Property;


    // Business contract
        return decomposition;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        return remarks;
        return status;
    private static final String C_DEP = "SELECT * FROM SYSCAT.XSROBJECTDEP  WHERE OBJECTSCHEMA = ? AND OBJECTNAME = ? ORDER BY BSCHEMA,BNAME WITH UR";
    {
    {

    // Constructors
    private String objectInfoString;
    public DB2XSRType getObjectType()
    {
    private DB2XSRType objectType;
}
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DB2XSRStatus getStatus()
        this.objectInfo = JDBCUtils.safeGetXML(dbResult, "OBJECTINFO");
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    @Property(viewable = false, order = 10)
    }
        return super.getSchema();
import org.jkiss.dbeaver.ext.db2.model.dict.DB2XSRType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    }
    // -----------------
import java.sql.SQLException;
        this.status = CommonUtils.valueOf(DB2XSRStatus.class, JDBCUtils.safeGetString(dbResult, "STATUS"));
 * You may obtain a copy of the License at
    @Property(viewable = false, order = 20, updatable = true, length = PropertyLength.MULTILINE)
 * DB2 XML Schema (XSR)

    public DB2XMLSchema(DB2Schema schema, ResultSet dbResult) throws SQLException
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
    }
    {
/*
        this.owner = JDBCUtils.safeGetStringTrimmed(dbResult, DB2Constants.SYSCOLUMN_OWNER);
    }
 * you may not use this file except in compliance with the License.

        // Transform it into String

    private final DBSObjectCache<DB2XMLSchema, DB2XMLSchemaDep> xmlschemaDepCache;
    @Override
    {
    @Property(viewable = false, order = 22, category = DB2Constants.CAT_OWNER)
        return objectInfoString;
    // -----------------


 */
 * See the License for the specific language governing permissions and
/**
    private SQLXML objectInfo;
    }
    private String targetNameSpace;

        return createTime;
import java.sql.Timestamp;
    private Timestamp alterTime;
        return xmlschemaDepCache.getAllObjects(monitor, this);
        this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
    private DB2XSRDecomposition decomposition;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public Timestamp getCreateTime()
    public String getSchemaLocation()
    @Property(viewable = false, order = 11)
    public String getTargetNameSpace()
    private String schemaLocation;
 * limitations under the License.

    public Collection<DB2XMLSchemaDep> getXmlschemaDeps(DBRProgressMonitor monitor) throws DBException
import org.jkiss.utils.CommonUtils;

    {
    }
    @Property(viewable = true, order = 4)

