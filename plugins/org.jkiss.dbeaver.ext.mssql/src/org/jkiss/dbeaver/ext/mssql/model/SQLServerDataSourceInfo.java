package org.jkiss.dbeaver.ext.mssql.model;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

    @Override
class SQLServerDataSourceInfo extends JDBCDataSourceInfo {
/*
    }
 *
 *
        return false;

 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return SQLServerObjectType.values();
 * Unless required by applicable law or agreed to in writing, software
    public boolean supportsMultipleResults() {


 *     http://www.apache.org/licenses/LICENSE-2.0
        return true;
    }
    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;


    public SQLServerDataSourceInfo(SQLServerDataSource dataSource, JDBCDatabaseMetaData metaData) {
    public boolean supportsResultSetLimit() {
    public boolean isMultipleResultsFetchBroken() {
        this.dataSource = dataSource;
        return true;
    public String getDatabaseProductVersion() {
 * You may obtain a copy of the License at
    @Override
        super(metaData);
import org.jkiss.utils.CommonUtils;
    }
    public DBSObjectType[] getSupportedObjectTypes() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
}
 * Licensed under the Apache License, Version 2.0 (the "License");
        return CommonUtils.isEmpty(serverVersion) ? super.getDatabaseProductVersion() : super.getDatabaseProductVersion() + "\n" + serverVersion;
 * See the License for the specific language governing permissions and
    private SQLServerDataSource dataSource;
 * DBeaver - Universal Database Manager
    public boolean needsTableMetaForColumnResolution() {
 */
 *
 */

        String serverVersion = dataSource.getServerVersion();
        return true;
 * limitations under the License.
    @Override

        this.isSybase = !SQLServerUtils.isDriverSqlServer(dataSource.getContainer().getDriver());
 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean isSybase;
 * SQLServerDataSourceInfo
/**
    @Override
    @Override
