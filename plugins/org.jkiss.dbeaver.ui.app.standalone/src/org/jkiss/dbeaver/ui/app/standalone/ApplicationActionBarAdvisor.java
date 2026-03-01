                            convertLDMenu.add((IAction)actionClass.getConstructor().newInstance());
            //windowMenu.add(new ToggleViewAction(DatabaseTasksView.VIEW_ID));
                    PrefPageDatabaseUserInterface.PAGE_ID,
        ApplicationPolicyService.getInstance().disableStandardProductModification(window.getService(ICommandService.class));
        menuBar.add(editMenu);
            // Window
    };
            {
import org.jkiss.dbeaver.ui.*;
            localeItem.setText(Locale.getDefault().toString());
import org.jkiss.dbeaver.Log;
                //fileMenu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));
                bindImage(cis, IWorkbenchCommandConstants.FILE_REFRESH, UIIcon.REFRESH);
        {
                pavField.setAccessible(true);
            fileMenu.add(recentEditors);
                } else {
                PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(
                patchSearchIcons(actionSet);

                fileMenu.add(ActionUtils.makeCommandContribution(workbenchWindow, "org.eclipse.ui.edit.text.openLocalFile"));
                            StandardConstants.ENV_USER_TIMEZONE,
            if (!DBWorkbench.isDistributed()) {
                Field pavField = cfgElement.getClass().getDeclaredField("propertiesAndValue");
            windowMenu.add(new ToggleViewAction(DatabaseNavigatorView.VIEW_ID));
            if (openWorkspaceAction != null) {
    private static final Log log = Log.getLog(ApplicationActionBarAdvisor.class);
import org.jkiss.dbeaver.ui.navigator.project.ProjectExplorerView;
                    PrefPageDatabaseUserInterface.PAGE_ID,
        {

                    preferenceDialog.open();
                //fileMenu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
        "org.eclipse.ui.actionSet.openFiles"
        menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
    {

    protected IWorkbenchAction showHelpAction;
        super(configurer);
    }

            navigateMenu.add(new GroupMarker(IWorkbenchActionConstants.NAV_START));
            windowMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
        menuBar.add(windowMenu);
import org.eclipse.swt.SWT;
    }
                    UIUtils.getActiveWorkbenchShell(),
                    log.trace("Disable Eclipse action set '" + actionSet.getId() + "'");
                bindImage(cis, ITextEditorActionDefinitionIds.GOTO_LAST_EDIT_POSITION, UIIcon.RS_BACK);
            windowMenu.add(new ToggleViewAction(ProjectExplorerView.VIEW_ID));
                bindImage(cis, IWorkbenchCommandConstants.FILE_SAVE_AS, UIIcon.SAVE_AS);
                bindImage(cis, IWorkbenchCommandConstants.FILE_EXPORT, UIIcon.EXPORT);
                    UIUtils.getActiveWorkbenchShell(),

        cis.bind(commandId, CommandImageManager.TYPE_HOVER, null, id);
                    }


                            CoreApplicationMessages.timezone_change_info_message,
        ActionSetRegistry asr = WorkbenchPlugin.getDefault().getActionSetRegistry();
            fileMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
                            log.error(e);
        }
                        SWT.ICON_INFORMATION
                for (int i = 0; i < pav.length; i += 2) {


import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationMessages;
    private void bindImage(CommandImageService cis, String commandId, DBIcon icon) {
import org.eclipse.jface.resource.ImageDescriptor;
import org.jkiss.dbeaver.ui.app.standalone.update.CheckForUpdateAction;
import org.jkiss.utils.BeanUtils;
        cis.bind(commandId, CommandImageManager.TYPE_DEFAULT, null, id);
import org.eclipse.ui.internal.WorkbenchPlugin;
                if (ArrayUtils.contains(REDUNTANT_ACTIONS_SETS, actionSet.getId())) {
        menuBar.add(navigateMenu);
        patchImages();
 */
        newWindowAction = ActionFactory.OPEN_NEW_WINDOW.create(window);
//        register(searchHelpAction = ActionFactory.HELP_SEARCH.create(window));
        register(newWindowAction);
import org.eclipse.core.runtime.Platform;
//        historyForwardAction = ActionFactory.FORWARD_HISTORY.create(window);
                if (event.getProperty().equals(ModelPreferences.CLIENT_TIMEZONE)) {
    @Override
                    UIUtils.showMessageBox(

    private void removeUnWantedActions() {
        } catch (Throwable e) {
            } else if ("org.eclipse.search.OpenFileSearchPage".equals(saId)) {
        {
        }
 * you may not use this file except in compliance with the License.
        //"org.eclipse.ui.edit.text.actionSet.navigation", //$NON-NLS-1$
            helpMenu.add(ActionUtils.makeCommandContribution(workbenchWindow, "org.eclipse.ui.help.installationDialog"));
        IWorkbenchWindow workbenchWindow = getActionBarConfigurer().getWindowConfigurer().getWindow();
            localeItem.setDoubleClickListener(() -> {
import org.jkiss.dbeaver.ui.preferences.PrefPageDatabaseUserInterface;
            if ("org.eclipse.search.searchActionSet".equals(actionSet.getId())) {
import org.eclipse.ui.internal.registry.IActionSetDescriptor;
            MenuManager recentEditors = new MenuManager(CoreApplicationMessages.actions_menu_recent_editors);
                bindImage(cis, IWorkbenchCommandConstants.FILE_SAVE_ALL, UIIcon.SAVE_ALL);
        IWorkbenchWindow workbenchWindow = getActionBarConfigurer().getWindowConfigurer().getWindow();

                editMenu.add(convertLDMenu);
                showViewMenuMgr.add(showViewMenu);
    {
        //coolBar.add(new ToolBarContributionItem(new ToolBarManager(SWT.FLAT | SWT.RIGHT), IActionConstants.TOOLBAR_DATASOURCE));
        menuBar.add(fileMenu);
    protected boolean isShowAltHelp() {
        try {
            ActionSetRegistry asr = WorkbenchPlugin.getDefault().getActionSetRegistry();
    }
        //register(aboutAction);
import org.eclipse.jface.action.*;
        coolBar.add(new ToolBarContributionItem(new ToolBarManager(SWT.FLAT | SWT.RIGHT), IActionConstants.TOOLBAR_TXN));
        tzItem.setToolTip(tzDefault.getDisplayName(inDaylight, TimeZone.LONG));
            } else {
        IActionSetDescriptor[] actionSets = asr.getActionSets();
        }
{
        }
                        } catch (Throwable e) {
            if (actionSet != null) {
        }
            helpMenu.add(new Separator());
            if (cfgElement  != null) {
        log.trace("Create workbench actions");
                    null);
            tzItem.setDoubleClickListener(() -> {
import java.util.Locale;
import org.jkiss.dbeaver.ui.app.standalone.about.AboutBoxAction;
            String saId = searchActionItem.getAttribute("id");
        }
 * new actions.
            helpMenu.add(showHelpAction);
import org.eclipse.ui.application.IActionBarConfigurer;
        register(ActionFactory.SAVE_ALL.create(window));
    @Override
            }
            helpMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));


            windowMenu.add(new GroupMarker("primary.views"));
            updateTimezoneItem(tzItem);


            recentEditors.add(new GroupMarker(IWorkbenchActionConstants.MRU));
            //fileMenu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
    protected void fillCoolBar(ICoolBarManager coolBar)

                if (preferenceDialog != null) {
        register(ActionFactory.PRINT.create(window));
            if (service instanceof CommandImageService) {
            windowMenu.add(new GroupMarker("perspective"));
                        }
        }

 * An action bar advisor is responsible for creating, adding, and disposing of the
    private void patchSearchIcons(IActionSetDescriptor actionSet) {
import org.eclipse.ui.internal.registry.ActionSetRegistry;
    private void updateTimezoneItem(StatusLineContributionItemEx tzItem) {
                            Class<?> actionClass = actionBundle.loadClass(actionClassName);
            statusLine.add(localeItem);
                // Local FS operations are not needed
                    String actionClassName = action.getAttribute("class");
    protected void makeActions(final IWorkbenchWindow window)
            statusLine.add(tzItem);
            helpMenu.add(new Separator());
import org.jkiss.dbeaver.ui.controls.StatusLineContributionItemEx;
        if (DBWorkbench.getPlatform().getApplication().isWorkspaceSwitchingAllowed()) {
import org.jkiss.utils.StandardConstants;
                bindImage(cis, IWorkbenchCommandConstants.FILE_SAVE, UIIcon.SAVE);
                if (preferenceDialog != null) {

    protected IWorkbenchAction newWindowAction;
        //"org.eclipse.ui.actionSet.openFiles", //$NON-NLS-1$
            register(openWorkspaceAction);
        MenuManager navigateMenu = new MenuManager(CoreMessages.actions_menu_navigate, IWorkbenchActionConstants.M_NAVIGATE);
    }
                            CoreApplicationMessages.locale_change_info_message,
                    if (pav[i].equals("icon")) {
 */
/*
            navigateMenu.add(new Separator(IWorkbenchActionConstants.SHOW_EXT));
        //"org.eclipse.ui.NavigateActionSet", //$NON-NLS-1$
import org.eclipse.ui.commands.ICommandService;
import org.jkiss.dbeaver.core.ui.services.ApplicationPolicyService;
    private void patchActionSetIcon(IConfigurationElement searchActionItem, String iconPath) {
            ICommandImageService service = workbenchWindow.getService(ICommandImageService.class);
                    preferenceDialog.open();
        }
    }
                    UIUtils.syncExec(() -> updateTimezoneItem(tzItem));
            }
        menuBar.add(helpMenu);
                }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            DBWorkbench.getPlatform().getApplicationConfiguration().toAbsolutePath()),
        // We have to patch images manually because using commandImages extension point doesn't guarantee order

        final boolean showAltHelp = isShowAltHelp();
        coolBar.add(new ToolBarContributionItem(new ToolBarManager(SWT.FLAT | SWT.LEFT), IActionConstants.TOOLBAR_DATABASE));
                        try {
                PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(
                        CoreApplicationMessages.timezone_change_info_title,
import org.eclipse.core.runtime.IConfigurationElement;

            navigateMenu.add(new GroupMarker(IWorkbenchActionConstants.GROUP_APP));
                        NLS.bind(
            }

import org.eclipse.osgi.util.NLS;
                        NLS.bind(
public class ApplicationActionBarAdvisor extends ActionBarAdvisor
            if ("org.eclipse.search.OpenSearchDialog".equals(saId) || "org.eclipse.search.OpenSearchDialogPage".equals(saId)) {
            openWorkspaceAction = IDEActionFactory.OPEN_WORKSPACE.create(window);
    {
                    null,
            windowMenu.add(new Separator());
        tzItem.setText(tzDefault.getDisplayName(inDaylight, TimeZone.SHORT));
                }
                            Bundle actionBundle = Platform.getBundle(action.getContributor().getName());
import org.jkiss.dbeaver.model.DBIcon;
            }
            windowMenu.add(newWindowAction);
                String[] pav = (String[]) pavField.get(cfgElement);
                        null,
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
        //WorkbenchImages.declareImage(IWorkbenchGraphicConstants.IMG_WIZBAN_IMPORT_WIZ, DBeaverIcons.getImageDescriptor(UIIcon.IMPORT), true);
import org.eclipse.ui.actions.ActionFactory;
        "org.eclipse.ui.WorkingSetActionSet", //$NON-NLS-1$
                MenuManager convertLDMenu = new MenuManager(actionSet.getLabel());
            StatusLineContributionItemEx tzItem = new StatusLineContributionItemEx("Time Zone");
        aboutAction = new AboutBoxAction(window);
                fileMenu.add(openWorkspaceAction);
        //WorkbenchImages.declareImage(IWorkbenchGraphicConstants.IMG_WIZBAN_EXPORT_WIZ, DBeaverIcons.getImageDescriptor(UIIcon.EXPORT), true);
                    if (!CommonUtils.isEmpty(actionClassName)) {
                }

                }

        }
        CheckForUpdateAction.deactivateStandardHandler(window);
//            fileMenu.add(new EmergentExitAction(workbenchWindow));
        // Patch search icons. Directly change icon reference in config registry
 *
                for (IConfigurationElement action : actionSet.getConfigurationElement().getChildren("action")) {
        if (false) {
        return true;

            }
                    }
        MenuManager editMenu = new MenuManager(CoreMessages.actions_menu_edit, IWorkbenchActionConstants.M_EDIT);
            windowMenu.add(new Separator());
        // Disable files actionset to redefine OpenLocalFileAction
        // Add a group marker indicating where action set menus will appear.
        {
        boolean inDaylight = tzDefault.inDaylightTime(new Date());
                    );
            });
        }
            DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(event -> {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            navigateMenu.add(new GroupMarker(IWorkbenchActionConstants.NAV_END));


            recentEditors.add(ContributionItemFactory.REOPEN_EDITORS.create(workbenchWindow));
    }
 * You may obtain a copy of the License at
    protected void fillStatusLine(IStatusLineManager statusLine) {
import org.eclipse.ui.*;

import org.eclipse.ui.actions.ContributionItemFactory;
                patchActionSetIcon(searchActionItem, UIIcon.FIND_TEXT.getLocation());
            // Edit

            // Navigate
        coolBar.add(new ToolBarContributionItem(new ToolBarManager(SWT.FLAT | SWT.RIGHT), IActionConstants.TOOLBAR_EDIT));
import org.jkiss.dbeaver.core.CoreMessages;
            });
        for (IActionSetDescriptor actionSet : actionSets) {
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer)

            // File
//        register(dynamicHelpAction = ActionFactory.DYNAMIC_HELP.create(window));
    public static final String M_ALT_HELP = "dbhelp";
                windowMenu.add(showViewMenuMgr);
                        SWT.ICON_INFORMATION);
    }
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
        //aboutAction = ActionFactory.ABOUT.create(window);
        menuBar.updateAll(true);
    protected IActionDelegate aboutAction;
import java.util.TimeZone;
                MenuManager showViewMenuMgr = new MenuManager(CoreMessages.actions_menu_window_showView, "showView"); //$NON-NLS-1$
    protected void fillMenuBar(IMenuManager menuBar) {
    @Override

            Object cfgElement = BeanUtils.invokeObjectDeclaredMethod(searchActionItem, "getConfigurationElement", new Class[0], new Object[0]);
 * See the License for the specific language governing permissions and
            log.debug("Failed to patch search actions", e);
import java.util.Date;
            });
                        pav[i + 1] = iconPath;
                    UIUtils.showMessageBox(
    }
        "org.eclipse.ui.edit.text.actionSet.annotationNavigation", //$NON-NLS-1$
import org.jkiss.dbeaver.ui.navigator.actions.ToggleViewAction;
        // FIXME: This is a very dirty hack but I didn't find any better way to patch search action icons

                bindImage(cis, IWorkbenchCommandConstants.FILE_IMPORT, UIIcon.IMPORT);
            // Help
            helpMenu.add(ActionUtils.makeAction(aboutAction, null, null, "about-box", CoreMessages.actions_menu_about, null, null));
                    null,

        ImageDescriptor id = DBeaverIcons.getImageDescriptor(icon);
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                patchActionSetIcon(searchActionItem, "platform:/plugin/org.jkiss.dbeaver.ui/icons/misc/search.svg");
import org.jkiss.utils.CommonUtils;
        MenuManager helpMenu = new MenuManager(CoreMessages.actions_menu_help, IWorkbenchActionConstants.M_HELP);
//        register(historyBackAction);
import org.jkiss.dbeaver.ui.navigator.project.ProjectNavigatorView;
        register(ActionFactory.CLOSE.create(window));
            // ignore


            localeItem.setToolTip(Locale.getDefault().getDisplayName());
    }


                IContributionItem showViewMenu = ContributionItemFactory.VIEWS_SHORTLIST.create(PlatformUI.getWorkbench().getActiveWorkbenchWindow());
 *
import org.eclipse.core.runtime.IExtension;
    private void patchImages() {
import org.jkiss.utils.ArrayUtils;
                    asr.removeExtension(ext, new Object[]{actionSet});
        // do not use standard help menu to avoid junk provided by platform (like cheat sheets)
 * DBeaver - Universal Database Manager
    }
        TimeZone tzDefault = TimeZone.getDefault();
            navigateMenu.add(new Separator(IWorkbenchActionConstants.OPEN_EXT));
                    IExtension ext = actionSet.getConfigurationElement().getDeclaringExtension();
            navigateMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }
import org.eclipse.ui.internal.commands.CommandImageManager;
            StatusLineContributionItemEx localeItem =  new StatusLineContributionItemEx("Locale");
        checkUpdatesAction = new CheckForUpdateAction();


        MenuManager windowMenu = new MenuManager(CoreMessages.actions_menu_window, IWorkbenchActionConstants.M_WINDOW);
    @Override
}
    protected CheckForUpdateAction checkUpdatesAction;
                bindImage(cis, ITextEditorActionDefinitionIds.GOTO_NEXT_EDIT_POSITION, UIIcon.RS_FORWARD);
        "org.eclipse.mylyn.tasks.ui.navigation",

            }
            helpMenu.add(new GroupMarker("installation_help"));
    private IWorkbenchAction openWorkspaceAction;


        //"org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo", //$NON-NLS-1$
import org.eclipse.ui.application.ActionBarAdvisor;
                } else {
            helpMenu.add(new Separator());
import org.eclipse.ui.ide.IDEActionFactory;
 * Licensed under the Apache License, Version 2.0 (the "License");


    }
                    null);
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
        }


                        CoreApplicationMessages.locale_change_info_title,
                }
        removeUnWantedActions();
            }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorView;
package org.jkiss.dbeaver.ui.app.standalone;
import org.eclipse.ui.commands.ICommandImageService;
import org.eclipse.jface.preference.PreferenceDialog;
//        historyBackAction = ActionFactory.BACKWARD_HISTORY.create(window);
        register(showHelpAction = ActionFactory.HELP_CONTENTS.create(window));
                CommandImageService cis = (CommandImageService)service;
        MenuManager fileMenu = new MenuManager(CoreMessages.actions_menu_file, IWorkbenchActionConstants.M_FILE);
        {
//        register(historyForwardAction);
import org.jkiss.dbeaver.ModelPreferences;
import org.eclipse.ui.internal.commands.CommandImageService;
import org.eclipse.ui.dialogs.PreferencesUtil;
        for (IConfigurationElement searchActionItem : actionSet.getConfigurationElement().getChildren()) {
import java.lang.reflect.Field;
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
                        null,
 *
                            DBWorkbench.getPlatform().getApplicationConfiguration().toAbsolutePath()),
//            fileMenu.add(new Separator());


        if (workbenchWindow != null) {

            windowMenu.add(new ToggleViewAction(ProjectNavigatorView.VIEW_ID));
        cis.bind(commandId, CommandImageManager.TYPE_DISABLED, null, (ImageDescriptor) null);
            // Disabled because new Eclipse adds this to the File menu by default
 * Copyright (C) 2010-2025 DBeaver Corp and others
        {
    private static final String[] REDUNTANT_ACTIONS_SETS = new String[] {
        register(ActionFactory.SAVE.create(window));
        register(ActionFactory.SAVE_AS.create(window));
            IActionSetDescriptor actionSet = asr.findActionSet("org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo");
/**
import org.osgi.framework.Bundle;
 * actions added to a workbench window. Each window will be populated with
        //"org.eclipse.search.searchActionSet" //$NON-NLS-1$
            windowMenu.add(new Separator());
