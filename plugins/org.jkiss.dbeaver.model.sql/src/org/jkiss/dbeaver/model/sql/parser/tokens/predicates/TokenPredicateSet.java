    @NotNull
 * you may not use this file except in compliance with the License.
    }
 *
    public boolean anyMatches(@NotNull Deque<TokenEntry> prefix, @NotNull Deque<TokenEntry> suffix) {
    @NotNull
        }
    @Override
/**
 * Licensed under the Apache License, Version 2.0 (the "License");

        for (TokenPredicatesCondition cond : conditions) {

        return set;
    public void add(@NotNull TokenPredicatesCondition cond) {
     *
 *

 * A set of conditions about sequences of terms expressed in form of predicate pairs about term sequence prefix and suffix
    public int getMaxSuffixLength() {
        Set<SQLTokenPredicate> matchedConds = conditionsBySuffix.collectValuesOnPath(suffix.descendingIterator());
    private boolean hasCaptures = false;
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
        if (matchedConds.isEmpty()) {
    private int maxTailLength = 0;
    }
        return conditionsBySuffix.collectValuesOnPath(suffix.descendingIterator());
            this.hasCaptures = cond.getPrefixes().stream()
    private final Trie<TokenEntry, SQLTokenPredicate> conditionsBySuffix = new Trie<>(ExactTokenEntryComparator.INSTANCE, TokenEntryMatchingComparator.INSTANCE);
        return maxTailLength;
    }
import org.jkiss.dbeaver.model.sql.parser.TrieNode;
    private int maxHeadLength = 0;
            return false;
        }
    public TrieNode<TokenEntry, SQLTokenPredicate> getPrefixTreeRoot() {
        TokenPredicateSet set = new TokenPredicateSet();
}
     */


    private final List<TokenPredicatesCondition> conditions = new ArrayList<>();
        maxTailLength = Math.max(maxTailLength, cond.maxSuffixLength);

                .anyMatch(s -> s.stream().anyMatch(t -> t instanceof CaptureTokenPredicateNode));
 * DBeaver - Universal Database Manager
        cond.getSuffixes().forEach(t -> conditionsBySuffix.add(new ArrayDeque<TokenEntry>(t).descendingIterator(), cond));
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicate;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    }

        cond.getPrefixes().forEach(h -> conditionsByPrefix.add(h.iterator(), cond));
    }

            matchedConds.retainAll(matchedHeadConds);
     * @param cond condition to insert
public class TokenPredicateSet implements SQLTokenPredicateSet {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        this.conditions.add(cond);
        } else {
    @NotNull
 */
import org.jkiss.dbeaver.model.sql.parser.TokenEntry;
 *
        maxHeadLength = Math.max(maxHeadLength, cond.maxPrefixLength);
            set.add(cond);
    public boolean hasCaptures() {
    }
        return maxHeadLength;
        return conditionsByPrefix.getRoot();
    public int getMaxPrefixLength() {
        }
            return matchedConds.size() > 0;
 */
        return this.hasCaptures;
 * See the License for the specific language governing permissions and
    private final Trie<TokenEntry, SQLTokenPredicate> conditionsByPrefix = new Trie<>(ExactTokenEntryComparator.INSTANCE, TokenEntryMatchingComparator.INSTANCE);
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicateSet;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.*;
import org.jkiss.code.NotNull;
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0

    /**
    }
    public static TokenPredicateSet of(@NotNull TokenPredicatesCondition... conditions) {
/*
     * Inserts a new condition in the set

    }
        if (!this.hasCaptures) {
    public Set<SQLTokenPredicate> matchSuffix(@NotNull Deque<TokenEntry> suffix) {
            Set<SQLTokenPredicate> matchedHeadConds = conditionsByPrefix.collectValuesOnPath(prefix.iterator());

