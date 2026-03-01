
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * You may obtain a copy of the License at
*/
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        }
                    for (Iterator iter = ((IStructuredSelection) selection).iterator(); iter.hasNext(); ) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (navigatorViewer instanceof TreeViewer) {
                }
    @Override
                if (selection.isEmpty()) {
    }
} * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.Viewer;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
            Viewer navigatorViewer = navigatorModelView.getNavigatorViewer();
 * limitations under the License.
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.core.commands.ExecutionEvent;
/*
                    }
        if (navigatorModelView != null) {
                    ((TreeViewer) navigatorViewer).collapseAll();
                } else if (selection instanceof IStructuredSelection) {
 * you may not use this file except in compliance with the License.

import org.eclipse.core.commands.ExecutionException;
            }
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.commands.AbstractHandler;
                ((TreeViewer) navigatorViewer).collapseAll();
                        ((TreeViewer) navigatorViewer).collapseToLevel(iter.next(), TreeViewer.ALL_LEVELS);
    public Object execute(ExecutionEvent event) throws ExecutionException {
        INavigatorModelView navigatorModelView = GeneralUtils.adapt(activePart, INavigatorModelView.class);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager

        return null;
/*
 *
package org.jkiss.dbeaver.ui.navigator.actions;
import org.eclipse.ui.IWorkbenchPart;
public class NavigatorHandlerCollapseAll extends AbstractHandler {
import org.jkiss.dbeaver.utils.GeneralUtils;
                ISelection selection = navigatorViewer.getSelection();
