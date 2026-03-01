 * limitations under the License.

        @NotNull DBPDataSourceProviderRegistry driverRegistry,

            for (DBPDriver driver : provider.getDrivers()) {
                throw new CLIException("Driver '" + driverId + "' not found", CLIConstants.EXIT_CODE_ILLEGAL_ARGUMENTS);
                }
    private String driverId;
import java.util.*;
/*
                    continue;
                String helpText = CLIUtils.getPropertyHelpText(property, prefix);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (driver == null) {
}
            oneDriverHelp(driver, networkHandlerRegistry, output);
            for (DBPPropertyDescriptor property : handler.getHandlerProperties()) {
import org.jkiss.dbeaver.model.cli.*;
 *
                output.append(helpText);
            String prefix = handler.getPrefix() + ".";
                        .add(driver.getId());
 *
        if (CommonUtils.isNotEmpty(driverId)) {

        }
            }
            output.append("\n");
                if (property.isHidden()) {
            output.deleteCharAt(output.length() - 1);
            output.append("\n");
                output.append(helpText);

 * See the License for the specific language governing permissions and
    }
        List<? extends DBWHandlerDescriptor> networkHandlers = networkHandlerRegistry.getDescriptors(driver);
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (DBPDataSourceProviderDescriptor provider : providers) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                String helpText = CLIUtils.getPropertyHelpText(property, prefix);
    @NotNull


            String prefix = handler.getPrefix() + ".";
        @NotNull StringBuilder output
    ) {
 */
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
package org.jkiss.dbeaver.model.cli.command;
            allDriversHelp(driverRegistry, networkHandlerRegistry, output);
        context().addResult(output.toString());
import org.jkiss.utils.ArrayUtils;
            }
@CommandLine.Command(name = "network-handlers", description = "List available database network handlers.")
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        @NotNull DBWHandlerRegistry networkHandlerRegistry,
        @NotNull DBWHandlerRegistry networkHandlerRegistry,
        DBPDataSourceProviderRegistry driverRegistry = DBWorkbench.getPlatform().getDataSourceProviderRegistry();
        List<? extends DBPDataSourceProviderDescriptor> providers = driverRegistry.getDataSourceProviders();
            }
 *
        DBWHandlerRegistry networkHandlerRegistry = DBWorkbench.getPlatform().getNetworkHandlerRegistry();
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
            if (!ArrayUtils.isEmpty(handler.getHandlerProperties())) {
import org.jkiss.code.NotNull;
    }
                .append(", Name: ").append(handler.getCodeName());
            String handlerId = entry.getKey();
    public void run() throws CLIException {
    private void allDriversHelp(
    private void oneDriverHelp(
        Map<String, Set<String>> driversByHandler = new HashMap<>();
            }
            for (DBPPropertyDescriptor property : handler.getHandlerProperties()) {
                output.append(", Parameters:");
                .append(", Name: ").append(handler.getCodeName());
        StringBuilder output = new StringBuilder();
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.model.net.DBWHandlerRegistry;
            output.append("\n");
            output.append("Network Handler ID: ").append(handlerId)
                output.append(", Parameters:");
            }
        output.append("Network handlers for driver '").append(driver.getName()).append("'\n");
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;
            DBWHandlerDescriptor handler = networkHandlerRegistry.getDescriptor(handlerId);

            if (!ArrayUtils.isEmpty(handler.getHandlerProperties())) {
        }
        context().setPostAction(CLIProcessResult.PostAction.SHUTDOWN);
 * You may obtain a copy of the License at
        @NotNull StringBuilder output
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBPDriver driver,
                for (var networkHandler : networkHandlers) {

    ) {
        }
import picocli.CommandLine;

        } else {

import org.jkiss.dbeaver.model.net.DBWHandlerDescriptor;
        while (!output.isEmpty() && Character.isWhitespace(output.charAt(output.length() - 1))) {
    }
        for (var handler : networkHandlers) {
 * you may not use this file except in compliance with the License.
public class ListNetworkHandlersParameterHandler extends CLIAbstractSubcommand {

                        .computeIfAbsent(networkHandler.getId(), k -> new HashSet<>())
                }
            output.append("Network Handler ID: ").append(handler.getId())
                    driversByHandler
            var driver = driverRegistry.findDriver(driverId);
                List<? extends DBWHandlerDescriptor> networkHandlers = networkHandlerRegistry.getDescriptors(driver);
    @CommandLine.Option(names = {"--driver"}, arity = "1", description = "List supported handlers for the specified driver.")
        for (var entry : driversByHandler.entrySet()) {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

        }
        output.append("Available network handlers:\n");
