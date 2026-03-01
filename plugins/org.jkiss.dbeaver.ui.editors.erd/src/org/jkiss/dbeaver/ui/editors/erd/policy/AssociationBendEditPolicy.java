            (AssociationPart) getHost(),
    protected Command getDeleteBendpointCommand(BendpointRequest request) {

        return new BendpointMoveCommand(
    protected Command getMoveBendpointCommand(BendpointRequest request) {
 */
{
 * limitations under the License.
/*
package org.jkiss.dbeaver.ui.editors.erd.policy;
            getRelativeLocation(request),
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }
        getConnection().translateToRelative(p);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

 *

}import org.eclipse.gef.requests.BendpointRequest;
    @Override
        return p;
        Point p = request.getLocation();
    }
import org.jkiss.dbeaver.ui.editors.erd.command.BendpointDeleteCommand;
            request.getIndex());
 * EditPolicy to handle deletion of relationships
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.erd.command.BendpointMoveCommand;
 * @author Serge Rider
            request.getIndex());
            (AssociationPart) getHost(),
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;

import org.eclipse.draw2d.geometry.Point;
import org.jkiss.dbeaver.ui.editors.erd.command.BendpointCreateCommand;

/**
import org.eclipse.gef.commands.Command;
    }
public class AssociationBendEditPolicy extends BendpointEditPolicy
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    {

        return new BendpointDeleteCommand((AssociationPart) getHost(), request.getIndex());

    @Override
    private Point getRelativeLocation(BendpointRequest request)
    protected Command getCreateBendpointCommand(BendpointRequest request) {
            getRelativeLocation(request),
 */

 * You may obtain a copy of the License at
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        return new BendpointCreateCommand(
