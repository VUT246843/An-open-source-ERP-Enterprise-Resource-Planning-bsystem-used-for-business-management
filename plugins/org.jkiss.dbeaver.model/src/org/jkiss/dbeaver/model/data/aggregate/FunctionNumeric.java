
public abstract class FunctionNumeric implements IAggregateFunction {
            try {
        return null;
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!(value instanceof Number)) {
            return (Number) value;
    }
                value = num;
        if (value instanceof Number) {
            if (num != null) {
        if (!aggregateAsStrings) {
        }
    protected static Number getNumeric(Object value) {
                // Not a number. Its ok, do not warn  
    }
 */
        }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
            }
 * FunctionSum
            }
}
        }
                return null;
            }
 * DBeaver - Universal Database Manager
        }

            return null;
package org.jkiss.dbeaver.model.data.aggregate;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        }
    protected static Comparable<?> getComparable(Object value, boolean aggregateAsStrings) {
            String strValue = value.toString();
/*
                value = Double.parseDouble(strValue);
            Number num = FunctionNumeric.getNumeric(value);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        if (value == null) {
            return (Comparable<?>)value;
            if (strValue == null) {
            } catch (NumberFormatException e) {
 *
        if (value instanceof Comparable) {
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        return null;

