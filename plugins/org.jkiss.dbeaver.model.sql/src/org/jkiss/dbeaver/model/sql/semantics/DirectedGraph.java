    }
        public final int id;
import java.util.List;
import java.nio.charset.Charset;
        public Node(int id, String label, String color) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.IOException;
 *
 * You may obtain a copy of the License at
        public String label;

    private final List<Node> nodes = new LinkedList<>();
package org.jkiss.dbeaver.model.sql.semantics;
        }
            this.to = to;
        Node node = new Node(nodes.size(), label, color);
    
    }
import java.nio.file.Files;
                writer.write("      <Node Id=\"" + node.id + "\" Label=\"" + node.label + "\" Background=\"" + node.color + "\" />\r\n");
        return node;

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
            writer.write("</DirectedGraph>\r\n");
public class DirectedGraph {
 */
import java.nio.file.StandardOpenOption;
            writer.write("   </Nodes>\r\n");
            writer.write("   <Nodes>\r\n");
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(fileName), Charset.forName("utf-8") , StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
}
            this.color = color;
    public Node createNode(String label, String color) {
    class Edge {
import java.util.LinkedList;
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.id = id;
            this.color = color;
/*
            this.label = label;
        public final Node from, to;
import java.nio.file.Path;
 * you may not use this file except in compliance with the License.


 * limitations under the License.
        public String color;
 * Unless required by applicable law or agreed to in writing, software
        this.edges.add(edge);
            writer.write("   </Links>\r\n");
import java.io.BufferedWriter;
            for (Edge edge: edges) {
        }
        }
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
            for (Node node: nodes) {
    public void saveToFile(String fileName) {
            writer.write("   <Links>\r\n");
                writer.write("      <Link Source=\"" + edge.from.id + "\" Target=\"" + edge.to.id + "\" Label=\"" + edge.label + "\" Background=\"" + edge.color + "\" />\r\n");

        public Edge(Node from, Node to, String label, String color) {
        Edge edge = new Edge(from, to, label, color);
            }
        return edge;
    }
            }
        public String color;



            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n");
 * distributed under the License is distributed on an "AS IS" BASIS,
        public String label;
            this.from = from;
            this.label = label;
        } catch (IOException e) {
    private final List<Edge> edges = new LinkedList<>();
    }
    class Node {
        this.nodes.add(node);
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public Edge createEdge(Node from, Node to, String label, String color) {
            e.printStackTrace();
            writer.write("<DirectedGraph xmlns=\"http://schemas.microsoft.com/vs/2009/dgml\">\r\n");
