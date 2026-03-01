

 * Licensed under the Apache License, Version 2.0 (the "License");
        command.setTargetEntity(part.getEntity());
        return new AssociationCreateCommand();
            return null;
import org.eclipse.gef.requests.GroupRequest;
}        command.setSourceEntity(srcPart.getEntity());
        if (!(srcParts.get(0) instanceof AttributePart)) {
    @Override
    @NotNull
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
            // Can drop only one attribute
        AttributePart srcPart = (AttributePart) srcParts.get(0);
        command.setAttributes(srcPart.getAttribute(), part.getAttribute());
		ERDEntity table = entityPart.getTable();
 *
 */
			return null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Object newObject = request.getNewObject();
import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;

        return command;
 * you may not use this file except in compliance with the License.


            // Can't drop attribute to the same parent
    }
    protected final AttributePart part;
*/
import org.jkiss.dbeaver.ui.editors.erd.command.AssociationCreateCommand;
import java.util.List;
        if (srcParts.size() != 1) {
        AssociationCreateCommand command = makeAssociationCreateCommand();
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * Unless required by applicable law or agreed to in writing, software
		ERDEntityAttribute column = (ERDEntityAttribute) newObject;
 * You may obtain a copy of the License at
    protected Command getAddCommand(GroupRequest request) {
package org.jkiss.dbeaver.ui.editors.erd.policy;
    }
        }
        this.part = part;
            // Not attribute
        return super.getCloneCommand(request);
    protected AssociationCreateCommand makeAssociationCreateCommand() {
 * See the License for the specific language governing permissions and
            return null;
            return null;
		return command;

import org.eclipse.gef.commands.Command;
public class AttributeConnectionEditPolicy extends AttributeContainerEditPolicy {
		AttributeCreateCommand command = new AttributeCreateCommand();
 * DBeaver - Universal Database Manager
 * limitations under the License.
    }
import org.eclipse.gef.requests.CreateRequest;
		command.setTable(table);
		EntityPart entityPart = (EntityPart) getHost();
		command.setColumn(column);
    protected Command getCloneCommand(ChangeBoundsRequest request) {
 *
    protected Command getCreateCommand(CreateRequest request) {
        }
        return null;
 */

    public AttributeConnectionEditPolicy(AttributePart part) {
        List srcParts = request.getEditParts();
    }
    }

		}
import org.jkiss.code.NotNull;

/*
 *

/*
        }

import org.eclipse.gef.requests.ChangeBoundsRequest;
		
		if (!(newObject instanceof ERDEntityAttribute))
 * Edit policy for logical connections creation
		{
        if (srcPart.getParent() == part.getParent()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
