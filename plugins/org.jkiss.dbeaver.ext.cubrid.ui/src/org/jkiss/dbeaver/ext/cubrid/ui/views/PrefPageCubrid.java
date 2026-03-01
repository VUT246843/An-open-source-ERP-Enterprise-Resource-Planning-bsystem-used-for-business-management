
            });
 * Unless required by applicable law or agreed to in writing, software
    private Button oid;


 * limitations under the License.
    }
        trace.setSelection(store.getBoolean(CubridConstants.STATISTIC_TRACE));
 *
                }
    }
        store.setValue(CubridConstants.STATISTIC, "");
            CubridMessages.pref_page_cubrid_oid_title,
    }

import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;


    @Override
                @Override
        {
    @NotNull
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    protected boolean supportsDataSourceSpecificOptions() {
        store.setToDefault(CubridConstants.PREF_DBMS_OUTPUT_BUFFER_SIZE);
 * You may obtain a copy of the License at
    }

    public PrefPageCubrid() {
    protected String getPropertyPageID() {
        dbmsOutputBufferSize.setText(String.valueOf(store.getInt(CubridConstants.PREF_DBMS_OUTPUT_BUFFER_SIZE)));

                public void widgetSelected(final SelectionEvent e) {

 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
                    if (e.widget.getData().equals(preferenceStore.getString(CubridConstants.STATISTIC))) {
            enableDbmsOutputCheck = UIUtils.createCheckbox(miscGroup, CubridMessages.pref_page_cubrid_checkbox_enable_dbms_output, "", true, 2);
                preferenceStore.setValue(CubridConstants.OID_NAVIGATOR, ((Button) e.widget).getSelection());
import org.eclipse.swt.widgets.Composite;
    private Button allInfo;


        allInfo.setSelection(false);
 * distributed under the License is distributed on an "AS IS" BASIS,
                || store.contains(CubridConstants.PREF_DBMS_OUTPUT_BUFFER_SIZE));
        return (store.contains(CubridConstants.PREF_DBMS_OUTPUT)
            @Override
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
                    preferenceStore.setValue(CubridConstants.STATISTIC_TRACE, ((Button) e.widget).getSelection());
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
        info.setSelection(false);
    }
        return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dsContainer) {
                        preferenceStore.setValue(CubridConstants.STATISTIC, e.widget.getData().toString());
        DBPPreferenceStore store = dsContainer.getPreferenceStore();

    @Override
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();

        Composite oidNavigator = UIUtils.createTitledComposite(

import org.jkiss.dbeaver.utils.PrefUtils;
    private Button info;
            allInfo = UIUtils.createRadioButton(planGroup, CubridMessages.statistic_all_info,
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override
                public void widgetSelected(SelectionEvent e) {
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
    }

        info.setSelection(store.getString(CubridConstants.STATISTIC).equals(CubridConstants.STATISTIC_INFO));
        store.setValue(CubridConstants.STATISTIC_TRACE, false);
        });
    }
 * DBeaver - Universal Database Manager
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.code.NotNull;
                        ((Button) e.widget).setSelection(false);
    @Override
import org.eclipse.swt.widgets.Button;

    protected void clearPreferences(DBPPreferenceStore store) {
            trace.addSelectionListener(new SelectionAdapter()
    protected void performDefaults() {
        trace.setSelection(false);
import java.util.Locale;
package org.jkiss.dbeaver.ext.cubrid.ui.views;
public class PrefPageCubrid extends TargetPrefPage {

        allInfo.setSelection(store.getString(CubridConstants.STATISTIC).equals(CubridConstants.STATISTIC_ALL_INFO));
        oid.addSelectionListener(new SelectionAdapter()
import org.eclipse.swt.events.SelectionListener;
    @NotNull

            {
    protected Control createPreferenceContent(@NotNull Composite parent) {
    @Override
        enableDbmsOutputCheck.setSelection(store.getBoolean(CubridConstants.PREF_DBMS_OUTPUT));
            public void widgetSelected(SelectionEvent e) {
            {
            composite,
            Composite miscGroup = UIUtils.createTitledComposite(composite, CubridMessages.pref_page_cubrid_group_dbms_output, 2, GridData.FILL_HORIZONTAL);
        this.clearPreferences(getTargetPreferenceStore());

            };
        store.setValue(CubridConstants.PREF_DBMS_OUTPUT, enableDbmsOutputCheck.getSelection());

                        preferenceStore.setValue(CubridConstants.STATISTIC, "");
            }
    @Override
            GridData.FILL_HORIZONTAL
            trace = UIUtils.createCheckbox(planGroup, CubridMessages.statistic_trace_info, false);
import org.jkiss.dbeaver.ext.cubrid.ui.internal.CubridMessages;
        super.performDefaults();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        store.setValue(CubridConstants.PREF_DBMS_OUTPUT_BUFFER_SIZE, dbmsOutputBufferSize.getText());
        );
import org.eclipse.swt.widgets.Text;


            info = UIUtils.createRadioButton(planGroup, CubridMessages.statistic_info, CubridConstants.STATISTIC_INFO, radioListener);
 * See the License for the specific language governing permissions and

    }
        }
    @Override
        oid.setSelection(store.getBoolean(CubridConstants.OID_NAVIGATOR));

                CubridConstants.STATISTIC_ALL_INFO, radioListener);
        }
    private Button trace;
            1,
        return PAGE_ID;
        {
 */
                }
    private Button enableDbmsOutputCheck;
        Composite composite = UIUtils.createComposite(parent, 1);
            SelectionListener radioListener = new SelectionAdapter()
                    }
        PrefUtils.savePreferenceStore(store);
    protected void loadPreferences(DBPPreferenceStore store) {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.cubrid.general"; //$NON-NLS-1$
        store.setToDefault(CubridConstants.PREF_DBMS_OUTPUT);
/*
import org.jkiss.dbeaver.ui.UIUtils;
    private Text dbmsOutputBufferSize;
import org.eclipse.swt.layout.GridData;
            Composite planGroup = UIUtils.createTitledComposite(composite, CubridMessages.statistic_group_editor_title, 1, GridData.FILL_HORIZONTAL);
            dbmsOutputBufferSize = UIUtils.createLabelText(miscGroup, CubridMessages.pref_page_cubrid_label_buffer_size, "");
 *
                @Override
    protected void savePreferences(DBPPreferenceStore store) {
import org.eclipse.swt.widgets.Control;
}
        oid = UIUtils.createCheckbox(oidNavigator, CubridMessages.pref_page_cubrid_oid_checkbox, false);
        return composite;
        oid.setSelection(false);

            dbmsOutputBufferSize.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));
                    } else {
        {
import org.eclipse.swt.events.SelectionAdapter;
