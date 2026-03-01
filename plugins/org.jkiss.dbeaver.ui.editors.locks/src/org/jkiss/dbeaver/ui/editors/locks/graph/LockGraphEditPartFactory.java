		}
package org.jkiss.dbeaver.ui.editors.locks.graph;
}


import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphNode;
			editPart = new LockGraphNodeEditPart();
			
 *
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
/*
			

import org.jkiss.dbeaver.model.impl.admin.locks.LockGraph;
 *

	}

 * Unless required by applicable law or agreed to in writing, software
			editPart = new LockGraphEdgeEditPart();
		return editPart;
 */
		} else if (model instanceof LockGraphEdge) {
		
			
 * limitations under the License.
public class LockGraphEditPartFactory implements EditPartFactory {
 *
			
import org.eclipse.gef.EditPartFactory;
		if (model instanceof LockGraph) {
		} else if (model instanceof LockGraphNode) {
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphEdge;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.gef.EditPart;
 * See the License for the specific language governing permissions and

			
			
 * Licensed under the Apache License, Version 2.0 (the "License");
		if (editPart != null) {
		EditPart editPart = null;
 * DBeaver - Universal Database Manager
			
		
		}
 *     http://www.apache.org/licenses/LICENSE-2.0
			editPart = new LockGraphEditPart();
			editPart.setModel(model);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
	public EditPart createEditPart(EditPart context, Object model) {
