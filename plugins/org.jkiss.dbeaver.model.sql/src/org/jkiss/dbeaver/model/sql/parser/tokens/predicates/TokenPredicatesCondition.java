    }
    /**
import org.jkiss.dbeaver.model.sql.parser.SQLTokenPredicate;
    private final SQLParserActionKind actionKind;
import org.jkiss.code.NotNull;
 * A condition about sequence of terms expressed in form of predicate pair about term sequence prefix and suffix

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
/**
    private final TokenPredicateNode prefixPredicate;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                "]";
    public TokenPredicatesCondition(
        @NotNull SQLParserActionKind actionKind,
}
        @NotNull TokenPredicateNode prefixPredicate,
 *
    private final TokenPredicateNode suffixPredicate;
        this.maxSuffixLength = this.suffixes.stream().mapToInt(List::size).max().orElse(0);
        return suffixes;
    /**
        this.parameter = parameter;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.parser.SQLParserActionKind;


    }
        this.suffixes = Collections.unmodifiableList(suffixPredicate.expand());
     */
    }

        this.actionKind = actionKind;
    @Override
     * Complete list of all possible prefixes and suffixes matching the condition an any combination
import java.util.Collections;
 * limitations under the License.
    public List<List<TokenEntry>> getPrefixes() {
    public String toString() {
    public final int maxSuffixLength;
        this(actionKind, prefixPredicate, suffixPredicate, null);

    @Override
import java.util.List;
     * Maximum lengths of corresponding prefixes and suffixes under condition
    public List<List<TokenEntry>> getSuffixes() {
     */



    @NotNull
 * you may not use this file except in compliance with the License.
                "action: [" + this.actionKind + "], " +
 *     http://www.apache.org/licenses/LICENSE-2.0
    public SQLParserActionKind getActionKind() {
        @NotNull TokenPredicateNode prefixPredicate,
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    ) {
    public int getMaxSuffixLength() {
                "prefix: [" + this.prefixPredicate + "], " +
    /**
    private final List<List<TokenEntry>> prefixes;
    @NotNull
     */
        this.prefixes = Collections.unmodifiableList(prefixPredicate.expand());
        this.prefixPredicate = prefixPredicate;

package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
    public String getParameter() {
    @NotNull
 */
        @NotNull TokenPredicateNode suffixPredicate
    public TokenPredicatesCondition(
    }
    @Override
        return this.parameter;

import org.jkiss.code.Nullable;
     */
import org.jkiss.dbeaver.model.sql.parser.TokenEntry;

    /**
    @Nullable
    ) {
    public final int maxPrefixLength;
        return "TokenEnvironmentCondition[" +
public class TokenPredicatesCondition implements SQLTokenPredicate {
     * Action to perform during parse on condition match
/*
        return prefixes;
 * See the License for the specific language governing permissions and
    private final List<List<TokenEntry>> suffixes;
                "suffix: [" + this.suffixPredicate + "]" +
        @Nullable String parameter
        @NotNull TokenPredicateNode suffixPredicate,
        @NotNull SQLParserActionKind actionKind,
        return this.actionKind;
    public final String parameter;

     * Predicate trees representing conditions on possible structure of sequence of terms
        this.maxPrefixLength = this.prefixes.stream().mapToInt(List::size).max().orElse(0);
        this.suffixPredicate = suffixPredicate;
    }
    }
 * DBeaver - Universal Database Manager
        return maxSuffixLength;
    }
    }
