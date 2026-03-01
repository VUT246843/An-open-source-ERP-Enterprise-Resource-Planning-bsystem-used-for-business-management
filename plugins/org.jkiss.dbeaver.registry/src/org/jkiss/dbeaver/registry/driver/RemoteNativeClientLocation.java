    @Override
public class RemoteNativeClientLocation implements DBPNativeClientLocation {
package org.jkiss.dbeaver.registry.driver;

            File driversHome = DriverDescriptor.getCustomDriversHome().toFile();

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.registry.NativeClientDescriptor;
    private final DBPDriver driver;
    public boolean validateFilesPresence(@NotNull DBRProgressMonitor progressMonitor) throws DBException, InterruptedException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public File getPath() {
    @NotNull
    }

        return "Remote: " + clientDescriptor.getId();
    @NotNull

 */
    @Override
/**
        }
    }
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.connection.DBPDriver;
/*
    public String getName() {
    @Override
        if (distribution != null) {
    }
        }
            return distribution.downloadFiles(progressMonitor, this);
        if (distribution != null) {
        this.driver = driver;
    @Override
        return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.registry.NativeClientDistributionDescriptor;
import org.jkiss.dbeaver.DBException;

    }
            return new File(driversHome, distribution.getTargetPath());
        return new File(getName());
    }
    public RemoteNativeClientLocation(@NotNull NativeClientDescriptor clientDescriptor, @NotNull DBPDriver driver) {
    public String getDisplayName() {
 *
 * LocalNativeClientLocation

 * You may obtain a copy of the License at
        NativeClientDistributionDescriptor distribution = clientDescriptor.findDistribution(driver);
 *
        return clientDescriptor.getId();
    private final NativeClientDescriptor clientDescriptor;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
 * limitations under the License.
        NativeClientDistributionDescriptor distribution = clientDescriptor.findDistribution(driver);
import java.io.File;

        this.clientDescriptor = clientDescriptor;
    @Override

        return clientDescriptor.getLabel();
}
    public String toString() {
    }
 */
 *
