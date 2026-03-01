
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
        }
        return description;
    public void setDescription(String description) {
        @Override
        if (getDataSource().isServerVersionAtLeast(2, 0)) {
            this.dataType = JDBCUtils.safeGetString(dbResult, "DATA_TYPE");
    private long startValue;

    }
            this.startValue = JDBCUtils.safeGetLong(dbResult, "START_VALUE");
        return startValue;
        this.description = description;
    private boolean isCycle;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Unless required by applicable law or agreed to in writing, software
        return dataType;
    private String dataType;


 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0

            this.cache = JDBCUtils.safeGetLong(dbResult, "CACHE");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.code.Nullable;
public class H2Sequence extends GenericSequence {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(container, name, description, lastValue, minValue, maxValue, incrementBy);
        public boolean isValidValue(@NotNull H2Sequence object, @Nullable Object value) throws IllegalArgumentException {
    @Property(viewable = true, order = 5, visibleIf = H2SequenceFieldsValueValidator.class)

import org.jkiss.code.NotNull;

    @Property(viewable = true, order = 7, visibleIf = H2SequenceFieldsValueValidator.class)

    @Override
 *
    public static class H2SequenceFieldsValueValidator implements IPropertyValueValidator<H2Sequence, Object> {
        return cache;
    @Property(viewable = true, editable = true, updatable = true, order = 5, length = PropertyLength.MULTILINE)
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;

 * you may not use this file except in compliance with the License.
        return isCycle;
    private long cache;
 * See the License for the specific language governing permissions and
    public String getDescription() {
    public String getDataType() {
    public boolean isCycle() {
    }
 *
import org.jkiss.utils.CommonUtils;
    }
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        this.description = description;
    H2Sequence(GenericStructContainer container, String name, String description, Number lastValue, Number minValue, Number maxValue, Number incrementBy, @NotNull JDBCResultSet dbResult) {
 * limitations under the License.
    }

 *
    private String description;
 * Copyright (C) 2010-2025 DBeaver Corp and others

            return object.getDataSource().isServerVersionAtLeast(2, 0);
    public long getStartValue() {
    @Nullable
 * DBeaver - Universal Database Manager
/*
    }
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, order = 6, visibleIf = H2SequenceFieldsValueValidator.class)
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ext.h2.model;
        }
    }
    public long getCache() {
            this.isCycle = CommonUtils.getBoolean(JDBCUtils.safeGetString(dbResult, "CYCLE_OPTION"), false);
    }
 */
    @Property(viewable = true, order = 8, visibleIf = H2SequenceFieldsValueValidator.class)
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
