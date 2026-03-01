        }
        @NotNull String driverId,
        dataSource.setSavePassword(dataSourceOptions.isSavePassword());
        ) {
            connectionConfiguration.setProviderProperties(
    }
        @Nullable DataSourceOptions dataSourceOptions,
                prepareKeyValueParams(connectionConfiguration.getProviderProperties(), authOptions.getProviderParams())
        }
import java.util.HashMap;
            log.error("Error reading from system in", e);
        DBPWorkspace workspace = context.getContextParameter(DBPWorkspace.class.getName());
        }
            );
        }
                e,
    }
                project = workspace.getProjectById(projectIdOrName);
        return properties;
                DBAAuthCredentials credentialsInstance = connectionConfiguration.getAuthModel()
            if (!CommonUtils.isEmpty(authProperties)) {
/*
                    handlerParams

    public static Map<String, String> prepareKeyValueParams(

import org.jkiss.dbeaver.model.access.DBAAuthCredentials;

                String paramValue = paramParts[1].trim();
import java.util.List;
    @NotNull
        @NotNull DBPProject project,
    ) throws CLIException {
            dataSource.setName(dsName);
        if (CommonUtils.isNotEmpty(dataSourceOptions.getServer())) {

            dsName = "Ext: " + dataSource.getDriver().getName();
            sb.append(String.format("%-" + (entry.getValue() + STRING_FORMAT_PADDING) + "s", entry.getKey()));
        return tempDatasource;


                columnWidths.put(entry.getKey(), Math.max(columnWidths.get(entry.getKey()), value == null ? 0 : value.length()));
    }
            }
            );
        @NotNull DataSourceOptions dataSourceOptions,

    public static final int STRING_FORMAT_PADDING = 3;
                authOptions.getAuthParams()
                prepareKeyValueParams(connectionConfiguration.getProperties(), authOptions.getConnectionParams())
                    "%-" + (entry.getValue() + STRING_FORMAT_PADDING) + "s",
                String value = entry.getValue();

        DBPDriver driver = DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver(driverId);
        helpText.append(property.getId());
            connectionConfiguration.setDatabaseName(dataSourceOptions.getDbName());
            connectionConfiguration.setHostPort(dataSourceOptions.getPort().toString());

import org.jkiss.utils.CommonUtils;
            sb.append("\n");
            Object[] possibleValues = valueListProvider.getPossibleValues(null);
        if (authOptions.getNetworkHandlerOptions() != null
import java.nio.charset.StandardCharsets;
            }
                        helpText.append(", ");

            } catch (Exception e) {
        processDataSourceAuthOptions(tempDatasource, authOptions);
        if (CommonUtils.isNotEmpty(dataSourceOptions.getHost())) {


        if (CommonUtils.isEmpty(projectIdOrName)) {
        return sb.toString().trim();
    }
                    credentialsInstance,
        }
    public static String getPropertyHelpText(@NotNull DBPPropertyDescriptor property) {
                );
        return dataSource;
            if (paramParts.length == 2) {
import org.jkiss.dbeaver.utils.PropertySerializationUtils;
    ) throws CLIException {
    }
        @Nullable String namePrefix
        helpText.append(" = ").append(displayName);

            connectionConfiguration.setAuthModelId(dataSourceOptions.getAuthModel());
        }
            true
            connectionConfiguration.setUrl(dataSourceOptions.getUrl());
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        }
 *
    @NotNull
 * See the License for the specific language governing permissions and
        }
        var registry = project.getDataSourceRegistry();
                    if (i < possibleValues.length - 1) {
import java.nio.file.Path;
        if (driver == null) {
    @NotNull
                DataSourceUtils.processNetworkHandlerProperties(
            dataSourceOptions,
    }
        }
            new DBPConnectionConfiguration()
            throw new CLIException("Can't find project '" + projectIdOrName + "'", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
        @NotNull DBPDataSourceContainer dataSource,
        DBPProject project;
            try {

        }
            );
import org.jkiss.code.Nullable;
    }
        if (project == null) {
                    "Input file does not exist: " + inputFile,
            throw new CLIException("Can't find connection '" + existConnectionIdOrName + "'", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);

    ) throws CLIException {
        if (CommonUtils.isNotEmpty(authOptions.getDbPassword())) {

    public static DBPDataSourceContainer createTempDataSource(
            throw new CLIException("Can't find driver '" + driverId + "'", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
    }
            );
        if (CommonUtils.isEmpty(dsName) && CommonUtils.isEmpty(dataSource.getName())) {
        return helpText.toString();
        return project;
        String displayName = property.getDisplayName();
                if (CommonUtils.isNotEmpty(paramName) && CommonUtils.isNotEmpty(paramValue)) {
        }
        }
            return tryReadFromSystemIn();
        StringBuilder sb = new StringBuilder();
        }
        @NotNull DataSourceAuthOptions authOptions,
        if (container == null) {
}
package org.jkiss.dbeaver.model.cli;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
public class CLIUtils {
        @NotNull DataSourceAuthOptions authOptions
 *
                dataSource.getConnectionConfiguration().getAuthModel()
        boolean temporary
        return connectionConfiguration;
                }
                dsName += " - " + dataSourceOptions.getDbName();
            for (Map.Entry<String, String> entry : row.entrySet()) {
        } catch (IOException e) {
        var connectionConfiguration = dataSource.getConnectionConfiguration();
            dataSource.setFolder(folder);
            Map<String, String> authProperties = CLIUtils.prepareKeyValueParams(
        @NotNull DataSourceOptions dataSourceOptions,
            return Files.readString(path);

            }
    ) throws CLIException {
            }
    public static DBPDataSourceContainer createDataSource(
                throw new CLIException("Invalid param format: " + param, CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
    public static DBPConnectionConfiguration updateConnectionConfiguration(
        for (Map.Entry<String, Integer> entry : columnWidths.entrySet()) {
 * limitations under the License.
        try {
            if (!ArrayUtils.isEmpty(possibleValues)) {

        }
                ));

        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        try {
        }
        );
                    properties.put(paramName, paramValue);
        if (CommonUtils.isNotEmpty(dataSourceOptions.getFolder())) {
        for (String param : cliParams) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.cli.model.option.DataSourceOptions;
        if (!CommonUtils.isEmpty(dataSourceOptions.getAuthModel())) {
import org.jkiss.dbeaver.Log;
        if (!CommonUtils.isEmpty(authOptions.getConnectionParams())) {
            dataSourceOptions,
                    authProperties
        @NotNull DataSourceAuthOptions authOptions

                String paramName = paramParts[0].trim();
            }
        }

import java.nio.file.Files;
                    .provideCredentials(dataSource, dataSource.getConnectionConfiguration(), credentialsInstance);
        return getPropertyHelpText(property, null);
            connectionConfiguration.setServerName(dataSourceOptions.getServer());
import java.io.IOException;
            }
            return tryReadFromSystemIn();
        }
            if (project == null) {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            if (Files.notExists(path)) {
                CLIConstants.EXIT_CODE_ERROR
    public static String readValueFromFileOrSystemIn(@Nullable InputFileOption filesOptions) throws CLIException {
            project = workspace.getProject(projectIdOrName);
        }
        }
        var helpText = new StringBuilder();
        DBPDataSourceContainer dataSource = registry.createDataSource(driver, connectionConfiguration);
    @NotNull
        if (container == null) {
    private static final Log log = Log.getLog(CLIUtils.class);
import org.jkiss.dbeaver.model.connection.DBPDriver;
        for (Map<String, String> row : data) {
    }
        DBPDataSourceContainer tempDatasource = createDataSource(
    public static DBPDataSourceContainer findDataSource(
    ) throws CLIException {

                authOptions.getNetworkHandlerOptions().getHandlerParams()
                    e,
 */
                    CLIConstants.EXIT_CODE_ERROR
        @NotNull DBPConnectionConfiguration connectionConfiguration
        Map<String, String> properties = parentParams == null ? new LinkedHashMap<>() : new LinkedHashMap<>(parentParams);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPWorkspace;
        if (CommonUtils.isNotEmpty(namePrefix) && !property.getId().startsWith(namePrefix)) {
        if (CommonUtils.isNotEmpty(authOptions.getDbUser())) {
        if (data.isEmpty()) {
        }
            Map<String, String> handlerParams = prepareKeyValueParams(
                helpText.append(", possible values: ");
 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new CLIException("Error adding datasource: " + e.getMessage(), e, CLIConstants.EXIT_CODE_ERROR);
                    dataSource,

        } else {
            if (CommonUtils.isNotEmpty(dataSourceOptions.getDbName())) {
        for (Map<String, String> row : data) {
    public static String formatAsTable(@NotNull List<Map<String, String>> data) {
        }
                throw new CLIException(
        }
                    .loadCredentials(dataSource, connectionConfiguration);
    ) throws CLIException {
        processDataSourceAuthOptions(dataSource, authOptions);
import org.jkiss.code.NotNull;
        }
                    authOptions.getNetworkHandlerOptions().isSavePassword(),
            String[] paramParts = param.split("=", 2);
        );

    @NotNull
        }

            throw new CLIException("datasource options not provided", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
                    CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS
                sb.append(String.format(
        return container;
        @NotNull DataSourceAuthOptions authOptions,
        @NotNull DBPDataSourceContainer dataSource
    private static String tryReadFromSystemIn() {

    }
        } catch (Exception e) {
                "Error reading GQL from input file: " + inputFile,
            && !CommonUtils.isEmpty(authOptions.getNetworkHandlerOptions().getHandlerParams())
        @NotNull String existConnectionIdOrName
        } catch (Exception e) {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                throw new CLIException(
            );

        }
import org.jkiss.dbeaver.model.cli.model.option.InputFileOption;
        @NotNull List<String> cliParams
        if (property instanceof IPropertyValueListProvider<?> valueListProvider) {
                for (int i = 0; i < possibleValues.length; i++) {
 * you may not use this file except in compliance with the License.
            return "";

        @Nullable Map<String, String> parentParams,
                    new LoggingProgressMonitor(),
            helpText.append(namePrefix);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            }
    public static void processDataSourceAuthOptions(
        String dsName = dataSourceOptions.getDatasourceName();
            project,
            }
 * You may obtain a copy of the License at
            } else if (CommonUtils.isNotEmpty(dataSourceOptions.getServer())) {
        Map<String, Integer> columnWidths = new LinkedHashMap<>();
        @NotNull DBPPropertyDescriptor property,
import org.jkiss.dbeaver.model.app.DBPProject;
        if (filesOptions == null) {
    @Nullable
    ) {
    }

        @NotNull DBPProject project,
            driverId,
        helpText.append("  - ");
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
        }
                );
    ) {
            }
            Path path = inputFile.path();
            }
        }
        // header
                }
        helpText.append("\n");
                    helpText.append(possibleValues[i]);
