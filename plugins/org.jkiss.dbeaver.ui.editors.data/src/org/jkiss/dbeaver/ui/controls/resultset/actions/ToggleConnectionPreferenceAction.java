import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        this.prefId = prefId;
    }

package org.jkiss.dbeaver.ui.controls.resultset.actions;
        return getResultSetViewer().getPreferenceStore();
 * DBeaver - Universal Database Manager
    @Override
        super(resultSetViewer, title);

 *
    }
    public void run() {
        preferenceStore.setValue(
 *
}
    DBPPreferenceStore getActionPreferenceStore() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return getActionPreferenceStore().getBoolean(prefId);

 * Licensed under the Apache License, Version 2.0 (the "License");
    ToggleConnectionPreferenceAction(ResultSetViewer resultSetViewer, String prefId, String title) {
    public boolean isChecked() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
public abstract class ToggleConnectionPreferenceAction extends AbstractResultSetViewerAction {
        return AS_CHECK_BOX;

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            prefId,
    @Override
 * limitations under the License.
/*

        DBPPreferenceStore preferenceStore = getActionPreferenceStore();

 *
            !preferenceStore.getBoolean(prefId));
    }
    public int getStyle() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * You may obtain a copy of the License at
    private final String prefId;
    }

 * See the License for the specific language governing permissions and
 */
 * Unless required by applicable law or agreed to in writing, software
