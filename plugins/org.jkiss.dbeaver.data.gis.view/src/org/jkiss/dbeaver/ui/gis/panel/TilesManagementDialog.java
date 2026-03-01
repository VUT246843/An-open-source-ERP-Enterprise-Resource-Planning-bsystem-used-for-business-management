    private void changeToolbarState(@Nullable TreeItem item) {
            for (LeafletTilesDescriptor descriptor: userDefinedTiles) {
            public void widgetSelected(SelectionEvent e) {
                        if (status != IDialogConstants.OK_ID) {
        Composite dialogArea = super.createDialogArea(parent);
                            repopulateTree(null, true);
                            }
    private boolean isModelContainsDescriptorWithLabel(@NotNull String label) {
            GridData gd = new GridData(GridData.FILL_BOTH);

                } else {
    private TreeItem userDefinedTilesRootItem;
                dialogArea,
                if (GISMessages.panel_select_tiles_action_manage_dialog_user_defined_tiles.equals(item.getText())) {
        private Text layersDefinitionText;
                new SelectionAdapter() {
                        if (i == -1) {
        @Nullable
        if (!predefinedTiles.isEmpty()) {
                } else if (userDefinedTilesRootItem != null) {
                            currentSelectedTileLayer = editedDescriptor;
        UIUtils.asyncExec(() -> UIUtils.packColumns(tree, true, new float[]{1.f}));
                toolBar,
            int mutabilityStyle = originalTilesDescriptor != null && originalTilesDescriptor.isPredefined() ? SWT.READ_ONLY : SWT.NONE;
            }

        tree.setVisible(true);

                    }
                        }
                }

                LeafletTilesDescriptor descriptor = ((LeafletTilesDescriptor) item.getData());
    private ToolItem viewOrEditTilesItem;
                                GISMessages.panel_select_tiles_action_manage_dialog_error_editing_tiles_title,
            if (what.equals(list.get(i))) {
                        int i = userDefinedTiles.indexOf(descriptor);
        public LeafletTilesDescriptor getResultingTilesDescriptor() {
        tree.setSelection(lastSelectedTreeItem);
                            log.error("New descriptor is null despite that user clicked ok");
        tree = new Tree(group, SWT.FULL_SELECTION | SWT.BORDER | SWT.CHECK);

            for (TreeItem item : children) {
                replace(tilesContainer, descriptor, withFlippedVisibility);
                        if (item.getChecked() != descriptor.isVisible()) {
    private LeafletTilesDescriptor currentSelectedTileLayer;
            userDefinedTilesRootItem.setChecked(userDefinedTiles.stream().anyMatch(LeafletTilesDescriptor::isVisible));
                            log.error("Can't find tiles to delete!");
    }
    }
import org.jkiss.dbeaver.ui.gis.registry.LeafletTilesDescriptor;
                );
                return GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_add_tiles_title;
                                GISMessages.panel_select_tiles_action_manage_dialog_error_adding_new_tiles_message
    private TreeItem lastSelectedTreeItem;
import org.jkiss.dbeaver.ui.UIIcon;
        }
                        if (lastSelectedTreeItem.equals(userDefinedTilesRootItem)) {
            userDefinedTilesRootItem.setText(GISMessages.panel_select_tiles_action_manage_dialog_user_defined_tiles);
                }
                    }
                        replace(userDefinedTiles, originalDescriptor, editedDescriptor);
                LeafletTilesDescriptor withFlippedVisibility = descriptor.withFlippedVisibility();
        tree.addSelectionListener(new SelectionAdapter() {
                UIIcon.DELETE,
            viewOrEditTilesItem.setEnabled(item != null && item.getData() != null);
            return dialogArea;
                            return;
                        lastSelectedDescriptor = (LeafletTilesDescriptor) lastSelectedTreeItem.getData();

            }
                    @Override
        UIUtils.createInfoLabel(composite, GISMessages.panel_select_tiles_action_manage_dialog_infolabel_about_checkboxes_meaning);
                GridData.FILL_BOTH
        ToolBar toolBar = new ToolBar(group, SWT.VERTICAL);
    @Override
            predefinedTilesRootItem.setChecked(predefinedTiles.stream().anyMatch(LeafletTilesDescriptor::isVisible));
import java.util.Collection;
                                GISMessages.panel_select_tiles_action_manage_dialog_error_editing_tiles_message
                List<LeafletTilesDescriptor> tilesContainer = descriptor.isPredefined() ? predefinedTiles : userDefinedTiles;

        @Nullable
    protected Composite createDialogArea(@NotNull Composite parent) {
            }
        Composite composite = UIUtils.createComposite(dialogArea, 1);
                        LeafletTilesDescriptor descriptor = dialog.getResultingTilesDescriptor();
                group,
        }
        });
import org.eclipse.swt.layout.GridData;

                new SelectionAdapter() {
            predefinedTilesRootItem = new TreeItem(tree, SWT.NONE);
                        repopulateTree(descriptor, true);
    @Nullable
                            return;
import java.util.ArrayList;
        private final LeafletTilesDescriptor originalTilesDescriptor;
                        if (descriptor.isPredefined()) {
            );
        return containsDescriptorWithLabel(predefinedTiles, label) || containsDescriptorWithLabel(userDefinedTiles, label);
                            log.error("Can't find tiles to edit!");
            } else {
                        }
class TilesManagementDialog extends BaseDialog {
                UIIcon.TEXTFIELD,
            return GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_edit_tiles_title;
                }
        }
        private LeafletTilesDescriptor resultingTilesDescriptor;
            createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
                }
                        } else {
                            userDefinedTiles.clear();
            Composite composite = UIUtils.createComposite(dialogArea, 1);
                deleteTilesItem.setEnabled(false);
                }
                        HelpUtils.getHelpExternalReference("Working-with-Spatial-GIS-data#defining-custom-tile-layer"));
                        }
        }
                GISMessages.panel_select_tiles_action_manage_dialog_toolbar_delete_tiles,
            );
                }
                    @Override
                            return;
                        if (isRootItem(lastSelectedTreeItem)) {
                    }
                    }
    }
                        LeafletTilesDescriptor descriptor = (LeafletTilesDescriptor) lastSelectedTreeItem.getData();

            Composite group = UIUtils.createTitledComposite(
            Composite dialogArea = super.createDialogArea(parent);
                if ((e.detail & SWT.CHECK) == SWT.CHECK) {
    private Tree tree;
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
                    userDefinedTilesRootItem.setChecked(checkOnRoot);
                        if (descriptor == null) {

        protected void createButtonsForButtonBar(@NotNull Composite parent) {
        tree.removeAll();
                if (!(e.item instanceof TreeItem)) {
                        if (descriptor.equals(currentSelectedTileLayer)) {
                item.setText(descriptor.getLabel());
    private static class TileLayerDefinitionDialog extends BaseDialog {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.ui.ShellUtils;
            );
        }
    }
            }
import java.util.List;
        }
        private static String getTitle(@Nullable LeafletTilesDescriptor tilesDescriptor) {
            }
                public void widgetSelected(SelectionEvent e) {

        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.PROCEED_LABEL, true);

            if (buttonId == IDialogConstants.OK_ID) {
        if (lastSelectedTreeItem == null) {
        return collection.stream().anyMatch(descriptor -> label.equals(descriptor.getLabel()));
                if (descriptor.equals(tilesToSelect)) {
                            DBWorkbench.getPlatformUI().showError(
        return (predefinedTilesRootItem != null && predefinedTilesRootItem.equals(widget)) || (userDefinedTilesRootItem != null && userDefinedTilesRootItem.equals(widget));
                    List<LeafletTilesDescriptor> list = item.equals(userDefinedTilesRootItem) ? userDefinedTiles : predefinedTiles;
        @Override
import org.jkiss.dbeaver.ui.gis.registry.GeometryViewerRegistry;
                        LeafletTilesDescriptor editedDescriptor = dialog.getResultingTilesDescriptor();
                        }
                TreeItem item = new TreeItem(userDefinedTilesRootItem, SWT.NONE);
    private final List<LeafletTilesDescriptor> userDefinedTiles;
                SWT.BORDER | mutabilityStyle
                item.setData(withFlippedVisibility);
        @Override

                        TileLayerDefinitionDialog dialog = new TileLayerDefinitionDialog(getShell(), originalDescriptor);
            });
                            return;
                        TileLayerDefinitionDialog dialog = new TileLayerDefinitionDialog(getShell(), null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            }
                            LeafletTilesDescriptor newDescriptor = descriptor.withFlippedVisibility();
            addNewTilesItem.setEnabled(true);
    }
                new SelectionAdapter() {
package org.jkiss.dbeaver.ui.gis.panel;
    @Nullable
                            return;
                    @Override

                        if (originalDescriptor.equals(currentSelectedTileLayer)) {
    }
                            return;
        protected void buttonPressed(int buttonId) {
 *


                    continue;
            predefinedTilesRootItem.setExpanded(expandPredefined);
        if (DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
                            repopulateTree(userDefinedTiles.get(i - 1), true);
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));
                    repopulateTree(lastSelectedDescriptor, true);
 * See the License for the specific language governing permissions and
            }
                        }
            private void reactOnCheck(@NotNull TreeItem item) {
    private final LeafletTilesDescriptor oldSelectedTileLayer;
                GISMessages.panel_select_tiles_action_manage_dialog_toolbar_add_new_tiles,
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
                    return;
            labelText = UIUtils.createLabelText(
                    reactOnCheck(lastSelectedTreeItem);
                deleteTilesItem.setEnabled(!descriptor.isPredefined());
        if (deleteTilesItem != null) {
 * you may not use this file except in compliance with the License.
                        ) {
            super.buttonPressed(buttonId);
import org.jkiss.code.NotNull;
        return dialogArea;
                return;

import org.eclipse.swt.events.SelectionAdapter;
                        if (i < userDefinedTiles.size()) {
import org.eclipse.swt.SWT;
            for (LeafletTilesDescriptor descriptor: predefinedTiles) {
                        LeafletTilesDescriptor descriptor = list.get(i);
    @Nullable

                boolean checkOnRoot = tilesContainer.stream().anyMatch(LeafletTilesDescriptor::isVisible);
            if (tilesDescriptor == null) {
    @NotNull
                            return;
                lastSelectedTreeItem = (TreeItem) e.item;
                    labelText.getText().trim(),

                if (descriptor.equals(tilesToSelect)) {

                    expandPredefined = item.getExpanded();
                        int status = dialog.open();
                        if (lastSelectedTreeItem == null || lastSelectedTreeItem.equals(predefinedTilesRootItem)) {
        if (!userDefinedTiles.isEmpty()) {
                            || userDefinedTiles.stream().anyMatch(t -> t.getLabel().equals(editedDescriptor.getLabel())
import java.util.Objects;
                    if (predefinedTilesRootItem != null) {
                        }
                    layersDefinitionText.getText().trim(),
            UIUtils.createLink(dialogArea, GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_layers_definition_explanation_link_text, new SelectionAdapter() {
                toolBar,
        private Text labelText;
                if (descriptor.isPredefined()) {
        super(parentShell, GISMessages.panel_select_tiles_action_manage_dialog_title, null);
                deleteTilesItem.setEnabled(item.equals(userDefinedTilesRootItem));
import org.eclipse.jface.dialogs.IDialogConstants;
                            && !t.equals(originalDescriptor))
        for (int i = 0; i < list.size(); i++) {
        }
    private static final Log log = Log.getLog(TilesManagementDialog.class);
                            log.error("Can't delete predefined descriptor! It's not found in the model!");
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    ShellUtils.launchProgram(
        TileLayerDefinitionDialog(Shell parentShell, @Nullable LeafletTilesDescriptor tilesDescriptor) {
                }
            if (!Objects.equals(oldSelectedTileLayer, currentSelectedTileLayer)) {
        userDefinedTilesRootItem = null;
        }
            }
                        if (result != IDialogConstants.OK_ID || originalDescriptor.isPredefined()) {
                            return;

            );
                item.setChecked(descriptor.isVisible());
    }
                    public void widgetSelected(SelectionEvent e) {
                GeometryViewerRegistry.getInstance().setDefaultLeafletTiles(currentSelectedTileLayer);
        boolean expandPredefined = true;
            this.originalTilesDescriptor = tilesDescriptor;
            userDefinedTilesRootItem.setExpanded(expandUserDefined);
            viewOrEditTilesItem = UIUtils.createToolItem(
            } else if (item.getData() == null) {
 */
            createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);
        }
                GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_text_label_layers_definition,
            }
        }
                            return;
            predefinedTilesRootItem.setText(GISMessages.panel_select_tiles_action_manage_dialog_predefined_tiles);
            TreeItem[] children = tree.getItems();
        tree.setLayoutData(new GridData(GridData.FILL_BOTH));
                toolBar,

                }
    private static boolean containsDescriptorWithLabel(@NotNull Collection<LeafletTilesDescriptor> collection, @NotNull String label) {
                }
    protected void buttonPressed(int buttonId) {
                        if (containsDescriptorWithLabel(predefinedTiles, editedDescriptor.getLabel())
                item.setData(descriptor);
    }
                        } else if (i == userDefinedTiles.size() && !userDefinedTiles.isEmpty()) {
        }

                GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_tiles_properties_group,
        }
    private void repopulateTree(@Nullable LeafletTilesDescriptor tilesToSelect, boolean retainExpansion) {

            if (item == null) {
            );
 * You may obtain a copy of the License at
            }

    TilesManagementDialog(Shell parentShell) {
    private ToolItem deleteTilesItem;
        repopulateTree(null, false);
                            log.error("Can't delete predefined descriptor!");
            deleteTilesItem.setEnabled(false);

            ToolItem addNewTilesItem = UIUtils.createToolItem(

        if (viewOrEditTilesItem != null) {
                    } else {
                        }
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.utils.HelpUtils;
                GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_text_label_label,

                        if (editedDescriptor == null) {
            GeometryViewerRegistry.getInstance().updateTiles(predefinedTiles, userDefinedTiles);
                    }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    }
            }
                        }
                }
                return GISMessages.panel_select_tiles_action_manage_dialog_tile_layer_definition_dialog_view_tiles_title;
    @Override
                                GISMessages.panel_select_tiles_action_manage_dialog_error_adding_new_tiles_title,
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable

        super.buttonPressed(buttonId);
                    for (int i = 0; i < list.size(); i++) {
            return resultingTilesDescriptor;
                if (isRootItem(item)) {
    private TreeItem predefinedTilesRootItem;
                            );
        protected Composite createDialogArea(@NotNull Composite parent) {
        currentSelectedTileLayer = oldSelectedTileLayer;
                            return;
            gd.widthHint = UIUtils.getFontHeight(layersDefinitionText) * 60;
            deleteTilesItem = UIUtils.createToolItem(
        if (retainExpansion) {
                    lastSelectedTreeItem = item;

                UIIcon.ADD,
                @Override
        }
        UIUtils.createTreeColumn(tree, SWT.NONE, GISMessages.panel_select_tiles_action_manage_dialog_tiles_column_name);
            );
                        predefinedTilesRootItem.setChecked(checkOnRoot);
                changeToolbarState(lastSelectedTreeItem);
                    public void widgetSelected(SelectionEvent e) {
                            return;
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
        predefinedTiles = new ArrayList<>(GeometryViewerRegistry.getInstance().getPredefinedLeafletTiles());
                item.setData(descriptor);
                        int result = dialog.open();
 *
 *
                                lastSelectedDescriptor = newDescriptor;
                list.set(i, with);
        boolean expandUserDefined = true;
                resultingTilesDescriptor = LeafletTilesDescriptor.createUserDefined(
            viewOrEditTilesItem.setEnabled(false);
            @Override
        toolBar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                TreeItem item = new TreeItem(predefinedTilesRootItem, SWT.NONE);
        userDefinedTiles = new ArrayList<>(GeometryViewerRegistry.getInstance().getUserDefinedLeafletTiles());
                        }
                            DBWorkbench.getPlatformUI().showError(
                        userDefinedTiles.remove(i);
        if (buttonId == IDialogConstants.OK_ID) {
import org.jkiss.code.Nullable;
        lastSelectedTreeItem = null;
                            repopulateTree(userDefinedTiles.get(i), true);
                    }
            lastSelectedTreeItem = predefinedTilesRootItem;
    }
                }

                2,
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
                        userDefinedTiles.add(descriptor);
                        }
    private boolean isRootItem(Widget widget) {
        Composite group = UIUtils.createTitledComposite(composite, "", 2, GridData.FILL_BOTH);
                group,
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
                    log.error("User defined item hangs without its root");
                            log.error("Edited descriptor is null despite that user clicked ok");
        @NotNull
                        if (isModelContainsDescriptorWithLabel(descriptor.getLabel())) {
                    LeafletTilesDescriptor lastSelectedDescriptor = null;
        changeToolbarState(lastSelectedTreeItem);
        @Override
            gd.heightHint = UIUtils.getFontHeight(layersDefinitionText) * 15;
    private static void replace(@NotNull List<LeafletTilesDescriptor> list, @NotNull LeafletTilesDescriptor what, @NotNull LeafletTilesDescriptor with) {
                    lastSelectedTreeItem = item;

                item.setChecked(descriptor.isVisible());
                            list.set(i, newDescriptor);
            userDefinedTilesRootItem = new TreeItem(tree, SWT.NONE);
 * DBeaver - Universal Database Manager
        oldSelectedTileLayer = GeometryViewerRegistry.getInstance().getDefaultLeafletTiles();
                            repopulateTree(null, true);
                    originalTilesDescriptor == null || originalTilesDescriptor.isVisible()
                }
            if (tilesDescriptor.isPredefined()) {
                        }
                        log.error("Predefined item hangs without its root");
        @Nullable
    private final List<LeafletTilesDescriptor> predefinedTiles;
import org.jkiss.dbeaver.model.rm.RMConstants;
            layersDefinitionText = UIUtils.createLabelText(
                    return;
                            );

            layersDefinitionText.setLayoutData(gd);
                originalTilesDescriptor == null ? "" : originalTilesDescriptor.getLabel(),
 * limitations under the License.
                    expandUserDefined = item.getExpanded();
import org.jkiss.dbeaver.ui.UIUtils;
        predefinedTilesRootItem = null;
                        repopulateTree(editedDescriptor, true);
                item.setText(descriptor.getLabel());
                        LeafletTilesDescriptor originalDescriptor = (LeafletTilesDescriptor) lastSelectedTreeItem.getData();
                SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP | mutabilityStyle
                        }
                        }
import org.jkiss.dbeaver.Log;
                            currentSelectedTileLayer = null;
                if (GISMessages.panel_select_tiles_action_manage_dialog_predefined_tiles.equals(item.getText())) {
}
                originalTilesDescriptor == null ? "" : originalTilesDescriptor.getLayersDefinition(),
                            if (lastSelectedDescriptor != null && lastSelectedDescriptor.getId().equals(newDescriptor.getId())) {
            super(parentShell, getTitle(tilesDescriptor), null);
 *     http://www.apache.org/licenses/LICENSE-2.0

                        }
        }
                LeafletTilesDescriptor descriptor = (LeafletTilesDescriptor) item.getData();
        }
                        }
import org.eclipse.swt.widgets.*;



                    if (lastSelectedTreeItem != null && lastSelectedTreeItem.getData() instanceof LeafletTilesDescriptor) {
                GISMessages.panel_select_tiles_action_manage_dialog_toolbar_view_or_edit_tiles,
import org.eclipse.swt.events.SelectionEvent;
    @Override
                    public void widgetSelected(SelectionEvent e) {
