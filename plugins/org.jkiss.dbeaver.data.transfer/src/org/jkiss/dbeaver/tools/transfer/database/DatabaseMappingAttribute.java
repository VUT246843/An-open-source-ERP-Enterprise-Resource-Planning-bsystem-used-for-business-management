import org.jkiss.dbeaver.Log;

            return targetTypeWithModifiers;
        }
                    targetName = getSourceLabelOrName(source, true, updateAttributesNames);
import org.jkiss.dbeaver.model.*;
    public void setTargetName(String targetName) {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");

                }
        this.targetType = targetType;
            // We already have mapping for the attribute with the skip type
    @Override
    private String targetTypeWithModifiers;
                mappingType = DatabaseMappingType.create;

    public void setTarget(@Nullable DBSEntityAttribute target) {
        if (source instanceof DBDAttributeBinding) {
import org.jkiss.code.Nullable;
                    if (targetEntity instanceof DBSEntity dbsEntity) {
            return targetType;
                // Reload table attributes cache. It can be empty after table deleting
                }
                }
    private String targetName;
        }
                        .filter(attr -> !DBUtils.isPseudoAttribute(attr) && !DBUtils.isHiddenObject(attr))
        @NotNull DatabaseMappingContainer parent
            return;
        this.targetTypeWithModifiers = targetTypeWithModifiers;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    public String toString() {
        if (parent.getMappingType() == DatabaseMappingType.skip) {
        this.target = attribute.target;
                }
            DBPPreferenceStore preferenceStore = targetDataSource.getContainer().getPreferenceStore();
                    targetDataSource,
 * DBeaver - Universal Database Manager
    private DBSEntityAttribute target;
    }
    public void setTargetType(String targetType, String targetTypeWithModifiers) {
            return new LinkedHashMap<>(transformerProperties);
/**
    @Override

 *
            }
    private DatabaseMappingType mappingType;
                return "?";
            if (targetAttributes != null) {
        } else if (addModifiers && !CommonUtils.isEmpty(targetTypeWithModifiers)) {

        if (CommonUtils.isEmpty(name)) {
    }

 * You may obtain a copy of the License at
public class DatabaseMappingAttribute implements DatabaseMappingObject {



        }
    }
        return name;
    public void setTransformerProperties(Map<String, Object> properties) {
            if (source instanceof StreamDataImporterColumnInfo && targetAttributes != null) {
                targetName = getSourceLabelOrName(getSource(), true, false);
            if (transformer == null) {
                        .stream()
            name = ((DBDAttributeBinding) source).getLabel();
        if (source instanceof DBSTypedObjectExt2 sourceExt) {


        return DBStructUtils.mapTargetDataType(targetDataSource, source, addModifiers);

 * Unless required by applicable law or agreed to in writing, software
                targetName = getSourceLabelOrName(source, false, updateAttributesNames);
import org.jkiss.dbeaver.DBException;
                    sourceExt.setMaxLength(maxDataTypeLength);
                StreamDataImporterColumnInfo source = (StreamDataImporterColumnInfo) this.source;
            transformerProperties.putAll(properties);
        @NotNull DatabaseMappingAttribute attribute,
                if (parent.getMappingType() == DatabaseMappingType.recreate) {
                transformerProperties.clear();
                            this.target = CommonUtils.findBestCaseAwareMatch(
            }
        this.mappingType = DatabaseMappingType.unspecified;
        if (targetType != null) {

                            // In case of violated order (some columns are missing in the source, for example), if it turned out to find a suitable column by name
                targetAttributes = targetEntity.getAttributes(monitor);
 */
                    name,
    }
            List<? extends DBSEntityAttribute> targetAttributes = targetEntity.getAttributes(monitor);
               //     source.setTypeName(target.getTypeName());
    public DBSEntityAttribute getTarget() {
                    preferenceStore.getInt(DTConstants.PREF_MAX_TYPE_LENGTH) : store.getInt(DTConstants.PREF_MAX_TYPE_LENGTH);

import org.jkiss.code.NotNull;
                    DBUtils.isQuotedIdentifier(targetDataSource, targetName) || isSkipNameTransformation());
            }
        return target;
    }
