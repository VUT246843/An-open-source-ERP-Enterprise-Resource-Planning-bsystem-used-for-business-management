    @NotNull
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
            );
        {


            if (!presentationToggles.isEmpty()) {
                SQLEditorMessages.pref_page_sql_editor_label_size_warning_threshold,
                        : store.getBoolean(ref.descriptor.getSettingKey())
                        : store.getString(SQLPreferenceConstants.RESULT_SET_ORIENTATION)
            store.setValue(SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY, sizeWarningThresholdSpinner.getSelection());
 * Licensed under the Apache License, Version 2.0 (the "License");
            Composite autoSaveGroup = UIUtils.createTitledComposite(composite, SQLEditorMessages.pref_page_sql_editor_group_auto_save, 1, GridData.VERTICAL_ALIGN_BEGINNING, 0);
        return true;
        SeparateConnectionBehavior.DEFAULT,
                    : store.getBoolean(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW)
        try {

import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
            store.contains(SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE) ||
                    1,
            replaceCurrentTab.setSelection(

                PrefPageSQLEditor.TEXT_EDITOR_PAGE_ID,
                Composite group = UIUtils.createTitledComposite(
 *
        store.setToDefault(SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sqleditor"; //$NON-NLS-1$
                    : store.getBoolean(SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE)

    private Button autoSaveActiveSchema;
                    : store.getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE)
    @Override
import org.eclipse.ui.services.IEvaluationService;
        PrefUtils.savePreferenceStore(store);
            store.setValue(SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE, autoSaveOnClose.getSelection());
 * You may obtain a copy of the License at
        store.setToDefault(SQLPreferenceConstants.AUTO_SAVE_ON_CHANGE);
    protected void performDefaults() {
                    ? store.getDefaultBoolean(SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR)
            autoSaveActiveSchema.setSelection(
                        : store.getString(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION)

                    store.setValue(toggle.descriptor.getSettingKey(), toggle.button.getSelection());

            this.descriptor = descriptor;
/*
            String orientationLabel = resultsOrientationCombo.getText();
                    useDefaults
    private List<SQLPresentationToggle> presentationToggles = List.of();
                );

        loadPreferences(getTargetPreferenceStore(), false);
                wpc, null
            autoSaveOnChange.setSelection(
            .requestEvaluation(settingKey);
        }
                    toggle.button = UIUtils.createCheckbox(group, toggle.descriptor.getPrefLabel(), toggle.descriptor.getPrefTip(), true, 1)
        {
            );

        } catch (Exception e) {
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
            );
                SQLEditorMessages.pref_page_sql_editor_label_close_results_tab_on_error,

 */
    private Button autoSaveOnClose;
    }
        SeparateConnectionBehavior.ALWAYS,

    @Override
            Composite rsSizeComposite = UIUtils.createComposite(layoutGroup, 2);
        super();
        }

import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
            presentationToggles = SQLPresentationRegistry.getInstance().getPresentations().stream()
                    ? store.getDefaultBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_CHANGE)
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
            resultsOrientationCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            Composite connectionsGroup = UIUtils.createTitledComposite(composite, SQLEditorMessages.pref_page_sql_editor_group_connections, 1, GridData.VERTICAL_ALIGN_BEGINNING, 0);
            saveOnQueryExecution = UIUtils.createCheckbox(autoSaveGroup, SQLEditorMessages.pref_page_sql_editor_label_save_on_query_execute, SQLEditorMessages.pref_page_sql_editor_label_save_on_query_execute, false, 1);
        store.setToDefault(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION);
            UIUtils.createPreferenceLink(
            editorSeparateConnectionCombo = UIUtils.createLabelCombo(
    }
            );
        }
        final SQLPresentationDescriptor descriptor;

            }
                    SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION,
                NLS.bind(SQLEditorMessages.pref_page_sql_editor_label_separate_connection_each_editor_tip, DriverUtils.collectSingleConnectionDrivers()),
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationRegistry;
        store.setToDefault(SQLPreferenceConstants.RESULT_SET_ORIENTATION);
                ).getTitle()
            presentationToggles.forEach(ref ->
            connectOnExecuteCheck.setSelection(
    // Initialized to empty immutable list to avoid null checks
                }
import org.eclipse.swt.widgets.*;

                .toList();
            store.contains(SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE) ||
 *
            );
            store.setValue(SQLPreferenceConstants.RESULT_SET_REPLACE_CURRENT_TAB, replaceCurrentTab.getSelection());
            for (SQLEditor.ResultSetOrientation orientation : SQLEditor.ResultSetOrientation.values()) {
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
            );
    protected boolean supportsDataSourceSpecificOptions() {
    private Button closeTabOnErrorCheck;

                    ? store.getDefaultBoolean(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW)
            store.setValue(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE, saveOnQueryExecution.getSelection());

        if (getContainer() instanceof IWorkbenchPreferenceContainer wpc) {

            ((GridData) editorSeparateConnectionCombo.getLayoutData()).grabExcessHorizontalSpace = false;
            );
            connectOnActivationCheck.setSelection(
 *     http://www.apache.org/licenses/LICENSE-2.0
                        ? store.getDefaultString(SQLPreferenceConstants.RESULT_SET_ORIENTATION)
    @Override
                useDefaults
    }
                EditorUtils.COLORS_AND_FONTS_PAGE_ID,
                linksGroup,
                "<a>''{0}''</a> " + SQLEditorMessages.pref_page_sql_editor_link_text_editor,
import org.jkiss.dbeaver.ui.UIUtils;
            if (this.getDataSourceContainer() != null && !this.getDataSourceContainer().getDriver().isEmbedded()) {
            );

            closeTabOnErrorCheck = UIUtils.createCheckbox(
            connectOnActivationCheck = UIUtils.createCheckbox(connectionsGroup, SQLEditorMessages.pref_page_sql_editor_label_connect_on_editor_activation, false);
        store.setToDefault(SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR);

import org.jkiss.dbeaver.registry.driver.DriverUtils;
                useDefaults
        store.setToDefault(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE);

            store.contains(SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE) ||
            store.setValue(SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE, connectOnActivationCheck.getSelection());
            );
import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
            autoSaveOnChange = UIUtils.createCheckbox(autoSaveGroup, SQLEditorMessages.pref_page_sql_editor_label_auto_save_on_change, SQLEditorMessages.pref_page_sql_editor_label_auto_save_on_change_tip, false, 1);
    private Button autoOpenOutputView;
    private Button replaceCurrentTab;
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
                    : store.getBoolean(SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA)

            );
                ((GridData) group.getLayoutData()).horizontalSpan = 2;
            resultsOrientationCombo = UIUtils.createLabelCombo(orientationComposite, SQLEditorMessages.pref_page_sql_editor_label_results_orientation, SQLEditorMessages.pref_page_sql_editor_label_results_orientation_tip, SWT.READ_ONLY | SWT.DROP_DOWN);
                    updateUI(toggle.descriptor.getSettingKey());

                    : store.getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE)
