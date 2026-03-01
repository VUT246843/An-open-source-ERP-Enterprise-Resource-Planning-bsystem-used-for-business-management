                }
            driverDescText.setLayoutData(gd);
        gd.horizontalSpan = 3;
    private void createConnectionPropertiesTab(CTabFolder group) {
import java.lang.reflect.InvocationTargetException;
            return super.open();
    }
                driverTypeGroup,
    private final List<DBPDriverLibrary> libraries = new ArrayList<>();
            dialogCount--;
                        return getPathFromDriverFileInfo(dfi);
                log.error("Driver library doesn't exist: " + localFilePath + ".");
            // Find driver class
            findClassGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                synAddDriverLibDirectory(newLib, localFilePath, shortFileName);
                return true;
            if (license != null) {
        parametersEditor.loadProperties(driverPropertySource);
            if (oldDriver != null) {
            anonymousDriverCheck.setEnabled(false);
        Composite paramsGroup = new Composite(group, SWT.NONE);
                    }
                }

        }
 * Unless required by applicable law or agreed to in writing, software
            final CSmartCombo<DataSourceProviderDescriptor> providerCombo = new CSmartCombo<>(
            threadSafeCheck.setEnabled(false);
        DBFileController fileController = DBWorkbench.getPlatform().getFileController();
            layout.marginHeight = 0;
            hasFiles = hasFiles || (localFile != null && Files.exists(localFile));
            }

        }
        }
        CTabItem libsTab = new CTabItem(group, SWT.NONE);
        //resetLibraries(false);

            resetButton.setEnabled(false);
                DBPDriverLibrary.FileType.jar,
            IStructuredSelection selection = (IStructuredSelection) libTable.getSelection();
        }
            if (library instanceof DriverLibraryAbstract) {
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        Text idText = UIUtils.createLabelText(
                }
            final Path localFile = library.getLocalFile();
 *
        drv.setAnonymousAccess(anonymousDriverCheck.getSelection());
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.eclipse.jface.resource.JFaceColors;
        }
            createMainTab(tabFolder);
        if (localFile != null) {
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
        for (DBPDriverLibrary library : this.driver.getDriverLibraries()) {
    private Button detailsButton;
        }
            }

        }
        this.newDriver = true;

        if (editButton != null) {
            } else {
            driver.getId(),
        licenseText.setEditable(false);
        paramsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_tooltip_connection_properties);
            public void widgetSelected(SelectionEvent e) {
            driverTypeGroup.setLayoutData(gd);

            }
            }
        if (clientHomesPanel != null) {
        return dialogCount;
    private PropertySourceCustom driverPropertySource;
            libTable.getControl().addListener(SWT.Selection, event -> changeLibSelection());
    @Override
    }
        allowsEmptyPasswordCheck.setSelection(original ? driver.isOrigAllowsEmptyPassword() : driver.isAllowsEmptyPassword());
                if (files != null) {
                        return DBeaverIcons.getImage(((DataSourceProviderDescriptor) element).getIcon());
        paramsTab.setControl(paramsGroup);
            }
                file.getFile().toString(),
        driverClassText.setText(CommonUtils.notEmpty(original ? driver.getOrigClassName() : driver.getDriverClassName()));
        onChangeProperty();
        driverDatabaseText.addModifyListener(e -> onChangeProperty());
        }
        group.addSelectionListener(new SelectionAdapter() {

    @Override

                return;

        connectionPropertiesEditor = new ConnectionPropertiesControl(paramsGroup, SWT.BORDER);
            gd);
        licenseText.setLayoutData(gd);
                    }

                public String getToolTipText(Object element) {
        this.provider = provider;
        gd.heightHint = 200;
                    group.removeSelectionListener(this);
                libTable.refresh();
        drv.setEmbedded(embeddedDriverCheck.getSelection());
    private Text driverDescText;
            });
    private Text driverURLText;
            });

        driverDatabaseText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
                null));
    private Button editButton;
    private void onChangeProperty() {
            UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_add_artifact, new SelectionAdapter() {
            UIConnectionMessages.dialog_edit_driver_label_description,
        @Override
                    if (element instanceof DBPDriverLibrary lib) {
        gd.widthHint = UIUtils.getFontHeight(propsGroup) * 20;
        IStructuredSelection selection = (IStructuredSelection) libTable.getSelection();

        Composite groupWrapper = UIUtils.createComposite(propsGroup, 1);
                "DBeaver will upload driver files back to the server. Do you confirm?")) {
        });
        gd.heightHint = 3 * UIUtils.getFontHeight(infoGroup);
        }
                    driver.getDefaultDriverLoader().updateFiles(true);
        paramsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_name_connection_properties);
                @Override
        driverNameText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_label_driver_name, driver.getName(), SWT.BORDER | advStyle, gd);

                    changeLibContent();
            }
                        } else {
            driverFilePath = driver.getId() + "/" + shortFileName;
                    }
            return null;
            }
        }

            final Object element = selection.getFirstElement();
            libTable.setInput(libraries);

        }
        detailsButton.setEnabled(selectedLib != null);
        {
                    }
                }
        @Override
        CTabItem paramsTab = new CTabItem(group, SWT.NONE);
    @Override
            driver.isPropagateDriverProperties(),
            tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
    private void createLibrariesTab(CTabFolder group) {
        CTabItem paramsTab = new CTabItem(group, SWT.NONE);
        loadSettings(false);
                }

                createLicenseTab(tabFolder, license);
                            hasFiles = true;
            libsListGroup.setLayout(layout);
        driverPortText.setText(CommonUtils.notEmpty(original ? driver.getOrigDefaultPort() : driver.getDefaultPort()));
                    @Override
                DBFileController.TYPE_DATABASE_DRIVER,
                        providerCombo.addItem(provider);
            }
        // Set props
        } catch (IOException e) {
    }
            return;
