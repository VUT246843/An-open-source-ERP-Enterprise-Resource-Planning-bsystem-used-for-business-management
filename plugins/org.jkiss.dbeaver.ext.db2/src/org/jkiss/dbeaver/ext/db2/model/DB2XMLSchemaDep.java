        if (depModuleName != null) {
            return null;
    // Constructors
    {
 * DB2 XML Schema Dependency
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.depModuleId = JDBCUtils.safeGetString(resultSet, "BMODULEID");
    {
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public DB2XMLSchemaDepType getXmlSchemaDepType()
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
            name = depModuleName + "." + name;
        // TODO DF: Bad should be BTYPE+BSCHEMA+BNAME

    private String depModuleName;
        String name = getName();
 */
 * You may obtain a copy of the License at
    }
 * @author Denis Forveille

    @Property(viewable = false, editable = false)
    public String getName()
    // Properties
    private DB2Schema depSchema;
import org.jkiss.dbeaver.model.meta.Property;
/*
    @Property(viewable = true, editable = false, order = 2)
        // Some dependncies are in Modules...Concatenate modulename and name
import org.jkiss.code.NotNull;
public class DB2XMLSchemaDep extends DB2Object<DB2XMLSchema> {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
    public DB2XMLSchemaDep(DB2XMLSchema db2XMLSchema, ResultSet resultSet) throws DBException

 * limitations under the License.


    public DBSObject getDepObject(DBRProgressMonitor monitor) throws DBException
    }
import org.jkiss.dbeaver.DBException;
        }
        return tabAuth;
 * Unless required by applicable law or agreed to in writing, software
    {
        return depSchema;
 *
 * you may not use this file except in compliance with the License.
        this.tabAuth = JDBCUtils.safeGetString(resultSet, "TABAUTH");
    public String getDepModuleId()
        this.xmlSchemaDepType = CommonUtils.valueOf(DB2XMLSchemaDepType.class, depType);
        String depType = JDBCUtils.safeGetString(resultSet, "BTYPE");
    {
    // -----------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        }
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
 * See the License for the specific language governing permissions and
        return xmlSchemaDepType.getDb2ObjectType().findObject(monitor, depSchema, name);
    }
 * DBeaver - Universal Database Manager
    // -----------------------
    {
            DB2ObjectType db2ObjectType = xmlSchemaDepType.getDb2ObjectType();
        return depModuleId;

        if (this.xmlSchemaDepType != null) {
 *
    @Override


    // -----------------------
            if (db2ObjectType != null) {
import org.jkiss.utils.CommonUtils;
    @Property(viewable = true, editable = false, order = 4)
    @Property(viewable = true, editable = false, order = 3)
        super(db2XMLSchema, JDBCUtils.safeGetString(resultSet, "BNAME"), true);
    }
    private String depModuleId;
/**
        if (xmlSchemaDepType == null || xmlSchemaDepType.getDb2ObjectType() == null) {

    private DB2XMLSchemaDepType xmlSchemaDepType;

                depSchema = getDataSource().getSchemaCache().getCachedObject(depSchemaName);


import java.sql.ResultSet;


    private String tabAuth;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // -----------------

            }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2XMLSchemaDepType;
    public DB2Schema getDepSchema()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObject;
        return xmlSchemaDepType;
 * 
package org.jkiss.dbeaver.ext.db2.model;

    {
    }
    @Property(viewable = false, editable = false)
    public String getTabAuth()
}
    @Property(viewable = true, editable = false, order = 1)
        this.depModuleName = JDBCUtils.safeGetString(resultSet, "BMODULENAME");
        return super.getName();
    {
        String depSchemaName = JDBCUtils.safeGetStringTrimmed(resultSet, "BSCHEMA");
        }
    }
