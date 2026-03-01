public class DB2DatabaseAuth extends DB2GlobalObject implements DBAPrivilege {
    @NotNull
    @Property(viewable = false, order = 29, category = DB2Constants.CAT_AUTH)
    private Boolean explain;
    public DB2GrantorGranteeType getGrantorType()
    @Property(viewable = false, order = 32, category = DB2Constants.CAT_AUTH)
    }
    // -----------------------

        return bindAdd;
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
        return explain;
    private Boolean workLoadAdmin;
    public Boolean getNoFence()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Boolean getSqlAdmin()
    public Boolean getExternalRoutine()
    {
    {
    // -----------------
    // -----------------
    private Boolean accessControl;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.dbAdm = JDBCUtils.safeGetBoolean(resultSet, "DBADMAUTH", DB2YesNo.Y.name());
import org.jkiss.dbeaver.ext.db2.model.DB2GlobalObject;
    public Boolean getAccessControl()

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private Boolean implicitSchema;
        this.libraryAdmin = JDBCUtils.safeGetBoolean(resultSet, "LIBRARYADMAUTH", DB2YesNo.Y.name());
    public String getName()
    @Property(viewable = true, order = 20, category = DB2Constants.CAT_AUTH)
        }
    private Boolean externalRoutine;
    public Boolean getExplain()
    public Boolean getDbAdm()
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, order = 23, category = DB2Constants.CAT_AUTH)
    {
        return load;
    // -----------------------
        case U:
    {
        return externalRoutine;
    {
    }
    private Boolean load;
    @Property(viewable = false, order = 31, category = DB2Constants.CAT_AUTH)
        return "DBAUTH"; // Fake name
    }
    @Property(viewable = true, order = 26, category = DB2Constants.CAT_AUTH)
 * limitations under the License.
    }
        return accessControl;
 */
    private Boolean createSecure;

        case G:
        return createSecure;
    public Boolean getBindAdd()
        this.load = JDBCUtils.safeGetBoolean(resultSet, "LOADAUTH", DB2YesNo.Y.name());
    }
        return libraryAdmin;

    {
    }
    {
    }
        this.grantorType = CommonUtils.valueOf(DB2GrantorGranteeType.class,

/**
    }
        this.dataAccess = JDBCUtils.safeGetBoolean(resultSet, "DATAACCESSAUTH", DB2YesNo.Y.name());
        this.implicitSchema = JDBCUtils.safeGetBoolean(resultSet, "IMPLSCHEMAAUTH", DB2YesNo.Y.name());

        super(dataSource, true);
            break;
    private Boolean connect;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    private DBSObject grantor;
 */
    public Boolean getSecurityAdmin()
        this.connect = JDBCUtils.safeGetBoolean(resultSet, "CONNECTAUTH", DB2YesNo.Y.name());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
        this.explain = JDBCUtils.safeGetBoolean(resultSet, "EXPLAINAUTH", DB2YesNo.Y.name());
    private DB2GrantorGranteeType grantorType;
    @Property(viewable = true, order = 3)
    public Boolean getLibraryAdmin()
            JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTORTYPE"));
    @Property(viewable = true, order = 24, category = DB2Constants.CAT_AUTH)
 * See the License for the specific language governing permissions and
    }

 * DB2 Database Authorisation


        this.quiesceConnect = JDBCUtils.safeGetBoolean(resultSet, "QUIESCECONNECTAUTH", DB2YesNo.Y.name());
    @Property(viewable = true, order = 27, category = DB2Constants.CAT_AUTH)
    private Boolean sqlAdmin;
 * 
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return implicitSchema;
        return grantor;
    private Boolean noFence;
    public Boolean getCreateSecure()

    }

    @Property(viewable = true, order = 4)

        return workLoadAdmin;
    @Property(viewable = false, order = 36, category = DB2Constants.CAT_AUTH)
    {
            this.grantor = dataSource.getUser(monitor, grantorName);
    {

import org.jkiss.dbeaver.model.access.DBAPrivilege;
    {
    @Property(viewable = false, order = 33, category = DB2Constants.CAT_AUTH)
    public Boolean getQuiesceConnect()
    {
 * DBeaver - Universal Database Manager
 *
 * You may obtain a copy of the License at
        this.sqlAdmin = JDBCUtils.safeGetBoolean(resultSet, "SQLADMAUTH", DB2YesNo.Y.name());
    public Boolean getLoad()
            break;
    {
        switch (grantorType) {
    }

    public Boolean getDataAccess()
    // Properties


import org.jkiss.dbeaver.DBException;
    }
/*
    {

    public DB2DatabaseAuth(DBRProgressMonitor monitor, DB2DataSource dataSource, ResultSet resultSet) throws DBException
    @Property(viewable = true, order = 25, category = DB2Constants.CAT_AUTH)
    }
 * @author Denis Forveille

    }
        this.noFence = JDBCUtils.safeGetBoolean(resultSet, "NOFENCEAUTH", DB2YesNo.Y.name());

        return dataAccess;
    @Property(viewable = false, order = 35, category = DB2Constants.CAT_AUTH)
package org.jkiss.dbeaver.ext.db2.model.security;
    @Property(viewable = true, order = 28, category = DB2Constants.CAT_AUTH)
    public Boolean getImplicitSchema()
    }
 *
    private Boolean securityAdmin;
import org.jkiss.dbeaver.model.meta.Property;
        if (dataSource.isAtLeastV10_1()) {
    private Boolean createTab;
 *
    }

    {
        return sqlAdmin;

    @Property(viewable = true, order = 22, category = DB2Constants.CAT_AUTH)

        this.bindAdd = JDBCUtils.safeGetBoolean(resultSet, "BINDADDAUTH", DB2YesNo.Y.name());
    // Constructors
    @Property(viewable = false, order = 30, category = DB2Constants.CAT_AUTH)
    public Boolean getWorkLoadAdmin()
    {
        }
        default:
    public DBSObject getGrantor()
    {
    {
            break;

        String grantorName = JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTOR");
    {
    }

        this.createTab = JDBCUtils.safeGetBoolean(resultSet, "CREATETABAUTH", DB2YesNo.Y.name());
    private Boolean bindAdd;
        this.workLoadAdmin = JDBCUtils.safeGetBoolean(resultSet, "WLMADMAUTH", DB2YesNo.Y.name());
            this.grantor = dataSource.getGroup(monitor, grantorName);
        return securityAdmin;
    }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    }
        this.accessControl = JDBCUtils.safeGetBoolean(resultSet, "ACCESSCTRLAUTH", DB2YesNo.Y.name());
    @Override
    @Property(viewable = true, order = 21, category = DB2Constants.CAT_AUTH)
        this.externalRoutine = JDBCUtils.safeGetBoolean(resultSet, "EXTERNALROUTINEAUTH", DB2YesNo.Y.name());
        return grantorType;
    private Boolean dataAccess;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    public Boolean getConnect()
    }
    private Boolean libraryAdmin;
        return quiesceConnect;
    public Boolean getCreateTab()
    private Boolean quiesceConnect;
import org.jkiss.dbeaver.model.struct.DBSObject;

    {
        return connect;
    }


    private Boolean dbAdm;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(hidden = true)

        return noFence;
import org.jkiss.code.NotNull;
    @Property(viewable = false, order = 34, category = DB2Constants.CAT_AUTH)
import java.sql.ResultSet;
    {

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.securityAdmin = JDBCUtils.safeGetBoolean(resultSet, "SECURITYADMAUTH", DB2YesNo.Y.name());
        return dbAdm;
    {

}

            this.createSecure = JDBCUtils.safeGetBoolean(resultSet, "CREATESECUREAUTH", DB2YesNo.Y.name());

        return createTab;
