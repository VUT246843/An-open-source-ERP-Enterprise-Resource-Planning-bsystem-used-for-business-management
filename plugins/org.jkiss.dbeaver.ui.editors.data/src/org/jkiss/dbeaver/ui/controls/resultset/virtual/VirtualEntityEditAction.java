        dialog.setInitPage(EditVirtualEntityDialog.InitPage.ATTRIBUTES);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        if (dataContainer == null) {
 *
public class VirtualEntityEditAction extends Action {
        super(ResultSetMessages.controls_resultset_virtual_edit_action);
    public void run()

import org.jkiss.dbeaver.model.struct.DBSEntity;
 * you may not use this file except in compliance with the License.
    {
 * DBeaver - Universal Database Manager
        DBVEntity vEntity = resultSetViewer.getModel().getVirtualEntity(entity, true);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

 * You may obtain a copy of the License at
}
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
    public VirtualEntityEditAction(ResultSetViewer resultSetViewer) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBSEntity entity = resultSetViewer.getModel().isSingleSource() ? resultSetViewer.getModel().getSingleSource() : null;
import org.eclipse.jface.action.Action;
        }

        }
/*
            return;
        if (dialog.open() == IDialogConstants.OK_ID) {
            resultSetViewer.refreshMetaData();
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        DBSDataContainer dataContainer = resultSetViewer.getDataContainer();
import org.jkiss.dbeaver.model.virtual.DBVEntity;

import org.eclipse.jface.dialogs.IDialogConstants;
        this.resultSetViewer = resultSetViewer;
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    private ResultSetViewer resultSetViewer;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
    @Override
        EditVirtualEntityDialog dialog = new EditVirtualEntityDialog(resultSetViewer, entity, vEntity);
