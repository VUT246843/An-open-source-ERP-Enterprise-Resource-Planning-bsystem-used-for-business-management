 *     http://www.apache.org/licenses/LICENSE-2.0
 */
            gpVersion = new Version(4, 2, 0);
        return null;
 * limitations under the License.
        extends GreenplumDataSource {
        }
                gpVersion = getDatabaseVersion("Greenplum Database ([0-9\\.]+)");
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
    private Version getDatabaseVersion(@NotNull String versionPattern) {
}
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        super(monitor, container);

package org.jkiss.dbeaver.ext.greenplum.model;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager

import org.osgi.framework.Version;
        super.initialize(monitor);
        if (gpVersion == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override

 * Unless required by applicable law or agreed to in writing, software
                //fallback to greenplum version for backward compatibility
        }
            if (gpVersion == null) {
    public GreengageDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
            gpVersion = getDatabaseVersion("Greengage Database ([0-9\\.]+)");
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
public class GreengageDataSource
/*
        if (matcher.find()) {
import java.util.regex.Pattern;
    }
        }
        Matcher matcher = Pattern.compile(versionPattern).matcher(serverVersion);
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.DBException;
 *
    @Nullable
 *

 *
            }
            return new Version(matcher.group(1));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (serverVersion != null) {
    }
    }
import java.util.regex.Matcher;
 * distributed under the License is distributed on an "AS IS" BASIS,
