        });
        );
            if (eed.getId().equals(defEditorPage)) {
                : store.getBoolean(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST)
        return editors;
    }
            useDefaultValues
                UINavigatorMessages.pref_page_ui_general_show_table_grid,
        showStatisticsCheck.setSelection(
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CHILD_COUNT)
            useDefaultValues
    private Button expandOnConnectCheck;
                UINavigatorMessages.pref_page_database_general_label_group_database_by_driver,
            useDefaultValues
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_EDITOR_SHOW_TABLE_GRID)
                UINavigatorMessages.pref_page_database_general_label_expand_navigator_tree,
                    sortCaseInsensitiveCheck.setSelection(isAlphabetical);
        colorAllNodesCheck.setSelection(
    public boolean performOk()
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO)
            showNodeActionsCheck = UIUtils.createCheckbox(

        super.applyData(data);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.navigator"; //$NON-NLS-1$
                navigatorGroup,


        editors.sort(Comparator.comparing(editor -> switch (editor.getPosition()) {

            );
            showTableGrid = UIUtils.createCheckbox(
            CommonUtils.fromOrdinal(NavigatorPreferences.DoubleClickBehavior.class, dsDoubleClickBehavior.getSelectionIndex()).name());

                NavigatorPreferences.DoubleClickBehavior.EDIT)
import org.jkiss.dbeaver.ModelPreferences;
    private Combo dsDoubleClickBehavior;
            useDefaultValues
        defaultEditorPageCombo.add(UINavigatorMessages.pref_page_navigator_default_editor_page_last);
    {
                SWT.BORDER
        List<EntityEditorDescriptor> entityEditors = getAvailableEditorPages();
    private Button showObjectTipsCheck;
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS)
                miscGroup,
    @Override
                false,
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONTENTS_IN_TOOLTIP)
            }
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_GROUP_BY_DRIVER)
                false,
    protected void performDefaults() {
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_COLOR_ALL_NODES)
                UINavigatorMessages.pref_page_database_navigator_group_behavior,
            }
    public void applyData(Object data)
 * DBeaver - Universal Database Manager
        dsDoubleClickBehavior.select(
        PrefUtils.savePreferenceStore(store);
                2
                miscGroup,

        showResourceFolderPlaceholdersCheck.setSelection(
                : store.getBoolean(ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE)
 * limitations under the License.
            sortFoldersFirstCheck = UIUtils.createCheckbox(
                ? store.getDefaultBoolean(ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE)
        store.setValue(NavigatorPreferences.NAVIGATOR_DEFAULT_EDITOR_PAGE, defEditorIndex <= 0 ? "" : entityEditors.get(defEditorIndex - 1).getId());
            expandOnConnectCheck = UIUtils.createCheckbox(

 * You may obtain a copy of the License at
            useDefaultValues
                UINavigatorMessages.pref_page_database_general_label_color_all_nodes_tip,
            restoreStateDepthText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
            useDefaultValues
            showContentsInToolTipsContents = UIUtils.createCheckbox(
                ? store.getDefaultString(NavigatorPreferences.NAVIGATOR_OBJECT_DOUBLE_CLICK)
        {
    }
        );
                navigatorGroup,
            longListFetchSizeText = UIUtils.createLabelText(
                if (!DBSDataContainer.class.getName().equals(ot.getImplName()) &&
                false,
    private void setSettings(boolean useDefaultValues) {
                : store.getString(NavigatorPreferences.NAVIGATOR_OBJECT_DOUBLE_CLICK)
                }
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    @Nullable
        NavigatorPreferences.DoubleClickBehavior objDCB = NavigatorPreferences.DoubleClickBehavior.EXPAND;
                "",
 *     http://www.apache.org/licenses/LICENSE-2.0
                false,
    private Button showObjectsDescriptionCheck;
            );
                ? store.getDefaultBoolean(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST)
                composite,
            dsDoubleClickBehavior = UIUtils.createLabelCombo(behaviorGroup, UINavigatorMessages.pref_page_database_general_label_double_click_connection, SWT.DROP_DOWN | SWT.READ_ONLY);
                false,
                UINavigatorMessages.pref_page_database_general_label_show_tips_in_tree_tip,
                2,
            showResourceFolderPlaceholdersCheck = UIUtils.createCheckbox(
                UINavigatorMessages.pref_page_database_general_label_order_elements_alphabetically_tip,
        editors.addFirst(editorsRegistry.getDefaultEditor());
                UINavigatorMessages.pref_page_database_general_label_order_elements_alphabetically,
        );
            defaultEditorPageCombo = UIUtils.createLabelCombo(behaviorGroup, UINavigatorMessages.pref_page_navigator_default_editor_page_label, UINavigatorMessages.pref_page_navigator_default_editor_page_tip, SWT.DROP_DOWN | SWT.READ_ONLY);
                navigatorGroup,
        setSettings(false);
import org.jkiss.dbeaver.ui.UIUtils;
        store.setValue(NavigatorPreferences.NAVIGATOR_CONNECTION_DOUBLE_CLICK,
    private Button showStatisticsCheck;
        editors.removeIf(editor -> {
import org.eclipse.swt.widgets.*;
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_GROUP_BY_DRIVER)
                    : store.getString(NavigatorPreferences.NAVIGATOR_CONNECTION_DOUBLE_CLICK),
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME)
        showChildCountCheck.setSelection(
                navigatorGroup,
 */
            showObjectsDescriptionCheck = UIUtils.createCheckbox(
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_TOOLTIPS)
            case EntityEditorDescriptor.POSITION_START -> -1;

                false,
            );
                2

        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        restoreFilterCheck.setSelection(

        store.setValue(NavigatorPreferences.NAVIGATOR_OBJECT_DOUBLE_CLICK, objDCB.name());
                SelectionListener.widgetSelectedAdapter(e -> {
                2
            sortAlphabeticallyCheck = UIUtils.createCheckbox(
                2
    }
                useDefaultValues
import org.eclipse.ui.IWorkbenchPropertyPage;
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECT_TIPS)
                navigatorGroup,
                ? store.getDefaultBoolean(ModelPreferences.NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS)
    private Button showNodeActionsCheck;

            );
    private Button restoreFilterCheck;
        final EntityEditorsRegistry editorsRegistry = EntityEditorsRegistry.getInstance();
                UINavigatorMessages.pref_page_database_navigator_group_misc,
        store.setValue(NavigatorPreferences.NAVIGATOR_EXPAND_ON_CONNECT, expandOnConnectCheck.getSelection());
            restoreStateDepthText.setToolTipText(UINavigatorMessages.pref_page_database_general_label_restore_state_depth_tip);
import org.eclipse.ui.IWorkbenchPreferencePage;
                UINavigatorMessages.pref_page_database_general_label_show_host_name_tip,
    @Override
            useDefaultValues
                false,
            objDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_node_open_properties, 0);

                UINavigatorMessages.pref_page_database_general_label_show_child_count_tip,
        showTableGrid.setSelection(
                2
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO)
import org.jkiss.dbeaver.utils.PrefUtils;
    private Text restoreStateDepthText;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    private Text longListFetchSizeText;

            );
/**

            ? store.getDefaultString(NavigatorPreferences.NAVIGATOR_DEFAULT_EDITOR_PAGE)
                    ? store.getDefaultString(NavigatorPreferences.NAVIGATOR_CONNECTION_DOUBLE_CLICK)
                UINavigatorMessages.pref_page_database_general_label_sort_case_insensitive_tip,
import org.eclipse.ui.IWorkbench;

            objDoubleClickBehavior = UIUtils.createLabelCombo(behaviorGroup, UINavigatorMessages.pref_page_database_general_label_double_click_node, SWT.DROP_DOWN | SWT.READ_ONLY);
        store.setValue(NavigatorPreferences.NAVIGATOR_COLOR_ALL_NODES, colorAllNodesCheck.getSelection());
            );
                    boolean isAlphabetical = sortAlphabeticallyCheck.getSelection();
            );
                false,
            objDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_node_expand_collapse, 1);
        store.setValue(ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE, sortCaseInsensitiveCheck.getSelection());
        {
        if (objDoubleClickBehavior.getSelectionIndex() == 0) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            case EntityEditorDescriptor.POSITION_END -> 1;
        store.setValue(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE, longListFetchSizeText.getText());
                UINavigatorMessages.pref_page_database_general_label_folders_first,

    }
            : store.getString(NavigatorPreferences.NAVIGATOR_DEFAULT_EDITOR_PAGE);
                UINavigatorMessages.pref_page_database_general_label_show_contents_in_tooltips_tip,
import java.util.List;
/*
                : store.getBoolean(ModelPreferences.NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS)
        objDoubleClickBehavior.select(objDCB == NavigatorPreferences.DoubleClickBehavior.EXPAND ? 1 : 0);
        sortFoldersFirstCheck.setSelection(
        showObjectsDescriptionCheck.setSelection(
import org.jkiss.dbeaver.model.struct.DBSEntity;
        );

                UINavigatorMessages.pref_page_database_general_label_show_node_actions,
                    !DBSEntity.class.getName().equals(ot.getImplName()) &&
                false,
                navigatorGroup,
    private Button sortFoldersFirstCheck;
    @NotNull
    public void init(IWorkbench workbench)
                UINavigatorMessages.pref_page_database_general_label_show_contents_in_tooltips,
        }));
    }
        }

                : store.getBoolean(NavigatorPreferences.NAVIGATOR_EXPAND_ON_CONNECT)

                2
            // TODO: remove or enable this setting
                2
                UINavigatorMessages.pref_page_database_general_label_show_statistics_tip,
        sortCaseInsensitiveCheck.setEnabled(sortAlphabeticallyCheck.getSelection());
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                    sortCaseInsensitiveCheck.setEnabled(isAlphabetical);
                UINavigatorMessages.pref_page_database_general_label_restore_state_depth,

                : store.getBoolean(NavigatorPreferences.NAVIGATOR_RESTORE_FILTER)
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION, showObjectsDescriptionCheck.getSelection());
 * See the License for the specific language governing permissions and
        );
            );
            useDefaultValues
            sortCaseInsensitiveCheck = UIUtils.createCheckbox(
            longListFetchSizeText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.getDefault()));
    private Combo defaultEditorPageCombo;
                false,


            return false;
    }
                defaultEditorPageCombo.select(defaultEditorPageCombo.getItemCount() - 1);
            colorAllNodesCheck = UIUtils.createCheckbox(
            groupByDriverCheck = UIUtils.createCheckbox(
    @Override
            showConnectionHostCheck = UIUtils.createCheckbox(
}        showConnectionHostCheck.setSelection(
                UINavigatorMessages.pref_page_database_general_label_show_tooltips,
            );
                navigatorGroup,
                1);
                navigatorGroup,
            for (AbstractDescriptor.ObjectType ot : editor.getObjectTypes()) {
        restoreStateDepthText.setText(
        );
        List<EntityEditorDescriptor> entityEditors = getAvailableEditorPages();
    private Button groupByDriverCheck;
 */
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_OBJECT_TIPS, showObjectTipsCheck.getSelection());
 * distributed under the License is distributed on an "AS IS" BASIS,
                2
            useDefaultValues
import org.eclipse.swt.SWT;
        store.setValue(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH, restoreStateDepthText.getText());
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME, showConnectionHostCheck.getSelection());
        sortCaseInsensitiveCheck.setSelection(
        store.setValue(NavigatorPreferences.NAVIGATOR_GROUP_BY_DRIVER, groupByDriverCheck.getSelection());
            dsDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_connection_expand_collapse, NavigatorPreferences.DoubleClickBehavior.EXPAND.ordinal());
                }));
                ? store.getDefaultString(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH)
                .ordinal());
