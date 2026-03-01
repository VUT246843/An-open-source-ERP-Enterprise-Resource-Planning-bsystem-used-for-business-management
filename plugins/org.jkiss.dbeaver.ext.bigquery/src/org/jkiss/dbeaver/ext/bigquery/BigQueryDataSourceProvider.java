 * You may obtain a copy of the License at
 */
 *

 * distributed under the License is distributed on an "AS IS" BASIS,

        StringBuilder url = new StringBuilder();
import org.jkiss.dbeaver.model.app.DBPPlatform;
    }
        //jdbc:bigquery://https://www.googleapis.com/bigquery/v2:443;ProjectId={server};OAuthType=0;OAuthServiceAcctEmail={user};OAuthPvtKeyPath={host};
    @NotNull

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
package org.jkiss.dbeaver.ext.bigquery;
}
import org.jkiss.code.NotNull;
    public BigQueryDataSourceProvider()
/*
 * DBeaver - Universal Database Manager

    @Override
        if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.connection.DBPDriver;
        }
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
        return url.toString();
 * Unless required by applicable law or agreed to in writing, software
    }
 *
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
public class BigQueryDataSourceProvider extends GenericDataSourceProvider {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
            url.append(":").append(connectionInfo.getHostPort());
        url.append("jdbc:bigquery://").append(connectionInfo.getHostName());
    @Override
    }
import org.jkiss.utils.CommonUtils;
    public void init(@NotNull DBPPlatform platform) {


