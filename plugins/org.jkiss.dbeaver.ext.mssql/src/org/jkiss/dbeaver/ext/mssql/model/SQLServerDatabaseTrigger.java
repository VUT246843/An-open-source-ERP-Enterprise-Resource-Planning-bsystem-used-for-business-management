}
import org.jkiss.dbeaver.model.DBUtils;
        super(database, name);
 * distributed under the License is distributed on an "AS IS" BASIS,

/*
        return getDatabase().getTriggerCache().refreshObject(monitor, getDatabase(), this);
        this.database = database;
package org.jkiss.dbeaver.ext.mssql.model;
 *
 *
    public SQLServerDatabaseTrigger(SQLServerDatabase database, SQLServerDatabaseTrigger source) {
/**
        SQLServerDatabase database,
    }
    }
            this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    public SQLServerDatabase getDatabase() {
    {
 * DBeaver - Universal Database Manager



    @NotNull
    }
import java.sql.ResultSet;
        this.database = database;
        return DBUtils.getFullQualifiedName(getDataSource(),
        super(database, source);
    }

    {
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
    public SQLServerDatabaseTrigger(
import org.jkiss.code.NotNull;

 * you may not use this file except in compliance with the License.
        String name)
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

    @NotNull
    SQLServerDatabaseTrigger(
    }
        return null;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        this.database = database;
 * You may obtain a copy of the License at
 *
    public SQLServerTable getTable()
        SQLServerDatabase database,
 */
        return database;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        super(database, dbResult);
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * SQLServerTableTrigger
        ResultSet dbResult)
public class SQLServerDatabaseTrigger extends SQLServerTriggerBase<SQLServerDatabase> {
            getDatabase(),
    }

    }
    @Override
    private SQLServerDatabase database;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;



    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
