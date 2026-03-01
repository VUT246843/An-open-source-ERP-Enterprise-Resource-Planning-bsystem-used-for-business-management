import org.eclipse.debug.core.sourcelookup.ISourceContainerType;
 *
 * You may obtain a copy of the License at
 *
    protected ISourceContainer[] createSourceContainers() throws CoreException {
import org.eclipse.debug.core.sourcelookup.containers.CompositeSourceContainer;
    @Override
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.debug.core.DebugUtils;
    }
        }
            VoidProgressMonitor monitor = new VoidProgressMonitor();
    @Override

import org.jkiss.dbeaver.model.navigator.DBNNode;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new CoreException(DebugUtils.newErrorStatus(message, e));
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
}
package org.jkiss.dbeaver.debug.sourcelookup;
        } catch (DBException e) {
        return getSourceContainerType(DBGConstants.SOURCE_CONTAINER_TYPE_DATASOURCE);
import org.eclipse.core.runtime.CoreException;
            String message = NLS.bind(DebugCoreMessages.DatasourceSourceContainer_e_extract_node, name);
    public DatabaseNavigatorSourceContainer(DBPDataSourceContainer descriptor) {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.debug.internal.core.DebugCoreMessages;

import org.jkiss.dbeaver.model.app.DBPProject;

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.datasource = descriptor;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;

    public String getName() {

    }
    private final DBPDataSourceContainer datasource;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    protected Object[] findSourceElements(String name, ISourceContainer[] containers) throws CoreException {
        try {
 *

    }
    public ISourceContainerType getType() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return new ISourceContainer[0];
import org.eclipse.osgi.util.NLS;
        DBNNode node;
/*
        return datasource.getName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

import org.jkiss.dbeaver.debug.DBGConstants;
        if (node != null) {
    }
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    private final DBPProject project;
 * limitations under the License.
        return super.findSourceElements(name, containers);
        this.project = datasource.getRegistry().getProject();

 * Unless required by applicable law or agreed to in writing, software
            return new Object[] { node };
            node = DBWorkbench.getPlatform().getNavigatorModel().getNodeByPath(monitor, project, name);
 */
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

public class DatabaseNavigatorSourceContainer extends CompositeSourceContainer {
