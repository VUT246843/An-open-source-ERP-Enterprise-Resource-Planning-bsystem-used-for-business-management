    private static final String SHOW_MARKETPLACE_COMMAND = "org.eclipse.epp.mpc.ui.command.showMarketplaceWizard"; //$NON-NLS-1$

    /**
import org.eclipse.core.commands.Command;
    /**
    public static ApplicationPolicyService getInstance() {

     *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 *
            disableCommand(commandService, UPDATE_SOFTWARE_COMMAND);
    }
    private ApplicationPolicyService() {

}
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
    /**
        }
    private static final String POLICY_SOFTWARE_UPDATE_DISABLED = "policy.software.update.disabled"; //$NON-NLS-1$
     * @param commandService - service
/*
    private static final String POLICY_SOFTWARE_INSTALL_DISABLED = "policy.software.install.disabled"; //$NON-NLS-1$
 * DBeaver - Universal Database Manager
    public void disableStandardProductModification(@NotNull ICommandService commandService) {
 *
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
        // no implementation
    private void disableCommand(@NotNull ICommandService commandService, @NotNull String commandName) {
            disableCommand(commandService, SHOW_MARKETPLACE_COMMAND); 
     * The instance of service
        }
            command.setHandler(null);
     * Return true, if software install/update policy enabled
        Command command = commandService.getCommand(commandName);
     */
     */

        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(POLICY_SOFTWARE_INSTALL_DISABLED)) {

    private static final ApplicationPolicyService service = new ApplicationPolicyService();

 */
        if (command != null) {

    }
 *
 * See the License for the specific language governing permissions and
     */
        return ApplicationPolicyProvider.getInstance().isPolicyEnabled(POLICY_SOFTWARE_INSTALL_DISABLED)
     * The method designed to reconcile standard command by specific
            command.setEnabled(false);
 * limitations under the License.
            || ApplicationPolicyProvider.getInstance().isPolicyEnabled(POLICY_SOFTWARE_UPDATE_DISABLED);
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isInstallUpdateDisabled() {
        return service;
public class ApplicationPolicyService {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
     * @return - instance of service
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final String UPDATE_SOFTWARE_COMMAND = "org.eclipse.equinox.p2.ui.sdk.update"; //$NON-NLS-1$
     *

    private static final String INSTALL_NEW_SOFTWARE_COMMAND = "org.eclipse.equinox.p2.ui.sdk.install"; //$NON-NLS-1$
 * You may obtain a copy of the License at
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(POLICY_SOFTWARE_UPDATE_DISABLED)) {
            disableCommand(commandService, INSTALL_NEW_SOFTWARE_COMMAND);
package org.jkiss.dbeaver.core.ui.services;
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.commands.ICommandService;

