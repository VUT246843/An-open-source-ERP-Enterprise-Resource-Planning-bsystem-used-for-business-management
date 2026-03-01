 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
import org.eclipse.core.commands.ExecutionEvent;
            IPath location = resource.getLocation();
import org.jkiss.dbeaver.ui.ShellUtils;
import org.eclipse.jface.viewers.IStructuredSelection;
        if (resource != null) {
                ShellUtils.showInSystemExplorer(filePath);
 * you may not use this file except in compliance with the License.
                }
        IResource resource = GeneralUtils.adapt(element, IResource.class);
            if (location != null) {
                    filePath = envPathMapper.map(filePath);
    }
import org.eclipse.core.commands.ExecutionException;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        final IStructuredSelection structSelection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
public class NavigatorHandlerShowInExplorer extends NavigatorHandlerObjectBase {
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final Object element = structSelection.getFirstElement();
 *     http://www.apache.org/licenses/LICENSE-2.0
                String filePath = location.toString();
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
        }
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.handlers.HandlerUtil;

import org.jkiss.dbeaver.runtime.IEnvironmentPathMapper;
/*
 *

                IEnvironmentPathMapper envPathMapper = DBWorkbench.getService(IEnvironmentPathMapper.class);
import org.eclipse.core.runtime.IPath;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.runtime.DBWorkbench;
 */
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
}
        return null;
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.ui.navigator.actions;
 * See the License for the specific language governing permissions and
                if (envPathMapper != null && envPathMapper.isApplicable(filePath)) {
    @Override
