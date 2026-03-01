                            }
                        attributes.getValue(ATTR_NAME),
                    break;
        }
            for (DBVEntityConstraint c : CommonUtils.safeCollection(entity.getConstraints())) {
                        for (DBVEntityConstraintColumn cc : CommonUtils.safeCollection(c.getAttributeReferences(null))) {
                            }
            if (!CommonUtils.isEmpty(entity.getColorOverrides())) {
 * DBeaver - Universal Database Manager
                                    }
                                        }

                                        xml.addText(GeneralUtils.serializeObject(value));
                    }
                    curColor = null;
                            curEntity,
                case TAG_INCLUDE:
            for (DBVContainer container : object.getContainers()) {
                            attributes.getValue(ATTR_NAME),
                                attributes.getValue(ATTR_NAME),
                        } catch (Throwable e) {
                    continue;
                    if (curColor != null) {
            switch (localName) {
                            if (color.isRange()) {
                            for (String id : CommonUtils.safeCollection(transformSettings.getExcludedTransformers())) {
                    }
                }
                        xml.addAttribute(ATTR_TYPE, c.getConstraintType().getName());
                            final Map<String, Object> transformOptions = transformSettings.getTransformOptions();

                                }
 */
                }
        private boolean colorValue = false;
                                xml.addAttribute(ATTR_VALUE, CommonUtils.toString(prop.getValue()));
                            }
import org.jkiss.dbeaver.model.struct.DBSEntity;
                        curConstraint.addAttribute(attributes.getValue(ATTR_NAME));
                    break;
import org.jkiss.utils.xml.XMLException;
                            }
        @Override
                            }
        private DBVEntityAttribute curAttribute = null;
                                }

                    }

                case TAG_EXCLUDE:
                    break;
                                xml.addAttribute(ATTR_NAME, prop.getKey());
                                    xml.addAttribute(ATTR_ID, id);
                    }
                        curEntity.setProperty(
import org.jkiss.code.NotNull;
                    final DBVTransformSettings transformSettings = attr.getTransformSettings();

                    xml.addAttribute(ATTR_NAME, attr.getName());
                            }
                    if (curTransformSettings != null && !CommonUtils.isEmpty(transformerId)) {
                        curContainer.addContainer(container);
                                }
                            if (!ArrayUtils.isEmpty(color.getAttributeValues())) {
                    if (curColor != null) {
                    }
                                }
                                for (Object value : color.getAttributeValues()) {
 * See the License for the specific language governing permissions and
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) throws XMLException {
import org.jkiss.utils.ArrayUtils;
        public void saxText(@NotNull SAXReader reader, @NotNull String data) {
import java.util.Map;
                case TAG_CONTAINER:
                        curContainer,
                    }
                serializeContainer(xml, container);
        public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) {
                    } else if (curEntity != null) {
                                        if (prop.getValue() != null) {
        @Override
                                    }
                    break;
                    if (curContainer == null) {
                            curEntity.addColorOverride(curColor);
                    }
                                xml.addAttribute(ATTR_BACKGROUND2, color.getColorBackground2());
                        curAttribute.setTransformSettings(curTransformSettings);
                    for (DBVEntityForeignKeyColumn cc : CommonUtils.safeCollection(fk.getAttributes())) {
                        try (var ignored2 = xml.startElement(TAG_COLOR)) {
                            xml.addAttribute(ATTR_NAME, color.getAttributeName());
            }
                            }
        }
 */
