 */


import org.eclipse.core.resources.IFile;

    }
    }
    public String composeErrorMessage(IResource resource, Path... paths) {

import org.eclipse.core.resources.IContainer;
 * Unless required by applicable law or agreed to in writing, software
        String memberName = path.getFileName().toString();
        org.eclipse.core.runtime.Path memberPath = new org.eclipse.core.runtime.Path(memberName);
import org.eclipse.osgi.util.NLS;
}
    @Override
    public String composeCancelMessage(IResource resource, Path path) {

    protected void createLink(IContainer container, Path path, int flags, IProgressMonitor monitor)
        return NLS.bind(ModelMessages.CreateLinkedFileRunnable_e_cancelled_link, resource, path);
    public CreateLinkedFilesRunnable(IContainer container, Path... paths) {
 * You may obtain a copy of the License at
/*
    }
 * limitations under the License.

import java.nio.file.Path;
 * you may not use this file except in compliance with the License.
 *

        final IFile linked = container.getFile(memberPath);

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.CoreException;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            throws CoreException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.resources.IResource;
        super(container, IResource.NONE, paths);
public class CreateLinkedFilesRunnable extends CreateLinkedResourcesRunnable {
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
import org.eclipse.core.runtime.IProgressMonitor;
        return NLS.bind(ModelMessages.CreateLinkedFileRunnable_e_unable_to_link, resource, paths);
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.navigator.actions.links;
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        linked.createLink(path.toUri(), IResource.NONE, monitor);
    }
