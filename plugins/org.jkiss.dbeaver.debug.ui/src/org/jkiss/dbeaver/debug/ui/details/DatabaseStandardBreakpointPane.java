 *     http://www.apache.org/licenses/LICENSE-2.0
public class DatabaseStandardBreakpointPane extends DatabaseDebugDetailPane<DatabaseBreakpointEditor> {
import org.eclipse.swt.widgets.Composite;
    }
 */

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.debug.ui.DebugUI;

 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.debug.ui.details;
        super(DebugUIMessages.DatabaseStandardBreakpointPane_name,
        return new DatabaseBreakpointEditor();
 * limitations under the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
/*


    public DatabaseStandardBreakpointPane() {
 * See the License for the specific language governing permissions and
 *

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
            + "DETAIL_PANE_STANDARD_BREAKPOINT"; //$NON-NLS-1$
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

    public static final String DETAIL_PANE_STANDARD_BREAKPOINT = DebugUI.BUNDLE_SYMBOLIC_NAME + '.'
 *
                DebugUIMessages.DatabaseStandardBreakpointPane_description, DETAIL_PANE_STANDARD_BREAKPOINT);
import org.jkiss.dbeaver.debug.ui.internal.DebugUIMessages;
    protected DatabaseBreakpointEditor createEditor(Composite parent) {

