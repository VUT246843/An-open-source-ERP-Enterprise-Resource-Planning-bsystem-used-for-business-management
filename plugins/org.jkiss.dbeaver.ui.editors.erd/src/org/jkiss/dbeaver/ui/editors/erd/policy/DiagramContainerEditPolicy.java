
/**
        }
        DiagramPart diagramPart = (DiagramPart) getHost();
    {

 * Handles creation of new tables using drag and drop or point and click from the palette
import org.jkiss.dbeaver.model.erd.ERDEntity;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
    }
        if (REQ_MOVE.equals(request.getType())) {
import org.jkiss.dbeaver.model.erd.ERDNote;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Collection;
 *
            return null;
     * @see AbstractEditPolicy#getTargetEditPart(org.eclipse.gef.Request)
        }
import org.jkiss.dbeaver.ui.editors.erd.command.NoteCreateCommand;
 *
    @Override
    /**
            entities = Collections.singletonList((ERDEntity) newObject);
        } else if (newObject instanceof Collection) {
            entities = new ArrayList<>((Collection<ERDEntity>)newObject);
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
 * you may not use this file except in compliance with the License.
        Command entityAddCommand = diagramPart.createEntityAddCommand(entities, location);
    protected Command getAddCommand(GroupRequest request)
        }
    {
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
        //EditPart host = getTargetEditPart(request);
 *
import java.util.ArrayList;
import org.jkiss.utils.CommonUtils;
import org.eclipse.gef.commands.Command;
        diagramPart.getFigure().translateToRelative(location);
        }
        }
        }
            return getHost();
import org.eclipse.draw2d.geometry.Point;
    /**
     */
public class DiagramContainerEditPolicy extends ContainerEditPolicy {
 * Unless required by applicable law or agreed to in writing, software
     */
    }
 * @author Serge Rider
            return getHost();
    public EditPart getTargetEditPart(Request request)
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.eclipse.gef.requests.CreateRequest;
        return null;
/*
    @Override
            return new NoteCreateCommand(diagramPart, (ERDNote)newObject, location, request.getSize());

    protected Command getCreateCommand(CreateRequest request)
 */
        Object newObject = request.getNewObject();
        if (REQ_ADD.equals(request.getType())) {
        if (!entityAddCommand.canExecute()) {
    }

    @Override
 */
}import org.eclipse.gef.requests.GroupRequest;
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
            return null;
    /**
    {
        if (CommonUtils.isEmpty(entities)) {
import java.util.List;

 * DBeaver - Universal Database Manager
            return getHost();
        List<ERDEntity> entities = null;

        }
        if (newObject instanceof ERDNote) {
        if (newObject instanceof ERDEntity) {
     * @see org.eclipse.gef.editpolicies.ContainerEditPolicy#getAddCommand(org.eclipse.gef.requests.GroupRequest)
 *
        return super.getTargetEditPart(request);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
        Point location = request.getLocation();

        return entityAddCommand;
     */
 * limitations under the License.
        EditPart host = getTargetEditPart(request);
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @see ContainerEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
import org.eclipse.gef.Request;
import java.util.Collections;
        if (REQ_CREATE.equals(request.getType())) {
package org.jkiss.dbeaver.ui.editors.erd.policy;
