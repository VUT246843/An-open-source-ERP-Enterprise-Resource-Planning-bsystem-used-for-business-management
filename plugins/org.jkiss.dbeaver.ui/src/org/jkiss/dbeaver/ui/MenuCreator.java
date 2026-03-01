    @Override
        }
    }
 * You may obtain a copy of the License at

 *
 * limitations under the License.
        menuManager = creator.createObject(parent);
import org.eclipse.jface.action.MenuManager;
public class MenuCreator implements IMenuCreator {
            dropDownMenu.dispose();
    public void dispose() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return menuManager.createContextMenu(parent);

    public Menu getMenu(Control parent) {
            menuManager.dispose();
            menuManager.dispose();
    }
        }
        if (menuManager != null) {
        if (menuManager != null) {
        if (dropDownMenu != null) {
    private Menu dropDownMenu;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    @Override
    }
    private DBRCreator<MenuManager, Widget> creator;
            menuManager.dispose();
package org.jkiss.dbeaver.ui;
 *
        }


    public MenuCreator(DBRCreator<MenuManager, Widget> creator) {
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

        if (dropDownMenu != null) {
/*
            dropDownMenu.dispose();
        menuManager.fill(dropDownMenu, 0);
        if (menuManager != null) {
import org.eclipse.swt.widgets.Control;

}
 * DBeaver - Universal Database Manager
    private MenuManager menuManager;
    public Menu getMenu(Menu parent) {
        dropDownMenu = null;
        return menuManager.getMenu();
import org.jkiss.dbeaver.model.runtime.DBRCreator;

    @Override
 */
        menuManager = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Widget;
import org.eclipse.jface.action.IMenuCreator;

 * you may not use this file except in compliance with the License.
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        }
import org.eclipse.swt.widgets.Menu;
        menuManager = creator.createObject(parent);
        this.creator = creator;
        dropDownMenu = new Menu(parent);
        }
