    @Property(viewable = true, editable = false, order = 1)

        super(schema, JDBCUtils.safeGetString(dbResult, "NAME"), true);
    {
import org.jkiss.dbeaver.DBException;
        return type;

 *
    {
    }

 */
/*
    }
public class DB2Alias extends DB2SchemaObject implements DBSAlias {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
/**
    // -----------------
    {
    private DB2AliasType type;

import org.jkiss.code.NotNull;

        String baseObjectName = JDBCUtils.safeGetString(dbResult, "BASE_NAME");
    {

    public String getName()
    }
    @Override
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
        switch (type) {
        this.type = CommonUtils.valueOf(DB2AliasType.class, JDBCUtils.safeGetString(dbResult, "TYPE"));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2AliasType;
        }
    public DBSObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
        return super.getSchema();
 * you may not use this file except in compliance with the License.
 * DB2 Alias. Can be on DB2Table, DB2Sequence or DB2Module
    // -----------------
    // -----------------------
import java.sql.ResultSet;
    public DBSObject getTargetObject()
 *
 *
    public DB2Alias(DBRProgressMonitor monitor, DB2Schema schema, ResultSet dbResult) throws DBException
    }
 * You may obtain a copy of the License at
            break;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = true, editable = false, order = 2)
            break;
            this.targetObject = targetSchema.getTable(monitor, baseObjectName);
    @NotNull
    public DB2AliasType getType()

            this.targetObject = targetSchema.getModule(monitor, baseObjectName);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;

            break;

    // Constructors
}
        case TABLE:
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software

        return getTargetObject();
            this.targetObject = targetSchema.getSequence(monitor, baseObjectName);
 * 
    @Property(viewable = true, editable = false, order = 4)

        DB2Schema targetSchema = getDataSource().getSchema(monitor, baseSchemaName);
    @Property(viewable = true, editable = false, order = 3)
    // Properties
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
        return targetObject;
    public DB2Schema getSchema()

        return super.getName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    // -----------------------
import org.jkiss.dbeaver.model.meta.Property;


        String baseSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "BASE_SCHEMA");
 * @author Denis Forveille
    {
        case MODULE:
import org.jkiss.dbeaver.model.struct.DBSAlias;
import org.jkiss.utils.CommonUtils;
 * limitations under the License.
 */
    @Override
package org.jkiss.dbeaver.ext.db2.model;
    private DBSObject targetObject;
        case SEQUENCE:
