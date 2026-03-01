        void aggregate(@NotNull T result);
    private final C context;
        return rootFrame.result;
    @NotNull
            this.node = node;
                    stack.push(new MapperQueuedNodeFrame(children.get(i), aggregator));
    private interface MapperFrame {
        while (!stack.isEmpty()) {
    private final Class<T> mappingResultType;
 *
        @NotNull
            if (translation != null) {
        public void doWork() {
        @NotNull Class<T> mappingResultType,
 * you may not use this file except in compliance with the License.
        }

        public final TreeMapperCallback<T, C> translation;
        @NotNull
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

        public final STMTreeNode node;
                stack.push(aggregator);
            super(node, parent);

        MapperRootFrame rootFrame = new MapperRootFrame(root);

        }
        @NotNull

            }

    }
        this.mappingResultType = mappingResultType;
import java.util.*;
    @NotNull
            this.parent.aggregate(this.translation.apply(this.node, this.childrenData, SQLQueryTreeMapper.this.context));
        public void aggregate(@NotNull T result) {
            @NotNull MapperResultFrame<T> parent,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        stack.push(rootFrame);

        }

        public final MapperResultFrame<T> parent;
        @NotNull C context
            TreeMapperCallback<T, C> translation = translations.get(node.getNodeName());

    }
        @Override
package org.jkiss.dbeaver.model.sql.semantics;
 *
        public MapperQueuedNodeFrame(@NotNull STMTreeNode node, @NotNull MapperResultFrame<T> parent) {
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    protected interface TreeMapperCallback<T, C> {
        @Nullable
    private interface MapperResultFrame<T> extends MapperFrame {
 * Unless required by applicable law or agreed to in writing, software

        @Override
        this.context = context;
        @Override
 * See the License for the specific language governing permissions and
            @NotNull STMTreeNode node,
        public void doWork() {
    public SQLQueryTreeMapper(
    private final Map<String, TreeMapperCallback<T, C>> translations;
        @NotNull
 * You may obtain a copy of the License at
            for (int i = children.size() - 1; i >= 0; i--) {
        public void aggregate(@NotNull T result) {

    }

    @FunctionalInterface
        public MapperRootFrame(@NotNull STMTreeNode node) {
    }

    private abstract class MapperNodeFrame implements MapperFrame {
            stack.push(new MapperQueuedNodeFrame(node, this));
        }
    ) {
}
    }
        this.transparentNodeNames = transparentNodeNames;
            stack.pop().doWork();
            this.translation = translation;

                }
 * DBeaver - Universal Database Manager
    @NotNull
        @NotNull
            @NotNull TreeMapperCallback<T, C> translation
        @Override

    @NotNull

        }
        public MapperDataPendingNodeFrame(
    private class MapperDataPendingNodeFrame extends MapperNodeFrame implements MapperResultFrame<T> {
        public final List<T> childrenData = new LinkedList<>();
        @NotNull Map<String, TreeMapperCallback<T, C>> translations,

import org.jkiss.code.NotNull;
                if (transparentNodeNames.contains(node.getNodeName())) {
            this.result = result;
        public MapperNodeFrame(@NotNull STMTreeNode node, @NotNull MapperResultFrame<T> parent) {
    @NotNull
        void doWork();
        }
    private final Set<String> transparentNodeNames;
    private final Stack<MapperFrame> stack = new Stack<>();
    public T translate(@NotNull STMTreeNode root) {

    @NotNull
 *
        public final STMTreeNode node;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private class MapperQueuedNodeFrame extends MapperNodeFrame {
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
class SQLQueryTreeMapper<T, C> {
        public T result = null;
    private class MapperRootFrame implements MapperResultFrame<T> {

            this.parent = parent;
        }

    }
    }
        }
            super(node, parent);

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override

        }
import org.jkiss.code.Nullable;
        ) {
            List<STMTreeNode> children = node.findNonErrorChildren();
        @NotNull Set<String> transparentNodeNames,
        public void doWork() {
            }
    }
            MapperResultFrame<T> aggregator = translation == null ? parent : new MapperDataPendingNodeFrame(node, parent, translation);
            this.childrenData.add(result);
        this.translations = translations;
            this.node = node;
        T apply(STMTreeNode node, List<T> children, C context);
 * limitations under the License.
