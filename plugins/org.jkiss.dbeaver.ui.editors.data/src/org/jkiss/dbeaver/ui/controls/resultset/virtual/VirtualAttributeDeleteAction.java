        if (!(attr instanceof DBDAttributeBindingCustom)) {
        DBVEntity vEntity = resultSetViewer.getModel().getVirtualEntity(false);
 * You may obtain a copy of the License at
import org.eclipse.jface.action.Action;
import org.jkiss.dbeaver.model.data.DBDAttributeBindingCustom;
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (!UIUtils.confirmAction(resultSetViewer.getControl().getShell(), "Delete column '" + vAttr.getName() + "'", "Are you sure you want to delete virtual column '" + vAttr.getName() + "'?")) {
    public void run() {
import org.jkiss.dbeaver.ui.UIUtils;
        resultSetViewer.refreshMetaData();
        vEntity.removeVirtualAttribute(vAttr);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    }
 * you may not use this file except in compliance with the License.
        vEntity.persistConfiguration();
}
    private ResultSetViewer resultSetViewer;

 * limitations under the License.
        }
            return;
public class VirtualAttributeDeleteAction extends Action {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
package org.jkiss.dbeaver.ui.controls.resultset.virtual;

        return (attr instanceof DBDAttributeBindingCustom);
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    @Override
 */
    private DBDAttributeBinding attr;
    public boolean isEnabled() {
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
 *
        this.attr = attr;
/*
    }
 *

    @Override
        DBVEntityAttribute vAttr = ((DBDAttributeBindingCustom)attr).getEntityAttribute();
    public VirtualAttributeDeleteAction(ResultSetViewer resultSetViewer, DBDAttributeBinding attr) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
            return;
        super("Delete virtual column '" + attr.getName() + "'");
 *
        this.resultSetViewer = resultSetViewer;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
