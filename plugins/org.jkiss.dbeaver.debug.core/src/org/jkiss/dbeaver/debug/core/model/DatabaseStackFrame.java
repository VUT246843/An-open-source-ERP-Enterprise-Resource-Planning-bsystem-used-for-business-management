import java.util.Map;
        return getThread().canTerminate();
        return isSuspended();
            String message = NLS.bind("Unable to retrieve sources for stack {0}", dbgStackFrame);
    }
                    int currentLN = dbgVariable.getLineNumber();
import org.eclipse.debug.core.model.IRegisterGroup;
        this.dbgStackFrame = dbgStackFrame;

    }
    @Override
        try {
/*
    private static final IRegisterGroup[] NO_REGISTER_GROUPS = new IRegisterGroup[0];
        return dbgStackFrame.getLineNumber();
    }
 * You may obtain a copy of the License at
    }
    }
public class DatabaseStackFrame extends DatabaseDebugElement implements IStackFrame {
    }
                String name = dbgVariable.getName();

        refreshVariables = true;
    @Override
    }
        return getThread().canStepOver();
        getThread().stepInto();
                    int delta = currentLN - existingLN;
            for (DBGVariable<?> dbgVariable : dbgVariables) {



    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

        this.thread = thread;
    public boolean canStepOver() {
                    }
            int frameLN = dbgStackFrame.getLineNumber();
        return getThread().isSuspended();
        } finally {
            
    }
import org.eclipse.debug.core.model.IThread;
 *     http://www.apache.org/licenses/LICENSE-2.0


    public boolean canTerminate() {
    public void terminate() throws DebugException {
import java.util.List;
    }
    public boolean canSuspend() {
    @Override
        return NO_REGISTER_GROUPS;
            try {
    private final DBGStackFrame dbgStackFrame;
    public DatabaseStackFrame(DatabaseThread thread, DBGStackFrame dbgStackFrame) {
                    if (delta >= 0) {
        return thread;



            for (DBGVariable<?> dbgVariable : filtered.values()) {
        getThread().resume();
 * Licensed under the Apache License, Version 2.0 (the "License");
                }

    }

            source = debugTarget.getSession().getSource(dbgStackFrame);
 * limitations under the License.

        }
    public boolean canResume() {
    @Override
    public boolean canStepReturn() {
            IStatus status = DebugUtils.newErrorStatus(message, e);
    @Override
        return false;
        return getThread().canSuspend();
 */
    public void stepReturn() throws DebugException {

package org.jkiss.dbeaver.debug.core.model;
    public boolean isSuspended() {
            throw new DebugException(status);
    @Override
    @Override
        return getThread().isTerminated();
            variables.clear();
        return dbgStackFrame.getSourceIdentifier();
                if (existing == null) {
    public IVariable[] getVariables() throws DebugException {
 *
    }
    }
    @Override
    protected void rebuildVariables(List<? extends DBGVariable<?>> dbgVariables) {
                log.debug("Error getting variables", e);
        }
import org.jkiss.dbeaver.debug.DBGException;
    @Override
            }
import org.eclipse.debug.core.model.IVariable;
    @Override

        return getThread().canResume();
            IDatabaseDebugTarget debugTarget = getDatabaseDebugTarget();
    public boolean isTerminated() {
import org.jkiss.dbeaver.debug.DBGVariable;
 *
            }
                } else {

        String source;
    @Override

    public boolean hasVariables() throws DebugException {

                        log.error(message);

                    filtered.put(name, dbgVariable);
            Map<String, DBGVariable<?>> filtered = new LinkedHashMap<>();
    }
    @Override
    private boolean refreshVariables = true;
        }
    @Override
    }
    }
    @Override
    }

                variables.add(variable);

    public void resume() throws DebugException {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.Log;

    }
                DatabaseVariable variable = new DatabaseVariable(getDatabaseDebugTarget(), dbgVariable);
    }

            } catch (DBGException e) {

        getThread().stepOver();
    }
                rebuildVariables(variables);
                        String message = NLS.bind(pattern, new Object[]{existing, dbgVariable, frameLN});
    public int getCharEnd() throws DebugException {
        try {
        getThread().canStepReturn();
        // unknown
import org.jkiss.dbeaver.debug.core.DebugUtils;
    protected void invalidateVariables() {
 * DBeaver - Universal Database Manager
    public void suspend() throws DebugException {
    private final List<DatabaseVariable> variables = new ArrayList<>();
        String pattern = "{0} line: {1}";
    @Override

 *
    private static Log log = Log.getLog(DatabaseStackFrame.class);
import org.jkiss.dbeaver.debug.DBGStackFrame;
    @Override
    }
    @Override
 * you may not use this file except in compliance with the License.
    @Override
    }
    public boolean canStepInto() {
    public void stepOver() throws DebugException {
    public void stepInto() throws DebugException {


        return getThread().isStepping();
    @Override
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    }
            }

        getThread().suspend();
        /*if (refreshVariables)*/ {
    public boolean hasRegisterGroups() throws DebugException {
    }
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    @Override
    public Object getSourceIdentifier() {
                        filtered.put(name, dbgVariable);


                    int existingLN = existing.getLineNumber();
            return NO_VARIABLES;

    public IRegisterGroup[] getRegisterGroups() throws DebugException {
import org.eclipse.debug.core.model.IStackFrame;
    }
                IDatabaseDebugTarget debugTarget = getDatabaseDebugTarget();
    public IThread getThread() {
    private final DatabaseThread thread;
                DBGVariable<?> existing = filtered.get(name);
    public String getSource() throws DebugException {
        return -1;
    public String getName() throws DebugException {
 * distributed under the License is distributed on an "AS IS" BASIS,

        return NLS.bind(pattern, dbgStackFrame.getName(), dbgStackFrame.getLineNumber());
                List<? extends DBGVariable<?>> variables = debugTarget.getSession().getVariables(dbgStackFrame);
        super(thread.getDatabaseDebugTarget());
        if (variables.isEmpty()) {
        getThread().terminate();
    }
import org.eclipse.core.runtime.IStatus;
        return getThread().canStepInto();
                        String pattern = "Already have {0} and ignored {1} for frame at {2}";
    @Override
        return getThread().canStepReturn();
    @Override

        // unknown
    public boolean isStepping() {

    }
        } catch (DBGException e) {
        }
        return source;
    }

import java.util.LinkedHashMap;
    private static final IVariable[] NO_VARIABLES = new IVariable[0];
            refreshVariables = false;
    public int getCharStart() throws DebugException {
import java.util.ArrayList;
    }
    public int getLineNumber() throws DebugException {
        return -1;
                    } else {


import org.eclipse.debug.core.DebugException;
        return variables.toArray(new IVariable[variables.size()]);
import org.eclipse.osgi.util.NLS;
    }

