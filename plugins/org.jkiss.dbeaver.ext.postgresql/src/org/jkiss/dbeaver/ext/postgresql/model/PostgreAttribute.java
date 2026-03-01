import org.jkiss.code.NotNull;
            //setTypeName(dataType.getTypeName());
 */
    @Nullable
        return dataType == null ? super.getDataKind() : dataType.getDataKind();
    @Nullable
    }
    }
            // TODO: [#2824] Perhaps we should just use type names declared in pg_catalog

    }
    @Override
import org.jkiss.dbeaver.model.meta.Property;
        this.isLocal =
        }
            }
import java.sql.Types;
        }

        super(table, false);
    @Override
    }
    }

                    this.isItemType && other.isItemType && this.elementType.equals(other.elementType)
            || (getStorage().getCode().equals(getDataType().getStorage().name()));
    {
    public PostgreAttribute(
        throws DBException
            }
            setValueType(dataType.getTypeID());


            }
        return dataType;
                typeId = PostgreOid.SMALLSERIAL;
        }
        private final PostgreDataType arrayType;


import org.jkiss.dbeaver.model.struct.*;
                Collection<PostgreSchema> schemas = column.getDatabase().getSchemas(new VoidProgressMonitor());
        @NotNull

                PostgreDataType canonicalType = getTable().getDatabase().getDataType(monitor, dataType.getCanonicalName());
    private String description;
