		new StandaloneNodeConnector(diagram).visit(graph);
import org.eclipse.draw2d.graph.DirectedGraph;
		

		// are not in relationships
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.editors.erd.layout.algorithm.direct;
 *     http://www.apache.org/licenses/LICENSE-2.0
	}
import org.eclipse.draw2d.graph.DirectedGraphLayout;
 * 
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.diagram = diagram;
	@Override
 * Unless required by applicable law or agreed to in writing, software



		//add dummy edges so that graph does not fall over because some nodes

 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
 * of clusters isolated from other clusters of Nodes
 *
 * See the License for the specific language governing permissions and
	 * @param graph public method called to handle layout task
    }
    public void visit(DirectedGraph graph)
/*
    {
        // TODO: what the reason to do it???
}import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
 */
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		//new ClusterEdgeCreator().visit(graph);
        // TODO: investigate - cluster edges makes diagram ugly
 *
/*
 * functionality to be used even when graph nodes either have no edges, or when part
 * Created on Jul 16, 2004
    /**
	 */
    public NodeJoiningDirectedGraphLayout(AbstractGraphicalEditPart diagram)
		super.visit(graph);
{
public class NodeJoiningDirectedGraphLayout extends DirectedGraphLayout
/**
	{
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 * Extended version of DirectedGraphLayout which allows DirectedGraphLayout
    private AbstractGraphicalEditPart diagram;
		// create edges to join any isolated clusters
 * @author Serge Rider

 * limitations under the License.
 */
