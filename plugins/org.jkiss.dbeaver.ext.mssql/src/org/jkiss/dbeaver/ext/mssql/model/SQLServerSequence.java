 *     http://www.apache.org/licenses/LICENSE-2.0

        return schema;
    private boolean persisted;
    public DBSObject getParentObject() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 10)
    private SQLServerSchema schema;
    }
        return schema.getDataSource();
    public Number getLastValue() {
        this.maxValue = maxValue;
    private Number maxValue;
    @Property(viewable = true, order = 2)

public class SQLServerSequence implements DBSSequence, DBPQualifiedObject
    public String getDescription() {

        return description;
package org.jkiss.dbeaver.ext.mssql.model;
    }

 * SQLServerSequence
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
            schema,
/*
 *
import org.jkiss.dbeaver.model.DBUtils;
 * You may obtain a copy of the License at
        return lastValue;
    @Override

import org.jkiss.code.Nullable;

 * Unless required by applicable law or agreed to in writing, software
    @NotNull

 *

    public Number getMinValue() {
        this.lastValue = lastValue;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
 * DBeaver - Universal Database Manager
    private Number minValue;
        this.lastValue = lastValue;
    public Number getMaxValue() {
}
 *
            this);
        }
    @Nullable
        this.incrementBy = incrementBy;
    @Nullable
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.meta.PropertyLength;
        this.description = description;

    }
    @Override
        this.minValue = minValue;
    }

/**
    private Number lastValue;
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    @NotNull
    public String getName() {
        return minValue;
    public boolean isPersisted() {
import org.jkiss.dbeaver.model.meta.Property;
 * limitations under the License.
    }

    @NotNull
    }
    public SQLServerSequence(SQLServerSchema schema, long objectId, String name, Number lastValue, Number minValue, Number maxValue, Number incrementBy, boolean persisted) {
    @Override
    private long objectId;
        return name;
    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;

        this.schema = schema;
    @Property(viewable = true, order = 3)
            return DBUtils.getFullQualifiedName(getDataSource(), schema, this);
    }

 */
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
    @Override
            schema.getDatabase(),
        if (!SQLServerUtils.supportsCrossDatabaseQueries(getDataSource())) {
        return DBUtils.getFullQualifiedName(getDataSource(),
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Property(viewable = true, order = 1)
    @Override
        return incrementBy;
    private String description;
    @Property(viewable = true, order = 4)
        return true;
    @Override

    public void setLastValue(Number lastValue) {
        this.name = name;

 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
    private String name;
    }
 */
        this.persisted = persisted;
    }
    @Override
        return maxValue;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public SQLServerDataSource getDataSource() {
    @Override
    public Number getIncrementBy() {
{
        this.objectId = objectId;
    private Number incrementBy;
    @Property(viewable = true, order = 5)
    }
