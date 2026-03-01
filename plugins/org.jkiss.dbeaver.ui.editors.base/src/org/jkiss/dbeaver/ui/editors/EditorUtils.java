                if (localFile != null) {
        }
        }
        return selectedAction;
        if (editorInput instanceof IDatabaseEditorInput dei) {
            if (!IOUtils.isLocalPath(path) || Files.exists(path)) {
            }
        }

            return (DatabaseEditorContext) ((IInMemoryEditorInput) editorInput).getProperty(PROP_EDITOR_CONTEXT);
            if (editorInput instanceof DBPDataSourceContainerProvider containerProvider) {
            return null;
                catalog = DBUtils.getParentOfType(DBSCatalog.class, context.getSelectedObject());
 * See the License for the specific language governing permissions and
                    filesByExtension.computeIfAbsent(extension, d -> new ArrayList<>()).add(path);
        } else {
            IFile curFile = EditorUtils.getFileFromInput(editorInput);
    public static void setInputInputFile(
            if (file != null) {
            IFile file = getFileFromInput(editorInput);
        } catch (CoreException e) {
        return getFileEditorDescriptor(file.toPath(), window);
                continue;
            if (dataSourceId != null && (forceRegistryLoad || projectMeta.isRegistryLoaded())) {
                    return defaultSchema.getName();
                }
            } else {
import org.jkiss.dbeaver.model.app.DBPProject;
        if (contextService != null) {
                    log.debug("Datasource " + dataSourceId + " not found in project " + projectMeta.getName() + " (" + file.getFullPath().toString() + ")");
        return UIUtils.runWithMonitor(monitor -> {
            if (IOUtils.isLocalPath(path) && Files.isDirectory(path)) {
            .map(Path::of).toArray(Path[]::new);
                }
                public void focusGained(FocusEvent e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        Stream<String> fileNameStream = Arrays.stream(fileNames);
            }
        if (projectMeta != null) {
        // Try to get path input adapter (works for external files)
            //log.debug("Error getting file from editor input with reflection: " + e.getMessage());
    }
        }

                log.error(e);
                        projectMeta.getDataSourceRegistry().getDataSource(dataSourceId);
        return null;
 *
                IPath location = file.getLocation();
        @NotNull IEditorInput editorInput,
        DBCExecutionContext executionContext = context.getExecutionContext();
                }
                File localFile = new File(uri);
 *
     */
    }

                if (activation[0] != null) {
    }

            // Most likely it is an external file

    }
            if (file != null) {
        project.setResourceProperty(project.getResourcePath(resource), propName, value);
    @NotNull
        if (desc == null) {
                if (extension != null && databaseOnly && !extension.getDescriptor().isDatabaseHandler()) {
        efManager.setFileProperty(
 * You may obtain a copy of the License at
                try {
import java.nio.file.Path;

        if (file != null) {
        if (pathInput != null) {
                }
    public static void refreshPartContexts(IWorkbenchPart part) {
            }
            return path == null ? null : ResourceUtils.convertPathToWorkspaceFile(path);
                        }
//                if (activationSQL != null) {
    }
                return sei.getStorage();
            if (curFile != null) {

    }
    }
 */
        if (desc == null) {
        if (!isDefaultContextSettings(context)) {
            IEditorDescriptor desc = getFileEditorDescriptor(path, window);
    @Nullable
                        log.error("Can't locate project '" + projectName + "' in workspace");
        return filesByExtension;
        IFile file = getFileFromInput(editorInput);
import java.lang.reflect.InvocationTargetException;
            }
    }
        }
            .toList());
    public static String[] getInputContextDefaults(DBPDataSourceContainer dataSource,  IEditorInput editorInput) {
    }
        Map<FileTypeHandlerDescriptor, List<Path>> filesByHandler = new LinkedHashMap<>();
            // We check for instanceof (do not use adapter) because otherwise it become active
    public static boolean openFileEditors(
            } else {
        for (Path path : fileNames) {
        }
                return location == null ? null : location.toPath();
            return new String[] { null, null };
                }

    public static DBCExecutionContext getInputExecutionContext(IEditorInput editorInput) {
    /**
/*
                return location == null ? null : location.toFile();
            String schemaName = getDefaultSchemaName(context);
                    DBPDataSource dataSource = dbo.getDataSource();
            ((IInMemoryEditorInput) editorInput).setProperty(PROP_INPUT_FILE, file);

            return null;
    }
    }
        } else if (editorInput instanceof IFileEditorInput fei) {
                if (catalogName != null) inMemoryEditorInput.setProperty(PROP_CONTEXT_DEFAULT_CATALOG, getDefaultCatalogName(context));
        if (editorPart instanceof DBPContextProvider && editorPart instanceof IDataSourceContainerUpdate) {
import java.lang.reflect.Method;
        log.debug("Open external file(s) [" + Arrays.toString(fileNames) + "]");
                @Override
                }
        } else {
import org.eclipse.ui.texteditor.ITextEditor;
import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;

        if (projectMeta == null) {
        } catch (Exception e) {
            return IDE.openEditor(window.getActivePage(), input, desc.getId());
            File localFile = getLocalFileFromInput(editorInput);
        return "Auto save all editors".equals(currentJob.getName());
            }
                        null :
        @NotNull DatabaseEditorContext context)
                    }
        @NotNull Path[] fileNames,
                if (sourceNode != null) {
                } catch (DBCException e) {
        if (element instanceof IAdaptable adaptable) {
            if (localFile != null) {
                continue;
        boolean databaseOnly
            // Refresh auto-commit element state (#3315)
            boolean allRemote = pathList.stream().noneMatch(IOUtils::isLocalPath);
            try {
import org.eclipse.ui.ide.IDE;

        });
            });
            }
        RCPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(file.getProject());
        }
    }

                return file;
        boolean databaseOnly,
        return null;
        File localFile = getLocalFileFromInput(element);
        return null;
//                if (activationNavigator != null) {
        return null;
    @Nullable
import org.eclipse.core.resources.IResource;
        String defaultCatalogName = null;
                        ContentUtils.copyStreams(is, Files.size(remotePath), os, monitor);
                if (schemaName != null) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.rcp.RCPProject;
            if (element instanceof IURIEditorInput uriei) {
import java.nio.charset.StandardCharsets;
        String defaultSchema = null;
            }
            control.addFocusListener(focusListener);

import java.net.URI;
    }
            if (!IOUtils.isLocalPath(path) || Files.exists(path)) {
import org.eclipse.ui.contexts.IContextService;
        return null;
                filesByHandler.computeIfAbsent(handler, d -> new ArrayList<>()).add(path);
    {
        return new String[] { defaultCatalogName, defaultSchema };
import org.jkiss.dbeaver.ui.ActionUtils;
 */
    }
            try {
        }
                            return false;
//            if (part instanceof INavigatorModelView) {
        if (!CommonUtils.isEmpty(defaultDatasource) && !defaultDatasource.equals(dataSource.getId())) {
        String dataSourceId = dataSourceContainer == null ? null : dataSourceContainer.getId();
            defaultDatasource = (String) mei.getProperty(DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE);
    }
    }
    public static Path copyRemoteFileToTempDir(@NotNull Path remotePath) throws DBException {
            desc = window.getWorkbench().getEditorRegistry().getDefaultEditor(fileName + ".txt");
        }
                        activation[0] = null;
    public static File getLocalFileFromInput(Object element) {
    public static IStorage getStorageFromInput(Object element) {
        @Nullable DBNPathBase sourceNode
                }
                    defaultCatalogName = (String) efManager.getFileProperty(localFile, PROP_CONTEXT_DEFAULT_CATALOG);
    ) {
    public static boolean isInAutoSaveJob() {
    public static Object getResourceProperty(@NotNull RCPProject project, @NotNull IResource resource, @NotNull String propName) {
 * you may not use this file except in compliance with the License.
            if (element instanceof IURIEditorInput uriei) {
                            pathList.set(i, copyRemoteFileToTempDir(path));
        } else if (editorInput instanceof IInMemoryEditorInput mei) {
                openedFiles.add(path);
    }
                }
                        RuntimeUtils.runTask(monitor -> {
        return project.getResourceProperty(project.getResourcePath(resource), propName);
public class EditorUtils {
        } else if (actionList.size() == 1) {
    }
        FileTypeAction selectedAction = null;
        return openExternalFileEditor(file.toPath(), window);
    public static final String PROP_SQL_DATA_SOURCE_ID = "sql-editor-data-source-id"; //$NON-NLS-1$

            if (executionContext != null) {
            if (editorInput instanceof ILazyEditorInput lei) {
            // Just ignore
        if (element instanceof IEditorInput ei) {
            // What the point of setting SQL editor context here? It is set by editor itself
import org.eclipse.core.filesystem.IFileStore;
                    if (project == null || !project.exists()) {

                } else {
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
                    Path path = pathList.get(i);
import org.eclipse.ui.contexts.IContextActivation;
            } catch (IOException e) {
            FileActionSelectorDialog dialog = new FileActionSelectorDialog(UIUtils.getActiveWorkbenchShell(), actionList);
            DBCExecutionContext executionContext = ((DBPContextProvider) editorPart).getExecutionContext();

    }
        return true;

            }
        if (editorInput == null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * EditorUtils

        }
                DBWorkbench.getPlatformUI().showError("Open file error", "Can't open file '" + pathList + "'", e);
                }
    @Nullable
     * Can be used with IInMemoryEditorInput only.
                } catch (Exception e) {
                );
        try {

                FileTypeAction selectedAction = getFileTypeActionWithDialog(actions, !allRemote);
            IFile file = getFileFromInput(ei);
                return storage;
                public void focusLost(FocusEvent e) {
        } else if (editorInput instanceof IPathEditorInput pei) {
            } else {
    @Nullable
 * DBeaver - Universal Database Manager
            return null;
                        return null;
    private static String getDefaultSchemaName(DatabaseEditorContext context) {
            }
        Map<FileTypeHandlerDescriptor.Extension, List<Path>> filesByExtension = new LinkedHashMap<>();
        }
        if (editorInput instanceof IInMemoryEditorInput mei) {
                }
                if (dbo != null) {
            Method getFileMethod = editorInput.getClass().getMethod("getFile");
        }
    public static DatabaseEditorContext getEditorContext(IEditorInput editorInput) {
            tip.append('\n');
        } else if (editorInput instanceof IInMemoryEditorInput mei) {
            PROP_SQL_PROJECT_ID,
//            }
    }
                    if (activation[0] != null) {
        for (Path path : fileNames) {
    private static final Log log = Log.getLog(EditorUtils.class);
import org.jkiss.utils.CommonUtils;
                            try (DBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Rollback editor transaction")) {
import org.jkiss.utils.IOUtils;
                        return dataSource.getContainer().getProject();
    public static Path getPathFromInput(Object element) {
            efManager.setFileProperty(localFile, DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE, dataSourceId);
                @Override
                String schemaName = getDefaultSchemaName(context);
            log.error("Can't open editor from path '" + path.toAbsolutePath(), e);
import java.io.File;

    public static void deactivatePartContexts(IWorkbenchPart part) {
    }


        return null;

            if (IOUtils.isLocalPath(path) && Files.isDirectory(path)) {
        return filesByHandler;
                }
        }
        @Nullable DBNPathBase sourceNode

import org.jkiss.dbeaver.runtime.LocalFileStorage;
                    defaultDatasource = (String) efManager.getFileProperty(localFile, DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE);

import org.eclipse.core.resources.IFile;
        }
            ((ITextEditor) editorPart).doRevertToSaved();
            // On macOS files can be opened via Finder with ZWNBSP characters in the file name


                }
    public static List<Path> openExternalFiles(@NotNull String[] fileNames, @Nullable DBPDataSourceContainer currentContainer) {
    }
            final DBSObject object = dei.getDatabaseObject();
            }
                }
    public static IEditorDescriptor getFileEditorDescriptor(@NotNull File file, @NotNull IWorkbenchWindow window) {
                catalog = selectedCatalog;
    public static boolean openExternalFiles(
        @Nullable DBPDataSourceContainer currentContainer,
    }
                        contextService.deactivateContext(activation[0]);


                return containerProvider.getDataSourceContainer();
        return context.getExecutionContext() == null && context.getSelectedObject() == null;
            String catalogName = getDefaultCatalogName(context);
    @NotNull
        }
            if (file != null) {
        String resourcePath = projectMeta.getResourcePath(file);
            dataSourceId);
                    final IProject project = DBPPlatformDesktop.getInstance().getWorkspace().getEclipseWorkspace().getRoot().getProject(projectName);
            }
                return lei.getProject();
//                }
        if (editorPart instanceof IRevertableEditor) {
            if (editorInput instanceof IDatabaseEditorInput dei) {
            final IPath path = pei.getPath();
    ) {
            Object dataSourceId = getResourceProperty(projectMeta, file, DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE);

        List<Path> openedFiles = new ArrayList<>();
        return localFile == null ? null : localFile.toPath();
            return fei.getFile();
import java.util.stream.Stream;
import org.jkiss.dbeaver.ui.UIUtils;
                    }
            }
            if (object != null && object.getDataSource() != null) {
     * Get project by the specified editor input
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
        return desc;
        for (Map.Entry<FileTypeHandlerDescriptor, List<Path>> entry : filesByHandler.entrySet()) {
        } else {
import java.io.OutputStream;
        }
        Path[] filePaths = fileNameStream
    @NotNull
                // Try to extract from embedded comment

            if (storage != null) {
        @NotNull Path[] filePaths,
        if (executionContext != null) {
    public static IEditorPart openExternalFileEditor(@NotNull Path path, @NotNull IWorkbenchWindow window) {
        openFileEditors(filePaths, currentContainer, openedFiles, false, null);
                String fileExtension = IOUtils.getFileExtension(path);
    }
                log.error("Can't set datasource for input " + editorInput);
        }
            } else {
        return openedFiles;
            }
            localFile,
                File localFile = getLocalFileFromInput(editorInput);
    private static final String PROP_EDITOR_CONTEXT = "database-editor-context"; //$NON-NLS-1$
    ) {
            DBSCatalog catalog;
        DBCExecutionContext executionContext = context.getExecutionContext();
        if (contextService == null) {

                projectMeta.setResourceProperty(resourcePath, PROP_CONTEXT_DEFAULT_CATALOG, defaultCatalogName);
            IFile file = getFileFromInput(ei);
            }
        if (!isDefaultContextSettings(context)) {
        if (editorInput instanceof IInMemoryEditorInput) {
        if (!file.exists()) {
        tip.append(EditorsMessages.database_editor_project).append(": ").append(project.getName());
    private static boolean isDefaultContextSettings(DatabaseEditorContext context) {
                if (defaultSchema != null) {

//                }
                if (extension != null) {
                    }
//                    //log.debug("Double activation of SQL context");
        String defaultDatasource = null;
                    // No need to deactivate the same context
        // Revert editor's transaction
    private static final String PROP_INPUT_FILE = "sql-editor-input-file"; //$NON-NLS-1$
        }
        return getInputDataSource(editorInput, true);
    public static DBPProject getFileProject(@Nullable IEditorInput editorInput) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
        if (editorInput != null) {
//            }
                String fileExtension = IOUtils.getFileExtension(path);
    @NotNull
                    inMemoryEditorInput.setProperty(DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE, dataSourceContainer.getId());
            if (!CommonUtils.isEmpty(defaultCatalogName)) {
                    if (CommonUtils.isEmpty(dataSourceId) || CommonUtils.isEmpty(projectName)) {
                Path tempFile = ContentUtils.makeTempFile(
                if (projectMeta != null) {
    }
        @NotNull List<Path> openedFiles,
            DBCExecutionContextDefaults<?,?> contextDefaults = executionContext.getContextDefaults();
            if (context.getSelectedObject() instanceof DBSSchema) {
            final IContextActivation[] activation = new IContextActivation[1];
import org.eclipse.core.resources.IProject;
            PROP_SQL_DATA_SOURCE_ID,
                RCPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(file.getProject());
        DBPDataSourceContainer dataSourceContainer = context.getDataSourceContainer();
        if (element instanceof IStorageEditorInput sei) {

                IPath location = file.getLocation();
    private static final String PROP_CONTEXT_DEFAULT_SCHEMA = "default-schema"; //$NON-NLS-1$
                    //new Exception().printStackTrace();
import org.eclipse.swt.widgets.Control;
        projectMeta.setResourceProperty(resourcePath, DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE, dataSourceId);
                    inMemoryEditorInput.setProperty(PROP_CONTEXT_DEFAULT_SCHEMA, schemaName);

import java.nio.file.Files;
        if (project == null || project.getWorkspace().getProjects().size() < 2) {
    public static DBPDataSourceContainer getFileDataSource(IFile file) {
                    try (OutputStream os = Files.newOutputStream(tempFile)) {
            }
    public static IFile getFileFromInput(IEditorInput editorInput) {
                    String dataSourceId = (String) efManager.getFileProperty(localFile, PROP_SQL_DATA_SOURCE_ID);
        IEditorDescriptor desc = window.getWorkbench().getEditorRegistry().getDefaultEditor(fileName);
            IFile file = getFileFromInput(editorInput);
                    }
//                    contextService.deactivateContext(activationSQL);
    }
            };
        @NotNull IEditorInput editorInput,
import org.jkiss.dbeaver.model.exec.*;
    // Datasource <-> resource manipulations

    public static Map<FileTypeHandlerDescriptor.Extension, List<Path>> getExtensionFiles(
import org.eclipse.core.resources.IStorage;
                    fileOpenHandler.openFiles(pathList, currentContainer, selectedAction);
                }
            }
            FocusListener focusListener = new FocusListener() {
    public static void trackControlContext(IWorkbenchSite site, Control control, String contextId) {
            DBSSchema schema;
                            } catch (DBException e) {
            }
            if (IFile.class.isAssignableFrom(getFileMethod.getReturnType())) {
                DBWorkbench.getPlatformUI().showError("Open file", "Can't open '" + path + "': file doesn't exist");
            inMemoryEditorInput.setProperty(PROP_EDITOR_CONTEXT, context);
    @Nullable
            if (file != null) {

        return openFileEditors(filePaths, currentContainer, openedFiles, databaseOnly, sourceNode);
            IFile file = getFileFromInput(ei);
        deactivatePartContexts(part);

                try (InputStream is = Files.newInputStream(remotePath)) {
        }

            }
        if (actionList.size() > 1 && UIUtils.getActiveWorkbenchShell() != null) {
                    defaultCatalogName = (String) getResourceProperty(projectMeta, file, PROP_CONTEXT_DEFAULT_CATALOG);
    }
        }
                FileTypeHandlerDescriptor.Extension extension = CommonUtils.isEmpty(fileExtension) ?
import org.eclipse.swt.events.FocusEvent;

/**
            if (!isDefaultContextSettings(context)) {
import org.eclipse.ui.ide.FileStoreEditorInput;
            if (contextDefaults != null) {
                return dataSource;
                    // Something is wrong with URI
import org.jkiss.dbeaver.Log;

                    return null;
        } else {
            control.addDisposeListener(e -> {
            }
                    return null;
import org.jkiss.code.NotNull;
    public static void activatePartContexts(IWorkbenchPart part) {
        try {
                        return null;
        }
                    if (!IOUtils.isLocalPath(path)) {
            setFileDataSource(file, context);
        boolean databaseOnly

            DBPDataSourceContainer dataSourceContainer = context.getDataSourceContainer();
        final IPathEditorInput pathInput = editorInput.getAdapter(IPathEditorInput.class);
        }
            }
            // for all entity editor and clashes with SQL editor and other complex stuff.
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
    }
            }
    @Nullable
        }
        return getFileDataSource(file, true);
            actionList.remove(FileTypeAction.EXTERNAL_EDITOR);
    public static final String COLORS_AND_FONTS_PAGE_ID = "org.eclipse.ui.preferencePages.ColorsAndFonts"; //$NON-NLS-1$
        return null;
        Job currentJob = Job.getJobManager().currentJob();

 * limitations under the License.
        @Nullable DBPDataSourceContainer currentContainer,
        } finally {
                }
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    public static Map<FileTypeHandlerDescriptor, List<Path>> getHandlerFiles(
        }
                throw new DBException("Error copying file", e);

                String catalogName = getDefaultCatalogName(context);
        String dataSourceId = dataSourceContainer == null ? null : dataSourceContainer.getId();
            } else {
                    final File localFile = new File(uriei.getURI());
                inMemoryEditorInput.setProperty(PROP_EXECUTION_CONTEXT, executionContext);
                    final DBPExternalFileManager efManager = DBPPlatformDesktop.getInstance().getExternalFileManager();
        }

                    if (localFile.exists()) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                    }
                    activation[0] = null;
}
    public static void setResourceProperty(@NotNull RCPProject project, @NotNull IResource resource, @NotNull String propName, @Nullable Object value) {
import org.jkiss.dbeaver.DBException;
            final IPath path = pathInput.getPath();
    }
                DBWorkbench.getPlatformUI().showError("Open file", "Can't open '" + path + "': file doesn't exist");
                if (handler != null && databaseOnly && !handler.isDatabaseHandler()) {
        if (editorInput instanceof IInMemoryEditorInput) {
import org.eclipse.core.runtime.IAdaptable;
                }
                projectMeta.setResourceProperty(resourcePath, PROP_CONTEXT_DEFAULT_SCHEMA, defaultSchemaName);
            try {
                    activation[0] = contextService.activateContext(contextId);
     * Associated inout file with editor input.
                log.error("Can't open directory '" + path + "'");
        }
    private static final String PROP_SQL_DATA_SOURCE_CONTAINER = "sql-editor-data-source-container"; //$NON-NLS-1$
            IFile file = (IFile) mei.getProperty(PROP_INPUT_FILE);
    }
     */
            if (file != null) {
//            if (part instanceof SQLEditorBase || part.getAdapter(SQLEditorBase.class) != null) {

    }
            return null;
                if (defaultCatalog != null) {
import org.jkiss.dbeaver.utils.ResourceUtils;
    }
    public static final String PROP_CONTEXT_DEFAULT_CATALOG = "default-catalog"; //$NON-NLS-1$
            IEditorInput input = new FileStoreEditorInput(fileStore);
                DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
            if (dataSourceContainer != null) {
                    contextService.deactivateContext(activation[0]);
        boolean databaseOnly,
            return (DBPDataSourceContainer) mei.getProperty(PROP_SQL_DATA_SOURCE_CONTAINER);
                return DBPPlatformDesktop.getInstance().getWorkspace().getProject(curFile.getProject());
import org.jkiss.dbeaver.utils.ContentUtils;
        activatePartContexts(part);
                        } else if (!handler.supportsRemoteFiles()) {
//                    //log.debug("Double activation of navigator context");
    @Nullable
import org.jkiss.dbeaver.ui.IDataSourceContainerUpdate;
                }
    public static void setFileDataSource(@NotNull IFile file, @NotNull DatabaseEditorContext context) {
        if (hasLocalFiles) {
                DBPDataSourceContainer dataSource = projectMeta.getDataSourceRegistry().getDataSource(dataSourceId.toString());
    }
            if (catalogName != null || schemaName != null) efManager.setFileProperty(localFile, PROP_CONTEXT_DEFAULT_SCHEMA, getDefaultCatalogName(context));
                    String projectName = (String) efManager.getFileProperty(localFile, PROP_SQL_PROJECT_ID);
            IStorage storage = adaptable.getAdapter(IStorage.class);
import org.jkiss.dbeaver.model.file.FileTypeHandlerDescriptor;
                    DBPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(project);
//                activationSQL = contextService.activateContext(SQLEditorContributions.SQL_EDITOR_CONTEXT);
package org.jkiss.dbeaver.ui.editors;
    public static IEditorDescriptor getFileEditorDescriptor(@NotNull Path path, @NotNull IWorkbenchWindow window) {
                URI uri = uriei.getURI();
                for (int i = 0; i < pathList.size(); i++) {
//                    contextService.deactivateContext(activationNavigator);
    @NotNull
            return catalog == null ? null : catalog.getName();
        @NotNull Path[] fileNames,
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (dataSource != null) {

        if (element instanceof IEditorInput ei) {
                    handler = null;
        if (editorInput instanceof IInMemoryEditorInput inMemoryEditorInput) {
        } else {
                    extension = null;
                return file;
            if (dialog.open() == IDialogConstants.OK_ID) {
    ) {
            String defaultSchemaName = getDefaultSchemaName(context);
                if (dataSource == null) {
            }
        }
        } else if (editorPart instanceof ITextEditor) {
        }
        } else if (editorInput instanceof IURIEditorInput) {
            return schema == null ? null : schema.getName();
                }
                }
                if (localFile != null) {
            if (contextDefaults != null) {
import org.eclipse.core.runtime.IPath;
    public static DBPDataSourceContainer getFileDataSource(IFile file, boolean forceRegistryLoad) {
        @NotNull IFile file
                    defaultDatasource = (String) getResourceProperty(projectMeta, file, DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE);


            }
    }
        final IContextService contextService = site.getService(IContextService.class);
                    }
    private static final String ZWNBSP = "\uFEFF";
            }
            selectedAction = actionList.getFirst();
import org.jkiss.dbeaver.model.file.FileTypeHandlerRegistry;
            return (DBCExecutionContext) ((IInMemoryEditorInput) editorInput).getProperty(PROP_EXECUTION_CONTEXT);
                        }, "End editor transaction", 5000);
        log.debug("Open external file(s) [" + Arrays.toString(filePaths) + "]");
        final DBPExternalFileManager efManager = DBPPlatformDesktop.getInstance().getExternalFileManager();
import org.eclipse.ui.*;

            } else {
 *
        if (editorInput instanceof IncludedScriptFileEditorInput input) {
            if (file != null) {
                setFileDataSource(localFile, context);
        }
            input.setDatabaseEditorContext(context);
            String defaultCatalogName = getDefaultCatalogName(context);
                return tempFile;
            DBCExecutionContextDefaults<?,?> contextDefaults = executionContext.getContextDefaults();
                    IOUtils.getFileExtension(remotePath)
            defaultSchema= (String) mei.getProperty(PROP_CONTEXT_DEFAULT_SCHEMA);
        }
                fileExtension = fileExtension == null ? "" : fileExtension.toLowerCase();
                    remotePath.getFileName().toString(),
                    return new LocalFileStorage(localFile, StandardCharsets.UTF_8.name());
            }
import org.jkiss.dbeaver.model.*;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        }
                }
                if (dataSourceContainer != null) {

            } else {
            }

            return path == null ? null : ResourceUtils.convertPathToWorkspaceFile(path);
                    }

            defaultCatalogName = (String) mei.getProperty(PROP_CONTEXT_DEFAULT_CATALOG);
            dataSourceContainer == null ? null : dataSourceContainer.getRegistry().getProject().getName());
import org.jkiss.code.Nullable;
    private static String getDefaultCatalogName(DatabaseEditorContext context) {
            return input.getDatabaseEditorContext();
        }

                inMemoryEditorInput.setProperty(PROP_SQL_DATA_SOURCE_CONTAINER, dataSourceContainer);
                try {
                    ContentUtils.getLobFolder(monitor, DBWorkbench.getPlatform()),
 *     http://www.apache.org/licenses/LICENSE-2.0
            return;
import org.jkiss.dbeaver.model.file.FileOpenHandler;
        }
import java.util.*;
            } catch (DBException e) {

                if (localFile.exists()) {
            ((IRevertableEditor) editorPart).doRevertToSaved();
        if (currentJob == null) {
                    defaultSchema = (String) efManager.getFileProperty(localFile, PROP_CONTEXT_DEFAULT_SCHEMA);
        }
        List<FileTypeAction> actionList = new ArrayList<>(actions.stream()

    public static final String PROP_SQL_PROJECT_ID = "sql-editor-project-id"; //$NON-NLS-1$
        }
                return object.getDataSource().getContainer();
    @Nullable
                    if (activation[0] != null) {
import org.eclipse.swt.events.FocusListener;
            }
                    final DBPExternalFileManager efManager = DBPPlatformDesktop.getInstance().getExternalFileManager();

    //////////////////////////////////////////////////////////
            DBCExecutionContext executionContext = context.getExecutionContext();
        Map<FileTypeHandlerDescriptor, List<Path>> filesByHandler = getHandlerFiles(fileNames, openedFiles, databaseOnly);
            } else {
            } catch (CoreException e) {
        return null;
        try {
        DBPDataSourceContainer dataSourceContainer = context.getDataSourceContainer();
import org.eclipse.core.runtime.jobs.Job;
            fileNameStream = fileNameStream.map(fName -> fName.replaceAll(ZWNBSP, ""));

                                txnManager.rollback(session, null);
                return getFileDataSource(file, forceRegistryLoad);
import org.eclipse.core.filesystem.EFS;
            return null;
        if (editorInput instanceof IInMemoryEditorInput) {
        if (executionContext != null) {
                }
            FileTypeHandlerDescriptor handler = entry.getKey();
                            }
                return (IFile) getFileMethod.invoke(editorInput);

            // Wrong datasource
        @NotNull List<Path> openedFiles,
        return null;
        IContextService contextService = PlatformUI.getWorkbench().getService(IContextService.class);
import java.io.InputStream;
import org.eclipse.jface.dialogs.IDialogConstants;
            if (context.getSelectedObject() instanceof DBSCatalog selectedCatalog) {
     */
                    defaultSchema = (String) getResourceProperty(projectMeta, file, PROP_CONTEXT_DEFAULT_SCHEMA);
            localFile,
            IFileStore fileStore = EFS.getStore(path.toUri());
    /**

    }
                fileExtension = fileExtension == null ? "" : fileExtension.toLowerCase();
                schema = DBUtils.getParentOfType(DBSSchema.class, context.getSelectedObject());
                        contextService.deactivateContext(activation[0]);
                Set<FileTypeAction> actions = fileOpenHandler.supportedActions();
            return;
    }
                DBSObject dbo = dei.getDatabaseObject();
                selectedAction = dialog.getSelectedAction();
        }
    public static IEditorPart openExternalFileEditor(@NotNull File file, @NotNull IWorkbenchWindow window) {
    public static void appendProjectToolTip(@NotNull StringBuilder tip, @Nullable DBPProject project) {
                DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
            ActionUtils.fireCommandRefresh(ConnectionCommands.CMD_TOGGLE_AUTOCOMMIT);
        }
            contextService.deferUpdates(true);
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (!tip.isEmpty() && tip.charAt(tip.length() - 1) != '\n') {
                        return localFile;
                    null : FileTypeHandlerRegistry.getInstance().findExtension(fileExtension);
        } else if (editorInput instanceof IncludedScriptFileEditorInput input) {
import org.eclipse.core.runtime.CoreException;
                    return projectMeta == null || (!forceRegistryLoad && !projectMeta.isRegistryLoaded()) ?
            if (executionContext != null) {

    public static void setInputDataSource(
    ) {
        }
                                throw new InvocationTargetException(e);
        @NotNull List<Path> fileNames,
                log.error("Can't open directory '" + path + "'");
                    }
    private static FileTypeAction getFileTypeActionWithDialog(@NotNull Set<FileTypeAction> actions, boolean hasLocalFiles) {
            return;
    }
            }
                schema = (DBSSchema) context.getSelectedObject();
                    fileOpenHandler.setSourceNode(sourceNode);
            .sorted()
    /**
            return;
            if (!CommonUtils.isEmpty(defaultSchemaName)) {
            }
        }
        efManager.setFileProperty(
            if (catalogName != null) efManager.setFileProperty(localFile, PROP_CONTEXT_DEFAULT_CATALOG, getDefaultCatalogName(context));
            }
                DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
                        if (handler == null || Files.isDirectory(path)) {
    public static DBPDataSourceContainer getInputDataSource(IEditorInput editorInput) {
        }
        List<Path> openedFiles = new ArrayList<>();
        }
                FileTypeHandlerDescriptor handler = FileTypeHandlerRegistry.getInstance().findHandler(fileExtension);
            contextService.deferUpdates(false);
        RCPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(file.getProject());
                File localFile = getLocalFileFromInput(editorInput);
            }
        }
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
                    return defaultCatalog.getName();
    public static void setFileDataSource(@NotNull File localFile, @NotNull DatabaseEditorContext context) {
                return null;
            desc = window.getWorkbench().getEditorRegistry().findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
        if (element instanceof IEditorInput ei) {
import org.jkiss.dbeaver.ui.editors.file.FileActionSelectorDialog;
import org.jkiss.dbeaver.model.file.FileTypeAction;
            return false;
        if (RuntimeUtils.isMacOS()) {
            }
    }
                    }
                        activation[0] = null;
                if (selectedAction != null) {

     * String[2] = { defaultCatalogName, defaultSchema }
    private static final String PROP_EXECUTION_CONTEXT = "sql-editor-execution-context"; //$NON-NLS-1$
            }

//                activationNavigator = contextService.activateContext(INavigatorModelView.NAVIGATOR_CONTEXT_ID);
import java.io.IOException;
                    if (txnManager != null && !txnManager.isAutoCommit()) {
    public static DBPDataSourceContainer getInputDataSource(IEditorInput editorInput, boolean forceRegistryLoad) {
            List<Path> pathList = entry.getValue();

                    log.error(e);
                FileOpenHandler fileOpenHandler = handler.createHandler();
    public static void revertEditorChanges(IEditorPart editorPart) {
    }
        String fileName = path.getFileName().toString();
            }
