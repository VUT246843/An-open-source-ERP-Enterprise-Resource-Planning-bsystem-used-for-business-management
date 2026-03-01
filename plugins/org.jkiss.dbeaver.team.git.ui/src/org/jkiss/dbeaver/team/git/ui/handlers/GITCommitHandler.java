
    public void updateElement(UIElement element, Map parameters) {
package org.jkiss.dbeaver.team.git.ui.handlers;
        final Repository repository = getRepository(true, event);
            commitUi.commit();
    @Override
import org.eclipse.jgit.lib.Repository;
    }
            return null;
        }
        final Shell shell = HandlerUtil.getActiveShell(event);
import org.eclipse.core.resources.IProject;

 *     http://www.apache.org/licenses/LICENSE-2.0
            CommitUI commitUi = new CommitUI(shell, repository,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        IProject project = GitUIUtils.extractActiveProject(element.getServiceLocator());
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import org.eclipse.core.resources.IResource;
import org.eclipse.egit.ui.internal.commit.CommitUI;

 */

import org.eclipse.ui.handlers.HandlerUtil;
                    resourcesInScope, false);
    @Override
import org.jkiss.dbeaver.team.git.ui.utils.GitUIUtils;
        IResource[] resourcesInScope = getResourcesInScope(event);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

        return null;
import org.eclipse.swt.widgets.Shell;
 *
 * See the License for the specific language governing permissions and

    }
        if (project != null) {
        }
        if (repository == null) {
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
import org.eclipse.ui.menus.UIElement;
    public Object execute(final ExecutionEvent event) throws ExecutionException {

import java.util.Map;
        }
 * you may not use this file except in compliance with the License.
            //element.setText("Commit '" + project.getName() + "' changes to Git");
        if (resourcesInScope != null) {
import org.eclipse.core.commands.ExecutionException;
 * limitations under the License.
 *
 * Unless required by applicable law or agreed to in writing, software
public class GITCommitHandler extends GITAbstractHandler implements IElementUpdater {
 * You may obtain a copy of the License at
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.ui.commands.IElementUpdater;
