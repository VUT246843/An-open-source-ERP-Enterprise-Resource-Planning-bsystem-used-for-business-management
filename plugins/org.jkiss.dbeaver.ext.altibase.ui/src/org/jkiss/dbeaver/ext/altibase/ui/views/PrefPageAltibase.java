
    private void selectButtonEvent(int idx) {
    }
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
 * limitations under the License.
                1,
    protected boolean supportsDataSourceSpecificOptions() {
        }
            selectButtonEvent(planTypeIdx);
    protected void clearPreferences(DBPPreferenceStore store) {
    public PrefPageAltibase() {
import org.eclipse.swt.events.SelectionAdapter;

                store.contains(AltibaseConstants.PREF_DBMS_OUTPUT) ||
            1,
    @Override

                    planGroup, explainplan.getTitle(), null, selectionListener);
    protected void savePreferences(DBPPreferenceStore store) {
        }
    
                composite,
import org.jkiss.dbeaver.ext.altibase.ui.internal.AltibaseUIMessages;
 * distributed under the License is distributed on an "AS IS" BASIS,
        planTypeIdx = store.getInt(AltibaseConstants.PREF_EXPLAIN_PLAN_TYPE);
        return PAGE_ID;
        Composite planGroup = UIUtils.createTitledComposite(
            planTypeBtns[idx].notifyListeners(SWT.Selection, new Event());
        store.setValue(AltibaseConstants.PREF_EXPLAIN_PLAN_TYPE, planTypeIdx);
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.utils.PrefUtils;
    private int planTypeIdx;
        };
                super.widgetSelected(e);
            planTypeBtns[idx].setSelection(true);
        enablePlanPrefixDepthCheck.setSelection(store.getBoolean(AltibaseConstants.PREF_PLAN_PREFIX));
            public void widgetSelected(final SelectionEvent e) {
                for (int i = 0; i < size; i++) {
        Composite composite = UIUtils.createComposite(parent, 1);
        store.setToDefault(AltibaseConstants.PREF_PLAN_PREFIX);
 * DBeaver - Universal Database Manager
    static final Log log = Log.getLog(PrefPageAltibase.class);
                store.contains(AltibaseConstants.PREF_PLAN_PREFIX));
    }
 * See the License for the specific language governing permissions and
/*
            @Override
            Composite miscGroup = UIUtils.createTitledComposite(
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
                    miscGroup, AltibaseUIMessages.pref_page_altibase_checkbox_enable_dbms_output, true);
            }
    }
        for (AltibaseConstants.ExplainPlan explainplan : AltibaseConstants.ExplainPlan.values()) {
}
        {
        
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.SelectionListener;
                        planTypeIdx = i;
        // Explain plan
    }
    @Override
    
        if (planTypeBtns[planTypeIdx] != null) {
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
    private Button enablePlanPrefixDepthCheck;
import org.eclipse.swt.SWT;
                GridData.FILL_HORIZONTAL);
    @Override
    }
        super();
        store.setToDefault(AltibaseConstants.PREF_EXPLAIN_PLAN_TYPE);
    
        
        descLabel.setText(AltibaseUIMessages.pref_page_altibase_explain_plan_content);

    protected String getPropertyPageID() {
 *

 * You may obtain a copy of the License at
        store.setToDefault(AltibaseConstants.PREF_DBMS_OUTPUT);
        
import org.jkiss.dbeaver.runtime.DBWorkbench;

            
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
                }
import org.jkiss.dbeaver.Log;
    @Override
import org.jkiss.code.NotNull;
        descLabel.setLayoutData(gd);
        store.setValue(AltibaseConstants.PREF_DBMS_OUTPUT, enableDbmsOutputCheck.getSelection());
    
        
    protected void loadPreferences(DBPPreferenceStore store) {

import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.ui.UIUtils;
    @NotNull
            planTypeBtns[i++] = UIUtils.createRadioButton(
        int size = AltibaseConstants.ExplainPlan.values().length;
                    }
        int i = 0;
            AltibaseUIMessages.pref_page_altibase_explain_plan_legend,
        /* Buttons */
                    miscGroup, AltibaseUIMessages.pref_page_altibase_checkbox_plan_prefix_depth, true);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.eclipse.swt.layout.GridData;
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        return true;
        // Misc.
    @Override
        SelectionListener selectionListener = new SelectionAdapter() {
         */
    private Button[] planTypeBtns;
import org.eclipse.swt.widgets.*;
package org.jkiss.dbeaver.ext.altibase.ui.views;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.altibase.general";
        store.setValue(AltibaseConstants.PREF_PLAN_PREFIX, enablePlanPrefixDepthCheck.getSelection());
 */
    
        /* Description */

            enablePlanPrefixDepthCheck = UIUtils.createCheckbox(
    }
        return (store.contains(AltibaseConstants.PREF_EXPLAIN_PLAN_TYPE) ||
    @Override
                AltibaseUIMessages.pref_page_altibase_legend_misc,
    protected Control createPreferenceContent(Composite parent) {

 *

        
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        enableDbmsOutputCheck.setSelection(store.getBoolean(AltibaseConstants.PREF_DBMS_OUTPUT));
 *
        }
    }
        Label descLabel = new Label(planGroup, SWT.WRAP);
            enableDbmsOutputCheck = UIUtils.createCheckbox(
    }
    private Button enableDbmsOutputCheck;
            GridData.FILL_HORIZONTAL);
        planTypeBtns = new Button[size];
    @Override
         * Explain plains (Execution plan)
            composite,
        PrefUtils.savePreferenceStore(store);
        if (planTypeBtns[planTypeIdx] != null) {
        /*
public class PrefPageAltibase extends TargetPrefPage {

import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
 * you may not use this file except in compliance with the License.
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
        }
                    if (planTypeBtns[i] != null && planTypeBtns[i].getSelection()) {
        return composite;
 * Unless required by applicable law or agreed to in writing, software
