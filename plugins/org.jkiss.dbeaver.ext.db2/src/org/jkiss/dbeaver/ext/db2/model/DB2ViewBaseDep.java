    {
    {
            depObject = db2ObjectType.findObject(monitor, depSchema, getName());

import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableDepType;
    // -----------------

    @Property(viewable = true, editable = false, id = "Name", order = 1)
package org.jkiss.dbeaver.ext.db2.model;
    private DB2Schema depSchema;
    public DB2ViewBaseDep(DBRProgressMonitor monitor, DB2ViewBase db2ViewBase, ResultSet resultSet) throws DBException
        return super.getName();
import java.sql.ResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.tableDepType = CommonUtils.valueOf(DB2TableDepType.class, JDBCUtils.safeGetString(resultSet, "BTYPE"));
        return depModuleId;
 */
    }
 * 

    }
 *
        this.tabAuth = JDBCUtils.safeGetString(resultSet, "TABAUTH");
 * @author Denis Forveille
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        DB2ObjectType db2ObjectType = tableDepType.getDb2ObjectType();
 */
    // Constructors
    private String tabAuth;


        // TODO DF: Bad should be BTYPE+BSCHEMA+BNAME
    // Properties
    @Property(viewable = true, editable = false, order = 4)
    @Property(viewable = true, editable = false)
    }
import org.jkiss.code.NotNull;
        return depObject;
    @NotNull
/**

    // -----------------------
 * See the License for the specific language governing permissions and
        DB2DataSource db2DataSource = db2ViewBase.getDataSource();
 * DBeaver - Universal Database Manager
        }
    public DB2Schema getDepSchema()
    public String getName()

    private DBSObject depObject;
    }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        if (db2ObjectType != null) {

    {

 * Copyright (C) 2010-2024 DBeaver Corp and others
            depSchema = getDataSource().getSchema(monitor, depSchemaName);
    // -----------------------
 *
 * Unless required by applicable law or agreed to in writing, software
    }
    private DB2TableDepType tableDepType;
        return tabAuth;

import org.jkiss.dbeaver.DBException;
    {
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
        String depSchemaName = JDBCUtils.safeGetStringTrimmed(resultSet, "BSCHEMA");
 * You may obtain a copy of the License at
    public String getDepModuleId()
 *

    {

        super(db2ViewBase, JDBCUtils.safeGetString(resultSet, "BNAME"), true);
    private String depModuleId;
 * you may not use this file except in compliance with the License.
        return depSchema;
public class DB2ViewBaseDep extends DB2Object<DB2ViewBase> {
import org.jkiss.utils.CommonUtils;
/*
    {
    }
    @Override
}
    // -----------------
import org.jkiss.dbeaver.model.meta.Property;
    {
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    public DB2TableDepType getTableDepType()
            this.depModuleId = JDBCUtils.safeGetString(resultSet, "BMODULEID");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    @Property(viewable = true, editable = false, order = 2)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, editable = false)
        if (db2DataSource.isAtLeastV9_5()) {
        return tableDepType;
    public DBSObject getDepObject()


    }
    @Property(viewable = true, editable = false, order = 3)

 * DB2 Views like Dependency
    public String getTabAuth()

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObject;

