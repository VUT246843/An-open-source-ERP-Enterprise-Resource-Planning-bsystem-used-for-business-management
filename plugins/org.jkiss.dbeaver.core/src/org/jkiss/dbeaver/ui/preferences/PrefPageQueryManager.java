        super.performDefaults();
import org.eclipse.swt.SWT;
            checkStoreLog.addSelectionListener(new SelectionAdapter() {

                storageSettings,
            CoreMessages.pref_page_query_manager_group_object_types,
            });
        if (checkQueryTypeUtil.getSelection()) queryTypes.add(DBCExecutionPurpose.UTIL.name());
        Composite groupObjects = UIUtils.createTitledComposite(

import org.eclipse.ui.IWorkbenchPropertyPage;
                CoreMessages.pref_page_query_manager_checkbox_store_log_file,
        return null;

/**
    private Button checkStoreLog;


            DBCExecutionPurpose.USER_SCRIPT.name());
    @Override

        checkObjectTypeSessions = UIUtils.createCheckbox(groupObjects, CoreMessages.pref_page_query_manager_checkbox_sessions, false);

        checkObjectTypeTxn.setSelection(objectTypes.contains(QMObjectType.txn));
import org.jkiss.dbeaver.utils.PrefUtils;
    }
    private Text textHistoryDays;
        Collection<String> queryTypes = CommonUtils.splitString(store.getString(QMConstants.PROP_QUERY_TYPES), ',');
                @Override
            composite,

        UIUtils.enableWithChildren(textHistoryDays, checkStoreLog.getSelection());

 * DBeaver - Universal Database Manager

                composite,
    public void init(IWorkbench workbench)
    @Override
        String qmStorePath = store.getString(QMConstants.PROP_LOG_DIRECTORY);
    private Button checkObjectTypeSessions;

/*
        if (checkQueryTypeScript.getSelection()) queryTypes.add(DBCExecutionPurpose.USER_SCRIPT.name());
                }
    }
        List<QMObjectType> objectTypes = new ArrayList<>();
import org.eclipse.swt.events.SelectionEvent;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            Control infoLabel = UIUtils.createInfoLabel(storageSettings, CoreMessages.pref_page_query_manager_log_file_hint);
                new GridData(50, SWT.DEFAULT));

    }
        if (CommonUtils.isEmpty(qmStorePath)) {
import org.jkiss.code.NotNull;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
        {
    }
    private Button checkQueryTypeMeta;
        checkObjectTypes(objectTypes);
package org.jkiss.dbeaver.ui.preferences;
    private Button checkQueryTypeUtil;
                SWT.BORDER,

import org.eclipse.swt.layout.GridData;
        if (checkQueryTypeDDL.getSelection()) queryTypes.add(DBCExecutionPurpose.META_DDL.name());
import org.eclipse.ui.IWorkbench;

import org.jkiss.dbeaver.model.qm.QMConstants;
import org.eclipse.swt.widgets.Control;
        checkObjectTypeSessions.setSelection(objectTypes.contains(QMObjectType.session));
        store.setValue(QMConstants.PROP_STORE_LOG_FILE, checkStoreLog.getSelection());


        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            1,
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
        textEntriesPerPage.setText(store.getDefaultString(QMConstants.PROP_ENTRIES_PER_PAGE));
        {
        List<String> queryTypes = new ArrayList<>();
        Composite composite = UIUtils.createComposite(parent, 1);
    public IAdaptable getElement()
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            gd.horizontalSpan = 2;
                CoreMessages.pref_page_query_manager_group_storage,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Collection;
        PrefUtils.savePreferenceStore(store);
            checkStoreLog.setLayoutData(gd);
        if (checkObjectTypeQueries.getSelection()) objectTypes.add(QMObjectType.query);
    {
    @Override
        if (historyDays != null) {
        Integer historyDays = UIUtils.getTextInteger(textHistoryDays);
        }
        checkQueryTypeMeta.setSelection(queryTypes.contains(DBCExecutionPurpose.META.name()));
        textOutputFolder.setText(store.getDefaultString(QMConstants.PROP_LOG_DIRECTORY));
    @Override
            DBCExecutionPurpose.USER_FILTERED.name(),
            textOutputFolder.setText(getQMLogStorePath(store));
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.eclipse.swt.widgets.Button;
            store.setValue(QMConstants.PROP_HISTORY_DAYS, Math.max(1, historyDays));
    {
        Collection<QMObjectType> objectTypes = Arrays.asList(QMObjectType.txn, QMObjectType.query);
import org.jkiss.dbeaver.ui.UIUtils;
        textHistoryDays.setText(store.getDefaultString(QMConstants.PROP_HISTORY_DAYS));

    }

}    public boolean performOk()
{
        checkObjectTypeQueries = UIUtils.createCheckbox(groupObjects, CoreMessages.pref_page_query_manager_checkbox_queries, false);
import org.eclipse.swt.events.SelectionAdapter;
        if (checkQueryTypeMeta.getSelection()) queryTypes.add(DBCExecutionPurpose.META.name());
                storageSettings,
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.


            GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
import java.util.Arrays;

import org.jkiss.dbeaver.core.CoreMessages;
        UIUtils.enableWithChildren(textOutputFolder.getParent(), checkStoreLog.getSelection());
    public void setElement(IAdaptable element)
            );
        checkQueryTypes(queryTypes);
    private Text textEntriesPerPage;
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
    private Button checkQueryTypeUser;
    private Text textOutputFolder;
    protected void performDefaults() {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.qm"; //$NON-NLS-1$
                    UIUtils.enableWithChildren(textOutputFolder.getParent(), checkStoreLog.getSelection());
        Composite groupQueryTypes = UIUtils.createTitledComposite(
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Button checkObjectTypeTxn;
        return qmStorePath;
            Composite storageSettings = UIUtils.createTitledComposite(
import org.jkiss.dbeaver.utils.GeneralUtils;
        checkQueryTypeUser = UIUtils.createCheckbox(groupQueryTypes, CoreMessages.pref_page_query_manager_checkbox_user_queries, false);
            store.setValue(QMConstants.PROP_ENTRIES_PER_PAGE, Math.max(1, entriesPerPage));
    }
        checkObjectTypeTxn = UIUtils.createCheckbox(groupObjects, CoreMessages.pref_page_query_manager_checkbox_transactions, false);
 * You may obtain a copy of the License at
        return super.performOk();
        checkQueryTypeUser.setSelection(queryTypes.contains(DBCExecutionPurpose.USER.name()));

            DBCExecutionPurpose.USER.name(),
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IWorkbenchPreferencePage;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        }
        checkQueryTypeUserFiltered.setSelection(queryTypes.contains(DBCExecutionPurpose.USER_FILTERED.name()));
                2,
                store.getString(QMConstants.PROP_ENTRIES_PER_PAGE),
    private void setSettings() {
import org.eclipse.swt.widgets.Composite;
                store.getString(QMConstants.PROP_HISTORY_DAYS),
        checkQueryTypeUserFiltered = UIUtils.createCheckbox(groupQueryTypes, CoreMessages.pref_page_query_manager_checkbox_user_filtered, false);
        if (entriesPerPage != null) {
                public void widgetSelected(SelectionEvent e)
            infoLabel.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1));
            checkStoreLog = UIUtils.createCheckbox(
            1,
    @NotNull
    @Override
        checkQueryTypeUtil = UIUtils.createCheckbox(groupQueryTypes, CoreMessages.pref_page_query_manager_checkbox_utility_functions, false);
public class PrefPageQueryManager extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage
        Collection<QMObjectType> objectTypes = QMObjectType.fromString(store.getString(QMConstants.PROP_OBJECT_TYPES));
            textOutputFolder = DialogUtils.createOutputFolderChooser(storageSettings, CoreMessages.pref_page_query_manager_logs_folder, null, false, null);
import org.jkiss.utils.CommonUtils;
        }
        checkQueryTypeDDL = UIUtils.createCheckbox(groupQueryTypes, CoreMessages.pref_page_query_manager_checkbox_metadata_write, false);
                CoreMessages.pref_page_query_manager_label_entries_per_page,
        //checkObjectTypeScripts = UIUtils.createCheckbox(groupObjects, CoreMessages.pref_page_query_manager_checkbox_scripts, false);
    @Override
        UIUtils.enableWithChildren(textOutputFolder.getParent(), checkStoreLog.getSelection());
            textHistoryDays = UIUtils.createLabelText(
        Collection<String> queryTypes = Arrays.asList(
            GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
        }
                {
                store.getBoolean(QMConstants.PROP_STORE_LOG_FILE));

        checkQueryTypeDDL.setSelection(queryTypes.contains(DBCExecutionPurpose.META_DDL.name()));
    protected Control createPreferenceContent(@NotNull Composite parent) {
        Integer entriesPerPage = UIUtils.getTextInteger(textEntriesPerPage);
    }

 * PrefPageQueryManager
 *
        if (checkQueryTypeUserFiltered.getSelection()) queryTypes.add(DBCExecutionPurpose.USER_FILTERED.name());
            composite,
        return composite;
        setSettings();
                viewSettings,
 *

 */
    }
