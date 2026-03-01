        if (isTemporaryConnection()) {
        item.setToolTipText(page.getDescription());
                }));
        final CTabItem item = new CTabItem(tabFolder, isHandlerPage(page) ? SWT.CLOSE : SWT.NONE, index);
            final IDialogPage page = (IDialogPage) item.getData();
                if (page.getControl() != null && page instanceof IDataSourceConnectionEditor) {
        if (originalConnectionEditor instanceof IDialogPageProvider) {
        for (CTabItem pageTab : tabFolder.getItems()) {
        }
            this.substitutedViewDescriptor = DataSourceViewRegistry.getInstance().findView(
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                    @Override
            if (substitutedViewDescriptor == null) {
    public void testConnection(DBCSession session) {
            if (complete || tabFolder.getSelection() == item) {
                            closeTab(item);
        var item = findHandlerItem(descriptor);
                        panel.layout(true, true);
                return it;
    private void updateHandlerItem(@NotNull List<IDialogPage> allPages) {
                    }
            }
    @Override
        if (extraPages != null) {
        for (CTabItem it : tabFolder.getItems()) {
                }



        }
            return subPages;
                    }
            return subPage.getErrorMessage();
                handlerItem = createHandlerItem(toolBar, allPages);
        }
                    handlersToRemove.stream().map(DBWHandlerDescriptor::getCodeName).collect(Collectors.joining(", "))
        try {
            //UIUtils.resizeShell(getWizard().getContainer().getShell());
            var page = (ConnectionPageNetworkHandler) item.getData();
                if (ArrayUtils.contains(extraPages, page)) {
    }


        for (IDialogPage subPage : subPages) {
        if (this.activated.contains(connectionInfo) && this.connectionEditor != null) {
            configuration.getConfigProfileSource(),
    }
                    getActiveDataSource(),
                // Create and populate top-right toolbar
        Set<DBWHandlerDescriptor> handlersToRemove = new HashSet<>();
        String pageTitle = wizard.isNew() ? viewDescriptor.getLabel() : CoreMessages.dialog_setting_connection_wizard_title;
    }
            profileItem.setToolTipText("No active profile is set");

    }
            String message = NLS.bind(
            activateCurrentItem();
        public void run() {
import org.eclipse.osgi.util.NLS;
        }
import org.eclipse.swt.widgets.Composite;
    private final DataSourceViewDescriptor viewDescriptor;
                        continue;

        return selection != null ? (IDialogPage) selection.getData() : null;

        if (connectionEditor != null) {
                } else {
                .setPrimaryImage(DBIcon.STATUS_QUESTION)
            return extraPages;
            method.setAccessible(true);
                handlersToAdd.add(configuration.getHandlerDescriptor());
    }
            handlerItem.setText(computeChevronTitle(allPages));
import org.jkiss.dbeaver.ui.dialogs.driver.DriverEditDialog;
import org.jkiss.dbeaver.model.rcp.RCPProject;
        if (page == null) {
        final CTabItem selection = tabFolder.getSelection();
    private IDataSourceConnectionEditor getOriginalConnectionEditor() {
            setErrorMessage("Can't create settings dialog: " + ex.getMessage());
    }
                    } finally {

            menu.setVisible(true);
            handlerItem.setEnabled(true);
            item.setControl(page.getControl().getParent());


        super.deactivatePage();
                        // Ignore extra pages
                UIStyles.fixToolBarForeground(toolBar);
            }
            }
                (this.connectionEditor.isExternalConfigurationProvided() || this.connectionEditor.isComplete());
    }
            extraPages = new IDialogPage[]{page};
                    PrefPageProjectNetworkProfiles.open(getShell(), getProject(), profile);
                break;
        }
    public IDialogPage[] getDialogPages(boolean extrasOnly, boolean forceCreate) {
            for (IDialogPage page : subPages) {
    @Override
 * you may not use this file except in compliance with the License.
    }
            return false;
        super(PAGE_NAME + "." + viewDescriptor.getId());

        } else {
class ConnectionPageSettings extends ActiveWizardPage<ConnectionWizard> implements IDataSourceConnectionEditorSite, IDialogPageProvider, ICompositeDialogPageContainer, IDataSourceConnectionTester {
                    //@Override
            int index
                    subPages = ArrayUtils.add(IDialogPage.class, subPages, new ConnectionPageNetworkHandler(this, descriptor));

            menu.setLocation(location.x, location.y);
        }
        var toolItem = new ToolItem(toolBar, SWT.DROP_DOWN);
                }
import org.jkiss.dbeaver.ui.dialogs.Reply;
            {
        }
    @Nullable
            }
                }
                for (IDialogPage page : allPages) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (DBWHandlerDescriptor descriptor : handlersToAdd) {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                IDialogPageProvider externalPagesProvider = GeneralUtils.adapt(
        updateProfileItem();
        }
        for (DBWHandlerDescriptor descriptor : handlersToRemove) {
        }
        }
        }
        @NotNull

        if (connectionEditor == null) {
            if (canAddHandler(page)) {
        }
            });
        // getWizard().getContainer().updateButtons();
                tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
        } else {
            super(descriptor.getCodeName(), AS_PUSH_BUTTON);
        }

    }
