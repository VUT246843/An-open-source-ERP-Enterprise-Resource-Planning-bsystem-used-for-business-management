    }
    private static final Log log = Log.getLog(GreenplumDataSource.class);
            if (hasAccessToExttable == null) {
            log.debug("Error reading GP server version", e);
package org.jkiss.dbeaver.ext.greenplum.model;
    protected Version gpVersion;

    public GreenplumDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {

        return gpVersion.getMajor() > major || (gpVersion.getMajor() == major && gpVersion.getMinor() >= minor);
        } catch (Throwable e) {


 * Copyright (C) 2010-2024 DBeaver Corp and others

            }
            }
    }
import org.jkiss.dbeaver.DBException;
        return hasAccessToExttable;
 * DBeaver - Universal Database Manager
        return isHasAccessToExttable();
import java.util.regex.Pattern;

 * distributed under the License is distributed on an "AS IS" BASIS,
    private Boolean hasAccessToExttable;
            gpVersion = new Version(4, 2, 0);
        return supportsRelstorageColumn;
    boolean isGreenplumVersionAtLeast(int major, int minor) {
import org.osgi.framework.Version;
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
            } else {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
            supportsRelstorageColumn = PostgreUtils.isMetaObjectExists(session, "pg_class", "relstorage");
    }
        }
 *
    @Override
            if (serverVersion != null) {
    private Boolean supportsFmterrtblColumn;
    }
        if (supportsRelstorageColumn == null) {
    public boolean supportsExternalTables() {
        }
                supportsFmterrtblColumn = false;

    private Boolean supportsRelstorageColumn;

        }
 * you may not use this file except in compliance with the License.
    boolean isServerSupportsRelstorageColumn(@NotNull JDBCSession session) {
import org.jkiss.dbeaver.model.meta.Association;
                Matcher matcher = Pattern.compile("Greenplum Database ([0-9\\.]+)").matcher(serverVersion);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)
        super(monitor, container);
        }
 *
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 */

            log.debug("Can't read Greenplum server version");
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.Log;
                if (matcher.find()) {

 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)
import java.util.regex.Matcher;
    @Association
 *
 * limitations under the License.
/*
                supportsFmterrtblColumn = PostgreUtils.isMetaObjectExists(session, "pg_exttable", "fmterrtbl");
 * See the License for the specific language governing permissions and
            if (!isHasAccessToExttable()) {
 * Unless required by applicable law or agreed to in writing, software
        // Read server version
 *     http://www.apache.org/licenses/LICENSE-2.0

        return supportsFmterrtblColumn;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            return false;
                    gpVersion = new Version(matcher.group(1));
    boolean isServerSupportFmterrtblColumn(@NotNull JDBCSession session) {
        // Let's check ability to use pg_exttable to show external tables correctly
        }
    }
import org.jkiss.code.NotNull;
    }
                }
                hasAccessToExttable = PostgreUtils.isMetaObjectExists(session, "pg_exttable", "*");
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (gpVersion == null) {
}
        if (supportsFmterrtblColumn == null) {
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
            }
        super.initialize(monitor);

    boolean isHasAccessToExttable() {
public class GreenplumDataSource extends PostgreDataSource {
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read Greenplum server special info")) {
        if (gpVersion == null) {
        // External tables turned into foreign tables from version 7.

 * Licensed under the Apache License, Version 2.0 (the "License");
