            DBWorkbench.getPlatformUI().showWarningMessageBox(

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    }
                    controller.getDataContainer(),
 * limitations under the License.
        for (int i = 0; i < result.size(); i++) {
    public Map<Transfer, Object> copySelection(ResultSetCopySettings settings) {

        leafletViewer = new GISLeafletViewer(

import java.util.List;
    @NotNull
    @Override

import org.eclipse.swt.dnd.Transfer;
import org.jkiss.dbeaver.DBException;
    private static final Log log = Log.getLog(GeometryPresentation.class);
    @Override
                }
            .map(GeometryDataUtils.GeomAttrs::getGeomAttr)



import org.jkiss.dbeaver.ui.gis.panel.GISLeafletViewer;
        super.scrollToRow(position);
                    value);
        return leafletViewer.getBrowser();
    ///////////////////////////////////////////////////////////////////////
        return Collections.emptyMap();

    }
    public Composite getControl() {
 * Licensed under the Apache License, Version 2.0 (the "License");
                GISMessages.presentation_no_spatial_columns_message
                    geomAttrs.geomAttr,
    }
            parent,
    public void scrollToRow(@NotNull RowPosition position) {



    protected void applyThemeSettings(ITheme currentTheme) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

            );
    @Override
    public void refreshData(boolean refreshMetadata, boolean append, boolean keepState) {
}
    private GISLeafletViewer leafletViewer;
        final DBDAttributeBinding[] bindings = GeometryDataUtils.extractGeometryAttributes(getController()).stream()

        return controller.getModel().getDocumentAttribute();
    @Override
    }
/*

import org.jkiss.dbeaver.model.gis.DBGeometry;
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
 *     http://www.apache.org/licenses/LICENSE-2.0
                DBGeometry geometry = GisTransformUtils.getGeometryValueFromObject(
                    GeometryDataUtils.setGeometryProperties(getController(), geomAttrs, geometry, i, row);
public class GeometryPresentation extends AbstractPresentation {
 *
    public void changeMode(boolean recordMode) {

import org.eclipse.jface.viewers.StructuredSelection;
        leafletViewer.getBrowserComposite().setLayoutData(new GridData(GridData.FILL_BOTH));
            GeometryDataUtils.GeomAttrs geomAttrs = result.get(i);
    @Override
    public void createPresentation(@NotNull final IResultSetController controller, @NotNull Composite parent) {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        super.createPresentation(controller, parent);
    }
 */
                GISMessages.presentation_no_spatial_columns_title,

    @Override
        }
import org.eclipse.jface.viewers.ISelection;
import org.jkiss.dbeaver.ui.gis.GeometryDataUtils;

        List<GeometryDataUtils.GeomAttrs> result = GeometryDataUtils.extractGeometryAttributes(getController());

            DBWorkbench.getPlatformUI().showError("Error rendering GIS data", "Error while rendering geometry data", e);

    }
import java.util.Collections;
    }
    @Override

        }
                    geomAttrs.geomAttr.getValueHandler(),
        List<DBGeometry> geometries = new ArrayList<>();

    @Override
package org.jkiss.dbeaver.ui.gis.presentation;
    @Override
        return true;


    @Override
import java.util.ArrayList;
        }
    }
import org.jkiss.dbeaver.model.gis.GisTransformUtils;
    }


        return new StructuredSelection();
        } catch (DBException e) {

            GisTransformUtils.getSpatialDataProvider(controller.getDataContainer().getDataSource()),
            bindings,
        ResultSetModel model = getController().getModel();
    }
 * Geometry presentation.
    @Override
/**
    @Nullable
            for (ResultSetRow row : model.getAllRows()) {

 * See the License for the specific language governing permissions and
                if (geometry != null && !(geometry.getSRID() != 0 && geometry.isEmpty())) {
    public void setSelection(ISelection selection) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            .toArray(DBDAttributeBinding[]::new);
    public DBDAttributeBinding getCurrentAttribute() {


                    geometries.add(geometry);
import org.jkiss.dbeaver.ui.controls.resultset.*;
import org.jkiss.code.NotNull;


            leafletViewer.setGeometryData(geometries.toArray(new DBGeometry[0]));
    }
 *
    public boolean canShowPresentation(@NotNull IResultSetController controller) {
            this
        if (GeometryDataUtils.extractGeometryAttributes(controller).isEmpty()) {
import org.eclipse.ui.themes.ITheme;
                Object value = model.getCellValue(geomAttrs.geomAttr, row);
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
    public void formatData(boolean refreshData) {
    public void clearMetaData() {
        );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
import org.eclipse.swt.widgets.Composite;
    public void updateValueView() {
    public ISelection getSelection() {
    @Override
        controller.updateEditControls();
    }
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * You may obtain a copy of the License at
 */
            return false;
        try {
import org.eclipse.swt.layout.GridData;


import java.util.Map;
    // ISelectionProvider
import org.jkiss.dbeaver.Log;
    }
            }
        // Now extract all geom values from data
    @Override
