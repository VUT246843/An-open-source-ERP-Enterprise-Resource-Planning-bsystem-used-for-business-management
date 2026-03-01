        List tcList = nodePart.getTargetConnections();
public class NodeMoveCommand extends Command
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.draw2d.geometry.Rectangle;
	}
 * @author Serge Rider
	{
	@Override
 * You may obtain a copy of the License at
	}
/**
            PolylineConnection pc = (PolylineConnection) as.getFigure();
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
	private Rectangle newBounds;
		this.oldBounds = oldBounds;
		this.nodePart = nodePart;
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
    public void undo()
	@Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
/*
 * 

 */
 *
	public NodeMoveCommand(NodePart nodePart, Rectangle oldBounds, Rectangle newBounds)
 * Copyright (C) 2010-2025 DBeaver Corp and others
*/
import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;
		super();
	private Rectangle oldBounds;
 * distributed under the License is distributed on an "AS IS" BASIS,
		this.newBounds = newBounds;
    public void execute()
        for (Object tc : tcList) {
	private NodePart nodePart;

{

	}
            pc.getConnectionRouter().route(pc);
package org.jkiss.dbeaver.ui.editors.erd.command;
import org.eclipse.gef.commands.Command;
 * Unless required by applicable law or agreed to in writing, software
}
        nodePart.modifyBounds(newBounds);
        }
	{
            AssociationPart as = (AssociationPart)tc ;

		nodePart.modifyBounds(oldBounds);
 */
	{
 * See the License for the specific language governing permissions and
 *
 * Command to move the bounds of an existing table. Only used with
 * XYLayoutEditPolicy (manual layout)

