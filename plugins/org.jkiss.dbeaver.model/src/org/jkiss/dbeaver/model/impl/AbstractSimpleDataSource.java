
    }
    @NotNull

    public void shutdown(@NotNull DBRProgressMonitor monitor) {
        allContexts.remove(context);

        return allContexts.toArray(new DBCExecutionContext[0]);
public abstract class AbstractSimpleDataSource<EXEC_CONTEXT extends DBCExecutionContext>
import java.util.List;
    public abstract EXEC_CONTEXT openIsolatedContext(@NotNull DBRProgressMonitor monitor, @NotNull String purpose, @Nullable DBCExecutionContext initFrom) throws DBException;


        super(container);
    public DBPExclusiveResource getExclusiveLock() {
 * Data source which contains of single instance
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } finally {
        Object lock = this.exclusiveLock.acquireExclusiveLock();

/*
        return executionContext;
        return Collections.singletonList(this);
    private final DBPExclusiveResource exclusiveLock = new SimpleExclusiveLock();
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    @NotNull
    @Override
        return this;
    private static final Log log = Log.getLog(AbstractSimpleDataSource.class);
    @Override
    @Override
    protected List<EXEC_CONTEXT> allContexts = new ArrayList<>();
 * See the License for the specific language governing permissions and
 *
import org.jkiss.dbeaver.model.struct.DBSInstance;
    implements DBSInstance, DBSObjectContainer, DBSObject {
    @NotNull
/**
    }
    public void addExecutionContext(EXEC_CONTEXT context) {
    }
        return executionContext;

 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    public Collection<? extends DBSInstance> getAvailableInstances() {
import java.util.Collections;
import java.util.Collection;

 * You may obtain a copy of the License at
 *
            this.exclusiveLock.releaseExclusiveLock(lock);
    public EXEC_CONTEXT getDefaultContext() {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;



 *

    }
    public void removeExecutionContext(EXEC_CONTEXT context) {
import org.jkiss.dbeaver.Log;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            executionContext.close();
 */
        allContexts.add(context);
        } catch (DBException e) {
    @Override
    public DBSInstance getDefaultInstance() {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPExclusiveResource;
    @Override
    }
 * limitations under the License.
        try {

    @Override
import java.util.ArrayList;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    extends AbstractDataSource
    protected EXEC_CONTEXT executionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * AbstractSimpleDataSource.
    public DBCExecutionContext[] getAllContexts() {
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            log.error("Rrror shutting down datasource", e);
    @NotNull
    }
}
    public AbstractSimpleDataSource(@NotNull DBPDataSourceContainer container) {

    @NotNull

    public EXEC_CONTEXT getDefaultContext(@NotNull DBRProgressMonitor monitor, boolean meta) {
 * DBeaver - Universal Database Manager
    }
        }
    }
package org.jkiss.dbeaver.model.impl;
        return exclusiveLock;
    }

    @Override
