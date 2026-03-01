 * limitations under the License.
    }
            downloadPage = new DriverDownloadAutoPage(isExpanded);
    }
    private boolean forceDownload;

    }
            downloadPage = new DriverDownloadManualPage();


        setHelpAvailable(false);
    private DriverDownloadPage downloadPage;
        return (DriverDownloadDialog)super.getContainer();
import org.eclipse.jface.viewers.IStructuredSelection;
        addPage(downloadPage);


    }
import org.eclipse.jface.wizard.Wizard;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
} *
        boolean isExpanded

    private final boolean isExpanded;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isAutoDownloadWizard() {


    public void addPages() {
import org.eclipse.ui.IExportWizard;
 * Unless required by applicable law or agreed to in writing, software
        this.updateVersion = updateVersion;

    public boolean canFinish()

        this.dependencies = dependencies;
        @NotNull DBPDriverDependencies dependencies,
        this.forceDownload = forceDownload;
        return forceDownload;
        }
        setNeedsProgressMonitor(isAutoDownloadWizard());
        return updateVersion;
    }

    private final DBPDriver driver;

        setWindowTitle(updateVersion ? UIConnectionMessages.dialog_driver_download_wizard_title_upload_files : UIConnectionMessages.dialog_driver_download_wizard_title_setup_files);
    void pageActivated(Object selectedPage) {
    public boolean isUpdateVersion() {
    }
    {
    }
        super.addPages();
        boolean updateVersion,
 *
    public DBPDriverDependencies getDependencies() {
    public void setForceDownload(boolean forceDownload) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            return UIConnectionMessages.dialog_driver_download_wizard_download;
    }
        } else {
        return downloadPage.performFinish();

    DBPDriver getDriver() {
 * You may obtain a copy of the License at
    }

import org.jkiss.code.NotNull;
public class DriverDownloadWizard extends Wizard implements IExportWizard {
    }
    public boolean isForceDownload() {
            return UIConnectionMessages.dialog_driver_download_wizard_open_download;
    public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
        return driver;

    public boolean performFinish() {
        return CommonUtils.isEmpty(getDriver().getDriverFileSources());
    ) {
    }
    }
package org.jkiss.dbeaver.ui.dialogs.driver;
import org.jkiss.utils.CommonUtils;
    @Override
        setNeedsProgressMonitor(isAutoDownloadWizard());
        this.forceDownload = forceDownload;
 *
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

        @NotNull DBPDriver driver,
    private final DBPDriverDependencies dependencies;
 */
        return true;
        downloadPage.resolveLibraries();
        boolean forceDownload,
    }
        if (isAutoDownloadWizard()) {
        this.driver = driver;
 * you may not use this file except in compliance with the License.
    private final boolean updateVersion;
        return dependencies;

        this.isExpanded = isExpanded;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DriverDownloadDialog getContainer() {
    @Override
        } else {
/*
        setWindowTitle(UIConnectionMessages.dialog_driver_download_wizard_title_setting);
    }
import org.eclipse.ui.IWorkbench;
        if (isAutoDownloadWizard()) {
    public String getFinishText() {
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
    public DriverDownloadWizard(
