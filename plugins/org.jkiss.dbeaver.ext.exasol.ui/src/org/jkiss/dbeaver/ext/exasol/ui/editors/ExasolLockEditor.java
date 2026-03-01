}
 * distributed under the License is distributed on an "AS IS" BASIS,
        DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager = (DBAServerLockManager) new ExasolLockManager((ExasolDataSource) executionContext.getDataSource());

    public static final String sidHold = "hsid";

 * limitations under the License.
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
/*
 * See the License for the specific language governing permissions and

    @SuppressWarnings("unchecked")


        };
                super.onLockSelect(lock);

import org.jkiss.dbeaver.ext.exasol.model.lock.ExasolLock;
            @Override
import org.jkiss.dbeaver.ui.editors.locks.edit.AbstractLockEditor;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        @SuppressWarnings("rawtypes")
                    super.refreshDetail(new HashMap<String, Object>() {{
                }
 *
 * You may obtain a copy of the License at
import java.util.HashMap;
package org.jkiss.dbeaver.ext.exasol.ui.editors;
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
    protected LockManagerViewer createLockViewer(
                contributionManager.add(new Separator());
        DBCExecutionContext executionContext, Composite parent) {
 *
 * DBeaver - Universal Database Manager
public class ExasolLockEditor extends AbstractLockEditor {
import org.jkiss.dbeaver.ui.editors.locks.manage.LockManagerViewer;
            @SuppressWarnings("serial")

            }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
                    }});
import org.jkiss.dbeaver.ext.exasol.model.lock.ExasolLockManager;
                        put(sidWait, BigInteger.valueOf(pLock.getWait_sid().longValue()));
            }
        return new LockManagerViewer(this, parent, lockManager) {
            @Override
                    final ExasolLock pLock = (ExasolLock) lock;
import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
            protected void onLockSelect(final DBAServerLock lock) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Composite;
    public static final String sidWait = "wsid";
 */
    @Override
                        put(sidHold, BigInteger.valueOf(pLock.getHold_sid()));

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                if (lock != null) {
            protected void contributeToToolbar(DBAServerLockManager<DBAServerLock, DBAServerLockItem> sessionManager, IContributionManager contributionManager) {
 *

import java.math.BigInteger;
import org.eclipse.jface.action.IContributionManager;
