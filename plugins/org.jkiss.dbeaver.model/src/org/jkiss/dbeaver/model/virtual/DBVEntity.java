
        this.entityForeignKeys = null;

        public void close() {
        return container.getDataSource();
import org.jkiss.dbeaver.model.struct.*;
            return;
        }
 */

            curColor.setRange(JSONUtils.getBoolean(colorObj, "range"));
            colorOverrides.removeIf(c -> c.matches(attrName, DBCLogicalOperator.EQUALS, co.getAttributeValues()));
            }
                    break;
            if (monitor != null) {
        }
        @Override
    }
    }
            DBUtils.fireObjectUpdate(this, foreignKey);
        DBSEntity realEntity = getRealEntity(monitor);
        for (Map.Entry<String, Map<String, Object>> attrObject : JSONUtils.getNestedObjects(map, "attributes")) {

    @NotNull
        String constraintName = constraint.getName();
    public DBVContainer getParentObject() {
                for (String columnName : stringColumns.keySet()) {
            return Collections.emptyList();
    public DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) {
        if (entityForeignKeys != null) {
            curColor.setSingleColumn(JSONUtils.getBoolean(colorObj, "single-column"));
                sortAsc,

    // Copy constructor
        @NotNull String descColumns
        }
            @NotNull Object pattern, boolean caseInsensitive, boolean byDesc, 
    public void copyFrom(@NotNull DBVEntity src, @NotNull DBVModel targetModel) {
            this.entityAttributes = null;
package org.jkiss.dbeaver.model.virtual;
        for (DBSEntityAttribute column : allColumns) {

    public DBVEntity(@NotNull DBVContainer container, @NotNull String name, String descriptionColumnNames) {
        @NotNull DBSEntityAttribute keyColumn,
        @NotNull
                    if (nextAttribute == null) {
        if (colorOverrides == null) {


                            nextAttribute = new DBVEntityAttribute(this, topAttribute, path[i].getName());
            fk.setAttributes(attrs);
        "comment",

        for (Map.Entry<String, Map<String, Object>> consObject : JSONUtils.getNestedObjects(map, "constraints")) {
        return DBUtils.getFullQualifiedName(getDataSource(),
        final String attrName = attribute.getName();
        if (realEntity instanceof DBSDictionary) {
            DBVEntityAttribute attr = new DBVEntityAttribute(this, null, attrName, attrMap);

        }
            return false;
            DBVEntityConstraint constraint = new DBVEntityConstraint(this, DBSEntityConstraintType.VIRTUAL_KEY, consName);
    public DBVEntityAttribute getVirtualAttribute(String name) {
    }

        }
        return getCustomAttributes();
        return name;
        @NotNull DBRProgressMonitor monitor,
                    constraint.addAttribute(attrName);
    @Override
            DBVEntityAttribute topAttribute = DBUtils.findObject(entityAttributes, path[0].getName());
            }
            }
        // Color mappings
    @NotNull
            this.entityConstraints = null;
        addVirtualAttribute(attribute, true);
    }
        DBSObjectContainer realContainer = container.getRealContainer(monitor);
    public <T> T getAdapter(@NotNull Class<T> adapter) {
                            return null;
                JSONUtils.getString(colorObj, "foreground"),
            return;
    public static List<String> getDescriptionColumnPatterns(@NotNull DBPPreferenceStore store) {
            if (topAttribute == null && create) {
 * DBeaver - Universal Database Manager
        boolean sortAsc,
            }
        }
     */
    @Override
        while (st.hasMoreTokens()) {
        @NotNull
        if (entityForeignKeys != null) {
                    fkCopy.dispose();
     * meaning it can be used as a row identifier.
                if (CommonUtils.equalObjects(name, attr.getName())) {
    private final DBVContainer container;



        return entityConstraints;
    }
        @NotNull
            );
    }
        if (!CommonUtils.isEmpty(src.entityConstraints)) {
    }
        copyFrom(copy, targetModel);
        for (Map<String, Object> colorObj : JSONUtils.getObjectList(map, "colors")) {

                        } else {

        @Nullable String searchText, @Nullable List<DBDAttributeValue> preceedingKeys,
                searchText,
        }
        colorOverrides.remove(co);
        if (!CommonUtils.isEmpty(src.entityForeignKeys)) {
     * Determines whether the given virtual constraint is considered complete,

 * distributed under the License is distributed on an "AS IS" BASIS,
        return container;
        }
    @NotNull
            if (topAttribute != null) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                DBSEntityConstraintType.VIRTUAL_KEY,
 * Copyright (C) 2010-2025 DBeaver Corp and others
            !CommonUtils.isEmpty(getProperties()) ||
                break;
            return Collections.emptyList();
    public void setDescriptionColumnNames(String descriptionColumnNames) {
        @Override
    ) throws DBException {
            }
            this.entityForeignKeys = new ArrayList<>(src.entityForeignKeys.size());
            for (DBVColorOverride co : src.colorOverrides) {
    @NotNull
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    void handleRename(String oldName, String newName) {
        } else {
    @Nullable
    }
        try {
            for (DBVEntityConstraint c : entityConstraints) {
            long offset, long maxResults
import org.jkiss.dbeaver.model.*;
/*
                    result.add(co);
    public <T extends DBSAttributeBase> Collection<T> getDescriptionColumns(@NotNull Collection<? extends T> attributes) {
     * <p>
                column.getDataKind() == DBPDataKind.STRING &&
    }
        return entityAttributes;
                fk.dispose();
    public void bindEntity(DBRProgressMonitor monitor) throws DBException {
            for (DBVEntityForeignKey fk : src.entityForeignKeys) {
        }
    public Collection<DBSEntityAttribute> getDescriptionColumns(DBRProgressMonitor monitor, DBSEntity entity)
    ) throws DBException {
    }
            if (Objects.equals(existing.getName(), constraintName)) {
                this.colorOverrides.add(new DBVColorOverride(co));
            return emptyDictionaryAccessor;
            }

            this.entityConstraints = new ArrayList<>(src.entityConstraints.size());
            if (result != null) {
    public DBVEntity(@NotNull DBVContainer container, @NotNull DBVEntity copy, @NotNull DBVModel targetModel) {
    public DBPDataSource getDataSource() {

            background);
        }
    }
    private static final int MAX_DESC_COLUMN_LENGTH = 1000;
    }
    @NotNull
        loadPropertiesFrom(map, "properties");
            return topAttribute;
                maxResults
            boolean useAllColumns = JSONUtils.getBoolean(consMap, "useAllColumns");
        
                    DBVEntityAttribute nextAttribute = topAttribute.getChild(path[i].getName());
                    allAttrs.addAll(realAttributes);
                    }
        // Bind logical foreign keys
        entityAttributes.add(attribute);
    @NotNull

    }
            DBVEntityForeignKey fk = new DBVEntityForeignKey(this);
        }
            return Collections.emptyList();
    @Override

        "description",
        public List<DBDLabelValuePair> getValues(long offset, int pageSize) {
        return null;
            @NotNull Object value,

                if (!CommonUtils.isEmpty(customAttributes)) {
            return DBUtils.getQuotedIdentifier(keyColumn);
        return entityForeignKeys;

    private List<DBVEntityForeignKey> entityForeignKeys;
        return true;
    }
        {
        return getDescriptionColumns(entity.getAttributes(monitor), descColumns);

        if (!CommonUtils.isEmpty(src.entityAttributes)) {
    }

    }


        // Foreign keys
     *   <li>its type is unique, and</li>
            String colName = st.nextToken();
        this.descriptionColumnNames = descriptionColumnNames;
import org.jkiss.utils.CommonUtils;

        return null;
        public List<DBDLabelValuePair> getValues(long offset, long maxResults) {
     * A constraint is considered complete if:

        List<T> result = new ArrayList<>();
        }
     * <ul>
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        @NotNull DBSEntity entity,
    @Nullable
        
    }
                    if (result == null) result = new ArrayList<>();
        "name",
    public List<DBVEntityAttribute> getCustomAttributes() {
                    if (columnName.toLowerCase(Locale.ENGLISH).contains(pattern)) {

    public void removeAllColorOverride() {
                for (int i = 1; i < path.length; i++) {
        Map<String, DBSEntityAttribute> stringColumns = new TreeMap<>();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

            }
        }

    @NotNull
        return getDescriptionColumns(monitor, entity, descriptionColumnNames);
                keyColumn,
            boolean caseInsensitive,
            List<DBVEntityForeignKeyColumn> attrs = new ArrayList<>();
        }
                }

 * you may not use this file except in compliance with the License.
                return (DBVModel) container;
import org.jkiss.dbeaver.model.data.DBDAttributeValue;
    public void setColorOverride(DBDAttributeBinding attribute, Object value, String foreground, String background) {
            foreground,

            return null;
        }
            // do nothing
        if (entityForeignKeys == null) {
        if (reflect) {
        this.descriptionColumnNames = (String) map.get("description");
    private String description;
                (column.getMaxLength() <= 0 ||
            long offset,
    public void setColorOverrides(List<DBVColorOverride> colorOverrides) {
            @NotNull Object pattern,
        DBSEntity realEntity = getRealEntity(monitor);
        }
            Map<String, Object> attrMap = attrObject.getValue();
            }
    }
        this.container.renameEntity(this, oldName, newName);
        return colorOverrides == null ? Collections.emptyList() : colorOverrides;
                    List<DBSEntityAttribute> allAttrs = new ArrayList<>();
                sortByValue,

            return new VoidProgressMonitor();
        }
        colorOverrides.add(color);
    @Nullable
            return true;

            }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        List<DBVColorOverride> result = new ArrayList<>();
                preceedingKeys,
        "information",
        @NotNull DBRProgressMonitor monitor,
                monitor,
                sortAsc,
        return attribute.getName().equalsIgnoreCase(name);
        if (realObject instanceof DBSEntity entity) {
                }
            && (!CommonUtils.isEmpty(constraint.getAttributes()) || constraint.isUseAllColumns());
        this.container = container;
    @Override
        if (allColumns == null || allColumns.isEmpty()) {
            container instanceof DBVModel ? null : container,
                }
        return realEntity instanceof DBSDictionary dictionary ?
            attrName,
            entityForeignKeys.clear();

                if (attr.isCustom()) {
            DBUtils.fireObjectUpdate(this);
    public static final String[] DEFAULT_DESCRIPTION_COLUMN_PATTERNS = {
        return result;
        return addConstraint(constraint, true);
        }
        }
    }
    ) {
    @NotNull
        colorOverrides.clear();
        DBUtils.fireObjectUpdate(this, foreignKey);
        if (stringColumns.size() > 1) {
}
    public void addColorOverride(DBVColorOverride color) {
        return getDescriptionColumns(attributes, descriptionColumnNames);
    void addVirtualAttribute(DBVEntityAttribute attribute, boolean reflect) {
            log.error("Can't obtain real entity's attributes", e);
            DBCLogicalOperator.EQUALS,

    public synchronized void addForeignKey(@NotNull DBVEntityForeignKey foreignKey) {
                this.entityConstraints.add(new DBVEntityConstraint(this, c));
        }
 * See the License for the specific language governing permissions and
    }
        Iterator<DBVEntityConstraint> iterator = entityConstraints.iterator();
        DBUtils.fireObjectUpdate(this, attribute);
        @Override
            return ((DBSDictionary) realEntity).getDictionaryAccessor(
    @Override
        @NotNull
    }
 * Virtual entity descriptor
        
            entityAttributes.add(attr);

            if (container instanceof DBVModel) {
        public boolean isKeyComparable() {
                    return true;
    private String descriptionColumnNames;

    public boolean hasValuableData() {
    }
            entityConstraints = new ArrayList<>();
            for (DBVEntityForeignKey fk : this.entityForeignKeys) {
                for (String attrName : JSONUtils.deserializeStringList(consMap, "attributes")) {
        if (realEntity instanceof DBSDictionary) {
        if (!CommonUtils.isEmpty(entityConstraints)) {
        }
import java.util.*;
            }
        boolean sortAsc,
        }
     *   <li>it has at least one attribute or uses all columns</li>
            if (CommonUtils.isEmpty(entityId)) {

        }
    public String toString() {
            return Collections.emptyList();
            entityConstraints.add(constraint);
        super.copyFrom(src);
                offset,
        return null;
        int maxResults


            Map<String, Object> consMap = consObject.getValue();
    }
    @Override

            long offset,
        }
            );
                    result.add(attr);
     * </ul>
            return Collections.emptyList();
    public DBVEntityConstraint getBestIdentifier() {
    @NotNull
        this.name = name;
            DBUtils.fireObjectUpdate(this, constraint);
        int offset,
        "display",
    public void addVirtualAttribute(DBVEntityAttribute attribute) {

    };
        return CommonUtils.splitString(store.getString(ModelPreferences.RESULT_REFERENCE_DESCRIPTION_COLUMN_PATTERNS), '|');
        ) {
    @NotNull

        @Override
/**

        return entityForeignKeys != null ? entityForeignKeys : Collections.emptyList();
    public void setDescription(String description) {

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        return Collections.emptyList();
        this.description = description;
            entityConstraints.add(new DBVEntityConstraint(
        final DBVColorOverride co = new DBVColorOverride(
            return DBUtils.getQuotedIdentifier(keyColumn);
        "email",
                    topAttribute = nextAttribute;
        }
    }
            entityForeignKeys.remove(foreignKey);
    public void removeColorOverride(DBDAttributeBinding attribute) {
    public void removeConstraint(DBVEntityConstraint constraint) {
 * You may obtain a copy of the License at
            }
            //String consType = JSONUtils.getString(consMap, "type");
        final DBSEntity realEntity = getRealEntity(monitor);
        }
    private static final DBSDictionaryAccessor emptyDictionaryAccessor = new DBSDictionaryAccessor() {
    @NotNull
            curColor.setColorForeground2(JSONUtils.getString(colorObj, "foreground2"));
                this,
        }
        "label",
        this.container = container;
            }
    public DBVContainer getContainer() {
                sortByDesc
    public String getName() {
    };
            String refConsId = JSONUtils.getString(fkObject, "constraint");
            final List<? extends DBSEntityAttribute> realAttributes = realEntity.getAttributes(monitor);

        if (!CommonUtils.isEmpty(entityAttributes)) {
    }
        this.name = src.name;
            if (entityAttributes == null) {
            fk.setReferencedConstraint(entityId, refConsId);
        // No columns match pattern
                            log.debug("Can't find nested attribute '" + binding + "' in '" + topAttribute.getName());
            }
        }
        //Avoid duplicates and keep the most complete version.
                    }
    }
        }
            !CommonUtils.isEmpty(colorOverrides))
                    return attr;
    public DBSEntity getRealEntity(@NotNull DBRProgressMonitor monitor) throws DBException {
            for (String strValue : JSONUtils.deserializeStringList(colorObj, "values")) {
                return constraint;
import org.jkiss.dbeaver.ModelPreferences;
        "displayname",
                DBVEntityForeignKey fkCopy = new DBVEntityForeignKey(this, fk, targetModel);
            }
        @Override

    @Override
            Object value, boolean isPreceeding, 
    @Override
                curColor.addAttributeValue(strValue);
        @Nullable Object keyPattern,
            long maxResults
                stringColumns.put(column.getName(), column);
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
        @NotNull DBRProgressMonitor monitor,
        DBSObject realObject = realContainer.getChild(monitor, name);
            return null;
    public static boolean isComplete(@NotNull DBVEntityConstraint constraint) {
            DBUtils.fireObjectUpdate(this, constraint);
    @Nullable
        return false;
            }
            addColorOverride(curColor);

                    (column.getMaxLength() < MAX_DESC_COLUMN_LENGTH &&
                restColumns,
                name = DBUtils.getUnQuotedIdentifier(dataSource, name);
        if (!CommonUtils.isEmpty(entityForeignKeys)) {
                monitor,
        @NotNull DBSEntityAttribute keyColumn,
        if (entityConstraints != null) {

                }
    }
                List<DBVEntityAttribute> customAttributes = getCustomAttributes();
                    fk.getRealReferenceConstraint(monitor);
    public DBSEntityType getEntityType() {
            new Object[]{value},
            return;
    }
    public String getDescription() {
    public List<DBDLabelValuePair> getDictionaryEnumeration(
        if (stringColumns.isEmpty()) {
            for (DBVEntityAttribute attr : entityAttributes) {
            boolean isPreceeding,
        } else {
            }
            }
                        return DBUtils.getQuotedIdentifier(stringColumns.get(columnName));
            }
                            topAttribute.addChild(nextAttribute);
    /**
            for (DBVEntityForeignKey  fk : entityForeignKeys) {
        ) {

        final DBSEntity realEntity = getRealEntity(monitor);
            for (DBVEntityForeignKey fk : entityForeignKeys) {
        if (realEntity != null) {
            for (String pattern : getDescriptionColumnPatterns(keyColumn.getDataSource().getContainer().getPreferenceStore())) {

    @NotNull
        @NotNull
        log.warn("Entity '" + name + "' not found in '" + realContainer.getName() + "'");
import org.jkiss.dbeaver.model.data.DBDLabelValuePair;
                }
            return Collections.emptyList();
        ) {
    }
                if (c.hasAttributes()) {
    public synchronized void dispose() {
        @Nullable List<DBDAttributeValue> restColumns,
        }
            colorOverrides = new ArrayList<>();
            return null;
        if (colorOverrides == null) {
    }
            for (DBVEntityAttribute attr : entityAttributes) {
        if (reflect) {
    }
    public DBSDictionaryAccessor getDictionaryAccessor(
    public void removeVirtualAttribute(DBVEntityAttribute attribute) {
                }
            }
    public static String getDefaultDescriptionColumn(DBRProgressMonitor monitor, DBSEntityAttribute keyColumn) throws DBException {
    public DBVEntityAttribute getVirtualAttribute(DBDAttributeBinding binding, boolean create) {
                fk.dispose();
import org.jkiss.code.NotNull;
    public List<DBVEntityAttribute> getEntityAttributes() {
    }
public class DBVEntity extends DBVObject implements DBSEntity, DBPQualifiedObject, DBSDictionary, DBPAdaptable {
            if (entityConstraints == null) entityConstraints = new ArrayList<>();
                if (attr.hasValuableData()) {
    DBVEntity(@NotNull DBVContainer container, @NotNull String name, @NotNull Map<String, Object> map) {
        } else {
            if (isComplete(constraint)) {
                DBCLogicalOperator.valueOf(JSONUtils.getString(colorObj, "operator")),
    public List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        final String attrName = attribute.getName();
        }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");


        return DBSEntityType.VIRTUAL_ENTITY;
            List<DBVEntityAttribute> result = null;
        }
        }
 * Unless required by applicable law or agreed to in writing, software
        this.colorOverrides = colorOverrides;
    public synchronized List<DBVEntityForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (entityForeignKeys != null) {
            for (DBVEntityConstraint c : src.entityConstraints) {
    }
    public static <T extends DBSAttributeBase> Collection<T> getDescriptionColumns(
 */
                this.entityAttributes.add(new DBVEntityAttribute(this, null, attribute));
            // Make some tests
        return null;
                "VIRTUAL_PK"));
            }
 * limitations under the License.

        throw new IllegalStateException("Root container must be model");
            entityForeignKeys = new ArrayList<>();
                }
            }
        throws DBException {
        entityForeignKeys.add(foreignKey);
        if (colorOverrides == null) {
                iterator.remove();
            entityForeignKeys.add(fk);
        return null;

            colorOverrides = new ArrayList<>();
        if (!CommonUtils.isEmpty(src.colorOverrides)) {
    @NotNull
        @NotNull
    @Override
    private List<DBVEntityAttribute> entityAttributes;
        if (allColumns.size() == 1) {
        boolean caseInsensitiveSearch,
            return ((DBSDictionary) realEntity).getDictionaryEnumeration(
        for (DBVEntityConstraint constraint : entityConstraints) {
        @Nullable Collection<? extends T> attributes,
                fk.getRealReferenceConstraint(monitor);

    @Nullable

        this.container = container;
    @NotNull
                attrs.add(new DBVEntityForeignKeyColumn(fk, attr.getKey(), (String) attr.getValue()));
    }
     * @param constraint the virtual entity constraint to check
        StringTokenizer st = new StringTokenizer(descColumns, ",");
    }
        }
                    return false;
    @NotNull
            this.colorOverrides = null;
        }
            entityAttributes = new ArrayList<>();
    }

    }
                entityAttributes.add(topAttribute);
            Map<String, Object> attrMap = JSONUtils.getObject(fkObject, "attributes");
    public List<DBVColorOverride> getColorOverrides() {
        }
        @NotNull
        }
    private static boolean matchesName(@NotNull DBSAttributeBase attribute, @NotNull String name) {
        if (attribute instanceof DBSObject) {
    public boolean addConstraint(@NotNull DBVEntityConstraint constraint, boolean reflect) {
        }
        return container;
        }
            DBVEntityConstraint existing = iterator.next();
                    result.add(attr);
        return true;
        }
    }
            if (!useAllColumns) {
        }
    private String name;

    public List<DBDLabelValuePair> getDictionaryValues(@NotNull DBRProgressMonitor monitor, @NotNull List<DBSEntityAttribute> keyColumns, @NotNull List<Object[]> keyValues, @Nullable List<DBDAttributeValue[]> preceedingKeys, boolean sortByValue, boolean sortAsc, boolean omitNonDescriptive) throws DBException {
    @Nullable


        }
        }
    public synchronized void removeForeignKey(@NotNull DBVEntityForeignKey foreignKey) {
                return realAttributes;
                if (CommonUtils.equalObjects(attrName, co.getAttributeName())) {
                    this.entityForeignKeys.add(fkCopy);
            this);
            Collections.emptyList();
            return Collections.emptyList();
        colorOverrides.removeIf(c -> c.getAttributeName().equals(attrName));
            return entity;
            );
            }
        this.name = name;
    }
    }
            final DBPDataSource dataSource = ((DBSObject) attribute).getDataSource();
    private static final int MIN_DESC_COLUMN_LENGTH = 4;
            DBSObject[] path = DBUtils.getObjectPath(binding, true);
        }
    @Override
            entityConstraints.remove(constraint);
                    return true;
        public DBRProgressMonitor getProgressMonitor() {

        } else {
                    return allAttrs;
    @Override
                } else {
            foreignKey.dispose();
        "remark",
    @NotNull
    public boolean supportsDictionaryEnumeration() {
        }
        return descriptionColumnNames;
        public List<DBDLabelValuePair> getSimilarValues(
    public synchronized List<DBVEntityForeignKey> getForeignKeys() {
    @Override
        }
        Collection<? extends DBSEntityAttribute> allColumns = keyColumn.getParentObject().getAttributes(monitor);
                for (DBVEntityForeignKey fk : entityForeignKeys) {
            this.colorOverrides = new ArrayList<>(src.colorOverrides.size());
        }
        }
        if (realContainer == null) {
        if (!CommonUtils.isEmpty(descriptionColumnNames) ||
 *
        }

    }
    }

        entityConstraints.add(constraint);
