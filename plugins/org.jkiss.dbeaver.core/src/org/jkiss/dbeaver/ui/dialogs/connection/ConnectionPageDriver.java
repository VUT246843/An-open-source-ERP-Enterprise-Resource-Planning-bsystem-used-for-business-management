        Dialog.applyDialogFont(placeholder);

import org.jkiss.dbeaver.model.connection.DBPDriver;
                //this.setMessage(selectedDriver.getDescription());
                true,
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettings;
                }

    private DriverSelectViewer driverSelectViewer;
                    filterIndentLabel = UIUtils.createEmptyLabel(filterGroup, 1, 1);
        controlsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        }
            } else {
        if (selection instanceof IStructuredSelection ss) {
                }
        // Sorter
    @Override
            setErrorMessage("The user needs more permissions to create a new connection.");
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    }
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    private ProjectSelectorPanel projectSelector;
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
            gd.widthHint = 400;
                public void widgetSelected(SelectionEvent e) {

    public boolean canFlipToNextPage() {
import org.jkiss.dbeaver.model.rm.RMConstants;
    }
            bottomPanel.setLayout(new GridLayout(2, false));
    public DBNBrowseSettings getNavigatorSettings() {


        {
import org.eclipse.swt.layout.RowLayout;



            // TODO: Show current driver info somehow. setMessage is super-slow (it re-layouts entire wizard dialog)
 * Driver selection page
import org.eclipse.jface.dialogs.Dialog;
                    ((GridLayout) filterIndentLabel.getParent().getLayout()).horizontalSpacing - 1;
    private DBPDriver selectedDriver;
    public void createControl(Composite parent) {
        ISelection selection = event.getSelection();
 * Unless required by applicable law or agreed to in writing, software
            if (projectSelector.getSelectedProject() == null) {
/**
                driverSelectViewer.getTabbedViewer().getFolderComposite().getTabsWidth() -
                    GridData gd = new GridData();
import org.eclipse.swt.events.SelectionAdapter;
        Composite controlsGroup = UIUtils.createComposite(placeholder, 4);
    @Override
    public DBPProject getConnectionProject() {

            Object selectedObject = ss.getFirstElement();
    @Override
            }
        UIUtils.asyncExec(() -> driverSelectViewer.getControl().setFocus());
            } else if (selectedObject instanceof DataSourceProviderDescriptor) {
        Composite placeholder = UIUtils.createComposite(parent, 1);
    }
            });

 *
            obScoreButton.setText(ob.getLabel());
 * You may obtain a copy of the License at
        for (DriverSelectViewer.OrderBy ob : DriverSelectViewer.OrderBy.values()) {
                    filterIndentLabel.setLayoutData(gd);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                getWizard().getAvailableProvides(),
        return projectSelector.getSelectedProject();
import org.eclipse.jface.viewers.*;
        DriverSelectViewer.OrderBy defaultOrderBy = DriverSelectViewer.getDefaultOrderBy();
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    public void selectionChanged(SelectionChangedEvent event) {
    @Override
        this.selectedDriver = null;

            }
                }
import org.eclipse.swt.layout.GridData;

    public boolean isPageComplete() {
            bottomPanel.setLayoutData(gd);
import org.jkiss.dbeaver.ui.UIUtils;
    }
            ) {
import org.eclipse.swt.SWT;
                DriverSelectViewer.SelectorViewType.browser
        new Label(orderGroup, SWT.NONE).setText(CoreMessages.driver_connection_sort_by + " ");
 *
                //this.setMessage(((DriverTreeViewer.DriverCategory) selectedObject).getName() + " drivers");
    public DBPDriver getSelectedDriver() {
                    createSorterControl(extraControlsComposite);
        return selectedDriver;
 * See the License for the specific language governing permissions and
    }
            driverSelectViewer = new DriverSelectViewer(
                    extraControlsComposite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
        getWizard().getContainer().updateButtons();
 * Licensed under the Apache License, Version 2.0 (the "License");
}    }
 * you may not use this file except in compliance with the License.
                    gd.widthHint = 100;

                //this.setMessage("");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        setDescription(CoreMessages.dialog_new_connection_wizard_start_description);
        super("newConnectionDrivers");

import org.jkiss.dbeaver.ui.IHelpContextIds;
import org.eclipse.swt.widgets.Label;
        orderGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
 *
 * limitations under the License.
        return this.projectSelector.getSelectedProject() != null && this.selectedDriver != null;
    }
        setControl(placeholder);
        }


        Composite orderGroup = new Composite(controlsGroup, SWT.NONE);
import org.jkiss.dbeaver.ui.dialogs.driver.DriverTreeViewer;
            if (ob == defaultOrderBy) {
    }
            NewConnectionWizard wizard = getWizard();
        UIUtils.setHelp(placeholder, IHelpContextIds.CTX_CON_WIZARD_DRIVER);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
import org.eclipse.swt.widgets.Control;
 */
class ConnectionPageDriver extends ActiveWizardPage<NewConnectionWizard> implements ISelectionChangedListener, IDoubleClickListener {
            if (selectedObject instanceof DriverDescriptor driver) {
        if (selectedDriver != null && projectSelector.getSelectedProject() != null) {
        this.selectedDriver = selectedDriver;
import org.eclipse.swt.widgets.Composite;
            obScoreButton.setToolTipText(ob.getDescription());
 * DBeaver - Universal Database Manager
            }
                protected void createExtraFilterControlsAfter(Composite filterGroup) {
import org.eclipse.swt.layout.GridLayout;
    ConnectionPageDriver(NewConnectionWizard wizard) {
            };
    }
    }
                protected void createExtraFilterControlsBefore(Composite filterGroup) {
                this,

package org.jkiss.dbeaver.ui.dialogs.connection;
                @Override


            ((GridData) filterIndentLabel.getLayoutData()).widthHint =
            gd.heightHint = 300;
                placeholder,
            obScoreButton.setData(ob);
            obScoreButton.addSelectionListener(new SelectionAdapter() {
        setTitle(CoreMessages.dialog_new_connection_wizard_start_title);
    }

import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.core.CoreMessages;
            wizard.getContainer().showPage(wizard.getNextPage(this));
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
        return canFlipToNextPage();
            UIUtils.createEmptyLabel(bottomPanel, 1, 1).setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                setErrorMessage("You need to create a project first");
        orderGroup.setLayout(new RowLayout());
 * step1
        }
import org.eclipse.swt.events.SelectionEvent;
    public void doubleClick(DoubleClickEvent event) {
                //this.setMessage(((DataSourceProviderDescriptor) selectedObject).getDescription());
            Button obScoreButton = new Button(orderGroup, SWT.RADIO);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            projectSelector = new ProjectSelectorPanel(bottomPanel, NavigatorUtils.getSelectedProject(), SWT.NONE, true);
                obScoreButton.setSelection(true);
import org.eclipse.swt.widgets.Button;

 */
                @Override
                        (DriverSelectViewer.OrderBy) obScoreButton.getData());

            GridData gd = new GridData(GridData.FILL_BOTH);
    @Override
                @Override
                selectedDriver = driver;
        return DataSourceNavigatorSettings.getDefaultSettings();
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    public void setSelectedDriver(DBPDriver selectedDriver) {
        }
    public void createSorterControl(Composite controlsGroup) {
                    ((GridLayout) filterGroup.getLayout()).numColumns++;
        {

            return false;
import org.jkiss.dbeaver.ui.dialogs.driver.DriverSelectViewer;
                    Composite extraControlsComposite = UIUtils.createComposite(filterGroup, 1);

        }
            Composite bottomPanel = new Composite(placeholder, SWT.NONE);
            } else if (selectedObject instanceof DriverTreeViewer.DriverCategory) {
    private Control filterIndentLabel;
                    driverSelectViewer.setOrderBy(
                    ((GridLayout) filterGroup.getLayout()).numColumns++;
            driverSelectViewer.getControl().setLayoutData(gd);
        if (!DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)) {
