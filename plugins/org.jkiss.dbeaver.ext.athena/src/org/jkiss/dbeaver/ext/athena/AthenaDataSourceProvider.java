    }
        if (object instanceof DBPDataSourceContainer && infoType.equals(INFO_TARGET_ADDRESS)) {
    @NotNull
    @Override
    private static final Log log = Log.getLog(AthenaDataSourceProvider.class);

package org.jkiss.dbeaver.ext.athena;
 *
            }
 *
            .replace("{server}", regionName)
    }

            return AthenaConstants.JDBC_URL_PREFIX + regionPropName + "=" + regionName + ";";
        throws DBException
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * limitations under the License.
 * You may obtain a copy of the License at
    }
        return null;
import org.jkiss.utils.CommonUtils;

        }



        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    @Nullable
import org.jkiss.dbeaver.DBException;
        return new AthenaDataSource(monitor, container, new AthenaMetaModel());
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            .replace("{region}", regionName)
 * DBeaver - Universal Database Manager
        String urlTemplate = driver.getSampleURL();

    @Override

import org.jkiss.code.Nullable;
        if (regionName == null) {
    public AthenaDataSourceProvider()
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return urlTemplate;
/*
import org.jkiss.dbeaver.model.app.DBPPlatform;
    @Override
}
import org.jkiss.dbeaver.ext.athena.model.AthenaMetaModel;
        @NotNull DBPDataSourceContainer container)
    }
    public DBPDataSource openDataSource(
public class AthenaDataSourceProvider extends GenericDataSourceProvider implements DBPInformationProvider {
 *
            String regionPropName = AthenaUtils.isLegacyDriver(driver) ?
    public String getObjectInformation(@NotNull DBPObject object, @NotNull String infoType) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ext.athena.model.AthenaConstants;
            .replace("=region;", "=" + regionName + ";"); // Left for backward compatibility

        }
import org.jkiss.dbeaver.model.DBPInformationProvider;
    {
    @Override
        urlTemplate = urlTemplate

 * you may not use this file except in compliance with the License.
    {
 */
import org.jkiss.dbeaver.model.DBPObject;
import org.jkiss.dbeaver.ext.athena.model.AthenaUtils;
                AthenaConstants.DRIVER_PROP_REGION_OLD : AthenaConstants.DRIVER_PROP_REGION;
    public void init(@NotNull DBPPlatform platform) {
        //jdbc:awsathena://AwsRegion=us-east-1;
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
        if (CommonUtils.isEmpty(urlTemplate) || !urlTemplate.startsWith(AthenaConstants.JDBC_URL_PREFIX)) {
        String regionName = connectionInfo.getServerName();
    public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            regionName = connectionInfo.getProviderProperty(AthenaConstants.DRIVER_PROP_REGION);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.dbeaver.ext.athena.model.AthenaDataSource;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import org.jkiss.code.NotNull;
                regionName = connectionInfo.getProviderProperty(AthenaConstants.DRIVER_PROP_REGION_OLD);
 *     http://www.apache.org/licenses/LICENSE-2.0
            return ((DBPDataSourceContainer) object).getConnectionConfiguration().getServerName();
            if (regionName == null) {
