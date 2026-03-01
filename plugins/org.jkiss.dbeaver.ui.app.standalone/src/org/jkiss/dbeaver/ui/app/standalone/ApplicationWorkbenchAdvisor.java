    protected boolean isPropertyChangeRequiresRestart(String property) {
    protected final DBPApplication application;

        UIFonts.Eclipse.MEMORY_VIEW_TABLE_FONT,
            UIFonts.Eclipse.DETAIL_PANE_TEXT_FONT,
            }
                return false;
        log.error("Event loop exception", exception);
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationActivator;
    }
import org.eclipse.ui.application.IWorkbenchConfigurer;
            UIFonts.Eclipse.DIALOG_FONT,
    @Deprecated(since = "25.1.5")
        if (!WorkbenchPatcher.needsPerspectiveReset(Workbench.getInstance())) {
        WorkbenchUtils.movePreferencePages(NETWORK_PREF_PAGES, PrefPageConnectionsGeneral.PAGE_ID);
    }
            Dialog.DLG_IMG_MESSAGE_WARNING, DBeaverIcons.getImageDescriptor(DBIcon.SMALL_WARNING),
    }
}
            UIFonts.Eclipse.PART_TITLE_FONT,
        if (AWTUtils.isDesktopSupported()) {
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();

            );
import org.jkiss.dbeaver.ui.preferences.PrefPageDatabaseEditors;
            UIFonts.Eclipse.MEMORY_VIEW_TABLE_FONT,
    
        return EXCLUDE_PREF_PAGES;
import org.jkiss.dbeaver.ui.UIExecutionQueue;
    };
            return super.preShutdown();
        return true;
        UIFonts.Eclipse.VARIABLE_TEXT_FONT,
            if (desktop.isSupported(Desktop.Action.APP_EVENT_SYSTEM_SLEEP)) {
        PrefPageConstants.P2_PROVISIONING_PREF_PAGE_ID,
        }
    }
            return true;
import org.jkiss.dbeaver.model.task.DBTTaskManager;
                    return false;
    private IWizardDescriptor[] getAllWizards(IWizardCategory... categories) {
    };


    private static final Log log = Log.getLog(ApplicationWorkbenchAdvisor.class);
            params.put("startTime", DBWorkbench.getPlatform().getApplication().getApplicationStartTime());
    }
    // Move to General
