import org.jkiss.dbeaver.ModelPreferences;
        super(resultSetViewer, ResultSetMessages.actions_name_structurize_complex_types, AS_CHECK_BOX);
    public boolean isChecked() {
        setToolTipText("Visualize complex types (arrays, structures, maps) in results grid as separate columns");
 *
 * DBeaver - Universal Database Manager
    }

        DBPDataSource dataSource = getResultSetViewer().getDataContainer().getDataSource();
    public void run() {
               dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DBPPreferenceStore preferenceStore = dataSource.getContainer().getPreferenceStore();

import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        preferenceStore.setValue(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES, !curValue);
            return;
package org.jkiss.dbeaver.ui.controls.resultset.actions;
        return dataSource != null &&
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
public class TransformComplexTypesToggleAction extends AbstractResultSetViewerAction {
        getResultSetViewer().refreshData(null);
 * Unless required by applicable law or agreed to in writing, software
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *

    @Override
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
        boolean curValue = preferenceStore.getBoolean(ModelPreferences.RESULT_TRANSFORM_COMPLEX_TYPES);
    public TransformComplexTypesToggleAction(ResultSetViewer resultSetViewer) {
 *
        dataSource.getContainer().persistConfiguration();
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPDataSource dataSource = getResultSetViewer().getDataContainer().getDataSource();
 */
        if (dataSource == null) {
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSource;
