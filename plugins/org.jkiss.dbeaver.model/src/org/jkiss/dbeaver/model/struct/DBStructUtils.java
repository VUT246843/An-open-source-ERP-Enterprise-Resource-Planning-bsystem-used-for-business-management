import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
                if (targetTypeName != null) {
 * Unless required by applicable law or agreed to in writing, software

                    addDDLLine(sql, DBStructUtils.getTableDDL(monitor, table, optionsOnlyFK, addComments));
    private static void addDDLLine(StringBuilder sql, String ddl) {
            log.debug("Error reading foreign key associations for column: " + column.getName(), e);
                    addDDLLine(sql, DBStructUtils.getTableDDL(monitor, table, optionsNoFK, addComments));
                    targetType = possibleTypes.values().iterator().next();
        DBRProgressMonitor proxyMonitor = new SubTaskProgressMonitor(monitor);
            } else if (VARCHAR_DATA_TYPE.equals(typeNameLower) || VARCHAR2_DATA_TYPE.equals(typeNameLower)) {
     * Get name of the attribute
    public static String getTableDDL(

                var associations = DBVUtils.getAllAssociations(monitor, mainEntity);
        }
                // VARCHAR2 - is a special Oracle and Oracle-based databases case.
                if (targetType == null && !possibleTypes.isEmpty()) {
        }
    public static String getObjectSchema(@NotNull DBSObject dbsObject) {
            } catch (DBException e) {
                return parent.getName();
                                // Ok, probably we do not have int/integer types, let's find something similar

            return Stream.empty();
            } catch (DBException e) {
                        }
                return parent.getName();
                            {
            }
            try {

        DBStructUtils.sortTableList(monitor, tablesOrViews, goodTableList, cycleTableList, viewList);
                                for (Map.Entry<String, DBSDataType> type : possibleTypes.entrySet()) {
 * You may obtain a copy of the License at
                                    ? possibleTypes.get(INTEGER_DATA_TYPE) : possibleTypes.get(INT_DATA_TYPE);
            return false;
                }
        }
    public static boolean isPrimaryKey(@NotNull DBSTableColumn column) {
        if (refs == null || refs.isEmpty()) {
import org.jkiss.dbeaver.utils.GeneralUtils;
                for (T table : goodCycleTableList) {
        } else if (dbsObject instanceof DBSObjectContainer container) {
            }
            return Stream.empty();
        final SQLObjectEditor entityEditor = editorsRegistry.getObjectManager(object.getClass(), SQLObjectEditor.class);
                            {
            );

        @Nullable DBRProgressMonitor monitor,
     */
            return "";
            );
    @NotNull
                T table = iterator.next();
     * @param attribute to get name of
                for (var child : children) {
        boolean refsFound = true;
        @NotNull StringBuilder sql,
    /**
                }
                    targetType = possibleTypes.get(typeNameLower);

                }
        } catch (DBException e) {
    }
import org.jkiss.code.NotNull;
    @NotNull
    private static String getObjectNameComment(@NotNull DBSObject object, @NotNull String comment) {
        }
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLTableManager;
    public static String getAttributeName(@NotNull DBSAttributeBase attribute) {


import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

        };
        }
            }
        log.debug("Table editor not found for " + table.getClass().getName());
import java.util.stream.Stream;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
                DBPDataSource srcDataSource = dbsObject.getDataSource();
                                        targetType = possibleTypes.get(psn);
                        }
     */
        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();
        }
            return false;
                }
                sql.append(objectNameComment);
                                (srcTypedObject.getScale() != null && srcTypedObject.getScale() > 0 && srcTypedObject.getScale() <= 6))

     */
                    if (associatedEntity != null) {
                }
    }
        return DBUtils.isPseudoAttribute(attribute)

                                    if (type.getKey().endsWith(TEXT_DATA_TYPE) && type.getValue().getDataKind() == DBPDataKind.STRING) {
                            {
                                }
                        iterator.remove();
        return null;
        Map<String, Object> options,
            if (associatedEntity instanceof DBSDictionary dictionary) {
            return association.getAssociatedEntity();
        cyclicTables.addAll(realTables);
    }

            if (dataType == null && typeName.contains("(")) {
                    contextDefaults.supportsSchemaChange() || contextDefaults.supportsCatalogChange()
            if (parent instanceof DBSSchema) {

 */
            if (dataType != null && !DBPDataKind.canConsume(dataKind, dataType.getDataKind())) {
            } else {
            sql.append(getObjectNameComment(table, ModelMessages.struct_utils_object_ddl_definition));
                referrers(column.getParentObject().getAssociations(monitor), DBSEntityConstraintType.FOREIGN_KEY)
            for (T table : cycleTableList) {
        boolean addComments
            return SQLUtils.generateScript(object.getDataSource(), ddlActions, addComments);
                if (!possibleTypes.isEmpty()) {
    }
        // Get type modifiers from target datasource
            sql.append(ddl);
    }
                    table instanceof DBPScriptObjectExt2 so2 &&

import org.jkiss.code.Nullable;
    private static final String INT_DATA_TYPE = "int";
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (dataSource == null) {
                return srcTypedObject.getFullTypeName();
        monitor.done();
        if (constraint != null) {
                try {
    public static String mapTargetDataType(
            sql.append(lf).append(lf).append(lf);
    public static DBSEntity getAssociatedEntity(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityConstraint constraint) throws DBException {
        return false;
            // We can't use entity attr because only particular query metadata contains real structure
                monitor,
        if (entityEditor instanceof SQLTableManager tableManager) {
        var monitor = new VoidProgressMonitor();
 * See the License for the specific language governing permissions and
                        result.add(resultChild);
        return getAttributeName(attribute, DBPAttributeReferencePurpose.UNSPECIFIED);
            }
    ) {
            addDDLLine(sql, DBStructUtils.getTableDDL(monitor, table, options, addComments));
        return refs.stream()
        if (dataTypeProvider != null) {
                    return targetTypeName;
            return dbsObject.getName();
                    typeName = DBUtils.getDefaultDataTypeName(objectContainer, dataKind);
                if (targetType == null) {
                            // Like "longtext", "ntext", "mediumtext".

                    sql.append(getObjectNameComment(table, ModelMessages.struct_utils_object_ddl_definition));
        while (parent != null) {
                );
                    }
                                }
import org.jkiss.dbeaver.DBException;
            .flatMap(ref -> safeRefs(monitor, ref))
                        monitor.worked(1);

                                || (INTEGER_DATA_TYPE.equals(typeNameLower) && possibleTypes.get(INT_DATA_TYPE) != null))
                } catch (DBException e) {
    }
    }
        for (T entity : input) {
            SQLDataTypeConverter dataTypeConverter = objectContainer == null || objectContainer.getDataSource() == null ? null :
                            break;
                if (typeName.equalsIgnoreCase(dataType.getTypeName())) {
        DBPDataSource dataSource = object.getDataSource();
                attribute = entityAttribute;
                    }
    @Nullable
                typeName += modifiers;
                DBUtils.getAdapter(SQLDataTypeConverter.class, objectContainer.getDataSource().getSQLDialect());
                                        targetType = type.getValue();
import org.jkiss.dbeaver.model.sql.SQLUtils;
        {
        // Do not quote pseudo attribute name
                    typeName = dataType.getTypeName();
    }
    }
                    srcDataSource.getSQLDialect(),
import org.jkiss.dbeaver.model.sql.SQLDialect;
                }
                if (CommonUtils.isEmpty(table.getAssociations(proxyMonitor))) {

        }
        List<T> realTables = new ArrayList<>();
                    sql.append(getObjectNameComment(table, ModelMessages.struct_utils_object_ddl_definition));
import org.jkiss.dbeaver.model.runtime.SubTaskProgressMonitor;
        }
        DBPDataTypeProvider dataTypeProvider = DBUtils.getParentOfType(DBPDataTypeProvider.class, objectContainer);
        List<T> cycleTableList = new ArrayList<>();
                // It seems this data type has modifiers. Try to find without modifiers
            }
        @NotNull DBSTableColumn column,
        return null;

    /**
    ) {
 * limitations under the License.
        @NotNull DBSEntityReferrer ref

        // 4. The rest is cycled tables
        {
            }
                            } else if ((INT_DATA_TYPE.equals(typeNameLower) && possibleTypes.get(INTEGER_DATA_TYPE) != null)
        if (objectContainer != null && (srcTypedObject instanceof DBSEntityAttribute || isBindingWithEntityAttr || (

 * DBeaver - Universal Database Manager
    public static List<DBSObject> getRelatedDBSEntities(
        return singleLineComments[0].trim() + " " + DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL) +
        String[] singleLineComments = dataSource.getSQLDialect().getSingleLineComments();


 *
        monitor.done();
                }
            }
        }
            result.add(mainEntity);
    }
    }
                if (monitor.isCanceled()) {
                    typeName = dataType.getTypeName();
package org.jkiss.dbeaver.model.struct;
                                        break;
        @NotNull DBSTypedObject srcTypedObject,
 * you may not use this file except in compliance with the License.
    public static String getAttributeName(@NotNull DBSAttributeBase attribute, DBPAttributeReferencePurpose purpose) {
    }
            assert tgtDataSource != null;
                var parent = ref.getParentObject();
            DBSEntityAttribute entityAttribute = bindingMeta.getEntityAttribute();
                                typeNameLower.contains(REAL_DATA_TYPE) ||
                log.warn("Can't load associations for " + mainEntity.getName(), e);
            parent = parent.getParentObject();
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
            List<T> goodCycleTableList = new ArrayList<>();
    }
        if (constraint instanceof DBSEntityAssociationLazy associationLazy) {
            log.debug("Error reading primary key constraints for column: " + column.getName(), e);

                            // Search data types ending with "text" for the source data type including "text".
import org.jkiss.dbeaver.model.sql.SQLDataTypeConverter;
        List<T> viewList = new ArrayList<>();
            if (monitor.isCanceled()) {
        }
                sql.append(getObjectNameComment(table, ModelMessages.struct_utils_object_ddl_definition));
                    if (!possibleTypes.isEmpty()) {
                        // Try to find appropriate type with the same scale/precision
    /**
    ) throws DBException {
    public static String generateObjectDDL(@NotNull DBRProgressMonitor monitor, @NotNull DBSObject object, Map<String, Object> options, boolean addComments) throws DBException {
                result.add(parent);
            return associationLazy.getAssociatedEntity(monitor);
            // the rest - tables which can't split their DDL
    public static String generateTableDDL(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity table, Map<String, Object> options, boolean addComments) throws DBException {
/*
     * @param purpose of the name usage
 *
        }
                                for (String psn : possibleTypes.keySet()) {
                    }
        @Nullable DBSObject objectContainer,

                for (T table : goodCycleTableList) {
                    if (DBPDataKind.canConsume(type.getDataKind(), dataKind)) {
            if (dataType == null) {
                if (
                                CommonUtils.equalObjects(type.getPrecision(), srcTypedObject.getPrecision()))
            monitor.worked(1);
        @Nullable Collection<? extends DBSEntityConstraint> refs,
            if (children != null) {
            }
        @NotNull DBSObject dbsObject
    /**
            try {
     * Retrieves the catalog name associated with the provided database object.
                for (T table : goodCycleTableList) {
                                        break;
            }
                column,
                    typeNameLower = typeName.toLowerCase(Locale.ENGLISH);
            if (!CommonUtils.getOption(options, DBPScriptObject.OPTION_DDL_SEPARATE_FOREIGN_KEYS_STATEMENTS, true)) {
                    typeName = targetType.getTypeName();
import org.jkiss.dbeaver.model.messages.ModelMessages;
                }
                // Let's try to find something similar

                    var associatedEntity = assoc.getAssociatedEntity();
        DBPDataKind dataKind = srcTypedObject.getDataKind();
        }

            .anyMatch(r -> r.getAttribute() == column);
import org.jkiss.utils.ArrayUtils;
        @NotNull DBSEntityConstraintType filter)  {
        @NotNull Stream<DBSEntityReferrer> referrers
        List<T> goodTableList = new ArrayList<>();
    }
        return SQLUtils.generateCommentLine(object.getDataSource(), "Can't generate DDL: object editor not found for " + object.getClass().getName());
            return matchesColumnInRefs(
    private static final String TEXT_DATA_TYPE = "text";
            " " + comment + lf + lf;
    ) throws DBException {
                            } else if (typeNameLower.contains(INT_DATA_TYPE)) {
        while (refsFound) {
        // Views: generate them after all tables.

}
                            // Other string data types can also be turned into the "text" data type if they have no length.
                        targetType = possibleTypes.get(typeNameLower);
            if (monitor.isCanceled()) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

            // For top-level query bindings we need to use table columns name instead of alias.
            // Entity attribute obtain commented because it broke complex attributes full name construction
     * @param attribute to get name of
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            // This doesn't work if table implementation doesn't support DDL restructure
                    }
                column,
        try {
        }
            DBPDataSource tgtDataSource = objectContainer.getDataSource();

            }
                                    if (psn.contains(DOUBLE_DATA_TYPE)) {
    ) throws DBException {
    private static final String REAL_DATA_TYPE = "real";
                                        break;
                sql.append(SQLConstants.DEFAULT_STATEMENT_DELIMITER);
                // Type not supported by target database

import org.jkiss.dbeaver.model.sql.SQLConstants;
            }
        final SQLObjectEditor<?, ?> entityEditor = editorsRegistry.getObjectManager(table.getClass(), SQLObjectEditor.class);
                optionsNoFK.put(DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS, true);
        var result = new LinkedHashSet<DBSObject>();
        }
                                    }

                if (targetType != null) {
                    if (allGood) {

        List<DBSEntityReferrer> refs = DBUtils.getAttributeReferrers(monitor, entityAttribute, true);
                    iterator.remove();
        return null;
        } catch (DBException e) {
                        if (refEntity == null || (!simpleTables.contains(refEntity) && refEntity != table)) {
                addDDLLine(sql, DBStructUtils.getTableDDL(monitor, table, options, addComments));

                        possibleTypes.put(type.getTypeName().toLowerCase(Locale.ENGLISH), type);
                }
                            } else if (typeNameLower.contains(DOUBLE_DATA_TYPE) ||
        } else if (constraint instanceof DBSEntityAssociation association) {
        }
import org.jkiss.dbeaver.model.*;
        if (dbsObject instanceof DBSCatalog) {
                        }
import org.jkiss.dbeaver.model.edit.DBERegistry;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    private static boolean matchesColumnInRefs(
            for (var ref : references) {
        @NotNull DBRProgressMonitor monitor,
        DBSEntityAttribute entityAttribute = attribute.getEntityAttribute();
            if (parent instanceof DBSCatalog) {
    private static final int DEFAULT_VARCHAR_LENGTH = 100;
            }
                for (var assoc : associations) {
        if (addModifiers && objectContainer != null) {
                    log.error(e);
                return definitionText;
                    sql.append(getObjectNameComment(table, ModelMessages.struct_utils_object_ddl_foreign_keys));
                                    if (psn.contains(INT_DATA_TYPE)) {
                DBPDataSource tgtDataSource = objectContainer.getDataSource();
                // Type mismatch
            }
        // 1. Get tables without FKs
        }
            if (dataType == null && typeNameLower.equals(DOUBLE_DATA_TYPE)) {
            if (!ddl.endsWith(SQLConstants.DEFAULT_STATEMENT_DELIMITER)) {
                String targetTypeName = dataTypeConverter.convertExternalDataType(
    @Nullable
        for (T table : viewList) {
                for (DBSDataType type : dataTypeProvider.getLocalDataTypes()) {
        if (attribute instanceof DBDAttributeBindingMeta bindingMeta) {
    public static <T extends DBSEntity> void generateTableListDDL(
    private static final Log log = Log.getLog(DBStructUtils.class);
        } catch (DBException e) {
        // TODO: find view dependencies and generate them in right order
        @NotNull DBRProgressMonitor monitor,
        DBSObject parent = dbsObject;
    }
                            }
    @Nullable

                    for (DBSEntityAssociation ref : CommonUtils.safeCollection(table.getAssociations(proxyMonitor))) {
                isBindingWithEntityAttr = true;
            }
            return "";
            }
                    return true;
        DBCExecutionContext defaultContext = DBUtils.getDefaultContext(dataSourceContainer, false);
        }
                referrers(column.getParentObject().getConstraints(monitor), DBSEntityConstraintType.PRIMARY_KEY)
        if (!CommonUtils.isEmpty(ddl)) {
        for (Iterator<T> iterator = realTables.iterator(); iterator.hasNext(); ) {
        }
    @Nullable
                dataKind = dataType.getDataKind();
            SQLDialect dialect = dataSource.getSQLDialect();
        @NotNull Collection<T> tablesOrViews,
                    srcTypedObject, DBUtils.getAdapter(DBPDataTypeProvider.class, tgtDataSource)
    }
                }
            }
    }
        }
                                        targetType = possibleTypes.get(psn);
                    addDDLLine(sql, DBStructUtils.getTableDDL(monitor, table, options, addComments));
                optionsOnlyFK.put(DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS, true);
    private static final String DOUBLE_DATA_TYPE = "double";
                realTables.add(entity);
            log.debug("Failed to read attribute references for constraint: " + ref.getName(), e);
 *
                                }
            return SQLUtils.generateScript(table.getDataSource(), ddlActions, addComments);
                    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                srcTypedObject instanceof DBSObject dbsObject &&  objectContainer.getDataSource() == dbsObject.getDataSource()))) {
    public static boolean isSchemasSupported(@NotNull DBPDataSourceContainer dataSourceContainer) {
                                for (String psn : possibleTypes.keySet()) {
import org.jkiss.dbeaver.Log;
                    // Try to get any partial match
        return SQLUtils.generateCommentLine(table.getDataSource(), "Can't generate DDL: table editor not found for " + table.getClass().getName());
        if (entityEditor != null) {
                dataType = dataTypeProvider.getLocalDataType(SQLUtils.stripColumnTypeModifiers(typeName));
                    so2.supportsObjectDefinitionOption(DBPScriptObject.OPTION_DDL_ONLY_FOREIGN_KEYS))
            addDDLLine(sql, tableDDL);
                    }

                        for (DBSDataType type : possibleTypes.values()) {
            for (T table : cycleTableList) {
                }

            }
                }
                Map<String, DBSDataType> possibleTypes = new LinkedHashMap<>();
                        simpleTables.add(table);
        return generateTableDDL(monitor, table, options, addComments);
                DBSDataType targetType = null;

import java.util.*;
        }
                    if (targetType == null && dataKind == DBPDataKind.NUMERIC) {
            // Cycle tables: generate CREATE TABLE and CREATE FOREIGN KEY separately
                    boolean allGood = true;
     * Retrieves the schema name associated with the provided database object.
                }
        String lf = GeneralUtils.getDefaultLineSeparator();
        }
import org.jkiss.dbeaver.model.data.DBDAttributeBindingMeta;
                }
                log.debug(e);
                }
     * @return attribute name
        return null;
                                    }
    }
        }
 * DBUtils
        return typeName;
        }
            if (srcDataSource.getClass() == tgtDataSource.getClass() && addModifiers) {
            if (entityAttribute != null) {
    public static boolean isForeignKey(@NotNull DBSTableColumn column) {
                                targetType = type;

                    break;
 * Licensed under the Apache License, Version 2.0 (the "License");
                {
                }
                monitor,
    }
            if (attributeBinding.getEntityAttribute() != null) {
            // For nested attributes we should use aliases
                    simpleTables.add(table);
                }

            if (contextDefaults != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return matchesColumnInRefs(
                ) {
        if (dbsObject instanceof DBSEntity mainEntity) {
        return null;
                                        break;
            }
            .map(DBSEntityReferrer.class::cast);
        }
                                for (String psn : possibleTypes.keySet()) {
                    return constraint;

                        if (targetType == null) {
                            } else {
            if (!CommonUtils.isEmpty(definitionText)) {
        if (!dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_EXTRA_DDL_INFO)) {
     */
                }
                dataType = null;
    }
                            if (CommonUtils.equalObjects(type.getScale(), srcTypedObject.getScale()) &&
            DBSObject parent = dbsObject.getParentObject();
        String typeName = srcTypedObject.getTypeName();
            DBSEntity associatedEntity = getAssociatedEntity(monitor, constraint);
                            {
import org.jkiss.dbeaver.model.struct.rdb.*;
                                    }

                            }
            if (!tableDDL.startsWith(objectNameComment)) {

        }
            for (Iterator<T> iterator = realTables.iterator(); iterator.hasNext(); ) {
                            }
                if (dataType != null) {
            parent = parent.getParentObject();
                if (dictionary.supportsDictionaryEnumeration()) {
        }
                return parent.getName();
        if (table instanceof DBPScriptObject scriptObject) {
        if (srcTypedObject instanceof DBDAttributeBinding attributeBinding) {
        boolean isBindingWithEntityAttr = false;
            }
        }
            List<? extends DBSEntityAttributeRef> refs = ref.getAttributeReferences(monitor);
        Map<String, Object> options,
                if (dataType != null) {
    private static final String INTEGER_DATA_TYPE = "integer";
        }
                break;
                    }
    public static DBSEntityReferrer getEnumerableConstraint(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntityAttribute entityAttribute) throws DBException {
            } else {
            }
        @Nullable DBRProgressMonitor monitor,
        return referrers
     * @return attribute name
            }
                    int startPos = typeName.indexOf("(");
        @NotNull DBRProgressMonitor monitor,
            String tableDDL = DBStructUtils.getTableDDL(monitor, table, options, addComments);
            .filter(a -> a.getConstraintType() == filter)
            ? attribute.getName()
    public static DBSEntityReferrer getEnumerableConstraint(@NotNull DBRProgressMonitor monitor, @NotNull DBDAttributeBinding attribute) throws DBException {
                                // Let's use the closest int/integer synonym
            var references = DBVUtils.getAllReferences(monitor, mainEntity);
                            if (typeNameLower.contains(FLOAT_DATA_TYPE) ||
        var monitor = new VoidProgressMonitor();
        if (dbsObject instanceof DBSSchema) {
        return result.stream().toList();
                        result.add(associatedEntity);
    }

                    if (child instanceof DBSEntity resultChild) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
            String definitionText = scriptObject.getObjectDefinitionText(monitor, options);

        boolean addComments
                Map<String, Object> optionsNoFK = new HashMap<>(options);
        }
            }
