        if (settings == null) {
    @Override
        super(resultSetViewer, formatter.getTitle(), IAction.AS_RADIO_BUTTON);
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
    }
        getTransformSettings().setCustomTransformer(prefId);
        dataSource.getContainer().persistConfiguration();
    }
        }
    DBPPreferenceStore getActionPreferenceStore() {
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 */
    public void run() {

    private final DBDAttributeBinding attribute;
    @NotNull

        }
        this.attribute = attr;
            return;
 * DBeaver - Universal Database Manager
    private final String prefValue;

    }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

 * Copyright (C) 2010-2024 DBeaver Corp and others
/*

        preferenceStore.setValue(
 * Unless required by applicable law or agreed to in writing, software
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSource;
import org.eclipse.jface.action.IAction;
        DBPDataSource dataSource = getResultSetViewer().getDataContainer().getDataSource();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        String prefId = ModelPreferences.RESULT_SET_BINARY_PRESENTATION;
import org.jkiss.dbeaver.ModelPreferences;
public class BinaryFormatAction extends AbstractResultSetViewerAction {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
}
            prefId,
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public BinaryFormatAction(ResultSetViewer resultSetViewer, DBDBinaryFormatter formatter, DBDAttributeBinding attr) {
 *
import org.jkiss.dbeaver.model.virtual.DBVTransformSettings;
        getResultSetViewer().refreshData(null);
 *


            throw new IllegalStateException("Can't get/create transformer settings for '" + attribute.getFullyQualifiedName(DBPEvaluationContext.UI) + "'");
        this.prefValue = formatter.getTitle();
 * Licensed under the Apache License, Version 2.0 (the "License");
        return getResultSetViewer().getPreferenceStore();
        return getResultSetViewer().getPreferenceStore().getString(ModelPreferences.RESULT_SET_BINARY_PRESENTATION).equalsIgnoreCase(prefValue);
        final DBVTransformSettings settings = DBVUtils.getTransformSettings(attribute, true);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *
package org.jkiss.dbeaver.ui.controls.resultset.actions;
 * limitations under the License.
    DBVTransformSettings getTransformSettings() {
    public boolean isChecked() {
 * See the License for the specific language governing permissions and
            prefValue.toLowerCase());
        return settings;
 * you may not use this file except in compliance with the License.
        if (dataSource == null) {
        DBPPreferenceStore preferenceStore = getActionPreferenceStore();
    @Override
