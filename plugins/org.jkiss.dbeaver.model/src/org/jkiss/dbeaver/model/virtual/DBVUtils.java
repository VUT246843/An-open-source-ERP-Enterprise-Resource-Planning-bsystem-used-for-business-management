                if (realEntity != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            return vEntity.getCustomAttributes();
 */
            }
        if (dataContainer instanceof DBSEntity) {
        while (dbResult.nextRow()) {
        DBVEntity vEntity = getVirtualEntity(entity, false);
        @NotNull List<DBDValueHandler> valueHandlers,
        List<DBSEntityConstraint> result = new ArrayList<>();
        return tdList
                    for (int i = 0; i < attributes.size(); i++) {
        List<DBDAttributeTransformer> savedTransformers = findBindingTransformers(binding, custom);
    public static DBVEntity getVirtualEntity(@NotNull DBSEntity source, boolean create)
            long keyCount = 0;

        try {
        }
        }
                    "");
        }
            }
            if (tdList.isEmpty()) {
    }
        DBSObject dataContainer = null;

        return dataSource == null ? null : dataSource.getContainer().getVirtualModel().findObject(source, create);
import org.jkiss.dbeaver.model.struct.*;
/*
        if (entity instanceof DBVEntity vEntity) {
        List<DBSEntityAttribute> result = new ArrayList<>();
            if (!CommonUtils.isEmpty(vAttributes)) {
 * limitations under the License.
            DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(binding, create);
                    Object descValue = colHandlers.get(i).fetchValueObject(session, dbResult, metaColumns.get(i), i);
                    }
        }
    public static List<DBDLabelValuePair> readDictionaryRows(
            for (int i = 0; i < valueAttributes.size(); i++) {
            vEntity = getVirtualEntity(binding.getDataContainer(), create);
import org.jkiss.dbeaver.model.DBPDataSource;
        String columnDivider = session.getDataSource().getContainer().getPreferenceStore().getString(ModelPreferences.DICTIONARY_COLUMN_DIVIDER);
    public static List<DBSEntityAssociation> getAllAssociations(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity)
        }
        if (dataContainer instanceof IAdaptable) {
        }
    @NotNull
import org.apache.commons.jexl3.JexlBuilder;
    public static DBVTransformSettings getTransformSettings(@NotNull DBVEntityAttribute attribute, boolean create) {
            if (dataSource == null) {
        }
    }
            }
            String keyLabel;
        if (DBUtils.isDynamicAttribute(binding.getAttribute()) && (binding.getParentObject() == null || binding.getParentObject().getDataKind() != DBPDataKind.DOCUMENT)) {
        if (!(entity instanceof DBVEntity)) {

import org.jkiss.dbeaver.model.exec.DBCException;
        if (source == null) {

        DBPDataSource dataSource = source.getDataSource();
import org.jkiss.dbeaver.model.exec.DBCResultSet;
                Object keyValue = valueHandlers.get(i).fetchValueObject(session, dbResult, valueAttributes.get(i), i);
                result.addAll(vConstraints);
            if (vEntity == null && create) {
                }
        if (attribute.getTransformSettings() != null) {
            final DBVTransformSettings transformSettings = getTransformSettings(binding, false);
    @NotNull
        } catch (DBException e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        List<? extends DBDAttributeTransformerDescriptor> tdList =
            List<DBVEntityForeignKey> globalRefs = DBVModel.getGlobalReferences(entityNode);
package org.jkiss.dbeaver.model.virtual;
            if (implClass != null) {
            } else {
        String exprString = attribute.getExpression();
        return Collections.emptyList();
    }
        }
    static Map<String, Object> getExpressionNamespaces() {
 * Virtual model serialize
        @NotNull DBCSession session,
            return List.of();
        }
    @NotNull
                        continue;
        }
        JexlBuilder jexlBuilder = new JexlBuilder();
        return vEntity;
            return expression.evaluate(new DBVDataContext(dataContainer, allAttributes, row, attributeName));
                    keyLabel2.append(colHandlers.get(i).getValueDisplayString(
            if (object.getTransformSettings() != null) {
                if (DBUtils.isNullValue(keyValue)) {
        }
        return entity;
            if (nestedDC != null) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        String attrKey = DBUtils.getObjectFullId(dataContainer);
}
                log.error("Can't get real entity from virtual entity", e);
            return GeneralUtils.getExpressionParseMessage(e);
        jexlBuilder.namespaces(nsList);
import org.jkiss.utils.CommonUtils;
            }
        final Collection<? extends DBSEntityConstraint> realConstraints = entity.getConstraints(monitor);
        List<? extends DBCAttributeMetaData> metaColumns = dbResult.getMeta().getAttributes();
                DBSEntity realEntity = vEntity.getRealEntity(new VoidProgressMonitor());
                if (formatValues && keyValue instanceof Date) {
    public static List<DBSEntityConstraint> getAllConstraints(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity) throws DBException {
    }

        if (!CommonUtils.isEmpty(realConstraints)) {
                    }
            DBPDataSource dataSource = dataContainer.getDataSource();
        return dataSource == null ? null : dataSource.getContainer().getVirtualModel().findEntity(source, create);
        try {
        try {
 *
        return null;
        final Collection<? extends DBSEntityAttribute> realAttributes = entity.getAttributes(monitor);
            result.addAll(realConstraints);
        if (entity instanceof DBVEntity) {
        }

                    }
        }
        }
            attribute.setTransformSettings(new DBVTransformSettings());
            }
    private static final Log log = Log.getLog(DBVUtils.class);
                    boolean matches = true;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static DBSEntity tryGetRealEntity(@NotNull DBSEntity entity) {
        List<DBSEntityAssociation> result = new ArrayList<>();
                    dataSource.getContainer().getVirtualModel(),
            DBWorkbench.getPlatform().getValueHandlerRegistry().findTransformers(dataSource, binding.getAttribute(), custom);

    public static List<DBDAttributeTransformer> findBindingTransformers(@NotNull DBDAttributeBinding binding, @Nullable Boolean custom) {
        }
        if (source instanceof DBVEntity) {

                orphanVirtualEntities.put(attrKey, vEntity);
    }
            throws DBException {
        }
    }
                keyValues[i] = keyValue;
            boolean filtered = false;
            dataContainer = entity;
        }
        if (vEntity != null) {
    @NotNull
            if (vAttr != null) {
        synchronized (orphanVirtualEntities) {
    public static List<DBVEntityForeignKey> getVirtualReferences(@NotNull DBSEntity onEntity) {
        }
                    }
                    if (attrRefs == null) {
                }
            return attribute.getTransformSettings();
        boolean hasNulls = false;
import org.jkiss.dbeaver.ModelPreferences;
        }
import org.jkiss.dbeaver.registry.expressions.ExpressionRegistry;
                return globalRefs;
        }
                    if (matches) {
        if (options != null) {
                if (DBUtils.isIdentifierConstraint(monitor, constraint)) {
    }
                }
                    }
        if (tdList == null || tdList.isEmpty()) {
            options = transformSettings.getTransformOptions();
            final Collection<? extends DBSEntityAssociation> realConstraints = onEntity.getReferences(monitor);
        @NotNull DBDAttributeBinding[] allAttributes,
        for (ExpressionNamespaceDescriptor ns : ExpressionRegistry.getInstance().getExpressionNamespaces()) {
        List<DBSEntityAssociation> result = new ArrayList<>();
        DBVEntity vEntity = getVirtualEntity(entity, false);
            return attribute.getTransformSettings();
import org.jkiss.dbeaver.registry.expressions.ExpressionNamespaceDescriptor;
            return null;
        DBVEntity vEntity = getVirtualEntity(entity, false);
            }
    public static Object executeExpression(DBVEntityAttribute attribute, DBDAttributeBinding[] allAttributes, Object[] row) {
        } catch (DBException e) {
        DBSEntityAttribute entityAttribute = binding.getEntityAttribute();
            return null;



        return result;
        @NotNull DBSObject dataContainer,
                List<DBVEntityForeignKey> vFKs = vEntity.getForeignKeys();
            return null;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    if (containsCount && i == colHandlers.size() - 1) {
    @NotNull
    public static DBVTransformSettings getTransformSettings(@NotNull DBDAttributeBinding binding, boolean create) {
            {

                    keyValue = valueHandlers.get(i).getValueDisplayString(valueAttributes.get(i), keyValue, DBDDisplayFormat.UI);
            if (realEntity == null) {
    {
import org.jkiss.code.NotNull;
                if (!CommonUtils.isEmpty(vFKs)) {
    public static List<DBSEntityAssociation> getAllReferences(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity onEntity) {

        return entity;
            List<DBVEntityConstraint> vConstraints = vEntity.getConstraints();
import org.eclipse.core.runtime.IAdaptable;
            // Check constraints
            return (DBVEntity) source;
        @NotNull DBCResultSet dbResult,
                    dataContainer.getName(),
        DBVEntity vEntity = getVirtualEntity(binding, create);
        }
            if (!CommonUtils.isEmpty(vConstraints)) {
                return null;
                        tdList.remove(i);
    }
        if (entityAttribute != null) {
            allTransformers.addAll(inMemoryAddedTransformers);
        }
            }
            .toList();
    public static Map<String, Object> getAttributeTransformersOptions(@NotNull DBDAttributeBinding binding) {
    // Entities for unmapped attributes (custom queries, pseudo attributes, etc)
            return getVirtualEntity((DBSEntity)dataContainer, create);
                keyLabel = keyLabel2.toString();

                for (DBVEntityAttribute attr : vAttributes) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull
        }
                    }
import org.jkiss.dbeaver.Log;
        }
                }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBVEntity vEntity;
        boolean containsCount) throws DBCException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                        keyCount = CommonUtils.toLong(descValue);
        }
                        }
import org.apache.commons.jexl3.JexlEngine;
    @NotNull
        return false;
                throw new DBException("Can't locate real entity for " + DBUtils.getObjectFullId(entity));
import org.apache.commons.jexl3.JexlExpression;
        return result;

    }
    }
        List<DBDAttributeTransformer> allTransformers = new ArrayList<>();
                        return true;
 * DBeaver - Universal Database Manager
        return null;
import org.jkiss.dbeaver.utils.GeneralUtils;
                    if (!keyLabel2.isEmpty()) {
        }
        JexlEngine jexlEngine = jexlBuilder.create();
        List<DBDLabelValuePair> values = new ArrayList<>();
    @NotNull
                    } else {
        return evaluateDataExpression(dataContainer, allAttributes, row, expression, attribute.getName());
            return null;

            return Collections.emptyMap();
    }
        if (transformSettings != null) {
public abstract class DBVUtils {
                        keyLabel2.append(columnDivider);
                vEntity = new DBVEntity(
                        formatValues ? DBDDisplayFormat.UI : DBDDisplayFormat.NATIVE));

    @NotNull
        if (CommonUtils.isEmpty(exprString)) {
        // so we shouldn't eay too much memory for that
    }
                return getTransformSettings(vAttr, create);
            }
        @NotNull List<DBSEntityAttribute> valueAttributes,
            // Get value and description
        }
        }
        } catch (Exception e) {
        } else if (create) {
import org.jkiss.dbeaver.model.exec.DBCSession;

            Class<?> implClass = ns.getImplClass();
                        // The last one column is the `count(*)`
            }
                }
            try {
            if (!filtered) {
                    List<? extends DBSEntityAttributeRef> attrRefs = ((DBSEntityReferrer) constraint).getAttributeReferences(monitor);
                    result.addAll(vFKs);
                values.add(new DBDLabelValuePairExt(keyLabel, finalKeyValue, keyCount));
            DBSDataContainer nestedDC = ((IAdaptable) dataContainer).getAdapter(DBSDataContainer.class);
        return jexlEngine.createExpression(expression);

    }

        {
            return realEntity;
        for (DBVObject object = attribute.getParentObject(); object != null; object = object.getParentObject()) {
                        result.add(attr);
            for (DBSEntityConstraint constraint : constraints) {
    @NotNull
        }
                            break;
            }

                        descValue,

            Collection<? extends DBSEntityConstraint> constraints = getAllConstraints(monitor, table);
            }
    {
                StringBuilder keyLabel2 = new StringBuilder();
            log.debug(e);
        jexlBuilder.cache(100);
        }

    }

            }
        String descColumns = null;
            if (session.getProgressMonitor().isCanceled()) {
            vEntity = getVirtualEntity(entityAttribute.getParentObject(), create);
        return Collections.emptyMap();
    public static Object evaluateDataExpression(
                        break;
            // Little trick - return first key value inline
    public static DBDAttributeTransformer[] findAttributeTransformers(@NotNull DBDAttributeBinding binding, @Nullable Boolean custom) {
import org.jkiss.dbeaver.model.data.*;

    }
            return options;
        result.addAll(getVirtualReferences(onEntity));
        DBPDataSource dataSource = binding.getDataSource();
            }
            descColumns = DBVEntity.getDefaultDescriptionColumn(monitor, attribute);

                    hasNulls = true;
                    if (attributes.size() != attrRefs.size()) {
        DBVEntity entity = attribute.getEntity();
        @Nullable String attributeName
    }
                        i++;
                    }
            }

            result.addAll(realConstraints);
            .map(DBDAttributeTransformerDescriptor::getInstance)
        return result;
    }
            }
            List<DBDAttributeTransformer> inMemoryAddedTransformers = dbdAttributeTransformerProvider.findTransformerForBinding(binding);
    public static String getDictionaryDescriptionColumns(DBRProgressMonitor monitor, DBSEntityAttribute attribute) throws DBException {
                        metaColumns.get(i),
 * See the License for the specific language governing permissions and
                }
        }
import java.util.*;

                }
        }
        return values;
        if (entityNode != null) {
                    if (attr.isCustom()) {
                    }
        final DBVTransformSettings transformSettings = getTransformSettings(binding, false);
            }
            }
 * you may not use this file except in compliance with the License.

        return result;
                break;
    public static DBVObject getVirtualObject(DBSObject source, boolean create) {
                    }
            }
        if (vEntity != null) {
    @Nullable
                return List.of();
    public static DBVEntity getVirtualEntity(@NotNull DBDAttributeBinding binding, boolean create) {
                        continue;
    }
    }
        JexlExpression expression = attribute.getParsedExpression();

                    return realEntity;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
            log.debug("Error reading entity references", e);
        }
                nsList.put(ns.getId(), implClass);
                filtered = transformSettings.filterTransformers(tdList);

    public static List<DBSEntityAttribute> getAllAttributes(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity) throws DBException {
        if (source instanceof DBVObject vObject) {
        if (binding.getDataContainer() instanceof DBDAttributeTransformerProvider dbdAttributeTransformerProvider) {
/**
                            matches = false;
        return nsList;
        }
        }
    }
                        continue;
    @Nullable
                for (int i = valueAttributes.size(); i < colHandlers.size(); i++) {
        if (attributes.isEmpty()) {
            return false;
            result.addAll(realAttributes);
        if (dataContainer == null) {
                // Leave only default transformers
    }
        if (!CommonUtils.isEmpty(realConstraints)) {
 * You may obtain a copy of the License at
        @NotNull JexlExpression expression,
    public static DBSEntity getRealEntity(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity) throws DBException {
        if (!CommonUtils.isEmpty(realAttributes)) {
            }
        // Extract enumeration values and (optionally) their descriptions
    public static List<DBVEntityAttribute> getCustomAttributes(@NotNull DBSEntity entity) {
                values.add(new DBDLabelValuePair(keyLabel, finalKeyValue));
    @Nullable
        for (DBCAttributeMetaData col : metaColumns) {
                for (int i = 0; i < tdList.size(); ) {
                    if (hasNulls) {
        DBNDatabaseNode entityNode = DBNUtils.getNodeByObject(onEntity);
                result.addAll(realConstraints);
            // Check monitor
            if (transformSettings != null) {
    private static final Map<String, DBVEntity> orphanVirtualEntities = new HashMap<>();
                    // Convert dates into string to avoid collisions

    }
        if (dictionary != null) {
        DBVEntity dictionary = DBVUtils.getVirtualEntity(attribute.getParentObject(), false);

            }
                        if (attributes.get(i) != attrRefs.get(i).getAttribute()) {

        }
import org.jkiss.dbeaver.model.DBPDataKind;
            }
            } catch (DBException e) {
        } else {
        List<DBDValueHandler> colHandlers = new ArrayList<>(metaColumns.size());
import org.jkiss.code.Nullable;

 *
        }
    @NotNull
import org.jkiss.dbeaver.model.DBUtils;
                dataContainer = nestedDC;
    ) {
        DBSEntity table = attributes.getFirst().getParentObject();
        Map<String, Object> options = null;
    public static DBVEntity getVirtualEntity(@NotNull DBSDataContainer dataContainer, boolean create) {
        return Collections.emptyList();
        }
            DBVEntity vEntity = getVirtualEntity(entity, false);

        @NotNull Object[] row,
 */
                    if (tdList.get(i).isCustom() || !tdList.get(i).isApplicableByDefault()) {

            // Data container can be a wrapper around another data container (e.g. ResultSetDataContainer). Virtual entity is linked to the nested one.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static JexlExpression parseExpression(String expression) {
            if (!CommonUtils.isEmpty(realConstraints)) {
        if (vEntity != null) {
        // There shouldn't be too many such settings as they are defined by user manually
            DBSEntity realEntity = ((DBVEntity) entity).getRealEntity(monitor);
        final Collection<? extends DBSEntityAssociation> realConstraints = entity.getAssociations(monitor);
        {

    @NotNull
        boolean formatValues,
                }
            .stream()
        Map<String, Object> nsList = new HashMap<>();

        }
            Object finalKeyValue = keyValues.length == 1 ? keyValues[0] : keyValues;
            List<DBVEntityAttribute> vAttributes = vEntity.getEntityAttributes();
        return allTransformers.isEmpty() ? null : allTransformers.toArray(DBDAttributeTransformer[]::new);
        if (expression == null) {
    }
            if (vEntity != null) {
            if (!CommonUtils.isEmpty(globalRefs)) {
                return object.getTransformSettings();

        allTransformers.addAll(savedTransformers);
        DBPDataSource dataSource = source.getDataSource();
        // Not an entity. Most likely a custom query. Use local cache for such attributes.
        }
            Object[] keyValues = new Object[valueAttributes.size()];
        if (DBUtils.isDynamicAttribute(binding.getAttribute())) {
        if (descColumns == null) {
            return vObject;
            dataContainer = entity.getRealEntity(new VoidProgressMonitor());
            colHandlers.add(DBUtils.findValueHandler(session, col));
 * Unless required by applicable law or agreed to in writing, software

        return descColumns;
            return vEntity;
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
    }
            if (containsCount && keyCount > 0) {
    @Nullable
        Map<String, Object> nsList = getExpressionNamespaces();
            DBVEntity vEntity = orphanVirtualEntities.get(attrKey);
        if (vEntity != null) {
            descColumns = dictionary.getDescriptionColumnNames();
    public static boolean isIdentifyingAttributes(@NotNull DBRProgressMonitor monitor, @NotNull List<DBSEntityAttribute> attributes) throws DBException {