/**
            sizeWarningThresholdSpinner = UIUtils.createLabelSpinner(rsSizeComposite,
                if (orientationLabel.equals(orientation.getLabel())) {
    private void loadPreferences(DBPPreferenceStore store, boolean useDefaults) {
                .map(SQLPresentationToggle::new)
            for (SQLEditor.ResultSetOrientation orientation : SQLEditor.ResultSetOrientation.values()) {
                1);

import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static final class SQLPresentationToggle {
 * PrefPageSQLEditor
import org.jkiss.code.NotNull;
    @Override
package org.jkiss.dbeaver.ui.editors.sql.preferences;

        {
                presentationToggles.forEach(toggle ->
                    ? store.getDefaultInt(SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY)
        store.setToDefault(SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE);
            store.contains(SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA) ||
                );
                .filter(p -> p.getSettingKey() != null)

                SeparateConnectionBehavior.parse(
            saveOnQueryExecution.setSelection(
            presentationToggles.forEach(toggle -> {
public class PrefPageSQLEditor extends TargetPrefPage {
        }
        return
                SQLEditorMessages.pref_page_sql_editor_label_close_results_tab_on_error_tip,
    }
                }
                    ? store.getDefaultBoolean(SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE)
            autoOpenOutputView = UIUtils.createCheckbox(layoutGroup, SQLEditorMessages.pref_page_sql_editor_label_auto_open_output_view, SQLEditorMessages.pref_page_sql_editor_label_auto_open_output_view_tip, false, 2);
                    editorUseSeparateConnectionValues.get(editorSeparateConnectionCombo.getSelectionIndex()).name()

        } catch (Exception e) {
    }
                .map(SeparateConnectionBehavior::getTitle).toArray(String[]::new));
            Composite layoutGroup = UIUtils.createTitledComposite(composite, SQLEditorMessages.pref_page_sql_editor_group_result_view, 1, GridData.HORIZONTAL_ALIGN_BEGINNING, 0);

    @NotNull
import org.jkiss.dbeaver.utils.PrefUtils;
}            UIUtils.setComboSelection(
            editorSeparateConnectionCombo.setItems(editorUseSeparateConnectionValues.stream()
 * DBeaver - Universal Database Manager
        public SQLPresentationToggle(@NotNull SQLPresentationDescriptor descriptor) {
        );
            }
            );
    );
            autoSaveOnClose.setSelection(
    public PrefPageSQLEditor() {
                    ? store.getDefaultBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE)
            connectOnExecuteCheck = UIUtils.createCheckbox(connectionsGroup, SQLEditorMessages.pref_page_sql_editor_label_connect_on_query_execute, false);
                    : store.getInt(SQLPreferenceConstants.RESULT_SET_MAX_TABS_PER_QUERY)
                SQLEditor.ResultSetOrientation.valueOf(
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
                layoutGroup,

        return PAGE_ID;
                resultsOrientationCombo,
            }
import java.util.List;
        loadPreferences(getTargetPreferenceStore(), true);
    private Button connectOnExecuteCheck;
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationDescriptor;
            ((GridData) connectionsGroup.getLayoutData()).horizontalSpan = 2;
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected Control createPreferenceContent(@NotNull Composite parent) {
    
        store.setToDefault(SQLPreferenceConstants.RESULT_SET_REPLACE_CURRENT_TAB);
    private Combo resultsOrientationCombo;
    @Override

            store.setValue(SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR, closeTabOnErrorCheck.getSelection());
        SeparateConnectionBehavior.NEVER
            store.contains(SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    0
                        ? store.getDefaultString(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION)

    private Spinner sizeWarningThresholdSpinner;
        Composite composite = UIUtils.createPlaceholder(parent, 2, 10);
    }
            store.setValue(SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE, connectOnExecuteCheck.getSelection());
                useDefaults
            );
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;

            if (this.getDataSourceContainer() != null && this.getDataSourceContainer().getDriver().isEmbedded()) {

    @Override
    }
    }
 * Unless required by applicable law or agreed to in writing, software
            sizeWarningThresholdSpinner.setSelection(
import org.jkiss.dbeaver.Log;
                UIUtils.createComposite(connectionsGroup, 3),
                linksGroup,
            sizeWarningThresholdSpinner.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                );
 * you may not use this file except in compliance with the License.
                    SQLEditorMessages.pref_page_sql_editor_group_presentations,
                editorSeparateConnectionCombo,


    private static final Log log = Log.getLog(PrefPageSQLEditor.class);
    private static final String TEXT_EDITOR_PAGE_ID = "org.eclipse.ui.preferencePages.GeneralTextEditor"; //$NON-NLS-1$
            autoSaveOnClose = UIUtils.createCheckbox(autoSaveGroup, SQLEditorMessages.pref_page_sql_editor_label_auto_save_on_close, false);
    private Combo editorSeparateConnectionCombo;
                    ? store.getDefaultBoolean(SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE)
        PlatformUI.getWorkbench()
        presentationToggles.forEach(toggle ->
            log.warn(e);
        }
            store.contains(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION) ||
 * limitations under the License.
        super.performDefaults();
                    resultsOrientationCombo.add(orientation.getLabel());
                )
                useDefaults

                useDefaults
            Composite linksGroup = UIUtils.createComposite(composite, 1);
            store.setValue(SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA, autoSaveActiveSchema.getSelection());
                useDefaults
    private Button saveOnQueryExecution;


            store.contains(SQLPreferenceConstants.AUTO_SAVE_ON_EXECUTE) ||
                ref.button.setSelection(
        store.setToDefault(SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA);
                    : store.getBoolean(SQLPreferenceConstants.RESULT_SET_CLOSE_ON_ERROR)
            closeTabOnErrorCheck.setSelection(

    }

        }
                SQLEditorMessages.pref_page_sql_editor_link_colors_and_fonts,
                    ? store.getDefaultBoolean(SQLPreferenceConstants.RESULT_SET_REPLACE_CURRENT_TAB)
    private static final List<SeparateConnectionBehavior> editorUseSeparateConnectionValues = List.of(
            editorSeparateConnectionCombo.setToolTipText(
import org.eclipse.osgi.util.NLS;
            log.warn(e);
    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
                editorSeparateConnectionCombo.setEnabled(false);
    }

                    DBWorkbench.getPlatform().getPreferenceStore().setValue(SQLPreferenceConstants.RESULT_SET_ORIENTATION, orientation.name());
    private Button autoSaveOnChange;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private Button connectOnActivationCheck;
            ((GridData) layoutGroup.getLayoutData()).horizontalSpan = 2;


        }
                SWT.READ_ONLY | SWT.DROP_DOWN
                }
    @Override
                    ? store.getDefaultBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_CLOSE)
    @Override
            );

            );
            store.setToDefault(toggle.descriptor.getSettingKey())
            UIUtils.createPreferenceLink(
                useDefaults
                useDefaults
            Composite orientationComposite = UIUtils.createComposite(layoutGroup, 2);
                    : store.getBoolean(SQLPreferenceConstants.RESULT_SET_REPLACE_CURRENT_TAB)
            store.setValue(SQLPreferenceConstants.AUTO_SAVE_ON_CHANGE, autoSaveOnChange.getSelection());
            UIUtils.setComboSelection(
import org.eclipse.swt.layout.GridData;
    }
                if (orientation.isSupported()) {
        {
                    composite,
            store.setValue(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW, autoOpenOutputView.getSelection());
                wpc, null
 * See the License for the specific language governing permissions and
                    useDefaults
            autoOpenOutputView.setSelection(
                    useDefaults
    protected void clearPreferences(DBPPreferenceStore store) {
                    GridData.VERTICAL_ALIGN_BEGINNING,
    protected String getPropertyPageID() {
                    ? store.getDefaultBoolean(SQLPreferenceConstants.AUTO_SAVE_ACTIVE_SCHEMA)

            .getService(IEvaluationService.class)
            );
 * Copyright (C) 2010-2026 DBeaver Corp and others
        try {
            }
                NLS.bind(SQLEditorMessages.pref_page_sql_editor_label_separate_connection_each_editor_tip, DriverUtils.collectSingleConnectionDrivers())
                false,
        return composite;
                ).getLabel()
                SQLEditorMessages.pref_page_sql_editor_label_separate_connection_each_editor,
        private Button button;
        store.setToDefault(SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE);
        }
            );
                SQLEditorMessages.pref_page_sql_editor_label_size_warning_threshold_tip, 20, 2, 200);

            replaceCurrentTab = UIUtils.createCheckbox(layoutGroup, SQLEditorMessages.pref_page_sql_editor_label_replace_on_single_query_exec_view, SQLEditorMessages.pref_page_sql_editor_label_replace_on_single_query_exec_view_tip, true, 2);
                    break;
                    : store.getBoolean(SQLPreferenceConstants.EDITOR_CONNECT_ON_ACTIVATE)
            );
        store.setToDefault(SQLPreferenceConstants.EDITOR_CONNECT_ON_EXECUTE);
        store.setToDefault(SQLPreferenceConstants.OUTPUT_PANEL_AUTO_SHOW);
                        ? store.getDefaultBoolean(ref.descriptor.getSettingKey())
            );
                useDefaults
import org.jkiss.dbeaver.ui.editors.EditorUtils;
    }

            }

                store.setValue(
 *
    private void updateUI(String settingKey) {
                    : store.getBoolean(SQLPreferenceConstants.AUTO_SAVE_ON_CHANGE)
            autoSaveActiveSchema = UIUtils.createCheckbox(autoSaveGroup, SQLEditorMessages.pref_page_sql_editor_label_save_active_schema, false);
 */
                useDefaults
