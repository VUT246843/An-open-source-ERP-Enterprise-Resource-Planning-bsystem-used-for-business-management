        String[] fileNames = dialog.getFileNames();

                    sb.append('*').append('.').append(extension);
                String[] fileSpecs = contentType.getFileSpecs(IContentType.FILE_EXTENSION_SPEC);
 *
        }
import org.eclipse.core.resources.ResourcesPlugin;
    public static IStatus createLinkedFiles(IContainer container, IProgressMonitor monitor, Path... paths) {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
     * @return
    @Override
        }

        }

import org.eclipse.swt.SWT;
        return Status.OK_STATUS;
 * Unless required by applicable law or agreed to in writing, software
        return (Path[]) paths.toArray(new Path[paths.size()]);

import org.eclipse.core.runtime.*;
    protected Path[] selectTargets(ExecutionEvent event) {

                for (String extension : fileSpecs) {
 * See the License for the specific language governing permissions and
        List<Path> paths = new ArrayList<>();
        for (int i = 0; i < fileNames.length; i++) {
 */
        String contentTypeId = event.getParameter(COMMAND_PARAMETER_LINK_FILE_CONTENTTYPE);
    /**

            workspace.run(action, monitor);
        String file = dialog.open();
        } catch (Throwable e) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
     * Bulk operation to create several linked files
        }
        FileDialog dialog = new FileDialog(shell, SWT.MULTI);
        Shell shell = HandlerUtil.getActiveShell(event);
            paths.add(filePath);
import java.util.ArrayList;
            if (contentType != null) {
                    if (sb.length() > 0) {
        } catch (CoreException e) {
package org.jkiss.dbeaver.ui.navigator.actions.links;
     * @param paths
     * @param container
 * you may not use this file except in compliance with the License.
import java.nio.file.Paths;
                StringBuilder sb = new StringBuilder();
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
    }
     * @param monitor

                if (sb.length() > 0) {
            return NO_TARGETS;
        if (contentTypeId != null) {
 *
            String fileName = fileNames[i];
import org.eclipse.core.resources.IContainer;
                    dialog.setFilterExtensions(extensions);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    private static final String COMMAND_PARAMETER_LINK_FILE_CONTENTTYPE = "org.jkiss.dbeaver.core.resource.link.file.contenttype"; //$NON-NLS-1$
 * DBeaver - Universal Database Manager

    }
}import java.nio.file.Path;
     *
     */
                }
            IContentType contentType = Platform.getContentTypeManager().getContentType(contentTypeId);
 * You may obtain a copy of the License at
                        sb.append(';');
public class LinkFileHandler extends CreateLinkHandler {
import org.eclipse.swt.widgets.FileDialog;
        if (file == null) {
            }
            Path filePath = Paths.get(filterPath, fileName);
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.core.commands.ExecutionEvent;

                    }
                    String[] extensions = new String[] { sb.toString() };
 *     http://www.apache.org/licenses/LICENSE-2.0
        CreateLinkedFilesRunnable action = new CreateLinkedFilesRunnable(container, paths);
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.ui.handlers.HandlerUtil;
            return GeneralUtils.makeErrorStatus(action.composeErrorMessage(container, paths), e);
    protected IStatus createLink(IContainer container, IProgressMonitor monitor, Path... targets) {
        return createLinkedFiles(container, monitor, targets);

                    String[] names = new String[] { contentType.getName() };
                    dialog.setFilterNames(names);
import org.eclipse.swt.widgets.Shell;
import org.eclipse.core.resources.IWorkspace;
        String filterPath = dialog.getFilterPath();
        try {
                }
            return e.getStatus();
    @Override
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
