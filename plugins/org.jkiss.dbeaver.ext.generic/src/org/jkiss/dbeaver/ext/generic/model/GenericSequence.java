        this.persisted = persisted;
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
package org.jkiss.dbeaver.ext.generic.model;
        return container;
    public Number getLastValue() {
        this.lastValue = lastValue;
        this.persisted = false;
            getDataSource(),
    @Nullable

        this.incrementBy = incrementBy;
 */
        this.maxValue = maxValue;
            this
    @Override
        return minValue;
    private final GenericStructContainer container;
        this.minValue = 1;
        this.incrementBy = 1;
    }
    }
            container.getSchema(),
 * Licensed under the Apache License, Version 2.0 (the "License");
        return DBUtils.getFullQualifiedName(
    }
import org.jkiss.code.Nullable;
    @Property(viewable = true, order = 4)
    }
    private boolean persisted;
    }
 * You may obtain a copy of the License at
        String name,
    @Override
    public void setPersisted(boolean persisted) {

    public void setIncrementBy(Number incrementBy) {
    public GenericSequence(@NotNull GenericStructContainer container, @NotNull String name) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
    @Property(viewable = true, order = 5)
    @Override
        this.maxValue = Long.MAX_VALUE;
    public void setMaxValue(Number maxValue) {
    public String getName() {
        return maxValue;
    @Override
import org.jkiss.code.NotNull;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 10)
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }


        this.minValue = minValue;
    @Property(viewable = true, order = 2)
 * you may not use this file except in compliance with the License.
        Number maxValue,
        Number lastValue,
 *
        return incrementBy;
        this.lastValue = 0;
    }
/*
        this.maxValue = maxValue;
/**
    @Property(viewable = true, order = 3)
        return persisted;
import org.jkiss.dbeaver.model.*;
    @Override
    }
}

        GenericStructContainer container,
 *


    }

    public Number getMaxValue() {
 * DBeaver - Universal Database Manager

    private Number maxValue;
    private String name;
    }
    @Override
        this.description = description;
    private String description;
        this.incrementBy = incrementBy;
    @Override
        this.lastValue = lastValue;
    private Number minValue;
 * See the License for the specific language governing permissions and
        this.minValue = minValue;

    public void setName(@NotNull String name) {
        return container.getDataSource();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 *
        );
        return description;
    public String getDescription() {

    public boolean isPersisted() {
        this.name = name;
        String description,
    @Override
    @NotNull
    public Number getIncrementBy() {
    }
    public Number getMinValue() {

        this.persisted = true;
    @NotNull

 * GenericSequence
        this.name = name;
    @Property(viewable = true, order = 1)
    }
    public void setMinValue(Number minValue) {

public class GenericSequence implements DBSSequence, DBPQualifiedObject, DBPNamedObject2, DBPSaveableObject {
        this.container = container;
import org.jkiss.dbeaver.model.meta.Property;

    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        this.container = container;
    private Number incrementBy;
    public GenericSequence(
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
            container.getCatalog(),
 * limitations under the License.
    }
        return lastValue;
    private Number lastValue;
    @Override
    }
    @Override


    public DBSObject getParentObject() {
    @Override
    @Override
        return name;
        Number minValue,

    // Constructor for newly created object
    public void setLastValue(Number lastValue) {

    }
 */
    }
    @NotNull
        this.name = name;

    public GenericDataSource getDataSource() {
        Number incrementBy
import org.jkiss.dbeaver.model.struct.DBSObject;
