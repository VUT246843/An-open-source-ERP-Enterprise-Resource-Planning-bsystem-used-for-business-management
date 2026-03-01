     *
    private ListNode<Set<V>> lookupImpl(@NotNull Iterator<T> key) {
        this.lookupPartialComparer = lookupComparer;
            ListNode<TrieNode<T, V>> accumulatedResults = results;
        public T getTerm() {
                }
            } else {
 * See the License for the specific language governing permissions and

        public TreeNode(@Nullable T term) {
            results = ListNode.push(results, currNode.data.getValues());
        public final List<T> childKeys;
        /**


                }
        // walk down the tree while terms of the key path sequence match the corresponding keys of the nodes
                if (index >= 0) {
         * some details about what is the most effective lookup strategy available to discover children nodes by a certain key
        }
                return this.childNodes.get(index);
         * @param term used as key to discover the node during further lookup operations
 */
            }
                    accumulatedResults = ListNode.push(accumulatedResults, this.childNodes.get(i));
        return results;
 *
    /**
            return this.term;
        do {
        // accumulate values from the deepest level being reached
                // obtain children nodes by the current term for further inspection
        @NotNull
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
        }
 * limitations under the License.
public class Trie<T, V> {
                    }
                int index = Collections.binarySearch(this.childKeys, term, Trie.this.strongComparer);
                    // this.childNodesByKey = null;
        // till the end of the key sequence or boundary of the data structure, where no more child nodes could be matched

            } else if (this.isPartiallyOrdered && lookupPartialComparer.isPartiallyComparable(term)) {
            return Collections.emptySet();
                    if (comparer.match(this.childKeys.get(i), term)) {
        public TreeNode addOrCreateChild(@NotNull T term) {
        ListNode<Set<V>> values = this.lookupImpl(key);
            ListNode<TrieNode<T, V>> nextNodes = null;
}
        Set<V> result = new HashSet<>();
     * Node of the tree data structure implementing trie data item
         */
            }
    }
                Set<V> values = node.getValues();
        }
         */

 * @param <V> type of the value associated with the path in the trie

        public boolean isStronglyOrdered = true;

         * @return node in the trie data structure
 * Useful to optimize lookup operations over sets of lazily-discoverable paths
            for (int i = 0; i < this.childKeys.size(); i++) {
                }
 * You may obtain a copy of the License at
        for (ListNode<Set<V>> currNode = values; currNode != null; currNode = currNode.next) {
    }
                }
    public Set<V> collectValuesOnPath(@NotNull Iterator<T> key) {
            // inspect active nodes on the current level of the tree data structure
                }
         */
    }
                        accumulatedResults = ListNode.push(accumulatedResults, this.childNodes.get(i));
        @Override
                // TreeNode child = this.childNodesByKey.get(term);
        }