import org.jkiss.code.Nullable;
            );
package org.jkiss.dbeaver.ui.preferences;
    }
    public IAdaptable getElement()
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
                navigatorGroup,
                false,
                "",
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECT_TIPS)
                navigatorGroup,
        Composite composite = UIUtils.createComposite(parent, 2);
                    !DBSTable.class.getName().equals(ot.getImplName()))
            Composite navigatorGroup = UIUtils.createTitledComposite(composite, UINavigatorMessages.pref_page_database_general_group_navigator, 2);
            showChildCountCheck = UIUtils.createCheckbox(
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_EXPAND_ON_CONNECT)
                2
        );
    @Override
    private Button showResourceFolderPlaceholdersCheck;
            dsDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_connection_conn_disconn, NavigatorPreferences.DoubleClickBehavior.CONNECT.ordinal());
                : store.getBoolean(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY)
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CHILD_COUNT)
        );
                UINavigatorMessages.pref_page_database_general_label_show_node_actions_tip,
                UINavigatorMessages.pref_page_database_general_label_show_folder_placeholders,
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
    private Combo objDoubleClickBehavior;
        );
        store.setValue(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST, sortFoldersFirstCheck.getSelection());
        store.setValue(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY, sortAlphabeticallyCheck.getSelection());
        }
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

            useDefaultValues
            Composite behaviorGroup = UIUtils.createTitledComposite(
        );
                UINavigatorMessages.pref_page_database_general_label_show_statistics,
        groupByDriverCheck.setSelection(
                miscGroup,
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_TOOLTIPS)
            if (editor.getType() != EntityEditorDescriptor.Type.editor) return true;
            useDefaultValues