import java.util.List;
    @Property(order = 85, visibleIf = AttributeStorageValueValidator.class, editableExpr = "object.supportsAlterStorageStrategy()", updatableExpr = "object.supportsAlterStorageStrategy()", listProvider = StorageListProvider.class)
        public Kind getKind() {
        return typeId;
import org.jkiss.dbeaver.Log;
        @Override
     * <p>
                .toArray(String[]::new);
    {
        this.typeId = dataType.getTypeID();
        public int getIndexableDimensions() {
    public PostgreAttribute(
    public String[] getForeignTableColumnOptions() {
        final Pair<String, String[]> type = DBUtils.getTypeModifiers(fullTypeName);
        }
        throws DBException
            dataType = getTable().getDatabase().getDataType(monitor, PostgreConstants.TYPE_VARCHAR);
                if (canonicalType != null) {
    {
        @Override
    {
    public long getMaxLength() {
            return obj instanceof PostgreArrayAttrTypeDescriptor other && ((
        @Override
    }
        if (handler != null) {
            foreignTableColumnOptions = PostgreUtils.safeGetStringArray(dbResult, "attfdwoptions");
    public long getDepObjectId() {
    }
    @NotNull
}
    }
        @Override
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreTypeHandlerProvider;
    
                            return this;
        PostgreDataSource dataSource = getDataSource();

                        }
    public boolean isInherited() {
                return this.arrayType;
 * See the License for the specific language governing permissions and
        return !isLocal;
        }
            return false;
                Collection<PostgreCollation> collations = object.getDatabase().getCollations(new VoidProgressMonitor());
        final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);
            if (length != null) {
    @Override
        }
            // Replacing them with "convenient" types names migh cause some issues

            log.debug("Can't find specified data type by name: '" + typeName + "', creating a fake type");
    }
    }
        }
        if (dataType == null) {
            return object.getTable() instanceof PostgreTable && object.getDataSource().getServerType().supportsAlterStorageStrategy();
            this.dataType = dataType;
    }
    public void setMaxLength(long maxLength) {
 * limitations under the License.
            ? new PostgreArrayAttrTypeDescriptor(false, this.arrayDim, type, type.getElementType(monitor))
                .sorted(Comparator
    public long getObjectId() {
            } else {
            }
    }

        this.arrayDim = source.arrayDim;
        if (dataType == null) {
        this.identity = identity;
    private boolean isGeneratedColumn;
    public static class AttributeStorageValueValidator implements IPropertyValueValidator<PostgreAttribute, Object> {
            || (getDataType().getStorage() == null && getStorage() == PostgreAttributeStorage.PLAIN)
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

                    !this.isItemType && !other.isItemType && this.arrayDim == other.arrayDim && this.arrayType.equals(other.arrayType) && this.elementType.equals(other.elementType)

                }
    private String defaultValue;
                identity = PostgreAttributeIdentity.getByCode(identityStr);
    public static class CollationListProvider implements IPropertyValueListProvider<PostgreAttribute> {
    }
        OWNER table,
        this.inheritorsCount = source.inheritorsCount;
        setOrdinalPosition(JDBCUtils.safeGetInt(dbResult, "attnum"));
            return this.elementType.getFullTypeName() + "[]".repeat(isItemType ? 0 : arrayDim);
        if (supportsDependencies() && serverType.supportsSequences()) {
        dataType = getTable().getDatabase().getDataType(monitor, typeId);
                }
        return this.arrayDim > 0 && type != null && type.isArray()
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        if (serverType.supportsAlterStorageStrategy()) {
    public void setDefaultValue(@Nullable String defaultValue) {
    }
    public String getDescription() {
            if (isItemType) {
        return isLocal;
                    .thenComparing(Function.identity()))
            dataType = findDataType(getSchema(), typeName);

            if (!CommonUtils.isEmpty(generatedColumn)) {
        this.description = description;
        }
    }
            } catch (DBException e) {
    @Nullable
        return depObjectId;
        if (collationId <= 0 || !getDataSource().getServerType().supportsCollations()) {
    public void setTypeName(@NotNull String typeName) throws DBException {
    {
    public void setDescription(String description) {
            return PostgreAttributeStorage.getValues(object.getDataSource());

        this.comment = source.comment;
        }
        this.identity = source.identity;
    private PostgreDataType resolveOrCreateDataType(@NotNull String typeName) throws DBException {
    @Nullable
            if (typeId == PostgreOid.INT4) {
        }

                log.error(e);
            } else if (typeId == PostgreOid.INT2) {
                    return new Object[0];
            return handler.getTypePrecision(dataType, typeMod);
        @Override

            } else {
        final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);
    }
        return getTable().getDataSource();
    implements PostgreObject, DBSTypedObjectEx, DBPNamedObject2, DBPHiddenObject, DBPInheritedObject, DBSTypedObjectExt4<PostgreDataType>, DBSTypedObjectEx2
import java.util.ArrayList;
    public abstract PostgreSchema getSchema();

    @Override

    }
    @Nullable
        return identity;
    @Override
                    List<PostgreDataType> dataTypes = schema.getDataTypeCache().getCachedObjects();

        private final int arrayDim;
        this.description = source.description;
     *     either be completely indexed through all the dimensions till the single item reflected with its data type,
        //setDefaultValue(defaultValue);

    public void setCollation(PostgreCollation collation) {
    private String comment;
    }
    @Override
        this.typeMod = source.typeMod;
        return typeMod;
    protected PostgreAttribute(
    public PostgreDatabase getDatabase() {
            if (false && dataType.getCanonicalName() != null && dataSource.isServerVersionAtLeast(9, 6)) {
    public void setScale(@Nullable Integer scale) {
        final String def = getDefaultValue();
            this.storage = PostgreAttributeStorage.getByCode(JDBCUtils.safeGetString(dbResult, "attstorage"));
    @Override
        }
                    types.addAll(dataTypes);
        this.defaultValue = source.defaultValue;

        setRequired(JDBCUtils.safeGetBoolean(dbResult, "attnotnull"));
            if (!CommonUtils.isEmpty(identityStr)) {
                return null;
 *

        if (dataType == null) {
    {

        final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);

        return null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public PostgreDataSource getDataSource()
        log.debug("Attribute does not support updating its scale");
            return types.stream()
        }
        defaultValue = JDBCUtils.safeGetString(dbResult, "def_value");
 * distributed under the License is distributed on an "AS IS" BASIS,
                    for (int i = 0; i < slicingSpecOrNull.length; i++) {

        DBRProgressMonitor monitor,
import java.util.function.Function;
                types.addAll(column.getDatabase().getLocalDataTypes());
        return getOrdinalPosition();

    public Object getAcl() {
    public static class DataTypeListProvider implements IPropertyValueListProvider<PostgreAttribute<?>> {

            }

    @Override
        }
        public boolean allowCustomValue() {

    public DBPDataKind getDataKind() {
                return null;
                typeId = PostgreOid.SERIAL;
        }
        final PostgreDataType dataType = resolveOrCreateDataType(typeName);
        // Collation
                for (PostgreSchema schema : schemas) {
        return null;
    }
        if (getTable() instanceof PostgreTableForeign) {
        if (isGeneratedColumn || identity != null) {
        return acl;
    public boolean isHidden() {
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
        }
    public void setTypeMod(int typeMod) {
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
        }
    @Nullable
    public String getFullTypeName() {

    @Property(order = 29)
    private void loadInfo(DBRProgressMonitor monitor, JDBCResultSet dbResult)

    @Nullable
import org.jkiss.dbeaver.model.*;
    @Nullable
                return length;
    }
            }
            return false;
    @Nullable
            this.arrayType = arrayType;
    }
    private int typeMod;
        this.typeName = typeName;
        }
    private long typeId;
            return true;
        }
public abstract class PostgreAttribute<OWNER extends DBSEntity & PostgreObject> extends JDBCTableColumn<OWNER>
        final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);
        setName(JDBCUtils.safeGetString(dbResult, "attname"));
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
            return typeName + handler.getTypeModifiersString(dataType, typeMod);
 * you may not use this file except in compliance with the License.
    }
    public boolean supportsAlterStorageStrategy() {
        this.storage = storage;

        return typeName;

            try {
    @Override
    public PostgreAttributeStorage getStorage() {
        if (serverType.supportsCollations()) {
        @Nullable
    @Override

        if (dataType == null) {

        if (!CommonUtils.isEmpty(defaultValue) && serverType.supportsGeneratedColumns()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    return new PostgreArrayAttrTypeDescriptor(true, this.arrayDim, this.arrayType, this.elementType);
    }
        }
    private long charLength;
                typeId = PostgreOid.BIGSERIAL;
                return collations.toArray();
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;

        final PostgreDataType dataType = resolveOrCreateDataType(typeName);
    }

    @Override
    }
                    }
            }
    public boolean isAutoGenerated()
    public boolean isLocal() {
    @Override
        if (isGeneratedColumn) {
    private String[] foreignTableColumnOptions;
    public long getTypeId() {
            }
    @Override
    @Property(viewable = true, editableExpr = "!object.table.view", order = 30, listProvider = CollationListProvider.class)
    private long depObjectId;
                // se canonical type names. But only for PG >= 9.6 (because I can't test with earlier versions)
            log.error("Attribute data type '" + typeId + "' not found. Use " + PostgreConstants.TYPE_VARCHAR);
    @Override
        return dataType;
    @Nullable
                } else {
        this.typeMod = typeMod;
        OWNER table)
    }

        log.debug("Attribute does not support updating its max length");
        typeId = JDBCUtils.safeGetLong(dbResult, "atttypid");
        public DBSDataType getUnderlyingType() {

        public  PostgreArrayAttrTypeDescriptor(boolean isItemType, int arrayDim, PostgreDataType arrayType, PostgreDataType elementType) {

        if (isPersisted()) {
                }
    public PostgreAttributeIdentity getIdentity() {
                } else if (slicingSpecOrNull.length != arrayDim) {
            dataType = schema.getDatabase().getDataType(null, typeName);
    }
        public String getTypeName() {
        return def != null && def.contains("nextval(");
            }
        return PostgreUtils.getDisplaySize(typeId, typeMod);
    }
        if (handler != null) {
                log.debug("Can't get data types from database schemas", e);
            return handler.getTypeScale(dataType, typeMod);
        @Override
        }

        }
    @Override

import org.jkiss.utils.Pair;
        public boolean allowCustomValue() {
        }
        JDBCResultSet dbResult)

     *     or sliced with any other way of indexing producing an array of the same structural type.
        throws DBException

        PostgreDataType type = this.getDataType();
        return description;
                .map(DBSTypedObject::getTypeName)

    }
    private int inheritorsCount;
    protected boolean supportsDependencies() {
        if (handler != null) {
        @NotNull
 *
        this.dataType = dataType;
    public PostgreDataType getDataType() {

        this.storage = source.storage;
        super(table, true);
            } else if (typeId == PostgreOid.INT8) {
        PostgreAttribute source)
        String serialValuePattern = getParentObject().getName() + "_" + getName() + "_seq";


 * Unless required by applicable law or agreed to in writing, software
            this.isItemType = isItemType;
        final PostgreTypeHandler handler = PostgreTypeHandlerProvider.getTypeHandler(dataType);
 *
        }
        return null;
    }
    public PostgreCollation getCollation(DBRProgressMonitor monitor) throws DBException {
        }
    @Property(viewable = true, editableExpr = "!object.table.view", order = 28)
        loadInfo(monitor, dbResult);
    /**
    public Integer getPrecision() {
        this.arrayDim = JDBCUtils.safeGetInt(dbResult, "attndims");
        this.isLocal = true;
        }
        this.collationId = source.collationId;
        @Nullable
    }
import org.jkiss.utils.CommonUtils;
        DBRProgressMonitor monitor, OWNER table,
    @NotNull
    public DBSTypeDescriptor getTypeDescriptor(@NotNull DBRProgressMonitor monitor) {
        final String[] typeMods = type.getSecond();
    private PostgreAttributeIdentity identity;
            return null;
                    this.dataType = canonicalType;
        PostgreServerExtension serverType = dataSource.getServerType();
 * You may obtain a copy of the License at
        if (dataSource.isServerVersionAtLeast(10, 0)) {
        }
    @Override
        this.valueType = dataType.getTypeID();
    }
        return getDataSource().getServerType().supportsAlterStorageStrategy();
            String generatedColumn = JDBCUtils.safeGetString(dbResult, "attgenerated");
        if (dataType != null) {
            this.collationId = JDBCUtils.safeGetLong(dbResult, "attcollation");
    private static final Log log = Log.getLog(PostgreAttribute.class);
        @Override
    public Integer getScale() {
        this.dataType = source.dataType;
            this.typeId = dataType.getTypeID();
        if (handler != null) {

    @NotNull
        }
        setPersisted(true);
/**
    }
    @Property(viewable = true, editableExpr = "!object.table.view", updatableExpr = "!object.table.view", order = 70)
        this.charLength = source.charLength;
    public void setStorage(PostgreAttributeStorage storage) {
        this.acl = source.acl;
    @Nullable
        }

        } else {
 */

        }
    @Override
            this.depObjectId = JDBCUtils.safeGetLong(dbResult, "objid"); // ID of object which has dependency with this column
        public boolean allowCustomValue() {
        return super.isRequired();

            this.typeMod = handler.getTypeModifiers(dataType, typeName, typeMods);
import java.util.Collection;
        @Nullable

                }
    public String getDefaultValue()
        @Override
            // TODO clarify postgre indexing and slicing rules
        public boolean isValidValue(@NotNull PostgreAttribute object, @Nullable Object value) throws IllegalArgumentException {
                ));
    public void setFullTypeName(@NotNull String fullTypeName) throws DBException {
        }

            return dataType.getTypeName();
    public int getTypeMod() {

    }

import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
    @NotNull
    public void setDataType(@NotNull PostgreDataType dataType) {
            // retry search in local schema types and create some data type on failure
        if (dataType != null) {
    }
        this.inheritorsCount = JDBCUtils.safeGetInt(dbResult, "attinhcount");
                (CommonUtils.isNotEmpty(defaultValue) && defaultValue.startsWith("nextval(") && defaultValue.contains(serialValuePattern))) {
            return getDatabase().getCollation(monitor, collationId);
            throw new DBException("Can't find specified data type by name: '" + typeName + "'");
import java.util.Comparator;
        }
        if (isGeneratedColumn) {

    }
    public String getGeneratedValue()
            JDBCUtils.safeGetBoolean(dbResult, "attislocal", true);
    @Override
        final String typeName = type.getFirst();
        super(table, source, true);
        public DBSTypeDescriptor getIndexableItemType(int depth, boolean[] slicingSpecOrNull) {

        // Also check sequence in def value
    }
    }
     */
            final Integer length = handler.getTypeLength(dataType, typeMod);
        }
        public boolean equals(Object obj) {
        return false;

        this.collationId = collation == null ? 0 : collation.getObjectId();
    }
            } else if (this.arrayDim == this.arrayType.getArrayDim()) {
                    .comparing((String name) -> name.startsWith("_")) // Sort the arrays data types at the end of the list
    
            return isItemType ? 0 : arrayDim;
    }

                ) || (
        }
    }
        return defaultValue;
            if (this.isItemType) {
        typeMod = JDBCUtils.safeGetInt(dbResult, "atttypmod");
        }
            return getTypeName();
    public String getTypeName() {
    }

    public boolean isRequired()
        PostgreDataType dataType = PostgreUtils.resolveTypeFullName(new VoidProgressMonitor(), getSchema(), typeName);
        if (dataType == null) {
    private long collationId;
            return defaultValue;
    private int arrayDim;
package org.jkiss.dbeaver.ext.postgresql.model;
    }

                return new Object[0];
    @Nullable
                if (slicingSpecOrNull == null) {

        if ((typeId == PostgreOid.INT2 || typeId == PostgreOid.INT4 || typeId == PostgreOid.INT8) &&
    }
    private boolean isLocal;
        return typeName;
        @Override
        @Override
    public boolean hasDefaultStorage() {
    }

        this.isLocal = source.isLocal;
        }
        return dataType;
    }
    @Override
 * PostgreAttribute
        if (serverType.supportsAcl()) {
     * Represents the type description for the attribute of the array type
    {
    @NotNull

            dataType = new PostgreDataType(schema, Types.OTHER, typeName);
    @NotNull
        //set serial types manually
    }
        this.typeName = dataType.getTypeName();
            List<PostgreDataType> types = new ArrayList<>();
    @NotNull
            return null;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableColumn;
    @Override
            !serverType.supportsInheritance() ||
 *     http://www.apache.org/licenses/LICENSE-2.0

            : null;
            try {
    @Override
        return foreignTableColumnOptions;
            this.acl = JDBCUtils.safeGetObject(dbResult, "attacl");
    private PostgreDataType dataType;

                        if (slicingSpecOrNull[i]) {
        @Nullable
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)


                return this.elementType;
        public Object[] getPossibleValues(PostgreAttribute object) {
        return false;
     * Array column type in postgre can
            this.arrayDim = arrayDim;
                    return depth == arrayDim ? new PostgreArrayAttrTypeDescriptor(true, this.arrayDim, this.arrayType, this.elementType)
                isGeneratedColumn = true;
        }
    public static class StorageListProvider implements IPropertyValueListProvider<PostgreAttribute> {
    }
 * DBeaver - Universal Database Manager
            } catch (DBException e) {
    @Property(order = 80)
        @Override
        }


    public void setIdentity(PostgreAttributeIdentity identity) {
        public Object[] getPossibleValues(PostgreAttribute<?> column) {
            schema.getDataTypeCache().cacheObject(dataType);
     * Partial exposure is questionable, didn't find working example for PostgreSQL, but some other databases supports that.
import org.jkiss.dbeaver.DBException;
/*
    }
        private final PostgreDataType elementType;
        String typeName = dataType.getFullyQualifiedName(DBPEvaluationContext.DDL);

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                if (collations == null) {
        this.description = JDBCUtils.safeGetString(dbResult, "description");
        log.debug("Attribute does not support updating its precision");
        public Object[] getPossibleValues(PostgreAttribute object) {
                    return slicingSpecOrNull.length > arrayDim ? null : this;
    {
        } else {
                        : (depth > arrayDim ? null : this);
    private static PostgreDataType findDataType(@NotNull PostgreSchema schema, @NotNull String typeName) throws DBException {
    private PostgreAttributeStorage storage;
{
    @Override
    @Override
            return true;
            return getOrdinalPosition() < 0 || getDataSource().getServerType().isHiddenRowidColumn(this);
            // PostgreSQL 12/13 documentation says: "If a zero byte (''), then not a generated column. Otherwise, s = stored. (Other values might be added in the future)"
        }
    @NotNull


        this.typeId = source.typeId;
        return getTable().getDatabase();
import org.jkiss.dbeaver.ext.postgresql.model.data.type.PostgreTypeHandler;
        if (handler != null) {
        } else {
        private final boolean isItemType;
        return this.storage;
    private static class PostgreArrayAttrTypeDescriptor implements DBSTypeDescriptor {
    public void setPrecision(@Nullable Integer precision) {
    @Property(viewable = true, editableExpr = "!object.table.view", updatableExpr = "!object.table.view", order = 20, listProvider = DataTypeListProvider.class)
    private Object acl;
        this.defaultValue = defaultValue;

        @Nullable
        }
    }
        if (dataType == null && schema.getDataSource().getServerType().supportsExternalTypes()) {
    @Override
        @Override

            String identityStr = JDBCUtils.safeGetString(dbResult, "attidentity");
    @Property(viewable = true, editableExpr = "!object.table.view", updatableExpr = "!object.table.view", order = 50)
        return getStorage() == null
    }
import org.jkiss.code.Nullable;
    {
            super.setFullTypeName(fullTypeName);
            this.elementType = elementType;

        PostgreDataType dataType = schema.getDataSource().getLocalDataType(typeName);
        this.dataType = dataType;
    @Nullable
        }
        @Override
            return !isItemType ? Kind.INDEXABLE : Kind.UNKNOWN;
