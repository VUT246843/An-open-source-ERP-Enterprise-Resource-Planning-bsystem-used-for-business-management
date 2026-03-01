                    menuManager.add(new Separator());
                    public void run() {
                    UIUtils.getActiveWorkbenchShell(),
                menuManager.add(new SetCRSAction(valueEditor, GisConstants.SRID_SIMPLE));
import org.eclipse.jface.dialogs.IDialogConstants;
        super(valueEditor.getValueSRID() == GisConstants.SRID_SIMPLE ? GisConstants.LL_CRS_SIMPLE : "EPSG:" + valueEditor.getValueSRID(), Action.AS_DROP_DOWN_MENU);
}
            return menuManager;
    }
import java.util.List;
            SelectSRIDDialog manageCRSDialog = new SelectSRIDDialog(
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @Override
            });
class SelectCRSAction extends Action {
 */
        return new MenuCreator(control -> {
                menuManager.add(new Separator());

 *
import org.jkiss.dbeaver.ui.UIIcon;
                    public void run() {
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                menuManager.add(new Action(GISMessages.panel_select_crs_action_menu_manager_other) {
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
            DBWorkbench.getPlatformUI().showWarningMessageBox("Warning", "Can't change coordinate reference system because geometries have different SRID.");
        }
                        SelectCRSAction.this.run();
        } else {
 * You may obtain a copy of the License at
                menuManager.add(new SetCRSAction(valueEditor, GisConstants.SRID_3395));
 * Unless required by applicable law or agreed to in writing, software
import java.util.Arrays;
    SelectCRSAction(IGeometryValueEditor valueEditor) {
 * limitations under the License.

    }

                });

import org.eclipse.jface.action.Separator;
                    }
    public IMenuCreator getMenuCreator() {
                        UIUtils.showPreferencesFor(null, null, PrefPageGIS.PAGE_ID);
        setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.CHART_LINE));
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.action.IMenuCreator;
import org.jkiss.dbeaver.ui.MenuCreator;
 * See the License for the specific language governing permissions and
        this.valueEditor = valueEditor;
                    valueEditor.getValueSRID());

    public void run() {
                    @Override
                });
            menuManager.setRemoveAllWhenShown(true);
            if (manageCRSDialog.open() == IDialogConstants.OK_ID) {
                List<Integer> recentSRIDs = GISEditorUtils.getRecentSRIDs();

        if (valueEditor instanceof GISLeafletViewer &&
                valueEditor.setValueSRID(manageCRSDialog.getSelectedSRID());
                Arrays.stream(((GISLeafletViewer) valueEditor).getCurrentValue()).map(DBGeometry::getSRID).distinct().count() > 1) {
import org.jkiss.dbeaver.model.gis.DBGeometry;
package org.jkiss.dbeaver.ui.gis.panel;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.jface.action.MenuManager;
                if (!recentSRIDs.isEmpty()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            MenuManager menuManager = new MenuManager();
/*
    private IGeometryValueEditor valueEditor;
import org.jkiss.dbeaver.model.gis.GisConstants;
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
 *
 *
                    @Override
                    for (Integer recentSRID : recentSRIDs) {
                }
import org.jkiss.dbeaver.ui.gis.IGeometryValueEditor;
                menuManager.add(new Action(GISMessages.panel_select_crs_action_menu_manager_config) {
            }
                menuManager.add(new SetCRSAction(valueEditor, GisConstants.SRID_3857));
        });
import org.jkiss.dbeaver.ui.gis.preferences.PrefPageGIS;
import org.eclipse.jface.action.Action;
 * Licensed under the Apache License, Version 2.0 (the "License");
                menuManager.add(new SetCRSAction(valueEditor, GisConstants.SRID_4326));
                        menuManager.add(new SetCRSAction(valueEditor, recentSRID));
            menuManager.addMenuListener(manager -> {
                    }
 * DBeaver - Universal Database Manager
    }