import org.jkiss.dbeaver.ui.preferences.PrefPageConnectionsGeneral;
            Map<String, Object> params = new LinkedHashMap<>();
    private void patchJFaceIcons() {
        IWorkbenchPage workbenchPage = window.getActivePage();
    protected String[] getExcludedPreferencePageIds() {
    }
import org.jkiss.dbeaver.ui.UIFonts;
            UIFonts.Eclipse.TREE_AND_TABLE_FONT_FOR_VIEWS

            return;
        for (IWizardDescriptor wizard : getAllWizards(categories)) {
/**

    @Override


    @Override
        UIFonts.Eclipse.DETAIL_PANE_TEXT_FONT,
            OperationSystemState.toggleSleepMode(true);
        //"org.eclipse.ui.preferencePages.FileEditors",
import java.awt.*;
            if (!isWizardAllowed(wizardElement.getId())) {
        super.postShutdown();
        UIFonts.Eclipse.CONSOLE_FONT,
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceHandler;
            return;
        // Standard workbench finalizer works at the very end when it is too late
    // Shutdown
            UIFonts.Eclipse.TEXT_EDITOR_BLOCK_SELECTION_FONT,
        void catchUp() {
        }
    public void postShutdown() {
        IEditorReference[] editors = workbenchPage.getEditorReferences();
import org.jkiss.dbeaver.ui.preferences.PrefPageDatabaseUserInterface;
    );
            if (editorPart instanceof ISaveablePart2) {

    }

    }

        IWizardCategory[] categories = WorkbenchPlugin.getDefault().getNewWizardRegistry().getRootCategory().getCategories();
        super.eventLoopIdle(display);
    }
    };
        WorkbenchUtils.movePreferencePages(GENERAL_PREF_PAGES, PrefPageConstants.WORKBENCH_PREF_PAGE_ID);
        for (DBPDataSourceContainer dataSourceDescriptor : DataSourceRegistry.getAllDataSources()) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        if (getWorkbenchConfigurer().emergencyClosing() ||
import org.jkiss.dbeaver.runtime.OperationSystemState;
        patchJFaceIcons();
        FontPreferenceOverrides.hideFontPrefs(FONT_PREFERENCES_TO_HIDE);
                workbenchPage.closeEditor(editorPart, false);
        if (RuntimeUtils.isMacOS()) {
        DBeaverNotifications.showNotification(
*/
        }
            return false;
    public void eventLoopException(Throwable exception) {
    @Override
public class ApplicationWorkbenchAdvisor extends IDEWorkbenchAdvisor {

            }
                }
    private static final String[] EXCLUDE_PREF_PAGES = {
        }
            null,
                log.debug("Error disabling urischeme auto registration", e);
import org.eclipse.ui.internal.ide.IDEInternalWorkbenchImages;
        for (IEditorPart editorPart : editorsToRevert) {
        {
            defEncoding = GeneralUtils.UTF8_ENCODING;
            IInstanceController controller = DBeaverApplication.getInstance().getInstanceServer();
        if (DBWorkbench.getPlatform() instanceof DesktopPlatform platformDesktop) {
            try {
    }
 * DBeaver - Universal Database Manager
    private static class OpenEventProcessor implements Listener {
            Desktop desktop = Desktop.getDesktop();
            return;
                CoreApplicationMessages.confirmation_cancel_database_tasks_message
        return results.toArray(new IWizardDescriptor[0]);
        //"org.eclipse.team.ui.TeamPreferences",

/*
        ) {
import org.jkiss.dbeaver.ui.perspective.DBeaverPerspective;
    };
        return true;
            }
    protected boolean isWizardAllowed(String wizardId) {
        ResourcesPlugin.getPlugin().getPluginPreferences().setValue(ResourcesPlugin.PREF_ENCODING, defEncoding);
        }
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.trace.tracingPage",
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.jkiss.dbeaver.registry.DataSourceRegistry;
        final DBTTaskManager manager = activeProject.getTaskManager(false);
        }
        }
        super.eventLoopException(exception);
                log.debug(e);
        super.initialize(configurer);
            Dialog.DLG_IMG_MESSAGE_INFO, DBeaverIcons.getImageDescriptor(DBIcon.SMALL_INFO),
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationMessages;
        public void handleEvent(@NotNull Event event) {
        if (perspective != null && !perspective.getId().equals(DBeaverPerspective.PERSPECTIVE_ID)) {
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Views",
import org.eclipse.swt.widgets.Listener;
            property.equals(DBeaverPreferences.LOGS_DEBUG_ENABLED) ||
    }
        );
 *     http://www.apache.org/licenses/LICENSE-2.0
        WorkbenchUtils.removePreferencePages(getExcludedPreferencePageIds());
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.General.LinkHandlers",
    ///////////////////////
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final String[] NETWORK_PREF_PAGES = {
                manager.cancelRunningTasks();
        }
    @Override
                return false;
        // Remove unneeded pref pages and override font preferences page
        for (IEditorReference editor : editors) {
    private static final String PERSPECTIVE_ID = DBeaverPerspective.PERSPECTIVE_ID;
    public static final String DBEAVER_SCHEME_NAME = "org.jkiss.dbeaver.defaultKeyScheme"; //$NON-NLS-1$
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.jkiss.dbeaver.ui.app.standalone.rpc.IInstanceController;
            // System events

            }
        }
    // Move to Editors
                    return false;
        // (all connections are closed at that moment)

        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + PrefPageConstants.APPEARANCE_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Decorators",

    public void postStartup() {
import org.eclipse.swt.SWT;
            final boolean cancel = !confirmCancel || DBWorkbench.getPlatformUI().confirmAction(
            platformDesktop.setWorkbenchStarted(true);
        // Don't show Help button in JFace dialogs
            final String path = event.text;
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.search.preferences.SearchPreferencePage",
        if (manager.hasRunningTasks()) {
        // We also save all saveable parts here. Because we need to do this before transaction finializer hook.
    private static final String[] GENERAL_PREF_PAGES = {
    }
import org.eclipse.jface.resource.ImageDescriptor;
    }
        WorkbenchImages.getDescriptors().put(IDEInternalWorkbenchImages.IMG_OBJS_ERROR_PATH, DBeaverIcons.getImageDescriptor(DBIcon.SMALL_ERROR));
        String defEncoding = DBWorkbench.getPlatform().getPreferenceStore().getString(DBeaverPreferences.DEFAULT_RESOURCE_ENCODING);
import java.awt.desktop.SystemEventListener;
    public void initialize(IWorkbenchConfigurer configurer) {
        UIExecutionQueue.queueExec(page::resetPerspective);
            return cancel;
            return true;
        }
                return;
        }
        "org.eclipse.jsch.ui.SSHPreferences",

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;


            }
            return true;
                filesToOpen.add(path);
        //WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Startup",
            UIFonts.Eclipse.TEXT_FONT,
        resetPerspectiveIfNeeded();
            CoreFeatures.APP_CLOSE.use();
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + PrefPageConstants.EDITORS_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.AutoSave",
            }
    public boolean preShutdown() {
                filesToOpen.clear();
import org.eclipse.ui.*;
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
import org.eclipse.jface.dialogs.Dialog;
        return PERSPECTIVE_ID;
            // and we want to free them before application display will be disposed
    private static final Set<String> FONT_PREFERENCES_TO_HIDE = Set.of(
        // Replace Eclipse error icon shown in the "Problems" view with our own
    }
            PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + PrefPageConstants.EDITORS_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.GeneralTextEditor"

    private static final String[] UI_PREF_PAGES = {
import org.eclipse.ui.internal.WorkbenchImages;
        }
import java.awt.desktop.SystemSleepListener;
    protected ApplicationWorkbenchAdvisor(DBPApplication application) {
    private void filterPreferencePages() {
        // They are locking resources which are shared between other editors
        filterPreferencePages();
    }
            CoreApplicationMessages.notification_perspective_reset_message,


            display.addListener(SWT.OpenDocument, this);
import org.eclipse.ui.internal.ide.application.IDEWorkbenchAdvisor;
                wizardRegistry.removeExtension(wizardElement.getConfigurationElement().getDeclaringExtension(), new Object[]{wizardElement});
import org.jkiss.dbeaver.DBeaverPreferences;
        // So we need to close them first
        List<IWizardDescriptor> results = new ArrayList<>();
                editorsToRevert.add(editorPart);
            return;


 * You may obtain a copy of the License at
            Dialog.DLG_IMG_MESSAGE_ERROR, DBeaverIcons.getImageDescriptor(DBIcon.SMALL_ERROR)
            if (controller != null) {
 * This workbench advisor creates the window advisor, and specifies
            Desktop desktop = Desktop.getDesktop();
            CoreFeatures.APP_OPEN.use(params);
        }
            if (editorPart != null && editorPart.getEditorInput() instanceof ContentEditorInput) {
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
            // User rejected to exit
        OpenEventProcessor(@NotNull Display display) {
    private void resetPerspectiveIfNeeded() {
            }
 * Unless required by applicable law or agreed to in writing, software

            return true;
        if (DBWorkbench.getPlatform() instanceof BasePlatformImpl basePlatform) {
        DefaultScope.INSTANCE.getNode(CoreApplicationActivator.getDefault().getBundle().getSymbolicName());
        processor.catchUp();

        UIFonts.Eclipse.DIALOG_FONT,

            }
import org.eclipse.ui.wizards.IWizardDescriptor;

        UIFonts.DBeaver.MAIN_FONT, List.of(

            
import java.awt.desktop.SystemSleepEvent;
        if (!saveAndCleanup()) {
        //WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.ContentTypes",
            // System events
        }
        store.setToDefault(PROP_PERSPECTIVE_VERSION);
        // Remove legacy properties
                desktop.removeAppEventListener(systemSleepListener);

        // Team preferences - not needed in CE
        List<IEditorPart> editorsToRevert = new ArrayList<>();

    public static boolean cancelRunningTasks(boolean confirmCancel) {
            Collections.addAll(results, getAllWizards(wizardCategory.getCategories()));
        for (IEditorReference editor : editors) {

        if (page == null) {

import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
        }
import org.jkiss.dbeaver.ui.app.standalone.internal.WorkbenchPatcher;
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Workspace/org.eclipse.ui.preferencePages.BuildOrder",
import org.eclipse.swt.widgets.Display;

import org.jkiss.dbeaver.Log;
                }

        @Override

        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.epp.mpc.projectnatures",
        FontPreferenceOverrides.overrideFontPrefValues(fontOverrides);
                if (!forceRevert && !SaveableHelper.savePart(editorPart, editorPart, window, true)) {
    private static final String PROP_WORKBENCH_VERSION = "dbeaver.workbenchVersion"; //$NON-NLS-1$
    }
        this.processor = new OpenEventProcessor(Display.getCurrent());
import org.jkiss.dbeaver.core.DesktopPlatform;
    public void eventLoopIdle(Display display) {
import org.eclipse.ui.internal.dialogs.WorkbenchWizardElement;
 *
        WorkbenchUtils.movePreferencePages(UI_PREF_PAGES, PrefPageDatabaseUserInterface.PAGE_ID);
        UIFonts.Eclipse.COMPARE_TEXT_FONT,

            UIFonts.Eclipse.VARIABLE_TEXT_FONT,
        // Set default resource encoding to UTF-8
import org.eclipse.ui.internal.wizards.AbstractExtensionWizardRegistry;
        // Revert all open editors to avoid double confirmation
            // Disable URI handlers auto registration.
        if (showConfirmation && !forceRevert &&
            UIFonts.Eclipse.COMPARE_TEXT_FONT
        }

import org.jkiss.dbeaver.ui.DBeaverIcons;

            }

import org.jkiss.dbeaver.model.app.DBPApplicationDesktop;
import org.jkiss.dbeaver.ui.editors.content.ContentEditorInput;
        // Close all content editors
    public void preStartup() {
package org.jkiss.dbeaver.ui.app.standalone;
import org.eclipse.ui.internal.Workbench;
        super.postStartup();
            }
            }
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Keys",
            property.equals(ModelPreferences.PLATFORM_LANGUAGE);
    // Move to Connections
    private static final String PROP_PERSPECTIVE_VERSION = "dbeaver.perspectiveVersion"; //$NON-NLS-1$

        WorkbenchUtils.movePreferencePages(EDITORS_PREF_PAGES, PrefPageDatabaseEditors.PAGE_ID);
        if (activeProject == null) {
            if (filesToOpen.isEmpty()) {
        }
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Perspectives",
        "org.eclipse.debug.ui.DebugPreferencePage"                              // Debugger
import org.eclipse.ui.wizards.IWizardCategory;
        }
                !MessageDialogWithToggle.NEVER.equals(ConfirmationDialog.getSavedPreference(DBeaverPreferences.CONFIRM_EXIT))

        TrayDialog.setDialogHelpAvailable(false);
                EditorUtils.revertEditorChanges(editorPart);
            if (!DataSourceHandler.checkAndCloseActiveTransaction(dataSourceDescriptor, false, forceRollback)) {
        UIFonts.Eclipse.PART_TITLE_FONT,
        }
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + "org.eclipse.ui.net.NetPreferences",    // Network Connections
        if (DBWorkbench.getPlatform() instanceof DesktopPlatform platformDesktop) {
    @NotNull
            } catch (Exception e) {
        for(IWizardCategory wizardCategory : categories){
    private final OpenEventProcessor processor;
 * you may not use this file except in compliance with the License.
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + PrefPageConstants.EDITORS_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.FileEditors", //"File Associations"
    }
                desktop.addAppEventListener(systemSleepListener);
        if (CommonUtils.isEmpty(defEncoding)) {
            if (window != null) {
        ) {
import org.eclipse.jface.dialogs.IDialogConstants;
            }
        return !(application.isStandalone() && "org.eclipse.ui.wizards.new.project".equals(wizardId));


            null
import org.eclipse.ui.internal.WorkbenchPlugin;

 * distributed under the License is distributed on an "AS IS" BASIS,
     * Designed after {@link org.eclipse.ui.internal.ide.application.DelayedEventsProcessor}
import org.jkiss.dbeaver.ui.workbench.WorkbenchUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return new ApplicationWorkbenchWindowAdvisor(this, configurer);

                CoreApplicationMessages.confirmation_cancel_database_tasks_title,
            IEditorPart editorPart = editor.getEditor(false);
                new BundlePreferenceStore("org.eclipse.urischeme").setValue("skipAutoRegistration", true);
    }
        )

            // Dispose navigator model earlier because it may lock some UI resources
        }
        final Map<String, ImageDescriptor> icons = Map.of(
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            CoreApplicationMessages.notification_perspective_reset_title,
        if (AWTUtils.isDesktopSupported()) {

    }
        }

        // Initialize app preferences
            property.equals(DBeaverPreferences.LOGS_DEBUG_LOCATION) ||
            registry.put(entry.getKey(), entry.getValue());
            // Probably some TE user without permissions and projects
 */
        for (Map.Entry<String, ImageDescriptor> entry : icons.entrySet()) {
        UIFonts.Eclipse.TEXT_FONT,
                controller.openExternalFiles(filesToOpen.toArray(String[]::new));
        public void systemAwoke(SystemSleepEvent e) {
        @Override
        if (manager == null) {
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.browser.preferencePage",
            } catch (Exception e) {


        AbstractExtensionWizardRegistry wizardRegistry = (AbstractExtensionWizardRegistry) WorkbenchPlugin.getDefault().getNewWizardRegistry();
import org.jkiss.dbeaver.core.CoreFeatures;
        WorkbenchImages.getImageRegistry().put(IDEInternalWorkbenchImages.IMG_OBJS_ERROR_PATH, DBeaverIcons.getImageDescriptor(DBIcon.SMALL_ERROR));
        IPerspectiveDescriptor perspective = page.getPerspective();
    @Override
                    != IDialogConstants.YES_ID) {
import org.jkiss.dbeaver.model.DBIcon;
            (DBWorkbench.getPlatform().getApplication() instanceof DBPApplicationDesktop ad && ad.isForcedRestart())
    public static boolean closeOpenEditors(IWorkbenchWindow window, boolean forceRevert, boolean showConfirmation) {
import org.eclipse.jface.resource.JFaceResources;
                if (!ApplicationWorkbenchAdvisor.closeOpenEditors(window, false, true)) {
        ),
        UIFonts.DBeaver.MONOSPACE_FONT, List.of(


 * Licensed under the Apache License, Version 2.0 (the "License");
        if (window == null) {
        IWorkbenchPage page = window.getActivePage();
    private final SystemEventListener systemSleepListener = new SystemSleepListener() {
        filterWizards();
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Globalization",
import org.eclipse.jface.resource.ImageRegistry;
        }
            WorkbenchWizardElement wizardElement = (WorkbenchWizardElement) wizard;
        }
        }
            DBeaverNotifications.NT_PERSPECTIVE_RESET,
        this.application = application;
            basePlatform.disposeNavigatorModel();
    };
     */
    private static final String[] EDITORS_PREF_PAGES = {
            if (desktop.isSupported(Desktop.Action.APP_EVENT_SYSTEM_SLEEP)) {
        }
            log.error(e);

    //processor must be created before we start event loop
            }
    public static boolean closeActiveTransactions(boolean forceRollback) {
import org.eclipse.swt.widgets.Event;
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
    @Override
import org.jkiss.dbeaver.ModelPreferences;
            Collections.addAll(results, wizardCategory.getWizards());
    private void filterWizards() {

            IWorkbenchWindow window = getWorkbenchConfigurer().getWorkbench().getActiveWorkbenchWindow();
        } else {
            OperationSystemState.toggleSleepMode(false);
import java.util.List;
        //DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(settingsChangeListener);
import org.jkiss.dbeaver.model.app.DBPApplication;
        }
    }
        }

        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/" + PrefPageConstants.EDITORS_PREF_PAGE_ID,
import org.jkiss.dbeaver.ui.editors.EditorUtils;
 * See the License for the specific language governing permissions and
    public String getInitialWindowPerspectiveId() {
 *
import org.jkiss.code.NotNull;

import java.util.*;



        UIFonts.Eclipse.TEXT_EDITOR_BLOCK_SELECTION_FONT,
 */
        public void systemAboutToSleep(SystemSleepEvent e) {


    private static final Map<String, List<String>> fontOverrides = Map.of(
    // Move to UI
        }
            if (path != null) {
import org.jkiss.dbeaver.ui.AWTUtils;
            IEditorPart editorPart = editor.getEditor(false);
        PrefPageConstants.P2_PROVISIONING_PREF_PAGE_ID + "/" + PrefPageConstants.P2_SITES_PREF_PAGE_ID,
            UIFonts.Eclipse.CONSOLE_FONT,
        } catch (Throwable e) {
        return
        }
import org.jkiss.dbeaver.registry.BasePlatformImpl;

import org.jkiss.dbeaver.runtime.DBeaverNotifications;
            if (ConfirmationDialog.confirmAction(window.getShell(), DBeaverPreferences.CONFIRM_EXIT, ConfirmationDialog.QUESTION)
        }

            // They modify plist file on MacOS - this breaks sealed application
        try {
        @Override
    }
        );
    };
        WorkbenchImages.getImageRegistry().remove(IDEInternalWorkbenchImages.IMG_OBJS_ERROR_PATH);
        PrefPageConstants.WORKBENCH_PREF_PAGE_ID + "/org.eclipse.text.quicksearch.PreferencesPage",
    private boolean saveAndCleanup() {
        }
import org.eclipse.jface.dialogs.TrayDialog;
import org.jkiss.dbeaver.ui.preferences.PrefPageConstants;
import org.jkiss.dbeaver.model.app.DBPProject;
 * limitations under the License.
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
        private final List<String> filesToOpen = new ArrayList<>(1);
        final ImageRegistry registry = JFaceResources.getImageRegistry();
    @Override

            return ApplicationWorkbenchAdvisor.cancelRunningTasks(true) && ApplicationWorkbenchAdvisor.closeActiveTransactions(false);
 * the perspective id for the initial window.
        store.setToDefault(PROP_WORKBENCH_VERSION);
            // Workaround of #703 bug. NEVER doesn't make sense for Exit confirmation. It is the same as ALWAYS.
    /**
        IWorkbenchWindow window = Workbench.getInstance().getActiveWorkbenchWindow();
import org.eclipse.core.runtime.preferences.DefaultScope;

            }
import org.eclipse.ui.internal.SaveableHelper;
            platformDesktop.setWorkbenchStarted(false);
        return true;
/*
        "org.eclipse.ui.internal.console.ansi.preferences.AnsiConsolePreferencePage",
            try {
    @Deprecated(since = "25.1.5")
        //WORKBENCH_PREF_PAGE_ID + "/org.eclipse.ui.preferencePages.Workspace",
    );
        log.debug("Resetting perspective due to missing view definitions in the workbench file");

        UIFonts.Eclipse.TREE_AND_TABLE_FONT_FOR_VIEWS

            registry.remove(entry.getKey());
        super.preStartup();
            if (cancel) {

