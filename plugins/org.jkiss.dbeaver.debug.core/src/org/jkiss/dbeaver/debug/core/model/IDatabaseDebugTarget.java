
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IDebugTarget;
 * Licensed under the Apache License, Version 2.0 (the "License");

/*
import org.eclipse.debug.core.IBreakpointManagerListener;
 * limitations under the License.
}
 * See the License for the specific language governing permissions and

    boolean canStepOver();

    void connect(IProgressMonitor monitor) throws CoreException;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    DBGController getController();
 * you may not use this file except in compliance with the License.

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
package org.jkiss.dbeaver.debug.core.model;
    boolean canStepReturn();
    void stepReturn() throws DebugException;
    void stepInto() throws DebugException;
public interface IDatabaseDebugTarget extends IDebugTarget, IDebugEventSetListener, IBreakpointManagerListener {
    DBGSession getSession();

 * You may obtain a copy of the License at

 *
import org.eclipse.debug.core.DebugException;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    boolean canStepInto();

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.debug.DBGController;
    void stepOver() throws DebugException;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.debug.core.IDebugEventSetListener;
import org.jkiss.dbeaver.debug.DBGSession;
 * Unless required by applicable law or agreed to in writing, software




import org.eclipse.core.runtime.IProgressMonitor;