class DBVModelSerializerLegacy implements DBVModelSerializer {
                    break;
    static void serializeContainer(@NotNull XMLBuilder xml, @NotNull DBVContainer object) throws IOException {
            if (!CommonUtils.isEmpty(entity.getProperties())) {
        if (!object.hasValuableData()) {
                            }
                case TAG_CONSTRAINT:
    static class ModelParser implements SAXListener {
                if (c.hasAttributes()) {
                        DBDAttributeTransformerDescriptor transformer = DBWorkbench.getPlatform().getValueHandlerRegistry()
            if (colorValue) {
            xml.addAttribute(ATTR_NAME, entity.getName());
import org.jkiss.utils.xml.SAXListener;
                    curTransformSettings = new DBVTransformSettings();
        try (var ignored = xml.startElement(TAG_CONTAINER)) {
                        }
                                            xml.addAttribute(ATTR_VALUE, CommonUtils.toString(prop.getValue()));
            // Constraints
                        );
            }
                    curTransformSettings = null;
                        xml.addAttribute(ATTR_CONSTRAINT, refConstraint.getName());
                case TAG_ATTRIBUTE:
                    curConstraint = null;
                            curTransformSettings.enableTransformer(transformer, TAG_INCLUDE.equals(localName));
                if (entity.hasValuableData()) {
                        } else {
            }
        }
            }
                case TAG_COLOR:
import org.jkiss.code.Nullable;
                case TAG_CONSTRAINT:
                case TAG_CONTAINER:
                            xml.addAttribute(ATTR_OPERATOR, color.getOperator().name());
import org.jkiss.dbeaver.utils.GeneralUtils;
                    String transformerId = attributes.getValue(ATTR_ID);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
            }
            // nothing to save
                        curAttribute = curAttribute.getParent();
/**
 *

                    if (curAttribute != null) {
                    } else if (curEntity != null) {
                        }
        private DBVColorOverride curColor;
            this.rootContainer = rootContainer;
                    break;
                            attributes.getValue(ATTR_NAME),
                                xml.addAttribute(ATTR_SINGLE_COLUMN, true);
                        );
import org.jkiss.utils.xml.SAXReader;
                    curTransformSettings.setCustomTransformer(attributes.getValue(ATTR_CUSTOM));
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
import org.jkiss.dbeaver.model.DBUtils;
            }
                        curContainer = container;
    private static void serializeEntity(@NotNull XMLBuilder xml, @NotNull DBVEntity entity) throws IOException {
        private DBVEntityConstraint curConstraint;
                            if (!CommonUtils.isEmpty(transformSettings.getCustomTransformer())) {
                            if (transformOptions != null) {
            xml.addAttribute(ATTR_NAME, object.getName());
        }
                case TAG_VALUE:
                case TAG_TRANSFORM:
                    if (curTransformSettings != null) {
                    if (curConstraint != null) {
                        if (transformer == null) {

                                attributes.getValue(ATTR_BACKGROUND)
                        }
                for (Map.Entry<String, Object> prop : entity.getProperties().entrySet()) {
                            log.warn("Error reading color settings", e);
                                for (Map.Entry<String, Object> prop : transformOptions.entrySet()) {
        @Override
@Deprecated
                case TAG_COLOR:
                                    if (value == null) {
        }
                        }
                    if (refEntity != null) {
package org.jkiss.dbeaver.model.virtual;
                case TAG_PROPERTY:
                    }
            }
                        try (var ignored2 = xml.startElement(TAG_ATTRIBUTE)) {
                        xml.addAttribute(ATTR_VALUE, CommonUtils.toString(prop.getValue()));
import org.jkiss.utils.CommonUtils;
                    }
            // Foreign keys
    }
        }
                }
                        attributes.getValue(ATTR_DESCRIPTION)
import org.jkiss.dbeaver.model.data.DBDAttributeTransformerDescriptor;
            for (DBVEntityAttribute attr : CommonUtils.safeCollection(entity.getEntityAttributes())) {
                    } else if (curAttribute != null) {
                            );
 * Unless required by applicable law or agreed to in writing, software
                                    xml.addAttribute(ATTR_ID, id);
                    );
                            if (color.getColorBackground2() != null) {
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                        curAttribute = new DBVEntityAttribute(curEntity, null, attributes.getValue(ATTR_NAME));
 * You may obtain a copy of the License at
                                xml.addAttribute(ATTR_BACKGROUND, color.getColorBackground());
                }
                    }
                            curColor.setRange(CommonUtils.getBoolean(attributes.getValue(ATTR_RANGE), false));
                                    try (var ignored3 = xml.startElement(TAG_VALUE)) {
                        colorValue = true;

                if (!attr.hasValuableData()) {
                        curAttribute.addChild(childAttribute);
                            curContainer,
                    DBSEntity refEntity = fk.getAssociatedEntity();
                            }
                                    try (var ignored5 = xml.startElement(TAG_PROPERTY)) {
                                        continue;
            }
                curColor.addAttributeValue(GeneralUtils.deserializeObject(data));
                    } else if (curAttribute != null) {
                        );
                        colorValue = false;
            return;
                        );
                            attributes.getValue(ATTR_NAME)

                    }
                            .getTransformer(transformerId);

                    break;

                    curContainer.addEntity(curEntity);
                }
                        }
                        curEntity.addConstraint(curConstraint, false);
                            curColor.setColorForeground2(attributes.getValue(ATTR_FOREGROUND2));
import org.xml.sax.Attributes;
                        xml.addAttribute(ATTR_NAME, c.getName());
                        curEntity.addVirtualAttribute(curAttribute, false);
                            if (color.getColorForeground() != null) {
                            try (var ignored = xml.startElement(TAG_PROPERTY)) {
                case TAG_TRANSFORM:
            for (DBVEntityForeignKey fk : CommonUtils.safeCollection(entity.getForeignKeys())) {
                            if (color.isSingleColumn()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                                xml.addAttribute(ATTR_FOREGROUND, color.getColorForeground());
 *
                    curEntity = new DBVEntity(
                    }
                            if (color.getColorBackground() != null) {
                    }
                    break;
            if (!CommonUtils.isEmpty(entity.getDescriptionColumnNames())) {
                                    }
                            xml.addAttribute(ATTR_NAME, cc.getAttributeName());
                    }
                            log.warn("Transformer '" + transformerId + "' not found");
                                try (var ignored5 = xml.startElement(TAG_INCLUDE)) {
                                DBCLogicalOperator.valueOf(attributes.getValue(ATTR_OPERATOR)),
                    curEntity = null;
                        curTransformSettings.setTransformOption(
        try (var ignored0 = xml.startElement(TAG_ENTITY)) {
    private static final Log log = Log.getLog(DBVModelSerializerLegacy.class);
            // Attributes
                        DBVContainer container = new DBVContainer(
                            attributes.getValue(ATTR_NAME),
                    }
                        curEntity.setTransformSettings(curTransformSettings);
                    for (DBVColorOverride color : entity.getColorOverrides()) {
 * you may not use this file except in compliance with the License.
import java.io.IOException;
                                            xml.addAttribute(ATTR_NAME, prop.getKey());
                                null,
                        curConstraint = new DBVEntityConstraint(
                        curAttribute = childAttribute;
                    if (curEntity != null) {
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
                            }
                            curColor.setColorBackground2(attributes.getValue(ATTR_BACKGROUND2));
                        curAttribute.setProperty(
                    break;
import org.jkiss.dbeaver.Log;
        }
            switch (localName) {
                            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            // Colors
/*
                    }
                            attributes.getValue(ATTR_VALUE)
                            DBSEntityConstraintType.VIRTUAL_KEY,
                    if (transformSettings != null && transformSettings.hasValuableData()) {
                try (var ignored3 = xml.startElement(TAG_ATTRIBUTE)) {
                    DBSEntityConstraint refConstraint = fk.getReferencedConstraint();
                    } else if (curEntity != null) {
 * limitations under the License.
                        );
                case TAG_ATTRIBUTE:
 *     http://www.apache.org/licenses/LICENSE-2.0
        private DBVTransformSettings curTransformSettings = null;
                            attributes.getValue(ATTR_VALUE)
                            curColor = new DBVColorOverride(
                    if (curAttribute != null) {
}
                case TAG_ENTITY:
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (curEntity != null) {
                    }
        private final DBVContainer rootContainer;
                    break;
                            }
                                attributes.getValue(ATTR_FOREGROUND),
                try (var ignored = xml.startElement(TAG_ASSOCIATION)) {
                    break;
                                xml.addAttribute(ATTR_RANGE, true);
                                xml.addAttribute(ATTR_CUSTOM, transformSettings.getCustomTransformer());
                            try (var ignored2 = xml.startElement(TAG_ATTRIBUTE)) {
                }
                            }
    }
                            attributes.getValue(ATTR_NAME)
                    } else {
                        DBVEntityAttribute childAttribute = new DBVEntityAttribute(curEntity, curAttribute, attributes.getValue(ATTR_NAME));
                }
                    }
                    try (var ignored = xml.startElement(TAG_CONSTRAINT)) {
            }
                        }
                case TAG_VALUE:
                    if (refConstraint != null) {
                    if (!CommonUtils.isEmpty(attr.getProperties())) {
        public ModelParser(@NotNull DBVContainer rootContainer) {
                    serializeEntity(xml, entity);
                    break;
                    curContainer = curContainer.getParentObject();
 *
        private DBVEntity curEntity = null;
                case TAG_ENTITY:
                                xml.addAttribute(ATTR_NAME, cc.getAttributeName());
 * distributed under the License is distributed on an "AS IS" BASIS,
                                try (var ignored5 = xml.startElement(TAG_EXCLUDE)) {
            }
                        try (var ignored4 = xml.startElement(TAG_TRANSFORM)) {
                    break;
            for (DBVEntity entity : object.getEntities()) {
                        xml.addAttribute(ATTR_ENTITY, DBUtils.getObjectFullId(refEntity));
            // Containers
                    break;
                        for (Map.Entry<String, Object> prop : attr.getProperties().entrySet()) {
        private DBVContainer curContainer = null;
                            curColor.setSingleColumn(CommonUtils.getBoolean(attributes.getValue(ATTR_SINGLE_COLUMN), false));
                    try (var ignored2 = xml.startElement(TAG_PROPERTY)) {
 * DBVModelSerializerLegacy
import org.jkiss.utils.xml.XMLBuilder;

                            for (String id : CommonUtils.safeCollection(transformSettings.getIncludedTransformers())) {
                            if (color.getColorForeground2() != null) {
                    break;
                try (var ignored = xml.startElement(TAG_COLORS)) {
            }
                        xml.addAttribute(ATTR_NAME, prop.getKey());
                xml.addAttribute(ATTR_DESCRIPTION, entity.getDescriptionColumnNames());
                        curContainer = rootContainer;
                        try {

                            attributes.getValue(ATTR_VALUE)
                                xml.addAttribute(ATTR_FOREGROUND2, color.getColorForeground2());
