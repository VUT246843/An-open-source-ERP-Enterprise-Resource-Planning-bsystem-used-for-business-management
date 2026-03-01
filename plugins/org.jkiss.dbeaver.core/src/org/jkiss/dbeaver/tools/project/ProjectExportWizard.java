                return;

        addPage(mainPage);
                    "Export error",
        }
                        final Path libraryFile = fileDescriptor.getLocalFile();
                        if (libraryFile != null && !fileDescriptor.isDisabled() && Files.exists(libraryFile)) {

                        }
                if (dataSourceRegistry != null) {

                final DBPDataSourceRegistry dataSourceRegistry = project.getDataSourceRegistry();
        setNeedsProgressMonitor(true);
            // Start meta
                        exportData.archiveStream.closeEntry();
            {
import java.nio.file.Files;
import org.eclipse.jface.viewers.IStructuredSelection;
        exportData.meta.startElement(ExportConstants.TAG_PROJECT);
    }
                meta.startElement(ExportConstants.TAG_SOURCE);
                exportData.meta.endElement();
                        exportData.meta.startElement(RegistryConstants.TAG_FILE);
                        driverFile.setComment("Driver library"); //$NON-NLS-1$
    public void addPages() {
        String archiveName = exportData.getArchiveFileName() + ExportConstants.ARCHIVE_FILE_EXT;
                        }
        // Write meta info
            IFile file = (IFile)resource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        mainPage = new ProjectExportWizardPage(CoreMessages.dialog_project_export_wizard_main_page);
                if (child.isLinked()) {
        catch (InterruptedException ex) {
        }
            // Export children
        super.addPages();
            exportData.archiveStream.closeEntry();
    {
            // Just skip it
        setWindowTitle(CoreMessages.dialog_project_export_wizard_window_title);

        //IGNORED_RESOURCES.add(DBPDataSourceRegistry.CREDENTIALS_CONFIG_FILE_PREFIX);
            return 0;

/*
        exportData.archiveStream.putNextEntry(new ZipEntry(projectPath));
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
    private void exportResourceTree(DBRProgressMonitor monitor, ProjectExportData exportData, String parentPath, IResource resource) throws CoreException, IOException

import org.eclipse.osgi.util.NLS;
                        exportData.meta.addAttribute(ExportConstants.ATTR_PATH, libPath);
import java.nio.file.Path;
        }
                    exportData.meta.startElement(ExportConstants.TAG_LIBRARIES);
                    throw new InvocationTargetException(e);
            return;
            try (InputStream is = file.getContents()) {
                ex.getTargetException());
import org.jkiss.dbeaver.Log;
                // Export driver libraries
            exportData.archiveStream.putNextEntry(new ZipEntry(parentPath));
        catch (InvocationTargetException ex) {
    private void exportProject(DBRProgressMonitor monitor, ProjectExportData exportData, IProject project) throws CoreException, IOException
public class ProjectExportWizard extends Wizard implements IExportWizard {
            if (!exportData.getOutputFolder().mkdirs()) {
            archiveStream.finish();
                        monitor.worked(1);

        exportData.meta.addAttribute(ExportConstants.ATTR_NAME, project.getName());
            return false;

import org.jkiss.utils.xml.XMLBuilder;
    }
import java.util.Map;
                            monitor.done();
    private static final int COPY_BUFFER_SIZE = 5000;

import java.lang.reflect.InvocationTargetException;
 * distributed under the License is distributed on an "AS IS" BASIS,
                archiveStream.closeEntry();
                    for (DBPDataSourceContainer dataSourceDescriptor : dataSourceRegistry.getDataSources()) {
        FileOutputStream exportStream = new FileOutputStream(archiveFile);
        throws IOException, CoreException, InterruptedException

            exportResourceTree(monitor, exportData, projectPath, child);
 *     http://www.apache.org/licenses/LICENSE-2.0
    private ProjectExportWizardPage mainPage;
                        if (libFileNames.contains(libFileName)) {
            // Add folder entry
package org.jkiss.dbeaver.tools.project;
        return childCount;
        final String projectPath = ExportConstants.DIR_PROJECTS + "/" + project.getName() + "/"; //$NON-NLS-1$ //$NON-NLS-2$
        if (archiveFile.exists()) {


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            exportData.archiveStream.putNextEntry(new ZipEntry(parentPath + resource.getName()));
                true
                        try (InputStream is = Files.newInputStream(libFile)) {
                NLS.bind(CoreMessages.dialog_project_export_wizard_file_overwrite_confirm, archiveName),
        return true;
                }
 *
        
import java.util.HashMap;
            ContentUtils.close(exportStream);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IExportWizard;
            // Add file to archive
        exportData.meta.startElement(ExportConstants.TAG_RESOURCE);
                            IOUtils.copyStream(is, exportData.archiveStream, COPY_BUFFER_SIZE);
            Map<DBPProject, Integer> resCountMap = new HashMap<>();
        IGNORED_RESOURCES.add(PROJECT_DESC_FILE);

                        final Path libFile = libPathMap.get(libPath);
    private void exportProjects(DBRProgressMonitor monitor, final ProjectExportData exportData)
            }


            });
 *

        }
                            continue;
    }
                meta.endElement();
                throw new IOException("Cannot create directory '" + exportData.getOutputFolder().getAbsolutePath() + "'"); //$NON-NLS-2$
            // Add meta to archive

                }
    }
        exportData.meta.endElement();

        if (resource instanceof IContainer) {
            for (IResource child : ((IContainer) resource).members()) {

        if (DBPPlatformDesktop.getInstance().getWorkspace().getResourceHandler(resource) == null) {
        if (IGNORED_RESOURCES.contains(resource.getName())) {
    {
	}
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                meta.addAttribute(ExportConstants.ATTR_TIME, System.currentTimeMillis());

import org.jkiss.dbeaver.registry.RegistryConstants;

	}

import org.eclipse.core.resources.*;
        }
    private static final Log log = Log.getLog(ProjectExportWizard.class);

                for (DBPDriver driver : exportData.usedDrivers) {
            // Finish archive creation
                    for (String libPath : libPathMap.keySet()) {
        }
                try (var ignored = exportData.meta.startElement(ExportConstants.TAG_PROJECTS)) {
 * See the License for the specific language governing permissions and
        for (IResource child : project.members(IContainer.INCLUDE_HIDDEN)) {
        try {
import org.jkiss.dbeaver.utils.RuntimeUtils;
}
            }


    private static final Set<String> IGNORED_RESOURCES = new HashSet<>();
                        monitor.subTask(libFileName);
            if (!overwrite) {
            if (exportData.isExportDrivers()) {
        // Add project folder
import org.eclipse.core.runtime.CoreException;
                    for (DBPDriverLibrary fileDescriptor : driver.getDriverLibraries()) {
        if (!exportData.getOutputFolder().exists()) {

    private static final String PROJECT_DESC_FILE = IProjectDescription.DESCRIPTION_FILE_NAME;
            }
            {
                    continue;
        exportData.meta.addAttribute(ExportConstants.ATTR_DESCRIPTION, project.getDescription().getComment());
        }
            );


                        exportData.archiveStream.putNextEntry(driverFile);
            }
            for (IResource child : members) {
import org.jkiss.dbeaver.core.CoreMessages;
            }
        monitor.worked(1);
	public boolean performFinish() {
            meta.addAttribute(ExportConstants.ATTR_VERSION, ExportConstants.ARCHIVE_VERSION_CURRENT);
            meta.startElement(ExportConstants.TAG_ARCHIVE);
                InetAddress localHost = RuntimeUtils.getLocalHostOrLoopback();
                meta.addAttribute(ExportConstants.ATTR_ADDRESS, localHost.getHostAddress());
                    }
                }

                try {
        final ProjectExportData exportData = mainPage.getExportData();
import java.net.InetAddress;
                    exportData.meta.endElement();
        

                IOUtils.copyStream(is, exportData.archiveStream, COPY_BUFFER_SIZE);
                    driversFolder.setComment("Database driver libraries"); //$NON-NLS-1$
        // Export resources
                    }
                archiveStream.putNextEntry(new ZipEntry(ExportConstants.META_FILENAME));
import org.eclipse.jface.wizard.Wizard;
                "Cannot export projects",
                    monitor.beginTask(CoreMessages.dialog_project_export_wizard_monitor_export_libraries, libFiles.size());
                }
            exportData.archiveStream.closeEntry();
	@Override
                // Export source info
        project.refreshLocal(IResource.DEPTH_INFINITE, RuntimeUtils.getNestedMonitor(monitor));
        monitor.subTask(parentPath + resource.getName());
            }
            }
                            exportProject(monitor, exportData, project.getEclipseProject());

import java.util.zip.ZipEntry;

            final IResource[] members = ((IContainer) resource).members(IContainer.INCLUDE_HIDDEN | IContainer.INCLUDE_TEAM_PRIVATE_MEMBERS);
                            continue;
    private int getChildCount(ProjectExportData exportData, IResource resource) throws CoreException
    @Override
                if (!libFiles.isEmpty()) {
                        exportData.usedDrivers.add(dataSourceDescriptor.getDriver());
import org.jkiss.dbeaver.utils.GeneralUtils;
    public ProjectExportWizard() {
                Set<Path> libFiles = new HashSet<>();
                Map<String, Path> libPathMap = new HashMap<>();
                    final ZipEntry driversFolder = new ZipEntry(ExportConstants.DIR_DRIVERS + "/"); //$NON-NLS-1$
            exportData.initExport(DBPPlatformDesktop.getInstance().getWorkspace(), meta, archiveStream);
                meta.addAttribute(ExportConstants.ATTR_HOST, localHost.getHostName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            // Skip it
            }
import org.jkiss.dbeaver.model.rcp.RCPProject;

        } finally {

                    }

                            log.warn("Duplicate driver library file name: " + libFileName); //$NON-NLS-1$
                        } finally {
        }
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                childCount += getChildCount(exportData, child);
                            libFiles.add(libraryFile);

import java.io.*;
 * DBeaver - Universal Database Manager
    {

                exportResourceTree(monitor, exportData, parentPath, child);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
import org.jkiss.dbeaver.model.app.DBPProject;
                    monitor.done();
                        libFileNames.add(libFileName);
                            libPathMap.put(fileDescriptor.getPath(), libraryFile);
        // Refresh project
        if (resource instanceof IContainer) {
                }



                    for (RCPProject project : exportData.getProjectsToExport()) {
            }
    {
import org.eclipse.ui.IWorkbench;
            parentPath = parentPath + resource.getName() + "/"; //$NON-NLS-1$
            ZipOutputStream archiveStream = new ZipOutputStream(exportStream);
        int childCount = 1;
                }
 * You may obtain a copy of the License at
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        } else {
        try {
            XMLBuilder meta = new XMLBuilder(metaBuffer, GeneralUtils.UTF8_ENCODING);
        }

                        monitor.beginTask(NLS.bind(CoreMessages.dialog_project_export_wizard_monitor_export_project, project.getName()), resCountMap.get(project));

            return false;

            DBWorkbench.getPlatformUI().showError(
        monitor.subTask(project.getName());
                        // Check for file name duplications
 * you may not use this file except in compliance with the License.
                        }
            monitor.beginTask(CoreMessages.dialog_project_export_wizard_monitor_collect_info, exportData.getProjectsToExport().size());
                } catch (Exception e) {
            {
	@Override
            ByteArrayOutputStream metaBuffer = new ByteArrayOutputStream(10000);
                // Export projects
                        exportData.meta.addAttribute(ExportConstants.ATTR_FILE, "drivers/" + libFileName); //$NON-NLS-1$
                        try {
 */
                        }
                        exportData.meta.endElement();
                        if (Files.isDirectory(libFile)) {
                        }
            monitor.done();
    }
            for (RCPProject project : exportData.getProjectsToExport()) {
            boolean overwrite = DBWorkbench.getPlatformUI().confirmAction(
                        final ZipEntry driverFile = new ZipEntry(ExportConstants.DIR_DRIVERS + "/" + libFileName); //$NON-NLS-1$
                    exportData.archiveStream.putNextEntry(driversFolder);
        }
                    }
import java.util.HashSet;
            UIUtils.run(getContainer(), true, true, monitor -> {
    }
                    exportData.archiveStream.closeEntry();
                archiveStream.write(metaBuffer.toByteArray());

 * Copyright (C) 2010-2024 DBeaver Corp and others
                resCountMap.put(project, getChildCount(exportData, project.getEclipseProject()));
import java.util.Set;
        exportData.meta.endElement();
import org.jkiss.dbeaver.utils.ContentUtils;
    }
import org.jkiss.dbeaver.ui.UIUtils;
        exportData.meta.addAttribute(ExportConstants.ATTR_NAME, resource.getName());
                monitor.worked(1);
        exportData.archiveStream.closeEntry();

                    Set<String> libFileNames = new HashSet<>();
import java.util.zip.ZipOutputStream;

import org.jkiss.utils.IOUtils;
                    exportProjects(monitor, exportData);
        monitor.worked(1);
            }
                        final String libFileName = libFile.getFileName().toString();
        File archiveFile = new File(exportData.getOutputFolder(), archiveName);
    static {
 *
                CoreMessages.dialog_project_export_wizard_file_overwrite_window_title,
import org.jkiss.dbeaver.model.connection.DBPDriver;
        } else if (resource instanceof IFile) {
                // Add used drivers to export data
                exportData.meta.flush();
