 */
    }
 *
    public PostgreDataSourceInfo(PostgreDataSource dataSource, JDBCDatabaseMetaData metaData) {
    protected boolean isIgnoreReadOnlyFlag() {
    private final PostgreDataSource dataSource;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
class PostgreDataSourceInfo extends JDBCDataSourceInfo {
    public boolean needsTableMetaForColumnResolution() {
 * DBeaver - Universal Database Manager
    public String getDatabaseProductVersion() {
    public boolean supportsMultipleResults() {
    @Override
        return true;
    }
        return dataSource.getServerType().supportsTransactions();
    @Override
 */
    }
        return CommonUtils.isEmpty(serverVersion) ? super.getDatabaseProductVersion() : super.getDatabaseProductVersion() + "\n" + serverVersion;




/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.


    }
    @Override
 * See the License for the specific language governing permissions and
 * PostgreDataSourceInfo
import org.jkiss.utils.CommonUtils;
    public boolean supportsTransactions() {
        super(metaData);

        return true;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
        // ??? Disable maxRows for data transfer - it turns cursors off ?
        this.dataSource = dataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean supportsResultSetLimit() {
    @Override
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
    @Override
        String serverVersion = dataSource.getServerVersion();
    }
    @Override
 *
        return dataSource.getServerType().supportsEntityMetadataInResults();
}
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.postgresql.model;
        return dataSource.getServerType().supportsResultSetLimits();
    }
 * You may obtain a copy of the License at

