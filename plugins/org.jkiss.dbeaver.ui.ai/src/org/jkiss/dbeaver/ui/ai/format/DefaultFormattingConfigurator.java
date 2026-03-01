import java.util.TreeSet;
        AIQueryConfirmationRule confirmDmlRule = CommonUtils.valueOf(
            AIUIMessages.gpt_preference_page_ai_query_confirm_ddl_label,
            CommonUtils.fromOrdinal(AIQueryConfirmationRule.class, confirmSQLCombo.getSelectionIndex()).name()

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.ai.AIConstants;
        combo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        store.setValue(
        );
        Composite generalComposite = UIUtils.createTitledComposite(
        schemaGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL));
    }
        );
    }
            AIQueryConfirmationRule.CONFIRM
        confirmDMLCombo.select(confirmDmlRule.ordinal());
    public void resetSettings(@NotNull AISettings aiSettings) {
            GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING
            AIConstants.AI_CONFIRM_DML,
    }
            chatSettingsGroup,
        createQueryExecutionSettings(queryExecutionSettingsGroup);

        @NotNull Runnable propertyChangeListener
            AIUIMessages.gpt_preference_page_completion_send_type_tip,
        );
            2,
            leftPanel,
        store.setValue(
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
            GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
        AIQueryConfirmationRule confirmSqlRule = CommonUtils.valueOf(
            rightPanel,
            appearanceGroup,
            AIUIMessages.gpt_preference_page_ai_query_confirm_group,

            AIUIMessages.gpt_preference_page_completion_include_source_label,
        return true;
            1,
    private Combo confirmOtherCombo;

        languageText.setItems(languages.toArray(new String[0]));
            leftPanel,
import org.eclipse.swt.widgets.Combo;

            AIUIMessages.gpt_preference_page_ai_query_confirm_other_label,
        Composite rightPanel = UIUtils.createComposite(settingsPanel, 1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        store.setToDefault(AIConstants.AI_CONFIRM_DDL);
 *
    }
            AIConstants.AI_CONFIRM_DDL,

            false,
    protected Composite settingsPanel;

        );
        store.setValue(AIConstants.AI_SEND_DESCRIPTION, sendDescriptionCheck.getSelection());
        );
    private Combo confirmSQLCombo;

        confirmSQLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_confirm);

        AIQueryConfirmationRule confirmDdlRule = CommonUtils.valueOf(
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;

}
    }
    private Button executeQueryImmediatelyCheck;
            AIUIMessages.gpt_preference_page_schema_group,
import org.jkiss.utils.CommonUtils;

            leftPanel,
