 *
            if (value instanceof Comparable && value.getClass() == lvp.value.getClass()) {
                return 0;
        this.value = value;
    private Object value;
 */
        return 0;
        }
    private final String label;
 * distributed under the License is distributed on an "AS IS" BASIS,
                return -1;
                return DBUtils.compareDataValues(value, lvp.value);


import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                return 1;

    public Object getValue() {
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.value = value;

 * DBeaver - Universal Database Manager
            }
/*
            }
            if (lvp.value == null) {
        this.label = label;
    public int compareTo(@NotNull Object o) {
 * limitations under the License.
        return value;
    public String toString() {
 * you may not use this file except in compliance with the License.
 */
/**

    }
 *
            if (value == lvp.value) {
    public void setValue(Object value) {

    @Override
        return label;
 *
            }
            }
            if (value == null) {
    public String getLabel() {
public class DBDLabelValuePair implements Comparable {
import org.jkiss.dbeaver.model.DBUtils;

    public DBDLabelValuePair(String label, Object value) {
    }
        return value + " (" + label + ")";
        if (o instanceof DBDLabelValuePair) {
    }
}
            final DBDLabelValuePair lvp = (DBDLabelValuePair) o;
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
package org.jkiss.dbeaver.model.data;
    }
 * Label value pair
 * You may obtain a copy of the License at
    }
 * Unless required by applicable law or agreed to in writing, software


