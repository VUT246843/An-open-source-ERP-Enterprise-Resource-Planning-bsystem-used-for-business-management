 */
		if (REQ_RESIZE.equals(request.getType())) {
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
	@Override
		Rectangle newBounds = (Rectangle) constraint;
    protected Command getCreateCommand(CreateRequest request)

}import org.eclipse.gef.EditPart;
	/**
		Rectangle rectangle = constraint instanceof Rectangle ? (Rectangle) constraint : null;
 * DBeaver - Universal Database Manager
        }
	 */
        if (!ALLOW_ENTITY_RESIZE && nodePart instanceof EntityPart) {
 *
		Object constraint = fig.getParent().getLayoutManager().getConstraint(fig);

	@Override
/*
	/**
 * limitations under the License.

                return null;
	 * Creates command to move table. Does not allow table to be resized
    protected Command createAddCommand(EditPart child, Object constraint)
 * Unless required by applicable law or agreed to in writing, software
	@Override
 * 
public class DiagramXYLayoutPolicy extends XYLayoutEditPolicy

	}

                return null;
import org.jkiss.dbeaver.ui.editors.erd.command.NodeMoveCommand;
import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;
	{
			rectangle = fig.getBounds();
		return null;
	}
 * XYLayoutManagers, not for automatic layout

            if (oldBounds.height != newBounds.height && newBounds.height != -1)
import org.eclipse.draw2d.Figure;


	@Override
        // Restrict resize for entities
    public Rectangle getCurrentConstraintFor(GraphicalEditPart child)
		//DiagramPart diagramPart = (DiagramPart) nodePart.getParent();
	private static final boolean ALLOW_ENTITY_RESIZE = true;
		return null;
    protected Command createChangeConstraintCommand(EditPart child, Object constraint)
		IFigure fig = child.getFigure();
	 * Returns the current bounds as the constraint if none can be found in the
	}
import org.eclipse.draw2d.IFigure;
	}
import org.eclipse.draw2d.geometry.Rectangle;
{
/**
		Figure figure = (Figure) nodePart.getFigure();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.gef.GraphicalEditPart;
		return super.getCommand(request);
package org.jkiss.dbeaver.ui.editors.erd.policy;
	}
import org.eclipse.gef.commands.Command;
	 */
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and
		}
 *
 * you may not use this file except in compliance with the License.
	}
	{
	@Override
	{
 * You may obtain a copy of the License at
			return null;//getHost();

	public Command getCommand(Request request) {

import org.eclipse.gef.requests.CreateRequest;
		if (!(constraint instanceof Rectangle))
		return rectangle;
	 * figures Constraint object
		Rectangle oldBounds = figure.getBounds();
	@Override
 * Handles manual layout editing for schema diagram. Only available for
		}

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
		NodePart nodePart = (NodePart) child;
			return null;
			return null;
	{
		if (rectangle == null) {

		return null;
            if (oldBounds.width != newBounds.width && newBounds.width != -1)
 * @author Serge Rider
		if (!(child instanceof NodePart))
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
	{
    protected Command getDeleteDependantCommand(Request request)
		return new NodeMoveCommand(nodePart, oldBounds.getCopy(), newBounds.getCopy());


import org.eclipse.gef.Request;
