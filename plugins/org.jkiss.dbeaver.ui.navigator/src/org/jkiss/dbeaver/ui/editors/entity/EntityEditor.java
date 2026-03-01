import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
            firePropertyChange(IEditorPart.PROP_DIRTY);

    }
                setPageImage(index, DBeaverIcons.getImage(descriptor.getIcon()));
        }
                    if (folderId != null) {
        private transient Boolean success = null;
        monitor.done();
        }
        return false;
                defFolderId = editorDefaults.folderId;
/*
        if (activeAdapter != null) {

import org.jkiss.dbeaver.model.edit.DBECommand;
        }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
    /**
                            return Status.CANCEL_STATUS;
                "driver", databaseObject.getDataSource() == null ? "" :
            changedSubEditors.add(UINavigatorMessages.registry_entity_editor_descriptor_name);
        return editorMap.get(pageId);
    @Nullable
    
            if (control != null) {
        if (commandListener != null && commandContext != null) {
                getDatabaseObject().getName()) != IDialogConstants.YES_ID)
    }
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
        return dataSource != null && dataSource.getInfo().supportsReferentialIntegrity();
            }
                UIUtils.syncExec(() -> firePropertyChange(IEditorPart.PROP_DIRTY));
            log.warn("Null command context");
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                setPageToolTip(index, descriptor.getDescription());
                result = serviceSQL.openSQLViewer(
            return RefreshResult.IGNORED;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                        return;
            }
                } else {
                return;
                //force = true;
                }
import java.nio.file.Files;
    private IEditorPart activeEditor;
            }
            // Try to handle error in nested editors

                    if (ConfirmationDialog.confirmAction(
                    for (IEditorPart editor : editorMap.values()) {
        return getEditorInput().getDatabaseObject();
    public void recreateEditorControl() {
        DBSObject databaseObject = getEditorInput().getDatabaseObject();
        T activeAdapter = getNestedAdapter(adapter);
                if (commandContext != null && commandContext.isDirty()) {
                    options.put(DBPScriptObject.OPTION_OBJECT_SAVE, true);
        // Show preview
        }

                log.error(e);
            ));
                setPageText(0, "Error");

    private final Map<IEditorPart, IEditorActionBarContributor> actionContributors = new HashMap<>();

            try {
    // fired when editor is initialized with a database object (e.g. after lazy loading, navigation or history browsing).

        for (IEditorPart editor : editorMap.values()) {
            {

        if (commandContext != null) {
        }
            }
                    //getSite().getPage().closeEditor(this, true);
 * Licensed under the Apache License, Version 2.0 (the "License");
            {
        actionContributors.clear();
            UIUtils.asyncExec(() ->
            return;
                    }
        UIUtils.setHelp(getContainer(), IHelpContextIds.CTX_ENTITY_EDITOR);
                "Read-only",
import org.jkiss.dbeaver.ui.editors.*;
import java.lang.reflect.InvocationTargetException;
    public void handlePropertyChange(int propId)
            }
    @Override
        for (EntityEditorDescriptor descriptor : descriptors) {
                    if (!refreshNestedPart && editor instanceof ObjectPropertiesEditor && isRename) {
        // Check read-only
                    monitor.setCanceled(true);
//                    allowSave);
    private static void saveTabsConfiguration() {
    public void doRevertToSaved() {
            }
            {
            updateEditorDefaults(editorPageId, null);
    }
            return true;
            }
            return true;
            }
                if (editor instanceof IRefreshablePart) {
        final DBSObject databaseObject = getEditorInput().getDatabaseObject();
import org.jkiss.dbeaver.model.navigator.DBNNode;
        viewer.setInput(getEditorInput().getNavigatorNode());
        if (defaultPageMap == null) {
        }
            previewResult = showChanges(true);

        @Override
                    defaultPageMap.put(object.getClass().getName(), editorDefaults);
    {
            if (monitor.isCanceled()) {
    }
                    }
                    Files.newBufferedReader(configFile),
                    // Save nested editors
//            getWorkbenchPart().getSite().getPage().saveEditor(this, false);
                EntityEditorPropertyTester.firePropertyChange(EntityEditorPropertyTester.PROP_DIRTY);
        } finally {
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    @Override
            firePropertyChange(IEditorPart.PROP_DIRTY);
        if (defPageId != null) {
            firePropertyChange(IEditorPart.PROP_DIRTY);
            // Save

            final Control control = ((CTabFolder) getContainer()).getTopRight();
        DBECommandContext commandContext = getCommandContext();
        } else {
    {
import org.eclipse.swt.widgets.Control;
                if (node != null) {
                    }
            return true;

        }
    protected void createPages()
        } catch (Throwable e) {
        } else {
        DBPObject object;
                null,
    public void addFolderListener(ITabbedFolderListener listener)
        {

                editorDefaults = defaultPageMap.get(databaseObject.getClass().getName());
        private int result;
                DBECommandContext commandContext = getCommandContext();
            deactivateEditor();
                        DBEPersistAction[] persistActions = command.getPersistActions(
        composite.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
        }
        folderListener = folderId -> {
        ) {
        }
            if (contributorClass != null) {
                addEditorTab(descriptor);
    }
            try {

        }
            // Save
    public DBECommandContext getCommandContext()
        DBCExecutionContext executionContext = getExecutionContext();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
//                if (object instanceof DBPPersistedObject && !((DBPPersistedObject)object).isPersisted()) {
        }

            return;
        };
                EntityEditorDescriptor editorDescriptor = EntityEditorsRegistry.getInstance().getEntityEditor(editor);

            commandListener = null;
    @Override
            this.folderId = folderId;
                        return Status.CANCEL_STATUS;
                    setPageToolTip(
            monitor.setCanceled(true);
                true, null);
        firePropertyChange(IEditorPart.PROP_DIRTY);
        UIUtils.syncExec(changesPreviewer);
            if (editor != null) {
                DBWorkbench.getPlatformUI().showError("Can't save '" + getDatabaseObject().getName() + "'", null, vError));
        if (Display.getCurrent() != null) {

        }
        // Run post-save commands (e.g. compile)
        }
    }
        }

            if (monitor.isCanceled()) {
        DBPPreferenceListener listener = event -> {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
import org.eclipse.jface.text.IUndoManager;
                // Otherwise just update object's properties
        } else {
        addContributions(EntityEditorDescriptor.POSITION_MIDDLE);
            }
        } catch (Exception e) {
                pageMap = JSONUtils.GSON.fromJson(
                setPageText(0, input.canLoadImmediately()
            return IDialogConstants.CANCEL_ID;
                if (editorDefaults == null) {
        composite.addDisposeListener(e -> store.removePropertyChangeListener(listener));
        }
                setActivePage(0);
        }
    private DBECommandAdapter commandListener;

        }
        recreatePages();
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceToolbarUtils;
                commandContext.saveChanges(monitor, options));
    }
            refreshPart(this, true, false);
        addContributions(EntityEditorDescriptor.POSITION_PROPS);
                            success = false;
        if (error == null) {
            NavigatorPreferences.CONFIRM_ENTITY_EDIT_CLOSE,
            if (editor.isDirty()) {
            // It'll refresh database object and all it's descendants
    @Override
    private class SaveJob extends AbstractJob {
        if (adapter == IPropertySheetPage.class) {

            contributor = contributorClass.getDeclaredConstructor().newInstance();
        if (hasPropertiesEditor) {
        }
        }

    @Override
            }
        };
    {
            if (navigatorNode != null) {
            // There are no changes to save
                    setPageImage(propEditorIndex, DBeaverIcons.getImage(node.getNodeIconDefault()));
        return null;
        try {
import java.util.*;
            try {
            }
                    editor.doSave(monitor);
        Map<String, Object> context = new LinkedHashMap<>();




    private boolean hasPropertiesEditor;
        }
        finally {
                setPageImage(0, DBeaverIcons.getImage(UIIcon.REFRESH));
        }
            getSite().getShell(),
        }
            super("Save '" + getPartName() + "' changes...");
        }
import org.jkiss.dbeaver.ui.controls.CustomFormEditor;
                            treeNode.refreshNode(monitor, doRefresh ? DBNEvent.FORCE_REFRESH : DBNEvent.UPDATE_ON_SAVE);
                            false));
            });
                setPageImage(0, UIUtils.getShardImage(ISharedImages.IMG_OBJS_ERROR_TSK));
                }
        DBNDatabaseNode navigatorNode = getEditorInput().getNavigatorNode();
    public boolean isEntityContainer(DBSObjectContainer object) {
        }
            activeEditor.doSaveAs();
            final Class<? extends IEditorActionBarContributor> contributorClass = descriptor.getContributorClass();

/**
        Throwable error = null;
    public boolean isDirty()
    @Nullable
            int index = addPage(editor, nestedInput);
                            getDatabaseObject().getName()) != IDialogConstants.YES_ID) {
                }
        store.addPropertyChangeListener(listener);
import org.jkiss.dbeaver.model.impl.edit.DBECommandAdapter;
    }
            recreateEditorControl();
    }
        final DBECommandContext commandContext = getCommandContext();
                    // If it is a rename event then force refresh
                        throw new InvocationTargetException(e);
 *     http://www.apache.org/licenses/LICENSE-2.0
                setPageText(propEditorIndex, UINavigatorMessages.editors_entity_properties_text);
        DBECommandContext commandContext = getCommandContext();
            EntityEditorDescriptor defaultEditor = editorsRegistry.getMainEntityEditor(databaseObject, this);

            monitor.beginTask("Save changes...", 1);
    }
    }
    {

        }

            if (event.getNodeChange() == DBNEvent.NodeChange.REFRESH) {
            if (!CommonUtils.isEmpty(descriptor.getDescription())) {

                    if (pageId != null) {
            }
            log.error("Error adding nested editor", ex); //$NON-NLS-1$
                    }
            saveInProgress = true;

                return;
            }
        DBSObject databaseObject = editorInput.getDatabaseObject();
    }
                        return Status.OK_STATUS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;

            commandContext.resetChanges(true);

                StandardOpenOption.TRUNCATE_EXISTING);
    private volatile boolean saveInProgress = false;
            position);
            }
    @Override
        return saveInProgress;
    private static final int PROP_OBJECT_INIT = 0x212;

            }
    public void redoChanges()
                UIUtils.asyncExec(() -> tfc.switchFolder(folderId));
            if (ConfirmationDialog.confirmAction(
            if (defaultEditor != null) {
            saveInProgress = false;
    private boolean addEditorTab(EntityEditorDescriptor descriptor)
                new AbstractJob("Database node refresh") { //$NON-NLS-1$
            IEditorPart activeEditor = getActiveEditor();
                // Lists and commands should be refreshed only if we make real refresh from remote storage
            !DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR)
            return false;
            return false;
            dei.setDefaultPageId(pageId);
            this.script = script;
 * distributed under the License is distributed on an "AS IS" BASIS,
//                    getExecutionContext(),
        return getEditorInput().getCommandContext();
    private void addActionsContributor(IEditorPart editor, Class<? extends IEditorActionBarContributor> contributorClass) throws Exception {
                if (adapter.isAssignableFrom(activeEditor.getClass())) {
            object,
    {
    @Override
    public boolean loadEditorInput() {
            if (editor instanceof IEntityStructureEditor || editor instanceof IEntityDataEditor) {
                    : UINavigatorMessages.editors_entity_title_uninitialized);
                }
 * Unless required by applicable law or agreed to in writing, software
public class EntityEditor extends MultiPageDatabaseEditor
        for (int i = 0; i < getPageCount(); i++) {
//            }

    }
            return ISaveablePart2.CANCEL;

        synchronized (editorMap) {
        final IDatabaseEditorInput input = getEditorInput();
import org.eclipse.swt.custom.CTabFolder;
            if (Files.exists(configFile)) {
            DBECommandContext commandContext = getCommandContext();
            return IDialogConstants.CANCEL_ID;
                commandContext.redoCommand();
        }
            DBWorkbench.getPlatformUI().showError("Script generate error", "Couldn't generate alter script", e.getTargetException());
            }
        if (error == null) {
            return childType != null && DBSTable.class.isAssignableFrom(childType);
        }
                NavigatorPreferences.CONFIRM_ENTITY_REVERT,

        if (previewResult != IDialogConstants.PROCEED_ID) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
            // Refresh underlying node
    }
                EntityEditorPropertyTester.firePropertyChange(EntityEditorPropertyTester.PROP_CAN_REDO);
            if (defEditorPage != null) {
            error = e;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
            return IDialogConstants.PROCEED_ID;
                    }
                firePropertyChange(IEditorPart.PROP_DIRTY);
                final DBECommandContext commandContext = getCommandContext();
    }
            UIUtils.runInProgressService(monitor -> {
                }
        return activeEditor instanceof IProgressControlProvider ? ((IProgressControlProvider) activeEditor).getProgressControl() : null;
            }
    private static final Log log = Log.getLog(EntityEditor.class);
        List<EntityEditorDescriptor> descriptors = editorsRegistry.getEntityEditors(
            return true;
        EntityEditorsRegistry editorsRegistry = EntityEditorsRegistry.getInstance();
                    getDatabaseObject().getName() + " - " + (allowSave ? UINavigatorMessages.editors_entity_dialog_persist_title : UINavigatorMessages.editors_entity_dialog_preview_title),
            log.debug("Null database object in EntityEditor");
        }
        for (Map.Entry<IEditorPart, IEditorActionBarContributor> entry : actionContributors.entrySet()) {
    public int promptToSaveOnClose()
            }
                            ConfirmationDialog.QUESTION,
            // Add object editor page
import org.jkiss.utils.CommonUtils;
        // Add contributed pages
                return;
        }
        boolean isRename = false;
                    boolean refreshNestedPart = force;
            if (propId == IEditorPart.PROP_DIRTY) {
        }
    @Override
        if (editorPageId != null) {
            undoManager.redo();
                            getExecutionContext(),
            if (editorInterface.isAssignableFrom(getEditor(i).getClass())) {
//                }
import org.jkiss.dbeaver.ui.editors.DatabaseEditorPreferences.BreadcrumbLocation;
                Files.createDirectories(configPath.getParent());
        {
            } else {
        } else {
 */
            DBNDatabaseNode navigatorNode = getEditorInput().getNavigatorNode();
        // Flush all nested object editors and result containers
                        throw new InvocationTargetException(e);
            DBExecUtils.tryExecuteRecover(monitor, executionContext.getDataSource(), param ->
    public void removeFolderListener(ITabbedFolderListener listener)
                null,
            return true;
                addActionsContributor(editor, contributorClass);
import org.jkiss.dbeaver.DBException;

                    }
