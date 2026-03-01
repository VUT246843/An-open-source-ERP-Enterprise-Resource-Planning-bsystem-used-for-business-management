        }
        if (ownerName != null) {

    @Override
        this.columns = columns;

    public Collection<OracleTriggerColumn> getColumns() {

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (this.ownerSchema == null) {
import org.jkiss.dbeaver.model.meta.Property;
    }
            if (this.ownerSchema == null) {
    }
        return columns;
        return parent;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.meta.Association;
 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.code.NotNull;
    {
        super(table, dbResult);
 * See the License for the specific language governing permissions and
                log.warn("Trigger owner schema '" + ownerName + "' not found");
 * limitations under the License.
        super(table, name);
    @Override
 *
/**
import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        ownerSchema = table.getSchema();
    public OracleSchema getSchema() {
            this.ownerSchema = table.getDataSource().schemaCache.getCachedObject(ownerName);
 */
        OracleTableBase table,
 * Unless required by applicable law or agreed to in writing, software
        String ownerName = JDBCUtils.safeGetStringTrimmed(dbResult, "OWNER");
    public OracleTableTrigger(
    @Association
 */

import java.util.List;
/*
        }
import java.sql.ResultSet;
    {
 *
    private List<OracleTriggerColumn> columns;
        ResultSet dbResult)
    }
 * You may obtain a copy of the License at
    }
{
    private OracleSchema ownerSchema;
    @Nullable
public class OracleTableTrigger extends OracleTrigger<OracleTableBase>
        return this.ownerSchema;
    }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * OracleTableTrigger
            }
 *
    public OracleTableTrigger(OracleTableBase table, String name)
    {
    private static final Log log = Log.getLog(OracleTableTrigger.class);

    public void setColumns(@NotNull List<OracleTriggerColumn> columns) {
    public OracleTableBase getTable()
    }
import org.jkiss.dbeaver.Log;

    @Property(viewable = true, order = 4)
import org.jkiss.code.Nullable;
            this.ownerSchema = table.getSchema();
}
package org.jkiss.dbeaver.ext.oracle.model;
 * you may not use this file except in compliance with the License.
