 * Unless required by applicable law or agreed to in writing, software
    public BendpointCommand(AssociationPart association) {
 * distributed under the License is distributed on an "AS IS" BASIS,

}    }
 * you may not use this file except in compliance with the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
    protected final AssociationPart association;
public abstract class BendpointCommand extends Command {
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
 * See the License for the specific language governing permissions and
        this.association = association;

/*
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;

 *
package org.jkiss.dbeaver.ui.editors.erd.command;
 * limitations under the License.
import org.eclipse.gef.commands.Command;

 * Licensed under the Apache License, Version 2.0 (the "License");