import org.eclipse.swt.SWT;

        if (commandContext != null) {

    public EntityEditor() {
    @Override
            return ((ProgressEditorPart) getActiveEditor()).scheduleEditorLoad();
    private String getEditorPageId(IEditorPart editorPart)
//            // Remove all non-persisted objects

import org.jkiss.code.NotNull;
                }
        }

                }
    @Nullable
                    //return;
        if (editorInput instanceof DatabaseLazyEditorInput input) {
        if (getActiveEditor() instanceof ITabbedFolderContainer) {
            }
                    try {
        int previewResult = IDialogConstants.PROCEED_ID;
            ConfirmationDialog.QUESTION_WITH_CANCEL,
            // Update main editor image
        if (databaseObject != null) {
    @Override
        } else {
                    new TypeToken<Map<String, EditorDefaults>>(){}.getType());
    {

            synchronized (defaultPageMap) {
//        if (getActiveEditor() instanceof IFolderedPart) {
        Composite composite = new Composite(parent, SWT.NONE);
    }
            // Let's just refresh dirty status
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
        this.activeEditor = getActiveEditor();
        // Add contributed pages
        } catch (DBException e) {
        addContributions(EntityEditorDescriptor.POSITION_START);
            }
                        success = false;
        contributorManager.addContributor(contributor, editor);
    }
        }
                            persistActions,
    }
            for (DBECommand<?> cmd : commandContext.getFinalCommands()) {
                }.schedule();
    {
                monitor.done();
    {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        node.getNodeTypeLabel() + UINavigatorMessages.editors_entity_properties_tooltip_suffix
                DBNNode node = editorInput.getNavigatorNode();
    }
    }
        }
            this.allowSave = allowSave;
            EntityEditorFeatures.ENTITY_EDITOR_OPEN.use(Map.of(
            subEditorsString);
                entry.getValue().setActiveEditor(activeEditor);
        DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTION_ACTIVE);
        // restrict delegating to the UI thread for bug 144851

        {
            return;
        }
                setActivePage(0);
            }

                    monitor.worked(1);
        if (databaseObject == null) {
                if (success == null) {
import org.jkiss.dbeaver.model.navigator.DBNEvent;
                            dataSource,
            return false;
        NodeBreadcrumbViewer viewer = new NodeBreadcrumbViewer(composite, SWT.TOP);

                commandContext.resetChanges(true);
        }
    }
                } else {
                    // Let's ask user about it
                ConfirmationDialog.QUESTION,
    }
            defaultPageMap = loadTabsConfiguration();
    public RefreshResult refreshPart(final Object source, boolean force) {
    public boolean isSaveInProgress() {
                StandardCharsets.UTF_8,
            if (descriptor.getIcon() != null) {


//                    scriptGenerator,
            }
                // This may happen if editor was refreshed indirectly (it is a child of refreshed node)
//                result = serviceSQL.openGeneratedScriptViewer(
        try {
        } else {


                composite.setVisible(BreadcrumbLocation.get(store) == BreadcrumbLocation.IN_EDITORS);
        if (result == IDialogConstants.YES_ID) {
            return;
    public ProgressPageControl getProgressControl()
                NavigatorPreferences.CONFIRM_ENTITY_REVERT,
                if (uiSource != null && !(uiSource instanceof CustomFormEditor)) {
    public IEditorPart getPageEditor(String pageId) {
        }


        if (commandContext != null && commandContext.isDirty()) {
            return IDialogConstants.IGNORE_ID;
        if (activeEditor instanceof ITabbedFolderContainer tfc) {
import org.eclipse.core.runtime.IStatus;
        // Property listener
            log.error(e);
import org.eclipse.core.runtime.IProgressMonitor;
        try {
    }
            log.error(e);
        String defPageId = editorInput.getDefaultPageId();
            Path configPath = DBWorkbench.getPlatform().getLocalConfigurationFile(TABS_CONFIG_FILE);
                    // Undo of last command in command context will close editor
        final DBECommandContext commandContext = getCommandContext();
    public boolean isSaveAsAllowed()

    }
        if (getEditorInput() instanceof IUnloadableEditorInput) {
        String subEditorsString = changedSubEditors.isEmpty() ? "" : "(" + String.join(", ", changedSubEditors) + ")";

            } finally {
            IEditorInput nestedInput = descriptor.getNestedEditorInput(getEditorInput());
                    getExecutionContext(),
            if (serviceSQL != null) {

import org.jkiss.dbeaver.model.edit.DBECommandContext;
    public DBPDataSourceContainer getDataSourceContainer() {

                    }
            defPageId = editorDefaults.pageId;
    {
                monitor.beginTask("Generate SQL script", commands.size());
            }
            }
                    Map<String, Object> options = new HashMap<>();
                final IErrorVisualizer errorVisualizer = getAdapter(IErrorVisualizer.class);
            final DBNDatabaseNode treeNode = getEditorInput().getNavigatorNode();
            commandContext.removeCommandListener(commandListener);

            if (event.getProperty().equals(DatabaseEditorPreferences.UI_STATUS_BAR_SHOW_BREADCRUMBS)) {
                            monitor,
                setActiveEditor(getEditor(i));
            ((ITabbedFolderContainer)getActiveEditor()).getActiveFolder();
import org.jkiss.dbeaver.ui.controls.PropertyPageStandard;
        }
        if (adapter == DBSObject.class) {
        if (getDatabaseObject() instanceof DBPStatefulObject) {
        saveTabsConfiguration();
import org.jkiss.dbeaver.ui.actions.DataSourcePropertyTester;
{
        return RefreshResult.REFRESHED;
            try {
            if (editor instanceof IRevertableEditor) {
     * @param monitor progress monitor
        super.createPages();

    private RefreshResult refreshPart(final Object source, boolean force, boolean showConfirmation) {
                return success ? Status.OK_STATUS : Status.CANCEL_STATUS;
                return RefreshResult.CANCELED;
                if (editorPageId != null) {
        return databaseObject == null ? super.toString() : DBUtils.getObjectFullName(databaseObject, DBPEvaluationContext.UI);
        String editorPageId = getEditorPageId(activeEditor);
        }
    {
                SaveJob saveJob = new SaveJob();
        }
            // Disposed during editor opening
    }
                            NavigatorPreferences.CONFIRM_ENTITY_REJECT,
            Object source2 = event.getSource();
                    isRename = true;
            return;
                    editorDefaults = new EditorDefaults(pageId, folderId);

    @Override

                    ? UINavigatorMessages.editors_entity_title_initializing
import org.eclipse.core.runtime.Status;
                    ProxyProgressMonitor proxyMonitor = new ProxyProgressMonitor(monitor);
        }
        if (editorInput instanceof DatabaseEditorInput<?> dei) {
            }
    }
        DBECommandContext commandContext = getCommandContext();
                    } catch (final DBException e) {

            try {
        }
                log.error(e);
    private boolean saveCommandContext(final DBRProgressMonitor monitor, Map<String, Object> options) {
            }
        return super.getAdapter(adapter);
                success = false;

        });
    public void setActiveEditor(Class<?> editorInterface) {
        DBSObject databaseObject = getDatabaseObject();
        if (undoManager != null) {
            }
            if (commandContext != null) {
                // Just report an error
            return true;
                    @Override
    }

        }
            }
 */
            Files.writeString(
                commandContext.undoCommand();

    private class ChangesPreviewer implements Runnable {
                }
    private static Map<String, EditorDefaults> defaultPageMap;
        addContributions(EntityEditorDescriptor.POSITION_END);
import org.jkiss.dbeaver.ui.*;
            return adapter.cast(databaseObject);
        try {
        }
        } catch (Exception e) {
                int propEditorIndex = getPageCount() - 1;
        if (DBUtils.isReadOnly(getDatabaseObject()) ||
    }
                if (getActiveEditor() != editor) {

                    try {
            // Refresh visual content in parts
 * EntityEditor
//                    props,
                    break;
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolderListener;
            return activeAdapter;
            }
        }
        ChangesPreviewer(StringBuilder script, boolean allowSave)
        return changed;
        this.editorMap.clear();
        }
            object = databaseObject;
            return ISaveablePart2.NO;
            if (descriptor.getType() == EntityEditorDescriptor.Type.editor) {
                    changedSubEditors.add(editorDescriptor.getName());

            log.warn("Null execution context");
                    success = saveCommandContext(monitor, options);
        } else if (editorInput instanceof ErrorEditorInput input) {
    @Override
    }
    private final Map<String, IEditorPart> editorMap = new LinkedHashMap<>();
            }
                        );
                hasPropertiesEditor = addEditorTab(defaultEditor);
            if (ConfirmationDialog.confirmAction(
        if (executionContext == null) {
    @Override
        }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    ((IRefreshablePart)editor).refreshPart(source, refreshNestedPart);
    {
            } else {

import org.jkiss.dbeaver.Log;
        DBPDataSource dataSource = object.getDataSource();
        @Override
        boolean changed = false;

        } else if (result == IDialogConstants.NO_ID) {
            }
        super.dispose();
        }
                StandardOpenOption.CREATE,
                    } catch (DBException e) {
        };
    public void doSaveAs()
            pageMap = new HashMap<>();
    }
                ((ITabbedFolderContainer) editor).addFolderListener(folderListener);
        List<String> changedSubEditors = new ArrayList<>();
        IDatabaseEditorInput editorInput = getEditorInput();
                            return GeneralUtils.makeExceptionStatus(e);
            if (editor instanceof ITabbedFolderContainer) {
        // Revert command context
            return false;
            return result;
        EditorDefaults editorDefaults = null;
    public static final String TABS_CONFIG_FILE = "entity-editor-tabs.json"; //$NON-NLS-1$
import org.eclipse.swt.widgets.Composite;
import java.nio.charset.StandardCharsets;
                        } catch (DBException e) {
                }
            object = databaseObject.getDataSource();
    }
            final IEditorInput input = ((IUnloadableEditorInput) getEditorInput()).unloadInput();
    public String toString() {
        }
            }
                monitor.subTask("Save '" + getPartName() + "' changes...");
    public boolean isRelationalObject(DBSObject object) {
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolder;
            final Throwable vError = error;
                    allowSave,
    }
import org.eclipse.ui.*;
        StringBuilder script = new StringBuilder();
        private final StringBuilder script;
                }
        // Command listener
                boolean doRefresh = isNewObject;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                String folderId = defFolderId;
import com.google.gson.reflect.TypeToken;
                        command.validateCommand(monitor, validateOptions);
        addPropertyListener((source, propId) -> {
                // Wait until job finished

        for (IEditorPart editor : editorMap.values()) {
            }
        } else {
                    return;
        }
            }

    {
                ConfirmationDialog.QUESTION,
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
        }
    }
            }
        try {
        GlobalContributorManager contributorManager = GlobalContributorManager.getInstance();

import org.eclipse.ui.views.properties.IPropertySheetPage;
            }
            saveInProgress = true;
        final IDatabaseEditorInput editorInput = getEditorInput();
        }
            return ISaveablePart2.YES;
 * You may obtain a copy of the License at
        Map<String, EditorDefaults> pageMap = null;
                for (DBECommand<?> command : commands) {
            }

                    script.toString(),
    protected void pageChange(int newPageIndex) {
        Collection<? extends DBECommand<?>> commands = commandContext.getFinalCommands();
                    changed = true;
            return true;
            if (source2 instanceof DBPEvent event2 && event2.getData() == DBPEvent.RENAME) {
            } catch (DBCException e) {
        this.activeEditor = null;
            }
                setActiveEditor(defEditorPage);
import org.jkiss.dbeaver.model.exec.DBCException;

                ((IRevertableEditor) editor).doRevertToSaved();
            return adapter.cast(new PropertyPageStandard());

    @Override
        return false;


    implements IPropertyChangeReflector, IProgressControlProvider, ISaveablePart2, IRevertableEditor, ILazyEditor,
        if (!isDirty()) {
                }
                result = IDialogConstants.OK_ID;
        if (getDatabaseObject() != null && commandContext != null) {
    {

            commandContext.addCommandListener(commandListener);
        if (EditorUtils.isInAutoSaveJob()) {
        if (databaseObject != null) {
import org.jkiss.dbeaver.ui.editors.entity.properties.ObjectPropertiesEditor;
    public DBSObject getDatabaseObject()
                if (editor.isDirty()) {
        return DBUtils.getContainer(getDatabaseObject());
        }
            }
    }
            this.pageId = pageId;
    }
        }
        if (commandContext == null) {
    private static Map<String, EditorDefaults> loadTabsConfiguration() {
        } catch (InterruptedException e) {

    @Override
import java.nio.file.StandardOpenOption;
    }
            for (IEditorPart editor : editorMap.values()) {
            }
        boolean isPersistedObject = databaseObject != null && databaseObject.isPersisted();
            IDatabaseEditorInput editorInput = getEditorInput();
            IEditorPart defEditorPage = editorMap.get(defPageId);
                            null,
                entry.getValue().setActiveEditor(null);


//        }
        }
        String defFolderId = editorInput.getDefaultFolderId();
        }
            IEditorPart editor = descriptor.createEditor();
