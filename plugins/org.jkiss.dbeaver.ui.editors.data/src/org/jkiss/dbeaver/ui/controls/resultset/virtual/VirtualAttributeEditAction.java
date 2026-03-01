 * you may not use this file except in compliance with the License.
        DBVEntityAttribute vAttr = ((DBDAttributeBindingCustom)attr).getEntityAttribute();
import org.eclipse.jface.action.Action;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private ResultSetViewer resultSetViewer;
 * limitations under the License.
        if (new EditVirtualAttributePage(resultSetViewer, vAttr).edit(resultSetViewer.getControl().getShell())) {
        super("Edit virtual column '" + attr.getName() + "'");
            vEntity.persistConfiguration();

 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
            resultSetViewer.refreshMetaData();
        DBVEntity vEntity = resultSetViewer.getModel().getVirtualEntity(false);
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
}

        }
    public void run() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    @Override
    }
    public VirtualAttributeEditAction(ResultSetViewer resultSetViewer, DBDAttributeBinding attr) {
        this.resultSetViewer = resultSetViewer;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    }
public class VirtualAttributeEditAction extends Action {
/*
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

 * See the License for the specific language governing permissions and
            return;
        }
 *
 *
        if (attr == null) {
        return (attr instanceof DBDAttributeBindingCustom);
 *

    public boolean isEnabled() {
    private DBDAttributeBinding attr;
        this.attr = attr;
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.data.DBDAttributeBindingCustom;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
