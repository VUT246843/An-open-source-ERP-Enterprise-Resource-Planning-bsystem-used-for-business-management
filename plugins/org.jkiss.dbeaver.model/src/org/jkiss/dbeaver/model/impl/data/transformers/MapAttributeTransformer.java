 * limitations under the License.
        DBDAttributeBinding topAttribute,
import org.jkiss.dbeaver.DBException;
                }
 */
    }
        ) {
                        valueList[i] = composite.getAttributeValue(attr);
            }
                    if (DBUtils.isNullValue(values[i])) {
            }
    private static final boolean FILTER_SIMPLE_COLLECTIONS = false;
            topAttribute.setNestedBindings(nestedBindings);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBUtils;
            if (value instanceof DBDComposite composite) {
                            valueList);
 *
        }

        List<DBDAttributeBinding> nestedBindings = topAttribute.getNestedBindings();

}

                    // Skip empty collections - we can't get any info out of them
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBCSession session,
        // Analyse rows and extract meta information from values
                    value = collection.getItem(0);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                        attrValue.getSecond()[i] = composite.getAttributeValue(attr);
        }
                    if (attribute.getDataKind() == DBPDataKind.ARRAY && CommonUtils.isEmpty(attribute.getNestedBindings())) {


            DBSAttributeBase attribute = nestedAttr.getFirst();

            // Do not transform structs to avoid double transformation
        }
                return pair;
            if (pair.getFirst().getName().equals(attr.getName())) {
        List<Pair<DBSAttributeBase, Object[]>> valueAttributes = null;
 *
            // Make a fake row with empty document in it
import org.jkiss.code.NotNull;
                attribute -> {
                pair.setFirst(DBUtils.getMoreCommonType(pair.getFirst(), attr));

            DBDAttributeBinding nestedBinding = DBUtils.findObject(nestedBindings, attribute.getName());
            }
                            valueAttributes.add(attributePair);
                        }
                for (int i = 0; i < values.length; i++) {
        }
                    return false;
        List<Object[]> fakeRows = Collections.singletonList(fakeRow);
        @NotNull DBSAttributeBase attr,
                        Pair<DBSAttributeBase, Object[]> attributePair = new Pair<>(
            !CommonUtils.isEmpty(attribute.getNestedBindings()) &&
import org.jkiss.dbeaver.model.exec.DBCSession;
    @Override
                            attr,
        for (Pair<DBSAttributeBase, Object[]> nestedAttr : nestedAttributes) {

                        }
            }
            } else {
        }
            DBDAttributeBinding nestedBinding = DBUtils.findObject(nestedBindings, attribute.getName());
                }
                    }
                nestedBinding = new DBDAttributeBindingType(topAttribute, attribute, nestedBindings.size());
        int maxPosition = 0;

    {
        if (rows.isEmpty()) {
        if (attribute.getDataKind() == DBPDataKind.STRUCT &&
                            valueAttributes = new ArrayList<>();
        @Nullable List<Pair<DBSAttributeBase, Object[]>> valueAttributes)
                });
                // Make late binding for each row value
                    Pair<DBSAttributeBase, Object[]> attrValue = findAttributeValue(attr, valueAttributes);
 */
        if (!session.getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES)) {
import java.util.ArrayList;
        if (nestedBindings == null) {
    }
                DBDCollection collection = (DBDCollection) value;
        }
import java.util.Map;
        List<Pair<DBSAttributeBase, Object[]>> nestedAttributes,
import org.jkiss.utils.CommonUtils;
        if (valueAttributes == null) {
            }
                for (DBSAttributeBase attr : attributes) {
 * You may obtain a copy of the License at

                nestedBindings.add(nestedBinding);
        if (valueAttributes != null && !valueAttributes.isEmpty()) {
            if (nestedBinding == null) {
            maxPosition = Math.max(maxPosition, nestedBinding.getOrdinalPosition());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                } else {
import org.jkiss.dbeaver.model.data.*;
        }
    static void resolveMapsFromData(DBCSession session, DBDAttributeBinding attribute, List<Object[]> rows) throws DBException {
/**
                nestedBindings.add(nestedBinding);
        }
            nestedBindings = new ArrayList<>();
        }
            resolveMapsFromData(session, attribute, rows);
        for (Pair<DBSAttributeBase, Object[]> pair : valueAttributes) {
            fakeRow[attrIndex] = attribute.getValueHandler().createNewValueObject(session, attribute);
                    fakeRow[nestedBinding.getOrdinalPosition()] = values[i];
        return null;
            createNestedMapBindings(session, attribute, valueAttributes, rows);
            resolveMapsFromData(session, attribute, Collections.singletonList(fakeRow));
            nestedBindings.removeIf(
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {
                }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
            if (nestedBinding == null) {

import org.jkiss.dbeaver.ModelPreferences;
                        // Update attr value
                        continue;
    {
import org.jkiss.code.Nullable;
        if (!nestedBindings.isEmpty()) {
import java.util.List;
 * Transforms attribute of map type into hierarchy of attributes
            // Remove empty collection attributes from nested bindings
        }
                        Object[] valueList = new Object[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
/*
                    nestedBinding.lateBinding(session, fakeRows);
                if (collection.getItemCount() > 0) {
 * DBeaver - Universal Database Manager
                // Fill value attributes for all rows
                nestedBinding.lateBinding(session, fakeRows);
 * Unless required by applicable law or agreed to in writing, software
            !session.getDataSource().getInfo().isDynamicMetadata()
                        } else {
            DBSAttributeBase attribute = nestedAttr.getFirst();

        Object[] fakeRow = new Object[maxPosition + 1];
import org.jkiss.dbeaver.model.DBPDataKind;

import org.jkiss.utils.Pair;
            return null;
        } else {

            if (attribute.getDataKind().isComplex()) {
            }
                        if (valueAttributes.size() >= attr.getOrdinalPosition()) {
                // Use first element to discover structure
import java.util.Collections;

            if (value instanceof DBDCollection) {
                        return true;
        }
                            valueAttributes.add(attr.getOrdinalPosition(), attributePair);
                    if (attrValue != null) {
    }
            maxPosition = Math.max(maxPosition, attribute.getOrdinalPosition());
 * See the License for the specific language governing permissions and

        for (Pair<DBSAttributeBase, Object[]> nestedAttr : nestedAttributes) {
            Object[] values = nestedAttr.getSecond();
 * you may not use this file except in compliance with the License.
            // They can't be used anyway
                    } else {
        if (FILTER_SIMPLE_COLLECTIONS) {
            return;
public class MapAttributeTransformer implements DBDAttributeTransformer {
                DBSAttributeBase[] attributes = composite.getAttributes();
    private static Pair<DBSAttributeBase, Object[]> findAttributeValue(
                    }
        }
                nestedBinding = new DBDAttributeBindingType(topAttribute, attribute, nestedBindings.size());
    }
                        if (valueAttributes == null) {
                    continue;
            Object[] fakeRow = new Object[attrIndex + 1];
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static void createNestedMapBindings(
        List<Object[]> rows) throws DBException
            int attrIndex = attribute.getOrdinalPosition();
package org.jkiss.dbeaver.model.impl.data.transformers;
            Object value = rows.get(i)[attribute.getOrdinalPosition()];
            return;
