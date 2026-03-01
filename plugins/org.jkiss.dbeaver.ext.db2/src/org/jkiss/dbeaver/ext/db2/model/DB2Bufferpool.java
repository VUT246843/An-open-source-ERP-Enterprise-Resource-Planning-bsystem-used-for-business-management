
    }
    }
    @Property(viewable = true, editable = false, order = 3)
    @Property(viewable = true, editable = false, order = 8)
    public Integer getnPages()
        this.id = JDBCUtils.safeGetInteger(dbResult, "BUFFERPOOLID");
        return nPages;
 *
    @Property(viewable = true, editable = false, order = 5)

 * Unless required by applicable law or agreed to in writing, software
 * DB2 Bufferpool
    private Integer pageSize;

    {
 * limitations under the License.
 */

        return name;
    {

    {




        this.nPages = JDBCUtils.safeGetInteger(dbResult, "NPAGES");
        return numBlockPages;
    public Integer getNumBlockPages()
    private String name;
    public String getName()
    // -----------------
        return id;

 */
    private Integer numBlockPages;
/**
 *
    {
 * 
    private Integer nPages;
    // Properties
    // Constructors
        return dbpgName;
    @Override
    public Integer getBlockSize()
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return blockSize;
        this.pageSize = JDBCUtils.safeGetInteger(dbResult, "PAGESIZE");
    private Integer blockSize;
    private Integer id;
        this.blockSize = JDBCUtils.safeGetInteger(dbResult, "BLOCKSIZE");
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.db2.model;
    }
    }
    @Property(viewable = true, editable = false, order = 4)
    @Property(viewable = true, editable = false, order = 7)
 * See the License for the specific language governing permissions and
    public Integer getId()
    {

        this.numBlockPages = JDBCUtils.safeGetInteger(dbResult, "NUMBLOCKPAGES");
        this.name = JDBCUtils.safeGetString(dbResult, "BPNAME");
    }
 * You may obtain a copy of the License at
    {
 *
    // -----------------
    // -----------------
    @Property(viewable = true, editable = false, order = 1)
        return pageSize;
    public DB2Bufferpool(DB2DataSource db2DataSource, ResultSet dbResult)
    {
        super(db2DataSource, true);
    {
        this.dbpgName = JDBCUtils.safeGetString(dbResult, "DBPGNAME");
 * @author Denis Forveille
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
public class DB2Bufferpool extends DB2GlobalObject {

    }
import org.jkiss.code.NotNull;
    @NotNull
    }

    // -----------------
    public Integer getPageSize()
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
/*
import java.sql.ResultSet;
}
    private String dbpgName;


 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    @Property(viewable = true, editable = false, order = 2)
    public String getDbpgName()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
