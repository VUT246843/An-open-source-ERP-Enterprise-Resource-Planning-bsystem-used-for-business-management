        log.debug("Initialize workbench window");
    private static final Log log = Log.getLog(ApplicationWorkbenchWindowAdvisor.class);
            return;
                }
            if (activePart != null) {
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        if (propertyChangeListener != null) {
                true,
                }
            sj.add(workspaceLocation);
                public void partBroughtToTop(IWorkbenchPartReference ref) {

        configurer.getWindow().addPageListener(new IPageListener() {
            }

            );
        hookTitleUpdateListeners(configurer);
                    // do nothing
import org.eclipse.ui.internal.ide.IDEInternalPreferences;
            @Override
            }
            ApplicationCSSManager.updateApplicationCSS(Display.getCurrent());

 * Licensed under the Apache License, Version 2.0 (the "License");
        configurer.setShowStatusLine(true);
                        && lastActiveEditor != null) {
            }
                    }
     * and marks it with {@link EditorRegistry#EMPTY_EDITOR_ID}.
                            }
                    updateTitle(false);
            container = EditorUtils.getInputDataSource(editor.getEditorInput());
 * DBeaver - Universal Database Manager
public class ApplicationWorkbenchWindowAdvisor extends IDEWorkbenchWindowAdvisor implements DBPProjectListener, IResourceChangeListener {
            @Override
import org.eclipse.core.runtime.NullProgressMonitor;
                public void partDeactivated(IWorkbenchPartReference ref) {
                // setting last active page.
        StringJoiner sj = new StringJoiner(" - "); //$NON-NLS-1$
    public class EditorAreaDropAdapter extends DropTargetAdapter {
                    IResource resource = delta.getResource();
import org.eclipse.ui.internal.ide.application.IDEWorkbenchWindowAdvisor;

        }
        return GeneralUtils.getProductTitle();
        if (platform != null) {
    }
            // Not an editor
            configurer.getWindow()));
        });
            }
 * limitations under the License.
        if (ps.getBoolean("SHOW_LOCATION")) {
            // FIXME: dirty hack of standard commands handle (e.g. CTRL+C)
    private boolean hasEditorsForDataSource(@NotNull DBPDataSourceContainer container) {
                    if (resource instanceof IFile) {
                initWorkbenchWindows();
            sj.add(computeProductTitle());
            }
     * This can be achieved by causing the workbench to persist its state without
            activeEditor.addPropertyListener(editorPropertyListener);

import org.eclipse.ui.part.EditorInputTransfer;
                    if (view != null && view != activePart) {
                    handlePartClosed(ref);
        UIUtils.asyncExec(() -> {
    }
            }
                false,
    private void closeEmptyEditors() {




package org.jkiss.dbeaver.ui.app.standalone;

            try {
/*
            return;
 * You may obtain a copy of the License at
    private void hookTitleUpdateListeners(IWorkbenchWindowConfigurer configurer) {
        }
            IWorkbenchPage activePage = getWindowConfigurer().getWindow().getActivePage();
            activeEditor = null;
        }

        }
    }
import org.eclipse.ui.application.ActionBarAdvisor;
        if (lastActiveEditor != null) {
import org.eclipse.swt.graphics.Point;
                // Make sure the title is actually updated by
import org.jkiss.dbeaver.model.app.*;
            }


    @Override
    protected String computeProductTitle() {
        IPerspectiveDescriptor persp = null;
        try {
        return sj.toString();
                updateTitle(false);
import org.eclipse.swt.widgets.Display;
                try {
                lastActivePage = null;
            @Override
        if (propId == IWorkbenchPartConstants.PROP_TITLE) {
            new IPartListener2() {
                    IViewPart view = viewReference.getView(false);
        lastActiveEditor = activeEditor;
        }
        //super.preWindowOpen();
        ProgressManagerUtil.SHORT_OPERATION_TIME = 100;

        }
    /**
        if (ps.getBoolean("SHOW_PRODUCT_IN_TITLE")) {
                @Override
            }
            for (IEditorReference reference : page.getEditorReferences()) {
                recomputeTitle();
        for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
                for (IEditorReference ref : page.getEditorReferences()) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            IDEWorkbenchPlugin.getDefault().getPreferenceStore().removePropertyChangeListener(propertyChangeListener);
        }
        }

            DataSourceHandler.disconnectDataSource(container, null);
    public void resourceChanged(IResourceChangeEvent event) {
                    if (ref instanceof IEditorReference) {
                        updateTitle(false);
    private IWorkbenchPage lastActivePage;
        IDEWorkbenchPlugin.getDefault().getPreferenceStore().addPropertyChangeListener(propertyChangeListener);
                } catch (DBException e) {
                IEditorPart activeEditor = activePage.getActiveEditor();
                        updateTitle(false);
        super(advisor, configurer);

import org.eclipse.swt.graphics.Rectangle;
        if (activeEditor == lastActiveEditor && currentPage == lastActivePage
        // Nothing to do if the editor hasn't changed
import org.eclipse.ui.*;
                    }
        }
                updateTitle(false);

 */
            @Override
            input = currentPage.getInput();
            // Re-activate active part to trigger keybindings refresh for it

        configurer.setShowCoolBar(true);

        recomputeTitle();
        //PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_MEMORY_MONITOR, true);
            if (IDEInternalPreferences.WORKSPACE_NAME.equals(property)
    }
                                }
        if (ps.getBoolean("SHOW_LOCATION_NAME")) {
        configurer.setShowProgressIndicator(true);
        }
    }
    @Override
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        if (currentPage != null) {
            return EditorUtils.getInputDataSource(ref.getEditorInput()) == container;

                @Override
    }
                                        IFile file = EditorUtils.getFileFromInput(activeEditor.getEditorInput());
            persp = currentPage.getPerspective();
                        activePage.activate(view);

                // do nothing
                Platform.getApplicationArgs()
            return false;
                }
    private IPropertyChangeListener propertyChangeListener;
        }
    }
            try {

import org.jkiss.dbeaver.Log;
                sj.add(workspaceName);
            public void perspectiveDeactivated(IWorkbenchPage page,
        UIExecutionQueue.queueExec(() -> {
        super.dispose();
import org.eclipse.core.runtime.CoreException;
                }
        String newTitle = computeTitle();
    }
        // Remove project listener
            String property = event.getProperty();
    @NotNull
            IWorkbenchPage activePage = window.getActivePage();


 * See the License for the specific language governing permissions and
                        updateTitle(true);
                        if ((IResourceDelta.MOVED_TO & delta.getFlags()) != 0) {
    @Override


    }
    @Override
        try {
            @Override
        } catch (Throwable e) {
import org.eclipse.ui.internal.progress.ProgressManagerUtil;
    @Override

        };
                    }
                        && lastActiveEditor != null) {
                public void partOpened(IWorkbenchPartReference ref) {

        for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
                                        if (file != null && file.equals(resource)) {
        return true;
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                event.getDelta().accept(delta -> {
        closeEmptyEditors();
                DBeaverApplication.getInstance().getInstanceServer(),
import org.eclipse.swt.dnd.DropTargetAdapter;
                log.error(e);
        super.postWindowCreate();
import org.jkiss.dbeaver.utils.GeneralUtils;
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
     * Since such editors lack any data, Eclipse doesn't know what editor it is,

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        IAdaptable input = null;
 *
        configurer.setShowPerspectiveBar(true);
    }
                    if (ref instanceof IEditorReference) {
    protected void initWorkbenchWindows() {
        log.debug("Finish initialization");
        super.postWindowOpen();
            }
                                    if (activeEditor != null) {

                public void partVisible(IWorkbenchPartReference ref) {
            public void pageClosed(IWorkbenchPage page) {
            }
                public void partInputChanged(IWorkbenchPartReference ref) {
 *
        }
    public void postWindowCreate() {
            refreshProjects();
                    }
        }
import org.jkiss.dbeaver.ui.editors.DatabaseEditorPreferences;
        if (editorHidden) {
            if (lastActiveEditor != null) {
        lastActivePage = currentPage;
            configurer.setTitle(newTitle);
        }
     * <p>
        if (container != null && !hasEditorsForDataSource(container)) {

            }
                updateTitle(false);
            if (activePage != null) {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
    private void refreshProjects() {
    private boolean isEditorForDataSource(@NotNull IEditorReference ref, @NotNull DBPDataSourceContainer container) {
            }
                }
        IWorkbenchWindow window = getWindowConfigurer().getWindow();
    }
        if (!(ref instanceof IEditorReference editor)) {
        // hook up the listeners to update the window title

                    }
                        return false;

import org.eclipse.core.runtime.Platform;
    @Override
            });
    @Override
import org.jkiss.dbeaver.DBException;
    private void handlePartClosed(@NotNull IWorkbenchPartReference ref) {
        // Configure window
import org.eclipse.swt.dnd.FileTransfer;
import java.util.StringJoiner;
        log.debug("Configure workbench window");
 * distributed under the License is distributed on an "AS IS" BASIS,
        configurer.configureEditorAreaDropListener(new EditorAreaDropAdapter());
        configurer.addEditorAreaTransfer(FileTransfer.getInstance());
 * Unless required by applicable law or agreed to in writing, software
                                            UIUtils.asyncExec(this::recomputeTitle);
                    if (isEditorForDataSource(ref, container)) {
    public void postWindowOpen() {
                                if (activePage != null) {
    private IEditorPart lastActiveEditor = null;
                @Override
     */
                project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
        for (IWorkbenchPage page : getWindowConfigurer().getWindow().getPages()) {


                }
            if (workspaceName != null && workspaceName.length() > 0) {

        propertyChangeListener = event -> {
                sj.add(activeProject.getName()); //$NON-NLS-1$
            return;
                }
                    return true;
            String workspaceLocation = Platform.getLocation().toOSString();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * using such hook, so empty editors do not appear under normal circumstances.

                        updateTitle(false);
        recomputeTitle();
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
                    }
                @Override
        UIUtils.asyncExec(this::recomputeTitle);
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_DISCONNECT_ON_EDITORS_CLOSE)) {
        }
        });
                || IDEInternalPreferences.SHOW_PERSPECTIVE_IN_TITLE.equals(property)
        configurer.addEditorAreaTransfer(MarkerTransfer.getInstance());

            && persp == lastPerspective && input == lastInput) {
        configurer.addEditorAreaTransfer(ResourceTransfer.getInstance());
            for (IWorkbenchPage page : window.getPages()) {
                    if (ref.getPart(false) == lastActiveEditor

import org.eclipse.core.resources.*;
                if (activeEditor != null) {
                public void partClosed(IWorkbenchPartReference ref) {
            log.error("Error processing command line", e);
            String workspaceName = ps.getString("WORKSPACE_NAME");
        if (window != null) {
            }
import org.eclipse.jface.preference.IPreferenceStore;
    private IAdaptable lastInput;
}
            } catch (CoreException e) {
        configurer.getWindow().getPartService().addPartListener(
        IEditorPart activeEditor = null;
    }
        log.debug("Create actions");
    };

        DBPPlatform platform = DBWorkbench.getPlatform();
                    log.error("Error creating workbench window initializer", e);
        }

    protected String computeTitle() {
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
            IWorkbenchPart activePart = activePage.getActivePart();
     * and then force-closing the application (via task manager, etc.), so exit
                        return true;
     * actually closing the application (e.g. using workbench auto-save feature),
        // Jobs longer than this will show progress dialog

        }

        }
    }

        configurer.addEditorAreaTransfer(EditorInputTransfer.getInstance());
                    // do nothing
        if (ps.getBoolean("SHOW_PERSPECTIVE_IN_TITLE")) {
                @Override
                });
                }
        }
        }
        if (window.isClosing()) {
     * Hooks the listeners needed on the window
import org.eclipse.jface.util.IPropertyChangeListener;
    @Override
        } catch (PartInitException ignored) {
        }
                if (EditorRegistry.EMPTY_EDITOR_ID.equals(reference.getId())) {
        }

                public void partActivated(IWorkbenchPartReference ref) {

    private void recomputeTitle() {
                    }


    public void dispose() {

        if (activeEditor != null) {
import org.jkiss.dbeaver.ui.UIExecutionQueue;
            @Override
        } catch (Exception e) {
import org.eclipse.ui.part.MarkerTransfer;
                }
    public void preWindowOpen() {
        }
                for (IViewReference viewReference : activePage.getViewReferences()) {
        lastPerspective = persp;

    public boolean preWindowShellClose() {
        lastInput = input;
        });
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceHandler;
import org.eclipse.ui.application.IActionBarConfigurer;

 *
            log.warn(e);

            }
        try {
        String oldTitle = configurer.getTitle();
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
    }
                || IDEInternalPreferences.SHOW_LOCATION.equals(property)
    protected boolean isRunWorkbenchInitializers() {
                            if (workbenchWindow != null) {
    public void handleActiveProjectChange(@NotNull DBPProject oldValue, @NotNull DBPProject newValue) {
            lastActiveEditor.removePropertyListener(editorPropertyListener);
            return;

        return new ApplicationActionBarAdvisor(configurer);

        // Show heap usage

     */
                                           IPerspectiveDescriptor newPerspective) {
        }
                log.error("Error refreshing project '" + project.getName() + "'", e);
            if (activeProject != null) {
            } catch (Exception e) {
        IPreferenceStore ps = IDEWorkbenchPlugin.getDefault().getPreferenceStore();
                    if (ref.getPart(false) == lastActiveEditor
        DataSourceProviderRegistry.getInstance();
                        break;
                                IWorkbenchPage activePage = workbenchWindow.getActivePage();
                        }
                }

 *     http://www.apache.org/licenses/LICENSE-2.0
                        activePage.activate(activePart);

                public void partHidden(IWorkbenchPartReference ref) {
        try {
                }
                    descriptor.newInstance().initializeWorkbenchWindow(getWindowConfigurer());
     * hooks are not called. In fact, we do manually close non-persistable editors
    }
                updateTitle(false);

                                    }
                    // do nothing
        configurer.getWindow().addPerspectiveListener(new PerspectiveAdapter() {
    }
        // Use hardcoded pref constants to avoid E4.7 compile dependency
                    sj.add(activeEditor.getTitle());
            activeEditor = currentPage.getActiveEditor();
    }
import org.eclipse.ui.part.ResourceTransfer;

import org.jkiss.dbeaver.runtime.DBWorkbench;
        configurer.configureEditorAreaDropListener(new org.eclipse.ui.internal.ide.EditorAreaDropAdapter(

            // Open New Connection wizard
            public void perspectiveActivated(IWorkbenchPage page,
    }
import org.jkiss.dbeaver.ui.UIUtils;
            // Checker for active editor's file change

                                               IPerspectiveDescriptor perspective) {
                                           IPerspectiveDescriptor oldPerspective,
            public void pageOpened(IWorkbenchPage page) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.registry.WorkbenchHandlerRegistry;
        if (!newTitle.equals(oldTitle)) {
        // Refresh all projects
        } catch (PartInitException ignored) {
                }
import org.eclipse.ui.internal.registry.EditorRegistry;
            DBeaverCommandLine.getInstance().executeCommandLineCommands(
            public void perspectiveSavedAs(IWorkbenchPage page,
                    page.closeEditors(new IEditorReference[]{reference}, false);

    /**
                }
    private IPerspectiveDescriptor lastPerspective = null;
                @Override
        configurer.setInitialSize(new Point(displaySize.width * 3 / 4, displaySize.height * 3 / 4));
                updateTitle(false);
            public void pageActivated(IWorkbenchPage page) {
 * you may not use this file except in compliance with the License.
                                        }
                            IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        }


            }
                @Override
            }
        if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
        if (DBeaverApplication.WORKSPACE_MIGRATED) {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        // Set timeout for short jobs (like SQL queries)
        Rectangle displaySize = Display.getCurrent().getPrimaryMonitor().getBounds();
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
                || IDEInternalPreferences.SHOW_LOCATION_NAME.equals(property)

        }
            log.debug("Last editor for '" + container.getName() + "' was closed. Closing connection");

            container = null;
        DBPPlatformDesktop.getInstance().getWorkspace().addProjectListener(this);
    public ApplicationWorkbenchWindowAdvisor(ApplicationWorkbenchAdvisor advisor, IWorkbenchWindowConfigurer configurer) {
    private void updateTitle(boolean editorHidden) {
        if (isRunWorkbenchInitializers()) {
            workspace.removeProjectListener(this);
import org.eclipse.core.runtime.IAdaptable;
    }
        // Initialize drivers in the very beginning
    }
            DBPWorkspaceEclipse workspace = DBPPlatformDesktop.getInstance().getWorkspace();

            propertyChangeListener = null;
        }
                updateTitle(false);
        });
            }
            for (var descriptor : WorkbenchHandlerRegistry.getInstance().getWorkbenchWindowInitializers()) {
    private final IPropertyListener editorPropertyListener = (source, propId) -> {
                @Override
        return false;
        // Listen for changes of the workspace name.
        IWorkbenchWindow window = configurer.getWindow();
     * Closes all empty editors that has no persisted state associated with it.
                                    IEditorPart activeEditor = activePage.getActiveEditor();
        return true;
        }

                || IDEInternalPreferences.SHOW_PRODUCT_IN_TITLE.equals(property)) {
    }
        DBPDataSourceContainer container;
                                             IPerspectiveDescriptor perspective) {
        IWorkbenchPage currentPage = window.getActivePage();
     * <p>
