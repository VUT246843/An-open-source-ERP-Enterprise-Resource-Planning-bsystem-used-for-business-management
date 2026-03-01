    public DB2TablespaceContainer(DB2Tablespace tablespace, ResultSet dbResult)
    {
 * DB2 Tablespace Container
    public DB2Tablespace getTablespace()
    @Property(viewable = true, editable = false, order = 4, category = DBConstants.CAT_STATISTICS)
    }
        super(tablespace, JDBCUtils.safeGetString(dbResult, "CONTAINER_NAME"), true);
    }
    // Properties

    @NotNull
}

    {
    }
    // -----------------
    }
    private String containerType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // -----------------------
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Property(viewable = true, editable = false, order = 2)
        return totalPages;
import java.sql.ResultSet;
        this.tablespace = tablespace;
        return tablespace;
 */
    // -----------------------
/**
    private final DB2Tablespace tablespace;
    {
    {
 * 
        this.containerId = JDBCUtils.safeGetLong(dbResult, "CONTAINER_ID");
    }
        this.containerType = JDBCUtils.safeGetString(dbResult, "CONTAINER_TYPE");

 * DBeaver - Universal Database Manager
    public String getContainerType()

 *     http://www.apache.org/licenses/LICENSE-2.0
    {

        return name;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.db2.model;
    @Property(viewable = true, editable = false, order = 5, category = DBConstants.CAT_STATISTICS)
    // -----------------
        this.usablePages = JDBCUtils.safeGetLong(dbResult, "USABLE_PAGES");

 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
    }
    private Long containerId;
import org.jkiss.dbeaver.model.DBConstants;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    @Property(viewable = true, editable = false, order = 3)
        return containerId;


 */
    public Long getTotalPages()
 * limitations under the License.
    private Long totalPages;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = false, order = 1)
    @Override
 * See the License for the specific language governing permissions and


    public Long getUsablePages()
    public String getName()
 *
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        this.totalPages = JDBCUtils.safeGetLong(dbResult, "TOTAL_PAGES");

    // Constructors
        return usablePages;
        return containerType;
/*
public class DB2TablespaceContainer extends DB2Object<DB2Tablespace> {
 *
 * you may not use this file except in compliance with the License.
    private Long usablePages;


    public Long getContainerId()

 *
import org.jkiss.dbeaver.model.meta.Property;
 * @author Denis Forveille
 * You may obtain a copy of the License at
    }
