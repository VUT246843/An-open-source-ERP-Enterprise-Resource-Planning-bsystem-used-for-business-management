
        NodePart entityPart = (NodePart) getHost();
        return new AssociationReconnectSourceCommand();
        return cmd;
    }
        NodePart entityPart = (NodePart) getHost();
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class EntityConnectionEditPolicy extends GraphicalNodeEditPolicy {
    protected AssociationCreateCommand makeCreateCommand() {
    }
import org.jkiss.dbeaver.ui.editors.erd.command.AssociationCreateCommand;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.gef.commands.Command;

        return new AssociationCreateCommand();
    @Override
/*
    }
        AssociationReconnectSourceCommand cmd = makeReconnectSourceCommand();
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
        cmd.setSourceEntity(part.getElement());

    protected AssociationReconnectTargetCommand makeReconnectTargetCommand() {
    @Override
        cmd.setSourceEntity(entityPart.getElement());

        request.setStartCommand(cmd);
 *
        AssociationCreateCommand cmd = makeCreateCommand();
 * You may obtain a copy of the License at
        cmd.setTargetEntity(entityPart.getElement());
        AssociationReconnectTargetCommand cmd = makeReconnectTargetCommand();

    protected Command getReconnectTargetCommand(ReconnectRequest request) {
        return cmd;
 * DBeaver - Universal Database Manager
    @Override

    protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
    protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
    }

 *
    protected AssociationReconnectSourceCommand makeReconnectSourceCommand() {
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.erd.ERDAssociation;
        cmd.setEditor(part.getEditor());
 * Handles manipulation of relationships between tables
 */
 */
        return cmd;
        cmd.setRelationship((ERDAssociation) request.getConnectionEditPart().getModel());
import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;

import org.eclipse.gef.requests.ReconnectRequest;
 * Unless required by applicable law or agreed to in writing, software
    @Override


 * you may not use this file except in compliance with the License.
import org.eclipse.gef.requests.CreateConnectionRequest;
    }
        return cmd;
        cmd.setAssociation((ERDAssociation) request.getConnectionEditPart().getModel());
/**

    }
        AssociationCreateCommand cmd = (AssociationCreateCommand) request.getStartCommand();
        NodePart part = (NodePart) getHost();
    protected Command getReconnectSourceCommand(ReconnectRequest request) {
        cmd.setTargetEntity(part.getElement());
 * limitations under the License.
 *
import org.jkiss.dbeaver.ui.editors.erd.command.AssociationReconnectSourceCommand;
        NodePart part = (NodePart) request.getTargetEditPart();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.erd.command.AssociationReconnectTargetCommand;
}package org.jkiss.dbeaver.ui.editors.erd.policy;
        return new AssociationReconnectTargetCommand();
