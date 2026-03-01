            resultSetViewer.editEntityIdentifier();
            resultSetViewer.clearEntityIdentifier();
 * you may not use this file except in compliance with the License.
    private boolean define;
 * limitations under the License.
    }
        resultSetViewer.getActivePresentation().refreshData(false, false, true);
 * DBeaver - Universal Database Manager
/*
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.define = define;
        DBVEntityConstraint vConstraint = vEntity == null ? null : vEntity.getBestIdentifier();
        if (define) {
    }

        return vConstraint != null && (define != vConstraint.hasAttributes());
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    private ResultSetViewer resultSetViewer;
    @Override

}
 *
    public VirtualUniqueKeyEditAction(ResultSetViewer resultSetViewer, boolean define)
 * Unless required by applicable law or agreed to in writing, software
 */

        super(define ? ResultSetMessages.controls_resultset_virtual_define_virtual_unique_key
 * You may obtain a copy of the License at
    public boolean isEnabled()
package org.jkiss.dbeaver.ui.controls.resultset.virtual;
            : ResultSetMessages.controls_resultset_virtual_clear_virtual_unique_key);
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;
        this.resultSetViewer = resultSetViewer;
        DBVEntity vEntity = resultSetViewer.getModel().getVirtualEntity(false);
    {
import org.jkiss.dbeaver.model.virtual.DBVEntity;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public void run()
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import org.eclipse.jface.action.Action;
public class VirtualUniqueKeyEditAction extends Action {
    @Override
        } else {
