    @Override
    public boolean canEnable() {
        return isDisabled() && !(getParentObject() instanceof SQLServerView);
    @Override
 * limitations under the License.

    @Property(viewable = true, order = 4)
    @NotNull
            getSchema(),
public class SQLServerTableTrigger extends SQLServerTriggerBase<SQLServerTableBase> {
        return table.getSchema();
 * DBeaver - Universal Database Manager
    @NotNull
    private SQLServerTableBase table;
    public SQLServerTableTrigger(@NotNull SQLServerTableBase table, String name) {
    }
        return table;
        return DBUtils.getFullQualifiedName(getDataSource(),
    @Override

 * Unless required by applicable law or agreed to in writing, software
    public SQLServerTableBase getTable() {
        this.table = table;
}
    public SQLServerDatabase getDatabase() {
        return getTable().getSchema().getTriggerCache().refreshObject(monitor, getSchema(), this);
    public boolean canDisable() {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 */
        super(table, name);

        super(table, dbResult);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
/**
        return !isDisabled() && !(getParentObject() instanceof SQLServerView);
    @Override
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

    public SQLServerSchema getSchema() {

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
    public SQLServerTableTrigger(@NotNull SQLServerTableBase table, ResultSet dbResult) {
    }


 *
import org.jkiss.dbeaver.model.meta.Property;
        return table.getDatabase();
            this);

    }
 *

/*
 * SQLServerTableTrigger
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 */
    }
    }
        this.table = table;

 * You may obtain a copy of the License at

    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

import java.sql.ResultSet;
package org.jkiss.dbeaver.ext.mssql.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.DBUtils;
