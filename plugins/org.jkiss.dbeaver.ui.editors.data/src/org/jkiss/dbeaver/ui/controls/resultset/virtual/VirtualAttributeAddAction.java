            if (vAttrConstr != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (new EditVirtualAttributePage(resultSetViewer, vAttr).edit(resultSetViewer.getControl().getShell())) {

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *
    private ResultSetViewer resultSetViewer;
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
            }

 */
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    }
 *
            vEntity.persistConfiguration();
        DBVEntityAttribute vAttr = new DBVEntityAttribute(vEntity, null, "vcolumn");
 * you may not use this file except in compliance with the License.
        super(ResultSetMessages.controls_resultset_virtual_add_virtual_column);
            DBDAttributeConstraint vAttrConstr = resultSetViewer.getModel().getDataFilter().getConstraint(vAttr, false);
 * DBeaver - Universal Database Manager
    public void run()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public VirtualAttributeAddAction(ResultSetViewer resultSetViewer) {
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;

            resultSetViewer.refreshMetaData();
 * Licensed under the Apache License, Version 2.0 (the "License");


 * See the License for the specific language governing permissions and
        this.resultSetViewer = resultSetViewer;
        DBVEntity vEntity = resultSetViewer.getModel().getVirtualEntity(false);
import org.eclipse.jface.action.Action;
}
            vAttr.setCustom(true);
import org.jkiss.dbeaver.model.virtual.DBVEntity;
 *

    @Override
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
            vEntity.addVirtualAttribute(vAttr);
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
public class VirtualAttributeAddAction extends Action {
