                } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
        final IViewPart view = UIUtils.findView(workbenchWindow, viewId);
 * you may not use this file except in compliance with the License.

                view = viewReference.getView(false);

import org.eclipse.ui.commands.IElementUpdater;
            }
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        }



} * DBeaver - Universal Database Manager
 */
import org.eclipse.core.commands.AbstractHandler;
    }
 * You may obtain a copy of the License at

                DBWorkbench.getPlatformUI().showError("Toggle view", "Cannot open view " + viewId, e);
            IViewPart view = null;

public class NavigatorHandlerToggleView extends AbstractHandler implements IElementUpdater {
                    workbenchWindow.getActivePage().bringToTop(view);
            IViewReference viewReference = UIUtils.getActiveWorkbenchWindow().getActivePage().findViewReference(viewId);
import org.eclipse.ui.menus.UIElement;
 *
            }
 *
            for (IViewDescriptor view : PlatformUI.getWorkbench().getViewRegistry().getViews()) {
        if (view != null && workbenchWindow.getActivePage().isPartVisible(view)) {
import org.eclipse.ui.*;
    public void updateElement(UIElement element, Map parameters) {
import org.jkiss.utils.CommonUtils;
    public Object execute(ExecutionEvent event) throws ExecutionException {
            element.setIcon(viewDescriptor.getImageDescriptor());
            if (viewReference != null) {
 *
        }
    @Override
                element.setTooltip(viewDescriptor.getDescription());
import org.jkiss.dbeaver.ui.UIUtils;

import org.eclipse.core.commands.IParameterValues;
            } catch (PartInitException e) {
        return null;
    }
package org.jkiss.dbeaver.ui.navigator.actions;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        ActionUtils.fireCommandRefresh("org.jkiss.dbeaver.core.view.toggle");
            return values;
 * See the License for the specific language governing permissions and
    public static class ViewValues implements IParameterValues {
    }
import org.eclipse.core.commands.ExecutionEvent;
            element.setText(viewDescriptor.getLabel());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        public Map<String, String> getParameterValues() {

import org.eclipse.ui.handlers.HandlerUtil;

            }
            final Map<String, String> values = new HashMap<>();
        if (viewDescriptor != null) {
        }
        } else {
            workbenchWindow.getActivePage().hideView(view);
        final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        final String viewId = event.getParameter("viewId");
        @Override
                }
        IViewDescriptor viewDescriptor = PlatformUI.getWorkbench().getViewRegistry().find(viewId);
        final String viewId = (String) parameters.get("viewId");
            element.setChecked(view != null);
            if (!CommonUtils.isEmpty(viewDescriptor.getDescription())) {
import org.eclipse.ui.views.IViewDescriptor;


/*
import org.jkiss.dbeaver.ui.ActionUtils;
            }

                values.put(view.getLabel(), view.getId());
                    workbenchWindow.getActivePage().showView(viewId);
                if (view != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.eclipse.core.commands.ExecutionException;
            try {
import java.util.HashMap;
import java.util.Map;