import org.jkiss.dbeaver.DBException;

                    allAttrs.addAll(customAttributes);
    ) throws DBException {
        colorOverrides.add(co);
    public String getDescriptionColumnNames() {
                }
                }
     * @return {@code true} if the constraint is unique and structurally complete


    private List<DBVColorOverride> colorOverrides;
        }
        if (CommonUtils.isEmpty(descColumns) || CommonUtils.isEmpty(attributes)) {
        public List<DBDLabelValuePair> getSimilarValuesNear(
        for (DBVContainer container = getContainer(); container != null; container = container.getParentObject()) {
                }
                JSONUtils.getString(colorObj, "background")
                keyPattern,
        if (entityAttributes != null || create) {
            }
        }
        }
        return name;
    }
            }
                continue;

        boolean sortByDesc
    }
            for (DBVEntityAttribute attr : entityAttributes) {
    @Nullable
        return DBUtils.getQuotedIdentifier(stringColumns.values().iterator().next());
    }
            return DBUtils.findObject(getAttributes(monitor), attributeName);
            String consName = consObject.getKey();
            }
        return entityConstraints == null ? Collections.emptyList() : entityConstraints;
            if (entityAttributes == null) entityAttributes = new ArrayList<>();
            }
 *
    @Override
            for (DBVColorOverride co : colorOverrides) {
        if (!CommonUtils.isEmpty(entityAttributes)) {
            DBVColorOverride curColor = new DBVColorOverride(

            dictionary.getDictionaryValues(monitor, keyColumns, keyValues, preceedingKeys, sortByValue, sortAsc, false) :
            }
    @NotNull
    public void removeColorOverride(DBVColorOverride co) {
    @Override
    @Override


    }
            String attrName = attrObject.getKey();
    }
        this.name = newName;
                        if (create) {
        return result;
    }
        if (colorOverrides == null) {
                caseInsensitiveSearch,
            }
        // Constraints
    }
            for (DBVEntityAttribute attribute : src.entityAttributes) {
    }
        }
    }
        if (!CommonUtils.isEmpty(entityAttributes)) {

            }
    public List<DBVColorOverride> getColorOverrides(String attrName) {

            if (column != keyColumn &&
        return constraint.getConstraintType().isUnique()
    }
        public List<DBDLabelValuePair> getValuesNear(
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (this.entityForeignKeys != null) {
            if (entityForeignKeys == null) {
            for (Map.Entry<String, Object> attr : attrMap.entrySet()) {
                return result;

        return description;
        for (Map<String, Object> fkObject : JSONUtils.getObjectList(map, "foreign-keys")) {
            if (!CommonUtils.isEmpty(realAttributes)) {
        }

            !CommonUtils.isEmpty(entityForeignKeys) ||
import org.jkiss.code.Nullable;
        @NotNull String descColumns
    public DBVModel getModel() {
                }
                entityForeignKeys = new ArrayList<>();
        // Attributes
            constraint.setUseAllColumns(useAllColumns);
        @Override

                if (isComplete(existing)) {
     *
    public boolean addConstraint(@NotNull DBVEntityConstraint constraint) {
        public List<DBDLabelValuePair> getValueEntry(@NotNull Object keyValue) {
        if (entityConstraints.isEmpty()) {
     *

    }
    }
        this.descriptionColumnNames = descriptionColumnNames;
        if (entityConstraints == null) {
        if (entityAttributes == null) {
        // Find all string columns
                }
                    log.debug("Can't copy virtual foreign key '" + fk.getName() + "' - target entity cannot be resolved");
                }

            curColor.setColorBackground2(JSONUtils.getString(colorObj, "background2"));
    public List<DBVEntityConstraint> getConstraints() {
                null,
    private List<DBVEntityConstraint> entityConstraints;
            }
            boolean byDesc,

    @Override
    }
                    column.getMaxLength() >= MIN_DESC_COLUMN_LENGTH))) {

        entityAttributes.remove(attribute);
            String entityId = JSONUtils.getString(fkObject, "entity");
    @Override
        }
        boolean sortByValue,
        return entityConstraints.getFirst();
        } else {
        }
        this.descriptionColumnNames = src.descriptionColumnNames;


    }
                if (fkCopy.getRefEntityId() == null) {
            for (T attr : attributes) {
                if (matchesName(attr, colName)) {
    public Collection<? extends DBVEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
                keyColumn,
    @Override

    }
    }

            return Collections.emptyList();
        } catch (DBException e) {
                topAttribute = new DBVEntityAttribute(this, null, path[0].getName());
    }
    }
        "title",
        }
                entityAttributes = new ArrayList<>();
            entityConstraints = new ArrayList<>();
    }
        while (iterator.hasNext()) {
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            long maxResults
            if (dataSource != null) {
                JSONUtils.getString(colorObj, "name"),
        }
        } else {
    @NotNull
            this.entityAttributes = new ArrayList<>(src.entityAttributes.size());
        if (entityConstraints == null) {


    public static Collection<DBSEntityAttribute> getDescriptionColumns(

        if (colorOverrides != null) {
     * @see org.jkiss.dbeaver.model.data.DBDRowIdentifier#isIncomplete()
import org.jkiss.dbeaver.model.data.json.JSONUtils;
                        }
        if (colorOverrides == null) {
