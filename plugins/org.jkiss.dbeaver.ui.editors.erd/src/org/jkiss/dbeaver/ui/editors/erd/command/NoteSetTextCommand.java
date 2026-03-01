/**

 * See the License for the specific language governing permissions and
        this.note = note;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
        this.oldText = this.note.getName();
 *
    private NotePart note;
    }
        note.getNote().setObject(newText);
    private String oldText;
} */
package org.jkiss.dbeaver.ui.editors.erd.command;


 * limitations under the License.
 */
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        note.getNote().setObject(oldText);
    public void execute() {
    @Override
public class NoteSetTextCommand extends Command {

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.erd.figures.NoteFigure;
 *     http://www.apache.org/licenses/LICENSE-2.0
        ((NoteFigure) note.getFigure()).setText(oldText);

    private String newText;
    public void undo() {
        this.newText = newText;

 * Change note text
    }
import org.eclipse.gef.commands.Command;
        super("Set note text");

 * DBeaver - Universal Database Manager
    public NoteSetTextCommand(NotePart note, String newText) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 *
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        ((NoteFigure) note.getFigure()).setText(newText);
 *
