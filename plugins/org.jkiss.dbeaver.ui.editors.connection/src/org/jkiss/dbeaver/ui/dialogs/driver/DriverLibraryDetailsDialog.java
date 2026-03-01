import org.eclipse.swt.custom.CTabFolder;
    @Override
package org.jkiss.dbeaver.ui.dialogs.driver;


        try {
    }

            depsTree.loadLibDependencies();
 *
import java.util.Collections;

 */
        licenseText.setEditable(false);
            false);

 *     http://www.apache.org/licenses/LICENSE-2.0
        }

        licenseText.setText(UIConnectionMessages.dialog_edit_driver_text_license);
        paramsGroup.setLayout(new GridLayout(1, false));
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        group.setLayoutData(gd);

            dependencies,
        final DriverDependenciesTree depsTree = new DriverDependenciesTree(
            UIConnectionMessages.dialog_edit_driver_info,
            fileText.setText(localFile.toAbsolutePath().toString());
 * See the License for the specific language governing permissions and
        Composite detailsGroup = new Composite(tabs, SWT.NONE);
    protected IDialogSettings getDialogBoundsSettings() {
    private static final String DIALOG_ID = "DBeaver.DriverLibraryDetailsDialog";//$NON-NLS-1$
 *
        createLicenseTab(tabs);
        gd.heightHint = 40;

    private void createLicenseTab(CTabFolder group) {
import java.nio.file.Path;
    private void createDetailsTab(CTabFolder tabs) {
import org.eclipse.swt.layout.GridLayout;
        Text descriptionText = new Text(detailsGroup, SWT.READ_ONLY | SWT.BORDER);

 * you may not use this file except in compliance with the License.
        final GridData gd = new GridData(GridData.FILL_BOTH);
    }
        //gd.grabExcessVerticalSpace = true;
        paramsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_tooltip_license);
            2,
        CTabFolder tabs = new CTabFolder(group, SWT.HORIZONTAL | SWT.FLAT);
import org.eclipse.swt.custom.CTabItem;
        return UIUtils.getDialogSettings(DIALOG_ID);
        final Set<DBPDriverLibrary> libList = Collections.singleton(library);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        getShell().setImage(DBeaverIcons.getImage(library.getIcon()));
        descriptionText.setText(CommonUtils.notEmpty(library.getDescription()));
    private final DBPDriver driver;
        licenseText.setLayoutData(gd);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    protected void createButtonsForButtonBar(Composite parent) {

    private void createDependenciesTab(CTabFolder tabs) {

            paramsGroup,
        detailsTab.setControl(detailsGroup);
    public DriverLibraryDetailsDialog(Shell shell, DBPDriver driver, DBPDriverLibrary library) {
import org.jkiss.dbeaver.ui.UIUtils;
        return group;
import org.eclipse.jface.dialogs.IDialogSettings;
        getShell().setText(NLS.bind(UIConnectionMessages.dialog_edit_driver_text_driver_library, driver.getName(), library.getDisplayName())); //$NON-NLS-2$
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }
            driver,
        Text fileText = UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_file, "", SWT.BORDER | SWT.READ_ONLY);

        final Path localFile = library.getLocalFile();
        this.library = library;
        CTabItem detailsTab = new CTabItem(tabs, SWT.NONE);

/**
    }

        descriptionText.setLayoutData(gd);
import org.jkiss.dbeaver.ui.DBeaverIcons;
        paramsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_name_license);
    @Override
    protected void buttonPressed(int buttonId) {
    protected Composite createDialogArea(Composite parent) {
        propsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Composite paramsGroup = new Composite(tabs, SWT.NONE);

        CTabItem paramsTab = new CTabItem(group, SWT.NONE);
        super.okPressed();

 *
import org.eclipse.osgi.util.NLS;
        createDependenciesTab(tabs);
        UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_library, library.getDisplayName(), SWT.BORDER | SWT.READ_ONLY);
        UIUtils.asyncExec(depsTree::resizeTree);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DriverLibraryDetailsDialog extends HelpEnabledDialog {
        this.driver = driver;
import org.jkiss.dbeaver.ui.IHelpContextIds;
    }
        if (localFile != null) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        CTabItem depsTab = new CTabItem(tabs, SWT.NONE);
import org.jkiss.dbeaver.ui.dialogs.HelpEnabledDialog;

import org.jkiss.dbeaver.DBException;
    private final DBPDriverLibrary library;
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            libList,
        UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_version, library.getVersion(), SWT.BORDER | SWT.READ_ONLY);
    }
        licenseText.setMessage(UIConnectionMessages.dialog_edit_driver_text_driver_license);
 * DriverEditDialog
        detailsGroup.setLayout(new GridLayout(1, false));
        depsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_depencencies_tooltip);
        detailsTab.setToolTipText(UIConnectionMessages.dialog_edit_driver_tab_detail_tooltip);
}
        tabs.setLayoutData(new GridData(GridData.FILL_BOTH));
 * You may obtain a copy of the License at
        gd.heightHint = 200;
import org.eclipse.swt.widgets.Composite;
            depsTree.handleDownloadError(e);
        super(shell, IHelpContextIds.CTX_DRIVER_EDITOR);

            UIUtils.getDefaultRunnableContext(),
import org.eclipse.swt.widgets.Shell;
        }
import java.util.Set;
        depsTab.setControl(paramsGroup);
        Composite paramsGroup = new Composite(group, SWT.NONE);
        Composite group = super.createDialogArea(parent);

        UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_path, library.getPath(), SWT.BORDER | SWT.READ_ONLY);
import org.eclipse.swt.SWT;
 * Unless required by applicable law or agreed to in writing, software
            group,
/*
    }
import org.jkiss.utils.CommonUtils;
        paramsTab.setControl(paramsGroup);
        createButton(parent, IDialogConstants.CLOSE_ID, IDialogConstants.CLOSE_LABEL, true);

        detailsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_detail);
        DriverDependencies dependencies = new DriverDependencies(libList);
import org.jkiss.dbeaver.registry.driver.DriverDependencies;
import org.eclipse.jface.dialogs.IDialogConstants;
        } catch (DBException e) {
            GridData.FILL_HORIZONTAL

        paramsGroup.setLayout(new GridLayout(1, false));
import org.eclipse.swt.layout.GridData;
        UIUtils.createControlLabel(detailsGroup, UIConnectionMessages.dialog_edit_driver_label_description);
        depsTab.setText(UIConnectionMessages.dialog_edit_driver_tab_depencencies);

        GridData gd = new GridData(GridData.FILL_BOTH);
        createDetailsTab(tabs);
    @Override

import org.eclipse.swt.widgets.Text;

        Composite propsGroup = UIUtils.createTitledComposite(
 */
        );
import org.jkiss.dbeaver.model.connection.DBPDriver;
        UIUtils.createLabelText(propsGroup, UIConnectionMessages.dialog_edit_driver_driver, driver.getName(), SWT.BORDER | SWT.READ_ONLY);


        Text licenseText = new Text(paramsGroup, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
        gd.widthHint = 500;
 * limitations under the License.
    }
