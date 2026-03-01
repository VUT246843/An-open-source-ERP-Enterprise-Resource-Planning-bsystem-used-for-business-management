 */

 * You may obtain a copy of the License at
/*
 * limitations under the License.
 * @see org.eclipse.gef.palette.SelectionToolEntry
 * This class is used to override default GEF icons.
public class SelectionToolEntry extends ToolEntry {
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.gef.tools.SelectionTool;
        setUserModificationPermission(PERMISSION_NO_MODIFICATION);

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.eclipse.gef.palette.ToolEntry;
import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
 *
}
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
/**
 * DBeaver - Universal Database Manager
    public SelectionToolEntry() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        super("Select", "Select diagram objects", DBeaverIcons.getImageDescriptor(ERDIcon.SELECT), DBeaverIcons.getImageDescriptor(ERDIcon.SELECT), SelectionTool.class);
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
 * See the License for the specific language governing permissions and
