            .map(Object::toString)
        return type;
    public boolean isNull() {


    public String toString() {
import org.jkiss.dbeaver.model.struct.DBSDataType;
    ) throws DBCException {
    @NotNull
    @Override
    }
    }
import org.jkiss.code.Nullable;
            this.values = new Object[values.length];


        }
        if (values != null) {

                final Object value = values[i];
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull ClickhouseTupleType type,
        String elements = Arrays.stream(values)
 * DBeaver - Universal Database Manager
    @Override
    private final ClickhouseTupleType type;
 * See the License for the specific language governing permissions and
    }
    }
        if (values == null) {
    private Object[] values;
    public Object getRawValue() {
    @Override
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseTupleType;
import org.jkiss.dbeaver.model.exec.DBCException;
 *

/*
    }
package org.jkiss.dbeaver.ext.clickhouse.model.data;
 */
                    this.values[i] = ((DBDValueCloneable) value).cloneValue(monitor);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return modified;
        }
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;

    }

    private boolean modified;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .collect(Collectors.joining(", "));
    }
    @Override
        }
        @Nullable Object[] values
        return values;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        values[attribute.getOrdinalPosition()] = value;
    @Override
        return type.getAttributes().toArray(DBSAttributeBase[]::new);

        values = null;
    public void setAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) {

    public ClickhouseTupleValue(
    public void release() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.data.DBDComposite;
 * limitations under the License.
    @Override
            return values[attribute.getOrdinalPosition()];
            return null;

    public DBSDataType getDataType() {


    @Override
}
public class ClickhouseTupleValue implements DBDComposite, DBDValueCloneable {
    }

        return new ClickhouseTupleValue(monitor, type, values);
        return values == null;
import org.jkiss.dbeaver.model.data.DBDValueCloneable;
 *
                }
                    this.values[i] = value;
    }
    @Override
        return "(" + elements + ")";
    @Nullable
            values = new Object[type.getAttributes().size()];
    public DBDValueCloneable cloneValue(DBRProgressMonitor monitor) throws DBCException {
        this.type = type;
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (values == null) {
        modified = true;
    public DBSAttributeBase[] getAttributes() {




    }
        @NotNull DBRProgressMonitor monitor,
        } else {
                } else {
                if (value instanceof DBDValueCloneable) {
            for (int i = 0; i < values.length; i++) {
    public boolean isModified() {
            }
import java.util.stream.Collectors;
    public Object getAttributeValue(@NotNull DBSAttributeBase attribute) {
    @Override
import java.util.Arrays;
 *     http://www.apache.org/licenses/LICENSE-2.0
