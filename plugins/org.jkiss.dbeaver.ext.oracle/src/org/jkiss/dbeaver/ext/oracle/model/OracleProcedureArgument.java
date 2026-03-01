        this.type = CommonUtils.isEmpty(dataType) ? null : OracleDataType.resolveDataType(
    @Override
import org.jkiss.code.Nullable;

    {
        attributes.add(attribute);
    {
import org.jkiss.dbeaver.model.DBPDataKind;
            procedure.getDataSource(),
    @Override
    @Override
 * You may obtain a copy of the License at
        return DBUtils.getFullTypeName(this);
            this.mode =OracleParameterMode.RETURN;
    }
    {
    @NotNull
        } else {
    @NotNull
    @Nullable
    @Override
    @Override

            if (this.dataType == null) {
import java.util.ArrayList;
    }
import org.jkiss.code.NotNull;
        return true;
    }

    public boolean hasAttributes()
public class OracleProcedureArgument implements DBSProcedureParameter, DBSTypedObject
 */
    {
    }
            dataType);
                this.packageTypeName = typeOwner + "." + typeName;
            monitor,
            packageTypeName = typeName + "." + packageTypeName;
    private String name;
    public String getName()
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 * See the License for the specific language governing permissions and

    public DBPDataKind getDataKind()
package org.jkiss.dbeaver.ext.oracle.model;
    @Nullable
            this.dataType = OracleDataType.resolveDataType(
    @Property(viewable = true, order = 40)
        if (!CommonUtils.isEmpty(typeName) && !CommonUtils.isEmpty(typeOwner) && CommonUtils.isEmpty(this.packageTypeName)) {
    public OracleProcedureBase getParentObject()
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.name = JDBCUtils.safeGetString(dbResult, "ARGUMENT_NAME");
    {
    public boolean isResultArgument() {
        return dataLength;

 * OracleProcedureArgument
    public int getSequence()
        this.dataLevel = JDBCUtils.safeGetInt(dbResult, "DATA_LEVEL");
 */
            }
        this.dataLength = JDBCUtils.safeGetInt(dbResult, "DATA_LENGTH");
        }

    {
    private OracleParameterMode mode;
    {
    @Override
    {
 * limitations under the License.
        }
    {
    }
        this.procedure = procedure;

        return type == null ? packageTypeName : type.getName();
        final String dataType = JDBCUtils.safeGetString(dbResult, "DATA_TYPE");
    }
    @Override
    private String packageTypeName;
    {
        return type == null ? DBPDataKind.OBJECT : type.getDataKind();
    private int dataScale;
    private int dataLength;
    @Override
    public DBSProcedureParameterKind getParameterKind()


    }
    public boolean isPersisted()
    }
    {
        if (CommonUtils.isEmpty(this.name)) {
    public String getDescription()
import java.sql.ResultSet;
    }
    @Override
                typeName);

        if (attributes == null) {
        final String typeOwner = JDBCUtils.safeGetString(dbResult, "TYPE_OWNER");
 *
    }
        return null;
    private int sequence;
    public OracleDataSource getDataSource()
    {
    }

    @Property(viewable = true, order = 21)
    @Override
    }
                // Collection element
        return sequence;
import org.jkiss.dbeaver.model.meta.Property;
    public long getMaxLength()
    {
    {
import org.jkiss.dbeaver.model.meta.Association;
    public String getTypeName()
        return dataScale;

                procedure.getDataSource(),


}
    public long getTypeModifiers() {
    {
    @NotNull

        if (CommonUtils.isEmpty(name)) {
    @Property(viewable = true, order = 30)

    }
        this.packageTypeName = JDBCUtils.safeGetString(dbResult, "TYPE_SUBNAME");
    void addAttribute(OracleProcedureArgument attribute)
        return dataPrecision;
    private int dataPrecision;
    @Override
        return dataLevel;
            if (dataLevel == 0) {
        return name;

        }
    private final OracleProcedureBase procedure;
            dataType == null ? type : dataType;
import java.util.List;
    public DBSTypedObject getParameterType() {
        OracleProcedureBase procedure,
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getFullTypeName() {


import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
{
            }
        this.position = JDBCUtils.safeGetInt(dbResult, "POSITION");
    @Override
    public Integer getPrecision()
        } else if (this.packageTypeName != null) {
    }
    private int position;
    public int getDataLevel()
        return procedure.getDataSource();
    @NotNull
    public int getPosition()
                return "ELEMENT";
                monitor,

        return this;
                return "RESULT";
    }
        return CommonUtils.isEmpty(name) && dataLevel == 0;
    private OracleDataType dataType;
    @Property(viewable = true, order = 50)

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
            null,
 * you may not use this file except in compliance with the License.
    {
    @Property(viewable = true, order = 20)
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
/**

    }
 *
    private OracleDataType type;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.dataScale = JDBCUtils.safeGetInt(dbResult, "DATA_SCALE");
    @Override
    private int dataLevel;
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
import org.jkiss.utils.CommonUtils;
/*
    }

    public int getTypeID()
        ResultSet dbResult)
 *
        return position;
        this.sequence = JDBCUtils.safeGetInt(dbResult, "SEQUENCE");
    }
        final String typeName = JDBCUtils.safeGetString(dbResult, "TYPE_NAME");
        return mode == null ? DBSProcedureParameterKind.UNKNOWN : mode.getParameterKind();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return procedure;
    {

    private List<OracleProcedureArgument> attributes;
    @Property(viewable = true, order = 10)
        }
    }
            attributes = new ArrayList<>();
    @Association
    @NotNull

        this.dataPrecision = JDBCUtils.safeGetInt(dbResult, "DATA_PRECISION");

                typeOwner,
    public OracleProcedureArgument(
    public List<OracleProcedureArgument> getAttributes()
        return !CommonUtils.isEmpty(attributes);
            packageTypeName :
    @NotNull
    @Override
    @Property(viewable = true, order = 11)
    public Integer getScale()
    {
        DBRProgressMonitor monitor,
        return 0;
    @NotNull
    public Object getType()
    @Override
                // Function result
        return packageTypeName != null ?
        return attributes;
 * Unless required by applicable law or agreed to in writing, software
            this.mode = OracleParameterMode.getMode(JDBCUtils.safeGetString(dbResult, "IN_OUT"));
    }
    }

        return type == null ? 0 : type.getTypeID();