import java.util.Comparator;
    private Button sortAlphabeticallyCheck;
    private Button showTableGrid;
            );
    private Button showToolTipsCheck;
        defaultEditorPageCombo.removeAll();
import org.eclipse.swt.layout.GridData;
            longListFetchSizeText.setToolTipText(UINavigatorMessages.pref_page_database_general_label_long_list_fetch_size_tip);
            sortAlphabeticallyCheck.addSelectionListener(
            );
                UINavigatorMessages.pref_page_database_general_label_long_list_fetch_size,
        );
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION)
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_CHILD_COUNT, showChildCountCheck.getSelection());

            );
                false,
        }
            );
                UINavigatorMessages.pref_page_database_general_label_show_tips_in_tree,
                UINavigatorMessages.pref_page_database_general_label_restore_filter_tip,
    {
                2
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.SelectionListener;
        expandOnConnectCheck.setSelection(
            case EntityEditorDescriptor.POSITION_PROPS -> -2;
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_COLOR_ALL_NODES)
            );
    {
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS, showNodeActionsCheck.getSelection());
    }
        );
import java.util.Locale;
        showNodeActionsCheck.setSelection(
                GridData.VERTICAL_ALIGN_BEGINNING
 * you may not use this file except in compliance with the License.
        defaultEditorPageCombo.select(0);
                GridData.VERTICAL_ALIGN_BEGINNING
                UINavigatorMessages.pref_page_database_general_label_show_objects_description,
                    !DBSObjectContainer.class.getName().equals(ot.getImplName()) &&
        super();
import org.jkiss.code.NotNull;
            defaultEditorPageCombo.add(eed.getName());
            showToolTipsCheck = UIUtils.createCheckbox(
    private Button showContentsInToolTipsContents;
        );
                navigatorGroup,
            CommonUtils.valueOf(
                navigatorGroup,
        return true;
                2,
                2
    private Button colorAllNodesCheck;

            );
public class PrefPageDatabaseNavigator extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
                NavigatorPreferences.DoubleClickBehavior.class,
                false,

        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_TOOLTIPS, showToolTipsCheck.getSelection());
                : store.getString(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE)
                UINavigatorMessages.pref_page_database_general_label_restore_filter,
            restoreStateDepthText = UIUtils.createLabelText(
                UINavigatorMessages.pref_page_database_general_label_folders_first_tip,
        );
                SWT.BORDER
    private Button showConnectionHostCheck;
                navigatorGroup,
            default -> 0;
        );
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_EDITOR_SHOW_TABLE_GRID)

        return null;
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorsRegistry;
 * PrefPageDatabaseNavigator
            Composite miscGroup = UIUtils.createTitledComposite(
 *
    private Button showChildCountCheck;
    }
                UINavigatorMessages.pref_page_database_general_label_show_objects_description_tip,
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION)
    public void setElement(IAdaptable element)
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorDescriptor;
            NavigatorPreferences.DoubleClickBehavior.class,
        );

                2
            useDefaultValues
        }
                ? store.getDefaultString(NavigatorPreferences.NAVIGATOR_LONG_LIST_FETCH_SIZE)
            useDefaultValues
                composite,

                2



