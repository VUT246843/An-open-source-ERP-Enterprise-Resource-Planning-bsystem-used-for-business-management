import org.jkiss.dbeaver.model.sql.semantics.SQLQueryLexicalScope;
    protected void registerSubnode(@NotNull SQLQueryNodeModel subnode) {
                }
                        if (next.region.a > position - 1) {
        } else {
 */
                        // May happen when range.a position shared between a few nodes for some reason.
                    SQLQueryNodeModel node = this.subnodes.get(index);
            ListNode<NodeEntry<N, C>>  stack = ListNode.of(queue.data);
                                    if (index == 0) {
    @Nullable

                    applyActionForNode(stack.data, context, action);
    }
         */
        }
                            if (children == null) {
        action.accept(entry.node, currContext);
                if (region.a <= position && region.b >= position) {
                    stack = stack.next;
                } else { // Insertion point index belongs to the next node after the node in question.
     * Just traverse the tree to call action on each node
    @NotNull
        default boolean delayRestChildren() {

        }
    protected abstract <R, T> R applyImpl(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, T arg);
                        if (node instanceof NodeSubtreeTraverseControl<?, ?> c) {
    }
                        } else {
                    if (~index == 0) {
    }
    }
        }
        default boolean overridesContextForChild(@NotNull N child) {
                                    : entry.context;
    /**
        queued.add(subroot);
     */
            this.lexicalScopes = scopes = new ArrayList<>();
 *
        @Nullable C context,
        default List<SQLQueryNodeModel> getChildren() {
                            //noinspection unchecked
                    stack = ListNode.push(stack, null);
        C currContext = entry.context == null ? context : entry.context.provider.getContextForChild(entry.context.key, context);
        return null;
     * Register lexical scopes, if they haven't been registered yet
                    stack = stack.next;
    private final STMTreeNode syntaxNode;
                        // ...[...]...[node:...]...[]...[...]...
     */
                        // because the existing would have been to the right of the inserted at the insertion point itself.
                .filter(Objects::nonNull)
        @NotNull BooleanSupplier cancellationChecker
    ) {
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
                        }
                            localContextProvider = null;


    public SQLQueryLexicalScope findLexicalScope(int position) {
                            index++;
                            delayChildren = false;
        return null;
        @NotNull N node
     */
                        }
    protected static <N extends SQLQueryNodeModel, C> void traverseSubtreeSmart(
                    } else if (~index == this.subnodes.size()) {
                }
        /**
 * limitations under the License.
        @Nullable
        while (stack != null && !cancellationChecker.getAsBoolean()) {
        @NotNull NodeSubtreeTraverseControl<N, C> provider,

                            i++;
                            children = new ArrayList<>(children);
                        // Excluding overlapping regions by following forward through unwanted ones.
                int index = STMUtils.binarySearchByKey(this.subnodes, n -> n.region.a, position, Comparator.comparingInt(x -> x));
                    }
        @NotNull Class<N> childrenType,
import org.jkiss.code.Nullable;

 *
        @NotNull BiConsumer<N, C> action
                        List<SQLQueryNodeModel> children;
                                //noinspection unchecked
        while (queue != null && !cancellationChecker.getAsBoolean()) {
        /**
                            node = next;

        this.region = region;
        @NotNull NodeEntry<N, C> entry,
                        //  - either no nodes presented at all,
    @NotNull
    }
            if (this.subnodes.size() == 1) {
                            break;
        if (scopes != null) {
                        //  - or all the children nodes' range.a>position,

                action.accept(stack.data);
    public final <T, R> R apply(@NotNull SQLQueryNodeModelVisitor<T, R> visitor, @NotNull T arg) {
                        if (childrenType.isInstance(child)) {

            }
     */
                                children = subnodes;
                        // Ignoring tail scopes because we are in the middle of the known text fragment,
                }
        /**
                            Collections.reverse(children);
                        }
    }
            return false;

                return node.region.a <= position ? node : null;

                if (node.subnodes != null) { // children presented, push and handle them at first
        @Nullable NodeExtraContext<N, C> context,
                                        }
        @NotNull BooleanSupplier cancellationChecker
    }

    ) {
                            children = c.getChildren();
                        // So taking existing at indexToInsertAt-1.
        @NotNull N key

/**
                            }
    }
                            //noinspection unchecked
    private List<SQLQueryNodeModel> subnodes; // TODO validate that subnodes are being registered correctly for all nodes
                        boolean delayChildren;
                    if (subnodes != null) { // children presented, push and handle them at first
                        applyActionForNode(stack.data, context, action);
        if (this.subnodes != null) {
                    List<SQLQueryNodeModel> subnodes = ((SQLQueryNodeModel) node).subnodes;
        ListNode<N> stack = ListNode.of(subroot);
                        //                           │   └── position belongs to the tail scope of the last node
            this.subnodes.sort(Comparator.comparingInt(n -> n.region.a));
                                if (delayChildren) {
        if (subnodes == null || subnodes.length == 0) {
         * Returns "logical" children of the current node, not necessarily actual children
import org.jkiss.dbeaver.model.stm.STMTreeNode;
    @NotNull
    protected SQLQueryNodeModel findChildNodeContaining(int position) { // TODO check it

                        }
    protected SQLQueryNodeModel(@NotNull Interval region, @NotNull STMTreeNode syntaxNode, @Nullable SQLQueryNodeModel... subnodes) {
    public void registerLexicalScope(@NotNull SQLQueryLexicalScope lexicalScope) {
                //    └── region.a of this node
     * The query model node having extra control over its children traverse handling
/*
                            delayChildren = c.delayRestChildren();
    }
        @NotNull Consumer<N> action,

        @NotNull Class<N> childrenType,
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                                    }
    private List<SQLQueryLexicalScope> lexicalScopes = null;
    @Nullable

            queue = queue.next;
                                        if (queued.add(child)) {
         * Returns query context for the specified child subtree
         */
        scopes.add(lexicalScope);
    private final Interval region;
        @NotNull N subroot,
        return this.region;
                    stack = stack.next;
    }
            } else {
import java.util.stream.Stream;
        if (scopes == null) {
        }
        this.syntaxNode = syntaxNode;
    ) {
                                        stack = ListNode.push(stack, childEntry);
                                NodeEntry<N, C> childEntry = new NodeEntry<>(extraContext, child);
     * Apply the visitor
                        // ...[...]...[...]...[node:...]...
        ListNode<NodeEntry<N, C>> queue = ListNode.of(new NodeEntry<>(null, subroot));
                SQLQueryNodeModel node = this.subnodes.get(0);
                    for (SQLQueryNodeModel child : node.subnodes) {
    }
    protected void setTailOrigin(SQLQuerySymbolOrigin tailOrigin) {
        }
        }
        return this.applyImpl(visitor, arg);
        }
 * You may obtain a copy of the License at
         * Returns true when non-default query context should be used for the specified child subtree
                        NodeSubtreeTraverseControl<N, C> localContextProvider;
                    //            └── exact region.a position match
                    } else {
            if (stack.data != null) {  // first time handling node
                        //                   └── position belongs to the actually covered region
            this.subnodes = Stream.of(subnodes)
                        SQLQueryNodeModel next = this.subnodes.get(i++);
        return null;
    public interface NodeSubtreeTraverseControl<N extends SQLQueryNodeModel, C>  {
    private record NodeExtraContext<N extends SQLQueryNodeModel, C>(
                        //                           └── or the actually covered region
                    // ...[...]...[node:...]...[...]...
                                }
                    NodeEntry<N, C> entry = stack.data;
        Set<SQLQueryNodeModel> queued = new HashSet<>();
                        // For example scenarios with 0-width regions [][..] due to parse errors for incomplete queries.
                                    ? new NodeExtraContext<N, C>(localContextProvider, child)
    /**

}
         */
import org.antlr.v4.runtime.misc.Interval;
    @NotNull
                        // So taking the last node.
import java.util.function.BiConsumer;
 * Represents a query model part in the source text. Connects model with syntax tree and text region.

        default C getContextForChild(@NotNull N child, @Nullable C defaultContext) {
                        // When the insertion point is after the last existing node, the node in question is the last one.
        List<SQLQueryLexicalScope> scopes = this.lexicalScopes;
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolOrigin;
        }
                stack = stack.next;
        @NotNull N subroot,
                                    stack = ListNode.push(stack, childEntry);
    }



import java.util.function.BooleanSupplier;
 * you may not use this file except in compliance with the License.
                //    │          └── tail scope of the one and only node
    public final Interval getInterval() {
        @Nullable C context,
         * Handle only the first child immediately, queue others until the first traverse is finished

                                return node;
            }
                Interval region = s.getInterval();
 * Licensed under the Apache License, Version 2.0 (the "License");
                if (index >= 0) { // Index belongs to the node in question.
                        }
                if (stack.data != null) {  // first time handling node


        }
                SQLQueryNodeModel node = stack.data;
                    return s;
package org.jkiss.dbeaver.model.sql.semantics.model;
                        stack = stack.next;
        @Nullable
         */
            for (SQLQueryLexicalScope s : scopes) {
            } else { // children already handled, handle the node
                } else { // no children, handle immediately

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
            while (stack != null) {
import java.util.function.Consumer;
    protected static <N extends SQLQueryNodeModel, C> void traverseSubtreeSimple(
                        return node.region.a <= position ? node : null;
                    int i = index + 1;

                                            queue = ListNode.push(queue, childEntry);
                                } else {
    private record NodeEntry<N extends SQLQueryNodeModel, C>(
                // ...[node:...]...
    }
                    } else { // no children, handle immediately
                    action.accept(stack.data);
            }
                        stack = ListNode.push(stack, null); // push null to separate parent-to-handle from its already processed children
                    return node;
        }
    /**
            return null;
    }
    public final STMTreeNode getSyntaxNode() {
                        if (!delayChildren) {
            return false;
                            localContextProvider = (NodeSubtreeTraverseControl<N, C>) c;
            this.subnodes = null;
 *
                        }
    private static <N extends SQLQueryNodeModel, C> void applyActionForNode(
 * distributed under the License is distributed on an "AS IS" BASIS,
                            stack = ListNode.push(stack, (N) child);
import java.util.*;

    }
                                    } else {
                    }
                                NodeExtraContext<N, C> extraContext = localContextProvider != null && localContextProvider.overridesContextForChild(child)
        return this.tailOrigin;
                            } else if (node.region.b < position) { // if not, then its region is actually ends earlier than the position
    public SQLQuerySymbolOrigin getTailOrigin() {
        this.subnodes = STMUtils.orderedInsert(this.subnodes, n -> n.region.a, subnode, Comparator.comparingInt(x -> x));
import org.jkiss.dbeaver.model.sql.semantics.SQLQuerySymbolClass;
                stack = stack.next;
public abstract class SQLQueryNodeModel {
    @Nullable
                        return null;
                        } else {
 * DBeaver - Universal Database Manager
                        // When the insertion point is the first node:
    /**
                        for (int i = ~index - 1; i >= 0; i--) {
 */
 * See the License for the specific language governing permissions and
import java.util.stream.Collectors;
        return this.syntaxNode;
                } else { // children already handled, handle the node
        List<SQLQueryLexicalScope> scopes = this.lexicalScopes;
                            children = subnodes;
    @Nullable
                        SQLQueryNodeModel node = this.subnodes.getLast();
    /**
     */
                .collect(Collectors.toCollection(() -> new ArrayList<>(subnodes.length)));
                    }
                    while (i < this.subnodes.size()) {
    ){
     * Returns lexical scope for the text part in the corresponding position
                            }
                        //  so no children node covering the position.
        @NotNull BiConsumer<N, C> action,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        int index = 0;
            return defaultContext;
import org.jkiss.dbeaver.model.stm.STMUtils;

                    N node = entry.node;
                            if (childrenType.isInstance(childNode)) {
                            SQLQueryNodeModel node = this.subnodes.get(i);
    private SQLQuerySymbolOrigin tailOrigin = null;
                        for (SQLQueryNodeModel childNode : children) {
                            if (node.region.a <= position && node.region.b >= position - 1) { // if it actually contains position, then ok
                        // which should be correctly described by the known node intervals.
            }
    public SQLQuerySymbolClass getAssociatedSymbolClass() {
                            }
    }
import org.jkiss.dbeaver.utils.ListNode;
                                break;
                }
                        // When the insertion point belongs to the existing index, the node in question is the previous one,
        /**
        this.tailOrigin = tailOrigin;
                            // otherwise try previous, because the current one may be of zero-length
                    }
                                N child = (N) childNode;
    ) {
