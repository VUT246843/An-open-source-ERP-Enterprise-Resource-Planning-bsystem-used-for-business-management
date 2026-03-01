import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
        } else if (value instanceof Float && (value.floatValue() <= 0.0 || value.floatValue() == Float.MAX_VALUE)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else if ((value.longValue() <= 0 || value.longValue() == Long.MAX_VALUE || value.longValue() == Integer.MAX_VALUE)) {
        }

 *
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSObject;

        if (value instanceof Double && (value.doubleValue() <= 0.0 || value.doubleValue() == Double.MAX_VALUE)) {
 */
import org.jkiss.code.Nullable;
public class DBDummyNumberTransformer implements IPropertyValueTransformer<DBSObject, Number> {
    @Nullable
            return null;
 * limitations under the License.
 */
/*
 *
        }
    @Override
        if (value == null) {

 * Shows numeric value if it is greater than zero and not MAX_VALUE
        return value;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
    }
}

 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.model.impl;
            return null;
            return null;
 *
    public Number transform(@NotNull DBSObject object, @Nullable Number value) {
            return null;
 * Unless required by applicable law or agreed to in writing, software
