    public GISBrowserViewer(IValueController controller) {
        if (valueController.getDataController() instanceof IResultSetController) {


        List<DBGeometry> geometries = new ArrayList<>();
            presentation
        // We can prevent this error by delaying dispose in independent thread operation to allow Edge to finish its
                    row = selection.getElementRow(cell);
            final ResultSetModel model = resultSetController.getModel();
 * Unless required by applicable law or agreed to in writing, software
        //FIXME That should be removed as soon as Edge will be fixed, this is an awfull hack
                    while (leafletViewer.isBrowserCreating()) {
                            }
 * See the License for the specific language governing permissions and
            final List<DBDAttributeBinding> leaves = model.getVisibleLeafAttributes();
 * you may not use this file except in compliance with the License.
                }

 *     http://www.apache.org/licenses/LICENSE-2.0
    public Object extractEditorValue() throws DBCException {
        return true;
                DBGeometry geometry;
                        try {
        // Edge uses callbacks which have a lowest priority in UI
                        valueController.getDataController().getDataContainer(),

                }
    }
import org.eclipse.core.runtime.IProgressMonitor;
 *
                    return Status.OK_STATUS;
            }.schedule();

                    if (valueType instanceof DBSAttributeBase) {
    private GISLeafletViewer leafletViewer;


                if (geometry != null) {
                geomAttrs = GeometryDataUtils.extractGeometryAttributes(resultSetController);
import org.jkiss.dbeaver.ui.controls.resultset.*;
                    }
import org.jkiss.dbeaver.ui.data.IAttributeController;
    }
                    attr = resultSetController.getActivePresentation().getCurrentAttribute();
                selectedValues = new Object[] { value };
import org.eclipse.core.runtime.IStatus;
import java.util.List;
                        cellValue);
        // initialization to be disposed properly
    @Override
            }
public class GISBrowserViewer extends BaseValueEditor<Browser> implements IGeometryViewer {
            IResultSetController resultSetController = (IResultSetController) dataController;
import org.eclipse.swt.widgets.Composite;
            new DBDAttributeBinding[]{((IAttributeController) valueController).getBinding()},
import org.jkiss.dbeaver.model.gis.GisTransformUtils;
            presentation = ((IResultSetController) valueController.getDataController()).getActivePresentation();

    }
    protected Browser createControl(Composite editPlaceholder)

                    geometries.add(geometry);
import org.jkiss.dbeaver.ui.UIUtils;
    
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.eclipse.swt.browser.Browser;
            if (ArrayUtils.isEmpty(selectedValues)) {
 * limitations under the License.
/*
        // on already disposed composite, we don't want this at all
 *
        }
            super.dispose();
                            final GeometryDataUtils.GeomAttrs ga = geomAttrs.get(i);
    @Override
            GisTransformUtils.getSpatialDataProvider(valueController.getExecutionContext().getDataSource()),
    @Override
                        for (int i = 0; i < geomAttrs.size(); i++) {
                protected IStatus run(IProgressMonitor monitor) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

import org.jkiss.dbeaver.ui.data.IValueController;


        final IResultSetPresentation presentation;
                    Object cellValue = model.getCellValue(attr, row);
                        }
        leafletViewer = new GISLeafletViewer(
            return null;
                    }

                if (cell instanceof DBGeometry) {
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
                            break;
import org.jkiss.dbeaver.model.gis.DBGeometry;
}
import org.jkiss.dbeaver.ui.gis.IGeometryViewer;

                    // Set properties
import org.jkiss.dbeaver.ui.gis.GeometryDataUtils;
            List<GeometryDataUtils.GeomAttrs> geomAttrs = null;
    public boolean isReadOnly() {
            new Job("Disposing browser") {
                        valueController.getValueHandler(),
        if (leafletViewer.getBrowser() != null) {
    }
import org.jkiss.code.Nullable;
                    attr = selection.getElementAttribute(cell);
        } else {
    public void dispose() {
                        }
import org.jkiss.dbeaver.ui.data.editors.BaseValueEditor;
                    if (row != null && attr != null) {
            }
            editPlaceholder,

        if (leafletViewer == null) {
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
                        if (leaf >= 0) {
    @Override
        // So if dispose is sent during that operation this will lead to initialization
                    geometry = (DBGeometry) cell;
                        }
import org.jkiss.dbeaver.DBException;
                DBDAttributeBinding attr;
                }
                            geometry.putProperties(Map.of("location", leaf + ":" + row.getRowNumber()));
        return leafletViewer.getBrowser();
                                break;

import org.jkiss.dbeaver.model.exec.DBCException;
            return;
                        valueController.getValueType(),
            presentation = null;
                    UIUtils.syncExec(GISBrowserViewer.super::dispose);
            if (valueType instanceof DBSAttributeBase) {
            }
 */
        leafletViewer.setGeometryData(geometries.toArray(new DBGeometry[0]));
    }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    @Override
        if (dataController instanceof IResultSetController) {
    private static final Log log = Log.getLog(GISBrowserViewer.class);
        IDataController dataController = valueController.getDataController();
                    row = resultSetController.getCurrentRow();
 * You may obtain a copy of the License at
import java.util.Map;
import java.util.ArrayList;
package org.jkiss.dbeaver.ui.gis.panel;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                @Override
        if (leafletViewer == null) {
                    geometry = GisTransformUtils.getGeometryValueFromObject(
                        } catch (InterruptedException ex) {

            for (Object cell : selectedValues) {
import org.jkiss.dbeaver.Log;
                            if (ga.geomAttr.matches(attr, false)) {
        } else {
                    }
    @Nullable
import org.eclipse.core.runtime.jobs.Job;
import org.jkiss.dbeaver.ui.data.IDataController;
 *
import org.eclipse.core.runtime.Status;

 * DBeaver - Universal Database Manager
                            Thread.sleep(50);
            IResultSetSelection selection = resultSetController.getSelection();

                        final int leaf = leaves.indexOf(attr);
        }
                                GeometryDataUtils.setGeometryProperties(resultSetController, ga, geometry, i, row);
        super(controller);
                ResultSetRow row;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
            DBSTypedObject valueType = valueController.getValueType();

    {
        );
        return leafletViewer.getCurrentValue();
import org.jkiss.utils.ArrayUtils;
    public void primeEditorValue(@Nullable Object value) throws DBException
                } else {
            Object[] selectedValues = selection.toArray();
