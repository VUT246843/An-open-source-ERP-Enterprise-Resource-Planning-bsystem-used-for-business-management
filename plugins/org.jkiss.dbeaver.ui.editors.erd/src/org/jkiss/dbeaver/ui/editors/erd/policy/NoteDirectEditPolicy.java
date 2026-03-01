        String value = (String) request.getCellEditor().getValue();

 */
 *
    protected void revertOldEditValue(DirectEditRequest request) {
import org.eclipse.gef.editpolicies.DirectEditPolicy;
        return new NoteSetTextCommand((NotePart) getHost(), newNote);
        CellEditor cellEditor = request.getCellEditor();
 */


    private String oldValue;
 * distributed under the License is distributed on an "AS IS" BASIS,
        String newNote = (String) cellEditor.getValue();
 * @author Serge Rider
        oldValue = (String) cellEditor.getValue();
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.jface.viewers.CellEditor;
 * You may obtain a copy of the License at
    @Override
 * limitations under the License.
 *

    protected void storeOldEditValue(DirectEditRequest request) {
        CellEditor cellEditor = request.getCellEditor();
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;
    }


    protected Command getDirectEditCommand(DirectEditRequest request) {
    protected void showCurrentEditValue(DirectEditRequest request) {
        entityPart.revertNameChange();
 * you may not use this file except in compliance with the License.
    @Override
        NotePart notePart = (NotePart) getHost();

package org.jkiss.dbeaver.ui.editors.erd.policy;
 * DBeaver - Universal Database Manager
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        NotePart entityPart = (NotePart) getHost();
        cellEditor.setValue(oldValue);
        notePart.handleNameChange(value);

} *
 * EditPolicy for the direct editing of table names
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
public class NoteDirectEditPolicy extends DirectEditPolicy {
 *
    @Override
        CellEditor cellEditor = request.getCellEditor();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.erd.command.NoteSetTextCommand;
 * See the License for the specific language governing permissions and
/**
import org.eclipse.gef.commands.Command;
 * Licensed under the Apache License, Version 2.0 (the "License");
