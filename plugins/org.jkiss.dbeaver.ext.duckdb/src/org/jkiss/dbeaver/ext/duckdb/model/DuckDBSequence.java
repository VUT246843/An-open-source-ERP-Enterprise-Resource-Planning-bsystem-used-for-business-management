        Number maxValue,
        if (CommonUtils.isEmpty(sql)) {

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return cycle;
import org.jkiss.dbeaver.model.meta.Property;
    public long getStartValue() {
        GenericStructContainer container,
import org.jkiss.dbeaver.ext.generic.model.GenericScriptObject;
    public boolean isTemporary() {
import org.jkiss.code.NotNull;
    private boolean temporary;
 *

    }
    }
import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
    private boolean cycle = false;
    @Property(viewable = true, order = 7)
        this.startValue = JDBCUtils.safeGetLong(dbResult, "start_value");
 *
public class DuckDBSequence extends GenericSequence implements DBPObjectWithLongId, GenericScriptObject {

    private long oid;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    }
import org.jkiss.dbeaver.model.DBPObjectWithLongId;
        return sql;


}
    }
        super(container, name);
import org.jkiss.utils.CommonUtils;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) {
        return startValue;
    public boolean isCycle() {

 */
        return temporary;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.sql = JDBCUtils.safeGetString(dbResult, "sql");
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * See the License for the specific language governing permissions and
        String name,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
        this.oid = JDBCUtils.safeGetLong(dbResult, "sequence_oid");
    }
        }
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.cycle = JDBCUtils.safeGetBoolean(dbResult, "cycle");
    @Override
    public long getObjectId() {
        super(container, name, description, lastValue, minValue, maxValue, incrementBy);

import org.jkiss.dbeaver.model.DBPEvaluationContext;
        Number minValue,
package org.jkiss.dbeaver.ext.duckdb.model;
        @NotNull JDBCResultSet dbResult
    @Property(viewable = true, order = 6)
        return oid;


        Number incrementBy,
 * limitations under the License.
 *
import java.util.Map;
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 8)
        String description,
    ) {
            sql = "CREATE SEQUENCE " + getFullyQualifiedName(DBPEvaluationContext.DDL);
        Number lastValue,
        this.temporary = JDBCUtils.safeGetBoolean(dbResult, "temporary");
    public DuckDBSequence(
    public DuckDBSequence(@NotNull GenericStructContainer container, @NotNull String name) {

    }
    private long startValue;
    @Property(viewable = true, order = 0)
 * you may not use this file except in compliance with the License.
    private String sql;
 * You may obtain a copy of the License at

    @NotNull

