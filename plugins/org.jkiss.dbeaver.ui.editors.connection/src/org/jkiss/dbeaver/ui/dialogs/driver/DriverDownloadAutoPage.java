 * Unless required by applicable law or agreed to in writing, software
                infoGroup,
            forceCheckboxGridData.verticalIndent = verticalIndentFirstRow;
import java.util.List;

            Label label = new Label(infoPanel, SWT.NONE);
        DBPDriver driver = getWizard().getDriver();
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
                    break;
            getContainer().run(
                            } else {
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
                parent,
    DriverDownloadAutoPage(boolean isExpanded) {
        }
                            }
    }
    }
                String message,
                new RunnableContextDelegate(getContainer()),

                case IDialogConstants.OK_ID:
            if (!processUnsecure && !lib.isSecureDownload(monitor)) {
import org.eclipse.ui.forms.events.ExpansionAdapter;
                                }
                                    log.warn("Can't obtain driver license", e);

                    for (DBPDriverLibrary lib : depsTree.getLibraries()) {
            infoText.setLayoutData(infoGridData);
            rtdButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
                false);
        // User must accept all licenses before actual drivers download
    boolean performFinish() {

import org.eclipse.swt.SWT;
        initializeDialogUnits(container);
                                    file.downloadLibraryFile(monitor, false);
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    result = IDialogConstants.OK_ID;
    public void createControl(Composite parent) {


            parent,
        return composite;
class DriverDownloadAutoPage extends DriverDownloadPage {
                parent,
    public static final String NETWORK_TEST_URL = "https://repo1.maven.org";
        setControl(parent);
                    }.execute();
                Shell parentShell,
    }
            forceCheckbox.setToolTipText(UIConnectionMessages.dialog_driver_download_auto_page_force_download_tooltip);
    private boolean acceptDriverLicenses() {
                            mavenArtifact.resetVersion();
        boolean processUnsecure = false;
import javax.net.ssl.SSLHandshakeException;
            // ignore
                        if (lib instanceof DriverLibraryMavenArtifact mavenArtifact) {
        UIUtils.createInfoLabel(
        }
    private ExpandableComposite setExpander(@NotNull Composite parent) {
            createButton(
 *
                    library.setForcedVersion(true);
    private Composite setDetails(@NotNull Composite parent) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                case IDialogConstants.CANCEL_ID:
        DBPDriver driver = wizard.getDriver();
            Label infoText = new Label(composite, SWT.NONE);
        }
            final DBPDriverLibrary lib = nodes.get(i).library;
        } catch (InterruptedException e) {
        {
            infoText.setText(UIConnectionMessages.dialog_driver_download_auto_page_obtain_driver_files_text);
        int verticalIndentFirstRow = 10;
import org.jkiss.dbeaver.model.connection.DBPDriver;
                UIConnectionMessages.dialog_driver_download_auto_page_force_download,

                    String curVersion = library.getVersion();
            // ignore
            return acceptLicense(licenseText);
        return true;
        if (CommonUtils.isEmpty(license)) {
        for (final DBPDriverLibrary file : driver.getDriverLibraries()) {
        String driverDescription = Objects.requireNonNullElse(driver.getDescription(), driver.getFullName());
                    result = new UITask<Integer>() {
        }

                                lib.getDisplayName(), lib.getExternalURL(monitor)));
                case IDialogConstants.IGNORE_ID:
                        return;
    void resolveLibraries() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    this.resolveLibraries();
    }
                monitor -> downloadLibraryFiles(new DefaultProgressMonitor(monitor))
            ) {
    public void setMessage(String newMessage, int newType) {
                IDialogConstants.RETRY_ID,
 * You may obtain a copy of the License at
            }
                                } else {

                } else {
            ));
        expander.setLayoutData(
                UIConnectionMessages.dialog_driver_download_auto_page_driver_download_error_msg,
import org.jkiss.dbeaver.DBException;

import org.eclipse.jface.wizard.WizardDialog;
                                if (DBWorkbench.getPlatform().getApplication()

 *

        });
 *
            final Button forceCheckbox = UIUtils.createCheckbox(
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

        List<DBPDriverDependencies.DependencyNode> nodes = getWizard().getDependencies().getLibraryList();
                                try {
        ExpandableComposite expander = new ExpandableComposite(
                if (lib.getType() == DBPDriverLibrary.FileType.license) {
    public static class DownloadErrorDialog extends StandardErrorDialog {


                }

                        return (response == SWT.YES);
                        MessageBox messageBox = new MessageBox(getShell(), SWT.ICON_WARNING | SWT.YES | SWT.NO);
        if (!CommonUtils.isEmpty(licenseText)) {
        try {
        expander.setClient(details);
                driver.getDriverLibraries(),
                UIUtils.resizeShell(parent.getShell());
                    }
import org.eclipse.ui.forms.widgets.ExpandableComposite;
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridData;
        if (!driver.isLicenseRequired()) {
                    protected Boolean runTask() {
                if (getContainer() instanceof WizardDialog) {
            depsTree.getTree().setLayoutData(treeGridData);
    }
import org.jkiss.dbeaver.ui.UITask;
        Composite container = UIUtils.createPlaceholder(parent, 1);
            return;

                        int response = messageBox.open();
                GridData.FILL_BOTH
                }
                            if (RuntimeUtils.isWindows() && CommonUtils.hasCause(e, SSLHandshakeException.class)) {
        depsTree.resizeTree();
            Composite infoPanel = UIUtils.createComposite(filesGroup, 2);
            createButton(
    }
                        @Override
                setErrorMessage(UIConnectionMessages.dialog_driver_download_auto_page_cannot_resolve_libraries_text);
                lib.downloadLibraryFile(monitor, getWizard().isForceDownload(), NLS.bind(UIConnectionMessages.dialog_driver_download_auto_page_download_rate, (i + 1), filesSize));
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    } catch (Exception e) {
                e.getTargetException()
                infoPanel, UIMessages.button_reset_to_defaults,
    private DriverDependenciesTree depsTree;
                UIConnectionMessages.dialog_driver_download_auto_page_driver_file_missing_text,
import org.eclipse.ui.forms.events.ExpansionEvent;
            Composite infoGroup = UIUtils.createPlaceholder(composite, 2, 5);
                true
    }
        final DriverDownloadWizard wizard = getWizard();
                            DownloadErrorDialog dialog = new DownloadErrorDialog(UIUtils.getActiveWorkbenchShell(), lib.getDisplayName(), message, e);
import org.jkiss.dbeaver.registry.driver.DriverLibraryMavenArtifact;
import org.jkiss.dbeaver.registry.DBConnectionConstants;
        super.setMessage(newMessage, newType);

        final DBPDriver driver = wizard.getDriver();
                            return dialog.open();
        String licenseText = driver.getLicense();
                }

import org.jkiss.dbeaver.runtime.RunnableContextDelegate;
                IDialogConstants.IGNORE_LABEL,
*/
        @Override
                true);
                close();
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
}
 * See the License for the specific language governing permissions and
            GridData infoGridData = new GridData(GridData.FILL_HORIZONTAL);
        {
            if (!depsTree.loadLibDependencies()) {
    private void setDescriptionLabel(@NotNull Composite parent) {
                    resolveLibraries();

        try {
                wizard.isForceDownload()
            }
                    library.setPreferredVersion(version);
            ExpandableComposite.TWISTIE | ExpandableComposite.COMPACT
                        messageBox.setMessage(NLS.bind(UIConnectionMessages.dialog_driver_download_auto_page_driver_security_warning_msg,
            } else {

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            super(parentShell, dialogTitle, message,
        DownloadErrorDialog(
                filesGroup,
    private void downloadLibraryFiles(final DBRProgressMonitor monitor) throws InterruptedException {
                    processUnsecure = true;
        Composite details = setDetails(expander);
                    break;
                    ((WizardDialog) getContainer()).close();
        }
import org.eclipse.jface.layout.GridDataFactory;
    @Override
                    @Override
import org.jkiss.code.NotNull;
                                    message = UIConnectionMessages.dialog_driver_download_auto_page_download_failed_cert_msg_advanced;
                    if (CommonUtils.equalObjects(curVersion, version)) {
                            mavenArtifact.setForcedVersion(false);
                                }
                1,
                            {
import org.eclipse.osgi.util.NLS;
import java.lang.reflect.InvocationTargetException;
        );
        }
        setPageComplete(false);
                            String message;
                UIConnectionMessages.dialog_driver_download_auto_page_driver_download_error,
                setReturnCode(buttonId);
import org.eclipse.swt.widgets.*;
            infoText.setText(NLS.bind(
    }
        protected void buttonPressed(int buttonId) {
import org.eclipse.jface.dialogs.IDialogSettings;
    private final boolean isExpanded;
 */
                                message = UIConnectionMessages.dialog_driver_download_auto_page_download_failed_msg;
                                    .hasProductFeature(DBConnectionConstants.PRODUCT_FEATURE_SIMPLE_TRUSTSTORE)) {
        }
        } catch (InvocationTargetException e) {

            parent,
import java.io.IOException;
        return false;


import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            }
    }
import org.jkiss.dbeaver.ui.UIUtils;
    }
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
        );

            } catch (final IOException e) {
        ((DriverDescriptor)getWizard().getDriver()).setModified(true);

        if (!wizard.isForceDownload()) {
                        messageBox.setText(UIConnectionMessages.dialog_driver_download_auto_page_driver_security_warning);
        return DBWorkbench.getPlatformUI().acceptLicense(
        );
        }
            label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if (!acceptDriverLicenses()) {
        }
            GridDataFactory.fillDefaults().grab(true, true).indent(0, 10).create()
        }
                @Override
            };
                Throwable error)
                IDialogConstants.RETRY_LABEL,
        }
        try {
    public boolean isPageComplete() {
                case IDialogConstants.RETRY_ID:
                        log.warn(e);
            SWT.NONE,
                IDialogConstants.ABORT_LABEL,
            );
            }
        @Override
            GridData treeGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
                    }
                            public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException

import java.util.Objects;
    @Override
        //DataSourceProviderRegistry.getInstance().saveDrivers();
                            @Override
                        }
            return true;


            Button rtdButton = UIUtils.createDialogButton(
        }
            WebUtils.openConnection(NETWORK_TEST_URL, GeneralUtils.getProductTitle());

        String license = driver.getLicense();

            forceCheckbox.addSelectionListener(new SelectionAdapter() {
    }
import org.jkiss.dbeaver.runtime.WebUtils;
        super(UIConnectionMessages.dialog_driver_download_auto_page_auto_download, UIConnectionMessages.dialog_driver_download_auto_page_download_driver_files, null);
            );
        return super.getDialogSettings();
            GridData forceCheckboxGridData = new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.VERTICAL_ALIGN_BEGINNING);
    @Override
            }
                        runnableContext.run(true, true, new DBRRunnableWithProgress() {
                }
    private boolean isNetworkAccessible() {
                true, true,
                public void widgetSelected(SelectionEvent e) {
                protected void setLibraryVersion(DriverLibraryMavenArtifact library, final String version) {
    }
            return true;
                GeneralUtils.makeExceptionStatus(error),
                                    message = UIConnectionMessages.dialog_driver_download_auto_page_download_failed_cert_msg;
    }
            switch (result) {
                final File libraryFile = file.getLocalFile();

            }
                })
            label.setText(UIConnectionMessages.dialog_driver_download_auto_page_change_driver_version_text);
                super.buttonPressed(buttonId);

            infoGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                getWizard().getDependencies(),
                parent,
                boolean process = new UIConfirmation() {
                IDialogConstants.ABORT_ID,
            treeGridData.widthHint = 600;
        final DBPDriver driver = getWizard().getDriver();
        createLinksPanel(composite);
                IStatus.INFO | IStatus.WARNING | IStatus.ERROR);
 * limitations under the License.
