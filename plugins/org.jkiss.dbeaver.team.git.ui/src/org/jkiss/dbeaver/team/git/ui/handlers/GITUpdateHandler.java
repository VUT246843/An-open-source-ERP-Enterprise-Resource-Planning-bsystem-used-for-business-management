 * You may obtain a copy of the License at

import java.util.LinkedHashSet;

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.ArrayUtils;
import org.eclipse.ui.commands.IElementUpdater;
 * See the License for the specific language governing permissions and
import java.util.Set;
 * limitations under the License.
package org.jkiss.dbeaver.team.git.ui.handlers;
        }
        if (ArrayUtils.isEmpty(repos)) {
    @Override
        } else {
 * Unless required by applicable law or agreed to in writing, software
            PullOperationUI pullOperationUI = new PullOperationUI(repositories);
import java.util.Arrays;
/*
 * DBeaver - Universal Database Manager
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void updateElement(UIElement element, Map parameters) {
import org.eclipse.ui.menus.UIElement;
import org.eclipse.jgit.lib.Repository;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            //element.setText("Update '" + project.getName() + "' changes from Git");


            pullOperationUI.start();
import org.eclipse.egit.ui.internal.pull.PullOperationUI;
            return null;
            return null;

import org.jkiss.dbeaver.team.git.ui.utils.GitUIUtils;
}


public class GITUpdateHandler extends GITAbstractHandler implements IElementUpdater {
 */

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        IProject project = GitUIUtils.extractActiveProject(element.getServiceLocator());
import org.eclipse.core.commands.ExecutionException;
        if (project != null) {
            Set<Repository> repositories = new LinkedHashSet<>(Arrays.asList(repos));
 *
import org.eclipse.core.commands.ExecutionEvent;
 *
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.resources.IProject;
        }
        Repository[] repos = this.getRepositories(event);
import java.util.Map;
 * you may not use this file except in compliance with the License.