import java.util.Locale;
    protected void createCompletionSettings(Composite completionGroup, Runnable propertyChangeListener) {
        Composite completionGroup = UIUtils.createTitledComposite(

    protected void createAppearanceSettings(Composite appearanceGroup, Runnable propertyChangeListener) {
            false,
            AIUIMessages.gpt_preference_page_completion_execute_immediately_tip,
            CommonUtils.fromOrdinal(AIQueryConfirmationRule.class, confirmOtherCombo.getSelectionIndex()).name()
        store.setValue(AIConstants.AI_RESPONSE_LANGUAGE, languageText.getText());
            GridData.FILL_HORIZONTAL
 * See the License for the specific language governing permissions and
import org.eclipse.swt.layout.GridData;
            AIUIMessages.gpt_preference_page_completion_execute_description_tip,
            AIUIMessages.gpt_preference_page_completion_include_source_tip,

        sendDescriptionCheck.setSelection(store.getBoolean(AIConstants.AI_SEND_DESCRIPTION));
            languages.add(locale.getDisplayLanguage());
        );
        Combo combo =  UIUtils.createLabelCombo(
        Composite completionComposite = UIUtils.createComposite(completionGroup, 2);
        settingsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    protected void createLeftPanel(@NotNull Composite leftPanel, @NotNull Runnable propertyChangeListener) {
    @NotNull
        Composite queryExecutionSettingsGroup = UIUtils.createTitledComposite(

    @Override
        confirmDDLCombo.select(1);

        createRightPanel(rightPanel);
            UIMessages.controls_locale_selector_label_language,
            AIUIMessages.gpt_preference_page_ai_query_confirm_ddl_tip
        confirmOtherCombo.select(1);
            AIQueryConfirmationRule.CONFIRM
            store.getString(AIConstants.AI_CONFIRM_DML),
        completionComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Set<String> languages = new TreeSet<>();
            AIUIMessages.gpt_preference_page_completion_execute_immediately_label,
import org.jkiss.dbeaver.runtime.DBWorkbench;
        Composite schemaGroup = UIUtils.createTitledComposite(
            false,

import org.jkiss.code.NotNull;


 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        );
        );
            AIConstants.AI_CONFIRM_OTHER,
            UIMessages.ui_properties_tree_viewer_category_general,
package org.jkiss.dbeaver.ui.ai.format;
            generalComposite,
        confirmOtherCombo = createConfirmQueryCombo(
            """
        confirmDMLCombo.select(1);
        Composite appearanceSettings = UIUtils.createComposite(completionGroup, 2);
    private Button sendDescriptionCheck;
        );
        store.setValue(AIConstants.AI_SEND_TYPE_INFO, sendTypeInfoCheck.getSelection());
        confirmOtherCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_execute);
    @Override
import org.eclipse.swt.widgets.Button;
            AIUIMessages.gpt_preference_page_ai_query_confirm_dml_tip
        for (Locale locale : Locale.getAvailableLocales()) {
            AIUIMessages.gpt_preference_page_ai_query_confirm_sql_tip
            SWT.DROP_DOWN
import java.util.Set;

    public void createControl(
        AISchemaGenerator object,
        confirmSQLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_execute);
                Language AI engine should use in chat by default.
        }
        confirmOtherCombo.select(confirmOtherRule.ordinal());
        confirmDDLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_confirm);
                You can enter any natural language name.
            chatSettingsGroup,
        settingsPanel = UIUtils.createComposite(parent, 2);
        rightPanel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING));
    protected void createSchemaSettings(Composite schemaGroup) {
    protected void createRightPanel(Composite rightPanel) {
            queryType,
        store.setToDefault(AIConstants.AI_CONFIRM_OTHER);
        createAppearanceSettings(appearanceSettings, propertyChangeListener);
        );
            2);

 * Licensed under the Apache License, Version 2.0 (the "License");
        createLeftPanel(leftPanel, propertyChangeListener);
    private Button includeSourceTextInCommentCheck;
            AIQueryConfirmationRule.class,
            CommonUtils.fromOrdinal(AIQueryConfirmationRule.class, confirmDDLCombo.getSelectionIndex()).name()
            AIUIMessages.gpt_preference_page_completion_execute_description_label,
        createSchemaSettings(schemaGroup);

    }
            2);
        includeSourceTextInCommentCheck.setSelection(store.getBoolean(AIConstants.AI_INCLUDE_SOURCE_TEXT_IN_QUERY_COMMENT));
        languageText.setToolTipText(

        confirmSQLCombo = createConfirmQueryCombo(
        );
            AIQueryConfirmationRule.class,
        confirmDDLCombo.select(confirmDdlRule.ordinal());
        );
            store.getString(AIConstants.AI_CONFIRM_OTHER),
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    protected void createQueryExecutionSettings(@NotNull Composite chatSettingsGroup) {
import org.jkiss.dbeaver.model.ai.AISettings;
        executeQueryImmediatelyCheck.setSelection(store.getBoolean(AIConstants.AI_COMPLETION_EXECUTE_IMMEDIATELY));
    @Override
        AIQueryConfirmationRule confirmOtherRule = CommonUtils.valueOf(
import org.eclipse.swt.widgets.Composite;

        includeSourceTextInCommentCheck = UIUtils.createCheckbox(
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    private Combo confirmDDLCombo;
public class DefaultFormattingConfigurator implements IObjectPropertyConfigurator<AISchemaGenerator, AISettings> {

        languageText.setLayoutData(GridDataFactory.create(GridData.FILL_HORIZONTAL).hint(150, -1).create());
            AIUIMessages.gpt_preference_page_ai_query_confirm_other_tip

            AIQueryConfirmationRule.class,
        store.setValue(AIConstants.AI_INCLUDE_SOURCE_TEXT_IN_QUERY_COMMENT, includeSourceTextInCommentCheck.getSelection());

        confirmSQLCombo.select(0);
 * DBeaver - Universal Database Manager
            AIQueryConfirmationRule.EXECUTE
        executeQueryImmediatelyCheck = UIUtils.createCheckbox(
        completionGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

            AIUIMessages.gpt_preference_page_ai_query_confirm_sql_label,
        );
            "SQL Completion",
        confirmDMLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_disable_autocommit);
            AIQueryConfirmationRule.CONFIRM
import org.eclipse.jface.layout.GridDataFactory;
        store.setValue(
    private Combo createConfirmQueryCombo(@NotNull Composite group, @NotNull String queryType, String hint) {
    }
                If not specified then AI will reply in the same language you use for prompts."""
    private Combo languageText;
            2,
 *
            group,
        confirmDDLCombo = createConfirmQueryCombo(
            schemaGroup,

        confirmDMLCombo.select(confirmDmlRule.ordinal());
    private Button sendTypeInfoCheck;
/*
    }
            2);
            chatSettingsGroup,
        confirmSQLCombo.select(confirmSqlRule.ordinal());
 * limitations under the License.
        confirmOtherCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_confirm);
        confirmDMLCombo = createConfirmQueryCombo(
    public boolean isComplete() {
    private Combo confirmDMLCombo;
        languageText.setText(CommonUtils.notEmpty(store.getString(AIConstants.AI_RESPONSE_LANGUAGE)));
            false,
        );
            AIUIMessages.gpt_preference_page_ai_query_confirm_dml_label,
            AIQueryConfirmationRule.class,

        confirmDMLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_execute);
            AIConstants.AI_CONFIRM_SQL,
            2,
    @Override
            completionGroup,
    public void loadSettings(@NotNull AISettings aiSettings) {
        store.setValue(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        );
import org.jkiss.dbeaver.ui.UIUtils;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        languageText = UIUtils.createLabelCombo(
import org.jkiss.dbeaver.model.ai.AISchemaGenerator;
        );
            hint,
            store.getString(AIConstants.AI_CONFIRM_SQL),
    }
        store.setValue(AIConstants.AI_COMPLETION_EXECUTE_IMMEDIATELY, executeQueryImmediatelyCheck.getSelection());
            AIUIMessages.gpt_preference_page_completion_send_type_label,
        createCompletionSettings(completionComposite, propertyChangeListener);
        appearanceSettings.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING));
            store.getString(AIConstants.AI_CONFIRM_DDL),
import org.jkiss.dbeaver.model.ai.AIQueryConfirmationRule;
    }
    ) {

 *
    }
            2);
        );
import org.jkiss.dbeaver.ui.internal.UIMessages;
        sendTypeInfoCheck = UIUtils.createCheckbox(

        sendTypeInfoCheck.setSelection(store.getBoolean(AIConstants.AI_SEND_TYPE_INFO));
        confirmDDLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_execute);
        store.setToDefault(AIConstants.AI_CONFIRM_DML);
        );
 */
        return combo;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull Composite parent,
            CommonUtils.fromOrdinal(AIQueryConfirmationRule.class, confirmDMLCombo.getSelectionIndex()).name()


        Composite leftPanel = UIUtils.createComposite(settingsPanel, 1);
        );
            schemaGroup,
        leftPanel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_BEGINNING));
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING
        sendDescriptionCheck = UIUtils.createCheckbox(
        store.setToDefault(AIConstants.AI_CONFIRM_SQL);
            chatSettingsGroup,
    @Override
import org.eclipse.swt.SWT;
    public void saveSettings(@NotNull AISettings aiSettings) {
        confirmDMLCombo.add(AIUIMessages.gpt_preference_page_ai_query_confirm_rule_confirm);
            SWT.READ_ONLY | SWT.DROP_DOWN
