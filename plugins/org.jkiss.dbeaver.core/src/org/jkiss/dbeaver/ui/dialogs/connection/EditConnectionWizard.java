        return dataSource.getRegistry();
        });
    }
            if (!CommonUtils.isEmpty(dataSource.getLockPasswordHash())) {

    @Override
            ) {
        addPreferencePage(new PrefPageMetaData(), CoreMessages.dialog_connection_edit_wizard_metadata,  CoreMessages.dialog_connection_edit_wizard_metadata_description);
        Map<String, String> currentLibs = getLibsIdVersion(dsChangedSource);
    private static final Log log = Log.getLog(EditConnectionWizard.class);
        if (selectedSharedCredentials != null) {
            dataSource.getDriver().getProviderDescriptor(),
    }
                try {
    /**

        Map<String, String> libs = new HashMap<>();
        WizardPrefPage thisWizardPage = null;
            if (!CommonUtils.isEmpty(userPassword)) {
            }
        for (IWizardPage page : getPages()) {
        return dataSource;
        this.originalDriverLibsIdVersion = getLibsIdVersion(dataSource);
     * the wizard. We will create an operation and run it
    public void addPages() {
                final IDialogPage[] subPages = ((IDialogPageProvider) page).getDialogPages(false, true);
                parent.addSubPage(page.getId(), pageInstance);
        }
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2026 DBeaver Corp and others
        dsChanged.getConnectionConfiguration().setUserPassword(null);
//        if (!embedded) {
     * Adding the page to the wizard.
        return dsCopy.equalSettings(dsChanged);
            page = ((WizardPrefPage) page).getPreferencePage();
        try {
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.eclipse.jface.viewers.IStructuredSelection;

/*

    private ConnectionPageInitialization pageInit;
        if (!this.dataSource.isSavePassword()) {
        }
//            pageNetwork = new ConnectionPageNetwork(this);
import org.jkiss.code.NotNull;
        return originalDriverLibsIdVersion.equals(currentLibs);
    @Override
            }
     * We will accept the selection in the workbench to see if
        return dataSource;
import org.jkiss.dbeaver.ui.preferences.PrefPageMetaData;
            addDataSourcePage(null, page);
                }
    @Nullable
    @Override
        if (pageSettings != null) {
                ));


    public boolean performFinish() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.preferences.WizardPrefPage;
                        return PersistResult.ERROR;
    @NotNull
    @NotNull
            dsCopy.dispose();
        }
                    final String hexString = CommonUtils.toHexString(md5hash).toLowerCase(Locale.ENGLISH).trim();
        DataSourceDescriptor dsChanged = dataSource.getRegistry().createDataSource(dataSource);
    private boolean isDriverLibsVersionsSame(@NotNull DataSourceDescriptor dsChangedSource) {
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceHandler;
    @Override
            }
            return PersistResult.CHANGED;
 *
        }
        if (dialog.open() == IDialogConstants.OK_ID) {
     */
import org.jkiss.dbeaver.runtime.DBWorkbench;
        dsChanged.setId(dataSource.getId());
import java.util.Map;
    @NotNull
        return null;
        } finally {
    private final DataSourceDescriptor originalDataSource;
            }
    private void addDataSourcePage(WizardPrefPage parent, DataSourcePageDescriptor page) {
    }
            return;
import org.jkiss.dbeaver.Log;
        return super.performCancel();

import org.eclipse.ui.IWorkbenchPropertyPage;
 */
        return dataSource.getDriver();
    public DBPDriver getSelectedDriver() {

            selectedSharedCredentials.setValue(originalDataSource.saveToSecret());
import org.jkiss.dbeaver.model.app.DBPProject;
        }
        }
            wpp.setElement(dataSource);
        }
                }
            return;
        for (WizardPrefPage wpp : getPrefPages()) {

        }
        if (dataSource.getDriver().isNotAvailable()) {
        setWindowTitle(CoreMessages.dialog_connection_wizard_title);


            // Check locked datasources
            }
