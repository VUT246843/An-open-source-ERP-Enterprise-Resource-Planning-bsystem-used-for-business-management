        final DBPPreferenceStore prefs = DBWorkbench.getPlatform().getPreferenceStore();

 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
    public SQLEditorHandlerSyncConnectionAuto() {
import org.eclipse.core.commands.ExecutionEvent;
    }
import org.eclipse.core.commands.ExecutionException;
 *
            prefs.save();
import org.eclipse.ui.commands.IElementUpdater;

        return null;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Unless required by applicable law or agreed to in writing, software
    @Override
/*
import java.util.Map;
    public void updateElement(UIElement element, Map parameters) {

 * you may not use this file except in compliance with the License.
    }
import org.eclipse.core.commands.AbstractHandler;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            !prefs.getBoolean(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE));
import org.eclipse.ui.menus.UIElement;
public class SQLEditorHandlerSyncConnectionAuto extends AbstractHandler implements IElementUpdater {
            throw new ExecutionException("Error saving configuration", e);
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        prefs.setValue(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE,
import org.jkiss.dbeaver.runtime.DBWorkbench;
        element.setChecked(DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE));
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql.handlers;
    }
}
 * You may obtain a copy of the License at
        }

 *
 *
        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
        } catch (IOException e) {

 */
    public Object execute(ExecutionEvent event) throws ExecutionException {
import java.io.IOException;

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and

