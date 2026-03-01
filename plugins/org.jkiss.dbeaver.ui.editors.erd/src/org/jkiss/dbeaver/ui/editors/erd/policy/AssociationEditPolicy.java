{
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 */
 * @author Serge Rider
	{
package org.jkiss.dbeaver.ui.editors.erd.policy;
		return new AssociationDeleteCommand((AssociationPart)getHost());
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;
 * DBeaver - Universal Database Manager
	@Override
 *
import org.eclipse.gef.commands.Command;
	
 *
import org.eclipse.gef.requests.GroupRequest;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
}/*
 * You may obtain a copy of the License at
 * EditPolicy to handle deletion of relationships
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
 * limitations under the License.
 *
    protected Command createDeleteCommand(GroupRequest request)
 * Copyright (C) 2010-2025 DBeaver Corp and others

 */
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
/**
import org.jkiss.dbeaver.ui.editors.erd.command.AssociationDeleteCommand;

public class AssociationEditPolicy extends ComponentEditPolicy
