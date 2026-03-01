            attributeCache.clearCache();
            sql.append("-- DROP TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(";\n\n"); //$NON-NLS-1$ //$NON-NLS-2$
        String typStorageStr = JDBCUtils.safeGetString(dbResult, "typstorage"); //$NON-NLS-1$
    @Property(category = CAT_FUNCTIONS)
        final String catString =
        this.attributeCache = hasAttributes() ? new AttributeCache() : null;
        "regrole",
        this.collationId = realType.collationId;
                log.debug("Invalid type category [" + typCategoryStr + "] - " + e.getMessage());
        String description = getDescription();
            case d: {
                    log.debug(e.getMessage());
        return getDataSource().getLocalDataType(baseTypeName);
        if (!CommonUtils.isEmpty(description)) {
    private long typeId;
    public String getModOutFunc() {
    public DBSDataType getComponentType(@NotNull DBRProgressMonitor monitor) throws DBException {
                                case PostgreOid.TIMESTAMP:
    public boolean isAlias() {

                .filter(e -> e.getEnumTypId() == getObjectId())
            typeCategory = null;
                                    valueType = Types.INTEGER;
                if (isByValue) appendCreateTypeParameter(sql, "PASSEDBYVALUE");
        if (collationId != 0 && getDataSource().getServerType().supportsCollations()) {
        throw new DBCFeatureNotSupportedException();
                                    valueType = Types.SMALLINT;
                        valueType = Types.BIGINT;
    @Override
        int valueType;
        this.typeId = typeId;
            JDBCPreparedStatement dbStat = session.prepareStatement(

        return attributeCache == null ? null : attributeCache.getAllObjects(monitor, this);
                this.typeType = PostgreTypeType.valueOf(typTypeStr.toLowerCase(Locale.ENGLISH));
                        String outputF = JDBCUtils.safeGetString(dbResult, "typoutput");
                                case 8:
        "regnamespace",
        if (typeCategory == PostgreTypeCategory.E) {
        DBSEntity container = entityAttribute == null ? this : entityAttribute.getParentObject();
        return isPreferred;
        public boolean isValidValue(@NotNull PostgreDataType object, @Nullable Object value) throws IllegalArgumentException {
            }
    public Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
                                    break;
    public void setObjectDefinitionText(String sourceText) throws DBException {
        this.align = realType.align;
                .toArray();
    private String receiveFunc;

                    DBCLogicalOperator.IS_NOT_NULL
        this.receiveFunc = realType.receiveFunc;
                if (isValidFuncRef(sendFunc)) appendCreateTypeParameter(sql, "SEND", sendFunc);
    private Object[] enumValues;
    }
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
        if (!castColumnName && (ArrayUtils.contains(PostgreDataType.getOidTypes(), typeName) || getTypeID() == Types.OTHER)) {
        }

            case e: {
    public PostgreDataType(@NotNull JDBCSession session, @NotNull PostgreSchema schema, long typeId, int valueType, String name, int length, JDBCResultSet dbResult) throws DBException {
                    case P:
                                break;
        if (typeType == PostgreTypeType.e) {
        }

        this.typeType = realType.typeType;
                                default:
            return getName();
        if (schema.isCatalogSchema()) {
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "typowner"); //$NON-NLS-1$
        if (constraintsText != null) {
        this.typeCategory = realType.typeCategory;
    public int getArrayDim() {
        return !CommonUtils.isEmpty(func) && !func.equals("-"); //$NON-NLS-1$
    @Override
    }
        return null;
                if (!CommonUtils.isEmpty(attributes)) {
    private boolean isPreferred;
        @NotNull DBRProgressMonitor monitor,
                    this.dataKind = DBPDataKind.CONTENT;
    public long getObjectId() {
            readEnumValues(session.getProgressMonitor());
                                    valueType = Types.TIMESTAMP;

                    setTypeID(baseType.getTypeID());
            if (attribute instanceof DBSAttributeBase && !((DBSAttributeBase) attribute).isRequired()) {
            this.outputFunc = JDBCUtils.safeGetString(dbResult, "typoutput"); //$NON-NLS-1$
                PostgreCollation collation = getCollationId(monitor);
            sql.append("-- DROP DOMAIN ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(";\n\n"); //$NON-NLS-1$ //$NON-NLS-2$
    }
        String name = JDBCUtils.safeGetString(dbResult, "typname"); //$NON-NLS-1$
        }

                "\nLEFT OUTER JOIN pg_catalog.pg_attrdef ad ON (a.attrelid=ad.adrelid AND a.attnum = ad.adnum)" +
    public static PostgreDataType readDataType(@NotNull JDBCSession session, @NotNull PostgreDatabase database, @NotNull JDBCResultSet dbResult, boolean skipTables) throws SQLException, DBException

            if (typeCategory == PostgreTypeCategory.S || typeCategory == PostgreTypeCategory.E || typeCategory == PostgreTypeCategory.X) {
                    case D:
                    appendCreateTypeParameter(sql, "CANONICAL", canonicalName);
        int typeLength = JDBCUtils.safeGetInt(dbResult, "typlen"); //$NON-NLS-1$
                if (isValidFuncRef(analyzeFunc)) appendCreateTypeParameter(sql, "ANALYZE", analyzeFunc);
                        break;
    public String getInputFunc() {
                    this.typeCategory = PostgreTypeCategory.valueOf(typCategoryStr.toUpperCase(Locale.ENGLISH));
        long schemaId = JDBCUtils.safeGetLong(dbResult, "typnamespace");
                            case "bytea":
                        } else if (outputF != null && outputF.startsWith("float")) {
}
    private boolean isNotNull;
    private PostgreTypeType typeType;
                sql.append(");\n"); //$NON-NLS-1$
    class AttributeCache extends JDBCObjectCache<PostgreDataType, PostgreDataTypeAttribute> {
        String baseTypeName = PostgreConstants.SERIAL_TYPES.get(getFullTypeName());
                        valueType = Types.VARCHAR;
                log.debug("Can't find type '" + getFullTypeName() + "' base type " + baseTypeId);
            }
                        if (typElem > 0 && typeLength < 0) {
                if (collation != null) {
            sql.append("\nCOMMENT ON TYPE ") //$NON-NLS-1$
    public String getCanonicalName() {
                PostgreDataType elementType = getElementType(monitor);
            }
            }
            }
    public String getDefaultValue() {
        ownerId = 0;
                                case 2:
                    default:
                return new DBCLogicalOperator[]{
            this.receiveFunc = JDBCUtils.safeGetString(dbResult, "typreceive"); //$NON-NLS-1$
            operators.add(DBCLogicalOperator.EQUALS);
        return defaultValue;
        }
                            switch (typeLength) {
                break;
                break;
    public String getOutputFunc() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }
                        valueType = Types.BIT;
                    case PostgreOid.INT4:
            if (relKind != null) {
    }
                }
    @Property(viewable = false, order = 9)
        PostgreSchema dataTypeSchema = database.getSchema(session.getProgressMonitor(), schemaId);
    }
        }
            } catch (DBException e) {
            sql.append(",");//$NON-NLS-1$
 * See the License for the specific language governing permissions and
    ) throws DBException {
                sql.append(";"); //$NON-NLS-1$

                } catch (Exception e) {
    @ForTest
            } catch (Exception e) {
    private boolean isValidFuncRef(String func) {
                typeCategory = null;
            this.isPreferred = JDBCUtils.safeGetBoolean(dbResult, "typispreferred"); //$NON-NLS-1$
    }
                                    break;


                sql.append(");\n"); //$NON-NLS-1$
                                    break;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            case r: {
    public String getAnalyzeFunc() {

            if (typeCategory == null) {
                        valueType = Types.BOOLEAN;
    }
    private PostgreTypeCategory typeCategory;
                        //                }
                if (collation != null) {
    private String description;
        }
            // Convert value in text for json or xml columns in where condition
    @Property(category = CAT_ARRAY)
                }
        this.extraDataType = extraDataType;
                    .append(getFullyQualifiedName(DBPEvaluationContext.DDL))

    @Property(viewable = true, optional = true, order = 12)
    public String getName() {

        return extraDataType;
import java.sql.SQLException;
        return PostgreConstants.SERIAL_TYPES.containsKey(getFullTypeName());
    @Property(category = CAT_FUNCTIONS)

        }

                        break;
                try {
                        valueType = Types.NUMERIC;
                        break;
        DBSEntityAttribute entityAttribute = memberContext.getTopParent().getEntityAttribute();
    @Override
                        break;
        }
                if (PostgreConstants.TYPE_JSONB.equals(name) || PostgreConstants.TYPE_JSON.equals(name)) {
            return object.getTypeCategory() == PostgreTypeCategory.E;
            } else {
            return null;
    public PostgreDataType(PostgreSchema schema, int valueType, String name) {
    private void appendCreateTypeParameter(@NotNull StringBuilder sql, @NotNull String name, @Nullable Object value) {
import org.jkiss.utils.CommonUtils;
                break;
    String getConditionTypeCasting(boolean isInCondition, boolean castColumnName) {
    public PostgreDataType getBaseType(DBRProgressMonitor monitor) {
        if (getDataSource().getServerType().supportsCustomDataTypes()) {
                        //                } else {
        this.isByValue = JDBCUtils.safeGetBoolean(dbResult, "typbyval"); //$NON-NLS-1$
    }
        "regdictionary",
import org.jkiss.dbeaver.model.meta.ForTest;
                if (storage != null) appendCreateTypeParameter(sql, "STORAGE", storage.getName());
        }
                                    break;
                        break;
    };
                        valueType = Types.FLOAT;

                log.debug("Invalid type align [" + typAlignStr + "] - " + e.getMessage());
            }
import org.jkiss.utils.ArrayUtils;
        "int2vector",
                sql.append("-- Data type ").append(getFullyQualifiedName(DBPEvaluationContext.UI)).append(" (").append(typeType.getName()).append(") DDL is not supported\n");

    }

                    if (!CommonUtils.isEmpty(constraint)) {
                } else if (PostgreConstants.TYPE_INTERVAL.equals(name)) {
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
                                valueType = Types.SMALLINT;
                                valueType = Types.BINARY;
        this.baseTypeName = JDBCUtils.safeGetString(dbResult, "base_type_name"); //$NON-NLS-1$
        }
    private String inputFunc;
        if (isInCondition && typeCategory == PostgreTypeCategory.E) {
                    case PostgreOid.NUMERIC:
 * You may obtain a copy of the License at
                    // Probably new objects not cached yet. Let's read them.
    }
        return null;
        return elementTypeId != 0;
        }
                        sql.append("\t").append(SQLUtils.quoteString(this, CommonUtils.toString(item)));
                        // Kind of a hack (#7459). Don't know any better way to distinguish floats from integers
    /**
            String typCategoryStr = JDBCUtils.safeGetString(dbResult, "typcategory"); //$NON-NLS-1$
                                break;

            valueType = Types.VARCHAR;
    private long elementTypeId;
        }
                Collection<PostgreDataTypeAttribute> attributes = getAttributes(monitor);
        this.typeMod = JDBCUtils.safeGetInt(dbResult, "typtypmod"); //$NON-NLS-1$
    }
            List<DBCLogicalOperator> operators = new ArrayList<DBCLogicalOperator>();
            }
        PostgreTypeCategory typeCategory;
    @Override

            return dbStat;
                        String modifiers = SQLUtils.getColumnTypeModifiers(getDataSource(), attr, attr.getTypeName(), attr.getDataKind());
                                    break;
import org.jkiss.dbeaver.DBException;
        return align;
                        break;
                    DBCLogicalOperator.IS_NULL,
                appendCreateTypeParameter(sql, "DEFAULT", defaultValue);
                sql.append("CREATE TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" AS ENUM (\n"); //$NON-NLS-1$ //$NON-NLS-2$
    @Nullable

                        valueType = Types.SQLXML;
                    case PostgreOid.CHAR:
                            switch (typeLength) {

//                    sql.append("\n\tCOLLATION ").append(canonicalName);
            log.debug("Invalid type type [" + typTypeStr + "] - " + e.getMessage());
    }
                break;

                sql.append("CREATE TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" ("); //$NON-NLS-1$ //$NON-NLS-2$
                    case PostgreOid.TIMESTAMP:
                }
    }
    @NotNull
                PostgreCollation collation = getCollationId(monitor);


    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
    public Object[] getEnumValues(DBRProgressMonitor monitor) {
        return null;
                        //                if (name.equals("text")) {
                this.align = PostgreTypeAlign.valueOf(typAlignStr);
                throw new DBDatabaseException("Error reading enum values", e, getDataSource());
                break;
    @Property(viewable = true, order = 11)
                dbStat.setLong(1, getObjectId());
    public boolean hasAttributes() {
    @NotNull
        description = JDBCUtils.safeGetString(dbResult, "description"); //$NON-NLS-1$
                                case PostgreOid.TIMESTAMPTZ:
    public String getReceiveFunc() {
                        break;
            this.collationId = JDBCUtils.safeGetLong(dbResult, "typcollation"); //$NON-NLS-1$
                            case PostgreConstants.TYPE_XML:
                                break;

            }
import org.jkiss.code.Nullable;
                switch (typeCategory) {
        this.defaultValue = realType.defaultValue;
    @Override
                    appendCreateTypeParameter(sql, "ELEMENT", elementType.getFullyQualifiedName(DBPEvaluationContext.DDL));
 * Copyright (C) 2010-2025 DBeaver Corp and others
            enumValues = cachedObjects.stream()
    @Property(category = CAT_MODIFIERS)
        this.dataKind = realType.dataKind;
            }
                    + "FROM pg_catalog.pg_constraint c\r\n"
                        break;
            }
        return canonicalName;
        if (ArrayUtils.contains(OID_TYPES, name) || ArrayUtils.contains(VECTOR_TYPES, name) || name.equals(PostgreConstants.TYPE_HSTORE)) {
                };
    public String getDescription() {

        this.typeType = PostgreTypeType.b;
    @Property(category = CAT_FUNCTIONS)
        if (dataTypeSchema == null) {
    @Nullable
    // Plain type

                    + "WHERE contypid = " + getObjectId());
                }
                        valueType = Types.VARCHAR;
            }
        return isNotNull;
                readEnumValues(monitor);
                    sql.append(");\n"); //$NON-NLS-1$
import org.jkiss.code.NotNull;
        return super.getDataKind();
    }
        @NotNull DBDAttributeBinding memberContext
                                    valueType = Types.FLOAT;
            } catch (IllegalArgumentException e) {
                    DBCLogicalOperator.LIKE,
    }
    @NotNull
                final long typElem = JDBCUtils.safeGetLong(dbResult, "typelem");

            this.dataKind = DBPDataKind.STRING;

                                    valueType = Types.TIME;
        this.alias = true;
        return isByValue;
        }
                operators.add(DBCLogicalOperator.IS_NULL);
    private String defaultValue;
        return (PostgreDataSource) super.getDataSource();
                    case N:
            return dataKind;
    @Override
    @NotNull
        return modOutFunc;
    @Override
                try (JDBCResultSet rs = dbStat.executeQuery()) {
    public int getTypeMod() {
    }
        this.isNotNull = realType.isNotNull;
            }
        for (PostgreDataTypeAttribute attr : attrs) {
    private long collationId;

                            valueType = Types.DATE;
        return typeMod;
            return getDatabase().getCollation(monitor, collationId);
        if (!CommonUtils.isEmpty(typStorageStr)) {

        sql.append("\n\t").append(name).append(" = ").append(value); //$NON-NLS-1$ //$NON-NLS-2$
                break;
                    // TODO: read data from pg_range
                        break;
        return arrayDim;
                }
    public PostgreTypeCategory getTypeCategory() {
                    case PostgreOid.NAME:
        this.elementTypeId = JDBCUtils.safeGetLong(dbResult, "typelem"); //$NON-NLS-1$

        this.classId = JDBCUtils.safeGetLong(dbResult, "typrelid"); //$NON-NLS-1$
        if (getDataSource().getServerType().supportsCollations()) {
        this.arrayDim = JDBCUtils.safeGetInt(dbResult, "typndims"); //$NON-NLS-1$

    }
                    sql.append("\n\tDEFAULT ").append(defaultValue); //$NON-NLS-1$

        if (attrs == null) {
    public boolean isSerialDataType() {
    public boolean isStructurallyConsistentTypeWith(@NotNull DBCAttributeMetaData metaData) {
        return boundAttrs;
    }
        return arrayItemTypeId == 0 ? null : getDatabase().getDataType(monitor, arrayItemTypeId);
            this.inputFunc = JDBCUtils.safeGetString(dbResult, "typinput"); //$NON-NLS-1$
    }
        return arrayDelimiter;
        if (isInCondition && (PostgreConstants.TYPE_JSON.equals(typeName) || PostgreConstants.TYPE_XML.equals(typeName))) {
        this.baseTypeId = realType.baseTypeId;
        }
                }
            return null;
    public String getSendFunc() {
        this.arrayDelimiter = realType.arrayDelimiter;
    private String sendFunc;
        if (Character.isLetterOrDigit(sql.charAt(sql.length() - 1))) {
                                case PostgreOid.DATE:
        this.elementTypeId = realType.elementTypeId;
            return new PostgreDataTypeAttribute(session.getProgressMonitor(), postgreDataType, resultSet);
                if (elementType != null) {
        return inputFunc;
                }
                        }
    }
            }

    @Override
                log.debug(e);
        if (typeType == PostgreTypeType.d) {
                        if (!first) sql.append(","); //$NON-NLS-1$
                        break;
    @Override
            }
                    case V:
    @Override
                    this.dataKind = DBPDataKind.DATETIME;
                        break;
        this.description = description;
        if (dataKind != null) {
                        valueType = Types.TIME;
    @Property(name = "Constraints", length = PropertyLength.MULTILINE)
    public DBSEntityType getEntityType() {
                }
    private static final String[] OID_TYPES = new String[] {
        boolean readAllTypes = database.getDataSource().supportReadingAllDataTypes();
                        if (name.equals("numeric")) {
    }
                }
    public String getModInFunc() {
    @NotNull

        }
    public DBPImage getObjectImage() {
                        // No a composite data type - skip it
                                    valueType = Types.DOUBLE;
        if (value == null) {
                    case PostgreOid.TIME:
            enumValues = null;
 * PostgreTypeType
                                valueType = Types.BIGINT;
        this.defaultValue = JDBCUtils.safeGetString(dbResult, "typdefault"); //$NON-NLS-1$
                                    break;
import org.jkiss.dbeaver.Log;

    @Override
import org.jkiss.dbeaver.model.meta.PropertyLength;
    private static final Log log = Log.getLog(PostgreDataType.class);
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
        return super.getFullTypeName();
                    case PostgreOid.OID:
    @Override
                    boolean first = true;

        return this;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

/*

 *
        if (typeType == PostgreTypeType.d) {
//                }
                        break;
                        break;
    }
    @Property(viewable = true, order = 16, visibleIf = EnumTypeValidator.class)
    }
                }

    public PostgreDataType getElementType(DBRProgressMonitor monitor) {

    }
                        valueType = Types.VARCHAR;
        super(schema, valueType, name, null, false, false, -1, -1, -1);
                "SELECT c.relname,row_number() OVER (ORDER BY a.attnum) as attnum,a.*,pg_catalog.pg_get_expr(ad.adbin, ad.adrelid, true) as def_value,dsc.description" +
            // This strange case only for tables without keys
        if (typeType != PostgreTypeType.d) {
                        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        if (dataKind == DBPDataKind.STRING) {
                    if (tableType != RelKind.c) {
    @Property(order = 100, length = PropertyLength.MULTILINE, editable = true, viewable = true, updatable = true)
    public PostgreCollation getCollationId(DBRProgressMonitor monitor) throws DBException {
                        break;
                                case 8:



    }
                    case B:
                sql.append(");\n"); //$NON-NLS-1$
                    "WHERE e.enumtypid=?\n" +
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    @Override
                    session, 
                    readNewEnumValues(monitor);
import org.jkiss.dbeaver.model.meta.Property;
        }
            try {
                        valueType = Types.OTHER;
 * limitations under the License.
                        valueType = Types.OTHER;
    }
                    case PostgreOid.BPCHAR:
                }
 * you may not use this file except in compliance with the License.
    private String outputFunc;
                if (ArrayUtils.isEmpty(enumValues)) {
    private String modInFunc;
        try {

                    sql.append(baseTypeName);
                        if (modifiers != null) sql.append(modifiers);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
    public List<String> getConstraintsDefinition(DBRProgressMonitor monitor) throws DBException {
            try {
        return arrayItemTypeId != 0;
                enumValues = new Object[]{0};
                List<String> constraints = getConstraintsDefinition(monitor);
    private long classId;
                    case U:
    @Override

    @Override
    private static final String CAT_MODIFIERS = "Modifiers";
    }
    }
    }
        "regclass",
                log.error("Can't read enum values of type " + getFullTypeName());
                        valueType = Types.DOUBLE;
    @Property(category = CAT_MODIFIERS)
    }

        final PostgreSchema owner = getParentObject();
                    }
        @Override
    private void appendCreateTypeParameter(@NotNull StringBuilder sql, @NotNull String name) {
        this.isNotNull = JDBCUtils.safeGetBoolean(dbResult, "typnotnull"); //$NON-NLS-1$
                        sql.append("\n\t") //$NON-NLS-1$
                .map(PostgreEnumValue::getEnumLabel)
 * DBeaver - Universal Database Manager
                if (isValidFuncRef(outputFunc)) appendCreateTypeParameter(sql, "OUTPUT", outputFunc);
        this.typeMod = realType.typeMod;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                            }
    public boolean isPlainType() {

        }
    public String getFullTypeName() {
                "\nFROM pg_catalog.pg_attribute a" +
            log.debug("Empty name for data type " + typeId);
            try {
            }
                            valueType = Types.NUMERIC;
        return typeCategory;
                        break;
    }
            dbResult);
            getDatabase().getEnumValueCache().clearCache();
            return DBIcon.TYPE_JSON;
    }
                .sorted(Comparator.comparing(PostgreEnumValue::getEnumSortOrder))
                    DBCLogicalOperator.LESS,
                            case "uint1":
                    for (int i = 0; i < enumValues.length; i++) {
                        }
    }

        return new PostgreDataType(
        this.modInFunc = realType.modInFunc;
    }
                        Object item = enumValues[i];
        "regoper",
                        valueType = Types.BOOLEAN;

        return elementTypeId == 0 ? null : getDatabase().getDataType(monitor, elementTypeId);
        } else {
    private String analyzeFunc;
                        valueType = Types.ARRAY;
            boundAttrs.add(new PostgreDataBoundTypeAttribute(monitor, container, memberContext, attr));
        attributeCache = null;
        return DBSEntityType.TYPE;
                "SELECT e.enumlabel \n" +
            return;
    private static final String[] VECTOR_TYPES = {

    }
    @Override
        return null;
    }
    @Override
    @Override
                    while (rs.nextRow()) {
            typeLength,
    public boolean isNotNull() {
        }
        this.isByValue = realType.isByValue;
                        sql.append("\n\tCONSTRAINT ").append(constraint); //$NON-NLS-1$
        this.analyzeFunc = JDBCUtils.safeGetString(dbResult, "typanalyze"); //$NON-NLS-1$
                return new DBCLogicalOperator[] {

        }
                if (align != null && align.getBytes() > 1) appendCreateTypeParameter(sql, "ALIGNMENT", align.getBytes());
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            }
        }
        this.arrayDim = realType.arrayDim;
        }
        this.alias = false;
        setName(aliasName);
    @Override
                if (!CommonUtils.isEmpty(defaultValue)) {
    };
        if (getDataSource().isSupportsEnumTable()) {
                            case "uint4":
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        }
                if (getMaxLength() > 0) appendCreateTypeParameter(sql, "INTERNALLENGTH", getMaxLength());
    private boolean isByValue;
/**
                                    valueType = Types.DATE;
                        break;
    @Property(category = CAT_ARRAY)
//                if (!CommonUtils.isEmpty(su)) {
                    DBCLogicalOperator.IN,
                        break;
        return getDatabase().getRoleById(monitor, ownerId);
    @Override
        return super.isStructurallyConsistentTypeWith(metaData) || typeCategory == PostgreTypeCategory.E;
                        if (typeLength == 4) {
                if (!CommonUtils.isEmpty(arrayDelimiter)) appendCreateTypeParameter(sql, "DELIMITER", SQLUtils.quoteString(getDataSource(), arrayDelimiter));
            if (baseType == null) {
            this.modInFunc = JDBCUtils.safeGetString(dbResult, "typmodin"); //$NON-NLS-1$
        return sql.toString();
    private long baseTypeId;
        }
    void resolveValueTypeFromBaseType(DBRProgressMonitor monitor) {
        return receiveFunc;

                        switch (name) {
                    case PostgreOid.VARCHAR:
                if (isValidFuncRef(modInFunc)) appendCreateTypeParameter(sql, "TYPMOD_IN", modInFunc);
    public boolean isByValue() {
                if (baseTypeName != null) {

                                valueType = Types.INTEGER;
                    DBCLogicalOperator.IS_NULL,
                    case PostgreOid.BOOL:
        alias = false;
                if (enumValues != null) {

                        break;
        this.enumValues = null;
    }
    public Object geTypeExtension() {
        }
            dataTypeSchema,
        }
                    appendCreateTypeParameter(sql, "COLLATION ", collation.getName());
import java.util.*;
        if (PostgreConstants.TYPE_JSONB.equals(getName()) || PostgreConstants.TYPE_JSON.equals(getName())) {
        this.typeId = typeId;
import org.jkiss.dbeaver.model.struct.*;
    public PostgreDatabase getDatabase() {
                        break;
                        return null;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            case c: {
            name,
        sql.append("\n\t").append(name); //$NON-NLS-1$
                    case S:

    public void setExtraDataType(boolean extraDataType) {
                            }
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        if (getDataSource().isServerVersionAtLeast(8, 4)) {
            List<PostgreEnumValue> cachedObjects = getDatabase().getEnumValueCache()
                    DBCLogicalOperator.GREATER,
                        valueType = Types.DATE;
                                // All (u)int+number types are custom, from pguint extension. Pguint is popular and we know that these types are numeric
            try {
                        valueType = Types.OTHER;
    @Property(category = CAT_MODIFIERS)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @Override
        }
                            }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

        }
    private PostgreTypeAlign align = PostgreTypeAlign.c;
    }
                    enumValues = values.toArray();
        return this.constraintsText;

                                    valueType = Types.TIMESTAMP;
                                case PostgreOid.TIMETZ:
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
        switch (typeType) {
                                case PostgreOid.TIME:
        if (!readAllTypes && skipTables) {
            try {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                    case PostgreOid.FLOAT8:


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    "ORDER BY e.enumsortorder")) {
        } else {
        this.arrayDelimiter = JDBCUtils.safeGetString(dbResult, "typdelim"); //$NON-NLS-1$
            return "::text";
        }
                if (typeCategory != null) appendCreateTypeParameter(sql, "CATEGORY", typeCategory.name());
    }
        return outputFunc;
            case p: {
    @Override
            } catch (SQLException e) {
                        break;
            this.arrayItemTypeId = JDBCUtils.safeGetLong(dbResult, "typarray"); //$NON-NLS-1$
        return getParentObject().getDatabase();
                    final RelKind tableType = RelKind.valueOf(relKind);
    }
    @Property(category = CAT_MODIFIERS)
 *
    public boolean isPreferred() {
                            case "int1":
            }

            }
                if (isValidFuncRef(inputFunc)) appendCreateTypeParameter(sql, "INPUT", inputFunc);
        }
                                case 4:
                    sql.append("CREATE TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" AS RANGE (\n"); //$NON-NLS-1$ //$NON-NLS-2$
    private boolean extraDataType;
        }
    public PostgreDataSource getDataSource() {
            return null;
    private final boolean alias;
    }
                this.constraintsText = JDBCUtils.queryStrings(
    public void setDescription(String description) {
public class PostgreDataType extends JDBCDataType<PostgreSchema> 
                sql.append("CREATE TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(";"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    }
    public PostgreTypeAlign getAlign() {
                }
        @Override
    }
            PostgreUtils.supportsTypeCategory(session.getDataSource()) ? JDBCUtils.safeGetString(dbResult, "typcategory") : null; //$NON-NLS-1$
    }
        if (catString == null) {
        return typeCategory;
    public PostgreDataTypeAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {

                        if (i < enumValues.length - 1) sql.append(",\n"); //$NON-NLS-1$

                            switch ((int) typeId) {
            PostgreDataType baseType = getBaseType(monitor);
                        } else {


        "oidvector"


                if (isValidFuncRef(receiveFunc)) appendCreateTypeParameter(sql, "RECEIVE", receiveFunc);

 * Unless required by applicable law or agreed to in writing, software
        }
        return analyzeFunc;
            this.modOutFunc = JDBCUtils.safeGetString(dbResult, "typmodout"); //$NON-NLS-1$
    @Property(category = CAT_MISC)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    private String canonicalName;
package org.jkiss.dbeaver.ext.postgresql.model;
                        break;
            // Enums are strings

    //private static final String CAT_MAIN = "Main";
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read domain constraint value")) {
                }
                "\nINNER JOIN pg_catalog.pg_class c ON (a.attrelid=c.oid)" +
    }
            session,
    }
        }

                operators.add(DBCLogicalOperator.IS_NOT_NULL);
        "regoperator",
    public void setTypeId(long typeId) {
 */
    }
                    case PostgreOid.TIMETZ:
    @Property(category = CAT_FUNCTIONS)

    {
    private List<String> constraintsText;
    }
        @NotNull
                        valueType = Types.INTEGER;
        this.isPreferred = realType.isPreferred;

    @NotNull
    public List<PostgreDataTypeAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
            sql.append(","); //$NON-NLS-1$
                    case PostgreOid.FLOAT4:
import java.sql.Types;
    }
    private int arrayDim;
    public PostgreTypeStorage getStorage() {
        return attributeCache == null ? null : attributeCache.getObject(monitor, this, attributeName);
    private long arrayItemTypeId;
    }
    private static final String CAT_MISC = "Miscellaneous";

        if (enumValues != null) {
    @Property(viewable = true, editable = true, order = 1)
        if (getDataSource().isServerVersionAtLeast(8, 3)) {
                        break;
                for (String constraint : constraints) {
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
        } else {
                    //log.debug(getFullTypeName() + " type ID resolved to " + baseType.getTypeID());
                            valueType = Types.ARRAY;
        }
            this.sendFunc = JDBCUtils.safeGetString(dbResult, "typsend"); //$NON-NLS-1$
    }
                        values.add(JDBCUtils.safeGetString(rs, 1));
    @Nullable

    }
    }
        boolean supportsCategory = session.getDataSource().isServerVersionAtLeast(8, 4);
    public DBSDataType getBaseDataType() {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Refresh enum values")) {
        this.arrayItemTypeId = realType.arrayItemTypeId;
                if (isPreferred) appendCreateTypeParameter(sql, "PREFERRED", isPreferred);
    @Property(viewable = true, optional = true, order = 13)
    private final long ownerId;
        final String typeName = getTypeName();
    }
        this.typeCategory = PostgreTypeCategory.X;
        "regproc",
        this.ownerId = realType.ownerId;
                                break;
        } else if (dataKind == DBPDataKind.OBJECT && (typeCategory == PostgreTypeCategory.G || typeCategory == PostgreTypeCategory.U)) {

        } catch (Throwable e) {
    }
    @Property(viewable = true, order = 10)
        this.outputFunc = realType.outputFunc;
                .getAllObjects(monitor, getDatabase());
            }
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull PostgreDataType postgreDataType) throws SQLException {
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        protected PostgreDataTypeAttribute fetchObject(@NotNull JDBCSession session, @NotNull PostgreDataType postgreDataType, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                "\nORDER BY a.attnum");
                        } else {
        return modInFunc;
    }
                        //                    valueType = Types.CLOB;
        this.sendFunc = realType.sendFunc;

                    DBCLogicalOperator.IS_NOT_NULL,
                typeCategory = PostgreTypeCategory.valueOf(catString.toUpperCase());
                    case PostgreOid.BYTEA:
                                valueType = Types.OTHER;
                }
        }
        this.inputFunc = realType.inputFunc;

        }

    @Property(category = CAT_FUNCTIONS)
            return getBaseType(monitor).getElementType(monitor);
                    }
        } else {
            dbStat.setLong(1, postgreDataType.classId);
                    case PostgreOid.INT2:
    @Property(category = CAT_FUNCTIONS)

    private int typeMod;
                    DBCLogicalOperator.EQUALS,
    }
    private final AttributeCache attributeCache;
            } catch (Throwable e) {
            }
        List<PostgreDataTypeAttribute> attrs = this.getAttributes(monitor);
        if (!CommonUtils.isEmpty(typAlignStr)) {
                                    break;
                                break;
        this.storage = realType.storage;
                            default:

        return typeId;
        "regtype",
        return storage;
    public DBPDataKind getDataKind() {
    @NotNull
            this.dataKind = JDBCDataSource.getDataKind(getName(), valueType);
                        break;
        this.classId = realType.classId;
            try {
                this.storage = PostgreTypeStorage.valueOf(typStorageStr);
    @NotNull
        this.typeId = realType.typeId;


    public PostgreTypeType getTypeType() {
            }
    }
                throw new DBCException("Error reading domain constraint value", e, session.getExecutionContext());
                };
    private String baseTypeName;
                    DBCLogicalOperator.ILIKE,
        String typTypeStr = JDBCUtils.safeGetString(dbResult, "typtype"); //$NON-NLS-1$
    private static final String CAT_ARRAY = "Array";
                    .append(";"); //$NON-NLS-1$
        return null;
    private String arrayDelimiter;
        List<PostgreDataBoundTypeAttribute<?>> boundAttrs = new ArrayList<>(attrs.size());
                                    break;
                    List<String> values = new ArrayList<>();
        }
        }
    private PostgreTypeStorage storage = PostgreTypeStorage.p;
    @Property(category = CAT_MODIFIERS)
     * Returns array type whose element is this type
            valueType,
                    for (PostgreDataTypeAttribute attr : attributes) {
            String relKind = JDBCUtils.safeGetString(dbResult, "relkind"); //$NON-NLS-1$
                if (isValidFuncRef(modOutFunc)) appendCreateTypeParameter(sql, "TYPMOD_OUT", modOutFunc);
 */
    @Property(category = CAT_MISC)
                    }
        return description;
        }
                        valueType = Types.CHAR;
        this.analyzeFunc = realType.analyzeFunc;
    }
    @NotNull
                    "SELECT concat(c.conname, ' ', pg_catalog.pg_get_constraintdef(oid, true))\r\n"
        return typeType == PostgreTypeType.c && classId >= 0;
                    default:
        }
                                    valueType = Types.BIGINT;
                        first = false;
    }
    PostgreDataType(PostgreDataType realType, String aliasName) {
        return typeType;
        "regconfig",
                sql.append("CREATE TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" AS ("); //$NON-NLS-1$ //$NON-NLS-2$
        this.attributeCache = null;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
                            valueType = Types.OTHER;
            } catch (Exception e) {

            // Cast special dataTypes and use full names for user defined types
        @Override
    }
        "regprocedure",

                    case PostgreOid.BIT:
                sql.append("CREATE DOMAIN ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" AS "); //$NON-NLS-1$ //$NON-NLS-2$
                        break;

            return constraintsText;
                        valueType = Types.NUMERIC;

                                break;
    @Override
                    "FROM pg_catalog.pg_enum e\n" +
            return DBUtils.getQuotedIdentifier(owner) + "." + DBUtils.getQuotedIdentifier(this);
    private DBPDataKind dataKind;
        super(schema, valueType, name, null, false, true, length, -1, -1);
        return getElementType(monitor);
                switch ((int) typeId) {
                        break;
    @NotNull
            return "::" + getFullyQualifiedName(DBPEvaluationContext.DDL);
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
                            case "uint2":
        this.baseTypeId = JDBCUtils.safeGetLong(dbResult, "typbasetype"); //$NON-NLS-1$
        if (sql.charAt(sql.length() - 1)!= '(') {
    @Property(category = CAT_FUNCTIONS)
        StringBuilder sql = new StringBuilder();
    }
                if (typCategoryStr != null && !typCategoryStr.isEmpty()) {
            return operators.toArray(new DBCLogicalOperator[0]);

        }
                        valueType = Types.BINARY;
    }
        } else {
    @NotNull
    }

    private void readEnumValues(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override

      return OID_TYPES;
    }
import org.jkiss.dbeaver.model.*;
                    sql.append(getBaseType(monitor).getFullyQualifiedName(DBPEvaluationContext.DDL));
        return sendFunc;
        long typeId = JDBCUtils.safeGetLong(dbResult, "oid"); //$NON-NLS-1$
import org.jkiss.dbeaver.model.exec.DBCException;
    }
    @Property(order = 15)
                        valueType = Types.CHAR;
                    .append(SQLUtils.quoteString(this, description))
        return super.getName();


                        break;
        return super.getSupportedOperators(attribute);
            default: {
        }
    }
                "\nLEFT OUTER JOIN pg_catalog.pg_description dsc ON (c.oid=dsc.objoid AND a.attnum = dsc.objsubid)" +
        if (owner == null || owner.getName().equals(PostgreConstants.CATALOG_SCHEMA_NAME)) {
                    case PostgreOid.BOX:
        return getDatabase().getDataType(monitor, baseTypeId);
    private String modOutFunc;
    @Property(category = CAT_MISC)
                    }

        return alias;
            case b: {
                    case PostgreOid.TIMESTAMPTZ:
        return null;
    }
            this.canonicalName = PostgreConstants.DATA_TYPE_CANONICAL_NAMES.get(name);
                        }
                    case PostgreOid.DATE:
            } else {
    implements PostgreClass, DBSDataTypeSerial, PostgreScriptObject, DBPQualifiedObject, DBPImageProvider, DBSBindableDataType, DBPNamedObject2 {
                            case "uint8":

            } else {
    private void readNewEnumValues(DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
                                valueType = Types.SQLXML;

        if (supportsCategory) {
        if (typeCategory == PostgreTypeCategory.E && ArrayUtils.isEmpty(enumValues)) {
    public PostgreDataType getArrayItemType(DBRProgressMonitor monitor) {
                log.debug("Invalid type storage [" + typStorageStr + "] - " + e.getMessage());

                if (getTypeID() != baseType.getTypeID()) {
    }
 *
        super(realType.getParentObject(), realType);
    }


    public static String[] getOidTypes() {
                            .append(DBUtils.getQuotedIdentifier(attr)).append(" ").append(attr.getTypeName()); //$NON-NLS-1$
        return enumValues;
    
    public boolean isArray() {
    public boolean isExtraDataType() {
                }
            return null;
        }
                break;
                        } else {
                        valueType = Types.STRUCT;
                if (collationId != 0) appendCreateTypeParameter(sql, "COLLATABLE", true);
                } else {
            } catch (SQLException e) {
    public static class EnumTypeValidator implements IPropertyValueValidator<PostgreDataType, Object> {
                    }
        this.modOutFunc = realType.modOutFunc;



                        valueType = Types.SMALLINT;
    @Override
        }
import org.jkiss.dbeaver.DBDatabaseException;
                "\nWHERE a.attnum > 0 AND NOT a.attisdropped AND c.oid=?" +
                        break;
        if (CommonUtils.isEmpty(name)) {
    private static final String CAT_FUNCTIONS = "Functions";
                        valueType = Types.TIMESTAMP;
                    case PostgreOid.XML:
                    case A:
                    .append(" IS ") //$NON-NLS-1$
        if (attributeCache != null) {
                        break;
                    sql.append("\n\tCOLLATE ").append(DBUtils.getQuotedIdentifier(collation)); //$NON-NLS-1$
            return "::text";
                        valueType = Types.NUMERIC;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        }
        String typAlignStr = JDBCUtils.safeGetString(dbResult, "typalign"); //$NON-NLS-1$
                                    break;
     */
            typeId,
    @Property(category = CAT_ARRAY)
    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
            if (typTypeStr != null && !typTypeStr.isEmpty()) {
    public List<? extends DBSContextBoundAttribute> bindAttributesToContext(
    @Nullable
                                case 4:
        if (baseTypeId > 0) {
                    case PostgreOid.INT8:
                    case C:

                // In old PostgreSQL versions
    public String getArrayDelimiter() {
            if (this.dataKind == DBPDataKind.OBJECT) {
                    DBCLogicalOperator.NOT_EQUALS,
                        break;
