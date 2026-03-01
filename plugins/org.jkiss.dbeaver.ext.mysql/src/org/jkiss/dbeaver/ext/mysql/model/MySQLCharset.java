
    public MySQLCollation getCollation(String name) {
    }
import org.jkiss.dbeaver.model.meta.Property;
    {
    private String name;
        return null;
    {
    @Property(viewable = true, order = 2)
            if (collation.getName().equals(name)) {
    }

import org.jkiss.dbeaver.model.DBUtils;
    private int maxLength;
        Collections.sort(collations, DBUtils.nameComparator());
 *
    {
    private List<MySQLCollation> collations = new ArrayList<>();
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        return maxLength;

 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    {
    @Property(viewable = true, order = 3)
import java.sql.SQLException;

        throws SQLException
    public int getMaxLength()
    @Override
    }
        for (MySQLCollation collation : collations) {

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.loadInfo(dbResult);
    public List<MySQLCollation> getCollations()
    @Override
import org.jkiss.dbeaver.model.meta.PropertyLength;
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        collations.add(collation);
        for (MySQLCollation collation : collations) {
    public MySQLCollation getDefaultCollation()
    @NotNull
 * you may not use this file except in compliance with the License.



        }

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            if (collation.isDefault()) {

        }
                return collation;
    private void loadInfo(ResultSet dbResult)
        throws SQLException
 * See the License for the specific language governing permissions and

public class MySQLCharset extends MySQLInformation {
    {
        this.name = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_CHARSET);
package org.jkiss.dbeaver.ext.mysql.model;
import org.jkiss.code.Nullable;

    {
/*
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.maxLength = JDBCUtils.safeGetInt(dbResult, MySQLConstants.COL_MAX_LEN);
import java.util.Collections;
    }

import java.util.ArrayList;
        return name;
/**
    public String getName()
import org.jkiss.code.NotNull;
 * MySQLCharset
    {
            }
                return collation;
        return description;
    void addCollation(MySQLCollation collation)
    public MySQLCharset(MySQLDataSource dataSource, ResultSet dbResult)
    @Nullable
        return null;

    }
            }
        super(dataSource);
import java.sql.ResultSet;
        return collations;
 *
 */
    @Property(viewable = true, order = 1)
}
        this.description = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_DESCRIPTION);
    public String getDescription()
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    }
    private String description;
 */
 * limitations under the License.
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
import java.util.List;
    {
