    @Override
    public CloudberryDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container) throws DBException {
import java.util.regex.Matcher;
import java.util.regex.Pattern;
            cbVersion = new Version(1, 0, 0);
    }
 * You may obtain a copy of the License at
            if (matcher.find()) {
}
                cbVersion = new Version(matcher.group(2));
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
        }
            Matcher matcher = Pattern.compile("(Cloudberry Database|Apache Cloudberry) ([0-9\\.]+)").matcher(serverVersion);
                // Read version from group 2
import org.jkiss.dbeaver.DBException;
        if (cbVersion == null) {

    }
            gpVersion = new Version(7, 0, 0);
        // Read server version
        if (serverVersion != null) {



 */

 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
        super(monitor, container);
    private Version cbVersion;
    private static final Log log = Log.getLog(CloudberryDataSource.class);
import org.osgi.framework.Version;
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
        super.initialize(monitor);
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
import org.jkiss.code.NotNull;
            }

package org.jkiss.dbeaver.ext.greenplum.model;
 *
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.Log;
public class CloudberryDataSource extends GreenplumDataSource {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
