 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        editor.getDiagramPart().resetArrangement();

import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
 * you may not use this file except in compliance with the License.
        super(ERDUIMessages.action_diagram_layout_name, DBeaverIcons.getImageDescriptor(ERDIcon.ARRANGE_ALL));
/**
 *
import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
}        editor.setDirty(true);
 */
 */
    public void run() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 *
public class DiagramLayoutAction extends Action {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.erd.action;

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
 * Action to toggle the layout between manual and automatic
 * limitations under the License.
        this.editor = editor;

 *
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;

 * You may obtain a copy of the License at
import org.eclipse.jface.action.Action;
    private ERDEditorPart editor;
 * @author Serge Rider
 * Created on Jul 23, 2004
import org.jkiss.dbeaver.ui.DBeaverIcons;

 * Licensed under the Apache License, Version 2.0 (the "License");
    public DiagramLayoutAction(ERDEditorPart editor) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    }
/*
