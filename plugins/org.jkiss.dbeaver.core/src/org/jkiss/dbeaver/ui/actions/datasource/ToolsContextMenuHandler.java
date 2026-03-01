
        if (location != null) {
        if (part instanceof IEditorPart) {
        contextMenu.setVisible(true);
 *
                menuManager.add(txnMenu);
        final IWorkbenchPart part = HandlerUtil.getActivePartChecked(event);
                }
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.action.MenuManager;
        if (part instanceof IEditorPart) {
        Point location = ActionUtils.getLocationFromControl(activeShell, focusControl);
            menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), ConnectionCommands.CMD_COMMIT));
            menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), SQLEditorCommands.CMD_SQL_EDITOR_OPEN));
                final MenuManager txnMenu = new MenuManager(
 * You may obtain a copy of the License at
        if (menuManager != null) {
        final Shell activeShell = HandlerUtil.getActiveShell(event);
        if (focusControl == null) {
        menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), ConnectionCommands.CMD_INVALIDATE));
import org.jkiss.utils.CommonUtils;
        }
 * limitations under the License.
package org.jkiss.dbeaver.ui.actions.datasource;
            contextMenu.setLocation(location);
        if (ActionUtils.isCommandEnabled(SQLEditorCommands.CMD_SQL_EDITOR_OPEN, part.getSite())) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        final Control focusControl = activeShell.getDisplay().getFocusControl();
            return null;
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
            final MenuManager toolsMenu = new MenuManager(
        if (part == null || activeShell == null) {
    {
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
import org.eclipse.swt.graphics.Point;
 *
        }
import org.eclipse.swt.events.MenuAdapter;
 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
            return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
            menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), CoreCommands.CMD_LINK_EDITOR, CoreMessages.action_menu_tools_find_in_navigator, null));

        return null;
import org.eclipse.swt.widgets.Menu;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorCommands;
        menuManager = new MenuManager();
import org.eclipse.swt.widgets.Shell;
                int keyIndex = 0;
        menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), ConnectionCommands.CMD_READONLY));
    private MenuManager menuManager = new MenuManager();
            @Override
/*
import org.eclipse.swt.widgets.MenuItem;

import org.jkiss.dbeaver.core.CoreCommands;
            }
                for (MenuItem item : contextMenu.getItems()) {
        }
import org.eclipse.ui.IWorkbenchPart;
/*

    }
 */
import org.eclipse.ui.handlers.HandlerUtil;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.commands.ExecutionEvent;
            menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), ConnectionCommands.CMD_ROLLBACK));
 *
        menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), ConnectionCommands.CMD_CONNECT));
            menuManager.dispose();
public class ToolsContextMenuHandler extends AbstractDataSourceHandler
import org.eclipse.ui.IEditorPart;
        final Menu contextMenu = menuManager.createContextMenu(focusControl);
            public void menuShown(MenuEvent e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        item.setText(ActionUtils.getLabelWithIndexMnemonic(item.getText(), keyIndex));

                    DBeaverActivator.getPluginResourceBundle().getString("command.org.jkiss.dbeaver.core.transaction_mode.name"));
 * See the License for the specific language governing permissions and
    public Object execute(ExecutionEvent event) throws ExecutionException

        
import org.eclipse.swt.events.MenuEvent;
            {
import org.jkiss.dbeaver.core.DBeaverActivator;
}                DBeaverActivator.getPluginResourceBundle().getString("menu.database.tools"));
import org.jkiss.dbeaver.core.CoreMessages;
        }
        menuManager.add(ActionUtils.makeCommandContribution(part.getSite(), ConnectionCommands.CMD_DISCONNECT));
import org.jkiss.dbeaver.ui.ActionUtils;
        }
                        keyIndex++;
*/
                txnMenu.add(new DataSourceTransactionModeContributor());
                    if (/*item.getMenu() == null && */!CommonUtils.isEmpty(item.getText())) {
import org.eclipse.swt.widgets.Control;
        contextMenu.addMenuListener(new MenuAdapter() {
            }
            menuManager.add(new Separator());
            toolsMenu.add(new DataSourceToolsContributor());
    @Override
import org.eclipse.core.commands.ExecutionException;
 *     http://www.apache.org/licenses/LICENSE-2.0
{
            menuManager.add(toolsMenu);
        });
        menuManager.add(new Separator());
        }
import org.eclipse.jface.action.Separator;
        
                    }
