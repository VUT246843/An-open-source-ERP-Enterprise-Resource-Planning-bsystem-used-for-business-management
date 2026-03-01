    }
            throws CoreException {
    }
import org.eclipse.osgi.util.NLS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        org.eclipse.core.runtime.Path memberPath = new org.eclipse.core.runtime.Path(memberName);
 *
    public CreateLinkedFoldersRunnable(IContainer container, Path... path) {
 * Unless required by applicable law or agreed to in writing, software

        String memberName;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
import org.eclipse.core.resources.IContainer;
                pathStr = pathStr.substring(divPos + 1);

            // Get last part of full path.
import java.nio.file.Path;

    public String composeErrorMessage(IResource resource, Path... paths) {
        linked.createLink(path.toUri(), IResource.ALLOW_MISSING_LOCAL, monitor);
            if (divPos >= 0) {
            while (pathStr.endsWith("/")) pathStr = pathStr.substring(0, pathStr.length() - 1);
        if (path.getFileName() == null) {
        super(container, IResource.NONE, path);

 * limitations under the License.
            }
        final IFolder linked = container.getFolder(memberPath);
            // #3565 - external folders don't have file name
 * See the License for the specific language governing permissions and
        return NLS.bind(ModelMessages.CreateLinkedFolderRunnable_e_unable_to_link, resource, paths);
    public String composeCancelMessage(IResource resource, Path path) {
            memberName = pathStr;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

 *
import org.eclipse.core.runtime.CoreException;

        return NLS.bind(ModelMessages.CreateLinkedFolderRunnable_e_cancelled_link, resource, path);
package org.jkiss.dbeaver.ui.navigator.actions.links;

        } else {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.resources.IResource;
 *
    @Override
import org.eclipse.core.resources.IFolder;
}
    protected void createLink(IContainer container, Path path, int flags, IProgressMonitor monitor)
    @Override
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IProgressMonitor;
    }
            memberName = path.getFileName().toString();

 * Copyright (C) 2010-2024 DBeaver Corp and others
            String pathStr = path.toString().replace('\\', '/');

/*
        }
public class CreateLinkedFoldersRunnable extends CreateLinkedResourcesRunnable {
 * You may obtain a copy of the License at
    }
            int divPos = pathStr.lastIndexOf('/');
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.messages.ModelMessages;
