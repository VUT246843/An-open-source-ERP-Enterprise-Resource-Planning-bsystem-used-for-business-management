        sb.append(" SEQUENCE ");
    public DamengSequence(
        long minValue,
    @Override
    public Long getIncrementBy() {
    public Long getMinValue() {
 * You may obtain a copy of the License at

        @Nullable String description,
        }
    }
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
    public String getDescription() {
        this.isOrder = JDBCUtils.safeGetBoolean(dbResult, "IS_ORDER");



    @Property(viewable = true, order = 3, editable = true)
        long lastValue,
}
    }
        return cacheSize;
        long maxValue,
        if (getIncrementBy() != null) {
    private String sql;
        }
    private long cacheSize;

import org.jkiss.code.NotNull;
 * limitations under the License.
        return isOrder;
        this.sql = null;
        sb.append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" ");

/*
    public boolean isOrder() {

    public boolean isCycle() {
            sb.append("ALTER");
import java.util.Map;
    }
    public long getCacheSize() {
import org.jkiss.dbeaver.model.meta.Property;
        return super.getDescription();
        }

        this.isCycle = JDBCUtils.safeGetBoolean(dbResult, "IS_CYCLE");
        long incrementBy,
        if (!isPersisted() && getMinValue() != null) {
        return super.getMaxValue().longValue();


import org.jkiss.dbeaver.model.struct.DBSObject;
    }
            sb.append("CREATE");

    }
    @Override
        if (forUpdate) {
        }
package org.jkiss.dbeaver.ext.dameng.model;
            sb.append("MINVALUE ").append(getMinValue()).append(" ");
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean isOrder;

    @Nullable
        return this;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPScriptObject;
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *
        @NotNull String name,
    public Long getMaxValue() {
 * See the License for the specific language governing permissions and
            sql = buildStatement(false);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 8)

    @Property(viewable = true, order = 7)
 * Licensed under the Apache License, Version 2.0 (the "License");
            sb.append("MAXVALUE ").append(getMaxValue()).append(" ");
    @Override
 *
    @NotNull
        if (getMinValue() != null) {
    }
    public String buildStatement(boolean forUpdate) {
    public DamengSequence(@NotNull GenericStructContainer container, @NotNull String name) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) {
    @Nullable
        super(container, name, description, lastValue, minValue, maxValue, incrementBy);
    @Override
    @Override

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Property(viewable = true, order = 4, editable = true, updatable = true)
        if (CommonUtils.isEmpty(sql)) {
        }

    private boolean isCycle;
        return super.getIncrementBy().longValue();
        return isCycle;
 * DBeaver - Universal Database Manager
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) {
        @NotNull JDBCResultSet dbResult
    }
        return sb.toString();
        StringBuilder sb = new StringBuilder();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
            sb.append("START WITH ").append(getMinValue()).append(" ");
        this.cacheSize = JDBCUtils.safeGetLong(dbResult, "CACHE_SIZE");
        } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
public class DamengSequence extends GenericSequence implements DBPSaveableObject, DBPScriptObject, DBPRefreshableObject {
        super(container, name);
            sb.append("INCREMENT BY ").append(getIncrementBy()).append(" ");
    @Property(viewable = true, order = 5, editable = true, updatable = true)
        @NotNull GenericStructContainer container,
    ) {
    }
import org.jkiss.dbeaver.model.DBPSaveableObject;
    @Property(viewable = true, order = 6)
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        if (getMaxValue() != null) {

        return sql;
        return super.getMinValue().longValue();
    }
import org.jkiss.code.Nullable;
