 */
    {

 * @author Denis Forveille
    // -----------------

        return owner;
    private String concurrentAccessResolution;
    private Boolean sysTimeSensitive;
    @Property(viewable = false, order = 37)
    }
            this.firstBindTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
package org.jkiss.dbeaver.ext.db2.model;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.ext.db2.DB2Constants;
 *
    public Timestamp getAlterTime()
    public Boolean getSysTimeSensitive()
}

    private Boolean staticAsDynamic;
        this.funcPath = JDBCUtils.safeGetString(dbResult, "FUNC_PATH");
    @Property(viewable = false, order = 33)
    private Timestamp explicitBindTime;
    @Property(viewable = false, order = 39)

/**
    private String blocking;
        if (db2DataSource.isAtLeastV9_5()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return isolation;
    }

        return validate;
    public Boolean getKeepDynamic()
    }
    public String getIntraParallel()
    @Property(viewable = false, order = 51, category = DB2Constants.CAT_DATETIME)
    @Property(viewable = false, order = 34)
    @Association

    private String validate;
            this.sysTimeSensitive = JDBCUtils.safeGetBoolean(dbResult, "SYSTIMESENSITIVE", DB2YesNo.Y.name());
        this.dateTimeFormat = JDBCUtils.safeGetString(dbResult, "FORMAT");


    public String getDegree()
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    @Property(viewable = true, order = 30)
    {
    {
    public String getOwner()
        return insertBuf;
        String defaultSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "DEFAULT_SCHEMA");
        return uniqueId;
    // -----------------------
    public DB2OwnerType getOwnerType()
    // -----------------------
    @Property(viewable = true, order = 3, category = DB2Constants.CAT_OWNER)
    }

        }
    private String dynamicRules;
    {
import java.sql.Date;
    public DB2Schema getDefaultSchema()
        return langLevel;
    public String getFuncPath()

    @Property(viewable = false, order = 38)
    private String intraParallel;
    }
        return keepDynamic;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
        this.version = JDBCUtils.safeGetString(dbResult, "PKGVERSION");
        this.insertBuf = JDBCUtils.safeGetBoolean(dbResult, "INSERT_BUF", DB2YesNo.Y.name());
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false, order = 32)
 * limitations under the License.
    }

            this.lastUsed = JDBCUtils.safeGetDate(dbResult, "LASTUSED");
    {
    {
        this.valid = JDBCUtils.safeGetBoolean(dbResult, DB2Constants.SYSCOLUMN_VALID, DB2YesNo.Y.name());

    @Property(viewable = false, order = 35)
    private String langLevel;
    private Timestamp alterTime;
        return blocking;


    public DB2Package(DB2Schema schema, ResultSet dbResult) throws DBException
        return dateTimeFormat;
    private Timestamp lastBindTime;
        this.degree = JDBCUtils.safeGetString(dbResult, "DEGREE");
    @Property(viewable = true, order = 7)
    {


    }
    private String remarks;
    @Property(viewable = false, order = 24)
        return concurrentAccessResolution;
    }
    private String isolation;
    public Boolean getMultiNodePlan()
    @Property(viewable = false, order = 27)
        return lastBindTime;
            schema.getName(), getName());
        this.queryOpt = JDBCUtils.safeGetInteger(dbResult, "QUERYOPT");
            this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));
    }
    {
    {
    {

    @Property(viewable = true, order = 8)
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
    public Timestamp getLastBindTime()
        return busTimeSensitive;

    }
    }

            this.concurrentAccessResolution = JDBCUtils.safeGetString(dbResult, "CONCURRENTACCESSRESOLUTION");
    public Integer getQueryOpt()
import java.util.Collection;
    {
    {
        this.owner = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
    }
    {
    public Boolean getValid()
        return explicitBindTime;
    }
/*


    @Property(viewable = false, order = 28)

        super(schema, JDBCUtils.safeGetStringTrimmed(dbResult, "PKGNAME"), true);
    @Association

    // Constructors
        return degree;
    {
    public String getDescription()
import org.jkiss.code.NotNull;
    private String version;
            this.keepDynamic = JDBCUtils.safeGetBoolean(dbResult, "KEEPDYNAMIC", DB2YesNo.Y.name());
        this.validate = JDBCUtils.safeGetString(dbResult, "VALIDATE");
    // -----------------
    }
    // -----------------
    }
    {
        this.dynamicRules = JDBCUtils.safeGetString(dbResult, "DYNAMICRULES");
        return sqlerror;
    private Boolean busTimeSensitive;
    }
    @Property(viewable = true, order = 6)
        this.langLevel = JDBCUtils.safeGetString(dbResult, "LANG_LEVEL");
    {
    }
    {
        if (schema.getDataSource().isAtLeastV10_1()) {
    public String getDynamicRules()
    {
        return totalSections;
    }
        this.sqlerror = JDBCUtils.safeGetString(dbResult, "SQLERROR");
    // Properties
        packageDepCache.clearCache();
import java.sql.Timestamp;
    private DB2Schema defaultSchema;
 *
    @Property(viewable = false, order = 36)
    @Override

    public Long getId()
    // Association
        return dynamicRules;

        return id;


    }
    @Property(viewable = false, order = 5)
        return multiNodePlan;
    public Boolean getInsertBuf()
        this.blocking = JDBCUtils.safeGetString(dbResult, "BLOCKING");



    @Property(viewable = true, order = 20)
    public Timestamp getExplicitBindTime()

    {
 * you may not use this file except in compliance with the License.
    private String degree;
    {



        return valid;
        }
        return firstBindTime;
    }
    private static final String C_DEP = "SELECT * FROM SYSCAT.PACKAGEDEP WHERE PKGSCHEMA = ? AND PKGNAME = ? ORDER BY BSCHEMA,BNAME WITH UR";
    public String getVersion()
        return intraParallel;
    private Integer queryOpt;
        return this;
    }
    @Property(viewable = false, length = PropertyLength.MULTILINE, order = 9)

 * DB2 Packages
    public Date getLastUsed()
        }


    {
    {

 * See the License for the specific language governing permissions and
 * 
    }
 * DBeaver - Universal Database Manager
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.lastBindTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_BIND_TIME");
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * Unless required by applicable law or agreed to in writing, software
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    private String dateTimeFormat;
        this.defaultSchema = getDataSource().getSchema(new VoidProgressMonitor(), defaultSchemaName);
    {
    private Long id;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
import org.jkiss.dbeaver.model.meta.PropertyLength;

import org.jkiss.dbeaver.model.meta.Association;
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    // -----------------
        packageDepCache = new JDBCObjectSimpleCache<>(DB2PackageDep.class, C_DEP, schema.getName(),

    }
            this.id = JDBCUtils.safeGetLong(dbResult, "PKGID");
    private Timestamp firstBindTime;
    public String getUniqueId()
import org.jkiss.dbeaver.model.struct.DBSObject;
    public String getSqlerror()
    {
            this.busTimeSensitive = JDBCUtils.safeGetBoolean(dbResult, "BUSTIMESENSITIVE", DB2YesNo.Y.name());
    }
    private String owner;
        this.explicitBindTime = JDBCUtils.safeGetTimestamp(dbResult, "EXPLICIT_BIND_TIME");
        return lastUsed;
        this.intraParallel = JDBCUtils.safeGetString(dbResult, "INTRA_PARALLEL");
    public String getIsolation()
    @Nullable
    }
    {
        this.uniqueId = JDBCUtils.safeGetString(dbResult, "UNIQUE_ID");
    private DB2OwnerType ownerType;
    private String uniqueId;
    {
import org.jkiss.dbeaver.DBException;

    private String funcPath;
    private Boolean insertBuf;
    {

    @Property(viewable = false, order = 22)
    }
    private Date lastUsed;
    @Property(viewable = false, order = 31)
    private final DBSObjectCache<DB2Package, DB2PackageDep> packageDepCache;
    }
    @Property(viewable = true, order = 4, category = DB2Constants.CAT_OWNER)
import java.sql.ResultSet;

    }
    @Property(viewable = false, order = 54, category = DB2Constants.CAT_DATETIME)


    @Property(viewable = false, order = 50, category = DB2Constants.CAT_DATETIME)
    private Boolean valid;

        return ownerType;
import org.jkiss.dbeaver.model.meta.Property;
    {
    public String getBlocking()
    @Property(viewable = true, order = 21)
    @Property(viewable = false, order = 52, category = DB2Constants.CAT_DATETIME)
    public String getValidate()
        this.isolation = JDBCUtils.safeGetString(dbResult, "ISOLATION");
            getName());

        return staticAsDynamic;
    }
        return funcPath;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 *
        this.multiNodePlan = JDBCUtils.safeGetBoolean(dbResult, "MULTINODE_PLANS", DB2YesNo.Y.name());
    public String getDateTimeFormat()

        return queryOpt;
    @Property(viewable = false, order = 53, category = DB2Constants.CAT_DATETIME)

        return alterTime;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        return packageStatementsCache.getAllObjects(monitor, this);
    private Integer totalSections;
    public Boolean getStaticAsDynamic()

    public Collection<DB2PackageDep> getPackageDeps(DBRProgressMonitor monitor) throws DBException
    }
    {
        return sysTimeSensitive;
    private static final String C_STM = "SELECT * FROM SYSCAT.STATEMENTS WHERE PKGSCHEMA = ? AND PKGNAME = ? ORDER BY SECTNO WITH UR";
    private String sqlerror;
    public Boolean getBusTimeSensitive()

    }
        return defaultSchema;
            this.staticAsDynamic = JDBCUtils.safeGetBoolean(dbResult, "STATICASDYNAMIC", DB2YesNo.Y.name());
    {
import org.jkiss.code.Nullable;
public class DB2Package extends DB2SchemaObject implements DBPRefreshableObject {
        packageStatementsCache = new JDBCObjectSimpleCache<>(DB2PackageStatement.class, C_STM,
    @Property(viewable = false, order = 26)
        if (db2DataSource.isAtLeastV9_7()) {
import org.jkiss.utils.CommonUtils;
        return version;
    public Integer getTotalSections()
        return remarks;

    {
    private Boolean multiNodePlan;
    @Property(viewable = true, order = 25)
    {
 */

    {
    private final DBSObjectCache<DB2Package, DB2PackageStatement> packageStatementsCache;
    public Timestamp getFirstBindTime()
    private Boolean keepDynamic;
    @Property(viewable = true, order = 29)
    @Property(viewable = false, order = 23)
        this.totalSections = JDBCUtils.safeGetInteger(dbResult, "TOTAL_SECT");

        DB2DataSource db2DataSource = schema.getDataSource();
    public String getLangLevel()
    public String getConcurrentAccessResolution()

    {
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;

    }
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    {
    public Collection<DB2PackageStatement> getStatements(DBRProgressMonitor monitor) throws DBException
        return packageDepCache.getAllObjects(monitor, this);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
