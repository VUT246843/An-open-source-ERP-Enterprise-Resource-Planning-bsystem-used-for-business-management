 */
        IActionBars actionBars = activeEditor.getEditorSite().getActionBars();
    {
 * Search actions contributor

import org.jkiss.dbeaver.ui.ISearchContextProvider;
    }
import org.eclipse.jface.action.IMenuManager;
                actionBars.setGlobalActionHandler(IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE, findAction);
 *
{
 * See the License for the specific language governing permissions and
            actionBars.setGlobalActionHandler(IWorkbenchActionDefinitionIds.FIND_PREVIOUS, null);
            if (provider.isSearchPossible()) {
    @Override
                findAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE);
 */
import org.eclipse.ui.IWorkbenchCommandConstants;
        ISearchContextProvider provider = DBUtils.getAdapter(ISearchContextProvider.class, activeEditor);
        }
import org.eclipse.ui.texteditor.IWorkbenchActionDefinitionIds;
    public static void registerSearchActions(IEditorPart activeEditor)
            }
                actionBars.setGlobalActionHandler(IWorkbenchActionDefinitionIds.FIND_NEXT, findNextAction);
                ContextSearchAction findPrevAction = new ContextSearchAction(provider, ISearchContextProvider.SearchType.PREVIOUS);
 * DBeaver - Universal Database Manager
    {
                findNextAction.setActionDefinitionId(IWorkbenchActionDefinitionIds.FIND_NEXT);
public class EditorSearchActionsContributor extends MultiPageEditorActionBarContributor

            actionBars.setGlobalActionHandler(IWorkbenchActionDefinitionIds.FIND_NEXT, null);
import org.jkiss.dbeaver.model.DBUtils;
 *
                ContextSearchAction findNextAction = new ContextSearchAction(provider, ISearchContextProvider.SearchType.NEXT);
 * distributed under the License is distributed on an "AS IS" BASIS,
        actionBars.updateActionBars();

                findPrevAction.setActionDefinitionId(IWorkbenchActionDefinitionIds.FIND_PREVIOUS);
        } else {
/*
import org.jkiss.dbeaver.ui.ContextSearchAction;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
 * Unless required by applicable law or agreed to in writing, software
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
            actionBars.setGlobalActionHandler(IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE, null);
package org.jkiss.dbeaver.ui.editors;


    public void setActivePage(IEditorPart activeEditor) {
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others

}
        if (activeEditor == null) {

        super.contributeToMenu(menuManager);
        if (!(part instanceof MultiPageEditorPart)) {
import org.eclipse.ui.IActionBars;
        if (provider != null) {
import org.eclipse.ui.IEditorPart;
            return;
 *
            registerSearchActions(part);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        registerSearchActions(activeEditor);
        }

 * you may not use this file except in compliance with the License.

 * limitations under the License.
        super.setActiveEditor(part);
    @Override
    public void setActiveEditor(IEditorPart part)
/**
    @Override
    {
    public void contributeToMenu(IMenuManager menuManager)
 * You may obtain a copy of the License at
import org.eclipse.ui.part.MultiPageEditorPart;
                ContextSearchAction findAction = new ContextSearchAction(provider, ISearchContextProvider.SearchType.NONE);

                actionBars.setGlobalActionHandler(IWorkbenchActionDefinitionIds.FIND_PREVIOUS, findPrevAction);
        }
    }
