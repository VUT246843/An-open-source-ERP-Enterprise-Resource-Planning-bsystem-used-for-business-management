	private class LoadLockDetailService extends DatabaseLoadService<Collection<DBAServerLockItem>> {
    }
    {
        {

        @Override




    }
    private static IStructuredContentProvider CONTENT_PROVIDER = new IStructuredContentProvider() {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.LoadingJob;
import org.eclipse.ui.IWorkbenchSite;
        public Collection<DBAServerLockItem> evaluate(@NotNull DBRProgressMonitor monitor)
    }
    }

        {
import java.util.List;
package org.jkiss.dbeaver.ui.editors.locks.table;
    {
    protected String getListConfigId(List<Class<?>> classList) {
	public LockTableDetail(Composite parent, int style, IWorkbenchSite site, DBAServerLockManager<DBAServerLock,DBAServerLockItem> lockManager)
    @Override
 * You may obtain a copy of the License at
import java.util.HashMap;
        super(parent, style, site, CONTENT_PROVIDER);
 * DBeaver - Universal Database Manager
    public DBAServerLockManager<DBAServerLock,DBAServerLockItem> getLockManager() {
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            super(String.format("Load lock details"), lockManager.getDataSource());
        public Object[] getElements(Object inputElement)
                        return lockManager.getLockItems(session, options);
 *

            throws InvocationTargetException, InterruptedException


    Map<String, Object> options = new HashMap<String, Object>(1); 
                }
 * Unless required by applicable law or agreed to in writing, software
		return options;
                    try (DBCSession session = isolatedContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Retrieve server lock detail")) {
 * limitations under the License.
            } catch (Throwable ex) {
import java.util.Map;
        return "LocksDetail/" + lockManager.getDataSource().getContainer().getDriver().getId();

        }
/**
        @Override
import org.eclipse.jface.viewers.Viewer;
        this.lockManager = lockManager;
        {
 * Licensed under the Apache License, Version 2.0 (the "License");

/*
        {
}
        @Override
            try {
        }
 *
import org.eclipse.swt.widgets.Composite;
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            new LoadLockDetailService(),

    protected LoadingJob<Collection<DBAServerLockItem>> createLoadService(boolean forUpdate)
        @Override
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
                throw new InvocationTargetException(ex);


 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    
    private DBAServerLockManager<DBAServerLock,DBAServerLockItem> lockManager;
public class LockTableDetail extends DatabaseObjectListControl<DBAServerLockItem> {
        }

import java.lang.reflect.InvocationTargetException;
            return null;
    }
    @Override

import org.eclipse.jface.viewers.IStructuredContentProvider;

import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
    {
        }
            new ObjectsLoadVisualizer());
        return LoadingJob.createService(
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
import java.util.Collection;
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

   
 *     http://www.apache.org/licenses/LICENSE-2.0
        return lockManager;
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
            if (inputElement instanceof Collection) {

import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
 * Lock detail table
 */
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
                return ((Collection<?>)inputElement).toArray();
      public void init(DBAServerLockManager<DBAServerLock,DBAServerLockItem> lockManager)
    };
    public Map<String, Object> getOptions() {
            }
 */
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                try (DBCExecutionContext isolatedContext = lockManager.getDataSource().getDefaultInstance().openIsolatedContext(monitor, "View Lock item", null)) {
        this.lockManager = lockManager;
            }
        {
        public void dispose()
	}

 * See the License for the specific language governing permissions and
        protected LoadLockDetailService()
