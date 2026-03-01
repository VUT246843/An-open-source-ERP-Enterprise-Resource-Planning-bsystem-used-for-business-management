 * DBeaver - Universal Database Manager
            if (db2ObjectType != null) {
        }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

        if (db2DataSource.isAtLeastV9_7()) {
            return null;
    @Property(viewable = true, editable = false, order = 6)
    @Property(viewable = false, editable = false)
    {
    @Property(viewable = true, editable = false, order = 3)

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import java.sql.ResultSet;
        if (packageDepType == null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getVersion()
 *     http://www.apache.org/licenses/LICENSE-2.0
    private String depModuleId;
    public String getBinderType()
            }
        return version;
    public DBSObject getDepObject(DBRProgressMonitor monitor) throws DBException
        this.version = JDBCUtils.safeGetString(resultSet, "PKGVERSION");
        if (this.packageDepType != null) {
            this.packageDepType = CommonUtils.valueOf(DB2PackageDepType.class, DB2PackageDepType.FAKE_PREFIX + depType);
 */
 * DB2 Package Dependency
    }
 * Unless required by applicable law or agreed to in writing, software
    public String getVarAuth()
    {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2PackageDepType;
    private String binderType;
    private DB2PackageDepType packageDepType;
        // Some dependencies are just numbers, not valid in a enum...

    public DB2PackageDepType getPackageDepType()
    }
        if (depModuleName != null) {

    public DB2PackageDep(DB2Package db2Package, ResultSet resultSet) throws DBException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = true, editable = false, order = 1)
        return packageDepType;
    {
    {

            DB2ObjectType db2ObjectType = packageDepType.getDb2ObjectType();
        }
    @Override
            this.depModuleName = JDBCUtils.safeGetString(resultSet, "BMODULENAME");
/*
        this.tabAuth = JDBCUtils.safeGetString(resultSet, "TABAUTH");
    @NotNull


        return depModuleId;
 * 
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    private String varAuth;
 */

        return depSchema;
    private String version;
    // Properties
    // Constructors
    {
    public String getDepModuleId()
                depSchema = getDataSource().getSchemaCache().getCachedObject(depSchemaName);
        }
        }
 * You may obtain a copy of the License at
        return varAuth;

        return binder;
    {

 * @author Denis Forveille
        if (packageDepType == null || packageDepType.getDb2ObjectType() == null) {
import org.jkiss.dbeaver.DBException;
/**
    // -----------------------



        return binderType;
        return packageDepType.getDb2ObjectType().findObject(monitor, depSchema, name);
    {
import org.jkiss.utils.CommonUtils;
    private String tabAuth;
    {
        String depSchemaName = JDBCUtils.safeGetStringTrimmed(resultSet, "BSCHEMA");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // this.uniqueId = JDBCUtils.safeGetString(resultSet, "UNIQUE_ID");

        DB2DataSource db2DataSource = db2Package.getDataSource();
    }
public class DB2PackageDep extends DB2Object<DB2Package> {
        String depType = JDBCUtils.safeGetString(resultSet, "BTYPE");
    @Property(viewable = true, editable = false, order = 5)
        return tabAuth;

    public String getName()
    }
    {

    @Property(viewable = false, editable = false)
    }
    // -----------------------
    }
import org.jkiss.dbeaver.model.meta.Property;
    public String getBinder()

    }
    @Property(viewable = true, editable = false, order = 2)
import org.jkiss.dbeaver.model.struct.DBSObject;

 *
 * you may not use this file except in compliance with the License.
        super(db2Package, JDBCUtils.safeGetString(resultSet, "BNAME"), true);

import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;

            this.binderType = JDBCUtils.safeGetString(resultSet, "BINDERTYPE");
    // -----------------
 *
    }
 * limitations under the License.
    // -----------------
    @Property(viewable = false, editable = false)
        }
    }
    private String binder;
        String name = getName();

import org.jkiss.code.NotNull;
    }
 *
}
        // TODO DF: Bad should be BTYPE+BSCHEMA+BNAME
    private String depModuleName;
package org.jkiss.dbeaver.ext.db2.model;
    public DB2Schema getDepSchema()
    @Property(viewable = true, editable = false, order = 7)
    @Property(viewable = true, editable = false, order = 4)
            name = depModuleName + "." + name;
    {
            this.binder = JDBCUtils.safeGetString(resultSet, "BINDER");

    public String getTabAuth()
 * Licensed under the Apache License, Version 2.0 (the "License");
    private DB2Schema depSchema;
        this.packageDepType = CommonUtils.valueOf(DB2PackageDepType.class, depType);
    {
            this.depModuleId = JDBCUtils.safeGetString(resultSet, "BMODULEID");
            this.varAuth = JDBCUtils.safeGetString(resultSet, "VARAUTH");
        // Some dependencies are in Modules...Concatenate modulename and name
        return super.getName();
