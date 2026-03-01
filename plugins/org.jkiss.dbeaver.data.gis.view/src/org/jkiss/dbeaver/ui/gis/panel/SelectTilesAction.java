 * DBeaver - Universal Database Manager

            });
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
import org.jkiss.dbeaver.ui.gis.registry.LeafletTilesDescriptor;

import org.eclipse.jface.action.IMenuCreator;
    }
    private final IGeometryValueEditor valueEditor;
import org.eclipse.jface.action.Separator;
                    });
import org.jkiss.dbeaver.ui.gis.registry.GeometryViewerRegistry;
 * you may not use this file except in compliance with the License.
class SelectTilesAction extends Action {
                            if (result == IDialogConstants.OK_ID) {
    private static String getActionText() {
import org.jkiss.dbeaver.ui.UIIcon;
                            int result = new TilesManagementDialog(valueEditor.getEditorControl().getShell()).open();

import org.jkiss.dbeaver.ui.DBeaverIcons;
        return descriptor.getLabel();
                    menuManager.add(new Action(GISMessages.panel_select_tiles_action_manage_tiles_action) {
        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.PICTURE));
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.gis.panel;
                Stream.concat(registry.getPredefinedLeafletTiles().stream(), registry.getUserDefinedLeafletTiles().stream())
        }

        });


        LeafletTilesDescriptor descriptor = GeometryViewerRegistry.getInstance().getDefaultLeafletTiles();
                }
            menuManager.addMenuListener(manager -> {
 * Unless required by applicable law or agreed to in writing, software
    @Override

        super(valueEditor.getValueSRID() == 0 ? GISMessages.panel_select_tiles_action_text_plain : getActionText(), Action.AS_DROP_DOWN_MENU);
            return menuManager;
    public boolean isEnabled() {
        this.valueEditor = valueEditor;
/*
        return valueEditor.getValueSRID() != 0;
 * limitations under the License.
                GeometryViewerRegistry registry = GeometryViewerRegistry.getInstance();
            return GISMessages.panel_select_tiles_action_no_tiles_selected;
import org.jkiss.dbeaver.model.rm.RMConstants;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (!menuManager.isEmpty()) {
                }
    }
    }
import org.eclipse.jface.dialogs.IDialogConstants;
                if (DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER)) {
        return new MenuCreator(control -> {
                if (!isEnabled()) {
                        @Override
 *
                        .filter(LeafletTilesDescriptor::isVisible)
}
import org.jkiss.dbeaver.ui.gis.IGeometryValueEditor;
 *
            menuManager.setRemoveAllWhenShown(true);
 */
                    return;
                        public void run() {
 * You may obtain a copy of the License at
    SelectTilesAction(IGeometryValueEditor valueEditor) {
                        }
                                valueEditor.refresh();
import org.eclipse.jface.action.MenuManager;
            MenuManager menuManager = new MenuManager();
                            }
    public IMenuCreator getMenuCreator() {
 *
import org.eclipse.jface.action.Action;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ui.MenuCreator;
    @Override
    }
        if (descriptor == null) {
                    menuManager.add(new Separator());
                        .forEach(tile -> menuManager.add(new SetTilesAction(valueEditor, tile)));
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.stream.Stream;
