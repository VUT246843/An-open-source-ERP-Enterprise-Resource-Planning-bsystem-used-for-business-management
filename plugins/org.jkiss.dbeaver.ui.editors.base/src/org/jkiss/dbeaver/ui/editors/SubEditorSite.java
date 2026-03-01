    {
        {

        @Override
        public void clearGlobalActionHandlers()
    public Shell getShell()
        public void init(IActionBars bars, IWorkbenchPage page)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

    }
        }
    public IWorkbenchPartSite getParentSite() {
        return keyBindingService;
    {
        {
    }

        }
    public String getPluginId()
        }
        @Override
        {
        public void unregisterAction(IAction action)
public class SubEditorSite implements IEditorSite {
    }
    @Override
        if (parentSite instanceof IEditorSite) {
        @Override
        public void setGlobalActionHandler(String actionId, IAction handler)
    @Override
        @Override
    public void registerContextMenu(MenuManager menuManager, ISelectionProvider selectionProvider)

        } else if (parentSite instanceof IViewSite) {
        }
    }
        }
        {
    {
        @Override
    {
        public void updateActionBars()
        } else {

    public <T> T getAdapter(Class<T> adapter)

    public SubEditorSite(IWorkbenchPartSite parentSite)
 * you may not use this file except in compliance with the License.
        public void addSelectionChangedListener(ISelectionChangedListener listener)
        }
        @Override



    }
        return parentSite.getWorkbenchWindow();
 * You may obtain a copy of the License at
    {
    @Override
            this.actionBars = new SubActionBars(((IViewSite)parentSite).getActionBars());
        }
            return null;
import org.eclipse.jface.viewers.ISelectionChangedListener;
    }

import org.eclipse.swt.widgets.Shell;
        public IToolBarManager getToolBarManager()
    {
    @Override
            return new StructuredSelection();
        @Override
        }
        }
        return parentSite.getId() + ".sub";
    @Override
 * See the License for the specific language governing permissions and
            return null;
        {
    }
        @Override
    private static class FakeEditorActionBarContributor implements IEditorActionBarContributor {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        @Override
        return parentSite.getPluginId();

        public IAction getGlobalActionHandler(String actionId)
        }
    public ISelectionProvider getSelectionProvider()

    private final ISelectionProvider selectionProvider;
    @Override
    {
    }
        registerContextMenu(getId(), menuManager, selectionProvider);
    {
    {
        {
    {
    @Deprecated
            return null;
 *

        }
        }
    {
    @Override
        public IStatusLineManager getStatusLineManager()
    public IActionBars getActionBars()
    }
 */
 * limitations under the License.
/**
    @Override
    @Override
package org.jkiss.dbeaver.ui.editors;
	private static class FakeKeyBindingService implements IKeyBindingService {
        public String[] getScopes()

    public IKeyBindingService getKeyBindingService()
    @SuppressWarnings("deprecation")
        {


        public IMenuManager getMenuManager()
    }

        this.keyBindingService = new FakeKeyBindingService();
        @Override
    @SuppressWarnings("deprecation")
    @Override
        }
        {
        public void removeSelectionChangedListener(ISelectionChangedListener listener)
        }
    }
        @Override

    public boolean hasService(Class<?> api)
        }
        this.parentSite = parentSite;
    @Override
        }
        return actionBars;


        return parentSite;
        {

        @Override
    private static class FakeSelectionProvider implements ISelectionProvider {
        public IServiceLocator getServiceLocator()
	private final IKeyBindingService keyBindingService;
 *     http://www.apache.org/licenses/LICENSE-2.0
*/

        }
 *
        return parentSite.getPart();
* Sub editor site
    public String getRegisteredName()
        return parentSite.getAdapter(adapter);
    @Override
    {
    private final IActionBars actionBars;
        }
        {

    }
    }


    {
        return parentSite.getService(api);
        public void registerAction(IAction action)
    {
    @Override
 *
        public void dispose()
    public void registerContextMenu(String menuId, MenuManager menuManager, ISelectionProvider selectionProvider)
 * Licensed under the Apache License, Version 2.0 (the "License");
        {

        {

    }
    }
import org.eclipse.jface.viewers.ISelectionProvider;
    public void registerContextMenu(MenuManager menuManager, ISelectionProvider selectionProvider, boolean includeEditorInput)
    }
        return parentSite.hasService(api);
        {
        this.selectionProvider = selectionProvider;
        {

        if (parentSite instanceof IEditorSite) {

    {
    @Override
import org.eclipse.ui.*;
        @Override
        {
    private static class FakeActionBars implements IActionBars {
    {
            this.actionBars = new SubActionBars(((IEditorSite)parentSite).getActionBars());
 * Unless required by applicable law or agreed to in writing, software
        public void setActiveEditor(IEditorPart targetEditor)

 * DBeaver - Universal Database Manager
import org.eclipse.ui.services.IServiceLocator;
    public IWorkbenchPart getPart()
        public ISelection getSelection()
            return null;

    public <T> T getService(Class<T> api)
    {
        {

import org.eclipse.jface.action.*;
        {
    {
        @Override
            this.actionBars = new FakeActionBars();
        return parentSite.getPage();
    @Override
        return parentSite.getShell();
    }
        this(parentSite, new FakeSelectionProvider());
        public void setScopes(String[] scopes)
    public SubEditorSite(IWorkbenchPartSite parentSite, ISelectionProvider selectionProvider)
        @Override
        } else {
        {
        return selectionProvider;
import org.eclipse.jface.viewers.ISelection;

    public IWorkbenchPage getPage()

    @Override
            return null;
        }

    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    }
        @Override
    }
    {
    public IWorkbenchWindow getWorkbenchWindow()
    @Override
    private final IWorkbenchPartSite parentSite;
        @Override

        return parentSite.getRegisteredName();
    public String getId()
    }
    {
/*
    @Override
    }
    }
}
    }

    public void registerContextMenu(String menuId, MenuManager menuManager, ISelectionProvider selectionProvider, boolean includeEditorInput)
    public IEditorActionBarContributor getActionBarContributor()
    public void setSelectionProvider(ISelectionProvider provider)
            return new FakeEditorActionBarContributor();
    }

        public void setSelection(ISelection selection)
import org.eclipse.jface.viewers.StructuredSelection;
        {
            return ((IEditorSite)parentSite).getActionBarContributor();
        }
        @Override
        @Override
        }
            return new String[0];
