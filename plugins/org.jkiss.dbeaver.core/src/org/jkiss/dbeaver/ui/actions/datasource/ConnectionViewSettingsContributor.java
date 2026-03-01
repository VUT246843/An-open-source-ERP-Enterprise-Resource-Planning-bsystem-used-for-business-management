        for (DataSourceNavigatorSettings.Preset preset : DataSourceNavigatorSettings.PRESETS.values()) {
    }


            setToolTipText(DataSourceNavigatorSettings.PRESET_CUSTOM.getDescription());

            updateSettings(newSettings);
import org.eclipse.jface.action.Separator;
    }
    }
            setChecked(DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS));
            setToolTipText(preset.getDescription());
            super(container, UINavigatorMessages.pref_page_database_general_label_show_statistics, AS_CHECK_BOX);
    private static class UseSettingsCustomAction extends SettingsAction {
            setToolTipText(UINavigatorMessages.pref_page_database_general_label_show_objects_description_tip);
            if (isChecked()) {
        }
        @Override

            }
            super(container, UINavigatorMessages.pref_page_database_general_label_show_objects_description, AS_CHECK_BOX);
        boolean presetChecked = false;
                {
            }
            } else {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
import org.jkiss.dbeaver.Log;
            }
    }
        }
            setToolTipText(UINavigatorMessages.pref_page_database_general_label_show_statistics_tip);
                continue;
import org.eclipse.osgi.util.NLS;
            refreshNavigator();
    protected void fillContributionItems(final List<IContributionItem> menuItems) {
import org.jkiss.dbeaver.core.CoreMessages;
 *

    private static class ShowObjectsDescriptionAction extends SettingsAction {
import org.jkiss.dbeaver.model.navigator.DBNBrowseSettings;
            return;
                dsContainer.persistConfiguration();
        menuItems.add(new ActionContributionItem(new ShowStatusIconsAction(dsContainer)));
    }
                try {
            if (checked) {
            if (dsContainer.isConnected()) {
                ((DataSourceDescriptor) this.dsContainer).setNavigatorSettings(settings);

    private static class ShowStatusIconsAction extends SettingsAction {
            super(name, style);
        }
            super(container, UINavigatorMessages.pref_page_database_general_label_show_node_actions, AS_CHECK_BOX);
        }
        ShowStatisticsAction(DBPDataSourceContainer container) {
                    NLS.bind(CoreMessages.dialog_connection_edit_wizard_conn_change_question, dsContainer.getName()) ))
import org.jkiss.dbeaver.ui.UIUtils;
    }
            }
        }
        public void run() {
                presetChecked = checked;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            newSettings.setShowSystemObjects(isChecked());
        menuItems.add(new ActionContributionItem(new ShowObjectsDescriptionAction(dsContainer)));
            super(dsContainer, preset.getName(), AS_RADIO_BUTTON);
                    CoreMessages.dialog_connection_edit_wizard_conn_change_title,
                UIUtils.getActiveWorkbenchShell(),
        menuItems.add(new Separator());
            setToolTipText(UINavigatorMessages.pref_page_database_general_label_show_node_actions_tip);
        public void run() {
                    DataSourceNavigatorSettingsUtils.updateCustomNavigatorSettings(dsContainer, (DataSourceNavigatorSettings) settings);
 *
            }
        @Override
            this.preset = preset;
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettingsUtils;
 * Unless required by applicable law or agreed to in writing, software
        @Override

            if (dialog.open() == IDialogConstants.OK_ID) {
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
    private static final Log log = Log.getLog(ConnectionViewSettingsContributor.class);
                } catch (DBException e) {
        public void run() {

            if (!isChecked()) {

import org.jkiss.dbeaver.registry.DataSourceDescriptor;

 * distributed under the License is distributed on an "AS IS" BASIS,
        DBPDataSourceContainer dsContainer = AbstractDataSourceHandler.getDataSourceContainerFromPart(UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart());
        void updateSettings(DBNBrowseSettings settings) {
        }

/*
                }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorView;
                updateSettings(preset.getSettings());
        }
            if (view instanceof INavigatorModelView) {
            setChecked(checked);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public void run() {
            setChecked(DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME));
import org.eclipse.jface.action.ActionContributionItem;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at


            IViewPart view = UIUtils.getActiveWorkbenchWindow().getActivePage().findView(DatabaseNavigatorView.VIEW_ID);
            setChecked(checked);
        @Override
 */
        }
        }
        }
import org.jkiss.dbeaver.DBException;

        SettingsAction(DBPDataSourceContainer dsContainer, String name, int style) {
                    return;

    }
                Viewer navigatorViewer = ((INavigatorModelView) view).getNavigatorViewer();
import org.eclipse.jface.action.IContributionItem;
        @Override
        ShowObjectsDescriptionAction(DBPDataSourceContainer container) {
                    navigatorViewer.getControl().redraw();
        }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    DataSourceHandler.reconnectDataSource(null, dsContainer);
            DBWorkbench.getPlatform().getPreferenceStore().setValue(NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME, isChecked());
        public void run() {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
package org.jkiss.dbeaver.ui.actions.datasource;
import org.eclipse.jface.action.Action;
import java.util.List;
            setChecked(container.getNavigatorSettings().isShowSystemObjects());
    @Override
                }
            setChecked(DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION));
 *
        final DBPDataSourceContainer dsContainer;
            DataSourceNavigatorSettings newSettings = new DataSourceNavigatorSettings(dsContainer.getNavigatorSettings());
