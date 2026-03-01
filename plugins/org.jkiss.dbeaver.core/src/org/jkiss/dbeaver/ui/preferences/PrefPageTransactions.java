            showTransactionNotificationsCheck.setSelection(store.getBoolean(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS));
                txnNameGroup,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                public void widgetSelected(SelectionEvent e) {

            log.warn(e);
                true,
            smartCommitCheck.addSelectionListener(new SelectionAdapter() {
                        store.getBoolean(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED) : connectionType.isAutoCloseTransactions());
            if (smartCommitCheck != null) {
import org.jkiss.dbeaver.utils.PrefUtils;
    @NotNull
            autoCloseTransactionsTtlText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
} *
        PrefUtils.savePreferenceStore(store);
            if (smartCommitCheck != null) {
 * DBeaver - Universal Database Manager
        store.setToDefault(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER);
            store.setValue(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS, showTransactionNotificationsCheck.getSelection());
            CoreMessages.dialog_connection_edit_wizard_transactions,
                CoreMessages.action_menu_transaction_smart_auto_commit_tip,
import org.eclipse.swt.widgets.Button;

                        store.getString(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL) :
            smartCommitRecoverCheck = UIUtils.createCheckbox(
                false,
                if (smartCommitCheck != null) {
        }
                CoreMessages.action_menu_transaction_auto_close_enabled_tip,

import org.eclipse.swt.layout.GridData;
    @Override

        if (!smartCommitCheck.getSelection()) {
            }
            DBWorkbench.getPlatform().getPreferenceStore().getDefaultBoolean(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS));
                store.setValue(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL, autoCloseTransactionsTtlText.getText());
            }
    }
            store.contains(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL) ||
                        store.getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER) : connectionType.isSmartCommitRecover());
    private Button autoCloseTransactionsCheck;
    }

            settingsTipString = CoreMessages.action_menu_transaction_pref_page_link_extended;
        return composite;
                public void widgetSelected(SelectionEvent e) {
    {
        if (dataSourcePreferencePage) {
 */
                2);
        super.performDefaults();
    private Button smartCommitRecoverCheck;
    }
 * See the License for the specific language governing permissions and
            2,
            gd.widthHint = UIUtils.getFontHeight(autoCloseTransactionsTtlText) * 6;
                CoreMessages.action_menu_transaction_smart_auto_commit_recover_tip,
                }
 */


                txnNameGroup,
            showTransactionNotificationsCheck = UIUtils.createCheckbox(
        }
            store.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT) ||
                }
            }
    protected void savePreferences(DBPPreferenceStore store)
                    updateCommitRecoverCheckBox();
            store.contains(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS)
                1);
        }
    @Override
            ;
            if (smartCommitRecoverCheck != null) {

    @Override
                    updateCommitRecoverCheckBox();
            store.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER) ||
                connectionType = dataSourceContainer.getConnectionConfiguration().getConnectionType();
import org.jkiss.code.NotNull;
    }
                store.setValue(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED, autoCloseTransactionsCheck.getSelection());
        return PAGE_ID;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ModelPreferences;
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (getContainer() instanceof IWorkbenchPreferenceContainer wpc) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * you may not use this file except in compliance with the License.
        store.setToDefault(ModelPreferences.TRANSACTIONS_SHOW_NOTIFICATIONS);
