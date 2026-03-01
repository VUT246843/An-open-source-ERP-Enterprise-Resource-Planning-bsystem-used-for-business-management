
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraph;


package org.jkiss.dbeaver.ui.editors.locks.graph;
	protected IFigure createFigure() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphNode;
	}
 * You may obtain a copy of the License at
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
	protected void createEditPolicies() {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
		return nodes;
}
				new LockGraphXYLayoutEditPolicy());

	}
	}
	protected void refreshVisuals() {
	@Override
		freeformLayer.setLayoutManager(new GridLayout(((LockGraph) getModel()).getMaxWidth(), true));
 * distributed under the License is distributed on an "AS IS" BASIS,
	protected List<LockGraphNode> getModelChildren() {
		connectionLayer.setConnectionRouter(new ShortestPathConnectionRouter(getFigure()));
		FreeformLayer freeformLayer = new FreeformLayer();
	@Override
 *
	
	
	@Override


		List<LockGraphNode> nodes = ((LockGraph) getModel()).getNodes();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
		ConnectionLayer connectionLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
import org.eclipse.gef.LayerConstants;
import java.util.List;
	} 
 * See the License for the specific language governing permissions and
	@Override
 */
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.draw2d.*;
 * limitations under the License.
public class LockGraphEditPart extends AbstractGraphicalEditPart {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.gef.EditPolicy;
		return freeformLayer;
