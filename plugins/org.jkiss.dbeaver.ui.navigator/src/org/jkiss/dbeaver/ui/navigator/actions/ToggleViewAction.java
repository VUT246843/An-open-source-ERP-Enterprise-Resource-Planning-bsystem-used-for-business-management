        return super.getToolTipText();
import org.eclipse.ui.views.IViewDescriptor;
        } catch (PartInitException ex) {
        try {
    {
            if (view == null) {
    @Override
                if (!activePage.isPartVisible(view)) {
    }

{



    @Override
                    activePage.hideView(view);
        }
                } else {
    {
    @Override
    private IViewDescriptor viewDescriptor;
    }
        }

    }
    @Override
 */
 *
    }
 *
        }

import org.jkiss.dbeaver.runtime.DBWorkbench;
        }

    public void partOpened(IWorkbenchPart part)
    {
    private static IWorkbenchPage getActivePage()
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
        return super.getImageDescriptor();
            IViewPart view = activePage.findView(viewId);
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.resource.ImageDescriptor;


        if (viewDescriptor != null) {
        if (part.getSite().getId().equals(viewId)) {
    @Override
    {
    @Override
    {

        if (activePage == null) {
    {
            }
                activePage.showView(viewId);


            return viewDescriptor.getDescription();
    }
    @Override
    }
    {
 * You may obtain a copy of the License at
        }
            IWorkbenchPage activePage = getActivePage();
package org.jkiss.dbeaver.ui.navigator.actions;

    {
        return super.getText();
        if (part.getSite().getId().equals(viewId)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    public String getText()
    {
            }
 * DBeaver - Universal Database Manager
        if (!listenerRegistered) {
    private boolean listenerRegistered = false;
 * you may not use this file except in compliance with the License.
        // Check state is updated via listener, we don't want our state to be modified from outside (e.g. via event).
    public void partActivated(IWorkbenchPart part)
        }
            IViewReference viewReference = activePage.findViewReference(viewId);
            return;

            } else {
    @Override
    }
            DBWorkbench.getPlatformUI().showError(viewId, "Can't open view " + viewId, ex);
    }
    public String getToolTipText()
 * Unless required by applicable law or agreed to in writing, software
                }
        viewDescriptor = PlatformUI.getWorkbench().getViewRegistry().find(viewId);
    {
    @Override

                    activePage.bringToTop(view);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            activePage.addPartListener(this);
        return super.isChecked();
        if (viewDescriptor != null) {

    }
}    public boolean isChecked()
    public void partDeactivated(IWorkbenchPart part)

    }
    public void setChecked(boolean checked) {
    public ImageDescriptor getImageDescriptor()
    public void partBroughtToTop(IWorkbenchPart part)
        }
    {
            listenerRegistered = true;
            super.setChecked(false);

        if (viewDescriptor != null) {
    @Override
        IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    public ToggleViewAction(String viewId)
    public int getStyle()
            super.setChecked(true);
    {
        IWorkbenchPage activePage = getActivePage();
            if (activePage == null) {
    public void partClosed(IWorkbenchPart part)
            super.setChecked(viewReference != null);
                return false;
    public void run()

    private String viewId;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.eclipse.ui.*;
/*
    @Override
import org.eclipse.jface.action.Action;
            return viewDescriptor.getLabel();
    }
    @Override
 * See the License for the specific language governing permissions and
        this.viewId = viewId;
public class ToggleViewAction extends Action implements IPartListener
            return viewDescriptor.getImageDescriptor();
 * limitations under the License.
        return workbenchWindow.getActivePage();
        return AS_CHECK_BOX;