public class DriverEditDialog extends HelpEnabledDialog {
        }
        paramsTab.setControl(paramsGroup);
            Path appInstallPath = RuntimeUtils.getLocalPathFromURL(Platform.getInstallLocation().getURL());
package org.jkiss.dbeaver.ui.dialogs.driver;

            DriverEditHelpers.showFileInExplorer(selectedLibrary.getLocalFile());
        this.showAddFiles = addFiles;

            infoGroup,
        nonInstantiableCheck = UIUtils.createCheckbox(optionsPanel, UIConnectionMessages.dialog_edit_driver_use_legacy_instantiation_label, UIConnectionMessages.dialog_edit_driver_use_legacy_instantiation_tip, !driver.isInstantiable(), 1);
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        paramsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_tooltip_advanced_parameters);
        drv.setPropagateDriverProperties(propagateDriverPropertiesCheck.getSelection());
        driverUserText.setText(CommonUtils.notEmpty(original ? driver.getOrigDefaultUser() : driver.getDefaultUser()));
                            cell.setForeground(JFaceColors.getErrorText(Display.getDefault()));
            });
            UIUtils.showMessageBox(getShell(), UIConnectionMessages.dialog_edit_driver_dialog_save_exists_title, NLS.bind(UIConnectionMessages.dialog_edit_driver_dialog_save_exists_message, driver.getName()), SWT.ICON_ERROR);
            classListCombo = new Combo(findClassGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
 * limitations under the License.
        libraries.addAll(driver.getEnabledDriverLibraries());
        });
            log.error("Error detecting app path", e);
        @Override

        driverNameText.setEnabled(driver == null || driver.isCustom());
        }
                List<DBPDriver> usedBy = DriverEditHelpers.getDriversByLibrary(oldLib);
                public void widgetSelected(SelectionEvent e) {
            libTable.addDoubleClickListener(event -> editSelectedLibrary());
 * you may not use this file except in compliance with the License.
    private Text driverPortText;
                    }
    protected void cancelPressed() {
        this.driver = (DriverDescriptor) driver;
        try {
                createClientHomesTab(tabFolder);
        }
        libsControlGroup.setLayout(new GridLayout(1, true));
import org.jkiss.dbeaver.ui.internal.UIMessages;

            }
    DriverEditDialog(Shell shell, DataSourceProviderDescriptor provider, DriverDescriptor driver) {
        for (DriverFileInfo file : libraryFiles) {
        gd = new GridData(GridData.FILL_HORIZONTAL);

        drv.setInstantiable(!nonInstantiableCheck.getSelection());
        if (!DBWorkbench.isDistributed()) {
            }
        }
        paramsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_name_license);
                return files.toArray(new Object[0]);
            if (!selection.isEmpty()) {
            }
                            cell.setForeground(null);
        paramsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_name_client_homes);
            UIUtils.createControlLabel(driverTypeGroup, UIConnectionMessages.dialog_edit_driver_type_label);
    private PropertySourceCustom connectionPropertySource;
                    }
            updateVersionButton.setEnabled(hasDownloads);
        }
        parametersEditor.loadProperties(driverPropertySource);
    private final boolean newDriver;
        this.newDriver = false;
            urlLabel.setLayoutData(gd);
            // Additional libraries list
            }
        nonInstantiableCheck.setSelection(original ? !driver.isOrigInstantiable() : !driver.isInstantiable());
            public void widgetSelected(SelectionEvent e) {

    }
            }
            classListCombo.addSelectionListener(new SelectionAdapter() {
                    if (UIUtils.confirmAction(getShell(), UIConnectionMessages.dialog_edit_driver_dialog_delete_library_title, UIConnectionMessages.dialog_edit_driver_dialog_delete_library_message)) {
            curFolder = fd.getFilterPath();
                if (CommonUtils.isEmpty(files)) {
                false);
            String[] fileNames = fd.getFileNames();
    private Button nonInstantiableCheck;
        this.newDriver = true;
    }
    private DriverLibraryAbstract getSelectedLibrary() {
        threadSafeCheck = UIUtils.createCheckbox(optionsPanel, "Thread safe driver", "Driver is thread safe (default). Otherwise DBeaver will lock all driver invocations to protect it from any data corruptions.", driver.isThreadSafeDriver(), 1);
                            driver,

        } else {
        return group;
        }
        boolean hasFiles = false, hasDownloads = false;
        Composite propsGroup = new Composite(group, SWT.NONE);
    private void addLibraryFiles() {
            classListCombo.setEnabled(!isReadOnly);
            libsListGroup.setLayoutData(gd);
    }
                hasDownloads = true;
                                cell.setImage(DBeaverIcons.getImage(DBIcon.JAR));
            drv.setNativeClientLocations(clientHomesPanel.getLocalLocations());
                continue;

 * You may obtain a copy of the License at
        if (updateVersionButton != null) {
    private void editMavenArtifact() {

        if (selectedLibrary instanceof DriverLibraryMavenArtifact) {
    private void addMavenArtifact() {
        if (!CommonUtils.isEmpty(driver.getWebURL())) {
                        if (localFile != null && !Files.exists(localFile)) {
        driverURLText.setToolTipText(UIConnectionMessages.dialog_edit_driver_label_sample_url_tip);
        deleteButton.setEnabled(selectedLib != null);
            }
 *
                        if (lib.getPreferredVersion() != null) {
            GridData.FILL_HORIZONTAL,
                addLibraryFiles();
        }
                providerCombo.addItem(provider);
        libsTab.setControl(libsGroup);
        Composite paramsGroup = new Composite(group, SWT.NONE);
    private PropertyTreeViewer parametersEditor;
                            if (((DriverFileInfo)element).getType() == DBPDriverLibrary.FileType.license) {
        clientHomesPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
//        driver.setAnonymousAccess(anonymousCheck.getSelection());
                if (selection != null && !selection.isEmpty()) {
                    if (selIndex >= 0) {
        );
import org.jkiss.dbeaver.ui.controls.CSmartCombo;
            if (parentElement instanceof DBPDriverLibrary) {
        driverURLText.setEnabled(driver == null || driver.isSampleURLApplicable());

                        for (Object obj : selection.toArray()) {
        libsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_tooltip_driver_libraries);
                }
        driverDatabaseText.setText(CommonUtils.notEmpty(original ? driver.getOrigDefaultDatabase() : driver.getDefaultDatabase()));

            createLibrariesTab(tabFolder);
            editButton.setEnabled(selectedLib instanceof DriverLibraryMavenArtifact);
                        }

        detailsButton = UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_details, new SelectionAdapter() {
                            classListCombo.setListVisible(true);
                if (e.item == paramsTab) {
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
                        Path localFile = lib.getLocalFile();
            UIConnectionMessages.dialog_edit_driver_propagate_driver_properties_tip,
    }
    }
 */

                        }
            provider.addDriver(driver);
            4,
        // Finish
                    return null;
import java.util.ArrayList;
            Path localFilePath = newLib.getLocalFile();
        if (DBWorkbench.isDistributed()) {
        DriverFileInfo fileInfo = new DriverFileInfo(
                });
        });
        connectionPropertiesEditor.loadProperties(connectionPropertySource);
                        DriverLibraryAbstract.createFromPath(
            return element instanceof DBPDriverLibrary &&
                SWT.BORDER | SWT.READ_ONLY | SWT.DROP_DOWN,
    public DriverEditDialog(Shell shell, DBPDriver driver) {
        findClassButton.setEnabled(provider.isDriversManageable() && hasFiles);


    private void createMainTab(CTabFolder group) {
                driver,

        }
                    @Override
        UIUtils.asyncExec(() -> propsGroup.layout(true, true));
        if (localFilePath.startsWith(storageFolder)) {
                DBFileController.TYPE_DATABASE_DRIVER,
                        driverClassText.setText(classListCombo.getItem(selIndex));
                        String displayName = lib.getDisplayName();
                    editSelectedLibrary();
        return null;
        @Override
                        } else if (!driver.getDefaultDriverLoader().isLibraryResolved(lib)) {
                continue;
            }
    protected void okPressed() {
            @Override
            driverFilePath, null, library.getType(), Path.of(driverFilePath), driverFilePath);
                }
                syncAddDriverLibFile(newLib, localFilePath, shortFileName);
                    public void widgetSelected(SelectionEvent e) {
    }
                            displayName += " [" + lib.getPreferredVersion() + "]";

            }
        propagateDriverPropertiesCheck.setSelection(original ? driver.isOrigPropagateDriverProperties() : driver.isPropagateDriverProperties());
            });
    private void syncAddDriverLibFile(DBPDriverLibrary library, Path localFilePath, String shortFileName) throws DBException {
            if (fd.open() == IDialogConstants.OK_ID) {
        paramsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_name_client_homes);
 *
        licenseText.setMessage(UIConnectionMessages.dialog_edit_driver_text_driver_license);
            provider.getRegistry().saveDrivers();
            gd = new GridData(GridData.FILL_HORIZONTAL);
        this.driver = provider.createDriver();
import java.io.File;
        drv.setAllowsEmptyPassword(allowsEmptyPasswordCheck.getSelection());
        public Object[] getChildren(Object parentElement) {
}
        driverPortText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        driverNameText.setFocus();
                return (DriverLibraryAbstract) element;
        connectionPropertiesEditor.loadProperties(connectionPropertySource);
                new DriverLibraryDetailsDialog(getShell(), driver, getSelectedLibrary()).open();
        } catch (IOException e) {
import org.jkiss.dbeaver.ui.dialogs.connection.ClientHomesPanel;

                driverFilePath,
            }

            changeLibSelection();
    }
import org.jkiss.dbeaver.DBException;
        );
        super(shell, IHelpContextIds.CTX_DRIVER_EDITOR);
                }
