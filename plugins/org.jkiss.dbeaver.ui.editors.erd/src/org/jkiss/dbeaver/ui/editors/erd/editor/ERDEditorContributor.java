        activeEditorPart = (ERDEditorPart)targetEditor;
    public void setActiveEditor(IEditorPart targetEditor)
    }
    public void contributeToStatusLine(IStatusLineManager statusLineManager)
        super.setActiveEditor(targetEditor);
import org.eclipse.jface.action.IStatusLineManager;


import org.eclipse.jface.action.IMenuManager;
    }
 * You may obtain a copy of the License at
 */
    public void init(IActionBars bars)
    @Override


            //editMenu.add(executeScriptAction);
}
    }
import org.eclipse.ui.IWorkbenchActionConstants;
import org.jkiss.dbeaver.ui.editors.EditorSearchActionsContributor;
    @Override
        if (activeEditorPart != null) {
    public void contributeToCoolBar(ICoolBarManager manager)
    }
    {


public class ERDEditorContributor extends EditorActionBarContributor
    {
    public ERDEditorContributor()
        if (editMenu != null) {
        super.init(bars);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            //editMenu.add(new Separator());
    {
        }

    {
        super.contributeToCoolBar(manager);
        if (activeEditorPart == targetEditor) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.contributeToStatusLine(statusLineManager);
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
import org.eclipse.ui.IActionBars;
    private void createActions()


    private ERDEditorPart activeEditorPart;
        setActiveEditor(null);
 * limitations under the License.
 * SQL Editor contributor
        EditorSearchActionsContributor.registerSearchActions(activeEditorPart);
            return;
/*
    }
    @Override
import org.eclipse.ui.part.EditorActionBarContributor;
package org.jkiss.dbeaver.ui.editors.erd.editor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            //editMenu.add(executeStatementAction);
/**

            // Update editor actions
            //editMenu.add(new Separator());
    @Override
 * Unless required by applicable law or agreed to in writing, software

 *
import org.eclipse.ui.IEditorPart;

        super();
{
 *
 *
        super.dispose();

    {
import org.eclipse.jface.action.ICoolBarManager;
    @Override
        IMenuManager editMenu = manager.findMenuUsingPath(IWorkbenchActionConstants.M_EDIT);
 * you may not use this file except in compliance with the License.


 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    }
        createActions();
    public void contributeToMenu(IMenuManager manager)
 */
    {

    @Override

        super.contributeToMenu(manager);
        }
    }
 * See the License for the specific language governing permissions and
    {
    public void dispose()
 * DBeaver - Universal Database Manager

