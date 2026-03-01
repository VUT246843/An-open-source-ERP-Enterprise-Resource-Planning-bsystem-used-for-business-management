 * Unless required by applicable law or agreed to in writing, software
        super.saveSettings(preferenceStore);
 * you may not use this file except in compliance with the License.


        return parent;
package org.jkiss.dbeaver.ui.editors.sql.format.sqlworkbenchj;

import org.jkiss.dbeaver.ui.UIUtils;
            GridData.FILL_HORIZONTAL
        Composite settings = UIUtils.createTitledComposite(

        pathEdit = new TextWithOpenFolder(settings, label);
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.loadSettings(preferenceStore, useDefaults);
            useDefaults


        UIUtils.createControlLabel(settings, label);
    @Override
 *
 * limitations under the License.

public class SQLWorkbenchJFormatterSettingsPage extends BaseFormatterConfigurationPage {

 *     http://www.apache.org/licenses/LICENSE-2.0
                ? preferenceStore.getDefaultString(SQLWorkbenchJConstants.PROP_WORKBENCH_PATH)
 * External SQL formatter
 */
 */
import org.jkiss.code.NotNull;
 *
    public void loadSettings(@NotNull DBPPreferenceStore preferenceStore, boolean useDefaults) {
            SQLEditorMessages.pref_page_sql_format_label_settings,
            parent,
 * Copyright (C) 2010-2026 DBeaver Corp and others
        );
    }
    private TextWithOpenFolder pathEdit;
 * DBeaver - Universal Database Manager
/**
import org.jkiss.dbeaver.ui.editors.sql.preferences.format.BaseFormatterConfigurationPage;
    }
        pathEdit.setText(CommonUtils.toString(
 * See the License for the specific language governing permissions and
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            2,
/*
                : preferenceStore.getString(SQLWorkbenchJConstants.PROP_WORKBENCH_PATH)
import org.jkiss.dbeaver.ui.controls.TextWithOpenFolder;
        );
        // Save formatter settings

 * You may obtain a copy of the License at
import org.jkiss.utils.CommonUtils;

    public void saveSettings(@NotNull DBPPreferenceStore preferenceStore) {
import org.eclipse.swt.layout.GridData;
 *
            )
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;

    }
        preferenceStore.setValue(SQLWorkbenchJConstants.PROP_WORKBENCH_PATH, pathEdit.getText());
    protected Composite createFormatSettings(Composite parent) {
    public static final String label = "SQL Workbench/J path";
}
        pathEdit.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    @Override
import org.eclipse.swt.widgets.Composite;
