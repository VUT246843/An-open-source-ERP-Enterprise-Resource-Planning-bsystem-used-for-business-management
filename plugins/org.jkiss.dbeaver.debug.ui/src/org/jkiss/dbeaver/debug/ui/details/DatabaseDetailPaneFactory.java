import org.eclipse.debug.ui.IDetailPane;
import java.util.Set;
        }
    @Override

    public String getDetailPaneName(String paneID) {
        return descriptions;
 * You may obtain a copy of the License at
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        return DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT;
            return new DatabaseStandardBreakpointPane();

                IBreakpoint breakpoint = (IBreakpoint) first;
import org.eclipse.debug.ui.IDetailPaneFactory;
 * See the License for the specific language governing permissions and
            names.put(DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT,
                    DebugUIMessages.DatabaseStandardBreakpointPane_description);
        if (selection.size() == 1) {
                }
                    if (DBGConstants.BREAKPOINT_ID_DATABASE_LINE.equals(type)) {
    @Override
        return getNames().get(paneID);
    private Map<String, String> descriptions;
            }
            Object first = selection.getFirstElement();
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
                    String type = breakpoint.getMarker().getType();
import org.jkiss.dbeaver.debug.ui.internal.DebugUIMessages;


 *
    @Override
                    String type = breakpoint.getMarker().getType();

        return set;
        if (selection.size() == 1) {

 * DBeaver - Universal Database Manager
        return null;
    }
    private Map<String, String> names;
    public String getDefaultDetailPane(IStructuredSelection selection) {
import org.eclipse.debug.core.model.IBreakpoint;
    protected Map<String, String> getDescriptions() {
        return names;
                    }
    }
    }
            if (first instanceof IBreakpoint) {
                    } else {
                } catch (CoreException e) {
        return getDescriptions().get(paneID);

 * you may not use this file except in compliance with the License.


    protected Map<String, String> getNames() {
    public IDetailPane createDetailPane(String paneID) {
 * Unless required by applicable law or agreed to in writing, software

/*
 * limitations under the License.
                    if (DBGConstants.BREAKPOINT_ID_DATABASE_LINE.equals(type)) {
        HashSet<String> set = new HashSet<>();
            Object first = selection.getFirstElement();
import org.jkiss.dbeaver.debug.DBGConstants;
            descriptions.put(DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT,

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT.equals(paneID)) {
    public String getDetailPaneDescription(String paneID) {
        if (descriptions == null) {
                    }
        if (names == null) {
package org.jkiss.dbeaver.debug.ui.details;
                        return DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT;
    }
        }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.eclipse.jface.viewers.IStructuredSelection;
 *
        return null;
import org.eclipse.core.runtime.CoreException;
}
import java.util.HashSet;
                    DebugUIMessages.DatabaseStandardBreakpointPane_name);
            if (first instanceof IBreakpoint) {
                }
import java.util.Map;


 */
        }
                        set.add(DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT);
    @Override
                        set.add(DatabaseStandardBreakpointPane.DETAIL_PANE_STANDARD_BREAKPOINT);
                } catch (CoreException e) {
                try {
            }
    }

    }
                try {
                    } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
public class DatabaseDetailPaneFactory implements IDetailPaneFactory {
                IBreakpoint breakpoint = (IBreakpoint) first;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public Set<String> getDetailPaneTypes(IStructuredSelection selection) {
        }
