
        if (editor instanceof SQLEditor) {
 * limitations under the License.
 * you may not use this file except in compliance with the License.
        }
        }
/*
        if (editor instanceof SQLEditor) {
            DBPPreferenceStore preferenceStore  = ((SQLEditor) editor).getActivePreferenceStore();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        return null;
        IEditorPart editor = element.getServiceLocator().getService(IWorkbenchWindow.class).getActivePage().getActiveEditor();
            PrefUtils.savePreferenceStore(preferenceStore);
    public void updateElement(UIElement element, Map parameters) {
 * Unless required by applicable law or agreed to in writing, software
    @Override
 */
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
 *
        IEditorPart editor = HandlerUtil.getActiveEditor(event);
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
public class SQLEditorHandlerEnableDisableFolding extends AbstractHandler implements IElementUpdater {
    }
 * You may obtain a copy of the License at
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.utils.PrefUtils;
            preferenceStore.setValue(SQLPreferenceConstants.FOLDING_ENABLED, !previousValue);
}
import org.eclipse.ui.commands.IElementUpdater;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.handlers.HandlerUtil;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
 *
import org.eclipse.ui.IEditorPart;
import org.eclipse.core.commands.ExecutionEvent;
            element.setChecked(((SQLEditor) editor).getActivePreferenceStore().getBoolean(SQLPreferenceConstants.FOLDING_ENABLED));    
import org.eclipse.core.commands.AbstractHandler;
            boolean previousValue = preferenceStore.getBoolean(SQLPreferenceConstants.FOLDING_ENABLED);

import java.util.Map;
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.menus.UIElement;
import org.eclipse.ui.IWorkbenchWindow;
 *
