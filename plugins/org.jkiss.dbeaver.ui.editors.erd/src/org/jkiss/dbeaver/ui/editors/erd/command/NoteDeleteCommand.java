 *

	}
    public void execute()
	 * @see org.eclipse.gef.commands.Command#redo()
 * You may obtain a copy of the License at
 *
	/**
 * Command to delete tables from the schema
	/**
	 * @see org.eclipse.gef.commands.Command#execute()
 * Licensed under the Apache License, Version 2.0 (the "License");

    private NotePart notePart;
{
    public void undo()
        this.note = notePart.getNote();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 */
import org.eclipse.draw2d.geometry.Rectangle;
	@Override
        this.bounds = originalBounds;
	}
package org.jkiss.dbeaver.ui.editors.erd.command;
import org.jkiss.dbeaver.model.erd.ERDNote;
    public NoteDeleteCommand(EntityDiagram entityDiagram, NotePart notePart, Rectangle originalBounds) {
	@Override
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
	@Override
/*
	 */

	private EntityDiagram entityDiagram;


	private ERDNote note;

	{
	}
 * 
 * DBeaver - Universal Database Manager
public class NoteDeleteCommand extends Command
 * See the License for the specific language governing permissions and
    public void redo()

 * Copyright (C) 2010-2025 DBeaver Corp and others
	{
	 */
 *     http://www.apache.org/licenses/LICENSE-2.0
		entityDiagram.addNote(note, true);
	{
        this.entityDiagram = entityDiagram;
 */
        this.notePart = notePart;
	private Rectangle bounds;
 * @author Serge Rider
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;
/**
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.gef.commands.Command;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
}
		execute();
		entityDiagram.removeNote(note, true);
 * limitations under the License.
 *
