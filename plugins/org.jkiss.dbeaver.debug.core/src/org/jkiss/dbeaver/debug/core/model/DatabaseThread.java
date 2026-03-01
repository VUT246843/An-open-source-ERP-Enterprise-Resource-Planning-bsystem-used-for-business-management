    public void stepInto() throws DebugException {

                rebuildStack(stackFrames);
import org.jkiss.dbeaver.debug.DBGSession;
    @Override

import org.eclipse.debug.core.DebugEvent;

    }
    }

    }

 *
    }
    public void resumedByTarget() {

        return 0;
        frames.clear();
 * Delegates mostly everything to its debug target
    }
    }

import java.util.List;
    public void setName(String name) {

            if (frames.size() > 0) {

                return frames.get(0);
    }
    }
package org.jkiss.dbeaver.debug.core.model;
    public boolean canStepInto() {
            String message = NLS.bind("Error reading stack for {0}", getName());
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import java.util.ArrayList;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    }
            if (session != null) {
 * Unless required by applicable law or agreed to in writing, software
        this.name = name;
            if (frames.size() == 0) {
 */
    public boolean canResume() {
    public boolean canTerminate() {
 * You may obtain a copy of the License at
import org.eclipse.osgi.util.NLS;
    public void resume() throws DebugException {
        }
        getDatabaseDebugTarget().stepInto();
    public boolean isStepping() {
            addFrame(dbgStackFrame);
    @Override
/*
        // no idea for now
    }
        for (DBGStackFrame dbgStackFrame : stackFrames) {

 * See the License for the specific language governing permissions and
            }
    }
    @Override
/**
import org.eclipse.debug.core.model.IThread;


    public void stepOver() throws DebugException {
    public DatabaseThread(IDatabaseDebugTarget target) {
        if (isSuspended()) {
        DatabaseStackFrame frame = new DatabaseStackFrame(this, stackFrameId);
                extractStackFrames();
        // TODO Auto-generated method stub
    public boolean canSuspend() {
        }

import org.jkiss.dbeaver.debug.internal.core.DebugCoreMessages;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    @Override
import org.eclipse.core.runtime.IStatus;
        return getDebugTarget().canTerminate();

                List<? extends DBGStackFrame> stackFrames = session.getStack();
            }
 *
        super(target);
            throw new DebugException(status);

                extractStackFrames();
    @Override
        frames.add(frame);
public class DatabaseThread extends DatabaseDebugElement implements IThread {
        return getDebugTarget().isSuspended();
    }
 *
    }
 *
    }
 * limitations under the License.
import org.jkiss.dbeaver.debug.DBGStackFrame;
    }


    @Override
            IDatabaseDebugTarget debugTarget = getDatabaseDebugTarget();
        return getDatabaseDebugTarget().canStepOver();
    protected void extractStackFrames() throws DebugException {
import org.eclipse.debug.core.DebugException;
    }
    }
        this.stepping = stepping;
    }
    }
        getDatabaseDebugTarget().stepOver();
    private void aboutToResume(int detail, boolean stepping) {
        try {
    private String name = DebugCoreMessages.DatabaseThread_name;

    @Override
    }
        return null;
        } catch (DBGException e) {
    public IBreakpoint[] getBreakpoints() {

    }
    @Override

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.debug.DBGException;
    }
        return true;
import org.eclipse.debug.core.model.IStackFrame;
    @Override
    @Override
        return getDatabaseDebugTarget().canStepInto();
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
    public void setStepping(boolean stepping) {
    }
    public void suspend() throws DebugException {
    public void rebuildStack(List<? extends DBGStackFrame> stackFrames) {
        return getDebugTarget().canResume();
    public void terminate() throws DebugException {
        aboutToResume(DebugEvent.STEP_INTO, true);
    public boolean canStepOver() {
    @Override
    public boolean isTerminated() {
    }
    private void addFrame(DBGStackFrame stackFrameId) {
    @Override
import org.jkiss.dbeaver.debug.core.DebugUtils;
    public IStackFrame getTopStackFrame() throws DebugException {
        getDatabaseDebugTarget().stepReturn();
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean stepping = false;
        }
        if (isSuspended()) {
    public void stepReturn() throws DebugException {
        return getDebugTarget().isTerminated();

    }
    @Override

        getDebugTarget().suspend();
        aboutToResume(DebugEvent.STEP_RETURN, true);
        getDebugTarget().resume();
    }
    @Override
    @Override
    public String getName() throws DebugException {

        aboutToResume(DebugEvent.CLIENT_REQUEST, false);
        fireResumeEvent(detail);

        aboutToResume(DebugEvent.STEP_OVER, true);



            }


    }
    public IStackFrame[] getStackFrames() throws DebugException {
    private List<DatabaseStackFrame> frames = new ArrayList<>(1);


    @Override
    }
    @Override
        aboutToResume(DebugEvent.CLIENT_REQUEST, false);
        return getDebugTarget().canSuspend();

    public boolean isSuspended() {
            }

            DBGSession session = debugTarget.getSession();
    @Override

        getDebugTarget().terminate();
        return stepping;
        frames.clear();
    @Override
            if (frames.size() == 0) {
            IStatus status = DebugUtils.newErrorStatus(message, e);
        return name;
        setStepping(stepping);
    public int getPriority() throws DebugException {

        }
    public boolean canStepReturn() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        // setBreakpoints(null);
 * you may not use this file except in compliance with the License.
        return frames.toArray(new IStackFrame[frames.size()]);
import org.eclipse.debug.core.model.IBreakpoint;
    public boolean hasStackFrames() throws DebugException {
        return getDatabaseDebugTarget().canStepReturn();
    @Override
        return null;
