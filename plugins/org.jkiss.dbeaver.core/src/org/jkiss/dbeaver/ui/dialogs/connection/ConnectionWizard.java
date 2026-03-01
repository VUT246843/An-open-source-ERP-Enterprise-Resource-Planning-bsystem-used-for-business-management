    }
        }
            return;
            final ConnectionTestJob op = new ConnectionTestJob(targetDataSource, session -> {
                    op.getClientVersion(),
        DBPConnectionType type = DBPConnectionType.getDefaultConnectionType();
            );
        if (page instanceof IDialogPageProvider && isPageActive(page)) {
                ((IDataSourceConnectionTester) page).testConnection(session);
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
        propertyListeners.add(listener);
package org.jkiss.dbeaver.ui.dialogs.connection;
        }
                    op.setOwnerMonitor(monitor);
            return NLS.bind( CoreMessages.dialog_connection_edit_title, activeDataSource.getName());
import org.eclipse.jface.util.PropertyChangeEvent;
                    if (op.getConnectStatus() == Status.CANCEL_STATUS) {
 */
        saveSettings(targetDataSource);
import org.jkiss.dbeaver.ui.UIUtils;
        ERROR

                    op.schedule();
 * distributed under the License is distributed on an "AS IS" BASIS,
    abstract DBNBrowseSettings getSelectedNavigatorSettings();
        for (IPropertyChangeListener listener : propertyListeners) {
import org.jkiss.code.Nullable;
    }
                DBWorkbench.getPlatformUI().showError(
                ConfirmationDialog.CONFIRM

    private DBPDriverSubstitutionDescriptor driverSubstitution;

    protected enum PersistResult {
    protected abstract void saveSettings(DataSourceDescriptor dataSource);
 * See the License for the specific language governing permissions and
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
                SeparateConnectionBehavior.NEVER.name()
        try {
    // protected final IProject project;
        config.setCloseIdleConnection(type.isAutoCloseConnections());
    abstract public DBPDataSourceRegistry getDataSourceRegistry();
    }

        DBPConnectionConfiguration config = new DBPConnectionConfiguration();
    public void addPropertyChangeListener(@NotNull IPropertyChangeListener listener) {
    }
                        throw new InvocationTargetException(op.getConnectError());
import org.jkiss.dbeaver.utils.GeneralUtils;
            try {
                for (IWizardPage page : getPages()) {

                    targetDataSource,
            targetDataSource.setTemporary(true);
                    }
                    GeneralUtils.makeExceptionStatus(targetException)
import org.jkiss.dbeaver.model.app.DBPProject;
            if (activeDataSource != targetDataSource) {
                var newUserPassword = targetDataSource.getActualConnectionConfiguration().getUserPassword();
            targetDataSource.getPreferenceStore().setValue(
        if (canUseTemporaryDataSource(activeDataSource)) {
    public boolean openSettingsPage(String pageId) {
                });
    static final String PROP_CONNECTION_TYPE = "connection-type";
import java.util.*;
                new ConnectionTestDialog(
        DataSourceDescriptor activeDataSource = getActiveDataSource();
            }
    }
            infoMap.put(driver, info);
        ConnectionFeatures.CONNECTION_TEST.use(Map.of("driver", targetDataSource.getDriver().getPreconfiguredId()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        return super.getDefaultPageImage();
        }
    public void testConnection() {
    }
            DataSourceDescriptor activeDataSource = getActiveDataSource();

    }
import org.jkiss.dbeaver.model.exec.DBCSession;
                Throwable targetException = ex.getTargetException();
                        throw new InterruptedException("cancel");
            persistDataSource();
        setNeedsProgressMonitor(true);
                targetDataSource.dispose();
        if (info == null && driver != null) {
import org.jkiss.dbeaver.ModelPreferences;

            DBPConnectionConfiguration connectionInfo = getDefaultConnectionConfiguration();

                return;
            if (defaultClientLocation != null) {

        if (registry == null) {
import org.jkiss.dbeaver.runtime.jobs.ConnectionTestJob;
            getContainer().showPage(page);
                            Thread.sleep(50);
    @Override
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
                DBeaverPreferences.CONFIRM_TEST_CONNECTION_PERSIST,
                    op.getServerVersion(),
    public abstract DataSourceDescriptor getOriginalDataSource();
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (Objects.equals(oldValue, newValue)) {
    }

            }
    @Override
    @Override
    @Override
            }
            return CoreMessages.dialog_new_connection_wizard_title;
}
    @Override
        }
    private final List<IPropertyChangeListener> propertyListeners = new ArrayList<>();

import org.eclipse.jface.util.IPropertyChangeListener;
        for (DataSourceDescriptor dataSource : infoMap.values()) {
                        } catch (InterruptedException e) {

        return true;
                            break;
        }
        if (isNew()) {
    @Override
    public void firePropertyChangeEvent(@NotNull String property, @Nullable Object oldValue, @Nullable Object newValue) {
            });
import org.jkiss.utils.ArrayUtils;
            }
/*
        if (targetDataSource.isSharedCredentials()) {
                    getShell(),
    protected DBPConnectionConfiguration getDefaultConnectionConfiguration() {
    @NotNull
import org.eclipse.jface.wizard.IWizardPage;
        }

    public abstract ConnectionPageSettings getPageSettings();
                ConfirmationDialog.WARNING,
                }
        return config;
            info = registry.createDataSource(
        // Dispose all temp data sources
        }
            } catch (InvocationTargetException ex) {
                    CoreMessages.dialog_connection_wizard_start_dialog_error_title,
                getShell(),
            if (decision != IDialogConstants.OK_ID) {
    private static boolean canUseTemporaryDataSource(@NotNull DataSourceDescriptor descriptor) {
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
    public String getWindowTitle() {
        if (page != null) {

                    "Shared credentials edit is available for administrators only.",
    }
        if (activeDataSource == targetDataSource) {
        return info;
                            op.cancel();
                driver,
                    DBWorkbench.getPlatformUI().showError(CoreMessages.dialog_connection_wizard_start_dialog_interrupted_title,
                    testInPage(session, page);
            } catch (InterruptedException ex) {
        UNCHANGED,
                var oldUserPassword = activeDataSource.getActualConnectionConfiguration().getUserPassword();
            }

        this.driverSubstitution = driverSubstitution;
        if (page instanceof IDataSourceConnectionTester) {
        }
            } catch (Throwable ex) {

        getActiveDataSource().setDriverSubstitution(driverSubstitution);
            );
    }
import org.jkiss.dbeaver.ui.IDialogPageProvider;
import org.jkiss.dbeaver.model.connection.*;
        return driverSubstitution;
 * you may not use this file except in compliance with the License.
            if (handler.isEnabled() && handler.getHandlerDescriptor().isDistributed()) {
    abstract DBPDriver getSelectedDriver();
        for (DBWHandlerConfiguration handler : descriptor.getConnectionConfiguration().getHandlers()) {
            if (!targetDataSource.getProject().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_PROJECT_ADMIN)) {
    public boolean isNew() {
import org.jkiss.dbeaver.ui.dialogs.IConnectionWizard;
 * Unless required by applicable law or agreed to in writing, software
    public Image getDefaultPageImage() {

    protected ConnectionWizard() {

            }
        } finally {
        }
                UIUtils.showMessageBox(getShell(), "Use credentials manager",
 *

import org.eclipse.ui.INewWizard;

        final IWizardPage page = getPage(pageId);
                getRunnableContext().run(true, true, monitor -> {
        }
    }
 * Abstract connection wizard
                    GeneralUtils.makeExceptionStatus(ex));
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.core.CoreMessages;
            } else {
    abstract DBPProject getSelectedProject();
import org.jkiss.dbeaver.ui.IDataSourceConnectionTester;
            targetDataSource = activeDataSource;
    @NotNull
            }
                        }
            // Generate new ID to avoid session conflicts in QM
import org.jkiss.dbeaver.model.rm.RMConstants;
        return false;
    }

                }

        DBPDataSourceRegistry registry = getDataSourceRegistry();
                    CoreMessages.dialog_connection_wizard_start_dialog_error_title,
                UIUtils.showMessageBox(getShell(), "Credentials edit restricted",
        DataSourceDescriptor targetDataSource;

                    GeneralUtils.getExceptionMessage(targetException),

    protected abstract PersistResult persistDataSource();

import org.jkiss.code.NotNull;
        }
 * You may obtain a copy of the License at
            DBPNativeClientLocation defaultClientLocation = driver.getDefaultClientLocation();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
                DataSourceDescriptor.generateNewId(driver),
        config.setConnectionType(type);

                        CoreMessages.dialog_connection_wizard_start_dialog_interrupted_message);
            );
 * Copyright (C) 2010-2026 DBeaver Corp and others
        } else {
                    }
import org.eclipse.swt.graphics.Image;
    }
            }

            int decision = ConfirmationDialog.confirmAction(
    @NotNull
    public void setDriverSubstitution(@Nullable DBPDriverSubstitutionDescriptor driverSubstitution) {

import org.eclipse.core.runtime.jobs.Job;

//        return DBeaverIcons.getImage(selectedDriver == null ? DBIcon.DATABASE_DEFAULT : selectedDriver.getIcon());

import org.eclipse.osgi.util.NLS;

            for (IDialogPage subPage : ArrayUtils.safeArray(((IDialogPageProvider) page).getDialogPages(false, false))) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
 *
    private void testInPage(DBCSession session, IDialogPage page) {

            return;
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.ui.ConnectionFeatures;
    }
    public void dispose() {
                    SWT.ICON_WARNING);
            if (page.getControl() != null && !page.getControl().isDisposed()) {


import org.jkiss.dbeaver.DBeaverPreferences;
                            throw new InterruptedException();

import org.eclipse.jface.dialogs.IDialogPage;
                connectionInfo
                ModelPreferences.META_SEPARATE_CONNECTION,
            listener.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
    private final Map<DriverDescriptor, DataSourceDescriptor> infoMap = new HashMap<>();
import org.jkiss.dbeaver.ui.dialogs.ActiveWizard;
        super.dispose();
        }
/**
            targetDataSource = activeDataSource.getRegistry().createDataSource(activeDataSource);
                    while (op.getState() == Job.WAITING || op.getState() == Job.RUNNING) {
//        DBPDriver selectedDriver = getSelectedDriver();
                        }
                        try {
                return false;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;

                info.getConnectionConfiguration().setClientHomeId(defaultClientLocation.getName());
    public DataSourceDescriptor getActiveDataSource() {
        DataSourceDescriptor info = infoMap.get(driver);
                if (newUserPassword != null && !newUserPassword.equals(oldUserPassword)) {
    public DBPDriverSubstitutionDescriptor getDriverSubstitution() {
            targetDataSource.setId(DataSourceDescriptor.generateNewId(activeDataSource.getDriver()));
                    // Wait for job to finish


                    DBUtils.fireObjectUpdate(activeDataSource, targetDataSource.getActualConnectionConfiguration());
                );
            return true;
                    if (op.getConnectError() != null) {
        CHANGED,
        return false;
        } else {
 *
                if (!"cancel".equals(ex.getMessage())) {

                    "Direct connection test is not available for shared connections.\nGo to shared credentials manager dialog.",
    @Override
            dataSource.dispose();
                    SWT.ICON_ERROR);
        }
 * limitations under the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;

 */
        DriverDescriptor driver = (DriverDescriptor) getSelectedDriver();
import org.jkiss.dbeaver.model.DBUtils;
                        if (monitor.isCanceled()) {

    @Nullable
    @Nullable
                    }
                    null,
            info.setSavePassword(true);
public abstract class ConnectionWizard extends ActiveWizard implements IConnectionWizard, INewWizard {

            throw new IllegalStateException("No active project");
                    op.getConnectTime()).open();
    }
                }
    @Nullable
        }
    }
                testInPage(session, subPage);
                DBWorkbench.getPlatformUI().showError(
import org.eclipse.swt.SWT;
