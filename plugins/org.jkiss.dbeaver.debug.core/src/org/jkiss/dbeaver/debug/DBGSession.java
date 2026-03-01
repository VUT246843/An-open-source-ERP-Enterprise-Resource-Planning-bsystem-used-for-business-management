import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


 *
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
/*
 * See the License for the specific language governing permissions and




 *
    Object getSessionId();

    void removeBreakpoint(DBRProgressMonitor monitor, DBGBreakpointDescriptor descriptor) throws DBGException;
package org.jkiss.dbeaver.debug;
 * You may obtain a copy of the License at
    void resume() throws DBGException;

 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)

}
    boolean canStepOver();

 * Copyright (C) 2010-2024 DBeaver Corp and others
    void addBreakpoint(DBRProgressMonitor monitor, DBGBreakpointDescriptor descriptor) throws DBGException;

    void setVariableVal(DBGVariable<?> variable, Object value) throws DBGException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    List<? extends DBGBreakpointDescriptor> getBreakpoints();
    List<? extends DBGVariable<?>> getVariables(DBGStackFrame stack) throws DBGException;
    DBGSessionInfo getSessionInfo();


    void execStepReturn() throws DBGException;
 * you may not use this file except in compliance with the License.
    void execStepInto() throws DBGException;
import java.util.List;
 * limitations under the License.
    List<? extends DBGStackFrame> getStack() throws DBGException;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    boolean canStepInto();

    boolean canStepReturn();
public interface DBGSession {


    void closeSession(DBRProgressMonitor monitor) throws DBGException;

    void execStepOver() throws DBGException;

 * Licensed under the Apache License, Version 2.0 (the "License");
    void execContinue() throws DBGException;
    void suspend() throws DBGException;


 */

    String getSource(DBGStackFrame stack) throws DBGException;

 * distributed under the License is distributed on an "AS IS" BASIS,
