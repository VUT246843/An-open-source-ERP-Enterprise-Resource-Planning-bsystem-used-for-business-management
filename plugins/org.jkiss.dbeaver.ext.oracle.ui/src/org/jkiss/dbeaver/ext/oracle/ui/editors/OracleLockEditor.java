    protected LockManagerViewer createLockViewer(DBCExecutionContext executionContext, Composite parent) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                super.onLockSelect(lock);
    @Override

 * DBeaver - Universal Database Manager
import org.eclipse.swt.widgets.Composite;

            protected void onLockSelect(final DBAServerLock lock) {
 *
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
import org.jkiss.dbeaver.ext.oracle.model.lock.OracleLock;
import org.jkiss.dbeaver.ui.editors.locks.edit.AbstractLockEditor;
            @Override

        return new LockManagerViewer(this, parent, lockManager) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            @Override
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.locks.manage.LockManagerViewer;
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
                    }});

/*
 * limitations under the License.
    }
 * Unless required by applicable law or agreed to in writing, software
 *
                }
import org.eclipse.jface.action.Separator;
                        put(OracleLockManager.sidHold, pLock.getHold_sid());
            protected void contributeToToolbar(DBAServerLockManager<DBAServerLock, DBAServerLockItem> sessionManager, IContributionManager contributionManager) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        put(OracleLockManager.sidWait, pLock.getWait_sid());
            }
public class OracleLockEditor extends AbstractLockEditor {
 * See the License for the specific language governing permissions and
 *
import java.util.HashMap;
 * Licensed under the Apache License, Version 2.0 (the "License");


 * you may not use this file except in compliance with the License.
                if (lock != null) {
                    final OracleLock pLock = (OracleLock) lock;

import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
                contributionManager.add(new Separator());
import org.eclipse.jface.action.IContributionManager;
            }
 */
 * You may obtain a copy of the License at
                    super.refreshDetail(new HashMap<String, Object>() {{
import org.jkiss.dbeaver.ext.oracle.model.lock.OracleLockManager;
}
        DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager = (DBAServerLockManager) new OracleLockManager((OracleDataSource) executionContext.getDataSource());

package org.jkiss.dbeaver.ext.oracle.ui.editors;
        };
