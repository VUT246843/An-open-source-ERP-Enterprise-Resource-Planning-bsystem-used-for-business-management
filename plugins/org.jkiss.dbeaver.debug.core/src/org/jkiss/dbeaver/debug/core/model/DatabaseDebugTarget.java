                breakpointManager.removeBreakpointManagerListener(this);


        this.threads = new ArrayList<>();
        if (!terminated) {
                debugPlugin.removeDebugEventListener(this);
            } catch (CoreException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    protected DatabaseThread newThread() {
    public boolean isSuspended() {
                if (name == null) {
    }
                    name = getDefaultName();
            for (IBreakpoint bp : breakpoints) {
    public ILaunch getLaunch() {
    }
        }
        return configuration.getName();
    public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
    @Override

        return session;
                        throw new InvocationTargetException(e);
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
                controller.dispose();
    @Override
    }
    public boolean supportsStorageRetrieval() {
import org.jkiss.dbeaver.utils.RuntimeUtils;
    private static final Log log = Log.getLog(DatabaseDebugTarget.class);
package org.jkiss.dbeaver.debug.core.model;
                    } catch (DBGException e) {

        debugPlugin.addDebugEventListener(this);
    }
        return process;

                GeneralUtils.makeErrorStatus(NLS.bind("Error suspending {0} - {1}", getName(), e.getMessage())));
                        log.error("Can't add initial breakpoint", e);

        return controller;
                        throw new InvocationTargetException(e);
        }

    public void breakpointAdded(IBreakpoint breakpoint) {
    }
    public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
            suspended(event.getDetails());
    public void stepOver() throws DebugException {
        IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(DBGConstants.BREAKPOINT_ID_DATABASE_LINE);
        if (name == null) {
        IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(modelIdentifier);
    public boolean canSuspend() {
        try {
                            log.log(e.getStatus());
    @Override
            suspended = false;
            if (enabled) {
        }
                            terminated();
                controller.unregisterEventHandler(this);
    @Override
    @Override
        }
        return name;
                        session.addBreakpoint(dbm, descriptor);

                breakpointAdded(breakpoint);
            session = this.controller.openSession(dbm);
                }
                }
    }
            IStatus status = DebugUtils.newErrorStatus(message, e);
    @Override
            }
                GeneralUtils.makeErrorStatus(NLS.bind("Error resuming {0} - {1}", getName(), e.getMessage())));
            String message = NLS.bind("Step over failed for session {0}", session.getSessionId());
