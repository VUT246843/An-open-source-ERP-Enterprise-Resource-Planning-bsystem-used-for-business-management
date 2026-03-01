 */
}
 *
        setToolTipText(getDescription());
 *

    @Override
    private final ERDEditorEmbedded editor;
        return editor.isStateSaved();
        this.editor = editor;
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
public class DiagramTogglePersistAction extends Action {
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
            editor.doSave(new NullProgressMonitor());
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorEmbedded;
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        setImageDescriptor(DBeaverIcons.getImageDescriptor(ERDIcon.LAYOUT_SAVE));
        super(ERDUIMessages.erd_action_diagram_toggle_persist_text, AS_CHECK_BOX);
            boolean refreshDiagram = UIUtils.confirmAction(ERDUIMessages.erd_action_diagram_toggle_persist_confirmation_title,
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void run() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {

        if (isChecked()) {
 * Unless required by applicable law or agreed to in writing, software
 */
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * Created on Jul 23, 2004
 */
import org.jkiss.dbeaver.ui.DBeaverIcons;
        }
    public boolean isChecked() {
    public DiagramTogglePersistAction(ERDEditorEmbedded editor) {
import org.eclipse.core.runtime.NullProgressMonitor;
                    ERDUIMessages.erd_action_diagram_toggle_persist_confirmation_description);

 * Action to toggle diagram persistence
            editor.resetSavedState(refreshDiagram);
        setDescription(ERDUIMessages.erd_action_diagram_toggle_persist_description);
 * limitations under the License.

    }
/*
package org.jkiss.dbeaver.ui.editors.erd.action;
 * DBeaver - Universal Database Manager
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.action.Action;

import org.jkiss.dbeaver.ui.editors.erd.ERDIcon;
    }
