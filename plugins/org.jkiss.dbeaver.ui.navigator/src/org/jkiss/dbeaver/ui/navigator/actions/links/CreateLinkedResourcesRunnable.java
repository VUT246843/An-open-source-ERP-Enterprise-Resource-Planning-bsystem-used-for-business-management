
 * limitations under the License.
 *
import org.eclipse.core.runtime.IProgressMonitor;
            throws CoreException;
    public CreateLinkedResourcesRunnable(IContainer container, int flags, Path... paths) {
        this.paths = paths;
 *
        SubMonitor subMonitor = SubMonitor.convert(monitor, paths.length);

    private final Path[] paths;

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

                throw new CoreException(GeneralUtils.makeErrorStatus(composeErrorMessage(container, path)));
            }
    public void run(IProgressMonitor monitor) throws CoreException {
            if (subMonitor.isCanceled()) {
import org.eclipse.core.resources.IResource;
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (Path path : paths) {
            subMonitor.worked(1);
public abstract class CreateLinkedResourcesRunnable implements ICoreRunnable {
import org.eclipse.core.resources.IContainer;
    private final int flags;
 * distributed under the License is distributed on an "AS IS" BASIS,

    protected abstract void createLink(IContainer container, Path path, int flags, IProgressMonitor monitor)
        }
 *
    private final IContainer container;
import org.eclipse.core.runtime.SubMonitor;

 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
import org.eclipse.core.runtime.ICoreRunnable;
            throw new CoreException(GeneralUtils.makeErrorStatus(composeErrorMessage(container, paths)));
        this.container = container;
 */
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (container == null) {
        this.flags = flags;
    }
            if (path == null) {

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.navigator.actions.links;
    @Override

            }
                throw new CoreException(GeneralUtils.makeErrorStatus(composeCancelMessage(container, path)));

    public abstract String composeCancelMessage(IResource resource, Path path);
import org.eclipse.core.runtime.CoreException;
import java.nio.file.Path;
 * DBeaver - Universal Database Manager
            createLink(container, path, flags, monitor);
}
 * Unless required by applicable law or agreed to in writing, software

    public abstract String composeErrorMessage(IResource resource, Path... paths);
import org.jkiss.dbeaver.utils.GeneralUtils;
 * you may not use this file except in compliance with the License.