import org.eclipse.core.runtime.IStatus;
    public DBGSession getSession() {
    @Override
    }
    private final ILaunch launch;
                name = getConfiguredName(configuration);
                case DebugEvent.TERMINATE:
            session.suspend();
    private final String modelIdentifier;

 * See the License for the specific language governing permissions and
    public void stepInto() throws DebugException {
            throw new DebugException(status);
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                name = getDefaultName();
                    try {
    public boolean hasThreads() throws DebugException {
 * DBeaver - Universal Database Manager
                "Add session breakpoint", BREAKPOINT_ACTION_TIMEOUT);
        return threads.toArray(new IThread[threads.size()]);
    }
        } catch (DBGException e) {

                breakpointManager.removeBreakpointListener(this);
    @Override
 *
            RuntimeUtils.runTask(
                return;
            }
import org.jkiss.dbeaver.debug.core.DebugUtils;
    @Override
    public void resume() throws DebugException {
            thread.resumedByTarget();
                ILaunchConfiguration configuration = getLaunch().getLaunchConfiguration();

        suspended = true;
                fireTerminateEvent();
    public boolean canResume() {
            if (debugPlugin != null) {
public class DatabaseDebugTarget extends DatabaseDebugElement implements IDatabaseDebugTarget, DBGEventHandler {
    }
        try {

    }
        this.controller = controller;
    public IDatabaseDebugTarget getDatabaseDebugTarget() {

            throw new DebugException(status);
 *
            }
    protected DBGBreakpointDescriptor describeBreakpoint(IBreakpoint breakpoint) {
        return session != null && session.canStepOver();
            } catch (CoreException e) {


        }
    @Override
        } catch (DBGException e) {
        return defaultName;
        if (!terminated) {
        this.launch = launch;
        return breakpoint.getModelIdentifier().equals(DBGConstants.BREAKPOINT_ID_DATABASE_LINE);
 */

    private boolean terminated = false;
        return session != null && session.canStepReturn();
    }
    }
    public DatabaseDebugTarget(String modelIdentifier, ILaunch launch, IProcess process, DBGController controller) {
import java.util.ArrayList;
                    } catch (DBGException e) {
            RuntimeUtils.runTask(
    @Override
    public static final int SESSION_ACTION_TIMEOUT = 20000;
    }

    @Override

    }
            }
 * limitations under the License.
        try {
        this.process = process;
        breakpointManager.addBreakpointListener(this);
                    breakpointAdded(breakpoint);
    }
        }
 *
        } catch (DBGException e) {
    public void disconnect() throws DebugException {
    }
                    }


    }
        } catch (DBGException e) {
import org.eclipse.debug.core.*;
        if (breakpoints != null) {
            log.error(e);
            } else {
        DebugPlugin debugPlugin = DebugPlugin.getDefault();
            terminated = true;
                monitor -> {
        this.thread = newThread();
            }
    public void breakpointManagerEnablementChanged(boolean enabled) {
        }
        if (DBGEvent.SUSPEND == kind) {
        return this;
    private final List<IThread> threads;
            try {
    public boolean supportsBreakpoint(IBreakpoint breakpoint) {

        thread.fireSuspendEvent(detail);

    private final DatabaseThread thread;
import java.util.HashMap;
    }
                    process.terminate();
                GeneralUtils.makeExceptionStatus(e));
            RuntimeUtils.runTask(
    public boolean isTerminated() {
    @Override

                return;
                disconnect();
            }

        this.modelIdentifier = modelIdentifier;
            Map<String, Object> attributes = breakpoint.getMarker().getAttributes();
                }
    }
        } catch (DBGException e) {
    private String defaultName = DebugCoreMessages.DatabaseDebugTarget_name_default;
        return session != null;
                "Remove session breakpoint", BREAKPOINT_ACTION_TIMEOUT);
    }
    }
        // Initiate breakpoints
        return controller.describeBreakpoint(description);
            DBGBreakpointDescriptor descriptor = describeBreakpoint(breakpoint);
            IStatus status = DebugUtils.newErrorStatus(message, e);
    @Override
        try {
            session.execStepOver();
                        }
            if (descriptor == null) {
    @Override
            }
    }
 * You may obtain a copy of the License at
    public String getName() throws DebugException {
            session.execStepReturn();
                    }
    public void terminate() throws DebugException {
        }

                },
    public IThread[] getThreads() throws DebugException {
    @Override

        super(null);

    }
            String message = NLS.bind("Step into failed for session {0}", session.getSessionId());
    @Override
    private final DBGController controller;
                },
    public void handleDebugEvents(DebugEvent[] events) {
        breakpointManager.addBreakpointManagerListener(this);
        if (supportsBreakpoint(breakpoint)) {
            session.resume();
        }
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
                log.log(e.getStatus());
        return !terminated && threads.size() > 0;
        }
        }
    public boolean canStepInto() {
import org.eclipse.osgi.util.NLS;

            }
    public boolean canStepReturn() {
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            try {

            } finally {
                } else {
    protected String getConfiguredName(ILaunchConfiguration configuration) throws CoreException {
import java.lang.reflect.InvocationTargetException;

                    // do nothing
                process.terminate();
            process.terminate();
 * Unless required by applicable law or agreed to in writing, software
        }

        try {
            log.log(e.getStatus());
    public static final int BREAKPOINT_ACTION_TIMEOUT = 20000;
            Map<String, Object> remote = DebugUtils.toBreakpointDescriptor(attributes);
        return null;
import java.util.Map;
                monitor -> {
    }
                    }
            DBGBreakpointDescriptor descriptor = describeBreakpoint(breakpoint);




        return session == null;
    public void stepReturn() throws DebugException {
            try {
                if (breakpoint.isEnabled() && DebugPlugin.getDefault().getBreakpointManager().isEnabled()) {
                    break;
        return thread != null && !terminated && suspended;
    @Override
    }
    private String name;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    try {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;

    @Override
        if (DBGEvent.TERMINATE == kind) {
        DBRProgressMonitor dbm = new DefaultProgressMonitor(monitor);

        if (thread.isSuspended()) {
        return false;

    @Override

            threads.clear();
    }
                    try {
    private final IProcess process;
    }
    public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
        }


                    breakpointRemoved(breakpoint, null);
        return session != null && session.canStepInto();
    public String getModelIdentifier() {
    protected String getDefaultName() {

        for (DebugEvent event : events) {
    }
            session = null;
                IBreakpointManager breakpointManager = debugPlugin.getBreakpointManager();
    }
import org.eclipse.core.runtime.CoreException;

        return modelIdentifier;
                "Close session", SESSION_ACTION_TIMEOUT);
    @Override
                    try {
        }

    @Override
            } catch (DebugException e) {
import org.jkiss.dbeaver.debug.*;
    @Override
                        throw new InvocationTargetException(e);
}
            }
    }

            if (descriptor == null) {
        return thread != null && !terminated && !suspended;
        return new DatabaseThread(this);
import org.jkiss.dbeaver.Log;

        } catch (DBGException e) {
    public DBGController getController() {
                log.error(NLS.bind("Unable to describe breakpoint {0}", breakpoint));
    @Override
    public boolean canTerminate() {
    private DBGSession session;
                        } catch (DebugException e) {
                } catch (DebugException e) {
                log.error(NLS.bind("Unable to describe breakpoint {0}", breakpoint));
        return !terminated;
    public IDebugTarget getDebugTarget() {
    }
            throw new CoreException(
    @Override
    public void connect(IProgressMonitor monitor) throws CoreException {
            switch (event.getKind()) {
        this.defaultName = defaultName;
                },
        return launch;

    public boolean canDisconnect() {
            if (!getProcess().isTerminated()) {
    public boolean canStepOver() {
    }
    }
                        session.closeSession(monitor);
                    if (event.getSource().equals(process)) {
        IBreakpointManager breakpointManager = debugPlugin.getBreakpointManager();


        Map<String, Object> description = new HashMap<>();
                if (descriptor != null) {
        this.threads.add(thread);
    public synchronized void terminated() throws DebugException {
    public void suspend() throws DebugException {
        }
        if (session != null) {
    }


    @Override

            description.putAll(remote);
    }
    public boolean isDisconnected() {
            throw new DebugException(
                    } catch (DBGException e) {
                try {
        this.controller.registerEventHandler(this);
                    log.debug(e);
                // do nothing
    public IProcess getProcess() {

                    }
            }
                        session.removeBreakpoint(monitor, descriptor);
            try {
    @Override

import java.util.List;
            String message = NLS.bind("Step return failed for session {0}", session.getSessionId());
        } catch (CoreException e) {
import org.eclipse.debug.core.model.*;
import org.jkiss.dbeaver.debug.internal.core.DebugCoreMessages;
        }
        return suspended;
                monitor -> {
                    }
        try {
    @Override
    }
            log.error(e);
import org.eclipse.core.runtime.IProgressMonitor;
    @Override
            return null;
    }
    }
        fireResumeEvent(DebugEvent.CLIENT_REQUEST);
        if (!terminated) {
    }
                        try {
    }
    }
    public void handleDebugEvent(DBGEvent event) {
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return terminated;
        suspended = false;
                        session.addBreakpoint(monitor, descriptor);
import org.eclipse.core.resources.IMarkerDelta;
            throw new DebugException(
            if (debugPlugin != null) {
        }

    }

    private boolean suspended = false;
            DebugPlugin debugPlugin = DebugPlugin.getDefault();
        int kind = event.getKind();
    protected void setDefaultName(String defaultName) {

/*

                    } catch (DBGException e) {
        }
            IStatus status = DebugUtils.newErrorStatus(message, e);
 * you may not use this file except in compliance with the License.
    }
        thread.setStepping(false);
    public void suspended(int detail) {
        return this;
            throw new DebugException(status);
        terminated();
        for (IBreakpoint breakpoint : breakpoints) {
            session.execStepInto();
                }
                DBGBreakpointDescriptor descriptor = describeBreakpoint(bp);
                breakpointRemoved(breakpoint, null);
