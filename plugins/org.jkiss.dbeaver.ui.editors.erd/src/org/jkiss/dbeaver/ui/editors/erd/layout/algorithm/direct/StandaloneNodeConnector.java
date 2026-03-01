package org.jkiss.dbeaver.ui.editors.erd.layout.algorithm.direct;

    private EdgeList edgeList;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            List<Node> unconnectedNodes = new ArrayList<>();
                }
                        return connCount1 - connCount2;
    //private boolean cleanNextTime = false;
 * Unless required by applicable law or agreed to in writing, software
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {

} * Creates dummy edges between nodes, to be used with NodeJoiningDirectedGraphLayout
                    final int connCount1 = o2.outgoing.size() + o2.incoming.size();
        this.diagram = diagram;
                @Override
    private AbstractGraphicalEditPart diagram;


                public int compare(Node o1, Node o2)
import java.util.Collections;
            Collections.sort(nodeList, new Comparator<Node>() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
                            return 0;
        // the nodes are connected
 *
    private NodeList nodeList;
                }
                    final int connCount2 = o1.outgoing.size() + o1.incoming.size();
                        Node targetNode = unconnectedNodes.get(i + 1);
                    for (int k = 0; k < nodesInLine - 1 && i < nodeCount - 1; k++, i++) {
            // Order nodes by their connections count
                double middleRowSize = Math.sqrt(nodeCount);
        this.edgeList = graph.edges;
            // Order unconnected nodes by their geometrical size
                Node sourceNode = (Node) nodeList.get(i);
 * You may obtain a copy of the License at
 */
        if (nodeList.size() > 1) {

            }
import java.util.Comparator;
    public void visit(DirectedGraph graph)
                for (int i = 0; i < nodeCount; i++) {
        this.nodeList = graph.nodes;

import org.eclipse.swt.graphics.Point;

 */
    }
                        edgeList.add(edge);
                }
 * DBeaver - Universal Database Manager


    }
        //if node count is only one then we don't have to worry about whether
        }
                    } else {
import java.util.ArrayList;
import org.eclipse.gef.NodeEditPart;
                if (sourceNode.outgoing.size() + sourceNode.incoming.size() == 0) {

                            return ((NodeEditPart) o1.data).getFigure().getMinimumSize().height - ((NodeEditPart) o2.data).getFigure().getMinimumSize().height;
    protected void setDummyEdges()
                {
/*
    {
            if (nodeCount > 1) {
 *
                    unconnectedNodes.add(sourceNode);

                        edge.weight = 2;


                final Point diagramSize = diagram.getViewer().getControl().getSize();
import org.eclipse.draw2d.graph.*;
                        }
import java.util.List;
    {
                        } else {
    public StandaloneNodeConnector(AbstractGraphicalEditPart diagram)
 * See the License for the specific language governing permissions and
 * @author Serge Rider
/**
        setDummyEdges();
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
    }

            final int nodeCount = unconnectedNodes.size();
            // Find unconnected nodes
 * limitations under the License.
 * Created on Jul 14, 2004
                int nodesInLine = (int)(middleRowSize * horizontalRatio) + 1;//(int)Math.sqrt(nodeCount) + 1;
 * distributed under the License is distributed on an "AS IS" BASIS,

/*
                        Node sourceNode = unconnectedNodes.get(i);

                // Connect all unconnected nodes between each other
            for (int i = 0; i < nodeList.size(); i++) {
                double horizontalRatio = (float)diagramSize.x / (float)diagramSize.y;
 *
                        if (o1.data instanceof NodeEditPart && o2.data instanceof NodeEditPart) {

            });

                    }
                        Edge edge = new Edge(null, sourceNode, targetNode);
                    if (connCount1 == 0 && connCount1 == connCount2) {
                    }
 */
public class StandaloneNodeConnector {
