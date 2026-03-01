
		Rectangle bounds = notePart.getFigure().getBounds().getCopy();
 *
 * You may obtain a copy of the License at
 * @author Serge Rider
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
 * See the License for the specific language governing permissions and

import org.eclipse.gef.requests.GroupRequest;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
		EntityDiagram parent = (EntityDiagram) (notePart.getParent().getModel());
 * limitations under the License.
public class NoteEditPolicy extends ComponentEditPolicy
	}
package org.jkiss.dbeaver.ui.editors.erd.policy;
}import org.eclipse.gef.commands.Command;
		return new NoteDeleteCommand(parent, notePart, bounds);
		NotePart notePart = (NotePart) getHost();
import org.jkiss.dbeaver.ui.editors.erd.command.NoteDeleteCommand;
{
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
 */
    protected Command createDeleteCommand(GroupRequest request)
/**
 * Handles deletion of tables
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*

	@Override
import org.eclipse.draw2d.geometry.Rectangle;
	
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
	{
 */
 *
 *
