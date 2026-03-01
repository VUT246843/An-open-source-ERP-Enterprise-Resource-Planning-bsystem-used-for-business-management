 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
                    break;

        if (!tailMatch) {
                    headMatch = true;
                        matched = false;
    private final List<TokenPredicatesCondition> conditions;
    }
/*
 *
    public static TokenPredicatesList of(@NotNull TokenPredicatesCondition... conditions) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        for (TokenPredicatesCondition cond: conditions) {
                }
import java.util.Collections;
                    if (!it.next().matches(condTail.get(i))) {
        this.maxHeadLength = conditions.stream().mapToInt(c -> c.maxPrefixLength).max().orElse(0);
                    }
            }
            if (condTailLen <= tail.size()) {
    private final int maxHeadLength;
import java.util.Deque;
 * Plain list of token predicate conditions for a comparison with trie-based predicates set
    }
public class TokenPredicatesList {
                Iterator<TokenEntry> it = tail.descendingIterator();
    public boolean anyMatches(@NotNull Deque<TokenEntry> head, @NotNull Deque<TokenEntry> tail) {
    }

 * See the License for the specific language governing permissions and
        }
                if (matched) {
                Iterator<TokenEntry> it = head.iterator();
        return maxHeadLength;

import org.jkiss.code.NotNull;
            int condTailLen = condTail.size();
                    if (!it.next().matches(condHead.get(i))) {
import java.util.Iterator;

                    break;

                boolean matched = true;
        }
                }
    private final int maxTailLength;
            if (this.conditionMatches(cond, head, tail)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    tailMatch = true;
                for (int i = condTailLen - 1; i >= 0; i--) {
/**
 * You may obtain a copy of the License at
        return false;
            }
        }

    private boolean conditionMatches(@NotNull TokenPredicatesCondition cond, @NotNull Deque<TokenEntry> head, @NotNull Deque<TokenEntry> tail) {
 * DBeaver - Universal Database Manager
    public int getMaxTailLength() {
            int condHeadLen = condHead.size();
        this.conditions = Collections.unmodifiableList(conditions);
    public int getMaxHeadLength() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicatesCondition;
 * limitations under the License.
                    }
 * you may not use this file except in compliance with the License.
        boolean headMatch = false;
 */
            return false;
        return new TokenPredicatesList(List.of(conditions));
    }
                boolean matched = true;

                }


                for (int i = 0; i < condHeadLen; i++) {
        return headMatch;
        for (List<TokenEntry> condTail : cond.getSuffixes()) {
}
package org.jkiss.dbeaver.model.sql.parser;

        boolean tailMatch = false;
    }

                if (matched) {
            if (condHeadLen <= head.size()) {
            }
        return maxTailLength;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public TokenPredicatesList(List<TokenPredicatesCondition> conditions) {
                        break;
    @NotNull
                        break;

                }
        for (List<TokenEntry> condHead : cond.getPrefixes()) {
 *
import java.util.List;
 */
        this.maxTailLength = conditions.stream().mapToInt(c -> c.maxSuffixLength).max().orElse(0);
                return true;
        }
                        matched = false;
