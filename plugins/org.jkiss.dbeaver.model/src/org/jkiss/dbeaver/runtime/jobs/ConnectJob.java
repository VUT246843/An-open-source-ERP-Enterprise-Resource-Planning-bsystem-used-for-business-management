        }
            String oldName = connectThread == null ? null : connectThread.getName();



        if (connectThread != null) {
        if (curJob != null) {
        this.container = container;
            try {
    public IStatus runSync(DBRProgressMonitor monitor)
            connectError = ex;
            }
 * Always returns OK status.
                    connectThread = null;
                    connectThread.setName(oldName);
 * you may not use this file except in compliance with the License.
            connectStatus = GeneralUtils.makeExceptionStatus(ex);
 * See the License for the specific language governing permissions and
    }
            return run(monitor);
        try {
        catch (Throwable ex) {
    public IStatus getConnectStatus() {
                    "Driver " + container.getDriver().getFullName()+ " is not available." +
            if (container.getDriver().isNotAvailable()) {

import org.jkiss.dbeaver.DBException;
    {
    protected Throwable connectError;
            if (curJob != null) {
    protected boolean initialize = true;
            if (reflect && connectThread != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (connectThread != null && oldName != null) {
        }
    public Throwable getConnectError() {
 * To get real status use getConectStatus.
    @Override
                throw new DBException(
 * Unless required by applicable law or agreed to in writing, software
/*
            curJob.setAttachedJob(this);
        }
import org.eclipse.core.runtime.Status;
    {
    public ConnectJob(
    {
    }
 *

        DBPDataSourceContainer container)
    }
    private static final Log log = Log.getLog(ConnectJob.class);
            connectThread = getThread();
import org.jkiss.code.NotNull;
    private volatile Thread connectThread;
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected IStatus connectStatus;

            } finally {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            connectThread.interrupt();
            setThread(Thread.currentThread());
            }
    {
 * Connect job.
    protected final DBPDataSourceContainer container;
            }
 * limitations under the License.
                curJob.setAttachedJob(null);

}    @Override
import org.eclipse.core.runtime.IStatus;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                }
        return Status.OK_STATUS;
                    " Please see the connection page for more info.");
        try {
        setUser(true);
 */
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        AbstractJob curJob = CURRENT_JOB.get();
/**
                final boolean connected = container.connect(monitor, initialize, reflect);
    }
    protected boolean reflect = true;
                connectThread.setName(getName());

 * You may obtain a copy of the License at

    protected void canceling()
 * DBeaver - Universal Database Manager
    protected IStatus run(@NotNull DBRProgressMonitor monitor)
                connectStatus = connected ? Status.OK_STATUS : Status.CANCEL_STATUS;
        return connectError;
 *
import org.jkiss.dbeaver.utils.GeneralUtils;
        return connectStatus;
            }

        }
{
    public boolean belongsTo(Object family)
    }
    }
    @Override
            reflect = false;
 *
        } finally {
 */
        super("Connect to '" + container.getName() + "'");
    @NotNull
public class ConnectJob extends AbstractJob


    {
        return container == family;
package org.jkiss.dbeaver.runtime.jobs;
