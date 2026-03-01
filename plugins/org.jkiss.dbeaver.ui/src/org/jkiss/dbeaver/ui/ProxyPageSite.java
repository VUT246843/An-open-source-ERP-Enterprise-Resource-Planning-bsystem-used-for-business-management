
    }
    }
    }
    public <T> T getAdapter(Class<T> adapter)
            return null;
    {

    {
    {
import org.eclipse.ui.*;
/**
        this.partSite = partSite;
        if (partSite instanceof IEditorSite) {
        return partSite.hasService(api);
 */

public class ProxyPageSite implements IPageSite {
    public boolean hasService(Class api)
import org.eclipse.jface.viewers.ISelectionProvider;
 * limitations under the License.
    public void setSelectionProvider(ISelectionProvider provider)

    @Override

    public void registerContextMenu(String menuId, MenuManager menuManager, ISelectionProvider selectionProvider)
 *
 * See the License for the specific language governing permissions and
        }
    public IActionBars getActionBars()
import org.eclipse.swt.widgets.Shell;
            return ((IViewSite)partSite).getActionBars();
 * Licensed under the Apache License, Version 2.0 (the "License");

*/
        return partSite.getPage();
    }
    {
}

    public IWorkbenchPage getPage()
    @Override
            return ((IEditorSite)partSite).getActionBars();

 *
 *
import org.eclipse.ui.part.IPageSite;
    {
    {
    {
        return partSite.getWorkbenchWindow();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.action.MenuManager;

 * You may obtain a copy of the License at
    }
    private final IWorkbenchPartSite partSite;
    @Override
        return partSite.getAdapter(adapter);
        partSite.setSelectionProvider(provider);
    }
        partSite.registerContextMenu(menuId, menuManager, selectionProvider);
    }
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
* ProxyPageSite
    {
 * you may not use this file except in compliance with the License.
    }
        return partSite.getShell();
    @Override
    @Override
 * Unless required by applicable law or agreed to in writing, software

    {
    }
    @Override
package org.jkiss.dbeaver.ui;
    @Override
    public Shell getShell()
    {
        return partSite.getSelectionProvider();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public <T> T getService(Class<T> api)
        } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public IWorkbenchWindow getWorkbenchWindow()
    {

    public ISelectionProvider getSelectionProvider()
/*

        return partSite.getService(api);
    @Override
    }

    @Override
        } else if (partSite instanceof IViewSite) {
    public ProxyPageSite(IWorkbenchPartSite partSite)
