    @Property(viewable = true, order = 2)

    public OracleTrigger getParentObject()
        this.name = JDBCUtils.safeGetString(dbResult, "TRIGGER_COLUMN_NAME");
    @Override
    @Override
    @Override
/**
    public OracleTriggerColumn(

{
        ResultSet dbResult) throws DBException
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public OracleDataSource getDataSource()
 */
public class OracleTriggerColumn extends AbstractTriggerColumn
 * Unless required by applicable law or agreed to in writing, software
    private OracleTrigger trigger;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }

    {
    @Override
    }

 *


    OracleTriggerColumn(OracleTrigger trigger, OracleTriggerColumn source)
import org.jkiss.dbeaver.Log;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    public OracleTrigger getTrigger()
    {
    }
 * limitations under the License.
 * You may obtain a copy of the License at
        return tableColumn;

        OracleTrigger trigger,
    @Override
import org.jkiss.code.Nullable;

    {

        this.columnList = JDBCUtils.safeGetBoolean(dbResult, "COLUMN_LIST", "YES");

    @Nullable
        this.columnList = source.columnList;
    public String toString() {
import org.jkiss.dbeaver.model.meta.Property;
        this.trigger = trigger;
    private boolean columnList;
    {
    {
    public OracleTableColumn getTableColumn()
 * See the License for the specific language governing permissions and


import java.sql.ResultSet;
        return trigger.getDataSource();
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
    {
        return trigger;
    public int getOrdinalPosition()
    @Override
    private OracleTableColumn tableColumn;
    @Override
import org.jkiss.dbeaver.model.impl.struct.AbstractTriggerColumn;
 * you may not use this file except in compliance with the License.
 */
    private String name;
package org.jkiss.dbeaver.ext.oracle.model;
        return 0;
 *
    public String getName()
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        DBRProgressMonitor monitor,
        this.tableColumn = source.tableColumn;
    @Property(viewable = true, order = 1)
import org.jkiss.code.NotNull;
        return tableColumn.getDescription();
 * OracleTriggerColumn
        this.tableColumn = tableColumn;

    }
    {
    private static final Log log = Log.getLog(OracleTriggerColumn.class);
        return trigger;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
    }

    @NotNull
}
    @Override
    public String getDescription()
/*
        OracleTableColumn tableColumn,
        return getName();
    }
    {
        this.trigger = trigger;
    @NotNull
    }
        return name;
