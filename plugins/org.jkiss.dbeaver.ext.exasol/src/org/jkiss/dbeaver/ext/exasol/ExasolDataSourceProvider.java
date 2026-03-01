
			url.append(",").append(backupHostList).append(port);
 * distributed under the License is distributed on an "AS IS" BASIS,
	}
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
				clientVersion = propClientName.toString();
	}
	}
		return new ExasolDataSource(monitor, container);
		}

	}
			if (propClientName != null)
		if (!url.toString().toUpperCase().contains("CLIENTVERSION")) {
	}
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 */
}
			String clientVersion = Platform.getProduct().getDefiningBundle().getVersion().toString();
		if (!CommonUtils.isEmpty(backupHostList))
package org.jkiss.dbeaver.ext.exasol;
 * Unless required by applicable law or agreed to in writing, software
		String port = ":8563";
		return FEATURE_SCHEMAS;
 * DBeaver - Universal Database Manager

 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceProvider;
	// ------------
			if (propClientName != null)
public class ExasolDataSourceProvider extends JDBCDataSourceProvider {




			// Client info can only be provided in the url with the exasol driver
				clientName = propClientName.toString();

		Object querytimeout = properties.get(ExasolConstants.DRV_QUERYTIMEOUT);
import org.jkiss.dbeaver.model.connection.DBPDriver;
		Map<String, String> properties = connectionInfo.getProperties();
			Object propClientName = properties.get(ExasolConstants.DRV_CLIENT_VERSION);

	// ------------
	@NotNull
			url.append(";clientname=").append(clientName);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
	// Constructors
		if (!CommonUtils.isEmpty(connectionInfo.getHostPort())) {
		}
import org.eclipse.core.runtime.Platform;
	public long getFeatures() {
	@Override
			port = ":" + connectionInfo.getHostPort();

	@Override

 * See the License for the specific language governing permissions and
/*

		// check if we got an backup host list
	private static Map<String, String> connectionsProps = new HashMap<>();
			Object propClientName = properties.get(ExasolConstants.DRV_CLIENT_NAME);
			throws DBException {
		}


import org.jkiss.code.NotNull;
	@NotNull
	public String getConnectionURL(@NotNull DBPDriver driver, @NotNull DBPConnectionConfiguration connectionInfo) {
 *
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2025 DBeaver Corp and others

			String clientName = Platform.getProduct().getName();

	public static Map<String, String> getConnectionsProps() {
		if (querytimeout != null)
 * Exasol DataSource provider ddd
	@Override
	public DBPDataSource openDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container)
		StringBuilder url = new StringBuilder(128);
		// Default Port
import java.util.HashMap;
import java.util.Map;

			url.append(";").append(ExasolConstants.DRV_QUERYTIMEOUT).append("=").append(querytimeout);
	}
 * You may obtain a copy of the License at
	protected String getConnectionPropertyDefaultValue(String name, String value) {
 *
		String ovrValue = connectionsProps.get(name);
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
	public ExasolDataSourceProvider() {
		if (!url.toString().toUpperCase().contains("CLIENTNAME")) {
			url.append(";clientversion=").append(clientVersion);
 * limitations under the License.
import org.jkiss.utils.CommonUtils;

/**
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
		return connectionsProps;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		return url.toString();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
		return ovrValue != null ? ovrValue : super.getConnectionPropertyDefaultValue(name, value);
		url.append("jdbc:exa:").append(connectionInfo.getHostName()).append(port);
		String backupHostList = connectionInfo.getProviderProperty(ExasolConstants.DRV_BACKUP_HOST_LIST);
 *