import org.eclipse.jface.dialogs.IDialogPage;
import org.jkiss.dbeaver.Log;
        toolItem.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
                for (IDialogPage page : subPages) {
        if (connectionEditor != null) {
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
                    public void close(CTabFolderEvent event) {
        }
            log.warn(ex);
        try {
        }
            joiner.add(items.get(i));
            }
                            if (page != null) {
            originalConnectionEditor.setSite(this);
    }
     * Constructor for ConnectionPageSettings
            extraPages = null;
            for (IDialogPage page : subPages) {
    private class ChooseNetworkProfileAction extends Action {

                        }
            createProviderPage(parent);
                    if (page instanceof IWizardPage p) {
import org.eclipse.swt.events.*;
        if (connectionEditor instanceof IDataSourceConnectionTester) {
                List<IDialogPage> allPages = new ArrayList<>();

    }
        if (hasHandlersToAdd(allPages)) {
            return "Temporary data source (changes won't be saved)";

                tabFolder.addKeyListener(KeyListener.keyPressedAdapter(event -> {
 *
                if (externalPagesProvider != null) {
        if (item.getShowClose() && tabFolder.getSelection() == item && confirmTabClose(item)) {
            return null;
        public ChooseNetworkProfileAction(
    }
                        var selection = folder.getSelection();
                    IDialogPage[] dialogPages = externalPagesProvider.getDialogPages(false, true);
            getControl().dispose();
    }
            for (IDialogPage ep : extraPages) {
            handlerItem.setText("");

        super.dispose();
            createProviderPage(getControl().getParent());
     */
import java.util.stream.Collectors;
    }
            }
            .map(ConnectionPageNetworkHandler.class::cast)
            }
import org.eclipse.swt.graphics.Point;
    private boolean canAddHandler(@NotNull IDialogPage page) {
            } else if (connectionEditor != null) {
            activateCurrentItem();
        DataSourceDescriptor connectionInfo = getActiveDataSource();
        if (getActiveProfile() == null) {
        activateItem(item);
    void saveSettings(DataSourceDescriptor dataSource) {

            }


        Set<DBWHandlerDescriptor> handlersToRemove = new HashSet<>();
                return false;
                    public void itemsCount(CTabFolderEvent event) {
        activateItem(item);
        selectProfile0(null);
                if (!ArrayUtils.isEmpty(allSubPages)) {
                    }
            ((IDataSourceConnectionTester) connectionEditor).testConnection(session);
                tabFolder = new CTabFolder(parent, SWT.TOP);
                }
                        var folder = (CTabFolder) event.widget;

        }

            if (profile != null) {

        refreshHandlers(profile);
            DBPConnectionConfiguration config = container.getConnectionConfiguration();
    private DBWNetworkProfile getActiveProfile() {
        return toolItem;
        DBPDataSourceContainer dataSource = getActiveDataSource();
        }
        } else {
                    public void widgetSelected(SelectionEvent e) {
import org.jkiss.utils.ArrayUtils;
                        if (selection != null) {
        }
                descriptor.getCodeName()
        if (subPages != null) {
            addHandler(descriptor, profile);
        toolItem.addDisposeListener(e -> handlerManager.dispose());
    }
        @NotNull ConnectionWizard wizard,
            } else {
                updateProfileItem();
    private boolean unselectProfile(@Nullable DBWHandlerDescriptor handlerToKeep) {
        Set<DBWHandlerDescriptor> handlersToAdd = new HashSet<>();
    public boolean canFlipToNextPage() {
            } else {
                getShell(),
            manager.add(new Separator());
        } else {

                    // Create page

}
                subPages = ArrayUtils.concatArrays(subPages, extraPages);
            }

import org.jkiss.dbeaver.model.connection.DBPDriverSubstitutionDescriptor;
                && Objects.equals(profile.getProfileSource(), config.getConfigProfileSource());
        if (item.getData() instanceof ConnectionPageNetworkHandler page) {
        .comparing(ConnectionPageSettings::isHandlerPage);
//        if (isTemporaryConnection()) {
import org.jkiss.dbeaver.model.*;

 *     http://www.apache.org/licenses/LICENSE-2.0
                complete = p.isPageComplete();
    private ConnectionPageNetworkHandler findHandlerPage(@NotNull DBWHandlerDescriptor descriptor) {
            }
                        Control pageControl = page.getControl();
                    handlersToRemove.add(descriptor);
    public DataSourceDescriptor getActiveDataSource() {
        var profileManager = new MenuManager();
    }
                    }
        }
        final IDialogPage subPage = getCurrentSubPage();
    private boolean confirmTabClose(@NotNull CTabItem item) {
            .map(x -> x.getHandlerDescriptor().getCodeName())
            if (origin != null) {
        }
                if (this.connectionEditor != null) {
        });
            Reply reply = MessageBoxBuilder.builder()


        }
import org.jkiss.dbeaver.DBeaverPreferences;
        if (tabFolder != null) {

                return page;


                profileItem = createProfileItem(toolBar);
    public DBPDriver getDriver() {
        activateItem(item);
        return false;
            try {
                        }
            // TODO: We should respect pages that might not want to be scrollable (e.g. if they have their own scrollable controls)
        if (items.size() > MAX_CHEVRON_ITEMS_TO_PREVIEW) {

            setDescription(NLS.bind(CoreMessages.dialog_connection_message, getDriver().getFullName()));

        if (getControl() != null) {
            return connectionEditor.getErrorMessage();



        page.loadConfiguration(null);
        return page instanceof ConnectionPageNetworkHandler;
        if (originalConnectionEditor == null) {
        for (DBWHandlerConfiguration configuration : profile.getConfigurations()) {
                connectionEditor = substitutedViewDescriptor.createView(IDataSourceConnectionEditor.class);
        }

            return;
    //                    }
        }
        var page = findHandlerPage(descriptor);
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.substitutedViewDescriptor = null;
    }
            return;
        final IDataSourceConnectionEditor originalConnectionEditor = getOriginalConnectionEditor();
    @Override

            .toList();
                DataSourceProviderRegistry.getInstance().getDataSourceProvider(driverSubstitution.getProviderId()),

                    }
    private ToolItem profileItem;
        var page = (ConnectionPageNetworkHandler) item.getData();
        this.wizard = wizard;

                    if (profile != null) {

    private class AddHandlerAction extends Action {
        }
                    // Ignore extra pages
    protected void updatePageCompletion() {

                activateItem(pageTab);

            if (page instanceof IPropertyChangeListener && page.getControl() != null) {
            subPages = ((IDialogPageProvider) originalConnectionEditor).getDialogPages(extrasOnly, true);
    private static final int MAX_CHEVRON_ITEMS_TO_PREVIEW = 2;
        refreshHandlers(null);
                connectionEditor = getOriginalConnectionEditor();

    private void updateProfileItem() {
        }
        handlerManager.addMenuListener(manager -> {
                }
        }
            profileItem.setText("No profile");

    }
            // init sub pages (if any)
    public DBRRunnableContext getRunnableContext() {
    private ToolItem createHandlerItem(@NotNull ToolBar toolBar, @NotNull List<IDialogPage> pages) {
                }
                return true;
        toolItem.setImage(DBeaverIcons.getImage(UIIcon.ADD));
            ((IWizardPage) page).setWizard(getWizard());
    @Override
                continue;
        }
                var toolBarComposite = new Composite(tabFolder, SWT.NONE);
    }
    private ToolItem handlerItem;

        public AddHandlerAction(@NotNull DBWHandlerDescriptor descriptor) {
        if (extraPages == null) {
                return true;
            if (configuration.isEnabled()) {
                    Collections.addAll(allPages, allSubPages);
                        for (IDialogPage page : dialogPages) {
            if (!activated.contains(connectionInfo)) {
    }

        return false;
        return wizard.getRunnableContext();
                    }
                    }
        toolItem.setImage(DBeaverIcons.getImage(DBIcon.TYPE_DOCUMENT));
            } else if (reply == REPLY_REMOVE) {
            if (item.getData() instanceof IWizardPage p) {
        var toolItem = new ToolItem(toolBar, SWT.DROP_DOWN);
            }
                    panel.setRedraw(false);
        }
import org.eclipse.jface.layout.GridLayoutFactory;
    }
            setText(ActionUtils.getLabelWithIndexMnemonic(getProfileName(profile, origin), index));
            profileItem.setText(NLS.bind("Profile ''{0}''", profileName));
                        var folder = (CTabFolder) event.widget;
            if (subPage instanceof ConnectionPageNetworkHandler page && page.getHandlerDescriptor() == descriptor) {
                        activateCurrentItem();
/**

            }
                for (NetworkHandlerDescriptor descriptor : NetworkHandlerRegistry.getInstance().getDescriptors(getActiveDataSource())) {
        }

    @Nullable
        @Override
                }
    public boolean isPageComplete() {
    }
                "Changing the profile to ''{0}'' will remove {1}.\n\nDo you want to continue?",
import org.eclipse.jface.dialogs.IDialogConstants;
        selectProfile0(profile);

        control.setRedraw(false);
        if (this.connectionEditor != null) {
        return super.getErrorMessage();
        } else {
            this.connectionEditor.saveSettings(connectionInfo);

            }
        for (IDialogPage page : pages) {
                page.setVisible(true);
                    }
            if (!ArrayUtils.isEmpty(subPages)) {
                }
                tabFolder.getSelection().getControl().setFocus();
            joiner.add("...");
            Dialog.applyDialogFont(tabFolder);

    @Override
                            closeTab(selection);
import java.util.*;
        return wizard.isNew();
    @Override

                removeHandler(descriptor);
            originalConnectionEditor = viewDescriptor.createView(IDataSourceConnectionEditor.class);
                // do nothing
                    }
    private final ConnectionWizard wizard;
        updateProfileItem();
        if (!forceCreate) {
        item.setText(CommonUtils.isEmpty(page.getTitle()) ? CoreMessages.dialog_setting_connection_general : page.getTitle());
    }
                // Add network tabs (for non-embedded drivers)
        for (CTabItem item : tabFolder.getItems()) {
        if (!handlersToRemove.isEmpty()) {
                }
        }
            this.profile = profile;
        return false;

import org.jkiss.dbeaver.ui.preferences.PrefPageProjectNetworkProfiles;
            }
                tabFolder.addSelectionListener(new SelectionAdapter() {
            if (dataSource.getOrigin() instanceof DBPDataSourceOriginExternal origin) {
        handlersToRemove.remove(handlerToKeep);
        }
    @Override
        }
            } catch (Exception e) {
                    manager.add(new ChooseNetworkProfileAction(dataSource, profile, origin, index++));
        StringJoiner joiner = new StringJoiner(", ");
import org.eclipse.swt.layout.GridData;
            return subPages;
    public static final String PAGE_NAME = ConnectionPageSettings.class.getSimpleName();
                        panel.setRedraw(true);
                        UIUtils.configureScrolledComposite(panel, page.getControl());
                        updateHandlerItem(allPages);
                }
import org.eclipse.jface.util.IPropertyChangeListener;

                if (page.getControl() == null) {
        if (findHandlerItem(descriptor) != null) {

    private final Set<DataSourceDescriptor> activated = new HashSet<>();
                // Set focus to the first tab
        return wizard.getPageSettings() != this ||
        for (CTabItem item : tabFolder.getItems()) {
    }

                }
                        if (!closeTab(item)) {
    private void refreshHandlers(@Nullable DBWNetworkProfile profile) {
                unselectProfile(null);
        var item = createPageTab(page, index);
    @Override
    @Override
        }));
import java.lang.reflect.Method;
        page.loadConfiguration(profile);
                ep.dispose();
        }
    private IDataSourceConnectionEditor getConnectionEditor() {
import org.eclipse.jface.action.MenuManager;

                } else if (page instanceof ConnectionWizardPage) {
    public void deactivatePage() {
                    ((ActiveWizardPage<?>) subPage).activatePage();
                updateProfileItem();
        return dataSource.getRegistry().getNetworkProfile(
    @Nullable
                setControl(tabFolder);
        } finally {
    @Override
    private final DBPDriverSubstitutionDescriptor driverSubstitution;
        return false;
    ConnectionPageSettings(
                        if (item != null) {
        }
                public void run() {
            ) {

import org.eclipse.swt.widgets.ToolBar;
        tabFolder.setSelection(item);
                connectionEditor.setSite(this);
            this.profile = null;
            } else {
    //                        page.createControl(getControl().getParent());
                if (handlersToAdd.contains(descriptor)) {
    @Nullable
    }

                refreshHandler(page.getHandlerDescriptor(), profile);
    private final DataSourceViewDescriptor substitutedViewDescriptor;
                    handlersToAdd.remove(descriptor);
        item.setData(page);
    }


            item.setControl(UIUtils.createScrolledComposite(tabFolder, SWT.H_SCROLL | SWT.V_SCROLL));
            var location = toolBar.getDisplay().map(toolBar, null, bounds.x, bounds.height);
                    try {

            manager.add(new ChooseNetworkProfileAction());
            var menu = handlerManager.createContextMenu(tabFolder);
            method.invoke(tabFolder, 8 /* UPDATE_TAB_HEIGHT | REDRAW */);
            connectionEditor = null;
        }
            if (item.getData() instanceof ConnectionPageNetworkHandler page) {
                            event.doit = false;
    @Override

        if (item == null) {
                log.error(e);

    @Override
        }
    private IDataSourceConnectionEditor originalConnectionEditor;
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    public void testConnection() {
                manager.add(new ChooseNetworkProfileAction(dataSource, profile, null, index++));
        profileManager.addMenuListener(manager -> {
            }
        }
        return true;
                }

        }
    private static final Log log = Log.getLog(DriverDescriptor.class);
        return toolItem;
    @NotNull
                    } catch (Throwable e) {
                            ((IDataSourceConnectionEditor) page).loadSettings();
            }
        for (int i = 0; i < Math.min(items.size(), MAX_CHEVRON_ITEMS_TO_PREVIEW); i++) {
        this.viewDescriptor = viewDescriptor;
    }
    }
    private void activateCurrentItem() {
    }

    }
        var handlerManager = new MenuManager();
                    for (IDialogPage page : subPages) {
                .setReplies(REPLY_KEEP, REPLY_REMOVE, Reply.CANCEL)
            manager.add(new Separator());
                item.setToolTipText(Objects.requireNonNullElse(page.getErrorMessage(), "Page is incomplete"));
        for (CTabItem item : tabFolder.getItems()) {
        return null;
    }
    @Override
        if (CommonUtils.isEmpty(configuration.getConfigProfileName())) {
            }
        toolItem.setText("N/A");
    }

    /**
            log.error("Can't find page for handler " + descriptor);

    private boolean hasHandlersToAdd(@NotNull List<IDialogPage> pages) {
                        DBWorkbench.getPlatformUI().showError("Error creating configuration page", null, e);
        ) {
        if (page.getControl() == null) {
                    if (event.button == 2) {
        if (page instanceof IWizardPage) {
    }

        public void run() {
 * limitations under the License.
    public void createControl(Composite parent) {
        } catch (Exception ex) {
        return registry == null ? null : (RCPProject) registry.getProject();
    }
                @Override
            if ((!getDriver().isEmbedded() || CommonUtils.toBoolean(getDriver().getDriverParameter(DBConstants.DRIVER_PARAM_ENABLE_NETWORK_PARAMETERS)))
                tabFolder.addMouseListener(MouseListener.mouseUpAdapter(event -> {
        }
            }

 *
    public RCPProject getProject() {
        return item;
import org.jkiss.dbeaver.model.connection.DBPDriver;
                });
            if (it.getData() instanceof ConnectionPageNetworkHandler page && page.getHandlerDescriptor() == descriptor) {
                        }
    private CTabFolder tabFolder;
                }
                ConfirmationDialog.CONFIRM,
    public IDialogPage getCurrentSubPage() {
            }
                item.setImage(null);
            UIUtils.setHelp(getControl(), IHelpContextIds.CTX_CON_WIZARD_SETTINGS);
        page.getHandlerConfiguration().setEnabled(true);
    @Nullable
        page.refreshConfiguration(profile);
import org.eclipse.jface.action.Separator;
        return dialog.open() == IDialogConstants.OK_ID;
        }
                            }

                complete = p.isComplete();
    }
import org.jkiss.dbeaver.model.net.DBWUtils;
    public void firePropertyChange(Object source, String property, Object oldValue, Object newValue) {
        }
    }
            );
            }
 */
            );
    private void activateItem(@NotNull CTabItem item) {
                activated.add(connectionInfo);
    private CTabItem createPageTab(@NotNull IDialogPage page, int index) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
                    }
                updateProfileItem();
            }
        handlerManager.setRemoveAllWhenShown(true);
        this.driverSubstitution = driverSubstitution;
            manager.add(new Separator());
                ))
        }
            configuration.getConfigProfileName()
        DBPConnectionConfiguration configuration = dataSource.getConnectionConfiguration();
                connectionEditor.loadSettings();
        CTabItem selection = tabFolder.getSelection();
    }
    @Override
        }
        public ChooseNetworkProfileAction() {
        toolItem.setText(CoreMessages.dialog_connection_network_add_tunnel_label);
            menu.setVisible(true);
        }
        return wizard.getActiveDataSource();
                .setTitle("Change profile")
            }
            }
