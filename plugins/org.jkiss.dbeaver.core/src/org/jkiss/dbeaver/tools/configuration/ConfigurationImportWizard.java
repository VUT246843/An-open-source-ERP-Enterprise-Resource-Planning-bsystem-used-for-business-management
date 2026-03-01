                )) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IWorkbench;
    }
                }
                    while (nextEntry != null) {
}
import org.jkiss.code.NotNull;
                os.write(buffer, 0, br);
import java.util.zip.ZipInputStream;
 * DBeaver - Universal Database Manager
            @Override
                    return Status.error("Can't read configuration file");
                        if (!configFilePath.toFile().getParentFile().canWrite()) {
                    NLS.bind(CoreMessages.dialog_workspace_import_wizard_window_restart_dialog_message, GeneralUtils.getProductName())
 */
import java.nio.file.Path;
/*

        zipInputStream.closeEntry();
                            Files.createFile(configFilePath);
        mainPage = new ConfigurationImportWizardPage();
            }
        }
                if (UIUtils.confirmAction(getShell(),
 * See the License for the specific language governing permissions and
                            throw new IOException("Workspace directory is read-only");
        addPage(mainPage);
        Path workbench = DBWorkbench.getPlatform().getWorkspace().getMetadataFolder().resolve(".plugins/org.eclipse.core.runtime/.settings");
import org.jkiss.dbeaver.core.CoreMessages;
                try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile))) {
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle(CoreMessages.dialog_workspace_import_wizard_window_title);
            }
                } catch (FileNotFoundException exception) {
                File zipFile = Path.of(zipFilepath).toFile();
            for (int br = zipInputStream.read(buffer); br != -1; br = zipInputStream.read(buffer)) {
import java.nio.file.StandardOpenOption;
import org.eclipse.ui.IImportWizard;
                    }
                }
                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.viewers.IStructuredSelection;
 *
import java.nio.file.Files;

                            if (listFile.getName().equals(name)) {
        ConfigurationImportData configurationImportData = mainPage.getConfigurationImportData();
import org.jkiss.dbeaver.runtime.DBWorkbench;

    private void writeZipEntryToFile(@NotNull ZipInputStream zipInputStream, @NotNull File listFile) throws IOException {
    }
        super.addPages();
import java.util.zip.ZipEntry;
                    UIUtils.asyncExec(() -> PlatformUI.getWorkbench().restart());
import java.io.FileNotFoundException;
        return true;
        }
                if (!zipFile.exists() || !zipFile.canRead()) {
                            writeZipEntryToFile(zipInputStream, configFilePath.toFile());
                        }
                String zipFilepath = configurationImportData.getFilePath();
import org.eclipse.core.runtime.Status;
 *     http://www.apache.org/licenses/LICENSE-2.0

                    ZipEntry nextEntry = zipInputStream.getNextEntry();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.utils.GeneralUtils;
                return Status.OK_STATUS;
    private static final Log log = Log.getLog(ConfigurationExportWizard.class);
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.IOUtils;
        if (!workbench.toFile().exists() || !workbench.toFile().isDirectory() || !workbench.toFile().canRead()) {
                        if (configFilePath.toFile().exists()) {
 * you may not use this file except in compliance with the License.
                                writeZipEntryToFile(zipInputStream, listFile);
package org.jkiss.dbeaver.tools.configuration;
        setNeedsProgressMonitor(true);
        new Job("Importing workspace configuration") {
    }
    @Override
                        String name = nextEntry.getName();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void addPages() {
                    NLS.bind(CoreMessages.dialog_workspace_import_wizard_window_restart_dialog_title, GeneralUtils.getProductName()),
    ConfigurationImportWizardPage mainPage;
import org.jkiss.dbeaver.Log;
import java.io.FileInputStream;
                } catch (IOException exception) {
                        nextEntry = zipInputStream.getNextEntry();
    @Override
            return false;
import org.jkiss.dbeaver.ui.UIUtils;

                    return Status.error("Error reading file", exception);
            protected IStatus run(IProgressMonitor monitor) {
                        } else {
        try (var os = Files.newOutputStream(listFile.toPath(), StandardOpenOption.TRUNCATE_EXISTING)) {
import org.eclipse.core.runtime.IProgressMonitor;
public class ConfigurationImportWizard extends Wizard implements IImportWizard {
        byte[] buffer = new byte[IOUtils.DEFAULT_BUFFER_SIZE];
                }


import org.eclipse.osgi.util.NLS;
    @Override
        }.schedule();

import java.io.File;
import java.io.IOException;
 * limitations under the License.
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.IStatus;
                        Path configFilePath = workbench.resolve(name);
                            }
import org.eclipse.ui.PlatformUI;
                            File listFile = configFilePath.toFile();
            log.error("Error reading configuration");
 *
    public boolean performFinish() {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.wizard.Wizard;
                    return Status.error("File not found", exception);