import org.jkiss.dbeaver.model.cli.model.option.DataSourceAuthOptions;
        }

            if (System.in.available() > 0) {
        if (workspace == null) {
                connectionConfiguration.getAuthProperties(),
        @NotNull DataSourceOptions dataSourceOptions,
        if (CommonUtils.isNotEmpty(dataSourceOptions.getDbName())) {
        }
            container = registry.findDataSourceByName(existConnectionIdOrName);
                    CommonUtils.notNull(row.get(entry.getKey()), "")
            } else {
    public static DBPProject findProject(@Nullable String projectIdOrName, @NotNull CLIContext context) throws CLIException {
    }
                    }

        @NotNull String driverId,
        if (dataSourceOptions == null) {
                    "Error processing network handler properties: " + e.getMessage(),
            project = workspace.getActiveProject();

        if (CommonUtils.isNotEmpty(dsName)) {
 * Unless required by applicable law or agreed to in writing, software
                new HashMap<>(),
        }
    }
            connectionConfiguration.setProperties(
                );

        DBPConnectionConfiguration connectionConfiguration = updateConnectionConfiguration(
            connectionConfiguration.setUserPassword(authOptions.getDbPassword());
    @NotNull
            columnWidths.put(key, key.length());
    public static void updateDataSource(
    @Nullable
    @NotNull
        @NotNull DBPProject project,
        var registry = project.getDataSourceRegistry();

            authOptions,
            connectionConfiguration.setUserName(authOptions.getDbUser());
        }
        if (CommonUtils.isNotEmpty(dataSourceOptions.getUrl())) {
import org.jkiss.dbeaver.utils.DataSourceUtils;
import java.util.LinkedHashMap;
                dsName += " - " + dataSourceOptions.getServer();
        DBFPath inputFile = filesOptions.getInputFile();

                PropertySerializationUtils.updateCredentialsFromProperties(
            return null;
import org.jkiss.utils.ArrayUtils;
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
 *
        DBPDataSourceContainer container = registry.getDataSource(existConnectionIdOrName);
            workspace = DBWorkbench.getPlatform().getWorkspace();
    public static String getPropertyHelpText(
        sb.append("\n");
            DBPDataSourceFolder folder = dataSource.getRegistry().getFolder(dataSourceOptions.getFolder());
import org.jkiss.dbeaver.model.fs.DBFPath;
        }
        if (inputFile == null) {
    @NotNull
                );
        // rows
import org.jkiss.dbeaver.runtime.DBWorkbench;
                return new String(System.in.readAllBytes(), StandardCharsets.UTF_8);
        if (dataSourceOptions.getPort() != null) {

            registry.addDataSource(dataSource);
            connectionConfiguration.setHostName(dataSourceOptions.getHost());
            throw new CLIException(
        if (!CommonUtils.isEmpty(authOptions.getAuthParams())) {
        dataSource.setTemporary(temporary);
        }
        return null;
        updateDataSource(dataSourceOptions, authOptions, dataSource);
        if (!CommonUtils.isEmpty(authOptions.getProviderParams())) {

        for (String key : data.getFirst().keySet()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            for (Map.Entry<String, Integer> entry : columnWidths.entrySet()) {
import java.util.Map;
        try (inputFile) {