import org.jkiss.dbeaver.model.net.DBWHandlerDescriptor;
        updateFolderToolbar();
    @Override

            log.error("Can't find page item for handler " + descriptor);
            }
    @NotNull
    }

            control.setRedraw(true);
            int index = 0;

        if (connectionEditor != null && connectionEditor.getErrorMessage() != null) {
                        selectProfile(profile);
                        if (pageControl != null && page instanceof IDataSourceConnectionEditor) {

    private String computeChevronTitle(@NotNull List<IDialogPage> pages) {
    private boolean selectProfile(@NotNull DBWNetworkProfile profile) {
            extraPages = ArrayUtils.concatArrays(extraPages, new IDialogPage[]{page});
            IDialogPage page = (IDialogPage) item.getData();
        if (item == null) {
        }
                }
            handlerItem.setEnabled(false);
        UIUtils.asyncExec(() -> connectionEditor.activateEditor());
            menu.setLocation(location.x, location.y);
        }
    }
    }
        String profileName = getActiveDataSource().getConnectionConfiguration().getConfigProfileName();
            if (image != null) {
        updatePageCompletion();
                selectProfile(profile);

    private IDialogPage[] subPages, extraPages;
        }
    @NotNull

                .showMessageBox();
            for (DBWNetworkProfile profile : getProject().getDataSourceRegistry().getNetworkProfiles()) {
                return NLS.bind("{0} {1}", profile.getProfileName(), origin.getDisplayName());
        // TODO: Stop activating pages
            if (!UIUtils.confirmAction(getShell(), "Change profile", message)) {

    @NotNull
    private boolean closeTab(@NotNull CTabItem item) {
                    ((ActiveWizardPage<?>) selection.getData()).deactivatePage();
        PropertyChangeEvent pcEvent = new PropertyChangeEvent(source, property, oldValue, newValue);

            removeHandler(descriptor);

import org.eclipse.jface.util.PropertyChangeEvent;
                }));
    private void createProviderPage(Composite parent) {
    }
                    return false;
        return null;
        if (extrasOnly) {
        for (CTabItem item : tabFolder.getItems()) {
    private static final Reply REPLY_KEEP = new Reply("&Keep");
        var index = Math.min(tabFolder.getItemCount(), ArrayUtils.indexOf(subPages, page) + 1 /* main tab */);
                allPages.sort(PAGE_COMPARATOR);
            if (extraPages != null) {
            IDialogPage[] allSubPages = getDialogPages(false, true);
    @Override
    @Override
        NetworkHandlerDescriptor descriptor = ((ConnectionPageNetworkHandler) page).getHandlerDescriptor();

    private void removeHandler(@NotNull DBWHandlerDescriptor descriptor) {
                });


        }
    }

                tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
        toolItem.setToolTipText("Active profile");
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;

            return new IDialogPage[0];

            log.error("Can't update folder toolbar", e);
        page.getHandlerConfiguration().setEnabled(false);
            if (pageTab.getData() == subPage) {
    }
    public void showSubPage(IDialogPage subPage) {
            removeHandler(descriptor);
            }
        // TODO: Stop activating pages
    }
    public boolean openDriverEditor() {
                    manager.add(new AddHandlerAction(handlerPage.getHandlerDescriptor()));

            if (handler.getId().equals(descriptor.getId())) {
        }
    // Sort network handler pages to be last
    private void refreshHandler(@NotNull DBWHandlerDescriptor descriptor, @Nullable DBWNetworkProfile profile) {
        @Nullable DBPDriverSubstitutionDescriptor driverSubstitution
                    DBWNetworkProfile profile = getActiveProfile();
    }
        // TODO: Don't require the page to be focused when closing it
            handlerItem.setImage(null);
            if (page instanceof IPropertyChangeListener && page.getControl() != null) {
            return Objects.equals(profile.getProfileName(), config.getConfigProfileName())
        }
                tabFolder.setUnselectedCloseVisible(false);
        }

            }

