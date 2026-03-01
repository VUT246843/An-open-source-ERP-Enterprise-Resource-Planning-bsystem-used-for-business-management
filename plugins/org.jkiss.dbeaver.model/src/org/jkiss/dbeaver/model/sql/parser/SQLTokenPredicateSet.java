     */
    /**
     */
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    TrieNode<TokenEntry, SQLTokenPredicate> getPrefixTreeRoot();
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Returns root node of the tree containing all prefixes of all predicates
     */


import java.util.Deque;
}
 *     http://www.apache.org/licenses/LICENSE-2.0

    Set<SQLTokenPredicate> matchSuffix(Deque<TokenEntry> suffix);
    /**
 *
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    /**

package org.jkiss.dbeaver.model.sql.parser;
     *

/*

 * A set of connection-specific dialect features which require special handling during SQL parsing
     *
 * limitations under the License.
     */
    boolean hasCaptures();
    /**
 */
     * @return true if there are any corresponding conditions
    /**
     */
/**
     * Checks for a presence of predicates matching given prefix and suffix
    int getMaxSuffixLength();
     */
     * @return set of successfully matched predicates
    @NotNull
 */
     * Returns maximum statement prefix length handled by predicates
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Searches for all the predicates matching given suffix in the text
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,

    /**
    @NotNull
 *
import java.util.Set;
     * Returns maximum statement suffix length handled by predicates
    int getMaxPrefixLength();
    boolean anyMatches(Deque<TokenEntry> prefix, Deque<TokenEntry> suffix);

     * Returns true if we need to try capturing text parts by the key of the predicate condition
 * Unless required by applicable law or agreed to in writing, software
public interface SQLTokenPredicateSet {
 *
