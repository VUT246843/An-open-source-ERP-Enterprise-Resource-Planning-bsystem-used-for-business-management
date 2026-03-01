                    JSONUtils.fieldNE(json, "expression", attr.getExpression());
                }
                }
                        List<DBVEntityConstraintColumn> attrRefs = c.getAttributeReferences(null);
            }
                JSONUtils.field(json, "entity", fk.getRefEntityId());
            // nothing to save
 * Licensed under the Apache License, Version 2.0 (the "License");

            json.endObject();
                    json.beginObject();
                    JSONUtils.serializeProperties(json, "properties", transformSettings.getTransformOptions());
import org.jkiss.dbeaver.DBException;
                                json.value(cc.getAttributeName());
                        json.name(cc.getAttributeName());
        }
                json.beginObject();
                            json.endArray();
 *
import com.google.gson.stream.JsonWriter;
        }

        if (!CommonUtils.isEmpty(entity.getColorOverrides())) {
        for (DBVEntity entity : object.getEntities()) {

        for (DBVContainer container : object.getContainers()) {
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                serializeEntity(monitor, json, entity);
                }
        json.beginObject();
            // Foreign keys
        if (!CommonUtils.isEmpty(entity.getConstraints())) {
                    }
                final DBVTransformSettings transformSettings = attr.getTransformSettings();
import java.io.IOException;
        JSONUtils.serializeProperties(json, DBVContainer.CONFIG_PREFIX + "properties", object.getProperties());
                    json.endObject();
        if (!CommonUtils.isEmpty(entity.getEntityAttributes())) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.json.JSONUtils;
                    } else {
    static void serializeContainer(DBRProgressMonitor monitor, JsonWriter json, DBVContainer object) throws IOException, DBException {
                if (c.hasAttributes()) {
                    JSONUtils.serializeStringList(json, "include", transformSettings.getIncludedTransformers());
                JSONUtils.field(json, "constraint", fk.getRefConstraintId());
            // Attributes
                    json.name("transforms");
import java.util.Arrays;
                            json.beginArray();
            }
                    json.endObject();

                            for (DBVEntityConstraintColumn cc : attrRefs) {
    private static void serializeEntity(DBRProgressMonitor monitor, JsonWriter json, DBVEntity entity) throws IOException, DBException {

 * Unless required by applicable law or agreed to in writing, software
                JSONUtils.field(json, "operator", color.getOperator().name());

                    continue;

                JSONUtils.fieldNE(json, "background", color.getColorBackground());
class DBVModelSerializerModern implements DBVModelSerializer {
            json.endObject();
        JSONUtils.fieldNE(json, ATTR_DESCRIPTION, entity.getDescriptionColumnNames());
                    JSONUtils.field(json, "single-column", true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            // Constraints
                            json.name("attributes");
                        if (!CommonUtils.isEmpty(attrRefs)) {
                    JSONUtils.fieldNE(json, "dataKind", attr.getDataKind().name());
            json.endArray();
                if (!CommonUtils.isEmpty(refAttrs)) {
 * See the License for the specific language governing permissions and
                if (transformSettings != null && transformSettings.hasValuableData()) {
                List<DBVEntityForeignKeyColumn> refAttrs = fk.getAttributeReferences(null);
                        JSONUtils.field(json, "useAllColumns", true);

                    json.endObject();
                        json.value(cc.getRefAttributeName());
            json.beginObject();
            json.endArray();
                    json.beginObject();
 */

                if (!attr.hasValuableData()) {
 * you may not use this file except in compliance with the License.
                    json.name(c.getName());
/*
        json.beginObject();
        if (object instanceof DBVModel) {
                        }
                JSONUtils.serializeProperties(json, "properties", attr.getProperties());
        if (!object.hasValuableData()) {
                JSONUtils.field(json, "name", color.getAttributeName());
                }
            if (entity.hasValuableData()) {
 *
                }
import org.jkiss.utils.CommonUtils;
                }
                }
        } else {

    }
                    JSONUtils.field(json, "type", c.getConstraintType().getId());
                JSONUtils.fieldNE(json, "foreground2", color.getColorForeground2());
                json.endObject();
            }
            json.name(object.getName());
                    JSONUtils.field(json, "range", true);
                json.name(attr.getName());
                    json.name("attributes");
                }
                    for (DBVEntityForeignKeyColumn cc : refAttrs) {
                    JSONUtils.fieldNE(json, "typeName", attr.getTypeName());
        json.endObject();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            json.beginArray();
            json.name("colors");
        }
        json.name(DBVContainer.ENTITY_PREFIX + entity.getName());
                json.endObject();
            for (DBVColorOverride color : entity.getColorOverrides()) {
                    }
 */
                    json.beginObject();
 * DBeaver - Universal Database Manager
        }
 * DBVModelSerializerLegacy
            json.beginObject();

        JSONUtils.serializeProperties(json, "properties", entity.getProperties());
                    JSONUtils.fieldNE(json, "custom", transformSettings.getCustomTransformer());
        if (!CommonUtils.isEmpty(entity.getForeignKeys())) {
            for (DBVEntityAttribute attr : entity.getEntityAttributes()) {

                json.endObject();
        json.endObject();
                    JSONUtils.field(json, "custom", true);
                if (attr.isCustom()) {
                    JSONUtils.serializeObjectList(json, "values", Arrays.asList(color.getAttributeValues()));
                if (!ArrayUtils.isEmpty(color.getAttributeValues())) {
package org.jkiss.dbeaver.model.virtual;

            json.name(((DBVModel) object).getId());
            return;
            json.name("constraints");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
/**
 * limitations under the License.
                JSONUtils.fieldNE(json, "background2", color.getColorBackground2());
        }

        }
                if (color.isSingleColumn()) {
            }
 * You may obtain a copy of the License at
                json.beginObject();
        // Colors
import org.jkiss.utils.ArrayUtils;
                    JSONUtils.serializeStringList(json, "exclude", transformSettings.getExcludedTransformers());
            json.beginArray();
                json.beginObject();
}
                if (color.isRange()) {
            json.name("attributes");
            json.name("foreign-keys");
        // Containers
            serializeContainer(monitor, json, container);
                            }

                JSONUtils.fieldNE(json, "foreground", color.getColorForeground());

                    if (c.isUseAllColumns()) {
            for (DBVEntityConstraint c : entity.getConstraints()) {

            for (DBVEntityForeignKey fk : CommonUtils.safeCollection(entity.getForeignKeys())) {

        }
        }
