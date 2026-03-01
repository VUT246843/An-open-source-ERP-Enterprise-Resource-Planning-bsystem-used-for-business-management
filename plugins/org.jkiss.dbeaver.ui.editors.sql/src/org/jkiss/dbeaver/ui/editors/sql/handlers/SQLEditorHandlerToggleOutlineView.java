 * You may obtain a copy of the License at
        try {
        }
        boolean isVisible = viewReference != null && viewReference.getView(false) != null;
            DBWorkbench.getPlatformUI().showError("Toggle outline", "Can't open outline view", e);
    }
        }
                IWorkbenchPage activePage = activeWindow.getActivePage();
        IViewReference viewReference = page.findViewReference(IPageLayout.ID_OUTLINE);
    @Override
import org.eclipse.ui.*;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        } catch (PartInitException e) {

/*


    public Object execute(ExecutionEvent event) throws ExecutionException {
                    }
import org.eclipse.ui.commands.IElementUpdater;

                        IViewPart outlineView = activePage.showView(IPageLayout.ID_OUTLINE);
 * DBeaver - Universal Database Manager
import org.eclipse.ui.services.IServiceLocator;
    public static void refreshCommandState(@NotNull IServiceLocator serviceLocator) {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (commandService != null) {
                if (activePage != null) {
import org.eclipse.core.commands.AbstractHandler;
    public void updateElement(UIElement element, Map parameters) {

                    if (viewReference != null && viewReference.getView(false) != null) {
                        if (outlineView != null) {
        return null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.menus.UIElement;
            if (activeWindow != null) {
                }
import org.eclipse.core.commands.ExecutionEvent;
public class SQLEditorHandlerToggleOutlineView extends AbstractHandler implements IElementUpdater {
                    IViewReference viewReference = activePage.findViewReference(IPageLayout.ID_OUTLINE);
            commandService.refreshElements(SQLEditorCommands.CMD_SQL_SHOW_OUTLINE, null);
} * Unless required by applicable law or agreed to in writing, software
        IWorkbenchPage page = element.getServiceLocator().getService(IWorkbenchPage.class);
import java.util.Map;
    }
 *
import org.eclipse.ui.commands.ICommandService;
                        }
                    refreshCommandState(activeWindow);
                            outlineView.setFocus();
        ICommandService commandService = serviceLocator.getService(ICommandService.class);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        activePage.hideView(viewReference);
        element.setChecked(isVisible);
            }
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
                    } else {
            IWorkbenchWindow activeWindow = HandlerUtil.getActiveWorkbenchWindow(event);
 *
 * See the License for the specific language governing permissions and
    @Override
import org.eclipse.core.commands.ExecutionException;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
import org.jkiss.code.NotNull;
