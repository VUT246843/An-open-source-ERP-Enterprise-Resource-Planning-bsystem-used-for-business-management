                        profile.resolveSecrets(secretController);
    }
            handlersFolder.setSelection(0);
            new SelectionAdapter() {

        profilesTable.select(profilesTable.getItemCount() - 1);
        List<DBWNetworkProfile> allProfiles = new ArrayList<>();
        }
        for (DBWNetworkProfile p : getDefaultNetworkProfiles()) {
    @NotNull

                    DBWHandlerConfiguration configuration = profile.getConfiguration(nhd);
        }
            }
    private final Map<NetworkHandlerDescriptor, HandlerBlock> configurations = new HashMap<>();
 *
        final Button useHandlerCheck = UIUtils.createCheckbox(composite, NLS.bind(UIConnectionMessages.dialog_tunnel_checkbox_use_handler, descriptor.getLabel()), false);
        deleteProfileItem.setEnabled(selectedProfile != null);
                profile = p;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
            List<DBWNetworkProfile> profiles = getDefaultNetworkProfiles();

                public void widgetSelected(SelectionEvent e) {
            String implName = descriptor.getHandlerType().getImplName();
                return;
                handlerConfiguration.setProperties(Collections.emptyMap());
     */
import org.jkiss.dbeaver.Log;

            DBWNetworkProfile profile = (DBWNetworkProfile) item.getData();
        if (descriptor != null && selectedProfile != null) {
            DBSSecretController secretController;
import org.jkiss.utils.CommonUtils;
        divider.setWeights(300, 700);
            });
            }
        }
        return true;
    }
                    }
            selection = handlersFolder.getItem(0);
        }
/**

        }
        });
        ToolBar toolbar = new ToolBar(profilesGroup, SWT.HORIZONTAL | SWT.RIGHT);
            for (DBWNetworkProfile profile : profiles) {
    {
    private static final Log log = Log.getLog(PrefPageNetworkProfiles.class);
        performDefaults();
                        handlerBlock.loadedConfigs.put(profile, configuration);
            try {

                    }
                TableItem[] selection = profilesTable.getSelection();

import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            allProfiles.add(profile);
                }
                        profilesTable.select(CommonUtils.clamp(index, 0, profilesTable.getItemCount() - 1));
                    HandlerBlock handlerBlock = configurations.get(nhd);
            public void widgetSelected(SelectionEvent e)
            return;
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
    protected abstract DBWNetworkProfile createNewProfile(@Nullable DBWNetworkProfile sourceProfile);
    private void createProfilesTable(Composite profilesGroup) {
                        createAndShowProfile(null);
                handlerConfiguration.setEnabled(useHandlerCheck.getSelection());
        gd.minimumWidth = 150;

                }
    }
import org.eclipse.swt.custom.CTabFolder;
                if (!nhd.hasObjectTypes() && isHandlerApplicable(nhd)) {
import org.jkiss.dbeaver.DBException;
 */
                if (selectedProfile == null) {
        composite.setLayout(new GridLayout(1, false));
    protected abstract boolean deleteProfile(DBWNetworkProfile profile);
    }
                HandlerBlock handlerBlock = configurations.get(descriptor);
                        profilesTable.notifyListeners(SWT.Selection, new Event());
        handlerComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        tabItem.setData(descriptor);
        configurations.put(descriptor, new HandlerBlock(configurator, handlerComposite, useHandlerCheck));
        tabItem.setControl(composite);
            }
        allHandlers.add(descriptor);
                    @Override
                handlerBlock.configurator.loadSettings(handlerConfiguration);
        Composite handlerComposite = UIUtils.createPlaceholder(composite, 1);
    }
import org.eclipse.swt.SWT;


import java.util.List;
            UIConnectionMessages.pref_page_network_profiles_tool_delete_text, UIIcon.ROW_DELETE,
            });

        gd = new GridData(GridData.FILL_BOTH);

        return true;