import org.jkiss.dbeaver.ModelPreferences;
                                break;
            }
                Map<String, Object> optionsOnlyFK = new HashMap<>(options);
        return !(parent instanceof DBSInstanceLazy il) || il.isInstanceConnected();
            SQLObjectEditor.ObjectCreateCommand createCommand = entityEditor.makeCreateCommand(object, options);
            return refs == null ? Stream.empty() : refs.stream();
                            if (possibleTypes.containsKey(TEXT_DATA_TYPE)) {
    public static <T extends DBSEntity> void sortTableList(DBRProgressMonitor monitor, Collection<T> input, List<T> simpleTables, List<T> cyclicTables, List<T> views) throws DBException {
        @NotNull DBSEntity table,
            .filter(DBSEntityReferrer.class::isInstance)
                                }
                                (srcTypedObject.getScale() != null && srcTypedObject.getScale() > 0 && srcTypedObject.getScale() <= 15))

    private static final String FLOAT_DATA_TYPE = "float";
            }
            assert srcDataSource != null;
     * Get name of the attribute
            // Skip this step, then
        try {
import org.jkiss.utils.CommonUtils;
            if (dataType != null) {
            DBPDataSource srcDataSource = ((DBSObject) srcTypedObject).getDataSource();
            refsFound = false;
                                    }
    ) {
            }
        if (dbsObject instanceof DBSSchema) {

            if (modifiers != null) {
    private static final String VARCHAR2_DATA_TYPE = "varchar2";
        DBSObject parent = dbsObject;
            String modifiers = dialect.getColumnTypeModifiers(dataSource, srcTypedObject, typeName, dataKind);
                // Datatype caches ignore case, but we probably should use it with the original case

        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();
        // Good tables: generate full DDL
        boolean addModifiers
        String typeNameLower = typeName.toLowerCase(Locale.ENGLISH);
        }
            String objectNameComment = getObjectNameComment(table, ModelMessages.struct_utils_object_ddl_source);
                }
                    so2.supportsObjectDefinitionOption(DBPScriptObject.OPTION_DDL_SKIP_FOREIGN_KEYS) &&
    public static String getObjectCatalog(@NotNull DBSObject dbsObject) {
                                targetType = INT_DATA_TYPE.equals(typeNameLower)
        }
                        refsFound = true;
                        if (typeNameLower.contains(TEXT_DATA_TYPE) || srcTypedObject.getMaxLength() <= 0) {
                                targetType = possibleTypes.get(TEXT_DATA_TYPE);
            return dbsObject.getName();
                typeName += "(" + DEFAULT_VARCHAR_LENGTH + ")";
        ddl = ddl.trim();
        try {
                    } else if (targetType == null && dataKind == DBPDataKind.STRING) {
                // Default max length value for varchar column, because many databases do not support varchar without modifiers.
        DBSEntityReferrer constraint = refs.isEmpty() ? null : refs.get(0);
public final class DBStructUtils {
                        DBSEntity refEntity = ref.getAssociatedEntity();
            // If source and target datasources have the same type then just return the same type name
            DBEPersistAction[] ddlActions = tableManager.getTableDDL(monitor, table, options);
        if (ArrayUtils.isEmpty(singleLineComments)) {
            cycleTableList.removeAll(goodCycleTableList);
        for (T table : goodTableList) {
                            allGood = false;
    public static boolean isConnectedContainer(DBPObject parent) {
 */
                    goodCycleTableList.add(table);
        if (entityAttribute != null) {
                }
            DBCExecutionContextDefaults<?,?> contextDefaults = defaultContext.getContextDefaults();
            }
            : DBUtils.getObjectFullName(attribute, DBPEvaluationContext.DML);

    private static final String VARCHAR_DATA_TYPE = "varchar";
            if (parent instanceof DBSCatalog) {
                    typeName = dataType + typeName.substring(startPos);

                if (contextDefaults.getDefaultSchema() != null || contextDefaults.getDefaultCatalog() != null ||
            var children = container.getChildren(monitor);
                dataType = dataTypeProvider.getLocalDataType("DOUBLE PRECISION");
    }
                assert srcDataSource != null;
        monitor.beginTask("Sorting table list", input.size());
                                        targetType = possibleTypes.get(psn);
            DBSDataType dataType = dataTypeProvider.getLocalDataType(typeName);
                break;
            }

        log.debug("Object editor not found for " + object.getClass().getName());
                views.add(entity);
            T table = iterator.next();
            return "";
        // 3. Repeat p.2 until something is found
            DBPDataSource dataSource = objectContainer.getDataSource();
            if (dataTypeConverter != null && srcTypedObject instanceof DBSObject dbsObject) {
            String lf = GeneralUtils.getDefaultLineSeparator();
    @Nullable
            if (entity instanceof DBSView || (entity instanceof DBSTable table && table.isView())) {
    private static Stream<? extends DBSEntityAttributeRef> safeRefs(
    private static Stream<DBSEntityReferrer> referrers(
                                    if (psn.contains(FLOAT_DATA_TYPE) || psn.contains(REAL_DATA_TYPE)) {
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        // 2. Get tables referring tables from p.1 only
                        }
            DBEPersistAction[] ddlActions = createCommand.getPersistActions(monitor, DBUtils.getDefaultContext(object, true), options);
        if (defaultContext != null) {
            return getEnumerableConstraint(monitor, entityAttribute);

        while (parent != null) {
