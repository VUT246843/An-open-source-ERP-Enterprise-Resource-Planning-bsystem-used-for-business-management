
        this.startValue = JDBCUtils.safeGetBigDecimal(dbResult, "current_val");
        return incrementBy;
        this.cachedNum = JDBCUtils.safeGetInteger(dbResult, "cached_num");

    public String getDescription() {
    @Override
        this.maxValue = new BigDecimal(Long.MAX_VALUE);
    @Property(hidden = true)
    }
    @Override
    public CubridUser getOwner() {
    public int getCachedNum() {
    public BigDecimal getMinValue() {
        this.owner = (CubridUser) container;
    }
        return maxValue;
        this.incrementBy = new BigDecimal(1);

 * limitations under the License.
    public CubridSequence(

    }

import org.jkiss.dbeaver.model.meta.PropertyLength;
    @NotNull


    public void setMaxValue(@NotNull BigDecimal maxValue) {
        this.description = description;
    public String getName() {
    @NotNull
    }
import org.jkiss.code.Nullable;
    @Property(viewable = true, editable = true, order = 1)
    @Property(viewable = true, editable = true, updatable = true, order = 3)
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    public void setCycle(@NotNull boolean cycle) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return super.getName();

    @NotNull
        }
    private int cachedNum;
            @NotNull String name,
    @Property(viewable = true, order = 2)
    @Property(viewable = true, editable = true, updatable = true, order = 5)

            @NotNull JDBCResultSet dbResult) {
    @Property(viewable = true, editable = true, updatable = true, order = 8)
    public BigDecimal getMaxValue() {
        this.owner = (CubridUser) container;
 * You may obtain a copy of the License at
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 10)
        super(container, name);
        this.minValue = JDBCUtils.safeGetBigDecimal(dbResult, "min_val");
 *
        this.cachedNum = 0;

    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @NotNull
    }

    @Property(viewable = true, editable = true, updatable = true, order = 6)
    public BigDecimal getIncrementBy() {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    }

        this.maxValue = maxValue;
    private CubridUser owner;
public class CubridSequence extends GenericSequence {
    private BigDecimal startValue;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setCachedNum(@NotNull int cachedNum) {
 * See the License for the specific language governing permissions and
    @Override
    private BigDecimal incrementBy;
    @Property(viewable = true, editable = true, updatable = true, order = 7)
    @Override
        this.cachedNum = cachedNum;
        this.incrementBy = JDBCUtils.safeGetBigDecimal(dbResult, "increment_val");
    @NotNull
    public void setMinValue(@NotNull BigDecimal minValue) {
package org.jkiss.dbeaver.ext.cubrid.model;
}
        this.cycle = JDBCUtils.safeGetBoolean(dbResult, "cyclic");
        } else {

 */
    public void setDescription(@Nullable String description) {
    @NotNull
    }
        this.cycle = false;
    public BigDecimal getStartValue() {
        this.cycle = cycle;
    }
    }
        this.maxValue = JDBCUtils.safeGetBigDecimal(dbResult, "max_val");

    public boolean getCycle() {
        return null;
 * DBeaver - Universal Database Manager
        return owner;
    }
    public void setIncrementBy(@NotNull BigDecimal incrementBy) {
        return cachedNum;
    }
    }
    @NotNull
            return DBUtils.getFullQualifiedName(getDataSource(), this);
    @Nullable
    @Override
/*

    }
    }
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.meta.Property;
    @NotNull
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
        this.minValue = minValue;
import java.math.BigDecimal;
    }

    public CubridSequence(@NotNull GenericStructContainer container, @NotNull String name) {
    public Number getLastValue() {
    private String description;

        return cycle;
 * you may not use this file except in compliance with the License.
        return minValue;
        this.startValue = startValue;
            return DBUtils.getQuotedIdentifier(this.getOwner()) + "." + DBUtils.getFullQualifiedName(getDataSource(), this);
    }
            @NotNull GenericStructContainer container,
    private boolean cycle;
    @Property(viewable = true, editable = true, updatable = true, order = 4)
    @Override
        return startValue;
        this.description = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);
        if (((CubridDataSource) owner.getDataSource()).getSupportMultiSchema()) {
    private BigDecimal minValue;
        return description;
        super(container, name, "", null, null, null, null);

 *

    }
        this.incrementBy = incrementBy;
    public void setStartValue(@NotNull BigDecimal startValue) {
        this.minValue = new BigDecimal(1);
import org.jkiss.dbeaver.model.DBPEvaluationContext;


    @Override
    @NotNull
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
    }
    private BigDecimal maxValue;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.startValue = new BigDecimal(1);
