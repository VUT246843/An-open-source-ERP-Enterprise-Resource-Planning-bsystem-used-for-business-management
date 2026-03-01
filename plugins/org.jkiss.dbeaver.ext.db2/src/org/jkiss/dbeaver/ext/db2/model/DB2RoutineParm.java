    private String            remarks;
    {
        return remarks;
    {
/**
            return;
    @NotNull
    @Override
        return length;
    @Override
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
        // -------------------
    }
    public DB2Routine getParentObject()
        return dataType;
    @NotNull
        return name;

    {
    @Property(viewable = true, order = 4)
    @Override
    @Override
    }
        if (this.dataType != null) {
        String typeSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TYPESCHEMA");

    }
    {
        this.remarks = JDBCUtils.safeGetStringTrimmed(dbResult, DB2Constants.SYSCOLUMN_REMARKS);


    private DB2RoutineRowType rowType;
        // -------------------
        // First Search in System/Standard Data Types
        this.rowType = CommonUtils.valueOf(DB2RoutineRowType.class, JDBCUtils.safeGetString(dbResult, "ROWTYPE"));

            this.dataType = db2Module.getType(monitor, typeName);
    @Property(viewable = true, order = 3)
    @Override
 *
    @Override
    private DB2DataType       dataType;
        return procedure.getDataSource();
 * You may obtain a copy of the License at
            // Some parameters (e.g. all parameters in system-defined routines) may not have a name. Let's name them based on their ordinal
    public Integer getScale()
    {
    public DB2RoutineParm(DBRProgressMonitor monitor, DB2Routine procedure, ResultSet dbResult) throws DBException
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            name = UNNAMED_PARAM_PREFIX + JDBCUtils.safeGetInt(dbResult, "ORDINAL");
    }
    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;

        return 0;
    @NotNull
import org.jkiss.dbeaver.ext.db2.DB2Utils;
    // -----------------------
    {
    }
 * See the License for the specific language governing permissions and
        this.scale = JDBCUtils.safeGetInteger(dbResult, "SCALE");

    public Integer getPrecision()
        return procedure;
    @Override
            return;
        this.dataType = db2DataSource.getLocalDataType(typeName);
    }
    public DBSTypedObject getParameterType()
    @Property(viewable = true, order = 2)
    public int getTypeID()
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
        this.procedure = procedure;
        this.typeName = JDBCUtils.safeGetStringTrimmed(dbResult, "TYPENAME");
    @Override

    {
    {
    @NotNull
    private static final String UNNAMED_PARAM_PREFIX = "parameter#";
        } else {

import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
        return scale;
        String parmName = JDBCUtils.safeGetStringTrimmed(dbResult, "PARMNAME");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public long getTypeModifiers() {
    }
import org.jkiss.dbeaver.model.DBPDataKind;
    }

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getTypeName()
        this.dataTypeSchema = db2DataSource.getSchema(monitor, typeSchemaName);
    @Override
        return dataType.getDataKind();
 * Copyright (C) 2010-2024 DBeaver Corp and others


        return 0;
    // -----------------------
        return DBUtils.getFullTypeName(this);
 */
    public String getName()

    @Override
        this.dataType = this.dataTypeSchema.getUDT(monitor, typeName);
        super();
    // -----------------------
    @Override

    }

package org.jkiss.dbeaver.ext.db2.model;
    private Integer           scale;
    }
    // DF: Strange typeName and typeId are attributes of DBPDataKind...

    @Override
    }
 * limitations under the License.
        }
        // Not found, search for a UDT
    {
        return this;
    // Properties
 * DB2 Routine Parameter
        return rowType.getParameterKind();
    @NotNull
}
        return dataType.getEquivalentSqlType();

    @Nullable
import org.jkiss.dbeaver.ext.db2.model.dict.DB2RoutineRowType;
    {
        // Not found : Search for a UDT in Module

 *
import java.sql.ResultSet;
    }
 * 

    }
    private Integer           length;
    public DBPDataKind getDataKind()

 *
    public boolean isPersisted()
        return dataTypeSchema;
    @NotNull
        String typeModuleName = JDBCUtils.safeGetStringTrimmed(dbResult, "TYPEMODULENAME");
    {
    }
        }
    public DB2RoutineRowType getRowType()
    // -----------------------
    @Override
    {
        // Search for DataType
    @Override
public class DB2RoutineParm implements DBSProcedureParameter, DBSTypedObject, DBSTypedObjectEx {
    }

 * @author Denis Forveille
    private String            typeName;
    @Property(viewable = true, order = 1)
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    public String getFullTypeName()
    public DBSProcedureParameterKind getParameterKind()


        this.length = JDBCUtils.safeGetInteger(dbResult, "LENGTH");
    {
    @Property(viewable = true, order = 6)
    @Property(viewable = true, order = 5)
    @Override

        return rowType;
    {
 */
    {
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    private final DB2Routine  procedure;
    public DB2DataType getDataType()
    public DB2Schema getDataTypeSchema()

    @Override
            name = parmName;
import org.jkiss.dbeaver.model.DBUtils;

import org.jkiss.dbeaver.model.meta.Property;
/*
        return true;
    private DB2Schema         dataTypeSchema;
 * you may not use this file except in compliance with the License.
    public String getDescription()
    public long getMaxLength()
import org.jkiss.dbeaver.DBException;


    {
    public DB2DataSource getDataSource()
    }
    {
        return typeName;
    // Constructors

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2013-2017 Denis Forveille (titou10.titou10@gmail.com)
        DB2DataSource db2DataSource = getDataSource();
import org.jkiss.code.NotNull;

    private String            name;
        // TODO Auto-generated method stub
        if (parmName == null) {

    {
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            DB2Module db2Module = DB2Utils.findModuleBySchemaNameAndName(monitor, db2DataSource, typeSchemaName, typeModuleName);
        if (typeModuleName != null) {
        }
    @Nullable
