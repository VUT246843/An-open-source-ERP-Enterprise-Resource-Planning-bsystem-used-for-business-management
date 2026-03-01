}
        association.removeBendpoint(bendpointIndex);
        getWire().insertBendpoint(getIndex(), bendpoint);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        super.undo();
*/

    public void execute() {
 *
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;
    }

package org.jkiss.dbeaver.ui.editors.erd.command;

public class BendpointDeleteCommand extends BendpointCommand {
 * Unless required by applicable law or agreed to in writing, software
 *
/*
        this.bendpointIndex = bendpointIndex;
 * DBeaver - Universal Database Manager

 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0

    }

        super(association);
    public void undo() {
 * you may not use this file except in compliance with the License.

/*
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public BendpointDeleteCommand(AssociationPart association, int bendpointIndex) {
 * You may obtain a copy of the License at
 */
    private int bendpointIndex;
 * limitations under the License.
    @Override

