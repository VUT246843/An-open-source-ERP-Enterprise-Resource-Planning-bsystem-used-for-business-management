import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.IStatus;
    public void setFocus() {
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

        return createStandardControls(parent);
    @Override
    public static final int PROP_HIT_COUNT_ENABLED = 0x1005;
            }
 * limitations under the License.
}
        // do nothing
    public Control createControl(Composite parent) {

    public void doSave() throws CoreException {

    public IStatus getStatus() {
import org.jkiss.dbeaver.debug.core.breakpoints.IDatabaseBreakpoint;
 * Unless required by applicable law or agreed to in writing, software
            suppressPropertyChanges(false);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        try {


import org.eclipse.swt.widgets.Control;
 * Licensed under the Apache License, Version 2.0 (the "License");
        setDirty(false);
 * You may obtain a copy of the License at
    public void setInput(Object input) throws CoreException {

 *
    @Override

        return Status.OK_STATUS;
    }

    @Override
        }
    @Override
    public static final int PROP_HIT_COUNT = 0x1006;
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.debug.ui.Widgets;
    private IDatabaseBreakpoint fBreakpoint;
 *
    @Override
package org.jkiss.dbeaver.debug.ui.details;
        return fBreakpoint;
 *
     */

     * Property id for breakpoint hit count.

/*
     */
            if (input instanceof IDatabaseBreakpoint) {
    protected void setBreakpoint(IDatabaseBreakpoint breakpoint) throws CoreException {
        Composite composite = Widgets.createComposite(parent, parent.getFont(), 4, 1, 0, 0, 0);
        fBreakpoint = breakpoint;
    }
    }
 * DBeaver - Universal Database Manager

    }

    }
        } finally {
    @Override
 * you may not use this file except in compliance with the License.
 */
                setBreakpoint(null);
 * See the License for the specific language governing permissions and
    public Object getInput() {

 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
            } else {
import org.eclipse.core.runtime.CoreException;
     * Property id for hit count enabled state.
public class DatabaseBreakpointEditor extends DatabaseDebugDetailEditor {


        setDirty(false);
    /**
    }
                setBreakpoint((IDatabaseBreakpoint) input);
        return composite;
            suppressPropertyChanges(true);
    protected Control createStandardControls(Composite parent) {
