 * PrefPageDrivers
                {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        store.setValue(ModelPreferences.UI_DRIVERS_HOME, customDriversHome.getText());
            sourceList.add(source);
            );
        }
        store.setValue(ModelPreferences.UI_PROXY_PORT, proxyPortSpinner.getSelection());
 * limitations under the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            proxyHostText = UIUtils.createLabelText(
            customDriversHome.setText(store.getString(ModelPreferences.UI_DRIVERS_HOME));
import org.eclipse.ui.IWorkbenchPropertyPage;
            final ToolItem removeButton = UIUtils.createToolItem(toolbar, UIConnectionMessages.pref_page_drivers_button_remove, UIIcon.DELETE, new SelectionAdapter() {
        } catch (DBException e) {
        }
 *
    @Override
        for (String source : DriverDescriptor.getDriversSources()) {
import java.util.StringJoiner;
                    sourceList.remove(index);
            for (String item : sourceList.getItems()) {
        sourceList.removeAll();
        proxyPasswordText.setText("");
                        removeButton.setEnabled(sourceList.getItemCount() > 1);

    public void setElement(IAdaptable element)
    @Override
/*
            proxyPasswordText.setText(CommonUtils.notEmpty(credentials.getUserPassword()));
        }
            UIUtils.createToolItem(toolbar, UIConnectionMessages.pref_page_drivers_button_add, UIIcon.ADD, new SelectionAdapter() {
 * Copyright (C) 2010-2026 DBeaver Corp and others

import org.jkiss.utils.CommonUtils;
                public void widgetSelected(SelectionEvent e)


            );
            );
import org.jkiss.dbeaver.DBException;
        PrefUtils.savePreferenceStore(store);
            DBWorkbench.getPlatformUI().showError("Unable to save proxy credentials", e.getMessage(), e);
                }
        }
            });
            Composite repoGroup = UIUtils.createTitledComposite(
                settings,
        for (String source : DriverDescriptor.getDriversSources()) {
        proxyHostText.setText(store.getDefaultString(ModelPreferences.UI_PROXY_HOST));
                store.getBoolean(ModelPreferences.UI_DRIVERS_VERSION_UPDATE), 1
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
                @Override
                GridData.FILL_HORIZONTAL,
                null);
                sources.add(item);

    @Override
        return super.performOk();
            removeButton.setEnabled(false);
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
import org.eclipse.ui.IWorkbench;
                65535);
            });
        sourceList.removeAll();
            proxyUserText.setText(CommonUtils.notEmpty(credentials.getUserName()));
        versionUpdateCheck.setSelection(store.getDefaultBoolean(ModelPreferences.UI_DRIVERS_VERSION_UPDATE));
import org.eclipse.core.runtime.IAdaptable;
                UIConnectionMessages.pref_page_ui_general_label_proxy_user,
                300
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    private Spinner proxyPortSpinner;
                proxyObjects,
                0,

    @Override
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    {

                @Override
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    @Override
                300
                composite,

import org.jkiss.dbeaver.ui.UIUtils;
                UIConnectionMessages.pref_page_drivers_group_file_repositories,
            versionUpdateCheck = UIUtils.createCheckbox(
            });
                300
import org.eclipse.swt.events.SelectionAdapter;
        try {

package org.jkiss.dbeaver.ui.preferences;
                public void widgetSelected(SelectionEvent e)
                    }
                {
                public void widgetSelected(SelectionEvent e)
        if (credentials != null) {
                    sourceList.select(CommonUtils.clamp(index, 0, sourceList.getItemCount() - 1));

import org.jkiss.code.NotNull;

            final StringJoiner sources = new StringJoiner("|");
            return false;
                UIConnectionMessages.pref_page_ui_general_group_http_proxy,
                    String url = EnterNameDialog.chooseName(getShell(), UIConnectionMessages.pref_page_drivers_label_enter_drivers_location_url, "http://");
        super.performDefaults();
 * See the License for the specific language governing permissions and

 *
                GridData.FILL_HORIZONTAL,
            proxyPasswordText = UIUtils.createLabelText(proxyObjects, UIConnectionMessages.pref_page_ui_general_label_proxy_password, null, SWT.PASSWORD | SWT.BORDER); //$NON-NLS-2$
        store.setValue(ModelPreferences.UI_DRIVERS_VERSION_UPDATE, versionUpdateCheck.getSelection());
    public IAdaptable getElement()
                store.getInt(ModelPreferences.UI_PROXY_PORT),
                }
        proxyPortSpinner.setSelection(store.getDefaultInt(ModelPreferences.UI_PROXY_PORT));
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
        proxyUserText.setText(store.getDefaultString(ModelPreferences.UI_PROXY_USER));
            sourceList = new List(repoGroup, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
                    final int index = sourceList.getSelectionIndex();
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING,
    @Override
        return composite;

                300
                        removeButton.setEnabled(false);
 * you may not use this file except in compliance with the License.
    private Text proxyPasswordText;

        {

}                proxyObjects,
        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);
            sourceList.add(source);
            proxyUserText = UIUtils.createLabelText(
                store.getString(ModelPreferences.UI_PROXY_HOST));
import org.jkiss.dbeaver.runtime.net.GlobalProxyAuthenticator;
import org.eclipse.swt.SWT;
    @NotNull
            GlobalProxyAuthenticator.saveCredentials(proxyUserText.getText(), proxyPasswordText.getText());
    private Button versionUpdateCheck;
            );
                proxyObjects,
            final ToolBar toolbar = new ToolBar(repoGroup, SWT.VERTICAL);
        {

 *

    public boolean performOk() {
 */

                UIConnectionMessages.pref_page_ui_general_spinner_proxy_port,
    {

 * DBeaver - Universal Database Manager


                composite,
                    sourceList.notifyListeners(SWT.Selection, new Event());
                    } else {
        try {
        }
                GridData.FILL_HORIZONTAL,
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            Composite drivers = UIUtils.createTitledComposite(

                    }
                4,
    protected Control createPreferenceContent(@NotNull Composite parent) {
import org.eclipse.ui.IWorkbenchPreferencePage;
            );
import org.jkiss.dbeaver.Log;

    public void init(IWorkbench workbench) {
            tip.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, GridData.VERTICAL_ALIGN_BEGINNING, false, false, 2, 1));
                2,
                @Override
            store.setValue(ModelPreferences.UI_DRIVERS_SOURCES, sources.toString());
                {
                UIConnectionMessages.pref_page_ui_general_check_new_driver_versions_tip,

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    private static final Log log = Log.getLog(PrefPageDrivers.class);
        // nothing to initialize
            credentials = GlobalProxyAuthenticator.readCredentials();

                UIConnectionMessages.pref_page_ui_general_label_proxy_host,
                UIConnectionMessages.pref_page_drivers_group_location,
    private Text customDriversHome;
    }

import org.jkiss.dbeaver.ui.UIIcon;
            toolbar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
        } catch (DBException e) {
/**
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.utils.PrefUtils;
    }
                UIConnectionMessages.pref_page_ui_general_group_settings,
    private Text proxyHostText;

            Composite proxyObjects = UIUtils.createTitledComposite(
    private List sourceList;
            Control tip = UIUtils.createInfoLabel(repoGroup, UIConnectionMessages.pref_page_drivers_repo_info);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                        sourceList.add(url);
            Composite settings = UIUtils.createTitledComposite(
 * Unless required by applicable law or agreed to in writing, software

                }
        return null;
    private Text proxyUserText;
        DBPAuthInfo credentials = null;
        }

            sourceList.addSelectionListener(new SelectionAdapter() {
                2,
                UIConnectionMessages.pref_page_ui_general_check_new_driver_versions,
        }
        }
                2,
    protected void performDefaults() {
import org.eclipse.swt.layout.GridData;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.SelectionEvent;
import org.jkiss.dbeaver.ModelPreferences;
 */
            log.error("Error reading proxy credentials", e);
    }

        }
import org.eclipse.swt.widgets.*;
                composite,
                composite,
            sourceList.setLayoutData(new GridData(GridData.FILL_BOTH));
        customDriversHome.setText(store.getDefaultString(ModelPreferences.UI_DRIVERS_HOME));
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.drivers"; //$NON-NLS-1$
        store.setValue(ModelPreferences.UI_PROXY_HOST, proxyHostText.getText());
public class PrefPageDrivers extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
    }
        {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        }
            customDriversHome = DialogUtils.createOutputFolderChooser(drivers, UIConnectionMessages.pref_page_drivers_local_folder, null, null, null, false, null);
                    if (url != null) {
    }
        {
            proxyPortSpinner = UIUtils.createLabelSpinner(
                    if (sourceList.getSelectionIndex() >= 0) {
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;