/*
                store.setValue(ModelPreferences.TRANSACTIONS_SMART_COMMIT, smartCommitCheck.getSelection());
                autoCloseTransactionsTtlText.setText(
            //autoCloseTransactionsTtlText.setEnabled(autoCloseTransactionsCheck.getSelection());
    @Override
            store.contains(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED) ||
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
import org.eclipse.swt.widgets.Control;
                wpc,
            autoCloseTransactionsTtlText.setToolTipText(CoreMessages.action_menu_transaction_auto_close_ttl_tip);
                2);
    @Override
        store.setToDefault(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL);
                    autoCloseTransactionsTtlText.setEnabled(autoCloseTransactionsCheck.getSelection());
    protected Control createPreferenceContent(@NotNull Composite parent) {
import org.eclipse.swt.widgets.Text;
                PrefPageConnectionTypes.PAGE_ID,
            GridData gd = new GridData();
 * limitations under the License.
                null
            Composite notifyNameGroup = UIUtils.createTitledComposite(
            }
            );
            autoCloseTransactionsCheck = UIUtils.createCheckbox(

    private Button showTransactionNotificationsCheck;
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 * You may obtain a copy of the License at
                notifyNameGroup,

            // Works only with the smart commit mode
                settingsTipString,
    }

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            autoCloseTransactionsCheck.addSelectionListener(new SelectionAdapter() {
    }
            smartCommitCheck = UIUtils.createCheckbox(
            //autoCloseTransactionsTtlText.setEnabled(false);
                store.setValue(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER, smartCommitRecoverCheck.getSelection());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Unless required by applicable law or agreed to in writing, software
        store.setToDefault(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED);
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
                    store.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT_RECOVER) || connectionType == null ?
            }
    {
            UIUtils.createPreferenceLink(
        }
        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);

            log.warn(e);
                    store.getBoolean(ModelPreferences.TRANSACTIONS_SMART_COMMIT) : connectionType.isSmartCommit());
                CoreMessages.action_menu_transaction_auto_close_enabled,
            );
    protected boolean supportsDataSourceSpecificOptions()
    {
                @Override
*/
                false,
    }
    }
/**
        try {
                }
    protected void loadPreferences(DBPPreferenceStore store)
                smartCommitRecoverCheck.setSelection(
                CoreMessages.pref_page_transactions_notifications_show_check_label,
            smartCommitRecoverCheck.setEnabled(false);

                    store.contains(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_TTL) || connectionType == null ?
            // First check data source settings, second - connection type, third - global settings.
        super();
/*
        return true;
        } catch (Exception e) {

            GridData.FILL_HORIZONTAL);
    @Override
        } catch (Exception e) {
                CoreMessages.pref_page_transactions_notifications_show_check_description,
                2
    protected void performDefaults() {
    private Text autoCloseTransactionsTtlText;
            }
            }
    {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.transactions"; //$NON-NLS-1$

            smartCommitRecoverCheck.setEnabled(true);
import org.eclipse.swt.widgets.Composite;
    public PrefPageTransactions()

    private void updateCommitRecoverCheckBox() {

                CoreMessages.action_menu_transaction_smart_auto_commit,
                composite, CoreMessages.pref_page_transactions_notify_name_group_label, 2, GridData.FILL_HORIZONTAL);
import org.eclipse.swt.SWT;
                    store.contains(ModelPreferences.TRANSACTIONS_AUTO_CLOSE_ENABLED) || connectionType == null ?
        } else {
            if (autoCloseTransactionsCheck != null) {
        showTransactionNotificationsCheck.setSelection(
            });
import org.jkiss.dbeaver.ui.UIUtils;
    protected void clearPreferences(DBPPreferenceStore store)
    @Override
                txnNameGroup,
    private Button smartCommitCheck;
    protected String getPropertyPageID()
        store.setToDefault(ModelPreferences.TRANSACTIONS_SMART_COMMIT);
 *
import java.util.Locale;
                CoreMessages.action_menu_transaction_smart_auto_commit_recover,
        }
 * PrefPageTransactions
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor)
                false,

            if (dataSourceContainer != null) {
            DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
            });
        try {
            DBPConnectionType connectionType = null;
            if (smartCommitRecoverCheck != null) {
        boolean dataSourcePreferencePage = isDataSourcePreferencePage();
        Composite txnNameGroup = UIUtils.createTitledComposite(
            if (autoCloseTransactionsCheck != null) {
            smartCommitRecoverCheck.setSelection(false);
            settingsTipString = CoreMessages.action_menu_transaction_pref_page_link;
        {
    {
                smartCommitCheck.setSelection(store.contains(ModelPreferences.TRANSACTIONS_SMART_COMMIT) || connectionType == null ?
            }
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
            autoCloseTransactionsTtlText.setLayoutData(gd);

 *
            composite,
                autoCloseTransactionsCheck.setSelection(

public class PrefPageTransactions extends TargetPrefPage {
            autoCloseTransactionsTtlText = new Text(txnNameGroup, SWT.BORDER);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
package org.jkiss.dbeaver.ui.preferences;
import org.jkiss.dbeaver.core.CoreMessages;
                        String.valueOf(connectionType.getCloseIdleConnectionPeriod()));



    }
        return
                @Override
    {
                txnNameGroup,
        } else if (!smartCommitRecoverCheck.isEnabled()) {
        String settingsTipString;
