    public int getMinScale() {
    public Integer getPrecision() {

    // --------------
        this.length = JDBCUtils.safeGetInt(dbResult, "PRECISION");


package org.jkiss.dbeaver.ext.exasol.model;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.DBException;


    @Override

    @Nullable
        return null;
    		return typeDesc.dataKind;

                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.LONGNVARCHAR, precision, minimumScale, maximumScale, typeName);
 *
        }
        return DBUtils.getFullTypeName(this);
    // Helper Objects
    }
        if (typeDesc.maxScale != null) {
        this.name = typeName;


                break;
    private static final Log LOG = Log.getLog(ExasolDataType.class);
            case ExasolConstants.TYPE_VARCHAR:
    		return DBPDataKind.UNKNOWN;
                break;
        private final Integer maxScale;
            case "INTEGER":
    public int getEquivalentSqlType() {
        return typeDesc.sqlType;
                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, precision, minimumScale, maximumScale, typeName);
        return exasolSchema;
        return length;
public class ExasolDataType extends ExasolObject<DBSObject> implements DBSDataType, DBPQualifiedObject {
    }
            this.dataKind = dataKind;
		private final String name;
                break;

/**
 * See the License for the specific language governing permissions and
    }
    public int getMaxScale() {
        return 0;
            case "FLOAT":
        } else {

    // --------------
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 *
 * limitations under the License.
                break;
    public String getTypeName() {
                break;
        TypeDesc tempTypeDesc = null;
import java.sql.ResultSet;
    // Constructors
        String typeName = JDBCUtils.safeGetString(dbResult, "TYPE_NAME");
        private final Integer precision;
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.BINARY, precision, minimumScale, maximumScale, typeName);

    public Object geTypeExtension() {
    public int getTypeID() {

            this.sqlType = sqlType;
    @Property(viewable = true, editable = false, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
    }
                break;
    	if (typeDesc == null)

            this.minScale = minScale;
    }
            return typeDesc.maxScale;
 * Exasol data types
                break;
                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, precision, minimumScale, maximumScale, typeName);
            case "LONG VARCHAR":
    @Override
        // TODO Auto-generated method stub
import org.jkiss.dbeaver.model.struct.DBSDataType;
    @Override
    // -----------------
        this.exasolTypeId = JDBCUtils.safeGetLong(dbResult, "TYPE_ID");
    private TypeDesc typeDesc;
    private ExasolSchema exasolSchema;

    @NotNull
            case "BOOLEAN":
        return true;
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.FLOAT, precision, minimumScale, maximumScale, typeName);
    }
                break;
    private String name;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.meta.Property;
    @Override
        return name;

        return name;
    }
        return typeDesc.sqlType;
        if (typeDesc.minScale != null) {
    @Override
            return 0;
    }
        return null;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    public ExasolDataType(DBSObject owner, ResultSet dbResult) throws DBException {
                break;

        private final Integer minScale;
            case ExasolConstants.TYPE_DECIMAL:

    @Override
        return parentNode;
import org.jkiss.code.NotNull;
                tempTypeDesc = new TypeDesc(DBPDataKind.BOOLEAN, Types.BOOLEAN, precision, minimumScale, maximumScale, typeName);
    }
    public long getMaxLength() {

            return typeDesc.minScale;
                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, precision, minimumScale, maximumScale, typeName);
            case "BIGINT":
            this.maxScale = maxScale;
    public DBSObject getParentObject() {
 * DBeaver - Universal Database Manager
    @Property(viewable = false, editable = false, order = 11)
    }
    	}
        }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
    public boolean isPersisted() {
                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.CHAR, precision, minimumScale, maximumScale, typeName);
import java.sql.Types;
            case ExasolConstants.TYPE_HASHTYPE:


        super(parent, name, persisted);
    	} else {
                tempTypeDesc = new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP_WITH_TIMEZONE, precision, minimumScale, maximumScale, typeName);
    @Override
        return DBUtils.getDefaultOperators(this);
    }
    private static final class TypeDesc {
    }
    @Override
    @Property(viewable = true, editable = false, order = 2)

    private Integer scale;
import org.jkiss.code.Nullable;
    public long getTypeModifiers() {
    }
            case "DATE":
 *
import org.jkiss.dbeaver.model.DBPDataKind;
    public String getDescription() {
        return name;
    // -----------------------

                break;

    @Override
        this.scale = JDBCUtils.safeGetInt(dbResult, "MINIMUM_SCALE");
    @Property(viewable = false, editable = false, order = 10)

            return typeDesc.precision;
    }
        } else {

                break;

    @Override
    @Override
    @Override

    public String getFullTypeName() {


import org.jkiss.dbeaver.model.struct.DBSObject;
        }

        int minimumScale = JDBCUtils.safeGetInt(dbResult, "MINIMUM_SCALE");
                break;


            case "TIMESTAMP":
    private Integer length;
            default:
    private DBSObject parentNode; // see below
 * @author Karl Griesser
            case "INTERVAL DAY TO SECOND":
            case "TIMESTAMP WITH LOCAL TIME ZONE":
        } else {
            return 0;
                break;
    @Override

        int maximumScale = JDBCUtils.safeGetInt(dbResult, "MAXIMUM_SCALE");
            case ExasolConstants.TYPE_CHAR:
                tempTypeDesc = new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP, precision, minimumScale, maximumScale, typeName);
        this.typeDesc = tempTypeDesc;
    public String getName() {
        int precision = JDBCUtils.safeGetInt(dbResult, "PRECISION");
            case "INTERVAL YEAR TO MONTH":


import org.jkiss.dbeaver.model.DBUtils;
    }
    @Override
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.SMALLINT, precision, minimumScale, maximumScale, typeName);
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.DECIMAL, precision, minimumScale, maximumScale, typeName);
    }
    @Override
    @Override
            return 0;
/*
}
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.INTEGER, precision, minimumScale, maximumScale, typeName);
        return exasolTypeId;
            this.precision = precision;

    public Integer getScale() {
    @NotNull


    @Nullable


    @NotNull
    }
            case "SMALLINT":
    }
    // -----------------------
            case "GEOMETRY":
    public long getExasolTypeId() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            case "DOUBLE PRECISION":
        return scale;

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    public DBPDataKind getDataKind() {

        }
    @Property(viewable = true, editable = false, order = 5)

    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) throws DBException {
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.TINYINT, precision, minimumScale, maximumScale, typeName);
            case "TINYINT":
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
        private final DBPDataKind dataKind;


    @NotNull
        switch (name) {

    	{

    @Nullable
    protected ExasolDataType(DBSObject parent, String name, boolean persisted) {
    public ExasolSchema getSchema() {
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.BIGINT, precision, minimumScale, maximumScale, typeName);
    @NotNull
    @Property(viewable = false, editable = false, length = PropertyLength.MULTILINE)
                break;
        super(owner, JDBCUtils.safeGetString(dbResult, "TYPE_NAME"), true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                LOG.error("DataType '" + name + "' is unknown to DBeaver");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {

                break;
        private final Integer sqlType;
        @SuppressWarnings("unused")

    // -----------------
 */
                tempTypeDesc = new TypeDesc(DBPDataKind.NUMERIC, Types.DOUBLE, precision, minimumScale, maximumScale, typeName);
 * You may obtain a copy of the License at
            this.name = name;
        return null;
    @Property(viewable = true, editable = false, order = 4)
    // Properties
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                tempTypeDesc = new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, precision, minimumScale, maximumScale, typeName);
import org.jkiss.dbeaver.model.DBPQualifiedObject;
    }
    }
                break;
    }
    private long exasolTypeId;


import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        private TypeDesc(DBPDataKind dataKind, Integer sqlType, Integer precision, Integer minScale, Integer maxScale, String name) {
 * you may not use this file except in compliance with the License.
    @Property(viewable = true, editable = false, order = 6)
    @Override


                tempTypeDesc = new TypeDesc(DBPDataKind.DATETIME, Types.DATE, precision, minimumScale, maximumScale, typeName);
 *
    }
    @Override
                break;
                break;
    @NotNull
        if (typeDesc.precision != null) {
import org.jkiss.dbeaver.model.meta.PropertyLength;
