 */
                CoreMessages.pref_page_database_general_checkbox_disable_extra_metadata,
 * PrefPageMetaData
                CoreMessages.pref_page_database_general_checkbox_case_sensitive_names_tip,
                SeparateConnectionBehavior.parse(store.getString(ModelPreferences.META_SEPARATE_CONNECTION))
        PrefUtils.savePreferenceStore(store);


    @Override
                GridData.HORIZONTAL_ALIGN_BEGINNING);
            readExpensiveCheck = UIUtils.createCheckbox(
                1);

    protected void clearPreferences(DBPPreferenceStore store)
 * Copyright (C) 2010-2026 DBeaver Corp and others

                NLS.bind(CoreMessages.pref_page_database_general_separate_meta_connection_tip, DriverUtils.collectSingleConnectionDrivers()),

            separateMetaConnectionCombo.setToolTipText(
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
                CoreMessages.pref_page_database_general_checkbox_show_row_count_tip,
            ));
 *
 */
            store.setValue(ModelPreferences.META_CASE_SENSITIVE, caseSensitiveNamesCheck.getSelection());
        return PAGE_ID;
    @Override
    protected void performDefaults() {
    {
        readExpensiveCheck.setSelection(store.getDefaultBoolean(ModelPreferences.READ_EXPENSIVE_PROPERTIES));
    {
            store.contains(ModelPreferences.META_DISABLE_EXTRA_READ) ||

    @Override
    private Button serverSideFiltersCheck;
                CoreMessages.pref_page_database_general_checkbox_case_sensitive_names,

            }
    }

}                CoreMessages.pref_page_database_general_group_metadata,
        return true;
                CoreMessages.pref_page_database_general_server_side_object_filters,
    

                    .map(SeparateConnectionBehavior::getTitle).toArray(String[]::new));
    {
    private static final List<SeparateConnectionBehavior> metaUseSeparateConnectionValues = List.of(

                CoreMessages.pref_page_database_general_group_performance,
        }
            caseSensitiveNamesCheck.setSelection(store.getBoolean(ModelPreferences.META_CASE_SENSITIVE));
            store.setValue(ModelPreferences.META_USE_SERVER_SIDE_FILTERS, serverSideFiltersCheck.getSelection());

        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    protected void savePreferences(DBPPreferenceStore store)
import org.eclipse.swt.layout.GridData;
            disableExtraMetadataRead.setSelection(store.getBoolean(ModelPreferences.META_DISABLE_EXTRA_READ));
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
                CoreMessages.pref_page_database_general_checkbox_disable_extra_metadata_tip,
        caseSensitiveNamesCheck.setSelection(store.getDefaultBoolean(ModelPreferences.META_CASE_SENSITIVE));
                CoreMessages.pref_page_database_general_checkbox_add_special_DDL_info_tip,
            store.setValue(ModelPreferences.META_DISABLE_EXTRA_READ, disableExtraMetadataRead.getSelection());
        super();
                1);

public class PrefPageMetaData extends TargetPrefPage

package org.jkiss.dbeaver.ui.preferences;
            disableExtraMetadataRead = UIUtils.createCheckbox(
            );
    protected void loadPreferences(DBPPreferenceStore store)
                CoreMessages.pref_page_database_general_checkbox_show_row_count,
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            addExtraDDLInfo = UIUtils.createCheckbox(
    }
            addExtraDDLInfo.setSelection(store.getBoolean(ModelPreferences.META_EXTRA_DDL_INFO));
import org.jkiss.code.NotNull;
        }