import org.jkiss.dbeaver.registry.DataSourceNavigatorSettings;
 *     http://www.apache.org/licenses/LICENSE-2.0
        UseSettingsPresetAction(DBPDataSourceContainer dsContainer, DataSourceNavigatorSettings.Preset preset, boolean checked) {
            super(dsContainer, DataSourceNavigatorSettings.PRESET_CUSTOM.getName() + " ...", AS_RADIO_BUTTON);
        menuItems.add(new ActionContributionItem(new UseSettingsCustomAction(dsContainer, !presetChecked)));
        menuItems.add(new Separator());
            super(container, UINavigatorMessages.pref_page_database_general_label_show_host_name, AS_CHECK_BOX);
import org.eclipse.ui.IViewPart;
                updateSettings(dialog.getNavigatorSettings());

        }

        @Override
        ShowHostNameAction(DBPDataSourceContainer container) {
                return;
                if (UIUtils.confirmAction(
 * DBeaver - Universal Database Manager
        }
            boolean checked = preset.getSettings().equals(dsContainer.getNavigatorSettings());
            if (DBWorkbench.isDistributed()) {

 * See the License for the specific language governing permissions and
}            }
            setChecked(DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO));
            this.dsContainer = dsContainer;
        public void run() {
 * limitations under the License.
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        }
            DBWorkbench.getPlatform().getPreferenceStore().setValue(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO, isChecked());
    private static class ShowHostNameAction extends SettingsAction {
            DBWorkbench.getPlatform().getPreferenceStore().setValue(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS, isChecked());
        menuItems.add(new ActionContributionItem(new ShowStatisticsAction(dsContainer)));
        }
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
        menuItems.add(new ActionContributionItem(new ShowHostNameAction(dsContainer)));
    private static class UseSettingsPresetAction extends SettingsAction {

                dsContainer.getNavigatorSettings(),
        void refreshNavigator() {
            }
                dsContainer);
        }
    private static class ShowSystemObjectsAction extends SettingsAction {
import org.eclipse.jface.viewers.Viewer;
        ShowSystemObjectsAction(DBPDataSourceContainer container) {

                    UIUtils.getActiveWorkbenchShell(),
            refreshNavigator();

                if (navigatorViewer != null) {
    private abstract static class SettingsAction extends Action {
            refreshNavigator();
 * you may not use this file except in compliance with the License.
        ShowStatusIconsAction(DBPDataSourceContainer container) {
            menuItems.add(new ActionContributionItem(new UseSettingsPresetAction(dsContainer, preset, checked)));

        @Override
            setToolTipText(UINavigatorMessages.pref_page_database_general_label_show_host_name_tip);
            refreshNavigator();
public class ConnectionViewSettingsContributor extends DataSourceMenuContributor {
            if (preset == DataSourceNavigatorSettings.PRESET_CUSTOM) {
        public void run() {

            super(container, CoreMessages.dialog_connection_wizard_final_checkbox_show_system_objects, AS_CHECK_BOX);
        private final DataSourceNavigatorSettings.Preset preset;
    private static class ShowStatisticsAction extends SettingsAction {
        menuItems.add(new ActionContributionItem(new ShowSystemObjectsAction(dsContainer)));
    }
            }
                    log.error("Error updating custom navigator settings", e);
                }
        }
        UseSettingsCustomAction(DBPDataSourceContainer dsContainer, boolean checked) {
        }

            DBWorkbench.getPlatform().getPreferenceStore().setValue(NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION, isChecked());

import org.jkiss.dbeaver.ui.dialogs.connection.EditConnectionNavigatorSettingsDialog;
            EditConnectionNavigatorSettingsDialog dialog = new EditConnectionNavigatorSettingsDialog(
        if (dsContainer == null) {
import org.eclipse.jface.dialogs.IDialogConstants;
            setToolTipText(CoreMessages.dialog_connection_wizard_final_checkbox_show_system_objects_tip);