import org.jkiss.dbeaver.registry.DataSourceViewRegistry;
            log.error("Can't find page item for handler " + descriptor);
            if (item.getData() instanceof ConnectionPageNetworkHandler page) {
    public boolean isNew() {
            super("None", AS_RADIO_BUTTON);
    @NotNull
                if (subPage instanceof ActiveWizardPage) {

        }
package org.jkiss.dbeaver.ui.dialogs.connection;
                }
        }
        parent.layout();
import org.jkiss.dbeaver.model.exec.DBCSession;
                    ((IDataSourceConnectionEditor) page).saveSettings(dataSource);
import org.jkiss.code.Nullable;
                    createPageTab(page, tabFolder.getItemCount());
                return;
                    @Override
    public void dispose() {
            final NetworkHandlerDescriptor descriptor = page.getHandlerDescriptor();
    private static final Comparator<IDialogPage> PAGE_COMPARATOR = Comparator
            }
                if (subPages != null) {
    private void addHandler(@NotNull DBWHandlerDescriptor descriptor, @Nullable DBWNetworkProfile profile) {
    @Override
                    IDialogPageProvider.class);
        try {
        var page = (ConnectionPageNetworkHandler) item.getData();
            CTabItem selection = tabFolder.getSelection();
                for (DBWNetworkProfile profile : origin.getAvailableNetworkProfiles()) {
    //                    if (pageControl == null) {

    }
        );
    private CTabItem findHandlerItem(@NotNull DBWHandlerDescriptor descriptor) {

        }
    }
            super(null, AS_RADIO_BUTTON);
 * Settings connection page. Hosts particular drivers' connection pages
    @NotNull

        return wizard.getSelectedDriver();
        } else {
            if (unselectProfile(descriptor)) {
                handlersToRemove.add(page.getHandlerDescriptor());
        private static String getProfileName(@NotNull DBWNetworkProfile profile, @Nullable DBPDataSourceOrigin origin) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
                if (page instanceof IWizardPage wizardPage && !wizardPage.isPageComplete()) {
        return wizard.getDataSourceRegistry();
        return originalConnectionEditor;
            var menu = profileManager.createContextMenu(tabFolder);
            }
            return;

import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;
                profile.getProfileName(),

                        CTabItem item = (CTabItem) event.item;
                && !CommonUtils.toBoolean(getDriver().getDriverParameter(DBConstants.DRIVER_PARAM_DISABLE_NETWORK_PARAMETERS))
import org.jkiss.dbeaver.core.CoreMessages;
                        p.setSite(this);

import org.jkiss.dbeaver.ui.*;

                DBeaverPreferences.CONFIRM_DISABLE_NETWORK_HANDLER,
import org.eclipse.swt.graphics.Image;
        setDescription(CoreMessages.dialog_connection_description);
//        }

    @Override
        @Override
                return profile.getProfileName();

        }
    @Override
                        var item = folder.getItem(new Point(event.x, event.y));

            if (!isChecked()) {
        for (CTabItem item : tabFolder.getItems()) {
        }
                    "Do you want to keep {0} after unselecting the active profile?",

    }
    }
        private final DBWHandlerDescriptor descriptor;
                    if (driverSubstitution != null && !driverSubstitution.getInstance().isNetworkHandlerSupported(descriptor)) {
    private boolean isTemporaryConnection() {
                    if (event.keyCode == SWT.DEL && event.stateMask == 0) {
            final boolean complete;
        private static boolean isProfileSelected(@NotNull DBWNetworkProfile profile, @NotNull DBPDataSourceContainer container) {
                .setMessage(NLS.bind(

    @Override

                        Dialog.applyDialogFont(panel);
            var dataSource = getActiveDataSource();
            @NotNull DBPDataSourceContainer container,
    @Override
                        continue;
            // init main page
                    }
                        }

        }

    @Override
 * DBeaver - Universal Database Manager
                    ((ConnectionWizardPage) page).saveSettings(dataSource);
                return image;
            }
            }
    }
            } else if (item.getData() instanceof IDataSourceConnectionEditor p) {
        });
            connectionEditor.saveSettings(dataSource);
            }
                    this.connectionEditor.loadSettings();
            this.connectionEditor != null &&
                var toolBar = new ToolBar(toolBarComposite, SWT.FLAT | SWT.RIGHT);
            }
            var bounds = toolItem.getBounds();

    private ToolItem createProfileItem(@NotNull ToolBar toolBar) {

            }
        List<String> items = pages.stream()
        Control control = getControl();
        DBPDataSourceRegistry registry = wizard.getDataSourceRegistry();
            return;
                // Otherwise focus foes into top right control which breaks traverse keys
            log.error("Handler " + descriptor + " is already enabled");

