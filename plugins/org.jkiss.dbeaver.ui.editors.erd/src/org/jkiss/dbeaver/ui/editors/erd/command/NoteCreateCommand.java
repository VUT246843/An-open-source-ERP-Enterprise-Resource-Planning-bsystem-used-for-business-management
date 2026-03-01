            }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            for (Object diagramChild : diagramPart.getChildren()) {
                }
 * you may not use this file except in compliance with the License.
    public NoteCreateCommand(DiagramPart diagram, ERDNote note, Point location, Dimension size)
        this.diagramPart = diagram;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    NotePart notePart = (NotePart) diagramChild;
                        notePart.modifyBounds(newBounds);
    public void execute()
        //diagramPart.getDiagram().addModelRelations(monitor, table, true);
        this.size = size;

import org.eclipse.draw2d.geometry.Point;

                            size = notePart.getFigure().getPreferredSize();
	private DiagramPart diagramPart;
{
import org.eclipse.gef.commands.Command;
public class NoteCreateCommand extends Command
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
	private ERDNote note;
	{
        diagramPart.getDiagram().removeNote(note, true);
    {
import org.jkiss.dbeaver.model.erd.ERDNote;
            // Set new note location
	}
                        }
 */

        this.note = note;
 *
    }
}package org.jkiss.dbeaver.ui.editors.erd.command;
    private Dimension size;
                if (diagramChild instanceof NotePart) {

/*
                    }
 * See the License for the specific language governing permissions and
                    if (notePart.getNote() == note) {
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
                        break;
        diagramPart.getDiagram().addNote(note, true);
        if (location != null) {
import org.eclipse.draw2d.geometry.Dimension;

    private Point location;
                        Dimension size = this.size;
    }

 *
    {
/**
        }
 * You may obtain a copy of the License at
    @Override
                        if (size == null || size.width <= 0 || size.height <= 0) {
import org.eclipse.draw2d.geometry.Rectangle;
 */
        this.location = location;

 * Add entity to diagram
    public void undo()
    @Override

 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
                        final Rectangle newBounds = new Rectangle(location.x, location.y, size.width, size.height);
 * Licensed under the Apache License, Version 2.0 (the "License");
