/**
    @NotNull
    {
    public String getOwner()


    public Integer getId()
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
        return owner;
    @Override

package org.jkiss.dbeaver.ext.db2.model.module;
 */

import org.jkiss.code.Nullable;
        this.id = JDBCUtils.safeGetInteger(dbResult, "CONDID");
import org.jkiss.dbeaver.ext.db2.DB2Constants;

        return remarks;
import java.sql.ResultSet;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return sqlState;
import java.sql.Timestamp;
    @Property(viewable = true, order = 5)
    // -----------------------
    // -----------------------
 *
    {
    }
import org.jkiss.dbeaver.ext.db2.model.DB2Object;
 * See the License for the specific language governing permissions and
    // Constructors
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, order = 3, category = DB2Constants.CAT_OWNER)
    }
    private DB2OwnerType ownerType;
 * DBeaver - Universal Database Manager
    }
    public String getSqlState()
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    {

    @Property(viewable = false, order = 7, category = DB2Constants.CAT_DATETIME)
import org.jkiss.code.NotNull;
/*
 *

        this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    {
 * 
    public DB2ModuleCondition(DB2Module db2Module, ResultSet dbResult) throws DBException
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
    @Property(viewable = true, order = 2)
    public Timestamp getCreateTime()
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 4, category = DB2Constants.CAT_OWNER)

    private Integer id;
 * DB2 Module Condition
public class DB2ModuleCondition extends DB2Object<DB2Module> {



    // Properties
}

        return ownerType;
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
import org.jkiss.dbeaver.DBException;
    public String getDescription()
    }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;

    // -----------------------
        this.sqlState = JDBCUtils.safeGetString(dbResult, "SQLSTATE");
    private String remarks;
    @Property(viewable = true, order = 1)
        return name;
    @Override
 * @author Denis Forveille
 * limitations under the License.
        super(db2Module, JDBCUtils.safeGetString(dbResult, "CONDNAME"), true);
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return id;

    {
    }
    private String sqlState;
    public DB2OwnerType getOwnerType()
    public String getName()
    private String owner;
        return createTime;
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
    // -----------------------
 * You may obtain a copy of the License at
    {
    private Timestamp createTime;

 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    @Nullable
    }