package org.jkiss.dbeaver.tools.transfer.database;
        mappingType = DatabaseMappingType.unspecified;
                            targetName = targetAttribute.getName();

    }
            }
    }
                Map<String, Object> tp = (Map<String, Object>) settings.get("transformerProperties");
            if (forceRefresh || CommonUtils.isEmpty(targetName)) {
            }
        } else if (mappingType == DatabaseMappingType.unspecified && source != null && targetName != null) {
                                CommonUtils.safeCollection(dbsEntity.getAttributes(new VoidProgressMonitor())),
                source.getDataKind());
                    }
                return targetName;
                    sourceExt.setPrecision(maxDataTypeLength);
import org.jkiss.dbeaver.tools.transfer.DTConstants;
                }
                // Here we change the target name if we switched from target container with identifier case X to container with identifier case Y
 */
    private static final Log log = Log.getLog(DatabaseMappingAttribute.class);

import java.util.Comparator;
        DatabaseMappingContainer parent,
        }
            transformerProperties.clear();
                target = CommonUtils.findBestCaseAwareMatch(
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        }
        changeDataTypeLength(targetDataSource);
    String getSourceLabelOrName(DBSAttributeBase source, boolean addSpecialTransformation, boolean updateAttributesNames) {
    }
                if (!CommonUtils.isEmpty(targetName)) {
        return source;
    @Override
                } else {
        if (targetTypeWithModifiers != null) {
    }

import java.util.LinkedHashMap;
    @NotNull
        if (targetName != null) {
                        }
                            transformerProperties.put(name, tp.get(name));
                    List<DBSEntityAttribute> suitableTargetAttributes = targetAttributes
    private final DBSAttributeBase source;
    @Nullable
                        if (target != null && !targetAttribute.getName().equalsIgnoreCase(target.getName())) {

                name = DatabaseTransferUtils.getTransformedName(
            if (container != null && container.getDataSource() != null) {
            settings.put("targetTypeWithModifiers", targetTypeWithModifiers);
            if (transformer != null) {
                    }
                }
                    targetAttributes,
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
               // Looks like now it useless code and autodetection types happens early. Origin ticket dbeaver#10034
                if (tp != null) {

        }

    public String getTargetType(DBPDataSource targetDataSource, boolean addModifiers) {
                        .collect(Collectors.toList());
    }
        if (source instanceof DBSObject) {
                    newMappingType = DatabaseMappingType.create;
        }
    private String targetType;
                log.error("Can't find attribute transformer " + transformerId);
                if (!updateAttributesNames && CommonUtils.isNotEmpty(targetName)) {
        this.source = attribute.source;
        if (container != null && container.getDataSource() != null) {
        }

                container.getDataSource(),
                int maxDataTypeLength = preferenceStore.contains(DTConstants.PREF_MAX_TYPE_LENGTH) ?
        if (mappingType != null) {
            }
        }
            // Convert target name case (#1516)
            if (CommonUtils.isEmpty(targetAttributes) && targetEntity instanceof DBPRefreshableObject) {
        if (!addModifiers && !CommonUtils.isEmpty(targetType)) {
                targetName = DatabaseTransferUtils.getTransformedName(
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                settings.put("transformerProperties", new LinkedHashMap<>(transformerProperties));
        if (transformerId != null) {

                } else if (target == null && newMappingType == DatabaseMappingType.existing) {
        }
            } else {
        this.targetType = attribute.targetType;
        Object transformerId = settings.get("transformer");
            // Case recreate container mapping in the new table or just create
                        );

    public DBPImage getIcon() {

            mappingType = DatabaseMappingType.skip;
            case create:
        this.parent = parent;
    private String getSourceLabelOrName(String name, boolean addSpecialTransformation, boolean updateAttributesNames) {
                if (source.getDataKind() == DBPDataKind.NUMERIC &&
                            targetAttributes,
            String sourceLabelOrName = getSourceLabelOrName(source, false, updateAttributesNames);
import java.util.Map;
                            targetName = target.getName();
    DatabaseMappingAttribute(
            } catch (Exception e) {
                    return targetName;
            }
        if (container != null && container.getDataSource() != null) {
                } else {
        if (mappingType == DatabaseMappingType.skip) {
                            DBUtils.getUnQuotedIdentifier(targetEntity.getDataSource(), targetName),

            }
import java.util.stream.Collectors;
 *
    }

 * DatabaseMappingAttribute
        }
    }
            }
                        target = CommonUtils.findBestCaseAwareMatch(
            return null;

    private final Map<String, Object> transformerProperties = new LinkedHashMap<>();

                        .sorted(Comparator.comparing(DBSEntityAttribute::getOrdinalPosition))
                String[] tpNames = CommonUtils.toString(settings.get("transformerPropertiesNames"), "").split(",");
               //     source.setMaxLength(target.getMaxLength());
                    mappingType = DatabaseMappingType.existing;
                } else {
        this.transformer = transformer;
        return name;

            String typeModifiers = container.getDataSource().getSQLDialect().getColumnTypeModifiers(
import org.jkiss.dbeaver.model.struct.*;
}
    public void updateMappingType(DBRProgressMonitor monitor, boolean forceRefresh, boolean updateAttributesNames) throws DBException {
            if (addSpecialTransformation) {
            DBSObjectContainer container = parent.getSettings().getContainer();
            name = source.getName();
                    if (source.getOrdinalPosition() < suitableTargetAttributes.size()) {
        return getSourceLabelOrName(getSourceAttributeName(source), addSpecialTransformation, updateAttributesNames);
    public void loadSettings(Map<String, Object> settings) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                targetName = sourceLabelOrName;
            mappingType = DatabaseMappingType.create;
                    targetName,
        return DBValueFormatting.getObjectImage(source);
                    targetName = getSourceLabelOrName(targetName, false, false);
                        } else {
                // See https://github.com/dbeaver/dbeaver/issues/13236
    private DataTransferAttributeTransformerDescriptor transformer;
                ((DBPRefreshableObject) targetEntity).refreshObject(monitor);


    @Nullable

        }

    }
                source,
            case recreate:

                }
                        }
                if (target != null && newMappingType == DatabaseMappingType.create && parent.getMappingType() != DatabaseMappingType.recreate) {

        targetTypeWithModifiers = CommonUtils.toString(settings.get("targetTypeWithModifiers"));

        this.source = source;
                log.error(e);
    private void changeDataTypeLength(@NotNull DBPDataSource targetDataSource) {
    }
            } else {
    public void setMappingType(DatabaseMappingType mappingType) {
        if (mappingType == DatabaseMappingType.create && !CommonUtils.isEmpty(targetName)) {
import org.jkiss.utils.CommonUtils;

                    return DBUtils.getObjectFullName(target, DBPEvaluationContext.UI);
                if (!source.isMappingMetadataPresent()) {
                        }
    }
            if (typeModifiers != null) {
            if (forceRefresh || CommonUtils.isEmpty(targetName)) {
 *
        String name = null;
                        if (dbsEntity.getDataSource() != null) {
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
                    DBUtils.getUnQuotedIdentifier(targetEntity.getDataSource(), targetName),
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferAttributeTransformerDescriptor;
                                DBUtils.getUnQuotedIdentifier(dbsEntity.getDataSource(), targetName),
                    DBUtils.isQuotedIdentifier(container.getDataSource(), name) || isSkipNameTransformation() || !updateAttributesNames);
            case create:
               // }
                ) {
        }
    public Map<String, Object> getTransformerProperties() {
                    newMappingType = DatabaseMappingType.existing;
    }
            }
        return isSkipNameTransformation;
        switch (mappingType) {
            if (this.target != null) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                typeName,
                typeName += typeModifiers;
                } else if (source.getMaxLength() > maxDataTypeLength) {
        return typeName;

    }
    }
                                DBSEntityAttribute::getName);
        return source != null ? source.getName() : getTargetName();
 * limitations under the License.
                DatabaseMappingType newMappingType = DatabaseMappingType.valueOf((String) settings.get("mappingType"));
    }
        if (parent.getTarget() instanceof DBSEntity targetEntity) {
        targetName = CommonUtils.toString(settings.get("targetName"));
        }

        return mappingType;
                    container.getDataSource(),
                isSkipNameTransformation = sourceDataSource.getSQLDialect().mustBeQuoted(sourceAttributeName, true);
    public void setTargetType(String targetType) {
    private String getSourceAttributeName(@NotNull DBSAttributeBase source) {
        String typeName = source.getTypeName();
            String sourceAttributeName = getSourceAttributeName(source);
    @Override
                if (target != null) {
    public String getTargetName() {
        this.parent = parent;
        }
    void saveSettings(Map<String, Object> settings) {
    }
    public void setTransformer(DataTransferAttributeTransformerDescriptor transformer) {
                );
                            DBSEntityAttribute::getName
                    mappingType = DatabaseMappingType.create;
        this.targetName = attribute.targetName;
/*
        if (settings.get("mappingType") != null) {
    @Override
        this.mappingType = attribute.mappingType;
    }

        }
            } else if (!DBUtils.isQuotedIdentifier(container.getDataSource(), name) && !isSkipNameTransformation()) {
                    // Change create to existing. Do not change mapping type for the recreate type
        this.mappingType = mappingType;
        DBSDataContainer container = parent.getSource();
        if (source == null) {
            settings.put("targetName", targetName);
            if (preferenceStore.contains(DTConstants.PREF_MAX_TYPE_LENGTH) || store.contains(DTConstants.PREF_MAX_TYPE_LENGTH)) {
                mappingType = newMappingType;
        }
        return transformer;
            settings.put("targetType", targetType);
                settings.put("transformer", transformer.getId());
    @Nullable
        targetType = CommonUtils.toString(settings.get("targetType"));

        } else {
    }
        this.targetName = targetName;
                DBPDataSource targetDataSource = container.getDataSource();
        switch (mappingType) {
    public DatabaseMappingType getMappingType() {

            DBPPreferenceStore store = DTActivator.getDefault().getPreferences();
    }
            transformer = DataTransferRegistry.getInstance().getAttributeTransformer(transformerId.toString());
                        DBSEntityAttribute targetAttribute = suitableTargetAttributes.get(source.getOrdinalPosition());
    @Override
        }
    }
            case skip:
                    source.getPrecision() != null && source.getPrecision() > maxDataTypeLength
            case existing:
    }
        return parent;
    public String getSourceType() {

    DatabaseMappingAttribute(
    }
        }

import java.util.List;
    public static final String TARGET_NAME_SKIP = "[skip]";
                }
    }
        this.targetTypeWithModifiers = attribute.targetTypeWithModifiers;
                settings.put("transformerPropertiesNames", String.join(",", transformerProperties.keySet()));
    public DatabaseMappingContainer getParent() {
                return TARGET_NAME_SKIP;
            if (sourceLabelOrName != null && sourceLabelOrName.equalsIgnoreCase(targetName) && !sourceLabelOrName.equals(targetName)) {
            try {
    public DataTransferAttributeTransformerDescriptor getTransformer() {
    private boolean isSkipNameTransformation() {
            }
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                name = DBObjectNameCaseTransformer.transformName(container.getDataSource(), name);
               // if (target != null) {
                target = null;
            if (sourceDataSource != null && CommonUtils.isNotEmpty(sourceAttributeName)) {
        }
                    DBSEntityAttribute::getName
            return;
               //     source.setDataKind(target.getDataKind());
        synchronized (transformerProperties) {
    public DBSAttributeBase getSource() {
                    DBSDataManipulator targetEntity = parent.getTarget();
        synchronized (transformerProperties) {
 * you may not use this file except in compliance with the License.
                    // We want to keep targetName in this case. It can be the targetName from a task as example
    ) {
        boolean isSkipNameTransformation = false;
    private final DatabaseMappingContainer parent;
                break;
        DBSObjectContainer container = parent.getSettings().getContainer();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
        this.target = target;
            } else {
            default:
                    for (String name : tpNames) {

            DBPDataSource sourceDataSource = ((DBSObject) source).getDataSource();
        this.targetType = targetType;
            settings.put("mappingType", mappingType.name());
        @NotNull DBSAttributeBase source
            }
    @Nullable

    ) {
        this.targetTypeWithModifiers = targetType;
import org.jkiss.dbeaver.tools.transfer.stream.StreamDataImporterColumnInfo;
        }
    }
                        if (!CommonUtils.isEmpty(name)) {
        }