import org.jkiss.dbeaver.registry.driver.DriverUtils;
    protected String getPropertyPageID()

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        super.performDefaults();
    protected boolean supportsDataSourceSpecificOptions()
        serverSideFiltersCheck.setSelection(store.getDefaultBoolean(ModelPreferences.META_USE_SERVER_SIDE_FILTERS));

    }
        SeparateConnectionBehavior.NEVER
                composite,
            store.contains(ModelPreferences.META_CASE_SENSITIVE) ||
    {
            Composite performanceGroup = UIUtils.createTitledComposite(
 * distributed under the License is distributed on an "AS IS" BASIS,
                GridData.HORIZONTAL_ALIGN_BEGINNING);


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ((GridData) separateMetaConnectionCombo.getLayoutData()).grabExcessHorizontalSpace = false;
    protected Control createPreferenceContent(@NotNull Composite parent) {
            store.contains(ModelPreferences.READ_EXPENSIVE_PROPERTIES) ||
        SeparateConnectionBehavior.DEFAULT,
    );
            caseSensitiveNamesCheck = UIUtils.createCheckbox(
 * you may not use this file except in compliance with the License.
        store.setToDefault(ModelPreferences.META_USE_SERVER_SIDE_FILTERS);
import org.eclipse.swt.widgets.Combo;
    @Override
import org.eclipse.swt.widgets.Control;
            }
                false,
    }
        store.setToDefault(ModelPreferences.META_CASE_SENSITIVE);
    private Combo separateMetaConnectionCombo;
            if (this.getDataSourceContainer() != null && this.getDataSourceContainer().getDriver().isEmbedded()) {
    @NotNull
        return composite;
        try {
            separateMetaConnectionCombo = UIUtils.createLabelCombo(
                true,
    {
                    ModelPreferences.META_SEPARATE_CONNECTION,
        separateMetaConnectionCombo.select(metaUseSeparateConnectionValues.indexOf(

            SeparateConnectionBehavior.parse(store.getDefaultString(ModelPreferences.META_SEPARATE_CONNECTION))
                false,
import java.util.List;
                separateMetaConnectionCombo.setItems(metaUseSeparateConnectionValues.stream()
    private Button disableExtraMetadataRead;
import org.eclipse.swt.SWT;
    @Override
                    metaUseSeparateConnectionValues.get(separateMetaConnectionCombo.getSelectionIndex()).name()
/**
            } else {
                1,
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
{
            store.setValue(ModelPreferences.META_EXTRA_DDL_INFO, addExtraDDLInfo.getSelection());
                SWT.READ_ONLY | SWT.DROP_DOWN
                composite,
        disableExtraMetadataRead.setSelection(store.getDefaultBoolean(ModelPreferences.META_DISABLE_EXTRA_READ));
                metadataGroup,
    }
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
                1);
    {
            log.warn(e);
                1);
                performanceGroup,
import org.jkiss.dbeaver.utils.PrefUtils;
            ;
import org.jkiss.dbeaver.core.CoreMessages;
            store.setValue(ModelPreferences.READ_EXPENSIVE_PROPERTIES, readExpensiveCheck.getSelection());
    }
            log.warn(e);
                );

 *
                false,
        ));
        addExtraDDLInfo.setSelection(store.getDefaultBoolean(ModelPreferences.META_EXTRA_DDL_INFO));
    private Button caseSensitiveNamesCheck;
/*
 *
                CoreMessages.pref_page_database_general_separate_meta_connection,
        }
import org.jkiss.dbeaver.ui.UIUtils;
                CoreMessages.pref_page_database_general_server_side_object_filters_tip,
    }
                metadataGroup,
                false,
            store.contains(ModelPreferences.META_SEPARATE_CONNECTION) ||
 * See the License for the specific language governing permissions and
                CoreMessages.pref_page_database_general_checkbox_add_special_DDL_info,
            Composite metadataGroup = UIUtils.createTitledComposite(
        store.setToDefault(ModelPreferences.META_DISABLE_EXTRA_READ);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        store.setToDefault(ModelPreferences.META_SEPARATE_CONNECTION);
        SeparateConnectionBehavior.ALWAYS,
                UIUtils.createComposite(metadataGroup, 3),
    private Button addExtraDDLInfo;
        try {
        } catch (Exception e) {
        return
    private Button readExpensiveCheck;
            );

 * Unless required by applicable law or agreed to in writing, software
                store.setValue(
        }
            serverSideFiltersCheck = UIUtils.createCheckbox(
 * You may obtain a copy of the License at
    @Override
                1,
import org.jkiss.dbeaver.ModelPreferences;
 * limitations under the License.
        store.setToDefault(ModelPreferences.META_EXTRA_DDL_INFO);
            serverSideFiltersCheck.setSelection(store.getBoolean(ModelPreferences.META_USE_SERVER_SIDE_FILTERS));
    @Override
        store.setToDefault(ModelPreferences.READ_EXPENSIVE_PROPERTIES);
            separateMetaConnectionCombo.select(metaUseSeparateConnectionValues.indexOf(
                NLS.bind(CoreMessages.pref_page_database_general_separate_meta_connection_tip, DriverUtils.collectSingleConnectionDrivers())
            store.contains(ModelPreferences.META_USE_SERVER_SIDE_FILTERS)
        {
    public PrefPageMetaData()

    @Override
            readExpensiveCheck.setSelection(store.getBoolean(ModelPreferences.READ_EXPENSIVE_PROPERTIES));
                separateMetaConnectionCombo.setEnabled(false);
        } catch (Exception e) {
                performanceGroup,
    {
            if (separateMetaConnectionCombo.isEnabled()) {
                metadataGroup,
 * Licensed under the Apache License, Version 2.0 (the "License");
                1);
        {
import org.eclipse.swt.widgets.Button;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.meta"; //$NON-NLS-1$
