    @Property(viewable = true, order = 4)
    public static final String MYISAM = "MyISAM";
        throws SQLException
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return name;
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        this.support = CommonUtils.valueOf(
 * MySQLEngine
 *
    private Support support;
    @Override

        this.supportsXA = "YES".equals(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE_SUPPORT_XA));
        DISABLED
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        super(dataSource);
package org.jkiss.dbeaver.ext.mysql.model;
import org.jkiss.code.NotNull;
        this.loadInfo(dbResult);

    @NotNull

import java.sql.ResultSet;
    public MySQLEngine(MySQLDataSource dataSource, ResultSet dbResult)
        DEFAULT,
    public MySQLEngine(MySQLDataSource dataSource, String name) {
    }
        this.supportsSavepoints = "YES".equals(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE_SUPPORT_SAVEPOINTS));
    }
public class MySQLEngine extends MySQLInformation {
        YES,
import org.jkiss.utils.CommonUtils;
    public enum Support {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean supportsTransactions;
 */
    {
    private void loadInfo(ResultSet dbResult)
 * You may obtain a copy of the License at
        return description;
        this.name = name;
        super(dataSource);

/**
    public String getDescription()
    }
    @Property(viewable = true, order = 6)
        return support;
import org.jkiss.dbeaver.model.meta.Property;
import java.sql.SQLException;

    public boolean isSupportsXA()
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, order = 1)
    private String name;
    public String getName()
/*
        this.description = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE_DESCRIPTION);
import org.jkiss.code.Nullable;

        throws SQLException
 * you may not use this file except in compliance with the License.
        NO,
            Support.YES);
            JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE_SUPPORT),
    }

    {
    private boolean supportsXA;
    private String description;


    public boolean isSupportsSavepoints()

 *
    }

//    @Property(name = "Description", viewable = true, order = 100)
    public Support getSupport() {
 *
 * See the License for the specific language governing permissions and
    {
        this.supportsTransactions = "YES".equals(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE_SUPPORT_TXN));
        this.name = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ENGINE_NAME);
 */
        return supportsSavepoints;

    @Property(viewable = true, order = 3)
    }
    public boolean isSupportsTransactions()
        return supportsXA;
    @Override
 * limitations under the License.
}
    }
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 5)
            Support.class,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private boolean supportsSavepoints;

    {
 * Unless required by applicable law or agreed to in writing, software
    {
    }
    }
    @Nullable


        return supportsTransactions;

