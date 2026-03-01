    {

    @Override

import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;

    @Property(viewable = true, order = 2)
        return depObject;
    private DB2TriggerDepType triggerDepType;
        DB2ObjectType db2ObjectType = triggerDepType.getDb2ObjectType();
        this.depModuleId = JDBCUtils.safeGetString(resultSet, "BMODULEID");
    @Property(viewable = true)
 * @author Denis Forveille
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    private DBSObject depObject;
 * 
        // TODO DF: Bad should be BTYPE+BSCHEMA+BNAME
 * limitations under the License.
    public DB2TriggerDepType getTriggerDepType()
        this.tabAuth = JDBCUtils.safeGetString(resultSet, "TABAUTH");

    public String getName()

    // -----------------
    private String depModuleId;
    // -----------------------
    @Property(viewable = true, order = 3)
    @Property(viewable = true, id = "Name", order = 1)
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 4)
import org.jkiss.dbeaver.model.meta.Property;
 *
        return depModuleId;
    @Property(viewable = true)
    {
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TriggerDepType;
package org.jkiss.dbeaver.ext.db2.model;
 * Unless required by applicable law or agreed to in writing, software
    // -----------------------
        String depSchemaName = JDBCUtils.safeGetStringTrimmed(resultSet, "BSCHEMA");
    }

    {
    }
    {
            depObject = db2ObjectType.findObject(monitor, depSchema, getName());
    // -----------------
    @NotNull
 */
        super(db2Trigger, JDBCUtils.safeGetString(resultSet, "BNAME"), true);
            depSchema = getDataSource().getSchema(monitor, depSchemaName);

}
public class DB2TriggerDep extends DB2Object<DB2Trigger> {
import java.sql.ResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *

    public DB2TriggerDep(DBRProgressMonitor monitor, DB2Trigger db2Trigger, ResultSet resultSet) throws DBException

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        return super.getName();


    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private DB2Schema depSchema;
    }
 * You may obtain a copy of the License at
 *
 * DBeaver - Universal Database Manager
    // Properties
    public DBSObject getDepObject()
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
    private String tabAuth;
    // Constructors

    public DB2Schema getDepSchema()
        }
    public String getTabAuth()
        if (db2ObjectType != null) {
        return tabAuth;
import org.jkiss.dbeaver.DBException;
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
/**
 * DB2 Trigger Dependency
    }
 */

        return depSchema;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

/*
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.triggerDepType = CommonUtils.valueOf(DB2TriggerDepType.class, JDBCUtils.safeGetString(resultSet, "BTYPE"));
    }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

        return triggerDepType;
import org.jkiss.code.NotNull;
    public String getDepModuleId()
