        {
            useOptimizerHint = UIUtils.createCheckbox(performanceGroup, OracleUIMessages.edit_create_checkbox_group_use_metadata_optimizer, true);
        Map<String, String> providerProperties = connectionInfo.getProviderProperties();
                contentGroup,
        if (nlsTerritory != null) {
            nlsCurrencyFormat = UIUtils.createLabelText(sessionGroup, OracleUIMessages.edit_label_text_currency_format, "");
            }
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleTerritory;
            providerProperties.get(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS),
        ));
            globalPreferences.getBoolean(OracleConstants.PROP_USE_META_OPTIMIZER)
                e -> UIUtils.openWebBrowser(OracleConstants.OPTIMIZER_DOCS_LINK)));
    private Button showDateAsDate;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            providerProperties.get(OracleConstants.PROP_USE_RULE_HINT),
            }
                    String.valueOf(useAlternativeTableMetadataQuery.getSelection()));
    private Button showOnlyOneSchema;
    private Combo optimizerVersionText;
            providerProperties.remove(propName);
    }
        useSimpleConstraints.setSelection(CommonUtils.getBoolean(
 * DBeaver - Universal Database Manager
                OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_sequences,

    }
            for (String version : OracleConstants.OPTIMIZER_VERSIONS) {
        showDateAsDate.setSelection(CommonUtils.getBoolean(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
            searchInSequences = UIUtils.createCheckbox(
                providerProperties.put(OracleConstants.PROP_SESSION_LANGUAGE, languageCombo.getText());
        DBPPreferenceStore globalPreferences = DBWorkbench.getPlatform().getPreferenceStore();
            providerProperties.get(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS),
        ));
        ));
        //oraHomeSelector.setVisible(isOCI);
                1);
            useDBAViewsCheckbox = UIUtils.createCheckbox(contentGroup, OracleUIMessages.edit_create_checkbox_content_group_use,  OracleUIMessages.edit_create_checkbox_content_group_use_description, false, 1);
            territoryCombo.add(OracleConstants.NLS_DEFAULT_VALUE);
                    OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY,
{
            providerProperties.put(
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            Composite dataGroup = UIUtils.createTitledComposite(
                false,

                territoryCombo.add(territory.getTerritory());
            );

        GridLayout gl = new GridLayout(2, false);
            optimizerVersionText.setText(OracleConstants.OPTIMIZER_VERSION_DEFAULT);
        cfgGroup.setLayoutData(gd);
        {
import org.eclipse.swt.widgets.Button;
        if (nlsLanguage != null) {

import org.eclipse.swt.events.SelectionListener;

                OracleConstants.PROP_SHOW_ONLY_ONE_SCHEMA,
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
                OracleConstants.PROP_ALWAYS_USE_DBA_VIEWS,
        }
            providerProperties.put(
        }
                String.valueOf(useOptimizerHint.getSelection()));
    }
        gl.marginHeight = 10;
public class OracleConnectionExtraPage extends ConnectionPageAbstract

 *
 * limitations under the License.
        searchInSynonyms.setSelection(CommonUtils.getBoolean(
    private Combo languageCombo;
            UIUtils.createLink(optimizerPlaceholder, "<a>Info</a>", SelectionListener.widgetSelectedAdapter(
import org.eclipse.swt.widgets.Composite;
    {
            providerProperties.put(
        ));
                false,
                String.valueOf(useDBAViewsCheckbox.getSelection()));
            );
        super.dispose();
                OracleUIMessages.pref_page_oracle_checkbox_show_date_as_date,
                optimizerVersionText.add(version);
            globalPreferences.getBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS)
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
            languageCombo.setText(OracleConstants.NLS_DEFAULT_VALUE);

        setControl(cfgGroup);
import java.util.Map;

            globalPreferences.getBoolean(OracleConstants.PROP_USE_RULE_HINT)
 */
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private Text nlsLengthFormat;
                providerProperties.put(OracleConstants.PROP_SESSION_TERRITORY, territoryCombo.getText());
                cfgGroup,
            providerProperties.get(OracleConstants.PROP_USE_META_OPTIMIZER_VERSION)));
            territoryCombo = UIUtils.createLabelCombo(sessionGroup, OracleUIMessages.edit_label_combo_territory, SWT.DROP_DOWN);
            hideEmptySchemasCheckbox = UIUtils.createCheckbox(contentGroup, OracleUIMessages.edit_create_checkbox_hide_empty_schemas, false);
            providerProperties.put(
            useSimpleConstraints = UIUtils.createCheckbox(performanceGroup, OracleUIMessages.edit_create_checkbox_content_group_use_simple_constraints,  OracleUIMessages.edit_create_checkbox_content_group_use_simple_constraints_description, false, 1);
            useSysSchemaCheckbox = UIUtils.createCheckbox(contentGroup, OracleUIMessages.edit_create_checkbox_content_group_use_sys_schema,  OracleUIMessages.edit_create_checkbox_content_group_use_sys_schema_description, false, 1);

        final Object nlsTerritory = providerProperties.get(OracleConstants.PROP_SESSION_TERRITORY);
            providerProperties.put(
            providerProperties.get(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES),
    {
        useSysSchemaCheckbox.setSelection(CommonUtils.getBoolean(providerProperties.get(OracleConstants.PROP_METADATA_USE_SYS_SCHEMA), false));
            searchInSequences.setToolTipText(OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_sequences_tooltip);

        // Settings
                1);
            useRuleHint = UIUtils.createCheckbox(performanceGroup, OracleUIMessages.edit_create_checkbox_group_use_rule, true);
    @Override
                GridData.HORIZONTAL_ALIGN_BEGINNING
    }
            ((GridData)sessionGroup.getLayoutData()).horizontalSpan = 2;

        }
        gl.marginWidth = 10;
        nlsCurrencyFormat.setText(CommonUtils.toString(providerProperties.get(OracleConstants.PROP_SESSION_NLS_CURRENCY_FORMAT)));
            if (!OracleConstants.NLS_DEFAULT_VALUE.equals(territoryCombo.getText())) {
    }
