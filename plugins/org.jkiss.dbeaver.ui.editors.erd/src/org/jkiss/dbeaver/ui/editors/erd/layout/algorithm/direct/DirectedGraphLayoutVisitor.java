        if (nodeEditPart instanceof EntityPart) {
            Node targetAnchor = new Node("Fake node for target links", (Subgraph) entityNode);
 *
        }
    {
    {
            target = (Node) partToNodesMap.get(connectionPart.getTarget().getParent());
        e.setPadding(10);
                Node vn = edgeNodes.getNode(i);
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
            if (srcObject instanceof AbstractConnectionEditPart) {
package org.jkiss.dbeaver.ui.editors.erd.layout.algorithm.direct;
            conn.setRoutingConstraint(bends);
                        DirectedGraphLayout layout = null;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
                        if (diagramRouter.supportedAttributeAssociation()) {
 * from model objects
            }
                addConnectionEdges((AbstractConnectionEditPart) sourceConnection);
            source = ((Subgraph) source).members.getNode(0);
        ERDEntity entity = null;
        }
            if (child instanceof AttributePart) {
        IFigure tableFigure = entityPart.getFigure();

                    if (diagram instanceof DiagramPart diagramPart) {
                        ERDConnectionRouterDescriptor diagramRouter = editor.getDiagramRouter();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
                        ERDEditorPart editor = diagramPart.getEditor();
import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;
        entityNode.height = preferredSize.height;
					bends.add(new AbsoluteBendpoint(x, y + vn.height));
    //******************* DiagramPart apply methods **********/

            } else {
            targetAnchor.width = 0;
        e.weight = 2;
 */
            log.debug("Source or target node not found");
                        log.info("Object: " + srcObject.toString() + " is not an instance of AbstractConnectionEditPart.");
        for (int i = 0; i < sourceConnections.size(); i++) {
        //conn.setLineJoin(SWT.JOIN_BEVEL);

        entityNode.setPadding(decorator.getDefaultEntityInsets());
        if (source == null || target == null) {
        }
        List<?> outgoing = entityPart.getSourceConnections();
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
        Node entityNode = null;
            applyEntityResults((GraphicalEditPart) child);
                    } else {
        for (Object child : diagram.getChildren()) {
				if (connEdge.isFeedback()) {
        }
*/
        for (Object child : entityPart.getChildren()) {
                    }
                }
            for (Object sourceConnection : ((AttributePart) child).getSourceConnections()) {
 * distributed under the License is distributed on an "AS IS" BASIS,

                    }
                        AbstractConnectionEditPart connectionPart = (AbstractConnectionEditPart) srcObject;
        //IFigure fig = diagram.getFigure();
import org.eclipse.draw2d.graph.*;
public class DirectedGraphLayoutVisitor {
                        } else {
                        if (editor == null) {
            log.info("Can't find associated edge for connection.");
    }
        GraphAnimation.recordInitialState(diagram.getFigure());
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Public method for reading graph nodes
    {

     */
        if (source == null && connectionPart.getSource() != null) {
        Node n = (Node) partToNodesMap.get(entityPart);
            }
					bends.add(new AbsoluteBendpoint(x, y));
            targetAnchor.height = 0;

					bends.add(new AbsoluteBendpoint(x, y + vn.height));
        }
    protected void addDiagramEdges(AbstractGraphicalEditPart diagram)
*/
/**
    }
            source = (Node) partToNodesMap.get(connectionPart.getSource().getParent());
        }
 */
            bounds.translate(
        Edge connEdge = (Edge) partToNodesMap.get(connectionPart);
    /**
 * You may obtain a copy of the License at
            if (!graph.nodes.isEmpty()) {

            partToNodesMap = new IdentityHashMap<>();

import org.jkiss.dbeaver.ui.editors.erd.layout.GraphAnimation;
    public DirectedGraphLayoutVisitor(ERDDecorator decorator) {
                int x = vn.x;
 *
                            layout = new OrthoDirectedGraphLayout(diagram);
        //conn.setOpaque(true);

            }
import org.jkiss.dbeaver.model.erd.ERDEntity;

        }
            graph.setDirection(PositionConstants.EAST);
            sourceAnchor.width = 0;
 */
import org.jkiss.dbeaver.Log;
    }

import org.eclipse.gef.GraphicalEditPart;
    protected void addEntityEdges(GraphicalEditPart entityPart)
        }

import org.eclipse.draw2d.geometry.Dimension;
    }
    public void applyEntityResults(GraphicalEditPart entityPart)
        }
                        }
    protected void applyDiagramResults(AbstractGraphicalEditPart diagram)
    public void layoutDiagram(AbstractGraphicalEditPart diagram) {
import java.util.ArrayList;
    {
        GraphAnimation.recordInitialState((Connection) connectionPart.getFigure());
        for (Object child : diagram.getChildren()) {
        for (Object child : diagram.getChildren()) {
        graph.nodes.add(entityNode);
        Dimension preferredSize = tableFigure.getPreferredSize();
                } catch (Exception e) {
                log.info("Object: " + srcObject.toString() + " is not an instance of AbstractConnectionEditPart.");
    //******************* DiagramPart contribution methods **********/

        synchronized (this) {
        if (edgeNodes != null && edgeNodes.size() > 1) {
            sourceAnchor.height = 0;
/*
                bends.add(new AbsoluteBendpoint(x, y));
 * Unless required by applicable law or agreed to in writing, software

    private final ERDDecorator decorator;
            }


    //******************* Entity contribution methods **********/
            addConnectionEdges((AbstractConnectionEditPart) o);
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
    //******************* EntityPart apply methods **********/
 *
            Object srcObject = sourceConnections.get(i);
                addDiagramEdges(diagram);
 *
            for (int i = 0; i < edgeNodes.size(); i++) {
        entityNode.width = preferredSize.width;
     */
        Dimension preferredSize = nodeEditPart.getFigure().getPreferredSize(-1, -1);
                applyDiagramResults(diagram);
                        layout.visit(graph);
        }
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;
        }
        if (snapSize != null) {

            return;
            addEntityNode((NodePart) child);
    protected void applyConnectionResults(AbstractConnectionEditPart connectionPart)
				}
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
                try {
        partToNodesMap.put(nodeEditPart, entityNode);
        }
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDecorator;
            entity = ((EntityPart) nodeEditPart).getEntity();
}
    //******************* Connection apply methods **********/
import org.eclipse.draw2d.*;
            if (entity.hasSelfLinks()) {
            graph = new DirectedGraph();
                AbstractConnectionEditPart connectionPart = (AbstractConnectionEditPart) srcObject;
    }


 * you may not use this file except in compliance with the License.
    }
        }
        if (target == null && connectionPart.getTarget() != null) {
    protected void addDiagramNodes(AbstractGraphicalEditPart diagram)
                            return;

        if (entityNode instanceof Subgraph) {
            }
        }
    }
     * Adds nodes to the graph object for use by the GraphLayoutAuto
        Node target = (Node) partToNodesMap.get(connectionPart.getTarget());
    {
            }



                    log.error("Error during layouting elements:" + e.getMessage(), e);
 * limitations under the License.
 * See the License for the specific language governing permissions and
					bends.add(new AbsoluteBendpoint(x, y));
        partToNodesMap.put(connectionPart, e);
        }
        }
            entityNode = new Node(nodeEditPart);
                        }
    protected void addEntityNode(NodePart nodeEditPart)
                        applyConnectionResults(connectionPart);
                            layout = new NodeJoiningDirectedGraphLayout(diagram);

        if (!partToNodesMap.containsKey(connectionPart)) {
            Node sourceAnchor = new Node("Fake node for source links", (Subgraph) entityNode);
            target = ((Subgraph) target).members.getNode(1);
                applyConnectionResults(connectionPart);
    protected void addConnectionEdges(AbstractConnectionEditPart connectionPart)
        tableFigure.setBounds(bounds);
        Rectangle bounds = new Rectangle(n.x, n.y, preferredSize.width, preferredSize.height);
                int y = vn.y;
    //******************* Connection contribution methods **********/
/*
        List<?> sourceConnections = entityPart.getSourceConnections();
import org.eclipse.gef.EditPart;

        Dimension snapSize = decorator.getEntitySnapSize();
            );

        Node source = (Node) partToNodesMap.get(connectionPart.getSource());
 * @author Serge Rider
        if (source instanceof Subgraph && target instanceof Subgraph) {
            addEntityEdges((GraphicalEditPart) child);
        }
            List<AbsoluteBendpoint> bends = new ArrayList<>();
        }
        NodeList edgeNodes = connEdge.vNodes;
    private DirectedGraph graph;
            return;
        this.decorator = decorator;
/*
    }
                    if (srcObject instanceof AbstractConnectionEditPart) {
import org.eclipse.draw2d.geometry.Rectangle;
                n.x / snapSize.width * snapSize.width - n.x,

                entityNode = new Subgraph(nodeEditPart);
import java.util.IdentityHashMap;
    private static final Log log = Log.getLog(DirectedGraphLayoutVisitor.class);


        Edge e = new Edge(connectionPart, source, target);
    {
    {
                n.y / snapSize.height * snapSize.height - n.y
                for (Object srcObject : ((AttributePart) child).getSourceConnections()) {
        graph.edges.add(e);
import java.util.List;

    private Map<EditPart, Object> partToNodesMap;

 * Created on Jul 15, 2004
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (entityNode == null) {
				} else {
        for (Object child : entityPart.getChildren()) {
/*
import java.util.Map;
import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;
        PolylineConnection conn = (PolylineConnection) connectionPart.getConnectionFigure();
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
        //conn.setTargetDecoration(new PolygonDecoration());
        for (Object o : outgoing) {
 * Visitor with support for populating nodes and edges of DirectedGraph
    }
    /**

            addDiagramNodes(diagram);
