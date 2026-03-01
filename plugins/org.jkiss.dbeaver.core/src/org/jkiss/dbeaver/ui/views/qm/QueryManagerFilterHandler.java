
 * limitations under the License.
import org.eclipse.ui.handlers.HandlerUtil;
 *
 * See the License for the specific language governing permissions and
 */
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.ui.IWorkbenchWindow;
}    public void updateElement(UIElement element, Map parameters) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0

    public static final String ID = "org.jkiss.dbeaver.core.qm.filter";
    @Override
import org.eclipse.ui.commands.IElementUpdater;
 * Unless required by applicable law or agreed to in writing, software
        if (view != null) {

/*
import java.util.Map;
import org.eclipse.ui.menus.UIElement;
package org.jkiss.dbeaver.ui.views.qm;
    @Override

    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.core.commands.ExecutionException;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            view.setFilterPanelVisible(!view.isFilterPanelVisible());
        }
        IWorkbenchWindow window = element.getServiceLocator().getService(IWorkbenchWindow.class);
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        return null;

        QueryManagerView view = UIUtils.findView(HandlerUtil.getActiveWorkbenchWindow(event), QueryManagerView.class);
import org.eclipse.core.commands.AbstractHandler;
        element.setChecked(view != null && view.isFilterPanelVisible());
public class QueryManagerFilterHandler extends AbstractHandler implements IElementUpdater {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        QueryManagerView view = UIUtils.findView(window, QueryManagerView.class);
import org.jkiss.dbeaver.ui.UIUtils;
    }

