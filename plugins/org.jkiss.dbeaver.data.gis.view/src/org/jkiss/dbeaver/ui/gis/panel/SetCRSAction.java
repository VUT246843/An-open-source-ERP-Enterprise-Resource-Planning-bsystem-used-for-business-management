}
    public SetCRSAction(IGeometryValueEditor valueEditor, int srid) {
        return srid == valueEditor.getValueSRID();
        this.srid = srid;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager

    @Override
    }
    public boolean isChecked() {
 *
import org.jkiss.dbeaver.ui.gis.IGeometryValueEditor;
 * Unless required by applicable law or agreed to in writing, software
 *
import org.eclipse.jface.action.Action;

 * See the License for the specific language governing permissions and
    }
class SetCRSAction extends Action {
 *
package org.jkiss.dbeaver.ui.gis.panel;
    }
 * limitations under the License.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(srid == GisConstants.SRID_SIMPLE ? GISMessages.panel_set_crs_action_text_simple : "EPSG:" + srid, AS_CHECK_BOX);
        valueEditor.setValueSRID(srid);
        this.valueEditor = valueEditor;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,

    private final int srid;
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
    private final IGeometryValueEditor valueEditor;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.gis.GisConstants;
/*

    public void run() {
 */