import org.jkiss.code.NotNull;
         * Builds up child node (or retrieves already existing one) strongly associated with the given term specification

                //    results = ListNode.push(results, child);
                // nodes vs given key comparison does not respect any kind of consistent ordering
        @Nullable
                // though we still can find a pivot item and then look around it while partial equality being hold
                    this.isStronglyOrdered = false;
                // }
            ListNode<TrieNode<T, V>> accumulatedResults = results;
    @NotNull
        }
        }
            int index = Collections.binarySearch(this.childKeys, term, Trie.this.strongComparer);
    /**
        TreeNode node = root;
 * Copyright (C) 2010-2025 DBeaver Corp and others

     * @return a set of values
 *
                if (!lookupPartialComparer.isPartiallyComparable(term)) {
            if (this.isStronglyOrdered && lookupPartialComparer.isStronglyComparable(term)) {
            }

                index = ~index;
                for (int i = index + 1; i < this.childKeys.size() && comparer.compare(this.childKeys.get(i), term) == 0; i++) {
                nextNodes = node.accumulateSubnodesByTerm(term, nextNodes);
        while (key.hasNext()) {
        @NotNull
            this.values = new HashSet<>();
                if (!lookupPartialComparer.isStronglyComparable(term)) {
        /**
        ListNode<TrieNode<T, V>> activeNodes = ListNode.of(root); // nodes to lookup down the tree by the current term from the key sequence

                // accumulate values from the current node
    public TrieNode<T, V> getRoot() {
 * Trie also known as prefix-tree implementation.
    }
            this.term = term;
        /**
    private final TrieLookupComparator<T> lookupPartialComparer;
                //     this.childNodesByKey.put(term, newNode);
            this.childNodes = new ArrayList<>();
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                    accumulatedResults = results;
         */
         *
        // public Map<T, TreeNode> childNodesByKey;
     */
        if (values == null) {
        @Nullable

                TreeNode newNode = new TreeNode(term);
        if (!key.hasNext()) {

                TrieNode<T, V> node = currNode.data;
 *     http://www.apache.org/licenses/LICENSE-2.0
        public final List<TreeNode> childNodes;
    private final Comparator<T> strongComparer;
            @NotNull T term,
    private final TreeNode root = new TreeNode(null);
            if (index >= 0) {
            if (index >= 0) {
 *
                    accumulatedResults = ListNode.push(results, this.childNodes.get(index));

         * key of the node used to discover it while navigating from its parent node
         * due to hashset having ~O(1) vs tree or binary search over {@link #childKeys} having ~O(log(n))

                // if (this.childNodesByKey != null) {
                    results = ListNode.push(results, values);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.sql.parser.TrieNode;
        public boolean isPartiallyOrdered = true;
                accumulatedResults = this.accumulateNonComparableSubnodes(term, results);
                }
                // nodes are ordered in common, but some of them (or the key term) couldn't be strongly distinguished by comparison

            TrieLookupComparator<T> comparer = Trie.this.lookupPartialComparer;
         */
                this.childKeys.add(index, term);
        }
                // }
                return ListNode.of(root.values);
 * DBeaver - Universal Database Manager
                    // this.childNodesByKey = null;
    }
        node.values.add(value);
    }
            this.childKeys = new ArrayList<>();
        }
            // this.childNodesByKey = new HashMap<>();
            if (root.values.size() > 0) {


         */
            }
    }
            return this.values;
        ) {
            }
        /**
                    if (comparer.match(this.childKeys.get(i), term)) {
                accumulatedResults = this.accumulatePartiallyComparableSubnodes(term, results);
        public final T term;
    public Trie(@NotNull Comparator<T> strongComparer, @NotNull TrieLookupComparator<T> lookupComparer) {
                if (comparer.match(this.childKeys.get(i), term)) {
            @Nullable ListNode<TrieNode<T, V>> results
        private ListNode<TrieNode<T, V>> accumulatePartiallyComparableSubnodes(
    public void add(@NotNull Iterator<T> key, @NotNull V value) {
            int index = Collections.binarySearch(this.childKeys, term, comparer);
            // use the best suitable strategy to lookup for children nodes by the given term
                return newNode;
            result.addAll(currNode.data);
            return accumulatedResults;
            // proceed to the next level of the tree if there is something to look at
                }
        this.strongComparer = strongComparer;
         * list of children nodes corresponding the order of their keys in {@link #childKeys}
        return result;
                // if (child != null) {
                for (int i = index - 1; i >= 0 && comparer.compare(this.childKeys.get(i), term) == 0; i--) {
         * map of children nodes by the corresponding strongly-comparable key
                    this.isPartiallyOrdered = false;
import java.util.*;
            activeNodes = nextNodes;
                if (comparer.match(this.childKeys.get(index), term)) {
 * @param <T> type of the key term used as path item in the trie structure
        }
 * Unless required by applicable law or agreed to in writing, software
        private ListNode<TrieNode<T, V>> accumulateNonComparableSubnodes(@NotNull T term, @Nullable ListNode<TrieNode<T, V>> results) {
 * in the key-space represented with internal tree data structure.
                // all the nodes and the key term are strongly distinguishable by comparison
import org.jkiss.dbeaver.utils.ListNode;
        return root;
        /**
        this.add(key.iterator(), value);
                    accumulatedResults = ListNode.push(accumulatedResults, this.childNodes.get(index));
                }
                this.childNodes.add(index, newNode);
         * a set of values associated with paths terminating in this node
            node = node.addOrCreateChild(term);
                    }
            for (ListNode<TrieNode<T, V>> currNode = activeNodes; currNode != null; currNode = currNode.next) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

        /**
            T term = key.next();
         */

 */
            }

        ListNode<Set<V>> results = null; // - total accumulated values from all the nodes met along the key sequence path
            T term = key.next();
         * have some clashes with custom comparators, so commenting it out for the time being
            } else {
            return accumulatedResults;
            ListNode<TrieNode<T, V>> accumulatedResults;
        /**
    public void add(@NotNull Iterable<T> key, @NotNull V value) {

    private class TreeNode implements TrieNode<T, V> {
                } else {


                return null;
     * Lookup the trie in search of value items associated with key terms along the given key path sequence
/*
     */
/**
        @Nullable
                if (values.size() > 0) {
     * @param key path sequence of terms to look for
                        accumulatedResults = ListNode.push(accumulatedResults, this.childNodes.get(i));
            return accumulatedResults;
            TrieLookupComparator<T> comparer = Trie.this.lookupPartialComparer;
        for (ListNode<TrieNode<T, V>> currNode = activeNodes; currNode != null; currNode = currNode.next) {
         * ordered list of keys used to discover children nodes for the paths laying through this node
        } while (activeNodes != null && key.hasNext());
        }
        @Nullable
 *
        public Set<V> getValues() {
    @Nullable

        public final Set<V> values;
    @NotNull
        public ListNode<TrieNode<T, V>> accumulateSubnodesByTerm(@NotNull T term, @Nullable ListNode<TrieNode<T, V>> results) {
