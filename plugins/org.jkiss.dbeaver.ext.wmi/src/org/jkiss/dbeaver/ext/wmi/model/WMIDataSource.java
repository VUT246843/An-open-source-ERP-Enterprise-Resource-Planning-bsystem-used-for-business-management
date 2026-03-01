    @Override
        return true;
    public SQLDialect getSQLDialect() {
    @Association
        QMUtils.getDefaultHandler().handleContextClose(this);
        } catch (UnsatisfiedLinkError e) {

    @Override
    @Nullable
    public Collection<? extends DBSInstance> getAvailableInstances() {

import org.jkiss.dbeaver.model.qm.QMUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return Collections.singletonList(rootNamespace);
    @NotNull
    @NotNull

            throw new DBException("Can't link with WMI native library", e);
        return this;
    public DBCExecutionContext openIsolatedContext(@NotNull DBRProgressMonitor monitor, @NotNull String purpose, @Nullable DBCExecutionContext initFrom) throws DBException
        return this;
    }
import org.jkiss.dbeaver.model.impl.AbstractDataSource;
import org.jkiss.dbeaver.model.meta.Association;
/**
        return null;
            throw new DBException("Can't connect to WMI service", e);
    }
 * You may obtain a copy of the License at
    @NotNull
import java.util.Collections;
    @Override

    }
    @NotNull
/*
    }
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }
    private final DBPExclusiveResource exclusiveLock = new SimpleExclusiveLock();
public class WMIDataSource extends AbstractDataSource implements DBSInstance, DBCExecutionContext, DBPAdaptable
        } catch (Throwable e) {
                connectionInfo.getServerName(),
import org.jkiss.dbeaver.model.impl.AbstractExecutionContext;
    }
        return dialect;

    @Override
    @Override
    {
        }
    public WMIService getService()
    }
    public DBCSession openSession(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionPurpose purpose, @NotNull String task)
    {
        return null;
        // do nothing
import org.jkiss.dbeaver.DBException;
    }

    private final SQLDialect dialect;
                connectionInfo.getHostName(),

    @Override

    public boolean isConnected()
    {
    }
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return Collections.singletonList(this);
    private WMINamespace rootNamespace;
{

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return exclusiveLock;
    public void checkContextAlive(DBRProgressMonitor monitor) throws DBException {
    public DBCExecutionContext getDefaultContext(@NotNull DBRProgressMonitor monitor, boolean meta) {
            }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
        return this;
 *
    }
            WMIService service = WMIService.connect(

        return rootNamespace.service;
    @NotNull
 */
    public void close() {
        if (adapter == DBSObjectContainer.class) {
        return this;

        }
    @Override
        }
    public DBPDataSourceInfo getInfo()

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    @Override
        this.id = AbstractExecutionContext.generateContextId();
    {
        // nothing to do
import org.jkiss.dbeaver.model.impl.SimpleExclusiveLock;
    }
            rootNamespace = null;
    public Collection<WMINamespace> getNamespaces()
import org.jkiss.dbeaver.model.DBPExclusiveResource;
    @Override
        return new WMIDataSourceInfo();
import org.jkiss.dbeaver.model.DBPAdaptable;
    public DBCExecutionContextDefaults getContextDefaults() {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return this.id;
    }
 */

        return new WMISession(monitor, purpose, task, this);
}
 * Licensed under the Apache License, Version 2.0 (the "License");

        return new DBCExecutionContext[] { this };
    {
import org.jkiss.dbeaver.model.sql.SQLDialect;
    @Override

    @Override
        try {
                connectionInfo.getUserName(),
    @NotNull
import java.util.Collection;
    @Override
    @NotNull
    public DBPExclusiveResource getExclusiveLock() {
        this.dialect = new WMIDialect();
            rootNamespace.close();
    @NotNull
    @Override
    {
    public <T> T getAdapter(Class<T> adapter)


                rootNamespace.service.close();
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException
    @Override
 *
import org.jkiss.wmi.service.WMIService;

    }
    private final long id;
import org.jkiss.code.NotNull;
    }
    public String getContextName() {

                connectionInfo.getDatabaseName());
    @Override
    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSInstance;
    @Override
                connectionInfo.getUserPassword(),
 * See the License for the specific language governing permissions and

            return adapter.cast(rootNamespace);
package org.jkiss.dbeaver.ext.wmi.model;
    @Override
            if (rootNamespace.service != null) {
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others

            this.rootNamespace = new WMINamespace(null, this, connectionInfo.getDatabaseName(), service);
    }
    public DBCExecutionContext[] getAllContexts() {
    }
    public long getContextId() {
    public DBSInstance getOwnerInstance() {

    public void shutdown(@NotNull DBRProgressMonitor monitor)

 * you may not use this file except in compliance with the License.
    }
    @Override
        this.close();

    public WMIDataSource(DBPDataSourceContainer container) {
        super(container);
    public void invalidateContext(@NotNull DBRProgressMonitor monitor, @NotNull DBCInvalidatePhase phase) throws DBException {
    {
    {
    }
 *
    public DBSInstance getDefaultInstance() {
    }
                null,
    }
        final DBPConnectionConfiguration connectionInfo = container.getActualConnectionConfiguration();

    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return "WMI Data Source";
 * DBeaver - Universal Database Manager
 * WMIDataSource
        if (rootNamespace != null) {
    @NotNull
        QMUtils.getDefaultHandler().handleContextOpen(this, false);
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
    }
    @NotNull
import org.jkiss.dbeaver.model.exec.*;


