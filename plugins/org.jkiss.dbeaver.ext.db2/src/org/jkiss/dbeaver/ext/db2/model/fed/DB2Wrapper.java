import org.jkiss.utils.CommonUtils;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 5)
    }
    {
        this.version = JDBCUtils.safeGetInteger(dbResult, "WRAPVERSION");
import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 3)
    public String getRemarks()
import org.jkiss.dbeaver.ext.db2.DB2Constants;
import org.jkiss.dbeaver.model.meta.Property;
        this.name = JDBCUtils.safeGetString(dbResult, "WRAPNAME");
    private DB2WrapperType type;
        return type;

 *
    public DB2WrapperType getType()
import org.jkiss.dbeaver.model.meta.Association;
    }
    private String name;
/*
    {
    // -----------------
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectSimpleCache;
import java.sql.ResultSet;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return name;
 * See the License for the specific language governing permissions and
    public DB2Wrapper(DB2DataSource db2DataSource, ResultSet dbResult)
        optionsCache.clearCache();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *


    // -----------------
    private static final String C_OP = "SELECT * FROM SYSCAT.WRAPOPTIONS WHERE WRAPNAME = ? ORDER BY OPTION WITH UR";
    public String getName()

    @Property(viewable = true, order = 1)
    // -----------------
    // -----------------
    private String remarks;
    {
}
    @Override
    // -----------------
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collection;

    @Property(viewable = true, order = 2)

 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.remarks = JDBCUtils.safeGetString(dbResult, DB2Constants.SYSCOLUMN_REMARKS);
    @Association

package org.jkiss.dbeaver.ext.db2.model.fed;

        this.type = CommonUtils.valueOf(DB2WrapperType.class, JDBCUtils.safeGetString(dbResult, "WRAPTYPE"));
/**
    }
    public Collection<DB2WrapperOption> getOptions(DBRProgressMonitor monitor) throws DBException
    }
    private Integer version;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 *
    public Integer getVersion()
 * @author Denis Forveille
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;

public class DB2Wrapper extends DB2GlobalObject implements DBPRefreshableObject {
        optionsCache = new JDBCObjectSimpleCache<>(DB2WrapperOption.class, C_OP, name);


    // -----------------
 * DB2 Federated Wrapper
import org.jkiss.dbeaver.ext.db2.model.DB2GlobalObject;
        return optionsCache.getAllObjects(monitor, this);

    public String getLibrary()

    @NotNull

    // Associations

        super(db2DataSource, true);

 * You may obtain a copy of the License at
    {
        this.library = JDBCUtils.safeGetString(dbResult, "LIBRARY");
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
        return remarks;
    private final DBSObjectCache<DB2Wrapper, DB2WrapperOption> optionsCache;
 */
    @Property(viewable = true, order = 4)
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    // Constructors


        return library;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        return version;
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
    {
    // Properties

import org.jkiss.dbeaver.model.DBPRefreshableObject;
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * 
import org.jkiss.dbeaver.DBException;
    private String library;

 * you may not use this file except in compliance with the License.
    {
    }
    }
    {
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
        return this;
