    }
                    offsetY = nodeSource.height;
            if (!nodes.isEmpty()) {
                return nodeOnLevel.getKey();
        List<Node> isolated = new LinkedList<>();
                    }
            if (offsetX < n.width) {
        return nodeByLevels;
                        }
        Entry<Integer, List<Node>> lastEntry = nodeByLevels.lastEntry();
            Node node = graph.nodes.get(i);
     */
                    if (nodeIndex != null) {
    }
                if (offsetY < nodeSource.height) {
        int offsetY = 0;
                }
        this.diagram = diagram;
                // next
        for (Entry<Integer, List<Node>> nodeOnLevel : nodeByEdges.entrySet()) {
            for (Node node : entry.getValue()) {
    private AbstractGraphicalEditPart diagram;
            maxCountOfEdges += node.incoming.size() + node.outgoing.size();
    }
                    boolean skip = false;
                offsetX = currentX;
        int distanceX = computeDistance(islandNodes);
        int offsetY = currentY;
    private void drawIsolatedNodes(
        drawMissedNodes(singleConnectedNodes, nodeMissed, nodeByLevels);
        int currentY = findBottomPosition(mainNodes);
        return missedNodes; 
                currentY = OFFSET_FROM_TOP + middle - height / 2;
                        if (duplicationNode2index.containsKey(trg)) {
        nodeByLevels = computeRootNodes(graph);
            }
            for (Edge edge : nodeSource.outgoing) {
        if (distance < DISTANCE_ENTITIES_Y) {
     * Repeatable columns value
            int height = 0;
    private void drawGraphNodes(@NotNull TreeMap<Integer, List<Node>> nodeByEdges) {

        for (Entry<Integer, List<Node>> entry : nodeByEdges.entrySet()) {
        nodeByLevels = verifyNodesOnGraph(graph, nodeByLevels);
        return mapOfHeight;
                nodeTarget.y = currentY;
                }
                        nodeTarget.outgoing.isEmpty() &&
        }
    @NotNull
        @NotNull Node src
        for (Node nodeSource : islandNodes) {
            if (node.outgoing.size() == 1 && node.incoming.isEmpty()) {
        drawIsolatedNodes(singleConnectedNodes, nodeByLevels);
        @NotNull TreeMap<Integer, List<Node>> nodeByLevels
                Node nodeTarget = edge.target;
            Node node = graph.nodes.get(i);
                // parent
                }
            distance = DISTANCE_ENTITIES_Y;
            index++;
        int curColumnIndex = 0;
            }
            if ((islands.indexOf(nodeSource) + 1) % COLUMN_ISLAND_MAX == 0) {
            boolean isContains = false;

     * Distance by X require to draw connection
                    if (nodeTarget != null &&
     */
    ) {
            // catch empty nodes
    }
    private List<Node> findMissedGraphNodes(
    }
        Map<Integer, Integer> mapOfHeight = new HashMap<>();
    private static final int DISTANCE_ENTITIES_Y = 40;
                boolean hasNoFurtherConnections = false;
            return 0;
                if (offsetY < nodeTarget.height) {
                for (Node isoNode : singleConnectedNodes) {
        }
                }
                // next increase X
        return distance;
    }
            Node lastNode = nodeByEdges.lastEntry().getValue().get(0);
        return null;
    /**
        @NotNull TreeMap<Integer, List<Node>> mainNodes
        @NotNull List<Node> islands,
    @NotNull
    private static final int COLUMN_MAX = 8;

     * Distance by Y require to draw connection
                    currentX = OFFSET_FROM_LEFT;
     */
    ) {
    private TreeMap<Integer, List<Node>> nodeByLevels;
 * The class represents node layout logic based on tree structure with max depth
                    for (Edge edge : isoNode.outgoing) {
                    offsetY = nodeTarget.height;
        int maxCountOfEdges = 0;
        for (Entry<Integer, List<Node>> entry : nodeByEdges.entrySet()) {
    }

                if (trg != null) {
    private int computeDistance(@NotNull Collection<Node> nodes) {
        Map<Integer, Integer> height2Level = computeHeight(nodeByLevels);
    private static final int OFFSET_FROM_LEFT = 50;
        int index = 0;
        }
        drawGraphNodes(nodeByLevels);
        }
        for (Node node : missedNodes) {
        if (!firstLineOutput.isEmpty()) {
     */
            nodeSource.y = currentY;
            Integer height = height2Level.get(index);
                    offsetY = nodeSource.height;
        return positionY + offsetY;
        int currentY = findBottomPosition(nodeByLevels) + getBottomPositionIslands(islands);
                }
     */
import org.eclipse.draw2d.graph.Node;
    }
            }
        for (int i = 0; i < graph.nodes.size(); i++) {
                offsetY += height + DISTANCE_ENTITIES_Y;
        }
     */
            } else {
    private int getBottomPositionIslands(List<Node> islands) {
                firstLineOutput.add(node);
                        continue;
            }
                    isContains = true;
            List<Node> nodes = entry.getValue();
            if (n1.data instanceof EntityPart ep1 && n2.data instanceof EntityPart ep2) {
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
public class OrthoDirectedGraphLayout extends DirectedGraphLayout {

        int middle = Collections.max(height2Level.values()) / 2;
                            skip = true;
            positionByX = lastNode.x + OFFSET_FROM_LEFT;
            }
    private int findBottomPosition(@NotNull TreeMap<Integer, List<Node>> nodeByEdges) {
 */
                    break;
            positionByX = OFFSET_FROM_LEFT;
        return OFFSET_FROM_TOP + DISTANCE_ENTITIES_Y + Collections.max(computeHeight(nodeByEdges).values());
     */
        int currentX = OFFSET_FROM_LEFT;
     */
                currentY = OFFSET_FROM_TOP;
     * Pair of columns for islands representation 
                            isContains = true;
        duplicationNode2index.forEach((key, value) -> nodeByEdges.get(value).remove(key));
                    offsetY = nodeTarget.height;

                    }
        @NotNull List<Node> missedNodes,
        nodeByLevels = recomputeGraph(nodeByLevels);
import org.eclipse.draw2d.graph.DirectedGraphLayout;
     * Initial distance by X
     * Compute last position value by X of main connected graph 
            }
                Node src = edge.source;
    /**
    }
                offsetX = n.width;
 *
        while (idx < graph.keySet().size()) {
                        duplicationNode2index.put(src, nodeIndex);
        @NotNull DirectedGraph graph,
        for (Node inNode : nodesLine) {
     *
            curColumnIndex++;
        @NotNull TreeMap<Integer, List<Node>> nodeByLevels
        int offsetX = OFFSET_FROM_LEFT;
                        if (node.equals(nodeTarget)) {
            distance += maxCountOfEdges * DISTANCE_PER_EDGE_X;
    /**
    private TreeMap<Integer, List<Node>> verifyNodesOnGraph(
    }
        int idx = 0;
                    // skip by distance
    }
            distance = DISTANCE_ENTITIES_X;
            if (!node.outgoing.isEmpty() && node.incoming.isEmpty()) {
            idx++;
                    for (Edge e : trg.incoming) {
        }
                if (offsetY < nodeTarget.height) {
        @NotNull TreeMap<Integer, List<Node>> nodeByEdges, 
                            continue;
            if (offsetX < n.width) {
        nodeByLevels = removeIslandNodesFromRoots(singleConnectedNodes, nodeByLevels);
            }
        }
                }
        }
                    Integer nodeIndex = getNodeIndex(nodeByEdges, trg);
    /**
        Map<Node, Integer> duplicationNode2index = new HashMap<>();
            }
        }
                } else {
        Entry<Integer, List<Node>> lastEntry = mainNodes.lastEntry();
    /**
            if (height < node.height) {
import org.eclipse.draw2d.graph.DirectedGraph;
     * The method to return diagram edit part
        for (Node n : lastEntry.getValue()) {
    /**
            listOfNodes.removeAll(islands);
            } else {
                // find as a target in isolated
    }
    private Map<Integer, Integer> computeHeight(@NotNull TreeMap<Integer, List<Node>> nodeByEdges) {
    private static final int DISTANCE_PER_EDGE_Y = 10;
                // shiftAllElements
     */
    private List<Node> computeSingleConnectedNodes(@NotNull DirectedGraph graph) {
     */
    ) {
        return diagram;
                }
    }
                }
        if (distance < DISTANCE_PER_EDGE_X) {
            for (Edge edge : inNode.outgoing) {
            // still no roots but elements exists in graph add all elements as possible
    }
                    nodeWidthMax = n.width;
                return ep1.getName().compareTo(ep2.getName());
        int positionY = 0;
    private static final int OFFSET_FROM_TOP = 30;
                currentX += nodeWidthMax + computeDistance(nodes);
                        nodeTarget.incoming.size() == 1) {

/**
                        hasNoFurtherConnections = true;
        }
                n.x = currentX;
            nodeByLevels.put(0, graph.nodes);
                if (index == 0) {
            if (curColumnIndex % COLUMN_MAX == 0) {
        }
 * edges equal of 2
                }
            // roots.
package org.jkiss.dbeaver.ui.editors.erd.layout.algorithm.direct;
        for (int i = 0; i < graph.nodes.size(); i++) {
        }
            List<Node> nextLevelNodes = graph.get(idx + 1);
        int currentX = OFFSET_FROM_LEFT;
    }
        @NotNull DirectedGraph graph,
    public OrthoDirectedGraphLayout(AbstractGraphicalEditPart diagram) {

 * Licensed under the Apache License, Version 2.0 (the "License");
                Node nodeTarget = null;
        }
                nodeTarget.x = currentX + nodeSource.width + distanceX;
        return nodeByLevels;
    @SuppressWarnings("unused")
                for (Edge edge : node.outgoing) {
            node.x = offsetX;
            int nodeWidthMax = 0;
            for (Node n : nodes) {
                graph.remove(idx + 1);
            }
                    currentY += offsetY + DISTANCE_ENTITIES_Y / 2;
            if (!isContains) {
        // here we place all elements from middle line
            for (Entry<Integer, List<Node>> entry : nodeByEdges.entrySet()) {
        if (nodeByEdges.lastEntry().getValue().isEmpty()) {
        for (Node node : nodes) {
                if ((islandNodes.indexOf(nodeSource) + 1) % COLUMN_ISLAND_MAX != 0) {
                if (entry.getValue().contains(node) ||
                offsetX = n.width;
        int offsetY = 0;

        List<Node> nodesLine = nodeByEdges.get(idx);
                    currentY += n.height + DISTANCE_ENTITIES_Y / nodes.size() + computeDistanceY(n);

        return nodes;
                    }
    @Nullable
                if (src != null && !src.equals(inNode)) {
            nodeSource.x = currentX;
            mapOfHeight.put(entry.getKey(), height);
            }
            }
    private Integer getNodeIndex(
        }
                offsetX += node.width + DISTANCE_ENTITIES_X / 2;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                }
                        }
        offsetX = currentX;
 * See the License for the specific language governing permissions and
    private int computeDistanceY(Node n) {
                Node trg = edge.target;
    /**
                    }
                            break;
 * you may not use this file except in compliance with the License.
                }
        for (Node n : lastEntry.getValue()) {
    /**
                Node nodeTarget = edge.target;

    }
    @NotNull
    /**
                }
        @NotNull List<Node> islands,
        for (Node node : graph.nodes) {
                height = node.height;
    ) {
        @NotNull List<Node> islandNodes,
        List<Node> missedNodes = new ArrayList<>();
                        Node nodeTarget = edge.target;
                        }

                }
        return distance;
        @NotNull TreeMap<Integer, List<Node>> nodeByEdges
                height += node.height + DISTANCE_ENTITIES_Y;
    private TreeMap<Integer, List<Node>> removeIslandNodesFromRoots(
    }
            nodes.put(0, firstLineOutput);
                        Node incomingSourceNode = e.source;
            }

                if (nodeWidthMax < n.width) {
    private static final int COLUMN_ISLAND_MAX = 3;
                        duplicationNode2index.put(trg, nodeIndex);
        }
        int offsetX = OFFSET_FROM_LEFT;
            }
                n.y = currentY;
     * How far elements can be placed to his child
        List<Node> listOfNodes = nodeByLevels.get(0);

                if (hasNoFurtherConnections) {
    private static final int DISTANCE_PER_EDGE_X = 7;
    private TreeMap<Integer, List<Node>> recomputeGraph(@NotNull TreeMap<Integer, List<Node>> graph) {
import java.util.*;
                        if (childIndex != null && childIndex != 0 && (idx - childIndex) > DISTANCE_BTW_ELEMENT_PER_COLUMNS) {
    @NotNull
                    if (skip) {
                } else {

            for (Edge edge : nodeSource.outgoing) {
            }
     * Compute last position value by Y of main connected graph
        if (listOfNodes != null) {
    /**
            offsetY += DISTANCE_ENTITIES_Y;
 *
                    currentX += nodeSource.width + nodeTarget.width + distanceX + DISTANCE_ENTITIES_X;
    /**
import org.jkiss.code.NotNull;
                missedNodes.add(node);

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        Collections.sort(nodeMissed, (Node n1, Node n2) -> {
    private List<Node> singleConnectedNodes = new LinkedList<>();
                    nodeByEdges.computeIfAbsent(idx + 2, n -> new ArrayList<Node>()).add(src);
        return isolated;
        }
        });
                    } else {
     * Initial offset from top line
        }
    /**
/*
                    nodeTarget = edge.target;
                    nodeByEdges.computeIfAbsent(idx + 1, n -> new ArrayList<>()).add(trg);
        int currentY = OFFSET_FROM_TOP;
                positionY += offsetY + DISTANCE_ENTITIES_Y / 2;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
        int currentX = OFFSET_FROM_LEFT;
    private void createGraphLayers(
            }

    }
        return graph;
                // next row
                            break;
     */
     * The visitor method
    @NotNull
            createGraphLayers(graph, idx);
        singleConnectedNodes = computeSingleConnectedNodes(graph);
 */
    ) {
                        Integer childIndex = getNodeIndex(nodeByEdges, incomingSourceNode);
     * Initial offset from left line
import java.util.Map.Entry;
                graph.put(idx, nextLevelNodes);
    /**
        }
        if (offsetY != 0) {

        for (Node nodeSource : islands) {
        } else {
     */
    }
                offsetY = 0;
    private TreeMap<Integer, List<Node>> computeRootNodes(DirectedGraph graph) {
        int idx
                height = 0;
 * You may obtain a copy of the License at
        if (maxCountOfEdges > 0) {
        List<Node> firstLineOutput = new LinkedList<>();
    ) {
    }
            if (nextLevelNodes != null && graph.get(idx).isEmpty() && !nextLevelNodes.isEmpty()) {
    public AbstractGraphicalEditPart getDiagram() {
                    singleConnectedNodes.contains(node)) {
            }
    private void drawMissedNodes(
            nodeByLevels.put(0, listOfNodes);
        @NotNull TreeMap<Integer, List<Node>> nodeByLevels
    private static final int DISTANCE_BTW_ELEMENT_PER_COLUMNS = 2;
    ) {
                    isolated.add(node);
        @NotNull TreeMap<Integer, List<Node>> nodeByEdges,

            if (height / 2 > middle) {
 *
        if (nodeByLevels.isEmpty() && !graph.nodes.isEmpty()) {
 * limitations under the License.
    public void visit(DirectedGraph graph) {
        int distance = DISTANCE_ENTITIES_X;
        List<Node> nodeMissed = findMissedGraphNodes(graph, nodeByLevels);
                    if (nodeIndex != null) {
                    Integer nodeIndex = getNodeIndex(nodeByEdges, src);
        return positionByX;
     * Initial distance by Y
import org.eclipse.draw2d.graph.Edge;
    private int findRightPosition(@NotNull TreeMap<Integer, List<Node>> nodeByEdges) {

    private static final int DISTANCE_ENTITIES_X = 75;
            if (nodeOnLevel.getValue().contains(src)) {
                    currentY += n.height + DISTANCE_ENTITIES_Y;

            }
            }
                        hasNoFurtherConnections = false;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
        TreeMap<Integer, List<Node>> nodes = new TreeMap<>();

        }
        int height = DISTANCE_ENTITIES_Y;
        }
     * @return - return a diagram editor part
     */
        int positionByX;
import org.jkiss.code.Nullable;

                if (offsetY < nodeSource.height) {

}        }
        int distance = (n.outgoing.size() + n.incoming.size()) * DISTANCE_PER_EDGE_Y;
            node.y = offsetY;
                    }
            }

