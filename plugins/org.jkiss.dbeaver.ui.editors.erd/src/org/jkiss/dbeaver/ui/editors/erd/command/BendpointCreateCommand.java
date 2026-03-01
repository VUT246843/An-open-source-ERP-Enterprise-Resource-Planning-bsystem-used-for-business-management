
 *
 * You may obtain a copy of the License at
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(association);
 * you may not use this file except in compliance with the License.
    }
 * See the License for the specific language governing permissions and

/*
package org.jkiss.dbeaver.ui.editors.erd.command;
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;
import org.eclipse.draw2d.geometry.Point;
    public BendpointCreateCommand(AssociationPart association, Point location, int bendpointIndex) {
 * Unless required by applicable law or agreed to in writing, software

        this.bendpointIndex = bendpointIndex;
        this.location = location;
 * DBeaver - Universal Database Manager
    public void undo() {

    public void execute() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

}
    @Override
 *
        association.addBendpoint(bendpointIndex, location);

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
public class BendpointCreateCommand extends BendpointCommand {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        association.removeBendpoint(bendpointIndex);
 *

    private int bendpointIndex;

    private Point location;

