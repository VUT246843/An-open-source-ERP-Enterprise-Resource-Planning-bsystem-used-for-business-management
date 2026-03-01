 *
/*

 * See the License for the specific language governing permissions and
                if (lock != null) {
 * Unless required by applicable law or agreed to in writing, software
        return new LockManagerViewer(this, parent, lockManager) {
            }
                super.onLockSelect(lock);
                contributionManager.add(new Separator());
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;

    protected LockManagerViewer createLockViewer(DBCExecutionContext executionContext, Composite parent) {
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ext.altibase.model.lock.AltibaseLockManager;
            @Override
import java.util.HashMap;
            protected void onLockSelect(final DBAServerLock lock) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.locks.manage.LockManagerViewer;
import org.jkiss.dbeaver.ui.editors.locks.edit.AbstractLockEditor;
import org.eclipse.jface.action.Separator;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 * limitations under the License.
                }
                (DBAServerLockManager) new AltibaseLockManager((AltibaseDataSource) executionContext.getDataSource());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.action.IContributionManager;


    }
package org.jkiss.dbeaver.ext.altibase.ui.editors;

                            put(AltibaseLockManager.sidWait, pLock.getWait_sid()); 
        DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager = 
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;
                        }
            protected void contributeToToolbar(DBAServerLockManager<DBAServerLock, 
                    });
            @Override
            }
                    DBAServerLockItem> sessionManager, IContributionManager contributionManager) {
 */
public class AltibaseLockEditor extends AbstractLockEditor {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.altibase.model.lock.AltibaseLock;
    @Override
 *
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Composite;
 * you may not use this file except in compliance with the License.
        };
                    super.refreshDetail(new HashMap<String, Object>() {{
}                            put(AltibaseLockManager.sidHold, pLock.getHold_sid());
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
                    final AltibaseLock pLock = (AltibaseLock) lock;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
