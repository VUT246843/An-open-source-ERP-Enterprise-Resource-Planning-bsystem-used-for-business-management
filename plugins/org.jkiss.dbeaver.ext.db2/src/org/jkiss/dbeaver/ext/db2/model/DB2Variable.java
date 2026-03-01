
        return owner;
    public String getName()
    @Nullable
    // -----------------------

    public Timestamp getLastRegenTime()
    @Property(viewable = false, order = 9, category = DB2Constants.CAT_DATETIME)

    // -----------------------
import org.jkiss.dbeaver.ext.db2.DB2Constants;
import org.jkiss.dbeaver.model.meta.Property;
        return id;
}
    private Boolean valid;

 *
    private DB2OwnerType ownerType;
    }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return lastRegenTime;

        return db2Schema;

        super(owner, JDBCUtils.safeGetString(dbResult, "VARNAME"), true);

 * DBeaver - Universal Database Manager
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
 * you may not use this file except in compliance with the License.
import java.sql.ResultSet;
    @Property(viewable = true, order = 5, category = DB2Constants.CAT_OWNER)
        return createTime;
    }
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, order = 7)

 * Unless required by applicable law or agreed to in writing, software
    private DB2Schema db2Schema;
    @Property(viewable = true, order = 2)
    private Integer id;
import org.jkiss.code.NotNull;
    {

 */

        return ownerType;
    {
    public DB2Schema getSchema()
import java.sql.Timestamp;
    {

        } else {
 * @author Denis Forveille
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);

    public Integer getId()
    private String owner;
    {

/*

    }

            this.db2Schema = ((DB2DataSource) owner).getSchema(new VoidProgressMonitor(), schemaName);
    {

import org.jkiss.code.Nullable;
    @Property(viewable = true, order = 6)
        this.published = JDBCUtils.safeGetBoolean(dbResult, "PUBLISHED", DB2YesNo.Y.name());
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
        return valid;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
            String schemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "VARSCHEMA");
    @Property(viewable = true, order = 3)
import org.jkiss.utils.CommonUtils;
    @Property(viewable = true, order = 1)
 * See the License for the specific language governing permissions and
    private String remarks;

    {
    // Properties
        if (owner instanceof DB2Module) {
            db2Schema = ((DB2Module) owner).getSchema();
    private Boolean published;
    // -----------------------
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    // -----------------------
    }

import org.jkiss.dbeaver.model.struct.DBSObject;
    public String getOwner()
    public DB2Variable(DBSObject owner, ResultSet dbResult) throws DBException
    public Boolean getPublished()
    private Timestamp lastRegenTime;
 * 
    @Property(viewable = true, order = 4, category = DB2Constants.CAT_OWNER)
    }
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
    {
 *
    @Override
    public Boolean getValid()

    private Timestamp createTime;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    {
    {
    // Constructors
        this.id = JDBCUtils.safeGetInteger(dbResult, "VARID");
    }
    @Property(viewable = false, order = 8, category = DB2Constants.CAT_DATETIME)
/**
package org.jkiss.dbeaver.ext.db2.model;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
        return published;

 * You may obtain a copy of the License at
    public DB2OwnerType getOwnerType()
    public String getDescription()

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return remarks;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.lastRegenTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REGEN_TIME");
    }
        this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    }
public class DB2Variable extends DB2Object<DBSObject> {
        this.valid = JDBCUtils.safeGetBoolean(dbResult, DB2Constants.SYSCOLUMN_VALID, DB2YesNo.Y.name());
        return name;
    }
        }
    {
 * DB2 Variable (Global or Module)

    }

    @Override
 * limitations under the License.
    }
    public Timestamp getCreateTime()
