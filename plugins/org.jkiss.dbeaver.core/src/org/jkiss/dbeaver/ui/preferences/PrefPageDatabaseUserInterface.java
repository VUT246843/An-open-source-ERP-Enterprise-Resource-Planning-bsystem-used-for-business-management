import org.jkiss.code.Nullable;
        );
            store.setValue(DBeaverPreferences.UI_STATUS_BAR_SHOW_BREADCRUMBS, breadcrumbLocation.name());
 * distributed under the License is distributed on an "AS IS" BASIS,
                1

import org.eclipse.swt.events.SelectionEvent;
            }
import org.eclipse.jface.fieldassist.ComboContentAdapter;
            store.setValue(UIPreferences.UI_USE_EMBEDDED_AUTH, useEmbeddedBrowserAuth.getSelection());
        statusBarBreadcrumbPositionCombo.select(breadcrumbLocation == DatabaseEditorPreferences.BreadcrumbLocation.IN_EDITORS ? 1 : 0);
        if (isStandalone) {
                }
            GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING
import org.jkiss.dbeaver.DBException;
                        ZoneId.of(TimezoneRegistry.extractTimezoneId(clientTimezone.getText())), true);
                PlatformLanguageDescriptor lang = languages.get(i);
                tipLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING,
        setSettings();
                false,
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
                automaticUpdateCheck.setSelection(store.getDefaultBoolean(DBeaverPreferences.UI_AUTO_UPDATE_CHECK));
            IContentProposalProvider proposalProvider = (contents, position) -> {
            if (DBConstants.DEFAULT_TIMEZONE.equals(timezone)) {

                browserCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                2,
        );
                ));
            if (workspaceLanguage.getSelectionIndex() < 0) {
    }
                    @Override
            ContentAssistUtils.installContentProposal(clientTimezone, new ComboContentAdapter(), proposalProvider);
            }
                }
 *
 * See the License for the specific language governing permissions and
            tipLabelRestart.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING,
                SWT.READ_ONLY | SWT.DROP_DOWN
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                        }
        statusBarBreadcrumbPositionCombo = new Combo(breadcrumbs, SWT.READ_ONLY | SWT.DROP_DOWN);
    }
            if (!statusBarShowBreadcrumbsCheck.getSelection()) {

            }
            ));
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    SWT.READ_ONLY
import org.jkiss.code.NotNull;
                breadcrumbLocation = DatabaseEditorPreferences.BreadcrumbLocation.HIDDEN;
                        if (UIUtils.confirmAction(
    private Button statusBarShowBreadcrumbsCheck;

import org.eclipse.jface.fieldassist.IContentProposalProvider;
    public void init(IWorkbench workbench)
            Composite regionalSettingsGroup = UIUtils.createTitledComposite(
        }
                    }
                false,
                composite,
import org.eclipse.swt.widgets.Composite;

                            "You need to restart " + GeneralUtils.getProductName()
                workspaceLanguage.add(lang.getLabel());
                }
