
 * See the License for the specific language governing permissions and

        ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
public class DatabaseDebugLaunchShortcut extends DatabaseLaunchShortcut {
        ILaunchConfigurationType type = manager.getLaunchConfigurationType(CONFIG_TYPE);

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DatabaseDebugLaunchShortcut() {
        super(CONFIG_TYPE, "Database Debug");
 *
        return launchConfig;

 * DBeaver - Universal Database Manager
    protected boolean isCandidate(ILaunchConfiguration config, DBSObject launchable, Map<String, Object> databaseContext) throws CoreException {
}
        if (databaseContext != null) {

 * You may obtain a copy of the License at

        ILaunchConfigurationWorkingCopy launchConfig = type.newInstance(null, launchable.getName());
import java.util.Map;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObject;

        }


        return super.isCandidate(config, launchable, databaseContext);
    private static final String CONFIG_TYPE = "org.jkiss.dbeaver.debug.launchConfiguration";
import org.eclipse.core.runtime.CoreException;
package org.jkiss.dbeaver.debug.ui.internal;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.debug.ui.DatabaseLaunchShortcut;
    protected ILaunchConfiguration createConfiguration(DBSObject launchable, Map<String, Object> databaseContext) throws CoreException {
import org.jkiss.dbeaver.debug.core.DebugUtils;

 * Unless required by applicable law or agreed to in writing, software
 *
    @Override
            DebugUtils.putContextInConfiguration(launchConfig, databaseContext);
import org.eclipse.debug.core.*;
    }
 * limitations under the License.
 * you may not use this file except in compliance with the License.
/*
