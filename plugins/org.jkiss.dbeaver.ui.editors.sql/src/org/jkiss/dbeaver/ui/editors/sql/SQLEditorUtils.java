            if (member instanceof IFile iFile) {
            }
            context == null ? null : context.getDataSourceContainer(),
        }
            UIUtils.asyncExec(() -> {
                    // Create script folders according to connection folders
                    sql.append(line).append('\n');
        public Object getPropertyValue(@NotNull String propertyName) {
        
            this.isHandled = true;
    public static class EditorsCollection extends LinkedList<Pair<IWorkbenchPage, IEditorReference>> {
        }
import org.jkiss.dbeaver.ui.editors.sql.scripts.ScriptsHandlerImpl;
                    }

                onConnectedHandler.accept(result ? this.editor :  null);
        public void validateEditorInputState() {
            this.onConnectedHandler = onConnectedHandler;
            SQLEditor editor = (SQLEditor) serviceSQL.openSQLConsole(container, null, null, "Console", "");
        }
            this.dataSourceContainer = container;

        @Override
    @NotNull
                    result.add(new ResourceInfo((IFile) resource, container));
                        if (!dbFolder.exists()) {
        }
                        continue;
    @Nullable
                IEditorPart editor = editorRef.getSecond().getEditor(false);
                            }
                }
            oldServicesEnabled && markWordForSelectionEnabled,
        }
        final boolean markWordForSelectionEnabled = prefStore.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION);
                    
        List<ResourceInfo> scripts = new ArrayList<>();
        if (serviceSQL != null) {
            }
            for (IWorkbenchPage page : window.getPages()) {
            case NEVER:
                                if (!dbFolder.exists()) {
        }
                            dbFolder.create(true, true, progressMonitor);
    private static class EditorPlatformFileInfo extends EditorFileInfo {
import org.jkiss.dbeaver.Log;
            } catch (Throwable e) {
    	if (project == null) {
            return false;
            SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION,
        @Nullable
        switch (behavior) {
            log.debug(e.getMessage());
                        }
import org.eclipse.core.resources.IResource;
                            }
        ResourceInfo(IFile file, DBPDataSourceContainer dataSource) {
            IPath location = file.getLocation();
        prefStore.firePropertyChangeEvent(
import org.jkiss.dbeaver.model.connection.DBPDriver;
                        UIUtils.asyncExec(() -> sqlEditor.setDataSourceContainer(fileDsContainer));
        // Make new script file

                                affectedEditors.add((SQLEditor) editor);
                        this.onMaybeConnected();
    {
                        driverContextTypeId = SQLContextTypeDriver.getTypeId(replInfo.getFirst(), replInfo.getSecond());
                    // Create special folder for connection

                String providerContextTypeId = SQLContextTypeProvider.getTypeId(driver.getProviderId());
            }
                    UIUtils.asyncExec(() -> ((ITextEditorExtension2) editor).validateEditorInputState());
import org.jkiss.dbeaver.runtime.DBWorkbench;
            IPath location = folder.getLocation();

            EditorProjectFileInfo other = obj instanceof EditorProjectFileInfo ? (EditorProjectFileInfo) obj : null;
            project,
        boolean result = false;
                        result.add(new ResourceInfo(extFile, container));
                if (lastModified > recentTimestamp) {
        public boolean equals(@Nullable Object obj) {
        final DBPDataSourceContainer dataSourceContainer = navigatorContext.getDataSourceContainer();
            return children;
                int relatedJobsCount = this.countRelatedJobs();
		}
        return Platform.getContentTypeManager().getContentType("org.jkiss.dbeaver.sql");
        for (ResourceInfo file : scripts) {
    
                            if (dbFolder != null) {
            if (input != null) {
            oldServicesEnabled && foldingEnabled,
            newServicesEnabled && autoActivationEnabled
        public void setPropertyValue(@NotNull String propertyName, @NotNull Object value) {
import org.jkiss.dbeaver.ui.UIUtils;
                        line.startsWith("REM")
                    if (container == null || !container.isConnected()) {

            log.warn("", e);
            }
                if (editor instanceof ITextEditorExtension2) {
        tempFile.setSessionProperty(NEW_SCRIPT_FILE, true);

        @Nullable
            @NotNull Consumer<SQLEditor> onConnectedHandler
                    IFolder dbFolder = scriptsFolder.getFolder(CommonUtils.escapeFileName(dataSourceContainer.getName()));
        @Override
        public String getName() {
            if (project == null) {
            return dataSource;
        }
                    new SQLNewScriptTemplateVariablesResolver(container, container.getConnectionConfiguration())

            SQLPreferenceConstants.FOLDING_ENABLED,
    }

                                }
            }
                    File platformFile = EditorUtils.getLocalFileFromInput(input);
                        log.error(e);

        private void cleanup() {
                long lastModified = ResourceUtils.getResourceLastModified(file.resource);
        public boolean isDirectory() {
            }
    ) {
        private final List<ResourceInfo> children;
        }
            return false;
        if (folder == null || container == null) {
                if (dataSourceContainer.getPreferenceStore().getBoolean(SQLPreferenceConstants.SCRIPT_AUTO_FOLDERS)) {

                }
import java.nio.charset.StandardCharsets;
                return !container.isForceUseSingleConnection() && !container.getDriver().isEmbedded();
            DBPDataSourceContainer dsContainer = ((SQLEditor) editor).getDataSourceContainer();
        EditorFileInfo file = EditorFileInfo.getFromEditor(input);
        public boolean equals(@Nullable Object obj) {

    
    public static EditorsCollection findResourceEditors(@NotNull IResource member) {
import org.jkiss.code.Nullable;
            public void onDataSourceChanged(DBPPreferenceListener.PreferenceChangeEvent event) {
            }
        String filename = GeneralUtils.replaceVariables(pattern, new SQLEditorVariablesResolver(
            container.getPreferenceStore().getString(SQLPreferenceConstants.EDITOR_SEPARATE_CONNECTION)
        if (resource instanceof IFolder) {
import org.jkiss.dbeaver.model.DBPExternalFileManager;
        @Override
            sqlEditor.refreshAdvancedServices();
            try {
import java.io.ByteArrayInputStream;
        @NotNull
            this.projectFile = projectFile;
        List<ResourceInfo> result = new ArrayList<>();
        @Override
    public static List<ResourceInfo> findScriptTree(RCPProject project, IFolder folder, @Nullable DBPDataSourceContainer container)
                    DBCExecutionContext executionContext = this.editor.getExecutionContext();
                        for (DBPDataSourceFolder f : conFolders) {
        private void setup() {
                    recentTimestamp = lastModified;
                } else {

 *
            for (Pair<IWorkbenchPage, IEditorReference> editorRef : this) {
        }
            this.dataSource = dataSource;
        SeparateConnectionBehavior behavior = SeparateConnectionBehavior.parse(
                final IResource resource = project.getRootResource().findMember(path);
                    if (line.startsWith(SQLConstants.SL_COMMENT) ||
        
        return isSQLSyntaxParserEnabled(input) && !SQLEditorBase.isBigScript(input);
        List<SQLEditor> affectedEditors = new LinkedList<>();
            if (dataSourceContainer != null) {

        public DBPDataSourceContainer getDataSource() {
                    try {
    public static boolean isSQLSyntaxParserEnabled(@Nullable IEditorInput input) {
        }

                        break;
                        line.startsWith("Rem") ||
                EditorConnector.this.onMaybeConnected();
        try {
        tempFile.create(new ByteArrayInputStream(getResolvedNewScriptTemplate(dataSourceContainer).getBytes(StandardCharsets.UTF_8)), true, progressMonitor);
        private boolean isHandled = false;
        return tempFile;
            log.error(e);
                null, null));
        EditorFileInfo file = EditorFileInfo.getFromEditor(input);
            }
    private static class EditorConnector {
        public List<Pair<IWorkbenchPage, SQLEditor>> findNotConnectedSqlEditors() {
            return Collections.emptyList();
            @Override
            newServicesEnabled && foldingEnabled
            if (project == null) {

        return store.getString(SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE);
        @NotNull

            return marker.isSubtypeOf("org.eclipse.core.resources.problemmarker");
     */
                        }
                SCRIPT_FILE_EXTENSION);
        return result;
        return editorRefs;
                    }
        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    }
import org.jkiss.dbeaver.ui.editors.sql.commands.DisableSQLSyntaxParserHandler;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                IEditorPart editor = editorRef.getSecond().getEditor(false);
            this.localFile = location == null ? null : location.toFile();
                return null;
                            break;
    }
            }
        public abstract Object getPropertyValue(@NotNull String propertyName);
            if (dsContainer != null) {
        }   
import org.jkiss.dbeaver.utils.GeneralUtils;
        );
    /**
            }
    private static boolean isTemplateContextFitsEditorContext(
                return true;
import org.eclipse.core.resources.IFile;

        public abstract void setPropertyValue(@NotNull String propertyName, @NotNull Object value);
        public String getDescription() {
        return DBPPlatformDesktop.getInstance().getWorkspace().getResourceDefaultRoot(project, ScriptsHandlerImpl.class, forceCreate);
     */
                        this.onFinished(false);
            final DBPPreferenceStore store = container.getPreferenceStore();

                if (editor instanceof SQLEditor sqlEditor) {
                description = "<empty>";
        
                        break;

    @Nullable
                    if (extFile.exists()) {
        }
                        scriptsFolder = dbFolder;
    /**
    {
    public static ResourceInfo findRecentScript(RCPProject project, @Nullable SQLNavigatorContext context) throws CoreException
        try {
                        line.startsWith("rem") ||
import org.jkiss.code.NotNull;
                        List<DBPDataSourceFolder> conFolders = new ArrayList<>();
                if (relatedJobsCount > 0) {
    		IStatus status = new Status(IStatus.ERROR, SQLEditorActivator.PLUGIN_ID, "No active project to locate Script Folder");
        private void onMaybeConnected() {
            }
            }
     * Checks whether Disable SQL syntax parser should be applied for the given editor

            return getName();
        }
            return resource;
    public static List<ResourceInfo> getScriptsFromProject(@NotNull RCPProject dbpProject) throws CoreException {
        IFolder scriptsFolder = folder;
            if (description == null) {
 * you may not use this file except in compliance with the License.

        public void setDataSourceForSqlEditors(@NotNull DBPDataSourceContainer fileDsContainer) {
                    if (editorDsContainer != fileDsContainer) {


    }
                result = isTemplateContextFitsEditorContext(templateContextTypeId, driverContextTypeId, providerContextTypeId);
        public List<Pair<IWorkbenchPage, SQLEditor>> findConnectedSqlEditors() {
    }
                for (IEditorReference editorRef : page.getEditorReferences()) {
                        if (result) {
        
        }
                log.debug(e);
package org.jkiss.dbeaver.ui.editors.sql;
        public EditorConnector(
                    recentFile = file;

                    IEditorPart editor = editorRef.getEditor(false);
            templateContextTypeId.equalsIgnoreCase(providerContextTypeId);
                            if (editor instanceof SQLEditor) {
        List<ResourceInfo> scripts = new ArrayList<>();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    if (sql.length() > MIN_SQL_DESCRIPTION_LENGTH) {
                        if (editorFile != null && editorFile.equals(file)) {
            if (store.getBoolean(SQLPreferenceConstants.NEW_SCRIPT_TEMPLATE_ENABLED)) {
            if (!this.editor.isDisposed()) {

                }
        );
        private final Consumer<SQLEditor> onConnectedHandler;
        
    }
    /**
    @NotNull
                            conFolders.add(0, f);
            StringBuilder sql = new StringBuilder();
    private static final QualifiedName NEW_SCRIPT_FILE = new QualifiedName(SQLEditorActivator.PLUGIN_ID, "newScriptFile");
 *
                    this.isConnectionInitiated = true;
            oldServicesEnabled && markWordUnderCursorEnabled,
                    }
            final DBPExternalFileManager efManager = DBPPlatformDesktop.getInstance().getExternalFileManager();
                        }
        }

            });
        public void setPropertyValue(@NotNull String propertyName, @NotNull Object value) {
                scripts.add(resourceInfo);
/**
                if (editor instanceof SQLEditor sqlEditor) {

    public static class ResourceInfo {
                dataSourceContainer,
    {
            }
        @NotNull
        ResourceInfo(File localFile, DBPDataSourceContainer dataSource) {
        final boolean autoActivationEnabled = prefStore.getBoolean(SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION);
        public void engage() {
                    getNewScriptTemplate(store),
    }
        public void closeNoSave() {
            // Search in external files
            default: 
            return other != null && projectFile != null && projectFile.equals(other.projectFile);
        }
        @Nullable

    private static final String DISABLE_SQL_SYNTAX_PARSER_RESOURCE_PROPERTY = "disable-sql-syntax-parser";
    }
            EditorPlatformFileInfo other = obj instanceof EditorPlatformFileInfo ? (EditorPlatformFileInfo) obj : null;


                for (;;) {
        prefStore.firePropertyChangeEvent(
            return resource != null ? resource.getName() : localFile.getName();
    
        }
        Set<DBPPreferenceStore> affectedPrefs = new HashSet<>();
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                            if (status.isOK()) {
        } catch (Throwable e) {
                    }
                    }
            newServicesEnabled && markWordUnderCursorEnabled
        }
     * Sets value to Disable SQL syntax parser property
            }
    {
        }
        }
import org.jkiss.dbeaver.model.app.DBPProject;
import java.io.InputStreamReader;
        if (scriptsFolder == null) {
    public static boolean isProblemMarker(@NotNull IMarker marker) {
                        )
    
                        EditorFileInfo editorFile = EditorFileInfo.getFromEditor(editor.getEditorInput());
    }
                scripts.addAll(getScriptsFromFolder(iFolder));
    public static boolean isOpenSeparateConnection(DBPDataSourceContainer container) {
            if (member instanceof IFolder iFolder){
            final DBPExternalFileManager efManager = DBPPlatformDesktop.getInstance().getExternalFileManager();
        for (DBPPreferenceStore prefs : affectedPrefs) {
            for (String path : project.findResources(Map.of(DBConstants.PROP_RESOURCE_DEFAULT_DATASOURCE, container.getId()))) {
import org.jkiss.utils.Pair;
        
    private static final Log log = Log.getLog(SQLEditorUtils.class);

        public File getLocalFile() {
        long recentTimestamp = 0L;
            return results;
                        }
                    }
        return "";
            this.platformFile = platformFile;
                }
            case DEFAULT:
        if (file != null) {
    public static boolean openNewSqlConsoleAndTryConnect(@NotNull DBPDataSourceContainer container, @NotNull Consumer<SQLEditor> onConnected) {
                file.setPropertyValue(DISABLE_SQL_SYNTAX_PARSER_RESOURCE_PROPERTY, Boolean.toString(!value));
                    line = line.trim();
            for (Map.Entry<String, Map<String, Object>> fileEntry : DBPPlatformDesktop.getInstance().getExternalFileManager().getAllFiles().entrySet()) {
        private final File localFile;
    public static void setSQLSyntaxParserEnabled(@Nullable IEditorInput input, boolean value) {
                    } catch (PartInitException e) {
import java.io.BufferedReader;
import org.eclipse.core.resources.IMarker;
            } else {
        ResourceInfo recentFile = null;
        private String description;
        }
        private final SQLEditor editor;
        }
     */
                    }
        }
                }
        }
        );
                        })
import org.eclipse.core.runtime.content.IContentType;

        public IResource getResource() {
        // Get folder
import org.jkiss.dbeaver.utils.ResourceUtils;
                            if (editorRefs == null) {
 * Unless required by applicable law or agreed to in writing, software
        
                if (resource instanceof IFile) {
            List<Pair<IWorkbenchPage, SQLEditor>> results = new LinkedList<>();
                }
    private static List<ResourceInfo> getScriptsFromFolder(@NotNull IFolder folder) throws CoreException {
            } catch (Throwable e) {
        @Deprecated
        @Nullable
                }
            EditorConnector connector = new EditorConnector(editor, container, onConnected);
            return Boolean.TRUE.equals(resource.getSessionProperty(NEW_SCRIPT_FILE));
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.ModelPreferences.SeparateConnectionBehavior;
            return results;
    /**
     * A {@link IResource}'s session property to distinguish between persisted and newly created resources.
        @Override
        findScriptList(
    public static String getResourceDescription(IResource resource) {
        }
 * See the License for the specific language governing permissions and
    {
            }
            return localFile;
 * Licensed under the Apache License, Version 2.0 (the "License");
            templateContextTypeId.equalsIgnoreCase(driverContextTypeId) ||
import org.eclipse.ui.texteditor.ITextEditorExtension2;
        @Override
        return recentFile;
        prefStore.firePropertyChangeEvent(
                        true, status -> UIUtils.asyncExec(() -> {
            for (Pair<IWorkbenchPage, IEditorReference> editorRef : this) {

        private final DBPDataSourceContainer dataSource;
import org.eclipse.ui.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    for (Pair<String, String> replInfo : driver.getDriverReplacementsInfo()) {
            return true;
    }
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLContextTypeDriver;
                        IResource editorResource = ResourceUtil.getResource(editorRef.getEditorInput());

        };
                    }
        @Nullable String providerContextTypeId
                    DBPDataSourceFolder conFolder = dataSourceContainer.getFolder();
                }
import org.jkiss.dbeaver.model.DBPDataSourceFolder;

        }
            RCPProject project = DBPPlatformDesktop.getInstance().getWorkspace().getProject(projectFile.getProject());
        return "";

            editor.setDataSourceContainer(container); // without this line checkConnected doesn't detect container info
                }
    }
        if (file != null) {
 */
    }

                IEditorPart editor = editorRef.getSecond().getEditor(false);

                    DBPDataSourceContainer editorDsContainer = sqlEditor.getDataSourceContainer();


                    if (platformFile != null) {
                        for (DBPDataSourceFolder f = conFolder; f != null; f = f.getParent()) {
    }
 *

                String driverContextTypeId = SQLContextTypeDriver.getTypeId(driver);
            this.children = null;
            return EditorUtils.getResourceProperty(project, projectFile, propertyName);
        if (navigatorContext.getDataSourceContainer() != null) {
        }
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorVariablesResolver;
            return;
    private static void findScriptList(@NotNull RCPProject project, IFolder folder, @Nullable DBPDataSourceContainer container, @NotNull List<ResourceInfo> result) {
                }
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorActivator;
        } else {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        for (IResource member : folder.members()) {
        );

                    String line = is.readLine();
            this.editor.addListener(editorListener);
        private final IResource resource;

import org.eclipse.core.runtime.*;
        } catch (Exception e) {
                            affectedPrefs.add(sqlEditor.getActivePreferenceStore());
    
                    }
                if (!result) {
                                editorRefs = new EditorsCollection();
            oldServicesEnabled && autoActivationEnabled,
/*
import java.io.File;
            this.resource = file;

    public static final String SCRIPT_FILE_EXTENSION = "sql"; //$NON-NLS-1$
        public List<ResourceInfo> getChildren() {
    private abstract static class EditorFileInfo {
                }
                    {
 * DBeaver - Universal Database Manager
            @NotNull DBPDataSourceContainer container,
            }
                return false;
            }
                log.debug(e);
        EditorsCollection editorRefs = null;


                                    dbFolder.create(true, true, progressMonitor);
                    if (alreadyConnected && !editor.isDisposed()) {
                    }
            //log.debug("Read script '" + sqlScript.getName() + "' description");
        for (SQLEditor sqlEditor : affectedEditors) {
        for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
import org.jkiss.dbeaver.ui.editors.EditorUtils;
    

            this.setup();
                DBPDriver driver = dsContainer.getDriver();
            @NotNull SQLEditor editor,
    }
            if (CommonUtils.isEmptyTrimmed(description)) {
            }



        }
            }

                    if (executionContext != null) {
        private boolean isConnectionInitiated = false;
            return description;
        try {
                    if (conFolder != null) {
     */
                // there is no legitimate way to detect failure of the connection attempt, so watching for connection-related jobs
            for (IWorkbenchPage page : window.getPages()) {
    private static class EditorProjectFileInfo extends EditorFileInfo {
        @Nullable String driverContextTypeId,
    }
    }
                }
                                scriptsFolder = dbFolder;
        final boolean foldingEnabled = prefStore.getBoolean(SQLPreferenceConstants.FOLDING_ENABLED);
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
            try (BufferedReader is = new BufferedReader(new InputStreamReader(sqlScript.getContents()))) {
        public String toString() {
                    }
        return result;
            for (Pair<IWorkbenchPage, IEditorReference> editorRef : this) {
        private void onFinished(boolean result) {
    public static IFolder getScriptsFolder(DBPProject project, boolean forceCreate) throws CoreException
            }
        findScriptList(project, folder, container, result);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
        return true;
                return null;
            if (file.resource != null) {
        String pattern = store.getString(SQLPreferenceConstants.SCRIPT_FILE_NAME_PATTERN);
        
        }
                            }
            });
            return Job.getJobManager().find(this.dataSourceContainer).length + Job.getJobManager().find(this.editor).length;
                    results.add(Pair.of(editorRef.getFirst(), sqlEditor));


    }
            EditorUtils.setFileDataSource(tempFile, navigatorContext);
            String description = getScriptDescription((IFile) resource);
        PlatformUI.getWorkbench().getService(ICommandService.class).refreshElements(DisableSQLSyntaxParserHandler.COMMAND_ID, null);
                if (!this.isHandled) {
                    } else {
        }
            return other != null && platformFile != null && platformFile.equals(other.platformFile);
    /**
import org.eclipse.core.runtime.jobs.Job;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        this.onFinished(true);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        private int countRelatedJobs() {
            scripts);
                );

 * distributed under the License is distributed on an "AS IS" BASIS,
            }
                        }
                }
            this.dataSource = dataSource;
        final boolean oldServicesEnabled = !newServicesEnabled;
        }
        try {
        private final File platformFile;
    public static String getResolvedNewScriptTemplate(@Nullable DBPDataSourceContainer container) {
			throw new CoreException(status);
            getScriptsFolder(project, false),
                return GeneralUtils.replaceVariables(
        public static EditorFileInfo getFromEditor(@Nullable IEditorInput input) {
                dataSourceContainer == null ? null : dataSourceContainer.getConnectionConfiguration(),
            sqlEditor.refreshEditorIconAndTitle();
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
    @NotNull
            connector.engage();
            return false;
 * You may obtain a copy of the License at

    public static String getScriptDescription(@NotNull IFile sqlScript)
                if (projectFile != null) {
        }
        final IFolder scriptsRootFolder = getScriptsFolder(project, true);

                    DBPDataSourceContainer container = sqlEditor.getDataSourceContainer();

    }
 * SQLEditor utils

                    if (editor instanceof SQLEditorBase sqlEditor) {
    
            return getScriptsFromFolder(resourceDefaultRoot);
                CommonUtils.isEmpty(filename) ? "Script" : CommonUtils.escapeFileName(filename),
        // Save ds container reference

        if (container != null) {
        }
                notifyAssociatedServices(file, value);
public class SQLEditorUtils {
    }
     * Checks whether Disable SQL syntax parser property is set
    }
        public EditorPlatformFileInfo(@Nullable File platformFile) {
        @NotNull
        IFolder resourceDefaultRoot = DBPPlatformDesktop.getInstance().getWorkspace().getResourceDefaultRoot(dbpProject, ScriptsHandlerImpl.class, false);
    public static IContentType getSQLContentType() {
            this.editor = editor;
     * Checks whether template's context is suitable for the editor context
    }
    }
    public static boolean isSQLSyntaxParserApplied(@Nullable IEditorInput input) {
                IFile projectFile = EditorUtils.getFileFromInput(input);
    }
                editorRef.getFirst().closeEditors(new IEditorReference[] {editorRef.getSecond()}, false);
        } else if (resource instanceof IFile && SCRIPT_FILE_EXTENSION.equals(resource.getFileExtension())) {
    public static boolean isNewScriptFile(@NotNull IResource resource) {
                    );
        }
        return null;
    }

        for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
            UIUtils.asyncExec(() -> {

}
        }
                description = getResourceDescription(resource);
                if (editor instanceof SQLEditor sqlEditor && sqlEditor.getDataSource() != null) {
        }
            scriptsFolder.create(true, true, new NullProgressMonitor());
        final boolean markWordUnderCursorEnabled = prefStore.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR);
                    return new EditorProjectFileInfo(projectFile);
        }
                if (dataSourceContainer.getPreferenceStore().getBoolean(SQLPreferenceConstants.SCRIPT_CREATE_CONNECTION_FOLDERS)) {
        }
        private final IFile projectFile;
            this.resource = null;
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLContextTypeBase;
     */
                return;
    private static void notifyPrefs(@NotNull DBPPreferenceStore prefStore, boolean newServicesEnabled) {
            SQLPreferenceConstants.ENABLE_AUTO_ACTIVATION,
        }
        }
        } catch (CoreException e) {
            return efManager.getFileProperty(platformFile, propertyName);
                        results.add(Pair.of(editorRef.getFirst(), sqlEditor));
 * limitations under the License.

            return "";
    public static IFile createNewScript(DBPProject project, @Nullable IFolder folder, @NotNull SQLNavigatorContext navigatorContext) throws CoreException
        if (resourceDefaultRoot != null) {
                    }
                            }
import org.jkiss.utils.CommonUtils;
        @NotNull
                log.debug("Project '" + projectFile.getProject() + "' not recognized (property read)");
            this.localFile = location == null ? null : location.toFile();
            this.dataSource = null;
            this.editor.removeListener(editorListener);
            case ALWAYS:
    }
        );
        }
            notifyPrefs(prefs, newServicesEnabled);
                }
import org.eclipse.ui.ide.ResourceUtil;
                        break;
            newServicesEnabled && markWordForSelectionEnabled
        if (editor instanceof SQLEditor) {
        private final DBPDataSourceContainer dataSourceContainer;
     */
        }
        } catch (CoreException ignored) {
                ResourceInfo resourceInfo = new ResourceInfo(iFile, EditorUtils.getFileDataSource(iFile));
import org.eclipse.ui.commands.ICommandService;
        return templateContextTypeId.equalsIgnoreCase(SQLContextTypeBase.ID_SQL) ||
                        if (editorResource != null && editorResource.equals(member)) {
                        }
            this.children = new ArrayList<>();
                                this.onMaybeConnected();
    public static boolean isTemplateContextFitsEditorContext(@NotNull String templateContextTypeId, @NotNull SQLEditorBase editor) {
        }
    }
    }
            EditorUtils.setResourceProperty(project, projectFile, propertyName, value);
                        return null;
    private static void notifyAssociatedServices(@NotNull EditorFileInfo file, boolean newServicesEnabled) {
                    boolean alreadyConnected = editor.checkConnected(

        if (CommonUtils.equalObjects(scriptsRootFolder, scriptsFolder)) {
        }

                }
                            editorRefs.add(Pair.of(page, editorRef));
    }
    private static final int MIN_SQL_DESCRIPTION_LENGTH = 512;
            this.resource = folder;
        final IProgressMonitor progressMonitor = new NullProgressMonitor();
        }
            try {
import org.eclipse.core.resources.IFolder;

        ) {
        public Object getPropertyValue(@NotNull String propertyName) {
            this.localFile = localFile;
            return resource instanceof IFolder;
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLContextTypeProvider;
                    if (dbFolder != null) {
            }
        }
                        result = isTemplateContextFitsEditorContext(templateContextTypeId, driverContextTypeId, providerContextTypeId);
        public ResourceInfo(IFolder folder) {
        public EditorProjectFileInfo(@NotNull IFile projectFile) {

import org.jkiss.dbeaver.model.sql.SQLConstants;
            efManager.setFileProperty(platformFile, propertyName, value);
    @NotNull
import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
        

    
                    File extFile = new File(fileEntry.getKey());
                null,

            scriptsFolder = scriptsRootFolder;
        }
        @NotNull
    }
                        return new EditorPlatformFileInfo(platformFile);

                if (!this.isHandled) {
            RCPProject project = DBPPlatformDesktop.getInstance().getWorkspace().getProject(projectFile.getProject());
        }

                    }
                    }
                }
            return description;
                return !CommonUtils.getBoolean(file.getPropertyValue(DISABLE_SQL_SYNTAX_PARSER_RESOURCE_PROPERTY), false);
    
                if (container.getId().equals(fileEntry.getValue().get(EditorUtils.PROP_SQL_DATA_SOURCE_ID))) {
    @Nullable
                IEditorPart editor = editorRef.getSecond().getEditor(false);
        @NotNull String templateContextTypeId,
            this.cleanup();
import org.jkiss.dbeaver.model.rcp.RCPProject;
            this.children = null;
 */
    public static String getNewScriptTemplate(@NotNull DBPPreferenceStore store) {
                    } else if (this.isConnectionInitiated && relatedJobsCount == 0) {
        private final SQLEditorListener editorListener = new SQLEditorListenerDefault() {
        }
            for (Pair<IWorkbenchPage, IEditorReference> editorRef : this) {

        IFile tempFile = ResourceUtils.getUniqueFile(scriptsFolder,
            }
        if (!scriptsFolder.exists()) {
import org.jkiss.dbeaver.model.DBConstants;
                }
            // We are in the root folder
            }
        } else {
        }
     * Checks whether template's context is suitable for the editor context
                    if (line == null) {
        }
            SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR,
            }
    /**
        }
        }
import java.util.function.Consumer;
        return scripts;
        prefStore.firePropertyChangeEvent(
            List<Pair<IWorkbenchPage, SQLEditor>> results = new LinkedList<>();
        @Override
            for (Pair<IWorkbenchPage, IEditorReference> editorRef : this) {
                navigatorContext.getExecutionContext(),
import java.util.*;
        }
                for (IEditorReference editorRef : page.getEditorReferences()) {
                            IFolder dbFolder = scriptsFolder.getFolder(CommonUtils.escapeFileName(f.getName()));

                log.debug("Project '" + projectFile.getProject() + "' not recognized (property write)");
            return SQLUtils.getScriptDescription(sql.toString());
