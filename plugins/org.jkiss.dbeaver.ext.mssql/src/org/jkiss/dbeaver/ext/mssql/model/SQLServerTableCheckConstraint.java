 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void setAttributeReferences(List<DBSTableConstraintColumn> dbsTableConstraintColumns) throws DBException {
        this.definition = null;
    @Override
        return DBUtils.getFullQualifiedName(getDataSource(), getTable(), this);

 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.DBException;
public class SQLServerTableCheckConstraint extends AbstractTableConstraint<SQLServerTable, DBSTableConstraintColumn>

    public SQLServerDatabase getDatabase() {
 *
    }
    @Property(viewable = false, editable = true, order = 80)
 */
    @NotNull
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.definition = JDBCUtils.safeGetString(dbResult, "definition");

        this.objectId = JDBCUtils.safeGetLong(dbResult, "object_id");
import org.jkiss.code.Nullable;

        return definition;

import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    public List<DBSTableConstraintColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.disabled = JDBCUtils.safeGetInt(dbResult, "is_disabled") != 0;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * limitations under the License.

    @Override

    public SQLServerTableCheckConstraint(SQLServerTable table, JDBCResultSet dbResult) {
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
{
    private boolean disabled;

    @Override
    }
        return null;
    }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        super(table, null, null, DBSEntityConstraintType.CHECK);
import java.util.Map;
}
/*
        return getCheckConstraintDefinition();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public long getObjectId() {
    }
    public String getCheckConstraintDefinition() {

    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.DBUtils;
/**
        return getTable().getDataSource();
        this.disabled = false;
    }
    }


import java.util.List;
    @Override
    private String definition;
        return objectId;
    @Override
package org.jkiss.dbeaver.ext.mssql.model;
        super(table, JDBCUtils.safeGetString(dbResult, "name"), null, DBSEntityConstraintType.CHECK);
import org.jkiss.code.NotNull;
    @Property(viewable = true, editable = true, length = PropertyLength.MULTILINE, order = 20)
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
 * Unless required by applicable law or agreed to in writing, software
 * SQLServerTableCheckConstraint
import org.jkiss.dbeaver.model.meta.Property;
    public boolean isDisabled() {
    public SQLServerDataSource getDataSource() {
        this.objectId = -1;
 * See the License for the specific language governing permissions and
    @Property(viewable = false, editable = true, order = 10)
    @NotNull
    implements SQLServerObject, DBPScriptObject, DBSTableCheckConstraint
    @Override


    private long objectId;
        return getTable().getDatabase();
 *
 * DBeaver - Universal Database Manager
        return disabled;

    public SQLServerTableCheckConstraint(SQLServerTable table) {
        this.definition = expression;
    @Override
    @Nullable
    @NotNull
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
    public void setCheckConstraintDefinition(String expression) {
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraintColumn;
import org.jkiss.dbeaver.model.meta.PropertyLength;
