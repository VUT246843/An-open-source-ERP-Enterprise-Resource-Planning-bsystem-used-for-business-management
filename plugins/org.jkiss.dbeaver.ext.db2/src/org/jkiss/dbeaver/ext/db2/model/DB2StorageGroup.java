    public Boolean getDefautSG()
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.code.NotNull;
    public Double getOverhead()
    @Property(viewable = false, category = DB2Constants.CAT_DATETIME)
    public Double getDeviceReadRate()
    public DB2StorageGroup(DB2DataSource db2DataSource, ResultSet dbResult) throws DBException
    }

 *
        return writeOverhead;
        return defautSG;
        this.dataTag = JDBCUtils.safeGetInteger(dbResult, "DATATAG");
 * 
    private Double overhead;
    private Timestamp createTime;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.defautSG = JDBCUtils.safeGetBoolean(dbResult, "DEFAULTSG", DB2YesNo.Y.name());
public class DB2StorageGroup extends DB2GlobalObject implements DBPNamedObject {
    {
    }
 * See the License for the specific language governing permissions and
    }
        this.id = JDBCUtils.safeGetInteger(dbResult, "SGID");
import java.sql.Timestamp;
}
import org.jkiss.dbeaver.model.meta.Property;
        this.overhead = JDBCUtils.safeGetDouble(dbResult, "OVERHEAD");
    }
    private Double deviceWriteRate;
    public String getDescription()
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.model.DBPNamedObject;
    {

    }
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);

    // -----------------------
        // DF: it is declared "Integer" in infocenter but Varchar in the catalog...
        this.deviceWriteRate = JDBCUtils.safeGetDouble(dbResult, "DEVICEWRITERATE");
 *
 * you may not use this file except in compliance with the License.
        return createTime;
package org.jkiss.dbeaver.ext.db2.model;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Integer dataTag;
 *
    @Override

    @Property(viewable = false)
    @Property(viewable = false, order = 101, category = DB2Constants.CAT_PERFORMANCE)


    {

        }
        return name;
    @Property(viewable = false)
    @Property(viewable = false, order = 103, category = DB2Constants.CAT_PERFORMANCE)
    private Double deviceReadRate;
    @Property(viewable = false, order = 100, category = DB2Constants.CAT_PERFORMANCE)
        return deviceWriteRate;
    public Double getWriteOverhead()

    public String getName()
    public String getOwner()
 * @author Denis Forveille
        this.writeOverhead = JDBCUtils.safeGetDouble(dbResult, "WRITEOVERHEAD");
        this.name = JDBCUtils.safeGetString(dbResult, "SGNAME");
import org.jkiss.dbeaver.DBException;
    }
    {
    }
        if (db2DataSource.isAtLeastV10_5()) {
    private Double writeOverhead;
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
 * limitations under the License.
import org.jkiss.code.Nullable;
/*
        return cachingTier;
    // Properties

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    {
    private String cachingTier;
/**
    }
    {
    {


        return dataTag;
    }

    @Property(viewable = false, category = DB2Constants.CAT_OWNER)
    private Integer id;
    @Property(viewable = true, order = 1)
 */
        this.deviceReadRate = JDBCUtils.safeGetDouble(dbResult, "DEVICEREADRATE");

    }

        return remarks;

    @Property(viewable = true, order = 2)
    private String owner;
    public String getCachingTier()
import java.sql.ResultSet;
    {

    public Double getDeviceWriteRate()
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String name;
    @NotNull
    // -----------------

import org.jkiss.dbeaver.ext.db2.DB2Constants;
    }
    public Timestamp getCreateTime()
    @Property(viewable = false, order = 102, category = DB2Constants.CAT_PERFORMANCE)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        return deviceReadRate;
    @Override
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    {
            this.cachingTier = JDBCUtils.safeGetString(dbResult, "CACHINGTIER");
    @Property(viewable = true, order = 3)
    @Nullable
    // Constructors
    {
        return id;
import org.jkiss.dbeaver.model.meta.PropertyLength;
    // -----------------
    public Integer getId()
    @Property(viewable = false, length = PropertyLength.MULTILINE)
        super(db2DataSource, dbResult != null);
 * DB2 Storage Group
 * DBeaver - Universal Database Manager
    private Boolean defautSG;
        return overhead;
        return owner;
    private String remarks;
    }
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    public Integer getDataTag()
    {
    {
 */

    // -----------------------


