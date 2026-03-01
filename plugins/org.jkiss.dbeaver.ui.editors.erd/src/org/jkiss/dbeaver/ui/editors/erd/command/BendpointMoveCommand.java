        WireBendpoint bp = new WireBendpoint();
 */
/*
}

package org.jkiss.dbeaver.ui.editors.erd.command;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
/*
        bp.setRelativeDimensions(getFirstRelativeDimension(),
    private Bendpoint oldBendpoint;
    public BendpointMoveCommand(AssociationPart association, Point location, int bendpointIndex) {
        setOldBendpoint((Bendpoint) getWire().getBendpoints().get(getIndex()));
        association.moveBendpoint(bendpointIndex, location);
 *
import org.eclipse.draw2d.Bendpoint;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * limitations under the License.
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;

 * Unless required by applicable law or agreed to in writing, software

        this.bendpointIndex = bendpointIndex;
    @Override
*/
 *     http://www.apache.org/licenses/LICENSE-2.0

    private Point location;
        getWire().setBendpoint(getIndex(), bp);
        this.location = location;
    }
    public void undo() {
            getSecondRelativeDimension());

 * you may not use this file except in compliance with the License.
        super.execute();
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(association);

    private int bendpointIndex;
        super.undo();
*/

 *

    }
public class BendpointMoveCommand extends BendpointCommand {
import org.eclipse.draw2d.geometry.Point;

 * Copyright (C) 2010-2025 DBeaver Corp and others

 * DBeaver - Universal Database Manager
    @Override
        getWire().setBendpoint(getIndex(), getOldBendpoint());
    public void execute() {