import org.jkiss.dbeaver.registry.DataSourceViewDescriptor;
    private ConnectionPageSettings pageSettings;
                    if (hexString.equals(dataSource.getLockPasswordHash())) {
        // Reset password if "Save password" was disabled
                    null,
 */
        return dataSource.getRegistry().getProject();
            pageInstance = page.createPage();
        pageGeneral.saveSettings(dataSource);
    }
 * Unless required by applicable law or agreed to in writing, software
            }
    /**
        }
     * This method is called when 'Finish' button is pressed in
        }
    public void dispose() {
    public IWizardPage getPage(String name) {
                CoreMessages.dialog_connection_edit_wizard_transactions_description
    private ConnectionPageGeneral pageGeneral;

    @Override
            log.error("Error instantiating connection preference page '" + page.getId() + "'", e);

import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
import org.jkiss.dbeaver.registry.DataSourcePageDescriptor;
    }
                    for (IDialogPage subPage : subPages) {
        dsCopy.setId(originalDataSource.getId());
    @NotNull
                for (IDialogPage dp : subPages) {

            String pageName = page.getName();
                        }
        DBSSecretValue selectedSharedCredentials = dataSource.getSelectedSharedCredentials();
 *
    private final DataSourceDescriptor dataSource;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.UIUtils;
    public boolean performCancel() {
}        pageInit.saveSettings(dataSource);
import java.util.Locale;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (!dataSource.isSavePassword()) {
                CoreMessages.dialog_connection_edit_wizard_transactions,
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;

        addPropertyChangeListener(event -> {
        }
            IActionConstants.EDIT_CONNECTION_POINT);
    @Override

    @Override
            this.dataSource.resetPassword();
                return page;
        addPage(pageGeneral);
        }
        pageInit = new ConnectionPageInitialization(dataSource);


        }

import org.eclipse.jface.wizard.IWizardPage;
     */
                    }
