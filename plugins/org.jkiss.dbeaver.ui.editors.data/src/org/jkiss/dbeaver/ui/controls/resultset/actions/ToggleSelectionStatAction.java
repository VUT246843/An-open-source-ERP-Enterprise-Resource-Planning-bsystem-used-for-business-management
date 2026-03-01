 */
    public void run() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        super.run();

 *
        super(resultSetViewer, prefId, title);
 * limitations under the License.
import org.eclipse.jface.viewers.SelectionChangedEvent;
package org.jkiss.dbeaver.ui.controls.resultset.actions;
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    DBPPreferenceStore getActionPreferenceStore() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
            new SelectionChangedEvent(getResultSetViewer(), getResultSetViewer().getSelection()));
public class ToggleSelectionStatAction extends ToggleConnectionPreferenceAction {
    }
        getResultSetViewer().fireResultSetSelectionChange(
}
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
 * you may not use this file except in compliance with the License.
    public ToggleSelectionStatAction(ResultSetViewer resultSetViewer, String prefId, String title) {
        return DBWorkbench.getPlatform().getPreferenceStore();
/*
 * See the License for the specific language governing permissions and
