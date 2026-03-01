            protected void execute(IProgressMonitor monitor)
import java.lang.reflect.InvocationTargetException;

        final IWorkbenchWindow activeWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
            statusAdapter.setProperty(IStatusAdapterConstants.TITLE_PROPERTY,
                    break;
                }
import org.eclipse.core.resources.IResource;
    static final Path[] NO_TARGETS = new Path[0];
import org.eclipse.core.commands.AbstractHandler;
 */
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.core.commands.ExecutionException;
        }
        if (container == null) {
                    throw new OperationCanceledException(linked.getMessage());
import org.eclipse.core.resources.IFolder;
        } catch (InterruptedException e) {
                UINavigatorMessages.CreateLinkHandler_e_create_link_title);
import java.nio.file.Path;
import org.eclipse.osgi.util.NLS;
        Path[] locations = selectTargets(event);
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (activeWindow != null) {
        Object first = ((IStructuredSelection)structured).getFirstElement();
            return null;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
            }
            // skip
import org.eclipse.ui.PlatformUI;
        IResource resource = GeneralUtils.adapt(first, IResource.class);

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.GeneralUtils;
        };
    public Object execute(ExecutionEvent event) throws ExecutionException {
            return activeWindow;
        if (structured.isEmpty() || !(structured instanceof IStructuredSelection)) {
    protected abstract IStatus createLink(IContainer container, IProgressMonitor monitor, Path... targets);



        return PlatformUI.getWorkbench().getProgressService();
        return null;
        IContainer container = extractContainer(resource);
import org.eclipse.ui.actions.WorkspaceModifyOperation;
        try {
    }
            StatusAdapter statusAdapter = new StatusAdapter(error);
public abstract class CreateLinkHandler extends AbstractHandler {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (container instanceof IFolder && !container.exists()) {
            IStatus error = GeneralUtils.makeErrorStatus(UINavigatorMessages.CreateLinkHandler_e_create_link_message,

import org.eclipse.core.runtime.IStatus;
        return null;
                    throw new CoreException(linked);
import org.eclipse.core.commands.ExecutionEvent;
            return null;
package org.jkiss.dbeaver.ui.navigator.actions.links;
import org.eclipse.core.runtime.IProgressMonitor;
 * See the License for the specific language governing permissions and
            context.run(true, true, operation);
            StatusManager.getManager().handle(statusAdapter, StatusManager.SHOW);
                switch (severity) {
            IStatus error = GeneralUtils.makeErrorStatus(NLS.bind(UINavigatorMessages.CreateLinkHandler_e_create_link_validation, resource));
 *
                IStatus linked = createLink(container, monitor, locations);
        if (locations == null || locations.length == 0) {
/*
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.statushandlers.StatusManager;


                case IStatus.ERROR:
        if (resource instanceof IContainer) {
import org.eclipse.jface.viewers.IStructuredSelection;
    }
    private IContainer extractContainer(IResource resource) {
    }
                UINavigatorMessages.CreateLinkHandler_e_create_link_title);
 * limitations under the License.
        } catch (InvocationTargetException e) {
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

                    throws CoreException {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
    @Override
}        }
import org.eclipse.jface.viewers.ISelection;
                int severity = linked.getSeverity();
        IRunnableContext context = getRunnableContext(event);
                default:

        ISelection structured = HandlerUtil.getCurrentSelection(event);
        }
                    // Create parent folder
            StatusAdapter statusAdapter = new StatusAdapter(error);
            @Override
 *
import org.eclipse.ui.IWorkbenchWindow;
    private IRunnableContext getRunnableContext(ExecutionEvent event) {
            StatusManager.getManager().handle(statusAdapter, StatusManager.LOG | StatusManager.SHOW);
import org.eclipse.core.runtime.CoreException;
                    ((IFolder) container).create(true, true, monitor);

import org.eclipse.core.resources.IContainer;
            return null;
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.OperationCanceledException;
            return (IContainer) resource;
    protected abstract Path[] selectTargets(ExecutionEvent event);
                }
                    e.getTargetException());
 * DBeaver - Universal Database Manager
        }
            statusAdapter.setProperty(IStatusAdapterConstants.TITLE_PROPERTY,

 * Licensed under the Apache License, Version 2.0 (the "License");
                case IStatus.CANCEL:
import org.eclipse.ui.statushandlers.StatusAdapter;
        }
import org.eclipse.ui.handlers.HandlerUtil;
 *