import org.eclipse.ui.IWorkbenchCommandConstants;

                        if (!RuntimeUtils.isMacOS()) {
        driverNameText.addModifyListener(e -> onChangeProperty());
            driver.getProviderId(),
        paramsGroup.setLayout(new GridLayout(1, false));
        try {
    @Override
        Composite libsControlGroup = new Composite(libsGroup, SWT.TOP);
            EditMavenArtifactDialog fd = new EditMavenArtifactDialog(getShell(), driver, (DriverLibraryMavenArtifact) selectedLibrary);
        paramsTab.setControl(paramsGroup);

                    @Override
    @Override
    private boolean isAppInstallationFile(Path localFilePath) {
    protected IDialogSettings getDialogBoundsSettings() {
        driverDatabaseText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_label_default_database, CommonUtils.notEmpty(driver.getDefaultDatabase()), SWT.BORDER | advStyle);
import org.eclipse.swt.layout.GridData;
        int advStyle = isReadOnly ? SWT.READ_ONLY : SWT.NONE;
        drv.setConnectionProperties(connectionPropertySource.getPropertyValues());
        libraries.addAll(driver.getOrigLibraries());
import org.eclipse.jface.dialogs.IDialogSettings;
                public void widgetSelected(SelectionEvent e) {
                @Override
            tooltip = localFile.toString();
    private void synAddDriverLibDirectory(DBPDriverLibrary newLib, Path localFilePath, String shortFileName) throws DBException {
            throw new DBException("Error sync lib directory", e);
        Composite libsGroup = new Composite(group, SWT.NONE);

    }
            infoGroup,
            SWT.BORDER | SWT.READ_ONLY
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.nio.file.Path;
        paramsTab.setControl(propsGroup);
            });
                    ShellUtils.launchProgram(driver.getWebURL());
    private void editSelectedLibrary() {
        Composite optionsPanel = new Composite(propsGroup, SWT.NONE);
                }
        {
        DriverLibraryAbstract selectedLibrary = getSelectedLibrary();
                    if (element instanceof DBPDriverLibrary dl) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (localFilePath.startsWith(appInstallPath)) {

        driverUserText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            UIConnectionMessages.dialog_edit_driver_description,

        }
    private Text driverClassText;
        }
            button.setEnabled(isValid);
        driverClassText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_label_class_name, CommonUtils.notEmpty(driver.getDriverClassName()), SWT.BORDER | advStyle, gd);
    protected void createButtonsForButtonBar(Composite parent) {
        gd.widthHint = 700;


        if (driver.isCustom()) {
                }
                    if (provider.isDriversManageable()) {
    private void loadSettings(boolean original) {
                    }
    public int open() {
    private void createLicenseTab(CTabFolder group, String license) {
                        Path localFile = dl.getLocalFile();
        paramsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_name_advanced_parameters);
                    saveDriverSettings(test);
                public void widgetSelected(SelectionEvent e) {
                ((DriverLibraryAbstract) library).setCustom(true);
        libsGroup.setLayout(new GridLayout(2, false));
            } catch (DBException e) {
    DriverEditDialog(Shell shell, DataSourceProviderDescriptor provider, String category) {

        drv.setDriverDefaultUser(driverUserText.getText());
            }
            }

        driverClassText.addModifyListener(e -> onChangeProperty());
        connectionPropertySource = connectionPropertiesEditor.makeProperties(driver, driver.getConnectionProperties());
            libraries.add(DriverLibraryAbstract.createFromPath(
    private static final String DIALOG_ID = "DBeaver.DriverEditDialog";//$NON-NLS-1$
import org.eclipse.jface.viewers.*;
                }
                    }
        }
        }
        );
                    syncAddDriverLibFile(newLib, file, shortFileNameForCurrentLevel);
                    public String getText(Object element) {
                    } else {
            Link urlLabel = UIUtils.createLink(infoGroup, "<a>" + driver.getWebURL() + "</a>", new SelectionAdapter() {
                    public Image getImage(Object element) {
            tabFolder.setSelection(0);
        UIUtils.createToolButton(libsControlGroup, ActionUtils.findCommandName(IWorkbenchCommandConstants.FILE_EXPORT), new SelectionAdapter() {
/*
            gd.minimumWidth = UIUtils.getFontHeight(propsGroup) * 20;
            }

import org.eclipse.swt.widgets.*;
        optionsPanel.setLayoutData(gd);
            return new Object[0];
            if (!ArrayUtils.isEmpty(fileNames)) {

    private DataSourceProviderDescriptor provider;
        } else {
            editButton = UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_driver_manager_button_edit, new SelectionAdapter() {
        return tooltip;
        final GridData gd = new GridData(GridData.FILL_BOTH);
        CTabItem paramsTab = new CTabItem(group, SWT.NONE);
            }
        fd.setFilterPath(curFolder);
import org.jkiss.dbeaver.ui.dialogs.HelpEnabledDialog;
        driverPropertySource = new PropertySourceCustom(

            }
            }
        });
            1
        drv.setDriverLibraries(libraries);
            if (newLib instanceof DriverLibraryMavenArtifact || newLib instanceof DriverLibraryBundle) {
 * DriverEditDialog
import org.jkiss.dbeaver.registry.driver.*;
    private class LibContentProvider implements ITreeContentProvider {
        fd.setText(UIConnectionMessages.dialog_edit_driver_dialog_open_driver_library);
                            } else {

        String selected = fd.open();
        Text providerIdText = UIUtils.createLabelText(
        FileDialog fd = new FileDialog(getShell(), SWT.OPEN | SWT.MULTI);
                addLibraryFolder();
import org.eclipse.swt.SWT;
                        }
        final DriverLibraryAbstract selectedLibrary = getSelectedLibrary();
                UIWidgets.fillDefaultTreeContextMenu(manager, libTable.getTree()));

        } else if (selectedLibrary instanceof DriverLibraryLocal) {
        CTabItem paramsTab = new CTabItem(group, SWT.NONE);
        } else {
                }
        UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_classpath, new SelectionAdapter() {
    }
                String shortFileNameForCurrentLevel = shortFileName + "/" + file.getFileName().toString();
    public int open(boolean addFiles) {
import org.jkiss.utils.IOUtils;
        propsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                final Collection<DriverFileInfo> files = driver.getDefaultDriverLoader().getLibraryFiles((DBPDriverLibrary) parentElement);
        // Mark driver and all its libraries as custom (#3867)

                if (element instanceof DriverFileInfo dfi) {
        upButton.setEnabled(libList.indexOf(selectedLib) > 0);
    }
        if (!DBWorkbench.isDistributed()) {
    @Override
    private Button allowsEmptyPasswordCheck;
            for (Path file : list.toList()) {
            @Override
                providerCombo.select(provider);
            if (inputElement instanceof Collection) {

        boolean isReadOnly = !provider.isDriversManageable();
            libTable = new TreeViewer(libsListGroup, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
            String shortFileName = localFilePath.getFileName().toString();
    private Text driverNameText;
                    addMavenArtifact();
        String selected = fd.open();
        driverPropertySource.addDefaultValues(driver.getDefaultDriverParameters());
        return driver;
            if (library.isDownloadable()) {
            infoGroup,
        if (selection != null && !selection.isEmpty()) {
        providerIdText.setToolTipText(UIConnectionMessages.dialog_edit_driver_label_provider_id_tip);
            layout.marginHeight = 0;
    private String curFolder = null;
    private Button embeddedDriverCheck;
        }
    }
        GridData gd;
    public DriverDescriptor getDriver() {
                return ((Collection<?>) inputElement).toArray();
    }
        }
            SWT.DEFAULT
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.utils.ArrayUtils;
                @Override
            UIWidgets.setControlContextMenu(libTable.getTree(), manager ->
            createConnectionPropertiesTab(tabFolder);
        drv.setThreadSafeDriver(threadSafeCheck.getSelection());

    protected Composite createDialogArea(Composite parent) {
        }
                    if (!driver.getDefaultDriverLoader().isLibraryResolved(lib)) {
            getShell().setText(UIConnectionMessages.dialog_edit_driver_title_create_driver);
    private TreeViewer libTable;
            CTabFolder tabFolder = new CTabFolder(group, SWT.FLAT);
    }
            boolean isReadOnly = !provider.isDriversManageable();
        gd = new GridData(GridData.FILL_HORIZONTAL);
    private Button threadSafeCheck;
                            cell.setForeground(JFaceColors.getHyperlinkText(Display.getDefault()));
                log.error("Wrong driver library found: " + newLib + ". Must be a local file");
    }
            }

            if (newDriver) {
            findClassButton.setEnabled(!isReadOnly);
                "Driver libraries upload",
            gd = new GridData(GridData.FILL_BOTH);
            layout.marginWidth = 0;
                selected,
        super(shell, IHelpContextIds.CTX_DRIVER_EDITOR);
                        if (!UIUtils.confirmAction(getShell(), "Not all files present",
        //gd.grabExcessVerticalSpace = true;
        public Object[] getElements(Object inputElement) {
                    synAddDriverLibDirectory(newLib, file, shortFileNameForCurrentLevel + "/" + file.getFileName().toString());
        Button button = getButton(IDialogConstants.OK_ID);
        }
        this.provider = provider;
        }
            optionsPanel,

        drv.setModified(true);
            if (isAppInstallationFile(localFilePath)) {
import org.jkiss.dbeaver.model.connection.DBPDriver;
            findClassButton.setText(UIConnectionMessages.dialog_edit_driver_button_bind_class);

            DBWorkbench.getPlatformUI().showError("Drivers save error", "Error saving drivers", e);
        if (libTable != null) {
                        if (element instanceof DriverFileInfo) {
        } finally {
                    syncRemoveDriverLibFile(oldLib);

        classListCombo.setEnabled(hasFiles);
import org.eclipse.core.runtime.Platform;
            }
    }
        });
                return;
                });
        this.driver.setCustom(true);
            if (!hasFiles) {
                            "Driver files weren't downloaded. " +
    }
            gd.horizontalSpan = 2;
/**
            getShell().setText(UIConnectionMessages.dialog_edit_driver_title_edit_driver + driver.getName() + "'"); //$NON-NLS-2$
                    UIUtils.runInProgressDialog(classFinder);
        downButton.setEnabled(libList.indexOf(selectedLib) < libList.size() - 1);


            throw new DBException("IO error while saving driver file", e);
            Composite driverTypeGroup = UIUtils.createComposite(propsGroup, 2);
        if (oldDriver != null && oldDriver != driver && !oldDriver.isDisabled() && oldDriver.getReplacedBy() == null) {
        }
        DirectoryDialog fd = new DirectoryDialog(getShell(), SWT.MULTI);
                        return ((DataSourceProviderDescriptor) element).getName();
                } catch (InvocationTargetException e) {
                // Remove old library files
        } catch (DBException e) {

                        if (file.getFile() != null && Files.exists(file.getFile())) {
        driverClassText.setToolTipText(UIConnectionMessages.dialog_edit_driver_label_class_name_tip);
        libTable.setInput(libraries);

import java.util.List;
        }
                    driver.setDriverLibraries(libraries);
    }
        for (DBPDriverLibrary oldLib : oldLibs) {
            CommonUtils.notEmpty(driver.getDescription()),
                }
                        classListCombo.setItems(classNames.toArray(new String[0]));
        return null;//UIUtils.getDialogSettings(DIALOG_ID);
                    libraries.add(
                try {
        Collection<DriverFileInfo> libraryFiles = driver.getDefaultDriverLoader().getLibraryFiles(library);
            gd = new GridData(GridData.FILL_HORIZONTAL);
                DriverEditHelpers.exportDriverLibraries(getShell(), libraries);

import org.jkiss.dbeaver.Log;
            boolean isValid = !CommonUtils.isEmpty(driverNameText.getText());
                public void widgetSelected(SelectionEvent e) {
            }
            @Override
            public void widgetSelected(SelectionEvent e) {
        if (selectedLibrary instanceof DriverLibraryMavenArtifact) {

                        return localFile == null ? "N/A" : localFile.toAbsolutePath().toString();
    }
            }
        DBFileController fileController = DBWorkbench.getPlatform().getFileController();
            if (DBWorkbench.isDistributed() && !localFile.isAbsolute()) {
                        provider = providerCombo.getItem(providerCombo.getSelectionIndex());

 * Licensed under the Apache License, Version 2.0 (the "License");
            dialogCount++;

                log.debug("Skip remote file '" + localFilePath + "'");
        detailsButton.setEnabled(false);
        fd.setFilterExtensions(filterExt);
        {

    @Override
                        }
            UIConnectionMessages.dialog_edit_driver_label_provider_id,
            GridLayout layout = new GridLayout(1, false);


            UIUtils.createControlLabel(infoGroup, UIConnectionMessages.dialog_edit_driver_label_website);
                    log.error(e.getTargetException());
                localFile = DriverDescriptor.getExternalDriversStorageFolder().resolve(localFile);

            if (element instanceof DriverLibraryAbstract) {
        try {
    private void changeLibContent() {
            layout.marginWidth = 0;
    private ClientHomesPanel clientHomesPanel;

            libTable.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
                providerCombo.addSelectionListener(new SelectionAdapter() {
                changeLibContent();
                for (DBPDriverLibrary lib : libraries) {
            changeLibContent();
        String[] filterExt = {"*.jar;*.zip", "*.dll;*.so", "*", "*.*"}; //$NON-NLS-1$ //$NON-NLS-2$
        try {
                            DBPDriverLibrary.FileType.getFileTypeByFileName(fileName),
                }

        if (provider.getDriver(driver.getId()) == null) {
import org.eclipse.swt.layout.GridLayout;

                    }
    private DriverDescriptor driver;
        fd.setFilterPath(curFolder);
        optionsPanel.setLayout(new RowLayout());
    private Button findClassButton;
        driver.getDefaultDriverLoader().addLibraryFile(library, fileInfo);
    // Distributed products only!
    }
        } else {
            public void widgetSelected(SelectionEvent e) {
        groupWrapper.setLayoutData(gd);
        driverPortText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_label_default_port, CommonUtils.notEmpty(driver.getDefaultPort()), SWT.BORDER | advStyle);
        }
    static int getDialogCount() {

            curFolder = fd.getFilterPath();
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            @Override
            super.buttonPressed(buttonId);
        }
        threadSafeCheck.setSelection(driver.isThreadSafeDriver());
            }
        UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_add_folder, new SelectionAdapter() {
                Object element = selection.getFirstElement();

    }
        }


 * DBeaver - Universal Database Manager
            resetLibraries();
        super(shell, IHelpContextIds.CTX_DRIVER_EDITOR);

            getShell().setImage(DBeaverIcons.getImage(driver.getPlainIcon()));
            if (Files.isDirectory(localFilePath)) {

                    }
            embeddedDriverCheck.setEnabled(false);

        propsGroup.setLayout(new GridLayout(4, false));
            libTable.setContentProvider(new LibContentProvider());
    private static @NotNull String getPathFromDriverFileInfo(@NotNull DriverFileInfo dfi) {
                syncDriverLibraries();

            return;
        gd.horizontalSpan = 3;
            } else {
                libraryLocal.setPath(driverFilePath);
        Path storageFolder = DriverDescriptor.getExternalDriversStorageFolder();
            });

                                changeLibContent();
                    DriverDescriptor test = new DriverDescriptor(driver.getProviderDescriptor(), "test", driver);
        if (button != null) {
        allowsEmptyPasswordCheck = UIUtils.createCheckbox(optionsPanel, UIConnectionMessages.dialog_edit_driver_allows_empty_password_label, UIConnectionMessages.dialog_edit_driver_allows_empty_password_tip, driver.isAnonymousAccess(), 1);
        if (libraryFiles == null) {
import org.jkiss.dbeaver.ui.*;
        infoGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            // For distributed mode it is done in syncDriverLibraries method
    protected Control createContents(Composite parent) {
        UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_add_file, new SelectionAdapter() {
        driverUserText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_label_default_user, CommonUtils.notEmpty(driver.getDefaultUser()), SWT.BORDER | advStyle);
                driver.resetDriverInstance();
                        }
        deleteButton = UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_delete, new SelectionAdapter() {
        if (selected != null) {

        }
        drv.setDescription(CommonUtils.notEmpty(driverDescText.getText()));
    }
import java.util.stream.Stream;
            public void widgetSelected(SelectionEvent e) {
                    return super.getToolTipText(element);
        detailsButton.setEnabled(hasFiles);
                new LabelProvider() {
        super.cancelPressed();


        String driverFilePath;
                }
                    for (DriverFileInfo file : files) {
        drv.setDriverParameters(driverPropertySource.getPropertiesWithDefaults());
    private Button anonymousDriverCheck;
import org.eclipse.swt.custom.CTabFolder;

        drv.setDriverClassName(driverClassText.getText());

        driverUserText.addModifyListener(e -> onChangeProperty());
                continue;
        anonymousDriverCheck.setSelection(original ? driver.isOrigAnonymousAccess() : driver.isAnonymousAccess());
    }


import java.io.IOException;
        driverDescText.setText(CommonUtils.notEmpty(original ? driver.getOrigDescription() : driver.getDescription()));
        driverURLText.addModifyListener(e -> onChangeProperty());
            providerCombo.setLayoutData(gd);
            gd.horizontalSpan = 3;
            changeLibContent();
    private Button propagateDriverPropertiesCheck;
        EditMavenArtifactDialog fd = new EditMavenArtifactDialog(getShell(), driver, null);

        drv.setDriverDefaultDatabase(driverDatabaseText.getText());

import java.util.Collection;
            findClassButton = new Button(findClassGroup, SWT.PUSH);
        drv.setSampleURL(driverURLText.getText());
            allowsEmptyPasswordCheck.setEnabled(false);
                                cell.setImage(DBeaverIcons.getImage(DBIcon.TYPE_TEXT));
                        }

                IStructuredSelection selection = (IStructuredSelection) libTable.getSelection();
        idText.setToolTipText(UIConnectionMessages.dialog_edit_driver_label_id_tip);

        paramsGroup.setLayout(new GridLayout(1, false));
            } else if (IOUtils.isLocalFile(localFilePath.toString())) {

            // We have to reset the driver instance here to clear the old classloader with old libraries
                        List<String> classNames = classFinder.getDriverClassNames();
            }

        Button resetButton = createButton(parent, IDialogConstants.RETRY_ID, UIMessages.button_reset_to_defaults, false);
        for (DBPDriverLibrary newLib : libraries) {
    }
        });

        UIUtils.createEmptyLabel(propsGroup, 2, 1);
    private void addLibraryFolder() {
        }
            return;
    }
    private Combo classListCombo;
    private void resetLibraries() {
    private void changeLibSelection() {
    private void createParametersTab(CTabFolder group) {
        fd.setText(UIConnectionMessages.dialog_edit_driver_dialog_open_driver_directory);

            @Override
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
                @Override
        libsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_name_driver_libraries);
        Composite infoGroup = UIUtils.createTitledComposite(
import org.jkiss.dbeaver.ui.preferences.PrefPageDriversClasspath;
        } else {
import org.eclipse.swt.custom.CTabItem;
            groupWrapper,
        embeddedDriverCheck = UIUtils.createCheckbox(optionsPanel, UIConnectionMessages.dialog_edit_driver_embedded_label, UIConnectionMessages.dialog_edit_driver_embedded_tip, driver.isEmbedded(), 1);
                @Override
                @Override
                        }
            changeLibContent();
            Composite libsListGroup = new Composite(libsGroup, SWT.NONE);
                    if (classListCombo != null && !classListCombo.isDisposed()) {
*/
import org.eclipse.swt.graphics.Image;


                            "You need to click '" + UIConnectionMessages.dialog_edit_driver_button_update_version + "' before exporting.\n" +
        driverDescText = UIUtils.createLabelText(
        driverNameText.setText(CommonUtils.notEmpty(original ? driver.getOrigName() : driver.getName()));
            UIConnectionMessages.dialog_edit_driver_label_id,
                        cell.setText(displayName);
                            classListCombo.setText(classNames.get(0));

        if (buttonId == IDialogConstants.RETRY_ID) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

    private Text driverDatabaseText;
            // Client homes

            if (driver.getNativeClientManager() != null) {
        this.provider = this.driver.getProviderDescriptor();
                public void update(ViewerCell cell) {
                    DriverClassFindJob classFinder = new DriverClassFindJob(test, java.sql.Driver.class.getName(), true);
        changeLibContent();
                }
            editButton.setEnabled(false);
    private ConnectionPropertiesControl connectionPropertiesEditor;

        UIUtils.createLabelSeparator(libsControlGroup, SWT.HORIZONTAL);
        Control ctl = super.createContents(parent);
                // Skip files which are part of app installation (e.g. licenses)
        if (selected != null) {
        propagateDriverPropertiesCheck = UIUtils.createCheckbox(

    private Button updateVersionButton;
        super.okPressed();
            libraries.addAll(fd.getArtifacts());
/*
import org.jkiss.utils.CommonUtils;
            if (!libraries.contains(oldLib)) {
            final String license = driver.getLicense();
    @Override
            fileController.saveFileData(
        public Object getParent(Object element) {
        GridData gd = new GridData(GridData.FILL_BOTH);
                    clientHomesPanel.loadHomes(driver);
            layout = new GridLayout(3, false);
        }
            nonInstantiableCheck.setEnabled(false);
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            new File(folderFile, fileName).getAbsolutePath(),
        gd.horizontalSpan = 4;
            getShell().getDisplay().asyncExec(this::addLibraryFiles);
        }

    }
            if (!(newLib instanceof DriverLibraryLocal)) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            // Add new library files


        Path localFile = dfi.getFile();
            driver.getDefaultDriverLoader().removeLibraryFiles(newLib);
                    int selIndex = classListCombo.getSelectionIndex();

        List<DBPDriverLibrary> oldLibs = driver.getEnabledDriverLibraries();
import org.jkiss.dbeaver.ui.dialogs.connection.ConnectionPropertiesControl;
        return open();
                getShell(),
            gd = new GridData(GridData.FILL_HORIZONTAL);
            @Override
            SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP | advStyle,
            ColumnViewerToolTipSupport.enableFor(libTable);

                public void widgetSelected(SelectionEvent e) {
                            return;
            }
    }
        embeddedDriverCheck.setSelection(original ? driver.isOrigEmbedded() : driver.isEmbedded());
                            cell.setImage(DBeaverIcons.getImage(DBIcon.JAR));
            editMavenArtifact();
        }
        gd = new GridData(GridData.FILL_HORIZONTAL);
        driverURLText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_label_sample_url, CommonUtils.notEmpty(driver.getSampleURL()), SWT.BORDER | advStyle, gd);
                            }
        if (showAddFiles) {
        Text licenseText = new Text(paramsGroup, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
        DriverDescriptor oldDriver = provider.getDriverByName(driver.getCategory(), driver.getName());

            createParametersTab(tabFolder);
        licenseText.setText(license);
    private void saveDriverSettings(DriverDescriptor drv) {
        }

                File folderFile = new File(curFolder);

        String tooltip = "N/A";
        libraries.clear();
                !CommonUtils.isEmpty(driver.getDefaultDriverLoader().getLibraryFiles((DBPDriverLibrary) element));
        try (Stream<Path> list = Files.list(localFilePath)) {
        }
    private static int dialogCount;
            driver.getProviderDescriptor().getDriverProperties(),
                if (usedBy.size() <= 1) {
                } else {

        gd = new GridData(GridData.FILL_HORIZONTAL);
            }

        if (newDriver) {
                if (Files.isDirectory(file)) {
        driverPortText.addModifyListener(e -> onChangeProperty());
        this.driver.setName(this.driver.getName() + " Copy");
            SWT.BORDER | SWT.READ_ONLY
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
                UIUtils.showPreferencesFor(null, null, PrefPageDriversClasspath.PAGE_ID);
            if (!UIUtils.confirmAction(
        anonymousDriverCheck = UIUtils.createCheckbox(optionsPanel, UIConnectionMessages.dialog_edit_driver_anonymous_label, UIConnectionMessages.dialog_edit_driver_anonymous_tip, driver.isAnonymousAccess(), 1);
                for (DataSourceProviderDescriptor provider : DataSourceProviderRegistry.getInstance().getDataSourceProviders()) {
                    } else if (element instanceof DriverFileInfo dfi) {
    private Button deleteButton;
            Composite findClassGroup = new Composite(libsListGroup, SWT.TOP);
    private void syncDriverLibraries() throws DBException {
            UIConnectionMessages.dialog_edit_driver_propagate_driver_properties_label,
                }
    }
                changeLibContent();
                        } else {
    private boolean showAddFiles = false;
                            if (obj instanceof DriverLibraryAbstract) {
            if (localFilePath == null || !Files.exists(localFilePath)) {
        driverURLText.setText(CommonUtils.notEmpty(original ? driver.getOrigSampleURL() : driver.getSampleURL()));
        for (DBPDriverLibrary library : libraries) {
    }

        if (fd.open() == IDialogConstants.OK_ID) {
                        cell.setImage(DBeaverIcons.getImage(lib.getIcon()));
        libsControlGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
        gd.horizontalSpan = 4;


        saveDriverSettings(this.driver);

 */
        );
    }
                    final Object element = cell.getElement();


                        } else if (!classNames.isEmpty()) {
        clientHomesPanel = new ClientHomesPanel(group, SWT.NONE);
        public boolean hasChildren(Object element) {
import org.eclipse.swt.layout.RowLayout;

        drv.setDriverDefaultPort(driverPortText.getText());
 * See the License for the specific language governing permissions and

        }
            driver.getDriverParameters());
        if (original) {
            @Override
import org.eclipse.swt.events.SelectionEvent;
    }
            libTable.setLabelProvider(new CellLabelProvider() {
        this.driver.setModified(true);
                for (String fileName : fileNames) {
        final Composite group = super.createDialogArea(parent);

            fileController.deleteFile(
            byte[] fileData = Files.readAllBytes(localFilePath);
            return null;
        DriverLibraryAbstract selectedLib = getSelectedLibrary();
            findClassButton.addListener(SWT.Selection, event -> {
        paramsGroup.setLayout(new GridLayout(1, false));
import org.eclipse.swt.events.SelectionAdapter;
                        break;
        }
                    DriverEditHelpers.showFileInExplorer(Path.of(getPathFromDriverFileInfo(dfi)));
                // Skip files which are part of app installation (e.g. licenses)
            public void widgetSelected(SelectionEvent e) {
                                driver.resetDriverInstance();
import org.jkiss.dbeaver.model.DBFileController;

                            null));
            if (library instanceof DriverLibraryLocal libraryLocal) {
    private Text driverUserText;
        return ctl;
        } catch (IOException e) {
import org.eclipse.jface.dialogs.IDialogConstants;
            try {
                @Override
                        driver = provider.createDriver();
import java.nio.file.Files;
import org.jkiss.dbeaver.model.DBIcon;
        paramsTab.setText(UIConnectionMessages.dialog_edit_driver_setting);
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        group.setLayoutData(gd);
        parametersEditor = new PropertyTreeViewer(paramsGroup, SWT.BORDER);
        Composite paramsGroup = new Composite(group, SWT.NONE);
        deleteButton.setEnabled(false);
        return false;

    }
        // Store client homes
    private void syncRemoveDriverLibFile(DBPDriverLibrary library) throws DBException {
import org.jkiss.code.NotNull;
            UIUtils.createControlLabel(findClassGroup, UIConnectionMessages.dialog_edit_driver_label_driver_class);
        });


                        ) {
    private void createClientHomesTab(CTabFolder group) {
                            "Are you sure you want to continue with incomplete files?")
            classListCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                final Collection<DriverFileInfo> files = driver.getDefaultDriverLoader().getLibraryFiles(library);
            }
        drv.setName(driverNameText.getText());
                providerCombo.select(provider);
            updateVersionButton = UIUtils.createToolButton(libsControlGroup, UIConnectionMessages.dialog_edit_driver_button_update_version, new SelectionAdapter() {
            driverFilePath = storageFolder.relativize(localFilePath).toString();
                fileData);
    private static final Log log = Log.getLog(DriverEditDialog.class);
        CTabItem paramsTab = new CTabItem(group, SWT.NONE);
    }
import org.eclipse.osgi.util.NLS;
                    }
            });
        }
        if (isReadOnly) {


    }
            findClassGroup.setLayout(layout);
        this.driver = provider.createDriver(driver);
                        cell.setText(element.toString());

                DBWorkbench.getPlatformUI().showError("Error saving driver", "Driver libraries sync failed", e);
    protected void buttonPressed(int buttonId) {
                            }
                continue;
        paramsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_tooltip_license);
            loadSettings(true);
    }
        paramsTab.setControl(clientHomesPanel);
        fileInfo.setFileCRC(DriverUtils.calculateFileCRC(localFilePath));
                                libraries.remove(obj);

