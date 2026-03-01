    }
    }
     * https://docs.microsoft.com/en-us/windows/uwp/get-started/fileio-learning-track
     * This happens due to WinStore apps using their own ms-appdata:// instead of a normal one and no other executables
    public String toString() {
 * NativeClientDescriptor
import org.jkiss.dbeaver.utils.RuntimeUtils;


            if (distr.getOs().matches(localSystem)
    public String getLabel() {
        }
 * DBeaver - Universal Database Manager

        for (NativeClientDistributionDescriptor distr : distributions) {

    @Override
package org.jkiss.dbeaver.registry;
                && !isClientsPathVirtualizedByWindows(driversHome.resolve(distr.getTargetPath()))) {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 * limitations under the License.
        return (application.isStandalone()
     * see #15361

            && !application.isHeadlessMode()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 */

     * clients there.
 *     http://www.apache.org/licenses/LICENSE-2.0
        return label;
 *
                continue;
    /**
 *
/*
            && clientFile.startsWith(System.getenv("AppData")));
        return id;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.connection.DBPDriver;
    }
        }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    NativeClientDescriptor(IConfigurationElement config) {
public class NativeClientDescriptor extends AbstractDescriptor {
import java.util.List;
    private boolean isClientsPathVirtualizedByWindows(Path clientFile) {
    @Nullable
     * @param clientFile client path
import org.jkiss.dbeaver.model.runtime.OSDescriptor;
import org.eclipse.core.runtime.IConfigurationElement;
        super(config.getContributor().getName());
 * Licensed under the Apache License, Version 2.0 (the "License");
        return id;
    }
            // Include all clients for custom drivers
            }
            this.distributions.add(new NativeClientDistributionDescriptor(clientElement));
     * have access to it.
    private final List<NativeClientDistributionDescriptor> distributions = new ArrayList<>();
 *
        final DBPApplication application = DBWorkbench.getPlatform().getApplication();
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
/**
 * You may obtain a copy of the License at
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);

            }
            if (!driver.isCustom() && !distr.supports(driver)) {

    public NativeClientDistributionDescriptor findDistribution(@NotNull DBPDriver driver) {
 * Unless required by applicable law or agreed to in writing, software
import java.nio.file.Path;
        for (IConfigurationElement clientElement : config.getChildren("dist")) {
    }
 * See the License for the specific language governing permissions and
import java.util.ArrayList;
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private String label;
 */


}
        OSDescriptor localSystem = DBWorkbench.getPlatform().getLocalSystem();

    }
                return distr;
        final Path driversHome = DriverDescriptor.getCustomDriversHome().toAbsolutePath();
    public String getId() {
import org.jkiss.dbeaver.model.app.DBPApplication;
     * Clients can't work from an AppData folder, if app is the Windows store app we don't want to use any native
    private String id;
            && RuntimeUtils.isWindowsStoreApplication()
     * @return true if path is virtualized
        return null;
 * you may not use this file except in compliance with the License.
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);

