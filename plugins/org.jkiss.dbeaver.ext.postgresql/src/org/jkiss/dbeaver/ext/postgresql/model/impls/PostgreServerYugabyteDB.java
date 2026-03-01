        }
 * PostgreServerYugabyteDB
        return isYugabyteVersionAtLeast(2, 12);
                }
        return true;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;

        return true;

            } else if (yugabyteVersion.getMajor() == major) {

                    }

    public boolean supportsLocks() {
        super(dataSource);
    @Override
                    if (matcher.find()) {
        return true;
        return isYugabyteVersionAtLeast(2, 13);
    @Override
                            yugabyteVersion = new Version(versionStr);
    }
                    yugabyteVersion = new Version(2, 0,0);
        return true;

import org.jkiss.utils.CommonUtils;
    @Override


    @Override
    @Override
    }
    public boolean supportsTablespaceLocation() {

        return true;

    public boolean supportsEncodings() {
 * See the License for the specific language governing permissions and
                try {
            }
                } catch (Exception e) {

    @Override
    @Override
    private boolean isYugabyteVersionAtLeast(int major, int minor) {
    @Override
    public boolean supportsSessionActivity() {

            if (yugabyteVersion.getMajor() > major) {
        return true;
 *
    @Override
/*
    public String getServerTypeName() {
    public PostgreServerYugabyteDB(PostgreDataSource dataSource) {
    }
    }
        return false;


    }
                        }
 * You may obtain a copy of the License at
 */
    @Override
        return true;
        // The pg_tablespace_location function exists, but locations are not supported in the creation statement
    public boolean supportsRelationSizeCalc() {
package org.jkiss.dbeaver.ext.postgresql.model.impls;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class PostgreServerYugabyteDB extends PostgreServerExtensionBase {

    @Override
import org.osgi.framework.Version;
    public boolean supportsRowLevelSecurity() {
    public boolean supportsTriggers() {
        return true;
    public boolean supportsTablespaces() {

    @Override
    @Override

        return "YugabyteDB";
        if (yugabyteVersion != null) {

        return true;
 *     http://www.apache.org/licenses/LICENSE-2.0

                }
    }
    @Override
    public boolean supportsPartitions() {
 *
                return true;
    public boolean supportsRoles() {
 * DBeaver - Universal Database Manager
    }
    @Override

        return true;
    @Override

    @Override
    @Override
    }
import java.util.regex.Matcher;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        String versionStr = matcher.group(1);
            String serverVersion = dataSource.getServerVersion();

    public boolean supportsInheritance() {
                if (yugabyteVersion.getMinor() >= minor) {
    public boolean supportsExplainPlan() {
    }
    @Override


    @Override
    public boolean supportsRules() {
        return true;
/**
    @Override
    public boolean supportsAggregates() {
    public boolean supportsMaterializedViews() {
    }

        return true;
            if (!CommonUtils.isEmpty(serverVersion)) {
    }
import org.jkiss.dbeaver.Log;
            }
    public boolean supportsFunctionDefRead() {
    public boolean supportsOids() {
        return false;
    public boolean supportsIndexes() {
    private Version yugabyteVersion;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public boolean supportsFunctionCreate() {
    public boolean supportsExplainPlanVerbose() {

        if (yugabyteVersion == null) {
    }
        return false;

    public boolean supportsSequences() {
    }

        return true;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    }

    }
    }
    public boolean supportsExtensions() {
        return true;
    }
import java.util.regex.Pattern;
    @Override
        }
                    Matcher matcher = Pattern.compile(".*-YB-([0-9]*\\.[0-9]*).*").matcher(serverVersion);
 * Licensed under the Apache License, Version 2.0 (the "License");

}
    }
        return false;
        return isYugabyteVersionAtLeast(2, 4);
    @Override
        return isYugabyteVersionAtLeast(2, 4);
    }
    private static final Log log = Log.getLog(PostgreServerYugabyteDB.class);
    public boolean supportsForeignServers() {


    }
 *
    @Override

    @Override
    }
    public boolean supportsExplainPlanXML() {

                        if (!CommonUtils.isEmpty(versionStr)) {
    }
    }
        return true;
                    return true;
                    log.debug("Error reading YugabyteDB version", e);
 */
 * limitations under the License.
        return true;
    }
        return true;
    }
