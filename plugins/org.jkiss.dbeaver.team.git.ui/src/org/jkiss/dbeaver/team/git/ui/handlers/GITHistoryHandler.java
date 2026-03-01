                        if (resources.length == 1) {
            }
import java.util.stream.Collectors;
                            view.showHistoryFor(resources[0]);
import org.eclipse.egit.ui.internal.history.HistoryPageInput;
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.UIUtils;
 * you may not use this file except in compliance with the License.

                String resourceNames = Arrays.stream(selectedResources).map(r -> r.getFullPath().toString()).collect(Collectors.joining(","));
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
                    IWorkbenchPage page = activeWorkbenchWindow.getActivePage();
                        view.showHistoryFor(list);
            if (ArrayUtils.isEmpty(selectedResources)) {
                    "You need to select a resource to view Git history", SWT.ICON_WARNING);

                return null;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
                        IHistoryView view = (IHistoryView)page.showView("org.eclipse.team.ui.GenericHistoryView");
                        }

 * See the License for the specific language governing permissions and
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.utils.ArrayUtils;
                        HistoryPageInput list = new HistoryPageInput(repos[0], resources);
        Repository[] repos = this.getRepositories(event);
    }
                UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
                UIUtils.showMessageBox(HandlerUtil.getActiveShell(event),
            try {

        if (ArrayUtils.isEmpty(repos)) {
                    "No repository",
 *
                    "No repository",

 * You may obtain a copy of the License at
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.PartInitException;
 * DBeaver - Universal Database Manager
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

public class GITHistoryHandler extends GITAbstractHandler {
                        IResource[] resources = this.getSelectedResources(event);
 * limitations under the License.
/*
            IResource[] selectedResources = getSelectedResources(event);
import java.util.Arrays;

                if (activeWorkbenchWindow != null) {
        } else {
 *
                            return null;
            return null;
import org.eclipse.team.ui.history.IHistoryView;
 *
import org.eclipse.jgit.lib.Repository;
import org.eclipse.ui.IWorkbenchPage;
                IWorkbenchWindow activeWorkbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
                throw new ExecutionException(var8.getMessage(), var8);

import org.eclipse.core.commands.ExecutionEvent;
            } catch (PartInitException var8) {
            }

            } else {
package org.jkiss.dbeaver.team.git.ui.handlers;
 */
                    "No Git repository associated with selected resource(s):\n" + resourceNames, SWT.ICON_WARNING);
import org.eclipse.core.commands.ExecutionException;
                    if (page != null) {
