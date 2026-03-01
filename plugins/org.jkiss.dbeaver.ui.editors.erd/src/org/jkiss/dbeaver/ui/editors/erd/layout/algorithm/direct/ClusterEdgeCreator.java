 * Licensed under the Apache License, Version 2.0 (the "License");
                if (sourceNode != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                sourceNode = cluster.set.get(cluster.set.size() - 1);
            coalesceRemainingClusters();
                    encountered.add(incomingNode);
                    currentCluster = new Cluster();
    }
     */
import java.util.List;

        return edge;
            e.printStackTrace();
                //set up source node for the next iteration using last node in
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
        //boolean addedEdge;
    private void recursivelyAddToCluster(Node node, int depth) {
                    //use first node in set as target node
            }
/*
    private void coalesceRemainingClusters() {

    //List edgesAdded;
     */
 * Unless required by applicable law or agreed to in writing, software

        public String toString() {
    private Cluster currentCluster = null;
    }
 *
                    encountered.add(node);
            EdgeList outgoing = node.outgoing;
import java.util.ArrayList;
        edgeList.add(edge);
     */
    }
        DummyEdgePart edgePart = new DummyEdgePart();

                    recursivelyAddToCluster(node, depth);
 */
 *
            //add an edge from each successive cluster to next
                if (!encountered.contains(incomingNode)) {
                    //create a new cluster for this node
                Edge edge = (Edge) iter.next();

        }

                Node node = (Node) iter.next();
    private void joinClusters() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    currentCluster.set.add(outgoingNode);

            depth++;

 * DBeaver - Universal Database Manager
                Node incomingNode = edge.source;
                if (!encountered.contains(node)) {
 * Creates dummy edges between nodes, to be used with NodeJoiningDirectedGraphLayout
package org.jkiss.dbeaver.ui.editors.erd.layout.algorithm.direct;
        if (clusters.size() > 1) {

                Cluster cluster = iter.next();

            return set.toString();
            for (Iterator<?> iter = outgoing.iterator(); iter.hasNext();) {
*/
import java.util.Iterator;
                    recursivelyAddToCluster(incomingNode, depth);

 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 * @author Serge Rider
    }
 *



     * Joins the clusters together
    private class Cluster {

    private List<Cluster> clusters = new ArrayList<>();
        }
        try {
 * See the License for the specific language governing permissions and
 * limitations under the License.


            this.graph = graph;
    private Edge newDummyEdge(Node sourceNode, Node targetNode) {
    /**
    }
            for (Iterator<Cluster> iter = clusters.iterator(); iter.hasNext();) {
                Node outgoingNode = edge.target;
            for (Iterator<?> iter = nodeList.iterator(); iter.hasNext();) {
 * Created on Jul 14, 2004
    }
        catch (RuntimeException e) {
                    recursivelyAddToCluster(outgoingNode, depth);
        //add the new edge to the edge list
            for (Iterator<Cluster> iter = clusters.iterator(); iter.hasNext();) {
    private EdgeList edgeList;
public class ClusterEdgeCreator {

     * If recursion fails to join all the remaining
    public void visit(DirectedGraph graph) {


                    // recursively add any other nodes reachable from it
                }

import org.eclipse.draw2d.graph.*;
                }
        }
     */
        edge.weight = 2;

                Cluster cluster = iter.next();
/*
    private List<Node> encountered = new ArrayList<>();

            // do nothing
            joinClusters();

                    currentCluster.set.add(node);



            }
                    encountered.add(outgoingNode);
    private NodeList nodeList;
/**
 * you may not use this file except in compliance with the License.
    }
                    clusters.add(currentCluster);

        Edge edge = new Edge(edgePart, sourceNode, targetNode);
}
                    int depth = INITIAL_RECURSION_DEPTH;

    public ClusterEdgeCreator() {


                if (!encountered.contains(outgoingNode)) {
        //targetNode = sourceNode;
                }

            Node targetNode = null;
            }
     * Very thin wrapper around List
 */
                }
    /**
            Node sourceNode = null;
            throw e;
            }
            EdgeList incoming = node.incoming;


    private static final int INITIAL_RECURSION_DEPTH = 3;
            this.edgeList = graph.edges;
            //edgesAdded = new ArrayList();
                    newDummyEdge(sourceNode, targetNode);
        //addedEdge = true;
        if (depth > 3) {

    //sets up maximum depth of recursion to set up initial cluster list
            //iterate through all of the nodes in the node list
        }
     * creates a new dummy edge to be used in the graph

/*

    private DirectedGraph graph;

            for (Iterator<?> iter = incoming.iterator(); iter.hasNext();) {
                // set
 *
        }
            this.nodeList = graph.nodes;
    /**
                //check whether we have already come across this node
        super();
 * You may obtain a copy of the License at
        } else {
                    currentCluster.set.add(incomingNode);
                Edge edge = (Edge) iter.next();
        List<Node> set = new ArrayList<>();
                    targetNode = cluster.set.get(0);
            }

