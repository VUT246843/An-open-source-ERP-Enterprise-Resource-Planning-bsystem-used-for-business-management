 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

	
	private DefaultEditDomain editDomain;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
		getGraphicalViewer().setRootEditPart(new FreeformGraphicalRootEditPart());


}
	public void createPartControl(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.draw2d.ColorConstants;
 *
import org.eclipse.gef.GraphicalViewer;

import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphManager;
	
	}
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
	{
			}
			    
	}
	}
		getGraphicalViewer().createControl(parent);

	public void drawGraf(DBAServerLock selection)
		if (g == null) return;
 */
		setEditDomain(new DefaultEditDomain(null));
        this.viewer = viewer;
 * you may not use this file except in compliance with the License.
public class LockGraphicalView extends ViewPart {
			@Override
        this.graphManager = viewer.getGraphManager();
	

		if (g != EMPTY_GRAPH) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
	protected GraphicalViewer getGraphicalViewer() {
	@Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.part.ViewPart;
				

		
	public LockGraphicalView(LockManagerViewer viewer) {
		
 *
	}
		getGraphicalViewer().setEditPartFactory(new LockGraphEditPartFactory());

		return this.editDomain;
package org.jkiss.dbeaver.ui.editors.locks.graph;
	}
	protected DefaultEditDomain getEditDomain() {
import org.jkiss.dbeaver.ui.editors.locks.manage.LockManagerViewer;
		});
 * distributed under the License is distributed on an "AS IS" BASIS,
		LockGraph g = selection == null ? EMPTY_GRAPH : graphManager.getGraph(selection);
/*
*/
	private static final LockGraph EMPTY_GRAPH = new LockGraph(null);
	private GraphicalViewer graphicalViewer;
 * DBeaver - Universal Database Manager
/*
		
	protected void setEditDomain(DefaultEditDomain anEditDomain) {
	private final LockGraphManager graphManager;


		getGraphicalViewer().setContextMenu(new ContextMenuProvider(graphicalViewer){

		this.graphicalViewer = viewer;
 * limitations under the License.

				menu.add(viewer.getKillAction());
 * See the License for the specific language governing permissions and
		if (selection == null) return;
		return this.graphicalViewer;
		}
import org.eclipse.gef.ContextMenuProvider;
 *
import org.eclipse.swt.widgets.Composite;
		getGraphicalViewer().getControl().setFocus();
	protected void setGraphicalViewer(GraphicalViewer viewer) {
	@Override
		getEditDomain().addViewer(viewer);

import org.eclipse.gef.DefaultEditDomain;
			g.setLockManagerViewer(viewer);
		setGraphicalViewer(new ScrollingGraphicalViewer());
		getGraphicalViewer().getControl().setBackground(ColorConstants.listBackground);
	
			
import org.jkiss.dbeaver.model.impl.admin.locks.LockGraph;
		getGraphicalViewer().setContents(g);
	private final LockManagerViewer viewer;
 * You may obtain a copy of the License at
		this.editDomain = anEditDomain;
			public void buildContextMenu(IMenuManager menu) {
	public void setFocus() {

	}		
		super();
	}
import org.eclipse.jface.action.IMenuManager;
	}
