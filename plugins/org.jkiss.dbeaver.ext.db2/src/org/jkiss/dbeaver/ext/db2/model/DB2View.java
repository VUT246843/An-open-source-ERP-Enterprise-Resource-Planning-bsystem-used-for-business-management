    @Override
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }


 * you may not use this file except in compliance with the License.
        return super.getTableId();
}
    @Override
public class DB2View extends DB2ViewBase implements DB2SourceObject {

/**
import org.jkiss.dbeaver.model.meta.Property;
 */
    public JDBCStructCache<DB2Schema, DB2View, DB2TableColumn> getCache()
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.utils.CommonUtils;
 * See the License for the specific language governing permissions and
    {
    // -----------------
        return readOnly;
    @Property(viewable = true, editable = false, order = 22)
    public boolean isView()
 * DB2 View


    // -----------------

 * Unless required by applicable law or agreed to in writing, software
    // Business Contract
    public DB2ViewCheck getViewCheck()
    public Integer getTableId()

    }
    }

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
        return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
    // -----------------
 * DBeaver - Universal Database Manager
    }
 * @author Denis Forveille

import org.jkiss.dbeaver.model.struct.DBSObject;
    }
 *
        this.viewCheck = CommonUtils.valueOf(DB2ViewCheck.class, JDBCUtils.safeGetString(dbResult, "VIEWCHECK"));
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    {
import java.util.List;
    // -----------------
    @Property(hidden = true)
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return getContainer().getViewCache();
    {
    @Property(viewable = true, editable = false, order = 21)

 * limitations under the License.

        super.refreshObject(monitor);
    }
    public Boolean getReadOnly()
    }
package org.jkiss.dbeaver.ext.db2.model;


        return viewCheck;
 * 
    @Override
import org.jkiss.dbeaver.ext.db2.model.dict.DB2YesNo;
    @Override
    // Constructors
import java.sql.ResultSet;
    {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    private DB2ViewCheck viewCheck;
import org.jkiss.dbeaver.ext.db2.editors.DB2SourceObject;
import org.jkiss.code.NotNull;
    public DB2TableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
        return getContainer().getViewCache().getChild(monitor, getContainer(), this, attributeName);

 *
 *
    // -----------------
        return getContainer().getViewCache().refreshObject(monitor, getContainer(), this);
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
import org.jkiss.code.Nullable;
        super(monitor, schema, dbResult);
        return getContainer().getViewCache().getChildren(monitor, getContainer(), this);
import org.jkiss.dbeaver.ext.db2.model.dict.DB2ViewCheck;

    @Override
        this.readOnly = JDBCUtils.safeGetBoolean(dbResult, "READONLY", DB2YesNo.Y.name());
    // Properties
    private Boolean      readOnly;
import org.jkiss.dbeaver.DBException;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0

    {
    @Override

 */
    public List<DB2TableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    // -----------------
    public DB2View(DBRProgressMonitor monitor, DB2Schema schema, ResultSet dbResult)