import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                {
                false,
            showObjectTipsCheck = UIUtils.createCheckbox(
        return composite;
                ? store.getDefaultBoolean(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY)
        setSettings(true);
            );
            useDefaultValues
        );
            useDefaultValues
        store.setValue(NavigatorPreferences.NAVIGATOR_RESTORE_FILTER, restoreFilterCheck.getSelection());
                false,

        String defEditorPage = useDefaultValues
            useDefaultValues
                2
            useDefaultValues
                UINavigatorMessages.pref_page_database_general_label_show_child_count,
        showToolTipsCheck.setSelection(
 * Unless required by applicable law or agreed to in writing, software
            );
                : store.getString(NavigatorPreferences.NAVIGATOR_RESTORE_STATE_DEPTH)
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_RESTORE_FILTER)
import org.eclipse.core.runtime.IAdaptable;
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_CONTENTS_IN_TOOLTIP, showContentsInToolTipsContents.getSelection());

 *
            dsDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_connection_open_new_sqleditor, NavigatorPreferences.DoubleClickBehavior.SQL_EDITOR_NEW.ordinal());
        NavigatorPreferences.DoubleClickBehavior objDCB = CommonUtils.valueOf(

    public PrefPageDatabaseNavigator()

    @Override
                UINavigatorMessages.pref_page_database_general_label_sort_case_insensitive,
                UINavigatorMessages.pref_page_database_general_label_show_tooltips_tip,
    }
        {
        }
        for (EntityEditorDescriptor eed : entityEditors) {
        final List<EntityEditorDescriptor> editors = new ArrayList<>(editorsRegistry.getEntityEditors());

        showContentsInToolTipsContents.setSelection(
            showStatisticsCheck = UIUtils.createCheckbox(
                navigatorGroup,
        );
 * Copyright (C) 2010-2026 DBeaver Corp and others
            dsDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_connection_open_properties, NavigatorPreferences.DoubleClickBehavior.EDIT.ordinal());
        );
                UINavigatorMessages.pref_page_database_general_label_expand_navigator_tree_tip,
    @Override
            restoreFilterCheck = UIUtils.createCheckbox(

            groupByDriverCheck.setEnabled(false);
    {
            useDefaultValues
        store.setValue(NavigatorPreferences.NAVIGATOR_EDITOR_SHOW_TABLE_GRID, showTableGrid.getSelection());
                navigatorGroup,
                2
            useDefaultValues
                miscGroup,
        int defEditorIndex = defaultEditorPageCombo.getSelectionIndex();
                UINavigatorMessages.pref_page_ui_general_show_table_grid,
    {
    {
                UINavigatorMessages.pref_page_database_general_label_color_all_nodes,
                false,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        longListFetchSizeText.setText(
    @Override
                UINavigatorMessages.pref_page_database_general_label_show_host_name,
        sortAlphabeticallyCheck.setSelection(
import org.jkiss.utils.CommonUtils;
            useDefaultValues
    private List<EntityEditorDescriptor> getAvailableEditorPages() {
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
            objDCB = NavigatorPreferences.DoubleClickBehavior.EDIT;
    protected Control createPreferenceContent(@NotNull Composite parent) {
            );
import java.util.ArrayList;
        store.setValue(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO, showStatisticsCheck.getSelection());
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONTENTS_IN_TOOLTIP)

 *
        store.setValue(ModelPreferences.NAVIGATOR_SHOW_FOLDER_PLACEHOLDERS, showResourceFolderPlaceholdersCheck.getSelection());
            dsDoubleClickBehavior.add(UINavigatorMessages.pref_page_database_general_label_double_click_connection_open_sqleditor, NavigatorPreferences.DoubleClickBehavior.SQL_EDITOR.ordinal());
    private Button sortCaseInsensitiveCheck;
            );
                "",
        showObjectTipsCheck.setSelection(
        );
                2
                false,
                UINavigatorMessages.pref_page_database_general_label_show_folder_placeholders_tip,
                : store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS)
                ? store.getDefaultBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME)

                    return true;
