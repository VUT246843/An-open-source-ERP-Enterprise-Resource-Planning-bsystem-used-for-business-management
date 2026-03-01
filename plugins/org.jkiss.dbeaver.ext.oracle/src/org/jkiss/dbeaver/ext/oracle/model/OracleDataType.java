    public boolean isPredefined()

import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
        }

        }
        final int minScale;
            }
        return typeOID;
            return null;
                dbStat.setString(1, schema.getName());

    // Use by tree navigator thru reflection
    public String getFullTypeName() {
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    public Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException
 * See the License for the specific language governing permissions and

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return null;
        return typeDesc == null ? 0 : typeDesc.minScale;
        this.flagInstantiable = JDBCUtils.safeGetBoolean(dbResult, "INSTANTIABLE", OracleConstants.YES);
        this.flagPredefined = JDBCUtils.safeGetBoolean(dbResult, "PREDEFINED", OracleConstants.YES);
        return typeDesc == null ? 0 : typeDesc.maxScale;
    }
        throws DBException
        return typeCode;

            int valueType,
    @Override
            int minScale,
        TypeDesc desc = PREDEFINED_TYPES.get(typeName);
    @Override
    private boolean supportsAttributes() {
    @Override
    {
        final DBPDataKind dataKind;
        PREDEFINED_TYPES.put("CANONICAL", new TypeDesc(DBPDataKind.UNKNOWN, Types.OTHER, 0, 0, 0));
            this.valueType = valueType;
                    if (superType == null) {
package org.jkiss.dbeaver.ext.oracle.model;
    @Override
 * Oracle data type
    }
        if (type == null) {

                break;
            } catch (DBException e) {
        @NotNull
    private String sourceDefinition;
        } else {
        PREDEFINED_TYPES.put("RAW", new TypeDesc(DBPDataKind.BINARY, Types.VARBINARY, 0, 0, 0));
 *
    private Object superType;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            }
        } else {
    @Override
    @NotNull
                if (superSchema == null) {
    {
    {
        this.flagFinal = JDBCUtils.safeGetBoolean(dbResult, "FINAL", OracleConstants.YES);
    {
    }
        return !supportsAttributes() || attributeCache == null ? null : attributeCache.getAllObjects(monitor, this);
        } else {
        PREDEFINED_TYPES.put("TABLE", new TypeDesc(DBPDataKind.OBJECT, Types.OTHER, 0, 0, 0));
            } else if (TYPE_CODE_OBJECT.equals(this.typeCode)) {
import org.jkiss.dbeaver.model.*;
                }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBCException
            log.warn("Error reading collection types", e);
        protected OracleDataTypeAttribute fetchObject(@NotNull JDBCSession session, @NotNull OracleDataType owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
            sourceDeclaration = OracleUtils.getSource(monitor, this, false, true);
            if (modEnd == -1) {
    public Integer getPrecision()
    }
                    this.valueType = java.sql.Types.SQLXML;
 *     http://www.apache.org/licenses/LICENSE-2.0
        PREDEFINED_TYPES.put("NCHAR", new TypeDesc(DBPDataKind.STRING, Types.NCHAR, 0, 0, 0));
        ) {
            log.debug("Data type '" + typeName + "' not found - declare new one");
                typeSchema.dataTypeCache.cacheObject(type);

import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        return name;
                log.error(e);
        return null;
        final int serverAtLeastMinor;
    @Override
    private static final Log log = Log.getLog(OracleDataType.class);
        return DBSEntityType.TYPE;
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor) throws DBCException {

        return OracleSourceType.TYPE;
            try {
        } else if (superType instanceof OracleDataType) {
        if (sourceDefinition == null && monitor != null) {
            }
    public int getMaxScale()
    @Nullable

                dbStat.setString(2, getName());
        final int valueType;
    public DBSObject getParentObject()
        OracleSchema schema = getSchema();
    private boolean flagPredefined;
        PREDEFINED_TYPES.put("NAMED OBJECT", new TypeDesc(DBPDataKind.OBJECT, Types.STRUCT, 0, 0, 0));
        @Override
                OracleLazyReference olr = (OracleLazyReference) superType;
            return true;
    }
    @Property(viewable = true, order = 7)
        PREDEFINED_TYPES.put("TIMESTAMP WITH TZ", new TypeDesc(DBPDataKind.DATETIME, OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE, 0, 0, 0));
        return type;
        if (this.typeDesc == null) {
        if (sourceDeclaration == null && monitor != null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    {
        return CommonUtils.toInt(getPrecision());
        this.methodCache = new MethodCache();
            hasMethods = JDBCUtils.safeGetInt(dbResult, "METHODS") > 0;
    }
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        PREDEFINED_TYPES.put("BLOB", new TypeDesc(DBPDataKind.CONTENT, Types.BLOB, 0, 0, 0));
    @Property(viewable = true, editable = true, order = 3)
        return DBUtils.getFullTypeName(this);
                } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    private int valueType = java.sql.Types.OTHER;
        } catch (Exception e) {

            this.dataKind = dataKind;
            flagPredefined = true;
        attributeCache = hasAttributes ? new AttributeCache() : null;
        if (superType  == null) {
    }
                    } else {
        if (!CommonUtils.isEmpty(superTypeOwner)) {
    public static DBPDataKind getDataKind(String typeName)
    @Override
        PREDEFINED_TYPES.put("REAL", new TypeDesc(DBPDataKind.NUMERIC, Types.REAL, 38, 127, -84));
    public boolean hasAttributes()
        }
        return flagFinal;
        PREDEFINED_TYPES.put("POINTER", new TypeDesc(DBPDataKind.UNKNOWN, Types.OTHER, 0, 0, 0));
        final int serverAtLeastMajor;
import org.jkiss.dbeaver.DBException;

        PREDEFINED_TYPES.put("NUMBER", new TypeDesc(DBPDataKind.NUMERIC, Types.NUMERIC, 38, 127, -84));
    {
            type = dataSource.getLocalDataType(typeName);
    private final AttributeCache attributeCache;
        this.typeDesc = PREDEFINED_TYPES.get(typeName);

    private final MethodCache methodCache;
        PREDEFINED_TYPES.put("ROWID", new TypeDesc(DBPDataKind.ROWID, Types.ROWID, 0, 0, 0));
            int serverAtLeastMinor
        for (;;) {
            this.precision = precision;
        }
                final OracleSchema superSchema = getDataSource().getSchema(monitor, olr.schemaName);

            log.warn("Unknown predefined type: " + typeName);

        //PREDEFINED_TYPES.put("SIGNED BINARY INTEGER", new TypeDesc(DBPDataKind.NUMERIC, Types.INTEGER, 38, 127, -84)); can not be created as a data type
    {
    @Property(viewable = true, order = 5)

    }
    public String toString()
        return DBUtils.getDefaultOperators(this);
    }
        } else {
        return methodCache != null ? methodCache.getAllObjects(monitor, this) : null;
            if (typeSchema == null) {
            parent instanceof OracleDataSource ? ((OracleDataSource) parent).getContainer() : null;
        }
    @Override
        PREDEFINED_TYPES.put("INTERVAL YEAR TO MONTH", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0));

                this.valueType = java.sql.Types.STRUCT;
        PREDEFINED_TYPES.put("TIME WITH TZ", new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP, 0, 0, 0));
        private TypeDesc(
        return 0;
        this.sourceDefinition = source;
import org.jkiss.code.NotNull;
    {
            hasAttributes = JDBCUtils.safeGetInt(dbResult, "LOCAL_ATTRIBUTES") > 0;
                    if (dbResults.next()) {
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
    {
    @Override
    @Override
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                "WHERE OWNER=? AND TYPE_NAME=? ORDER BY ATTR_NO");
            return new OracleDataTypeAttribute(session.getProgressMonitor(), OracleDataType.this, resultSet);
    @Nullable
import java.sql.SQLException;
        PREDEFINED_TYPES.put("BINARY_FLOAT", new TypeDesc(DBPDataKind.NUMERIC, Types.FLOAT, 38, 127, -84));
    }
            parent :
        return attributeCache != null ? attributeCache.getObject(monitor, this, attributeName) : null;
    {
        protected OracleDataTypeMethod fetchObject(@NotNull JDBCSession session, @NotNull OracleDataType owner, @NotNull JDBCResultSet resultSet) throws SQLException, DBException
import java.util.Collection;
    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return null;
        return parent instanceof OracleSchema ? (OracleSchema)parent : null;
    public List<OracleDataTypeAttribute> getAttributes(@NotNull DBRProgressMonitor monitor)
import org.jkiss.dbeaver.Log;
    public int getTypeID()
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException
 * DBeaver - Universal Database Manager
    public String getExtendedDefinitionText(@NotNull DBRProgressMonitor monitor) throws DBException

    @NotNull
 * limitations under the License.
    private String sourceDeclaration;
    @Property(viewable = true, editable = true, order = 2)
    private boolean flagInstantiable;
            findTypeDesc(typeName);
            name;
    @Override

import org.jkiss.dbeaver.model.struct.*;
        PREDEFINED_TYPES.put("LONG RAW", new TypeDesc(DBPDataKind.BINARY, Types.LONGVARBINARY, 0, 0, 0));
        } else {
    {
    @Override
                (modEnd == typeName.length() - 1 ? "" : typeName.substring(modEnd + 1));
    {
                }
                "ORDER BY m.METHOD_NO");
    public byte[] getTypeOID()
        {
                log.error(e);
        if (!isPredefined()) {
    }
        }
        PREDEFINED_TYPES.put("INTEGER", new TypeDesc(DBPDataKind.NUMERIC, Types.INTEGER, 38, 127, -84));
    @Nullable
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataType owner) throws SQLException
    {
        }
    @Override
    {
    private boolean flagFinal;
            this.serverAtLeastMinor = serverAtLeastMinor;
        if (flagPredefined) {
    }

    @Nullable
    }
    {
    {
                "SELECT ELEM_TYPE_OWNER,ELEM_TYPE_NAME,ELEM_TYPE_MOD FROM " +
    {
        }

        //PREDEFINED_TYPES.put("UNSIGNED BINARY INTEGER", new TypeDesc(DBPDataKind.NUMERIC, Types.BIGINT, 38, 127, -84)); can not be created as a data type
    @NotNull
                try (JDBCResultSet dbResults = dbStat.executeQuery()) {
            if (TYPE_CODE_COLLECTION.equals(this.typeCode)) {

    @Property(viewable = true, order = 6)
/**
        PREDEFINED_TYPES.put("DATE", new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP, 0, 0, 0));
    public boolean isFinal()
        PREDEFINED_TYPES.put("CONTENT POINTER", new TypeDesc(DBPDataKind.CONTENT, Types.BLOB, 0, 0, 0));
            return dbStat;
                            "Compile type",
    private boolean flagIncomplete;
            hasAttributes = JDBCUtils.safeGetInt(dbResult, "ATTRIBUTES") > 0;
        PREDEFINED_TYPES.put("NCLOB", new TypeDesc(DBPDataKind.CONTENT, Types.NCLOB, 0, 0, 0));
                    type = typeSchema.getDataType(monitor, typeName);
        return getFullyQualifiedName(DBPEvaluationContext.DDL);
    {
    private String typeCode;

        this.sourceDeclaration = sourceDeclaration;
        if (typeName.startsWith("PL/SQL")) {
    {
        PREDEFINED_TYPES.put("OID", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0));

    {
        OracleDataType type = null;
            dbStat.setString(2, getName());
 * you may not use this file except in compliance with the License.
    }
                    superType = superSchema.dataTypeCache.getObject(monitor, superSchema, olr.objectName);
    @Override
        return valueType;
        PREDEFINED_TYPES.put("VARCHAR", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0));
    }
/*
                } else {
    public static OracleDataType resolveDataType(DBRProgressMonitor monitor, OracleDataSource dataSource, String typeOwner, String typeName)
    }
    @Override

            this.minScale = minScale;
    {
    }

                        String compTypeName = JDBCUtils.safeGetString(dbResults, "ELEM_TYPE_NAME");
    {
                        //String compTypeMod = JDBCUtils.safeGetString(dbResults, "ELEM_TYPE_MOD");
    @NotNull

        typeName = normalizeTypeName(typeName);

        PREDEFINED_TYPES.put("UROWID", new TypeDesc(DBPDataKind.ROWID, Types.ROWID, 0, 0, 0));
    @Override
 *
            return new DBEPersistAction[]{
    public DBSEntityType getEntityType()

        if (owner instanceof OracleDataSource) {
        return desc != null ? desc.dataKind : null;
    public DBSObjectState getObjectState()
                if (this.name.equals(OracleConstants.TYPE_NAME_XML) && owner.getName().equals(OracleConstants.SCHEMA_SYS)) {
        PREDEFINED_TYPES.put("FLOAT", new TypeDesc(DBPDataKind.NUMERIC, Types.FLOAT, 38, 127, -84));
            int serverAtLeastMajor,
    {
            return null;
        return flagPredefined;
    // Use by tree navigator thru reflection
            int modEnd = typeName.indexOf(')', modIndex);
        PREDEFINED_TYPES.put("BINARY_DOUBLE", new TypeDesc(DBPDataKind.NUMERIC, Types.DOUBLE, 38, 127, -84));
    {
    public OracleDataType getSuperType(DBRProgressMonitor monitor)
    private static String normalizeTypeName(String typeName) {
            }
        return sourceDeclaration;
 */
                    log.error("Type attr schema '" + typeOwner + "' not found");
    {
import java.sql.Types;
        PREDEFINED_TYPES.put("REF", new TypeDesc(DBPDataKind.REFERENCE, Types.OTHER, 0, 0, 0));
                    }
        PREDEFINED_TYPES.put("OCTET", new TypeDesc(DBPDataKind.BINARY, Types.OTHER, 0, 0, 0));
        return parent instanceof OracleSchema ?
import java.util.HashMap;
}
    public void setExtendedDefinitionText(String source)
    {
 * Unless required by applicable law or agreed to in writing, software

    private TypeDesc typeDesc;
    @Override

    public int getMinScale()
    public Object geTypeExtension() {
        methodCache = hasMethods ? new MethodCache() : null;
        OracleSchema typeSchema = null;

    }
    @Override

            int modIndex = typeName.indexOf('(');
    @Association
        return sourceDefinition;
        PREDEFINED_TYPES.put("LONG", new TypeDesc(DBPDataKind.BINARY, Types.LONGVARBINARY, 0, 0, 0));
            type.flagPredefined = true;

        PREDEFINED_TYPES.put("CLOB", new TypeDesc(DBPDataKind.CONTENT, Types.CLOB, 0, 0, 0));
    public String getTypeCode()
            return componentType;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException


    }
    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    public DBPDataKind getDataKind()
        // DATE IS TIMESTAMP. It always keeps time value. But sometimes it is visualized as DATE (see #2457)
    public String getTypeName()
            }
        if (schema == null || !TYPE_CODE_COLLECTION.equals(typeCode) || !getDataSource().isAtLeastV10()) {
                "FROM "+ OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_TYPE_METHODS m\n" +
    public long getMaxLength()
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (modIndex == -1) {
                            "ALTER TYPE " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
    @NotNull
                    new OracleObjectPersistAction(
    @Nullable

        this.typeCode = JDBCUtils.safeGetString(dbResult, "TYPECODE");
                        componentType = OracleDataType.resolveDataType(monitor, getDataSource(), compTypeSchema, compTypeName);
        PREDEFINED_TYPES.put("VARYING ARRAY", new TypeDesc(DBPDataKind.ARRAY, Types.ARRAY, 0, 0, 0));
    private OracleDataType componentType;
        this.attributeCache = new AttributeCache();
        return getTypeID() == Types.STRUCT;
                    OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_COLL_TYPES WHERE OWNER=? AND TYPE_NAME=?"))
    }
            dbStat.setString(2, getName());
    private byte[] typeOID;
            this.superType = new OracleLazyReference(
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OracleDataType owner) throws SQLException
                break;
    }
        super(owner, typeName, persisted);
        final int precision;
    @Override
        {
        PREDEFINED_TYPES.put("JSON", new TypeDesc(DBPDataKind.CONTENT, Types.OTHER, 0, 0, 0));
        PREDEFINED_TYPES.put("SMALLINT", new TypeDesc(DBPDataKind.NUMERIC, Types.SMALLINT, 38, 127, -84));
            throw new DBCException("Can't compile " + getName() + ". Compilation works only for user-defined types.");
        }
import org.jkiss.dbeaver.model.meta.Association;

    }
 *
    private class AttributeCache extends JDBCObjectCache<OracleDataType, OracleDataTypeAttribute> {
    {
import org.jkiss.dbeaver.model.exec.DBCException;
        super(owner, JDBCUtils.safeGetString(dbResult, "TYPE_NAME"), true);
                "SELECT m.*,r.RESULT_TYPE_OWNER,RESULT_TYPE_NAME,RESULT_TYPE_MOD\n" +
    }
    static class TypeDesc {
                }
        return flagInstantiable;


        PREDEFINED_TYPES.put("TIME", new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP, 0, 0, 0));
    {
    {
    public boolean isIncomplete()
                superTypeOwner,
                JDBCUtils.safeGetString(dbResult, "SUPERTYPE_NAME"));
                this.valueType = java.sql.Types.ARRAY;
    }
    }
            int precision,
        PREDEFINED_TYPES.put("TIMESTAMP WITH LOCAL TZ", new TypeDesc(DBPDataKind.DATETIME, OracleConstants.DATA_TYPE_TIMESTAMP_WITH_LOCAL_TIMEZONE, 0, 0, 0));
        @NotNull
        @Override

    }
            dbStat.setString(1, OracleDataType.this.parent.getName());
    {
        PREDEFINED_TYPES.put("BOOLEAN", new TypeDesc(DBPDataKind.BOOLEAN, Types.BOOLEAN, 0, 0, 0, 23, 0));

        PREDEFINED_TYPES.put("NVARCHAR2", new TypeDesc(DBPDataKind.STRING, Types.NVARCHAR, 0, 0, 0));
    @Override
                "SELECT * FROM "+ OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_TYPE_ATTRS " +
        this.typeOID = JDBCUtils.safeGetBytes(dbResult, "TYPE_OID");
            this.valueType = this.typeDesc.valueType;
            return "";
        String superTypeOwner = JDBCUtils.safeGetString(dbResult, "SUPERTYPE_OWNER");
    private boolean findTypeDesc(String typeName)
            return null;
        {
            }
    }
            // Determine value type for predefined types
            findTypeDesc(name);
                    log.warn("Referenced schema '" + olr.schemaName + "' not found for super type '" + olr.objectName + "'");
        } else {
    {
 * You may obtain a copy of the License at
    }
    }
        }
            @NotNull DBPDataKind dataKind,
        return attributeCache != null;

            try {
    }
    {
    
    public OracleSourceType getSourceType()
        }
    @Override
        
    public void setObjectDefinitionText(String sourceDeclaration)

    {
    public String getName()
    {
    }
    @Override
    }
        }
            } else {
            return true;
        }
            return dbStat;
                    } else {
        PREDEFINED_TYPES.put("DOUBLE PRECISION", new TypeDesc(DBPDataKind.NUMERIC, Types.DOUBLE, 38, 127, -84));
    }
import java.util.Map;
    }
    }
    static  {
    @Override
        return componentType;
    }
    public boolean isInstantiable()
        PREDEFINED_TYPES.put("BINARY ROWID", new TypeDesc(DBPDataKind.ROWID, Types.ROWID, 0, 0, 0));
    public OracleDataTypeAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException
        if (owner instanceof OracleDataSource && flagPredefined) {
            } else {
        }
    }
    }
    {
    }
        return DBSObjectState.NORMAL;
        return flagIncomplete;
            return "-- Source code not available";
            return new OracleDataTypeMethod(session.getProgressMonitor(), OracleDataType.this, resultSet);
    }
    }
        {
            int maxScale,
            // Don't care about PL/SQL types
    @Override
    @Override
                        return (OracleDataType)superType;



    {
        final int maxScale;
        PREDEFINED_TYPES.put("LOB POINTER", new TypeDesc(DBPDataKind.CONTENT, Types.BLOB, 0, 0, 0));
                    )};
        PREDEFINED_TYPES.put("CHAR", new TypeDesc(DBPDataKind.STRING, Types.CHAR, 0, 0, 0));
    }
        PREDEFINED_TYPES.put("REF CURSOR", new TypeDesc(DBPDataKind.OBJECT, -10, 0, 0, 0));
        }
                dataSource.dataTypeCache.cacheObject(type);
    public OracleDataType getComponentType(@NotNull DBRProgressMonitor monitor)
        return methodCache != null;
            sourceDefinition = OracleUtils.getSource(monitor, this, true, false);
    public long getTypeModifiers() {
    {
    @Association
                        log.warn("Referenced type '" + olr.objectName + "' not found in schema '" + olr.schemaName + "'");
            return DBIcon.TYPE_JSON;
            this.maxScale = maxScale;
    }
    }


        PREDEFINED_TYPES.put("INTERVAL DAY TO SECOND", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0));
        return typeDesc == null ? 0 : typeDesc.precision;
            return (OracleDataType)superType;
    public DBPImage getObjectImage() {

            type = new OracleDataType(typeSchema == null ? dataSource : typeSchema, typeName, true);
            dbStat.setString(1, OracleDataType.this.parent.getName());
    }
    }
    public OracleDataType(DBSObject owner, String typeName, boolean persisted)
                            OracleObjectType.VIEW,
                        log.warn("Can't resolve collection type [" + getName() + "]");
    static final Map<String, TypeDesc> PREDEFINED_TYPES = new HashMap<>();
        PREDEFINED_TYPES.put("DECIMAL", new TypeDesc(DBPDataKind.NUMERIC, Types.DECIMAL, 38, 127, -84));
    {
    @NotNull
import java.sql.ResultSet;
        boolean hasMethods;
            final JDBCPreparedStatement dbStat = session.prepareStatement(


    implements DBSDataType, DBSEntity, DBPQualifiedObject, OracleSourceObject, DBPScriptObjectExt, DBPImageProvider {
        if (componentType != null) {
        throws DBException
                if (typeSchema == null) {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    {
        PREDEFINED_TYPES.put("BFILE", new TypeDesc(DBPDataKind.CONTENT, Types.OTHER, 0, 0, 0));

        return typeName;
        return getFullyQualifiedName(DBPEvaluationContext.UI);
    {
        PREDEFINED_TYPES.put("TIMESTAMP", new TypeDesc(DBPDataKind.DATETIME, Types.TIMESTAMP, 0, 0, 0));
        PREDEFINED_TYPES.put("TIMESTAMP WITH LOCAL TIME ZONE", new TypeDesc(DBPDataKind.DATETIME, OracleConstants.DATA_TYPE_TIMESTAMP_WITH_LOCAL_TIMEZONE, 0, 0, 0));
    public OracleSchema getSchema()
    public Collection<OracleDataTypeMethod> getMethods(DBRProgressMonitor monitor)
import org.jkiss.code.Nullable;
        }
        return typeOID;
        }
        }
    @Nullable
    @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(hidden = true, editable = true, updatable = true, order = -1)
            this.serverAtLeastMajor = serverAtLeastMajor;
            this(dataKind, valueType, precision, minScale, maxScale, -1, -1);
        return JDBCUtils.resolveDataKind(getDataSource(), getName(), valueType);


    }
    }
        return null;
    @NotNull
            hasMethods = JDBCUtils.safeGetInt(dbResult, "LOCAL_METHODS") > 0;
    @Override
                "LEFT OUTER JOIN "+ OracleUtils.getSysSchemaPrefix(getDataSource()) + "ALL_METHOD_RESULTS r ON r.OWNER=m.OWNER AND r.TYPE_NAME=m.TYPE_NAME AND r.METHOD_NAME=m.METHOD_NAME AND r.METHOD_NO=m.METHOD_NO\n" +
    }
            superType = null;
        typeName = normalizeTypeName(typeName);
    @Override


        }
        PREDEFINED_TYPES.put("VARRAY", new TypeDesc(DBPDataKind.ARRAY, Types.ARRAY, 0, 0, 0));
    @Override
        boolean hasAttributes;

        if (CommonUtils.isEmpty(typeName)) {
        PREDEFINED_TYPES.put("TIMESTAMP WITH TIME ZONE", new TypeDesc(DBPDataKind.DATETIME, OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE, 0, 0, 0));
    private class MethodCache extends JDBCObjectCache<OracleDataType, OracleDataTypeMethod> {
        PREDEFINED_TYPES.put("CFILE", new TypeDesc(DBPDataKind.CONTENT, Types.OTHER, 0, 0, 0));
            typeName = typeName.substring(0, modIndex) +
                typeSchema = dataSource.getSchema(monitor, typeOwner);
                "WHERE m.OWNER=? AND m.TYPE_NAME=?\n" +
    public OracleDataType(DBSObject owner, ResultSet dbResult)

        @Override
        }
    @Property(viewable = true, order = 4)
    @Property(viewable = true, order = 8)
    public boolean hasMethods()
        }
        return parent instanceof OracleSchema ?
            DBUtils.getFullQualifiedName(getDataSource(), parent, this) :
    public Integer getScale()
        PREDEFINED_TYPES.put("VARCHAR2", new TypeDesc(DBPDataKind.STRING, Types.VARCHAR, 0, 0, 0));
        throws DBException
