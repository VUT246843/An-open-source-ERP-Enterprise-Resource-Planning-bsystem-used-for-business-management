import java.util.Map;
            final Map<String, Object> attributes, final String markerType) throws DebugException
 * You may obtain a copy of the License at
import org.eclipse.core.resources.IWorkspaceRunnable;
        IMarker m = getMarker();
    protected DatabaseLineBreakpoint(DBSObject databaseObject, DBNNode node, final IResource resource,
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

package org.jkiss.dbeaver.debug.core.breakpoints;

            addDatabaseBreakpointAttributes(attributes, databaseObject, node, breakpointDescriptor);
        attributes.put(IBreakpoint.ID, modelIdentifier);

        if (m != null) {
        IWorkspaceRunnable wr = monitor -> {
            // add attributes
public class DatabaseLineBreakpoint extends DatabaseBreakpoint implements IDatabaseLineBreakpoint {
    }
        }
        IMarker m = getMarker();
 * you may not use this file except in compliance with the License.
            final int lineNumber, final int charStart, final int charEnd, final boolean add,
 * Copyright (C) 2010-2024 DBeaver Corp and others
            setMarker(resource.createMarker(markerType));
    {
    @Override
 * DBeaver - Universal Database Manager
            // add to breakpoint manager if requested
            ensureMarker().setAttributes(attributes);
        }
import org.eclipse.debug.core.DebugException;
        if (m != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

    }
            return m.getAttribute(IMarker.CHAR_END, -1);
/*
        return -1;
import org.eclipse.debug.core.model.IBreakpoint;
            // create the marker
        return -1;
        attributes.put(IMarker.CHAR_END, charEnd);
import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.navigator.DBNNode;
    public DatabaseLineBreakpoint() {


 * See the License for the specific language governing permissions and
        attributes.put(IMarker.LINE_NUMBER, lineNumber);
    {
    {
          DBGBreakpointDescriptor breakpointDescriptor, final int lineNumber, final int charStart, final int charEnd, final boolean add) throws DebugException
    @Override
            addLineBreakpointAttributes(attributes, getModelIdentifier(), true, lineNumber, charStart, charEnd);
            return m.getAttribute(IMarker.LINE_NUMBER, -1);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void addLineBreakpointAttributes(Map<String, Object> attributes, String modelIdentifier, boolean enabled,
import java.util.HashMap;
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.debug.DBGBreakpointDescriptor;
}
 *
import org.eclipse.core.resources.IResource;
    }
    public int getLineNumber() throws CoreException {
        }
        run(getMarkerRule(resource), wr);
import org.eclipse.core.resources.IMarker;

    }
            return m.getAttribute(IMarker.CHAR_START, -1);

    public int getCharStart() throws CoreException {
        this(databaseObject, node, resource, breakpointDescriptor, lineNumber, charStart, charEnd, add,
        IMarker m = getMarker();
 */
    @Override
             DBGBreakpointDescriptor breakpointDescriptor,
 * limitations under the License.

    public int getCharEnd() throws CoreException {


    public DatabaseLineBreakpoint(DBSObject databaseObject, DBNNode node, IResource resource,
        attributes.put(IBreakpoint.ENABLED, enabled);
    }
        };
 * Unless required by applicable law or agreed to in writing, software
        return -1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            register(add);
        if (m != null) {

            int lineNumber, int charStart, int charEnd)
 *
            new HashMap<>(), DBGConstants.BREAKPOINT_ID_DATABASE_LINE);
import org.jkiss.dbeaver.debug.DBGConstants;
        attributes.put(IMarker.CHAR_START, charStart);