import org.jkiss.dbeaver.ui.internal.UIMessages;
            depsTree = new DriverDependenciesTree(
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
            );
import org.eclipse.jface.dialogs.IDialogConstants;
                    continue;
            );

                false);
                }.execute();
                } else {
package org.jkiss.dbeaver.ui.dialogs.driver;
            });
import org.jkiss.dbeaver.utils.GeneralUtils;
                IDialogConstants.IGNORE_ID,
                            }
            infoPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * you may not use this file except in compliance with the License.
        expander.addExpansionListener(new ExpansionAdapter() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }

        expander.setText(UIConnectionMessages.dialog_driver_download_auto_page_show_details);
            "You have to accept driver '" + driver.getFullName() + "' license to continue",
            NLS.bind(UIConnectionMessages.dialog_driver_download_auto_page_download_specific_driver_files, driver.getName()));
                    }
                    }
                UIConnectionMessages.dialog_driver_download_auto_page_required_files,
                }
                    try {
            forceCheckbox.setLayoutData(forceCheckboxGridData);
            NLS.bind(UIConnectionMessages.dialog_driver_download_auto_page_driver_description, driverDescription)
    protected IDialogSettings getDialogSettings() {
        setDescriptionLabel(container);
import org.jkiss.utils.CommonUtils;
            createButton(
        Composite composite = UIUtils.createPlaceholder(parent, 1);
            int result = IDialogConstants.OK_ID;
        if (!wizard.isForceDownload()) {
import org.jkiss.dbeaver.ui.dialogs.StandardErrorDialog;

                driver.getFullName()
            Label infoText = new Label(infoGroup, SWT.NONE);

                parent.getShell().pack(true);
                        }
            if (!depsTree.handleDownloadError(e)) {
            license);
            );
            filesGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
            infoText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        expander.setExpanded(isExpanded);
        }
                    i++;
import org.eclipse.core.runtime.IStatus;
            public void expansionStateChanged(ExpansionEvent e) {
        }
            return true;
import org.jkiss.dbeaver.ui.UIConfirmation;
        protected void createButtonsForButtonBar(@NotNull Composite parent) {
            createDetailsButton(parent);
                }
                if (libraryFile == null || !libraryFile.exists()) {
                        });
        } catch (IOException e) {
            }
        setMessage(
        for (int i = 0, filesSize = nodes.size(); i < filesSize; ) {
        DriverDownloadWizard wizard = getWizard();
        return expander;
            infoGridData.verticalIndent = verticalIndentFirstRow;
            if (buttonId == IDialogConstants.DETAILS_ID) {
            Composite filesGroup = UIUtils.createTitledComposite(
                                } catch (final Exception e) {
            DBWorkbench.getPlatformUI().showError(
                composite,

                driver,
                    return;

        this.isExpanded = isExpanded;
                case IDialogConstants.ABORT_ID:
                String dialogTitle,
    @Override
            if (file.getType() == DBPDriverLibrary.FileType.license) {
        } catch (DBException e) {

import org.eclipse.swt.events.SelectionAdapter;
        setExpander(container);
                    wizard.setForceDownload(forceCheckbox.getSelection());
/*
            try {
                        protected Integer runTask() {
        return true;
    @Override
                SelectionListener.widgetSelectedAdapter(e -> {
/*


                if (process) {
