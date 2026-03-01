     * @param monitor
        return Status.OK_STATUS;

    public static IStatus createLinkedFolders(IContainer container, IProgressMonitor monitor, Path... paths) {
        return new Path[] { folderPath };
 */
     * @param container
    @Override
    protected Path[] selectTargets(ExecutionEvent event) {
        String folder = dialog.open();
        Shell shell = HandlerUtil.getActiveShell(event);

        if (folder == null) {
import org.jkiss.dbeaver.utils.GeneralUtils;

        Path folderPath = Paths.get(folder);
            workspace.run(action, monitor);
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
import org.eclipse.swt.SWT;
    /**
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.navigator.actions.links;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.Status;
    }
     */
        DirectoryDialog dialog = new DirectoryDialog(shell, SWT.OPEN);
 * DBeaver - Universal Database Manager
    }
 * Unless required by applicable law or agreed to in writing, software
     * @return

    @Override
 * limitations under the License.
    }

import org.eclipse.core.runtime.IStatus;
        } catch (Throwable e) {
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Shell;
import java.nio.file.Path;
}/*
 *
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
        CreateLinkedFoldersRunnable action = new CreateLinkedFoldersRunnable(container, paths);
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.resources.IContainer;
        } catch (CoreException e) {
        return createLinkedFolders(container, monitor, targets);
        }
    protected IStatus createLink(IContainer container, IProgressMonitor monitor, Path... targets) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return NO_TARGETS;
 *
 * You may obtain a copy of the License at
     * @param paths
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.core.commands.ExecutionEvent;
     * Bulk operation to create several linked folders
import org.eclipse.core.resources.IWorkspace;
            return e.getStatus();

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.handlers.HandlerUtil;
            return GeneralUtils.makeErrorStatus(action.composeErrorMessage(container, paths), e);
import java.nio.file.Paths;
public class LinkFolderHandler extends CreateLinkHandler {
     *
 *

        }
