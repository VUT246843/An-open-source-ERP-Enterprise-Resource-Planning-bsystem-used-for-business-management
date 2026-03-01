        return super.getAddCommand(request);
import org.eclipse.gef.requests.ChangeBoundsRequest;
		command.setTable(table);
		EntityPart entityPart = (EntityPart) getHost();
/**
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
 * You may obtain a copy of the License at
		ERDEntity table = entityPart.getTable();
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
		if (!(newObject instanceof ERDEntityAttribute))
public class AttributeContainerEditPolicy extends ContainerEditPolicy {
    protected Command getAddCommand(GroupRequest request) {
}    @Override
 * See the License for the specific language governing permissions and

    protected Command getCloneCommand(ChangeBoundsRequest request) {
        Object newObject = request.getNewObject();
 *     http://www.apache.org/licenses/LICENSE-2.0
        return super.getCloneCommand(request);
/*
        return null;
 * Unless required by applicable law or agreed to in writing, software
 */
import org.eclipse.gef.commands.Command;
    @Override
		ERDEntityAttribute column = (ERDEntityAttribute) newObject;
		{
    }
 * @author Serge Rider
		return command;
 * Edit policy for attribute container

			return null;
		AttributeCreateCommand command = new AttributeCreateCommand();
/*
import org.eclipse.gef.requests.CreateRequest;
    protected Command getCreateCommand(CreateRequest request) {
    }
 * DBeaver - Universal Database Manager

		command.setColumn(column);
    @Override
		}
 * you may not use this file except in compliance with the License.
 * limitations under the License.
		
 *
*/
import org.eclipse.gef.requests.GroupRequest;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

package org.jkiss.dbeaver.ui.editors.erd.policy;
 */