import org.jkiss.utils.CommonUtils;
                2);

                composite,
            if (isWindowsDesktopClient()) {
            CoreMessages.pref_page_ui_status_bar_show_breadcrumbs_check_label,
        final String timezone = store.getString(ModelPreferences.CLIENT_TIMEZONE);
                CoreMessages.pref_page_ui_general_combo_language_tip,
    private Combo statusBarBreadcrumbPositionCombo;
                browserCombo = UIUtils.createLabelCombo(groupObjects, CoreMessages.pref_page_ui_general_combo_browser,
                    workspaceLanguage.select(i);
import org.eclipse.core.runtime.IAdaptable;
                2,
                CoreMessages.pref_page_ui_general_combo_timezone_tip,
        return null;
                    DBWorkbench.getPlatformUI().showError("Change language", "Can't switch language to " + language, e);
            clientTimezone.add(DBConstants.DEFAULT_TIMEZONE);

    @Override

                    GridData.VERTICAL_ALIGN_BEGINNING, false, false, 2, 1
import org.jkiss.dbeaver.ui.editors.DatabaseEditorPreferences.BreadcrumbLocation;
                workspaceLanguage.select(0);
        statusBarShowStatusCheck.setSelection(store.getDefaultBoolean(DBeaverPreferences.UI_STATUS_BAR_SHOW_STATUS_LINE));
                clientTimezone.setText(timezone);
        return true;
            );
    protected Control createPreferenceContent(@NotNull Composite parent) {
                2,
 * DBeaver - Universal Database Manager
            for (int i = 0; i < languages.size(); i++) {
                }
                List<IContentProposal> proposals = new ArrayList<>();
                2
            DBPPlatformLanguage pLanguage = DBPPlatformDesktop.getInstance().getPlatformLanguage();
            Control tipLabelRestart = UIUtils.createInfoLabel(regionalSettingsGroup,
    private Button automaticUpdateCheck;
import org.eclipse.swt.events.SelectionAdapter;
        statusBarShowBreadcrumbsCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e ->
    {
            BreadcrumbLocation breadcrumbLocation;
            browserCombo.select(SWTBrowserRegistry.getDefaultBrowser().ordinal());
        statusBarShowBreadcrumbsCheck.setSelection(breadcrumbLocation != DatabaseEditorPreferences.BreadcrumbLocation.HIDDEN);
 *
                Control tipLabel =
    {
import org.eclipse.swt.SWT;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main"; //$NON-NLS-1$
                        if (browserCombo.getSelectionIndex() == SWTBrowserRegistry.BrowserSelection.IE.ordinal()) {
                2,
    @Override
            clientTimezone.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                    public void widgetSelected(SelectionEvent e) {
package org.jkiss.dbeaver.ui.preferences;
            useEmbeddedBrowserAuth.setSelection(store.getDefaultBoolean(UIPreferences.UI_USE_EMBEDDED_AUTH));
                            languageManager.setPlatformLanguage(language);
                CoreMessages.pref_page_ui_general_checkbox_automatic_updates,
                        proposals.add(new ContentProposal(item));
        BreadcrumbLocation breadcrumbLocation = DatabaseEditorPreferences.BreadcrumbLocation.get(store);
    private boolean isWindowsDesktopClient() {
                } catch (DBException e) {
        return isStandalone && RuntimeUtils.isWindows();
                false,
    public boolean isValid() {
import java.util.List;
import org.jkiss.dbeaver.DBeaverPreferences;
    @Override
        statusBarShowStatusCheck.setSelection(store.getBoolean(DBeaverPreferences.UI_STATUS_BAR_SHOW_STATUS_LINE));
                            useEmbeddedBrowserAuth.setEnabled(false);
    @Override

import org.jkiss.dbeaver.model.DBConstants;
                    }
                browserCombo.addSelectionListener(new SelectionAdapter() {
            statusBarBreadcrumbPositionCombo.setEnabled(statusBarShowBreadcrumbsCheck.getSelection())));
        if (isStandalone) { 
import org.jkiss.dbeaver.ModelPreferences;

    private final boolean isStandalone = DesktopPlatform.isStandalone();
/*
                    TimezoneRegistry.setDefaultZone(null, true);

            Composite groupObjects = UIUtils.createTitledComposite(
    public void setElement(IAdaptable element)
                if (DBConstants.DEFAULT_TIMEZONE.equals(clientTimezone.getText())) {
 */
        statusBarShowBreadcrumbsCheck = UIUtils.createCheckbox(

/**
                DBPPlatformLanguage curLanguage = DBPPlatformDesktop.getInstance().getPlatformLanguage();
            2
        statusBarBreadcrumbPositionCombo.add(CoreMessages.pref_page_ui_status_bar_show_breadcrumbs_status_bar_label);
        BreadcrumbLocation location = BreadcrumbLocation.getDefault(store);
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                automaticUpdateCheck.setSelection(store.getBoolean(DBeaverPreferences.UI_AUTO_UPDATE_CHECK));

            }
            CoreMessages.pref_page_ui_status_bar_show_breadcrumbs_check_tip,

import org.jkiss.dbeaver.ui.editors.DatabaseEditorPreferences;
            2,
        if (isStandalone) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.registry.language.PlatformLanguageDescriptor;
import org.jkiss.dbeaver.registry.timezone.TimezoneRegistry;
                GridData.VERTICAL_ALIGN_BEGINNING,
                groupObjects,
                CoreMessages.pref_page_ui_general_check_browser_auth_tip,
            }

import org.jkiss.dbeaver.core.ui.services.ApplicationPolicyService;
                            "Restart " + GeneralUtils.getProductName(),
            CoreMessages.pref_page_ui_status_bar_show_status_line_check_tip,
public class PrefPageDatabaseUserInterface extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
import org.jkiss.dbeaver.utils.GeneralUtils;
            if (RuntimeUtils.isWindows()) {
    @Nullable
                CoreMessages.pref_page_ui_general_group_browser,
                SWT.DROP_DOWN
                store.setValue(DBeaverPreferences.UI_AUTO_UPDATE_CHECK, Boolean.FALSE);
        );
    @NotNull
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);


    private Button useEmbeddedBrowserAuth;
                GridData.VERTICAL_ALIGN_BEGINNING
        }
                false,
                PlatformLanguageDescriptor language = PlatformLanguageRegistry.getInstance().getLanguages()
                        )) {
import java.time.ZoneId;
                    browserCombo.add(value.getFullName(), value.ordinal());
    @Override
    private Combo workspaceLanguage;

            ));

 * limitations under the License.
import org.jkiss.dbeaver.utils.PrefUtils;
            if (clientTimezone != null) {

 * PrefPageDatabaseUserInterface
                CoreMessages.pref_page_ui_general_combo_timezone,
    }
import org.eclipse.jface.fieldassist.IContentProposal;
    }
    private void setSettings() {
                CoreMessages.pref_page_ui_general_label_options_take_effect_after_restart
    public boolean performOk()
    private Combo browserCombo;
            useEmbeddedBrowserAuth.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING,
        return composite;
            if (browserCombo != null) {
    private Button statusBarShowStatusCheck;
            workspaceLanguage = UIUtils.createLabelCombo(regionalSettingsGroup,
        return super.isValid();
                for (SWTBrowserRegistry.BrowserSelection value : SWTBrowserRegistry.BrowserSelection.values()) {
            );
        if (clientTimezone != null) {
        if (isStandalone) {
    {
import org.eclipse.swt.layout.GridData;
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
        statusBarBreadcrumbPositionCombo.select(location == BreadcrumbLocation.IN_STATUS_BAR ? 0 : 1);
                GridData.VERTICAL_ALIGN_BEGINNING,
                    if (item.toLowerCase().contains(contents.toLowerCase())) {
            } else {
import org.jkiss.dbeaver.registry.language.PlatformLanguageRegistry;
            } else {
    public PrefPageDatabaseUserInterface()
            PrefUtils.savePreferenceStore(store);
            useEmbeddedBrowserAuth.setEnabled(!SWTBrowserRegistry.getActiveBrowser().equals(SWTBrowserRegistry.BrowserSelection.IE));
            browserCombo.select(SWTBrowserRegistry.getActiveBrowser().ordinal());
        super();

import org.jkiss.dbeaver.registry.SWTBrowserRegistry;

            if (!ApplicationPolicyService.getInstance().isInstallUpdateDisabled()) {
                SWTBrowserRegistry.setActiveBrowser(SWTBrowserRegistry.BrowserSelection.values()[browserCombo.getSelectionIndex()]);
                    .get(workspaceLanguage.getSelectionIndex());
                updateApplyButton();
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
                getContainer().updateButtons();
                try {
import org.jkiss.dbeaver.ui.UIUtils;
        if (isWindowsDesktopClient()) {
    public IAdaptable getElement()
            }
            clientTimezone = UIUtils.createLabelCombo(regionalSettingsGroup,
        }
                GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING

        statusBarShowBreadcrumbsCheck.setSelection(location != BreadcrumbLocation.HIDDEN);
                        }
            useEmbeddedBrowserAuth = UIUtils.createCheckbox(groupObjects,
                false,
                            useEmbeddedBrowserAuth.setEnabled(true);
    }
        statusBarShowStatusCheck = UIUtils.createCheckbox(
                1
                clientTimezone.add(timezoneName);
                store.setValue(DBeaverPreferences.UI_AUTO_UPDATE_CHECK, automaticUpdateCheck.getSelection());
            };

            1
            );
            List<PlatformLanguageDescriptor> languages = PlatformLanguageRegistry.getInstance().getLanguages();
                        if (DBWorkbench.getPlatform() instanceof DBPPlatformLanguageManager languageManager) {
            } else {
            }
                CoreMessages.pref_page_ui_general_group_regional,
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            workspaceLanguage.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            SWTBrowserRegistry.getActiveBrowser();
    }
                    TimezoneRegistry.setDefaultZone(
                CoreMessages.pref_page_ui_general_group_general,
import org.eclipse.ui.IWorkbenchPropertyPage;

            CoreMessages.pref_page_ui_status_bar,
 * Copyright (C) 2010-2026 DBeaver Corp and others
                            useEmbeddedBrowserAuth.setSelection(false);
}
            if (!ApplicationPolicyService.getInstance().isInstallUpdateDisabled()) {
            );
import org.jkiss.dbeaver.core.CoreMessages;
            if (!ApplicationPolicyService.getInstance().isInstallUpdateDisabled()) {
            );
            );

            CoreMessages.pref_page_ui_status_bar_show_status_line_check_label,
    protected void performDefaults() {
 * Unless required by applicable law or agreed to in writing, software
                            getShell(),
                for (String item : clientTimezone.getItems()) {
    }
    @Override
                } else {
            for (String timezoneName : TimezoneRegistry.getTimezoneNames()) {

    {

            }
            store.setValue(DBeaverPreferences.UI_STATUS_BAR_SHOW_STATUS_LINE, statusBarShowStatusCheck.getSelection());
    @Nullable
import org.eclipse.swt.widgets.Combo;
        }

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        if (clientTimezone != null) {
        statusBarBreadcrumbPositionCombo.select(0);

import org.eclipse.ui.IWorkbenchPreferencePage;
            breadcrumbs,
    }

                clientTimezone.setText(DBConstants.DEFAULT_TIMEZONE);
                2,
                breadcrumbLocation = DatabaseEditorPreferences.BreadcrumbLocation.IN_STATUS_BAR;
        }
import org.jkiss.dbeaver.core.DesktopPlatform;
        if (isStandalone && !ApplicationPolicyService.getInstance().isInstallUpdateDisabled()) {

            Composite groupObjects = UIUtils.createTitledComposite(
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
        }
                    if (curLanguage != language) {

                composite,
import org.jkiss.dbeaver.utils.RuntimeUtils;
            UIUtils.setComboSelection(clientTimezone, store.getDefaultString(ModelPreferences.CLIENT_TIMEZONE));
            true,
            clientTimezone.addModifyListener(e -> {
                        }
                            restartWorkbenchOnPrefChange();
            }
        }
            automaticUpdateCheck = UIUtils.createCheckbox(
            true,

    }
                breadcrumbLocation = DatabaseEditorPreferences.BreadcrumbLocation.IN_EDITORS;
    private Combo clientTimezone;
import org.eclipse.ui.IWorkbench;
                CoreMessages.pref_page_ui_general_check_browser_auth,
 */
                false,

                );
        statusBarBreadcrumbPositionCombo.add(CoreMessages.pref_page_ui_status_bar_show_breadcrumbs_editors_label);
            }
            SWTBrowserRegistry.getActiveBrowser();
    }
                    UIUtils.createInfoLabel(groupObjects, CoreMessages.pref_page_ui_general_combo_browser_tip);

                                + " to perform actual language change.\nDo you want to restart?"
import org.jkiss.dbeaver.model.app.DBPPlatformLanguageManager;
        statusBarBreadcrumbPositionCombo.setEnabled(statusBarShowBreadcrumbsCheck.getSelection());
import org.jkiss.dbeaver.model.app.DBPPlatformLanguage;
            } else if (statusBarBreadcrumbPositionCombo.getSelectionIndex() == 0) {
        }
        if (isWindowsDesktopClient()) {
    {
            useEmbeddedBrowserAuth.setSelection(store.getBoolean(UIPreferences.UI_USE_EMBEDDED_AUTH));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
import org.eclipse.swt.widgets.Control;
        }
            }
                null,
            if (workspaceLanguage.getSelectionIndex() >= 0) {
            }
        Composite composite = UIUtils.createPlaceholder(parent, 1, 5);
                if (CommonUtils.equalObjects(pLanguage, lang)) {
                        } else {
                });
                    }
 * you may not use this file except in compliance with the License.
 *
            }
            breadcrumbs,
            composite,

            });
        Composite breadcrumbs = UIUtils.createTitledComposite(

                return proposals.toArray(IContentProposal[]::new);
                CoreMessages.pref_page_ui_general_combo_language,
    @Override
