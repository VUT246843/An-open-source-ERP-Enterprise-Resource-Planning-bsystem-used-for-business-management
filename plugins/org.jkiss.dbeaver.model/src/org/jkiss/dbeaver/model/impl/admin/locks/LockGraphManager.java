
        Set<DBAServerLock> roots = new HashSet<>();
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        if (graph != null && selection != null) {



            if (maxWidth < current.size()) {
                    edge.setSource(node);
        Map<Object, DBAServerLock> childs = new HashMap<>();
                    node.setLevelPosition(LockGraphNode.LevelPosition.RIGHT);
                    node.setLevelPosition(LockGraphNode.LevelPosition.CENTER);
 * DBeaver - Universal Database Manager
}



 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com)
/*
 *
        }
                maxWidth = current.size();

            } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.nodes.clear();
    }
import java.util.*;

        graphIndex.put(root.getId(), graph);
 * Unless required by applicable law or agreed to in writing, software
    }

                    graphIndex.put(c.getId(), graph);

 *
        for (DBAServerLock root : roots) {
        graph.getNodes().add(nodeRoot);
                node.setSpan(current.size());

                } else {

    @SuppressWarnings("unchecked")
        while (current.size() > 0) {
    private Map<Object, LockGraph> graphIndex = new HashMap<>();
                    graph.getNodes().add(nodeChild);
            level++;
            createGraph(root);
        }
                    if (touched.contains(c)) continue;

                DBAServerLock holder = locks.get(l.getHoldID());
            current = new ArrayList<>(childs.values());


            }

    public LockGraph getGraph(DBAServerLock curLock) {
    }

                holder.waitThis().add(l);
        nodeRoot.setLevel(0);



                    edge.setTarget(nodeChild);
        List<DBAServerLock> current = new ArrayList<>();


 * You may obtain a copy of the License at
 */
            nodes.put(l.getId(), new LockGraphNode(l));



                LockGraphNode node = nodes.get(l.getId());
 * you may not use this file except in compliance with the License.
        int maxWidth = 1;

        LockGraph graph = graphIndex.get(curLock.getId());
        nodeRoot.setSpan(1);

package org.jkiss.dbeaver.model.impl.admin.locks;
                roots.add(l);

                for (DBAServerLock c : l.waitThis()) {
        LockGraphNode nodeRoot = nodes.get(root.getId());
        int level = 1;
    public static final String keyType = "type";

 * limitations under the License.
                    node.setLevelPosition(LockGraphNode.LevelPosition.LEFT);

                DBAServerLock l = current.get(index);


                    LockGraphEdge edge = new LockGraphEdge();
        return graph;



    private LockGraph createGraph(DBAServerLock root) {
    private Map<Object, LockGraphNode> nodes = new HashMap<>();
                } else if (index == current.size() - 1) {
        for (DBAServerLock l : locks.values()) {
            for (int index = 0; index < current.size(); index++) {
        graph.setMaxWidth(maxWidth);
                    touched.add(c);


                }
            }

        current.add(root);
        this.graphIndex.clear();

        }

        return graph;
        Set<DBAServerLock> touched = new HashSet<>(); //Prevent Cycle
    public void buildGraphs(Map<Object, ? extends DBAServerLock> locks) {

        }
                    LockGraphNode nodeChild = nodes.get(c.getId());
            childs.clear();
                    nodeChild.setLevel(level);

        LockGraph graph = new LockGraph(root);
            }


    public static final String typeHold = "hold";
public abstract class LockGraphManager {
    public static final String typeWait = "wait";
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
 * See the License for the specific language governing permissions and
            if (locks.containsKey(l.getHoldID()) && (!l.getHoldID().equals(l.getId()))) {
                if (index == 0) {
                l.setHoldBy(holder);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            graph.setSelection(selection);


        LockGraphNode selection = nodes.get(curLock.getId());
        touched.add(root);
    @SuppressWarnings({"unchecked", "rawtypes"})
                }

                    childs.put(c.getId(), c);

