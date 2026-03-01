    {
    @NotNull
        if (getDataSource().isAtLeastV9_5()) {
        this.lastRegenTime = JDBCUtils.safeGetTimestamp(dbResult, "LAST_REGEN_TIME");

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public Timestamp getAlterTime()
    // -----------------
import org.jkiss.code.NotNull;
    private Timestamp alterTime;

 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
    }
 * Unless required by applicable law or agreed to in writing, software
        this.text = JDBCUtils.safeGetString(dbResult, "TEXT");
    protected final DB2ViewBaseDepCache viewBaseDepCache = new DB2ViewBaseDepCache();

    @Association
    private DB2ViewStatus valid;
        super.refreshObject(monitor);

    @Override
    }
 * Base class for view-like objects (Views, MQT)
    @Property(viewable = true, editable = false, order = 20)

    @Property(hidden = true, editable = true, updatable = true, order = -1)
    @Property(viewable = false, editable = false, order = 103, category = DB2Constants.CAT_DATETIME)
    {
    public DB2ViewStatus getValid()
 */

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


import org.jkiss.code.Nullable;
 *
    // -----------------

    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException

import java.sql.Timestamp;
    }
    }
 * 
    @Override
        this.valid = CommonUtils.valueOf(DB2ViewStatus.class, JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_VALID));
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
 * DBeaver - Universal Database Manager
    {
    @Nullable
    public Timestamp getLastRegenTime()
import org.jkiss.dbeaver.ext.db2.model.dict.DB2ViewStatus;
 * limitations under the License.
    {
        return funcPath;
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
    }


    @NotNull

    // Business Contract
    }
    // -----------------

        return valid;
    @Property(viewable = false, editable = false, order = 102, category = DB2Constants.CAT_DATETIME)
        return this;
    {
import org.jkiss.dbeaver.ext.db2.model.cache.DB2ViewBaseDepCache;
        return invalidateTime;

        return viewBaseDepCache.getAllObjects(monitor, this);
    public String getDescription()
    public Collection<DB2ViewBaseDep> getViewDeps(DBRProgressMonitor monitor) throws DBException
 * See the License for the specific language governing permissions and
        viewBaseDepCache.clearCache();
            this.alterTime = JDBCUtils.safeGetTimestamp(dbResult, DB2Constants.SYSCOLUMN_ALTER_TIME);
    {
        return true;
        return lastRegenTime;
/*
public abstract class DB2ViewBase extends DB2TableBase implements DB2SourceObject, DBSView {
import org.jkiss.dbeaver.model.meta.Association;
    // -----------------

    }
    @Override
    @NotNull
    // Constructors
 *
    @Override
    // -----------------
import org.jkiss.dbeaver.model.exec.DBCException;
    @Property(viewable = false, editable = false, order = 101, category = DB2Constants.CAT_DATETIME)
package org.jkiss.dbeaver.ext.db2.model;
    public String getName()
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        this.funcPath = JDBCUtils.safeGetString(dbResult, "FUNC_PATH");
    public DBSObjectState getObjectState()

 * @author Denis Forveille
    @Property(viewable = false, editable = false, updatable = false, length = PropertyLength.MULTILINE)
        }
    private Timestamp invalidateTime;
    {
import java.sql.ResultSet;
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Property(viewable = false, editable = false, order = 20)
    public String getFuncPath()
/**
    // Source
        return valid.getState();
    // -----------------
    {
        return super.getName();
    }
        return SQLFormatUtils.formatSQL(getDataSource(), text);
    {
        super(monitor, schema, dbResult);
    @Override
 *
        return alterTime;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    // -----------------

import org.jkiss.dbeaver.model.struct.rdb.DBSView;
    // Association
 * you may not use this file except in compliance with the License.
    public boolean isView()
    private String text;
    // -----------------
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    // -----------------


import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
    public DB2ViewBase(DBRProgressMonitor monitor, DB2Schema schema, ResultSet dbResult)
    {
import java.util.Map;
    public Timestamp getInvalidateTime()


import org.jkiss.dbeaver.model.struct.DBSObjectState;

        this.invalidateTime = JDBCUtils.safeGetTimestamp(dbResult, "INVALIDATE_TIME");


import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // Properties
    @Property(viewable = true, editable = false, order = 1)
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return super.getDescription();
    }

 * You may obtain a copy of the License at
    {
}
    private String funcPath;
    @Override
    {
import org.jkiss.dbeaver.model.meta.PropertyLength;
    {


        setName(JDBCUtils.safeGetString(dbResult, "TABNAME"));
import java.util.Collection;
    // -----------------
    private Timestamp lastRegenTime;
    }
    }
