 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

                if (propsStream != null) {
    }
        }
import org.jkiss.dbeaver.Log;
    public boolean supportsIndexes() {
 */
        return super.getDriverVersion();
import java.util.Properties;
            return !serverVersion.startsWith("3");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
            }

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSource;
                        IOUtils.close(propsStream);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * DBeaver - Universal Database Manager
    }
package org.jkiss.dbeaver.ext.hive.model;
            if (classLoader != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

        if (serverVersion != null) {
    private String serverVersion;
                    try {

 * Licensed under the Apache License, Version 2.0 (the "License");
                        props.load(propsStream);
        try {
        } catch (Throwable e) {

        } catch (Exception e) {
            serverVersion = JDBCUtils.queryString(session, "SELECT version()");

class HiveDataSourceInfo extends JDBCDataSourceInfo {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Read Hive version")) {
    public String getDriverVersion() {
        return serverVersion == null ? super.getDatabaseProductVersion() : serverVersion;
                    } finally {
            return clientVersion;
                InputStream propsStream = classLoader.getResourceAsStream("common-version-info.properties");
    }

    private static final Log log = Log.getLog(HiveDataSourceInfo.class);
    private String clientVersion;
    public String getDatabaseProductVersion() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override

 * you may not use this file except in compliance with the License.
            log.debug("Error reading Hive version: " + e.getMessage());
 *
import org.jkiss.utils.IOUtils;
 *
    @Override
 * You may obtain a copy of the License at


                    }
/*
                        Properties props = new Properties();
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.debug("Error getting Hive client version");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
    HiveDataSourceInfo(DBRProgressMonitor monitor, DBPDataSource dataSource, JDBCDatabaseMetaData metaData) {
        return false;
import java.io.InputStream;
                        clientVersion = props.getProperty("version");
        super(metaData);
import org.jkiss.dbeaver.model.DBUtils;
        }
 * Unless required by applicable law or agreed to in writing, software
        if (clientVersion != null) {
            ClassLoader classLoader = dataSource.getContainer().getDriver().getDriverLoader(dataSource.getContainer()).getClassLoader();
                }
 * limitations under the License.
