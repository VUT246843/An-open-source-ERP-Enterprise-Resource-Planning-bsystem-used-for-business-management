import org.jkiss.dbeaver.ui.ActionUtils;

            }
    }
import org.jkiss.dbeaver.Log;
        ToolBar bottomToolbar = new ToolBar(bottomPanel, SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
import org.eclipse.swt.layout.FillLayout;
    }
    }
        }
            if (column instanceof GisAttribute) {


    private static final Log log = Log.getLog(GISTextViewer.class);
/*

        updateToolBar();

        return textControl;
 */

 * you may not use this file except in compliance with the License.
        bottomPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    public GISTextViewer(IValueController controller) {
    }
        return geometry;
 * Edits value as string. Also manages SRID.

                ((Geometry) geometry).setSRID(valueSRID);

    private void updateToolBar() {
        CSSUtils.markConnectionTypeColor(composite);

        super(controller);
            }
        super.primeEditorValue(value);
import org.jkiss.dbeaver.model.exec.DBCException;
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.jface.action.ToolBarManager;
        if (valueSRID == 0) {
import org.jkiss.dbeaver.ui.css.CSSUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
        toolBarManager = new ToolBarManager(bottomToolbar);
    private int valueSRID;
    public void setValueSRID(int srid) {
    public Object extractEditorValue() throws DBCException {

/**
            this.valueSRID = ((DBGeometry) value).getSRID();

    public Control getEditorControl() {
 *

        toolBarManager.add(ActionUtils.makeActionContribution(new SelectCRSAction(this), true));
import org.jkiss.dbeaver.ui.gis.IGeometryViewer;
import org.jkiss.dbeaver.model.gis.DBGeometry;
        valueSRID = 0;
        try {
    public void refresh() {
            this.valueSRID = ((Geometry) value).getSRID();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.gis.GisAttribute;
        Composite composite = UIUtils.createPlaceholder(editPlaceholder, 1);

import org.jkiss.dbeaver.ui.data.IValueController;
            valueController.updateValue(geometry, false);
            DBSTypedObject column = valueController.getValueType();
 *
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
    protected Control createControl(Composite editPlaceholder) {
        super.contributeActions(manager, controller);
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.action.IContributionManager;
    public void primeEditorValue(Object value) throws DBException {
    }
        controlPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ui.gis.IGeometryValueEditor;
import org.jkiss.dbeaver.DBException;
        return getControl();
 * You may obtain a copy of the License at


 * DBeaver - Universal Database Manager
    @Override

        } else if (value instanceof DBGeometry) {

*/
    @Override
    }

        Composite bottomPanel = UIUtils.createPlaceholder(composite, 1);//new Composite(composite, SWT.NONE);
 *
            if (geometry instanceof DBGeometry) {
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
import org.jkiss.code.NotNull;
 * GISTextViewer.
 * limitations under the License.
        return valueSRID;
    }
    @Override
package org.jkiss.dbeaver.ui.gis.panel;
                ((DBGeometry) geometry).setSRID(valueSRID);
                valueSRID = ((GisAttribute) column).getAttributeGeometrySRID(new VoidProgressMonitor());
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.UIUtils;
        toolBarManager.removeAll();
import org.locationtech.jts.geom.Geometry;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        toolBarManager.update(true);
import org.eclipse.swt.widgets.ToolBar;
    private ToolBarManager toolBarManager;
        Composite controlPanel = UIUtils.createPlaceholder(composite, 1);
        if (value instanceof Geometry) {

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    @Override

        Object geometry = super.extractEditorValue();
        }
        CSSUtils.markConnectionTypeColor(bottomPanel);
        controlPanel.setLayout(new FillLayout());
        this.valueSRID = srid;
    @Override

}
        }

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
public class GISTextViewer extends StringInlineEditor implements IGeometryViewer, IGeometryValueEditor {
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
        updateToolBar();
import org.eclipse.swt.widgets.Control;
    }
            } else if (geometry instanceof Geometry) {
        Control textControl = super.createControl(controlPanel);
    public int getValueSRID() {
            Object geometry = extractEditorValue();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

    @Override

    }

        } catch (DBCException e) {
            log.error(e);
