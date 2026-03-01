                                log.error(e);
 * limitations under the License.
        assert(node instanceof DBNResource);
                        container.connect(monitor, true, false);
import org.jkiss.dbeaver.model.navigator.DBNNode;
                    if (executorDescriptor != null && executorDescriptor.getNativeExecutor() != null) {
import org.eclipse.ui.handlers.HandlerUtil;
        }.schedule();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                return Status.OK_STATUS;
            @Override
                        });
    public Object execute(ExecutionEvent event) throws ExecutionException {
                String resourcePath = project.getResourcePath(script);
                        UIUtils.syncExec(() -> {
                                    launchObject = foundCatalog;

                    if (!container.isConnected()) {
/*
import java.util.Collection;
        if (selection.isEmpty()) {
        assert (resource instanceof IFile);
                    resourcePath,
                    DBPDataSource dataSource = container.getDataSource();
                );

                                if (foundCatalog != null) {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                            (SQLScriptExecutor<DBSObject>) executorDescriptor.getNativeExecutor();
                        Path file = DBFUtils.resolvePathFromURI(monitor, project, script.getLocationURI());
        }
                    EditorUtils.PROP_CONTEXT_DEFAULT_CATALOG
                                DBSObject foundCatalog = DBUtils.findObject(children, catalog);
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                try {
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                RCPProject project = (RCPProject) DBPPlatformDesktop.getInstance().getWorkspace().getProject(script.getProject());
import org.jkiss.dbeaver.model.navigator.DBNResource;
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.DBException;
            return null;
 *
    private static final Log log = Log.getLog(NavigatorHandlerExec.class);
}
import org.jkiss.code.NotNull;
                }
 */
 *
    }
                            try {
import java.nio.file.Path;
package org.jkiss.dbeaver.ui.navigator.actions;
import org.eclipse.core.resources.IFile;
                    }
        return null;
                                nativeExecutor.execute(finalLaunchObject, file);
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.model.rcp.RCPProject;
                    SQLNativeExecutorDescriptor executorDescriptor = SQLNativeExecutorRegistry.getInstance()

                                }
            @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.ui.UIUtils;
                            } catch (DBException e) {

import org.eclipse.core.resources.IResource;
                        SQLScriptExecutor<DBSObject> nativeExecutor =
                        }
        DBPDataSourceContainer container = EditorUtils.getFileDataSource(script);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
                    if (catalog != null) {
    @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.EditorUtils;
 * See the License for the specific language governing permissions and
                    }
        }
import org.eclipse.core.commands.ExecutionEvent;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
                } catch (Throwable exception) {
        if (container == null) {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorRegistry;
                String catalog = (String) project.getResourceProperty(
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionException;
                    return Status.error("Error calling native execution" ,exception);
 * you may not use this file except in compliance with the License.

                    }
        IResource resource = ((DBNResource) node).getResource();
        final DBNNode node = NavigatorUtils.getSelectedNode(selection);
 * Unless required by applicable law or agreed to in writing, software
                    DBSObject launchObject = dataSource;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                            if (DBSCatalog.class.isAssignableFrom(((DBSObjectContainer) dataSource).getPrimaryChildType(monitor))) {
                                Collection<? extends DBSObject> children = ((DBSObjectContainer) dataSource).getChildren(monitor);
                        .getExecutorDescriptor(container);
import org.jkiss.dbeaver.model.DBPDataSource;
                        if (dataSource instanceof DBSObjectContainer) {
import org.eclipse.core.commands.AbstractHandler;
                            }
public class NavigatorHandlerExec extends AbstractHandler {
import org.jkiss.dbeaver.model.DBUtils;
                        DBSObject finalLaunchObject = launchObject;
import org.eclipse.core.runtime.Status;
            return null;
import org.jkiss.dbeaver.ui.actions.exec.SQLScriptExecutor;
import org.jkiss.dbeaver.model.fs.DBFUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
import org.jkiss.dbeaver.ui.actions.exec.SQLNativeExecutorDescriptor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        new AbstractJob("Calling native execution") {
        IFile script = (IFile) resource;
 * DBeaver - Universal Database Manager
                            }