import org.jkiss.utils.CommonUtils;
        private TypeDesc(@NotNull DBPDataKind dataKind, int valueType, int precision, int minScale, int maxScale) {

    public static final String TYPE_CODE_COLLECTION = "COLLECTION";
    @NotNull
                        String compTypeSchema = JDBCUtils.safeGetString(dbResults, "ELEM_TYPE_OWNER");

            return false;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
            } catch (DBException e) {
    }
        this.flagIncomplete = JDBCUtils.safeGetBoolean(dbResult, "INCOMPLETE", OracleConstants.YES);
        return typeDesc == null ? 0 : typeDesc.minScale;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load collection types")) {
        if (OracleConstants.TYPE_NAME_JSON.equals(getName())) {
        PREDEFINED_TYPES.put("NAMED COLLECTION", new TypeDesc(DBPDataKind.ARRAY, Types.ARRAY, 0, 0, 0));
    }
        @Override
    @Override
        if (typeOwner != null) {

            final JDBCPreparedStatement dbStat = session.prepareStatement(
    public static final String TYPE_CODE_OBJECT = "OBJECT";
public class OracleDataType extends OracleObject<DBSObject>
            {
            }
        PREDEFINED_TYPES.put("CONTIGUOUS ARRAY", new TypeDesc(DBPDataKind.ARRAY, Types.ARRAY, 0, 0, 0));

    {

    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

                    }
import org.jkiss.dbeaver.model.meta.Property;

    @Property(hidden = true, viewable = false, editable = false)
    @NotNull

import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
                }
