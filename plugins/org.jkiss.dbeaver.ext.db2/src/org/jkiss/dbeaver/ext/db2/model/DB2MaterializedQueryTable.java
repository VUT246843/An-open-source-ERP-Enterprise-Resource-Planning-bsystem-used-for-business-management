 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TableRefreshMode;
    public Timestamp getRefreshTime()
    }
    public List<DB2TableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    {

    }
 *
    public JDBCStructCache<DB2Schema, DB2MaterializedQueryTable, DB2TableColumn> getCache()

        this.refreshMode = CommonUtils.valueOf(DB2TableRefreshMode.class, JDBCUtils.safeGetString(dbResult, "REFRESH"));

import org.jkiss.utils.CommonUtils;

 * Unless required by applicable law or agreed to in writing, software
    // Constructors
    // -----------------
import org.jkiss.dbeaver.model.meta.Property;

    {
 * @author Denis Forveille
}
import org.jkiss.dbeaver.DBException;
 *
import org.jkiss.code.Nullable;

/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.Timestamp;

import java.util.List;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }

    @Override
    private Timestamp           refreshTime;
    @Property(viewable = true, editable = false, order = 103)
    @Override
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException

    public DB2TableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    // Business Contract

public class DB2MaterializedQueryTable extends DB2ViewBase implements DB2SourceObject {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        return getContainer().getMaterializedQueryTableCache();
        this.refreshTime = JDBCUtils.safeGetTimestamp(dbResult, "REFRESH_TIME");
    // -----------------
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
        getContainer().getMaterializedQueryTableCache().clearChildrenCache(this);
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
 * limitations under the License.
 */
    @Override
/*
        return refreshMode;
import org.jkiss.dbeaver.model.struct.DBSObject;
    private DB2TableRefreshMode refreshMode;
    {
        return getContainer().getMaterializedQueryTableCache().getChild(monitor, getContainer(), this, attributeName);
        return refreshTime;
    {
    // Properties
    @Property(viewable = true, editable = false, order = 102)



        return getContainer().getMaterializedQueryTableCache().refreshObject(monitor, getContainer(), this);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DB2TableRefreshMode getRefreshMode()
    // -----------------

    // -----------------
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.refreshObject(monitor);
    @Override
import java.sql.ResultSet;
    @Override
import org.jkiss.code.NotNull;
    public boolean isView()
    // -----------------
 */
    }
    // -----------------
 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.ext.db2.model;

    }

    {
 * DB2 MQT
    public DB2MaterializedQueryTable(DBRProgressMonitor monitor, DB2Schema schema, ResultSet dbResult)
    }
        super(monitor, schema, dbResult);
    {
        return true; // DF: Not sure of that..
 * You may obtain a copy of the License at
        return getContainer().getMaterializedQueryTableCache().getChildren(monitor, getContainer(), this);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *


 * 
