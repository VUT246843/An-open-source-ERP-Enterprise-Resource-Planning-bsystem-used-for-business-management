import org.eclipse.core.resources.*;
                            if (!Files.exists(contribFolder)) {
                            Path importLibFile = contribFolder.resolve(libName);
        if (project.exists()) {
import java.lang.reflect.InvocationTargetException;
        } catch (Exception e) {
        String driverURL = driverElement.getAttribute(RegistryConstants.ATTR_URL);
                        // Save drivers
                                try (OutputStream os = Files.newOutputStream(importLibFile)) {
package org.jkiss.dbeaver.tools.project;
        // Read and filter datasources config
                            driver.addDriverLibrary(relativePath, DBPDriverLibrary.FileType.jar);
        if (configFile == null || !configFile.exists()) {
/*
            project.open(RuntimeUtils.getNestedMonitor(monitor));
            throw new DBException("Project import is not supported in distributed workspaces");
        IFile configFile = project.getFile(DataSourceRegistry.LEGACY_CONFIG_FILE_NAME);
        }
                } else if (resource instanceof IProject) {
        setNeedsProgressMonitor(true);
                    }
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
                    // Not found - lets use first one
        for (Element libElement : XMLUtils.getChildElementList(driverElement, RegistryConstants.TAG_PROPERTY)) {
                libElement.getAttribute(RegistryConstants.ATTR_NAME),
        }
        // Update driver map
                monitor,
                    String archiveLibEntry = libMap.get(libPath);

                driver = matchedDrivers.get(0);
        monitor.subTask(CoreMessages.dialog_project_import_wizard_monitor_load_driver + driverName);
import org.w3c.dom.Element;
            return null;
                if (!file.exists()) {
            String name = attrElement.getAttribute(ExportConstants.ATTR_NAME);
            monitor.beginTask(CoreMessages.dialog_project_import_wizard_monitor_import_projects, zipFile.size());
        Map<String, String> libMap,

                    throw new DBException("Unsupported container type '" + resource.getClass().getName() + "'");

 * you may not use this file except in compliance with the License.
        }
                            String libAbsolutePath = importLibFile.toAbsolutePath().toString();
                    throw new DBException("Unsupported container type '" + resource.getClass().getName() + "'");
                // Maybe it is a directory
        }
            }
import org.eclipse.ui.IWorkbench;
        if (driver == null) {
            // Update driver references in datasources
            try {
            description.setComment(projectDescription);

                childResource = folder;
            importChildResources(
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                            String relativePath = libAbsolutePath.substring(contribPath.length());
        String driverDescription = driverElement.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                    continue;
                driver.setDriverDefaultPort(driverDefaultPort);
            monitor.worked(1);
                            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        DBPWorkspace workspace = DBWorkbench.getPlatform().getWorkspace();
                                        IOUtils.copyStream(is, os);
                }
                            if (!Files.exists(importLibFile)) {
        final InputStream configContents = configFile.getContents();
    }
                if (libFile.exists()) {
        if (dataSourceProvider == null) {
                projectElement,
                    filteredContent = filteredContent.replace("driver=\"" + entry.getKey() + "\"", "driver=\"" + entry.getValue() + "\"");
                File libFile = new File(libPath);
            dataSourceProvider.addDriver(driver);

        String driverName = driverElement.getAttribute(RegistryConstants.ATTR_NAME);
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        }
            UIUtils.run(getContainer(), true, true, new DBRRunnableWithProgress() {
            monitor.subTask("Import " + childName);
        boolean isCustom = CommonUtils.getBoolean(driverElement.getAttribute(RegistryConstants.ATTR_CUSTOM));

            });
	public boolean performFinish() {
import java.nio.file.Path;
            }
                importChildResources(monitor, folder, childElement, entryPath + "/", zipFile);
        IWorkspace eclipseWorkspace = DBPPlatformDesktop.getInstance().getWorkspace().getEclipseWorkspace();
                            }
import org.jkiss.utils.IOUtils;
                    }
        String driverDefaultPort = driverElement.getAttribute(RegistryConstants.ATTR_PORT);
                                }
import org.eclipse.core.runtime.QualifiedName;
                    final Element projectsElement = XMLUtils.getChildElement(metaDocument.getDocumentElement(), ExportConstants.TAG_PROJECTS);
        IProject project = eclipseWorkspace.getRoot().getProject(targetProjectName);

            // Load resources
                libElement.getAttribute(RegistryConstants.ATTR_NAME),
            for (;;) {
 *
 *
            }
                ex.getTargetException());
        // Parameters and properties
        project.create(description, 0, RuntimeUtils.getNestedMonitor(monitor));

                    file.create(zipFile.getInputStream(resourceEntry), true, RuntimeUtils.getNestedMonitor(monitor));
                    log.warn("Ambiguous driver '" + driverName + "' - multiple drivers with class '" + driverClass + "' found. First one will be used"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$


            }
            String childName = childElement.getAttribute(ExportConstants.ATTR_NAME);
}
                            // Make relative path
                                break;
            if (metaStream == null) {
                log.error(e1);
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
        if (!isCustom) {
                "Cannot import projects",

import java.util.zip.ZipEntry;
            }

        String driverId = driverElement.getAttribute(RegistryConstants.ATTR_ID);
    private void loadResourceProperties(DBRProgressMonitor monitor, IResource resource, Element element) throws CoreException, IOException


        setWindowTitle(CoreMessages.dialog_project_import_wizard_title);
                    if (driversElement != null) {
        Map<String, String> driverMap) throws IOException, DBException
                    final Element driversElement = XMLUtils.getChildElement(metaDocument.getDocumentElement(), RegistryConstants.TAG_DRIVERS);
            return false;
                metaStream.close();
        catch (InvocationTargetException ex) {
            monitor.subTask("Import project properties");
            false,
            }
        }
                                    }
    private void importChildResources(DBRProgressMonitor monitor, IContainer resource, Element resourceElement, String containerPath, ZipFile zipFile)
        }
            if (!CommonUtils.isEmpty(driverDefaultPort)) {
 *

                        ZipEntry libEntry = zipFile.getEntry(archiveLibEntry);
            }
        }
        String driverClass = driverElement.getAttribute(RegistryConstants.ATTR_CLASS);
                }
                throw new DBException("Cannot find meta file");
            ContentUtils.close(configContents);
import org.eclipse.jface.viewers.IStructuredSelection;
                buffer.append(line).append(GeneralUtils.getDefaultLineSeparator());
            final Map<String, String> libMap = new HashMap<>();
            boolean isDirectory = resourceEntry.isDirectory();
import java.io.*;
        description.setNatureIds(new String[] {DBeaverNature.NATURE_ID});
import org.jkiss.dbeaver.utils.ContentUtils;
                        monitor.done();
                log.warn("Driver '" + driverId + "' not found in data source provider '" + dataSourceProvider.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
import org.jkiss.dbeaver.Log;
                {
                    final Element libsElement = XMLUtils.getChildElement(metaDocument.getDocumentElement(), ExportConstants.TAG_LIBRARIES);
                libElement.getAttribute(RegistryConstants.ATTR_VALUE),
                            while (relativePath.charAt(0) == '/' || relativePath.charAt(0) == '\\') {
            monitor.worked(1);
            List<DriverDescriptor> matchedDrivers = new ArrayList<>();
    private void updateDriverReferences(DBRProgressMonitor monitor, IProject project, Map<String, String> driverMap) throws DBException, CoreException, IOException
                    try {
                                libElement.getAttribute(ExportConstants.ATTR_FILE));
            loadResourceProperties(monitor, project, projectElement);
            driver = dataSourceProvider.createDriver();
        }
                }
    }
                                }
                    }
                        throw new InvocationTargetException(e);
        for (Element attrElement : XMLUtils.getChildElementList(element, ExportConstants.TAG_ATTRIBUTE)) {
                    folder = ((IFolder)resource).getFolder(childName);
            monitor.done();
                    matchedDrivers.add(tmpDriver);
        UIUtils.showMessageBox(getShell(), CoreMessages.dialog_project_import_wizard_message_success_import_title, CoreMessages.dialog_project_import_wizard_message_success_import_message, SWT.ICON_INFORMATION);
                    "Import error",
    private void importProjects(DBRProgressMonitor monitor) throws IOException, DBException
                        for (Element projectElement : projectList) {
import org.jkiss.dbeaver.registry.RegistryConstants;
                    driver.addDriverLibrary(libPath, DBPDriverLibrary.FileType.jar);
                                    try (InputStream is = zipFile.getInputStream(libEntry)) {


import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
import org.jkiss.dbeaver.model.app.DBPWorkspace;
                                throw new IOException("Zip entry is outside of the target directory");
                project,
                            String libName = libFile.getName();
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
 * DBeaver - Universal Database Manager
                            if (!importLibFile.normalize().startsWith(contribFolder.normalize())) {
                } else if (resource instanceof IProject) {
                    // Read libraries map
            }
        }
            String qualifier = attrElement.getAttribute(ExportConstants.ATTR_QUALIFIER);
    {
                        final Collection<Element> projectList = XMLUtils.getChildElementList(projectsElement, ExportConstants.TAG_PROJECT);
 * limitations under the License.
        }
        finally {
	}
                    // Import projects
 * Copyright (C) 2010-2024 DBeaver Corp and others
            try {
            if (isDirectory) {
                            monitor.worked(1);
                    // Collect drivers to import
        }
                @Override
        String driverCategory = driverElement.getAttribute(RegistryConstants.ATTR_CATEGORY);
                final Document metaDocument = XMLUtils.parseDocument(metaStream);
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private ProjectImportData data = new ProjectImportData();
            for (Map.Entry<String, String> entry : driverMap.entrySet()) {

                    // Get driver library from archive
        
                resource.setPersistentProperty(new QualifiedName(qualifier, name), value);
import org.jkiss.utils.xml.XMLException;
        }
            List<String> libraryList = new ArrayList<>();
            monitor.worked(1);
            } else if (!matchedDrivers.isEmpty()) {
            driver.setModified(true);
                            if (monitor.isCanceled()) {
                                    Files.createDirectories(contribFolder);
        }
        }
            new ByteArrayInputStream(filteredContent.getBytes(GeneralUtils.DEFAULT_FILE_CHARSET)),
        catch (InterruptedException ex) {
        for (Element childElement : XMLUtils.getChildElementList(resourceElement, ExportConstants.TAG_RESOURCE)) {
        String targetProjectName = data.getTargetProjectName(projectName);
                String line = in.readLine();
 */
import org.jkiss.utils.xml.XMLUtils;
                }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
        if (DBWorkbench.isDistributed()) {
                if (line == null) {
        //addPage(new ProjectImportWizardPageFinal(data));
            driver.setDriverParameter(
    {
        }
                childResource = file;
            for (DriverDescriptor tmpDriver : dataSourceProvider.getEnabledDrivers()) {
            if (!CommonUtils.isEmpty(qualifier) && !CommonUtils.isEmpty(name) && !CommonUtils.isEmpty(value)) {
                                } catch (IOException e) {
                    if (archiveLibEntry != null) {
                {
        }
                }
    public ProjectImportWizard() {
        if (!DBWorkbench.getPlatform().getWorkspace().canManageProjects()) {
        super.addPages();
                    } catch (Exception e) {
import java.util.*;

        if (configFile == null || !configFile.exists()) {
                    if (libsElement != null) {
        configFile.setContents(
                if (CommonUtils.equalObjects(tmpDriver.getDriverClassName(), driverClass)) {
import org.w3c.dom.Document;
                    if (projectsElement != null) {
    }
import org.eclipse.jface.wizard.Wizard;
        DriverDescriptor driver = null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            driver.setSampleURL(driverURL);
                            }
                if (resource instanceof IFolder) {
                            }
            StringBuilder buffer = new StringBuilder();
                libraryList.add(libElement.getAttribute(RegistryConstants.ATTR_PATH));
        
import org.eclipse.core.runtime.CoreException;
            driver.setCategory(driverCategory);
            }

                } else {
    }
                throw new DBException("Cannot open meta file '" + metaEntry.getName() + "'"); //$NON-NLS-2$
            loadResourceProperties(monitor, childResource, childElement);
        throws DBException, CoreException, IOException
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                            // Extract driver to "drivers" folder
            driver = dataSourceProvider.getDriver(driverId);
                    if (CommonUtils.equalObjects(tmpDriver.getSampleURL(), driverURL) || CommonUtils.equalObjects(tmpDriver.getName(), driverName)) {
            return false;
            if (!CommonUtils.isEmpty(charset)) {
                            }
        try {
                                libElement.getAttribute(ExportConstants.ATTR_PATH),
            }

    {
        }
        return project;
                            if (monitor.isCanceled()) {
                            }
            filteredContent = buffer.toString();

        Element driverElement,
        return true;
    }
 * Unless required by applicable law or agreed to in writing, software
            } finally {
        final IProjectDescription description = eclipseWorkspace.newProjectDescription(project.getName());
 *     http://www.apache.org/licenses/LICENSE-2.0
            BufferedReader in = new BufferedReader(new InputStreamReader(configContents, GeneralUtils.DEFAULT_FILE_CHARSET));
                        for (Element libElement : libList) {
                        final Collection<Element> driverList = XMLUtils.getChildElementList(driversElement, RegistryConstants.TAG_DRIVER);
        // Add libraries (only for managable drivers with empty library list)
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
    private IProject importProject(DBRProgressMonitor monitor, Element projectElement, ZipFile zipFile, Map<String, String> driverMap)
            // Open project
import org.eclipse.ui.IImportWizard;
                    folder = ((IProject)resource).getFolder(childName);
                    }
            if (metaEntry == null) {
            // Try to find existing driver by class name
        return driver;

                throw new DBException("Cannot persist project", e);
            }
        addPage(new ProjectImportWizardPageFile(data));
                        }
import org.jkiss.dbeaver.DBException;
                    folder.create(true, true, RuntimeUtils.getNestedMonitor(monitor));
                            monitor.worked(1);
                        monitor.beginTask(CoreMessages.dialog_project_import_wizard_monitor_import_drivers, driverList.size());
                if (resource instanceof IFolder) {
    private static final Log log = Log.getLog(ProjectImportWizard.class);
import java.nio.file.Files;
            // Get driver by ID
            true,
                        for (Element driverElement : driverList) {
public class ProjectImportWizard extends Wizard implements IImportWizard {
	@Override
                            importProject(monitor, projectElement, zipFile, driverMap);

                    file = ((IProject)resource).getFile(childName);
            // Cleanup project which was partially imported
            final Map<String, String> driverMap = new HashMap<>();
        try {
            throw new DBException("Error importing project resources", e);
                            Path contribFolder = DriverDescriptor.getDriversContribFolder();

                ((IFile) resource).setCharset(charset, RuntimeUtils.getNestedMonitor(monitor));
            IResource childResource;
                } else {
            driver.setConnectionProperty(

                libElement.getAttribute(RegistryConstants.ATTR_VALUE));
                }
                if (!folder.exists()) {
            String entryPath = containerPath + childName;
            DBWorkbench.getPlatformUI().showError(

                        if (libEntry != null) {
                }
                    file = ((IFolder)resource).getFile(childName);

                zipFile);
        ZipFile zipFile,
            }

                    }
            }

                }
	}
        DBRProgressMonitor monitor,
        if (!CommonUtils.isEmpty(projectDescription)) {
                IFile file;
                } else {
            }
    {
                }
import org.eclipse.swt.SWT;
        if (driver == null) {
                                try {
        }
        try {
            final String charset = element.getAttribute(ExportConstants.ATTR_CHARSET);
    }
    }
        driverMap.put(driverId, driver.getId());

                    }
            throw new DBException("Project '" + targetProjectName + "' already exists");
            updateDriverReferences(monitor, project, driverMap);
            ZipEntry resourceEntry = zipFile.getEntry(entryPath);
                            libMap.put(
            RuntimeUtils.getNestedMonitor(monitor));
        String filteredContent;
    public void addPages() {
import java.util.zip.ZipFile;
                continue;
            } catch (XMLException e) {

                        }

                    // Just use path as-is (may be it is local re-import or local environments equal to export environment)
                }
            driver.setDriverClassName(driverClass);
            return;
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
            if (matchedDrivers.size() == 1) {
            if (resourceEntry == null) {
            DBWorkbench.getPlatformUI().showError("Import error", "You can't import projects");

        if (CommonUtils.isEmpty(driver.getDriverLibraries())) {
                // Multiple drivers with the same class - tru to find driver with the same sample URL or with the same name
        }

	@Override
            for (Element libElement : XMLUtils.getChildElementList(driverElement, RegistryConstants.TAG_FILE)) {
        String projectDescription = projectElement.getAttribute(ExportConstants.ATTR_DESCRIPTION);
            InputStream metaStream = zipFile.getInputStream(metaEntry);

        }
            } catch (CoreException e) {
        for (Element libElement : XMLUtils.getChildElementList(driverElement, RegistryConstants.TAG_PARAMETER)) {
import org.jkiss.dbeaver.ui.UIUtils;
            // Set project properties
        String providerId = driverElement.getAttribute(RegistryConstants.ATTR_PROVIDER);
        try (ZipFile zipFile = new ZipFile(data.getImportFile(), ZipFile.OPEN_READ)) {
                        final Collection<Element> libList = XMLUtils.getChildElementList(libsElement, RegistryConstants.TAG_FILE);
                        }
                            String contribPath = contribFolder.toAbsolutePath().toString();
                if (!entry.getKey().equals(entry.getValue())) {
            for (String libPath : libraryList) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            String value = attrElement.getAttribute(ExportConstants.ATTR_VALUE);
                throw new DBException("Cannot parse meta file", e);
    }
        String projectName = projectElement.getAttribute(ExportConstants.ATTR_NAME);
            configFile = project.getFile(DataSourceRegistry.LEGACY2_CONFIG_FILE_NAME);
                            importDriver(monitor, driverElement, zipFile, libMap, driverMap);
        }
        if (targetProjectName == null) {
            driver.setName(driverName);
    {
                    break;
            driver.setDescription(driverDescription);
 * You may obtain a copy of the License at
        DataSourceProviderDescriptor dataSourceProvider = DataSourceProviderRegistry.getInstance().getDataSourceProvider(providerId);
                                    log.error("Cannot create drivers folder '" + contribFolder.toAbsolutePath() + "'", e);
import org.jkiss.dbeaver.core.CoreMessages;
                ExportConstants.DIR_PROJECTS + "/" + projectName + "/", //$NON-NLS-1$ //$NON-NLS-2$

                project.delete(true, true, RuntimeUtils.getNestedMonitor(monitor));
                        DataSourceProviderRegistry.getInstance().saveDrivers();
                for (DriverDescriptor tmpDriver : matchedDrivers) {
 * See the License for the specific language governing permissions and
                if (driver == null) {
        }
            throw new DBException("Cannot find data source provider '" + providerId + "' for driver '" + driverName + "'");
                }

            return false;
        throws DBException, IOException, CoreException
                        break;
            }
                }
                }
        if (resource instanceof IFile) {
            } catch (CoreException e1) {

                false);
                    driver = matchedDrivers.get(0);
                IFolder folder;
                                break;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.rcp.DBeaverNature;
            if (driver == null) {
                        driver = tmpDriver;
import org.jkiss.dbeaver.registry.DataSourceRegistry;
                log.error("Project resource '" + entryPath + "' not found in archive");
                        }
            }
                        importProjects(monitor);

    {
            ZipEntry metaEntry = zipFile.getEntry(ExportConstants.META_FILENAME);
    private DriverDescriptor importDriver(
                                relativePath = relativePath.substring(1);
        // Update configuration
            } else {
                {
            // Create new driver
