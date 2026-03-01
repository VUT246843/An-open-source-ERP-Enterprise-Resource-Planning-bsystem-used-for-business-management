 * you may not use this file except in compliance with the License.


 *
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IProgressMonitor;
    public ISourceContainer[] computeSourceContainers(ILaunchConfiguration configuration, IProgressMonitor monitor)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 */
 *
package org.jkiss.dbeaver.debug.sourcelookup;

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
public class DBGSourcePathComputer implements ISourcePathComputerDelegate {

            throws CoreException {
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.CoreException;
 * limitations under the License.
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.ISourcePathComputerDelegate;
        DatabaseNavigatorSourceContainer container = new DatabaseNavigatorSourceContainer(dataSource);
 *

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 * You may obtain a copy of the License at
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.debug.core.DebugUtils;
 * Unless required by applicable law or agreed to in writing, software
        return new ISourceContainer[] { container };
import org.eclipse.debug.core.ILaunchConfiguration;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DBPDataSourceContainer dataSource = DebugUtils.getDataSourceContainer(configuration);
