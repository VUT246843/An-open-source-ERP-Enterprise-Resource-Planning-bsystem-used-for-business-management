                return erdEditor.getCommandStack().canUndo();
 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
            case PROP_EDIT_MODE:
                    erdEditor.getCommandContext() != null;
    public static final String PROP_EDIT_MODE = "editMode";
            case PROP_IS_ERD:
/**
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.rm.RMConstants;

} *
            case SUPPORTS_STRUCTURE_EDIT:
 */
        switch (property) {
            case PROP_CAN_REDO:
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
import org.eclipse.core.expressions.PropertyTester;
    public static final String PROP_EDITABLE = "editable";
    public static final String SUPPORTS_STRUCTURE_EDIT = "supportsStructureEdit";

            return false;
    }
import org.eclipse.gef.ui.actions.DeleteAction;
                    && DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER);
        if (!(receiver instanceof ERDEditorPart erdEditor)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                return erdEditor.isERD();
        return false;
    public static final String PROP_CAN_REDO = "canRedo";

                return erdEditor.getCommandStack().canRedo();
    public static final String PROP_IS_ERD = "isERD";
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static final String PROP_CAN_UNDO = "canUndo";
                return !erdEditor.isReadOnly()
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
{
                DeleteAction deleteAction = new DeleteAction((IWorkbenchPart) erdEditor);
 * DBeaver - Universal Database Manager
                return erdEditor.getDecorator().supportsStructureEdit() &&
        }
                return erdEditor.getDiagram().isEditEnabled();
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.editors.erd.editor";
public class ERDEditorPropertyTester extends PropertyTester
        }
package org.jkiss.dbeaver.ui.editors.erd.action;
 */
/*
 * Unless required by applicable law or agreed to in writing, software

 * DatabaseEditorPropertyTester
                deleteAction.update();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IWorkbenchPart;
    public static final String PROP_CAN_DELETE = "canDelete";
            case PROP_EDITABLE:
            case PROP_CAN_UNDO:
            case PROP_CAN_DELETE:
                return deleteAction.isEnabled();
