import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
    private class KillSessionByLockService extends DatabaseLoadService<Void> {
    @NotNull
    };
                try (DBCExecutionContext isolatedContext = lockManager.getDataSource().getDefaultInstance().openIsolatedContext(monitor, "View Locks", null)) {
    protected String getListConfigId(List<Class<?>> classList) {
    public void init(DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager)
        private final DBAServerLock lock;
        @Override
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
 *
        return LoadingJob.createService(
    public DBAServerLockManager<DBAServerLock,DBAServerLockItem> getLockManager() {
 * Unless required by applicable law or agreed to in writing, software
    public LockTable(Composite parent, int style, IWorkbenchSite site, DBAServerLockManager<DBAServerLock,DBAServerLockItem> lockManager)
                    try (DBCSession session = isolatedContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Kill server session by lock")) {
public class LockTable extends DatabaseObjectListControl<DBAServerLock> {
    {
 * DBeaver - Universal Database Manager


                }
import java.util.Collection;
            } catch (Throwable ex) {
    }
            super("Load locks", lockManager.getDataSource());
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
import org.jkiss.dbeaver.ui.LoadingJob;
            try {
                    }
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
import org.eclipse.jface.viewers.IStructuredContentProvider;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        protected KillSessionByLockService(DBAServerLock lock, Map<String, Object> options)
            return new Object[0];
/**
 *
        {
            new KillSessionByLockService(lock, options),
            } catch (Throwable ex) {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            new LoadLocksService(),
            return null;
import org.eclipse.jface.viewers.Viewer;
        super(parent, style, site, CONTENT_PROVIDER);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
        return "Locks/" + lockManager.getDataSource().getContainer().getDriver().getId();
package org.jkiss.dbeaver.ui.editors.locks.table;

 * Session table
        }



 * You may obtain a copy of the License at
 * limitations under the License.
        public Collection<DBAServerLock> evaluate(@NotNull DBRProgressMonitor monitor)
 * See the License for the specific language governing permissions and
                }
    @Override
        private final Map<String, Object> options;
        public Void evaluate(@NotNull DBRProgressMonitor monitor)
            }
    }
        public void dispose()
import java.lang.reflect.InvocationTargetException;
            this.lock = lock;
}
                    		lockManager.alterSession(session, this.lock, options);	                       
    public LoadingJob<Void> createAlterService(DBAServerLock lock, Map<String, Object> options)
import org.eclipse.swt.widgets.Composite;
    protected int getDataLoadTimeout() {
            }
    {
                        return null;
    }
                return ((Collection<?>)inputElement).toArray();
        return lockManager;
            throws InvocationTargetException, InterruptedException
        }

        return LoadingJob.createService(

        }
        @Override
import java.util.Map;
 */
    protected LoadingJob<Collection<DBAServerLock>> createLoadService(boolean forUpdate)
 * Copyright (C) 2010-2025 DBeaver Corp and others
                try (DBCExecutionContext isolatedContext = lockManager.getDataSource().getDefaultInstance().openIsolatedContext(monitor, "View locks", null)) {
    }
            }
    }
        public Object[] getElements(Object inputElement)

        }
        @Override
        {
import java.util.List;
        public boolean hasChildren(Object element) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Override
            throws InvocationTargetException, InterruptedException
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
        return 20000;

                    }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
                throw new InvocationTargetException(ex);
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
import org.jkiss.dbeaver.model.exec.DBCSession;
    private class LoadLocksService extends DatabaseLoadService<Collection<DBAServerLock>> {
    {
    }
/*

        {
        this.lockManager = lockManager;
import org.jkiss.code.NotNull;
        {
        public Object[] getChildren(Object parentElement) {

    }
    private static IStructuredContentProvider CONTENT_PROVIDER = new TreeContentProvider() { // Use Tree provider for the grouping elements support in ObjectListControl
            new ObjectsLoadVisualizer());
                throw new InvocationTargetException(ex);
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        }
        {
            new ObjectActionVisualizer());

            this.options = options;
    }

        @Override
                        return lockManager.getLocks(session, null).values();

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        {
            return false;
            super("Kill session by lock", lockManager.getDataSource());

            if (inputElement instanceof Collection) {
        }

            try {
import org.eclipse.ui.IWorkbenchSite;
                    try (DBCSession session = isolatedContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Retrieve server locks")) {

        }
        protected LoadLocksService()
    @Override
        @Override
        this.lockManager = lockManager;
        }

        {
    private DBAServerLockManager<DBAServerLock,DBAServerLockItem> lockManager;


 */
    }

        @Override



        }
