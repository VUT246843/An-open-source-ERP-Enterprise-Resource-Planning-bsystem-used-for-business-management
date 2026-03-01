        }
    public static final String PROP_CAN_UNDO = "canUndo";

                    case PROP_CAN_UNDO:
    public static final String PROP_DIRTY = "dirty";
            }
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.editors.entity";

    {
import org.jkiss.dbeaver.Log;
        return false;
    }
            return editor.isDirty();
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);

 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.entity;
} * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 */
        IUndoManager undoManager = editor.getAdapter(IUndoManager.class);
                    case PROP_CAN_REDO:

    public static final String PROP_CAN_REDO = "canRedo";

        }
import org.jkiss.dbeaver.ui.editors.entity.handlers.ObjectPropertySwitchToSourceHandler;
                        return commandContext.getRedoCommand() != null;
{
 * DBeaver - Universal Database Manager
        super();

                }
import org.eclipse.core.expressions.PropertyTester;
        EntityEditor editor = (EntityEditor)receiver;
import org.eclipse.jface.text.IUndoManager;
 * EntityEditorPropertyTester
            return false;
            return ObjectPropertySwitchToSourceHandler.findSourceTextEditorId(editor) != null;

/**

import org.jkiss.dbeaver.ui.ActionUtils;
        if (PROP_DIRTY.equals(property)) {
    public static void firePropertyChange(String propName)
 *
 * you may not use this file except in compliance with the License.
    }
                case PROP_CAN_REDO:
    }
        }
    public static final String PROP_HAS_SOURCE = "hasSource";
                case PROP_CAN_UNDO:
public class EntityEditorPropertyTester extends PropertyTester
 * You may obtain a copy of the License at
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 *
                    return undoManager.redoable();
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
                        return commandContext.getUndoCommand() != null;
        if (!(receiver instanceof EntityEditor)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    return undoManager.undoable();
        } else if (PROP_HAS_SOURCE.equals(property)) {
 */
            switch (property) {
            if (commandContext != null) {

            }
        if (undoManager != null) {
/*
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
            DBECommandContext commandContext = editor.getEditorInput().getCommandContext();
    private static final Log log = Log.getLog(EntityEditorPropertyTester.class);
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
                switch (property) {
    public EntityEditorPropertyTester() {
