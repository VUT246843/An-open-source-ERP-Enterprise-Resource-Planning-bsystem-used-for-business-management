                selectFileSource(driver.getDriverFileSources().get(sourceCombo.getSelectionIndex()));
        fileSource = source;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        filesGroup.setLayoutData(gd);
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

            @Override
                !file.isOptional() ? UIConnectionMessages.dialog_driver_download_manual_page_yes : UIConnectionMessages.dialog_driver_download_manual_page_no,
            public void widgetSelected(SelectionEvent e) {
        driverLink.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.layout.GridData;
        }
import org.jkiss.utils.CommonUtils;
        infoText.setLayoutData(gd);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        driverLink.setText("<a>" + driver.getDriverFileSources().get(0).getUrl() + "</a>");
    private Table filesTable;
        });
 *
package org.jkiss.dbeaver.ui.dialogs.driver;
        selectFileSource(driver.getDriverFileSources().get(0));

        });
    }
        gd.verticalIndent = 10;

        filesTable.setHeaderVisible(true);
        Composite filesGroup = UIUtils.createTitledComposite(
 *
import org.jkiss.dbeaver.model.connection.DBPDriver;
    void resolveLibraries() {
            }

        );

        infoText.addSelectionListener(new SelectionAdapter() {
        setControl(composite);
        infoText.setText(NLS.bind(UIConnectionMessages.dialog_driver_download_manual_page_driver_file_missing_text, driver.getFullName()));
    @Override
        UIUtils.packColumns(filesTable, true);
 */
import org.eclipse.swt.events.SelectionEvent;

        gd = new GridData(GridData.FILL_HORIZONTAL);
            public void widgetSelected(SelectionEvent e) {
            composite,
        UIUtils.createTableColumn(filesTable, SWT.LEFT, UIConnectionMessages.dialog_driver_download_manual_page_column_required);

        });

 * distributed under the License is distributed on an "AS IS" BASIS,
        final Combo sourceCombo = new Combo(filesGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
            new TableItem(filesTable, SWT.NONE).setText(new String[] {
    @Override

 * you may not use this file except in compliance with the License.
    }
    boolean performFinish() {
    private void selectFileSource(DBPDriverFileSource source) {
    public void createControl(Composite parent) {
        setPageComplete(false);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        return false;
        final DBPDriver driver = getWizard().getDriver();

/*
import org.eclipse.swt.events.SelectionAdapter;
    private DBPDriverFileSource fileSource;
    }
}
//        DriverEditDialog dialog = new DriverEditDialog(null, getWizard().getDriver());
//        dialog.open();
            }
            sourceCombo.add(source.getName());


        filesTable.removeAll();
        return fileSource != null;
            1,
        driverLink.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.SWT;

import org.eclipse.osgi.util.NLS;
        setMessage(NLS.bind(UIConnectionMessages.dialog_driver_download_manual_page_download_config_driver_file, driver.getFullName()));
 * DBeaver - Universal Database Manager
    }

                UIUtils.openWebBrowser(driver.getDriverFileSources().get(sourceCombo.getSelectionIndex()).getUrl());
import org.jkiss.dbeaver.model.connection.DBPDriverFileSource;
            }
                file.getName(),
 * See the License for the specific language governing permissions and

        UIUtils.asyncExec(() -> UIUtils.openWebBrowser(fileSource.getUrl()));
                CommonUtils.notEmpty(file.getDescription()) });
        sourceCombo.addSelectionListener(new SelectionAdapter() {
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.*;
        UIUtils.createTableColumn(filesTable, SWT.LEFT, UIConnectionMessages.dialog_driver_download_manual_page_column_description);
        super(UIConnectionMessages.dialog_driver_download_manual_page_config_driver_file, UIConnectionMessages.dialog_driver_download_manual_page_download_driver_file, null);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        sourceCombo.select(0);
        filesTable = new Table(filesGroup, SWT.BORDER | SWT.FULL_SELECTION);
        final Link driverLink = new Link(filesGroup, SWT.NONE);
import org.jkiss.dbeaver.ui.UIUtils;
            @Override
    }
    @Override
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        filesTable.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        createLinksPanel(composite);
        UIUtils.createTableColumn(filesTable, SWT.LEFT, UIConnectionMessages.dialog_driver_download_manual_page_column_file);

            public void widgetSelected(SelectionEvent e) {
        composite.setTabList(ArrayUtils.remove(Control.class, composite.getTabList(), infoText));

    DriverDownloadManualPage() {
        for (DBPDriverFileInfo file : fileSource.getFiles()) {

        for (DBPDriverFileSource source : driver.getDriverFileSources()) {
        Link infoText = new Link(composite, SWT.NONE);
                driverLink.setText("<a>" + driver.getDriverFileSources().get(sourceCombo.getSelectionIndex()).getUrl() + "</a>");
import org.jkiss.utils.ArrayUtils;
            GridData.FILL_HORIZONTAL
        }
    public boolean isPageComplete() {

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    }
                getWizard().getContainer().buttonPressed(DriverDownloadDialog.EDIT_DRIVER_BUTTON_ID);

 *
        // do nothing
class DriverDownloadManualPage extends DriverDownloadPage {
import org.jkiss.dbeaver.model.connection.DBPDriverFileInfo;
            UIConnectionMessages.dialog_driver_download_manual_page_driver_file,