package org.jkiss.dbeaver.ext.oracle.ui.views;
    private Text nlsDateFormat;
    private Button useOptimizerHint;
            globalPreferences.getBoolean(OracleConstants.PROP_SHOW_DATE_AS_DATE)
        Map<String, String> providerProperties = dataSource.getConnectionConfiguration().getProviderProperties();

            );
            nlsTimestampFormat = UIUtils.createLabelText(sessionGroup, OracleUIMessages.edit_label_text_timestamp_format, "");
    @Override

            useRuleHint.setToolTipText(OracleUIMessages.edit_create_checkbox_adds_rule_tool_tip_text);
            showOnlyOneSchema = UIUtils.createCheckbox(
import org.jkiss.dbeaver.ext.oracle.model.dict.OracleLanguage;
        final Object nlsLanguage = providerProperties.get(OracleConstants.PROP_SESSION_LANGUAGE);
    {
                String.valueOf(hideEmptySchemasCheckbox.getSelection()));
            useAlternativeTableMetadataQuery.setToolTipText(OracleUIMessages.edit_create_checkbox_content_group_use_another_table_query_description);

            providerProperties.put(

                performanceGroup,

 *
            territoryCombo.setText(OracleConstants.NLS_DEFAULT_VALUE);
            showDateAsDate = UIUtils.createCheckbox(
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
                String.valueOf(showOnlyOneSchema.getSelection()));
                1,
                OracleConstants.PROP_USE_META_OPTIMIZER,
            } else {
            territoryCombo.setToolTipText(OracleUIMessages.edit_label_combo_territory_tool_tip_text);
                String.valueOf(useSysSchemaCheckbox.getSelection()));
                + "May affect metadata read performance or even break some metadata reads.");
            optimizerPlaceholder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        loadSettings();
 *     http://www.apache.org/licenses/LICENSE-2.0
                GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING


                providerProperties.remove(OracleConstants.PROP_SESSION_TERRITORY);
 * See the License for the specific language governing permissions and
                OracleConstants.PROP_CHECK_SCHEMA_CONTENT,

            providerProperties.put(
                OracleUIMessages.connection_extra_page_checkbox_show_only_one_schema,
    private Button useRuleHint;

                OracleUIMessages.pref_page_oracle_group_data,
        ));
}
    public void createControl(Composite parent)
            for (OracleTerritory territory : OracleTerritory.values()) {
    private Button searchInSequences;


            globalPreferences.getBoolean(OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS)
        {
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPageAbstract;
        // Load values from new connection info
    private Text nlsTimestampFormat;

    private Button hideEmptySchemasCheckbox;
    {
                GridData.HORIZONTAL_ALIGN_BEGINNING
    public void dispose()

        useAlternativeTableMetadataQuery.setSelection(CommonUtils.getBoolean(
            providerProperties.put(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES, String.valueOf(searchInSequences.getSelection()));
            providerProperties.put(
        {
import org.eclipse.swt.widgets.Combo;
            hideEmptySchemasCheckbox.setSelection(CommonUtils.getBoolean(checkSchemaContent, false));
                OracleUIMessages.dialog_controlgroup_session_settings,
            languageCombo.setText(nlsLanguage.toString());
    private Button useSysSchemaCheckbox;
    }
    public void loadSettings()
            globalPreferences.getBoolean(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY)
import org.eclipse.swt.layout.GridData;
            languageCombo.setToolTipText(OracleUIMessages.edit_label_combo_language_tool_tip_text);
            );
            Composite performanceGroup = UIUtils.createTitledComposite(
        saveConnectionURL(dataSource.getConnectionConfiguration());


            providerProperties.get(OracleConstants.PROP_METADATA_USE_ALTERNATIVE_TABLE_QUERY),
 * Copyright (C) 2010-2026 DBeaver Corp and others
    {

        if (!propValue.isEmpty()) {
                OracleConstants.PROP_METADATA_USE_SYS_SCHEMA,
 * Unless required by applicable law or agreed to in writing, software
            optimizerVersionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    @Override
    public void saveSettings(DBPDataSourceContainer dataSource)
        ));
        useOptimizerHint.setSelection(CommonUtils.getBoolean(
            Composite sessionGroup = UIUtils.createTitledComposite(



 * OracleConnectionPage
            Composite contentGroup = UIUtils.createTitledComposite(
        setTitle(OracleUIMessages.dialog_connection_oracle_properties);
 * You may obtain a copy of the License at
        }
            }
            setOrRemoveProperty(nlsLengthFormat, OracleConstants.PROP_SESSION_NLS_LENGTH_FORMAT, providerProperties);
    public boolean isComplete()

/**

    @Override
        } else {
import org.eclipse.swt.SWT;
            // Settings
    private Button useSimpleConstraints;
            languageCombo = UIUtils.createLabelCombo(sessionGroup, OracleUIMessages.edit_label_combo_language, SWT.DROP_DOWN);
            globalPreferences.getBoolean(OracleConstants.PROP_SEARCH_METADATA_IN_SEQUENCES)
 *
        nlsDateFormat.setText(CommonUtils.toString(providerProperties.get(OracleConstants.PROP_SESSION_NLS_DATE_FORMAT)));
                    OracleConstants.PROP_METADATA_USE_SIMPLE_CONSTRAINTS,
            providerProperties.put(propName, propValue);
            for (OracleLanguage language : OracleLanguage.values()) {

        Composite cfgGroup = new Composite(parent, SWT.NONE);
        String propValue = text.getText().trim();
        showOnlyOneSchema.setSelection(CommonUtils.getBoolean(providerProperties.get(OracleConstants.PROP_SHOW_ONLY_ONE_SCHEMA)));
            useOptimizerHint.setToolTipText(OracleUIMessages.edit_create_checkbox_group_use_metadata_optimizer_tip);
        return true;
        ));
            nlsDateFormat = UIUtils.createLabelText(sessionGroup, OracleUIMessages.edit_label_text_date_format, "");
        }
                OracleUIMessages.connection_extra_page_checkbox_show_only_one_schema_tip,
 */
        GridData gd = new GridData(GridData.FILL_BOTH);
    private Text nlsCurrencyFormat;
                    String.valueOf(useSimpleConstraints.getSelection()));
        cfgGroup.setLayout(gl);
    private Button showDBAAlwaysCheckbox;
import org.jkiss.utils.CommonUtils;

        useDBAViewsCheckbox.setSelection(CommonUtils.getBoolean(providerProperties.get(OracleConstants.PROP_ALWAYS_USE_DBA_VIEWS), false));

                cfgGroup,
            languageCombo.add(OracleConstants.NLS_DEFAULT_VALUE);
    private Button useAlternativeTableMetadataQuery;
        }
            }
            optimizerVersionText = UIUtils.createLabelCombo(optimizerPlaceholder, "Optimizer version", SWT.DROP_DOWN);
                performanceGroup,
                1,
    @Override
            Composite optimizerPlaceholder = UIUtils.createPlaceholder(performanceGroup, 3);
            setOrRemoveProperty(nlsCurrencyFormat, OracleConstants.PROP_SESSION_NLS_CURRENCY_FORMAT, providerProperties);
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
                1,
                cfgGroup,
        nlsTimestampFormat.setText(CommonUtils.toString(providerProperties.get(OracleConstants.PROP_SESSION_NLS_TIMESTAMP_FORMAT)));
        DBPConnectionConfiguration connectionInfo = site.getActiveDataSource().getConnectionConfiguration();
import org.jkiss.dbeaver.ui.UIUtils;
            providerProperties.put(OracleConstants.PROP_SEARCH_METADATA_IN_SYNONYMS, String.valueOf(searchInSynonyms.getSelection()));
            providerProperties.put(
    }
        }
                String.valueOf(showDBAAlwaysCheckbox.getSelection()));
        searchInSequences.setSelection(CommonUtils.getBoolean(

                2,
                OracleUIMessages.pref_page_oracle_checkbox_show_date_as_date_tip,
            } else {
                false
        setDescription(OracleUIMessages.dialog_connection_oracle_properties_description);
        showDBAAlwaysCheckbox.setSelection(CommonUtils.getBoolean(providerProperties.get(OracleConstants.PROP_ALWAYS_SHOW_DBA), false));
                GridData.HORIZONTAL_ALIGN_BEGINNING
            }



            providerProperties.get(OracleConstants.PROP_SHOW_DATE_AS_DATE),
                OracleUIMessages.dialog_controlgroup_content,
                false
            searchInSynonyms.setToolTipText(OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_synonyms_tooltip);
                OracleUIMessages.edit_create_checkbox_content_group_search_metadata_in_synonyms,
                OracleConstants.PROP_USE_META_OPTIMIZER_VERSION,
                cfgGroup,
        final Object checkSchemaContent = providerProperties.get(OracleConstants.PROP_CHECK_SCHEMA_CONTENT);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private Button searchInSynonyms;
            providerProperties.get(OracleConstants.PROP_USE_META_OPTIMIZER),

                dataGroup,

            searchInSynonyms = UIUtils.createCheckbox(
        nlsLengthFormat.setText(CommonUtils.toString(providerProperties.get(OracleConstants.PROP_SESSION_NLS_LENGTH_FORMAT)));
    private Combo territoryCombo;


    private Button useDBAViewsCheckbox;
    private static void setOrRemoveProperty(Text text, String propName, Map<String, String> providerProperties) {

            providerProperties.put(OracleConstants.PROP_SHOW_DATE_AS_DATE, String.valueOf(showDateAsDate.getSelection()));
                providerProperties.remove(OracleConstants.PROP_SESSION_LANGUAGE);
            optimizerVersionText.setToolTipText("Oracle optimizer versions.\n"
            hideEmptySchemasCheckbox.setToolTipText(OracleUIMessages.edit_create_checkbox_hide_empty_schemas_tool_tip_text);
                OracleUIMessages.dialog_controlgroup_performance,
import org.eclipse.swt.layout.GridLayout;
            );
            useAlternativeTableMetadataQuery = UIUtils.createCheckbox(performanceGroup, OracleUIMessages.edit_create_checkbox_content_group_use_another_table_query, false);
        optimizerVersionText.setText(CommonUtils.notEmpty(
                languageCombo.add(language.getLanguage());

                optimizerVersionText.getText());
            setOrRemoveProperty(nlsTimestampFormat, OracleConstants.PROP_SESSION_NLS_TIMESTAMP_FORMAT, providerProperties);

            providerProperties.put(
    public OracleConnectionExtraPage()
            setOrRemoveProperty(nlsDateFormat, OracleConstants.PROP_SESSION_NLS_DATE_FORMAT, providerProperties);
                String.valueOf(useRuleHint.getSelection()));
 * you may not use this file except in compliance with the License.
            if (!OracleConstants.NLS_DEFAULT_VALUE.equals(languageCombo.getText())) {
            );
import org.eclipse.swt.widgets.Text;
            nlsLengthFormat = UIUtils.createLabelText(sessionGroup, OracleUIMessages.edit_label_text_length_format, "");
                OracleConstants.PROP_ALWAYS_SHOW_DBA,
    {
                OracleConstants.PROP_USE_RULE_HINT,
            showDBAAlwaysCheckbox = UIUtils.createCheckbox(contentGroup, OracleUIMessages.edit_create_checkbox_content_group_show, OracleUIMessages.edit_create_checkbox_content_group_show_description, false, 1);
            territoryCombo.setText(nlsTerritory.toString());
        if (checkSchemaContent != null) {

        useRuleHint.setSelection(CommonUtils.getBoolean(
