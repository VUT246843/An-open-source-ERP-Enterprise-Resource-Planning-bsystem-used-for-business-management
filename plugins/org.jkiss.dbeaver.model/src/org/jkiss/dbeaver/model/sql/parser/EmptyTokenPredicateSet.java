 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

        @Override
            return results;
import java.util.Set;

 */
            return null;
        public ListNode<TrieNode<TokenEntry, SQLTokenPredicate>> accumulateSubnodesByTerm(
    }
            @Nullable ListNode<TrieNode<TokenEntry, SQLTokenPredicate>> results
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
    public boolean hasCaptures() {
        return 0;
/*



package org.jkiss.dbeaver.model.sql.parser;
        @Override
    @Override
 *
    public int getMaxSuffixLength() {
    }
        }
        @NotNull

 * limitations under the License.
    @NotNull

public class EmptyTokenPredicateSet implements SQLTokenPredicateSet {
    public TrieNode<TokenEntry, SQLTokenPredicate> getPrefixTreeRoot() {
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    };
    public static final EmptyTokenPredicateSet INSTANCE = new EmptyTokenPredicateSet();

 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final TrieNode<TokenEntry, SQLTokenPredicate> EMPTY_NODE = new TrieNode<>() {
        @Override
    public Set<SQLTokenPredicate> matchSuffix(Deque<TokenEntry> suffix) {
 *
 * Represents empty set of connection-specific dialect features which require special handling during SQL parsing
        return EMPTY_NODE;
        @Nullable
    public boolean anyMatches(Deque<TokenEntry> prefix, Deque<TokenEntry> suffix) {
    public int getMaxPrefixLength() {
    }
    @Override
    }

    }
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**
import org.jkiss.dbeaver.utils.ListNode;
            @NotNull TokenEntry term,
        return false;
        }
        ) {
        return 0;
        return false;
        return Collections.emptySet();

    }

 * you may not use this file except in compliance with the License.
            return Collections.emptySet();
    @NotNull
        public Set<SQLTokenPredicate> getValues() {
    @Override
import java.util.Deque;
    @Override
 *
        }
import java.util.Collections;
        public TokenEntry getTerm() {
 * (Used as default implementation for SQL dialects without such special features)
}
    @Override
        @Nullable
 */

 * DBeaver - Universal Database Manager
    private EmptyTokenPredicateSet() {

import org.jkiss.code.NotNull;