/*


        if (subPages != null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            pageTitle += " / TEMPORARY";
    private void updateFolderToolbar() {
            return extraPages;
                        }
                    if (dialogPages != null) {
        }


import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        if (subPages != null) {
                handlersToRemove.stream().map(DBWHandlerDescriptor::getCodeName).collect(Collectors.joining(", "))
import org.eclipse.jface.wizard.IWizardPage;
                tabFolder.setSelection(0);
        if (!isHandlerPage(page)) {
        return true;

            return;
            Method method = CTabFolder.class.getDeclaredMethod("updateFolder", int.class);

        }
                IActionConstants.EDIT_CONNECTION_POINT
        return getName();
import org.eclipse.swt.custom.*;
                return false;
        super.updatePageCompletion();
        getWizard().testConnection();
                ConfirmationDialog.INFORMATION,

    public String getErrorMessage() {
            this.descriptor = descriptor;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        return true;
                .setDefaultReply(Reply.CANCEL)
        // Save connection settings AFTER extra pages.
            connectionEditor.dispose();

            if (item.getData() instanceof ConnectionPageNetworkHandler page) {

                toolBarComposite.setLayout(GridLayoutFactory.fillDefaults().extendedMargins(0, 0, 0, 0).create());
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
import org.eclipse.jface.dialogs.Dialog;
            manager.add(new Action("Edit profiles...", DBeaverIcons.getImageDescriptor(UIIcon.RENAME)) {
            getConnectionEditor();
            }


        if (wizard.isNew()) {
                                subPages = ArrayUtils.add(IDialogPage.class, subPages, page);
        //       has something to do with page not being initialized
            if (reply == REPLY_KEEP) {
        for (DBWHandlerConfiguration handler : DBWUtils.getActualNetworkHandlers(getActiveDataSource())) {

        return joiner.toString();

                refreshHandler(descriptor, null);
    @NotNull
    @NotNull
                    // Add sub pages
 *

//            return false;
            var bounds = toolItem.getBounds();
                }
        DriverEditDialog dialog = new DriverEditDialog(wizard.getShell(), (DriverDescriptor) this.getDriver());
            } else {
import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;
            var location = toolBar.getDisplay().map(toolBar, null, bounds.x, bounds.height);
    private IDataSourceConnectionEditor connectionEditor;
        private final DBWNetworkProfile profile;
                    ScrolledComposite panel = (ScrolledComposite) selection.getControl();
            Image image = this.connectionEditor.getImage();
                return !handler.isEnabled();

                    if (ArrayUtils.contains(extraPages, page) || canAddHandler(page)) {
    private static final Reply REPLY_REMOVE = new Reply("&Remove");
        toolItem.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
    public String toString() {
    public Image getImage() {
                ((IPropertyChangeListener) page).propertyChange(pcEvent);
                return false;

        if (this.connectionEditor != null && this.connectionEditor.getControl() != null) {
        } catch (ReflectiveOperationException e) {
            } else {
            }
            if (selection != null) {
                updatePageCompletion();
        @NotNull DataSourceViewDescriptor viewDescriptor,
                allPages.add(connectionEditor);
    public void activatePage() {
        profileManager.setRemoveAllWhenShown(true);
import org.eclipse.swt.widgets.Control;
    @Override
        } else {
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
        }
        //       and therefore not saving its _updated_ state
    }
            if (unselectProfile(descriptor)) {
        }
        }));


        getActiveDataSource().getConnectionConfiguration().setConfigProfile(profile);
    @Override
                handlersToRemove.clear();
            @Nullable DBPDataSourceOrigin origin,
            final int decision = ConfirmationDialog.confirmAction(
            setChecked(isProfileSelected(profile, container));

            );
    }
            setControl(new Composite(parent, SWT.BORDER));

    public boolean openSettingsPage(String pageId) {
 */
                ((IPropertyChangeListener) page).propertyChange(pcEvent);
        if (!handlersToRemove.isEmpty()) {
                if (selection != null && selection.getData() != subPage && selection.getData() instanceof ActiveWizardPage) {
                updateHandlerItem(allPages);
            @NotNull DBWNetworkProfile profile,

                // Create tab folder
                // Externally provided sub-pages
                    return false;
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.code.NotNull;

        item.dispose();
                NetworkHandlerDescriptor descriptor = page.getHandlerDescriptor();
    private void selectProfile0(@Nullable DBWNetworkProfile profile) {
            if (CommonUtils.isEmptyTrimmed(config.getConfigProfileName())) {
            return true;
        // Because it may contain some driver properties save which will be overwritten by driver props page otherwise
    }

                item.setImage(DBeaverIcons.getImage(DBIcon.SMALL_ERROR));
                    if (page instanceof IDataSourceConnectionEditor p) {
        if (driverSubstitution != null) {
    public void updateButtons() {
    private static boolean isHandlerPage(@NotNull IDialogPage page) {
        //getContainer().updateTitleBar();
                }
        if (subPage != null && subPage.getErrorMessage() != null) {
                    }
        toolItem.addDisposeListener(e -> profileManager.dispose());
 * You may obtain a copy of the License at
    @Nullable

        return originalDataSource != null && originalDataSource.isTemporary();
 * Unless required by applicable law or agreed to in writing, software
        activateCurrentItem();
            return decision == IDialogConstants.OK_ID;
        setTitle(pageTitle);
        return wizard.openSettingsPage(pageId);

                        page.createControl(panel);
    }

                addHandler(descriptor, null);

        }
            } else {
        }
import org.eclipse.swt.widgets.ToolItem;
                        panel.setMinSize(panel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
                }
            profileItem.setToolTipText(NLS.bind("Active profile is ''{0}''", profileName));
        if (connectionEditor == null) {
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
                    continue;
    }
        }
            handlerItem.setImage(DBeaverIcons.getImage(UIIcon.ADD));
    }
        var item = findHandlerItem(descriptor);
                        p.setWizard(getWizard());
            .filter(this::canAddHandler)
import org.jkiss.dbeaver.registry.DataSourceViewDescriptor;
                if (page instanceof IDataSourceConnectionEditor editor && !editor.isComplete()) {
        }
        if (isTemporaryConnection()) {
    public void addSubPage(IDialogPage page) {
        DataSourceDescriptor originalDataSource = wizard.getOriginalDataSource();
            var descriptor = page.getHandlerDescriptor();
import org.eclipse.jface.action.Action;
                if (canAddHandler(page) && page instanceof ConnectionPageNetworkHandler handlerPage) {
        }
            }
    public DBPDataSourceRegistry getDataSourceRegistry() {
                item.setToolTipText(page.getDescription());
            for (IDialogPage page : pages) {
    ) {

    @NotNull
    }
                tabFolder.setTopRight(toolBarComposite, SWT.RIGHT);
        if (CommonUtils.isNotEmpty(profileName)) {


                IDialogPage page = (IDialogPage) selection.getData();
import org.eclipse.swt.SWT;
 * See the License for the specific language governing permissions and
        return super.getImage();
    }
        for (DBWHandlerDescriptor descriptor : handlersToRemove) {
        return connectionEditor;


            DataSourceDescriptor connectionInfo = getActiveDataSource();
                    }

        for (IWizardPage page : getWizard().getPages()) {

import org.jkiss.utils.CommonUtils;
