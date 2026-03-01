 */
        }
 * DBeaver - Universal Database Manager
    @NotNull
            values[i] = attrValues.get(i).value;
        }
    public boolean equals(Object obj) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        }
    private final DBSAttributeBase attribute;
        return value;
 * limitations under the License.
    public DBDAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) {
        if (!CommonUtils.equalObjects(attribute.getName(), ((DBDAttributeValue) obj).attribute.getName())) {
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
        for (int i = 0; i < values.length; i++) {
    }
package org.jkiss.dbeaver.model.data;
        DBSAttributeBase[] attributes = new DBSAttributeBase[attrValues.size()];
        return values;
 * Unless required by applicable law or agreed to in writing, software
    {
    {

    }
        return attribute;
        }

    public static DBDAttributeValue getAttributeValue(List<DBDAttributeValue> valueList, DBSEntityAttribute attribute) {
    public String toString()
import org.jkiss.code.Nullable;
        }
        this.attribute = attribute;
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
        return attributes;
        for (int i = 0; i < attributes.length; i++) {
 *

    }
    public static Object[] getValues(List<DBDAttributeValue> attrValues)
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        final DBSAttributeBase[] attributes = new DBSAttributeBase[attrValues.length];



            return false;
        Object[] values = new Object[attrValues.size()];
        }
            attributes[i] = attrValues[i].getAttribute();
            attributes[i] = attrValues.get(i).attribute;
    @NotNull
        this.value = value;
        }
 *
                return value;

    }
    }

    private final Object value;
/**
            }
    }
 * You may obtain a copy of the License at

    public static Object[] getValues(@NotNull DBDAttributeValue[] attrValues) {
            values[i] = attrValues[i].getValue();

            if (CommonUtils.equalObjects(value.attribute.getName(), attribute.getName())) {
            return false;
        return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    @Nullable
    public DBSAttributeBase getAttribute() {
    }
 *
        if (obj == null || !(obj instanceof DBDAttributeValue)) {
        final Object[] values = new Object[attrValues.length];
    @Override
    }
            return false;
        return attributes;
        if (!CommonUtils.equalObjects(value, ((DBDAttributeValue) obj).value)) {
public class DBDAttributeValue {
    @NotNull

import org.jkiss.utils.CommonUtils;

 */
 * See the License for the specific language governing permissions and
    @Nullable
    public static DBSAttributeBase[] getAttributes(List<DBDAttributeValue> attrValues)

        return attribute.getName() + "=" + value;
/*
    public Object getValue() {
        for (int i = 0; i < attributes.length; i++) {
    public static DBSAttributeBase[] getAttributes(@NotNull DBDAttributeValue[] attrValues) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
}
        for (int i = 0; i < values.length; i++) {
    {
        return values;
import java.util.List;
 * you may not use this file except in compliance with the License.
        for (DBDAttributeValue value : valueList) {
        }
 * Column value
