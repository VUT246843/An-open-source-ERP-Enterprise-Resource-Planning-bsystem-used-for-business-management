        String path = exportData.getFile();
                }
                }
        new Job("Copying workspace configuration") {
        if (!exportData.getFile().endsWith(".zip")) {

                            File confFile = file.toFile();
    }
    private static final Log log = Log.getLog(ConfigurationExportWizard.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.nio.file.SimpleFileVisitor;
        setWindowTitle(CoreMessages.dialog_workspace_export_wizard_window_title);
                        }
import org.eclipse.core.runtime.Status;
        }


                    if (!delete) {
                            }
import java.io.FileInputStream;
import java.nio.file.FileVisitResult;
                        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                }
                    boolean delete = zipFile.toFile().delete();
                                byte[] writeBuffer = new byte[IOUtils.DEFAULT_BUFFER_SIZE];
                    }
            return false;

        Path zipFile = Path.of(path);
 * Unless required by applicable law or agreed to in writing, software
                    });
import java.io.FileOutputStream;
            log.error("Error reading workspace configuration");
    public boolean performFinish() {
}
    }
        Path workbench = DBWorkbench.getPlatform().getWorkspace().getMetadataFolder().resolve(".plugins/org.eclipse.core.runtime/.settings");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ConfigurationExportData exportData = pageMain.getExportData();
 */
import java.util.zip.ZipEntry;
import org.eclipse.ui.IWorkbench;
                            zos.finish();
/*
                                    zos.write(writeBuffer, 0, br);
    public void init(IWorkbench workbench, IStructuredSelection selection) {
                if (parent != null && !parent.toFile().canWrite()) {
                if (zipFile.toFile().exists()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    Files.walkFileTree(workbench, new SimpleFileVisitor<>() {
            return Status.OK_STATUS;
 *
                    log.error("Error copying file configuration:" + e);
            @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    Status.error(e.getMessage());
        if (!workbench.toFile().exists() || !workbench.toFile().isDirectory() || !workbench.toFile().canRead()) {
                        }
import org.eclipse.core.runtime.IStatus;
    @Override
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.wizard.Wizard;
import org.jkiss.dbeaver.core.CoreMessages;
    private ConfigurationExportWizardPage pageMain;
public class ConfigurationExportWizard extends Wizard implements IExportWizard {
    @Override
import java.nio.file.Files;
                } catch (IOException e) {
                    return Status.error("Can't create a file, because the export destination is read-only");
import org.jkiss.dbeaver.Log;
                        @Override
            path += ".zip";
 * DBeaver - Universal Database Manager
import org.eclipse.jface.viewers.IStructuredSelection;
import java.io.IOException;
import org.eclipse.core.runtime.IProgressMonitor;
                            zos.closeEntry();
                        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        return Status.error("Error deleting previous ZIP file contents");
                            try (FileInputStream fis = new FileInputStream(confFile)) {
import org.eclipse.ui.IExportWizard;
                                    fis.read(writeBuffer)) {
import java.nio.file.attribute.BasicFileAttributes;
        }.schedule();
import java.io.File;


 * limitations under the License.
        return true;
import org.eclipse.core.runtime.jobs.Job;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * You may obtain a copy of the License at

            }
                            return super.postVisitDirectory(dir, exc);
        }
import java.util.zip.ZipOutputStream;
 * Licensed under the Apache License, Version 2.0 (the "License");
                            zos.putNextEntry(new ZipEntry(file.toFile().getName()));
 * See the License for the specific language governing permissions and
    }

        pageMain = new ConfigurationExportWizardPage();
import java.nio.file.Path;
                                for (int br = fis.read(writeBuffer); br != -1; br =
                                }
    public void addPages() {
 *
                try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile.toFile()))) {
    @Override
            protected IStatus run(IProgressMonitor monitor) {

        super.addPages();
                            return FileVisitResult.CONTINUE;
                Path parent = zipFile.getParent();
                                zos.flush();
import org.jkiss.utils.IOUtils;
                        @Override
        setNeedsProgressMonitor(true);
package org.jkiss.dbeaver.tools.configuration;
        addPage(pageMain);
 *
