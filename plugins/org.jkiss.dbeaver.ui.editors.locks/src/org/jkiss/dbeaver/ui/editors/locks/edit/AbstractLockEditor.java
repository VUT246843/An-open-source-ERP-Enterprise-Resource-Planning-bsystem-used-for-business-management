    public LockManagerViewer getLockViewer() {
        super.dispose();

    }
/*
            lockViewer.refreshLocks(null);
import org.eclipse.swt.widgets.Composite;
            lockViewer = createLockViewer(executionContext, parent);

import org.jkiss.dbeaver.ui.editors.locks.manage.LockManagerViewer;



 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.locks.edit;
import org.eclipse.ui.IEditorInput;
 *
        lockViewer.refreshLocks(null);
 * DBeaver - Universal Database Manager
 */
    public void createEditorControl(Composite parent) {
            lockViewer.dispose();
    }
 *
    public void dispose() {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setFocus() {
        final DBCExecutionContext executionContext = getExecutionContext();
    }
    @Override

    private LockManagerViewer lockViewer;


    }
        }
    protected abstract LockManagerViewer createLockViewer(DBCExecutionContext executionContext, Composite parent);
import org.jkiss.dbeaver.ui.editors.locks.LocksUIMessages;
 * AbstractLockEditor for Lock View
/**
}
    @Override
import org.jkiss.dbeaver.ui.editors.SinglePageDatabaseEditor;
    public RefreshResult refreshPart(Object source, boolean force) {
        return lockViewer;

 * distributed under the License is distributed on an "AS IS" BASIS,
        return RefreshResult.REFRESHED;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

            setPartName(LocksUIMessages.create_editor_control_name_lock + executionContext.getDataSource().getContainer().getName());
        }
        if (lockViewer != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public abstract class AbstractLockEditor extends SinglePageDatabaseEditor<IEditorInput> {
    @Override
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
            lockViewer.getControl().setFocus();
 */
        if (executionContext != null) {
 * You may obtain a copy of the License at
    @Override
        if (lockViewer != null) {
    }