import org.eclipse.jface.dialogs.Dialog;
    }
    @Override
        if (dataSource.getDriver().isNotAvailable()) {
            pageSettings.addSubPage(createPreferencePage(
        this.dataSource.setId(dataSource.getId());
            for (DataSourcePageDescriptor childPage : DataSourceViewRegistry.getInstance().getChildDataSourcePages(dataSource, page.getId())) {
     */
            ));
        if (page instanceof WizardPrefPage) {
    @NotNull
        for (DataSourcePageDescriptor page : DataSourceViewRegistry.getInstance().getRootDataSourcePages(dataSource)) {
        pageGeneral = new ConnectionPageGeneral(this, dataSource);
            pageSettings.addSubPage(pageInternalParameters);
                DataSourceHandler.reconnectDataSource(null, originalDataSource);
                    UIUtils.showMessageBox(getShell(), CoreMessages.dialog_connection_edit_wizard_bad_pwd_title, CoreMessages.dialog_connection_edit_wizard_bad_pwd_msg, SWT.ICON_ERROR);
            saveSettings(dsChanged);
    }
    }
    public DBPDataSourceRegistry getDataSourceRegistry() {
                NLS.bind(CoreMessages.dialog_connection_edit_wizard_conn_change_question,
        // Save
                ((Dialog) getContainer()).close();

     * Constructor for SampleNewWizard.
            } else {
        if (parent != null) {
                    }
        }
    }
import org.jkiss.dbeaver.ui.IDialogPageProvider;
        super.dispose();
        }
                // No changes

            return;
        }
            if (ConnectionPageAbstract.PROP_DRIVER_SUBSTITUTION.equals(event.getProperty())) {

    DBPProject getSelectedProject() {
        DataSourceViewDescriptor view = DataSourceViewRegistry.getInstance().findView(
        pageInternalParameters = new ConnectionPageInternalParameters(dataSource);
                        if (subPage instanceof IWizardPage && ((IWizardPage) subPage).getName().equals(name)) {
    }
import org.jkiss.code.Nullable;
import org.eclipse.jface.dialogs.IDialogPage;
                    wizard -> wizard.setDriverSubstitution((DBPDriverSubstitutionDescriptor) event.getNewValue())

            dataSource.resetPassword();
import org.eclipse.swt.SWT;
            if (page instanceof IDialogPageProvider) {
        }
        addPreferencePage(new PrefPageErrorHandle(), CoreMessages.pref_page_error_handle_name,  CoreMessages.pref_page_error_handle_description);
 * you may not use this file except in compliance with the License.
    @Override

    }
    }
            pageSettings = new ConnectionPageSettings(this, view, getDriverSubstitution());
                libs.put(lib.getId(), lib.getVersion());
        return libs;
    @NotNull
    @Override

import org.eclipse.jface.dialogs.IDialogConstants;
    }
                    final byte[] md5hash = MessageDigest.getInstance("MD5").digest(userPassword.getBytes(GeneralUtils.DEFAULT_ENCODING));
    private final Map<String, String> originalDriverLibsIdVersion;

    /**
                UIUtils.asyncExec(() -> EditConnectionDialog.openEditConnectionDialog(
                thisWizardPage = parent.addSubPage(pageInstance, page.getTitle(), page.getDescription());
            pageSettings.addSubPage(pageInit);
        return false;
        } else if (page instanceof IDialogPageProvider) {
            if (pageName.equals(name)) {
        dsChanged.getConnectionConfiguration().setUserName(null);
    public ConnectionPageSettings getPageSettings() {
    private ConnectionPageInternalParameters pageInternalParameters;
        // Set selected shared creds (creds may be resolved during auth model interactions)
            pageSettings.saveSettings(dataSource);
            addPage(new ConnectionPageDeprecation(dataSource.getDriver()));
            }
    }
                if (subPages != null) {
import org.jkiss.dbeaver.core.CoreMessages;
import org.jkiss.dbeaver.model.secret.DBSSecretValue;
            if (dsCopy.equalSettings(dsChanged) && isDriverLibsVersionsSame(dsChanged)) {
                    UIUtils.getActiveWorkbenchWindow(),
        } else {
    public void init(IWorkbench workbench, IStructuredSelection selection) {
                            return (IWizardPage) subPage;
 * Edit connection dialog
    @Override
            if (pageInstance instanceof IWizardPage) {
import org.eclipse.core.runtime.IAdaptable;
    public DataSourceDescriptor getActiveDataSource() {
            }
            }
        if (view != null) {
import org.eclipse.jface.preference.IPreferencePage;
     * using wizard as execution context.
                for (IDialogPage dp : subPages) {
                if (!isOnlyUserCredentialChanged(dsCopy, dsChanged)) {
    private boolean checkLockPassword() {
                        return true;
                }
    }


        for (DBPDriverLibrary lib : dataSource.getDriver().getDriverLibraries()) {


    }
    protected PersistResult persistDataSource() {
            originalDataSource.setSelectedSharedCredentials(selectedSharedCredentials);
                    if (!checkLockPassword()) {
        this.dataSource.dispose();
        pageInternalParameters.saveSettings(dataSource);
    @Override
 * DBeaver - Universal Database Manager
import org.eclipse.ui.IWorkbench;
        DBPDataSourceRegistry registry = originalDataSource.getRegistry();
        }

            if (page.getTitle() != null) {

            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (isPageActive(pageSettings)) {
 * limitations under the License.
            WizardPrefPage[] subPages = ((WizardPrefPage)page).getDialogPages(false, true);
        super.savePrefPageSettings();
        BaseAuthDialog dialog = new BaseAuthDialog(getShell(), CoreMessages.dialog_connection_edit_wizard_lock_pwd_title, true, false);
     * we can initialize from it.
                }
    /**
import org.jkiss.dbeaver.ui.preferences.PrefPageErrorHandle;
        } catch (Exception e) {
                addPage((IWizardPage) pageInstance);
            if (subPages != null) {
    //private ConnectionPageNetwork pageNetwork;
        } else {
        PersistResult result = persistDataSource();
//        }
            dsChanged.dispose();


        if (page instanceof IWorkbenchPropertyPage wpp) {
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
        if (result == PersistResult.CHANGED && originalDataSource.isConnected()) {
import org.jkiss.dbeaver.ui.IActionConstants;
    }
import org.eclipse.osgi.util.NLS;
            if (!lib.isDisabled()) {
                    setPageDataSourceElement(dataSource, dp);
            if (UIUtils.confirmAction(getShell(), CoreMessages.dialog_connection_edit_wizard_conn_change_title,
        setDriverSubstitution(dataSource.getDriverSubstitution());
            }
        dsCopy.getConnectionConfiguration().setUserName(null);
                return PersistResult.UNCHANGED;
            IDialogPage[] subPages = ((IDialogPageProvider)page).getDialogPages(false, true);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 *
        // Dispose temp datasource
        }

            setPageDataSourceElement(dataSource, wpp);
            final String userPassword = dialog.getUserPassword();
        IPreferencePage pageInstance;
            addPage(pageSettings);
    @Override
    private static Map<String, String> getLibsIdVersion(@NotNull DataSourceDescriptor dataSource) {
                originalDataSource.getName()) )
        dsCopy.getConnectionConfiguration().setUserPassword(null);

                new PrefPageTransactions(),



import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
        return this.pageSettings;

        saveSettings(originalDataSource);
            if (subPages != null) {
                    }
        this.dataSource = dataSource.getRegistry().createDataSource(dataSource);
        if (thisWizardPage != null) {
    @Override
                    setPageDataSourceElement(dataSource, dp);
public class EditConnectionWizard extends ConnectionWizard {
    }
            }
        }
        }
            } else {
/**
                    getOriginalDataSource(),
            return PersistResult.UNCHANGED;
import org.jkiss.dbeaver.utils.GeneralUtils;
    public DataSourceDescriptor getOriginalDataSource() {
package org.jkiss.dbeaver.ui.dialogs.connection;

import java.util.HashMap;
    DBNBrowseSettings getSelectedNavigatorSettings() {
import org.jkiss.dbeaver.registry.DataSourceViewRegistry;
import java.security.MessageDigest;
    protected IAdaptable getActiveElement() {
                } catch (Throwable e) {
    @NotNull

        DataSourceDescriptor dsCopy = registry.createDataSource(originalDataSource);
                }
    @Nullable
import org.jkiss.dbeaver.ui.preferences.PrefPageTransactions;
    }
            return PersistResult.ERROR;
        }
    }
    @Override
    }
 * See the License for the specific language governing permissions and
    }
    protected void saveSettings(DataSourceDescriptor dataSource) {
        return dataSource.getNavigatorSettings();
    private void setPageDataSourceElement(DataSourceDescriptor dataSource, IDialogPage page) {
import org.jkiss.dbeaver.ui.dialogs.BaseAuthDialog;
            setPageDataSourceElement(dataSource, page);
    private boolean isOnlyUserCredentialChanged(DataSourceDescriptor dsCopy, DataSourceDescriptor dsChanged) {
                thisWizardPage = addPreferencePage(pageInstance, page.getTitle(), page.getDescription());
        return originalDataSource;
        if (originalDataSource.persistConfiguration()) {
        if (dataSource.getDriver().isNotAvailable()) {
                    DBWorkbench.getPlatformUI().showError(CoreMessages.dialog_connection_edit_wizard_error_md5_title, CoreMessages.dialog_connection_edit_wizard_error_md5_msg, e);
        try {


import org.jkiss.dbeaver.registry.DataSourceDescriptor;


    public EditConnectionWizard(@NotNull DataSourceDescriptor dataSource) {
        this.originalDataSource = dataSource;
            }
     */

        for (IDialogPage page : getPages()) {
        return result != PersistResult.ERROR;
                addDataSourcePage(thisWizardPage, childPage);