import org.jkiss.dbeaver.model.qm.QMObjectType;
    private Button checkQueryTypeScript;
                2,
                CoreMessages.pref_page_query_manager_group_settings,

        checkQueryTypeScript.setSelection(queryTypes.contains(DBCExecutionPurpose.USER_SCRIPT.name()));
    private Button checkObjectTypeQueries;
    private Button checkQueryTypeUserFiltered;

                    UIUtils.enableWithChildren(textHistoryDays, checkStoreLog.getSelection());
    private void checkObjectTypes(Collection<QMObjectType> objectTypes) {
        store.setValue(QMConstants.PROP_OBJECT_TYPES, QMObjectType.toString(objectTypes));
        checkQueryTypes(queryTypes);
import java.util.ArrayList;
import java.util.List;
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        checkStoreLog.setSelection(store.getDefaultBoolean(QMConstants.PROP_STORE_LOG_FILE));
        checkQueryTypeUtil.setSelection(queryTypes.contains(DBCExecutionPurpose.UTIL.name()));
        }
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
    private Button checkQueryTypeDDL;
    }
                new GridData(50, SWT.DEFAULT));

                CoreMessages.pref_page_query_manager_label_days_to_store_log,
            qmStorePath = GeneralUtils.getMetadataFolder().toAbsolutePath().toString();
    private String getQMLogStorePath(@NotNull DBPPreferenceStore store) {
import org.eclipse.swt.widgets.Text;
 */
    }
                composite,
        if (checkObjectTypeSessions.getSelection()) objectTypes.add(QMObjectType.session);
            textEntriesPerPage = UIUtils.createLabelText(
        checkQueryTypeMeta = UIUtils.createCheckbox(groupQueryTypes, CoreMessages.pref_page_query_manager_checkbox_metadata_read, false);
        UIUtils.enableWithChildren(textHistoryDays, checkStoreLog.getSelection());
        store.setValue(QMConstants.PROP_LOG_DIRECTORY, textOutputFolder.getText());
 * See the License for the specific language governing permissions and

            CoreMessages.pref_page_query_manager_group_query_types,
        checkObjectTypes(objectTypes);
 * you may not use this file except in compliance with the License.
        checkQueryTypeScript = UIUtils.createCheckbox(groupQueryTypes, CoreMessages.pref_page_query_manager_checkbox_user_scripts, false);



import org.eclipse.core.runtime.IAdaptable;
        if (checkQueryTypeUser.getSelection()) queryTypes.add(DBCExecutionPurpose.USER.name());
    {
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
                SWT.BORDER,
        if (checkObjectTypeTxn.getSelection()) objectTypes.add(QMObjectType.txn);
    private void checkQueryTypes(Collection<String> queryTypes) {
        checkObjectTypeQueries.setSelection(objectTypes.contains(QMObjectType.query));
            Composite viewSettings = UIUtils.createTitledComposite(
        store.setValue(QMConstants.PROP_QUERY_TYPES, CommonUtils.makeString(queryTypes, ','));
