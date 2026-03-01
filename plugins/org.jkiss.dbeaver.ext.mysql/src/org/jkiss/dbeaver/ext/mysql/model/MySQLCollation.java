
 * You may obtain a copy of the License at
    public String getName()
    {

 * limitations under the License.
 *
        this.loadInfo(dbResult);
    {
public class MySQLCollation extends MySQLInformation {
/**
    public DBSObject getParentObject()
    private boolean isDefault;
    }
    public MySQLCollation(@NotNull MySQLCharset charset, ResultSet dbResult)
    {
 * you may not use this file except in compliance with the License.

        this.id = JDBCUtils.safeGetInt(dbResult, MySQLConstants.COL_ID);
    private int id;
        this.isCompiled = "Yes".equalsIgnoreCase(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_COMPILED));
    private final MySQLCharset charset;
    private int sortLength;
    @Override

}

        return isDefault;
    }
    public int getId()
 * See the License for the specific language governing permissions and
        this.sortLength = JDBCUtils.safeGetInt(dbResult, MySQLConstants.COL_SORT_LENGTH);
    }
        return name;
    @Property(viewable = true, order = 1)

    private boolean isCompiled;
        return null;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        throws SQLException
        return id;
    {
 * MySQLCollation
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.charset = charset;
    }
    }
    public boolean isDefault()

 *
    @Property(viewable = true, order = 2)
        super(charset.getDataSource());
    @Property(viewable = true, order = 4)

package org.jkiss.dbeaver.ext.mysql.model;
        return sortLength;
    public MySQLCharset getCharset()

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
/*
    private void loadInfo(ResultSet dbResult)
import java.sql.SQLException;

    {
    {
 *
    public boolean isCompiled()
        return charset;
    }

    @Property(viewable = true, order = 3)
    {

    public int getSortLength()
    }
    }
 * Unless required by applicable law or agreed to in writing, software

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    {
        return isCompiled;
    {
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws SQLException
    @Property(viewable = true, order = 5)
        return charset;
        this.name = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_COLLATION);
    public String getDescription()
    @NotNull
 */
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
 */
import org.jkiss.code.Nullable;

    }
 * DBeaver - Universal Database Manager
    private String name;
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
import java.sql.ResultSet;
        this.isDefault = "Yes".equalsIgnoreCase(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_DEFAULT));
import org.jkiss.dbeaver.model.struct.DBSObject;
    {
    @Property(viewable = true, order = 6)