import org.jkiss.dbeaver.registry.network.NetworkHandlerDescriptor;

                if (ArrayUtils.isEmpty(selection)) {
                    public void widgetSelected(SelectionEvent e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        String profileId = CommonUtils.toString(data);
                    handler.loadedConfigs.put(newProfile, new DBWHandlerConfiguration(configuration));
        configurator.createControl(handlerComposite, descriptor, this::updateApplyButton);
    protected void preCreateHandlerControls(Composite composite) {
            if (handlerBlock.blockEnableState != null) {
            });
        tabItem.setToolTipText(descriptor.getDescription());
            profilesGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                    updateControlsState();
                }
import org.jkiss.dbeaver.ui.UIUtils;
        return selection == null ? null : (NetworkHandlerDescriptor) selection.getData();
                handlerBlock.blockEnableState.restore();
                item.setData(profile);
                        log.error("Error resolving secret configuration for profile " + profile.getProfileId());
            }
    }
     * Saves state of UI controls to handler configuration

        }
 * Unless required by applicable law or agreed to in writing, software
        noDefaultAndApplyButton();
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
        item.setImage(DBeaverIcons.getImage(DBIcon.TYPE_DOCUMENT));
                if (items[i].getData() == profile) {

            UIConnectionMessages.pref_page_network_profiles_tool_copy_title,
                    if (deleteProfile(selectedProfile)) {
                DBWorkbench.getPlatformUI().showError("No secret controller", null, e);
                        profilesTable.remove(index);
                if (handlerConfiguration == null) {
                    UIUtils.showMessageBox(getShell(), UIConnectionMessages.pref_page_network_profiles_tool_no_profile_error_title,
        profilesTable.notifyListeners(SWT.Selection, new Event());
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public boolean performOk() {

                    selectedProfile = (DBWNetworkProfile) selection[0].getData();
            for (int i = 0; i < items.length; i++) {
        }
import org.eclipse.osgi.util.NLS;
                    useHandlerCheck.setSelection(false);
/*
                newProfile.getConfigurations().add(new DBWHandlerConfiguration(configuration));
                }
    private NetworkHandlerDescriptor getSelectedHandler() {


                    }
    public void saveSettings(DBWNetworkProfile profile) {
            }
            handlersFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
        for (TableItem item : profilesTable.getItems()) {
            {

        }
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
        if (newProfile == null) {
                handlerBlock.blockEnableState = null;
                break;
        tabItem.setText(descriptor.getLabel());
        }
            UIConnectionMessages.pref_page_network_profiles_tool_copy_text,

    }
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;

                    createHandlerTab(nhd);
            } else {
            NetworkHandlerDescriptor handler = (NetworkHandlerDescriptor) handlerTab.getData();
            if (handlerConfiguration == null) {



                selectedProfile = profiles.getFirst();
                }


 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.ui.UIIcon;
        }
            } catch (DBException e) {
            } else if (profileIndex != profilesTable.getSelectionIndex()) {

    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.jface.dialogs.ControlEnableState;

                }

        return divider;
        private final Composite blockControl;
            configurator = configDescriptor.createConfigurator();
        }
            handlerBlock.blockEnableState = ControlEnableState.disable(handlerBlock.blockControl);
        copyProfileItem.setEnabled(selectedProfile != null);
        {
                @Override
        IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> configurator;
            this.configurator = configurator;
    public void loadSettings() {
                    if (configuration != null) {
    protected abstract void updateNetworkProfiles(List<DBWNetworkProfile> allProfiles);
    private ToolItem deleteProfileItem;
        copyProfileItem = UIUtils.createToolItem(
        }
                updateControlsState();
    protected abstract DBSSecretController getSecretController() throws DBException;
    private Table profilesTable;



                profile.updateConfiguration(configuration);
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
            }
                final DBWHandlerConfiguration configuration = handler.loadedConfigs.get(sourceProfile);
    private DBWNetworkProfile selectedProfile;
                if (configuration != null) {
        }

            }

            return;
package org.jkiss.dbeaver.ui.preferences;
        private final Map<DBWNetworkProfile, DBWHandlerConfiguration> loadedConfigs = new HashMap<>();
 *
            if (handlerBlock.useHandlerCheck.getSelection()) {
                    selectedProfile = null;
            final TableItem[] items = profilesTable.getItems();
            profilesTable.notifyListeners(SWT.Selection, new Event());
 * See the License for the specific language governing permissions and
        updateNetworkProfiles(allProfiles);

import org.jkiss.code.NotNull;
        if (sourceProfile != null) {
            if (configDescriptor == null) {
        enableHandlerContent(descriptor);
            UIPropertyConfiguratorDescriptor configDescriptor = UIPropertyConfiguratorRegistry.getInstance().getDescriptor(implName);



            newProfile.setProperties(new LinkedHashMap<>(sourceProfile.getProperties()));
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            UIIcon.ROW_COPY,
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;


            if (p.getProfileId().equals(profileId)) {
        profilesTable.setLayoutData(gd);
                TableItem item = new TableItem(profilesTable, SWT.NONE);
                UIConnectionMessages.pref_page_network_profiles_tool_create_text, UIIcon.ROW_ADD,
        if (isInitOnCreate()) {
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.events.SelectionEvent;
                    createAndShowProfile(selectedProfile);

        DBWHandlerConfiguration handlerConfiguration = handlerBlock.loadedConfigs.get(selectedProfile);
    protected boolean isInitOnCreate() {
            }
    }
            new SelectionAdapter() {

                }
    public void applyData(Object data) {
                }
                if (secretController != null) {
import org.jkiss.dbeaver.registry.network.NetworkHandlerRegistry;
    @Override
import org.eclipse.swt.layout.GridLayout;
        for (HandlerBlock handlerBlock : configurations.values()) {
                public void widgetSelected(SelectionEvent e) {
import org.eclipse.swt.custom.CTabItem;
    }
    }

            HandlerBlock handlerBlock = configurations.get(descriptor);
            }
            handlersFolder = new CTabFolder(handlersComp, SWT.TOP | SWT.FLAT);
    protected void updateSelectedProfile(DBWNetworkProfile profile) {
            this.useHandlerCheck = useHandlerCheck;
                item.setText(profile.getProfileName());
        } catch (DBException e) {
            }
                item.setImage(DBeaverIcons.getImage(DBIcon.TYPE_DOCUMENT));
        CTabItem selection = handlersFolder.getSelection();
        private final IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> configurator;
                    handlerConfiguration = new DBWHandlerConfiguration(handler, null);
    private void createProfilesToolBar(Composite profilesGroup) {
 * limitations under the License.
            performDefaults();
        {
                }
        enableHandlerContent(descriptor);
                } else {


    protected void performDefaults() {
    }
                    } catch (DBException e) {
            HandlerBlock handlerBlock = configurations.get(handler);
            Composite handlersComp = UIUtils.createComposite(divider, 1);
        return selectedProfile;
    protected Control createPreferenceContent(@NotNull Composite parent) {
            DBWHandlerConfiguration configuration = handlerBlock.loadedConfigs.get(profile);
import java.util.*;
            }
                    handlerConfiguration = new DBWHandlerConfiguration(descriptor, null);
    @Override
        Composite composite = new Composite(handlersFolder, SWT.NONE);
            saveSettings(profile);
                    return;


    }
import org.eclipse.swt.events.SelectionAdapter;
    @Nullable
import org.jkiss.dbeaver.model.DBIcon;

                profilesTable.select(0);
            log.error("Can't create network configurator '" + descriptor.getId() + "'", e);
        if (selection == null) {
            Composite profilesGroup = UIUtils.createComposite(divider, 1);

    {
        }
        profilesTable.removeAll();
            @Override
        saveHandlerSettings();
            createProfilesTable(profilesGroup);
        CTabItem tabItem = new CTabItem(handlersFolder, SWT.NONE);
    }
        TableItem item = new TableItem(profilesTable, SWT.NONE);
            for (HandlerBlock handler : configurations.values()) {
            return;
    public PrefPageNetworkProfiles() {

            createProfilesToolBar(profilesGroup);
                profilesTable.select(profileIndex);
                saveHandlerSettings();
 * PrefPageNetworkProfiles
    }
                }
import org.eclipse.swt.layout.GridData;
        }
    }

        for (CTabItem handlerTab : handlersFolder.getItems()) {
        try {
                    handlerBlock.loadedConfigs.put(selectedProfile, handlerConfiguration);
        super.performDefaults();
                if (handlerConfiguration == null) {
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

                @Override
                updateSelectedProfile(selectedProfile);
            }
                });
                }
            for (DBWHandlerConfiguration configuration : sourceProfile.getConfigurations()) {
                for (NetworkHandlerDescriptor nhd : allHandlers) {
            DBWHandlerConfiguration handlerConfiguration = handlerBlock.loadedConfigs.get(selectedProfile);
            postCreateHandlerControls(handlersComp);
                enableHandlerContent(descriptor);
                @Override
            this.blockControl = blockControl;
    private static class HandlerBlock {
}
        HandlerBlock handlerBlock = configurations.get(descriptor);
        GridData gd;
        item.setData(newProfile);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
                }
            }
                handlerBlock.configurator.saveSettings(handlerConfiguration);
    @Override
        profilesTable = new Table(profilesGroup, SWT.SINGLE);
    private void saveHandlerSettings() {
 * You may obtain a copy of the License at

        return super.performOk();
        DBWNetworkProfile newProfile = createNewProfile(sourceProfile);
        deleteProfileItem = UIUtils.createToolItem(toolbar, UIConnectionMessages.pref_page_network_profiles_tool_delete_title,
                    profilesTable.select(i);
    }
    protected void postCreateHandlerControls(Composite composite) {

import org.jkiss.dbeaver.model.secret.DBSSecretController;
        if (profile != null) {
        } else if (handlerBlock.blockEnableState == null) {
        });
                public void widgetSelected(SelectionEvent e) {
        {
        if (handlerConfiguration != null && handlerConfiguration.isEnabled()) {
            if (profileIndex < 0 && !profiles.isEmpty()) {
import org.jkiss.dbeaver.model.net.DBWHandlerDescriptor;
        private HandlerBlock(IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> configurator, Composite blockControl, Button useHandlerCheck)
                    try {

    }
            if (configuration != null) {
            int profileIndex = profiles.indexOf(selectedProfile);
                handlerBlock.configurator.loadSettings(new DBWHandlerConfiguration(descriptor, null));


                secretController = getSecretController();
                        updateControlsState();

                    break;
            DBWHandlerConfiguration handlerConfiguration = handlerBlock.loadedConfigs.get(selectedProfile);
            handlersFolder.addSelectionListener(new SelectionAdapter() {
    protected abstract List<DBWNetworkProfile> getDefaultNetworkProfiles();
 */
            toolbar,
            }
        }
                    profilesTable.notifyListeners(SWT.Selection, new Event());
    private void createHandlerTab(final NetworkHandlerDescriptor descriptor)
            for (NetworkHandlerDescriptor nhd : NetworkHandlerRegistry.getInstance().getDescriptors()) {
    private final List<NetworkHandlerDescriptor> allHandlers = new ArrayList<>();
        profilesTable.addSelectionListener(new SelectionAdapter() {
    public DBWNetworkProfile getSelectedProfile() {

    private void updateControlsState() {

public abstract class PrefPageNetworkProfiles extends AbstractPrefPage {
        useHandlerCheck.addSelectionListener(new SelectionAdapter() {
        CustomSashForm divider = UIUtils.createPartDivider(null, parent, SWT.HORIZONTAL);
    }
            @Override

    private void createAndShowProfile(DBWNetworkProfile sourceProfile) {
    private void enableHandlerContent(NetworkHandlerDescriptor descriptor)
        }
            preCreateHandlerControls(handlersComp);
    private ToolItem copyProfileItem;
        NetworkHandlerDescriptor descriptor = getSelectedHandler();
        private ControlEnableState blockEnableState;
        if (selectedProfile == null) {

                new SelectionAdapter() {

        {
    @Override

    protected boolean isHandlerApplicable(DBWHandlerDescriptor nhd) {

        handlerBlock.useHandlerCheck.setSelection(handlerConfiguration != null && handlerConfiguration.isEnabled());


                            UIConnectionMessages.pref_page_network_profiles_tool_no_profile_error_information, SWT.ICON_INFORMATION);

        DBWNetworkProfile profile = null;
                DBWHandlerConfiguration handlerConfiguration = handlerBlock.loadedConfigs.get(selectedProfile);

                return;
    private CTabFolder handlersFolder;
            }
import org.jkiss.utils.ArrayUtils;
        UIUtils.createToolItem(toolbar, UIConnectionMessages.pref_page_network_profiles_tool_create_title,
        private final Button useHandlerCheck;
        item.setText(newProfile.getProfileName());
                        final int index = profilesTable.getSelectionIndex();
