/*
 *
     */
    /**
     * Returns a set of values associated with paths ended in this node
     */
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
     *
/**
     * Returns the key of the node used to discover it while navigating from its parent node
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @param <V> type of the value associated with the path in the trie
    @Nullable

    T getTerm();
 *
 * Represents an information about the node of the trie
 *
    /**

     * @param results initial state of list to augment
public interface TrieNode<T, V> {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
     * Augments a list of trie nodes with some child nodes of this node each associated with a key term matching to the given term
    @NotNull
import org.jkiss.code.Nullable;
import java.util.Set;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    Set<V> getValues();
 */
}
    @Nullable
     * @return augmented list of initial state optionally combined with some child nodes of this node
    ListNode<TrieNode<T, V>> accumulateSubnodesByTerm(@NotNull T term, @Nullable ListNode<TrieNode<T, V>> results);
import org.jkiss.dbeaver.utils.ListNode;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.model.sql.parser;
     * @param term represents element of path (or text) used to decide about the direction in the trie structure
 * limitations under the License.

 * See the License for the specific language governing permissions and
 */
    /**

 * @param <T> type of the key term used as path item in the trie structure
 *     http://www.apache.org/licenses/LICENSE-2.0
