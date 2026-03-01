                    SWT.ICON_ERROR
                        .map(x -> " - " + x.getName())
    }
                UIUtils.showMessageBox(
 * Licensed under the Apache License, Version 2.0 (the "License");
                        .collect(Collectors.joining("\n"))
            return false;
            projectMeta.getDataSourceRegistry().updateNetworkProfile(profile);

            return true;
                    usedBy.size(),
            shell,
            NLS.bind(
        if (element instanceof DBNNode node && node.getOwnerProject() instanceof RCPProject rcpProject) {
                profileName
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import org.eclipse.ui.IWorkbenchPropertyPage;
/**
import java.util.stream.Collectors;
    @NotNull
}
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.Log;
        }
import org.eclipse.osgi.util.NLS;
        );
import org.jkiss.dbeaver.DBException;
import org.eclipse.jface.preference.PreferenceDialog;


 */
                    getShell(),
        } else {
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * PrefPageProjectResourceSettings
            if (CommonUtils.isEmptyTrimmed(profileName)) {
     *
        }
            );
import org.jkiss.code.Nullable;

     * Opens a property dialog for editing network profiles.
            }
import org.jkiss.dbeaver.ui.UIUtils;
        PreferenceDialog dialog = PreferencesUtil.createPropertyDialogOn(
        )) {
import org.jkiss.dbeaver.model.app.DBPProject;
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static boolean open(@NotNull Shell shell, @NotNull RCPProject project, @Nullable DBWNetworkProfile profile) {

import org.eclipse.ui.dialogs.PreferencesUtil;
        return projectMeta.getDataSourceRegistry().getNetworkProfiles();
        for (DBWNetworkProfile profile : allProfiles) {
    protected DBWNetworkProfile createNewProfile(@Nullable DBWNetworkProfile sourceProfile) {
        }
        return false;
     * @return {@code true} if the dialog was closed with OK, {@code false} otherwise or if an error occurred.
                        .sorted(Comparator.comparing(DBPNamedObject::getName))
    }
 *
        return secretController;
        this.projectMeta = projectMeta;
            projectMeta.getDataSourceRegistry().removeNetworkProfile(selectedProfile);
        return projectMeta instanceof RCPProject rcpProject ? rcpProject.getEclipseProject() : null;


 * DBeaver - Universal Database Manager
 *

    protected DBSSecretController getSecretController() throws DBException {
import org.jkiss.utils.CommonUtils;
public class PrefPageProjectNetworkProfiles extends PrefPageNetworkProfiles implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
    @Override
                UIConnectionMessages.pref_page_network_profiles_tool_create_dialog_profile_name,
            PAGE_ID,
                );
        projectMeta.getDataSourceRegistry().flushConfig();
    private DBPProject projectMeta;

            return false;
            getShell(),
                SWT.ICON_ERROR
        }

    @Override
            saveSettings(profile);
        }
import org.eclipse.jface.dialogs.IDialogConstants;
        projectMeta.getDataSourceRegistry().flushConfig();

        if (!usedBy.isEmpty()) {

import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
            log.error("Can't open network profiles preferences");
                    NLS.bind(UIConnectionMessages.pref_page_network_profiles_tool_create_dialog_error_info, profileName, projectMeta.getName()),
                profile.persistSecrets(secretController);
    }
    }
                DBWorkbench.getPlatformUI().showError("Save error", "Cannot save network profile credentials", e);
    @Override
        if (UIUtils.confirmAction(
                UIConnectionMessages.pref_page_network_profiles_tool_delete_dialog_error_title,
 * you may not use this file except in compliance with the License.
    private static final Log log = Log.getLog(PrefPageProjectNetworkProfiles.class);

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
                selectedProfile.getProfileName()

 * Unless required by applicable law or agreed to in writing, software
            this.projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(iProject);
    DBPProject getProjectMeta() {
    @Override
    public static final String PAGE_ID = "org.jkiss.dbeaver.project.settings.networkProfiles"; //$NON-NLS-1$
        newProfile.setProfileName(profileName);

 * limitations under the License.
        }
    @Override

package org.jkiss.dbeaver.ui.preferences;
            profile != null ? profile.getProfileName() : null
            null,
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
                DBSSecretController secretController = DBSSecretController.getProjectSecretController(projectMeta);
        if (dialog == null) {
import org.eclipse.swt.SWT;
        String profileName = sourceProfile == null ? "" : sourceProfile.getProfileName();
            profileName = profileName.trim();
    protected List<DBWNetworkProfile> getDefaultNetworkProfiles() {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        super.saveSettings(profile);
            } catch (DBException e) {
        if (iProject != null) {
    public void init(IWorkbench workbench) {
            profileName = EnterNameDialog.chooseName(
                return null;
                NLS.bind(UIConnectionMessages.pref_page_network_profiles_tool_delete_dialog_error_info, new Object[]{
                }),
import java.util.List;

                    usedBy.stream()
            secretController = DBSSecretController.getProjectSecretController(projectMeta);
            if (projectMeta.getDataSourceRegistry().getNetworkProfile(null, profileName) != null) {
        return projectMeta;
    }
import org.eclipse.ui.IWorkbench;
 */
        return dialog.open() == IDialogConstants.OK_ID;

            break;
        }
        List<? extends DBPDataSourceContainer> usedBy = projectMeta
import org.jkiss.dbeaver.model.rcp.RCPProject;
/*
                    UIConnectionMessages.pref_page_network_profiles_tool_create_dialog_error_title,

    }
        IProject iProject;

    protected void updateNetworkProfiles(List<DBWNetworkProfile> allProfiles) {
            project.getEclipseProject(),
     */
    public PrefPageProjectNetworkProfiles() {
    @Override
        while (true) {

            .getDataSourceRegistry().getDataSourcesByProfile(selectedProfile);

    }
            iProject = GeneralUtils.adapt(element, IProject.class);
            iProject = rcpProject.getEclipseProject();
                continue;

            UIUtils.showMessageBox(
 *
            );
            )
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        projectMeta.getDataSourceRegistry().updateNetworkProfile(newProfile);
        DBWNetworkProfile newProfile = new DBWNetworkProfile(projectMeta);

import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
                getShell(),
    protected boolean deleteProfile(DBWNetworkProfile selectedProfile) {
    public void saveSettings(DBWNetworkProfile profile) {
    public void setElement(IAdaptable element) {
            }
import org.jkiss.dbeaver.model.secret.DBSSecretController;
import org.jkiss.code.NotNull;
            }
            UIConnectionMessages.pref_page_network_profiles_tool_delete_confirmation_title,

    @Override
                UIConnectionMessages.pref_page_network_profiles_tool_delete_confirmation_question,

import org.eclipse.core.resources.IProject;
    void setProjectMeta(@NotNull DBPProject projectMeta) {
import org.eclipse.core.runtime.IAdaptable;
        DBSSecretController secretController = null;
            projectMeta.getDataSourceRegistry().flushConfig();
                getShell(),
import org.eclipse.ui.IWorkbenchPreferencePage;
        }
            try {
import org.jkiss.dbeaver.model.DBPNamedObject;
        if (projectMeta.isUseSecretStorage()) {
 * See the License for the specific language governing permissions and
        if (projectMeta.isUseSecretStorage()) {

    public IAdaptable getElement() {
        return newProfile;
import org.eclipse.swt.widgets.Shell;
        }

import java.util.Comparator;
                    selectedProfile.getProfileName(),
    @Override
