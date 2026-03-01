                null,
                errorGroup,
            connectionCloseTimeout.setSelection(store.getInt(ModelPreferences.CONNECTION_CLOSE_TIMEOUT));
        // Misc settings
                CoreMessages.pref_page_error_handle_connection_validate_timeout_label + UIMessages.label_ms,
            );
    private Button connectionAutoRecoverEnabled;
            );
        try {
        // Canceling
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

        connectionCloseTimeout.setSelection(store.getDefaultInt(ModelPreferences.CONNECTION_CLOSE_TIMEOUT));
            );
        } catch (Exception e) {
                composite,
import org.jkiss.dbeaver.runtime.DBWorkbench;
                2
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.errorHandle"; //$NON-NLS-1$
                timeoutsGroup,
            connectionAutoRecoverRetryCount.setSelection(store.getInt(ModelPreferences.EXECUTE_RECOVER_RETRY_COUNT));
            store.setValue(ModelPreferences.EXECUTE_RECOVER_RETRY_COUNT, connectionAutoRecoverRetryCount.getSelection());
        }
    @Override
        return PAGE_ID;
        super();
 *


            Composite errorGroup = UIUtils.createTitledComposite(
                CoreMessages.pref_page_error_handle_recover_retry_count_tip,
                0,
        // Misc settings
            store.setValue(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT, connectionValidateTimeout.getSelection());
                errorGroup,
                2
                GridData.VERTICAL_ALIGN_BEGINNING);
    protected void clearPreferences(DBPPreferenceStore store) {
            cancelCheckTimeout = UIUtils.createLabelSpinner(

        connectionAutoRecoverEnabled.setSelection(store.getDefaultBoolean(ModelPreferences.EXECUTE_RECOVER_ENABLED));
    }

 * PrefPageErrorHandle

    @Override
            log.warn(e);
                CoreMessages.pref_page_error_handle_cancel_check_timeout_tip,

            connectionValidateTimeout.setSelection(store.getInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT));

    protected void loadPreferences(@NotNull DBPPreferenceStore store) {
            Composite timeoutsGroup = UIUtils.createTitledComposite(
                CoreMessages.pref_page_error_handle_recover_enabled_tip,
            store.setValue(ModelPreferences.CONNECTION_OPEN_TIMEOUT, connectionOpenTimeout.getSelection());
                composite,
            store.contains(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT) ||
    }
            connectionOpenTimeout.setSelection(store.getInt(ModelPreferences.CONNECTION_OPEN_TIMEOUT));
        PrefUtils.savePreferenceStore(store);
            store.setValue(ModelPreferences.CONNECTION_CLOSE_TIMEOUT, connectionCloseTimeout.getSelection());
                CoreMessages.pref_page_error_handle_connection_validate_timeout_label_tip,
            connectionCloseTimeout = UIUtils.createLabelSpinner(
    protected boolean supportsDataSourceSpecificOptions()
                false,
            store.setValue(ModelPreferences.EXECUTE_RECOVER_ENABLED, connectionAutoRecoverEnabled.getSelection());
        store.setToDefault(ModelPreferences.EXECUTE_CANCEL_CHECK_TIMEOUT);

    @Override
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
    public PrefPageErrorHandle()
                CoreMessages.pref_page_error_handle_group_cancel_title,
                Integer.MAX_VALUE

 * limitations under the License.
 * you may not use this file except in compliance with the License.

                timeoutsGroup,
import org.jkiss.dbeaver.core.CoreMessages;
            connectionAutoRecoverEnabled.setSelection(store.getBoolean(ModelPreferences.EXECUTE_RECOVER_ENABLED));
            store.contains(ModelPreferences.EXECUTE_CANCEL_CHECK_TIMEOUT)
        }
public class PrefPageErrorHandle extends TargetPrefPage {
                CoreMessages.pref_page_error_handle_cancel_check_timeout,
                0,
import org.eclipse.swt.widgets.Button;
                CoreMessages.pref_page_error_handle_connection_close_timeout_label + UIMessages.label_ms,

        return composite;
 */
            );
            connectionOpenTimeout = UIUtils.createLabelSpinner(
            connectionAutoRecoverRetryCount = UIUtils.createLabelSpinner(
    private Spinner cancelCheckTimeout;
import org.eclipse.swt.widgets.Composite;
    protected void savePreferences(@NotNull DBPPreferenceStore store) {
 *
            store.setValue(ModelPreferences.QUERY_ROLLBACK_ON_ERROR, rollbackOnErrorCheck.getSelection());
                2,
    private Spinner connectionOpenTimeout;
                2
                0,

 *
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

                0,
    @Override
    protected String getPropertyPageID()

            store.contains(ModelPreferences.QUERY_ROLLBACK_ON_ERROR) ||
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        {
        cancelCheckTimeout.setSelection(store.getDefaultInt(ModelPreferences.EXECUTE_CANCEL_CHECK_TIMEOUT));
            store.contains(ModelPreferences.EXECUTE_RECOVER_ENABLED) ||
        store.setToDefault(ModelPreferences.QUERY_ROLLBACK_ON_ERROR);
    @NotNull
    }

    protected Control createPreferenceContent(@NotNull Composite parent) {
        connectionAutoRecoverRetryCount.setSelection(store.getDefaultInt(ModelPreferences.EXECUTE_RECOVER_RETRY_COUNT));
    protected void performDefaults() {
    @Override
    {
import org.jkiss.code.NotNull;
            cancelCheckTimeout.setSelection(store.getInt(ModelPreferences.EXECUTE_CANCEL_CHECK_TIMEOUT));
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ModelPreferences;
                false,
            store.contains(ModelPreferences.EXECUTE_RECOVER_RETRY_COUNT) ||
 */
import org.eclipse.swt.widgets.Control;
            connectionValidateTimeout = UIUtils.createLabelSpinner(
    }
                0,
        store.setToDefault(ModelPreferences.EXECUTE_RECOVER_ENABLED);
            connectionAutoRecoverEnabled = UIUtils.createCheckbox(
        Composite composite = UIUtils.createComposite(parent, 1);
/**
    }
        try {


    }
        super.performDefaults();
                CoreMessages.pref_page_error_handle_recover_enabled_label,
            store.contains(ModelPreferences.CONNECTION_OPEN_TIMEOUT) ||
import org.eclipse.swt.widgets.Spinner;

    private Spinner connectionAutoRecoverRetryCount;
import org.jkiss.dbeaver.ui.internal.UIMessages;
    }
        store.setToDefault(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT);
            );
                Integer.MAX_VALUE
    private Button rollbackOnErrorCheck;
        } catch (Exception e) {
            ;
            store.setValue(ModelPreferences.EXECUTE_CANCEL_CHECK_TIMEOUT, cancelCheckTimeout.getSelection());

    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
            rollbackOnErrorCheck.setSelection(store.getBoolean(ModelPreferences.QUERY_ROLLBACK_ON_ERROR));
                CoreMessages.pref_page_error_handle_connection_open_timeout_label_tip,
                errorGroup,

    @Override
        store.setToDefault(ModelPreferences.EXECUTE_RECOVER_RETRY_COUNT);
import org.jkiss.dbeaver.utils.PrefUtils;

        connectionOpenTimeout.setSelection(store.getDefaultInt(ModelPreferences.CONNECTION_OPEN_TIMEOUT));
    {


package org.jkiss.dbeaver.ui.preferences;
 * DBeaver - Universal Database Manager
            );
    @NotNull
        rollbackOnErrorCheck.setSelection(store.getDefaultBoolean(ModelPreferences.QUERY_ROLLBACK_ON_ERROR));
        }
                0,

                CoreMessages.pref_page_database_general_checkbox_rollback_on_error,
                0,
            );
                CoreMessages.pref_page_error_handle_group_execute_title,
            store.contains(ModelPreferences.CONNECTION_CLOSE_TIMEOUT) ||
                2
                Integer.MAX_VALUE
    }

                CoreMessages.pref_page_error_handle_group_timeouts_title,
import org.eclipse.swt.layout.GridData;
 *     http://www.apache.org/licenses/LICENSE-2.0
                0,

                composite,
}        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
        }
            Composite errorGroup = UIUtils.createTitledComposite(
                Integer.MAX_VALUE
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
/*
        connectionValidateTimeout.setSelection(store.getDefaultInt(ModelPreferences.CONNECTION_VALIDATION_TIMEOUT));
 * See the License for the specific language governing permissions and
        {
    private Spinner connectionValidateTimeout;

            rollbackOnErrorCheck = UIUtils.createCheckbox(
                timeoutsGroup,
                errorGroup,
        }

 * distributed under the License is distributed on an "AS IS" BASIS,
                Integer.MAX_VALUE
                0,
        return true;
import org.jkiss.dbeaver.ui.UIUtils;
                CoreMessages.pref_page_error_handle_connection_close_timeout_label_tip,
 * You may obtain a copy of the License at
    }
        store.setToDefault(ModelPreferences.CONNECTION_CLOSE_TIMEOUT);
        return
            );
                0,
        store.setToDefault(ModelPreferences.CONNECTION_OPEN_TIMEOUT);
                CoreMessages.pref_page_error_handle_connection_open_timeout_label + UIMessages.label_ms,
    {
            );
            log.warn(e);
        {
                CoreMessages.pref_page_error_handle_recover_retry_count_label,

    private Spinner connectionCloseTimeout;
