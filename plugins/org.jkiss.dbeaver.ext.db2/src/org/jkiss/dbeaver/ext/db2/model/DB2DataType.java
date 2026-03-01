    public String getTypeName()
        return db2Module;
        return sourceSchemaName;
    public String getDescription()
import org.jkiss.code.NotNull;
    }


        {
    {
        return DBUtils.getFullTypeName(this);
    private DB2DataTypeMetaType metaType;

    {
    private DB2Module db2Module;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2OwnerType;
        return ownerCol;
    @Property(viewable = false, editable = false, order = 11)
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
import org.jkiss.dbeaver.model.struct.DBSDataType;
    public Timestamp getCreateTime()
        // Determine DBSKind and javax.sql.Types
    public DB2OwnerType getOwnerType()
 * DB2 data types
        // nothing is displayed and the following message appears in the logs :
    public String getOwner()
    {
    {
    }
        PREDEFINED_TYPES.put("BOOLEAN", new TypeDesc(DBPDataKind.BOOLEAN, Types.BOOLEAN, 0, 0, 0, 0));
        this.ownerCol = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER);
 * @author Denis Forveille
                    log.debug(name + " is a User Defined Type base on another UDT. Set its DBPDataKind to UNKNOWN/OTHER");
            if (owner instanceof DB2Module) {
        this.typeDesc = tempTypeDesc;
    }

        return db2TypeId;
    @Property(viewable = true, editable = false, order = 2)
    {
        PREDEFINED_TYPES.put("LONG VARGRAPHIC", new TypeDesc(DBPDataKind.STRING, Types.LONGVARCHAR, 0, 0, 0, 16350));
    @NotNull
                } catch (DBException e) {
        // !MESSAGE Can't find tree node for object <database name> (org.jkiss.dbeaver.ext.db2.model.DB2DataSource)
import org.jkiss.dbeaver.ext.db2.DB2Utils;

    @Override


    }
            fullyQualifiedName = name;
    }
        PREDEFINED_TYPES.put("GRAPHIC", new TypeDesc(DBPDataKind.STRING, Types.CHAR, 0, 0, 0, 127));
            this.sourceModuleName = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCEMODULENAME");

                    tempTypeDesc = PREDEFINED_TYPES.get(sourceName);
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;


    {
    // -----------------
    }
        this.metaType = CommonUtils.valueOf(DB2DataTypeMetaType.class, JDBCUtils.safeGetString(dbResult, "METATYPE"));
    }
    static {
/*
        if (db2DataSource.isAtLeastV10_5()) {
    }

            } else {
        return null;
import java.util.Map;
    public Integer getPrecision()
    }
import org.jkiss.utils.CommonUtils;
    private String fullyQualifiedName;
    private TypeDesc typeDesc;
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute)

            this.sqlType = sqlType;

 * limitations under the License.
    {
    public int getEquivalentSqlType()
        return name;
            case A:
    {
    public DB2DataType(DBSObject owner, ResultSet dbResult) throws DBException
    public Object geTypeExtension()
            case R:
 *
    // -----------------
    private DBSObject parentNode; // See below
                tempTypeDesc = new TypeDesc(DBPDataKind.ARRAY, Types.ARRAY, 0, 0, 0, 0);
    private static final class TypeDesc {

                }


            }
                    this.db2Module = DB2Utils.findModuleBySchemaNameAndName(new VoidProgressMonitor(), db2DataSource,
                    tempTypeDesc = new TypeDesc(DBPDataKind.UNKNOWN, Types.OTHER, 0, 0, 0, 0);
        TypeDesc tempTypeDesc = null;
    @NotNull
                break;
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
/**
        PREDEFINED_TYPES.put("ARRAY", new TypeDesc(DBPDataKind.ARRAY, Types.ARRAY, 0, 0, 0, 0));
    {
    {
                    // In this case, 'this.db2Schema' will be null...

    @Override
            this.dataKind = dataKind;
        private final int minScale;
        // - DataSource (= "System" DataTypes)
        if (tempTypeDesc == null) {
    private String ownerCol;

        return ownerType;
                }
    {

        this.length = JDBCUtils.safeGetInteger(dbResult, "LENGTH");
    {
    @Nullable
        private final int maxScale;

    @Property(viewable = true, editable = false, order = 5)
            switch (metaType) {
            this.lastRegenTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REGEN_TIME");
    }
        DB2DataSource db2DataSource = (DB2DataSource) owner.getDataSource();
    @Nullable
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)

            this.db2Schema = (DB2Schema) owner;

package org.jkiss.dbeaver.ext.db2.model;
                    this.db2Schema = db2DataSource.getSchema(new VoidProgressMonitor(), schemaName);
    }
        }
    {
import java.util.HashMap;
    @Property(viewable = true, editable = false, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
        // DB2DataType can have 3 owners:

        PREDEFINED_TYPES.put("DECIMAL", new TypeDesc(DBPDataKind.NUMERIC, Types.DECIMAL, 31, 0, 31, 0));

    }
                // If the UDT is based on a SYSIBM dataType, get it
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 * you may not use this file except in compliance with the License.
        this.sourceSchemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCESCHEMA");
        PREDEFINED_TYPES.put("TIMESTAMP", new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP, 32, 0, 12, 0));
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    // could lead to infinite loops:
                    log.error("Impossible! Schema '" + schemaName + "' for dataType '" + name + "' not found??", e);
        if ((parent instanceof DB2Schema) || (parent instanceof DB2Module)) {
    {
                if ((sourceSchemaName != null) && (sourceSchemaName.equals(DB2Constants.SYSTEM_DATATYPE_SCHEMA))) {
        // Store associated DB2Schema
 * See the License for the specific language governing permissions and
        return db2Schema;
            default:
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_SOURCE, order = 20)
    public Integer getDb2TypeId()
    private Integer length;
    public Timestamp getLastRegenTime()
        super(owner, JDBCUtils.safeGetStringTrimmed(dbResult, "TYPENAME"), true);
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
    private DB2OwnerType ownerType;
    // --------------
        return length;

        private TypeDesc(DBPDataKind dataKind, int sqlType, int precision, int minScale, int maxScale, int charLength)
    {
    @Property(viewable = true, editable = false, order = 6)
        } else {
    private Timestamp alterTime;
    @Override
 *
    {


        PREDEFINED_TYPES.put("BIGINT", new TypeDesc(DBPDataKind.NUMERIC, Types.BIGINT, 20, 0, 0, 0));
    {
        PREDEFINED_TYPES.put("VARCHAR", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0, 4000));
    // -----------------------
        return lastRegenTime;
    public DB2Schema getSchema()
        PREDEFINED_TYPES.put("DATE", new TypeDesc(DBPDataKind.DATETIME, Types.DATE, 10, 0, 0, 0));

    private Timestamp createTime;
        return metaType;
    // --------------
        return sourceModuleName;
        return constraintText;
                this.db2Schema = ((DB2Module) owner).getSchema();

    public String getConstraintText()
            this.minScale = minScale;
        PREDEFINED_TYPES.put("CHARACTER", new TypeDesc(DBPDataKind.STRING, Types.CHAR, 0, 0, 0, 254));
        // - DB2Schema (=UDT)
    public DB2Module getModule()
        return createTime;
                String typeModuleName = JDBCUtils.safeGetStringTrimmed(dbResult, "TYPEMODULENAME");
                    // This UDT is based on another UDT, set it's TypeDesc to unkknown as looking for the base type recursively
            this.precision = precision;

        PREDEFINED_TYPES.put("ROW", new TypeDesc(DBPDataKind.STRUCT, Types.ROWID, 0, 0, 0, 0));
            // so tempTypeDesc may be null at this time even if the schema is SYSIBM

    public DB2DataTypeMetaType getMetaType()
        PREDEFINED_TYPES.put("VARGRAPHIC", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0, 16336));
    }
        PREDEFINED_TYPES.put(DB2Constants.TYPE_NAME_DECFLOAT,
    public Integer getScale()
    }
    @Override
        this.sourceName = JDBCUtils.safeGetString(dbResult, "SOURCENAME");

        private final DBPDataKind dataKind;
        PREDEFINED_TYPES.put("SMALLINT", new TypeDesc(DBPDataKind.NUMERIC, Types.SMALLINT, 5, 0, 0, 0));
    }
        return typeDesc.sqlType;
            this.constraintText = JDBCUtils.safeGetString(dbResult, "CONSTRAINT_TEXT");

            parentNode = parent;
        this.scale = JDBCUtils.safeGetInteger(dbResult, "SCALE");
        PREDEFINED_TYPES.put("LONG VARCHAR", new TypeDesc(DBPDataKind.STRING, Types.LONGVARCHAR, 0, 0, 0, 32700));
    }
            new TypeDesc(DBPDataKind.NUMERIC, DB2Constants.EXT_TYPE_DECFLOAT, 34, 0, 0, 0));
                    // load corresponding module ->module load its own UDTs ->come back here to instanciate the UDT -> look for type
        }
        }
    }
    {

    }
    }
    private DB2Schema db2Schema;
    {
    {

    @Override
        return metaType;
        PREDEFINED_TYPES.put("XML", new TypeDesc(DBPDataKind.CONTENT, Types.SQLXML, 0, 0, 0, 0));
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    @Override
        }
        } else {
                    // It would have to be done recursively with a direct SQL. No real benefit here..
        }
    // -----------------------
            this.charLength = charLength;

import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.code.Nullable;
            // Check for Structured or Array like DataTypes
            // This is a UDT
        PREDEFINED_TYPES.put("REAL", new TypeDesc(DBPDataKind.NUMERIC, Types.REAL, 24, 0, 0, 0));
            // NLS_STRING_UNITS_TYPE is a SYSIBM type, but not a predefined one...
import org.jkiss.dbeaver.ext.db2.model.dict.DB2DataTypeMetaType;
        PREDEFINED_TYPES.put("TIME", new TypeDesc(DBPDataKind.DATETIME, Types.TIME, 8, 0, 0, 0));
        private final int sqlType;
        return name;
    @NotNull


        PREDEFINED_TYPES.put("REFERENCE", new TypeDesc(DBPDataKind.REFERENCE, Types.REF, 0, 0, 0, 0));
                break;
    private static final Map<String, TypeDesc> PREDEFINED_TYPES = new HashMap<>(32); // See init below
        return typeDesc.precision;
        PREDEFINED_TYPES.put("DOUBLE", new TypeDesc(DBPDataKind.NUMERIC, Types.DOUBLE, 53, 0, 0, 0));
 * 
    private String remarks;
import java.sql.Timestamp;
    public int getMaxScale()
                try {
    @Override
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_SOURCE, order = 21)
        return typeDesc.minScale;
    private String sourceModuleName;
 *

        return scale;

    @Override
    }
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
                // System datatypes
    @Nullable
    public long getMaxLength()



import org.jkiss.dbeaver.DBException;
            return typeDesc.charLength;
    // Properties
        return fullyQualifiedName;
        if ((db2Schema != null) && (db2Schema.getName().equals(DB2Constants.SYSTEM_DATATYPE_SCHEMA))) {
                    // module etc.
import org.jkiss.dbeaver.model.meta.Property;
    }

 */
 */
    public String getFullTypeName() {
        if (db2DataSource.isAtLeastV9_7()) {
    @Override
    @NotNull
        PREDEFINED_TYPES.put("INTEGER", new TypeDesc(DBPDataKind.NUMERIC, Types.INTEGER, 10, 0, 0, 0));
            this.maxScale = maxScale;
        PREDEFINED_TYPES.put("CLOB", new TypeDesc(DBPDataKind.CONTENT, Types.CLOB, 0, 0, 0, 2147483647));
        }
    {


        private final int precision;
                tempTypeDesc = new TypeDesc(DBPDataKind.STRUCT, Types.STRUCT, 0, 0, 0, 0);
    public int getMinScale()
        return parentNode;
        } else {
            // DF: not sure of that. Maybe for system DataTypes, we should set db2Schema to null instead..
            this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_OWNER_TYPE));

        }
    private String sourceSchemaName;
    public int getTypeID()
        }
    @Property(viewable = false, editable = false, order = 5)
    // Constructors
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public DBPDataKind getDataKind()
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    }
        return sourceName;
                }
    @Override

                if (typeModuleName != null) {
        PREDEFINED_TYPES.put("VARBINARY", new TypeDesc(DBPDataKind.BINARY, Types.VARBINARY, 0, 0, 0, 32762));

    }
 * DBeaver - Universal Database Manager
}
                    // in
    public DBSObject getParentObject()
                } else {
    private Timestamp lastRegenTime;
    @NotNull
    @Nullable
    }
        }
        if (typeDesc != null && (typeDesc.dataKind == DBPDataKind.CONTENT || typeDesc.dataKind == DBPDataKind.STRING || typeDesc.dataKind == DBPDataKind.BINARY)) {

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_CREATE_TIME);
            }
    @Property(viewable = true, editable = false, order = 3)
    {
        return typeDesc.maxScale;
        PREDEFINED_TYPES.put("BLOB", new TypeDesc(DBPDataKind.CONTENT, Types.BLOB, 0, 0, 0, 2147483647));
        if (db2Schema.getName().equals(DB2Constants.SYSTEM_DATATYPE_SCHEMA)) {
    }
    @NotNull

        this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
    {
    @Property(viewable = false, editable = false)
        PREDEFINED_TYPES.put("DBCLOB", new TypeDesc(DBPDataKind.CONTENT, Types.CLOB, 0, 0, 0, 1073741823));

        if (owner instanceof DB2Schema) {
    @Override


    }
        }
            if (parent instanceof DB2DataSource) {
import java.sql.Types;
    public Timestamp getAlterTime()
import org.jkiss.dbeaver.model.meta.PropertyLength;

    private Integer db2TypeId;

        PREDEFINED_TYPES.put("CURSOR", new TypeDesc(DBPDataKind.UNKNOWN, DB2Constants.EXT_TYPE_CURSOR, 0, 0, 0, 0));
 * Licensed under the Apache License, Version 2.0 (the "License");
        // if the getParentObject() return the "real" parent ie DB2Schema or DB2DataSource,
    public String getSourceSchemaName()
                    log.debug(name + " is a User Defined Type base on a System Data Type.");
    }
            }

    // Helper Objects
    @Property(viewable = false, editable = false, order = 10)
        PREDEFINED_TYPES.put("BINARY", new TypeDesc(DBPDataKind.BINARY, Types.BINARY, 0, 0, 0, 254));
    @Override
        return remarks;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return typeDesc == null ? DBPDataKind.UNKNOWN : typeDesc.dataKind;

    @Override
        if (db2DataSource.isAtLeastV9_5()) {

        this.db2TypeId = JDBCUtils.safeGetInteger(dbResult, "TYPEID");
    @Override

    {
                break;
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_DATETIME)
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
    }
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_SOURCE, order = 22)
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_OWNER)

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            tempTypeDesc = PREDEFINED_TYPES.get(name);
        // when someone, as a first action, opens the table/column tab and then clicks on the datatype link,

        return typeDesc.sqlType;

    public String getSourceName()
    public long getTypeModifiers() {
        // If the dataType is a SYSIBM dataType, get it
            fullyQualifiedName = db2Schema.getName() + "." + name;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private Integer scale;
 * Unless required by applicable law or agreed to in writing, software

        return alterTime;
    {
    public String getName()
        return DBUtils.getDefaultOperators(this);
        private final int charLength;
    }
    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) throws DBException
                parentNode = ((DB2DataSource) parent).getContainer();


    }
    {
    {
        // - DB2Module
    private String sourceName;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private String constraintText;
    {

    public String getSourceModuleName()
    private static final Log log = Log.getLog(DB2DataType.class);
    @Property(viewable = true, editable = false, order = 4)

    }
    {
                        db2Schema.getName(), typeModuleName);

public class DB2DataType extends DB2Object<DBSObject> implements DBSDataType, DBPQualifiedObject {
            case L:
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
        // With this code (copied from OracleDataType), it works.
                String schemaName = JDBCUtils.safeGetStringTrimmed(dbResult, "TYPESCHEMA");
        return 0;
import java.sql.ResultSet;
    @Property(viewable = false, editable = false, length = PropertyLength.MULTILINE)
    @Override
    }
