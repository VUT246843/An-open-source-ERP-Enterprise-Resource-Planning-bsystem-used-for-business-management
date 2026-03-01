 * 
    private DB2Schema objectSchema;
    public DBSObject getObject()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DB2GrantorGranteeType getGrantorType()
    // -----------------
    {
package org.jkiss.dbeaver.ext.db2.model.security;
    // -----------------
 *
            if (objectSchemaName != null) {
    // Properties
        return grantor;
        return object;

    }
    public String getName()
    // -----------------------
    @Property(viewable = true, order = 1)
    @Property(viewable = true, order = 2)
        return super.getName();
        default:
    {
            break;
        return objectSchema;
 * See the License for the specific language governing permissions and
    }

import org.jkiss.code.NotNull;
        }
 * you may not use this file except in compliance with the License.
    // Constructors
    }

    private DBSObject grantor;
import org.jkiss.dbeaver.DBException;
            this.grantor = db2Grantee.getDataSource().getUser(monitor, grantorName);

import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;

 * DBeaver - Universal Database Manager


 * Base class for DB2 Authorisations
        } else {
    {
            String objectSchemaName = JDBCUtils.safeGetStringTrimmed(resultSet, "OBJ_SCHEMA");
 * Licensed under the Apache License, Version 2.0 (the "License");

    private DB2GrantorGranteeType grantorType;
 * @author Denis Forveille
        }
    }
        if (object instanceof DB2SchemaObject) {
            DB2DataSource db2DataSource = db2Grantee.getDataSource();
/**
    // -----------------------
    public DBSObject getGrantor()
import org.jkiss.dbeaver.ext.db2.model.DB2Object;
}

    }

    @Property(viewable = true, order = 4)
/*
        String grantorName = JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTOR");
import org.jkiss.dbeaver.model.access.DBAPrivilege;
import java.sql.ResultSet;


        switch (grantorType) {
    @Property(hidden = true)
    public DB2AuthBase(DBRProgressMonitor monitor, DB2Grantee db2Grantee, DBSObject object, ResultSet resultSet) throws DBException
import org.jkiss.utils.CommonUtils;

        super(db2Grantee, JDBCUtils.safeGetStringTrimmed(resultSet, "OBJ_SCHEMA") + "."
 *     http://www.apache.org/licenses/LICENSE-2.0
    {

    private DBSObject object;
 */
public abstract class DB2AuthBase extends DB2Object<DB2Grantee> implements DBAPrivilege {
    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.meta.Property;
        this.object = object;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.db2.model.DB2SchemaObject;
 */
        case G:
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        case U:
    @Property(viewable = true, order = 3)
    @NotNull
        return grantorType;
            break;
    public DB2Schema getObjectSchema()
 * You may obtain a copy of the License at
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
            this.grantor = db2Grantee.getDataSource().getGroup(monitor, grantorName);
            }
            this.objectSchema = ((DB2SchemaObject) object).getSchema();
                this.objectSchema = db2DataSource.getSchema(monitor, objectSchemaName);
import org.jkiss.dbeaver.ext.db2.model.DB2Schema;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            JDBCUtils.safeGetStringTrimmed(resultSet, "GRANTORTYPE"));
 *
 *
        this.grantorType = CommonUtils.valueOf(DB2GrantorGranteeType.class,
            + JDBCUtils.safeGetString(resultSet, "OBJ_NAME"), true);

            break;
    {

        // get schema from object itself if this is a DB2SchemaObject
