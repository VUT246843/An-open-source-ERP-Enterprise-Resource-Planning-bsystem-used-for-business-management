    @Override
public class SQLEditorHandlerToggleExtraPanels extends AbstractHandler implements IElementUpdater {
    }

        }

 * limitations under the License.
import org.eclipse.core.commands.ExecutionException;
            editor.toggleExtraPanelsLayout();
package org.jkiss.dbeaver.ui.editors.sql.handlers;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
import org.eclipse.ui.IEditorPart;
        IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.AbstractHandler;

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.menus.UIElement;
    @Override
 * DBeaver - Universal Database Manager
}    public void updateElement(UIElement element, Map parameters) {
            element.setChecked(SQLPreferenceConstants.LOCATION_RESULTS.equals(((SQLEditor) activeEditor).getExtraPanelsLocation()));
        return null;
import java.util.Map;
/*
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IWorkbenchWindow;
        IWorkbenchWindow workbenchWindow = element.getServiceLocator().getService(IWorkbenchWindow.class);
 * You may obtain a copy of the License at
 */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (activeEditor instanceof SQLEditor) {

 *
import org.eclipse.ui.commands.IElementUpdater;
 * you may not use this file except in compliance with the License.
        }
 *

import org.jkiss.dbeaver.utils.RuntimeUtils;
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (editor != null) {
import org.eclipse.ui.handlers.HandlerUtil;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