import org.jkiss.dbeaver.model.rm.RMConstants;
            DBWorkbench.getPlatformUI().showNotification(
            return;
            DBECommandContext commandContext = getCommandContext();
            return;
                        script.append(SQLUtils.generateScript(
        for (IEditorPart editor : editorMap.values()) {


        } else {
                    updateEditorDefaults(editorPageId, folderId);

    {
            // So we'll get actual data from database
    @Override
                String editorPageId = getEditorPageId(editor);
    }

            this,
     * Saves data in all nested editors
            setInput(input);
        }
    private final ITabbedFolderListener folderListener;
    public boolean unloadEditorInput() {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        if (getContainer() instanceof CTabFolder) {
    {
    public boolean switchFolder(String folderId)
        if (script.isEmpty()) {
    }
        if (pageMap == null) {
    @Override
        private EditorDefaults(String pageId, String folderId)
                }
        boolean isNewObject = getDatabaseObject() == null || !getDatabaseObject().isPersisted();
                if (result != null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        }
        if (commandContext == null) {
            setPageText(index, descriptor.getName());
            setUser(true);
                }
                    databaseObject.getDataSource().getContainer().getDriver().getPreconfiguredId()
    // This is used by extensions to determine whether this entity is another entity container (e.g. for ERD)
                }

                if (errorVisualizer != null) {
        }
    @Override
                }
        composite.setVisible(BreadcrumbLocation.get(store) == BreadcrumbLocation.IN_EDITORS);
        IEditorPart activeEditor = getActiveEditor();
                    setActiveEditor(editor);

        return changesPreviewer.getResult();
        if (commandContext != null && commandContext.isDirty()) {


                        }
import org.jkiss.dbeaver.model.struct.DBSObject;
            {
        setPartName(getEditorInput().getName());
                UIUtils.waitJobCompletion(saveJob, monitor);
    }
 * DBeaver - Universal Database Manager

        @NotNull
    private static class EditorDefaults {
                getTitle()) != IDialogConstants.YES_ID)
        }
                if (cmd.getObject() instanceof DBSObject && !((DBSObject) cmd.getObject()).isPersisted()) {
        DBSObject object = editorInput.getDatabaseObject();
        if (source instanceof DBNEvent event) {
                EditorDefaults editorDefaults = defaultPageMap.get(object.getClass().getName());
                firePropertyChange(IEditorPart.PROP_DIRTY);
 * limitations under the License.
                    @NotNull
    private boolean createPageForInput(@NotNull IEditorInput editorInput) {
            public void onCommandChange(DBECommand<?> command)
                    isNewObject = true;
                if (!getDatabaseObject().isPersisted() && commandContext.getUndoCommands().size() == 1) {
        if (isDirty()) {
        }
        if (navigatorNode == null) {
        IUndoManager undoManager = getAdapter(IUndoManager.class);
    @Override

                return true;
    public void revertChanges()
        if (force) {
            if (!Files.exists(configPath.getParent())) {
        String pageId;
                    }
            return false;
        for (Map.Entry<IEditorPart, IEditorActionBarContributor> entry : actionContributors.entrySet()) {
                        propEditorIndex,
            }

            undoManager.undo();

 *
    public void undoChanges()

    @Nullable
        }
                }
 * See the License for the specific language governing permissions and
            if (editor instanceof IDatabasePostSaveProcessor) {
                        editorDefaults.folderId = folderId;
        if (object != null) {
        }
            UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
            }
        activeEditor = getEditor(newPageIndex);
    }

     */
                    return entry.getKey();
            if (commandContext != null && commandContext.getUndoCommand() != null) {

                        if (monitor.isCanceled()) {
                addPage(new ProgressEditorPart(this), input);
        }
import org.eclipse.jface.dialogs.IDialogConstants;
    {
        }
        }
                            editor.doSave(proxyMonitor);
                    monitor.subTask(command.getTitle());
        }
                }
                        try {
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolderContainer;
                    errorVisualizer.visualizeError(monitor, vError);
                monitor.done();

            if (hasPropertiesEditor) {
        }
    }

    private void updateEditorDefaults(String pageId, @Nullable String folderId)
import org.eclipse.jface.layout.GridDataFactory;
        IEditorPart activeEditor = getActiveEditor();
        public void run()
import org.eclipse.swt.widgets.Display;
        String folderId;
//                    UIIcon.SQL_PREVIEW,
        } catch (Exception ex) {
                updateTopRightControl();
                if (success) {
    {

            // Do not save entity editors in auto-save job (#2408)
                    Map<String, Object> options = new HashMap<>();
//                    dataSource.getContainer().fireEvent(new DBPEvent(DBPEvent.Action.OBJECT_REMOVE, (DBSObject) object));
import org.jkiss.dbeaver.ui.navigator.breadcrumb.NodeBreadcrumbViewer;
        ChangesPreviewer changesPreviewer = new ChangesPreviewer(script, allowSave);
                control.dispose();
    }
    ITabbedFolderContainer, DBPDataSourceContainerProvider, IEntityEditorContext
        composite.setLayout(GridLayoutFactory.fillDefaults().create());
                if (!saveJob.success) {
        if (getContainer() == null || getContainer().isDisposed() || saveInProgress) {

                JSONUtils.GSON.toJson(defaultPageMap),
        try {

}
import org.jkiss.dbeaver.model.*;
        }
            if (editor.isDirty()) {

//                    allowSave ? UINavigatorMessages.editors_entity_dialog_persist_title : UINavigatorMessages.editors_entity_dialog_preview_title,
            log.error("Error loading tabs configuration", e);

            GlobalContributorManager.getInstance().removeContributor(entry.getValue(), entry.getKey());

            if (entry.getKey() == activeEditor) {
        // Fire dirty flag refresh to re-enable Save-As command (which is enabled only for certain pages)
        for (IEditorPart editor : editorMap.values()) {
            setActiveEditor(getEditor(0));
            DBECommandContext commandContext = getCommandContext();
                log.error(e);
                    options.put(DBPScriptObject.OPTION_OBJECT_SAVE, true);
            editorMap.put(descriptor.getId(), editor);
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
            } catch (Throwable e) {
            } catch (PartInitException e) {
                    }
        return null;
    @Override
                            options
    }
        }
        }
        actionContributors.put(editor, contributor);
            } catch (PartInitException e) {
 *
    private void addContributions(String position)
                    UIIcon.SQL_PREVIEW,
            Class<? extends DBSObject> childType = object.getPrimaryChildType(null);
        } else {
    {

                        }
            if (defFolderId != null) {
                }
        return null;
    public void dispose() {
            if (editor == null) {
        } catch (DBException e) {
    }
            log.error("Error saving tabs configuration", e);
        if (contributor == null) {
    public <T> T getNestedAdapter(Class<T> adapter) {
            }
                saveJob.schedule();
        final int result = ConfirmationDialog.confirmAction(
        try {
    {
        }
    {

            UIUtils.syncExec(() -> {
            getEditorInput().getNavigatorNode().getNodeDisplayName(),
    public static final String ID = "org.jkiss.dbeaver.ui.editors.entity.EntityEditor"; //$NON-NLS-1$
            log.error(e);
            saveInProgress = false;
            }
            Path configFile = DBWorkbench.getPlatform().getLocalConfigurationFile(TABS_CONFIG_FILE);

            @Override
                        editorDefaults.pageId = pageId;
                return GeneralUtils.makeExceptionStatus(e);
        super.handlePropertyChange(propId);
        private final boolean allowSave;
            if (defFolderId == null && editorDefaults != null) {

        }
    }
        if (input instanceof DatabaseLazyEditorInput lei && !lei.canLoadImmediately()) {
        }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        refreshNestedPart = true;

            }
                    success = true;

                    return adapter.cast(activeEditor);
 * you may not use this file except in compliance with the License.
                if (editorDescriptor != null) {
        if (force && isPersistedObject && isDirty() && showConfirmation) {
import org.jkiss.dbeaver.model.runtime.ProxyProgressMonitor;
            // Weird
                "className", databaseObject.getClass().getSimpleName(),
            for (Map.Entry<String,IEditorPart> entry : editorMap.entrySet()) {
        if (activeEditor != null && activeEditor.isSaveAsAllowed()) {
        setTitleImage(getEditorInput().getImageDescriptor());
        return this.activeEditor != null && this.activeEditor.isSaveAsAllowed();
            DBSObject databaseObject = editorInput.getDatabaseObject();
                }
            if (editor instanceof ITabbedFolderContainer tfc) {
    {
    @Override
        }
                setPageImage(0, DBeaverIcons.getImage(navigatorNode.getNodeIconDefault()));
        DataSourceToolbarUtils.refreshSelectorToolbar(getSite().getWorkbenchWindow());
                Map<String, Object> options = event2.getOptions();
                if (tfc.switchFolder(folderId)) {
                    return adapter.cast(result);
package org.jkiss.dbeaver.ui.editors.entity;

        IUndoManager undoManager = getAdapter(IUndoManager.class);
            // Check for any new nested objects
            });
 *
        public int getResult()
        if (createPageForInput(editorInput)) {
            dei.setDefaultFolderId(folderId);
        IEditorActionBarContributor contributor = contributorManager.getContributor(contributorClass);
                }
            return IDialogConstants.CANCEL_ID;
//            ((IFolderedPart)getActiveEditor()).switchFolder(folderId);

            }
        for (IEditorPart editor : editorMap.values()) {
                EntityEditorPropertyTester.firePropertyChange(EntityEditorPropertyTester.PROP_CAN_UNDO);
                ((DBPStatefulObject) getDatabaseObject()).refreshObjectState(monitor);
    }
        {
        }
            }
        if (undoManager != null) {
                if (commandContext != null && commandContext.isDirty()) {
import java.nio.file.Path;
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
    }
        final DBECommandContext commandContext = getCommandContext();
            if (isPersistedObject) {
        commandListener = new DBECommandAdapter() {
        if (getContainer() == null || getContainer().isDisposed()) {
                    );

        }
                    protected IStatus run(@NotNull DBRProgressMonitor monitor) {

        return pageMap;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            IEditorPart editor = getActiveEditor();

//            for (DBPObject object : getCommandContext().getEditedObjects()) {
            firePropertyChange(PROP_INPUT);
import org.jkiss.code.Nullable;
            EntityEditorsRegistry editorsRegistry = EntityEditorsRegistry.getInstance();
        if (databaseObject instanceof DBPDataSourceContainer && databaseObject.getDataSource() != null) {
            // Show error dialog
            if (activeEditor != null) {
        }
                "Object [" + DBUtils.getObjectFullName(getDatabaseObject(), DBPEvaluationContext.UI) + "] is read-only",


                }
    public int showChanges(boolean allowSave) {
        return refreshPart(source, force, true);
            if (treeNode != null) {
        DBECommandContext commandContext = getCommandContext();
        try {
        }
            return;
        }
                return false;
        }

                if (entry.getValue() == editorPart) {
        firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
        firePropertyChange(PROP_OBJECT_INIT);
    protected Control createTopRightControl(Composite parent) {
                        }
    public void doSave(IProgressMonitor monitor)
            commandContext.resetChanges(true);

        SaveJob() {
            } finally {
        if (CommonUtils.isEmpty(commands)) {
                    commandContext.resetChanges(true);

    @Override
    }
        if (defPageId == null && editorDefaults != null) {
        if (previewResult == IDialogConstants.IGNORE_ID) {

        }
        }
            super.pageChange(newPageIndex);
                    // Just clear command context. Do not undo because object state was already refreshed
                configPath,

            }
                Map<String, Object> validateOptions = new HashMap<>();
                log.error(e);
        monitor.beginTask("Save entity", 1);
    }
                Object result = activeEditor.getAdapter(adapter);
        } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
                    true);
                ((IDatabasePostSaveProcessor) editor).runPostSaveCommands(context);
    public <T> T getAdapter(Class<T> adapter) {

    public ITabbedFolder getActiveFolder()
            if (commandContext != null && commandContext.getRedoCommand() != null) {
                break;
                addPage(new ErrorEditorPartEx(input.getError()), input);
        return composite;
    @Override
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_SQL_PREVIEW)) {
                Object uiSource = options.get(DBEObjectManager.OPTION_UI_SOURCE);
                    DBPDataSource dataSource = getDatabaseObject().getDataSource();
                        if (editor.isDirty()) {
                    success = true;
            return true;
                    if (proxyMonitor.isCanceled()) {
import org.eclipse.jface.layout.GridLayoutFactory;
    @Override
            hasPropertiesEditor = false;
        for (IEditorPart editor : editorMap.values()) {
            }
        if (!isNewObject) {
