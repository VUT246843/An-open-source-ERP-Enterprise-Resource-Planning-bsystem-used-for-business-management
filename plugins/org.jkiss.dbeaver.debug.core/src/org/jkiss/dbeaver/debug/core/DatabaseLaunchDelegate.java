        DatabaseProcess process = createProcess(launch, configuration.getName());
    }
package org.jkiss.dbeaver.debug.core;
import org.eclipse.osgi.util.NLS;
 * Unless required by applicable law or agreed to in writing, software
            }
        if (controller == null) {
import org.eclipse.debug.core.ILaunchConfiguration;
        return new DatabaseProcess(launch, name);
 */
import org.jkiss.dbeaver.debug.DBGException;
    }
    @Override
 *
            if (controllerFactory != null) {
import org.jkiss.dbeaver.debug.core.model.DatabaseProcess;
import org.eclipse.debug.core.ILaunch;
    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
 * limitations under the License.
                return controllerFactory.createController(dataSourceContainer, attributes);
/*

            throw new CoreException(GeneralUtils.makeExceptionStatus(e));
public class DatabaseLaunchDelegate extends LaunchConfigurationDelegate {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    protected DatabaseDebugTarget createDebugTarget(ILaunch launch, DBGController controller, DatabaseProcess process) {
        DatabaseDebugTarget target = createDebugTarget(launch, controller, process);

                NLS.bind("Unable to find controller factory for datasource \"{0}\"", dataSourceContainer.getDriver().getProviderId())
 * distributed under the License is distributed on an "AS IS" BASIS,
            String message = NLS.bind("Unable to find debug controller for datasource {0}", datasourceDescriptor);
        } catch (DBGException e) {


    protected DBGController createController(DBPDataSourceContainer dataSourceContainer, Map<String, Object> attributes) throws CoreException {
        }
        target.connect(monitor);
 *     http://www.apache.org/licenses/LICENSE-2.0
        DBPDataSourceContainer datasourceDescriptor = DebugUtils.getDataSourceContainer(configuration);
        try {
            );
        return new DatabaseDebugTarget(DBGConstants.MODEL_IDENTIFIER_DATABASE, launch, process, controller);
import org.jkiss.dbeaver.debug.core.model.DatabaseDebugTarget;
            throw new DBGException(
        DBGController controller = createController(datasourceDescriptor, configuration.getAttributes());
import java.util.Map;
}
import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.debug.DBGControllerFactory;
    protected DatabaseProcess createProcess(ILaunch launch, String name) {
import org.eclipse.core.runtime.IProgressMonitor;
        launch.addDebugTarget(target);
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.debug.DBGConstants;
            DBGControllerFactory controllerFactory = GeneralUtils.adapt(dataSourceContainer, DBGControllerFactory.class);
import org.jkiss.dbeaver.debug.DBGController;

 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new CoreException(DebugUtils.newErrorStatus(message));
        }
 *

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.utils.GeneralUtils;

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
            throws CoreException {
    }

    }
