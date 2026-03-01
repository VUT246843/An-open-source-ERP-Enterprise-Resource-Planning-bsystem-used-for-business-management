        }
 *
/*
import org.jkiss.dbeaver.model.DBPDataSource;
 * DBeaver - Universal Database Manager
    }

               dataSource.getContainer().getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES);
}

    public ColorizeDataTypesToggleAction(ResultSetViewer resultSetViewer) {
 * limitations under the License.
    @Override
        getResultSetViewer().refreshData(null);
        dataSource.getContainer().persistConfiguration();
 * See the License for the specific language governing permissions and
public class ColorizeDataTypesToggleAction extends AbstractResultSetViewerAction {
 */
    public void run() {
        dsStore.setValue(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES, !curValue);
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;

 *
        super(resultSetViewer, DataEditorsMessages.pref_page_database_resultsets_label_colorize_data_types, AS_CHECK_BOX);
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPPreferenceStore dsStore = dataSource.getContainer().getPreferenceStore();
    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        boolean curValue = dsStore.getBoolean(ResultSetPreferences.RESULT_SET_COLORIZE_DATA_TYPES);
package org.jkiss.dbeaver.ui.controls.resultset.actions;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isChecked() {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            return;
        DBPDataSource dataSource = getResultSetViewer().getDataContainer().getDataSource();
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at

 * Unless required by applicable law or agreed to in writing, software
    @Override
        // Set local setting to default
        setToolTipText("Set different foreground color for data types");
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
        return dataSource != null &&
        DBPDataSource dataSource = getResultSetViewer().getDataContainer().getDataSource();
        if (dataSource == null) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
