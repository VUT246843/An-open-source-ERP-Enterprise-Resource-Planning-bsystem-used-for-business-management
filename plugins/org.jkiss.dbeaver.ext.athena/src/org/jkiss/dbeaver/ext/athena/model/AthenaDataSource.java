            props.put(s3OutPropName, connectionInfo.getDatabaseName());

    }
    }
            // https://docs.aws.amazon.com/athena/latest/ug/jdbc-v3-driver-aws-configuration-profile-credentials.html
        }
            if (AthenaConstants.PROP_OLD_VALUE_AWS_CREDENTIALS_PROVIDER_CLASS.equals(credentialsProviderClass)) {
 *
    protected boolean isPopulateClientAppName() {
    @Override
        @NotNull JDBCExecutionContext context,
import org.jkiss.code.NotNull;
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    ) throws DBCException {
                );
            }
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;

package org.jkiss.dbeaver.ext.athena.model;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                s3OutputLocation = connectionInfo.getProviderProperty(AthenaConstants.DRIVER_PROP_S3_OUTPUT_LOCATION_OLD);
        }
public class AthenaDataSource extends GenericDataSource {
        Map<String, String> props = new HashMap<>();
        }
import java.util.HashMap;
import org.jkiss.dbeaver.model.exec.DBCException;
}
            String s3OutPropName = isLegacyDriver() ?

 * Athena datasource
        @NotNull String purpose,

            connectionInfo.setDatabaseName(s3OutputLocation);
    public boolean isOmitCatalog() {
 * DBeaver - Universal Database Manager
        boolean useCatalogs = CommonUtils.toBoolean(connectionInfo.getProviderProperty(AthenaConstants.PROP_SHOW_CATALOGS));
 * Unless required by applicable law or agreed to in writing, software
            String credentialsProviderClass = connectionInfo.getProperties()

 */
            // Hack to fix update from v2 -> v3 driver version https://github.com/dbeaver/dbeaver/issues/39947
        @NotNull DBPConnectionConfiguration connectionInfo
            String s3OutputLocation = connectionInfo.getProviderProperty(AthenaConstants.DRIVER_PROP_S3_OUTPUT_LOCATION);
                .get(AthenaConstants.PROP_AWS_CREDENTIALS_PROVIDER_CLASS);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        if (useCatalogs) {
        if (CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
 *
    @Override

                AthenaConstants.DRIVER_PROP_S3_OUTPUT_LOCATION_OLD : AthenaConstants.DRIVER_PROP_S3_OUTPUT_LOCATION;
        super(monitor, container, metaModel, new AthenaSQLDialect());
import org.jkiss.dbeaver.model.connection.DBPDriver;
            props.put(AthenaConstants.DRIVER_PROP_METADATA_RETRIEVAL_METHOD, "ProxyAPI");
        if (!isLegacyDriver()) {

    private boolean isLegacyDriver() {
    {
    }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;


        @NotNull DBRProgressMonitor monitor,
        return props;
        return AthenaUtils.isLegacyDriver(getContainer().getDriver());
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBPDriver driver,
import java.util.Map;
        if (!CommonUtils.isEmpty(connectionInfo.getDatabaseName())) {
        }
    public AthenaDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, AthenaMetaModel metaModel)
 * distributed under the License is distributed on an "AS IS" BASIS,
                    AthenaConstants.PROP_AWS_CREDENTIALS_PROVIDER_CLASS,
                connectionInfo.getProperties().put(
 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**
    protected Map<String, String> getInternalConnectionProperties(
        throws DBException
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            }
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return false;
                    AthenaConstants.PROP_NEW_VALUE_AWS_CREDENTIALS_PROVIDER_CLASS
 *
            if (s3OutputLocation == null) {
            getContainer().getConnectionConfiguration().getProviderProperty(AthenaConstants.PROP_SHOW_CATALOGS));
 */
/*
        return !CommonUtils.toBoolean(

