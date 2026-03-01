                ISelection selection = navigatorViewer.getSelection();
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
                    ((TreeViewer) navigatorViewer).expandAll();
 *
                    for (Iterator iter = ((IStructuredSelection) selection).iterator(); iter.hasNext(); ) {
    }
import org.eclipse.core.commands.ExecutionEvent;
    public Object execute(ExecutionEvent event) throws ExecutionException {
                } else if (selection instanceof IStructuredSelection) {
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
        if (navigatorModelView != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    public void updateElement(UIElement element, Map parameters) {
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.IWorkbenchPart;

            Viewer navigatorViewer = navigatorModelView.getNavigatorViewer();
package org.jkiss.dbeaver.ui.navigator.actions;
import org.eclipse.ui.commands.IElementUpdater;
        INavigatorModelView navigatorModelView = GeneralUtils.adapt(activePart, INavigatorModelView.class);
        return null;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
    }
import org.eclipse.ui.menus.UIElement;
import org.eclipse.core.commands.ExecutionException;
        element.setTooltip(UINavigatorMessages.navigator_expand_all_tip);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.eclipse.ui.handlers.HandlerUtil;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
                    }
                        ((TreeViewer) navigatorViewer).expandToLevel(iter.next(), TreeViewer.ALL_LEVELS);

import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        element.setText(UINavigatorMessages.navigator_expand_all_text);
public class NavigatorHandlerExpandAll extends AbstractHandler implements IElementUpdater {
 * You may obtain a copy of the License at
import org.eclipse.jface.viewers.TreeViewer;
 *

        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
                if (selection.isEmpty()) {
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
            }
import java.util.Map;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.eclipse.jface.viewers.ISelection;
import java.util.Iterator;
 */
/*
    @Override
 * DBeaver - Universal Database Manager
            if (navigatorViewer instanceof TreeViewer) {

