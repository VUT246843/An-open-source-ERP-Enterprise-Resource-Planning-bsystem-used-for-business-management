        String helpText;
                applicableDrivers.add(driver);
}                outBuilder.append(helpText);
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (CommonUtils.isNotEmpty(datasourceId)) {
                authModel.getName(),
        context().setPostAction(CLIProcessResult.PostAction.SHUTDOWN);
import java.util.ArrayList;
                property.getId(),
        if (CommonUtils.equalObjects(displayName, description) || CommonUtils.isEmpty(description)) {
            DBPDriver driver = dataSourceProviderRegistry.findDriver(driverId);
            authModels = authModels.stream()
        StringBuilder outBuilder = new StringBuilder();
    @CommandLine.Option(names = {"--provider"}, description = "Filter by provider ID")
        }
    private static @NotNull String getHelpText(DBPPropertyDescriptor property) {


            } else {
                outBuilder.append("Applicable Drivers: ").append(drivers).append("\n");
                authModel.getDescription()
                String helpText = getHelpText(property);
                applicableDrivers.addAll(provider.getEnabledDrivers());
                throw new CLIException("Can't find provider '" + providerId + "'", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
                        applicableDrivers.stream()
            for (DBPPropertyDescriptor property : propertyCollector.getProperties()) {
    @CommandLine.Option(names = {"--datasource"}, description = "Filter by datasource ID or name")
                .filter(am -> am.isApplicableTo(driver))
            helpText = "  - %s = %s%n".formatted(
 * DBeaver - Universal Database Manager
            PropertyCollector propertyCollector = new PropertyCollector(credentials, true);
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
            outBuilder.append(String.format(
 * you may not use this file except in compliance with the License.
/*
    protected String driverId;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected String datasourceId;
                datasourceId
    @CommandLine.Mixin

 *
    @NotNull
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;

 *

        List<DBPDriver> applicableDrivers = new ArrayList<>();
        DBPDataSourceProviderRegistry dataSourceProviderRegistry = DBWorkbench.getPlatform().getDataSourceProviderRegistry();
        context().addResult(getConsoleOutput(authModels, applicableDrivers));
            DBPDataSourceContainer dataSource = CLIUtils.findDataSource(
            );
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.runtime.DBWorkbench;
    protected String providerId;
            DBAAuthCredentials credentials = authModelInstance.createCredentials();
@CommandLine.Command(name = ListAuthenticationModelParameterHandler.COMMAND_NAME, description = "List available database authentication models")
    @Override
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
        return outBuilder.toString();
            DBPDriver driver = dataSource.getDriver();
                    )
                    .toList();
import org.jkiss.utils.CommonUtils;
            );
            );
    }
            DBAAuthModel<? extends DBAAuthCredentials> authModelInstance = authModel.getInstance();
import java.util.stream.Collectors;
import org.jkiss.dbeaver.model.cli.*;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        }
                .collect(Collectors.joining(", "));
import org.jkiss.dbeaver.model.access.DBAAuthModel;

                authModels = authModels.stream()

import org.jkiss.dbeaver.model.cli.model.option.ProjectOption;
                            .anyMatch(am::isApplicableTo)
                    .filter(am -> am.isApplicableTo(driver))
        } else if (CommonUtils.isNotEmpty(driverId)) {
        for (DBPAuthModelDescriptor authModel : authModels) {

            }

            DBPDataSourceProviderDescriptor provider = dataSourceProviderRegistry.getDataSourceProvider(providerId);
public class ListAuthenticationModelParameterHandler extends CLIAbstractSubcommand {
        return helpText;
import java.util.List;
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
    }
        String displayName = property.getDisplayName();
    }

                CommonUtils.notEmpty(displayName)
 * distributed under the License is distributed on an "AS IS" BASIS,
                authModel.getId(),
            }
    private static String getConsoleOutput(List<? extends DBPAuthModelDescriptor> authModels, List<DBPDriver> applicableDrivers) {
                    .filter(am ->
                throw new CLIException("Can't find driver '" + driverId + "'", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
import org.jkiss.code.NotNull;
        List<? extends DBPAuthModelDescriptor> authModels = dataSourceProviderRegistry.getAllAuthModels();
            applicableDrivers.add(driver);

                .toList();
            if (provider != null) {
            if (!CommonUtils.isEmpty(drivers)) {
            String drivers = applicableDrivers.stream()
                authModels = authModels.stream()
                .filter(authModel::isApplicableTo)
            }
        String description = property.getDescription();
                .map(DBPDriver::getFullName)
            ));
        } else {
        }
            outBuilder.append("Parameters:\n");
    public static final String COMMAND_NAME = "auth-models";
import picocli.CommandLine;
            }
package org.jkiss.dbeaver.model.cli.command;
    @CommandLine.Option(names = {"--driver"}, description = "Filter by driver ID")
                "Auth Model ID: %s, Name: %s, Description: %s%n",
            } else {

                    .toList();
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            outBuilder.append("\n");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
            propertyCollector.collectProperties();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.connection.DBPDriver;
 *

    public void run() throws CLIException {
 */
            if (driver != null) {
                CLIUtils.findProject(projectOption.getProjectIdOrName(), context()),
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
                property.getId(),
            helpText = "  - %s (%s) = %s%n".formatted(
                property.getDescription()
                property.getDisplayName(),
        } else if (CommonUtils.isNotEmpty(providerId)) {
    protected ProjectOption projectOption;
