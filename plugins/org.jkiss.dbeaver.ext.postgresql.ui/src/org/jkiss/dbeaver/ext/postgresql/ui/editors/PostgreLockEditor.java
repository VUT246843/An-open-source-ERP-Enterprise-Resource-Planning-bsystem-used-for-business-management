
            @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * DBeaver - Universal Database Manager
            @Override
import org.eclipse.jface.action.IContributionManager;

import org.jkiss.dbeaver.ext.postgresql.model.lock.PostgreLockManager;
            protected void contributeToToolbar(DBAServerLockManager<DBAServerLock, DBAServerLockItem> sessionManager, IContributionManager contributionManager) {

    }
        };
                }
 * you may not use this file except in compliance with the License.
            protected void onLockSelect(final DBAServerLock lock) {
                contributionManager.add(new Separator());
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
 *
/*
import org.jkiss.dbeaver.ext.postgresql.model.lock.PostgreLock;
            }
                        put(PostgreLockManager.pidHold, pLock.getHold_pid());
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.HashMap;
 * limitations under the License.
 * You may obtain a copy of the License at
        DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager = (DBAServerLockManager) new PostgreLockManager((PostgreDataSource) executionContext.getDataSource());

                super.onLockSelect(lock);
 */
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others

                    final PostgreLock pLock = (PostgreLock) lock;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    super.refreshDetail(new HashMap<>() {{

import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.ui.editors.locks.manage.LockManagerViewer;
 * See the License for the specific language governing permissions and

                    }});

import org.jkiss.dbeaver.ui.editors.locks.edit.AbstractLockEditor;

                        put(PostgreLockManager.pidWait, pLock.getWait_pid());
 *     http://www.apache.org/licenses/LICENSE-2.0
        return new LockManagerViewer(this, parent, lockManager) {

    @Override
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
import org.eclipse.swt.widgets.Composite;
public class PostgreLockEditor extends AbstractLockEditor {
    @SuppressWarnings("unchecked")
package org.jkiss.dbeaver.ext.postgresql.ui.editors;
 *
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
                if (lock != null) {
}
            }
    protected LockManagerViewer createLockViewer(DBCExecutionContext executionContext, Composite parent) {

