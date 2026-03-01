                store.getBoolean(DBeaverPreferences.UI_KEEP_DATABASE_EDITORS));
    protected Control createPreferenceContent(@NotNull Composite parent) {
    public void setElement(IAdaptable element)

                CoreMessages.pref_page_database_general_label_sync_editor_connection_with_navigator,
        disconnectOnEditorsClose.setSelection(store.getDefaultBoolean(DBeaverPreferences.UI_DISCONNECT_ON_EDITORS_CLOSE));
            keepEditorsOnRestart = UIUtils.createCheckbox(
                store.getBoolean(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE),
    {

    public void init(IWorkbench workbench)
    @NotNull
    public PrefPageDatabaseEditors()

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    }
 *

    @Override
        keepEditorsOnDisconnect.setSelection(store.getDefaultBoolean(DBeaverPreferences.UI_KEEP_DATABASE_EDITORS_ON_DISCONNECT));
            );
/*
    @Override
                store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_SQL_PREVIEW));
                CoreMessages.pref_page_database_general_label_sync_editor_connection_with_navigator_tip,
        return composite;

    private Button showPreviewOnSave;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                composite,
import org.jkiss.dbeaver.ui.UIUtils;

            refreshEditorOnOpen = UIUtils.createCheckbox(
    }
        PrefUtils.savePreferenceStore(store);
    }
 */

                groupEditors,
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.core.CoreMessages;
/**
            Composite groupEditors = UIUtils.createTitledComposite(

            );

                groupEditors,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_SQL_PREVIEW, showPreviewOnSave.getSelection());
import org.jkiss.code.Nullable;

    {
        {
import org.jkiss.dbeaver.DBeaverPreferences;
                GridData.VERTICAL_ALIGN_BEGINNING
    @Override
    private Button syncEditorDataSourceWithNavigator;

                store.getBoolean(DBeaverPreferences.UI_KEEP_DATABASE_EDITORS_ON_DISCONNECT),
 * PrefPageDatabaseEditors
    public void applyData(Object data)
 * limitations under the License.
    }
    private Button keepEditorsOnRestart;

            disconnectOnEditorsClose = UIUtils.createCheckbox(
import org.jkiss.dbeaver.utils.PrefUtils;
    @Nullable
            keepEditorsOnRestart.setToolTipText(CoreMessages.pref_page_ui_general_keep_database_editors_tip);
    private Button keepEditorsOnDisconnect;
                1,
    {
package org.jkiss.dbeaver.ui.preferences;
import org.eclipse.ui.IWorkbenchPreferencePage;
        editorFullName.setSelection(store.getDefaultBoolean(DBeaverPreferences.NAVIGATOR_EDITOR_FULL_NAME));
 * See the License for the specific language governing permissions and
            editorFullName = UIUtils.createCheckbox(
                store.getBoolean(DBeaverPreferences.UI_DISCONNECT_ON_EDITORS_CLOSE),
    public boolean performOk()
    }
    private Button editorFullName;
                CoreMessages.pref_page_ui_general_keep_database_editors,
        store.setValue(DBeaverPreferences.UI_KEEP_DATABASE_EDITORS_ON_DISCONNECT, keepEditorsOnDisconnect.getSelection());
                2);
                CoreMessages.pref_page_ui_general_show_full_name_in_editor,
public class PrefPageDatabaseEditors extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage
        syncEditorDataSourceWithNavigator.setSelection(store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE));
{
            showPreviewOnSave = UIUtils.createCheckbox(
        return null;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.editors"; //$NON-NLS-1$
            keepEditorsOnDisconnect = UIUtils.createCheckbox(
    private Button refreshEditorOnOpen;
                groupEditors,
                CoreMessages.pref_page_ui_general_show_preview_on_save,
    {
    @Override
    protected void performDefaults() {
import org.eclipse.ui.IWorkbench;
                CoreMessages.pref_page_ui_general_disconnect_on_editors_close_tip,
        super.applyData(data);
 * DBeaver - Universal Database Manager
            );
                1
    public IAdaptable getElement()
                1
        }
                CoreMessages.pref_page_ui_general_refresh_editor_on_open,
                store.getBoolean(NavigatorPreferences.NAVIGATOR_REFRESH_EDITORS_ON_OPEN));
        store.setValue(DBeaverPreferences.UI_KEEP_DATABASE_EDITORS, keepEditorsOnRestart.getSelection());
        Composite composite = UIUtils.createComposite(parent, 1);
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software

 * Licensed under the Apache License, Version 2.0 (the "License");
    }

                groupEditors,
                CoreMessages.pref_page_ui_general_keep_database_editors_on_disconnect,
import org.eclipse.core.runtime.IAdaptable;
                store.getBoolean(DBeaverPreferences.NAVIGATOR_EDITOR_FULL_NAME));

import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
import org.eclipse.ui.IWorkbenchPropertyPage;
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
                groupEditors,
        refreshEditorOnOpen.setSelection(store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_REFRESH_EDITORS_ON_OPEN));
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        return true;
}        store.setValue(DBeaverPreferences.NAVIGATOR_EDITOR_FULL_NAME, editorFullName.getSelection());

                groupEditors,

        showPreviewOnSave.setSelection(store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_SQL_PREVIEW));
            refreshEditorOnOpen.setToolTipText(CoreMessages.pref_page_ui_general_refresh_editor_on_open_tip);
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
        store.setValue(DBeaverPreferences.UI_DISCONNECT_ON_EDITORS_CLOSE, disconnectOnEditorsClose.getSelection());
    }
import org.eclipse.swt.widgets.Composite;
            syncEditorDataSourceWithNavigator = UIUtils.createCheckbox(
    }
import org.eclipse.swt.layout.GridData;
        store.setValue(NavigatorPreferences.NAVIGATOR_SYNC_EDITOR_DATASOURCE, syncEditorDataSourceWithNavigator.getSelection());

 */
                groupEditors,
                CoreMessages.pref_page_ui_general_disconnect_on_editors_close,
                CoreMessages.pref_page_ui_general_group_editors,


        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.eclipse.swt.widgets.Button;
    @Override
        keepEditorsOnRestart.setSelection(store.getDefaultBoolean(DBeaverPreferences.UI_KEEP_DATABASE_EDITORS));
    private Button disconnectOnEditorsClose;

        super();
                CoreMessages.pref_page_ui_general_keep_database_editors_on_disconnect_tip,
    {

 * you may not use this file except in compliance with the License.

        store.setValue(NavigatorPreferences.NAVIGATOR_REFRESH_EDITORS_ON_OPEN, refreshEditorOnOpen.getSelection());
    {
import org.eclipse.swt.widgets.Control;
 * distributed under the License is distributed on an "AS IS" BASIS,

