        }

    }
        }
    protected void clearPreferences(DBPPreferenceStore store)

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    @Override
 * PrefPageDashboards
    protected void savePreferences(DBPPreferenceStore store)
 * You may obtain a copy of the License at
 *
 * limitations under the License.
            store.contains(DashboardConstants.PREF_OPEN_SEPARATE_CONNECTION)
    @Override
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

            log.warn(e);
public class PrefPageDashboards extends TargetPrefPage
        ;
    }
        // General settings

    {

{
            );
        }
    protected String getPropertyPageID()
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.code.NotNull;

    protected void loadPreferences(DBPPreferenceStore store)
 *
    {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
    protected boolean supportsDataSourceSpecificOptions()
    }
 * Unless required by applicable law or agreed to in writing, software
    @Override
}    }
        {
/*
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
import org.jkiss.dbeaver.Log;
        return
            log.warn(e);
    @NotNull
        } catch (Exception e) {
    }
            store.setValue(DashboardConstants.PREF_OPEN_SEPARATE_CONNECTION, openSeparateConnectionCheck.getText());
                2,

import org.eclipse.swt.widgets.Button;
        super();
    {
    @Override
        store.setToDefault(DashboardConstants.PREF_OPEN_SEPARATE_CONNECTION);
 * you may not use this file except in compliance with the License.
            openSeparateConnectionCheck.setSelection(store.getBoolean(DashboardConstants.PREF_OPEN_SEPARATE_CONNECTION));
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    @Override
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
    private static final Log log = Log.getLog(PrefPageDashboards.class);
    }
        Composite composite = UIUtils.createPlaceholder(parent, 2, 5);
            }
            Composite commonGroup = UIUtils.createTitledComposite(
                UIDashboardMessages.pref_page_dashboards_group_common,
    {
/**
import org.jkiss.dbeaver.ui.UIUtils;
 */
    public PrefPageDashboards()
        return PAGE_ID;
    protected Control createPreferenceContent(@NotNull Composite parent) {
        return composite;

    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
                composite,
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
        try {
        } catch (Exception e) {
        PrefUtils.savePreferenceStore(store);
    }
            {
 *
    {

    {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
                openSeparateConnectionCheck = UIUtils.createCheckbox(commonGroup, UIDashboardMessages.pref_page_dashboards_open_separate_connection_label, null, false, 2);
    {

    @Override
package org.jkiss.dbeaver.ui.dashboard.preferences;

                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
 * DBeaver - Universal Database Manager

    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.dashboards"; //$NON-NLS-1$
 * Copyright (C) 2010-2026 DBeaver Corp and others
        try {
        return true;
    private Button openSeparateConnectionCheck;

