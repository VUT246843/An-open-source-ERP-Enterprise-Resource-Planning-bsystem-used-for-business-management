        store.setValue(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES, searchInSequences.getSelection());
        showDateAsDate.setSelection(store.getDefaultBoolean(OracleConstants.PROP_SHOW_DATE_AS_DATE));
 * PrefPageOracle
 */
                OracleUIMessages.pref_page_oracle_checkbox_show_date_as_date_tip,
    protected String getPropertyPageID()
    @Override
        searchInSynonyms.setSelection(store.getDefaultBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS));
            );
        DBPPreferenceStore globalPreferences = DBWorkbench.getPlatform().getPreferenceStore();
                OracleUIMessages.pref_page_oracle_group_data,
        store.setValue(OracleConstants.PROP_USE_RULE_HINT, useRuleHint.getSelection());
 *
        showDateAsDate.setSelection(store.getBoolean(OracleConstants.PROP_SHOW_DATE_AS_DATE));
/*
            ;
        rowidSupportCheck.setSelection(store.getDefaultBoolean(OracleConstants.PREF_SUPPORT_ROWID));
    protected Control createPreferenceContent(@NotNull Composite parent) {
    private Button enableDbmsOutputCheck;
    public PrefPageOracle()

                OracleUIMessages.edit_create_checkbox_content_group_use_simple_constraints,
}            explainTableText = UIUtils.createLabelText(planGroup, OracleUIMessages.pref_page_oracle_label_plan_table, "", SWT.BORDER, new GridData(GridData.FILL_HORIZONTAL)); //$NON-NLS-2$
        store.setValue(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS, useSimpleConstraints.getSelection());
    protected void performDefaults() {
                performanceGroup,
    @Override
    {
    private Text explainTableText;
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
            store.contains(OracleConstants.PREF_DBMS_OUTPUT) ||

        store.setValue(OracleConstants.PREF_DBMS_OUTPUT, enableDbmsOutputCheck.getSelection());
        searchInSynonyms.setSelection(store.getBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS));
        return store.contains(OracleConstants.PREF_EXPLAIN_TABLE_NAME) ||
        useAlternativeTableMetadataQuery.setSelection(store.getBoolean(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY));

        store.setToDefault(OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS);
                performanceGroup,
    }
        }
        }
            searchInSynonyms.setToolTipText(OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_synonyms_tooltip);
    private Button useOptimizerHint;


            store.contains(OracleConstants.PROP_USE_META_OPTIMIZER) ||
 * Licensed under the Apache License, Version 2.0 (the "License");

                OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_sequences,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        }
    @Override
        return PAGE_ID;
            store.contains(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS) ||
        enableDbmsOutputCheck.setSelection(store.getDefaultBoolean(OracleConstants.PREF_DBMS_OUTPUT));
        store.setToDefault(OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING);
        explainTableText.setText(store.getDefaultString(OracleConstants.PREF_EXPLAIN_TABLE_NAME));
import org.jkiss.dbeaver.utils.PrefUtils;
        {
    private Button disableScriptEscapeProcessingCheck;
        {

        return true;
    }
                1,
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
        super.performDefaults();
                OracleUIMessages.pref_page_oracle_legend_performance,

    private Button useSimpleConstraints;
    {
                OracleUIMessages.edit_create_checkbox_content_group_use_another_table_query,
                OracleUIMessages.edit_create_checkbox_group_use_rule,
    private Button rowidSupportCheck;
            descLabel.setLayoutData(gd);
            Composite performanceGroup = UIUtils.createTitledComposite(
            useSimpleConstraints = UIUtils.createCheckbox(
        useRuleHint.setSelection(store.getBoolean(OracleConstants.PROP_USE_RULE_HINT));
                false,
    protected void loadPreferences(DBPPreferenceStore store)
        readAllSynonymsCheck.setSelection(store.getBoolean(OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS));

            useRuleHint = UIUtils.createCheckbox(
 * limitations under the License.
public class PrefPageOracle extends TargetPrefPage {
                performanceGroup,
                performanceGroup,

    private Button useAlternativeTableMetadataQuery;
                dataGroup,
    {
            enableDbmsOutputCheck = UIUtils.createCheckbox(miscGroup, OracleUIMessages.pref_page_oracle_checkbox_enable_dbms_output, true);
        store.setValue(OracleConstants.PREF_SUPPORT_ROWID, rowidSupportCheck.getSelection());
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected void savePreferences(DBPPreferenceStore store)
                globalPreferences.getBoolean(OracleConstants.PROP_USE_RULE_HINT)
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        enableDbmsOutputCheck.setSelection(store.getBoolean(OracleConstants.PREF_DBMS_OUTPUT));

        useSimpleConstraints.setSelection(store.getBoolean(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS));
                globalPreferences.getBoolean(OracleConstants.PROP_USE_META_OPTIMIZER)
    private Button searchInSynonyms;
/**
        store.setToDefault(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.oracle.general"; //$NON-NLS-1$
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.UIUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
            store.contains(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY) ||

import org.eclipse.swt.widgets.*;

            Label descLabel = new Label(planGroup, SWT.WRAP);


            useRuleHint.setToolTipText(OracleUIMessages.edit_create_checkbox_adds_rule_tool_tip_text);
                globalPreferences.getBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS)
        {
    {
        useRuleHint.setSelection(store.getDefaultBoolean(OracleConstants.PROP_USE_RULE_HINT));
import org.jkiss.dbeaver.ui.preferences.PreferenceStoreDelegate;
import org.eclipse.swt.layout.GridData;
                globalPreferences.getBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES)
        store.setToDefault(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS);
                composite,
            useAlternativeTableMetadataQuery.setToolTipText(OracleUIMessages.edit_create_checkbox_content_group_use_another_table_query_description);
                1);
        searchInSequences.setSelection(store.getDefaultBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES));
            );


            useOptimizerHint = UIUtils.createCheckbox(
                OracleUIMessages.edit_create_checkbox_group_use_metadata_optimizer,
        disableScriptEscapeProcessingCheck.setSelection(store.getBoolean(OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING));
    {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            Composite miscGroup = UIUtils.createTitledComposite(composite, OracleUIMessages.pref_page_oracle_legend_misc, 1, GridData.FILL_HORIZONTAL);
        store.setValue(OracleConstants.PROP_USE_META_OPTIMIZER, useOptimizerHint.getSelection());

 * Unless required by applicable law or agreed to in writing, software
    private Button useRuleHint;
    @NotNull
        store.setValue(OracleConstants.PREF_EXPLAIN_TABLE_NAME, explainTableText.getText());
        return composite;
            );
            searchInSequences = UIUtils.createCheckbox(
            store.contains(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES) ||
        searchInSequences.setSelection(store.getBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES));


            showDateAsDate = UIUtils.createCheckbox(
            );
            disableScriptEscapeProcessingCheck = UIUtils.createCheckbox(miscGroup, OracleUIMessages.pref_page_oracle_checkbox_disable_escape_processing, OracleUIMessages.pref_page_oracle_label_disable_client_side_parser, true, 1);

                1,

        useOptimizerHint.setSelection(store.getDefaultBoolean(OracleConstants.PROP_USE_META_OPTIMIZER));
            gd.horizontalSpan = 2;
                performanceGroup,
    }

            descLabel.setText(OracleUIMessages.pref_page_oracle_label_by_default_plan_table);
            );
 * DBeaver - Universal Database Manager
            searchInSynonyms = UIUtils.createCheckbox(

            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        store.setToDefault(OracleConstants.PROP_SHOW_DATE_AS_DATE);
    private Button showDateAsDate;
        readAllSynonymsCheck.setSelection(store.getDefaultBoolean(OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS));

    }
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
            store.contains(OracleConstants.PREF_SUPPORT_ROWID) ||
            store.contains(OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING) ||
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        store.setToDefault(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES);
    }
    }
                globalPreferences.getBoolean(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS),
 *
    protected void clearPreferences(DBPPreferenceStore store)
        }

            );
    @Override
        store.setValue(OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING, disableScriptEscapeProcessingCheck.getSelection());
package org.jkiss.dbeaver.ext.oracle.ui.views;
        useSimpleConstraints.setSelection(store.getDefaultBoolean(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS));
        store.setToDefault(OracleConstants.PREF_EXPLAIN_TABLE_NAME);
    @Override
        Composite composite = UIUtils.createComposite(parent, 1);
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
 * Copyright (C) 2010-2026 DBeaver Corp and others

    }
        PrefUtils.savePreferenceStore(store);
    @NotNull
    @Override
        explainTableText.setText(store.getString(OracleConstants.PREF_EXPLAIN_TABLE_NAME));
        useOptimizerHint.setSelection(store.getBoolean(OracleConstants.PROP_USE_META_OPTIMIZER));

    {
    protected boolean supportsDataSourceSpecificOptions()
        useAlternativeTableMetadataQuery.setSelection(store.getDefaultBoolean(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY));
            searchInSequences.setToolTipText(OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_sequences_tooltip);
        rowidSupportCheck.setSelection(store.getBoolean(OracleConstants.PREF_SUPPORT_ROWID));
            );
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
    private Button searchInSequences;
        store.setToDefault(OracleConstants.PREF_DBMS_OUTPUT);
                globalPreferences.getBoolean(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY)
 * you may not use this file except in compliance with the License.
            Composite planGroup = UIUtils.createTitledComposite(composite, OracleUIMessages.pref_page_oracle_legend_execution_plan, 2, GridData.FILL_HORIZONTAL);
 * See the License for the specific language governing permissions and
        disableScriptEscapeProcessingCheck.setSelection(store.getDefaultBoolean(OracleConstants.PREF_DISABLE_SCRIPT_ESCAPE_PROCESSING));


    }
                GridData.FILL_HORIZONTAL
            readAllSynonymsCheck = UIUtils.createCheckbox(miscGroup, OracleUIMessages.pref_page_oracle_checkbox_read_all_synonyms, OracleUIMessages.pref_page_oracle_label_if_unchecked_java_classes, true, 1);
        store.setToDefault(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS);
                GridData.HORIZONTAL_ALIGN_BEGINNING);

        store.setValue(OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS, readAllSynonymsCheck.getSelection());
            rowidSupportCheck = UIUtils.createCheckbox(miscGroup, OracleUIMessages.pref_page_oracle_checkbox_use_rowid_to_identify_rows, true);
            store.contains(OracleConstants.PREF_DBMS_READ_ALL_SYNONYMS) ||
        store.setToDefault(OracleConstants.PROP_USE_RULE_HINT);
            store.contains(OracleConstants.PROP_USE_RULE_HINT) ||
        {
        store.setValue(OracleConstants.PROP_SHOW_DATE_AS_DATE, showDateAsDate.getSelection());

                OracleUIMessages.edit_create_checkbox_content_group_use_simple_constraints_description,
        store.setValue(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS, searchInSynonyms.getSelection());
    }
                OracleUIMessages.pref_page_oracle_checkbox_show_date_as_date,
        store.setToDefault(OracleConstants.PREF_SUPPORT_ROWID);
import org.eclipse.swt.SWT;

    @Override
 */
            useOptimizerHint.setToolTipText(OracleUIMessages.edit_create_checkbox_group_use_metadata_optimizer_tip);
    @Override

                performanceGroup,
            useAlternativeTableMetadataQuery = UIUtils.createCheckbox(
                composite,

                1
        store.setToDefault(OracleConstants.PROP_USE_META_OPTIMIZER);
            store.contains(OracleConstants.PROP_SHOW_DATE_AS_DATE)
                OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_synonyms,
    private Button readAllSynonymsCheck;
            Composite dataGroup = UIUtils.createTitledComposite(
 * distributed under the License is distributed on an "AS IS" BASIS,
        super();
        store.setValue(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY, useAlternativeTableMetadataQuery.getSelection());
    {
            store.contains(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS) ||
