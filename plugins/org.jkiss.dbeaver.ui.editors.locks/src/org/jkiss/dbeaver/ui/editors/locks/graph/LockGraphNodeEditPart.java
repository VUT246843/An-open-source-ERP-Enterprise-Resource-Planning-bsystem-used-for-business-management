		return ((LockGraphNode) getModel()).getTargetEdges();
	@Override
*/
	public ConnectionAnchor getTargetConnectionAnchor(
	public boolean isSelectable() {
		@Override
		return this.sourceAnchor;
 * See the License for the specific language governing permissions and
			if (viewer != null) {
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	@Override

		LockGraph graph = (LockGraph) getParent().getModel();
 * Licensed under the Apache License, Version 2.0 (the "License");
		return this.targetAnchor;



import org.eclipse.draw2d.GridData;
			ConnectionEditPart connection) {

	@Override

import org.jkiss.dbeaver.model.impl.admin.locks.LockGraph;
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		LockGraphNode node = (LockGraphNode) getModel();
public class LockGraphNodeEditPart extends AbstractGraphicalEditPart {

			gridData.horizontalSpan =  span;
		} else if (spanMod > 0 && node.getLevelPosition() == LockGraphNode.LevelPosition.RIGHT) {
		gridData.horizontalSpan = 0 ;
		protected void hideSelection() {
package org.jkiss.dbeaver.ui.editors.locks.graph;
		gridData.grabExcessVerticalSpace = true;
		gridData.grabExcessHorizontalSpace = true;
	}
				viewer.setTableLockSelect(((LockGraphNode)getHost().getModel()).getLock());
		@Override
 * DBeaver - Universal Database Manager
	}
			ConnectionEditPart connection) {
			}

 * distributed under the License is distributed on an "AS IS" BASIS,

	protected List<LockGraphEdge> getModelSourceConnections() {

	@Override
 */
	public ConnectionAnchor getSourceConnectionAnchor(
		LockGraphNode node = (LockGraphNode) getModel();
			gridData.horizontalSpan =  span + spanMod;

		protected void showSelection() {
		return ((LockGraphNode) getModel()).getSourceEdges();
 * Unless required by applicable law or agreed to in writing, software
/*
		selectionPolicy.setDragAllowed(false);

	@Override
		this.sourceAnchor = new LockGraphConnectionAnchor(nodeFigure);
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
	protected void createEditPolicies() {

			LockManagerViewer viewer = ((LockGraph)getHost().getParent().getModel()).getLockManagerViewer();
		return this.targetAnchor;
 *     http://www.apache.org/licenses/LICENSE-2.0
		return nodeFigure;
	protected IFigure createFigure() {

		}
		return true;
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, selectionPolicy); 
	static class SelectionPolicy extends NonResizableEditPolicy {
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphEdge;
		LockGraph lgraph = (LockGraph)((LockGraphEditPart) getParent()).getModel();
import org.eclipse.draw2d.IFigure;
		}
		gridData.verticalAlignment = GridData.CENTER;
	}
import org.eclipse.draw2d.ConnectionAnchor;
	}
		return this.sourceAnchor;
		int spanMod =  lgraph.getMaxWidth() % node.getSpan();
		int span = lgraph.getMaxWidth() / node.getSpan();
	private LockGraphConnectionAnchor sourceAnchor;
		LockGraphEditPart graph = (LockGraphEditPart) getParent();

	}
	}

}
import org.eclipse.gef.Request;

 *
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

	protected List<LockGraphEdge> getModelTargetConnections() {

		LockGraphNodeFigure nodeFigure = (LockGraphNodeFigure) getFigure();
        GridData gridData = new GridData(55,30);		
 *

		this.targetAnchor = new LockGraphConnectionAnchor(nodeFigure);
import org.eclipse.gef.ConnectionEditPart;
	}
	
/*
		}

import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphNode;
		gridData.horizontalAlignment = GridData.CENTER;
	}
	@Override
	}
		graph.setLayoutConstraint(this, nodeFigure,gridData);
 * you may not use this file except in compliance with the License.
	}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		LockGraphNodeFigure nodeFigure = new LockGraphNodeFigure(node.getTitle(),(node == graph.getSelection()));
	}
	protected void refreshVisuals() {
import org.eclipse.gef.EditPolicy;
	private LockGraphConnectionAnchor targetAnchor;
		gridData.verticalSpan = 10;
 * Copyright (C) 2010-2025 DBeaver Corp and others
		SelectionPolicy selectionPolicy = new SelectionPolicy();

import java.util.List;
 * You may obtain a copy of the License at

		if (span > 1 && node.getLevelPosition() != LockGraphNode.LevelPosition.RIGHT) {
 *
 * limitations under the License.
