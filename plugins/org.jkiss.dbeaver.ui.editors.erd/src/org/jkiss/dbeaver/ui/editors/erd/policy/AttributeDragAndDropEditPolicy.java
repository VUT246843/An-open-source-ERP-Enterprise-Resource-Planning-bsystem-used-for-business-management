    public boolean understandsRequest(Request req) {
    }

        this.part = part;
        }
package org.jkiss.dbeaver.ui.editors.erd.policy;

 */
 * limitations under the License.
 * See the License for the specific language governing permissions and
            RequestConstants.REQ_CLONE.equals(req.getType()) ||
 *
            RequestConstants.REQ_ORPHAN.equals(req.getType()))
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public Command getCommand(Request req) {
 *

 */
        {
    @Override
 * You may obtain a copy of the License at
    public AttributeDragAndDropEditPolicy(AttributePart part) {
            RequestConstants.REQ_ORPHAN.equals(req.getType())) {
import org.eclipse.gef.commands.Command;
/**
/*
    }

 * @author Serge Rider
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.gef.Request;
 * EditPolicy for the direct editing of Column names

import org.eclipse.gef.RequestConstants;
        return super.getCommand(req);
public class AttributeDragAndDropEditPolicy extends GraphicalEditPolicy {
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
            RequestConstants.REQ_CLONE.equals(req.getType()) ||
import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        }
            return true;
        return super.understandsRequest(req);
 * you may not use this file except in compliance with the License.
            // We come here if attribute target part is entity
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        if (RequestConstants.REQ_MOVE.equals(req.getType()) ||
        if (RequestConstants.REQ_MOVE.equals(req.getType()) ||
    }
}            return null;//new AttributeCheckCommand(part, false);
    private AttributePart part;
