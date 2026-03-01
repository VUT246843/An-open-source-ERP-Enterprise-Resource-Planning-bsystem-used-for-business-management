        }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            resultSetViewer.refreshMetaData();
    public VirtualForeignKeyEditAction(ResultSetViewer resultSetViewer) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
public class VirtualForeignKeyEditAction extends Action {
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
}
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        this.resultSetViewer = resultSetViewer;
/*

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
 * limitations under the License.
        super(ResultSetMessages.controls_resultset_virtual_add_virtual_foreign_key);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (EditForeignKeyPage.createVirtualForeignKey(resultSetViewer.getModel().getVirtualEntity(true)) != null) {
            resultSetViewer.persistConfig();

import org.eclipse.jface.action.Action;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
 *
 * Unless required by applicable law or agreed to in writing, software
    @Override
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * You may obtain a copy of the License at

    public void run()


    private ResultSetViewer resultSetViewer;
