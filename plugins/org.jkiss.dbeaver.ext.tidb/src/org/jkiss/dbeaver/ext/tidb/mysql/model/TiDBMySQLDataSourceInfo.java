 */

    }
    private static final Log log = Log.getLog(TiDBMySQLDataSourceInfo.class);
        }
        return dataSource.getServerVersion();
        // TiDB version string looks like: `5.7.25-TiDB-v6.1.0` or `5.7.25-TiDB-v6.3.0-serverless`
            // It means not a TiDB server actually
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
            int patch = Integer.parseInt(realTiDBVersionArray[2]);
        // drop first char "v"
public class TiDBMySQLDataSourceInfo extends JDBCDataSourceInfo {

 * distributed under the License is distributed on an "AS IS" BASIS,
            return new Version(0, 0, 0);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
        // JDBC will return major version 5 and minor version 7
    @Override

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            return new Version(major, minor, patch);
    public boolean supportsMultipleResults() {
            // It means not a TiDB server actually
        }
/*
        this.dataSource = dataSource;
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
import org.osgi.framework.Version;

package org.jkiss.dbeaver.ext.tidb.mysql.model;

    public TiDBMySQLDataSourceInfo(TiDBMySQLDataSource dataSource, JDBCDatabaseMetaData metaData) {
 * you may not use this file except in compliance with the License.
    @Override
        return true;
        try {
            log.error(e);
    public Version getDatabaseVersion() {
    private final TiDBMySQLDataSource dataSource;
 * You may obtain a copy of the License at
    }
            int major = Integer.parseInt(realTiDBVersionArray[0]);

        String realTiDBVersion = tidbVersionArray[2].substring(1);
        String tidbVersion = this.getDatabaseProductVersion();
    public boolean needsTableMetaForColumnResolution() {

        }
 * Copyright (C) 2010-2022 DBeaver Corp and others
 *
            return new Version(0, 0, 0);
}        if (tidbVersionArray.length < 3 || !tidbVersionArray[1].equals("TiDB")) {
    public String getDatabaseProductVersion() {
        if (realTiDBVersionArray.length != 3) {
    @Override

        super(metaData);
 *

        return new Version(0, 0, 0);
        String[] tidbVersionArray = tidbVersion.split("-");

        String[] realTiDBVersionArray = realTiDBVersion.split("\\.");
        // But the real TiDB version is v6.1.0
 * DBeaver - Universal Database Manager
            int minor = Integer.parseInt(realTiDBVersionArray[1]);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
        } catch (NumberFormatException e) {
        return true;
    @Override
    }

 * Unless required by applicable law or agreed to in writing, software

